package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.GroupShotDataModel;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class DMCameraModel implements Parcelable {
    public static final Parcelable.Creator<DMCameraModel> CREATOR = new Parcelable.Creator<DMCameraModel>() { // from class: X.0mg7
        @Override // android.os.Parcelable.Creator
        public final DMCameraModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            Boolean boolValueOf;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            Long lValueOf;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            boolean z10;
            boolean z11;
            boolean z12;
            GroupShotDataModel groupShotDataModelCreateFromParcel;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
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
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolValueOf = Boolean.valueOf(z5);
            }
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i2 = parcel.readInt();
            String string4 = parcel.readString();
            int i3 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
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
            TextStickerModel textStickerModel = (TextStickerModel) parcel.readParcelable(DMCameraModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i4 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i6 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
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
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (parcel.readInt() == 0) {
                groupShotDataModelCreateFromParcel = null;
            } else {
                groupShotDataModelCreateFromParcel = GroupShotDataModel.CREATOR.createFromParcel(parcel);
            }
            GroupShotDataModel groupShotDataModel = groupShotDataModelCreateFromParcel;
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            String string13 = parcel.readString();
            if (parcel.readInt() != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (parcel.readInt() != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            String string14 = parcel.readString();
            ReferenceInfo referenceInfo = (ReferenceInfo) parcel.readParcelable(DMCameraModel.class.getClassLoader());
            QuoteMode quoteMode = (QuoteMode) parcel.readParcelable(DMCameraModel.class.getClassLoader());
            long j = parcel.readLong();
            if (parcel.readInt() != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            return new DMCameraModel(z, string, string2, z2, z3, z4, string3, boolValueOf, i, z6, i2, string4, i3, string5, string6, z7, z8, textStickerModel, z9, lValueOf, linkedHashMap, linkedHashMap2, string7, string8, string9, string10, z10, z11, z12, groupShotDataModel, string11, string12, z13, string13, z14, z15, string14, referenceInfo, quoteMode, j, z16, (BaseHeaderComponent) parcel.readParcelable(DMCameraModel.class.getClassLoader()), (FeatureAttachmentData) parcel.readParcelable(DMCameraModel.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DMCameraModel[] newArray(int i) {
            return new DMCameraModel[i];
        }
    };

    @C040H
    public BaseHeaderComponent baseHeaderComponent;

    @C09CT("chat_type")
    public int chatType;

    @C09CT("disable_record_duration_selection")
    public boolean disableRecordDurationSelection;

    @C040H
    public String effectHandlerType;

    @C040H
    public String effectHandlerTypeActive;

    @C09CT("effect_icon_url")
    public String effectIconUrl;

    @C09CT("effect_name")
    public String effectName;

    @C09CT("effectTriggerMsgSentServerTime")
    public Long effectTriggerMsgSentServerTime;

    @C09CT("enable_group_shot")
    public boolean enableGroupShot;

    @C09CT("enable_photo_swap")
    public boolean enablePhotoSwap;

    @C09CT("enable_playground")
    public boolean enablePlayground;

    @C09CT("enableTextStickerOnRecord")
    public boolean enableTextStickerOnRecord;

    @C09CT("enterDM")
    public String enterDM;

    @C09CT("enterDMWay")
    public String enterDMWay;

    @C09CT("enterFromDM")
    public boolean enterFromDM;

    @C09CT("enter_method")
    public String enterMethod;

    @C09CT("enterMethodDM")
    public String enterMethodDM;

    @C09CT("enter_method_type")
    public String enterMethodType;

    @C040H
    public FeatureAttachmentData featureAttachmentData;

    @C09CT("fetch_group_effects_for_ai_group_shot")
    public boolean fetchGroupEffectForAIGroupShot;

    @C09CT("fontData")
    public TextStickerModel fontData;

    @C09CT("group_shot_data_model")
    public GroupShotDataModel groupShotData;

    @C09CT("hasReportedFirstCrossClick")
    public boolean hasReportedFirstCrossClick;

    @C09CT("initial_effect_id")
    public String initialEffectId;

    @C09CT("isBulletin")
    public boolean isBulletin;

    @C09CT("is_from_effect_button")
    public boolean isFromEffectButton;

    @C09CT("is_story_quick_immersive_reply")
    public boolean isStoryQuickImmersiveReply;

    @C09CT("is_video")
    public Boolean isVideo;

    @C09CT("max_record_duration_ms")
    public long maxRecordDurationMs;

    @C09CT("maxSelectableVideoDuration")
    public int maxSelectableVideoDuration;

    @C09CT("openCameraOrAlbumMobMap")
    public Map<String, String> openCameraOrAlbumMobMap;

    @C09CT("openCameraOrAlbumMobMapV2")
    public Map<String, String> openCameraOrAlbumMobMapV2;

    @C09CT("photo_swap_paired_msg_id")
    public String photoSwapPairedMsgId;

    @C09CT("photo_swap_scene")
    public String photoSwapScene;

    @C040H
    public QuoteMode quoteMode;

    @C09CT("receiverNickname")
    public String receiverNickname;

    @C09CT("reference_info")
    public ReferenceInfo referenceInfo;

    @C09CT("search_session_id")
    public String searchSessionId;

    @C09CT("session_id")
    public String sessionID;

    @C09CT("showShootingRecordGuide")
    public boolean shouldDisplayRecordGuide;

    @C09CT("showShootingRestrictSharingFlag")
    public boolean shouldDisplayRestrictSharingNoticeShooting;

    @C040H
    public boolean shouldDisplayTnsNoticeAlbum;

    @C09CT("showShootingTNSFlag")
    public boolean shouldDisplayTnsNoticeShooting;

    @C040H
    public int tnsNoticeRes;

    @C09CT("to_user_id")
    public String toUserId;

    public DMCameraModel() {
        this(false, null, "", false, false, false, "", null, -1, false, 0, "", -1, "", "", false, false, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, true, false, "", null, null, 0L, false, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enterFromDM ? 1 : 0);
        parcel.writeString(this.enterMethodDM);
        parcel.writeString(this.enterDM);
        parcel.writeInt(this.shouldDisplayRestrictSharingNoticeShooting ? 1 : 0);
        parcel.writeInt(this.shouldDisplayTnsNoticeShooting ? 1 : 0);
        parcel.writeInt(this.shouldDisplayRecordGuide ? 1 : 0);
        parcel.writeString(this.receiverNickname);
        Boolean bool = this.isVideo;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.maxSelectableVideoDuration);
        parcel.writeInt(this.shouldDisplayTnsNoticeAlbum ? 1 : 0);
        parcel.writeInt(this.tnsNoticeRes);
        parcel.writeString(this.sessionID);
        parcel.writeInt(this.chatType);
        parcel.writeString(this.effectName);
        parcel.writeString(this.effectIconUrl);
        parcel.writeInt(this.hasReportedFirstCrossClick ? 1 : 0);
        parcel.writeInt(this.isBulletin ? 1 : 0);
        parcel.writeParcelable(this.fontData, i);
        parcel.writeInt(this.enableTextStickerOnRecord ? 1 : 0);
        Long l = this.effectTriggerMsgSentServerTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Map<String, String> map = this.openCameraOrAlbumMobMap;
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
        Map<String, String> map2 = this.openCameraOrAlbumMobMapV2;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
        parcel.writeString(this.photoSwapScene);
        parcel.writeString(this.photoSwapPairedMsgId);
        parcel.writeString(this.enterMethodType);
        parcel.writeString(this.enterMethod);
        parcel.writeInt(this.enablePhotoSwap ? 1 : 0);
        parcel.writeInt(this.enableGroupShot ? 1 : 0);
        parcel.writeInt(this.enablePlayground ? 1 : 0);
        GroupShotDataModel groupShotDataModel = this.groupShotData;
        if (groupShotDataModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupShotDataModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.toUserId);
        parcel.writeString(this.searchSessionId);
        parcel.writeInt(this.isFromEffectButton ? 1 : 0);
        parcel.writeString(this.initialEffectId);
        parcel.writeInt(this.fetchGroupEffectForAIGroupShot ? 1 : 0);
        parcel.writeInt(this.isStoryQuickImmersiveReply ? 1 : 0);
        parcel.writeString(this.enterDMWay);
        parcel.writeParcelable(this.referenceInfo, i);
        parcel.writeParcelable(this.quoteMode, i);
        parcel.writeLong(this.maxRecordDurationMs);
        parcel.writeInt(this.disableRecordDurationSelection ? 1 : 0);
        parcel.writeParcelable(this.baseHeaderComponent, i);
        parcel.writeParcelable(this.featureAttachmentData, i);
        parcel.writeString(this.effectHandlerType);
        parcel.writeString(this.effectHandlerTypeActive);
    }

    public DMCameraModel(boolean z, String str, String str2, boolean z2, boolean z3, boolean z4, String str3, Boolean bool, int i, boolean z5, int i2, String str4, int i3, String str5, String str6, boolean z6, boolean z7, TextStickerModel textStickerModel, boolean z8, Long l, Map<String, String> map, Map<String, String> map2, String str7, String str8, String str9, String str10, boolean z9, boolean z10, boolean z11, GroupShotDataModel groupShotDataModel, String str11, String str12, boolean z12, String str13, boolean z13, boolean z14, String str14, ReferenceInfo referenceInfo, QuoteMode quoteMode, long j, boolean z15, BaseHeaderComponent baseHeaderComponent, FeatureAttachmentData featureAttachmentData, String str15, String str16) {
        this.enterFromDM = z;
        this.enterMethodDM = str;
        this.enterDM = str2;
        this.shouldDisplayRestrictSharingNoticeShooting = z2;
        this.shouldDisplayTnsNoticeShooting = z3;
        this.shouldDisplayRecordGuide = z4;
        this.receiverNickname = str3;
        this.isVideo = bool;
        this.maxSelectableVideoDuration = i;
        this.shouldDisplayTnsNoticeAlbum = z5;
        this.tnsNoticeRes = i2;
        this.sessionID = str4;
        this.chatType = i3;
        this.effectName = str5;
        this.effectIconUrl = str6;
        this.hasReportedFirstCrossClick = z6;
        this.isBulletin = z7;
        this.fontData = textStickerModel;
        this.enableTextStickerOnRecord = z8;
        this.effectTriggerMsgSentServerTime = l;
        this.openCameraOrAlbumMobMap = map;
        this.openCameraOrAlbumMobMapV2 = map2;
        this.photoSwapScene = str7;
        this.photoSwapPairedMsgId = str8;
        this.enterMethodType = str9;
        this.enterMethod = str10;
        this.enablePhotoSwap = z9;
        this.enableGroupShot = z10;
        this.enablePlayground = z11;
        this.groupShotData = groupShotDataModel;
        this.toUserId = str11;
        this.searchSessionId = str12;
        this.isFromEffectButton = z12;
        this.initialEffectId = str13;
        this.fetchGroupEffectForAIGroupShot = z13;
        this.isStoryQuickImmersiveReply = z14;
        this.enterDMWay = str14;
        this.referenceInfo = referenceInfo;
        this.quoteMode = quoteMode;
        this.maxRecordDurationMs = j;
        this.disableRecordDurationSelection = z15;
        this.baseHeaderComponent = baseHeaderComponent;
        this.featureAttachmentData = featureAttachmentData;
        this.effectHandlerType = str15;
        this.effectHandlerTypeActive = str16;
    }
}
