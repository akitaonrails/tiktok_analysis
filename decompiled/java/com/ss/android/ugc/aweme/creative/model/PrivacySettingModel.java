package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.creative.model.ContentCheckInfo;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PrivacySettingModel implements Parcelable {
    public static final Parcelable.Creator<PrivacySettingModel> CREATOR = new Parcelable.Creator<PrivacySettingModel>() { // from class: X.0nWO
        @Override // android.os.Parcelable.Creator
        public final PrivacySettingModel createFromParcel(Parcel parcel) {
            boolean z;
            CMPreviewInfo cMPreviewInfoCreateFromParcel;
            boolean z2;
            boolean z3;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                cMPreviewInfoCreateFromParcel = null;
            } else {
                cMPreviewInfoCreateFromParcel = CMPreviewInfo.CREATOR.createFromParcel(parcel);
            }
            CMPreviewInfo cMPreviewInfo = cMPreviewInfoCreateFromParcel;
            AIGCInfo aIGCInfoCreateFromParcel = AIGCInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ContentCheckInfo contentCheckInfoCreateFromParcel = ContentCheckInfo.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            int i5 = parcel.readInt();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new PrivacySettingModel(i, i2, i3, i4, z, cMPreviewInfo, aIGCInfoCreateFromParcel, z2, contentCheckInfoCreateFromParcel, string, i5, string2, arrayListCreateStringArrayList, z3, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final PrivacySettingModel[] newArray(int i) {
            return new PrivacySettingModel[i];
        }
    };

    @C09CT("aigc_info")
    public AIGCInfo aigcInfo;

    @C09CT("allow_ai_remix")
    public int allowAIRemix;

    @C040H
    public int allowComment;

    @C09CT("allow_create_sticker")
    public int allowCreateSticker;

    @C09CT("allow_share_to_story")
    public int allowShareToStory;

    @C09CT("allow_visual_search")
    public boolean allowVisualSearch;

    @C040H
    public String c2paResultJson;

    @C09CT("cm_preview_info")
    public CMPreviewInfo cmPreviewInfo;

    @C09CT("content_check_info")
    public ContentCheckInfo contentCheckInfo;

    @C09CT("content_reuse_permission")
    public int contentReusePermission;

    @C040H
    public String fingerprintId;

    @C040H
    public final List<String> gcMarkContentProducerList;

    @C040H
    public final List<String> iptcTypeList;

    @C040H
    public boolean isIPTCMetadataExist;

    @C09CT("is_subscribe_only")
    public boolean isSubscribeOnly;

    public PrivacySettingModel() {
        this(0, 0, 0, 0, false, null, new AIGCInfo(0, false, 0), true, new ContentCheckInfo(false, false, -1), null, 0, "", new CopyOnWriteArrayList(), false, new CopyOnWriteArrayList());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySettingModel)) {
            return false;
        }
        PrivacySettingModel privacySettingModel = (PrivacySettingModel) obj;
        return this.allowCreateSticker == privacySettingModel.allowCreateSticker && this.allowShareToStory == privacySettingModel.allowShareToStory && this.contentReusePermission == privacySettingModel.contentReusePermission && this.allowAIRemix == privacySettingModel.allowAIRemix && this.isSubscribeOnly == privacySettingModel.isSubscribeOnly && Intrinsics.LJFF(this.cmPreviewInfo, privacySettingModel.cmPreviewInfo) && Intrinsics.LJFF(this.aigcInfo, privacySettingModel.aigcInfo) && this.allowVisualSearch == privacySettingModel.allowVisualSearch && Intrinsics.LJFF(this.contentCheckInfo, privacySettingModel.contentCheckInfo) && Intrinsics.LJFF(this.c2paResultJson, privacySettingModel.c2paResultJson) && this.allowComment == privacySettingModel.allowComment && Intrinsics.LJFF(this.fingerprintId, privacySettingModel.fingerprintId) && Intrinsics.LJFF(this.gcMarkContentProducerList, privacySettingModel.gcMarkContentProducerList) && this.isIPTCMetadataExist == privacySettingModel.isIPTCMetadataExist && Intrinsics.LJFF(this.iptcTypeList, privacySettingModel.iptcTypeList);
    }

    public final int hashCode() {
        int iZ2 = ((((((((this.allowCreateSticker * 31) + this.allowShareToStory) * 31) + this.contentReusePermission) * 31) + this.allowAIRemix) * 31) + C786410Ut5.Z2(this.isSubscribeOnly)) * 31;
        CMPreviewInfo cMPreviewInfo = this.cmPreviewInfo;
        int iHashCode = (((((((iZ2 + (cMPreviewInfo == null ? 0 : cMPreviewInfo.hashCode())) * 31) + this.aigcInfo.hashCode()) * 31) + C786410Ut5.Z2(this.allowVisualSearch)) * 31) + this.contentCheckInfo.hashCode()) * 31;
        String str = this.c2paResultJson;
        return ((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.allowComment) * 31) + this.fingerprintId.hashCode()) * 31) + this.gcMarkContentProducerList.hashCode()) * 31) + C786410Ut5.Z2(this.isIPTCMetadataExist)) * 31) + this.iptcTypeList.hashCode();
    }

    public final String toString() {
        return "PrivacySettingModel(allowCreateSticker=" + this.allowCreateSticker + ", allowShareToStory=" + this.allowShareToStory + ", contentReusePermission=" + this.contentReusePermission + ", allowAIRemix=" + this.allowAIRemix + ", isSubscribeOnly=" + this.isSubscribeOnly + ", cmPreviewInfo=" + this.cmPreviewInfo + ", aigcInfo=" + this.aigcInfo + ", allowVisualSearch=" + this.allowVisualSearch + ", contentCheckInfo=" + this.contentCheckInfo + ", c2paResultJson=" + this.c2paResultJson + ", allowComment=" + this.allowComment + ", fingerprintId=" + this.fingerprintId + ", gcMarkContentProducerList=" + this.gcMarkContentProducerList + ", isIPTCMetadataExist=" + this.isIPTCMetadataExist + ", iptcTypeList=" + this.iptcTypeList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.allowCreateSticker);
        parcel.writeInt(this.allowShareToStory);
        parcel.writeInt(this.contentReusePermission);
        parcel.writeInt(this.allowAIRemix);
        parcel.writeInt(this.isSubscribeOnly ? 1 : 0);
        CMPreviewInfo cMPreviewInfo = this.cmPreviewInfo;
        if (cMPreviewInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cMPreviewInfo.writeToParcel(parcel, i);
        }
        this.aigcInfo.writeToParcel(parcel, i);
        parcel.writeInt(this.allowVisualSearch ? 1 : 0);
        this.contentCheckInfo.writeToParcel(parcel, i);
        parcel.writeString(this.c2paResultJson);
        parcel.writeInt(this.allowComment);
        parcel.writeString(this.fingerprintId);
        parcel.writeStringList(this.gcMarkContentProducerList);
        parcel.writeInt(this.isIPTCMetadataExist ? 1 : 0);
        parcel.writeStringList(this.iptcTypeList);
    }

    public PrivacySettingModel(int i, int i2, int i3, int i4, boolean z, CMPreviewInfo cMPreviewInfo, AIGCInfo aIGCInfo, boolean z2, ContentCheckInfo contentCheckInfo, String str, int i5, String str2, List<String> list, boolean z3, List<String> list2) {
        this.allowCreateSticker = i;
        this.allowShareToStory = i2;
        this.contentReusePermission = i3;
        this.allowAIRemix = i4;
        this.isSubscribeOnly = z;
        this.cmPreviewInfo = cMPreviewInfo;
        this.aigcInfo = aIGCInfo;
        this.allowVisualSearch = z2;
        this.contentCheckInfo = contentCheckInfo;
        this.c2paResultJson = str;
        this.allowComment = i5;
        this.fingerprintId = str2;
        this.gcMarkContentProducerList = list;
        this.isIPTCMetadataExist = z3;
        this.iptcTypeList = list2;
    }
}
