package com.ss.android.ugc.aweme.creative.model.aichat;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPerfModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class AIChatGenPerfModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AIChatGenPerfModel> CREATOR = new Parcelable.Creator<AIChatGenPerfModel>() { // from class: X.0wUh
        @Override // android.os.Parcelable.Creator
        public final AIChatGenPerfModel createFromParcel(Parcel parcel) {
            Long lValueOf;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new AIChatGenPerfModel(lValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIChatGenPerfModel[] newArray(int i) {
            return new AIChatGenPerfModel[i];
        }
    };

    @C09CT("client_duration_ms")
    public final Long clientDurationMs;

    @C09CT("image_convert_duration")
    public final String imageConvertDuration;

    @C09CT("input_moderation_duration")
    public final String inputModerationDuration;

    @C09CT("output_moderation_duration")
    public final String outputModerationDuration;

    @C09CT("server_duration_s")
    public final String serverDurationS;

    @C09CT("server_generate_duration_s")
    public final String serverGenerateDurationS;

    @C09CT("server_intention_duration_s")
    public final String serverIntentionDurationS;

    public AIChatGenPerfModel() {
        this(null, null, null, null, null, null, null);
    }

    public final AIChatGenPerfModel copy(Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        return new AIChatGenPerfModel(l, str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatGenPerfModel)) {
            return false;
        }
        AIChatGenPerfModel aIChatGenPerfModel = (AIChatGenPerfModel) obj;
        return Intrinsics.LJFF(this.clientDurationMs, aIChatGenPerfModel.clientDurationMs) && Intrinsics.LJFF(this.serverDurationS, aIChatGenPerfModel.serverDurationS) && Intrinsics.LJFF(this.serverIntentionDurationS, aIChatGenPerfModel.serverIntentionDurationS) && Intrinsics.LJFF(this.serverGenerateDurationS, aIChatGenPerfModel.serverGenerateDurationS) && Intrinsics.LJFF(this.inputModerationDuration, aIChatGenPerfModel.inputModerationDuration) && Intrinsics.LJFF(this.outputModerationDuration, aIChatGenPerfModel.outputModerationDuration) && Intrinsics.LJFF(this.imageConvertDuration, aIChatGenPerfModel.imageConvertDuration);
    }

    public int hashCode() {
        Long l = this.clientDurationMs;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.serverDurationS;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.serverIntentionDurationS;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serverGenerateDurationS;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.inputModerationDuration;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.outputModerationDuration;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.imageConvertDuration;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIChatGenPerfModel(clientDurationMs=");
        sbLIZ.append(this.clientDurationMs);
        sbLIZ.append(", serverDurationS=");
        sbLIZ.append(this.serverDurationS);
        sbLIZ.append(", serverIntentionDurationS=");
        sbLIZ.append(this.serverIntentionDurationS);
        sbLIZ.append(", serverGenerateDurationS=");
        sbLIZ.append(this.serverGenerateDurationS);
        sbLIZ.append(", inputModerationDuration=");
        sbLIZ.append(this.inputModerationDuration);
        sbLIZ.append(", outputModerationDuration=");
        sbLIZ.append(this.outputModerationDuration);
        sbLIZ.append(", imageConvertDuration=");
        sbLIZ.append(this.imageConvertDuration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.clientDurationMs;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.serverDurationS);
        parcel.writeString(this.serverIntentionDurationS);
        parcel.writeString(this.serverGenerateDurationS);
        parcel.writeString(this.inputModerationDuration);
        parcel.writeString(this.outputModerationDuration);
        parcel.writeString(this.imageConvertDuration);
    }

    public final Long getClientDurationMs() {
        return this.clientDurationMs;
    }

    public final String getImageConvertDuration() {
        return this.imageConvertDuration;
    }

    public final String getInputModerationDuration() {
        return this.inputModerationDuration;
    }

    public final String getOutputModerationDuration() {
        return this.outputModerationDuration;
    }

    public final String getServerDurationS() {
        return this.serverDurationS;
    }

    public final String getServerGenerateDurationS() {
        return this.serverGenerateDurationS;
    }

    public final String getServerIntentionDurationS() {
        return this.serverIntentionDurationS;
    }

    public AIChatGenPerfModel(Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        this.clientDurationMs = l;
        this.serverDurationS = str;
        this.serverIntentionDurationS = str2;
        this.serverGenerateDurationS = str3;
        this.inputModerationDuration = str4;
        this.outputModerationDuration = str5;
        this.imageConvertDuration = str6;
    }
}
