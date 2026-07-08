package com.ss.android.ugc.aweme.im.camera.entrance;

import X.C069P;
import X.C0BL7;
import X.C0YNP;
import X.C0YSQ;
import X.C0ZFW;
import X.C1727806pg;
import X.C2188811AlT;
import X.C278130AvD;
import X.C288960BUg;
import X.C461720I8s;
import X.C902290ZaV;
import X.C902300ZaW;
import X.C902310ZaX;
import X.C909050ZlP;
import X.InterfaceC876950Yaj;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.exp.game.GameChallengeConfig;
import com.ss.android.ugc.aweme.groupshot.vh.AIGroupShotCardProtocol;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.interactive.task.game.card.GameChallengeCardProtocol;

/* JADX INFO: loaded from: classes15.dex */
public final class IMCameraEntranceServiceImpl implements IIMCameraEntranceService {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (r2 != false) goto L18;
     */
    @Override // com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI() {
        /*
            r7 = this;
            boolean r0 = X.C278130AvD.LIZ()
            r4 = 0
            if (r0 != 0) goto Ld
            boolean r0 = X.C288960BUg.LIZ()
            if (r0 == 0) goto L7b
        Ld:
            X.C902290ZaV.LIZJ()
            com.ss.android.ugc.aweme.exp.groupshot.DMAIGroupShotInboxConfig r0 = X.C902300ZaW.LIZ()
            int r6 = r0.version
            com.bytedance.keva.Keva r5 = X.C902290ZaV.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "banner_last_show_version_"
            r1.append(r0)
            java.lang.String r0 = X.C902290ZaV.LIZ()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            int r3 = r5.getInt(r0, r4)
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "canShowTopBanner current version ("
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = ") must be newer than last displayed version ("
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = "): "
            r2.append(r0)
            r1 = 1
            if (r6 <= r3) goto L7e
            r0 = 1
        L4d:
            r2.append(r0)
            X.C2188811AlT.LIZIZ(r2)
            X.C902290ZaV.LIZJ()
            if (r6 < r1) goto L7b
            if (r6 > r3) goto L83
            if (r6 < r3) goto L80
            java.lang.String r0 = X.C902290ZaV.LIZIZ()
            int r0 = r5.getInt(r0, r4)
            if (r0 <= 0) goto L7c
            r2 = 1
        L67:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "canShowTopBanner already clicked for current version: "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            X.C902290ZaV.LIZJ()
            if (r2 == 0) goto L80
        L7b:
            return r4
        L7c:
            r2 = 0
            goto L67
        L7e:
            r0 = 0
            goto L4d
        L80:
            X.C902290ZaV.LIZJ()
        L83:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.camera.entrance.IMCameraEntranceServiceImpl.LJI():boolean");
    }

    @Override // com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService
    public final IMMessageListProtocol<?> LJ(Fragment fragment) {
        return new AIGroupShotCardProtocol(fragment);
    }

    @Override // com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService
    public final IMMessageListProtocol<?> LJFF(Fragment fragment) {
        return new GameChallengeCardProtocol(fragment);
    }

    @Override // com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService
    public final boolean LJIIIZ(boolean z) {
        boolean z2;
        boolean z3;
        if (!C278130AvD.LIZ() && !C288960BUg.LIZ()) {
            return false;
        }
        if (z) {
            C902290ZaV.LIZJ();
            Keva keva = C902290ZaV.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("popup_last_show_timestamp_");
            sbLIZ.append(C902290ZaV.LIZ());
            long j = keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("canShowBottomPopup last show time (");
            sbLIZ2.append(j);
            sbLIZ2.append(") should be more than one day ago: ");
            if (System.currentTimeMillis() - j >= 86400000) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ2.append(z2);
            C2188811AlT.LIZIZ(sbLIZ2);
            C902290ZaV.LIZJ();
            if (System.currentTimeMillis() - j >= 86400000) {
                int i = C902300ZaW.LIZ().popupVersion;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("canShowBottomPopup current version = ");
                sbLIZ3.append(i);
                C2188811AlT.LIZIZ(sbLIZ3);
                C902290ZaV.LIZJ();
                if (i >= 0) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("popup_last_show_version_");
                    sbLIZ4.append(C902290ZaV.LIZ());
                    int i2 = keva.getInt(C2188811AlT.LIZIZ(sbLIZ4), 0);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("canShowBottomPopup current version should be newer than last displayed version (");
                    sbLIZ5.append(i2);
                    sbLIZ5.append("): ");
                    if (i > i2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sbLIZ5.append(z3);
                    C2188811AlT.LIZIZ(sbLIZ5);
                    C902290ZaV.LIZJ();
                    if (i > i2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService
    public final boolean LIZLLL(int i, IMUser iMUser, String str) {
        if (!((GameChallengeConfig) C902310ZaX.LIZIZ.getValue()).enableGameChallenge) {
            return false;
        }
        if (i != 0) {
            if (i != 3 || !C0BL7.LIZ() || !C0ZFW.LIZ.LJIIIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str)) || !C1727806pg.LIZ.LIZ("group_chat_game_challenge", str, C461720I8s.LIZIZ(), false)) {
                return false;
            }
        } else {
            if (!C278130AvD.LIZ()) {
                return false;
            }
            if (iMUser == null) {
                IMContactApi.LIZ.getClass();
                iMUser = C069P.LIZ().LJ().LJIIL(String.valueOf(C0YNP.LJII(str)), "", "im_local_db");
                if (iMUser == null) {
                    return false;
                }
            }
            if (iMUser.getFollowStatus() != 2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService
    public final boolean LJII(int i, String str, boolean z) {
        return LJIIIIZZ(str, i, null, z);
    }

    @Override // com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService
    public final boolean LJIIIIZZ(String str, int i, IMUser iMUser, boolean z) {
        boolean z2;
        if (i != 0) {
            if (i == 3 && C288960BUg.LIZ() && C0ZFW.LIZ.LJIIIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str))) {
                return true;
            }
            return false;
        }
        if (!C909050ZlP.LIZ(str)) {
            return false;
        }
        if (iMUser == null) {
            IMContactApi.LIZ.getClass();
            iMUser = C069P.LIZ().LJ().LJIIL(String.valueOf(C0YNP.LJII(str)), "", "im_local_db");
        }
        if (!z || (iMUser != null && iMUser.getFollowStatus() == 2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C278130AvD.LIZ() && z2) {
            return true;
        }
        return false;
    }
}
