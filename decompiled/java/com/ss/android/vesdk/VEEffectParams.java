package com.ss.android.vesdk;

import X.C2188811AlT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes36.dex */
public class VEEffectParams {
    public static int EFFECT_TYPE_APPEND_COMPOSER = 6;
    public static int EFFECT_TYPE_APPEND_COMPOSER_WITH_TAG = 2;
    public static int EFFECT_TYPE_RELOAD_COMPOSER = 5;
    public static int EFFECT_TYPE_RELOAD_COMPOSER_WITH_TAG = 1;
    public static int EFFECT_TYPE_REMOVE_COMPOSER = 9;
    public static int EFFECT_TYPE_REPLACE_COMPOSER = 7;
    public static int EFFECT_TYPE_REPLACE_COMPOSER_WITH_TAG = 3;
    public static int EFFECT_TYPE_SET_COMPOSER = 4;
    public static int EFFECT_TYPE_SET_COMPOSER_WITH_TAG = 0;
    public static int EFFECT_TYPE_UPDATE_COMPOSER = 8;
    public int TYPE;
    public boolean boolValueOne;
    public boolean boolValueThree;
    public boolean boolValueTwo;
    public float floatValueOne;
    public float floatValueThree;
    public float floatValueTwo;
    public int intValueOne;
    public int intValueThree;
    public int intValueTwo;
    public String stringValueOne = "";
    public String stringValueTwo = "";
    public String stringValueThree = "";
    public ArrayList<Integer> intArrayValue = new ArrayList<>();
    public ArrayList<Float> floatArrayValue = new ArrayList<>();
    public ArrayList<Boolean> boolArrayValue = new ArrayList<>();
    public ArrayList<String> stringArrayOne = new ArrayList<>();
    public ArrayList<String> stringArrayTwo = new ArrayList<>();
    public ArrayList<String> stringArrayThree = new ArrayList<>();

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type:");
        sbLIZ.append(this.TYPE);
        sbLIZ.append(" int1: ");
        sbLIZ.append(this.intValueOne);
        sbLIZ.append(" int2: ");
        sbLIZ.append(this.intValueTwo);
        sbLIZ.append(" int3: ");
        sbLIZ.append(this.intValueThree);
        sbLIZ.append(" float1: ");
        sbLIZ.append(this.floatValueOne);
        sbLIZ.append(" float2: ");
        sbLIZ.append(this.floatValueTwo);
        sbLIZ.append(" float3: ");
        sbLIZ.append(this.floatValueThree);
        sbLIZ.append(" bool1: ");
        sbLIZ.append(this.boolValueOne);
        sbLIZ.append(" bool2: ");
        sbLIZ.append(this.boolValueTwo);
        sbLIZ.append(" bool3: ");
        sbLIZ.append(this.boolValueThree);
        sbLIZ.append(" string1: ");
        sbLIZ.append(this.stringValueOne);
        sbLIZ.append(" string2: ");
        sbLIZ.append(this.stringValueTwo);
        sbLIZ.append(" string3: ");
        sbLIZ.append(this.stringValueThree);
        sbLIZ.append(" intA: ");
        sbLIZ.append(this.intArrayValue.toString());
        sbLIZ.append(" floatA: ");
        sbLIZ.append(this.floatArrayValue.toString());
        sbLIZ.append(" boolA: ");
        sbLIZ.append(this.boolArrayValue.toString());
        sbLIZ.append(" stringA1: ");
        sbLIZ.append(this.stringArrayOne.toString());
        sbLIZ.append(" stringA2: ");
        sbLIZ.append(this.stringArrayTwo.toString());
        sbLIZ.append(" stringA3: ");
        sbLIZ.append(this.stringArrayThree.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
