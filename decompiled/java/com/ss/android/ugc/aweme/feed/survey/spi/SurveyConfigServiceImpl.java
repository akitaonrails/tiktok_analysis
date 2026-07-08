package com.ss.android.ugc.aweme.feed.survey.spi;

import X.AbstractC20290414aM;
import X.C01GW;
import X.C0PEM;
import X.C123100dR;
import X.C1488870oqb;
import X.C14ZG;
import X.C14ZW;
import X.C15438062q;
import X.C19719612Di;
import X.C1DFH;
import X.C2002307sr;
import X.C20287314Zr;
import X.C20291414aW;
import X.C20291514aX;
import X.C20291714aZ;
import X.C20291914ab;
import X.C20292314af;
import X.C20292414ag;
import X.C20292814ak;
import X.C20293114an;
import X.C20293414aq;
import X.C20293814au;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2252051DCp;
import X.C2296808zG;
import X.C23250099c;
import X.C283850BAp;
import X.C283870BAr;
import X.C5178020a;
import X.C5182020e;
import X.C737330Sw7;
import X.C751160TdK;
import X.C7740030o;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.ab.PromptConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.prompt.LocalPromptOption;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import com.ss.android.ugc.aweme.feed.model.survey.FrequencyGroup;
import com.ss.android.ugc.aweme.feed.survey.ISurveyConfigService;
import com.ss.android.ugc.aweme.feed.survey.frequency.AwemePromptInfo;
import com.ss.android.ugc.aweme.feed.survey.frequency.FeedbackSurveyLocalData;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.survey.PNSSurveyService;
import java.lang.reflect.Type;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
public final class SurveyConfigServiceImpl implements ISurveyConfigService {
    @Override // com.ss.android.ugc.aweme.feed.survey.ISurveyConfigService
    public final void LIZ() {
        C20287314Zr.LIZ.getClass();
        if (C20287314Zr.LIZIZ) {
            return;
        }
        C20287314Zr.LIZIZ = true;
        C2252051DCp c2252051DCp = C2252051DCp.LIZ;
        AbstractC20290414aM abstractC20290414aM = new AbstractC20290414aM() { // from class: X.14aK
            @Override // X.AbstractC20290414aM
            public final boolean LIZ(String str) {
                if (!C0T1R.LJI(str)) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC20290414aM
            public final void LIZJ(EnumC2252111DCv enumC2252111DCv, String str, Object obj) {
                EnumC20290114aJ enumC20290114aJ;
                Aweme aweme = C20287314Zr.LIZJ;
                String aid = null;
                if (aweme != null) {
                    aid = aweme.getAid();
                }
                if (!Intrinsics.LJFF(aid, str)) {
                    return;
                }
                EnumC20290114aJ[] enumC20290114aJArrValues = EnumC20290114aJ.values();
                int length = enumC20290114aJArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        enumC20290114aJ = enumC20290114aJArrValues[i];
                        if (u.LJIJI(enumC20290114aJ.name(), enumC2252111DCv.name(), true)) {
                            break;
                        } else {
                            i++;
                        }
                    } else if (C20290314aL.LIZ[enumC2252111DCv.ordinal()] != 1 || (enumC20290114aJ = EnumC20290114aJ.FINISH) == null) {
                        return;
                    }
                }
                C20287314Zr.LIZ.getClass();
                C20287314Zr.LIZ(aweme, enumC20290114aJ);
            }
        };
        c2252051DCp.getClass();
        C2252051DCp.LJFF.add(abstractC20290414aM);
    }

    @Override // com.ss.android.ugc.aweme.feed.survey.ISurveyConfigService
    public final void LIZIZ() {
        LinkedHashMap linkedHashMap;
        List<Long> arrayList;
        C14ZW.LIZ.getClass();
        if (C14ZW.LJIIJ) {
            return;
        }
        C20291714aZ c20291714aZ = C20291714aZ.LIZ;
        C2002307sr c2002307sr = new C2002307sr();
        c20291714aZ.getClass();
        C20291714aZ.LIZIZ(c2002307sr);
        FeedSurveyConfig[] feedSurveyConfigArr = C20293114an.LIZ;
        if (feedSurveyConfigArr != null) {
            C20291414aW.LIZ.getClass();
            C01GW c01gw = C283850BAp.LIZ;
            if (((Number) c01gw.getValue()).intValue() != 3 && 0 == 0 && !C283850BAp.LIZ()) {
                if (((Boolean) C283870BAr.LIZIZ.getValue()).booleanValue() || ((Number) c01gw.getValue()).intValue() == 1) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C751160TdK(null), 3);
                } else {
                    Pair pairLIZIZ = C20291414aW.LIZIZ();
                    C20291414aW.LIZ((FeedbackSurveyLocalData) pairLIZIZ.getFirst(), (AwemePromptInfo[]) pairLIZIZ.getSecond());
                }
            }
            C20291914ab.LIZ.getClass();
            if (C20291914ab.LIZJ.isEmpty()) {
                Type type = new TypeToken<List<Long>>() { // from class: X.04aP
                }.getType();
                String string = C20291914ab.LIZIZ.getString("key_survey_global_frequency", "");
                if (string.length() <= 0 || (arrayList = (List) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), string, type)) == null) {
                    arrayList = new ArrayList<>();
                }
                C20291914ab.LIZJ = arrayList;
                C20291914ab.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initGlobalFrequencyCache, list=");
                List<Long> list = C20291914ab.LIZJ;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<Long> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH).format(new Date(it2.next().longValue())));
                }
                sbLIZ.append(arrayList2.toString());
                C2188811AlT.LIZIZ(sbLIZ);
            }
            for (FeedSurveyConfig feedSurveyConfig : feedSurveyConfigArr) {
                C14ZW.LIZ.getClass();
                FeedSurvey feedSurvey = feedSurveyConfig.fixedSurvey;
                if (feedSurvey != null && C14ZW.LIZIZ.get(feedSurvey.surveyKey) == null) {
                    String str = feedSurvey.surveyKey;
                    FeedSurvey feedSurvey2 = feedSurveyConfig.fixedSurvey;
                    int i = feedSurveyConfig.feedSurveyStyle;
                    int i2 = feedSurveyConfig.bgdVideo;
                    long j = feedSurveyConfig.showIntervalTime;
                    String str2 = feedSurvey.relationsKey;
                    if (str2 != null) {
                        try {
                            new p();
                            n nVarLJIILIIL = p.LIZJ(str2).LJIILIIL();
                            linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<String, k> entry : nVarLJIILIIL.entrySet()) {
                                linkedHashMap.put(entry.getKey(), Long.valueOf(entry.getValue().LJIIZILJ()));
                            }
                            C14ZW.LJIIJJI.LJIIJJI(new C5182020e(linkedHashMap, (Map<String, String>) 255));
                        } catch (s e) {
                            TryCatchGuardChecker.doCheck(e);
                            C14ZW.LJIIJJI.LJII(new AwS546S0100000_2(e, 980));
                            linkedHashMap = null;
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C14ZW.LJIIJJI.LJII(new C5182020e(e2, 256));
                            linkedHashMap = null;
                        }
                        C14ZW.LIZIZ.put(str, new C14ZG(str, feedSurvey2, i, i2, j, linkedHashMap, feedSurveyConfig, feedSurveyConfig.maxUnsubmittedDisplayTimes, feedSurveyConfig.maxSubmitTime));
                        C20293414aq c20293414aq = C14ZW.LJIIJJI;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[InitSurvey] style=");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", bgd=");
                        sbLIZ2.append(i2);
                        sbLIZ2.append(", key=");
                        sbLIZ2.append(str);
                        c20293414aq.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        linkedHashMap = null;
                        C14ZW.LIZIZ.put(str, new C14ZG(str, feedSurvey2, i, i2, j, linkedHashMap, feedSurveyConfig, feedSurveyConfig.maxUnsubmittedDisplayTimes, feedSurveyConfig.maxSubmitTime));
                        C20293414aq c20293414aq2 = C14ZW.LJIIJJI;
                        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                        sbLIZ22.append("[InitSurvey] style=");
                        sbLIZ22.append(i);
                        sbLIZ22.append(", bgd=");
                        sbLIZ22.append(i2);
                        sbLIZ22.append(", key=");
                        sbLIZ22.append(str);
                        c20293414aq2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ22));
                    }
                }
                C20291514aX.LIZ.getClass();
                int i3 = feedSurveyConfig.surveyAppearStart;
                int i4 = feedSurveyConfig.surveyAppearEnd;
                int iNextInt = i4 > i3 ? new SecureRandom().nextInt(i4 - i3) + i3 : -1;
                C20293414aq c20293414aq3 = C20291514aX.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[TurnGroupInfo], start:");
                sbLIZ3.append(feedSurveyConfig.surveyAppearStart);
                sbLIZ3.append(", end:");
                sbLIZ3.append(feedSurveyConfig.surveyAppearEnd);
                sbLIZ3.append(", position:");
                sbLIZ3.append(iNextInt);
                c20293414aq3.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3));
                FeedSurvey feedSurvey3 = feedSurveyConfig.fixedSurvey;
                String str3 = feedSurvey3 != null ? feedSurvey3.surveyKey : null;
                C20291414aW c20291414aW = C20291414aW.LIZ;
                if (str3 != null && !C283850BAp.LIZ()) {
                    FeedbackSurveyLocalData feedbackSurveyLocalData = C20291414aW.LJIILIIL;
                    if (Intrinsics.LJFF(feedbackSurveyLocalData != null ? feedbackSurveyLocalData.surveyKey : null, str3)) {
                        FeedbackSurveyLocalData feedbackSurveyLocalData2 = C20291414aW.LJIILIIL;
                        int i5 = feedbackSurveyLocalData2 != null ? feedbackSurveyLocalData2.position : 0;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("tryResetStartPosition: key=");
                        FeedSurvey feedSurvey4 = feedSurveyConfig.fixedSurvey;
                        sbLIZ4.append(feedSurvey4 != null ? feedSurvey4.surveyKey : null);
                        sbLIZ4.append(", cnt=");
                        sbLIZ4.append(i5);
                        C2188811AlT.LIZIZ(sbLIZ4);
                        if (i5 != 0) {
                            feedSurveyConfig.setSurveyAppearStart(C20291514aX.LIZJ.getInt("key_day_aweme_count", 0) + i5);
                            feedSurveyConfig.setSurveyAppearEnd(feedSurveyConfig.surveyAppearStart + 20);
                            C20291414aW.LJIILJJIL = feedSurveyConfig.surveyAppearStart;
                            C20291414aW.LJIILL = feedSurveyConfig.surveyAppearEnd;
                            C20291414aW.LIZ.getClass();
                            if (!C283850BAp.LIZ()) {
                                Keva keva = C20291414aW.LJ;
                                Gson gson = C7740030o.LIZ().getGson();
                                String str4 = C20291414aW.LJFF;
                                String str5 = C20291414aW.LJI;
                                String str6 = C20291414aW.LJII;
                                String str7 = C20291414aW.LJIIJ;
                                ArrayList<LocalPromptOption> arrayList3 = C20291414aW.LJIIIIZZ;
                                PromptConfig promptConfigLIZ = C20292414ag.LIZ();
                                Integer numValueOf = Integer.valueOf(promptConfigLIZ != null ? promptConfigLIZ.feedbackPosition : 0);
                                PromptConfig promptConfigLIZ2 = C20292414ag.LIZ();
                                keva.storeString("local_data", GsonProtectorUtils.toJson(gson, new FeedbackSurveyLocalData(str4, str5, str6, str7, arrayList3, ((Number) new Pair(numValueOf, Integer.valueOf(promptConfigLIZ2 != null ? promptConfigLIZ2.feedbackPositionColdLaunch : 0)).getSecond()).intValue(), Calendar.getInstance().get(6), C20291414aW.LJIILJJIL, C20291414aW.LJIILL, C20291414aW.LJIIL, C20291414aW.LJIIJJI)));
                            }
                        }
                    }
                }
                C20292814ak c20292814ak = new C20292814ak(feedSurveyConfig.turnsGroupId, feedSurveyConfig.turnsGroupCount, feedSurveyConfig, feedSurveyConfig.surveyAppearStart, feedSurveyConfig.surveyAppearEnd);
                C20291514aX.LJFF.add(c20292814ak);
                FeedSurvey feedSurvey5 = feedSurveyConfig.fixedSurvey;
                if (C20292414ag.LIZJ(feedSurvey5 != null ? feedSurvey5.surveyKey : null)) {
                    C20291414aW.LIZ.getClass();
                    C20291414aW.LIZLLL.add(c20292814ak);
                }
                C1488870oqb.LIZ.getClass();
                List<FrequencyGroup> list2 = feedSurveyConfig.frequencyGroup;
                if (list2 != null) {
                    for (FrequencyGroup frequencyGroup : list2) {
                        C1488870oqb c1488870oqb = C1488870oqb.LIZ;
                        String str8 = frequencyGroup.groupName;
                        int i6 = frequencyGroup.interval;
                        int i7 = frequencyGroup.count;
                        c1488870oqb.getClass();
                        ConcurrentHashMap<String, List<Long>> concurrentHashMap = C1488870oqb.LIZIZ;
                        if (concurrentHashMap.get(str8) == null) {
                            Type type2 = new TypeToken<List<Long>>() { // from class: X.04aO
                            }.getType();
                            String string2 = C1488870oqb.LIZJ.getString(str8, "");
                            if (string2.length() > 0) {
                                Object objFromJson = GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), string2, type2);
                                if (objFromJson == null) {
                                    objFromJson = new ArrayList();
                                }
                                concurrentHashMap.put(str8, (List<Long>) objFromJson);
                            } else {
                                concurrentHashMap.put(str8, new ArrayList());
                            }
                            List<Long> list3 = concurrentHashMap.get(str8);
                            long jCurrentTimeMillis = System.currentTimeMillis() - (((long) i6) * 1000);
                            if (list3 != null) {
                                C19719612Di.LJJIIJ(list3, new C5178020a(jCurrentTimeMillis, 3), true);
                            }
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("initFrequencyCache, groupName=");
                            sbLIZ5.append(str8);
                            sbLIZ5.append(", interval=");
                            sbLIZ5.append(i6);
                            sbLIZ5.append(", count=");
                            sbLIZ5.append(i7);
                            sbLIZ5.append(", list=");
                            sbLIZ5.append(concurrentHashMap.get(str8));
                            C2188811AlT.LIZIZ(sbLIZ5);
                        }
                    }
                }
            }
            for (FeedSurveyConfig feedSurveyConfig2 : feedSurveyConfigArr) {
                List<String> list4 = feedSurveyConfig2.contentScopes;
                if ((list4 != null && list4.contains("pns")) || Intrinsics.LJFF(feedSurveyConfig2.contentScope, "pns")) {
                    if (C14ZW.LJIIIIZZ()) {
                        ((ExecutorService) C14ZW.LJI.getValue()).execute(new Runnable() { // from class: X.10Fy
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("SurveyRepo@be5f.initPnsSurveyServiceAsync$1");
                                try {
                                    PNSSurveyService pNSSurveyServiceLJIILLIIL = C14ZW.LJ;
                                    if (pNSSurveyServiceLJIILLIIL == null) {
                                        pNSSurveyServiceLJIILLIIL = ComplianceServiceProvider.LJIILLIIL();
                                    }
                                    C14ZW c14zw = C14ZW.LIZ;
                                    C14ZW.LJ = pNSSurveyServiceLJIILLIIL;
                                    if (pNSSurveyServiceLJIILLIIL != null) {
                                        pNSSurveyServiceLJIILLIIL.init();
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("SurveyRepo@be5f.initPnsSurveyServiceAsync$1");
                            }
                        });
                    } else {
                        PNSSurveyService pNSSurveyServiceLIZJ = C14ZW.LIZJ();
                        if (pNSSurveyServiceLIZJ != null) {
                            pNSSurveyServiceLIZJ.init();
                        }
                    }
                    C20291714aZ c20291714aZ2 = C20291714aZ.LIZ;
                    C20292314af c20292314af = new C20292314af(feedSurveyConfigArr);
                    c20291714aZ2.getClass();
                    C20291714aZ.LIZIZ(c20292314af);
                    C14ZW.LJIIJ = true;
                    C14ZW.LJIIJJI.LJIIJJI(new C20293814au());
                }
            }
            C20291714aZ c20291714aZ22 = C20291714aZ.LIZ;
            C20292314af c20292314af2 = new C20292314af(feedSurveyConfigArr);
            c20291714aZ22.getClass();
            C20291714aZ.LIZIZ(c20292314af2);
            C14ZW.LJIIJ = true;
            C14ZW.LJIIJJI.LJIIJJI(new C20293814au());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.survey.ISurveyConfigService
    public final Pair<Boolean, Boolean> LIZJ() {
        return new Pair<>(Boolean.valueOf(C737330Sw7.LIZ), Boolean.valueOf(C737330Sw7.LIZIZ));
    }

    @Override // com.ss.android.ugc.aweme.feed.survey.ISurveyConfigService
    public final List<String> LIZLLL() {
        String str;
        C14ZW.LIZ.getClass();
        Collection<C14ZG> collectionValues = C14ZW.LIZIZ.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            FeedSurvey feedSurvey = ((C14ZG) it2.next()).LIZIZ;
            if (feedSurvey != null && (str = feedSurvey.templateUrl) != null) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (C123100dR.LIZ((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.isEmpty() ? new ArrayList() : arrayList2;
    }
}
