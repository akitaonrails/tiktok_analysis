package com.ss.android.ugc.aweme.slash.cell.arc;

import X.C1175620ghM;
import X.C1175960ghu;
import X.C1175970ghv;
import X.C1175980ghw;
import X.C1180170goh;
import X.C13IQ;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C723830SaL;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS9S2300000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class SlashPowerListCellGroupCommonReusedAssem extends ReusedUISlotAssem<SlashPowerListCellGroupCommonReusedAssem> implements InterfaceC712990Rxx<C1175980ghw> {
    public final int LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C1175960ghu LLJLIL = new C1175960ghu(null);
    public View LLJLILLLLZIIL;
    public C13IQ<? extends SlashCell<?>> LLJLL;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int Oo() {
        return this.LLJJLIIIJLLLLLLLZ == 0 ? R.layout.f9c : R.layout.f9b;
    }

    public ViewGroup sp() {
        View view = this.LLJLILLLLZIIL;
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public SlashPowerListCellGroupCommonReusedAssem(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        this.LLJLILLLLZIIL = view;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: op, reason: merged with bridge method [inline-methods] */
    public void up(C1175980ghw c1175980ghw) {
        this.LLJLIL.LL.setValue(c1175980ghw.LL);
        C13IQ<? extends SlashCell<?>> c13iqLIZIZ = C1175970ghv.LIZIZ(c1175980ghw.LL);
        if (this.LLJL && Intrinsics.LJFF(this.LLJLL, c13iqLIZIZ)) {
            return;
        }
        ViewGroup viewGroupSp = sp();
        if (c13iqLIZIZ != null && viewGroupSp != null) {
            this.LLJL = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((C19719912Dl) c13iqLIZIZ).LJI());
            sbLIZ.append('_');
            sbLIZ.append(c1175980ghw.LL.LL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String strLIZJ = C1175970ghv.LIZJ(strLIZIZ);
            C1180170goh.LIZLLL().LIZ(new C1175620ghM(strLIZIZ, strLIZJ));
            C723850SaN.LJII(this, c13iqLIZIZ, strLIZIZ);
            C786410Ut5.LJJJJI(viewGroupSp);
            C723830SaL.LIZ(this, null, new AwS9S2300000_18(this, (SlashPowerListCellGroupCommonReusedAssem) strLIZJ, (String) c13iqLIZIZ, (C13IQ<? extends SlashCell<?>>) strLIZIZ, (String) viewGroupSp, (ViewGroup) 0));
            this.LLJLL = c13iqLIZIZ;
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1175980ghw c1175980ghw) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1175980ghw c1175980ghw) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
