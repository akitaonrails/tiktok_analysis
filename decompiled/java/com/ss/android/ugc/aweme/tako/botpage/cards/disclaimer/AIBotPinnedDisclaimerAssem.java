package com.ss.android.ugc.aweme.tako.botpage.cards.disclaimer;

import X.C003K;
import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C1857690yRT;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C747440TTq;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.CsiBotData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class AIBotPinnedDisclaimerAssem extends ReusedUISlotAssem<AIBotPinnedDisclaimerAssem> implements InterfaceC712990Rxx<C003K> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 222));
    public final AssemVMLazy LLJL;
    public TuxTextView LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AIBotPinnedDisclaimerAssem.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AIBotPinnedDisclaimerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1260), AFwS274S0000000_30.get$arr$(145), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fjx;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean z;
        AIBotInfo botInfo;
        String str;
        CsiBotData csiBotData;
        Integer numZH;
        AIBotInfo botInfo2;
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.fvl);
        ITakoAIBotUIAbility iTakoAIBotUIAbility = (ITakoAIBotUIAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iTakoAIBotUIAbility != null && (botInfo2 = iTakoAIBotUIAbility.getBotInfo()) != null && botInfo2.isCsiBot()) {
            z = true;
        } else {
            z = false;
        }
        String string = null;
        if (z) {
            TuxTextView tuxTextView = this.LLJLIL;
            if (tuxTextView != null) {
                Context context = getContext();
                if (context != null) {
                    string = context.getString(2131830400);
                }
                tuxTextView.setText(string);
            }
        } else {
            TuxTextView tuxTextView2 = this.LLJLIL;
            if (tuxTextView2 != null) {
                Context context2 = getContext();
                if (context2 != null) {
                    string = context2.getString(2131849799);
                }
                tuxTextView2.setText(string);
            }
        }
        ITakoAIBotUIAbility iTakoAIBotUIAbility2 = (ITakoAIBotUIAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iTakoAIBotUIAbility2 != null && (numZH = iTakoAIBotUIAbility2.zH()) != null) {
            int iIntValue = numZH.intValue();
            TuxTextView tuxTextView3 = this.LLJLIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setTextColor(iIntValue);
            }
        }
        ITakoAIBotUIAbility iTakoAIBotUIAbility3 = (ITakoAIBotUIAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iTakoAIBotUIAbility3 != null && (botInfo = iTakoAIBotUIAbility3.getBotInfo()) != null && botInfo.isCsiBot()) {
            TuxTextView tuxTextView4 = this.LLJLIL;
            if (tuxTextView4 != null) {
                AssemVMLazy assemVMLazy = this.LLJL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
                TakoEnterParams takoEnterParams = ((MessageViewModel) assemVMLazy.getValue()).LLILLL;
                if (takoEnterParams == null || (csiBotData = takoEnterParams.csiBotData) == null || (str = csiBotData.aboutSchema) == null) {
                    str = "";
                }
                C747440TTq.LIZIZ(tuxTextView4, 82, str, Integer.valueOf(R.attr.a1j), 1);
                return;
            }
            return;
        }
        TuxTextView tuxTextView5 = this.LLJLIL;
        if (tuxTextView5 == null) {
            return;
        }
        C1857690yRT.LIZ(tuxTextView5, null, null, null, null, 15);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C003K c003k) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C003K c003k) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C003K c003k) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
