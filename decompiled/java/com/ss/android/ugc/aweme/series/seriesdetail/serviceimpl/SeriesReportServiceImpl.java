package com.ss.android.ugc.aweme.series.seriesdetail.serviceimpl;

import X.C01GW;
import X.C08JS;
import X.C1392670mLR;
import X.C1612480s3y;
import X.C1612490s3z;
import X.C1612570s47;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.EnumC1611690s2h;
import android.app.Activity;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IPaidSeriesReportService;
import com.ss.android.ugc.aweme.service.MiniDramaDetailOperator;
import com.ss.android.ugc.aweme.service.MiniDramaTouchPointService;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesReportServiceImpl implements IPaidSeriesReportService {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(329));

    @Override // com.ss.android.ugc.aweme.service.IPaidSeriesReportService
    public final void LIZ(Activity activity, Long l, String str, String str2, Boolean bool, String str3, String str4, String str5, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str6, String str7, C1612570s47 c1612570s47, String str8, DramaExtraTrackingParams dramaExtraTrackingParams) {
        String strLIZLLL;
        String strLJIJJ;
        String strLJIJJ2;
        String strLJIJJ3;
        String strLJIJJ4;
        String strLJIJJ5;
        String strLJIJJ6;
        Boolean boolIsFromSeriesDiscover;
        long jLongValue;
        String uid;
        String str9;
        Boolean boolIsAutoProcceedToInnerfeed;
        Boolean boolIsFromSeriesDiscover2;
        try {
            n nVar = new n();
            if (str2 != null) {
                nVar.LJJIIJ("unique_id", str2);
            }
            if (bool != null) {
                nVar.LJJII(Boolean.valueOf(bool.booleanValue()), "is_blocked");
            }
            strLIZLLL = C08JS.LIZLLL(nVar);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLIZLLL = "";
        }
        ComplianceServiceProvider.LJJ().LIZIZ(activity, new Uri.Builder().appendQueryParameter("report_type", "paid_video_collection").appendQueryParameter("object_id", String.valueOf(l)).appendQueryParameter("owner_id", str).appendQueryParameter("enter_from", str3).appendQueryParameter("extra", strLIZLLL));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", str);
        c2344009Gk.LJIIIIZZ("object_id", String.valueOf(l));
        c2344009Gk.LJIIIIZZ("object_type", "paid_video_collection");
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LIZJ(1, "is_collection_item");
        c2344009Gk.LJIIIIZZ("current_page", str5);
        c2344009Gk.LJ(num, "series_category");
        Boolean boolIsAutoProcceedToInnerfeed2 = null;
        if (bool2 != null) {
            C1612490s3z c1612490s3z = C1612490s3z.LJI;
            boolean zBooleanValue = bool2.booleanValue();
            c1612490s3z.getClass();
            strLJIJJ = C1612480s3y.LJIJJ(zBooleanValue);
        } else {
            strLJIJJ = null;
        }
        c2344009Gk.LJIIIIZZ("is_from_anchor", strLJIJJ);
        if (bool3 != null) {
            C1612490s3z c1612490s3z2 = C1612490s3z.LJI;
            boolean zBooleanValue2 = bool3.booleanValue();
            c1612490s3z2.getClass();
            strLJIJJ2 = C1612480s3y.LJIJJ(zBooleanValue2);
        } else {
            strLJIJJ2 = null;
        }
        c2344009Gk.LJIIIIZZ("is_from_bottom_banner", strLJIJJ2);
        if (bool5 != null) {
            C1612490s3z c1612490s3z3 = C1612490s3z.LJI;
            boolean zBooleanValue3 = bool5.booleanValue();
            c1612490s3z3.getClass();
            strLJIJJ3 = C1612480s3y.LJIJJ(zBooleanValue3);
        } else {
            strLJIJJ3 = null;
        }
        c2344009Gk.LJIIIIZZ("is_from_hot_zone", strLJIJJ3);
        if (dramaExtraTrackingParams != null && (boolIsFromSeriesDiscover2 = dramaExtraTrackingParams.isFromSeriesDiscover()) != null) {
            C1612490s3z c1612490s3z4 = C1612490s3z.LJI;
            boolean zBooleanValue4 = boolIsFromSeriesDiscover2.booleanValue();
            c1612490s3z4.getClass();
            strLJIJJ4 = C1612480s3y.LJIJJ(zBooleanValue4);
        } else {
            strLJIJJ4 = null;
        }
        c2344009Gk.LJIIIIZZ("is_from_series_discover", strLJIJJ4);
        if (dramaExtraTrackingParams != null && (boolIsAutoProcceedToInnerfeed = dramaExtraTrackingParams.isAutoProcceedToInnerfeed()) != null) {
            C1612490s3z c1612490s3z5 = C1612490s3z.LJI;
            boolean zBooleanValue5 = boolIsAutoProcceedToInnerfeed.booleanValue();
            c1612490s3z5.getClass();
            strLJIJJ5 = C1612480s3y.LJIJJ(zBooleanValue5);
        } else {
            strLJIJJ5 = null;
        }
        c2344009Gk.LJIIIIZZ("is_auto_procceed_to_innerfeed", strLJIJJ5);
        c2344009Gk.LJIIIIZZ("source_card", str6);
        C1612490s3z c1612490s3z6 = C1612490s3z.LJI;
        boolean zLIZ = ((MiniDramaTouchPointService) this.LIZ.getValue()).LIZ(EnumC1611690s2h.DETAIL);
        c1612490s3z6.getClass();
        c2344009Gk.LJIIIIZZ("is_coin_timer_show", C1612480s3y.LJIJJ(zLIZ));
        if (bool4 != null) {
            strLJIJJ6 = C1612480s3y.LJIJJ(bool4.booleanValue());
        } else {
            strLJIJJ6 = null;
        }
        c2344009Gk.LJIIIIZZ("is_from_drama_component", strLJIJJ6);
        MiniDramaDetailOperator.LIZ.getClass();
        MiniDramaDetailOperator miniDramaDetailOperatorLIZ = C1392670mLR.LIZ();
        if (miniDramaDetailOperatorLIZ != null) {
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            CollectionDetailModel collectionDetailModelXm = miniDramaDetailOperatorLIZ.Xm(jLongValue);
            if (collectionDetailModelXm != null) {
                c2344009Gk.LJ(l, "collection_id");
                User user = collectionDetailModelXm.collectionCreator;
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                c2344009Gk.LJFF("collection_user_id", uid);
                if (str7 == null) {
                    if (collectionDetailModelXm.isLimitedFree()) {
                        str9 = "limited_free_series";
                    } else {
                        str9 = "paid_series";
                    }
                } else {
                    str9 = str7;
                }
                c2344009Gk.LJFF("series_state", str9);
            }
        }
        if (c1612570s47 != null) {
            c2344009Gk.LJFF("source_video_id", c1612570s47.sourceVideoId);
            c2344009Gk.LJFF("source_group_id", c1612570s47.sourceGroupId);
            c2344009Gk.LJFF("source_author_id", c1612570s47.sourceAuthorId);
            c2344009Gk.LJFF("source_video_type", c1612570s47.sourceVideoType);
            c2344009Gk.LJFF("series_feed_type", c1612570s47.sourceFeedType);
        }
        if (str8 != null) {
            c2344009Gk.LJFF("group_id", str8);
        }
        C20684815ws.LJIILLIIL("collection_request_report", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("author_id", str);
        c2344009Gk2.LJIIIIZZ("enter_from", str3);
        c2344009Gk2.LJIIIIZZ("group_id", String.valueOf(l));
        c2344009Gk2.LJIIIIZZ("panel_source", str4);
        c2344009Gk2.LJIIIIZZ("enter_method", str4);
        c2344009Gk2.LIZJ(1, "is_collection_item");
        c2344009Gk2.LJIIIIZZ("current_page", str5);
        c2344009Gk2.LJ(num, "series_category");
        c2344009Gk2.LJ(bool2, "is_from_anchor");
        c2344009Gk2.LJ(bool3, "is_from_bottom_banner");
        c2344009Gk2.LJ(bool5, "is_from_hot_zone");
        if (dramaExtraTrackingParams != null) {
            boolIsFromSeriesDiscover = dramaExtraTrackingParams.isFromSeriesDiscover();
        } else {
            boolIsFromSeriesDiscover = null;
        }
        c2344009Gk2.LJ(boolIsFromSeriesDiscover, "is_from_series_discover");
        if (dramaExtraTrackingParams != null) {
            boolIsAutoProcceedToInnerfeed2 = dramaExtraTrackingParams.isAutoProcceedToInnerfeed();
        }
        c2344009Gk2.LJ(boolIsAutoProcceedToInnerfeed2, "is_auto_procceed_to_innerfeed");
        c2344009Gk2.LJIIIIZZ("source_card", str6);
        c2344009Gk2.LJIIIIZZ("series_state", str7);
        C20684815ws.LJIILLIIL("report", c2344009Gk2.LIZ);
    }
}
