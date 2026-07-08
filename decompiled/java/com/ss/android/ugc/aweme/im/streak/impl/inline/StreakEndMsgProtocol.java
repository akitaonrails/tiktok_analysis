package com.ss.android.ugc.aweme.im.streak.impl.inline;

import X.C06N0;
import X.C1596506Mx;
import X.C1687406jA;
import X.C1746506sh;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakEndMsgProtocol implements FakeMsgProtocol {
    public final C1687406jA LL = new C1687406jA();
    public final C1746506sh LLILLJJLI = new C1746506sh();
    public final int LLILLL = 21;
    public final int LLILZ = 8;
    public final C1596506Mx LLILZIL = new C06N0() { // from class: X.06Mx
        @Override // X.InterfaceC1756706uL
        public final FakeMsgContent LJFF(C1736606r6 c1736606r6) {
            C06N2 c06n2;
            Object obj = c1736606r6.LJFF;
            if (!(obj instanceof C06N2) || (c06n2 = (C06N2) obj) == null) {
                return null;
            }
            if (c06n2.LIZ) {
                int i = c06n2.LIZJ;
                C0I0B c0i0b = C0I0B.LJFF;
                c0i0b.LIZJ();
                String quantityString = C894660Z7w.LIZ().getResources().getQuantityString(2131755246, i, Integer.valueOf(i), "{{2}}", "{{1}}");
                c0i0b.LIZJ();
                String string = C894660Z7w.LIZ().getResources().getString(2131832124);
                SystemContent systemContent = new SystemContent();
                systemContent.setTips(quantityString);
                SystemContent.Key[] keyArr = new SystemContent.Key[2];
                SystemContent.Key key = new SystemContent.Key();
                key.setKey("1");
                key.setAction(200002);
                key.setExtra(C2097608Jq.LJIIIIZZ(new Pair("streak_badge_streak_level", String.valueOf(c06n2.LIZLLL)), new Pair("streak_badge_streak_num", String.valueOf(c06n2.LIZJ)), new Pair("streak_badge_style", "grey")));
                key.setName("!");
                keyArr[0] = key;
                SystemContent.Key key2 = new SystemContent.Key();
                key2.setKey("2");
                key2.setAction(200001);
                Pair[] pairArr = new Pair[3];
                C06DP.LIZ.getClass();
                Object obj2 = ((Map) C06DP.LIZJ.getValue()).get("streak_restore");
                if (obj2 == null) {
                    obj2 = "";
                }
                pairArr[0] = new Pair("panel_schema", obj2);
                pairArr[1] = new Pair("panel_type", "streak_restore");
                pairArr[2] = new Pair("streak_badge_restorable_before", String.valueOf(c06n2.LIZIZ));
                key2.setExtra(C2097608Jq.LJIIIIZZ(pairArr));
                key2.setName(string);
                keyArr[1] = key2;
                systemContent.setTemplate(keyArr);
                return new C1747106sn(GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), systemContent), c06n2.LJ, !c06n2.LIZ ? 1 : 0, "streak_group_end_with_restore");
            }
            C0I0B.LJFF.LIZJ();
            String string2 = C894660Z7w.LIZ().getResources().getString(2131831528);
            SystemContent systemContent2 = new SystemContent();
            systemContent2.setTips(string2);
            return new C1747106sn(GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), systemContent2), c06n2.LJ, !c06n2.LIZ ? 1 : 0, "streak_group_end_no_restore");
        }
    };

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1681206iA DA() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757306uR j31() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757106uP Ne2() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final int Sv1() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757006uO h80() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final int j40() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1756706uL xf1() {
        return this.LLILZIL;
    }
}
