package uuk;

import X.AbstractC1639260slA;
import X.AbstractC19484711Kz;
import X.AnonymousClass0950;
import X.C09IC;
import X.C09IR;
import X.C09JN;
import X.C11KQ;
import X.C11NJ;
import X.C11SY;
import X.C11T2;
import X.C11T4;
import X.C11T7;
import X.C11TE;
import X.C1624570sNT;
import X.C1628990sUb;
import X.C1629090sUl;
import X.C1629100sUm;
import X.C1631780sZ6;
import X.C1631790sZ7;
import X.C1631820sZA;
import X.C1631840sZC;
import X.C1631850sZD;
import X.C1634930seB;
import X.C1639410slP;
import X.C1639420slQ;
import X.C1641640sp0;
import X.C2252331DDr;
import X.C263450AUd;
import X.EnumC1149370g11;
import X.EnumC1641550sor;
import X.InterfaceC1631830sZB;
import X.InterfaceC1635390sev;
import X.InterfaceC19505211Sw;
import Y.AfS194S0100000_25;
import Y.AfS36S0210000_25;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS306S0000000_22;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import uuk.l;

/* JADX INFO: loaded from: classes26.dex */
public final class l extends C11SY implements InterfaceC1631830sZB {
    public final C11T4<Unit, C1631790sZ7, C1631790sZ7, List<String>> LIZJ;
    public final AbstractC1639260slA<C1629090sUl, FetchFavoriteListResponse> LIZLLL;
    public final AbstractC1639260slA<C1628990sUb, EffectListResponse> LJ;
    public final InterfaceC1635390sev LJFF;
    public final ConcurrentHashMap<String, Effect> LJI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Effect> LJII = new ConcurrentHashMap<>();
    public final C1634930seB<FetchFavoriteListResponse> LJIIIIZZ;
    public final C2252331DDr LJIIIZ;
    public final C1634930seB<EffectListResponse> LJIIJ;
    public final MutableLiveData<C1631820sZA> LJIIJJI;
    public final MutableLiveData<C1641640sp0<FetchFavoriteListResponse>> LJIIL;
    public final MutableLiveData<C1641640sp0<EffectListResponse>> LJIILIIL;
    public final MutableLiveData<Boolean> LJIILJJIL;
    public final C11NJ LJIILL;

    @Override // X.InterfaceC1628970sUZ
    public final l LJJ() {
        return this;
    }

