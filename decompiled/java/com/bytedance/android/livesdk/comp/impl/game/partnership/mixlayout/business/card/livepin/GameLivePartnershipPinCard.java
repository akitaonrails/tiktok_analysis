package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.livepin;

import X.AbstractC1542200qEc;
import X.AbstractC1882890z67;
import X.C01GW;
import X.C098200Yq;
import X.C1105720esc;
import X.C1155600gB4;
import X.C1389890mGx;
import X.C1548820qPI;
import X.C1879980z1Q;
import X.C1879990z1R;
import X.C1880070z1Z;
import X.C1881280z3W;
import X.C1882650z5j;
import X.C1882700z5o;
import X.C189200o6;
import X.C20441214yg;
import X.C293501Bt;
import X.C476770Imp;
import X.C786410Ut5;
import X.InterfaceC1107590evd;
import X.InterfaceC1881290z3X;
import X.InterfaceC1881340z3c;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.GamePreregisterResultParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.lynx.tasm.LynxViewClient;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class GameLivePartnershipPinCard extends AbstractC1882890z67<GameLivePartnershipPinCardModel> {
    public FrameLayout LLJJIJI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJIJIIJIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJIJIL;
    public long LLJJJ;
    public boolean LLJJJIL;
    public final C1879990z1R LLJJJJ;
    public final C1879980z1Q LLJJJJJIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLI() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.livepin.GameLivePartnershipPinCard.LJJJJLI():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject LJJJJZI() {
        Object c098200Yq;
        String str;
        try {
            GameLivePartnershipPinCardModel gameLivePartnershipPinCardModel = (GameLivePartnershipPinCardModel) this.LLILZIL;
            if (gameLivePartnershipPinCardModel == null || (str = gameLivePartnershipPinCardModel.initialData) == null) {
                str = "{}";
            }
            c098200Yq = new JSONObject(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("GameLivePartnershipPinCard", "getInitialData error", thM5exceptionOrNullimpl);
            c098200Yq = new JSONObject();
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        jSONObject.put("gamecp_mix_page_token", this.LLILLL.LIZLLL());
        return jSONObject;
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJ() {
        super.LJJIJ();
        C1882650z5j c1882650z5j = C1882700z5o.LIZJ;
        c1882650z5j.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) C1882650z5j.LIZ().get(this);
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.remove("gamePartnershipMixViewReserveAndOpenCompletion")) {
            if (copyOnWriteArraySet.isEmpty()) {
                C1882650z5j.LIZ().remove(this);
            }
            C01GW c01gw = C1882650z5j.LLILLL;
            AtomicInteger atomicInteger = (AtomicInteger) ((ConcurrentHashMap) c01gw.getValue()).get("gamePartnershipMixViewReserveAndOpenCompletion");
            if (atomicInteger == null || atomicInteger.decrementAndGet() <= 0) {
                C1548820qPI.LJIIIIZZ("gamePartnershipMixViewReserveAndOpenCompletion", c1882650z5j);
                ((ConcurrentHashMap) c01gw.getValue()).remove("gamePartnershipMixViewReserveAndOpenCompletion");
            }
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJIIJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJJIJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            boolean z2 = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJJ(true);
        }
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        FrameLayout frameLayout = this.LLJJIJI;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        this.LLJJIJI = null;
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJLIJ() throws JSONException {
        super.LJJIJLIJ();
        LJJJJLI();
    }

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this.LL);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        this.LLJJIJI = frameLayout;
        return frameLayout;
    }

    @Override // X.AbstractC1882890z67
    public final void LJJJ(View view) throws JSONException {
        this.LLILZLL = view;
        LJJJJLI();
        C1882650z5j.LIZJ("gamePartnershipMixViewReserveAndOpenCompletion", this);
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJJJJZ(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.LLJJIJIL;
        }
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIIJ(String str, InterfaceC1881290z3X interfaceC1881290z3X) {
        View view;
        Object c098200Yq;
        Object objLJIIIIZZ;
        if (Intrinsics.LJFF(str, "gamePartnershipMixViewReserveAndOpenCompletion") && interfaceC1881290z3X != null) {
            Object obj = null;
            if (interfaceC1881290z3X instanceof C1881280z3W) {
                Object obj2 = ((C1881280z3W) interfaceC1881290z3X).LIZ;
                if (obj2 instanceof GamePreregisterResultParam) {
                    obj = (InterfaceC1881290z3X) obj2;
                } else if (obj2 instanceof InterfaceC1107590evd) {
                    try {
                        String strLJ = C476770Imp.LJ(((InterfaceC1107590evd) ((C1881280z3W) interfaceC1881290z3X).LIZ).LIZ());
                        if (strLJ != null && strLJ.length() != 0) {
                            objLJIIIIZZ = C293501Bt.LIZ().LJIIIIZZ(strLJ, new TypeToken<GamePreregisterResultParam>() { // from class: X.0z3V
                            }.getType());
                        } else {
                            objLJIIIIZZ = null;
                        }
                        c098200Yq = (InterfaceC1881290z3X) objLJIIIIZZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                        obj = c098200Yq;
                    }
                    obj = (InterfaceC1881290z3X) obj;
                }
            } else {
                if (!(interfaceC1881290z3X instanceof GamePreregisterResultParam)) {
                    interfaceC1881290z3X = null;
                }
                obj = (GamePreregisterResultParam) interfaceC1881290z3X;
            }
            GamePreregisterResultParam gamePreregisterResultParam = (GamePreregisterResultParam) obj;
            if (gamePreregisterResultParam == null || (view = this.LLILZLL) == null) {
                return;
            }
            if (gamePreregisterResultParam.result) {
                if (gamePreregisterResultParam.isRegister) {
                    C1389890mGx c1389890mGx = new C1389890mGx(view);
                    c1389890mGx.LJIIIZ(2131852543);
                    c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                    c1389890mGx.LJI(-1);
                    c1389890mGx.LJIIJJI();
                    C1880070z1Z.LJIIIZ(this.LLILLL, "toast");
                    return;
                }
                return;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(view);
            c1389890mGx2.LJFF(R.raw.icon_x_mark_circle_fill);
            c1389890mGx2.LJII(R.attr.c9i);
            c1389890mGx2.LJIIIZ(2131855694);
            c1389890mGx2.LJIIJJI();
            C1880070z1Z.LJIIIZ(this.LLILLL, "toast");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0z1R] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0z1Q] */
    public GameLivePartnershipPinCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
        this.LLJJJIL = true;
        this.LLJJJJ = new LynxViewClient() { // from class: X.0z1R
            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIIJ() {
                C20441214yg.LIZIZ("GameLivePartnershipPinCard", "FloatingGameCard onFirstScreen");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LL.LLJJJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FloatingGameCard on first screen : ");
                sbLIZ.append(jElapsedRealtime);
                sbLIZ.append(" , firstLoad = ");
                sbLIZ.append(this.LL.LLJJJIL);
                C20441214yg.LIZIZ("GameLivePartnershipPinCard", C2188811AlT.LIZIZ(sbLIZ));
                C474530IjD.LIZ(jElapsedRealtime, "first_screen");
                C474530IjD.LIZ(this.LL.LLJJJIL ? 1L : 0L, "first_load");
                this.LL.LLJJJIL = false;
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void onTimingSetup(Map<String, Object> map) {
                Object obj;
                Map map2;
                Object obj2;
                Long l;
                Object obj3;
                Map map3;
                Object obj4;
                long jLongValue;
                Long l2 = null;
                if (map == null) {
                    obj = null;
                } else {
                    try {
                        obj = map.get("metrics");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return;
                    }
                }
                if (obj instanceof Map) {
                    map2 = (Map) obj;
                } else {
                    map2 = null;
                }
                if (map2 == null) {
                    obj2 = null;
                } else {
                    obj2 = map2.get("fcp");
                }
                if (obj2 instanceof Long) {
                    l = (Long) obj2;
                } else {
                    l = null;
                }
                if (map == null) {
                    obj3 = null;
                } else {
                    obj3 = map.get("metrics");
                }
                if (obj3 instanceof Map) {
                    map3 = (Map) obj3;
                } else {
                    map3 = null;
                }
                if (map3 == null) {
                    obj4 = null;
                } else {
                    obj4 = map3.get("lynx_fcp");
                }
                if (obj4 instanceof Long) {
                    l2 = (Long) obj4;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FloatingGameCard onTimingSetup  fcp=");
                sbLIZ.append(l);
                sbLIZ.append("  lynxFcp=");
                sbLIZ.append(l2);
                C20441214yg.LIZIZ("PartnershipAudience", C2188811AlT.LIZIZ(sbLIZ));
                long jLongValue2 = 0;
                if (l == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = l.longValue();
                }
                C474530IjD.LIZ(jLongValue, "fcp");
                if (l2 != null) {
                    jLongValue2 = l2.longValue();
                }
                C474530IjD.LIZ(jLongValue2, "lynx_fcp");
                C189200o6.m2constructorimpl(Unit.LIZ);
            }
        };
        this.LLJJJJJIL = new AbstractC1542200qEc() { // from class: X.0z1Q
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILLJJLI.LLJJJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FloatingGameCard onLoadFinish cost=");
                sbLIZ.append(jElapsedRealtime);
                C20441214yg.LIZIZ("GameLivePartnershipPinCard", C2188811AlT.LIZIZ(sbLIZ));
                C474530IjD.LIZ(jElapsedRealtime, "on_finish");
                this.LLILLJJLI.LJJIJL();
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILLJJLI.LLJJJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FloatingGameCard onRuntimeReady cost=");
                sbLIZ.append(jElapsedRealtime);
                C20441214yg.LIZIZ("GameLivePartnershipPinCard", C2188811AlT.LIZIZ(sbLIZ));
                C474530IjD.LIZ(jElapsedRealtime, "on_runtime_ready");
            }

            /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0122  */
            @Override // X.AbstractC1537870q7d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJL(X.InterfaceC1541990qEH r11, java.lang.String r12, X.C1542120qEU r13) {
                /*
                    Method dump skipped, instruction units count: 292
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1879980z1Q.LJL(X.0qEH, java.lang.String, X.0qEU):void");
            }
        };
    }

    public final void LJJJJLL(int i, String str, Map map) {
        LifecycleOwner lifecycleOwner = this.LLILLL.getLifecycleOwner();
        if (lifecycleOwner == null) {
            return;
        }
        if (i != 0) {
            if (i == 1 && this.LLJJIJIL == null) {
                this.LLJJIJIL = C1105720esc.LIZ(1, this.LL, map, null, null, str, lifecycleOwner);
                return;
            }
            return;
        }
        if (this.LLJJIJIIJIL != null) {
            return;
        }
        this.LLJJIJIIJIL = C1105720esc.LIZ(0, this.LL, map, this.LLJJJJ, this.LLJJJJJIL, str, lifecycleOwner);
    }
}
