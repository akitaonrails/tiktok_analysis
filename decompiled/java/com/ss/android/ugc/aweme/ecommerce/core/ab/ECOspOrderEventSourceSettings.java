package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ECOspOrderEventSourceSettings {
    public static final ECOspOrderEventSourceConfig LIZ = new ECOspOrderEventSourceConfig(null);

    public static final class ECOspOrderEventSourceConfig {

        @C09CT("source_page_type")
        public final List<OSPSourcePageTypeConfig> typeList;

        public ECOspOrderEventSourceConfig() {
            this(null);
        }

        public ECOspOrderEventSourceConfig(List<OSPSourcePageTypeConfig> list) {
            this.typeList = list;
        }
    }

    public static final class OSPSourcePageTypeConfig {

        @C09CT("name")
        public final String name;

        @C09CT("promotion_activity_type")
        public final Integer promotion_activity_type;

        public OSPSourcePageTypeConfig() {
            this(null, null);
        }

        public OSPSourcePageTypeConfig(String str, Integer num) {
            this.name = str;
            this.promotion_activity_type = num;
        }
    }
}
