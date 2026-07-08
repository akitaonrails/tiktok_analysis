package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class PlaybackSecondsTrack {

    @C09CT("seconds")
    public final int seconds;

    @C09CT("url_list")
    public final List<String> urlList;

    public PlaybackSecondsTrack() {
        this(0, null);
    }

    public PlaybackSecondsTrack(int i, List<String> list) {
        this.seconds = i;
        this.urlList = list;
    }
}
