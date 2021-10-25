package com.zybooks.lab2_survey;

import android.os.Parcel;
import android.os.Parcelable;

public class surveyCalculations {
    //implements Parcelable {
    private static String name_user;
    private static String answer_for_1;
    private static String answer_for_2;
    private static String answer_for_3;
    private static String answer_for_4;
    private static String final_name;
    private static int result;
    private static int acc_gluttony;
    private static int acc_pride = 0;
    private static int acc_lust = 0;
    private static int acc_wrath = 0;
    private static int acc_greed = 0;
    private static int acc_sloth = 0;
    private static int acc_envy = 0;

//    protected surveyCalculations(Parcel in) {
//        name_user = in.readString();
//    }
//
//    public static final Creator<surveyCalculations> CREATOR = new Creator<surveyCalculations>() {
//        @Override
//        public surveyCalculations createFromParcel(Parcel in) {
//            return new surveyCalculations(in);
//        }
//
//        @Override
//        public surveyCalculations[] newArray(int size) {
//            return new surveyCalculations[size];
//        }
//    };
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel parcel, int i) {
//        parcel.writeString(name_user);
//    }

    public enum SinLevel {
        PRIDE, GLUTTONY, WRATH, SLOTH, ENVY, GREED, LUST
    }

    private SinLevel new_SinLevel;

    public surveyCalculations(int points, SinLevel level) {
        setSinLevel(level);
        setPointsForSin(points, level);
    }

    public SinLevel getSinLevel() {
        return new_SinLevel;
    }

    public void setSinLevel(SinLevel level) {
        new_SinLevel = level;
    }

    public static int getPridePoints() {
        return acc_pride;
    }
    public static int getLustPoints() {
        return acc_lust;
    }
    public static int getGluttonyPoints() {
        return acc_gluttony;
    }
    public static int getGreedPoints() {
        return acc_greed;
    }
    public static int getSlothPoints() {
        return acc_sloth;
    }
    public static int getWrathPoints() {
        return acc_wrath;
    }
    public static int getEnvyPoints() {
        return acc_envy;
    }

    public void setPointsForSin(int points, SinLevel level) {
        if (level == SinLevel.PRIDE) {
            acc_gluttony = points;
        } else if (level == SinLevel.GREED) {
            acc_greed = points;
        } else if (level == SinLevel.LUST) {
            acc_lust = points;
        } else if (level == SinLevel.ENVY) {
            acc_envy = points;
        } else if (level == SinLevel.WRATH) {
            acc_wrath = points;
        } else if (level == SinLevel.SLOTH) {
            acc_sloth = points;
        }
    }

    public void setUser_Name(String name) { name_user = name;}

    public String getUser_Name() {
        return name_user;
    }

    public static void setAnswer_for_1(String sin) {
        answer_for_1 = sin;
    }

    public static String getAnswer_for_1() {
        return answer_for_1;
    }

    public static void setAnswer_for_2(String point) {
        answer_for_2 = point;
    }

    public static String getAnswer_for_2() {
        return answer_for_2;
    }

    public static void setAnswer_for_3(String point) {
        answer_for_3 = point;
    }

    public static String getAnswer_for_3() {
        return answer_for_3;
    }

    public static void setAnswer_for_4(String point) {
        answer_for_4 = point;
    }

    public static String getAnswer_for_4() {
        return answer_for_4;
    }

    public void addPointsToSin(int points, SinLevel level) {
        if (SinLevel.PRIDE == level) {
            acc_pride = acc_pride + points;
        } else if (SinLevel.GLUTTONY == level) {
            acc_gluttony = acc_gluttony + points;
        } else if (SinLevel.GREED == level) {
            acc_greed = acc_greed + points;
        } else if (SinLevel.LUST == level) {
            acc_lust = acc_lust + points;
        } else if (SinLevel.ENVY == level) {
            acc_envy = acc_envy + points;
        } else if (SinLevel.WRATH == level) {
            acc_wrath = acc_wrath + points;
        } else if (SinLevel.SLOTH == level) {
            acc_sloth = acc_sloth + points;
        }
    }

    public static void calculateResults() {
        String name = "Gluttony";
        int curr_sin = acc_gluttony;
        if (acc_pride > curr_sin) {
            curr_sin = acc_pride;
            name = "Pride";
        } else if (acc_sloth > curr_sin) {
            curr_sin = acc_sloth;
            name = "Sloth";
        } else if (acc_lust > curr_sin) {
            curr_sin = acc_lust;
            name = "Lust";
        } else if (acc_wrath > curr_sin) {
            curr_sin = acc_wrath;
            name = "Wrath";
        } else if (acc_greed > curr_sin) {
            curr_sin = acc_greed;
            name = "Greed";
        } else if (acc_envy > curr_sin) {
            curr_sin = acc_envy;
            name = "Envy";
        }
        result = curr_sin;
        final_name = name;
    }

    public static int getResultPoints() {
        return result;
    }

    public static String getName() {
        return final_name;
    }

}
