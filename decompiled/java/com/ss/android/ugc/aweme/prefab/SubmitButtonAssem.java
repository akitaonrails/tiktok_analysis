package com.ss.android.ugc.aweme.prefab;

import X.C01GW;
import X.C197039127h;
import X.C452501pT;
import X.C786410Ut5;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SubmitButtonAssem extends DynamicAssem implements ItemSelectAbility {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 528));
    public C197039127h LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.eap;
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility
    public final void kK0(int i) {
        boolean z;
        if (i == 0) {
            C786410Ut5.LJLLLLLL(8, getContentView());
        } else {
            C786410Ut5.LJLLLLLL(0, getContentView());
        }
        C197039127h c197039127h = this.LLJJIII;
        C197039127h c197039127h2 = null;
        if (c197039127h == null) {
            c197039127h = null;
        }
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        c197039127h.setEnabled(z);
        C197039127h c197039127h3 = this.LLJJIII;
        if (c197039127h3 != null) {
            c197039127h2 = c197039127h3;
        }
        c197039127h2.setText(C786410Ut5.j4((String) this.LLJJI.getValue(), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.prefab.SubmitButtonAssem for r8v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r9) {
        /*
            r8 = this;
            r0 = 2131398061(0x7f0a8dad, float:1.8416909E38)
            android.view.View r2 = r9.findViewById(r0)
            X.127h r2 = (X.C197039127h) r2
            r8.LLJJIII = r2
            r5 = 0
            if (r2 != 0) goto Lf
            r2 = r5
        Lf:
            Y.ACListenerS141S0100000_6 r1 = new Y.ACListenerS141S0100000_6
            r0 = 51
            r1.<init>(r8, r0)
            X.C786410Ut5.U8(r2, r1)
            r7 = 0
            r8.kK0(r7)
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r8)
            if (r0 == 0) goto L34
            X.0Q7z r4 = X.C1558360qeg.LJFF(r0, r5)
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility.class
            X.01wD r6 = X.C1558520qew.LIZ(r4, r0, r5)
            if (r6 != 0) goto L35
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility.class
            X.C1558520qew.LJII(r4, r8, r0, r5, r5)
        L34:
            return
        L35:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r6)     // Catch: java.lang.IllegalArgumentException -> L4d
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L4d
            if (r0 == 0) goto L45
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L4d
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L4d
            r0.add(r8)     // Catch: java.lang.IllegalArgumentException -> L4d
            return
        L45:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L4d
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L4d
            throw r1     // Catch: java.lang.IllegalArgumentException -> L4d
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility.class
            r2[r7] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r8)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r6)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto L7b
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility.class
            X.C1558520qew.LJII(r4, r1, r0, r5, r5)
            return
        L7b:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prefab.SubmitButtonAssem.onViewCreated(android.view.View):void");
    }
}
