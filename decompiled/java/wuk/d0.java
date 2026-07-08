package wuk;

import X.AnonymousClass0206;
import X.AnonymousClass0951;
import X.AnonymousClass0988;
import X.C01GW;
import X.C091J;
import X.C11NJ;
import X.C11O8;
import X.C13BV;
import X.C13LP;
import X.C1449380nou;
import X.C15438062q;
import X.C1629080sUk;
import X.C1629220sUy;
import X.C1631810sZ9;
import X.C1633080sbC;
import X.C1641640sp0;
import X.C1701940uOG;
import X.C19475711Hn;
import X.C19487811Me;
import X.C19719612Di;
import X.C1DEV;
import X.C2191201ApK;
import X.C2296808zG;
import X.C23117093z;
import X.C452501pT;
import X.EnumC1641550sor;
import X.InterfaceC1487280oo2;
import X.InterfaceC1633140sbI;
import X.InterfaceC23044091e;
import X.InterfaceC23045091f;
import X.InterfaceC23046091g;
import X.InterfaceC23050091k;
import X.InterfaceC497601wk;
import Y.AComparatorS22S0000000_3;
import Y.AfS172S0100000_3;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.image.TemplatesPanelResp;
import com.ss.android.ugc.aweme.sticker.model.PropInfoData;
import com.ss.android.ugc.effectmanager.common.model.ApiState;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class d0 implements InterfaceC1633140sbI {
    public static long LJJIJ;
    public static final /* synthetic */ int LJJIJIIJI = 0;
    public final C01GW<InterfaceC23045091f> LIZ;
    public final C01GW<InterfaceC23046091g> LIZIZ;
    public final C01GW<C091J> LIZJ;
    public final List<EffectCategoryModel> LIZLLL;
    public final PropInfoData LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(543));
    public final Map<String, Effect> LJI = new HashMap();
    public final Map<String, Effect> LJII = new HashMap();
    public final List<EffectCategoryModel> LJIIIIZZ = new ArrayList();
    public final MutableLiveData<Integer> LJIIIZ = new MutableLiveData<>();
    public final Map<String, MutableLiveData<Integer>> LJIIJ = new LinkedHashMap();
    public final MutableLiveData<Integer> LJIIJJI = new MutableLiveData<>(0);
    public final Map<String, List<Effect>> LJIIL = new LinkedHashMap();
    public final HashMap<String, List<C1449380nou>> LJIILIIL = new HashMap<>();
    public final CopyOnWriteArrayList<C1629220sUy> LJIILJJIL = new CopyOnWriteArrayList<>();
    public InterfaceC23044091e LJIILL;
    public final C11NJ LJIILLIIL;
    public final MutableLiveData<List<String>> LJIIZILJ;
    public final C01GW<MutableLiveData<List<EffectCategoryModel>>> LJIJ;
    public final C01GW<MutableLiveData<C1641640sp0<PanelInfoModel>>> LJIJI;
    public final C01GW<MutableLiveData<C1641640sp0<HorizontalEffectsModel>>> LJIJJ;
    public final C01GW<LinkedHashMap<String, MutableLiveData<C1641640sp0<CategoryEffectModel>>>> LJIJJLI;
    public final C01GW<MutableLiveData<C1641640sp0<SearchEffectResponseV2>>> LJIL;
    public final C01GW<MutableLiveData<C1641640sp0<RecommendSearchWordsResponse>>> LJJ;
    public final C01GW<MutableLiveData<C1641640sp0<FetchHotEffectResponse>>> LJJI;
    public final C01GW<MutableLiveData<C1641640sp0<TemplatesPanelResp>>> LJJIFFI;
    public final String LJJII;
    public String LJJIII;
    public final C01GW<MutableLiveData<Boolean>> LJJIIJ;
    public final C01GW LJJIIJZLJL;
    public final C1DEV LJJIIZ;
    public final C01GW LJJIIZI;

    static {
        new C1629080sUk();
    }

    @Override // X.InterfaceC1625880sPa
    public final List<EffectCategoryModel> LIZIZ() {
        if (!this.LJIJ.isInitialized()) {
            return this.LIZLLL;
        }
        List<EffectCategoryModel> value = this.LJIJ.getValue().getValue();
        return value == null ? this.LIZLLL : value;
    }

    @Override // X.InterfaceC1625880sPa
    public final long LIZJ() {
        Long receivePanelInfoTime1 = this.LJ.getReceivePanelInfoTime1();
        long jLongValue = receivePanelInfoTime1 != null ? receivePanelInfoTime1.longValue() : 0L;
        Long panelInfoInvokeTime1 = this.LJ.getPanelInfoInvokeTime1();
        return jLongValue - (panelInfoInvokeTime1 != null ? panelInfoInvokeTime1.longValue() : 0L);
    }

    @Override // X.InterfaceC1625880sPa
    public final LiveData<List<EffectCategoryModel>> LJI() {
        return this.LJIJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1625880sPa
    public final HorizontalEffectsModel LJIILIIL() {
        ApiState.Success success;
        AnonymousClass0951 anonymousClass0951LJIIL;
        if (!((Boolean) this.LJJIIZI.getValue()).booleanValue()) {
            C1641640sp0<HorizontalEffectsModel> value = this.LJIJJ.getValue().getValue();
            if (value != null) {
                return value.LIZ;
            }
            return null;
        }
        InterfaceC23044091e interfaceC23044091e = this.LJIILL;
        ApiState apiState = (interfaceC23044091e == null || (anonymousClass0951LJIIL = interfaceC23044091e.LJIIL()) == null) ? null : (ApiState) anonymousClass0951LJIIL.getValue();
        if (!(apiState instanceof ApiState.Success) || (success = (ApiState.Success) apiState) == null) {
            return null;
        }
        return (HorizontalEffectsModel) success.data;
    }

    @Override // X.InterfaceC1625880sPa
    public final MutableLiveData LJIILL() {
        return (MutableLiveData) this.LJJIIJZLJL.getValue();
    }

    @Override // X.InterfaceC1625880sPa
    public final LiveData<C1641640sp0<RecommendSearchWordsResponse>> LJIILLIIL() {
        return this.LJJ.getValue();
    }

    @Override // X.InterfaceC1625880sPa
    public final LiveData<C1641640sp0<SearchEffectResponseV2>> LJIIZILJ() {
        return this.LJIL.getValue();
    }

    @Override // X.InterfaceC1625880sPa
    public final Map<String, LiveData<C1641640sp0<CategoryEffectModel>>> LJIJI() {
        return this.LJIJJLI.getValue();
    }

    public final InterfaceC497601wk LJJIIJ() {
        return (InterfaceC497601wk) this.LJFF.getValue();
    }

    public final boolean LJJIIJZLJL() {
        return !this.LJIJI.isInitialized() || this.LJIJI.getValue().getValue() == null || this.LJIJI.getValue().getValue().LIZIZ == EnumC1641550sor.ERROR;
    }

    @Override // X.InterfaceC1633140sbI
    public final void dispose() {
        this.LJIILLIIL.LJ();
        C2296808zG.LIZJ(LJJIIJ(), null);
        this.LJIILJJIL.clear();
    }

    @Override // X.InterfaceC1625880sPa
    public final Map<String, Effect> LJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1625880sPa
    public final MutableLiveData LJFF() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1625880sPa
    public final List<EffectCategoryModel> LJIILJJIL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1625880sPa
    public final MutableLiveData LJIJJ() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC1625880sPa
    public final MutableLiveData LJJ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1633140sbI
    public final void LIZ(InterfaceC23044091e interfaceC23044091e) {
        this.LJIILL = interfaceC23044091e;
        this.LJIILLIIL.LIZ(interfaceC23044091e.LJIILIIL().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.091L
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C1641640sp0 c1641640sp0LIZ;
                Pair pair = (Pair) obj;
                int iIntValue = ((Number) pair.getFirst()).intValue();
                C091S c091s = (C091S) pair.getSecond();
                Integer numValueOf = Integer.valueOf(iIntValue);
                if (c091s instanceof C23055091p) {
                    c1641640sp0LIZ = C1641640sp0.LIZIZ();
                } else if (c091s instanceof C23061091v) {
                    c1641640sp0LIZ = C1641640sp0.LIZJ(c091s.LIZ);
                } else if (c091s instanceof C23056091q) {
                    c1641640sp0LIZ = C1641640sp0.LIZ((Throwable) c091s.LIZ);
                } else {
                    throw new C1954807lC();
                }
                return new Pair(numValueOf, c1641640sp0LIZ);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS172S0100000_3(this, 105)));
        this.LJIILLIIL.LIZ(interfaceC23044091e.LJIILL().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.091T
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C091S c091s = (C091S) obj;
                if (c091s instanceof C23055091p) {
                    return C1641640sp0.LIZIZ();
                }
                if (c091s instanceof C23061091v) {
                    T t = c091s.LIZ;
                    C1632470saD c1632470saD = C1632470saD.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("dealHorizontalEffects, thread = ");
                    sbLIZ.append(C786410Ut5.u3().getName());
                    C201955140j.LIZLLL(c1632470saD, "StickerSource", C2188811AlT.LIZIZ(sbLIZ));
                    return C1641640sp0.LIZJ(t);
                }
                if (c091s instanceof C23056091q) {
                    return C1641640sp0.LIZ((Throwable) c091s.LIZ);
                }
                throw new C1954807lC();
            }
        }).LJJLJLI(new AfS172S0100000_3(this, 102)));
        LJJI(interfaceC23044091e);
        this.LJIILLIIL.LIZ(interfaceC23044091e.LJIIJJI().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.091M
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C1641640sp0 c1641640sp0LIZ;
                Pair pair = (Pair) obj;
                int iIntValue = ((Number) pair.getFirst()).intValue();
                C091S c091s = (C091S) pair.getSecond();
                Integer numValueOf = Integer.valueOf(iIntValue);
                if (c091s instanceof C23055091p) {
                    c1641640sp0LIZ = C1641640sp0.LIZIZ();
                } else if (c091s instanceof C23061091v) {
                    c1641640sp0LIZ = C1641640sp0.LIZJ(c091s.LIZ);
                } else if (c091s instanceof C23056091q) {
                    c1641640sp0LIZ = C1641640sp0.LIZ((Throwable) c091s.LIZ);
                } else {
                    throw new C1954807lC();
                }
                return new Pair(numValueOf, c1641640sp0LIZ);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS172S0100000_3(this, 107)));
        this.LJIILLIIL.LIZ(interfaceC23044091e.LJIJJLI().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.091P
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C091S c091s = (C091S) obj;
                if (c091s instanceof C23055091p) {
                    return C1641640sp0.LIZIZ();
                }
                if (c091s instanceof C23061091v) {
                    return C1641640sp0.LIZJ(c091s.LIZ);
                }
                if (c091s instanceof C23056091q) {
                    return C1641640sp0.LIZ((Throwable) c091s.LIZ);
                }
                throw new C1954807lC();
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS172S0100000_3(this, 106)));
        this.LJIILLIIL.LIZ(interfaceC23044091e.LJJII().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.091N
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C091S c091s = (C091S) obj;
                if (c091s instanceof C23055091p) {
                    return C1641640sp0.LIZIZ();
                }
                if (c091s instanceof C23061091v) {
                    return C1641640sp0.LIZJ(c091s.LIZ);
                }
                if (c091s instanceof C23056091q) {
                    return C1641640sp0.LIZ((Throwable) c091s.LIZ);
                }
                throw new C1954807lC();
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS172S0100000_3(this, 103)));
        C11NJ c11nj = this.LJIILLIIL;
        C11O8 c11o8LJJJLZIJ = interfaceC23044091e.LJIIIIZZ().LJJJLZIJ(C1701940uOG.LIZIZ());
        AfS172S0100000_3 afS172S0100000_3 = new AfS172S0100000_3(this, 100);
        AnonymousClass0988 anonymousClass0988 = C19487811Me.LIZLLL;
        c11nj.LIZ(c11o8LJJJLZIJ.LJJLL(afS172S0100000_3, anonymousClass0988));
        this.LJIILLIIL.LIZ(interfaceC23044091e.LJIIJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS172S0100000_3(this, 108), anonymousClass0988));
        this.LJIILLIIL.LIZ(interfaceC23044091e.LJIL().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.091O
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C091S c091s = (C091S) obj;
                if (c091s instanceof C23055091p) {
                    return C1641640sp0.LIZIZ();
                }
                if (c091s instanceof C23061091v) {
                    return C1641640sp0.LIZJ(c091s.LIZ);
                }
                if (c091s instanceof C23056091q) {
                    return C1641640sp0.LIZ((Throwable) c091s.LIZ);
                }
                throw new C1954807lC();
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS172S0100000_3(this, 104)));
    }

    @Override // X.InterfaceC1625880sPa
    public final void LIZLLL(List<String> list) {
        InterfaceC23044091e interfaceC23044091e = this.LJIILL;
        if (interfaceC23044091e != null) {
            interfaceC23044091e.LIZLLL(list);
        }
    }

    @Override // X.InterfaceC1625880sPa
    public final void LJII(List<? extends Effect> list) {
        for (Effect effect : list) {
            ((HashMap) this.LJII).put(effect.getEffectId(), effect);
        }
    }

    @Override // X.InterfaceC1625880sPa
    public final CategoryEffectModel LJIIIIZZ(String str) {
        C1641640sp0<CategoryEffectModel> value;
        MutableLiveData<C1641640sp0<CategoryEffectModel>> mutableLiveData = this.LJIJJLI.getValue().get(str);
        if (mutableLiveData != null && (value = mutableLiveData.getValue()) != null) {
            return value.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC1625880sPa
    public final List<C1449380nou> LJIIL(String str) {
        List<C1449380nou> list = this.LJIILIIL.get(str);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        return list;
    }

    @Override // X.InterfaceC1625880sPa
    public final void LJIJ(List<? extends Effect> list) {
        for (Effect effect : list) {
            ((HashMap) this.LJI).put(effect.getEffectId(), effect);
        }
    }

    @Override // X.InterfaceC1625880sPa
    public final LiveData<Integer> LJIL(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJIIJ;
        Object mutableLiveData = linkedHashMap.get(str);
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData(0);
            linkedHashMap.put(str, mutableLiveData);
        }
        return (LiveData) mutableLiveData;
    }

    public void LJJI(InterfaceC23044091e interfaceC23044091e) {
        this.LJIILLIIL.LIZ(interfaceC23044091e.LJIJ().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.091K
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C1641640sp0 c1641640sp0LIZ;
                C443120HZe c443120HZe = (C443120HZe) obj;
                int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
                Object second = c443120HZe.getSecond();
                C091S c091s = (C091S) c443120HZe.getThird();
                Integer numValueOf = Integer.valueOf(iIntValue);
                if (c091s instanceof C23055091p) {
                    c1641640sp0LIZ = C1641640sp0.LIZIZ();
                } else if (c091s instanceof C23061091v) {
                    T t = c091s.LIZ;
                    if (!(t instanceof CategoryEffectModel)) {
                        t = null;
                    }
                    c1641640sp0LIZ = C1641640sp0.LIZJ(t);
                } else if (c091s instanceof C23056091q) {
                    c1641640sp0LIZ = C1641640sp0.LIZ((Throwable) c091s.LIZ);
                } else {
                    throw new C1954807lC();
                }
                return new C443120HZe(numValueOf, second, c1641640sp0LIZ);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS172S0100000_3(this, 98)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIFFI(C1641640sp0<HorizontalEffectsModel> c1641640sp0) {
        List<? extends Effect> listLJJII;
        List<? extends Effect> listLJJII2;
        List<? extends Effect> listLJJII3;
        List<? extends Effect> listLJJII4;
        this.LIZ.getValue().LIZLLL("");
        HorizontalEffectsModel horizontalEffectsModel = c1641640sp0.LIZ;
        M mCopy = 0;
        List<? extends Effect> listLJJII5 = null;
        List<? extends Effect> listLJJII6 = null;
        if (horizontalEffectsModel != null) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("internal_horizontal_effects_settings", false) && horizontalEffectsModel.trending_effects == null) {
                List<String> arrayList = horizontalEffectsModel.url_prefix;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                ArrayList arrayList2 = new ArrayList();
                List<? extends Effect> list = horizontalEffectsModel.favorite_effects;
                if (list != null) {
                    listLJJII3 = LJJII(this, list);
                } else {
                    listLJJII3 = null;
                }
                List<? extends Effect> list2 = horizontalEffectsModel.recent_effects;
                if (list2 != null) {
                    listLJJII4 = LJJII(this, list2);
                } else {
                    listLJJII4 = null;
                }
                List<? extends Effect> list3 = horizontalEffectsModel.insert_effects;
                if (list3 != null) {
                    listLJJII5 = LJJII(this, list3);
                }
                mCopy = horizontalEffectsModel.copy(arrayList2, listLJJII3, listLJJII4, listLJJII5, horizontalEffectsModel.left_trending_effects, arrayList, horizontalEffectsModel.from_cache, horizontalEffectsModel.logId);
            } else {
                List<? extends Effect> listLJJII7 = LJJII(this, horizontalEffectsModel.trending_effects);
                List<? extends Effect> list4 = horizontalEffectsModel.favorite_effects;
                if (list4 != null) {
                    listLJJII = LJJII(this, list4);
                } else {
                    listLJJII = null;
                }
                List<? extends Effect> list5 = horizontalEffectsModel.recent_effects;
                if (list5 != null) {
                    listLJJII2 = LJJII(this, list5);
                } else {
                    listLJJII2 = null;
                }
                List<? extends Effect> list6 = horizontalEffectsModel.insert_effects;
                if (list6 != null) {
                    listLJJII6 = LJJII(this, list6);
                }
                mCopy = horizontalEffectsModel.copy(listLJJII7, listLJJII, listLJJII2, listLJJII6, horizontalEffectsModel.left_trending_effects, horizontalEffectsModel.url_prefix, horizontalEffectsModel.from_cache, horizontalEffectsModel.logId);
            }
        }
        c1641640sp0.LIZ = mCopy;
    }

    public final MutableLiveData<C1641640sp0<CategoryEffectModel>> LJJIII(String str) {
        MutableLiveData<C1641640sp0<CategoryEffectModel>> mutableLiveData = this.LJIJJLI.getValue().get(str);
        if (mutableLiveData == null) {
            MutableLiveData<C1641640sp0<CategoryEffectModel>> mutableLiveData2 = new MutableLiveData<>();
            this.LJIJJLI.getValue().put(str, mutableLiveData2);
            return mutableLiveData2;
        }
        return mutableLiveData;
    }

    public static List LJJII(d0 d0Var, List list) {
        d0Var.getClass();
        ArrayList arrayList = new ArrayList(list);
        d0Var.LIZ.getValue().LIZ("", arrayList);
        return arrayList;
    }

    public static final Pair<List<Effect>, Boolean> LJJIIZI(d0 d0Var, String str, List<? extends Effect> list) {
        CopyOnWriteArrayList<C1629220sUy> copyOnWriteArrayList = d0Var.LJIILJJIL;
        ArrayList arrayList = new ArrayList();
        for (C1629220sUy c1629220sUy : copyOnWriteArrayList) {
            try {
                String key = C23117093z.LJFF(d0Var).get(c1629220sUy.LIZIZ).getKey();
                key.length();
                if (Intrinsics.LJFF(str, key)) {
                    arrayList.add(c1629220sUy);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS22S0000000_3(41), arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listLJLLLL.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((C1629220sUy) it2.next()).LIZ, arrayList2);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (hashSet.add(((Effect) obj).getEffectId())) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((Effect) it3.next()).getId());
            }
            ArrayList arrayList5 = new ArrayList();
            for (Effect effect : list) {
                if (!arrayList4.contains(effect.getId())) {
                    arrayList5.add(effect);
                }
            }
            return new Pair<>(C13LP.LJLIL(arrayList5, arrayList3), Boolean.TRUE);
        }
        return new Pair<>(list, Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.091f, X.0sI6] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZ(com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r23, boolean r24, X.InterfaceC1364105Vn<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wuk.d0.LJJIIZ(com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    @Override // X.InterfaceC1625880sPa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.lifecycle.LiveData<X.C1641640sp0<com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel>> LJIIIZ(java.util.List<java.lang.String> r12, boolean r13, com.ss.android.ugc.aweme.sticker.repository.params.FetchMode r14, java.lang.Integer r15) {
        /*
            r11 = this;
            X.01GW<androidx.lifecycle.MutableLiveData<X.0sp0<com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel>>> r0 = r11.LJIJJ
            boolean r0 = r0.isInitialized()
            if (r0 == 0) goto L9e
            X.01GW<androidx.lifecycle.MutableLiveData<X.0sp0<com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel>>> r0 = r11.LJIJJ
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L9e
            X.01GW<androidx.lifecycle.MutableLiveData<X.0sp0<com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel>>> r0 = r11.LJIJJ
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            java.lang.Object r0 = r0.getValue()
            X.0sp0 r0 = (X.C1641640sp0) r0
            if (r0 == 0) goto L9c
            X.0sor r1 = r0.LIZIZ
        L28:
            X.0sor r0 = X.EnumC1641550sor.ERROR
            if (r1 == r0) goto L9e
            if (r13 != 0) goto L9e
            r3 = 0
        L2f:
            X.0saD r2 = X.C1632470saD.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fetchHorizontalEffectsData: needRequest = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", forceRetry = "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ", fetchMode = "
            r1.append(r0)
            r9 = r14
            r1.append(r9)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "StickerSource"
            X.C201955140j.LIZLLL(r2, r0, r1)
            if (r3 == 0) goto L93
            long r0 = java.lang.System.currentTimeMillis()
            wuk.d0.LJJIJ = r0
            X.01GW<androidx.lifecycle.MutableLiveData<X.0sp0<com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel>>> r0 = r11.LJIJJ
            java.lang.Object r1 = r0.getValue()
            androidx.lifecycle.LiveData r1 = (androidx.lifecycle.LiveData) r1
            X.0sp0 r0 = X.C1641640sp0.LIZIZ()
            r1.postValue(r0)
            if (r12 != 0) goto L72
            X.13BV r12 = X.C13BV.INSTANCE
        L72:
            com.ss.android.ugc.aweme.sticker.repository.params.HorizontalEffectsFetcherRequest r0 = X.C1629080sUk.LIZ(r15, r12)
            java.util.List<java.lang.String> r1 = r0.insertEffectIds
            boolean r2 = r0.trending
            boolean r3 = r0.favorite
            java.lang.String r4 = r0.favoriteType
            boolean r5 = r0.recent
            java.lang.String r6 = r0.recentType
            java.lang.Integer r7 = r0.recentEffectsLimit
            int r8 = r0.whitelistScene
            java.util.Map<java.lang.String, java.lang.String> r10 = r0.params
            com.ss.android.ugc.aweme.sticker.repository.params.HorizontalEffectsFetcherRequest r1 = r0.copy(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.091e r0 = r11.LJIILL
            if (r0 == 0) goto L93
            r0.LJJ(r1)
        L93:
            X.01GW<androidx.lifecycle.MutableLiveData<X.0sp0<com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel>>> r0 = r11.LJIJJ
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            return r0
        L9c:
            r1 = 0
            goto L28
        L9e:
            r3 = 1
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: wuk.d0.LJIIIZ(java.util.List, boolean, com.ss.android.ugc.aweme.sticker.repository.params.FetchMode, java.lang.Integer):androidx.lifecycle.LiveData");
    }

    @Override // X.InterfaceC1625880sPa
    public LiveData LJIIJ(String str, boolean z, boolean z2, boolean z3) {
        if (z && LJJIIJZLJL()) {
            this.LJIJI.getValue().setValue(C1641640sp0.LIZIZ());
            if (str == null) {
                str = "";
            }
            PropInfoData propInfoData = this.LJ;
            if (propInfoData != null) {
                propInfoData.setPanelInfoInvokeTime1(Long.valueOf(System.currentTimeMillis()));
            }
            C1633080sbC c1633080sbC = new C1633080sbC(str, z2, z3, 862);
            InterfaceC23044091e interfaceC23044091e = this.LJIILL;
            if (interfaceC23044091e != null) {
                interfaceC23044091e.LJIIIZ(c1633080sbC);
            }
        }
        return this.LJIJI.getValue();
    }

    @Override // X.InterfaceC1625880sPa
    public MutableLiveData LJIJJLI(String str, Map map, boolean z, boolean z2) {
        MutableLiveData<C1641640sp0<CategoryEffectModel>> mutableLiveDataLJJIII = LJJIII(str);
        if (z && (mutableLiveDataLJJIII.getValue() == null || mutableLiveDataLJJIII.getValue().LIZIZ == EnumC1641550sor.ERROR)) {
            mutableLiveDataLJJIII.setValue(C1641640sp0.LIZIZ());
            InterfaceC23044091e interfaceC23044091e = this.LJIILL;
            if (interfaceC23044091e != null) {
                interfaceC23044091e.LIZIZ(new C1631810sZ9(str, 0, 0, 0, z2, 0, map, 382));
            }
        }
        return mutableLiveDataLJJIII;
    }

    public d0(PropInfoData propInfoData, InterfaceC23050091k interfaceC23050091k, List list, C01GW c01gw, C01GW c01gw2, C01GW c01gw3) {
        C19475711Hn c19475711HnLIZJ;
        this.LIZ = c01gw;
        this.LIZIZ = c01gw2;
        this.LIZJ = c01gw3;
        this.LIZLLL = list;
        this.LJ = propInfoData;
        C11NJ c11nj = new C11NJ();
        this.LJIILLIIL = c11nj;
        this.LJIIZILJ = new MutableLiveData<>();
        this.LJIJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 175));
        this.LJIJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1700));
        this.LJIJJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1706));
        this.LJIJJLI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1702));
        this.LJIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1705));
        this.LJJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1703));
        this.LJJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1707));
        this.LJJIFFI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1699));
        this.LJJII = "hot";
        this.LJJIII = "";
        this.LJJIIJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1701));
        this.LJJIIJZLJL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1704));
        this.LJJIIZ = C2191201ApK.LIZ();
        c11nj.LIZ(((InterfaceC23046091g) c01gw2.getValue()).LIZLLL().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS172S0100000_3(this, 109)));
        c11nj.LIZ(((InterfaceC23045091f) c01gw.getValue()).LIZIZ().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS172S0100000_3(this, 96)));
        if (interfaceC23050091k != null && (c19475711HnLIZJ = interfaceC23050091k.LIZJ()) != null) {
            c11nj.LIZ(c19475711HnLIZJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS172S0100000_3(this, 97)));
        }
        this.LJJIIZI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(579));
    }

    @Override // X.InterfaceC1625880sPa
    public LiveData LJIIJJI(boolean z, boolean z2, String str, int i, int i2, int i3, Map map) {
        return LJIJJLI(str, map, true, z2);
    }
}
