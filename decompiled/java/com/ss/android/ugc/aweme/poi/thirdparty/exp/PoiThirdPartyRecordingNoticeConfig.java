package com.ss.android.ugc.aweme.poi.thirdparty.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PoiThirdPartyRecordingNoticeConfig {
    public static final PoiThirdPartyRecordingNoticeConfigModel LIZ;

    static {
        new PoiThirdPartyRecordingNoticeConfig();
        LIZ = new PoiThirdPartyRecordingNoticeConfigModel(null);
    }

    public static final class PoiThirdPartyRecordingNoticeConfigModel {

        @C09CT("learn_more_link")
        public final String privacyPolicyLink;

        public PoiThirdPartyRecordingNoticeConfigModel() {
            this(null);
        }

        public PoiThirdPartyRecordingNoticeConfigModel(String str) {
            this.privacyPolicyLink = str;
        }
    }
}
