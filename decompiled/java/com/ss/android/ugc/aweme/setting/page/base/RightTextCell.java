package com.ss.android.ugc.aweme.setting.page.base;

import X.C1069520dwE;
import X.C11G4;
import X.C127K;
import X.C127M;
import X.C1308910kAL;
import X.C1388190mED;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public abstract class RightTextCell<T extends C1069520dwE> extends PowerCell<T> implements View.OnClickListener {
    public Activity LL;
    public C127K LLILLJJLI;
    public C11G4 LLILLL;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public final void I5() {
        C11G4 c11g4;
        C127K c127k = this.LLILLJJLI;
        if (c127k != null) {
            T item = getItem();
            if (item != null && item.LLILLJJLI != -1 && (c11g4 = this.LLILLL) != null) {
                c11g4.LJIILJJIL(c127k.getContext().getText(item.LLILLJJLI));
            }
            C11G4 c11g42 = this.LLILLL;
            if (c11g42 != null) {
                c11g42.LJIILLIIL(true);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C127K c127k;
        C127M accessory;
        T item;
        T item2;
        View view = this.itemView;
        C11G4 c11g4 = null;
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
        if (accessory instanceof C11G4) {
            c11g4 = (C11G4) accessory;
        }
        this.LLILLL = c11g4;
        I5();
        C127K c127k2 = this.LLILLJJLI;
        if (c127k2 != null && (item2 = getItem()) != null && item2.LLILLL != -1) {
            c127k2.setSubtitle(c127k2.getContext().getText(item2.LLILLL));
        }
        C127K c127k3 = this.LLILLJJLI;
        if (c127k3 != null && (item = getItem()) != null && item.LL != -1) {
            c127k3.setTitle(c127k3.getContext().getText(item.LL));
        }
        C11G4 c11g42 = this.LLILLL;
        if (c11g42 != null) {
            c11g42.LJIILL(this);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        this.LL = C1388190mED.LIZ(viewGroup.getContext());
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f6b, viewGroup, false);
        C426750GoL.LJIIIZ(viewTd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 26);
        viewTd.setBackgroundColor(C1308910kAL.LIZJ(R.attr.zq, viewTd.getContext()).intValue());
        return viewTd;
    }
}
