package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StickerUrlStruct implements Serializable {

    @C09CT("high_resolution_url")
    public final UrlModel highResolutionUrl;

    @C09CT("low_resolution_url")
    public final UrlModel lowResolutionUrl;

    @C09CT("mid_resolution_url")
    public final UrlModel midResolutionUrl;

    @C09CT("uri")
    public final String uri;

    public StickerUrlStruct() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerUrlStruct)) {
            return false;
        }
        StickerUrlStruct stickerUrlStruct = (StickerUrlStruct) obj;
        return Intrinsics.LJFF(this.lowResolutionUrl, stickerUrlStruct.lowResolutionUrl) && Intrinsics.LJFF(this.midResolutionUrl, stickerUrlStruct.midResolutionUrl) && Intrinsics.LJFF(this.highResolutionUrl, stickerUrlStruct.highResolutionUrl) && Intrinsics.LJFF(this.uri, stickerUrlStruct.uri);
    }

    public int hashCode() {
        UrlModel urlModel = this.lowResolutionUrl;
        int iHashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
        UrlModel urlModel2 = this.midResolutionUrl;
        int iHashCode2 = (iHashCode + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        UrlModel urlModel3 = this.highResolutionUrl;
        int iHashCode3 = (iHashCode2 + (urlModel3 == null ? 0 : urlModel3.hashCode())) * 31;
        String str = this.uri;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerUrlStruct(lowResolutionUrl=");
        sbLIZ.append(this.lowResolutionUrl);
        sbLIZ.append(", midResolutionUrl=");
        sbLIZ.append(this.midResolutionUrl);
        sbLIZ.append(", highResolutionUrl=");
        sbLIZ.append(this.highResolutionUrl);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StickerUrlStruct(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, String str) {
        this.lowResolutionUrl = urlModel;
        this.midResolutionUrl = urlModel2;
        this.highResolutionUrl = urlModel3;
        this.uri = str;
    }
}
