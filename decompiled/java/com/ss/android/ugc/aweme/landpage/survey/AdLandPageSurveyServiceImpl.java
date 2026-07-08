package com.ss.android.ugc.aweme.landpage.survey;

import X.C01GW;
import X.C098200Yq;
import X.C1028180crY;
import X.C1028330crn;
import X.C1028340cro;
import X.C1227904rF;
import X.C1697810uHb;
import X.C189200o6;
import X.C2188811AlT;
import X.EnumC993340bxM;
import X.InterfaceC1294060jmO;
import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLandPageSurveyServiceImpl implements IAdLandPageSurveyService {
    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    public final void LIZ() {
        C1028330crn.LIZ.getClass();
        C1028330crn.LIZJ = null;
        C1028330crn.LIZLLL = 0L;
        C1028330crn.LIZIZ = null;
        C1028330crn.LJ = false;
    }

    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    public final void LJI() {
        C1028330crn.LIZ.getClass();
        C1028330crn.LIZJ = null;
        C1028330crn.LIZLLL = 0L;
        C1028330crn.LIZIZ = null;
        C1028330crn.LJ = false;
    }

    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    public final void LIZJ(String str) {
        Object c098200Yq;
        C1028330crn.LIZ.getClass();
        if (str != null && str.length() != 0) {
            C01GW c01gw = C1028330crn.LJII;
            if (((Set) c01gw.getValue()).add(str) && ((Set) c01gw.getValue()).contains(str)) {
                try {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    Set set = (Set) c01gw.getValue();
                    c1227904rF.getClass();
                    c098200Yq = C1227904rF.LJI(set);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                String str2 = (String) c098200Yq;
                if (str2 != null) {
                    C1028330crn.LIZ.getClass();
                    C1028330crn.LIZIZ().storeString("ad_land_survey_submitted_set", str2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    public final void LIZLLL(boolean z) {
        C1028330crn.LIZ.getClass();
        C1028330crn.LJ = z;
        if (!z) {
            C1028330crn.LIZLLL = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    public final boolean LJFF(AwemeRawAd awemeRawAd) {
        LandingPageSurveyModel landingPageSurvey;
        C1028330crn.LIZ.getClass();
        if (awemeRawAd != null) {
            AdStyleActionModel adStyleActionModel = awemeRawAd.getAdStyleActionModel();
            if (adStyleActionModel == null || (landingPageSurvey = adStyleActionModel.landingPageSurvey) == null) {
                landingPageSurvey = awemeRawAd.getLandingPageSurvey();
            }
        } else {
            landingPageSurvey = null;
        }
        return ((Boolean) C1028330crn.LIZ(landingPageSurvey).getFirst()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    public final boolean LIZIZ(Activity activity, Function0<Unit> function0) throws JSONException {
        LandingPageSurveyModel landingPageSurveyModel;
        C1028330crn.LIZ.getClass();
        if (!C1028330crn.LJ && (landingPageSurveyModel = C1028330crn.LIZIZ) != null) {
            Pair pairLIZ = C1028330crn.LIZ(landingPageSurveyModel);
            boolean zBooleanValue = ((Boolean) pairLIZ.getFirst()).booleanValue();
            C1028180crY c1028180crY = (C1028180crY) pairLIZ.getSecond();
            String str = null;
            if (!zBooleanValue) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkShowSurvey failed ");
                if (c1028180crY != null) {
                    str = c1028180crY.LIZ;
                }
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                return false;
            }
            C1028330crn.LIZJ(activity, landingPageSurveyModel.schemaUrl, function0, EnumC993340bxM.THIRD_PARTY);
            C1028330crn.LIZLLL(System.currentTimeMillis(), landingPageSurveyModel.surveyId);
            C1028330crn.LIZIZ = null;
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    public final void LJ(C1028340cro c1028340cro, LandingPageSurveyModel landingPageSurveyModel) {
        C1028330crn.LIZ.getClass();
        String str = c1028340cro.LIZ;
        if (str != null) {
            Iterator it2 = C1697810uHb.LJ("feedad", "topview", "comment_ad").iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), str)) {
                    C1028330crn.LIZJ = c1028340cro;
                    C1028330crn.LIZIZ = landingPageSurveyModel;
                    System.currentTimeMillis();
                    return;
                }
            }
        }
        C1028330crn.LIZJ = null;
        C1028330crn.LIZLLL = 0L;
        C1028330crn.LIZIZ = null;
        C1028330crn.LJ = false;
    }

    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    public final Pair LJIIIIZZ(Activity activity, AwS560S0100000_16 awS560S0100000_16) throws JSONException {
        C1028330crn.LIZ.getClass();
        if (activity == null) {
            return new Pair(Boolean.FALSE, new C1028180crY("activity is null"));
        }
        LandingPageSurveyModel landingPageSurveyModel = C1028330crn.LIZIZ;
        if (landingPageSurveyModel == null) {
            return new Pair(Boolean.FALSE, new C1028180crY("landingPageSurvey error null"));
        }
        Pair pairLIZ = C1028330crn.LIZ(landingPageSurveyModel);
        boolean zBooleanValue = ((Boolean) pairLIZ.getFirst()).booleanValue();
        Object second = pairLIZ.getSecond();
        if (!zBooleanValue) {
            return new Pair(Boolean.FALSE, second);
        }
        C1028330crn.LIZJ(activity, landingPageSurveyModel.schemaUrl, awS560S0100000_16, EnumC993340bxM.IN_APP);
        C1028330crn.LIZLLL(System.currentTimeMillis(), landingPageSurveyModel.surveyId);
        C1028330crn.LIZIZ = null;
        return new Pair(Boolean.TRUE, null);
    }

    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    @InterfaceC1294060jmO
    public final void LJII(String str, String str2, String str3, String str4, String str5, String str6, boolean z, long j, long j2) {
        LJ(new C1028340cro(str, str2, str3, str4, str5, 32), new LandingPageSurveyModel(z, j, j2, str6, null, null, 0, 0, 0));
    }
}
