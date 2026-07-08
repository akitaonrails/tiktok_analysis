package com.ss.android.ugc.aweme.model;

import X.C786410Ut5;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.model.ExploreToFullPageAnimationParam;
import com.ss.android.ugc.aweme.model.PhotoMatrixState;
import com.ss.android.ugc.aweme.model.PhotoModeIngressEtData;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModeDetailParams implements Parcelable {
    public static final Parcelable.Creator<PostModeDetailParams> CREATOR = new Parcelable.Creator<PostModeDetailParams>() { // from class: X.0SQi
        @Override // android.os.Parcelable.Creator
        public final PostModeDetailParams createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            PhotoModeIngressEtData photoModeIngressEtDataCreateFromParcel;
            boolean z3;
            boolean z4;
            Boolean boolValueOf;
            Long lValueOf;
            boolean z5;
            PostModeEntranceMechanism postModeEntranceMechanismCreateFromParcel;
            boolean z6;
            boolean z7;
            boolean z8;
            HashMap map;
            boolean z9;
            boolean z10;
            boolean z11;
            PhotoMatrixState photoMatrixStateCreateFromParcel;
            ExploreToFullPageAnimationParam exploreToFullPageAnimationParamCreateFromParcel;
            boolean z12;
            boolean z13;
            Long lValueOf2;
            Integer numValueOf;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            boolean z22;
            boolean z23;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            Rect rect = (Rect) parcel.readParcelable(PostModeDetailParams.class.getClassLoader());
            Rect rect2 = (Rect) parcel.readParcelable(PostModeDetailParams.class.getClassLoader());
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            String string5 = parcel.readString();
            int i5 = parcel.readInt();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                photoModeIngressEtDataCreateFromParcel = null;
            } else {
                photoModeIngressEtDataCreateFromParcel = PhotoModeIngressEtData.CREATOR.createFromParcel(parcel);
            }
            PhotoModeIngressEtData photoModeIngressEtData = photoModeIngressEtDataCreateFromParcel;
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf = Boolean.valueOf(z4);
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() == 0) {
                postModeEntranceMechanismCreateFromParcel = null;
            } else {
                postModeEntranceMechanismCreateFromParcel = PostModeEntranceMechanism.CREATOR.createFromParcel(parcel);
            }
            PostModeEntranceMechanism postModeEntranceMechanism = postModeEntranceMechanismCreateFromParcel;
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i6 = parcel.readInt();
                map = new HashMap(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    map.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Bundle bundle = parcel.readBundle(PostModeDetailParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                photoMatrixStateCreateFromParcel = null;
            } else {
                photoMatrixStateCreateFromParcel = PhotoMatrixState.CREATOR.createFromParcel(parcel);
            }
            PhotoMatrixState photoMatrixState = photoMatrixStateCreateFromParcel;
            if (parcel.readInt() == 0) {
                exploreToFullPageAnimationParamCreateFromParcel = null;
            } else {
                exploreToFullPageAnimationParamCreateFromParcel = ExploreToFullPageAnimationParam.CREATOR.createFromParcel(parcel);
            }
            ExploreToFullPageAnimationParam exploreToFullPageAnimationParam = exploreToFullPageAnimationParamCreateFromParcel;
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (parcel.readInt() != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            Bitmap bitmap = (Bitmap) parcel.readParcelable(PostModeDetailParams.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i10 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    String string17 = parcel.readString();
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap.put(string17, linkedHashMap2);
                }
            }
            String string18 = parcel.readString();
            if (parcel.readInt() != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            String string19 = parcel.readString();
            if (parcel.readInt() != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (parcel.readInt() != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            int i14 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (parcel.readInt() != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (parcel.readInt() != 0) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (parcel.readInt() != 0) {
                z20 = true;
            } else {
                z20 = false;
            }
            if (parcel.readInt() != 0) {
                z21 = true;
            } else {
                z21 = false;
            }
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            if (parcel.readInt() != 0) {
                z22 = true;
            } else {
                z22 = false;
            }
            if (parcel.readInt() != 0) {
                z23 = true;
            } else {
                z23 = false;
            }
            return new PostModeDetailParams(string, string2, string3, i, string4, i2, rect, rect2, i3, i4, string5, i5, string6, string7, z, z2, photoModeIngressEtData, z3, boolValueOf, lValueOf, z5, postModeEntranceMechanism, z6, z7, z8, map, z9, i8, i9, z10, z11, bundle, photoMatrixState, exploreToFullPageAnimationParam, string8, string9, string10, string11, string12, z12, z13, lValueOf2, string13, string14, numValueOf, string15, string16, bitmap, linkedHashMap, string18, z14, string19, z15, z16, i14, z17, z18, z19, z20, z21, string20, string21, z22, z23);
        }

        @Override // android.os.Parcelable.Creator
        public final PostModeDetailParams[] newArray(int i) {
            return new PostModeDetailParams[i];
        }
    };
    public Bundle animationBundle;
    public final boolean autoAdvancePausedTillManualResume;
    public String awemeId;
    public String btmPageId;
    public final String btmToken;
    public final int descWithoutHashTagMentionEmojiLength;
    public final int descriptionLineCounts;
    public final boolean disableSingleActivity;
    public HashMap<String, String> displayTitleParams;
    public final String displayedDescTexts;
    public final boolean enableAnimDegrade;
    public final boolean enableAnimSimple;
    public final boolean enableFloat;
    public boolean enableGestureExit;
    public final boolean enableScale;
    public boolean enableSingleClick;
    public String enterMethod;
    public String eventType;
    public final String exploreFromGroupId;
    public final Long exploreTabId;
    public final String exploreTabName;
    public ExploreToFullPageAnimationParam exploreToFullPageAnimationParam;
    public final Map<String, Map<String, String>> extraLogParams;
    public String feedParamFrom;
    public PhotoMatrixState feedPhotoMatrix;
    public final int feedPosition;
    public final String fromExplorePage;
    public final boolean fromViewPost;
    public final boolean hasNextFeed;
    public final boolean hasSufficientIncrementalInfo;
    public final boolean ignoreAudioFocus;
    public Rect imageContainerRect;
    public int imageHeight;
    public Rect imageRect;
    public final boolean isEnableAutoSlidePhoto;
    public final boolean isFromExploreDetail;
    public final boolean isHashTagTruncated;
    public final boolean isMusicContainerShown;
    public Boolean isMuted;
    public boolean isPlayerPaused;
    public final boolean isPreviewLightWeight;
    public final boolean isShowingBottomBar;
    public final Integer modelSource;
    public String noticeIdForComment;
    public String noticeTemplateIdForComment;
    public String noticeTypeForComment;
    public int pageType;
    public Long pauseTime;
    public PhotoModeIngressEtData photoModeIngressEtData;
    public String playSceneId;
    public String playerKey;
    public int position;
    public final PostModeEntranceMechanism postModeEntranceMechanism;
    public String previousPage;
    public final boolean quickShowDelayInitView;
    public final boolean quickShowHoldCover;
    public final String remainingText;
    public final String seeMoreUIType;
    public final String seeMoreUITypeV1;
    public final Bitmap tabBitmap;
    public String tabName;
    public boolean useSwipeEnterAnim;
    public int viewPagerHeight;
    public int viewPagerWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public PostModeDetailParams() {
        int i = -1;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostModeDetailParams)) {
            return false;
        }
        PostModeDetailParams postModeDetailParams = (PostModeDetailParams) obj;
        return Intrinsics.LJFF(this.eventType, postModeDetailParams.eventType) && Intrinsics.LJFF(this.tabName, postModeDetailParams.tabName) && Intrinsics.LJFF(this.awemeId, postModeDetailParams.awemeId) && this.position == postModeDetailParams.position && Intrinsics.LJFF(this.playerKey, postModeDetailParams.playerKey) && this.imageHeight == postModeDetailParams.imageHeight && Intrinsics.LJFF(this.imageRect, postModeDetailParams.imageRect) && Intrinsics.LJFF(this.imageContainerRect, postModeDetailParams.imageContainerRect) && this.viewPagerWidth == postModeDetailParams.viewPagerWidth && this.viewPagerHeight == postModeDetailParams.viewPagerHeight && Intrinsics.LJFF(this.previousPage, postModeDetailParams.previousPage) && this.pageType == postModeDetailParams.pageType && Intrinsics.LJFF(this.feedParamFrom, postModeDetailParams.feedParamFrom) && Intrinsics.LJFF(this.enterMethod, postModeDetailParams.enterMethod) && this.enableGestureExit == postModeDetailParams.enableGestureExit && this.isPlayerPaused == postModeDetailParams.isPlayerPaused && Intrinsics.LJFF(this.photoModeIngressEtData, postModeDetailParams.photoModeIngressEtData) && this.hasNextFeed == postModeDetailParams.hasNextFeed && Intrinsics.LJFF(this.isMuted, postModeDetailParams.isMuted) && Intrinsics.LJFF(this.pauseTime, postModeDetailParams.pauseTime) && this.enableSingleClick == postModeDetailParams.enableSingleClick && this.postModeEntranceMechanism == postModeDetailParams.postModeEntranceMechanism && this.useSwipeEnterAnim == postModeDetailParams.useSwipeEnterAnim && this.isEnableAutoSlidePhoto == postModeDetailParams.isEnableAutoSlidePhoto && this.autoAdvancePausedTillManualResume == postModeDetailParams.autoAdvancePausedTillManualResume && Intrinsics.LJFF(this.displayTitleParams, postModeDetailParams.displayTitleParams) && this.ignoreAudioFocus == postModeDetailParams.ignoreAudioFocus && this.feedPosition == postModeDetailParams.feedPosition && this.descriptionLineCounts == postModeDetailParams.descriptionLineCounts && this.isMusicContainerShown == postModeDetailParams.isMusicContainerShown && this.isShowingBottomBar == postModeDetailParams.isShowingBottomBar && Intrinsics.LJFF(this.animationBundle, postModeDetailParams.animationBundle) && Intrinsics.LJFF(this.feedPhotoMatrix, postModeDetailParams.feedPhotoMatrix) && Intrinsics.LJFF(this.exploreToFullPageAnimationParam, postModeDetailParams.exploreToFullPageAnimationParam) && Intrinsics.LJFF(this.noticeIdForComment, postModeDetailParams.noticeIdForComment) && Intrinsics.LJFF(this.noticeTypeForComment, postModeDetailParams.noticeTypeForComment) && Intrinsics.LJFF(this.noticeTemplateIdForComment, postModeDetailParams.noticeTemplateIdForComment) && Intrinsics.LJFF(this.exploreFromGroupId, postModeDetailParams.exploreFromGroupId) && Intrinsics.LJFF(this.playSceneId, postModeDetailParams.playSceneId) && this.disableSingleActivity == postModeDetailParams.disableSingleActivity && this.isPreviewLightWeight == postModeDetailParams.isPreviewLightWeight && Intrinsics.LJFF(this.exploreTabId, postModeDetailParams.exploreTabId) && Intrinsics.LJFF(this.exploreTabName, postModeDetailParams.exploreTabName) && Intrinsics.LJFF(this.fromExplorePage, postModeDetailParams.fromExplorePage) && Intrinsics.LJFF(this.modelSource, postModeDetailParams.modelSource) && Intrinsics.LJFF(this.seeMoreUITypeV1, postModeDetailParams.seeMoreUITypeV1) && Intrinsics.LJFF(this.seeMoreUIType, postModeDetailParams.seeMoreUIType) && Intrinsics.LJFF(this.tabBitmap, postModeDetailParams.tabBitmap) && Intrinsics.LJFF(this.extraLogParams, postModeDetailParams.extraLogParams) && Intrinsics.LJFF(this.displayedDescTexts, postModeDetailParams.displayedDescTexts) && this.hasSufficientIncrementalInfo == postModeDetailParams.hasSufficientIncrementalInfo && Intrinsics.LJFF(this.remainingText, postModeDetailParams.remainingText) && this.isHashTagTruncated == postModeDetailParams.isHashTagTruncated && this.isFromExploreDetail == postModeDetailParams.isFromExploreDetail && this.descWithoutHashTagMentionEmojiLength == postModeDetailParams.descWithoutHashTagMentionEmojiLength && this.enableScale == postModeDetailParams.enableScale && this.enableFloat == postModeDetailParams.enableFloat && this.enableAnimDegrade == postModeDetailParams.enableAnimDegrade && this.enableAnimSimple == postModeDetailParams.enableAnimSimple && this.fromViewPost == postModeDetailParams.fromViewPost && Intrinsics.LJFF(this.btmToken, postModeDetailParams.btmToken) && Intrinsics.LJFF(this.btmPageId, postModeDetailParams.btmPageId) && this.quickShowDelayInitView == postModeDetailParams.quickShowDelayInitView && this.quickShowHoldCover == postModeDetailParams.quickShowHoldCover;
    }

    public final int hashCode() {
        String str = this.eventType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tabName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.awemeId;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.position) * 31;
        String str4 = this.playerKey;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.imageHeight) * 31;
        Rect rect = this.imageRect;
        int iHashCode5 = (iHashCode4 + (rect == null ? 0 : rect.hashCode())) * 31;
        Rect rect2 = this.imageContainerRect;
        int iHashCode6 = (((((iHashCode5 + (rect2 == null ? 0 : rect2.hashCode())) * 31) + this.viewPagerWidth) * 31) + this.viewPagerHeight) * 31;
        String str5 = this.previousPage;
        int iHashCode7 = (((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.pageType) * 31;
        String str6 = this.feedParamFrom;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.enterMethod;
        int iHashCode9 = (((((iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31) + C786410Ut5.Z2(this.enableGestureExit)) * 31) + C786410Ut5.Z2(this.isPlayerPaused)) * 31;
        PhotoModeIngressEtData photoModeIngressEtData = this.photoModeIngressEtData;
        int iHashCode10 = (((iHashCode9 + (photoModeIngressEtData == null ? 0 : photoModeIngressEtData.hashCode())) * 31) + C786410Ut5.Z2(this.hasNextFeed)) * 31;
        Boolean bool = this.isMuted;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.pauseTime;
        int iHashCode12 = (((iHashCode11 + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Z2(this.enableSingleClick)) * 31;
        PostModeEntranceMechanism postModeEntranceMechanism = this.postModeEntranceMechanism;
        int iHashCode13 = (((((((iHashCode12 + (postModeEntranceMechanism == null ? 0 : postModeEntranceMechanism.hashCode())) * 31) + C786410Ut5.Z2(this.useSwipeEnterAnim)) * 31) + C786410Ut5.Z2(this.isEnableAutoSlidePhoto)) * 31) + C786410Ut5.Z2(this.autoAdvancePausedTillManualResume)) * 31;
        HashMap<String, String> map = this.displayTitleParams;
        int iHashCode14 = (((((((((((iHashCode13 + (map == null ? 0 : map.hashCode())) * 31) + C786410Ut5.Z2(this.ignoreAudioFocus)) * 31) + this.feedPosition) * 31) + this.descriptionLineCounts) * 31) + C786410Ut5.Z2(this.isMusicContainerShown)) * 31) + C786410Ut5.Z2(this.isShowingBottomBar)) * 31;
        Bundle bundle = this.animationBundle;
        int iHashCode15 = (iHashCode14 + (bundle == null ? 0 : bundle.hashCode())) * 31;
        PhotoMatrixState photoMatrixState = this.feedPhotoMatrix;
        int iHashCode16 = (iHashCode15 + (photoMatrixState == null ? 0 : photoMatrixState.hashCode())) * 31;
        ExploreToFullPageAnimationParam exploreToFullPageAnimationParam = this.exploreToFullPageAnimationParam;
        int iHashCode17 = (iHashCode16 + (exploreToFullPageAnimationParam == null ? 0 : exploreToFullPageAnimationParam.hashCode())) * 31;
        String str8 = this.noticeIdForComment;
        int iHashCode18 = (iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.noticeTypeForComment;
        int iHashCode19 = (iHashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.noticeTemplateIdForComment;
        int iHashCode20 = (iHashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.exploreFromGroupId;
        int iHashCode21 = (iHashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.playSceneId;
        int iHashCode22 = (((((iHashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31) + C786410Ut5.Z2(this.disableSingleActivity)) * 31) + C786410Ut5.Z2(this.isPreviewLightWeight)) * 31;
        Long l2 = this.exploreTabId;
        int iHashCode23 = (iHashCode22 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str13 = this.exploreTabName;
        int iHashCode24 = (iHashCode23 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.fromExplorePage;
        int iHashCode25 = (iHashCode24 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num = this.modelSource;
        int iHashCode26 = (((iHashCode25 + (num == null ? 0 : num.hashCode())) * 31) + this.seeMoreUITypeV1.hashCode()) * 31;
        String str15 = this.seeMoreUIType;
        int iHashCode27 = (iHashCode26 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Bitmap bitmap = this.tabBitmap;
        int iHashCode28 = (iHashCode27 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Map<String, Map<String, String>> map2 = this.extraLogParams;
        int iHashCode29 = (iHashCode28 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str16 = this.displayedDescTexts;
        int iHashCode30 = (((iHashCode29 + (str16 == null ? 0 : str16.hashCode())) * 31) + C786410Ut5.Z2(this.hasSufficientIncrementalInfo)) * 31;
        String str17 = this.remainingText;
        int iHashCode31 = (((((((((((((((((((iHashCode30 + (str17 == null ? 0 : str17.hashCode())) * 31) + C786410Ut5.Z2(this.isHashTagTruncated)) * 31) + C786410Ut5.Z2(this.isFromExploreDetail)) * 31) + this.descWithoutHashTagMentionEmojiLength) * 31) + C786410Ut5.Z2(this.enableScale)) * 31) + C786410Ut5.Z2(this.enableFloat)) * 31) + C786410Ut5.Z2(this.enableAnimDegrade)) * 31) + C786410Ut5.Z2(this.enableAnimSimple)) * 31) + C786410Ut5.Z2(this.fromViewPost)) * 31) + this.btmToken.hashCode()) * 31;
        String str18 = this.btmPageId;
        return ((((iHashCode31 + (str18 != null ? str18.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.quickShowDelayInitView)) * 31) + C786410Ut5.Z2(this.quickShowHoldCover);
    }

    public final String toString() {
        return "PostModeDetailParams(eventType=" + this.eventType + ", tabName=" + this.tabName + ", awemeId=" + this.awemeId + ", position=" + this.position + ", playerKey=" + this.playerKey + ", imageHeight=" + this.imageHeight + ", imageRect=" + this.imageRect + ", imageContainerRect=" + this.imageContainerRect + ", viewPagerWidth=" + this.viewPagerWidth + ", viewPagerHeight=" + this.viewPagerHeight + ", previousPage=" + this.previousPage + ", pageType=" + this.pageType + ", feedParamFrom=" + this.feedParamFrom + ", enterMethod=" + this.enterMethod + ", enableGestureExit=" + this.enableGestureExit + ", isPlayerPaused=" + this.isPlayerPaused + ", photoModeIngressEtData=" + this.photoModeIngressEtData + ", hasNextFeed=" + this.hasNextFeed + ", isMuted=" + this.isMuted + ", pauseTime=" + this.pauseTime + ", enableSingleClick=" + this.enableSingleClick + ", postModeEntranceMechanism=" + this.postModeEntranceMechanism + ", useSwipeEnterAnim=" + this.useSwipeEnterAnim + ", isEnableAutoSlidePhoto=" + this.isEnableAutoSlidePhoto + ", autoAdvancePausedTillManualResume=" + this.autoAdvancePausedTillManualResume + ", displayTitleParams=" + this.displayTitleParams + ", ignoreAudioFocus=" + this.ignoreAudioFocus + ", feedPosition=" + this.feedPosition + ", descriptionLineCounts=" + this.descriptionLineCounts + ", isMusicContainerShown=" + this.isMusicContainerShown + ", isShowingBottomBar=" + this.isShowingBottomBar + ", animationBundle=" + this.animationBundle + ", feedPhotoMatrix=" + this.feedPhotoMatrix + ", exploreToFullPageAnimationParam=" + this.exploreToFullPageAnimationParam + ", noticeIdForComment=" + this.noticeIdForComment + ", noticeTypeForComment=" + this.noticeTypeForComment + ", noticeTemplateIdForComment=" + this.noticeTemplateIdForComment + ", exploreFromGroupId=" + this.exploreFromGroupId + ", playSceneId=" + this.playSceneId + ", disableSingleActivity=" + this.disableSingleActivity + ", isPreviewLightWeight=" + this.isPreviewLightWeight + ", exploreTabId=" + this.exploreTabId + ", exploreTabName=" + this.exploreTabName + ", fromExplorePage=" + this.fromExplorePage + ", modelSource=" + this.modelSource + ", seeMoreUITypeV1=" + this.seeMoreUITypeV1 + ", seeMoreUIType=" + this.seeMoreUIType + ", tabBitmap=" + this.tabBitmap + ", extraLogParams=" + this.extraLogParams + ", displayedDescTexts=" + this.displayedDescTexts + ", hasSufficientIncrementalInfo=" + this.hasSufficientIncrementalInfo + ", remainingText=" + this.remainingText + ", isHashTagTruncated=" + this.isHashTagTruncated + ", isFromExploreDetail=" + this.isFromExploreDetail + ", descWithoutHashTagMentionEmojiLength=" + this.descWithoutHashTagMentionEmojiLength + ", enableScale=" + this.enableScale + ", enableFloat=" + this.enableFloat + ", enableAnimDegrade=" + this.enableAnimDegrade + ", enableAnimSimple=" + this.enableAnimSimple + ", fromViewPost=" + this.fromViewPost + ", btmToken=" + this.btmToken + ", btmPageId=" + this.btmPageId + ", quickShowDelayInitView=" + this.quickShowDelayInitView + ", quickShowHoldCover=" + this.quickShowHoldCover + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.eventType);
        parcel.writeString(this.tabName);
        parcel.writeString(this.awemeId);
        parcel.writeInt(this.position);
        parcel.writeString(this.playerKey);
        parcel.writeInt(this.imageHeight);
        parcel.writeParcelable(this.imageRect, i);
        parcel.writeParcelable(this.imageContainerRect, i);
        parcel.writeInt(this.viewPagerWidth);
        parcel.writeInt(this.viewPagerHeight);
        parcel.writeString(this.previousPage);
        parcel.writeInt(this.pageType);
        parcel.writeString(this.feedParamFrom);
        parcel.writeString(this.enterMethod);
        parcel.writeInt(this.enableGestureExit ? 1 : 0);
        parcel.writeInt(this.isPlayerPaused ? 1 : 0);
        PhotoModeIngressEtData photoModeIngressEtData = this.photoModeIngressEtData;
        if (photoModeIngressEtData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoModeIngressEtData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.hasNextFeed ? 1 : 0);
        Boolean bool = this.isMuted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l = this.pauseTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.enableSingleClick ? 1 : 0);
        PostModeEntranceMechanism postModeEntranceMechanism = this.postModeEntranceMechanism;
        if (postModeEntranceMechanism == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            postModeEntranceMechanism.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.useSwipeEnterAnim ? 1 : 0);
        parcel.writeInt(this.isEnableAutoSlidePhoto ? 1 : 0);
        parcel.writeInt(this.autoAdvancePausedTillManualResume ? 1 : 0);
        HashMap<String, String> map = this.displayTitleParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeInt(this.ignoreAudioFocus ? 1 : 0);
        parcel.writeInt(this.feedPosition);
        parcel.writeInt(this.descriptionLineCounts);
        parcel.writeInt(this.isMusicContainerShown ? 1 : 0);
        parcel.writeInt(this.isShowingBottomBar ? 1 : 0);
        parcel.writeBundle(this.animationBundle);
        PhotoMatrixState photoMatrixState = this.feedPhotoMatrix;
        if (photoMatrixState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoMatrixState.writeToParcel(parcel, i);
        }
        ExploreToFullPageAnimationParam exploreToFullPageAnimationParam = this.exploreToFullPageAnimationParam;
        if (exploreToFullPageAnimationParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreToFullPageAnimationParam.writeToParcel(parcel, i);
        }
        parcel.writeString(this.noticeIdForComment);
        parcel.writeString(this.noticeTypeForComment);
        parcel.writeString(this.noticeTemplateIdForComment);
        parcel.writeString(this.exploreFromGroupId);
        parcel.writeString(this.playSceneId);
        parcel.writeInt(this.disableSingleActivity ? 1 : 0);
        parcel.writeInt(this.isPreviewLightWeight ? 1 : 0);
        Long l2 = this.exploreTabId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.exploreTabName);
        parcel.writeString(this.fromExplorePage);
        Integer num = this.modelSource;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.seeMoreUITypeV1);
        parcel.writeString(this.seeMoreUIType);
        parcel.writeParcelable(this.tabBitmap, i);
        Map<String, Map<String, String>> map2 = this.extraLogParams;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, Map<String, String>> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                Map<String, String> value = entry2.getValue();
                parcel.writeInt(value.size());
                for (Map.Entry<String, String> entry3 : value.entrySet()) {
                    parcel.writeString(entry3.getKey());
                    parcel.writeString(entry3.getValue());
                }
            }
        }
        parcel.writeString(this.displayedDescTexts);
        parcel.writeInt(this.hasSufficientIncrementalInfo ? 1 : 0);
        parcel.writeString(this.remainingText);
        parcel.writeInt(this.isHashTagTruncated ? 1 : 0);
        parcel.writeInt(this.isFromExploreDetail ? 1 : 0);
        parcel.writeInt(this.descWithoutHashTagMentionEmojiLength);
        parcel.writeInt(this.enableScale ? 1 : 0);
        parcel.writeInt(this.enableFloat ? 1 : 0);
        parcel.writeInt(this.enableAnimDegrade ? 1 : 0);
        parcel.writeInt(this.enableAnimSimple ? 1 : 0);
        parcel.writeInt(this.fromViewPost ? 1 : 0);
        parcel.writeString(this.btmToken);
        parcel.writeString(this.btmPageId);
        parcel.writeInt(this.quickShowDelayInitView ? 1 : 0);
        parcel.writeInt(this.quickShowHoldCover ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PostModeDetailParams(String str, String str2, String str3, int i, int i2, Rect rect, Rect rect2, int i3, int i4, String str4, int i5, String str5, String str6, boolean z, PhotoModeIngressEtData photoModeIngressEtData, boolean z2, Boolean bool, Long l, PostModeEntranceMechanism postModeEntranceMechanism, boolean z3, boolean z4, boolean z5, HashMap map, boolean z6, int i6, int i7, boolean z7, boolean z8, Bundle bundle, PhotoMatrixState photoMatrixState, String str7, String str8, String str9, String str10, String str11, boolean z9, boolean z10, Long l2, String str12, String str13, Integer num, String str14, String str15, Bitmap bitmap, Map map2, boolean z11, int i8, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str16, boolean z17, boolean z18, int i9, int i10) {
        boolean z19;
        boolean z20;
        boolean z21 = z18;
        boolean z22 = z17;
        String str17 = str16;
        boolean z23 = z15;
        boolean z24 = z13;
        boolean z25 = z12;
        int i11 = i8;
        Bitmap bitmap2 = bitmap;
        Integer num2 = num;
        String str18 = str13;
        Long l3 = l2;
        boolean z26 = z9;
        String str19 = str7;
        Map map3 = map2;
        Bundle bundle2 = bundle;
        boolean z27 = z8;
        boolean z28 = z7;
        int i12 = i7;
        boolean z29 = z11;
        int i13 = i6;
        boolean z30 = z6;
        boolean z31 = z4;
        String str20 = str12;
        boolean z32 = z3;
        String str21 = str6;
        String str22 = str4;
        PostModeEntranceMechanism postModeEntranceMechanism2 = postModeEntranceMechanism;
        PhotoMatrixState photoMatrixState2 = photoMatrixState;
        PhotoModeIngressEtData photoModeIngressEtData2 = photoModeIngressEtData;
        boolean z33 = z;
        boolean z34 = z10;
        String str23 = str5;
        int i14 = i5;
        Rect rect3 = rect2;
        int i15 = i;
        Long l4 = l;
        int i16 = i4;
        boolean z35 = z16;
        String str24 = str11;
        int i17 = i3;
        String str25 = str9;
        Boolean bool2 = bool;
        boolean z36 = z14;
        String str26 = str10;
        Rect rect4 = rect;
        int i18 = i2;
        String str27 = str15;
        HashMap map4 = map;
        boolean z37 = z2;
        String str28 = str3;
        String str29 = str8;
        String str30 = str2;
        String str31 = str14;
        boolean z38 = z5;
        String str32 = (i9 & 1) != 0 ? null : str;
        str30 = (i9 & 2) != 0 ? null : str30;
        str28 = (i9 & 4) != 0 ? null : str28;
        i15 = (i9 & 8) != 0 ? 0 : i15;
        i18 = (i9 & 32) != 0 ? 0 : i18;
        rect4 = (i9 & 64) != 0 ? null : rect4;
        rect3 = (i9 & 128) != 0 ? null : rect3;
        i17 = (i9 & 256) != 0 ? 0 : i17;
        i16 = (i9 & 512) != 0 ? 0 : i16;
        str22 = (i9 & 1024) != 0 ? null : str22;
        i14 = (i9 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i14;
        str23 = (i9 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str23;
        str21 = (i9 & 8192) != 0 ? null : str21;
        if ((i9 & 16384) != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        z33 = (i9 & 32768) != 0 ? true : z33;
        photoModeIngressEtData2 = (i9 & 65536) != 0 ? null : photoModeIngressEtData2;
        z37 = (131072 & i9) != 0 ? false : z37;
        bool2 = (262144 & i9) != 0 ? null : bool2;
        l4 = (524288 & i9) != 0 ? null : l4;
        if ((i9 & 1048576) != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        this(str32, str30, str28, i15, null, i18, rect4, rect3, i17, i16, str22, i14, str23, str21, z19, z33, photoModeIngressEtData2, z37, bool2, l4, z20, (2097152 & i9) != 0 ? null : postModeEntranceMechanism2, (i9 & 4194304) != 0 ? false : z32, (i9 & 8388608) != 0 ? true : z31, (i9 & 16777216) != 0 ? false : z38, (i9 & 33554432) != 0 ? null : map4, (i9 & 67108864) != 0 ? false : z30, (i9 & 134217728) != 0 ? -1 : i13, (268435456 & i9) != 0 ? 0 : i12, (536870912 & i9) != 0 ? false : z28, (1073741824 & i9) != 0 ? false : z27, (i9 & Integer.MIN_VALUE) != 0 ? null : bundle2, (i10 & 1) != 0 ? null : photoMatrixState2, null, (i10 & 4) != 0 ? null : str19, (i10 & 8) != 0 ? null : str29, (i10 & 16) != 0 ? null : str25, (i10 & 32) != 0 ? null : str26, (i10 & 64) != 0 ? null : str24, (i10 & 128) != 0 ? false : z26, (i10 & 256) != 0 ? false : z34, (i10 & 512) != 0 ? null : l3, (i10 & 1024) != 0 ? null : str20, (i10 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str18, (i10 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num2, (i10 & 8192) != 0 ? "" : str31, (i10 & 16384) != 0 ? null : str27, (i10 & 32768) != 0 ? null : bitmap2, (i10 & 65536) != 0 ? null : map3, null, false, null, (i10 & 1048576) != 0 ? false : z29, false, (i10 & 4194304) != 0 ? 0 : i11, (i10 & 8388608) != 0 ? false : z25, (i10 & 16777216) != 0 ? false : z24, (i10 & 33554432) != 0 ? false : z36, (i10 & 67108864) != 0 ? false : z23, (i10 & 134217728) != 0 ? false : z35, (268435456 & i10) != 0 ? "" : str17, null, (1073741824 & i10) != 0 ? false : z22, (i10 & Integer.MIN_VALUE) != 0 ? false : z21);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PostModeDetailParams(String str, String str2, String str3, int i, String str4, int i2, Rect rect, Rect rect2, int i3, int i4, String str5, int i5, String str6, String str7, boolean z, boolean z2, PhotoModeIngressEtData photoModeIngressEtData, boolean z3, Boolean bool, Long l, boolean z4, PostModeEntranceMechanism postModeEntranceMechanism, boolean z5, boolean z6, boolean z7, HashMap<String, String> map, boolean z8, int i6, int i7, boolean z9, boolean z10, Bundle bundle, PhotoMatrixState photoMatrixState, ExploreToFullPageAnimationParam exploreToFullPageAnimationParam, String str8, String str9, String str10, String str11, String str12, boolean z11, boolean z12, Long l2, String str13, String str14, Integer num, String str15, String str16, Bitmap bitmap, Map<String, ? extends Map<String, String>> map2, String str17, boolean z13, String str18, boolean z14, boolean z15, int i8, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, String str19, String str20, boolean z21, boolean z22) {
        this.eventType = str;
        this.tabName = str2;
        this.awemeId = str3;
        this.position = i;
        this.playerKey = str4;
        this.imageHeight = i2;
        this.imageRect = rect;
        this.imageContainerRect = rect2;
        this.viewPagerWidth = i3;
        this.viewPagerHeight = i4;
        this.previousPage = str5;
        this.pageType = i5;
        this.feedParamFrom = str6;
        this.enterMethod = str7;
        this.enableGestureExit = z;
        this.isPlayerPaused = z2;
        this.photoModeIngressEtData = photoModeIngressEtData;
        this.hasNextFeed = z3;
        this.isMuted = bool;
        this.pauseTime = l;
        this.enableSingleClick = z4;
        this.postModeEntranceMechanism = postModeEntranceMechanism;
        this.useSwipeEnterAnim = z5;
        this.isEnableAutoSlidePhoto = z6;
        this.autoAdvancePausedTillManualResume = z7;
        this.displayTitleParams = map;
        this.ignoreAudioFocus = z8;
        this.feedPosition = i6;
        this.descriptionLineCounts = i7;
        this.isMusicContainerShown = z9;
        this.isShowingBottomBar = z10;
        this.animationBundle = bundle;
        this.feedPhotoMatrix = photoMatrixState;
        this.exploreToFullPageAnimationParam = exploreToFullPageAnimationParam;
        this.noticeIdForComment = str8;
        this.noticeTypeForComment = str9;
        this.noticeTemplateIdForComment = str10;
        this.exploreFromGroupId = str11;
        this.playSceneId = str12;
        this.disableSingleActivity = z11;
        this.isPreviewLightWeight = z12;
        this.exploreTabId = l2;
        this.exploreTabName = str13;
        this.fromExplorePage = str14;
        this.modelSource = num;
        this.seeMoreUITypeV1 = str15;
        this.seeMoreUIType = str16;
        this.tabBitmap = bitmap;
        this.extraLogParams = map2;
        this.displayedDescTexts = str17;
        this.hasSufficientIncrementalInfo = z13;
        this.remainingText = str18;
        this.isHashTagTruncated = z14;
        this.isFromExploreDetail = z15;
        this.descWithoutHashTagMentionEmojiLength = i8;
        this.enableScale = z16;
        this.enableFloat = z17;
        this.enableAnimDegrade = z18;
        this.enableAnimSimple = z19;
        this.fromViewPost = z20;
        this.btmToken = str19;
        this.btmPageId = str20;
        this.quickShowDelayInitView = z21;
        this.quickShowHoldCover = z22;
    }
}
