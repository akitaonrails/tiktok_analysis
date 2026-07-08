package com.ss.android.ugc.aweme.ecommerce.mix.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.mix.model.TabBarItemData;

/* JADX INFO: loaded from: classes19.dex */
public final class TabBarItemData implements Parcelable {
    public static final Parcelable.Creator<TabBarItemData> CREATOR = new Parcelable.Creator<TabBarItemData>() { // from class: X.0gSe
        @Override // android.os.Parcelable.Creator
        public final TabBarItemData createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TabBarItemData(lValueOf, string, boolValueOf, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final TabBarItemData[] newArray(int i) {
            return new TabBarItemData[i];
        }
    };

    @C09CT("tab_index")
    public Integer index;

    @C09CT("is_main")
    public Boolean isMain;

    @C09CT("tab_name")
    public String tabName;

    @C09CT("tab_type")
    public final Long tabType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.tabType;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.tabName);
        Boolean bool = this.isMain;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.index;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public TabBarItemData(Long l, String str, Boolean bool, Integer num) {
        this.tabType = l;
        this.tabName = str;
        this.isMain = bool;
        this.index = num;
    }
}
