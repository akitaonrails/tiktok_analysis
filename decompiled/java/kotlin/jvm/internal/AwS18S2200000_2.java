package kotlin.jvm.internal;

import X.C06I0;
import X.C09AY;
import X.C1533790q13;
import X.C1533810q15;
import X.C1590806Ks;
import X.C2188811AlT;
import X.EnumC904370Zdr;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.im.common.setting.StreakPetResourceDescription;
import com.ss.android.ugc.aweme.im.ui.ChatSearchMediaGridFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS18S2200000_2 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS18S2200000_2 awS18S2200000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((ChatSearchMediaGridFragment) awS18S2200000_2.l2, new AwS31S2100000_2(awS18S2200000_2.s0, awS18S2200000_2.s1, (EnumC904370Zdr) awS18S2200000_2.l3, 1));
        assembler.RQ2((ChatSearchMediaGridFragment) awS18S2200000_2.l2, AFwS229S0000000_2.get$arr$(332));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS18S2200000_2 awS18S2200000_2, Object obj) {
        C1533810q15 c1533810q15;
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        boolean z = c1533790q13.LIZIZ;
        boolean z2 = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakPetResourceHelper finish download ");
        sbLIZ.append((StreakPetResourceDescription) awS18S2200000_2.l2);
        sbLIZ.append(' ');
        sbLIZ.append(z);
        sbLIZ.append(' ');
        if (z) {
            c1533810q15 = null;
        } else {
            c1533810q15 = c1533790q13.LIZLLL;
        }
        sbLIZ.append(c1533810q15);
        sbLIZ.append(' ');
        C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) awS18S2200000_2.l3;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(c1533790q13.LIZIZ));
        }
        if (c1533790q13.LIZIZ) {
            if (Intrinsics.LJFF(awS18S2200000_2.s0, "tiktok_im_streak_pet_resource")) {
                C06I0 c06i0 = C06I0.LIZIZ;
                C06I0.LJIIL = true;
            }
            if (Intrinsics.LJFF(awS18S2200000_2.s0, "tiktok_im_group_streak_pet_resource")) {
                C06I0 c06i02 = C06I0.LIZIZ;
            }
            if (Intrinsics.LJFF(awS18S2200000_2.s0, "tiktok_im_streak_pet") && Intrinsics.LJFF(awS18S2200000_2.s1, "/widget/template.js")) {
                C06I0 c06i03 = C06I0.LIZIZ;
                C06I0.LJIIJJI = true;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S2200000_2(StreakPetResourceDescription streakPetResourceDescription, StreakPetResourceDescription streakPetResourceDescription2, Function1<? super Boolean, Unit> function1, String str, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = streakPetResourceDescription;
        this.l3 = streakPetResourceDescription2;
        this.s0 = function1;
        this.s1 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S2200000_2(ChatSearchMediaGridFragment chatSearchMediaGridFragment, String str, String str2, EnumC904370Zdr enumC904370Zdr, int i) {
        super(1);
        this.$t = i;
        this.l2 = chatSearchMediaGridFragment;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = enumC904370Zdr;
    }
}
