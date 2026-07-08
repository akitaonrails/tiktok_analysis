package ttp.orbu.sdk.repository.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.m2;
import ttpobfuscated.n0;

/* JADX INFO: loaded from: classes14.dex */
public final class DBEvent implements Parcelable {
    public static final Parcelable.Creator<DBEvent> CREATOR = new a();
    public final UUID a;
    public final Date b;
    public final String c;
    public final String d;

    public final Date b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DBEvent)) {
            return false;
        }
        DBEvent dBEvent = (DBEvent) obj;
        return Intrinsics.LJFF(this.a, dBEvent.a) && Intrinsics.LJFF(this.b, dBEvent.b) && Intrinsics.LJFF(this.c, dBEvent.c) && Intrinsics.LJFF(this.d, dBEvent.d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public int hashCode() {
        return this.d.hashCode() + m2.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DBEvent(id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", kind=");
        sb.append(this.c);
        sb.append(", metadata=");
        return n0.a(sb, this.d, ')');
    }

    public final UUID a() {
        return this.a;
    }

    public final UUID e() {
        return this.a;
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.d;
    }

    public final Date h() {
        return this.b;
    }

    public static final class a implements Parcelable.Creator<DBEvent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBEvent createFromParcel(Parcel parcel) {
            return new DBEvent((UUID) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public DBEvent[] newArray(int i) {
            return new DBEvent[i];
        }

        public final DBEvent[] a(int i) {
            return new DBEvent[i];
        }
    }

    public DBEvent(UUID uuid, Date date, String str, String str2) {
        this.a = uuid;
        this.b = date;
        this.c = str;
        this.d = str2;
    }

    public final DBEvent a(UUID uuid, Date date, String str, String str2) {
        return new DBEvent(uuid, date, str, str2);
    }

    public static /* synthetic */ DBEvent a(DBEvent dBEvent, UUID uuid, Date date, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = dBEvent.a;
        }
        if ((i & 2) != 0) {
            date = dBEvent.b;
        }
        if ((i & 4) != 0) {
            str = dBEvent.c;
        }
        if ((i & 8) != 0) {
            str2 = dBEvent.d;
        }
        return dBEvent.a(uuid, date, str, str2);
    }
}
