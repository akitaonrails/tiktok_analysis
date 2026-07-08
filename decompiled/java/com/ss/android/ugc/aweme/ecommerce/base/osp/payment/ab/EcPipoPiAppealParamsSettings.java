package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPipoPiAppealParamsSettings {
    public static final AppealConfig LIZ = new AppealConfig("aweme://webview?target_handler=pipo_hybrid&disable_auto_append_crossplatform_plugin=1&use_spark=1", Collections.singletonList("RISK_USER_APPEAL_REQUIRED"));

    public static final class AppealConfig {

        @C09CT("error_code")
        public final List<String> errorCodeList;

        @C09CT("schema")
        public final String schema;

        public AppealConfig(String str, List<String> list) {
            this.schema = str;
            this.errorCodeList = list;
        }
    }
}
