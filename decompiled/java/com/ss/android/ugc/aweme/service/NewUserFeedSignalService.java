package com.ss.android.ugc.aweme.service;

import X.C13LP;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.interest.IInterestReselectionService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes30.dex */
public final class NewUserFeedSignalService implements INewUserFeedSignalService {
    public Aweme LIZJ;
    public int LIZLLL;
    public final Map<String, Integer> LIZ = new LinkedHashMap();
    public final Map<Integer, Integer> LIZIZ = new LinkedHashMap();
    public final List<Integer> LJ = new ArrayList();
    public final List<Integer> LJFF = new ArrayList();
    public final Object LJI = new Object();
    public final IInterestReselectionService LJII = (IInterestReselectionService) PluggableExtentionKt.pluggableSpi$default(IInterestReselectionService.class, false, false, false, 14, null);

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    @Override // com.ss.android.ugc.aweme.service.INewUserFeedSignalService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.NewUserFeedSignalService.LIZ():void");
    }

    @Override // com.ss.android.ugc.aweme.service.INewUserFeedSignalService
    public final Pair<String, String> LIZJ() {
        synchronized (this.LJI) {
            try {
                if (((ArrayList) this.LJ).isEmpty() && ((ArrayList) this.LJFF).isEmpty()) {
                    return null;
                }
                Pair<String, String> pair = new Pair<>(C13LP.LJJLIIIJ(this.LJ, ",", null, null, 0, null, null, 62), C13LP.LJJLIIIJ(this.LJFF, ",", null, null, 0, null, null, 62));
                ((ArrayList) this.LJ).clear();
                ((ArrayList) this.LJFF).clear();
                return pair;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.INewUserFeedSignalService
    public final int LIZLLL() {
        Integer num = (Integer) C13LP.LJJLIIIJL(this.LJ);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.service.INewUserFeedSignalService
    public final void LIZIZ(Aweme aweme) {
        this.LIZJ = aweme;
    }
}
