package com.ss.android.ugc.aweme.ecommerce.base.delivery;

import X.C09CT;
import X.C123100dR;
import X.C1741890vQh;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2286608xc;
import X.C23260099m;
import X.C893803eS;
import X.C919503ib;
import X.C966803qE;
import X.EnumC804103Cd;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.SmartRoute;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MultiLogisticsPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DeliveryPanelStarter {
    public static final DeliveryPanelStarter LIZ = new DeliveryPanelStarter();
    public static C23260099m LIZIZ;
    public static C23260099m LIZJ;

    public static final class PackedDeliverySelectResult implements Parcelable {

        @C09CT("has_update_map_location")
        public final Boolean hasUpdateMapLocation;

        @C09CT("is_change_pudo")
        public final Boolean isChangePudo;

        @C09CT("logistics")
        public final List<LogisticDTO> logistics;

        @C09CT("pdp_logistic_module")
        public final PDPLogisticModule pdpLogisticModule;

        @C09CT("select_pickup_point_source")
        public final String selectPickupPointSource;

        @C09CT("area")
        public final List<Region> selectedArea;

        @C09CT("address_id")
        public final String selectedBuyerAddressId;

        @C09CT("logistic")
        public final LogisticDTO selectedLogistic;

        @C09CT("shipping_to_address_info")
        public final ShippingTOAddressInfo shippingToAddressInfo;
        public static final Parcelable.Creator<PackedDeliverySelectResult> CREATOR = new Parcelable.Creator<PackedDeliverySelectResult>() { // from class: X.03FT
            @Override // android.os.Parcelable.Creator
            public final DeliveryPanelStarter.PackedDeliverySelectResult createFromParcel(Parcel parcel) {
                LogisticDTO logisticDTOCreateFromParcel;
                ArrayList arrayList;
                ShippingTOAddressInfo shippingTOAddressInfoCreateFromParcel;
                ArrayList arrayList2;
                PDPLogisticModule pDPLogisticModuleCreateFromParcel;
                boolean z;
                Boolean boolValueOf;
                Boolean boolValueOf2 = null;
                if (parcel.readInt() == 0) {
                    logisticDTOCreateFromParcel = null;
                } else {
                    logisticDTOCreateFromParcel = LogisticDTO.CREATOR.createFromParcel(parcel);
                }
                LogisticDTO logisticDTO = logisticDTOCreateFromParcel;
                String string = parcel.readString();
                boolean z2 = false;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(Region.CREATOR.createFromParcel(parcel));
                    }
                }
                if (parcel.readInt() == 0) {
                    shippingTOAddressInfoCreateFromParcel = null;
                } else {
                    shippingTOAddressInfoCreateFromParcel = ShippingTOAddressInfo.CREATOR.createFromParcel(parcel);
                }
                ShippingTOAddressInfo shippingTOAddressInfo = shippingTOAddressInfoCreateFromParcel;
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i3 = parcel.readInt();
                    arrayList2 = new ArrayList(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        arrayList2.add(LogisticDTO.CREATOR.createFromParcel(parcel));
                    }
                }
                if (parcel.readInt() == 0) {
                    pDPLogisticModuleCreateFromParcel = null;
                } else {
                    pDPLogisticModuleCreateFromParcel = PDPLogisticModule.CREATOR.createFromParcel(parcel);
                }
                PDPLogisticModule pDPLogisticModule = pDPLogisticModuleCreateFromParcel;
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
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    }
                    boolValueOf2 = Boolean.valueOf(z2);
                }
                return new DeliveryPanelStarter.PackedDeliverySelectResult(logisticDTO, string, arrayList, shippingTOAddressInfo, arrayList2, pDPLogisticModule, boolValueOf, boolValueOf2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DeliveryPanelStarter.PackedDeliverySelectResult[] newArray(int i) {
                return new DeliveryPanelStarter.PackedDeliverySelectResult[i];
            }
        };
        public static final int $stable = 8;

        public PackedDeliverySelectResult() {
            this(null, null, null, null, null, null, Boolean.FALSE, null, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PackedDeliverySelectResult)) {
                return false;
            }
            PackedDeliverySelectResult packedDeliverySelectResult = (PackedDeliverySelectResult) obj;
            return Intrinsics.LJFF(this.selectedLogistic, packedDeliverySelectResult.selectedLogistic) && Intrinsics.LJFF(this.selectedBuyerAddressId, packedDeliverySelectResult.selectedBuyerAddressId) && Intrinsics.LJFF(this.selectedArea, packedDeliverySelectResult.selectedArea) && Intrinsics.LJFF(this.shippingToAddressInfo, packedDeliverySelectResult.shippingToAddressInfo) && Intrinsics.LJFF(this.logistics, packedDeliverySelectResult.logistics) && Intrinsics.LJFF(this.pdpLogisticModule, packedDeliverySelectResult.pdpLogisticModule) && Intrinsics.LJFF(this.hasUpdateMapLocation, packedDeliverySelectResult.hasUpdateMapLocation) && Intrinsics.LJFF(this.isChangePudo, packedDeliverySelectResult.isChangePudo) && Intrinsics.LJFF(this.selectPickupPointSource, packedDeliverySelectResult.selectPickupPointSource);
        }

        public final int hashCode() {
            LogisticDTO logisticDTO = this.selectedLogistic;
            int iHashCode = (logisticDTO == null ? 0 : logisticDTO.hashCode()) * 31;
            String str = this.selectedBuyerAddressId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<Region> list = this.selectedArea;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            ShippingTOAddressInfo shippingTOAddressInfo = this.shippingToAddressInfo;
            int iHashCode4 = (iHashCode3 + (shippingTOAddressInfo == null ? 0 : shippingTOAddressInfo.hashCode())) * 31;
            List<LogisticDTO> list2 = this.logistics;
            int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            PDPLogisticModule pDPLogisticModule = this.pdpLogisticModule;
            int iHashCode6 = (iHashCode5 + (pDPLogisticModule == null ? 0 : pDPLogisticModule.hashCode())) * 31;
            Boolean bool = this.hasUpdateMapLocation;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isChangePudo;
            int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.selectPickupPointSource;
            return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PackedDeliverySelectResult(selectedLogistic=");
            sbLIZ.append(this.selectedLogistic);
            sbLIZ.append(", selectedBuyerAddressId=");
            sbLIZ.append(this.selectedBuyerAddressId);
            sbLIZ.append(", selectedArea=");
            sbLIZ.append(this.selectedArea);
            sbLIZ.append(", shippingToAddressInfo=");
            sbLIZ.append(this.shippingToAddressInfo);
            sbLIZ.append(", logistics=");
            sbLIZ.append(this.logistics);
            sbLIZ.append(", pdpLogisticModule=");
            sbLIZ.append(this.pdpLogisticModule);
            sbLIZ.append(", hasUpdateMapLocation=");
            sbLIZ.append(this.hasUpdateMapLocation);
            sbLIZ.append(", isChangePudo=");
            sbLIZ.append(this.isChangePudo);
            sbLIZ.append(", selectPickupPointSource=");
            sbLIZ.append(this.selectPickupPointSource);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            LogisticDTO logisticDTO = this.selectedLogistic;
            if (logisticDTO == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                logisticDTO.writeToParcel(parcel, i);
            }
            parcel.writeString(this.selectedBuyerAddressId);
            List<Region> list = this.selectedArea;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<Region> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(parcel, i);
                }
            }
            ShippingTOAddressInfo shippingTOAddressInfo = this.shippingToAddressInfo;
            if (shippingTOAddressInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                shippingTOAddressInfo.writeToParcel(parcel, i);
            }
            List<LogisticDTO> list2 = this.logistics;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list2.size());
                Iterator<LogisticDTO> it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next().writeToParcel(parcel, i);
                }
            }
            PDPLogisticModule pDPLogisticModule = this.pdpLogisticModule;
            if (pDPLogisticModule == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                pDPLogisticModule.writeToParcel(parcel, i);
            }
            Boolean bool = this.hasUpdateMapLocation;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.isChangePudo;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            parcel.writeString(this.selectPickupPointSource);
        }

        public static PackedDeliverySelectResult LIZ(PackedDeliverySelectResult packedDeliverySelectResult, String str) {
            return new PackedDeliverySelectResult(packedDeliverySelectResult.selectedLogistic, str, packedDeliverySelectResult.selectedArea, packedDeliverySelectResult.shippingToAddressInfo, packedDeliverySelectResult.logistics, null, packedDeliverySelectResult.hasUpdateMapLocation, packedDeliverySelectResult.isChangePudo, packedDeliverySelectResult.selectPickupPointSource);
        }

        public PackedDeliverySelectResult(LogisticDTO logisticDTO, String str, List<Region> list, ShippingTOAddressInfo shippingTOAddressInfo, List<LogisticDTO> list2, PDPLogisticModule pDPLogisticModule, Boolean bool, Boolean bool2, String str2) {
            this.selectedLogistic = logisticDTO;
            this.selectedBuyerAddressId = str;
            this.selectedArea = list;
            this.shippingToAddressInfo = shippingTOAddressInfo;
            this.logistics = list2;
            this.pdpLogisticModule = pDPLogisticModule;
            this.hasUpdateMapLocation = bool;
            this.isChangePudo = bool2;
            this.selectPickupPointSource = str2;
        }
    }

    public static final class OrderDetail implements Parcelable {

        @C09CT("address_id")
        public final String addressId;

        @C09CT("change_addr_order_id")
        public final String changeAddrOrderId;

        @C09CT("change_addr_order_type")
        public final Integer changeAddrOrderType;
        public static final Parcelable.Creator<OrderDetail> CREATOR = new Parcelable.Creator<OrderDetail>() { // from class: X.03qF
            @Override // android.os.Parcelable.Creator
            public final DeliveryPanelStarter.OrderDetail createFromParcel(Parcel parcel) {
                Integer numValueOf;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new DeliveryPanelStarter.OrderDetail(numValueOf, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DeliveryPanelStarter.OrderDetail[] newArray(int i) {
                return new DeliveryPanelStarter.OrderDetail[i];
            }
        };
        public static final int $stable = 8;

        public OrderDetail() {
            this(null, null, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderDetail)) {
                return false;
            }
            OrderDetail orderDetail = (OrderDetail) obj;
            return Intrinsics.LJFF(this.changeAddrOrderType, orderDetail.changeAddrOrderType) && Intrinsics.LJFF(this.changeAddrOrderId, orderDetail.changeAddrOrderId) && Intrinsics.LJFF(this.addressId, orderDetail.addressId);
        }

        public final int hashCode() {
            Integer num = this.changeAddrOrderType;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.changeAddrOrderId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.addressId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OrderDetail(changeAddrOrderType=");
            sbLIZ.append(this.changeAddrOrderType);
            sbLIZ.append(", changeAddrOrderId=");
            sbLIZ.append(this.changeAddrOrderId);
            sbLIZ.append(", addressId=");
            sbLIZ.append(this.addressId);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            Integer num = this.changeAddrOrderType;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.changeAddrOrderId);
            parcel.writeString(this.addressId);
        }

        public OrderDetail(Integer num, String str, String str2) {
            this.changeAddrOrderType = num;
            this.changeAddrOrderId = str;
            this.addressId = str2;
        }
    }

    public static final class EnterParam implements Parcelable {

        @C09CT("address_selection_scene")
        public final Integer addressSelectScene;

        @C09CT("biz_type")
        public final Integer bizType;

        @C09CT("source_btm_token")
        public final String btmToken;

        @C09CT("checkout_type")
        public final String checkoutType;

        @C09CT("createOrderInfoFromBill")
        public final String createOrderInfoFromBill;

        @C09CT("currency")
        public final String currency;

        @C09CT("enter_method")
        public final String enterMethod;

        @C09CT("address_entrance_scene")
        public final Integer entranceScene;

        @C09CT("extra_params_for_lynx")
        public final String extraParamsForLynx;

        @C09CT("free_shipping")
        public final Integer freeShipping;

        @C09CT("from_scene")
        public String fromScene;

        @C09CT("hide_title")
        public Boolean hideTitle;

        @C09CT("logistic_list")
        public final List<LogisticDTO> logisticList;

        @C09CT("logistic_panel_module")
        public final LogisticPanelModule logisticsPanelModule;

        @C09CT("multi_logistics_panel_info")
        public final MultiLogisticsPanelInfo multiLogisticsPanelInfo;

        @C09CT("order_detail")
        public final OrderDetail orderDetail;

        @C09CT("page_height_percent")
        public final Float pageHeightPercent;

        @C09CT("panel_title")
        public final String panelTitle;

        @C09CT("pre_selection_geoname_ids")
        public final List<String> preSelectGeoNameIds;

        @C09CT("price_val")
        public final String priceVal;

        @C09CT("product_id")
        public final String productId;

        @C09CT("quantity")
        public final int quantity;

        @C09CT(Scene.SCENE_SERVICE)
        public final Integer scene;

        @C09CT("selectTab")
        public final Integer selectTab;

        @C09CT("selected_address_id")
        public final String selectedAddressId;

        @C09CT("area")
        public final List<Region> selectedArea;

        @C09CT("address_id")
        public final String selectedBuyerAddressId;

        @C09CT("delivery_type")
        public final String selectedDeliveryTypeId;

        @C09CT("self_pickup_display_type")
        public final Integer selfCollectionOpt;

        @C09CT("shippingAddress")
        public final String shippingAddress;

        @C09CT("sku_id")
        public final String skuId;

        @C09CT("track_params")
        public final String trackParams;

        @C09CT("update_cache")
        public final Boolean updateCache;
        public static final C966803qE Companion = new C966803qE();
        public static final Parcelable.Creator<EnterParam> CREATOR = new Parcelable.Creator<EnterParam>() { // from class: X.03Fc
            @Override // android.os.Parcelable.Creator
            public final DeliveryPanelStarter.EnterParam createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                Integer numValueOf;
                MultiLogisticsPanelInfo multiLogisticsPanelInfoCreateFromParcel;
                Integer numValueOf2;
                Integer numValueOf3;
                boolean z;
                Boolean boolValueOf;
                Integer numValueOf4;
                LogisticPanelModule logisticPanelModuleCreateFromParcel;
                Integer numValueOf5;
                Float fValueOf;
                DeliveryPanelStarter.OrderDetail orderDetailCreateFromParcel;
                Integer numValueOf6;
                Integer numValueOf7;
                boolean z2;
                String string = parcel.readString();
                String string2 = parcel.readString();
                Boolean boolValueOf2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(Region.CREATOR.createFromParcel(parcel));
                    }
                }
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i3 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i4 = parcel.readInt();
                    arrayList2 = new ArrayList(i4);
                    for (int i5 = 0; i5 != i4; i5++) {
                        arrayList2.add(LogisticDTO.CREATOR.createFromParcel(parcel));
                    }
                }
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                String string8 = parcel.readString();
                if (parcel.readInt() == 0) {
                    multiLogisticsPanelInfoCreateFromParcel = null;
                } else {
                    multiLogisticsPanelInfoCreateFromParcel = MultiLogisticsPanelInfo.CREATOR.createFromParcel(parcel);
                }
                MultiLogisticsPanelInfo multiLogisticsPanelInfo = multiLogisticsPanelInfoCreateFromParcel;
                if (parcel.readInt() == 0) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(parcel.readInt());
                }
                String string9 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf3 = null;
                } else {
                    numValueOf3 = Integer.valueOf(parcel.readInt());
                }
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
                String string10 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    numValueOf4 = null;
                } else {
                    numValueOf4 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    logisticPanelModuleCreateFromParcel = null;
                } else {
                    logisticPanelModuleCreateFromParcel = LogisticPanelModule.CREATOR.createFromParcel(parcel);
                }
                LogisticPanelModule logisticPanelModule = logisticPanelModuleCreateFromParcel;
                String string11 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf5 = null;
                } else {
                    numValueOf5 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    fValueOf = null;
                } else {
                    fValueOf = Float.valueOf(parcel.readFloat());
                }
                String string12 = parcel.readString();
                if (parcel.readInt() == 0) {
                    orderDetailCreateFromParcel = null;
                } else {
                    orderDetailCreateFromParcel = DeliveryPanelStarter.OrderDetail.CREATOR.createFromParcel(parcel);
                }
                DeliveryPanelStarter.OrderDetail orderDetail = orderDetailCreateFromParcel;
                if (parcel.readInt() == 0) {
                    numValueOf6 = null;
                } else {
                    numValueOf6 = Integer.valueOf(parcel.readInt());
                }
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf7 = null;
                } else {
                    numValueOf7 = Integer.valueOf(parcel.readInt());
                }
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolValueOf2 = Boolean.valueOf(z2);
                }
                return new DeliveryPanelStarter.EnterParam(string, string2, arrayList, string3, string4, i3, arrayList2, string5, string6, string7, numValueOf, string8, multiLogisticsPanelInfo, numValueOf2, string9, numValueOf3, boolValueOf, string10, arrayListCreateStringArrayList, numValueOf4, logisticPanelModule, string11, numValueOf5, fValueOf, string12, orderDetail, numValueOf6, string13, string14, numValueOf7, string15, string16, boolValueOf2);
            }

            @Override // android.os.Parcelable.Creator
            public final DeliveryPanelStarter.EnterParam[] newArray(int i) {
                return new DeliveryPanelStarter.EnterParam[i];
            }
        };
        public static final int $stable = 8;

        public EnterParam() {
            this(null, null, null, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, 1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "normal_checkout", null, null, null, null, null, null, null, null, null, null, Boolean.FALSE);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnterParam)) {
                return false;
            }
            EnterParam enterParam = (EnterParam) obj;
            return Intrinsics.LJFF(this.selectedDeliveryTypeId, enterParam.selectedDeliveryTypeId) && Intrinsics.LJFF(this.selectedBuyerAddressId, enterParam.selectedBuyerAddressId) && Intrinsics.LJFF(this.selectedArea, enterParam.selectedArea) && Intrinsics.LJFF(this.productId, enterParam.productId) && Intrinsics.LJFF(this.skuId, enterParam.skuId) && this.quantity == enterParam.quantity && Intrinsics.LJFF(this.logisticList, enterParam.logisticList) && Intrinsics.LJFF(this.trackParams, enterParam.trackParams) && Intrinsics.LJFF(this.priceVal, enterParam.priceVal) && Intrinsics.LJFF(this.currency, enterParam.currency) && Intrinsics.LJFF(this.bizType, enterParam.bizType) && Intrinsics.LJFF(this.panelTitle, enterParam.panelTitle) && Intrinsics.LJFF(this.multiLogisticsPanelInfo, enterParam.multiLogisticsPanelInfo) && Intrinsics.LJFF(this.scene, enterParam.scene) && Intrinsics.LJFF(this.selectedAddressId, enterParam.selectedAddressId) && Intrinsics.LJFF(this.entranceScene, enterParam.entranceScene) && Intrinsics.LJFF(this.updateCache, enterParam.updateCache) && Intrinsics.LJFF(this.btmToken, enterParam.btmToken) && Intrinsics.LJFF(this.preSelectGeoNameIds, enterParam.preSelectGeoNameIds) && Intrinsics.LJFF(this.freeShipping, enterParam.freeShipping) && Intrinsics.LJFF(this.logisticsPanelModule, enterParam.logisticsPanelModule) && Intrinsics.LJFF(this.checkoutType, enterParam.checkoutType) && Intrinsics.LJFF(this.addressSelectScene, enterParam.addressSelectScene) && Intrinsics.LJFF(this.pageHeightPercent, enterParam.pageHeightPercent) && Intrinsics.LJFF(this.fromScene, enterParam.fromScene) && Intrinsics.LJFF(this.orderDetail, enterParam.orderDetail) && Intrinsics.LJFF(this.selectTab, enterParam.selectTab) && Intrinsics.LJFF(this.shippingAddress, enterParam.shippingAddress) && Intrinsics.LJFF(this.createOrderInfoFromBill, enterParam.createOrderInfoFromBill) && Intrinsics.LJFF(this.selfCollectionOpt, enterParam.selfCollectionOpt) && Intrinsics.LJFF(this.extraParamsForLynx, enterParam.extraParamsForLynx) && Intrinsics.LJFF(this.enterMethod, enterParam.enterMethod) && Intrinsics.LJFF(this.hideTitle, enterParam.hideTitle);
        }

        public final int hashCode() {
            String str = this.selectedDeliveryTypeId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.selectedBuyerAddressId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<Region> list = this.selectedArea;
            int iHashCode3 = (((((((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.productId.hashCode()) * 31) + this.skuId.hashCode()) * 31) + this.quantity) * 31;
            List<LogisticDTO> list2 = this.logisticList;
            int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str3 = this.trackParams;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.priceVal;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.currency;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.bizType;
            int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
            String str6 = this.panelTitle;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            MultiLogisticsPanelInfo multiLogisticsPanelInfo = this.multiLogisticsPanelInfo;
            int iHashCode10 = (iHashCode9 + (multiLogisticsPanelInfo == null ? 0 : multiLogisticsPanelInfo.hashCode())) * 31;
            Integer num2 = this.scene;
            int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str7 = this.selectedAddressId;
            int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Integer num3 = this.entranceScene;
            int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Boolean bool = this.updateCache;
            int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str8 = this.btmToken;
            int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
            List<String> list3 = this.preSelectGeoNameIds;
            int iHashCode16 = (iHashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Integer num4 = this.freeShipping;
            int iHashCode17 = (iHashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
            LogisticPanelModule logisticPanelModule = this.logisticsPanelModule;
            int iHashCode18 = (iHashCode17 + (logisticPanelModule == null ? 0 : logisticPanelModule.hashCode())) * 31;
            String str9 = this.checkoutType;
            int iHashCode19 = (iHashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Integer num5 = this.addressSelectScene;
            int iHashCode20 = (iHashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Float f = this.pageHeightPercent;
            int iHashCode21 = (iHashCode20 + (f == null ? 0 : f.hashCode())) * 31;
            String str10 = this.fromScene;
            int iHashCode22 = (iHashCode21 + (str10 == null ? 0 : str10.hashCode())) * 31;
            OrderDetail orderDetail = this.orderDetail;
            int iHashCode23 = (iHashCode22 + (orderDetail == null ? 0 : orderDetail.hashCode())) * 31;
            Integer num6 = this.selectTab;
            int iHashCode24 = (iHashCode23 + (num6 == null ? 0 : num6.hashCode())) * 31;
            String str11 = this.shippingAddress;
            int iHashCode25 = (iHashCode24 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.createOrderInfoFromBill;
            int iHashCode26 = (iHashCode25 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Integer num7 = this.selfCollectionOpt;
            int iHashCode27 = (iHashCode26 + (num7 == null ? 0 : num7.hashCode())) * 31;
            String str13 = this.extraParamsForLynx;
            int iHashCode28 = (iHashCode27 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.enterMethod;
            int iHashCode29 = (iHashCode28 + (str14 == null ? 0 : str14.hashCode())) * 31;
            Boolean bool2 = this.hideTitle;
            return iHashCode29 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            return "EnterParam(selectedDeliveryTypeId=" + this.selectedDeliveryTypeId + ", selectedBuyerAddressId=" + this.selectedBuyerAddressId + ", selectedArea=" + this.selectedArea + ", productId=" + this.productId + ", skuId=" + this.skuId + ", quantity=" + this.quantity + ", logisticList=" + this.logisticList + ", trackParams=" + this.trackParams + ", priceVal=" + this.priceVal + ", currency=" + this.currency + ", bizType=" + this.bizType + ", panelTitle=" + this.panelTitle + ", multiLogisticsPanelInfo=" + this.multiLogisticsPanelInfo + ", scene=" + this.scene + ", selectedAddressId=" + this.selectedAddressId + ", entranceScene=" + this.entranceScene + ", updateCache=" + this.updateCache + ", btmToken=" + this.btmToken + ", preSelectGeoNameIds=" + this.preSelectGeoNameIds + ", freeShipping=" + this.freeShipping + ", logisticsPanelModule=" + this.logisticsPanelModule + ", checkoutType=" + this.checkoutType + ", addressSelectScene=" + this.addressSelectScene + ", pageHeightPercent=" + this.pageHeightPercent + ", fromScene=" + this.fromScene + ", orderDetail=" + this.orderDetail + ", selectTab=" + this.selectTab + ", shippingAddress=" + this.shippingAddress + ", createOrderInfoFromBill=" + this.createOrderInfoFromBill + ", selfCollectionOpt=" + this.selfCollectionOpt + ", extraParamsForLynx=" + this.extraParamsForLynx + ", enterMethod=" + this.enterMethod + ", hideTitle=" + this.hideTitle + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.selectedDeliveryTypeId);
            parcel.writeString(this.selectedBuyerAddressId);
            List<Region> list = this.selectedArea;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<Region> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.productId);
            parcel.writeString(this.skuId);
            parcel.writeInt(this.quantity);
            List<LogisticDTO> list2 = this.logisticList;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list2.size());
                Iterator<LogisticDTO> it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next().writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.trackParams);
            parcel.writeString(this.priceVal);
            parcel.writeString(this.currency);
            Integer num = this.bizType;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.panelTitle);
            MultiLogisticsPanelInfo multiLogisticsPanelInfo = this.multiLogisticsPanelInfo;
            if (multiLogisticsPanelInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                multiLogisticsPanelInfo.writeToParcel(parcel, i);
            }
            Integer num2 = this.scene;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            parcel.writeString(this.selectedAddressId);
            Integer num3 = this.entranceScene;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num3.intValue());
            }
            Boolean bool = this.updateCache;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            parcel.writeString(this.btmToken);
            parcel.writeStringList(this.preSelectGeoNameIds);
            Integer num4 = this.freeShipping;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num4.intValue());
            }
            LogisticPanelModule logisticPanelModule = this.logisticsPanelModule;
            if (logisticPanelModule == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                logisticPanelModule.writeToParcel(parcel, i);
            }
            parcel.writeString(this.checkoutType);
            Integer num5 = this.addressSelectScene;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num5.intValue());
            }
            Float f = this.pageHeightPercent;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeFloat(f.floatValue());
            }
            parcel.writeString(this.fromScene);
            OrderDetail orderDetail = this.orderDetail;
            if (orderDetail == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                orderDetail.writeToParcel(parcel, i);
            }
            Integer num6 = this.selectTab;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num6.intValue());
            }
            parcel.writeString(this.shippingAddress);
            parcel.writeString(this.createOrderInfoFromBill);
            Integer num7 = this.selfCollectionOpt;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num7.intValue());
            }
            parcel.writeString(this.extraParamsForLynx);
            parcel.writeString(this.enterMethod);
            Boolean bool2 = this.hideTitle;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            }
        }

        public static EnterParam LIZ(EnterParam enterParam, Integer num, String str, int i) {
            String str2;
            String str3;
            List<Region> list;
            String str4;
            String str5;
            int i2;
            List<LogisticDTO> list2;
            String str6;
            String str7;
            String str8;
            Integer num2;
            String str9;
            MultiLogisticsPanelInfo multiLogisticsPanelInfo;
            String str10;
            Integer num3;
            Boolean bool;
            List<String> list3;
            Integer num4;
            LogisticPanelModule logisticPanelModule;
            String str11;
            Integer num5;
            Float f;
            String str12;
            OrderDetail orderDetail;
            Integer num6;
            String str13;
            String str14;
            Integer num7;
            String str15;
            String str16 = str;
            Integer num8 = num;
            String str17 = null;
            if ((i & 1) != 0) {
                str2 = enterParam.selectedDeliveryTypeId;
            } else {
                str2 = null;
            }
            if ((i & 2) != 0) {
                str3 = enterParam.selectedBuyerAddressId;
            } else {
                str3 = null;
            }
            if ((i & 4) != 0) {
                list = enterParam.selectedArea;
            } else {
                list = null;
            }
            if ((i & 8) != 0) {
                str4 = enterParam.productId;
            } else {
                str4 = null;
            }
            if ((i & 16) != 0) {
                str5 = enterParam.skuId;
            } else {
                str5 = null;
            }
            if ((i & 32) != 0) {
                i2 = enterParam.quantity;
            } else {
                i2 = 0;
            }
            if ((i & 64) != 0) {
                list2 = enterParam.logisticList;
            } else {
                list2 = null;
            }
            if ((i & 128) != 0) {
                str6 = enterParam.trackParams;
            } else {
                str6 = null;
            }
            if ((i & 256) != 0) {
                str7 = enterParam.priceVal;
            } else {
                str7 = null;
            }
            if ((i & 512) != 0) {
                str8 = enterParam.currency;
            } else {
                str8 = null;
            }
            if ((i & 1024) != 0) {
                num2 = enterParam.bizType;
            } else {
                num2 = null;
            }
            if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
                str9 = enterParam.panelTitle;
            } else {
                str9 = null;
            }
            if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
                multiLogisticsPanelInfo = enterParam.multiLogisticsPanelInfo;
            } else {
                multiLogisticsPanelInfo = null;
            }
            if ((i & 8192) != 0) {
                num8 = enterParam.scene;
            }
            if ((i & 16384) != 0) {
                str10 = enterParam.selectedAddressId;
            } else {
                str10 = null;
            }
            if ((32768 & i) != 0) {
                num3 = enterParam.entranceScene;
            } else {
                num3 = null;
            }
            if ((65536 & i) != 0) {
                bool = enterParam.updateCache;
            } else {
                bool = null;
            }
            if ((131072 & i) != 0) {
                str16 = enterParam.btmToken;
            }
            if ((262144 & i) != 0) {
                list3 = enterParam.preSelectGeoNameIds;
            } else {
                list3 = null;
            }
            if ((524288 & i) != 0) {
                num4 = enterParam.freeShipping;
            } else {
                num4 = null;
            }
            if ((1048576 & i) != 0) {
                logisticPanelModule = enterParam.logisticsPanelModule;
            } else {
                logisticPanelModule = null;
            }
            if ((2097152 & i) != 0) {
                str11 = enterParam.checkoutType;
            } else {
                str11 = null;
            }
            if ((4194304 & i) != 0) {
                num5 = enterParam.addressSelectScene;
            } else {
                num5 = null;
            }
            if ((8388608 & i) != 0) {
                f = enterParam.pageHeightPercent;
            } else {
                f = null;
            }
            if ((16777216 & i) != 0) {
                str12 = enterParam.fromScene;
            } else {
                str12 = null;
            }
            if ((33554432 & i) != 0) {
                orderDetail = enterParam.orderDetail;
            } else {
                orderDetail = null;
            }
            if ((67108864 & i) != 0) {
                num6 = enterParam.selectTab;
            } else {
                num6 = null;
            }
            if ((134217728 & i) != 0) {
                str13 = enterParam.shippingAddress;
            } else {
                str13 = null;
            }
            if ((268435456 & i) != 0) {
                str14 = enterParam.createOrderInfoFromBill;
            } else {
                str14 = null;
            }
            if ((536870912 & i) != 0) {
                num7 = enterParam.selfCollectionOpt;
            } else {
                num7 = null;
            }
            if ((1073741824 & i) != 0) {
                str15 = enterParam.extraParamsForLynx;
            } else {
                str15 = null;
            }
            if ((i & Integer.MIN_VALUE) != 0) {
                str17 = enterParam.enterMethod;
            }
            return new EnterParam(str2, str3, list, str4, str5, i2, list2, str6, str7, str8, num2, str9, multiLogisticsPanelInfo, num8, str10, num3, bool, str16, list3, num4, logisticPanelModule, str11, num5, f, str12, orderDetail, num6, str13, str14, num7, str15, str17, enterParam.hideTitle);
        }

        public EnterParam(String str, String str2, List<Region> list, String str3, String str4, int i, List<LogisticDTO> list2, String str5, String str6, String str7, Integer num, String str8, MultiLogisticsPanelInfo multiLogisticsPanelInfo, Integer num2, String str9, Integer num3, Boolean bool, String str10, List<String> list3, Integer num4, LogisticPanelModule logisticPanelModule, String str11, Integer num5, Float f, String str12, OrderDetail orderDetail, Integer num6, String str13, String str14, Integer num7, String str15, String str16, Boolean bool2) {
            this.selectedDeliveryTypeId = str;
            this.selectedBuyerAddressId = str2;
            this.selectedArea = list;
            this.productId = str3;
            this.skuId = str4;
            this.quantity = i;
            this.logisticList = list2;
            this.trackParams = str5;
            this.priceVal = str6;
            this.currency = str7;
            this.bizType = num;
            this.panelTitle = str8;
            this.multiLogisticsPanelInfo = multiLogisticsPanelInfo;
            this.scene = num2;
            this.selectedAddressId = str9;
            this.entranceScene = num3;
            this.updateCache = bool;
            this.btmToken = str10;
            this.preSelectGeoNameIds = list3;
            this.freeShipping = num4;
            this.logisticsPanelModule = logisticPanelModule;
            this.checkoutType = str11;
            this.addressSelectScene = num5;
            this.pageHeightPercent = f;
            this.fromScene = str12;
            this.orderDetail = orderDetail;
            this.selectTab = num6;
            this.shippingAddress = str13;
            this.createOrderInfoFromBill = str14;
            this.selfCollectionOpt = num7;
            this.extraParamsForLynx = str15;
            this.enterMethod = str16;
            this.hideTitle = bool2;
        }
    }

    public final Object LIZIZ(Context context, EnterParamForOrderSubmitPage enterParamForOrderSubmitPage, String str, String str2, String str3, Float f, InterfaceC1364105Vn<? super PackedDeliverySelectResult> interfaceC1364105Vn) {
        Integer numLJ;
        String str4 = enterParamForOrderSubmitPage.selectedLogisticTypeId;
        List<LogisticDTO> list = enterParamForOrderSubmitPage.logisticList;
        String str5 = enterParamForOrderSubmitPage.trackParams;
        String str6 = enterParamForOrderSubmitPage.panelTitle;
        MultiLogisticsPanelInfo multiLogisticsPanelInfo = enterParamForOrderSubmitPage.multiLogisticsPanelInfo;
        LogisticPanelModule logisticPanelModule = enterParamForOrderSubmitPage.logisticsPanelModule;
        String str7 = enterParamForOrderSubmitPage.selectedAddressId;
        EnumC804103Cd enumC804103Cd = enterParamForOrderSubmitPage.selectionType;
        if (enumC804103Cd != null) {
            numLJ = C2286608xc.LJ(enumC804103Cd.getValue());
        } else {
            numLJ = null;
        }
        return LIZJ(context, null, new EnterParam(str4, str7, null, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, 1, list, str5, null, null, null, str6, multiLogisticsPanelInfo, null, null, null, false, null, null, null, logisticPanelModule, "normal_checkout", null, null, null, null, numLJ, enterParamForOrderSubmitPage.shippingAddress, enterParamForOrderSubmitPage.createOrderInfoFromBill, enterParamForOrderSubmitPage.selfCollectionOpt, null, enterParamForOrderSubmitPage.enterMethod, Boolean.FALSE), true, str, str2, str3, f, null, interfaceC1364105Vn);
    }

    public static final class EnterParamForOrderSubmitPage implements Parcelable {
        public final String createOrderInfoFromBill;
        public final String enterMethod;
        public final List<LogisticDTO> logisticList;
        public final LogisticPanelModule logisticsPanelModule;
        public final MultiLogisticsPanelInfo multiLogisticsPanelInfo;
        public final String panelTitle;
        public final String selectedAddressId;
        public final String selectedLogisticTypeId;
        public final EnumC804103Cd selectionType;
        public final Integer selfCollectionOpt;
        public final String shippingAddress;
        public final String trackParams;
        public static final Parcelable.Creator<EnterParamForOrderSubmitPage> CREATOR = new Parcelable.Creator<EnterParamForOrderSubmitPage>() { // from class: X.03D3
            @Override // android.os.Parcelable.Creator
            public final DeliveryPanelStarter.EnterParamForOrderSubmitPage createFromParcel(Parcel parcel) {
                MultiLogisticsPanelInfo multiLogisticsPanelInfoCreateFromParcel;
                LogisticPanelModule logisticPanelModuleCreateFromParcel;
                EnumC804103Cd enumC804103CdValueOf;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(LogisticDTO.CREATOR.createFromParcel(parcel));
                }
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Integer numValueOf = null;
                if (parcel.readInt() == 0) {
                    multiLogisticsPanelInfoCreateFromParcel = null;
                } else {
                    multiLogisticsPanelInfoCreateFromParcel = MultiLogisticsPanelInfo.CREATOR.createFromParcel(parcel);
                }
                MultiLogisticsPanelInfo multiLogisticsPanelInfo = multiLogisticsPanelInfoCreateFromParcel;
                if (parcel.readInt() == 0) {
                    logisticPanelModuleCreateFromParcel = null;
                } else {
                    logisticPanelModuleCreateFromParcel = LogisticPanelModule.CREATOR.createFromParcel(parcel);
                }
                LogisticPanelModule logisticPanelModule = logisticPanelModuleCreateFromParcel;
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    enumC804103CdValueOf = null;
                } else {
                    enumC804103CdValueOf = EnumC804103Cd.valueOf(parcel.readString());
                }
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new DeliveryPanelStarter.EnterParamForOrderSubmitPage(arrayList, string, string2, string3, multiLogisticsPanelInfo, logisticPanelModule, string4, enumC804103CdValueOf, string5, string6, string7, numValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final DeliveryPanelStarter.EnterParamForOrderSubmitPage[] newArray(int i) {
                return new DeliveryPanelStarter.EnterParamForOrderSubmitPage[i];
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
            if (!(obj instanceof EnterParamForOrderSubmitPage)) {
                return false;
            }
            EnterParamForOrderSubmitPage enterParamForOrderSubmitPage = (EnterParamForOrderSubmitPage) obj;
            return Intrinsics.LJFF(this.logisticList, enterParamForOrderSubmitPage.logisticList) && Intrinsics.LJFF(this.selectedLogisticTypeId, enterParamForOrderSubmitPage.selectedLogisticTypeId) && Intrinsics.LJFF(this.trackParams, enterParamForOrderSubmitPage.trackParams) && Intrinsics.LJFF(this.panelTitle, enterParamForOrderSubmitPage.panelTitle) && Intrinsics.LJFF(this.multiLogisticsPanelInfo, enterParamForOrderSubmitPage.multiLogisticsPanelInfo) && Intrinsics.LJFF(this.logisticsPanelModule, enterParamForOrderSubmitPage.logisticsPanelModule) && Intrinsics.LJFF(this.selectedAddressId, enterParamForOrderSubmitPage.selectedAddressId) && this.selectionType == enterParamForOrderSubmitPage.selectionType && Intrinsics.LJFF(this.shippingAddress, enterParamForOrderSubmitPage.shippingAddress) && Intrinsics.LJFF(this.createOrderInfoFromBill, enterParamForOrderSubmitPage.createOrderInfoFromBill) && Intrinsics.LJFF(this.enterMethod, enterParamForOrderSubmitPage.enterMethod) && Intrinsics.LJFF(this.selfCollectionOpt, enterParamForOrderSubmitPage.selfCollectionOpt);
        }

        public final int hashCode() {
            int iHashCode = this.logisticList.hashCode() * 31;
            String str = this.selectedLogisticTypeId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.trackParams;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.panelTitle;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            MultiLogisticsPanelInfo multiLogisticsPanelInfo = this.multiLogisticsPanelInfo;
            int iHashCode5 = (iHashCode4 + (multiLogisticsPanelInfo == null ? 0 : multiLogisticsPanelInfo.hashCode())) * 31;
            LogisticPanelModule logisticPanelModule = this.logisticsPanelModule;
            int iHashCode6 = (iHashCode5 + (logisticPanelModule == null ? 0 : logisticPanelModule.hashCode())) * 31;
            String str4 = this.selectedAddressId;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            EnumC804103Cd enumC804103Cd = this.selectionType;
            int iHashCode8 = (iHashCode7 + (enumC804103Cd == null ? 0 : enumC804103Cd.hashCode())) * 31;
            String str5 = this.shippingAddress;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.createOrderInfoFromBill;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.enterMethod;
            int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Integer num = this.selfCollectionOpt;
            return iHashCode11 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "EnterParamForOrderSubmitPage(logisticList=" + this.logisticList + ", selectedLogisticTypeId=" + this.selectedLogisticTypeId + ", trackParams=" + this.trackParams + ", panelTitle=" + this.panelTitle + ", multiLogisticsPanelInfo=" + this.multiLogisticsPanelInfo + ", logisticsPanelModule=" + this.logisticsPanelModule + ", selectedAddressId=" + this.selectedAddressId + ", selectionType=" + this.selectionType + ", shippingAddress=" + this.shippingAddress + ", createOrderInfoFromBill=" + this.createOrderInfoFromBill + ", enterMethod=" + this.enterMethod + ", selfCollectionOpt=" + this.selfCollectionOpt + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List<LogisticDTO> list = this.logisticList;
            parcel.writeInt(list.size());
            Iterator<LogisticDTO> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
            parcel.writeString(this.selectedLogisticTypeId);
            parcel.writeString(this.trackParams);
            parcel.writeString(this.panelTitle);
            MultiLogisticsPanelInfo multiLogisticsPanelInfo = this.multiLogisticsPanelInfo;
            if (multiLogisticsPanelInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                multiLogisticsPanelInfo.writeToParcel(parcel, i);
            }
            LogisticPanelModule logisticPanelModule = this.logisticsPanelModule;
            if (logisticPanelModule == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                logisticPanelModule.writeToParcel(parcel, i);
            }
            parcel.writeString(this.selectedAddressId);
            EnumC804103Cd enumC804103Cd = this.selectionType;
            if (enumC804103Cd == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(enumC804103Cd.name());
            }
            parcel.writeString(this.shippingAddress);
            parcel.writeString(this.createOrderInfoFromBill);
            parcel.writeString(this.enterMethod);
            Integer num = this.selfCollectionOpt;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
        }

        public /* synthetic */ EnterParamForOrderSubmitPage(List list, String str, String str2, String str3, MultiLogisticsPanelInfo multiLogisticsPanelInfo, LogisticPanelModule logisticPanelModule, String str4, Integer num, int i) {
            this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : multiLogisticsPanelInfo, (i & 32) != 0 ? null : logisticPanelModule, null, null, null, null, (i & 1024) != 0 ? null : str4, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num);
        }

        public EnterParamForOrderSubmitPage(List<LogisticDTO> list, String str, String str2, String str3, MultiLogisticsPanelInfo multiLogisticsPanelInfo, LogisticPanelModule logisticPanelModule, String str4, EnumC804103Cd enumC804103Cd, String str5, String str6, String str7, Integer num) {
            this.logisticList = list;
            this.selectedLogisticTypeId = str;
            this.trackParams = str2;
            this.panelTitle = str3;
            this.multiLogisticsPanelInfo = multiLogisticsPanelInfo;
            this.logisticsPanelModule = logisticPanelModule;
            this.selectedAddressId = str4;
            this.selectionType = enumC804103Cd;
            this.shippingAddress = str5;
            this.createOrderInfoFromBill = str6;
            this.enterMethod = str7;
            this.selfCollectionOpt = num;
        }
    }

    public static void LIZ(Context context, Boolean bool, EnterParam enterParam, boolean z, String str, String str2, String str3, Float f, String str4) {
        boolean zBooleanValue;
        String strLIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str5 = enterParam.selectedDeliveryTypeId;
        if (str5 != null) {
            linkedHashMap.put("delivery_type", str5);
        }
        String str6 = enterParam.selectedBuyerAddressId;
        if (str6 != null) {
            linkedHashMap.put("address_id", str6);
        }
        List<Region> list = enterParam.selectedArea;
        if (list != null) {
            linkedHashMap.put("area", list);
        }
        List<LogisticDTO> list2 = enterParam.logisticList;
        if (list2 != null) {
            linkedHashMap.put("logistic_list", list2);
        }
        String str7 = enterParam.trackParams;
        if (str7 != null) {
            linkedHashMap.put("track_params", str7);
        }
        Integer num = enterParam.selectTab;
        if (num != null) {
            linkedHashMap.put("selectTab", Integer.valueOf(num.intValue()));
        }
        String str8 = enterParam.shippingAddress;
        if (str8 != null) {
            linkedHashMap.put("shippingAddress", str8);
        }
        String str9 = enterParam.createOrderInfoFromBill;
        if (str9 != null) {
            linkedHashMap.put("createOrderInfoFromBill", str9);
        }
        String str10 = enterParam.enterMethod;
        if (str10 != null) {
            linkedHashMap.put("enter_method", str10);
        }
        Integer num2 = enterParam.selfCollectionOpt;
        if (num2 != null) {
            linkedHashMap.put("self_pickup_display_type", Integer.valueOf(num2.intValue()));
        }
        linkedHashMap.put("product_id", enterParam.productId);
        linkedHashMap.put("sku_id", enterParam.skuId);
        linkedHashMap.put("quantity", Integer.valueOf(enterParam.quantity));
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        linkedHashMap.put("needs_dim", Boolean.valueOf(zBooleanValue));
        String str11 = enterParam.priceVal;
        String str12 = "";
        if (str11 == null) {
            str11 = "";
        }
        linkedHashMap.put("price_val", str11);
        String str13 = enterParam.currency;
        if (str13 != null) {
            str12 = str13;
        }
        linkedHashMap.put("currency", str12);
        Boolean bool2 = enterParam.updateCache;
        if (bool2 != null) {
            strLIZ = C893803eS.LIZ(bool2.booleanValue());
        } else {
            strLIZ = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("update_cache", strLIZ);
        Integer num3 = enterParam.addressSelectScene;
        if (num3 != null) {
            linkedHashMap.put("address_selection_scene", Integer.valueOf(num3.intValue()));
        }
        Integer num4 = enterParam.bizType;
        if (num4 != null) {
            linkedHashMap.put("biz_type", Integer.valueOf(num4.intValue()));
        }
        String str14 = enterParam.panelTitle;
        if (str14 != null) {
            linkedHashMap.put("panel_title", str14);
        }
        MultiLogisticsPanelInfo multiLogisticsPanelInfo = enterParam.multiLogisticsPanelInfo;
        if (multiLogisticsPanelInfo != null) {
            linkedHashMap.put("multi_logistics_panel_info", multiLogisticsPanelInfo);
        }
        LogisticPanelModule logisticPanelModule = enterParam.logisticsPanelModule;
        if (logisticPanelModule != null) {
            linkedHashMap.put("logistic_panel_module", logisticPanelModule);
        }
        if (str3 != null) {
            linkedHashMap.put("checkout_type", str3);
        }
        if (f != null) {
            linkedHashMap.put("half_express_height_percent", Float.valueOf(f.floatValue()));
        }
        if (str2 != null) {
            linkedHashMap.put("source_btm_token", str2);
        }
        if (C123100dR.LIZ(str4)) {
            Map mapLJIIJ = C1741890vQh.LJIIJ(enterParam.extraParamsForLynx);
            if (mapLJIIJ == null) {
                mapLJIIJ = C2097608Jq.LJ();
            }
            linkedHashMap.putAll(mapLJIIJ);
        }
        if (str4 == null) {
            str4 = "aweme://ec/delivery";
        }
        SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(context, str4, linkedHashMap, z);
        if (str != null) {
            smartRouteLIZIZ.withParam("lib_track_rtn_id", str);
        }
        smartRouteLIZIZ.open();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(android.content.Context r14, java.lang.Boolean r15, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.EnterParam r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.Float r20, java.lang.String r21, X.InterfaceC1364105Vn r22) {
        /*
            r13 = this;
            r7 = 0
            r4 = r22
            boolean r0 = r4 instanceof X.C966203q8
            if (r0 == 0) goto L70
            r3 = r4
            X.03q8 r3 = (X.C966203q8) r3
            int r2 = r3.LLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r3.LLJI = r2
        L15:
            java.lang.Object r4 = r3.LLIZLLLIL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r3.LLJI
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 != r0) goto L76
            X.C155000ia.LIZIZ(r4)
        L25:
            r0 = 0
            com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.LIZJ = r0
            return r4
        L29:
            X.C155000ia.LIZIZ(r4)
            r4 = r14
            r3.LL = r4
            r5 = r15
            r3.LLILLJJLI = r5
            r3.getClass()
            r8 = r17
            r3.LLILLL = r8
            r9 = r18
            r3.LLILZ = r9
            r10 = r19
            r3.LLILZIL = r10
            r11 = r20
            r3.LLILZLL = r11
            r12 = r21
            r3.LLIZ = r12
            r3.LLJI = r0
            X.099m r1 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r3)
            r1.<init>(r0)
            com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.LIZJ = r1
            com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter r0 = com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.LIZ
            r0.getClass()
            r6 = r16
            LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r4 = r1.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r4 != r0) goto L6d
            X.C099Q.LIZJ(r3)
        L6d:
            if (r4 != r2) goto L25
            return r2
        L70:
            X.03q8 r3 = new X.03q8
            r3.<init>(r13, r4)
            goto L15
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.LJFF(android.content.Context, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter$EnterParam, java.lang.String, java.lang.String, java.lang.String, java.lang.Float, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(android.content.Context r14, java.lang.Boolean r15, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.EnterParam r16, boolean r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Float r21, java.lang.String r22, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.PackedDeliverySelectResult> r23) {
        /*
            r13 = this;
            r4 = r23
            boolean r0 = r4 instanceof X.C966103q7
            if (r0 == 0) goto L71
            r3 = r4
            X.03q7 r3 = (X.C966103q7) r3
            int r2 = r3.LLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r3.LLJI = r2
        L14:
            java.lang.Object r4 = r3.LLIZLLLIL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r3.LLJI
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 != r0) goto L77
            X.C155000ia.LIZIZ(r4)
        L24:
            r0 = 0
            com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.LIZIZ = r0
            return r4
        L28:
            X.C155000ia.LIZIZ(r4)
            r4 = r14
            r3.LL = r4
            r5 = r15
            r3.LLILLJJLI = r5
            r3.getClass()
            r8 = r18
            r3.LLILLL = r8
            r9 = r19
            r3.LLILZ = r9
            r10 = r20
            r3.LLILZIL = r10
            r11 = r21
            r3.LLILZLL = r11
            r12 = r22
            r3.LLIZ = r12
            r3.LLJI = r0
            X.099m r1 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r3)
            r1.<init>(r0)
            com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.LIZIZ = r1
            com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter r0 = com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.LIZ
            r0.getClass()
            r7 = r17
            r6 = r16
            LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r4 = r1.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r4 != r0) goto L6e
            X.C099Q.LIZJ(r3)
        L6e:
            if (r4 != r2) goto L24
            return r2
        L71:
            X.03q7 r3 = new X.03q7
            r3.<init>(r13, r4)
            goto L14
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.LIZJ(android.content.Context, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter$EnterParam, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Float, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final Object LIZLLL(Context context, boolean z, EnterParamForProductDetailPage enterParamForProductDetailPage, String str, Integer num, String str2, Integer num2, Integer num3, String str3, InterfaceC1364105Vn<? super PackedDeliverySelectResult> interfaceC1364105Vn) {
        return LIZJ(context, Boolean.valueOf(z), new EnterParam(enterParamForProductDetailPage.selectedLogisticTypeId, enterParamForProductDetailPage.selectedBuyerAddressId, enterParamForProductDetailPage.selectedArea, enterParamForProductDetailPage.productId, enterParamForProductDetailPage.skuId, enterParamForProductDetailPage.quantity, null, enterParamForProductDetailPage.trackParams, enterParamForProductDetailPage.priceVal, enterParamForProductDetailPage.current, num, null, null, null, null, null, true, null, null, num2, null, "normal_checkout", num3, null, null, null, null, null, null, null, enterParamForProductDetailPage.extraParamsForLynx, enterParamForProductDetailPage.enterMethod, Boolean.FALSE), false, str, str2, "normal_checkout", null, str3, interfaceC1364105Vn);
    }

    public static final class EnterParamForProductDetailPage implements Parcelable {
        public final String current;
        public final String enterMethod;
        public final String extraParamsForLynx;
        public final String priceVal;
        public final String productId;
        public final int quantity;
        public final List<Region> selectedArea;
        public final String selectedBuyerAddressId;
        public final String selectedLogisticTypeId;
        public final String skuId;
        public final String trackParams;
        public static final Parcelable.Creator<EnterParamForProductDetailPage> CREATOR = new Parcelable.Creator<EnterParamForProductDetailPage>() { // from class: X.03qA
            @Override // android.os.Parcelable.Creator
            public final DeliveryPanelStarter.EnterParamForProductDetailPage createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(Region.CREATOR.createFromParcel(parcel));
                    }
                }
                return new DeliveryPanelStarter.EnterParamForProductDetailPage(string, string2, arrayList, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DeliveryPanelStarter.EnterParamForProductDetailPage[] newArray(int i) {
                return new DeliveryPanelStarter.EnterParamForProductDetailPage[i];
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
            if (!(obj instanceof EnterParamForProductDetailPage)) {
                return false;
            }
            EnterParamForProductDetailPage enterParamForProductDetailPage = (EnterParamForProductDetailPage) obj;
            return Intrinsics.LJFF(this.selectedLogisticTypeId, enterParamForProductDetailPage.selectedLogisticTypeId) && Intrinsics.LJFF(this.selectedBuyerAddressId, enterParamForProductDetailPage.selectedBuyerAddressId) && Intrinsics.LJFF(this.selectedArea, enterParamForProductDetailPage.selectedArea) && Intrinsics.LJFF(this.productId, enterParamForProductDetailPage.productId) && Intrinsics.LJFF(this.skuId, enterParamForProductDetailPage.skuId) && this.quantity == enterParamForProductDetailPage.quantity && Intrinsics.LJFF(this.trackParams, enterParamForProductDetailPage.trackParams) && Intrinsics.LJFF(this.priceVal, enterParamForProductDetailPage.priceVal) && Intrinsics.LJFF(this.current, enterParamForProductDetailPage.current) && Intrinsics.LJFF(this.extraParamsForLynx, enterParamForProductDetailPage.extraParamsForLynx) && Intrinsics.LJFF(this.enterMethod, enterParamForProductDetailPage.enterMethod);
        }

        public final int hashCode() {
            String str = this.selectedLogisticTypeId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.selectedBuyerAddressId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<Region> list = this.selectedArea;
            int iHashCode3 = (((((((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.productId.hashCode()) * 31) + this.skuId.hashCode()) * 31) + this.quantity) * 31;
            String str3 = this.trackParams;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.priceVal;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.current;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.extraParamsForLynx;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.enterMethod;
            return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String toString() {
            return "EnterParamForProductDetailPage(selectedLogisticTypeId=" + this.selectedLogisticTypeId + ", selectedBuyerAddressId=" + this.selectedBuyerAddressId + ", selectedArea=" + this.selectedArea + ", productId=" + this.productId + ", skuId=" + this.skuId + ", quantity=" + this.quantity + ", trackParams=" + this.trackParams + ", priceVal=" + this.priceVal + ", current=" + this.current + ", extraParamsForLynx=" + this.extraParamsForLynx + ", enterMethod=" + this.enterMethod + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.selectedLogisticTypeId);
            parcel.writeString(this.selectedBuyerAddressId);
            List<Region> list = this.selectedArea;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<Region> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.productId);
            parcel.writeString(this.skuId);
            parcel.writeInt(this.quantity);
            parcel.writeString(this.trackParams);
            parcel.writeString(this.priceVal);
            parcel.writeString(this.current);
            parcel.writeString(this.extraParamsForLynx);
            parcel.writeString(this.enterMethod);
        }

        public /* synthetic */ EnterParamForProductDetailPage(String str, String str2, List list, String str3, String str4, int i, String str5, String str6, String str7, String str8, int i2) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (List<Region>) ((i2 & 4) != 0 ? null : list), str3, str4, i, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? null : str8, (String) null);
        }

        public EnterParamForProductDetailPage(String str, String str2, List<Region> list, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9) {
            this.selectedLogisticTypeId = str;
            this.selectedBuyerAddressId = str2;
            this.selectedArea = list;
            this.productId = str3;
            this.skuId = str4;
            this.quantity = i;
            this.trackParams = str5;
            this.priceVal = str6;
            this.current = str7;
            this.extraParamsForLynx = str8;
            this.enterMethod = str9;
        }
    }
}
