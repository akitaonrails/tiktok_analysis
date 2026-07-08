package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoVideoItem {
    public transient Aweme LIZ;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("aweme_type")
    public final Integer awemeType;

    @C09CT("cover")
    public final BaseImage cover;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("desc")
    public final String desc;

    @C09CT("digg_count")
    public final long diggCount;

    @C09CT("is_liked")
    public final Map<String, Boolean> isLiked;

    @C09CT("keyframe_list")
    public final List<Keyframe> keyframeList;

    @C09CT("product_anchor")
    public final ProductAnchor productAnchor;

    @C09CT("user")
    public final TakoUserItem user;

    public TakoVideoItem() {
        this("", 0L, new BaseImage(null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262143, null), new TakoUserItem(0L, "", "", new BaseImage(null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262143, null), "", new TakoCertInfo(false, ""), new TakoRelationInfo(new TakoBlockInfo(false, false), new TakoFollowInfo(-1, -1, 0)), new TakoPrivateInfo(false)), "", 0L, null, null, new LinkedHashMap(), null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoVideoItem)) {
            return false;
        }
        TakoVideoItem takoVideoItem = (TakoVideoItem) obj;
        return Intrinsics.LJFF(this.awemeId, takoVideoItem.awemeId) && this.diggCount == takoVideoItem.diggCount && Intrinsics.LJFF(this.cover, takoVideoItem.cover) && Intrinsics.LJFF(this.user, takoVideoItem.user) && Intrinsics.LJFF(this.desc, takoVideoItem.desc) && this.createTime == takoVideoItem.createTime && Intrinsics.LJFF(this.awemeType, takoVideoItem.awemeType) && Intrinsics.LJFF(this.keyframeList, takoVideoItem.keyframeList) && Intrinsics.LJFF(this.isLiked, takoVideoItem.isLiked) && Intrinsics.LJFF(this.LIZ, takoVideoItem.LIZ) && Intrinsics.LJFF(this.productAnchor, takoVideoItem.productAnchor);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.awemeId.hashCode() * 31) + C786410Ut5.Y2(this.diggCount)) * 31) + this.cover.hashCode()) * 31) + this.user.hashCode()) * 31) + this.desc.hashCode()) * 31) + C786410Ut5.Y2(this.createTime)) * 31;
        Integer num = this.awemeType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Keyframe> list = this.keyframeList;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.isLiked.hashCode()) * 31;
        Aweme aweme = this.LIZ;
        int iHashCode4 = (iHashCode3 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        ProductAnchor productAnchor = this.productAnchor;
        return iHashCode4 + (productAnchor != null ? productAnchor.hashCode() : 0);
    }

    public TakoVideoItem(String str, long j, BaseImage baseImage, TakoUserItem takoUserItem, String str2, long j2, Integer num, List<Keyframe> list, Map<String, Boolean> map, Aweme aweme, ProductAnchor productAnchor) {
        this.awemeId = str;
        this.diggCount = j;
        this.cover = baseImage;
        this.user = takoUserItem;
        this.desc = str2;
        this.createTime = j2;
        this.awemeType = num;
        this.keyframeList = list;
        this.isLiked = map;
        this.LIZ = aweme;
        this.productAnchor = productAnchor;
    }
}
