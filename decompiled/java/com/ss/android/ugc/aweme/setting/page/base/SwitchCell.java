package com.ss.android.ugc.aweme.setting.page.base;

import X.C127A;
import X.C127K;
import X.C127M;
import X.C1308910kAL;
import X.C1388190mED;
import X.C20334214hQ;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public abstract class SwitchCell<T extends C20334214hQ> extends PowerCell<T> implements View.OnClickListener {
    public Activity LL;
    public C127K LLILLJJLI;
    public C127A LLILLL;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public final void L5() {
        T item;
        C127A c127a;
        if (this.LLILLJJLI == null || (item = getItem()) == null || (c127a = this.LLILLL) == null) {
            return;
        }
        boolean zLJIILIIL = c127a.LJIILIIL();
        boolean z = item.LLILLL;
        if (zLJIILIIL != z) {
            c127a.LJIILJJIL(z);
        }
    }

    public void N5() {
        T item;
        C127K c127k = this.LLILLJJLI;
        if (c127k == null || (item = getItem()) == null || item.LLILLJJLI == -1) {
            return;
        }
        c127k.setSubtitle(c127k.getContext().getText(item.LLILLJJLI));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: I5 */
    public void onBindItemView(T t) {
        C127K c127k;
        C127M accessory;
        T item;
        View view = this.itemView;
        C127A c127a = null;
        if (view instanceof C127K) {
            c127k = (C127K) view;
        } else {
            c127k = null;
        }
        this.LLILLJJLI = c127k;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C127A) {
            c127a = (C127A) accessory;
        }
        this.LLILLL = c127a;
        L5();
        N5();
        C127K c127k2 = this.LLILLJJLI;
        if (c127k2 != null && (item = getItem()) != null && item.LL != -1) {
            c127k2.setTitle(c127k2.getContext().getText(item.LL));
        }
        C127A c127a2 = this.LLILLL;
        if (c127a2 != null) {
            c127a2.LJIILL(new AwS575S0100000_31(this, (SwitchCell<C20334214hQ>) 1539));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        this.LL = C1388190mED.LIZ(viewGroup.getContext());
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f6c, viewGroup, false);
        C426750GoL.LJIIIZ(viewTd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 26);
        viewTd.setBackgroundColor(C1308910kAL.LIZJ(R.attr.zq, viewTd.getContext()).intValue());
        return viewTd;
    }
}
