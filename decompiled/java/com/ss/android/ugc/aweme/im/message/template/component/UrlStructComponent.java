package com.ss.android.ugc.aweme.im.message.template.component;

import X.C1CUV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.UrlStructComponent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class UrlStructComponent implements BaseComponent<C1CUV> {
    public static final Parcelable.Creator<UrlStructComponent> CREATOR = new Parcelable.Creator<UrlStructComponent>() { // from class: X.0IBS
        @Override // android.os.Parcelable.Creator
        public final UrlStructComponent createFromParcel(Parcel parcel) {
            return new UrlStructComponent(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final UrlStructComponent[] newArray(int i) {
            return new UrlStructComponent[i];
        }
    };
    public final List<String> url_list;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UrlStructComponent) && Intrinsics.LJFF(this.url_list, ((UrlStructComponent) obj).url_list);
    }

    public final int hashCode() {
        return this.url_list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UrlStructComponent(url_list=");
        sbLIZ.append(this.url_list);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.url_list);
    }

    public UrlStructComponent(List<String> list) {
        this.url_list = list;
    }
}
