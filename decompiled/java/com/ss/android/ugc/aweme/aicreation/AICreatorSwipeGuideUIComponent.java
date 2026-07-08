package com.ss.android.ugc.aweme.aicreation;

import X.C01GW;
import X.C0SHX;
import X.C11JF;
import X.C1303280k1G;
import X.C1566140qrE;
import X.C1620050sGB;
import X.C19EG;
import X.C299750Boz;
import X.C423100GiS;
import X.C452501pT;
import X.C486860J7k;
import X.C520680KbS;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C744750TJh;
import X.C786130Usd;
import X.EnumC452301pR;
import X.InterfaceC1368705Xh;
import X.InterfaceC1565950qqv;
import Y.ARunnableS81S0200000_12;
import Y.ATListenerS446S0100000_12;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class AICreatorSwipeGuideUIComponent extends BasePanelUIComponent {
    public final Keva LLJIJIL = Keva.getRepo("ai_studio_setting");
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public ScrollSwitchStateManager LLJJ;
    public SwipeUpGuideStrengthenLayout LLJJI;
    public C1303280k1G LLJJIII;
    public C423100GiS LLJJIJI;
    public C11JF LLJJIJIIJIL;
    public C1620050sGB LLJJIJIL;
    public boolean LLJJJ;

    public final void dismiss() {
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = this.LLJJI;
        if (swipeUpGuideStrengthenLayout != null) {
            swipeUpGuideStrengthenLayout.animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS81S0200000_12(swipeUpGuideStrengthenLayout, this, 44)).start();
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LLJJ;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.KQ2(true);
        }
    }

    public AICreatorSwipeGuideUIComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 382), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 9));
        }
        this.LLJILJIL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 383), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 10));
        }
        this.LLJILJILJ = c01gwLIZIZ2;
        this.LLJILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 381));
        this.LLJJJ = true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C11JF c11jf = this.LLJJIJIIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1303280k1G c1303280k1G = this.LLJJIII;
        if (c1303280k1G != null) {
            c1303280k1G.cancelAnimation();
        }
        this.LLJJIII = null;
        C423100GiS c423100GiS = this.LLJJIJI;
        if (c423100GiS != null) {
            c423100GiS.LIZ();
        }
        this.LLJJIJI = null;
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
            c1620050sGBLIZ.LJIIIZ("login_panel", (C744750TJh) this.LLJILLL.getValue());
            c1620050sGBLIZ.LJIIIZ("share_panel", (C744750TJh) this.LLJILLL.getValue());
            c1620050sGBLIZ.LJIIIZ("comment_panel", (C744750TJh) this.LLJILLL.getValue());
            c1620050sGBLIZ.LJIIIZ("permission_dialog", (C744750TJh) this.LLJILLL.getValue());
            this.LLJJIJIL = c1620050sGBLIZ;
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJILJIL.getValue();
            if (iFeedPanelPlatformAbility != null && (iViewPagerComponentAbilityMb2 = iFeedPanelPlatformAbility.Mb()) != null) {
                iViewPagerComponentAbilityMb2.Bv0(new C786130Usd(this, 7));
            }
            this.LLJJ = C486860J7k.LIZIZ(c19egLIZ);
        }
        if (view != null && (swipeUpGuideStrengthenLayout = (SwipeUpGuideStrengthenLayout) C520680KbS.LIZ(R.id.uf3, view)) != null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LLJILJIL.getValue();
            if (iFeedPanelPlatformAbility2 != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility2.Mb()) != null) {
                interfaceC1368705XhRu = iViewPagerComponentAbilityMb.Ru();
            }
            swipeUpGuideStrengthenLayout.setViewPager(interfaceC1368705XhRu);
            swipeUpGuideStrengthenLayout2 = swipeUpGuideStrengthenLayout;
        }
        this.LLJJI = swipeUpGuideStrengthenLayout2;
        if (view != null) {
            C520680KbS.LIZ(R.id.tv_search_swipe_up_guide, view);
        }
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout3 = this.LLJJI;
        if (swipeUpGuideStrengthenLayout3 != null) {
            swipeUpGuideStrengthenLayout3.setOnTouchListener(new ATListenerS446S0100000_12(this, 15));
        }
    }
}
