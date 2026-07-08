package com.ss.android.ugc.aweme.notification.vh;

import X.C0P4I;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C1954807lC;
import X.C419910GdJ;
import X.C635290Ovv;
import X.C635300Ovw;
import X.C635310Ovx;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class SystemNotificationInnerSwitchCell extends PowerCell<C635290Ovv> {
    public C127K LL;
    public C127A LLILLJJLI;
    public C635290Ovv LLILLL;

    public final void I5() {
        InboxEntranceFunction inboxEntranceFunction;
        C127A c127a = this.LLILLJJLI;
        if (c127a != null) {
            C635290Ovv c635290Ovv = this.LLILLL;
            c127a.LJIILJJIL(!((c635290Ovv == null || (inboxEntranceFunction = c635290Ovv.LLILLL) == null || inboxEntranceFunction.actionStatus != 0) ? false : true));
        }
        C127A c127a2 = this.LLILLJJLI;
        if (c127a2 != null) {
            c127a2.LJIIJJI(false);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C127M accessory;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ab7, viewGroup, false);
        C127K c127k = (C127K) viewTd.findViewById(R.id.txCell);
        this.LL = c127k;
        C127A c127a = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C127A) {
            c127a = (C127A) accessory;
        }
        this.LLILLJJLI = c127a;
        return viewTd;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        InboxEntranceFunction inboxEntranceFunction;
        int i;
        C635290Ovv c635290Ovv = (C635290Ovv) interfaceC1891350zJl;
        super.onBindItemView(c635290Ovv, list);
        Context context = getContext();
        if (context != null && (inboxEntranceFunction = c635290Ovv.LLILLL) != null) {
            this.LLILLL = c635290Ovv;
            if (list.isEmpty()) {
                View view = this.itemView;
                int i2 = C635310Ovx.LIZ[c635290Ovv.LL.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                i = R.drawable.ah_;
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            i = R.drawable.ah8;
                        }
                    } else {
                        i = R.drawable.ah9;
                    }
                } else {
                    i = R.drawable.f629aha;
                }
                view.setBackground(C800330VaR.LIZIZ(context, i));
                C127K c127k = this.LL;
                if (c127k != null) {
                    if (c635290Ovv.LLILLJJLI != 0) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = c635290Ovv.LLILLJJLI;
                        c127k.setIcon(c419910GdJ);
                    }
                    c127k.setTitle(inboxEntranceFunction.name);
                    I5();
                    C127A c127a = this.LLILLJJLI;
                    if (c127a != null) {
                        c127a.LJIILLIIL(new C0P4I(this, c635290Ovv, inboxEntranceFunction, c127k, 1));
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(ListProtector.get(list, 0) instanceof C635300Ovw)) {
                return;
            }
            I5();
        }
    }
}
