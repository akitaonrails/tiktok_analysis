package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.DraftModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class DraftModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<DraftModel> CREATOR = new Parcelable.Creator<DraftModel>() { // from class: X.0MiI
        @Override // android.os.Parcelable.Creator
        public final DraftModel createFromParcel(Parcel parcel) {
            return new DraftModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DraftModel[] newArray(int i) {
            return new DraftModel[i];
        }
    };

    @C09CT("task_id")
    public String taskId;

    public DraftModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.taskId);
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public DraftModel(String str) {
        this.taskId = str;
    }

    public final void setTaskId(String str) {
        this.taskId = str;
    }
}
