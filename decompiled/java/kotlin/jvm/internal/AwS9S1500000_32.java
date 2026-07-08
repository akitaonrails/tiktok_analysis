package kotlin.jvm.internal;

import X.C09AY;
import X.C1397510mTF;
import X.C1397620mTQ;
import X.C18UJ;
import X.C18WR;
import X.C18WU;
import X.C19EG;
import X.C259800zU;
import X.C555520LqY;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.tools.data.ConfirmModal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS9S1500000_32 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

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

    public static final Object invoke$0(AwS9S1500000_32 awS9S1500000_32, Object obj) {
        int i;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        C19EG c19egT2 = ((C18WR) awS9S1500000_32.l1).T2();
        ConfirmModal confirmModal = (ConfirmModal) awS9S1500000_32.l2;
        if (confirmModal != null) {
            i = confirmModal.confirmBtnResId;
        } else {
            i = 0;
        }
        c1397620mTQ.LIZJ(0, c19egT2.getString(i), new AwS68S1300000_32((C18WR) awS9S1500000_32.l1, awS9S1500000_32.s0, (AIChatGenNode) awS9S1500000_32.l3, (C18WU) awS9S1500000_32.l4, 0));
        c1397620mTQ.LIZJ(1, ((C18WR) awS9S1500000_32.l1).T2().getString(2131828358), new AwS581S0100000_2((C259800zU) awS9S1500000_32.l5, (C259800zU<C1397510mTF>) 364));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S1500000_32 awS9S1500000_32, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, C555520LqY.LIZIZ(2131837136), new AwS32S1400000_32((C18UJ) awS9S1500000_32.l1, awS9S1500000_32.s0, (AIChatGenNode) awS9S1500000_32.l2, (Function0) awS9S1500000_32.l3, c1397620mTQ, (Function0) awS9S1500000_32.l4, 0));
        c1397620mTQ.LIZJ(1, C555520LqY.LIZIZ(2131837137), new AwS241S0300000_32((Function0) awS9S1500000_32.l5, (Function0<Unit>) awS9S1500000_32.l1, (C18UJ) awS9S1500000_32.l2, (AIChatGenNode) 5));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS9S1500000_32(C18UJ c18uj, C18UJ c18uj2, String str, AIChatGenNode aIChatGenNode, Function0<Boolean> function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(1);
        this.$t = function03;
        this.l1 = c18uj;
        this.s0 = c18uj2;
        this.l2 = str;
        this.l3 = aIChatGenNode;
        this.l4 = function0;
        this.l5 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS9S1500000_32(C18WR c18wr, C18WR c18wr2, ConfirmModal confirmModal, String str, AIChatGenNode aIChatGenNode, C18WU c18wu, C259800zU<C1397510mTF> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l1 = c18wr;
        this.l2 = c18wr2;
        this.s0 = confirmModal;
        this.l3 = str;
        this.l4 = aIChatGenNode;
        this.l5 = c18wu;
    }
}
