package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class EntranceScene {

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final EntranceScene ENTRANCE_SCENE_DEFAULT;

    @C09CT("1")
    public static final EntranceScene ENTRANCE_SCENE_RECALC_PRICE;
    public static final /* synthetic */ EntranceScene[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EntranceScene> getEntries() {
        return LLILLL;
    }

    static {
        EntranceScene entranceScene = new EntranceScene("ENTRANCE_SCENE_DEFAULT", 0, 0);
        ENTRANCE_SCENE_DEFAULT = entranceScene;
        EntranceScene entranceScene2 = new EntranceScene("ENTRANCE_SCENE_RECALC_PRICE", 1, 1);
        ENTRANCE_SCENE_RECALC_PRICE = entranceScene2;
        EntranceScene[] entranceSceneArr = {entranceScene, entranceScene2};
        LLILLJJLI = entranceSceneArr;
        LLILLL = new C2254308sP(entranceSceneArr);
    }

    public static EntranceScene[] values() {
        return (EntranceScene[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EntranceScene valueOf(String str) {
        return (EntranceScene) C08FF.LIZ(EntranceScene.class, str);
    }

    public EntranceScene(String str, int i, int i2) {
        this.LL = i2;
    }
}
