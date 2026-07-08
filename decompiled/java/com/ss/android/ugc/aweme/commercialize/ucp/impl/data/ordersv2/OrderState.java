package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C09CS;
import X.C09CT;
import X.C0D6M;
import X.C0D6N;
import X.C0D6O;
import X.C1954807lC;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@C09CS(OrderStateAdapter.class)
public abstract class OrderState implements Serializable {
    public final int rank() {
        if (Intrinsics.LJFF(this, C0D6M.INSTANCE)) {
            return 0;
        }
        if (this instanceof Pending) {
            return 1;
        }
        if (Intrinsics.LJFF(this, C0D6O.INSTANCE)) {
            return 2;
        }
        if (Intrinsics.LJFF(this, C0D6N.INSTANCE)) {
            return 3;
        }
        throw new C1954807lC();
    }

    public static final class Pending extends OrderState {

        @C09CT("pending_state")
        public final OrderPendingState pendingState;

        public final Pending copy(OrderPendingState orderPendingState) {
            return new Pending(orderPendingState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Pending) && this.pendingState == ((Pending) obj).pendingState;
        }

        public int hashCode() {
            OrderPendingState orderPendingState = this.pendingState;
            if (orderPendingState == null) {
                return 0;
            }
            return orderPendingState.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Pending(pendingState=");
            sbLIZ.append(this.pendingState);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final OrderPendingState getPendingState() {
            return this.pendingState;
        }

        public Pending(OrderPendingState orderPendingState) {
            this.pendingState = orderPendingState;
        }
    }
}
