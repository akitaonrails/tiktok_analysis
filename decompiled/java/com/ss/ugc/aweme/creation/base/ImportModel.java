package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.ImportModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ImportModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImportModel> CREATOR = new Parcelable.Creator<ImportModel>() { // from class: X.0Mha
        @Override // android.os.Parcelable.Creator
        public final ImportModel createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (i != 0) {
                arrayList.add(parcel.readParcelable(ImportModel.class.getClassLoader()));
                i--;
            }
            return new ImportModel(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ImportModel[] newArray(int i) {
            return new ImportModel[i];
        }
    };

    @C09CT("items")
    public List<ImportItemModel> items;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List<ImportItemModel> list = this.items;
        parcel.writeInt(list.size());
        Iterator<ImportItemModel> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public ImportModel() {
        this(new ArrayList());
    }

    public final List<ImportItemModel> getItems() {
        return this.items;
    }

    public ImportModel(List<ImportItemModel> list) {
        this.items = list;
    }

    public final void setItems(List<ImportItemModel> list) {
        this.items = list;
    }
}
