package com.ss.android.ugc.aweme.tako.botpage.components.shortcut;

import X.C01GW;
import X.C093Y;
import X.C13LC;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1845490y7n;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoClientExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS94S0100000_27;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS571S0100000_27;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoShortcutInteractionAssem extends ReusedUISlotAssem<TakoShortcutInteractionAssem> implements InterfaceC712990Rxx<InterfaceC1845490y7n> {
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 800));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 801));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 802));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fls;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void op() {
        Message messageYy1;
        TakoClientExt takoClientExt;
        TakoCardAbility takoCardAbility = (TakoCardAbility) this.LLJLL.getValue();
        if (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null) {
            return;
        }
        Message messageLIZLLL = Message.LIZLLL(messageYy1, null, 0, false, 0, false, null, false, -1, 2097151);
        TakoMixFeed takoMixFeedLJIIIZ = messageYy1.LJIIIZ();
        TakoMixFeed takoMixFeedLIZ = null;
        if (takoMixFeedLJIIIZ != null) {
            TakoMixFeed takoMixFeedLJIIIZ2 = messageYy1.LJIIIZ();
            takoMixFeedLIZ = TakoMixFeed.LIZ(takoMixFeedLJIIIZ, null, (takoMixFeedLJIIIZ2 == null || (takoClientExt = takoMixFeedLJIIIZ2.clientExt) == null) ? new TakoClientExt("", "", true, null) : new TakoClientExt(takoClientExt.carryRepeatKey, takoClientExt.carryLogId, false, takoClientExt.msgMobParams), -524289);
        }
        messageLIZLLL.LJIIJ(takoMixFeedLIZ);
        IMessageAbility iMessageAbility = (IMessageAbility) this.LLJLILLLLZIIL.getValue();
        if (iMessageAbility != null) {
            iMessageAbility.ua2(messageLIZLLL, false, false);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.v9a);
        View viewFindViewById = view.findViewById(R.id.v9_);
        this.LLJL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AkS94S0100000_27(this, 15), viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.v99);
        this.LLJLIL = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new AkS94S0100000_27(this, 16), viewFindViewById2);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1845490y7n interfaceC1845490y7n) throws JSONException {
        Message messageYy1;
        String str;
        ITakoContextAbility iTakoContextAbility;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str2;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        int i;
        InterfaceC1845490y7n interfaceC1845490y7n2 = interfaceC1845490y7n;
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            if (interfaceC1845490y7n2.LJJJLIIL()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        TakoCardAbility takoCardAbility = (TakoCardAbility) this.LLJLL.getValue();
        if (takoCardAbility != null && (messageYy1 = takoCardAbility.Yy1()) != null && (str = messageYy1.uuid) != null && (iTakoContextAbility = (ITakoContextAbility) this.LLJLLIL.getValue()) != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null && (str2 = c1863850ybP.LLILZIL) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            c1862330yYx.getClass();
            Map<String, Set<String>> map = C1862330yYx.LJIIIZ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Set set = (Set) linkedHashMap.get(str2);
            if (set != null && set.contains(str)) {
                return;
            }
            Set set2 = (Set) linkedHashMap.get(str2);
            if (set2 != null) {
                set2.add(str);
            } else {
                map.put(str2, C093Y.LJ(str));
            }
            ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) this.LLJLLIL.getValue();
            if (iTakoContextAbility2 == null || (c13lcT712 = iTakoContextAbility2.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null) {
                return;
            }
            String str3 = c1863850ybP2.LLILZIL;
            String str4 = c1863850ybP2.LLILZLL;
            if (str4 == null) {
                str4 = "";
            }
            C1862330yYx.LJLLL(c1862330yYx, str3, str4, c1863850ybP2.LLIZ, c1863850ybP2.LL, c1863850ybP2.LLILLJJLI, "message_bubble");
        }
    }

    public final void sp(String str) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJLLIL.getValue();
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = c1863850ybP.LLILZIL;
            String str3 = c1863850ybP.LLILZLL;
            if (str3 == null) {
                str3 = "";
            }
            C1862330yYx.LJLLJ(c1862330yYx, str2, c1863850ybP.LL, c1863850ybP.LLILLJJLI, str3, c1863850ybP.LLIZ, "message_bubble", str);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1845490y7n interfaceC1845490y7n) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1845490y7n interfaceC1845490y7n) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) throws JSONException {
        up(interfaceC1587906Jp);
    }
}
