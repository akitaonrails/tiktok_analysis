package com.bytedance.android.livesdk.interaction.drawguess.network;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessSummaryResponse {

    @C09CT("pictionary_list")
    public final List<PictionaryFullInfo> pictionaryList;

    public DrawGuessSummaryResponse() {
        this(new ArrayList());
    }

    public DrawGuessSummaryResponse(List<PictionaryFullInfo> list) {
        this.pictionaryList = list;
    }
}
