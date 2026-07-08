package kotlin.jvm.internal;

import X.C09AY;
import X.C0DQG;
import X.C0PEM;
import X.C1390410mHn;
import X.C23250099c;
import X.C324900CoS;
import X.C324910CoT;
import X.C786410Ut5;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.tako.ui.TakoChatActivity;
import com.ss.android.ugc.aweme.tako.ui.TakoChatFragment;
import com.ss.android.ugc.aweme.tako.ui.TakoChatRootFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS0S0210200_4 extends C09AY implements Function0 {
    public final int $t;
    public long j3;
    public long j4;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AwS0S0210200_4 awS0S0210200_4) {
        long jCurrentTimeMillis;
        C0DQG c0dqg = ((TakoChatActivity) awS0S0210200_4.l0).LLJLLIL;
        if (c0dqg != null) {
            View view = c0dqg.LIZIZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            C1390410mHn c1390410mHn = c0dqg.LIZLLL;
            if (c1390410mHn != null) {
                c1390410mHn.LIZLLL();
            }
        }
        if (awS0S0210200_4.z2) {
            jCurrentTimeMillis = System.currentTimeMillis() - awS0S0210200_4.j3;
        } else {
            jCurrentTimeMillis = 0;
        }
        if (awS0S0210200_4.z2) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((TakoChatFragment) awS0S0210200_4.l1), C0PEM.LIZJ, null, new C324910CoT((TakoChatActivity) awS0S0210200_4.l0, jCurrentTimeMillis, awS0S0210200_4.z2, awS0S0210200_4.j4, null), 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0210200_4 awS0S0210200_4) {
        long jCurrentTimeMillis;
        C0DQG c0dqg = ((TakoChatRootFragment) awS0S0210200_4.l0).LLJJIJI;
        if (c0dqg != null) {
            View view = c0dqg.LIZIZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            C1390410mHn c1390410mHn = c0dqg.LIZLLL;
            if (c1390410mHn != null) {
                c1390410mHn.LIZLLL();
            }
        }
        if (awS0S0210200_4.z2) {
            jCurrentTimeMillis = System.currentTimeMillis() - awS0S0210200_4.j3;
        } else {
            jCurrentTimeMillis = 0;
        }
        if (awS0S0210200_4.z2) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((TakoChatFragment) awS0S0210200_4.l1), C0PEM.LIZJ, null, new C324900CoS((TakoChatRootFragment) awS0S0210200_4.l0, jCurrentTimeMillis, awS0S0210200_4.z2, awS0S0210200_4.j4, null), 2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0210200_4(TakoChatActivity takoChatActivity, boolean z, long j, TakoChatFragment takoChatFragment, long j2, int i) {
        super(0);
        this.$t = i;
        this.l0 = takoChatActivity;
        this.z2 = z;
        this.j3 = j;
        this.l1 = takoChatFragment;
        this.j4 = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0210200_4(TakoChatRootFragment takoChatRootFragment, boolean z, long j, TakoChatFragment takoChatFragment, long j2, int i) {
        super(0);
        this.$t = i;
        this.l0 = takoChatRootFragment;
        this.z2 = z;
        this.j3 = j;
        this.l1 = takoChatFragment;
        this.j4 = j2;
    }
}
