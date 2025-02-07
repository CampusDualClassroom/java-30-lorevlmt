package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("ERROR: Non se pode dividir por cero.");
        } else {
            return dividend / divisor;
        }
    }

    public static void main(String[] args) {
        Exercise30 exercise = new Exercise30();

        try {
            System.out.println(exercise.divisionWithCustomException(10, 0));
        } catch (DivisionByZeroException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("Programa acabado.");
        }
    }
}
