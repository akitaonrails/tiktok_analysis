package com.ss.android.ugc.aweme.search.common.ui.component.searchguide;

import X.AbstractC20660815t0;
import X.C01GW;
import X.C0PCY;
import X.C0PRC;
import X.C0PYD;
import X.C0PYP;
import X.C0PYR;
import X.C0PYS;
import X.C0Q3E;
import X.C0RD6;
import X.C0SHX;
import X.C0SUC;
import X.C11JF;
import X.C1303280k1G;
import X.C1391850mK7;
import X.C1566140qrE;
import X.C1620050sGB;
import X.C1668306g5;
import X.C19EG;
import X.C20656615sK;
import X.C2188811AlT;
import X.C2209401Bda;
import X.C271280AkA;
import X.C287950BQj;
import X.C299750Boz;
import X.C339190DRl;
import X.C423100GiS;
import X.C452501pT;
import X.C486860J7k;
import X.C520680KbS;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C744800TJm;
import X.C744820TJo;
import X.C786130Usd;
import X.C786410Ut5;
import X.C849850XVn;
import X.EnumC452301pR;
import X.InterfaceC1368705Xh;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC494301wD;
import Y.ARunnableS45S0300000_12;
import Y.ARunnableS81S0200000_12;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IPanelUIAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class SearchSwipeGuideUIComponent extends BasePanelUIComponent implements ISearchSwipeGuideAbility, InterfaceC1554640qYg {
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
    public boolean LLJJJ;
    public Aweme LLJJJIL;
    public C20656615sK LLJJJJ;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 150134619) {
            return null;
        }
        return this;
    }

    public final boolean Go() {
        C1620050sGB c1620050sGB;
        C1620050sGB c1620050sGB2;
        C1620050sGB c1620050sGB3;
        C1620050sGB c1620050sGB4 = this.LLJJIJIIJIL;
        return (c1620050sGB4 == null || c1620050sGB4.LJFF() || (c1620050sGB = this.LLJJIJIIJIL) == null || c1620050sGB.LIZIZ() || (c1620050sGB2 = this.LLJJIJIIJIL) == null || c1620050sGB2.LJI() || (c1620050sGB3 = this.LLJJIJIIJIL) == null || c1620050sGB3.LIZJ()) ? false : true;
    }

    public final IFeedPanelPlatformAbility Jo() {
        return (IFeedPanelPlatformAbility) this.LLJIJIL.getValue();
    }

    public SearchSwipeGuideUIComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 573), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 17));
        }
        this.LLJIJIL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 574), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 18));
        }
        this.LLJILJIL = c01gwLIZIZ2;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 572));
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
        Lo(false);
    }

    public final void Ho(C20656615sK c20656615sK) {
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = this.LLJJ;
        if (swipeUpGuideStrengthenLayout != null) {
            swipeUpGuideStrengthenLayout.animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS81S0200000_12(swipeUpGuideStrengthenLayout, this, 59)).start();
        }
        if (c20656615sK != null) {
            c20656615sK.LIZ();
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LLJILLL;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.KQ2(true);
        }
    }

    public final void Lo(boolean z) {
        C1620050sGB c1620050sGB;
        if (((Boolean) C271280AkA.LIZ.getValue()).booleanValue() && (c1620050sGB = this.LLJJIJIIJIL) != null) {
            c1620050sGB.LJIIJJI("search_swipe_up_guide", z, null);
        }
    }

    public final void No(String str) {
        C0PYD c0pyd;
        String aid;
        Integer num;
        String aid2;
        String aid3;
        C0PYR c0pyr;
        C0PYR c0pyr2;
        ISearchContextAbility iSearchContextAbilityLIZJ;
        C0PCY<C0PYD> c0pcyY30;
        Aweme awemeLJIIIIZZ;
        C0PRC c0prc = (C0PRC) C0Q3E.LJI().Ph1().LIZJ();
        Integer num2 = null;
        if (this.LLJJJIL == null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJo = Jo();
            if (iFeedPanelPlatformAbilityJo != null) {
                awemeLJIIIIZZ = iFeedPanelPlatformAbilityJo.LJIIIIZZ();
            } else {
                awemeLJIIIIZZ = null;
            }
            this.LLJJJIL = awemeLJIIIIZZ;
        }
        Aweme aweme = this.LLJJJIL;
        if (aweme != null && (iSearchContextAbilityLIZJ = C0Q3E.LIZJ(aweme)) != null && (c0pcyY30 = iSearchContextAbilityLIZJ.Y30()) != null) {
            c0pyd = (C0PYD) c0pcyY30.LIZJ();
        } else {
            c0pyd = null;
        }
        String eventType = C0SUC.LIZ(getContext()).getEventType();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rankrank aweme id = ");
        Aweme aweme2 = this.LLJJJIL;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" mobSwipeGuide: rank = ");
        if (c0pyd != null && (c0pyr2 = c0pyd.LLILLJJLI) != null) {
            num = c0pyr2.LIZJ;
        } else {
            num = null;
        }
        sbLIZ.append(num);
        C2188811AlT.LIZIZ(sbLIZ);
        C744820TJo c744820TJo = new Object() { // from class: X.0TJo
        };
        Aweme aweme3 = this.LLJJJIL;
        if (aweme3 != null) {
            aid2 = aweme3.getAid();
        } else {
            aid2 = null;
        }
        String str2 = c0prc.LLILLL;
        Aweme aweme4 = this.LLJJJIL;
        if (aweme4 != null) {
            aid3 = aweme4.getAid();
        } else {
            aid3 = null;
        }
        if (c0pyd != null && (c0pyr = c0pyd.LLILLJJLI) != null) {
            num2 = c0pyr.LIZJ;
        }
        String strValueOf = String.valueOf(num2);
        c744820TJo.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_from", eventType);
            jSONObject.put("group_id", aid2);
            jSONObject.put("search_id", str2);
            jSONObject.put("search_result_id", aid3);
            jSONObject.put("rank", strValueOf);
            AppLogNewUtils.onEventV3(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void Oo(C20656615sK c20656615sK) {
        Lo(true);
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = this.LLJJ;
        if (swipeUpGuideStrengthenLayout != null) {
            this.LLJJJ = false;
            C0PYS.LIZ.storeBoolean("has_shown_guide", true);
            C1391850mK7.LIZIZ(swipeUpGuideStrengthenLayout, "search_swipe_guide_masklayer");
            C339190DRl.LIZLLL(swipeUpGuideStrengthenLayout);
            C786410Ut5.O5(swipeUpGuideStrengthenLayout);
            swipeUpGuideStrengthenLayout.animate().alpha(1.0f).setDuration(300L).withEndAction(new ARunnableS45S0300000_12(this, swipeUpGuideStrengthenLayout, c20656615sK, 16)).start();
            No("swipe_up_guide_show");
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LLJILLL;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.KQ2(false);
        }
    }

    public final void So(int i) {
        Aweme awemeLJIIIIZZ;
        Boolean boolValueOf;
        boolean z;
        boolean z2;
        Aweme awemeLJIIIIZZ2;
        C1620050sGB c1620050sGB;
        IPanelUIAbility iPanelUIAbility;
        final DetailPageFragment detailPageFragment;
        boolean z3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryShowGuide: \nfromType = ");
        sbLIZ.append(i);
        sbLIZ.append(" \nSearchSwipeGuideHelper.runtimeCheck(panel?.getCurrentAweme()) = ");
        C0PYP c0pyp = C0PYP.LIZ;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJo = Jo();
        if (iFeedPanelPlatformAbilityJo != null) {
            awemeLJIIIIZZ = iFeedPanelPlatformAbilityJo.LJIIIIZZ();
        } else {
            awemeLJIIIIZZ = null;
        }
        c0pyp.getClass();
        sbLIZ.append(C0PYP.LIZLLL(awemeLJIIIIZZ));
        sbLIZ.append(" \nswipeUpGuide?.isVisible = ");
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = this.LLJJ;
        if (swipeUpGuideStrengthenLayout != null) {
            if (swipeUpGuideStrengthenLayout.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolValueOf = Boolean.valueOf(z3);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" \ncheckFeedDialogState = ");
        C1620050sGB c1620050sGB2 = this.LLJJIJIIJIL;
        if (c1620050sGB2 != null && !c1620050sGB2.LJ()) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" \ncheckFeedPanelState = ");
        sbLIZ.append(Go());
        sbLIZ.append(" \nhasNextFeedWithoutRequest = ");
        IPanelUIAbility iPanelUIAbility2 = (IPanelUIAbility) this.LLJILJIL.getValue();
        if (iPanelUIAbility2 != null && iPanelUIAbility2.Cy()) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(" \n");
        C2188811AlT.LIZIZ(sbLIZ);
        if (i == C287950BQj.LIZ()) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJo2 = Jo();
            if (iFeedPanelPlatformAbilityJo2 != null) {
                awemeLJIIIIZZ2 = iFeedPanelPlatformAbilityJo2.LJIIIIZZ();
            } else {
                awemeLJIIIIZZ2 = null;
            }
            if (C0PYP.LIZLLL(awemeLJIIIIZZ2)) {
                SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout2 = this.LLJJ;
                if ((swipeUpGuideStrengthenLayout2 != null && swipeUpGuideStrengthenLayout2.getVisibility() == 0) || (c1620050sGB = this.LLJJIJIIJIL) == null || c1620050sGB.LJ() || !Go() || !C0PYP.LIZJ(false) || (iPanelUIAbility = (IPanelUIAbility) this.LLJILJIL.getValue()) == null || !iPanelUIAbility.Cy()) {
                    return;
                }
                C2209401Bda c2209401Bda = C2209401Bda.LIZIZ;
                if (!c2209401Bda.LIZIZ("search_swipe_guide_masklayer")) {
                    c2209401Bda.LIZ("search_swipe_guide_masklayer");
                    return;
                }
                if (C849850XVn.LIZIZ.LIZJ().LJJ("search_swipe_guide_masklayer")) {
                    Fragment fragment = getPanelContext().LJ;
                    if (!(fragment instanceof DetailPageFragment) || (detailPageFragment = (DetailPageFragment) fragment) == null) {
                        return;
                    }
                    PopupManager.LJIJ(new AbstractC20660815t0(detailPageFragment) { // from class: X.0TJl
                        @Override // X.InterfaceC20660515sx
                        public final int getPriority() {
                            return 0;
                        }

                        @Override // X.InterfaceC20659015si
                        public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                            this.LLJJJJ = c20656615sK;
                            this.Oo(c20656615sK);
                        }
                    }, "search_swipe_guide_masklayer", new C1668306g5("new_user_search"));
                    return;
                }
                Oo(null);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        if (C287950BQj.LIZ() == 2) {
            c0rd6.LIZIZ("event_on_play_progress_change", new AwS591S0100000_12(this, 643));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TextView textView;
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        Fragment fragmentLIZLLL;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb2;
        super.onViewCreated(view);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout2 = null;
        interfaceC1368705XhRu = null;
        InterfaceC1368705Xh interfaceC1368705XhRu = null;
        swipeUpGuideStrengthenLayout2 = null;
        if (c19egLIZ != null) {
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService != null) {
                fragmentLIZLLL = iDetailFeedSafService.LIZLLL(getPanelContext().LJ);
            } else {
                fragmentLIZLLL = null;
            }
            C1620050sGB c1620050sGBLIZ = C0SHX.LIZ(c19egLIZ, fragmentLIZLLL);
            c1620050sGBLIZ.LJIIIZ("login_panel", (C744800TJm) this.LLJILJILJ.getValue());
            c1620050sGBLIZ.LJIIIZ("share_panel", (C744800TJm) this.LLJILJILJ.getValue());
            c1620050sGBLIZ.LJIIIZ("comment_panel", (C744800TJm) this.LLJILJILJ.getValue());
            c1620050sGBLIZ.LJIIIZ("permission_dialog", (C744800TJm) this.LLJILJILJ.getValue());
            this.LLJJIJIIJIL = c1620050sGBLIZ;
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJo = Jo();
            if (iFeedPanelPlatformAbilityJo != null && (iViewPagerComponentAbilityMb2 = iFeedPanelPlatformAbilityJo.Mb()) != null) {
                iViewPagerComponentAbilityMb2.Bv0(new C786130Usd(this, 10));
            }
            this.LLJILLL = C486860J7k.LIZIZ(c19egLIZ);
        }
        if (view != null && (swipeUpGuideStrengthenLayout = (SwipeUpGuideStrengthenLayout) C520680KbS.LIZ(R.id.uf3, view)) != null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJo2 = Jo();
            if (iFeedPanelPlatformAbilityJo2 != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityJo2.Mb()) != null) {
                interfaceC1368705XhRu = iViewPagerComponentAbilityMb.Ru();
            }
            swipeUpGuideStrengthenLayout.setViewPager(interfaceC1368705XhRu);
            swipeUpGuideStrengthenLayout2 = swipeUpGuideStrengthenLayout;
        }
        this.LLJJ = swipeUpGuideStrengthenLayout2;
        if (view != null && (textView = (TextView) C520680KbS.LIZ(R.id.tv_search_swipe_up_guide, view)) != null) {
            textView.setText(u.LJJIFFI(textView.getResources().getString(2131847107), "{query}", ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLIZLLLIL, false));
        }
    }
}
