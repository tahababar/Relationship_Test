import java.util.Scanner;

public class RelationshipTest
{
public static void main (String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a non-negative integer giving the number of strings in the set!");
    int numberOfStringsInSet = sc.nextInt();
    System.out.println ("Please enter " + numberOfStringsInSet + " words naming the distinct strings in the set!");
    String[] arr1 = new String[numberOfStringsInSet];  
    for(int i = 0; i < arr1.length; i++)
    {
        arr1[i] = sc.next();
    }
    System.out.println("Please enter a non-negative integer giving the number of pairs in the relation!");
    int numberOfPairsInRelation = sc.nextInt();
    System.out.println ("Please enter " + numberOfPairsInRelation + " distinct pairs!");
    String[] arr2 = new String[numberOfPairsInRelation * 2];
    for(int ct = 0; ct < numberOfPairsInRelation * 2; ct++)
    {   
        arr2[ct] = sc.next();
    }
    sc.close();

    /// Check Reflexive
    int count = 0;
    boolean reflexiveStatus = false;
    for (int c = 0; c < arr1.length; c++)
    {
        for (int j = 0; j < arr2.length; j = j + 2)
        {
            if ((arr1[c].equals(arr2[j])) && (arr1[c].equals(arr2[j+1])))
            {
                count++;
            }
        }
    }
    
    if (count == arr1.length)
    {
        System.out.println("reflexive");
        reflexiveStatus = true;
    }
    else
    {
        System.out.println("not reflexive");
    }

    /// Check Symmetric
    int[] indexNumberArray = new int[numberOfPairsInRelation];
    int indexNumber = 0;
    boolean symmetricStatus = false;
    for (int b = 0; b < arr2.length; b = b + 2)
    {
        if (!arr2[b].equals(arr2[b+1]))
        {
            indexNumberArray[indexNumber] = b;
            indexNumber++;
        }
    }
    int count1 = 0;
    for (int d = 0; d < indexNumber; d++)
    {
        for (int e = 0; e < arr2.length; e = e + 2)
        {
            if ((arr2[indexNumberArray[d]].equals(arr2[e + 1])) && (arr2[indexNumberArray[d]+ 1].equals(arr2[e])))
            {
                count1++;
            }
        }
    }
    if (count1 == indexNumber)
    {
        System.out.println("symmetric");
        symmetricStatus = true;
    }
    else
    {
        System.out.println("not symmetric");
    }

    ///Check Transitive
    int count3 = 0;
    int count4 = 0;
    boolean transitiveStatus = false;
    for (int k = 0; k < arr2.length - 3; k = k+2)
    {
        for (int l = k + 2; l < arr2.length - 1; l = l+2){
        if (arr2[k+1].equals(arr2[l]))
        {
            count3++;
            for (int m = 0; m < arr2.length; m = m + 2)
            {   
                if ((arr2[m].equals(arr2[k])) && (arr2[m+1].equals(arr2[l+1])))
                {
                    count4++;
                }
            }
        }
    }
    }
    if (count3 == count4)
    {
        System.out.println("transitive");
        transitiveStatus = true;
    }
    else
    {
        System.out.println("not transitive");
    }
    ///Check Anti-symmetric
    int[] indexNumberArray2 = new int[numberOfPairsInRelation];
    int indexNumber2 = 0;
    boolean antiSymmetricStatus = false;
    for (int f = 0; f < arr2.length; f = f + 2)
    {
        if (!arr2[f].equals(arr2[f+1]))
        {
        indexNumberArray2[indexNumber2] = f;
        indexNumber2++;
        }
    }
    int count2 = 0;
    for (int g = 0; g < indexNumber2; g++)
    {   
    for (int h = 0; h < arr2.length; h = h + 2)
        {
        if ((arr2[indexNumberArray2[g]].equals(arr2[h + 1])) && (arr2[indexNumberArray[g] + 1].equals(arr2[h])))
        {
            count2++;
        }
        }
    }

    if (count2 == 0)
    {
    System.out.println("antisymmetric");
    antiSymmetricStatus = true;
    }
    else
    {
    System.out.println("not antisymmetric");
    }

    if ((reflexiveStatus == true) && (symmetricStatus == true) && (antiSymmetricStatus == true) && (transitiveStatus == true))
    {
        System.out.println("both");
    }
    else if ((reflexiveStatus == true) && (symmetricStatus == true) && (transitiveStatus == true))
    {
        System.out.println("equivalence relation");
    }
    else if ((reflexiveStatus == true) && (antiSymmetricStatus == true) && (transitiveStatus == true))
    {
        System.out.println("partial order");
    }
    else
    {
        System.out.println("neither");
    }
}
}