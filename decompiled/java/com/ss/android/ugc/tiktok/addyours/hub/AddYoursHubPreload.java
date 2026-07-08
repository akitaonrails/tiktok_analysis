package com.ss.android.ugc.tiktok.addyours.hub;

import X.C0CQT;
import X.C0O1E;
import X.C0X9S;
import X.C1499810p8F;
import X.C2095008Iq;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.addyours.api.IAddYoursApiDefinition;
import com.ss.android.ugc.tiktok.addyours.hub.model.HubFeedResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursHubPreload implements InterfaceC727570SgN<IAddYoursApiDefinition, C0X9S<HubFeedResponse>> {
    public static final C0O1E Companion = new Object() { // from class: X.0O1E
    };

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        String str;
        Long lLJIILIIL;
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_hub_AddYoursHubPreload_com_ss_android_ugc_aweme_lancet_IntentLancet_get = null;
        if (bundle != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_hub_AddYoursHubPreload_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_hub_AddYoursHubPreload_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "uid");
        }
        if ((objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_hub_AddYoursHubPreload_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) && (str = (String) objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_hub_AddYoursHubPreload_com_ss_android_ugc_aweme_lancet_IntentLancet_get) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null && lLJIILIIL.longValue() > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, C0CQT.LIZJ, null, 0, false, 29);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        return true;
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_hub_AddYoursHubPreload_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public C0X9S<HubFeedResponse> preload2(Bundle bundle, Function1<? super Class<IAddYoursApiDefinition>, ? extends IAddYoursApiDefinition> function1) {
        long jLongValue;
        String str;
        Long lLJIILIIL;
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_hub_AddYoursHubPreload_com_ss_android_ugc_aweme_lancet_IntentLancet_get = null;
        if (bundle != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_hub_AddYoursHubPreload_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_hub_AddYoursHubPreload_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "uid");
        }
        if ((objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_hub_AddYoursHubPreload_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) && (str = (String) objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_hub_AddYoursHubPreload_com_ss_android_ugc_aweme_lancet_IntentLancet_get) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = -1;
        }
        return function1.invoke(IAddYoursApiDefinition.class).fetchHubFeed(jLongValue, 1, 0L, 1, 30);
    }
}
