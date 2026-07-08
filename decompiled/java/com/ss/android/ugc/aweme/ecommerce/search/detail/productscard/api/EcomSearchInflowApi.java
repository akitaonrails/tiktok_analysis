package com.ss.android.ugc.aweme.ecommerce.search.detail.productscard.api;

import X.AbstractC2126608Uu;
import X.C01GW;
import X.C1ER1;
import X.C452501pT;
import X.C644550PPx;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcomSearchInflowApi {
    public static final String LIZ = C1ER1.LIZIZ.LJIILJJIL();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(71));

    public interface RealApi {
        @InterfaceC1501240pAY("/aweme/v1/search/inflow_ecom/")
        @InterfaceC1485505rh
        ListenableFuture<EcomSearchMixFeedList> searchInflow(@InterfaceC1501100pAK("search_id") String str, @InterfaceC1501100pAK("inner_search_id") String str2, @InterfaceC1501100pAK("offset") int i, @InterfaceC1501100pAK("count") int i2, @InterfaceC1501100pAK("keyword") String str3, @InterfaceC1501100pAK("search_source") String str4, @InterfaceC1501100pAK("inner_flow_context") String str5, @InterfaceC1501100pAK("backtrace") String str6, @InterfaceC1501100pAK("search_channel") String str7, @InterfaceC1501100pAK("user_rt_acts") String str8, @InterfaceC1501100pAK("ecom_user_actions") String str9, @InterfaceC1501100pAK("consume_infos") String str10, @InterfaceC1501100pAK("enter_from") String str11);
    }

    public static EcomSearchMixFeedList LIZ(C644550PPx c644550PPx) {
        try {
            return ((RealApi) LIZIZ.getValue()).searchInflow(c644550PPx.LIZJ, c644550PPx.LIZLLL, c644550PPx.LIZIZ, 6, c644550PPx.LIZ, c644550PPx.LJ, c644550PPx.LJFF, c644550PPx.LJI, c644550PPx.LJII, c644550PPx.LJIIIIZZ, c644550PPx.LJIIIZ, c644550PPx.LJIIJ, c644550PPx.LJIIJJI).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }
}
