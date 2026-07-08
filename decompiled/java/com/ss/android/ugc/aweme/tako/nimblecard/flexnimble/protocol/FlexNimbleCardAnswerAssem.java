package com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.protocol;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0HZQ;
import X.C0R2D;
import X.C13IQ;
import X.C13LE;
import X.C14J2;
import X.C14NE;
import X.C14NH;
import X.C14NW;
import X.C14NX;
import X.C15438062q;
import X.C1558520qew;
import X.C1637806bA;
import X.C1858670yT3;
import X.C1858840yTK;
import X.C1909880zne;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C326880Cre;
import X.C329080CvC;
import X.C427660Gpo;
import X.C452070Ho5;
import X.C452501pT;
import X.C685220QuG;
import X.C685230QuH;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C723830SaL;
import X.C724750Sbp;
import X.InterfaceC1860810yWV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC689530R2x;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.nimblecard.NimbleCardUIVM;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.model.NimbleParams;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.protocol.FlexNimbleCardAnswerAssem;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleVM;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS118S1100000_4;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS61S1000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class FlexNimbleCardAnswerAssem extends TakoAnswerBaseAssem<C1858840yTK> implements INimbleContainerAbility, INimbleModelAbility, ITakoNimbleAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLZIL;
    public final int LLLLZLLLI;
    public C14NW LLLZ;
    public C14NW LLLZI;
    public NimbleTemplateContext LLLZIIL;
    public final List<C13IQ<? extends ReusedUISlotAssem<?>>> LLLZIL = new ArrayList();
    public final List<C13IQ<? extends ReusedUIContentAssem<?>>> LLLZL = new ArrayList();
    public final AssemVMLazy LLLZLL;
    public C1858840yTK LLLZLZ;
    public final AssemVMLazy LLLZZ;
    public final C01GW LLLZZIL;
    public String LLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FlexNimbleCardAnswerAssem.class, "messageModel", "getMessageModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FlexNimbleCardAnswerAssem.class, "takoNimbleVM", "getTakoNimbleVM()Lcom/ss/android/ugc/aweme/tako/nimblecard/flexnimble/vm/TakoNimbleVM;", 0);
        c09r3.getClass();
        LLZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void Fp(C14J2 c14j2) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmk;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility
    public final Boolean Yw1(Map<String, ? extends Object> map) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility
    public final Map<String, Object> Zo0() {
        C326880Cre c326880Cre;
        Message message;
        Pair[] pairArr = new Pair[4];
        boolean z = false;
        pairArr[0] = new Pair("shouldShowInteractionBase", "true");
        pairArr[1] = new Pair("shouldShowMessageDisclaimer", "true");
        C1858840yTK c1858840yTK = this.LLLZLZ;
        pairArr[2] = new Pair("shouldHidePushImageBannerButton", Boolean.valueOf((c1858840yTK == null || (c326880Cre = c1858840yTK.LL) == null || (message = c326880Cre.LLILLL) == null || message.hidePushMessageImageButton != 1) ? false : true));
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TakoChatUIAbility.class, null);
        if (takoChatUIAbility != null && takoChatUIAbility.Sb0()) {
            z = true;
        }
        pairArr[3] = new Pair("isTakoMiddlePage", Boolean.valueOf(z));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final NimbleCardUIVM mH0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final int t70() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility
    public final Map<String, String> G7() {
        String str;
        Map<String, String> mapLJ;
        Message messageYy1;
        TakoCardAbility takoCardAbility = (TakoCardAbility) this.LLLZZIL.getValue();
        if (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (str = messageYy1.uuid) == null) {
            str = "";
        }
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("message_id", str));
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return C2097608Jq.LJIIL(mapLIZJ, mapLJ);
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility
    public final Map<String, Object> KD2() {
        Message messageYy1;
        TakoCardAbility takoCardAbility = (TakoCardAbility) this.LLLZZIL.getValue();
        if (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null) {
            return null;
        }
        return messageYy1.LJIILIIL;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void Qp() {
        InterfaceC689530R2x interfaceC689530R2x;
        C14NW c14nw;
        NimbleTemplateContext nimbleTemplateContext = this.LLLZIIL;
        C14NX c14nx = nimbleTemplateContext != null ? nimbleTemplateContext.LLJIJIL : null;
        if (!(c14nx instanceof InterfaceC689530R2x) || (interfaceC689530R2x = (InterfaceC689530R2x) c14nx) == null || (c14nw = this.LLLZI) == null) {
            return;
        }
        interfaceC689530R2x.LJIJJLI(null, c14nw, 0);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final InterfaceC1860810yWV Tp() {
        C14NX c14nx;
        NimbleTemplateContext nimbleTemplateContext = this.LLLZIIL;
        View view = (nimbleTemplateContext == null || (c14nx = nimbleTemplateContext.LLJIJIL) == null) ? null : c14nx.getView();
        if (view instanceof InterfaceC1860810yWV) {
            return (InterfaceC1860810yWV) view;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void Up() {
        InterfaceC689530R2x interfaceC689530R2x;
        C14NW c14nw;
        NimbleTemplateContext nimbleTemplateContext = this.LLLZIIL;
        C14NX c14nx = nimbleTemplateContext != null ? nimbleTemplateContext.LLJIJIL : null;
        if (!(c14nx instanceof InterfaceC689530R2x) || (interfaceC689530R2x = (InterfaceC689530R2x) c14nx) == null || (c14nw = this.LLLZ) == null) {
            return;
        }
        interfaceC689530R2x.LJIIL(c14nw);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void Vp() {
        InterfaceC689530R2x interfaceC689530R2x;
        C14NW c14nw;
        NimbleTemplateContext nimbleTemplateContext = this.LLLZIIL;
        C14NX c14nx = nimbleTemplateContext != null ? nimbleTemplateContext.LLJIJIL : null;
        if (!(c14nx instanceof InterfaceC689530R2x) || (interfaceC689530R2x = (InterfaceC689530R2x) c14nx) == null || (c14nw = this.LLLZI) == null) {
            return;
        }
        interfaceC689530R2x.LJIIL(c14nw);
    }

    public final MessageViewModel Vr() {
        AssemVMLazy assemVMLazy = this.LLLZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLZIL;
        return (MessageViewModel) assemVMLazy.getValue();
    }

    public final TakoNimbleVM Wr() {
        AssemVMLazy assemVMLazy = this.LLLZZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLZIL;
        return (TakoNimbleVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        super.cp();
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), INimbleContainerAbility.class, null);
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), INimbleModelAbility.class, null);
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), ITakoNimbleAbility.class, null);
        NimbleTemplateContext nimbleTemplateContext = this.LLLZIIL;
        if (nimbleTemplateContext != null) {
            nimbleTemplateContext.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.protocol.ITakoNimbleAbility
    public final TakoNimbleVM fq0() {
        return Wr();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, INimbleContainerAbility.class, null, null);
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, INimbleModelAbility.class, null, null);
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, ITakoNimbleAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        View viewFindViewById = LJJIJL().findViewById(R.id.bh2);
        if (viewFindViewById instanceof C427660Gpo) {
            return (C427660Gpo) viewFindViewById;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final /* bridge */ /* synthetic */ Object uv2() {
        return this.LLLZLZ;
    }

    public FlexNimbleCardAnswerAssem(int i) {
        this.LLLLZLLLI = i;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        this.LLLZLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 898), AFwS241S0000000_10.get$arr$(380), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoNimbleVM.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ2, 899);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(381);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ2);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((AbstractC738140SxQ) this, 900), aFwS241S0000000_10, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLLZZ = assemVMLazy;
        this.LLLZZIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 901));
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final C14NX Bs1(C19719912Dl c19719912Dl) {
        Map<C14NX, C13IQ<? extends ReusedUISlotAssem<?>>> map;
        Set setEntrySet;
        Object next;
        NimbleTemplateContext nimbleTemplateContext = this.LLLZIIL;
        if (nimbleTemplateContext == null || (map = nimbleTemplateContext.LLJILJIL) == null || (setEntrySet = ((LinkedHashMap) map).entrySet()) == null) {
            return null;
        }
        Iterator it2 = setEntrySet.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((Map.Entry) next).getValue(), c19719912Dl)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (C14NX) entry.getKey();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void Jp(Integer num) {
        C14NX c14nx;
        InterfaceC689530R2x interfaceC689530R2x;
        C14NW c14nw;
        int iIntValue;
        NimbleTemplateContext nimbleTemplateContext = this.LLLZIIL;
        if (nimbleTemplateContext != null) {
            c14nx = nimbleTemplateContext.LLJIJIL;
        } else {
            c14nx = null;
        }
        if ((c14nx instanceof InterfaceC689530R2x) && (interfaceC689530R2x = (InterfaceC689530R2x) c14nx) != null && (c14nw = this.LLLZ) != null) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            interfaceC689530R2x.LJIJJLI(null, c14nw, iIntValue);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Xr, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void up(C1858840yTK c1858840yTK) {
        ArrayList arrayList;
        NimbleParams nimbleParams;
        Integer num;
        NimbleParams nimbleParams2;
        final String str;
        final float fFloatValue;
        NimbleParams nimbleParams3;
        String str2;
        C326880Cre c326880Cre;
        Message message;
        NimbleParams nimbleParams4;
        Float f;
        int i;
        int length;
        String string;
        String str3;
        String str4;
        int i2;
        int length2;
        String string2;
        NimbleParams nimbleParams5;
        Integer num2;
        NimbleParams nimbleParams6;
        String str5;
        String str6;
        C326880Cre c326880Cre2;
        Message message2;
        final FlexNimbleCardAnswerAssem flexNimbleCardAnswerAssem = this;
        super.up(c1858840yTK);
        flexNimbleCardAnswerAssem.LLLZLZ = c1858840yTK;
        TakoEnterParams takoEnterParams = flexNimbleCardAnswerAssem.Vr().LLILLL;
        if (takoEnterParams != null && (nimbleParams5 = takoEnterParams.getNimbleParams()) != null && (num2 = nimbleParams5.nimbleOffsetIndex) != null) {
            int iIntValue = num2.intValue();
            TakoEnterParams takoEnterParams2 = flexNimbleCardAnswerAssem.Vr().LLILLL;
            if (takoEnterParams2 != null && (nimbleParams6 = takoEnterParams2.getNimbleParams()) != null && (str5 = nimbleParams6.nimbleOffsetMessageUUID) != null) {
                C1858840yTK c1858840yTK2 = flexNimbleCardAnswerAssem.LLLZLZ;
                if (c1858840yTK2 != null && (c326880Cre2 = c1858840yTK2.LLJJIJI) != null && (message2 = c326880Cre2.LLILLL) != null) {
                    str6 = message2.uuid;
                } else {
                    str6 = null;
                }
                if (Intrinsics.LJFF(str6, str5) && iIntValue >= 0) {
                    C0R2D.LIZ("cache.products[index].extend", flexNimbleCardAnswerAssem.KD2(), Collections.singletonList(new Pair("index", Integer.valueOf(iIntValue))), Boolean.TRUE);
                }
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str7 = "";
        if (C1858670yT3.LJFF(c1858840yTK.LL.LLILLL)) {
            ExecutorService executorService = C1909880zne.LIZ;
            NimbleTemplateContext nimbleTemplateContext = flexNimbleCardAnswerAssem.LLLZIIL;
            if (nimbleTemplateContext == null || (str4 = nimbleTemplateContext.LLILZLL) == null) {
                str4 = "";
            }
            Pair[] pairArr = new Pair[4];
            TakoMixFeed takoMixFeed = c1858840yTK.LLILZLL;
            if (takoMixFeed != null) {
                i2 = takoMixFeed.cardType;
            } else {
                i2 = 0;
            }
            pairArr[0] = new Pair("card_type", String.valueOf(i2));
            String str8 = c1858840yTK.LLJJIJIIJIL;
            if (str8 != null) {
                length2 = str8.length();
            } else {
                length2 = 0;
            }
            pairArr[1] = new Pair("text_count", String.valueOf(length2));
            C14NH c14nh = C14NH.LIZ;
            Integer numValueOf = Integer.valueOf(flexNimbleCardAnswerAssem.LLLLZLLLI);
            c14nh.getClass();
            pairArr[2] = new Pair("template_version", C14NH.LJIIJ(numValueOf));
            TakoCardAbility takoCardAbility = (TakoCardAbility) flexNimbleCardAnswerAssem.LLLZZIL.getValue();
            if (takoCardAbility != null) {
                string2 = Integer.valueOf(takoCardAbility.t70()).toString();
            } else {
                string2 = null;
            }
            pairArr[3] = new Pair("is_nimble", string2);
            C1909880zne.LIZIZ(str4, C2097608Jq.LJIIIIZZ(pairArr));
        }
        NimbleTemplateContext nimbleTemplateContext2 = flexNimbleCardAnswerAssem.LLLZIIL;
        if (nimbleTemplateContext2 != null) {
            nimbleTemplateContext2.LIZIZ(c1858840yTK.LLJJJIL, null, true);
        }
        if (C1858670yT3.LJFF(c1858840yTK.LL.LLILLL)) {
            ExecutorService executorService2 = C1909880zne.LIZ;
            NimbleTemplateContext nimbleTemplateContext3 = flexNimbleCardAnswerAssem.LLLZIIL;
            if (nimbleTemplateContext3 != null && (str3 = nimbleTemplateContext3.LLILZLL) != null) {
                str7 = str3;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            Pair[] pairArr2 = new Pair[4];
            TakoMixFeed takoMixFeed2 = c1858840yTK.LLILZLL;
            if (takoMixFeed2 != null) {
                i = takoMixFeed2.cardType;
            } else {
                i = 0;
            }
            pairArr2[0] = new Pair("card_type", String.valueOf(i));
            String str9 = c1858840yTK.LLJJIJIIJIL;
            if (str9 != null) {
                length = str9.length();
            } else {
                length = 0;
            }
            pairArr2[1] = new Pair("text_count", String.valueOf(length));
            C14NH c14nh2 = C14NH.LIZ;
            Integer numValueOf2 = Integer.valueOf(flexNimbleCardAnswerAssem.LLLLZLLLI);
            c14nh2.getClass();
            pairArr2[2] = new Pair("template_version", C14NH.LJIIJ(numValueOf2));
            TakoCardAbility takoCardAbility2 = (TakoCardAbility) flexNimbleCardAnswerAssem.LLLZZIL.getValue();
            if (takoCardAbility2 != null) {
                string = Integer.valueOf(takoCardAbility2.t70()).toString();
            } else {
                string = null;
            }
            pairArr2[3] = new Pair("is_nimble", string);
            C1909880zne.LIZ(jCurrentTimeMillis2, str7, C2097608Jq.LJIIIIZZ(pairArr2));
        }
        List<TakoVideoItem> list = c1858840yTK.LLJJJJ;
        if (list == null || !list.isEmpty()) {
            List<TakoVideoItem> list2 = c1858840yTK.LLJJJJ;
            if (list2 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<TakoVideoItem> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().awemeId);
                }
            } else {
                arrayList = null;
            }
            String strValueOf = String.valueOf(arrayList);
            if (!Intrinsics.LJFF(strValueOf, flexNimbleCardAnswerAssem.LLZ)) {
                flexNimbleCardAnswerAssem.LLZ = strValueOf;
                TakoNimbleVM takoNimbleVMWr = flexNimbleCardAnswerAssem.Wr();
                takoNimbleVMWr.withState(new AwS118S1100000_4(takoNimbleVMWr, strValueOf, 6));
                TakoNimbleVM takoNimbleVMWr2 = flexNimbleCardAnswerAssem.Wr();
                AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(446);
                AFwS196S0000000_10 aFwS196S0000000_10 = AFwS196S0000000_10.get$arr$(463);
                AwS376S0200000_10 awS376S0200000_10 = new AwS376S0200000_10(flexNimbleCardAnswerAssem, c1858840yTK, 89);
                flexNimbleCardAnswerAssem = flexNimbleCardAnswerAssem;
                AssemViewModel.asyncSubscribe$default(takoNimbleVMWr2, C329080CvC.LL, flexNimbleCardAnswerAssem, null, aFwS241S0000000_10, aFwS196S0000000_10, awS376S0200000_10, 4, null);
            }
        }
        String str10 = null;
        C723830SaL.LIZ(flexNimbleCardAnswerAssem, null, new C685220QuG(flexNimbleCardAnswerAssem));
        TakoEnterParams takoEnterParams3 = flexNimbleCardAnswerAssem.Vr().LLILLL;
        if (takoEnterParams3 != null && (nimbleParams = takoEnterParams3.getNimbleParams()) != null && (num = nimbleParams.nimbleOffsetIndex) != null) {
            int iIntValue2 = num.intValue();
            TakoEnterParams takoEnterParams4 = flexNimbleCardAnswerAssem.Vr().LLILLL;
            if (takoEnterParams4 != null && (nimbleParams2 = takoEnterParams4.getNimbleParams()) != null && (str = nimbleParams2.nimbleOffsetPositionNode) != null) {
                TakoEnterParams takoEnterParams5 = flexNimbleCardAnswerAssem.Vr().LLILLL;
                if (takoEnterParams5 != null && (nimbleParams4 = takoEnterParams5.getNimbleParams()) != null && (f = nimbleParams4.nimbleOffset) != null) {
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                TakoEnterParams takoEnterParams6 = flexNimbleCardAnswerAssem.Vr().LLILLL;
                if (takoEnterParams6 != null && (nimbleParams3 = takoEnterParams6.getNimbleParams()) != null && (str2 = nimbleParams3.nimbleOffsetMessageUUID) != null) {
                    C1858840yTK c1858840yTK3 = flexNimbleCardAnswerAssem.LLLZLZ;
                    if (c1858840yTK3 != null && (c326880Cre = c1858840yTK3.LLJJIJI) != null && (message = c326880Cre.LLILLL) != null) {
                        str10 = message.uuid;
                    }
                    if (Intrinsics.LJFF(str10, str2) && iIntValue2 >= 0) {
                        HandlerHook.viewPost(flexNimbleCardAnswerAssem.LJJIJL(), new Runnable() { // from class: X.0R2z
                            public final void LIZ() {
                                C14NX c14nx;
                                NimbleTemplateContext nimbleTemplateContext4 = this.LL.LLLZIIL;
                                if (nimbleTemplateContext4 == null || (c14nx = nimbleTemplateContext4.LLJIJIL) == null) {
                                    return;
                                }
                                String str11 = str;
                                FlexNimbleCardAnswerAssem flexNimbleCardAnswerAssem2 = this.LL;
                                final float f2 = fFloatValue;
                                C14NX c14nxLIZ = C14NE.LIZ(c14nx, new AwS61S1000000_10(str11, 16));
                                if (c14nxLIZ != null) {
                                    TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(C1558520qew.LJIIL(flexNimbleCardAnswerAssem2), TakoChatUIAbility.class, null);
                                    if (takoChatUIAbility != null) {
                                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvCM = takoChatUIAbility.cM();
                                        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = viewOnAttachStateChangeListenerC20604515jvCM instanceof View ? viewOnAttachStateChangeListenerC20604515jvCM : null;
                                        final View view = c14nxLIZ.getView();
                                        final AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(flexNimbleCardAnswerAssem2, 994);
                                        if (viewOnAttachStateChangeListenerC20604515jv == null || view == null) {
                                            return;
                                        }
                                        C786410Ut5.x3(viewOnAttachStateChangeListenerC20604515jv.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0Gmh
                                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                            public final void onGlobalLayout() {
                                                C786410Ut5.C3(viewOnAttachStateChangeListenerC20604515jv.getViewTreeObserver(), this);
                                                int[] iArr = new int[2];
                                                view.getLocationOnScreen(iArr);
                                                int i3 = iArr[1];
                                                int[] iArr2 = new int[2];
                                                viewOnAttachStateChangeListenerC20604515jv.getLocationOnScreen(iArr2);
                                                int i4 = i3 - iArr2[1];
                                                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                                                Float fValueOf = Float.valueOf(f2);
                                                c1546210qL5.getClass();
                                                viewOnAttachStateChangeListenerC20604515jv.scrollBy(0, i4 - C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)));
                                                awS554S0100000_10.invoke();
                                            }
                                        });
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("FlexNimbleCardAnswerAssem@4657.handleScrollMessage$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("FlexNimbleCardAnswerAssem@4657.handleScrollMessage$1");
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final void jE1(String str) {
        C1858840yTK c1858840yTK;
        NimbleTemplateContext nimbleTemplateContext;
        C14NX c14nx;
        C14NX c14nxLIZ;
        if ((str == null || str.length() == 0) && (c1858840yTK = this.LLLZLZ) != null && (nimbleTemplateContext = this.LLLZIIL) != null) {
            nimbleTemplateContext.LIZIZ(c1858840yTK.LLJJJIL, null, true);
        }
        NimbleTemplateContext nimbleTemplateContext2 = this.LLLZIIL;
        if (nimbleTemplateContext2 != null && (c14nx = nimbleTemplateContext2.LLJIJIL) != null && (c14nxLIZ = C14NE.LIZ(c14nx, new AwS61S1000000_10(str, 7))) != null) {
            c14nxLIZ.LJIILJJIL(c14nxLIZ.LIZJ(), c14nxLIZ.LJIIIIZZ());
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View view2;
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null) {
            C14NH c14nh = C14NH.LIZ;
            Integer numValueOf = Integer.valueOf(this.LLLLZLLLI);
            c14nh.getClass();
            NimbleTemplateContext nimbleTemplateContextLJIIL = C14NH.LJIIL(C14NH.LJII(numValueOf), context, C2097608Jq.LJIIIIZZ(new Pair("biz", "tako"), new Pair(FollowStatusChangeMethod.PARAM_UID, C14NH.LJIIIZ(Integer.valueOf(this.LLLLZLLLI)))), this, false);
            if (nimbleTemplateContextLJIIL != null) {
                this.LLLZ = new C14NW(nimbleTemplateContextLJIIL, tq());
                this.LLLZI = new C14NW(nimbleTemplateContextLJIIL, vq());
                nimbleTemplateContextLJIIL.LIZ(C1558520qew.LJIIL(this));
                nimbleTemplateContextLJIIL.LLIZ = this;
                C14NX c14nx = nimbleTemplateContextLJIIL.LLJIJIL;
                if (c14nx != null && (view2 = c14nx.getView()) != null) {
                    ((ViewGroup) LJJIJL()).addView(view2);
                }
            } else {
                nimbleTemplateContextLJIIL = null;
            }
            this.LLLZIIL = nimbleTemplateContextLJIIL;
        }
        C723830SaL.LIZ(this, null, new C685230QuH(this));
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final void Sg1(List list, AwS376S0200000_10 awS376S0200000_10) {
        TakoNimbleVM takoNimbleVMWr = Wr();
        takoNimbleVMWr.withState(new AwS118S1100000_4(takoNimbleVMWr, list.toString(), 6));
        AssemViewModel.asyncSubscribe$default(Wr(), C329080CvC.LL, this, null, null, null, new AwS589S0100000_10(awS376S0200000_10, 429), 4, null);
    }
}
