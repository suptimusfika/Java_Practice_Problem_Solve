//20. A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.
// If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?
// [Extract the digits from the paragraph and calculate the price]
public class Problem20_ExtractPrice {
    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. " +
                "If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        String word[] = paragraph.split(" ");
        String l = word[7];
        int laptopPrice = Integer.parseInt(l);
        String m = word[15];
        int mousePrice = Integer.parseInt(m);
        String numMouse = word[23];
        int numberOfMouse = Integer.parseInt(numMouse);
        String dis[] = word[34].split("%");
        int discount = Integer.parseInt(dis[0]);
        int totalCost = laptopPrice + (numberOfMouse * mousePrice);
        double totalCostWithDiscount = totalCost - (discount * totalCost) / 100;
        System.out.println("Total cost after giving 15% discount = " + totalCostWithDiscount);
    }
}
