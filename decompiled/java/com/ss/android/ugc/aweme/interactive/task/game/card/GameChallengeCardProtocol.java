package com.ss.android.ugc.aweme.interactive.task.game.card;

import X.C01GW;
import X.C0ICC;
import X.C0ICD;
import X.C0Z2Z;
import X.C0ZOY;
import X.C1510305vh;
import X.C2327809Ae;
import X.C300840Bqk;
import X.C452501pT;
import X.C869590Y9l;
import X.C898560ZMw;
import X.C898790ZNt;
import X.C902730ZbD;
import X.InterfaceC1891350zJl;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ext.IInteractiveTaskIndexTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class GameChallengeCardProtocol implements IMMessageListProtocol<C0ICC> {
    public final Fragment LL;
    public final C898790ZNt LLILLJJLI = new C898790ZNt(new int[]{1816});
    public final MessageListProtocolEnum LLILLL = MessageListProtocolEnum.GAME_CHALLENGE;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1065));
    public final Class<? extends PowerCell<C0ICC>> LLILZIL = GameChallengeCardCell.class;

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C0ICC> getPowerItemClazz() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return list;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C0ICC> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<C0ICC>> getWithCell() {
        return this.LLILZIL;
    }

    public GameChallengeCardProtocol(Fragment fragment) {
        this.LL = fragment;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        C0ICD c0icd;
        GameChallengeCardTemplate gameChallengeCardTemplate;
        boolean zLIZIZ;
        IInteractiveTaskIndexTracker iInteractiveTaskIndexTracker;
        double dDoubleValue;
        Double dLJII;
        String str = "";
        if (C1510305vh.LIZ(c869590Y9l)) {
            String str2 = c869590Y9l.getLocalExt().get("local_ext_game_effect_thumbnail");
            if (str2 == null) {
                str2 = "";
            }
            String str3 = c869590Y9l.getLocalExt().get("local_ext_game_effect_name");
            if (str3 == null) {
                str3 = "";
            }
            String str4 = c869590Y9l.getLocalExt().get("local_ext_game_score");
            if (str4 != null && (dLJII = C2327809Ae.LJII(str4)) != null) {
                dDoubleValue = dLJII.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            c0icd = new C0ICD(str2, str3, dDoubleValue);
            String str5 = c869590Y9l.getLocalExt().get("local_ext_game_task_id");
            if (str5 != null) {
                str = str5;
            }
            gameChallengeCardTemplate = new GameChallengeCardTemplate(str, "", false, 0, null, null, false, null, null, null, null, null, null, null, null, 131057);
        } else {
            c0icd = null;
            gameChallengeCardTemplate = (GameChallengeCardTemplate) C0Z2Z.LIZ(c869590Y9l, GameChallengeCardTemplate.class);
            if (gameChallengeCardTemplate == null) {
                return null;
            }
        }
        if (C300840Bqk.LIZ() && (iInteractiveTaskIndexTracker = (IInteractiveTaskIndexTracker) PluggableExtentionKt.pluggableSpi$default(IInteractiveTaskIndexTracker.class, false, false, false, 14, null)) != null) {
            zLIZIZ = iInteractiveTaskIndexTracker.LIZIZ(c869590Y9l, gameChallengeCardTemplate);
        } else {
            zLIZIZ = false;
        }
        return new C0ICC(Long.valueOf(i), gameChallengeCardTemplate, c0icd, zLIZIZ, ((SkeletonLayoutAssemblerBridge) this.LLILZ.getValue()).mN2(list, new C0ZOY(C898560ZMw.LIZ)).LIZ(list, c869590Y9l, i));
    }
}
