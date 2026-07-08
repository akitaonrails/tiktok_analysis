package com.ss.android.ugc.aweme.live.sfv.special;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveSfvPostCardData implements Serializable {
    public static final int $stable = 8;

    @C09CT("live_fragments")
    public final List<LiveFragmentDetail> fragments;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("sub_title_starling_key")
    public final String subTitleStaringKey;

    @C09CT("title")
    public final String title;

    public LiveSfvPostCardData() {
        this(null, null, null, new ArrayList());
    }

    public final List<LiveFragmentDetail> getFragments() {
        return this.fragments;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getSubTitleStaringKey() {
        return this.subTitleStaringKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public LiveSfvPostCardData(String str, String str2, String str3, List<LiveFragmentDetail> list) {
        this.title = str;
        this.subTitle = str2;
        this.subTitleStaringKey = str3;
        this.fragments = list;
    }
}
