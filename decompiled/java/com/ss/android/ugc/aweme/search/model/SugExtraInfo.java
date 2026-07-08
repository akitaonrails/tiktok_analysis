package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import X.C0CS0;
import X.C2095008Iq;
import X.C23250099c;
import X.C23271099x;
import X.C313840CRy;
import X.C313850CRz;
import X.InterfaceC1294060jmO;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.FakeDataInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes36.dex */
public final class SugExtraInfo implements Serializable {

    @C09CT("product_id")
    public String attachProductId;

    @C09CT("can_message_follow_status_list")
    public List<Integer> canMessageFollowStatusList;

    @C09CT("penetrate_info")
    public String confirmPenetrateInfo;

    @C09CT("fake_data_info")
    public FakeDataInfo fakeDataInfo;

    @C09CT("follower_status")
    public int followerStatus;
    public boolean hasSasIcon;

    @C09CT("is_business_account")
    public boolean isBusinessAccount;
    public boolean isMiniChunk;

    @C09CT("is_private_account")
    public boolean isPrivateAccount;

    @C09CT("is_verified_tako")
    public String isVerifiedTako;

    @C09CT("matched_friend")
    public String matchedFriendStruct;

    @C09CT("mention_block_type")
    public long mentionBlockType;

    @C09CT("predict_ctr_score")
    public double predictCtrScore;

    @C09CT("search_after_search_sug_type")
    public String sasSugType;

    @C09CT("search_after_search_text")
    public String sasText;

    @C09CT("rich_sug_follower_count")
    public Long totalFollowers;

    @C09CT("user_story_status")
    public int userStoryStatus;

    @C09CT("is_rich_sug")
    public String isRichSugValue = CardStruct.IStatusCode.DEFAULT;

    @C09CT("sug_user_id")
    public String userId = "";

    @C09CT("sug_sec_user_id")
    public String secUserId = "";

    @C09CT("rich_sug_avatar_uri")
    public String userAvatarUri = "";

    @C09CT("rich_sug_nickname")
    public String userNickname = "";

    @C09CT("sug_uniq_id")
    public String username = "";

    @C09CT("relation_type")
    public String userRelationType = "";

    @C09CT("rich_sug_aweme_count")
    public String totalVideos = "";

    @C09CT("rich_sug_user_type")
    public String userTypeString = "";

    @C09CT("rich_sug_shop_type")
    public String shopTypeString = "";

    @C09CT("rich_sug_type")
    public String sugTypeString = CardStruct.IStatusCode.DEFAULT;

    @C09CT("is_history_sug")
    public String isHistorySug = CardStruct.IStatusCode.DEFAULT;

    @C09CT("is_personalized")
    public String isPersonalized = CardStruct.IStatusCode.DEFAULT;
    public String queryLang = "";

    @C09CT("lang")
    public String confirmQueryLang = "";
    public String recallReason = "";

    @C09CT("recall_reason")
    public String confirmRecallReason = "";

    @C09CT("result_tab")
    public String resultTab = "";

    @C09CT("sug_hint")
    public String sugHint = "";

    @C09CT("is_creator_live")
    public String isCreatorLiveValue = CardStruct.IStatusCode.DEFAULT;

    @C09CT("is_live_query")
    public String isLiveQueryValue = "";

    @C09CT("tako_desc")
    public String takoDesc = "";

    @C09CT("tako_prompt")
    public String takoPrompt = "";

    @C09CT("sug_shop_id")
    public String sugShopId = "";

    @C09CT("words_type")
    public String wordsType = "";

    @C09CT("follow_status")
    public int followStatusFromApi = -1;

    @C09CT("followers_count")
    public long followerCount = -1;

    @C09CT("aweme_count")
    public long awemeCount = -1;

    @C09CT("use_generative_sug")
    public String useGenerativeSug = "";

    @C09CT("generative_display_starting_pos")
    public String generativeDisplayStartingPos = "";

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSugHint$annotations() {
    }

    public static /* synthetic */ void getUserRelationType$annotations() {
    }

    public final int getFollowStatus() {
        String str = this.userRelationType;
        if (Intrinsics.LJFF(str, "friends")) {
            return 2;
        }
        return Intrinsics.LJFF(str, "following") ? 1 : 0;
    }

