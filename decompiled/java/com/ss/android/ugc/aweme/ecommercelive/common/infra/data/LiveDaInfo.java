package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes33.dex */
public final class LiveDaInfo {

    @C09CT("logo_da_info")
    @C09CS(StringJsonAdapterFactory.class)
    public HashMap<String, String> logoDaInfo;

    @C09CT("trans_da_info")
    @C09CS(StringJsonAdapterFactory.class)
    public HashMap<String, String> transDaInfo;

    public LiveDaInfo(HashMap<String, String> map, HashMap<String, String> map2) {
        this.logoDaInfo = map;
        this.transDaInfo = map2;
    }
}
