package com.ss.android.ugc.aweme.mix.profile.entry;

import X.C01GW;
import X.C1308910kAL;
import X.C197039127h;
import X.C2532609wC;
import X.C268330AfP;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C445400HdK;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.ViewTreeObserverOnPreDrawListenerC462840IDa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS580S0100000_1;
import wh6.AbS498S0200000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class PlaylistShowManageCell extends PowerCell<C445400HdK> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(112));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C197039127h c197039127h;
        Integer numLIZJ;
        C445400HdK c445400HdK = (C445400HdK) interfaceC1891350zJl;
        String string = null;
        if (!C268330AfP.LJI() && C2532609wC.LIZJ()) {
            TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.qn4);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_gear;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView.setTuxIcon(c419910GdJ);
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.qn6);
            if (c445400HdK.LLILZIL) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                Context context = getContext();
                if (context != null) {
                    string = context.getString(2131837029);
                }
                tuxTextView.setText(string);
            } else {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        } else {
            C786410Ut5.y3(this.itemView.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC462840IDa(c445400HdK, this, 0));
            View view = this.itemView;
            if ((view instanceof C197039127h) && (c197039127h = (C197039127h) view) != null) {
                c197039127h.setIconTintColorRes(R.attr.a1h);
                c197039127h.setButtonVariant(1);
                if (C268330AfP.LJI() && (numLIZJ = C1308910kAL.LIZJ(R.attr.by, c197039127h.getContext())) != null) {
                    c197039127h.setBackgroundColor(numLIZJ.intValue());
                }
                if (c445400HdK.LLILZIL) {
                    c197039127h.getLayoutParams().width = -2;
                    if (C268330AfP.LJI()) {
                        c197039127h.setButtonSize(1);
                    } else if (((Boolean) this.LL.getValue()).booleanValue()) {
                        C426750GoL.LJIIL(c197039127h, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(7.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(7.5d)))), 16);
                        c197039127h.setButtonSize(1);
                    }
                    c197039127h.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT))));
                    Context context2 = getContext();
                    if (context2 != null) {
                        string = context2.getString(2131837029);
                    }
                    c197039127h.setText(string);
                } else {
                    if (!C268330AfP.LJI()) {
                        if (!((Boolean) this.LL.getValue()).booleanValue()) {
                            c197039127h.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                        } else {
                            ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
                            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                            C426750GoL.LJIIL(c197039127h, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), 16);
                        }
                    } else {
                        c197039127h.setButtonSize(1);
                    }
                    c197039127h.setText("");
                }
                if (C268330AfP.LJI()) {
                    c197039127h.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                    c197039127h.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                    c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_gear_fill));
                    c197039127h.setIconTintColorRes(R.attr.a01);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.uk, c197039127h.getContext());
                    if (numLIZJ2 != null) {
                        c197039127h.setBackgroundColor(numLIZJ2.intValue());
                    }
                    C426750GoL.LJIIL(c197039127h, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), 0, 16);
                    C426750GoL.LJIIIZ(c197039127h, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), false, 16);
                } else if (((Boolean) this.LL.getValue()).booleanValue()) {
                    c197039127h.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                    c197039127h.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                    c197039127h.LJJJJL(new AwS580S0100000_1(c197039127h, 528));
                }
            }
        }
        C786410Ut5.I7(new AbS498S0200000_6(c445400HdK, this, 4), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        int i;
        if (!C268330AfP.LJI() && C2532609wC.LIZJ()) {
            i = R.layout.eeu;
        } else {
            i = R.layout.eet;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
        if (!C268330AfP.LJI() && C2532609wC.LIZJ()) {
            C426750GoL.LJIIIZ(viewTd.findViewById(R.id.qn5), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, false, 16);
        }
        return viewTd;
    }
}
