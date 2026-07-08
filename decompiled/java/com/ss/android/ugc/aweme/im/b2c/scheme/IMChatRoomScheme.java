package com.ss.android.ugc.aweme.im.b2c.scheme;

import X.AbstractC1950107kR;
import X.C0I0B;
import X.C1400340mXo;
import X.C1918107fH;
import X.C1950707kX;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class IMChatRoomScheme extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        String str2;
        Object obj = map.get("own_uid");
        if ((obj instanceof String) && (str2 = (String) obj) != null && str2.length() != 0 && !Intrinsics.LJFF(obj, ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId())) {
            if (((Number) C1918107fH.LIZ.getValue()).intValue() == 1) {
                map.put("tab", 1);
                return new Pair<>("//main", map);
            }
            return new Pair<>("", map);
        }
        return new Pair<>("//im/chat_room", map);
    }
}
