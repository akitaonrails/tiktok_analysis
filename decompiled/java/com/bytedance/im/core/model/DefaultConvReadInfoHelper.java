package com.bytedance.im.core.model;

import X.C0Y4A;
import X.C0Y8T;
import X.C0YDF;
import X.C0YEM;
import X.C13LP;
import X.C15438062q;
import X.C1C7U;
import X.C869590Y9l;
import X.C870390YCn;
import X.C870400YCo;
import X.C914050ZtT;
import Y.ARunnableS114S0100000_14;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultConvReadInfoHelper implements C0YDF {
    public final C0YEM LL;
    public boolean LLILLL;
    public final DefaultConvReadInfoHelper$mainHandler$1 LLILZIL;
    public final C870390YCn LLILZLL;
    public final ConcurrentHashMap<String, ConcurrentHashMap<Long, C870400YCo>> LLILLJJLI = new ConcurrentHashMap<>();
    public final List<String> LLILZ = new ArrayList();

    @Override // X.C0YDF
    public final void LJJJJZI() {
        if (this.LL.LJIIIZ().LJJIZ) {
            List<C0Y8T> listLIZIZ = this.LL.LJIIZILJ().LIZLLL().LIZLLL().LIZIZ();
            if (listLIZIZ.isEmpty()) {
                return;
            }
            this.LLILLL = true;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            Iterator<C0Y8T> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getConversationId());
            }
            LLIILZL("sdk_init", arrayList);
        }
    }

    @Override // X.C0YDF
    public final void LLLIIII() {
        if (this.LL.LJIIIZ().LJJIZ) {
            this.LL.LJIIJJI().LIZIZ(new C914050ZtT(new ARunnableS114S0100000_14(this, 4), 0), null);
        }
    }

    @Override // X.C0YDF
    public final void clean() {
        this.LLILLJJLI.clear();
        this.LLILLL = false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.im.core.model.DefaultConvReadInfoHelper$mainHandler$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0YCn] */
    public DefaultConvReadInfoHelper(C0YEM c0yem) {
        this.LL = c0yem;
        final Looper mainLooper = Looper.getMainLooper();
        this.LLILZIL = new BPEAHandler(mainLooper) { // from class: com.bytedance.im.core.model.DefaultConvReadInfoHelper$mainHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("DefaultConvReadInfoHelper@9d10.mainHandler$1");
                if (message.what == 1) {
                    DefaultConvReadInfoHelper defaultConvReadInfoHelper = this.LL;
                    defaultConvReadInfoHelper.LLIILZL("conv_update", defaultConvReadInfoHelper.LLILZ);
                    ((ArrayList) this.LL.LLILZ).clear();
                }
                C1C7U.LIZIZ("DefaultConvReadInfoHelper@9d10.mainHandler$1");
            }
        };
        this.LLILZLL = new C0Y4A() { // from class: X.0YCn
            @Override // X.C0Y4A, X.InterfaceC867280Y0o
            public final void LLLIZZ(Map<String, C0Y8T> map) {
            }

            @Override // X.C0Y4B, X.InterfaceC868050Y3n
            public final void LJLJI(int i, C0Y8T c0y8t) {
                if (!this.LL.LLILLJJLI.containsKey(c0y8t.getConversationId())) {
                    ((ArrayList) this.LL.LLILZ).add(c0y8t.getConversationId());
                }
                if (!hasMessages(1)) {
                    C786410Ut5.LJLJJI(1, Mp4ScreenVideoLoadTimeout.CONTROL, this.LL.LLILZIL);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x040b A[Catch: Exception -> 0x0438, all -> 0x0498, TRY_LEAVE, TryCatch #5 {Exception -> 0x0438, blocks: (B:108:0x0394, B:110:0x03a0, B:112:0x03b6, B:125:0x0401, B:126:0x0405, B:128:0x040b), top: B:176:0x0394 }] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:197:? -> B:160:0x049d). Please report as a decompilation issue!!! */
    @Override // X.C0YDF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIIJ(java.util.List<com.bytedance.im.core.proto.ConversationParticipantReadIndex> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.model.DefaultConvReadInfoHelper.LLIIIJ(java.util.List):void");
    }

    @Override // X.C0YDF
    public final List<C870400YCo> LLL(String str) {
        Collection<C870400YCo> collectionValues;
        ConcurrentHashMap<Long, C870400YCo> concurrentHashMap = this.LLILLJJLI.get(str);
        if (concurrentHashMap != null && (collectionValues = concurrentHashMap.values()) != null) {
            return C13LP.LLIIII(collectionValues);
        }
        return null;
    }

    @Override // X.C0YDF
    public final void LLIILZL(String str, List list) {
        if (!this.LL.LJIIIZ().LJJIZ) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C0Y8T c0y8tLIZ = this.LL.LJIIZILJ().LIZLLL().LIZ().LIZ((String) it2.next());
            if (c0y8tLIZ != null) {
                arrayList2.add(c0y8tLIZ);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C869590Y9l lastShowMessage = ((C0Y8T) it3.next()).getLastShowMessage();
            if (lastShowMessage != null) {
                arrayList.add(lastShowMessage);
            }
        }
        this.LL.LJIIZILJ().LIZ().LJ().LIZ(null, str, arrayList);
    }
}
