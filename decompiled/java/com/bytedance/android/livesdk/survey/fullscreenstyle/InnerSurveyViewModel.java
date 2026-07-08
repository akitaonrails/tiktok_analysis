package com.bytedance.android.livesdk.survey.fullscreenstyle;

import X.C0IHW;
import X.C0IJT;
import X.C0IK2;
import X.C0IR5;
import X.C0IUA;
import X.C0IXL;
import X.C1087000eOQ;
import X.C13LP;
import X.C15438062q;
import X.C2188811AlT;
import X.C474500IjA;
import X.C483410IxX;
import X.C924810aAp;
import X.EnumC482970Iwp;
import android.os.SystemClock;
import com.bytedance.android.livesdk.SwipeNextEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public final class InnerSurveyViewModel extends SurveyViewModel {
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final NextLiveData<SurveyData> LLJLIL = new NextLiveData<>();
    public final NextLiveData<Boolean> LLJLILLLLZIIL = new NextLiveData<>();
    public C0IHW LLJLL;

    @Override // com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel
    public final void EQ2() {
        Room room;
        if (this.LLILLJJLI == null || this.LLILLL == null || this.LLIZLLLIL) {
            return;
        }
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            this.LLJ = room.getId();
        }
        FQ2();
    }

    public final void HQ2() {
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
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_survey_change_final_answer_click");
        GQ2(c474500IjALIZ);
        c474500IjALIZ.LJIIIIZZ();
        Set<SurveyOption> set2 = this.LLILZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(set2, 10));
        Iterator<SurveyOption> it3 = set2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(it3.next().optionId));
        }
        c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62), "option_id_list");
        c474500IjALIZ.LIZ();
    }

    public final void IQ2() {
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
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_survey_change_final_answer_click");
        GQ2(c474500IjALIZ);
        c474500IjALIZ.LJIIIIZZ();
        Set<SurveySecondQuestion> set3 = this.LLILZLL;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(set3, 10));
        Iterator<SurveySecondQuestion> it4 = set3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Long.valueOf(it4.next().optionId));
        }
        c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62), "secondary_option_id_list");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel
    public final void wQ2() {
        StringBuffer stringBuffer = new StringBuffer();
        for (SurveySecondQuestion surveySecondQuestion : this.LLILZIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(surveySecondQuestion.optionId);
            sbLIZ.append(',');
            stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LLILZIL.size() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_survey_go_back_first_option");
        c474500IjALIZ.LJIJJLI(getDataChannel());
        c474500IjALIZ.LJJII(this.LLJIJIL, "action_type");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJI), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJ), "room_id");
        SurveyData surveyData = this.LL;
        c474500IjALIZ.LJJII(surveyData != null ? surveyData.surveyId : null, "survey_id");
        SurveyData surveyData2 = this.LL;
        c474500IjALIZ.LJJII(surveyData2 != null ? surveyData2.surveyTag : null, "survey_tag");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(Integer.valueOf(w.LJIJJLI()), "room_position");
        SurveyQuestion surveyQuestion = this.LLILLJJLI;
        c474500IjALIZ.LJJII(surveyQuestion != null ? surveyQuestion.questionId : null, "question_id");
        SurveyOption surveyOption = this.LLILLL;
        c474500IjALIZ.LJJII(Long.valueOf(surveyOption != null ? surveyOption.optionId : 0L), "option_id");
        c474500IjALIZ.LJJII(stringBuffer.toString(), "secondary_option_id");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel
    public final void xQ2() {
        KQ2("secondary");
    }

    @Override // com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel
    public final void AQ2() {
        JQ2("secondary", SystemClock.elapsedRealtime() - this.LLJILJIL, EnumC482970Iwp.BACK);
        IQ2();
    }

    @Override // com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel
    public final void DQ2() {
        Room room;
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            this.LLJ = room.getId();
        }
        FQ2();
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 != null) {
            dataChannel2.zW(SwipeNextEvent.class, Long.valueOf(this.LLJ));
        }
        this.LLJLILLLLZIIL.setValue(Boolean.TRUE);
    }

    public final void GQ2(C474500IjA c474500IjA) {
        String str;
        String str2;
        Long lValueOf;
        String str3;
        String str4;
        List<SurveyOption> list;
        c474500IjA.LJJII(Long.valueOf(System.currentTimeMillis()), "client_ts");
        SurveyData surveyData = this.LL;
        Integer numValueOf = null;
        if (surveyData != null) {
            str = surveyData.surveyId;
        } else {
            str = null;
        }
        c474500IjA.LJJII(str, "survey_id");
        SurveyData surveyData2 = this.LL;
        if (surveyData2 != null) {
            str2 = surveyData2.surveyTag;
        } else {
            str2 = null;
        }
        c474500IjA.LJJII(str2, "survey_tag");
        SurveyData surveyData3 = this.LL;
        if (surveyData3 != null) {
            lValueOf = Long.valueOf(surveyData3.surveyVersion);
        } else {
            lValueOf = null;
        }
        c474500IjA.LJJII(lValueOf, "survey_version");
        SurveyQuestion surveyQuestion = this.LLILLJJLI;
        if (surveyQuestion != null) {
            str3 = surveyQuestion.questionId;
        } else {
            str3 = null;
        }
        c474500IjA.LJJII(str3, "question_id");
        SurveyQuestion surveyQuestion2 = this.LLILLJJLI;
        if (surveyQuestion2 != null && (list = surveyQuestion2.optionList) != null) {
            numValueOf = Integer.valueOf(list.size());
        }
        c474500IjA.LJJII(numValueOf, "no_of_choice");
        w.LIZ.getClass();
        c474500IjA.LJJII(w.LIZLLL(), "action_type");
        c474500IjA.LJJII(Integer.valueOf(w.LJIJJLI()), "room_position");
        c474500IjA.LJJII(w.LJIJI(), "request_id");
        C924810aAp c924810aApLJ = C924810aAp.LJ();
        if (c924810aApLJ != null && c924810aApLJ.LJJII > 0) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjA.LJJII(str4, "is_guest_connection");
        c474500IjA.LJJIIZI(vQ2());
    }

    public final void KQ2(String str) {
        String str2;
        String str3;
        String str4;
        Integer numValueOf;
        String str5;
        String str6;
        String str7;
        List<SurveyOption> list;
        int size;
        List<SurveySecondQuestion> list2;
        List<SurveyOption> list3;
        C0IR5 c0ir5;
        long id;
        String str8;
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null && (c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class)) != null) {
            Room room = c0ir5.LIZIZ;
            long jLongValue = 0;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            this.LLJ = id;
            Long l = c0ir5.LIZLLL;
            if (l != null) {
                jLongValue = l.longValue();
            }
            this.LLJI = jLongValue;
            C0IXL c0ixl = c0ir5.LJFF;
            if (c0ixl == null || (str8 = c0ixl.LJFF) == null) {
                str8 = "";
            }
            this.LLJIJIL = str8;
        }
        DataChannel dataChannel2 = getDataChannel();
        SurveyData surveyData = this.LL;
        Long lValueOf = null;
        if (surveyData != null) {
            str2 = surveyData.surveyId;
        } else {
            str2 = null;
        }
        C0IK2.LIZ(dataChannel2, 10, str2, null, "first");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_survey_notify");
        c474500IjALIZ.LJIJJLI(getDataChannel());
        c474500IjALIZ.LJJII(this.LLJIJIL, "action_type");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJI), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJ), "room_id");
        SurveyData surveyData2 = this.LL;
        if (surveyData2 != null) {
            str3 = surveyData2.surveyId;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "survey_id");
        SurveyData surveyData3 = this.LL;
        if (surveyData3 != null) {
            str4 = surveyData3.surveyTag;
        } else {
            str4 = null;
        }
        c474500IjALIZ.LJJII(str4, "survey_tag");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        SurveyQuestion surveyQuestion = this.LLILLJJLI;
        if (surveyQuestion != null && (list3 = surveyQuestion.optionList) != null) {
            numValueOf = Integer.valueOf(list3.size());
        } else {
            numValueOf = null;
        }
        c474500IjALIZ.LJJII(numValueOf, "no_of_choice");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(Integer.valueOf(w.LJIJJLI()), "room_position");
        SurveyQuestion surveyQuestion2 = this.LLILLJJLI;
        if (surveyQuestion2 != null) {
            str5 = surveyQuestion2.questionId;
        } else {
            str5 = null;
        }
        c474500IjALIZ.LJJII(str5, "question_id");
        c474500IjALIZ.LJJII("full_screen", "survey_format");
        SurveyData surveyData4 = this.LL;
        if (surveyData4 != null) {
            lValueOf = Long.valueOf(surveyData4.surveyVersion);
        }
        c474500IjALIZ.LJJII(lValueOf, "survey_version");
        C924810aAp c924810aApLJ = C924810aAp.LJ();
        int i = 0;
        if (c924810aApLJ != null && c924810aApLJ.LJJII > 0) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str6, "is_guest_connection");
        SurveyData surveyData5 = this.LL;
        if (surveyData5 != null && surveyData5.surveyVersion == 3) {
            SurveyQuestion surveyQuestion3 = this.LLILLJJLI;
            if (surveyQuestion3 != null && (list = surveyQuestion3.optionList) != null) {
                i = 0;
                for (SurveyOption surveyOption : list) {
                    if (surveyOption != null && (list2 = surveyOption.secondList) != null) {
                        size = list2.size();
                    } else {
                        size = 0;
                    }
                    i += size;
                }
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i), "no_of_secondary_choice");
        }
        c474500IjALIZ.LJJII(str, "survey_page");
        c474500IjALIZ.LJJIIZI(vQ2());
        c474500IjALIZ.LIZ();
        SurveyData surveyData6 = this.LL;
        if (surveyData6 != null && (str7 = surveyData6.surveyId) != null) {
            C483410IxX.LIZ.LJ(4, str7);
        }
    }

    @Override // com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel
    public final void yQ2(Map<String, String> map, boolean z) {
        String str;
        if (z) {
            this.LLJJIJI = SystemClock.elapsedRealtime();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_survey_notify");
        GQ2(c474500IjALIZ);
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII("primary", "survey_page");
        c474500IjALIZ.LIZ();
        DataChannel dataChannel = getDataChannel();
        SurveyData surveyData = this.LL;
        if (surveyData != null) {
            str = surveyData.surveyId;
        } else {
            str = null;
        }
        C0IK2.LIZ(dataChannel, 10, str, null, "first");
        SurveyData surveyData2 = this.LL;
        if (surveyData2 != null) {
            C483410IxX c483410IxX = C483410IxX.LIZ;
            c483410IxX.LJ(4, surveyData2.surveyId);
            c483410IxX.LIZ(4, Long.valueOf(surveyData2.surveyVersion), surveyData2.surveyId);
        }
    }

    public final void JQ2(String str, long j, EnumC482970Iwp enumC482970Iwp) {
        String str2;
        String str3;
        Integer numValueOf;
        String method;
        long j2;
        Integer numValueOf2;
        String str4;
        boolean z;
        List<SurveyOption> list;
        int size;
        List<SurveySecondQuestion> list2;
        List<SurveyOption> list3;
        HashMap map = new HashMap();
        String str5 = null;
        C0IUA.LIZIZ(null, map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exit_survey");
        c474500IjALIZ.LJIJJLI(getDataChannel());
        c474500IjALIZ.LJJII(this.LLJIJIL, "action_type");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJI), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJ), "room_id");
        SurveyData surveyData = this.LL;
        if (surveyData != null) {
            str2 = surveyData.surveyId;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "survey_id");
        SurveyData surveyData2 = this.LL;
        if (surveyData2 != null) {
            str3 = surveyData2.surveyTag;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "survey_tag");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        SurveyQuestion surveyQuestion = this.LLILLJJLI;
        if (surveyQuestion != null && (list3 = surveyQuestion.optionList) != null) {
            numValueOf = Integer.valueOf(list3.size());
        } else {
            numValueOf = null;
        }
        c474500IjALIZ.LJJII(numValueOf, "no_of_choice");
        c474500IjALIZ.LJJII(Long.valueOf(j), "stay_time");
        if (enumC482970Iwp != null) {
            method = enumC482970Iwp.getMethod();
        } else {
            method = null;
        }
        c474500IjALIZ.LJJII(method, "exit_method");
        SurveyOption surveyOption = this.LLILLL;
        if (surveyOption != null) {
            j2 = surveyOption.optionId;
        } else {
            j2 = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j2), "option_id");
        SurveyOption surveyOption2 = this.LLILLL;
        if (surveyOption2 != null) {
            numValueOf2 = Integer.valueOf(surveyOption2.LIZ);
        } else {
            numValueOf2 = null;
        }
        c474500IjALIZ.LJJII(numValueOf2, "position_id_submit_option");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(Integer.valueOf(w.LJIJJLI()), "room_position");
        SurveyQuestion surveyQuestion2 = this.LLILLJJLI;
        if (surveyQuestion2 != null) {
            str5 = surveyQuestion2.questionId;
        }
        c474500IjALIZ.LJJII(str5, "question_id");
        c474500IjALIZ.LJJII("full_screen", "survey_format");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(str, "survey_page");
        C924810aAp c924810aApLJ = C924810aAp.LJ();
        int i = 0;
        if (c924810aApLJ != null && c924810aApLJ.LJJII > 0) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str4, "is_guest_connection");
        c474500IjALIZ.LJJIIZI(vQ2());
        SurveyData surveyData3 = this.LL;
        if (surveyData3 != null && surveyData3.surveyVersion == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            SurveyQuestion surveyQuestion3 = this.LLILLJJLI;
            if (surveyQuestion3 != null && (list = surveyQuestion3.optionList) != null) {
                i = 0;
                for (SurveyOption surveyOption3 : list) {
                    if (surveyOption3 != null && (list2 = surveyOption3.secondList) != null) {
                        size = list2.size();
                    } else {
                        size = 0;
                    }
                    i += size;
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (SurveySecondQuestion surveySecondQuestion : this.LLILZIL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(surveySecondQuestion.optionId);
                sbLIZ.append(',');
                stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (this.LLILZIL.size() > 0) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i), "no_of_secondary_choice");
            c474500IjALIZ.LJJII(Long.valueOf(this.LLJILJILJ), "primary_stay_time");
            c474500IjALIZ.LJJII(Long.valueOf(this.LLJILLL), "secondary_stay_time_total");
            c474500IjALIZ.LJJII(Long.valueOf(this.LLJJIII), "secondary_stay_time");
            c474500IjALIZ.LJJII(stringBuffer.toString(), "secondary_option_id");
            c474500IjALIZ.LJJII(this.LLIZ, "secondary_text_content");
        } else {
            c474500IjALIZ.LJJII(Long.valueOf(j), "primary_stay_time");
        }
        c474500IjALIZ.LIZ();
    }
}
