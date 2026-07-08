package com.ss.android.ugc.aweme.ad.feed.utils;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C2188811AlT;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RepetitiveVideoQuestionnaireService implements IRepetitiveVideoQuestionnaireService {
    public final String LIZ = "daily_feed_item_count";
    public final String LIZIZ = "last_count_date";
    public final String LIZJ = "last_questionnaire_show_time";
    public final String LIZLLL = "last_questionnaire_feedback_time";
    public final SimpleDateFormat LJ = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    public final Keva LJFF = Keva.getRepo("commerce_repetitive_video_questionnaire");
    public final Map<String, Boolean> LJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final void LIZLLL() {
        this.LJFF.storeLong(LJIIIIZZ(this.LIZLLL), System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final void LJ() {
        this.LJFF.storeLong(LJIIIIZZ(this.LIZJ), System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final int LJII() {
        String str = this.LJ.format(new Date());
        String strLJIIIIZZ = LJIIIIZZ(this.LIZ);
        if (Intrinsics.LJFF(this.LJFF.getString(LJIIIIZZ(this.LIZIZ), ""), str)) {
            return this.LJFF.getInt(strLJIIIIZZ, 0);
        }
        return 0;
    }

    public static String LJIIIIZZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final boolean LIZ(long j) {
        long j2 = this.LJFF.getLong(LJIIIIZZ(this.LIZJ), 0L);
        if (j2 <= 0 || System.currentTimeMillis() - j2 > j) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final boolean LIZIZ(long j) {
        long j2 = this.LJFF.getLong(LJIIIIZZ(this.LIZLLL), 0L);
        if (j2 <= 0 || System.currentTimeMillis() - j2 > j) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final void LIZJ(Aweme aweme) {
        String str = this.LJ.format(new Date());
        String strLJIIIIZZ = LJIIIIZZ(this.LIZ);
        String strLJIIIIZZ2 = LJIIIIZZ(this.LIZIZ);
        if (!Intrinsics.LJFF(this.LJFF.getString(strLJIIIIZZ2, ""), str)) {
            this.LJFF.storeString(strLJIIIIZZ2, str);
            this.LJFF.storeInt(strLJIIIIZZ, 1);
        } else {
            this.LJFF.storeInt(strLJIIIIZZ, this.LJFF.getInt(strLJIIIIZZ, 0) + 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final boolean LJFF(String str) {
        Boolean bool;
        if (str == null || (bool = (Boolean) ((LinkedHashMap) this.LJI).get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final void LJI(String str) {
        this.LJI.put(str, Boolean.TRUE);
    }
}
