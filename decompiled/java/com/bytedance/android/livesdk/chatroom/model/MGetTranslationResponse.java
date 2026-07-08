package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import X.C2097608Jq;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class MGetTranslationResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("translations")
        public Map<String, Translation> translations = C2097608Jq.LJ();

        public static final class Translation {

            @C09CT("translated")
            public boolean translated;

            @C09CT("translation")
            public String translation = "";

            @C09CT("emotes_index_map")
            public Map<Long, Long> emotesIndexMap = new LinkedHashMap();
        }
    }
}
