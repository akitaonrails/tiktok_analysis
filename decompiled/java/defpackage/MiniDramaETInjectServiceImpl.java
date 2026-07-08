package defpackage;

import X.C1606610ruV;
import X.C20684815ws;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaETInjectServiceImpl implements MiniDramaETInjectService {
    @Override // com.ss.android.ugc.aweme.service.MiniDramaETInjectService
    public final boolean LIZ(Long l) {
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ != null && miniDramaCacheServiceLIZ.LIZ(l)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaETInjectService
    public final boolean LIZIZ(Long l) {
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ != null && miniDramaCacheServiceLIZ.LIZIZ(l)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaETInjectService
    public final void onEventV3(String str, Map<String, String> map) {
        C20684815ws.LJIILLIIL(str, map);
    }
}
