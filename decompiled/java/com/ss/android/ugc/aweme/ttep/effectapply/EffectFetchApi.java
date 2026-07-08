package com.ss.android.ugc.aweme.ttep.effectapply;

import X.C15O7;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.modeo.ttep.moderation.PreviewMaterials;

/* JADX INFO: loaded from: classes32.dex */
public interface EffectFetchApi {
    @InterfaceC1501160pAQ("/api/internal/preview_materials")
    C15O7<PreviewMaterials> fetchTTEPMaterials();

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/api/app/effect_meta")
    C15O7<EffectFetchApiResBean> getEffectMeta(@InterfaceC1501050pAF("effect_id") String str, @InterfaceC1501050pAF("sdk_version") String str2, @InterfaceC1501050pAF("device_platform") String str3);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/api/internal/effect_meta")
    C15O7<EffectFetchApiResBean> getEffectMetaWithoutLogin(@InterfaceC1501050pAF("effect_id") String str, @InterfaceC1501050pAF("sdk_version") String str2, @InterfaceC1501050pAF("device_platform") String str3);
}
