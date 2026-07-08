package com.ss.android.ugc.airemix.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.airemix.model.AIRemixSessionModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSessionModel;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixSessionModel implements AIGCSessionModel {
    public static final Parcelable.Creator<AIRemixSessionModel> CREATOR = new Parcelable.Creator<AIRemixSessionModel>() { // from class: X.0Lel
        @Override // android.os.Parcelable.Creator
        public final AIRemixSessionModel createFromParcel(Parcel parcel) {
            return new AIRemixSessionModel(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIRemixSessionModel[] newArray(int i) {
            return new AIRemixSessionModel[i];
        }
    };

    @C09CT(alternate = {"user_id"}, value = "creation_id")
    public final String creationId;

    @C09CT(alternate = {"model_id"}, value = "creative_info_version")
    public final int creativeInfoVersion;

    @C09CT(alternate = {"prompt"}, value = "source")
    public final String source;

    @C09CT(alternate = {"session_id"}, value = "trace_id")
    public final String traceId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixSessionModel)) {
            return false;
        }
        AIRemixSessionModel aIRemixSessionModel = (AIRemixSessionModel) obj;
        return Intrinsics.LJFF(this.traceId, aIRemixSessionModel.traceId) && Intrinsics.LJFF(this.creationId, aIRemixSessionModel.creationId) && this.creativeInfoVersion == aIRemixSessionModel.creativeInfoVersion && Intrinsics.LJFF(this.source, aIRemixSessionModel.source);
    }

    public final int hashCode() {
        return (((((this.traceId.hashCode() * 31) + this.creationId.hashCode()) * 31) + this.creativeInfoVersion) * 31) + this.source.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixSessionModel(traceId=");
        sbLIZ.append(this.traceId);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", creativeInfoVersion=");
        sbLIZ.append(this.creativeInfoVersion);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.traceId);
        parcel.writeString(this.creationId);
        parcel.writeInt(this.creativeInfoVersion);
        parcel.writeString(this.source);
    }

    public AIRemixSessionModel() {
        this(UUID.randomUUID().toString(), "", 0, "");
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCSessionModel
    public final int V4() {
        return this.creativeInfoVersion;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCSessionModel
    public final String getCreationId() {
        return this.creationId;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCSessionModel
    public final String getSource() {
        return this.source;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCSessionModel
    public final String getTraceId() {
        return this.traceId;
    }

    public AIRemixSessionModel(String str, String str2, int i, String str3) {
        this.traceId = str;
        this.creationId = str2;
        this.creativeInfoVersion = i;
        this.source = str3;
    }
}
