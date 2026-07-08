package com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting;

import X.C0OJ0;
import X.C1220000hqw;
import X.C13LE;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C617230OIv;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS144S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSettingEditCell extends PowerCell<C617230OIv> {
    public final C736950SvV LL;
    public TuxTextView LLILLJJLI;
    public boolean LLILLL;
    public C0OJ0 LLILZ;

    public BulletinSettingEditCell() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 802);
        this.LL = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(334), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        int i;
        String string;
        C617230OIv c617230OIv = (C617230OIv) interfaceC1891350zJl;
        super.onBindItemView(c617230OIv);
        this.LLILZ = c617230OIv.LLILZ;
        View view = this.itemView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zo);
        C0OJ0 c0oj0 = this.LLILZ;
        Float fValueOf4 = null;
        if (c0oj0 != null) {
            fValueOf = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj0.LIZ)));
        } else {
            fValueOf = null;
        }
        c384050F3z.LJIIIIZZ = fValueOf;
        C0OJ0 c0oj02 = this.LLILZ;
        if (c0oj02 != null) {
            fValueOf2 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj02.LIZIZ)));
        } else {
            fValueOf2 = null;
        }
        c384050F3z.LJIIIZ = fValueOf2;
        C0OJ0 c0oj03 = this.LLILZ;
        if (c0oj03 != null) {
            fValueOf3 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj03.LIZJ)));
        } else {
            fValueOf3 = null;
        }
        c384050F3z.LJIIJ = fValueOf3;
        C0OJ0 c0oj04 = this.LLILZ;
        if (c0oj04 != null) {
            fValueOf4 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj04.LIZLLL)));
        }
        c384050F3z.LJIIJJI = fValueOf4;
        view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            Context context = getContext();
            if (context == null || (string = context.getString(2131828099)) == null) {
                string = "";
            }
            tuxTextView.setText(string);
        }
        View view2 = this.itemView;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS144S0100000_9(this, 21), view2);
        }
        Long l = c617230OIv.LL;
        boolean z = false;
        if (l != null && l.longValue() > 0) {
            l.longValue();
            z = true;
        }
        this.LLILLL = z;
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            if (z) {
                i = R.attr.a1h;
            } else {
                i = R.attr.a1p;
            }
            tuxTextView2.setTextColorRes(i);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a8j, viewGroup, false);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.xrk);
        return viewTd;
    }
}
