package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C1442190ndJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.EditPageFunctionTracking;
import com.ss.android.ugc.aweme.creative.model.publish.EditDescMobModel;
import com.ss.android.ugc.aweme.creative.model.publish.SmartCodecMobDataModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class CommonMobParamModel implements Parcelable {
    public static final Parcelable.Creator<CommonMobParamModel> CREATOR = new Parcelable.Creator<CommonMobParamModel>() { // from class: X.0L2v
        @Override // android.os.Parcelable.Creator
        public final CommonMobParamModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            Boolean boolValueOf;
            boolean z8;
            boolean z9;
            boolean z10;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            EditDescMobModel editDescMobModelCreateFromParcel = EditDescMobModel.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolValueOf = Boolean.valueOf(z7);
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            String string9 = parcel.readString();
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            long j = parcel.readLong();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            EditPageFunctionTracking editPageFunctionTrackingCreateFromParcel = EditPageFunctionTracking.CREATOR.createFromParcel(parcel);
            int i5 = parcel.readInt();
            String string10 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolValueOf2 = Boolean.valueOf(z10);
            }
            return new CommonMobParamModel(z, string, z2, string2, z3, z4, z5, string3, string4, z6, string5, string6, string7, string8, editDescMobModelCreateFromParcel, arrayListCreateStringArrayList, boolValueOf, z8, string9, z9, j, i, i2, i3, i4, editPageFunctionTrackingCreateFromParcel, i5, string10, arrayListCreateStringArrayList2, string11, string12, string13, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final CommonMobParamModel[] newArray(int i) {
            return new CommonMobParamModel[i];
        }
    };

    @C040H
    public ArrayList<String> aigcCreationSource;

    @C09CT("contain_format_list")
    public List<String> c2paFormatList;

    @C09CT("c2pa_read_recover_type")
    public int c2paReadRecoverType;

    @C09CT("challenge_ids_not_clear_when_back")
    public Boolean challengeIdsNotClearWhenBack;

    @C040H
    public long clickDraftTime;

    @C040H
    public EditDescMobModel editDescMobModel;

    @C09CT("edit_page_function_tracking")
    public final EditPageFunctionTracking editPageFuncTracking;

    @C09CT("edit_page_type")
    public String editPageType;

    @C040H
    public String editPrePublishCancelReason;

    @C09CT("from_group_id")
    public String fromGroupId;

    @C09CT("has_click_recommend_hashtag")
    public boolean hasClickRecommendHashtag;

    @C09CT("has_edit")
    public Boolean hasEdit;

    @C09CT("hashtag_list")
    public String hashtagList;

    @C09CT("is_from_im_share_to_story")
    public boolean isFromIMShareToStory;

    @C09CT("is_handsfree_used")
    public boolean isHandsFreeUsed;

    @C09CT("is_IM_share_video_to_post")
    public boolean isIMShareVideoToPost;

    @C040H
    public boolean isReCreateAuthkey;

    @C040H
    public boolean isStartedPrePublish;

    @C09CT("is_story_enhanced_entrance")
    public boolean isStoryEnhancedEntrance;

    @C09CT("is_upload_direct_enter")
    public boolean isUploadDirectEnter;

    @C09CT("origin_photo_count")
    public int originPhotoCount;

    @C09CT("origin_video_count")
    public int originVideoCount;

    @C09CT("original_user_select_pic_cnt")
    public int originalUserSelectedPicCnt;

    @C09CT("original_user_select_video_cnt")
    public int originalUserSelectedVideoCnt;

    @C040H
    public String pureHashtagString;

    @C09CT("record_result")
    public String recordResult;

    @C09CT("record_type")
    public String recordType;

    @C09CT("search_extra")
    public String searchExtra;

    @C09CT("shoot_enter_from")
    public String shootEnterFrom;

    @C09CT("shoot_enter_method")
    public String shootEnterMethod;

    @C09CT("shoot_from_view_panel_aweme_id")
    public String shootFromViewPanelAwemeId;

    @C040H
    public final SmartCodecMobDataModel smartCodecMobDataModel;

    @C09CT("story_music_default_type")
    public String storyMusicDefaultType;

    @C09CT("story_music")
    public String storyMusicOrigin;

    @C040H
    public final C1442190ndJ vqCompileDataModel;

    public CommonMobParamModel() {
        this(false, "", false, "", false, false, false, null, null, false, null, null, null, null, new EditDescMobModel(0), new ArrayList(), null, false, "", false, -1L, -1, -1, -1, -1, new EditPageFunctionTracking(false, false, false, false, false, false), 0, "", new ArrayList(), "video", null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasClickRecommendHashtag ? 1 : 0);
        parcel.writeString(this.hashtagList);
        parcel.writeInt(this.isHandsFreeUsed ? 1 : 0);
        parcel.writeString(this.pureHashtagString);
        parcel.writeInt(this.isUploadDirectEnter ? 1 : 0);
        parcel.writeInt(this.isFromIMShareToStory ? 1 : 0);
        parcel.writeInt(this.isIMShareVideoToPost ? 1 : 0);
        parcel.writeString(this.shootEnterFrom);
        parcel.writeString(this.shootEnterMethod);
        parcel.writeInt(this.isStoryEnhancedEntrance ? 1 : 0);
        parcel.writeString(this.storyMusicOrigin);
        parcel.writeString(this.storyMusicDefaultType);
        parcel.writeString(this.recordType);
        parcel.writeString(this.recordResult);
        this.editDescMobModel.writeToParcel(parcel, i);
        parcel.writeStringList(this.aigcCreationSource);
        Boolean bool = this.hasEdit;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.isStartedPrePublish ? 1 : 0);
        parcel.writeString(this.editPrePublishCancelReason);
        parcel.writeInt(this.isReCreateAuthkey ? 1 : 0);
        parcel.writeLong(this.clickDraftTime);
        parcel.writeInt(this.originVideoCount);
        parcel.writeInt(this.originPhotoCount);
        parcel.writeInt(this.originalUserSelectedPicCnt);
        parcel.writeInt(this.originalUserSelectedVideoCnt);
        this.editPageFuncTracking.writeToParcel(parcel, i);
        parcel.writeInt(this.c2paReadRecoverType);
        parcel.writeString(this.fromGroupId);
        parcel.writeStringList(this.c2paFormatList);
        parcel.writeString(this.editPageType);
        parcel.writeString(this.shootFromViewPanelAwemeId);
        parcel.writeString(this.searchExtra);
        Boolean bool2 = this.challengeIdsNotClearWhenBack;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public final void LIZ(String str) {
        this.fromGroupId = str;
    }

    public CommonMobParamModel(boolean z, String str, boolean z2, String str2, boolean z3, boolean z4, boolean z5, String str3, String str4, boolean z6, String str5, String str6, String str7, String str8, EditDescMobModel editDescMobModel, ArrayList<String> arrayList, Boolean bool, boolean z7, String str9, boolean z8, long j, int i, int i2, int i3, int i4, EditPageFunctionTracking editPageFunctionTracking, int i5, String str10, List<String> list, String str11, String str12, String str13, Boolean bool2) {
        this.hasClickRecommendHashtag = z;
        this.hashtagList = str;
        this.isHandsFreeUsed = z2;
        this.pureHashtagString = str2;
        this.isUploadDirectEnter = z3;
        this.isFromIMShareToStory = z4;
        this.isIMShareVideoToPost = z5;
        this.shootEnterFrom = str3;
        this.shootEnterMethod = str4;
        this.isStoryEnhancedEntrance = z6;
        this.storyMusicOrigin = str5;
        this.storyMusicDefaultType = str6;
        this.recordType = str7;
        this.recordResult = str8;
        this.editDescMobModel = editDescMobModel;
        this.aigcCreationSource = arrayList;
        this.hasEdit = bool;
        this.isStartedPrePublish = z7;
        this.editPrePublishCancelReason = str9;
        this.isReCreateAuthkey = z8;
        this.clickDraftTime = j;
        this.originVideoCount = i;
        this.originPhotoCount = i2;
        this.originalUserSelectedPicCnt = i3;
        this.originalUserSelectedVideoCnt = i4;
        this.editPageFuncTracking = editPageFunctionTracking;
        this.c2paReadRecoverType = i5;
        this.fromGroupId = str10;
        this.c2paFormatList = list;
        this.editPageType = str11;
        this.shootFromViewPanelAwemeId = str12;
        this.searchExtra = str13;
        this.challengeIdsNotClearWhenBack = bool2;
        this.vqCompileDataModel = new C1442190ndJ();
        this.smartCodecMobDataModel = new SmartCodecMobDataModel(0);
    }
}
