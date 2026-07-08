package com.ss.android.ugc.aweme.socialgame.api.fakemessage;

import X.C1684806ik;
import X.C1684906il;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import com.ss.android.ugc.aweme.socialgame.api.experiment.EmojiGameItemConfig;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS87S1200000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class EmojiGameFakeInlineProtocol implements FakeMsgProtocol {
    public final int LL = 43;
    public final int LLILLJJLI = 12;
    public final C1684906il LLILLL = new InterfaceC1756706uL() { // from class: X.06il
        @Override // X.InterfaceC1756706uL
        public final void LIZ(C1736606r6 c1736606r6, C869590Y9l c869590Y9l) {
        }

        @Override // X.InterfaceC1756706uL
        public final int LIZIZ() {
            return 1;
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
            Context context;
            EmojiGameInfo emojiGameInfo;
            String json;
            SessionInfo sessionInfo;
            ISocialGameService iSocialGameService;
            int iIntValue;
            int i;
            String string;
            Integer num;
            Integer num2;
            WeakReference<Context> weakReference = c1736606r6.LIZIZ;
            Integer num3 = null;
            if (weakReference == null || (context = weakReference.get()) == null) {
                return null;
            }
            Object obj = c1736606r6.LJFF;
            if (!(obj instanceof EmojiGameInfo) || (emojiGameInfo = (EmojiGameInfo) obj) == null || (json = GsonProtectorUtils.toJson(C051M.LIZ, emojiGameInfo)) == null || (sessionInfo = (SessionInfo) c1736606r6.LJI.LIZ(C1685406iq.LIZ)) == null || (iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpi$default(ISocialGameService.class, false, false, false, 14, null)) == null) {
                return null;
            }
            EmojiGameItemConfig emojiGameItemConfigLJ = iSocialGameService.LJ(sessionInfo, emojiGameInfo);
            if (emojiGameItemConfigLJ != null) {
                num3 = emojiGameItemConfigLJ.id;
            }
            String strLIZLLL = iSocialGameService.LIZLLL(num3);
            if (emojiGameItemConfigLJ != null && (num2 = emojiGameItemConfigLJ.id) != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            int i2 = 2131831157;
            if (iIntValue > 1) {
                i = 2131831157;
            } else {
                i = 2131833863;
            }
            String strJ4 = C786410Ut5.j4(context.getString(i), Arrays.copyOf(new Object[]{"{{emoji_game}}"}, 1));
            if (strLIZLLL == null) {
                string = context.getString(2131833862);
            } else {
                string = strLIZLLL;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://social_game?game_info=");
            sbLIZ.append(json);
            List listSingletonList = Collections.singletonList(new FakeInlineMsgTemplate("emoji_game", string, C2188811AlT.LIZIZ(sbLIZ), 43, C2097908Jt.LIZJ(new Pair("emoji_game_info", json))));
            if (emojiGameItemConfigLJ == null || (num = emojiGameItemConfigLJ.id) == null || num.intValue() <= 1) {
                i2 = 2131833863;
            }
            String string2 = context.getString(i2);
            Object[] objArr = new Object[1];
            if (strLIZLLL == null) {
                strLIZLLL = context.getString(2131833862);
            }
            objArr[0] = strLIZLLL;
            return new FakeInlineMsgContent(4070, strJ4, listSingletonList, C786410Ut5.j4(string2, Arrays.copyOf(objArr, 1)));
        }
    };
    public final C1684806ik LLILZ = new InterfaceC1681206iA() { // from class: X.06ik
        public final Set<Integer> LIZ = Collections.singleton(43);

        @Override // X.InterfaceC1681206iA
        public final Set<Integer> LIZIZ() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1681206iA
        public final InterfaceC1681906iH LIZ(int i) {
            if (!this.LIZ.contains(Integer.valueOf(i))) {
                return null;
            }
            return new InterfaceC1681906iH() { // from class: X.06ij
                @Override // X.InterfaceC1681906iH
                public final void LIZ(FakeInlineMsgContent fakeInlineMsgContent, Context context, String str, C1708206mW c1708206mW) {
                    FakeInlineMsgTemplate fakeInlineMsgTemplate;
                    Map<String, String> map;
                    if (context != null && (fakeInlineMsgTemplate = (FakeInlineMsgTemplate) C13LP.LJJJLZIJ(0, fakeInlineMsgContent.templates)) != null && (map = fakeInlineMsgTemplate.extra) != null) {
                        String orDefault = map.getOrDefault("emoji_game_info", "");
                        SessionInfo sessionInfo = (SessionInfo) c1708206mW.LIZ(C1685406iq.LIZ);
                        if (sessionInfo == null) {
                            return;
                        }
                        try {
                            ISocialGameService iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpi$default(ISocialGameService.class, false, false, false, 14, null);
                            if (iSocialGameService != null) {
                                iSocialGameService.LJIIJ(sessionInfo, new AwS87S1200000_2(context, sessionInfo, orDefault, 7));
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            };
        }
    };

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757106uP Ne2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757006uO h80() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757306uR j31() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1681206iA DA() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final int Sv1() {
        return this.LL;
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
