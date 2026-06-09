##    1. Right Triangle Star Pattern
public class Pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*
* *
* * *
* * * *
* * * * *


## 2. Inverted Triangle

### Code

```java
public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

### Output

```text
* * * * *
* * * *
* * *
* *
*
```

---

## 3. Number Triangle

### Code

```java
public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```

### Output

```text
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

---

## 4. Repeated Number Triangle

### Code

```java
public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
```

### Output

```text
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
```

---

## 5. Floyd's Triangle

### Code

```java
public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
```

### Output

```text
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

---

## 6. Alphabet Triangle

### Code

```java
public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            char ch = 'A';

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
```

### Output

```text
A
A B
A B C
A B C D
A B C D E
```

---

## 7. Pyramid Pattern

### Code

```java
public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

### Output

```text
    *
   ***
  *****
 *******
*********
```

---

## 8. Diamond Pattern

### Code

```java
public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
```

### Output

```text
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

---

## 9. Hollow Square

### Code

```java
public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
```

### Output

```text
* * * * *
*       *
*       *
*       *
* * * * *
```

---

## 10. Pascal's Triangle

### Code

```java
public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {

            int num = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
```

### Output

```text
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
```

### Practice Order

1. Right Triangle
2. Inverted Triangle
3. Number Triangle
4. Repeated Number Triangle
5. Floyd's Triangle
6. Alphabet Triangle
7. Pyramid
8. Hollow Square
9. Diamond
10. Pascal's Triangle

This order gradually teaches nested loops, spacing logic, and mathematical patterns.