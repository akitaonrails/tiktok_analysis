package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.core.engine.BizParserInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BillInfoSetting {

    @C09CT("address_setting")
    public AddressSetting addressSetting;

    @C09CT("bonus_cell_style")
    public Integer bonusCellStyle;

    @C09CT("button_area_setting")
    public ButtonAreaSetting buttonAreaSetting;

    @C09CT("client_template")
    public Integer clientTemplate;

    @C09CT("main_order_setting")
    public MainOrderSetting mainOrderSetting;

    @C09CT("order_summary_setting")
    public OrderSummarySetting orderSummarySetting;

    @C09CT("page_biz_list")
    public List<BizParserInfo> pageBizList;

    @C09CT("page_header_setting")
    public PageHeaderSetting pageHeaderSetting;

    @C09CT("poll_type")
    public Integer pollType;

    @C09CT("right_setting")
    public RightSetting rightSetting;

    @C09CT("should_modify_policy_link")
    public Boolean shouldModifyPolicyLink;

    @C09CT("total_price_style")
    public Integer totalPriceStyle;

    public BillInfoSetting() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public BillInfoSetting(AddressSetting addressSetting, MainOrderSetting mainOrderSetting, ButtonAreaSetting buttonAreaSetting, Boolean bool, Integer num, List<BizParserInfo> list, OrderSummarySetting orderSummarySetting, PageHeaderSetting pageHeaderSetting, Integer num2, RightSetting rightSetting, Integer num3, Integer num4) {
        this.addressSetting = addressSetting;
        this.mainOrderSetting = mainOrderSetting;
        this.buttonAreaSetting = buttonAreaSetting;
        this.shouldModifyPolicyLink = bool;
        this.clientTemplate = num;
        this.pageBizList = list;
        this.orderSummarySetting = orderSummarySetting;
        this.pageHeaderSetting = pageHeaderSetting;
        this.pollType = num2;
        this.rightSetting = rightSetting;
        this.totalPriceStyle = num3;
        this.bonusCellStyle = num4;
    }
}
