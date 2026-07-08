package com.bytedance.sysoptimizer;

import X.C2188811AlT;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class StackLeakItem {
    public int leakCount;
    public String soBuildId;
    public long soEndAddr;
    public String soPath;
    public long soStartAddr;
    public long startRoutine;
    public long startRoutineOffset;

    public String getSoName() {
        int iLastIndexOf;
        String str = this.soPath;
        return (str == null || (iLastIndexOf = str.lastIndexOf(47)) < 0 || iLastIndexOf >= this.soPath.length() + (-1)) ? "UNKNOWN" : this.soPath.substring(iLastIndexOf + 1);
    }

    public String getLeakItem() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.e);
        sbLIZ.append(this.leakCount);
        sbLIZ.append("] stacks leaked: ");
        sbLIZ.append(Long.toHexString(this.startRoutineOffset));
        sbLIZ.append(" ");
        sbLIZ.append(Long.toHexString(this.soStartAddr));
        sbLIZ.append("-");
        sbLIZ.append(Long.toHexString(this.soEndAddr));
        sbLIZ.append(" r-xp ");
        sbLIZ.append(getSoName());
        sbLIZ.append(" (");
        sbLIZ.append(this.soBuildId);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getBuildId() {
        return this.soBuildId;
    }

    public int getLeakCount() {
        return this.leakCount;
    }

    public long getOffset() {
        return this.startRoutineOffset;
    }

    public StackLeakItem(int i, long j, long j2, long j3, String str, String str2) {
        this.leakCount = i;
        this.startRoutine = j;
        this.soStartAddr = j2;
        this.soEndAddr = j3;
        this.soPath = str;
        this.soBuildId = str2;
        this.startRoutineOffset = j - j2;
    }
}
