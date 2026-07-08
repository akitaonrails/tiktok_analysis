package com.ss.bytertc.engine;

import X.C2188811AlT;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class EffectInfo {
    public String category;
    public String panel;
    public int[] params;
    public String resID;
    public String resPath;
    public int tagNums;
    public String[] tags;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectInfo{resPath=");
        sbLIZ.append(this.resPath);
        sbLIZ.append('\'');
        sbLIZ.append(",resID='");
        sbLIZ.append(this.resID);
        sbLIZ.append('\'');
        sbLIZ.append(", panel='");
        sbLIZ.append(this.panel);
        sbLIZ.append('\'');
        sbLIZ.append(", category='");
        sbLIZ.append(this.category);
        sbLIZ.append('\'');
        sbLIZ.append(", tagNums=");
        sbLIZ.append(this.tagNums);
        sbLIZ.append(", params=");
        sbLIZ.append(Arrays.toString(this.params));
        sbLIZ.append(", tags=");
        sbLIZ.append(Arrays.toString(this.tags));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getCategory() {
        return this.category;
    }

    public String getPanel() {
        return this.panel;
    }

    public int[] getParams() {
        return this.params;
    }

    public String getResID() {
        return this.resID;
    }

    public String getResPath() {
        return this.resPath;
    }

    public int getTagNums() {
        return this.tagNums;
    }

    public String[] getTags() {
        return this.tags;
    }

    public EffectInfo(String str, String str2, String str3, int i, int[] iArr, String[] strArr) {
        this.resPath = str;
        this.panel = str2;
        this.category = str3;
        this.tagNums = i;
        this.params = iArr;
        this.tags = strArr;
        this.resID = "";
    }

    public EffectInfo(String str, String str2, String str3, String str4, int i, int[] iArr, String[] strArr) {
        this.resPath = str;
        this.resID = str2;
        this.panel = str3;
        this.category = str4;
        this.tagNums = i;
        this.params = iArr;
        this.tags = strArr;
    }
}
