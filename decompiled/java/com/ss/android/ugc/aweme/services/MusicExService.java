package com.ss.android.ugc.aweme.services;

import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicExService implements IMusicExService {
    public static final MusicExService INSTANCE = new MusicExService();
    public final /* synthetic */ IMusicExService $$delegate_0;

    @Override // com.ss.android.ugc.aweme.services.IMusicExService
    public Object getMusicDetailPageStoryEntrance(String str, String str2, String str3, int i, int i2, InterfaceC1364105Vn<? super MusicEntranceResult> interfaceC1364105Vn) {
        return this.$$delegate_0.getMusicDetailPageStoryEntrance(str, str2, str3, i, i2, interfaceC1364105Vn);
    }

    public MusicExService() {
        IMusicExService iMusicExService = (IMusicExService) PluggableExtentionKt.pluggableSpi$default(IMusicExService.class, false, false, false, 14, null);
        if (iMusicExService != null) {
            this.$$delegate_0 = iMusicExService;
        } else {
            "no impl for IMusicExService".toString();
            throw new IllegalStateException("no impl for IMusicExService");
        }
    }
}
