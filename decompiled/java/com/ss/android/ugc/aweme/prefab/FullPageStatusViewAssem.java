package com.ss.android.ugc.aweme.prefab;

import X.C01GW;
import X.C1264160j0A;
import X.C1749280vcc;
import X.C452501pT;
import X.C786410Ut5;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber;
import com.ss.android.ugc.aweme.prefab.ability.RefreshLoadingSubscriber;
import com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class FullPageStatusViewAssem extends DynamicAssem implements RefreshSuccessSubscriber, RefreshErrorSubscriber, RefreshLoadingSubscriber {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1445));
    public NetworkHelper LLJJIII;
    public C1749280vcc LLJJIJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    /* JADX INFO: renamed from: do */
    public void mo127do() {
    }

    public void i1() {
        Function0<Unit> function0;
        NetworkHelper networkHelper = this.LLJJIII;
        if (networkHelper != null) {
            C1749280vcc c1749280vcc = this.LLJJIJI;
            if (networkHelper.LLIZ == 0 && c1749280vcc != null && c1749280vcc.getVisibility() == 0) {
                C1264160j0A.LIZIZ(c1749280vcc, networkHelper.LLILZLL, null, new AwS553S0100000_9(networkHelper, 37));
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            }
        }
        NetworkHelper networkHelper2 = this.LLJJIII;
        if (networkHelper2 != null) {
            C1749280vcc c1749280vcc2 = this.LLJJIJI;
            if (networkHelper2.LLIZ == 0 && c1749280vcc2 != null) {
                c1749280vcc2.LJ();
            }
            if (networkHelper2.LLIZ == 1 && (function0 = networkHelper2.LLILLL) != null) {
                function0.invoke();
            }
            networkHelper2.LLJILJIL = System.currentTimeMillis();
        }
    }

    public void t0() {
        NetworkHelper networkHelper = this.LLJJIII;
        if (networkHelper != null) {
            networkHelper.LIZIZ(this.LLJJIJI);
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
        C786410Ut5.U6(c1749280vcc, new ViewGroup.LayoutParams(-1, -1));
        Zo(c1749280vcc);
        super.xo();
    }

    public void LLLLLZIL(Throwable th) {
        NetworkHelper networkHelper = this.LLJJIII;
        if (networkHelper != null) {
            networkHelper.LIZ(th, this.LLJJIJI);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem for r17v6 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem.onViewCreated(android.view.View):void");
    }
}
