package com.ss.android.ugc.aweme.aigc.aigcsafetymanager.api.creation.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class GCMarkLabelUtils {
    public static final GCMarkLabelUtils LIZ = new GCMarkLabelUtils();

    public static final class GCMarkMetaData {

        @C09CT("ContentProducer")
        public final String contentProducer;

        @C09CT("Label")
        public final String label;

        @C09CT("ProduceID")
        public final String produceID;

        public GCMarkMetaData() {
            this(null, null, null);
        }

        public GCMarkMetaData(String str, String str2, String str3) {
            this.label = str;
            this.contentProducer = str2;
            this.produceID = str3;
        }
    }
}
