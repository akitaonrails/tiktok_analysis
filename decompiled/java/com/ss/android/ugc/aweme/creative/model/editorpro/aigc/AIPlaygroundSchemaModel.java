package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundSchemaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class AIPlaygroundSchemaModel implements Parcelable {
    public static final Parcelable.Creator<AIPlaygroundSchemaModel> CREATOR = new Parcelable.Creator<AIPlaygroundSchemaModel>() { // from class: X.0Eos
        @Override // android.os.Parcelable.Creator
        public final AIPlaygroundSchemaModel createFromParcel(Parcel parcel) {
            return new AIPlaygroundSchemaModel(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIPlaygroundSchemaModel[] newArray(int i) {
            return new AIPlaygroundSchemaModel[i];
        }
    };

    @C09CT("deeplink_ai_playground_is_from_external_link")
    public int deeplinkAIPlaygroundIsFromExternalLink;

    @C09CT("deeplink_ai_playground_enter_source")
    public String deeplinkAIPlaygroundSceneEnterSource;

    @C09CT("is_deep_link")
    public int isDeepLink;

    public AIPlaygroundSchemaModel() {
        this(0, 0, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPlaygroundSchemaModel)) {
            return false;
        }
        AIPlaygroundSchemaModel aIPlaygroundSchemaModel = (AIPlaygroundSchemaModel) obj;
        return this.isDeepLink == aIPlaygroundSchemaModel.isDeepLink && this.deeplinkAIPlaygroundIsFromExternalLink == aIPlaygroundSchemaModel.deeplinkAIPlaygroundIsFromExternalLink && Intrinsics.LJFF(this.deeplinkAIPlaygroundSceneEnterSource, aIPlaygroundSchemaModel.deeplinkAIPlaygroundSceneEnterSource);
    }

    public final int hashCode() {
        return (((this.isDeepLink * 31) + this.deeplinkAIPlaygroundIsFromExternalLink) * 31) + this.deeplinkAIPlaygroundSceneEnterSource.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPlaygroundSchemaModel(isDeepLink=");
        sbLIZ.append(this.isDeepLink);
        sbLIZ.append(", deeplinkAIPlaygroundIsFromExternalLink=");
        sbLIZ.append(this.deeplinkAIPlaygroundIsFromExternalLink);
        sbLIZ.append(", deeplinkAIPlaygroundSceneEnterSource=");
        sbLIZ.append(this.deeplinkAIPlaygroundSceneEnterSource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isDeepLink);
        parcel.writeInt(this.deeplinkAIPlaygroundIsFromExternalLink);
        parcel.writeString(this.deeplinkAIPlaygroundSceneEnterSource);
    }

    public AIPlaygroundSchemaModel(int i, int i2, String str) {
        this.isDeepLink = i;
        this.deeplinkAIPlaygroundIsFromExternalLink = i2;
        this.deeplinkAIPlaygroundSceneEnterSource = str;
    }
}
