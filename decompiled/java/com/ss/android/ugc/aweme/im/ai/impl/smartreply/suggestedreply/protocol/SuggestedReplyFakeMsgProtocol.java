package com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.protocol;

import X.C06N4;
import X.C1687406jA;
import X.C1746406sg;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class SuggestedReplyFakeMsgProtocol implements FakeMsgProtocol {
    public final int LL = 49;
    public final int LLILLJJLI = 12;
    public final C06N4 LLILLL = new InterfaceC1756706uL() { // from class: X.06N4
        @Override // X.InterfaceC1756706uL
        public final void LIZ(C1736606r6 c1736606r6, C869590Y9l c869590Y9l) {
        }

        @Override // X.InterfaceC1756706uL
        public final int LIZIZ() {
            return 4;
        }

        @Override // X.InterfaceC1756706uL
        public final void LIZJ() {
        }

        @Override // X.InterfaceC1756706uL
        public final Set<Integer> LIZLLL() {
            return null;
        }

        @Override // X.InterfaceC1756706uL
        public final int LJ() {
            return 3;
        }

        @Override // X.InterfaceC1756706uL
        public final int LJI() {
            return 1;
        }

        @Override // X.InterfaceC1756706uL
        public final boolean LJII(C1736606r6 c1736606r6) {
            return false;
        }

        @Override // X.InterfaceC1756706uL
        public final FakeMsgContent LJFF(C1736606r6 c1736606r6) {
            C0I0B c0i0b = C0I0B.LJFF;
            c0i0b.LIZJ();
            String string = C894660Z7w.LIZ().getResources().getString(2131848487, "{{1}}");
            SystemContent systemContent = new SystemContent();
            systemContent.setTips(string);
            SystemContent.Key key = new SystemContent.Key();
            key.setKey("1");
            c0i0b.LIZJ();
            key.setName(C894660Z7w.LIZ().getResources().getString(2131848488));
            key.setAction(45);
            systemContent.setTemplate(new SystemContent.Key[]{key});
            c0i0b.LIZJ();
            systemContent.setFallbackTips(C894660Z7w.LIZ().getResources().getString(2131848487, 2131848488));
            systemContent.setSceneTips(C2097608Jq.LJIIJ(new Pair("inbox_tips", string)));
            return new C1747006sm(GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), systemContent));
        }
    };
    public final C1687406jA LLILZ = new C1687406jA();
    public final C1746406sg LLILZIL = new InterfaceC1757106uP() { // from class: X.06sg
        @Override // X.InterfaceC1757106uP
        public final C869590Y9l LIZ(C0Y8T c0y8t, C1736606r6 c1736606r6, FakeMsgContent fakeMsgContent) {
            if (!(fakeMsgContent instanceof C1747006sm)) {
                return null;
            }
            C1747006sm c1747006sm = (C1747006sm) fakeMsgContent;
            if (c1747006sm.LLILLJJLI.length() == 0 || c0y8t == null) {
                return null;
            }
            long jLongValue = 0;
            C869680Y9u c869680Y9u = new C869680Y9u(0L, "");
            c869680Y9u.msgType(c1747006sm.LL);
            c869680Y9u.scene(c1747006sm.LLILZ);
            c869680Y9u.content(c1747006sm.LLILLJJLI);
            c869680Y9u.createdAt(c1747006sm.LLILLL);
            C869590Y9l c869590Y9lBuild = c869680Y9u.build();
            String string = c1736606r6.LIZJ;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            c869590Y9lBuild.setUuid(string);
            c869590Y9lBuild.setMsgStatus(5);
            c869590Y9lBuild.setSvrStatus(0);
            c869590Y9lBuild.setReadStatus(c1747006sm.LLILZIL);
            c869590Y9lBuild.setConversationId(c0y8t.getConversationId());
            c869590Y9lBuild.setConversationShortId(c0y8t.getConversationShortId());
            c869590Y9lBuild.setConversationType(c0y8t.getConversationType());
            C869590Y9l c869590Y9l = c1736606r6.LJ;
            if (c869590Y9l != null) {
                jLongValue = Long.valueOf(c869590Y9l.getIndex() + 1).longValue();
            }
            c869590Y9lBuild.setIndex(jLongValue);
            c869590Y9lBuild.setIndexInConversationV2(-1L);
            c869590Y9lBuild.addLocalExt("s:message_index_is_local", "1");
            c869590Y9lBuild.addLocalExt("a:disable_inner_push", "1");
            return c869590Y9lBuild;
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
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final int Sv1() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757006uO h80() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final int j40() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1756706uL xf1() {
        return this.LLILLL;
    }
}
