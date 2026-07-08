package com.ss.android.ugc.aweme.config;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcomGeneralShowCaseCardConfig {
    public static final ShowcaseModel LIZ = new ShowcaseModel("1;1;1");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(56));

    public static ShowcaseModel LIZ() {
        return (ShowcaseModel) LIZIZ.getValue();
    }

    public static final class ShowcaseModel {

        @C09CT("api_version")
        public final String apiVersion;

        public ShowcaseModel() {
            this(null);
        }

        public ShowcaseModel(String str) {
            this.apiVersion = str;
        }
    }
}
