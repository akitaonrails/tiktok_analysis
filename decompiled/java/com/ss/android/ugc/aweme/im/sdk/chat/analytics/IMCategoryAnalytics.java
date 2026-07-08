package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.C0Y8T;
import X.C0Y8Y;
import X.C882340YjQ;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.analytics.IIMCategoryAnalytics;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMCategoryAnalytics implements IIMCategoryAnalytics {
    public static final IMCategoryAnalytics LIZ = new IMCategoryAnalytics();

    public static final class Service implements IIMCategoryAnalytics {
        public final /* synthetic */ IMCategoryAnalytics LIZ = IMCategoryAnalytics.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMCategoryAnalytics
        public final String LIZ(C0Y8T c0y8t) {
            return this.LIZ.LIZ(c0y8t);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMCategoryAnalytics
    public final String LIZ(C0Y8T c0y8t) {
        String str;
        Map<String, String> ext;
        Map<String, String> ext2;
        if (c0y8t == null) {
            return "-1";
        }
        if (C882340YjQ.LJ(c0y8t)) {
            return "1";
        }
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        String str2 = null;
        if (coreInfo != null && (ext2 = coreInfo.getExt()) != null) {
            str = ext2.get("stranger");
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            C0Y8Y coreInfo2 = c0y8t.getCoreInfo();
            if (coreInfo2 != null && (ext = coreInfo2.getExt()) != null) {
                str2 = ext.get("filtered");
            }
            if (!Intrinsics.LJFF(str2, CardStruct.IStatusCode.DEFAULT)) {
                return "-1";
            }
            return "2";
        }
        return "2";
    }
}
