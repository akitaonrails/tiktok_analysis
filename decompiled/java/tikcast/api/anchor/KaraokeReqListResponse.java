package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.ReqSong;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeReqListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("is_update")
        public boolean isUpdate;

        @C09CT("offset")
        public long offset;

        @C09CT("req_song_list")
        public List<ReqSong> reqSongList = new ArrayList();

        @C09CT("timestamp")
        public long timestamp;

        @C09CT("total_count")
        public long totalCount;
    }
}
