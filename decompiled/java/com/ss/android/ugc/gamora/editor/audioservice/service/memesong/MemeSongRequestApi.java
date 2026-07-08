package com.ss.android.ugc.gamora.editor.audioservice.service.memesong;

import X.C0X9S;
import X.C1500770p9n;
import X.C1697810uHb;
import X.InterfaceC1485405rg;
import X.InterfaceC1485605ri;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501240pAY;
import X.InterfaceC2177008fw;
import com.google.gson.n;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public final class MemeSongRequestApi {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("pop", "edm", "hiphop");

    /* JADX INFO: loaded from: classes4.dex */
    public interface Api {
        @InterfaceC1501240pAY("/internal/api/v1/invoke")
        C0X9S<C1500770p9n<MemeSongResponse>> request(@InterfaceC1501070pAH("namespace") String str, @InterfaceC1501070pAH("appkey") String str2, @InterfaceC1485405rg n nVar, @InterfaceC1485605ri Map<String, String> map, @InterfaceC2177008fw Object obj);
    }
}
