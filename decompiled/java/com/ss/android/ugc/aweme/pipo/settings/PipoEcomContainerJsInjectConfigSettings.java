package com.ss.android.ugc.aweme.pipo.settings;

import X.C09CT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class PipoEcomContainerJsInjectConfigSettings {
    public static final PipoEcomContainerJsInjectConfigModel LIZ = new PipoEcomContainerJsInjectConfigModel(null, 1, null);

    public static final class PipoEcomContainerJsInjectConfigModel {

        @C09CT("url_white_list")
        public final List<String> urlWhiteList;

        public PipoEcomContainerJsInjectConfigModel() {
            this(null, 1, null);
        }

        public PipoEcomContainerJsInjectConfigModel(List<String> list) {
            this.urlWhiteList = list;
        }

        public PipoEcomContainerJsInjectConfigModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Collections.singletonList("") : list);
        }
    }
}
