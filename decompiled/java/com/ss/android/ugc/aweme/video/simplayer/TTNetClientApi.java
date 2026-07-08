package com.ss.android.ugc.aweme.video.simplayer;

import X.C040I;
import X.C080U;
import X.C0X9S;
import X.InterfaceC1485705rj;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC2174808fa;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface TTNetClientApi {
    @InterfaceC1501200pAU
    C0X9S<String> get(@InterfaceC1485705rj String str, @InterfaceC2174808fa List<C080U> list);

    @InterfaceC1501240pAY
    C0X9S<String> post(@InterfaceC1485705rj String str, @InterfaceC2174808fa List<C080U> list, @C040I JSONObject jSONObject);
}
