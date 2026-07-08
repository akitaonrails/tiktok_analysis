package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.unreachable;

import X.C031F;
import X.C03XA;
import X.C13LE;
import X.C2217401BqU;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.zhiliaoapp.musically.R;
import g1c.AjS43S0200000_19;

/* JADX INFO: loaded from: classes2.dex */
public final class USUnreachableExpandCell extends ECPowerCell<C031F> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(USUnreachableExpandCell.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C031F c031f = (C031F) interfaceC1891350zJl;
        if (c031f.LL) {
            ((TextView) this.itemView.findViewById(R.id.text)).setText(this.itemView.getContext().getString(2131832962));
            C786410Ut5.Cc((TuxIconView) this.itemView.findViewById(R.id.jxe), -1.0f);
        } else {
            ((TextView) this.itemView.findViewById(R.id.text)).setText(this.itemView.getContext().getString(2131832963));
            C786410Ut5.Cc((TuxIconView) this.itemView.findViewById(R.id.jxe), 1.0f);
        }
        C786410Ut5.I7(new AjS43S0200000_19(this, c031f, 1), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b3h, viewGroup, false);
    }
}
