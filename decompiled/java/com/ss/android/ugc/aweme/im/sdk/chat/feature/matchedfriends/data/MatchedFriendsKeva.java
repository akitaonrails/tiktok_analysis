package com.ss.android.ugc.aweme.im.sdk.chat.feature.matchedfriends.data;

import X.C04TD;
import X.C2188811AlT;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsKeva;

/* JADX INFO: loaded from: classes3.dex */
public final class MatchedFriendsKeva implements IMatchedFriendsKeva {
    public static final MatchedFriendsKeva LIZ = new MatchedFriendsKeva();
    public static Keva LIZIZ;

    public static final class Service implements IMatchedFriendsKeva {
        public final /* synthetic */ MatchedFriendsKeva LIZ = MatchedFriendsKeva.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsKeva
        public final boolean LIZ() {
            return this.LIZ.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsKeva
        public final int LIZIZ() {
            return this.LIZ.LIZIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsKeva
        public final void LIZJ() {
            this.LIZ.LIZJ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsKeva
        public final void LIZLLL() {
            this.LIZ.LIZLLL();
        }

        public static IMatchedFriendsKeva LJ() {
            Object objLIZ = C04TD.LIZ(IMatchedFriendsKeva.class, false);
            if (objLIZ != null) {
                return (IMatchedFriendsKeva) objLIZ;
            }
            if (C04TD.b1 == null) {
                synchronized (IMatchedFriendsKeva.class) {
                    if (C04TD.b1 == null) {
                        C04TD.b1 = new Service();
                    }
                }
            }
            return C04TD.b1;
        }
    }

    public final synchronized Keva LJI() {
        Keva repo;
        repo = LIZIZ;
        if (repo == null) {
            repo = KevaImpl.getRepo("matched_friends_repo", 1);
            LIZIZ = repo;
        }
        return repo;
    }

    public static String LJ() {
        return ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsKeva
    public final boolean LIZ() {
        Keva kevaLJI = LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_maf_follow_send_popup_not_show");
        sbLIZ.append(LJ());
        return !kevaLJI.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsKeva
    public final int LIZIZ() {
        Keva kevaLJI = LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_maf_chat_delete_num");
        sbLIZ.append(LJ());
        return kevaLJI.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsKeva
    public final void LIZJ() {
        Keva kevaLJI = LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_maf_follow_send_popup_not_show");
        sbLIZ.append(LJ());
        kevaLJI.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsKeva
    public final void LIZLLL() {
        Keva kevaLJI = LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_maf_chat_delete_num");
        sbLIZ.append(LJ());
        kevaLJI.storeInt(C2188811AlT.LIZIZ(sbLIZ), LIZIZ() + 1);
    }

    public final int LJFF(String str) {
        Keva kevaLJI = LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key_maf_follow_popup_show_num");
        sbLIZ2.append(LJ());
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(str);
        return kevaLJI.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }
}
