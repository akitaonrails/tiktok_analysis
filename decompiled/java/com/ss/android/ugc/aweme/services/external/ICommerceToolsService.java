package com.ss.android.ugc.aweme.services.external;

import X.InterfaceC681980Qp2;
import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public interface ICommerceToolsService {
    InterfaceC681980Qp2 getMusicContext();

    void handleReceptionByEvent(JSONObject jSONObject, Context context);

    boolean isCommerceChallenge();

    void openBrandedContentPage(Context context);

    void setCommerceChallenge(boolean z);

    boolean usedCommerceSticker();
}
