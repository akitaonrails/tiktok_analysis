package com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.api;

import X.C09CT;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes30.dex */
public final class SoundEffectListApiResponse extends BaseNetResponse {

    @C09CT("sc_list")
    public ArrayList<SoundEffect> list;

    @C09CT("has_more")
    public Integer hasMore = 0;
    public Integer LL = 0;
}
