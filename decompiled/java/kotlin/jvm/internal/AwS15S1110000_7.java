package kotlin.jvm.internal;

import X.C09AY;
import X.C1388190mED;
import X.C19EG;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AwS15S1110000_7 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AwS15S1110000_7 awS15S1110000_7) {
        C19EG activity;
        Intent intent;
        Fragment fragment = (Fragment) awS15S1110000_7.l1;
        if (fragment != null && (activity = fragment.getActivity()) != null && (intent = activity.getIntent()) != null) {
            return Boolean.valueOf(intent.getBooleanExtra(awS15S1110000_7.s0, awS15S1110000_7.z2));
        }
        return null;
    }

    public static final Object invoke$1(AwS15S1110000_7 awS15S1110000_7) {
        C19EG activity;
        Intent intent;
        Fragment fragment = (Fragment) awS15S1110000_7.l1;
        if (fragment != null && (activity = fragment.getActivity()) != null && (intent = activity.getIntent()) != null) {
            return intent.putExtra(awS15S1110000_7.s0, awS15S1110000_7.z2);
        }
        return null;
    }

    public static final Object invoke$2(AwS15S1110000_7 awS15S1110000_7) {
        Context context;
        Activity activityLIZ;
        Intent intent;
        View view = (View) awS15S1110000_7.l1;
        if (view != null && (context = view.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (intent = activityLIZ.getIntent()) != null) {
            return intent.putExtra(awS15S1110000_7.s0, awS15S1110000_7.z2);
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S1110000_7(View view, int i) {
        super(0);
        this.$t = i;
        this.l1 = view;
        this.s0 = "intent_exit_and_swipe_feed";
        this.z2 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S1110000_7(Fragment fragment, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = fragment;
        this.s0 = str;
        this.z2 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S1110000_7(Fragment fragment, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = fragment;
        this.s0 = str;
        this.z2 = z;
    }
}
