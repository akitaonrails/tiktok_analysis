package com.ss.android.ugc.aweme.tako.detail.guide;

import X.C01GW;
import X.C0Q3E;
import X.C0SHX;
import X.C0SUC;
import X.C11JF;
import X.C1303280k1G;
import X.C1566140qrE;
import X.C1620050sGB;
import X.C1862330yYx;
import X.C19EG;
import X.C20235014Fo;
import X.C2097608Jq;
import X.C299750Boz;
import X.C423100GiS;
import X.C452501pT;
import X.C486860J7k;
import X.C520680KbS;
import X.C597050NbL;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C744770TJj;
import X.C786130Usd;
import X.EnumC452301pR;
import X.InterfaceC1368705Xh;
import X.InterfaceC1565950qqv;
import Y.ARunnableS81S0200000_12;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class TakoSwipeGuideUIComponent extends BasePanelUIComponent {
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public ScrollSwitchStateManager LLJILLL;
    public SwipeUpGuideStrengthenLayout LLJJ;
    public C1303280k1G LLJJI;
    public C423100GiS LLJJIII;
    public C11JF LLJJIJI;
    public C1620050sGB LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public Aweme LLJJJ;

    public final boolean Go() {
        C1620050sGB c1620050sGB;
        C1620050sGB c1620050sGB2;
        C1620050sGB c1620050sGB3 = this.LLJJIJIIJIL;
        return (c1620050sGB3 == null || c1620050sGB3.LJFF() || (c1620050sGB = this.LLJJIJIIJIL) == null || c1620050sGB.LIZIZ() || (c1620050sGB2 = this.LLJJIJIIJIL) == null || c1620050sGB2.LIZJ()) ? false : true;
    }

    public final void dismiss() {
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = this.LLJJ;
        if (swipeUpGuideStrengthenLayout != null) {
            swipeUpGuideStrengthenLayout.animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS81S0200000_12(swipeUpGuideStrengthenLayout, this, 63)).start();
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LLJILLL;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.KQ2(true);
        }
    }

    public TakoSwipeGuideUIComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 620), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 20));
        }
        this.LLJIJIL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 621), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 21));
        }
        this.LLJILJIL = c01gwLIZIZ2;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 619));
        this.LLJJIJIL = true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C11JF c11jf = this.LLJJIJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1303280k1G c1303280k1G = this.LLJJI;
        if (c1303280k1G != null) {
            c1303280k1G.cancelAnimation();
        }
        this.LLJJI = null;
        C423100GiS c423100GiS = this.LLJJIII;
        if (c423100GiS != null) {
            c423100GiS.LIZ();
        }
        this.LLJJIII = null;
    }

    public final void Ho(String str) {
        String aid;
        Aweme awemeLJIIIIZZ;
        C0Q3E.LJI().Ph1().LIZJ();
        Integer numValueOf = null;
        if (this.LLJJJ == null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJIJIL.getValue();
            if (iFeedPanelPlatformAbility != null) {
                awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ();
            } else {
                awemeLJIIIIZZ = null;
            }
            this.LLJJJ = awemeLJIIIIZZ;
        }
        String eventType = C0SUC.LIZ(getContext()).getEventType();
        String searchId = C0SUC.LIZ(getContext()).getSearchId();
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        Aweme aweme = this.LLJJJ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme aweme2 = this.LLJJJ;
        if (aweme2 != null) {
            numValueOf = Integer.valueOf(AwemeBizExtKt.getRank(aweme2));
        }
        String strValueOf = String.valueOf(numValueOf);
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ(str, C2097608Jq.LJIIIIZZ(new Pair("enter_from", eventType), new Pair("group_id", aid), new Pair("search_id", searchId), new Pair("rank", strValueOf)));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb2;
        super.onViewCreated(view);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout2 = null;
        interfaceC1368705XhRu = null;
        InterfaceC1368705Xh interfaceC1368705XhRu = null;
        swipeUpGuideStrengthenLayout2 = null;
        if (c19egLIZ != null) {
            C1620050sGB c1620050sGBLIZ = C0SHX.LIZ(c19egLIZ, null);
            c1620050sGBLIZ.LJIIIZ("login_panel", (C744770TJj) this.LLJILJILJ.getValue());
            c1620050sGBLIZ.LJIIIZ("share_panel", (C744770TJj) this.LLJILJILJ.getValue());
            c1620050sGBLIZ.LJIIIZ("comment_panel", (C744770TJj) this.LLJILJILJ.getValue());
            c1620050sGBLIZ.LJIIIZ("permission_dialog", (C744770TJj) this.LLJILJILJ.getValue());
            this.LLJJIJIIJIL = c1620050sGBLIZ;
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJIJIL.getValue();
            if (iFeedPanelPlatformAbility != null && (iViewPagerComponentAbilityMb2 = iFeedPanelPlatformAbility.Mb()) != null) {
                iViewPagerComponentAbilityMb2.Bv0(new C786130Usd(this, 8));
            }
            this.LLJILLL = C486860J7k.LIZIZ(c19egLIZ);
        }
        if (view != null && (swipeUpGuideStrengthenLayout = (SwipeUpGuideStrengthenLayout) C520680KbS.LIZ(R.id.uf3, view)) != null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LLJIJIL.getValue();
            if (iFeedPanelPlatformAbility2 != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility2.Mb()) != null) {
                interfaceC1368705XhRu = iViewPagerComponentAbilityMb.Ru();
            }
            swipeUpGuideStrengthenLayout.setViewPager(interfaceC1368705XhRu);
            swipeUpGuideStrengthenLayout2 = swipeUpGuideStrengthenLayout;
        }
        this.LLJJ = swipeUpGuideStrengthenLayout2;
        if (view != null) {
            C520680KbS.LIZ(R.id.tv_search_swipe_up_guide, view);
        }
    }
}
