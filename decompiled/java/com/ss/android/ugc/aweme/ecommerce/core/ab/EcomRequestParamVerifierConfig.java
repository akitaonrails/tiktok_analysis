package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomRequestParamVerifierConfig {
    public static final EcomRequestParamVerifierModel LIZ = new EcomRequestParamVerifierModel(null, null, null);

    public static final class VerificationRule {

        @C09CT("path")
        public final String path;

        @C09CT("rules")
        public final List<Rule> rules;

        public VerificationRule(String str, List<Rule> list) {
            this.path = str;
            this.rules = list;
        }
    }

    public static final class EcomRequestParamVerifierModel {

        @C09CT("enable_notification")
        public final Boolean enableNotification;

        @C09CT("enable_verification")
        public final Boolean enableVerification;

        @C09CT("verification_rules")
        public final List<VerificationRule> verificationRules;

        public EcomRequestParamVerifierModel(Boolean bool, Boolean bool2, List<VerificationRule> list) {
            this.enableVerification = bool;
            this.enableNotification = bool2;
            this.verificationRules = list;
        }
    }

    public static final class Rule {

        @C09CT("empty")
        public final Boolean empty;

        @C09CT("key")
        public final String key;

        @C09CT("required")
        public final Boolean required;

        @C09CT("type")
        public final Integer type;

        public Rule(String str, Boolean bool, Integer num, Boolean bool2) {
            this.key = str;
            this.required = bool;
            this.type = num;
            this.empty = bool2;
        }
    }
}
