package com.ss.android.ugc.aweme.services;

import X.C09UU;
import X.C0XTR;
import X.C11U6;
import X.C1238990iLZ;
import X.ExecutorC1412805fy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes36.dex */
public class ProAccountService extends BaseProAccountService {
    @Override // com.ss.android.ugc.aweme.services.BaseProAccountService, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseProAccountService, X.C0XTX
    public void quitBusinessAccount(final C0XTR c0xtr) {
        super.quitBusinessAccount(c0xtr);
        C09UU.LIZ(C1238990iLZ.LIZIZ.LIZ(), new C11U6<BaseResponse>() { // from class: com.ss.android.ugc.aweme.services.ProAccountService.3
            @Override // X.C11U6
            public void onFailure(Throwable th) {
                C0XTR c0xtr2 = c0xtr;
                if (c0xtr2 == null) {
                    return;
                }
                c0xtr2.onResult(14, 3, null);
            }

            @Override // X.C11U6
            public void onSuccess(BaseResponse baseResponse) {
                C0XTR c0xtr2 = c0xtr;
                if (c0xtr2 == null) {
                    return;
                }
                if (baseResponse != null && baseResponse.status_code == 0) {
                    c0xtr2.onResult(14, 1, null);
                } else {
                    c0xtr2.onResult(14, 3, null);
                }
            }
        }, ExecutorC1412805fy.LLILLJJLI);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseProAccountService
    public void switchBusinessAccount(String str, final C0XTR c0xtr) {
        super.switchBusinessAccount(str, c0xtr);
        C09UU.LIZ(C1238990iLZ.LIZIZ.LIZLLL(str), new C11U6<BaseResponse>() { // from class: com.ss.android.ugc.aweme.services.ProAccountService.2
            @Override // X.C11U6
            public void onFailure(Throwable th) {
                C0XTR c0xtr2 = c0xtr;
                if (c0xtr2 == null) {
                    return;
                }
                c0xtr2.onResult(14, 3, null);
            }

            @Override // X.C11U6
            public void onSuccess(BaseResponse baseResponse) {
                C0XTR c0xtr2 = c0xtr;
                if (c0xtr2 == null) {
                    return;
                }
                if (baseResponse != null && baseResponse.status_code == 0) {
                    c0xtr2.onResult(14, 1, null);
                } else {
                    c0xtr2.onResult(14, 3, null);
                }
            }
        }, ExecutorC1412805fy.LLILLJJLI);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseProAccountService, X.C0XTX
    public void switchProAccount(int i, String str, String str2, int i2, final C0XTR c0xtr) {
        super.switchProAccount(i, str, str2, i2, c0xtr);
        C09UU.LIZ(C1238990iLZ.LIZIZ.LIZJ(i, str, str2, i2), new C11U6<BaseResponse>() { // from class: com.ss.android.ugc.aweme.services.ProAccountService.1
            @Override // X.C11U6
            public void onFailure(Throwable th) {
                C0XTR c0xtr2 = c0xtr;
                if (c0xtr2 == null) {
                    return;
                }
                c0xtr2.onResult(14, 3, null);
            }

            @Override // X.C11U6
            public void onSuccess(BaseResponse baseResponse) {
                C0XTR c0xtr2 = c0xtr;
                if (c0xtr2 == null) {
                    return;
                }
                if (baseResponse != null && baseResponse.status_code == 0) {
                    c0xtr2.onResult(14, 1, null);
                } else {
                    c0xtr2.onResult(14, 3, null);
                }
            }
        }, ExecutorC1412805fy.LLILLJJLI);
    }
}
