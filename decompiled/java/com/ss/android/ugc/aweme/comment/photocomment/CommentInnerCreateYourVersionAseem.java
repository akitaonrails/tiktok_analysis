package com.ss.android.ugc.aweme.comment.photocomment;

import X.C01GW;
import X.C1344550l5p;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C1875607Wg;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C294290BgB;
import X.C341940Daq;
import X.C419910GdJ;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C726120Se2;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS155S0100000_21;
import Y.AfS190S0100000_21;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S0600000_19;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentInnerCreateYourVersionAseem extends ReusedUIContentAssem<CommentInnerCreateYourVersionAseem> implements InterfaceC712990Rxx<C1875607Wg> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C726120Se2 LLJJJJ = new C726120Se2();
    public boolean LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentInnerCreateYourVersionAseem.class, "outContextSource", "getOutContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommentInnerCreateYourVersionAseem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 50));
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final CommentContextSource cp() {
        C726120Se2 c726120Se2 = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return c726120Se2.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        String string;
        TextView textView;
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        if (C294290BgB.LIZJ()) {
            LJJIJL().setBackgroundResource(R.drawable.aeq);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        Context context = getContext();
        if (context != null) {
            string = context.getString(2131837125);
        } else {
            string = null;
        }
        sbLIZ.append(string);
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
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 32), LJJIJL());
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1344550l5p.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZ(new AfS190S0100000_21(this, 9));
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
