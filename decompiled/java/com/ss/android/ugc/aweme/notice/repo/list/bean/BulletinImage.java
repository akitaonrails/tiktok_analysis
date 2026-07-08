package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinImage {

    @C09CT("crop_url")
    public final UrlModel cropUrl;

    @C09CT("origin_url")
    public final UrlModel originUrl;

    @C09CT("type")
    public final Integer type;

    public BulletinImage() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinImage)) {
            return false;
        }
        BulletinImage bulletinImage = (BulletinImage) obj;
        return Intrinsics.LJFF(this.originUrl, bulletinImage.originUrl) && Intrinsics.LJFF(this.cropUrl, bulletinImage.cropUrl) && Intrinsics.LJFF(this.type, bulletinImage.type);
    }

    public int hashCode() {
        UrlModel urlModel = this.originUrl;
        int iHashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
        UrlModel urlModel2 = this.cropUrl;
        int iHashCode2 = (iHashCode + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinImage(originUrl=");
        sbLIZ.append(this.originUrl);
        sbLIZ.append(", cropUrl=");
        sbLIZ.append(this.cropUrl);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinImage(UrlModel urlModel, UrlModel urlModel2, Integer num) {
        this.originUrl = urlModel;
        this.cropUrl = urlModel2;
        this.type = num;
    }
}
