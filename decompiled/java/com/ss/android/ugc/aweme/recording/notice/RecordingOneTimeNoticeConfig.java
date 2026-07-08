package com.ss.android.ugc.aweme.recording.notice;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class RecordingOneTimeNoticeConfig {
    public static final RecordingOneTimeNoticeConfigModel LIZ = new RecordingOneTimeNoticeConfigModel(null, null);

    public static final class RecordingOneTimeNoticeConfigModel {

        @C09CT("ads_and_your_data")
        public final String adsAndYourDataLink;

        @C09CT("learn_more_link")
        public final String learnMoreLink;

        public RecordingOneTimeNoticeConfigModel() {
            this(null, null);
        }

        public RecordingOneTimeNoticeConfigModel(String str, String str2) {
            this.learnMoreLink = str;
            this.adsAndYourDataLink = str2;
        }
    }
}
