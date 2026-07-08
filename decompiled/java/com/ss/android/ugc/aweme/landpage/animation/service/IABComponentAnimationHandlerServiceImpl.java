package com.ss.android.ugc.aweme.landpage.animation.service;

import X.C1035880d3y;
import X.C1038420d84;
import X.InterfaceC1038430d85;
import X.InterfaceC1038440d86;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public final class IABComponentAnimationHandlerServiceImpl implements IIABComponentAnimationHandlerService {
    @Override // com.ss.android.ugc.aweme.landpage.animation.service.IIABComponentAnimationHandlerService
    public final C1038420d84 LIZ(SparkContext sparkContext, C1035880d3y c1035880d3y) {
        if (sparkContext == null || c1035880d3y == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC1038440d86> it2 = C1038420d84.LIZIZ.iterator();
        while (it2.hasNext()) {
            InterfaceC1038430d85 interfaceC1038430d85LIZ = it2.next().LIZ(sparkContext, c1035880d3y);
            if (interfaceC1038430d85LIZ != null) {
                arrayList.add(interfaceC1038430d85LIZ);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1038420d84(Collections.unmodifiableList(arrayList));
    }
}
