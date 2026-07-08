package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PartnershipDropsGift {

    @C09CT("gift")
    public PartnershipGiftInfo gift;

    @C09CT("total_available_num")
    public long totalAvailableNum;

    @C09CT("total_num")
    public long totalNum;

    @C09CT("unique")
    public boolean unique;

    @C09CT("task_config")
    public List<PartnershipDropsTaskConfig> taskConfig = new ArrayList();

    @C09CT("total_num_config")
    public List<Long> totalNumConfig = new ArrayList();
}
