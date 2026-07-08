package kotlin.jvm.internal;

import X.C09AY;
import X.C0HTT;
import X.C1397620mTQ;
import X.C20684815ws;
import X.C737030Svd;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.view.ProfileNaviActivity;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS60S0210000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS60S0210000_6 awS60S0210000_6, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131830529, new AwS60S0210000_6((C0HTT) awS60S0210000_6.l0, (C0HTT<? extends IEvent>) awS60S0210000_6.l1, (Aweme) awS60S0210000_6.z2, true));
        c1397620mTQ.LJII(R.string.f1_, AFwS236S0000000_6.get$arr$(53));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS60S0210000_6 awS60S0210000_6, Object obj) {
        C20684815ws.onEventV3("tns_video_delete_notice_popup_delete_click");
        C0HTT c0htt = (C0HTT) awS60S0210000_6.l0;
        if ((c0htt instanceof C0HTT) && c0htt != null) {
            C737030Svd c737030Svd = new C737030Svd(2, (Aweme) awS60S0210000_6.l1);
            c737030Svd.LJIJ = Boolean.valueOf(awS60S0210000_6.z2);
            c0htt.LLIIL(c737030Svd);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS60S0210000_6 awS60S0210000_6, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!awS60S0210000_6.z2 || zBooleanValue) {
            ProfileNaviActivity.LLLZ((ProfileNaviActivity) awS60S0210000_6.l0, (Fragment) ((Function0) awS60S0210000_6.l1).invoke());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS60S0210000_6(C0HTT c0htt, C0HTT<? extends IEvent> c0htt2, Aweme aweme, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = c0htt;
        this.l1 = c0htt2;
        this.z2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS60S0210000_6(boolean z, boolean z2, ProfileNaviActivity profileNaviActivity, Function0<? extends Fragment> function0) {
        super(1);
        this.$t = function0;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = profileNaviActivity;
    }
}
