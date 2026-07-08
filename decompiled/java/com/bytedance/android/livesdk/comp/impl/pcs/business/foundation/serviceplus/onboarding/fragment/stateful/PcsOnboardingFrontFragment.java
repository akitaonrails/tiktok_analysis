package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful;

import X.C01GW;
import X.C0KA3;
import X.C0KBP;
import X.C0TGC;
import X.C1100630ekP;
import X.C1106750euH;
import X.C1121890fIh;
import X.C1122150fJ7;
import X.C1161920gLG;
import X.C1388190mED;
import X.C13LP;
import X.C1410930mot;
import X.C1548820qPI;
import X.C1554960qZC;
import X.C1558950qfd;
import X.C1697810uHb;
import X.C1781550wSf;
import X.C1822260xWK;
import X.C1822270xWL;
import X.C1823890xYx;
import X.C1823930xZ1;
import X.C1823970xZ5;
import X.C1823990xZ7;
import X.C1824680xaE;
import X.C1826730xdX;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C23250099c;
import X.C262100zr;
import X.C452501pT;
import X.C500260Jjc;
import X.C507500JvI;
import X.C517510KRh;
import X.C518990KWz;
import X.C723850SaN;
import X.C786410Ut5;
import X.C860150Xoj;
import X.C912240ZqY;
import X.InterfaceC1141530foN;
import X.InterfaceC1555100qZQ;
import X.InterfaceC517590KRp;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.chatroom.api.IndustrySelection;
import com.bytedance.android.livesdk.chatroom.api.UpsellRevokeInfo;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onboarding.LivePcsOptinPageUIStyleSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.android.livesdk.livesetting.broadcast.pcs.LivePcsOnboardingPerfOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.subscription.SubscribeUpsellLynxUrlSetting;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SMBOptInQualificationInfo;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingFrontFragment extends PcsOnboardingStatefulStepFragment implements InterfaceC1141530foN {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISoiZzw2HELIOSOjMlKiojJDA/ZyA9KiotOys6JiJiLz0yLygpJzt9OzEtPSo1PSliGSwgBysuJi4hLCwiLgkhJys4Dz0yLygpJzs=";
    public final String LLLIILIL = "ServiceOptIn";
    public final String LLLIL = "ServiceOptIn";
    public final int LLLILZ = 1008;
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new C1823990xZ7(this));
    public final C1823890xYx LLLILZLLLI = new C1823890xYx(this);
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new C1824680xaE(this));
    public boolean LLLJ;

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final CharSequence jT() {
        return (SpannableString) this.LLLIZZ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String lT() {
        return (String) this.LLLILZJ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final void pT() {
        C723850SaN.LIZ(this, false, null, new C1558950qfd(this), 3);
    }

    public final void qT() {
        GScope gScope;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C1781550wSf c1781550wSf;
        if (this.LLLFFI || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ((gScope = GScope.LL), "source_default_key", C1781550wSf.class, null)) == null || (c1781550wSf = (C1781550wSf) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return;
        }
        C1554960qZC.LIZLLL(gScope, C1781550wSf.class, null);
        try {
            PcsOnboardingVM pcsOnboardingVMJS = JS();
            long j = c1781550wSf.LL;
            boolean z = c1781550wSf.LLILLJJLI;
            int i = c1781550wSf.LLILLL;
            SMBOptInQualificationResponse.ResponseData responseData = pcsOnboardingVMJS.getState().LLILLJJLI;
            if (responseData != null) {
                IndustrySelection industrySelection = responseData.industrySelection;
                if (industrySelection == null) {
                    industrySelection = new IndustrySelection();
                }
                industrySelection.industryId = j;
                industrySelection.canReselect = z;
                industrySelection.riskLevel = i;
                responseData.industrySelection = industrySelection;
                pcsOnboardingVMJS.setState(new C1410930mot(responseData));
            }
            if (c1781550wSf.LLILZ) {
                return;
            }
            xT();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1121890fIh.LIZIZ("Front proceedNext failed after native industry select (GScope)", e);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void PS() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C860150Xoj(this, null), 3);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void VS() {
        super.VS();
        AT("back");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void hT() {
        super.hT();
        SMBOptInQualificationResponse.ResponseData responseData = JS().getState().LLILLJJLI;
        if (responseData == null) {
            responseData = new SMBOptInQualificationResponse.ResponseData();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showBottomFunctionView onShowSuccess isFromCache=");
        sbLIZ.append(sT());
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            int i = this.LLJLLL;
            Boolean boolST = sT();
            interfaceC517590KRpLIZJ.LJ(new C0KBP(i, boolST != null ? C2097608Jq.LJIIJ(new Pair("is_cache", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(boolST.booleanValue())) ? 1 : 0))) : new LinkedHashMap()));
        }
        if (this.LLLJ) {
            return;
        }
        this.LLLJ = true;
        StringBuilder sb = new StringBuilder("ServiceOptIn perf.onShowSuccess show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        String str = "";
        if (showEntrance == null) {
            showEntrance = "";
        }
        sb.append(showEntrance);
        Boolean boolST2 = sT();
        if (boolST2 != null) {
            boolean zBooleanValue = boolST2.booleanValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(", is_cache=");
            sbLIZ2.append(C500260Jjc.LJJJI(Boolean.valueOf(zBooleanValue)) ? 1 : 0);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            if (strLIZIZ != null) {
                str = strLIZIZ;
            }
        }
        sb.append(str);
        C1121890fIh.LIZ(sb.toString());
        String anchorId = JS().DQ2().getAnchorId();
        String showEntrance2 = JS().DQ2().getShowEntrance();
        boolean z = responseData.qualification;
        SMBOptInQualificationInfo sMBOptInQualificationInfo = (SMBOptInQualificationInfo) C13LP.LJJJLL(responseData.qualificationInfo);
        Integer numValueOf = sMBOptInQualificationInfo != null ? Integer.valueOf(sMBOptInQualificationInfo.type) : null;
        String pcsTrackContext = JS().DQ2().getPcsTrackContext();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long lValueOf = Long.valueOf(JS().DQ2().getClickGoLiveBtnTimeStamp());
        if (lValueOf.longValue() > 0) {
            linkedHashMap.put("show_latency_from_go_live_click", String.valueOf(System.currentTimeMillis() - lValueOf.longValue()));
        }
        rT(null, linkedHashMap);
        C518990KWz.LIZLLL(anchorId, showEntrance2, true, z, numValueOf, pcsTrackContext, linkedHashMap);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLLFFI) {
            return;
        }
        C1548820qPI.LJIIIIZZ("live_smb_onboarding_industry_selection_complete", this);
        C1548820qPI.LJIIIIZZ("smb_optin_process_ended", this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServiceOptIn onDestroy show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams2;
        super.onDestroyView();
        if (this.LLLFFI) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Map<String, String> mapLIZ = C0TGC.LIZ();
        C1822260xWK c1822260xWKGS = GS();
        String str = null;
        mapLIZ.put("has_load_assem", c1822260xWKGS != null ? Boolean.valueOf(c1822260xWKGS.LLILZ).toString() : null);
        C1822260xWK c1822260xWKGS2 = GS();
        mapLIZ.put("is_saf", (c1822260xWKGS2 == null || (pcsServicePlusOptinPageParams2 = c1822260xWKGS2.LLILLJJLI) == null) ? null : pcsServicePlusOptinPageParams2.getExtra().get("is_saf"));
        C1822260xWK c1822260xWKGS3 = GS();
        if (c1822260xWKGS3 != null && (pcsServicePlusOptinPageParams = c1822260xWKGS3.LLILLJJLI) != null) {
            str = pcsServicePlusOptinPageParams.getExtra().get("launch_duration");
        }
        mapLIZ.put("launch_duration", str);
        XS("onDestroyView", strLIZIZ, mapLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ServiceOptIn onDestroyView show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        sbLIZ2.append(showEntrance2 != null ? showEntrance2 : "");
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLLFFI || JS().EQ2() == null) {
            return;
        }
        qT();
    }

    public final Boolean sT() {
        return JS().getState().LLILZLL;
    }

    public final void xT() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (LivePcsOptinPageUIStyleSetting.INSTANCE.getValue() != 0) {
            SMBOptInQualificationResponse.ResponseData responseDataEQ2 = JS().EQ2();
            if (responseDataEQ2 != null && C1122150fJ7.LIZLLL(responseDataEQ2)) {
                QS(R.id.pl1, R.id.a3_, null, null, strLIZIZ);
                return;
            } else {
                JS().LLILZLL = 0;
                QS(R.id.pl1, R.id.a38, null, null, strLIZIZ);
                return;
            }
        }
        Context context = getContext();
        if (context != null) {
            Gson gson = C1822270xWL.LIZ;
            PcsServicePlusOptinPageParams pcsServicePlusOptinPageParamsDQ2 = JS().DQ2();
            SubscribeUpsellLynxUrlSetting subscribeUpsellLynxUrlSetting = SubscribeUpsellLynxUrlSetting.INSTANCE;
            String showEntrance2 = pcsServicePlusOptinPageParamsDQ2.getShowEntrance();
            if (showEntrance2 == null) {
                showEntrance2 = "";
            }
            String pcsTrackContext = pcsServicePlusOptinPageParamsDQ2.getPcsTrackContext();
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, subscribeUpsellLynxUrlSetting.getSmbOptInServiceEnableSchema(showEntrance2, "1", "1", pcsTrackContext != null ? pcsTrackContext : "", new C1823970xZ5()));
        }
        eT();
        vT("smb_opt_in_service_enable");
    }

    public final void zT() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServiceOptIn requestOptinQualification request show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        sbLIZ.append(", has_smb_qualification_cache=0");
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        JS().TQ2(new C1823930xZ1(this));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final String FS() {
        return this.LLLIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final Function0<Unit> kT() {
        return this.LLLILZLLLI;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String mT() {
        return this.LLLIILIL;
    }

    public final void AT(String str) {
        long jLongValue;
        Long lValueOf;
        SMBOptInQualificationResponse.ResponseData responseData = JS().getState().LLILLJJLI;
        if (responseData == null) {
            responseData = new SMBOptInQualificationResponse.ResponseData();
        }
        String anchorId = JS().DQ2().getAnchorId();
        String showEntrance = JS().DQ2().getShowEntrance();
        boolean z = responseData.qualification;
        SMBOptInQualificationInfo sMBOptInQualificationInfo = (SMBOptInQualificationInfo) C13LP.LJJJLL(responseData.qualificationInfo);
        Integer numValueOf = null;
        if (sMBOptInQualificationInfo != null) {
            numValueOf = Integer.valueOf(sMBOptInQualificationInfo.type);
        }
        String pcsTrackContext = JS().DQ2().getPcsTrackContext();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1822260xWK c1822260xWKJQ2 = JS().JQ2();
        if (c1822260xWKJQ2 != null && (lValueOf = Long.valueOf(c1822260xWKJQ2.LLILZIL)) != null) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 0;
        }
        linkedHashMap.put("decision_time_cost", String.valueOf(jCurrentTimeMillis - jLongValue));
        rT(str, linkedHashMap);
        C518990KWz.LIZLLL(anchorId, showEntrance, false, z, numValueOf, pcsTrackContext, linkedHashMap);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void initView(View view) {
        int i;
        Boolean boolValueOf;
        int i2;
        UpsellRevokeInfo upsellRevokeInfo;
        super.initView(view);
        JS().LJLJLJ();
        NS();
        TextView textView = (TextView) view.findViewById(R.id.cdm);
        if (textView != null) {
            textView.setTextAlignment(4);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setTextColor(-1089071069);
        }
        SMBOptInQualificationResponse.ResponseData responseDataEQ2 = JS().EQ2();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServiceOptIn initView show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        sbLIZ.append(", has_smb_qualification_cache=0, opt_in_status=");
        int i3 = 0;
        if (responseDataEQ2 != null) {
            i = responseDataEQ2.servicePlusOptInStatus;
        } else {
            i = 0;
        }
        sbLIZ.append(i);
        sbLIZ.append(", qualification=");
        Boolean boolValueOf2 = null;
        if (responseDataEQ2 != null) {
            boolValueOf = Boolean.valueOf(responseDataEQ2.qualification);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0);
        sbLIZ.append(", revoke_reason=");
        if (responseDataEQ2 != null && (upsellRevokeInfo = responseDataEQ2.revokeInfo) != null) {
            i2 = upsellRevokeInfo.revokeReason;
        } else {
            i2 = 0;
        }
        sbLIZ.append(i2);
        sbLIZ.append(", inferred_industry_type=");
        if (responseDataEQ2 != null) {
            i3 = responseDataEQ2.inferredIndustryType;
        }
        sbLIZ.append(i3);
        sbLIZ.append(", has_industry_selection=");
        if (responseDataEQ2 != null) {
            boolValueOf2 = Boolean.valueOf(responseDataEQ2.hasValidatedIndustryLabel);
        }
        sbLIZ.append(C500260Jjc.LJJJI(boolValueOf2) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Activity activityLIZ;
        Context context = (Context) C507500JvI.LIZIZ().get();
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_smb_onboarding_industry_selection_complete")) {
            JS();
            if (LivePcsOnboardingPerfOptSetting.INSTANCE.enabledFrontPrefetch()) {
                C1121890fIh.LIZ("refreshSmbQualification: clearing and re-prefetching");
                C1106750euH c1106750euH = C1106750euH.LIZ;
                c1106750euH.LIZ("/webcast/sub/smb/qualification/", C2097608Jq.LJ());
                c1106750euH.LIZIZ(new C1100630ekP(C0KA3.LIZ), "/webcast/sub/smb/qualification/", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(363), AFwS237S0000000_7.get$arr$(364));
            }
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                activityLIZ.finish();
                C786410Ut5.ae(R.anim.lu, activityLIZ, R.anim.lw);
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C912240ZqY(this, null), 3);
            return;
        }
        if (!Intrinsics.LJFF(c262100zr.LIZ, "smb_optin_process_ended")) {
            return;
        }
        eT();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        Boolean boolValueOf;
        int i2;
        int i3;
        UpsellRevokeInfo upsellRevokeInfo;
        super.onCreate(bundle);
        if (this.LLLFFI) {
            return;
        }
        C1548820qPI.LIZLLL("live_smb_onboarding_industry_selection_complete", this);
        C1548820qPI.LIZLLL("smb_optin_process_ended", this);
        SMBOptInQualificationResponse.ResponseData responseDataEQ2 = JS().EQ2();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServiceOptIn onCreate show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        String str = "";
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        sbLIZ.append(", has_smb_qualification_cache=0, opt_in_status=");
        if (responseDataEQ2 != null) {
            i = responseDataEQ2.servicePlusOptInStatus;
        } else {
            i = 0;
        }
        sbLIZ.append(i);
        sbLIZ.append(", qualification=");
        Boolean boolValueOf2 = null;
        if (responseDataEQ2 != null) {
            boolValueOf = Boolean.valueOf(responseDataEQ2.qualification);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0);
        sbLIZ.append(", revoke_reason=");
        if (responseDataEQ2 != null && (upsellRevokeInfo = responseDataEQ2.revokeInfo) != null) {
            i2 = upsellRevokeInfo.revokeReason;
        } else {
            i2 = 0;
        }
        sbLIZ.append(i2);
        sbLIZ.append(", inferred_industry_type=");
        if (responseDataEQ2 != null) {
            i3 = responseDataEQ2.inferredIndustryType;
        } else {
            i3 = 0;
        }
        sbLIZ.append(i3);
        sbLIZ.append(", has_industry_selection=");
        if (responseDataEQ2 != null) {
            boolValueOf2 = Boolean.valueOf(responseDataEQ2.hasValidatedIndustryLabel);
        }
        sbLIZ.append(C500260Jjc.LJJJI(boolValueOf2) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = 0;
        try {
            String str2 = JS().DQ2().getExtra().get("launch_time");
            if (str2 != null) {
                long j = CastLongProtector.parseLong(str2);
                if (j != 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        JS().DQ2().getExtra().put("launch_duration", String.valueOf(jCurrentTimeMillis));
        C517510KRh c517510KRh = new C517510KRh(this.LLJLLL, this.LLLILZ, JS().DQ2().getShowEntrance(), C2097608Jq.LJIIJ(new Pair("is_saf", JS().DQ2().getExtra().get("is_saf")), new Pair("launch_duration", String.valueOf(jCurrentTimeMillis))));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str = showEntrance2;
        }
        sbLIZ2.append(str);
        sbLIZ2.append(", launch_duration=");
        sbLIZ2.append(jCurrentTimeMillis);
        ZS("ServiceOptIn", c517510KRh, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final boolean uT(SMBOptInQualificationResponse.ResponseData responseData) {
        Integer numValueOf;
        UpsellRevokeInfo upsellRevokeInfo;
        List listLJIIJJI = C1697810uHb.LJIIJJI(2, 3);
        if (responseData != null && (upsellRevokeInfo = responseData.revokeInfo) != null) {
            numValueOf = Integer.valueOf(upsellRevokeInfo.revokeReason);
        } else {
            numValueOf = null;
        }
        if (!C13LP.LJJJJ(numValueOf, listLJIIJJI) && (responseData == null || !responseData.inBlockIndustryCoolingDown)) {
            return false;
        }
        return true;
    }

    public final void vT(String str) {
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LIZJ(str, new C0KBP(this.LLJLLL));
        }
    }

    public final void rT(String str, Map map) {
        String strLIZIZ;
        map.put("smb_tag", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2()))) ? 1 : 0));
        map.put("region_support_kyb", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2()))) ? 1 : 0));
        if (Intrinsics.LJFF(C1122150fJ7.LIZIZ(JS().EQ2()), "smb_target")) {
            strLIZIZ = "smb";
        } else {
            strLIZIZ = C1122150fJ7.LIZIZ(JS().EQ2());
        }
        map.put("industry_tag", strLIZIZ);
        map.put("existing_verification", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2()))) ? 1 : 0));
        if (str != null) {
            map.put("click_position", str);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void XS(String str, String str2, Map<String, String> map) {
        String string;
        String str3;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams2;
        Map<String, String> linkedHashMap = map;
        if (map == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        C1822260xWK c1822260xWKGS = GS();
        String str4 = null;
        if (c1822260xWKGS != null) {
            string = Boolean.valueOf(c1822260xWKGS.LLILZ).toString();
        } else {
            string = null;
        }
        linkedHashMap.put("has_load_assem", string);
        C1822260xWK c1822260xWKGS2 = GS();
        if (c1822260xWKGS2 != null && (pcsServicePlusOptinPageParams2 = c1822260xWKGS2.LLILLJJLI) != null) {
            str3 = pcsServicePlusOptinPageParams2.getExtra().get("is_saf");
        } else {
            str3 = null;
        }
        linkedHashMap.put("is_saf", str3);
        C1822260xWK c1822260xWKGS3 = GS();
        if (c1822260xWKGS3 != null && (pcsServicePlusOptinPageParams = c1822260xWKGS3.LLILLJJLI) != null) {
            str4 = pcsServicePlusOptinPageParams.getExtra().get("launch_duration");
        }
        linkedHashMap.put("launch_duration", str4);
        super.XS(str, str2, linkedHashMap);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewDS = super.dS(layoutInflater, viewGroup, bundle);
        NS();
        return viewDS;
    }
}
