package com.ss.android.ugc.tiktok.pns.privacy.setting.impl;

import X.C09JN;
import X.C1163504gr;
import X.C11S5;
import X.C1701940uOG;
import X.C1783100wVA;
import X.C1870270yll;
import X.EnumC1873990yrl;
import Y.AfS197S0100000_28;
import Y.AfS53S1100000_28;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.pns.privacy.setting.agechange.AgeGradApi;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IAgeGradService;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGradServiceImpl implements IAgeGradService {
    public Map<String, EnumC1873990yrl> LIZ = new LinkedHashMap();
    public final String LIZIZ = "AgeGradService";

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IAgeGradService
    public final void LIZ(String str) {
        try {
            ((AgeGradApi) C1870270yll.LIZ.getValue()).updateAgeGraduationStatus(str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS197S0100000_28(this, 39)).LJJIJIIJI(new AfS197S0100000_28(this, 40)).LJJLL(new AfS53S1100000_28(this, str, 8), new C09JN() { // from class: X.0ylk
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("AgeGradServiceImpl@110c.updateAgeGradStatus$4");
                    C1C7U.LIZIZ("AgeGradServiceImpl@110c.updateAgeGradStatus$4");
                }
            });
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IAgeGradService
    public final int LIZIZ(String str) {
        Map<String, Integer> linkedHashMap;
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService == null || (linkedHashMap = iPrivacySettingsDepService.LJIIJ()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            EnumC1873990yrl.Companion.getClass();
            EnumC1873990yrl[] enumC1873990yrlArrValues = EnumC1873990yrl.values();
            int length = enumC1873990yrlArrValues.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    EnumC1873990yrl enumC1873990yrl = enumC1873990yrlArrValues[i];
                    if (enumC1873990yrl.getType() == iIntValue) {
                        linkedHashMap2.put(key, enumC1873990yrl);
                        break;
                    }
                    i++;
                }
            }
        }
        this.LIZ = linkedHashMap2;
        EnumC1873990yrl enumC1873990yrl2 = (EnumC1873990yrl) linkedHashMap2.get(str);
        if (enumC1873990yrl2 == null) {
            enumC1873990yrl2 = EnumC1873990yrl.SHOULD_NOT_SHOW;
        }
        return enumC1873990yrl2.getType();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IAgeGradService
    public final void LIZJ(Function2<? super String, ? super Integer, Unit> function2) {
        try {
            ((AgeGradApi) C1870270yll.LIZ.getValue()).getAgeGraduationPageUrl().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS197S0100000_28(this, 36)).LJJIJIIJI(new AfS197S0100000_28(this, 37)).LJJLL(new AfS197S0100000_28(function2, 38), new C09JN() { // from class: X.0ylj
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("AgeGradServiceImpl@110c.getAgeGraduationPageUrl$4");
                    C1C7U.LIZIZ("AgeGradServiceImpl@110c.getAgeGraduationPageUrl$4");
                }
            });
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL(AgeGradServiceImpl ageGradServiceImpl, boolean z, BaseResponse baseResponse, Throwable th, int i) {
        String str;
        Integer numValueOf;
        String message;
        JSONObject jSONObject = null;
        if ((i & 2) != 0) {
            baseResponse = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        ageGradServiceImpl.getClass();
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C1783100wVA c1783100wVA = new C1783100wVA();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1783100wVA.LIZ.put("isSuccess", str);
        c1783100wVA.LIZ.put("service", ageGradServiceImpl.LIZIZ);
        if (baseResponse != null) {
            numValueOf = Integer.valueOf(baseResponse.getStatusCode());
        } else {
            numValueOf = null;
        }
        c1783100wVA.LIZ.put("code", numValueOf);
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        c1783100wVA.LIZ.put("message", message);
        try {
            jSONObject = new JSONObject(c1783100wVA.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        c1163504gr.onEventV3("compliance_api_status", jSONObject);
    }
}
