package com.ss.android.ugc.aweme.search.pages.result.topsearch.viralsong;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class ViralSongCard implements Serializable {
    public static final int $stable = 8;

    @C09CT("card_title")
    public final String cardTitle;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("music_rank")
    public final int ranking;

    @C09CT("search_source")
    public final String searchSource;

    @C09CT("videos")
    public final List<Aweme> videos;

    public ViralSongCard() {
        this(null, null, 0, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViralSongCard(String str, String str2, int i, List<? extends Aweme> list, String str3) {
        this.musicId = str;
        this.cardTitle = str2;
        this.ranking = i;
        this.videos = list;
        this.searchSource = str3;
    }

    public ViralSongCard(String str, String str2, int i, List list, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? C13BV.INSTANCE : list, (i2 & 16) == 0 ? str3 : "");
    }
}
