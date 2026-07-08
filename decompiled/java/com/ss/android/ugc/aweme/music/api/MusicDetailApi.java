package com.ss.android.ugc.aweme.music.api;

import X.C0C64;
import X.C297030Bkb;
import X.C305420By8;
import X.C786410Ut5;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501290pAd;
import X.InterfaceC1501320pAg;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.api.ITemplateService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDetailApi {
    public static final DetailApi LIZ = (DetailApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(Api.LIZ).create(DetailApi.class);

    public interface DetailApi {
        @InterfaceC1501160pAQ("/aweme/v1/music/detail/")
        ListenableFuture<MusicDetail> queryMusic(@InterfaceC1501070pAH("music_id") String str, @InterfaceC1501070pAH("click_reason") int i);

        @InterfaceC1501160pAQ("/aweme/v1/music/detail/")
        ListenableFuture<MusicDetail> queryMusic(@InterfaceC1501070pAH("music_id") String str, @InterfaceC1501070pAH("click_reason") int i, @InterfaceC1501070pAH("music_compliance_account") int i2, @InterfaceC1501130pAN Map<String, String> map);

        @InterfaceC1501290pAd(4)
        @InterfaceC1501160pAQ("/aweme/v1/music/detail/")
        @InterfaceC1501320pAg(3)
        ListenableFuture<MusicDetail> queryMusicWithHighPriority(@InterfaceC1501070pAH("music_id") String str, @InterfaceC1501070pAH("click_reason") int i);

        @InterfaceC1501290pAd(4)
        @InterfaceC1501160pAQ("/aweme/v1/music/detail/")
        @InterfaceC1501320pAg(3)
        ListenableFuture<MusicDetail> queryMusicWithHighPriority(@InterfaceC1501070pAH("music_id") String str, @InterfaceC1501070pAH("click_reason") int i, @InterfaceC1501070pAH("music_compliance_account") int i2, @InterfaceC1501130pAN Map<String, String> map);

        @InterfaceC1501160pAQ("/aweme/v1/music/partner/detail/")
        ListenableFuture<MusicDetail> queryPartnerMusic(@InterfaceC1501070pAH("partner_music_id") String str, @InterfaceC1501070pAH("partner_name") String str2);
    }

    public static void LIZ(Map<String, String> map) {
        String strLIZLLL;
        try {
            JSONObject jSONObject = new JSONObject();
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "mdp_support_christmas_style", true, false)) {
                jSONObject.put("christmas_music_scene", 1);
            }
            if (jSONObject.length() > 0) {
                ((TreeMap) map).put("experiment_params", C786410Ut5.J3(jSONObject));
            }
            if (((Number) C297030Bkb.LIZ.getValue()).intValue() == 1) {
                ITemplateService iTemplateService = (ITemplateService) PluggableExtentionKt.pluggableSpi(ITemplateService.class);
                if (iTemplateService == null) {
                    strLIZLLL = "";
                } else {
                    strLIZLLL = iTemplateService.LIZLLL();
                }
                ((TreeMap) map).put("tmpl_feature_info", strLIZLLL);
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static MusicDetail LIZIZ(int i, int i2, String str, Map map) throws ExecutionException, InterruptedException {
        boolean zLJI = MethodIDManager.LJI(202189);
        if (C305420By8.LIZ) {
            DetailApi detailApi = LIZ;
            if (str != null) {
                str = str.trim();
            }
            MusicDetail musicDetail = detailApi.queryMusicWithHighPriority(str, i, i2, map).get();
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return musicDetail;
        }
        DetailApi detailApi2 = LIZ;
        if (str != null) {
            str = str.trim();
        }
        MusicDetail musicDetail2 = detailApi2.queryMusic(str, i, i2, map).get();
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return musicDetail2;
    }
}
