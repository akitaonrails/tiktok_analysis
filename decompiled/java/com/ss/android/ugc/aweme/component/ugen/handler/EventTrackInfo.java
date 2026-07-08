package com.ss.android.ugc.aweme.component.ugen.handler;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class EventTrackInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("enter_method")
    public String enterMethod;

    @C09CT("image_cnt")
    public int imageCnt;

    @C09CT("image_location")
    public int imageLocation;

    @C09CT("product_count")
    public int productCount;

    @C09CT("product_id")
    public String productId;

    @C09CT("product_url")
    public String productUrl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventTrackInfo)) {
            return false;
        }
        EventTrackInfo eventTrackInfo = (EventTrackInfo) obj;
        return this.imageLocation == eventTrackInfo.imageLocation && this.imageCnt == eventTrackInfo.imageCnt && Intrinsics.LJFF(this.productId, eventTrackInfo.productId) && Intrinsics.LJFF(this.productUrl, eventTrackInfo.productUrl) && this.productCount == eventTrackInfo.productCount && Intrinsics.LJFF(this.enterMethod, eventTrackInfo.enterMethod);
    }

    public int hashCode() {
        return (((((((((this.imageLocation * 31) + this.imageCnt) * 31) + this.productId.hashCode()) * 31) + this.productUrl.hashCode()) * 31) + this.productCount) * 31) + this.enterMethod.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EventTrackInfo(imageLocation=");
        sbLIZ.append(this.imageLocation);
        sbLIZ.append(", imageCnt=");
        sbLIZ.append(this.imageCnt);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", productUrl=");
        sbLIZ.append(this.productUrl);
        sbLIZ.append(", productCount=");
        sbLIZ.append(this.productCount);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EventTrackInfo() {
        this(0, 0, "", "", 0, "unknown");
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setImageCnt(int i) {
        this.imageCnt = i;
    }

    public final void setImageLocation(int i) {
        this.imageLocation = i;
    }

    public final void setProductCount(int i) {
        this.productCount = i;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setProductUrl(String str) {
        this.productUrl = str;
    }

    public EventTrackInfo(int i, int i2, String str, String str2, int i3, String str3) {
        this.imageLocation = i;
        this.imageCnt = i2;
        this.productId = str;
        this.productUrl = str2;
        this.productCount = i3;
        this.enterMethod = str3;
    }
}
