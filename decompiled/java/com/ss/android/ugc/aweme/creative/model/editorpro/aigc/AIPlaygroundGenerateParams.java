package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundGenerateParams;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class AIPlaygroundGenerateParams implements Parcelable {
    public static final Parcelable.Creator<AIPlaygroundGenerateParams> CREATOR = new Parcelable.Creator<AIPlaygroundGenerateParams>() { // from class: X.0Esh
        @Override // android.os.Parcelable.Creator
        public final AIPlaygroundGenerateParams createFromParcel(Parcel parcel) {
            AIGenerationType aIGenerationTypeCreateFromParcel = AIGenerationType.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UploadImageParam.CREATOR.createFromParcel(parcel));
            }
            return new AIPlaygroundGenerateParams(aIGenerationTypeCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AIPlaygroundGenerateParams[] newArray(int i) {
            return new AIPlaygroundGenerateParams[i];
        }
    };

    @C09CT("AIPlaygroundGenerateImageList")
    public final List<UploadImageParam> aiPlaygroundGenerateImageList;

    @C09CT("AIPlaygroundGenerationType")
    public final AIGenerationType aiPlaygroundGenerationType;

    public AIPlaygroundGenerateParams() {
        this(null, null, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPlaygroundGenerateParams)) {
            return false;
        }
        AIPlaygroundGenerateParams aIPlaygroundGenerateParams = (AIPlaygroundGenerateParams) obj;
        return this.aiPlaygroundGenerationType == aIPlaygroundGenerateParams.aiPlaygroundGenerationType && Intrinsics.LJFF(this.aiPlaygroundGenerateImageList, aIPlaygroundGenerateParams.aiPlaygroundGenerateImageList);
    }

    public final int hashCode() {
        return (this.aiPlaygroundGenerationType.hashCode() * 31) + this.aiPlaygroundGenerateImageList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPlaygroundGenerateParams(aiPlaygroundGenerationType=");
        sbLIZ.append(this.aiPlaygroundGenerationType);
        sbLIZ.append(", aiPlaygroundGenerateImageList=");
        sbLIZ.append(this.aiPlaygroundGenerateImageList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.aiPlaygroundGenerationType.writeToParcel(parcel, i);
        List<UploadImageParam> list = this.aiPlaygroundGenerateImageList;
        parcel.writeInt(list.size());
        Iterator<UploadImageParam> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public AIPlaygroundGenerateParams(AIGenerationType aIGenerationType, List<UploadImageParam> list) {
        this.aiPlaygroundGenerationType = aIGenerationType;
        this.aiPlaygroundGenerateImageList = list;
    }

    public AIPlaygroundGenerateParams(AIGenerationType aIGenerationType, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AIGenerationType.NONE : aIGenerationType, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
