package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinItemBottomStruct {

    @C09CT("bottom_tip")
    public final String bottomTip;

    public BulletinItemBottomStruct() {
        this(null);
    }

    public final int hashCode() {
        String str = this.bottomTip;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinItemBottomStruct(bottomTip=");
        sbLIZ.append(this.bottomTip);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinItemBottomStruct(String str) {
        this.bottomTip = str;
    }
}
