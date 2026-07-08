package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C098200Yq;
import X.C0D6M;
import X.C0D6N;
import X.C0D6O;
import X.C189200o6;
import X.C1954807lC;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.r;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderState;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderStateAdapter implements r<OrderState>, j<OrderState> {
    static {
        new OrderStateAdapter();
    }

    public static OrderPendingState LIZIZ(n nVar, TreeTypeAdapter.a aVar) {
        Object c098200Yq;
        k kVarLJJIIZ = nVar.LJJIIZ("pendingState");
        if (kVarLJJIIZ != null) {
            Object obj = null;
            if (!(kVarLJJIIZ instanceof m)) {
                if (aVar == null) {
                    c098200Yq = null;
                } else {
                    try {
                        c098200Yq = (OrderPendingState) aVar.LIZ(kVarLJJIIZ, OrderPendingState.class);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                }
                C189200o6.m2constructorimpl(c098200Yq);
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                OrderPendingState orderPendingState = (OrderPendingState) obj;
                if (orderPendingState == null) {
                    return OrderPendingState.SYNCING;
                }
                return orderPendingState;
            }
        }
        return OrderPendingState.SYNCING;
    }

    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        k kVarLIZJ;
        OrderState orderState = (OrderState) obj;
        n nVar = new n();
        if (orderState == null) {
            nVar.LJJIIJ("type", "incomplete");
        } else {
            if (Intrinsics.LJFF(orderState, C0D6M.INSTANCE)) {
                nVar.LJJIIJ("type", "incomplete");
                return nVar;
            }
            if (orderState instanceof OrderState.Pending) {
                nVar.LJJIIJ("type", "pending");
                if (aVar != null && (kVarLIZJ = aVar.LIZJ(((OrderState.Pending) orderState).getPendingState(), OrderPendingState.class)) != null) {
                    nVar.LJJIFFI("pendingState", kVarLIZJ);
                    return nVar;
                }
            } else {
                if (Intrinsics.LJFF(orderState, C0D6O.INSTANCE)) {
                    nVar.LJJIIJ("type", "synced");
                    return nVar;
                }
                if (Intrinsics.LJFF(orderState, C0D6N.INSTANCE)) {
                    nVar.LJJIIJ("type", "server_verified");
                    return nVar;
                }
                throw new C1954807lC();
            }
        }
        return nVar;
    }

    @Override // com.google.gson.j
    public final OrderState deserialize(k kVar, Type type, i iVar) {
        String string;
        String strLJIL;
        if ((kVar instanceof n) && kVar != null) {
            n nVarLJIILIIL = kVar.LJIILIIL();
            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("type");
            if (kVarLJJIIZ == null || (strLJIL = kVarLJJIIZ.LJIL()) == null || (string = a0.LJLIIIL(strLJIL).toString()) == null) {
                string = "";
            }
            if (u.LJIJI(string, "pending", true)) {
                return new OrderState.Pending(LIZIZ(nVarLJIILIIL, (TreeTypeAdapter.a) iVar));
            }
            if (u.LJIJI(string, "synced", true)) {
                return C0D6O.INSTANCE;
            }
            if (!u.LJIJI(string, "server_verified", true) && !u.LJIJI(string, "serverVerified", true)) {
                if (!u.LJIJI(string, "incomplete", true) && !u.LJIJI(string, "inComplete", true)) {
                    if (nVarLJIILIIL.LJJIJIIJIL("pendingState")) {
                        return new OrderState.Pending(LIZIZ(nVarLJIILIIL, (TreeTypeAdapter.a) iVar));
                    }
                    return C0D6M.INSTANCE;
                }
                return C0D6M.INSTANCE;
            }
            return C0D6N.INSTANCE;
        }
        return C0D6M.INSTANCE;
    }
}
