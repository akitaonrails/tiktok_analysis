package com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl;

import X.C04TD;
import X.C0WZX;
import X.C1025720cna;
import X.C1026310coX;
import X.C1035880d3y;
import X.C1035970d47;
import X.C1037200d66;
import X.C1041990dDp;
import X.C1537480q70;
import X.C1541950qED;
import X.C1701330uNH;
import X.C2204961BRm;
import X.C299720Bow;
import X.C470701sP;
import X.C905703gN;
import X.EnumC1036160d4Q;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebJumpInterceptor;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.settings.AdLandPageMemLeakOptimizationModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebJumpInterceptor implements IAdWebJumpInterceptor {
    public static IAdWebJumpInterceptor LIZJ() {
        Object objLIZ = C04TD.LIZ(IAdWebJumpInterceptor.class, false);
        if (objLIZ != null) {
            return (IAdWebJumpInterceptor) objLIZ;
        }
        if (C04TD.LLLIIII == null) {
            synchronized (IAdWebJumpInterceptor.class) {
                if (C04TD.LLLIIII == null) {
                    C04TD.LLLIIII = new AdWebJumpInterceptor();
                }
            }
        }
        return C04TD.LLLIIII;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebJumpInterceptor
    public final void LIZIZ(Context context, SparkContext sparkContext, boolean z) {
        String requestId;
        String awemeId;
        UrlModel authorAvatar;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        if (C299720Bow.LIZ()) {
            C1035880d3y c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
            AwemeRawAd awemeRawAd = null;
            AdlpExtraModel adlpExtraModel = new AdlpExtraModel(null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null);
            if (c1035880d3y != null) {
                requestId = c1035880d3y.getRequestId();
            } else {
                requestId = null;
            }
            adlpExtraModel.setRequestId(requestId);
            if (c1035880d3y != null) {
                awemeId = c1035880d3y.getAwemeId();
            } else {
                awemeId = null;
            }
            adlpExtraModel.setAid(awemeId);
            if (c1035880d3y != null) {
                authorAvatar = c1035880d3y.getAuthorAvatar();
            } else {
                authorAvatar = null;
            }
            adlpExtraModel.setAuthorAvatar(authorAvatar);
            try {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(sparkContext.LJIJI()), "url");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (c1035880d3y != null) {
                awemeRawAd = c1035880d3y.getAwemeRawAd();
            }
            C1026310coX c1026310coX = new C1026310coX(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, awemeRawAd, adlpExtraModel, true, new C1025720cna(-1.0f, null, null, -1, Boolean.FALSE, -1, -1, Boolean.FALSE), null);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//commercialize/ad_landing_page/fullscreen");
            smartRouteBuildRoute.withParam("keyAdWebModel", c1026310coX);
            smartRouteBuildRoute.withParam("keyFromScene", EnumC1036160d4Q.FROM_CUSTOM);
            smartRouteBuildRoute.open();
            return;
        }
        C1035880d3y c1035880d3y2 = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
        if (c1035880d3y2 != null) {
            c1035880d3y2.setJump(z);
            if (!((AdLandPageMemLeakOptimizationModel) C1035970d47.LIZIZ.getValue()).enableFixContainerId) {
                String containerId = c1035880d3y2.getContainerId();
                if (containerId != null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = containerId;
                }
                sparkContext.containerId = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            } else {
                c1035880d3y2.setContainerId(sparkContext.containerId);
            }
        }
        C1541950qED.LIZJ.LJIIL();
        Intent intent = new Intent(context, (Class<?>) AdWebSparkActivity.class);
        C905703gN.LIZ.getClass();
        C1041990dDp.LIZ.getClass();
        C1041990dDp.LIZJ(sparkContext);
        intent.putExtra("SparkContextContainerId", sparkContext.containerId);
        intent.setFlags(268435456);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMsHj6gj6EX8wzTRorkO+n0dLGoX2tM20X8Tl16TWLBPsr+9at0cAeB7j+Q1zmlYAYSQ==", null));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebJumpInterceptor
    public final boolean LIZ(Context context, C1537480q70 c1537480q70, SparkContext sparkContext, String str, String str2) {
        String strVv;
        C1035880d3y c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
        IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
        if (iAdWebUtils == null || (strVv = iAdWebUtils.vv(c1035880d3y, str2)) == null) {
            strVv = str2;
        }
        String strLIZ = C1037200d66.LIZ(strVv, c1035880d3y, "iab", false, true);
        if (!TextUtils.equals(strLIZ, str2)) {
            Uri.Builder builderBuildUpon = C470701sP.LIZ(UriProtector.parse(str), "url").buildUpon();
            builderBuildUpon.appendQueryParameter("url", strLIZ);
            sparkContext.LJJIIZ(builderBuildUpon.build().toString());
        }
        if (strLIZ == null) {
            strLIZ = "";
        }
        sparkContext.LJJJZ("is_ad_jump_url", strLIZ);
        if (c1537480q70.LJFF(C1035880d3y.class) == null) {
            return false;
        }
        LIZIZ(context, sparkContext, true);
        return true;
    }
}
