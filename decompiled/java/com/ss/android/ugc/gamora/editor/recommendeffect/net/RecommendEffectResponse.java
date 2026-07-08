package com.ss.android.ugc.gamora.editor.recommendeffect.net;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class RecommendEffectResponse {

    @C09CT("effect_infos")
    public final List<RecommendEffectItem> effectInfoList;

    @C09CT("status_code")
    public final Integer statusCode;

    public RecommendEffectResponse(Integer num, List<RecommendEffectItem> list) {
        this.statusCode = num;
        this.effectInfoList = list;
    }
}
