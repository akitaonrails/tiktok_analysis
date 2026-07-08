package com.ss.android.ugc.aweme.tako.botpage.cards.ability;

import X.C01GW;
import X.C0R2X;
import X.C13LC;
import X.C13LP;
import X.C1558520qew;
import X.C1858660yT2;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C452501pT;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.vm.NimbleVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class NimbleUserDependAbilityImpl<T extends C1858660yT2> implements INimbleUserDependAbility {
    public final TakoAnswerBaseAssem<T> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10((NimbleUserDependAbilityImpl) this, 846));

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final void Aq0() {
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final void BR() {
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final void Bo0() {
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final void Kp0() {
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final void Py2() {
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final void eW0() {
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final Map<String, String> G7() {
        Map<String, String> mapLJ;
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("message_id", this.LL.Yy1().uuid));
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLILLJJLI.getValue();
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return C2097608Jq.LJIIL(mapLIZJ, mapLJ);
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final void Gt() {
        ViewGroup viewGroupY4 = this.LL.Y4();
        if (viewGroupY4 != null) {
            viewGroupY4.performLongClick();
        }
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final String getEnterFrom() {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLILLJJLI.getValue();
        if (iTakoContextAbility == null || (c13lcT71 = iTakoContextAbility.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null) {
            return null;
        }
        return c1863850ybP.LL;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final String getMessageId() {
        return this.LL.Yy1().uuid;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final TakoUserItem getUser() {
        List<TakoUserItem> list;
        TakoMixFeed takoMixFeedLJIIIZ = this.LL.Yy1().LJIIIZ();
        if (takoMixFeedLJIIIZ == null || (list = takoMixFeedLJIIIZ.userList) == null) {
            return null;
        }
        return (TakoUserItem) C13LP.LJJJLZIJ(0, list);
    }

    public NimbleUserDependAbilityImpl(TakoAnswerBaseAssem<T> takoAnswerBaseAssem) {
        this.LL = takoAnswerBaseAssem;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final void JP(User user) {
        String uid = user.getUid();
        if (uid != null) {
            NimbleVM.LLILLJJLI.put(uid, user);
        }
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final void LD0(String str) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String string;
        Integer numValueOf;
        String str2;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLILLJJLI.getValue();
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            Message messageYy1 = this.LL.Yy1();
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str3 = c1863850ybP.LL;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = c1863850ybP.LLILLJJLI;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c1863850ybP.LLILZIL;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = messageYy1.uuid;
            if (str6 == null) {
                str6 = "";
            }
            String strValueOf = String.valueOf(messageYy1.botId);
            long j = messageYy1.actionId;
            String str7 = messageYy1.subSessionId;
            String str8 = c1863850ybP.LLILLL;
            Integer numValueOf2 = null;
            TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), TakoCardAbility.class, null);
            if (takoCardAbility != null) {
                string = Integer.valueOf(takoCardAbility.t70()).toString();
            } else {
                string = null;
            }
            TakoMixFeed takoMixFeedLJIIIZ = messageYy1.LJIIIZ();
            if (takoMixFeedLJIIIZ != null) {
                numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
            } else {
                numValueOf = null;
            }
            String strLIZIZ = C0R2X.LIZIZ(numValueOf);
            boolean z = messageYy1.isMultiAnswer;
            if (z) {
                str2 = "multi_answer";
            } else {
                str2 = "default";
            }
            if (z) {
                numValueOf2 = Integer.valueOf(messageYy1.selectedAnswerIndex + 1);
            }
            String str9 = c1863850ybP.LLIZ;
            String str10 = c1863850ybP.LLILZLL;
            if (str10 == null) {
                str10 = "";
            }
            C1862330yYx.LJJJJIZL(c1862330yYx, str3, str4, str6, str5, str10, str9, strValueOf, Long.valueOf(j), str7, str8, "user", str, string, strLIZIZ, null, null, null, str, str2, numValueOf2, null, null, null, null, null, null, null, null, null, 1071874048);
        }
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final void mC0(String str) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String string;
        Integer numValueOf;
        String str2;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLILLJJLI.getValue();
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            Message messageYy1 = this.LL.Yy1();
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str3 = c1863850ybP.LL;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = c1863850ybP.LLILLJJLI;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c1863850ybP.LLILZIL;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = messageYy1.uuid;
            if (str6 == null) {
                str6 = "";
            }
            String strValueOf = String.valueOf(messageYy1.botId);
            long j = messageYy1.actionId;
            String str7 = messageYy1.subSessionId;
            String str8 = c1863850ybP.LLILLL;
            Integer numValueOf2 = null;
            TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), TakoCardAbility.class, null);
            if (takoCardAbility != null) {
                string = Integer.valueOf(takoCardAbility.t70()).toString();
            } else {
                string = null;
            }
            TakoMixFeed takoMixFeedLJIIIZ = messageYy1.LJIIIZ();
            if (takoMixFeedLJIIIZ != null) {
                numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
            } else {
                numValueOf = null;
            }
            String strLIZIZ = C0R2X.LIZIZ(numValueOf);
            boolean z = messageYy1.isMultiAnswer;
            if (z) {
                str2 = "multi_answer";
            } else {
                str2 = "default";
            }
            if (z) {
                numValueOf2 = Integer.valueOf(messageYy1.selectedAnswerIndex + 1);
            }
            String str9 = c1863850ybP.LLIZ;
            String str10 = c1863850ybP.LLILZLL;
            if (str10 == null) {
                str10 = "";
            }
            C1862330yYx.LJJJJJ(c1862330yYx, str3, str4, str6, str5, str10, str9, strValueOf, Long.valueOf(j), str7, str8, "user", str, string, strLIZIZ, null, null, null, str, str2, numValueOf2, null, null, null, null, null, null, null, null, null, false, 2145615872);
        }
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility
    public final User s10(String str) {
        return NimbleVM.LLILLJJLI.get(str);
    }
}
