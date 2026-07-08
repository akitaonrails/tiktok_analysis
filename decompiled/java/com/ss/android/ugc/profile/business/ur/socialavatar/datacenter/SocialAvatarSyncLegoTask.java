package com.ss.android.ugc.profile.business.ur.socialavatar.datacenter;

import X.AbstractC848400XPy;
import X.C0CCZ;
import X.C0HEE;
import X.C0HSM;
import X.C0HZB;
import X.C0PEM;
import X.C0VZ0;
import X.C0XQ7;
import X.C1350705Qj;
import X.C1644806cI;
import X.C1908480zlO;
import X.C1910890zpH;
import X.C1956107lP;
import X.C2296808zG;
import X.C23250099c;
import X.C442610HXf;
import X.C596970NbD;
import X.EnumC1733330vCt;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC586170Myt;
import X.InterfaceC596980NbE;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl;
import com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarByteSyncData;
import com.ss.android.ugc.ur.socialavatar.ISAStickerAnimationStatusService;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import java.util.Collections;
import java.util.List;
import kotlin.text.Charsets;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarSyncLegoTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SocialAvatarSyncLegoTask";
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
        MixStudioEntranceControl mixStudioEntranceControl;
        if (!C1644806cI.LIZJ()) {
            return;
        }
        C596970NbD.LIZIZ.LIZ(EnumC1733330vCt.UR_SOCIAL_AVATAR_SYNC, new InterfaceC596980NbE() { // from class: X.0HZc
            @Override // X.InterfaceC596980NbE
            public final void LJ(C1525630pnt c1525630pnt) {
                byte[] bArr = c1525630pnt.LIZ;
                if (bArr != null) {
                    String str = new String(bArr, Charsets.UTF_8);
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SocialAvatarSyncLegoTask receiver new data ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    try {
                        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                        SocialAvatarByteSyncData socialAvatarByteSyncData = (SocialAvatarByteSyncData) C051M.LIZIZ(SocialAvatarByteSyncData.class, str);
                        if (socialAvatarByteSyncData == null) {
                            return;
                        }
                        Integer num = socialAvatarByteSyncData.status;
                        String str2 = socialAvatarByteSyncData.thumbnailUrl;
                        Integer num2 = socialAvatarByteSyncData.errorCode;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("SocialAvatarSyncLegoTask receive status is ");
                        sbLIZ2.append(num);
                        sbLIZ2.append(" \n SocialAvatarSyncLegoTask receive url is ");
                        sbLIZ2.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C844470XAv.LIZ.getClass();
                        C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Test Social Avatar Receive bytesync message status as ");
                        sbLIZ3.append(num);
                        sbLIZ3.append(", thumbnailUrl as ");
                        sbLIZ3.append(str2);
                        c1233040iBy.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                        c1233040iBy.LIZ(3000L);
                        c1233040iBy.LIZLLL();
                        if (num != null && str2 != null) {
                            ((ISocialAvatarCreationStatusService) ServiceManager.get().getService(ISocialAvatarCreationStatusService.class)).LIZJ(curUserId, new C438920HJa(num.intValue(), Collections.singletonList(str2), num2, false, null, null, null, null, 248));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i2 = C2187451AjH.LIZ;
                        C1720106oR.LIZIZ("SocialAvatar", "SocialAvatarSyncLegoTask onDataUpdate ", e);
                    }
                }
            }
        });
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1350705Qj(null), 3);
        final ISAStickerAnimationStatusService iSAStickerAnimationStatusService = (ISAStickerAnimationStatusService) PluggableExtentionKt.pluggableSpi$default(ISAStickerAnimationStatusService.class, false, false, false, 14, null);
        if (iSAStickerAnimationStatusService != null) {
            iSAStickerAnimationStatusService.LIZLLL(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            C23250099c.LIZLLL(C1956107lP.LIZ, null, null, new C442610HXf(this, iSAStickerAnimationStatusService, null), 3);
        }
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0HZA
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                ISAStickerAnimationStatusService iSAStickerAnimationStatusService2;
                if (!z) {
                    return;
                }
                if ((i != 1 && i != 2) || (iSAStickerAnimationStatusService2 = iSAStickerAnimationStatusService) == null) {
                    return;
                }
                iSAStickerAnimationStatusService2.LIZLLL(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            }
        });
        if (C0HSM.LIZ() && context != null && (mixStudioEntranceControl = (MixStudioEntranceControl) PluggableExtentionKt.pluggableSpi$default(MixStudioEntranceControl.class, false, false, false, 14, null)) != null) {
            mixStudioEntranceControl.LJIILJJIL(context);
        }
        C0HZB c0hzb = new C0HZB();
        C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
        c1908480zlO.LJ(c0hzb);
        c1908480zlO.LJIILL(c0hzb, c0hzb.LL);
        C0HEE c0hee = C0HEE.LIZ;
        c0hee.getClass();
        EventBus.LIZLLL().LJIJJ(c0hee);
        ((C1910890zpH) C0HEE.LIZIZ.getValue()).LIZ("SocialAvatarEffectManager", "start listening to sa effect video publish");
    }
}
