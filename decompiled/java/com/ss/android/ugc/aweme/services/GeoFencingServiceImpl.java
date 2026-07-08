package com.ss.android.ugc.aweme.services;

import X.C0CHQ;
import X.C10FQ;
import X.C19216110Fr;
import X.C786410Ut5;
import X.InterfaceC1457290o1f;
import Y.AObserverS230S0100000_28;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.external.IGeofencingService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class GeoFencingServiceImpl implements IGeofencingService {
    public static final GeoFencingServiceImpl INSTANCE = new GeoFencingServiceImpl();

    @Override // com.ss.android.ugc.aweme.services.external.IGeofencingService
    public void injectGeoFencingSettingItem(Aweme aweme, FrameLayout frameLayout, LifecycleOwner lifecycleOwner) {
        List<String> geofencingRegions = aweme.getGeofencingRegions();
        if (geofencingRegions != null && !geofencingRegions.isEmpty()) {
            C786410Ut5.LJZ(0, frameLayout);
            C10FQ c10fq = (C10FQ) C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.d54, frameLayout, false);
            frameLayout.addView(c10fq);
            InterfaceC1457290o1f accountService = C0CHQ.LIZ().getAccountService();
            if (accountService.isLogin() && accountService.LJIILIIL()) {
                c10fq.LLIZ.observe(lifecycleOwner, new AObserverS230S0100000_28(c10fq, 67));
                C19216110Fr c19216110Fr = C19216110Fr.LIZ;
                AwS429S0200000_28 awS429S0200000_28 = new AwS429S0200000_28(c10fq, (C10FQ) geofencingRegions, (List<String>) 107);
                c19216110Fr.getClass();
                C19216110Fr.LIZ(awS429S0200000_28);
            }
            c10fq.setReadOnly(true);
            return;
        }
        C786410Ut5.LJZ(8, frameLayout);
    }
}
