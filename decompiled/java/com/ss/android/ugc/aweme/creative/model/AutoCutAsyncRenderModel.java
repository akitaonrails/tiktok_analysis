package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoCutAsyncRenderModel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public final class AutoCutAsyncRenderModel implements Parcelable {
    public static final Parcelable.Creator<AutoCutAsyncRenderModel> CREATOR = new Parcelable.Creator<AutoCutAsyncRenderModel>() { // from class: X.0mdv
        @Override // android.os.Parcelable.Creator
        public final AutoCutAsyncRenderModel createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            long j = parcel.readLong();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashSet.add(parcel.readString());
                }
            }
            return new AutoCutAsyncRenderModel(j, i, i2, linkedHashSet, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoCutAsyncRenderModel[] newArray(int i) {
            return new AutoCutAsyncRenderModel[i];
        }
    };

    @C040H
    public int asyncRenderNecessaryDownloadCount;

    @C040H
    public int asyncRenderNecessaryTotalCount;

    @C040H
    public Set<String> asyncRenderUnnecessaryDownloadSet;

    @C040H
    public int asyncRenderUnnecessaryTotalCount;

    @C040H
    public long costDuration;

    public AutoCutAsyncRenderModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.costDuration);
        parcel.writeInt(this.asyncRenderNecessaryDownloadCount);
        parcel.writeInt(this.asyncRenderNecessaryTotalCount);
        Set<String> set = this.asyncRenderUnnecessaryDownloadSet;
        if (set == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(set.size());
            Iterator<String> it2 = set.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next());
            }
        }
        parcel.writeInt(this.asyncRenderUnnecessaryTotalCount);
    }

    public /* synthetic */ AutoCutAsyncRenderModel(int i) {
        this(0L, 0, 0, null, 0);
    }

    public AutoCutAsyncRenderModel(long j, int i, int i2, Set<String> set, int i3) {
        this.costDuration = j;
        this.asyncRenderNecessaryDownloadCount = i;
        this.asyncRenderNecessaryTotalCount = i2;
        this.asyncRenderUnnecessaryDownloadSet = set;
        this.asyncRenderUnnecessaryTotalCount = i3;
    }
}
