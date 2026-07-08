package com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice;

import X.C0TOP;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: loaded from: classes13.dex */
public final class AdChoiceViewModel extends ViewModel {
    public final MutableLiveData<Boolean> LL = new MutableLiveData<>();
    public final MutableLiveData<Object> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<Object> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<C0TOP> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>();

    public static void vQ2(Context context, String str) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webview/");
        smartRouteBuildRoute.withParam("url", str);
        smartRouteBuildRoute.open();
    }
}
