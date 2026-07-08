package com.ss.android.ugc.aweme.sticker.presenter;

import X.C01GW;
import X.C05NX;
import X.C0AUY;
import X.C11NJ;
import X.C11NZ;
import X.C11PQ;
import X.C11PR;
import X.C11S5;
import X.C1324750kZt;
import X.C138P;
import X.C1622680sKQ;
import X.C1624340sN6;
import X.C1625440sOs;
import X.C1625920sPe;
import X.C1626170sQ3;
import X.C1629220sUy;
import X.C1629230sUz;
import X.C1629270sV3;
import X.C1629310sV7;
import X.C1629320sV8;
import X.C1629340sVA;
import X.C1629350sVB;
import X.C1629360sVC;
import X.C1629380sVE;
import X.C1629570sVX;
import X.C1698190uID;
import X.C1698220uIG;
import X.C1701940uOG;
import X.C19475711Hn;
import X.C19GS;
import X.C20510015Ni;
import X.C2188811AlT;
import X.C2219091BtD;
import X.C2281551ESb;
import X.C23052091m;
import X.C452501pT;
import X.EnumC1154180g8m;
import X.InterfaceC1463990oCT;
import X.InterfaceC1487280oo2;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625470sOv;
import X.InterfaceC1625530sP1;
import X.InterfaceC1625540sP2;
import X.InterfaceC1625550sP3;
import X.InterfaceC1627350sRx;
import X.InterfaceC1627740sSa;
import X.InterfaceC1628820sUK;
import X.InterfaceC1629370sVD;
import Y.ACallableS21S1000000_3;
import Y.ACallableS250S0200000_22;
import Y.ACallableS253S0200000_25;
import Y.ARunnableS58S0300000_25;
import Y.AfS115S0300000_25;
import Y.AfS159S0200000_25;
import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.sticker.ab.EffectDownloadNoNetworkOptConfig;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import duk.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.AwS75S1000000_25;
import kotlin.jvm.internal.AwS88S1300000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
public class DefaultStickerDataManager implements InterfaceC1624480sNK, GenericLifecycleObserver {
    public final C19GS LL;
    public final C1629320sV8 LLILLJJLI;
    public final InterfaceC1625470sOv LLILLL;
    public final InterfaceC1629370sVD LLILZ;
    public final C1625920sPe LLILZIL;
    public LifecycleOwner LLILZLL;
    public final C11PR<Effect> LLIZ;
    public final C19475711Hn LLIZLLLIL;
    public final MutableLiveData<Boolean> LLJ;
    public final MutableLiveData LLJI;
    public boolean LLJIJIL;
    public final C11NJ LLJILJIL;
    public final C1629270sV3 LLJILJILJ;
    public final p LLJILLL;
    public final p LLJJ;
    public final InterfaceC1627350sRx LLJJI;
    public boolean LLJJIII;
    public final AwS639S0100000_25 LLJJIJI;
    public InterfaceC1625530sP1 LLJJIJIIJIL;
    public InterfaceC1625550sP3 LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public int LLJJJJ;
    public Effect LLJJJJJIL;
    public long LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final String LLJLIL;
    public final String LLJLILLLLZIIL;
    public final Pair<String, String> LLJLL;
    public final long LLJLLIL;
    public final long LLJLLL;
    public int LLJZ;
    public final Map<String, List<Integer>> LLJZIJLIL;
    public int LLL;
    public long LLLF;
    public long LLLFF;
    public long LLLFFI;
    public long LLLFZ;
    public final C01GW LLLI;
    public final ConcurrentHashMap<String, C1629350sVB> LLLII;
    public boolean LLLIIII;

