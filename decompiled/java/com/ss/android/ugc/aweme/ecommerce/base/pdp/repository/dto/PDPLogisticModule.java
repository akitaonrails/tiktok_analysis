package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticMeta;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticUIConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPReturnPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingServiceModule;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PDPLogisticModule implements Parcelable {

    @C09CT("ec_module_title")
    public final ECRichText ecModuleTitle;

    @C09CT("meta")
    public final PDPLogisticMeta meta;

    @C09CT("module_id")
    public final String moduleId;

    @C09CT("module_title")
    public final String moduleTitle;

    @C09CT("return_policy_module")
    public final PDPReturnPolicyModule pdpReturnPolicyModule;

    @C09CT("shipping_module")
    public final PDPShippingModule pdpShippingModule;

    @C09CT("shipping_service_module")
    public final PDPShippingServiceModule pdpShippingServiceModule;

    @C09CT("shipping_module_map")
    public final Map<String, PDPShippingModule> shippingModuleMap;

    @C09CT("ui_config")
    public final PDPLogisticUIConfig uiConfig;
    public static final Parcelable.Creator<PDPLogisticModule> CREATOR = new Parcelable.Creator<PDPLogisticModule>() { // from class: X.03KG
        @Override // android.os.Parcelable.Creator
        public final PDPLogisticModule createFromParcel(Parcel parcel) {
            PDPLogisticMeta pDPLogisticMetaCreateFromParcel;
            PDPShippingModule pDPShippingModuleCreateFromParcel;
            PDPShippingServiceModule pDPShippingServiceModuleCreateFromParcel;
            PDPReturnPolicyModule pDPReturnPolicyModuleCreateFromParcel;
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            PDPLogisticUIConfig pDPLogisticUIConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                pDPLogisticMetaCreateFromParcel = null;
            } else {
                pDPLogisticMetaCreateFromParcel = PDPLogisticMeta.CREATOR.createFromParcel(parcel);
            }
            PDPLogisticMeta pDPLogisticMeta = pDPLogisticMetaCreateFromParcel;
            String string2 = parcel.readString();
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(PDPLogisticModule.class.getClassLoader());
            if (parcel.readInt() == 0) {
                pDPShippingModuleCreateFromParcel = null;
            } else {
                pDPShippingModuleCreateFromParcel = PDPShippingModule.CREATOR.createFromParcel(parcel);
            }
            PDPShippingModule pDPShippingModule = pDPShippingModuleCreateFromParcel;
            if (parcel.readInt() == 0) {
                pDPShippingServiceModuleCreateFromParcel = null;
            } else {
                pDPShippingServiceModuleCreateFromParcel = PDPShippingServiceModule.CREATOR.createFromParcel(parcel);
            }
            PDPShippingServiceModule pDPShippingServiceModule = pDPShippingServiceModuleCreateFromParcel;
            if (parcel.readInt() == 0) {
                pDPReturnPolicyModuleCreateFromParcel = null;
            } else {
                pDPReturnPolicyModuleCreateFromParcel = PDPReturnPolicyModule.CREATOR.createFromParcel(parcel);
            }
            PDPReturnPolicyModule pDPReturnPolicyModule = pDPReturnPolicyModuleCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), PDPShippingModule.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                pDPLogisticUIConfigCreateFromParcel = PDPLogisticUIConfig.CREATOR.createFromParcel(parcel);
            }
            return new PDPLogisticModule(string, pDPLogisticMeta, string2, eCRichText, pDPShippingModule, pDPShippingServiceModule, pDPReturnPolicyModule, linkedHashMap, pDPLogisticUIConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PDPLogisticModule[] newArray(int i) {
            return new PDPLogisticModule[i];
        }
    };
    public static final int $stable = 8;

    public PDPLogisticModule() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPLogisticModule)) {
            return false;
        }
        PDPLogisticModule pDPLogisticModule = (PDPLogisticModule) obj;
        return Intrinsics.LJFF(this.moduleId, pDPLogisticModule.moduleId) && Intrinsics.LJFF(this.meta, pDPLogisticModule.meta) && Intrinsics.LJFF(this.moduleTitle, pDPLogisticModule.moduleTitle) && Intrinsics.LJFF(this.ecModuleTitle, pDPLogisticModule.ecModuleTitle) && Intrinsics.LJFF(this.pdpShippingModule, pDPLogisticModule.pdpShippingModule) && Intrinsics.LJFF(this.pdpShippingServiceModule, pDPLogisticModule.pdpShippingServiceModule) && Intrinsics.LJFF(this.pdpReturnPolicyModule, pDPLogisticModule.pdpReturnPolicyModule) && Intrinsics.LJFF(this.shippingModuleMap, pDPLogisticModule.shippingModuleMap) && Intrinsics.LJFF(this.uiConfig, pDPLogisticModule.uiConfig);
    }

    public final int hashCode() {
        String str = this.moduleId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PDPLogisticMeta pDPLogisticMeta = this.meta;
        int iHashCode2 = (iHashCode + (pDPLogisticMeta == null ? 0 : pDPLogisticMeta.hashCode())) * 31;
        String str2 = this.moduleTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ECRichText eCRichText = this.ecModuleTitle;
        int iHashCode4 = (iHashCode3 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        PDPShippingModule pDPShippingModule = this.pdpShippingModule;
        int iHashCode5 = (iHashCode4 + (pDPShippingModule == null ? 0 : pDPShippingModule.hashCode())) * 31;
        PDPShippingServiceModule pDPShippingServiceModule = this.pdpShippingServiceModule;
        int iHashCode6 = (iHashCode5 + (pDPShippingServiceModule == null ? 0 : pDPShippingServiceModule.hashCode())) * 31;
        PDPReturnPolicyModule pDPReturnPolicyModule = this.pdpReturnPolicyModule;
        int iHashCode7 = (iHashCode6 + (pDPReturnPolicyModule == null ? 0 : pDPReturnPolicyModule.hashCode())) * 31;
        Map<String, PDPShippingModule> map = this.shippingModuleMap;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        PDPLogisticUIConfig pDPLogisticUIConfig = this.uiConfig;
        return iHashCode8 + (pDPLogisticUIConfig != null ? pDPLogisticUIConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPLogisticModule(moduleId=");
        sbLIZ.append(this.moduleId);
        sbLIZ.append(", meta=");
        sbLIZ.append(this.meta);
        sbLIZ.append(", moduleTitle=");
        sbLIZ.append(this.moduleTitle);
        sbLIZ.append(", ecModuleTitle=");
        sbLIZ.append(this.ecModuleTitle);
        sbLIZ.append(", pdpShippingModule=");
        sbLIZ.append(this.pdpShippingModule);
        sbLIZ.append(", pdpShippingServiceModule=");
        sbLIZ.append(this.pdpShippingServiceModule);
        sbLIZ.append(", pdpReturnPolicyModule=");
        sbLIZ.append(this.pdpReturnPolicyModule);
        sbLIZ.append(", shippingModuleMap=");
        sbLIZ.append(this.shippingModuleMap);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.uiConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.moduleId);
        PDPLogisticMeta pDPLogisticMeta = this.meta;
        if (pDPLogisticMeta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(pDPLogisticMeta.pdpToLogisticListInfo);
        }
        parcel.writeString(this.moduleTitle);
        parcel.writeParcelable(this.ecModuleTitle, i);
        PDPShippingModule pDPShippingModule = this.pdpShippingModule;
        if (pDPShippingModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPShippingModule.writeToParcel(parcel, i);
        }
        PDPShippingServiceModule pDPShippingServiceModule = this.pdpShippingServiceModule;
        if (pDPShippingServiceModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPShippingServiceModule.writeToParcel(parcel, i);
        }
        PDPReturnPolicyModule pDPReturnPolicyModule = this.pdpReturnPolicyModule;
        if (pDPReturnPolicyModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPReturnPolicyModule.writeToParcel(parcel, i);
        }
        Map<String, PDPShippingModule> map = this.shippingModuleMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, PDPShippingModule> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                entry.getValue().writeToParcel(parcel, i);
            }
        }
        PDPLogisticUIConfig pDPLogisticUIConfig = this.uiConfig;
        if (pDPLogisticUIConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPLogisticUIConfig.writeToParcel(parcel, i);
        }
    }

    public PDPLogisticModule(String str, PDPLogisticMeta pDPLogisticMeta, String str2, ECRichText eCRichText, PDPShippingModule pDPShippingModule, PDPShippingServiceModule pDPShippingServiceModule, PDPReturnPolicyModule pDPReturnPolicyModule, Map<String, PDPShippingModule> map, PDPLogisticUIConfig pDPLogisticUIConfig) {
        this.moduleId = str;
        this.meta = pDPLogisticMeta;
        this.moduleTitle = str2;
        this.ecModuleTitle = eCRichText;
        this.pdpShippingModule = pDPShippingModule;
        this.pdpShippingServiceModule = pDPShippingServiceModule;
        this.pdpReturnPolicyModule = pDPReturnPolicyModule;
        this.shippingModuleMap = map;
        this.uiConfig = pDPLogisticUIConfig;
    }
}
