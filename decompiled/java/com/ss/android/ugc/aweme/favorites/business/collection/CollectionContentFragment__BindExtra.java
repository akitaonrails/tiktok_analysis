package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C2041307z9;
import X.C2188811AlT;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes19.dex */
public final class CollectionContentFragment__BindExtra {
    public static final int $stable = 0;

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public CollectionContentFragment__BindExtra(CollectionContentFragment collectionContentFragment, Intent intent) {
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null) {
            Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "collection_id");
            if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get != null) {
                if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
                    collectionContentFragment.LLJ = (String) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expecting ");
                    sbLIZ.append(String.class);
                    sbLIZ.append(" but get ");
                    sbLIZ.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get.getClass());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "enter_from");
            if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2 != null) {
                if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2 instanceof String) {
                    collectionContentFragment.LLJI = (String) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2;
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Expecting ");
                    sbLIZ2.append(String.class);
                    sbLIZ2.append(" but get ");
                    sbLIZ2.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get2.getClass());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get3 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "showAddVideosCount");
            if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get3 != null) {
                if (!(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get3 instanceof Integer)) {
                    if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get3 instanceof String) {
                        objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get3 = C2041307z9.LIZ(Integer.class, (String) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get3);
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Expecting ");
                        sbLIZ3.append(Integer.class);
                        sbLIZ3.append(" but get ");
                        sbLIZ3.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get3.getClass());
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
                collectionContentFragment.LLJIJIL = (Integer) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get3;
            }
            Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get4 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "collectionCount");
            if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get4 != null) {
                if (!(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get4 instanceof Integer)) {
                    if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get4 instanceof String) {
                        objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get4 = C2041307z9.LIZ(Integer.class, (String) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get4);
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Expecting ");
                        sbLIZ4.append(Integer.class);
                        sbLIZ4.append(" but get ");
                        sbLIZ4.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get4.getClass());
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
                collectionContentFragment.LLJILJIL = ((Number) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get4).intValue();
            }
            Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get5 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "cover_url");
            if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get5 != null) {
                if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get5 instanceof String) {
                    collectionContentFragment.LLJILJILJ = (String) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get5;
                } else {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Expecting ");
                    sbLIZ5.append(String.class);
                    sbLIZ5.append(" but get ");
                    sbLIZ5.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get5.getClass());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ5));
                }
            }
            Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get6 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "enter_type");
            if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get6 != null) {
                if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get6 instanceof String) {
                    collectionContentFragment.LLJILLL = (String) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get6;
                    return;
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("Expecting ");
                sbLIZ6.append(String.class);
                sbLIZ6.append(" but get ");
                sbLIZ6.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get6.getClass());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ6));
            }
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_collection_CollectionContentFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
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
