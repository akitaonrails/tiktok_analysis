package com.ss.android.ugc.aweme.account.login.twostep.nonce;

import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse;
import com.ss.android.ugc.aweme.account.interfaces.IAccountNonceUtil;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountNonceUtilImpl implements IAccountNonceUtil {
    @Override // com.ss.android.ugc.aweme.account.interfaces.IAccountNonceUtil
    public final Object LIZ(String str, InterfaceC1364105Vn<? super GetNonceResponse> interfaceC1364105Vn) {
        return TwoStepAuthApi.LIZ.LJFF(str, interfaceC1364105Vn);
    }
}
