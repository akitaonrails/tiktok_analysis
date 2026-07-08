package com.ss.android.ugc.aweme.mix.services;

import X.C1169150gWv;
import X.C1169270gX7;
import X.C1169380gXI;
import X.C1258160iqU;
import X.C1445910njJ;
import X.C653630PkP;
import X.InterfaceC1167780gUi;
import X.InterfaceC1167830gUn;
import X.InterfaceC718610SGt;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.bottom.MixBottomBarVM;
import com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public interface IMixFeedService {
    boolean LIZ(Aweme aweme);

    boolean LIZIZ();

    void LIZJ();

    void LIZLLL(boolean z);

    void LJ();

    void LJFF(Activity activity, IAVMixFeedServiceImpl.AnonymousClass1 anonymousClass1, String str, String str2, String str3, String str4);

    boolean LJI(Aweme aweme);

    C1445910njJ LJII();

    void LJIIIIZZ(String str, String str2, C1258160iqU c1258160iqU);

    C1169380gXI LJIIIZ(ViewGroup viewGroup, boolean z, boolean z2, String str, C653630PkP c653630PkP);

    Integer LJIIJ();

    void LJIIJJI(String str, String str2, String str3, String str4, C1169150gWv c1169150gWv, Integer num, Integer num2, Integer num3);

    void LJIIL(Context context, Bundle bundle, String str, String str2, Long l, String str3, UrlModel urlModel);

    void LJIILIIL(String str, String str2, String str3, String str4, float f, String str5, C1169150gWv c1169150gWv, Integer num, Integer num2, Integer num3);

    boolean LJIILJJIL();

    void LJIILL(String str, String str2, String str3, String str4, String str5, C1169150gWv c1169150gWv, Integer num, String str6, String str7, String str8);

    void LJIILLIIL(String str, int i, int i2, String str2, String str3, String str4, String str5);

    void LJIIZILJ(Context context, String str, String str2, String str3, int i, String str4, Boolean bool);

    void LJIJ(Context context, String str, Aweme aweme, String str2, String str3, String str4, String str5, String str6, boolean z, C1169150gWv c1169150gWv, String str7, Boolean bool, String str8);

    void LJIJI(Context context, Bundle bundle);

    TuxSheet LJIJJ(Context context, String str, String str2, Aweme aweme, String str3, C1169150gWv c1169150gWv, Function0 function0, String str4);

    void LJIJJLI(Activity activity, Aweme aweme, String str, String str2, String str3, String str4);

    MixBottomBarVM LJIL(InteractPlayListBottomBarAssem interactPlayListBottomBarAssem);

    void LJJ();

    void LJJI(boolean z);

    void LJJIFFI(CreatorToolsActivity creatorToolsActivity, String str, String str2);

    void LJJII();

    void LJJIII(Activity activity, Aweme aweme, InterfaceC1167780gUi interfaceC1167780gUi, String str, String str2);

    void LJJIIJ(Context context, Bundle bundle, int i, String str, String str2);

    void LJJIIJZLJL(InterfaceC1167830gUn interfaceC1167830gUn);

    void LJJIIZ(Context context, Aweme aweme, C1169150gWv c1169150gWv, Float f, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2);

    void LJJIIZI(Context context);

    void LJJIJ();

    void LJJIJIIJI(int i, String str, String str2, String str3, String str4, long j, String str5, String str6);

    C1169270gX7 LJJIJIIJIL(AssemViewModel assemViewModel);

    Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, InterfaceC718610SGt> LJJIJIL(Object obj);

    boolean LJJIJL(Aweme aweme);

    boolean getPushLiveState();

    boolean needCreateFirstMix();

    boolean needShowAddOrRemoveButton();
}
