package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutItem implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("local_image_name")
    public final String localImageName;

    @C09CT("price")
    public final Integer price;

    @C09CT("title")
    public final String title;

    public CheckoutItem() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutItem)) {
            return false;
        }
        CheckoutItem checkoutItem = (CheckoutItem) obj;
        return Intrinsics.LJFF(this.id, checkoutItem.id) && Intrinsics.LJFF(this.title, checkoutItem.title) && Intrinsics.LJFF(this.price, checkoutItem.price) && Intrinsics.LJFF(this.imageUrl, checkoutItem.imageUrl) && Intrinsics.LJFF(this.localImageName, checkoutItem.localImageName);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.price;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.localImageName;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutItem(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", price=");
        sbLIZ.append(this.price);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", localImageName=");
        sbLIZ.append(this.localImageName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getImageURL() {
        return this.imageUrl;
    }

    public CheckoutItem(String str, String str2, Integer num, String str3, String str4) {
        this.id = str;
        this.title = str2;
        this.price = num;
        this.imageUrl = str3;
        this.localImageName = str4;
    }
}
