package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.TaskInfoInCreativeModel;

/* JADX INFO: loaded from: classes6.dex */
public final class TaskInfoInCreativeModel implements Parcelable {
    public static final Parcelable.Creator<TaskInfoInCreativeModel> CREATOR = new Parcelable.Creator<TaskInfoInCreativeModel>() { // from class: X.0Eoq
        @Override // android.os.Parcelable.Creator
        public final TaskInfoInCreativeModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new TaskInfoInCreativeModel(z, z2, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TaskInfoInCreativeModel[] newArray(int i) {
            return new TaskInfoInCreativeModel[i];
        }
    };

    @C09CT("block_reason")
    public boolean isBlockByLoading;

    @C09CT("needBlockLeaveEditorPro")
    public boolean needBlockLeaveEditorPro;

    @C09CT("uncompletedTasksSize")
    public int uncompletedTasksSize;

    public TaskInfoInCreativeModel() {
        this(false, true, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskInfoInCreativeModel)) {
            return false;
        }
        TaskInfoInCreativeModel taskInfoInCreativeModel = (TaskInfoInCreativeModel) obj;
        return this.needBlockLeaveEditorPro == taskInfoInCreativeModel.needBlockLeaveEditorPro && this.isBlockByLoading == taskInfoInCreativeModel.isBlockByLoading && this.uncompletedTasksSize == taskInfoInCreativeModel.uncompletedTasksSize;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.needBlockLeaveEditorPro) * 31) + C786410Ut5.Z2(this.isBlockByLoading)) * 31) + this.uncompletedTasksSize;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskInfoInCreativeModel(needBlockLeaveEditorPro=");
        sbLIZ.append(this.needBlockLeaveEditorPro);
        sbLIZ.append(", isBlockByLoading=");
        sbLIZ.append(this.isBlockByLoading);
        sbLIZ.append(", uncompletedTasksSize=");
        sbLIZ.append(this.uncompletedTasksSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.needBlockLeaveEditorPro ? 1 : 0);
        parcel.writeInt(this.isBlockByLoading ? 1 : 0);
        parcel.writeInt(this.uncompletedTasksSize);
    }

    public TaskInfoInCreativeModel(boolean z, boolean z2, int i) {
        this.needBlockLeaveEditorPro = z;
        this.isBlockByLoading = z2;
        this.uncompletedTasksSize = i;
    }
}
