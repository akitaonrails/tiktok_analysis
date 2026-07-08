package com.stripe.android.pushProvisioning;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.pushProvisioning.b;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends com.stripe.android.pushProvisioning.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    public static final class b extends b.a<c> {
    }

    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i) {
            return new c[i];
        }
    }

    public c(Parcel parcel) {
        super(parcel);
    }

    public c(long j, String str, long j2, String str2, boolean z, String str3, String str4, String str5) {
        super(j, j2, str, str2, str3, str4, str5, z);
    }
}
