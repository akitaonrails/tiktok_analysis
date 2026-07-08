package com.ss.android.ugc.aweme.search.detail.core.viewmodel;

import X.C0R4K;
import X.InterfaceC1255404vg;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC1255404vg> LIZ() {
        HashMap<String, InterfaceC1255404vg> map = new HashMap<>();
        map.put("from_search", new C0R4K(9));
        map.put("from_search_mix", new C0R4K(10));
        map.put("from_search_continuous_loading_card", new C0R4K(11));
        map.put("from_search_continuous_play_card", new C0R4K(12));
        return map;
    }
}
