package wuk;

import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C01GW;
import X.C054G;
import X.C05YW;
import X.C091D;
import X.C091J;
import X.C091S;
import X.C098200Yq;
import X.C09IC;
import X.C09JN;
import X.C0PEM;
import X.C11JF;
import X.C11NJ;
import X.C11PQ;
import X.C11PR;
import X.C11RK;
import X.C11S5;
import X.C11T4;
import X.C1370905Yd;
import X.C13BV;
import X.C13DA;
import X.C13LP;
import X.C13LQ;
import X.C1449380nou;
import X.C1629080sUk;
import X.C1629170sUt;
import X.C1630730sXP;
import X.C1630910sXh;
import X.C1630920sXi;
import X.C1631810sZ9;
import X.C1632470saD;
import X.C1633060sbA;
import X.C1633080sbC;
import X.C1633110sbF;
import X.C1633120sbG;
import X.C1633200sbO;
import X.C1633240sbS;
import X.C1633250sbT;
import X.C1633270sbV;
import X.C1633280sbW;
import X.C1633750scH;
import X.C1633780scK;
import X.C1701940uOG;
import X.C189200o6;
import X.C19475711Hn;
import X.C1954807lC;
import X.C1BNE;
import X.C1DEV;
import X.C201955140j;
import X.C2188811AlT;
import X.C2191201ApK;
import X.C2252321DDq;
import X.C2296808zG;
import X.C23052091m;
import X.C23055091p;
import X.C23059091t;
import X.C23064091y;
import X.C23250099c;
import X.C414301jJ;
import X.C443120HZe;
import X.C452501pT;
import X.InterfaceC1487280oo2;
import X.InterfaceC1621240sI6;
import X.InterfaceC1627740sSa;
import X.InterfaceC1628970sUZ;
import X.InterfaceC1629260sV2;
import X.InterfaceC1629300sV6;
import X.InterfaceC1629330sV9;
import X.InterfaceC1630900sXg;
import X.InterfaceC1631830sZB;
import X.InterfaceC1633140sbI;
import X.InterfaceC1635390sev;
import X.InterfaceC1635410sex;
import X.InterfaceC23044091e;
import X.InterfaceC23045091f;
import X.InterfaceC23046091g;
import X.InterfaceC23050091k;
import X.InterfaceC420801kM;
import Y.AfS172S0100000_3;
import Y.AfS69S0201000_25;
import Y.AfS77S0101000_3;
import Y.AfS87S0101000_25;
import Y.AkS468S0100000_3;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.HorizontalEffectsFetcher;
import com.ss.android.ugc.aweme.sticker.repository.params.HorizontalEffectsFetcherRequest;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.model.ApiState;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponseV2;
import duk.p;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import suk.g;

/* JADX INFO: loaded from: classes26.dex */
public final class f implements InterfaceC23044091e {
    public final String LIZ;
    public final InterfaceC1635390sev LIZIZ;
    public final C11T4<Unit, CategoryPageModel, C1631810sZ9, CategoryPageModel> LIZJ;
    public final C11T4<Unit, PanelInfoModel, C1633080sbC, PanelInfoModel> LIZLLL;
    public final HorizontalEffectsFetcher LJ;
    public final InterfaceC1633140sbI LJFF;
    public final C01GW<InterfaceC1631830sZB> LJI;
    public final C01GW<InterfaceC1629330sV9> LJII;
    public final C01GW<? extends InterfaceC1627740sSa> LJIIIIZZ;
    public final InterfaceC1629300sV6 LJIIIZ;
    public final C01GW<InterfaceC23045091f> LJIIJ;
    public final C01GW<InterfaceC23046091g> LJIIJJI;
    public final C01GW<C091J> LJIIL;
    public final InterfaceC23050091k LJIILIIL;
    public final C1633750scH LJIILJJIL;
    public final Function0<String> LJIILL;
    public final Function0<InterfaceC1630900sXg> LJIILLIIL;
    public final C054G LJIIZILJ;
    public final C2252321DDq LJIJ;
    public final AnonymousClass0951 LJIJI;
    public String LJIJJ;
    public final C11PQ<Pair<Integer, C091S<?>>> LJIJJLI;
    public final C11PQ<C091S<?>> LJIL;
    public final C11PQ<C091S<?>> LJJ;
    public final C11PR<Pair<Integer, C091S<?>>> LJJI;
    public final C11PQ<C091S<?>> LJJIFFI;
    public C11JF LJJII;
    public final C11PQ<Pair<String, List<C1449380nou>>> LJJIII;
    public final C11PQ<C443120HZe<Integer, String, C091S<?>>> LJJIIJ;
    public final C11RK<C091D> LJJIIJZLJL;
    public final C11PQ<C091S<?>> LJJIIZ;
    public final C01GW LJJIIZI;
    public AnonymousClass0956 LJJIJ;
    public final C11NJ LJJIJIIJI;
    public final C1DEV LJJIJIIJIL;
    public C1633200sbO LJJIJIL;
    public final C01GW LJJIJL;
    public final SimpleDateFormat LJJIJLIJ;
    public final C01GW LJJIL;
    public final C01GW LJJIZ;

