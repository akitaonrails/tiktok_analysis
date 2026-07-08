package com.ss.android.ugc.aweme.im.message.template.card.dynamic;

import X.C2097608Jq;
import X.C2242071CpB;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicCardClientInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class DynamicInfoComponent implements BaseComponent<C2242071CpB> {
    public static final Parcelable.Creator<DynamicInfoComponent> CREATOR = new Parcelable.Creator<DynamicInfoComponent>() { // from class: X.18SW
        @Override // android.os.Parcelable.Creator
        public final DynamicInfoComponent createFromParcel(Parcel parcel) {
            DynamicUiLocationType dynamicUiLocationTypeCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            DynamicCardClientInfoComponent dynamicCardClientInfoComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                dynamicUiLocationTypeCreateFromParcel = null;
            } else {
                dynamicUiLocationTypeCreateFromParcel = DynamicUiLocationType.CREATOR.createFromParcel(parcel);
            }
            DynamicUiLocationType dynamicUiLocationType = dynamicUiLocationTypeCreateFromParcel;
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            if (parcel.readInt() != 0) {
                dynamicCardClientInfoComponentCreateFromParcel = DynamicCardClientInfoComponent.CREATOR.createFromParcel(parcel);
            }
            return new DynamicInfoComponent(string, string2, string3, string4, string5, string6, i, i2, dynamicUiLocationType, linkedHashMap, dynamicCardClientInfoComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicInfoComponent[] newArray(int i) {
            return new DynamicInfoComponent[i];
        }
    };
    public Map<String, String> bizParams;
    public String businessId;
    public String businessType;
    public String cardKey;
    public String cardTemplate;
    public int defaultHeight;
    public int defaultWidth;
    public DynamicCardClientInfoComponent dynamicCardClientInfo;
    public String rawData;
    public String schema;
    public DynamicUiLocationType uiLocationType;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public DynamicInfoComponent() {
        int i = 0;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 0 == true ? 1 : 0, 2047);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicInfoComponent)) {
            return false;
        }
        DynamicInfoComponent dynamicInfoComponent = (DynamicInfoComponent) obj;
        return Intrinsics.LJFF(this.cardKey, dynamicInfoComponent.cardKey) && Intrinsics.LJFF(this.schema, dynamicInfoComponent.schema) && Intrinsics.LJFF(this.cardTemplate, dynamicInfoComponent.cardTemplate) && Intrinsics.LJFF(this.rawData, dynamicInfoComponent.rawData) && Intrinsics.LJFF(this.businessType, dynamicInfoComponent.businessType) && Intrinsics.LJFF(this.businessId, dynamicInfoComponent.businessId) && this.defaultHeight == dynamicInfoComponent.defaultHeight && this.defaultWidth == dynamicInfoComponent.defaultWidth && this.uiLocationType == dynamicInfoComponent.uiLocationType && Intrinsics.LJFF(this.bizParams, dynamicInfoComponent.bizParams) && Intrinsics.LJFF(this.dynamicCardClientInfo, dynamicInfoComponent.dynamicCardClientInfo);
    }

    public final int hashCode() {
        String str = this.cardKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardTemplate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rawData;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.businessType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.businessId;
        int iHashCode6 = (((((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.defaultHeight) * 31) + this.defaultWidth) * 31;
        DynamicUiLocationType dynamicUiLocationType = this.uiLocationType;
        int iHashCode7 = (((iHashCode6 + (dynamicUiLocationType == null ? 0 : dynamicUiLocationType.hashCode())) * 31) + this.bizParams.hashCode()) * 31;
        DynamicCardClientInfoComponent dynamicCardClientInfoComponent = this.dynamicCardClientInfo;
        return iHashCode7 + (dynamicCardClientInfoComponent != null ? dynamicCardClientInfoComponent.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicInfoComponent(cardKey=" + this.cardKey + ", schema=" + this.schema + ", cardTemplate=" + this.cardTemplate + ", rawData=" + this.rawData + ", businessType=" + this.businessType + ", businessId=" + this.businessId + ", defaultHeight=" + this.defaultHeight + ", defaultWidth=" + this.defaultWidth + ", uiLocationType=" + this.uiLocationType + ", bizParams=" + this.bizParams + ", dynamicCardClientInfo=" + this.dynamicCardClientInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardKey);
        parcel.writeString(this.schema);
        parcel.writeString(this.cardTemplate);
        parcel.writeString(this.rawData);
        parcel.writeString(this.businessType);
        parcel.writeString(this.businessId);
        parcel.writeInt(this.defaultHeight);
        parcel.writeInt(this.defaultWidth);
        DynamicUiLocationType dynamicUiLocationType = this.uiLocationType;
        if (dynamicUiLocationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicUiLocationType.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.bizParams;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        DynamicCardClientInfoComponent dynamicCardClientInfoComponent = this.dynamicCardClientInfo;
        if (dynamicCardClientInfoComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicCardClientInfoComponent.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ DynamicInfoComponent(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, DynamicUiLocationType dynamicUiLocationType, int i3) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : str5, (i3 & 32) != 0 ? null : str6, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? DynamicUiLocationType.MESSAGE_NORMAL : dynamicUiLocationType, (i3 & 512) != 0 ? C2097608Jq.LJ() : null, null);
    }

    public DynamicInfoComponent(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, DynamicUiLocationType dynamicUiLocationType, Map<String, String> map, DynamicCardClientInfoComponent dynamicCardClientInfoComponent) {
        this.cardKey = str;
        this.schema = str2;
        this.cardTemplate = str3;
        this.rawData = str4;
        this.businessType = str5;
        this.businessId = str6;
        this.defaultHeight = i;
        this.defaultWidth = i2;
        this.uiLocationType = dynamicUiLocationType;
        this.bizParams = map;
        this.dynamicCardClientInfo = dynamicCardClientInfoComponent;
    }
}
