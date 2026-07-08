package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.cache;

import X.C01GW;
import X.C09CT;
import X.C13LF;
import X.C2188811AlT;
import X.C452501pT;
import android.util.LruCache;
import com.google.gson.h;
import com.google.gson.n;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class LiveExposedProductsCache {
    public static final LiveExposedProductsCache LIZ = new LiveExposedProductsCache();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(55));

    public static n LIZIZ(String str, String str2) {
        if (str2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        RelatedProductInfo relatedProductInfo = (RelatedProductInfo) ((LruCache) LIZIZ.getValue()).get(str);
        if (relatedProductInfo != null) {
            n nVar = new n();
            nVar.LJJIIJ("room_id", relatedProductInfo.roomId);
            nVar.LJJIIJ("author_id", relatedProductInfo.authorId);
            h hVar = new h();
            Iterator<String> it2 = relatedProductInfo.expoProductIdList.iterator();
            while (it2.hasNext()) {
                hVar.LJJIII(it2.next());
            }
            nVar.LJJIFFI("expo_product_id_list", hVar);
            h hVar2 = new h();
            Iterator<String> it3 = relatedProductInfo.clickProductIdList.iterator();
            while (it3.hasNext()) {
                hVar2.LJJIII(it3.next());
            }
            nVar.LJJIFFI("click_product_id_list", hVar2);
            return nVar;
        }
        return null;
    }

    public static void LIZ(String str, String str2, Function1 function1) {
        String strLIZIZ;
        if (str2 == null) {
            strLIZIZ = str;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C01GW c01gw = LIZIZ;
        Object obj = ((LruCache) c01gw.getValue()).get(strLIZIZ);
        if (obj != null) {
            function1.invoke(obj);
            return;
        }
        RelatedProductInfo relatedProductInfo = new RelatedProductInfo(str, str2, new C13LF(50), new C13LF(50));
        function1.invoke(relatedProductInfo);
        ((LruCache) c01gw.getValue()).put(strLIZIZ, relatedProductInfo);
    }

    public static final class RelatedProductInfo {

        @C09CT("author_id")
        public final String authorId;

        @C09CT("click_product_id_list")
        public final C13LF<String> clickProductIdList;

        @C09CT("expo_product_id_list")
        public final C13LF<String> expoProductIdList;

        @C09CT("room_id")
        public final String roomId;

        public RelatedProductInfo(String str, String str2, C13LF<String> c13lf, C13LF<String> c13lf2) {
            this.roomId = str;
            this.authorId = str2;
            this.expoProductIdList = c13lf;
            this.clickProductIdList = c13lf2;
        }
    }
}
