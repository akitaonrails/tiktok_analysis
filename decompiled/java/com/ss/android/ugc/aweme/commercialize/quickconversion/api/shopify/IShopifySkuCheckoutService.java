package com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify;

import X.C14CS;
import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.QuickActionModel;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: loaded from: classes17.dex */
public interface IShopifySkuCheckoutService {
    boolean LIZ(AwemeRawAd awemeRawAd, QuickActionModel quickActionModel, int i, String str);

    TuxSheet LIZIZ(Context context, Aweme aweme, QuickActionModel quickActionModel, String str, String str2, AwS382S0200000_16 awS382S0200000_16, AwS382S0200000_16 awS382S0200000_162);

    boolean LIZJ(Context context, Aweme aweme, String str, String str2, String str3);

    void LIZLLL(AwemeRawAd awemeRawAd, String str, String str2);

    C14CS LJ();

    void LJFF(String str, String str2);
}
