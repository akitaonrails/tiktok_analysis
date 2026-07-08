package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.PlatformLinkInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CreateOrderSku {

    @C09CT("aggregation_count")
    public final Integer aggregationCount;

    @C09CT("aggregation_key")
    public final String aggregationKey;

    @C09CT("bcm_chain")
    public final String bcmChain;

    @C09CT("bundle_id")
    public final String bundleId;

    @C09CT("cart_item_id")
    public final String cartItemId;

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("channel_reserve_key")
    public final String channelReserveKey;

    @C09CT("entrance_info")
    public String entranceInfo;

    @C09CT("kol_id")
    public String kolId;

    @C09CT("membership_info")
    public final MemberShipInfo membershipInfo;

    @C09CT("platform_link_based_item")
    public final PlatformLinkInfo platformLinkInfo;

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_platform_level1")
    public final Integer productPlatformLevel1;

    @C09CT("product_sale_modes")
    public final List<Integer> productSaleModes;

    @C09CT("quantity")
    public final int quantity;

    @C09CT("selected_insurance_info")
    public final InsuranceInfo selectedInsuranceInfo;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("sku_price")
    public final SkuPrice skuPrice;

    @C09CT("sns_info")
    public final SnsInfo snsInfo;

    @C09CT("source")
    public final Integer source;

    @C09CT("source_info")
    public final String sourceInfo;

    @C09CT("user_right")
    public final UserRight userRight;

    @C09CT("user_virtual_info")
    public final UserVirtualInfo userVirtualInfo;

    public static CreateOrderSku LIZ(CreateOrderSku createOrderSku, String str, String str2, int i) {
        String str3;
        String str4;
        int i2;
        SkuPrice skuPrice;
        String str5;
        String str6;
        Integer num;
        UserRight userRight;
        String str7;
        String str8;
        String str9;
        String str10;
        Integer num2;
        Integer num3;
        String str11;
        PlatformLinkInfo platformLinkInfo;
        SnsInfo snsInfo;
        InsuranceInfo insuranceInfo;
        List<Integer> list;
        UserVirtualInfo userVirtualInfo;
        String str12 = str2;
        String str13 = str;
        MemberShipInfo memberShipInfo = null;
        if ((i & 1) != 0) {
            str3 = createOrderSku.productId;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str4 = createOrderSku.skuId;
        } else {
            str4 = null;
        }
        if ((i & 4) != 0) {
            i2 = createOrderSku.quantity;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            skuPrice = createOrderSku.skuPrice;
        } else {
            skuPrice = null;
        }
        if ((i & 16) != 0) {
            str5 = createOrderSku.chainKey;
        } else {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str13 = createOrderSku.entranceInfo;
        }
        if ((i & 64) != 0) {
            str6 = createOrderSku.cartItemId;
        } else {
            str6 = null;
        }
        if ((i & 128) != 0) {
            num = createOrderSku.source;
        } else {
            num = null;
        }
        if ((i & 256) != 0) {
            userRight = createOrderSku.userRight;
        } else {
            userRight = null;
        }
        if ((i & 512) != 0) {
            str7 = createOrderSku.sourceInfo;
        } else {
            str7 = null;
        }
        if ((i & 1024) != 0) {
            str8 = createOrderSku.kolId;
        } else {
            str8 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str9 = createOrderSku.bundleId;
        } else {
            str9 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str10 = createOrderSku.aggregationKey;
        } else {
            str10 = null;
        }
        if ((i & 8192) != 0) {
            num2 = createOrderSku.aggregationCount;
        } else {
            num2 = null;
        }
        if ((i & 16384) != 0) {
            num3 = createOrderSku.productPlatformLevel1;
        } else {
            num3 = null;
        }
        if ((32768 & i) != 0) {
            str11 = createOrderSku.channelReserveKey;
        } else {
            str11 = null;
        }
        if ((65536 & i) != 0) {
            str12 = createOrderSku.bcmChain;
        }
        if ((131072 & i) != 0) {
            platformLinkInfo = createOrderSku.platformLinkInfo;
        } else {
            platformLinkInfo = null;
        }
        if ((262144 & i) != 0) {
            snsInfo = createOrderSku.snsInfo;
        } else {
            snsInfo = null;
        }
        if ((524288 & i) != 0) {
            insuranceInfo = createOrderSku.selectedInsuranceInfo;
        } else {
            insuranceInfo = null;
        }
        if ((1048576 & i) != 0) {
            list = createOrderSku.productSaleModes;
        } else {
            list = null;
        }
        if ((2097152 & i) != 0) {
            userVirtualInfo = createOrderSku.userVirtualInfo;
        } else {
            userVirtualInfo = null;
        }
        if ((i & 4194304) != 0) {
            memberShipInfo = createOrderSku.membershipInfo;
        }
        return new CreateOrderSku(str3, str4, i2, skuPrice, str5, str13, str6, num, userRight, str7, str8, str9, str10, num2, num3, str11, str12, platformLinkInfo, snsInfo, insuranceInfo, list, userVirtualInfo, memberShipInfo);
    }

    public CreateOrderSku(String str, String str2, int i, SkuPrice skuPrice, String str3, String str4, String str5, Integer num, UserRight userRight, String str6, String str7, String str8, String str9, Integer num2, Integer num3, String str10, String str11, PlatformLinkInfo platformLinkInfo, SnsInfo snsInfo, InsuranceInfo insuranceInfo, List<Integer> list, UserVirtualInfo userVirtualInfo, MemberShipInfo memberShipInfo) {
        this.productId = str;
        this.skuId = str2;
        this.quantity = i;
        this.skuPrice = skuPrice;
        this.chainKey = str3;
        this.entranceInfo = str4;
        this.cartItemId = str5;
        this.source = num;
        this.userRight = userRight;
        this.sourceInfo = str6;
        this.kolId = str7;
        this.bundleId = str8;
        this.aggregationKey = str9;
        this.aggregationCount = num2;
        this.productPlatformLevel1 = num3;
        this.channelReserveKey = str10;
        this.bcmChain = str11;
        this.platformLinkInfo = platformLinkInfo;
        this.snsInfo = snsInfo;
        this.selectedInsuranceInfo = insuranceInfo;
        this.productSaleModes = list;
        this.userVirtualInfo = userVirtualInfo;
        this.membershipInfo = memberShipInfo;
    }
}
