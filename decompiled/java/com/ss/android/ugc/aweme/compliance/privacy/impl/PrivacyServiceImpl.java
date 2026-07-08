package com.ss.android.ugc.aweme.compliance.privacy.impl;

import X.AbstractC1549150qPp;
import X.AbstractC191867104j;
import X.AbstractC848400XPy;
import X.AnonymousClass1057;
import X.AnonymousClass1084;
import X.C09JN;
import X.C0C64;
import X.C0CCZ;
import X.C0PEM;
import X.C0XQ7;
import X.C103A;
import X.C103L;
import X.C104C;
import X.C105B;
import X.C105F;
import X.C105P;
import X.C105S;
import X.C1061730djf;
import X.C10GR;
import X.C11NZ;
import X.C11S5;
import X.C1207340hWW;
import X.C1207604ny;
import X.C1258004w6;
import X.C131700ep;
import X.C1381560m3W;
import X.C1381570m3X;
import X.C13BV;
import X.C15438062q;
import X.C1548820qPI;
import X.C1668306g5;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1852020yIK;
import X.C1915050zvz;
import X.C191819102n;
import X.C191821102p;
import X.C191833103b;
import X.C191848103q;
import X.C191871104n;
import X.C191874104q;
import X.C191879104v;
import X.C191880104w;
import X.C191985108x;
import X.C19204210Bc;
import X.C19217810Gi;
import X.C19482711Kf;
import X.C19EG;
import X.C2097608Jq;
import X.C2296808zG;
import X.C23250099c;
import X.C397901gf;
import X.C632140Oqq;
import X.C751170TdL;
import X.InterfaceC742660TBg;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.privacy.notify.PrivacyItemSettingsApi;
import com.ss.android.ugc.aweme.compliance.privacy.notify.PrivacyItemSettingsResponse;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.SdkLaunchTask;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class PrivacyServiceImpl implements IPrivacyService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        return C1697810uHb.LJIIJJI(C19204210Bc.class, C19217810Gi.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final InterfaceC742660TBg LIZIZ() {
        IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
        if (iPrivacySettingAPIService == null) {
            return null;
        }
        iPrivacySettingAPIService.LIZIZ();
        return new InterfaceC742660TBg() { // from class: X.1056
            @Override // X.InterfaceC742660TBg
            public final C11ON LIZ(Map map) {
                C106V.LIZ.getClass();
                C106V.LIZIZ().getClass();
                return C191880104w.LIZ(map);
            }

            @Override // X.InterfaceC742660TBg
            public final C11J7 LIZIZ(int i) {
                C191880104w.LIZ.getClass();
                String str = "viewer_history";
                PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, "viewer_history");
                if (privacySettingsRestrictionItemLJIIJJI == null || privacySettingsRestrictionItemLJIIJJI.showType == 2) {
                    str = "video_view_history";
                }
                C106V.LIZ.getClass();
                C106V.LIZIZ().getClass();
                return C191880104w.LJIJI(i, 0, str);
            }

            @Override // X.InterfaceC742660TBg
            public final C11J7 LIZLLL(int i) {
                C191880104w.LIZ.getClass();
                String str = "viewer_history";
                PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, "viewer_history");
                if (privacySettingsRestrictionItemLJIIJJI == null || privacySettingsRestrictionItemLJIIJJI.showType == 2) {
                    str = "profile_view_history";
                }
                C106V.LIZ.getClass();
                C106V.LIZIZ().getClass();
                return C191880104w.LJIJI(i, 0, str);
            }

            @Override // X.InterfaceC742660TBg
            public final C11J7 LIZJ(int i, String str) {
                C106V.LIZ.getClass();
                C106V.LIZIZ().getClass();
                return C191880104w.LJIJI(i, 0, str);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final boolean LIZJ() {
        IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
        return iPrivacySettingAPIService != null && iPrivacySettingAPIService.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final boolean LJ() {
        IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
        return iPrivacySettingAPIService != null && iPrivacySettingAPIService.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF() {
        /*
            r15 = this;
            X.0tYE r0 = X.C1669680tYE.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            boolean r0 = r0.isLogin()
            r3 = 1
            if (r0 != 0) goto L1e
            X.0hWW r0 = X.C1207340hWW.LIZ
            r0.getClass()
            boolean r0 = X.C1207340hWW.LJIIJJI()
            r3 = r0 ^ 1
        L1d:
            return r3
        L1e:
            java.lang.Class<com.ss.android.ugc.aweme.IAccountUserService> r4 = com.ss.android.ugc.aweme.IAccountUserService.class
            r5 = 0
            r10 = 0
            r8 = 14
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.IAccountUserService r0 = (com.ss.android.ugc.aweme.IAccountUserService) r0
            if (r0 == 0) goto L3b
            java.lang.Boolean r1 = r0.LJFF()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L83
        L3b:
            X.104w r0 = X.C191821102p.LIZIZ()
            r0.getClass()
            java.lang.String r0 = "hide_search"
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem r0 = X.C191880104w.LJIIJJI(r10, r0)
            if (r0 == 0) goto L83
            X.108y r0 = X.C191985108x.LIZLLL(r0)
            boolean r0 = r0.LIZIZ
            if (r0 == 0) goto L83
            r2 = 1
        L53:
            java.lang.Class<com.ss.android.ugc.aweme.IAccountUserService> r9 = com.ss.android.ugc.aweme.IAccountUserService.class
            r13 = 14
            r14 = 0
            r11 = r10
            r12 = r10
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r9, r10, r11, r12, r13, r14)
            com.ss.android.ugc.aweme.IAccountUserService r0 = (com.ss.android.ugc.aweme.IAccountUserService) r0
            if (r0 == 0) goto L81
            java.lang.Boolean r1 = r0.LJFF()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L6c:
            r1 = r0 ^ 1
            X.0hYI r0 = X.C1208440hYI.LIZ
            r0.getClass()
            X.0hXn r0 = X.C1208440hYI.LIZIZ
            boolean r0 = r0.LJIIJ()
            if (r2 != 0) goto L1d
            if (r1 != 0) goto L1d
            if (r0 != 0) goto L1d
            r3 = 0
            return r3
        L81:
            r0 = 0
            goto L6c
        L83:
            r2 = 0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl.LJFF():boolean");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final C0CCZ LJI() {
        return new SdkLaunchTask();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final boolean LJIIJJI() {
        C191880104w.LIZ.getClass();
        return C105F.LIZ(C191880104w.LJIIL(), "pause_interaction_from", 0) == 2;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final boolean LJJIII() {
        C105P.LIZ.getClass();
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return true;
        }
        C1207340hWW.LIZ.getClass();
        return !C1207340hWW.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final boolean LJJIIZ() {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        C1915050zvz.LIZ.getClass();
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        String str = (iGatekeeperService == null || (eligibilityModelLIZ = iGatekeeperService.LIZ("tiktok_content_creation")) == null) ? null : eligibilityModelLIZ.decisionCode;
        return Intrinsics.LJFF(str, "au_u16_existing_only_you_post") || Intrinsics.LJFF(str, "au_u16_new_only_you_post");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final boolean LJII() {
        return AnonymousClass1084.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final PrivacyUserSettingsV2 LJIIIIZZ() {
        C191821102p.LIZIZ().getClass();
        return C191880104w.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final boolean LJIIJ() {
        if (!C0XQ7.LJFF().isLogin()) {
            return false;
        }
        boolean z = C131700ep.LIZ;
        return C131700ep.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJIILJJIL() {
        C191821102p.LIZIZ().getClass();
        C191880104w.LIZLLL(null, null, true);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final boolean LJIL() {
        if (!C191985108x.LIZLLL(ComplianceServiceProvider.LJIJJ().LJIIIZ(0, "checkup")).LIZIZ) {
            return false;
        }
        C1258004w6.LIZ.getClass();
        return C1258004w6.LIZ() == 2 || C1258004w6.LIZ() == 4;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final boolean LJJ() {
        C191821102p.LIZIZ().getClass();
        C191871104n.LIZIZ().getClass();
        RestrictionResponse restrictionResponseLIZ = C191874104q.LIZ();
        return restrictionResponseLIZ != null && restrictionResponseLIZ.getLogReportEnable();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final boolean LJJIFFI() {
        return C1207604ny.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final boolean LJJIJIIJI() {
        Integer numValueOf;
        C191821102p.LIZIZ().getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, "display_profile_when_sharing_links");
        if (privacySettingsRestrictionItemLJIIJJI == null || (numValueOf = Integer.valueOf(privacySettingsRestrictionItemLJIIJJI.showType)) == null) {
            return false;
        }
        return numValueOf.intValue() == 0 || numValueOf.intValue() == 1;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJJIJIIJIL() {
        Integer numLIZ;
        C191821102p.LIZIZ().getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        if (privacyUserSettingsV2LJIIL == null || (numLIZ = privacyUserSettingsV2LJIIL.LIZ("content_reuse_permission")) == null) {
            return;
        }
        int iIntValue = numLIZ.intValue();
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        new C1061730djf();
        C1548820qPI.LIZIZ(new C397901gf(jCurrentThreadTimeMillis, C1061730djf.LIZLLL(C2097608Jq.LJIIIIZZ(new Pair("permission_key", "content_reuse_permission"), new Pair("permission_value", Integer.valueOf(iIntValue)))), "privacy_permission_change"));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LIZLLL(C19EG c19eg) {
        PopupManager.LJIIZILJ(new C10GR(c19eg, new AwS572S0100000_28(c19eg, 165)) { // from class: X.0TN8
            public final C19EG LL;
            public final Function0<Unit> LLILLJJLI;
            public final int LLILLL = 370;

            @Override // X.InterfaceC20660415sw
            public final C688120Qyw i2() {
                C19EG c19eg2 = this.LL;
                return new C688120Qyw(c19eg2, c19eg2, null);
            }

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return this.LLILLL;
            }

            {
                this.LL = c19eg;
                this.LLILLJJLI = awS572S0100000_28;
            }

            @Override // X.InterfaceC20659015si
            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                this.LLILLJJLI.invoke();
            }
        }, new C1668306g5("pns_merge_view_history_phase_3"));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C106C LJIIL(java.lang.String r18) {
        /*
            r17 = this;
            X.0tYE r0 = X.C1669680tYE.LIZ
            r0.getClass()
            java.lang.Class<com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService> r1 = com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService.class
            r2 = 0
            r5 = 14
            r6 = 0
            r3 = r2
            r4 = r2
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService r0 = (com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService) r0
            r11 = 0
            if (r0 == 0) goto Lad
            com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager r0 = r0.LJIJ()
            if (r0 == 0) goto Lad
            java.lang.String r0 = "settings"
            X.103L r0 = com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager.LJ(r0)
            if (r0 == 0) goto Lad
            java.util.List<? extends X.104A> r0 = r0.LJ
            if (r0 == 0) goto Lad
            java.util.Iterator r4 = r0.iterator()
        L2c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r2 = r4.next()
            X.104A r2 = (X.C104A) r2
            boolean r0 = r2 instanceof X.C191852103u
            r3 = r18
            if (r0 == 0) goto Lb0
            X.103u r2 = (X.C191852103u) r2
            java.util.List<X.104A> r0 = r2.LJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L48:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            X.104A r2 = (X.C104A) r2
            boolean r0 = r2 instanceof X.C107P
            if (r0 == 0) goto L48
            java.lang.String r0 = r2.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L48
            X.107P r2 = (X.C107P) r2
        L62:
            if (r2 == 0) goto Lad
            java.util.Map<java.lang.String, kotlin.Pair<X.0tWw, X.0tWw>> r1 = X.C1669680tYE.LIZIZ
            java.lang.String r0 = r2.LIZ
            java.lang.Object r1 = r1.get(r0)
            kotlin.Pair r1 = (kotlin.Pair) r1
            X.103N r0 = r2.LJ
            java.lang.CharSequence r0 = r0.LIZ
            java.lang.String r15 = ""
            if (r0 != 0) goto L77
            r0 = r15
        L77:
            java.lang.String r12 = r0.toString()
            java.lang.Class<com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService> r6 = com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService.class
            r7 = 0
            r8 = r7
            r9 = r7
            r10 = r5
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService r0 = (com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService) r0
            if (r0 == 0) goto L90
            java.lang.String r0 = r0.LJII(r3)
            if (r0 == 0) goto L90
            r15 = r0
        L90:
            if (r1 == 0) goto Lae
            java.lang.Object r13 = r1.getFirst()
            X.0tWw r13 = (X.C1668880tWw) r13
            java.lang.Object r11 = r1.getSecond()
            X.0tWw r11 = (X.C1668880tWw) r11
        L9e:
            r14 = r11
            X.106C r11 = new X.106C
            kotlin.jvm.internal.AwS642S0100000_28 r1 = new kotlin.jvm.internal.AwS642S0100000_28
            r0 = 63
            r1.<init>(r2, r0)
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
        Lad:
            return r11
        Lae:
            r13 = r11
            goto L9e
        Lb0:
            boolean r0 = r2 instanceof X.C107P
            if (r0 == 0) goto L2c
            java.lang.String r0 = r2.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L2c
            X.107P r2 = (X.C107P) r2
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl.LJIIL(java.lang.String):X.106C");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJIILL(JSONObject jSONObject) {
        AnonymousClass1057.LIZ.getClass();
        String strOptString = jSONObject.optString("owner_ids");
        if (strOptString != null) {
            C105B.LIZ(jSONObject.optString("video_owner_id"), a0.LJJLIIIJILLIZJL(strOptString, new String[]{","}, 0, 6));
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJIJ(String str) {
        if (str != null && Intrinsics.LJFF(str, C0XQ7.LJFF().getCurUserId())) {
            C0C64.LJIILLIIL().LJIIIZ(31744, "ac_reuse_permission_switch", true, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJIJJLI(JSONObject jSONObject) {
        AnonymousClass1057.LIZ.getClass();
        C105B.LIZ(jSONObject.optString("video_owner_id"), Collections.singletonList(jSONObject.optString("owner_id")));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJJI(String str) {
        C191821102p.LIZ();
        C103A.LIZJ(null, str, null, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJJII(C19EG c19eg) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19eg), null, null, new C751170TdL(c19eg, "personal_homepage", null), 3);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJJIIJ(String str) {
        C191880104w.LJFF(C191821102p.LIZIZ(), str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJJIIJZLJL(String str) {
        C191821102p.LIZIZ().getClass();
        C191880104w.LIZIZ(str, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final PrivacySettingsAgreementRecord LJJIJ(String str) {
        C191821102p.LIZIZ().getClass();
        return C191880104w.LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJJIJIL(List<C1381570m3X> list) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1381560m3W(list, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final PrivacySettingsRestrictionItem LJIIIZ(int i, String str) {
        C191821102p.LIZIZ().getClass();
        return C191880104w.LJIIJJI(i, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJIILIIL(String str, ViewGroup viewGroup) {
        C1915050zvz.LIZ.getClass();
        C1915050zvz.LIZ(str, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJJIIZI(Aweme aweme, Collection<? extends Comment> collection) {
        AnonymousClass1057.LIZ.getClass();
        C191819102n.LIZ.getClass();
        if (C191819102n.LIZJ()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collection, 10));
            Iterator<T> it2 = collection.iterator();
            while (true) {
                String uid = null;
                if (!it2.hasNext()) {
                    break;
                }
                User user = ((Comment) it2.next()).getUser();
                if (user != null) {
                    uid = user.getUid();
                }
                arrayList.add(uid);
            }
            if (!arrayList.isEmpty()) {
                C105B.LIZ(AwemeExtKt.getAuthorUid(aweme), arrayList);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LIZ(Context context, FragmentManager fragmentManager, String str) {
        IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
        if (iPrivacySettingAPIService != null) {
            iPrivacySettingAPIService.LIZ(context, fragmentManager, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final List LJIILLIIL(Context context, AbsSceneAdaptationScene absSceneAdaptationScene, AbsSceneAdaptationScene absSceneAdaptationScene2) {
        C191821102p.LIZJ().getClass();
        C103L c103lLJ = TPSCRenderManager.LJ("post_process");
        if (c103lLJ == null) {
            C191833103b.LIZ("post_process", AFwS271S0000000_28.get$arr$(435), AFwS217S0000000_28.get$arr$(765), AFwS217S0000000_28.get$arr$(766), null, null);
            c103lLJ = C191833103b.LIZ.get("post_process");
            if (c103lLJ == null) {
                return C13BV.INSTANCE;
            }
        }
        return C104C.LIZ(new C191848103q(context, absSceneAdaptationScene, absSceneAdaptationScene2, "post_process", null, null, null, 240), c103lLJ.LJ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJIIZILJ(final Context context, final LifecycleOwner lifecycleOwner, JSONObject jSONObject) {
        String strOptString;
        AnonymousClass1057.LIZ.getClass();
        C191819102n.LIZ.getClass();
        if (C191819102n.LIZJ() && (strOptString = jSONObject.optString("object_id")) != null) {
            AbstractC191867104j abstractC191867104j = C105S.LIZ;
            if (AnonymousClass1057.LIZ("guide_content_reuse_on_report")) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                C19482711Kf c19482711KfLIZLLL = C632140Oqq.LIZLLL(((PrivacyItemSettingsApi) AnonymousClass1057.LIZIZ.getValue()).privacyItemSettings(strOptString, "reuse_curr_user_item_id").LJL(C11S5.LIZ()), "/tiktok/privacy/item/settings/v1", null);
                if (ComplianceServiceProvider.LJIJJ().LJJ()) {
                    c19482711KfLIZLLL = C11NZ.LJIJJLI(new C1852020yIK(c19482711KfLIZLLL, "/tiktok/privacy/item/settings/v1", null));
                }
                c19482711KfLIZLLL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.105A
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("NotifyManager$VideoEventHandler@1a40.handle$1");
                        String str = ((PrivacyItemSettingsResponse) obj).getScenesValues().get("reuse_curr_user_item_id");
                        if (str != null) {
                            AnonymousClass1057.LIZ.getClass();
                            if (AnonymousClass1057.LIZ("guide_content_reuse_on_report")) {
                                C105S.LIZ.LIZIZ(context, lifecycleOwner, str, jCurrentTimeMillis);
                            }
                        }
                        C1C7U.LIZIZ("NotifyManager$VideoEventHandler@1a40.handle$1");
                    }
                }, new C09JN() { // from class: X.00Nk
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("NotifyManager$VideoEventHandler@1a40.handle$2");
                        C1C7U.LIZIZ("NotifyManager$VideoEventHandler@1a40.handle$2");
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJIJI(Integer num, String str, Map map) {
        if (num == null) {
            C191821102p.LIZIZ().getClass();
            C191879104v c191879104vLIZIZ = C191871104n.LIZIZ();
            C191879104v c191879104v = C191879104v.LIZ;
            c191879104vLIZIZ.getClass();
            C191879104v.LIZJ(null, str);
            C191880104w.LJIILL(2, str);
            return;
        }
        if (map == null) {
            C191880104w c191880104wLIZIZ = C191821102p.LIZIZ();
            int iIntValue = num.intValue();
            c191880104wLIZIZ.getClass();
            C191880104w.LJIJ(iIntValue, str);
            return;
        }
        C191880104w c191880104wLIZIZ2 = C191821102p.LIZIZ();
        int iIntValue2 = num.intValue();
        c191880104wLIZIZ2.getClass();
        C191880104w.LJIILJJIL(iIntValue2, str, map).LJJLL(new C09JN() { // from class: X.00Nh
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PrivacyServiceImpl@87d1.markPrivacyAgreementRecord$1");
                C1C7U.LIZIZ("PrivacyServiceImpl@87d1.markPrivacyAgreementRecord$1");
            }
        }, new C09JN() { // from class: X.00Ni
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PrivacyServiceImpl@87d1.markPrivacyAgreementRecord$2");
                C1C7U.LIZIZ("PrivacyServiceImpl@87d1.markPrivacyAgreementRecord$2");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJIJJ(Context context, String str, final Function0<Unit> function0) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//privacy/direct_message_notification");
        if (str != null) {
            smartRouteBuildRoute.withParam("page_tag", str);
        }
        smartRouteBuildRoute.withCallback(new AbsOpenResultCallback() { // from class: X.105D
            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
        smartRouteBuildRoute.open();
    }
}
