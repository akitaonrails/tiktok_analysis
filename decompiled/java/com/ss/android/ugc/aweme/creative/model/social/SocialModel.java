package com.ss.android.ugc.aweme.creative.model.social;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.social.SocialModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public final class SocialModel implements Parcelable {
    public static final Parcelable.Creator<SocialModel> CREATOR = new Parcelable.Creator<SocialModel>() { // from class: X.0mch
        @Override // android.os.Parcelable.Creator
        public final SocialModel createFromParcel(Parcel parcel) {
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
            return new SocialModel(arrayList, parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SocialModel[] newArray(int i) {
            return new SocialModel[i];
        }
    };

    @C040H
    public int encryptType;

    @C09CT("relation_enter_method")
    public String relationEnterMethod;

    @C040H
    public ArrayList<InteractionTagUserInfo> tagUserList;

    @C040H
    public int uploadScene;

    public SocialModel() {
        this(null, 1, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList<InteractionTagUserInfo> arrayList = this.tagUserList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<InteractionTagUserInfo> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        parcel.writeInt(this.uploadScene);
        parcel.writeInt(this.encryptType);
        parcel.writeString(this.relationEnterMethod);
    }

    public SocialModel(ArrayList<InteractionTagUserInfo> arrayList, int i, int i2, String str) {
        this.tagUserList = arrayList;
        this.uploadScene = i;
        this.encryptType = i2;
        this.relationEnterMethod = str;
    }
}
