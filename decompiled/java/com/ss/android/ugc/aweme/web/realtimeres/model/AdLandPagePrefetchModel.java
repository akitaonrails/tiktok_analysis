package com.ss.android.ugc.aweme.web.realtimeres.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AdLandPagePrefetchModel {

    public static final class PrefetchModel {

        @C09CT("fileName")
        public final String fileName;

        @C09CT("fileSize")
        public final Long fileSize;

        @C09CT("isPixelResource")
        public final Integer isPixelResource;

        @C09CT("level")
        public final Integer level;

        @C09CT("reqHeader")
        public final Map<String, String> reqHeader;

        @C09CT("resourceType")
        public final String resourceType;

        @C09CT("url")
        public final String url;

        public PrefetchModel() {
            this(null, null, null, null, null, null, null);
        }

        public PrefetchModel(String str, Long l, String str2, Integer num, String str3, Map<String, String> map, Integer num2) {
            this.fileName = str;
            this.fileSize = l;
            this.resourceType = str2;
            this.level = num;
            this.url = str3;
            this.reqHeader = map;
            this.isPixelResource = num2;
        }
    }
}
