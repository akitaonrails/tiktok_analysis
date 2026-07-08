package com.ss.android.ugc.aweme.tako.botpage.vm;

import X.AbstractC1387200mCc;
import X.AbstractC2238408pq;
import X.AbstractC316870CbV;
import X.AbstractC321890Cjb;
import X.AnonymousClass0956;
import X.C01GW;
import X.C07I5;
import X.C07I8;
import X.C08A4;
import X.C08CX;
import X.C0AX1;
import X.C0CW5;
import X.C0CW6;
import X.C0CW8;
import X.C0CWA;
import X.C0DQF;
import X.C0PEM;
import X.C1388190mED;
import X.C13BV;
import X.C13EL;
import X.C13EM;
import X.C13LP;
import X.C15438062q;
import X.C1777730wMV;
import X.C1855910yOb;
import X.C1855920yOc;
import X.C1857530yRD;
import X.C1858360ySY;
import X.C1859480yUM;
import X.C1860520yW2;
import X.C1860570yW7;
import X.C1860690yWJ;
import X.C1860850yWZ;
import X.C1861040yWs;
import X.C1861390yXR;
import X.C1861400yXS;
import X.C1861430yXV;
import X.C1861440yXW;
import X.C1861490yXb;
import X.C1861540yXg;
import X.C1861560yXi;
import X.C1861590yXl;
import X.C1861630yXp;
import X.C1861740yY0;
import X.C1861750yY1;
import X.C1861940yYK;
import X.C1862330yYx;
import X.C1862370yZ1;
import X.C1862400yZ4;
import X.C1862500yZE;
import X.C1863280yaU;
import X.C1863340yaa;
import X.C1863380yae;
import X.C1863420yai;
import X.C1863680yb8;
import X.C1863810ybL;
import X.C1870240yli;
import X.C189200o6;
import X.C1906580ziK;
import X.C1DFB;
import X.C1DFH;
import X.C201996141y;
import X.C20227614Cs;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C21140317o9;
import X.C2188811AlT;
import X.C23250099c;
import X.C259800zU;
import X.C315360CXu;
import X.C315370CXv;
import X.C316140CaK;
import X.C316640Cb8;
import X.C317290CcB;
import X.C319010Cex;
import X.C319580Cfs;
import X.C319590Cft;
import X.C319600Cfu;
import X.C319610Cfv;
import X.C319660Cg0;
import X.C320080Cgg;
import X.C320400ChC;
import X.C320410ChD;
import X.C321910Cjd;
import X.C321970Cjj;
import X.C323380Cm0;
import X.C324740CoC;
import X.C324800CoI;
import X.C325070Coj;
import X.C325080Cok;
import X.C326880Cre;
import X.C444801oE;
import X.C452501pT;
import X.C817503Hh;
import X.C830490Whz;
import X.EnumC1858090yS7;
import X.InterfaceC1364105Vn;
import X.InterfaceC1858000yRy;
import X.InterfaceC1861530yXf;
import X.InterfaceC332260D0u;
import X.InterfaceC497601wk;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveActionItem;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoClientExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNimbleConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.network.ITakoNetworkGate;
import com.ss.android.ugc.aweme.tako.vm.TakoChatBotSharedViewModel;
import defpackage.k9;
import defpackage.p2;
import defpackage.w2;
import defpackage.x2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS122S0400000_27;
import kotlin.jvm.internal.AwS141S1100000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS39S0010000_27;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS44S0310000_27;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS78S0210000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class MessageViewModel extends AssemViewModel<C1861040yWs> {
    public static final /* synthetic */ int LLLF = 0;
    public TakoEnterParams LLILLL;
    public volatile boolean LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public volatile boolean LLJILJILJ;
    public volatile boolean LLJILLL;
    public volatile boolean LLJJI;
    public AnonymousClass0956 LLJJIII;
    public volatile boolean LLJJIJI;
    public volatile boolean LLJJIJIIJIL;
    public boolean LLJJJIL;
    public C1863380yae LLJJJJ;
    public AnonymousClass0956 LLJJJJLIIL;
    public AnonymousClass0956 LLJJL;
    public AnonymousClass0956 LLJJLIIIJLLLLLLLZ;
    public AnonymousClass0956 LLJL;
    public AnonymousClass0956 LLJLIL;
    public AnonymousClass0956 LLJLILLLLZIIL;
    public AnonymousClass0956 LLJLL;
    public boolean LLJLLL;
    public C1861750yY1 LLJZIJLIL;
    public final C1859480yUM LL = new C1859480yUM();
    public final C1861590yXl LLILLJJLI = new C1861590yXl(0);
    public final C1861540yXg LLILZ = new C1861540yXg();
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 816));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 819));
    public final AtomicBoolean LLJI = new AtomicBoolean(false);
    public final int LLJIJIL = 20;
    public final long LLJILJIL = 100;
    public volatile String LLJJ = CardStruct.IStatusCode.DEFAULT;
    public final int LLJJIJIL = 10;
    public final long LLJJJ = 3000;
    public final Set<String> LLJJJJJIL = new LinkedHashSet();
    public final CopyOnWriteArrayList<InterfaceC1861530yXf> LLJLLIL = new CopyOnWriteArrayList<>();
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 265));
    public final ArrayList<String> LLL = new ArrayList<>();

    public final void AQ2() {
        this.LLJILJILJ = false;
        ((C444801oE) this.LLILZIL.getValue()).LIZ();
    }

    public final void bR2() {
        this.LLJJI = false;
        this.LLJILJILJ = false;
        this.LLJJIJI = false;
        ((C444801oE) this.LLILZIL.getValue()).LIZ();
        AnonymousClass0956 anonymousClass0956 = this.LLJJIII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJIII = null;
    }

    public final String FQ2() {
        C1863380yae c1863380yae = this.LLJJJJ;
        if (c1863380yae == null) {
            return "default";
        }
        if (c1863380yae.LJJ != null) {
            return C1855920yOc.LIZJ(c1863380yae != null ? c1863380yae.LJJ : null);
        }
        return (c1863380yae == null || !c1863380yae.LJIL) ? "default" : "deep_thinking";
    }

    public final void UQ2() {
        if (this.LLIZ) {
            this.LLIZ = false;
            ((C444801oE) this.LLILZLL.getValue()).LIZ();
            AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLIZLLLIL = null;
            this.LLJI.set(false);
            setState(new AwS39S0010000_27(false, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019c A[PHI: r0
      0x019c: PHI (r0v35 com.ss.android.ugc.aweme.tako.ccl.model.api.Message) = 
      (r0v33 com.ss.android.ugc.aweme.tako.ccl.model.api.Message)
      (r0v60 com.ss.android.ugc.aweme.tako.ccl.model.api.Message)
     binds: [B:112:0x0196, B:68:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o defaultState() {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel.defaultState():X.002o");
    }

    public final void gR2() {
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJ = null;
        AnonymousClass0956 anonymousClass09562 = this.LLJJJJLIIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09563 = this.LLJJL;
        if (anonymousClass09563 != null) {
            anonymousClass09563.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09564 = this.LLJJLIIIJLLLLLLLZ;
        if (anonymousClass09564 != null) {
            anonymousClass09564.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09565 = this.LLJL;
        if (anonymousClass09565 != null) {
            anonymousClass09565.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09566 = this.LLJLILLLLZIIL;
        if (anonymousClass09566 != null) {
            anonymousClass09566.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09567 = this.LLJLL;
        if (anonymousClass09567 != null) {
            anonymousClass09567.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09568 = this.LLJLIL;
        if (anonymousClass09568 != null) {
            anonymousClass09568.LIZIZ(null);
        }
        if (C1863680yb8.LIZLLL()) {
            this.LLJJIJIIJIL = false;
            bR2();
        }
    }

    public final boolean oj() {
        C1863420yai c1863420yai = C1863380yae.LJJII;
        C1863380yae c1863380yae = this.LLJJJJ;
        Long lValueOf = c1863380yae != null ? Long.valueOf(c1863380yae.LJII) : null;
        C1863380yae c1863380yae2 = this.LLJJJJ;
        Integer numValueOf = c1863380yae2 != null ? Integer.valueOf(c1863380yae2.LJIIIIZZ) : null;
        C1863380yae c1863380yae3 = this.LLJJJJ;
        InterfaceC332260D0u interfaceC332260D0uLIZLLL = c1863420yai.LIZLLL(numValueOf, lValueOf, c1863380yae3 != null ? c1863380yae3.LJIILIIL : null);
        boolean z = false;
        if (interfaceC332260D0uLIZLLL != null && ((Boolean) interfaceC332260D0uLIZLLL.getValue()).booleanValue()) {
            z = true;
        }
        return !z;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJ = null;
        AnonymousClass0956 anonymousClass09562 = this.LLIZLLLIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLIZLLLIL = null;
        if (this.LLJJJIL) {
            C325080Cok.LIZ.getClass();
            C325070Coj.LIZIZ = null;
        }
        bR2();
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C320080Cgg(this, null), 2);
        super.onCleared();
    }

    public static Activity RQ2() {
        Context contextLJIIIIZZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ == null || (contextLJIIIIZZ = abstractC1387200mCcLIZIZ.LJIIIIZZ()) == null) {
            return null;
        }
        return C1388190mED.LIZ(contextLJIIIIZZ);
    }

    public static View SQ2() {
        View viewFindViewById;
        Fragment fragmentLIZLLL;
        View view;
        Fragment fragmentLIZLLL2;
        View view2;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (fragmentLIZLLL2 = abstractC1387200mCcLJ.LIZLLL()) != null && (view2 = fragmentLIZLLL2.getView()) != null && view2.isAttachedToWindow()) {
            return view2;
        }
        Activity activityRQ2 = RQ2();
        if (activityRQ2 != null) {
            viewFindViewById = activityRQ2.findViewById(R.id.content);
            if (viewFindViewById != null && viewFindViewById.isAttachedToWindow()) {
                return viewFindViewById;
            }
        } else {
            viewFindViewById = null;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
        return (abstractC1387200mCcLJ2 == null || (fragmentLIZLLL = abstractC1387200mCcLJ2.LIZLLL()) == null || (view = fragmentLIZLLL.getView()) == null) ? viewFindViewById : view;
    }

    public final List<String> EQ2() {
        String str;
        List<C326880Cre> listSL = sL();
        ArrayList arrayList = new ArrayList();
        Iterator<C326880Cre> it2 = listSL.iterator();
        while (it2.hasNext()) {
            Message message = it2.next().LLILLL;
            if (Intrinsics.LJFF(message.LJIIJ, Boolean.TRUE) && (str = message.uuid) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [T, com.ss.android.ugc.aweme.tako.network.TakoNetworkState] */
    public final void VQ2() {
        if (C1863680yb8.LIZ().history.enable) {
            this.LLIZ = true;
            boolean zLIZ = C1861560yXi.LIZ(C1863680yb8.LIZ().history.enable);
            setState(new AwS39S0010000_27(true, 2));
            if (C1863680yb8.LIZ().history.enable) {
                AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LLIZLLLIL = null;
                ITakoNetworkGate iTakoNetworkGate = (ITakoNetworkGate) C21140317o9.LIZ.getValue();
                if (iTakoNetworkGate != null) {
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = iTakoNetworkGate.LIZIZ();
                    this.LLIZLLLIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C319010Cex(iTakoNetworkGate, c259800zU, this, null), 2);
                }
            }
            if (zLIZ) {
                C0DQF.LIZ.LJIIJ(RQ2(), SQ2());
            } else {
                ((C444801oE) this.LLILZLL.getValue()).LIZIZ(C1863680yb8.LIZ().history.timeoutMs, new AwS571S0100000_27(this, 817), new AwS571S0100000_27(this, 818), AFwS216S0000000_27.get$arr$(22));
            }
        }
    }

    public final List<C326880Cre> sL() {
        List<InterfaceC1858000yRy> list = getState().LL.LIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C326880Cre) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean NQ2(x2 x2Var) {
        p2 p2Var = x2Var.LJ.LIZLLL;
        if (p2Var != null && p2Var.getOp() == 1007 && x2Var.LIZ.msgType == 7) {
            return true;
        }
        return false;
    }

    public static boolean OQ2(x2 x2Var) {
        p2 p2Var = x2Var.LJ.LIZLLL;
        if (p2Var != null && p2Var.getOp() == 9 && x2Var.LIZ.msgType != 3) {
            return true;
        }
        return false;
    }

    public static boolean PQ2(String str) {
        C324800CoI.LIZ.getClass();
        if (!C324800CoI.LIZ() || (str != null && C1861740yY0.LIZIZ(str))) {
            return true;
        }
        return false;
    }

    public static String QQ2(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "sending";
            }
            if (num.intValue() == 2) {
                return "sendSuccess";
            }
            if (num.intValue() == 3) {
                return "sendError";
            }
            if (num.intValue() != 4 && num.intValue() != 5) {
                if (num.intValue() == 6) {
                    return "receiveSuccess";
                }
                if (num.intValue() == 7) {
                    return "receiveError";
                }
                return "other";
            }
            return "receiving";
        }
        return "other";
    }

    public static void YQ2(List list) {
        Set setLLIIJI;
        List<String> list2;
        List<String> list3;
        if (!C1861390yXR.LJ() || (list3 = C1861390yXR.LIZIZ.LJIILJJIL) == null || (setLLIIJI = C13LP.LLIIJI(list3)) == null) {
            setLLIIJI = C08CX.INSTANCE;
        }
        if (setLLIIJI.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Message message = (Message) it2.next();
            if (setLLIIJI.contains(message.uuid)) {
                message.LJIIJ = Boolean.TRUE;
                linkedHashSet.add(message.uuid);
            }
        }
        if ((!linkedHashSet.isEmpty()) && (list2 = C1861390yXR.LIZIZ.LJIILJJIL) != null) {
            list2.removeAll(C13LP.LLIIJI(linkedHashSet));
        }
    }

    public final List<Message> CM2(String str) {
        if (str.length() == 0) {
            return C13BV.INSTANCE;
        }
        C1863380yae c1863380yae = this.LLJJJJ;
        if (c1863380yae != null) {
            return c1863380yae.LJIILL.LJJLI(str);
        }
        return null;
    }

    public final void CQ2(Message message) {
        C1855910yOb.LIZ(message, new AwS583S0100000_4(this, 139));
    }

    public final int DQ2(Message message) {
        List<Message> listCM2;
        if (message.replyUuid.length() != 0 && (listCM2 = CM2(message.replyUuid)) != null) {
            Iterator<Message> it2 = listCM2.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it2.next().msgId, message.msgId)) {
                    if (i > 0) {
                        return i;
                    }
                } else {
                    i++;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GQ2(defpackage.x2 r45) {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel.GQ2(x2):void");
    }

    public final void JQ2(w2 w2Var) {
        Object it2 = new C13EL(w2Var.LIZIZ).iterator();
        while (true) {
            C13EM c13em = (C13EM) it2;
            if (c13em.hasNext()) {
                Message message = (Message) c13em.next();
                if (message.channel == 1 && !message.LIZ) {
                    Iterator<InterfaceC1861530yXf> it3 = this.LLJLLIL.iterator();
                    while (it3.hasNext()) {
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1861400yXS(this, message, it3.next(), null), 2);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void KQ2(w2 w2Var) {
        boolean z;
        String str;
        TakoNimbleConfig takoNimbleConfig;
        Iterator<Message> it2 = w2Var.LIZIZ.iterator();
        while (true) {
            Integer numValueOf = null;
            if (!it2.hasNext()) {
                break;
            }
            Message next = it2.next();
            p2.a aVar = p2.LIZ;
            p2 p2Var = w2Var.LJIIIIZZ.LIZLLL;
            if (p2Var != null) {
                numValueOf = Integer.valueOf(p2Var.getOp());
            }
            aVar.getClass();
            if (p2.a.LIZ(numValueOf)) {
                if (next.sender.isSelf) {
                    Iterator<InterfaceC1861530yXf> it3 = this.LLJLLIL.iterator();
                    while (it3.hasNext()) {
                        it3.next().LIZIZ(next);
                    }
                } else {
                    Iterator<InterfaceC1861530yXf> it4 = this.LLJLLIL.iterator();
                    while (it4.hasNext()) {
                        it4.next().LIZ(next);
                    }
                }
            }
        }
        List<InterfaceC1858000yRy> list = getState().LL.LIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C326880Cre) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            TakoMixFeed takoMixFeedLJIIIZ = ((C326880Cre) obj2).LLILLL.LJIIIZ();
            if (takoMixFeedLJIIIZ != null && (takoNimbleConfig = takoMixFeedLJIIIZ.nimbleConfig) != null) {
                str = takoNimbleConfig.nimbleKey;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "multi_modal_push")) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((C326880Cre) obj3).LLILLL.hidePushMessageImageButton == 0) {
                arrayList3.add(obj3);
            }
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            nR2(this, Message.LIZLLL(((C326880Cre) it5.next()).LLILLL, null, 0, false, 1, false, null, false, Integer.MAX_VALUE, 2097151), false, 6);
        }
        List<Message> list2 = w2Var.LIZIZ;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = false;
        } else {
            Iterator<Message> it6 = list2.iterator();
            while (it6.hasNext()) {
                if (it6.next().LIZLLL > 0) {
                    z = true;
                    if (C1863680yb8.LIZLLL()) {
                        this.LLJJIJIIJIL = true;
                        bR2();
                    }
                }
            }
            z = false;
        }
        if (C1858360ySY.LIZIZ.LIZ) {
            List<Message> list3 = w2Var.LIZIZ;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (Message message : list3) {
                    long j = message.LIZLLL;
                    C1777730wMV c1777730wMV = C1858360ySY.LIZIZ;
                    if (j > c1777730wMV.LIZIZ || message.serverSeq > c1777730wMV.LIZJ) {
                        this.LLJLLL = true;
                        break;
                    }
                }
            }
        }
        setState(new AwS78S0210000_27(w2Var, this, z, 3));
    }

    public final TakoSug LQ2(C1863340yaa c1863340yaa) {
        long j;
        Message message;
        C1863810ybL c1863810ybL = c1863340yaa.LIZIZ;
        String str = null;
        if (!c1863810ybL.LJII) {
            return null;
        }
        List<String> list = c1863810ybL.LIZIZ;
        if (!(!list.isEmpty())) {
            return null;
        }
        C1863380yae c1863380yae = this.LLJJJJ;
        if (c1863380yae != null) {
            j = c1863380yae.LJII;
        } else {
            j = 1;
        }
        C1863810ybL c1863810ybL2 = c1863340yaa.LIZIZ;
        boolean z = c1863810ybL2.LJFF;
        int i = c1863810ybL2.LJ;
        ArrayList<Message> arrayList = c1863340yaa.LIZ;
        if ((!arrayList.isEmpty()) && (message = (Message) C13LP.LJJJLL(arrayList)) != null) {
            str = message.uuid;
        }
        TakoSug takoSug = new TakoSug(z, list, Integer.valueOf(i), str, null, null, null, false, 0, null, null, null, null, null, null, null, null, j, null, null, 0L, null, false, false, null, null, 0, 0L, false, null, c1863340yaa.LIZIZ.LJIIIIZZ, false, false, false, false, null, null, -1073872912, 31, null);
        takoSug.LJFF = c1863340yaa.LIZIZ.LJIIIZ;
        return takoSug;
    }

    public final void Uj0(C1863340yaa c1863340yaa) throws JSONException {
        TakoSug takoSugLQ2;
        if (c1863340yaa.LJIIJJI) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1861440yXW(this, c1863340yaa, null), 2);
        } else {
            kR2(c1863340yaa);
        }
        C1863810ybL c1863810ybL = c1863340yaa.LIZIZ;
        if (!c1863810ybL.LIZJ) {
            if (c1863340yaa.LJ.LIZJ) {
                w2 w2Var = new w2(w2.a.NEW, c1863340yaa.LIZ, false, false, false, 0, null, null, null, 508);
                TakoSug takoSugLQ22 = LQ2(c1863340yaa);
                Map<String, String> map = c1863340yaa.LJFF.LIZIZ;
                AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27(this, c1863340yaa, 50);
                boolean z = c1863340yaa.LJIIJJI;
                C1861940yYK.LIZLLL(w2Var.LIZIZ);
                C1861940yYK.LJ(w2Var.LIZIZ);
                if (z) {
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0CW8(this, w2Var, map, null), 2);
                } else {
                    BQ2(w2Var, map);
                }
                setState(new AwS122S0400000_27(this, w2Var, takoSugLQ22, awS393S0200000_27, 0));
            }
        } else if (c1863810ybL.LJII && (takoSugLQ2 = LQ2(c1863340yaa)) != null) {
            setState(new AwS393S0200000_27(takoSugLQ2, this, 11));
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1861490yXb(this, c1863340yaa, null), 2);
    }

    public final C1861040yWs WQ2(C1861040yWs c1861040yWs) {
        String str;
        Object objPrevious;
        Integer numValueOf;
        Message messageMv2;
        String str2;
        Integer numValueOf2;
        Long lValueOf;
        Message messageLIZ;
        Message messageLIZ2;
        String str3;
        Message message;
        Object objPrevious2;
        String str4;
        String str5;
        Message message2;
        Message message3;
        MessageSender messageSender;
        List<InterfaceC1858000yRy> list = c1861040yWs.LL.LIZ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1858000yRy interfaceC1858000yRy : list) {
            if (interfaceC1858000yRy instanceof C326880Cre) {
                arrayList.add(interfaceC1858000yRy);
            }
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            str = null;
            if (listIterator.hasPrevious()) {
                objPrevious = listIterator.previous();
                Message messageLIZ3 = C321970Cjj.LIZ((C326880Cre) objPrevious);
                if (messageLIZ3 != null && (messageSender = messageLIZ3.sender) != null && messageSender.isSelf) {
                    break;
                }
            } else {
                objPrevious = null;
                break;
            }
        }
        C326880Cre c326880Cre = (C326880Cre) objPrevious;
        if (c326880Cre != null && (message3 = c326880Cre.LLILLL) != null) {
            numValueOf = Integer.valueOf(message3.LIZIZ);
        } else {
            numValueOf = null;
        }
        if (!C08A4.LIZ(numValueOf) || (c326880Cre != null && (message2 = c326880Cre.LLILLL) != null && message2.LIZIZ == 3)) {
            objPrevious = null;
        }
        C326880Cre c326880Cre2 = (C326880Cre) objPrevious;
        String str6 = "";
        if (c326880Cre2 != null) {
            messageMv2 = mv2(c326880Cre2.LLILLL, null);
            if (messageMv2 == null) {
                ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious2 = listIterator2.previous();
                        Message messageLIZ4 = C321970Cjj.LIZ((C326880Cre) objPrevious2);
                        if (messageLIZ4 != null) {
                            str5 = messageLIZ4.replyUuid;
                        } else {
                            str5 = null;
                        }
                        if (Intrinsics.LJFF(str5, c326880Cre2.LLILLL.uuid)) {
                            break;
                        }
                    } else {
                        objPrevious2 = null;
                        break;
                    }
                }
                C326880Cre c326880Cre3 = (C326880Cre) objPrevious2;
                if (c326880Cre3 == null || (messageMv2 = c326880Cre3.LLILLL) == null) {
                    k9 k9Var = c326880Cre2.LL;
                    if (k9Var == null || (str4 = k9Var.LIZJ) == null) {
                        str4 = "";
                    }
                    messageMv2 = new Message(str4, null, null, null, null, null, false, null, 0L, 0L, null, 0, null, null, false, 0, false, null, null, 0L, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, 0, 0, null, null, false, false, 0, null, 0L, 0, 0, null, 0L, null, false, null, null, null, null, null, null, false, null, -2, 2097151, null);
                }
            }
        } else {
            messageMv2 = null;
        }
        String str7 = C1863280yaU.LJIILLIIL;
        C1870240yli.LIZ(new AwS405S0200000_4(c326880Cre2, messageMv2, 3), false);
        C1857530yRD c1857530yRD = c1861040yWs.LLIZLLLIL;
        C326880Cre c326880Cre4 = (C326880Cre) C13LP.LJJLIIIJL(arrayList);
        if (c326880Cre4 == null || (message = c326880Cre4.LLILLL) == null || (str2 = message.uuid) == null) {
            str2 = "";
        }
        if (c326880Cre2 != null && (messageLIZ2 = C321970Cjj.LIZ(c326880Cre2)) != null && (str3 = messageLIZ2.uuid) != null) {
            str6 = str3;
        }
        if (c326880Cre2 != null && (messageLIZ = C321970Cjj.LIZ(c326880Cre2)) != null) {
            numValueOf2 = Integer.valueOf(messageLIZ.LIZIZ);
        } else {
            numValueOf2 = null;
        }
        C1863380yae c1863380yae = this.LLJJJJ;
        if (c1863380yae != null) {
            lValueOf = Long.valueOf(c1863380yae.LJII);
        } else {
            lValueOf = null;
        }
        if (messageMv2 != null) {
            str = messageMv2.subConversationId;
        }
        return C1861040yWs.LIZ(c1861040yWs, null, false, false, null, null, false, false, new C1857530yRD(str2, str6, numValueOf2, messageMv2, lValueOf, str, c1857530yRD.LJI, c1857530yRD.LJII), null, false, 0L, false, null, null, null, null, null, null, false, null, false, null, 0L, null, null, null, null, null, 1073741695);
    }

    public final void XQ2(String str) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            setState(new AwS141S1100000_27(this, str, 0));
            return;
        }
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C315370CXv(this, str, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:19:0x003f, B:21:0x0043, B:26:0x0060), top: B:64:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a6 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ZQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel.ZQ2(X.05Vn):java.lang.Object");
    }

    public final void aR2(boolean z) {
        dR2(new TakoSug(true, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, 0L, null, null, 0L, null, false, false, null, null, 0, 0L, false, null, false, true, false, z, true, null, null, 2147483646, 25, null));
    }

    public final void dR2(TakoSug takoSug) {
        if (takoSug.LJIILIIL) {
            setState(new AwS393S0200000_27(takoSug, this, 52));
        } else {
            setState(new AwS393S0200000_27(takoSug, this, 11));
        }
    }

    public final void eR2(int i) {
        View viewSQ2;
        if (i > 0 && !this.LLJJI) {
            return;
        }
        if (!C07I8.LIZIZ ? RQ2() != null : !((viewSQ2 = SQ2()) == null || !viewSQ2.isAttachedToWindow())) {
            C0DQF.LIZ.LJIIJ(RQ2(), SQ2());
            return;
        }
        if (i >= this.LLJIJIL) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJJIII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJIII = C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C0CW5(this, i, null), 2);
    }

    public final void iR2(w2 w2Var) {
        List list;
        List<Message> list2;
        List<Message> list3;
        Integer numValueOf = null;
        if (w2Var == null || (list = w2Var.LIZIZ) == null) {
            list = C13BV.INSTANCE;
        }
        C1858360ySY.LIZ(list);
        if (w2Var != null) {
            list2 = w2Var.LIZIZ;
        } else {
            list2 = null;
        }
        if (list2 != null && !list2.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("phase1-local(messages=");
            if (w2Var != null && (list3 = w2Var.LIZIZ) != null) {
                numValueOf = Integer.valueOf(list3.size());
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
            UQ2();
        }
        this.LLJLLL = false;
        setState(new AwS393S0200000_27(w2Var, this, 16));
    }

    public final void jR2(w2 w2Var) {
        List list;
        Integer numValueOf;
        List<Message> list2;
        Boolean boolValueOf = null;
        if (w2Var == null || (list = w2Var.LIZIZ) == null) {
            list = C13BV.INSTANCE;
        }
        C1858360ySY.LIZ(list);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("phase2-remote(messages=");
        if (w2Var != null && (list2 = w2Var.LIZIZ) != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", hasMore=");
        if (w2Var != null) {
            boolValueOf = Boolean.valueOf(w2Var.LIZJ);
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        UQ2();
        this.LLJLLL = false;
        setState(new AwS393S0200000_27(w2Var, this, 18));
        if (w2Var != null && w2Var.LIZJ) {
            ((PowerPageSource) this.LLJZ.getValue()).getOperator().refresh();
        }
    }

    public final void kR2(C1863340yaa c1863340yaa) throws JSONException {
        String str;
        Long lValueOf;
        Integer numValueOf;
        TakoEnterParams takoEnterParams;
        if (c1863340yaa.LJ.LIZIZ && !c1863340yaa.LIZIZ.LIZJ) {
            for (Message message : c1863340yaa.LIZ) {
                if (message.sender.isSelf) {
                    C830490Whz c830490Whz = new C830490Whz();
                    c830490Whz.put("is_resend", CardStruct.IStatusCode.DEFAULT);
                    String str2 = c1863340yaa.LJFF.LIZJ;
                    if (str2 == null) {
                        str2 = "manual_input";
                    }
                    c830490Whz.put("interaction_type", str2);
                    TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
                    Map mapLIZ = null;
                    if (takoMixFeedLJIIIZ != null) {
                        str = takoMixFeedLJIIIZ.text;
                    } else {
                        str = null;
                    }
                    c830490Whz.put("message_content", str);
                    c830490Whz.put("message_id", message.uuid);
                    Map<String, String> map = c1863340yaa.LJFF.LIZIZ;
                    if (map != null && (!map.isEmpty())) {
                        c830490Whz.putAll(map);
                    }
                    Map<String, String> commonParams = c1863340yaa.LJFF.LIZ;
                    if (commonParams.isEmpty() && (takoEnterParams = this.LLILLL) != null) {
                        commonParams = takoEnterParams.getCommonParams();
                    }
                    C201996141y c201996141y = C201996141y.LIZ;
                    C1863380yae c1863380yae = this.LLJJJJ;
                    if (c1863380yae != null) {
                        lValueOf = Long.valueOf(c1863380yae.LJII);
                    } else {
                        lValueOf = null;
                    }
                    C1863380yae c1863380yae2 = this.LLJJJJ;
                    if (c1863380yae2 != null) {
                        numValueOf = Integer.valueOf(c1863380yae2.LJIIIIZZ);
                    } else {
                        numValueOf = null;
                    }
                    c201996141y.getClass();
                    String strLJ = C201996141y.LJ(numValueOf, lValueOf);
                    if (strLJ != null) {
                        c830490Whz.put("is_memory", strLJ);
                    }
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    Map mapLJIIL = C2097608Jq.LJIIL(commonParams, C2097908Jt.LIZJ(new Pair("mode", C1855920yOc.LIZIZ(message))));
                    TakoEnterParams takoEnterParams2 = this.LLILLL;
                    if (takoEnterParams2 != null) {
                        mapLIZ = C1862500yZE.LIZ(takoEnterParams2, false);
                    }
                    c1862330yYx.getClass();
                    C1862330yYx.LJLLI(mapLJIIL, c830490Whz, mapLIZ);
                }
            }
        }
    }

    public final void sI0(boolean z) {
        if (this.LLJJIJIIJIL) {
            return;
        }
        if (C1863680yb8.LIZLLL()) {
            this.LLJJI = true;
            this.LLJILLL = z;
            if (!this.LLJJIJI) {
                this.LLJJIJI = true;
                if (C1861560yXi.LIZ(C1863680yb8.LIZLLL())) {
                    eR2(0);
                } else {
                    ((C444801oE) this.LLILZIL.getValue()).LIZIZ(C1863680yb8.LIZ().sug.timeoutMs, new AwS571S0100000_27(this, 11), new AwS571S0100000_27(this, 12), AFwS216S0000000_27.get$arr$(22));
                }
            }
        }
        aR2(z);
    }

    public static boolean MQ2(Integer num, Long l) {
        if (l == null || l.longValue() != 1) {
            if (num == null || num.intValue() != 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void BQ2(w2 w2Var, Map<String, String> map) {
        String str;
        Map<String, String> map2;
        TakoClientExt takoClientExt;
        TakoClientExt takoClientExt2;
        String str2;
        Map<String, String> map3;
        TakoClientExt takoClientExt3;
        TakoClientExt takoClientExt4;
        List<Message> list = w2Var.LIZIZ;
        ArrayList<Message> arrayList = new ArrayList();
        for (Message message : list) {
            if (message.msgType == 3) {
                arrayList.add(message);
            }
        }
        for (Message message2 : arrayList) {
            if (message2.sender.isSelf) {
                for (InterfaceC1861530yXf interfaceC1861530yXf : this.LLJLLIL) {
                    TakoMixFeed takoMixFeedLJIIIZ = message2.LJIIIZ();
                    if (takoMixFeedLJIIIZ == null || (takoClientExt2 = takoMixFeedLJIIIZ.clientExt) == null || (str = takoClientExt2.carryLogId) == null) {
                        str = "";
                    }
                    TakoMixFeed takoMixFeedLJIIIZ2 = message2.LJIIIZ();
                    if (takoMixFeedLJIIIZ2 != null && (takoClientExt = takoMixFeedLJIIIZ2.clientExt) != null) {
                        map2 = takoClientExt.msgMobParams;
                    } else {
                        map2 = null;
                    }
                    interfaceC1861530yXf.LIZJ(message2, 0, str, map2);
                }
            } else {
                CQ2(message2);
                for (InterfaceC1861530yXf interfaceC1861530yXf2 : this.LLJLLIL) {
                    TakoMixFeed takoMixFeedLJIIIZ3 = message2.LJIIIZ();
                    if (takoMixFeedLJIIIZ3 != null && (takoClientExt4 = takoMixFeedLJIIIZ3.clientExt) != null) {
                        String str3 = takoClientExt4.carryLogId;
                    }
                    int iDQ2 = DQ2(message2);
                    if (map != null) {
                        str2 = map.get("list_result_type");
                    } else {
                        str2 = null;
                    }
                    TakoMixFeed takoMixFeedLJIIIZ4 = message2.LJIIIZ();
                    if (takoMixFeedLJIIIZ4 != null && (takoClientExt3 = takoMixFeedLJIIIZ4.clientExt) != null) {
                        map3 = takoClientExt3.msgMobParams;
                    } else {
                        map3 = null;
                    }
                    interfaceC1861530yXf2.LIZLLL(message2, 0, false, "", iDQ2, "", null, null, null, 0, 0, null, str2, null, map3);
                }
            }
        }
    }

    public final void HQ2(w2 w2Var, boolean z) {
        List<Message> list = w2Var.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Message> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().uuid);
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        List<Message> list2 = w2Var.LIZIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<Message> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().msgId);
        }
        setState(new AwS44S0310000_27(z, (boolean) setLLIIJI, (Set<String>) C13LP.LLIIJI(arrayList2), (Set<String>) this, (MessageViewModel) 3));
    }

    public final void IQ2(w2 w2Var, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn) {
        if (C320400ChC.LIZ[w2Var.LIZ.ordinal()] == 1) {
            String str = null;
            if (w2Var.LIZJ) {
                if (interfaceC1364105Vn != null) {
                    C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, Boolean.TRUE, null, null, 6);
                    C189200o6.m2constructorimpl(c323380Cm0LJ);
                    interfaceC1364105Vn.resumeWith(c323380Cm0LJ);
                }
            } else if (interfaceC1364105Vn != null) {
                C316640Cb8 c316640Cb8LIZIZ = C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
                C189200o6.m2constructorimpl(c316640Cb8LIZIZ);
                interfaceC1364105Vn.resumeWith(c316640Cb8LIZIZ);
            }
            C324800CoI.LIZ.getClass();
            if (C324800CoI.LIZ() && !(!w2Var.LIZIZ.isEmpty())) {
                if (!w2Var.LIZJ) {
                    C1863380yae c1863380yae = this.LLJJJJ;
                    if (c1863380yae != null) {
                        str = c1863380yae.LJIILIIL;
                    }
                    if (!PQ2(str)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            YQ2(w2Var.LIZIZ);
            setState(new AwS393S0200000_27(w2Var, this, 51));
        }
    }

    public final void fR2(TakoChatBotSharedViewModel takoChatBotSharedViewModel, boolean z) {
        if (C1863680yb8.LIZLLL() && !this.LLJJJIL) {
            this.LLJJJIL = true;
            C325080Cok c325080Cok = C325080Cok.LIZ;
            C0CW6 c0cw6 = new C0CW6(this, null);
            c325080Cok.LIZ();
            C325070Coj.LIZIZ = c0cw6;
        }
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFB c1dfb = C0PEM.LIZJ;
        this.LLJJJJLIIL = C23250099c.LIZLLL(viewModelScope, c1dfb, null, new C319580Cfs(this, null), 2);
        this.LLJJL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), c1dfb, null, new C315360CXu(this, null), 2);
        this.LLJJLIIIJLLLLLLLZ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), c1dfb, null, new C319660Cg0(this, takoChatBotSharedViewModel, null), 2);
        String str = C1863280yaU.LJIILLIIL;
        C1870240yli.LIZ(AFwS216S0000000_27.get$arr$(29), false);
        this.LLJL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), c1dfb, null, new C319610Cfv(this, null), 2);
        this.LLJLILLLLZIIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), c1dfb, null, new C319600Cfu(this, null), 2);
        this.LLJLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), c1dfb, null, new C319590Cft(this, null), 2);
        this.LLJLIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), c1dfb, null, new C316140CaK(z, this, null), 2);
    }

    public final void hR2(int i, long j) {
        List list;
        C1863420yai c1863420yai = C1863380yae.LJJII;
        w2 w2VarLJI = c1863420yai.LJI(Integer.valueOf(i), Long.valueOf(j), null);
        if (w2VarLJI == null || (list = w2VarLJI.LIZIZ) == null) {
            list = C13BV.INSTANCE;
        }
        C1858360ySY.LIZ(list);
        this.LLJLLL = false;
        setState(new C1861430yXV(this, c1863420yai.LJFF(Integer.valueOf(i), Long.valueOf(j)), w2VarLJI, j, i));
    }

    public final Message mv2(Message message, Function1<? super Message, Boolean> function1) {
        C1863380yae c1863380yae = this.LLJJJJ;
        Object obj = null;
        if (c1863380yae == null) {
            return null;
        }
        List<C1862400yZ4> listLJIIIIZZ = c1863380yae.LJIILL.LJI.LIZ().LJIIIIZZ(message.uuid);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIIIZZ, 10));
        Iterator<C1862400yZ4> it2 = listLJIIIIZZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1862370yZ1.LIZIZ(it2.next()));
        }
        for (Object obj2 : arrayList) {
            if (function1 == null || function1.invoke(obj2).booleanValue()) {
                obj = obj2;
                break;
            }
        }
        return (Message) obj;
    }

    public static void cR2(MessageViewModel messageViewModel, List list, String str) {
        String string = UUID.randomUUID().toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        messageViewModel.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C0CWA(messageViewModel, null, list, str, string, false, linkedHashMap, "", null), 2);
    }

    public final void TQ2(String str, String str2, String str3) {
        TakoEnterParams takoEnterParams;
        if (!C07I5.LIZ() && (takoEnterParams = this.LLILLL) != null && !C20227614Cs.LIZ(takoEnterParams.botInfo)) {
            new Object() { // from class: X.0yYI
            }.getClass();
            C1860520yW2.LIZ.getClass();
            TakoActiveActionItem takoActiveActionItemLIZ = C1860520yW2.LIZ();
            if (takoActiveActionItemLIZ.id > 0) {
                C1860520yW2.LJIJJ(new TakoActiveActionItem("", 0L, "", "", "", "", "", "", ""));
                Uj0(C1861630yXp.LIZ(new AwS609S0100000_30(takoActiveActionItemLIZ, 167)));
            }
        }
        C1860850yWZ.LIZ.clear();
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C320410ChD(this, str, str2, str3, null), 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05c5 A[PHI: r8
      0x05c5: PHI (r8v13 java.lang.String) = (r8v12 java.lang.String), (r8v19 java.lang.String) binds: [B:285:0x0587, B:293:0x059b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x08ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lR2(java.util.List<? extends X.InterfaceC1858000yRy> r22, X.EnumC1861450yXX r23, X.C1861520yXe r24) {
        /*
            Method dump skipped, instruction units count: 2620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel.lR2(java.util.List, X.0yXX, X.0yXe):void");
    }

    public static void nR2(MessageViewModel messageViewModel, Message message, boolean z, int i) {
        p2.b bVar;
        if ((i & 4) != 0) {
            z = false;
        }
        if (message == null) {
            messageViewModel.getClass();
            return;
        }
        C1863380yae c1863380yae = messageViewModel.LLJJJJ;
        if (c1863380yae == null) {
            return;
        }
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        if (z) {
            bVar = p2.b.IMMEDIATE;
        } else {
            bVar = p2.b.QUEUE;
        }
        C321910Cjd.LIZ(bVar, AFwS232S0000000_4.get$arr$(267), new C1860690yWJ(c1863380yae, message, false, null));
    }

    public final void Tk2(String str, Function1 function1, boolean z, boolean z2) {
        if (C1863680yb8.LIZLLL() && z) {
            this.LLJILJILJ = true;
            this.LLJILLL = z2;
            this.LLJJ = str;
            sI0(z2);
            if (C1861560yXi.LIZ(C1863680yb8.LIZLLL())) {
                return;
            }
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C324740CoC(this, str, z, z2, function1, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zQ2(java.lang.String r23, com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo r24, com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage r25, com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo r26, int r27, int r28, java.lang.Integer r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo r33, java.lang.String r34, int r35) {
        /*
            r22 = this;
            r13 = r26
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.LIZ
            r2 = 0
            if (r1 == 0) goto L77
            java.lang.String r0 = "aigc_std_ratio"
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L77
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L6c
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
        L1d:
            if (r14 == 0) goto L77
            int r0 = r14.intValue()
            if (r0 <= 0) goto L77
        L25:
            r10 = r22
            X.01wk r4 = androidx.lifecycle.ViewModelKt.getViewModelScope(r10)
            X.01GW r0 = X.C0AX1.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L67
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r3 = r0.LLIILII()
        L41:
            X.0yPb r5 = new X.0yPb
            r2 = 0
            r1 = r5
            r6 = r35
            r20 = r34
            r9 = r33
            r16 = r32
            r19 = r31
            r18 = r30
            r15 = r29
            r8 = r28
            r7 = r27
            r11 = r25
            r12 = r24
            r17 = r23
            r21 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = 2
            X.C23250099c.LIZLLL(r4, r3, r2, r1, r0)
            return
        L67:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            goto L41
        L6c:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L77
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r14 = X.C2095008Iq.LJIIJJI(r1)
            goto L1d
        L77:
            r14 = r2
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel.zQ2(java.lang.String, com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo, com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage, com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo, int, int, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo, java.lang.String, int):void");
    }

    public final void vQ2(String str, boolean z, String str2, EnumC1858090yS7 enumC1858090yS7, Map<String, String> map, TakoActiveActionItem takoActiveActionItem, TakoActiveBotItem takoActiveBotItem, String str3, int i, Integer num, int i2, int i3, ExtraRequestInfo extraRequestInfo, TakoReferenceAskInfo takoReferenceAskInfo, TakoEditAskInfo takoEditAskInfo) {
        AbstractC2238408pq abstractC2238408pqLLIILII;
        if (str == null) {
            return;
        }
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        if (((Boolean) C0AX1.LIZ.getValue()).booleanValue()) {
            C1DFH c1dfh = C0PEM.LIZ;
            abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
        } else {
            C1DFH c1dfh2 = C0PEM.LIZ;
            abstractC2238408pqLLIILII = C2107308Nj.LIZ;
        }
        C23250099c.LIZLLL(viewModelScope, abstractC2238408pqLLIILII, null, new C1860570yW7(str, enumC1858090yS7, this, map, z, str2, takoActiveActionItem, takoActiveBotItem, str3, i, num, i2, i3, extraRequestInfo, takoReferenceAskInfo, takoEditAskInfo, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(java.lang.String r26, java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage> r27, java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem> r28, boolean r29, java.lang.String r30, X.EnumC1858090yS7 r31, int r32, java.lang.Integer r33, int r34, java.lang.String r35, java.lang.String r36, kotlin.jvm.functions.Function1<? super java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage>, kotlin.Unit> r37, boolean r38, com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo r39, java.util.Map<java.lang.String, java.lang.String> r40, com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo r41, com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo r42) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel.xQ2(java.lang.String, java.util.List, java.util.List, boolean, java.lang.String, X.0yS7, int, java.lang.Integer, int, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, boolean, com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo, java.util.Map, com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo, com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo):void");
    }
}
