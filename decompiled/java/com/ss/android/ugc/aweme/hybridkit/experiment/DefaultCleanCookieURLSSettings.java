package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class DefaultCleanCookieURLSSettings {
    public static final DefaultCleanCookieURLSModel LIZ = new DefaultCleanCookieURLSModel(null, 1, null);

    public static final class DefaultCleanCookieURLSModel {

        @C09CT("urlList")
        public final List<String> urlList;

        public DefaultCleanCookieURLSModel() {
            this(null, 1, null);
        }

        public DefaultCleanCookieURLSModel(List<String> list) {
            this.urlList = list;
        }

        public DefaultCleanCookieURLSModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
