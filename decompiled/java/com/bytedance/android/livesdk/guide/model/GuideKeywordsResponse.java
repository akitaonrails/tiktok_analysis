package com.bytedance.android.livesdk.guide.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuideKeywordsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("keywords_library")
        public List<KeywordsLibrary> keywordsLibrary = new ArrayList();

        @C09CT("user_info")
        public UserInfo userInfo;

        @C09CT("version")
        public long version;
    }

    public static final class UserInfo {

        @C09CT("coin_exchange_prompt")
        public String coinExchangePrompt = "";

        @C09CT("has_ever_recharged")
        public boolean hasEverRecharged;

        @C09CT("is_in_eea")
        public boolean isInEea;

        @C09CT("suggested_max_coins")
        public long suggestedMaxCoins;

        @C09CT("suggested_min_coins")
        public long suggestedMinCoins;
    }
}
