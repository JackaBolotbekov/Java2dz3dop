//package com.company;
//using System;
//        using System.Collections.Generic;
//        using System.Linq;
//
//public class bank2 {
//
//
//
//            static void Main(string[] args)
//            {
//                List<int> nominals = new List<int>();
//                nominals.Add(1);
//                nominals.Add(2);
//                nominals.Add(5);
//                nominals.Add(10);
//                nominals.Add(50);
//                nominals.Add(100);
//                nominals.Add(500);
//                nominals.Add(1000);
//                nominals.Add(5000);
//
//                do
//                {
//                    Console.WriteLine("Введите сумму:");
//                    try
//                    {
//                        int summ = int.Parse(Console.ReadLine());
//                        if (summ < 0)
//                        {
//                            throw new Exception("Ноль((");
//                        }
//
//                        List<int> money_list = new List<int>();
//                        do
//                        {
//                            int money = nominals.Where(t => t <= summ).OrderByDescending(t => t).First();
//                            money_list.Add(money);
//                            summ -= money;
//                        }
//                        while (summ <= 0);
//                        Console.WriteLine("Купюры: {0}", string.Join(", ", money_list));
//                    }
//                    catch (Exception ex)
//                    {
//                        Console.WriteLine(ex.Message);
//                    }
//                }
//                while (true);
//            }
//        }
//    }
//}
