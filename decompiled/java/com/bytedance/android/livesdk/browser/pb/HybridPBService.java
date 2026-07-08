package com.bytedance.android.livesdk.browser.pb;

import X.C01GW;
import X.C1075480e5q;
import X.C1075530e5v;
import X.C1532680pzG;
import X.C1532950pzh;
import X.C1533850q19;
import X.C1535630q41;
import com.bytedance.android.live.browser.IHybridPBService;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveDynamicPbDefinitionSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LivePBDynamicPreloadConfigSetting;
import com.bytedance.forest.model.RequestParams;
import com.tiktok.forestx.RequestParamsX;
import kotlin.jvm.internal.AwS602S0100000_23;

/* JADX INFO: loaded from: classes24.dex */
public class HybridPBService implements IHybridPBService {
    @Override // com.bytedance.android.live.browser.IHybridPBService
    public final void ux1() {
        LiveDynamicPbDefinitionSetting.PbDefinitionItem[] value;
        if (LivePBDynamicPreloadConfigSetting.INSTANCE.getValue() != 1) {
            return;
        }
        C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
        C1533850q19 c1533850q19 = (C1533850q19) C1075530e5v.LIZIZ().LIZIZ(C1533850q19.class, "live");
        if (c1533850q19 == null || (value = LiveDynamicPbDefinitionSetting.getValue()) == null) {
            return;
        }
        for (LiveDynamicPbDefinitionSetting.PbDefinitionItem pbDefinitionItem : value) {
            if (C1535630q41.LJJIII) {
                C1532680pzG.LIZ.getClass();
                C1532950pzh c1532950pzh = C1532680pzG.LJJ;
                String str = pbDefinitionItem.url;
                RequestParamsX requestParamsX = new RequestParamsX(null, null, 3, null);
                requestParamsX.source = "HybridPB";
                c1532950pzh.LIZ(str, requestParamsX, new AwS602S0100000_23(pbDefinitionItem, 18));
            } else {
                c1533850q19.fetchResourceAsyncIfNeed(pbDefinitionItem.url, new RequestParams(null, 1, null), new AwS602S0100000_23(pbDefinitionItem, 19));
            }
        }
    }
}
