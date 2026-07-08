package com.ss.android.ugc.aweme.favorites.business.collection;

import X.AbstractC2211791BhR;
import X.C1308910kAL;
import X.C1875707Wh;
import X.C20684815ws;
import X.C2211751BhN;
import X.C2344009Gk;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS54S0200000_9;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class CollectionRecommendNameCell extends PowerCell<C1875707Wh> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0OjT
            public Function0<String> LJ;
            public final C638890P4d LJFF;

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final InterfaceC2211931Bhf LJFF() {
                return this.LJFF;
            }

            {
                this.LJ = new AwS553S0100000_9(this, 122);
                this.LJFF = new C638890P4d(this, 0);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TextView textView;
        C1875707Wh c1875707Wh = (C1875707Wh) interfaceC1891350zJl;
        View view = this.itemView;
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            textView.setText(c1875707Wh.LL);
        }
        C786410Ut5.I7(new AkS54S0200000_9(this, c1875707Wh, 0), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        Integer numLIZJ;
        Integer numLIZJ2 = null;
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-2, -2));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        Context context = viewGroup.getContext();
        if (context != null) {
            numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, context);
        }
        c384050F3z.LIZ = numLIZJ2;
        tuxTextView.setBackground(c384050F3z.LIZ(viewGroup.getContext()));
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        Context context2 = viewGroup.getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context2)) != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        tuxTextView.setTuxFont(71);
        return tuxTextView;
    }

    public final void I5(String str, String str2) {
        String str3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        C1875707Wh item = getItem();
        if (item != null) {
            str3 = item.LL;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("ai_name", str3);
        c2344009Gk.LIZJ(getBindingAdapterPosition(), "order");
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }
}
