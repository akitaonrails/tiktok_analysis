package com.ss.android.ugc.effectmanager.common.model;

import X.C01GW;
import X.C09CT;
import X.C13GX;
import X.C13HG;
import X.C13HI;
import X.C19989713Jf;
import X.C19989813Jg;
import X.C2188811AlT;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC1841100y0i;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986513Hz;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public class UrlModel implements Serializable, Parcelable {
    public static final C01GW<C13HG<Object>>[] $childSerializers;

    @C09CT("md5")
    public String md5;

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> url_list;

    @C09CT("url_prefix")
    public List<String> url_prefix;

    @C09CT("url_sub_type")
    public Integer url_sub_type;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<UrlModel> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<UrlModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UrlModel createFromParcel(Parcel parcel) {
            return new UrlModel(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UrlModel[] newArray(int i) {
            return new UrlModel[i];
        }
    }

    public UrlModel() {
        this(new ArrayList(), null, null, null, null);
    }

    public static /* synthetic */ void getMd5$annotations() {
    }

    public static /* synthetic */ void getUri$annotations() {
    }

    public static /* synthetic */ void getUrl_list$annotations() {
    }

    public static /* synthetic */ void getUrl_prefix$annotations() {
    }

    public static /* synthetic */ void getUrl_sub_type$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeStringList(this.url_list);
        parcel.writeStringList(this.url_prefix);
        parcel.writeString(this.uri);
        parcel.writeString(this.md5);
        Integer num = this.url_sub_type;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.PUBLICATION;
        $childSerializers = new C01GW[]{C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(160)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(161)), null, null, null};
    }

    public final List<String> getUrlList() {
        List<String> url_list = getUrl_list();
        if (url_list == null) {
            url_list = new ArrayList<>();
        }
        if (getUrl_list() == null) {
            setUrl_list(url_list);
        }
        return url_list;
    }

    public int hashCode() {
        List<String> url_list = getUrl_list();
        int iHashCode = (url_list != null ? url_list.hashCode() : 0) * 31;
        List<String> url_prefix = getUrl_prefix();
        int iHashCode2 = (iHashCode + (url_prefix != null ? url_prefix.hashCode() : 0)) * 31;
        String uri = getUri();
        int iHashCode3 = (iHashCode2 + (uri != null ? uri.hashCode() : 0)) * 31;
        String md5 = getMd5();
        int iHashCode4 = (iHashCode3 + (md5 != null ? md5.hashCode() : 0)) * 31;
        Integer url_sub_type = getUrl_sub_type();
        return iHashCode4 + (url_sub_type != null ? url_sub_type.intValue() : 0);
    }

    public final boolean isValid() {
        List<String> urlList = getUrlList();
        return !(urlList == null || urlList.isEmpty());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UrlModel(url_list=");
        sbLIZ.append(getUrl_list());
        sbLIZ.append(", url_sub_type=");
        sbLIZ.append(getUrl_sub_type());
        sbLIZ.append(", url_prefix=");
        sbLIZ.append(getUrl_prefix());
        sbLIZ.append(", uri=");
        sbLIZ.append(getUri());
        sbLIZ.append(", md5=");
        sbLIZ.append(getMd5());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Companion {
        public final C13HG<UrlModel> serializer() {
            return UrlModel$$serializer.INSTANCE;
        }
    }

    public String getMd5() {
        return this.md5;
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrl_list() {
        return this.url_list;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public Integer getUrl_sub_type() {
        return this.url_sub_type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        if (Intrinsics.LJFF(getUrl_list(), urlModel.getUrl_list()) && Intrinsics.LJFF(getUrl_prefix(), urlModel.getUrl_prefix()) && Intrinsics.LJFF(getUri(), urlModel.getUri()) && Intrinsics.LJFF(getMd5(), urlModel.getMd5()) && Intrinsics.LJFF(getUrl_sub_type(), urlModel.getUrl_sub_type())) {
            return true;
        }
        return false;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public final void setUrlList(List<String> list) {
        setUrl_list(list);
    }

    public void setUrl_list(List<String> list) {
        this.url_list = list;
    }

    public void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public void setUrl_sub_type(Integer num) {
        this.url_sub_type = num;
    }

    public static final /* synthetic */ void write$Self(UrlModel urlModel, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        C01GW<C13HG<Object>>[] c01gwArr = $childSerializers;
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(urlModel.getUrl_list(), new ArrayList())) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 0, c01gwArr[0].getValue(), urlModel.getUrl_list());
        }
        if (interfaceC19986513Hz.LJIJJ() || urlModel.getUrl_prefix() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), urlModel.getUrl_prefix());
        }
        if (interfaceC19986513Hz.LJIJJ() || urlModel.getUri() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 2, C13GX.LIZ, urlModel.getUri());
        }
        if (interfaceC19986513Hz.LJIJJ() || urlModel.getMd5() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 3, C13GX.LIZ, urlModel.getMd5());
        }
        if (interfaceC19986513Hz.LJIJJ() || urlModel.getUrl_sub_type() != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 4, C13HI.LIZ, urlModel.getUrl_sub_type());
        }
    }

    public UrlModel(List<String> list, List<String> list2, String str, String str2, Integer num) {
        this.url_list = list;
        this.url_prefix = list2;
        this.uri = str;
        this.md5 = str2;
        this.url_sub_type = num;
    }

    public /* synthetic */ UrlModel(int i, List list, List list2, String str, String str2, Integer num, C19989813Jg c19989813Jg) {
        if (0 == 0) {
            this.url_list = (i & 1) == 0 ? new ArrayList() : list;
            if ((i & 2) == 0) {
                this.url_prefix = null;
            } else {
                this.url_prefix = list2;
            }
            if ((i & 4) == 0) {
                this.uri = null;
            } else {
                this.uri = str;
            }
            if ((i & 8) == 0) {
                this.md5 = null;
            } else {
                this.md5 = str2;
            }
            if ((i & 16) == 0) {
                this.url_sub_type = null;
                return;
            } else {
                this.url_sub_type = num;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, UrlModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
}
