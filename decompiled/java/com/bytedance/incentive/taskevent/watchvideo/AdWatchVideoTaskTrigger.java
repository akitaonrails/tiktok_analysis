package com.bytedance.incentive.taskevent.watchvideo;

import X.AbstractC1899090zWF;
import X.C01GW;
import X.C09CT;
import X.C1619720sFe;
import X.C1702580uPI;
import X.C1894320zOY;
import X.C1898830zVp;
import X.C1898850zVr;
import X.C1898920zVy;
import X.C1899050zWB;
import X.C1899080zWE;
import X.C20484080s;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1897260zTI;
import X.InterfaceC1899330zWd;
import X.InterfaceC497601wk;
import Y.ARunnableS128S0100000_28;
import android.os.Handler;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.AdVideoContent;
import com.bytedance.touchpoint.api.model.CommonVideo;
import com.bytedance.touchpoint.api.model.ReportInstruction;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TaskEventContent;
import com.bytedance.touchpoint.api.model.UserActionContent;
import com.bytedance.touchpoint.api.service.IIncentiveAdService;
import com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS58S0100100_28;

/* JADX INFO: loaded from: classes29.dex */
public final class AdWatchVideoTaskTrigger extends AbstractC1899090zWF implements InterfaceC1899330zWd {
    public final C1899050zWB LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public final Map<String, Integer> LLJI;
    public String LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public AdExtraParam LLJJIII;
    public List<Pair<String, AdExtraParam>> LLJJIJI;
    public final int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;

    @Override // X.InterfaceC1899310zWb
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1899330zWd
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1899310zWb
    public final void LJ() {
        this.LLJ = 0;
        this.LLJILJILJ = 0;
        ((LinkedHashMap) this.LLJI).clear();
        Keva keva = C1898830zVp.LIZ;
        C1898830zVp.LIZIZ(this.LL);
    }

    @Override // X.InterfaceC1899330zWd
    public final void LJIIIIZZ() {
        LJIIZILJ(1);
    }

    @Override // X.InterfaceC1899310zWb
    public final void LIZJ() {
        this.LLIZ.LIZ(this);
    }

    @Override // X.AbstractC1899090zWF
    public final void LJI() {
        this.LLIZ.LIZIZ();
    }

