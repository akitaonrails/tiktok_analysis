package webcast.api.room;

import X.C09CT;
import webcast.data.PreviewCommentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewCommentResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("preview_comment_info")
        public PreviewCommentInfo previewCommentInfo;
    }
}
