package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13DL;
import X.C13LQ;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonIoPrioConfig {

    @C09CT("blockSoList")
    public String[] blockSoList;

    @C09CT("important_threads")
    public String[] importantThreads;

    @C09CT("unimportant_threads")
    public String[] unImportantThreads;

    @C09CT("whiteSoList")
    public String[] whiteSoList;

    public CommonIoPrioConfig() {
        this(null, null, null, null);
    }

    public final String[] mergeImportant(String[] strArr) {
        String[] strArr2 = this.importantThreads;
        if (strArr2 == null || (strArr2.length != 0 && (strArr2 = (String[]) C13LQ.LJLIIL(C13DL.LJIIIZ(strArr, strArr2)).toArray(new String[0])) == null)) {
            return strArr;
        }
        return strArr2;
    }

    public final String[] mergeUnImportant(String[] strArr) {
        String[] strArr2 = this.unImportantThreads;
        if (strArr2 == null || (strArr2.length != 0 && (strArr2 = (String[]) C13LQ.LJLIIL(C13DL.LJIIIZ(strArr, strArr2)).toArray(new String[0])) == null)) {
            return strArr;
        }
        return strArr2;
    }

    public final void setBlockSoList(String[] strArr) {
        this.blockSoList = strArr;
    }

    public final void setImportantThreads(String[] strArr) {
        this.importantThreads = strArr;
    }

    public final void setUnImportantThreads(String[] strArr) {
        this.unImportantThreads = strArr;
    }

    public final void setWhiteSoList(String[] strArr) {
        this.whiteSoList = strArr;
    }

    public CommonIoPrioConfig(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        this.blockSoList = strArr;
        this.whiteSoList = strArr2;
        this.importantThreads = strArr3;
        this.unImportantThreads = strArr4;
    }
}
