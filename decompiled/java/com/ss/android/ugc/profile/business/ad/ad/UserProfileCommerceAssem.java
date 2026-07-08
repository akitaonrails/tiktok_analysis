package com.ss.android.ugc.profile.business.ad.ad;

import X.C019F;
import X.C1017070cZd;
import X.C1022620cia;
import X.C1022820ciu;
import X.C1026260coS;
import X.C1034870d2L;
import X.C1034920d2Q;
import X.C1075590e61;
import X.C1216270hkv;
import X.C1252220igu;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1AF0;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C291001Au;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1034510d1l;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.anchor.service.CommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.AwS665S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class UserProfileCommerceAssem extends UIContentAssem {
    public static final C1034920d2Q LLJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public FrameLayout LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0d2Q] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UserProfileCommerceAssem.class, "profilePlatformViewModel", "getProfilePlatformViewModel()Lcom/ss/android/ugc/profile/platform/base/viewmodel/ProfilePlatformViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJ = new Object() { // from class: X.0d2Q
        };
    }

    public UserProfileCommerceAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfilePlatformViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 602), AFwS252S0000000_16.get$arr$(360), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final ProfilePlatformViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (ProfilePlatformViewModel) assemVMLazy.getValue();
    }

    public final void Go() {
        InterfaceC1034510d1l interfaceC1034510d1lHo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkPageLoadStatus: ");
        sbLIZ.append(this.LLJILJILJ && this.LLJILLL);
        C1022620cia.LIZ("ProfileCommerceAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJILJILJ && this.LLJILLL && (interfaceC1034510d1lHo = Ho()) != null) {
            interfaceC1034510d1lHo.LZ(C1026260coS.LIZ);
        }
    }

    public final InterfaceC1034510d1l Ho() {
        return ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LJI().LIZIZ(getContext(), LJIIIIZZ(), getEventType());
    }

    public final Aweme LJIIIIZZ() {
        return Jo().getState().LLJILJILJ;
    }

    public final void Lo() {
        List<AnchorCommonStruct> anchors;
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ == null || (anchors = awemeLJIIIIZZ.getAnchors()) == null || anchors.isEmpty() || !CommerceAnchorService.LJIILL().LJI(anchors) || !this.LLJ || this.LLJI) {
            return;
        }
        if (C1017070cZd.LLILII(LJIIIIZZ())) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "profile_show", C1017070cZd.LJJIJL(LJIIIIZZ()));
            c1022820ciuLIZLLL.LIZJ("profile_card", "refer");
            c1022820ciuLIZLLL.LIZIZ(getEventType(), "enter_from");
            c1022820ciuLIZLLL.LJII();
        } else {
            CommerceAnchorService.LJIILL().LIZ(LJIIIIZZ(), getEventType());
        }
        this.LLJI = true;
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
    public final void onDestroy() {
        super.onDestroy();
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LJI().LIZJ(getEventType());
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLJI = false;
        InterfaceC1034510d1l interfaceC1034510d1lHo = Ho();
        if (interfaceC1034510d1lHo != null) {
            interfaceC1034510d1lHo.onPagePause();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Fragment fragmentLJI;
        super.onResume();
        if (this.LLJ) {
            Lo();
            try {
                fragmentLJI = C724240Sb0.LJI(this);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LIZIZ();
            }
            Boolean boolValueOf = fragmentLJI != null ? Boolean.valueOf(fragmentLJI.isVisible()) : null;
            InterfaceC1034510d1l interfaceC1034510d1lHo = Ho();
            if (interfaceC1034510d1lHo != null) {
                interfaceC1034510d1lHo.xt2(boolValueOf);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iN3;
        RelativeLayout.LayoutParams layoutParams;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ymm);
        if (frameLayout != null) {
            LLJJ.getClass();
            Resources resources = frameLayout.getContext().getResources();
            if (resources != null && (iN3 = C786410Ut5.n3(resources, "config_showNavigationBar", "bool", "android")) != 0 && resources.getBoolean(iN3)) {
                int dimensionPixelSize = resources.getDimensionPixelSize(C786410Ut5.n3(resources, "navigation_bar_height", "dimen", "android"));
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.bottomMargin = C1216270hkv.LIZIZ(34) - dimensionPixelSize;
                }
                C786410Ut5.W5(frameLayout, frameLayout.getLayoutParams());
            }
        } else {
            frameLayout = null;
        }
        this.LLJIJIL = frameLayout;
        C736680Sv4.LJIIIZ(this, Jo(), new C2217381BqS() { // from class: X.0d1x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJLIL;
            }
        }, new C2217381BqS() { // from class: X.0d1z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJ;
            }
        }, C736820SvI.LIZLLL(), new AwS665S0100000_16(this, 2), 8);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            JediViewModel.bR2(C1075590e61.LIZ(fragmentLJI), C1034870d2L.LL, null, new AwS595S0100000_16((Function1) new AwS595S0100000_16(this, 160), (Function1<? super C291001Au<Unit>, Unit>) 377), 2, null);
        }
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0d1v
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJJJJIL;
            }
        }, null, new AwS630S0100000_16(this, 47), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0d22
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJJJ;
            }
        }, null, new AwS630S0100000_16(this, 48), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0d23
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1251350ifV) obj).LLJJIJIL);
            }
        }, null, new AwS630S0100000_16(this, 46), 6);
        Jo().TQ2(new AwS595S0100000_16(this, 159));
    }
}
