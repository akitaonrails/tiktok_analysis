package com.ss.android.ugc.aweme.ad.feed;

import X.C1012580cSO;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: loaded from: classes17.dex */
public interface IFeedAdShoppingService {
    public static final C1012580cSO LIZ = C1012580cSO.LIZ;

    void LIZ(Aweme aweme, AFwS232S0000000_4 aFwS232S0000000_4);

    String LIZIZ(Aweme aweme, String str, Map map, boolean z);

    void LIZJ(Aweme aweme, Function1<Object, Unit> function1, Number number);

    long LIZLLL(Aweme aweme);

    void getShoppingCoupon(Aweme aweme, Function1<Object, Unit> function1);

    String handleECAnchorSchemaIfNeeded(String str, Aweme aweme);
}
