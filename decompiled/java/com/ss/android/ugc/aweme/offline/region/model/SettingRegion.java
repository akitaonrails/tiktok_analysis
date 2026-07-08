package com.ss.android.ugc.aweme.offline.region.model;

import X.C09CT;
import X.C492260JSe;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class SettingRegion implements Serializable {
    public static final C492260JSe Companion = new Object() { // from class: X.0JSe
    };
    public static final SettingRegion EMPTY = new SettingRegion("", "", false);
    public transient boolean LL;

    @C09CT("name")
    public final String asciiName;

    @C09CT("code")
    public final String code;

    public final String getAsciiName() {
        return this.asciiName;
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getSupportTikTok() {
        return this.LL;
    }

    public final void setSupportTikTok(boolean z) {
        this.LL = z;
    }

    public SettingRegion(String str, String str2, boolean z) {
        this.code = str;
        this.asciiName = str2;
        this.LL = z;
    }
}
