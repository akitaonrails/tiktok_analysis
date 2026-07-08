package com.ss.android.ugc.aweme.feed.preload;

import X.AnonymousClass0716;
import X.C0CCZ;
import X.C0VZ0;
import X.C281520B1q;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.media.MediaCodecList;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class PreloadMediaCodecListTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreloadMediaCodecListTask";
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return ((Boolean) AnonymousClass0716.LJJI.getValue()).booleanValue();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return C281520B1q.LIZ ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            new MediaCodecList(1).getCodecInfos();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
