package com.ss.android.ugc.aweme.feed.api;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class HotMusicListResp {

    @C09CT("status_msg")
    public final String message;

    @C09CT("music_id")
    public final List<String> musicId;

    @C09CT("status_code")
    public final int statusCode;

    public HotMusicListResp() {
        this(null, 0, null, 7, null);
    }

    public HotMusicListResp(String str, int i, List<String> list) {
        this.message = str;
        this.statusCode = i;
        this.musicId = list;
    }

    public HotMusicListResp(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
