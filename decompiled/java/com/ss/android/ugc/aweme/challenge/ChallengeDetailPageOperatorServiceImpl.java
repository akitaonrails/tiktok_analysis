package com.ss.android.ugc.aweme.challenge;

import X.C1768506wF;
import X.InterfaceC1255404vg;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC1255404vg> LIZ() {
        HashMap<String, InterfaceC1255404vg> map = new HashMap<>();
        map.put("from_discovery_challenge", new C1768506wF(1));
        map.put("from_challenge", new C1768506wF(2));
        map.put("from_search_recalled_challenge", new C1768506wF(3));
        return map;
    }
}
