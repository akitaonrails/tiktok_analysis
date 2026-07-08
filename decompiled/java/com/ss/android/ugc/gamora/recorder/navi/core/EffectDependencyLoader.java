package com.ss.android.ugc.gamora.recorder.navi.core;

import X.C01GW;
import X.C01TT;
import X.C111Y;
import X.C19EG;
import X.C201955140j;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC2254081DKk;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bef.effectsdk.message.MessageCenter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS178S1100000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class EffectDependencyLoader implements MessageCenter.Listener, GenericLifecycleObserver {
    public final C19EG LL;
    public final InterfaceC2254081DKk LLILLJJLI;
    public final Set<String> LLILLL = new LinkedHashSet();
    public final Map<String, List<C111Y>> LLILZ = new LinkedHashMap();
    public boolean LLILZIL;
    public final C01GW LLILZLL;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LLILZIL = true;
        MessageCenter.removeListener(this);
        ((LinkedHashMap) this.LLILZ).clear();
        this.LLILLL.clear();
        ((Lifecycle) this.LLILZLL.getValue()).removeObserver(this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public EffectDependencyLoader(C19EG c19eg, InterfaceC2254081DKk interfaceC2254081DKk) {
        this.LL = c19eg;
        this.LLILLJJLI = interfaceC2254081DKk;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 732));
        this.LLILZLL = c01gwLIZIZ;
        if (((Lifecycle) c01gwLIZIZ.getValue()).getCurrentState() != Lifecycle.State.DESTROYED) {
            ((Lifecycle) c01gwLIZIZ.getValue()).addObserver(this);
            MessageCenter.addListener(this);
        }
    }

    public final void LIZ(int i, long j, String str, String str2) {
        if (this.LLILZIL) {
            return;
        }
        if (str2 != null && !this.LLILLL.contains(str2)) {
            if (!this.LLILZ.containsKey(str2)) {
                this.LLILZ.put(str2, new ArrayList());
            }
            List list = (List) ((LinkedHashMap) this.LLILZ).get(str2);
            if (list != null) {
                list.add(new C111Y(i, j, str));
                return;
            }
            return;
        }
        LIZIZ(i, j, 0L, str);
    }

    public final void LIZIZ(int i, long j, long j2, String str) {
        if (this.LLILZIL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("send Message, messageType=");
        sbLIZ.append(i);
        sbLIZ.append(", arg1=");
        sbLIZ.append(j);
        sbLIZ.append(", arg2=");
        sbLIZ.append(j2);
        sbLIZ.append(", arg3=");
        sbLIZ.append(str);
        C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.sendEffectMsg(i, j, j2, str);
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 17 && i2 == 3 && str != null) {
            C01TT.LIZLLL(new AwS178S1100000_29(this, str, 5));
        }
    }
}
