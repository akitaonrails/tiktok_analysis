package kotlin.jvm.internal;

import X.C09AY;
import X.C15438062q;
import X.C1567900qu4;
import X.C1591480rW6;
import X.C1592080rX4;
import X.C1592520rXm;
import X.C1592730rY7;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C291001Au;
import X.C627660Ojc;
import X.C786410Ut5;
import X.C817403Hg;
import X.EnumC1571190qzN;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS48S0301000_24 extends C09AY implements Function1 {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS48S0301000_24 awS48S0301000_24, Object obj) {
        C1567900qu4 c1567900qu4 = (C1567900qu4) obj;
        C627660Ojc c627660OjcLIZ = C627660Ojc.LIZ(((C1567900qu4) ((SeriesFeedVM) awS48S0301000_24.l0).getState()).LL, null, null, null, (List) awS48S0301000_24.l1, 7);
        List list = (List) awS48S0301000_24.l2;
        int i = awS48S0301000_24.i3;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList.add(new Pair(obj2, Integer.valueOf(i2 + i)));
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return C1567900qu4.LIZ(c1567900qu4, c627660OjcLIZ, false, null, null, null, null, null, new C291001Au(arrayList), null, 382);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS48S0301000_24 awS48S0301000_24, Object obj) {
        CharSequence text;
        C1592080rX4 c1592080rX4 = (C1592080rX4) obj;
        float f = ((C817403Hg) awS48S0301000_24.l0).element;
        if (Intrinsics.LJFF((C1592080rX4) awS48S0301000_24.l1, c1592080rX4)) {
            f = 1.0f;
        }
        TextView customTextView = c1592080rX4.getCustomTextView();
        if (customTextView != null) {
            EnumC1571190qzN enumC1571190qzN = (EnumC1571190qzN) awS48S0301000_24.l2;
            C1592080rX4 c1592080rX42 = (C1592080rX4) awS48S0301000_24.l1;
            int i = awS48S0301000_24.i3;
            C786410Ut5.S4(f, customTextView);
            if ((C1591480rW6.LIZ() == 2 || C1591480rW6.LIZ() == 3) && enumC1571190qzN == EnumC1571190qzN.DARK) {
                C1592520rXm.LIZ(customTextView, !Intrinsics.LJFF(c1592080rX4, c1592080rX42));
            } else {
                customTextView.setShadowLayer(C1592730rY7.LIZ(), 0.0f, C1592730rY7.LIZIZ(), i);
            }
        }
        ImageView customImageView = c1592080rX4.getCustomImageView();
        if (customImageView != null) {
            C786410Ut5.V4(customImageView, f);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTabScrolledState:");
        TextView mCustomTextView$homepage_common_release = c1592080rX4.getMCustomTextView$homepage_common_release();
        if (mCustomTextView$homepage_common_release != null) {
            text = mCustomTextView$homepage_common_release.getText();
        } else {
            text = null;
        }
        sbLIZ.append((Object) text);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0301000_24(C817403Hg c817403Hg, C1592080rX4 c1592080rX4, EnumC1571190qzN enumC1571190qzN, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c817403Hg;
        this.l1 = c1592080rX4;
        this.l2 = enumC1571190qzN;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS48S0301000_24(SeriesFeedVM seriesFeedVM, SeriesFeedVM seriesFeedVM2, List<Aweme> list, List<? extends Aweme> list2, int i) {
        super(1);
        this.$t = i;
        this.l0 = seriesFeedVM;
        this.l1 = seriesFeedVM2;
        this.l2 = list;
        this.i3 = list2;
    }
}
