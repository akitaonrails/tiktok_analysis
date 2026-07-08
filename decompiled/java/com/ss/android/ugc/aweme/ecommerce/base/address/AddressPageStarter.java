package com.ss.android.ugc.aweme.ecommerce.base.address;

import X.AnonymousClass0410;
import X.C037A;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09CT;
import X.C23260099m;
import X.C786410Ut5;
import X.C893803eS;
import X.C919503ib;
import X.C960603pE;
import X.C976403rm;
import X.C978703s9;
import X.InterfaceC1364105Vn;
import X.InterfaceC1748810vbr;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.SmartRoute;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionSku;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.LocationUseBar;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressPageStarter {
    public static final AddressPageStarter LIZ = new AddressPageStarter();
    public static C23260099m LIZIZ;
    public static C23260099m LIZJ;

    public static final class AddressListEnterParams implements Parcelable {
        public final Integer addressEntranceScene;
        public final Integer addressSelectScene;
        public final String btmToken;
        public final String checkoutType;
        public final String extraInfo;
        public Boolean forceEditMode;
        public Boolean forceVertical;
        public final Integer freeShipping;
        public final boolean fromClaimIncentive;
        public Boolean hideBottomAddAddress;
        public Boolean hideTitle;
        public final String incentiveRecordId;
        public Boolean isHalfScreenListPage;
        public final int isSelectMode;
        public final Integer markUnavailableAddress;
        public final Boolean needTaxIdItem;
        public final Float pageHeightPercent;
        public final String productId;
        public final Integer scene;
        public final String sceneParamsStr;
        public final Integer selectScene;
        public final String trackParams;
        public final boolean updateCache;
        public static final C976403rm Companion = new C976403rm();
        public static final Parcelable.Creator<AddressListEnterParams> CREATOR = new Parcelable.Creator<AddressListEnterParams>() { // from class: X.03rq
            @Override // android.os.Parcelable.Creator
            public final AddressPageStarter.AddressListEnterParams createFromParcel(Parcel parcel) {
                boolean z;
                Integer numValueOf;
                Integer numValueOf2;
                Integer numValueOf3;
                Integer numValueOf4;
                Integer numValueOf5;
                boolean z2;
                Integer numValueOf6;
                Float fValueOf;
                boolean z3;
                Boolean boolValueOf;
                boolean z4;
                Boolean boolValueOf2;
                boolean z5;
                Boolean boolValueOf3;
                boolean z6;
                Boolean boolValueOf4;
                boolean z7;
                Boolean boolValueOf5;
                int i = parcel.readInt();
                String string = parcel.readString();
                boolean z8 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Boolean boolValueOf6 = null;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(parcel.readInt());
                }
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf3 = null;
                } else {
                    numValueOf3 = Integer.valueOf(parcel.readInt());
                }
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf4 = null;
                } else {
                    numValueOf4 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    numValueOf5 = null;
                } else {
                    numValueOf5 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf6 = null;
                } else {
                    numValueOf6 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    fValueOf = null;
                } else {
                    fValueOf = Float.valueOf(parcel.readFloat());
                }
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolValueOf = Boolean.valueOf(z3);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolValueOf2 = Boolean.valueOf(z4);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolValueOf3 = Boolean.valueOf(z5);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf4 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolValueOf4 = Boolean.valueOf(z6);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf5 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolValueOf5 = Boolean.valueOf(z7);
                }
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() == 0) {
                        z8 = false;
                    }
                    boolValueOf6 = Boolean.valueOf(z8);
                }
                return new AddressPageStarter.AddressListEnterParams(i, string, z, string2, string3, numValueOf, numValueOf2, string4, numValueOf3, string5, numValueOf4, numValueOf5, z2, string6, string7, numValueOf6, fValueOf, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6);
            }

            @Override // android.os.Parcelable.Creator
            public final AddressPageStarter.AddressListEnterParams[] newArray(int i) {
                return new AddressPageStarter.AddressListEnterParams[i];
            }
        };
        public static final int $stable = 8;

        public AddressListEnterParams() {
            this(0, null, false, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
        }

        public final AddressListEnterParams copy(int i, String str, boolean z, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, String str5, Integer num4, Integer num5, boolean z2, String str6, String str7, Integer num6, Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
            return new AddressListEnterParams(i, str, z, str2, str3, num, num2, str4, num3, str5, num4, num5, z2, str6, str7, num6, f, bool, bool2, bool3, bool4, bool5, bool6);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressListEnterParams)) {
                return false;
            }
            AddressListEnterParams addressListEnterParams = (AddressListEnterParams) obj;
            return this.isSelectMode == addressListEnterParams.isSelectMode && Intrinsics.LJFF(this.trackParams, addressListEnterParams.trackParams) && this.fromClaimIncentive == addressListEnterParams.fromClaimIncentive && Intrinsics.LJFF(this.incentiveRecordId, addressListEnterParams.incentiveRecordId) && Intrinsics.LJFF(this.productId, addressListEnterParams.productId) && Intrinsics.LJFF(this.markUnavailableAddress, addressListEnterParams.markUnavailableAddress) && Intrinsics.LJFF(this.scene, addressListEnterParams.scene) && Intrinsics.LJFF(this.sceneParamsStr, addressListEnterParams.sceneParamsStr) && Intrinsics.LJFF(this.selectScene, addressListEnterParams.selectScene) && Intrinsics.LJFF(this.extraInfo, addressListEnterParams.extraInfo) && Intrinsics.LJFF(this.freeShipping, addressListEnterParams.freeShipping) && Intrinsics.LJFF(this.addressEntranceScene, addressListEnterParams.addressEntranceScene) && this.updateCache == addressListEnterParams.updateCache && Intrinsics.LJFF(this.btmToken, addressListEnterParams.btmToken) && Intrinsics.LJFF(this.checkoutType, addressListEnterParams.checkoutType) && Intrinsics.LJFF(this.addressSelectScene, addressListEnterParams.addressSelectScene) && Intrinsics.LJFF(this.pageHeightPercent, addressListEnterParams.pageHeightPercent) && Intrinsics.LJFF(this.needTaxIdItem, addressListEnterParams.needTaxIdItem) && Intrinsics.LJFF(this.isHalfScreenListPage, addressListEnterParams.isHalfScreenListPage) && Intrinsics.LJFF(this.hideBottomAddAddress, addressListEnterParams.hideBottomAddAddress) && Intrinsics.LJFF(this.hideTitle, addressListEnterParams.hideTitle) && Intrinsics.LJFF(this.forceEditMode, addressListEnterParams.forceEditMode) && Intrinsics.LJFF(this.forceVertical, addressListEnterParams.forceVertical);
        }

        public int hashCode() {
            int i = this.isSelectMode * 31;
            String str = this.trackParams;
            int iHashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.fromClaimIncentive)) * 31;
            String str2 = this.incentiveRecordId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.productId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.markUnavailableAddress;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.scene;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str4 = this.sceneParamsStr;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num3 = this.selectScene;
            int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str5 = this.extraInfo;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num4 = this.freeShipping;
            int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.addressEntranceScene;
            int iHashCode10 = (((iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31) + C786410Ut5.Z2(this.updateCache)) * 31;
            String str6 = this.btmToken;
            int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.checkoutType;
            int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Integer num6 = this.addressSelectScene;
            int iHashCode13 = (iHashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Float f = this.pageHeightPercent;
            int iHashCode14 = (iHashCode13 + (f == null ? 0 : f.hashCode())) * 31;
            Boolean bool = this.needTaxIdItem;
            int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isHalfScreenListPage;
            int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.hideBottomAddAddress;
            int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.hideTitle;
            int iHashCode18 = (iHashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.forceEditMode;
            int iHashCode19 = (iHashCode18 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.forceVertical;
            return iHashCode19 + (bool6 != null ? bool6.hashCode() : 0);
        }

        public String toString() {
            return "AddressListEnterParams(isSelectMode=" + this.isSelectMode + ", trackParams=" + this.trackParams + ", fromClaimIncentive=" + this.fromClaimIncentive + ", incentiveRecordId=" + this.incentiveRecordId + ", productId=" + this.productId + ", markUnavailableAddress=" + this.markUnavailableAddress + ", scene=" + this.scene + ", sceneParamsStr=" + this.sceneParamsStr + ", selectScene=" + this.selectScene + ", extraInfo=" + this.extraInfo + ", freeShipping=" + this.freeShipping + ", addressEntranceScene=" + this.addressEntranceScene + ", updateCache=" + this.updateCache + ", btmToken=" + this.btmToken + ", checkoutType=" + this.checkoutType + ", addressSelectScene=" + this.addressSelectScene + ", pageHeightPercent=" + this.pageHeightPercent + ", needTaxIdItem=" + this.needTaxIdItem + ", isHalfScreenListPage=" + this.isHalfScreenListPage + ", hideBottomAddAddress=" + this.hideBottomAddAddress + ", hideTitle=" + this.hideTitle + ", forceEditMode=" + this.forceEditMode + ", forceVertical=" + this.forceVertical + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.isSelectMode);
            parcel.writeString(this.trackParams);
            parcel.writeInt(this.fromClaimIncentive ? 1 : 0);
            parcel.writeString(this.incentiveRecordId);
            parcel.writeString(this.productId);
            Integer num = this.markUnavailableAddress;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.scene;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            parcel.writeString(this.sceneParamsStr);
            Integer num3 = this.selectScene;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num3.intValue());
            }
            parcel.writeString(this.extraInfo);
            Integer num4 = this.freeShipping;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num4.intValue());
            }
            Integer num5 = this.addressEntranceScene;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num5.intValue());
            }
            parcel.writeInt(this.updateCache ? 1 : 0);
            parcel.writeString(this.btmToken);
            parcel.writeString(this.checkoutType);
            Integer num6 = this.addressSelectScene;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num6.intValue());
            }
            Float f = this.pageHeightPercent;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeFloat(f.floatValue());
            }
            Boolean bool = this.needTaxIdItem;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.isHalfScreenListPage;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            Boolean bool3 = this.hideBottomAddAddress;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool3.booleanValue() ? 1 : 0);
            }
            Boolean bool4 = this.hideTitle;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool4.booleanValue() ? 1 : 0);
            }
            Boolean bool5 = this.forceEditMode;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool5.booleanValue() ? 1 : 0);
            }
            Boolean bool6 = this.forceVertical;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool6.booleanValue() ? 1 : 0);
            }
        }

        public final Integer getAddressEntranceScene() {
            return this.addressEntranceScene;
        }

        public final Integer getAddressSelectScene() {
            return this.addressSelectScene;
        }

        public final String getBtmToken() {
            return this.btmToken;
        }

        public final String getCheckoutType() {
            return this.checkoutType;
        }

        public final String getExtraInfo() {
            return this.extraInfo;
        }

        public final Boolean getForceEditMode() {
            return this.forceEditMode;
        }

        public final Boolean getForceVertical() {
            return this.forceVertical;
        }

        public final Integer getFreeShipping() {
            return this.freeShipping;
        }

        public final boolean getFromClaimIncentive() {
            return this.fromClaimIncentive;
        }

        public final Boolean getHideBottomAddAddress() {
            return this.hideBottomAddAddress;
        }

        public final Boolean getHideTitle() {
            return this.hideTitle;
        }

        public final String getIncentiveRecordId() {
            return this.incentiveRecordId;
        }

        public final Integer getMarkUnavailableAddress() {
            return this.markUnavailableAddress;
        }

        public final Boolean getNeedTaxIdItem() {
            return this.needTaxIdItem;
        }

        public final Float getPageHeightPercent() {
            return this.pageHeightPercent;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final Integer getScene() {
            return this.scene;
        }

        public final String getSceneParamsStr() {
            return this.sceneParamsStr;
        }

        public final Integer getSelectScene() {
            return this.selectScene;
        }

        public final String getTrackParams() {
            return this.trackParams;
        }

        public final boolean getUpdateCache() {
            return this.updateCache;
        }

        public final Boolean isHalfScreenListPage() {
            return this.isHalfScreenListPage;
        }

        public final int isSelectMode() {
            return this.isSelectMode;
        }

        public final void setForceEditMode(Boolean bool) {
            this.forceEditMode = bool;
        }

        public final void setForceVertical(Boolean bool) {
            this.forceVertical = bool;
        }

        public final void setHalfScreenListPage(Boolean bool) {
            this.isHalfScreenListPage = bool;
        }

        public final void setHideBottomAddAddress(Boolean bool) {
            this.hideBottomAddAddress = bool;
        }

        public final void setHideTitle(Boolean bool) {
            this.hideTitle = bool;
        }

        public AddressListEnterParams(int i, String str, boolean z, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, String str5, Integer num4, Integer num5, boolean z2, String str6, String str7, Integer num6, Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
            this.isSelectMode = i;
            this.trackParams = str;
            this.fromClaimIncentive = z;
            this.incentiveRecordId = str2;
            this.productId = str3;
            this.markUnavailableAddress = num;
            this.scene = num2;
            this.sceneParamsStr = str4;
            this.selectScene = num3;
            this.extraInfo = str5;
            this.freeShipping = num4;
            this.addressEntranceScene = num5;
            this.updateCache = z2;
            this.btmToken = str6;
            this.checkoutType = str7;
            this.addressSelectScene = num6;
            this.pageHeightPercent = f;
            this.needTaxIdItem = bool;
            this.isHalfScreenListPage = bool2;
            this.hideBottomAddAddress = bool3;
            this.hideTitle = bool4;
            this.forceEditMode = bool5;
            this.forceVertical = bool6;
        }
    }

    public static final class AddressEvent {
        public static final /* synthetic */ int LIZ = 0;

        @C09CT("address")
        public final ReachableAddress address;

        @C09CT("address_id")
        public final String addressId;

        @C09CT("pudo_address_id")
        public final String pudoAddressId;

        @C09CT("pudo_id")
        public final String pudoId;

        @C09CT("type")
        public final int type;

        @C09CT("use_user_selection")
        public final Boolean useUserSelection;

        public AddressEvent(String str, int i, ReachableAddress reachableAddress, String str2, String str3, Boolean bool) {
            this.addressId = str;
            this.type = i;
            this.address = reachableAddress;
            this.pudoId = str2;
            this.pudoAddressId = str3;
            this.useUserSelection = bool;
        }
    }

    public static final class AddressAssociateEnterParams implements Parcelable {
        public final Address address;
        public final Integer containerId;
        public final String enterFrom;
        public final Integer isFullPage;
        public final LocationUseBar locationUseBar;
        public final List<String> needUpdateDistricts;
        public final String pageName;
        public final String previousPage;
        public final Integer sourcePage;
        public final String trackParams;
        public static final C037A Companion = new Object() { // from class: X.037A
        };
        public static final Parcelable.Creator<AddressAssociateEnterParams> CREATOR = new Parcelable.Creator<AddressAssociateEnterParams>() { // from class: X.0379
            @Override // android.os.Parcelable.Creator
            public final AddressPageStarter.AddressAssociateEnterParams createFromParcel(Parcel parcel) {
                Address addressCreateFromParcel;
                Integer numValueOf;
                Integer numValueOf2;
                LocationUseBar locationUseBarCreateFromParcel;
                Integer numValueOf3 = null;
                if (parcel.readInt() == 0) {
                    addressCreateFromParcel = null;
                } else {
                    addressCreateFromParcel = Address.CREATOR.createFromParcel(parcel);
                }
                Address address = addressCreateFromParcel;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    locationUseBarCreateFromParcel = null;
                } else {
                    locationUseBarCreateFromParcel = LocationUseBar.CREATOR.createFromParcel(parcel);
                }
                LocationUseBar locationUseBar = locationUseBarCreateFromParcel;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    numValueOf3 = Integer.valueOf(parcel.readInt());
                }
                return new AddressPageStarter.AddressAssociateEnterParams(address, string, string2, string3, numValueOf, numValueOf2, locationUseBar, arrayListCreateStringArrayList, numValueOf3, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AddressPageStarter.AddressAssociateEnterParams[] newArray(int i) {
                return new AddressPageStarter.AddressAssociateEnterParams[i];
            }
        };
        public static final int $stable = 8;

        /* JADX WARN: Multi-variable type inference failed */
        public AddressAssociateEnterParams() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Address address = this.address;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackParams);
            parcel.writeString(this.previousPage);
            parcel.writeString(this.enterFrom);
            Integer num = this.containerId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.isFullPage;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            LocationUseBar locationUseBar = this.locationUseBar;
            if (locationUseBar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                locationUseBar.writeToParcel(parcel, i);
            }
            parcel.writeStringList(this.needUpdateDistricts);
            Integer num3 = this.sourcePage;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num3.intValue());
            }
            parcel.writeString(this.pageName);
        }

        public AddressAssociateEnterParams(Address address, String str, String str2, String str3, Integer num, Integer num2, LocationUseBar locationUseBar, List<String> list, Integer num3, String str4) {
            this.address = address;
            this.trackParams = str;
            this.previousPage = str2;
            this.enterFrom = str3;
            this.containerId = num;
            this.isFullPage = num2;
            this.locationUseBar = locationUseBar;
            this.needUpdateDistricts = list;
            this.sourcePage = num3;
            this.pageName = str4;
        }

        public /* synthetic */ AddressAssociateEnterParams(Address address, String str, String str2, String str3, Integer num, Integer num2, LocationUseBar locationUseBar, List list, Integer num3, String str4, int i) {
            this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : locationUseBar, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : num3, (i & 512) == 0 ? str4 : null);
        }
    }

    /* JADX INFO: loaded from: classes27.dex */
    public static final class AddressMapDetailEnterParams implements Parcelable {
        public final Address address;
        public final String autoCompleteAddressId;
        public final Address candidateAddress;
        public final Integer containerId;
        public final String enterFrom;
        public final Integer enterSource;
        public final Integer isFullPage;
        public final List<String> needUpdateDistricts;
        public final Integer pageType;
        public final Integer placeType;
        public final String previousPage;
        public final Integer scene;
        public final String sessionKey;
        public final String trackParams;
        public static final AnonymousClass0410 Companion = new AnonymousClass0410();
        public static final Parcelable.Creator<AddressMapDetailEnterParams> CREATOR = new Parcelable.Creator<AddressMapDetailEnterParams>() { // from class: X.0vYW
            @Override // android.os.Parcelable.Creator
            public final AddressPageStarter.AddressMapDetailEnterParams createFromParcel(Parcel parcel) {
                Integer numValueOf;
                Integer numValueOf2;
                Address addressCreateFromParcel;
                Integer numValueOf3;
                Address addressCreateFromParcel2;
                Integer numValueOf4;
                Integer numValueOf5;
                Integer numValueOf6 = null;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    addressCreateFromParcel = null;
                } else {
                    addressCreateFromParcel = Address.CREATOR.createFromParcel(parcel);
                }
                Address address = addressCreateFromParcel;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf3 = null;
                } else {
                    numValueOf3 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    addressCreateFromParcel2 = null;
                } else {
                    addressCreateFromParcel2 = Address.CREATOR.createFromParcel(parcel);
                }
                Address address2 = addressCreateFromParcel2;
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf4 = null;
                } else {
                    numValueOf4 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    numValueOf5 = null;
                } else {
                    numValueOf5 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    numValueOf6 = Integer.valueOf(parcel.readInt());
                }
                return new AddressPageStarter.AddressMapDetailEnterParams(numValueOf, numValueOf2, address, string, string2, string3, string4, numValueOf3, address2, string5, numValueOf4, numValueOf5, numValueOf6, parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final AddressPageStarter.AddressMapDetailEnterParams[] newArray(int i) {
                return new AddressPageStarter.AddressMapDetailEnterParams[i];
            }
        };
        public static final int $stable = 8;

        /* JADX WARN: Multi-variable type inference failed */
        public AddressMapDetailEnterParams() {
            this((Integer) null, (Integer) (0 == true ? 1 : 0), (Address) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Address) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), 16383);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Integer num = this.scene;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.pageType;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            Address address = this.address;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackParams);
            parcel.writeString(this.previousPage);
            parcel.writeString(this.enterFrom);
            parcel.writeString(this.autoCompleteAddressId);
            Integer num3 = this.placeType;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num3.intValue());
            }
            Address address2 = this.candidateAddress;
            if (address2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address2.writeToParcel(parcel, i);
            }
            parcel.writeString(this.sessionKey);
            Integer num4 = this.containerId;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num4.intValue());
            }
            Integer num5 = this.enterSource;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num5.intValue());
            }
            Integer num6 = this.isFullPage;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num6.intValue());
            }
            parcel.writeStringList(this.needUpdateDistricts);
        }

        public /* synthetic */ AddressMapDetailEnterParams(Integer num, Integer num2, Address address, String str, String str2, String str3, String str4, Integer num3, Address address2, String str5, Integer num4, Integer num5, List list, int i) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : address, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : address2, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : num4, (Integer) null, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num5, (List<String>) ((i & 8192) != 0 ? null : list));
        }

        public AddressMapDetailEnterParams(Integer num, Integer num2, Address address, String str, String str2, String str3, String str4, Integer num3, Address address2, String str5, Integer num4, Integer num5, Integer num6, List<String> list) {
            this.scene = num;
            this.pageType = num2;
            this.address = address;
            this.trackParams = str;
            this.previousPage = str2;
            this.enterFrom = str3;
            this.autoCompleteAddressId = str4;
            this.placeType = num3;
            this.candidateAddress = address2;
            this.sessionKey = str5;
            this.containerId = num4;
            this.enterSource = num5;
            this.isFullPage = num6;
            this.needUpdateDistricts = list;
        }
    }

    public static Object LIZIZ(AddressPageStarter addressPageStarter, Context context, InterfaceC1748810vbr interfaceC1748810vbr, boolean z, String str, String str2, Integer num, Integer num2, boolean z2, String str3, Address address, Boolean bool, InterfaceC1364105Vn interfaceC1364105Vn, int i) {
        Boolean bool2 = bool;
        Address address2 = address;
        String str4 = str3;
        boolean z3 = z;
        Integer num3 = num2;
        String str5 = str2;
        boolean z4 = z2;
        String str6 = str;
        Integer num4 = num;
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str5 = null;
        }
        if ((i & 16384) != 0) {
            num4 = null;
        }
        if ((32768 & i) != 0) {
            num3 = 0;
        }
        if ((65536 & i) != 0) {
            z4 = false;
        }
        if ((131072 & i) != 0) {
            str4 = null;
        }
        if ((524288 & i) != 0) {
            address2 = null;
        }
        if ((i & 1048576) != 0) {
            bool2 = null;
        }
        addressPageStarter.getClass();
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        LIZIZ = c23260099m;
        LIZ(LIZ, context, interfaceC1748810vbr, null, null, z3, str6, null, null, null, false, 0, null, str5, null, num4, address2, null, null, num3, z4, str4, null, null, false, null, null, null, bool2, null, null, 904069120);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static String LIZJ(AddressPageStarter addressPageStarter, Context context, String str, String str2, String str3, String str4, Integer num, boolean z, String str5, String str6, Integer num2, Integer num3, Float f, Boolean bool, boolean z2, Boolean bool2, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            num = null;
        }
        if ((i & 256) != 0) {
            z = false;
        }
        if ((i & 512) != 0) {
            str5 = null;
        }
        if ((i & 1024) != 0) {
            str6 = "normal_checkout";
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num3 = 0;
        }
        if ((i & 8192) != 0) {
            f = null;
        }
        if ((i & 16384) != 0) {
            bool = null;
        }
        if ((32768 & i) != 0) {
            z2 = false;
        }
        if ((i & 65536) != 0) {
            bool2 = null;
        }
        addressPageStarter.getClass();
        if (context != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str2 != null) {
                linkedHashMap.put("trackParams", str2);
            }
            linkedHashMap.put("is_select_mode", 1);
            if (str4 != null) {
                linkedHashMap.put("product_id", str4);
                linkedHashMap.put("mark_unavailable_address", 1);
            }
            if (num != null) {
                linkedHashMap.put("free_shipping", Integer.valueOf(num.intValue()));
            }
            linkedHashMap.put("update_cache", C893803eS.LIZ(z));
            if (str5 != null) {
                linkedHashMap.put("source_btm_token", str5);
            }
            if (str6 != null) {
                linkedHashMap.put("checkout_type", str6);
            }
            if (num2 != null) {
                num2.intValue();
                linkedHashMap.put("address_selection_scene", num2);
            }
            if (num3 != null) {
                linkedHashMap.put("address_entrance_scene", Integer.valueOf(num3.intValue()));
            }
            if (bool != null) {
                linkedHashMap.put("need_tax_id_item", C893803eS.LIZ(bool.booleanValue()));
            }
            if (bool2 != null) {
                linkedHashMap.put("force_edit_mode", C893803eS.LIZ(bool2.booleanValue()));
            }
            if (f != null) {
                linkedHashMap.put("half_express_height_percent", Float.valueOf(f.floatValue()));
            }
            if (z2) {
                if (str3 == null || str3.length() == 0) {
                    str3 = "aweme://ec/address/list";
                }
                return C919503ib.LIZJ(str3, linkedHashMap).build().toString();
            }
            if (str3 == null || str3.length() == 0) {
                str3 = "aweme://ec/address/list";
            }
            SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(context, str3, linkedHashMap, false);
            if (str != null) {
                smartRouteLIZIZ.withParam("lib_track_rtn_id", str);
            }
            smartRouteLIZIZ.open();
            return null;
        }
        return null;
    }

    public static Object LIZLLL(AddressPageStarter addressPageStarter, Context context, String str, String str2, String str3, String str4, Integer num, boolean z, String str5, String str6, Integer num2, Integer num3, Float f, Boolean bool, Boolean bool2, InterfaceC1364105Vn interfaceC1364105Vn, int i) {
        Boolean bool3 = bool;
        Float f2 = f;
        Integer num4 = num2;
        String str7 = str6;
        String str8 = str5;
        boolean z2 = z;
        Integer num5 = num;
        String str9 = str4;
        Integer num6 = num3;
        String str10 = str3;
        String str11 = str2;
        Boolean bool4 = null;
        if ((i & 8) != 0) {
            str11 = null;
        }
        if ((i & 16) != 0) {
            str10 = null;
        }
        if ((i & 32) != 0) {
            str9 = null;
        }
        if ((i & 64) != 0) {
            num5 = null;
        }
        if ((i & 128) != 0) {
            z2 = false;
        }
        if ((i & 256) != 0) {
            str8 = null;
        }
        if ((i & 512) != 0) {
            str7 = "normal_checkout";
        }
        if ((i & 1024) != 0) {
            num4 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num6 = 0;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            f2 = null;
        }
        if ((i & 8192) != 0) {
            bool3 = null;
        }
        if ((i & 16384) == 0) {
            bool4 = bool2;
        }
        addressPageStarter.getClass();
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        LIZJ = c23260099m;
        LIZJ(LIZ, context, str, str11, str10, str9, num5, z2, str8, str7, num4, num6, f2, bool3, false, bool4, 32896);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static final class AddressEditEnterParams implements Parcelable {
        public final Address address;
        public final Integer addressEntranceScene;
        public final Integer addressSelectScene;
        public final Integer addressSource;
        public final String btmToken;
        public final int buttonType;
        public final String contextParams;
        public final Integer currentProgress;
        public final Address defaultAddress;
        public final List<Region> districts;
        public final String enableChangeItems;
        public final String extraInfo;
        public final String forceSaveApi;
        public final Integer freeShipping;
        public final boolean hasAddressAlready;
        public final Integer invalidAddressType;
        public final String invalidHintMessage;
        public final boolean keepAlive;
        public final Boolean needTaxIdItem;
        public final String pdpFrom;
        public final List<AddressPromotionSku> promotionRequest;
        public final Address pudoAddress;
        public final String quitMessage;
        public final String serverParams;
        public final Integer totalProgress;
        public final String trackParams;
        public final String triggerEvent;
        public final boolean updateCache;
        public static final C978703s9 Companion = new C978703s9();
        public static final Parcelable.Creator<AddressEditEnterParams> CREATOR = new Parcelable.Creator<AddressEditEnterParams>() { // from class: X.03Yi
            @Override // android.os.Parcelable.Creator
            public final AddressPageStarter.AddressEditEnterParams createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Address addressCreateFromParcel;
                Integer numValueOf;
                Integer numValueOf2;
                boolean z;
                ArrayList arrayList2;
                Integer numValueOf3;
                Address addressCreateFromParcel2;
                Integer numValueOf4;
                Integer numValueOf5;
                boolean z2;
                Address addressCreateFromParcel3;
                Integer numValueOf6;
                boolean z3;
                Integer numValueOf7;
                boolean z4;
                Boolean boolValueOf = null;
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
                    addressCreateFromParcel = null;
                } else {
                    addressCreateFromParcel = Address.CREATOR.createFromParcel(parcel);
                }
                Address address = addressCreateFromParcel;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i3 = parcel.readInt();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i4 = parcel.readInt();
                    arrayList2 = new ArrayList(i4);
                    for (int i5 = 0; i5 != i4; i5++) {
                        arrayList2.add(AddressPromotionSku.CREATOR.createFromParcel(parcel));
                    }
                }
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf3 = null;
                } else {
                    numValueOf3 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    addressCreateFromParcel2 = null;
                } else {
                    addressCreateFromParcel2 = Address.CREATOR.createFromParcel(parcel);
                }
                Address address2 = addressCreateFromParcel2;
                String string6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf4 = null;
                } else {
                    numValueOf4 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    numValueOf5 = null;
                } else {
                    numValueOf5 = Integer.valueOf(parcel.readInt());
                }
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() == 0) {
                    addressCreateFromParcel3 = null;
                } else {
                    addressCreateFromParcel3 = Address.CREATOR.createFromParcel(parcel);
                }
                Address address3 = addressCreateFromParcel3;
                String string8 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf6 = null;
                } else {
                    numValueOf6 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String string9 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf7 = null;
                } else {
                    numValueOf7 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolValueOf = Boolean.valueOf(z4);
                }
                return new AddressPageStarter.AddressEditEnterParams(arrayList, address, string, numValueOf, numValueOf2, z, i3, string2, string3, arrayList2, string4, string5, numValueOf3, address2, string6, numValueOf4, numValueOf5, string7, z2, address3, string8, numValueOf6, z3, string9, numValueOf7, boolValueOf, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AddressPageStarter.AddressEditEnterParams[] newArray(int i) {
                return new AddressPageStarter.AddressEditEnterParams[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List<Region> list = this.districts;
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
            Address address = this.address;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackParams);
            Integer num = this.currentProgress;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.totalProgress;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            parcel.writeInt(this.keepAlive ? 1 : 0);
            parcel.writeInt(this.buttonType);
            parcel.writeString(this.quitMessage);
            parcel.writeString(this.pdpFrom);
            List<AddressPromotionSku> list2 = this.promotionRequest;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list2.size());
                Iterator<AddressPromotionSku> it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next().writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.enableChangeItems);
            parcel.writeString(this.extraInfo);
            Integer num3 = this.freeShipping;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num3.intValue());
            }
            Address address2 = this.defaultAddress;
            if (address2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address2.writeToParcel(parcel, i);
            }
            parcel.writeString(this.invalidHintMessage);
            Integer num4 = this.invalidAddressType;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num4.intValue());
            }
            Integer num5 = this.addressEntranceScene;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num5.intValue());
            }
            parcel.writeString(this.btmToken);
            parcel.writeInt(this.updateCache ? 1 : 0);
            Address address3 = this.pudoAddress;
            if (address3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address3.writeToParcel(parcel, i);
            }
            parcel.writeString(this.serverParams);
            Integer num6 = this.addressSource;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num6.intValue());
            }
            parcel.writeInt(this.hasAddressAlready ? 1 : 0);
            parcel.writeString(this.triggerEvent);
            Integer num7 = this.addressSelectScene;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num7.intValue());
            }
            Boolean bool = this.needTaxIdItem;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            parcel.writeString(this.contextParams);
            parcel.writeString(this.forceSaveApi);
        }

        public AddressEditEnterParams(List<Region> list, Address address, String str, Integer num, Integer num2, boolean z, int i, String str2, String str3, List<AddressPromotionSku> list2, String str4, String str5, Integer num3, Address address2, String str6, Integer num4, Integer num5, String str7, boolean z2, Address address3, String str8, Integer num6, boolean z3, String str9, Integer num7, Boolean bool, String str10, String str11) {
            this.districts = list;
            this.address = address;
            this.trackParams = str;
            this.currentProgress = num;
            this.totalProgress = num2;
            this.keepAlive = z;
            this.buttonType = i;
            this.quitMessage = str2;
            this.pdpFrom = str3;
            this.promotionRequest = list2;
            this.enableChangeItems = str4;
            this.extraInfo = str5;
            this.freeShipping = num3;
            this.defaultAddress = address2;
            this.invalidHintMessage = str6;
            this.invalidAddressType = num4;
            this.addressEntranceScene = num5;
            this.btmToken = str7;
            this.updateCache = z2;
            this.pudoAddress = address3;
            this.serverParams = str8;
            this.addressSource = num6;
            this.hasAddressAlready = z3;
            this.triggerEvent = str9;
            this.addressSelectScene = num7;
            this.needTaxIdItem = bool;
            this.contextParams = str10;
            this.forceSaveApi = str11;
        }
    }

    public static void LIZ(AddressPageStarter addressPageStarter, Context context, InterfaceC1748810vbr interfaceC1748810vbr, Address address, List list, boolean z, String str, Integer num, Integer num2, InputItemData inputItemData, boolean z2, int i, String str2, String str3, List list2, Integer num3, Address address2, String str4, Integer num4, Integer num5, boolean z3, String str5, String str6, Integer num6, boolean z4, String str7, Integer num7, Boolean bool, Boolean bool2, String str8, Map map, int i2) {
        String str9 = str3;
        InputItemData inputItemData2 = inputItemData;
        Integer num8 = num2;
        String str10 = str;
        String str11 = str2;
        Integer num9 = num;
        boolean z5 = z;
        List list3 = list;
        Address address3 = address;
        String str12 = str8;
        String str13 = str6;
        String str14 = str5;
        Integer num10 = num4;
        Integer num11 = num7;
        Integer num12 = num5;
        String str15 = str4;
        Boolean bool3 = bool;
        Address address4 = address2;
        Integer num13 = num3;
        String str16 = str7;
        Map map2 = map;
        List list4 = list2;
        if ((i2 & 4) != 0) {
            address3 = null;
        }
        if ((i2 & 8) != 0) {
            list3 = null;
        }
        if ((i2 & 16) != 0) {
            z5 = false;
        }
        if ((i2 & 32) != 0) {
            str10 = null;
        }
        if ((i2 & 64) != 0) {
            num9 = null;
        }
        if ((i2 & 128) != 0) {
            num8 = null;
        }
        if ((i2 & 256) != 0) {
            inputItemData2 = null;
        }
        if ((i2 & 512) != 0) {
            z2 = false;
        }
        if ((i2 & 1024) != 0) {
            i = 0;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str11 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str9 = null;
        }
        if ((i2 & 8192) != 0) {
            list4 = null;
        }
        if ((i2 & 16384) != 0) {
            num13 = null;
        }
        if ((32768 & i2) != 0) {
            address4 = null;
        }
        if ((65536 & i2) != 0) {
            str15 = null;
        }
        if ((131072 & i2) != 0) {
            num10 = null;
        }
        if ((262144 & i2) != 0) {
            num12 = 0;
        }
        if ((524288 & i2) != 0) {
            z3 = false;
        }
        if ((1048576 & i2) != 0) {
            str14 = null;
        }
        if ((2097152 & i2) != 0) {
            str13 = null;
        }
        if ((4194304 & i2) != 0) {
            num6 = null;
        }
        if ((8388608 & i2) != 0) {
            z4 = false;
        }
        if ((16777216 & i2) != 0) {
            str16 = null;
        }
        if ((33554432 & i2) != 0) {
            num11 = null;
        }
        if ((67108864 & i2) != 0) {
            bool3 = null;
        }
        if ((134217728 & i2) != 0) {
            bool2 = null;
        }
        if ((268435456 & i2) != 0) {
            str12 = null;
        }
        if ((i2 & 536870912) != 0) {
            map2 = null;
        }
        addressPageStarter.getClass();
        if (context != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (address3 != null) {
                linkedHashMap.put("address", address3);
            }
            if (list3 != null) {
                linkedHashMap.put("districts", list3);
            }
            if (str10 != null) {
                linkedHashMap.put("trackParams", str10);
            }
            if (num9 != null) {
                num9.intValue();
                linkedHashMap.put("current_progress", num9);
            }
            if (num8 != null) {
                num8.intValue();
                linkedHashMap.put("total_progress", num8);
            }
            if (inputItemData2 != null) {
                linkedHashMap.put("template_data", inputItemData2);
            }
            if (str9 != null) {
                linkedHashMap.put("pdp_from", str9);
            }
            if (list4 != null) {
                linkedHashMap.put("promotion_request", list4);
            }
            if (num13 != null) {
                num13.intValue();
                linkedHashMap.put("free_shipping", num13);
            }
            linkedHashMap.put("keep_alive", Boolean.valueOf(z2));
            linkedHashMap.put("button_type", Integer.valueOf(i));
            if (address4 != null) {
                linkedHashMap.put("default_address", address4);
            }
            if (str15 != null) {
                linkedHashMap.put("invalid_hint_message", str15);
            }
            if (num10 != null) {
                num10.intValue();
                linkedHashMap.put("invalid_address_type", num10);
            }
            if (num12 != null) {
                num12.intValue();
                linkedHashMap.put("address_entrance_scene", num12);
            }
            linkedHashMap.put("update_cache", C893803eS.LIZ(z3));
            if (str14 != null) {
                linkedHashMap.put("source_btm_token", str14);
            }
            if (str13 != null) {
                linkedHashMap.put("server_params", str13);
            }
            if (num6 != null) {
                linkedHashMap.put("address_source", Integer.valueOf(num6.intValue()));
            }
            linkedHashMap.put("has_address_already", C893803eS.LIZ(z4));
            if (num11 != null) {
                num11.intValue();
                linkedHashMap.put("address_selection_scene", num11);
            }
            if (str16 != null) {
                linkedHashMap.put("trigger_event", str16);
            }
            if (Intrinsics.LJFF(bool3, Boolean.TRUE)) {
                linkedHashMap.put("is_half_screen", C893803eS.LIZ(bool3.booleanValue()));
            }
            if (bool2 != null) {
                linkedHashMap.put("need_tax_id_item", C893803eS.LIZ(bool2.booleanValue()));
            }
            if (str12 != null) {
                linkedHashMap.put("context_params", str12);
            }
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
            if (str11 == null || str11.length() == 0) {
                str11 = "aweme://ec/address/edit";
            }
            SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(context, str11, linkedHashMap, z5);
            if (interfaceC1748810vbr != null) {
                C960603pE.LJIIIIZZ(smartRouteLIZIZ, interfaceC1748810vbr);
            }
            smartRouteLIZIZ.open();
        }
    }
}