    @Override // X.InterfaceC1627350sRx
    public final InterfaceC1621240sI6 LIZ() {
        return this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC1627350sRx
    public final InterfaceC1629260sV2 LIZJ() {
        return this.LJIIJJI.getValue();
    }

    @Override // X.InterfaceC1627350sRx
    public final C091J LJII() {
        return this.LJIIL.getValue();
    }

    @Override // X.InterfaceC23044091e
    public final C19475711Hn LJIIIIZZ() {
        C11RK<C091D> c11rk = this.LJJIIJZLJL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC23044091e
    public final C19475711Hn LJIIJ() {
        C11PQ<Pair<String, List<C1449380nou>>> c11pq = this.LJJIII;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    @Override // X.InterfaceC23044091e
    public final C19475711Hn LJIIJJI() {
        C11PQ<Pair<Integer, C091S<?>>> c11pq = this.LJIJJLI;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    @Override // X.InterfaceC23044091e
    public final C19475711Hn LJIILIIL() {
        C11PR<Pair<Integer, C091S<?>>> c11pr = this.LJJI;
        c11pr.getClass();
        return new C19475711Hn(c11pr);
    }

    @Override // X.InterfaceC1627350sRx
    public final InterfaceC1628970sUZ LJIILJJIL() {
        return this.LJI.getValue();
    }

    @Override // X.InterfaceC23044091e
    public final C19475711Hn LJIILL() {
        C11PQ<C091S<?>> c11pq = this.LJJIFFI;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    @Override // X.InterfaceC1627350sRx
    public final InterfaceC1627740sSa LJIILLIIL() {
        return this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC1627350sRx
    public final void LJIIZILJ() {
        C1633270sbV c1633270sbV = C1633270sbV.LIZIZ;
        C1633750scH c1633750scH = this.LJIILJJIL;
        C1633780scK c1633780scK = (C1633780scK) this.LJJIL.getValue();
        C1633280sbW c1633280sbW = c1633270sbV.LIZ;
        C23250099c.LIZLLL(c1633280sbW.LIZ, null, null, new C1633240sbS(c1633280sbW, c1633750scH, c1633780scK, null), 3);
        C23250099c.LIZLLL(c1633280sbW.LIZ, null, null, new C1633250sbT(c1633280sbW, c1633750scH, c1633780scK, null), 3);
    }

    @Override // X.InterfaceC23044091e
    public final C19475711Hn LJIJ() {
        C11PQ<C443120HZe<Integer, String, C091S<?>>> c11pq = this.LJJIIJ;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    @Override // X.InterfaceC23044091e
    public final C19475711Hn LJIJJLI() {
        C11PQ<C091S<?>> c11pq = this.LJIL;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    @Override // X.InterfaceC23044091e
    public final C19475711Hn LJIL() {
        C11PQ<C091S<?>> c11pq = this.LJJIIZ;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    @Override // X.InterfaceC1627350sRx
    public final InterfaceC1629330sV9 LJJI() {
        return this.LJII.getValue();
    }

    @Override // X.InterfaceC23044091e
    public final C19475711Hn LJJII() {
        C11PQ<C091S<?>> c11pq = this.LJJ;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    @Override // X.InterfaceC1627350sRx
    public final void invalidate() {
        this.LIZIZ.destroy();
        this.LJFF.dispose();
        C01GW<InterfaceC1631830sZB> c01gw = this.LJI;
        if (c01gw.isInitialized()) {
            c01gw.getValue().dispose();
        }
        C01GW<C091J> c01gw2 = this.LJIIL;
        if (c01gw2.isInitialized()) {
            c01gw2.getValue().LIZ();
        }
        this.LJJIJIIJI.dispose();
        this.LJIIIIZZ.getValue().LIZJ(false);
        try {
            C2296808zG.LIZJ(this.LJIIZILJ, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LJJIJ = null;
    }

    @Override // X.InterfaceC1627350sRx
    public final InterfaceC1633140sbI LJFF() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1627350sRx
    public final InterfaceC1629300sV6 LJI() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1627350sRx
    public final AnonymousClass0951 LJIIL() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC1627350sRx
    public final InterfaceC1635390sev LJIJJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1627350sRx
    public final void LIZIZ(final C1631810sZ9 c1631810sZ9) {
        final int iLIZ;
        if (C23052091m.LIZ() && c1631810sZ9.LJIIIIZZ == -1) {
            InterfaceC23050091k interfaceC23050091k = this.LJIILIIL;
            if (interfaceC23050091k != null) {
                iLIZ = interfaceC23050091k.LIZ();
            } else {
                iLIZ = 0;
            }
        } else {
            iLIZ = c1631810sZ9.LJIIIIZZ;
        }
        C13DA c13da = new C13DA();
        Map<String, String> map = c1631810sZ9.LJIIIZ;
        if (map != null) {
            c13da.putAll(map);
        }
        c13da.putAll(LJJIIJ(false));
        Map mapBuild = c13da.build();
        if (!(!mapBuild.isEmpty())) {
            mapBuild = null;
        }
        this.LJJIJIIJI.LIZ(this.LIZJ.request(new C1631810sZ9(c1631810sZ9.LIZ, c1631810sZ9.LIZIZ, c1631810sZ9.LIZJ, c1631810sZ9.LIZLLL, c1631810sZ9.LJ, c1631810sZ9.LJFF, c1631810sZ9.LJI, c1631810sZ9.LJII, iLIZ, mapBuild)).LJJIJIL(new C09JN() { // from class: X.0921
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DefaultStickerRepository@bad7.fetchCategoricalStickers$1");
                C11PQ<C443120HZe<Integer, String, C091S<?>>> c11pq = this.LL.LJJIIJ;
                Integer numValueOf = Integer.valueOf(iLIZ);
                C1631810sZ9 c1631810sZ92 = c1631810sZ9;
                c11pq.onNext(new C443120HZe<>(numValueOf, c1631810sZ92.LIZ, new C23055091p(c1631810sZ92.LJI)));
                C1C7U.LIZIZ("DefaultStickerRepository@bad7.fetchCategoricalStickers$1");
            }
        }).LJJJLZIJ(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0920
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                CategoryPageModel categoryPageModel = (CategoryPageModel) obj;
                CategoryEffectModel categoryEffects = categoryPageModel.getCategoryEffects();
                if (categoryEffects != null) {
                    categoryEffects.getEffects();
                }
                return new C23061091v(categoryPageModel);
            }
        }).LJJLIIIIJ(new AkS468S0100000_3(c1631810sZ9, 19)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS69S0201000_25(this, c1631810sZ9, iLIZ, 1)));
    }

    @Override // X.InterfaceC1627350sRx
    public final void LIZLLL(List<String> list) {
        int iLIZ;
        if (C23052091m.LIZ()) {
            InterfaceC23050091k interfaceC23050091k = this.LJIILIIL;
            if (interfaceC23050091k != null) {
                iLIZ = interfaceC23050091k.LIZ();
            } else {
                iLIZ = 0;
            }
        } else {
            iLIZ = -1;
        }
        boolean zCheckNeedResetCache = this.LJ.checkNeedResetCache(iLIZ, list);
        C1632470saD c1632470saD = C1632470saD.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetPanelCacheIfNeeded: scene = ");
        sbLIZ.append(iLIZ);
        sbLIZ.append(", panel = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestStickerIds = ");
        sbLIZ.append(list);
        sbLIZ.append(", needResetCache = ");
        sbLIZ.append(zCheckNeedResetCache);
        C201955140j.LIZLLL(c1632470saD, "StickerRepository", C2188811AlT.LIZIZ(sbLIZ));
        if (zCheckNeedResetCache) {
            this.LIZIZ.LJJIJLIJ(this.LIZ);
        }
    }

    @Override // X.InterfaceC1627350sRx
    public final void LJ(C1633110sbF c1633110sbF) {
        int iLIZ = 0;
        this.LJIJJLI.onNext(new Pair<>(Integer.valueOf(c1633110sbF.LJIIJ), new C23055091p(0)));
        int i = c1633110sbF.LJIIJ;
        if (i == -1) {
            InterfaceC23050091k interfaceC23050091k = this.LJIILIIL;
            if (interfaceC23050091k != null) {
                iLIZ = interfaceC23050091k.LIZ();
            }
        } else {
            iLIZ = i;
        }
        this.LIZIZ.LJIILJJIL(c1633110sbF.LIZ, c1633110sbF.LIZIZ, c1633110sbF.LIZJ, c1633110sbF.LIZLLL, c1633110sbF.LJ, c1633110sbF.LJFF, iLIZ, new C1633120sbG(this, c1633110sbF));
    }

    @Override // X.InterfaceC1627350sRx
    public final void LJIIIZ(C1633080sbC c1633080sbC) {
        int iLIZ;
        Map<String, String> mapLJJIIJ;
        C1633200sbO c1633200sbO = this.LJJIJIL;
        String str = this.LJIJJ;
        if (c1633200sbO != null && str != null) {
            Integer numValueOf = Integer.valueOf(c1633080sbC.LJIIIIZZ);
            LJJIIJZLJL("called fetchViaPanelRequest");
            C23250099c.LIZLLL(this.LJIIZILJ, null, null, new C23059091t(this, null), 3);
            List list = c1633200sbO.LIZ;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            LJJIII(C1629080sUk.LIZ(numValueOf, list), c1633200sbO, str);
            return;
        }
        if (C23052091m.LIZ() && c1633080sbC.LJIIIIZZ == -1) {
            InterfaceC23050091k interfaceC23050091k = this.LJIILIIL;
            if (interfaceC23050091k != null) {
                iLIZ = interfaceC23050091k.LIZ();
            } else {
                iLIZ = 0;
            }
        } else {
            iLIZ = c1633080sbC.LJIIIIZZ;
        }
        InterfaceC1630900sXg interfaceC1630900sXgInvoke = this.LJIILLIIL.invoke();
        if (!Intrinsics.LJFF(interfaceC1630900sXgInvoke, C1630730sXP.LIZ) && !Intrinsics.LJFF(interfaceC1630900sXgInvoke, C1630910sXh.LIZ)) {
            if (Intrinsics.LJFF(interfaceC1630900sXgInvoke, C1630920sXi.LIZ)) {
                mapLJJIIJ = LJJIIJ(true);
            } else {
                throw new C1954807lC();
            }
        } else {
            mapLJJIIJ = LJJIIJ(false);
        }
        this.LJJIJIIJI.LIZ(this.LIZLLL.request(new C1633080sbC(c1633080sbC.LIZ, c1633080sbC.LIZIZ, c1633080sbC.LIZJ, c1633080sbC.LIZLLL, c1633080sbC.LJ, c1633080sbC.LJFF, c1633080sbC.LJI, c1633080sbC.LJII, iLIZ, mapLJJIIJ)).LJJIJIL(new AfS77S0101000_3(iLIZ, this, 1)).LJJJLZIJ(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.091w
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                PanelInfoModel panelInfoModel = (PanelInfoModel) obj;
                CategoryEffectModel categoryEffectModel = panelInfoModel.getCategoryEffectModel();
                if (categoryEffectModel != null) {
                    categoryEffectModel.getEffects();
                }
                return new C23061091v(panelInfoModel);
            }
        }).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.091s
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return new C23056091q((Throwable) obj);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS87S0101000_25(iLIZ, this, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0sbH] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1627350sRx
    public final void LJIJI(C1633110sbF c1633110sbF) {
        final int iLIZ = c1633110sbF.LJIIJ;
        if (iLIZ == -1) {
            InterfaceC23050091k interfaceC23050091k = this.LJIILIIL;
            if (interfaceC23050091k != null) {
                iLIZ = interfaceC23050091k.LIZ();
            } else {
                iLIZ = 0;
            }
        }
        this.LJIJJLI.onNext(new Pair<>(Integer.valueOf(iLIZ), new C23055091p(0)));
        this.LIZIZ.LJJIJ(c1633110sbF.LJII, c1633110sbF.LIZIZ, c1633110sbF.LIZJ, c1633110sbF.LIZLLL, c1633110sbF.LJ, c1633110sbF.LJFF, iLIZ, new ISearchEffectListenerV2() { // from class: X.0sbH
            @Override // com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2
            public final void onFail(ExceptionResult exceptionResult) {
                Exception statusCodeException;
                if (exceptionResult.getException() != null) {
                    statusCodeException = exceptionResult.getException();
                } else {
                    statusCodeException = new StatusCodeException(exceptionResult.getErrorCode(), "search stickers failed");
                }
                this.LJIJJLI.onNext(new Pair<>(Integer.valueOf(iLIZ), new C23056091q(statusCodeException)));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(SearchEffectResponseV2 searchEffectResponseV2) {
                this.LJIJJLI.onNext(new Pair<>(Integer.valueOf(iLIZ), new C23061091v(searchEffectResponseV2)));
            }
        });
    }

    @Override // X.InterfaceC1627350sRx
    public final void LJJ(HorizontalEffectsFetcherRequest horizontalEffectsFetcherRequest) {
        int iLIZ;
        C1633200sbO c1633200sbO = this.LJJIJIL;
        String str = this.LJIJJ;
        if (c1633200sbO != null && str != null) {
            LJJIII(horizontalEffectsFetcherRequest, c1633200sbO, str);
            return;
        }
        if (C23052091m.LIZ() && horizontalEffectsFetcherRequest.whitelistScene == -1) {
            InterfaceC23050091k interfaceC23050091k = this.LJIILIIL;
            if (interfaceC23050091k != null) {
                iLIZ = interfaceC23050091k.LIZ();
            } else {
                iLIZ = 0;
            }
        } else {
            iLIZ = horizontalEffectsFetcherRequest.whitelistScene;
        }
        C11JF c11jf = this.LJJII;
        if (c11jf != null) {
            this.LJJIJIIJI.LIZJ(c11jf);
        }
        Map<String, String> mapLJJIIJ = LJJIIJ(true);
        if (!(true ^ mapLJJIIJ.isEmpty())) {
            mapLJJIIJ = null;
        }
        InterfaceC420801kM interfaceC420801kMLJJLJLI = this.LJ.request(horizontalEffectsFetcherRequest.copy(horizontalEffectsFetcherRequest.insertEffectIds, horizontalEffectsFetcherRequest.trending, horizontalEffectsFetcherRequest.favorite, horizontalEffectsFetcherRequest.favoriteType, horizontalEffectsFetcherRequest.recent, horizontalEffectsFetcherRequest.recentType, horizontalEffectsFetcherRequest.recentEffectsLimit, iLIZ, horizontalEffectsFetcherRequest.fetchMode, mapLJJIIJ)).LJJIJIL(new AfS172S0100000_3(this, 101)).LJJJLZIJ(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.091x
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return new C23061091v(obj);
            }
        }).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.091r
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return new C23056091q((Throwable) obj);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS77S0101000_3(iLIZ, this, 0));
        this.LJJIJIIJI.LIZ(interfaceC420801kMLJJLJLI);
        this.LJJII = (C11JF) interfaceC420801kMLJJLJLI;
    }

    public final Map<String, String> LJJIIJ(boolean z) {
        String str;
        C13DA c13da = new C13DA();
        if (((Boolean) this.LJJIJL.getValue()).booleanValue()) {
            c13da.put("shoot_tab_name", this.LJIILL.invoke());
            if (z) {
                str = "1";
            } else if (!z) {
                str = "2";
            } else {
                throw new C1954807lC();
            }
            c13da.put("effect_recommend_scenario", str);
        }
        return c13da.build();
    }

    public final void LJJIIJZLJL(String str) {
        String str2 = this.LJJIJLIJ.format(new Date(System.currentTimeMillis()));
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LL(C13LQ.LJIJ(1, new Throwable().getStackTrace()), 8), "\n", null, null, 0, null, AFwS247S0000000_13.get$arr$(72), 30);
        C1632470saD c1632470saD = C1632470saD.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" when? ");
        sbLIZ.append(str2);
        sbLIZ.append('\n');
        sbLIZ.append(strLJJLIIIJ);
        C201955140j.LIZLLL(c1632470saD, "effect_request_chine_tag", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC23044091e
    public final void LJJIFFI(C1633200sbO c1633200sbO, String str) {
        this.LJJIJIL = c1633200sbO;
        this.LJIJJ = str;
        AnonymousClass0956 anonymousClass0956 = this.LJJIJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public final void LJJIII(HorizontalEffectsFetcherRequest horizontalEffectsFetcherRequest, C1633200sbO c1633200sbO, String str) {
        Map<String, String> mapEg;
        InterfaceC1635410sex interfaceC1635410sex;
        LJJIIJZLJL("called fetchViaHorizontalRequest");
        InterfaceC1635390sev interfaceC1635390sev = this.LIZIZ;
        if ((interfaceC1635390sev instanceof InterfaceC1635410sex) && (interfaceC1635410sex = (InterfaceC1635410sex) interfaceC1635390sev) != null) {
            mapEg = interfaceC1635410sex.Eg();
        } else {
            mapEg = null;
        }
        C13DA c13da = new C13DA();
        if (mapEg != null) {
            c13da.putAll(mapEg);
        }
        c13da.put("show_filtered_effects", "true");
        c13da.putAll(LJJIIJ(true));
        C23250099c.LIZLLL(this.LJIIZILJ, null, null, new C1633060sbA(horizontalEffectsFetcherRequest, this, c1633200sbO, c13da.build(), str, null), 3);
    }

    public f(String str, InterfaceC1635390sev interfaceC1635390sev, C11T4 c11t4, g gVar, HorizontalEffectsFetcher horizontalEffectsFetcher, InterfaceC1633140sbI interfaceC1633140sbI, C01GW c01gw, C01GW c01gw2, C01GW c01gw3, C1629170sUt c1629170sUt, C01GW c01gw4, C01GW c01gw5, C01GW c01gw6, p pVar, C1633750scH c1633750scH, Function0 function0, Function0 function02) {
        this.LIZ = str;
        this.LIZIZ = interfaceC1635390sev;
        this.LIZJ = c11t4;
        this.LIZLLL = gVar;
        this.LJ = horizontalEffectsFetcher;
        this.LJFF = interfaceC1633140sbI;
        this.LJI = c01gw;
        this.LJII = c01gw2;
        this.LJIIIIZZ = c01gw3;
        this.LJIIIZ = c1629170sUt;
        this.LJIIJ = c01gw4;
        this.LJIIJJI = c01gw5;
        this.LJIIL = c01gw6;
        this.LJIILIIL = pVar;
        this.LJIILJJIL = c1633750scH;
        this.LJIILL = function0;
        this.LJIILLIIL = function02;
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        this.LJIIZILJ = c054gLIZ;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(0);
        this.LJIJ = c2252321DDqLIZ;
        C414301jJ c414301jJ = new C414301jJ(C1633270sbV.LIZIZ.LIZ.LJIIJ, c2252321DDqLIZ, new C23064091y(this, null));
        C05YW.LIZ.getClass();
        this.LJIJI = C09IC.LJJIJIL(c414301jJ, c054gLIZ, C1370905Yd.LIZIZ, ApiState.Loading.INSTANCE);
        this.LJIJJLI = new C11PQ<>();
        this.LJIL = new C11PQ<>();
        this.LJJ = new C11PQ<>();
        this.LJJI = new C11PQ().LJLLLL();
        this.LJJIFFI = new C11PQ<>();
        this.LJJIII = new C11PQ<>();
        this.LJJIIJ = new C11PQ<>();
        this.LJJIIJZLJL = new C11RK<>();
        this.LJJIIZ = new C11PQ<>();
        this.LJJIIZI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1133));
        interfaceC1633140sbI.LIZ(this);
        ((InterfaceC23046091g) c01gw5.getValue()).LIZ(this);
        C11NJ c11nj = new C11NJ();
        this.LJJIJIIJI = c11nj;
        c11nj.LIZ(((InterfaceC23045091f) c01gw4.getValue()).LIZIZ().LJJLJLI(new AfS172S0100000_3(this, 99)));
        this.LJJIJIIJIL = C2191201ApK.LIZ();
        this.LJJIJL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5859));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        this.LJJIJLIJ = simpleDateFormat;
        this.LJJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1135));
        this.LJJIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(393));
    }
}
