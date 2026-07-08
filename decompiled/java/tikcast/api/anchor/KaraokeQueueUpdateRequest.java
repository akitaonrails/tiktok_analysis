package tikcast.api.anchor;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeQueueUpdateRequest {

    @C09CT("current_song_id")
    public long currentSongId;

    @C09CT("current_song_singer_id")
    public long currentSongSingerId;

    @C09CT("host_id")
    public String hostId = "";

    @C09CT("next_song_id")
    public long nextSongId;

    @C09CT("role")
    public long role;

    @C09CT("room_id")
    public long roomId;

    @C09CT("update_type")
    public int updateType;
}
