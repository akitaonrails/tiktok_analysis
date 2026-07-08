package kotlin.jvm.internal;

import X.AbstractC1347290lAF;
import X.C09AY;
import X.C1340400kz8;
import X.C1344030l4z;
import X.C1346480l8w;
import X.C1346950l9h;
import X.C1347070l9t;
import X.C1347110l9x;
import X.C1347120l9y;
import X.C1353820lKm;
import X.C1377040lwE;
import X.C1391190mJ3;
import X.C1397620mTQ;
import X.C2188811AlT;
import X.C291001Au;
import X.C343970De7;
import X.InterfaceC1377050lwF;
import X.InterfaceC737440SwI;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS107S0110000_21 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS107S0110000_21 awS107S0110000_21, Object obj) {
        int i;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        C1377040lwE c1377040lwE = C1377040lwE.LIZ;
        boolean z = awS107S0110000_21.z1;
        c1377040lwE.getClass();
        if (z) {
            i = R.string.hz_;
        } else {
            i = R.string.epx;
        }
        c1397620mTQ.LJFF(i, new AwS600S0100000_21((InterfaceC1377050lwF) awS107S0110000_21.l0, 3));
        c1397620mTQ.LJII(R.string.f1_, new AwS600S0100000_21((InterfaceC1377050lwF) awS107S0110000_21.l0, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS107S0110000_21 awS107S0110000_21, Object obj) {
        return C1346950l9h.LIZ((C1346950l9h) obj, null, false, 0, 0, new C1346480l8w((Comment) awS107S0110000_21.l0, null, awS107S0110000_21.z1, 2), false, false, false, null, null, null, null, null, false, null, null, new C291001Au(Boolean.TRUE), false, false, null, false, false, false, false, false, null, null, false, null, -262161);
    }

    public static final Object invoke$2(AwS107S0110000_21 awS107S0110000_21, Object obj) {
        if (awS107S0110000_21.z1) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(((InterfaceC737440SwI) awS107S0110000_21.l0).IC(), C343970De7.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS107S0110000_21 awS107S0110000_21, Object obj) {
        if (awS107S0110000_21.z1) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(((InterfaceC737440SwI) awS107S0110000_21.l0).IC(), C343970De7.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS107S0110000_21 awS107S0110000_21, Object obj) {
        Aweme aweme = ((C1353820lKm) obj).LLILLJJLI;
        if (aweme != null) {
            AwemeBizExtKt.handleInteractionBubbleLike(aweme, awS107S0110000_21.z1, (User) awS107S0110000_21.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS107S0110000_21 awS107S0110000_21, Object obj) {
        ((BaseCommentCell) awS107S0110000_21.l0).l7(awS107S0110000_21.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS107S0110000_21 awS107S0110000_21, Object obj) {
        ((BaseCommentCell) awS107S0110000_21.l0).l7(awS107S0110000_21.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS107S0110000_21 awS107S0110000_21, Object obj) {
        C1346950l9h c1346950l9h = (C1346950l9h) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSoftKeyboardState ");
        sbLIZ.append(c1346950l9h.LL);
        C1344030l4z.LIZJ("KeyboardVM", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1347290lAF abstractC1347290lAF = c1346950l9h.LL;
        if (!(abstractC1347290lAF instanceof C1347070l9t)) {
            if (!Intrinsics.LJFF(abstractC1347290lAF, C1347110l9x.LIZ) && !Intrinsics.LJFF(c1346950l9h.LL, C1347120l9y.LIZ)) {
                ((KeyboardVMV2) awS107S0110000_21.l0).setState(new AwS34S0010000_21(awS107S0110000_21.z1, 33));
            } else {
                ((KeyboardVMV2) awS107S0110000_21.l0).SQ2(C1347120l9y.LIZ, false);
                ((KeyboardVMV2) awS107S0110000_21.l0).setState(new AwS34S0010000_21(awS107S0110000_21.z1, 31));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S0110000_21(KeyboardVMV2 keyboardVMV2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = keyboardVMV2;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S0110000_21(Comment comment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = comment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS107S0110000_21(BaseCommentCell baseCommentCell, BaseCommentCell<C1340400kz8> baseCommentCell2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = baseCommentCell;
        this.z1 = baseCommentCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S0110000_21(User user, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S0110000_21(boolean z, InterfaceC737440SwI interfaceC737440SwI, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = interfaceC737440SwI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S0110000_21(boolean z, InterfaceC1377050lwF interfaceC1377050lwF, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = interfaceC1377050lwF;
    }
}
