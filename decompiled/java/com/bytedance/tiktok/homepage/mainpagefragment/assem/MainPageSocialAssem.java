package com.bytedance.tiktok.homepage.mainpagefragment.assem;

import X.C019F;
import X.C01GW;
import X.C08TN;
import X.C09R3;
import X.C0HWW;
import X.C0HZE;
import X.C0PEM;
import X.C0QSJ;
import X.C0S78;
import X.C1073600e2o;
import X.C1076010e6h;
import X.C1255230ill;
import X.C1264600j0s;
import X.C1264640j0w;
import X.C1265720j2g;
import X.C128Y;
import X.C13LE;
import X.C14EU;
import X.C1590130rTv;
import X.C1590140rTw;
import X.C1590150rTx;
import X.C1590160rTy;
import X.C1590170rTz;
import X.C1590180rU0;
import X.C1590190rU1;
import X.C1590200rU2;
import X.C1590210rU3;
import X.C1608090rwt;
import X.C1618440sDa;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C267410Adv;
import X.C435330H5f;
import X.C442830HYb;
import X.C446400Hew;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC1074380e44;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1564520qoc;
import X.InterfaceC1566480qrm;
import X.InterfaceC1570670qyX;
import X.InterfaceC1577930rAF;
import X.InterfaceC1582030rGr;
import X.InterfaceC1593630rZZ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainpagefragment.SocialAvatarIconFlipPrerequisiteViewModel;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageSocialAbility;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.profile.ui.ability.IProfileBottomTabService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.scope.MainPageFragmentScope;
import com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class MainPageSocialAssem extends BaseMainPageFragmentUIAssem implements MainPageSocialAbility, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public C1590130rTv LLJ;
    public InterfaceC1074380e44 LLJI;
    public final MainPageSocialAssem LLJIJIL = this;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C1590180rU0(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C1590170rTz(this));
    public final AssemVMLazy LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C630740Ooa LLJJIJI;
    public volatile HomeTabAbility LLJJIJIIJIL;
    public InterfaceC665370Q7z LLJJIJIL;
    public C0QSJ LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MainPageSocialAssem.class, "socialAvatarIconFlipViewModel", "getSocialAvatarIconFlipViewModel()Lcom/bytedance/tiktok/homepage/mainpagefragment/SocialAvatarIconFlipPrerequisiteViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MainPageSocialAssem.class, "homeTabAbilityByDI", "getHomeTabAbilityByDI()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MainPageSocialAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SocialAvatarIconFlipPrerequisiteViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new C1265720j2g(c19719912DlLIZ), new C1590210rU3(), null, true);
        this.LLJJ = C452501pT.LIZIZ(new C1264640j0w());
        this.LLJJI = C452501pT.LIZIZ(new C1590160rTy(this));
        this.LLJJIII = C452501pT.LIZIZ(new C1590200rU2());
        this.LLJJIJI = C628500Oky.LIZ(new C1590140rTw(this));
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -825782664) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility Go() {
        /*
            r4 = this;
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r4.LLJJIJIIJIL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r4.LLJJIJIIJIL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJJ     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJIJIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJJ = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility> r0 = com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJIJIIJIL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSocialAssem.Go():com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility");
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageSocialAbility
    public final String oR0() {
        BaseScrollSwitchStateManager baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) this.LLJILJIL.getValue();
        C128Y c128yVQ2 = baseScrollSwitchStateManager != null ? baseScrollSwitchStateManager.vQ2() : null;
        if (!(c128yVQ2 instanceof InterfaceC1593630rZZ)) {
            return null;
        }
        InterfaceC1593630rZZ interfaceC1593630rZZ = (InterfaceC1593630rZZ) c128yVQ2;
        FeedFragment feedFragmentUx = interfaceC1593630rZZ.ux();
        if (feedFragmentUx instanceof InterfaceC1570670qyX) {
            return "homepage_follow";
        }
        if (feedFragmentUx instanceof InterfaceC1566480qrm) {
            return "homepage_hot";
        }
        if (feedFragmentUx instanceof InterfaceC1564520qoc) {
            return "homepage_friends";
        }
        if (feedFragmentUx instanceof InterfaceC1582030rGr) {
            return "homepage_nearby";
        }
        if (!(feedFragmentUx instanceof InterfaceC1577930rAF)) {
            return null;
        }
        FeedFragment feedFragmentUx2 = interfaceC1593630rZZ.ux();
        if (!(feedFragmentUx2 instanceof FeedFragment) || feedFragmentUx2 == null) {
            return null;
        }
        return feedFragmentUx2.LLILLJJLI;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        StoryMainTrackService storyMainTrackServiceLJJIJIIJI = C1618440sDa.LIZIZ.LJJIJIIJI();
        if (storyMainTrackServiceLJJIJIIJI != null) {
            storyMainTrackServiceLJJIJIIJI.LIZ(C724240Sb0.LIZ(this), (HomeTabAbility) this.LLJJIJI.getValue());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        InterfaceC1074380e44 interfaceC1074380e44 = this.LLJI;
        if (interfaceC1074380e44 != null) {
            interfaceC1074380e44.onDestroyView();
        }
        StoryMainTrackService storyMainTrackServiceLJJIJIIJI = C1618440sDa.LIZIZ.LJJIJIIJI();
        if (storyMainTrackServiceLJJIJIIJI != null) {
            storyMainTrackServiceLJJIJIIJI.onDestroy();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (C435330H5f.LIZ() || ((Boolean) C267410Adv.LIZ.getValue()).booleanValue()) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C446400Hew(this, null), 3);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainPageFragmentScope.class}).unbindAbility(this.LLJIJIL, MainPageSocialAbility.class);
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onProfileTabClicked(C1255230ill c1255230ill) {
        IProfileBottomTabService iProfileBottomTabService;
        Context context = getContext();
        if (context != null && (iProfileBottomTabService = (IProfileBottomTabService) this.LLJJ.getValue()) != null && iProfileBottomTabService.LIZ() && ((SocialAvatarAccess) this.LLJJIII.getValue()).LIZLLL() && C0HZE.LIZIZ.LJIIIIZZ()) {
            IProfileBottomTabService iProfileBottomTabService2 = (IProfileBottomTabService) this.LLJJ.getValue();
            if (iProfileBottomTabService2 != null) {
                iProfileBottomTabService2.LIZIZ(context, false);
            }
            C0HWW.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("action_type", "click");
            C20684815ws.LJIILLIIL("show_profile_icon_flipped", c2344009Gk.LIZ);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onShowSocialRecFriendsDialogEvent(C1073600e2o c1073600e2o) {
        InterfaceC1074380e44 interfaceC1074380e44 = this.LLJI;
        if (interfaceC1074380e44 != null) {
            interfaceC1074380e44.LIZ(c1073600e2o.LIZ, c1073600e2o.LIZIZ, c1073600e2o.LIZJ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ScrollSwitchStateManager scrollSwitchStateManager;
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (scrollSwitchStateManager = (ScrollSwitchStateManager) this.LLJILJIL.getValue()) != null) {
            this.LLJ = new C1590130rTv(new C1590190rU1(this), fragmentLJI, scrollSwitchStateManager);
            C08TN.LIZ().LJ("friend_tab_sub_thread_service_get_dialog", false);
            this.LLJI = C1076010e6h.LIZJ.LJIL(fragmentLJI, (HomePageDataViewModel) this.LLJILJILJ.getValue(), new C1590150rTx(scrollSwitchStateManager));
            C08TN.LIZ().LJI("friend_tab_sub_thread_service_get_dialog");
        }
        if (!C435330H5f.LIZ() && ((Boolean) C267410Adv.LIZ.getValue()).booleanValue()) {
            C0S78.LJFF(true, new C442830HYb(this));
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainPageFragmentScope.class}).bindAbility(this.LLJIJIL, MainPageSocialAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageSocialAbility
    public final void C8(String str, String str2) {
        C1590130rTv c1590130rTv = this.LLJ;
        if (c1590130rTv != null) {
            C1608090rwt c1608090rwt = C1608090rwt.LIZIZ;
            if (c1608090rwt.LJFF(str, str2) && c1608090rwt.LIZLLL(str2)) {
                WeakReference weakReference = new WeakReference(c1590130rTv.LIZIZ.getActivity());
                WeakReference weakReference2 = new WeakReference(c1590130rTv.LIZIZ);
                String strLIZ = c1590130rTv.LIZ(str2);
                c1590130rTv.LIZ(str);
                c1608090rwt.LJII(new C1264600j0s(weakReference, weakReference2, strLIZ));
            }
        }
    }
}
