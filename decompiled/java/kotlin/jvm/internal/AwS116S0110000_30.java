package kotlin.jvm.internal;

import X.C09AY;
import X.C0RTA;
import X.C123100dR;
import X.C13LE;
import X.C1861360yXO;
import X.C1861790yY5;
import X.C1863810ybL;
import X.C20241914If;
import X.C694070RKj;
import X.EnumC20241814Ie;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.novelbot.BottomNovelBotContinueAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.novel.core.TakoNovelBotViewModel;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.NovelStatus;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNovelChoiceSelect;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS116S0110000_30 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS116S0110000_30 awS116S0110000_30, Object obj) {
        C0RTA c0rta = (C0RTA) obj;
        c0rta.LLILLL = C13LE.LIZ(TakoMultipleSelectAssem.class);
        c0rta.LLJILJIL = (View) awS116S0110000_30.l0;
        if (awS116S0110000_30.z1) {
            c0rta.LLILZIL = C694070RKj.LIZIZ;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS116S0110000_30 awS116S0110000_30, Object obj) {
        boolean z;
        C1861790yY5 c1861790yY5 = (C1861790yY5) obj;
        if (!((TakoActiveBotItem) awS116S0110000_30.l0).bot.disableHistory && awS116S0110000_30.z1) {
            z = true;
        } else {
            z = false;
        }
        c1861790yY5.LIZJ = z;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS116S0110000_30 awS116S0110000_30, Object obj) {
        boolean z;
        C1863810ybL c1863810ybL = (C1863810ybL) obj;
        if (!((TakoActiveBotItem) awS116S0110000_30.l0).bot.disableHistory && awS116S0110000_30.z1) {
            z = false;
        } else {
            z = true;
        }
        c1863810ybL.LIZJ = z;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS116S0110000_30 awS116S0110000_30, Object obj) {
        boolean z;
        C20241914If c20241914If = (C20241914If) obj;
        if (awS116S0110000_30.z1 && ((TakoNovelBotViewModel) awS116S0110000_30.l0).LL) {
            z = true;
        } else {
            z = false;
        }
        return C20241914If.LIZ(c20241914If, z, null, 14);
    }

    public static final Object invoke$4(AwS116S0110000_30 awS116S0110000_30, Object obj) {
        String str;
        boolean z;
        TakoMixFeed takoMixFeedLJIIIZ;
        List<TakoNovelChoiceSelect> list;
        TakoNovelChoiceSelect next;
        Message message = (Message) obj;
        String str2 = null;
        if (message == null || (str = message.msgId) == null) {
            str = "";
        }
        if (message != null && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null && (list = takoMixFeedLJIIIZ.selects) != null) {
            Iterator<TakoNovelChoiceSelect> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C1861360yXO.LIZ.getClass();
                    if (C1861360yXO.LIZJ(next, message)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TakoNovelChoiceSelect takoNovelChoiceSelect = next;
            if (takoNovelChoiceSelect != null) {
                str2 = takoNovelChoiceSelect.id;
            }
        }
        try {
            IMessageAbility iMessageAbility = (IMessageAbility) ((BottomNovelBotContinueAssem) awS116S0110000_30.l0).LLJJI.getValue();
            if (iMessageAbility != null) {
                if (awS116S0110000_30.z1 && C123100dR.LIZ(str)) {
                    z = true;
                } else {
                    z = false;
                }
                iMessageAbility.XK2(new NovelStatus(z, str, str2), ((BottomNovelBotContinueAssem) awS116S0110000_30.l0).LLJJJJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((BottomNovelBotContinueAssem) awS116S0110000_30.l0).hp().setStateImmediate(new AwS609S0100000_30(EnumC20241814Ie.FAILED, 314));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0110000_30(View view, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0110000_30(TakoActiveBotItem takoActiveBotItem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = takoActiveBotItem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0110000_30(BottomNovelBotContinueAssem bottomNovelBotContinueAssem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = bottomNovelBotContinueAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0110000_30(boolean z, TakoNovelBotViewModel takoNovelBotViewModel, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = takoNovelBotViewModel;
    }
}
