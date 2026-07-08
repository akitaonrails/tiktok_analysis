package com.ss.android.ugc.aweme.im.streak.impl.inline;

import X.C06N0;
import X.C1596606My;
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
public final class StreakPetHatchingMsgProtocol implements FakeMsgProtocol {
    public final C1687406jA LL = new C1687406jA();
    public final C1746506sh LLILLJJLI = new C1746506sh();
    public final int LLILLL = 30;
    public final int LLILZ = 4;
    public final C1596606My LLILZIL = new C06N0() { // from class: X.06My
        @Override // X.InterfaceC1756706uL
        public final FakeMsgContent LJFF(C1736606r6 c1736606r6) {
            C066B c066b;
            Object obj = c1736606r6.LJFF;
            if (!(obj instanceof C066B) || (c066b = (C066B) obj) == null) {
                return null;
            }
            C0I0B.LJFF.LIZJ();
            String string = C894660Z7w.LIZ().getResources().getString(2131831155);
            SystemContent systemContent = new SystemContent();
            systemContent.setTips(string);
            return new C1747106sn(GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), systemContent), c066b.LIZ, 1, "streak_pet_hatching_remind");
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
