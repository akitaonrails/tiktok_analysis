package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.model.KaraokeSong;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeSearchResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("next_offset")
        public long nextOffset;

        @C09CT("song_list")
        public List<KaraokeSong> songList = new ArrayList();
    }
}
