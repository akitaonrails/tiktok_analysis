package com.ss.android.ugc.aweme.friends.model;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendContact extends User {
    public final Integer type;

    public RecommendContact() {
        this(0);
    }

    public final RecommendContact copy(Integer num) {
        return new RecommendContact(num);
    }

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendContact) && Intrinsics.LJFF(this.type, ((RecommendContact) obj).type);
    }

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public int hashCode() {
        Integer num = this.type;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendContact(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getType() {
        return this.type;
    }

    public RecommendContact(Integer num) {
        this.type = num;
    }
}
