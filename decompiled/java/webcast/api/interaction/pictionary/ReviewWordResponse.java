package webcast.api.interaction.pictionary;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class ReviewWordResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public ReviewWordExtra extra;

    public static final class ResponseData {

        @C09CT("word")
        public String word = "";
    }

    public static final class ReviewWordExtra {

        @C09CT("now")
        public long now;
    }
}
