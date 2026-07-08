package com.ss.android.ugc.aweme.poi.detail.container.slash.api;

import X.C080U;
import X.C0X52;
import X.C11NZ;
import X.C1515820pY4;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiDetailSlashApi {
    @InterfaceC1501160pAQ("/tiktok/poi/slash/v1")
    C11NZ<C0X52<SlashPage>> requestSlash(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str, @InterfaceC1501070pAH("slash_param") String str2, @InterfaceC1501070pAH("service_type") String str3, @InterfaceC1501070pAH("source_merchant_ids") List<String> list, @InterfaceC1501070pAH("source_product_ids") List<String> list2, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2174808fa List<C080U> list3);

    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    C11NZ<C0X52<C1515820pY4<SlashPage>>> requestSlashByChunk(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str2, @InterfaceC1501070pAH("slash_param") String str3, @InterfaceC1501070pAH("service_type") String str4, @InterfaceC1501070pAH("source_merchant_ids") List<String> list, @InterfaceC1501070pAH("source_product_ids") List<String> list2, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2174808fa List<C080U> list3, @InterfaceC2177008fw Object obj);

    @InterfaceC1501160pAQ
    C11NZ<C0X52<SlashPage>> requestSlashFirstFresh(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str2, @InterfaceC1501070pAH("slash_param") String str3, @InterfaceC1501070pAH("service_type") String str4, @InterfaceC1501070pAH("source_merchant_ids") List<String> list, @InterfaceC1501070pAH("source_product_ids") List<String> list2, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2174808fa List<C080U> list3, @InterfaceC2177008fw Object obj);

    @InterfaceC1501160pAQ
    Object requestSlashLite(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str2, @InterfaceC1501070pAH("slash_param") String str3, @InterfaceC1501070pAH("service_type") String str4, @InterfaceC1501070pAH("source_merchant_ids") List<String> list, @InterfaceC1501070pAH("source_product_ids") List<String> list2, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2174808fa List<C080U> list3, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super C0X52<SlashPage>> interfaceC1364105Vn);
}
