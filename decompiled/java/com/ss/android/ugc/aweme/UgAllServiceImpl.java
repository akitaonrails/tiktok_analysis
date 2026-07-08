package com.ss.android.ugc.aweme;

import X.C1594160raQ;
import X.C15O7;
import X.C1618740sE4;
import X.C19308310gL;
import X.C19EG;
import X.C786410Ut5;
import Y.ACallableS149S0000000_12;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.contentlanguage.api.ContentLanguageGuideServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes25.dex */
public class UgAllServiceImpl implements IUgAllService {
    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LIZ() {
        C15O7.LIZIZ(new ACallableS149S0000000_12(1), C15O7.LJI, null);
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LIZJ() {
        C1594160raQ.LIZ.LIZIZ = false;
        ContentLanguageGuideServiceImpl.LIZ().onFeedStop();
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LJ(Context context) {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS128S0100000_28(context, 38));
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LIZLLL(Context context, Fragment fragment) {
        ContentLanguageGuideServiceImpl.LIZ().LJ(context, fragment);
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LJFF(Context context, String str) {
        C1618740sE4.LIZLLL = true;
        C19308310gL.LJII.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview/");
        smartRouteBuildRoute.withParam("url", str);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LIZIZ(C19EG c19eg, Fragment fragment, Aweme aweme) {
        ContentLanguageGuideServiceImpl.LIZ().LJI(c19eg, fragment, aweme);
    }
}
