package com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem;

import X.AbstractC1387105bp;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0QSJ;
import X.C0RDX;
import X.C0RKW;
import X.C0RWZ;
import X.C0RYN;
import X.C0RZ5;
import X.C0RZA;
import X.C0RZJ;
import X.C13LE;
import X.C15438062q;
import X.C1558520qew;
import X.C19719512Dh;
import X.C2217381BqS;
import X.C265600Ab0;
import X.C452501pT;
import X.C601840Nj4;
import X.C616040OEg;
import X.C616130OEp;
import X.C673150Qan;
import X.C687700QyG;
import X.C688590Qzh;
import X.C694180RKu;
import X.C697740RYm;
import X.C697750RYn;
import X.C699160Rbe;
import X.C699500RcC;
import X.C700170RdH;
import X.C700450Rdj;
import X.C700950ReX;
import X.C701350RfB;
import X.C701360RfC;
import X.C701450RfL;
import X.C701470RfN;
import X.C701480RfO;
import X.C701490RfP;
import X.C701500RfQ;
import X.C701510RfR;
import X.C701560RfW;
import X.C701670Rfh;
import X.C702150RgT;
import X.C702320Rgk;
import X.C702330Rgl;
import X.C702350Rgn;
import X.C702360Rgo;
import X.C702420Rgu;
import X.C702830RhZ;
import X.C704830Rkn;
import X.C704840Rko;
import X.C724240Sb0;
import X.C724270Sb3;
import X.InterfaceC1146704e9;
import X.InterfaceC1364105Vn;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC608510Ntp;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC691660RBc;
import X.InterfaceC695090ROh;
import X.InterfaceC696030RRx;
import X.InterfaceC697220RWm;
import X.InterfaceC699970Rcx;
import X.InterfaceC700000Rd0;
import X.InterfaceC700020Rd2;
import X.InterfaceC700740ReC;
import X.InterfaceC701260Rf2;
import X.InterfaceC702000RgE;
import X.InterfaceC702490Rh1;
import X.InterfaceC702540Rh6;
import X.InterfaceC702810RhX;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ComponentPreloadConfig;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.ab.FcpKmpDecisionExp;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaFunnelAbility;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.next.FcpConainerAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class FcpContainerAssem extends BaseCellContentComponent<FcpContainerAssem> implements C0RWZ, PriorityProtocol, InterfaceC699970Rcx, InterfaceC700740ReC, FcpConainerAbility, InterfaceC696030RRx, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final Function0<ClientStandardModel> LLJJLIIIJLLLLLLLZ;
    public final String LLJL;
    public final InterfaceC697220RWm LLJLIL;
    public final Function0<Boolean> LLJLILLLLZIIL;
    public final Function0<View> LLJLL;
    public C0RKW LLJZIJLIL;
    public C0RKW LLL;
    public volatile FcpProtocolAbility LLLF;
    public InterfaceC665370Q7z LLLFF;
    public C0QSJ LLLFFI;
    public final /* synthetic */ C702420Rgu LLJJJJLIIL = new C702420Rgu();
    public final /* synthetic */ C701490RfP LLJJL = new C701490RfP();
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new C0RZJ(this));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new C0RZA(this));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1280));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FcpContainerAssem.class, "fcpProtocolAbility", "getFcpProtocolAbility()Lcom/ss/android/ugc/feed/platform/cell/interact/FcpProtocolAbility;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    public void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{FcpContainerScope.class});
    }

    public Object getAbility(Class cls) {
        return null;
    }

    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CellInteractAreaScope.class);
        arrayList.add(FcpContainerScope.class);
        return arrayList;
    }

    public List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FcpContainerScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean l5(boolean z) {
        return this.LLJJJJLIIL.l5(z);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    public InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1786045749) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC696030RRx
    public final InterfaceC695090ROh s0() {
        return this.LLJJL.s0();
    }

    public void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.next.FcpConainerAbility
    public final String Ko() {
        return this.LLJLIL.o1();
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean Nm() {
        return this.LLJJJJLIIL.LL;
    }

    public final void ep() {
        ArrayList arrayList;
        C701490RfP c701490RfP = this.LLJJL;
        if (c701490RfP.LLILZ) {
            C704830Rkn c704830Rkn = c701490RfP.LLILZLL;
            if (c704830Rkn != null) {
                c704830Rkn.LIZ();
            }
            C704830Rkn c704830Rkn2 = c701490RfP.LLILZLL;
            if (c704830Rkn2 != null) {
                Iterator it2 = ((LinkedHashMap) c704830Rkn2.LJII).entrySet().iterator();
                while (it2.hasNext()) {
                    ((C704830Rkn) ((Map.Entry) it2.next()).getValue()).LJFF.clear();
                }
            }
            InterfaceC702000RgE interfaceC702000RgE = c701490RfP.LL;
            if (interfaceC702000RgE != null) {
                interfaceC702000RgE.LJI();
            }
            InterfaceC702000RgE interfaceC702000RgE2 = c701490RfP.LL;
            if (!(interfaceC702000RgE2 instanceof C701360RfC) || interfaceC702000RgE2 == null) {
                return;
            }
            C701560RfW c701560RfW = C701560RfW.LIZ;
            InterfaceC700020Rd2<?> interfaceC700020Rd2 = c701490RfP.LLILZIL;
            String strLJLI = interfaceC700020Rd2 != null ? interfaceC700020Rd2.LJLI() : null;
            synchronized (c701560RfW) {
                if (C701560RfW.LIZ()) {
                    if (strLJLI == null || strLJLI.length() == 0) {
                        return;
                    }
                    List list = (List) ((LinkedHashMap) C701560RfW.LIZIZ).get(strLJLI);
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            C701360RfC c701360RfC = (C701360RfC) ((WeakReference) it3.next()).get();
                            if (c701360RfC != null) {
                                arrayList2.add(c701360RfC);
                            }
                        }
                        arrayList = new ArrayList(arrayList2);
                    } else {
                        arrayList = new ArrayList();
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            if (Intrinsics.LJFF((C701360RfC) it4.next(), interfaceC702000RgE2)) {
                                return;
                            }
                        }
                    }
                    arrayList.add(interfaceC702000RgE2);
                    Map<String, List<WeakReference<C701360RfC>>> map = C701560RfW.LIZIZ;
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        arrayList3.add(new WeakReference((C701360RfC) it5.next()));
                    }
                    map.put(strLJLI, new ArrayList(arrayList3));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public void unBind() {
        C701490RfP c701490RfP = this.LLJJL;
        if (c701490RfP.LLILZ) {
            C616040OEg c616040OEg = c701490RfP.LLILLJJLI;
            if (c616040OEg != null) {
                c616040OEg.LJJJJZ();
            }
            InterfaceC702000RgE interfaceC702000RgE = c701490RfP.LL;
            if (interfaceC702000RgE != null) {
                interfaceC702000RgE.LIZ();
            }
            C701560RfW c701560RfW = C701560RfW.LIZ;
            InterfaceC700020Rd2<?> interfaceC700020Rd2 = c701490RfP.LLILZIL;
            String strLJLI = interfaceC700020Rd2 != null ? interfaceC700020Rd2.LJLI() : null;
            synchronized (c701560RfW) {
                if (C701560RfW.LIZ()) {
                    C19719512Dh.LIZJ(C701560RfW.LIZIZ).remove(strLJLI);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        InterfaceC702000RgE interfaceC702000RgE = this.LLJJL.LL;
        if (interfaceC702000RgE == null) {
            return null;
        }
        interfaceC702000RgE.vk();
        return interfaceC702000RgE;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return zg();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0RDX.LIZIZ((InterfaceC691660RBc) it2.next());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        return LJJIJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[Catch: all -> 0x003c, PHI: r1
      0x0030: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:10:0x0012, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:7:0x000c, B:9:0x0010, B:11:0x0014, B:13:0x0018, B:14:0x001e, B:18:0x0038, B:19:0x003a, B:17:0x0030), top: B:42:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData hp() {
        /*
            r5 = this;
            boolean r0 = X.C299830Bp7.LIZ()
            r4 = 0
            if (r0 == 0) goto L61
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = r5.LLLF
            if (r0 != 0) goto L40
            monitor-enter(r5)
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = r5.LLLF     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L3f
            X.0QSJ r1 = r5.LLLFFI     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L30
            X.0Q7z r3 = r5.LLLFF     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L1e
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r5)     // Catch: java.lang.Throwable -> L3c
            r5.LLLFF = r3     // Catch: java.lang.Throwable -> L3c
        L1e:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope> r1 = com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3c
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3c
            r5.LLLFFI = r1     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L30
            r0 = r4
            goto L38
        L30:
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility> r0 = com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3c
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = (com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility) r0     // Catch: java.lang.Throwable -> L3c
        L38:
            r5.LLLF = r0     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            goto L45
        L3c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L3f:
            monitor-exit(r5)
        L40:
            X.0RKW r0 = r0.qR1()
            goto L48
        L45:
            if (r0 != 0) goto L40
            r0 = r4
        L48:
            r5.LLJZIJLIL = r0
            if (r0 == 0) goto L53
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r0 = r0.LIZ()
            if (r0 == 0) goto L53
            return r0
        L53:
            X.0RKW r0 = X.C697660RYe.LIZIZ(r5)
            r5.LLL = r0
            if (r0 == 0) goto L60
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r4 = r0.LIZ()
            return r4
        L60:
            return r4
        L61:
            X.0RKW r0 = X.C697660RYe.LIZIZ(r5)
            r5.LLL = r0
            if (r0 == 0) goto L6d
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r4 = r0.LIZ()
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem.hp():com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        C688590Qzh.LIZIZ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return Vt();
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LLLI(i);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: ip, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
        ep();
    }

    @Override // X.InterfaceC700740ReC
    public final ClientStandardModel kn(String str) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        StandardComponentInfo standardComponentInfo = ((VideoItemParams) obj).getAweme().getStandardComponentInfo();
        if (standardComponentInfo == null) {
            return null;
        }
        String strLIZ = C694180RKu.LIZ(this);
        if (strLIZ == null) {
            strLIZ = "";
        }
        return standardComponentInfo.getClientModel(str, strLIZ);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        InterfaceC702000RgE c701360RfC;
        boolean z;
        InterfaceC697220RWm interfaceC697220RWm = this.LLJLIL;
        if (interfaceC697220RWm == null) {
            return;
        }
        final String str = (String) this.LLJLLIL.getValue();
        final String str2 = (String) this.LLJLLL.getValue();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String genreType = AwemeExtKt.getGenreType(((VideoItemParams) obj).getAweme());
        final C702320Rgk c702320Rgk = new C702320Rgk(this);
        C0RYN c0ryn = new C0RYN(this);
        Function0<ClientStandardModel> function0 = this.LLJJLIIIJLLLLLLLZ;
        C702350Rgn c702350Rgn = new C702350Rgn(this);
        InteractAreaFunnelAbility interactAreaFunnelAbility = (InteractAreaFunnelAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractAreaFunnelAbility.class, null);
        Function0<Boolean> function02 = this.LLJLILLLLZIIL;
        C702150RgT c702150RgT = new C702150RgT(this);
        C702330Rgl c702330Rgl = new C702330Rgl(this);
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1281);
        AwS555S0100000_11 awS555S0100000_112 = new AwS555S0100000_11(this, 1282);
        final C701490RfP c701490RfP = this.LLJJL;
        c701490RfP.getClass();
        boolean zBooleanValue = function02.invoke().booleanValue();
        c701490RfP.LLILZ = zBooleanValue;
        if (zBooleanValue) {
            c701490RfP.LLILZIL = c0ryn;
            C616040OEg c616040OEg = new C616040OEg(getLifecycle());
            c701490RfP.LLILLJJLI = c616040OEg;
            String strLIZ = C694180RKu.LIZ(this);
            if (strLIZ != null) {
                C701670Rfh c701670Rfh = new C701670Rfh(new C702360Rgo(c702350Rgn));
                C697740RYm c697740RYm = new C697740RYm(new C697750RYn(interfaceC697220RWm), c0ryn);
                C699160Rbe c699160Rbe = new C699160Rbe(interactAreaFunnelAbility, c0ryn);
                C616130OEp c616130OEp = new C616130OEp(c616040OEg);
                final String strLIZ2 = C0RZ5.LIZ(str, genreType);
                String strO1 = interfaceC697220RWm.o1();
                final C701470RfN c701470RfN = new C701470RfN(strO1, strLIZ2, strLIZ, c702320Rgk, c616130OEp, c699160Rbe, function0, this, c0ryn, (IFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IFeedDebugService.class, false, false, false, 14, null));
                InterfaceC702810RhX interfaceC702810RhX = new InterfaceC702810RhX() { // from class: X.0RfE
                    @Override // X.InterfaceC702810RhX
                    public final List<String> LIZ() {
                        List<ComponentPreloadConfig> list;
                        FeedComponentPriorityData feedComponentPriorityDataInvoke = c702320Rgk.invoke();
                        if (feedComponentPriorityDataInvoke == null || (list = feedComponentPriorityDataInvoke.componentPreloadConfig) == null) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (ComponentPreloadConfig componentPreloadConfig : list) {
                            if (Intrinsics.LJFF(componentPreloadConfig.enableLandingPagePreload, Boolean.TRUE)) {
                                arrayList.add(componentPreloadConfig);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            String str3 = ((ComponentPreloadConfig) it2.next()).componentKey;
                            if (str3 == null) {
                                str3 = "";
                            }
                            arrayList2.add(str3);
                        }
                        return arrayList2;
                    }

                    @Override // X.InterfaceC702810RhX
                    public final String LIZIZ() {
                        return str;
                    }

                    @Override // X.InterfaceC702810RhX
                    public final String getEventType() {
                        return str2;
                    }

                    @Override // X.InterfaceC702810RhX
                    public final String LIZJ(String str3) {
                        Map<String, GlobalComponentData> map;
                        GlobalComponentData globalComponentData;
                        FeedComponentPriorityData feedComponentPriorityDataInvoke = c702320Rgk.invoke();
                        if (feedComponentPriorityDataInvoke != null && (map = feedComponentPriorityDataInvoke.globalComponentMap) != null && (globalComponentData = map.get(str3)) != null) {
                            C700410Rdf.LIZ.getClass();
                            return C700410Rdf.LIZIZ(globalComponentData);
                        }
                        return null;
                    }

                    @Override // X.InterfaceC702810RhX
                    public final Map<String, String> LIZLLL(String str3, String str4) {
                        LinkedHashMap linkedHashMap;
                        C704830Rkn c704830RknLIZIZ;
                        Object next;
                        Function2<WeakReference<C704830Rkn>, String, Map<String, String>> function2Ak;
                        Map<String, String> mapInvoke;
                        Map<String, Map<String, String>> map;
                        Map<String, String> map2;
                        ClientStandardModel clientStandardModelKn = ((C700720ReA) c701470RfN.LJIIJ.getValue()).LJFF.kn(strLIZ2);
                        if (clientStandardModelKn != null && (map = clientStandardModelKn.componentsMobMap) != null && (map2 = map.get(str3)) != null) {
                            linkedHashMap = new LinkedHashMap(map2);
                        } else {
                            linkedHashMap = new LinkedHashMap();
                        }
                        Iterator it2 = ServiceManager.get().getServices(IStandardConfigProvider.class).iterator();
                        while (true) {
                            c704830RknLIZIZ = null;
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(((IStandardConfigProvider) next).o7(), str3)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        IStandardConfigProvider iStandardConfigProvider = (IStandardConfigProvider) next;
                        if (iStandardConfigProvider != null) {
                            function2Ak = iStandardConfigProvider.ak();
                        } else {
                            function2Ak = null;
                        }
                        C704830Rkn c704830Rkn = c701490RfP.LLILZLL;
                        if (c704830Rkn != null) {
                            c704830RknLIZIZ = c704830Rkn.LIZIZ(str3);
                        }
                        if (function2Ak != null && (mapInvoke = function2Ak.invoke(new WeakReference<>(c704830RknLIZIZ), str4)) != null) {
                            linkedHashMap.putAll(mapInvoke);
                        }
                        return linkedHashMap;
                    }
                };
                C704840Rko c704840Rko = new C704840Rko();
                c704840Rko.LJI = interfaceC702810RhX;
                c704840Rko.LJII = String.valueOf(c702150RgT.invoke().hashCode());
                C704830Rkn c704830Rkn = new C704830Rkn(c702150RgT, interfaceC697220RWm.o1(), C694180RKu.LIZ(this), c702330Rgl, c704840Rko, new LinkedHashMap());
                c701490RfP.LLILZLL = c704830Rkn;
                C701480RfO c701480RfO = new C701480RfO(strLIZ2, this, c616040OEg, c0ryn, this, c701670Rfh, c704830Rkn);
                if (FcpKmpDecisionExp.LIZ(strO1)) {
                    C700170RdH c700170RdHJ9 = interfaceC697220RWm.J9();
                    if (c700170RdHJ9 != null) {
                        c700170RdHJ9.LJIIZILJ = new AwS625S0100000_11(c616040OEg, 143);
                        c700170RdHJ9.LJIILJJIL = awS555S0100000_112;
                        c700170RdHJ9.LJIJ = new C701450RfL(c701490RfP, c704830Rkn, c701470RfN, strLIZ2, c701480RfO, c701670Rfh);
                    }
                    c701360RfC = new C701350RfB(strLIZ2, c701470RfN, c697740RYm, c701480RfO, c616040OEg, c704830Rkn, new AwS555S0100000_11(interfaceC697220RWm, 1590));
                } else {
                    C701500RfQ c701500RfQ = c701490RfP.LLILLL;
                    if (((Boolean) C265600Ab0.LIZ.getValue()).booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c701360RfC = new C701360RfC(strLIZ2, c701470RfN, c697740RYm, c701480RfO, c701670Rfh, c616040OEg, c701500RfQ, c704830Rkn, z, awS555S0100000_11);
                }
                c701490RfP.LL = c701360RfC;
                c616040OEg.LLILLJJLI = new InterfaceC608510Ntp(c701490RfP, this) { // from class: X.0RgG
                    public final C701800Rfu LIZ;
                    public final C702030RgH LIZIZ;

                    @Override // X.InterfaceC608510Ntp
                    public final C701800Rfu LIZ() {
                        return this.LIZ;
                    }

                    @Override // X.InterfaceC608510Ntp
                    public final C702030RgH LIZIZ() {
                        return this.LIZIZ;
                    }

                    {
                        this.LIZ = new C701800Rfu(c701490RfP);
                        this.LIZIZ = new C702030RgH(this);
                    }
                };
                InterfaceC702000RgE interfaceC702000RgE = c701490RfP.LL;
                if (interfaceC702000RgE != null) {
                    interfaceC702000RgE.LIZLLL();
                }
            }
            for (IStandardConfigProvider iStandardConfigProvider : ServiceManager.get().getServices(IStandardConfigProvider.class)) {
                Function1<Lifecycle, InterfaceC702490Rh1<? extends Object>> function1H1 = iStandardConfigProvider.h1();
                if (function1H1 != null) {
                    C702830RhZ.LIZ.put(iStandardConfigProvider.o7(), function1H1);
                }
                Map<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>> mapI5 = iStandardConfigProvider.I5();
                if (mapI5 != null) {
                    for (Map.Entry<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>> entry : mapI5.entrySet()) {
                        C601840Nj4.LIZ(iStandardConfigProvider.o7(), entry.getKey(), entry.getValue());
                    }
                }
                Function1<WeakReference<C704830Rkn>, InterfaceC702540Rh6> function1G3 = iStandardConfigProvider.g3();
                if (function1G3 != null) {
                    C701510RfR c701510RfR = C701510RfR.LIZ;
                    String strO7 = iStandardConfigProvider.o7();
                    c701510RfR.getClass();
                    ((ConcurrentHashMap) C701510RfR.LIZIZ).put(strO7, function1G3);
                }
            }
            List<IStandardConfigProvider> list = (List) c701490RfP.LLIZ.getValue();
            if (list != null) {
                for (IStandardConfigProvider iStandardConfigProvider2 : list) {
                    Function1<Lifecycle, InterfaceC702490Rh1<? extends Object>> function1H12 = iStandardConfigProvider2.h1();
                    if (function1H12 != null) {
                        C702830RhZ.LIZ.put(iStandardConfigProvider2.o7(), function1H12);
                    }
                    Map<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>> mapI52 = iStandardConfigProvider2.I5();
                    if (mapI52 != null) {
                        for (Map.Entry<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>> entry2 : mapI52.entrySet()) {
                            C601840Nj4.LIZ(iStandardConfigProvider2.o7(), entry2.getKey(), entry2.getValue());
                        }
                    }
                    Function1<WeakReference<C704830Rkn>, InterfaceC702540Rh6> function1G32 = iStandardConfigProvider2.g3();
                    if (function1G32 != null) {
                        C701510RfR c701510RfR2 = C701510RfR.LIZ;
                        String strO72 = iStandardConfigProvider2.o7();
                        c701510RfR2.getClass();
                        ((ConcurrentHashMap) C701510RfR.LIZIZ).put(strO72, function1G32);
                    }
                }
            }
        }
    }

    @Override // X.C0RWZ
    public final void qa(C700950ReX c700950ReX) {
        InterfaceC702000RgE interfaceC702000RgE = this.LLJJL.LL;
        if (interfaceC702000RgE != null) {
            interfaceC702000RgE.LJIIIIZZ(c700950ReX);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
            }
        }
    }

    @Override // X.InterfaceC700740ReC
    public final void p5(ClientStandardModel clientStandardModel, String str) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        StandardComponentInfo standardComponentInfo = ((VideoItemParams) obj).getAweme().getStandardComponentInfo();
        if (standardComponentInfo != null) {
            String strLIZ = C694180RKu.LIZ(this);
            if (strLIZ == null) {
                strLIZ = "";
            }
            standardComponentInfo.putClientModel(str, strLIZ, clientStandardModel);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FcpContainerAssem(Function0<ClientStandardModel> function0, String str, InterfaceC697220RWm interfaceC697220RWm, Function0<Boolean> function02, Function0<? extends View> function03) {
        this.LLJJLIIIJLLLLLLLZ = function0;
        this.LLJL = str;
        this.LLJLIL = interfaceC697220RWm;
        this.LLJLILLLLZIIL = function02;
        this.LLJLL = function03;
    }
}
