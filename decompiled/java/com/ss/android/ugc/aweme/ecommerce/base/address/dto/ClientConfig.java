package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class ClientConfig implements Parcelable {

    @C09CT("fold_item_keys")
    public final String _foldItemKeys;

    @C09CT("ignore_item_keys_when_save")
    public final String _ignoreKeysWhenSave;

    @C09CT("enable_prefetch_candidate_keys")
    public final String _prefetchCandidateKeys;

    @C09CT("search_concatenate_keys")
    public final String _searchConcatenateKeys;

    @C09CT("address_district_incomplete_error")
    public final String addressDistrictInCompleteError;

    @C09CT("address_district_length")
    public final String addressDistrictLength;

    @C09CT("auth_required_for_location_use_bar")
    public final String authRequiredForLocationUseBar;

    @C09CT("auto_recommend_zipcode_by_district_list")
    public final Boolean autoRecommendZipcodeByDistrictList;

    @C09CT("concatenate_address_error")
    public final String concatenateAddressError;

    @C09CT("concatenate_address_error_starling_key")
    public final String concatenateAddressErrorStarlingKey;

    @C09CT("concatenate_address_keys")
    public final String concatenateAddressKeys;

    @C09CT("concatenate_address_rule")
    public final String concatenateAddressRule;

    @C09CT("concatenate_name_error")
    public final String concatenateNameError;

    @C09CT("concatenate_name_error_starling_key")
    public final String concatenateNameErrorStarlingKey;

    @C09CT("concatenate_name_keys")
    public final String concatenateNameKeys;

    @C09CT("concatenate_name_rule")
    public final String concatenateNameRule;

    @C09CT("disable_candidate_keys")
    public final String disableCandidateKeys;

    @C09CT("disable_check_keys")
    public final String disableCheckKeys;

    @C09CT("disable_region_code_change")
    public final Boolean disableRegionCodeChange;

    @C09CT("district_item_keys")
    public final String districtItemKeys;

    @C09CT("districts_concatenate_keys")
    public final String districtsConcatenateKeys;

    @C09CT("enable_concatenate_address_check")
    public final Boolean enableConcatenateAddressCheck;

    @C09CT("enable_defocus_candidate_keys")
    public final String enableDefocusCandidateKeys;

    @C09CT("enable_district_reverse_order")
    public final Boolean enableDistrictReverseOrder;

    @C09CT("enable_district_tab")
    public final Boolean enableDistrictTab;

    @C09CT("enable_edit_candidate_keys")
    public final String enableEditCandidateKeys;

    @C09CT("enable_focus_candidate_keys")
    public final String enableFocusCandidateKeys;

    @C09CT("enable_new_ui")
    public final Boolean enableNewUi;

    @C09CT("enable_single_line_region")
    public final Boolean enableSingleLineRegion;

    @C09CT("geo_associated_validation_item_keys")
    public final String geoAssociatedValidationItemKeys;

    @C09CT("geo_item_keys")
    public final String geoItemKeys;

    @C09CT("need_pre_verify_items")
    public final String needPreVerifyItems;

    @C09CT("normalized_sn_street_number")
    public final String normalizedSnStreetNumber;

    @C09CT("enable_numberic_keyboard_keys")
    public final String numberKeyboardKeys;

    @C09CT("enable_phone_prefix_check_country")
    public final String phonePrefixCheckCountry;

    @C09CT("rec_addr_un_rewrite_items")
    public final String recAddrUnRewriteItems;

    @C09CT("separator_for_districts")
    public final String separatorForDistricts;

    @C09CT("show_location_permission_popup")
    public final String showLocationPermissionPopup;

    @C09CT("single_line_name_keys")
    public final String singleLineNameKeys;

    @C09CT("single_stage_selector_keys")
    public final String singleStageSelectorKeys;

    @C09CT("sn_street_number_rule")
    public final String snStreetNumberRule;

    @C09CT("ui_style")
    public final String uiStyle;

    @C09CT("enable_wake_up_keyboard_element")
    public final String wakeUpKeyBoardKeys;
    public static final Parcelable.Creator<ClientConfig> CREATOR = new Parcelable.Creator<ClientConfig>() { // from class: X.02wu
        @Override // android.os.Parcelable.Creator
        public final ClientConfig createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            boolean z3;
            Boolean boolValueOf3;
            boolean z4;
            Boolean boolValueOf4;
            boolean z5;
            Boolean boolValueOf5;
            boolean z6;
            Boolean boolValueOf6;
            boolean z7 = true;
            Boolean boolValueOf7 = null;
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
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            String string = parcel.readString();
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
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
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
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
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
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolValueOf6 = Boolean.valueOf(z6);
            }
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z7 = false;
                }
                boolValueOf7 = Boolean.valueOf(z7);
            }
            return new ClientConfig(boolValueOf, boolValueOf2, string, boolValueOf3, string2, string3, string4, string5, boolValueOf4, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, boolValueOf5, boolValueOf6, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, boolValueOf7);
        }

        @Override // android.os.Parcelable.Creator
        public final ClientConfig[] newArray(int i) {
            return new ClientConfig[i];
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
        if (!(obj instanceof ClientConfig)) {
            return false;
        }
        ClientConfig clientConfig = (ClientConfig) obj;
        return Intrinsics.LJFF(this.enableDistrictTab, clientConfig.enableDistrictTab) && Intrinsics.LJFF(this.enableNewUi, clientConfig.enableNewUi) && Intrinsics.LJFF(this.singleStageSelectorKeys, clientConfig.singleStageSelectorKeys) && Intrinsics.LJFF(this.disableRegionCodeChange, clientConfig.disableRegionCodeChange) && Intrinsics.LJFF(this.phonePrefixCheckCountry, clientConfig.phonePrefixCheckCountry) && Intrinsics.LJFF(this.wakeUpKeyBoardKeys, clientConfig.wakeUpKeyBoardKeys) && Intrinsics.LJFF(this.addressDistrictLength, clientConfig.addressDistrictLength) && Intrinsics.LJFF(this.addressDistrictInCompleteError, clientConfig.addressDistrictInCompleteError) && Intrinsics.LJFF(this.enableConcatenateAddressCheck, clientConfig.enableConcatenateAddressCheck) && Intrinsics.LJFF(this.concatenateAddressRule, clientConfig.concatenateAddressRule) && Intrinsics.LJFF(this.concatenateAddressError, clientConfig.concatenateAddressError) && Intrinsics.LJFF(this.concatenateAddressKeys, clientConfig.concatenateAddressKeys) && Intrinsics.LJFF(this.concatenateAddressErrorStarlingKey, clientConfig.concatenateAddressErrorStarlingKey) && Intrinsics.LJFF(this.concatenateNameError, clientConfig.concatenateNameError) && Intrinsics.LJFF(this.concatenateNameRule, clientConfig.concatenateNameRule) && Intrinsics.LJFF(this.concatenateNameKeys, clientConfig.concatenateNameKeys) && Intrinsics.LJFF(this.concatenateNameErrorStarlingKey, clientConfig.concatenateNameErrorStarlingKey) && Intrinsics.LJFF(this.singleLineNameKeys, clientConfig.singleLineNameKeys) && Intrinsics.LJFF(this.districtsConcatenateKeys, clientConfig.districtsConcatenateKeys) && Intrinsics.LJFF(this.enableSingleLineRegion, clientConfig.enableSingleLineRegion) && Intrinsics.LJFF(this.enableDistrictReverseOrder, clientConfig.enableDistrictReverseOrder) && Intrinsics.LJFF(this.numberKeyboardKeys, clientConfig.numberKeyboardKeys) && Intrinsics.LJFF(this.enableDefocusCandidateKeys, clientConfig.enableDefocusCandidateKeys) && Intrinsics.LJFF(this.enableFocusCandidateKeys, clientConfig.enableFocusCandidateKeys) && Intrinsics.LJFF(this.enableEditCandidateKeys, clientConfig.enableEditCandidateKeys) && Intrinsics.LJFF(this.disableCandidateKeys, clientConfig.disableCandidateKeys) && Intrinsics.LJFF(this.disableCheckKeys, clientConfig.disableCheckKeys) && Intrinsics.LJFF(this.geoItemKeys, clientConfig.geoItemKeys) && Intrinsics.LJFF(this.districtItemKeys, clientConfig.districtItemKeys) && Intrinsics.LJFF(this._prefetchCandidateKeys, clientConfig._prefetchCandidateKeys) && Intrinsics.LJFF(this.snStreetNumberRule, clientConfig.snStreetNumberRule) && Intrinsics.LJFF(this.normalizedSnStreetNumber, clientConfig.normalizedSnStreetNumber) && Intrinsics.LJFF(this.geoAssociatedValidationItemKeys, clientConfig.geoAssociatedValidationItemKeys) && Intrinsics.LJFF(this.separatorForDistricts, clientConfig.separatorForDistricts) && Intrinsics.LJFF(this.uiStyle, clientConfig.uiStyle) && Intrinsics.LJFF(this.showLocationPermissionPopup, clientConfig.showLocationPermissionPopup) && Intrinsics.LJFF(this.authRequiredForLocationUseBar, clientConfig.authRequiredForLocationUseBar) && Intrinsics.LJFF(this._ignoreKeysWhenSave, clientConfig._ignoreKeysWhenSave) && Intrinsics.LJFF(this._searchConcatenateKeys, clientConfig._searchConcatenateKeys) && Intrinsics.LJFF(this._foldItemKeys, clientConfig._foldItemKeys) && Intrinsics.LJFF(this.recAddrUnRewriteItems, clientConfig.recAddrUnRewriteItems) && Intrinsics.LJFF(this.needPreVerifyItems, clientConfig.needPreVerifyItems) && Intrinsics.LJFF(this.autoRecommendZipcodeByDistrictList, clientConfig.autoRecommendZipcodeByDistrictList);
    }

    public final int hashCode() {
        Boolean bool = this.enableDistrictTab;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.enableNewUi;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.singleStageSelectorKeys;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.disableRegionCodeChange;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.phonePrefixCheckCountry;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wakeUpKeyBoardKeys;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addressDistrictLength;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.addressDistrictInCompleteError;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool4 = this.enableConcatenateAddressCheck;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str6 = this.concatenateAddressRule;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.concatenateAddressError;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.concatenateAddressKeys;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.concatenateAddressErrorStarlingKey;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.concatenateNameError;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.concatenateNameRule;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.concatenateNameKeys;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.concatenateNameErrorStarlingKey;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.singleLineNameKeys;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.districtsConcatenateKeys;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool5 = this.enableSingleLineRegion;
        int iHashCode20 = (iHashCode19 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.enableDistrictReverseOrder;
        int iHashCode21 = (iHashCode20 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str16 = this.numberKeyboardKeys;
        int iHashCode22 = (iHashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.enableDefocusCandidateKeys;
        int iHashCode23 = (iHashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.enableFocusCandidateKeys;
        int iHashCode24 = (iHashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.enableEditCandidateKeys;
        int iHashCode25 = (iHashCode24 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.disableCandidateKeys;
        int iHashCode26 = (iHashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.disableCheckKeys;
        int iHashCode27 = (iHashCode26 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.geoItemKeys;
        int iHashCode28 = (iHashCode27 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.districtItemKeys;
        int iHashCode29 = (iHashCode28 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this._prefetchCandidateKeys;
        int iHashCode30 = (iHashCode29 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.snStreetNumberRule;
        int iHashCode31 = (iHashCode30 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.normalizedSnStreetNumber;
        int iHashCode32 = (iHashCode31 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.geoAssociatedValidationItemKeys;
        int iHashCode33 = (iHashCode32 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.separatorForDistricts;
        int iHashCode34 = (iHashCode33 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.uiStyle;
        int iHashCode35 = (iHashCode34 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.showLocationPermissionPopup;
        int iHashCode36 = (iHashCode35 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.authRequiredForLocationUseBar;
        int iHashCode37 = (iHashCode36 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this._ignoreKeysWhenSave;
        int iHashCode38 = (iHashCode37 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this._searchConcatenateKeys;
        int iHashCode39 = (iHashCode38 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this._foldItemKeys;
        int iHashCode40 = (iHashCode39 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.recAddrUnRewriteItems;
        int iHashCode41 = (iHashCode40 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.needPreVerifyItems;
        int iHashCode42 = (iHashCode41 + (str36 == null ? 0 : str36.hashCode())) * 31;
        Boolean bool7 = this.autoRecommendZipcodeByDistrictList;
        return iHashCode42 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final String toString() {
        return "ClientConfig(enableDistrictTab=" + this.enableDistrictTab + ", enableNewUi=" + this.enableNewUi + ", singleStageSelectorKeys=" + this.singleStageSelectorKeys + ", disableRegionCodeChange=" + this.disableRegionCodeChange + ", phonePrefixCheckCountry=" + this.phonePrefixCheckCountry + ", wakeUpKeyBoardKeys=" + this.wakeUpKeyBoardKeys + ", addressDistrictLength=" + this.addressDistrictLength + ", addressDistrictInCompleteError=" + this.addressDistrictInCompleteError + ", enableConcatenateAddressCheck=" + this.enableConcatenateAddressCheck + ", concatenateAddressRule=" + this.concatenateAddressRule + ", concatenateAddressError=" + this.concatenateAddressError + ", concatenateAddressKeys=" + this.concatenateAddressKeys + ", concatenateAddressErrorStarlingKey=" + this.concatenateAddressErrorStarlingKey + ", concatenateNameError=" + this.concatenateNameError + ", concatenateNameRule=" + this.concatenateNameRule + ", concatenateNameKeys=" + this.concatenateNameKeys + ", concatenateNameErrorStarlingKey=" + this.concatenateNameErrorStarlingKey + ", singleLineNameKeys=" + this.singleLineNameKeys + ", districtsConcatenateKeys=" + this.districtsConcatenateKeys + ", enableSingleLineRegion=" + this.enableSingleLineRegion + ", enableDistrictReverseOrder=" + this.enableDistrictReverseOrder + ", numberKeyboardKeys=" + this.numberKeyboardKeys + ", enableDefocusCandidateKeys=" + this.enableDefocusCandidateKeys + ", enableFocusCandidateKeys=" + this.enableFocusCandidateKeys + ", enableEditCandidateKeys=" + this.enableEditCandidateKeys + ", disableCandidateKeys=" + this.disableCandidateKeys + ", disableCheckKeys=" + this.disableCheckKeys + ", geoItemKeys=" + this.geoItemKeys + ", districtItemKeys=" + this.districtItemKeys + ", _prefetchCandidateKeys=" + this._prefetchCandidateKeys + ", snStreetNumberRule=" + this.snStreetNumberRule + ", normalizedSnStreetNumber=" + this.normalizedSnStreetNumber + ", geoAssociatedValidationItemKeys=" + this.geoAssociatedValidationItemKeys + ", separatorForDistricts=" + this.separatorForDistricts + ", uiStyle=" + this.uiStyle + ", showLocationPermissionPopup=" + this.showLocationPermissionPopup + ", authRequiredForLocationUseBar=" + this.authRequiredForLocationUseBar + ", _ignoreKeysWhenSave=" + this._ignoreKeysWhenSave + ", _searchConcatenateKeys=" + this._searchConcatenateKeys + ", _foldItemKeys=" + this._foldItemKeys + ", recAddrUnRewriteItems=" + this.recAddrUnRewriteItems + ", needPreVerifyItems=" + this.needPreVerifyItems + ", autoRecommendZipcodeByDistrictList=" + this.autoRecommendZipcodeByDistrictList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.enableDistrictTab;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.enableNewUi;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.singleStageSelectorKeys);
        Boolean bool3 = this.disableRegionCodeChange;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.phonePrefixCheckCountry);
        parcel.writeString(this.wakeUpKeyBoardKeys);
        parcel.writeString(this.addressDistrictLength);
        parcel.writeString(this.addressDistrictInCompleteError);
        Boolean bool4 = this.enableConcatenateAddressCheck;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.concatenateAddressRule);
        parcel.writeString(this.concatenateAddressError);
        parcel.writeString(this.concatenateAddressKeys);
        parcel.writeString(this.concatenateAddressErrorStarlingKey);
        parcel.writeString(this.concatenateNameError);
        parcel.writeString(this.concatenateNameRule);
        parcel.writeString(this.concatenateNameKeys);
        parcel.writeString(this.concatenateNameErrorStarlingKey);
        parcel.writeString(this.singleLineNameKeys);
        parcel.writeString(this.districtsConcatenateKeys);
        Boolean bool5 = this.enableSingleLineRegion;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.enableDistrictReverseOrder;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.numberKeyboardKeys);
        parcel.writeString(this.enableDefocusCandidateKeys);
        parcel.writeString(this.enableFocusCandidateKeys);
        parcel.writeString(this.enableEditCandidateKeys);
        parcel.writeString(this.disableCandidateKeys);
        parcel.writeString(this.disableCheckKeys);
        parcel.writeString(this.geoItemKeys);
        parcel.writeString(this.districtItemKeys);
        parcel.writeString(this._prefetchCandidateKeys);
        parcel.writeString(this.snStreetNumberRule);
        parcel.writeString(this.normalizedSnStreetNumber);
        parcel.writeString(this.geoAssociatedValidationItemKeys);
        parcel.writeString(this.separatorForDistricts);
        parcel.writeString(this.uiStyle);
        parcel.writeString(this.showLocationPermissionPopup);
        parcel.writeString(this.authRequiredForLocationUseBar);
        parcel.writeString(this._ignoreKeysWhenSave);
        parcel.writeString(this._searchConcatenateKeys);
        parcel.writeString(this._foldItemKeys);
        parcel.writeString(this.recAddrUnRewriteItems);
        parcel.writeString(this.needPreVerifyItems);
        Boolean bool7 = this.autoRecommendZipcodeByDistrictList;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
    }

    public final List<String> LIZ() {
        String str = this._prefetchCandidateKeys;
        if (str != null) {
            return a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6);
        }
        return null;
    }

    public ClientConfig(Boolean bool, Boolean bool2, String str, Boolean bool3, String str2, String str3, String str4, String str5, Boolean bool4, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool5, Boolean bool6, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Boolean bool7) {
        this.enableDistrictTab = bool;
        this.enableNewUi = bool2;
        this.singleStageSelectorKeys = str;
        this.disableRegionCodeChange = bool3;
        this.phonePrefixCheckCountry = str2;
        this.wakeUpKeyBoardKeys = str3;
        this.addressDistrictLength = str4;
        this.addressDistrictInCompleteError = str5;
        this.enableConcatenateAddressCheck = bool4;
        this.concatenateAddressRule = str6;
        this.concatenateAddressError = str7;
        this.concatenateAddressKeys = str8;
        this.concatenateAddressErrorStarlingKey = str9;
        this.concatenateNameError = str10;
        this.concatenateNameRule = str11;
        this.concatenateNameKeys = str12;
        this.concatenateNameErrorStarlingKey = str13;
        this.singleLineNameKeys = str14;
        this.districtsConcatenateKeys = str15;
        this.enableSingleLineRegion = bool5;
        this.enableDistrictReverseOrder = bool6;
        this.numberKeyboardKeys = str16;
        this.enableDefocusCandidateKeys = str17;
        this.enableFocusCandidateKeys = str18;
        this.enableEditCandidateKeys = str19;
        this.disableCandidateKeys = str20;
        this.disableCheckKeys = str21;
        this.geoItemKeys = str22;
        this.districtItemKeys = str23;
        this._prefetchCandidateKeys = str24;
        this.snStreetNumberRule = str25;
        this.normalizedSnStreetNumber = str26;
        this.geoAssociatedValidationItemKeys = str27;
        this.separatorForDistricts = str28;
        this.uiStyle = str29;
        this.showLocationPermissionPopup = str30;
        this.authRequiredForLocationUseBar = str31;
        this._ignoreKeysWhenSave = str32;
        this._searchConcatenateKeys = str33;
        this._foldItemKeys = str34;
        this.recAddrUnRewriteItems = str35;
        this.needPreVerifyItems = str36;
        this.autoRecommendZipcodeByDistrictList = bool7;
    }
}
