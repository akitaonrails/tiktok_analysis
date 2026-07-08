package com.ss.android.ugc.aweme.compliance.privacy.impl;

import X.C01GW;
import X.C1009740cNo;
import X.C10A1;
import X.C10AA;
import X.C11S5;
import X.C1701940uOG;
import X.C1888930zFr;
import X.C191871104n;
import X.C2097908Jt;
import X.C452501pT;
import X.C591970NJr;
import X.C737050Svf;
import X.InterfaceC192013109z;
import X.InterfaceC626120Oh8;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.CommercialVideoInfo;
import com.ss.android.ugc.aweme.commerce.model.MissionInfo;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.ILongPressVideoPrivacyService;
import com.ss.android.ugc.aweme.compliance.privacy.impl.LongPressVideoPrivacyServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.aweme.services.now.ICreativeNowService;
import com.ss.android.ugc.tiktok.tpsc.privacy.video.model.VideoPrivateUrlModel;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes29.dex */
public final class LongPressVideoPrivacyServiceImpl implements ILongPressVideoPrivacyService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(213));

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.ILongPressVideoPrivacyService
    public final boolean LIZIZ(int i, Aweme aweme) {
        MissionInfo missionInfo;
        CommercialVideoInfo commercialVideoInfoLJ;
        AwemeCommerceStruct commerceVideoAuthInfo;
        MissionInfo missionInfo2;
        if (C10AA.LIZJ(aweme) || aweme.isSubOnlyVideo()) {
            return false;
        }
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            if (C10AA.LIZIZ(aweme)) {
                AwemeCommerceStruct commerceVideoAuthInfo2 = aweme.getCommerceVideoAuthInfo();
                if ((commerceVideoAuthInfo2 == null || !commerceVideoAuthInfo2.isPreventMissionDuetPrivate()) && (((commercialVideoInfoLJ = C1009740cNo.LJ(aweme)) == null || (missionInfo2 = commercialVideoInfoLJ.getMissionInfo()) == null || !missionInfo2.m173isMissionAd()) && (((commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || !commerceVideoAuthInfo.isPreventSelfSee()) && !AwemeExtKt.isTop(aweme)))) {
                    return true;
                }
            } else if (!C591970NJr.LIZIZ().LIZIZ(aweme)) {
                AwemeCommerceStruct commerceVideoAuthInfo3 = aweme.getCommerceVideoAuthInfo();
                if ((commerceVideoAuthInfo3 != null && commerceVideoAuthInfo3.isPreventMissionDuetPrivate()) || (aweme.isSubOnlyVideo() && aweme.isNrNff())) {
                    return false;
                }
                CommercialVideoInfo commercialVideoInfoLJ2 = C1009740cNo.LJ(aweme);
                if (commercialVideoInfoLJ2 != null && (missionInfo = commercialVideoInfoLJ2.getMissionInfo()) != null && missionInfo.m173isMissionAd()) {
                    return false;
                }
                AwemeCommerceStruct commerceVideoAuthInfo4 = aweme.getCommerceVideoAuthInfo();
                if ((commerceVideoAuthInfo4 == null || !commerceVideoAuthInfo4.isPreventSelfSee()) && !AwemeExtKt.isTop(aweme)) {
                    return true;
                }
            } else {
                return true;
            }
            return false;
        }
        if (!C10AA.LIZIZ(aweme)) {
            if (C591970NJr.LIZIZ().LIZIZ(aweme)) {
                ICreativeNowService iCreativeNowService = (ICreativeNowService) this.LIZ.getValue();
                if (iCreativeNowService != null && iCreativeNowService.isUnder18()) {
                    return false;
                }
            } else if (aweme.isSubOnlyVideo() && aweme.isNrNff()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.ILongPressVideoPrivacyService
    public final void LIZ(final Aweme aweme, final int i, final C737050Svf c737050Svf) {
        if (!LIZIZ(i, aweme)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        String aid = aweme.getAid();
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
        }
        C191871104n.LJFF().getClass();
        C1888930zFr.LIZIZ(((InterfaceC192013109z) C10A1.LIZIZ.getValue()).LIZIZ(aid, i2), "/aweme/v1/aweme/modify/visibility/", C2097908Jt.LIZJ(new Pair("report_to_tea", "true"))).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<BaseResponse>() { // from class: X.10A5
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                Function2<Boolean, Exception, Unit> function2 = c737050Svf;
                if (function2 != null) {
                    Boolean bool = Boolean.FALSE;
                    if (!(th instanceof Exception)) {
                        th = null;
                    }
                    function2.invoke(bool, (Exception) th);
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(BaseResponse baseResponse) {
                int privateStatus;
                VideoPrivateUrlModel videoPrivateUrlModel;
                BaseResponse baseResponse2 = baseResponse;
                LongPressVideoPrivacyServiceImpl longPressVideoPrivacyServiceImpl = this.LL;
                Aweme aweme2 = aweme;
                int i3 = i;
                long j = jCurrentTimeMillis;
                longPressVideoPrivacyServiceImpl.getClass();
                AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme2);
                if (statusSafety != null) {
                    privateStatus = statusSafety.getPrivateStatus();
                } else {
                    privateStatus = 1;
                }
                C10AA.LJFF(i3, aweme2);
                IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                if (iAwemeService != null) {
                    iAwemeService.LLILLL(aweme2);
                }
                if (baseResponse2 instanceof VideoPrivateUrlModel) {
                    videoPrivateUrlModel = (VideoPrivateUrlModel) baseResponse2;
                } else {
                    videoPrivateUrlModel = null;
                }
                C10AA.LIZLLL(i3, privateStatus, aweme2, videoPrivateUrlModel);
                C10A4 c10a4 = C10A4.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                boolean zLIZLLL = C1395130mPP.LIZLLL(aweme2);
                c10a4.getClass();
                C10A4.LJFF(aweme2, privateStatus, i3, "profile_long_press", "", "", jCurrentTimeMillis2, zLIZLLL, "profile_long_press");
                long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                new C1061730djf();
                C1548820qPI.LIZIZ(new C397901gf(jCurrentThreadTimeMillis, C1061730djf.LIZLLL(C2097908Jt.LIZJ(new Pair("changeset", Collections.singletonList(C2097608Jq.LJIIIIZZ(new Pair("aweme_id", aweme2.getAid()), new Pair("private_status", C2097608Jq.LJIIIIZZ(new Pair("from", Integer.valueOf(privateStatus)), new Pair("to", Integer.valueOf(i3))))))))), "aweme_struct_field_change"));
                Function2<Boolean, Exception, Unit> function2 = c737050Svf;
                if (function2 != null) {
                    function2.invoke(Boolean.TRUE, null);
                }
            }
        });
    }
}
