package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VirtualInfoModule;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VirtualInfoModule implements Parcelable {

    @C09CT("content")
    public ECRichText content;

    @C09CT("header")
    public ECRichText header;

    @C09CT("schema")
    public String schema;

    @C09CT("user_virtual_info")
    public UserVirtualInfo userVirtualInfo;
    public static final Parcelable.Creator<VirtualInfoModule> CREATOR = new Parcelable.Creator<VirtualInfoModule>() { // from class: X.02iM
        @Override // android.os.Parcelable.Creator
        public final VirtualInfoModule createFromParcel(Parcel parcel) {
            UserVirtualInfo userVirtualInfoCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(VirtualInfoModule.class.getClassLoader());
            ECRichText eCRichText2 = (ECRichText) parcel.readParcelable(VirtualInfoModule.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                userVirtualInfoCreateFromParcel = null;
            } else {
                userVirtualInfoCreateFromParcel = UserVirtualInfo.CREATOR.createFromParcel(parcel);
            }
            return new VirtualInfoModule(eCRichText, eCRichText2, string, userVirtualInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VirtualInfoModule[] newArray(int i) {
            return new VirtualInfoModule[i];
        }
    };
    public static final int $stable = 8;

    public VirtualInfoModule() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualInfoModule)) {
            return false;
        }
        VirtualInfoModule virtualInfoModule = (VirtualInfoModule) obj;
        return Intrinsics.LJFF(this.header, virtualInfoModule.header) && Intrinsics.LJFF(this.content, virtualInfoModule.content) && Intrinsics.LJFF(this.schema, virtualInfoModule.schema) && Intrinsics.LJFF(this.userVirtualInfo, virtualInfoModule.userVirtualInfo);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.header;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        ECRichText eCRichText2 = this.content;
        int iHashCode2 = (iHashCode + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        String str = this.schema;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        UserVirtualInfo userVirtualInfo = this.userVirtualInfo;
        return iHashCode3 + (userVirtualInfo != null ? userVirtualInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VirtualInfoModule(header=");
        sbLIZ.append(this.header);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", userVirtualInfo=");
        sbLIZ.append(this.userVirtualInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.header, i);
        parcel.writeParcelable(this.content, i);
        parcel.writeString(this.schema);
        UserVirtualInfo userVirtualInfo = this.userVirtualInfo;
        if (userVirtualInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userVirtualInfo.writeToParcel(parcel, i);
        }
    }

    public VirtualInfoModule(ECRichText eCRichText, ECRichText eCRichText2, String str, UserVirtualInfo userVirtualInfo) {
        this.header = eCRichText;
        this.content = eCRichText2;
        this.schema = str;
        this.userVirtualInfo = userVirtualInfo;
    }
}
