package com.ss.android.ugc.aweme.im.streak.impl.datasource;

import X.C06F8;
import X.C06G3;
import X.C06G4;
import X.C09CT;
import X.C0I0B;
import X.C0PEM;
import X.C1400340mXo;
import X.C1567806Bw;
import X.C1576106Fb;
import X.C1577406Fo;
import X.C1590906Kt;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1631630sYr;
import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakServerDataSource extends C1577406Fo {
    public final C06F8 LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public final void LJIIIIZZ() {
        String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
        if (curUserId == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dm_repo_streak_");
        sbLIZ.append(curUserId);
        Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).storeBoolean("is_streak_data_fetched", true);
        this.LIZIZ.set(false);
    }

    public StreakServerDataSource(C06F8 c06f8) {
        this.LIZ = c06f8;
    }

    public static StreakData LJFF(String str) {
        StreakData streakDataLIZ;
        int i = C06G3.LIZ[C1567806Bw.LIZJ(str).ordinal()];
        if (i != 1) {
            if (i != 2) {
                C1590906Kt.LIZJ("Streak: target type is invalid");
                streakDataLIZ = null;
            } else {
                streakDataLIZ = LJI(str);
            }
        } else {
            streakDataLIZ = C1577406Fo.LIZ(str, C06G4.USER);
        }
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakDataSource: getFromDatabase, data=");
        sbLIZ.append(streakDataLIZ);
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return streakDataLIZ;
    }

    public static StreakData LJI(String str) {
        if (str != null && str.length() != 0) {
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(':');
            sbLIZ.append(curUserId);
            return C1577406Fo.LIZ(C2188811AlT.LIZIZ(sbLIZ), C06G4.CONVERSATION);
        }
        C1590906Kt.LIZJ("StreakDataSource: read, conversationId is empty");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C2244541CtA r27, com.bytedance.im.core.common.statusmsg.BusinessCommandMessage r28, X.C1577906Ft r29) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.datasource.StreakServerDataSource.LJ(X.1CtA, com.bytedance.im.core.common.statusmsg.BusinessCommandMessage, X.06Ft):void");
    }

    public static final class CmdInfo {

        @C09CT("cmd_type")
        public final int cmdType;

        @C09CT("uuid")
        public final String cmdUUID;

        @C09CT("create_time")
        public final long createTime;

        @C09CT("server_msg_id")
        public final String serverMsgID;

        public CmdInfo(int i, String str, String str2, long j) {
            this.cmdType = i;
            this.cmdUUID = str;
            this.serverMsgID = str2;
            this.createTime = j;
        }
    }

    public static final void LJII(InterfaceC1631630sYr<? super StreakData, ? super String, ? super Boolean, ? super Integer, Unit> interfaceC1631630sYr, StreakData streakData, String str, boolean z, int i, BusinessCommandMessage businessCommandMessage) {
        interfaceC1631630sYr.invoke(streakData, str, Boolean.valueOf(z), Integer.valueOf(i));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1576106Fb(streakData, z, str, businessCommandMessage, i, null), 3);
    }
}
