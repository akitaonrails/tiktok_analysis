package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C09JN;
import X.C0UO0;
import X.C13BV;
import X.C2097608Jq;
import X.C480460Ism;
import X.C497740JfY;
import Y.AfS9S2000000_7;
import com.bytedance.android.livesdk.offline.LiveSettingRegion;
import com.bytedance.android.livesdkapi.host.IHostOffline;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateApi;
import com.ss.android.ugc.aweme.offline.region.model.SettingRegion;
import com.ss.android.ugc.aweme.service.IRegionMockService;
import com.ss.pusher.core.utils.GsonHolder;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHostOffline implements IHostOffline {
    @Override // com.bytedance.android.livesdkapi.host.IHostOffline
    public final List<LiveSettingRegion> getInternalAreaRegionModel() {
        IRegionMockService iRegionMockService = (IRegionMockService) ServiceManager.get().getService(IRegionMockService.class, false, false);
        if (iRegionMockService != null) {
            iRegionMockService.LIZLLL();
        }
        List<SettingRegion> list = C13BV.INSTANCE;
        if (list.isEmpty()) {
            try {
                InputStream inputStreamOpen = C497740JfY.LJII().getAssets().open("offline-mockable-regions.json");
                list = (List) GsonHolder.LIZ.LJI(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), new TypeToken<List<? extends SettingRegion>>() { // from class: X.04ZC
                }.getType());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                list = C13BV.INSTANCE;
            }
        }
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (SettingRegion settingRegion : list) {
            arrayList.add(new LiveSettingRegion(settingRegion.getCode(), settingRegion.getAsciiName(), settingRegion.getSupportTikTok()));
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostOffline
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostOffline
    public final void handleSurveyPreview(String str, String str2) {
        C480460Ism.LIZ().getClass();
        ((LiveStateApi) C480460Ism.LIZIZ(LiveStateApi.class)).getLiveCardListWithColdStart("live_tab_draw_enter", C2097608Jq.LJ()).LJIILIIL(new C0UO0()).LJJLL(new AfS9S2000000_7(this, str, str2, 1), new C09JN() { // from class: X.0JSc
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LiveHostOffline@9958.handleSurveyPreview$subscribe$2");
                C766270U4b.LJIIJJI("request fail");
                C1C7U.LIZIZ("LiveHostOffline@9958.handleSurveyPreview$subscribe$2");
            }
        });
    }
}
