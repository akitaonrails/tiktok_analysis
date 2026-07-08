package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BulletinAwemeIsShared extends BaseResponse {

    @C09CT("is_duplicate")
    public final Boolean isShared;

    public final BulletinAwemeIsShared copy(Boolean bool) {
        return new BulletinAwemeIsShared(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BulletinAwemeIsShared) && Intrinsics.LJFF(this.isShared, ((BulletinAwemeIsShared) obj).isShared);
    }

    public int hashCode() {
        Boolean bool = this.isShared;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinAwemeIsShared(isShared=");
        sbLIZ.append(this.isShared);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isShared() {
        return this.isShared;
    }

    public BulletinAwemeIsShared(Boolean bool) {
        this.isShared = bool;
    }
}
