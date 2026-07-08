package kotlin.jvm.internal;

import X.C09AY;
import X.C118300cf;
import X.C13LP;
import X.C14FD;
import X.C1785090wYN;
import X.C1785140wYS;
import X.C1862430yZ7;
import X.C1862660yZU;
import X.C1863280yaU;
import X.C1863850ybP;
import X.C1870240yli;
import X.C259800zU;
import X.InterfaceC1685420txc;
import X.InterfaceC1785150wYT;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ServerProcessInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoDisclaimerDialogProcessor;
import defpackage.k9;
import defpackage.r2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS4S0700000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS4S0700000_27 awS4S0700000_27, Object obj) {
        String str;
        TakoMixFeed takoMixFeedLJIIIZ;
        TakoPassExt takoPassExt;
        InterfaceC1685420txc<? super Long, ? super ServerProcessInfo, ? super C1785090wYN, ? super String, ? super String, Unit> interfaceC1685420txc = C1862430yZ7.LJ;
        if (interfaceC1685420txc != null) {
            Long lValueOf = Long.valueOf(((MessageChunkResult) awS4S0700000_27.l0).streamTime);
            ServerProcessInfo serverProcessInfo = ((MessageChunkResult) awS4S0700000_27.l0).serverProcessInfo;
            Message message = (Message) ((C259800zU) awS4S0700000_27.l1).element;
            String str2 = null;
            if (message != null && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null && (takoPassExt = takoMixFeedLJIIIZ.ext) != null) {
                str = takoPassExt.userIntent;
            } else {
                str = null;
            }
            Message message2 = (Message) ((C259800zU) awS4S0700000_27.l1).element;
            if (message2 != null) {
                str2 = message2.uuid;
            }
            interfaceC1685420txc.invoke(lValueOf, serverProcessInfo, obj, str, str2);
        }
        String str3 = C1863280yaU.LJIILLIIL;
        C1870240yli.LIZ(AFwS216S0000000_27.get$arr$(168), false);
        Message message3 = (Message) ((C259800zU) awS4S0700000_27.l1).element;
        if (message3 != null) {
            C1863280yaU c1863280yaU = (C1863280yaU) awS4S0700000_27.l2;
            C118300cf c118300cf = (C118300cf) awS4S0700000_27.l4;
            C118300cf c118300cf2 = (C118300cf) awS4S0700000_27.l5;
            MessageChunkResult messageChunkResult = (MessageChunkResult) awS4S0700000_27.l0;
            r2 r2Var = (r2) awS4S0700000_27.l3;
            k9 k9Var = (k9) awS4S0700000_27.l6;
            message3.LIZIZ = 6;
            c1863280yaU.LJIJI(message3, false);
            C1785140wYS.LJI(0, message3.uuid);
            C1785140wYS.LJI(1, message3.uuid);
            C1863280yaU.LJJJJI(c1863280yaU, message3, r2Var, Math.max(c118300cf.element, c118300cf2.element), null, k9Var, messageChunkResult.extra, null, 72);
            String str4 = message3.uuid;
            if (str4 != null && str4.length() != 0) {
                List<InterfaceC1785150wYT> list = C1785140wYS.LIZIZ;
                if (!((ArrayList) list).isEmpty()) {
                    Iterator it2 = C13LP.LLIIII(list).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1785150wYT) it2.next()).LIZ(str4);
                    }
                }
            }
        }
        C1863280yaU c1863280yaU2 = (C1863280yaU) awS4S0700000_27.l2;
        c1863280yaU2.LJIIL(c1863280yaU2.LIZLLL(((r2) awS4S0700000_27.l3).LJIILLIIL, false, 4, new LinkedHashMap()));
        String str5 = C1863280yaU.LJIILLIIL;
        C1870240yli.LIZ(AFwS216S0000000_27.get$arr$(169), false);
        ((C1863280yaU) awS4S0700000_27.l2).LJJIJL((r2) awS4S0700000_27.l3, false);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144 A[PHI: r8
      0x0144: PHI (r8v1 long) = (r8v0 long), (r8v3 long) binds: [B:44:0x013c, B:46:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS4S0700000_27 r33, java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS4S0700000_27.invoke$1(kotlin.jvm.internal.AwS4S0700000_27, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS4S0700000_27 r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS4S0700000_27.invoke$2(kotlin.jvm.internal.AwS4S0700000_27, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S0700000_27(MessageChunkResult messageChunkResult, MessageChunkResult messageChunkResult2, C259800zU<Message> c259800zU, C1863280yaU c1863280yaU, r2 r2Var, C118300cf c118300cf, C118300cf c118300cf2, k9 k9Var) {
        super(1);
        this.$t = k9Var;
        this.l0 = messageChunkResult;
        this.l1 = messageChunkResult2;
        this.l2 = c259800zU;
        this.l3 = c1863280yaU;
        this.l4 = r2Var;
        this.l5 = c118300cf;
        this.l6 = c118300cf2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0700000_27(TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor, Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd, C1863850ybP c1863850ybP, int i) {
        super(1);
        this.$t = i;
        this.l0 = takoDisclaimerDialogProcessor;
        this.l1 = fragment;
        this.l2 = takoEnterParams;
        this.l3 = c1862660yZU;
        this.l4 = iMessageAbility;
        this.l5 = c14fd;
        this.l6 = c1863850ybP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S0700000_27(r2 r2Var, r2 r2Var2, C259800zU<Message> c259800zU, C259800zU<Message> c259800zU2, C1863280yaU c1863280yaU, MessageChunkResult messageChunkResult, C118300cf c118300cf, k9 k9Var) {
        super(1);
        this.$t = k9Var;
        this.l0 = r2Var;
        this.l1 = r2Var2;
        this.l2 = c259800zU;
        this.l3 = c259800zU2;
        this.l4 = c1863280yaU;
        this.l5 = messageChunkResult;
        this.l6 = c118300cf;
    }
}
