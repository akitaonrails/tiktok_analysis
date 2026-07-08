package com.ss.android.ugc.aweme.feed.param;

import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class DetailNavArgModel implements Serializable, IRouteArg {
    public static final Parcelable.Creator<DetailNavArgModel> CREATOR = new Parcelable.Creator<DetailNavArgModel>() { // from class: X.0J3V
        @Override // android.os.Parcelable.Creator
        public final DetailNavArgModel createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Float fValueOf;
            boolean z2;
            Boolean boolValueOf2;
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            boolean z3;
            Boolean boolValueOf3;
            boolean z4;
            Boolean boolValueOf4;
            boolean z5;
            Boolean boolValueOf5;
            boolean z6;
            Boolean boolValueOf6;
            Float fValueOf2;
            Integer numValueOf4;
            Integer numValueOf5;
            Float fValueOf3;
            Float fValueOf4;
            boolean z7;
            boolean z8;
            boolean z9;
            Boolean boolValueOf7;
            boolean z10;
            Boolean boolValueOf8;
            boolean z11;
            Boolean boolValueOf9;
            Long lValueOf;
            Integer numValueOf6;
            Integer numValueOf7;
            Integer numValueOf8;
            Integer numValueOf9;
            Integer numValueOf10;
            Long lValueOf2;
            Long lValueOf3;
            Long lValueOf4;
            boolean z12;
            Boolean boolValueOf10;
            Integer numValueOf11;
            boolean z13;
            Boolean boolValueOf11;
            boolean z14;
            Boolean boolValueOf12;
            Integer numValueOf12;
            Integer numValueOf13;
            Long lValueOf5;
            boolean z15;
            Boolean boolValueOf13;
            boolean z16;
            Boolean boolValueOf14;
            boolean z17;
            Boolean boolValueOf15;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            boolean z18 = true;
            Boolean boolValueOf16 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf4 = Boolean.valueOf(z4);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolValueOf5 = Boolean.valueOf(z5);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolValueOf6 = Boolean.valueOf(z6);
            }
            if (parcel.readInt() == 0) {
                fValueOf2 = null;
            } else {
                fValueOf2 = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf5 = null;
            } else {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                fValueOf3 = null;
            } else {
                fValueOf3 = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                fValueOf4 = null;
            } else {
                fValueOf4 = Float.valueOf(parcel.readFloat());
            }
            String string19 = parcel.readString();
            String string20 = parcel.readString();
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
                boolValueOf7 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolValueOf7 = Boolean.valueOf(z9);
            }
            String string21 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf8 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolValueOf8 = Boolean.valueOf(z10);
            }
            if (parcel.readInt() == 0) {
                boolValueOf9 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolValueOf9 = Boolean.valueOf(z11);
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf6 = null;
            } else {
                numValueOf6 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf7 = null;
            } else {
                numValueOf7 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf8 = null;
            } else {
                numValueOf8 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf9 = null;
            } else {
                numValueOf9 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf10 = null;
            } else {
                numValueOf10 = Integer.valueOf(parcel.readInt());
            }
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf3 = null;
            } else {
                lValueOf3 = Long.valueOf(parcel.readLong());
            }
            String string27 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf4 = null;
            } else {
                lValueOf4 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                boolValueOf10 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolValueOf10 = Boolean.valueOf(z12);
            }
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf11 = null;
            } else {
                numValueOf11 = Integer.valueOf(parcel.readInt());
            }
            Serializable serializable = parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf11 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolValueOf11 = Boolean.valueOf(z13);
            }
            if (parcel.readInt() == 0) {
                boolValueOf12 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolValueOf12 = Boolean.valueOf(z14);
            }
            if (parcel.readInt() == 0) {
                numValueOf12 = null;
            } else {
                numValueOf12 = Integer.valueOf(parcel.readInt());
            }
            int i = parcel.readInt();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            String string37 = parcel.readString();
            String string38 = parcel.readString();
            String string39 = parcel.readString();
            String string40 = parcel.readString();
            String string41 = parcel.readString();
            String string42 = parcel.readString();
            String string43 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf13 = null;
            } else {
                numValueOf13 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                lValueOf5 = null;
            } else {
                lValueOf5 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                boolValueOf13 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolValueOf13 = Boolean.valueOf(z15);
            }
            String string44 = parcel.readString();
            String string45 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf14 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolValueOf14 = Boolean.valueOf(z16);
            }
            Serializable serializable2 = parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf15 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolValueOf15 = Boolean.valueOf(z17);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z18 = false;
                }
                boolValueOf16 = Boolean.valueOf(z18);
            }
            return new DetailNavArgModel(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, boolValueOf, string11, string12, fValueOf, string13, boolValueOf2, numValueOf, string14, string15, string16, numValueOf2, numValueOf3, boolValueOf3, string17, string18, boolValueOf4, boolValueOf5, boolValueOf6, fValueOf2, numValueOf4, numValueOf5, fValueOf3, fValueOf4, string19, string20, z7, z8, boolValueOf7, string21, boolValueOf8, boolValueOf9, lValueOf, string22, string23, numValueOf6, numValueOf7, numValueOf8, numValueOf9, numValueOf10, string24, string25, string26, lValueOf2, lValueOf3, string27, lValueOf4, boolValueOf10, string28, string29, string30, string31, numValueOf11, serializable, boolValueOf11, boolValueOf12, numValueOf12, i, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, numValueOf13, lValueOf5, boolValueOf13, string44, string45, boolValueOf14, serializable2, boolValueOf15, boolValueOf16, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DetailNavArgModel[] newArray(int i) {
            return new DetailNavArgModel[i];
        }
    };
    public String aigcOverlabelNotice;
    public Integer chatType;
    public String chatTypeStr;
    public String cmtToPostSourceGroupId;
    public String cmtToPostSourceLinkPosition;
    public String collectionType;
    public String debugParam;
    public Integer descWithoutHashTagMentionEmojiLength;
    public Integer displayedDescWithoutHashTagMentionEmojiLength;
    public Integer displayedDescriptionLength;
    public Integer displayedTitleLength;
    public String dynamicDetailTitleText;
    public Boolean enterFollowingInnerContainer;
    public String enterPosition;
    public Long exploreTabID;
    public String exploreTabName;
    public Long feedDetailClickTime;
    public Long feedDetailInterceptTime;
    public Long feedDetailVideoCurrentPosition;
    public String flowChangeToastText;
    public Serializable followRecommendNavExtra;
    public Integer followSkylightIndex;
    public Boolean followSkylightNeedAnim;
    public Integer followSkylightTotalCount;
    public Boolean forcePopupOfflineModeSheet;
    public String friendsV3DetailType;
    public String fromExplorePage;
    public Boolean fromStoryToPost;
    public String groupType;
    public String highlightRepostReplyIds;
    public Float imageHeight;
    public Float imageWidth;
    public String innerPushTrackExtra;
    public String insertRepostReplyIds;
    public String insertRepostUid;
    public Boolean isCoverOverlayTransition;
    public Boolean isFromAIRemixChain;
    public int isFromPush;
    public Boolean isFromTrendingHashtag;
    public Boolean isFromViewPostEntry;
    public String isMusicChart;
    public Boolean isProfileTabSearch;
    public Boolean isShareUnavailableHighlight;
    public Boolean isShowSearchCollectionBottomBar;
    public Boolean isStoryDetailForSaf;
    public Boolean isThumbnailScaleUp;
    public String jsbVideoDetailKey;
    public String loadEmptyText;
    public Serializable message;
    public String noticeTemplateIdForComment;
    public String offlineModeSheetStyle;
    public String openRepostInput;
    public Float phoneCornerRadius;
    public String pollId;
    public String profileTabSearchId;
    public String pushId;
    public String pushType;
    public Integer safAnimDelayMode;
    public Long safAnimDelayTimeoutMs;
    public boolean seamlessToDetail;
    public boolean searchCustomCover;
    public Integer searchInitPosition;
    public Float searchSeekProgress;
    public String searchSource;
    public String searchTabShowCount;
    public String searchTabShowName;
    public String shareToStoryAidOfStory;
    public Boolean showRepostGuideTooltip;
    public String socialEntrance;
    public String startViewId;
    public Boolean storyIsFromGroupChatSingleAvatar;
    public Integer storyMusicEntrancePageCode;
    public String takoChatId;
    public String takoIndex;
    public String takoInnerfeedEntranceGroupId;
    public String takoInnerfeedEntranceRank;
    public String takoItemUniqueId;
    public String takoScreenType;
    public String takoSessionId;
    public String takoSessionSource;
    public String takoStyle;
    public Boolean takoVideoFromInner;
    public String takoVideoSessionId;
    public String takoWordsPos;
    public Integer titleLength;
    public String ttlsLiveExtra;
    public String vibeExtraParam;
    public Integer xCoordinateExplorePage;
    public Integer yCoordinateExplorePage;

    public DetailNavArgModel() {
        this("", null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, "", null, null, "", "", "", 0, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Float.valueOf(0.0f), 0, 0, Float.valueOf(0.0f), Float.valueOf(0.0f), null, null, false, false, Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, Boolean.FALSE, null, 0, null, null, "", null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, null);
    }

    public final DetailNavArgModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, Float f, String str13, Boolean bool2, Integer num, String str14, String str15, String str16, Integer num2, Integer num3, Boolean bool3, String str17, String str18, Boolean bool4, Boolean bool5, Boolean bool6, Float f2, Integer num4, Integer num5, Float f3, Float f4, String str19, String str20, boolean z, boolean z2, Boolean bool7, String str21, Boolean bool8, Boolean bool9, Long l, String str22, String str23, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str24, String str25, String str26, Long l2, Long l3, String str27, Long l4, Boolean bool10, String str28, String str29, String str30, String str31, Integer num11, Serializable serializable, Boolean bool11, Boolean bool12, Integer num12, int i, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, Integer num13, Long l5, Boolean bool13, String str44, String str45, Boolean bool14, Serializable serializable2, Boolean bool15, Boolean bool16, String str46) {
        return new DetailNavArgModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, bool, str11, str12, f, str13, bool2, num, str14, str15, str16, num2, num3, bool3, str17, str18, bool4, bool5, bool6, f2, num4, num5, f3, f4, str19, str20, z, z2, bool7, str21, bool8, bool9, l, str22, str23, num6, num7, num8, num9, num10, str24, str25, str26, l2, l3, str27, l4, bool10, str28, str29, str30, str31, num11, serializable, bool11, bool12, num12, i, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, num13, l5, bool13, str44, str45, bool14, serializable2, bool15, bool16, str46);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailNavArgModel)) {
            return false;
        }
        DetailNavArgModel detailNavArgModel = (DetailNavArgModel) obj;
        return Intrinsics.LJFF(this.debugParam, detailNavArgModel.debugParam) && Intrinsics.LJFF(this.takoInnerfeedEntranceGroupId, detailNavArgModel.takoInnerfeedEntranceGroupId) && Intrinsics.LJFF(this.takoInnerfeedEntranceRank, detailNavArgModel.takoInnerfeedEntranceRank) && Intrinsics.LJFF(this.takoIndex, detailNavArgModel.takoIndex) && Intrinsics.LJFF(this.takoStyle, detailNavArgModel.takoStyle) && Intrinsics.LJFF(this.takoWordsPos, detailNavArgModel.takoWordsPos) && Intrinsics.LJFF(this.takoItemUniqueId, detailNavArgModel.takoItemUniqueId) && Intrinsics.LJFF(this.takoChatId, detailNavArgModel.takoChatId) && Intrinsics.LJFF(this.takoSessionId, detailNavArgModel.takoSessionId) && Intrinsics.LJFF(this.takoVideoSessionId, detailNavArgModel.takoVideoSessionId) && Intrinsics.LJFF(this.takoVideoFromInner, detailNavArgModel.takoVideoFromInner) && Intrinsics.LJFF(this.takoScreenType, detailNavArgModel.takoScreenType) && Intrinsics.LJFF(this.takoSessionSource, detailNavArgModel.takoSessionSource) && Intrinsics.LJFF(this.searchSeekProgress, detailNavArgModel.searchSeekProgress) && Intrinsics.LJFF(this.loadEmptyText, detailNavArgModel.loadEmptyText) && Intrinsics.LJFF(this.isShowSearchCollectionBottomBar, detailNavArgModel.isShowSearchCollectionBottomBar) && Intrinsics.LJFF(this.searchInitPosition, detailNavArgModel.searchInitPosition) && Intrinsics.LJFF(this.searchTabShowName, detailNavArgModel.searchTabShowName) && Intrinsics.LJFF(this.searchTabShowCount, detailNavArgModel.searchTabShowCount) && Intrinsics.LJFF(this.vibeExtraParam, detailNavArgModel.vibeExtraParam) && Intrinsics.LJFF(this.followSkylightIndex, detailNavArgModel.followSkylightIndex) && Intrinsics.LJFF(this.followSkylightTotalCount, detailNavArgModel.followSkylightTotalCount) && Intrinsics.LJFF(this.followSkylightNeedAnim, detailNavArgModel.followSkylightNeedAnim) && Intrinsics.LJFF(this.enterPosition, detailNavArgModel.enterPosition) && Intrinsics.LJFF(this.collectionType, detailNavArgModel.collectionType) && Intrinsics.LJFF(this.fromStoryToPost, detailNavArgModel.fromStoryToPost) && Intrinsics.LJFF(this.isThumbnailScaleUp, detailNavArgModel.isThumbnailScaleUp) && Intrinsics.LJFF(this.isCoverOverlayTransition, detailNavArgModel.isCoverOverlayTransition) && Intrinsics.LJFF(this.phoneCornerRadius, detailNavArgModel.phoneCornerRadius) && Intrinsics.LJFF(this.yCoordinateExplorePage, detailNavArgModel.yCoordinateExplorePage) && Intrinsics.LJFF(this.xCoordinateExplorePage, detailNavArgModel.xCoordinateExplorePage) && Intrinsics.LJFF(this.imageHeight, detailNavArgModel.imageHeight) && Intrinsics.LJFF(this.imageWidth, detailNavArgModel.imageWidth) && Intrinsics.LJFF(this.isMusicChart, detailNavArgModel.isMusicChart) && Intrinsics.LJFF(this.searchSource, detailNavArgModel.searchSource) && this.seamlessToDetail == detailNavArgModel.seamlessToDetail && this.searchCustomCover == detailNavArgModel.searchCustomCover && Intrinsics.LJFF(this.isProfileTabSearch, detailNavArgModel.isProfileTabSearch) && Intrinsics.LJFF(this.profileTabSearchId, detailNavArgModel.profileTabSearchId) && Intrinsics.LJFF(this.storyIsFromGroupChatSingleAvatar, detailNavArgModel.storyIsFromGroupChatSingleAvatar) && Intrinsics.LJFF(this.enterFollowingInnerContainer, detailNavArgModel.enterFollowingInnerContainer) && Intrinsics.LJFF(this.exploreTabID, detailNavArgModel.exploreTabID) && Intrinsics.LJFF(this.exploreTabName, detailNavArgModel.exploreTabName) && Intrinsics.LJFF(this.fromExplorePage, detailNavArgModel.fromExplorePage) && Intrinsics.LJFF(this.titleLength, detailNavArgModel.titleLength) && Intrinsics.LJFF(this.displayedTitleLength, detailNavArgModel.displayedTitleLength) && Intrinsics.LJFF(this.displayedDescriptionLength, detailNavArgModel.displayedDescriptionLength) && Intrinsics.LJFF(this.displayedDescWithoutHashTagMentionEmojiLength, detailNavArgModel.displayedDescWithoutHashTagMentionEmojiLength) && Intrinsics.LJFF(this.descWithoutHashTagMentionEmojiLength, detailNavArgModel.descWithoutHashTagMentionEmojiLength) && Intrinsics.LJFF(this.cmtToPostSourceGroupId, detailNavArgModel.cmtToPostSourceGroupId) && Intrinsics.LJFF(this.cmtToPostSourceLinkPosition, detailNavArgModel.cmtToPostSourceLinkPosition) && Intrinsics.LJFF(this.friendsV3DetailType, detailNavArgModel.friendsV3DetailType) && Intrinsics.LJFF(this.feedDetailClickTime, detailNavArgModel.feedDetailClickTime) && Intrinsics.LJFF(this.feedDetailInterceptTime, detailNavArgModel.feedDetailInterceptTime) && Intrinsics.LJFF(this.jsbVideoDetailKey, detailNavArgModel.jsbVideoDetailKey) && Intrinsics.LJFF(this.feedDetailVideoCurrentPosition, detailNavArgModel.feedDetailVideoCurrentPosition) && Intrinsics.LJFF(this.forcePopupOfflineModeSheet, detailNavArgModel.forcePopupOfflineModeSheet) && Intrinsics.LJFF(this.offlineModeSheetStyle, detailNavArgModel.offlineModeSheetStyle) && Intrinsics.LJFF(this.startViewId, detailNavArgModel.startViewId) && Intrinsics.LJFF(this.groupType, detailNavArgModel.groupType) && Intrinsics.LJFF(this.chatTypeStr, detailNavArgModel.chatTypeStr) && Intrinsics.LJFF(this.chatType, detailNavArgModel.chatType) && Intrinsics.LJFF(this.message, detailNavArgModel.message) && Intrinsics.LJFF(this.isFromTrendingHashtag, detailNavArgModel.isFromTrendingHashtag) && Intrinsics.LJFF(this.isStoryDetailForSaf, detailNavArgModel.isStoryDetailForSaf) && Intrinsics.LJFF(this.storyMusicEntrancePageCode, detailNavArgModel.storyMusicEntrancePageCode) && this.isFromPush == detailNavArgModel.isFromPush && Intrinsics.LJFF(this.pushType, detailNavArgModel.pushType) && Intrinsics.LJFF(this.pushId, detailNavArgModel.pushId) && Intrinsics.LJFF(this.shareToStoryAidOfStory, detailNavArgModel.shareToStoryAidOfStory) && Intrinsics.LJFF(this.highlightRepostReplyIds, detailNavArgModel.highlightRepostReplyIds) && Intrinsics.LJFF(this.insertRepostUid, detailNavArgModel.insertRepostUid) && Intrinsics.LJFF(this.innerPushTrackExtra, detailNavArgModel.innerPushTrackExtra) && Intrinsics.LJFF(this.insertRepostReplyIds, detailNavArgModel.insertRepostReplyIds) && Intrinsics.LJFF(this.openRepostInput, detailNavArgModel.openRepostInput) && Intrinsics.LJFF(this.ttlsLiveExtra, detailNavArgModel.ttlsLiveExtra) && Intrinsics.LJFF(this.dynamicDetailTitleText, detailNavArgModel.dynamicDetailTitleText) && Intrinsics.LJFF(this.flowChangeToastText, detailNavArgModel.flowChangeToastText) && Intrinsics.LJFF(this.socialEntrance, detailNavArgModel.socialEntrance) && Intrinsics.LJFF(this.safAnimDelayMode, detailNavArgModel.safAnimDelayMode) && Intrinsics.LJFF(this.safAnimDelayTimeoutMs, detailNavArgModel.safAnimDelayTimeoutMs) && Intrinsics.LJFF(this.showRepostGuideTooltip, detailNavArgModel.showRepostGuideTooltip) && Intrinsics.LJFF(this.pollId, detailNavArgModel.pollId) && Intrinsics.LJFF(this.noticeTemplateIdForComment, detailNavArgModel.noticeTemplateIdForComment) && Intrinsics.LJFF(this.isShareUnavailableHighlight, detailNavArgModel.isShareUnavailableHighlight) && Intrinsics.LJFF(this.followRecommendNavExtra, detailNavArgModel.followRecommendNavExtra) && Intrinsics.LJFF(this.isFromViewPostEntry, detailNavArgModel.isFromViewPostEntry) && Intrinsics.LJFF(this.isFromAIRemixChain, detailNavArgModel.isFromAIRemixChain) && Intrinsics.LJFF(this.aigcOverlabelNotice, detailNavArgModel.aigcOverlabelNotice);
    }

    public int hashCode() {
        String str = this.debugParam;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.takoInnerfeedEntranceGroupId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.takoInnerfeedEntranceRank;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.takoIndex;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.takoStyle;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.takoWordsPos;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.takoItemUniqueId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.takoChatId;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.takoSessionId;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.takoVideoSessionId;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.takoVideoFromInner;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.takoScreenType;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.takoSessionSource;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Float f = this.searchSeekProgress;
        int iHashCode14 = (iHashCode13 + (f == null ? 0 : f.hashCode())) * 31;
        String str13 = this.loadEmptyText;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool2 = this.isShowSearchCollectionBottomBar;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.searchInitPosition;
        int iHashCode17 = (iHashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        String str14 = this.searchTabShowName;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.searchTabShowCount;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.vibeExtraParam;
        int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Integer num2 = this.followSkylightIndex;
        int iHashCode21 = (iHashCode20 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.followSkylightTotalCount;
        int iHashCode22 = (iHashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool3 = this.followSkylightNeedAnim;
        int iHashCode23 = (iHashCode22 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str17 = this.enterPosition;
        int iHashCode24 = (iHashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.collectionType;
        int iHashCode25 = (iHashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool4 = this.fromStoryToPost;
        int iHashCode26 = (iHashCode25 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isThumbnailScaleUp;
        int iHashCode27 = (iHashCode26 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isCoverOverlayTransition;
        int iHashCode28 = (iHashCode27 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Float f2 = this.phoneCornerRadius;
        int iHashCode29 = (iHashCode28 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num4 = this.yCoordinateExplorePage;
        int iHashCode30 = (iHashCode29 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.xCoordinateExplorePage;
        int iHashCode31 = (iHashCode30 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Float f3 = this.imageHeight;
        int iHashCode32 = (iHashCode31 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.imageWidth;
        int iHashCode33 = (iHashCode32 + (f4 == null ? 0 : f4.hashCode())) * 31;
        String str19 = this.isMusicChart;
        int iHashCode34 = (iHashCode33 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.searchSource;
        int iHashCode35 = (((((iHashCode34 + (str20 == null ? 0 : str20.hashCode())) * 31) + C786410Ut5.Z2(this.seamlessToDetail)) * 31) + C786410Ut5.Z2(this.searchCustomCover)) * 31;
        Boolean bool7 = this.isProfileTabSearch;
        int iHashCode36 = (iHashCode35 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str21 = this.profileTabSearchId;
        int iHashCode37 = (iHashCode36 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Boolean bool8 = this.storyIsFromGroupChatSingleAvatar;
        int iHashCode38 = (iHashCode37 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.enterFollowingInnerContainer;
        int iHashCode39 = (iHashCode38 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Long l = this.exploreTabID;
        int iHashCode40 = (iHashCode39 + (l == null ? 0 : l.hashCode())) * 31;
        String str22 = this.exploreTabName;
        int iHashCode41 = (iHashCode40 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.fromExplorePage;
        int iHashCode42 = (iHashCode41 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Integer num6 = this.titleLength;
        int iHashCode43 = (iHashCode42 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.displayedTitleLength;
        int iHashCode44 = (iHashCode43 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.displayedDescriptionLength;
        int iHashCode45 = (iHashCode44 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.displayedDescWithoutHashTagMentionEmojiLength;
        int iHashCode46 = (iHashCode45 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.descWithoutHashTagMentionEmojiLength;
        int iHashCode47 = (iHashCode46 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str24 = this.cmtToPostSourceGroupId;
        int iHashCode48 = (iHashCode47 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.cmtToPostSourceLinkPosition;
        int iHashCode49 = (iHashCode48 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.friendsV3DetailType;
        int iHashCode50 = (iHashCode49 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Long l2 = this.feedDetailClickTime;
        int iHashCode51 = (iHashCode50 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.feedDetailInterceptTime;
        int iHashCode52 = (iHashCode51 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str27 = this.jsbVideoDetailKey;
        int iHashCode53 = (iHashCode52 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Long l4 = this.feedDetailVideoCurrentPosition;
        int iHashCode54 = (iHashCode53 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool10 = this.forcePopupOfflineModeSheet;
        int iHashCode55 = (iHashCode54 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        String str28 = this.offlineModeSheetStyle;
        int iHashCode56 = (iHashCode55 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.startViewId;
        int iHashCode57 = (iHashCode56 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.groupType;
        int iHashCode58 = (iHashCode57 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.chatTypeStr;
        int iHashCode59 = (iHashCode58 + (str31 == null ? 0 : str31.hashCode())) * 31;
        Integer num11 = this.chatType;
        int iHashCode60 = (iHashCode59 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Serializable serializable = this.message;
        int iHashCode61 = (iHashCode60 + (serializable == null ? 0 : serializable.hashCode())) * 31;
        Boolean bool11 = this.isFromTrendingHashtag;
        int iHashCode62 = (iHashCode61 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.isStoryDetailForSaf;
        int iHashCode63 = (iHashCode62 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Integer num12 = this.storyMusicEntrancePageCode;
        int iHashCode64 = (((iHashCode63 + (num12 == null ? 0 : num12.hashCode())) * 31) + this.isFromPush) * 31;
        String str32 = this.pushType;
        int iHashCode65 = (iHashCode64 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.pushId;
        int iHashCode66 = (((iHashCode65 + (str33 == null ? 0 : str33.hashCode())) * 31) + this.shareToStoryAidOfStory.hashCode()) * 31;
        String str34 = this.highlightRepostReplyIds;
        int iHashCode67 = (iHashCode66 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.insertRepostUid;
        int iHashCode68 = (iHashCode67 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.innerPushTrackExtra;
        int iHashCode69 = (iHashCode68 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.insertRepostReplyIds;
        int iHashCode70 = (iHashCode69 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.openRepostInput;
        int iHashCode71 = (iHashCode70 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.ttlsLiveExtra;
        int iHashCode72 = (iHashCode71 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.dynamicDetailTitleText;
        int iHashCode73 = (iHashCode72 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.flowChangeToastText;
        int iHashCode74 = (iHashCode73 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.socialEntrance;
        int iHashCode75 = (iHashCode74 + (str42 == null ? 0 : str42.hashCode())) * 31;
        Integer num13 = this.safAnimDelayMode;
        int iHashCode76 = (iHashCode75 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Long l5 = this.safAnimDelayTimeoutMs;
        int iHashCode77 = (iHashCode76 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Boolean bool13 = this.showRepostGuideTooltip;
        int iHashCode78 = (iHashCode77 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        String str43 = this.pollId;
        int iHashCode79 = (iHashCode78 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.noticeTemplateIdForComment;
        int iHashCode80 = (iHashCode79 + (str44 == null ? 0 : str44.hashCode())) * 31;
        Boolean bool14 = this.isShareUnavailableHighlight;
        int iHashCode81 = (iHashCode80 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Serializable serializable2 = this.followRecommendNavExtra;
        int iHashCode82 = (iHashCode81 + (serializable2 == null ? 0 : serializable2.hashCode())) * 31;
        Boolean bool15 = this.isFromViewPostEntry;
        int iHashCode83 = (iHashCode82 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.isFromAIRemixChain;
        int iHashCode84 = (iHashCode83 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        String str45 = this.aigcOverlabelNotice;
        return iHashCode84 + (str45 != null ? str45.hashCode() : 0);
    }

    public String toString() {
        return "DetailNavArgModel(debugParam=" + this.debugParam + ", takoInnerfeedEntranceGroupId=" + this.takoInnerfeedEntranceGroupId + ", takoInnerfeedEntranceRank=" + this.takoInnerfeedEntranceRank + ", takoIndex=" + this.takoIndex + ", takoStyle=" + this.takoStyle + ", takoWordsPos=" + this.takoWordsPos + ", takoItemUniqueId=" + this.takoItemUniqueId + ", takoChatId=" + this.takoChatId + ", takoSessionId=" + this.takoSessionId + ", takoVideoSessionId=" + this.takoVideoSessionId + ", takoVideoFromInner=" + this.takoVideoFromInner + ", takoScreenType=" + this.takoScreenType + ", takoSessionSource=" + this.takoSessionSource + ", searchSeekProgress=" + this.searchSeekProgress + ", loadEmptyText=" + this.loadEmptyText + ", isShowSearchCollectionBottomBar=" + this.isShowSearchCollectionBottomBar + ", searchInitPosition=" + this.searchInitPosition + ", searchTabShowName=" + this.searchTabShowName + ", searchTabShowCount=" + this.searchTabShowCount + ", vibeExtraParam=" + this.vibeExtraParam + ", followSkylightIndex=" + this.followSkylightIndex + ", followSkylightTotalCount=" + this.followSkylightTotalCount + ", followSkylightNeedAnim=" + this.followSkylightNeedAnim + ", enterPosition=" + this.enterPosition + ", collectionType=" + this.collectionType + ", fromStoryToPost=" + this.fromStoryToPost + ", isThumbnailScaleUp=" + this.isThumbnailScaleUp + ", isCoverOverlayTransition=" + this.isCoverOverlayTransition + ", phoneCornerRadius=" + this.phoneCornerRadius + ", yCoordinateExplorePage=" + this.yCoordinateExplorePage + ", xCoordinateExplorePage=" + this.xCoordinateExplorePage + ", imageHeight=" + this.imageHeight + ", imageWidth=" + this.imageWidth + ", isMusicChart=" + this.isMusicChart + ", searchSource=" + this.searchSource + ", seamlessToDetail=" + this.seamlessToDetail + ", searchCustomCover=" + this.searchCustomCover + ", isProfileTabSearch=" + this.isProfileTabSearch + ", profileTabSearchId=" + this.profileTabSearchId + ", storyIsFromGroupChatSingleAvatar=" + this.storyIsFromGroupChatSingleAvatar + ", enterFollowingInnerContainer=" + this.enterFollowingInnerContainer + ", exploreTabID=" + this.exploreTabID + ", exploreTabName=" + this.exploreTabName + ", fromExplorePage=" + this.fromExplorePage + ", titleLength=" + this.titleLength + ", displayedTitleLength=" + this.displayedTitleLength + ", displayedDescriptionLength=" + this.displayedDescriptionLength + ", displayedDescWithoutHashTagMentionEmojiLength=" + this.displayedDescWithoutHashTagMentionEmojiLength + ", descWithoutHashTagMentionEmojiLength=" + this.descWithoutHashTagMentionEmojiLength + ", cmtToPostSourceGroupId=" + this.cmtToPostSourceGroupId + ", cmtToPostSourceLinkPosition=" + this.cmtToPostSourceLinkPosition + ", friendsV3DetailType=" + this.friendsV3DetailType + ", feedDetailClickTime=" + this.feedDetailClickTime + ", feedDetailInterceptTime=" + this.feedDetailInterceptTime + ", jsbVideoDetailKey=" + this.jsbVideoDetailKey + ", feedDetailVideoCurrentPosition=" + this.feedDetailVideoCurrentPosition + ", forcePopupOfflineModeSheet=" + this.forcePopupOfflineModeSheet + ", offlineModeSheetStyle=" + this.offlineModeSheetStyle + ", startViewId=" + this.startViewId + ", groupType=" + this.groupType + ", chatTypeStr=" + this.chatTypeStr + ", chatType=" + this.chatType + ", message=" + this.message + ", isFromTrendingHashtag=" + this.isFromTrendingHashtag + ", isStoryDetailForSaf=" + this.isStoryDetailForSaf + ", storyMusicEntrancePageCode=" + this.storyMusicEntrancePageCode + ", isFromPush=" + this.isFromPush + ", pushType=" + this.pushType + ", pushId=" + this.pushId + ", shareToStoryAidOfStory=" + this.shareToStoryAidOfStory + ", highlightRepostReplyIds=" + this.highlightRepostReplyIds + ", insertRepostUid=" + this.insertRepostUid + ", innerPushTrackExtra=" + this.innerPushTrackExtra + ", insertRepostReplyIds=" + this.insertRepostReplyIds + ", openRepostInput=" + this.openRepostInput + ", ttlsLiveExtra=" + this.ttlsLiveExtra + ", dynamicDetailTitleText=" + this.dynamicDetailTitleText + ", flowChangeToastText=" + this.flowChangeToastText + ", socialEntrance=" + this.socialEntrance + ", safAnimDelayMode=" + this.safAnimDelayMode + ", safAnimDelayTimeoutMs=" + this.safAnimDelayTimeoutMs + ", showRepostGuideTooltip=" + this.showRepostGuideTooltip + ", pollId=" + this.pollId + ", noticeTemplateIdForComment=" + this.noticeTemplateIdForComment + ", isShareUnavailableHighlight=" + this.isShareUnavailableHighlight + ", followRecommendNavExtra=" + this.followRecommendNavExtra + ", isFromViewPostEntry=" + this.isFromViewPostEntry + ", isFromAIRemixChain=" + this.isFromAIRemixChain + ", aigcOverlabelNotice=" + this.aigcOverlabelNotice + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.debugParam);
        parcel.writeString(this.takoInnerfeedEntranceGroupId);
        parcel.writeString(this.takoInnerfeedEntranceRank);
        parcel.writeString(this.takoIndex);
        parcel.writeString(this.takoStyle);
        parcel.writeString(this.takoWordsPos);
        parcel.writeString(this.takoItemUniqueId);
        parcel.writeString(this.takoChatId);
        parcel.writeString(this.takoSessionId);
        parcel.writeString(this.takoVideoSessionId);
        Boolean bool = this.takoVideoFromInner;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.takoScreenType);
        parcel.writeString(this.takoSessionSource);
        Float f = this.searchSeekProgress;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.loadEmptyText);
        Boolean bool2 = this.isShowSearchCollectionBottomBar;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num = this.searchInitPosition;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.searchTabShowName);
        parcel.writeString(this.searchTabShowCount);
        parcel.writeString(this.vibeExtraParam);
        Integer num2 = this.followSkylightIndex;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.followSkylightTotalCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Boolean bool3 = this.followSkylightNeedAnim;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.enterPosition);
        parcel.writeString(this.collectionType);
        Boolean bool4 = this.fromStoryToPost;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.isThumbnailScaleUp;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.isCoverOverlayTransition;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Float f2 = this.phoneCornerRadius;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Integer num4 = this.yCoordinateExplorePage;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.xCoordinateExplorePage;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Float f3 = this.imageHeight;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
        Float f4 = this.imageWidth;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f4.floatValue());
        }
        parcel.writeString(this.isMusicChart);
        parcel.writeString(this.searchSource);
        parcel.writeInt(this.seamlessToDetail ? 1 : 0);
        parcel.writeInt(this.searchCustomCover ? 1 : 0);
        Boolean bool7 = this.isProfileTabSearch;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.profileTabSearchId);
        Boolean bool8 = this.storyIsFromGroupChatSingleAvatar;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Boolean bool9 = this.enterFollowingInnerContainer;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        Long l = this.exploreTabID;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.exploreTabName);
        parcel.writeString(this.fromExplorePage);
        Integer num6 = this.titleLength;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        Integer num7 = this.displayedTitleLength;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        Integer num8 = this.displayedDescriptionLength;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num8.intValue());
        }
        Integer num9 = this.displayedDescWithoutHashTagMentionEmojiLength;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num9.intValue());
        }
        Integer num10 = this.descWithoutHashTagMentionEmojiLength;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num10.intValue());
        }
        parcel.writeString(this.cmtToPostSourceGroupId);
        parcel.writeString(this.cmtToPostSourceLinkPosition);
        parcel.writeString(this.friendsV3DetailType);
        Long l2 = this.feedDetailClickTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.feedDetailInterceptTime;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.jsbVideoDetailKey);
        Long l4 = this.feedDetailVideoCurrentPosition;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        Boolean bool10 = this.forcePopupOfflineModeSheet;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool10.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.offlineModeSheetStyle);
        parcel.writeString(this.startViewId);
        parcel.writeString(this.groupType);
        parcel.writeString(this.chatTypeStr);
        Integer num11 = this.chatType;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num11.intValue());
        }
        parcel.writeSerializable(this.message);
        Boolean bool11 = this.isFromTrendingHashtag;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool11.booleanValue() ? 1 : 0);
        }
        Boolean bool12 = this.isStoryDetailForSaf;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool12.booleanValue() ? 1 : 0);
        }
        Integer num12 = this.storyMusicEntrancePageCode;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num12.intValue());
        }
        parcel.writeInt(this.isFromPush);
        parcel.writeString(this.pushType);
        parcel.writeString(this.pushId);
        parcel.writeString(this.shareToStoryAidOfStory);
        parcel.writeString(this.highlightRepostReplyIds);
        parcel.writeString(this.insertRepostUid);
        parcel.writeString(this.innerPushTrackExtra);
        parcel.writeString(this.insertRepostReplyIds);
        parcel.writeString(this.openRepostInput);
        parcel.writeString(this.ttlsLiveExtra);
        parcel.writeString(this.dynamicDetailTitleText);
        parcel.writeString(this.flowChangeToastText);
        parcel.writeString(this.socialEntrance);
        Integer num13 = this.safAnimDelayMode;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num13.intValue());
        }
        Long l5 = this.safAnimDelayTimeoutMs;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l5.longValue());
        }
        Boolean bool13 = this.showRepostGuideTooltip;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool13.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.pollId);
        parcel.writeString(this.noticeTemplateIdForComment);
        Boolean bool14 = this.isShareUnavailableHighlight;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool14.booleanValue() ? 1 : 0);
        }
        parcel.writeSerializable(this.followRecommendNavExtra);
        Boolean bool15 = this.isFromViewPostEntry;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool15.booleanValue() ? 1 : 0);
        }
        Boolean bool16 = this.isFromAIRemixChain;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool16.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.aigcOverlabelNotice);
    }

    public final String getAigcOverlabelNotice() {
        return this.aigcOverlabelNotice;
    }

    public final Integer getChatType() {
        return this.chatType;
    }

    public final String getChatTypeStr() {
        return this.chatTypeStr;
    }

    public final String getCmtToPostSourceGroupId() {
        return this.cmtToPostSourceGroupId;
    }

    public final String getCmtToPostSourceLinkPosition() {
        return this.cmtToPostSourceLinkPosition;
    }

    public final String getCollectionType() {
        return this.collectionType;
    }

    public final String getDebugParam() {
        return this.debugParam;
    }

    public final Integer getDescWithoutHashTagMentionEmojiLength() {
        return this.descWithoutHashTagMentionEmojiLength;
    }

    public final Integer getDisplayedDescWithoutHashTagMentionEmojiLength() {
        return this.displayedDescWithoutHashTagMentionEmojiLength;
    }

    public final Integer getDisplayedDescriptionLength() {
        return this.displayedDescriptionLength;
    }

    public final Integer getDisplayedTitleLength() {
        return this.displayedTitleLength;
    }

    public final String getDynamicDetailTitleText() {
        return this.dynamicDetailTitleText;
    }

    public final Boolean getEnterFollowingInnerContainer() {
        return this.enterFollowingInnerContainer;
    }

    public final String getEnterPosition() {
        return this.enterPosition;
    }

    public final Long getExploreTabID() {
        return this.exploreTabID;
    }

    public final String getExploreTabName() {
        return this.exploreTabName;
    }

    public final Long getFeedDetailClickTime() {
        return this.feedDetailClickTime;
    }

    public final Long getFeedDetailInterceptTime() {
        return this.feedDetailInterceptTime;
    }

    public final Long getFeedDetailVideoCurrentPosition() {
        return this.feedDetailVideoCurrentPosition;
    }

    public final String getFlowChangeToastText() {
        return this.flowChangeToastText;
    }

    public final Serializable getFollowRecommendNavExtra() {
        return this.followRecommendNavExtra;
    }

    public final Integer getFollowSkylightIndex() {
        return this.followSkylightIndex;
    }

    public final Boolean getFollowSkylightNeedAnim() {
        return this.followSkylightNeedAnim;
    }

    public final Integer getFollowSkylightTotalCount() {
        return this.followSkylightTotalCount;
    }

    public final Boolean getForcePopupOfflineModeSheet() {
        return this.forcePopupOfflineModeSheet;
    }

    public final String getFriendsV3DetailType() {
        return this.friendsV3DetailType;
    }

    public final String getFromExplorePage() {
        return this.fromExplorePage;
    }

    public final Boolean getFromStoryToPost() {
        return this.fromStoryToPost;
    }

    public final String getGroupType() {
        return this.groupType;
    }

    public final String getHighlightRepostReplyIds() {
        return this.highlightRepostReplyIds;
    }

    public final Float getImageHeight() {
        return this.imageHeight;
    }

    public final Float getImageWidth() {
        return this.imageWidth;
    }

    public final String getInnerPushTrackExtra() {
        return this.innerPushTrackExtra;
    }

    public final String getInsertRepostReplyIds() {
        return this.insertRepostReplyIds;
    }

    public final String getInsertRepostUid() {
        return this.insertRepostUid;
    }

    public final String getJsbVideoDetailKey() {
        return this.jsbVideoDetailKey;
    }

    public final String getLoadEmptyText() {
        return this.loadEmptyText;
    }

    public final Serializable getMessage() {
        return this.message;
    }

    public final String getNoticeTemplateIdForComment() {
        return this.noticeTemplateIdForComment;
    }

    public final String getOfflineModeSheetStyle() {
        return this.offlineModeSheetStyle;
    }

    public final String getOpenRepostInput() {
        return this.openRepostInput;
    }

    public final Float getPhoneCornerRadius() {
        return this.phoneCornerRadius;
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final String getProfileTabSearchId() {
        return this.profileTabSearchId;
    }

    public final String getPushId() {
        return this.pushId;
    }

    public final String getPushType() {
        return this.pushType;
    }

    public final Integer getSafAnimDelayMode() {
        return this.safAnimDelayMode;
    }

    public final Long getSafAnimDelayTimeoutMs() {
        return this.safAnimDelayTimeoutMs;
    }

    public final boolean getSeamlessToDetail() {
        return this.seamlessToDetail;
    }

    public final boolean getSearchCustomCover() {
        return this.searchCustomCover;
    }

    public final Integer getSearchInitPosition() {
        return this.searchInitPosition;
    }

    public final Float getSearchSeekProgress() {
        return this.searchSeekProgress;
    }

    public final String getSearchSource() {
        return this.searchSource;
    }

    public final String getSearchTabShowCount() {
        return this.searchTabShowCount;
    }

    public final String getSearchTabShowName() {
        return this.searchTabShowName;
    }

    public final String getShareToStoryAidOfStory() {
        return this.shareToStoryAidOfStory;
    }

    public final Boolean getShowRepostGuideTooltip() {
        return this.showRepostGuideTooltip;
    }

    public final String getSocialEntrance() {
        return this.socialEntrance;
    }

    public final String getStartViewId() {
        return this.startViewId;
    }

    public final Boolean getStoryIsFromGroupChatSingleAvatar() {
        return this.storyIsFromGroupChatSingleAvatar;
    }

    public final Integer getStoryMusicEntrancePageCode() {
        return this.storyMusicEntrancePageCode;
    }

    public final String getTakoChatId() {
        return this.takoChatId;
    }

    public final String getTakoIndex() {
        return this.takoIndex;
    }

    public final String getTakoInnerfeedEntranceGroupId() {
        return this.takoInnerfeedEntranceGroupId;
    }

    public final String getTakoInnerfeedEntranceRank() {
        return this.takoInnerfeedEntranceRank;
    }

    public final String getTakoItemUniqueId() {
        return this.takoItemUniqueId;
    }

    public final String getTakoScreenType() {
        return this.takoScreenType;
    }

    public final String getTakoSessionId() {
        return this.takoSessionId;
    }

    public final String getTakoSessionSource() {
        return this.takoSessionSource;
    }

    public final String getTakoStyle() {
        return this.takoStyle;
    }

    public final Boolean getTakoVideoFromInner() {
        return this.takoVideoFromInner;
    }

    public final String getTakoVideoSessionId() {
        return this.takoVideoSessionId;
    }

    public final String getTakoWordsPos() {
        return this.takoWordsPos;
    }

    public final Integer getTitleLength() {
        return this.titleLength;
    }

    public final String getTtlsLiveExtra() {
        return this.ttlsLiveExtra;
    }

    public final String getVibeExtraParam() {
        return this.vibeExtraParam;
    }

    public final Integer getXCoordinateExplorePage() {
        return this.xCoordinateExplorePage;
    }

    public final Integer getYCoordinateExplorePage() {
        return this.yCoordinateExplorePage;
    }

    public final Boolean isCoverOverlayTransition() {
        return this.isCoverOverlayTransition;
    }

    public final Boolean isFromAIRemixChain() {
        return this.isFromAIRemixChain;
    }

    public final int isFromPush() {
        return this.isFromPush;
    }

    public final Boolean isFromTrendingHashtag() {
        return this.isFromTrendingHashtag;
    }

    public final Boolean isFromViewPostEntry() {
        return this.isFromViewPostEntry;
    }

    public final String isMusicChart() {
        return this.isMusicChart;
    }

    public final Boolean isProfileTabSearch() {
        return this.isProfileTabSearch;
    }

    public final Boolean isShareUnavailableHighlight() {
        return this.isShareUnavailableHighlight;
    }

    public final Boolean isShowSearchCollectionBottomBar() {
        return this.isShowSearchCollectionBottomBar;
    }

    public final Boolean isStoryDetailForSaf() {
        return this.isStoryDetailForSaf;
    }

    public final Boolean isThumbnailScaleUp() {
        return this.isThumbnailScaleUp;
    }

    public static DetailNavArgModel __fromBundle(Bundle bundle) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Boolean bool;
        String str10;
        String str11;
        Float f;
        String str12;
        Boolean bool2;
        Integer num;
        String str13;
        String str14;
        String str15;
        Integer num2;
        Integer num3;
        Boolean bool3;
        String str16;
        String str17;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Float fValueOf;
        Integer num4;
        Integer num5;
        Float fValueOf2;
        Float fValueOf3;
        int i2;
        String str18;
        String str19;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        String str20;
        Boolean bool10;
        Boolean bool11;
        Long l;
        String str21;
        String str22;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        String str23;
        String str24;
        String str25;
        Long l2;
        Long l3;
        String str26;
        Long l4;
        Boolean bool12;
        String str27;
        String str28;
        String str29;
        String str30;
        Integer num11;
        Serializable serializable;
        Boolean bool13;
        int i3;
        Boolean bool14;
        Integer num12;
        Integer num13;
        String str31;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        Integer num14;
        Long l5;
        Boolean bool15;
        String str43;
        String str44;
        Boolean bool16;
        Serializable serializable2;
        Boolean bool17;
        Boolean bool18;
        String str45;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        int iIntValue;
        String str46 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("debug_param")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("debug_param"), String.class);
            i = 0;
        } else {
            str = null;
            i = 1;
        }
        if (bundle.containsKey("innerfeed_entrance_group_id")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("innerfeed_entrance_group_id"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("innerfeed_entrance_rank")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("innerfeed_entrance_rank"), String.class);
        } else {
            i += 4;
            str3 = null;
        }
        if (bundle.containsKey("tako_index")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("tako_index"), String.class);
        } else {
            i += 8;
            str4 = null;
        }
        if (bundle.containsKey("tako_style")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("tako_style"), String.class);
        } else {
            i += 16;
            str5 = null;
        }
        if (bundle.containsKey("tako_words_pos")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("tako_words_pos"), String.class);
        } else {
            i += 32;
            str6 = null;
        }
        if (bundle.containsKey("item_unique_id")) {
            str7 = (String) RouteParser.INSTANCE.parse(bundle.get("item_unique_id"), String.class);
        } else {
            i += 64;
            str7 = null;
        }
        if (bundle.containsKey("tako_chat_id")) {
            str8 = (String) RouteParser.INSTANCE.parse(bundle.get("tako_chat_id"), String.class);
        } else {
            i += 128;
            str8 = null;
        }
        if (bundle.containsKey("tako_session_id")) {
            str9 = (String) RouteParser.INSTANCE.parse(bundle.get("tako_session_id"), String.class);
        } else {
            i += 256;
            str9 = null;
        }
        if (bundle.containsKey("tako_video_session_id")) {
            str46 = (String) RouteParser.INSTANCE.parse(bundle.get("tako_video_session_id"), String.class);
        } else {
            i += 512;
        }
        if (bundle.containsKey("tako_video_from_tako_inner")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("tako_video_from_tako_inner"), Boolean.class);
        } else {
            i += 1024;
            bool = null;
        }
        if (bundle.containsKey("tako_screen_type")) {
            str10 = (String) RouteParser.INSTANCE.parse(bundle.get("tako_screen_type"), String.class);
        } else {
            i += SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            str10 = null;
        }
        if (bundle.containsKey("tako_session_source")) {
            str11 = (String) RouteParser.INSTANCE.parse(bundle.get("tako_session_source"), String.class);
        } else {
            i += SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            str11 = null;
        }
        if (bundle.containsKey("extra_search_seek_progress")) {
            f = (Float) RouteParser.INSTANCE.parse(bundle.get("extra_search_seek_progress"), Float.class);
        } else {
            i += 8192;
            f = null;
        }
        if (bundle.containsKey("load_empty_text")) {
            str12 = (String) RouteParser.INSTANCE.parse(bundle.get("load_empty_text"), String.class);
        } else {
            i += 16384;
            str12 = null;
        }
        if (bundle.containsKey("is_show_collect_banner")) {
            bool2 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("is_show_collect_banner"), Boolean.class);
        } else {
            i += 32768;
            bool2 = null;
        }
        if (bundle.containsKey("search_init_position")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("search_init_position"), Integer.class);
        } else {
            i += 65536;
            num = null;
        }
        if (bundle.containsKey("tab_show_name")) {
            str13 = (String) RouteParser.INSTANCE.parse(bundle.get("tab_show_name"), String.class);
        } else {
            i += 131072;
            str13 = null;
        }
        if (bundle.containsKey("tab_count")) {
            str14 = (String) RouteParser.INSTANCE.parse(bundle.get("tab_count"), String.class);
        } else {
            i += 262144;
            str14 = null;
        }
        if (bundle.containsKey("vibe_feed_extra")) {
            str15 = (String) RouteParser.INSTANCE.parse(bundle.get("vibe_feed_extra"), String.class);
        } else {
            i += 524288;
            str15 = null;
        }
        if (bundle.containsKey("follow_skylight_index")) {
            num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get("follow_skylight_index"), Integer.class);
        } else {
            i += 1048576;
            num2 = null;
        }
        if (bundle.containsKey("follow_skylight_total_count")) {
            num3 = (Integer) RouteParser.INSTANCE.parse(bundle.get("follow_skylight_total_count"), Integer.class);
        } else {
            i += 2097152;
            num3 = null;
        }
        if (bundle.containsKey("follow_skylight_need_anim")) {
            bool3 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("follow_skylight_need_anim"), Boolean.class);
        } else {
            i += 4194304;
            bool3 = null;
        }
        if (bundle.containsKey("enter_position")) {
            str16 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_position"), String.class);
        } else {
            i += 8388608;
            str16 = null;
        }
        if (bundle.containsKey("collection_type")) {
            str17 = (String) RouteParser.INSTANCE.parse(bundle.get("collection_type"), String.class);
        } else {
            i += 16777216;
            str17 = null;
        }
        if (bundle.containsKey("from_story_to_post")) {
            bool4 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("from_story_to_post"), Boolean.class);
        } else {
            i += 33554432;
            bool4 = null;
        }
        if (bundle.containsKey("detail_scale_up_transition")) {
            bool5 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("detail_scale_up_transition"), Boolean.class);
        } else {
            i += 67108864;
            bool5 = null;
        }
        if (bundle.containsKey("cover_overlay_transition")) {
            bool6 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("cover_overlay_transition"), Boolean.class);
        } else {
            i += 134217728;
            bool6 = null;
        }
        if (bundle.containsKey("phone_corner_radius")) {
            fValueOf = (Float) RouteParser.INSTANCE.parse(bundle.get("phone_corner_radius"), Float.class);
        } else {
            i += 268435456;
            fValueOf = null;
        }
        if (bundle.containsKey("yCoordinateExplorePage")) {
            num4 = (Integer) RouteParser.INSTANCE.parse(bundle.get("yCoordinateExplorePage"), Integer.class);
        } else {
            i += 536870912;
            num4 = null;
        }
        if (bundle.containsKey("xCoordinateExplorePage")) {
            num5 = (Integer) RouteParser.INSTANCE.parse(bundle.get("xCoordinateExplorePage"), Integer.class);
        } else {
            i += 1073741824;
            num5 = null;
        }
        if (bundle.containsKey("imageHeight")) {
            fValueOf2 = (Float) RouteParser.INSTANCE.parse(bundle.get("imageHeight"), Float.class);
        } else {
            i -= Integer.MIN_VALUE;
            fValueOf2 = null;
        }
        if (bundle.containsKey("imageWidth")) {
            fValueOf3 = (Float) RouteParser.INSTANCE.parse(bundle.get("imageWidth"), Float.class);
            i2 = 0;
        } else {
            fValueOf3 = null;
            i2 = 1;
        }
        if (bundle.containsKey("is_music_chart")) {
            str18 = (String) RouteParser.INSTANCE.parse(bundle.get("is_music_chart"), String.class);
        } else {
            i2 += 2;
            str18 = null;
        }
        if (bundle.containsKey("search_source")) {
            str19 = (String) RouteParser.INSTANCE.parse(bundle.get("search_source"), String.class);
        } else {
            i2 += 4;
            str19 = null;
        }
        if (bundle.containsKey("search_seamless_to_detail")) {
            bool7 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("search_seamless_to_detail"), Boolean.class);
            if (bool7 == null) {
                i2 += 8;
            }
        } else {
            i2 += 8;
            bool7 = null;
        }
        if (bundle.containsKey("search_custom_cover")) {
            bool8 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("search_custom_cover"), Boolean.class);
            if (bool8 == null) {
                i2 += 16;
            }
        } else {
            i2 += 16;
            bool8 = null;
        }
        if (bundle.containsKey("is_profile_tab_search")) {
            bool9 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("is_profile_tab_search"), Boolean.class);
        } else {
            i2 += 32;
            bool9 = null;
        }
        if (bundle.containsKey("profile_tab_search_id")) {
            str20 = (String) RouteParser.INSTANCE.parse(bundle.get("profile_tab_search_id"), String.class);
        } else {
            i2 += 64;
            str20 = null;
        }
        if (bundle.containsKey("story_is_from_group_chat_single_avatar")) {
            bool10 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("story_is_from_group_chat_single_avatar"), Boolean.class);
        } else {
            i2 += 128;
            bool10 = null;
        }
        if (bundle.containsKey("enter_following_inner_container")) {
            bool11 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("enter_following_inner_container"), Boolean.class);
        } else {
            i2 += 256;
            bool11 = null;
        }
        if (bundle.containsKey("explore_topic_id")) {
            l = (Long) RouteParser.INSTANCE.parse(bundle.get("explore_topic_id"), Long.class);
        } else {
            i2 += 512;
            l = null;
        }
        if (bundle.containsKey("explore_topic")) {
            str21 = (String) RouteParser.INSTANCE.parse(bundle.get("explore_topic"), String.class);
        } else {
            i2 += 1024;
            str21 = null;
        }
        if (bundle.containsKey("from_explore_page")) {
            str22 = (String) RouteParser.INSTANCE.parse(bundle.get("from_explore_page"), String.class);
        } else {
            i2 += SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            str22 = null;
        }
        if (bundle.containsKey("title_length")) {
            num6 = (Integer) RouteParser.INSTANCE.parse(bundle.get("title_length"), Integer.class);
        } else {
            i2 += SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            num6 = null;
        }
        if (bundle.containsKey("displayed_title_length")) {
            num7 = (Integer) RouteParser.INSTANCE.parse(bundle.get("displayed_title_length"), Integer.class);
        } else {
            i2 += 8192;
            num7 = null;
        }
        if (bundle.containsKey("displayed_description_length")) {
            num8 = (Integer) RouteParser.INSTANCE.parse(bundle.get("displayed_description_length"), Integer.class);
        } else {
            i2 += 16384;
            num8 = null;
        }
        if (bundle.containsKey("displayed_desc_without_hashtag_mention_emoji_length")) {
            num9 = (Integer) RouteParser.INSTANCE.parse(bundle.get("displayed_desc_without_hashtag_mention_emoji_length"), Integer.class);
        } else {
            i2 += 32768;
            num9 = null;
        }
        if (bundle.containsKey("desc_without_hashtag_mention_emoji_length")) {
            num10 = (Integer) RouteParser.INSTANCE.parse(bundle.get("desc_without_hashtag_mention_emoji_length"), Integer.class);
        } else {
            i2 += 65536;
            num10 = null;
        }
        if (bundle.containsKey("cmt_to_post_source_group_id")) {
            str23 = (String) RouteParser.INSTANCE.parse(bundle.get("cmt_to_post_source_group_id"), String.class);
        } else {
            i2 += 131072;
            str23 = null;
        }
        if (bundle.containsKey("cmt_to_post_source_link_position")) {
            str24 = (String) RouteParser.INSTANCE.parse(bundle.get("cmt_to_post_source_link_position"), String.class);
        } else {
            i2 += 262144;
            str24 = null;
        }
        if (bundle.containsKey("friends_v3_detail_type")) {
            str25 = (String) RouteParser.INSTANCE.parse(bundle.get("friends_v3_detail_type"), String.class);
        } else {
            i2 += 524288;
            str25 = null;
        }
        if (bundle.containsKey("feed_detail_click_time")) {
            l2 = (Long) RouteParser.INSTANCE.parse(bundle.get("feed_detail_click_time"), Long.class);
        } else {
            i2 += 1048576;
            l2 = null;
        }
        if (bundle.containsKey("feed_detail_intercept_time")) {
            l3 = (Long) RouteParser.INSTANCE.parse(bundle.get("feed_detail_intercept_time"), Long.class);
        } else {
            i2 += 2097152;
            l3 = null;
        }
        if (bundle.containsKey("jsb_video_detail_key")) {
            str26 = (String) RouteParser.INSTANCE.parse(bundle.get("jsb_video_detail_key"), String.class);
        } else {
            i2 += 4194304;
            str26 = null;
        }
        if (bundle.containsKey("feed_detail_video_current_position")) {
            l4 = (Long) RouteParser.INSTANCE.parse(bundle.get("feed_detail_video_current_position"), Long.class);
        } else {
            i2 += 8388608;
            l4 = null;
        }
        if (bundle.containsKey("force_popup_offline_mode_sheet")) {
            bool12 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("force_popup_offline_mode_sheet"), Boolean.class);
        } else {
            i2 += 16777216;
            bool12 = null;
        }
        if (bundle.containsKey("offline_mode_sheet_style")) {
            str27 = (String) RouteParser.INSTANCE.parse(bundle.get("offline_mode_sheet_style"), String.class);
        } else {
            i2 += 33554432;
            str27 = null;
        }
        if (bundle.containsKey("start_view_id")) {
            str28 = (String) RouteParser.INSTANCE.parse(bundle.get("start_view_id"), String.class);
        } else {
            i2 += 67108864;
            str28 = null;
        }
        if (bundle.containsKey("group_type")) {
            str29 = (String) RouteParser.INSTANCE.parse(bundle.get("group_type"), String.class);
        } else {
            i2 += 134217728;
            str29 = null;
        }
        if (bundle.containsKey("chat_type_str")) {
            str30 = (String) RouteParser.INSTANCE.parse(bundle.get("chat_type_str"), String.class);
        } else {
            i2 += 268435456;
            str30 = null;
        }
        if (bundle.containsKey("chat_type")) {
            num11 = (Integer) RouteParser.INSTANCE.parse(bundle.get("chat_type"), Integer.class);
        } else {
            i2 += 536870912;
            num11 = null;
        }
        if (bundle.containsKey("message")) {
            serializable = (Serializable) RouteParser.INSTANCE.parse(bundle.get("message"), Serializable.class);
        } else {
            i2 += 1073741824;
            serializable = null;
        }
        if (bundle.containsKey("is_from_trending_hashtag")) {
            bool13 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("is_from_trending_hashtag"), Boolean.class);
        } else {
            i2 -= Integer.MIN_VALUE;
            bool13 = null;
        }
        if (bundle.containsKey("is_story_detail_for_saf")) {
            bool14 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("is_story_detail_for_saf"), Boolean.class);
            i3 = 0;
        } else {
            i3 = 1;
            bool14 = null;
        }
        if (bundle.containsKey("story_music_entrance_page_code")) {
            num12 = (Integer) RouteParser.INSTANCE.parse(bundle.get("story_music_entrance_page_code"), Integer.class);
        } else {
            i3 += 2;
            num12 = null;
        }
        if (bundle.containsKey("is_from_push")) {
            num13 = (Integer) RouteParser.INSTANCE.parse(bundle.get("is_from_push"), Integer.class);
            if (num13 == null) {
                i3 += 4;
            }
        } else {
            i3 += 4;
            num13 = null;
        }
        if (bundle.containsKey("push_type")) {
            str31 = (String) RouteParser.INSTANCE.parse(bundle.get("push_type"), String.class);
        } else {
            i3 += 8;
            str31 = null;
        }
        if (bundle.containsKey("push_id")) {
            str32 = (String) RouteParser.INSTANCE.parse(bundle.get("push_id"), String.class);
        } else {
            i3 += 16;
            str32 = null;
        }
        if (bundle.containsKey("share_to_story_aid_of_story")) {
            str33 = (String) RouteParser.INSTANCE.parse(bundle.get("share_to_story_aid_of_story"), String.class);
        } else {
            i3 += 32;
            str33 = null;
        }
        if (bundle.containsKey("highlight_repost_reply_ids")) {
            str34 = (String) RouteParser.INSTANCE.parse(bundle.get("highlight_repost_reply_ids"), String.class);
        } else {
            i3 += 64;
            str34 = null;
        }
        if (bundle.containsKey("insert_repost_user_ids")) {
            str35 = (String) RouteParser.INSTANCE.parse(bundle.get("insert_repost_user_ids"), String.class);
        } else {
            i3 += 128;
            str35 = null;
        }
        if (bundle.containsKey("inner_push_track_extra")) {
            str36 = (String) RouteParser.INSTANCE.parse(bundle.get("inner_push_track_extra"), String.class);
        } else {
            i3 += 256;
            str36 = null;
        }
        if (bundle.containsKey("insert_repost_reply_ids")) {
            str37 = (String) RouteParser.INSTANCE.parse(bundle.get("insert_repost_reply_ids"), String.class);
        } else {
            i3 += 512;
            str37 = null;
        }
        if (bundle.containsKey("open_repost_input")) {
            str38 = (String) RouteParser.INSTANCE.parse(bundle.get("open_repost_input"), String.class);
        } else {
            i3 += 1024;
            str38 = null;
        }
        if (bundle.containsKey("ttls_live_extra")) {
            str39 = (String) RouteParser.INSTANCE.parse(bundle.get("ttls_live_extra"), String.class);
        } else {
            i3 += SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            str39 = null;
        }
        if (bundle.containsKey("dynamic_detail_title_text")) {
            str40 = (String) RouteParser.INSTANCE.parse(bundle.get("dynamic_detail_title_text"), String.class);
        } else {
            i3 += SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            str40 = null;
        }
        if (bundle.containsKey("flow_change_toast_text")) {
            str41 = (String) RouteParser.INSTANCE.parse(bundle.get("flow_change_toast_text"), String.class);
        } else {
            i3 += 8192;
            str41 = null;
        }
        if (bundle.containsKey("social_entrance")) {
            str42 = (String) RouteParser.INSTANCE.parse(bundle.get("social_entrance"), String.class);
        } else {
            i3 += 16384;
            str42 = null;
        }
        if (bundle.containsKey("saf_anim_delay_mode")) {
            num14 = (Integer) RouteParser.INSTANCE.parse(bundle.get("saf_anim_delay_mode"), Integer.class);
        } else {
            i3 += 32768;
            num14 = null;
        }
        if (bundle.containsKey("saf_anim_delay_timeout_ms")) {
            l5 = (Long) RouteParser.INSTANCE.parse(bundle.get("saf_anim_delay_timeout_ms"), Long.class);
        } else {
            i3 += 65536;
            l5 = null;
        }
        if (bundle.containsKey("show_repost_guide_tooltip")) {
            bool15 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("show_repost_guide_tooltip"), Boolean.class);
        } else {
            i3 += 131072;
            bool15 = null;
        }
        if (bundle.containsKey("poll_id")) {
            str43 = (String) RouteParser.INSTANCE.parse(bundle.get("poll_id"), String.class);
        } else {
            i3 += 262144;
            str43 = null;
        }
        if (bundle.containsKey("notice_template_id_for_comment")) {
            str44 = (String) RouteParser.INSTANCE.parse(bundle.get("notice_template_id_for_comment"), String.class);
        } else {
            i3 += 524288;
            str44 = null;
        }
        if (bundle.containsKey("share_unavailable_high_light")) {
            bool16 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("share_unavailable_high_light"), Boolean.class);
        } else {
            i3 += 1048576;
            bool16 = null;
        }
        if (bundle.containsKey("follow_recommend_nav_param")) {
            serializable2 = (Serializable) RouteParser.INSTANCE.parse(bundle.get("follow_recommend_nav_param"), Serializable.class);
        } else {
            i3 += 2097152;
            serializable2 = null;
        }
        if (bundle.containsKey("from_view_post_entry")) {
            bool17 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("from_view_post_entry"), Boolean.class);
        } else {
            i3 += 4194304;
            bool17 = null;
        }
        if (bundle.containsKey("is_from_ai_remix_chain")) {
            bool18 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("is_from_ai_remix_chain"), Boolean.class);
        } else {
            i3 += 8388608;
            bool18 = null;
        }
        if (bundle.containsKey("aigc_overlabel_notice")) {
            str45 = (String) RouteParser.INSTANCE.parse(bundle.get("aigc_overlabel_notice"), String.class);
        } else {
            i3 += 16777216;
            str45 = null;
        }
        if (bool7 != null) {
            zBooleanValue = bool7.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (bool8 != null) {
            zBooleanValue2 = bool8.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        if (num13 != null) {
            iIntValue = num13.intValue();
        } else {
            iIntValue = 0;
        }
        String str47 = "";
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            str7 = null;
        }
        if ((i & 128) != 0) {
            str8 = null;
        }
        if ((i & 256) != 0) {
            str9 = null;
        }
        if ((i & 512) != 0) {
            str46 = null;
        }
        if ((i & 1024) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str10 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str11 = null;
        }
        if ((i & 8192) != 0) {
            f = null;
        }
        if ((i & 16384) != 0) {
            str12 = "";
        }
        if ((i & 32768) != 0) {
            bool2 = null;
        }
        if ((i & 65536) != 0) {
            num = null;
        }
        if ((i & 131072) != 0) {
            str13 = "";
        }
        if ((i & 262144) != 0) {
            str14 = "";
        }
        if ((524288 & i) != 0) {
            str15 = "";
        }
        int i4 = 0;
        if ((1048576 & i) != 0) {
            num2 = 0;
        }
        if ((2097152 & i) != 0) {
            num3 = 0;
        }
        if ((4194304 & i) != 0) {
            bool3 = Boolean.FALSE;
        }
        if ((8388608 & i) != 0) {
            str16 = null;
        }
        if ((16777216 & i) != 0) {
            str17 = null;
        }
        if ((33554432 & i) != 0) {
            bool4 = Boolean.FALSE;
        }
        if ((67108864 & i) != 0) {
            bool5 = Boolean.FALSE;
        }
        if ((134217728 & i) != 0) {
            bool6 = Boolean.FALSE;
        }
        if ((268435456 & i) != 0) {
            fValueOf = Float.valueOf(0.0f);
        }
        if ((536870912 & i) != 0) {
            num4 = 0;
        }
        if ((1073741824 & i) != 0) {
            num5 = 0;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            fValueOf2 = Float.valueOf(0.0f);
        }
        if ((i2 & 1) != 0) {
            fValueOf3 = Float.valueOf(0.0f);
        }
        if ((i2 & 2) != 0) {
            str18 = null;
        }
        if ((i2 & 4) != 0) {
            str19 = null;
        }
        if ((i2 & 8) != 0) {
            zBooleanValue = false;
        }
        if ((i2 & 16) != 0) {
            zBooleanValue2 = false;
        }
        if ((i2 & 32) != 0) {
            bool9 = Boolean.FALSE;
        }
        if ((i2 & 64) != 0) {
            str20 = null;
        }
        if ((i2 & 128) != 0) {
            bool10 = Boolean.FALSE;
        }
        if ((i2 & 256) != 0) {
            bool11 = Boolean.FALSE;
        }
        if ((i2 & 512) != 0) {
            l = null;
        }
        if ((i2 & 1024) != 0) {
            str21 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str22 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num6 = null;
        }
        if ((i2 & 8192) != 0) {
            num7 = null;
        }
        if ((i2 & 16384) != 0) {
            num8 = null;
        }
        if ((i2 & 32768) != 0) {
            num9 = null;
        }
        if ((i2 & 65536) != 0) {
            num10 = null;
        }
        if ((i2 & 131072) != 0) {
            str23 = null;
        }
        if ((i2 & 262144) != 0) {
            str24 = null;
        }
        if ((524288 & i2) != 0) {
            str25 = null;
        }
        if ((1048576 & i2) != 0) {
            l2 = null;
        }
        if ((2097152 & i2) != 0) {
            l3 = null;
        }
        if ((4194304 & i2) != 0) {
            str26 = null;
        }
        if ((8388608 & i2) != 0) {
            l4 = null;
        }
        if ((16777216 & i2) != 0) {
            bool12 = Boolean.FALSE;
        }
        if ((33554432 & i2) != 0) {
            str27 = null;
        }
        if ((67108864 & i2) != 0) {
            str28 = null;
        }
        if ((134217728 & i2) != 0) {
            str29 = null;
        }
        if ((268435456 & i2) != 0) {
            str30 = null;
        }
        if ((536870912 & i2) != 0) {
            num11 = null;
        }
        if ((1073741824 & i2) != 0) {
            serializable = null;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            bool13 = null;
        }
        if ((i3 & 1) != 0) {
            bool14 = Boolean.FALSE;
        }
        if ((i3 & 2) != 0) {
            num12 = null;
        }
        if ((i3 & 4) == 0) {
            i4 = iIntValue;
        }
        if ((i3 & 8) != 0) {
            str31 = null;
        }
        if ((i3 & 16) != 0) {
            str32 = null;
        }
        if ((i3 & 32) == 0) {
            str47 = str33;
        }
        if ((i3 & 64) != 0) {
            str34 = null;
        }
        if ((i3 & 128) != 0) {
            str35 = null;
        }
        if ((i3 & 256) != 0) {
            str36 = null;
        }
        if ((i3 & 512) != 0) {
            str37 = null;
        }
        if ((i3 & 1024) != 0) {
            str38 = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str39 = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str40 = null;
        }
        if ((i3 & 8192) != 0) {
            str41 = null;
        }
        if ((i3 & 16384) != 0) {
            str42 = null;
        }
        if ((i3 & 32768) != 0) {
            num14 = null;
        }
        if ((i3 & 65536) != 0) {
            l5 = null;
        }
        if ((i3 & 131072) != 0) {
            bool15 = Boolean.FALSE;
        }
        if ((i3 & 262144) != 0) {
            str43 = null;
        }
        if ((524288 & i3) != 0) {
            str44 = null;
        }
        if ((1048576 & i3) != 0) {
            bool16 = Boolean.FALSE;
        }
        if ((2097152 & i3) != 0) {
            serializable2 = null;
        }
        if ((4194304 & i3) != 0) {
            bool17 = Boolean.FALSE;
        }
        if ((8388608 & i3) != 0) {
            bool18 = Boolean.FALSE;
        }
        if ((i3 & 16777216) != 0) {
            str45 = null;
        }
        return new DetailNavArgModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str46, bool, str10, str11, f, str12, bool2, num, str13, str14, str15, num2, num3, bool3, str16, str17, bool4, bool5, bool6, fValueOf, num4, num5, fValueOf2, fValueOf3, str18, str19, zBooleanValue, zBooleanValue2, bool9, str20, bool10, bool11, l, str21, str22, num6, num7, num8, num9, num10, str23, str24, str25, l2, l3, str26, l4, bool12, str27, str28, str29, str30, num11, serializable, bool13, bool14, num12, i4, str31, str32, str47, str34, str35, str36, str37, str38, str39, str40, str41, str42, num14, l5, bool15, str43, str44, bool16, serializable2, bool17, bool18, str45);
    }

    public final void setAigcOverlabelNotice(String str) {
        this.aigcOverlabelNotice = str;
    }

    public final void setChatType(Integer num) {
        this.chatType = num;
    }

    public final void setChatTypeStr(String str) {
        this.chatTypeStr = str;
    }

    public final void setCmtToPostSourceGroupId(String str) {
        this.cmtToPostSourceGroupId = str;
    }

    public final void setCmtToPostSourceLinkPosition(String str) {
        this.cmtToPostSourceLinkPosition = str;
    }

    public final void setCollectionType(String str) {
        this.collectionType = str;
    }

    public final void setCoverOverlayTransition(Boolean bool) {
        this.isCoverOverlayTransition = bool;
    }

    public final void setDebugParam(String str) {
        this.debugParam = str;
    }

    public final void setDescWithoutHashTagMentionEmojiLength(Integer num) {
        this.descWithoutHashTagMentionEmojiLength = num;
    }

    public final void setDisplayedDescWithoutHashTagMentionEmojiLength(Integer num) {
        this.displayedDescWithoutHashTagMentionEmojiLength = num;
    }

    public final void setDisplayedDescriptionLength(Integer num) {
        this.displayedDescriptionLength = num;
    }

    public final void setDisplayedTitleLength(Integer num) {
        this.displayedTitleLength = num;
    }

    public final void setDynamicDetailTitleText(String str) {
        this.dynamicDetailTitleText = str;
    }

    public final void setEnterFollowingInnerContainer(Boolean bool) {
        this.enterFollowingInnerContainer = bool;
    }

    public final void setEnterPosition(String str) {
        this.enterPosition = str;
    }

    public final void setExploreTabID(Long l) {
        this.exploreTabID = l;
    }

    public final void setExploreTabName(String str) {
        this.exploreTabName = str;
    }

    public final void setFeedDetailClickTime(Long l) {
        this.feedDetailClickTime = l;
    }

    public final void setFeedDetailInterceptTime(Long l) {
        this.feedDetailInterceptTime = l;
    }

    public final void setFeedDetailVideoCurrentPosition(Long l) {
        this.feedDetailVideoCurrentPosition = l;
    }

    public final void setFlowChangeToastText(String str) {
        this.flowChangeToastText = str;
    }

    public final void setFollowRecommendNavExtra(Serializable serializable) {
        this.followRecommendNavExtra = serializable;
    }

    public final void setFollowSkylightIndex(Integer num) {
        this.followSkylightIndex = num;
    }

    public final void setFollowSkylightNeedAnim(Boolean bool) {
        this.followSkylightNeedAnim = bool;
    }

    public final void setFollowSkylightTotalCount(Integer num) {
        this.followSkylightTotalCount = num;
    }

    public final void setForcePopupOfflineModeSheet(Boolean bool) {
        this.forcePopupOfflineModeSheet = bool;
    }

    public final void setFriendsV3DetailType(String str) {
        this.friendsV3DetailType = str;
    }

    public final void setFromAIRemixChain(Boolean bool) {
        this.isFromAIRemixChain = bool;
    }

    public final void setFromExplorePage(String str) {
        this.fromExplorePage = str;
    }

    public final void setFromPush(int i) {
        this.isFromPush = i;
    }

    public final void setFromStoryToPost(Boolean bool) {
        this.fromStoryToPost = bool;
    }

    public final void setFromTrendingHashtag(Boolean bool) {
        this.isFromTrendingHashtag = bool;
    }

    public final void setFromViewPostEntry(Boolean bool) {
        this.isFromViewPostEntry = bool;
    }

    public final void setGroupType(String str) {
        this.groupType = str;
    }

    public final void setHighlightRepostReplyIds(String str) {
        this.highlightRepostReplyIds = str;
    }

    public final void setImageHeight(Float f) {
        this.imageHeight = f;
    }

    public final void setImageWidth(Float f) {
        this.imageWidth = f;
    }

    public final void setInnerPushTrackExtra(String str) {
        this.innerPushTrackExtra = str;
    }

    public final void setInsertRepostReplyIds(String str) {
        this.insertRepostReplyIds = str;
    }

    public final void setInsertRepostUid(String str) {
        this.insertRepostUid = str;
    }

    public final void setJsbVideoDetailKey(String str) {
        this.jsbVideoDetailKey = str;
    }

    public final void setLoadEmptyText(String str) {
        this.loadEmptyText = str;
    }

    public final void setMessage(Serializable serializable) {
        this.message = serializable;
    }

    public final void setMusicChart(String str) {
        this.isMusicChart = str;
    }

    public final void setNoticeTemplateIdForComment(String str) {
        this.noticeTemplateIdForComment = str;
    }

    public final void setOfflineModeSheetStyle(String str) {
        this.offlineModeSheetStyle = str;
    }

    public final void setOpenRepostInput(String str) {
        this.openRepostInput = str;
    }

    public final void setPhoneCornerRadius(Float f) {
        this.phoneCornerRadius = f;
    }

    public final void setPollId(String str) {
        this.pollId = str;
    }

    public final void setProfileTabSearch(Boolean bool) {
        this.isProfileTabSearch = bool;
    }

    public final void setProfileTabSearchId(String str) {
        this.profileTabSearchId = str;
    }

    public final void setPushId(String str) {
        this.pushId = str;
    }

    public final void setPushType(String str) {
        this.pushType = str;
    }

    public final void setSafAnimDelayMode(Integer num) {
        this.safAnimDelayMode = num;
    }

    public final void setSafAnimDelayTimeoutMs(Long l) {
        this.safAnimDelayTimeoutMs = l;
    }

    public final void setSeamlessToDetail(boolean z) {
        this.seamlessToDetail = z;
    }

    public final void setSearchCustomCover(boolean z) {
        this.searchCustomCover = z;
    }

    public final void setSearchInitPosition(Integer num) {
        this.searchInitPosition = num;
    }

    public final void setSearchSeekProgress(Float f) {
        this.searchSeekProgress = f;
    }

    public final void setSearchSource(String str) {
        this.searchSource = str;
    }

    public final void setSearchTabShowCount(String str) {
        this.searchTabShowCount = str;
    }

    public final void setSearchTabShowName(String str) {
        this.searchTabShowName = str;
    }

    public final void setShareToStoryAidOfStory(String str) {
        this.shareToStoryAidOfStory = str;
    }

    public final void setShareUnavailableHighlight(Boolean bool) {
        this.isShareUnavailableHighlight = bool;
    }

    public final void setShowRepostGuideTooltip(Boolean bool) {
        this.showRepostGuideTooltip = bool;
    }

    public final void setShowSearchCollectionBottomBar(Boolean bool) {
        this.isShowSearchCollectionBottomBar = bool;
    }

    public final void setSocialEntrance(String str) {
        this.socialEntrance = str;
    }

    public final void setStartViewId(String str) {
        this.startViewId = str;
    }

    public final void setStoryDetailForSaf(Boolean bool) {
        this.isStoryDetailForSaf = bool;
    }

    public final void setStoryIsFromGroupChatSingleAvatar(Boolean bool) {
        this.storyIsFromGroupChatSingleAvatar = bool;
    }

    public final void setStoryMusicEntrancePageCode(Integer num) {
        this.storyMusicEntrancePageCode = num;
    }

    public final void setTakoChatId(String str) {
        this.takoChatId = str;
    }

    public final void setTakoIndex(String str) {
        this.takoIndex = str;
    }

    public final void setTakoInnerfeedEntranceGroupId(String str) {
        this.takoInnerfeedEntranceGroupId = str;
    }

    public final void setTakoInnerfeedEntranceRank(String str) {
        this.takoInnerfeedEntranceRank = str;
    }

    public final void setTakoItemUniqueId(String str) {
        this.takoItemUniqueId = str;
    }

    public final void setTakoScreenType(String str) {
        this.takoScreenType = str;
    }

    public final void setTakoSessionId(String str) {
        this.takoSessionId = str;
    }

    public final void setTakoSessionSource(String str) {
        this.takoSessionSource = str;
    }

    public final void setTakoStyle(String str) {
        this.takoStyle = str;
    }

    public final void setTakoVideoFromInner(Boolean bool) {
        this.takoVideoFromInner = bool;
    }

    public final void setTakoVideoSessionId(String str) {
        this.takoVideoSessionId = str;
    }

    public final void setTakoWordsPos(String str) {
        this.takoWordsPos = str;
    }

    public final void setThumbnailScaleUp(Boolean bool) {
        this.isThumbnailScaleUp = bool;
    }

    public final void setTitleLength(Integer num) {
        this.titleLength = num;
    }

    public final void setTtlsLiveExtra(String str) {
        this.ttlsLiveExtra = str;
    }

    public final void setVibeExtraParam(String str) {
        this.vibeExtraParam = str;
    }

    public final void setXCoordinateExplorePage(Integer num) {
        this.xCoordinateExplorePage = num;
    }

    public final void setYCoordinateExplorePage(Integer num) {
        this.yCoordinateExplorePage = num;
    }

    public DetailNavArgModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, Float f, String str13, Boolean bool2, Integer num, String str14, String str15, String str16, Integer num2, Integer num3, Boolean bool3, String str17, String str18, Boolean bool4, Boolean bool5, Boolean bool6, Float f2, Integer num4, Integer num5, Float f3, Float f4, String str19, String str20, boolean z, boolean z2, Boolean bool7, String str21, Boolean bool8, Boolean bool9, Long l, String str22, String str23, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str24, String str25, String str26, Long l2, Long l3, String str27, Long l4, Boolean bool10, String str28, String str29, String str30, String str31, Integer num11, Serializable serializable, Boolean bool11, Boolean bool12, Integer num12, int i, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, Integer num13, Long l5, Boolean bool13, String str44, String str45, Boolean bool14, Serializable serializable2, Boolean bool15, Boolean bool16, String str46) {
        this.debugParam = str;
        this.takoInnerfeedEntranceGroupId = str2;
        this.takoInnerfeedEntranceRank = str3;
        this.takoIndex = str4;
        this.takoStyle = str5;
        this.takoWordsPos = str6;
        this.takoItemUniqueId = str7;
        this.takoChatId = str8;
        this.takoSessionId = str9;
        this.takoVideoSessionId = str10;
        this.takoVideoFromInner = bool;
        this.takoScreenType = str11;
        this.takoSessionSource = str12;
        this.searchSeekProgress = f;
        this.loadEmptyText = str13;
        this.isShowSearchCollectionBottomBar = bool2;
        this.searchInitPosition = num;
        this.searchTabShowName = str14;
        this.searchTabShowCount = str15;
        this.vibeExtraParam = str16;
        this.followSkylightIndex = num2;
        this.followSkylightTotalCount = num3;
        this.followSkylightNeedAnim = bool3;
        this.enterPosition = str17;
        this.collectionType = str18;
        this.fromStoryToPost = bool4;
        this.isThumbnailScaleUp = bool5;
        this.isCoverOverlayTransition = bool6;
        this.phoneCornerRadius = f2;
        this.yCoordinateExplorePage = num4;
        this.xCoordinateExplorePage = num5;
        this.imageHeight = f3;
        this.imageWidth = f4;
        this.isMusicChart = str19;
        this.searchSource = str20;
        this.seamlessToDetail = z;
        this.searchCustomCover = z2;
        this.isProfileTabSearch = bool7;
        this.profileTabSearchId = str21;
        this.storyIsFromGroupChatSingleAvatar = bool8;
        this.enterFollowingInnerContainer = bool9;
        this.exploreTabID = l;
        this.exploreTabName = str22;
        this.fromExplorePage = str23;
        this.titleLength = num6;
        this.displayedTitleLength = num7;
        this.displayedDescriptionLength = num8;
        this.displayedDescWithoutHashTagMentionEmojiLength = num9;
        this.descWithoutHashTagMentionEmojiLength = num10;
        this.cmtToPostSourceGroupId = str24;
        this.cmtToPostSourceLinkPosition = str25;
        this.friendsV3DetailType = str26;
        this.feedDetailClickTime = l2;
        this.feedDetailInterceptTime = l3;
        this.jsbVideoDetailKey = str27;
        this.feedDetailVideoCurrentPosition = l4;
        this.forcePopupOfflineModeSheet = bool10;
        this.offlineModeSheetStyle = str28;
        this.startViewId = str29;
        this.groupType = str30;
        this.chatTypeStr = str31;
        this.chatType = num11;
        this.message = serializable;
        this.isFromTrendingHashtag = bool11;
        this.isStoryDetailForSaf = bool12;
        this.storyMusicEntrancePageCode = num12;
        this.isFromPush = i;
        this.pushType = str32;
        this.pushId = str33;
        this.shareToStoryAidOfStory = str34;
        this.highlightRepostReplyIds = str35;
        this.insertRepostUid = str36;
        this.innerPushTrackExtra = str37;
        this.insertRepostReplyIds = str38;
        this.openRepostInput = str39;
        this.ttlsLiveExtra = str40;
        this.dynamicDetailTitleText = str41;
        this.flowChangeToastText = str42;
        this.socialEntrance = str43;
        this.safAnimDelayMode = num13;
        this.safAnimDelayTimeoutMs = l5;
        this.showRepostGuideTooltip = bool13;
        this.pollId = str44;
        this.noticeTemplateIdForComment = str45;
        this.isShareUnavailableHighlight = bool14;
        this.followRecommendNavExtra = serializable2;
        this.isFromViewPostEntry = bool15;
        this.isFromAIRemixChain = bool16;
        this.aigcOverlabelNotice = str46;
    }
}
