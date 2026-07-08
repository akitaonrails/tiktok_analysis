package com.ss.android.ugc.aweme.feed.panel;

import X.C0N0Y;
import X.C0SZ8;
import X.InterfaceC581390MrB;
import X.InterfaceC581430MrF;
import X.InterfaceC581700Mrg;
import X.InterfaceC707080RoQ;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes10.dex */
public interface IBaseListFragmentPanel extends InterfaceC581430MrF, IFeedMobParamsProvider, InterfaceC581700Mrg, InterfaceC581390MrB {
    IFeedPanelPlatformAbility Ak2();

    boolean GY();

    void Jl1(int i, Aweme aweme);

    void LJJIJIIJI(String str);

    C0SZ8 LJLIL();

    void LJLLI(String str);

    VerticalViewPager LLLIIIIL();

    Aweme LLLLLJLJLL();

    void PN();

    void UJ2();

    void XK0();

    String Zc();

    boolean ge0(boolean z);

    C0N0Y getPlayerManager();

    boolean iB();

    void jB0();

    void nk2(int i);

    void o6(boolean z);

    void onPlaying(String str);

    void onPreparePlay(String str);

    void pK2();

    String ro0(Aweme aweme);

    InterfaceC707080RoQ un();
}
