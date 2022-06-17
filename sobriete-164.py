def bonmot3(mot):

    if mot == " " or mot == "":
        return ("")
    else:
        o = 0
        if mot[0] == " " and mot[1] != " ":
            mot = mot[:0] + "" + mot[1:]

        if mot[-1] == " ":
            if mot[-2] != " ":
                mot = mot[:-1] + ""

            else:
                o += 1

        L = []
        P = []

        strlen = len(mot)
        for i in range(0, strlen-o):
            P.append(mot[i])
            if mot[i] == " ":
                if mot[i + 1] != " " and mot[i - 1] != " ":
                    L.append(i)
        u = 0
        Vrai = ""

        for i in L:
            del P[i - u]
            u += 1


        for i in P:
            Vrai += i

        if (o>0):
            Vrai += " "
        return(Vrai)