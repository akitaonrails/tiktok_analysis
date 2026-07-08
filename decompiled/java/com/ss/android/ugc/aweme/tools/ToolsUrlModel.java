package com.ss.android.ugc.aweme.tools;

import X.C09CT;
import X.C1698130uI7;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public class ToolsUrlModel implements Parcelable {
    public static final Parcelable.Creator<ToolsUrlModel> CREATOR = new C1698130uI7(4);

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urlList;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return (this.uri.hashCode() * 31) + this.urlList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolsUrlModel{uri='");
        sbLIZ.append(this.uri);
        sbLIZ.append('\'');
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ToolsUrlModel() {
    }

    public ToolsUrlModel(Parcel parcel) {
        this.uri = parcel.readString();
        this.urlList = parcel.createStringArrayList();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ToolsUrlModel toolsUrlModel = (ToolsUrlModel) obj;
        if (!this.uri.equals(toolsUrlModel.uri)) {
            return false;
        }
        return this.urlList.equals(toolsUrlModel.urlList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeStringList(this.urlList);
    }
}
