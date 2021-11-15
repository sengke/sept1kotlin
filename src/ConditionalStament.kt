fun main(args: Array<String>) {
    //if statements
    var age = 17
    if (age<18){
        println("Sorry, we can't allow you to the party")
    }else{
        println("You are an adult.Enjoy yourself")
    }

    var marks = 90
    if (marks<40){
        println("E")
    }else if (marks <50){
        print("D")
    }else if (marks <60){
        println("C")
    }else if (marks <70){
        println("B")
    }else{
        println("A")
    }
    //when statements
    var bettingNumber = 1
    when(bettingNumber){
        1->{
            println("Ooooops!!! You lost")
        }
        2->{
            println("Oooops!! You lost")
        }
        3->{
            println("Congrats!!! You won")
        }
        4->{
            println("Oooops!! You lost")
        }
        else->{
            println("Please enter a number from 1 - 4 to win")
        }

    }
}