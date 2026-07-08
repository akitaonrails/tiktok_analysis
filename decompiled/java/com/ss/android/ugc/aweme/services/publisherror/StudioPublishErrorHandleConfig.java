package com.ss.android.ugc.aweme.services.publisherror;

import X.C0C64;
import X.C0CHQ;
import X.C13LQ;
import X.C1434650nR9;
import X.C1E1B;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.content.res.Resources;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes23.dex */
public final class StudioPublishErrorHandleConfig {
    public static final StudioPublishErrorHandleConfig INSTANCE = new StudioPublishErrorHandleConfig();
    public static final ConcurrentHashMap<String, Integer> i18nStringResIdCache = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Integer> i18nPluralsResIdCache = new ConcurrentHashMap<>();

    public final List<PublishErrorHandleModel> getPublishErrorHandleListFromAB() {
        return C13LQ.LJJLL((Object[]) C1E1B.LIZIZ.getValue());
    }

    public final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_publish_error_handle_enabled", true, true);
    }

    public final String buildPublishErrorMatchKey(C1434650nR9 c1434650nR9) {
        String stage;
        if (c1434650nR9 == null || (stage = c1434650nR9.getStage()) == null || a0.LJJJIL(stage)) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(stage);
        sbLIZ.append(':');
        sbLIZ.append(c1434650nR9.getOriginErrorCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String resolveI18nText(Context context, String str, Integer num) {
        Integer numPutIfAbsent;
        Integer numPutIfAbsent2;
        if (str != null && !a0.LJJJIL(str)) {
            Resources resources = C0CHQ.LIZ.getResources();
            if (num != null) {
                ConcurrentHashMap<String, Integer> concurrentHashMap = i18nPluralsResIdCache;
                Integer numValueOf = concurrentHashMap.get(str);
                if (numValueOf == null && (numPutIfAbsent2 = concurrentHashMap.putIfAbsent(str, (numValueOf = Integer.valueOf(C786410Ut5.n3(resources, str, "plurals", context.getPackageName()))))) != null) {
                    numValueOf = numPutIfAbsent2;
                }
                Integer num2 = numValueOf;
                if (num2 == null || num2.intValue() != 0) {
                    return resources.getQuantityString(num2.intValue(), num.intValue(), num);
                }
            }
            ConcurrentHashMap<String, Integer> concurrentHashMap2 = i18nStringResIdCache;
            Integer numValueOf2 = concurrentHashMap2.get(str);
            if (numValueOf2 == null && (numPutIfAbsent = concurrentHashMap2.putIfAbsent(str, (numValueOf2 = Integer.valueOf(C786410Ut5.n3(resources, str, "string", context.getPackageName()))))) != null) {
                numValueOf2 = numPutIfAbsent;
            }
            Integer num3 = numValueOf2;
            if (num3 != null && num3.intValue() == 0) {
                return str;
            }
            return context.getString(num3.intValue());
        }
        return null;
    }

    public final PublishErrorHandleModel findErrorHandle(List<PublishErrorHandleModel> list, String str, String str2, int i) {
        String lowerCase;
        PublishErrorHandleModel publishErrorHandleModel = null;
        if (list.isEmpty()) {
            return null;
        }
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        for (PublishErrorHandleModel publishErrorHandleModel2 : list) {
            PublishErrorHandleModel publishErrorHandleModel3 = publishErrorHandleModel2;
            List<String> list2 = publishErrorHandleModel3.regions;
            if (list2 != null && !list2.isEmpty()) {
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<String> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (u.LJIJI(it2.next(), lowerCase2, true)) {
                        }
                    }
                }
            }
            List<Integer> list3 = publishErrorHandleModel3.awemeTypes;
            if (list3 == null || list3.isEmpty()) {
                List<String> list4 = publishErrorHandleModel3.errors;
                if (list4 == null || list4.isEmpty() || (str2 != null && (lowerCase = str2.toLowerCase(Locale.ROOT)) != null && list4.contains(lowerCase))) {
                    List<Integer> list5 = publishErrorHandleModel3.retryCount;
                    if (list5 != null && list5.size() == 2) {
                        int iIntValue = ((Number) ListProtector.get(list5, 0)).intValue();
                        int iIntValue2 = ((Number) ListProtector.get(list5, 1)).intValue();
                        if (i < iIntValue || i > iIntValue2) {
                        }
                    }
                    publishErrorHandleModel = publishErrorHandleModel2;
                    break;
                }
            }
        }
        return publishErrorHandleModel;
    }
}
