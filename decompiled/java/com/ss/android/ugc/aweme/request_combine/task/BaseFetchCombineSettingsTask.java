package com.ss.android.ugc.aweme.request_combine.task;

import X.C0CCZ;
import X.C0CD2;
import X.C0CNS;
import X.C0CO3;
import X.C0CP3;
import X.C0CP8;
import X.C0CP9;
import X.C0VZ0;
import X.C0X4D;
import X.C1498560p6E;
import X.C2344809Gs;
import X.C312960COo;
import X.C312980COq;
import X.C799890VZj;
import X.C799900VZk;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.NoticeCountFetchManager$coldStartCombineRequest$1;
import com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchComplianceSettingRequest;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchLiveSettingRequest;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchShareSettingRequest;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchUserSettingRequest;
import com.ss.android.ugc.aweme.request_combine.request.p0.FetchCombineSettingRequest;
import com.ss.android.ugc.aweme.request_combine.request.p0.FetchCombineSettingTask;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseFetchCombineSettingsTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        boolean zLJI = MethodIDManager.LJI(196614);
        if (C1498560p6E.LIZLLL(context)) {
            C2344809Gs.LJ("FetchCombineSettingsTask");
            if (C312980COq.LIZ.LIZ()) {
                if (C0CD2.LIZJ() == -1 && !C0CNS.LIZIZ()) {
                    C799900VZk.LIZ.getClass();
                    C312960COo c312960COo = new C312960COo();
                    c312960COo.LIZ(new FetchCombineSettingRequest());
                    c312960COo.LIZIZ();
                } else {
                    C799900VZk.LIZ.getClass();
                    C799890VZj c799890VZj = new C799890VZj();
                    c799890VZj.LIZ(new FetchCombineSettingTask());
                    c799890VZj.LIZIZ();
                }
                if ((((InboxNoticeCountStrategyExperiment.MetaData) InboxNoticeCountStrategyExperiment.LIZIZ.getValue()).strategy & 2) == 2) {
                    C2344809Gs.LJ("FetchCombineSettingsTask delayUnreadCountAllProcess");
                    C0CP3 c0cp3 = new C0CP3() { // from class: X.0CP0
                        @Override // X.C0CP3
                        public final void LIZ() {
                            C2344809Gs.LJ("FetchCombineSettingsTask delayUnreadCountAllProcess boot finish");
                            C0X4D.LIZ.getClass();
                            long j = InboxNoticeCountStrategyExperiment.LIZJ;
                            int i = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("delayUnreadCountAllProcess call ");
                            sbLIZ.append(C786410Ut5.u3());
                            sbLIZ.append(", delayTime = ");
                            sbLIZ.append(j);
                            C1720106oR.LJI("NoticeCountFetcher", C2188811AlT.LIZIZ(sbLIZ));
                            C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS).LJL(C11S5.LJ).LJJLJLI(new C09JN() { // from class: X.0CP1
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    C1C7U.LIZ("NoticeCountFetchManager@b197.delayUnreadCountAllProcess$1");
                                    int i2 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("delayUnreadCountAllProcess start process ");
                                    sbLIZ2.append(C786410Ut5.u3());
                                    C1720106oR.LJI("NoticeCountFetcher", C2188811AlT.LIZIZ(sbLIZ2));
                                    C0X4D.LIZ.getClass();
                                    C0X4D.LIZ(1, false);
                                    ((INoticeCountTabBadgePresentService) ServiceManager.get().getService(INoticeCountTabBadgePresentService.class)).LIZIZ();
                                    C1C7U.LIZIZ("NoticeCountFetchManager@b197.delayUnreadCountAllProcess$1");
                                }
                            });
                        }
                    };
                    if (C0CP9.LIZ == C0CP8.COLD_BOOT_BEGIN) {
                        C0CP9.LIZIZ.add(c0cp3);
                    }
                }
            } else {
                C799900VZk.LIZ.getClass();
                C799890VZj c799890VZj2 = new C799890VZj();
                c799890VZj2.LIZ(new FetchShareSettingRequest());
                c799890VZj2.LIZ(new FetchUserSettingRequest());
                C0X4D.LIZ.getClass();
                c799890VZj2.LIZ(new NoticeCountFetchManager$coldStartCombineRequest$1());
                c799890VZj2.LIZ(new FetchLiveSettingRequest(null));
                c799890VZj2.LIZ(new FetchComplianceSettingRequest(C0CO3.IDLE));
                c799890VZj2.LIZIZ();
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
