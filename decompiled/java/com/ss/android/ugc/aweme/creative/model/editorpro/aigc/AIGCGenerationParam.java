package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.C13BV;
import X.C378270EsL;
import X.C786410Ut5;
import X.InterfaceC2270808v4;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCStylizedAiStage;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AICreateStylizedType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundGenerateParams;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.StylePrompt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class AIGCGenerationParam implements Parcelable {

    @C040H
    public final AICreateStylizedType aiCreateStylizedType;

    @C09CT("AIPlaygroundGenerateParams")
    public final AIPlaygroundGenerateParams aiPlaygroundGenerateParams;

    @C09CT("append_mode")
    public final boolean appendMode;

    @C09CT("aspectRatio")
    public final String aspectRatio;

    @C09CT("aigc_business_type")
    public final AIGCBusinessType businessType;

    @C09CT("duration")
    public final int duration;

    @C09CT("epID")
    public final String epID;

    @C09CT("generate_req_key")
    public final String generateReqKey;

    @C09CT("i2v_slot_id")
    public final String i2vSlotID;

    @C09CT("imagePath")
    @C0MY0
    @InterfaceC2270808v4
    public final String imagePath;

    @C09CT("imagePathList")
    @C0MY0
    @InterfaceC2270808v4
    public final List<String> imagePathList;

    @C09CT("imageReferenceAI")
    public final boolean imageReferenceAI;

    @C09CT("imageReferenceMagic")
    public final boolean imageReferenceMagic;

    @C09CT("imageSource")
    public final String imageSource;

    @C09CT("inherit_edit_properties")
    public final boolean inheritEditProperties;

    @C09CT("insertIndex")
    public final Integer insertIndex;

    @C040H
    public final int maxPipAppendDurationMs;

    @C09CT("AIGCGenerationParamType")
    public final AIGCGenerationParamType mediaType;

    @C09CT("model_name")
    public final String modelName;

    @C040H
    public final boolean needNewSlot;

    @C09CT("needs_face_detect")
    public final boolean needsFaceDetect;

    @C09CT("promptDescription")
    public final String promptDescription;

    @C09CT("promptSource")
    public final Integer promptSource;

    @C09CT("_name")
    public final int remainQuota;

    @C09CT("rewrite_type")
    public final String rewriteType;

    @C09CT("should_persist_image")
    public final boolean shouldPersistImage;

    @C09CT("video_speed")
    public Float speed;

    @C09CT("style_effect_id")
    public final String styleEffectId;

    @C09CT("style_name")
    public final String styleName;

    @C09CT("style_position")
    public final int stylePosition;

    @C09CT("style_prompt")
    public final StylePrompt stylePrompt;

    @C040H
    public final List<EditorProAIGCStylizedAiStage> stylizedStages;

    @C09CT("subGenerateType")
    public final AIGCGenerationSubType subGenerateType;

    @C09CT("quota_total")
    public final int totalQuota;

    @C09CT("unselect_generated_slot")
    public final boolean unselectGeneratedSlot;
    public static final C378270EsL Companion = new Object() { // from class: X.0EsL
    };
    public static final Parcelable.Creator<AIGCGenerationParam> CREATOR = new Parcelable.Creator<AIGCGenerationParam>() { // from class: X.0Es9
        @Override // android.os.Parcelable.Creator
        public final AIGCGenerationParam createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            AIGCGenerationSubType aIGCGenerationSubTypeCreateFromParcel;
            Integer numValueOf;
            Integer numValueOf2;
            boolean z6;
            boolean z7;
            boolean z8;
            String string = parcel.readString();
            AIGCGenerationParamType aIGCGenerationParamTypeCreateFromParcel = AIGCGenerationParamType.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
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
            String string4 = parcel.readString();
            StylePrompt stylePromptCreateFromParcel = StylePrompt.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
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
            int i3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Float fValueOf = null;
            if (parcel.readInt() == 0) {
                aIGCGenerationSubTypeCreateFromParcel = null;
            } else {
                aIGCGenerationSubTypeCreateFromParcel = AIGCGenerationSubType.CREATOR.createFromParcel(parcel);
            }
            AIGCGenerationSubType aIGCGenerationSubType = aIGCGenerationSubTypeCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            AIPlaygroundGenerateParams aIPlaygroundGenerateParamsCreateFromParcel = AIPlaygroundGenerateParams.CREATOR.createFromParcel(parcel);
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
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            AIGCBusinessType aIGCBusinessTypeCreateFromParcel = AIGCBusinessType.CREATOR.createFromParcel(parcel);
            AICreateStylizedType aICreateStylizedTypeCreateFromParcel = AICreateStylizedType.CREATOR.createFromParcel(parcel);
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                arrayList.add(EditorProAIGCStylizedAiStage.CREATOR.createFromParcel(parcel));
            }
            return new AIGCGenerationParam(string, aIGCGenerationParamTypeCreateFromParcel, string2, string3, z, z2, string4, stylePromptCreateFromParcel, string5, string6, i, i2, string7, string8, string9, z3, z4, i3, z5, arrayListCreateStringArrayList, aIGCGenerationSubType, numValueOf, numValueOf2, fValueOf, aIPlaygroundGenerateParamsCreateFromParcel, z6, z7, z8, string10, string11, i4, i5, aIGCBusinessTypeCreateFromParcel, aICreateStylizedTypeCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCGenerationParam[] newArray(int i) {
            return new AIGCGenerationParam[i];
        }
    };

    public AIGCGenerationParam() {
        this(null, null, null, null, false, false, null, null, null, null, 0, 0, null, null, null, false, false, 0, false, null, null, null, null, null, null, false, false, false, null, null, 0, 0, null, null, null, -1, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCGenerationParam)) {
            return false;
        }
        AIGCGenerationParam aIGCGenerationParam = (AIGCGenerationParam) obj;
        return Intrinsics.LJFF(this.generateReqKey, aIGCGenerationParam.generateReqKey) && this.mediaType == aIGCGenerationParam.mediaType && Intrinsics.LJFF(this.imagePath, aIGCGenerationParam.imagePath) && Intrinsics.LJFF(this.imageSource, aIGCGenerationParam.imageSource) && this.imageReferenceAI == aIGCGenerationParam.imageReferenceAI && this.imageReferenceMagic == aIGCGenerationParam.imageReferenceMagic && Intrinsics.LJFF(this.promptDescription, aIGCGenerationParam.promptDescription) && Intrinsics.LJFF(this.stylePrompt, aIGCGenerationParam.stylePrompt) && Intrinsics.LJFF(this.styleEffectId, aIGCGenerationParam.styleEffectId) && Intrinsics.LJFF(this.styleName, aIGCGenerationParam.styleName) && this.stylePosition == aIGCGenerationParam.stylePosition && this.duration == aIGCGenerationParam.duration && Intrinsics.LJFF(this.aspectRatio, aIGCGenerationParam.aspectRatio) && Intrinsics.LJFF(this.epID, aIGCGenerationParam.epID) && Intrinsics.LJFF(this.i2vSlotID, aIGCGenerationParam.i2vSlotID) && this.needNewSlot == aIGCGenerationParam.needNewSlot && this.appendMode == aIGCGenerationParam.appendMode && this.maxPipAppendDurationMs == aIGCGenerationParam.maxPipAppendDurationMs && this.inheritEditProperties == aIGCGenerationParam.inheritEditProperties && Intrinsics.LJFF(this.imagePathList, aIGCGenerationParam.imagePathList) && this.subGenerateType == aIGCGenerationParam.subGenerateType && Intrinsics.LJFF(this.promptSource, aIGCGenerationParam.promptSource) && Intrinsics.LJFF(this.insertIndex, aIGCGenerationParam.insertIndex) && Intrinsics.LJFF(this.speed, aIGCGenerationParam.speed) && Intrinsics.LJFF(this.aiPlaygroundGenerateParams, aIGCGenerationParam.aiPlaygroundGenerateParams) && this.needsFaceDetect == aIGCGenerationParam.needsFaceDetect && this.shouldPersistImage == aIGCGenerationParam.shouldPersistImage && this.unselectGeneratedSlot == aIGCGenerationParam.unselectGeneratedSlot && Intrinsics.LJFF(this.rewriteType, aIGCGenerationParam.rewriteType) && Intrinsics.LJFF(this.modelName, aIGCGenerationParam.modelName) && this.totalQuota == aIGCGenerationParam.totalQuota && this.remainQuota == aIGCGenerationParam.remainQuota && this.businessType == aIGCGenerationParam.businessType && this.aiCreateStylizedType == aIGCGenerationParam.aiCreateStylizedType && Intrinsics.LJFF(this.stylizedStages, aIGCGenerationParam.stylizedStages);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((this.generateReqKey.hashCode() * 31) + this.mediaType.hashCode()) * 31) + this.imagePath.hashCode()) * 31) + this.imageSource.hashCode()) * 31) + C786410Ut5.Z2(this.imageReferenceAI)) * 31) + C786410Ut5.Z2(this.imageReferenceMagic)) * 31) + this.promptDescription.hashCode()) * 31) + this.stylePrompt.hashCode()) * 31) + this.styleEffectId.hashCode()) * 31) + this.styleName.hashCode()) * 31) + this.stylePosition) * 31) + this.duration) * 31) + this.aspectRatio.hashCode()) * 31) + this.epID.hashCode()) * 31) + this.i2vSlotID.hashCode()) * 31) + C786410Ut5.Z2(this.needNewSlot)) * 31) + C786410Ut5.Z2(this.appendMode)) * 31) + this.maxPipAppendDurationMs) * 31) + C786410Ut5.Z2(this.inheritEditProperties)) * 31) + this.imagePathList.hashCode()) * 31;
        AIGCGenerationSubType aIGCGenerationSubType = this.subGenerateType;
        int iHashCode2 = (iHashCode + (aIGCGenerationSubType == null ? 0 : aIGCGenerationSubType.hashCode())) * 31;
        Integer num = this.promptSource;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.insertIndex;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.speed;
        return ((((((((((((((((((((((iHashCode4 + (f != null ? f.hashCode() : 0)) * 31) + this.aiPlaygroundGenerateParams.hashCode()) * 31) + C786410Ut5.Z2(this.needsFaceDetect)) * 31) + C786410Ut5.Z2(this.shouldPersistImage)) * 31) + C786410Ut5.Z2(this.unselectGeneratedSlot)) * 31) + this.rewriteType.hashCode()) * 31) + this.modelName.hashCode()) * 31) + this.totalQuota) * 31) + this.remainQuota) * 31) + this.businessType.hashCode()) * 31) + this.aiCreateStylizedType.hashCode()) * 31) + this.stylizedStages.hashCode();
    }

    public final String toString() {
        return "AIGCGenerationParam(generateReqKey=" + this.generateReqKey + ", mediaType=" + this.mediaType + ", imagePath=" + this.imagePath + ", imageSource=" + this.imageSource + ", imageReferenceAI=" + this.imageReferenceAI + ", imageReferenceMagic=" + this.imageReferenceMagic + ", promptDescription=" + this.promptDescription + ", stylePrompt=" + this.stylePrompt + ", styleEffectId=" + this.styleEffectId + ", styleName=" + this.styleName + ", stylePosition=" + this.stylePosition + ", duration=" + this.duration + ", aspectRatio=" + this.aspectRatio + ", epID=" + this.epID + ", i2vSlotID=" + this.i2vSlotID + ", needNewSlot=" + this.needNewSlot + ", appendMode=" + this.appendMode + ", maxPipAppendDurationMs=" + this.maxPipAppendDurationMs + ", inheritEditProperties=" + this.inheritEditProperties + ", imagePathList=" + this.imagePathList + ", subGenerateType=" + this.subGenerateType + ", promptSource=" + this.promptSource + ", insertIndex=" + this.insertIndex + ", speed=" + this.speed + ", aiPlaygroundGenerateParams=" + this.aiPlaygroundGenerateParams + ", needsFaceDetect=" + this.needsFaceDetect + ", shouldPersistImage=" + this.shouldPersistImage + ", unselectGeneratedSlot=" + this.unselectGeneratedSlot + ", rewriteType=" + this.rewriteType + ", modelName=" + this.modelName + ", totalQuota=" + this.totalQuota + ", remainQuota=" + this.remainQuota + ", businessType=" + this.businessType + ", aiCreateStylizedType=" + this.aiCreateStylizedType + ", stylizedStages=" + this.stylizedStages + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.generateReqKey);
        this.mediaType.writeToParcel(parcel, i);
        parcel.writeString(this.imagePath);
        parcel.writeString(this.imageSource);
        parcel.writeInt(this.imageReferenceAI ? 1 : 0);
        parcel.writeInt(this.imageReferenceMagic ? 1 : 0);
        parcel.writeString(this.promptDescription);
        this.stylePrompt.writeToParcel(parcel, i);
        parcel.writeString(this.styleEffectId);
        parcel.writeString(this.styleName);
        parcel.writeInt(this.stylePosition);
        parcel.writeInt(this.duration);
        parcel.writeString(this.aspectRatio);
        parcel.writeString(this.epID);
        parcel.writeString(this.i2vSlotID);
        parcel.writeInt(this.needNewSlot ? 1 : 0);
        parcel.writeInt(this.appendMode ? 1 : 0);
        parcel.writeInt(this.maxPipAppendDurationMs);
        parcel.writeInt(this.inheritEditProperties ? 1 : 0);
        parcel.writeStringList(this.imagePathList);
        AIGCGenerationSubType aIGCGenerationSubType = this.subGenerateType;
        if (aIGCGenerationSubType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIGCGenerationSubType.writeToParcel(parcel, i);
        }
        Integer num = this.promptSource;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.insertIndex;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Float f = this.speed;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        this.aiPlaygroundGenerateParams.writeToParcel(parcel, i);
        parcel.writeInt(this.needsFaceDetect ? 1 : 0);
        parcel.writeInt(this.shouldPersistImage ? 1 : 0);
        parcel.writeInt(this.unselectGeneratedSlot ? 1 : 0);
        parcel.writeString(this.rewriteType);
        parcel.writeString(this.modelName);
        parcel.writeInt(this.totalQuota);
        parcel.writeInt(this.remainQuota);
        this.businessType.writeToParcel(parcel, i);
        this.aiCreateStylizedType.writeToParcel(parcel, i);
        List<EditorProAIGCStylizedAiStage> list = this.stylizedStages;
        parcel.writeInt(list.size());
        Iterator<EditorProAIGCStylizedAiStage> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static AIGCGenerationParam LIZ(AIGCGenerationParam aIGCGenerationParam, String str, AIGCGenerationParamType aIGCGenerationParamType, String str2, String str3, String str4, String str5, boolean z, int i, boolean z2, List list, AIPlaygroundGenerateParams aIPlaygroundGenerateParams, AIGCBusinessType aIGCBusinessType, List list2, int i2, int i3) {
        String str6;
        boolean z3;
        boolean z4;
        StylePrompt stylePrompt;
        String str7;
        String str8;
        int i4;
        int i5;
        String str9;
        boolean z5;
        AIGCGenerationSubType aIGCGenerationSubType;
        Integer num;
        Integer num2;
        Float f;
        boolean z6;
        boolean z7;
        boolean z8;
        String str10;
        String str11;
        int i6;
        int i7;
        AICreateStylizedType aICreateStylizedType;
        AIGCBusinessType aIGCBusinessType2 = aIGCBusinessType;
        AIPlaygroundGenerateParams aIPlaygroundGenerateParams2 = aIPlaygroundGenerateParams;
        String str12 = str4;
        List list3 = list;
        String str13 = str;
        int i8 = i;
        String str14 = str5;
        List list4 = list2;
        boolean z9 = z;
        String str15 = str3;
        boolean z10 = z2;
        String str16 = str2;
        AIGCGenerationParamType aIGCGenerationParamType2 = aIGCGenerationParamType;
        if ((i2 & 1) != 0) {
            str13 = aIGCGenerationParam.generateReqKey;
        }
        if ((i2 & 2) != 0) {
            aIGCGenerationParamType2 = aIGCGenerationParam.mediaType;
        }
        if ((i2 & 4) != 0) {
            str16 = aIGCGenerationParam.imagePath;
        }
        if ((i2 & 8) != 0) {
            str6 = aIGCGenerationParam.imageSource;
        } else {
            str6 = null;
        }
        if ((i2 & 16) != 0) {
            z3 = aIGCGenerationParam.imageReferenceAI;
        } else {
            z3 = false;
        }
        if ((i2 & 32) != 0) {
            z4 = aIGCGenerationParam.imageReferenceMagic;
        } else {
            z4 = false;
        }
        if ((i2 & 64) != 0) {
            str15 = aIGCGenerationParam.promptDescription;
        }
        if ((i2 & 128) != 0) {
            stylePrompt = aIGCGenerationParam.stylePrompt;
        } else {
            stylePrompt = null;
        }
        if ((i2 & 256) != 0) {
            str7 = aIGCGenerationParam.styleEffectId;
        } else {
            str7 = null;
        }
        if ((i2 & 512) != 0) {
            str8 = aIGCGenerationParam.styleName;
        } else {
            str8 = null;
        }
        if ((i2 & 1024) != 0) {
            i4 = aIGCGenerationParam.stylePosition;
        } else {
            i4 = 0;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i5 = aIGCGenerationParam.duration;
        } else {
            i5 = 0;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str9 = aIGCGenerationParam.aspectRatio;
        } else {
            str9 = null;
        }
        if ((i2 & 8192) != 0) {
            str12 = aIGCGenerationParam.epID;
        }
        if ((i2 & 16384) != 0) {
            str14 = aIGCGenerationParam.i2vSlotID;
        }
        if ((32768 & i2) != 0) {
            z5 = aIGCGenerationParam.needNewSlot;
        } else {
            z5 = false;
        }
        if ((65536 & i2) != 0) {
            z9 = aIGCGenerationParam.appendMode;
        }
        if ((131072 & i2) != 0) {
            i8 = aIGCGenerationParam.maxPipAppendDurationMs;
        }
        if ((262144 & i2) != 0) {
            z10 = aIGCGenerationParam.inheritEditProperties;
        }
        if ((524288 & i2) != 0) {
            list3 = aIGCGenerationParam.imagePathList;
        }
        if ((1048576 & i2) != 0) {
            aIGCGenerationSubType = aIGCGenerationParam.subGenerateType;
        } else {
            aIGCGenerationSubType = null;
        }
        if ((2097152 & i2) != 0) {
            num = aIGCGenerationParam.promptSource;
        } else {
            num = null;
        }
        if ((4194304 & i2) != 0) {
            num2 = aIGCGenerationParam.insertIndex;
        } else {
            num2 = null;
        }
        if ((8388608 & i2) != 0) {
            f = aIGCGenerationParam.speed;
        } else {
            f = null;
        }
        if ((16777216 & i2) != 0) {
            aIPlaygroundGenerateParams2 = aIGCGenerationParam.aiPlaygroundGenerateParams;
        }
        if ((33554432 & i2) != 0) {
            z6 = aIGCGenerationParam.needsFaceDetect;
        } else {
            z6 = false;
        }
        if ((67108864 & i2) != 0) {
            z7 = aIGCGenerationParam.shouldPersistImage;
        } else {
            z7 = false;
        }
        if ((134217728 & i2) != 0) {
            z8 = aIGCGenerationParam.unselectGeneratedSlot;
        } else {
            z8 = false;
        }
        if ((268435456 & i2) != 0) {
            str10 = aIGCGenerationParam.rewriteType;
        } else {
            str10 = null;
        }
        if ((536870912 & i2) != 0) {
            str11 = aIGCGenerationParam.modelName;
        } else {
            str11 = null;
        }
        if ((1073741824 & i2) != 0) {
            i6 = aIGCGenerationParam.totalQuota;
        } else {
            i6 = 0;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i7 = aIGCGenerationParam.remainQuota;
        } else {
            i7 = 0;
        }
        if ((i3 & 1) != 0) {
            aIGCBusinessType2 = aIGCGenerationParam.businessType;
        }
        if ((i3 & 2) != 0) {
            aICreateStylizedType = aIGCGenerationParam.aiCreateStylizedType;
        } else {
            aICreateStylizedType = null;
        }
        if ((i3 & 4) != 0) {
            list4 = aIGCGenerationParam.stylizedStages;
        }
        aIGCGenerationParam.getClass();
        List list5 = list4;
        return new AIGCGenerationParam(str13, aIGCGenerationParamType2, str16, str6, z3, z4, str15, stylePrompt, str7, str8, i4, i5, str9, str12, str14, z5, z9, i8, z10, list3, aIGCGenerationSubType, num, num2, f, aIPlaygroundGenerateParams2, z6, z7, z8, str10, str11, i6, i7, aIGCBusinessType2, aICreateStylizedType, list5);
    }

    public AIGCGenerationParam(String str, AIGCGenerationParamType aIGCGenerationParamType, String str2, String str3, boolean z, boolean z2, String str4, StylePrompt stylePrompt, String str5, String str6, int i, int i2, String str7, String str8, String str9, boolean z3, boolean z4, int i3, boolean z5, List<String> list, AIGCGenerationSubType aIGCGenerationSubType, Integer num, Integer num2, Float f, AIPlaygroundGenerateParams aIPlaygroundGenerateParams, boolean z6, boolean z7, boolean z8, String str10, String str11, int i4, int i5, AIGCBusinessType aIGCBusinessType, AICreateStylizedType aICreateStylizedType, List<EditorProAIGCStylizedAiStage> list2) {
        this.generateReqKey = str;
        this.mediaType = aIGCGenerationParamType;
        this.imagePath = str2;
        this.imageSource = str3;
        this.imageReferenceAI = z;
        this.imageReferenceMagic = z2;
        this.promptDescription = str4;
        this.stylePrompt = stylePrompt;
        this.styleEffectId = str5;
        this.styleName = str6;
        this.stylePosition = i;
        this.duration = i2;
        this.aspectRatio = str7;
        this.epID = str8;
        this.i2vSlotID = str9;
        this.needNewSlot = z3;
        this.appendMode = z4;
        this.maxPipAppendDurationMs = i3;
        this.inheritEditProperties = z5;
        this.imagePathList = list;
        this.subGenerateType = aIGCGenerationSubType;
        this.promptSource = num;
        this.insertIndex = num2;
        this.speed = f;
        this.aiPlaygroundGenerateParams = aIPlaygroundGenerateParams;
        this.needsFaceDetect = z6;
        this.shouldPersistImage = z7;
        this.unselectGeneratedSlot = z8;
        this.rewriteType = str10;
        this.modelName = str11;
        this.totalQuota = i4;
        this.remainQuota = i5;
        this.businessType = aIGCBusinessType;
        this.aiCreateStylizedType = aICreateStylizedType;
        this.stylizedStages = list2;
    }

    public AIGCGenerationParam(String str, AIGCGenerationParamType aIGCGenerationParamType, String str2, String str3, boolean z, boolean z2, String str4, StylePrompt stylePrompt, String str5, String str6, int i, int i2, String str7, String str8, String str9, boolean z3, boolean z4, int i3, boolean z5, List list, AIGCGenerationSubType aIGCGenerationSubType, Integer num, Integer num2, Float f, AIPlaygroundGenerateParams aIPlaygroundGenerateParams, boolean z6, boolean z7, boolean z8, String str10, String str11, int i4, int i5, AIGCBusinessType aIGCBusinessType, AICreateStylizedType aICreateStylizedType, List list2, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? AIGCGenerationParamType.NONE : aIGCGenerationParamType, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? "" : str3, (i6 & 16) != 0 ? false : z, (i6 & 32) != 0 ? false : z2, (i6 & 64) != 0 ? "" : str4, (i6 & 128) != 0 ? new StylePrompt("", "") : stylePrompt, (i6 & 256) != 0 ? "" : str5, (i6 & 512) != 0 ? "" : str6, (i6 & 1024) != 0 ? 0 : i, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i2, (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str7, (i6 & 8192) != 0 ? "" : str8, (i6 & 16384) != 0 ? "" : str9, (32768 & i6) != 0 ? true : z3, (65536 & i6) != 0 ? false : z4, (131072 & i6) != 0 ? 0 : i3, (262144 & i6) != 0 ? false : z5, (524288 & i6) != 0 ? C13BV.INSTANCE : list, (1048576 & i6) != 0 ? null : aIGCGenerationSubType, (2097152 & i6) != 0 ? null : num, (4194304 & i6) != 0 ? null : num2, (8388608 & i6) != 0 ? null : f, (16777216 & i6) != 0 ? new AIPlaygroundGenerateParams(null, null, 3, null) : aIPlaygroundGenerateParams, (33554432 & i6) != 0 ? false : z6, (67108864 & i6) != 0 ? false : z7, (134217728 & i6) != 0 ? false : z8, (268435456 & i6) != 0 ? "" : str10, (536870912 & i6) == 0 ? str11 : "", (1073741824 & i6) != 0 ? 0 : i4, (i6 & Integer.MIN_VALUE) != 0 ? 0 : i5, (i7 & 1) != 0 ? AIGCBusinessType.AI_CREATE : aIGCBusinessType, (i7 & 2) != 0 ? AICreateStylizedType.NONE : aICreateStylizedType, (i7 & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
