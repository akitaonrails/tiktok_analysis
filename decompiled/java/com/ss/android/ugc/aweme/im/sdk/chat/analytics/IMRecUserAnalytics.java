package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.C1252610ihX;
import X.C1260910iuv;
import X.C736420Sue;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import com.ss.android.ugc.aweme.analytics.IIMRecUserAnalytics;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes20.dex */
public final class IMRecUserAnalytics implements IIMRecUserAnalytics {
    public static final IMRecUserAnalytics LIZIZ = new IMRecUserAnalytics();

    public static final class Service implements IIMRecUserAnalytics {
        public final /* synthetic */ IMRecUserAnalytics LIZIZ = IMRecUserAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.analytics.IIMRecUserAnalytics
        public final C1252610ihX LIZ(User user, String str) {
            return this.LIZIZ.LIZ(user, str);
        }

        @Override // com.ss.android.ugc.aweme.analytics.IIMRecUserAnalytics
        public final void LIZIZ(User user, String str) {
            this.LIZIZ.LIZIZ(user, str);
        }

        @Override // com.ss.android.ugc.aweme.analytics.IIMRecUserAnalytics
        public final void LIZJ(User user, String str) {
            this.LIZIZ.LIZJ(user, str);
        }

        @Override // com.ss.android.ugc.aweme.analytics.IIMRecUserAnalytics
        public final void LIZLLL(User user, String str) {
            this.LIZIZ.LIZLLL(user, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.analytics.IIMRecUserAnalytics
    public final C1252610ihX LIZ(User user, String str) {
        String str2 = str;
        if (str2 == null) {
            str2 = "chat";
        }
        EnumC1260920iuw enumC1260920iuw = EnumC1260920iuw.CARD;
        String recType = user.getRecType();
        String friendTypeStr = user.getFriendTypeStr();
        C1252610ihX.Companion.getClass();
        return new C1252610ihX(str2, "", enumC1260920iuw, recType, C736420Sue.LIZ(user), user.getUid(), null, null, user.getRequestId(), "", friendTypeStr, null, null, null, null, null, false, null, "expand_group_chat", null, null, false, null, false, null);
    }

    @Override // com.ss.android.ugc.aweme.analytics.IIMRecUserAnalytics
    public final void LIZIZ(User user, String str) {
        LJ(this, EnumC1260930iux.SHOW, user, str, 4);
    }

    @Override // com.ss.android.ugc.aweme.analytics.IIMRecUserAnalytics
    public final void LIZJ(User user, String str) {
        LJ(this, EnumC1260930iux.ENTER_PROFILE, user, str, 4);
    }

    @Override // com.ss.android.ugc.aweme.analytics.IIMRecUserAnalytics
    public final void LIZLLL(User user, String str) {
        LJ(this, EnumC1260930iux.FOLLOW, user, null, 12);
    }

    public static void LJ(IMRecUserAnalytics iMRecUserAnalytics, EnumC1260930iux enumC1260930iux, User user, String str, int i) {
        if ((i & 8) != 0) {
            str = null;
        }
        iMRecUserAnalytics.getClass();
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        if (str == null) {
            str = "chat";
        }
        c1260910iuv.LJJIJLIJ(str);
        c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.CARD;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJJJIZL("expand_group_chat");
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        c1260910iuv.LJJJJZI(user);
        c1260910iuv.LJIILJJIL();
    }
}
