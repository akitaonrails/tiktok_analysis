package com.ss.android.ugc.effectmanager.common.model;

import X.C01GW;
import X.C09CT;
import X.C13HG;
import X.C13HI;
import X.C19989713Jf;
import X.C19989813Jg;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
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
public final class MaterialResource implements Serializable, Parcelable {
    public final Integer assetType;

    @C09CT("BaseInfo")
    public final BaseInfo baseInfo;

    @C09CT("CDNList")
    public final List<String> cdnList;
    public final boolean isAssetMaterial;

    @C09CT("resource_key")
    public final String resourceKey;
    public final boolean skipVerifyMd5;

    @C09CT("type")
    public final String type;

    @C09CT("uri")
    public final String uri;

    @C09CT("version")
    public final int version;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<MaterialResource> CREATOR = new Creator();
    public static final C01GW<C13HG<Object>>[] $childSerializers = {null, C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS219S0000000_30.get$arr$(159)), null, null, null, null, null, null, null};

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<MaterialResource> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MaterialResource createFromParcel(Parcel parcel) {
            return new MaterialResource(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : BaseInfo.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MaterialResource[] newArray(int i) {
            return new MaterialResource[i];
        }
    }

    public MaterialResource() {
        this("", new ArrayList(), "", null, 0, "", false, false, null);
    }

    public static /* synthetic */ void getBaseInfo$annotations() {
    }

    public static /* synthetic */ void getCdnList$annotations() {
    }

    public static /* synthetic */ void getResourceKey$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static /* synthetic */ void getUri$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public final MaterialResource copy(String str, List<String> list, String str2, BaseInfo baseInfo, int i, String str3, boolean z, boolean z2, Integer num) {
        return new MaterialResource(str, list, str2, baseInfo, i, str3, z, z2, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaterialResource)) {
            return false;
        }
        MaterialResource materialResource = (MaterialResource) obj;
        return Intrinsics.LJFF(this.resourceKey, materialResource.resourceKey) && Intrinsics.LJFF(this.cdnList, materialResource.cdnList) && Intrinsics.LJFF(this.uri, materialResource.uri) && Intrinsics.LJFF(this.baseInfo, materialResource.baseInfo) && this.version == materialResource.version && Intrinsics.LJFF(this.type, materialResource.type) && this.isAssetMaterial == materialResource.isAssetMaterial && this.skipVerifyMd5 == materialResource.skipVerifyMd5 && Intrinsics.LJFF(this.assetType, materialResource.assetType);
    }

    public int hashCode() {
        int iHashCode = ((((this.resourceKey.hashCode() * 31) + this.cdnList.hashCode()) * 31) + this.uri.hashCode()) * 31;
        BaseInfo baseInfo = this.baseInfo;
        int iHashCode2 = (((((((((iHashCode + (baseInfo == null ? 0 : baseInfo.hashCode())) * 31) + this.version) * 31) + this.type.hashCode()) * 31) + C786410Ut5.Z2(this.isAssetMaterial)) * 31) + C786410Ut5.Z2(this.skipVerifyMd5)) * 31;
        Integer num = this.assetType;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialResource(resourceKey=");
        sbLIZ.append(this.resourceKey);
        sbLIZ.append(", cdnList=");
        sbLIZ.append(this.cdnList);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", baseInfo=");
        sbLIZ.append(this.baseInfo);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", isAssetMaterial=");
        sbLIZ.append(this.isAssetMaterial);
        sbLIZ.append(", skipVerifyMd5=");
        sbLIZ.append(this.skipVerifyMd5);
        sbLIZ.append(", assetType=");
        sbLIZ.append(this.assetType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.resourceKey);
        parcel.writeStringList(this.cdnList);
        parcel.writeString(this.uri);
        BaseInfo baseInfo = this.baseInfo;
        if (baseInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.version);
        parcel.writeString(this.type);
        parcel.writeInt(this.isAssetMaterial ? 1 : 0);
        parcel.writeInt(this.skipVerifyMd5 ? 1 : 0);
        Integer num = this.assetType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public static final class Companion {
        public final C13HG<MaterialResource> serializer() {
            return MaterialResource$$serializer.INSTANCE;
        }
    }

    public final Integer getAssetType() {
        return this.assetType;
    }

    public final BaseInfo getBaseInfo() {
        return this.baseInfo;
    }

    public final List<String> getCdnList() {
        return this.cdnList;
    }

    public final String getResourceKey() {
        return this.resourceKey;
    }

    public final boolean getSkipVerifyMd5() {
        return this.skipVerifyMd5;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUri() {
        return this.uri;
    }

    public final int getVersion() {
        return this.version;
    }

    public final boolean isAssetMaterial() {
        return this.isAssetMaterial;
    }

    public static final /* synthetic */ void write$Self$ckresource_model_release(MaterialResource materialResource, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        C01GW<C13HG<Object>>[] c01gwArr = $childSerializers;
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(materialResource.resourceKey, "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 0, materialResource.resourceKey);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(materialResource.cdnList, new ArrayList())) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), materialResource.cdnList);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(materialResource.uri, "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 2, materialResource.uri);
        }
        if (interfaceC19986513Hz.LJIJJ() || materialResource.baseInfo != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 3, BaseInfo$$serializer.INSTANCE, materialResource.baseInfo);
        }
        if (interfaceC19986513Hz.LJIJJ() || materialResource.version != 0) {
            interfaceC19986513Hz.LJ(4, materialResource.version, interfaceC19983313Gt);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(materialResource.type, "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 5, materialResource.type);
        }
        if (interfaceC19986513Hz.LJIJJ() || materialResource.isAssetMaterial) {
            interfaceC19986513Hz.LJIIJ(interfaceC19983313Gt, 6, materialResource.isAssetMaterial);
        }
        if (interfaceC19986513Hz.LJIJJ() || materialResource.skipVerifyMd5) {
            interfaceC19986513Hz.LJIIJ(interfaceC19983313Gt, 7, materialResource.skipVerifyMd5);
        }
        if (interfaceC19986513Hz.LJIJJ() || materialResource.assetType != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 8, C13HI.LIZ, materialResource.assetType);
        }
    }

    public MaterialResource(String str, List<String> list, String str2, BaseInfo baseInfo, int i, String str3, boolean z, boolean z2, Integer num) {
        this.resourceKey = str;
        this.cdnList = list;
        this.uri = str2;
        this.baseInfo = baseInfo;
        this.version = i;
        this.type = str3;
        this.isAssetMaterial = z;
        this.skipVerifyMd5 = z2;
        this.assetType = num;
    }

    public /* synthetic */ MaterialResource(int i, String str, List list, String str2, BaseInfo baseInfo, int i2, String str3, boolean z, boolean z2, Integer num, C19989813Jg c19989813Jg) {
        if (0 == 0) {
            if ((i & 1) == 0) {
                this.resourceKey = "";
            } else {
                this.resourceKey = str;
            }
            if ((i & 2) == 0) {
                this.cdnList = new ArrayList();
            } else {
                this.cdnList = list;
            }
            if ((i & 4) == 0) {
                this.uri = "";
            } else {
                this.uri = str2;
            }
            if ((i & 8) == 0) {
                this.baseInfo = null;
            } else {
                this.baseInfo = baseInfo;
            }
            if ((i & 16) == 0) {
                this.version = 0;
            } else {
                this.version = i2;
            }
            if ((i & 32) == 0) {
                this.type = "";
            } else {
                this.type = str3;
            }
            if ((i & 64) == 0) {
                this.isAssetMaterial = false;
            } else {
                this.isAssetMaterial = z;
            }
            if ((i & 128) == 0) {
                this.skipVerifyMd5 = false;
            } else {
                this.skipVerifyMd5 = z2;
            }
            if ((i & 256) == 0) {
                this.assetType = null;
                return;
            } else {
                this.assetType = num;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, MaterialResource$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
}
