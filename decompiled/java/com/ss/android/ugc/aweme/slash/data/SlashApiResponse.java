package com.ss.android.ugc.aweme.slash.data;

import X.C080U;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashApiResponse {
    public final List<C080U> headers;
    public final SlashPage page;

    public SlashApiResponse(SlashPage slashPage, List<C080U> list) {
        this.page = slashPage;
        this.headers = list;
    }
}
