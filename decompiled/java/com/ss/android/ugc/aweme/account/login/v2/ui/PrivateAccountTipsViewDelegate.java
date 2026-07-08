package com.ss.android.ugc.aweme.account.login.v2.ui;

import X.C09JN;
import X.C0X2A;
import X.C11S5;
import X.C1701940uOG;
import X.C197039127h;
import X.C20684815ws;
import X.C2214201BlK;
import X.C2344009Gk;
import X.C341020DYm;
import X.C346210Dhj;
import X.C446980Hfs;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC327090Crz;
import X.InterfaceC341040DYo;
import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class PrivateAccountTipsViewDelegate implements IPrivateAccountTipsView {
    public C341020DYm LIZ;

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onDestroyView() {
        this.LIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onResume() {
        this.LIZ.LIZJ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onStop() {
        if (C2214201BlK.LJIIJJI) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("result", "background");
            c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LIZ.LIZJ, "stay_time");
            C20684815ws.LJIILLIIL("private_notify_exit", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onCreate(Bundle bundle) {
        if (bundle == null) {
            C20684815ws.onEventV3("private_notify_show");
        }
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void LIZIZ(View view, InterfaceC341040DYo interfaceC341040DYo) {
        C341020DYm c341020DYm = new C341020DYm(view, interfaceC341040DYo);
        this.LIZ = c341020DYm;
        C786410Ut5.U8((C197039127h) view.findViewById(R.id.iv1), new ACListenerS139S0100000_4(c341020DYm, 7));
        Context context = view.getContext();
        String string = context.getString(2131836492);
        int i = 0;
        String string2 = context.getString(2131830585, string);
        SpannableString spannableString = new SpannableString(string2);
        int iLJJJ = a0.LJJJ(string2, string, 0, false, 6);
        C786410Ut5.p2(spannableString, new C346210Dhj(C960203pA.LIZ(R.attr.a1h, context), context, 0), iLJJJ, string.length() + iLJJJ, 34);
        TextView textView = (TextView) view.findViewById(R.id.xz1);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
        textView.setHighlightColor(C446980Hfs.LIZ(context, R.color.dr));
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.xz8);
        if (!Intrinsics.LJFF(C0X2A.LIZJ.toLowerCase(Locale.ROOT), "fr")) {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
        ((InterfaceC327090Crz) c341020DYm.LIZLLL.getValue()).LIZ("minor_private_policy_status", CardStruct.IStatusCode.DEFAULT).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.00NP
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PrivateAccountView@8628.onViewCreated$4");
                C1C7U.LIZIZ("PrivateAccountView@8628.onViewCreated$4");
            }
        }, new C09JN() { // from class: X.00Jt
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PrivateAccountView@8628.onViewCreated$5");
                ((Throwable) obj).getMessage();
                C1C7U.LIZIZ("PrivateAccountView@8628.onViewCreated$5");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final View LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.f866yd, viewGroup, false);
    }
}
