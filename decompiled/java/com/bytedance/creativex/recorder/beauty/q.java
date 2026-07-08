package com.bytedance.creativex.recorder.beauty;

import X.AbstractC1652010t5j;
import X.AbstractC2255721DQs;
import X.C01GW;
import X.C01TT;
import X.C05YF;
import X.C089E;
import X.C0BKY;
import X.C0CNO;
import X.C0EWC;
import X.C0F1U;
import X.C10EU;
import X.C12H8;
import X.C12HE;
import X.C12HK;
import X.C12HT;
import X.C12HU;
import X.C12I5;
import X.C12I7;
import X.C12I9;
import X.C12IA;
import X.C12IE;
import X.C12IH;
import X.C12IL;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1631610sYp;
import X.C1638280sja;
import X.C1644900suG;
import X.C1652000t5i;
import X.C1664590tQ1;
import X.C1664770tQJ;
import X.C19570511hX;
import X.C19729512Hd;
import X.C19731012Hs;
import X.C19731512Hx;
import X.C19731712Hz;
import X.C19EG;
import X.C1DRG;
import X.C2095008Iq;
import X.C21366318jV;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2281551ESb;
import X.C385670FAf;
import X.C560530Lyd;
import X.C787110UuD;
import X.EnumC19731112Ht;
import X.InterfaceC1463990oCT;
import X.InterfaceC1635390sev;
import X.InterfaceC1644770su3;
import X.InterfaceC1645720sva;
import X.InterfaceC1646290swV;
import X.InterfaceC1648570t0B;
import X.InterfaceC1650230t2r;
import X.InterfaceC1663170tNj;
import X.InterfaceC1684900twm;
import X.InterfaceC1731706qJ;
import X.InterfaceC19570411hW;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2254081DKk;
import X.InterfaceC379610EuV;
import Y.AObjectS246S0100000_25;
import Y.AObjectS247S0100000_29;
import Y.AObserverS231S0100000_29;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.creativex.recorder.beauty.q;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.env.BeautyContext;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS145S0110000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.text.a0;
import ln3.a;

