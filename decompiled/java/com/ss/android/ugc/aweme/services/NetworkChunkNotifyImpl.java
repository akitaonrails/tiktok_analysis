package com.ss.android.ugc.aweme.services;

import X.C1205320hTG;
import X.C1494600ozq;
import X.C1954807lC;
import X.EnumC1515750pXx;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.INetworkChunkNotify;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.ec.rax.impl.IEcRaxService;
import com.ss.android.ugc.aweme.offline.thor.IThorService;
import java.net.URL;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkChunkNotifyImpl implements INetworkChunkNotify {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1515750pXx.values().length];
            try {
                iArr[EnumC1515750pXx.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[EnumC1515750pXx.FAST_CHUNK.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.ss.android.ugc.aweme.app.api.INetworkChunkNotify
    public void onChunkDataStreamFinish(Object obj, byte[] bArr, String str, C1494600ozq<?> c1494600ozq, EnumC1515750pXx enumC1515750pXx) {
        URL url;
        String path;
        int i = WhenMappings.$EnumSwitchMapping$0[enumC1515750pXx.ordinal()];
        if (i != 1) {
            if (i == 2) {
                IEcRaxService iEcRaxService = (IEcRaxService) PluggableExtentionKt.pluggableSpi$default(IEcRaxService.class, false, false, false, 14, null);
                if (iEcRaxService != null) {
                    iEcRaxService.isOpen();
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        IThorService iThorService = (IThorService) PluggableExtentionKt.pluggableSpi$default(IThorService.class, false, false, false, 14, null);
        if (iThorService != null) {
            iThorService.isOpen();
        }
        C1205320hTG c1205320hTG = C1205320hTG.LIZIZ;
        if (!c1205320hTG.LJIIJ() || c1494600ozq == null || (url = c1494600ozq.LJIIZILJ) == null || (path = url.getPath()) == null || !c1205320hTG.LIZLLL(path)) {
            return;
        }
        c1205320hTG.LJI(obj, new String(bArr, Charset.forName(str)));
    }
}
