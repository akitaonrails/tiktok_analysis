package com.ss.android.ugc.aweme;

import X.C0XXD;
import androidx.lifecycle.LiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public interface IAutoLoginService {
    void cancelTimeoutFor2SVOrIDVScene();

    LiveData<C0XXD> getAutoLoginState();

    void handleLoadingDialogForAutoLogin(C0XXD c0xxd, Function1<? super Boolean, Unit> function1);

    void initOCLDataBeforeAutoLogin();
}
