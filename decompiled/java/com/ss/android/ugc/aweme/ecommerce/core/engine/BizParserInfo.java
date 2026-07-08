package com.ss.android.ugc.aweme.ecommerce.core.engine;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.core.engine.BizParserInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BizParserInfo implements Parcelable {

    @C09CT("biz_line")
    public String biz_line;

    @C09CT("page_name")
    public String page_name;

    @C09CT("region")
    public String region;

    @C09CT("template")
    public Integer template;
    public static final Parcelable.Creator<BizParserInfo> CREATOR = new Parcelable.Creator<BizParserInfo>() { // from class: X.02nv
        @Override // android.os.Parcelable.Creator
        public final BizParserInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new BizParserInfo(string, string2, string3, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BizParserInfo[] newArray(int i) {
            return new BizParserInfo[i];
        }
    };
    public static final int $stable = 8;

    public BizParserInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizParserInfo)) {
            return false;
        }
        BizParserInfo bizParserInfo = (BizParserInfo) obj;
        return Intrinsics.LJFF(this.region, bizParserInfo.region) && Intrinsics.LJFF(this.biz_line, bizParserInfo.biz_line) && Intrinsics.LJFF(this.page_name, bizParserInfo.page_name) && Intrinsics.LJFF(this.template, bizParserInfo.template);
    }

    public final int hashCode() {
        String str = this.region;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.biz_line;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.page_name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.template;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizParserInfo(region=");
        sbLIZ.append(this.region);
        sbLIZ.append(", biz_line=");
        sbLIZ.append(this.biz_line);
        sbLIZ.append(", page_name=");
        sbLIZ.append(this.page_name);
        sbLIZ.append(", template=");
        sbLIZ.append(this.template);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.region);
        parcel.writeString(this.biz_line);
        parcel.writeString(this.page_name);
        Integer num = this.template;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public BizParserInfo(String str, String str2, String str3, Integer num) {
        this.region = str;
        this.biz_line = str2;
        this.page_name = str3;
        this.template = num;
    }
}
