package com.ss.android.ugc.aweme.tako.otherpage.third;

import X.C019F;
import X.C01GW;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LC;
import X.C13LE;
import X.C1637806bA;
import X.C1862790yZh;
import X.C1863850ybP;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS158S0100000_24;
import Y.ACListenerS94S0300000_30;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class ThirdPartyTitleAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1363));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS574S0100000_30(this, 277));
    public final AssemVMLazy LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ThirdPartyTitleAssem.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ThirdPartyTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1362), AFwS274S0000000_30.get$arr$(191), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fnx;
    }

    public final ITakoContextAbility hp() {
        return (ITakoContextAbility) this.LLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        String str3;
        Long lValueOf;
        String str4;
        String str5;
        String str6;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        C13LC<C1863850ybP> c13lcT713;
        C1863850ybP c1863850ybP3;
        String str7;
        C13LC<C1863850ybP> c13lcT714;
        C1863850ybP c1863850ybP4;
        C13LC<C1863850ybP> c13lcT715;
        C1863850ybP c1863850ybP5;
        C13LC<C1863850ybP> c13lcT716;
        C1863850ybP c1863850ybP6;
        super.onViewCreated(view);
        Pair[] pairArr = new Pair[5];
        ITakoContextAbility iTakoContextAbilityHp = hp();
        String str8 = "";
        if (iTakoContextAbilityHp == null || (c13lcT716 = iTakoContextAbilityHp.T71()) == null || (c1863850ybP6 = (C1863850ybP) c13lcT716.LIZIZ()) == null || (str = c1863850ybP6.LL) == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        ITakoContextAbility iTakoContextAbilityHp2 = hp();
        if (iTakoContextAbilityHp2 == null || (c13lcT715 = iTakoContextAbilityHp2.T71()) == null || (c1863850ybP5 = (C1863850ybP) c13lcT715.LIZIZ()) == null || (str2 = c1863850ybP5.LLILLJJLI) == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("enter_method", str2);
        ITakoContextAbility iTakoContextAbilityHp3 = hp();
        if (iTakoContextAbilityHp3 == null || (c13lcT714 = iTakoContextAbilityHp3.T71()) == null || (c1863850ybP4 = (C1863850ybP) c13lcT714.LIZIZ()) == null || (str3 = c1863850ybP4.LLILZIL) == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("process_id", str3);
        ITakoContextAbility iTakoContextAbilityHp4 = hp();
        if (iTakoContextAbilityHp4 != null && (c13lcT713 = iTakoContextAbilityHp4.T71()) != null && (c1863850ybP3 = (C1863850ybP) c13lcT713.LIZIZ()) != null && (str7 = c1863850ybP3.LLILLL) != null) {
            str8 = str7;
        }
        pairArr[3] = new Pair("search_id", str8);
        ITakoContextAbility iTakoContextAbilityHp5 = hp();
        AIBotInfo botInfo = null;
        if (iTakoContextAbilityHp5 != null && (c13lcT712 = iTakoContextAbilityHp5.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null) {
            lValueOf = Long.valueOf(c1863850ybP2.LLJJ);
        } else {
            lValueOf = null;
        }
        pairArr[4] = new Pair("bot_id", String.valueOf(lValueOf));
        HashMap mapLJI = C2097608Jq.LJI(pairArr);
        ITakoContextAbility iTakoContextAbilityHp6 = hp();
        if (iTakoContextAbilityHp6 != null && (c13lcT71 = iTakoContextAbilityHp6.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            str4 = c1863850ybP.LLJLLIL;
        } else {
            str4 = null;
        }
        Map mapLJIIL = C2097608Jq.LJIIL(mapLJI, new C1862790yZh(str4).LIZ());
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.xcy);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS158S0100000_24(this, 61));
        }
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.xd0);
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS94S0300000_30(view, this, mapLJIIL, 1));
        }
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.xcx);
        ITakoAIBotUIAbility iTakoAIBotUIAbility = (ITakoAIBotUIAbility) this.LLJJIII.getValue();
        if (iTakoAIBotUIAbility != null && (botInfo = iTakoAIBotUIAbility.getBotInfo()) != null && (str6 = botInfo.botAvatar) != null && C123100dR.LIZ(str6)) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str6);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            c1331670kl3LJIIIZ.LJIIIIZZ = iLIZIZ;
            c1331670kl3LJIIIZ.LJIIIZ = iLIZIZ2;
            c1331670kl3LJIIIZ.LJIIJJI();
        }
        TextView textView = (TextView) view.findViewById(R.id.xcw);
        if (botInfo != null && (str5 = botInfo.botName) != null && C123100dR.LIZ(str5)) {
            textView.setText(str5);
        }
    }
}
