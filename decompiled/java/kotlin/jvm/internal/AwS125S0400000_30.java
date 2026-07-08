package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C112R;
import X.C13BV;
import X.C20037913aj;
import X.C20043513bd;
import X.C20043913bh;
import X.C20044113bj;
import X.C20083813i8;
import X.C20131713pr;
import X.C20134113qF;
import X.C20145013s0;
import X.C20243414Iu;
import X.C20308814dK;
import X.C2218451BsB;
import X.C817403Hg;
import X.C837830Wtp;
import X.C838040WuA;
import X.InterfaceC20044013bi;
import X.InterfaceC20145213s2;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoDisclaimerDialogProcessor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class AwS125S0400000_30 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS125S0400000_30 awS125S0400000_30, Object obj) {
        C20044113bj c20044113bj = (C20044113bj) awS125S0400000_30.l0;
        c20044113bj.LIZLLL = new C20043913bh((C20043513bd) awS125S0400000_30.l1, (C20037913aj) awS125S0400000_30.l2, (InterfaceC20044013bi) awS125S0400000_30.l3);
        return new C20308814dK(c20044113bj, 2);
    }

    public static final Object invoke$1(AwS125S0400000_30 awS125S0400000_30, Object obj) {
        C20243414Iu c20243414Iu = (C20243414Iu) obj;
        TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor = (TakoDisclaimerDialogProcessor) awS125S0400000_30.l0;
        c20243414Iu.LIZ = new AwS304S0300000_27((IMessageAbility) awS125S0400000_30.l2, (TakoEnterParams) awS125S0400000_30.l1, takoDisclaimerDialogProcessor, 5);
        c20243414Iu.LIZLLL = new AwS274S0300000_30((Context) awS125S0400000_30.l3, (TakoEnterParams) awS125S0400000_30.l1, (TakoDisclaimerDialogProcessor) awS125S0400000_30.l0, 4);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS125S0400000_30 awS125S0400000_30, Object obj) {
        C20243414Iu c20243414Iu = (C20243414Iu) obj;
        TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor = (TakoDisclaimerDialogProcessor) awS125S0400000_30.l0;
        c20243414Iu.LIZ = new AwS304S0300000_27((IMessageAbility) awS125S0400000_30.l2, (TakoEnterParams) awS125S0400000_30.l1, takoDisclaimerDialogProcessor, 6);
        c20243414Iu.LIZLLL = new AwS274S0300000_30((Context) awS125S0400000_30.l3, (TakoEnterParams) awS125S0400000_30.l1, (TakoDisclaimerDialogProcessor) awS125S0400000_30.l0, 5);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS125S0400000_30 awS125S0400000_30, Object obj) {
        C20243414Iu c20243414Iu = (C20243414Iu) obj;
        TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor = (TakoDisclaimerDialogProcessor) awS125S0400000_30.l0;
        c20243414Iu.LIZ = new AwS304S0300000_27((IMessageAbility) awS125S0400000_30.l2, (TakoEnterParams) awS125S0400000_30.l1, takoDisclaimerDialogProcessor, 7);
        c20243414Iu.LIZJ = new AwS304S0300000_27((IMessageAbility) awS125S0400000_30.l2, (TakoEnterParams) awS125S0400000_30.l1, (TakoDisclaimerDialogProcessor) awS125S0400000_30.l0, 8);
        c20243414Iu.LIZLLL = new AwS274S0300000_30((Context) awS125S0400000_30.l3, (TakoEnterParams) awS125S0400000_30.l1, (TakoDisclaimerDialogProcessor) awS125S0400000_30.l0, 6);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS125S0400000_30 awS125S0400000_30, Object obj) {
        ((C013C) awS125S0400000_30.l0).element = true;
        ((C20134113qF) awS125S0400000_30.l1).LIZ((C20131713pr) awS125S0400000_30.l2, (Bundle) awS125S0400000_30.l3, (NavBackStackEntry) obj, C13BV.INSTANCE);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS125S0400000_30 r3, java.lang.Object r4) {
        /*
            X.0tlN r4 = (X.C1677830tlN) r4
            java.lang.Object r0 = r4.LIZIZ()
            java.lang.Number r0 = (java.lang.Number) r0
            float r2 = r0.floatValue()
            java.lang.Object r0 = r3.l0
            X.03Hg r0 = (X.C817403Hg) r0
            float r0 = r0.element
            float r2 = r2 - r0
            boolean r0 = X.C20080813he.LIZ(r2)
            if (r0 != 0) goto L3c
            java.lang.Object r1 = r3.l1
            X.13i8 r1 = (X.C20083813i8) r1
            java.lang.Object r0 = r3.l2
            X.112R r0 = (X.C112R) r0
            float r0 = X.C20083813i8.LIZ(r1, r0, r2)
            float r0 = r2 - r0
            boolean r0 = X.C20080813he.LIZ(r0)
            if (r0 != 0) goto L33
            r4.LIZ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            java.lang.Object r1 = r3.l0
            X.03Hg r1 = (X.C817403Hg) r1
            float r0 = r1.element
            float r0 = r0 + r2
            r1.element = r0
        L3c:
            java.lang.Object r1 = r3.l3
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r0 = r3.l0
            X.03Hg r0 = (X.C817403Hg) r0
            float r0 = r0.element
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L30
            r4.LIZ()
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS125S0400000_30.invoke$5(kotlin.jvm.internal.AwS125S0400000_30, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS125S0400000_30 awS125S0400000_30, Object obj) {
        JSONObject jSONObjectLIZIZ;
        C838040WuA c838040WuA = (C838040WuA) obj;
        C20145013s0 c20145013s0 = new C20145013s0((ContentResolver) awS125S0400000_30.l0, (Uri) awS125S0400000_30.l1, (Cert) awS125S0400000_30.l2);
        InterfaceC20145213s2 interfaceC20145213s2 = (InterfaceC20145213s2) awS125S0400000_30.l3;
        if (c838040WuA != null) {
            jSONObjectLIZIZ = C837830Wtp.LIZIZ(c838040WuA);
        } else {
            jSONObjectLIZIZ = null;
        }
        Object objLIZ = interfaceC20145213s2.LIZ(c20145013s0, jSONObjectLIZIZ);
        c20145013s0.LIZLLL = false;
        return objLIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0400000_30(C013C c013c, C20134113qF c20134113qF, C20131713pr c20131713pr, Bundle bundle, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = c20134113qF;
        this.l2 = c20131713pr;
        this.l3 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0400000_30(C817403Hg c817403Hg, C20083813i8 c20083813i8, C112R c112r, AwS63S0500000_30 awS63S0500000_30, int i) {
        super(1);
        this.$t = i;
        this.l0 = c817403Hg;
        this.l1 = c20083813i8;
        this.l2 = c112r;
        this.l3 = awS63S0500000_30;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0400000_30(C20044113bj c20044113bj, C20043513bd c20043513bd, C20037913aj c20037913aj, InterfaceC20044013bi interfaceC20044013bi, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20044113bj;
        this.l1 = c20043513bd;
        this.l2 = c20037913aj;
        this.l3 = interfaceC20044013bi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0400000_30(TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor, TakoEnterParams takoEnterParams, IMessageAbility iMessageAbility, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = takoDisclaimerDialogProcessor;
        this.l1 = takoEnterParams;
        this.l2 = iMessageAbility;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0400000_30(ContentResolver contentResolver, Uri uri, String str, Cert cert, C2218451BsB c2218451BsB, int i) {
        super(1);
        this.$t = i;
        this.l0 = contentResolver;
        this.l1 = uri;
        this.l2 = cert;
        this.l3 = c2218451BsB;
    }
}
