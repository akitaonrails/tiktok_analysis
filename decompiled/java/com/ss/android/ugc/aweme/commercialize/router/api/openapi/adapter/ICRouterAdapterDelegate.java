package com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter;

import X.AbstractC1025500cnE;
import X.AbstractC1025510cnF;
import X.AbstractC1026640cp4;
import X.AbstractC1026880cpS;
import X.C1021060cg4;
import X.C1025520cnG;
import X.C1025880cnq;
import X.C1026920cpW;
import X.EnumC1025640cnS;
import X.EnumC1026700cpA;
import X.InterfaceC1021030cg1;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.BrowserConfig;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterQuickActionModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface ICRouterAdapterDelegate {
    boolean LIZ(String str);

    boolean LIZIZ();

    void LIZJ(String str, String str2, String str3, String str4);

    void LIZLLL();

    AbstractC1026880cpS LJ(C1025880cnq c1025880cnq, C1025520cnG c1025520cnG, C1021060cg4 c1021060cg4, C1026920cpW c1026920cpW);

    void LJFF(String str, String str2, String str3, String str4);

    int LJI();

    String LJII(int i, Context context, Object obj, String str);

    <T extends AbstractC1026880cpS> AbstractC1026640cp4<?> LJIIIIZZ(String str, T t);

    void LJIIIZ(Object obj);

    void LJIIJ(Object obj);

    boolean LJIIJJI(AbstractC1026880cpS abstractC1026880cpS);

    boolean LJIIL(String str);

    String LJIILIIL(int i, Object obj, String str);

    boolean LJIILJJIL(Object obj);

    void LJIILL(Intent intent, EnumC1025640cnS enumC1025640cnS);

    void LJIILLIIL(String str, String str2, String str3, CommonAdData commonAdData, Map map);

    List<InterfaceC1021030cg1> LJIIZILJ();

    int LJIJ();

    AbstractC1025510cnF LJIJI();

    boolean LJIJJ(Object obj, CRouterQuickActionModel cRouterQuickActionModel, int i, String str);

    boolean LJIJJLI(int i, Object obj, String str);

    String LJIL(Integer num);

    void LJJ(Throwable th);

    List<EnumC1026700cpA> LJJI(C1025880cnq c1025880cnq, C1025520cnG c1025520cnG);

    int LJJIFFI();

    boolean LJJII(String str, BrowserConfig browserConfig, String str2, String str3);

    void LJJIII();

    AbstractC1026880cpS LJJIIJ(C1025880cnq c1025880cnq, C1025520cnG c1025520cnG);

    void LJJIIJZLJL(int i, Object obj);

    String LJJIIZ(Integer num, String str, String str2, Long l, String str3);

    List<AbstractC1025500cnE> LJJIIZI();

    boolean LJJIJ(Context context, int i, String str, BrowserConfig browserConfig, String str2, String str3, String str4, boolean z, boolean z2, String str5);

    int LJJIJIIJI();

    AbstractC1026880cpS LJJIJIIJIL(C1025880cnq c1025880cnq, C1025520cnG c1025520cnG, C1021060cg4 c1021060cg4, C1026920cpW c1026920cpW);

    boolean LJJIJIL(Object obj);

    int LJJIJL();

    int LJJIJLIJ();
}
