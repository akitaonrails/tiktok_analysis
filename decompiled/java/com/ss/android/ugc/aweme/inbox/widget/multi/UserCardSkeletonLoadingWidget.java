package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.C002J;
import X.C01GW;
import X.C1262040iwk;
import X.C1262050iwl;
import X.C1262090iwp;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C1697810uHb;
import X.C1889270zGP;
import X.C1889290zGR;
import X.C23250099c;
import X.C452501pT;
import X.InterfaceC1891350zJl;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class UserCardSkeletonLoadingWidget extends InboxWidget {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 267));

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        return C1697810uHb.LJIIJJI(new C1262040iwk(new C1262050iwl(2131836020, R.attr.a1h, 43, 0, 0, 0, 0, 0, false, null, false, 8184), new C1262090iwp(0), "new_followers", "notification_page"), new InterfaceC1891350zJl() { // from class: X.002J
            public final boolean LL = true;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C002J) && this.LL == ((C002J) obj).LL;
            }

            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return null;
            }

            public final int hashCode() {
                return C786410Ut5.Z2(this.LL);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UserCardSkeletonLoadingItem(isLoading=");
                sbLIZ.append(this.LL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                if ((interfaceC1891350zJl instanceof C002J) && ((C002J) interfaceC1891350zJl).LL == this.LL) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        return C1697810uHb.LJIIJJI(C13LE.LIZ(C1262040iwk.class), C13LE.LIZ(C002J.class));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends PowerCell<?>>> fo() {
        ArrayList arrayList = new ArrayList(C13BV.INSTANCE);
        arrayList.add(C13LE.LIZ(UserCardSkeletonLoadingCell.class));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1889290zGR(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1889270zGP(this, null), 3);
    }
}
