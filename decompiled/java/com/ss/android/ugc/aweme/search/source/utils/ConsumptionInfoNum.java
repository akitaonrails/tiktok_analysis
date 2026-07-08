package com.ss.android.ugc.aweme.search.source.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class ConsumptionInfoNum {

    @C09CT("creation_effect_search_scene_num")
    public final int effectSceneNum;

    @C09CT("creation_effect_search_id_num")
    public final int effectSceneSearchIdNum;

    @C09CT("feed_scene_num")
    public final int feedSceneNum;

    @C09CT("creation_music_search_scene_num")
    public final int musicSceneNum;

    @C09CT("card_consumption_num_for_each_search")
    public final int searchCardNum;

    @C09CT("search_scene_num")
    public final int searchSceneNum;

    public ConsumptionInfoNum() {
        this(30, 10, 20, 10, 3, 20);
    }

    public ConsumptionInfoNum(int i, int i2, int i3, int i4, int i5, int i6) {
        this.feedSceneNum = i;
        this.searchSceneNum = i2;
        this.searchCardNum = i3;
        this.musicSceneNum = i4;
        this.effectSceneNum = i5;
        this.effectSceneSearchIdNum = i6;
    }
}
