package com.ss.android.ugc.aweme.openshare;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class DmShare {
    public static final /* synthetic */ int LIZ = 0;

    public static final class TikTokShareDirectMessageSettings implements Serializable {

        @C09CT("dm_schema")
        public final String dmSchema;

        @C09CT("from_user")
        public final String fromUser;

        public TikTokShareDirectMessageSettings(String str, String str2) {
            this.dmSchema = str;
            this.fromUser = str2;
        }
    }

    public static final class TikTokDSPSettings implements Serializable {

        @C09CT("dsp_app_name")
        public final String applicationName;

        @C09CT("content_type")
        public final int contentType;

        @C09CT("entity_uri")
        public final String entityUri;

        @C09CT("dsp_share_url")
        public final String shareUrl;

        public TikTokDSPSettings(int i, String str, String str2, String str3) {
            this.contentType = i;
            this.shareUrl = str;
            this.entityUri = str2;
            this.applicationName = str3;
        }
    }
}
