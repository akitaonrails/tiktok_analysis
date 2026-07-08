package com.bytedance.android.livesdk.survey.fullscreenstyle;

import X.C0UO0;
import X.C13LP;
import X.C15438062q;
import X.C19748512Ol;
import X.C2188811AlT;
import X.C480460Ism;
import X.C482980Iwq;
import X.C766270U4b;
import android.os.SystemClock;
import com.bytedance.android.livesdk.survey.api.SurveyApi;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySubmitContent;
import com.bytedance.android.livesdk.survey.model.SurveySubmitRequest;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class SurveyViewModel extends LiveWidgetViewModel {
    public SurveyData LL;
    public SurveyQuestion LLILLJJLI;
    public SurveyOption LLILLL;
    public boolean LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public long LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public long LLJJ;
    public long LLJJI;
    public long LLJJIII;
    public long LLJJIJI;
    public long LLJJIJIIJIL;
    public long LLJJIJIL;
    public long LLJJJ;
    public final Set<SurveyOption> LLILZ = new LinkedHashSet();
    public final Set<SurveySecondQuestion> LLILZIL = new LinkedHashSet();
    public final Set<SurveySecondQuestion> LLILZLL = new LinkedHashSet();
    public String LLIZ = "";
    public String LLJIJIL = "";
    public int LLJJJIL = -1;
    public int LLJJJJ = -1;
    public final Set<Long> LLJJJJJIL = new LinkedHashSet();
    public final Map<Long, String> LLJJJJLIIL = new LinkedHashMap();

    public void AQ2() {
    }

    public abstract void DQ2();

    public abstract void EQ2();

    public final void FQ2() {
        String str;
        SurveySubmitRequest surveySubmitRequest;
        String str2;
        String str3;
        String str4;
        this.LLIZLLLIL = true;
        SurveyData surveyData = this.LL;
        Long lValueOf = surveyData != null ? Long.valueOf(surveyData.surveyVersion) : null;
        String str5 = "";
        if (lValueOf == null || !(lValueOf.longValue() == 3 || lValueOf.longValue() == 5)) {
            C482980Iwq c482980Iwq = new C482980Iwq();
            c482980Iwq.LIZ = this.LLJ;
            SurveyData surveyData2 = this.LL;
            if (surveyData2 == null || (str = surveyData2.surveyId) == null) {
                str = "";
            }
            c482980Iwq.LIZIZ = str;
            SurveyQuestion surveyQuestion = this.LLILLJJLI;
            if (surveyQuestion != null && (str2 = surveyQuestion.questionId) != null) {
                str5 = str2;
            }
            SurveyOption surveyOption = this.LLILLL;
            ((ArrayList) c482980Iwq.LIZJ).add(new SurveySubmitContent(str5, surveyOption != null ? surveyOption.optionId : 0L));
            surveySubmitRequest = new SurveySubmitRequest(c482980Iwq.LIZ, c482980Iwq.LIZIZ, GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, c482980Iwq.LIZJ));
        } else {
            C482980Iwq c482980Iwq2 = new C482980Iwq();
            c482980Iwq2.LIZ = this.LLJ;
            SurveyData surveyData3 = this.LL;
            if (surveyData3 == null || (str3 = surveyData3.surveyId) == null) {
                str3 = "";
            }
            c482980Iwq2.LIZIZ = str3;
            SurveyQuestion surveyQuestion2 = this.LLILLJJLI;
            if (surveyQuestion2 != null && (str4 = surveyQuestion2.questionId) != null) {
                str5 = str4;
            }
            SurveyOption surveyOption2 = this.LLILLL;
            long j = surveyOption2 != null ? surveyOption2.optionId : 0L;
            Set<SurveySecondQuestion> set = this.LLILZIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
            Iterator<SurveySecondQuestion> it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().optionId));
            }
            List listLLIIII = C13LP.LLIIII(arrayList);
            String str6 = this.LLIZ;
            StringBuilder sb = new StringBuilder();
            Iterator it3 = listLLIIII.iterator();
            while (it3.hasNext()) {
                sb.append(it3.next());
                sb.append(",");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            ((ArrayList) c482980Iwq2.LIZJ).add(new SurveySubmitContent(str5, j, sb.toString(), str6));
            surveySubmitRequest = new SurveySubmitRequest(c482980Iwq2.LIZ, c482980Iwq2.LIZIZ, GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, c482980Iwq2.LIZJ));
        }
        C480460Ism.LIZ().getClass();
        SurveyApi surveyApi = (SurveyApi) C480460Ism.LIZLLL(SurveyApi.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("room_id", Long.valueOf(surveySubmitRequest.roomId));
        map.put("survey_id", surveySubmitRequest.surveyId);
        map.put("content", surveySubmitRequest.content);
        surveyApi.submit(map).LJIILIIL(new C0UO0()).LJJLJ();
        SurveyData surveyData4 = this.LL;
        C766270U4b.LJIIJJI(surveyData4 != null ? surveyData4.feedBack : null);
    }

    public void reset() {
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ.clear();
        this.LLILZIL.clear();
        this.LLILZLL.clear();
        this.LLIZ = "";
        this.LLIZLLLIL = false;
        this.LLJ = 0L;
        this.LLJI = 0L;
        this.LLJIJIL = "";
        this.LLJILJIL = 0L;
        this.LLJILJILJ = 0L;
        this.LLJILLL = 0L;
        this.LLJJ = 0L;
        this.LLJJI = 0L;
        this.LLJJIJI = 0L;
        this.LLJJIJIIJIL = 0L;
        this.LLJJIJIL = 0L;
        this.LLJJJ = 0L;
    }

    public void wQ2() {
    }

    public void xQ2() {
    }

    public abstract void yQ2(Map<String, String> map, boolean z);

    public final void BQ2() {
        if (this.LLJJ != 0) {
            this.LLJILJILJ += SystemClock.elapsedRealtime() - this.LLJJ;
            this.LLJJ = 0L;
        }
    }

    public final void CQ2() {
        if (this.LLJJI != 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.LLJILLL;
            long j2 = this.LLJJI;
            this.LLJILLL = j + (jElapsedRealtime - j2);
            this.LLJJIII = jElapsedRealtime - j2;
            this.LLJJI = 0L;
        }
    }

    public final Map<String, String> vQ2() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = this.LLJJJIL;
        if (i >= 0) {
            linkedHashMap.put("maintitle_fully_displayed", String.valueOf(i));
        }
        int i2 = this.LLJJJJ;
        if (i2 >= 0) {
            linkedHashMap.put("subtitle_fully_displayed", String.valueOf(i2));
        }
        linkedHashMap.put("option_fully_displayed", this.LLJJJJJIL.isEmpty() ? "all_good" : this.LLJJJJJIL.toString());
        Map<Long, String> map = this.LLJJJJLIIL;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            String str = (String) entry.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(jLongValue);
            sbLIZ.append(':');
            sbLIZ.append(str);
            sbLIZ.append(';');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        linkedHashMap.put("position_id", sb.toString());
        return linkedHashMap;
    }
}
