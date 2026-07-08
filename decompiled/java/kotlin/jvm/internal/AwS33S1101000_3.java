package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AwS33S1101000_3 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS33S1101000_3 awS33S1101000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepoImpl-tryGetInternalShareSortedList, get disk scene=");
        sbLIZ.append(awS33S1101000_3.s0);
        sbLIZ.append(", sourceAction=");
        sbLIZ.append(awS33S1101000_3.i2);
        sbLIZ.append(", count=");
        sbLIZ.append(((List) awS33S1101000_3.l1).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS33S1101000_3 awS33S1101000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("【STORY】  ");
        sbLIZ.append(awS33S1101000_3.s0);
        sbLIZ.append(", create view, actualIndex = ");
        sbLIZ.append(awS33S1101000_3.i2);
        sbLIZ.append(", attachView.childCount = ");
        sbLIZ.append(((ViewGroup) awS33S1101000_3.l1).getChildCount() - 1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S1101000_3(int i, ViewGroup viewGroup, String str, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.i2 = i;
        this.l1 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS33S1101000_3(String str, String str2, int i, List<SharePanelItemInfo> list) {
        super(0);
        this.$t = list;
        this.s0 = str;
        this.i2 = str2;
        this.l1 = i;
    }
}
