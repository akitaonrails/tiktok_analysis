package com.ss.android.ugc.aweme.series.vip.service;

import X.AbstractC1614600s7O;
import X.AbstractC19486711Lt;
import X.C0KPG;
import X.C11HU;
import X.C11NZ;
import X.C19477211Ic;
import X.EnumC1614520s7G;
import android.content.Context;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$MarketInfo;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeBizLine;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeETInfo;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeProductInfo;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public interface SeriesSubscriptionService {
    C11NZ<AbstractC1614600s7O> LIZ();

    C11HU LIZIZ();

    AbstractC19486711Lt LIZJ(List<String> list);

    void LIZLLL(Context context, C0KPG c0kpg);

    void LJ(EnumC1614520s7G enumC1614520s7G);

    C19477211Ic LJFF(Context context, SeriesSubscriptionModels$TradeProductInfo seriesSubscriptionModels$TradeProductInfo, SeriesSubscriptionModels$TradeBizLine seriesSubscriptionModels$TradeBizLine, SeriesSubscriptionModels$TradeETInfo seriesSubscriptionModels$TradeETInfo, String str, String str2);

    C19477211Ic LJI(Context context, SeriesSubscriptionModels$TradeProductInfo seriesSubscriptionModels$TradeProductInfo, SeriesSubscriptionModels$TradeBizLine seriesSubscriptionModels$TradeBizLine, SeriesSubscriptionModels$MarketInfo seriesSubscriptionModels$MarketInfo, SeriesSubscriptionModels$TradeETInfo seriesSubscriptionModels$TradeETInfo, String str, String str2);

    C19477211Ic LJII(Context context, String str, SeriesSubscriptionModels$TradeETInfo seriesSubscriptionModels$TradeETInfo, String str2);

    C19477211Ic LJJIIJ(String str);
}
