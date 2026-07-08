package com.ss.android.ugc.aweme.ecommerce.mall.pad;

import X.C1771910wD7;
import com.ss.android.ugc.aweme.ecommerce.pad.IEcMallPadService;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMallPadService implements IEcMallPadService {
    @Override // com.ss.android.ugc.aweme.ecommerce.pad.IEcMallPadService
    public final boolean LIZ() {
        Integer num;
        return ((Number) C1771910wD7.LIZLLL.getValue()).intValue() == 1 && (num = C1771910wD7.LIZIZ().enableApiSparkInterceptor) != null && num.intValue() == 1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pad.IEcMallPadService
    public final List<String> LIZIZ() {
        List<String> list = C1771910wD7.LIZIZ().allowSparkChannelList;
        return list == null ? Collections.singletonList("tiktok_ecommerce_mall_channel_runtime") : list;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pad.IEcMallPadService
    public final boolean LIZJ() {
        return C1771910wD7.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pad.IEcMallPadService
    public final boolean LIZLLL() {
        Integer num;
        return C1771910wD7.LIZJ() == 1 && (num = C1771910wD7.LIZIZ().enableMultiFeeds) != null && num.intValue() == 1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pad.IEcMallPadService
    public final int isPad() {
        return C1771910wD7.LIZJ();
    }
}
