package kotlin.jvm.internal;

import X.C09AY;
import X.C0Z5S;
import X.C0ZL0;
import X.C0ZQI;
import X.C0ZRA;
import X.C0ZRH;
import X.C13IQ;
import X.C458640Hyg;
import X.C869590Y9l;
import X.C893980Z5g;
import X.C898670ZNh;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.GroupDetailFragment;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS2S1300100_14 extends C09AY implements Function1 {
    public final int $t;
    public long j4;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final Object invoke$0(AwS2S1300100_14 awS2S1300100_14, Object obj) {
        boolean z = C0ZRA.LIZ;
        C0ZRA.LIZLLL(awS2S1300100_14.s0, awS2S1300100_14.j4, (C869590Y9l) awS2S1300100_14.l1, C0ZRH.LIZ);
        C458640Hyg.LIZJ(((C869590Y9l) awS2S1300100_14.l1).getMsgId(), "long_press_message_panel", ((SessionInfo) awS2S1300100_14.l2).getConversationId(), awS2S1300100_14.s0);
        ((C0ZQI) awS2S1300100_14.l3).LJ(C0ZL0.VOICE_TRANSCRIBE_START, null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S1300100_14 awS2S1300100_14, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((GroupDetailFragment) awS2S1300100_14.l1, new AwS593S0100000_14((C893980Z5g) awS2S1300100_14.l2, 276));
        assembler.QQ2((GroupDetailFragment) awS2S1300100_14.l1, AFwS229S0000000_2.get$arr$(734));
        assembler.RQ2((GroupDetailFragment) awS2S1300100_14.l1, AFwS248S0000000_14.get$arr$(454));
        assembler.RQ2((GroupDetailFragment) awS2S1300100_14.l1, AFwS248S0000000_14.get$arr$(455));
        GroupDetailFragment groupDetailFragment = (GroupDetailFragment) awS2S1300100_14.l1;
        assembler.DQ2(groupDetailFragment, new C0Z5S(groupDetailFragment, awS2S1300100_14.s0, awS2S1300100_14.j4));
        GroupDetailFragment groupDetailFragment2 = (GroupDetailFragment) awS2S1300100_14.l1;
        assembler.RQ2(groupDetailFragment2, new AwS98S1200000_14((C13IQ) awS2S1300100_14.l3, (C13IQ<? extends UISlotAssem>) awS2S1300100_14.s0, (String) groupDetailFragment2, (GroupDetailFragment) 13));
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ != null && iMCrossAppFeatureDiffApiLIZIZ.LIZLLL()) {
            assembler.RQ2((GroupDetailFragment) awS2S1300100_14.l1, AFwS248S0000000_14.get$arr$(456));
        } else {
            assembler.QQ2((GroupDetailFragment) awS2S1300100_14.l1, AFwS229S0000000_2.get$arr$(735));
        }
        GroupDetailFragment groupDetailFragment3 = (GroupDetailFragment) awS2S1300100_14.l1;
        assembler.QQ2(groupDetailFragment3, new AwS593S0100000_14(groupDetailFragment3, 277));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x000b: IPUT (r8 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS2S1300100_14) (LINE:100663307) kotlin.jvm.internal.AwS2S1300100_14.l3 java.lang.Object, block:B:2:0x0000 */
    public AwS2S1300100_14(GroupDetailFragment groupDetailFragment, GroupDetailFragment groupDetailFragment2, C893980Z5g c893980Z5g, String str, long j, C13IQ<? extends UISlotAssem> c13iq) {
        Object obj;
        super(1);
        this.$t = c13iq;
        this.l1 = groupDetailFragment;
        this.l2 = groupDetailFragment2;
        this.s0 = c893980Z5g;
        this.j4 = str;
        this.l3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1300100_14(String str, long j, C869590Y9l c869590Y9l, SessionInfo sessionInfo, C0ZQI c0zqi, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.j4 = j;
        this.l1 = c869590Y9l;
        this.l2 = sessionInfo;
        this.l3 = c0zqi;
    }
}
