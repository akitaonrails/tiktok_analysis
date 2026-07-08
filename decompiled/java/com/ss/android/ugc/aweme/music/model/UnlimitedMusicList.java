package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes32.dex */
public final class UnlimitedMusicList {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("music_list")
    public final List<Music> musicList;

    @C09CT("next_cursor")
    public final int nextCursor;

    @C09CT("total")
    public final int total;

    public UnlimitedMusicList() {
        this(false, 0, null, 0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnlimitedMusicList(boolean z, int i, List<? extends Music> list, int i2) {
        this.hasMore = z;
        this.total = i;
        this.musicList = list;
        this.nextCursor = i2;
    }

    public UnlimitedMusicList(boolean z, int i, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? C13BV.INSTANCE : list, (i3 & 8) != 0 ? 0 : i2);
    }
}
