package com.ss.android.ugc.aweme.tako.botpage.cards.memory;

import X.C00XI;
import X.C01GW;
import X.C1308910kAL;
import X.C13LC;
import X.C1857690yRT;
import X.C1863850ybP;
import X.C2211631BhB;
import X.C384050F3z;
import X.C418440Gaw;
import X.C444890HcV;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoSugAssem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoMemoryHintAssem extends ReusedUISlotAssem<TakoMemoryHintAssem> implements InterfaceC712990Rxx<C00XI> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 225));
    public final C444890HcV LLJL;
    public final C01GW LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fqe;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public TakoMemoryHintAssem() {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(62);
        this.LLJL = c444890HcV;
        this.LLJLIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 224));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C1863850ybP c1863850ybP;
        C13LC<C1863850ybP> c13lcT71;
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.f732joo);
        View viewFindViewById2 = view.findViewById(R.id.jop);
        TextView textView = (TextView) view.findViewById(R.id.fog);
        TextView textView2 = (TextView) view.findViewById(R.id.foh);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1j);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        Drawable drawableLIZ = c384050F3z.LIZ(view.getContext());
        viewFindViewById.setBackground(drawableLIZ);
        viewFindViewById2.setBackground(drawableLIZ);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zr);
        TakoSugAssem.LLLIIL.getClass();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        view.setBackground(c384050F3z2.LIZ(context));
        String string = context.getString(2131849693);
        String strJ4 = C786410Ut5.j4(view.getContext().getString(2131849685), Arrays.copyOf(new Object[]{string}, 1));
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null) {
            c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ();
        } else {
            c1863850ybP = null;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJ4);
        int iLJJJ = a0.LJJJ(spannableStringBuilder, string, 0, false, 6);
        C1857690yRT.LIZJ(spannableStringBuilder, iLJJJ, iLJJJ + string.length(), C1308910kAL.LIZJ(R.attr.a1n, context), this.LLJL.getTypeface(), new AwS396S0200000_30(context, c1863850ybP, 21));
        textView.setText(spannableStringBuilder);
        String string2 = context.getString(2131849694);
        String strJ42 = C786410Ut5.j4(view.getContext().getString(2131849687), Arrays.copyOf(new Object[]{string2}, 1));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strJ42);
        int iLJJJ2 = a0.LJJJ(spannableStringBuilder2, string2, 0, false, 6);
        C1857690yRT.LIZJ(spannableStringBuilder2, iLJJJ2, iLJJJ2 + string2.length(), C1308910kAL.LIZJ(R.attr.a1n, context), this.LLJL.getTypeface(), new AwS609S0100000_30(c1863850ybP, 96));
        textView2.setText(spannableStringBuilder2);
        C2211631BhB.LJ(view, new AwS609S0100000_30(this, 97));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C00XI c00xi) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C00XI c00xi) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C00XI c00xi) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
