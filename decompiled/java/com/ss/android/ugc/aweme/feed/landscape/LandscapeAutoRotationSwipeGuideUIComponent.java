package com.ss.android.ugc.aweme.feed.landscape;

import X.C01GW;
import X.C0SHX;
import X.C11JF;
import X.C1303280k1G;
import X.C1566140qrE;
import X.C1620050sGB;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C2531909w5;
import X.C299750Boz;
import X.C423100GiS;
import X.C452501pT;
import X.C486860J7k;
import X.C520680KbS;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C786130Usd;
import X.EnumC452301pR;
import X.InterfaceC1368705Xh;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC494301wD;
import Y.AObserverS216S0100000_12;
import Y.ARunnableS81S0200000_12;
import Y.ATListenerS446S0100000_12;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeAutoRotationServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LandscapeAutoRotationSwipeGuideUIComponent extends BasePanelUIComponent implements LandscapeAutoRotationGuideAbility, InterfaceC1554640qYg {
    public final Keva LLJIJIL = Keva.getRepo("landscape_auto_rotation");
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public SwipeUpGuideStrengthenLayout LLJILLL;
    public C1303280k1G LLJJ;
    public C423100GiS LLJJI;
    public C11JF LLJJIII;
    public C1620050sGB LLJJIJI;
    public Aweme LLJJIJIIJIL;
    public C11JF LLJJIJIL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1134834761) {
            return null;
        }
        return this;
    }

    public final IFeedPanelPlatformAbility Go() {
        return (IFeedPanelPlatformAbility) this.LLJILJIL.getValue();
    }

    public final void dismiss() {
        C1620050sGB c1620050sGB = this.LLJJIJI;
        if (c1620050sGB != null) {
            c1620050sGB.LJIIJ(false);
        }
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = this.LLJILLL;
        if (swipeUpGuideStrengthenLayout != null) {
            swipeUpGuideStrengthenLayout.animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS81S0200000_12(swipeUpGuideStrengthenLayout, this, 55)).start();
        }
    }

    public LandscapeAutoRotationSwipeGuideUIComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 484), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 14));
        }
        this.LLJILJIL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 485), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 15));
        }
        this.LLJILJILJ = c01gwLIZIZ2;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C11JF c11jf = this.LLJJIII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LLJJIJIL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        C1303280k1G c1303280k1G = this.LLJJ;
        if (c1303280k1G != null) {
            c1303280k1G.cancelAnimation();
        }
        this.LLJJ = null;
        C423100GiS c423100GiS = this.LLJJI;
        if (c423100GiS != null) {
            c423100GiS.LIZ();
        }
        this.LLJJI = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        dismiss();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeAutoRotationGuideAbility
    public final void pu() {
        dismiss();
    }

    public final void Ho(String str) {
        String strCY1;
        String aid;
        Integer numValueOf;
        String uid;
        String str2;
        String str3;
        String str4;
        User author;
        Video video;
        Aweme awemeLJIIIIZZ;
        String logPbString = null;
        if (this.LLJJIJIIJIL == null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityGo = Go();
            if (iFeedPanelPlatformAbilityGo != null) {
                awemeLJIIIIZZ = iFeedPanelPlatformAbilityGo.LJIIIIZZ();
            } else {
                awemeLJIIIIZZ = null;
            }
            this.LLJJIJIIJIL = awemeLJIIIIZZ;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityGo2 = Go();
        if (iFeedPanelPlatformAbilityGo2 != null) {
            strCY1 = iFeedPanelPlatformAbilityGo2.cY1();
        } else {
            strCY1 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", strCY1);
        Aweme aweme = this.LLJJIJIIJIL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        Aweme aweme2 = this.LLJJIJIIJIL;
        if (aweme2 != null && (video = aweme2.getVideo()) != null) {
            numValueOf = Integer.valueOf(video.getDuration());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "item_duration");
        Aweme aweme3 = this.LLJJIJIIJIL;
        if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        Aweme aweme4 = this.LLJJIJIIJIL;
        if (aweme4 != null) {
            logPbString = aweme4.getLogPbString();
        }
        c2344009Gk.LJIIIIZZ("log_pb", logPbString);
        c2344009Gk.LJIIIIZZ("guide_type", str);
        String str5 = "on";
        if (LandscapeAutoRotationServiceImpl.LJIIIIZZ().LIZLLL()) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c2344009Gk.LJIIIIZZ("app_rotate_status", str2);
        if (C2531909w5.LIZIZ) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        c2344009Gk.LJIIIIZZ("default_app_rotate_status", str3);
        if (!LandscapeAutoRotationServiceImpl.LJIIIIZZ().LJII()) {
            str5 = "off";
        }
        c2344009Gk.LJIIIIZZ("phone_rotate_status", str5);
        if (LandscapeAutoRotationServiceImpl.LJIIIIZZ().LIZJ()) {
            str4 = "user_setting";
        } else {
            str4 = "default";
        }
        c2344009Gk.LJIIIIZZ("set_method", str4);
        C20684815ws.LJIILLIIL("rotate_landscape_screen_guide_show", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        dismiss();
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
        String string = null;
        if (c19egLIZ != null) {
            this.LLJJIJI = C0SHX.LIZ(c19egLIZ, null);
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityGo = Go();
            if (iFeedPanelPlatformAbilityGo != null && (iViewPagerComponentAbilityMb2 = iFeedPanelPlatformAbilityGo.Mb()) != null) {
                iViewPagerComponentAbilityMb2.Bv0(new C786130Usd(this, 6));
            }
        }
        if (view != null && (swipeUpGuideStrengthenLayout = (SwipeUpGuideStrengthenLayout) C520680KbS.LIZ(R.id.uf3, view)) != null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityGo2 = Go();
            if (iFeedPanelPlatformAbilityGo2 != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityGo2.Mb()) != null) {
                interfaceC1368705XhRu = iViewPagerComponentAbilityMb.Ru();
            } else {
                interfaceC1368705XhRu = null;
            }
            swipeUpGuideStrengthenLayout.setViewPager(interfaceC1368705XhRu);
        } else {
            swipeUpGuideStrengthenLayout = null;
        }
        this.LLJILLL = swipeUpGuideStrengthenLayout;
        if (view != null && (textView = (TextView) C520680KbS.LIZ(R.id.tv_search_swipe_up_guide, view)) != null) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131826884);
            }
            textView.setText(string);
        }
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout2 = this.LLJILLL;
        if (swipeUpGuideStrengthenLayout2 != null) {
            swipeUpGuideStrengthenLayout2.setOnTouchListener(new ATListenerS446S0100000_12(this, 16));
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null) {
            C486860J7k.LIZIZ(c19egLIZ2).LLJILJILJ.observe(this, new AObserverS216S0100000_12(this, 46));
        }
    }
}
