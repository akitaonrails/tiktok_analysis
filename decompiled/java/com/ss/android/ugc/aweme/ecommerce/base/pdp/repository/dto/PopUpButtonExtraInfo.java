package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DetailsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PopUpButtonExtraInfo implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("details_info")
    public final DetailsInfo detailInfo;

    @C09CT("next_pop_up")
    public final BasicPopUp nextPopUp;

    @C09CT("next_request_scene")
    public final List<NextRequestScene> nextRequestScenes;

    @C09CT("request_passthrough_map")
    public final String passThroughParams;

    @C09CT("popup_type")
    public final Integer popupType;

    @C09CT("transparent_fields")
    public final Map<String, String> transparentFields;

    @C09CT("voucher_info")
    public final VoucherInfo voucherInfo;
    public static final Parcelable.Creator<PopUpButtonExtraInfo> CREATOR = new Parcelable.Creator<PopUpButtonExtraInfo>() { // from class: X.02wD
        @Override // android.os.Parcelable.Creator
        public final PopUpButtonExtraInfo createFromParcel(Parcel parcel) {
            VoucherInfo voucherInfoCreateFromParcel;
            BasicPopUp basicPopUpCreateFromParcel;
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            DetailsInfo detailsInfoCreateFromParcel;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                voucherInfoCreateFromParcel = null;
            } else {
                voucherInfoCreateFromParcel = VoucherInfo.CREATOR.createFromParcel(parcel);
            }
            VoucherInfo voucherInfo = voucherInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                basicPopUpCreateFromParcel = null;
            } else {
                basicPopUpCreateFromParcel = BasicPopUp.CREATOR.createFromParcel(parcel);
            }
            BasicPopUp basicPopUp = basicPopUpCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(NextRequestScene.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                detailsInfoCreateFromParcel = null;
            } else {
                detailsInfoCreateFromParcel = DetailsInfo.CREATOR.createFromParcel(parcel);
            }
            DetailsInfo detailsInfo = detailsInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PopUpButtonExtraInfo(voucherInfo, basicPopUp, string, arrayList, linkedHashMap, detailsInfo, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PopUpButtonExtraInfo[] newArray(int i) {
            return new PopUpButtonExtraInfo[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopUpButtonExtraInfo)) {
            return false;
        }
        PopUpButtonExtraInfo popUpButtonExtraInfo = (PopUpButtonExtraInfo) obj;
        return Intrinsics.LJFF(this.voucherInfo, popUpButtonExtraInfo.voucherInfo) && Intrinsics.LJFF(this.nextPopUp, popUpButtonExtraInfo.nextPopUp) && Intrinsics.LJFF(this.daInfo, popUpButtonExtraInfo.daInfo) && Intrinsics.LJFF(this.nextRequestScenes, popUpButtonExtraInfo.nextRequestScenes) && Intrinsics.LJFF(this.transparentFields, popUpButtonExtraInfo.transparentFields) && Intrinsics.LJFF(this.detailInfo, popUpButtonExtraInfo.detailInfo) && Intrinsics.LJFF(this.popupType, popUpButtonExtraInfo.popupType) && Intrinsics.LJFF(this.passThroughParams, popUpButtonExtraInfo.passThroughParams);
    }

    public final int hashCode() {
        VoucherInfo voucherInfo = this.voucherInfo;
        int iHashCode = (voucherInfo == null ? 0 : voucherInfo.hashCode()) * 31;
        BasicPopUp basicPopUp = this.nextPopUp;
        int iHashCode2 = (iHashCode + (basicPopUp == null ? 0 : basicPopUp.hashCode())) * 31;
        String str = this.daInfo;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<NextRequestScene> list = this.nextRequestScenes;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.transparentFields;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        DetailsInfo detailsInfo = this.detailInfo;
        int iHashCode6 = (iHashCode5 + (detailsInfo == null ? 0 : detailsInfo.hashCode())) * 31;
        Integer num = this.popupType;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.passThroughParams;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopUpButtonExtraInfo(voucherInfo=");
        sbLIZ.append(this.voucherInfo);
        sbLIZ.append(", nextPopUp=");
        sbLIZ.append(this.nextPopUp);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", nextRequestScenes=");
        sbLIZ.append(this.nextRequestScenes);
        sbLIZ.append(", transparentFields=");
        sbLIZ.append(this.transparentFields);
        sbLIZ.append(", detailInfo=");
        sbLIZ.append(this.detailInfo);
        sbLIZ.append(", popupType=");
        sbLIZ.append(this.popupType);
        sbLIZ.append(", passThroughParams=");
        sbLIZ.append(this.passThroughParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VoucherInfo voucherInfo = this.voucherInfo;
        if (voucherInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voucherInfo.writeToParcel(parcel, i);
        }
        BasicPopUp basicPopUp = this.nextPopUp;
        if (basicPopUp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basicPopUp.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
        List<NextRequestScene> list = this.nextRequestScenes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<NextRequestScene> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Map<String, String> map = this.transparentFields;
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
        DetailsInfo detailsInfo = this.detailInfo;
        if (detailsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            detailsInfo.writeToParcel(parcel, i);
        }
        Integer num = this.popupType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.passThroughParams);
    }

    public PopUpButtonExtraInfo(VoucherInfo voucherInfo, BasicPopUp basicPopUp, String str, List<NextRequestScene> list, Map<String, String> map, DetailsInfo detailsInfo, Integer num, String str2) {
        this.voucherInfo = voucherInfo;
        this.nextPopUp = basicPopUp;
        this.daInfo = str;
        this.nextRequestScenes = list;
        this.transparentFields = map;
        this.detailInfo = detailsInfo;
        this.popupType = num;
        this.passThroughParams = str2;
    }
}
