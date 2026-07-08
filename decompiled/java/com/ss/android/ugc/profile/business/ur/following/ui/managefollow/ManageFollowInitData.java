package com.ss.android.ugc.profile.business.ur.following.ui.managefollow;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowCursor;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowInitData;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ManageFollowInitData implements Parcelable {
    public final ManageFollowCursor cursor;
    public final boolean hasMore;
    public final List<ManageFollowItem> itemList;
    public static final Parcelable.Creator<ManageFollowInitData> CREATOR = new Parcelable.Creator<ManageFollowInitData>() { // from class: X.15jT
        @Override // android.os.Parcelable.Creator
        public final ManageFollowInitData createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            boolean z = false;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ManageFollowItem.CREATOR.createFromParcel(parcel));
            }
            ManageFollowCursor manageFollowCursorCreateFromParcel = ManageFollowCursor.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new ManageFollowInitData(arrayList, manageFollowCursorCreateFromParcel, z);
        }

        @Override // android.os.Parcelable.Creator
        public final ManageFollowInitData[] newArray(int i) {
            return new ManageFollowInitData[i];
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
        if (!(obj instanceof ManageFollowInitData)) {
            return false;
        }
        ManageFollowInitData manageFollowInitData = (ManageFollowInitData) obj;
        return Intrinsics.LJFF(this.itemList, manageFollowInitData.itemList) && Intrinsics.LJFF(this.cursor, manageFollowInitData.cursor) && this.hasMore == manageFollowInitData.hasMore;
    }

    public final int hashCode() {
        return (((this.itemList.hashCode() * 31) + this.cursor.hashCode()) * 31) + C786410Ut5.Z2(this.hasMore);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManageFollowInitData(itemList=");
        sbLIZ.append(this.itemList);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ManageFollowItem> list = this.itemList;
        parcel.writeInt(list.size());
        Iterator<ManageFollowItem> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        this.cursor.writeToParcel(parcel, i);
        parcel.writeInt(this.hasMore ? 1 : 0);
    }

    public ManageFollowInitData(List<ManageFollowItem> list, ManageFollowCursor manageFollowCursor, boolean z) {
        this.itemList = list;
        this.cursor = manageFollowCursor;
        this.hasMore = z;
    }
}
