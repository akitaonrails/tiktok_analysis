package com.ss.android.ugc.aweme.prop.mobileefffect.edit;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import wh6.AbS686S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class EffectEditIconAutoGenTipAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public TuxTextView LLJJIII;
    public ConstraintLayout LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectEditIconAutoGenTipAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/prop/mobileefffect/edit/EffectEditV2VM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EffectEditIconAutoGenTipAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectEditV2VM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 752), AFwS229S0000000_2.get$arr$(467), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.rf;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.dyj);
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        } else {
            constraintLayout = null;
        }
        this.LLJJIJI = constraintLayout;
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.tv_tip);
        View viewFindViewById = view.findViewById(R.id.lc0);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS686S0100000_2(this, 10), viewFindViewById);
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06VV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736840vIY) obj).LLJJJJJIL;
            }
        }, C736820SvI.LJ(), new AwS616S0100000_2(this, 58), 4);
    }
}
