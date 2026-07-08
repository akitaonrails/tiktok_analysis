package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.richtext;

import X.C033W;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.InterfaceC718502rH;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.richtext.UsPdpRichTitleDataModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UsPdpRichTitleDataModel implements Parcelable, InterfaceC718502rH {

    @C09CT("btm")
    public final String btm;

    @C09CT("event_tracking_trigger_keys")
    public final Map<String, String> eventTrackingTriggerKeys;

    @C09CT("jump_schema")
    public final String jumpSchema;

    @C09CT("jump_schema_track_params")
    public final String jumpSchemaTrackParams;

    @C09CT("title")
    public final ECRichText text;

    @C09CT("trailing_icon")
    public final Icon trailingIcon;
    public static final Parcelable.Creator<UsPdpRichTitleDataModel> CREATOR = new Parcelable.Creator<UsPdpRichTitleDataModel>() { // from class: X.02wr
        @Override // android.os.Parcelable.Creator
        public final UsPdpRichTitleDataModel createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(UsPdpRichTitleDataModel.class.getClassLoader());
            Icon icon = (Icon) parcel.readParcelable(UsPdpRichTitleDataModel.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new UsPdpRichTitleDataModel(eCRichText, icon, string, string2, string3, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final UsPdpRichTitleDataModel[] newArray(int i) {
            return new UsPdpRichTitleDataModel[i];
        }
    };
    public static final int $stable = 8;

    public UsPdpRichTitleDataModel() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsPdpRichTitleDataModel)) {
            return false;
        }
        UsPdpRichTitleDataModel usPdpRichTitleDataModel = (UsPdpRichTitleDataModel) obj;
        return Intrinsics.LJFF(this.text, usPdpRichTitleDataModel.text) && Intrinsics.LJFF(this.trailingIcon, usPdpRichTitleDataModel.trailingIcon) && Intrinsics.LJFF(this.jumpSchema, usPdpRichTitleDataModel.jumpSchema) && Intrinsics.LJFF(this.jumpSchemaTrackParams, usPdpRichTitleDataModel.jumpSchemaTrackParams) && Intrinsics.LJFF(this.btm, usPdpRichTitleDataModel.btm) && Intrinsics.LJFF(this.eventTrackingTriggerKeys, usPdpRichTitleDataModel.eventTrackingTriggerKeys);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.text;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        Icon icon = this.trailingIcon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        String str = this.jumpSchema;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.jumpSchemaTrackParams;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.btm;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.eventTrackingTriggerKeys;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsPdpRichTitleDataModel(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", trailingIcon=");
        sbLIZ.append(this.trailingIcon);
        sbLIZ.append(", jumpSchema=");
        sbLIZ.append(this.jumpSchema);
        sbLIZ.append(", jumpSchemaTrackParams=");
        sbLIZ.append(this.jumpSchemaTrackParams);
        sbLIZ.append(", btm=");
        sbLIZ.append(this.btm);
        sbLIZ.append(", eventTrackingTriggerKeys=");
        sbLIZ.append(this.eventTrackingTriggerKeys);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.text, i);
        parcel.writeParcelable(this.trailingIcon, i);
        parcel.writeString(this.jumpSchema);
        parcel.writeString(this.jumpSchemaTrackParams);
        parcel.writeString(this.btm);
        Map<String, String> map = this.eventTrackingTriggerKeys;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    @Override // X.InterfaceC718502rH
    public final List<InterfaceC746802vq> LIZ(C033W c033w) {
        if (c033w.LIZ) {
            return C13BV.INSTANCE;
        }
        return Collections.singletonList(new UsPdpRichTitleModuleVO(this.text, this.trailingIcon, this.jumpSchema, this.jumpSchemaTrackParams, this.btm, this.eventTrackingTriggerKeys));
    }

    public UsPdpRichTitleDataModel(ECRichText eCRichText, Icon icon, String str, String str2, String str3, Map<String, String> map) {
        this.text = eCRichText;
        this.trailingIcon = icon;
        this.jumpSchema = str;
        this.jumpSchemaTrackParams = str2;
        this.btm = str3;
        this.eventTrackingTriggerKeys = map;
    }
}
