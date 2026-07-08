package com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BackGround implements Serializable {

    @C09CT("middle_page_bg_dark_url")
    public final String middlePageBgDarkUrl;

    @C09CT("middle_page_bg_light_url")
    public final String middlePageBgLightUrl;

    public BackGround() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackGround)) {
            return false;
        }
        BackGround backGround = (BackGround) obj;
        return Intrinsics.LJFF(this.middlePageBgLightUrl, backGround.middlePageBgLightUrl) && Intrinsics.LJFF(this.middlePageBgDarkUrl, backGround.middlePageBgDarkUrl);
    }

    public int hashCode() {
        String str = this.middlePageBgLightUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.middlePageBgDarkUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackGround(middlePageBgLightUrl=");
        sbLIZ.append(this.middlePageBgLightUrl);
        sbLIZ.append(", middlePageBgDarkUrl=");
        sbLIZ.append(this.middlePageBgDarkUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BackGround(String str, String str2) {
        this.middlePageBgLightUrl = str;
        this.middlePageBgDarkUrl = str2;
    }
}
