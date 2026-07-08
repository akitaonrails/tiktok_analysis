package kotlin.jvm.internal;

import X.AbstractActivityC19422710yn;
import X.C09AY;
import X.C0C64;
import X.C0L9U;
import X.C1397620mTQ;
import X.C13X2;
import X.C21390618nQ;
import X.C560490LyZ;
import X.C569760MWg;
import X.C786410Ut5;
import X.C799520VXy;
import X.InterfaceC20622815ms;
import X.InterfaceC214897198d;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.services.mediaselector.InternalMediaSelectorServiceImpl$showEditorProReplacePopup$1$1;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerPageScene;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS9S0300100_8 extends C09AY implements Function1 {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS9S0300100_8 awS9S0300100_8, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Activity) awS9S0300100_8.l0).getResources().getString(2131833949), new InternalMediaSelectorServiceImpl$showEditorProReplacePopup$1$1((Function0) awS9S0300100_8.l2, (Bundle) awS9S0300100_8.l1, awS9S0300100_8.j3));
        c1397620mTQ.LIZJ(1, ((Activity) awS9S0300100_8.l0).getResources().getString(2131833948), new AwS45S0100100_8((Bundle) awS9S0300100_8.l1, awS9S0300100_8.j3, 0));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS9S0300100_8 awS9S0300100_8, Object obj) {
        InterfaceC20622815ms interfaceC20622815ms;
        Bundle bundle = (Bundle) obj;
        Activity activity = (Activity) awS9S0300100_8.l0;
        EnterStoryParam enterStoryParam = (EnterStoryParam) awS9S0300100_8.l1;
        long j = awS9S0300100_8.j3;
        C0L9U c0l9u = (C0L9U) awS9S0300100_8.l2;
        new Object() { // from class: X.0Lyb
        }.getClass();
        boolean z = false;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "social_media_picker_saf", true) == 1) {
            if (enterStoryParam.isFromSocialCameraEntrance() && (activity instanceof AbstractActivityC19422710yn)) {
                ((BaseActivity) activity).finish();
            } else {
                Boolean boolValueOf = null;
                if ((activity instanceof InterfaceC214897198d) && (interfaceC20622815ms = (InterfaceC20622815ms) activity) != null) {
                    NavigationScene navigationScene = interfaceC20622815ms.getNavigationScene();
                    if (navigationScene != null) {
                        SocialMediaPickerPageScene socialMediaPickerPageScene = new SocialMediaPickerPageScene();
                        Pair[] pairArr = new Pair[5];
                        pairArr[0] = new Pair("story_param", enterStoryParam);
                        pairArr[1] = new Pair("enter_activity_time", Long.valueOf(SystemClock.elapsedRealtime()));
                        pairArr[2] = new Pair("click_entry_time", Long.valueOf(j));
                        pairArr[3] = new Pair("key_choose_request_code", 1);
                        if (c0l9u == C0L9U.GRANTED_BEFORE_REQUEST) {
                            z = true;
                        }
                        pairArr[4] = new Pair("has_permission_before", Boolean.valueOf(z));
                        C786410Ut5.LJJIIJZLJL(bundle, C799520VXy.LIZ(pairArr));
                        socialMediaPickerPageScene.mArguments = bundle;
                        socialMediaPickerPageScene.disableSupportRestore();
                        C569760MWg c569760MWg = new C569760MWg();
                        c569760MWg.LIZ = true;
                        c569760MWg.LJ = true;
                        c569760MWg.LJFF = true;
                        c569760MWg.LIZJ = new C21390618nQ();
                        c569760MWg.LJIILIIL = new C13X2() { // from class: X.0Lya
                            @Override // X.C13X2
                            public final boolean LIZ(InterfaceC214942199w interfaceC214942199w) {
                                return false;
                            }
                        };
                        navigationScene.LLLLLLLLLL(socialMediaPickerPageScene, c569760MWg.LIZ());
                        z = true;
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    C560490LyZ.LIZ(activity, bundle, enterStoryParam, j, c0l9u);
                }
            }
        } else {
            C560490LyZ.LIZ(activity, bundle, enterStoryParam, j, c0l9u);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0300100_8(Activity activity, EnterStoryParam enterStoryParam, long j, C0L9U c0l9u, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = enterStoryParam;
        this.j3 = j;
        this.l2 = c0l9u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0000: IPUT (r8 I:int), (r2 I:kotlin.jvm.internal.AwS9S0300100_8) (LINE:83951616) kotlin.jvm.internal.AwS9S0300100_8.$t int, block:B:2:0x0000 */
    public AwS9S0300100_8(Activity activity, Activity activity2, Function0<Unit> function0, Bundle bundle, long j) {
        int i;
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l2 = activity2;
        this.l1 = function0;
        this.j3 = bundle;
    }
}
