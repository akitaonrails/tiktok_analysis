package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PoiSysbrowserHostsSettings {
    public static final PoiSysbrowserHostsModel LIZ = new PoiSysbrowserHostsModel(null);

    public static final class PoiSysbrowserHostsModel {

        @C09CT("allow_hosts")
        public final List<String> allowHostList;

        public PoiSysbrowserHostsModel() {
            this(null);
        }

        public PoiSysbrowserHostsModel(List<String> list) {
            this.allowHostList = list;
        }
    }
}
