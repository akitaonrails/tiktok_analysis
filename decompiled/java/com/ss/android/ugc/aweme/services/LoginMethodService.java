package com.ss.android.ugc.aweme.services;

import X.C0XQ5;
import X.C0XUE;
import X.C0XUQ;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;

/* JADX INFO: loaded from: classes14.dex */
public final class LoginMethodService implements C0XUQ {
    public static final int $stable = 0;

    @Override // X.C0XUQ
    public String getLatestLoginMethodName() {
        BaseLoginMethod baseLoginMethodLIZLLL = C0XUE.LIZ.LIZLLL();
        return baseLoginMethodLIZLLL instanceof TPLoginMethod ? ((TPLoginMethod) baseLoginMethodLIZLLL).getPlatform() : baseLoginMethodLIZLLL.getLoginMethodName().name();
    }

    @Override // X.C0XUQ
    public void updateMethodInfo(String str, Object... objArr) {
        SignificantUserInfo significantUserInfo;
        int iHashCode = str.hashCode();
        if (iHashCode != -573632447) {
            if (iHashCode != 2043348218) {
                if (iHashCode == 2096788723 && str.equals("update_last_active_time") && objArr.length >= 2) {
                    C0XUE.LIZ.LJIIJJI(((Long) objArr[1]).longValue(), (String) objArr[0]);
                    return;
                }
                return;
            }
            if (!str.equals("update_significan_user_info") || objArr.length == 0) {
                return;
            }
            C0XUE c0xue = C0XUE.LIZ;
            Object obj = objArr[1];
            if (obj instanceof SignificantUserInfo) {
                significantUserInfo = (SignificantUserInfo) obj;
            } else {
                significantUserInfo = null;
            }
            c0xue.LJIILL(significantUserInfo);
            return;
        }
        if (!str.equals("update_name") || objArr.length == 0) {
            return;
        }
        C0XUE.LIZ.LJIILIIL(C0XQ5.LIZLLL(), (String) objArr[0]);
    }
}
