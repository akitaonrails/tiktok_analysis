package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class CommentIdentificationResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("comment_identify_type")
        public int commentIdentifyType;

        @C09CT("comment_text")
        public String commentText = "";

        @C09CT("high_intent_source_type")
        public int highIntentSourceType;
    }
}
