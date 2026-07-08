package kotlin.jvm.internal;

import X.C004I;
import X.C09AY;
import X.C11F4;
import X.C11F9;
import X.C11NZ;
import X.C12QW;
import X.C12QX;
import X.C15IK;
import X.C1664150tPJ;
import X.C1761680vwc;
import X.C19466211Dw;
import X.C20684815ws;
import X.C2344009Gk;
import X.C259800zU;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes30.dex */
public class AwS306S0300000_29 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS306S0300000_29 awS306S0300000_29, Object obj, Object obj2) {
        Banner banner = (Banner) ((Function0) awS306S0300000_29.l0).invoke();
        Integer num = (Integer) ((Function0) awS306S0300000_29.l1).invoke();
        if (banner != null && num != null) {
            C11F4 c11f4 = (C11F4) awS306S0300000_29.l2;
            int iIntValue = num.intValue();
            c11f4.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "change_music_page");
            c2344009Gk.LJIIIIZZ("banner_id", banner.getBid());
            c2344009Gk.LJIIIIZZ("client_order", Integer.toString(iIntValue));
            int i = C11F9.LIZIZ[banner.getSchemaType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    c2344009Gk.LJFF("category_id", banner.getCategoryId());
                }
            } else {
                c2344009Gk.LJFF("music_id", banner.getMusicId());
            }
            if (C15IK.LIZLLL()) {
                c2344009Gk.LJFF("is_commercial", "1");
            }
            C20684815ws.LJIILLIIL("banner_show", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS306S0300000_29 awS306S0300000_29, Object obj, Object obj2) {
        C259800zU c259800zU = (C259800zU) awS306S0300000_29.l0;
        if (c259800zU.element == 0) {
            c259800zU.element = obj;
            ((C12QW) awS306S0300000_29.l1).LLLJIL = (C1664150tPJ) awS306S0300000_29.l2;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS306S0300000_29 awS306S0300000_29, Object obj, Object obj2) {
        C259800zU c259800zU = (C259800zU) awS306S0300000_29.l0;
        if (c259800zU.element == 0) {
            c259800zU.element = obj;
            ((C12QW) awS306S0300000_29.l1).LLLJIL = (C1664150tPJ) awS306S0300000_29.l2;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS306S0300000_29 awS306S0300000_29, Object obj, Object obj2) {
        C259800zU c259800zU = (C259800zU) awS306S0300000_29.l0;
        if (c259800zU.element == 0) {
            c259800zU.element = obj;
            ((C12QX) awS306S0300000_29.l1).LLLJL = (C1664150tPJ) awS306S0300000_29.l2;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS306S0300000_29 awS306S0300000_29, Object obj, Object obj2) {
        C259800zU c259800zU = (C259800zU) awS306S0300000_29.l0;
        if (c259800zU.element == 0) {
            c259800zU.element = obj;
            ((C12QX) awS306S0300000_29.l1).LLLJL = (C1664150tPJ) awS306S0300000_29.l2;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS306S0300000_29 awS306S0300000_29, Object obj, Object obj2) {
        ListState listState = (ListState) obj2;
        if (listState.getHasMore().LIZ && !(listState.getLoadMore() instanceof C19466211Dw)) {
            ((ListMiddleware) awS306S0300000_29.l0).LIZIZ((C11NZ) ((Function1) awS306S0300000_29.l1).invoke(obj), new AwS464S0200000_29((ListMiddleware) awS306S0300000_29.l0, (ListMiddleware<C004I, Object, C1761680vwc>) awS306S0300000_29.l2, (Function2<? super List<Object>, ? super List<Object>, ? extends List<Object>>) 12));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS306S0300000_29 awS306S0300000_29, Object obj, Object obj2) {
        if (!(((ListState) obj2).getRefresh() instanceof C19466211Dw)) {
            ((ListMiddleware) awS306S0300000_29.l0).LIZIZ((C11NZ) ((Function1) awS306S0300000_29.l1).invoke(obj), new AwS464S0200000_29((ListMiddleware) awS306S0300000_29.l0, (ListMiddleware<C004I, Object, C1761680vwc>) awS306S0300000_29.l2, (Function2<? super List<Object>, ? super List<Object>, ? extends List<Object>>) 13));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS306S0300000_29(C259800zU c259800zU, C259800zU<Effect> c259800zU2, C12QW c12qw, C1664150tPJ c1664150tPJ) {
        super(2);
        this.$t = c1664150tPJ;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c12qw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS306S0300000_29(C259800zU c259800zU, C259800zU<Effect> c259800zU2, C12QX c12qx, C1664150tPJ c1664150tPJ) {
        super(2);
        this.$t = c1664150tPJ;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c12qx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS306S0300000_29(ListMiddleware listMiddleware, ListMiddleware<C004I, Object, C1761680vwc> listMiddleware2, Function1<C004I, ? extends C11NZ<Pair<List<Object>, C1761680vwc>>> function1, Function2<? super List<Object>, ? super List<Object>, ? extends List<Object>> function2) {
        super(2);
        this.$t = function2;
        this.l0 = listMiddleware;
        this.l1 = listMiddleware2;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS306S0300000_29(Function0 function0, Function0<? extends Banner> function02, Function0<Integer> function03, C11F4 c11f4) {
        super(2);
        this.$t = c11f4;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = function03;
    }
}
