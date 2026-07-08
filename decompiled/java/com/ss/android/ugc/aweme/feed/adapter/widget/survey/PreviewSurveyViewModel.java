package com.ss.android.ugc.aweme.feed.adapter.widget.survey;

import X.C01GW;
import X.C0T5M;
import X.C11JF;
import X.C13LP;
import X.C1440005kM;
import X.C14Z0;
import X.C15438062q;
import X.C1AC7;
import X.C1ACA;
import X.C1ADO;
import X.C1AKK;
import X.C20441214yg;
import X.C20647815qu;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C300550BqH;
import X.C452501pT;
import X.C483240IxG;
import X.C483250IxH;
import X.C483260IxI;
import X.C483280IxK;
import X.C483340IxQ;
import X.C786410Ut5;
import X.EnumC484840Izq;
import X.InterfaceC483300IxM;
import X.InterfaceC483310IxN;
import X.InterfaceC483370IxT;
import X.InterfaceC484910Izx;
import Y.ACallableS75S1100000_31;
import Y.ARunnableS107S0100000_7;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.android.livesdk.survey.model.SurveyShowMode;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tiktok.strategycenter.TTMStrategyCenter;
import com.tiktok.strategycenter.TTMStrategyResult;
import com.tiktok.strategycenter.TTMStrategyRule;
import com.tiktok.strategycenter.TTMStrategyRunCallBack;
import com.tiktok.ttm.TTMCore;
import com.tiktok.ttm.TTMInput;
import com.tiktok.ttm.TTMOutput;
import com.tiktok.ttm.TTMParamData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PreviewSurveyViewModel extends SurveyViewModel implements InterfaceC484910Izx {
    public static final Map<Aweme, C483250IxH> LLLFF;
    public static final Map<C483340IxQ, C483250IxH> LLLFFI;
    public C11JF LLJJLIIIJLLLLLLLZ;
    public final String LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public final MutableLiveData<C483240IxG> LLJLLL;
    public final MutableLiveData<Boolean> LLJZ;
    public final NextLiveData<Boolean> LLJZIJLIL;
    public final NextLiveData<Float> LLL;
    public final AwS621S0100000_7 LLLF;
    public final C01GW LLJJL = C452501pT.LIZIZ(new C483260IxI(this));
    public final BPEAHandler LLJL = new BPEAHandler(Looper.getMainLooper());
    public C483250IxH LLJLIL = new C483250IxH();

    static {
        new Object() { // from class: X.0IxL
        };
        LLLFF = new LinkedHashMap();
        LLLFFI = new LinkedHashMap();
    }

    @Override // com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel
    public final void DQ2() {
        LiveRoomStruct liveRoomStruct;
        this.LLJLIL.LIZIZ = false;
        C1ACA c1acaJQ2 = JQ2();
        this.LLJ = (c1acaJQ2 == null || (liveRoomStruct = c1acaJQ2.LIZJ) == null) ? 0L : liveRoomStruct.id;
        FQ2();
        QQ2("submit");
        C1440005kM.LIZ(new C483280IxK());
    }

    @Override // com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel
    public final void EQ2() {
        LiveRoomStruct liveRoomStruct;
        if (this.LLILLJJLI == null || this.LLILLL == null || this.LLIZLLLIL) {
            return;
        }
        this.LLJLIL.LIZIZ = false;
        C1ACA c1acaJQ2 = JQ2();
        this.LLJ = (c1acaJQ2 == null || (liveRoomStruct = c1acaJQ2.LIZJ) == null) ? 0L : liveRoomStruct.id;
        FQ2();
    }

    public final boolean HQ2() {
        SurveyShowMode surveyShowMode;
        C1ADO c1ado;
        SurveyShowMode surveyShowMode2;
        List<String> list;
        SurveyShowMode surveyShowMode3;
        SurveyData surveyData = this.LL;
        String str = null;
        if (surveyData != null && (surveyShowMode2 = surveyData.showMode) != null && (list = surveyShowMode2.filterNeedFeatureKeys) != null && (!list.isEmpty())) {
            SurveyData surveyData2 = this.LL;
            if (surveyData2 != null && (surveyShowMode3 = surveyData2.showMode) != null) {
                str = surveyShowMode3.filterExpression;
            }
            return IQ2(str, false, list);
        }
        TTMCore tTMCore = TTMCore.getInstance();
        if (!tTMCore.isInit()) {
            return false;
        }
        C1ACA c1acaJQ2 = JQ2();
        long j = 0;
        if (c1acaJQ2 != null && (c1ado = c1acaJQ2.LJIIJ) != null) {
            long jCurrentTimeMillis = ((System.currentTimeMillis() - c1ado.LIZ) + ((long) 100)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (jCurrentTimeMillis >= 0) {
                j = jCurrentTimeMillis;
            }
        }
        HashMap map = new HashMap();
        map.put("preview_stay_time", Long.valueOf(j));
        map.put("same_live_card_dup_exposure", Boolean.valueOf(this.LLJLL));
        TTMInput tTMInput = new TTMInput();
        SurveyData surveyData3 = this.LL;
        if (surveyData3 != null && (surveyShowMode = surveyData3.showMode) != null) {
            str = surveyShowMode.filterExpression;
        }
        tTMInput.machineCode = str;
        tTMInput.paramType = TTMInput.ParamType.TYPE_MAP;
        tTMInput.paramData = new TTMParamData((Map<String, Object>) map);
        return Intrinsics.LJFF(tTMCore.execute(tTMInput).getData(), Boolean.TRUE);
    }

    public final C1ACA JQ2() {
        return (C1ACA) this.LLJJL.getValue();
    }

    public final void LQ2() {
        Set<SurveyOption> set = this.LLILZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
        Iterator<SurveyOption> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().optionId));
        }
        Object objLJLJLLL = C13LP.LJLJLLL(C13LP.LLIIJI(arrayList));
        SurveyOption surveyOption = this.LLILLL;
        if (Intrinsics.LJFF(objLJLJLLL, surveyOption != null ? Long.valueOf(surveyOption.optionId) : null)) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        GQ2(c2344009Gk);
        Set<SurveyOption> set2 = this.LLILZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(set2, 10));
        Iterator<SurveyOption> it3 = set2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(it3.next().optionId));
        }
        c2344009Gk.LJIIIIZZ("option_id_list", C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
        C20684815ws.LJIILLIIL("survey_change_final_answer_click", c2344009Gk.LIZ);
    }

    public final void OQ2() {
        Set<SurveySecondQuestion> set = this.LLILZLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
        Iterator<SurveySecondQuestion> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().optionId));
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        Set<SurveySecondQuestion> set2 = this.LLILZIL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(set2, 10));
        Iterator<SurveySecondQuestion> it3 = set2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(it3.next().optionId));
        }
        if (C13LP.LJLLLLLL(setLLIIJI, C13LP.LLIIJI(arrayList2)).isEmpty()) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        GQ2(c2344009Gk);
        Set<SurveySecondQuestion> set3 = this.LLILZLL;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(set3, 10));
        Iterator<SurveySecondQuestion> it4 = set3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Long.valueOf(it4.next().optionId));
        }
        c2344009Gk.LJIIIIZZ("secondary_option_id_list", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62));
        C20684815ws.LJIILLIIL("survey_change_final_answer_click", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC484910Izx
    public final void UW0() {
        String str;
        String aid;
        String str2;
        Aweme aweme;
        Aweme aweme2;
        C20441214yg.LIZIZ("PreviewSurveyViewModel", "onLiveScaled: ");
        this.LLJLIL.LIZIZ = true;
        RQ2(true);
        C20647815qu c20647815qu = C20647815qu.LIZ;
        SurveyData surveyData = this.LLJLIL.LIZ;
        String str3 = "";
        if (surveyData == null || (str = surveyData.surveyId) == null) {
            str = "";
        }
        C1ACA c1acaJQ2 = JQ2();
        if (c1acaJQ2 == null || (aweme2 = c1acaJQ2.LIZIZ) == null || (aid = aweme2.getAid()) == null) {
            aid = "";
        }
        C1ACA c1acaJQ22 = JQ2();
        String requestId = (c1acaJQ22 == null || (aweme = c1acaJQ22.LIZIZ) == null) ? null : aweme.getRequestId();
        c20647815qu.getClass();
        C20647815qu.LIZLLL(str, aid, requestId);
        C1ACA c1acaJQ23 = JQ2();
        Aweme aweme3 = c1acaJQ23 != null ? c1acaJQ23.LIZIZ : null;
        SurveyData surveyData2 = this.LLJLIL.LIZ;
        if (surveyData2 != null && (str2 = surveyData2.surveyId) != null) {
            str3 = str2;
        }
        if (C300550BqH.LIZ() && aweme3 != null) {
            C0T5M c0t5m = C0T5M.LIZ;
            ACallableS75S1100000_31 aCallableS75S1100000_31 = new ACallableS75S1100000_31(aweme3, str3, 4);
            c0t5m.getClass();
            C0T5M.LIZIZ(aCallableS75S1100000_31);
        }
        this.LLL.setValue(Float.valueOf(1.0f));
    }

    @Override // X.InterfaceC484910Izx
    public final void VZ1() {
        C20441214yg.LIZIZ("PreviewSurveyViewModel", "onLiveRecover: ");
        this.LLJLIL.LIZIZ = false;
        QQ2("cancel");
        this.LLL.setValue(Float.valueOf(0.0f));
    }

    @Override // com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel
    public final void wQ2() {
        PQ2("back");
    }

    @Override // com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel
    public final void xQ2() {
        WeakReference<InterfaceC483300IxM> weakReference;
        InterfaceC483300IxM interfaceC483300IxM;
        Aweme aweme;
        Aweme aweme2;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme3;
        this.LLJLIL.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        SurveyData surveyData = this.LL;
        Integer numValueOf = null;
        c2344009Gk.LJIIIIZZ("survey_id", surveyData != null ? surveyData.surveyId : null);
        SurveyData surveyData2 = this.LL;
        c2344009Gk.LJIIIIZZ("survey_tag", surveyData2 != null ? surveyData2.surveyTag : null);
        C1ACA c1acaJQ2 = JQ2();
        c2344009Gk.LJIIIIZZ("group_id", (c1acaJQ2 == null || (aweme3 = c1acaJQ2.LIZIZ) == null) ? null : aweme3.getAid());
        C1ACA c1acaJQ22 = JQ2();
        c2344009Gk.LJ((c1acaJQ22 == null || (liveRoomStruct = c1acaJQ22.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct.ownerUserId), "author_id");
        c2344009Gk.LIZJ(C14Z0.LIVE_TYPE.getType(), "survey_biz_type");
        C1ACA c1acaJQ23 = JQ2();
        c2344009Gk.LJIIIIZZ("request_id", (c1acaJQ23 == null || (aweme2 = c1acaJQ23.LIZIZ) == null) ? null : aweme2.getRequestId());
        SurveyOption surveyOption = this.LLILLL;
        c2344009Gk.LJ(surveyOption != null ? Long.valueOf(surveyOption.optionId) : null, "enter_method");
        c2344009Gk.LJIIIIZZ("live_enter_type", this.LLJLIL.LIZJ ? "only_entered" : "unentered");
        C1ACA c1acaJQ24 = JQ2();
        if (c1acaJQ24 != null && (aweme = c1acaJQ24.LIZIZ) != null) {
            numValueOf = Integer.valueOf(AwemeBizExtKt.getSessionPosition(aweme));
        }
        c2344009Gk.LJ(numValueOf, "room_position");
        c2344009Gk.LJII(vQ2());
        C1ACA c1acaJQ25 = JQ2();
        c2344009Gk.LJIIIIZZ("is_guest_connection", (c1acaJQ25 == null || (weakReference = c1acaJQ25.LJJLJ) == null || (interfaceC483300IxM = weakReference.get()) == null || interfaceC483300IxM.LIZ() <= 0) ? CardStruct.IStatusCode.DEFAULT : "1");
        C20684815ws.LJIILLIIL("secondary_survey_notify", c2344009Gk.LIZ);
    }

    public PreviewSurveyViewModel() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live_fyp_survey_");
        sbLIZ.append(hashCode());
        this.LLJLILLLLZIIL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJLLIL = -1;
        this.LLJLLL = new MutableLiveData<>();
        this.LLJZ = new MutableLiveData<>();
        this.LLJZIJLIL = new NextLiveData<>();
        this.LLL = new NextLiveData<>();
        this.LLLF = new AwS621S0100000_7(this, 18);
    }

    @Override // X.InterfaceC484910Izx
    public final boolean So() {
        if (HQ2()) {
            SurveyData surveyData = this.LL;
            if (surveyData == null || !surveyData.isReverse) {
                this.LLJZIJLIL.setValue(Boolean.TRUE);
                return true;
            }
            RQ2(false);
            return false;
        }
        C1AC7 c1ac7 = C1AC7.LIZ;
        C1ACA c1acaJQ2 = JQ2();
        SurveyData surveyData2 = this.LL;
        String str = surveyData2 != null ? surveyData2.surveyId : null;
        c1ac7.getClass();
        C1AC7.LJIILLIIL(c1acaJQ2, 9, str, null, null);
        return false;
    }

    @Override // com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel
    public final void reset() {
        SurveyShowMode surveyShowMode;
        super.reset();
        C11JF c11jf = this.LLJJLIIIJLLLLLLLZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJLIL = new C483250IxH();
        this.LLJLLIL = -1;
        this.LLJLLL.setValue(new C483240IxG(EnumC484840Izq.NULL, null, 6));
        SurveyData surveyData = this.LL;
        if (surveyData == null || (surveyShowMode = surveyData.showMode) == null || !surveyShowMode.triggerByCep) {
            return;
        }
        TTMStrategyCenter.getInstance().unRegisterBizCepCallback(this.LLJLILLLLZIIL, "gbl_fyp_light_survey_trigger");
        TTMStrategyCenter.getInstance().unRegisterRule(this.LLJLILLLLZIIL, "gbl_fyp_light_survey_trigger");
        TTMStrategyCenter.getInstance().cleanBizCepRule(this.LLJLILLLLZIIL, "gbl_fyp_light_survey_trigger");
    }

    public final void GQ2(C2344009Gk c2344009Gk) {
        Long lValueOf;
        Long lValueOf2;
        String requestId;
        String aid;
        Integer numValueOf;
        String str;
        String str2;
        Long lValueOf3;
        String str3;
        String str4;
        String str5;
        WeakReference<InterfaceC483300IxM> weakReference;
        InterfaceC483300IxM interfaceC483300IxM;
        List<SurveyOption> list;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        c2344009Gk.LJIIIIZZ("client_ts", String.valueOf(System.currentTimeMillis()));
        c2344009Gk.LIZLLL(UserService.getInstance().user().getCurrentUserId(), "user_id");
        C1ACA c1acaJQ2 = JQ2();
        Integer numValueOf2 = null;
        if (c1acaJQ2 != null && (liveRoomStruct2 = c1acaJQ2.LIZJ) != null) {
            lValueOf = Long.valueOf(liveRoomStruct2.id);
        } else {
            lValueOf = null;
        }
        c2344009Gk.LJ(lValueOf, "room_id");
        C1ACA c1acaJQ22 = JQ2();
        if (c1acaJQ22 != null && (liveRoomStruct = c1acaJQ22.LIZJ) != null) {
            lValueOf2 = Long.valueOf(liveRoomStruct.ownerUserId);
        } else {
            lValueOf2 = null;
        }
        c2344009Gk.LJ(lValueOf2, "author_id");
        C1ACA c1acaJQ23 = JQ2();
        if (c1acaJQ23 != null && (aweme3 = c1acaJQ23.LIZIZ) != null) {
            requestId = aweme3.getRequestId();
        } else {
            requestId = null;
        }
        c2344009Gk.LJIIIIZZ("request_id", requestId);
        C1ACA c1acaJQ24 = JQ2();
        if (c1acaJQ24 != null && (aweme2 = c1acaJQ24.LIZIZ) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        C1ACA c1acaJQ25 = JQ2();
        if (c1acaJQ25 != null && (aweme = c1acaJQ25.LIZIZ) != null) {
            numValueOf = Integer.valueOf(AwemeBizExtKt.getSessionPosition(aweme));
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "room_position");
        SurveyData surveyData = this.LL;
        if (surveyData != null) {
            str = surveyData.surveyId;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("survey_id", str);
        SurveyData surveyData2 = this.LL;
        if (surveyData2 != null) {
            str2 = surveyData2.surveyTag;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("survey_tag", str2);
        SurveyData surveyData3 = this.LL;
        if (surveyData3 != null) {
            lValueOf3 = Long.valueOf(surveyData3.surveyVersion);
        } else {
            lValueOf3 = null;
        }
        c2344009Gk.LJ(lValueOf3, "survey_version");
        SurveyQuestion surveyQuestion = this.LLILLJJLI;
        if (surveyQuestion != null) {
            str3 = surveyQuestion.questionId;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("question_id", str3);
        SurveyQuestion surveyQuestion2 = this.LLILLJJLI;
        if (surveyQuestion2 != null && (list = surveyQuestion2.optionList) != null) {
            numValueOf2 = Integer.valueOf(list.size());
        }
        c2344009Gk.LJ(numValueOf2, "no_of_choice");
        c2344009Gk.LIZJ(C14Z0.LIVE_TYPE.getType(), "survey_biz_type");
        if (this.LLJLIL.LIZJ) {
            str4 = "only_entered";
        } else {
            str4 = "unentered";
        }
        c2344009Gk.LJIIIIZZ("live_enter_type", str4);
        C1ACA c1acaJQ26 = JQ2();
        if (c1acaJQ26 != null && (weakReference = c1acaJQ26.LJJLJ) != null && (interfaceC483300IxM = weakReference.get()) != null && interfaceC483300IxM.LIZ() > 0) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_guest_connection", str5);
        c2344009Gk.LJII(vQ2());
    }

    public final void KQ2(TTMStrategyResult tTMStrategyResult) {
        String str;
        String message;
        String str2;
        if (this.LLJLIL.LJ) {
            return;
        }
        String str3 = null;
        if (tTMStrategyResult.getError() == null && tTMStrategyResult.isSuccess()) {
            C1AC7 c1ac7 = C1AC7.LIZ;
            C1ACA c1acaJQ2 = JQ2();
            SurveyData surveyData = this.LL;
            if (surveyData != null) {
                str2 = surveyData.surveyId;
            } else {
                str2 = null;
            }
            c1ac7.getClass();
            C1AC7.LJIILLIIL(c1acaJQ2, 6, str2, null, null);
            if (HQ2()) {
                C786410Ut5.LJJZZIII(this.LLJL, new ARunnableS107S0100000_7(this, 115));
                return;
            }
            C1ACA c1acaJQ22 = JQ2();
            SurveyData surveyData2 = this.LL;
            if (surveyData2 != null) {
                str3 = surveyData2.surveyId;
            }
            c1ac7.getClass();
            C1AC7.LJIILLIIL(c1acaJQ22, 9, str3, null, null);
            return;
        }
        C1AC7 c1ac72 = C1AC7.LIZ;
        C1ACA c1acaJQ23 = JQ2();
        SurveyData surveyData3 = this.LL;
        if (surveyData3 != null) {
            str = surveyData3.surveyId;
        } else {
            str = null;
        }
        Exception error = tTMStrategyResult.getError();
        if (error != null) {
            message = error.getMessage();
        } else {
            message = null;
        }
        c1ac72.getClass();
        C1AC7.LJIILLIIL(c1acaJQ23, 5, str, null, message);
    }

    public final void MQ2(Map<String, String> map) {
        long j;
        Long lValueOf;
        Long lValueOf2;
        String str;
        SurveyShowMode surveyShowMode;
        SurveyShowMode surveyShowMode2;
        if (this.LLJJIJI <= 0) {
            return;
        }
        this.LLJJIJIIJIL = SystemClock.elapsedRealtime() - this.LLJJIJI;
        C2344009Gk c2344009Gk = new C2344009Gk();
        GQ2(c2344009Gk);
        c2344009Gk.LJII(map);
        c2344009Gk.LJIIIIZZ("survey_page", "primary");
        SurveyData surveyData = this.LL;
        if (surveyData != null && (surveyShowMode2 = surveyData.showMode) != null) {
            j = surveyShowMode2.showDurationMs;
        } else {
            j = 0;
        }
        c2344009Gk.LIZLLL(j, "setting_time");
        c2344009Gk.LIZLLL(this.LLJJIJIIJIL, "primary_stay_time");
        c2344009Gk.LIZLLL(this.LLJJIJIIJIL + this.LLJJJ, "stay_time");
        SurveyOption surveyOption = this.LLILLL;
        Integer numValueOf = null;
        if (surveyOption != null) {
            lValueOf = Long.valueOf(surveyOption.optionId);
        } else {
            lValueOf = null;
        }
        c2344009Gk.LJ(lValueOf, "option_id");
        SurveyOption surveyOption2 = this.LLILLL;
        if (surveyOption2 != null) {
            lValueOf2 = Long.valueOf(surveyOption2.optionId);
        } else {
            lValueOf2 = null;
        }
        c2344009Gk.LJ(lValueOf2, "result");
        SurveyOption surveyOption3 = this.LLILLL;
        if (surveyOption3 != null) {
            numValueOf = Integer.valueOf(surveyOption3.LIZ);
        }
        c2344009Gk.LJ(numValueOf, "position_id_submit_option");
        SurveyData surveyData2 = this.LL;
        if (surveyData2 != null && (surveyShowMode = surveyData2.showMode) != null && surveyShowMode.style == 4) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_emoji", str);
        C20684815ws.LJIILLIIL("exit_survey", c2344009Gk.LIZ);
        LQ2();
        this.LLJJIJI = 0L;
    }

    public final void NQ2(Map<String, String> map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        GQ2(c2344009Gk);
        c2344009Gk.LJII(map);
        C20684815ws.LJIILLIIL("survey_submit_toast_notify", c2344009Gk.LIZ);
    }

    public final void PQ2(String str) {
        String str2;
        String str3;
        String aid;
        Long lValueOf;
        String requestId;
        Long lValueOf2;
        Integer numValueOf;
        String str4;
        String str5;
        WeakReference<InterfaceC483300IxM> weakReference;
        InterfaceC483300IxM interfaceC483300IxM;
        Aweme aweme;
        Aweme aweme2;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme3;
        if (this.LLJLIL.LJI.contains(str)) {
            return;
        }
        this.LLJLIL.LJI.add(str);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJILJIL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        SurveyData surveyData = this.LL;
        Integer numValueOf2 = null;
        if (surveyData != null) {
            str2 = surveyData.surveyId;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("survey_id", str2);
        SurveyData surveyData2 = this.LL;
        if (surveyData2 != null) {
            str3 = surveyData2.surveyTag;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("survey_tag", str3);
        C1ACA c1acaJQ2 = JQ2();
        if (c1acaJQ2 != null && (aweme3 = c1acaJQ2.LIZIZ) != null) {
            aid = aweme3.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        C1ACA c1acaJQ22 = JQ2();
        if (c1acaJQ22 != null && (liveRoomStruct = c1acaJQ22.LIZJ) != null) {
            lValueOf = Long.valueOf(liveRoomStruct.ownerUserId);
        } else {
            lValueOf = null;
        }
        c2344009Gk.LJ(lValueOf, "author_id");
        c2344009Gk.LIZJ(C14Z0.LIVE_TYPE.getType(), "survey_biz_type");
        C1ACA c1acaJQ23 = JQ2();
        if (c1acaJQ23 != null && (aweme2 = c1acaJQ23.LIZIZ) != null) {
            requestId = aweme2.getRequestId();
        } else {
            requestId = null;
        }
        c2344009Gk.LJIIIIZZ("request_id", requestId);
        c2344009Gk.LIZLLL(jElapsedRealtime, "stay_time");
        c2344009Gk.LIZLLL(this.LLJILLL, "secondary_stay_time");
        SurveyOption surveyOption = this.LLILLL;
        if (surveyOption != null) {
            lValueOf2 = Long.valueOf(surveyOption.optionId);
        } else {
            lValueOf2 = null;
        }
        c2344009Gk.LJ(lValueOf2, "enter_method");
        SurveyOption surveyOption2 = this.LLILLL;
        if (surveyOption2 != null) {
            numValueOf = Integer.valueOf(surveyOption2.LIZ);
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "position_id_submit_option");
        c2344009Gk.LJIIIIZZ("exit_method", str);
        Set<SurveySecondQuestion> set = this.LLILZIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
        Iterator<SurveySecondQuestion> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().optionId));
        }
        c2344009Gk.LJIIIIZZ("result", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("extra_field", this.LLIZ);
        if (this.LLJLIL.LIZJ) {
            str4 = "only_entered";
        } else {
            str4 = "unentered";
        }
        c2344009Gk.LJIIIIZZ("live_enter_type", str4);
        C1ACA c1acaJQ24 = JQ2();
        if (c1acaJQ24 != null && (aweme = c1acaJQ24.LIZIZ) != null) {
            numValueOf2 = Integer.valueOf(AwemeBizExtKt.getSessionPosition(aweme));
        }
        c2344009Gk.LJ(numValueOf2, "room_position");
        c2344009Gk.LJII(vQ2());
        C1ACA c1acaJQ25 = JQ2();
        if (c1acaJQ25 != null && (weakReference = c1acaJQ25.LJJLJ) != null && (interfaceC483300IxM = weakReference.get()) != null && interfaceC483300IxM.LIZ() > 0) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_guest_connection", str5);
        C20684815ws.LJIILLIIL("exit_secondary_survey", c2344009Gk.LIZ);
        OQ2();
    }

    public final void QQ2(String str) {
        long j;
        String str2;
        String str3;
        String aid;
        Long lValueOf;
        String requestId;
        Long lValueOf2;
        Integer numValueOf;
        String str4;
        Long lValueOf3;
        Long lValueOf4;
        String str5;
        WeakReference<InterfaceC483300IxM> weakReference;
        InterfaceC483300IxM interfaceC483300IxM;
        Aweme aweme;
        SurveyShowMode surveyShowMode;
        Aweme aweme2;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme3;
        if (!this.LLJLIL.LJFF.contains(str) && this.LLJILJIL > 0) {
            this.LLJLIL.LJFF.add(str);
            BQ2();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJILJIL;
            if (this.LLJJI > 0) {
                j = this.LLJILJILJ;
            } else {
                j = jElapsedRealtime;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            SurveyData surveyData = this.LL;
            Integer numValueOf2 = null;
            if (surveyData != null) {
                str2 = surveyData.surveyId;
            } else {
                str2 = null;
            }
            c2344009Gk.LJIIIIZZ("survey_id", str2);
            SurveyData surveyData2 = this.LL;
            if (surveyData2 != null) {
                str3 = surveyData2.surveyTag;
            } else {
                str3 = null;
            }
            c2344009Gk.LJIIIIZZ("survey_tag", str3);
            C1ACA c1acaJQ2 = JQ2();
            if (c1acaJQ2 != null && (aweme3 = c1acaJQ2.LIZIZ) != null) {
                aid = aweme3.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            C1ACA c1acaJQ22 = JQ2();
            if (c1acaJQ22 != null && (liveRoomStruct = c1acaJQ22.LIZJ) != null) {
                lValueOf = Long.valueOf(liveRoomStruct.ownerUserId);
            } else {
                lValueOf = null;
            }
            c2344009Gk.LJ(lValueOf, "author_id");
            c2344009Gk.LIZJ(C14Z0.LIVE_TYPE.getType(), "survey_biz_type");
            C1ACA c1acaJQ23 = JQ2();
            if (c1acaJQ23 != null && (aweme2 = c1acaJQ23.LIZIZ) != null) {
                requestId = aweme2.getRequestId();
            } else {
                requestId = null;
            }
            c2344009Gk.LJIIIIZZ("request_id", requestId);
            c2344009Gk.LJIIIIZZ("exit_method", str);
            SurveyOption surveyOption = this.LLILLL;
            if (surveyOption != null) {
                lValueOf2 = Long.valueOf(surveyOption.optionId);
            } else {
                lValueOf2 = null;
            }
            c2344009Gk.LJ(lValueOf2, "result");
            SurveyOption surveyOption2 = this.LLILLL;
            if (surveyOption2 != null) {
                numValueOf = Integer.valueOf(surveyOption2.LIZ);
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "position_id_submit_option");
            c2344009Gk.LIZLLL(jElapsedRealtime, "stay_time");
            if (this.LLJLIL.LIZJ) {
                str4 = "only_entered";
            } else {
                str4 = "unentered";
            }
            c2344009Gk.LJIIIIZZ("live_enter_type", str4);
            c2344009Gk.LIZLLL(UserService.getInstance().user().getCurrentUserId(), "user_id");
            SurveyData surveyData3 = this.LL;
            if (surveyData3 != null) {
                lValueOf3 = Long.valueOf(surveyData3.surveyVersion);
            } else {
                lValueOf3 = null;
            }
            c2344009Gk.LJ(lValueOf3, "survey_version");
            SurveyData surveyData4 = this.LL;
            if (surveyData4 != null && (surveyShowMode = surveyData4.showMode) != null) {
                lValueOf4 = Long.valueOf(surveyShowMode.showDurationMs);
            } else {
                lValueOf4 = null;
            }
            c2344009Gk.LJ(lValueOf4, "setting_time");
            C1ACA c1acaJQ24 = JQ2();
            if (c1acaJQ24 != null && (aweme = c1acaJQ24.LIZIZ) != null) {
                numValueOf2 = Integer.valueOf(AwemeBizExtKt.getSessionPosition(aweme));
            }
            c2344009Gk.LJ(numValueOf2, "room_position");
            c2344009Gk.LIZLLL(j, "primary_stay_time");
            c2344009Gk.LJII(vQ2());
            C1ACA c1acaJQ25 = JQ2();
            if (c1acaJQ25 != null && (weakReference = c1acaJQ25.LJJLJ) != null && (interfaceC483300IxM = weakReference.get()) != null && interfaceC483300IxM.LIZ() > 0) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_guest_connection", str5);
            C20684815ws.LJIILLIIL("exit_survey", c2344009Gk.LIZ);
            LQ2();
            if (this.LLJJI > 0) {
                CQ2();
                PQ2(str);
            }
        }
    }

    public final void RQ2(boolean z) {
        String str;
        String str2;
        String aid;
        Long lValueOf;
        String requestId;
        String str3;
        Long lValueOf2;
        Integer numValueOf;
        String str4;
        String str5;
        C1AKK liteService;
        InterfaceC483310IxN interfaceC483310IxNLb;
        String str6;
        C1AKK liteService2;
        InterfaceC483310IxN interfaceC483310IxNLb2;
        WeakReference<InterfaceC483300IxM> weakReference;
        InterfaceC483300IxM interfaceC483300IxM;
        Aweme aweme;
        Aweme aweme2;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme3;
        SurveyData surveyData;
        if (z) {
            this.LLJILJIL = SystemClock.elapsedRealtime();
        }
        C483250IxH c483250IxH = this.LLJLIL;
        if (c483250IxH.LJ) {
            return;
        }
        c483250IxH.LJ = true;
        if (z && (surveyData = this.LL) != null && surveyData.surveyVersion == 3) {
            this.LLJJ = SystemClock.elapsedRealtime();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        SurveyData surveyData2 = this.LL;
        if (surveyData2 != null) {
            str = surveyData2.surveyId;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("survey_id", str);
        SurveyData surveyData3 = this.LL;
        if (surveyData3 != null) {
            str2 = surveyData3.surveyTag;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("survey_tag", str2);
        C1ACA c1acaJQ2 = JQ2();
        if (c1acaJQ2 != null && (aweme3 = c1acaJQ2.LIZIZ) != null) {
            aid = aweme3.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        C1ACA c1acaJQ22 = JQ2();
        if (c1acaJQ22 != null && (liveRoomStruct = c1acaJQ22.LIZJ) != null) {
            lValueOf = Long.valueOf(liveRoomStruct.ownerUserId);
        } else {
            lValueOf = null;
        }
        c2344009Gk.LJ(lValueOf, "author_id");
        c2344009Gk.LIZJ(C14Z0.LIVE_TYPE.getType(), "survey_biz_type");
        C1ACA c1acaJQ23 = JQ2();
        if (c1acaJQ23 != null && (aweme2 = c1acaJQ23.LIZIZ) != null) {
            requestId = aweme2.getRequestId();
        } else {
            requestId = null;
        }
        c2344009Gk.LJIIIIZZ("request_id", requestId);
        if (this.LLJLIL.LIZJ) {
            str3 = "only_entered";
        } else {
            str3 = "unentered";
        }
        c2344009Gk.LJIIIIZZ("live_enter_type", str3);
        c2344009Gk.LIZLLL(UserService.getInstance().user().getCurrentUserId(), "user_id");
        SurveyData surveyData4 = this.LL;
        if (surveyData4 != null) {
            lValueOf2 = Long.valueOf(surveyData4.surveyVersion);
        } else {
            lValueOf2 = null;
        }
        c2344009Gk.LJ(lValueOf2, "survey_version");
        C1ACA c1acaJQ24 = JQ2();
        if (c1acaJQ24 != null && (aweme = c1acaJQ24.LIZIZ) != null) {
            numValueOf = Integer.valueOf(AwemeBizExtKt.getSessionPosition(aweme));
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "room_position");
        c2344009Gk.LJII(vQ2());
        C1ACA c1acaJQ25 = JQ2();
        if (c1acaJQ25 != null && (weakReference = c1acaJQ25.LJJLJ) != null && (interfaceC483300IxM = weakReference.get()) != null && interfaceC483300IxM.LIZ() > 0) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_guest_connection", str4);
        C20684815ws.LJIILLIIL("survey_notify", c2344009Gk.LIZ);
        SurveyData surveyData5 = this.LL;
        if (surveyData5 != null && (str6 = surveyData5.surveyId) != null && (liteService2 = Live.getLiteService()) != null && (interfaceC483310IxNLb2 = liteService2.Lb()) != null) {
            interfaceC483310IxNLb2.LJ(2, str6);
        }
        C1AC7 c1ac7 = C1AC7.LIZ;
        C1ACA c1acaJQ26 = JQ2();
        SurveyData surveyData6 = this.LL;
        if (surveyData6 != null) {
            str5 = surveyData6.surveyId;
        } else {
            str5 = null;
        }
        c1ac7.getClass();
        C1AC7.LJIILLIIL(c1acaJQ26, 10, str5, null, "first");
        SurveyData surveyData7 = this.LL;
        if (surveyData7 != null && (liteService = Live.getLiteService()) != null && (interfaceC483310IxNLb = liteService.Lb()) != null) {
            interfaceC483310IxNLb.LIZ(2, Long.valueOf(surveyData7.surveyVersion), surveyData7.surveyId);
        }
    }

    public final void SQ2(SurveyData surveyData) {
        SurveyData surveyData2;
        String str;
        String str2;
        this.LL = surveyData;
        this.LLILLJJLI = surveyData.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parserSurveyData: surveyVersion=");
        sbLIZ.append(surveyData.surveyVersion);
        sbLIZ.append(", surveyId=");
        sbLIZ.append(surveyData.surveyId);
        C20441214yg.LIZIZ("PreviewSurveyViewModel", C2188811AlT.LIZIZ(sbLIZ));
        long j = surveyData.surveyVersion;
        if (j != 2 && j != 3) {
            if (j != 4 && j != 5) {
                C1AC7 c1ac7 = C1AC7.LIZ;
                C1ACA c1acaJQ2 = JQ2();
                String str3 = surveyData.surveyId;
                c1ac7.getClass();
                C1AC7.LJIILLIIL(c1acaJQ2, 3, str3, null, null);
                return;
            }
            if (this.LLJLIL.LJ || (surveyData2 = this.LL) == null) {
                return;
            }
            SurveyShowMode surveyShowMode = surveyData2.showMode;
            if (surveyShowMode != null && surveyShowMode.triggerByCep && (str = surveyShowMode.cepExpression) != null) {
                if (!TTMStrategyCenter.getInstance().registerBizCepRule(this.LLJLILLLLZIIL, new TTMStrategyRule("gbl_fyp_light_survey_trigger", str, true))) {
                    C1AC7 c1ac72 = C1AC7.LIZ;
                    C1ACA c1acaJQ22 = JQ2();
                    SurveyData surveyData3 = this.LL;
                    if (surveyData3 != null) {
                        str2 = surveyData3.surveyId;
                    } else {
                        str2 = null;
                    }
                    c1ac72.getClass();
                    C1AC7.LJIILLIIL(c1acaJQ22, 4, str2, null, null);
                }
                TTMStrategyCenter.getInstance().registerBizCepCallback(this.LLJLILLLLZIIL, "gbl_fyp_light_survey_trigger", new TTMStrategyRunCallBack() { // from class: X.0IxJ
                    @Override // com.tiktok.strategycenter.TTMStrategyRunCallBack
                    public final void run(TTMStrategyResult tTMStrategyResult) {
                        this.LIZ.KQ2(tTMStrategyResult);
                    }
                });
            }
            C1ACA c1acaJQ23 = JQ2();
            if (c1acaJQ23 == null || !c1acaJQ23.LJII) {
                return;
            }
            TQ2("gbl_survey_did_enter_fyp_live_card");
            return;
        }
        C1AC7 c1ac73 = C1AC7.LIZ;
        C1ACA c1acaJQ24 = JQ2();
        String str4 = surveyData.surveyId;
        c1ac73.getClass();
        C1AC7.LJIILLIIL(c1acaJQ24, 8, str4, null, null);
        this.LLJZ.setValue(Boolean.valueOf(this.LLJLIL.LIZIZ));
    }

    public final void TQ2(String str) {
        boolean z;
        SurveyShowMode surveyShowMode;
        SurveyShowMode surveyShowMode2;
        SurveyShowMode surveyShowMode3;
        SurveyData surveyData = this.LL;
        int i = 0;
        if (surveyData != null && (surveyShowMode3 = surveyData.showMode) != null && surveyShowMode3.triggerByCep) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            HashMap map = new HashMap();
            map.put("name", str);
            TTMStrategyResult tTMStrategyResultSyncProcessBizCepRule = TTMStrategyCenter.getInstance().syncProcessBizCepRule(this.LLJLILLLLZIIL, "gbl_fyp_light_survey_trigger", new TTMParamData((Map<String, Object>) map), System.currentTimeMillis());
            if (Intrinsics.LJFF(str, "gbl_survey_did_enter_fyp_live_card")) {
                KQ2(tTMStrategyResultSyncProcessBizCepRule);
                return;
            }
            return;
        }
        if (surveyData == null || (surveyShowMode = surveyData.showMode) == null || surveyShowMode.cepBackupTriggerType != 7) {
            return;
        }
        String str2 = null;
        if (Intrinsics.LJFF(str, "gbl_survey_did_enter_fyp_live_card")) {
            C1AC7 c1ac7 = C1AC7.LIZ;
            C1ACA c1acaJQ2 = JQ2();
            SurveyData surveyData2 = this.LL;
            if (surveyData2 != null) {
                str2 = surveyData2.surveyId;
            }
            c1ac7.getClass();
            C1AC7.LJIILLIIL(c1acaJQ2, 7, str2, null, null);
            BPEAHandler bPEAHandler = this.LLJL;
            ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 116);
            SurveyData surveyData3 = this.LL;
            if (surveyData3 != null && (surveyShowMode2 = surveyData3.showMode) != null) {
                i = surveyShowMode2.delay;
            }
            C786410Ut5.LJLIIL(((long) i) * 1000, bPEAHandler, aRunnableS107S0100000_7);
            return;
        }
        if (!Intrinsics.LJFF(str, "gbl_survey_did_leave_fyp_live_card")) {
            return;
        }
        this.LLJL.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC484910Izx
    public final void x02(float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScaleProgress: ");
        sbLIZ.append(f);
        C20441214yg.LIZIZ("PreviewSurveyViewModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LLL.setValue(Float.valueOf(f));
    }

    @Override // com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel
    public final void yQ2(Map<String, String> map, boolean z) {
        String str;
        InterfaceC483310IxN interfaceC483310IxNLb;
        InterfaceC483310IxN interfaceC483310IxNLb2;
        C483250IxH c483250IxH = this.LLJLIL;
        if (c483250IxH.LJ) {
            return;
        }
        c483250IxH.LJ = true;
        if (z) {
            this.LLJJIJI = SystemClock.elapsedRealtime();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        GQ2(c2344009Gk);
        c2344009Gk.LJII(map);
        c2344009Gk.LJIIIIZZ("survey_page", "primary");
        C20684815ws.LJIILLIIL("survey_notify", c2344009Gk.LIZ);
        C1AC7 c1ac7 = C1AC7.LIZ;
        C1ACA c1acaJQ2 = JQ2();
        SurveyData surveyData = this.LL;
        if (surveyData != null) {
            str = surveyData.surveyId;
        } else {
            str = null;
        }
        c1ac7.getClass();
        C1AC7.LJIILLIIL(c1acaJQ2, 10, str, null, "first");
        SurveyData surveyData2 = this.LL;
        if (surveyData2 != null) {
            C1AKK liteService = Live.getLiteService();
            if (liteService != null && (interfaceC483310IxNLb2 = liteService.Lb()) != null) {
                interfaceC483310IxNLb2.LJ(2, surveyData2.surveyId);
            }
            C1AKK liteService2 = Live.getLiteService();
            if (liteService2 != null && (interfaceC483310IxNLb = liteService2.Lb()) != null) {
                interfaceC483310IxNLb.LIZ(2, Long.valueOf(surveyData2.surveyVersion), surveyData2.surveyId);
            }
        }
    }

    public final boolean IQ2(String str, boolean z, List list) {
        Boolean boolValueOf;
        Map<String, Object> mapLJII;
        InterfaceC483370IxT interfaceC483370IxTKu;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("filterByTTMNew: filterNeedFeatureKeys=");
        sbLIZ.append(list);
        sbLIZ.append(" isPreCheck=");
        sbLIZ.append(z);
        sbLIZ.append(" alive=");
        C1ACA c1acaJQ2 = JQ2();
        Object data = null;
        if (c1acaJQ2 != null) {
            boolValueOf = Boolean.valueOf(c1acaJQ2.LJFF);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C20441214yg.LIZIZ("PreviewSurveyViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C1ACA c1acaJQ22 = JQ2();
        if (c1acaJQ22 != null && c1acaJQ22.LJFF) {
            TTMCore tTMCore = TTMCore.getInstance();
            if (!tTMCore.isInit()) {
                return false;
            }
            C1AKK liteService = Live.getLiteService();
            if (liteService != null && (interfaceC483370IxTKu = liteService.ku()) != null) {
                mapLJII = interfaceC483370IxTKu.LJII(list, new AwS586S0100000_7(this, 452));
            } else {
                mapLJII = null;
            }
            TTMInput tTMInput = new TTMInput();
            tTMInput.machineCode = str;
            tTMInput.paramType = TTMInput.ParamType.TYPE_MAP;
            tTMInput.paramData = new TTMParamData(mapLJII);
            TTMOutput tTMOutputExecute = tTMCore.execute(tTMInput);
            if (tTMOutputExecute != null) {
                data = tTMOutputExecute.getData();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("filterByTTMNew: params=");
            sbLIZ2.append(mapLJII);
            sbLIZ2.append(", result=");
            sbLIZ2.append(data);
            C20441214yg.LIZIZ("PreviewSurveyViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            return Intrinsics.LJFF(data, Boolean.TRUE);
        }
        C20441214yg.LIZIZ("PreviewSurveyViewModel", "filterByTTMNew: not alive return false");
        return false;
    }
}
