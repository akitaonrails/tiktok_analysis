package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.MusicCollection;
import webcast.data.MusicSong;

/* JADX INFO: loaded from: classes13.dex */
public final class MusicResponse {

    @C09CT("data")
    public Packs data;

    public static final class Pack {

        @C09CT("collection")
        public MusicCollection collection;

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("songs")
        public List<MusicSong> songs = new ArrayList();

        @C09CT("total")
        public long total;
    }

    public static final class Packs {

        @C09CT("favourites")
        public FavouritesPack favourites;

        @C09CT("packs")
        public List<Pack> packs = new ArrayList();

        @C09CT("playlist")
        public PlaylistPack playlist;
    }
}
