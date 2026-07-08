package com.ss.android.ugc.aweme.feed.survey.frequency;

import X.C14Z0;
import X.C14ZG;
import X.C14ZW;
import X.C15438062q;
import X.C20291314aV;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import com.ss.android.ugc.aweme.feed.survey.ISurveyFrequencyService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class ISurveyFrequncyServiceImpl implements ISurveyFrequencyService {
    @Override // com.ss.android.ugc.aweme.feed.survey.ISurveyFrequencyService
    public final List<String> LIZ() {
        String str;
        C20291314aV.LIZ.getClass();
        C14ZW.LIZ.getClass();
        Collection<C14ZG> collectionValues = C14ZW.LIZIZ.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            List<Integer> list = ((C14ZG) obj).LJI.multiSurveyTypes;
            if (list != null && list.contains(Integer.valueOf(C14Z0.PROFILE_TYPE.getType()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            C14ZG c14zg = (C14ZG) obj2;
            C20291314aV c20291314aV = C20291314aV.LIZ;
            FeedSurveyConfig feedSurveyConfig = c14zg.LJI;
            c20291314aV.getClass();
            if (!C20291314aV.LJIIJ(feedSurveyConfig) && !C20291314aV.LJI(c14zg) && !C20291314aV.LJFF(c14zg)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            FeedSurvey feedSurvey = ((C14ZG) it3.next()).LIZIZ;
            if (feedSurvey != null && (str = feedSurvey.surveyKey) != null) {
                arrayList4.add(str);
            }
        }
        return arrayList4;
    }
}
