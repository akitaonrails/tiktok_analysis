package com.ss.android.ugc.profile.business.ad.ad;

import X.AbstractC1025070cmX;
import X.C019F;
import X.C01GW;
import X.C0SQ9;
import X.C1017070cZd;
import X.C1017250cZv;
import X.C1017290cZz;
import X.C1017480caI;
import X.C1017490caJ;
import X.C1017730cah;
import X.C1017770cal;
import X.C1017780cam;
import X.C1022620cia;
import X.C1022820ciu;
import X.C1026250coR;
import X.C1026260coS;
import X.C1029590ctp;
import X.C1034500d1k;
import X.C1034530d1n;
import X.C1034540d1o;
import X.C1034870d2L;
import X.C1034880d2M;
import X.C1034890d2N;
import X.C1050610dRj;
import X.C1075590e61;
import X.C1210304oP;
import X.C1252220igu;
import X.C1252710ihh;
import X.C1260280itu;
import X.C1336205Ku;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1637806bA;
import X.C1668706g9;
import X.C1720106oR;
import X.C1744706sP;
import X.C19719912Dl;
import X.C1AF0;
import X.C2097608Jq;
import X.C21594419fC;
import X.C21600219g8;
import X.C2184171Adz;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C289890BXv;
import X.C291001Au;
import X.C452501pT;
import X.C622680Oba;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.EnumC1001040c9m;
import X.EnumC1029460ctc;
import X.EnumC452301pR;
import X.InterfaceC1017820caq;
import X.InterfaceC1021920chS;
import X.InterfaceC1034510d1l;
import X.InterfaceC1034560d1q;
import X.InterfaceC1034730d27;
import X.InterfaceC1034910d2P;
import X.InterfaceC1034930d2R;
import X.InterfaceC1035050d2d;
import X.InterfaceC1250630ieL;
import X.InterfaceC1252070igf;
import X.InterfaceC1260330itz;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC718140SEy;
import X.InterfaceC988160bp0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize.profile.api.logger.IFullScreenLandingPageUnityLogger;
import com.ss.android.ugc.aweme.commercialize.profile.impl.ad.CommerceProfileService;
import com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS452S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.AwS665S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class UserProfileADAssemV2 extends UIContentAssem implements InterfaceC1250630ieL {
    public static final C1034530d1n LLJZIJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public static final int LLLF;
    public InterfaceC1034560d1q LLIZLLLIL;
    public InterfaceC1034560d1q LLJ;
    public InterfaceC1034560d1q LLJI;
    public FrameLayout LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public C1260280itu LLJJI;
    public View LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public String LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final InterfaceC1034730d27 LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public final C1034500d1k LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UserProfileADAssemV2.class, "profilePlatformViewModel", "getProfilePlatformViewModel()Lcom/ss/android/ugc/profile/platform/base/viewmodel/ProfilePlatformViewModel;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJZIJLIL = new C1034530d1n();
        LLLF = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0d1k] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0d2A] */
    public UserProfileADAssemV2() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfilePlatformViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 601), AFwS252S0000000_16.get$arr$(359), null, true);
        this.LLJJJJJIL = "";
        this.LLJJL = CommerceProfileService.LIZLLL().LIZJ(new InterfaceC1034930d2R() { // from class: X.0d2A
        });
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 600));
        this.LLJL = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 599));
        this.LLJLIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(305));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(306));
        this.LLJZ = new InterfaceC1260330itz() { // from class: X.0d1k
            @Override // X.InterfaceC1260330itz
            public final void onScroll(int i, int i2) {
            }

            @Override // X.InterfaceC1260330itz
            public final boolean onScrollEnd() {
                this.LL.LLJJIJIIJIL = false;
                return false;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
            @Override // X.InterfaceC1260330itz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onScrolled(float r5, float r6) {
                /*
                    r4 = this;
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r4.LL
                    boolean r0 = r0.Tp()
                    if (r0 == 0) goto L15
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r1 = r4.LL
                    boolean r0 = r1.LLJJJJ
                    if (r0 != 0) goto L15
                    android.view.View r0 = r1.LLJJIII
                    if (r0 == 0) goto L15
                    r1.No(r0)
                L15:
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r4.LL
                    com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.LJIIIIZZ()
                    r0 = 1084227584(0x40a00000, float:5.0)
                    int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                    r1 = 0
                    r2 = 1
                    if (r0 <= 0) goto L2a
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r4.LL
                    boolean r0 = r0.LLJJIJIIJIL
                    if (r0 == 0) goto L71
                    return
                L2a:
                    r0 = -5
                    float r0 = (float) r0
                    int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L95
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r4.LL
                    boolean r0 = r0.LLJJIJIIJIL
                    if (r0 == 0) goto L37
                    return
                L37:
                    if (r3 == 0) goto L49
                    boolean r0 = X.C1017070cZd.LLLIZZ(r3)
                    if (r0 != r2) goto L49
                L3f:
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r4.LL
                    r0.yq(r1, r2)
                L44:
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r4.LL
                    r0.LLJJIJIIJIL = r2
                    return
                L49:
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r4.LL
                    boolean r0 = r0.LLJILJILJ
                    if (r0 != 0) goto L3f
                    if (r3 == 0) goto L6b
                    boolean r0 = X.C1017070cZd.LLLJ(r3)
                    if (r0 != r2) goto L5d
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r4.LL
                    r0.Aq(r1, r2)
                    goto L44
                L5d:
                    boolean r0 = X.C1017070cZd.LLLJIL(r3)
                    if (r0 != r2) goto L6b
                    X.0dYS r1 = X.C1054780dYS.LIZIZ
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r1.changeBottomBarVisible(r0)
                    goto L44
                L6b:
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r4.LL
                    r0.tq(r1, r2)
                    goto L44
                L71:
                    if (r3 == 0) goto Lb0
                    boolean r0 = X.C1017070cZd.LLLIZZ(r3)
                    if (r0 != r2) goto Lb0
                    r0 = 1
                L7a:
                    r1 = 300(0x12c, float:4.2E-43)
                    if (r0 != 0) goto Laa
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r4.LL
                    boolean r0 = r0.LLJILJILJ
                    if (r0 != 0) goto Laa
                    if (r3 == 0) goto La4
                    boolean r0 = X.C1017070cZd.LLLJ(r3)
                    if (r0 != r2) goto L96
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r4.LL
                    r0.Ep(r1, r2)
                L91:
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r4.LL
                    r0.LLJJIJIIJIL = r2
                L95:
                    return
                L96:
                    boolean r0 = X.C1017070cZd.LLLJIL(r3)
                    if (r0 != r2) goto La4
                    X.0dYS r1 = X.C1054780dYS.LIZIZ
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    r1.changeBottomBarVisible(r0)
                    goto L91
                La4:
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r4.LL
                    r0.up(r1, r2)
                    goto L91
                Laa:
                    com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r4.LL
                    r0.Ap(r1, r2)
                    goto L91
                Lb0:
                    r0 = 0
                    goto L7a
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1034500d1k.onScrolled(float, float):void");
            }
        };
    }

    private final void Up() {
        View viewSo = So();
        if (viewSo instanceof C21600219g8) {
            ((C21600219g8) viewSo).LIZLLL(ap());
        } else if (!(viewSo instanceof C21594419fC)) {
            return;
        } else {
            ((ViewPager) viewSo).addOnPageChangeListener(ap());
        }
        ap().LLILZIL = new C1034880d2M(this);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0d1t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJJJJIL;
            }
        }, null, new AwS630S0100000_16(this, 43), 6);
    }

    private final Boolean ep() {
        Boolean boolValueOf = null;
        try {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                boolValueOf = Boolean.valueOf(fragmentLJI.isVisible());
                return boolValueOf;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZIZ();
        }
        return boolValueOf;
    }

    @Override // X.InterfaceC1250630ieL, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    private final boolean Qp() {
        return Intrinsics.LJFF(C1017290cZz.LIZ, "click_app_full_screen_ad") || Intrinsics.LJFF(C1017290cZz.LIZ, "scroll_to_slide");
    }

    private final C1034890d2N ap() {
        return (C1034890d2N) this.LLJL.getValue();
    }

    public final boolean Tp() {
        return ((Boolean) this.LLJLILLLLZIIL.getValue()).booleanValue();
    }

    public final void Vp() {
        String str;
        if (!this.LLJJJJLIIL || !this.LLJJIJIL || this.LLJJJIL || (str = this.LLJJJJJIL) == null) {
            return;
        }
        new C1050610dRj().LJIIJJI(LJIIIIZZ(), str, getEventType());
        this.LLJJJIL = true;
    }

    public final List<InterfaceC1034910d2P> Zo() {
        return (List) this.LLJLIL.getValue();
    }

    public final ProfilePlatformViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (ProfilePlatformViewModel) assemVMLazy.getValue();
    }

    public final ScrollSwitchStateManager mp() {
        return (ScrollSwitchStateManager) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.view.View So() {
        /*
            r4 = this;
            androidx.fragment.app.Fragment r3 = X.C724240Sb0.LJI(r4)
            r2 = 0
            if (r3 == 0) goto L1b
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L5c
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L11:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L3d
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L4c
        L1b:
            r3 = r2
        L1c:
            r1 = 2131400227(0x7f0a9623, float:1.8421302E38)
            if (r3 == 0) goto L2c
            android.view.View r0 = r3.getView()
            if (r0 == 0) goto L2b
            android.view.View r2 = r0.findViewById(r1)
        L2b:
            return r2
        L2c:
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L2b
            android.app.Activity r0 = X.C1388190mED.LIZ(r0)
            if (r0 == 0) goto L2b
            android.view.View r2 = r0.findViewById(r1)
            return r2
        L3d:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L1b
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L4c
            goto L1b
        L4a:
            if (r3 == 0) goto L1b
        L4c:
            boolean r0 = r3 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L57
            X.198i r3 = (X.InterfaceC214902198i) r3
            if (r3 == 0) goto L1b
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            goto L1c
        L57:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L4a
        L5c:
            r1 = r2
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2.So():android.view.View");
    }

    private final String lp() {
        return Qp() ? "slide" : Intrinsics.LJFF(C1017290cZz.LIZ, "click_avatar") ? "photo" : Intrinsics.LJFF(C1017290cZz.LIZ, "click_name") ? "name" : "";
    }

    private final boolean tp() {
        User author;
        String uid;
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ == null || (author = awemeLJIIIIZZ.getAuthor()) == null || (uid = author.getUid()) == null) {
            return false;
        }
        return C1336205Ku.LIZ(false).getImChatService().LJJ(uid);
    }

    public final Aweme LJIIIIZZ() {
        return kp().getState().LLJILJILJ;
    }

    public final void Lo() {
        InterfaceC1034510d1l interfaceC1034510d1lDp;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkPageLoadStatus: ");
        sbLIZ.append(this.LLJLLIL && this.LLJLLL);
        C1022620cia.LIZ("ProfileAdAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJLLIL && this.LLJLLL && (interfaceC1034510d1lDp = dp()) != null) {
            interfaceC1034510d1lDp.LZ(C1026260coS.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oo() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r5.LJIIIIZZ()
            X.0d2d r1 = X.C1029590ctp.LIZLLL()
            android.content.Context r0 = r5.getContext()
            r1.LJJIIZ(r0, r4)
            if (r4 == 0) goto L40
            boolean r1 = X.C1017070cZd.LLJI(r4)
            r0 = 1
            if (r1 != r0) goto L40
        L18:
            r3 = 8
            if (r0 == 0) goto L42
            X.0dYS r2 = X.C1054780dYS.LIZIZ
            android.content.Context r1 = r5.getContext()
            X.0d1m r0 = new X.0d1m
            r0.<init>()
            boolean r0 = r2.openTopViewLive(r1, r4, r3, r0)
            if (r0 != 0) goto L3f
            X.C1029590ctp.LIZIZ()
            android.content.Context r1 = r5.getContext()
            X.0d2C r0 = new X.InterfaceC1021920chS() { // from class: X.0d2C
                static {
                    /*
                        X.0d2C r0 = new X.0d2C
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0d2C) X.0d2C.LIZ X.0d2C
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1034780d2C.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1034780d2C.<init>():void");
                }

                @Override // X.InterfaceC1021920chS
                public final void LIZ() {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1034780d2C.LIZ():void");
                }
            }
            X.C0SQ9.LIZ(r1, r4, r3, r0)
            r1 = 300(0x12c, float:4.2E-43)
            r0 = 0
            r5.Ap(r1, r0)
        L3f:
            return
        L40:
            r0 = 0
            goto L18
        L42:
            X.C1029590ctp.LIZIZ()
            android.content.Context r1 = r5.getContext()
            X.0d2D r0 = new X.InterfaceC1021920chS() { // from class: X.0d2D
                static {
                    /*
                        X.0d2D r0 = new X.0d2D
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0d2D) X.0d2D.LIZ X.0d2D
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1034790d2D.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1034790d2D.<init>():void");
                }

                @Override // X.InterfaceC1021920chS
                public final void LIZ() {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1034790d2D.LIZ():void");
                }
            }
            X.C0SQ9.LIZ(r1, r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2.Oo():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r2.LIZIZ(r0 != null ? r0.getAwemeRawAd() : null) == true) goto L16;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Wp() {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2.Wp():void");
    }

    public final void Xp() {
        Aweme awemeLJIIIIZZ;
        if (DmNoticeProxyImpl.LIZJ().LIZIZ() || (awemeLJIIIIZZ = LJIIIIZZ()) == null) {
            return;
        }
        InterfaceC718140SEy interfaceC718140SEyLIZIZ = C1029590ctp.LIZIZ();
        Context context = getContext();
        interfaceC718140SEyLIZIZ.getClass();
        EnterChatParams enterChatParamsLJIIIIZZ = AbstractC1025070cmX.LJIIIIZZ(context, awemeLJIIIIZZ, 79);
        enterChatParamsLJIIIIZZ.setQuickChatInputCanExpandFullScreen(true);
        enterChatParamsLJIIIIZZ.setQuickChat(true);
        AwemeRawAd awemeRawAd = awemeLJIIIIZZ.getAwemeRawAd();
        enterChatParamsLJIIIIZZ.setQuickChatViewType(((awemeRawAd == null || !awemeRawAd.isHasDefaultConversation()) && !tp()) ? 3 : 1);
        C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParamsLJIIIIZZ, null);
        aq("halfscreen_page", "homepage_ad", C2097608Jq.LJIIJ(new Pair("panel_height", Integer.valueOf(enterChatParamsLJIIIIZZ.getQuickChatViewType()))));
        if (!C1017070cZd.LLI(awemeLJIIIIZZ) || ((Number) C289890BXv.LIZ.getValue()).intValue() <= -1) {
            return;
        }
        C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJI().LIZIZ(new C1744706sP(EnumC1001040c9m.CLICK_ENTRANCE, AwemeExtKt.getAuthorUid(awemeLJIIIIZZ), awemeLJIIIIZZ));
    }

    public final InterfaceC1034510d1l dp() {
        return ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LJI().LIZLLL(getContext(), LJIIIIZZ(), getEventType());
    }

    public final String getEventType() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        if (interfaceC665370Q7zLJIIL == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LJIIJ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        C1260280itu c1260280itu = this.LLJJI;
        if (c1260280itu != null) {
            c1260280itu.LJIIIIZZ(this.LLJZ);
        }
        C622680Oba.LIZLLL(this);
        ap().LLILZIL = null;
    }

    @Override // X.AbstractC738140SxQ
    public void onPause() {
        super.onPause();
        C622680Oba.LIZLLL(this);
        this.LLJJJIL = false;
        InterfaceC1034510d1l interfaceC1034510d1lDp = dp();
        if (interfaceC1034510d1lDp != null) {
            interfaceC1034510d1lDp.onPagePause();
        }
    }

    @Override // X.AbstractC738140SxQ
    public void onResume() {
        super.onResume();
        if (this.LLJJIJIL) {
            C622680Oba.LIZJ(this);
            Vp();
            Boolean boolEp = ep();
            InterfaceC1034510d1l interfaceC1034510d1lDp = dp();
            if (interfaceC1034510d1lDp != null) {
                interfaceC1034510d1lDp.xt2(boolEp);
            }
        }
    }

    public final void xq() {
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1017820caq interfaceC1017820caqLJIILIIL;
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ == null || !C1017070cZd.LJJJJJL(awemeLJIIIIZZ)) {
            ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
            if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null && (interfaceC1017820caqLJIILIIL = iFeedServiceLIZIZ.LJIILIIL()) != null && interfaceC1017820caqLJIILIIL.LIZ(getContext(), LJIIIIZZ(), 40)) {
                aq(null, null, null);
                return;
            }
            if (C1029590ctp.LJ().LJIIIIZZ().LIZ(getContext(), LJIIIIZZ(), Boolean.valueOf(Qp()), Boolean.FALSE)) {
                aq(null, null, null);
                return;
            }
            ISamsungPageService iSamsungPageService = (ISamsungPageService) PluggableExtentionKt.pluggableSpi$default(ISamsungPageService.class, false, false, false, 14, null);
            if (iSamsungPageService == null || !iSamsungPageService.LIZLLL(getContext(), LJIIIIZZ(), 40, true, true)) {
                return;
            }
            aq(null, null, null);
        }
    }

    @Override // X.InterfaceC1250630ieL
    public boolean LLZZZIL() {
        return this.LLJJ;
    }

    public final InterfaceC1034560d1q Vo() {
        return this.LLIZLLLIL;
    }

    public final View bp() {
        return this.LLJJIII;
    }

    public final boolean cp() {
        return this.LLJILJIL;
    }

    public final boolean hp() {
        return this.LLJILJILJ;
    }

    public final InterfaceC1034560d1q ip() {
        return this.LLJ;
    }

    public final C1260280itu op() {
        return this.LLJJI;
    }

    private final void Go(Aweme aweme) {
        InterfaceC1034560d1q interfaceC1034560d1q = this.LLIZLLLIL;
        if (interfaceC1034560d1q != null) {
            C1017730cah c1017730cah = new C1017730cah();
            Context context = getContext();
            getEventType();
            C1017780cam c1017780cam = new C1017780cam() { // from class: X.0d1r
                @Override // X.C1017780cam
                public final void LIZ() {
                    this.LIZ.Wp();
                }

                @Override // X.C1017780cam
                public final void LIZIZ() {
                    this.LIZ.LLJILJIL = true;
                }
            };
            c1017730cah.LIZ = context;
            c1017730cah.LIZIZ = aweme;
            c1017730cah.LIZJ = c1017780cam;
            interfaceC1034560d1q.LJIIIZ(c1017730cah);
        }
    }

    private final void Gp(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.a7j);
        C1017730cah c1017730cah = new C1017730cah();
        c1017730cah.LIZLLL = viewStub;
        InterfaceC988160bp0 interfaceC988160bp0P = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).P(getContext(), c1017730cah);
        if (interfaceC988160bp0P instanceof InterfaceC1034560d1q) {
            InterfaceC1034560d1q interfaceC1034560d1q = (InterfaceC1034560d1q) interfaceC988160bp0P;
            this.LLIZLLLIL = interfaceC1034560d1q;
            if (interfaceC1034560d1q != null) {
                interfaceC1034560d1q.LJ();
            }
        }
    }

    private final void Ho(final Aweme aweme) {
        InterfaceC1034560d1q interfaceC1034560d1q = this.LLJ;
        if (interfaceC1034560d1q != null) {
            C1017730cah c1017730cah = new C1017730cah();
            Context context = getContext();
            getEventType();
            C1017780cam c1017780cam = new C1017780cam() { // from class: X.0d1j
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
                
                    if (r1.LIZIZ(r0 != null ? r0.getAwemeRawAd() : null) == true) goto L16;
                 */
                @Override // X.C1017780cam
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        r3 = this;
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2
                        r2 = 0
                        if (r0 == 0) goto L40
                        com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    L9:
                        boolean r0 = X.C1017180cZo.LIZJ(r0)
                        if (r0 == 0) goto L3a
                        com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                        java.lang.Class<com.ss.android.ugc.aweme.structure.api.ICommerceService> r0 = com.ss.android.ugc.aweme.structure.api.ICommerceService.class
                        java.lang.Object r0 = r1.getService(r0)
                        com.ss.android.ugc.aweme.structure.api.ICommerceService r0 = (com.ss.android.ugc.aweme.structure.api.ICommerceService) r0
                        com.ss.android.ugc.aweme.api.IFeedService r0 = r0.LIZIZ()
                        X.0cMV r0 = r0.LJ()
                        if (r0 == 0) goto L42
                        X.0cZq r1 = r0.LJIL()
                        if (r1 == 0) goto L42
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2
                        if (r0 == 0) goto L33
                        com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.getAwemeRawAd()
                    L33:
                        boolean r1 = r1.LIZIZ(r2)
                        r0 = 1
                        if (r1 != r0) goto L42
                    L3a:
                        com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r3.LIZ
                        r0.Oo()
                        return
                    L40:
                        r0 = r2
                        goto L9
                    L42:
                        com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2 r0 = r3.LIZ
                        X.0d1l r1 = r0.dp()
                        if (r1 == 0) goto L4f
                        X.0coQ r0 = X.C1026240coQ.LIZ
                        r1.LZ(r0)
                    L4f:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1034490d1j.LIZ():void");
                }

                @Override // X.C1017780cam
                public final void LIZIZ() {
                    this.LIZ.LLJILJIL = true;
                }
            };
            c1017730cah.LIZ = context;
            c1017730cah.LIZIZ = aweme;
            c1017730cah.LIZJ = c1017780cam;
            interfaceC1034560d1q.LJIIIZ(c1017730cah);
        }
    }

    private final void Ip(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.p5n);
        C1017770cal c1017770cal = new C1017770cal();
        c1017770cal.LIZ = viewStub;
        InterfaceC988160bp0 interfaceC988160bp0P = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).P(getContext(), c1017770cal);
        if (interfaceC988160bp0P instanceof InterfaceC1034560d1q) {
            InterfaceC1034560d1q interfaceC1034560d1q = (InterfaceC1034560d1q) interfaceC988160bp0P;
            this.LLJ = interfaceC1034560d1q;
            if (interfaceC1034560d1q != null) {
                interfaceC1034560d1q.LJ();
            }
        }
    }

    private final void Jo(Aweme aweme) {
        InterfaceC1034560d1q interfaceC1034560d1q = this.LLJI;
        if (interfaceC1034560d1q != null) {
            C1017730cah c1017730cah = new C1017730cah();
            Context context = getContext();
            getEventType();
            C1017780cam c1017780cam = new C1017780cam() { // from class: X.0d1s
                @Override // X.C1017780cam
                public final void LIZ() {
                    this.LIZ.Wp();
                }
            };
            c1017730cah.LIZ = context;
            c1017730cah.LIZIZ = aweme;
            c1017730cah.LIZJ = c1017780cam;
            c1017730cah.LJ = (ViewGroup) LJJIJL().findViewById(R.id.view_stub_float_notice);
            interfaceC1034560d1q.LJIIIZ(c1017730cah);
        }
    }

    public final void No(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Gp(view);
        Ip(view);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ymm);
        if (frameLayout != null) {
            LLJZIJLIL.getClass();
            C1034530d1n.LIZ(frameLayout);
        } else {
            frameLayout = null;
        }
        this.LLJIJIL = frameLayout;
        this.LLJJJJ = true;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AD delayInitAdView costTime: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C1720106oR.LJI("ProfileAdAssem", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void iq(InterfaceC1034560d1q interfaceC1034560d1q) {
        this.LLIZLLLIL = interfaceC1034560d1q;
    }

    public final void jq(View view) {
        this.LLJJIII = view;
    }

    public final void kq(boolean z) {
        this.LLJILJIL = z;
    }

    public final void lq(boolean z) {
        this.LLJILJILJ = z;
    }

    @C14EU
    public final void onEvent(C1034540d1o c1034540d1o) {
        String aid;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        AwemeRawAd awemeRawAd5;
        String str = c1034540d1o.LIZLLL;
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        AwemeRawAd awemeRawAd6 = null;
        if (awemeLJIIIIZZ != null) {
            aid = awemeLJIIIIZZ.getAid();
        } else {
            aid = null;
        }
        if (TextUtils.equals(str, aid) && TextUtils.equals(c1034540d1o.LJ, "profile_ad")) {
            int i = c1034540d1o.LIZIZ;
            if (i != 1) {
                if (i != 2) {
                    if (i == 4) {
                        Integer num = c1034540d1o.LIZJ;
                        if (num != null && num.intValue() == 2) {
                            Aweme awemeLJIIIIZZ2 = LJIIIIZZ();
                            if (awemeLJIIIIZZ2 != null) {
                                awemeRawAd5 = awemeLJIIIIZZ2.getAwemeRawAd();
                            } else {
                                awemeRawAd5 = null;
                            }
                            C2184171Adz.LIZLLL("landing_ad", "close", awemeRawAd5).LJII();
                        }
                        Integer num2 = c1034540d1o.LIZJ;
                        if (num2 != null && num2.intValue() == 3) {
                            Aweme awemeLJIIIIZZ3 = LJIIIIZZ();
                            if (awemeLJIIIIZZ3 != null) {
                                awemeRawAd6 = awemeLJIIIIZZ3.getAwemeRawAd();
                            }
                            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "close", awemeRawAd6);
                            c1022820ciuLIZLLL.LIZJ("halfscreen_page", "refer");
                            c1022820ciuLIZLLL.LJII();
                            return;
                        }
                        return;
                    }
                    return;
                }
                Aweme awemeLJIIIIZZ4 = LJIIIIZZ();
                if (awemeLJIIIIZZ4 != null) {
                    awemeRawAd6 = awemeLJIIIIZZ4.getAwemeRawAd();
                }
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("homepage_ad", "otherclick", awemeRawAd6);
                c1022820ciuLIZLLL2.LIZJ("halfscreen_page", "refer");
                c1022820ciuLIZLLL2.LJII();
                return;
            }
            Integer num3 = c1034540d1o.LIZJ;
            if (num3 != null && num3.intValue() == 3) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String strLIZ = C1017290cZz.LIZ();
                if (strLIZ != null) {
                    linkedHashMap.put("enter_source", strLIZ);
                }
                if (C1210304oP.LIZ()) {
                    IFullScreenLandingPageUnityLogger iFullScreenLandingPageUnityLogger = (IFullScreenLandingPageUnityLogger) PluggableExtentionKt.pluggableSpi$default(IFullScreenLandingPageUnityLogger.class, false, false, false, 14, null);
                    if (iFullScreenLandingPageUnityLogger != null) {
                        EnumC1029460ctc enumC1029460ctc = EnumC1029460ctc.VERSION_1_0;
                        Aweme awemeLJIIIIZZ5 = LJIIIIZZ();
                        if (awemeLJIIIIZZ5 != null) {
                            awemeRawAd4 = awemeLJIIIIZZ5.getAwemeRawAd();
                        } else {
                            awemeRawAd4 = null;
                        }
                        iFullScreenLandingPageUnityLogger.LIZ(enumC1029460ctc, awemeRawAd4, C1017290cZz.LIZ(), linkedHashMap);
                    }
                } else {
                    Aweme awemeLJIIIIZZ6 = LJIIIIZZ();
                    if (awemeLJIIIIZZ6 != null) {
                        awemeRawAd2 = awemeLJIIIIZZ6.getAwemeRawAd();
                    } else {
                        awemeRawAd2 = null;
                    }
                    C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("homepage_ad", "click", awemeRawAd2);
                    c1022820ciuLIZLLL3.LIZJ("halfscreen_page", "refer");
                    c1022820ciuLIZLLL3.LIZ(linkedHashMap);
                    c1022820ciuLIZLLL3.LJII();
                }
                Aweme awemeLJIIIIZZ7 = LJIIIIZZ();
                if (awemeLJIIIIZZ7 != null) {
                    awemeRawAd3 = awemeLJIIIIZZ7.getAwemeRawAd();
                } else {
                    awemeRawAd3 = null;
                }
                C1022820ciu c1022820ciuLIZLLL4 = C2184171Adz.LIZLLL("homepage_ad", "othershow", awemeRawAd3);
                c1022820ciuLIZLLL4.LIZJ("halfscreen_page", "refer");
                c1022820ciuLIZLLL4.LJII();
            }
            Integer num4 = c1034540d1o.LIZJ;
            if (num4 == null || num4.intValue() != 2) {
                return;
            }
            Aweme awemeLJIIIIZZ8 = LJIIIIZZ();
            if (awemeLJIIIIZZ8 != null) {
                awemeRawAd = awemeLJIIIIZZ8.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C1022820ciu c1022820ciuLIZLLL5 = C2184171Adz.LIZLLL("homepage_ad", "click", awemeRawAd);
            c1022820ciuLIZLLL5.LIZJ("button", "refer");
            c1022820ciuLIZLLL5.LJII();
            Aweme awemeLJIIIIZZ9 = LJIIIIZZ();
            if (awemeLJIIIIZZ9 != null) {
                awemeRawAd6 = awemeLJIIIIZZ9.getAwemeRawAd();
            }
            C1022820ciu c1022820ciuLIZLLL6 = C2184171Adz.LIZLLL("homepage_ad", "othershow", awemeRawAd6);
            c1022820ciuLIZLLL6.LIZJ("button", "refer");
            c1022820ciuLIZLLL6.LJII();
        }
    }

    @C14EU
    public final void onNativeGPViewHiddenEvent(C1017490caJ c1017490caJ) {
        boolean shouldWebUrlJumpThirdApp;
        AwemeRawAd awemeRawAd;
        View view;
        if (Tp() && !this.LLJJJJ && (view = this.LLJJIII) != null) {
            No(view);
        }
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ != null && (awemeRawAd = awemeLJIIIIZZ.getAwemeRawAd()) != null) {
            shouldWebUrlJumpThirdApp = awemeRawAd.getShouldWebUrlJumpThirdApp();
        } else {
            shouldWebUrlJumpThirdApp = false;
        }
        Aq(shouldWebUrlJumpThirdApp, false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1260280itu c1260280itu = (C1260280itu) view.findViewById(R.id.u30);
        this.LLJJI = c1260280itu;
        if (c1260280itu != null) {
            c1260280itu.LJ(this.LLJZ);
        }
        if (!Tp()) {
            Gp(view);
            Ip(view);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ymm);
            if (frameLayout != null) {
                LLJZIJLIL.getClass();
                C1034530d1n.LIZ(frameLayout);
            } else {
                frameLayout = null;
            }
            this.LLJIJIL = frameLayout;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AD onViewCreated costTime: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C1720106oR.LJI("ProfileAdAssem", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIII = view;
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0d1p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJILJILJ;
            }
        }, null, new AwS452S0200000_16(this, view, 5), 6);
        C736680Sv4.LJIIIZ(this, kp(), new C2217381BqS() { // from class: X.0d1w
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJLIL;
            }
        }, new C2217381BqS() { // from class: X.0d1y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJ;
            }
        }, C736820SvI.LIZLLL(), new AwS665S0100000_16(this, 1), 8);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            JediViewModel.bR2(C1075590e61.LIZ(fragmentLJI), C1034870d2L.LL, null, new AwS595S0100000_16((Function1) new AwS595S0100000_16(this, 158), (Function1<? super C291001Au<Unit>, Unit>) 377), 2, null);
        }
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0d1u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJJJJIL;
            }
        }, null, new AwS452S0200000_16(this, view, 6), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0d20
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJJJLIIL;
            }
        }, null, new AwS630S0100000_16(this, 44), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0d21
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJJJ;
            }
        }, null, new AwS630S0100000_16(this, 45), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0d24
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1251350ifV) obj).LLJJIJIL);
            }
        }, null, new AwS630S0100000_16(this, 42), 6);
        C1252710ihh.LJIIJ(this, C13LE.LIZ(InterfaceC1252070igf.class), new C2217381BqS() { // from class: X.0d25
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251330ifT) obj).LIZIZ;
            }
        }, new AwS595S0100000_16(this, 157));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AD lister costTime: ");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C1720106oR.LJI("ProfileAdAssem", C2188811AlT.LIZIZ(sbLIZ2));
        Up();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("AD listenProfileScrollStatus costTime: ");
        sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C1720106oR.LJI("ProfileAdAssem", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void pq(InterfaceC1034560d1q interfaceC1034560d1q) {
        this.LLJ = interfaceC1034560d1q;
    }

    public final void qq(C1260280itu c1260280itu) {
        this.LLJJI = c1260280itu;
    }

    public final void sp(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String strLIZ;
        if (C1017070cZd.LLIIIJ(aweme)) {
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            if (!C1017070cZd.LJLLJ(awemeRawAd) || (strLIZ = C1017290cZz.LIZ()) == null) {
                return;
            }
            aq(strLIZ, "draw_ad", null);
            C1029590ctp.LIZIZ();
            C0SQ9.LIZ(getContext(), aweme, 40, new InterfaceC1021920chS() { // from class: X.0d26
                @Override // X.InterfaceC1021920chS
                public final void LIZ() {
                }
            });
        }
    }

    public final void wq(Aweme aweme) {
        boolean z;
        if (aweme != null) {
            if (C1017070cZd.LLLIZZ(aweme)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                yq(true, false);
            } else {
                if (aweme == null || !C1017070cZd.LLLJ(aweme)) {
                    return;
                }
                Aq(true, false);
            }
        }
    }

    public final void zp(Aweme aweme) {
        boolean z;
        if (aweme != null) {
            if (C1017070cZd.LLLIZZ(aweme)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Ap(0, false);
            } else {
                if (aweme == null || !C1017070cZd.LLLJ(aweme)) {
                    return;
                }
                Ep(0, false);
            }
        }
    }

    @C14EU
    public final void onNativeGPViewHiddenEvent(C1017480caI c1017480caI) {
        View view;
        if (Tp() && !this.LLJJJJ && (view = this.LLJJIII) != null) {
            No(view);
        }
        if (c1017480caI.LIZ) {
            Ep(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, false);
        } else {
            Aq(false, false);
        }
    }

    private final void Jp(View view, Aweme aweme) {
        ICommercializeAdService iCommercializeAdService = (ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class);
        C1017250cZv c1017250cZv = new C1017250cZv(aweme);
        if (this.LLJI != null && !iCommercializeAdService.O(c1017250cZv)) {
            return;
        }
        Ep(0, false);
        InterfaceC1034560d1q interfaceC1034560d1q = this.LLJI;
        if (interfaceC1034560d1q != null) {
            interfaceC1034560d1q.unBind();
        }
        InterfaceC1034560d1q interfaceC1034560d1q2 = this.LLJI;
        if (interfaceC1034560d1q2 != null) {
            interfaceC1034560d1q2.LJIIJ();
        }
        c1017250cZv.LIZIZ = (ViewStub) view.findViewById(R.id.rhc);
        InterfaceC988160bp0 interfaceC988160bp0P = iCommercializeAdService.P(getContext(), c1017250cZv);
        if (interfaceC988160bp0P instanceof InterfaceC1034560d1q) {
            InterfaceC1034560d1q interfaceC1034560d1q3 = (InterfaceC1034560d1q) interfaceC988160bp0P;
            this.LLJI = interfaceC1034560d1q3;
            if (interfaceC1034560d1q3 != null) {
                interfaceC1034560d1q3.LJ();
            }
        }
    }

    public final void Ap(int i, boolean z) {
        InterfaceC1034560d1q interfaceC1034560d1q;
        if (this.LLILZ && (interfaceC1034560d1q = this.LLJ) != null) {
            interfaceC1034560d1q.LJII(i, z);
        }
    }

    public final void Aq(boolean z, boolean z2) {
        Aweme awemeLJIIIIZZ;
        if (!this.LLILZ || this.LLJI == null || (awemeLJIIIIZZ = LJIIIIZZ()) == null || !C1017070cZd.LLLJ(awemeLJIIIIZZ) || this.LLJILLL) {
            return;
        }
        this.LLJILLL = true;
        InterfaceC1034510d1l interfaceC1034510d1lDp = dp();
        if (interfaceC1034510d1lDp != null) {
            interfaceC1034510d1lDp.LZ(C1026250coR.LIZ);
        }
        InterfaceC1034560d1q interfaceC1034560d1q = this.LLJI;
        if (interfaceC1034560d1q != null) {
            interfaceC1034560d1q.LIZJ(z, z2);
        }
    }

    public final void Ep(int i, boolean z) {
        InterfaceC1034560d1q interfaceC1034560d1q;
        if (this.LLILZ && (interfaceC1034560d1q = this.LLJI) != null) {
            interfaceC1034560d1q.LJII(i, z);
            this.LLJILLL = false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (r1.get("5") != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011a, code lost:
    
        if ((!r0) != false) goto L68;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fq(android.view.View r6, com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2.fq(android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void tq(boolean z, boolean z2) {
        Aweme awemeLJIIIIZZ;
        InterfaceC1034560d1q interfaceC1034560d1q;
        if (this.LLILZ && this.LLIZLLLIL != null && !this.LLJILJIL && (awemeLJIIIIZZ = LJIIIIZZ()) != null && C1017070cZd.LLLFZ(awemeLJIIIIZZ) && (interfaceC1034560d1q = this.LLIZLLLIL) != null) {
            interfaceC1034560d1q.LIZJ(z, z2);
        }
    }

    public final void up(int i, boolean z) {
        InterfaceC1034560d1q interfaceC1034560d1q;
        if (this.LLILZ && (interfaceC1034560d1q = this.LLIZLLLIL) != null) {
            interfaceC1034560d1q.LJII(i, z);
        }
    }

    public final void yq(boolean z, boolean z2) {
        if (!this.LLILZ || this.LLJ == null || this.LLJILJIL) {
            return;
        }
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if ((awemeLJIIIIZZ != null && C1017070cZd.LLLFZ(awemeLJIIIIZZ)) || this.LLJILJILJ) {
            if (z) {
                this.LLJILJILJ = true;
            }
            InterfaceC1034510d1l interfaceC1034510d1lDp = dp();
            if (interfaceC1034510d1lDp != null) {
                interfaceC1034510d1lDp.LZ(C1026250coR.LIZ);
            }
            InterfaceC1034560d1q interfaceC1034560d1q = this.LLJ;
            if (interfaceC1034560d1q != null) {
                interfaceC1034560d1q.LIZJ(z, z2);
            }
        }
    }

    private final void aq(String str, String str2, Map<String, ? extends Object> map) {
        String str3 = str2;
        String strLp = str;
        InterfaceC1035050d2d interfaceC1035050d2dLIZLLL = C1029590ctp.LIZLLL();
        Context context = getContext();
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (strLp == null) {
            strLp = lp();
        }
        if (str3 == null) {
            str3 = "draw_ad";
        }
        interfaceC1035050d2dLIZLLL.LJJI(context, awemeLJIIIIZZ, map, strLp, str3);
    }
}
