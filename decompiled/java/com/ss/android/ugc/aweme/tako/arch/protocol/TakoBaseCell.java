package com.ss.android.ugc.aweme.tako.arch.protocol;

import X.C01GW;
import X.C03H5;
import X.C0QSJ;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC687730QyJ;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoCardCellScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class TakoBaseCell<ASSEM extends ReusedUISlotAssem<? extends C03H5>, ITEM extends InterfaceC1891350zJl> extends AssemPowerCell<ASSEM, ITEM> implements C0QSJ, InterfaceC1146704e9 {
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS554S0100000_10((TakoBaseCell) this, 845));

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoCardCellScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoCardCellScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoCardCellScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateItemView(android.view.ViewGroup r6) {
        /*
            r5 = this;
            com.bytedance.assem.arch.reused.ReusedUIAssem r2 = r5.NG1()
            boolean r0 = r2 instanceof com.bytedance.assem.arch.reused.ReusedUISlotAssem
            if (r0 == 0) goto L6e
            com.bytedance.assem.arch.reused.ReusedUISlotAssem r2 = (com.bytedance.assem.arch.reused.ReusedUISlotAssem) r2
        La:
            java.lang.System.currentTimeMillis()
            r4 = 0
            if (r2 == 0) goto L45
            X.01GW r0 = X.C2279711EKz.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2a
            boolean r0 = X.C1859307Pz.LIZ()
            if (r0 == 0) goto L69
            boolean r0 = com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment.LIZ(r4)
            if (r0 == 0) goto L69
        L2a:
            android.content.Context r1 = r6.getContext()
            int r0 = r2.Oo()
            android.view.View r0 = X.C21146717pB.LIZIZ(r1, r0, r6, r4)
            r5.LL = r0
            android.view.View r0 = r5.LJJIJL()
            r5.Sl0(r0, r5)
            android.view.View r1 = r5.LJJIJL()
        L43:
            if (r1 != 0) goto L49
        L45:
            android.view.View r1 = super.onCreateItemView(r6)
        L49:
            X.0GSQ r3 = new X.0GSQ
            android.content.Context r0 = r6.getContext()
            r3.<init>(r0)
            r3.addView(r1)
            androidx.recyclerview.widget.RecyclerView$LayoutParams r2 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
            r1 = -1
            r0 = -2
            r2.<init>(r1, r0)
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r3)
            r3.setLayoutParams(r2)
            r3.setClipChildren(r4)
            r3.setClipToPadding(r4)
            return r3
        L69:
            android.view.View r1 = super.onCreateItemView(r6)
            goto L43
        L6e:
            r2 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseCell.onCreateItemView(android.view.ViewGroup):android.view.View");
    }
}
