package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C047O;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomActionConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomArea;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButtonAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButtonAreaIdV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.view.btninterest.model.SeaPdpBottomBtnInterest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpBottomArea implements Parcelable {
    public static final String DEFAULT = "default";

    @C09CT("action_map")
    public final Map<String, PdpBottomActionConfig> actionMap;

    @C09CT("area_elem_map")
    public final Map<String, PdpBottomAreaElem> areaElemMap;

    @C09CT("add_to_cart_click_hint")
    public final String clickHint;

    @C09CT("default_area_id")
    public final String defaultAreaId;

    @C09CT("default_area_id_list")
    public final List<PdpButtonAreaIdV2> defaultAreaList;

    @C09CT("interest_map")
    public final Map<String, SeaPdpBottomBtnInterest> interestMap;

    @C09CT("pdp_button_area_extra_info")
    public final PdpButtonAreaExtraInfo pdpButtonAreaExtraInfo;

    @C09CT("protection_program_text")
    public final LinkRichText protectionProgramText;
    public static final C047O ButtonAreaId = new Object() { // from class: X.047O
    };
    public static final Parcelable.Creator<PdpBottomArea> CREATOR = new Parcelable.Creator<PdpBottomArea>() { // from class: X.045x
        @Override // android.os.Parcelable.Creator
        public final PdpBottomArea createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            LinkRichText linkRichTextCreateFromParcel;
            PdpButtonAreaExtraInfo pdpButtonAreaExtraInfoCreateFromParcel;
            LinkedHashMap linkedHashMap2;
            SeaPdpBottomBtnInterest seaPdpBottomBtnInterestCreateFromParcel;
            LinkedHashMap linkedHashMap3;
            PdpBottomActionConfig pdpBottomActionConfigCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PdpButtonAreaIdV2.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(parcel.readString(), PdpBottomAreaElem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            LinkRichText linkRichText = linkRichTextCreateFromParcel;
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                pdpButtonAreaExtraInfoCreateFromParcel = null;
            } else {
                pdpButtonAreaExtraInfoCreateFromParcel = PdpButtonAreaExtraInfo.CREATOR.createFromParcel(parcel);
            }
            PdpButtonAreaExtraInfo pdpButtonAreaExtraInfo = pdpButtonAreaExtraInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i5 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    String string3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        seaPdpBottomBtnInterestCreateFromParcel = null;
                    } else {
                        seaPdpBottomBtnInterestCreateFromParcel = SeaPdpBottomBtnInterest.CREATOR.createFromParcel(parcel);
                    }
                    linkedHashMap2.put(string3, seaPdpBottomBtnInterestCreateFromParcel);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int i7 = parcel.readInt();
                linkedHashMap3 = new LinkedHashMap(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    String string4 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        pdpBottomActionConfigCreateFromParcel = null;
                    } else {
                        pdpBottomActionConfigCreateFromParcel = PdpBottomActionConfig.CREATOR.createFromParcel(parcel);
                    }
                    linkedHashMap3.put(string4, pdpBottomActionConfigCreateFromParcel);
                }
            }
            return new PdpBottomArea(string, arrayList, linkedHashMap, linkRichText, string2, pdpButtonAreaExtraInfo, linkedHashMap2, linkedHashMap3);
        }

        @Override // android.os.Parcelable.Creator
        public final PdpBottomArea[] newArray(int i) {
            return new PdpBottomArea[i];
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
        if (!(obj instanceof PdpBottomArea)) {
            return false;
        }
        PdpBottomArea pdpBottomArea = (PdpBottomArea) obj;
        return Intrinsics.LJFF(this.defaultAreaId, pdpBottomArea.defaultAreaId) && Intrinsics.LJFF(this.defaultAreaList, pdpBottomArea.defaultAreaList) && Intrinsics.LJFF(this.areaElemMap, pdpBottomArea.areaElemMap) && Intrinsics.LJFF(this.protectionProgramText, pdpBottomArea.protectionProgramText) && Intrinsics.LJFF(this.clickHint, pdpBottomArea.clickHint) && Intrinsics.LJFF(this.pdpButtonAreaExtraInfo, pdpBottomArea.pdpButtonAreaExtraInfo) && Intrinsics.LJFF(this.interestMap, pdpBottomArea.interestMap) && Intrinsics.LJFF(this.actionMap, pdpBottomArea.actionMap);
    }

    public final int hashCode() {
        String str = this.defaultAreaId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PdpButtonAreaIdV2> list = this.defaultAreaList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, PdpBottomAreaElem> map = this.areaElemMap;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        LinkRichText linkRichText = this.protectionProgramText;
        int iHashCode4 = (iHashCode3 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        String str2 = this.clickHint;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PdpButtonAreaExtraInfo pdpButtonAreaExtraInfo = this.pdpButtonAreaExtraInfo;
        int iHashCode6 = (iHashCode5 + (pdpButtonAreaExtraInfo == null ? 0 : pdpButtonAreaExtraInfo.hashCode())) * 31;
        Map<String, SeaPdpBottomBtnInterest> map2 = this.interestMap;
        int iHashCode7 = (iHashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, PdpBottomActionConfig> map3 = this.actionMap;
        return iHashCode7 + (map3 != null ? map3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpBottomArea(defaultAreaId=");
        sbLIZ.append(this.defaultAreaId);
        sbLIZ.append(", defaultAreaList=");
        sbLIZ.append(this.defaultAreaList);
        sbLIZ.append(", areaElemMap=");
        sbLIZ.append(this.areaElemMap);
        sbLIZ.append(", protectionProgramText=");
        sbLIZ.append(this.protectionProgramText);
        sbLIZ.append(", clickHint=");
        sbLIZ.append(this.clickHint);
        sbLIZ.append(", pdpButtonAreaExtraInfo=");
        sbLIZ.append(this.pdpButtonAreaExtraInfo);
        sbLIZ.append(", interestMap=");
        sbLIZ.append(this.interestMap);
        sbLIZ.append(", actionMap=");
        sbLIZ.append(this.actionMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.defaultAreaId);
        List<PdpButtonAreaIdV2> list = this.defaultAreaList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PdpButtonAreaIdV2> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Map<String, PdpBottomAreaElem> map = this.areaElemMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, PdpBottomAreaElem> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                entry.getValue().writeToParcel(parcel, i);
            }
        }
        LinkRichText linkRichText = this.protectionProgramText;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
        parcel.writeString(this.clickHint);
        PdpButtonAreaExtraInfo pdpButtonAreaExtraInfo = this.pdpButtonAreaExtraInfo;
        if (pdpButtonAreaExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pdpButtonAreaExtraInfo.writeToParcel(parcel, i);
        }
        Map<String, SeaPdpBottomBtnInterest> map2 = this.interestMap;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, SeaPdpBottomBtnInterest> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                SeaPdpBottomBtnInterest value = entry2.getValue();
                if (value == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    value.writeToParcel(parcel, i);
                }
            }
        }
        Map<String, PdpBottomActionConfig> map3 = this.actionMap;
        if (map3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map3.size());
        for (Map.Entry<String, PdpBottomActionConfig> entry3 : map3.entrySet()) {
            parcel.writeString(entry3.getKey());
            PdpBottomActionConfig value2 = entry3.getValue();
            if (value2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                value2.writeToParcel(parcel, i);
            }
        }
    }

    public PdpBottomArea(String str, List<PdpButtonAreaIdV2> list, Map<String, PdpBottomAreaElem> map, LinkRichText linkRichText, String str2, PdpButtonAreaExtraInfo pdpButtonAreaExtraInfo, Map<String, SeaPdpBottomBtnInterest> map2, Map<String, PdpBottomActionConfig> map3) {
        this.defaultAreaId = str;
        this.defaultAreaList = list;
        this.areaElemMap = map;
        this.protectionProgramText = linkRichText;
        this.clickHint = str2;
        this.pdpButtonAreaExtraInfo = pdpButtonAreaExtraInfo;
        this.interestMap = map2;
        this.actionMap = map3;
    }
}
