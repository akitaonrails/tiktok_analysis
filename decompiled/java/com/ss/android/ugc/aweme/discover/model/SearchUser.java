package com.ss.android.ugc.aweme.discover.model;

import X.C086I;
import X.C09CT;
import X.InterfaceC1587906Jp;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.NewFaceSticker;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class SearchUser implements InterfaceC1587906Jp {

    @C09CT("ad_item")
    public Aweme adItem;

    @C09CT("items")
    public List<Aweme> awemeCards;

    @C09CT("challenges")
    public List<Challenge> challengeList;

    @C09CT("dynamic_patch")
    public DynamicPatch dynamicPatch;

    @C09CT("effects")
    public List<NewFaceSticker> effectCards;
    public String entityType;
    public Function0<List<Aweme>> fullAwemeListFetcher;

    @C09CT("live_anchor_info")
    public SubscribeLiveStruct liveAnchorInfo;
    public LogPbBean logPb;
    public GlobalDoodleConfig mGlobalDoodleConfig;

    @C09CT("mix_cursor")
    public Long mixCursor;

    @C09CT("mix_has_more")
    public Boolean mixHasMore;

    @C09CT("mix_list")
    public List<MixStruct> playlists;

    @C09CT("position")
    public List<Position> position;

    @C09CT("product")
    public ProductGroup productGroup;
    public int rank;

    @C09CT("remark_position")
    public List<Position> remarkPosition;

    @C09CT("horizontal_data")
    public SearchUserHorizontalData searchUserHorizontalData;

    @C09CT("type")
    public int type;

    @C09CT("uniqid_position")
    public List<Position> uniqidPosition;

    @C09CT("user_info")
    public User user;

    @C09CT("user_entity_info")
    public UserEntityInfo userEntityInfo;

    public int cardType() {
        if (C086I.LIZIZ(this.awemeCards)) {
            return !C086I.LIZIZ(this.effectCards) ? 3 : 0;
        }
        return 1;
    }

    public List<Aweme> getFullAwemeList() {
        Function0<List<Aweme>> function0 = this.fullAwemeListFetcher;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public boolean hasMedia() {
        ProductGroup productGroup;
        return !(C086I.LIZIZ(this.awemeCards) && C086I.LIZIZ(this.effectCards) && ((productGroup = this.productGroup) == null || C086I.LIZIZ(productGroup.productList)));
    }

    public int hashCode() {
        DynamicPatch dynamicPatch = this.dynamicPatch;
        int iHashCode = 0;
        int iHashCode2 = (dynamicPatch != null ? dynamicPatch.hashCode() : 0) * 6;
        User user = this.user;
        if (user != null && user.getUid() != null) {
            iHashCode = this.user.getUid().hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public boolean isDynamicCard() {
        return this.dynamicPatch != null;
    }

    public boolean isStar() {
        return this.awemeCards != null;
    }

    public int getType() {
        return isDynamicCard() ? 999 : 0;
    }

    public boolean isAladdin() {
        return cardType() != 0;
    }

    public Aweme getAdItem() {
        return this.adItem;
    }

    public List<Aweme> getAwemeCards() {
        return this.awemeCards;
    }

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public DynamicPatch getDynamicPatch() {
        return this.dynamicPatch;
    }

    public List<NewFaceSticker> getEffectCards() {
        return this.effectCards;
    }

    public String getEntityType() {
        return this.entityType;
    }

    public GlobalDoodleConfig getGlobalDoodleConfig() {
        return this.mGlobalDoodleConfig;
    }

    public SubscribeLiveStruct getLiveAnchorInfo() {
        return this.liveAnchorInfo;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public Long getMixCursor() {
        return this.mixCursor;
    }

    public Boolean getMixHasMore() {
        return this.mixHasMore;
    }

    public List<MixStruct> getPlaylists() {
        return this.playlists;
    }

    public List<Position> getPosition() {
        return this.position;
    }

    public ProductGroup getProductGroup() {
        return this.productGroup;
    }

    public List<Position> getRemarkPosition() {
        return this.remarkPosition;
    }

    public SearchUserHorizontalData getSearchUserHorizontalData() {
        return this.searchUserHorizontalData;
    }

    public List<Position> getUniqidPosition() {
        return this.uniqidPosition;
    }

    public User getUser() {
        return this.user;
    }

    public UserEntityInfo getUserEntityInfo() {
        return this.userEntityInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchUser)) {
            return false;
        }
        SearchUser searchUser = (SearchUser) obj;
        if (!equals(this.dynamicPatch, searchUser.dynamicPatch) || !equals(this.awemeCards, searchUser.awemeCards)) {
            return false;
        }
        User user = this.user;
        if (user != null && searchUser.user != null) {
            return TextUtils.equals(user.getUid(), searchUser.user.getUid());
        }
        return equals(user, searchUser.user);
    }

    public void setAwemeCards(List<Aweme> list) {
        this.awemeCards = list;
    }

    public void setDynamicPatch(DynamicPatch dynamicPatch) {
        this.dynamicPatch = dynamicPatch;
    }

    public void setEntityType(String str) {
        this.entityType = str;
    }

    public void setFullAwemeListFetcher(Function0<List<Aweme>> function0) {
        this.fullAwemeListFetcher = function0;
    }

    public void setGlobalDoodleConfig(GlobalDoodleConfig globalDoodleConfig) {
        this.mGlobalDoodleConfig = globalDoodleConfig;
    }

    public void setLiveAnchorInfo(SubscribeLiveStruct subscribeLiveStruct) {
        this.liveAnchorInfo = subscribeLiveStruct;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setProductGroup(ProductGroup productGroup) {
        this.productGroup = productGroup;
    }

    public void setSearchUserHorizontalData(SearchUserHorizontalData searchUserHorizontalData) {
        this.searchUserHorizontalData = searchUserHorizontalData;
    }

    public void setType(int i) {
        this.type = i;
    }

    public SearchUser setUser(User user) {
        this.user = user;
        return this;
    }

    public void setUserEntityInfo(UserEntityInfo userEntityInfo) {
        this.userEntityInfo = userEntityInfo;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj != null && obj.equals(obj2)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
