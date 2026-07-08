package com.ss.android.ugc.profile.business.profile.navbar;

import X.AbstractC1250290idn;
import X.C01GW;
import X.C01TJ;
import X.C0PEM;
import X.C1216270hkv;
import X.C1248940ibc;
import X.C1249530icZ;
import X.C1250280idm;
import X.C1250680ieQ;
import X.C1251350ifV;
import X.C1260280itu;
import X.C1558420qem;
import X.C1558520qew;
import X.C1720106oR;
import X.C197039127h;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C283650B9v;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1249130ibv;
import X.InterfaceC1260330itz;
import X.InterfaceC665370Q7z;
import X.ViewOnLayoutChangeListenerC1265870j2v;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileScrollNavbarAnimation extends NavbarPlatformProtocol<BizBaseData> {
    public boolean LLJLL;
    public View LLJLLIL;
    public C197039127h LLJLLL;
    public C1260280itu LLJZ;
    public float LLJZIJLIL;
    public final C01GW LLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2117));
    public final C1250280idm LLLF = new C1250280idm();
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2116));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2118));
    public final C1249530icZ LLLFZ = new InterfaceC1260330itz() { // from class: X.0icZ
        @Override // X.InterfaceC1260330itz
        public final boolean onScrollEnd() {
            return false;
        }

        @Override // X.InterfaceC1260330itz
        public final void onScrolled(float f, float f2) {
        }

        @Override // X.InterfaceC1260330itz
        public final void onScroll(int i, int i2) {
            if (Intrinsics.LJFF(this.LL.LJLI(), Boolean.FALSE)) {
                return;
            }
            ProfileScrollNavbarAnimation profileScrollNavbarAnimation = this.LL;
            if (profileScrollNavbarAnimation.LLJLL ? i - profileScrollNavbarAnimation.LLJZIJLIL < 0.0f : i - profileScrollNavbarAnimation.LLJZIJLIL > 0.0f) {
                profileScrollNavbarAnimation.LJLJI(i, i2);
            }
            this.LL.LLJZIJLIL = i;
        }
    };

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    public final void LJL(C1250280idm c1250280idm) {
    }

    public abstract String LJLILLLLZI();

    public void LJLIIIL() {
        View view = this.LLJLLIL;
        if (view != null) {
            View view2 = (View) this.LLL.getValue();
            if (view2 != null) {
                view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1265870j2v(this, 1));
            }
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public void LJLJJI() {
        ?? r0 = this.LLJJIII;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    public void LJLJLLL() {
        UserProfileInfo userProfileInfo;
        C1251350ifV state;
        C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
        String strLJLILLLLZI = LJLILLLLZI();
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        String str = (iProfilePlatformVM == null || (state = iProfilePlatformVM.getState()) == null) ? null : state.LLJZ;
        ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
        String uid = (profileCommonInfoLJIILIIL == null || (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null) ? null : userProfileInfo.getUid();
        UserAwemePagerAbility userAwemePagerAbility = (UserAwemePagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserAwemePagerAbility.class, null);
        String tabName = userAwemePagerAbility != null ? userAwemePagerAbility.getTabName() : null;
        c1250680ieQ.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TJ(strLJLILLLLZI, str, uid, tabName, null), 3);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    public final AbstractC1250290idn LJJLIIIJLJLI() {
        return this.LLLF;
    }

    public Boolean LJLI() {
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0192  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJJLL(X.C1250280idm r11) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation.LJJLL(X.0idm):boolean");
    }

    public void LJLJJLL(C197039127h c197039127h) {
        c197039127h.setButtonVariant(0);
        c197039127h.setText(C1216270hkv.LIZJ(2131837643));
    }

    public final void LJLJI(int i, int i2) {
        View viewDm1;
        String value;
        View view;
        EnumC1249130ibv enumC1249130ibv;
        try {
            TuxNavBar tuxNavBarBp0 = null;
            IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IHeaderCTAAbility.class, null);
            if (iHeaderCTAAbility != null) {
                viewDm1 = iHeaderCTAAbility.dm1();
            } else {
                viewDm1 = null;
            }
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
            C1248940ibc c1248940ibc = this.LLJJJJ;
            if (c1248940ibc == null || (enumC1249130ibv = c1248940ibc.LL) == null || (value = enumC1249130ibv.getValue()) == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                tuxNavBarBp0 = iNavbarBaseAbility.Bp0();
            }
            Rect rect = new Rect();
            if (((Boolean) C283650B9v.LIZ.getValue()).booleanValue() && Build.VERSION.SDK_INT > 23 && (view = this.LLJLLIL) != null) {
                view.forceHasOverlappingRendering(false);
            }
            Rect rect2 = new Rect();
            if (tuxNavBarBp0 != null) {
                tuxNavBarBp0.getGlobalVisibleRect(rect2);
            }
            if (viewDm1 != null) {
                viewDm1.getGlobalVisibleRect(rect);
            }
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("navbarRec.bottom ");
            sbLIZ.append(rect2.bottom);
            sbLIZ.append(" ctaViewRec.bottom ");
            sbLIZ.append(rect.bottom);
            sbLIZ.append(", maxY ");
            sbLIZ.append(i2);
            sbLIZ.append(", currentY ");
            sbLIZ.append(i);
            C1720106oR.LJI("ProfileScrollNavbarAnimation", C2188811AlT.LIZIZ(sbLIZ));
            if ((rect2.bottom + C1216270hkv.LIZIZ(10) >= rect.bottom || C1216270hkv.LIZIZ(10) + i >= i2) && !this.LLJLL) {
                C1720106oR.LJI("ProfileScrollNavbarAnimation", "isAnimViewShown set true");
                this.LLJLL = true;
                ((ValueAnimator) this.LLLFF.getValue()).cancel();
                View view2 = this.LLJLLIL;
                if (view2 != null) {
                    if (tuxNavBarBp0 != null) {
                        tuxNavBarBp0.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1265870j2v(this, 2));
                    }
                    C786410Ut5.LJLLLLLL(0, view2);
                    return;
                }
                return;
            }
            if (rect2.bottom < rect.bottom && this.LLJLL) {
                C1720106oR.LJI("ProfileScrollNavbarAnimation", "isAnimViewShown set false");
                this.LLJLL = false;
                ((ValueAnimator) this.LLLFFI.getValue()).cancel();
                ((ValueAnimator) this.LLLFF.getValue()).start();
                return;
            }
            if (this.LLJLL && i == 0) {
                C1720106oR.LJI("ProfileScrollNavbarAnimation", "isAnimViewShown set false");
                this.LLJLL = false;
                ((ValueAnimator) this.LLLFFI.getValue()).cancel();
                ((ValueAnimator) this.LLLFF.getValue()).start();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
