package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPopup;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.LogisticIcon;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class WarehouseTag implements Parcelable {

    @C09CT("arguments")
    public Map<String, String> arguments;

    @C09CT("fulfilled_by")
    public String fulfilledBy;

    @C09CT("icon")
    public LogisticIcon icon;

    @C09CT("popup")
    public ContentPopup popup;

    @C09CT("template")
    public String template;
    public static final Parcelable.Creator<WarehouseTag> CREATOR = new Parcelable.Creator<WarehouseTag>() { // from class: X.02hM
        @Override // android.os.Parcelable.Creator
        public final WarehouseTag createFromParcel(Parcel parcel) {
            LogisticIcon logisticIconCreateFromParcel;
            LinkedHashMap linkedHashMap;
            ContentPopup contentPopupCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                logisticIconCreateFromParcel = null;
            } else {
                logisticIconCreateFromParcel = LogisticIcon.CREATOR.createFromParcel(parcel);
            }
            LogisticIcon logisticIcon = logisticIconCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                contentPopupCreateFromParcel = ContentPopup.CREATOR.createFromParcel(parcel);
            }
            return new WarehouseTag(logisticIcon, string, linkedHashMap, contentPopupCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WarehouseTag[] newArray(int i) {
            return new WarehouseTag[i];
        }
    };
    public static final int $stable = 8;

    public WarehouseTag() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarehouseTag)) {
            return false;
        }
        WarehouseTag warehouseTag = (WarehouseTag) obj;
        return Intrinsics.LJFF(this.icon, warehouseTag.icon) && Intrinsics.LJFF(this.template, warehouseTag.template) && Intrinsics.LJFF(this.arguments, warehouseTag.arguments) && Intrinsics.LJFF(this.popup, warehouseTag.popup) && Intrinsics.LJFF(this.fulfilledBy, warehouseTag.fulfilledBy);
    }

    public final int hashCode() {
        LogisticIcon logisticIcon = this.icon;
        int iHashCode = (logisticIcon == null ? 0 : logisticIcon.hashCode()) * 31;
        String str = this.template;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.arguments;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        ContentPopup contentPopup = this.popup;
        int iHashCode4 = (iHashCode3 + (contentPopup == null ? 0 : contentPopup.hashCode())) * 31;
        String str2 = this.fulfilledBy;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WarehouseTag(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", template=");
        sbLIZ.append(this.template);
        sbLIZ.append(", arguments=");
        sbLIZ.append(this.arguments);
        sbLIZ.append(", popup=");
        sbLIZ.append(this.popup);
        sbLIZ.append(", fulfilledBy=");
        sbLIZ.append(this.fulfilledBy);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LogisticIcon logisticIcon = this.icon;
        if (logisticIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticIcon.writeToParcel(parcel, i);
        }
        parcel.writeString(this.template);
        Map<String, String> map = this.arguments;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        ContentPopup contentPopup = this.popup;
        if (contentPopup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contentPopup.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fulfilledBy);
    }

    public WarehouseTag(LogisticIcon logisticIcon, String str, Map<String, String> map, ContentPopup contentPopup, String str2) {
        this.icon = logisticIcon;
        this.template = str;
        this.arguments = map;
        this.popup = contentPopup;
        this.fulfilledBy = str2;
    }
}
