package com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting;

import X.AnonymousClass1278;
import X.C0OSB;
import X.C0P4H;
import X.C127K;
import X.C127M;
import X.C1877307Wx;
import X.C384050F3z;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSettingRadioCell extends PowerCell<C1877307Wx> {
    public C127K LL;
    public AnonymousClass1278 LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        View viewFindViewById;
        View viewFindViewById2;
        C1877307Wx c1877307Wx = (C1877307Wx) interfaceC1891350zJl;
        super.onBindItemView(c1877307Wx);
        C127K c127k = this.LL;
        if (c127k != null) {
            c1877307Wx.getClass();
            c127k.setTitle(null);
        }
        C127K c127k2 = this.LL;
        if (c127k2 != null) {
            c1877307Wx.getClass();
            c127k2.setSubtitle(null);
        }
        AnonymousClass1278 anonymousClass1278 = this.LLILLJJLI;
        if (anonymousClass1278 != null) {
            c1877307Wx.getClass();
            anonymousClass1278.LJIILJJIL(false);
        }
        AnonymousClass1278 anonymousClass12782 = this.LLILLJJLI;
        if (anonymousClass12782 != null) {
            anonymousClass12782.LJIIJJI(false);
        }
        AnonymousClass1278 anonymousClass12783 = this.LLILLJJLI;
        if (anonymousClass12783 != null) {
            anonymousClass12783.LJIILLIIL(new C0P4H(c1877307Wx, this, 1));
        }
        c1877307Wx.getClass();
        C127K c127k3 = this.LL;
        if (c127k3 != null && (viewFindViewById2 = c127k3.findViewById(R.id.dlh)) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            getItem();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zo);
            c384050F3z.LJIIIIZZ = null;
            c384050F3z.LJIIIZ = null;
            c384050F3z.LJIIJ = null;
            c384050F3z.LJIIJJI = null;
            viewFindViewById2.setBackground(c384050F3z.LIZ(viewFindViewById2.getContext()));
        }
        C127K c127k4 = this.LL;
        if (c127k4 != null && (viewFindViewById = c127k4.findViewById(R.id.dlh)) != null) {
            C0OSB.LIZLLL(viewFindViewById, 0, 0, 0, 0);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C127M accessory;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a8b, viewGroup, false);
        C127K c127k = (C127K) viewTd.findViewById(R.id.txCell);
        this.LL = c127k;
        AnonymousClass1278 anonymousClass1278 = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof AnonymousClass1278) {
            anonymousClass1278 = (AnonymousClass1278) accessory;
        }
        this.LLILLJJLI = anonymousClass1278;
        return viewTd;
    }
}
