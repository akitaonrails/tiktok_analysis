package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.richtext;

import X.C04DV;
import X.C04DW;
import X.C04FN;
import X.C2188811AlT;
import X.C703902ov;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.richtext.UsPdpRichTitleModuleVO;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UsPdpRichTitleModuleVO implements Parcelable, InterfaceC746802vq, C04DW, C04DV {
    public final String btm;
    public final Map<String, String> eventTrackingTriggerKeys;
    public C04FN goda2Node;
    public String godaGroupId;
    public String godaNodeId;
    public final String jumpSchema;
    public final String jumpSchemaTrackParams;
    public final ECRichText text;
    public final Icon trailingIcon;
    public static final Parcelable.Creator<UsPdpRichTitleModuleVO> CREATOR = new Parcelable.Creator<UsPdpRichTitleModuleVO>() { // from class: X.02ws
        @Override // android.os.Parcelable.Creator
        public final UsPdpRichTitleModuleVO createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Icon icon = (Icon) parcel.readParcelable(UsPdpRichTitleModuleVO.class.getClassLoader());
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(UsPdpRichTitleModuleVO.class.getClassLoader());
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
            return new UsPdpRichTitleModuleVO(eCRichText, icon, string, string2, string3, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final UsPdpRichTitleModuleVO[] newArray(int i) {
            return new UsPdpRichTitleModuleVO[i];
        }
    };
    public static final int $stable = 8;

    public UsPdpRichTitleModuleVO() {
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
        if (!(obj instanceof UsPdpRichTitleModuleVO)) {
            return false;
        }
        UsPdpRichTitleModuleVO usPdpRichTitleModuleVO = (UsPdpRichTitleModuleVO) obj;
        return Intrinsics.LJFF(this.trailingIcon, usPdpRichTitleModuleVO.trailingIcon) && Intrinsics.LJFF(this.text, usPdpRichTitleModuleVO.text) && Intrinsics.LJFF(this.jumpSchema, usPdpRichTitleModuleVO.jumpSchema) && Intrinsics.LJFF(this.jumpSchemaTrackParams, usPdpRichTitleModuleVO.jumpSchemaTrackParams) && Intrinsics.LJFF(this.btm, usPdpRichTitleModuleVO.btm) && Intrinsics.LJFF(this.eventTrackingTriggerKeys, usPdpRichTitleModuleVO.eventTrackingTriggerKeys);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        Icon icon = this.trailingIcon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        ECRichText eCRichText = this.text;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
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
        sbLIZ.append("UsPdpRichTitleModuleVO(trailingIcon=");
        sbLIZ.append(this.trailingIcon);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
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
        parcel.writeParcelable(this.trailingIcon, i);
        parcel.writeParcelable(this.text, i);
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

    @Override // X.C04DV
    public final C04FN LJIIIIZZ() {
        return this.goda2Node;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.godaNodeId;
    }

    @Override // X.C04DV
    public final void LIZIZ(C04FN c04fn) {
        this.goda2Node = c04fn;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
        this.godaGroupId = str;
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.godaNodeId = str;
    }

    public UsPdpRichTitleModuleVO(ECRichText eCRichText, Icon icon, String str, String str2, String str3, Map map) {
        this.trailingIcon = icon;
        this.text = eCRichText;
        this.jumpSchema = str;
        this.jumpSchemaTrackParams = str2;
        this.btm = str3;
        this.eventTrackingTriggerKeys = map;
        this.godaGroupId = "undefined";
        this.godaNodeId = "undefined";
    }
}
