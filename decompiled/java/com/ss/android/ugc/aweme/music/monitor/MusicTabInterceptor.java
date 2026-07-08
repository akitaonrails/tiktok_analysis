package com.ss.android.ugc.aweme.music.monitor;

import X.C080U;
import X.C0X52;
import X.C0XIR;
import X.C1494590ozp;
import X.C2175508fh;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicBaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class MusicTabInterceptor implements InterfaceC1904907d9 {
    public final String LIZ(C0X52<?> c0x52) {
        List<C080U> listLIZIZ;
        String str;
        C2175508fh c2175508fh;
        if (c0x52 != null && (c2175508fh = c0x52.LIZ) != null) {
            listLIZIZ = c2175508fh.LIZIZ("X-Tt-Logid");
        } else {
            listLIZIZ = null;
        }
        if (listLIZIZ == null || listLIZIZ.size() <= 0 || (str = ((C080U) ListProtector.get(listLIZIZ, 0)).LIZIZ) == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        MusicBaseResponse musicBaseResponse;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        C0X52 c0x52LIZ = c1494590ozp.LIZ(c1494590ozp.LIZJ);
        T t = c0x52LIZ.LIZIZ;
        if ((t instanceof MusicBaseResponse) && (musicBaseResponse = (MusicBaseResponse) t) != null) {
            MusicBaseResponse.ServerTimeExtra serverTimeExtra = musicBaseResponse.extra;
            if (serverTimeExtra == null) {
                MusicBaseResponse.ServerTimeExtra serverTimeExtra2 = new MusicBaseResponse.ServerTimeExtra();
                musicBaseResponse.extra = serverTimeExtra2;
                serverTimeExtra2.logid = LIZ(c0x52LIZ);
            } else {
                serverTimeExtra.logid = LIZ(c0x52LIZ);
            }
            if (musicBaseResponse.status_code != 0) {
                C0XIR c0xir = new C0XIR(musicBaseResponse.status_code);
                c0xir.setErrorMsg(musicBaseResponse.status_msg);
                c0xir.setPrompt(musicBaseResponse.prompts);
                c0xir.setResponse(musicBaseResponse);
                throw c0xir;
            }
        }
        return c0x52LIZ;
    }
}
