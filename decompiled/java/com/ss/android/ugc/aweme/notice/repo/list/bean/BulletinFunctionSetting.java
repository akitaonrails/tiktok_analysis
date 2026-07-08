package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinFunctionSetting {

    @C09CT("function_type")
    public final int functionType;

    @C09CT("name")
    public final String name;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    public BulletinFunctionSetting() {
        this(-1, null, -1);
    }

    public final BulletinFunctionSetting copy(int i, String str, int i2) {
        return new BulletinFunctionSetting(i, str, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinFunctionSetting)) {
            return false;
        }
        BulletinFunctionSetting bulletinFunctionSetting = (BulletinFunctionSetting) obj;
        return this.functionType == bulletinFunctionSetting.functionType && Intrinsics.LJFF(this.name, bulletinFunctionSetting.name) && this.status == bulletinFunctionSetting.status;
    }

    public int hashCode() {
        int i = this.functionType * 31;
        String str = this.name;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.status;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinFunctionSetting(functionType=");
        sbLIZ.append(this.functionType);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinFunctionSetting(int i, String str, int i2) {
        this.functionType = i;
        this.name = str;
        this.status = i2;
    }
}
