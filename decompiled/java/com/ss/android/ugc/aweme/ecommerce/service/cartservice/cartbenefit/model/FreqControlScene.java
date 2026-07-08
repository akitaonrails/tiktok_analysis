package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class FreqControlScene {

    @C09CT("6")
    public static final FreqControlScene CART_BENEFIT;
    public static final /* synthetic */ FreqControlScene[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final FreqControlScene UNKNOWN;

    public static InterfaceC2044707zh<FreqControlScene> getEntries() {
        return LLILLJJLI;
    }

    static {
        FreqControlScene freqControlScene = new FreqControlScene("UNKNOWN", 0, 0);
        UNKNOWN = freqControlScene;
        FreqControlScene freqControlScene2 = new FreqControlScene("CART_BENEFIT", 1, 6);
        CART_BENEFIT = freqControlScene2;
        FreqControlScene[] freqControlSceneArr = {freqControlScene, freqControlScene2};
        LL = freqControlSceneArr;
        LLILLJJLI = new C2254308sP(freqControlSceneArr);
    }

    public static FreqControlScene[] values() {
        return (FreqControlScene[]) LL.clone();
    }

    public static FreqControlScene valueOf(String str) {
        return (FreqControlScene) C08FF.LIZ(FreqControlScene.class, str);
    }

    public FreqControlScene(String str, int i, int i2) {
    }
}
