package com.ss.android.ugc.aweme.ui;

import X.C00F9;
import X.C1206880hVm;
import X.C19741112Lp;
import X.C21411818qq;
import X.C786410Ut5;
import Y.ACListenerS121S0200000_18;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationServicePreciseSettingCell extends PowerCell<C00F9> {
    public C21411818qq LL;
    public TuxTextView LLILLJJLI;

    public final void I5() {
        C21411818qq c21411818qq = this.LL;
        if (c21411818qq == null) {
            c21411818qq = null;
        }
        C1206880hVm c1206880hVm = C1206880hVm.LIZ;
        c1206880hVm.getClass();
        c21411818qq.setChecked(C1206880hVm.LIZIZ);
        C21411818qq c21411818qq2 = this.LL;
        if (c21411818qq2 == null) {
            c21411818qq2 = null;
        }
        c1206880hVm.getClass();
        c21411818qq2.setEnabled(C1206880hVm.LIZJ);
        c1206880hVm.getClass();
        CharSequence charSequence = C1206880hVm.LIZLLL;
        if (charSequence != null) {
            TuxTextView tuxTextView = this.LLILLJJLI;
            (tuxTextView != null ? tuxTextView : null).setText(charSequence);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        String string;
        String string2;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dkb, viewGroup, false);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.tv_precise_location_text);
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        Context context = viewGroup.getContext();
        c19741112Lp.getClass();
        C21411818qq c21411818qq = null;
        if (C19741112Lp.LIZLLL(context, "android.permission.ACCESS_FINE_LOCATION")) {
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            Resources resources = viewTd.getResources();
            if (resources != null) {
                string2 = resources.getString(2131844829);
            } else {
                string2 = null;
            }
            tuxTextView.setText(string2);
        } else {
            TuxTextView tuxTextView2 = this.LLILLJJLI;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            Resources resources2 = viewTd.getResources();
            if (resources2 != null) {
                string = resources2.getString(2131844828);
            } else {
                string = null;
            }
            tuxTextView2.setText(string);
        }
        C21411818qq c21411818qq2 = (C21411818qq) viewTd.findViewById(R.id.ylv);
        this.LL = c21411818qq2;
        if (c21411818qq2 != null) {
            c21411818qq = c21411818qq2;
        }
        C786410Ut5.f9(c21411818qq, new ACListenerS121S0200000_18(viewGroup, this, 32));
        return viewTd;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        C1206880hVm c1206880hVm = C1206880hVm.LIZ;
        C21411818qq c21411818qq = this.LL;
        if (c21411818qq == null) {
            c21411818qq = null;
        }
        Context context = c21411818qq.getContext();
        c1206880hVm.getClass();
        C1206880hVm.LIZIZ(context);
        I5();
    }
}
