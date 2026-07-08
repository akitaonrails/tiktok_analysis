package com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight;

import X.C09JN;
import X.C11NZ;
import X.C11S5;
import X.C1577240r98;
import X.C1577250r99;
import X.C1579390rCb;
import X.C1579400rCc;
import X.C1579450rCh;
import X.C1579520rCo;
import X.C1579610rCx;
import X.C1580010rDb;
import X.C1581520rG2;
import X.C1611550s2T;
import X.C1612480s3y;
import X.EnumC1579440rCg;
import X.InterfaceC0148002o;
import X.InterfaceC1574170r4B;
import Y.ACallableS429S0100000_24;
import Y.AfS155S0200000_19;
import android.os.SystemClock;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public abstract class BaseSeriesSkyLightVM extends AssemViewModel<C1579450rCh> {
    public C1579610rCx LLILZIL;
    public C1579400rCc LLILZLL;
    public boolean LLIZLLLIL;
    public Boolean LLJ;
    public SkylightBlocks LLJI;
    public final C1577240r98 LL = new C1577240r98();
    public final C1579390rCb LLILLJJLI = new C1579390rCb();
    public final AtomicReference<UrlModel> LLILLL = new AtomicReference<>(null);
    public final ArrayList<Runnable> LLILZ = new ArrayList<>();
    public boolean LLIZ = true;

    public abstract SeriesFeedRepository wQ2();

    public abstract C1577250r99 xQ2();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1579450rCh(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C1579610rCx c1579610rCx;
        InterfaceC1574170r4B interfaceC1574170r4B;
        C1579400rCc c1579400rCc = this.LLILZLL;
        if (c1579400rCc != null && (c1579610rCx = this.LLILZIL) != null && (interfaceC1574170r4B = c1579610rCx.LIZ) != null) {
            interfaceC1574170r4B.LIZ(c1579400rCc);
        }
        this.LLILZ.clear();
        C1579390rCb c1579390rCb = this.LLILLJJLI;
        c1579390rCb.LIZ = true;
        c1579390rCb.LIZIZ = null;
        c1579390rCb.LIZJ = null;
        this.LLIZ = true;
        this.LLILLL.set(null);
        this.LLJ = null;
        this.LLILZIL = null;
        super.onCleared();
    }

    public final void AQ2(String str) {
        String strLJIJJ;
        C1579390rCb c1579390rCb = this.LLILLJJLI;
        if (!C1580010rDb.LIZ) {
            MiniDramaETInjectService.LIZ.getClass();
            MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
            if (miniDramaETInjectServiceLIZ != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("stage", "trigger");
                linkedHashMap.put("by", str);
                Boolean bool = c1579390rCb.LIZIZ;
                String strLJIJJ2 = "-1";
                if (bool == null) {
                    strLJIJJ = "-1";
                } else {
                    C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
                    boolean zBooleanValue = bool.booleanValue();
                    c1581520rG2.getClass();
                    strLJIJJ = C1612480s3y.LJIJJ(zBooleanValue);
                }
                linkedHashMap.put("first_frame", strLJIJJ);
                Boolean bool2 = c1579390rCb.LIZJ;
                if (bool2 != null) {
                    C1581520rG2 c1581520rG22 = C1581520rG2.LJI;
                    boolean zBooleanValue2 = bool2.booleanValue();
                    c1581520rG22.getClass();
                    strLJIJJ2 = C1612480s3y.LJIJJ(zBooleanValue2);
                }
                linkedHashMap.put("guide_finish", strLJIJJ2);
                C1581520rG2 c1581520rG23 = C1581520rG2.LJI;
                boolean z = c1579390rCb.LIZ;
                c1581520rG23.getClass();
                linkedHashMap.put("wait_first_open", C1612480s3y.LJIJJ(z));
                miniDramaETInjectServiceLIZ.onEventV3("skylight_stage_event", linkedHashMap);
            }
        }
        if (this.LLILLJJLI.LIZ()) {
            if (!C1580010rDb.LIZ) {
                C1580010rDb.LIZIZ = SystemClock.elapsedRealtime();
                MiniDramaETInjectService.LIZ.getClass();
                MiniDramaETInjectService miniDramaETInjectServiceLIZ2 = C1611550s2T.LIZ();
                if (miniDramaETInjectServiceLIZ2 != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("stage", "canShow");
                    linkedHashMap2.put("pageHide", String.valueOf(0));
                    miniDramaETInjectServiceLIZ2.onEventV3("skylight_stage_event", linkedHashMap2);
                }
            }
            if (getState().LLILZIL != null) {
                if (!C1580010rDb.LIZ) {
                    MiniDramaETInjectService.LIZ.getClass();
                    MiniDramaETInjectService miniDramaETInjectServiceLIZ3 = C1611550s2T.LIZ();
                    if (miniDramaETInjectServiceLIZ3 != null) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put("stage", "readyShow");
                        linkedHashMap3.put("pageHide", String.valueOf(0));
                        miniDramaETInjectServiceLIZ3.onEventV3("skylight_stage_event", linkedHashMap3);
                    }
                }
                zQ2(new C1579520rCo(true, EnumC1579440rCg.FIRST_SHOW));
                this.LLILLJJLI.LIZ = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018a A[PHI: r2
      0x018a: PHI (r2v22 java.lang.Object) = (r2v7 java.lang.Object), (r2v20 java.lang.Object), (r2v25 java.lang.Object) binds: [B:89:0x0177, B:92:0x0188, B:46:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void BQ2(com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks r25) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight.BaseSeriesSkyLightVM.BQ2(com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks):void");
    }

    public boolean vQ2(C1579520rCo c1579520rCo) {
        if (c1579520rCo.LIZIZ != EnumC1579440rCg.FIRST_SHOW) {
            return true;
        }
        return false;
    }

    public final void yQ2(Function0<Unit> function0) {
        disposeOnClear(C11NZ.LJJJJI(new ACallableS429S0100000_24(this, 1)).LJJIJIIJIL(new C09JN() { // from class: X.0hew
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("BaseSeriesSkyLightVM@3e10.handleRefreshWhenSkylight$3");
                Map<EnumC1574490r4h, Map<String, Aweme>> map = C1574470r4f.LIZ;
                C1574470r4f.LIZJ((SkylightBlocks) obj);
                C1C7U.LIZIZ("BaseSeriesSkyLightVM@3e10.handleRefreshWhenSkylight$3");
            }
        }).LJL(C11S5.LIZ()).LJJLL(new AfS155S0200000_19(this, function0, 4), new C09JN() { // from class: X.0heu
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("BaseSeriesSkyLightVM@3e10.handleRefreshWhenSkylight$5");
                ((Throwable) obj).getMessage();
                C1C7U.LIZIZ("BaseSeriesSkyLightVM@3e10.handleRefreshWhenSkylight$5");
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Type inference failed for: r0v84, types: [X.0quT, X.0rCc] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(X.InterfaceC1579500rCm r21) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight.BaseSeriesSkyLightVM.zQ2(X.0rCm):java.lang.Object");
    }
}
