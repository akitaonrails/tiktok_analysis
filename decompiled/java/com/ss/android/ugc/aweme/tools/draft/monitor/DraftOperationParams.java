package com.ss.android.ugc.aweme.tools.draft.monitor;

import X.C09CT;
import X.C570430MYv;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftOperationParams extends C570430MYv {

    @C09CT("awemeType")
    public final int awemeType;

    @C09CT("draftVersion")
    public final int draftVersion;

    @C09CT("fileTreeInfo")
    public final String fileTreeInfo;

    @C09CT("notStandardsPath")
    public final String notStandardsPath;

    @C09CT("step")
    public final String step;

    public DraftOperationParams(int i, String str, int i2, String str2, String str3) {
        this.awemeType = i;
        this.step = str;
        this.draftVersion = i2;
        this.fileTreeInfo = str2;
        this.notStandardsPath = str3;
    }
}
