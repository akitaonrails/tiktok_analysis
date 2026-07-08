package com.ss.android.ugc.aweme.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class DramaFeedCardInsertScene {

    @C09CT("1")
    public static final DramaFeedCardInsertScene DRAMA_FEED_CARD_INSERT_SCENE_DRAMA_TAB;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final DramaFeedCardInsertScene DRAMA_FEED_CARD_INSERT_SCENE_FYP;

    @C09CT("2")
    public static final DramaFeedCardInsertScene DRAMA_FEED_CARD_INSERT_SCENE_INNER_FEED;
    public static final /* synthetic */ DramaFeedCardInsertScene[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<DramaFeedCardInsertScene> getEntries() {
        return LLILLL;
    }

    static {
        DramaFeedCardInsertScene dramaFeedCardInsertScene = new DramaFeedCardInsertScene("DRAMA_FEED_CARD_INSERT_SCENE_FYP", 0, 0);
        DRAMA_FEED_CARD_INSERT_SCENE_FYP = dramaFeedCardInsertScene;
        DramaFeedCardInsertScene dramaFeedCardInsertScene2 = new DramaFeedCardInsertScene("DRAMA_FEED_CARD_INSERT_SCENE_DRAMA_TAB", 1, 1);
        DRAMA_FEED_CARD_INSERT_SCENE_DRAMA_TAB = dramaFeedCardInsertScene2;
        DramaFeedCardInsertScene dramaFeedCardInsertScene3 = new DramaFeedCardInsertScene("DRAMA_FEED_CARD_INSERT_SCENE_INNER_FEED", 2, 2);
        DRAMA_FEED_CARD_INSERT_SCENE_INNER_FEED = dramaFeedCardInsertScene3;
        DramaFeedCardInsertScene[] dramaFeedCardInsertSceneArr = {dramaFeedCardInsertScene, dramaFeedCardInsertScene2, dramaFeedCardInsertScene3};
        LLILLJJLI = dramaFeedCardInsertSceneArr;
        LLILLL = new C2254308sP(dramaFeedCardInsertSceneArr);
    }

    public static DramaFeedCardInsertScene[] values() {
        return (DramaFeedCardInsertScene[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static DramaFeedCardInsertScene valueOf(String str) {
        return (DramaFeedCardInsertScene) C08FF.LIZ(DramaFeedCardInsertScene.class, str);
    }

    public DramaFeedCardInsertScene(String str, int i, int i2) {
        this.LL = i2;
    }
}
