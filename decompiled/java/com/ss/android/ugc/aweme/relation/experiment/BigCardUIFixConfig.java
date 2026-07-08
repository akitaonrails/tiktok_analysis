package com.ss.android.ugc.aweme.relation.experiment;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class BigCardUIFixConfig {

    @C09CT("big_card_bgm_id_list")
    public final List<String> bigCardBgmIdList;

    @C09CT("enable")
    public int enable;

    @C09CT("new_background")
    public final int newBackground;

    @C09CT("show_swipe_up_text")
    public final int showSwipeUpText;

    public BigCardUIFixConfig() {
        this(0, C1697810uHb.LJIIJJI("6692683186809359108", "7114694728502740994"), 0, 0);
    }

    public BigCardUIFixConfig(int i, List<String> list, int i2, int i3) {
        this.enable = i;
        this.bigCardBgmIdList = list;
        this.showSwipeUpText = i2;
        this.newBackground = i3;
    }
}
