package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.MusicSong;

/* JADX INFO: loaded from: classes13.dex */
public final class FavouritesSongsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("songs")
        public List<MusicSong> songs = new ArrayList();

        @C09CT("total")
        public long total;
    }
}
