package com.ss.android.ugc.tools.chat.demo;

import X.C01GW;
import X.C1308910kAL;
import X.C13BV;
import X.C21415018rM;
import X.C418440Gaw;
import X.C444830HcP;
import X.C452501pT;
import X.C497820Jfg;
import X.C814420VxA;
import X.C904950Zen;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class WaitingForReplyAssem extends ReusedUISlotAssem<WaitingForReplyAssem> implements InterfaceC712990Rxx<C904950Zen> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 975));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 413));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bjf;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C904950Zen c904950Zen) {
        int iIntValue;
        Integer numLIZJ;
        Context context = getContext();
        int iLIZIZ = 0;
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.cn, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        Context context2 = getContext();
        if (context2 != null) {
            iLIZIZ = ((C497820Jfg.LIZIZ(context2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        C21415018rM c21415018rM = (C21415018rM) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (c21415018rM != null) {
            c21415018rM.setBackground((Drawable) this.LLJL.getValue());
            C444830HcP c444830HcP = new C444830HcP();
            c444830HcP.LJIILIIL("This is a demo cell");
            c444830HcP.LJII(101);
            c444830HcP.LJIILJJIL(iIntValue);
            c444830HcP.LIZIZ.LJ = iLIZIZ;
            c21415018rM.setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.0f, true, C13BV.INSTANCE, 24));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C904950Zen c904950Zen) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C904950Zen c904950Zen) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
