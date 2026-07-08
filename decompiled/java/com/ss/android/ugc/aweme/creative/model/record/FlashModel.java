package com.ss.android.ugc.aweme.creative.model.record;

import X.C09CT;
import X.C13LP;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.record.FlashModel;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public final class FlashModel implements Parcelable {
    public static final Parcelable.Creator<FlashModel> CREATOR = new Parcelable.Creator<FlashModel>() { // from class: X.0mbf
        @Override // android.os.Parcelable.Creator
        public final FlashModel createFromParcel(Parcel parcel) {
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
            int i = parcel.readInt();
            HashSet hashSet = new HashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                hashSet.add(parcel.readString());
            }
            int i3 = parcel.readInt();
            HashSet hashSet2 = new HashSet(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                hashSet2.add(Integer.valueOf(parcel.readInt()));
            }
            return new FlashModel(z, z2, hashSet, hashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final FlashModel[] newArray(int i) {
            return new FlashModel[i];
        }
    };

    @C09CT("front_flash_color")
    public final HashSet<String> frontFlashColor;

    @C09CT("front_flash_value")
    public final HashSet<Integer> frontFlashValue;

    @C09CT("is_back_flash_on")
    public boolean isBackFlashOn;

    @C09CT("is_front_flash_on")
    public boolean isFrontFlashOn;

    public FlashModel() {
        this(false, false, new HashSet(), new HashSet());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isFrontFlashOn ? 1 : 0);
        parcel.writeInt(this.isBackFlashOn ? 1 : 0);
        HashSet<String> hashSet = this.frontFlashColor;
        parcel.writeInt(hashSet.size());
        Iterator<String> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next());
        }
        HashSet<Integer> hashSet2 = this.frontFlashValue;
        parcel.writeInt(hashSet2.size());
        Iterator<Integer> it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            parcel.writeInt(it3.next().intValue());
        }
    }

    public final String LIZ() {
        return C13LP.LJJLIIIJ(this.frontFlashColor, ",", null, null, 0, null, null, 62);
    }

    public final String LIZIZ() {
        return C13LP.LJJLIIIJ(this.frontFlashValue, ",", null, null, 0, null, null, 62);
    }

    public FlashModel(boolean z, boolean z2, HashSet<String> hashSet, HashSet<Integer> hashSet2) {
        this.isFrontFlashOn = z;
        this.isBackFlashOn = z2;
        this.frontFlashColor = hashSet;
        this.frontFlashValue = hashSet2;
    }
}
