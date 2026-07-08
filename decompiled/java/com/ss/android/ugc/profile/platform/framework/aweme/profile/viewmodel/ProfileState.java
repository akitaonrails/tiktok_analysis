package com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C1252530ihP;
import X.C1253570ij5;
import X.C12E8;
import X.C19720512Dr;
import X.C291001Au;
import X.C428600GrK;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class ProfileState implements C004I {
    public static final int $stable = 8;
    public final C1253570ij5 aigcNavMetadata;
    public final int avatarClickCount;
    public final C19720512Dr csiBanner;
    public final int curTabType;
    public final Integer currentDownloadSetting;
    public final String enterFrom;
    public final String fromSearch;
    public final Boolean guideCardOnDisplay;
    public final C12E8 guideCreateVideoWithEffectModel;
    public final boolean isAvatarClicked;
    public final boolean isBackgroundCoverClicked;
    public final Boolean isBlankWorkShow;
    public final boolean isBottomBannerCheckComplete;
    public final boolean isFirstNodeShow;
    public final Boolean isFromMain;
    public final Boolean isGuideUserCard;
    public final boolean isLocating;
    public final Boolean isPostAndDraftEmpty;
    public final Boolean isPostAwemeEmpty;
    public final Boolean isPostAwemeEmptyWhenPrivateShow;
    public final Boolean isPostGuideShow;
    public final Boolean isPublishTabEmpty;
    public final boolean isRefreshing;
    public final String livePreviousPage;
    public final AbstractC1252750ihl<Pair<UrlModel, C428600GrK>> loadAvatar;
    public final C291001Au<Unit> needRefreshAwemeListEvent;
    public final C291001Au<Pair<String, Music>> needRefreshPhotoModeAwemeMuteEvent;
    public final boolean needShowProfileCollectionGuide;
    public final String needUpdateAvatarUrl;
    public final boolean onHiddenChanged;
    public final C291001Au<BannerDisplayInfo> photoTopicProfileBannerEvent;
    public final C291001Au<Boolean> publishAwemeRefreshed;
    public final Boolean shouldShowViewerDialog;
    public final Boolean shouldShowViewerEntranceTips;
    public final Aweme sourceAweme;
    public final String suid;
    public final C291001Au<Integer> targetTab;
    public final C291001Au<Aweme> triggerCopyrightViolationSnackBarEvent;
    public final String uid;
    public final User user;
    public final boolean userVisibleHint;

    public ProfileState() {
        this(null, null, null, null, C1252530ihP.LIZ, 0, 0, true, null, "", Boolean.FALSE, true, "", null, null, null, null, null, null, false, null, false, false, null, false, "", Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, null, null, null, false, null, false, false);
    }

    public final ProfileState copy(String str, String str2, User user, Aweme aweme, AbstractC1252750ihl<? extends Pair<? extends UrlModel, ? extends C428600GrK>> abstractC1252750ihl, int i, int i2, boolean z, String str3, String str4, Boolean bool, boolean z2, String str5, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, boolean z3, C291001Au<? extends Aweme> c291001Au, boolean z4, boolean z5, Integer num, boolean z6, String str6, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, C1253570ij5 c1253570ij5, C291001Au<Integer> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<? extends Pair<String, ? extends Music>> c291001Au4, C291001Au<BannerDisplayInfo> c291001Au5, C19720512Dr c19720512Dr, C12E8 c12e8, boolean z7, C291001Au<Boolean> c291001Au6, boolean z8, boolean z9) {
        return new ProfileState(str, str2, user, aweme, abstractC1252750ihl, i, i2, z, str3, str4, bool, z2, str5, bool2, bool3, bool4, bool5, bool6, bool7, z3, c291001Au, z4, z5, num, z6, str6, bool8, bool9, bool10, bool11, c1253570ij5, c291001Au2, c291001Au3, c291001Au4, c291001Au5, c19720512Dr, c12e8, z7, c291001Au6, z8, z9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileState)) {
            return false;
        }
        ProfileState profileState = (ProfileState) obj;
        return Intrinsics.LJFF(this.uid, profileState.uid) && Intrinsics.LJFF(this.suid, profileState.suid) && Intrinsics.LJFF(this.user, profileState.user) && Intrinsics.LJFF(this.sourceAweme, profileState.sourceAweme) && Intrinsics.LJFF(this.loadAvatar, profileState.loadAvatar) && this.avatarClickCount == profileState.avatarClickCount && this.curTabType == profileState.curTabType && this.userVisibleHint == profileState.userVisibleHint && Intrinsics.LJFF(this.needUpdateAvatarUrl, profileState.needUpdateAvatarUrl) && Intrinsics.LJFF(this.livePreviousPage, profileState.livePreviousPage) && Intrinsics.LJFF(this.isFromMain, profileState.isFromMain) && this.isFirstNodeShow == profileState.isFirstNodeShow && Intrinsics.LJFF(this.enterFrom, profileState.enterFrom) && Intrinsics.LJFF(this.isPostGuideShow, profileState.isPostGuideShow) && Intrinsics.LJFF(this.isPostAwemeEmpty, profileState.isPostAwemeEmpty) && Intrinsics.LJFF(this.isPostAndDraftEmpty, profileState.isPostAndDraftEmpty) && Intrinsics.LJFF(this.isGuideUserCard, profileState.isGuideUserCard) && Intrinsics.LJFF(this.isPublishTabEmpty, profileState.isPublishTabEmpty) && Intrinsics.LJFF(this.isPostAwemeEmptyWhenPrivateShow, profileState.isPostAwemeEmptyWhenPrivateShow) && this.needShowProfileCollectionGuide == profileState.needShowProfileCollectionGuide && Intrinsics.LJFF(this.triggerCopyrightViolationSnackBarEvent, profileState.triggerCopyrightViolationSnackBarEvent) && this.isAvatarClicked == profileState.isAvatarClicked && this.isBackgroundCoverClicked == profileState.isBackgroundCoverClicked && Intrinsics.LJFF(this.currentDownloadSetting, profileState.currentDownloadSetting) && this.onHiddenChanged == profileState.onHiddenChanged && Intrinsics.LJFF(this.fromSearch, profileState.fromSearch) && Intrinsics.LJFF(this.shouldShowViewerEntranceTips, profileState.shouldShowViewerEntranceTips) && Intrinsics.LJFF(this.shouldShowViewerDialog, profileState.shouldShowViewerDialog) && Intrinsics.LJFF(this.guideCardOnDisplay, profileState.guideCardOnDisplay) && Intrinsics.LJFF(this.isBlankWorkShow, profileState.isBlankWorkShow) && Intrinsics.LJFF(this.aigcNavMetadata, profileState.aigcNavMetadata) && Intrinsics.LJFF(this.targetTab, profileState.targetTab) && Intrinsics.LJFF(this.needRefreshAwemeListEvent, profileState.needRefreshAwemeListEvent) && Intrinsics.LJFF(this.needRefreshPhotoModeAwemeMuteEvent, profileState.needRefreshPhotoModeAwemeMuteEvent) && Intrinsics.LJFF(this.photoTopicProfileBannerEvent, profileState.photoTopicProfileBannerEvent) && Intrinsics.LJFF(this.csiBanner, profileState.csiBanner) && Intrinsics.LJFF(this.guideCreateVideoWithEffectModel, profileState.guideCreateVideoWithEffectModel) && this.isBottomBannerCheckComplete == profileState.isBottomBannerCheckComplete && Intrinsics.LJFF(this.publishAwemeRefreshed, profileState.publishAwemeRefreshed) && this.isRefreshing == profileState.isRefreshing && this.isLocating == profileState.isLocating;
    }

    public int hashCode() {
        String str = this.uid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.suid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        User user = this.user;
        int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        Aweme aweme = this.sourceAweme;
        int iHashCode4 = (((((((((iHashCode3 + (aweme == null ? 0 : aweme.hashCode())) * 31) + this.loadAvatar.hashCode()) * 31) + this.avatarClickCount) * 31) + this.curTabType) * 31) + C786410Ut5.Z2(this.userVisibleHint)) * 31;
        String str3 = this.needUpdateAvatarUrl;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.livePreviousPage;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isFromMain;
        int iHashCode7 = (((iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.isFirstNodeShow)) * 31;
        String str5 = this.enterFrom;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.isPostGuideShow;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isPostAwemeEmpty;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isPostAndDraftEmpty;
        int iHashCode11 = (iHashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isGuideUserCard;
        int iHashCode12 = (iHashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isPublishTabEmpty;
        int iHashCode13 = (iHashCode12 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isPostAwemeEmptyWhenPrivateShow;
        int iHashCode14 = (((iHashCode13 + (bool7 == null ? 0 : bool7.hashCode())) * 31) + C786410Ut5.Z2(this.needShowProfileCollectionGuide)) * 31;
        C291001Au<Aweme> c291001Au = this.triggerCopyrightViolationSnackBarEvent;
        int iHashCode15 = (((((iHashCode14 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + C786410Ut5.Z2(this.isAvatarClicked)) * 31) + C786410Ut5.Z2(this.isBackgroundCoverClicked)) * 31;
        Integer num = this.currentDownloadSetting;
        int iHashCode16 = (((iHashCode15 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.onHiddenChanged)) * 31;
        String str6 = this.fromSearch;
        int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool8 = this.shouldShowViewerEntranceTips;
        int iHashCode18 = (iHashCode17 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.shouldShowViewerDialog;
        int iHashCode19 = (iHashCode18 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.guideCardOnDisplay;
        int iHashCode20 = (iHashCode19 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.isBlankWorkShow;
        int iHashCode21 = (iHashCode20 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        C1253570ij5 c1253570ij5 = this.aigcNavMetadata;
        int iHashCode22 = (iHashCode21 + (c1253570ij5 == null ? 0 : c1253570ij5.hashCode())) * 31;
        C291001Au<Integer> c291001Au2 = this.targetTab;
        int iHashCode23 = (iHashCode22 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Unit> c291001Au3 = this.needRefreshAwemeListEvent;
        int iHashCode24 = (iHashCode23 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Pair<String, Music>> c291001Au4 = this.needRefreshPhotoModeAwemeMuteEvent;
        int iHashCode25 = (iHashCode24 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<BannerDisplayInfo> c291001Au5 = this.photoTopicProfileBannerEvent;
        int iHashCode26 = (iHashCode25 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C19720512Dr c19720512Dr = this.csiBanner;
        int iHashCode27 = (iHashCode26 + (c19720512Dr == null ? 0 : c19720512Dr.hashCode())) * 31;
        C12E8 c12e8 = this.guideCreateVideoWithEffectModel;
        int iHashCode28 = (((iHashCode27 + (c12e8 == null ? 0 : c12e8.hashCode())) * 31) + C786410Ut5.Z2(this.isBottomBannerCheckComplete)) * 31;
        C291001Au<Boolean> c291001Au6 = this.publishAwemeRefreshed;
        return ((((iHashCode28 + (c291001Au6 != null ? c291001Au6.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isRefreshing)) * 31) + C786410Ut5.Z2(this.isLocating);
    }

    public String toString() {
        return "ProfileState(uid=" + this.uid + ", suid=" + this.suid + ", user=" + this.user + ", sourceAweme=" + this.sourceAweme + ", loadAvatar=" + this.loadAvatar + ", avatarClickCount=" + this.avatarClickCount + ", curTabType=" + this.curTabType + ", userVisibleHint=" + this.userVisibleHint + ", needUpdateAvatarUrl=" + this.needUpdateAvatarUrl + ", livePreviousPage=" + this.livePreviousPage + ", isFromMain=" + this.isFromMain + ", isFirstNodeShow=" + this.isFirstNodeShow + ", enterFrom=" + this.enterFrom + ", isPostGuideShow=" + this.isPostGuideShow + ", isPostAwemeEmpty=" + this.isPostAwemeEmpty + ", isPostAndDraftEmpty=" + this.isPostAndDraftEmpty + ", isGuideUserCard=" + this.isGuideUserCard + ", isPublishTabEmpty=" + this.isPublishTabEmpty + ", isPostAwemeEmptyWhenPrivateShow=" + this.isPostAwemeEmptyWhenPrivateShow + ", needShowProfileCollectionGuide=" + this.needShowProfileCollectionGuide + ", triggerCopyrightViolationSnackBarEvent=" + this.triggerCopyrightViolationSnackBarEvent + ", isAvatarClicked=" + this.isAvatarClicked + ", isBackgroundCoverClicked=" + this.isBackgroundCoverClicked + ", currentDownloadSetting=" + this.currentDownloadSetting + ", onHiddenChanged=" + this.onHiddenChanged + ", fromSearch=" + this.fromSearch + ", shouldShowViewerEntranceTips=" + this.shouldShowViewerEntranceTips + ", shouldShowViewerDialog=" + this.shouldShowViewerDialog + ", guideCardOnDisplay=" + this.guideCardOnDisplay + ", isBlankWorkShow=" + this.isBlankWorkShow + ", aigcNavMetadata=" + this.aigcNavMetadata + ", targetTab=" + this.targetTab + ", needRefreshAwemeListEvent=" + this.needRefreshAwemeListEvent + ", needRefreshPhotoModeAwemeMuteEvent=" + this.needRefreshPhotoModeAwemeMuteEvent + ", photoTopicProfileBannerEvent=" + this.photoTopicProfileBannerEvent + ", csiBanner=" + this.csiBanner + ", guideCreateVideoWithEffectModel=" + this.guideCreateVideoWithEffectModel + ", isBottomBannerCheckComplete=" + this.isBottomBannerCheckComplete + ", publishAwemeRefreshed=" + this.publishAwemeRefreshed + ", isRefreshing=" + this.isRefreshing + ", isLocating=" + this.isLocating + ')';
    }

    public final C1253570ij5 getAigcNavMetadata() {
        return this.aigcNavMetadata;
    }

    public final int getAvatarClickCount() {
        return this.avatarClickCount;
    }

    public final C19720512Dr getCsiBanner() {
        return this.csiBanner;
    }

    public final int getCurTabType() {
        return this.curTabType;
    }

    public final Integer getCurrentDownloadSetting() {
        return this.currentDownloadSetting;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getFromSearch() {
        return this.fromSearch;
    }

    public final Boolean getGuideCardOnDisplay() {
        return this.guideCardOnDisplay;
    }

    public final C12E8 getGuideCreateVideoWithEffectModel() {
        return this.guideCreateVideoWithEffectModel;
    }

    public final String getLivePreviousPage() {
        return this.livePreviousPage;
    }

    public final AbstractC1252750ihl<Pair<UrlModel, C428600GrK>> getLoadAvatar() {
        return this.loadAvatar;
    }

    public final C291001Au<Unit> getNeedRefreshAwemeListEvent() {
        return this.needRefreshAwemeListEvent;
    }

    public final C291001Au<Pair<String, Music>> getNeedRefreshPhotoModeAwemeMuteEvent() {
        return this.needRefreshPhotoModeAwemeMuteEvent;
    }

    public final boolean getNeedShowProfileCollectionGuide() {
        return this.needShowProfileCollectionGuide;
    }

    public final String getNeedUpdateAvatarUrl() {
        return this.needUpdateAvatarUrl;
    }

    public final boolean getOnHiddenChanged() {
        return this.onHiddenChanged;
    }

    public final C291001Au<BannerDisplayInfo> getPhotoTopicProfileBannerEvent() {
        return this.photoTopicProfileBannerEvent;
    }

    public final C291001Au<Boolean> getPublishAwemeRefreshed() {
        return this.publishAwemeRefreshed;
    }

    public final Boolean getShouldShowViewerDialog() {
        return this.shouldShowViewerDialog;
    }

    public final Boolean getShouldShowViewerEntranceTips() {
        return this.shouldShowViewerEntranceTips;
    }

    public final Aweme getSourceAweme() {
        return this.sourceAweme;
    }

    public final String getSuid() {
        return this.suid;
    }

    public final C291001Au<Integer> getTargetTab() {
        return this.targetTab;
    }

    public final C291001Au<Aweme> getTriggerCopyrightViolationSnackBarEvent() {
        return this.triggerCopyrightViolationSnackBarEvent;
    }

    public final String getUid() {
        return this.uid;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean getUserVisibleHint() {
        return this.userVisibleHint;
    }

    public final boolean isAvatarClicked() {
        return this.isAvatarClicked;
    }

    public final boolean isBackgroundCoverClicked() {
        return this.isBackgroundCoverClicked;
    }

    public final Boolean isBlankWorkShow() {
        return this.isBlankWorkShow;
    }

    public final boolean isBottomBannerCheckComplete() {
        return this.isBottomBannerCheckComplete;
    }

    public final boolean isFirstNodeShow() {
        return this.isFirstNodeShow;
    }

    public final Boolean isFromMain() {
        return this.isFromMain;
    }

    public final Boolean isGuideUserCard() {
        return this.isGuideUserCard;
    }

    public final boolean isLocating() {
        return this.isLocating;
    }

    public final Boolean isPostAndDraftEmpty() {
        return this.isPostAndDraftEmpty;
    }

    public final Boolean isPostAwemeEmpty() {
        return this.isPostAwemeEmpty;
    }

    public final Boolean isPostAwemeEmptyWhenPrivateShow() {
        return this.isPostAwemeEmptyWhenPrivateShow;
    }

    public final Boolean isPostGuideShow() {
        return this.isPostGuideShow;
    }

    public final Boolean isPublishTabEmpty() {
        return this.isPublishTabEmpty;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileState(String str, String str2, User user, Aweme aweme, AbstractC1252750ihl<? extends Pair<? extends UrlModel, ? extends C428600GrK>> abstractC1252750ihl, int i, int i2, boolean z, String str3, String str4, Boolean bool, boolean z2, String str5, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, boolean z3, C291001Au<? extends Aweme> c291001Au, boolean z4, boolean z5, Integer num, boolean z6, String str6, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, C1253570ij5 c1253570ij5, C291001Au<Integer> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<? extends Pair<String, ? extends Music>> c291001Au4, C291001Au<BannerDisplayInfo> c291001Au5, C19720512Dr c19720512Dr, C12E8 c12e8, boolean z7, C291001Au<Boolean> c291001Au6, boolean z8, boolean z9) {
        this.uid = str;
        this.suid = str2;
        this.user = user;
        this.sourceAweme = aweme;
        this.loadAvatar = abstractC1252750ihl;
        this.avatarClickCount = i;
        this.curTabType = i2;
        this.userVisibleHint = z;
        this.needUpdateAvatarUrl = str3;
        this.livePreviousPage = str4;
        this.isFromMain = bool;
        this.isFirstNodeShow = z2;
        this.enterFrom = str5;
        this.isPostGuideShow = bool2;
        this.isPostAwemeEmpty = bool3;
        this.isPostAndDraftEmpty = bool4;
        this.isGuideUserCard = bool5;
        this.isPublishTabEmpty = bool6;
        this.isPostAwemeEmptyWhenPrivateShow = bool7;
        this.needShowProfileCollectionGuide = z3;
        this.triggerCopyrightViolationSnackBarEvent = c291001Au;
        this.isAvatarClicked = z4;
        this.isBackgroundCoverClicked = z5;
        this.currentDownloadSetting = num;
        this.onHiddenChanged = z6;
        this.fromSearch = str6;
        this.shouldShowViewerEntranceTips = bool8;
        this.shouldShowViewerDialog = bool9;
        this.guideCardOnDisplay = bool10;
        this.isBlankWorkShow = bool11;
        this.aigcNavMetadata = c1253570ij5;
        this.targetTab = c291001Au2;
        this.needRefreshAwemeListEvent = c291001Au3;
        this.needRefreshPhotoModeAwemeMuteEvent = c291001Au4;
        this.photoTopicProfileBannerEvent = c291001Au5;
        this.csiBanner = c19720512Dr;
        this.guideCreateVideoWithEffectModel = c12e8;
        this.isBottomBannerCheckComplete = z7;
        this.publishAwemeRefreshed = c291001Au6;
        this.isRefreshing = z8;
        this.isLocating = z9;
    }
}
