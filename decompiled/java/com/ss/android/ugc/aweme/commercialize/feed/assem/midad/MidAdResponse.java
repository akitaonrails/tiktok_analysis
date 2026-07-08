package com.ss.android.ugc.aweme.commercialize.feed.assem.midad;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class MidAdResponse extends BaseResponse implements Serializable {

    @C09CT("aweme_v1")
    public final Aweme aweme;

    @C09CT("sati_param_for_pitaya")
    public final String sati_param_for_pitaya;

    public MidAdResponse() {
        this(null, null);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final String getSati_param_for_pitaya() {
        return this.sati_param_for_pitaya;
    }

    public MidAdResponse(Aweme aweme, String str) {
        this.aweme = aweme;
        this.sati_param_for_pitaya = str;
    }
}
