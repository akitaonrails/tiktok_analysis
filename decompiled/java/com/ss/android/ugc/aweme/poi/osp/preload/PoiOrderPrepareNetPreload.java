package com.ss.android.ugc.aweme.poi.osp.preload;

import X.AnonymousClass0957;
import X.C0PEM;
import X.C0X52;
import X.C1186980gzg;
import X.C1499810p8F;
import X.C1697810uHb;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.net.preload.PreloadExtraData;
import com.ss.android.ugc.aweme.poi.osp.preload.PoiOrderSubmitPreloadExp;
import com.ss.android.ugc.aweme.poi.osp.repo.PoiOrderSubmitApi;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderPrepareNetPreload implements InterfaceC727570SgN<PoiOrderSubmitApi, AnonymousClass0957<? extends C0X52<SlashPage>>> {
    public final PreloadExtraData buildPreloadExtraData(Bundle bundle) {
        String string;
        if (bundle == null || (string = bundle.getString("enter_from")) == null) {
            string = "";
        }
        return new PreloadExtraData(false, new PreloadExtraInfo(0, string, string, "/tiktok/poi/slash/v1", C1697810uHb.LJIIJJI("initial_coupon_info", "is_gps_precise", "order_type", "poi_id", Scene.SCENE_SERVICE, "sku_list", "prepare_order_attribute")), false, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject buildPrepareOrderAttribute(android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.osp.preload.PoiOrderPrepareNetPreload.buildPrepareOrderAttribute(android.os.Bundle):org.json.JSONObject");
    }

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return Intrinsics.LJFF(((PoiOrderSubmitPreloadExp.PoiOrderSubmitPreloadConfigModel) PoiOrderSubmitPreloadExp.LIZIZ.getValue()).enable, Boolean.TRUE);
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, Api.LIZ, null, 20000, true, 20);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public AnonymousClass0957<? extends C0X52<SlashPage>> preload2(Bundle bundle, Function1<? super Class<PoiOrderSubmitApi>, ? extends PoiOrderSubmitApi> function1) {
        return C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1186980gzg(bundle, this, function1, null), 3);
    }
}
