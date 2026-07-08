package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C11VM;
import X.C1308910kAL;
import X.C1528305yb;
import X.C2296808zG;
import X.C23250099c;
import X.C786410Ut5;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public class AwS67S2100000_29 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS67S2100000_29 awS67S2100000_29) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1528305yb("ttsocial_chat_guide_card_show", awS67S2100000_29.s0, awS67S2100000_29.s1, (Integer) awS67S2100000_29.l2, null, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS67S2100000_29 awS67S2100000_29) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue;
        C11VM c11vm = (C11VM) awS67S2100000_29.l2;
        String str = awS67S2100000_29.s0;
        c11vm.LLJI = str;
        c11vm.LLJILJIL = awS67S2100000_29.s1;
        if (Intrinsics.LJFF(str, "full_screen")) {
            RelativeLayout relativeLayout = c11vm.LLILLJJLI;
            if (relativeLayout != null) {
                layoutParams = relativeLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
            } else {
                layoutParams = null;
            }
            RelativeLayout relativeLayout2 = c11vm.LLILLJJLI;
            if (relativeLayout2 != null) {
                C786410Ut5.e6(relativeLayout2, layoutParams);
            }
            RelativeLayout relativeLayout3 = c11vm.LLILLJJLI;
            if (relativeLayout3 != null) {
                Context context = c11vm.getContext();
                if (context != null) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context);
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = -16777216;
                    }
                    relativeLayout3.setBackgroundColor(iIntValue);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        } else {
            Intrinsics.LJFF(c11vm.LLJI, "half_screen");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS67S2100000_29(C11VM c11vm, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = c11vm;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS67S2100000_29(String str, String str2, Integer num, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = num;
    }
}
