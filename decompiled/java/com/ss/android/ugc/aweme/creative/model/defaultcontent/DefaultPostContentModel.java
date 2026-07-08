package com.ss.android.ugc.aweme.creative.model.defaultcontent;

import X.C040H;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.defaultcontent.DefaultPostContentModel;
import com.ss.android.ugc.aweme.shortvideo.model.TransAnchorData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class DefaultPostContentModel implements Parcelable {
    public static final Parcelable.Creator<DefaultPostContentModel> CREATOR = new Parcelable.Creator<DefaultPostContentModel>() { // from class: X.0Mio
        @Override // android.os.Parcelable.Creator
        public final DefaultPostContentModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(DefaultPostContentModel.class.getClassLoader()));
            }
            return new DefaultPostContentModel(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DefaultPostContentModel[] newArray(int i) {
            return new DefaultPostContentModel[i];
        }
    };

    @C09CT("default_post_anchors")
    public final List<TransAnchorData> defaultAnchors;

    @C040H
    public String defaultDescription;

    @C040H
    public String defaultTitle;

    public DefaultPostContentModel() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultPostContentModel)) {
            return false;
        }
        DefaultPostContentModel defaultPostContentModel = (DefaultPostContentModel) obj;
        return Intrinsics.LJFF(this.defaultTitle, defaultPostContentModel.defaultTitle) && Intrinsics.LJFF(this.defaultDescription, defaultPostContentModel.defaultDescription) && Intrinsics.LJFF(this.defaultAnchors, defaultPostContentModel.defaultAnchors);
    }

    public final int hashCode() {
        return (((this.defaultTitle.hashCode() * 31) + this.defaultDescription.hashCode()) * 31) + this.defaultAnchors.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultPostContentModel(defaultTitle=");
        sbLIZ.append(this.defaultTitle);
        sbLIZ.append(", defaultDescription=");
        sbLIZ.append(this.defaultDescription);
        sbLIZ.append(", defaultAnchors=");
        sbLIZ.append(this.defaultAnchors);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.defaultTitle);
        parcel.writeString(this.defaultDescription);
        List<TransAnchorData> list = this.defaultAnchors;
        parcel.writeInt(list.size());
        Iterator<TransAnchorData> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public DefaultPostContentModel(String str, String str2, List<TransAnchorData> list) {
        this.defaultTitle = str;
        this.defaultDescription = str2;
        this.defaultAnchors = list;
    }

    public DefaultPostContentModel(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
