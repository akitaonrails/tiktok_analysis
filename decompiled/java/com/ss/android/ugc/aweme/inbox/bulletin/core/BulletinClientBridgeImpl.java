package com.ss.android.ugc.aweme.inbox.bulletin.core;

import X.C01GW;
import X.C0XQ7;
import X.C452501pT;
import X.C622220Oaq;
import X.C622280Oaw;
import X.C622290Oax;
import X.C844470XAv;
import X.InterfaceC622450ObD;
import X.InterfaceC622540ObM;
import android.content.Context;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.bulletin.db.api.IBulletinClientBridge;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinClientBridgeImpl implements IBulletinClientBridge {
    public volatile boolean LIZIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(142));
    public final C622220Oaq LIZJ = C622220Oaq.LL;

    @Override // com.ss.android.ugc.aweme.bulletin.db.api.IBulletinClientBridge
    public final void LIZ() throws Exception {
        if (this.LIZIZ) {
            return;
        }
        try {
            C622290Oax.LJFF("BulletinClientBridgeImpl", "doDBProxy - loadLibrary wcdb");
            Librarian.LJFF("wcdb");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
            C622290Oax.LIZLLL("doDBProxy - UnsatisfiedLinkError", e2);
            Librarian.LJFF("wcdb");
        }
        this.LIZIZ = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Oaw] */
    @Override // com.ss.android.ugc.aweme.bulletin.db.api.IBulletinClientBridge
    public final C622280Oaw LIZIZ() {
        return new InterfaceC622540ObM() { // from class: X.0Oaw
            @Override // X.InterfaceC622540ObM
            public final void LIZ() {
                IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                if (iAccountService != null) {
                    iAccountService.LJIILL(this.LIZ.LIZJ);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.bulletin.db.api.IBulletinClientBridge
    public final Context getApplicationContext() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.bulletin.db.api.IBulletinClientBridge
    public final InterfaceC622450ObD getEventTracker() {
        return (InterfaceC622450ObD) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.bulletin.db.api.IBulletinClientBridge
    public final String getUid() {
        return C0XQ7.LJFF().getCurUserId();
    }
}
