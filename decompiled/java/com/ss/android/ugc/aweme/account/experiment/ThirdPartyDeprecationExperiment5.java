package com.ss.android.ugc.aweme.account.experiment;

import X.C08FF;
import X.C09CT;
import X.C0C64;
import X.C2254308sP;
import X.EnumC1237860iJk;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ThirdPartyDeprecationExperiment5 {
    public static final ThirdPartyDeprecationExperiment5 LIZ = new ThirdPartyDeprecationExperiment5();
    public static final ThirdPartyDeprecationExperiment5Model LIZIZ = new ThirdPartyDeprecationExperiment5Model(new LinkedHashMap());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class GuidanceActions {

        @C09CT("block_login")
        public static final GuidanceActions BLOCK_LOGIN;

        @C09CT("cold_launch_popup")
        public static final GuidanceActions COLD_LAUNCH_POPUP;

        @C09CT("failed_3p_to_1p")
        public static final GuidanceActions FAILED_3P_TO_1P;

        @C09CT("failed_login_popup")
        public static final GuidanceActions FAILED_LOGIN_POPUP;
        public static final /* synthetic */ GuidanceActions[] LL;
        public static final /* synthetic */ C2254308sP LLILLJJLI;

        @C09CT("logout_pii_binding")
        public static final GuidanceActions LOGOUT_PII_BINDING;

        @C09CT("logout_pii_binding_skippable")
        public static final GuidanceActions LOGOUT_PII_BINDING_SKIPPABLE;

        @C09CT("removed_from_login")
        public static final GuidanceActions REMOVED_FROM_LOGIN;

        @C09CT("removed_from_signup")
        public static final GuidanceActions REMOVED_FROM_SIGNUP;

        public static InterfaceC2044707zh<GuidanceActions> getEntries() {
            return LLILLJJLI;
        }

        static {
            GuidanceActions guidanceActions = new GuidanceActions("REMOVED_FROM_LOGIN", 0);
            REMOVED_FROM_LOGIN = guidanceActions;
            GuidanceActions guidanceActions2 = new GuidanceActions("REMOVED_FROM_SIGNUP", 1);
            REMOVED_FROM_SIGNUP = guidanceActions2;
            GuidanceActions guidanceActions3 = new GuidanceActions("BLOCK_LOGIN", 2);
            BLOCK_LOGIN = guidanceActions3;
            GuidanceActions guidanceActions4 = new GuidanceActions("FAILED_LOGIN_POPUP", 3);
            FAILED_LOGIN_POPUP = guidanceActions4;
            GuidanceActions guidanceActions5 = new GuidanceActions("COLD_LAUNCH_POPUP", 4);
            COLD_LAUNCH_POPUP = guidanceActions5;
            GuidanceActions guidanceActions6 = new GuidanceActions("LOGOUT_PII_BINDING", 5);
            LOGOUT_PII_BINDING = guidanceActions6;
            GuidanceActions guidanceActions7 = new GuidanceActions("LOGOUT_PII_BINDING_SKIPPABLE", 6);
            LOGOUT_PII_BINDING_SKIPPABLE = guidanceActions7;
            GuidanceActions guidanceActions8 = new GuidanceActions("FAILED_3P_TO_1P", 7);
            FAILED_3P_TO_1P = guidanceActions8;
            GuidanceActions[] guidanceActionsArr = {guidanceActions, guidanceActions2, guidanceActions3, guidanceActions4, guidanceActions5, guidanceActions6, guidanceActions7, guidanceActions8};
            LL = guidanceActionsArr;
            LLILLJJLI = new C2254308sP(guidanceActionsArr);
        }

        public static GuidanceActions[] values() {
            return (GuidanceActions[]) LL.clone();
        }

        public static GuidanceActions valueOf(String str) {
            return (GuidanceActions) C08FF.LIZ(GuidanceActions.class, str);
        }

        public GuidanceActions(String str, int i) {
        }
    }

    public static final class ThirdPartyDeprecationExperiment5Model {

        @C09CT("deprecated_platforms")
        public final Map<String, List<GuidanceActions>> deprecatedPlatforms;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ThirdPartyDeprecationExperiment5Model) && Intrinsics.LJFF(this.deprecatedPlatforms, ((ThirdPartyDeprecationExperiment5Model) obj).deprecatedPlatforms);
        }

        public ThirdPartyDeprecationExperiment5Model() {
            this(new LinkedHashMap());
        }

        public ThirdPartyDeprecationExperiment5Model(Map<String, List<GuidanceActions>> map) {
            this.deprecatedPlatforms = map;
        }
    }

    public static String LIZIZ() {
        String strName;
        String lowerCase;
        EnumC1237860iJk currentLoginUser3pPlatform = ((IForceBindingAccountService) ServiceManager.get().getService(IForceBindingAccountService.class)).getCurrentLoginUser3pPlatform();
        return (currentLoginUser3pPlatform == null || (strName = currentLoginUser3pPlatform.name()) == null || (lowerCase = strName.toLowerCase(Locale.ROOT)) == null) ? "" : lowerCase;
    }

    public static ThirdPartyDeprecationExperiment5Model LIZJ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ThirdPartyDeprecationExperiment5Model thirdPartyDeprecationExperiment5Model = LIZIZ;
        ThirdPartyDeprecationExperiment5Model thirdPartyDeprecationExperiment5Model2 = (ThirdPartyDeprecationExperiment5Model) c0c64LJIILLIIL.LJJIIJ(false, "3p_deprecation_test_experiment_5_android", 31744, ThirdPartyDeprecationExperiment5Model.class, thirdPartyDeprecationExperiment5Model, 1);
        if (thirdPartyDeprecationExperiment5Model2 != null) {
            thirdPartyDeprecationExperiment5Model = thirdPartyDeprecationExperiment5Model2;
        }
        thirdPartyDeprecationExperiment5Model.deprecatedPlatforms.putAll(DeprecationEnhancementExperiment.LIZ().deprecatingFacebook);
        return thirdPartyDeprecationExperiment5Model;
    }

    public static boolean LIZLLL() {
        return LIZJ().deprecatedPlatforms.get(LIZIZ()) != null;
    }

    public static boolean LJ() {
        return !Intrinsics.LJFF(LIZJ(), LIZIZ);
    }

    public static final boolean LJFF(String str) {
        ThirdPartyDeprecationExperiment5 thirdPartyDeprecationExperiment5 = LIZ;
        GuidanceActions guidanceActions = GuidanceActions.BLOCK_LOGIN;
        thirdPartyDeprecationExperiment5.getClass();
        return LIZ(guidanceActions, str);
    }

    public static boolean LIZ(GuidanceActions guidanceActions, String str) {
        Map<String, List<GuidanceActions>> map = LIZJ().deprecatedPlatforms;
        if (str == null) {
            str = LIZIZ();
        }
        List<GuidanceActions> list = map.get(str);
        if (list != null) {
            return list.contains(guidanceActions);
        }
        return false;
    }
}
