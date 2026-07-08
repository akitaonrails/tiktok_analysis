package com.ss.android.ugc.aweme.im.message.template.component;

import X.C13BV;
import X.C2188811AlT;
import X.C2243651Crj;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.AvatarDuoInfoComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class AvatarDuoInfoComponent implements BaseComponent<C2243651Crj> {
    public static final Parcelable.Creator<AvatarDuoInfoComponent> CREATOR = new Parcelable.Creator<AvatarDuoInfoComponent>() { // from class: X.0HsU
        @Override // android.os.Parcelable.Creator
        public final AvatarDuoInfoComponent createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new AvatarDuoInfoComponent(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AvatarDuoInfoComponent[] newArray(int i) {
            return new AvatarDuoInfoComponent[i];
        }
    };
    public final List<Long> userIdList;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvatarDuoInfoComponent) && Intrinsics.LJFF(this.userIdList, ((AvatarDuoInfoComponent) obj).userIdList);
    }

    public final int hashCode() {
        return this.userIdList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarDuoInfoComponent(userIdList=");
        sbLIZ.append(this.userIdList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Long> list = this.userIdList;
        parcel.writeInt(list.size());
        Iterator<Long> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeLong(it2.next().longValue());
        }
    }

    public AvatarDuoInfoComponent() {
        this(C13BV.INSTANCE);
    }

    public AvatarDuoInfoComponent(List<Long> list) {
        this.userIdList = list;
    }
}
