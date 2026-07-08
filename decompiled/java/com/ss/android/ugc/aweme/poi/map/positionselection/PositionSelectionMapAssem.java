package com.ss.android.ugc.aweme.poi.map.positionselection;

import X.C019F;
import X.C0PEM;
import X.C1177600gkY;
import X.C1177960gl8;
import X.C1178480gly;
import X.C1178490glz;
import X.C1178580gm8;
import X.C1179540gng;
import X.C1308910kAL;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C23250099c;
import X.C2479409nc;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC1177250gjz;
import X.InterfaceC1177640gkc;
import X.InterfaceC2217461Bqa;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PositionSelectionMapAssem extends UIContentAssem implements PositionSelectionMapAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final double LLJI;
    public final float LLJIJIL;
    public InterfaceC1177640gkc LLJILJIL;
    public InterfaceC1177250gjz LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public volatile boolean LLJJIII;
    public C1177960gl8 LLJJIJI;
    public boolean LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PositionSelectionMapAssem.class, "positionSelectionViewModel", "getPositionSelectionViewModel()Lcom/ss/android/ugc/aweme/poi/map/positionselection/PositionSelectionViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PositionSelectionMapAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PositionSelectionViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1375), AFwS256S0000000_18.get$arr$(458), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1178580gm8.class, "PositionSelectionHierarchyData"), checkSupervisorPrepared());
        this.LLJI = 1700.0d;
        this.LLJIJIL = 2.0f;
    }

    public final void Go() {
        C1177960gl8 c1177960gl8;
        Integer numLIZJ;
        Integer numLIZJ2;
        if (this.LLJJIII || this.LLJILJILJ == null || (c1177960gl8 = this.LLJJIJI) == null) {
            return;
        }
        if (c1177960gl8.lat == 0.0d && c1177960gl8.lon == 0.0d) {
            return;
        }
        this.LLJJIII = true;
        if (Lo()) {
            getActualLifecycleOwner();
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C2479409nc(this, c1177960gl8, null), 2);
            return;
        }
        InterfaceC1177250gjz interfaceC1177250gjz = this.LLJILJILJ;
        if (interfaceC1177250gjz != null) {
            interfaceC1177250gjz.LJIILJJIL(false);
            C1177600gkY c1177600gkY = new C1177600gkY();
            c1177600gkY.LIZ = new C1178490glz(c1177960gl8.lat, c1177960gl8.lon);
            c1177600gkY.LIZIZ = Double.valueOf(this.LLJI);
            c1177600gkY.LJ = Float.valueOf(this.LLJIJIL);
            c1177600gkY.LJFF = Float.valueOf(-1.0f);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0c, c19egLIZ)) != null) {
                c1177600gkY.LIZJ = Integer.valueOf(numLIZJ2.intValue());
            }
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c4, c19egLIZ2)) != null) {
                c1177600gkY.LIZLLL = Integer.valueOf(numLIZJ.intValue());
            }
            this.LLJILJIL = interfaceC1177250gjz.LJIJI(c1177600gkY);
        }
    }

    public final C1178580gm8 Ho() {
        return (C1178580gm8) this.LLJ.getValue();
    }

    public final PositionSelectionViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (PositionSelectionViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility
    public final C1177960gl8 getCurrentPosition() {
        C1179540gng c1179540gngLJFF;
        InterfaceC1177250gjz interfaceC1177250gjz = this.LLJILJILJ;
        if (interfaceC1177250gjz == null || (c1179540gngLJFF = interfaceC1177250gjz.LJFF()) == null) {
            return null;
        }
        return c1179540gngLJFF.latLon;
    }

    public final boolean Lo() {
        ILocationBaseServiceForMT iLocationBaseServiceForMT;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        return c19egLIZ != null && (iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null)) != null && iLocationBaseServiceForMT.LJJIJ() && iLocationBaseServiceForMT.LJ(c19egLIZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC1177250gjz interfaceC1177250gjz = this.LLJILJILJ;
        if (interfaceC1177250gjz != null) {
            interfaceC1177250gjz.LJIILLIIL();
        }
        InterfaceC1177640gkc interfaceC1177640gkc = this.LLJILJIL;
        if (interfaceC1177640gkc != null) {
            interfaceC1177640gkc.remove();
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility
    public final boolean BH() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility
    public final void Bj0(C1177960gl8 c1177960gl8) {
        if (c1177960gl8 != null) {
            this.LLJJIJI = c1177960gl8;
            Go();
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility
    public final void lh2(C1177960gl8 c1177960gl8) {
        PositionSelectionPageAbility positionSelectionPageAbility;
        if (c1177960gl8 != null) {
            Ho().LL = c1177960gl8;
        }
        this.LLJILLL = true;
        C1177960gl8 c1177960gl82 = Ho().LL;
        this.LLJJI = false;
        this.LLJJIJIIJIL = true;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (positionSelectionPageAbility = (PositionSelectionPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), PositionSelectionPageAbility.class, null)) != null) {
            positionSelectionPageAbility.J20(false);
        }
        InterfaceC1177250gjz interfaceC1177250gjz = this.LLJILJILJ;
        if (interfaceC1177250gjz != null) {
            Float fValueOf = Float.valueOf(interfaceC1177250gjz.LJIJJ());
            C1178480gly c1178480gly = new C1178480gly();
            c1178480gly.LIZ = true;
            c1178480gly.LIZIZ = 300L;
            interfaceC1177250gjz.LIZIZ(c1177960gl82, fValueOf, c1178480gly);
        }
        Jo().wQ2(c1177960gl82.lat, c1177960gl82.lon);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAssem for r8v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r9) {
        /*
            r8 = this;
            super.onViewCreated(r9)
            X.0gpc r0 = X.C1180740gpc.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.mapapi.IPoiMapService r2 = X.C1180740gpc.LIZ()
            X.0gnZ r1 = new X.0gnZ
            r1.<init>()
            X.0hPf r0 = X.EnumC1203090hPf.MAP_TYPE_NORMAL
            r1.LJFF = r0
            r7 = 0
            r1.LJII = r7
            android.view.View r0 = r8.LJJIJL()
            android.content.Context r0 = r0.getContext()
            java.lang.String r0 = X.C1178280gle.LIZIZ(r0)
            r1.LJI = r0
            X.0hPb r0 = new X.0hPb
            r0.<init>(r1)
            X.0gj5 r3 = r2.getIMapManager(r0)
            androidx.fragment.app.Fragment r2 = r3.LIZIZ()
            if (r2 == 0) goto L56
            android.content.Context r0 = r8.getContext()
            if (r0 == 0) goto L56
            X.19EG r0 = X.C1388190mED.LIZIZ(r0)
            if (r0 == 0) goto L56
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            if (r0 == 0) goto L56
            X.19EH r1 = r0.LJIIJ()
            if (r1 == 0) goto L56
            r0 = 2131373186(0x7f0a2c82, float:1.8366456E38)
            r1.LIZIZ(r0, r2)
            r1.LJIIIZ()
        L56:
            kotlin.jvm.internal.AwS597S0100000_18 r1 = new kotlin.jvm.internal.AwS597S0100000_18
            r0 = 1049(0x419, float:1.47E-42)
            r1.<init>(r8, r0)
            r3.X(r1)
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r8)
            if (r0 == 0) goto L78
            r5 = 0
            X.0Q7z r4 = X.C1558360qeg.LJFF(r0, r5)
            java.lang.Class<com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility> r0 = com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility.class
            X.01wD r6 = X.C1558520qew.LIZ(r4, r0, r5)
            if (r6 != 0) goto L79
            java.lang.Class<com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility> r0 = com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility.class
            X.C1558520qew.LJII(r4, r8, r0, r5, r5)
        L78:
            return
        L79:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r6)     // Catch: java.lang.IllegalArgumentException -> L91
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L91
            if (r0 == 0) goto L89
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L91
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L91
            r0.add(r8)     // Catch: java.lang.IllegalArgumentException -> L91
            return
        L89:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L91
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L91
            throw r1     // Catch: java.lang.IllegalArgumentException -> L91
        L91:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility> r0 = com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility> r0 = com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility.class
            r2[r7] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r8)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r6)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto Lbf
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility> r0 = com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility.class
            X.C1558520qew.LJII(r4, r1, r0, r5, r5)
            return
        Lbf:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAbility"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAssem.onViewCreated(android.view.View):void");
    }
}
