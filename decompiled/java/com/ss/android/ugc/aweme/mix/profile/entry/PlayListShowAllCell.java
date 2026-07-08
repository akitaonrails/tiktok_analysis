package com.ss.android.ugc.aweme.mix.profile.entry;

import X.C1168030gV7;
import X.C1169160gWw;
import X.C20684815ws;
import X.C2344009Gk;
import X.C2532609wC;
import X.C2537109wv;
import X.C268330AfP;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;

/* JADX INFO: loaded from: classes5.dex */
public final class PlayListShowAllCell extends PowerCell<C1168030gV7> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        C1168030gV7 item = getItem();
        String str = item != null ? item.LLILZ : null;
        c1169160gWw.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("show_all_playlist_entrance", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1168030gV7 c1168030gV7 = (C1168030gV7) interfaceC1891350zJl;
        this.itemView.setBackground(new ColorDrawable(0));
        if (C2537109wv.LJIIIZ()) {
            ((TuxTextView) this.itemView.findViewById(R.id.v9u)).setTuxFont(62);
            if (C268330AfP.LJI()) {
                this.itemView.getLayoutParams().height = -1;
                ((LinearLayout) this.itemView).setGravity(16);
                this.itemView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                C426750GoL.LJIIIZ(this.itemView, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), false, 16);
            } else if (C2532609wC.LIZJ()) {
                this.itemView.setPadding(0, 0, 0, 0);
            } else {
                this.itemView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            }
        }
        C786410Ut5.I7(new AkS57S0200000_18(c1168030gV7, this, 27), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eer, viewGroup, false);
    }
}