    public final TaskEventContent LJIILL() {
        String strLIZIZ;
        String str;
        String str2;
        AdExtraParam adExtraParamLJIILLIIL;
        String str3 = null;
        if (!(!this.LLJI.isEmpty())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.LLJI).entrySet()) {
            String str4 = (String) entry.getKey();
            Object value = entry.getValue();
            if (str4 != null && value != null) {
                arrayList.add(new CommonVideo(str4, "", 0, true, System.currentTimeMillis()));
            }
        }
        if (!this.LLJJIJIL || (adExtraParamLJIILLIIL = LJIILLIIL()) == null) {
            strLIZIZ = null;
        } else {
            String str5 = adExtraParamLJIILLIIL.taskId;
            if (str5 == null) {
                str5 = "";
            }
            Integer num = adExtraParamLJIILLIIL.completedTimes;
            int iIntValue = num != null ? num.intValue() : -1;
            Integer num2 = adExtraParamLJIILLIIL.engagementType;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            IIncentiveAdService iIncentiveAdService = (IIncentiveAdService) PluggableExtentionKt.pluggableSpi$default(IIncentiveAdService.class, false, false, false, 14, null);
            strLIZIZ = iIncentiveAdService != null ? iIncentiveAdService.LIZIZ(iIntValue, iIntValue2, str5) : null;
        }
        AdExtraParam adExtraParam = this.LLJJIII;
        if (adExtraParam != null) {
            str = adExtraParam.taskId;
            str2 = adExtraParam.preReqId;
            str3 = adExtraParam.reqId;
        } else {
            str = null;
            str2 = null;
        }
        return C1898850zVr.LIZ(this.LL, "watch_ads_time", new UserActionContent(null, null, null, null, null, new AdVideoContent(arrayList, str, str2, str3, strLIZIZ), null, null, null), this.LLJJI);
    }

    public final AdExtraParam LJIILLIIL() {
        Integer num;
        List<Pair<String, AdExtraParam>> list = this.LLJJIJI;
        if (list != null && !list.isEmpty()) {
            for (Pair pair : (ArrayList) this.LLJJIJI) {
                IIncentiveAdService iIncentiveAdService = (IIncentiveAdService) PluggableExtentionKt.pluggableSpi$default(IIncentiveAdService.class, false, false, false, 14, null);
                if ((iIncentiveAdService != null && iIncentiveAdService.LJIIIIZZ(((AdExtraParam) pair.getSecond()).engagementType)) || ((num = ((AdExtraParam) pair.getSecond()).isFirstReEngagementType) != null && num.intValue() == 1)) {
                    return (AdExtraParam) pair.getSecond();
                }
            }
        }
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1899310zWb
    public final void LIZ() {
        TaskEventContent taskEventContentLJIILL = LJIILL();
        if (taskEventContentLJIILL != null) {
            Keva keva = C1898830zVp.LIZ;
            C1898830zVp.LIZLLL(this.LL, taskEventContentLJIILL);
        }
    }

    public AdWatchVideoTaskTrigger(TaskEvent taskEvent) {
        super(taskEvent);
        this.LLIZ = new C1899050zWB();
        this.LLJI = new LinkedHashMap();
        this.LLJILLL = "";
        this.LLJJ = "";
        this.LLJJIJIIJIL = 5;
        this.LLJJJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(49));
        this.LLJJJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(50));
    }

    public final void LJIIZILJ(int i) {
        int iIntValue;
        Integer num;
        Integer num2;
        int iIntValue2;
        Integer num3;
        if (this.LLILLJJLI && !this.LLIZLLLIL) {
            this.LLJ += i;
            int i2 = this.LLJILJILJ + i;
            this.LLJILJILJ = i2;
            this.LLJI.put(this.LLJIJIL, Integer.valueOf(i2));
            BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager = this.LLILZLL;
            int iIntValue3 = 20;
            if (baseTaskEventTimerPendantManager != null) {
                int i3 = this.LLJ;
                ReportInstruction reportInstruction = this.LL.reportInstruction;
                if (reportInstruction != null && (num3 = reportInstruction.reportBatch) != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    iIntValue2 = 20;
                }
                baseTaskEventTimerPendantManager.LJJLIIIIJ(i3, iIntValue2);
            }
            int i4 = this.LLJ;
            ReportInstruction reportInstruction2 = this.LL.reportInstruction;
            if (reportInstruction2 != null && (num2 = reportInstruction2.reportBatch) != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 20;
            }
            boolean z = false;
            if (i4 >= iIntValue) {
                TaskEventContent taskEventContentLJIILL = LJIILL();
                LJ();
                if (taskEventContentLJIILL != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1899080zWE c1899080zWE = this.LLILLL;
                    if (c1899080zWE != null) {
                        c1899080zWE.LJIIJJI(taskEventContentLJIILL, false, new AwS58S0100100_28(this, jCurrentTimeMillis, 0));
                    }
                }
                this.LLIZLLLIL = true;
                C786410Ut5.LJLIIL(1000L, (Handler) this.LLJJJIL.getValue(), new ARunnableS128S0100000_28(this, 17));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                if (interfaceC1897260zTILIZIZ != null) {
                    interfaceC1897260zTILIZIZ.LIZ("timed_task_time_up", linkedHashMap);
                }
            }
            int i5 = this.LLJ;
            ReportInstruction reportInstruction3 = this.LL.reportInstruction;
            if (reportInstruction3 != null && (num = reportInstruction3.reportBatch) != null) {
                iIntValue3 = num.intValue();
            }
            if (i5 == iIntValue3 - this.LLJJIJIIJIL) {
                z = true;
            }
            if (this.LLJJIJIL && z) {
                C23250099c.LIZLLL((InterfaceC497601wk) this.LLJJJ.getValue(), null, null, new C1702580uPI(this, null), 3);
            }
        }
    }

    @Override // X.InterfaceC1899310zWb
    public final void LJFF(TaskEventContent taskEventContent, C1898920zVy c1898920zVy) {
        List<CommonVideo> list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdVideoContent adVideoContent = taskEventContent.userActionContent.adVideoContent;
        if (adVideoContent != null && (list = adVideoContent.videos) != null) {
            for (CommonVideo commonVideo : list) {
                String str = (String) linkedHashMap.get("ad_page");
                if (str != null && str.length() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(',');
                    sbLIZ.append(commonVideo.itemId);
                    linkedHashMap.put("ad_page", C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    linkedHashMap.put("ad_page", commonVideo.itemId);
                }
            }
        }
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        TaskEvent taskEvent = this.LL;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("group_ids", C20484080s.LIZJ(linkedHashMap));
        c1894320zOY.getClass();
        C1894320zOY.LJIIIZ(taskEvent, linkedHashMap2);
    }

    /* JADX INFO: loaded from: classes27.dex */
    public static final class AdExtraParam {

        @C09CT("completed_times")
        public final Integer completedTimes;

        @C09CT("engagement_type")
        public final Integer engagementType;

        @C09CT("is_first_reengagement_prereq")
        public final Integer isFirstReEngagementType;

        @C09CT("pre_req_id")
        public final String preReqId;

        @C09CT("req_id")
        public final String reqId;

        @C09CT("task_id")
        public final String taskId;

        public AdExtraParam() {
            this(null, null, null, null, null, null);
        }

        public AdExtraParam(String str, String str2, Integer num, String str3, Integer num2, Integer num3) {
            this.taskId = str;
            this.reqId = str2;
            this.completedTimes = num;
            this.preReqId = str3;
            this.engagementType = num2;
            this.isFirstReEngagementType = num3;
        }
    }
}
