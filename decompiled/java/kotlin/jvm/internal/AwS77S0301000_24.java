package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C1567340qtA;
import X.C1567350qtB;
import X.C1581390rFp;
import X.C23250099c;
import X.C724240Sb0;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.mingap.MinGapMonitorComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3RefreshAssem;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS77S0301000_24 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS77S0301000_24 awS77S0301000_24) {
        MinGapMonitorComponent minGapMonitorComponent = (MinGapMonitorComponent) awS77S0301000_24.l0;
        Aweme aweme = (Aweme) awS77S0301000_24.l1;
        int i = awS77S0301000_24.i3;
        C1567350qtB c1567350qtB = (C1567350qtB) awS77S0301000_24.l2;
        minGapMonitorComponent.getClass();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(minGapMonitorComponent), C0PEM.LIZJ, null, new C1567340qtA(c1567350qtB, minGapMonitorComponent, aweme, i, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS77S0301000_24 awS77S0301000_24) {
        C1581390rFp.LIZ(C724240Sb0.LJI((FriendsV3RefreshAssem) awS77S0301000_24.l0), (InsertStory) awS77S0301000_24.l1, awS77S0301000_24.i3, (Long) awS77S0301000_24.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS77S0301000_24(MinGapMonitorComponent minGapMonitorComponent, Aweme aweme, int i, C1567350qtB c1567350qtB, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = minGapMonitorComponent;
        this.l1 = aweme;
        this.i3 = i;
        this.l2 = c1567350qtB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS77S0301000_24(FriendsV3RefreshAssem friendsV3RefreshAssem, InsertStory insertStory, int i, Long l, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = friendsV3RefreshAssem;
        this.l1 = insertStory;
        this.i3 = i;
        this.l2 = l;
    }
}
