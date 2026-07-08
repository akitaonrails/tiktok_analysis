package com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.ui;

import X.C01GW;
import X.C08CB;
import X.C0LAB;
import X.C0QXR;
import X.C1018703yb;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1558520qew;
import X.C1766860w4y;
import X.C19EG;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C452501pT;
import X.C670060QQa;
import X.C687030QxB;
import X.C687050QxD;
import X.C687060QxE;
import X.C687070QxF;
import X.C687150QxN;
import X.C687170QxP;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC670440QRm;
import X.EnumC687130QxL;
import X.EnumC687200QxS;
import X.EnumC687210QxT;
import X.InterfaceC665370Q7z;
import X.InterfaceC687080QxG;
import X.InterfaceC687110QxJ;
import X.InterfaceC687260QxY;
import X.SurfaceHolderCallbackC1324410kZL;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.ability.IEcSearchCoinAbility;
import com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.model.EcSearchCoinData;
import com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.ui.EcSearchCoinAssem;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility;
import com.ss.android.ugc.aweme.ecommerce.search.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS128S0110000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchCoinAssem extends UISlotAssem implements IEcSearchCoinAbility, InterfaceC687080QxG {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public View LLJJI;
    public C687070QxF LLJJIII;
    public C687030QxB LLJJIJI;
    public C687050QxD LLJJIJIIJIL;
    public C687060QxE LLJJIJIL;
    public EcSearchCoinData LLJJJ;
    public Long LLJJJIL;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(100));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(101));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bom;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
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

    @Override // X.InterfaceC687080QxG
    public final void L5() {
        hp(EnumC687210QxT.RUNNING.getValue(), null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.ability.IEcSearchCoinAbility
    public final boolean nq1() {
        View view = this.LLJJI;
        return view != null && view.getVisibility() == 0;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws Throwable {
        super.onParentSet();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        sAFHelper.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJJIJLIJ = SAFHelper.LJJIJLIJ(fragmentLJI, c19egLIZ);
        if (interfaceC665370Q7zLJJIJLIJ != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJJIJLIJ, this, IEcSearchCoinAbility.class, null, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Long l;
        SurfaceHolderCallbackC1324410kZL surfaceHolderCallbackC1324410kZL;
        super.onResume();
        if (!C687150QxN.LJ()) {
            C687030QxB c687030QxB = this.LLJJIJI;
            if (c687030QxB != null) {
                c687030QxB.LIZ();
                return;
            }
            return;
        }
        Long l2 = C687150QxN.LLILZIL;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            Long l3 = this.LLJJJIL;
            if (l3 == null || jLongValue > l3.longValue()) {
                return;
            }
            C687030QxB c687030QxB2 = this.LLJJIJI;
            if (c687030QxB2 != null) {
                c687030QxB2.LIZIZ(jLongValue);
            }
            EcSearchCoinData ecSearchCoinData = this.LLJJJ;
            if (ecSearchCoinData == null || (l = ecSearchCoinData.countDownTime) == null) {
                return;
            }
            float fLongValue = jLongValue / l.longValue();
            C687030QxB c687030QxB3 = this.LLJJIJI;
            if (c687030QxB3 == null || (surfaceHolderCallbackC1324410kZL = c687030QxB3.LLILLL) == null) {
                return;
            }
            surfaceHolderCallbackC1324410kZL.setProgress(fLongValue);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0QxD, java.lang.Object] */
    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        MutableLiveData mutableLiveDataH02;
        super.onStart();
        final LifecycleRegistry lifecycle = getLifecycle();
        if (C687150QxN.LJ()) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.EcSearchCoinManager$addCoinAssemLifecycleObserver$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws JSONException {
                    String strOptString;
                    String strOptString2;
                    Integer numLJIIJJI;
                    EnumC687130QxL enumC687130QxL;
                    String value;
                    EnumC687130QxL enumC687130QxL2;
                    String str;
                    EnumC687130QxL enumC687130QxL3;
                    CopyOnWriteArrayList<InterfaceC687260QxY> copyOnWriteArrayList;
                    int i = C08CB.LIZ[event.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                lifecycle.removeObserver(this);
                                CopyOnWriteArrayList<Integer> copyOnWriteArrayList2 = C687150QxN.LLJ;
                                if (copyOnWriteArrayList2 != null) {
                                    copyOnWriteArrayList2.remove(Integer.valueOf(lifecycleOwner.hashCode()));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C687150QxN c687150QxN = C687150QxN.LL;
                        int value2 = EnumC687210QxT.PAUSE.getValue();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("pause_type", EnumC687200QxS.NEXT.getValue());
                        c687150QxN.LJFF(value2, jSONObject);
                        return;
                    }
                    int iHashCode = lifecycleOwner.hashCode();
                    CopyOnWriteArrayList<Integer> copyOnWriteArrayList3 = C687150QxN.LLJ;
                    if (copyOnWriteArrayList3 != null) {
                        copyOnWriteArrayList3.addIfAbsent(Integer.valueOf(iHashCode));
                    }
                    if (C687150QxN.LLIZLLLIL == null) {
                        C687150QxN.LLIZLLLIL = Integer.valueOf(iHashCode);
                    }
                    C687150QxN c687150QxN2 = C687150QxN.LL;
                    if (!C687150QxN.LJ() && (copyOnWriteArrayList = C687150QxN.LLIZ) != null) {
                        Iterator<InterfaceC687260QxY> it2 = copyOnWriteArrayList.iterator();
                        if (it2.hasNext()) {
                            it2.next().onHide();
                            return;
                        }
                    }
                    c687150QxN2.LJFF(EnumC687210QxT.RUNNING.getValue(), null);
                    if (!C687170QxP.LIZ) {
                        C0LAB c0lab = new C0LAB();
                        C687170QxP.LIZ(c0lab);
                        C687170QxP.LIZIZ(c0lab);
                        C1766860w4y.LIZ.getClass();
                        String strLIZIZ = C1766860w4y.LIZIZ("mall_extra_info");
                        if (strLIZIZ == null) {
                            strLIZIZ = "";
                        }
                        c0lab.LJ("mall_extra_info", strLIZIZ);
                        C1018703yb.LIZIZ("tiktokec_hover_pendant_show", c0lab.LIZ);
                        C687170QxP.LIZ = true;
                        C687170QxP.LIZIZ = SystemClock.elapsedRealtime();
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = C687150QxN.LLJIJIL;
                    if (jSONObject3 != null) {
                        strOptString = jSONObject3.optString("root_enter_from_type");
                    } else {
                        strOptString = null;
                    }
                    jSONObject2.put("root_enter_from_type", strOptString);
                    JSONObject jSONObject4 = C687150QxN.LLJIJIL;
                    if (jSONObject4 != null) {
                        strOptString2 = jSONObject4.optString("keyword");
                    } else {
                        strOptString2 = null;
                    }
                    jSONObject2.put("keyword", strOptString2);
                    jSONObject2.put("init_time", C687150QxN.LLJILJIL);
                    if (C687170QxP.LIZJ) {
                        return;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long jOptLong = jSONObject2.optLong("init_time");
                    C0LAB c0lab2 = new C0LAB();
                    String strOptString3 = jSONObject2.optString("root_enter_from_type");
                    if (strOptString3 != null) {
                        numLJIIJJI = C2095008Iq.LJIIJJI(strOptString3);
                    } else {
                        numLJIIJJI = null;
                    }
                    String strOptString4 = jSONObject2.optString("keyword");
                    String strLIZ = C670060QQa.LIZ(numLJIIJJI, null, null);
                    if (Intrinsics.LJFF(strLIZ, EnumC670440QRm.HALF_SHOP.getValue())) {
                        if (strOptString4 != null && strOptString4.length() != 0) {
                            enumC687130QxL3 = EnumC687130QxL.HALF_RESULT;
                        } else {
                            enumC687130QxL3 = EnumC687130QxL.HALF_MIDDLE;
                        }
                        value = enumC687130QxL3.getValue();
                    } else if (Intrinsics.LJFF(strLIZ, EnumC670440QRm.NINE_PERCENT_SHOP.getValue())) {
                        if (strOptString4 != null && strOptString4.length() != 0) {
                            enumC687130QxL2 = EnumC687130QxL.NINE_RESULT;
                        } else {
                            enumC687130QxL2 = EnumC687130QxL.NINE_MIDDLE;
                        }
                        value = enumC687130QxL2.getValue();
                    } else {
                        if (strOptString4 != null && strOptString4.length() != 0) {
                            enumC687130QxL = EnumC687130QxL.RESULT;
                        } else {
                            enumC687130QxL = EnumC687130QxL.MIDDLE;
                        }
                        value = enumC687130QxL.getValue();
                    }
                    c0lab2.LJ("page_name", value);
                    int value3 = C0QXR.UG_EC_SEARCH_COIN_TASK.getValue();
                    if (numLJIIJJI != null && numLJIIJJI.intValue() == value3) {
                        str = "task_page";
                    } else {
                        str = "mall";
                    }
                    c0lab2.LJ("previous_page", str);
                    c0lab2.LJ("pendant_type", "timer");
                    c0lab2.LIZIZ(jElapsedRealtime - jOptLong, "duration");
                    C1018703yb.LIZIZ("rd_tiktokec_pendent_show", c0lab2.LIZ);
                    C687170QxP.LIZJ = true;
                }
            });
        }
        ?? r1 = new InterfaceC687260QxY() { // from class: X.0QxD
            @Override // X.InterfaceC687260QxY
            public final void onHide() {
                C687030QxB c687030QxB = this.LIZ.LLJJIJI;
                if (c687030QxB != null) {
                    c687030QxB.LIZ();
                }
            }

            @Override // X.InterfaceC687260QxY
            public final void LIZIZ(float f) {
                SurfaceHolderCallbackC1324410kZL surfaceHolderCallbackC1324410kZL;
                C687030QxB c687030QxB = this.LIZ.LLJJIJI;
                if (c687030QxB != null && (surfaceHolderCallbackC1324410kZL = c687030QxB.LLILLL) != null) {
                    surfaceHolderCallbackC1324410kZL.setProgress(f);
                }
            }

            @Override // X.InterfaceC687260QxY
            public final void LIZJ(long j) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCountDownTimeUpdate currentThread: ");
                sbLIZ.append(C786410Ut5.u3());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
                C687030QxB c687030QxB = this.LIZ.LLJJIJI;
                if (c687030QxB != null) {
                    c687030QxB.LIZIZ(j);
                }
                this.LIZ.LLJJJIL = Long.valueOf(j);
            }

            @Override // X.InterfaceC687260QxY
            public final void LIZ(int i, JSONObject jSONObject) {
                long jLongValue;
                ARunnableS110S0100000_10 aRunnableS110S0100000_10 = null;
                if (i == EnumC687210QxT.RUNNING.getValue()) {
                    EcSearchCoinAssem ecSearchCoinAssem = this.LIZ;
                    if (ecSearchCoinAssem.LLJJIJIL == null) {
                        C687060QxE c687060QxE = new C687060QxE(Long.valueOf(((Number) this.LIZ.LLJJJJ.getValue()).longValue()), this.LIZ);
                        C687070QxF c687070QxF = this.LIZ.LLJJIII;
                        if (c687070QxF != null) {
                            if (c687070QxF.LL == null) {
                                c687070QxF.LL = new ArrayList();
                            }
                            List<InterfaceC687110QxJ> list = c687070QxF.LL;
                            if (list != null) {
                                ((ArrayList) list).add(c687060QxE);
                            }
                        }
                        ecSearchCoinAssem.LLJJIJIL = c687060QxE;
                    }
                    C687060QxE c687060QxE2 = this.LIZ.LLJJIJIL;
                    if (c687060QxE2 != null) {
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LIZ("start countDown");
                        BPEAHandler bPEAHandler = c687060QxE2.LIZLLL;
                        if (bPEAHandler != null) {
                            ARunnableS110S0100000_10 aRunnableS110S0100000_102 = c687060QxE2.LJFF;
                            if (aRunnableS110S0100000_102 == null) {
                                aRunnableS110S0100000_102 = null;
                            }
                            bPEAHandler.removeCallbacks(aRunnableS110S0100000_102);
                        }
                        Long l = c687060QxE2.LIZ;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 3;
                        }
                        c687060QxE2.LJ = jLongValue;
                        Handler handlerLIZIZ = c687060QxE2.LIZIZ();
                        if (handlerLIZIZ != null) {
                            ARunnableS110S0100000_10 aRunnableS110S0100000_103 = c687060QxE2.LJFF;
                            if (aRunnableS110S0100000_103 == null) {
                                aRunnableS110S0100000_103 = null;
                            }
                            C786410Ut5.LJJZZIII(handlerLIZIZ, aRunnableS110S0100000_103);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("start countDown: handler: ");
                        sbLIZ.append(c687060QxE2.LIZIZ());
                        sbLIZ.append(" countDownAction: ");
                        ARunnableS110S0100000_10 aRunnableS110S0100000_104 = c687060QxE2.LJFF;
                        if (aRunnableS110S0100000_104 != null) {
                            aRunnableS110S0100000_10 = aRunnableS110S0100000_104;
                        }
                        sbLIZ.append(aRunnableS110S0100000_10);
                        C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    return;
                }
                if (i == EnumC687210QxT.PAUSE.getValue()) {
                    C687060QxE c687060QxE3 = this.LIZ.LLJJIJIL;
                    if (c687060QxE3 == null) {
                        return;
                    }
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LIZ("pause countDown");
                    BPEAHandler bPEAHandler2 = c687060QxE3.LIZLLL;
                    if (bPEAHandler2 == null) {
                        return;
                    }
                    ARunnableS110S0100000_10 aRunnableS110S0100000_105 = c687060QxE3.LJFF;
                    if (aRunnableS110S0100000_105 != null) {
                        aRunnableS110S0100000_10 = aRunnableS110S0100000_105;
                    }
                    bPEAHandler2.removeCallbacks(aRunnableS110S0100000_10);
                    return;
                }
                if (i == EnumC687210QxT.STOP.getValue()) {
                    C687060QxE c687060QxE4 = this.LIZ.LLJJIJIL;
                    if (c687060QxE4 != null) {
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LIZ("cancel countDown");
                        BPEAHandler bPEAHandler3 = c687060QxE4.LIZLLL;
                        if (bPEAHandler3 != null) {
                            ARunnableS110S0100000_10 aRunnableS110S0100000_106 = c687060QxE4.LJFF;
                            if (aRunnableS110S0100000_106 == null) {
                                aRunnableS110S0100000_106 = null;
                            }
                            bPEAHandler3.removeCallbacks(aRunnableS110S0100000_106);
                        }
                        c687060QxE4.LIZLLL = null;
                        c687060QxE4.LIZJ = null;
                    }
                    this.LIZ.LLJJIJIL = null;
                    return;
                }
                if (i != EnumC687210QxT.COMPLETE.getValue()) {
                    return;
                }
                C687030QxB c687030QxB = this.LIZ.LLJJIJI;
                boolean zOptBoolean = false;
                if (c687030QxB != null && c687030QxB.getVisibility() != 0) {
                    return;
                }
                if (jSONObject != null) {
                    zOptBoolean = jSONObject.optBoolean("is_success");
                }
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                c2341109Fh.getClass();
                C2341109Fh.LIZ("coin task complete in background thread");
                C0CNO.LIZLLL(0L, new AwS128S0110000_10(this.LIZ, zOptBoolean, 9));
                C687060QxE c687060QxE5 = this.LIZ.LLJJIJIL;
                if (c687060QxE5 != null) {
                    c2341109Fh.getClass();
                    C2341109Fh.LIZ("cancel countDown");
                    BPEAHandler bPEAHandler4 = c687060QxE5.LIZLLL;
                    if (bPEAHandler4 != null) {
                        ARunnableS110S0100000_10 aRunnableS110S0100000_107 = c687060QxE5.LJFF;
                        if (aRunnableS110S0100000_107 == null) {
                            aRunnableS110S0100000_107 = null;
                        }
                        bPEAHandler4.removeCallbacks(aRunnableS110S0100000_107);
                    }
                    c687060QxE5.LIZLLL = null;
                    c687060QxE5.LIZJ = null;
                }
                this.LIZ.LLJJIJIL = null;
            }
        };
        this.LLJJIJIIJIL = r1;
        if (C687150QxN.LLIZ == null) {
            C687150QxN.LLIZ = new CopyOnWriteArrayList<>();
        }
        CopyOnWriteArrayList<InterfaceC687260QxY> copyOnWriteArrayList = C687150QxN.LLIZ;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add((InterfaceC687260QxY) r1);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            new KeyBoardVisibilityUtil(c19egLIZ, 32, new AwS624S0100000_10(this, 9));
        }
        C687060QxE c687060QxE = new C687060QxE(Long.valueOf(((Number) this.LLJJJJ.getValue()).longValue()), this);
        C687070QxF c687070QxF = this.LLJJIII;
        if (c687070QxF != null) {
            if (c687070QxF.LL == null) {
                c687070QxF.LL = new ArrayList();
            }
            List<InterfaceC687110QxJ> list = c687070QxF.LL;
            if (list != null) {
                ((ArrayList) list).add(c687060QxE);
            }
        }
        this.LLJJIJIL = c687060QxE;
        AObserverS214S0100000_10 aObserverS214S0100000_10 = new AObserverS214S0100000_10(this, 153);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initSearchBarInputStateObserver observer: ");
        sbLIZ.append(aObserverS214S0100000_10);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        ISearchBarAbility iSearchBarAbility = (ISearchBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchBarAbility.class, null);
        if (iSearchBarAbility == null || (mutableLiveDataH02 = iSearchBarAbility.h02()) == null) {
            return;
        }
        mutableLiveDataH02.observe(this, aObserverS214S0100000_10);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        MutableLiveData mutableLiveDataH02;
        C687070QxF c687070QxF;
        List<InterfaceC687110QxJ> list;
        super.onStop();
        C687050QxD c687050QxD = this.LLJJIJIIJIL;
        if (c687050QxD != null) {
            C687150QxN.LL.getClass();
            CopyOnWriteArrayList<InterfaceC687260QxY> copyOnWriteArrayList = C687150QxN.LLIZ;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(c687050QxD);
            }
        }
        C687060QxE c687060QxE = this.LLJJIJIL;
        if (c687060QxE != null && (c687070QxF = this.LLJJIII) != null && (list = c687070QxF.LL) != null) {
            ((ArrayList) list).remove(c687060QxE);
        }
        this.LLJJIJIL = null;
        ISearchBarAbility iSearchBarAbility = (ISearchBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchBarAbility.class, null);
        if (iSearchBarAbility == null || (mutableLiveDataH02 = iSearchBarAbility.h02()) == null) {
            return;
        }
        mutableLiveDataH02.removeObservers(this);
    }

    @Override // X.InterfaceC687080QxG
    public final void pause() throws JSONException {
        if (nq1()) {
            int value = EnumC687210QxT.PAUSE.getValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pause_type", EnumC687200QxS.NO_GLIDE.getValue());
            hp(value, jSONObject);
        }
    }

    public final void ip(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C687030QxB c687030QxB = this.LLJJIJI;
        if (c687030QxB != null) {
            ViewGroup.LayoutParams layoutParams = c687030QxB.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i);
                }
            } else {
                marginLayoutParams = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c687030QxB);
            c687030QxB.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        this.LLJJI = view;
        this.LLJJIJI = (C687030QxB) getContentView().findViewById(R.id.gfx);
        this.LLJJIII = (C687070QxF) getContentView().findViewById(R.id.gfy);
        C687150QxN.LL.getClass();
        EcSearchCoinData ecSearchCoinData = C687150QxN.LLILZLL;
        if (ecSearchCoinData != null) {
            C687030QxB c687030QxB = this.LLJJIJI;
            if (c687030QxB != null) {
                TuxTextView tuxTextView = c687030QxB.LL;
                if (tuxTextView != null) {
                    tuxTextView.setText(ecSearchCoinData.coinsCount);
                }
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                Integer numValueOf = Integer.valueOf(R.raw.icon_bitmap_task_giftbox);
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(numValueOf);
                c1331670kl3LIZLLL.LJJ(c687030QxB.LLILZ);
                C786410Ut5.h3(c1331670kl3LIZLLL);
            }
            this.LLJJJ = ecSearchCoinData;
            this.LLJJJIL = ecSearchCoinData.countDownTime;
        }
        ip(C687030QxB.LLILZLL);
    }

    public static void hp(int i, JSONObject jSONObject) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendCoinStateEvent start: ");
        sbLIZ.append(SystemClock.elapsedRealtime());
        sbLIZ.append(" state: ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", i);
        jSONObject2.put("extra_info", jSONObject);
        iEventCenter.LIZ("ec_search_coin_state_event", C786410Ut5.J3(jSONObject2));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sendCoinStateEvent end: ");
        sbLIZ2.append(SystemClock.elapsedRealtime());
        sbLIZ2.append(" state: ");
        sbLIZ2.append(i);
        C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
