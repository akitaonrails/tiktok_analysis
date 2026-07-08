package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.MinisPkg;
import com.ss.android.ugc.aweme.minis.model.PreloadSubpackageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class MinisPkg implements Parcelable {

    @C09CT("dependencies")
    public final List<String> dependencies;

    @C09CT("main")
    public final String main;

    @C09CT("md5")
    public final String md5;

    @C09CT("output")
    public final String output;

    @C09CT("parallelPreloadSubpackages")
    public final List<PreloadSubpackageInfo> parallelPreloadSubpackages;

    @C09CT("root")
    public final String root;

    @C09CT("type")
    public final String type;

    @C09CT("url")
    public final String url;
    public static final Parcelable.Creator<MinisPkg> CREATOR = new Parcelable.Creator<MinisPkg>() { // from class: X.09YQ
        @Override // android.os.Parcelable.Creator
        public final MinisPkg createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PreloadSubpackageInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new MinisPkg(string, string2, string3, string4, string5, arrayListCreateStringArrayList, string6, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MinisPkg[] newArray(int i) {
            return new MinisPkg[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisPkg)) {
            return false;
        }
        MinisPkg minisPkg = (MinisPkg) obj;
        return Intrinsics.LJFF(this.url, minisPkg.url) && Intrinsics.LJFF(this.md5, minisPkg.md5) && Intrinsics.LJFF(this.root, minisPkg.root) && Intrinsics.LJFF(this.main, minisPkg.main) && Intrinsics.LJFF(this.output, minisPkg.output) && Intrinsics.LJFF(this.dependencies, minisPkg.dependencies) && Intrinsics.LJFF(this.type, minisPkg.type) && Intrinsics.LJFF(this.parallelPreloadSubpackages, minisPkg.parallelPreloadSubpackages);
    }

    public final int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.md5;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.root;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.main;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.output;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.dependencies;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.type;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<PreloadSubpackageInfo> list2 = this.parallelPreloadSubpackages;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisPkg(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", md5=");
        sbLIZ.append(this.md5);
        sbLIZ.append(", root=");
        sbLIZ.append(this.root);
        sbLIZ.append(", main=");
        sbLIZ.append(this.main);
        sbLIZ.append(", output=");
        sbLIZ.append(this.output);
        sbLIZ.append(", dependencies=");
        sbLIZ.append(this.dependencies);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", parallelPreloadSubpackages=");
        sbLIZ.append(this.parallelPreloadSubpackages);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.md5);
        parcel.writeString(this.root);
        parcel.writeString(this.main);
        parcel.writeString(this.output);
        parcel.writeStringList(this.dependencies);
        parcel.writeString(this.type);
        List<PreloadSubpackageInfo> list = this.parallelPreloadSubpackages;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<PreloadSubpackageInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public MinisPkg(String str, String str2, String str3, String str4, String str5, List<String> list, String str6, List<PreloadSubpackageInfo> list2) {
        this.url = str;
        this.md5 = str2;
        this.root = str3;
        this.main = str4;
        this.output = str5;
        this.dependencies = list;
        this.type = str6;
        this.parallelPreloadSubpackages = list2;
    }

    public MinisPkg(String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? C13BV.INSTANCE : list, str6, (i & 128) != 0 ? null : list2);
    }
}
