package com.bytedance.pumbaa.network.adapter;

import X.C0WT3;
import X.C839130Wvv;
import X.C839150Wvx;
import X.C839190Ww1;
import X.C839200Ww2;
import X.InterfaceC839390WwL;
import X.InterfaceC839820Wx2;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.runtime.host.model.NetworkAppInfo;
import com.bytedance.helios.network.runtime.host.model.NetworkEventMonitor;
import com.bytedance.helios.network.runtime.host.model.NetworkExceptionMonitor;
import com.bytedance.helios.network.runtime.host.model.NetworkHostProxy;
import com.bytedance.helios.network.runtime.host.model.NetworkInitCallback;
import com.bytedance.helios.network.runtime.host.model.NetworkStore;
import com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.bytedance.pumbaa.common.interfaces.IExceptionMonitor;
import com.bytedance.pumbaa.common.interfaces.IStore;
import com.bytedance.pumbaa.network.adapter.api.INetworkService;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS662S0100000_13;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkServiceImpl implements INetworkService {
    public Function0<SettingsModel> LIZ;

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void LJ() {
        Function0<SettingsModel> function0 = this.LIZ;
        if (function0 == null || function0.invoke() == null) {
            return;
        }
        NetworkComponent.INSTANCE.updateSettings();
    }

    @Override // com.bytedance.pumbaa.network.adapter.api.INetworkService
    public final void LIZ(C0WT3 c0wt3) {
        NetworkComponent.INSTANCE.switchEventHandler(c0wt3, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void LIZJ(C839190Ww1 c839190Ww1, C839130Wvv c839130Wvv, Function0<? extends SettingsModel> function0, InterfaceC839820Wx2 interfaceC839820Wx2) {
        AwS662S0100000_13 awS662S0100000_13;
        C839200Ww2 c839200Ww2;
        C839150Wvx c839150Wvx;
        NetworkEventMonitor networkEventMonitor;
        NetworkStore networkStore;
        NetworkExceptionMonitor networkExceptionMonitor;
        AwS557S0100000_13 awS557S0100000_13;
        C839130Wvv c839130Wvv2 = c839130Wvv;
        Function0<? extends SettingsModel> function02 = function0;
        final InterfaceC839820Wx2 interfaceC839820Wx22 = interfaceC839820Wx2;
        this.LIZ = function02;
        NetworkComponent networkComponent = NetworkComponent.INSTANCE;
        NetworkAppInfo networkAppInfo = new NetworkAppInfo(c839190Ww1.LIZ, c839190Ww1.LIZIZ, c839190Ww1.LIZJ, c839190Ww1.LIZLLL, c839190Ww1.LJ, false, c839190Ww1.LJFF, c839190Ww1.LJI, c839190Ww1.LJII, c839190Ww1.LJIIIIZZ);
        InterfaceC839390WwL interfaceC839390WwL = c839130Wvv2.LJJIJIIJI;
        Function0<String> function03 = c839130Wvv2.LIZIZ;
        Function0<String> function04 = c839130Wvv2.LIZLLL;
        Function0<String> function05 = c839130Wvv2.LJ;
        Function0<String> function06 = c839130Wvv2.LJFF;
        Map<String, Function0<Boolean>> map = c839130Wvv2.LJIIIIZZ;
        Function0<String> function07 = c839130Wvv2.LJIIIZ;
        Function0<String> function08 = c839130Wvv2.LJIIJJI;
        Function0<Set<String>> function09 = c839130Wvv2.LJIILIIL;
        Function0<Set<String>> function010 = c839130Wvv2.LJIILJJIL;
        Function1<Object, Unit> function1 = c839130Wvv2.LJIILL;
        Function1<Object, Unit> function12 = c839130Wvv2.LJIILLIIL;
        Function1<String, Map<String, String>> function13 = c839130Wvv2.LJIIZILJ;
        Function2<String, Map<String, String>, Unit> function2 = c839130Wvv2.LJIJ;
        NetworkInitCallback networkInitCallback = null;
        if (interfaceC839390WwL != null) {
            awS662S0100000_13 = new AwS662S0100000_13(interfaceC839390WwL, 1);
            c839200Ww2 = new C839200Ww2(interfaceC839390WwL);
            c839150Wvx = new C839150Wvx(interfaceC839390WwL);
        } else {
            awS662S0100000_13 = null;
            c839200Ww2 = null;
            c839150Wvx = null;
        }
        final IEventMonitor iEventMonitor = c839130Wvv2.LJJ;
        if (iEventMonitor == null) {
            networkEventMonitor = null;
        } else {
            networkEventMonitor = new NetworkEventMonitor() { // from class: X.0Wxk
                @Override // com.bytedance.helios.network.runtime.host.model.NetworkEventMonitor
                public final void monitorCommonLog(String str, JSONObject jSONObject) {
                    iEventMonitor.monitorCommonLog(str, jSONObject);
                }

                @Override // com.bytedance.helios.network.runtime.host.model.NetworkEventMonitor
                public final void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                    iEventMonitor.monitorDuration(str, jSONObject, jSONObject2);
                }

                @Override // com.bytedance.helios.network.runtime.host.model.NetworkEventMonitor
                public final void monitorStatusRate(String str, int i, JSONObject jSONObject) {
                    iEventMonitor.monitorStatusRate(str, i, jSONObject);
                }

                @Override // com.bytedance.helios.network.runtime.host.model.NetworkEventMonitor
                public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                    iEventMonitor.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
                }

                @Override // com.bytedance.helios.network.runtime.host.model.NetworkEventMonitor
                public final void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
                    iEventMonitor.monitorStatusAndDuration(str, i, jSONObject, jSONObject2);
                }

                @Override // com.bytedance.helios.network.runtime.host.model.NetworkEventMonitor
                public final void monitorStatusAndEvent(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                    iEventMonitor.monitorStatusAndEvent(str, i, jSONObject, jSONObject2, jSONObject3);
                }
            };
        }
        final IStore iStore = c839130Wvv2.LJJI;
        if (iStore == null) {
            networkStore = null;
        } else {
            networkStore = new NetworkStore() { // from class: X.0Wwk
                @Override // com.bytedance.helios.network.runtime.host.model.NetworkStore
                public final NetworkStoreRepo getRepo(String str, int i) {
                    final C1ECE c1eceLIZ = iStore.LIZ(i, str);
                    return new NetworkStoreRepo() { // from class: X.1ECF
                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final void clear() {
                            c1eceLIZ.clear();
                        }

                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final Map<String, ?> getAll() {
                            return c1eceLIZ.getAll();
                        }

                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final void remove(String str2) {
                            c1eceLIZ.remove(str2);
                        }

                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final boolean getBoolean(String str2, boolean z) {
                            return c1eceLIZ.getBoolean(str2, z);
                        }

                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final float getFloat(String str2, float f) {
                            return c1eceLIZ.getFloat(str2, f);
                        }

                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final int getInt(String str2, int i2) {
                            return c1eceLIZ.getInt(str2, i2);
                        }

                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final long getLong(String str2, long j) {
                            return c1eceLIZ.getLong(str2, j);
                        }

                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final String getString(String str2, String str3) {
                            return c1eceLIZ.getString(str2, str3);
                        }

                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final Set<String> getStringSet(String str2, Set<String> set) {
                            return c1eceLIZ.getStringSet(str2, set);
                        }

                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final void putBoolean(String str2, boolean z) {
                            c1eceLIZ.putBoolean(str2, z);
                        }

                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final void putFloat(String str2, float f) {
                            c1eceLIZ.putFloat(str2, f);
                        }

                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final void putInt(String str2, int i2) {
                            c1eceLIZ.putInt(str2, i2);
                        }

                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final void putLong(String str2, long j) {
                            c1eceLIZ.putLong(str2, j);
                        }

                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final void putString(String str2, String str3) {
                            c1eceLIZ.putString(str2, str3);
                        }

                        @Override // com.bytedance.helios.network.runtime.host.model.NetworkStoreRepo
                        public final void putStringSet(String str2, Set<String> set) {
                            c1eceLIZ.putStringSet(str2, set);
                        }
                    };
                }
            };
        }
        final IExceptionMonitor iExceptionMonitor = c839130Wvv2.LJJIFFI;
        if (iExceptionMonitor == null) {
            networkExceptionMonitor = null;
        } else {
            networkExceptionMonitor = new NetworkExceptionMonitor() { // from class: X.0W8L
                @Override // com.bytedance.helios.network.runtime.host.model.NetworkExceptionMonitor
                public final void setDebugMode(boolean z) {
                    iExceptionMonitor.setDebugMode(z);
                }

                @Override // com.bytedance.helios.network.runtime.host.model.NetworkExceptionMonitor
                public final void monitorThrowable(Throwable th, String str, Map<String, String> map2) {
                    iExceptionMonitor.monitorThrowable(th, str, map2);
                }

                @Override // com.bytedance.helios.network.runtime.host.model.NetworkExceptionMonitor
                public final void monitorNativeException(String str, String str2, String str3, String str4, Map<String, String> map2) {
                    iExceptionMonitor.monitorNativeException(str, str2, str3, str4, map2);
                }

                @Override // com.bytedance.helios.network.runtime.host.model.NetworkExceptionMonitor
                public final void monitorThrowable(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map2, Map<String, String> map3) {
                    iExceptionMonitor.monitorThrowable(str, str2, str3, str4, str5, z, map2, map3);
                }
            };
        }
        NetworkHostProxy networkHostProxy = new NetworkHostProxy(function03, function04, function05, function06, map, function07, function08, function09, function010, function1, function12, function13, function2, awS662S0100000_13, c839200Ww2, c839150Wvx, networkEventMonitor, networkStore, networkExceptionMonitor, c839130Wvv2.LJJII);
        if (function02 == null) {
            awS557S0100000_13 = null;
        } else {
            awS557S0100000_13 = new AwS557S0100000_13(function02, 156);
        }
        if (interfaceC839820Wx22 != null) {
            networkInitCallback = new NetworkInitCallback() { // from class: X.0Wwj
                @Override // com.bytedance.helios.network.runtime.host.model.NetworkInitCallback
                public final void onInitialized() {
                    interfaceC839820Wx22.onInitialized();
                }
            };
        }
        networkComponent.init(networkAppInfo, networkHostProxy, awS557S0100000_13, networkInitCallback, true);
    }
}
