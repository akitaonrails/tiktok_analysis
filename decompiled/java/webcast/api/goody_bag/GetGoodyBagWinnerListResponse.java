package webcast.api.goody_bag;

import X.C09CT;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagWinnerInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetGoodyBagWinnerListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("next_offset")
        public long nextOffset;

        @C09CT("winners")
        public List<GoodyBagWinnerInfo> winners = new ArrayList();
    }
}
