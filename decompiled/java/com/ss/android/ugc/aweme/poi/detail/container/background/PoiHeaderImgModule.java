package com.ss.android.ugc.aweme.poi.detail.container.background;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderImgModule extends BaseComponentData implements Serializable {

    @C09CT("region_cover_img")
    public final CoverImg coverImg;

    @C09CT("height")
    public final int height;

    public PoiHeaderImgModule() {
        this(200, null);
    }

    public final PoiHeaderImgModule copy(int i, CoverImg coverImg) {
        return new PoiHeaderImgModule(i, coverImg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiHeaderImgModule)) {
            return false;
        }
        PoiHeaderImgModule poiHeaderImgModule = (PoiHeaderImgModule) obj;
        return this.height == poiHeaderImgModule.height && Intrinsics.LJFF(this.coverImg, poiHeaderImgModule.coverImg);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        int i = this.height * 31;
        CoverImg coverImg = this.coverImg;
        return i + (coverImg == null ? 0 : coverImg.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiHeaderImgModule(height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", coverImg=");
        sbLIZ.append(this.coverImg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final CoverImg getCoverImg() {
        return this.coverImg;
    }

    public final int getHeight() {
        return this.height;
    }

    public PoiHeaderImgModule(int i, CoverImg coverImg) {
        this.height = i;
        this.coverImg = coverImg;
    }
}
