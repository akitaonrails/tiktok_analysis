package com.ss.android.ugc.aweme.relation.auth.widget.cell;

import X.C0SY7;
import X.C0XQ7;
import X.C1074740e4e;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS119S0200000_16;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public final class FacebookMaFCell extends AuthMaFPowerCell<C1074740e4e> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        String uid2;
        Boolean boolPutIfAbsent;
        C1074740e4e c1074740e4e = (C1074740e4e) interfaceC1891350zJl;
        super.onBindItemView(c1074740e4e);
        User user = c1074740e4e.LLILZIL;
        User curUser = C0XQ7.LJFF().getCurUser();
        Pair<String, String> pair = null;
        if (curUser != null) {
            uid = curUser.getUid();
        } else {
            uid = null;
        }
        if (user != null) {
            uid2 = user.getUid();
        } else {
            uid2 = null;
        }
        if (uid != null && uid2 != null) {
            pair = new Pair<>(uid, uid2);
        }
        boolean zBooleanValue = true;
        if (user == null || user.getFollowStatus() != C0SY7.UNFOLLOW.getValue() || user.getFollowerStatus() != C0SY7.FOLLOWED.getValue()) {
            zBooleanValue = false;
        }
        if (pair != null) {
            ConcurrentHashMap<Pair<String, String>, Boolean> concurrentHashMap = c1074740e4e.LLILZ.LJIIIZ;
            Boolean boolValueOf = concurrentHashMap.get(pair);
            if (boolValueOf == null && (boolPutIfAbsent = concurrentHashMap.putIfAbsent(pair, (boolValueOf = Boolean.valueOf(zBooleanValue)))) != null) {
                boolValueOf = boolPutIfAbsent;
            }
            Boolean bool = boolValueOf;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        I5(c1074740e4e.LLILZIL, c1074740e4e.LLILLL, zBooleanValue);
        C786410Ut5.I7(new ACListenerS119S0200000_16(this, c1074740e4e, 37), this.itemView);
    }
}
