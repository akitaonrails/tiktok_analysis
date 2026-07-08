package com.ss.android.ugc.aweme.services.storage;

import X.C09AY;
import X.C579980Mou;
import X.InterfaceC580000Mow;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import lth.o;

/* JADX INFO: loaded from: classes36.dex */
public final class AVStorageManagerImpl$persistedAllowListManager$2 extends C09AY implements Function0<C579980Mou> {
    public AVStorageManagerImpl$persistedAllowListManager$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Mou] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C579980Mou invoke() {
        return new InterfaceC580000Mow() { // from class: X.0Mou
            public final ConcurrentHashMap<String, AbstractC579990Mov> LIZ = new ConcurrentHashMap<>();

            @Override // X.InterfaceC580000Mow
            public final C0M5Z LIZJ() {
                C0M5Z c0m5z = new C0M5Z(AnonymousClass0207.get$arr$(60));
                for (AbstractC579990Mov abstractC579990Mov : this.LIZ.values()) {
                    if (!abstractC579990Mov.LIZ.get()) {
                        if (!C0CHQ.LIZ().LJJIIJZLJL().getPersistedAllowListManager().LIZ(abstractC579990Mov.getClass().getName())) {
                            C0MZY.LIZ.getClass();
                            C0MZY.LIZJ();
                        }
                        abstractC579990Mov.LIZJ.clear();
                        Iterator it2 = ((ArrayList) C13LQ.LJIJI(((Keva) abstractC579990Mov.LIZIZ.getValue()).getStringArray(String.valueOf(abstractC579990Mov.getClass().getName().hashCode()), new String[0]))).iterator();
                        while (it2.hasNext()) {
                            abstractC579990Mov.LIZJ.add((String) it2.next());
                        }
                        abstractC579990Mov.LIZ.set(true);
                    }
                    c0m5z.addAll(abstractC579990Mov.LIZJ);
                }
                ArrayList<OriginalSoundUploadTask> arrayListLIZIZ = C1441580ncK.LIZ(o.LIZ).LIZIZ();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(arrayListLIZIZ, 10));
                Iterator<OriginalSoundUploadTask> it3 = arrayListLIZIZ.iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().originalSoundPath);
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                c0m5z.addAll(C1697810uHb.LJIIJJI(Arrays.copyOf(strArr, strArr.length)));
                C0M5Z c0m5z2 = new C0M5Z(AnonymousClass0207.get$arr$(61));
                C1403010mc7.LIZ.LJIIIZ();
                c0m5z2.addAll(C1441380nc0.LIZ());
                c0m5z2.addAll(C0CHQ.LIZ().LJI().LJIILJJIL().LJIIIIZZ());
                AwemeDraft awemeDraftLJII = C0CHQ.LIZ().LJIIJ().LJII();
                if (awemeDraftLJII != null) {
                    c0m5z2.add(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJII(awemeDraftLJII.LIZIZ()));
                }
                c0m5z.addAll(c0m5z2);
                return c0m5z;
            }

            @Override // X.InterfaceC580000Mow
            public final boolean LIZ(String str) {
                return this.LIZ.containsKey(str);
            }

            @Override // X.InterfaceC580000Mow
            public final void LIZIZ(C580010Mox c580010Mox) {
                this.LIZ.put(C580010Mox.class.getName(), c580010Mox);
            }
        };
    }
}
