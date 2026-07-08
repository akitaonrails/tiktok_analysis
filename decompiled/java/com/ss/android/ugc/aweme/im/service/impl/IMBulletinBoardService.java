package com.ss.android.ugc.aweme.im.service.impl;

import X.C214824195i;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.service.IIMBulletinBoardService;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: loaded from: classes22.dex */
public final class IMBulletinBoardService implements IIMBulletinBoardService {
    @Override // com.ss.android.ugc.aweme.im.service.service.IIMBulletinBoardService
    public final boolean e0() {
        return C214824195i.LIZIZ.e0();
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMBulletinBoardService
    public final boolean f0(String str) {
        if (str == null || !u.LJJIIJZLJL(str, "bulletin", false)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMBulletinBoardService
    public final Object LLZZJLIL(String str, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return C214824195i.LIZIZ.LLZZJLIL(str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMBulletinBoardService
    public final void d0(Aweme aweme, Map<String, String> map) {
        C214824195i.LIZIZ.d0(aweme, map);
    }
}
