package com.ss.android.ugc.aweme.service;

import X.C0N0Y;
import X.C19633411rg;
import X.C19633511rh;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.components.video.playbox.IVideoPlayService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.video.IPlayerManagerService;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes30.dex */
public final class VideoPlayService implements IVideoPlayService {
    @Override // com.ss.android.ugc.aweme.components.video.playbox.IVideoPlayService
    public final C0N0Y LIZ() {
        C19633411rg c19633411rg = C19633511rh.LIZ;
        if (((LinkedList) c19633411rg.LIZ).size() >= 8) {
            C0N0Y c0n0y = (C0N0Y) ListProtector.get(c19633411rg.LIZ, ((LinkedList) r1).size() - 1);
            c0n0y.LJJIIJZLJL();
            c0n0y.release();
            ListProtector.remove(c19633411rg.LIZ, ((LinkedList) r1).size() - 1);
        }
        IPlayerManagerService iPlayerManagerService = (IPlayerManagerService) PluggableExtentionKt.pluggableSpi(IPlayerManagerService.class);
        if (iPlayerManagerService == null) {
            return null;
        }
        C0N0Y c0n0yLIZLLL = iPlayerManagerService.LIZLLL();
        if (c0n0yLIZLLL != null) {
            ((LinkedList) c19633411rg.LIZ).add(c0n0yLIZLLL);
        }
        return c0n0yLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.components.video.playbox.IVideoPlayService
    public final C0N0Y LIZJ() {
        IPlayerManagerService iPlayerManagerService = (IPlayerManagerService) PluggableExtentionKt.pluggableSpi$default(IPlayerManagerService.class, false, false, false, 14, null);
        if (iPlayerManagerService != null) {
            return iPlayerManagerService.LIZLLL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.components.video.playbox.IVideoPlayService
    public final void LIZIZ(Context context, String str, boolean z, String str2, String str3, float f) {
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (iMainService != null) {
            iMainService.startVideoPlayActivity(context, str, "", z, str2, str3, "hybrid", "", f);
        }
    }
}
