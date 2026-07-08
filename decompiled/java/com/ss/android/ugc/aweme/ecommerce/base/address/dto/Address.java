package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.AnonymousClass0375;
import X.C09CT;
import X.C13BV;
import X.C13EL;
import X.C13EM;
import X.C13LP;
import X.C13LQ;
import X.C1533950q1J;
import X.C1697810uHb;
import X.C20723089x;
import X.C2188811AlT;
import X.C703302op;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Address implements Parcelable {

    @C09CT("address_base")
    public AddressBase addressBase;

    @C09CT("address_id")
    public String addressId;

    @C09CT("address_type")
    public Integer addressType;

    @C09CT("delivery_instruction_info")
    public DeliveryInstructionInfo deliveryInstructionInfo;

    @C09CT("districts")
    public List<Region> districts;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("items")
    public List<AddressItem> items;

    @C09CT("latitude")
    public String latitude;

    @C09CT("longitude")
    public String longitude;

    @C09CT("pudo_id")
    public String pudoId;

    @C09CT("region")
    public Region region;

    @C09CT("rich_info_list")
    public List<ShippingAddressRichInfo> richInfoList;
    public static final AnonymousClass0375 Companion = new Object() { // from class: X.0375
    };
    public static final Parcelable.Creator<Address> CREATOR = new Parcelable.Creator<Address>() { // from class: X.02qI
        @Override // android.os.Parcelable.Creator
        public final Address createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Region regionCreateFromParcel;
            ArrayList arrayList2;
            DeliveryInstructionInfo deliveryInstructionInfoCreateFromParcel;
            ArrayList arrayList3;
            AddressBase addressBaseCreateFromParcel;
            String string = parcel.readString();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AddressItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                regionCreateFromParcel = null;
            } else {
                regionCreateFromParcel = Region.CREATOR.createFromParcel(parcel);
            }
            Region region = regionCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Region.CREATOR.createFromParcel(parcel));
                }
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                deliveryInstructionInfoCreateFromParcel = null;
            } else {
                deliveryInstructionInfoCreateFromParcel = DeliveryInstructionInfo.CREATOR.createFromParcel(parcel);
            }
            DeliveryInstructionInfo deliveryInstructionInfo = deliveryInstructionInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(ShippingAddressRichInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                addressBaseCreateFromParcel = null;
            } else {
                addressBaseCreateFromParcel = AddressBase.CREATOR.createFromParcel(parcel);
            }
            AddressBase addressBase = addressBaseCreateFromParcel;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new Address(string, arrayList, region, arrayList2, string2, deliveryInstructionInfo, arrayList3, addressBase, string3, string4, string5, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Address[] newArray(int i) {
            return new Address[i];
        }
    };
    public static final int $stable = 8;
    public static final List<String> SEARCH_GEOS = C1697810uHb.LJIIJJI("geo_l1", "geo_l2", "geo_l3");

    public Address() {
    }

    public final String LIZJ() {
        List listLJIJI = C13LQ.LJIJI(new String[]{LJI("address"), LJI("house_number"), LJI("unit_floor"), LJI("address_detail")});
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJIJI) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS228S0000000_1.get$arr$(36), 30);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return Intrinsics.LJFF(this.id, address.id) && Intrinsics.LJFF(this.items, address.items) && Intrinsics.LJFF(this.region, address.region) && Intrinsics.LJFF(this.districts, address.districts) && Intrinsics.LJFF(this.addressId, address.addressId) && Intrinsics.LJFF(this.deliveryInstructionInfo, address.deliveryInstructionInfo) && Intrinsics.LJFF(this.richInfoList, address.richInfoList) && Intrinsics.LJFF(this.addressBase, address.addressBase) && Intrinsics.LJFF(this.pudoId, address.pudoId) && Intrinsics.LJFF(this.longitude, address.longitude) && Intrinsics.LJFF(this.latitude, address.latitude) && Intrinsics.LJFF(this.addressType, address.addressType);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<AddressItem> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Region region = this.region;
        int iHashCode3 = (iHashCode2 + (region == null ? 0 : region.hashCode())) * 31;
        List<Region> list2 = this.districts;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.addressId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeliveryInstructionInfo deliveryInstructionInfo = this.deliveryInstructionInfo;
        int iHashCode6 = (iHashCode5 + (deliveryInstructionInfo == null ? 0 : deliveryInstructionInfo.hashCode())) * 31;
        List<ShippingAddressRichInfo> list3 = this.richInfoList;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AddressBase addressBase = this.addressBase;
        int iHashCode8 = (iHashCode7 + (addressBase == null ? 0 : addressBase.hashCode())) * 31;
        String str3 = this.pudoId;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.longitude;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.latitude;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.addressType;
        return iHashCode11 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Address(id=" + this.id + ", items=" + this.items + ", region=" + this.region + ", districts=" + this.districts + ", addressId=" + this.addressId + ", deliveryInstructionInfo=" + this.deliveryInstructionInfo + ", richInfoList=" + this.richInfoList + ", addressBase=" + this.addressBase + ", pudoId=" + this.pudoId + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", addressType=" + this.addressType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        List<AddressItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AddressItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Region region = this.region;
        if (region == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            region.writeToParcel(parcel, i);
        }
        List<Region> list2 = this.districts;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Region> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.addressId);
        DeliveryInstructionInfo deliveryInstructionInfo = this.deliveryInstructionInfo;
        if (deliveryInstructionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            deliveryInstructionInfo.writeToParcel(parcel, i);
        }
        List<ShippingAddressRichInfo> list3 = this.richInfoList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<ShippingAddressRichInfo> it4 = list3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        AddressBase addressBase = this.addressBase;
        if (addressBase == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressBase.writeToParcel(parcel, i);
        }
        parcel.writeString(this.pudoId);
        parcel.writeString(this.longitude);
        parcel.writeString(this.latitude);
        Integer num = this.addressType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public final String LJ() {
        String str;
        ArrayList arrayList = new ArrayList();
        String strLJI = LJI("address");
        if (strLJI != null) {
            arrayList.add(strLJI);
        }
        String strLJI2 = LJI("unit_floor");
        if (strLJI2 != null) {
            arrayList.add(strLJI2);
        }
        String strLJI3 = LJI("address_detail");
        if (strLJI3 != null) {
            arrayList.add(strLJI3);
        }
        List<Region> list = this.districts;
        if (list != null) {
            Object it2 = new C13EL(list).iterator();
            while (true) {
                C13EM c13em = (C13EM) it2;
                if (!c13em.hasNext()) {
                    break;
                }
                Region region = (Region) c13em.next();
                String str2 = region.code;
                if (str2 != null || (str2 = region.name) != null) {
                    arrayList.add(str2);
                }
            }
        }
        String strLJI4 = LJI("zipcode");
        if (strLJI4 != null) {
            arrayList.add(strLJI4);
        }
        Region region2 = this.region;
        if (region2 != null && (str = region2.name) != null) {
            arrayList.add(str);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return C13LP.LJJLIIIJ(arrayList2, ", ", null, null, 0, null, null, 62);
    }

    public final String LJFF() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strLJI = LJI("address");
        if (strLJI != null) {
            arrayList2.add(strLJI);
        }
        String strLJI2 = LJI("unit_floor");
        if (strLJI2 != null) {
            arrayList2.add(strLJI2);
        }
        String strLJI3 = LJI("address_detail");
        if (strLJI3 != null) {
            arrayList2.add(strLJI3);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((String) obj).length() > 0) {
                arrayList3.add(obj);
            }
        }
        arrayList.add(C13LP.LJJLIIIJ(arrayList3, ", ", null, null, 0, null, null, 62));
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        List<Region> list = this.districts;
        if (list != null) {
            Object it2 = new C13EL(list).iterator();
            while (true) {
                C13EM c13em = (C13EM) it2;
                if (!c13em.hasNext()) {
                    break;
                }
                Region region = (Region) c13em.next();
                String str = region.code;
                if (str != null || (str = region.name) != null) {
                    arrayList5.add(str);
                }
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList5) {
            if (((String) obj2).length() > 0) {
                arrayList6.add(obj2);
            }
        }
        arrayList4.add(C13LP.LJJLIIIJ(arrayList6, ", ", null, null, 0, null, null, 62));
        String strLJI4 = LJI("zipcode");
        if (strLJI4 != null) {
            arrayList4.add(strLJI4);
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (((String) obj3).length() > 0) {
                arrayList7.add(obj3);
            }
        }
        arrayList.add(C13LP.LJJLIIIJ(arrayList7, " ", null, null, 0, null, null, 62));
        ArrayList arrayList8 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (((String) obj4).length() > 0) {
                arrayList8.add(obj4);
            }
        }
        return C13LP.LJJLIIIJ(arrayList8, "\n", null, null, 0, null, null, 62);
    }

    public final boolean LJII() {
        AddressItem next;
        List<AddressItem> list = this.items;
        String str = null;
        if (list != null) {
            Iterator<AddressItem> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.LJFF(next.key, "default")) {
                    break;
                }
            }
            AddressItem addressItem = next;
            if (addressItem != null) {
                str = addressItem.value;
            }
        }
        return Intrinsics.LJFF(str, "1");
    }

    public final boolean LIZ(Address address) {
        if (address == null) {
            return false;
        }
        if (Intrinsics.LJFF(address, this)) {
            return true;
        }
        if (!Intrinsics.LJFF(address.region, this.region) || !Intrinsics.LJFF(address.addressBase, this.addressBase) || !Intrinsics.LJFF(address.deliveryInstructionInfo, this.deliveryInstructionInfo) || !C20723089x.LIZJ(this.districts, address.districts) || !C20723089x.LIZJ(this.items, address.items) || !C20723089x.LIZJ(this.richInfoList, address.richInfoList)) {
            return false;
        }
        return true;
    }

    public final String LJI(String str) {
        AddressItem next;
        List<AddressItem> list = this.items;
        if (list == null) {
            return null;
        }
        Iterator<AddressItem> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.key, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AddressItem addressItem = next;
        if (addressItem == null) {
            return null;
        }
        return addressItem.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    public static String LIZLLL(Address address, boolean z, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(address.region);
        Collection collection = address.districts;
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        listLJIILJJIL.addAll(collection);
        List listLJJJJLI = C13LP.LJJJJLI(listLJIILJJIL);
        ?? arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJJJJLI) {
            Region region = (Region) obj;
            if (C703302op.LIZ(region.code) || C703302op.LIZ(region.name)) {
                arrayList.add(obj);
            }
        }
        if (z2) {
            arrayList = C13LP.LJLJJLL(arrayList);
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, new AwS16S0010000_1(z, 36), 30);
        String strLJI = address.LJI("neighborhood");
        if (C1533950q1J.LJ(strLJI)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJI);
            sbLIZ.append(',');
            sbLIZ.append(strLJJLIIIJ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLJJLIIIJ;
    }

    public static Address LIZIZ(Address address, List list, List list2, DeliveryInstructionInfo deliveryInstructionInfo, C13BV c13bv, AddressBase addressBase, String str, String str2, int i) {
        String str3;
        Region region;
        String str4;
        String str5;
        String str6 = str2;
        String str7 = str;
        AddressBase addressBase2 = addressBase;
        DeliveryInstructionInfo deliveryInstructionInfo2 = deliveryInstructionInfo;
        List list3 = list2;
        List<ShippingAddressRichInfo> list4 = c13bv;
        List list5 = list;
        Integer num = null;
        if ((i & 1) != 0) {
            str3 = address.id;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            list5 = address.items;
        }
        if ((i & 4) != 0) {
            region = address.region;
        } else {
            region = null;
        }
        if ((i & 8) != 0) {
            list3 = address.districts;
        }
        if ((i & 16) != 0) {
            str4 = address.addressId;
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            deliveryInstructionInfo2 = address.deliveryInstructionInfo;
        }
        if ((i & 64) != 0) {
            list4 = address.richInfoList;
        }
        if ((i & 128) != 0) {
            addressBase2 = address.addressBase;
        }
        if ((i & 256) != 0) {
            str5 = address.pudoId;
        } else {
            str5 = null;
        }
        if ((i & 512) != 0) {
            str7 = address.longitude;
        }
        if ((i & 1024) != 0) {
            str6 = address.latitude;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num = address.addressType;
        }
        address.getClass();
        return new Address(str3, list5, region, list3, str4, deliveryInstructionInfo2, list4, addressBase2, str5, str7, str6, num);
    }

    public Address(String str, List<AddressItem> list, Region region, List<Region> list2, String str2, DeliveryInstructionInfo deliveryInstructionInfo, List<ShippingAddressRichInfo> list3, AddressBase addressBase, String str3, String str4, String str5, Integer num) {
        this.id = str;
        this.items = list;
        this.region = region;
        this.districts = list2;
        this.addressId = str2;
        this.deliveryInstructionInfo = deliveryInstructionInfo;
        this.richInfoList = list3;
        this.addressBase = addressBase;
        this.pudoId = str3;
        this.longitude = str4;
        this.latitude = str5;
        this.addressType = num;
    }
}
