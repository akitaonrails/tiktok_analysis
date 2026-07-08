package com.ss.android.ugc.aweme.notification.common.bar;

import X.C1246430iXZ;
import X.C1246440iXa;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS154S0100000_19;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class NotificationTabBarCell extends PowerCell<C1246430iXZ> {
    public TuxTextView LL;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5() {
        /*
            r4 = this;
            com.bytedance.tux.input.TuxTextView r3 = r4.LL
            r2 = 1
            if (r3 == 0) goto L27
            X.0zJl r0 = r4.getItem()
            X.0iXZ r0 = (X.C1246430iXZ) r0
            if (r0 == 0) goto L42
            boolean r0 = r0.LLILZ
            if (r0 != r2) goto L42
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L56
            r0 = 2131099662(0x7f06000e, float:1.7811684E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L56
            int r0 = r0.intValue()
        L24:
            r3.setTextColor(r0)
        L27:
            com.bytedance.tux.input.TuxTextView r1 = r4.LL
            if (r1 == 0) goto L3d
            X.0zJl r0 = r4.getItem()
            X.0iXZ r0 = (X.C1246430iXZ) r0
            if (r0 == 0) goto L3e
            boolean r0 = r0.LLILZ
            if (r0 != r2) goto L3e
            r0 = 2130969780(0x7f0404b4, float:1.7548252E38)
        L3a:
            r1.setBackgroundResource(r0)
        L3d:
            return
        L3e:
            r0 = 2130969748(0x7f040494, float:1.7548187E38)
            goto L3a
        L42:
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L56
            r0 = 2131100622(0x7f0603ce, float:1.781363E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L56
            int r0 = r0.intValue()
            goto L24
        L56:
            r0 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.common.bar.NotificationTabBarCell.I5():void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        Function2<String, Function0<Unit>, Unit> function2;
        NoticeChannelInfo noticeChannelInfo;
        super.onViewAttachedToWindow();
        C1246430iXZ item = getItem();
        if (item == null || (function2 = item.LLILZIL) == null) {
            return;
        }
        C1246430iXZ item2 = getItem();
        function2.invoke((item2 == null || (noticeChannelInfo = item2.LLILLJJLI) == null) ? null : noticeChannelInfo.accountType, new AwS563S0100000_19(this, 1625));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        super.onBindItemView(interfaceC1891350zJl);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            C1246430iXZ item = getItem();
            if (item != null) {
                str = item.LLILLL;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        I5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(8388611);
        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
        tuxTextView.setTuxFont(62);
        C786410Ut5.h9(tuxTextView, new ACListenerS154S0100000_19(this, 121));
        this.LL = tuxTextView;
        return tuxTextView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        String str;
        Object next;
        C1246440iXa c1246440iXa;
        TuxTextView tuxTextView;
        super.onBindItemView(interfaceC1891350zJl, list);
        Iterator it2 = list.iterator();
        while (true) {
            str = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C1246440iXa) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if ((next instanceof C1246440iXa) && (c1246440iXa = (C1246440iXa) next) != null) {
            if (c1246440iXa.LIZ && (tuxTextView = this.LL) != null) {
                C1246430iXZ item = getItem();
                if (item != null) {
                    str = item.LLILLL;
                }
                tuxTextView.setText(str);
            }
            if (c1246440iXa.LIZIZ) {
                I5();
            }
        }
    }
}
