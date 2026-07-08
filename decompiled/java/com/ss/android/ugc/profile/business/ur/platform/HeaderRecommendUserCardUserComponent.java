package com.ss.android.ugc.profile.business.ur.platform;

import X.AbstractC848400XPy;
import X.AnonymousClass0208;
import X.C019F;
import X.C01GW;
import X.C0BXY;
import X.C0XQ7;
import X.C1250460ie4;
import X.C1250490ie7;
import X.C1251110if7;
import X.C1252710ihh;
import X.C1262780ixw;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1720106oR;
import X.C1770850wBP;
import X.C19719912Dl;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C268330AfP;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C491101vh;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1252070igf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS119S0100000_19;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.UserProfileUserCardVM;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS286S0000000_3;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderRecommendUserCardUserComponent extends HeaderRecommendUserCardBaseComponent implements IHeaderRecommendUserCardAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public final AssemVMLazy LLJL;
    public final C01GW LLJLIL;
    public volatile boolean LLJLILLLLZIIL;
    public User LLJLL;
    public final C01GW LLJLLIL;
    public int LLJLLL;
    public boolean LLJZ;
    public int LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HeaderRecommendUserCardUserComponent.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/profile/business/ur/UserProfileUserCardVM;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HeaderRecommendUserCardUserComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UserProfileUserCardVM.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2401), AFwS257S0000000_19.get$arr$(446), null, true);
        this.LLJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2400));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(457));
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderRecommendUserCardAbility.class, null, null);
        }
        UserProfileUserCardVM userProfileUserCardVMGp = Gp();
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1252710ihh.LJIIL(userProfileUserCardVMGp, C13LE.LIZ(InterfaceC1252070igf.class), new C2217381BqS() { // from class: X.0d2Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251330ifT) obj).LIZIZ;
            }
        }, new AwS385S0200000_19(userProfileUserCardVMGp, interfaceC665370Q7zLJIIL, 104));
        if (profilePlatformViewModelZo != null) {
            profilePlatformViewModelZo.FQ2(new AwS598S0100000_19(userProfileUserCardVMGp, 688));
            profilePlatformViewModelZo.EQ2(new AwS385S0200000_19(userProfileUserCardVMGp, interfaceC665370Q7zLJIIL, 105));
            profilePlatformViewModelZo.TQ2(new AwS598S0100000_19(userProfileUserCardVMGp, 689));
        }
        if (!Qp()) {
            Jp();
        }
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0ie6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1250500ie8) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 297), 4);
        UserProfileUserCardVM userProfileUserCardVMGp2 = Gp();
        C1250490ie7 c1250490ie7 = new C2217381BqS() { // from class: X.0ie7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1250500ie8) obj).LLILZIL;
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ(false);
        C736680Sv4.LJIIIIZZ(this, userProfileUserCardVMGp2, c1250490ie7, c1770850wBP, AFwS286S0000000_3.get$arr$(21), 4);
        UserProfileUserCardVM userProfileUserCardVMGp3 = Gp();
        C1250460ie4 c1250460ie4 = new C2217381BqS() { // from class: X.0ie4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1250500ie8) obj).LLIZLLLIL;
            }
        };
        C1770850wBP c1770850wBP2 = new C1770850wBP();
        c1770850wBP2.LIZ = true;
        c1770850wBP2.LIZIZ = AFwS303S0000000_19.get$arr$(51);
        C736680Sv4.LJIIIIZZ(this, userProfileUserCardVMGp3, c1250460ie4, c1770850wBP2, new AwS633S0100000_19(this, 292), 4);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0ie2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1250500ie8) obj).LLILZ);
            }
        }, C736820SvI.LJ(), new AwS633S0100000_19(this, 294), 4);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0idN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1250500ie8) obj).LLILLL);
            }
        }, C736820SvI.LJ(), AFwS303S0000000_19.get$arr$(52), 4);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0ie3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1250500ie8) obj).LL);
            }
        }, C736820SvI.LJ(), new AwS633S0100000_19(this, 296), 4);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0ie5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1250500ie8) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), AnonymousClass0208.get$arr$(56), 4);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate costTime: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C1720106oR.LJI("Profile_RecommendUserCard", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final UserProfileUserCardVM Gp() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (UserProfileUserCardVM) assemVMLazy.getValue();
    }

    public final boolean Qp() {
        return ((Boolean) this.LLJLLIL.getValue()).booleanValue();
    }

    public final void Tp() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("UserCard_Assem", "reset assem!");
        C786410Ut5.LJLLLLLL(8, zp());
        if (this.LLJLILLLLZIIL && !(zp().getCurrentState().LIZ instanceof C491101vh)) {
            zp().reset();
        }
        if (C268330AfP.LJIIIZ()) {
            return;
        }
        Bp(1.0f);
        yp();
        Ep(-2);
        Ap(-2);
    }

    public final void Fp() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Jp();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delayInit costTime: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C1720106oR.LJI("Profile_RecommendUserCard", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJZ = true;
    }

    public final void Jp() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C1262780ixw c1262780ixw = new C1262780ixw(context, null, null, 14);
        int visibility = c1262780ixw.getVisibility();
        c1262780ixw.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1262780ixw);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1262780ixw);
        c1262780ixw.setLayoutParams(layoutParams);
        C426750GoL.LJIIL(c1262780ixw, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C0BXY.LIZ() ? 10 : 16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C0BXY.LIZ() ? 0 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 16);
        C786410Ut5.LJLLLLLL(((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() ? 0 : 8, c1262780ixw.findViewById(R.id.kmh));
        C786410Ut5.LJLLLLLL(C1251110if7.LIZJ() ^ true ? 0 : 8, c1262780ixw.findViewById(R.id.user_card_horizontal_right_widget));
        this.LLJJLIIIJLLLLLLLZ = c1262780ixw;
        up();
    }

    @Override // com.ss.android.ugc.profile.business.ur.platform.IHeaderRecommendUserCardAbility
    public final boolean LLIIIL() {
        return (!Qp() || this.LLJZ) && zp().getVisibility() == 0;
    }

    public final void Ip(User user) {
        zp().LJLJLLL(null, C724240Sb0.LJI(this), new AwS385S0200000_19(user, this, 62));
        zp().setSeeAllStyle(new ACListenerS154S0100000_19(this, 174));
        zp().Eg(Gp());
        HandlerHook.viewPost(zp(), new ARunnableS119S0100000_19(this, 109));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4 A[PHI: r3
      0x00f4: PHI (r3v1 boolean) = (r3v0 boolean), (r3v3 boolean), (r3v3 boolean), (r3v3 boolean) binds: [B:74:0x00f0, B:33:0x0071, B:41:0x0091, B:43:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.profile.business.ur.platform.IHeaderRecommendUserCardAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tQ2(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.platform.HeaderRecommendUserCardUserComponent.tQ2(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a2 A[PHI: r4
      0x01a2: PHI (r4v3 boolean) = (r4v2 boolean), (r4v5 boolean), (r4v5 boolean), (r4v5 boolean) binds: [B:108:0x019e, B:54:0x00f1, B:61:0x0110, B:63:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016a  */
    @Override // com.ss.android.ugc.profile.business.ur.platform.IHeaderRecommendUserCardAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mB1(com.ss.android.ugc.aweme.profile.model.User r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.platform.HeaderRecommendUserCardUserComponent.mB1(com.ss.android.ugc.aweme.profile.model.User, java.lang.String):void");
    }
}
