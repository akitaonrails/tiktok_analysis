package com.ss.android.ugc.aweme.comment.photocomment;

import X.C1344550l5p;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1875607Wg;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C294290BgB;
import X.C341940Daq;
import X.C419910GdJ;
import X.C726120Se2;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS155S0100000_21;
import Y.AfS190S0100000_21;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentInnerAddPhotoAssem extends ReusedUIContentAssem<CommentInnerAddPhotoAssem> implements InterfaceC712990Rxx<C1875607Wg> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C726120Se2 LLJJJJ = new C726120Se2();
    public boolean LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentInnerAddPhotoAssem.class, "outContextSource", "getOutContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TextView textView;
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        if (C294290BgB.LIZJ()) {
            LJJIJL().setBackgroundResource(R.drawable.aeq);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(C20642515q3.LJI(2131844931));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_plus_small;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZJ = C341940Daq.LIZ(16.0d);
        c419910GdJ.LIZIZ = C341940Daq.LIZ(16.0d);
        C786410Ut5.q2(spannableStringBuilder, c419910GdJ.LIZIZ(2, LJJIJL().getContext()), 0, 1, 18);
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof TuxTextView) && (textView = (TextView) viewLJJIJL) != null) {
            textView.setText(spannableStringBuilder);
        }
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 31), LJJIJL());
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1344550l5p.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZ(new AfS190S0100000_21(this, 7));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1875607Wg c1875607Wg) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C1875607Wg c1875607Wg) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1875607Wg c1875607Wg) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
