package com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty;

import X.C0TPL;
import X.C312690CNn;
import X.C786260Usq;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;

/* JADX INFO: loaded from: classes13.dex */
public final class ThirdPartyVM extends ViewModel {
    public static final /* synthetic */ int LLILZ = 0;
    public final ICommercializeComplianceApi LL;
    public final MutableLiveData<ThirdPartyAdvertiserList> LLILLJJLI;
    public final MutableLiveData<ThirdPartySetAdvertiserStatusResponse> LLILLL;

    public ThirdPartyVM() {
        ICommercializeComplianceApi.LIZ.getClass();
        this.LL = C0TPL.LIZ();
        this.LLILLJJLI = new MutableLiveData<>();
        this.LLILLL = new MutableLiveData<>();
    }

    public final void vQ2(int i, int i2) {
        if (C312690CNn.LIZIZ(C312690CNn.LIZ)) {
            return;
        }
        this.LL.get3PAdvertiserList(Integer.valueOf(i), Integer.valueOf(i2)).enqueue(new C786260Usq(this, 5));
    }
}
