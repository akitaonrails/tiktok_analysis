package com.ss.android.ugc.aweme.tako.personalization;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoPersonalSignalConfigData {

    @C09CT("aweme_count_in_tako")
    public final int awemeCountInTako;

    @C09CT("aweme_count_out_tako")
    public final int awemeCountOutTako;

    @C09CT("enable_product_record")
    public final boolean enableProduct;

    @C09CT("enable_record")
    public final boolean enableRecord;

    @C09CT("search_history_count")
    public final int searchHistoryCount;

    @C09CT("tako_interact_message_count")
    public final int takoInteractMessageCount;

    @C09CT("tako_product_count")
    public final int takoProductCount;

    @C09CT("tako_staytime_message_count")
    public final int takoStaytimeMessageCount;

    public TakoPersonalSignalConfigData() {
        this(false, false, 20, 20, 20, 20, 60, 20);
    }

    public TakoPersonalSignalConfigData(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6) {
        this.enableRecord = z;
        this.enableProduct = z2;
        this.awemeCountInTako = i;
        this.takoInteractMessageCount = i2;
        this.takoProductCount = i3;
        this.takoStaytimeMessageCount = i4;
        this.awemeCountOutTako = i5;
        this.searchHistoryCount = i6;
    }
}
