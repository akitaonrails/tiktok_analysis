package com.ss.android.ugc.aweme.feed.survey.frequency;

import X.C03IT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class AwemePromptInfo {
    public static final int $stable = 8;
    public final String awemeId;
    public final String entityInfo;
    public final String instructionId;
    public final String isI2I;
    public final List<String> urlList;

    public final C03IT toUrlModel() {
        return new C03IT(this.urlList);
    }

    public final String isI2I() {
        return this.isI2I;
    }

    public AwemePromptInfo(String str, String str2, String str3, String str4, List<String> list) {
        this.awemeId = str;
        this.instructionId = str2;
        this.entityInfo = str3;
        this.isI2I = str4;
        this.urlList = list;
    }
}
