package com.ss.android.ugc.aweme.main.assems;

import X.C01GW;
import X.C0QSJ;
import X.C1150504el;
import X.C13LE;
import X.C1558520qew;
import X.C1583560rJK;
import X.C1583570rJL;
import X.C1583580rJM;
import X.C1583590rJN;
import X.C2217381BqS;
import X.C296200BjG;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.os.Bundle;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class HoxAssem extends BaseMainContainerAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C01GW LL = C452501pT.LIZIZ(new C1583580rJM(this));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1583590rJN(this));
    public volatile HomeTabAbility LLILLL;
    public InterfaceC665370Q7z LLILZ;
    public C0QSJ LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HoxAssem.class, "homeTabAbility", "getHomeTabAbility()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility bo() {
        /*
            r4 = this;
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r4.LLILLL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r4.LLILLL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLILZIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLILZ     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLILZ = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLILZIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility> r0 = com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLILLL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.HoxAssem.bo():com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility");
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m258do() {
        HomeTabAbility homeTabAbilityBo = C296200BjG.LIZ() ? bo() : (HomeTabAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), HomeTabAbility.class, null);
        if (homeTabAbilityBo != null) {
            homeTabAbilityBo.GM0((C1583560rJK) this.LL.getValue());
            homeTabAbilityBo.eF1((C1583570rJL) this.LLILLJJLI.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAssemLoaded() {
        /*
            r7 = this;
            super.onAssemLoaded()
            X.145x r0 = X.C1150504el.LIZ()
            java.lang.String r5 = "main_act_node_init_duration"
            r4 = 0
            r0.LIZLLL(r5, r4)
            X.19EG r3 = X.C724240Sb0.LIZ(r7)
            if (r3 == 0) goto L87
            X.0Hfk r0 = com.bytedance.hox.Hox.LLJILJIL
            com.bytedance.hox.Hox r6 = r0.LIZ(r3)
            X.0rWk r0 = X.C1591880rWk.LIZIZ
            X.0rJZ r2 = r0.getRootNode(r3)
            boolean r0 = com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt.getEnableFragmentSAFLifecycleRefactor()
            if (r0 == 0) goto L3e
            boolean r0 = r3 instanceof X.C199Y
            if (r0 == 0) goto L85
            boolean r0 = r3 instanceof X.InterfaceC1711206n0
            if (r0 == 0) goto L85
            r0 = r3
            X.15ms r0 = (X.InterfaceC20622815ms) r0
            X.198i r1 = X.C20629915o1.LIZ(r0)
            if (r1 == 0) goto L3e
            boolean r0 = r1 instanceof X.C0J5E
            if (r0 == 0) goto L3e
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 != 0) goto L3f
        L3e:
            r1 = r3
        L3f:
            r6.IQ2(r3, r2, r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "hoxInstance injectRootNode: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r3 = ", "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "saf-init"
            X.C2344809Gs.LJFF(r0, r1)
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "saf-init:hoxInstance injectRootNode: "
            r1.append(r0)
            r1.append(r6)
            r1.append(r3)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.println(r0)
            r7.m258do()
            X.145x r0 = X.C1150504el.LIZ()
            r0.LJI(r5, r4)
            return
        L85:
            r1 = r3
            goto L3f
        L87:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "can not find activity for hox init"
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.HoxAssem.onAssemLoaded():void");
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        HomeTabAbility homeTabAbilityBo = C296200BjG.LIZ() ? bo() : (HomeTabAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), HomeTabAbility.class, null);
        if (homeTabAbilityBo != null) {
            homeTabAbilityBo.nJ1((C1583560rJK) this.LL.getValue());
            homeTabAbilityBo.YO2((C1583570rJL) this.LLILLJJLI.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"HoxAssem", "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate(bundle);
        C1150504el.LIZ().LJI(strJ4, false);
    }
}
