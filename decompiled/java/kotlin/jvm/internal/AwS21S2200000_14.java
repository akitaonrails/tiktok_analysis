package kotlin.jvm.internal;

import X.AbstractC912050ZqF;
import X.C09AY;
import X.C0YS1;
import X.C20478080m;
import X.C2188811AlT;
import X.C911980Zq8;
import X.EnumC900350ZTt;
import X.EnumC910040Zn0;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.changename.fragment.EditGroupNameFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS21S2200000_14 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS21S2200000_14 awS21S2200000_14, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((EditGroupNameFragment) awS21S2200000_14.l2, new AwS15S2000000_14(awS21S2200000_14.s1, awS21S2200000_14.s0, 0));
        assembler.QQ2((EditGroupNameFragment) awS21S2200000_14.l2, AFwS229S0000000_2.get$arr$(81));
        assembler.QQ2((EditGroupNameFragment) awS21S2200000_14.l2, AFwS248S0000000_14.get$arr$(33));
        if (Intrinsics.LJFF(awS21S2200000_14.s0, EnumC910040Zn0.PANEL.getValue())) {
            assembler.QQ2((EditGroupNameFragment) awS21S2200000_14.l2, new AwS585S0100000_6((View) awS21S2200000_14.l3, 36));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S2200000_14 awS21S2200000_14, Object obj) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS21S2200000_14.s0);
        sbLIZ.append(" AI Group Shot Success, logId: ");
        BaseResponse.ServerTimeExtra serverTimeExtra = ((BaseResponse) obj).extra;
        if (serverTimeExtra != null) {
            str = serverTimeExtra.logid;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C0YS1.LIZJ("AIGroupShotSender", C2188811AlT.LIZIZ(sbLIZ));
        C20478080m.LIZ(new C911980Zq8(awS21S2200000_14.s1, (AbstractC912050ZqF) awS21S2200000_14.l2, (EnumC900350ZTt) awS21S2200000_14.l3, null));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S2200000_14(EditGroupNameFragment editGroupNameFragment, String str, String str2, View view, int i) {
        super(1);
        this.$t = i;
        this.l2 = editGroupNameFragment;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S2200000_14(String str, String str2, AbstractC912050ZqF abstractC912050ZqF, EnumC900350ZTt enumC900350ZTt, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = abstractC912050ZqF;
        this.l3 = enumC900350ZTt;
    }
}