    public final Integer getGenerativeDisplayBegin() {
        String str = this.generativeDisplayStartingPos;
        if (str != null) {
            return C2095008Iq.LJIIJJI(str);
        }
        return null;
    }

    public final boolean getHasUserRelation() {
        return Intrinsics.LJFF(this.userRelationType, "friends") || Intrinsics.LJFF(this.userRelationType, "following");
    }

    public final String getPenetrateInfo() throws Throwable {
        if (!this.isMiniChunk || !TextUtils.isEmpty(this.confirmPenetrateInfo)) {
            return this.confirmPenetrateInfo;
        }
        C23250099c.LJ(C23271099x.INSTANCE, new C313840CRy(this, null));
        return this.confirmPenetrateInfo;
    }

    public final String getQueryLang() throws Throwable {
        if (!this.isMiniChunk || !TextUtils.isEmpty(this.confirmQueryLang)) {
            return this.confirmQueryLang;
        }
        C23250099c.LJ(C23271099x.INSTANCE, new C313850CRz(this, null));
        return this.confirmQueryLang;
    }

    public final String getRecallReason() throws Throwable {
        if (!this.isMiniChunk || !TextUtils.isEmpty(this.confirmRecallReason)) {
            return this.confirmRecallReason;
        }
        C23250099c.LJ(C23271099x.INSTANCE, new C0CS0(this, null));
        return this.confirmRecallReason;
    }

    public final int getUserType() {
        Integer numLJIIJJI;
        String str = this.userTypeString;
        if (str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) {
            return -1;
        }
        return numLJIIJJI.intValue();
    }

    public final boolean isBrandShop() {
        Integer numLJIIJJI;
        String str = this.shopTypeString;
        return (str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null || numLJIIJJI.intValue() != 1) ? false : true;
    }

    public final boolean isCreatorLive() {
        return Intrinsics.LJFF(this.isCreatorLiveValue, "1");
    }

    public final boolean isGenerativeSug() {
        return Intrinsics.LJFF(this.useGenerativeSug, "1");
    }

    public final boolean isLiveQuery() {
        return Intrinsics.LJFF(this.isLiveQueryValue, "1");
    }

    public final boolean isRegularSugType() {
        Integer numLJIIJJI;
        String str = this.sugTypeString;
        return (str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null || numLJIIJJI.intValue() != 1) ? false : true;
    }

    public final boolean isRelationSugType() {
        Integer numLJIIJJI;
        String str = this.sugTypeString;
        return (str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null || numLJIIJJI.intValue() != 2) ? false : true;
    }

    public final boolean isRichSug() {
        return Intrinsics.LJFF(this.isRichSugValue, "1");
    }

    public final boolean isSasType() {
        return Intrinsics.LJFF(this.sasSugType, "1");
    }

    public final boolean isVerifiedUser() {
        Integer numLJIIJJI;
        String str = this.userTypeString;
        return (str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null || numLJIIJJI.intValue() != 1) ? false : true;
    }

    public final boolean matchQuery() {
        return a0.LJJLIIIJILLIZJL(getRecallReason(), new String[]{"|"}, 0, 6).contains("origin_query");
    }

    public final String getAttachProductId() {
        return this.attachProductId;
    }

    public final long getAwemeCount() {
        return this.awemeCount;
    }

    public final List<Integer> getCanMessageFollowStatusList() {
        return this.canMessageFollowStatusList;
    }

    public final String getConfirmPenetrateInfo() {
        return this.confirmPenetrateInfo;
    }

    public final String getConfirmQueryLang() {
        return this.confirmQueryLang;
    }

    public final String getConfirmRecallReason() {
        return this.confirmRecallReason;
    }

    public final FakeDataInfo getFakeDataInfo() {
        return this.fakeDataInfo;
    }

    public final int getFollowStatusFromApi() {
        return this.followStatusFromApi;
    }

    public final long getFollowerCount() {
        return this.followerCount;
    }

    public final int getFollowerStatus() {
        return this.followerStatus;
    }

    public final String getGenerativeDisplayStartingPos() {
        return this.generativeDisplayStartingPos;
    }

    public final boolean getHasSasIcon() {
        return this.hasSasIcon;
    }

    public final String getMatchedFriendStruct() {
        return this.matchedFriendStruct;
    }

    public final long getMentionBlockType() {
        return this.mentionBlockType;
    }

    public final double getPredictCtrScore() {
        return this.predictCtrScore;
    }

