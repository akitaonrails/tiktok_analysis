package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchInflowMultiAdCardStruct implements Serializable {
    public List<? extends Aweme> awemeList;

    @C09CT("aweme_list")
    public List<? extends Map<?, ?>> awemeListRaw;

    @C09CT("raw_ad_data")
    public final String awemeRawAd;

    @C09CT("height")
    public final Integer height;

    @C09CT("video")
    public final Video video;

    public SearchInflowMultiAdCardStruct() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchInflowMultiAdCardStruct)) {
            return false;
        }
        SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct = (SearchInflowMultiAdCardStruct) obj;
        return Intrinsics.LJFF(this.awemeListRaw, searchInflowMultiAdCardStruct.awemeListRaw) && Intrinsics.LJFF(this.video, searchInflowMultiAdCardStruct.video) && Intrinsics.LJFF(this.awemeRawAd, searchInflowMultiAdCardStruct.awemeRawAd) && Intrinsics.LJFF(this.height, searchInflowMultiAdCardStruct.height) && Intrinsics.LJFF(this.awemeList, searchInflowMultiAdCardStruct.awemeList);
    }

    public int hashCode() {
        List<? extends Map<?, ?>> list = this.awemeListRaw;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Video video = this.video;
        int iHashCode2 = (iHashCode + (video == null ? 0 : video.hashCode())) * 31;
        String str = this.awemeRawAd;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.height;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<? extends Aweme> list2 = this.awemeList;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public final void setAwemeListRaw(List<? extends Map<?, ?>> list) {
        this.awemeListRaw = list;
    }

    public SearchInflowMultiAdCardStruct(List<? extends Map<?, ?>> list, Video video, String str, Integer num, List<? extends Aweme> list2) {
        this.awemeListRaw = list;
        this.video = video;
        this.awemeRawAd = str;
        this.height = num;
        this.awemeList = list2;
    }
}
