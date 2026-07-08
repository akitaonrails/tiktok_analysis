package ttp.orbu.sdk.repository.model;

import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class DBEventSent implements Parcelable {
    public static final Parcelable.Creator<DBEventSent> CREATOR = new a();
    public final String a;
    public final long b;

    public final long b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DBEventSent)) {
            return false;
        }
        DBEventSent dBEventSent = (DBEventSent) obj;
        return Intrinsics.LJFF(this.a, dBEventSent.a) && this.b == dBEventSent.b;
    }

    public int hashCode() {
        return C786410Ut5.Y2(this.b) + (this.a.hashCode() * 31);
    }

    public String toString() {
        return "DBEventSent(kind=" + this.a + ", lastSentDate=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
    }

    public final String a() {
        return this.a;
    }

    public final String c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public static final class a implements Parcelable.Creator<DBEventSent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBEventSent createFromParcel(Parcel parcel) {
            return new DBEventSent(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public DBEventSent[] newArray(int i) {
            return new DBEventSent[i];
        }

        public final DBEventSent[] a(int i) {
            return new DBEventSent[i];
        }
    }

    public DBEventSent(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final DBEventSent a(String str, long j) {
        return new DBEventSent(str, j);
    }

    public static DBEventSent a(DBEventSent dBEventSent, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dBEventSent.a;
        }
        if ((i & 2) != 0) {
            j = dBEventSent.b;
        }
        dBEventSent.getClass();
        return new DBEventSent(str, j);
    }
}
