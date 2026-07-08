package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import webcast.api.partnership.LabelFilterInfo;
import webcast.api.partnership.PunishInfo;
import webcast.api.partnership.TaskPriceUpdate;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorPartnershipInfoResponse {

    @C09CT("has_permission")
    public boolean hasPermission;

    @C09CT("label_filter_info")
    public LabelFilterInfo labelFilterInfo;

    @C09CT("price_update_list")
    public List<TaskPriceUpdate> priceUpdateList;

    @C09CT("punish_info")
    public List<PunishInfo> punishInfo;

    @C09CT("sign_agreement")
    public boolean signAgreement;

    @C09CT("TaxPayoutConfirm")
    public boolean taxpayoutconfirm;

    public AnchorPartnershipInfoResponse() {
        this(false, false);
    }

    public AnchorPartnershipInfoResponse(boolean z, boolean z2) {
        this.hasPermission = z;
        this.signAgreement = z2;
        C13BV c13bv = C13BV.INSTANCE;
        this.punishInfo = c13bv;
        this.priceUpdateList = c13bv;
    }
}
