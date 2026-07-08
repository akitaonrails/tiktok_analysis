package com.ss.android.ugc.aweme.commentv2.uitls;

import X.AnonymousClass0561;
import X.AnonymousClass0562;
import X.AnonymousClass0581;
import X.C0CCZ;
import X.C0PEM;
import X.C0VU1;
import X.C0VZ0;
import X.C1741890vQh;
import X.C2296808zG;
import X.C23250099c;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.easteregg.model.SurpriseResourceReq;
import com.ss.android.ugc.aweme.comment.model.CommentSurprise;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentSurpriseBootTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CommentSurpriseBootTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        LruCache<String, CommentSurprise> lruCache = AnonymousClass0562.LIZ;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SurpriseResourceReq(AnonymousClass0561.SURPRISE_RESOURCE_TYPE_ENUM_FIRST_COMMENT_SURPRISE.getValue(), new ArrayList()));
        try {
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(arrayList);
            if (strLJIIIIZZ != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new AnonymousClass0581(strLJIIIIZZ, null), 3);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
