package com.ss.android.ugc.aweme.setting.page.base;

import X.C11G4;
import X.C127K;
import X.C127M;
import X.C1308910kAL;
import X.C1388190mED;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.C848730XRf;
import X.InterfaceC1891350zJl;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public abstract class RightIconCell<T extends C848730XRf> extends PowerCell<T> implements View.OnClickListener {
    public static final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    public Activity LL;
    public C127K LLILLJJLI;
    public C11G4 LLILLL;
    public TuxIconView LLILZ;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public final void I5() {
        int i;
        Activity activity;
        if (this.LLILZ == null && (activity = this.LL) != null) {
            TuxIconView tuxIconView = new TuxIconView(activity, null, 0, 6, null);
            int i2 = LLILZIL;
            tuxIconView.setIconWidth(i2);
            tuxIconView.setIconHeight(i2);
            this.LLILZ = tuxIconView;
        }
        C11G4 c11g4 = this.LLILLL;
        if (c11g4 != null) {
            TuxIconView tuxIconView2 = this.LLILZ;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                c11g4.LJIILIIL(tuxIconView2);
                c11g4.LJIILLIIL(false);
                T item = getItem();
                if (item != null && (i = item.LLILLJJLI) != -1 && item.LLILLL != -1) {
                    tuxIconView2.setIconRes(i);
                    tuxIconView2.setTintColorRes(item.LLILLL);
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                }
            }
            c11g4.LJIILLIIL(true);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C127K c127k;
        C127M accessory;
        boolean z;
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
        if (c127k2 != null && (item2 = getItem()) != null && item2.LLILZ != -1) {
            c127k2.setSubtitle(c127k2.getContext().getText(item2.LLILZ));
        }
        C127K c127k3 = this.LLILLJJLI;
        if (c127k3 != null && (item = getItem()) != null && item.LL != -1) {
            c127k3.setTitle(c127k3.getContext().getText(item.LL));
        }
        C127K c127k4 = this.LLILLJJLI;
        if (c127k4 != null) {
            T item3 = getItem();
            if (item3 != null) {
                z = item3.LLILZIL;
            } else {
                z = false;
            }
            c127k4.setShowAlertBadge(z);
        }
        C11G4 c11g42 = this.LLILLL;
        if (c11g42 != null) {
            c11g42.LJIILL(this);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        this.LL = C1388190mED.LIZ(viewGroup.getContext());
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f6a, viewGroup, false);
        C426750GoL.LJIIIZ(viewTd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 26);
        viewTd.setBackgroundColor(C1308910kAL.LIZJ(R.attr.zq, viewTd.getContext()).intValue());
        return viewTd;
    }
}
