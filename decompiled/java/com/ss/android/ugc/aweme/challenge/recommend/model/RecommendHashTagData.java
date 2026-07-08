package com.ss.android.ugc.aweme.challenge.recommend.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.Challenge;

/* JADX INFO: loaded from: classes30.dex */
public class RecommendHashTagData {

    @C09CT("ad_data")
    public AdData adData;

    @C09CT("ch_info")
    public Challenge challenge;

    @C09CT("mark")
    public int mark;

    @C09CT("pos")
    public int pos;

    public static class AdData {

        @C09CT("creative_id")
        public long creativeId;

        @C09CT("is_preview")
        public boolean isPreview;

        @C09CT("log_extra")
        public String logExtra;

        @C09CT("type")
        public String type;
    }
}
