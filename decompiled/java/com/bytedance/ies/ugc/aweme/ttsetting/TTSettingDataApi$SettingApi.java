package com.bytedance.ies.ugc.aweme.ttsetting;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.google.gson.k;

/* JADX INFO: loaded from: classes14.dex */
public interface TTSettingDataApi$SettingApi {
    @InterfaceC1501160pAQ("/service/settings/v2/")
    C0X9S<k> getResponse(@InterfaceC1501070pAH("has_local_cache") boolean z, @InterfaceC1501070pAH("app") int i, @InterfaceC1501070pAH("default") int i2);
}
