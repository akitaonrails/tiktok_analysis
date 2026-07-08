package com.ss.android.ugc.aweme.services.storage;

import X.C09AY;
import X.C20020813Ve;
import X.InterfaceC1604540rrA;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.storage.impl.AVCreativeTemplateStorage;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes36.dex */
public final class AVStorageManagerImpl$cleanUselessDraftsProvider$2 extends C09AY implements Function0<C20020813Ve> {
    public AVStorageManagerImpl$cleanUselessDraftsProvider$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.13Ve] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C20020813Ve invoke() {
        return new InterfaceC1604540rrA() { // from class: X.13Ve
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(233));
            public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(234));

            @Override // X.InterfaceC1604540rrA
            public final void LIZIZ() {
                Keva repo = Keva.getRepo("av_storage_cleanup_frequency_control");
                if (System.currentTimeMillis() - repo.getLong("template_last_clean_time", 0L) < ((Number) C262540AQq.LIZ.getValue()).longValue()) {
                    return;
                }
                C201955140j.LIZLLL(C20020913Vf.LIZIZ, "autoCleanTemplate", "start clean");
                repo.storeLong("template_last_clean_time", System.currentTimeMillis());
                new AVCreativeTemplateStorage().LJII(true);
            }

            @Override // X.InterfaceC1604540rrA
            public final boolean LIZJ() {
                return !((ConcurrentHashSet) this.LIZ.getValue()).isEmpty();
            }

            @Override // X.InterfaceC1604540rrA
            public final void LIZLLL() {
                if (((ConcurrentHashSet) this.LIZ.getValue()).isEmpty()) {
                    return;
                }
                Iterator it2 = ((ConcurrentHashSet) this.LIZ.getValue()).iterator();
                while (it2.hasNext()) {
                    C570490MZb.LIZIZ((CreativeInfo) it2.next());
                }
                ((ConcurrentHashSet) this.LIZ.getValue()).clear();
            }

            @Override // X.InterfaceC1604540rrA
            public final void LIZ(CreativeInfo creativeInfo) {
                C20020913Vf c20020913Vf = C20020913Vf.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addUnusedDraft: id: ");
                sbLIZ.append(creativeInfo.getCreationId());
                sbLIZ.append("  version: ");
                sbLIZ.append(creativeInfo.getVersion());
                C201955140j.LIZJ(c20020913Vf, C2188811AlT.LIZIZ(sbLIZ));
                ((ConcurrentHashSet) this.LIZ.getValue()).add(creativeInfo);
            }
        };
    }
}
