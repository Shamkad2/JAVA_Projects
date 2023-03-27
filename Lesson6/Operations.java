package Lesson6;

import java.util.*;

public class Operations {
    private List<Notebook> notebooks;
    private static Scanner scanner = new Scanner(System.in);

    public void printList() {
        for (Notebook notebook : notebooks) {
            {
                System.out.println(notebook);
            }
        }
    }


    public Operations(List<Notebook> notebooks) {
        this.scanner = new Scanner(System.in);
        this.notebooks = (List<Notebook>) notebooks;

    }


    public String getOperations() {

        String text = "Выберите операцию: 1. Выбрать критерий для фильтра 2. Вывести список 3. Завершить 4. Войти как сотрудник для смены данных 5. Быстрый поиск: ";

        System.out.print(text);

        String answer = scanner.next();

        return answer;
    }


    public void start() {

        boolean flag = true;
        while (flag) {

            String operation = getOperations();
            if (operation.equals("3")) {
                flag = false;
                System.out.println("Выход!");
                scanner.close();
                continue;
            } else if (operation.equals("1")) {
                filter();

            } else if (operation.equals("2")) {
                printList();
            } else if (operation.equals("4")) {
                magazine();
            } else if (operation.equals("5")) {
                fastSearch();
            }
            else System.out.println("Не верно введена команда!");
        }
    }

    private void fastSearch() {
        scanner = new Scanner(System.in);
        System.out.println("Введите название основные параметры. ");
        System.out.println("Введите Оперативная память: ");
        String opP = scanner.nextLine();

        System.out.println("Введите Диагональ: ");
        String diagonal = scanner.nextLine();

        System.out.println("Введите Модель: ");
        String model = scanner.nextLine();

        for (Notebook notebook : notebooks) {
            {
                if (notebook.getModel().equals(model) && notebook.getAmountRAM() == Integer.parseInt (opP) && Objects.equals(notebook.getDiagonal(), Double.valueOf(diagonal))){
                    System.out.println(notebook);
                    return;
                }
            }

        }System.out.println("По заданным параметром ничего не найдено! Попробуйте изменить критерии поиска. ");
    }

    private void magazine() {
        System.out.println("Выберите критерий для внесения изменений: 1. Изменить цену товара, 2. Изменить данные об операционной системе: ");
        scanner = new Scanner(System.in);
        String comanda = scanner.nextLine();
        
        if (comanda.equals( "1") ){
            System.out.println("Введите имя товара который нужно изменить: ");
            String imya = scanner.nextLine();
            int count=0;
            for (int i = 0; i < notebooks.size(); i++) {
                if(notebooks.get(i).getName().equals(imya)) {
                    count++;
                    System.out.println("Задайте новую стоимость: ");
                    int newPrice = scanner.nextInt();
                    notebooks.get(i).setPrice(newPrice);
                    System.out.println("Новая цена "+ notebooks.get(i).getName()+ " - "+ notebooks.get(i).getPrice());
                }
            }if(count==0) System.out.println("Неверно введено имя! Формат: Notebook 1");
        } else if (comanda.equals("2")) {
            System.out.println("Введите имя товара который нужно изменить: ");
            String imya = scanner.nextLine();
            for (int i = 0; i < notebooks.size(); i++) {
                if(notebooks.get(i).getName().equals(imya)) {
                System.out.println("Введите название новой операционной системы: ");
                String newOpSystem = scanner.nextLine();
                notebooks.get(i).setOperatingSystem(newOpSystem);
                System.out.println("Новая операционная система "+ notebooks.get(i).getName()+" - " + notebooks.get(i).getOperatingSystem());
            }}
        }else System.out.println("Неверно введена команда!");

    }

    public <notebooks> void filter() {
        scanner = new Scanner(System.in);
        System.out.print("Выберите критерий для поиска: 1. оперативная память, 2. операционная система, 3. диагональ, 4. название: ");
        String op = scanner.nextLine();

        //Операционная система
        if (op.equals("2")) {
            System.out.print("Выберите критерий : 1. linux, 2. macOS, 3. Windows 11, 4. Windows10: ");
            String colGig = scanner.nextLine();
            if (colGig.equals("1")) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getOperatingSystem().equals("linux")) {
                        System.out.println(notebooks.get(i));
                    }

                }
            } else if (colGig.equals("2")) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getOperatingSystem().equals("macOS")) {
                        System.out.println(notebooks.get(i));
                    }
                }
            } else if (colGig.equals("3")) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getOperatingSystem().equals("Windows 11")) {
                        System.out.println(notebooks.get(i));
                    }
                }
            } else if (colGig.equals("4")) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getOperatingSystem().equals("Windows 10")) {
                        System.out.println(notebooks.get(i));
                    }
                }
            } else System.out.println("Не верно введена команда");
        }

            //Оперативная память
        else if (op.equals("1")) {
            System.out.print("Выберите критерий : 8, 16, 32, 64: ");
            int colGig = scanner.nextInt();
            if (colGig == 8) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getAmountRAM() == 8) {
                            System.out.println(notebooks.get(i));
                        }
                    }
            } else if (colGig == 16) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getAmountRAM() == 16) {
                            System.out.println(notebooks.get(i));
                        }
                    }
            } else if (colGig == 32) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getAmountRAM() == 32) {
                            System.out.println(notebooks.get(i));
                        }
                    }

            } else if (colGig == 64) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getAmountRAM() == 64) {
                            System.out.println(notebooks.get(i));
                        }
                    }
            }else System.out.println("Неверно задано значение!");

        }
        //Диагональ
        else if (op.equals("3")) {
            System.out.print("Выберите критерий : 1. 15,6, 2. 14,6: ");
            int colGig = scanner.nextInt();
            if (colGig == 1) {
                for (Notebook notebook : notebooks) {
                    {
                        if (notebook.getDiagonal() == 15.6) {
                            System.out.println(notebook);
                        }
                    }
                }
            } else if (colGig == 2) {
                for (Notebook notebook : notebooks) {
                    {
                        if (notebook.getDiagonal() == 14.6) {
                            System.out.println(notebook);
                        }
                    }
                }
            }else System.out.println("Неверно задано значение!");

        }
        //Модель
        else if (op.equals("4")) {
            System.out.print("Введите название (пример: Lenovo, Asus, HP, Apple): ");
            String colGig = scanner.nextLine();
            for (Notebook notebook : notebooks) {
                {
                    if (notebook.getModel().equals(colGig)) {
                        System.out.println(notebook);
                    }
                }
            }
        } else System.out.println("Неверно задано значение!");


    }
    
}
