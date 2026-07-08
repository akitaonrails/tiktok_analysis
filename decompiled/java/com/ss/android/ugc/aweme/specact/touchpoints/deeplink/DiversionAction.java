package com.ss.android.ugc.aweme.specact.touchpoints.deeplink;

import X.AbstractC1950107kR;
import X.C1906580ziK;
import X.C1950707kX;
import X.InterfaceC2210981Bg8;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.specact.touchpoints.deeplink.DiversionAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DiversionAction extends AbstractC1950107kR<Unit> {
    public static final CopyOnWriteArrayList<HashMap<String, Object>> LIZLLL = new CopyOnWriteArrayList<>();
    public static final AtomicBoolean LJ = new AtomicBoolean(false);

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId != null && strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() != 0 && !Intrinsics.LJFF(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, CardStruct.IStatusCode.DEFAULT)) {
            ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
            if (iTouchPointModuleService != null) {
                iTouchPointModuleService.reportDiversion(map);
            }
        } else {
            LIZLLL.add(new HashMap<>(map));
            if (LJ.compareAndSet(false, true)) {
                DeviceRegisterManager.addOnDeviceConfigUpdateListener(new InterfaceC2210981Bg8() { // from class: X.0CQg
                    @Override // X.InterfaceC2210981Bg8
                    public final void LIZ(boolean z) {
                    }

                    @Override // X.InterfaceC2210981Bg8
                    public final void LIZJ(boolean z) {
                    }

                    @Override // X.InterfaceC2210981Bg8
                    public final void LIZIZ(String str2, String str3) {
                        if (str2 != null && str2.length() != 0 && !Intrinsics.LJFF(str2, CardStruct.IStatusCode.DEFAULT)) {
                            DiversionAction.LJ.set(false);
                            CopyOnWriteArrayList<HashMap<String, Object>> copyOnWriteArrayList = DiversionAction.LIZLLL;
                            if (copyOnWriteArrayList.isEmpty()) {
                                return;
                            }
                            ArrayList arrayList = new ArrayList(copyOnWriteArrayList);
                            copyOnWriteArrayList.clear();
                            ITouchPointModuleService iTouchPointModuleService2 = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                            if (iTouchPointModuleService2 == null) {
                                return;
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                iTouchPointModuleService2.reportDiversion((HashMap) it2.next());
                            }
                        }
                    }
                });
            }
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("drama_incentive_diversion_home_guard_enable", true) && C1906580ziK.LIZ) {
            return new Pair<>("", new HashMap());
        }
        return new Pair<>("//main", new HashMap());
    }
}
