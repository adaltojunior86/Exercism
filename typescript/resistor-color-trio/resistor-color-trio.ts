const MAPPED_COLORS = [
  'black',
  'brown',
  'red',
  'orange',
  'yellow',
  'green',
  'blue',
  'violet',
  'grey',
  'white'
];

export function decodedResistorValue([firstColor, secondColor, thirdColor]: string[]): string {
  const value: number = (
    (MAPPED_COLORS.indexOf(firstColor) * 10) + MAPPED_COLORS.indexOf(secondColor)
  ) * (10 ** MAPPED_COLORS.indexOf(thirdColor));
  if (value >= 1000) {
    return `${value / 1000} kiloohms`;
  }
  return `${value} ohms`;
}
