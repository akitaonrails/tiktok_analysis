package com.ss.android.ugc.aweme.storage;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0CCZ;
import X.C0VZ0;
import X.C0XQ7;
import X.C452501pT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC427710Gpt;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.storage.StorageInfoCacheInitTask;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class StorageInfoCacheInitTask implements C0CCZ {
    public static volatile int LLILZ;
    public static volatile long LLILZIL;
    public static final StorageInfoCacheInitTask LL = new StorageInfoCacheInitTask();
    public static volatile long LLILLJJLI = -1;
    public static volatile long LLILLL = -1;
    public static final C01GW LLILZLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1974));
    public static final C01GW LLIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(257));

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "StorageInfoCacheInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r6) {
        /*
            long r0 = X.C0WYJ.LJI()
            com.ss.android.ugc.aweme.storage.StorageInfoCacheInitTask.LLILLJJLI = r0
            long r0 = X.C0WYJ.LJFF(r6)
            com.ss.android.ugc.aweme.storage.StorageInfoCacheInitTask.LLILLL = r0
            java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r0 = com.ss.android.ugc.aweme.services.IExternalService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.services.external.IAVDraftService r0 = r0.draftService()
            if (r0 == 0) goto L41
            X.0M4M r1 = new X.0M4M
            r2 = 1
            r3 = 0
            X.0M3g r4 = X.EnumC562220M3g.NORMAL
            r6 = 26
            r1.<init>(r2, r3, r4, r5, r6)
            X.0Lna r1 = r0.queryDraftsInfo(r1)
            if (r1 == 0) goto L42
            int r0 = r1.LIZ
        L35:
            com.ss.android.ugc.aweme.storage.StorageInfoCacheInitTask.LLILZ = r0
            if (r1 == 0) goto L3e
            long r0 = r1.LJFF
        L3b:
            com.ss.android.ugc.aweme.storage.StorageInfoCacheInitTask.LLILZIL = r0
            return
        L3e:
            r0 = 0
            goto L3b
        L41:
            r1 = 0
        L42:
            r0 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.storage.StorageInfoCacheInitTask.LIZ(android.content.Context):void");
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) {
        IDowngradeApi iDowngradeApi = (IDowngradeApi) PluggableExtentionKt.pluggableSpi$default(IDowngradeApi.class, false, false, false, 14, null);
        if (iDowngradeApi != null) {
            iDowngradeApi.LJI(new AwS575S0100000_31(context, 1055));
        }
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI(new InterfaceC427710Gpt() { // from class: X.14ft
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                if (i == 10) {
                    StorageInfoCacheInitTask storageInfoCacheInitTask = StorageInfoCacheInitTask.LL;
                    Context context2 = context;
                    storageInfoCacheInitTask.getClass();
                    StorageInfoCacheInitTask.LIZ(context2);
                }
            }
        });
    }
}
