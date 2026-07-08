package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes29.dex */
public final class SearchPhotoArgbScopeConfig {

    @C09CT("card_count")
    public final int cardCount;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("image_count")
    public final int imageCount;

    public SearchPhotoArgbScopeConfig() {
        this(false, -1, -1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchPhotoArgbScopeConfig)) {
            return false;
        }
        SearchPhotoArgbScopeConfig searchPhotoArgbScopeConfig = (SearchPhotoArgbScopeConfig) obj;
        return this.enabled == searchPhotoArgbScopeConfig.enabled && this.imageCount == searchPhotoArgbScopeConfig.imageCount && this.cardCount == searchPhotoArgbScopeConfig.cardCount;
    }

    public int hashCode() {
        return (((C786410Ut5.Z2(this.enabled) * 31) + this.imageCount) * 31) + this.cardCount;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchPhotoArgbScopeConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", imageCount=");
        sbLIZ.append(this.imageCount);
        sbLIZ.append(", cardCount=");
        sbLIZ.append(this.cardCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchPhotoArgbScopeConfig(boolean z, int i, int i2) {
        this.enabled = z;
        this.imageCount = i;
        this.cardCount = i2;
    }
}
