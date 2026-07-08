package com.ss.android.ugc.aweme.tako.botpage.vm.ability;

import X.AbstractC321890Cjb;
import X.AnonymousClass1418;
import X.C07ED;
import X.C099R;
import X.C0CWB;
import X.C0CWC;
import X.C0CWD;
import X.C0CWE;
import X.C0PEM;
import X.C0ZP4;
import X.C123100dR;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1852810yJb;
import X.C1854150yLl;
import X.C1855050yND;
import X.C1855920yOc;
import X.C1858150ySD;
import X.C1858350ySX;
import X.C1858670yT3;
import X.C1860520yW2;
import X.C1860560yW6;
import X.C1860580yW8;
import X.C1860590yW9;
import X.C1860600yWA;
import X.C1860620yWC;
import X.C1860630yWD;
import X.C1860690yWJ;
import X.C1861290yXH;
import X.C1861410yXT;
import X.C1861540yXg;
import X.C1861650yXr;
import X.C1861720yXy;
import X.C1861740yY0;
import X.C1861990yYP;
import X.C1862000yYQ;
import X.C1862050yYV;
import X.C1862330yYx;
import X.C1862420yZ6;
import X.C1862500yZE;
import X.C1863270yaT;
import X.C1863280yaU;
import X.C1863340yaa;
import X.C1863380yae;
import X.C1863400yag;
import X.C1863420yai;
import X.C1875307Wd;
import X.C1875407We;
import X.C1893307bH;
import X.C201996141y;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C23250099c;
import X.C289480BWg;
import X.C291001Au;
import X.C319030Cez;
import X.C319040Cf0;
import X.C319970CgV;
import X.C320060Cge;
import X.C320070Cgf;
import X.C320090Cgh;
import X.C321910Cjd;
import X.C322100Cjw;
import X.C326880Cre;
import X.C326960Crm;
import X.C5183020f;
import X.C665120Q7a;
import X.C736820SvI;
import X.C830490Whz;
import X.C985403tE;
import X.EnumC1858090yS7;
import X.EnumC1858730yT9;
import X.InterfaceC1364105Vn;
import X.InterfaceC1858000yRy;
import X.InterfaceC1859790yUr;
import X.InterfaceC1861530yXf;
import X.InterfaceC1861820yY8;
import X.InterfaceC332260D0u;
import X.InterfaceC497601wk;
import android.content.Context;
import android.util.ArrayMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveActionItem;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.NovelStatus;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.EntityIntro;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationEntranceInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaire;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.vm.TakoChatBotSharedViewModel;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import defpackage.d8;
import defpackage.k9;
import defpackage.p2;
import defpackage.u2;
import defpackage.w2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS110S1200000_27;
import kotlin.jvm.internal.AwS113S0110000_27;
import kotlin.jvm.internal.AwS13S1001000_27;
import kotlin.jvm.internal.AwS236S0300000_27;
import kotlin.jvm.internal.AwS32S2100000_4;
import kotlin.jvm.internal.AwS36S0001000_24;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS39S0010000_27;
import kotlin.jvm.internal.AwS41S0000100_27;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS44S0310000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.AwS77S1000000_27;
import kotlin.jvm.internal.AwS8S1000100_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class MessageAbilityImpl implements IMessageAbility {
    public final MessageViewModel LL;
    public final TakoFragmentViewModel LLILLJJLI;
    public final TakoChatBotSharedViewModel LLILLL;
    public final TakoEnterParams LLILZ;
    public final List<InterfaceC1861530yXf> LLILZIL;
    public final Lifecycle LLILZLL;
    public final List<Function0<Unit>> LLIZ = new ArrayList();

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void Nl2() {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void B30() {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(AFwS269S0000000_27.get$arr$(6));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void DB() {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C1860560yW6(messageViewModel, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final boolean DG() {
        C1863380yae c1863380yae;
        String str;
        MessageViewModel messageViewModel = this.LL;
        return (messageViewModel == null || (c1863380yae = messageViewModel.LLJJJJ) == null || (str = c1863380yae.LJIILIIL) == null || !C1861740yY0.LIZIZ(str)) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final String L81() {
        C1854150yLl c1854150yLl;
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel == null || (c1854150yLl = messageViewModel.getState().LLJJIII) == null) {
            return null;
        }
        return c1854150yLl.LLJJI;
    }

    public final void LJI() {
        String str;
        TakoEnterParams takoEnterParams = this.LLILZ;
        if (takoEnterParams == null || (str = takoEnterParams.enterMethod) == null) {
            return;
        }
        C1893307bH.LIZ.getClass();
        if (((Set) C1893307bH.LIZJ.getValue()).contains(str)) {
            C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
            C1860520yW2.LJJIJIL(c1860520yW2, System.currentTimeMillis());
            C1860520yW2.LJJIJIIJIL(c1860520yW2, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void Le2() {
        TakoFragmentViewModel takoFragmentViewModel = this.LLILLJJLI;
        if (takoFragmentViewModel != null) {
            takoFragmentViewModel.setState(new AwS36S0010000_24(41));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void Q31() {
        Iterator<Function0<Unit>> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void QN0() {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(AFwS269S0000000_27.get$arr$(13));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void SC2() {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(AFwS269S0000000_27.get$arr$(20));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void U51() {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.withState(new AwS606S0100000_27(messageViewModel, 18));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void WJ1() {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS39S0010000_27(3));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void Wl0() {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS606S0100000_27(25));
            C1863380yae c1863380yae = messageViewModel.LLJJJJ;
            if (c1863380yae != null) {
                c1863380yae.LIZIZ = new AwS571S0100000_27(13);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void YJ0() {
        TakoFragmentViewModel takoFragmentViewModel = this.LLILLJJLI;
        if (takoFragmentViewModel != null) {
            takoFragmentViewModel.setState(new AwS36S0010000_24(40));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void c50() {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(AFwS269S0000000_27.get$arr$(12));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void cj1() {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(AFwS269S0000000_27.get$arr$(8));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final Integer eR0() {
        C1863380yae c1863380yae;
        SubConversationEntranceInfo subConversationEntranceInfo;
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel == null || (c1863380yae = messageViewModel.LLJJJJ) == null || (subConversationEntranceInfo = c1863380yae.LJIILJJIL) == null) {
            return null;
        }
        return subConversationEntranceInfo.subConversationType;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void gC2() {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(AFwS269S0000000_27.get$arr$(9));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final List<Message> iP() {
        List<Message> list;
        C1863380yae c1863380yae;
        C1863380yae c1863380yae2;
        C1863380yae c1863380yae3;
        C1863420yai c1863420yai = C1863380yae.LJJII;
        MessageViewModel messageViewModel = this.LL;
        String str = null;
        Long lValueOf = (messageViewModel == null || (c1863380yae3 = messageViewModel.LLJJJJ) == null) ? null : Long.valueOf(c1863380yae3.LJII);
        MessageViewModel messageViewModel2 = this.LL;
        Integer numValueOf = (messageViewModel2 == null || (c1863380yae2 = messageViewModel2.LLJJJJ) == null) ? null : Integer.valueOf(c1863380yae2.LJIIIIZZ);
        MessageViewModel messageViewModel3 = this.LL;
        if (messageViewModel3 != null && (c1863380yae = messageViewModel3.LLJJJJ) != null) {
            str = c1863380yae.LJIILIIL;
        }
        w2 w2VarLJI = c1863420yai.LJI(numValueOf, lValueOf, str);
        return (w2VarLJI == null || (list = w2VarLJI.LIZIZ) == null) ? C13BV.INSTANCE : list;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final Message lN() {
        List<Message> list;
        C1863380yae c1863380yae;
        C1863380yae c1863380yae2;
        C1863380yae c1863380yae3;
        C1863420yai c1863420yai = C1863380yae.LJJII;
        MessageViewModel messageViewModel = this.LL;
        Long lValueOf = (messageViewModel == null || (c1863380yae3 = messageViewModel.LLJJJJ) == null) ? null : Long.valueOf(c1863380yae3.LJII);
        MessageViewModel messageViewModel2 = this.LL;
        Integer numValueOf = (messageViewModel2 == null || (c1863380yae2 = messageViewModel2.LLJJJJ) == null) ? null : Integer.valueOf(c1863380yae2.LJIIIIZZ);
        MessageViewModel messageViewModel3 = this.LL;
        w2 w2VarLJI = c1863420yai.LJI(numValueOf, lValueOf, (messageViewModel3 == null || (c1863380yae = messageViewModel3.LLJJJJ) == null) ? null : c1863380yae.LJIILIIL);
        if (w2VarLJI == null || (list = w2VarLJI.LIZIZ) == null) {
            return null;
        }
        return (Message) C13LP.LJJLIIIJL(list);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final InterfaceC332260D0u<Boolean> mK1() {
        C1863380yae c1863380yae;
        C1863380yae c1863380yae2;
        C1863380yae c1863380yae3;
        C1863420yai c1863420yai = C1863380yae.LJJII;
        MessageViewModel messageViewModel = this.LL;
        String str = null;
        Long lValueOf = (messageViewModel == null || (c1863380yae3 = messageViewModel.LLJJJJ) == null) ? null : Long.valueOf(c1863380yae3.LJII);
        MessageViewModel messageViewModel2 = this.LL;
        Integer numValueOf = (messageViewModel2 == null || (c1863380yae2 = messageViewModel2.LLJJJJ) == null) ? null : Integer.valueOf(c1863380yae2.LJIIIIZZ);
        MessageViewModel messageViewModel3 = this.LL;
        if (messageViewModel3 != null && (c1863380yae = messageViewModel3.LLJJJJ) != null) {
            str = c1863380yae.LJIILIIL;
        }
        return c1863420yai.LIZLLL(numValueOf, lValueOf, str);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final boolean oj() {
        MessageViewModel messageViewModel = this.LL;
        return messageViewModel != null && messageViewModel.oj();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final SubConversationConfig ou() {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            return messageViewModel.getState().LLILZIL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final TakoSug ov2() {
        InterfaceC1858000yRy interfaceC1858000yRyPrevious;
        C326960Crm c326960Crm;
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel == null) {
            return null;
        }
        List<InterfaceC1858000yRy> list = messageViewModel.getState().LL.LIZ;
        ListIterator<InterfaceC1858000yRy> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                interfaceC1858000yRyPrevious = null;
                break;
            }
            interfaceC1858000yRyPrevious = listIterator.previous();
            if (interfaceC1858000yRyPrevious instanceof C326960Crm) {
                break;
            }
        }
        InterfaceC1858000yRy interfaceC1858000yRy = interfaceC1858000yRyPrevious;
        if (interfaceC1858000yRy == null || !(interfaceC1858000yRy instanceof C326960Crm) || (c326960Crm = (C326960Crm) interfaceC1858000yRy) == null) {
            return null;
        }
        return c326960Crm.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final int rF() {
        C1863380yae c1863380yae;
        Integer num;
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel == null || (c1863380yae = messageViewModel.LLJJJJ) == null || (num = c1863380yae.LJJ) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final List<C326880Cre> sL() {
        MessageViewModel messageViewModel = this.LL;
        return messageViewModel != null ? messageViewModel.sL() : C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void w41() {
        Iterator it2 = ((ArrayList) this.LLIZ).iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(AFwS269S0000000_27.get$arr$(15));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final TakoEnterParams DN1() {
        return this.LLILZ;
    }

    public static void LIZ(ExtraRequestInfo extraRequestInfo) {
        Map<String, Object> map;
        String str;
        if (((Boolean) C07ED.LIZ.getValue()).booleanValue() && extraRequestInfo != null && (map = extraRequestInfo.LIZ) != null) {
            Object obj = map.get("image_template_id");
            if (!(obj instanceof String) || (str = (String) obj) == null) {
                str = "";
            }
            if (str.length() == 0 || map.get("is_unchanged_tako_template") != null) {
                return;
            }
            map.put("is_unchanged_tako_template", Boolean.TRUE);
        }
    }

    public static TakoEditAskInfo LJIIJ(TakoEditAskInfo takoEditAskInfo) {
        Message message;
        TakoMixFeed takoMixFeedLJIIIZ;
        if (!C289480BWg.LIZ() && takoEditAskInfo != null && (message = takoEditAskInfo.editMessage) != null && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null && takoMixFeedLJIIIZ.fromVideoSug) {
            return null;
        }
        return takoEditAskInfo;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void AE1(int i) {
        TakoFragmentViewModel takoFragmentViewModel = this.LLILLJJLI;
        if (takoFragmentViewModel != null) {
            takoFragmentViewModel.AE1(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void B82(Function1<? super TakoActiveBotItem, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0yX2
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1861040yWs) obj).LLJILLL;
                }
            }, null, null, null, new AwS606S0100000_27(function1, (Function1<? super C1854150yLl, Unit>) 26), 14, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final List<Message> CM2(String str) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            return messageViewModel.CM2(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final boolean DD2(String str) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel == null || str == null || !messageViewModel.LLJJJJJIL.contains(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DF0(X.C1854150yLl r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r3 = r4.LL
            if (r3 == 0) goto L38
            kotlin.jvm.internal.AwS606S0100000_27 r1 = new kotlin.jvm.internal.AwS606S0100000_27
            r0 = 31
            r1.<init>(r5, r0)
            r3.setStateImmediate(r1)
            X.0yae r2 = r3.LLJJJJ
            if (r2 == 0) goto L2a
            r1 = 1
            if (r5 == 0) goto L3b
            int r0 = r5.LL
            if (r0 != r1) goto L3b
            boolean r0 = r5.LLJILJILJ
            if (r0 != 0) goto L28
            X.0yON r0 = X.C1855770yON.LIZ
            r0.getClass()
            boolean r0 = X.C1855770yON.LIZIZ()
            if (r0 == 0) goto L3b
        L28:
            r2.LJIL = r1
        L2a:
            X.0yae r1 = r3.LLJJJJ
            if (r1 == 0) goto L38
            if (r5 == 0) goto L39
            int r0 = r5.LL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L36:
            r1.LJJ = r0
        L38:
            return
        L39:
            r0 = 0
            goto L36
        L3b:
            r1 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.vm.ability.MessageAbilityImpl.DF0(X.0yLl):void");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final Message DL1(String str) {
        C1863380yae c1863380yae;
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null && (c1863380yae = messageViewModel.LLJJJJ) != null) {
            return c1863380yae.LJIILL(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void DZ0(Message message) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS236S0300000_27((List) messageViewModel.getState().LL.LIZ, (List<? extends InterfaceC1858000yRy>) Message.LIZLLL(message, null, 0, false, 0, false, Boolean.valueOf(!Intrinsics.LJFF(message.LJIIJ, Boolean.TRUE)), false, -1, 2088959), (Message) messageViewModel, (MessageViewModel) 7));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void EG1(Function1<? super SubConversationConfig, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, C1861720yXy.LL, null, null, null, new AwS606S0100000_27(function1, (Function1<? super C1854150yLl, Unit>) 22), 14, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void FP1(ConversationInfo conversationInfo) {
        MessageViewModel messageViewModel;
        String str = conversationInfo.subConversationId;
        if (str != null && str.length() > 0 && 1 != 0) {
            MessageViewModel messageViewModel2 = this.LL;
            if (messageViewModel2 != null) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel2), C0PEM.LIZJ, null, new C320060Cge(messageViewModel2, conversationInfo.conversationId, str, true, null), 2);
            }
            long j = conversationInfo.unreadCount;
            if (j > 0 && (messageViewModel = this.LL) != null) {
                messageViewModel.setState(new AwS8S1000100_27(0 - j, str, 0));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void Gn2(Function1<? super Long, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0yWv
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Long.valueOf(((C1861040yWs) obj).LLJILJIL);
                }
            }, null, null, null, new AwS582S0100000_3((AwS582S0100000_3) function1, 22), 14, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void H61(InterfaceC1861530yXf interfaceC1861530yXf) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.LLJLLIL.add(interfaceC1861530yXf);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void IW1(Message message) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null && message != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C1860580yW8(messageViewModel, message, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void Ij2(Function1<? super Long, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, C1861650yXr.LL, null, null, null, new AwS581S0100000_2((Function1) function1, (Function1<Object, String>) 40), 14, null);
        }
    }

    public final void LJFF(TakoEditAskInfo takoEditAskInfo) {
        Message message;
        Message messageLN;
        boolean zLJFF;
        Integer numValueOf;
        String str;
        if (takoEditAskInfo == null || (message = takoEditAskInfo.editMessage) == null || (messageLN = lN()) == null) {
            return;
        }
        if (messageLN.sender.isSelf) {
            zLJFF = Intrinsics.LJFF(messageLN.msgId, message.msgId);
        } else {
            zLJFF = Intrinsics.LJFF(messageLN.replyMsgId, message.msgId);
        }
        if (!zLJFF) {
            return;
        }
        c50();
        List<Message> listCM2 = CM2(message.uuid);
        if (listCM2 == null) {
            listCM2 = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listCM2, 10));
        Iterator<Message> it2 = listCM2.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().uuid);
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        List<C326880Cre> listSL = sL();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listSL, 10));
        Iterator<C326880Cre> it3 = listSL.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().LLILLL);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            Message message2 = (Message) obj;
            List listLJIIJJI = C1697810uHb.LJIIJJI(10001, -8002);
            TakoMixFeed takoMixFeedLJIIIZ = message2.LJIIIZ();
            String str2 = null;
            if (takoMixFeedLJIIIZ != null) {
                numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
            } else {
                numValueOf = null;
            }
            if (C13LP.LJJJJ(numValueOf, listLJIIJJI)) {
                TakoQuestionnaire takoQuestionnaire = message2.LJIILL;
                if (takoQuestionnaire != null) {
                    str = takoQuestionnaire.followReplyMessageId;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str, message.uuid)) {
                    TakoQuestionnaire takoQuestionnaire2 = message2.LJIILL;
                    if (takoQuestionnaire2 != null) {
                        str2 = takoQuestionnaire2.followMessageId;
                    }
                    if (C13LP.LJJJJ(str2, setLLIIJI)) {
                    }
                }
                arrayList3.add(obj);
            }
        }
        List listLJLIL = C13LP.LJLIL(arrayList3, C13LP.LJLIL(listCM2, C1697810uHb.LJIILJJIL(message)));
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLJLIL, 10));
        ArrayList arrayList5 = (ArrayList) listLJLIL;
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            ((Message) it4.next()).isHidden = true;
            arrayList4.add(Unit.LIZ);
        }
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS44S0310000_27(messageViewModel.getState().LL.LIZ, listLJLIL, messageViewModel, 1));
        }
        BatchUpdateMessage batchUpdateMessageLJ = C1855920yOc.LJ((Message) C13LP.LJJJJZI(listLJLIL), Collections.singletonList(2));
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(listLJLIL, 10));
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(C1855920yOc.LJ((Message) it5.next(), Collections.singletonList(2)));
        }
        C1858150ySD.LIZJ(this, batchUpdateMessageLJ, arrayList6, false, null, 12);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void MB1(C1854150yLl c1854150yLl) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS606S0100000_27(c1854150yLl, 23));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void ME(Function1<? super C291001Au<C1875307Wd>, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0yX5
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1861040yWs) obj).LLJLIL;
                }
            }, null, null, null, new AwS606S0100000_27(function1, (Function1<? super C1854150yLl, Unit>) 29), 14, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void Nh1(boolean z) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS113S0110000_27(z, messageViewModel, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void P92(Message message) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null && !message.LIZ) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C320070Cgf(messageViewModel, message, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final List<Message> PH2(String str) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            if (str.length() == 0) {
                return C13BV.INSTANCE;
            }
            C1863380yae c1863380yae = messageViewModel.LLJJJJ;
            if (c1863380yae != null) {
                List<Message> listLJJLI = c1863380yae.LJIILL.LJJLI(str);
                ArrayList arrayList = new ArrayList();
                for (Object obj : (ArrayList) listLJJLI) {
                    Message message = (Message) obj;
                    TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
                    if ((takoMixFeedLJIIIZ != null && takoMixFeedLJIIIZ.cardType == 301) || AnonymousClass1418.LJIIIZ(message.LJIIIZ()).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void QB0(TakoActiveBotItem takoActiveBotItem) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS606S0100000_27(takoActiveBotItem, 27));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void QC1(Message message) {
        String str;
        Message messageLIZJ;
        String str2;
        String str3;
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            C1863380yae c1863380yae = messageViewModel.LLJJJJ;
            if (c1863380yae != null) {
                str = c1863380yae.LJIILIIL;
            } else {
                str = null;
            }
            String str4 = "";
            if (str == null) {
                str = "";
            }
            Message messageLIZLLL = Message.LIZLLL(message, str, 0, false, 0, false, null, false, -33, 2097151);
            if (C1858350ySX.LIZIZ(messageLIZLLL, messageViewModel.LLJLLL)) {
                messageLIZJ = messageLIZLLL;
            } else {
                messageLIZJ = C1858350ySX.LIZJ(messageLIZLLL);
            }
            messageViewModel.setState(new AwS393S0200000_27(messageViewModel, messageLIZJ, 10));
            Iterator<InterfaceC1861530yXf> it2 = messageViewModel.LLJLLIL.iterator();
            while (it2.hasNext()) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C1861410yXT(messageViewModel, messageLIZJ, it2.next(), messageLIZLLL, message, null), 2);
            }
            TakoEnterParams takoEnterParams = messageViewModel.LLILLL;
            if (takoEnterParams != null) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str5 = takoEnterParams.enterFrom;
                String str6 = takoEnterParams.enterMethod;
                String str7 = takoEnterParams.processId;
                String enterAwemeId = takoEnterParams.getEnterAwemeId();
                C1863380yae c1863380yae2 = messageViewModel.LLJJJJ;
                if (c1863380yae2 == null || (str2 = c1863380yae2.LJIILIIL) == null) {
                    str2 = "";
                }
                if (c1863380yae2 != null && (str3 = c1863380yae2.LJFF) != null) {
                    str4 = str3;
                }
                C1862330yYx.LJJZZI(768, c1862330yYx, str5, str6, str7, str2, str4, "push", enterAwemeId, "initiate_new_session", null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void R40(Function1<? super Boolean, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0yPS
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1861040yWs) obj).LLJJJ);
                }
            }, null, null, null, new C5183020f((Function1) function1, (Function1<? super Long, Object>) 16), 14, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void S81(C1862000yYQ c1862000yYQ) {
        C1863380yae c1863380yae;
        String str;
        String screenType;
        InterfaceC497601wk viewModelScope;
        String str2;
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null && (c1863380yae = messageViewModel.LLJJJJ) != null) {
            String string = UUID.randomUUID().toString();
            Pair[] pairArr = new Pair[4];
            TakoEnterParams takoEnterParams = this.LLILZ;
            if (takoEnterParams != null) {
                str = takoEnterParams.enterFrom;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            pairArr[0] = new Pair("enter_from", str);
            TakoEnterParams takoEnterParams2 = this.LLILZ;
            if (takoEnterParams2 != null && (str2 = takoEnterParams2.enterMethod) != null) {
                str3 = str2;
            }
            pairArr[1] = new Pair("enter_method", str3);
            pairArr[2] = new Pair("mode", "default");
            TakoEnterParams takoEnterParams3 = this.LLILZ;
            if (takoEnterParams3 == null || (screenType = takoEnterParams3.getScreenType()) == null) {
                screenType = "full_screen";
            }
            pairArr[3] = new Pair("screen_type", screenType);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            Iterator<InterfaceC1861820yY8> it2 = C1863280yaU.LJIJJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ();
            }
            MessageViewModel messageViewModel2 = this.LL;
            if (messageViewModel2 != null) {
                messageViewModel2.XQ2(string);
            }
            MessageViewModel messageViewModel3 = this.LL;
            if (messageViewModel3 != null && (viewModelScope = ViewModelKt.getViewModelScope(messageViewModel3)) != null) {
                C23250099c.LIZLLL(viewModelScope, C0PEM.LIZJ, null, new C1861990yYP(c1863380yae, mapLJIIJ, this, c1862000yYQ, string, null), 2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void Sx2(boolean z) {
        TakoFragmentViewModel takoFragmentViewModel = this.LLILLJJLI;
        if (takoFragmentViewModel != null) {
            takoFragmentViewModel.Sx2(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final Message U30(Message message) {
        MessageViewModel messageViewModel;
        C1863380yae c1863380yae;
        Message messageLJIILL;
        Message messageMv2;
        if (message.sender.isSelf) {
            MessageViewModel messageViewModel2 = this.LL;
            if (messageViewModel2 != null && (messageMv2 = messageViewModel2.mv2(message, null)) != null && (!C1858670yT3.LJIIIZ(messageMv2))) {
                return messageMv2;
            }
        } else {
            String str = message.replyMsgId;
            if (C123100dR.LIZ(str) && str != null && (messageViewModel = this.LL) != null && (c1863380yae = messageViewModel.LLJJJJ) != null && (messageLJIILL = c1863380yae.LJIILL(str)) != null && (!C1858670yT3.LJIIIZ(messageLJIILL))) {
                return messageLJIILL;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void Uj0(C1863340yaa c1863340yaa) throws JSONException {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.Uj0(c1863340yaa);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void Zd(Function1<? super TakoActiveActionItem, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0yXx
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1861040yWs) obj).LLJ;
                }
            }, null, null, null, new AwS606S0100000_27(new AwS606S0100000_27(function1, (Function1<? super C1854150yLl, Unit>) 253), 21), 14, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void aC2(Function1<? super C291001Au<Unit>, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0yX4
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1861040yWs) obj).LLJJJJJIL;
                }
            }, C736820SvI.LIZLLL(), null, null, new AwS595S0100000_16((Function1) function1, (Function1<? super C291001Au<Unit>, Unit>) 45), 12, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void cE2(Function1<? super Boolean, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0yWx
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1861040yWs) obj).LLJILJILJ);
                }
            }, null, null, null, new AwS582S0100000_3((AwS582S0100000_3) function1, 21), 14, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void d11(String str) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS77S1000000_27(str, 3));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void dO1(Function1<? super List<ConversationInfo>, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C322100Cjw(messageViewModel, function1, null), 2);
        } else {
            ((C1863270yaT) function1).invoke(C13BV.INSTANCE);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void e12(AwS641S0100000_27 awS641S0100000_27) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0yX6
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1861040yWs) obj).LLJJL;
                }
            }, null, null, null, new C5183020f(awS641S0100000_27, 18), 14, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void fc2(Function0<Unit> function0) {
        ((ArrayList) this.LLIZ).remove(function0);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void gC1(int i) {
        C1863380yae c1863380yae;
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null && (c1863380yae = messageViewModel.LLJJJJ) != null) {
            c1863380yae.LJJI = i;
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void gl2(Function1<? super C1854150yLl, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0yX3
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1861040yWs) obj).LLJJ;
                }
            }, null, null, null, new AwS606S0100000_27(function1, (Function1<? super C1854150yLl, Unit>) 28), 14, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void iU(Function1<? super C1854150yLl, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0yXw
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1861040yWs) obj).LLJJIII;
                }
            }, null, null, null, new AwS606S0100000_27(function1, (Function1<? super C1854150yLl, Unit>) 19), 14, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void nB0(Function0<Unit> function0) {
        TakoFragmentViewModel takoFragmentViewModel = this.LLILLJJLI;
        if (takoFragmentViewModel != null) {
            AssemViewModel.selectSubscribe$default(takoFragmentViewModel, new C2217381BqS() { // from class: X.0yLZ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1853920yLO) obj).LLILLL;
                }
            }, null, null, null, new AwS606S0100000_27((AwS431S0200000_30) function0, 555), 14, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void nv1(TakoSug takoSug) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS393S0200000_27(takoSug, messageViewModel, 11));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void o72(Function1<? super C291001Au<String>, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0yWy
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1861040yWs) obj).LLJJIJI;
                }
            }, null, null, null, new AwS606S0100000_27((AwS606S0100000_27) function1, 16), 14, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final Object ql0(InterfaceC1364105Vn<? super u2> interfaceC1364105Vn) {
        C1863380yae c1863380yae;
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null && (c1863380yae = messageViewModel.LLJJJJ) != null) {
            Object objLJI = c1863380yae.LJI(interfaceC1364105Vn);
            if (objLJI == C099R.LJFF()) {
                return objLJI;
            }
            return objLJI;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void ru2(int i) {
        TakoFragmentViewModel takoFragmentViewModel = this.LLILLJJLI;
        if (takoFragmentViewModel != null) {
            takoFragmentViewModel.setState(new AwS36S0001000_24(i, 13));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void sI0(boolean z) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.sI0(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void tU1(Function0<Unit> function0) {
        ((ArrayList) this.LLIZ).add(function0);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final C0ZP4 tx1(Function1<? super Boolean, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            return AssemViewModel.selectSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0yWw
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1861040yWs) obj).LLILLJJLI);
                }
            }, null, null, null, new C5183020f((Function1) function1, (Function1<? super Long, Object>) 17), 14, null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void v21(Message message) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.KQ2(new w2(w2.a.NEW, Collections.singletonList(message), false, false, false, 0, null, null, new k9(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127), 252));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void vL(String str) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            w2.a aVar = w2.a.NEW;
            Message message = new Message(null, null, null, null, null, null, false, null, 0L, 0L, null, 0, null, null, false, 0, false, null, null, 0L, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, 0, 0, null, null, false, false, 0, null, 0L, 0, 0, null, 0L, null, false, null, null, null, null, null, null, false, null, -1, 2097151, null);
            message.uuid = UUID.randomUUID().toString();
            message.replyMsgId = str;
            message.msgType = -6000;
            message.LIZIZ = 4;
            TakoMixFeed takoMixFeed = new TakoMixFeed(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, -1, 1023, null);
            takoMixFeed.status = 3;
            message.LJIIJ(takoMixFeed);
            message.sender = new MessageSender(2, 0L, 0L, false, "");
            messageViewModel.KQ2(new w2(aVar, Collections.singletonList(message), false, false, false, 0, null, null, new k9(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127), 252));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void we1(Function1<? super C291001Au<C1875407We>, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0yX9
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1861040yWs) obj).LLJLILLLLZIIL;
                }
            }, null, null, null, new AwS585S0100000_6((AwS585S0100000_6) function1, 25), 14, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void yW1(long j) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS41S0000100_27(j, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void z52(InterfaceC1861530yXf interfaceC1861530yXf) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.LLJLLIL.remove(interfaceC1861530yXf);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void zG0(Message message) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS236S0300000_27((List) messageViewModel.getState().LL.LIZ, (List<? extends InterfaceC1858000yRy>) message, (Message) messageViewModel, (MessageViewModel) 5));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void zJ1(boolean z) {
        TakoFragmentViewModel takoFragmentViewModel;
        TakoFragmentViewModel takoFragmentViewModel2 = this.LLILLJJLI;
        if (takoFragmentViewModel2 != null) {
            takoFragmentViewModel2.Sx2(z);
        }
        if (z && (takoFragmentViewModel = this.LLILLJJLI) != null) {
            takoFragmentViewModel.setState(new AwS36S0010000_24(true, 39));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void K12(C1861290yXH c1861290yXH, String str) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS110S1200000_27(c1861290yXH, str, messageViewModel, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void MF0(C665120Q7a c665120Q7a, String str) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C1862050yYV(str, messageViewModel, c665120Q7a, null), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void O62(String str, d8 d8Var) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            w2.a aVar = w2.a.NEW;
            Message message = new Message(null, null, null, null, null, null, false, null, 0L, 0L, null, 0, null, null, false, 0, false, null, null, 0L, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, 0, 0, null, null, false, false, 0, null, 0L, 0, 0, null, 0L, null, false, null, null, null, null, null, null, false, null, -1, 2097151, null);
            message.uuid = UUID.randomUUID().toString();
            message.replyMsgId = str;
            message.msgType = -7000;
            message.LIZIZ = 4;
            message.sender = new MessageSender(2, 0L, 0L, false, "");
            messageViewModel.KQ2(new w2(aVar, Collections.singletonList(message), false, false, false, 0, null, d8Var, new k9(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127), 124));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void XK2(NovelStatus novelStatus, InterfaceC1859790yUr interfaceC1859790yUr) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.XQ2("");
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C1860600yWA(messageViewModel, novelStatus, interfaceC1859790yUr, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void YV0(long j, Function1 function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C0CWE(messageViewModel, j, 20, function1, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void bL0(String str, String str2) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.withState(new AwS32S2100000_4(str, messageViewModel, str2, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void dt0(Message message, boolean z) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS44S0310000_27((List) messageViewModel.getState().LL.LIZ, (List<? extends InterfaceC1858000yRy>) message, (Message) messageViewModel, (MessageViewModel) z, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h42(android.content.Context r38, com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationEntranceInfo r39) {
        /*
            Method dump skipped, instruction units count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.vm.ability.MessageAbilityImpl.h42(android.content.Context, com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationEntranceInfo):void");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void kE1(Message message, Map<String, String> map) {
        TakoMixFeed takoMixFeedLJIIIZ;
        String str;
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("is_resend", "1");
        arrayMap.put("interaction_type", "quick_reaction");
        if (message != null) {
            TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
            if (takoMixFeedLJIIIZ2 == null || (str = takoMixFeedLJIIIZ2.text) == null) {
                str = "";
            }
            arrayMap.put("message_content", str);
            arrayMap.put("message_id", message.uuid);
        }
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null && message != null && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null && takoMixFeedLJIIIZ.text != null && messageViewModel.LLJJJJ != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C1860590yW9(messageViewModel, message, map, arrayMap, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final Message mv2(Message message, Function1<? super Message, Boolean> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            return messageViewModel.mv2(message, function1);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void nX0(int i, String str) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS13S1001000_27(str, i, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x017f  */
    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void po1(android.content.Context r19, com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo r20) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.vm.ability.MessageAbilityImpl.po1(android.content.Context, com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo):void");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void zN(int i, String str) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.setState(new AwS13S1001000_27(str, i, 0));
        }
    }

    public static final void LIZLLL(MessageAbilityImpl messageAbilityImpl, Message message, List<Message> list) {
        String str;
        MessageViewModel messageViewModel = messageAbilityImpl.LL;
        String str2 = null;
        if (messageViewModel != null && message != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C0CWD(messageViewModel, message, list, null), 2);
        }
        C1862420yZ6 c1862420yZ6 = C1862420yZ6.LIZ;
        TakoEnterParams takoEnterParams = messageAbilityImpl.LLILZ;
        if (takoEnterParams != null) {
            str2 = takoEnterParams.processId;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (message != null && (str = message.uuid) != null) {
            str3 = str;
        }
        String type = EnumC1858730yT9.DELETE.getType();
        c1862420yZ6.getClass();
        C1862420yZ6.LIZ(str2, str3, type);
    }

    public static String LJII(String str, TakoReferenceAskInfo takoReferenceAskInfo, TakoEditAskInfo takoEditAskInfo) {
        if (C1855050yND.LIZIZ(takoReferenceAskInfo) && C1855050yND.LIZ(takoEditAskInfo)) {
            return "select_ask_and_edit";
        }
        if (C1855050yND.LIZIZ(takoReferenceAskInfo)) {
            return "select_ask";
        }
        if (!C1855050yND.LIZ(takoEditAskInfo)) {
            return str;
        }
        return "select_edit";
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void YM(Context context, TakoActiveBotItem takoActiveBotItem, boolean z) {
        MessageViewModel messageViewModel;
        if (context == null || this.LLILZ == null || (messageViewModel = this.LL) == null) {
            return;
        }
        C1863380yae c1863380yae = messageViewModel.LLJJJJ;
        if (c1863380yae != null && c1863380yae.LJII == takoActiveBotItem.bot.botId) {
            return;
        }
        C1861540yXg c1861540yXg = messageViewModel.LLILZ;
        TakoBotInfo takoBotInfo = takoActiveBotItem.bot;
        C1863380yae c1863380yae2 = c1861540yXg.LIZ.get(C1863420yai.LJIIIIZZ(takoBotInfo.botSource, takoBotInfo.botId, null));
        if (c1863380yae2 != null) {
            MessageViewModel messageViewModel2 = this.LL;
            messageViewModel2.LLJJJJ = c1863380yae2;
            if (z) {
                TakoBotInfo takoBotInfo2 = takoActiveBotItem.bot;
                messageViewModel2.hR2(takoBotInfo2.botSource, takoBotInfo2.botId);
                return;
            }
            return;
        }
        C1863400yag c1863400yag = C1863400yag.LIZ;
        TakoEnterParams takoEnterParams = this.LLILZ;
        String str = takoEnterParams.pushMsgId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String sugSource = takoEnterParams.getSugSource();
        if (sugSource != null) {
            str2 = sugSource;
        }
        TakoEnterParams takoEnterParams2 = this.LLILZ;
        String str3 = takoEnterParams2.processId;
        String str4 = takoEnterParams2.takoChatId;
        Lifecycle lifecycle = this.LLILZLL;
        TakoBotInfo takoBotInfo3 = takoActiveBotItem.bot;
        C1863380yae c1863380yaeLIZIZ = C1863400yag.LIZIZ(c1863400yag, context, new AwS571S0100000_27(this, 821), str2, str, str3, str4, lifecycle, takoBotInfo3.botId, takoBotInfo3.botSource, takoBotInfo3.botType, takoBotInfo3.botMode, takoBotInfo3.useIndependentDomain, true, null, null, AFwS232S0000000_4.get$arr$(83), false, null, 442372);
        MessageViewModel messageViewModel3 = this.LL;
        messageViewModel3.LLJJJJ = c1863380yaeLIZIZ;
        messageViewModel3.LLILZ.LIZ(c1863380yaeLIZIZ);
        if (z) {
            TakoBotInfo takoBotInfo4 = takoActiveBotItem.bot;
            messageViewModel3.hR2(takoBotInfo4.botSource, takoBotInfo4.botId);
            messageViewModel3.fR2(this.LLILLL, false);
        }
        C23250099c.LIZLLL(messageViewModel3.getLifecycleScope(), C0PEM.LIZJ, null, new C319040Cf0(c1863380yaeLIZIZ, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void dc1(Context context, String str, Function0<Unit> function0) {
        TakoEnterParams takoEnterParams;
        Integer num;
        int i;
        if (context == null || (takoEnterParams = this.LLILZ) == null || this.LL == null) {
            return;
        }
        C1863380yae c1863380yaeLIZIZ = LIZIZ(context, takoEnterParams, str, new SubConversationEntranceInfo(null, null, null, 1), "chat_middle_page");
        MessageViewModel messageViewModel = this.LL;
        messageViewModel.getClass();
        messageViewModel.setState(AFwS269S0000000_27.get$arr$(15));
        this.LL.gR2();
        C1863380yae c1863380yae = this.LL.LLJJJJ;
        boolean z = false;
        if (c1863380yae != null) {
            InterfaceC332260D0u interfaceC332260D0uLIZLLL = C1863380yae.LJJII.LIZLLL(Integer.valueOf(c1863380yae.LJIIIIZZ), Long.valueOf(c1863380yae.LJII), c1863380yae.LJIILIIL);
            if (interfaceC332260D0uLIZLLL != null && ((Boolean) interfaceC332260D0uLIZLLL.getValue()).booleanValue()) {
                MessageViewModel messageViewModel2 = this.LL;
                String str2 = c1863380yae.LJIILIIL;
                if (str2 == null) {
                    str2 = "";
                }
                messageViewModel2.getClass();
                messageViewModel2.setState(new AwS8S1000100_27(1L, str2, 0));
            }
        }
        MessageViewModel messageViewModel3 = this.LL;
        C1863380yae c1863380yae2 = messageViewModel3.LLJJJJ;
        if (c1863380yae2 != null) {
            if (c1863380yae != null) {
                i = c1863380yae.LJJI;
            } else {
                i = 0;
            }
            c1863380yae2.LJJI = i;
            if (c1863380yae != null) {
                z = c1863380yae.LJIL;
            }
            c1863380yae2.LJIL = z;
        }
        if (c1863380yae2 != null) {
            if (c1863380yae != null) {
                num = c1863380yae.LJJ;
            } else {
                num = null;
            }
            c1863380yae2.LJJ = num;
        }
        messageViewModel3.LLJJJJ = c1863380yaeLIZIZ;
        messageViewModel3.LLILZ.LIZ(c1863380yaeLIZIZ);
        messageViewModel3.fR2(this.LLILLL, true);
        C23250099c.LIZLLL(messageViewModel3.getLifecycleScope(), C0PEM.LIZJ, null, new C319030Cez(c1863380yaeLIZIZ, null), 2);
        messageViewModel3.Tk2(CardStruct.IStatusCode.DEFAULT, new AwS583S0100000_4(function0, (Function0<Unit>) 140), true, true);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void ua2(Message message, boolean z, boolean z2) {
        C1863380yae c1863380yae;
        p2.b bVar;
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null && message != null && (c1863380yae = messageViewModel.LLJJJJ) != null) {
            ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
            if (z2) {
                bVar = p2.b.IMMEDIATE;
            } else {
                bVar = p2.b.QUEUE;
            }
            C321910Cjd.LIZ(bVar, AFwS232S0000000_4.get$arr$(267), new C1860690yWJ(c1863380yae, message, z, null));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void G01(LifecycleOwner lifecycleOwner, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super SearchLandingPageResponse, Unit> function12) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.asyncSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0yX0
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1861040yWs) obj).LLJJIJIIJIL;
                }
            }, lifecycleOwner, null, function1, function0, function12, 4, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void Tk2(String str, Function1 function1, boolean z, boolean z2) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.Tk2(str, function1, z, z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void U61(int i, int i2, String str, String str2) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C0CWB(messageViewModel, i, i2, str, str2, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void cN0(Context context, Message message, List<Message> list, boolean z) {
        if (z) {
            if (context != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LIZ(2131822446);
                C985403tE.LIZ(c1397580mTM, new AwS236S0300000_27(this, (MessageAbilityImpl) message, (Message) list, (List<Message>) 13));
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
            LIZLLL(this, message, list);
            return;
        }
        LIZLLL(this, message, list);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void j10(BatchUpdateMessage batchUpdateMessage, List<BatchUpdateMessage> list, boolean z, w2.a aVar) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C320090Cgh(messageViewModel, batchUpdateMessage, list, z, aVar, null), 2);
        }
    }

    public final C1863380yae LIZIZ(Context context, TakoEnterParams takoEnterParams, String str, SubConversationEntranceInfo subConversationEntranceInfo, String str2) {
        String sugSource = str2;
        C1863400yag c1863400yag = C1863400yag.LIZ;
        String str3 = takoEnterParams.pushMsgId;
        if (str3 == null) {
            str3 = "";
        }
        if (sugSource == null || sugSource.length() <= 0) {
            sugSource = takoEnterParams.getSugSource();
        }
        String str4 = takoEnterParams.processId;
        String str5 = takoEnterParams.takoChatId;
        Lifecycle lifecycle = this.LLILZLL;
        AIBotInfo aIBotInfo = takoEnterParams.botInfo;
        return C1863400yag.LIZIZ(c1863400yag, context, new AwS571S0100000_27(takoEnterParams, 820), sugSource, str3, str4, str5, lifecycle, aIBotInfo.botId, aIBotInfo.botSource, aIBotInfo.botType, aIBotInfo.botMode, aIBotInfo.useIndependentDomain, true, str, subConversationEntranceInfo, AFwS269S0000000_27.get$arr$(237), false, null, 393220);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageAbilityImpl(MessageViewModel messageViewModel, TakoFragmentViewModel takoFragmentViewModel, TakoChatBotSharedViewModel takoChatBotSharedViewModel, TakoEnterParams takoEnterParams, List<? extends InterfaceC1861530yXf> list, Lifecycle lifecycle) {
        this.LL = messageViewModel;
        this.LLILLJJLI = takoFragmentViewModel;
        this.LLILLL = takoChatBotSharedViewModel;
        this.LLILZ = takoEnterParams;
        this.LLILZIL = list;
        this.LLILZLL = lifecycle;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void Wk0(Message message, Message message2, int i, int i2, Map<String, String> map, Map<String, String> map2) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C1860620yWC(messageViewModel, message, message2, i, i2, map, map2, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void nj1(Long l, String str, String str2, Function1<? super TakoSug, Unit> function1, Function1<? super EntityIntro, Unit> function12, Integer num) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null && l != null) {
            long jLongValue = l.longValue();
            if (str != null && str.length() > 0 && 1 != 0) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C0CWC(messageViewModel, jLongValue, str, str2, function1, function12, num, null), 2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0148 A[PHI: r14
      0x0148: PHI (r14v2 java.lang.String) = (r14v0 java.lang.String), (r14v3 java.lang.String) binds: [B:29:0x0072, B:27:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tV0(java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.vm.ability.MessageAbilityImpl.tV0(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0172  */
    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S22(java.lang.String r20, boolean r21, X.EnumC1858090yS7 r22, java.util.Map r23, X.C830490Whz r24, java.lang.Long r25, kotlin.jvm.internal.AwS110S1200000_27 r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.vm.ability.MessageAbilityImpl.S22(java.lang.String, boolean, X.0yS7, java.util.Map, X.0Whz, java.lang.Long, kotlin.jvm.internal.AwS110S1200000_27):void");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void Cs0(String str, BaseVideo baseVideo, BaseImage baseImage, ExtraRequestInfo extraRequestInfo, Map map, C830490Whz c830490Whz, int i, int i2, Integer num, String str2, String str3, String str4, Map map2, TakoEditAskInfo takoEditAskInfo, String str5, int i3) throws JSONException {
        Long lValueOf;
        Integer numValueOf;
        C1863380yae c1863380yae;
        C1863380yae c1863380yae2;
        Map mapLJ = map;
        Iterator<InterfaceC1861820yY8> it2 = C1863280yaU.LJIJJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
        LJFF(takoEditAskInfo);
        C319970CgV.LJ = true;
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.zQ2(str, baseVideo, baseImage, extraRequestInfo, i, i2, num, str2, str3, str4, takoEditAskInfo, str5, i3);
        }
        TakoFragmentViewModel takoFragmentViewModel = this.LLILLJJLI;
        if (takoFragmentViewModel != null) {
            takoFragmentViewModel.Sx2(false);
        }
        c830490Whz.put("message_content", str);
        c830490Whz.put("message_id", str4);
        c830490Whz.put("message_type", "text_video");
        c830490Whz.put("mode_source", "video_gen_sug");
        c830490Whz.put("word_page_source", "video_gen_sug");
        C201996141y c201996141y = C201996141y.LIZ;
        MessageViewModel messageViewModel2 = this.LL;
        Map mapLIZ = null;
        if (messageViewModel2 != null && (c1863380yae2 = messageViewModel2.LLJJJJ) != null) {
            lValueOf = Long.valueOf(c1863380yae2.LJII);
        } else {
            lValueOf = null;
        }
        MessageViewModel messageViewModel3 = this.LL;
        if (messageViewModel3 != null && (c1863380yae = messageViewModel3.LLJJJJ) != null) {
            numValueOf = Integer.valueOf(c1863380yae.LJIIIIZZ);
        } else {
            numValueOf = null;
        }
        c201996141y.getClass();
        String strLJ = C201996141y.LJ(numValueOf, lValueOf);
        if (strLJ != null) {
            c830490Whz.put("is_memory", strLJ);
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if (map2 == null) {
            TakoEnterParams takoEnterParams = this.LLILZ;
            if (takoEnterParams != null) {
                mapLIZ = C1862500yZE.LIZ(takoEnterParams, false);
            }
        } else {
            mapLIZ = map2;
        }
        c1862330yYx.getClass();
        C1862330yYx.LJLLI(mapLJ, c830490Whz, mapLIZ);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void Rl2(String str, boolean z, EnumC1858090yS7 enumC1858090yS7, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, TakoActiveActionItem takoActiveActionItem, TakoActiveBotItem takoActiveBotItem, String str2, int i, Integer num, int i2, int i3, ExtraRequestInfo extraRequestInfo, Map<String, String> map4, String str3, TakoReferenceAskInfo takoReferenceAskInfo, TakoEditAskInfo takoEditAskInfo) throws JSONException {
        Long lValueOf;
        Integer numValueOf;
        Map mapLJ;
        C1863380yae c1863380yae;
        C1863380yae c1863380yae2;
        MessageViewModel messageViewModel;
        Iterator<InterfaceC1861820yY8> it2 = C1863280yaU.LJIJJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
        if (Intrinsics.LJFF(map2.get("mode_source"), "user_onboarding") && !z && (messageViewModel = this.LL) != null) {
            messageViewModel.XQ2(str3);
        }
        LJFF(takoEditAskInfo);
        TakoEditAskInfo takoEditAskInfoLJIIJ = LJIIJ(takoEditAskInfo);
        C319970CgV.LJ = true;
        LIZ(extraRequestInfo);
        MessageViewModel messageViewModel2 = this.LL;
        if (messageViewModel2 != null) {
            messageViewModel2.vQ2(str, z, str3, enumC1858090yS7, map3, takoActiveActionItem, takoActiveBotItem, str2, i, num, i2, i3, extraRequestInfo, takoReferenceAskInfo, takoEditAskInfoLJIIJ);
        }
        TakoFragmentViewModel takoFragmentViewModel = this.LLILLJJLI;
        if (takoFragmentViewModel != null) {
            takoFragmentViewModel.Sx2(false);
        }
        map2.put("message_content", str);
        map2.put("message_id", str3);
        C201996141y c201996141y = C201996141y.LIZ;
        MessageViewModel messageViewModel3 = this.LL;
        Map<String, String> mapLIZ = null;
        if (messageViewModel3 != null && (c1863380yae2 = messageViewModel3.LLJJJJ) != null) {
            lValueOf = Long.valueOf(c1863380yae2.LJII);
        } else {
            lValueOf = null;
        }
        MessageViewModel messageViewModel4 = this.LL;
        if (messageViewModel4 != null && (c1863380yae = messageViewModel4.LLJJJJ) != null) {
            numValueOf = Integer.valueOf(c1863380yae.LJIIIIZZ);
        } else {
            numValueOf = null;
        }
        c201996141y.getClass();
        String strLJ = C201996141y.LJ(numValueOf, lValueOf);
        if (strLJ != null) {
            map2.put("is_memory", strLJ);
        }
        map2.put("interaction_type", LJII(map2.get("interaction_type"), takoReferenceAskInfo, takoEditAskInfoLJIIJ));
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        if (map != null) {
            mapLJ = C2097608Jq.LJIIL(map, C2097608Jq.LJIIIIZZ(new Pair("mode", C1855920yOc.LIZJ(Integer.valueOf(i))), new Pair("sub_mode", C1852810yJb.LIZLLL(Integer.valueOf(i2)))));
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        if (map4 == null) {
            TakoEnterParams takoEnterParams = this.LLILZ;
            if (takoEnterParams != null) {
                mapLIZ = C1862500yZE.LIZ(takoEnterParams, false);
            }
        } else {
            mapLIZ = map4;
        }
        c1862330yYx.getClass();
        C1862330yYx.LJLLI(mapLJ, map2, mapLIZ);
        LJI();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility
    public final void rv1(String str, List list, List list2, boolean z, EnumC1858090yS7 enumC1858090yS7, int i, Integer num, int i2, String str2, String str3, Map map, C830490Whz c830490Whz, boolean z2, ExtraRequestInfo extraRequestInfo, Map map2, Map map3, String str4, TakoReferenceAskInfo takoReferenceAskInfo, TakoEditAskInfo takoEditAskInfo) {
        LJFF(takoEditAskInfo);
        TakoEditAskInfo takoEditAskInfoLJIIJ = LJIIJ(takoEditAskInfo);
        LIZ(extraRequestInfo);
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.xQ2(str, list, list2, z, str4, enumC1858090yS7, i, num, i2, str2, str3, new C1860630yWD(c830490Whz, str, str4, this, takoReferenceAskInfo, takoEditAskInfoLJIIJ, i2, str3, i, map, map2), z2, extraRequestInfo, map3, takoReferenceAskInfo, takoEditAskInfoLJIIJ);
        }
        TakoFragmentViewModel takoFragmentViewModel = this.LLILLJJLI;
        if (takoFragmentViewModel != null) {
            takoFragmentViewModel.Sx2(false);
        }
    }
}
