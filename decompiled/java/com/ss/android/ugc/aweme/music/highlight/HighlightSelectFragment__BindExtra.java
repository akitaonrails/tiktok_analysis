package com.ss.android.ugc.aweme.music.highlight;

import X.C2188811AlT;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightSelectFragment__BindExtra {
    public static final int $stable = 0;

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public HighlightSelectFragment__BindExtra(HighlightSelectFragment highlightSelectFragment, Intent intent) {
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null) {
            Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "user_id");
            if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get != null) {
                if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
                    highlightSelectFragment.LLIZLLLIL = (String) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expecting ");
                    sbLIZ.append(String.class);
                    sbLIZ.append(" but get ");
                    sbLIZ.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get.getClass());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "sec_user_id");
            if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2 != null) {
                if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2 instanceof String) {
                    highlightSelectFragment.LLJ = (String) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2;
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Expecting ");
                    sbLIZ2.append(String.class);
                    sbLIZ2.append(" but get ");
                    sbLIZ2.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2.getClass());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get3 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "highlighted_music_id");
            if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get3 != null) {
                if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get3 instanceof String) {
                    highlightSelectFragment.LLJI = (String) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get3;
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Expecting ");
                    sbLIZ3.append(String.class);
                    sbLIZ3.append(" but get ");
                    sbLIZ3.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get3.getClass());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get4 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "shoot_from");
            if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get4 != null) {
                if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get4 instanceof String) {
                    highlightSelectFragment.LLJIJIL = (String) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get4;
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Expecting ");
                sbLIZ4.append(String.class);
                sbLIZ4.append(" but get ");
                sbLIZ4.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get4.getClass());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_aweme_music_highlight_HighlightSelectFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}
