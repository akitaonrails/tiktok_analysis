package com.bytedance.android.livesdk.game.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class CPTPriceInfo {

    @C09CT("boundary_cpm_vv")
    public long boundaryCpmVv;

    @C09CT("cpt_price")
    public String cptPrice = "";

    @C09CT("cpt_price_lock_expire_ts")
    public long cptPriceLockExpireTs;

    @C09CT("cpt_price_post_expire_ts")
    public long cptPricePostExpireTs;

    @C09CT("cpt_price_process")
    public CPTPriceProcess cptPriceProcess;

    @C09CT("cpt_times")
    public int cptTimes;

    @C09CT("hit_ensure")
    public boolean hitEnsure;
}
