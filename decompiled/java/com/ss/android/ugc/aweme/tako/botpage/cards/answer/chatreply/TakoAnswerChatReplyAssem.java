package com.ss.android.ugc.aweme.tako.botpage.cards.answer.chatreply;

import X.C019F;
import X.C01GW;
import X.C0HZQ;
import X.C0PEM;
import X.C1196004m6;
import X.C13LC;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C1855880yOY;
import X.C1856050yOp;
import X.C1857030yQP;
import X.C1857280yQo;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C19719912Dl;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C23250099c;
import X.C326880Cre;
import X.C427660Gpo;
import X.C452501pT;
import X.C723830SaL;
import X.C724750Sbp;
import X.InterfaceC1860810yWV;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerChatReplyAssem extends TakoAnswerBaseAssem<C1857030yQP> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLZL;
    public final C01GW LLLLZLLLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 698));
    public final C01GW LLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 699));
    public final AssemVMLazy LLLZI;
    public C1857030yQP LLLZIIL;
    public final C01GW LLLZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAnswerChatReplyAssem.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLZL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoAnswerChatReplyAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        this.LLLZI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS571S0100000_27(c19719912DlLIZ, OppoPermissionPopupMaskDelayExp.DEFAULT), AFwS269S0000000_27.get$arr$(205), null, true);
        this.LLLZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 701));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmk;
    }

    public final ITakoContextAbility Vr() {
        return (ITakoContextAbility) this.LLLLZLLLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void JU1() {
        String str;
        String str2;
        String str3;
        C326880Cre c326880Cre;
        Message message;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        C13LC<C1863850ybP> c13lcT713;
        C1863850ybP c1863850ybP3;
        C326880Cre c326880Cre2;
        Message message2;
        C326880Cre c326880Cre3;
        Message message3;
        C13LC<C1863850ybP> c13lcT714;
        C1863850ybP c1863850ybP4;
        ITakoContextAbility iTakoContextAbilityVr = Vr();
        String str4 = null;
        String str5 = (iTakoContextAbilityVr == null || (c13lcT714 = iTakoContextAbilityVr.T71()) == null || (c1863850ybP4 = (C1863850ybP) c13lcT714.LIZIZ()) == null) ? null : c1863850ybP4.LLILZIL;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        Map<String, List<String>> map = C1196004m6.LIZ;
        Iterable iterable = (Iterable) C1856050yOp.LIZIZ(str5, map);
        if (iterable != null) {
            C1857030yQP c1857030yQP = this.LLLZIIL;
            if (C13LP.LJJJJ((c1857030yQP == null || (c326880Cre3 = c1857030yQP.LLJJIJI) == null || (message3 = c326880Cre3.LLILLL) == null) ? null : message3.uuid, iterable)) {
                return;
            }
        }
        List<String> arrayList = (List) C1856050yOp.LIZIZ(str5, map);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        C1857030yQP c1857030yQP2 = this.LLLZIIL;
        if (c1857030yQP2 == null || (c326880Cre2 = c1857030yQP2.LLJJIJI) == null || (message2 = c326880Cre2.LLILLL) == null || (str = message2.uuid) == null) {
            str = "";
        }
        arrayList.add(str);
        map.put(str5, arrayList);
        ITakoContextAbility iTakoContextAbilityVr2 = Vr();
        Map<String, String> commonParams = iTakoContextAbilityVr2 != null ? iTakoContextAbilityVr2.getCommonParams() : null;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbilityVr3 = Vr();
        String str7 = (iTakoContextAbilityVr3 == null || (c13lcT713 = iTakoContextAbilityVr3.T71()) == null || (c1863850ybP3 = (C1863850ybP) c13lcT713.LIZIZ()) == null) ? null : c1863850ybP3.LL;
        ITakoContextAbility iTakoContextAbilityVr4 = Vr();
        String str8 = (iTakoContextAbilityVr4 == null || (c13lcT712 = iTakoContextAbilityVr4.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null) ? null : c1863850ybP2.LLILLJJLI;
        ITakoContextAbility iTakoContextAbilityVr5 = Vr();
        String str9 = (iTakoContextAbilityVr5 == null || (c13lcT71 = iTakoContextAbilityVr5.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null) ? null : c1863850ybP.LLILZIL;
        C1857030yQP c1857030yQP3 = this.LLLZIIL;
        if (c1857030yQP3 != null && (c326880Cre = c1857030yQP3.LLJJIJI) != null && (message = c326880Cre.LLILLL) != null) {
            str4 = message.uuid;
        }
        if (commonParams == null || (str2 = commonParams.get("tako_session_id")) == null) {
            str2 = "";
        }
        if (commonParams != null && (str3 = commonParams.get("tako_chat_id")) != null) {
            str6 = str3;
        }
        C1862330yYx.LJJLIIIJJIZ(c1862330yYx, str7, str8, str9, str4, "video_generation", "try again", str2, str6);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void LLILZLL() {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1855880yOY(this, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final InterfaceC1860810yWV Tp() {
        return pq();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Wr, reason: merged with bridge method [inline-methods] */
    public final void up(C1857030yQP c1857030yQP) {
        C1857280yQo.LIZJ(LJJIJL(), C1857280yQo.LIZ((TakoCardAbility) this.LLLZIL.getValue()));
        super.up(c1857030yQP);
        this.LLLZIIL = c1857030yQP;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS609S0100000_30(this, 187));
    }
}
