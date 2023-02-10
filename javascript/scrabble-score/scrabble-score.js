//
// This is only a SKELETON file for the 'Scrabble Score' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

const getValueByLeter = (letter) => {
  if (/[Q, Z]/i.test(letter)) {
    return 10;
  }
  if (/[J, X]/i.test(letter)) {
    return 8;
  }
  if (/[K]/i.test(letter)) {
    return 5;
  }
  if (/[F, H, V, W, Y]/i.test(letter)) {
    return 4;
  }
  if (/[B, C, M, P]/i.test(letter)) {
    return 3;
  }
  if (/[D, G]/i.test(letter)) {
    return 2;
  }
  if (/[A, E, I, L, N, O, R, S, T, U]/i.test(letter)) {
    return 1;
  }
  return 0;
}

export const score = (letter) => letter.split('').reduce((acc, actual) => {
    return acc + getValueByLeter(actual);
  }, 0);