    public final String getResultTab() {
        return this.resultTab;
    }

    public final String getSasText() {
        return this.sasText;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final String getShopTypeString() {
        return this.shopTypeString;
    }

    public final String getSugHint() {
        return this.sugHint;
    }

    public final String getSugShopId() {
        return this.sugShopId;
    }

    public final String getTakoDesc() {
        return this.takoDesc;
    }

    public final String getTakoPrompt() {
        return this.takoPrompt;
    }

    public final Long getTotalFollowers() {
        return this.totalFollowers;
    }

    public final String getTotalVideos() {
        return this.totalVideos;
    }

    public final String getUseGenerativeSug() {
        return this.useGenerativeSug;
    }

    public final String getUserAvatarUri() {
        return this.userAvatarUri;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserNickname() {
        return this.userNickname;
    }

    public final String getUserRelationType() {
        return this.userRelationType;
    }

    public final int getUserStoryStatus() {
        return this.userStoryStatus;
    }

    public final String getUserTypeString() {
        return this.userTypeString;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getWordsType() {
        return this.wordsType;
    }

    public final boolean isBusinessAccount() {
        return this.isBusinessAccount;
    }

    public final String isCreatorLiveValue() {
        return this.isCreatorLiveValue;
    }

    public final String isHistorySug() {
        return this.isHistorySug;
    }

    public final boolean isMiniChunk() {
        return this.isMiniChunk;
    }

    public final String isPersonalized() {
        return this.isPersonalized;
    }

    public final boolean isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public final String isRichSugValue() {
        return this.isRichSugValue;
    }

    public final String isVerifiedTako() {
        return this.isVerifiedTako;
    }

    public final void setBusinessAccount(boolean z) {
        this.isBusinessAccount = z;
    }

    public final void setConfirmPenetrateInfo(String str) {
        this.confirmPenetrateInfo = str;
    }

    public final void setConfirmQueryLang(String str) {
        this.confirmQueryLang = str;
    }

    public final void setConfirmRecallReason(String str) {
        this.confirmRecallReason = str;
    }

    public final void setCreatorLiveValue(String str) {
        this.isCreatorLiveValue = str;
    }

    public final void setFollowStatusFromApi(int i) {
        this.followStatusFromApi = i;
    }

    public final void setFollowerStatus(int i) {
        this.followerStatus = i;
    }

    public final void setGenerativeDisplayStartingPos(String str) {
        this.generativeDisplayStartingPos = str;
    }

    public final void setHasSasIcon(boolean z) {
        this.hasSasIcon = z;
    }

    public final void setMentionBlockType(long j) {
        this.mentionBlockType = j;
    }

    public final void setMiniChunk(boolean z) {
        this.isMiniChunk = z;
    }

    public final void setPrivateAccount(boolean z) {
        this.isPrivateAccount = z;
    }

    public final void setQueryLang(String str) {
        this.queryLang = str;
    }

    public final void setRecallReason(String str) {
        this.recallReason = str;
    }

    public final void setResultTab(String str) {
        this.resultTab = str;
    }

    public final void setRichSugValue(String str) {
        this.isRichSugValue = str;
    }

    public final void setSasText(String str) {
        this.sasText = str;
    }

    public final void setSecUserId(String str) {
        this.secUserId = str;
    }

    public final void setShopTypeString(String str) {
        this.shopTypeString = str;
    }

    public final void setSugHint(String str) {
        this.sugHint = str;
    }

    public final void setSugShopId(String str) {
        this.sugShopId = str;
    }

    public final void setTakoDesc(String str) {
        this.takoDesc = str;
    }

    public final void setTakoPrompt(String str) {
        this.takoPrompt = str;
    }

    public final void setTotalFollowers(Long l) {
        this.totalFollowers = l;
    }

    public final void setTotalVideos(String str) {
        this.totalVideos = str;
    }

    public final void setUseGenerativeSug(String str) {
        this.useGenerativeSug = str;
    }

    public final void setUserAvatarUri(String str) {
        this.userAvatarUri = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserNickname(String str) {
        this.userNickname = str;
    }

    public final void setUserRelationType(String str) {
        this.userRelationType = str;
    }

    public final void setUserTypeString(String str) {
        this.userTypeString = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public final void setWordsType(String str) {
        this.wordsType = str;
    }
}
