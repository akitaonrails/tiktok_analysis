package lnn;

import X.AbstractC1291220jho;
import X.C01GW;
import X.C05YF;
import X.C0BN4;
import X.C0ETY;
import X.C1320700kTM;
import X.C1322110kVd;
import X.C1324750kZt;
import X.C1326470kcf;
import X.C13LE;
import X.C13LP;
import X.C1449340noq;
import X.C1638070sjF;
import X.C1638230sjV;
import X.C1656550tD3;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C1848410yCV;
import X.C19GS;
import X.C19IN;
import X.C1DRG;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C259800zU;
import X.C342540Dbo;
import X.C343070Dcf;
import X.C417370GYd;
import X.C452501pT;
import X.C560530Lyd;
import X.C579450Mo3;
import X.C786410Ut5;
import X.InterfaceC1330440kj4;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625470sOv;
import X.InterfaceC1628900sUS;
import X.InterfaceC1638150sjN;
import X.InterfaceC1648570t0B;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.ViewOnTouchListenerC1657570tEh;
import Y.AObjectS185S0300000_25;
import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import Y.AObserverS130S0300000_25;
import Y.AObserverS227S0100000_25;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import avg.f;
import com.bytedance.als.LiveEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS19S2300000_25;
import kotlin.jvm.internal.AwS39S1400000_25;
import kotlin.jvm.internal.AwS58S0500000_25;
import lnn.l;
import lnn.q;
import mf.a;

/* JADX INFO: loaded from: classes26.dex */
public final class l implements InterfaceC379610EuV {
    public static final C1638070sjF LLJJIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final q LL;
    public final Function1<C1449340noq, Unit> LLILLJJLI;
    public final boolean LLILLL;
    public final C417370GYd LLILZ;
    public final C1DRG LLILZIL;
    public final Function0<Unit> LLILZLL;
    public Effect LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public boolean LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;
    public final C01GW LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(l.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIII = new C1638070sjF();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZIL;
    }

