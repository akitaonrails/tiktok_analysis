package com.ss.android.ugc.profile.business.profile.operators;

import X.C1768506wF;
import X.InterfaceC1255404vg;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC1255404vg> LIZ() {
        HashMap<String, InterfaceC1255404vg> map = new HashMap<>();
        map.put("from_school_post", new C1768506wF(22));
        map.put("from_profile_self", new C1768506wF(23));
        map.put("from_profile_other", new C1768506wF(24));
        return map;
    }
}