    @Override // X.InterfaceC1628970sUZ
    public final void LIZJ() {
        this.LJIIIZ.LIZJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1628970sUZ
    public final AnonymousClass0950 LJJIIJ() {
        return C09IC.LIZ(this.LJIIIZ);
    }

    @Override // X.InterfaceC1631830sZB
    public final void dispose() {
        release();
        this.LJIILL.dispose();
    }

    @Override // X.InterfaceC1628970sUZ
    public final boolean LIZ(String str) {
        return this.LJII.containsKey(str);
    }

    @Override // X.InterfaceC1628970sUZ
    public final void LJIILJJIL(boolean z) {
        this.LJIILJJIL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1628970sUZ
    public final boolean LJIJJLI(Effect effect) {
        String effect_source_id = null;
        if (effect != null) {
            effect_source_id = effect.getEffectId();
        }
        if (C1624570sNT.LJIILLIIL(effect)) {
            if (effect != null) {
                effect_source_id = effect.getEffect_source_id();
            } else {
                return false;
            }
        }
        if (effect_source_id != null) {
            return LJJII(effect_source_id);
        }
        return false;
    }

    @Override // X.InterfaceC1628970sUZ
    public final boolean LJJII(String str) {
        List<Effect> effects;
        if (str == null) {
            return false;
        }
        if (!this.LJI.containsKey(str)) {
            FetchFavoriteListResponse fetchFavoriteListResponseLIZ = LIZ(Unit.LIZ);
            if (fetchFavoriteListResponseLIZ == null || (effects = fetchFavoriteListResponseLIZ.getEffects()) == null) {
                return false;
            }
            for (Effect effect : effects) {
                if (Intrinsics.LJFF(effect.getEffectId(), str)) {
                    if (effect == null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1628970sUZ
    public final C11KQ LJIIIIZZ(boolean z, C1628990sUb c1628990sUb) {
        C11T4 c11t7;
        if (z) {
            c11t7 = this.LJ;
        } else {
            c11t7 = new C11T7(AFwS306S0000000_22.get$arr$(16), C1639420slQ.LIZ(this.LJ, this.LJIIJ));
        }
        return AbstractC19484711Kz.LJIJJ(c11t7.request(c1628990sUb)).LJIILL(new AfS194S0100000_25(this, 212)).LJIIL(new AfS194S0100000_25(this, 213));
    }

    @Override // X.InterfaceC1628970sUZ
    public final C11KQ LJIIJ(boolean z, C1629090sUl c1629090sUl) {
        C11T4 c11t7;
        if (z) {
            c11t7 = this.LIZLLL;
        } else {
            c11t7 = new C11T7(AFwS311S0000000_25.get$arr$(71), C1639420slQ.LIZ(this.LIZLLL, this.LJIIIIZZ));
        }
        return AbstractC19484711Kz.LJIJJ(c11t7.request(c1629090sUl)).LJIILL(new AfS194S0100000_25(this, 210)).LJIIL(new AfS194S0100000_25(this, 211));
    }

    public final void LJJIJIL(final Effect effect, boolean z) {
        Object next;
        String effect_source_id;
        String effect_source_id2;
        this.LJIIJJI.setValue(new C1631820sZA(z));
        final FetchFavoriteListResponse fetchFavoriteListResponseLIZ = LIZ(Unit.LIZ);
        if (fetchFavoriteListResponseLIZ == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList(fetchFavoriteListResponseLIZ.getEffects());
        if (z) {
            final Effect effect2 = new Effect(effect);
            C1629100sUm.LJII(effect2, "fav_effect");
            if (C1624570sNT.LJIILLIIL(effect) && (effect_source_id2 = effect.getEffect_source_id()) != null && (!a0.LJJJIL(effect_source_id2))) {
                this.LJFF.LIZ(Collections.singletonList(effect.getEffect_source_id()), null, new IFetchEffectListByIdsListener() { // from class: X.0sVj
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        ListProtector.add(arrayList, 0, effect2);
                        this.LJJIJL(fetchFavoriteListResponseLIZ, arrayList);
                        l lVar = this;
                        lVar.LJI.put(effect2.getEffectId(), effect2);
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(EffectListResponse effectListResponse) {
                        List<Effect> data;
                        EffectListResponse effectListResponse2 = effectListResponse;
                        Object obj = effect;
                        if (effectListResponse2 != null) {
                            data = effectListResponse2.getData();
                        } else {
                            data = null;
                        }
                        if (data != null && !data.isEmpty()) {
                            obj = ListProtector.get(effectListResponse2.getData(), 0);
                        }
                        ListProtector.add(arrayList, 0, obj);
                        this.LJJIJL(fetchFavoriteListResponseLIZ, arrayList);
                        l lVar = this;
                        lVar.LJI.put(effect2.getEffectId(), (Effect) obj);
                    }
                });
                return;
            }
            ListProtector.add(arrayList, 0, effect2);
            this.LJI.put(effect2.getEffectId(), effect2);
            LJJIJL(fetchFavoriteListResponseLIZ, arrayList);
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((Effect) next).getEffectId(), effect.getEffectId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        final Effect effect3 = (Effect) next;
        if (effect3 == null) {
            effect3 = effect;
        }
        if (((Boolean) C263450AUd.LIZ.getValue()).booleanValue()) {
            if (effect == null) {
                Effect effect4 = C1629100sUm.LIZ;
            } else {
                C1629100sUm.LJII(effect, "");
            }
        }
        if (C1624570sNT.LJIILLIIL(effect) && (effect_source_id = effect.getEffect_source_id()) != null && (!a0.LJJJIL(effect_source_id))) {
            this.LJFF.LIZ(Collections.singletonList(effect.getEffect_source_id()), null, new IFetchEffectListByIdsListener() { // from class: X.0sVi
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                    arrayList.remove(effect3);
                    this.LJJIJL(fetchFavoriteListResponseLIZ, arrayList);
                    l lVar = this;
                    lVar.LJI.remove(effect3.getEffectId());
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectListResponse effectListResponse) {
                    Effect effect5;
                    List<Effect> data;
                    EffectListResponse effectListResponse2 = effectListResponse;
                    Effect effect6 = null;
                    if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && !data.isEmpty()) {
                        Iterator<Effect> it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Effect next2 = it3.next();
                            if (Intrinsics.LJFF(next2.getEffectId(), ((Effect) ListProtector.get(effectListResponse2.getData(), 0)).getEffectId())) {
                                effect6 = next2;
                                break;
                            }
                        }
                        effect5 = effect6;
                        if (effect5 == null) {
                            effect5 = effect3;
                        }
                    } else {
                        effect5 = effect3;
                    }
                    arrayList.remove(effect5);
                    this.LJJIJL(fetchFavoriteListResponseLIZ, arrayList);
                    this.LJI.remove(effect5.getEffectId());
                }
            });
            return;
        }
        arrayList.remove(effect3);
        LJJIJL(fetchFavoriteListResponseLIZ, arrayList);
        this.LJI.remove(effect3.getEffectId());
    }

    public final void LJJIJL(FetchFavoriteListResponse fetchFavoriteListResponse, List<? extends Effect> list) {
        fetchFavoriteListResponse.setEffects(list);
        put(Unit.LIZ, fetchFavoriteListResponse);
        this.LJIIL.setValue(C1641640sp0.LIZLLL(EnumC1641550sor.SUCCESS, fetchFavoriteListResponse));
    }

    @Override // X.InterfaceC1628970sUZ
    public final C11KQ LJII(EnumC1149370g11 enumC1149370g11, Effect effect, boolean z) {
        return AbstractC19484711Kz.LJIJJ(this.LIZJ.request(new C1631790sZ7(effect, !z))).LJIILJJIL(new AfS36S0210000_25(this, effect, z, enumC1149370g11, 0)).LJIIL(new AfS36S0210000_25(this, effect, z, enumC1149370g11, 1));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0seB, X.0seB<com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0seB, X.0seB<com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse>, X.11T1] */
    public l(C1631780sZ6 c1631780sZ6, C1631850sZD c1631850sZD, C1631840sZC c1631840sZC, InterfaceC1635390sev interfaceC1635390sev) {
        this.LIZJ = c1631780sZ6;
        this.LIZLLL = c1631850sZD;
        this.LJ = c1631840sZC;
        this.LJFF = interfaceC1635390sev;
        ?? r5 = new C1639410slP<Unit, V>() { // from class: X.0seB
        };
        this.LJIIIIZZ = r5;
        this.LJIIIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LJIIJ = new C1639410slP<Unit, V>() { // from class: X.0seB
        };
        this.LJIIJJI = new MutableLiveData<>();
        this.LJIIL = new MutableLiveData<>();
        this.LJIILIIL = new MutableLiveData<>();
        this.LJIILJJIL = new MutableLiveData<>();
        C11NJ c11nj = new C11NJ();
        this.LJIILL = c11nj;
        C11TE.LJJIJ(this, c1631850sZD, r5);
        c11nj.LIZ(C11T2.LIZIZ(c1631850sZD).LIZLLL(true, new InterfaceC19505211Sw[0]).LJJLJLI(new C09JN() { // from class: X.092W
            @Override // X.C09JN
            public final void accept(Object obj) {
                FetchFavoriteListResponse fetchFavoriteListResponse;
                C1C7U.LIZ("DefaultFavoriteStickerEditor@6014.<init>$1");
                Pair pair = (Pair) C13LP.LJJLIIIJL((List) obj);
                if (pair != null && (fetchFavoriteListResponse = (FetchFavoriteListResponse) pair.getSecond()) != null) {
                    fetchFavoriteListResponse.getData();
                }
                C1C7U.LIZIZ("DefaultFavoriteStickerEditor@6014.<init>$1");
            }
        }));
    }
}
