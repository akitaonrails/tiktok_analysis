package com.ss.android.ugc.aweme.template;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.template.AIGCTemplateModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class AIGCTemplateModel implements Parcelable {
    public static final Parcelable.Creator<AIGCTemplateModel> CREATOR = new Parcelable.Creator<AIGCTemplateModel>() { // from class: X.0EsG
        @Override // android.os.Parcelable.Creator
        public final AIGCTemplateModel createFromParcel(Parcel parcel) {
            return new AIGCTemplateModel(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCTemplateModel[] newArray(int i) {
            return new AIGCTemplateModel[i];
        }
    };

    @C09CT("image_paths")
    public final List<String> imagePaths;

    @C09CT("task_type")
    public final String taskType;

    public AIGCTemplateModel() {
        this(null, null, 3, null);
    }

    public final AIGCTemplateModel copy(String str, List<String> list) {
        return new AIGCTemplateModel(str, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCTemplateModel)) {
            return false;
        }
        AIGCTemplateModel aIGCTemplateModel = (AIGCTemplateModel) obj;
        return Intrinsics.LJFF(this.taskType, aIGCTemplateModel.taskType) && Intrinsics.LJFF(this.imagePaths, aIGCTemplateModel.imagePaths);
    }

    public int hashCode() {
        return (this.taskType.hashCode() * 31) + this.imagePaths.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCTemplateModel(taskType=");
        sbLIZ.append(this.taskType);
        sbLIZ.append(", imagePaths=");
        sbLIZ.append(this.imagePaths);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.taskType);
        parcel.writeStringList(this.imagePaths);
    }

    public final List<String> getImagePaths() {
        return this.imagePaths;
    }

    public final String getTaskType() {
        return this.taskType;
    }

    public AIGCTemplateModel(String str, List<String> list) {
        this.taskType = str;
        this.imagePaths = list;
    }

    public AIGCTemplateModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
