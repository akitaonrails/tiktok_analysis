package com.ss.android.ugc.aweme.im.sticker.api.socialavatar;

import X.C0CCZ;
import X.C0VZ0;
import X.C454640HsE;
import X.C461720I8s;
import X.C596970NbD;
import X.EnumC1733330vCt;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC596980NbE;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.socialavatar.AiMojiByteSyncData;
import java.util.List;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes7.dex */
public final class AiMojiSyncLegoTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AiMojiSyncLegoTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        if (!c454640HsE.LIZIZ().getImSocialAvatarService().isEnabled()) {
            return;
        }
        C596970NbD.LIZIZ.LIZ(EnumC1733330vCt.IM_AIMOJI_SYNC, new InterfaceC596980NbE() { // from class: X.0HgS
            @Override // X.InterfaceC596980NbE
            public final void LJ(C1525630pnt c1525630pnt) {
                int iIntValue;
                this.LL.getClass();
                C454640HsE c454640HsE2 = IMStickerApi.LIZ;
                if (c454640HsE2.LIZIZ().getImSocialAvatarService().isEnabled()) {
                    String str = new String(c1525630pnt.LIZ, Charsets.UTF_8);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("payload = ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    try {
                        AiMojiByteSyncData aiMojiByteSyncData = (AiMojiByteSyncData) C051M.LIZIZ(AiMojiByteSyncData.class, str);
                        if (aiMojiByteSyncData != null) {
                            Integer num = aiMojiByteSyncData.status;
                            if (num == null && (num = aiMojiByteSyncData.status_2) == null) {
                                Integer num2 = aiMojiByteSyncData.status_3;
                                if (num2 != null) {
                                    iIntValue = num2.intValue();
                                } else {
                                    return;
                                }
                            } else {
                                iIntValue = num.intValue();
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("new status = ");
                            sbLIZ2.append(iIntValue);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            c454640HsE2.LIZIZ().getImSocialAvatarService().LJJIIZ(null);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        });
        if (C461720I8s.LJ()) {
            c454640HsE.LIZIZ().getImSocialAvatarService().LJJIIJZLJL();
        }
    }
}
