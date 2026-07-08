package com.ss.android.ugc.aweme.ecommerce.mall.service;

import X.AbstractC738140SxQ;
import X.C03H5;
import X.C0CCZ;
import X.C13IQ;
import X.C1740600vOc;
import X.C1770080wAA;
import X.C19EG;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.mall.service.searchentrance.ECMiddleEntranceData;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public interface IECommerceMallService {
    Object LIZIZ();

    void LIZJ();

    boolean LIZLLL();

    TuxIconView LJ(C19EG c19eg);

    C0CCZ LJFF();

    Uri LJI(String str, String str2, Number number, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10);

    PriorityProtocol LJII();

    String LJIIIIZZ();

    C13IQ<? extends AbstractC738140SxQ> LJIIIZ();

    boolean LJIIJ();

    C0CCZ LJIIJJI();

    View LJIIL(C19EG c19eg);

    ReusedUIContentAssem<? extends C03H5> LJIILIIL();

    boolean LJIILJJIL();

    boolean LJIILL();

    int LJIILLIIL(Integer num);

    void LJIIZILJ(boolean z);

    boolean LJIJ();

    C1740600vOc LJIJI(Fragment fragment);

    void LJIJJ();

    List<IInterceptor> LJIJJLI();

    Object LJIL();

    void LJJ(Context context, ECMiddleEntranceData eCMiddleEntranceData, C1740600vOc c1740600vOc);

    Object LJJI();

    String LJJIFFI();

    boolean hitTopTabExpExperiment();

    void onAnchorPanelClose(C1770080wAA c1770080wAA);

    void onAnchorPanelOpen(C1770080wAA c1770080wAA);

    void onEcOrderSubmit();

    boolean shouldShowMall2TabOrTopTab();

    boolean shouldShowMallTab();

    boolean shouldShowMallTopTab();
}
