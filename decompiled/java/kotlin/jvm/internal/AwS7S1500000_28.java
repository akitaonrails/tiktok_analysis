package kotlin.jvm.internal;

import X.C09AY;
import X.C1402840mbq;
import X.C1B4F;
import X.C2198841B3y;
import X.C580380MpY;
import android.app.Activity;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.openshare.IShareRespSendService;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS7S1500000_28 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS7S1500000_28 awS7S1500000_28, Object obj) {
        String str = awS7S1500000_28.s0;
        C1402840mbq c1402840mbq = (C1402840mbq) awS7S1500000_28.l1;
        String str2 = c1402840mbq.mClientKey;
        String sdkNameForServer = c1402840mbq.getSdkNameForServer();
        C1402840mbq c1402840mbq2 = (C1402840mbq) awS7S1500000_28.l1;
        String str3 = c1402840mbq2.mSdkVersion;
        C1B4F c1b4f = C1B4F.LJIILLIIL;
        C2198841B3y.LIZJ(str, str, str2, sdkNameForServer, str3, c1b4f, c1402840mbq2.mShareMediaType);
        ((IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class)).LIZIZ((Activity) awS7S1500000_28.l2, (C1402840mbq) awS7S1500000_28.l1, c1b4f);
        C580380MpY c580380MpY = (C580380MpY) awS7S1500000_28.l3;
        ShareKitPanel shareKitPanel = (ShareKitPanel) awS7S1500000_28.l4;
        c580380MpY.getClass();
        C580380MpY.LIZJ(false, shareKitPanel);
        Activity activity = (Activity) awS7S1500000_28.l5;
        if (activity != null) {
            activity.finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S1500000_28 awS7S1500000_28, Object obj) {
        ((TTKRegistrationBaseFragment) awS7S1500000_28.l1).yS(awS7S1500000_28.s0, ((PNSAgeConfirmOption) awS7S1500000_28.l3).optionType, (Integer) awS7S1500000_28.l2, ((PNSDialogModel) awS7S1500000_28.l4).styleType);
        ((Function1) awS7S1500000_28.l5).invoke(Integer.valueOf(((PNSAgeConfirmOption) awS7S1500000_28.l3).optionType));
        ((TTKRegistrationBaseFragment) awS7S1500000_28.l1).MR(awS7S1500000_28.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS7S1500000_28 awS7S1500000_28, Object obj) {
        ((TTKRegistrationBaseFragment) awS7S1500000_28.l1).yS(awS7S1500000_28.s0, ((PNSAgeConfirmOption) awS7S1500000_28.l3).optionType, (Integer) awS7S1500000_28.l2, ((PNSDialogModel) awS7S1500000_28.l4).styleType);
        ((Function1) awS7S1500000_28.l5).invoke(Integer.valueOf(((PNSAgeConfirmOption) awS7S1500000_28.l3).optionType));
        ((TTKRegistrationBaseFragment) awS7S1500000_28.l1).MR(awS7S1500000_28.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS7S1500000_28 awS7S1500000_28, Object obj) {
        ((TTKRegistrationBaseFragment) awS7S1500000_28.l1).yS(awS7S1500000_28.s0, ((PNSAgeConfirmOption) awS7S1500000_28.l3).optionType, (Integer) awS7S1500000_28.l2, ((PNSDialogModel) awS7S1500000_28.l4).styleType);
        ((Function1) awS7S1500000_28.l5).invoke(Integer.valueOf(((PNSAgeConfirmOption) awS7S1500000_28.l3).optionType));
        ((TTKRegistrationBaseFragment) awS7S1500000_28.l1).MR(awS7S1500000_28.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS7S1500000_28 awS7S1500000_28, Object obj) {
        ((TTKRegistrationBaseFragment) awS7S1500000_28.l1).yS(awS7S1500000_28.s0, ((PNSAgeConfirmOption) awS7S1500000_28.l3).optionType, (Integer) awS7S1500000_28.l2, ((PNSDialogModel) awS7S1500000_28.l4).styleType);
        ((Function1) awS7S1500000_28.l5).invoke(Integer.valueOf(((PNSAgeConfirmOption) awS7S1500000_28.l3).optionType));
        ((TTKRegistrationBaseFragment) awS7S1500000_28.l1).MR(awS7S1500000_28.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS7S1500000_28(TTKRegistrationBaseFragment tTKRegistrationBaseFragment, TTKRegistrationBaseFragment tTKRegistrationBaseFragment2, String str, Integer num, PNSAgeConfirmOption pNSAgeConfirmOption, PNSDialogModel pNSDialogModel, Function1<? super Integer, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l1 = tTKRegistrationBaseFragment;
        this.s0 = tTKRegistrationBaseFragment2;
        this.l2 = str;
        this.l3 = num;
        this.l4 = pNSAgeConfirmOption;
        this.l5 = pNSDialogModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S1500000_28(String str, C1402840mbq c1402840mbq, Activity activity, C580380MpY c580380MpY, ShareKitPanel shareKitPanel, Activity activity2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1402840mbq;
        this.l2 = activity;
        this.l3 = c580380MpY;
        this.l4 = shareKitPanel;
        this.l5 = activity2;
    }
}
