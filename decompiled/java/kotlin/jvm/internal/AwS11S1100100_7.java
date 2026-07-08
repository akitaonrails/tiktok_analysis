package kotlin.jvm.internal;

import X.C09AY;
import X.C19EG;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AwS11S1100100_7 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
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

    public static final Object invoke$0(AwS11S1100100_7 awS11S1100100_7) {
        C19EG activity;
        Intent intent;
        Fragment fragment = (Fragment) awS11S1100100_7.l1;
        if (fragment != null && (activity = fragment.getActivity()) != null && (intent = activity.getIntent()) != null) {
            return intent.putExtra(awS11S1100100_7.s0, awS11S1100100_7.j2);
        }
        return null;
    }

    public static final Object invoke$1(AwS11S1100100_7 awS11S1100100_7) {
        C19EG activity;
        Intent intent;
        Fragment fragment = (Fragment) awS11S1100100_7.l1;
        if (fragment != null && (activity = fragment.getActivity()) != null && (intent = activity.getIntent()) != null) {
            return Long.valueOf(intent.getLongExtra(awS11S1100100_7.s0, awS11S1100100_7.j2));
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S1100100_7(Fragment fragment, int i) {
        super(0);
        this.$t = i;
        this.l1 = fragment;
        this.s0 = "intent_first_enter_room_id";
        this.j2 = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S1100100_7(Fragment fragment, String str, long j, int i) {
        super(0);
        this.$t = i;
        this.l1 = fragment;
        this.s0 = str;
        this.j2 = j;
    }
}
