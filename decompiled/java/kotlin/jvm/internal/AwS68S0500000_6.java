package kotlin.jvm.internal;

import X.C09AY;
import X.C0HM1;
import X.C0HM2;
import X.C0HM3;
import X.C0HM5;
import X.C0HML;
import X.C0P0T;
import X.C1388190mED;
import X.C23250099c;
import X.C443090HZb;
import X.C786410Ut5;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.inbox.widget.multi.longclick.IInboxLongPressMenuPopoverHelperImpl;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarAddFlashToCreationExperiment;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS68S0500000_6 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS68S0500000_6 awS68S0500000_6) {
        IInboxLongPressMenuPopoverHelperImpl iInboxLongPressMenuPopoverHelperImpl = (IInboxLongPressMenuPopoverHelperImpl) awS68S0500000_6.l0;
        View view = (View) awS68S0500000_6.l1;
        ImageView imageView = (ImageView) awS68S0500000_6.l2;
        ViewGroup viewGroup = (ViewGroup) awS68S0500000_6.l3;
        iInboxLongPressMenuPopoverHelperImpl.getClass();
        IInboxLongPressMenuPopoverHelperImpl.LIZIZ(view, imageView, viewGroup, false);
        ((C0P0T) awS68S0500000_6.l4).dismiss();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS68S0500000_6 awS68S0500000_6) {
        boolean zBooleanValue;
        IInboxLongPressMenuPopoverHelperImpl iInboxLongPressMenuPopoverHelperImpl = (IInboxLongPressMenuPopoverHelperImpl) awS68S0500000_6.l0;
        View view = (View) awS68S0500000_6.l1;
        ImageView imageView = (ImageView) awS68S0500000_6.l2;
        ViewGroup viewGroup = (ViewGroup) awS68S0500000_6.l3;
        iInboxLongPressMenuPopoverHelperImpl.getClass();
        IInboxLongPressMenuPopoverHelperImpl.LIZIZ(view, imageView, viewGroup, false);
        Function0<Boolean> function0 = ((C443090HZb) awS68S0500000_6.l4).LIZIZ;
        if (function0 != null) {
            zBooleanValue = function0.invoke().booleanValue();
        } else {
            zBooleanValue = true;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$2(AwS68S0500000_6 awS68S0500000_6) {
        Window window;
        Activity activityLIZ = C1388190mED.LIZ(((View) awS68S0500000_6.l0).getContext());
        if (activityLIZ != null) {
            window = activityLIZ.getWindow();
        } else {
            window = null;
        }
        C0HM3 c0hm3 = (C0HM3) awS68S0500000_6.l1;
        C0HM5 c0hm5 = c0hm3.LIZ;
        if ((c0hm5 == C0HM5.FLASH_ON || (c0hm5 == C0HM5.FLASH_AUTO && c0hm3.LIZJ)) && window != null) {
            SocialAvatarAddFlashToCreationExperiment.LIZ.getClass();
            C0HM2 c0hm2 = new C0HM2(((float) ((Number) SocialAvatarAddFlashToCreationExperiment.LJI.getValue()).doubleValue()) * 255.0f);
            View view = (View) awS68S0500000_6.l0;
            C0HML c0hml = new C0HML(view, window, c0hm2);
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setBackgroundColor(-1);
            C786410Ut5.LJZ(0, frameLayout);
            C786410Ut5.U4(frameLayout, 0.0f);
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).addView(frameLayout);
                frameLayout.bringToFront();
            }
            c0hml.LIZLLL = frameLayout;
            C23250099c.LIZLLL((InterfaceC497601wk) awS68S0500000_6.l2, null, null, new C0HM1((SocialAvatarCreationViewModelV2) awS68S0500000_6.l3, c0hml, (Function0) awS68S0500000_6.l4, null), 3);
        } else {
            SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2 = (SocialAvatarCreationViewModelV2) awS68S0500000_6.l3;
            socialAvatarCreationViewModelV2.LLJLLIL = false;
            socialAvatarCreationViewModelV2.EQ2();
            ((Function0) awS68S0500000_6.l4).invoke();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS68S0500000_6 awS68S0500000_6) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = ((View) awS68S0500000_6.l0).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            View view = (View) awS68S0500000_6.l0;
            Integer num = (Integer) awS68S0500000_6.l1;
            Integer num2 = (Integer) awS68S0500000_6.l2;
            Integer num3 = (Integer) awS68S0500000_6.l3;
            Integer num4 = (Integer) awS68S0500000_6.l4;
            if (num != null) {
                marginLayoutParams.leftMargin = num.intValue();
            }
            if (num2 != null) {
                marginLayoutParams.topMargin = num2.intValue();
            }
            if (num3 != null) {
                marginLayoutParams.rightMargin = num3.intValue();
            }
            if (num4 != null) {
                marginLayoutParams.bottomMargin = num4.intValue();
            }
            C786410Ut5.W5(view, marginLayoutParams);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS68S0500000_6(View view, View view2, C0HM3 c0hm3, InterfaceC497601wk interfaceC497601wk, SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = c0hm3;
        this.l3 = interfaceC497601wk;
        this.l4 = socialAvatarCreationViewModelV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S0500000_6(View view, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = num;
        this.l2 = num2;
        this.l3 = num3;
        this.l4 = num4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S0500000_6(IInboxLongPressMenuPopoverHelperImpl iInboxLongPressMenuPopoverHelperImpl, View view, ImageView imageView, ViewGroup viewGroup, C443090HZb c443090HZb, int i) {
        super(0);
        this.$t = i;
        this.l0 = iInboxLongPressMenuPopoverHelperImpl;
        this.l1 = view;
        this.l2 = imageView;
        this.l3 = viewGroup;
        this.l4 = c443090HZb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S0500000_6(IInboxLongPressMenuPopoverHelperImpl iInboxLongPressMenuPopoverHelperImpl, View view, ImageView imageView, ViewGroup viewGroup, C0P0T c0p0t, int i) {
        super(0);
        this.$t = i;
        this.l0 = iInboxLongPressMenuPopoverHelperImpl;
        this.l1 = view;
        this.l2 = imageView;
        this.l3 = viewGroup;
        this.l4 = c0p0t;
    }
}
