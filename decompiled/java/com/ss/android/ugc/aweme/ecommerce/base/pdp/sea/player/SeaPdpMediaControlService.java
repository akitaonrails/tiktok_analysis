package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player;

import X.C1508300pLw;
import X.EnumC1308950kAP;
import X.EnumC1486810onH;
import X.InterfaceC1508310pLx;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class SeaPdpMediaControlService implements ISeaPdpMediaControlService {
    public boolean LLILLL;
    public volatile EnumC1486810onH LL = EnumC1486810onH.RESUME;
    public final List<WeakReference<InterfaceC1508310pLx>> LLILLJJLI = new ArrayList();
    public final Map<WeakReference<InterfaceC1508310pLx>, C1508300pLw> LLILZ = new LinkedHashMap();

    public final void LIZ() {
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            Reference reference = (Reference) it2.next();
            if (reference.get() == null) {
                it2.remove();
                this.LLILZ.remove(reference);
            }
        }
        Iterator it3 = ((LinkedHashMap) this.LLILZ).entrySet().iterator();
        while (it3.hasNext()) {
            if (((Reference) ((Map.Entry) it3.next()).getKey()).get() == null) {
                it3.remove();
            }
        }
    }

    public final boolean LIZLLL() {
        LIZ();
        if (((ArrayList) this.LLILLJJLI).isEmpty()) {
            return true;
        }
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            InterfaceC1508310pLx interfaceC1508310pLx = (InterfaceC1508310pLx) ((Reference) it2.next()).get();
            if (interfaceC1508310pLx != null) {
                C1508300pLw c1508300pLw = (C1508300pLw) ((LinkedHashMap) this.LLILZ).get(LIZIZ(interfaceC1508310pLx));
                Boolean bool = c1508300pLw != null ? c1508300pLw.LIZ : null;
                boolean zLLLLZLLIL = interfaceC1508310pLx.LLLLZLLIL();
                if (Intrinsics.LJFF(bool, Boolean.TRUE) && !zLLLLZLLIL) {
                    return false;
                }
            }
        }
        return true;
    }

    public final WeakReference<InterfaceC1508310pLx> LIZIZ(InterfaceC1508310pLx interfaceC1508310pLx) {
        for (WeakReference<InterfaceC1508310pLx> weakReference : ((LinkedHashMap) this.LLILZ).keySet()) {
            if (Intrinsics.LJFF(weakReference.get(), interfaceC1508310pLx)) {
                return weakReference;
            }
        }
        return new WeakReference<>(interfaceC1508310pLx);
    }

    public final boolean LJFF(InterfaceC1508310pLx interfaceC1508310pLx) {
        Reference reference;
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (true) {
            if (it2.hasNext()) {
                reference = (Reference) it2.next();
                Object obj = reference.get();
                if (obj == null) {
                    it2.remove();
                    this.LLILZ.remove(reference);
                } else if (Intrinsics.LJFF(obj, interfaceC1508310pLx)) {
                    it2.remove();
                    break;
                }
            } else {
                reference = null;
                break;
            }
        }
        if (reference == null) {
            return false;
        }
        ListProtector.add(this.LLILLJJLI, 0, reference);
        return true;
    }

    public final void LJI(InterfaceC1508310pLx interfaceC1508310pLx) {
        Boolean bool;
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            Reference reference = (Reference) it2.next();
            InterfaceC1508310pLx interfaceC1508310pLx2 = (InterfaceC1508310pLx) reference.get();
            if (interfaceC1508310pLx2 == null) {
                it2.remove();
                this.LLILZ.remove(reference);
            } else if (Intrinsics.LJFF(interfaceC1508310pLx2, interfaceC1508310pLx)) {
                continue;
            } else {
                C1508300pLw c1508300pLw = (C1508300pLw) ((LinkedHashMap) this.LLILZ).get(LIZIZ(interfaceC1508310pLx2));
                if (c1508300pLw != null) {
                    bool = c1508300pLw.LIZ;
                } else {
                    bool = null;
                }
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    LJFF(interfaceC1508310pLx2);
                    if (interfaceC1508310pLx2.LLLLZLLIL()) {
                        interfaceC1508310pLx2.w4(false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.ISeaPdpMediaControlService
    public final void oI(boolean z) {
        this.LLILLL = z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.ISeaPdpMediaControlService
    public final void oU(EnumC1486810onH enumC1486810onH) {
        this.LL = enumC1486810onH;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.ISeaPdpMediaControlService
    public final void MC2(InterfaceC1508310pLx interfaceC1508310pLx, boolean z, EnumC1308950kAP enumC1308950kAP) {
        uE0(interfaceC1508310pLx, Boolean.valueOf(z), null, enumC1308950kAP);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.ISeaPdpMediaControlService
    public final void Zk1(InterfaceC1508310pLx interfaceC1508310pLx, boolean z, EnumC1308950kAP enumC1308950kAP) {
        uE0(interfaceC1508310pLx, null, Boolean.valueOf(z), enumC1308950kAP);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.ISeaPdpMediaControlService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uE0(X.InterfaceC1508310pLx r14, java.lang.Boolean r15, java.lang.Boolean r16, X.EnumC1308950kAP r17) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.SeaPdpMediaControlService.uE0(X.0pLx, java.lang.Boolean, java.lang.Boolean, X.0kAP):void");
    }
}
