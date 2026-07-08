package com.ss.android.ugc.aweme.creative.model.editorpro;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCStylizedAiStage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class EditorProAIGCStylizedAiStage implements Parcelable {
    public static final Parcelable.Creator<EditorProAIGCStylizedAiStage> CREATOR = new Parcelable.Creator<EditorProAIGCStylizedAiStage>() { // from class: X.0EsF
        @Override // android.os.Parcelable.Creator
        public final EditorProAIGCStylizedAiStage createFromParcel(Parcel parcel) {
            return new EditorProAIGCStylizedAiStage(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProAIGCStylizedAiStage[] newArray(int i) {
            return new EditorProAIGCStylizedAiStage[i];
        }
    };

    @C09CT("effect_id")
    public final String effectId;

    @C09CT("output_count")
    public final int outputCount;

    @C09CT("prompt_text")
    public final String promptText;

    @C09CT("req_json")
    public final String reqJson;

    @C09CT("req_key")
    public final String reqKey;

    @C09CT("stage_index")
    public final int stageIndex;

    public final EditorProAIGCStylizedAiStage copy(int i, String str, String str2, String str3, String str4, int i2) {
        return new EditorProAIGCStylizedAiStage(i, str, str2, str3, str4, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorProAIGCStylizedAiStage)) {
            return false;
        }
        EditorProAIGCStylizedAiStage editorProAIGCStylizedAiStage = (EditorProAIGCStylizedAiStage) obj;
        return this.stageIndex == editorProAIGCStylizedAiStage.stageIndex && Intrinsics.LJFF(this.reqKey, editorProAIGCStylizedAiStage.reqKey) && Intrinsics.LJFF(this.reqJson, editorProAIGCStylizedAiStage.reqJson) && Intrinsics.LJFF(this.promptText, editorProAIGCStylizedAiStage.promptText) && Intrinsics.LJFF(this.effectId, editorProAIGCStylizedAiStage.effectId) && this.outputCount == editorProAIGCStylizedAiStage.outputCount;
    }

    public int hashCode() {
        return (((((((((this.stageIndex * 31) + this.reqKey.hashCode()) * 31) + this.reqJson.hashCode()) * 31) + this.promptText.hashCode()) * 31) + this.effectId.hashCode()) * 31) + this.outputCount;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProAIGCStylizedAiStage(stageIndex=");
        sbLIZ.append(this.stageIndex);
        sbLIZ.append(", reqKey=");
        sbLIZ.append(this.reqKey);
        sbLIZ.append(", reqJson=");
        sbLIZ.append(this.reqJson);
        sbLIZ.append(", promptText=");
        sbLIZ.append(this.promptText);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(", outputCount=");
        sbLIZ.append(this.outputCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.stageIndex);
        parcel.writeString(this.reqKey);
        parcel.writeString(this.reqJson);
        parcel.writeString(this.promptText);
        parcel.writeString(this.effectId);
        parcel.writeInt(this.outputCount);
    }

    public EditorProAIGCStylizedAiStage() {
        this(0, "", "", "", CardStruct.IStatusCode.DEFAULT, 1);
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final int getOutputCount() {
        return this.outputCount;
    }

    public final String getPromptText() {
        return this.promptText;
    }

    public final String getReqJson() {
        return this.reqJson;
    }

    public final String getReqKey() {
        return this.reqKey;
    }

    public final int getStageIndex() {
        return this.stageIndex;
    }

    public EditorProAIGCStylizedAiStage(int i, String str, String str2, String str3, String str4, int i2) {
        this.stageIndex = i;
        this.reqKey = str;
        this.reqJson = str2;
        this.promptText = str3;
        this.effectId = str4;
        this.outputCount = i2;
    }
}
