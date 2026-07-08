package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressLocation;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressRightsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstruction;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.LocationUseBar;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.NoticeBubble;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddressModule;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class InputItemData implements Parcelable {

    @C09CT("shipping_address")
    public Address address;

    @C09CT("address_location")
    public AddressLocation addressLocation;

    @C09CT("address_rights")
    public AddressRightsInfo addressRight;

    @C09CT("client_config")
    public ClientConfig config;

    @C09CT("delivery_instruction")
    public DeliveryInstruction deliveryInstruction;

    @C09CT("enable_promotion_popup")
    public Boolean enablePromotionPopup;

    @C09CT("input_items")
    public List<InputItemDTO> inputItems;

    @C09CT("location_use_bar")
    public LocationUseBar locationUseBar;

    @C09CT("notice_bubble")
    public List<NoticeBubble> noticeBubble;

    @C09CT("privacy_policy_statement")
    public LinkRichText privacyPolicyStatement;

    @C09CT("pudo_address_module")
    public PudoAddressModule pudoAddressModule;

    @C09CT("district")
    public Region regionInfo;

    @C09CT("region_selections")
    public List<Region> regionSelections;

    @C09CT("title")
    public ECRichText title;

    @C09CT("top_text")
    public ECRichText topText;
    public static final Parcelable.Creator<InputItemData> CREATOR = new Parcelable.Creator<InputItemData>() { // from class: X.036x
        @Override // android.os.Parcelable.Creator
        public final InputItemData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Region regionCreateFromParcel;
            ClientConfig clientConfigCreateFromParcel;
            LinkRichText linkRichTextCreateFromParcel;
            AddressLocation addressLocationCreateFromParcel;
            AddressRightsInfo addressRightsInfoCreateFromParcel;
            DeliveryInstruction deliveryInstructionCreateFromParcel;
            ArrayList arrayList2;
            boolean z;
            Boolean boolValueOf;
            Address addressCreateFromParcel;
            PudoAddressModule pudoAddressModuleCreateFromParcel;
            LocationUseBar locationUseBarCreateFromParcel;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InputItemDTO.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                regionCreateFromParcel = null;
            } else {
                regionCreateFromParcel = Region.CREATOR.createFromParcel(parcel);
            }
            Region region = regionCreateFromParcel;
            if (parcel.readInt() == 0) {
                clientConfigCreateFromParcel = null;
            } else {
                clientConfigCreateFromParcel = ClientConfig.CREATOR.createFromParcel(parcel);
            }
            ClientConfig clientConfig = clientConfigCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            LinkRichText linkRichText = linkRichTextCreateFromParcel;
            if (parcel.readInt() == 0) {
                addressLocationCreateFromParcel = null;
            } else {
                addressLocationCreateFromParcel = AddressLocation.CREATOR.createFromParcel(parcel);
            }
            AddressLocation addressLocation = addressLocationCreateFromParcel;
            if (parcel.readInt() == 0) {
                addressRightsInfoCreateFromParcel = null;
            } else {
                addressRightsInfoCreateFromParcel = AddressRightsInfo.CREATOR.createFromParcel(parcel);
            }
            AddressRightsInfo addressRightsInfo = addressRightsInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                deliveryInstructionCreateFromParcel = null;
            } else {
                deliveryInstructionCreateFromParcel = DeliveryInstruction.CREATOR.createFromParcel(parcel);
            }
            DeliveryInstruction deliveryInstruction = deliveryInstructionCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Region.CREATOR.createFromParcel(parcel));
                }
            }
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(InputItemData.class.getClassLoader());
            ECRichText eCRichText2 = (ECRichText) parcel.readParcelable(InputItemData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                addressCreateFromParcel = null;
            } else {
                addressCreateFromParcel = Address.CREATOR.createFromParcel(parcel);
            }
            Address address = addressCreateFromParcel;
            if (parcel.readInt() == 0) {
                pudoAddressModuleCreateFromParcel = null;
            } else {
                pudoAddressModuleCreateFromParcel = PudoAddressModule.CREATOR.createFromParcel(parcel);
            }
            PudoAddressModule pudoAddressModule = pudoAddressModuleCreateFromParcel;
            if (parcel.readInt() == 0) {
                locationUseBarCreateFromParcel = null;
            } else {
                locationUseBarCreateFromParcel = LocationUseBar.CREATOR.createFromParcel(parcel);
            }
            LocationUseBar locationUseBar = locationUseBarCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(NoticeBubble.CREATOR.createFromParcel(parcel));
                }
            }
            return new InputItemData(arrayList, region, clientConfig, linkRichText, addressLocation, addressRightsInfo, deliveryInstruction, arrayList2, eCRichText, eCRichText2, boolValueOf, address, pudoAddressModule, locationUseBar, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final InputItemData[] newArray(int i) {
            return new InputItemData[i];
        }
    };
    public static final int $stable = 8;

    public InputItemData() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputItemData)) {
            return false;
        }
        InputItemData inputItemData = (InputItemData) obj;
        return Intrinsics.LJFF(this.inputItems, inputItemData.inputItems) && Intrinsics.LJFF(this.regionInfo, inputItemData.regionInfo) && Intrinsics.LJFF(this.config, inputItemData.config) && Intrinsics.LJFF(this.privacyPolicyStatement, inputItemData.privacyPolicyStatement) && Intrinsics.LJFF(this.addressLocation, inputItemData.addressLocation) && Intrinsics.LJFF(this.addressRight, inputItemData.addressRight) && Intrinsics.LJFF(this.deliveryInstruction, inputItemData.deliveryInstruction) && Intrinsics.LJFF(this.regionSelections, inputItemData.regionSelections) && Intrinsics.LJFF(this.title, inputItemData.title) && Intrinsics.LJFF(this.topText, inputItemData.topText) && Intrinsics.LJFF(this.enablePromotionPopup, inputItemData.enablePromotionPopup) && Intrinsics.LJFF(this.address, inputItemData.address) && Intrinsics.LJFF(this.pudoAddressModule, inputItemData.pudoAddressModule) && Intrinsics.LJFF(this.locationUseBar, inputItemData.locationUseBar) && Intrinsics.LJFF(this.noticeBubble, inputItemData.noticeBubble);
    }

    public final int hashCode() {
        List<InputItemDTO> list = this.inputItems;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Region region = this.regionInfo;
        int iHashCode2 = (iHashCode + (region == null ? 0 : region.hashCode())) * 31;
        ClientConfig clientConfig = this.config;
        int iHashCode3 = (iHashCode2 + (clientConfig == null ? 0 : clientConfig.hashCode())) * 31;
        LinkRichText linkRichText = this.privacyPolicyStatement;
        int iHashCode4 = (iHashCode3 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        AddressLocation addressLocation = this.addressLocation;
        int iHashCode5 = (iHashCode4 + (addressLocation == null ? 0 : addressLocation.hashCode())) * 31;
        AddressRightsInfo addressRightsInfo = this.addressRight;
        int iHashCode6 = (iHashCode5 + (addressRightsInfo == null ? 0 : addressRightsInfo.hashCode())) * 31;
        DeliveryInstruction deliveryInstruction = this.deliveryInstruction;
        int iHashCode7 = (iHashCode6 + (deliveryInstruction == null ? 0 : deliveryInstruction.hashCode())) * 31;
        List<Region> list2 = this.regionSelections;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ECRichText eCRichText = this.title;
        int iHashCode9 = (iHashCode8 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        ECRichText eCRichText2 = this.topText;
        int iHashCode10 = (iHashCode9 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        Boolean bool = this.enablePromotionPopup;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Address address = this.address;
        int iHashCode12 = (iHashCode11 + (address == null ? 0 : address.hashCode())) * 31;
        PudoAddressModule pudoAddressModule = this.pudoAddressModule;
        int iHashCode13 = (iHashCode12 + (pudoAddressModule == null ? 0 : pudoAddressModule.hashCode())) * 31;
        LocationUseBar locationUseBar = this.locationUseBar;
        int iHashCode14 = (iHashCode13 + (locationUseBar == null ? 0 : locationUseBar.hashCode())) * 31;
        List<NoticeBubble> list3 = this.noticeBubble;
        return iHashCode14 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "InputItemData(inputItems=" + this.inputItems + ", regionInfo=" + this.regionInfo + ", config=" + this.config + ", privacyPolicyStatement=" + this.privacyPolicyStatement + ", addressLocation=" + this.addressLocation + ", addressRight=" + this.addressRight + ", deliveryInstruction=" + this.deliveryInstruction + ", regionSelections=" + this.regionSelections + ", title=" + this.title + ", topText=" + this.topText + ", enablePromotionPopup=" + this.enablePromotionPopup + ", address=" + this.address + ", pudoAddressModule=" + this.pudoAddressModule + ", locationUseBar=" + this.locationUseBar + ", noticeBubble=" + this.noticeBubble + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<InputItemDTO> list = this.inputItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InputItemDTO> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Region region = this.regionInfo;
        if (region == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            region.writeToParcel(parcel, i);
        }
        ClientConfig clientConfig = this.config;
        if (clientConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clientConfig.writeToParcel(parcel, i);
        }
        LinkRichText linkRichText = this.privacyPolicyStatement;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
        AddressLocation addressLocation = this.addressLocation;
        if (addressLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressLocation.writeToParcel(parcel, i);
        }
        AddressRightsInfo addressRightsInfo = this.addressRight;
        if (addressRightsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressRightsInfo.writeToParcel(parcel, i);
        }
        DeliveryInstruction deliveryInstruction = this.deliveryInstruction;
        if (deliveryInstruction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            deliveryInstruction.writeToParcel(parcel, i);
        }
        List<Region> list2 = this.regionSelections;
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
        parcel.writeParcelable(this.title, i);
        parcel.writeParcelable(this.topText, i);
        Boolean bool = this.enablePromotionPopup;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Address address = this.address;
        if (address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address.writeToParcel(parcel, i);
        }
        PudoAddressModule pudoAddressModule = this.pudoAddressModule;
        if (pudoAddressModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pudoAddressModule.writeToParcel(parcel, i);
        }
        LocationUseBar locationUseBar = this.locationUseBar;
        if (locationUseBar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            locationUseBar.writeToParcel(parcel, i);
        }
        List<NoticeBubble> list3 = this.noticeBubble;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list3.size());
        Iterator<NoticeBubble> it4 = list3.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
    }

    public InputItemData(List<InputItemDTO> list, Region region, ClientConfig clientConfig, LinkRichText linkRichText, AddressLocation addressLocation, AddressRightsInfo addressRightsInfo, DeliveryInstruction deliveryInstruction, List<Region> list2, ECRichText eCRichText, ECRichText eCRichText2, Boolean bool, Address address, PudoAddressModule pudoAddressModule, LocationUseBar locationUseBar, List<NoticeBubble> list3) {
        this.inputItems = list;
        this.regionInfo = region;
        this.config = clientConfig;
        this.privacyPolicyStatement = linkRichText;
        this.addressLocation = addressLocation;
        this.addressRight = addressRightsInfo;
        this.deliveryInstruction = deliveryInstruction;
        this.regionSelections = list2;
        this.title = eCRichText;
        this.topText = eCRichText2;
        this.enablePromotionPopup = bool;
        this.address = address;
        this.pudoAddressModule = pudoAddressModule;
        this.locationUseBar = locationUseBar;
        this.noticeBubble = list3;
    }
}