/* JADX INFO: loaded from: classes30.dex */
public class q extends AbstractC2255721DQs<a> implements InterfaceC379610EuV, a, C0F1U {
    public static final C12IH LLJLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C1DRG LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final Function0<InterfaceC1635390sev> LLILZ;
    public final Function1<Boolean, String> LLILZIL;
    public final InterfaceC1663170tNj LLILZLL;
    public final InterfaceC1463990oCT LLIZ;
    public C12I7 LLJILJILJ;
    public C19731712Hz LLJILLL;
    public C12IA LLJJ;
    public final C12IL LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final List<Function1<Function0<Unit>, Boolean>> LLJJJIL;
    public Function1<? super Function0<Unit>, Boolean> LLJJJJ;
    public BeautyMetadata LLJJJJJIL;
    public final C560530Lyd<AbstractC1652010t5j> LLJJJJLIIL;
    public volatile boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final a LLIZLLLIL = this;
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC2254081DKk LLJI = getCameraApiComponent(this).St2();
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1646290swV.class, null);
    public boolean LLJILJIL = true;
    public final C12HU<BeautyComposerInfo> LLJJI = new C12HU<>();
    public final MutableLiveData<Boolean> LLJJIII = new MutableLiveData<>();

    /* JADX WARN: Type inference failed for: r0v5, types: [X.12IH] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(q.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(q.class, "beautyFilterDelegateApi", "getBeautyFilterDelegateApi()Lcom/bytedance/creativex/recorder/beauty/BeautyFilterLazyDelegationAPI;", 0)};
        LLJLL = new Object() { // from class: X.12IH
        };
    }

    private final void B3() {
        C19570511hX.LIZ = null;
    }

    public void H3() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.12IG] */
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
    @Override // ln3.a
    public void b52() {
        AM1(true);
        C19729512Hd c19729512Hd = new C19729512Hd(this.LLJJIJI.LJFF.invoke().intValue(), this.LLILZIL.invoke(this.LLJJIJI.LJII.invoke()), this.LLILLJJLI, this.LLILLL, this.LLJJIJI.LJJIFFI.invoke().booleanValue());
        C19731712Hz c19731712Hz = this.LLJILLL;
        if (c19731712Hz == null) {
            c19731712Hz = null;
        }
        ?? r1 = new C12H8() { // from class: X.12IG
            @Override // X.C12H8
            public final void onFail() {
                this.LIZ.AM1(false);
                this.LIZ.LLILZLL.LIZIZ();
            }

            @Override // X.C12H8
            public final void onSuccess() {
                this.LIZ.AM1(false);
                this.LIZ.LLILZLL.LIZIZ();
            }
        };
        c19731712Hz.LIZJ = true;
        c19731712Hz.LIZ.re(c19729512Hd, r1);
    }

    private final void E3() {
        C385670FAf<FilterBean> c385670FAfI70;
        LiveEvent<C1644900suG> liveEventBZ0;
        if (this.LLJJIJI.LJIILLIIL) {
            if (getDiContainer().LIZJ(InterfaceC1644770su3.class)) {
                whenReadyOrThrowInternal(getDiContainer(), InterfaceC1644770su3.class, new AwS604S0100000_25(this, 56));
                return;
            }
            return;
        }
        InterfaceC1644770su3 interfaceC1644770su3 = (InterfaceC1644770su3) getDiContainer().LJIIL(null, InterfaceC1644770su3.class);
        if (interfaceC1644770su3 != null && (liveEventBZ0 = interfaceC1644770su3.BZ0()) != null) {
            liveEventBZ0.LIZ(this, new AObjectS246S0100000_25(this, 9));
        }
        InterfaceC1644770su3 interfaceC1644770su32 = (InterfaceC1644770su3) getDiContainer().LJIIL(null, InterfaceC1644770su3.class);
        if (interfaceC1644770su32 == null || (c385670FAfI70 = interfaceC1644770su32.i70()) == null) {
            return;
        }
        c385670FAfI70.LIZ(this, new AObjectS247S0100000_29(this, 34));
    }

    private final InterfaceC1646290swV H2() {
        return (InterfaceC1646290swV) this.LLJIJIL.getValue(this, LLJLLIL[1]);
    }

    private final void c3() {
        C19570511hX.LIZ = new InterfaceC19570411hW() { // from class: X.12ID
            @Override // X.InterfaceC19570411hW
            public final void LIZ(String str) {
                InterfaceC1463990oCT interfaceC1463990oCT = this.LIZ.LLIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BeautyLog");
                sbLIZ.append(':');
                sbLIZ.append(str);
                interfaceC1463990oCT.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC19570411hW
            public final void LIZIZ(Throwable th) {
                InterfaceC1463990oCT interfaceC1463990oCT = this.LIZ.LLIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BeautyLog");
                sbLIZ.append(':');
                sbLIZ.append(th);
                interfaceC1463990oCT.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC19570411hW
            public final void d(String str) {
                InterfaceC1463990oCT interfaceC1463990oCT = this.LIZ.LLIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BeautyLog");
                sbLIZ.append(':');
                sbLIZ.append(str);
                interfaceC1463990oCT.d(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC19570411hW
            public final void i(String str) {
                InterfaceC1463990oCT interfaceC1463990oCT = this.LIZ.LLIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BeautyLog");
                sbLIZ.append(':');
                sbLIZ.append(str);
                interfaceC1463990oCT.i(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC19570411hW
            public final void w(String str) {
                InterfaceC1463990oCT interfaceC1463990oCT = this.LIZ.LLIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BeautyLog");
                sbLIZ.append(':');
                sbLIZ.append(str);
                interfaceC1463990oCT.w(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.09AY, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0tKr] */
    private final void i3() {
        String strInvoke;
        Function0<String> function0;
        Function0<String> function02;
        String strInvoke2 = "";
        BeautyFilterConfig beautyFilterConfig = new BeautyFilterConfig(this.LLJJIJI.LJFF.invoke().intValue(), "", this.LLJJIJI.LJII.invoke().booleanValue());
        this.LLJJIJI.getClass();
        beautyFilterConfig.setPrimaryBeautyPanelEnable(false);
        this.LLJJIJI.getClass();
        beautyFilterConfig.setBeautyMobAddConfig(false);
        this.LLJJIJI.getClass();
        beautyFilterConfig.setBeautyMainSwitchConfig(false);
        this.LLJJIJI.getClass();
        beautyFilterConfig.setBeautyOptimizeEffectChange(0);
        beautyFilterConfig.setBeautyDownloadToThread(this.LLJJIJI.LJIJI);
        beautyFilterConfig.setEnableRecordBeautyEligibility(this.LLJJIJI.LJJI);
        this.LLJJIJI.getClass();
        beautyFilterConfig.setBeautyEffectOptimize(false);
        beautyFilterConfig.setULike2ComposerTagValueConvert(true);
        beautyFilterConfig.setConvertKey(true);
        beautyFilterConfig.setItemShape(this.LLJJIJI.LJI.invoke().intValue());
        beautyFilterConfig.setGetChildrenInitBeautyValueVBlock(this.LLJJIJI.LJIL);
        boolean zBooleanValue = this.LLJJIJI.LIZLLL.invoke().booleanValue();
        boolean zLIZLLL = C2281551ESb.LIZIZ.LIZLLL();
        C12HE c12he = new C12HE();
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        int iIntValue = this.LLJJIJI.LJFF.invoke().intValue();
        if (zLIZLLL) {
            strInvoke = "";
        } else {
            strInvoke = this.LLJJIJI.LIZIZ.invoke();
            strInvoke2 = this.LLJJIJI.LIZJ.invoke();
        }
        if (zLIZLLL) {
            function0 = this.LLJJIJI.LIZIZ;
            function02 = this.LLJJIJI.LIZJ;
        } else {
            function0 = null;
            function02 = null;
        }
        c12he.LIZ = new C19731012Hs(contextLJIIIZ, iIntValue, strInvoke, strInvoke2, function0, function02, zBooleanValue).LJII;
        beautyFilterConfig.setDataConfig(c12he);
        beautyFilterConfig.setUpdateComposerNodesInterceptor(this.LLJJJJ);
        this.LLJJIJI.getClass();
        C12IL c12il = this.LLJJIJI;
        String str = c12il.LJIJJLI;
        C12HT c12ht = c12il.LJIJ;
        if (!c12il.LJ.invoke().booleanValue()) {
            c12ht.LJFF(true);
        }
        if (this.LLJJIJI.LJIIZILJ) {
            c12ht.LJIJJ();
        }
        this.LLJILLL = C19731512Hx.LIZ(str, beautyFilterConfig, c12ht, this.LLILZ, new AwS604S0100000_25(this, 54));
        this.LLILZLL.LIZ();
        b52();
        final InterfaceC1645720sva effectController = getCameraApiComponent(this).getEffectController();
        final ?? r3 = new C12IA(effectController) { // from class: X.0tKr
            public final InterfaceC1645720sva LL;
            public int LLILLJJLI;
            public int LLILLL;
            public int LLILZ;
            public int LLILZIL;
            public int LLILZLL;
            public int LLIZ;
            public boolean LLIZLLLIL;
            public boolean LLJ = true;
            public boolean LLJI = true;
            public boolean LLJIJIL;
            public int LLJILJIL;

            @Override // X.C12IA
            public final void os(boolean z) {
            }

            @Override // X.C12IA
            public final int C9() {
                return this.LLILZ;
            }

            @Override // X.C12IA
            public final int Kl() {
                return this.LLILLJJLI;
            }

            @Override // X.C12IA
            public final boolean No() {
                return this.LLJI;
            }

            @Override // X.C12IA
            public final int O8() {
                return this.LLILZIL;
            }

            @Override // X.C12IA
            public final boolean Sp() {
                return this.LLJ;
            }

            @Override // X.C12IA
            public final int Xr() {
                return this.LLILLL;
            }

            @Override // X.C12IA
            public final boolean ah() {
                return this.LLIZLLLIL;
            }

            @Override // X.C12IA
            public final boolean ce() {
                return this.LLJIJIL;
            }

            @Override // X.C12IA
            public final int dq() {
                return this.LLILZLL;
            }

            @Override // X.C12IA
            public final int getFilterIndex() {
                return this.LLJILJIL;
            }

            @Override // X.C12IA
            public final int z7() {
                return this.LLIZ;
            }

            {
                this.LL = effectController;
            }

            @Override // X.C12IA
            public final void El(int i) {
                this.LLILZ = i;
            }

            @Override // X.C12IA
            public final void Hb(int i) {
                this.LLILZLL = i;
            }

            @Override // X.C12IA
            public final void Kr(int i) {
                this.LLILZIL = i;
            }

            @Override // X.C12IA
            public final void LJJLIIIJILLIZJL(List<BeautyComposerInfo> list) {
                this.LL.LJJLIIIJILLIZJL(C1661380tKq.LIZ(list));
            }

            @Override // X.C12IA
            public final void Ml(int i) {
                this.LLILLJJLI = i;
            }

            @Override // X.C12IA
            public final void Of(boolean z) {
                this.LLJIJIL = z;
            }

            @Override // X.C12IA
            public final void fa(boolean z) {
                this.LLJI = z;
            }

            @Override // X.C12IA
            public final void gk(int i) {
                this.LLILLL = i;
            }

            @Override // X.C12IA
            public final void gn(boolean z) {
                this.LLJ = z;
                this.LLJI = z;
            }

            @Override // X.C12IA
            public final void pe(boolean z) {
                this.LLIZLLLIL = z;
            }

            @Override // X.C12IA
            public final void setFilterIndex(int i) {
                this.LLJILJIL = i;
            }

            @Override // X.C12IA
            public final void tp(int i) {
                this.LLIZ = i;
            }

            @Override // X.C12IA
            public final void wb(boolean z) {
                this.LLJ = z;
            }

            @Override // X.C12IA
            public final void L4(List<BeautyComposerInfo> list, int i) {
                this.LL.L4(C1661380tKq.LIZ(list), i);
            }

            @Override // X.C12IA
            public final int[] LJJLL(String str2, String str3) {
                return this.LL.LJJLL(str2, str3);
            }

            @Override // X.C12IA
            public final void R1(List<BeautyComposerInfo> list, int i) {
                this.LL.R1(C1661380tKq.LIZ(list), i);
            }

            @Override // X.C12IA
            public final void h(List<BeautyComposerInfo> list, int i) {
                this.LL.h(C1661380tKq.LIZ(list), i);
            }

            @Override // X.C12IA
            public final void n0(List<BeautyComposerInfo> list, int i) {
                this.LL.n0(C1661380tKq.LIZ(list), i);
            }

            @Override // X.C12IA
            public final void V(String str2, String str3, float f) throws Exception {
                C1404370meJ c1404370meJN4 = this.LL.N4();
                c1404370meJN4.LIZJ(f, str2, 10000, str3);
                c1404370meJN4.LIZ();
            }

            @Override // X.C12IA
            public final void i2(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2, int i) {
                this.LL.i2(C1661380tKq.LIZ(list), C1661380tKq.LIZ(list2), i);
            }
        };
        final InterfaceC1644770su3 filterApiComponent = getFilterApiComponent();
        final C19731712Hz c19731712Hz = this.LLJILLL;
        if (c19731712Hz == null) {
            c19731712Hz = null;
        }
        final InterfaceC1463990oCT interfaceC1463990oCT = this.LLIZ;
        C12IL c12il2 = this.LLJJIJI;
        final boolean z = c12il2.LJIILJJIL;
        final boolean z2 = beautyFilterConfig.beautySwitchStatus;
        final C1631610sYp c1631610sYp = c12il2.LJIILLIIL ? new C01GW<InterfaceC1644770su3>() { // from class: X.0sYp
            @Override // X.C01GW
            public final boolean isInitialized() {
                return true;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [X.0su3, java.lang.Object] */
            @Override // X.C01GW
            public final InterfaceC1644770su3 getValue() {
                return this.LL.getDiContainer().LJIIL(null, InterfaceC1644770su3.class);
            }
        } : 0;
        this.LLJILJILJ = new C12I7(r3, filterApiComponent, c19731712Hz, this, interfaceC1463990oCT, z, z2, c1631610sYp) { // from class: X.12I8
            public final InterfaceC1644770su3 LJIIJJI;
            public final boolean LJIIL;
            public final C01GW<InterfaceC1644770su3> LJIILIIL;

            @Override // X.C12I7
            public final BeautyMetadata LIZJ() {
                boolean z3;
                BeautyMetadata beautyMetadataLe = this.LIZIZ.je().le();
                StringBuilder sb = new StringBuilder();
                List<ComposerBeauty> listWe = this.LIZIZ.je().We();
                int size = listWe.size();
                boolean z4 = true;
                for (int i = 0; i < size; i++) {
                    if (this.LIZIZ.je().oe(((ComposerBeauty) ListProtector.get(listWe, i)).getCategoryId(), this.LJIIL)) {
                        ((ComposerBeauty) ListProtector.get(listWe, i)).setEnable(true);
                        if (((ComposerBeauty) ListProtector.get(listWe, i)).isCollectionType()) {
                            if (((ComposerBeauty) ListProtector.get(listWe, i)).getChildList() != null && !((ComposerBeauty) ListProtector.get(listWe, i)).getChildList().isEmpty()) {
                                int size2 = ((ComposerBeauty) ListProtector.get(listWe, i)).getChildList().size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    ComposerBeauty composerBeauty = (ComposerBeauty) ListProtector.get(((ComposerBeauty) ListProtector.get(listWe, i)).getChildList(), i2);
                                    composerBeauty.setEnable(true);
                                    if (C12HP.LJ(composerBeauty)) {
                                        LJI(composerBeauty);
                                    }
                                }
                                Iterator<ComposerBeauty> it2 = ((ComposerBeauty) ListProtector.get(listWe, i)).getChildList().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z3 = false;
                                        break;
                                    }
                                    if (it2.next().getEnable()) {
                                        z3 = true;
                                        break;
                                    }
                                }
                                ((ComposerBeauty) ListProtector.get(listWe, i)).setEnable(z3);
                            }
                        } else if (C12HP.LJ((ComposerBeauty) ListProtector.get(listWe, i))) {
                            LJI((ComposerBeauty) ListProtector.get(listWe, i));
                        }
                        if (z4) {
                            z4 = false;
                        } else {
                            sb.append(",");
                        }
                        sb.append(((ComposerBeauty) ListProtector.get(listWe, i)).getEnable() ? 1 : 0);
                    }
                }
                beautyMetadataLe.setBeautyValid(sb.toString());
                return beautyMetadataLe;
            }

            @Override // X.C12I7
            public final void LIZLLL() {
                C01GW<InterfaceC1644770su3> c01gw = this.LJIILIIL;
                if (c01gw != null) {
                    if (c01gw.getValue() == null) {
                        return;
                    }
                    InterfaceC1644770su3 value = c01gw.getValue();
                    if (value != null) {
                        value.JY1(false);
                        if (Unit.LIZ != null) {
                            return;
                        }
                    }
                }
                InterfaceC1644770su3 interfaceC1644770su3 = this.LJIIJJI;
                if (interfaceC1644770su3 == null) {
                    return;
                }
                interfaceC1644770su3.JY1(false);
            }

            public final void LJI(ComposerBeauty composerBeauty) {
                if (composerBeauty.getExtra().isNone()) {
                    int[] iArrLJJLL = this.LIZ.LJJLL(composerBeauty.getEffect().getUnzipPath(), "");
                    if (iArrLJJLL.length == 2 && iArrLJJLL[0] == 0 && iArrLJJLL[1] == EnumC992680bwI.EXCLUDE.getFlag()) {
                        composerBeauty.setEnable(false);
                        return;
                    }
                    return;
                }
                Iterator<ComposerBeautyExtraBeautify.ItemsBean> it2 = composerBeauty.getBeautifyExtra().getItems().iterator();
                while (it2.hasNext()) {
                    int[] iArrLJJLL2 = this.LIZ.LJJLL(composerBeauty.getEffect().getUnzipPath(), it2.next().tag);
                    if (iArrLJJLL2.length == 2 && iArrLJJLL2[0] == 0 && iArrLJJLL2[1] == EnumC992680bwI.EXCLUDE.getFlag()) {
                        composerBeauty.setEnable(false);
                    }
                }
            }

            {
                this.LJIIJJI = filterApiComponent;
                this.LJIIL = z2;
                this.LJIILIIL = c1631610sYp;
            }
        };
    }

    @Override // ln3.a
    public void BR0() {
        C12I7 c12i7 = this.LLJILJILJ;
        if (c12i7 == null) {
            c12i7 = null;
        }
        if (c12i7.LIZIZ.Wl()) {
            if (c12i7.LIZLLL) {
                c12i7.LIZIZ.Ec();
                return;
            }
            c12i7.LIZIZ.Ul(false, EnumC19731112Ht.CUR);
            c12i7.LJIIJ = this;
            if (c12i7.LIZIZ.Wl()) {
                c12i7.LIZIZ.LJ().safeObserve(this, new AObserverS231S0100000_29(c12i7, 27));
                c12i7.LIZIZ.Xl().safeObserve(this, new AObserverS231S0100000_29(c12i7, 28));
            }
            c12i7.LIZLLL = true;
        }
    }

    @Override // ln3.a, X.C12IA
    public int C9() {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        return c12ia.C9();
    }

    @Override // ln3.a
    public String CI1() {
        return this.LLJJIJI.LJIJJ;
    }

    @Override // ln3.a
    public void Ec() {
        C19731712Hz c19731712Hz = this.LLJILLL;
        if (c19731712Hz == null) {
            c19731712Hz = null;
        }
        c19731712Hz.Ec();
    }

    @Override // ln3.a
    public void JQ0() {
        C19731712Hz c19731712Hz = this.LLJILLL;
        if (c19731712Hz == null) {
            c19731712Hz = null;
        }
        c19731712Hz.LIZ.bf(new AwS573S0100000_29(this, 39), new C12IE(this));
    }

    @Override // ln3.a
    public boolean Kh2() {
        return this.LLJJIJI.LJIILIIL;
    }

    @Override // ln3.a, X.C12IA
    public int Kl() {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        return c12ia.Kl();
    }

    @Override // ln3.a
    public String M1() {
        String strM1;
        if (this.LLJJIJI.LJIILLIIL) {
            InterfaceC1646290swV interfaceC1646290swVH2 = H2();
            return (interfaceC1646290swVH2 == null || (strM1 = interfaceC1646290swVH2.M1()) == null) ? "record" : strM1;
        }
        C19731712Hz c19731712Hz = this.LLJILLL;
        if (c19731712Hz == null) {
            c19731712Hz = null;
        }
        return c19731712Hz.LIZLLL;
    }

    @Override // ln3.a, X.C12IA
    public boolean No() {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        return c12ia.No();
    }

    @Override // ln3.a, X.C12IA
    public int O8() {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        return c12ia.O8();
    }

    @Override // ln3.a, X.C12IA
    public boolean Sp() {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        return c12ia.Sp();
    }

    @Override // ln3.a
    public int Ty0() {
        int i;
        if (this.LLJJIJI.LIZLLL.invoke().booleanValue()) {
            return getCameraApiComponent(this).pw0().mUseBeautyFace ? 1 : 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<BeautyCategory> it2 = je().ne().iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            BeautyCategory next = it2.next();
            String key = next.getCategoryResponse().getKey();
            linkedHashMap.put(key, 1);
            List<ComposerBeauty> beautyList = next.getBeautyList();
            if (!a0.LJJIIZI(next.getCategoryResponse().getKey(), "beauty", false)) {
                int i2 = 0;
                for (ComposerBeauty composerBeauty : beautyList) {
                    if (!je().nf(composerBeauty)) {
                        linkedHashMap.put(key, 2);
                    }
                    if (composerBeauty.isCollectionType()) {
                        List<ComposerBeauty> childList = composerBeauty.getChildList();
                        if (childList != null) {
                            ArrayList arrayList = new ArrayList();
                            for (ComposerBeauty composerBeauty2 : childList) {
                                if (composerBeauty2.getSelected()) {
                                    arrayList.add(composerBeauty2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    if (!X1((ComposerBeauty) it3.next())) {
                                        break;
                                    }
                                }
                            }
                            i2++;
                        }
                    } else if (composerBeauty.getSelected() && X1(composerBeauty)) {
                        i2++;
                    }
                }
                if (i2 > 0) {
                    linkedHashMap.put(key, 0);
                }
            } else if (je().LIZIZ()) {
                int i3 = 0;
                for (ComposerBeauty composerBeauty3 : beautyList) {
                    if (!je().nf(composerBeauty3)) {
                        linkedHashMap.put(key, 2);
                    }
                    if (composerBeauty3.isCollectionType()) {
                        List<ComposerBeauty> childList2 = composerBeauty3.getChildList();
                        if (childList2 != null) {
                            ArrayList<ComposerBeauty> arrayList2 = new ArrayList();
                            for (ComposerBeauty composerBeauty4 : childList2) {
                                if (composerBeauty4.getSelected()) {
                                    arrayList2.add(composerBeauty4);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                for (ComposerBeauty composerBeauty5 : arrayList2) {
                                    if (composerBeauty5.getDefaultProgress() == 0 || composerBeauty5.getExtra().isNone()) {
                                    }
                                }
                            }
                            i3++;
                        }
                    } else if (composerBeauty3.getDefaultProgress() == 0 || !composerBeauty3.getEnable() || composerBeauty3.getExtra().isNone()) {
                        i3++;
                    }
                }
                if (i3 == beautyList.size()) {
                    linkedHashMap.put(key, 0);
                }
            } else {
                linkedHashMap.put(key, 0);
            }
        }
        if (!linkedHashMap.isEmpty()) {
            Iterator it4 = linkedHashMap.entrySet().iterator();
            if (!it4.hasNext()) {
                throw new NoSuchElementException();
            }
            int iIntValue = ((Number) ((Map.Entry) it4.next()).getValue()).intValue();
            loop7: while (true) {
                i = iIntValue;
                while (it4.hasNext()) {
                    iIntValue = ((Number) ((Map.Entry) it4.next()).getValue()).intValue();
                    if (i < iIntValue) {
                        break;
                    }
                }
            }
        }
        return i;
    }

    @Override // ln3.a
    public boolean UM0() {
        C19731712Hz c19731712Hz = this.LLJILLL;
        return (c19731712Hz == null || c19731712Hz.LJ().getValue() == null) ? false : true;
    }

    public final InterfaceC1645720sva W2() {
        return this.LLJI.getEffectController();
    }

    @Override // ln3.a, X.C12IA
    public int Xr() {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        return c12ia.Xr();
    }

    @Override // ln3.a, X.C12IA
    public boolean ah() {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        return c12ia.ah();
    }

    @Override // ln3.a, X.C12IA
    public boolean ce() {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        return c12ia.ce();
    }

    @Override // ln3.a, X.C12IA
    public int dq() {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        return c12ia.dq();
    }

    @Override // ln3.a
    public boolean eT0() {
        C19731712Hz c19731712Hz = this.LLJILLL;
        if (c19731712Hz == null) {
            c19731712Hz = null;
        }
        if (c19731712Hz.LIZJ) {
            return c19731712Hz.LIZIZ.LJIILLIIL() < 3;
        }
        C19570511hX.LIZ("needOpenFaceDetect: not use composer");
        return false;
    }

    public final InterfaceC1644770su3 getFilterApiComponent() {
        return this.LLJJIJI.LJIILLIIL ? (InterfaceC1644770su3) findReadyComponent(this, InterfaceC1644770su3.class) : (InterfaceC1644770su3) getDiContainer().LJIIL(null, InterfaceC1644770su3.class);
    }

    @Override // ln3.a, X.C12IA
    public int getFilterIndex() {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        return c12ia.getFilterIndex();
    }

    @Override // ln3.a
    public Function2<Context, String, Unit> hI() {
        this.LLJJIJI.getClass();
        return null;
    }

    @Override // ln3.a
    public C12I9 je() {
        C19731712Hz c19731712Hz = this.LLJILLL;
        if (c19731712Hz == null) {
            c19731712Hz = null;
        }
        return c19731712Hz.LIZ;
    }

    @Override // ln3.a
    public BeautyMetadata le() {
        this.LLJJIJI.getClass();
        if (!this.LLJJIJI.LIZLLL.invoke().booleanValue() || (this.LLJL != 0 && (Kh2() || this.LLJL != -1))) {
            C12I7 c12i7 = this.LLJILJILJ;
            BeautyMetadata beautyMetadataLIZJ = (c12i7 != null ? c12i7 : null).LIZJ();
            this.LLJJJJJIL = beautyMetadataLIZJ;
            return beautyMetadataLIZJ;
        }
        C12I7 c12i72 = this.LLJILJILJ;
        BeautyMetadata beautyMetadataLIZJ2 = (c12i72 != null ? c12i72 : null).LIZJ();
        beautyMetadataLIZJ2.setBeautyId("");
        beautyMetadataLIZJ2.setBeautyName("");
        beautyMetadataLIZJ2.setBeautyRes("");
        beautyMetadataLIZJ2.setBeautyStrength("");
        beautyMetadataLIZJ2.setBeautyValid("");
        this.LLJJJJJIL = beautyMetadataLIZJ2;
        return beautyMetadataLIZJ2;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        Keva keva = C12HK.LIZ;
        C19570511hX.LIZIZ("detachBeautyManager");
        B3();
        C19731712Hz c19731712Hz = this.LLJILLL;
        if (c19731712Hz == null) {
            c19731712Hz = null;
        }
        c19731712Hz.LIZ.release();
        super.onDestroy();
    }

    @Override // ln3.a
    public boolean qx2() {
        this.LLJJIJI.getClass();
        return false;
    }

    @Override // ln3.a
    public C385670FAf<Boolean> uv0() {
        C12I7 c12i7 = this.LLJILJILJ;
        if (c12i7 != null) {
            return c12i7.LJIIIIZZ;
        }
        return null;
    }

    @Override // ln3.a, X.C12IA
    public int z7() {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        return c12ia.z7();
    }

    public final void O3() {
        if (eT0()) {
            getCameraApiComponent(this).St2().getEffectController().Bo(new InterfaceC1684900twm() { // from class: X.12IB
                @Override // X.InterfaceC1684900twm
                public final void LIZ(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
                    if (aSSimpleFaceInfoArr == null) {
                        return;
                    }
                    q qVar = this.LIZ;
                    if (qVar.LLJJIJI.LJJ) {
                        qVar.q3(aSSimpleFaceInfoArr);
                    } else {
                        qVar.m3(aSSimpleFaceInfoArr);
                    }
                    Float fInvoke = this.LIZ.LLJJIJI.LJIIL.invoke();
                    C089E c089e = new C089E(aSSimpleFaceInfoArr);
                    while (c089e.hasNext()) {
                        ASSimpleFaceInfo aSSimpleFaceInfo = (ASSimpleFaceInfo) c089e.next();
                        if (aSSimpleFaceInfo != null && fInvoke != null && aSSimpleFaceInfo.boyProb > fInvoke.floatValue()) {
                            this.LIZ.Z1(true);
                            return;
                        }
                    }
                    this.LIZ.Z1(false);
                }
            });
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        boolean zLJI = MethodIDManager.LJI(72037);
        super.onCreate();
        c3();
        H3();
        i3();
        C12I9 c12i9Je = je();
        this.LLJJIJI.getClass();
        c12i9Je.kf();
        C12I7 c12i7 = this.LLJILJILJ;
        if (c12i7 == null) {
            c12i7 = null;
        }
        this.LLJJ = c12i7.LIZ;
        Keva keva = C12HK.LIZ;
        C19570511hX.LIZIZ("attachBeautyManager");
        Keva keva2 = C12HK.LIZ;
        getCameraApiComponent(this).yj1().LIZ(this, new AObjectS247S0100000_29(this, 30));
        this.LLJJIII.observe(this, new AObserverS231S0100000_29(this, 29));
        getCameraApiComponent(this).fT0().LIZ(this, new AObjectS247S0100000_29(this, 31));
        if (getDiContainer().LIZJ(InterfaceC1648570t0B.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1648570t0B.class, new AwS604S0100000_25(this, 55));
        }
        getCameraApiComponent(this).AQ0().LIZ(this, new AObjectS247S0100000_29(this, 32));
        E3();
        if (!this.LLJJIJI.LJJI || C10EU.LJIIIIZZ() || C0EWC.LIZ()) {
            KS1(false, false, false);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        C1652000t5i c1652000t5i;
        super.onResume();
        AbstractC1652010t5j abstractC1652010t5jLJI = this.LLJJJJLIIL.LJI();
        if (!(abstractC1652010t5jLJI instanceof C1652000t5i) || (c1652000t5i = (C1652000t5i) abstractC1652010t5jLJI) == null) {
            return;
        }
        boolean z = c1652000t5i.LIZIZ;
        boolean z2 = BeautyContext.INSTANCE.getBeautificationMode() == 1;
        if (z != z2) {
            KS1(z2, false, false);
        }
    }

    public final void v3() {
        Boolean boolLIZJ = getCameraApiComponent(this).yj1().LIZJ();
        Boolean value = this.LLJJIII.getValue();
        if (boolLIZJ == null || !boolLIZJ.booleanValue() || value == null || !value.booleanValue()) {
            return;
        }
        BR0();
    }

    public C560530Lyd<AbstractC1652010t5j> G2() {
        return this.LLJJJJLIIL;
    }

    public final C12IL T2() {
        return this.LLJJIJI;
    }

    @Override // ln3.a
    public int XA1() {
        return this.LLJLIL;
    }

    @Override // ln3.a
    public /* bridge */ /* synthetic */ LiveEvent XR0() {
        return this.LLJJJJLIIL;
    }

    @Override // ln3.a
    public boolean YU0() {
        return this.LLJLILLLLZIIL;
    }

    @Override // ln3.a
    public boolean g41() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public a o2() {
        return this.LLIZLLLIL;
    }

    public final InterfaceC2254081DKk w2() {
        return this.LLJI;
    }

    @Override // ln3.a
    public boolean yG2() {
        return this.LLJJL;
    }

    private final void Q3(EnumC19731112Ht enumC19731112Ht) {
        C0CNO.LIZLLL(0L, new AwS430S0200000_29(this, enumC19731112Ht, 8));
    }

    private final boolean X1(ComposerBeauty composerBeauty) {
        if (composerBeauty.getDefaultProgress() != 0 && composerBeauty.getEnable() && !composerBeauty.getExtra().isNone()) {
            return false;
        }
        return true;
    }

    public static final InterfaceC1650230t2r getCameraApiComponent(q qVar) {
        return (InterfaceC1650230t2r) qVar.LLJ.getValue(qVar, LLJLLIL[0]);
    }

    @Override // ln3.a
    public void AE0(boolean z) {
        this.LLJJIII.setValue(Boolean.valueOf(z));
    }

    @Override // ln3.a
    public void AM1(boolean z) {
        this.LLJJJ = z;
    }

    @Override // ln3.a, X.C12IA
    public void El(int i) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.El(i);
    }

    @Override // ln3.a, X.C12IA
    public void Hb(int i) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.Hb(i);
    }

    @Override // ln3.a, X.C12IA
    public void Kr(int i) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.Kr(i);
    }

    @Override // ln3.a, X.C12IA
    public void LJJLIIIJILLIZJL(List<BeautyComposerInfo> list) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.LJJLIIIJILLIZJL(list);
    }

    @Override // ln3.a, X.C12IA
    public void Ml(int i) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.Ml(i);
    }

    @Override // ln3.a, X.C12IA
    public void Of(boolean z) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.Of(z);
    }

    @Override // ln3.a
    public void Sw1(Function1<? super Function0<Unit>, Boolean> function1) {
        this.LLJJJIL.remove(function1);
    }

    @Override // ln3.a
    public void Yz1(boolean z) {
        InterfaceC1463990oCT interfaceC1463990oCT = this.LLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[setBeautyFaceEnabled] enabled=");
        sbLIZ.append(z);
        interfaceC1463990oCT.d(C2188811AlT.LIZIZ(sbLIZ));
        getCameraApiComponent(this).pw0().mUseBeautyFace = z;
        je().Ze(z);
        this.LLJL = z ? 1 : 0;
        C12I7 c12i7 = this.LLJILJILJ;
        if (c12i7 == null) {
            c12i7 = null;
        }
        c12i7.LJFF(false);
    }

    public final void Z1(boolean z) {
        if (this.LLJJLIIIJLLLLLLLZ != z) {
            this.LLJJLIIIJLLLLLLLZ = z;
            int i = this.LLJL;
            if (i != -1) {
                boolean z2 = true;
                if (i != 1) {
                    z2 = false;
                }
                Yz1(z2);
            }
        }
    }

    @Override // ln3.a, X.C12IA
    public void fa(boolean z) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.fa(z);
    }

    @Override // ln3.a, X.C12IA
    public void gk(int i) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.gk(i);
    }

    @Override // ln3.a, X.C12IA
    public void gn(boolean z) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.gn(z);
    }

    @Override // ln3.a
    public void kA1(List<BeautyComposerInfo> list) {
        long jLongValue;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (BeautyComposerInfo beautyComposerInfo : list) {
            beautyComposerInfo.getClass();
            VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
            String str = (String) C13LP.LJJJLL(a0.LJJLIIIJILLIZJL(beautyComposerInfo.nodePath, new String[]{":"}, 0, 6));
            if (str == null) {
                str = beautyComposerInfo.nodePath;
            }
            vEEffectFilterParam.effectPath = str;
            vEEffectFilterParam.useLongId = true;
            Long lLJIILIIL = C2095008Iq.LJIILIIL(beautyComposerInfo.effectId);
            long jLongValue2 = 0;
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            vEEffectFilterParam.longStickerId = jLongValue;
            Long lLJIILIIL2 = C2095008Iq.LJIILIIL(beautyComposerInfo.effectId);
            if (lLJIILIIL2 != null) {
                jLongValue2 = lLJIILIIL2.longValue();
            }
            vEEffectFilterParam.longRequestId = jLongValue2;
            vEEffectFilterParam.resId = beautyComposerInfo.resourceId;
            String str2 = beautyComposerInfo.extra;
            if (str2 == null) {
                str2 = "";
            }
            vEEffectFilterParam.stickerTag = str2;
            vEEffectFilterParam.needReload = false;
            arrayList.add(vEEffectFilterParam);
        }
        if (!arrayList.isEmpty()) {
            W2().uo(arrayList);
        }
    }

    public final void m3(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
        Float fInvoke;
        if (this.LLJJIJIL) {
            return;
        }
        if (aSSimpleFaceInfoArr != null && aSSimpleFaceInfoArr.length != 0) {
            int i = this.LLJJIJIIJIL + 1;
            this.LLJJIJIIJIL = i;
            if (i != 6) {
                return;
            }
            C089E c089e = new C089E(aSSimpleFaceInfoArr);
            while (c089e.hasNext()) {
                ASSimpleFaceInfo aSSimpleFaceInfo = (ASSimpleFaceInfo) c089e.next();
                if (aSSimpleFaceInfo != null && (fInvoke = this.LLJJIJI.LJIIL.invoke()) != null && aSSimpleFaceInfo.boyProb <= fInvoke.floatValue()) {
                    Q3(EnumC19731112Ht.FEMALE);
                    this.LLJJIJIL = true;
                    return;
                }
            }
            Q3(EnumC19731112Ht.MALE);
            this.LLJJIJIL = true;
            return;
        }
        this.LLJJIJIIJIL = 0;
    }

    @Override // ln3.a
    public void n3(String str) {
        if (this.LLJJIJI.LJIILLIIL) {
            InterfaceC1646290swV interfaceC1646290swVH2 = H2();
            if (interfaceC1646290swVH2 != null) {
                interfaceC1646290swVH2.n3(str);
                return;
            }
            return;
        }
        C19731712Hz c19731712Hz = this.LLJILLL;
        if (c19731712Hz == null) {
            c19731712Hz = null;
        }
        c19731712Hz.LIZLLL = str;
    }

    @Override // ln3.a, X.C12IA
    public void os(boolean z) {
        if (z) {
            L4(C12I5.LIZ(je().ue()), 10000);
        } else {
            L4(this.LLJJI, 10000);
        }
    }

    @Override // ln3.a, X.C12IA
    public void pe(boolean z) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.pe(z);
    }

    public final void q3(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
        if (aSSimpleFaceInfoArr == null) {
            return;
        }
        C089E c089e = new C089E(aSSimpleFaceInfoArr);
        while (c089e.hasNext()) {
            ASSimpleFaceInfo aSSimpleFaceInfo = (ASSimpleFaceInfo) c089e.next();
            Float fInvoke = this.LLJJIJI.LJIIL.invoke();
            if (fInvoke != null && aSSimpleFaceInfo.boyProb <= fInvoke.floatValue()) {
                Q3(EnumC19731112Ht.FEMALE);
                return;
            }
        }
        Q3(EnumC19731112Ht.MALE);
    }

    @Override // ln3.a, X.C12IA
    public void setFilterIndex(int i) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.setFilterIndex(i);
    }

    @Override // ln3.a, X.C12IA
    public void tp(int i) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.tp(i);
    }

    @Override // ln3.a
    public void uu0(Function1<? super Function0<Unit>, Boolean> function1) {
        this.LLJJJIL.add(function1);
    }

    @Override // ln3.a, X.C12IA
    public void wb(boolean z) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.wb(z);
    }

    @Override // ln3.a, X.C12IA
    public void L4(List<BeautyComposerInfo> list, int i) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.L4(list, i);
    }

    @Override // ln3.a
    public void L91(C787110UuD c787110UuD, boolean z) {
        C19731712Hz c19731712Hz = this.LLJILLL;
        if (c19731712Hz == null) {
            c19731712Hz = null;
        }
        if (z) {
            c19731712Hz.LIZ.ff(c787110UuD);
        } else {
            c19731712Hz.LIZ.ye(c787110UuD);
        }
    }

    @Override // ln3.a, X.C12IA
    public int[] LJJLL(String str, String str2) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        return c12ia.LJJLL(str, str2);
    }

    @Override // ln3.a, X.C12IA
    public void R1(List<BeautyComposerInfo> list, int i) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.R1(list, i);
    }

    @Override // ln3.a
    public void Ul(boolean z, EnumC19731112Ht enumC19731112Ht) {
        C19731712Hz c19731712Hz = this.LLJILLL;
        if (c19731712Hz == null) {
            c19731712Hz = null;
        }
        c19731712Hz.Ul(z, enumC19731112Ht);
    }

    @Override // ln3.a, X.C12IA
    public void h(List<BeautyComposerInfo> list, int i) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.h(list, i);
    }

    @Override // ln3.a, X.C12IA
    public void n0(List<BeautyComposerInfo> list, int i) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.n0(list, i);
    }

    @Override // ln3.a
    public void zh1(boolean z, boolean z2) {
        this.LLJILJIL = z2;
        Yz1(z);
    }

    @Override // ln3.a
    public void KS1(boolean z, boolean z2, boolean z3) {
        int i;
        InterfaceC1463990oCT interfaceC1463990oCT = this.LLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[beautyConfigChange] on:");
        sbLIZ.append(z);
        sbLIZ.append(" showRetouchToast:");
        sbLIZ.append(z2);
        sbLIZ.append(" byClick:");
        sbLIZ.append(z3);
        interfaceC1463990oCT.d(C2188811AlT.LIZIZ(sbLIZ));
        if (z3) {
            if (C0BKY.LIZ()) {
                z2 = true;
            }
            this.LLJLILLLLZIIL = z2;
            C19EG c19eg = (C19EG) getDiContainer().LJII(C19EG.class, null);
            if (this.LLJJIJI.LJIILL && !C10EU.LJIILIIL()) {
                if (this.LLJLILLLLZIIL) {
                    C1638280sja c1638280sja = C21366318jV.LIZLLL;
                    if (z) {
                        i = 2131829008;
                    } else {
                        i = 2131829007;
                    }
                    c1638280sja.getClass();
                    C1638280sja.LIZJ(i, 0, c19eg).LIZ();
                } else {
                    C01TT.LIZJ(new AwS145S0110000_29(c19eg, z, 0));
                }
            }
        }
        if (z) {
            Yz1(true);
        } else {
            Yz1(false);
        }
        this.LLJJJJLIIL.LJIIJ(new C1652000t5i(z, z3));
        if (z3) {
            this.LLJJL = true;
        }
    }

    @Override // ln3.a, X.C12IA
    public void V(String str, String str2, float f) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.V(str, str2, f);
    }

    @Override // ln3.a, X.C12IA
    public void i2(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2, int i) {
        C12IA c12ia = this.LLJJ;
        if (c12ia == null) {
            c12ia = null;
        }
        c12ia.i2(list, list2, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(C1DRG c1drg, boolean z, boolean z2, Function0<? extends InterfaceC1635390sev> function0, Function1<? super Boolean, String> function1, InterfaceC1663170tNj interfaceC1663170tNj, InterfaceC1463990oCT interfaceC1463990oCT, Function1<? super C12IL, Unit> function12) {
        this.LL = c1drg;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = function0;
        this.LLILZIL = function1;
        this.LLILZLL = interfaceC1663170tNj;
        this.LLIZ = interfaceC1463990oCT;
        C12IL c12il = new C12IL();
        this.LLJJIJI = c12il;
        if (function12 != null) {
            function12.invoke(c12il);
        }
        this.LLJJJIL = new ArrayList();
        this.LLJJJJ = new AwS604S0100000_25(this, 57);
        this.LLJJJJLIIL = new C560530Lyd<>();
        this.LLJL = -1;
    }
}
