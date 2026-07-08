package com.ss.android.ugc.aweme.commercialize.routeradapter.profile;

import X.AbstractC1026880cpS;
import X.C00ZC;
import X.C1016930cZP;
import X.C1017070cZd;
import X.C1025520cnG;
import X.C1025790cnh;
import X.C1026770cpH;
import X.C1026830cpN;
import X.C1027190cpx;
import X.C1036130d4N;
import X.C14EU;
import X.C2188811AlT;
import X.C622680Oba;
import X.InterfaceC1026870cpR;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes17.dex */
public final class ProfilePageCRouterDelegate implements IProfilePageCRouterDelegate {
    public static final /* synthetic */ int LIZJ = 0;
    public Aweme LIZ;
    public InterfaceC1026870cpR LIZIZ;

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final void LJIIJ() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final void LJLLLLLL() {
        this.LIZIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final boolean LIZLLL() {
        AbstractC1026880cpS abstractC1026880cpS;
        C1025520cnG c1025520cnGLIZ;
        InterfaceC1026870cpR interfaceC1026870cpR = this.LIZIZ;
        return (interfaceC1026870cpR == null || !Intrinsics.LJFF(interfaceC1026870cpR.LIZJ().LIZ, "lynx") || (abstractC1026880cpS = interfaceC1026870cpR.LIZJ().LIZIZ) == null || (c1025520cnGLIZ = abstractC1026880cpS.LIZ()) == null || !c1025520cnGLIZ.LJIIJ) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final boolean LJFF() {
        AbstractC1026880cpS abstractC1026880cpS;
        C1025520cnG c1025520cnGLIZ;
        InterfaceC1026870cpR interfaceC1026870cpR = this.LIZIZ;
        return interfaceC1026870cpR != null && Intrinsics.LJFF(interfaceC1026870cpR.LIZJ().LIZ, "iab") && ((abstractC1026880cpS = interfaceC1026870cpR.LIZJ().LIZIZ) == null || (c1025520cnGLIZ = abstractC1026880cpS.LIZ()) == null || !c1025520cnGLIZ.LJIIJ);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final String LJI() {
        String url;
        InterfaceC1026870cpR interfaceC1026870cpR = this.LIZIZ;
        if (interfaceC1026870cpR == null || (url = interfaceC1026870cpR.getUrl()) == null) {
            url = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCRouterPageUrl(),pageUrl = ");
        sbLIZ.append(url);
        C2188811AlT.LIZIZ(sbLIZ);
        return url;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final boolean LJII() {
        C1026830cpN c1026830cpNLIZJ;
        InterfaceC1026870cpR interfaceC1026870cpR = this.LIZIZ;
        return Intrinsics.LJFF((interfaceC1026870cpR == null || (c1026830cpNLIZJ = interfaceC1026870cpR.LIZJ()) == null) ? null : c1026830cpNLIZJ.LIZ, "lynx");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final boolean LJIIIZ() {
        C1026830cpN c1026830cpNLIZJ;
        InterfaceC1026870cpR interfaceC1026870cpR = this.LIZIZ;
        return Intrinsics.LJFF((interfaceC1026870cpR == null || (c1026830cpNLIZJ = interfaceC1026870cpR.LIZJ()) == null) ? null : c1026830cpNLIZJ.LIZ, "iab");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final boolean LJIIJJI() {
        AbstractC1026880cpS abstractC1026880cpS;
        C1025520cnG c1025520cnGLIZ;
        InterfaceC1026870cpR interfaceC1026870cpR = this.LIZIZ;
        return (interfaceC1026870cpR == null || !Intrinsics.LJFF(interfaceC1026870cpR.LIZJ().LIZ, "iab") || (abstractC1026880cpS = interfaceC1026870cpR.LIZJ().LIZIZ) == null || (c1025520cnGLIZ = abstractC1026880cpS.LIZ()) == null || !c1025520cnGLIZ.LJIIJ) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final String getRefer() {
        C1026830cpN c1026830cpNLIZJ;
        AbstractC1026880cpS abstractC1026880cpS;
        C1025520cnG c1025520cnGLIZ;
        String str;
        InterfaceC1026870cpR interfaceC1026870cpR = this.LIZIZ;
        return (interfaceC1026870cpR == null || (c1026830cpNLIZJ = interfaceC1026870cpR.LIZJ()) == null || (abstractC1026880cpS = c1026830cpNLIZJ.LIZIZ) == null || (c1025520cnGLIZ = abstractC1026880cpS.LIZ()) == null || (str = c1025520cnGLIZ.LJI) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final boolean LJ() {
        if (C00ZC.LIZ()) {
            return this.LIZIZ != null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isCRouterOpen():  = ");
        sbLIZ.append(C00ZC.LIZ());
        sbLIZ.append(", online settings enable is closed");
        C2188811AlT.LIZIZ(sbLIZ);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final Fragment LJIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCRouterFragment(), iCRouterFragmentHandler = ");
        sbLIZ.append(this.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1026870cpR interfaceC1026870cpR = this.LIZIZ;
        Fragment fragment = interfaceC1026870cpR != null ? interfaceC1026870cpR.getFragment() : null;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getCRouterFragment(), fragment = ");
        sbLIZ2.append(fragment);
        C2188811AlT.LIZIZ(sbLIZ2);
        return fragment;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final void LIZ() {
        C622680Oba.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final void LIZJ() {
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final void LJIIIIZZ(C1027190cpx c1027190cpx) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateProfileCRouterParam(): isFromCommerce = ");
        sbLIZ.append(c1027190cpx.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPreCreateHandlerEvent(C1026770cpH c1026770cpH) {
        if (C1017070cZd.LJIIJ(this.LIZ)) {
            return;
        }
        InterfaceC1026870cpR interfaceC1026870cpR = c1026770cpH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCRouterHandler(),createStatus = ");
        sbLIZ.append("pre_create_handler");
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ = interfaceC1026870cpR;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    public final C1036130d4N LJIILIIL(C1016930cZP c1016930cZP, boolean z) {
        AbstractC1026880cpS abstractC1026880cpS;
        C1025790cnh c1025790cnh;
        C1026830cpN c1026830cpNLIZJ;
        InterfaceC1026870cpR interfaceC1026870cpR = this.LIZIZ;
        if (interfaceC1026870cpR != null && (c1026830cpNLIZJ = interfaceC1026870cpR.LIZJ()) != null) {
            abstractC1026880cpS = c1026830cpNLIZJ.LIZIZ;
        } else {
            abstractC1026880cpS = null;
        }
        if (!(abstractC1026880cpS instanceof C1025790cnh) || (c1025790cnh = (C1025790cnh) abstractC1026880cpS) == null) {
            return null;
        }
        String str = c1025790cnh.LIZJ;
        String str2 = c1025790cnh.LIZLLL;
        boolean z2 = c1025790cnh.LJII;
        return new C1036130d4N(str, str2, z2, z2, c1025790cnh.LIZIZ.LJI, 1, c1016930cZP, z, c1025790cnh.LJ.getAiAgentConfig(), Integer.valueOf(c1025790cnh.LIZIZ.LJFF));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.profile.IProfilePageCRouterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(android.content.Context r4, com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r3 = this;
            r3.LIZ = r5
            r1 = 0
            r3.LIZIZ = r1
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onPageDataChanged(), profileDataReset，awemeId = "
            r2.append(r0)
            if (r5 == 0) goto L14
            java.lang.String r1 = r5.getAid()
        L14:
            r2.append(r1)
            java.lang.String r0 = ", isAd = "
            r2.append(r0)
            if (r5 == 0) goto L34
            boolean r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r5)
            r0 = 1
            if (r1 != r0) goto L34
        L25:
            r2.append(r0)
            java.lang.String r0 = ",context = "
            r2.append(r0)
            r2.append(r4)
            X.C2188811AlT.LIZIZ(r2)
            return
        L34:
            r0 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.routeradapter.profile.ProfilePageCRouterDelegate.LJIILJJIL(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
