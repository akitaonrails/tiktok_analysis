package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class NleInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<NleInfo> CREATOR = new Creator();

    @C09CT("feature_bits")
    public final List<Long> feature_bits;

    @C09CT("feature_codes")
    public final List<Long> feature_codes;

    @C09CT("fragment_count")
    public final String fragment_count;

    @C09CT("nle_extra")
    public final String nle_extra;

    @C09CT("nle_summary")
    public final String nle_summary;

    @C09CT("urs_list")
    public final List<String> urs_list;

    public static final class Creator implements Parcelable.Creator<NleInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NleInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string3 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
            }
            return new NleInfo(string, string2, arrayListCreateStringArrayList, string3, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NleInfo[] newArray(int i) {
            return new NleInfo[i];
        }
    }

    public final NleInfo copy(String str, String str2, List<String> list, String str3, List<Long> list2, List<Long> list3) {
        return new NleInfo(str, str2, list, str3, list2, list3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NleInfo)) {
            return false;
        }
        NleInfo nleInfo = (NleInfo) obj;
        return Intrinsics.LJFF(this.nle_summary, nleInfo.nle_summary) && Intrinsics.LJFF(this.fragment_count, nleInfo.fragment_count) && Intrinsics.LJFF(this.urs_list, nleInfo.urs_list) && Intrinsics.LJFF(this.nle_extra, nleInfo.nle_extra) && Intrinsics.LJFF(this.feature_bits, nleInfo.feature_bits) && Intrinsics.LJFF(this.feature_codes, nleInfo.feature_codes);
    }

    public int hashCode() {
        String str = this.nle_summary;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fragment_count;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.urs_list;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.nle_extra;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Long> list2 = this.feature_bits;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Long> list3 = this.feature_codes;
        return iHashCode5 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NleInfo(nle_summary=");
        sbLIZ.append(this.nle_summary);
        sbLIZ.append(", fragment_count=");
        sbLIZ.append(this.fragment_count);
        sbLIZ.append(", urs_list=");
        sbLIZ.append(this.urs_list);
        sbLIZ.append(", nle_extra=");
        sbLIZ.append(this.nle_extra);
        sbLIZ.append(", feature_bits=");
        sbLIZ.append(this.feature_bits);
        sbLIZ.append(", feature_codes=");
        sbLIZ.append(this.feature_codes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nle_summary);
        parcel.writeString(this.fragment_count);
        parcel.writeStringList(this.urs_list);
        parcel.writeString(this.nle_extra);
        List<Long> list = this.feature_bits;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeLong(it2.next().longValue());
            }
        }
        List<Long> list2 = this.feature_codes;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<Long> it3 = list2.iterator();
        while (it3.hasNext()) {
            parcel.writeLong(it3.next().longValue());
        }
    }

    public final List<Long> getFeature_bits() {
        return this.feature_bits;
    }

    public final List<Long> getFeature_codes() {
        return this.feature_codes;
    }

    public final String getFragment_count() {
        return this.fragment_count;
    }

    public final String getNle_extra() {
        return this.nle_extra;
    }

    public final String getNle_summary() {
        return this.nle_summary;
    }

    public final List<String> getUrs_list() {
        return this.urs_list;
    }

    public NleInfo(String str, String str2, List<String> list, String str3, List<Long> list2, List<Long> list3) {
        this.nle_summary = str;
        this.fragment_count = str2;
        this.urs_list = list;
        this.nle_extra = str3;
        this.feature_bits = list2;
        this.feature_codes = list3;
    }
}
