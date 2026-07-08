package com.ss.android.ugc.aweme.account.experiment;

import X.C09CT;
import X.C0C64;
import X.C2097608Jq;
import X.EnumC1237860iJk;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.account.experiment.ThirdPartyDeprecationExperiment5;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class DeprecationEnhancementExperiment {
    public static final DeprecationEnhancementExperiment LIZ = new DeprecationEnhancementExperiment();
    public static final DeprecationEnhancementExperimentModel LIZIZ = new DeprecationEnhancementExperimentModel(C2097608Jq.LJ(), false, -1);

    public static final class DeprecationEnhancementExperimentModel {

        @C09CT("deprecating_facebook")
        public final Map<String, List<ThirdPartyDeprecationExperiment5.GuidanceActions>> deprecatingFacebook;

        @C09CT("enable_new_fb_deprecation")
        public final boolean enableNewFBDeprecation;

        @C09CT("fb_deprecation_transition_duration")
        public final int fbDeprecationTransitionDuration;

        public DeprecationEnhancementExperimentModel() {
            this(C2097608Jq.LJ(), false, -1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DeprecationEnhancementExperimentModel(Map<String, ? extends List<? extends ThirdPartyDeprecationExperiment5.GuidanceActions>> map, boolean z, int i) {
            this.deprecatingFacebook = map;
            this.enableNewFBDeprecation = z;
            this.fbDeprecationTransitionDuration = i;
        }
    }

    public static final DeprecationEnhancementExperimentModel LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        DeprecationEnhancementExperimentModel deprecationEnhancementExperimentModel = LIZIZ;
        DeprecationEnhancementExperimentModel deprecationEnhancementExperimentModel2 = (DeprecationEnhancementExperimentModel) c0c64LJIILLIIL.LJJIIJ(false, "deprecation_enhancement_experiment_android_1", 31744, DeprecationEnhancementExperimentModel.class, deprecationEnhancementExperimentModel, 1);
        return deprecationEnhancementExperimentModel2 != null ? deprecationEnhancementExperimentModel2 : deprecationEnhancementExperimentModel;
    }

    public static boolean LIZIZ() {
        if (!LIZ().enableNewFBDeprecation) {
            return false;
        }
        IForceBindingAccountService iForceBindingAccountService = (IForceBindingAccountService) PluggableExtentionKt.pluggableSpi$default(IForceBindingAccountService.class, false, false, false, 14, null);
        return (iForceBindingAccountService != null ? iForceBindingAccountService.getCurrentLoginUser3pPlatform() : null) == EnumC1237860iJk.FACEBOOK;
    }

    public static boolean LIZJ(String str) {
        if (LIZ().enableNewFBDeprecation && u.LJIJI(str, "FACEBOOK", true)) {
            return true;
        }
        return false;
    }
}
