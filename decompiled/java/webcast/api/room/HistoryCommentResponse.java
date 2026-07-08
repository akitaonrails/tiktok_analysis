package webcast.api.room;

import X.C09CT;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HistoryCommentResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("messages")
        public List<ProtoMessageFetchResult.BaseProtoMessage> messages = new ArrayList();

        @C09CT("cursor")
        public String cursor = "";
    }
}
