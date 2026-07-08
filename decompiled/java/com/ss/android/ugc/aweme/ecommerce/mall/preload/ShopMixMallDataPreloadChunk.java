package com.ss.android.ugc.aweme.ecommerce.mall.preload;

import X.C09A1;
import X.C1150504el;
import X.C1499810p8F;
import X.C1515820pY4;
import X.C1515870pY9;
import X.C1584390rKf;
import X.C15O7;
import X.C1741420vPw;
import X.C1767800w6U;
import X.C1767950w6j;
import X.C1769810w9j;
import X.C1770900wBU;
import X.C1771220wC0;
import X.C1771230wC1;
import X.C1771330wCB;
import X.C1771590wCb;
import X.C1772750wET;
import X.C19EG;
import X.C2126308Ur;
import X.C2126408Us;
import X.C2191401Ape;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C2341109Fh;
import X.InterfaceC497601wk;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallApiWithPreload;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.lang.ref.WeakReference;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopMixMallDataPreloadChunk implements InterfaceC727570SgN<ShopMallApiWithPreload, C15O7<C1515820pY4<C1515870pY9<ECMixMallPageDTO>>>> {
    public static final C1771220wC0 Companion = new Object() { // from class: X.0wC0
    };
    public static final C2191401Ape<C1515870pY9<ECMixMallPageDTO>> chunkPreloadCacheManager;
    public static final InterfaceC497601wk preloadScope;

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0wC0] */
    static {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C2126408Us c2126408Us = C2126308Ur.LIZ;
        preloadScope = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, c2126408Us));
        chunkPreloadCacheManager = new C2191401Ape<>(C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), c2126408Us)));
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        int i;
        if (bundle != null && bundle.containsKey("preload_expire_time")) {
            i = bundle.getInt("preload_expire_time");
        } else {
            i = 30000;
        }
        return new C1499810p8F(true, "https://oec-api.tiktokv.com/", null, i, false, 24);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public C15O7<C1515820pY4<C1515870pY9<ECMixMallPageDTO>>> preload2(Bundle bundle, Function1<? super Class<ShopMallApiWithPreload>, ? extends ShopMallApiWithPreload> function1) {
        String string;
        String string2;
        C19EG c19eg;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("MixMall ClickPreload RealStartPreload");
        C1772750wET c1772750wETLJIJI = C1770900wBU.LIZ.LJIJI();
        if (c1772750wETLJIJI != null) {
            c1772750wETLJIJI.LJJIJL = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - C1150504el.LIZ().LJJII;
        C1767950w6j.LIZ.getClass();
        C1767950w6j.LJIJI(jCurrentTimeMillis);
        PreloadExtraInfo preloadExtraInfo = null;
        if (bundle != null) {
            string = bundle.getString("preload_api_source");
        } else {
            string = null;
        }
        String strLIZJ = C1767800w6U.LIZJ();
        if (strLIZJ == null) {
            if (bundle != null) {
                strLIZJ = bundle.getString("previous_page");
            } else {
                strLIZJ = null;
            }
        }
        C1771330wCB c1771330wCB = ShopMallApiWithPreload.LIZ;
        String str = "";
        if (bundle != null) {
            String string3 = bundle.getString("diversion_params", "");
            if (string3 != null) {
                str = string3;
            }
            string2 = bundle.getString("mall_extra_info");
        } else {
            string2 = null;
        }
        ShopMixMallDataPreload.Companion.getClass();
        C1771590wCb c1771590wCbLIZ = C1771230wC1.LIZ(string);
        c1771330wCB.getClass();
        n nVarLIZLLL = C1771330wCB.LIZLLL(str, string2, strLIZJ, c1771590wCbLIZ, null);
        n nVar = new n();
        nVar.LJJIII(Integer.valueOf(C1584390rKf.LIZ()), "position");
        C1769810w9j.LIZ.getClass();
        if (!C1769810w9j.LIZJ()) {
            WeakReference<C19EG> weakReference = ShopMixMallDataPreload.activityRef;
            if (weakReference != null) {
                c19eg = weakReference.get();
            } else {
                c19eg = null;
            }
            nVar.LJJIII(Integer.valueOf(C1584390rKf.LIZIZ(c19eg)), "index");
        }
        nVarLIZLLL.LJJIFFI("shop_tab_params", nVar);
        if (c1772750wETLJIJI != null) {
            c1772750wETLJIJI.LJJIJLIJ = System.currentTimeMillis();
            c1772750wETLJIJI.LJJJ = nVarLIZLLL;
        }
        C1741420vPw.LIZ.getClass();
        C1741420vPw.LIZ();
        if (bundle != null && bundle.containsKey("preload_key")) {
            preloadExtraInfo = new PreloadExtraInfo(-1, null, strLIZJ, "api/v1/mall/homepage/bff/get", Collections.singletonList("preload_key"));
        }
        return function1.invoke(ShopMallApiWithPreload.class).getShopBffStreamData(C1771330wCB.LJI(), nVarLIZLLL, C1771330wCB.LIZJ(bundle), preloadExtraInfo);
    }
}
