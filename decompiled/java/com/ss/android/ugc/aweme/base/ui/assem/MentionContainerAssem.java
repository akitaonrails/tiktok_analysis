package com.ss.android.ugc.aweme.base.ui.assem;

import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C20612815lG;
import X.C2217381BqS;
import X.C295780Bia;
import X.C295880Bik;
import X.C452501pT;
import X.C723850SaN;
import X.C736680Sv4;
import X.C736820SvI;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class MentionContainerAssem extends UISlotAssem {
    public C20612815lG LLJJI;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS23S0600000_19(this, C13LE.LIZ(MentionContainerViewModel.class), C1637806bA.LIZ, new AwS575S0100000_31(this, 232), AFwS276S0000000_31.get$arr$(290), (Function0) null, 0));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dlr;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        String str;
        C20612815lG c20612815lG = this.LLJJI;
        if (c20612815lG != null) {
            str = c20612815lG.LIZJ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "comment")) {
            C01GW c01gw = C295880Bik.LIZ;
            if (C295880Bik.LIZLLL) {
                C01GW c01gw2 = C295780Bia.LIZ;
                if (C295780Bia.LIZIZ) {
                    return LJJIJL().getContext();
                }
            }
        }
        super.Eo(context);
        return context;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C20612815lG c20612815lG = this.LLJJI;
        if (c20612815lG != null) {
            ((MentionContainerViewModel) this.LLJJIII.getValue()).LL = c20612815lG;
        }
        C723850SaN.LIZLLL(this, new AwS610S0100000_31(this, 122));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.15lN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20612215lA) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(17), 4);
    }
}
