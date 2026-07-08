package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class AggregatedVideo implements Serializable {
    public static final int $stable = 8;

    @C09CT("item_list")
    public final List<Aweme> awemes;

    @C09CT("show_inflow_use_sound_button")
    public final Boolean showInflowUseSoundButton;

    @C09CT("show_use_sound_button")
    public final Boolean showUseSoundButton;

    @C09CT("card_title")
    public final String title;

    public AggregatedVideo() {
        this(null, null, Boolean.FALSE, Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AggregatedVideo(List<? extends Aweme> list, String str, Boolean bool, Boolean bool2) {
        this.awemes = list;
        this.title = str;
        this.showUseSoundButton = bool;
        this.showInflowUseSoundButton = bool2;
    }
}
