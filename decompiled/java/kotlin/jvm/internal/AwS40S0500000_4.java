package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C1397620mTQ;
import X.C786410Ut5;
import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS40S0500000_4 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS40S0500000_4 awS40S0500000_4, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue == 1) {
            C013C c013c = (C013C) awS40S0500000_4.l0;
            if (c013c.element) {
                c013c.element = false;
                C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, (Handler) awS40S0500000_4.l1, new ARunnableS104S0100000_4((TextView) awS40S0500000_4.l4, 58));
            }
        }
        List list = (List) awS40S0500000_4.l2;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = (SubscriptionPrivilegeDetailFragment) awS40S0500000_4.l3;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setBackground(subscriptionPrivilegeDetailFragment.requireContext().getDrawable(R.drawable.daw));
        }
        List list2 = (List) awS40S0500000_4.l2;
        if (iIntValue > 4) {
            iIntValue = 4;
        }
        ((View) ListProtector.get(list2, iIntValue)).setBackground(((SubscriptionPrivilegeDetailFragment) awS40S0500000_4.l3).requireContext().getDrawable(R.drawable.dav));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS40S0500000_4 awS40S0500000_4, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Context) awS40S0500000_4.l0).getString(2131821655), new AwS102S0400000_4((User) awS40S0500000_4.l1, (User) awS40S0500000_4.l2, (Function1<? super Throwable, Unit>) awS40S0500000_4.l3, (Context) awS40S0500000_4.l4, (Function0<Unit>) 0));
        c1397620mTQ.LIZJ(1, ((Context) awS40S0500000_4.l0).getString(2131821652), null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0500000_4(C013C c013c, BPEAHandler bPEAHandler, List list, SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment, TextView textView, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = bPEAHandler;
        this.l2 = list;
        this.l3 = subscriptionPrivilegeDetailFragment;
        this.l4 = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS40S0500000_4(Context context, Context context2, User user, Function1<? super Throwable, Unit> function1, Context context3, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = user;
        this.l3 = function1;
        this.l4 = context3;
    }
}
