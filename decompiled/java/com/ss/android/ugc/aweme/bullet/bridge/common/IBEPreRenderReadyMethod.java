package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C0J3A;
import X.C1051660dTQ;
import X.C1057930ddX;
import X.C1062850dlT;
import X.C1062900dlY;
import X.C1063030dll;
import X.C1063100dls;
import X.C1954807lC;
import X.C19719612Di;
import X.C1AF0;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1062840dlS;
import X.InterfaceC1019840ce6;
import X.InterfaceC1051470dT7;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS106S0100000_6;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class IBEPreRenderReadyMethod extends BaseBridgeMethod {
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final void ensureNotReachHere() {
        C1AF0.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public IBEPreRenderReadyMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "IBEPreRenderReady";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        ViewParent parent;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        String str;
        Object next;
        View view;
        InterfaceC1051470dT7 interfaceC1051470dT7LIZ = this.contextProviderFactory.LIZ(LynxView.class);
        if (interfaceC1051470dT7LIZ != null && (view = (View) interfaceC1051470dT7LIZ.LIZ()) != null) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        if ((parent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) parent) != null) {
            C1062900dlY c1062900dlY = C1063100dls.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IBEPrerenderReady success: id = ");
            SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
            if (sparkContext != null) {
                str = sparkContext.containerId;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            ConcurrentHashMap<String, List<C1062850dlT>> concurrentHashMap = C1063100dls.LIZ.LIZ;
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, List<C1062850dlT>>> it2 = concurrentHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getValue(), arrayList);
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(((C1062850dlT) next).LIZ, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1062850dlT c1062850dlT = (C1062850dlT) next;
            if (c1062850dlT != null) {
                synchronized (c1062850dlT) {
                    try {
                        int iOrdinal = c1062850dlT.LJFF.ordinal();
                        if (iOrdinal != 0 && iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    throw new C1954807lC();
                                }
                                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS106S0100000_6((Object) sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 133));
                            } else {
                                C1AF0.LIZIZ();
                            }
                        } else {
                            C1057930ddX c1057930ddX = c1062850dlT.LIZIZ;
                            C1063030dll.LIZ.getClass();
                            c1057930ddX.log(C1063030dll.LJFF, new AwS595S0100000_16(c1062850dlT, 177));
                            if (c1062850dlT.LJFF == EnumC1062840dlS.LL) {
                                C0J3A.LIZ("Spark loadFinish is not called");
                            }
                        }
                        c1062850dlT.LJFF = EnumC1062840dlS.LLILLL;
                        Function1<? super SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Unit> function1 = c1062850dlT.LIZJ;
                        if (function1 != null) {
                            function1.invoke(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                        }
                        c1062850dlT.LIZJ = null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        C1AF0.LIZIZ();
    }
}
