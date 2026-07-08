package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class SupplementVariant implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String _id;

    @C09CT("compare_at_price")
    public final SupplementPrice compareAtPrice;

    @C09CT("title")
    public final String title;

    public SupplementVariant() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupplementVariant)) {
            return false;
        }
        SupplementVariant supplementVariant = (SupplementVariant) obj;
        return Intrinsics.LJFF(this._id, supplementVariant._id) && Intrinsics.LJFF(this.title, supplementVariant.title) && Intrinsics.LJFF(this.compareAtPrice, supplementVariant.compareAtPrice);
    }

    public int hashCode() {
        String str = this._id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SupplementPrice supplementPrice = this.compareAtPrice;
        return iHashCode2 + (supplementPrice != null ? supplementPrice.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SupplementVariant(_id=");
        sbLIZ.append(this._id);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", compareAtPrice=");
        sbLIZ.append(this.compareAtPrice);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getId() {
        String str = this._id;
        if (str != null) {
            return a0.LJJLL('?', str, str);
        }
        return null;
    }

    public final boolean match(String str) {
        if (str != null && getId() != null) {
            return Intrinsics.LJFF(getId(), a0.LJJLL('?', str, str));
        }
        return false;
    }

    public SupplementVariant(String str, String str2, SupplementPrice supplementPrice) {
        this._id = str;
        this.title = str2;
        this.compareAtPrice = supplementPrice;
    }
}
