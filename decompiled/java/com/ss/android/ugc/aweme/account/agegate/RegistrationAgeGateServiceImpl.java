package com.ss.android.ugc.aweme.account.agegate;

import X.C01GW;
import X.C10UJ;
import X.C10UK;
import X.C19257210Vm;
import X.C19257310Vn;
import X.C19257710Vr;
import X.C19257810Vs;
import X.C19257910Vt;
import X.C19299310et;
import X.C19300310f3;
import X.C2097608Jq;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC19257610Vq;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateContainerFragment;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import com.ss.android.ugc.aweme.services.IRegistrationAgeGateService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public class RegistrationAgeGateServiceImpl implements IRegistrationAgeGateService {
    public static Function1<? super ViewGroup, Unit> LIZIZ = AFwS271S0000000_28.get$arr$(21);
    public static Map<String, String> LIZJ = C2097608Jq.LJ();
    public static Map<String, String> LIZLLL = C2097608Jq.LJ();
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(73));

    public final C19257210Vm LIZ() {
        return (C19257210Vm) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final void dismiss() {
        ComplianceServiceProvider.LIZLLL().dismiss();
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final boolean isFtcForRegistration() {
        return ComplianceServiceProvider.LIZLLL().isFtcForRegistration();
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final void refreshUiModel() {
        ComplianceServiceProvider.LIZLLL().refreshUiModel();
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final void displayFeedback(PNSFeedbackModel pNSFeedbackModel) {
        ComplianceServiceProvider.LIZLLL().displayFeedback(pNSFeedbackModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.util.HashMap<java.lang.String, java.lang.String> r12, boolean r13, boolean r14, kotlin.jvm.functions.Function1<? super android.view.ViewGroup, kotlin.Unit> r15) {
        /*
            r11 = this;
            if (r12 == 0) goto L9
            java.lang.String r1 = "page_type"
            java.lang.String r0 = "birthday"
            r12.put(r1, r0)
        L9:
            java.lang.String r1 = "ui_type"
            if (r14 != 0) goto L95
            if (r12 == 0) goto L14
            java.lang.String r0 = "nuj_revamp"
            r12.put(r1, r0)
        L14:
            com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl.LIZIZ = r15
            if (r12 == 0) goto L1e
            java.util.Map r0 = X.C2097608Jq.LJIIZILJ(r12)
            if (r0 != 0) goto L22
        L1e:
            java.util.Map r0 = X.C2097608Jq.LJ()
        L22:
            com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl.LIZJ = r0
            X.10Vm r1 = r11.LIZ()
            boolean r0 = r11.isFtcForRegistration()
            r1.getClass()
            X.10Vn r4 = X.C19257210Vm.LIZIZ
            r4.setFtc(r0)
            java.lang.Class<com.tiktok.ef.i18n.service.manager.I18nServiceApi> r5 = com.tiktok.ef.i18n.service.manager.I18nServiceApi.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.tiktok.ef.i18n.service.manager.I18nServiceApi r0 = (com.tiktok.ef.i18n.service.manager.I18nServiceApi) r0
            if (r0 == 0) goto L59
            com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi r1 = r0.LIZ()
            if (r1 == 0) goto L59
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            java.lang.String r3 = r1.LJIJJ(r0)
            if (r3 != 0) goto L61
        L59:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r3 = X.C786410Ut5.t2(r0)
        L61:
            X.10Vm r2 = r11.LIZ()
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r0 = X.C2222691Bz1.LIZ()
            r1.<init>(r3, r0)
            r2.getClass()
            r4.setLocale(r1)
            if (r12 == 0) goto L80
            X.10Vm r0 = r11.LIZ()
            r0.getClass()
            X.C19257210Vm.LIZIZ(r12)
        L80:
            X.10Vm r0 = r11.LIZ()
            r0.getClass()
            r4.setGuestMode(r13)
            X.10Vm r0 = r11.LIZ()
            r0.getClass()
            r4.setHasTransitionAnimation(r14)
            return
        L95:
            if (r12 == 0) goto L14
            java.lang.String r0 = "online"
            r12.put(r1, r0)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl.LIZIZ(java.util.HashMap, boolean, boolean, kotlin.jvm.functions.Function1):void");
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final void verifyAgeForRegistrationSDK(Context context, HashMap<String, String> map, Bundle bundle, AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow, C10UK c10uk, boolean z, boolean z2, Function1<? super ViewGroup, Unit> function1) {
        LIZIZ(map, z, z2, function1);
        C19257210Vm.LIZ(LIZ(), EnumC19257610Vq.REGISTRATION, new C10UJ(c10uk, map, z), context, new C19300310f3(bundle, ageGateSdkRegistrationFlow, z, isFtcForRegistration(), false), new C19299310et(context, ageGateSdkRegistrationFlow), null, ComplianceServiceProvider.LIZLLL().LJIILLIIL(), 32);
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final Fragment getAgeGateFragment(Context context, HashMap<String, String> map, Bundle bundle, AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow, C10UK c10uk, boolean z, boolean z2, Function1<? super ViewGroup, Unit> function1, boolean z3) {
        LIZIZ(map, z, z2, function1);
        C19257210Vm c19257210VmLIZ = LIZ();
        EnumC19257610Vq enumC19257610Vq = EnumC19257610Vq.REGISTRATION;
        C10UJ c10uj = new C10UJ(c10uk, map, z);
        C19299310et c19299310et = new C19299310et(context, ageGateSdkRegistrationFlow);
        C19300310f3 c19300310f3 = new C19300310f3(bundle, ageGateSdkRegistrationFlow, z, isFtcForRegistration(), z3);
        c19257210VmLIZ.getClass();
        C19257710Vr.LIZ.put(enumC19257610Vq, c10uj);
        C19257810Vs.LIZ.put(enumC19257610Vq, c19299310et);
        C19257910Vt.LIZ.put(enumC19257610Vq, c19300310f3);
        C19257310Vn c19257310Vn = C19257210Vm.LIZIZ;
        c19257310Vn.setScene(enumC19257610Vq);
        PNSAgeGateContainerFragment pNSAgeGateContainerFragment = new PNSAgeGateContainerFragment();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJIZ(bundle2, "age_gate_params", c19257310Vn);
        pNSAgeGateContainerFragment.setArguments(bundle2);
        return pNSAgeGateContainerFragment;
    }
}
