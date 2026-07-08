package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C13BV;
import X.C1C3L;
import X.C2188811AlT;
import X.C452501pT;
import X.C906610ZhT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.MetadataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MetadataEntryComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class MetadataComponent implements BaseComponent<C1C3L> {
    public final List<MetadataEntryComponent> entries;
    public static final C906610ZhT Companion = new Object() { // from class: X.0ZhT
    };
    public static final Parcelable.Creator<MetadataComponent> CREATOR = new Parcelable.Creator<MetadataComponent>() { // from class: X.0ZhR
        @Override // android.os.Parcelable.Creator
        public final MetadataComponent createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(MetadataEntryComponent.CREATOR.createFromParcel(parcel));
            }
            return new MetadataComponent(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MetadataComponent[] newArray(int i) {
            return new MetadataComponent[i];
        }
    };
    public static final C01GW<MetadataComponent> EMPTY$delegate = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(133));

    public MetadataComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MetadataComponent) && Intrinsics.LJFF(this.entries, ((MetadataComponent) obj).entries);
    }

    public final int hashCode() {
        return this.entries.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MetadataComponent(entries=");
        sbLIZ.append(this.entries);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MetadataEntryComponent> list = this.entries;
        parcel.writeInt(list.size());
        Iterator<MetadataEntryComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public MetadataComponent(int i) {
        this(C13BV.INSTANCE);
    }

    public MetadataComponent(List<MetadataEntryComponent> list) {
        this.entries = list;
    }
}
