package com.ss.android.ugc.aweme.poi.detail.discovery.mapmode;

import X.C019F;
import X.C1176860gjM;
import X.C1177960gl8;
import X.C1178480gly;
import X.C1179470gnZ;
import X.C1180740gpc;
import X.C1203050hPb;
import X.C1388190mED;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1203090hPf;
import X.InterfaceC1176690gj5;
import X.InterfaceC1177250gjz;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailDiscoveryMapPopupAssem extends UIContentAssem implements PoiDetailDiscoveryMapPopupAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public static final int LLJJIII;
    public PoiDiscoveryApi$PoiDiscoveryCardListResponse LLIZLLLIL;
    public InterfaceC1177250gjz LLJ;
    public FrameLayout LLJI;
    public FrameLayout LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final List<C1176860gjM> LLJILJILJ;
    public final Pair<Integer, Integer>[] LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailDiscoveryMapPopupAssem.class, "poiDetailDiscoveryMapVM", "getPoiDetailDiscoveryMapVM()Lcom/ss/android/ugc/aweme/poi/detail/discovery/mapmode/PoiDetailDiscoveryMapViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    public PoiDetailDiscoveryMapPopupAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailDiscoveryMapViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1114), AFwS256S0000000_18.get$arr$(386), null, true);
        this.LLJILJILJ = new ArrayList();
        int i = LLJJIII;
        Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + i);
        int i2 = LLJJI;
        this.LLJILLL = new Pair[]{new Pair<>(numValueOf, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + i2)), new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)), new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)), new Pair<>(Integer.valueOf(i), Integer.valueOf(i2))};
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((ArrayList) this.LLJILJILJ).clear();
    }

    public final void Go(List<PoiDiscoveryCard> list) {
        Location location;
        Double d;
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (PoiDiscoveryCard poiDiscoveryCard : list) {
            if (poiDiscoveryCard != null && (location = poiDiscoveryCard.location) != null && (d = location.lat) != null) {
                double dDoubleValue = d.doubleValue();
                Double d2 = poiDiscoveryCard.location.lng;
                if (d2 != null) {
                    arrayList.add(new C1177960gl8(dDoubleValue, d2.doubleValue()));
                }
            }
        }
        InterfaceC1177250gjz interfaceC1177250gjz = this.LLJ;
        if (interfaceC1177250gjz != null) {
            C1178480gly c1178480gly = new C1178480gly();
            c1178480gly.LIZ = true;
            c1178480gly.LIZIZ = 300L;
            C1177960gl8[] c1177960gl8Arr = (C1177960gl8[]) arrayList.toArray(new C1177960gl8[0]);
            interfaceC1177250gjz.LJIIIIZZ(0, c1178480gly, (C1177960gl8[]) Arrays.copyOf(c1177960gl8Arr, c1177960gl8Arr.length));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryMapPopupAssem for r7v2 'this'  java.lang.Object
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
            if (r0 == 0) goto L1b
            r5 = 0
            X.0Q7z r4 = X.C1558360qeg.LJFF(r0, r5)
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryMapPopupAbility> r0 = com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryMapPopupAbility.class
            X.01wD r6 = X.C1558520qew.LIZ(r4, r0, r5)
            if (r6 != 0) goto L3e
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryMapPopupAbility> r0 = com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryMapPopupAbility.class
            X.C1558520qew.LJII(r4, r7, r0, r5, r5)
        L1b:
            r0 = 2131385932(0x7f0a5e4c, float:1.8392308E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r7.LLJI = r0
            r0 = 2131373183(0x7f0a2c7f, float:1.836645E38)
            android.view.View r2 = r8.findViewById(r0)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r7.LLJIJIL = r2
            if (r2 == 0) goto L3d
            Y.ACListenerS153S0100000_18 r1 = new Y.ACListenerS153S0100000_18
            r0 = 57
            r1.<init>(r7, r0)
            X.C786410Ut5.O7(r2, r1)
        L3d:
            return
        L3e:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r6)     // Catch: java.lang.IllegalArgumentException -> L56
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L56
            if (r0 == 0) goto L4e
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L56
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L56
            r0.add(r7)     // Catch: java.lang.IllegalArgumentException -> L56
            goto L1b
        L4e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L56
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L56
            throw r1     // Catch: java.lang.IllegalArgumentException -> L56
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryMapPopupAbility> r0 = com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryMapPopupAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryMapPopupAbility> r0 = com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryMapPopupAbility.class
            r2[r1] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r7)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r6)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto L85
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryMapPopupAbility> r0 = com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryMapPopupAbility.class
            X.C1558520qew.LJII(r4, r1, r0, r5, r5)
            goto L1b
        L85:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryMapPopupAbility"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryMapPopupAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryMapPopupAbility
    public final void qK1(final String str, final PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse) {
        List<PoiDiscoveryCard> poiList;
        C19EH c19ehLJIIJ;
        C19EG c19egLIZIZ;
        this.LLIZLLLIL = poiDiscoveryApi$PoiDiscoveryCardListResponse;
        FragmentManager fragmentManagerLJJI = null;
        if (poiDiscoveryApi$PoiDiscoveryCardListResponse != null && (poiList = poiDiscoveryApi$PoiDiscoveryCardListResponse.getPoiList()) != null) {
            final List<PoiDiscoveryCard> listLL = C13LP.LL(poiList, 4);
            if (this.LLJ != null) {
                Go(listLL);
            } else {
                AwS384S0200000_18 awS384S0200000_18 = new AwS384S0200000_18(this, (PoiDetailDiscoveryMapPopupAssem) listLL, (List<PoiDiscoveryCard>) 97);
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
                if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                    fragmentManagerLJJI = SAFExtensionKt.LJJI(c19egLIZIZ);
                }
                Fragment fragmentLIZIZ = iMapManager.LIZIZ();
                if (fragmentLIZIZ != null && fragmentManagerLJJI != null && (c19ehLJIIJ = fragmentManagerLJJI.LJIIJ()) != null) {
                    c19ehLJIIJ.LIZIZ(R.id.i7m, fragmentLIZIZ);
                    c19ehLJIIJ.LJIIJ();
                }
                iMapManager.X(new AwS384S0200000_18(awS384S0200000_18, this, 178));
            }
            FrameLayout frameLayout = this.LLJI;
            if (frameLayout != null) {
                C786410Ut5.LJJJJIZL(frameLayout);
            }
            FrameLayout frameLayout2 = this.LLJI;
            if (frameLayout2 != null) {
                HandlerHook.viewPost(frameLayout2, new Runnable() { // from class: X.0gjK
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:109:0x031a  */
                    /* JADX WARN: Removed duplicated region for block: B:112:0x0322  */
                    /* JADX WARN: Removed duplicated region for block: B:115:0x032a  */
                    /* JADX WARN: Removed duplicated region for block: B:118:0x0332  */
                    /* JADX WARN: Removed duplicated region for block: B:121:0x033a  */
                    /* JADX WARN: Removed duplicated region for block: B:124:0x0348  */
                    /* JADX WARN: Removed duplicated region for block: B:127:0x0354  */
                    /* JADX WARN: Removed duplicated region for block: B:130:0x0371  */
                    /* JADX WARN: Removed duplicated region for block: B:131:0x0375  */
                    /* JADX WARN: Removed duplicated region for block: B:135:0x037d A[PHI: r23
                      0x037d: PHI (r23v1 java.lang.String) = (r23v0 java.lang.String), (r23v13 java.lang.String) binds: [B:133:0x037a, B:105:0x0310] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:138:0x0382 A[PHI: r22 r23
                      0x0382: PHI (r22v1 java.lang.String) = (r22v0 java.lang.String), (r22v11 java.lang.String) binds: [B:136:0x037f, B:108:0x0318] A[DONT_GENERATE, DONT_INLINE]
                      0x0382: PHI (r23v2 java.lang.String) = (r23v1 java.lang.String), (r23v12 java.lang.String) binds: [B:136:0x037f, B:108:0x0318] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:141:0x0387 A[PHI: r22 r23 r24
                      0x0387: PHI (r22v2 java.lang.String) = (r22v1 java.lang.String), (r22v10 java.lang.String) binds: [B:139:0x0384, B:111:0x0320] A[DONT_GENERATE, DONT_INLINE]
                      0x0387: PHI (r23v3 java.lang.String) = (r23v2 java.lang.String), (r23v11 java.lang.String) binds: [B:139:0x0384, B:111:0x0320] A[DONT_GENERATE, DONT_INLINE]
                      0x0387: PHI (r24v1 java.lang.String) = (r24v0 java.lang.String), (r24v9 java.lang.String) binds: [B:139:0x0384, B:111:0x0320] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:144:0x038c A[PHI: r22 r23 r24 r25
                      0x038c: PHI (r22v3 java.lang.String) = (r22v2 java.lang.String), (r22v9 java.lang.String) binds: [B:142:0x0389, B:114:0x0328] A[DONT_GENERATE, DONT_INLINE]
                      0x038c: PHI (r23v4 java.lang.String) = (r23v3 java.lang.String), (r23v10 java.lang.String) binds: [B:142:0x0389, B:114:0x0328] A[DONT_GENERATE, DONT_INLINE]
                      0x038c: PHI (r24v2 java.lang.String) = (r24v1 java.lang.String), (r24v8 java.lang.String) binds: [B:142:0x0389, B:114:0x0328] A[DONT_GENERATE, DONT_INLINE]
                      0x038c: PHI (r25v1 java.lang.String) = (r25v0 java.lang.String), (r25v7 java.lang.String) binds: [B:142:0x0389, B:114:0x0328] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:147:0x0391 A[PHI: r22 r23 r24 r25 r26
                      0x0391: PHI (r22v4 java.lang.String) = (r22v3 java.lang.String), (r22v8 java.lang.String) binds: [B:145:0x038e, B:117:0x0330] A[DONT_GENERATE, DONT_INLINE]
                      0x0391: PHI (r23v5 java.lang.String) = (r23v4 java.lang.String), (r23v9 java.lang.String) binds: [B:145:0x038e, B:117:0x0330] A[DONT_GENERATE, DONT_INLINE]
                      0x0391: PHI (r24v3 java.lang.String) = (r24v2 java.lang.String), (r24v7 java.lang.String) binds: [B:145:0x038e, B:117:0x0330] A[DONT_GENERATE, DONT_INLINE]
                      0x0391: PHI (r25v2 java.lang.String) = (r25v1 java.lang.String), (r25v6 java.lang.String) binds: [B:145:0x038e, B:117:0x0330] A[DONT_GENERATE, DONT_INLINE]
                      0x0391: PHI (r26v1 java.lang.String) = (r26v0 java.lang.String), (r26v5 java.lang.String) binds: [B:145:0x038e, B:117:0x0330] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:150:0x0396 A[PHI: r22 r23 r24 r25 r26 r27
                      0x0396: PHI (r22v5 java.lang.String) = (r22v4 java.lang.String), (r22v7 java.lang.String) binds: [B:148:0x0393, B:120:0x0338] A[DONT_GENERATE, DONT_INLINE]
                      0x0396: PHI (r23v6 java.lang.String) = (r23v5 java.lang.String), (r23v8 java.lang.String) binds: [B:148:0x0393, B:120:0x0338] A[DONT_GENERATE, DONT_INLINE]
                      0x0396: PHI (r24v4 java.lang.String) = (r24v3 java.lang.String), (r24v6 java.lang.String) binds: [B:148:0x0393, B:120:0x0338] A[DONT_GENERATE, DONT_INLINE]
                      0x0396: PHI (r25v3 java.lang.String) = (r25v2 java.lang.String), (r25v5 java.lang.String) binds: [B:148:0x0393, B:120:0x0338] A[DONT_GENERATE, DONT_INLINE]
                      0x0396: PHI (r26v2 java.lang.String) = (r26v1 java.lang.String), (r26v4 java.lang.String) binds: [B:148:0x0393, B:120:0x0338] A[DONT_GENERATE, DONT_INLINE]
                      0x0396: PHI (r27v1 java.lang.String) = (r27v0 java.lang.String), (r27v3 java.lang.String) binds: [B:148:0x0393, B:120:0x0338] A[DONT_GENERATE, DONT_INLINE]] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ() {
                        /*
                            Method dump skipped, instruction units count: 1069
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1176840gjK.LIZ():void");
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PoiDetailDiscoveryMapPopupAssem@a7a9.updateData$2");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PoiDetailDiscoveryMapPopupAssem@a7a9.updateData$2");
                    }
                });
                return;
            }
            return;
        }
        FrameLayout frameLayout3 = this.LLJI;
        if (frameLayout3 != null) {
            C786410Ut5.LJJJJIZL(frameLayout3);
        }
    }
}
