function howManyDalmatians(number) {
    let dogs = ['Hardly any', 'More than a handful!', "Woah that's a lot of dogs!", "101 DALMATIANS!!!"];
    return respond = number <= 10 ? dogs[0] : number <= 50 ? dogs[1] : number > 100 ? dogs[3] : dogs[2];
}