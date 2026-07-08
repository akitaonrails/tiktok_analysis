package com.stripe.android.pushProvisioning;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.stripe.android.pushProvisioning.c;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b implements Parcelable {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;

    public static abstract class a<TEphemeralKey extends b> {
    }

    public b(long j, long j2, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.b = j;
        this.a = str;
        this.c = j2;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public b(Parcel parcel) {
        this.b = parcel.readLong();
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.a = string;
        this.c = parcel.readLong();
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.d = string2;
        this.e = parcel.readInt() == 1;
        String string3 = parcel.readString();
        Objects.requireNonNull(string3);
        this.f = string3;
        String string4 = parcel.readString();
        Objects.requireNonNull(string4);
        this.g = string4;
        String string5 = parcel.readString();
        Objects.requireNonNull(string5);
        this.h = string5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeString(this.a);
        parcel.writeLong(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    public static c LIZ(JSONObject jSONObject, c.b bVar) {
        long j = JSONObjectProtectorUtils.getLong(jSONObject, "created");
        long j2 = JSONObjectProtectorUtils.getLong(jSONObject, "expires");
        String string = JSONObjectProtectorUtils.getString(jSONObject, FollowStatusChangeMethod.PARAM_UID);
        boolean z = JSONObjectProtectorUtils.getBoolean(jSONObject, "livemode");
        String string2 = JSONObjectProtectorUtils.getString(jSONObject, "object");
        String string3 = JSONObjectProtectorUtils.getString(jSONObject, "secret");
        JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONArray(jSONObject, "associated_objects"), 0);
        return new c(j, JSONObjectProtectorUtils.getString(jSONObject2, FollowStatusChangeMethod.PARAM_UID), j2, string, z, string2, string3, JSONObjectProtectorUtils.getString(jSONObject2, "type"));
    }
}
