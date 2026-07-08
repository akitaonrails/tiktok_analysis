package com.ss.android.ugc.aweme.im.activestatus.impl.analytics;

import X.C01GW;
import X.C0ZE6;
import X.C0ZE7;
import X.C0ZE9;
import X.C0ZEB;
import X.C0ZEC;
import X.C0ZED;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C892550Yzt;
import X.EnumC1910440zoY;
import X.InterfaceC1493105sv;
import X.InterfaceC497601wk;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.im.saas.host.api.main.IMMainSAFLifecycle;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ActivityStatusDelegate implements C0ZE6, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final Set<String> LL;
    public final Set<String> LLILLJJLI;
    public final Map<String, Integer> LLILLL;
    public final Map<String, Integer> LLILZ;
    public final Map<String, C0ZE7> LLILZIL;
    public final Map<String, C0ZE7> LLILZLL;
    public final Map<String, Set<String>> LLIZ;
    public final Set<String> LLIZLLLIL;
    public C0ZED LLJ;
    public final C01GW LLJI;

    static {
        new C0ZEB();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LL.clear();
        this.LLILLJJLI.clear();
        ((LinkedHashMap) this.LLILZIL).clear();
        ((LinkedHashMap) this.LLILZLL).clear();
        ((LinkedHashMap) this.LLIZ).clear();
        this.LLIZLLLIL.clear();
        C0ZED c0zed = this.LLJ;
        if (c0zed != null) {
            c0zed.LIZ.invoke();
        }
        C2296808zG.LIZJ((InterfaceC497601wk) this.LLJI.getValue(), null);
    }

    public ActivityStatusDelegate(LifecycleOwner lifecycleOwner) {
        LifecycleOwner lifecycleOwnerLIZ;
        Lifecycle lifecycle;
        IMMainSAFLifecycle.LIZ.getClass();
        IMMainSAFLifecycle value = C892550Yzt.LIZIZ.getValue();
        if (value != null && (lifecycleOwnerLIZ = value.LIZ(lifecycleOwner)) != null && (lifecycle = lifecycleOwnerLIZ.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        this.LL = new LinkedHashSet();
        this.LLILLJJLI = new LinkedHashSet();
        this.LLILLL = new LinkedHashMap();
        this.LLILZ = new LinkedHashMap();
        this.LLILZIL = new LinkedHashMap();
        this.LLILZLL = new LinkedHashMap();
        this.LLIZ = new LinkedHashMap();
        this.LLIZLLLIL = new LinkedHashSet();
        this.LLJI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(86));
    }

    @Override // X.C0ZE6
    public final void LIZ(C0ZE7 c0ze7) {
        String str;
        if (c0ze7 != null && (str = c0ze7.LJIIIZ) != null) {
            if (Intrinsics.LJFF(c0ze7.LJIIJJI, Boolean.TRUE)) {
                this.LLIZLLLIL.add(str);
            } else {
                this.LLIZLLLIL.remove(str);
            }
        }
    }

    @Override // X.C0ZE6
    public final void LIZJ(Function0<Unit> function0) {
        this.LLJ = new C0ZED(function0);
    }

    @Override // X.C0ZE6
    public final void LIZLLL(C0ZE7 c0ze7) {
        String str = c0ze7.LIZJ;
        if (str != null) {
            this.LLILZIL.put(str, c0ze7);
            if (!this.LL.contains(str)) {
                C0ZEB.LIZ(c0ze7);
                this.LL.add(str);
            }
        }
        String str2 = c0ze7.LJIIIZ;
        if (str2 != null && !this.LLILLJJLI.contains(str2)) {
            C0ZEB.LIZ(c0ze7);
            this.LLILLJJLI.add(str2);
        }
    }

    @Override // X.C0ZE6
    public final void LJ(C0ZE7 c0ze7) {
        int iIntValue;
        int iIntValue2;
        if (c0ze7 != null) {
            String str = c0ze7.LJIIIZ;
            if (str != null) {
                int i = c0ze7.LJIIJ;
                Integer num = (Integer) ((LinkedHashMap) this.LLILLL).get(str);
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue2 != i && i > 0) {
                    if (Intrinsics.LJFF(c0ze7.LIZIZ, EnumC1910440zoY.CHAT_CELL.getValue())) {
                        if (this.LLIZLLLIL.contains(str)) {
                            C0ZEB.LIZIZ(c0ze7);
                        }
                    } else if (Intrinsics.LJFF(c0ze7.LIZIZ, EnumC1910440zoY.CHAT_ROOM.getValue())) {
                        C0ZEB.LIZIZ(c0ze7);
                    }
                }
                this.LLILLL.put(str, Integer.valueOf(i));
            }
            String str2 = c0ze7.LIZJ;
            if (str2 != null) {
                int i2 = c0ze7.LJIIJ;
                Integer num2 = (Integer) ((LinkedHashMap) this.LLILZ).get(str2);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = -1;
                }
                if (iIntValue != i2 && i2 > 0 && Intrinsics.LJFF(c0ze7.LIZIZ, EnumC1910440zoY.MESSAGE_TAB.getValue())) {
                    C0ZEB.LIZIZ(c0ze7);
                }
                this.LLILZ.put(str2, Integer.valueOf(i2));
            }
        }
    }

    @Override // X.C0ZE6
    public final void LIZIZ(C0ZE7 c0ze7, InterfaceC1493105sv interfaceC1493105sv) {
        if (c0ze7 == null) {
            return;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLJI.getValue(), null, null, new C0ZE9(c0ze7, interfaceC1493105sv, new C0ZEC(c0ze7).LIZ(), null), 3);
    }
}
