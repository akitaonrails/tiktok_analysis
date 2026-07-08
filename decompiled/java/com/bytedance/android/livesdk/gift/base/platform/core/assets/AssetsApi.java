package com.bytedance.android.livesdk.gift.base.platform.core.assets;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.gift.assets.AssetsListResult;

/* JADX INFO: loaded from: classes.dex */
public interface AssetsApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/assets/effects/")
    C11NZ<C470590Icr<AssetsListResult>> getAssetsPost(@InterfaceC1501050pAF("download_assets_from") int i, @InterfaceC1501050pAF("room_id") Long l, @InterfaceC1501050pAF("bytevc1") int i2, @InterfaceC1501050pAF("video_types") String str, @InterfaceC1501050pAF("effect_ids") String str2, @InterfaceC1501050pAF("es_version") String str3, @InterfaceC1501050pAF("is_preloading") Boolean bool, @InterfaceC1501050pAF("anchor_id") Long l2, @InterfaceC1501050pAF("available_device_storage") Long l3, @InterfaceC1501050pAF("network_condition") Integer num);
}
