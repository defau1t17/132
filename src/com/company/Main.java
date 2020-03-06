        Scanner scanner = new Scanner(System.in);
        String rightAnswer;
        int b = 0;
        int trieCounter = 3;
        System.out.println("Добро пожаловать в игру 'Угадай загадку' . У вас есть 3-и попытки. Да придет с вами Удача...");
        String userAnswer;

        String riddle1 = "Кто говорит на всех языках?";
        String riddle2 = "Шесть ног, две головы, а хвост один. Что это такое?";
        String riddle3 = "Что может в одно и то же время: стоять и ходить,висеть и стоять, ходить и лежать?";
        String riddle4 = "У квадратного стола отпилили один угол. Сколько теперь углов у него стало?";
        String riddle5 = "Что было завтра, а будем вчера?";
        String riddle6 = "Что это такое: синий, большой, с рогами и полностью набит зайцами";
        String riddle7 = "Между ног болтается, на 'X' называется.";
        String riddle8 = "Специалист по разбору каракуль врачей?";
        String riddle9 = "Что поднять земли легко, но трудно кинуть далеко?";
        String riddle10 = "Стоп-бревно в случае экстренного торможения?";

        System.out.println("Что ж, начнем!!! ");

        for (int i = 0; i < 1; i++) {
            b = (int) (Math.random() * 10);
            for (int c = 0; c < 3; c++) {
                if (b == 0) {
                    System.out.println(riddle1);
                    rightAnswer = "эхо";
                    userAnswer = scanner.next();
                    userAnswer.trim();
                    userAnswer.toLowerCase();
                    if (rightAnswer.equals(userAnswer) == true) {
                        System.out.println("Вы ответили верно!!! Поздравляем вас");
                        break;
                    } else if (rightAnswer.equals(userAnswer) == false) {
                        trieCounter--;
                        System.out.println("Вы ошиблись! У вас осталось - " + trieCounter + " попыток");
                        System.out.println("Попробуйте снова :) ");
                    }
                    if (trieCounter == 0) {
                        System.out.println("Количество попыток истеклоюю...");
                        System.out.println("Правитльный ответ был " + rightAnswer);
                        break;
                    }

                } else if (b == 1) {
                    System.out.println(riddle2);
                    rightAnswer = "всадник";
                    userAnswer = scanner.next();
                    userAnswer.trim();
                    userAnswer.toLowerCase();
                    if (rightAnswer.equals(userAnswer) == true) {
                        System.out.println("Вы ответили верно!!! Поздравляем вас");
                        break;
                    } else if (rightAnswer.equals(userAnswer) == false) {
                        trieCounter--;
                        System.out.println("Вы ошиблись! У вас осталось - " + trieCounter + " попыток");
                        System.out.println("Попробуйте снова :) ");
                    }
                    if (trieCounter == 0) {
                        System.out.println("Количество попыток истеклоюю...");
                        System.out.println("Правитльный ответ был " + rightAnswer);
                        break;
                    }

                } else if (b == 2) {
                    System.out.println(riddle3);
                    rightAnswer = "часы";
                    userAnswer = scanner.next();
                    userAnswer.trim();
                    userAnswer.toLowerCase();
                    if (rightAnswer.equals(userAnswer) == true) {
                        System.out.println("Вы ответили верно!!! Поздравляем вас");
                        break;
                    } else if (rightAnswer.equals(userAnswer) == false) {
                        trieCounter--;
                        System.out.println("Вы ошиблись! У вас осталось - " + trieCounter + " попыток");
                        System.out.println("Попробуйте снова :) ");
                    }
                    if (trieCounter == 0) {
                        System.out.println("Количество попыток истеклоюю...");
                        System.out.println("Правитльный ответ был " + rightAnswer);
                        break;
                    }

                } else if (b == 3) {
                    System.out.println(riddle4);
                    rightAnswer = "пять";
                    userAnswer = scanner.next();
                    userAnswer.trim();
                    userAnswer.toLowerCase();
                    if (rightAnswer.equals(userAnswer) == true) {
                        System.out.println("Вы ответили верно!!! Поздравляем вас");
                        break;
                    } else if (rightAnswer.equals(userAnswer) == false) {
                        trieCounter--;
                        System.out.println("Вы ошиблись! У вас осталось - " + trieCounter + " попыток");
                        System.out.println("Попробуйте снова :) ");
                    }
                    if (trieCounter == 0) {
                        System.out.println("Количество попыток истеклоюю...");
                        System.out.println("Правитльный ответ был " + rightAnswer);
                        break;
                    }

                } else if (b == 4) {
                    System.out.println(riddle5);
                    rightAnswer = "сегодня";
                    userAnswer = scanner.next();
                    userAnswer.trim();
                    userAnswer.toLowerCase();
                    if (rightAnswer.equals(userAnswer) == true) {
                        System.out.println("Вы ответили верно!!! Поздравляем вас");
                        break;
                    } else if (rightAnswer.equals(userAnswer) == false) {
                        trieCounter--;
                        System.out.println("Вы ошиблись! У вас осталось - " + trieCounter + " попыток");
                        System.out.println("Попробуйте снова :) ");
                    }
                    if (trieCounter == 0) {
                        System.out.println("Количество попыток истеклоюю...");
                        System.out.println("Правитльный ответ был " + rightAnswer);
                        break;
                    }

                } else if (b == 5) {
                    System.out.println(riddle6);
                    rightAnswer = "тролейбус";
                    userAnswer = scanner.next();
                    userAnswer.trim();
                    userAnswer.toLowerCase();
                    if (rightAnswer.equals(userAnswer) == true) {
                        System.out.println("Вы ответили верно!!! Поздравляем вас");
                        break;
                    } else if (rightAnswer.equals(userAnswer) == false) {
                        trieCounter--;
                        System.out.println("Вы ошиблись! У вас осталось - " + trieCounter + " попыток");
                        System.out.println("Попробуйте снова :) ");
                    }
                    if (trieCounter == 0) {
                        System.out.println("Количество попыток истеклоюю...");
                        System.out.println("Правитльный ответ был " + rightAnswer);
                        break;
                    }

                } else if (b == 6) {
                    System.out.println(riddle7);
                    rightAnswer = "хвост";
                    userAnswer = scanner.next();
                    userAnswer.trim();
                    userAnswer.toLowerCase();
                    if (rightAnswer.equals(userAnswer) == true) {
                        System.out.println("Вы ответили верно!!! Поздравляем вас");
                        break;
                    } else if (rightAnswer.equals(userAnswer) == false) {
                        trieCounter--;
                        System.out.println("Вы ошиблись! У вас осталось - " + trieCounter + " попыток");
                        System.out.println("Попробуйте снова :) ");
                    }
                    if (trieCounter == 0) {
                        System.out.println("Количество попыток истеклоюю...");
                        System.out.println("Правитльный ответ был " + rightAnswer);
                        break;
                    }

                } else if (b == 7) {
                    System.out.println(riddle8);
                    rightAnswer = "аптекарь";
                    userAnswer = scanner.next();
                    userAnswer.trim();
                    userAnswer.toLowerCase();
                    if (rightAnswer.equals(userAnswer) == true) {
                        System.out.println("Вы ответили верно!!! Поздравляем вас");
                        break;
                    } else if (rightAnswer.equals(userAnswer) == false) {
                        trieCounter--;
                        System.out.println("Вы ошиблись! У вас осталось - " + trieCounter + " попыток");
                        System.out.println("Попробуйте снова :) ");
                    }
                    if (trieCounter == 0) {
                        System.out.println("Количество попыток истеклоюю...");
                        System.out.println("Правитльный ответ был " + rightAnswer);
                        break;
                    }

                } else if (b == 8) {
                    System.out.println(riddle9);
                    rightAnswer = "пух";
                    userAnswer = scanner.next();
                    userAnswer.trim();
                    userAnswer.toLowerCase();
                    if (rightAnswer.equals(userAnswer) == true) {
                        System.out.println("Вы ответили верно!!! Поздравляем вас");
                        break;
                    } else if (rightAnswer.equals(userAnswer) == false) {
                        trieCounter--;
                        System.out.println("Вы ошиблись! У вас осталось - " + trieCounter + " попыток");
                        System.out.println("Попробуйте снова :) ");
                    }
                    if (trieCounter == 0) {
                        System.out.println("Количество попыток истеклоюю...");
                        System.out.println("Правитльный ответ был " + rightAnswer);
                        break;
                    }

                } else if (b == 10) {
                    System.out.println(riddle10);
                    rightAnswer = "столб";
                    userAnswer = scanner.next();
                    userAnswer.trim();
                    userAnswer.toLowerCase();
                    if (rightAnswer.equals(userAnswer) == true) {
                        System.out.println("Вы ответили верно!!! Поздравляем вас");
                        break;
                    } else if (rightAnswer.equals(userAnswer) == false) {
                        trieCounter--;
                        System.out.println("Вы ошиблись! У вас осталось - " + trieCounter + " попыток");
                        System.out.println("Попробуйте снова :) ");
                    }
                    if (trieCounter == 0) {
                        System.out.println("Количество попыток истеклоюю...");
                        System.out.println("Правитльный ответ был " + rightAnswer);
                        break;
                    }
                }


            }
        }


    }
