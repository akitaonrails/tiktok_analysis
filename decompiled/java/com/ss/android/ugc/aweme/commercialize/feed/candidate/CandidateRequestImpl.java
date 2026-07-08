package com.ss.android.ugc.aweme.commercialize.feed.candidate;

import X.C04TD;
import X.C09JN;
import X.C0CQT;
import X.C0T4A;
import X.C1024380clQ;
import X.C1053210dVv;
import X.C1053240dVy;
import X.C11NJ;
import X.C11S5;
import X.C1483340ohg;
import X.C1489110oqz;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C293430Ben;
import X.EnumC584610MwN;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.ad.feed.candidate.CandidateResponse;
import com.ss.android.ugc.aweme.ad.feed.candidate.ICandidateRequestService;
import com.ss.android.ugc.aweme.commercialize.ams.context.MeasurementContext;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS0S4000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class CandidateRequestImpl implements ICandidateRequestService {
    public final CandidateAdRequestApi LIZ;
    public final C11NJ LIZIZ;

    public static ICandidateRequestService LIZJ() {
        Object objLIZ = C04TD.LIZ(ICandidateRequestService.class, false);
        if (objLIZ != null) {
            return (ICandidateRequestService) objLIZ;
        }
        if (C04TD.LLLI == null) {
            synchronized (ICandidateRequestService.class) {
                if (C04TD.LLLI == null) {
                    C04TD.LLLI = new CandidateRequestImpl();
                }
            }
        }
        return C04TD.LLLI;
    }

    public CandidateRequestImpl() {
        CandidateAdRequestApi.LIZ.getClass();
        this.LIZ = (CandidateAdRequestApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(CandidateAdRequestApi.class);
        this.LIZIZ = new C11NJ();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.candidate.ICandidateRequestService
    public final void LIZIZ(Aweme aweme) {
        C1483340ohg.LJIL(0, aweme);
        C1024380clQ c1024380clQ = C1024380clQ.LIZ;
        C1024380clQ.LJIILIIL(C1697810uHb.LJ(aweme), C0T4A.LIZ(0), null);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.candidate.ICandidateRequestService
    public final void LIZ(final String str, String str2, final List list) {
        final long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        int i = 0;
        C1053210dVv c1053210dVv = new C1053210dVv(new Object[0]);
        C1053240dVy.LIZ.getClass();
        c1053210dVv.log(C1053240dVy.LIZJ);
        CandidateAdRequestApi candidateAdRequestApi = this.LIZ;
        C293430Ben.LIZ.getClass();
        if (C293430Ben.LIZ()) {
            i = 16;
        }
        this.LIZIZ.LIZ(candidateAdRequestApi.request(i, ComplianceServiceProvider.LJJI().LJII(), C1489110oqz.LIZ("feed"), ((IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class)).LIZIZ(EnumC584610MwN.FEED).U4(), str2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0dVu
            @Override // X.C09JN
            public final void accept(Object obj) {
                boolean z;
                String str3;
                String string;
                C1C7U.LIZ("CandidateRequestImpl@fa45.requestCandidateAd$1");
                CandidateResponse candidateResponse = (CandidateResponse) obj;
                final List<Aweme> candidateList = candidateResponse.getCandidateList();
                if (candidateList == null) {
                    candidateList = C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                for (Aweme aweme : candidateList) {
                    C1031030cw9 c1031030cw9 = C1031030cw9.LIZ;
                    List<Aweme> list2 = list;
                    c1031030cw9.getClass();
                    if (C1031030cw9.LIZ(aweme, list2)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[requestCandidateAd] [onSuccess] add aid=");
                        sbLIZ.append(aweme.getAid());
                        C1022620cia.LIZ("CandidateRequestImpl", C2188811AlT.LIZIZ(sbLIZ));
                        arrayList.add(aweme);
                    }
                }
                if (C2264471DkD.LIZLLL(str)) {
                    MeasurementContext.LIZ.getClass();
                    MeasurementContext measurementContextLIZ = C584230Mvl.LIZ();
                    final String str4 = str;
                    measurementContextLIZ.LJIIL(new C0N2B() { // from class: X.0N2A
                        @Override // X.C0N2B
                        public final void LIZ(MeasurementContext measurementContext) {
                            C0N24.LIZ(measurementContext, candidateList, str4, "");
                        }
                    });
                }
                C1023060cjI.LJI(candidateList);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[requestCandidateAd] [onSuccess] candidate.size=");
                sbLIZ2.append(arrayList.size());
                C1022620cia.LIZ("CandidateRequestImpl", C2188811AlT.LIZIZ(sbLIZ2));
                ((IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class)).LIZIZ(EnumC584610MwN.FEED).h5(jCurrentTimeMillis, candidateResponse.getSatiParamForPitaya(), arrayList);
                this.getClass();
                if (candidateResponse.status_code == 0) {
                    z = true;
                } else {
                    z = false;
                }
                String str5 = "1";
                if (z) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                if (!candidateList.isEmpty()) {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                int i2 = candidateResponse.error_code;
                if (i2 == 0 || (string = Integer.valueOf(i2).toString()) == null) {
                    string = "-1";
                }
                String str6 = candidateResponse.status_msg;
                if (str6 == null) {
                    str6 = "";
                }
                C1053210dVv c1053210dVv2 = new C1053210dVv(new Object[0]);
                C1053240dVy.LIZ.getClass();
                c1053210dVv2.log(C1053240dVy.LIZIZ, new AwS0S4000000_16(str5, str3, string, str6, 0));
                C1C7U.LIZIZ("CandidateRequestImpl@fa45.requestCandidateAd$1");
            }
        }, new C09JN() { // from class: X.0dVw
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("CandidateRequestImpl@fa45.requestCandidateAd$2");
                Throwable th = (Throwable) obj;
                ((IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class)).LIZIZ(EnumC584610MwN.FEED).P4(jCurrentTimeMillis);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[requestCandidateAd] [onError] msg=");
                sbLIZ.append(th.getLocalizedMessage());
                C1022620cia.LIZIZ("CandidateRequestImpl", C2188811AlT.LIZIZ(sbLIZ));
                C1053210dVv c1053210dVv2 = new C1053210dVv(new Object[0]);
                C1053240dVy.LIZ.getClass();
                c1053210dVv2.log(C1053240dVy.LIZIZ, new AwS595S0100000_16(th, 17));
                C1C7U.LIZIZ("CandidateRequestImpl@fa45.requestCandidateAd$2");
            }
        }));
    }
}
