package com.ss.android.ugc.aweme.series.innerfeed.recommend;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1227904rF;
import X.C1349505Px;
import X.C13BV;
import X.C1479130oat;
import X.C1576980r8i;
import X.C1578400rB0;
import X.C1578530rBD;
import X.C1605000rru;
import X.C1DC5;
import X.C1DCC;
import X.C1DCI;
import X.C2095008Iq;
import X.C2179771ASp;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C298310Bmf;
import X.C584850Mwl;
import X.C718180SFc;
import X.C844470XAv;
import Y.AkS485S0100000_24;
import android.content.Context;
import android.util.Base64;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedApi;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaFeedRecommendServiceImpl implements DramaFeedRecommendService {
    public final C1576980r8i LIZIZ = new C1576980r8i("SeriesFeedRepository");

    @Override // com.ss.android.ugc.aweme.series.innerfeed.recommend.DramaFeedRecommendService
    public final String LIZ() {
        Integer numValueOf;
        C1DC5.LIZ.getClass();
        C1DCI c1dciLIZJ = C1DCC.LIZJ();
        HashMap map = new HashMap();
        map.put("battery_pct", c1dciLIZJ.battery_pct);
        map.put("battery_temperature", c1dciLIZJ.battery_temperature);
        map.put("screen_auto_mode", c1dciLIZJ.brightness.screen_auto_mode);
        map.put("screen_brightness", c1dciLIZJ.brightness.screen_brightness);
        map.put("cpu_usage", c1dciLIZJ.cpu_usage);
        map.put("dark_mode", c1dciLIZJ.dark_mode);
        map.put("data_save_mode", c1dciLIZJ.data_save_mode);
        map.put("font_scale", c1dciLIZJ.font_scale);
        map.put("is_charge", c1dciLIZJ.is_charge);
        map.put("low_power_mode", c1dciLIZJ.low_power_mode);
        map.put("mem_avail", c1dciLIZJ.mem_avail);
        map.put("net_connect_type", c1dciLIZJ.net_connect_type);
        MLDataCenterService.Companion.getClass();
        JSONObject flashFeedFeatures = C1349505Px.LIZ.getFlashFeedFeatures("pitaya_info");
        if (flashFeedFeatures != null) {
            map.put("pitaya_info", flashFeedFeatures);
        }
        map.put("stream_music_volume", c1dciLIZJ.stream_music_volume);
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        SettingsManager.LIZLLL().getClass();
        map.put("sound_output_device", Integer.valueOf((!SettingsManager.LIZ("enable_report_sound_output_device", false) || (numValueOf = Integer.valueOf(C2179771ASp.LJI(contextLIZ))) == null) ? -1 : numValueOf.intValue()));
        map.put("volume", Double.valueOf(C2179771ASp.LJIIIIZZ()));
        map.put("sp", Integer.valueOf(C1479130oat.LJII()));
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(map);
        if (strLJI == null) {
            strLJI = "";
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generateDramaRecommendParams: ");
        sbLIZ.append(strLJI);
        C2188811AlT.LIZIZ(sbLIZ);
        return Base64.encodeToString(strLJI.getBytes(Charsets.UTF_8), 0);
    }

    @Override // com.ss.android.ugc.aweme.series.innerfeed.recommend.DramaFeedRecommendService
    public final boolean LIZIZ() {
        Long lLJIILIIL;
        C1576980r8i c1576980r8i = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("store_key_first_enter_time_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String strLIZ = C1576980r8i.LIZ(c1576980r8i, C2188811AlT.LIZIZ(sbLIZ));
        return (strLIZ == null || (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZ)) == null || lLJIILIIL.longValue() == -1) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.series.innerfeed.recommend.DramaFeedRecommendService
    public final long LIZJ(boolean z) {
        long jLongValue;
        Long lLJIILIIL;
        INetwork iNetwork;
        if (!LIZIZ()) {
            if (!C298310Bmf.LIZ() && (iNetwork = (INetwork) PluggableExtentionKt.pluggableSpi$default(INetwork.class, false, false, false, 14, null)) != null) {
                jLongValue = iNetwork.LIZIZ();
            } else {
                jLongValue = System.currentTimeMillis();
            }
            if (!z) {
                C1576980r8i c1576980r8i = this.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("store_key_first_enter_time_");
                sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                c1576980r8i.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(jLongValue));
            }
        } else {
            C1576980r8i c1576980r8i2 = this.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("store_key_first_enter_time_");
            sbLIZ2.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            String strLIZ = C1576980r8i.LIZ(c1576980r8i2, C2188811AlT.LIZIZ(sbLIZ2));
            if (strLIZ != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZ)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = -1;
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss SSS", Locale.getDefault());
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("requireFirstEnterTime: ");
        sbLIZ3.append(simpleDateFormat.format(new Date(jLongValue)));
        C2188811AlT.LIZIZ(sbLIZ3);
        return jLongValue;
    }

    @Override // com.ss.android.ugc.aweme.series.innerfeed.recommend.DramaFeedRecommendService
    public final SeriesFeedResp LIZLLL(String str, String str2, String str3) throws ExecutionException, InterruptedException {
        String str4;
        C1578530rBD c1578530rBD;
        List<Aweme> items;
        PaidContentInfo paidContentInfo;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        ComposePbAndJson<C1578400rB0, FeedItemList> composePbAndJson = SeriesFeedApi.LIZIZ.fetchSeriesFeedList(12, true, LIZJ(true), LIZ(), 0, "", str2, 0, str3, "", "", false, Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE), str, true, 0, false).get();
        String str5 = C1605000rru.LIZ;
        ArrayList arrayList = null;
        arrayList = null;
        FeedItemList feedItemListLIZJ = composePbAndJson.LIZJ(new AkS485S0100000_24(null, 0));
        boolean z = false;
        if (feedItemListLIZJ != null && (items = feedItemListLIZJ.getItems()) != null) {
            ArrayList<Aweme> arrayList2 = new ArrayList();
            for (Aweme aweme : items) {
                Aweme aweme2 = aweme;
                if (aweme2 != null && (paidContentInfo = aweme2.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null && Intrinsics.LJFF(paidContentMiniDramaInfoLIZ.isInnerFeedRecommendVideo(), Boolean.TRUE)) {
                    arrayList2.add(aweme);
                }
            }
            arrayList = new ArrayList();
            for (Aweme aweme3 : arrayList2) {
                AwemeExtKt.appendMobParam(aweme3, "enter_from", "paid_series_detail_page");
                PaidContentInfo paidContentInfo2 = aweme3.mPaidContentInfo;
                if (paidContentInfo2 != null) {
                    paidContentInfo2.setInnerFeedRecommend(Boolean.TRUE);
                }
                aweme3.setRequestId(feedItemListLIZJ.getRequestId());
                arrayList.add(aweme3);
            }
        }
        C1578400rB0 c1578400rB0 = (C1578400rB0) composePbAndJson.LLILLJJLI;
        if (c1578400rB0 == null || (c1578530rBD = c1578400rB0.log_pb) == null || (str4 = c1578530rBD.impr_id) == null) {
            str4 = "";
        }
        LogPbBean logPbBean = new LogPbBean(str4);
        C584850Mwl.LIZ.LJI(feedItemListLIZJ.getRequestId(), logPbBean);
        List list = arrayList;
        if (arrayList == null) {
            list = C13BV.INSTANCE;
        }
        if (feedItemListLIZJ.hasMore == 1) {
            z = true;
        }
        return new SeriesFeedResp(list, Boolean.valueOf(z), null, Boolean.FALSE, null, logPbBean, null, "", null, null, null, null, null, 0);
    }
}
