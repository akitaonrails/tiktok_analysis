package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.FeedItemInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GetGameVideoListResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public FeedExtra extra;

    public static final class ResponseData {

        @C09CT("items")
        public List<FeedItemInfo> items = new ArrayList();
    }
}
