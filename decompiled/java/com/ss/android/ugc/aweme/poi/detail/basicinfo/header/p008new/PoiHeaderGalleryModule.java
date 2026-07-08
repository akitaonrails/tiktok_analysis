package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.ai.model.PoiHeadAiSummary;
import com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderGalleryModule extends BaseComponentData implements Serializable {

    @C09CT("ai_summary")
    public final PoiHeadAiSummary aiSummary;

    @C09CT("picture_album")
    public final PictureAlbum pictureAlbum;

    public PoiHeaderGalleryModule() {
        this(null, null);
    }

    public final PoiHeaderGalleryModule copy(PictureAlbum pictureAlbum, PoiHeadAiSummary poiHeadAiSummary) {
        return new PoiHeaderGalleryModule(pictureAlbum, poiHeadAiSummary);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiHeaderGalleryModule)) {
            return false;
        }
        PoiHeaderGalleryModule poiHeaderGalleryModule = (PoiHeaderGalleryModule) obj;
        return Intrinsics.LJFF(this.pictureAlbum, poiHeaderGalleryModule.pictureAlbum) && Intrinsics.LJFF(this.aiSummary, poiHeaderGalleryModule.aiSummary);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        PictureAlbum pictureAlbum = this.pictureAlbum;
        int iHashCode = (pictureAlbum == null ? 0 : pictureAlbum.hashCode()) * 31;
        PoiHeadAiSummary poiHeadAiSummary = this.aiSummary;
        return iHashCode + (poiHeadAiSummary != null ? poiHeadAiSummary.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiHeaderGalleryModule(pictureAlbum=");
        sbLIZ.append(this.pictureAlbum);
        sbLIZ.append(", aiSummary=");
        sbLIZ.append(this.aiSummary);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PoiHeadAiSummary getAiSummary() {
        return this.aiSummary;
    }

    public final PictureAlbum getPictureAlbum() {
        return this.pictureAlbum;
    }

    public PoiHeaderGalleryModule(PictureAlbum pictureAlbum, PoiHeadAiSummary poiHeadAiSummary) {
        this.pictureAlbum = pictureAlbum;
        this.aiSummary = poiHeadAiSummary;
    }
}
