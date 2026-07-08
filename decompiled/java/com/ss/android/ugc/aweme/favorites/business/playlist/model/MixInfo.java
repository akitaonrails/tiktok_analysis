package com.ss.android.ugc.aweme.favorites.business.playlist.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MixInfo {

    @C09CT("mix_creator_user_id")
    public final String authorUid;

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("mix_label")
    public final Integer mixLabel;

    @C09CT("mix_name")
    public final String name;

    @C09CT("mix_video_total_count")
    public final Integer totalVideoCount;

    @C09CT("mix_video_update_count")
    public final Integer updatedVideoCount;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixInfo)) {
            return false;
        }
        MixInfo mixInfo = (MixInfo) obj;
        return Intrinsics.LJFF(this.id, mixInfo.id) && Intrinsics.LJFF(this.coverUrl, mixInfo.coverUrl) && Intrinsics.LJFF(this.name, mixInfo.name) && Intrinsics.LJFF(this.totalVideoCount, mixInfo.totalVideoCount) && Intrinsics.LJFF(this.updatedVideoCount, mixInfo.updatedVideoCount) && Intrinsics.LJFF(this.authorUid, mixInfo.authorUid) && Intrinsics.LJFF(this.mixLabel, mixInfo.mixLabel);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.coverUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.totalVideoCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.updatedVideoCount;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.authorUid;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.mixLabel;
        return iHashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public MixInfo(String str, String str2, String str3, Integer num, Integer num2, String str4, Integer num3) {
        this.id = str;
        this.coverUrl = str2;
        this.name = str3;
        this.totalVideoCount = num;
        this.updatedVideoCount = num2;
        this.authorUid = str4;
        this.mixLabel = num3;
    }
}
