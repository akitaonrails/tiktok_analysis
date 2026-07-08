package com.ss.android.ugc.aweme.web.realtimeres.model;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLandPagePreconnectModel {

    public static final class PreconnectModel {

        @C09CT("important")
        public final String important;

        @C09CT("protocol")
        public final String protocol;

        @C09CT("resourceResource")
        public final String resourceResource;

        @C09CT("url")
        public final String url;

        public PreconnectModel() {
            this(null, null, null, null);
        }

        public PreconnectModel(String str, String str2, String str3, String str4) {
            this.url = str;
            this.important = str2;
            this.protocol = str3;
            this.resourceResource = str4;
        }
    }
}
