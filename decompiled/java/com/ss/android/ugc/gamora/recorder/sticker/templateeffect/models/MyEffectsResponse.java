package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class MyEffectsResponse extends BaseResponse {

    @C09CT("effects")
    public final List<MobileEffectApiModel> effects;

    public MyEffectsResponse(List<MobileEffectApiModel> list) {
        this.effects = list;
    }
}
