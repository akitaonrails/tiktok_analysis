package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UserTrustItem {

    @C09CT("chunks")
    public List<UserTrustItemDescriptionChunk> description;

    @C09CT("title")
    public String title;

    public UserTrustItem() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserTrustItem)) {
            return false;
        }
        UserTrustItem userTrustItem = (UserTrustItem) obj;
        return Intrinsics.LJFF(this.title, userTrustItem.title) && Intrinsics.LJFF(this.description, userTrustItem.description);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<UserTrustItemDescriptionChunk> list = this.description;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public UserTrustItem(String str, List<UserTrustItemDescriptionChunk> list) {
        this.title = str;
        this.description = list;
    }
}
