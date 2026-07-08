package com.ss.android.ugc.aweme.services;

import X.C10UK;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public interface IRegistrationAgeGateService {
    void dismiss();

    void displayFeedback(PNSFeedbackModel pNSFeedbackModel);

    Fragment getAgeGateFragment(Context context, HashMap<String, String> map, Bundle bundle, AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow, C10UK c10uk, boolean z, boolean z2, Function1<? super ViewGroup, Unit> function1, boolean z3);

    boolean isFtcForRegistration();

    void refreshUiModel();

    void verifyAgeForRegistrationSDK(Context context, HashMap<String, String> map, Bundle bundle, AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow, C10UK c10uk, boolean z, boolean z2, Function1<? super ViewGroup, Unit> function1);

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void verifyAgeForRegistrationSDK$default(IRegistrationAgeGateService iRegistrationAgeGateService, Context context, HashMap map, Bundle bundle, AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow, C10UK c10uk, boolean z, boolean z2, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    bundle = null;
                }
                if ((i & 64) != 0) {
                    z2 = true;
                }
                if ((i & 128) != 0) {
                    function1 = AFwS271S0000000_28.get$arr$(205);
                }
                iRegistrationAgeGateService.verifyAgeForRegistrationSDK(context, map, bundle, ageGateSdkRegistrationFlow, c10uk, z, z2, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyAgeForRegistrationSDK");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Fragment getAgeGateFragment$default(IRegistrationAgeGateService iRegistrationAgeGateService, Context context, HashMap map, Bundle bundle, AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow, C10UK c10uk, boolean z, boolean z2, Function1 function1, boolean z3, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    bundle = null;
                }
                if ((i & 64) != 0) {
                    z2 = true;
                }
                if ((i & 128) != 0) {
                    function1 = AFwS271S0000000_28.get$arr$(204);
                }
                if ((i & 256) != 0) {
                    z3 = false;
                }
                return iRegistrationAgeGateService.getAgeGateFragment(context, map, bundle, ageGateSdkRegistrationFlow, c10uk, z, z2, function1, z3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAgeGateFragment");
        }
    }
}
