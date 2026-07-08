package com.ss.android.ugc.aweme.feed.api;

import X.C0CLW;
import X.C0CQT;
import X.C1387290mCl;
import X.C312690CNn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.IPreVideoPlayTimeUtil;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemeStatsApi {
    public static final AwemeStatsService LIZ = (AwemeStatsService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C0CQT.LIZJ).create(AwemeStatsService.class);

    /* JADX INFO: loaded from: classes14.dex */
    public interface AwemeStatsService {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/aweme/v1/fast/stats/")
        ListenableFuture<BaseResponse> awemeFastStatsReport(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("tab_type") int i, @InterfaceC1501050pAF("aweme_type") int i2, @InterfaceC1501050pAF("origin_item_id") String str2);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/aweme/v1/aweme/stats/")
        ListenableFuture<BaseResponse> awemeStatsReport(@InterfaceC1501150pAP Map<String, String> map);
    }

    public static void LIZ(C1387290mCl c1387290mCl) {
        boolean zLJI = MethodIDManager.LJI(202137);
        if (C312690CNn.LIZIZ(C312690CNn.LIZ)) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        c1387290mCl.getClass();
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(c1387290mCl.LIZ)) {
            map.put("item_id", c1387290mCl.LIZ);
        }
        int i = c1387290mCl.LIZIZ;
        if (i > 0) {
            map.put("share_delta", String.valueOf(i));
        }
        int i2 = c1387290mCl.LIZJ;
        if (i2 > 0) {
            map.put("play_delta", String.valueOf(i2));
        }
        int i3 = c1387290mCl.LIZLLL;
        if (i3 > 0) {
            map.put("download_delta", String.valueOf(i3));
        }
        int i4 = c1387290mCl.LJ;
        if (i4 > -1) {
            map.put("aweme_type", String.valueOf(i4));
        }
        int i5 = c1387290mCl.LJFF;
        if (i5 > -1) {
            map.put("tab_type", String.valueOf(i5));
        }
        int i6 = c1387290mCl.LJI;
        if (i6 > 0) {
            map.put("item_type", String.valueOf(i6));
        }
        String str = c1387290mCl.LJII;
        if (str != null) {
            map.put("stats_channel", str);
        }
        int i7 = c1387290mCl.LJIIIIZZ;
        if (i7 > -1) {
            map.put("follow_status", String.valueOf(i7));
        }
        int i8 = c1387290mCl.LJIIIZ;
        if (i8 > -1) {
            map.put("follower_status", String.valueOf(i8));
        }
        if (!TextUtils.isEmpty(c1387290mCl.LJIIJ)) {
            map.put("origin_item_id", c1387290mCl.LJIIJ);
        }
        if (!TextUtils.isEmpty(c1387290mCl.LJIIJJI)) {
            map.put("origin_author_id", c1387290mCl.LJIIJJI);
        }
        int i9 = c1387290mCl.LJIIL;
        if (i9 > -1) {
            map.put("origin_follow_status", String.valueOf(i9));
        }
        int i10 = c1387290mCl.LJIILIIL;
        if (i10 > -1) {
            map.put("impr_order", String.valueOf(i10));
        }
        int i11 = c1387290mCl.LJIILJJIL;
        if (i11 > -1) {
            map.put("last_impr_order", String.valueOf(i11));
        }
        String str2 = c1387290mCl.LJIILL;
        if (str2 != null) {
            map.put("order", str2);
        }
        String str3 = c1387290mCl.LJIILLIIL;
        if (str3 != null) {
            map.put("request_id", str3);
        }
        long j = c1387290mCl.LJIIZILJ;
        if (j > -1) {
            map.put("session_id", String.valueOf(j));
        }
        int i12 = c1387290mCl.LJIJ;
        if (i12 > -1) {
            map.put("origin_follower_status", String.valueOf(i12));
        }
        map.put("sync_origin", String.valueOf(c1387290mCl.LJIJI));
        map.put("pre_item_id", c1387290mCl.LJIJJ);
        map.put("pre_item_playtime", c1387290mCl.LJIJJLI);
        String str4 = c1387290mCl.LJIL;
        str4.toString();
        map.put("pre_item_watch_time", str4);
        map.put("pre_hot_sentence", c1387290mCl.LJJ);
        if (!TextUtils.isEmpty(c1387290mCl.LJJI)) {
            map.put("creative_id", c1387290mCl.LJJI);
        }
        if (!TextUtils.isEmpty(c1387290mCl.LJJII)) {
            map.put("ad_id", c1387290mCl.LJJII);
        }
        if (!TextUtils.isEmpty(c1387290mCl.LJJIFFI)) {
            map.put("log_extra", c1387290mCl.LJJIFFI);
        }
        if (!TextUtils.isEmpty(c1387290mCl.LJJIII)) {
            map.put("user_agent", c1387290mCl.LJJIII);
        }
        if (!TextUtils.isEmpty(c1387290mCl.LJJIIJ)) {
            map.put("access", c1387290mCl.LJJIIJ);
        }
        if (!TextUtils.isEmpty(c1387290mCl.LJJIIZ)) {
            map.put("google_aid", c1387290mCl.LJJIIZ);
        }
        if (!TextUtils.isEmpty(c1387290mCl.LJJIIJZLJL)) {
            map.put("package", c1387290mCl.LJJIIJZLJL);
        }
        if (!TextUtils.isEmpty(c1387290mCl.LJJIIZI)) {
            map.put("previous_page", c1387290mCl.LJJIIZI);
        }
        if (!TextUtils.isEmpty(c1387290mCl.LJJIJ)) {
            map.put("enter_from", c1387290mCl.LJJIJ);
        }
        if (!TextUtils.isEmpty(c1387290mCl.LJJIJIIJI)) {
            map.put("duration", c1387290mCl.LJJIJIIJI);
        }
        if (!TextUtils.isEmpty(c1387290mCl.LJJIJIIJIL)) {
            map.put("play_order", c1387290mCl.LJJIJIIJIL);
        }
        int i13 = c1387290mCl.LJJIJIL;
        boolean z = true;
        if (i13 == 1) {
            map.put("is_ba", String.valueOf(i13));
        }
        if (!TextUtils.isEmpty(c1387290mCl.LJJIJL)) {
            map.put("item_distribute_source", c1387290mCl.LJJIJL);
        }
        map.put("is_ad", String.valueOf(c1387290mCl.LJJIJLIJ));
        int i14 = c1387290mCl.LJJIL;
        if (i14 > 0) {
            map.put("item_source_category", String.valueOf(i14));
        }
        IAlgoRefreshService iAlgoRefreshService = (IAlgoRefreshService) PluggableExtentionKt.pluggableSpi$default(IAlgoRefreshService.class, false, false, false, 14, null);
        if (iAlgoRefreshService == null || !iAlgoRefreshService.LJ()) {
            z = false;
        }
        map.put("user_algo_refresh_status", String.valueOf(z));
        int i15 = c1387290mCl.LJJIZ;
        if (i15 > -1) {
            map.put("story_consumption_type", String.valueOf(i15));
        }
        int i16 = c1387290mCl.LJJJ;
        if (i16 > 0) {
            map.put("user_story_version", String.valueOf(i16));
        }
        map.put("first_install_time", C0CLW.LIZIZ.LIZ.getFirstInstallTime().toString());
        map.put("action_time", String.valueOf(System.currentTimeMillis() / 1000));
        IPreVideoPlayTimeUtil iPreVideoPlayTimeUtil = (IPreVideoPlayTimeUtil) PluggableExtentionKt.pluggableSpi(IPreVideoPlayTimeUtil.class);
        if (iPreVideoPlayTimeUtil != null) {
            map.putAll(iPreVideoPlayTimeUtil.LIZIZ());
        }
        LIZ.awemeStatsReport(map).get();
        IPreVideoPlayTimeUtil iPreVideoPlayTimeUtil2 = (IPreVideoPlayTimeUtil) PluggableExtentionKt.pluggableSpi(IPreVideoPlayTimeUtil.class);
        if (iPreVideoPlayTimeUtil2 != null) {
            iPreVideoPlayTimeUtil2.LIZ((String) map.get("pre_item_id"));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
