package com.ss.android.ugc.aweme.fakemsg;

import X.C1689506jV;
import X.C1689606jW;
import X.C1747606ss;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import android.content.Context;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupFakeWriteFakeMsgProtocol implements FakeMsgProtocol {
    public final int LL = 44;
    public final int LLILLJJLI = 8;
    public final C1689506jV LLILLL = new InterfaceC1756706uL() { // from class: X.06jV
        @Override // X.InterfaceC1756706uL
        public final void LIZ(C1736606r6 c1736606r6, C869590Y9l c869590Y9l) {
        }

        @Override // X.InterfaceC1756706uL
        public final int LIZIZ() {
            return 6;
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
            String strLIZIZ;
            String uid;
            String uid2;
            String nickname;
            WeakReference<Context> weakReference = c1736606r6.LIZIZ;
            String nickname2 = null;
            if (weakReference == null || (context = weakReference.get()) == null) {
                return null;
            }
            String string = context.getString(2131831449);
            Object[] objArr = new Object[1];
            IMFriendsService.LIZ.getClass();
            IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
            if (iMFriendsServiceLIZ != null) {
                User userLIZLLL = C461720I8s.LIZLLL();
                if (userLIZLLL != null) {
                    uid2 = userLIZLLL.getUid();
                } else {
                    uid2 = null;
                }
                User userLIZLLL2 = C461720I8s.LIZLLL();
                if (userLIZLLL2 != null) {
                    nickname = userLIZLLL2.getNickname();
                } else {
                    nickname = null;
                }
                strLIZIZ = iMFriendsServiceLIZ.LIZIZ(uid2, nickname);
            } else {
                strLIZIZ = null;
            }
            String str = "";
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            objArr[0] = strLIZIZ;
            String strJ4 = C786410Ut5.j4(string, Arrays.copyOf(objArr, 1));
            String string2 = context.getString(2131831449);
            Object[] objArr2 = new Object[1];
            IMFriendsService iMFriendsServiceLIZ2 = C898270ZLt.LIZ();
            if (iMFriendsServiceLIZ2 != null) {
                User userLIZLLL3 = C461720I8s.LIZLLL();
                if (userLIZLLL3 != null) {
                    uid = userLIZLLL3.getUid();
                } else {
                    uid = null;
                }
                User userLIZLLL4 = C461720I8s.LIZLLL();
                if (userLIZLLL4 != null) {
                    nickname2 = userLIZLLL4.getNickname();
                }
                String strLIZIZ2 = iMFriendsServiceLIZ2.LIZIZ(uid, nickname2);
                if (strLIZIZ2 != null) {
                    str = strLIZIZ2;
                }
            }
            objArr2[0] = str;
            return new FakeInlineMsgContent(4071, strJ4, null, C786410Ut5.j4(string2, Arrays.copyOf(objArr2, 1)), 4, null);
        }
    };
    public final C1689606jW LLILZ = new InterfaceC1757006uO() { // from class: X.06jW
        @Override // X.InterfaceC1757006uO
        public final Set<Integer> LIZ() {
            return null;
        }

        @Override // X.InterfaceC1757006uO
        public final void LIZJ(C1736606r6 c1736606r6) {
        }

        @Override // X.InterfaceC1757006uO
        public final boolean LIZLLL(C1736606r6 c1736606r6) {
            return false;
        }

        @Override // X.InterfaceC1757006uO
        public final String LIZIZ(C1736606r6 c1736606r6) {
            return c1736606r6.LIZJ;
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
        return new C1747606ss() { // from class: X.06sr
            @Override // X.C1747606ss, X.InterfaceC1757106uP
            public final C869590Y9l LIZ(C0Y8T c0y8t, C1736606r6 c1736606r6, FakeMsgContent fakeMsgContent) {
                C869590Y9l c869590Y9lLIZ = super.LIZ(c0y8t, c1736606r6, fakeMsgContent);
                if (c869590Y9lLIZ != null) {
                    c869590Y9lLIZ.setReadStatus(1);
                    return c869590Y9lLIZ;
                }
                return null;
            }
        };
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
