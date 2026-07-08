package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SwitchRichInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShippingAddress {

    @C09CT("address_invalid_type")
    public Integer addressInvalidType;

    @C09CT("address_module_style_version")
    public Integer addressModuleStyleVersion;

    @C09CT("address_reachable")
    public Boolean addressReachable;

    @C09CT("address_valid")
    public Boolean addressValid;

    @C09CT("benefit_items")
    public List<BenefitItem> benefitItems;

    @C09CT("da_info")
    public Map<String, String> daInfo;

    @C09CT("hint_invalid_dynamic_message")
    public HintInvalidDynamicMessage hintInvalidDynamicMessage;

    @C09CT("hint_message_style")
    public Integer hintMessageStyle;

    @C09CT("invalid_hint_message")
    public String invalidHintMessage;

    @C09CT("invalid_hint_message_rich_text")
    public ECRichText invalidHintMessageRichText;

    @C09CT("is_selected")
    public Boolean isSelected;

    @C09CT("enable_edit")
    public Boolean pudoEnableEdit;

    @C09CT("pudo_hint_invalid_dynamic_message")
    public HintInvalidDynamicMessage pudoHintInvalidDynamicMessage;

    @C09CT("jump_schema")
    public String pudoJumpSchema;

    @C09CT("shipping_address")
    public Address shippingAddress;

    @C09CT("shipping_price_benefit_item")
    public BenefitItem shippingPriceBenefitItem;

    @C09CT("sku_reachables")
    public List<SkuReachable> skuReachables;

    @C09CT("starling_texts")
    public AddressStarling starlingTexts;

    @C09CT("sub_title")
    public String subTitle;

    @C09CT("shipping_address_switch")
    public SwitchRichInfo switchRichInfoList;

    @C09CT("title")
    public String title;

    public ShippingAddress() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingAddress)) {
            return false;
        }
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        return Intrinsics.LJFF(this.shippingAddress, shippingAddress.shippingAddress) && Intrinsics.LJFF(this.addressReachable, shippingAddress.addressReachable) && Intrinsics.LJFF(this.skuReachables, shippingAddress.skuReachables) && Intrinsics.LJFF(this.invalidHintMessage, shippingAddress.invalidHintMessage) && Intrinsics.LJFF(this.hintInvalidDynamicMessage, shippingAddress.hintInvalidDynamicMessage) && Intrinsics.LJFF(this.addressValid, shippingAddress.addressValid) && Intrinsics.LJFF(this.title, shippingAddress.title) && Intrinsics.LJFF(this.starlingTexts, shippingAddress.starlingTexts) && Intrinsics.LJFF(this.addressInvalidType, shippingAddress.addressInvalidType) && Intrinsics.LJFF(this.switchRichInfoList, shippingAddress.switchRichInfoList) && Intrinsics.LJFF(this.benefitItems, shippingAddress.benefitItems) && Intrinsics.LJFF(this.shippingPriceBenefitItem, shippingAddress.shippingPriceBenefitItem) && Intrinsics.LJFF(this.addressModuleStyleVersion, shippingAddress.addressModuleStyleVersion) && Intrinsics.LJFF(this.pudoHintInvalidDynamicMessage, shippingAddress.pudoHintInvalidDynamicMessage) && Intrinsics.LJFF(this.hintMessageStyle, shippingAddress.hintMessageStyle) && Intrinsics.LJFF(this.isSelected, shippingAddress.isSelected) && Intrinsics.LJFF(this.subTitle, shippingAddress.subTitle) && Intrinsics.LJFF(this.daInfo, shippingAddress.daInfo) && Intrinsics.LJFF(this.pudoEnableEdit, shippingAddress.pudoEnableEdit) && Intrinsics.LJFF(this.pudoJumpSchema, shippingAddress.pudoJumpSchema) && Intrinsics.LJFF(this.invalidHintMessageRichText, shippingAddress.invalidHintMessageRichText);
    }

    public final int LIZ() {
        Integer num;
        if (Intrinsics.LJFF(this.addressValid, Boolean.FALSE)) {
            return 0;
        }
        String str = this.invalidHintMessage;
        if (str == null || str.length() == 0 || (num = this.hintMessageStyle) == null) {
            return 1;
        }
        if (num.intValue() != 0) {
            return num.intValue() == 1 ? 2 : 1;
        }
        return 0;
    }

    public ShippingAddress(Address address, Boolean bool, List<SkuReachable> list, String str, HintInvalidDynamicMessage hintInvalidDynamicMessage, Boolean bool2, String str2, AddressStarling addressStarling, Integer num, SwitchRichInfo switchRichInfo, List<BenefitItem> list2, BenefitItem benefitItem, Integer num2, HintInvalidDynamicMessage hintInvalidDynamicMessage2, Integer num3, Boolean bool3, String str3, Map<String, String> map, Boolean bool4, String str4, ECRichText eCRichText) {
        this.shippingAddress = address;
        this.addressReachable = bool;
        this.skuReachables = list;
        this.invalidHintMessage = str;
        this.hintInvalidDynamicMessage = hintInvalidDynamicMessage;
        this.addressValid = bool2;
        this.title = str2;
        this.starlingTexts = addressStarling;
        this.addressInvalidType = num;
        this.switchRichInfoList = switchRichInfo;
        this.benefitItems = list2;
        this.shippingPriceBenefitItem = benefitItem;
        this.addressModuleStyleVersion = num2;
        this.pudoHintInvalidDynamicMessage = hintInvalidDynamicMessage2;
        this.hintMessageStyle = num3;
        this.isSelected = bool3;
        this.subTitle = str3;
        this.daInfo = map;
        this.pudoEnableEdit = bool4;
        this.pudoJumpSchema = str4;
        this.invalidHintMessageRichText = eCRichText;
    }
}
