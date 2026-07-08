package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutOrder implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("local_created_at")
    public final Long localCreatedAt;

    @C09CT("name")
    public final String name;

    @C09CT("permalink_url")
    public final String permalinkUrl;

    public CheckoutOrder() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutOrder)) {
            return false;
        }
        CheckoutOrder checkoutOrder = (CheckoutOrder) obj;
        return Intrinsics.LJFF(this.id, checkoutOrder.id) && Intrinsics.LJFF(this.name, checkoutOrder.name) && Intrinsics.LJFF(this.permalinkUrl, checkoutOrder.permalinkUrl) && Intrinsics.LJFF(this.localCreatedAt, checkoutOrder.localCreatedAt);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.permalinkUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.localCreatedAt;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutOrder(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", permalinkUrl=");
        sbLIZ.append(this.permalinkUrl);
        sbLIZ.append(", localCreatedAt=");
        sbLIZ.append(this.localCreatedAt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutOrder(String str, String str2, String str3, Long l) {
        this.id = str;
        this.name = str2;
        this.permalinkUrl = str3;
        this.localCreatedAt = l;
    }
}
