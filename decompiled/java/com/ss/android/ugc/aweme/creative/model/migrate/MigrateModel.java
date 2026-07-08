package com.ss.android.ugc.aweme.creative.model.migrate;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.migrate.MigrateModel;

/* JADX INFO: loaded from: classes23.dex */
public final class MigrateModel implements Parcelable {
    public static final Parcelable.Creator<MigrateModel> CREATOR = new Parcelable.Creator<MigrateModel>() { // from class: X.0nX4
        @Override // android.os.Parcelable.Creator
        public final MigrateModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new MigrateModel(z);
        }

        @Override // android.os.Parcelable.Creator
        public final MigrateModel[] newArray(int i) {
            return new MigrateModel[i];
        }
    };

    @C09CT("is_edit_model_partition_phase1_draft")
    public boolean isEditModelPartitionPhase1Draft;

    public MigrateModel() {
        this(false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEditModelPartitionPhase1Draft ? 1 : 0);
    }

    public MigrateModel(boolean z) {
        this.isEditModelPartitionPhase1Draft = z;
    }
}
