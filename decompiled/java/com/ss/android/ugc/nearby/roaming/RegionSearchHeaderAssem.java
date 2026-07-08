package com.ss.android.ugc.nearby.roaming;

import X.C019F;
import X.C0I7D;
import X.C1201730hNT;
import X.C1265830j2r;
import X.C1266020j3A;
import X.C13LE;
import X.C1637806bA;
import X.C1749260vca;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS154S0100000_19;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class RegionSearchHeaderAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public C1749260vca LLIZLLLIL;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RegionSearchHeaderAssem.class, "vm", "getVm()Lcom/ss/android/ugc/nearby/roaming/RegionSearchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RegionSearchHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RegionSearchViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1973), AFwS257S0000000_19.get$arr$(343), null, true);
    }

    public final RegionSearchViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (RegionSearchViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C0I7D editTextView;
        super.onViewCreated(view);
        C1749260vca c1749260vca = (C1749260vca) view.findViewById(R.id.u78);
        this.LLIZLLLIL = c1749260vca;
        if (c1749260vca != null) {
            C786410Ut5.LLLZ(c1749260vca, 0);
        }
        C1749260vca c1749260vca2 = this.LLIZLLLIL;
        if (c1749260vca2 != null && (editTextView = c1749260vca2.getEditTextView()) != null) {
            editTextView.addTextChangedListener(new C1266020j3A(this, 9));
            editTextView.setOnEditorActionListener(new C1265830j2r(this, 3));
            String strLJI = C20642515q3.LJI(2131837941);
            Object[] objArr = new Object[1];
            String str = ((C1201730hNT) Go().getState()).LLILLL;
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            editTextView.setHint(C786410Ut5.j4(strLJI, Arrays.copyOf(objArr, 1)));
        }
        C1749260vca c1749260vca3 = this.LLIZLLLIL;
        if (c1749260vca3 != null) {
            c1749260vca3.setOnClickClearListener(new ACListenerS154S0100000_19(this, 139));
        }
    }
}
