package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C118300cf;
import X.C13BV;
import X.C14FD;
import X.C1862660yZU;
import X.C1862710yZZ;
import X.C19EG;
import X.C20074813gg;
import X.C20080813he;
import X.C20082713hx;
import X.C20083813i8;
import X.C20134113qF;
import X.C20232514Ep;
import X.C20232714Er;
import X.C259800zU;
import X.C817403Hg;
import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.CsiBotData;
import com.ss.android.ugc.aweme.tako.startup.processor.aibot.AIBotDisclaimerDialogProcessor;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS63S0500000_30 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS63S0500000_30 awS63S0500000_30, Object obj) {
        List<NavBackStackEntry> listSubList;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        ((C013C) awS63S0500000_30.l0).element = true;
        int iIndexOf = ((List) awS63S0500000_30.l1).indexOf(navBackStackEntry);
        if (iIndexOf != -1) {
            int i = iIndexOf + 1;
            listSubList = ((List) awS63S0500000_30.l1).subList(((C118300cf) awS63S0500000_30.l2).element, i);
            ((C118300cf) awS63S0500000_30.l2).element = i;
        } else {
            listSubList = C13BV.INSTANCE;
        }
        ((C20134113qF) awS63S0500000_30.l3).LIZ(navBackStackEntry.LLILLJJLI, (Bundle) awS63S0500000_30.l4, navBackStackEntry, listSubList);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, X.13gg] */
    public static final Object invoke$1(AwS63S0500000_30 awS63S0500000_30, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C20074813gg c20074813ggLIZLLL = C20083813i8.LIZLLL(((C20083813i8) awS63S0500000_30.l0).LJ);
        boolean z = true;
        if (c20074813ggLIZLLL != null) {
            ((C20083813i8) awS63S0500000_30.l0).LJ(c20074813ggLIZLLL);
            C259800zU c259800zU = (C259800zU) awS63S0500000_30.l1;
            c259800zU.element = ((C20074813gg) c259800zU.element).LIZ(c20074813ggLIZLLL);
            C817403Hg c817403Hg = (C817403Hg) awS63S0500000_30.l2;
            C20082713hx c20082713hx = (C20082713hx) awS63S0500000_30.l3;
            c817403Hg.element = c20082713hx.LJI(c20082713hx.LJ(((C20074813gg) ((C259800zU) awS63S0500000_30.l1).element).LIZ));
            ((C013C) awS63S0500000_30.l4).element = !C20080813he.LIZ(((C817403Hg) awS63S0500000_30.l2).element - fFloatValue);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS63S0500000_30 awS63S0500000_30, Object obj) {
        C20232514Ep c20232514Ep = (C20232514Ep) obj;
        c20232514Ep.LIZ = new AwS155S0400000_27((AIBotDisclaimerDialogProcessor) awS63S0500000_30.l0, (TakoEnterParams) awS63S0500000_30.l1, (C1862660yZU) awS63S0500000_30.l2, (C14FD) awS63S0500000_30.l3, 8);
        c20232514Ep.LIZIZ = new AwS431S0200000_30((C19EG) awS63S0500000_30.l4, (TakoEnterParams) awS63S0500000_30.l1, 42);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS63S0500000_30 awS63S0500000_30, Object obj) {
        String str;
        C20232714Er c20232714Er = (C20232714Er) obj;
        AIBotDisclaimerDialogProcessor aIBotDisclaimerDialogProcessor = (AIBotDisclaimerDialogProcessor) awS63S0500000_30.l1;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS63S0500000_30.l0;
        C1862660yZU c1862660yZU = (C1862660yZU) awS63S0500000_30.l2;
        c20232714Er.LIZ = new AwS63S0500000_30((C19EG) awS63S0500000_30.l4, takoEnterParams, (C14FD) awS63S0500000_30.l3, c1862660yZU, aIBotDisclaimerDialogProcessor, 2);
        c20232714Er.LIZIZ = new AwS393S0200000_27((AIBotDisclaimerDialogProcessor) awS63S0500000_30.l1, (TakoEnterParams) awS63S0500000_30.l0, 114);
        c20232714Er.LIZJ = C1862710yZZ.LIZ(((TakoEnterParams) awS63S0500000_30.l0).botInfo);
        CsiBotData csiBotData = ((TakoEnterParams) awS63S0500000_30.l0).csiBotData;
        if (csiBotData != null) {
            str = csiBotData.aboutSchema;
        } else {
            str = null;
        }
        c20232714Er.LIZLLL = str;
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS63S0500000_30(X.C19EG r3, com.ss.android.ugc.aweme.tako.model.TakoEnterParams r4, X.C14FD r5, X.C1862660yZU r6, com.ss.android.ugc.aweme.tako.startup.processor.aibot.AIBotDisclaimerDialogProcessor r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            int r8 = 2 - r8
            if (r8 == 0) goto L16
            r1 = r2
            r1.l0 = r4
            r1.l1 = r7
            r1.l2 = r6
            r1.l3 = r5
            r1.l4 = r3
            r0 = 1
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l0 = r7
            r1.l1 = r4
            r1.l2 = r6
            r1.l3 = r5
            r1.l4 = r3
            r0 = 1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS63S0500000_30.<init>(X.19EG, com.ss.android.ugc.aweme.tako.model.TakoEnterParams, X.14FD, X.0yZU, com.ss.android.ugc.aweme.tako.startup.processor.aibot.AIBotDisclaimerDialogProcessor, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS63S0500000_30(C013C c013c, C013C c013c2, List<NavBackStackEntry> list, C118300cf c118300cf, C20134113qF c20134113qF, Bundle bundle) {
        super(1);
        this.$t = bundle;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = list;
        this.l3 = c118300cf;
        this.l4 = c20134113qF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS63S0500000_30(C20083813i8 c20083813i8, C20083813i8 c20083813i82, C259800zU<C20074813gg> c259800zU, C817403Hg c817403Hg, C20082713hx c20082713hx, C013C c013c) {
        super(1);
        this.$t = c013c;
        this.l0 = c20083813i8;
        this.l1 = c20083813i82;
        this.l2 = c259800zU;
        this.l3 = c817403Hg;
        this.l4 = c20082713hx;
    }
}
