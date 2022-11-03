package com.funciones;

public class AbusoSentencias {
    public static void main(String[] args) {
        boolean bEsLaborable =  esLaborables(5);
    }

    public static boolean esLaborables(int dia) {
      return dia > 0 && dia < 6;

    }

//    public static boolean esLaborables(int dia) {
//        if (dia > 0 && dia < 6){
//            return true;
//        }
//        return false;
//
//    }

//    public static boolean esLaborables(int dia) {
//        switch (dia) {
//            case 1:
//                return true;
//            break;
//            case 2:
//                return true;
//            break;
//            case 3:
//                return true;
//            break;
//            case 4:
//                return true;
//            break;
//            case 5:
//                return true;
//            break;
//            case 6:
//                return true;
//            break;
//            case 7:
//                return true;
//            break;
//
//
//        }
//    }


}
