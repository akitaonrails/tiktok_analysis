package com.bytedance.ies.ugc.aweme.commercialize.splash.service;

import X.C0TT1;
import X.C1002190cBd;
import X.C1018290cbb;
import X.C1030980cw4;
import X.C1031080cwE;
import X.C19EG;
import X.C19GS;
import X.InterfaceC1023590ck9;
import X.InterfaceC1023650ckF;
import X.InterfaceC1028550cs9;
import X.InterfaceC1294060jmO;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.splash.SplashAdManagerPreloadTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.RealTimeSplashTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.SplashBgInflate;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadJsonTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadTask;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface ISplashAdService {
    SplashBgInflate LIZ();

    void LIZIZ(Context context, String str);

    Integer LIZJ();

    void LIZLLL(boolean z);

    boolean LJ();

    C1018290cbb LJFF(C19EG c19eg);

    void LJI();

    Drawable LJII(Context context);

    void LJIIIIZZ(Context context, Aweme aweme);

    View LJIIIZ(ViewGroup viewGroup, Fragment fragment);

    void LJIIJ(C1030980cw4 c1030980cw4);

    void LJIIJJI(int i, String str, String str2, boolean z);

    void LJIIL(C1031080cwE c1031080cwE);

    boolean LJIILIIL();

    Aweme LJIILJJIL(String str);

    void LJIILL();

    @InterfaceC1294060jmO
    void LJIILLIIL();

    TopViewAdEventLogger LJIIZILJ(Aweme aweme);

    @InterfaceC1294060jmO
    void LJIJ();

    void LJIJI();

    @InterfaceC1294060jmO
    void LJIJJ(Context context, List<? extends Aweme> list);

    void LJIJJLI();

    RealTimeSplashTask LJIL();

    Integer LJJ();

    void LJJI(InterfaceC1023590ck9 interfaceC1023590ck9);

    boolean LJJIFFI(C19GS c19gs);

    void LJJII(InterfaceC1028550cs9 interfaceC1028550cs9);

    Map<InterfaceC1023650ckF<Long, Long>, Long> LJJIII();

    void LJJIIJ();

    void LJJIIJZLJL(C1002190cBd c1002190cBd, long j);

    void LJJIIZ(Aweme aweme);

    void LJJIIZI();

    void LJJIJ();

    View LJJIJIIJI(View view);

    int LJJIJIIJIL();

    boolean LJJIJIL();

    TopViewPreloadTask LJJIJL(List list);

    TopViewPreloadJsonTask LJJIJLIJ();

    SplashAdManagerPreloadTask LJJIL();

    C0TT1 LJJIZ();

    String LJJJ();

    void LJJJI(C19EG c19eg);
}
