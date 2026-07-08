package com.bytedance.pipo.ttpay.portal.wallet;

import X.C09CT;
import com.bytedance.pipo.stellar.base.model.ButtonDO;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import com.bytedance.pipo.stellar.base.model.PriceDO;
import com.bytedance.pipo.stellar.base.model.TextDO;
import com.bytedance.pipo.stellar.base.model.TuxTagDO;

/* JADX INFO: loaded from: classes27.dex */
public final class BalanceDO {

    @C09CT("arrow_icon")
    public final ImageDO arrowIcon;

    @C09CT("balance_amount")
    public final PriceDO balance;

    @C09CT("button_list")
    public final BalanceButtonListDO buttonListDO;

    @C09CT("coin_image")
    public final ImageDO coinImage;

    @C09CT("left_button")
    public final ButtonDO leftButton;

    @C09CT("padding")
    public final MarginDO padding;

    @C09CT("right_button")
    public final ButtonDO rightButton;

    @C09CT("title")
    public final TextDO title;

    @C09CT("unavailable_view")
    public final BalanceUnavailableDO unavailableDO;

    @C09CT("verified_image")
    public final ImageDO verifiedImg;

    @C09CT("verified_tag")
    public final TuxTagDO verifiedTag;

    public BalanceDO() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public BalanceDO(TextDO textDO, ImageDO imageDO, PriceDO priceDO, ImageDO imageDO2, ButtonDO buttonDO, ButtonDO buttonDO2, TuxTagDO tuxTagDO, BalanceUnavailableDO balanceUnavailableDO, MarginDO marginDO, BalanceButtonListDO balanceButtonListDO, ImageDO imageDO3) {
        this.title = textDO;
        this.arrowIcon = imageDO;
        this.balance = priceDO;
        this.coinImage = imageDO2;
        this.leftButton = buttonDO;
        this.rightButton = buttonDO2;
        this.verifiedTag = tuxTagDO;
        this.unavailableDO = balanceUnavailableDO;
        this.padding = marginDO;
        this.buttonListDO = balanceButtonListDO;
        this.verifiedImg = imageDO3;
    }
}
