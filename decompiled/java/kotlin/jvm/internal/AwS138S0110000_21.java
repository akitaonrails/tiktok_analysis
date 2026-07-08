package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C09AY;
import X.C1342200l22;
import X.C1346760l9O;
import X.C1350010lEd;
import X.C1394730mOl;
import X.C1558520qew;
import X.C1578630rBN;
import X.C19EG;
import X.EnumC1620106Vz;
import X.InterfaceC1565950qqv;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupAssem;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AwS138S0110000_21 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS138S0110000_21 awS138S0110000_21) {
        ((KeyboardIconGroupAssem) awS138S0110000_21.l0).ap(awS138S0110000_21.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS138S0110000_21 awS138S0110000_21) {
        KeyboardIconGroupAssem keyboardIconGroupAssem = (KeyboardIconGroupAssem) awS138S0110000_21.l0;
        keyboardIconGroupAssem.LLJLLL = null;
        keyboardIconGroupAssem.LLLFFI = null;
        keyboardIconGroupAssem.LLLFZ = false;
        if (awS138S0110000_21.z1) {
            C1346760l9O.LIZ("poll_guide");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS138S0110000_21 awS138S0110000_21) {
        ((BaseCommentCell) awS138S0110000_21.l0).l7(awS138S0110000_21.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS138S0110000_21 awS138S0110000_21) {
        ((C1394730mOl) awS138S0110000_21.l0).LIZIZ(awS138S0110000_21.z1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS138S0110000_21 awS138S0110000_21) {
        if (awS138S0110000_21.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS138S0110000_21.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS138S0110000_21.l0)), IFeedPanelPlatformAbility.class, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$5(kotlin.jvm.internal.AwS138S0110000_21 r5) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS138S0110000_21.invoke$5(kotlin.jvm.internal.AwS138S0110000_21):java.lang.Object");
    }

    public static final Object invoke$6(AwS138S0110000_21 awS138S0110000_21) {
        ICommentCareModeService.LIZ.getClass();
        C1342200l22.LIZ().LJ((C19EG) awS138S0110000_21.l0, awS138S0110000_21.z1, EnumC1620106Vz.COMMENT_BATCH_DELETE_PUSH);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0110000_21(C1350010lEd c1350010lEd, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1350010lEd;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0110000_21(C1394730mOl c1394730mOl, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1394730mOl;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0110000_21(C19EG c19eg, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0110000_21(KeyboardIconGroupAssem keyboardIconGroupAssem, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = keyboardIconGroupAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS138S0110000_21(BaseCommentCell baseCommentCell, BaseCommentCell<T> baseCommentCell2, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = baseCommentCell;
        this.z1 = baseCommentCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0110000_21(boolean z, InterfaceC1565950qqv interfaceC1565950qqv, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = interfaceC1565950qqv;
    }
}
