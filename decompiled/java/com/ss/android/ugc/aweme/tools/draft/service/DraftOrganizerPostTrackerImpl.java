package com.ss.android.ugc.aweme.tools.draft.service;

import X.C05J9;
import X.C05JA;
import X.C0MAY;
import X.C19719612Di;
import X.C201955140j;
import X.C2188811AlT;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.port.internal.draft.IDraftOrganizerPostTracker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class DraftOrganizerPostTrackerImpl implements IDraftOrganizerPostTracker {
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public volatile String LIZIZ;

    @Override // com.ss.android.ugc.aweme.port.internal.draft.IDraftOrganizerPostTracker
    public final void LIZ() {
        String str = this.LIZIZ;
        if (str == null) {
            C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftOrganizerPostTracker", "armWindow: skip — no session");
            return;
        }
        LJFF().storeBoolean(LJI(str), true);
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("armWindow[");
        sbLIZ.append(str);
        sbLIZ.append("]: armed=true");
        C201955140j.LIZLLL(c0may, "DraftOrganizerPostTracker", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.port.internal.draft.IDraftOrganizerPostTracker
    public final void LIZJ() {
        String str = this.LIZIZ;
        if (str == null) {
            C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftOrganizerPostTracker", "markRewarded: skip — no session");
            return;
        }
        LJFF().storeBoolean(LJII(str), true);
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markRewarded[");
        sbLIZ.append(str);
        sbLIZ.append("]: rewarded=true");
        C201955140j.LIZLLL(c0may, "DraftOrganizerPostTracker", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Keva LJFF() {
        return C05J9.LIZ();
    }

    public static String LJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("draft_organizer_tracker_armed_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJII(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("draft_organizer_tracker_rewarded_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.draft.IDraftOrganizerPostTracker
    public final void LIZIZ(String str) {
        boolean z;
        boolean z2 = LJFF().getBoolean(LJI(str), false);
        boolean z3 = LJFF().getBoolean(LJII(str), false);
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startSession[");
        sbLIZ.append(str);
        sbLIZ.append("]: lastArmed=");
        sbLIZ.append(z2);
        sbLIZ.append(", lastRewarded=");
        sbLIZ.append(z3);
        C201955140j.LIZLLL(c0may, "DraftOrganizerPostTracker", C2188811AlT.LIZIZ(sbLIZ));
        if (z2 && !z3) {
            Keva kevaLIZ = C05J9.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("draft_organizer_enter_no_manage_");
            sbLIZ2.append(str);
            long j = kevaLIZ.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L) + 1;
            Keva kevaLIZ2 = C05J9.LIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("draft_organizer_enter_no_manage_");
            sbLIZ3.append(str);
            kevaLIZ2.storeLong(C2188811AlT.LIZIZ(sbLIZ3), j);
            C05J9.LIZ().erase(C05J9.LIZJ(str));
            C05J9.LIZ().storeBoolean(C05J9.LIZIZ(str), false);
            if (j >= C05JA.LJFF) {
                z = true;
                Keva kevaLIZ3 = C05J9.LIZ();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("draft_organizer_dismissed_");
                sbLIZ4.append(str);
                kevaLIZ3.storeBoolean(C2188811AlT.LIZIZ(sbLIZ4), true);
            } else {
                z = false;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("writePunish [");
            sbLIZ5.append(str);
            sbLIZ5.append("]: enterNoManage=");
            sbLIZ5.append(j);
            sbLIZ5.append('/');
            sbLIZ5.append(C05JA.LJFF);
            sbLIZ5.append(", skipRemaining=null, pendingShown=false, permanentlyDismissed=");
            sbLIZ5.append(z);
            sbLIZ5.append(" (static)");
            C201955140j.LIZLLL(c0may, "DraftOrganizerGuard", C2188811AlT.LIZIZ(sbLIZ5));
        }
        LJFF().storeBoolean(LJI(str), false);
        LJFF().storeBoolean(LJII(str), false);
        this.LIZIZ = str;
        C19719612Di.LJJIII(this.LIZ.entrySet(), new AwS53S1000000_2(str, 8), true);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.draft.IDraftOrganizerPostTracker
    public final void LIZLLL(String str) {
        if (a0.LJJJIL(str)) {
            return;
        }
        String strRemove = this.LIZ.remove(str);
        if (strRemove == null) {
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPublishStarted: noop — not in pending, creationId=");
            sbLIZ.append(str);
            C201955140j.LIZLLL(c0may, "DraftOrganizerPostTracker", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C05J9.LIZLLL(strRemove);
        LJFF().storeBoolean(LJII(strRemove), true);
        C0MAY c0may2 = C0MAY.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onPublishStarted[");
        sbLIZ2.append(strRemove);
        sbLIZ2.append("]: rewarded creationId=");
        sbLIZ2.append(str);
        C201955140j.LIZLLL(c0may2, "DraftOrganizerPostTracker", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.port.internal.draft.IDraftOrganizerPostTracker
    public final void LJ(String str) {
        if (a0.LJJJIL(str)) {
            return;
        }
        String str2 = this.LIZIZ;
        if (str2 == null) {
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("markResumePending: skip — no session, creationId=");
            sbLIZ.append(str);
            C201955140j.LIZLLL(c0may, "DraftOrganizerPostTracker", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!LJFF().getBoolean(LJI(str2), false)) {
            C0MAY c0may2 = C0MAY.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("markResumePending: skip — not armed, creationId=");
            sbLIZ2.append(str);
            C201955140j.LIZLLL(c0may2, "DraftOrganizerPostTracker", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        this.LIZ.put(str, str2);
        C0MAY c0may3 = C0MAY.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("markResumePending[");
        sbLIZ3.append(str2);
        sbLIZ3.append("]: ");
        sbLIZ3.append(str);
        sbLIZ3.append(", pendingSize=");
        sbLIZ3.append(this.LIZ.size());
        C201955140j.LIZLLL(c0may3, "DraftOrganizerPostTracker", C2188811AlT.LIZIZ(sbLIZ3));
    }
}
