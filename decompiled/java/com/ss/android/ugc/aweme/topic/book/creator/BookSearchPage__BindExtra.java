package com.ss.android.ugc.aweme.topic.book.creator;

import X.C2041307z9;
import X.C2188811AlT;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class BookSearchPage__BindExtra {
    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public BookSearchPage__BindExtra(BookSearchPage bookSearchPage, Intent intent) {
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null) {
            Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "selected_book_ids");
            if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get != null) {
                if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
                    bookSearchPage.LLIZ = (String) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expecting ");
                    sbLIZ.append(String.class);
                    sbLIZ.append(" but get ");
                    sbLIZ.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get.getClass());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "selected_book_max_count");
            if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2 != null) {
                if (!(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2 instanceof Integer)) {
                    if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2 instanceof String) {
                        objINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2 = C2041307z9.LIZ(Integer.class, (String) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Expecting ");
                        sbLIZ2.append(Integer.class);
                        sbLIZ2.append(" but get ");
                        sbLIZ2.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2.getClass());
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                bookSearchPage.LLIZLLLIL = ((Number) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2).intValue();
            }
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_aweme_topic_book_creator_BookSearchPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
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
