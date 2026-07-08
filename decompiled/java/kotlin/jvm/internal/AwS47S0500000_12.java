package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0TUL;
import X.C0U5B;
import X.C0U5F;
import X.C0UX6;
import X.C20684815ws;
import X.C207209166l;
import X.C2344009Gk;
import X.C771370UNr;
import X.C782820UnI;
import X.InterfaceC782830UnJ;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.comment.model.FORMAT;
import com.ss.android.ugc.aweme.comment.model.Strategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS47S0500000_12 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS47S0500000_12 awS47S0500000_12, Object obj) {
        LifecycleOwner lifecycleOwner;
        C782820UnI c782820UnI = (C782820UnI) obj;
        if (c782820UnI.LIZ == ((C0UX6) awS47S0500000_12.l0) && ((lifecycleOwner = (LifecycleOwner) awS47S0500000_12.l1) == null || lifecycleOwner.getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) <= 0)) {
            RedDotExtensionKt.LJIILIIL((C0UX6) awS47S0500000_12.l0, (View) awS47S0500000_12.l2, (Function1) awS47S0500000_12.l3, c782820UnI.LIZIZ, (InterfaceC782830UnJ) awS47S0500000_12.l4, null, 16);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS47S0500000_12 awS47S0500000_12, Object obj) {
        ((LiveEffect) awS47S0500000_12.l0).LJJLIL(true);
        ((LiveEffect) awS47S0500000_12.l0).LJLILLLLZI(false);
        ((LiveEffect) awS47S0500000_12.l0).LJJJJL(C771370UNr.LIZLLL((C207209166l) awS47S0500000_12.l1));
        C0U5B c0u5b = (C0U5B) awS47S0500000_12.l2;
        if (c0u5b != null) {
            c0u5b.LLLIILIL((LiveEffect) awS47S0500000_12.l0);
        }
        C0U5F c0u5f = (C0U5F) awS47S0500000_12.l3;
        if (c0u5f != null) {
            c0u5f.LIZJ((BgEffectViewModel) awS47S0500000_12.l4, (LiveEffect) awS47S0500000_12.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS47S0500000_12 awS47S0500000_12, Object obj) {
        Strategy strategy = (Strategy) awS47S0500000_12.l0;
        Strategy strategy2 = Strategy.VIOLATING;
        if (strategy == strategy2 && ((FORMAT) awS47S0500000_12.l1) == FORMAT.EDIT) {
            C0TUL c0tul = (C0TUL) awS47S0500000_12.l2;
            if (c0tul != null) {
                c0tul.LIZIZ();
            }
            C2344009Gk c2344009Gk = (C2344009Gk) awS47S0500000_12.l3;
            c2344009Gk.LIZJ(((C013C) awS47S0500000_12.l4).element ? 1 : 0, "if_click_cg");
            C20684815ws.LJIILLIIL("comment_rethink_edit_ck", c2344009Gk.LIZ);
        } else if (strategy == strategy2) {
            C0TUL c0tul2 = (C0TUL) awS47S0500000_12.l2;
            if (c0tul2 != null) {
                c0tul2.LIZLLL(3);
            }
            C2344009Gk c2344009Gk2 = (C2344009Gk) awS47S0500000_12.l3;
            c2344009Gk2.LIZJ(((C013C) awS47S0500000_12.l4).element ? 1 : 0, "if_click_cg");
            C20684815ws.LJIILLIIL("comment_rethink_post_ck", c2344009Gk2.LIZ);
        } else {
            C0TUL c0tul3 = (C0TUL) awS47S0500000_12.l2;
            if (c0tul3 != null) {
                c0tul3.LIZLLL(2);
            }
            C2344009Gk c2344009Gk3 = (C2344009Gk) awS47S0500000_12.l3;
            c2344009Gk3.LIZJ(((C013C) awS47S0500000_12.l4).element ? 1 : 0, "if_click_cg");
            C20684815ws.LJIILLIIL("comment_rethink_noedit_ck", c2344009Gk3.LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0500000_12(View view, LifecycleOwner lifecycleOwner, InterfaceC782830UnJ interfaceC782830UnJ, C0UX6 c0ux6, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0ux6;
        this.l1 = lifecycleOwner;
        this.l2 = view;
        this.l3 = function1;
        this.l4 = interfaceC782830UnJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0500000_12(LiveEffect liveEffect, C207209166l c207209166l, C0U5B c0u5b, C0U5F c0u5f, BgEffectViewModel bgEffectViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveEffect;
        this.l1 = c207209166l;
        this.l2 = c0u5b;
        this.l3 = c0u5f;
        this.l4 = bgEffectViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0500000_12(Strategy strategy, FORMAT format, C0TUL c0tul, C2344009Gk c2344009Gk, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = strategy;
        this.l1 = format;
        this.l2 = c0tul;
        this.l3 = c2344009Gk;
        this.l4 = c013c;
    }
}
