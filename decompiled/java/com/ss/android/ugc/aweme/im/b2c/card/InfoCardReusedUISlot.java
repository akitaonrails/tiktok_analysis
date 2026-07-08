package com.ss.android.ugc.aweme.im.b2c.card;

import X.C01GW;
import X.C1559260qg8;
import X.C452501pT;
import X.C461530I7z;
import X.C462590ICb;
import X.C723590SZx;
import X.C898900ZOe;
import X.C900120ZSw;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.InterfaceC900110ZSv;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class InfoCardReusedUISlot extends ReusedUISlotAssem<InfoCardReusedUISlot> implements InterfaceC712990Rxx<InterfaceC900110ZSv> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 228));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 229));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 230));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cle;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op(X.InterfaceC900110ZSv r14) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b2c.card.InfoCardReusedUISlot.op(X.0ZSv):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC900110ZSv interfaceC900110ZSv) {
        InterfaceC900110ZSv interfaceC900110ZSv2 = interfaceC900110ZSv;
        op(interfaceC900110ZSv2);
        ((View) this.LLJL.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC900110ZSv2.LIZJ(), (View) this.LLJL.getValue()));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC900110ZSv interfaceC900110ZSv) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC900110ZSv interfaceC900110ZSv) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C900120ZSw c900120ZSw;
        InterfaceC900110ZSv interfaceC900110ZSv = (InterfaceC900110ZSv) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C900120ZSw) && (c900120ZSw = (C900120ZSw) obj2) != null) {
                    if (c900120ZSw.LIZ) {
                        op(interfaceC900110ZSv);
                    }
                    if (c900120ZSw.LIZIZ) {
                        ((View) this.LLJL.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC900110ZSv.LIZJ(), (View) this.LLJL.getValue()));
                    }
                }
            }
            return;
        }
        op(interfaceC900110ZSv);
        ((View) this.LLJL.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC900110ZSv.LIZJ(), (View) this.LLJL.getValue()));
    }
}
