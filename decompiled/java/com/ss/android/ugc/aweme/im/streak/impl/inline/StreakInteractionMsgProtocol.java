package com.ss.android.ugc.aweme.im.streak.impl.inline;

import X.C06N0;
import X.C1596706Mz;
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

/* JADX INFO: loaded from: classes3.dex */
public final class StreakInteractionMsgProtocol implements FakeMsgProtocol {
    public final C1687406jA LL = new C1687406jA();
    public final C1746506sh LLILLJJLI = new C1746506sh();
    public final int LLILLL = 56;
    public final int LLILZ = 4;
    public final C1596706Mz LLILZIL = new C06N0() { // from class: X.06Mz
        @Override // X.C06N0, X.InterfaceC1756706uL
        public final int LIZIZ() {
            return 1;
        }

        @Override // X.InterfaceC1756706uL
        public final FakeMsgContent LJFF(C1736606r6 c1736606r6) {
            SystemContent systemContent = new SystemContent();
            systemContent.setTips(C1710306mr.LIZIZ(2131832117, "{s_fireIcon}"));
            SystemContent.Key key = new SystemContent.Key();
            key.setKey("%s");
            key.setAction(26);
            key.setName("{s_fireIcon}");
            systemContent.setTemplate(new SystemContent.Key[]{key});
            return new C1747106sn(GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), systemContent), System.currentTimeMillis(), 1, "streak_content_based_education");
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
