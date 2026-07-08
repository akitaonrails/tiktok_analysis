package com.bytedance.ies.im.core;

import X.C0YM2;
import X.C0YMF;
import X.C0Z4R;
import X.C882410YjX;
import X.C882690Yjz;
import X.C883250Ykt;
import X.C883390Yl7;
import X.C883520YlK;
import com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService;
import com.bytedance.ies.im.core.depend.WsDependImpl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class IMCoreDependProxyService implements IIMCoreDependProxyService {
    public final Map<C0YM2, C0YMF> LIZIZ = new HashMap();

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService
    public final void LIZ() {
        C883250Ykt c883250Ykt = C883250Ykt.LL;
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService
    public final void LIZIZ() {
        C883520YlK c883520YlK = C883520YlK.LIZ;
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService
    public final void LIZJ() {
        WsDependImpl wsDependImpl = WsDependImpl.LL;
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService
    public final C883390Yl7 LIZLLL() {
        return C883390Yl7.LIZ;
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService
    public final C882410YjX LJ() {
        return C882410YjX.LIZ;
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService
    public final C882690Yjz LJI() {
        return C882690Yjz.LIZ;
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService
    public final C0YMF LJFF(C0YM2 c0ym2) {
        C0YMF c0ymf = (C0YMF) ((HashMap) this.LIZIZ).get(c0ym2);
        if (c0ymf != null) {
            return c0ymf;
        }
        C0Z4R c0z4r = new C0Z4R(c0ym2);
        ((HashMap) this.LIZIZ).put(c0ym2, c0z4r);
        return c0z4r;
    }
}
