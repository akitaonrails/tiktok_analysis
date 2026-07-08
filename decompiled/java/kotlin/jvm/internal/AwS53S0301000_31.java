package kotlin.jvm.internal;

import X.C09AY;
import X.C1163430gNh;
import X.C1163440gNi;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.business.comment.assem.CommentMentionPanelAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS53S0301000_31 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS53S0301000_31 awS53S0301000_31, Object obj) {
        ((Assembler) obj).RQ2((Fragment) awS53S0301000_31.l0, new AwS112S0201000_31(awS53S0301000_31.i3, (CommentMentionPanelAssem) awS53S0301000_31.l1, (C1163440gNi) awS53S0301000_31.l2, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS53S0301000_31 awS53S0301000_31, Object obj) {
        ((Assembler) obj).RQ2((UIAssem) awS53S0301000_31.l0, new AwS112S0201000_31(awS53S0301000_31.i3, (CommentMentionPanelAssem) awS53S0301000_31.l1, (C1163440gNi) awS53S0301000_31.l2, 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0301000_31(Fragment fragment, CommentMentionPanelAssem commentMentionPanelAssem, C1163430gNh c1163430gNh, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragment;
        this.i3 = R.id.ec9;
        this.l1 = commentMentionPanelAssem;
        this.l2 = c1163430gNh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0301000_31(UIAssem uIAssem, CommentMentionPanelAssem commentMentionPanelAssem, C1163430gNh c1163430gNh, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIAssem;
        this.i3 = R.id.eca;
        this.l1 = commentMentionPanelAssem;
        this.l2 = c1163430gNh;
    }
}
