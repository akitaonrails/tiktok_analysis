package com.ss.android.ugc.aweme.ecommercelive.common.container.lifecycle;

import X.C01GW;
import X.C0IIF;
import X.C13LP;
import X.C452501pT;
import X.EnumC21189117w1;
import Y.AComparatorS49S0000000_30;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.watch.ILiveRoomStatusNewListener;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.annotation.EcommerceRegion;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes31.dex */
public final class EcommerceRoomLifecycleManager implements ILiveRoomStatusNewListener {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(238));

    public EcommerceRoomLifecycleManager() {
        for (Object obj : ServiceManager.get().getServices(IEcommerceRoomNewLifecycle.class)) {
            if (!((List) this.LIZ.getValue()).contains(obj)) {
                ((List) this.LIZ.getValue()).add(obj);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.watch.ILiveRoomStatusNewListener
    public final void LIZ(Fragment fragment, Room room) {
        EnumC21189117w1 enumC21189117w1Region;
        for (IEcommerceRoomNewLifecycle iEcommerceRoomNewLifecycle : C13LP.LJLLLL(new AComparatorS49S0000000_30(6), (Iterable) this.LIZ.getValue())) {
            Annotation[] annotations = iEcommerceRoomNewLifecycle.getClass().getAnnotations();
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : annotations) {
                if (annotation instanceof EcommerceRegion) {
                    arrayList.add(annotation);
                }
            }
            EcommerceRegion ecommerceRegion = (EcommerceRegion) C13LP.LJJJLL(arrayList);
            if (ecommerceRegion != null && ecommerceRegion.region() != EnumC21189117w1.UNKNOWN) {
                IEcommerceRegionService iEcommerceRegionService = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null);
                if (iEcommerceRegionService != null) {
                    enumC21189117w1Region = iEcommerceRegionService.region();
                } else {
                    enumC21189117w1Region = null;
                }
                if (enumC21189117w1Region == ecommerceRegion.region()) {
                }
            }
            iEcommerceRoomNewLifecycle.LIZ(room);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.ILiveRoomStatusNewListener
    public final void LIZIZ(LivePlayFragment livePlayFragment, Room room, long j, String str, boolean z, String str2, C0IIF c0iif, HashMap map) {
        EnumC21189117w1 enumC21189117w1Region;
        for (IEcommerceRoomNewLifecycle iEcommerceRoomNewLifecycle : C13LP.LJLLLL(new AComparatorS49S0000000_30(11), (Iterable) this.LIZ.getValue())) {
            Annotation[] annotations = iEcommerceRoomNewLifecycle.getClass().getAnnotations();
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : annotations) {
                if (annotation instanceof EcommerceRegion) {
                    arrayList.add(annotation);
                }
            }
            EcommerceRegion ecommerceRegion = (EcommerceRegion) C13LP.LJJJLL(arrayList);
            if (ecommerceRegion != null && ecommerceRegion.region() != EnumC21189117w1.UNKNOWN) {
                IEcommerceRegionService iEcommerceRegionService = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null);
                if (iEcommerceRegionService != null) {
                    enumC21189117w1Region = iEcommerceRegionService.region();
                } else {
                    enumC21189117w1Region = null;
                }
                if (enumC21189117w1Region == ecommerceRegion.region()) {
                }
            }
            iEcommerceRoomNewLifecycle.LIZIZ(room);
        }
    }
}
