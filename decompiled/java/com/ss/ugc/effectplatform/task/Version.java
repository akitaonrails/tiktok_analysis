package com.ss.ugc.effectplatform.task;

import X.C13OH;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class Version implements Serializable {
    public static final C13OH Companion = new C13OH();
    public String logId;
    public String version;

    public Version() {
        this(CardStruct.IStatusCode.DEFAULT, "");
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public Version(String str, String str2) {
        this.version = str;
        this.logId = str2;
    }
}
