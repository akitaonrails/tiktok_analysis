package com.ss.android.ugc.ur.socialavatar;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarResultResponse extends BaseResponse {

    @C09CT("animation_gif_urls")
    public final List<String> animationGifUrls;

    @C09CT("animation_uris")
    public final List<String> animationUrisInUserBucket;

    @C09CT("animation_urls")
    public final List<String> animationUrls;

    @C09CT("new_avatar_id")
    public final Long avatarId;

    @C09CT("avatar_uris")
    public final List<String> avatarUrisInUserBucket;

    @C09CT("avatar_urls")
    public final List<String> avatarUrls;

    @C09CT("expressions")
    public final List<String> expressionNameList;

    @C09CT("expression_selection")
    public final Integer expressionSelection;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("style_selection")
    public final Integer styleSelection;

    @C09CT("use_new_save_flow")
    public final boolean useNewSaveFlow;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAvatarResultResponse)) {
            return false;
        }
        SocialAvatarResultResponse socialAvatarResultResponse = (SocialAvatarResultResponse) obj;
        return Intrinsics.LJFF(this.avatarUrls, socialAvatarResultResponse.avatarUrls) && Intrinsics.LJFF(this.animationUrls, socialAvatarResultResponse.animationUrls) && Intrinsics.LJFF(this.expressionNameList, socialAvatarResultResponse.expressionNameList) && Intrinsics.LJFF(this.styleSelection, socialAvatarResultResponse.styleSelection) && Intrinsics.LJFF(this.expressionSelection, socialAvatarResultResponse.expressionSelection) && Intrinsics.LJFF(this.avatarId, socialAvatarResultResponse.avatarId) && Intrinsics.LJFF(this.animationGifUrls, socialAvatarResultResponse.animationGifUrls) && this.useNewSaveFlow == socialAvatarResultResponse.useNewSaveFlow && Intrinsics.LJFF(this.avatarUrisInUserBucket, socialAvatarResultResponse.avatarUrisInUserBucket) && Intrinsics.LJFF(this.animationUrisInUserBucket, socialAvatarResultResponse.animationUrisInUserBucket) && Intrinsics.LJFF(this.logPb, socialAvatarResultResponse.logPb);
    }

    public final int hashCode() {
        List<String> list = this.avatarUrls;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.animationUrls;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.expressionNameList;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.styleSelection;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.expressionSelection;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.avatarId;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        List<String> list4 = this.animationGifUrls;
        int iHashCode7 = (((iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31) + C786410Ut5.Z2(this.useNewSaveFlow)) * 31;
        List<String> list5 = this.avatarUrisInUserBucket;
        int iHashCode8 = (iHashCode7 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.animationUrisInUserBucket;
        int iHashCode9 = (iHashCode8 + (list6 == null ? 0 : list6.hashCode())) * 31;
        LogPbBean logPbBean = this.logPb;
        return iHashCode9 + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "SocialAvatarResultResponse(avatarUrls=" + this.avatarUrls + ", animationUrls=" + this.animationUrls + ", expressionNameList=" + this.expressionNameList + ", styleSelection=" + this.styleSelection + ", expressionSelection=" + this.expressionSelection + ", avatarId=" + this.avatarId + ", animationGifUrls=" + this.animationGifUrls + ", useNewSaveFlow=" + this.useNewSaveFlow + ", avatarUrisInUserBucket=" + this.avatarUrisInUserBucket + ", animationUrisInUserBucket=" + this.animationUrisInUserBucket + ", logPb=" + this.logPb + ')';
    }

    public SocialAvatarResultResponse(List<String> list, List<String> list2, List<String> list3, Integer num, Integer num2, Long l, List<String> list4, boolean z, List<String> list5, List<String> list6, LogPbBean logPbBean) {
        this.avatarUrls = list;
        this.animationUrls = list2;
        this.expressionNameList = list3;
        this.styleSelection = num;
        this.expressionSelection = num2;
        this.avatarId = l;
        this.animationGifUrls = list4;
        this.useNewSaveFlow = z;
        this.avatarUrisInUserBucket = list5;
        this.animationUrisInUserBucket = list6;
        this.logPb = logPbBean;
    }
}
