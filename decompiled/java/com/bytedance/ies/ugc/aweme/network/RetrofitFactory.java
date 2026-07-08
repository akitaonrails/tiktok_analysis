package com.bytedance.ies.ugc.aweme.network;

import X.C1499850p8J;
import X.InterfaceC2661011f;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RetrofitFactory implements IRetrofitFactory {
    public static final INetworkKitDepend LIZ = (INetworkKitDepend) PluggableExtentionKt.pluggableSpi(INetworkKitDepend.class);

    @Override // com.bytedance.ies.ugc.aweme.network.IRetrofitFactory
    public final InterfaceC2661011f LIZ(String str) {
        return new C1499850p8J(str).build();
    }

    @Override // com.bytedance.ies.ugc.aweme.network.IRetrofitFactory
    public final C1499850p8J createBuilder(String str) {
        return new C1499850p8J(str);
    }

    public static List LIZIZ(Class cls, List list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Object obj = null;
            for (Object obj2 : list) {
                if (cls.isInstance(obj2)) {
                    obj = obj2;
                } else if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            if (obj != null) {
                ListProtector.add(arrayList, 0, obj);
            }
            return arrayList;
        }
        return list;
    }
}
