#include <stdio.h>

int main() {
    char name[10];
    int usn;
    float total, m1, m2, m3;

    // Input student details
    printf("Enter the student name: ");
    scanf("%s", name); // Use " %[^\n]" if you want to allow spaces in the name

    printf("Enter the student USN: ");
    scanf("%d", &usn);

    printf("Enter the student marks for three subjects: ");
    scanf("%f %f %f", &m1,&m2,&m2);

    

    // Calculate total
    total = m1 + m2 + m3;

    // Print student details
    printf("\nStudent Details:\n");
    printf("Name: %s\n", name);
    printf("USN: %d\n", usn);
    printf("Total Marks: %.2f\n", total);  // Formatted to 2 decimal places

    return 0;
}