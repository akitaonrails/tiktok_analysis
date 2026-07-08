package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.HintViewInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ReachableAddress implements Parcelable, InterfaceC1891350zJl {

    @C09CT("shipping_address")
    public final Address address;

    @C09CT("address_default_selection")
    public final Boolean addressDefaultSelect;

    @C09CT("address_invalid_type")
    public final Integer addressInvalidType;

    @C09CT("address_valid")
    public final Boolean addressValid;

    @C09CT("available_for_change")
    public final Boolean availableForChange;

    @C09CT("available_for_incentive")
    public final Boolean availableForIncentive;

    @C09CT("da_info")
    public final Map<String, String> daInfo;

    @C09CT("hint_message_style")
    public final Integer hintMessageStyle;

    @C09CT("hint_view_info")
    public final HintViewInfo hintViewInfo;

    @C09CT("invalid_hint_message")
    public final String invalidHintMessage;
    public boolean isSelect;

    @C09CT("jump_schema")
    public final String jumpSchema;

    @C09CT("label_text")
    public final String labelText;

    @C09CT("address_reachable")
    public final Boolean reachable;

    @C09CT("unavailable_change_hint")
    public final String unavailableChangeHint;

    @C09CT("unavailable_incentive_hint")
    public final String unavailableIncentiveHint;
    public static final Parcelable.Creator<ReachableAddress> CREATOR = new Parcelable.Creator<ReachableAddress>() { // from class: X.03rV
        @Override // android.os.Parcelable.Creator
        public final ReachableAddress createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Address addressCreateFromParcel;
            boolean z2;
            Boolean boolValueOf2;
            boolean z3;
            Boolean boolValueOf3;
            boolean z4;
            Boolean boolValueOf4;
            boolean z5;
            Boolean boolValueOf5;
            Integer numValueOf;
            boolean z6;
            Integer numValueOf2;
            HintViewInfo hintViewInfoCreateFromParcel;
            LinkedHashMap linkedHashMap = null;
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
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf4 = Boolean.valueOf(z4);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolValueOf5 = Boolean.valueOf(z5);
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                hintViewInfoCreateFromParcel = null;
            } else {
                hintViewInfoCreateFromParcel = HintViewInfo.CREATOR.createFromParcel(parcel);
            }
            HintViewInfo hintViewInfo = hintViewInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new ReachableAddress(boolValueOf, address, string, boolValueOf2, boolValueOf3, string2, boolValueOf4, boolValueOf5, string3, numValueOf, z6, numValueOf2, hintViewInfo, linkedHashMap, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReachableAddress[] newArray(int i) {
            return new ReachableAddress[i];
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
        if (!(obj instanceof ReachableAddress)) {
            return false;
        }
        ReachableAddress reachableAddress = (ReachableAddress) obj;
        return Intrinsics.LJFF(this.reachable, reachableAddress.reachable) && Intrinsics.LJFF(this.address, reachableAddress.address) && Intrinsics.LJFF(this.invalidHintMessage, reachableAddress.invalidHintMessage) && Intrinsics.LJFF(this.addressValid, reachableAddress.addressValid) && Intrinsics.LJFF(this.availableForIncentive, reachableAddress.availableForIncentive) && Intrinsics.LJFF(this.unavailableIncentiveHint, reachableAddress.unavailableIncentiveHint) && Intrinsics.LJFF(this.addressDefaultSelect, reachableAddress.addressDefaultSelect) && Intrinsics.LJFF(this.availableForChange, reachableAddress.availableForChange) && Intrinsics.LJFF(this.unavailableChangeHint, reachableAddress.unavailableChangeHint) && Intrinsics.LJFF(this.addressInvalidType, reachableAddress.addressInvalidType) && this.isSelect == reachableAddress.isSelect && Intrinsics.LJFF(this.hintMessageStyle, reachableAddress.hintMessageStyle) && Intrinsics.LJFF(this.hintViewInfo, reachableAddress.hintViewInfo) && Intrinsics.LJFF(this.daInfo, reachableAddress.daInfo) && Intrinsics.LJFF(this.jumpSchema, reachableAddress.jumpSchema) && Intrinsics.LJFF(this.labelText, reachableAddress.labelText);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Boolean bool = this.reachable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Address address = this.address;
        int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.invalidHintMessage;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.addressValid;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.availableForIncentive;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.unavailableIncentiveHint;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this.addressDefaultSelect;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.availableForChange;
        int iHashCode8 = (iHashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str3 = this.unavailableChangeHint;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.addressInvalidType;
        int iHashCode10 = (((iHashCode9 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.isSelect)) * 31;
        Integer num2 = this.hintMessageStyle;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        HintViewInfo hintViewInfo = this.hintViewInfo;
        int iHashCode12 = (iHashCode11 + (hintViewInfo == null ? 0 : hintViewInfo.hashCode())) * 31;
        Map<String, String> map = this.daInfo;
        int iHashCode13 = (iHashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.jumpSchema;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.labelText;
        return iHashCode14 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "ReachableAddress(reachable=" + this.reachable + ", address=" + this.address + ", invalidHintMessage=" + this.invalidHintMessage + ", addressValid=" + this.addressValid + ", availableForIncentive=" + this.availableForIncentive + ", unavailableIncentiveHint=" + this.unavailableIncentiveHint + ", addressDefaultSelect=" + this.addressDefaultSelect + ", availableForChange=" + this.availableForChange + ", unavailableChangeHint=" + this.unavailableChangeHint + ", addressInvalidType=" + this.addressInvalidType + ", isSelect=" + this.isSelect + ", hintMessageStyle=" + this.hintMessageStyle + ", hintViewInfo=" + this.hintViewInfo + ", daInfo=" + this.daInfo + ", jumpSchema=" + this.jumpSchema + ", labelText=" + this.labelText + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.reachable;
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
        parcel.writeString(this.invalidHintMessage);
        Boolean bool2 = this.addressValid;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.availableForIncentive;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.unavailableIncentiveHint);
        Boolean bool4 = this.addressDefaultSelect;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.availableForChange;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.unavailableChangeHint);
        Integer num = this.addressInvalidType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.isSelect ? 1 : 0);
        Integer num2 = this.hintMessageStyle;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        HintViewInfo hintViewInfo = this.hintViewInfo;
        if (hintViewInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hintViewInfo.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.daInfo;
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
        parcel.writeString(this.jumpSchema);
        parcel.writeString(this.labelText);
    }

    public final int LIZIZ() {
        Integer num;
        if (Intrinsics.LJFF(this.addressValid, Boolean.FALSE)) {
            return 0;
        }
        String str = this.invalidHintMessage;
        if (((str == null || str.length() == 0) && this.hintViewInfo == null) || (num = this.hintMessageStyle) == null) {
            return 1;
        }
        if (num.intValue() != 0) {
            return num.intValue() == 1 ? 2 : 1;
        }
        return 0;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public static ReachableAddress LIZ(ReachableAddress reachableAddress, Boolean bool, boolean z, int i) {
        Address address;
        String str;
        Boolean bool2;
        Boolean bool3;
        String str2;
        Boolean bool4;
        Boolean bool5;
        String str3;
        Integer num;
        Integer num2;
        HintViewInfo hintViewInfo;
        Map<String, String> map;
        String str4;
        boolean z2 = z;
        Boolean bool6 = bool;
        if ((i & 1) != 0) {
            bool6 = reachableAddress.reachable;
        }
        String str5 = null;
        if ((i & 2) != 0) {
            address = reachableAddress.address;
        } else {
            address = null;
        }
        if ((i & 4) != 0) {
            str = reachableAddress.invalidHintMessage;
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            bool2 = reachableAddress.addressValid;
        } else {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            bool3 = reachableAddress.availableForIncentive;
        } else {
            bool3 = null;
        }
        if ((i & 32) != 0) {
            str2 = reachableAddress.unavailableIncentiveHint;
        } else {
            str2 = null;
        }
        if ((i & 64) != 0) {
            bool4 = reachableAddress.addressDefaultSelect;
        } else {
            bool4 = null;
        }
        if ((i & 128) != 0) {
            bool5 = reachableAddress.availableForChange;
        } else {
            bool5 = null;
        }
        if ((i & 256) != 0) {
            str3 = reachableAddress.unavailableChangeHint;
        } else {
            str3 = null;
        }
        if ((i & 512) != 0) {
            num = reachableAddress.addressInvalidType;
        } else {
            num = null;
        }
        if ((i & 1024) != 0) {
            z2 = reachableAddress.isSelect;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num2 = reachableAddress.hintMessageStyle;
        } else {
            num2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            hintViewInfo = reachableAddress.hintViewInfo;
        } else {
            hintViewInfo = null;
        }
        if ((i & 8192) != 0) {
            map = reachableAddress.daInfo;
        } else {
            map = null;
        }
        if ((i & 16384) != 0) {
            str4 = reachableAddress.jumpSchema;
        } else {
            str4 = null;
        }
        if ((i & 32768) != 0) {
            str5 = reachableAddress.labelText;
        }
        reachableAddress.getClass();
        return new ReachableAddress(bool6, address, str, bool2, bool3, str2, bool4, bool5, str3, num, z2, num2, hintViewInfo, map, str4, str5);
    }

    public ReachableAddress(Boolean bool, Address address, String str, Boolean bool2, Boolean bool3, String str2, Boolean bool4, Boolean bool5, String str3, Integer num, boolean z, Integer num2, HintViewInfo hintViewInfo, Map<String, String> map, String str4, String str5) {
        this.reachable = bool;
        this.address = address;
        this.invalidHintMessage = str;
        this.addressValid = bool2;
        this.availableForIncentive = bool3;
        this.unavailableIncentiveHint = str2;
        this.addressDefaultSelect = bool4;
        this.availableForChange = bool5;
        this.unavailableChangeHint = str3;
        this.addressInvalidType = num;
        this.isSelect = z;
        this.hintMessageStyle = num2;
        this.hintViewInfo = hintViewInfo;
        this.daInfo = map;
        this.jumpSchema = str4;
        this.labelText = str5;
    }
}
