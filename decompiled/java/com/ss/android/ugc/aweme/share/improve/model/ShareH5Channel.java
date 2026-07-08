package com.ss.android.ugc.aweme.share.improve.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareH5Channel implements Serializable {

    @C09CT("aweme_id")
    public String awemeId;

    @C09CT("mode")
    public Integer mode;

    @C09CT("platform_id")
    public String platformId;

    public ShareH5Channel() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareH5Channel)) {
            return false;
        }
        ShareH5Channel shareH5Channel = (ShareH5Channel) obj;
        return Intrinsics.LJFF(this.awemeId, shareH5Channel.awemeId) && Intrinsics.LJFF(this.platformId, shareH5Channel.platformId) && Intrinsics.LJFF(this.mode, shareH5Channel.mode);
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setMode(Integer num) {
        this.mode = num;
    }

    public final void setPlatformId(String str) {
        this.platformId = str;
    }

    public ShareH5Channel(String str, String str2, Integer num) {
        this.awemeId = str;
        this.platformId = str2;
        this.mode = num;
    }
}
