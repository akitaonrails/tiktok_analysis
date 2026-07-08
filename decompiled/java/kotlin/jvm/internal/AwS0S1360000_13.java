package kotlin.jvm.internal;

import X.C09AY;
import android.app.Activity;
import com.ss.android.ugc.aweme.unifiedauth.manager.PushSystemPopupManager;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS0S1360000_13 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;
    public boolean z5;
    public boolean z6;
    public boolean z7;
    public boolean z8;
    public boolean z9;

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

    public static final Object invoke$0(AwS0S1360000_13 awS0S1360000_13, Object obj) {
        ((PushSystemPopupManager) awS0S1360000_13.l1).LJFF((Activity) awS0S1360000_13.l2, awS0S1360000_13.z4, awS0S1360000_13.z5, awS0S1360000_13.z6, awS0S1360000_13.z7, awS0S1360000_13.s0, awS0S1360000_13.z8, awS0S1360000_13.z9, (Function1) awS0S1360000_13.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1360000_13 awS0S1360000_13, Object obj) {
        ((PushPermissionPopupManager) awS0S1360000_13.l1).LJIJJ((Activity) awS0S1360000_13.l2, awS0S1360000_13.z4, awS0S1360000_13.z5, awS0S1360000_13.z6, awS0S1360000_13.z7, awS0S1360000_13.s0, awS0S1360000_13.z8, awS0S1360000_13.z9, (Function1) awS0S1360000_13.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1360000_13(PushSystemPopupManager pushSystemPopupManager, PushSystemPopupManager pushSystemPopupManager2, Activity activity, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l1 = pushSystemPopupManager;
        this.l2 = pushSystemPopupManager2;
        this.z4 = activity;
        this.z5 = z;
        this.z6 = z2;
        this.z7 = z3;
        this.s0 = z4;
        this.z8 = str;
        this.z9 = z5;
        this.l3 = z6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1360000_13(PushPermissionPopupManager pushPermissionPopupManager, PushPermissionPopupManager pushPermissionPopupManager2, Activity activity, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l1 = pushPermissionPopupManager;
        this.l2 = pushPermissionPopupManager2;
        this.z4 = activity;
        this.z5 = z;
        this.z6 = z2;
        this.z7 = z3;
        this.s0 = z4;
        this.z8 = str;
        this.z9 = z5;
        this.l3 = z6;
    }
}
