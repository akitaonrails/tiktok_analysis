package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service;

import X.C11NZ;
import X.C345060Dfs;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;

/* JADX INFO: loaded from: classes5.dex */
public interface EffectDetailService {
    public static final C345060Dfs LIZ = C345060Dfs.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/sticker/detail/")
    C11NZ<NewFaceStickerListBean> getStickerDetail(@InterfaceC1501070pAH("sticker_ids") String str, @InterfaceC1501070pAH("app_version") String str2);
}
