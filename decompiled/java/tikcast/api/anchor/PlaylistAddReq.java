package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class PlaylistAddReq {

    @C09CT("last_song_id")
    public long lastSongId;

    @C09CT("last_song_offset")
    public long lastSongOffset;

    @C09CT("song_ids")
    public List<Long> songIds = new ArrayList();
}
