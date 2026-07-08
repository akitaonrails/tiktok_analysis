package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C13BV;
import X.C544630LXp;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCInputItem;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCOfflineModel implements Parcelable {

    @C09CT("ai_prop_model_name")
    public String aiPropModelName;

    @C09CT("ai_prop_type")
    public String aiPropType;

    @C09CT("aigc_interaction_type")
    public String aigcInteractionType;

    @C09CT("client_task_id")
    public String clientTaskId;

    @C09CT("creation_id")
    public String creationId;

    @C09CT("effect_source")
    public String effectSource;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("enter_method")
    public String enterMethod;

    @C09CT("error_code")
    public int errorCode;

    @C09CT("error_msg")
    public String errorMsg;

    @C09CT("estimated_waiting_time")
    public int estimatedWaitingTime;

    @C09CT("icon_url")
    public String iconUrl;

    @C09CT("img_uri_list")
    public List<String> imgUriList;

    @C09CT("input_items")
    public List<AIGCInputItem> inputItems;

    @C09CT("is_aigc_effect_active")
    public int isAIGCEffectActive;

    @C09CT("is_ai_prop")
    public String isAiProp;

    @C09CT("is_async")
    public String isAsync;

    @C09CT("is_attach_countdown")
    public final boolean isAttachCountdownEffect;

    @C09CT("is_countdown_video_present")
    public final boolean isCountDownVideoPresent;

    @C09CT("is_creator_preview")
    public boolean isCreatorPreview;

    @C09CT("is_default_prop")
    public String isDefaultProp;

    @C040H
    public boolean isOfflineAIGCEffectEnabled;

    @C09CT("is_offline_aigc_effect_generated")
    public boolean isOfflineAIGCEffectGenerated;

    @C040H
    public boolean isOfflineAIGCEffectGenerating;

    @C09CT("is_offline_loading")
    public int isOfflineLoading;

    @C09CT("is_regenerate")
    public final boolean isRegenerate;

    @C09CT("job_type")
    public String jobType;

    @C09CT("prepare_stage_waiting_time")
    public int prepareStageWaitingTime;

    @C09CT("prop_id")
    public String propId;

    @C09CT("prop_impr_position")
    public String propImprPosition;

    @C09CT("prop_name")
    public String propName;

    @C09CT("prop_selected_from")
    public String propSelectedFrom;

    @C09CT("req_json")
    public String reqJson;

    @C09CT("req_key")
    public String reqKey;

    @C09CT("resource_id")
    public String resourceId;

    @C09CT("resource_key")
    public String resourceKey;

    @C040H
    public final MediaModel resultFileMediaModel;

    @C09CT("server_log_id")
    public String serverLogId;

    @C09CT("server_task_id")
    public String serverTaskId;

    @C09CT("shoot_tab_name")
    public String shootTabName;

    @C09CT("shoot_way")
    public String shootWay;

    @C09CT("sticker_info")
    public StickerInfo stickerInfo;

    @C09CT("style_id")
    public String styleId;

    @C09CT("sub_ai_prop_type")
    public String subAiPropType;

    @C09CT("tab_key")
    public String tabKey;

    @C09CT("task_created_at")
    public long taskCreatedAt;

    @C09CT("task_type")
    public String taskType;

    @C09CT("template_resource_id")
    public String templateResourceId;

    @C09CT("template_type")
    public int templateType;

    @C09CT("workflow")
    public String workflow;
    public static final C544630LXp Companion = new Object() { // from class: X.0LXp
    };
    public static final Parcelable.Creator<AIGCOfflineModel> CREATOR = new Parcelable.Creator<AIGCOfflineModel>() { // from class: X.0LLr
        @Override // android.os.Parcelable.Creator
        public final AIGCOfflineModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            ArrayList arrayList;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
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
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AIGCInputItem.CREATOR.createFromParcel(parcel));
                }
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            StickerInfo stickerInfo = (StickerInfo) parcel.readSerializable();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            long j = parcel.readLong();
            int i5 = parcel.readInt();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            int i6 = parcel.readInt();
            String string29 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String string30 = parcel.readString();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            MediaModel mediaModel = (MediaModel) parcel.readParcelable(AIGCOfflineModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new AIGCOfflineModel(z, z2, z3, arrayListCreateStringArrayList, arrayList, string, string2, string3, i3, i4, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, stickerInfo, string25, string26, j, i5, string27, string28, i6, string29, z4, string30, z5, z6, mediaModel, z7, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCOfflineModel[] newArray(int i) {
            return new AIGCOfflineModel[i];
        }
    };

    public AIGCOfflineModel() {
        this(false, false, false, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0, null, null, 0, null, false, null, false, false, null, false, 0, null, null, 0, -1, 262143, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCOfflineModel)) {
            return false;
        }
        AIGCOfflineModel aIGCOfflineModel = (AIGCOfflineModel) obj;
        return this.isOfflineAIGCEffectEnabled == aIGCOfflineModel.isOfflineAIGCEffectEnabled && this.isOfflineAIGCEffectGenerating == aIGCOfflineModel.isOfflineAIGCEffectGenerating && this.isOfflineAIGCEffectGenerated == aIGCOfflineModel.isOfflineAIGCEffectGenerated && Intrinsics.LJFF(this.imgUriList, aIGCOfflineModel.imgUriList) && Intrinsics.LJFF(this.inputItems, aIGCOfflineModel.inputItems) && Intrinsics.LJFF(this.taskType, aIGCOfflineModel.taskType) && Intrinsics.LJFF(this.jobType, aIGCOfflineModel.jobType) && Intrinsics.LJFF(this.aigcInteractionType, aIGCOfflineModel.aigcInteractionType) && this.isOfflineLoading == aIGCOfflineModel.isOfflineLoading && this.estimatedWaitingTime == aIGCOfflineModel.estimatedWaitingTime && Intrinsics.LJFF(this.reqKey, aIGCOfflineModel.reqKey) && Intrinsics.LJFF(this.reqJson, aIGCOfflineModel.reqJson) && Intrinsics.LJFF(this.enterMethod, aIGCOfflineModel.enterMethod) && Intrinsics.LJFF(this.enterFrom, aIGCOfflineModel.enterFrom) && Intrinsics.LJFF(this.tabKey, aIGCOfflineModel.tabKey) && Intrinsics.LJFF(this.propSelectedFrom, aIGCOfflineModel.propSelectedFrom) && Intrinsics.LJFF(this.shootWay, aIGCOfflineModel.shootWay) && Intrinsics.LJFF(this.isDefaultProp, aIGCOfflineModel.isDefaultProp) && Intrinsics.LJFF(this.propId, aIGCOfflineModel.propId) && Intrinsics.LJFF(this.styleId, aIGCOfflineModel.styleId) && Intrinsics.LJFF(this.propName, aIGCOfflineModel.propName) && Intrinsics.LJFF(this.iconUrl, aIGCOfflineModel.iconUrl) && Intrinsics.LJFF(this.resourceId, aIGCOfflineModel.resourceId) && Intrinsics.LJFF(this.effectSource, aIGCOfflineModel.effectSource) && Intrinsics.LJFF(this.isAiProp, aIGCOfflineModel.isAiProp) && Intrinsics.LJFF(this.aiPropType, aIGCOfflineModel.aiPropType) && Intrinsics.LJFF(this.isAsync, aIGCOfflineModel.isAsync) && Intrinsics.LJFF(this.subAiPropType, aIGCOfflineModel.subAiPropType) && Intrinsics.LJFF(this.aiPropModelName, aIGCOfflineModel.aiPropModelName) && Intrinsics.LJFF(this.propImprPosition, aIGCOfflineModel.propImprPosition) && Intrinsics.LJFF(this.shootTabName, aIGCOfflineModel.shootTabName) && Intrinsics.LJFF(this.stickerInfo, aIGCOfflineModel.stickerInfo) && Intrinsics.LJFF(this.serverTaskId, aIGCOfflineModel.serverTaskId) && Intrinsics.LJFF(this.clientTaskId, aIGCOfflineModel.clientTaskId) && this.taskCreatedAt == aIGCOfflineModel.taskCreatedAt && this.errorCode == aIGCOfflineModel.errorCode && Intrinsics.LJFF(this.errorMsg, aIGCOfflineModel.errorMsg) && Intrinsics.LJFF(this.serverLogId, aIGCOfflineModel.serverLogId) && this.templateType == aIGCOfflineModel.templateType && Intrinsics.LJFF(this.templateResourceId, aIGCOfflineModel.templateResourceId) && this.isCreatorPreview == aIGCOfflineModel.isCreatorPreview && Intrinsics.LJFF(this.workflow, aIGCOfflineModel.workflow) && this.isAttachCountdownEffect == aIGCOfflineModel.isAttachCountdownEffect && this.isCountDownVideoPresent == aIGCOfflineModel.isCountDownVideoPresent && Intrinsics.LJFF(this.resultFileMediaModel, aIGCOfflineModel.resultFileMediaModel) && this.isRegenerate == aIGCOfflineModel.isRegenerate && this.prepareStageWaitingTime == aIGCOfflineModel.prepareStageWaitingTime && Intrinsics.LJFF(this.resourceKey, aIGCOfflineModel.resourceKey) && Intrinsics.LJFF(this.creationId, aIGCOfflineModel.creationId) && this.isAIGCEffectActive == aIGCOfflineModel.isAIGCEffectActive;
    }

    public final int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.isOfflineAIGCEffectEnabled) * 31) + C786410Ut5.Z2(this.isOfflineAIGCEffectGenerating)) * 31) + C786410Ut5.Z2(this.isOfflineAIGCEffectGenerated)) * 31) + this.imgUriList.hashCode()) * 31;
        List<AIGCInputItem> list = this.inputItems;
        int iHashCode = (iZ2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.taskType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.jobType;
        int iHashCode3 = (((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.aigcInteractionType.hashCode()) * 31) + this.isOfflineLoading) * 31) + this.estimatedWaitingTime) * 31) + this.reqKey.hashCode()) * 31) + this.reqJson.hashCode()) * 31) + this.enterMethod.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + this.tabKey.hashCode()) * 31) + this.propSelectedFrom.hashCode()) * 31) + this.shootWay.hashCode()) * 31) + this.isDefaultProp.hashCode()) * 31) + this.propId.hashCode()) * 31) + this.styleId.hashCode()) * 31) + this.propName.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.resourceId.hashCode()) * 31) + this.effectSource.hashCode()) * 31) + this.isAiProp.hashCode()) * 31) + this.aiPropType.hashCode()) * 31) + this.isAsync.hashCode()) * 31) + this.subAiPropType.hashCode()) * 31) + this.aiPropModelName.hashCode()) * 31) + this.propImprPosition.hashCode()) * 31) + this.shootTabName.hashCode()) * 31;
        StickerInfo stickerInfo = this.stickerInfo;
        int iHashCode4 = (((((((((((((((((((((((((iHashCode3 + (stickerInfo == null ? 0 : stickerInfo.hashCode())) * 31) + this.serverTaskId.hashCode()) * 31) + this.clientTaskId.hashCode()) * 31) + C786410Ut5.Y2(this.taskCreatedAt)) * 31) + this.errorCode) * 31) + this.errorMsg.hashCode()) * 31) + this.serverLogId.hashCode()) * 31) + this.templateType) * 31) + this.templateResourceId.hashCode()) * 31) + C786410Ut5.Z2(this.isCreatorPreview)) * 31) + this.workflow.hashCode()) * 31) + C786410Ut5.Z2(this.isAttachCountdownEffect)) * 31) + C786410Ut5.Z2(this.isCountDownVideoPresent)) * 31;
        MediaModel mediaModel = this.resultFileMediaModel;
        return ((((((((((iHashCode4 + (mediaModel != null ? mediaModel.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isRegenerate)) * 31) + this.prepareStageWaitingTime) * 31) + this.resourceKey.hashCode()) * 31) + this.creationId.hashCode()) * 31) + this.isAIGCEffectActive;
    }

    public final String toString() {
        return "AIGCOfflineModel(isOfflineAIGCEffectEnabled=" + this.isOfflineAIGCEffectEnabled + ", isOfflineAIGCEffectGenerating=" + this.isOfflineAIGCEffectGenerating + ", isOfflineAIGCEffectGenerated=" + this.isOfflineAIGCEffectGenerated + ", imgUriList=" + this.imgUriList + ", inputItems=" + this.inputItems + ", taskType=" + this.taskType + ", jobType=" + this.jobType + ", aigcInteractionType=" + this.aigcInteractionType + ", isOfflineLoading=" + this.isOfflineLoading + ", estimatedWaitingTime=" + this.estimatedWaitingTime + ", reqKey=" + this.reqKey + ", reqJson=" + this.reqJson + ", enterMethod=" + this.enterMethod + ", enterFrom=" + this.enterFrom + ", tabKey=" + this.tabKey + ", propSelectedFrom=" + this.propSelectedFrom + ", shootWay=" + this.shootWay + ", isDefaultProp=" + this.isDefaultProp + ", propId=" + this.propId + ", styleId=" + this.styleId + ", propName=" + this.propName + ", iconUrl=" + this.iconUrl + ", resourceId=" + this.resourceId + ", effectSource=" + this.effectSource + ", isAiProp=" + this.isAiProp + ", aiPropType=" + this.aiPropType + ", isAsync=" + this.isAsync + ", subAiPropType=" + this.subAiPropType + ", aiPropModelName=" + this.aiPropModelName + ", propImprPosition=" + this.propImprPosition + ", shootTabName=" + this.shootTabName + ", stickerInfo=" + this.stickerInfo + ", serverTaskId=" + this.serverTaskId + ", clientTaskId=" + this.clientTaskId + ", taskCreatedAt=" + this.taskCreatedAt + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ", serverLogId=" + this.serverLogId + ", templateType=" + this.templateType + ", templateResourceId=" + this.templateResourceId + ", isCreatorPreview=" + this.isCreatorPreview + ", workflow=" + this.workflow + ", isAttachCountdownEffect=" + this.isAttachCountdownEffect + ", isCountDownVideoPresent=" + this.isCountDownVideoPresent + ", resultFileMediaModel=" + this.resultFileMediaModel + ", isRegenerate=" + this.isRegenerate + ", prepareStageWaitingTime=" + this.prepareStageWaitingTime + ", resourceKey=" + this.resourceKey + ", creationId=" + this.creationId + ", isAIGCEffectActive=" + this.isAIGCEffectActive + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isOfflineAIGCEffectEnabled ? 1 : 0);
        parcel.writeInt(this.isOfflineAIGCEffectGenerating ? 1 : 0);
        parcel.writeInt(this.isOfflineAIGCEffectGenerated ? 1 : 0);
        parcel.writeStringList(this.imgUriList);
        List<AIGCInputItem> list = this.inputItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AIGCInputItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.taskType);
        parcel.writeString(this.jobType);
        parcel.writeString(this.aigcInteractionType);
        parcel.writeInt(this.isOfflineLoading);
        parcel.writeInt(this.estimatedWaitingTime);
        parcel.writeString(this.reqKey);
        parcel.writeString(this.reqJson);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.tabKey);
        parcel.writeString(this.propSelectedFrom);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.isDefaultProp);
        parcel.writeString(this.propId);
        parcel.writeString(this.styleId);
        parcel.writeString(this.propName);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.resourceId);
        parcel.writeString(this.effectSource);
        parcel.writeString(this.isAiProp);
        parcel.writeString(this.aiPropType);
        parcel.writeString(this.isAsync);
        parcel.writeString(this.subAiPropType);
        parcel.writeString(this.aiPropModelName);
        parcel.writeString(this.propImprPosition);
        parcel.writeString(this.shootTabName);
        parcel.writeSerializable(this.stickerInfo);
        parcel.writeString(this.serverTaskId);
        parcel.writeString(this.clientTaskId);
        parcel.writeLong(this.taskCreatedAt);
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMsg);
        parcel.writeString(this.serverLogId);
        parcel.writeInt(this.templateType);
        parcel.writeString(this.templateResourceId);
        parcel.writeInt(this.isCreatorPreview ? 1 : 0);
        parcel.writeString(this.workflow);
        parcel.writeInt(this.isAttachCountdownEffect ? 1 : 0);
        parcel.writeInt(this.isCountDownVideoPresent ? 1 : 0);
        parcel.writeParcelable(this.resultFileMediaModel, i);
        parcel.writeInt(this.isRegenerate ? 1 : 0);
        parcel.writeInt(this.prepareStageWaitingTime);
        parcel.writeString(this.resourceKey);
        parcel.writeString(this.creationId);
        parcel.writeInt(this.isAIGCEffectActive);
    }

    public final boolean LIZIZ(boolean z) {
        if (z && this.isAIGCEffectActive == 2) {
            return false;
        }
        return Intrinsics.LJFF(this.isAiProp, "1");
    }

    public static AIGCOfflineModel LIZ(AIGCOfflineModel aIGCOfflineModel, boolean z, boolean z2, boolean z3, List list, List list2, String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z4, boolean z5, MediaModel mediaModel, boolean z6, String str10, int i3, int i4) {
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        StickerInfo stickerInfo;
        String str27;
        long j;
        int i5;
        String str28;
        String str29;
        int i6;
        String str30;
        boolean z7;
        String str31;
        int i7;
        int i8;
        String str32;
        int i9;
        boolean z8 = z5;
        boolean z9 = z4;
        boolean z10 = z;
        String str33 = str8;
        String str34 = str7;
        int i10 = i2;
        int i11 = i;
        String str35 = str9;
        String str36 = str2;
        String str37 = str;
        String str38 = str6;
        List list3 = list2;
        List list4 = list;
        boolean z11 = z6;
        String str39 = str4;
        boolean z12 = z3;
        MediaModel mediaModel2 = mediaModel;
        String str40 = str3;
        boolean z13 = z2;
        String str41 = str10;
        String str42 = str5;
        if ((i3 & 1) != 0) {
            z10 = aIGCOfflineModel.isOfflineAIGCEffectEnabled;
        }
        if ((i3 & 2) != 0) {
            z13 = aIGCOfflineModel.isOfflineAIGCEffectGenerating;
        }
        if ((i3 & 4) != 0) {
            z12 = aIGCOfflineModel.isOfflineAIGCEffectGenerated;
        }
        if ((i3 & 8) != 0) {
            list4 = aIGCOfflineModel.imgUriList;
        }
        if ((i3 & 16) != 0) {
            list3 = aIGCOfflineModel.inputItems;
        }
        if ((i3 & 32) != 0) {
            str37 = aIGCOfflineModel.taskType;
        }
        if ((i3 & 64) != 0) {
            str11 = aIGCOfflineModel.jobType;
        } else {
            str11 = null;
        }
        if ((i3 & 128) != 0) {
            str36 = aIGCOfflineModel.aigcInteractionType;
        }
        if ((i3 & 256) != 0) {
            i11 = aIGCOfflineModel.isOfflineLoading;
        }
        if ((i3 & 512) != 0) {
            i10 = aIGCOfflineModel.estimatedWaitingTime;
        }
        if ((i3 & 1024) != 0) {
            str12 = aIGCOfflineModel.reqKey;
        } else {
            str12 = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str13 = aIGCOfflineModel.reqJson;
        } else {
            str13 = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str40 = aIGCOfflineModel.enterMethod;
        }
        if ((i3 & 8192) != 0) {
            str39 = aIGCOfflineModel.enterFrom;
        }
        if ((i3 & 16384) != 0) {
            str14 = aIGCOfflineModel.tabKey;
        } else {
            str14 = null;
        }
        if ((32768 & i3) != 0) {
            str42 = aIGCOfflineModel.propSelectedFrom;
        }
        if ((65536 & i3) != 0) {
            str15 = aIGCOfflineModel.shootWay;
        } else {
            str15 = null;
        }
        if ((131072 & i3) != 0) {
            str16 = aIGCOfflineModel.isDefaultProp;
        } else {
            str16 = null;
        }
        if ((262144 & i3) != 0) {
            str38 = aIGCOfflineModel.propId;
        }
        if ((524288 & i3) != 0) {
            str17 = aIGCOfflineModel.styleId;
        } else {
            str17 = null;
        }
        if ((1048576 & i3) != 0) {
            str18 = aIGCOfflineModel.propName;
        } else {
            str18 = null;
        }
        if ((2097152 & i3) != 0) {
            str19 = aIGCOfflineModel.iconUrl;
        } else {
            str19 = null;
        }
        if ((4194304 & i3) != 0) {
            str34 = aIGCOfflineModel.resourceId;
        }
        if ((8388608 & i3) != 0) {
            str20 = aIGCOfflineModel.effectSource;
        } else {
            str20 = null;
        }
        if ((16777216 & i3) != 0) {
            str21 = aIGCOfflineModel.isAiProp;
        } else {
            str21 = null;
        }
        if ((33554432 & i3) != 0) {
            str22 = aIGCOfflineModel.aiPropType;
        } else {
            str22 = null;
        }
        if ((67108864 & i3) != 0) {
            str23 = aIGCOfflineModel.isAsync;
        } else {
            str23 = null;
        }
        if ((134217728 & i3) != 0) {
            str33 = aIGCOfflineModel.subAiPropType;
        }
        if ((268435456 & i3) != 0) {
            str24 = aIGCOfflineModel.aiPropModelName;
        } else {
            str24 = null;
        }
        if ((536870912 & i3) != 0) {
            str25 = aIGCOfflineModel.propImprPosition;
        } else {
            str25 = null;
        }
        if ((1073741824 & i3) != 0) {
            str26 = aIGCOfflineModel.shootTabName;
        } else {
            str26 = null;
        }
        if ((i3 & Integer.MIN_VALUE) != 0) {
            stickerInfo = aIGCOfflineModel.stickerInfo;
        } else {
            stickerInfo = null;
        }
        if ((i4 & 1) != 0) {
            str35 = aIGCOfflineModel.serverTaskId;
        }
        if ((i4 & 2) != 0) {
            str27 = aIGCOfflineModel.clientTaskId;
        } else {
            str27 = null;
        }
        if ((i4 & 4) != 0) {
            j = aIGCOfflineModel.taskCreatedAt;
        } else {
            j = 0;
        }
        if ((i4 & 8) != 0) {
            i5 = aIGCOfflineModel.errorCode;
        } else {
            i5 = 0;
        }
        if ((i4 & 16) != 0) {
            str28 = aIGCOfflineModel.errorMsg;
        } else {
            str28 = null;
        }
        if ((i4 & 32) != 0) {
            str29 = aIGCOfflineModel.serverLogId;
        } else {
            str29 = null;
        }
        if ((i4 & 64) != 0) {
            i6 = aIGCOfflineModel.templateType;
        } else {
            i6 = 0;
        }
        if ((i4 & 128) != 0) {
            str30 = aIGCOfflineModel.templateResourceId;
        } else {
            str30 = null;
        }
        if ((i4 & 256) != 0) {
            z7 = aIGCOfflineModel.isCreatorPreview;
        } else {
            z7 = false;
        }
        if ((i4 & 512) != 0) {
            str31 = aIGCOfflineModel.workflow;
        } else {
            str31 = null;
        }
        if ((i4 & 1024) != 0) {
            z9 = aIGCOfflineModel.isAttachCountdownEffect;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z8 = aIGCOfflineModel.isCountDownVideoPresent;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            mediaModel2 = aIGCOfflineModel.resultFileMediaModel;
        }
        if ((i4 & 8192) != 0) {
            z11 = aIGCOfflineModel.isRegenerate;
        }
        if ((i4 & 16384) != 0) {
            i7 = aIGCOfflineModel.prepareStageWaitingTime;
        } else {
            i7 = 0;
        }
        if ((32768 & i4) != 0) {
            str41 = aIGCOfflineModel.resourceKey;
        }
        if ((65536 & i4) != 0) {
            str32 = aIGCOfflineModel.creationId;
            i8 = 131072;
        } else {
            i8 = 131072;
            str32 = null;
        }
        if ((i8 & i4) != 0) {
            i9 = aIGCOfflineModel.isAIGCEffectActive;
        } else {
            i9 = 0;
        }
        aIGCOfflineModel.getClass();
        return new AIGCOfflineModel(z10, z13, z12, list4, list3, str37, str11, str36, i11, i10, str12, str13, str40, str39, str14, str42, str15, str16, str38, str17, str18, str19, str34, str20, str21, str22, str23, str33, str24, str25, str26, stickerInfo, str35, str27, j, i5, str28, str29, i6, str30, z7, str31, z9, z8, mediaModel2, z11, i7, str41, str32, i9);
    }

    public AIGCOfflineModel(boolean z, boolean z2, boolean z3, List<String> list, List<AIGCInputItem> list2, String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, StickerInfo stickerInfo, String str25, String str26, long j, int i3, String str27, String str28, int i4, String str29, boolean z4, String str30, boolean z5, boolean z6, MediaModel mediaModel, boolean z7, int i5, String str31, String str32, int i6) {
        this.isOfflineAIGCEffectEnabled = z;
        this.isOfflineAIGCEffectGenerating = z2;
        this.isOfflineAIGCEffectGenerated = z3;
        this.imgUriList = list;
        this.inputItems = list2;
        this.taskType = str;
        this.jobType = str2;
        this.aigcInteractionType = str3;
        this.isOfflineLoading = i;
        this.estimatedWaitingTime = i2;
        this.reqKey = str4;
        this.reqJson = str5;
        this.enterMethod = str6;
        this.enterFrom = str7;
        this.tabKey = str8;
        this.propSelectedFrom = str9;
        this.shootWay = str10;
        this.isDefaultProp = str11;
        this.propId = str12;
        this.styleId = str13;
        this.propName = str14;
        this.iconUrl = str15;
        this.resourceId = str16;
        this.effectSource = str17;
        this.isAiProp = str18;
        this.aiPropType = str19;
        this.isAsync = str20;
        this.subAiPropType = str21;
        this.aiPropModelName = str22;
        this.propImprPosition = str23;
        this.shootTabName = str24;
        this.stickerInfo = stickerInfo;
        this.serverTaskId = str25;
        this.clientTaskId = str26;
        this.taskCreatedAt = j;
        this.errorCode = i3;
        this.errorMsg = str27;
        this.serverLogId = str28;
        this.templateType = i4;
        this.templateResourceId = str29;
        this.isCreatorPreview = z4;
        this.workflow = str30;
        this.isAttachCountdownEffect = z5;
        this.isCountDownVideoPresent = z6;
        this.resultFileMediaModel = mediaModel;
        this.isRegenerate = z7;
        this.prepareStageWaitingTime = i5;
        this.resourceKey = str31;
        this.creationId = str32;
        this.isAIGCEffectActive = i6;
    }

    public AIGCOfflineModel(boolean z, boolean z2, boolean z3, List list, List list2, String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, StickerInfo stickerInfo, String str25, String str26, long j, int i3, String str27, String str28, int i4, String str29, boolean z4, String str30, boolean z5, boolean z6, MediaModel mediaModel, boolean z7, int i5, String str31, String str32, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z, (i7 & 2) != 0 ? false : z2, (i7 & 4) != 0 ? false : z3, (i7 & 8) != 0 ? C13BV.INSTANCE : list, (i7 & 16) != 0 ? null : list2, (i7 & 32) != 0 ? null : str, (i7 & 64) != 0 ? null : str2, (i7 & 128) != 0 ? "" : str3, (i7 & 256) != 0 ? 0 : i, (i7 & 512) != 0 ? 60 : i2, (i7 & 1024) != 0 ? "" : str4, (i7 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str5, (i7 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str6, (i7 & 8192) != 0 ? "" : str7, (i7 & 16384) != 0 ? "" : str8, (i7 & 32768) != 0 ? "" : str9, (i7 & 65536) != 0 ? "" : str10, (i7 & 131072) != 0 ? "" : str11, (262144 & i7) != 0 ? "" : str12, (524288 & i7) != 0 ? "" : str13, (1048576 & i7) != 0 ? "" : str14, (2097152 & i7) != 0 ? "" : str15, (4194304 & i7) != 0 ? "" : str16, (8388608 & i7) != 0 ? "" : str17, (16777216 & i7) != 0 ? "" : str18, (33554432 & i7) != 0 ? "" : str19, (67108864 & i7) != 0 ? "" : str20, (134217728 & i7) != 0 ? "" : str21, (268435456 & i7) != 0 ? "" : str22, (536870912 & i7) != 0 ? "" : str23, (1073741824 & i7) != 0 ? "" : str24, (i7 & Integer.MIN_VALUE) != 0 ? null : stickerInfo, (i8 & 1) != 0 ? "" : str25, (i8 & 2) != 0 ? "" : str26, (i8 & 4) != 0 ? 0L : j, (i8 & 8) != 0 ? 0 : i3, (i8 & 16) != 0 ? "" : str27, (i8 & 32) != 0 ? "" : str28, (i8 & 64) != 0 ? 0 : i4, (i8 & 128) != 0 ? "" : str29, (i8 & 256) != 0 ? false : z4, (i8 & 512) != 0 ? "" : str30, (i8 & 1024) != 0 ? false : z5, (i8 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z6, (i8 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : mediaModel, (i8 & 8192) != 0 ? false : z7, (i8 & 16384) != 0 ? -1 : i5, (i8 & 32768) != 0 ? "" : str31, (i8 & 65536) == 0 ? str32 : "", (i8 & 131072) != 0 ? 0 : i6);
    }
}
