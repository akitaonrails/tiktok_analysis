package com.bytedance.frameworks.baselib.netx.cache;

import X.C0X52;
import X.C0XM9;
import X.C0XMJ;
import X.C0XS7;
import X.C1346100l8K;
import X.C1494570ozn;
import X.C1498970p6t;
import X.C1499330p7T;
import X.C1499410p7b;
import X.C1499440p7e;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class NetXCacheHandler implements NetworkPartner.Blocker, NetworkPartner.ResponseHandler {
    public static final NetXCacheHandler LIZ = new NetXCacheHandler();

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    public final C0X52<?> LJFF(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ResponseHandler
    public final void LIZ(C0XS7<?> c0xs7, C1499330p7T c1499330p7T) {
        C0XM9 c0xm9;
        C1499410p7b c1499410p7b;
        Object objLIZ = c1499330p7T.LIZ(this);
        if (!(objLIZ instanceof C0XM9) || (c0xm9 = (C0XM9) objLIZ) == null || (c1499410p7b = C0XMJ.LIZ) == null) {
            return;
        }
        C0X52<?> c0x52LIZ = c0xs7.LIZ();
        String strLIZJ = C1499410p7b.LIZJ(c0xm9);
        if (!Intrinsics.LJFF(strLIZJ, "not_support")) {
            if (Intrinsics.LJFF(strLIZJ, "not_pending")) {
                c1499410p7b.LJ(c0xm9, c0x52LIZ);
            } else {
                c1499410p7b.LJ(c0xm9, c0x52LIZ);
                c1499410p7b.LIZ(strLIZJ);
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    public final C0X52<?> LIZJ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        boolean z;
        C1499410p7b c1499410p7b;
        Map<String, Object> map;
        Map<String, Object> map2;
        Map<String, Object> map3;
        if (!C1498970p6t.LIZ(c0xm9) && !C1498970p6t.LIZIZ(c0xm9)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || (c1499410p7b = C0XMJ.LIZ) == null) {
            return null;
        }
        try {
            if ((C1498970p6t.LIZ(c0xm9) || C1498970p6t.LIZIZ(c0xm9)) && C1346100l8K.LIZIZ(c0xm9, 1)) {
                C1494570ozn c1494570ozn = c1499330p7T.LIZIZ;
                if (c1494570ozn != null && (map3 = c1494570ozn.LJL) != null) {
                    ((HashMap) map3).put("biz_cache_enable", 1);
                }
                C0X52<?> c0x52LIZIZ = LIZIZ(c1499410p7b, c0xm9, c1499330p7T);
                if (c0x52LIZIZ != null) {
                    C1494570ozn c1494570ozn2 = c1499330p7T.LIZIZ;
                    if (c1494570ozn2 != null && (map2 = c1494570ozn2.LJL) != null) {
                        ((HashMap) map2).put("biz_cache_type", 1);
                        return c0x52LIZIZ;
                    }
                } else {
                    C1494570ozn c1494570ozn3 = c1499330p7T.LIZIZ;
                    if (c1494570ozn3 != null && (map = c1494570ozn3.LJL) != null) {
                        ((HashMap) map).put("biz_cache_type", 0);
                    }
                }
                return c0x52LIZIZ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1499410p7b.LIZ(C1499410p7b.LIZJ(c0xm9));
        }
        return null;
    }

    public final C0X52<?> LIZIZ(C1499410p7b c1499410p7b, C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        boolean zAwait;
        C0X52<?> c0x52LIZLLL = null;
        if (C1346100l8K.LIZIZ(c0xm9, 8)) {
            c1499330p7T.LIZIZ(this, c0xm9);
            return null;
        }
        String strLIZJ = C1499410p7b.LIZJ(c0xm9);
        if (!Intrinsics.LJFF(strLIZJ, "not_support")) {
            if (Intrinsics.LJFF(strLIZJ, "not_pending")) {
                c0x52LIZLLL = c1499410p7b.LIZLLL(c0xm9);
            } else {
                C1499440p7e c1499440p7e = c1499410p7b.LIZ.get(strLIZJ);
                if (c1499440p7e != null) {
                    ReentrantLock reentrantLock = c1499440p7e.LIZ;
                    reentrantLock.lock();
                    try {
                        try {
                            zAwait = c1499440p7e.LIZIZ.await(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            zAwait = false;
                        }
                        reentrantLock.unlock();
                        if (!zAwait) {
                            c1499410p7b.LIZ.remove(strLIZJ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                c0x52LIZLLL = c1499410p7b.LIZLLL(c0xm9);
                if (c0x52LIZLLL == null) {
                    c1499410p7b.LIZ.put(strLIZJ, new C1499440p7e());
                }
            }
        }
        if (!C1346100l8K.LIZIZ(c0xm9, 4) && c0x52LIZLLL == null) {
            c1499330p7T.LIZIZ(this, c0xm9);
        }
        return c0x52LIZLLL;
    }
}
