package com.ss.android.ugc.aweme.services.autologin;

import X.C0XXD;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.IAutoLoginService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public final class AutoLoginEmptyService implements IAutoLoginService {
    public static final int $stable = 0;

    public void autoLoginUser() {
    }

    @Override // com.ss.android.ugc.aweme.IAutoLoginService
    public void cancelTimeoutFor2SVOrIDVScene() {
    }

    @Override // com.ss.android.ugc.aweme.IAutoLoginService
    public void handleLoadingDialogForAutoLogin(C0XXD c0xxd, Function1<? super Boolean, Unit> function1) {
    }

    @Override // com.ss.android.ugc.aweme.IAutoLoginService
    public void initOCLDataBeforeAutoLogin() {
    }

    @Override // com.ss.android.ugc.aweme.IAutoLoginService
    public LiveData<C0XXD> getAutoLoginState() {
        return new MutableLiveData();
    }
}
