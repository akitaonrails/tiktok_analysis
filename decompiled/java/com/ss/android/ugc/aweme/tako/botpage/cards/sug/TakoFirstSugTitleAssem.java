package com.ss.android.ugc.aweme.tako.botpage.cards.sug;

import X.C003J;
import X.C01GW;
import X.C0DSB;
import X.C123100dR;
import X.C13LC;
import X.C1852920yJm;
import X.C1863850ybP;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public class TakoFirstSugTitleAssem extends ReusedUISlotAssem<TakoFirstSugTitleAssem> implements InterfaceC712990Rxx<C003J> {
    public ConstraintLayout LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public LinearLayoutCompat LLJLIL;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 764));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fno;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ConstraintLayout constraintLayout;
        if (view instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) view;
        } else {
            constraintLayout = null;
        }
        this.LLJJLIIIJLLLLLLLZ = constraintLayout;
        this.LLJL = (TuxTextView) view.findViewById(R.id.tv_sug_title);
        this.LLJLIL = (LinearLayoutCompat) view.findViewById(R.id.nig);
        C0DSB.LIZIZ(view.findViewById(R.id.lwf));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C003J c003j) {
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Context context = getContext();
        if (context != null) {
            ConstraintLayout constraintLayout = this.LLJJLIIIJLLLLLLLZ;
            if (constraintLayout != null) {
                constraintLayout.setBackground(null);
            }
            ConstraintLayout constraintLayout2 = this.LLJJLIIIJLLLLLLLZ;
            if (constraintLayout2 != null) {
                C426750GoL.LJIIIZ(constraintLayout2, 0, 0, 0, 0, false, 16);
            }
            TuxTextView tuxTextView = this.LLJL;
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(61);
            }
            TuxTextView tuxTextView2 = this.LLJL;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.a1k);
            }
            TuxTextView tuxTextView3 = this.LLJL;
            if (tuxTextView3 != null) {
                C786410Ut5.LJLLLLLL(0, tuxTextView3);
            }
            LinearLayoutCompat linearLayoutCompat = this.LLJLIL;
            if (linearLayoutCompat != null) {
                C426750GoL.LJIIL(linearLayoutCompat, 0, 0, 0, 0, 16);
            }
            TuxTextView tuxTextView4 = this.LLJL;
            if (tuxTextView4 != null) {
                String string = context.getString(2131822432);
                Object[] objArr = new Object[1];
                ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJLILLLLZIIL.getValue();
                if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null && c1863850ybP.LLJJ != 1 && c1863850ybP.LLJJI == 2 && C123100dR.LIZ(c1863850ybP.LLJJIII)) {
                    str = c1863850ybP.LLJJIII;
                } else {
                    str = C1852920yJm.LIZ.botName;
                }
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                tuxTextView4.setText(C786410Ut5.j4(string, Arrays.copyOf(objArr, 1)));
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C003J c003j) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C003J c003j) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
