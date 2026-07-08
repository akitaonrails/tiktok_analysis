package com.ss.android.ugc.aweme.account.api;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BannerConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("description")
    public final String description;

    @C09CT("title")
    public final String title;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerConfig)) {
            return false;
        }
        BannerConfig bannerConfig = (BannerConfig) obj;
        return Intrinsics.LJFF(this.title, bannerConfig.title) && Intrinsics.LJFF(this.description, bannerConfig.description);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.description.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BannerConfig(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BannerConfig() {
        this("", "");
    }

    public BannerConfig(String str, String str2) {
        this.title = str;
        this.description = str2;
    }
}
