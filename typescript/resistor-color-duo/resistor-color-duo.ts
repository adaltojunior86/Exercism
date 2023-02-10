const mappedBandColors = new Map<string, string>([
  ['black', '0'], ['brown', '1'],
  ['red', '2'], ['orange', '3'],
  ['yellow', '4'], ['green', '5'],
  ['blue', '6'], ['violet', '7'],
  ['grey', '8'], ['white', '9']
]);

export function decodedValue(bandToDecode: Array<string> = []):Number {
  const [firstColor = '', secondColor = ''] = bandToDecode;
  return Number.parseInt(`${mappedBandColors.get(firstColor)}${mappedBandColors.get(secondColor)}`, 10);
}
