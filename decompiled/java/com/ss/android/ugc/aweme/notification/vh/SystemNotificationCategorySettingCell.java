package com.ss.android.ugc.aweme.notification.vh;

import X.C0P4Q;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C1954807lC;
import X.C635320Ovy;
import X.C635420Ow8;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes10.dex */
public final class SystemNotificationCategorySettingCell extends PowerCell<C635420Ow8> {
    public C127K LL;
    public C127A LLILLJJLI;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(X.C635420Ow8 r5) {
        /*
            r4 = this;
            X.127A r3 = r4.LLILLJJLI
            r2 = 0
            if (r3 == 0) goto L11
            com.ss.android.ugc.aweme.notice.repo.list.bean.CategorySetting r0 = r5.LLILLL
            if (r0 == 0) goto L19
            boolean r1 = r0.isSubscribe
            r0 = 1
            if (r1 != r0) goto L19
        Le:
            r3.LJIILJJIL(r0)
        L11:
            X.127A r0 = r4.LLILLJJLI
            if (r0 == 0) goto L18
            r0.LJIIJJI(r2)
        L18:
            return
        L19:
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.vh.SystemNotificationCategorySettingCell.I5(X.0Ow8):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C127K c127k;
        C635420Ow8 c635420Ow8 = (C635420Ow8) interfaceC1891350zJl;
        super.onBindItemView(c635420Ow8);
        Context context = getContext();
        if (context != null) {
            int i2 = C635320Ovy.LIZ[c635420Ow8.LLILLJJLI.ordinal()];
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
            this.itemView.setBackground(C800330VaR.LIZIZ(context, i));
            C127K c127k2 = this.LL;
            if (c127k2 != null) {
                c127k2.setTitle(c635420Ow8.LLILLL.labelTitle);
            }
            UrlModel urlModel = c635420Ow8.LLILLL.icon;
            if (urlModel != null && (c127k = this.LL) != null) {
                c127k.setIcon(new AwS581S0100000_2(urlModel, 276));
            }
            C127A c127a = this.LLILLJJLI;
            if (c127a != null) {
                c127a.LJIILLIIL(null);
                I5(c635420Ow8);
                c127a.LJIILLIIL(new C0P4Q(this, c635420Ow8, c127a, 0));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C127M accessory;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.abb, viewGroup, false);
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
}
