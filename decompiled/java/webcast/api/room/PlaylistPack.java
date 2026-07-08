package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.MusicSong;

/* JADX INFO: loaded from: classes13.dex */
public final class PlaylistPack {

    @C09CT("curr_song_offset")
    public long currSongOffset;

    @C09CT("songs")
    public List<MusicSong> songs = new ArrayList();

    @C09CT("total")
    public long total;
}
