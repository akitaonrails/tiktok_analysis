package com.ss.android.ugc.feed.platform.panel;

import X.AbstractC738140SxQ;
import X.AbstractRunnableC789380Uxs;
import X.AnonymousClass0956;
import X.C01GW;
import X.C05K5;
import X.C0BOY;
import X.C0PC4;
import X.C0QSJ;
import X.C0RD6;
import X.C0RJN;
import X.C0SZ8;
import X.C0T0K;
import X.C0X35;
import X.C1332005Je;
import X.C1333205Jq;
import X.C1333305Jr;
import X.C1389300mG0;
import X.C1557940qe0;
import X.C1558520qew;
import X.C1559670qgn;
import X.C1562760qlm;
import X.C1562830qlt;
import X.C1565960qqw;
import X.C1565970qqx;
import X.C1565980qqy;
import X.C1566010qr1;
import X.C1566020qr2;
import X.C1566030qr3;
import X.C1566040qr4;
import X.C1566080qr8;
import X.C1566090qr9;
import X.C1566110qrB;
import X.C1566140qrE;
import X.C1578630rBN;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2254708sT;
import X.C23250099c;
import X.C265890AbT;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.C640940PCa;
import X.C673150Qan;
import X.C687700QyG;
import X.C691710RBh;
import X.C714490S0x;
import X.C724240Sb0;
import X.C725410Sct;
import X.C725430Scv;
import X.C737010Svb;
import X.C737030Svd;
import X.C738570Sy7;
import X.C786410Ut5;
import X.C793770VBv;
import X.C799570VYd;
import X.EnumC1333405Js;
import X.EnumC452301pR;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC734530Srb;
import Y.ARunnableS124S0100000_24;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.monitor.ComponentTraceVM;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.feed.platform.performance.ScopePerformanceVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class RootPanelComponent extends RootLifecycleBridgeComponent implements IRootAbility, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public final C01GW LLJILJIL;
    public final C01GW<C714490S0x> LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public boolean LLJJIJI;
    public C1333305Jr<InterfaceC1565950qqv, C2189821An6> LLJJIJIIJIL;
    public C05K5 LLJJIJIL;
    public final C01GW LLJJJ;
    public SleepHourComponentAbility LLJJJIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == SleepHourComponentAbility.class) {
            this.LLJJJIL = (SleepHourComponentAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{RootPanelScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == SleepHourComponentAbility.class) {
            return this.LLJJJIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RootPanelScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RootPanelScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 528344913) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == SleepHourComponentAbility.class) {
            this.LLJJJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.IRootAbility
    public final InterfaceC734530Srb AA0() {
        IPanelConfigurationProtocol iPanelConfigurationProtocol = (IPanelConfigurationProtocol) this.LLJJI.getValue();
        if (iPanelConfigurationProtocol instanceof InterfaceC734530Srb) {
            return (InterfaceC734530Srb) iPanelConfigurationProtocol;
        }
        return null;
    }

    public final void Go() {
        if (this.LLJJIJI) {
            return;
        }
        this.LLJJIJI = true;
        C1333305Jr<InterfaceC1565950qqv, C2189821An6> c1333305Jr = this.LLJJIJIIJIL;
        if (c1333305Jr != null) {
            AnonymousClass0956 anonymousClass0956 = c1333305Jr.LJFF;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            C1333205Jq c1333205Jq = c1333305Jr.LJ;
            c1333205Jq.getClass();
            c1333205Jq.LIZ(EnumC1333405Js.RENDER_FIRST_FRAME);
        }
        if (((Number) C265890AbT.LIZ.getValue()).intValue() > 0) {
            final C1562830qlt c1562830qlt = (C1562830qlt) this.LLJJJ.getValue();
            c1562830qlt.getClass();
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, C799570VYd.LIZJ(), new Runnable() { // from class: X.0qll
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ComponentPerformanceReport@24eb.unregister$1");
                    try {
                        C725430Scv.LJI(C725410Sct.LIZ, c1562830qlt.LIZJ);
                        C725430Scv.LJI(C738570Sy7.LIZ, c1562830qlt.LIZLLL);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ComponentPerformanceReport@24eb.unregister$1");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.IRootAbility
    public final C714490S0x es1() {
        return this.LLJILJILJ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
        C1566080qr8.LIZ(getPanelContext(), new AwS603S0100000_24(this, 398), true);
        super.onDestroy();
        C1333305Jr<InterfaceC1565950qqv, C2189821An6> c1333305Jr = this.LLJJIJIIJIL;
        if (c1333305Jr != null) {
            C1333205Jq c1333205Jq = c1333305Jr.LJ;
            c1333205Jq.getClass();
            c1333205Jq.LIZ(EnumC1333405Js.DESTROY);
        }
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
        C1566080qr8.LIZ(getPanelContext(), new C1566030qr3(this), true);
        View view = getSupervisor().LLJJIII;
        if (view != null) {
            Ao(view);
            oo(view);
        }
    }

    public RootPanelComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1514), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559670qgn(false, this));
        }
        this.LLJILJIL = c01gwLIZIZ;
        this.LLJILJILJ = C452501pT.LIZIZ(new C1565980qqy());
        this.LLJJI = C452501pT.LIZIZ(new C1557940qe0(this));
        this.LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1513));
        this.LLJJJ = C452501pT.LIZIZ(new C1562760qlm(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() throws JSONException {
        super.onCreate();
        C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
        C1566080qr8.LIZ(getPanelContext(), new C1566020qr2(this), true);
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            this.LLJJIJIIJIL = new C1333305Jr<>(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(getLifecycle()), this, c2189821An6);
            getPanelContext();
            this.LLJJIJIL = new C05K5(this.LLJJIJIIJIL);
        }
        if (((Number) C265890AbT.LIZ.getValue()).intValue() > 0) {
            C1562830qlt c1562830qlt = (C1562830qlt) this.LLJJJ.getValue();
            c1562830qlt.getClass();
            if (C725430Scv.LJ(C725410Sct.LIZ, 0.01f, c1562830qlt.LIZJ)) {
                C725430Scv.LJ(C738570Sy7.LIZ, 1.0f, c1562830qlt.LIZLLL);
            }
        }
        ConfigurationProtocol configurationProtocol = (ConfigurationProtocol) this.LLJJI.getValue();
        if (configurationProtocol == null) {
            "No configuration matching the PanelScene!".toString();
            throw new IllegalArgumentException("No configuration matching the PanelScene!");
        }
        C0X35.LIZ("rootpanelcomponent_oncreate_duration", false);
        configurationProtocol.cD1(this);
        C05K5 c05k5 = this.LLJJIJIL;
        if (c05k5 != null) {
            Iterator it2 = ((List) this.LLJJIII.getValue()).iterator();
            while (it2.hasNext()) {
                ((IPanelComponentRegistrar) it2.next()).Ic0(c05k5);
            }
        }
        C0X35.LJIIJJI("rootpanelcomponent_oncreate_duration", false);
        C1333305Jr<InterfaceC1565950qqv, C2189821An6> c1333305Jr = this.LLJJIJIIJIL;
        if (c1333305Jr != null) {
            C1333205Jq c1333205Jq = c1333305Jr.LJ;
            c1333205Jq.getClass();
            c1333205Jq.LIZ(EnumC1333405Js.IMMEDIATE_START);
            c1333305Jr.LJFF = C23250099c.LIZLLL(c1333305Jr.LIZ, null, null, new C1332005Je(c1333305Jr, null), 3);
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList = assemSupervisorLJ != null ? assemSupervisorLJ.LLJILLL : null;
        C0RJN panelContext = getPanelContext();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, panelContext.LIZ);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
        int size = copyOnWriteArrayList != null ? copyOnWriteArrayList.size() : 0;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("count", size);
        C793770VBv.LJII("root_component_load", jSONObject, jSONObject2, null);
        if (C299750Boz.LIZ()) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS124S0100000_24(this, 87));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLJJ = true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        this.LLJJ = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
        C1566080qr8.LIZ(getPanelContext(), new C1566040qr4(this), true);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
        C1566080qr8.LIZ(getPanelContext(), new AwS603S0100000_24(this, 399), true);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.IRootAbility
    public final boolean getUserVisibleHint() {
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.IRootAbility
    public final boolean nG0() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.IRootAbility
    public final void G21(final C737010Svb c737010Svb) {
        getPanelContext().LIZIZ.yQ2("event_legacy_internal_video_event", new Observer() { // from class: X.0SrW
            public final /* synthetic */ int LL = 5;

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
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C0RD4 c0rd4 = (C0RD4) obj;
                C737030Svd c737030Svd = null;
                Object obj2 = null;
                if (c0rd4 != null) {
                    Object obj3 = c0rd4.LIZIZ;
                    if (obj3 != null) {
                        obj2 = obj3;
                    }
                    c737030Svd = (C737030Svd) obj2;
                }
                int i = this.LL;
                if (i == -1 || (c737030Svd != null && c737030Svd.LIZ == i)) {
                    c737010Svb.invoke(c737030Svd);
                }
            }
        }, false);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.RootLifecycleBridgeComponent, X.InterfaceC743730TFj
    public final void P9(Bundle bundle) {
        C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate():");
        sbLIZ.append(getPanelContext().LJ);
        C1566080qr8.LIZJ(C2188811AlT.LIZIZ(sbLIZ), null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.IRootAbility
    public final void Ss1(C737030Svd c737030Svd) {
        if (C1578630rBN.LJIIIZ(this)) {
            return;
        }
        C691710RBh.LIZ(this, "event_legacy_internal_video_event", c737030Svd);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_render_first_frame", new C1565960qqw(this));
        c0rd6.LIZIZ("event_on_live_first_frame", new C1565970qqx(this));
        c0rd6.LIZIZ("event_on_private_photo_lighten_success", new AwS603S0100000_24(this, 396));
        if (C1389300mG0.LJII(getPanelContext())) {
            c0rd6.LIZIZ("event_on_request_resume_play", new AwS603S0100000_24(this, 397));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0080 A[PHI: r0
      0x0080: PHI (r0v8 int) = (r0v7 int), (r0v9 int), (r0v10 int) binds: [B:29:0x0074, B:31:0x0077, B:33:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565950qqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPagePause(int r6) {
        /*
            r5 = this;
            r3 = 0
            r5.setUserVisibleHint(r3)
            com.bytedance.assem.arch.core.AssemSupervisor r0 = X.C724240Sb0.LJ(r5)
            if (r0 == 0) goto L3d
            java.util.concurrent.CopyOnWriteArrayList<X.0SxQ> r0 = r0.LLJILLL
            if (r0 == 0) goto L3d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r0.iterator()
        L17:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.InterfaceC1565950qqv
            if (r0 == 0) goto L17
            r4.add(r1)
            goto L17
        L29:
            java.util.Iterator r1 = r4.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r1.next()
            X.0qqv r0 = (X.InterfaceC1565950qqv) r0
            r0.onPagePause(r6)
            goto L2d
        L3d:
            java.lang.String r1 = "event_on_page_pause"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            X.C691710RBh.LIZ(r5, r1, r0)
            X.01GW r0 = r5.LLJILJIL
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility r1 = (com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility) r1
            boolean r0 = X.C0BOY.LIZ()
            if (r0 == 0) goto L7f
            r2 = 0
            if (r1 == 0) goto L7f
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r0 = r1.Mb()
            if (r0 == 0) goto L7f
            X.0SZ8 r0 = r0.LJLIL()
            if (r0 == 0) goto L7f
            X.0Q7z r1 = X.C0T0K.LIZ(r0)
            if (r1 == 0) goto L7f
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility> r0 = com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility.class
            X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility r1 = (com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility) r1
            if (r1 == 0) goto L7f
            r0 = 1
            if (r6 == r0) goto L80
            r0 = 2
            if (r6 == r0) goto L80
            r0 = 3
            if (r6 == r0) goto L80
        L7c:
            r1.eO2(r3)
        L7f:
            return
        L80:
            r3 = r0
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.RootPanelComponent.onPagePause(int):void");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C0SZ8 c0sz8LJLIL;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        RootCellCommonAbility rootCellCommonAbility;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        int i2 = 1;
        setUserVisibleHint(true);
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1565950qqv) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1565950qqv) it2.next()).onPageResume(i);
            }
        }
        C691710RBh.LIZ(this, "event_on_page_resume", Integer.valueOf(i));
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJILJIL.getValue();
        if (C0BOY.LIZ() && iFeedPanelPlatformAbility != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) != null && (c0sz8LJLIL = iViewPagerComponentAbilityMb.LJLIL()) != null && (interfaceC665370Q7zLIZ = C0T0K.LIZ(c0sz8LJLIL)) != null && (rootCellCommonAbility = (RootCellCommonAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, RootCellCommonAbility.class, null)) != null) {
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 0;
                    }
                }
            }
            rootCellCommonAbility.bE1(i2);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws JSONException {
        int i;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        super.onViewCreated(view);
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJILJIL.getValue();
        if (iFeedPanelPlatformAbility != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) != null) {
            iViewPagerComponentAbilityMb.Bv0(new InterfaceC1616070s9l() { // from class: X.0qqu
                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onBeforePageChange() {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i2) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrolled(int i2, float f, int i3) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageScrolledEnd(int i2, float f, int i3) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageSelected(int i2, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageUnSelected(C0SZ8 c0sz8) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i2) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i2, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageSelected(int i2) {
                    String aid;
                    C0SR4 c0sr4Zv0;
                    Aweme item;
                    C0SR4 c0sr4Zv02;
                    Aweme item2;
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LL.LLJILJIL.getValue();
                    if (iFeedPanelPlatformAbility2 != null && (c0sr4Zv02 = iFeedPanelPlatformAbility2.Zv0()) != null && (item2 = c0sr4Zv02.getItem(i2 + 1)) != null) {
                        aid = item2.getAid();
                    } else {
                        aid = null;
                    }
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbility3 = (IFeedPanelPlatformAbility) this.LL.LLJILJIL.getValue();
                    if (iFeedPanelPlatformAbility3 != null && (c0sr4Zv0 = iFeedPanelPlatformAbility3.Zv0()) != null && (item = c0sr4Zv0.getItem(i2)) != null) {
                        RootPanelComponent rootPanelComponent = this.LL;
                        C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
                        C1566080qr8.LIZ(rootPanelComponent.getPanelContext(), new C1566050qr5(item, aid), false);
                    }
                }
            });
        }
        C0RJN panelContext = getPanelContext();
        ComponentTraceVM componentTraceVMLIZ = C0PC4.LIZ(panelContext.LJ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, panelContext.LIZ);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
        if (componentTraceVMLIZ != null) {
            i = componentTraceVMLIZ.LL;
        } else {
            i = 0;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("count", i);
        C793770VBv.LJII("root_component_load", jSONObject, jSONObject2, null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565950qqv
    public final void setUserVisibleHint(boolean z) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
        C1566080qr8.LIZ(getPanelContext(), new C1566010qr1(this, z), true);
        this.LLJILLL = z;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1565950qqv) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1565950qqv) it2.next()).setUserVisibleHint(z);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.RootLifecycleBridgeComponent, X.InterfaceC743730TFj
    public final void Bg(Activity activity, Fragment fragment) {
        BaseListFragmentPanel baseListFragmentPanelLIZ;
        InterfaceC734530Srb interfaceC734530SrbAA0 = AA0();
        if (interfaceC734530SrbAA0 != null) {
            getPanelContext();
            baseListFragmentPanelLIZ = interfaceC734530SrbAA0.LIZ();
        } else {
            baseListFragmentPanelLIZ = null;
        }
        this.LLJIJIL = baseListFragmentPanelLIZ;
        super.Bg(activity, fragment);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.RootLifecycleBridgeComponent, X.InterfaceC743730TFj
    public final void LLZLLLL(View view, Bundle bundle) {
        if (((Number) C299750Boz.LIZ.getValue()).intValue() == 2) {
            Fragment fragmentLJI = getPanelContext().LJ;
            if (fragmentLJI == null) {
                fragmentLJI = C724240Sb0.LJI(this);
            }
            ScopePerformanceVM scopePerformanceVMLIZ = C640940PCa.LIZ(fragmentLJI);
            if (scopePerformanceVMLIZ != null && (!scopePerformanceVMLIZ.vQ2().isEmpty())) {
                Iterator<InterfaceC1565950qqv> it2 = scopePerformanceVMLIZ.vQ2().iterator();
                while (it2.hasNext()) {
                    C2254708sT actionHandler = it2.next().getActionHandler();
                    AFwS247S0000000_13 aFwS247S0000000_13 = AFwS247S0000000_13.get$arr$(45);
                    CopyOnWriteArraySet<AbstractRunnableC789380Uxs> copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) actionHandler.LIZJ.getValue()).remove("simple_action_key_parent_set_buck_up");
                    if (copyOnWriteArraySet != null) {
                        for (AbstractRunnableC789380Uxs abstractRunnableC789380Uxs : copyOnWriteArraySet) {
                            if (((Boolean) aFwS247S0000000_13.invoke(abstractRunnableC789380Uxs)).booleanValue()) {
                                abstractRunnableC789380Uxs.run();
                            }
                        }
                    }
                }
            }
        }
        super.LLZLLLL(view, bundle);
    }
}
