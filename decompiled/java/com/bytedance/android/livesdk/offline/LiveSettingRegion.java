package com.bytedance.android.livesdk.offline;

import X.C09CT;
import X.C492250JSd;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSettingRegion implements Serializable {
    public transient boolean LL;

    @C09CT("name")
    public String asciiName;

    @C09CT("code")
    public String code;
    public static final C492250JSd Companion = new Object() { // from class: X.0JSd
    };
    public static final int $stable = 8;
    public static final LiveSettingRegion EMPTY = new LiveSettingRegion("", "", false);

    public LiveSettingRegion() {
        this("", "", false);
    }

    public final String getAsciiName() {
        return this.asciiName;
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getSupportTikTok() {
        return this.LL;
    }

    public final void setAsciiName(String str) {
        this.asciiName = str;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setSupportTikTok(boolean z) {
        this.LL = z;
    }

    public LiveSettingRegion(String str, String str2, boolean z) {
        this.code = str;
        this.asciiName = str2;
        this.LL = z;
    }
}
