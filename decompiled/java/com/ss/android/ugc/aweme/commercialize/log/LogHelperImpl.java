package com.ss.android.ugc.aweme.commercialize.log;

import X.C0VWN;
import X.C1245020iVI;
import X.C2082308Dt;
import X.C735350Ssv;
import X.C735410St1;
import X.C735800Ste;
import X.InterfaceC1210900hcG;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes20.dex */
public final class LogHelperImpl implements LogHelper {
    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void LIZ(User user) {
        String str;
        boolean zLIZJ = C1245020iVI.LIZJ(user);
        C735800Ste c735800Ste = new C735800Ste("follow_refuse");
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c735800Ste.LJFF("enter_from", "notification_page", c2082308Dt);
        c735800Ste.LJFF("to_user_id", user.getUid(), c2082308Dt);
        if (zLIZJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c735800Ste.LJFF("has_label", str, c2082308Dt);
        c735800Ste.LJFF("has_follow_message", CardStruct.IStatusCode.DEFAULT, c2082308Dt);
        c735800Ste.LJFF("has_follow_tag", CardStruct.IStatusCode.DEFAULT, c2082308Dt);
        c735800Ste.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void LIZIZ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, String str) {
        C0VWN.LIZ(str, false).LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void LIZJ(String str, String str2) {
        C735350Ssv c735350Ssv = new C735350Ssv();
        c735350Ssv.LIZLLL = str;
        c735350Ssv.LJJLIIIJJIZ = str2;
        c735350Ssv.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void LIZLLL(int i, String str, String str2) {
        C735410St1 c735410St1 = new C735410St1();
        c735410St1.LIZLLL = str;
        c735410St1.LJJLIIIJILLIZJL = "click_card";
        c735410St1.LJJLIIJ = str2;
        c735410St1.LJLJL = i;
        c735410St1.LJIILJJIL();
    }
}
