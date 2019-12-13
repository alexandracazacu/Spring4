package com;

public class Computer {
        private int id;
        private String name;
        private String color;
        private float price;
        private int year;


        public Computer(int id, String name, String color, float price, int year) {
            this.id = id;
            this.name = name;
            this.color = color;
            this.price = price;
            this.year = year;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

    }

