package com.ss.android.ugc.aweme.poi.detail.map;

import X.C019F;
import X.C09R3;
import X.C0H4Y;
import X.C0H4Z;
import X.C1173300gdc;
import X.C1174850gg7;
import X.C1175070ggT;
import X.C1175530ghD;
import X.C1175600ghK;
import X.C1175680ghS;
import X.C1175690ghT;
import X.C1176580giu;
import X.C1177300gk4;
import X.C1177360gkA;
import X.C1177960gl8;
import X.C1178480gly;
import X.C1185410gx9;
import X.C1185600gxS;
import X.C123100dR;
import X.C12KQ;
import X.C12P5;
import X.C13LE;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1637806bA;
import X.C166V;
import X.C1697810uHb;
import X.C18JG;
import X.C19719912Dl;
import X.C19M2;
import X.C19MB;
import X.C19ME;
import X.C20742216Eq;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1175760gha;
import X.EnumC197015126j;
import X.InterfaceC1177250gjz;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.MessageSyncer;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.CleanModeHeaderConfig;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponseV2;
import com.ss.android.ugc.aweme.poi.map.model.DynamicMapParams;
import com.ss.android.ugc.aweme.poi.mapdetail.PoiMapDetailFragment;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiFeedFilterKeyCategory;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeEnterMethod;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeTargetData;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS147S0400000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiBackgroundMapComponent extends PoiDetailBaseUiSlotComponent<PoiDiscoveryApi$PoiDiscoveryCardListResponseV2> implements ContainerEventDispatcher$PageScrollCallBackAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public static final int LLJL;
    public final C166V LLJJIJI = new C166V(new AwS597S0100000_18((UISlotAssem) this, 339));
    public final AssemVMLazy LLJJIJIIJIL;
    public InterfaceC1177250gjz LLJJIJIL;
    public int LLJJJ;
    public Animator LLJJJIL;
    public Animator LLJJJJ;
    public final MessageSyncer LLJJJJJIL;
    public boolean LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiBackgroundMapComponent.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiDetailBackgroundTopMapV2Binding;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiBackgroundMapComponent.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(329));
        LLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    }

    public PoiBackgroundMapComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 549), AFwS256S0000000_18.get$arr$(409), null, true);
        this.LLJJJJJIL = new MessageSyncer();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dze;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent
    public final boolean mp() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
    public final void oq(int i) {
    }

    public final C1177300gk4 tp() {
        C166V c166v = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (C1177300gk4) c166v.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        CleanModeHeaderConfig cleanModeHeaderConfig;
        Integer num;
        PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 poiDiscoveryApi$PoiDiscoveryCardListResponseV2 = (PoiDiscoveryApi$PoiDiscoveryCardListResponseV2) baseComponentData;
        super.CG1(poiDiscoveryApi$PoiDiscoveryCardListResponseV2);
        PoiListApi.PoiDetailResponse poiDetailResponseIp = ip();
        if (poiDetailResponseIp != null && (cleanModeHeaderConfig = poiDetailResponseIp.getCleanModeHeaderConfig()) != null && (num = cleanModeHeaderConfig.shouldShowShare) != null && num.intValue() == 1 && 1 != 0) {
            C786410Ut5.LJZ(8, tp().LLJILJIL);
        }
        C786410Ut5.I7(new AkS57S0200000_18(this, poiDiscoveryApi$PoiDiscoveryCardListResponseV2, 35), tp().LLILZLL);
        this.LLJJJJJIL.LIZ(AFwS256S0000000_18.get$arr$(944));
        this.LLJJJJJIL.LIZLLL(C1697810uHb.LJIIJJI("sync_msg_map_init", "sync_msg_data_change"), new AwS384S0200000_18(this, poiDiscoveryApi$PoiDiscoveryCardListResponseV2, 232));
        C0H4Y c0h4y = tp().LLILZIL;
        ArrayList arrayList = new ArrayList();
        List<PoiFeedFilterKeyCategory> filterKeyCategoryList = poiDiscoveryApi$PoiDiscoveryCardListResponseV2.getFilterKeyCategoryList();
        if (filterKeyCategoryList != null) {
            for (PoiFeedFilterKeyCategory poiFeedFilterKeyCategory : filterKeyCategoryList) {
                arrayList.add(new C0H4Z(poiFeedFilterKeyCategory.displayText, false, poiFeedFilterKeyCategory.icon, new AwS147S0400000_18(this, poiDiscoveryApi$PoiDiscoveryCardListResponseV2, poiFeedFilterKeyCategory, c0h4y, 4), false, false, 982));
            }
        }
        if (!arrayList.isEmpty()) {
            C12P5 c12p5 = new C12P5();
            c12p5.LIZJ = -16777216;
            c12p5.LJI = C12KQ.VERTICAL;
            c12p5.LJII = EnumC197015126j.LINEAR;
            c12p5.LJ = Float.valueOf(0.0f);
            c12p5.LJFF = Float.valueOf(0.08f);
            c0h4y.setBackground(c12p5.LIZ(c0h4y.getContext()));
            int visibility = c0h4y.getVisibility();
            c0h4y.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0h4y);
            c0h4y.e0(arrayList);
            return;
        }
        int visibility2 = c0h4y.getVisibility();
        c0h4y.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c0h4y);
    }

    public final void Ep(PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 poiDiscoveryApi$PoiDiscoveryCardListResponseV2) {
        C1176580giu c1176580giuLIZJ;
        InterfaceC1177250gjz interfaceC1177250gjz;
        MapBounds dynamicMapWindow = poiDiscoveryApi$PoiDiscoveryCardListResponseV2.getDynamicMapWindow();
        if (dynamicMapWindow != null && (c1176580giuLIZJ = C1175070ggT.LIZJ(dynamicMapWindow)) != null && (interfaceC1177250gjz = this.LLJJIJIL) != null) {
            C1177960gl8 c1177960gl8 = new C1177960gl8(c1176580giuLIZJ.northeast.lat, c1176580giuLIZJ.southwest.lon);
            C1177960gl8 c1177960gl82 = new C1177960gl8(c1176580giuLIZJ.southwest.lat, c1176580giuLIZJ.northeast.lon);
            C1178480gly c1178480gly = new C1178480gly();
            c1178480gly.LIZ = true;
            c1178480gly.LIZIZ = 300L;
            interfaceC1177250gjz.LJIJJLI(c1177960gl8, c1177960gl82, c1178480gly);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
    public final void bq(int i) {
        Animator animator;
        Animator animator2;
        Animator animator3;
        if (i < this.LLJJJ || getContentView().getAlpha() <= 0.0f || ((animator2 = this.LLJJJJ) != null && animator2.isStarted())) {
            if (i <= this.LLJJJ && getContentView().getAlpha() < 1.0f) {
                Animator animator4 = this.LLJJJIL;
                if (animator4 != null && animator4.isStarted()) {
                    return;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getContentView(), "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(200L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                this.LLJJJIL = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
                Animator animator5 = this.LLJJJJ;
                if (animator5 == null || !animator5.isStarted() || (animator = this.LLJJJJ) == null) {
                    return;
                }
                animator.cancel();
                return;
            }
            return;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getContentView(), "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.LLJJJJ = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.start();
        Animator animator6 = this.LLJJJIL;
        if (animator6 == null || !animator6.isStarted() || (animator3 = this.LLJJJIL) == null) {
            return;
        }
        animator3.cancel();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.map.PoiBackgroundMapComponent for r17v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.map.PoiBackgroundMapComponent.onViewCreated(android.view.View):void");
    }

    public final void Ap(C1177360gkA c1177360gkA, C1177360gkA c1177360gkA2) {
        C20742216Eq c20742216Eq = new C20742216Eq(getContext());
        c20742216Eq.setId(View.generateViewId());
        tp().LLJ.addView(c20742216Eq);
        C19MB c19mb = new C19MB();
        c19mb.LJII(tp().LLJ);
        C19M2 c19m2 = c19mb.LJIJI(c20742216Eq.getId()).LIZLLL;
        c19m2.LIZ = true;
        c19m2.LJJIIJ = 1;
        c19mb.LJJIFFI(0.5f, c20742216Eq.getId());
        c19mb.LIZIZ(tp().LLJ);
        View view = new View(getContext());
        view.setId(View.generateViewId());
        C19ME c19me = new C19ME(-2, -2);
        c19me.startToStart = 0;
        c19me.bottomToBottom = 0;
        c19me.topToBottom = view.getId();
        C19ME c19me2 = new C19ME(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        c19me2.startToStart = c20742216Eq.getId();
        c19me2.topToBottom = c1177360gkA2.getId();
        c19me2.bottomToTop = c1177360gkA.getId();
        C19ME c19me3 = new C19ME(-2, -2);
        c19me3.endToEnd = 0;
        c19me3.topToTop = 0;
        c19me3.bottomToTop = view.getId();
        tp().LLJ.addView(c1177360gkA, c19me);
        tp().LLJ.addView(view, c19me2);
        tp().LLJ.addView(c1177360gkA2, c19me3);
        C19MB c19mb2 = new C19MB();
        c19mb2.LJII(tp().LLJ);
        c19mb2.LJIIZILJ(0, 0, new int[]{c1177360gkA2.getId(), view.getId(), c1177360gkA.getId()});
        c19mb2.LIZIZ(tp().LLJ);
    }

    public final void Bp(C1177360gkA c1177360gkA, C1177360gkA c1177360gkA2) {
        C20742216Eq c20742216Eq = new C20742216Eq(getContext());
        c20742216Eq.setId(View.generateViewId());
        tp().LLJ.addView(c20742216Eq);
        C19MB c19mb = new C19MB();
        c19mb.LJII(tp().LLJ);
        C19M2 c19m2 = c19mb.LJIJI(c20742216Eq.getId()).LIZLLL;
        c19m2.LIZ = true;
        c19m2.LJJIIJ = 1;
        c19mb.LJJIFFI(0.5f, c20742216Eq.getId());
        c19mb.LIZIZ(tp().LLJ);
        View view = new View(getContext());
        view.setId(View.generateViewId());
        C19ME c19me = new C19ME(-2, -2);
        c19me.startToStart = 0;
        c19me.topToTop = 0;
        c19me.bottomToTop = view.getId();
        C19ME c19me2 = new C19ME(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        c19me2.startToStart = c20742216Eq.getId();
        c19me2.topToBottom = c1177360gkA.getId();
        c19me2.bottomToBottom = c1177360gkA2.getId();
        C19ME c19me3 = new C19ME(-2, -2);
        c19me3.endToEnd = 0;
        c19me3.topToBottom = view.getId();
        c19me3.bottomToBottom = 0;
        tp().LLJ.addView(c1177360gkA, c19me);
        tp().LLJ.addView(view, c19me2);
        tp().LLJ.addView(c1177360gkA2, c19me3);
        C19MB c19mb2 = new C19MB();
        c19mb2.LJII(tp().LLJ);
        c19mb2.LJIIZILJ(0, 0, new int[]{c1177360gkA.getId(), view.getId(), c1177360gkA2.getId()});
        c19mb2.LIZIZ(tp().LLJ);
    }

    public final void zp(TuxIconView tuxIconView, Integer num) {
        if (tuxIconView == null) {
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        if (num != null) {
            c419910GdJ.LIZ = num.intValue();
        }
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxIconView.getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.c3);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        tuxIconView.setBackground(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(tuxIconView.getContext())));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sp(com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard r11, android.content.Context r12, com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 r13, X.InterfaceC1364105Vn<? super X.C1177360gkA> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C1177290gk3
            if (r0 == 0) goto L86
            r5 = r14
            X.0gk3 r5 = (X.C1177290gk3) r5
            int r2 = r5.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r5.LLIZ = r2
        L12:
            java.lang.Object r4 = r5.LLILZIL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r5.LLIZ
            r1 = 1
            r8 = 0
            if (r0 == 0) goto L64
            if (r0 != r1) goto L8c
            X.0gkA r3 = r5.LLILZ
            X.0gkA r1 = r5.LLILLL
            com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 r13 = r5.LLILLJJLI
            com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard r11 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L2b:
            irm.AkS28S0300000_18 r2 = new irm.AkS28S0300000_18
            r0 = 12
            r2.<init>(r13, r10, r11, r0)
            X.C786410Ut5.I7(r2, r3)
            int r0 = android.view.View.generateViewId()
            r3.setId(r0)
            r2 = 0
            java.lang.Integer r3 = r13.getUserCityStatus()
            java.lang.String r4 = r11.getPoiId()
            java.lang.String r5 = r11.getCollectInfo()
            java.lang.String r6 = ""
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r10)
            if (r0 == 0) goto L55
            X.0Q7z r8 = X.C1558360qeg.LJFF(r0, r8)
        L55:
            X.0gk4 r0 = r10.tp()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.LLJ
            com.bytedance.android.btm.api.model.PageFinder r9 = com.bytedance.android.btm.api.model.PageFinder.via(r0)
            r7 = r2
            X.C1175600ghK.LJIIIZ(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L64:
            X.C155000ia.LIZIZ(r4)
            if (r11 != 0) goto L6a
            return r8
        L6a:
            X.0gkA r3 = new X.0gkA
            r3.<init>(r12)
            r0 = 0
            r3.LIZJ(r11, r0, r0)
            r5.LL = r11
            r5.LLILLJJLI = r13
            r5.LLILLL = r3
            r5.LLILZ = r3
            r5.LLIZ = r1
            java.lang.Object r0 = r3.LIZLLL(r11, r5)
            if (r0 != r2) goto L84
            return r2
        L84:
            r1 = r3
            goto L2b
        L86:
            X.0gk3 r5 = new X.0gk3
            r5.<init>(r10, r14)
            goto L12
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.map.PoiBackgroundMapComponent.sp(com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard, android.content.Context, com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponseV2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void up(PoiGeneralCard poiGeneralCard, MapModeEnterMethod mapModeEnterMethod, PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 poiDiscoveryApi$PoiDiscoveryCardListResponseV2, String str, boolean z) {
        C1173300gdc c1173300gdcLJ;
        C1185600gxS c1185600gxS;
        DynamicMapParams dynamicMapParams;
        String name;
        MapBounds dynamicMapWindow;
        String enterFrom;
        String enterMethod;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String initialPoiId;
        String fromGroupId;
        String fromPoiId;
        String adClickId;
        MapModeType mapModeType$poi_release;
        Double d;
        Double d2;
        String enterMethod2;
        String collectInfo;
        String collectInfo2;
        String enterFrom2;
        String enterMethod3;
        String initialEnterFrom2;
        String initialEnterMethod2;
        String str2;
        String initialPoiFromGroupId2;
        MapModeType mapModeType$poi_release2;
        Integer userCityStatus;
        Context context = getContext();
        if (context != null && (c1173300gdcLJ = C1174850gg7.LJ(this)) != null && (c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ) != null) {
            Integer userCityStatus2 = null;
            if (z) {
                C1175530ghD c1175530ghD = C1175530ghD.LIZ;
                if (mapModeEnterMethod != null) {
                    enterMethod2 = mapModeEnterMethod.getEnterMethod();
                } else {
                    enterMethod2 = null;
                }
                String str3 = c1185600gxS.LIZ;
                if (poiGeneralCard != null) {
                    collectInfo = poiGeneralCard.getCollectInfo();
                } else {
                    collectInfo = null;
                }
                PoiListApi.PoiDetailResponse poiDetailResponseIp = ip();
                if (poiDetailResponseIp != null) {
                    collectInfo2 = poiDetailResponseIp.getCollectInfo();
                } else {
                    collectInfo2 = null;
                }
                C1185410gx9 c1185410gx9 = c1185600gxS.LJFF;
                if (c1185410gx9 != null) {
                    enterFrom2 = c1185410gx9.getEnterFrom();
                } else {
                    enterFrom2 = null;
                }
                C1185410gx9 c1185410gx92 = c1185600gxS.LJFF;
                if (c1185410gx92 != null) {
                    enterMethod3 = c1185410gx92.getEnterMethod();
                } else {
                    enterMethod3 = null;
                }
                C1185410gx9 c1185410gx93 = c1185600gxS.LJFF;
                if (c1185410gx93 != null) {
                    initialEnterFrom2 = c1185410gx93.getInitialEnterFrom();
                } else {
                    initialEnterFrom2 = null;
                }
                C1185410gx9 c1185410gx94 = c1185600gxS.LJFF;
                if (c1185410gx94 != null) {
                    initialEnterMethod2 = c1185410gx94.getInitialEnterMethod();
                } else {
                    initialEnterMethod2 = null;
                }
                if (C123100dR.LIZ(str)) {
                    str2 = str;
                } else {
                    str2 = null;
                }
                C1185410gx9 c1185410gx95 = c1185600gxS.LJFF;
                if (c1185410gx95 != null) {
                    initialPoiFromGroupId2 = c1185410gx95.getInitialPoiFromGroupId();
                } else {
                    initialPoiFromGroupId2 = null;
                }
                PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 poiDiscoveryApi$PoiDiscoveryCardListResponseV22 = (PoiDiscoveryApi$PoiDiscoveryCardListResponseV2) C1174850gg7.LIZJ(this);
                if (poiDiscoveryApi$PoiDiscoveryCardListResponseV22 == null || (mapModeType$poi_release2 = poiDiscoveryApi$PoiDiscoveryCardListResponseV22.getMapModeType$poi_release()) == null) {
                    mapModeType$poi_release2 = MapModeType.OTHERS;
                }
                PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 poiDiscoveryApi$PoiDiscoveryCardListResponseV23 = (PoiDiscoveryApi$PoiDiscoveryCardListResponseV2) C1174850gg7.LIZJ(this);
                if (poiDiscoveryApi$PoiDiscoveryCardListResponseV23 != null) {
                    userCityStatus = poiDiscoveryApi$PoiDiscoveryCardListResponseV23.getUserCityStatus();
                } else {
                    userCityStatus = null;
                }
                C1175530ghD.LIZIZ(c1175530ghD, enterMethod2, str3, collectInfo2, collectInfo, enterFrom2, enterMethod3, initialEnterFrom2, initialEnterMethod2, str2, initialPoiFromGroupId2, PageFinder.via(C724240Sb0.LJI(this)), mapModeType$poi_release2, C1175600ghK.LJIIJ(userCityStatus), C1558520qew.LJIIL(this), 8);
            }
            PoiListApi.PoiDetailResponse poiDetailResponseIp2 = ip();
            if (poiDetailResponseIp2 != null && (dynamicMapParams = poiDetailResponseIp2.getDynamicMapParams()) != null && Intrinsics.LJFF(dynamicMapParams.enableDynamicMap, Boolean.TRUE)) {
                if (poiGeneralCard != null) {
                    String poiId = poiGeneralCard.getPoiId();
                    Location location = poiGeneralCard.getLocation();
                    if (location != null) {
                        d = location.lat;
                    } else {
                        d = null;
                    }
                    Location location2 = poiGeneralCard.getLocation();
                    if (location2 != null) {
                        d2 = location2.lng;
                    } else {
                        d2 = null;
                    }
                    new PoiMapModeTargetData(poiId, new PoiLocation(d, d2, null));
                }
                C1175690ghT c1175690ghT = PoiMapDetailFragment.LLJJJJ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                EnumC1175760gha enumC1175760gha = EnumC1175760gha.REGION_POI_MAP_DISCOVERY;
                String str4 = c1185600gxS.LIZ;
                PoiListApi.PoiDetailResponse poiDetailResponseIp3 = ip();
                if (poiDetailResponseIp3 != null) {
                    name = poiDetailResponseIp3.getName();
                } else {
                    name = null;
                }
                if (poiDiscoveryApi$PoiDiscoveryCardListResponseV2 != null) {
                    dynamicMapWindow = poiDiscoveryApi$PoiDiscoveryCardListResponseV2.getDynamicMapWindow();
                } else {
                    dynamicMapWindow = null;
                }
                String collectInfo3 = null;
                C1175680ghS c1175680ghS = new C1175680ghS(null, null, null, str4, name, str, dynamicMapWindow, null);
                C1185410gx9 c1185410gx96 = c1185600gxS.LJFF;
                if (c1185410gx96 != null) {
                    enterFrom = c1185410gx96.getEnterFrom();
                } else {
                    enterFrom = null;
                }
                C1185410gx9 c1185410gx97 = c1185600gxS.LJFF;
                if (c1185410gx97 != null) {
                    enterMethod = c1185410gx97.getEnterMethod();
                } else {
                    enterMethod = null;
                }
                C1185410gx9 c1185410gx98 = c1185600gxS.LJFF;
                if (c1185410gx98 != null) {
                    initialEnterFrom = c1185410gx98.getInitialEnterFrom();
                } else {
                    initialEnterFrom = null;
                }
                C1185410gx9 c1185410gx99 = c1185600gxS.LJFF;
                if (c1185410gx99 != null) {
                    initialEnterMethod = c1185410gx99.getInitialEnterMethod();
                } else {
                    initialEnterMethod = null;
                }
                C1185410gx9 c1185410gx910 = c1185600gxS.LJFF;
                if (c1185410gx910 != null) {
                    initialPoiFromGroupId = c1185410gx910.getInitialPoiFromGroupId();
                } else {
                    initialPoiFromGroupId = null;
                }
                C1185410gx9 c1185410gx911 = c1185600gxS.LJFF;
                if (c1185410gx911 != null) {
                    initialPoiId = c1185410gx911.getInitialPoiId();
                } else {
                    initialPoiId = null;
                }
                C1185410gx9 c1185410gx912 = c1185600gxS.LJFF;
                if (c1185410gx912 != null) {
                    fromGroupId = c1185410gx912.getFromGroupId();
                } else {
                    fromGroupId = null;
                }
                C1185410gx9 c1185410gx913 = c1185600gxS.LJFF;
                if (c1185410gx913 != null) {
                    fromPoiId = c1185410gx913.getFromPoiId();
                } else {
                    fromPoiId = null;
                }
                C1185410gx9 c1185410gx914 = c1185600gxS.LJFF;
                if (c1185410gx914 != null) {
                    adClickId = c1185410gx914.getAdClickId();
                } else {
                    adClickId = null;
                }
                if (poiDiscoveryApi$PoiDiscoveryCardListResponseV2 == null || (mapModeType$poi_release = poiDiscoveryApi$PoiDiscoveryCardListResponseV2.getMapModeType$poi_release()) == null) {
                    mapModeType$poi_release = MapModeType.OTHERS;
                }
                PoiListApi.PoiDetailResponse poiDetailResponseIp4 = ip();
                if (poiDetailResponseIp4 != null) {
                    collectInfo3 = poiDetailResponseIp4.getCollectInfo();
                }
                String strLIZ = C18JG.LIZ("c79460.d0", PageFinder.via(C724240Sb0.LJI(this)), null);
                PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 poiDiscoveryApi$PoiDiscoveryCardListResponseV24 = (PoiDiscoveryApi$PoiDiscoveryCardListResponseV2) C1174850gg7.LIZJ(this);
                if (poiDiscoveryApi$PoiDiscoveryCardListResponseV24 != null) {
                    userCityStatus2 = poiDiscoveryApi$PoiDiscoveryCardListResponseV24.getUserCityStatus();
                }
                PoiMapModeMobParams poiMapModeMobParams = new PoiMapModeMobParams(fromGroupId, fromPoiId, mapModeEnterMethod, enterFrom, enterMethod, initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, initialPoiId, adClickId, mapModeType$poi_release, collectInfo3, strLIZ, "poi_detail", userCityStatus2);
                c1175690ghT.getClass();
                C1175690ghT.LIZ(context, interfaceC665370Q7zLJIIL, enumC1175760gha, c1175680ghS, poiMapModeMobParams);
            }
        }
    }
}
