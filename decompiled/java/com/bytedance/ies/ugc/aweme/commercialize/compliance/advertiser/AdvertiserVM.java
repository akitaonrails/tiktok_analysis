package com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser;

import X.C0TPL;
import X.C312690CNn;
import X.InterfaceC594300NSq;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.AdvertiserModel;

/* JADX INFO: loaded from: classes13.dex */
public final class AdvertiserVM extends ViewModel {
    public static final /* synthetic */ int LLILZ = 0;
    public final ICommercializeComplianceApi LL;
    public final MutableLiveData<Advertiser> LLILLJJLI;
    public final MutableLiveData<AdvertiserModel> LLILLL;

    public AdvertiserVM() {
        ICommercializeComplianceApi.LIZ.getClass();
        this.LL = C0TPL.LIZ();
        this.LLILLJJLI = new MutableLiveData<>();
        this.LLILLL = new MutableLiveData<>();
    }

    public final void vQ2(final AdvertiserModel advertiserModel, String str) {
        if (advertiserModel == null || C312690CNn.LIZIZ(C312690CNn.LIZ)) {
            return;
        }
        Integer advStatus = advertiserModel.getAdvStatus();
        final int i = 2;
        if (advStatus != null && advStatus.intValue() == 2) {
            i = 1;
        }
        this.LL.setAdvertiser(advertiserModel.getAdvId(), String.valueOf(i), str).enqueue(new InterfaceC594300NSq<BaseResponse>() { // from class: X.0TQA
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<BaseResponse> c0x9s, Throwable th) {
                advertiserModel.setAdvId("");
                this.LLILLL.setValue(advertiserModel);
            }

            @Override // X.InterfaceC594300NSq
            public final void onResponse(C0X9S<BaseResponse> c0x9s, C0X52<BaseResponse> c0x52) {
                if (c0x52 != null && c0x52.LIZJ()) {
                    advertiserModel.setAdvStatus(Integer.valueOf(i));
                    this.LLILLL.setValue(advertiserModel);
                } else {
                    advertiserModel.setAdvId("");
                    this.LLILLL.setValue(advertiserModel);
                }
            }
        });
    }
}
