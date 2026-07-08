package kotlin.jvm.internal;

import X.C09AY;
import X.C1AB2;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public class AwS78S0100100_33 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS78S0100100_33 awS78S0100100_33) {
        LabelContainerWidget labelContainerWidget = (LabelContainerWidget) awS78S0100100_33.l0;
        labelContainerWidget.LLJJLIIIJLLLLLLLZ = labelContainerWidget.N1(awS78S0100100_33.j1);
        C1AB2 c1ab2 = ((LabelContainerWidget) awS78S0100100_33.l0).LLJJLIIIJLLLLLLLZ;
        if (c1ab2 != null) {
            c1ab2.start();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS78S0100100_33 awS78S0100100_33) {
        LabelContainerWidget labelContainerWidget = (LabelContainerWidget) awS78S0100100_33.l0;
        labelContainerWidget.LLJJLIIIJLLLLLLLZ = labelContainerWidget.N1(awS78S0100100_33.j1);
        C1AB2 c1ab2 = ((LabelContainerWidget) awS78S0100100_33.l0).LLJJLIIIJLLLLLLLZ;
        if (c1ab2 != null) {
            c1ab2.start();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS78S0100100_33 awS78S0100100_33) {
        LabelContainerWidget labelContainerWidget = (LabelContainerWidget) awS78S0100100_33.l0;
        labelContainerWidget.LLJJLIIIJLLLLLLLZ = labelContainerWidget.N1(awS78S0100100_33.j1);
        C1AB2 c1ab2 = ((LabelContainerWidget) awS78S0100100_33.l0).LLJJLIIIJLLLLLLLZ;
        if (c1ab2 != null) {
            c1ab2.start();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S0100100_33(long j, LabelContainerWidget labelContainerWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = labelContainerWidget;
        this.j1 = j;
    }
}
