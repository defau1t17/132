package com.company;

public class Main {

    public static void main(String[] args) {
        homeLibrary bookNumberOne = new homeLibrary("Paddington", 1958, "Thomas Michael Bond");



        System.out.println(bookNumberOne);
        System.out.println();
        bookNumberOne.findBookByDate(1958);
        bookNumberOne.findBookByNameAndDate(1958,"Thomas Michael Bond");
    }

}

class homeLibrary {
    public String nameOfTheBook;
    public String author;
    public int date;

    public homeLibrary(String nameOfTheBook, int date, String author) {
        this.author = author;
        this.date = date;
        this.nameOfTheBook = nameOfTheBook;

    }

    public int getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void findBookByName(String findName) {

        if (this.nameOfTheBook == findName) {
            System.out.println("Это книга писателя  - " + " '" + this.author + "'" + "\n" + "Под названием - " + " '" + this.nameOfTheBook + "'" + "\n" + "Выпуска - " + this.date + " года");
        } else {
            System.out.println("Книга с данными параметрами не найдена");
        }
    }

    public void findBookByAuthor(String findAuthor) {
        if (this.author == findAuthor) {
            System.out.println("Это книга писателя  - " + " '" + this.author + "'" + "\n" + "Под названием - " + " '" + this.nameOfTheBook + "'" + "\n" + "Выпуска - " + this.date + " года");
        } else {
            System.out.println("Книга с данными параметрами не найдена");
        }
    }

    public void findBookByDate(int findBookByDate) {
        if (this.date == findBookByDate) {
            System.out.println("Это книга писателя  - " + " '" + this.author + "'" + "\n" + "Под названием - " + " '" + this.nameOfTheBook + "'" + "\n" + "Выпуска - " + this.date + " года");
        } else {
            System.out.println("Книга с данными параметрами не найдена");
        }


    }

    public void findBookByNameAndDate(int dateOfTheBook, String findBookByName) {
        if (this.nameOfTheBook == findBookByName && this.date == dateOfTheBook) {
            System.out.println("Это книга писателя  - " + " '" + this.author + "'" + "\n" + "Под названием - " + " '" + this.nameOfTheBook + "'" + "\n" + "Выпуска - " + this.date + " года");
        } else {
            System.out.println("Книга с данными параметрами не найдена");
        }
    }

    public void findBookByNameAndAuthor(String findBookByName, String findBookByTheAuthor) {
        if (this.nameOfTheBook == findBookByName && this.author == findBookByTheAuthor) {
            System.out.println("Это книга писателя  - " + " '" + this.author + "'" + "\n" + "Под названием - " + " '" + this.nameOfTheBook + "'" + "\n" + "Выпуска - " + this.date + " года");
        } else {
            System.out.println("Книга с данными параметрами не найдена");
        }
    }
    public void findBookByAuthorAndDate(int dateOfTheBook,String findBookByTheAuthor ){
        if(this.date == dateOfTheBook && this.author == findBookByTheAuthor){
            System.out.println("Это книга писателя  - " + " '" + this.author + "'" + "\n" + "Под названием - " + " '" + this.nameOfTheBook + "'" + "\n" + "Выпуска - " + this.date + " года");
        } else {
            System.out.println("Книга с данными параметрами не найдена");
        }

    }

    @Override
    public String toString() {
        return "Название книги - " + this.nameOfTheBook + "\n" + "Издатель - " + this.author + "\n" + "Написаная в - " + this.date + " году";
    }
