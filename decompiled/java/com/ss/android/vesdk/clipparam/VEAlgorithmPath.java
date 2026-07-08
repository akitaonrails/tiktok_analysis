package com.ss.android.vesdk.clipparam;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public class VEAlgorithmPath {
    public static int BEATES_FILE_BEATS_A0 = 2;
    public static int BEATES_FILE_CUSTOM = 3;
    public static int BEATES_FILE_DEFAULT = 0;
    public static int BEATES_FILE_SERVER_C = 1;
    public static int INTMODE_ONSET = 0;
    public static int MODE_SUCCESSIVELY = 1;
    public String downBeatsPath;
    public String manMadePath;
    public int mode = INTMODE_ONSET;
    public String noStrengthBeatsPath;
    public String onlineBeatsPath;
    public int type;
    public String veBeatsPath;

    public String toString() {
        String strLIZIZ = "";
        if (this.veBeatsPath != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(" veBeatsPath: ");
            sbLIZ.append(this.veBeatsPath);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.downBeatsPath != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" downBeatsPath: ");
            sbLIZ2.append(this.downBeatsPath);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (this.noStrengthBeatsPath != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" noStrengthBeatsPath: ");
            sbLIZ3.append(this.noStrengthBeatsPath);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (this.onlineBeatsPath != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(" onlineBeatsPath: ");
            sbLIZ4.append(this.onlineBeatsPath);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (this.manMadePath != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append(" manMadePath: ");
            sbLIZ5.append(this.manMadePath);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(strLIZIZ);
        sbLIZ6.append(" mode: ");
        sbLIZ6.append(this.mode);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ6);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(strLIZIZ2);
        sbLIZ7.append(" type: ");
        sbLIZ7.append(this.type);
        return C2188811AlT.LIZIZ(sbLIZ7);
    }

    public String getDownBeatsPath() {
        return this.downBeatsPath;
    }

    public String getManMadePath() {
        return this.manMadePath;
    }

    public int getMode() {
        return this.mode;
    }

    public String getNoStrengthBeatsPath() {
        return this.noStrengthBeatsPath;
    }

    public String getOnlineBeatsPath() {
        return this.onlineBeatsPath;
    }

    public int getType() {
        return this.type;
    }

    public String getVeBeatsPath() {
        return this.veBeatsPath;
    }

    public void setDownBeatsPath(String str) {
        this.downBeatsPath = str;
    }

    public void setManMadePath(String str) {
        this.manMadePath = str;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setNoStrengthBeatsPath(String str) {
        this.noStrengthBeatsPath = str;
    }

    public void setOnlineBeatsPath(String str) {
        this.onlineBeatsPath = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setVeBeatsPath(String str) {
        this.veBeatsPath = str;
    }
}
