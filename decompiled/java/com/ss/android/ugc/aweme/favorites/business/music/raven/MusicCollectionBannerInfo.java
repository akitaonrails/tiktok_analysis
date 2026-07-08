package com.ss.android.ugc.aweme.favorites.business.music.raven;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MusicCollectionBannerInfo extends BaseComponentData implements Serializable {
    public static final int $stable = 8;

    @C09CT("visible")
    public boolean visible;

    public MusicCollectionBannerInfo() {
        this(false);
    }

    public final MusicCollectionBannerInfo copy(boolean z) {
        return new MusicCollectionBannerInfo(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MusicCollectionBannerInfo) && this.visible == ((MusicCollectionBannerInfo) obj).visible;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.visible);
    }

    @Override // com.bytedance.hybrid.spark.raven.model.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicCollectionBannerInfo(visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public MusicCollectionBannerInfo(boolean z) {
        this.visible = z;
    }

    public final void setVisible(boolean z) {
        this.visible = z;
    }
}
