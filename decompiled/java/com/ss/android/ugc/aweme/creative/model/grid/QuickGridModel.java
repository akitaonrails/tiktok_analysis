package com.ss.android.ugc.aweme.creative.model.grid;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.grid.QuickGridModel;

/* JADX INFO: loaded from: classes9.dex */
public final class QuickGridModel implements Parcelable {
    public static final Parcelable.Creator<QuickGridModel> CREATOR = new Parcelable.Creator<QuickGridModel>() { // from class: X.0L7j
        @Override // android.os.Parcelable.Creator
        public final QuickGridModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new QuickGridModel(z, parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final QuickGridModel[] newArray(int i) {
            return new QuickGridModel[i];
        }
    };

    @C09CT("grid_type_extra")
    public String gridTypeExtra;

    @C09CT("height")
    public int height;

    @C09CT("is_from_quick_grid")
    public boolean isFromQuickGrid;

    @C09CT("width")
    public int width;

    public QuickGridModel() {
        this(false, "", 0, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isFromQuickGrid ? 1 : 0);
        parcel.writeString(this.gridTypeExtra);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public QuickGridModel(boolean z, String str, int i, int i2) {
        this.isFromQuickGrid = z;
        this.gridTypeExtra = str;
        this.width = i;
        this.height = i2;
    }
}
