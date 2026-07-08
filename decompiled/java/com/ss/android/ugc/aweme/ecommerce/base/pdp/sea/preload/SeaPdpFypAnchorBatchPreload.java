package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.preload;

import X.AnonymousClass0956;
import X.C04TD;
import X.C09AE;
import X.C1018703yb;
import X.C1326790kdB;
import X.C1334210kp9;
import X.C13LQ;
import X.C1743690vTb;
import X.C1743870vTt;
import X.C23250099c;
import X.C259800zU;
import X.C312701Jd;
import X.C817503Hh;
import X.EnumC1769850w9n;
import Y.ARunnableS34S0400000_26;
import Y.ARunnableS35S0300000_2;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra.EcSeaPdpPreloadSettings;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService;
import com.ss.android.ugc.aweme.ecommerce.service.ISeaPdpFypAnchorPrefetchService;
import com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS570S0100000_26;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpFypAnchorBatchPreload implements ISeaPdpFypAnchorPrefetchService {
    public final ConcurrentHashMap<String, C1743870vTt> LIZ = new ConcurrentHashMap<>();

    public static ISeaPdpFypAnchorPrefetchService LIZJ() {
        Object objLIZ = C04TD.LIZ(ISeaPdpFypAnchorPrefetchService.class, false);
        if (objLIZ != null) {
            return (ISeaPdpFypAnchorPrefetchService) objLIZ;
        }
        if (C04TD.LLLZZIL == null) {
            synchronized (ISeaPdpFypAnchorPrefetchService.class) {
                if (C04TD.LLLZZIL == null) {
                    C04TD.LLLZZIL = new SeaPdpFypAnchorBatchPreload();
                }
            }
        }
        return C04TD.LLLZZIL;
    }

    public static void LJ(String str) {
        int iLJIJ = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIJ();
        String strLJFF = C1743690vTb.LJFF(iLJIJ, iLJIJ, str);
        C1334210kp9.LIZIZ(strLJFF, EnumC1769850w9n.VIDEO_MULTI_ANCHOR, null, null, false, false, null, null);
        C1326790kdB.LIZ.getClass();
        C1326790kdB.LIZLLL(strLJFF).LJJII(null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.ISeaPdpFypAnchorPrefetchService
    public final void LIZ(String str) throws JSONException {
        C1743870vTt c1743870vTtRemove = this.LIZ.remove(str);
        if (c1743870vTtRemove != null) {
            C09AE c09ae = c1743870vTtRemove.LIZIZ;
            if (c09ae != null && !c09ae.isCompleted()) {
                int i = c1743870vTtRemove.LIZJ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Scene.SCENE_SERVICE, "tt_anchor_prefetch");
                jSONObject.put("source_page_type", "video");
                jSONObject.put("is_success", 0);
                jSONObject.put("cancel_cnt", i);
                jSONObject.put("prefetch_cnt", i);
                jSONObject.put("success_cnt", 0);
                C1018703yb.LJFF("rd_ec_pdp_prefetch", jSONObject);
            }
            C09AE c09ae2 = c1743870vTtRemove.LIZ;
            if (c09ae2 != null) {
                c09ae2.LIZIZ(null);
            }
            C09AE c09ae3 = c1743870vTtRemove.LIZIZ;
            if (c09ae3 != null) {
                c09ae3.LIZIZ(null);
            }
        }
    }

    public static void LIZLLL(List list, int[] iArr) {
        IPdpPreviewService iPdpPreviewService = (IPdpPreviewService) ServiceManager.get().getService(IPdpPreviewService.class);
        List<Integer> listLJJLJ = C13LQ.LJJLJ(iArr);
        boolean zLJI = MethodIDManager.LJI(137963);
        iPdpPreviewService.LIZ(list, listLJJLJ, null, null, "video");
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.ISeaPdpFypAnchorPrefetchService
    public final void LIZIZ(String str, Aweme aweme, List<String> list, List<String> list2, View view, boolean z) {
        boolean z2;
        AnonymousClass0956 anonymousClass0956LIZLLL;
        if (this.LIZ.get(str) == null) {
            EcSeaPdpPreloadSettings.EcSeaPdpPreloadModel ecSeaPdpPreloadModel = EcSeaPdpPreloadSettings.LIZIZ;
            int i = ecSeaPdpPreloadModel.enableAnchorApiPreload;
            if (i != 1) {
                if (i != 2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = z;
            }
            int i2 = ecSeaPdpPreloadModel.enableAnchorImagePreload;
            if (i2 != 1) {
                if (i2 != 2) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (!z2 && !z) {
                return;
            }
            AnonymousClass0956 anonymousClass0956LIZLLL2 = null;
            if (z) {
                anonymousClass0956LIZLLL = C23250099c.LIZLLL(C817503Hh.LL, null, null, new C312701Jd(0L, new AwS570S0100000_26(new ARunnableS35S0300000_2((Object) view, (Activity) list2, (C259800zU<ECAsyncInflaterV2>) this, (Lifecycle) 5), 1307), null), 3);
            } else {
                anonymousClass0956LIZLLL = null;
            }
            if (z2) {
                anonymousClass0956LIZLLL2 = C23250099c.LIZLLL(C817503Hh.LL, null, null, new C312701Jd(ecSeaPdpPreloadModel.anchorApiPreloadDuration, new AwS570S0100000_26(new ARunnableS34S0400000_26(view, list, this, aweme, 0), 1308), null), 3);
            }
            this.LIZ.put(str, new C1743870vTt(anonymousClass0956LIZLLL, anonymousClass0956LIZLLL2, ((ArrayList) list).size()));
        }
    }
}