    @Override // X.InterfaceC1624480sNK
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC1624480sNK
    public void LJIJJ() {
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJIL() {
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJIJ() {
    }

    @Override // X.InterfaceC1624490sNL
    public final void LJJLIIIJ() {
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJLIIIJLJLI() {
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJLL() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJJLZIJ() {
        this.LLLFZ = 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1624480sNK
    public final Effect LJJL() {
        return (Effect) this.LLILLL.LJIJJLI().getValue();
    }

    @Override // X.InterfaceC1624480sNK
    public final Effect LLILIL() {
        return this.LLILLL.LJIILLIIL();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Lifecycle lifecycle;
        if (this.LLLIIII) {
            return;
        }
        this.LLLIIII = true;
        C1629380sVE.LIZ.getClass();
        if (((EffectDownloadNoNetworkOptConfig) C1629380sVE.LIZJ.getValue()).holdRequest) {
            C20510015Ni.LIZ.LIZJ(this.LLJJIJI);
        }
        this.LLJJI.invalidate();
        this.LLJILJIL.LJ();
        this.LLLII.clear();
        LifecycleOwner lifecycleOwner = this.LLILZLL;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        if (((Boolean) C0AUY.LIZ.getValue()).booleanValue()) {
            this.LLILZLL = null;
        }
    }

    @Override // X.InterfaceC1624480sNK
    public final Integer LJJIJIIJI() {
        return LJJLIIIJJIZ().LJIIZILJ;
    }

    @Override // X.InterfaceC1624480sNK
    public final int LJI() {
        return this.LLL;
    }

    @Override // X.InterfaceC1624480sNK
    public final InterfaceC1625470sOv LJII() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1624480sNK
    public final Pair<String, String> LJIIIIZZ() {
        return this.LLJLL;
    }

    @Override // X.InterfaceC1624480sNK
    public final String LJIIJ() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1624480sNK
    public final Effect LJIIJJI() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1624480sNK
    public final String LJIILIIL() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1624480sNK
    public final int LJIILJJIL() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC1624480sNK
    public final int LJIIZILJ() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1624480sNK
    public final String LJIJ() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1624480sNK
    public final C1625920sPe LJIJI() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1624480sNK
    public final long LJIJJLI() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC1624480sNK
    public final InterfaceC1625550sP3 LJJI() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1624480sNK
    public final long LJJIII() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1624480sNK
    public final C19475711Hn LJJIIZI() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1624480sNK
    public final long LJJIJIIJIL() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1624480sNK
    public final long LJJIJIL() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC1624480sNK
    public final String LJJIJLIJ() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1624480sNK
    public final boolean LJJIL() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1624480sNK
    public final InterfaceC1625530sP1 LJJIZ() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1624480sNK
    public final MutableLiveData LJJJI() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1624480sNK
    public C1629270sV3 LJJJIL() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1624480sNK
    public final /* bridge */ /* synthetic */ p LJJJJIZL() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1624480sNK
    public final String LJJJJJL() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC1624480sNK
    public final long LJJJJL() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC1624480sNK
    public final String LJJJJZ() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1624480sNK
    public final Map<String, List<Integer>> LJJJLIIL() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC1624480sNK
    public C1629320sV8 LJJLIIIJJIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1624480sNK
    public final long LJJLIIIJL() {
        return this.LLLFZ;
    }

    @Override // X.InterfaceC1624480sNK
    public final long LJJLIIIJLLLLLLLZ() {
        return this.LLLFF;
    }

    @Override // X.InterfaceC1624480sNK
    public final boolean LJJLJ() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1624480sNK
    public final /* bridge */ /* synthetic */ p LJJLJLI() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1624480sNK
    public final InterfaceC1627350sRx getStickerRepository() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1624480sNK
    public final void release() {
        onDestroy();
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJIILL(C05NX c05nx) {
        this.LLJJIJIL = c05nx;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJIILLIIL(Effect effect) {
        this.LLJJJJJIL = effect;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJ(boolean z) {
        this.LLJ.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJIFFI(String str) {
        this.LLJJL = str;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJII(String str) {
        this.LLJJJ = str;
    }

    @Override // X.InterfaceC1624480sNK
    public final boolean LJJIIJ(Effect effect) {
        EnumC1154180g8m enumC1154180g8m;
        C1629380sVE.LIZ.getClass();
        if (!((EffectDownloadNoNetworkOptConfig) C1629380sVE.LIZJ.getValue()).holdRequest) {
            return false;
        }
        C1629350sVB c1629350sVB = this.LLLII.get(effect.getEffectId());
        if (c1629350sVB != null) {
            enumC1154180g8m = c1629350sVB.LJI;
        } else {
            enumC1154180g8m = null;
        }
        if (enumC1154180g8m != EnumC1154180g8m.PENDING) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJIIJZLJL(boolean z) {
        this.LLJIJIL = z;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJIIZ(long j) {
        this.LLLFFI = j;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJIJL(long j) {
        this.LLLF = j;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJJ(C1622680sKQ c1622680sKQ) {
        this.LLJJIJIIJIL = c1622680sKQ;
    }

    @Override // X.InterfaceC1624480sNK
    public void LJJJJI(C1629220sUy c1629220sUy) {
        this.LLJJI.LIZJ().LIZJ(c1629220sUy);
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJJJJ(String str) {
        this.LLJJLIIIJLLLLLLLZ = str;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJJJLI(boolean z) {
        this.LLJL = z;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJJJLL(String str) {
        this.LLJJJIL = str;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJJJZI(Effect effect) {
        EnumC1154180g8m enumC1154180g8m;
        C1629350sVB c1629350sVB;
        C1629380sVE.LIZ.getClass();
        if (!((EffectDownloadNoNetworkOptConfig) C1629380sVE.LIZJ.getValue()).holdRequest) {
            return;
        }
        C1629350sVB c1629350sVB2 = this.LLLII.get(effect.getEffectId());
        if (c1629350sVB2 != null) {
            enumC1154180g8m = c1629350sVB2.LJI;
        } else {
            enumC1154180g8m = null;
        }
        if (enumC1154180g8m == EnumC1154180g8m.PENDING && (c1629350sVB = this.LLLII.get(effect.getEffectId())) != null) {
            ExceptionResult exceptionResult = new ExceptionResult(new RuntimeException());
            exceptionResult.setErrorCode(10030);
            exceptionResult.setMsg("effect download is been canceled");
            InterfaceC1625550sP3 interfaceC1625550sP3 = c1629350sVB.LJ;
            if (interfaceC1625550sP3 != null) {
                interfaceC1625550sP3.LJIILLIIL(c1629350sVB.LIZJ, exceptionResult);
            }
            this.LLLII.remove(effect.getEffectId());
        }
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJJZ(int i) {
        this.LLJJJJ = i;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJLI(long j) {
        this.LLLFF = j;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJLIIIJILLIZJL(int i) {
        this.LLL = i;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJLIIIJJI(int i) {
        this.LLJZ = i;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJLIIJ(long j) {
        this.LLJJJJLIIL = j;
    }

    @Override // X.InterfaceC1624480sNK
    public final void LIZJ(Effect effect, IFetchEffectListener iFetchEffectListener) {
        if (effect != null) {
            this.LLJJI.LJJI().LIZJ(effect, iFetchEffectListener);
        }
    }

    @Override // X.InterfaceC1624480sNK
    public final void LIZLLL(Effect effect, boolean z) {
        if (effect != null) {
            this.LLJJI.LJJI().LJII(effect);
            if (!z) {
                this.LLIZ.onNext(effect);
            }
        }
    }

    @Override // X.InterfaceC1624480sNK
    public void LJIIL(C1629230sUz c1629230sUz, AwS75S1000000_25 awS75S1000000_25) {
        this.LLJJI.LIZJ().LIZIZ(c1629230sUz);
    }

    @Override // X.InterfaceC1623080sL4
    public final void LJJLIIIIJ(C1629340sVA c1629340sVA, InterfaceC1625550sP3 interfaceC1625550sP3) {
        if (C2281551ESb.LIZIZ.LJII() && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LLJILJIL.LIZ(C11NZ.LJJJJI(new ACallableS253S0200000_25(this, c1629340sVA, 3)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS115S0300000_25(this, c1629340sVA, interfaceC1625550sP3, 0)));
        } else {
            LJJZZI(c1629340sVA, interfaceC1625550sP3, this.LLJJI.LJI().LIZ(c1629340sVA.LIZ));
        }
    }

    @Override // X.InterfaceC1624480sNK
    public final void LIZ(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        this.LLJJI.LJJI().LIZ(list, map, iFetchEffectListByIdsListener);
    }

    @Override // X.InterfaceC1624480sNK
    public final void LIZIZ(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        this.LLJJI.LJJI().LIZIZ(str, (C1698220uIG) iFetchEffectListener);
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJJJJ(Effect effect, AwS88S1300000_25 awS88S1300000_25, AFwS266S0000000_25 aFwS266S0000000_25) {
        this.LLJJI.LJJI().LIZJ(effect, new C1698190uID(awS88S1300000_25, aFwS266S0000000_25, 1));
    }

    public final void LJJZZI(C1629340sVA c1629340sVA, InterfaceC1625550sP3 interfaceC1625550sP3, boolean z) {
        String strLIZ;
        String string;
        String str;
        String strLIZ2;
        Bundle bundle;
        Effect effect = c1629340sVA.LIZ;
        InterfaceC1627740sSa interfaceC1627740sSaLJIILLIIL = this.LLJJI.LJIILLIIL();
        if (interfaceC1625550sP3 != null) {
            C1625440sOs c1625440sOs = c1629340sVA.LIZJ;
            String str2 = null;
            if (c1625440sOs != null && (bundle = c1625440sOs.LJ) != null) {
                string = bundle.getString("prop_launch_ui_point", "");
            } else {
                string = null;
            }
            if (LJJLIIIJJIZ().LJIIL && z && (str = LJJLIIIJJIZ().LJIIJJI) != null && str.length() != 0 && C1626170sQ3.LIZ(interfaceC1627740sSaLJIILLIIL, effect, z) && (((strLIZ2 = C1629360sVC.LIZ(effect)) == null || !(!a0.LJJJIL(strLIZ2)) || C1324750kZt.LJIIZILJ(UriProtector.parse(strLIZ2))) && (interfaceC1625550sP3 instanceof InterfaceC1625540sP2))) {
                ((InterfaceC1625540sP2) interfaceC1625550sP3).LJIILJJIL(effect);
                InterfaceC1629370sVD interfaceC1629370sVD = this.LLILZ;
                if (interfaceC1629370sVD != null) {
                    long jLIZIZ = C138P.LIZ().LIZIZ(TimeUnit.MILLISECONDS);
                    C1625440sOs c1625440sOs2 = c1629340sVA.LIZJ;
                    if (c1625440sOs2 != null) {
                        str2 = c1625440sOs2.LJIIJ;
                    }
                    interfaceC1629370sVD.LIZIZ(effect, jLIZIZ, z ? 1 : 0, str2, string);
                    return;
                }
                return;
            }
            LJJLIIIJJIZ().LJIIIIZZ.invoke(effect);
            C1625440sOs c1625440sOs3 = c1629340sVA.LIZJ;
            if (c1625440sOs3 != null) {
                str2 = c1625440sOs3.LJIIJ;
            }
            C1629310sV7 c1629310sV7 = new C1629310sV7(z ? 1 : 0, str2, string, interfaceC1625550sP3, this.LLILZ, LJJLIIIJJIZ().LJIIIZ, new AwS426S0200000_25(this, effect, 78));
            C1629380sVE.LIZ.getClass();
            if (((EffectDownloadNoNetworkOptConfig) C1629380sVE.LIZJ.getValue()).holdRequest) {
                if (!NetworkUtils.isNetworkAvailable(this.LL) && !z) {
                    if (!this.LLJJIII) {
                        this.LLJJIII = true;
                        C20510015Ni.LIZ.LJII(this.LLJJIJI);
                    }
                    interfaceC1625550sP3.LJIIIIZZ(effect);
                    this.LLLII.put(effect.getEffectId(), new C1629350sVB(interfaceC1627740sSaLJIILLIIL, c1629340sVA, effect, c1629310sV7, interfaceC1625550sP3, System.currentTimeMillis(), EnumC1154180g8m.PENDING));
                    return;
                }
                LJJZ(z, interfaceC1627740sSaLJIILLIIL, c1629340sVA, effect, c1629310sV7);
                return;
            }
            LJJZ(z, interfaceC1627740sSaLJIILLIIL, c1629340sVA, effect, c1629310sV7);
            return;
        }
        if (LJJLIIIJJIZ().LJIIL && z && C1626170sQ3.LIZ(interfaceC1627740sSaLJIILLIIL, effect, z) && ((strLIZ = C1629360sVC.LIZ(effect)) == null || !(!a0.LJJJIL(strLIZ)) || C1324750kZt.LJIIZILJ(UriProtector.parse(strLIZ)))) {
            return;
        }
        interfaceC1627740sSaLJIILLIIL.LIZIZ(new C1629340sVA(effect, c1629340sVA.LIZIZ, c1629340sVA.LIZJ), false);
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJFF(List list, boolean z, Map map, IFetchEffectListListener iFetchEffectListListener) {
        this.LLJJI.LJJI().LJ(list, true, map, iFetchEffectListListener);
    }

    @Override // X.InterfaceC1624480sNK
    public final void LJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener) {
        if (effect != null) {
            this.LLJJI.LJJI().LJFF(effect, z, z2, z3, (C1698220uIG) iFetchEffectListener);
        }
    }

    public final void LJJZ(boolean z, InterfaceC1627740sSa interfaceC1627740sSa, C1629340sVA c1629340sVA, Effect effect, C1629310sV7 c1629310sV7) {
        C11NJ c11nj;
        C1629570sVX c1629570sVX = new C1629570sVX(z, interfaceC1627740sSa, c1629340sVA.LIZJ);
        if (LJJLIIIJJIZ().LJII) {
            ARunnableS58S0300000_25 aRunnableS58S0300000_25 = new ARunnableS58S0300000_25(c1629570sVX, effect, c1629310sV7, 8);
            String strLIZ = C1629360sVC.LIZ(effect);
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[DownloadStickerAndHintIconCombiner:download] hintIconUrl: ");
            sbLIZ.append(strLIZ);
            interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
            if (strLIZ != null && !a0.LJJJIL(strLIZ)) {
                c1629570sVX.LJFF.LIZ(C11NZ.LJJJJI(new ACallableS21S1000000_3(strLIZ, 5)).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.00De
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        return Boolean.TRUE;
                    }
                }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS159S0200000_25(c1629570sVX, aRunnableS58S0300000_25, 3)));
                c11nj = c1629570sVX.LJFF;
            } else {
                c1629570sVX.LJ = true;
                aRunnableS58S0300000_25.run();
                return;
            }
        } else {
            c1629570sVX.LJFF.LIZ(C11NZ.LJJJJI(new ACallableS250S0200000_22(c1629570sVX, effect, 9)).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.00Df
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    return Boolean.TRUE;
                }
            }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS115S0300000_25(c1629570sVX, (InterfaceC1625550sP3) c1629310sV7, effect, 3)));
            c11nj = c1629570sVX.LJFF;
        }
        if (c11nj != null) {
            this.LLJILJIL.LIZ(c11nj);
        }
    }

    public DefaultStickerDataManager(C19GS c19gs, C1629320sV8 c1629320sV8, InterfaceC1628820sUK interfaceC1628820sUK, C1624340sN6 c1624340sN6, InterfaceC1629370sVD interfaceC1629370sVD, C1625920sPe c1625920sPe, LifecycleOwner lifecycleOwner, int i, int i2) {
        Lifecycle lifecycle;
        interfaceC1629370sVD = (i2 & 16) != 0 ? null : interfaceC1629370sVD;
        c1625920sPe = (i2 & 32) != 0 ? null : c1625920sPe;
        lifecycleOwner = (i2 & 64) != 0 ? c19gs : lifecycleOwner;
        i = (i2 & 128) != 0 ? 0 : i;
        this.LL = c19gs;
        this.LLILLJJLI = c1629320sV8;
        this.LLILLL = c1624340sN6;
        this.LLILZ = interfaceC1629370sVD;
        this.LLILZIL = c1625920sPe;
        this.LLILZLL = lifecycleOwner;
        C11PR c11prLJLLLL = new C11PQ().LJLLLL();
        this.LLIZ = c11prLJLLLL;
        this.LLIZLLLIL = new C19475711Hn(c11prLJLLLL);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLJ = mutableLiveData;
        this.LLJI = mutableLiveData;
        this.LLJILJIL = new C11NJ();
        this.LLJILJILJ = new C1629270sV3();
        p pVar = C23052091m.LIZ() ? new p(i) : null;
        this.LLJILLL = pVar;
        this.LLJJ = pVar;
        this.LLJJI = interfaceC1628820sUK.LIZ(pVar);
        LifecycleOwner lifecycleOwner2 = this.LLILZLL;
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        this.LLJJIJI = new AwS639S0100000_25(this, 98);
        this.LLJJJ = "";
        this.LLJJJIL = "";
        this.LLJJJJ = -1;
        this.LLJJJJLIIL = -1L;
        this.LLJJL = "";
        this.LLJJLIIIJLLLLLLLZ = "";
        this.LLJL = true;
        this.LLJLIL = "";
        this.LLJLILLLLZIIL = "";
        this.LLJLL = new Pair<>("", "");
        this.LLJLLIL = -1L;
        this.LLJLLL = -1L;
        this.LLJZIJLIL = new LinkedHashMap();
        this.LLLI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 763));
        this.LLLII = new ConcurrentHashMap<>();
    }
}
