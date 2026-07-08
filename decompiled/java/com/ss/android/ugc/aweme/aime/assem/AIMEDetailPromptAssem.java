package com.ss.android.ugc.aweme.aime.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aime.AIMEDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AIMEDetailPromptAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public TuxTextView LLJJIII;
    public Fragment LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AIMEDetailPromptAssem.class, "aimeDetailVM", "getAimeDetailVM()Lcom/ss/android/ugc/aweme/aime/AIMEDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AIMEDetailPromptAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AIMEDetailViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 58), AFwS240S0000000_9.get$arr$(54), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ftn;
    }

    public final AIMEDetailViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (AIMEDetailViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ConstraintLayout constraintLayout;
        mo127do();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null) {
            return;
        }
        this.LLJJIJI = fragmentLJI;
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.sd2);
        if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
            C786410Ut5.Y7(constraintLayout, new ACListenerS144S0100000_9(this, 24));
        }
        AssemViewModel.asyncSubscribe$default(lp(), new C2217381BqS() { // from class: X.0OjD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C615700OCy) obj).LL;
            }
        }, null, null, null, new AwS375S0200000_9(this, view, 19), 14, null);
    }
}
