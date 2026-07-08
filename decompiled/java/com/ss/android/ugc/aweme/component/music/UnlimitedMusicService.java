package com.ss.android.ugc.aweme.component.music;

import X.AnonymousClass1544;
import X.C04TD;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.music.service.IUnlimitedMusicService;

/* JADX INFO: loaded from: classes32.dex */
public final class UnlimitedMusicService implements IUnlimitedMusicService {
    public static IUnlimitedMusicService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IUnlimitedMusicService.class, false);
        if (objLIZ != null) {
            return (IUnlimitedMusicService) objLIZ;
        }
        if (C04TD.LLLLLLIL == null) {
            synchronized (IUnlimitedMusicService.class) {
                if (C04TD.LLLLLLIL == null) {
                    C04TD.LLLLLLIL = new UnlimitedMusicService();
                }
            }
        }
        return C04TD.LLLLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IUnlimitedMusicService
    public final Object LIZ(int i, InterfaceC1364105Vn interfaceC1364105Vn) {
        return AnonymousClass1544.LIZ.LIZ(i, 12, interfaceC1364105Vn);
    }
}
