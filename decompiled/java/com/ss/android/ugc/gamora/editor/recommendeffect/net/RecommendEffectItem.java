package com.ss.android.ugc.gamora.editor.recommendeffect.net;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class RecommendEffectItem {
    public String LIZ;
    public final boolean LIZIZ;

    @C09CT("icon_url")
    public String iconUrl;

    @C09CT("effect_id")
    public String id;

    @C09CT("tt_prop")
    public final int isTTProp;

    @C09CT("location_city")
    public final String locationCity;

    @C09CT("need_replay")
    public final boolean needReplay;

    @C09CT("nle_model")
    public final String nleModel;

    @C09CT("score")
    public final float score;

    public RecommendEffectItem() {
        this("", "", false, 1.0f, "", "", null, 0, false);
    }

    public RecommendEffectItem(String str, String str2, boolean z, float f, String str3, String str4, String str5, int i, boolean z2) {
        this.id = str;
        this.LIZ = str2;
        this.needReplay = z;
        this.score = f;
        this.nleModel = str3;
        this.iconUrl = str4;
        this.locationCity = str5;
        this.isTTProp = i;
        this.LIZIZ = z2;
    }
}
