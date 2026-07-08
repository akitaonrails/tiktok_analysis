package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.C03H5;
import X.C04QQ;
import X.C05P0;
import X.C05S7;
import X.C09AY;
import X.C0I0B;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1677280tkU;
import X.C1677480tko;
import X.C2017707vL;
import X.C23250099c;
import X.C491001vg;
import X.C830490Whz;
import X.C869590Y9l;
import X.InterfaceC1493505sz;
import X.InterfaceC1860040yVG;
import X.InterfaceC497601wk;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class AwS66S0500000_2 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS66S0500000_2 awS66S0500000_2) {
        Function2 function2;
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) awS66S0500000_2.l0;
        if (abstractC1623806Xk instanceof C1623706Xj) {
            Function1 function1 = (Function1) awS66S0500000_2.l1;
            if (function1 != null) {
                function1.invoke((C03H5) awS66S0500000_2.l4);
            }
        } else if (abstractC1623806Xk instanceof C491001vg) {
            Function2 function22 = (Function2) awS66S0500000_2.l2;
            if (function22 != null) {
                function22.invoke((C03H5) awS66S0500000_2.l4, ((C491001vg) abstractC1623806Xk).LIZ);
            }
        } else if ((abstractC1623806Xk instanceof C1623606Xi) && (function2 = (Function2) awS66S0500000_2.l3) != null) {
            function2.invoke((C03H5) awS66S0500000_2.l4, ((C1623606Xi) abstractC1623806Xk).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS66S0500000_2 awS66S0500000_2) {
        String strLJIIIIZZ;
        String string;
        C869590Y9l c869590Y9l = (C869590Y9l) awS66S0500000_2.l0;
        IIMMessageAnalytics iIMMessageAnalytics = (IIMMessageAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageAnalytics.class);
        if (iIMMessageAnalytics != null) {
            strLJIIIIZZ = iIMMessageAnalytics.LJIIIIZZ((C869590Y9l) awS66S0500000_2.l0);
        } else {
            strLJIIIIZZ = null;
        }
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("conversation_id", c869590Y9l.getConversationId());
        c830490Whz.put("chat_type", strLJIIIIZZ);
        String uuid = c869590Y9l.getUuid();
        uuid.toString();
        c830490Whz.put("message_id", uuid);
        interfaceC1493505szLIZIZ.sendEvent("ttsocial_dm_text_copy_btn_click", c830490Whz);
        Context context = ((InterfaceC1860040yVG) awS66S0500000_2.l1).LJJZZI().getContext();
        CharSequence charSequence = (CharSequence) ((Function0) awS66S0500000_2.l2).invoke();
        if (charSequence.length() == 0) {
            string = "";
        } else {
            C04QQ.LIZIZ.LIZ(context, charSequence.toString());
            string = charSequence.toString();
        }
        Function1 function1 = (Function1) awS66S0500000_2.l3;
        if (function1 != null) {
            function1.invoke(string);
        }
        Function0 function0 = (Function0) awS66S0500000_2.l4;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS66S0500000_2 awS66S0500000_2) {
        String str = null;
        C23250099c.LIZLLL((InterfaceC497601wk) awS66S0500000_2.l0, null, null, new C05S7((C1677480tko) awS66S0500000_2.l3, null), 3);
        Function2<Context, String, Unit> function2 = ((C2017707vL) awS66S0500000_2.l1).LLILZLL;
        Context context = (Context) awS66S0500000_2.l2;
        if (((Boolean) ((C05P0) awS66S0500000_2.l4).getValue()).booleanValue()) {
            str = "is_guide";
        }
        function2.invoke(context, str);
        ((C05P0) awS66S0500000_2.l4).setValue(Boolean.FALSE);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS66S0500000_2(InterfaceC497601wk interfaceC497601wk, InterfaceC497601wk interfaceC497601wk2, C2017707vL c2017707vL, Context context, C1677480tko<Float, C1677280tkU> c1677480tko, C05P0<Boolean> c05p0) {
        super(0);
        this.$t = c05p0;
        this.l0 = interfaceC497601wk;
        this.l1 = interfaceC497601wk2;
        this.l2 = c2017707vL;
        this.l3 = context;
        this.l4 = c1677480tko;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS66S0500000_2(AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk<Object> abstractC1623806Xk2, Function1<C03H5, Unit> function1, Function2<C03H5, ? super Throwable, Unit> function2, Function2<C03H5, Object, Unit> function22, C03H5 c03h5) {
        super(0);
        this.$t = c03h5;
        this.l0 = abstractC1623806Xk;
        this.l1 = abstractC1623806Xk2;
        this.l2 = function1;
        this.l3 = function2;
        this.l4 = function22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS66S0500000_2(C869590Y9l c869590Y9l, C869590Y9l c869590Y9l2, InterfaceC1860040yVG interfaceC1860040yVG, Function0<? extends CharSequence> function0, Function1<? super String, Unit> function1, Function0<Unit> function02) {
        super(0);
        this.$t = function02;
        this.l0 = c869590Y9l;
        this.l1 = c869590Y9l2;
        this.l2 = interfaceC1860040yVG;
        this.l3 = function0;
        this.l4 = function1;
    }
}
