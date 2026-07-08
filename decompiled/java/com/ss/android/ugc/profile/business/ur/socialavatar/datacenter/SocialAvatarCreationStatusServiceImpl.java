package com.ss.android.ugc.profile.business.ur.socialavatar.datacenter;

import X.AnonymousClass0951;
import X.C01GW;
import X.C054G;
import X.C0HJW;
import X.C0HYP;
import X.C1910890zpH;
import X.C1956107lP;
import X.C2188811AlT;
import X.C23250099c;
import X.C437180HCi;
import X.C437190HCj;
import X.C437200HCk;
import X.C437560HDu;
import X.C438920HJa;
import X.C438960HJe;
import X.C452501pT;
import X.EnumC437540HDs;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.offline.socialavatar.debug.ISocialAvatarDebugService;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarCreationStatusServiceImpl implements ISocialAvatarCreationStatusService {
    public static final ConcurrentHashMap<String, C0HJW> LIZIZ = new ConcurrentHashMap<>();
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(369));

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService
    public final SocialAvatarSyncLegoTask LIZLLL() {
        return new SocialAvatarSyncLegoTask();
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService
    public final AnonymousClass0951 LIZ(String str) {
        C0HJW c0hjwPutIfAbsent;
        ConcurrentHashMap<String, C0HJW> concurrentHashMap = LIZIZ;
        C0HJW c0hjw = concurrentHashMap.get(str);
        if (c0hjw == null && (c0hjwPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c0hjw = new C0HJW(str)))) != null) {
            c0hjw = c0hjwPutIfAbsent;
        }
        return c0hjw.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091 A[PHI: r6 r7 r8
      0x0091: PHI (r6v3 java.util.List<java.lang.String>) = (r6v2 java.util.List<java.lang.String>), (r6v6 java.util.List<java.lang.String>) binds: [B:45:0x008e, B:36:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r7v4 java.lang.Integer) = (r7v3 java.lang.Integer), (r7v7 java.lang.Integer) binds: [B:45:0x008e, B:36:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r8v1 boolean) = (r8v0 boolean), (r8v4 boolean) binds: [B:45:0x008e, B:36:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0113 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Integer] */
    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r15, X.InterfaceC1364105Vn<? super java.lang.Integer> r16) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarCreationStatusServiceImpl.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService
    public final void LIZJ(String str, C438920HJa c438920HJa) {
        C438960HJe c438960HJe;
        C438960HJe c438960HJe2;
        Pair<Boolean, C437560HDu> pairLIZJ;
        C0HJW c0hjwPutIfAbsent;
        ConcurrentHashMap<String, C0HJW> concurrentHashMap = LIZIZ;
        C0HJW c0hjw = concurrentHashMap.get(str);
        if (c0hjw == null && (c0hjwPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c0hjw = new C0HJW(str)))) != null) {
            c0hjw = c0hjwPutIfAbsent;
        }
        C0HJW c0hjw2 = c0hjw;
        C1910890zpH c1910890zpHLIZ = c0hjw2.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive newStatus as ");
        sbLIZ.append(c438920HJa);
        c1910890zpHLIZ.LIZ("SocialAvatarCreationStatusDataSource", C2188811AlT.LIZIZ(sbLIZ));
        ISocialAvatarDebugService iSocialAvatarDebugService = (ISocialAvatarDebugService) c0hjw2.LJIIIIZZ.getValue();
        if (iSocialAvatarDebugService != null && (pairLIZJ = iSocialAvatarDebugService.LIZJ()) != null && pairLIZJ.getFirst().booleanValue()) {
            c0hjw2.LIZ().LIZ("SocialAvatarCreationStatusDataSource", "mock status is on");
        } else {
            if (c438920HJa.LIZ == 2) {
                ConcurrentHashMap<String, C437200HCk> concurrentHashMap2 = C437190HCj.LIZ;
                String str2 = c0hjw2.LIZ;
                if (C437190HCj.LIZ(str2) == null) {
                    C0HYP.LIZ.getClass();
                    int i = C0HYP.LJ().getInt("review_page_preloading_times", 0);
                    SettingsManager.LIZLLL().getClass();
                    if (i < SettingsManager.LJ("social_avatar_review_preload_limit_config", 3)) {
                        C23250099c.LIZLLL(C437190HCj.LIZIZ, null, null, new C437180HCi(str2, null), 3);
                    }
                }
                c0hjw2.LIZIZ().LIZ(c438920HJa);
            }
            if (c438920HJa.LIZ == -4 && (c438960HJe = c438920HJa.LJI) != null && Boolean.valueOf(c438960HJe.LIZ) != null && (c438960HJe2 = c438920HJa.LJI) != null && !c438960HJe2.LIZ) {
                if (((C437560HDu) c0hjw2.LIZJ.getValue()).LIZ == EnumC437540HDs.UPLOADING) {
                    c0hjw2.LIZ().LIZ("SocialAvatarCreationStatusDataSource", "updateStatus with uploading estimated time success");
                    c0hjw2.LIZIZ().LIZ(c438920HJa);
                }
            } else if (c438920HJa.LIZ == -5) {
                if (((C437560HDu) c0hjw2.LIZJ.getValue()).LIZ == EnumC437540HDs.UPLOADING) {
                    C054G c054g = C1956107lP.LIZ;
                    if (!C1956107lP.LIZ(c0hjw2.LIZ)) {
                        c0hjw2.LIZ().LIZ("SocialAvatarCreationStatusDataSource", "updateStatus with UPLOAD_FAILED, users stays in the page.");
                        C1956107lP.LIZIZ(c0hjw2.LIZ, true);
                        C0HYP.LIZ.getClass();
                        C0HYP.LJ().storeBoolean("uploading_flow_started", false);
                        c0hjw2.LIZIZ().LIZ(c438920HJa);
                    } else {
                        c0hjw2.LIZ().LIZ("SocialAvatarCreationStatusDataSource", "updateStatus with UPLOAD_FAILED, users leaves the page.");
                        c0hjw2.LIZIZ().LIZ(new C438920HJa(-1, null, null, false, null, null, null, null, 254));
                    }
                }
            } else {
                C1910890zpH c1910890zpHLIZ2 = c0hjw2.LIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateStatus in default, with newStatus as ");
                sbLIZ2.append(c438920HJa);
                c1910890zpHLIZ2.LIZ("SocialAvatarCreationStatusDataSource", C2188811AlT.LIZIZ(sbLIZ2));
                c0hjw2.LIZIZ().LIZ(c438920HJa);
            }
        }
        Integer num = c438920HJa.LJII;
        if (num != null) {
            IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LIZJ(num.intValue());
        }
        IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJIL();
    }
}
