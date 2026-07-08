package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CollabInfoModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class CollabInfoModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CollabInfoModel> CREATOR = new Parcelable.Creator<CollabInfoModel>() { // from class: X.0mci
        @Override // android.os.Parcelable.Creator
        public final CollabInfoModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            return new CollabInfoModel(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CollabInfoModel[] newArray(int i) {
            return new CollabInfoModel[i];
        }
    };

    @C09CT("collab_user_list")
    public List<? extends User> collabUserList;

    public CollabInfoModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<? extends User> list = this.collabUserList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<? extends User> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeSerializable(it2.next());
        }
    }

    public final List<User> getCollabUserList() {
        return this.collabUserList;
    }

    public CollabInfoModel(List<? extends User> list) {
        this.collabUserList = list;
    }

    public final void setCollabUserList(List<? extends User> list) {
        this.collabUserList = list;
    }
}
