package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.MentionModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MentionModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<MentionModel> CREATOR = new Parcelable.Creator<MentionModel>() { // from class: X.0MhR
        @Override // android.os.Parcelable.Creator
        public final MentionModel createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (i != 0) {
                arrayList.add(parcel.readParcelable(MentionModel.class.getClassLoader()));
                i--;
            }
            return new MentionModel(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MentionModel[] newArray(int i) {
            return new MentionModel[i];
        }
    };

    @C09CT("at_users")
    public List<UserModel> atUsers;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List<UserModel> list = this.atUsers;
        parcel.writeInt(list.size());
        Iterator<UserModel> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public MentionModel() {
        this(new ArrayList());
    }

    public final List<UserModel> getAtUsers() {
        return this.atUsers;
    }

    public MentionModel(List<UserModel> list) {
        this.atUsers = list;
    }

    public final void setAtUsers(List<UserModel> list) {
        this.atUsers = list;
    }
}
