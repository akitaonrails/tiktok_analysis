package kotlin.jvm.internal;

import X.C05AK;
import X.C05P0;
import X.C05P1;
import X.C05QY;
import X.C05UN;
import X.C06R2;
import X.C06R4;
import X.C06R6;
import X.C099G;
import X.C09AE;
import X.C09AY;
import X.C0PEM;
import X.C13FE;
import X.C1530280pvO;
import X.C21289618Te;
import X.C23250099c;
import X.C786410Ut5;
import X.C869590Y9l;
import X.EnumC1665006fY;
import X.InterfaceC497601wk;
import Y.ARunnableS102S0100000_2;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultGifClickHandler;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS131S0400000_2 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS131S0400000_2 awS131S0400000_2) {
        if (((C869590Y9l) awS131S0400000_2.l0) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(((DefaultGifClickHandler) awS131S0400000_2.l1).LLILLJJLI), C0PEM.LIZ, null, new C05QY((View) awS131S0400000_2.l3, (C869590Y9l) awS131S0400000_2.l0, (GifContent) awS131S0400000_2.l2, (DefaultGifClickHandler) awS131S0400000_2.l1, null), 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS131S0400000_2 awS131S0400000_2) {
        C09AE c09ae = (C09AE) ((C05P0) awS131S0400000_2.l1).getValue();
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        ((C05P0) awS131S0400000_2.l1).setValue(C23250099c.LIZLLL((InterfaceC497601wk) awS131S0400000_2.l0, null, null, new C05AK((C05P0) awS131S0400000_2.l2, (C05P0) awS131S0400000_2.l3, null), 3));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS131S0400000_2 awS131S0400000_2) {
        C05UN c05un = (C05UN) awS131S0400000_2.l0;
        float fFloatValue = ((Number) ((C05P1) awS131S0400000_2.l1).getValue()).floatValue();
        ((C13FE) c05un.LJIILLIIL).setValue(Float.valueOf(fFloatValue));
        C05UN c05un2 = (C05UN) awS131S0400000_2.l0;
        float fFloatValue2 = ((Number) ((C05P1) awS131S0400000_2.l2).getValue()).floatValue();
        ((C13FE) c05un2.LJIILL).setValue(Float.valueOf(fFloatValue2));
        C05UN c05un3 = (C05UN) awS131S0400000_2.l0;
        float fFloatValue3 = ((Number) ((C05P1) awS131S0400000_2.l3).getValue()).floatValue();
        ((C13FE) c05un3.LJIIZILJ).setValue(Float.valueOf(fFloatValue3));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS131S0400000_2 awS131S0400000_2) {
        Context context = (Context) awS131S0400000_2.l0;
        C1530280pvO.LIZ(context, new AwS101S0400000_2(context, (Context) awS131S0400000_2.l1, (FragmentManager) awS131S0400000_2.l2, (Pair<String, ? extends EnumC1665006fY>) awS131S0400000_2.l3, (InboxFragmentV2) 9), true);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS131S0400000_2 awS131S0400000_2) {
        ((Function2) awS131S0400000_2.l0).invoke(a0.LJLILLLLZI((String) ((C05P0) awS131S0400000_2.l2).getValue()).toString(), Boolean.valueOf(((Boolean) ((C05P0) awS131S0400000_2.l3).getValue()).booleanValue()));
        ((Function0) awS131S0400000_2.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS131S0400000_2 awS131S0400000_2) {
        Object obj = awS131S0400000_2.l0;
        ((List) awS131S0400000_2.l3).add(new Pair(obj, ((Function1) awS131S0400000_2.l2).invoke(obj)));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS131S0400000_2 awS131S0400000_2) {
        C21289618Te c21289618Te = (C21289618Te) awS131S0400000_2.l0;
        C099G c099gLIZIZ = C23250099c.LIZIZ(c21289618Te.LJ, C0PEM.LIZJ, null, new C06R2((C869590Y9l) awS131S0400000_2.l1, (C06R4) awS131S0400000_2.l2, c21289618Te, null), 2);
        c099gLIZIZ.LJII(new AwS368S0200000_2((C21289618Te) awS131S0400000_2.l0, (C06R6) awS131S0400000_2.l3, 136));
        return c099gLIZIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS131S0400000_2 awS131S0400000_2) {
        C05P0 c05p0 = (C05P0) awS131S0400000_2.l2;
        Boolean bool = Boolean.FALSE;
        c05p0.setValue(bool);
        C786410Ut5.LJLIIL(150L, (Handler) awS131S0400000_2.l0, new ARunnableS102S0100000_2((C05P0) awS131S0400000_2.l3, 90));
        ((Function1) awS131S0400000_2.l1).invoke(bool);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS131S0400000_2(InterfaceC497601wk interfaceC497601wk, InterfaceC497601wk interfaceC497601wk2, C05P0<C09AE> c05p0, C05P0<Boolean> c05p02, C05P0<Boolean> c05p03) {
        super(0);
        this.$t = c05p03;
        this.l0 = interfaceC497601wk;
        this.l1 = interfaceC497601wk2;
        this.l2 = c05p0;
        this.l3 = c05p02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS131S0400000_2(C05UN c05un, C05UN c05un2, C05P1<Float> c05p1, C05P1<Float> c05p12, C05P1<Float> c05p13) {
        super(0);
        this.$t = c05p13;
        this.l0 = c05un;
        this.l1 = c05un2;
        this.l2 = c05p1;
        this.l3 = c05p12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0400000_2(C869590Y9l c869590Y9l, DefaultGifClickHandler defaultGifClickHandler, GifContent gifContent, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = c869590Y9l;
        this.l1 = defaultGifClickHandler;
        this.l2 = gifContent;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0400000_2(C21289618Te c21289618Te, C869590Y9l c869590Y9l, C06R4 c06r4, C06R6 c06r6, int i) {
        super(0);
        this.$t = i;
        this.l0 = c21289618Te;
        this.l1 = c869590Y9l;
        this.l2 = c06r4;
        this.l3 = c06r6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS131S0400000_2(Context context, Context context2, FragmentManager fragmentManager, Pair<String, ? extends EnumC1665006fY> pair, InboxFragmentV2 inboxFragmentV2) {
        super(0);
        this.$t = inboxFragmentV2;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = fragmentManager;
        this.l3 = pair;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS131S0400000_2(Handler handler, Handler handler2, Function1<? super Boolean, Unit> function1, C05P0<Boolean> c05p0, C05P0<Boolean> c05p02) {
        super(0);
        this.$t = c05p02;
        this.l0 = handler;
        this.l1 = handler2;
        this.l2 = function1;
        this.l3 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0400000_2(Object obj, Set set, AwS93S1200000_8 awS93S1200000_8, List list, int i) {
        super(0);
        this.$t = i;
        this.l0 = obj;
        this.l1 = set;
        this.l2 = awS93S1200000_8;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS131S0400000_2(Function2 function2, Function2<? super String, ? super Boolean, Unit> function22, Function0<Unit> function0, C05P0<String> c05p0, C05P0<Boolean> c05p02) {
        super(0);
        this.$t = c05p02;
        this.l0 = function2;
        this.l1 = function22;
        this.l2 = function0;
        this.l3 = c05p0;
    }
}
