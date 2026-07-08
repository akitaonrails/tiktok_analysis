package com.ss.android.ugc.aweme.poi.detail.nearby.map;

import X.C019F;
import X.C1176870gjN;
import X.C1179470gnZ;
import X.C1180740gpc;
import X.C1203050hPb;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.EnumC1203090hPf;
import X.InterfaceC1176690gj5;
import X.InterfaceC1177250gjz;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyViewModel;
import com.ss.android.ugc.aweme.poi.detail.nearby.PoiNearbyModel;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailNearbyMapAssem extends UIContentAssem implements PoiDetailNearbyMapAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public C1176870gjN LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public boolean LLJI;
    public InterfaceC1177250gjz LLJIJIL;
    public final List<Object> LLJILJIL;
    public final Set<String> LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailNearbyMapAssem.class, "poiDetailNearbyVM", "getPoiDetailNearbyVM()Lcom/ss/android/ugc/aweme/poi/detail/nearby/PoiDetailNearbyViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailNearbyMapAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailNearbyViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1168), AFwS256S0000000_18.get$arr$(412), null, true);
        this.LLJILJIL = new ArrayList();
        this.LLJILJILJ = new LinkedHashSet();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((ArrayList) this.LLJILJIL).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go(java.util.List<com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard> r22) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAssem.Go(java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be A[PHI: r9
      0x00be: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v13 java.lang.String) binds: [B:54:0x00bb, B:26:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2 A[PHI: r8 r9
      0x00c2: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v11 java.lang.String) binds: [B:57:0x00bf, B:29:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v12 java.lang.String) binds: [B:57:0x00bf, B:29:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6 A[PHI: r8 r9 r10
      0x00c6: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v10 java.lang.String) binds: [B:60:0x00c3, B:32:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v11 java.lang.String) binds: [B:60:0x00c3, B:32:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v9 java.lang.String) binds: [B:60:0x00c3, B:32:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca A[PHI: r8 r9 r10 r11
      0x00ca: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v9 java.lang.String) binds: [B:63:0x00c7, B:35:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r9v4 java.lang.String) = (r9v3 java.lang.String), (r9v10 java.lang.String) binds: [B:63:0x00c7, B:35:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r10v2 java.lang.String) = (r10v1 java.lang.String), (r10v8 java.lang.String) binds: [B:63:0x00c7, B:35:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v7 java.lang.String) binds: [B:63:0x00c7, B:35:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce A[PHI: r8 r9 r10 r11 r12
      0x00ce: PHI (r8v4 java.lang.String) = (r8v3 java.lang.String), (r8v8 java.lang.String) binds: [B:66:0x00cb, B:38:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r9v5 java.lang.String) = (r9v4 java.lang.String), (r9v9 java.lang.String) binds: [B:66:0x00cb, B:38:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v7 java.lang.String) binds: [B:66:0x00cb, B:38:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v6 java.lang.String) binds: [B:66:0x00cb, B:38:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v5 java.lang.String) binds: [B:66:0x00cb, B:38:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2 A[PHI: r8 r9 r10 r11 r12 r13
      0x00d2: PHI (r8v5 java.lang.String) = (r8v4 java.lang.String), (r8v7 java.lang.String) binds: [B:69:0x00cf, B:41:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r9v6 java.lang.String) = (r9v5 java.lang.String), (r9v8 java.lang.String) binds: [B:69:0x00cf, B:41:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r10v4 java.lang.String) = (r10v3 java.lang.String), (r10v6 java.lang.String) binds: [B:69:0x00cf, B:41:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v5 java.lang.String) binds: [B:69:0x00cf, B:41:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v4 java.lang.String) binds: [B:69:0x00cf, B:41:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String) binds: [B:69:0x00cf, B:41:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Mi0(com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard r21) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAssem.Mi0(com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard):void");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAssem for r7v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r8) {
        /*
            r7 = this;
            super.onViewCreated(r8)
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r7)
            r5 = 0
            if (r0 == 0) goto L1b
            X.0Q7z r4 = X.C1558360qeg.LJFF(r0, r5)
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAbility> r0 = com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAbility.class
            X.01wD r6 = X.C1558520qew.LIZ(r4, r0, r5)
            if (r6 != 0) goto L3a
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAbility> r0 = com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAbility.class
            X.C1558520qew.LJII(r4, r7, r0, r5, r5)
        L1b:
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r7)
            if (r0 == 0) goto L39
            X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r5)
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.nearby.IPoiDetailNearbyAbility> r0 = com.ss.android.ugc.aweme.poi.detail.nearby.IPoiDetailNearbyAbility.class
            X.01wD r2 = X.C1558520qew.LIZ(r1, r0, r5)
            com.ss.android.ugc.aweme.poi.detail.nearby.IPoiDetailNearbyAbility r2 = (com.ss.android.ugc.aweme.poi.detail.nearby.IPoiDetailNearbyAbility) r2
            if (r2 == 0) goto L39
            kotlin.jvm.internal.AwS597S0100000_18 r1 = new kotlin.jvm.internal.AwS597S0100000_18
            r0 = 979(0x3d3, float:1.372E-42)
            r1.<init>(r7, r0)
            r2.pH(r1)
        L39:
            return
        L3a:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r6)     // Catch: java.lang.IllegalArgumentException -> L52
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L52
            if (r0 == 0) goto L4a
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L52
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L52
            r0.add(r7)     // Catch: java.lang.IllegalArgumentException -> L52
            goto L1b
        L4a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L52
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L52
            throw r1     // Catch: java.lang.IllegalArgumentException -> L52
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAbility> r0 = com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAbility> r0 = com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAbility.class
            r2[r1] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r7)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r6)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto L81
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAbility> r0 = com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAbility.class
            X.C1558520qew.LJII(r4, r1, r0, r5, r5)
            goto L1b
        L81:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAbility"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.nearby.map.PoiDetailNearbyMapAbility
    public final void lr1(String str, PoiNearbyModel poiNearbyModel) {
        List<PoiDiscoveryCard> poiList;
        View viewLIZ;
        if (poiNearbyModel != null && (poiList = poiNearbyModel.getPoiList()) != null) {
            List<PoiDiscoveryCard> listLL = C13LP.LL(poiList, 9);
            if (this.LLJIJIL != null) {
                Go(listLL);
                return;
            }
            AwS384S0200000_18 awS384S0200000_18 = new AwS384S0200000_18(this, (PoiDetailNearbyMapAssem) listLL, (List<PoiDiscoveryCard>) 261);
            C1180740gpc.LIZ.getClass();
            IPoiMapService iPoiMapServiceLIZ = C1180740gpc.LIZ();
            C1179470gnZ c1179470gnZ = new C1179470gnZ();
            c1179470gnZ.LIZLLL = false;
            c1179470gnZ.LIZIZ = false;
            c1179470gnZ.LIZJ = false;
            c1179470gnZ.LJ = false;
            c1179470gnZ.LJFF = EnumC1203090hPf.MAP_TYPE_NORMAL;
            c1179470gnZ.LJI = C1180740gpc.LIZ().LJ(getContext());
            InterfaceC1176690gj5 iMapManager = iPoiMapServiceLIZ.getIMapManager(new C1203050hPb(c1179470gnZ));
            Context context = getContext();
            if (context != null && (viewLIZ = iMapManager.LIZ(context, this)) != null) {
                ((ViewGroup) LJJIJL().findViewById(R.id.i7m)).addView(viewLIZ, new FrameLayout.LayoutParams(-1, -1));
            }
            iMapManager.X(new AwS384S0200000_18(this, awS384S0200000_18, 260));
        }
    }
}
