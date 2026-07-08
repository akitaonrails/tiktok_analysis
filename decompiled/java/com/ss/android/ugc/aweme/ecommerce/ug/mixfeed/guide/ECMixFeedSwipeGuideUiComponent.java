package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.guide;

import X.AnonymousClass0956;
import X.C01GW;
import X.C1303280k1G;
import X.C1566140qrE;
import X.C1576470r7t;
import X.C1620830sHR;
import X.C1768000w6o;
import X.C19EG;
import X.C2189821An6;
import X.C299750Boz;
import X.C452501pT;
import X.C486860J7k;
import X.C520680KbS;
import X.C630740Ooa;
import X.C724240Sb0;
import X.EnumC452301pR;
import X.InterfaceC1368705Xh;
import X.InterfaceC1565950qqv;
import Y.ARunnableS93S0200000_24;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes25.dex */
public class ECMixFeedSwipeGuideUiComponent extends BasePanelUIComponent {
    public final C01GW LLJIJIL;
    public ScrollSwitchStateManager LLJILJIL;
    public SwipeUpGuideStrengthenLayout LLJILJILJ;
    public C1303280k1G LLJILLL;
    public boolean LLJJ;
    public Aweme LLJJI;
    public AnonymousClass0956 LLJJIII;
    public final int LLJJIJI;

    public final void dismiss() {
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = this.LLJILJILJ;
        if (swipeUpGuideStrengthenLayout != null) {
            swipeUpGuideStrengthenLayout.animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS93S0200000_24(this, swipeUpGuideStrengthenLayout, 6)).start();
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LLJILJIL;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.KQ2(true);
        }
    }

    public ECMixFeedSwipeGuideUiComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 349), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 0));
        }
        this.LLJIJIL = c01gwLIZIZ;
        this.LLJJ = true;
        this.LLJJIJI = 2131849403;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1303280k1G c1303280k1G = this.LLJILLL;
        if (c1303280k1G != null) {
            c1303280k1G.cancelAnimation();
        }
        this.LLJILLL = null;
    }

    public final void Go(String str) {
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            C1576470r7t.LIZ.getClass();
            Map mapLIZ = C1576470r7t.LIZ(c2189821An6);
            ((HashMap) mapLIZ).put("disappear_type", str);
            C1768000w6o.LIZ.getClass();
            C1768000w6o.LIZIZ("tiktokec_guide_disappear", mapLIZ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout;
        TextView textView;
        InterfaceC1368705Xh interfaceC1368705XhRu;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb2;
        super.onViewCreated(view);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJIJIL.getValue();
            if (iFeedPanelPlatformAbility != null && (iViewPagerComponentAbilityMb2 = iFeedPanelPlatformAbility.Mb()) != null) {
                iViewPagerComponentAbilityMb2.Bv0(new C1620830sHR(this, 13));
            }
            this.LLJILJIL = C486860J7k.LIZIZ(c19egLIZ);
        }
        String string = null;
        if (view != null && (swipeUpGuideStrengthenLayout = (SwipeUpGuideStrengthenLayout) C520680KbS.LIZ(R.id.uf3, view)) != null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LLJIJIL.getValue();
            if (iFeedPanelPlatformAbility2 != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility2.Mb()) != null) {
                interfaceC1368705XhRu = iViewPagerComponentAbilityMb.Ru();
            } else {
                interfaceC1368705XhRu = null;
            }
            swipeUpGuideStrengthenLayout.setViewPager(interfaceC1368705XhRu);
            swipeUpGuideStrengthenLayout.setFallBackRunnable(new AwS601S0100000_22(this, 653));
        } else {
            swipeUpGuideStrengthenLayout = null;
        }
        this.LLJILJILJ = swipeUpGuideStrengthenLayout;
        if (view != null && (textView = (TextView) C520680KbS.LIZ(R.id.tv_search_swipe_up_guide, view)) != null) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(this.LLJJIJI);
            }
            textView.setText(string);
        }
    }
}
