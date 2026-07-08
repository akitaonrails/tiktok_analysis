package com.ss.android.ugc.aweme.theater.model;

import X.C09CT;
import X.C2188811AlT;
import X.C546860Lca;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSessionModel;
import com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCSessionModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterSessionModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterSessionModel implements WritableAIGCSessionModel {
    public static final Parcelable.Creator<AITheaterSessionModel> CREATOR = new Parcelable.Creator<AITheaterSessionModel>() { // from class: X.0Lei
        @Override // android.os.Parcelable.Creator
        public final AITheaterSessionModel createFromParcel(Parcel parcel) {
            return new AITheaterSessionModel(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AITheaterSessionModel[] newArray(int i) {
            return new AITheaterSessionModel[i];
        }
    };

    @C09CT(alternate = {"user_id"}, value = "creation_id")
    public String creationId;

    @C09CT(alternate = {"model_id"}, value = "creative_info_version")
    public int creativeInfoVersion;

    @C09CT(alternate = {"prompt"}, value = "source")
    public final String source;

    @C09CT(alternate = {"session_id"}, value = "trace_id")
    public String traceId;

    /* JADX WARN: Multi-variable type inference failed */
    public AITheaterSessionModel() {
        this(null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITheaterSessionModel)) {
            return false;
        }
        AITheaterSessionModel aITheaterSessionModel = (AITheaterSessionModel) obj;
        return Intrinsics.LJFF(this.traceId, aITheaterSessionModel.traceId) && Intrinsics.LJFF(this.creationId, aITheaterSessionModel.creationId) && this.creativeInfoVersion == aITheaterSessionModel.creativeInfoVersion && Intrinsics.LJFF(this.source, aITheaterSessionModel.source);
    }

    public final int hashCode() {
        return (((((this.traceId.hashCode() * 31) + this.creationId.hashCode()) * 31) + this.creativeInfoVersion) * 31) + this.source.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterSessionModel(traceId=");
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

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCSessionModel
    public final void Hv(int i) {
        this.creativeInfoVersion = i;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCSessionModel
    public final void setCreationId(String str) {
        this.creationId = str;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCSessionModel
    public final void setTraceId(String str) {
        this.traceId = str;
    }

    public AITheaterSessionModel(String str, String str2, int i, String str3) {
        this.traceId = str;
        this.creationId = str2;
        this.creativeInfoVersion = i;
        this.source = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AITheaterSessionModel(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            AIGCSessionModel.Companion.getClass();
            str = C546860Lca.LIZ();
        }
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3);
    }
}
