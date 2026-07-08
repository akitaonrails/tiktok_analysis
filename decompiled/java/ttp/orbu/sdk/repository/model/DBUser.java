package ttp.orbu.sdk.repository.model;

import X.C13BV;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.jg;
import ttpobfuscated.m2;
import ttpobfuscated.xb;

/* JADX INFO: loaded from: classes14.dex */
public final class DBUser implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final List<String> g;
    public final boolean h;
    public static final a i = new a();
    public static final Parcelable.Creator<DBUser> CREATOR = new b();

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DBUser)) {
            return false;
        }
        DBUser dBUser = (DBUser) obj;
        return Intrinsics.LJFF(this.a, dBUser.a) && Intrinsics.LJFF(this.b, dBUser.b) && Intrinsics.LJFF(this.c, dBUser.c) && this.d == dBUser.d && Intrinsics.LJFF(this.e, dBUser.e) && Intrinsics.LJFF(this.f, dBUser.f) && Intrinsics.LJFF(this.g, dBUser.g) && this.h == dBUser.h;
    }

    public final String f() {
        return this.f;
    }

    public final List<String> g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public String toString() {
        return "DBUser(userId=" + this.a + ", deviceId=" + this.b + ", region=" + this.c + ", lastUpdateTime=" + this.d + ", clientIdentifier=" + this.e + ", regionStatus=" + this.f + ", exRegions=" + this.g + ", activated=" + this.h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeStringList(this.g);
        parcel.writeInt(this.h ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        int iHashCode = (this.g.hashCode() + m2.a(this.f, m2.a(this.e, (C786410Ut5.Y2(this.d) + m2.a(this.c, m2.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31), 31)) * 31;
        boolean z = this.h;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode + r0;
    }

    public final jg q() {
        return new jg(this.a, this.b, this.c, this.d, this.e, new ArrayList(this.g), xb.a.a(this.f), this.h);
    }

    public final String a() {
        return this.a;
    }

    public final boolean i() {
        return this.h;
    }

    public final String j() {
        return this.e;
    }

    public final String k() {
        return this.b;
    }

    public final List<String> l() {
        return this.g;
    }

    public final long m() {
        return this.d;
    }

    public final String n() {
        return this.c;
    }

    public final String o() {
        return this.f;
    }

    public final String p() {
        return this.a;
    }

    public static final class a {
        public final DBUser a(jg jgVar) {
            String strName;
            String str = jgVar.a;
            String str2 = jgVar.b;
            String str3 = jgVar.c;
            long j = jgVar.d;
            String str4 = jgVar.e;
            xb xbVar = jgVar.g;
            if (xbVar == null || (strName = xbVar.name()) == null) {
                strName = "";
            }
            return new DBUser(str, str2, str3, j, str4, strName, jgVar.f, jgVar.h);
        }
    }

    public static final class b implements Parcelable.Creator<DBUser> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBUser createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j = parcel.readLong();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new DBUser(string, string2, string3, j, string4, string5, arrayListCreateStringArrayList, z);
        }

        @Override // android.os.Parcelable.Creator
        public DBUser[] newArray(int i) {
            return new DBUser[i];
        }

        public final DBUser[] a(int i) {
            return new DBUser[i];
        }
    }

    public DBUser(String str, String str2, String str3, long j, String str4, String str5, List<String> list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
        this.g = list;
        this.h = z;
    }

    public final DBUser a(String str, String str2, String str3, long j, String str4, String str5, List<String> list, boolean z) {
        return new DBUser(str, str2, str3, j, str4, str5, list, z);
    }

    public DBUser(String str, String str2, String str3, long j, String str4, String str5, List list, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? C13BV.INSTANCE : list, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DBUser a(DBUser dBUser, String str, String str2, String str3, long j, String str4, String str5, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dBUser.a;
        }
        if ((i2 & 2) != 0) {
            str2 = dBUser.b;
        }
        if ((i2 & 4) != 0) {
            str3 = dBUser.c;
        }
        if ((i2 & 8) != 0) {
            j = dBUser.d;
        }
        if ((i2 & 16) != 0) {
            str4 = dBUser.e;
        }
        if ((i2 & 32) != 0) {
            str5 = dBUser.f;
        }
        if ((i2 & 64) != 0) {
            list = dBUser.g;
        }
        if ((i2 & 128) != 0) {
            z = dBUser.h;
        }
        return dBUser.a(str, str2, str3, j, str4, str5, list, z);
    }
}
