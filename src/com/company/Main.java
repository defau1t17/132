Label label3 = new Label("");
        Label label5 = new Label("");
        Label label6 = new Label("");


        label3.setFont(Font.font(14));
        label3.setTextFill(Color.rgb(0, 0, 0));

        label5.setFont(Font.font(14));
        label5.setTextFill(Color.rgb(0, 0, 0));

        label6.setFont(Font.font(14));
        label6.setTextFill(Color.rgb(0, 0, 0));


        TextField textField = new TextField();
        textField.setPromptText("Пиши сюда ответ...");
        textField.setPrefWidth(70);

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


        TextField unswerTextField = new TextField();
        unswerTextField.setPromptText("Ваш ответ");

        Label label = new Label("Добро пожаловать в игру 'Угадай загадку' ." + "\n" + "У вас есть 3-и попытки. Да придет с вами Удача...");
        label.setFont(Font.font(14));
        label.setTextFill(Color.rgb(0, 0, 0));

        Label label1 = new Label("Начнем Игру");
        label1.setFont(Font.font(22));
        label1.setTextFill(Color.rgb(0, 0, 0));

        Label label2 = new Label("Загадка :");
        label2.setFont(Font.font(22));
        label2.setTextFill(Color.rgb(0, 0, 0));
        Label label4 = new Label("Ваш ответ : ");
        label4.setFont(Font.font(14));


        Button answer = new Button("Ответить");
        answer.setPrefWidth(60);
        Button startButtond = new Button("Click to Start");
        startButtond.setPrefWidth(300);
        startButtond.setPrefHeight(25);


        GridPane gridPane1 = new GridPane();
        GridPane gridPane2 = new GridPane();

        gridPane1.setHgap(10);
        gridPane1.setVgap(20);

        gridPane2.setHgap(10);
        gridPane2.setVgap(20);

        gridPane1.add(label, 4, 8);
        gridPane1.add(startButtond, 4, 10, 2, 1);

        gridPane2.add(label1, 2, 0, 2, 1);
        gridPane2.add(label2, 2, 2, 2, 1);
        gridPane2.add(label4, 0, 8, 2, 1);
        gridPane2.add(textField, 3, 8, 2, 1);
        gridPane2.add(label3, 2, 4, 2, 1);
        gridPane2.add(answer, 8, 8, 2, 1);


        Scene scene1 = new Scene(gridPane1, 400, 400);
        Scene scene2 = new Scene(gridPane2, 400, 400);

        primaryStage.setScene(scene1);

        startButtond.setOnAction(start -> {
            primaryStage.setScene(scene2);

        });
        String userAnswer = textField.getText().trim().toLowerCase();
        for (int i = 0; i < 1; i++) {
            int b = (int) (Math.random() * 10);
            for (int c = 0; c < 3; c++) {
                if (b == 0) {
                    label3.setText(riddle1);
                    rightAnswer = "эхо";

                } else if (b == 1) {
                    label3.setText(riddle2);
                    rightAnswer = "всадник";
                } else if (b == 2) {
                    label3.setText(riddle3);
                    rightAnswer = "часы";

                } else if (b == 3) {
                    label3.setText(riddle4);
                    rightAnswer = "пять";
                } else if (b == 4) {
                    label3.setText(riddle5);
                    rightAnswer = "сегодня";

                } else if (b == 5) {
                    label3.setText(riddle6);
                    rightAnswer = "тролейбус";
                } else if (b == 6) {
                    label3.setText(riddle7);
                    rightAnswer = "хвост";
                } else if (b == 7) {
                    label3.setText(riddle8);
                    rightAnswer = "аптекарь";
                } else if (b == 8) {
                    label3.setText(riddle9);
                    rightAnswer = "пух";
                } else if (b == 9) {
                    label3.setText(riddle10);
                    rightAnswer = "столб";
                }
                answer.setOnAction(set -> {
                    int trieCounter = 3;
                    if (rightAnswer.equals(userAnswer) == true) {
                        label3.setText("вы ответиливерно");
                    } else if (rightAnswer.equals(userAnswer) == false) {
                        trieCounter--;
                        label5.setText("Вы проиграли");
                        label6.setText("Ваши попытки - " + trieCounter);
                    }
                    if (trieCounter == 0 ){
                        label5.setText("");
                        label6.setText("Поппытки истекли");
                    }


                });
            }

        }

