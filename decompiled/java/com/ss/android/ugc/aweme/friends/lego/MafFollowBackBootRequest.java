package com.ss.android.ugc.aweme.friends.lego;

import X.AbstractC848400XPy;
import X.C0BMR;
import X.C0CO3;
import X.C0XQ7;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2252408s6;
import X.C800010VZv;
import X.C844470XAv;
import X.EnumC799980VZs;
import X.InterfaceC427710Gpt;
import X.InterfaceC800130Va7;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AwS101S1000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class MafFollowBackBootRequest implements InterfaceC800130Va7 {
    public String LL = "";

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MafFollowBackBootRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        C844470XAv.LIZ.getClass();
        return Intrinsics.LJFF("local_test", C844470XAv.LJIILL) ? C0CO3.P0 : C0CO3.NORMAL;
    }

    public final void LIZ() {
        if (!C0BMR.LIZ()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("MafFollowBackBootRequest", "report filter. Not hit experiment");
            return;
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("MafFollowBackBootRequest", "report filter. User is null");
            return;
        }
        if (curUser.historyMaxFollowerCount > 1000) {
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LJI("MafFollowBackBootRequest", "report filter. History max follower count is not meet expectations");
            return;
        }
        String uid = curUser.getUid();
        if (TextUtils.isEmpty(uid) || Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, uid)) {
            int i4 = C2187451AjH.LIZ;
            C1720106oR.LJI("MafFollowBackBootRequest", "report filter. User info is empty");
        } else {
            this.LL = uid;
            C2252408s6.LIZ(new AwS101S1000000_16(uid, 2));
        }
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        C0XQ7.LJFF().LJJIFFI(new InterfaceC427710Gpt() { // from class: X.0e3l
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                String uid;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("type = ");
                sbLIZ.append(i);
                sbLIZ.append(", curUid = ");
                sbLIZ.append(this.LL.LL);
                sbLIZ.append(", oldUser = ");
                String uid2 = null;
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                sbLIZ.append(uid);
                sbLIZ.append(" and new user = ");
                if (user2 != null) {
                    uid2 = user2.getUid();
                }
                sbLIZ.append(uid2);
                C1720106oR.LJI("MafFollowBackBootRequest", C2188811AlT.LIZIZ(sbLIZ));
                if (C123100dR.LIZ(this.LL.LL) && user2 != null && !Intrinsics.LJFF(this.LL.LL, user2.getUid())) {
                    this.LL.LL = user2.getUid();
                    this.LL.LIZ();
                }
            }
        });
        LIZ();
    }
}
