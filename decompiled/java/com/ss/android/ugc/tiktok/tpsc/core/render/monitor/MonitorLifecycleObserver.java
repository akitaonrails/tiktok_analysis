package com.ss.android.ugc.tiktok.tpsc.core.render.monitor;

import X.C01GW;
import X.C103L;
import X.C1913480ztS;
import X.C356901a3;
import X.C452501pT;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class MonitorLifecycleObserver implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final C103L LL;
    public final C01GW LLILLJJLI;
    public Long LLILLL;
    public Long LLILZ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        this.LLILZ = Long.valueOf(System.currentTimeMillis());
        C1913480ztS.LIZIZ("pns_tpsc_page_enter", (Map) this.LLILLJJLI.getValue());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll((Map) this.LLILLJJLI.getValue());
        Long l = this.LLILZ;
        if (l != null) {
            linkedHashMap.put("stay_time", String.valueOf(System.currentTimeMillis() - l.longValue()));
        }
        C1913480ztS.LIZIZ("pns_tpsc_page_exit", linkedHashMap);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll((Map) this.LLILLJJLI.getValue());
        Long l = this.LLILLL;
        if (l != null) {
            linkedHashMap.put("stay_time", String.valueOf(System.currentTimeMillis() - l.longValue()));
        }
        C1913480ztS.LIZIZ("pns_tpsc_page_hide", linkedHashMap);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        this.LLILLL = Long.valueOf(System.currentTimeMillis());
        C1913480ztS.LIZIZ("pns_tpsc_page_show", (Map) this.LLILLJJLI.getValue());
    }

    public MonitorLifecycleObserver(C103L c103l, C01GW<? extends Map<String, String>> c01gw) {
        this.LL = c103l;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS429S0200000_28(this, (MonitorLifecycleObserver) c01gw, (C01GW<? extends Map<String, String>>) 67));
    }
}
