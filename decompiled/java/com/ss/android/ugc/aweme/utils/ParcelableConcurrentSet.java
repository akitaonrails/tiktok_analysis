package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C1439420nYq;
import X.C1466660oGm;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes23.dex */
public final class ParcelableConcurrentSet implements Parcelable {

    @C09CT("effect_inner_set")
    public final Set<String> set;
    public static final C1439420nYq Companion = new Object() { // from class: X.0nYq
    };
    public static final Parcelable.Creator<ParcelableConcurrentSet> CREATOR = new C1466660oGm(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableConcurrentSet() {
        this((Set<String>) Collections.newSetFromMap(new ConcurrentHashMap()));
    }

    public ParcelableConcurrentSet(Parcel parcel) {
        this();
        Set<String> set = this.set;
        Collection<? extends String> collectionCreateStringArrayList = parcel.createStringArrayList();
        set.addAll(collectionCreateStringArrayList == null ? C13BV.INSTANCE : collectionCreateStringArrayList);
    }

    public final boolean LIZ(String str) {
        return this.set.add(str);
    }

    public ParcelableConcurrentSet(Set<String> set) {
        this.set = set;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(C13LP.LLIIII(this.set));
    }
}