    public final void LIZ(TuxIconView tuxIconView, Effect effect) {
        MobileEffect mobileEffect;
        if (tuxIconView == null) {
            return;
        }
        C01GW c01gw = C342540Dbo.LIZ;
        int i = 0;
        if (C1656550tD3.LIZ() && (effect instanceof MobileEffect) && (mobileEffect = (MobileEffect) effect) != null && mobileEffect.getModerationStatus() == 2 && !this.LLILLL) {
            tuxIconView.setImageDrawable(C342540Dbo.LIZ(tuxIconView.getContext()));
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, X.0sjL] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, X.0sjK] */
    public final void LIZIZ(C1322110kVd c1322110kVd, Effect effect) {
        AbstractC1291220jho abstractC1291220jho = null;
        if (C0BN4.LIZ()) {
            List<String> urlList = effect.getIconUrl().getUrlList();
            C259800zU c259800zU = new C259800zU();
            final long j = this.LLJIJIL;
            if (j > 0) {
                this.LLJIJIL = -1L;
                c259800zU.element = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0sjK
                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LJ(String str, Object obj, Animatable animatable) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("type", "tool_performance_effect_preview_icon_show_duration");
                        c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "totaltime");
                        C20684815ws.LJIILLIIL("tool_performance_operation_cost_time", c2344009Gk.LIZ);
                    }
                };
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJJ);
            sbLIZ.append("@@");
            sbLIZ.append(this.LLJILLL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1638230sjV c1638230sjV = C1638230sjV.LIZ;
            if (C1326470kcf.LIZJ()) {
                c1638230sjV.LJFF(effect, c1322110kVd, -1, -1, Bitmap.Config.ARGB_8888, null, (C1320700kTM) c259800zU.element, new AwS39S1400000_25(c1322110kVd, (C1322110kVd) urlList, (List<String>) this, (l) c259800zU, (C259800zU<C1320700kTM<InterfaceC1330440kj4>>) strLIZIZ, (String) 3));
                return;
            }
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (this.LLILLL) {
                abstractC1291220jho = (AbstractC1291220jho) this.LLJJI.getValue();
            }
            C1324750kZt.LJIILIIL(c1322110kVd, urlList, -1, -1, config, abstractC1291220jho, null, (C1320700kTM) c259800zU.element, strLIZIZ);
            return;
        }
        String str = (String) C13LP.LJJJLL(effect.getIconUrl().getUrlList());
        if (str == null) {
            return;
        }
        C259800zU c259800zU2 = new C259800zU();
        final long j2 = this.LLJIJIL;
        if (j2 > 0) {
            this.LLJIJIL = -1L;
            c259800zU2.element = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0sjL
                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LJ(String str2, Object obj, Animatable animatable) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("type", "tool_performance_effect_preview_icon_show_duration");
                    c2344009Gk.LIZLLL(System.currentTimeMillis() - j2, "totaltime");
                    C20684815ws.LJIILLIIL("tool_performance_operation_cost_time", c2344009Gk.LIZ);
                }
            };
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LLJJ);
        sbLIZ2.append("@@");
        sbLIZ2.append(this.LLJILLL);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C1638230sjV c1638230sjV2 = C1638230sjV.LIZ;
        if (C1326470kcf.LIZJ()) {
            c1638230sjV2.LJFF(effect, c1322110kVd, -1, -1, Bitmap.Config.ARGB_8888, null, (C1320700kTM) c259800zU2.element, new AwS19S2300000_25(c1322110kVd, (C1322110kVd) str, (String) this, (l) c259800zU2, (C259800zU<C1320700kTM<InterfaceC1330440kj4>>) strLIZIZ2, (String) 1));
            return;
        }
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (this.LLILLL) {
            abstractC1291220jho = (AbstractC1291220jho) this.LLJJI.getValue();
        }
        C1324750kZt.LJIIL(c1322110kVd, str, -1, -1, config2, abstractC1291220jho, null, (C1320700kTM) c259800zU2.element, strLIZIZ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(final C19GS c19gs, LifecycleOwner lifecycleOwner, final boolean z, q qVar, Function1<? super C1449340noq, Unit> function1, final ViewGroup viewGroup, final C1322110kVd c1322110kVd, boolean z2, C417370GYd c417370GYd, C417370GYd c417370GYd2, C1DRG c1drg, Function0<Unit> function0) {
        C560530Lyd c560530LydLIZ;
        C560530Lyd c560530LydLIZIZ;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLJIJJLI;
        this.LL = qVar;
        this.LLILLJJLI = function1;
        this.LLILLL = z2;
        this.LLILZ = c417370GYd2;
        this.LLILZIL = c1drg;
        this.LLILZLL = function0;
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1648570t0B.class, null);
        this.LLJ = "";
        this.LLJI = "";
        this.LLJIJIL = System.currentTimeMillis();
        this.LLJILJIL = -1L;
        this.LLJILLL = "creation";
        this.LLJJ = "prop_panel_entrance";
        this.LLJJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(455));
        final C259800zU c259800zU = new C259800zU();
        if (z) {
            function1.invoke(new C1449340noq("show_delete_prop", null, null, null, null, 30));
        }
        if (c417370GYd2 != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.0sjH
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    q qVar2 = this.LL.LL;
                    if (qVar2 != null) {
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJJI("action_type", "click_cancel", bundle);
                        qVar2.w4().LIZJ(C1622820sKe.LIZ(null, bundle, 5));
                    }
                    q qVar3 = this.LL.LL;
                    if (qVar3 != null) {
                        qVar3.NJ(false, false);
                    }
                    if (z) {
                        this.LL.LLILLJJLI.invoke(new C1449340noq("click_delete_prop", "special_icon", null, null, null, 28));
                        return;
                    }
                    l lVar = this.LL;
                    if (lVar.LLIZLLLIL) {
                        lVar.LLILLJJLI.invoke(new C1449340noq("click_delete_prop", "music_recommend", lVar.LLJI, lVar.LLJ, null, 16));
                    } else {
                        lVar.LLILLJJLI.invoke(new C1449340noq("click_delete_prop", null, null, null, Long.valueOf(lVar.LLJILJIL), 14));
                    }
                }
            };
            a aVar = new a(C1848410yCV.LIZ ? new f(onClickListener) : onClickListener);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c417370GYd2);
            }
            c417370GYd2.setOnClickListener(aVar);
        }
        C786410Ut5.K7(viewGroup, new C19IN(c19gs, viewGroup, c259800zU) { // from class: X.0sjI
            public final /* synthetic */ ViewGroup LLIZ;
            public final /* synthetic */ C259800zU<Effect> LLIZLLLIL;

            /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
            @Override // X.C19IN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(android.view.View r7) {
                /*
                    Method dump skipped, instruction units count: 316
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1638100sjI.LIZ(android.view.View):void");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0, 3);
                this.LLIZ = viewGroup;
                this.LLIZLLLIL = c259800zU;
            }
        });
        viewGroup.setOnTouchListener(new ViewOnTouchListenerC1657570tEh(1.2f, 150L, c1322110kVd));
        final TuxIconView tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.tgl);
        if (C343070Dcf.LIZ()) {
            ((C0ETY) c1drg.LJII(C0ETY.class, null)).Sd(InterfaceC1628900sUS.class, new AwS58S0500000_25(lifecycleOwner, viewGroup, this, c1322110kVd, tuxIconView, 9));
        } else {
            C05YF c05yf = (C05YF) c1drg.LJIIL(null, InterfaceC1628900sUS.class);
            if (c05yf != null) {
                InterfaceC1628900sUS interfaceC1628900sUS = (InterfaceC1628900sUS) c05yf;
                interfaceC1628900sUS.getShowEntrance().observe(lifecycleOwner, new AObserverS130S0300000_25(this, c1322110kVd, tuxIconView, 3));
                interfaceC1628900sUS.fM0(viewGroup);
            }
        }
        if (qVar != null && (interfaceC1624480sNKC0 = qVar.C0()) != null && (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) != null && (mutableLiveDataLJIJJLI = interfaceC1625470sOvLJII.LJIJJLI()) != null) {
            mutableLiveDataLJIJJLI.observe(lifecycleOwner, new Observer() { // from class: X.0sjJ
                /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
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
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onChanged(java.lang.Object r6) {
                    /*
                        r5 = this;
                        com.ss.android.ugc.effectmanager.effect.model.Effect r6 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r6
                        lnn.l r0 = r5.LL
                        lnn.q r0 = r0.LL
                        boolean r0 = r0.Tw1(r6)
                        X.C1458960o4M.LIZLLL = r0
                        r4 = 1
                        if (r6 == 0) goto L23
                        boolean r0 = X.C1449600npG.LIZIZ(r6)
                        if (r0 != r4) goto L23
                        r0 = 1
                    L16:
                        r2 = 0
                        if (r0 != 0) goto L1c
                        r3 = r6
                        if (r6 != 0) goto L25
                    L1c:
                        lnn.l r0 = r5.LL
                        com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r0.LLIZ
                        if (r3 != 0) goto L25
                        return
                    L23:
                        r0 = 0
                        goto L16
                    L25:
                        X.00zU<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r2
                        T r0 = r0.element
                        if (r0 == 0) goto L62
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
                        if (r0 == 0) goto L62
                        if (r6 == 0) goto L62
                        com.bytedance.keva.Keva r0 = X.C1194904lv.LIZ
                        java.lang.String r0 = r3.getEffect_id()
                        java.util.List<java.lang.String> r2 = X.C1194904lv.LIZIZ
                        java.util.ArrayList r2 = (java.util.ArrayList) r2
                        boolean r0 = r2.contains(r0)
                        if (r0 == 0) goto L5d
                        java.lang.String r1 = r3.getId()
                        com.bytedance.keva.Keva r0 = X.C1194904lv.LIZ
                        r0.storeBoolean(r1, r4)
                        r2.remove(r1)
                        lnn.l r1 = r5.LL
                        X.0kVd r0 = r3
                        r1.LIZIZ(r0, r3)
                        lnn.l r1 = r5.LL
                        com.bytedance.tux.icon.TuxIconView r0 = r4
                        r1.LIZ(r0, r3)
                    L5d:
                        X.00zU<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r2
                        r0.element = r3
                        return
                    L62:
                        lnn.l r1 = r5.LL
                        X.0kVd r0 = r3
                        r1.LIZIZ(r0, r3)
                        lnn.l r1 = r5.LL
                        com.bytedance.tux.icon.TuxIconView r0 = r4
                        r1.LIZ(r0, r3)
                        if (r6 != 0) goto L5d
                        X.00zU<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r2
                        r0.element = r2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1638110sjJ.onChanged(java.lang.Object):void");
                }
            });
        }
        List<String> list = C579450Mo3.LIZ;
        C579450Mo3.LIZ((ShortVideoContext) c1drg.LJII(ShortVideoContext.class, null));
        if (qVar != null) {
            LiveEvent<Boolean> liveEventDN1 = qVar.dN1();
            if (liveEventDN1 != null) {
                liveEventDN1.LIZ(lifecycleOwner, new AObjectS306S0200000_25((Object) this, (Object) c417370GYd, (InterfaceC1648570t0B) 29));
            }
            LiveEvent<Boolean> liveEventAD0 = qVar.aD0();
            if (liveEventAD0 != null) {
                liveEventAD0.LIZ(lifecycleOwner, new AObjectS306S0200000_25((Object) c1322110kVd, (Object) this, (InterfaceC1648570t0B) 30));
            }
            InterfaceC1638150sjN interfaceC1638150sjNQb0 = qVar.Qb0();
            if (interfaceC1638150sjNQb0 != null && (c560530LydLIZIZ = interfaceC1638150sjNQb0.LIZIZ()) != null) {
                c560530LydLIZIZ.LIZ(lifecycleOwner, new AObjectS185S0300000_25(tuxIconView, this, c1322110kVd, 24));
            }
            InterfaceC1638150sjN interfaceC1638150sjNQb02 = qVar.Qb0();
            if (interfaceC1638150sjNQb02 != null && (c560530LydLIZ = interfaceC1638150sjNQb02.LIZ()) != null) {
                c560530LydLIZ.LIZ(lifecycleOwner, new AObjectS246S0100000_25(this, 710));
            }
            LiveData<Pair<Boolean, Boolean>> liveDataQC0 = qVar.QC0();
            if (liveDataQC0 != null) {
                liveDataQC0.observe(lifecycleOwner, new AObserverS227S0100000_25(this, 95));
            }
        }
        ((InterfaceC1648570t0B) c1664750tQHLIZ.getValue(this, LLJJIJI[0])).lC2().LIZ(lifecycleOwner, new AObjectS246S0100000_25(this, 711));
        if (z && qVar != null) {
            qVar.NJ(true, false);
        }
    }
}
