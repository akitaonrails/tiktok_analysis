package kotlin.jvm.internal;

import X.C09AY;
import X.C1220330hrT;
import X.C1243190iSL;
import X.C1243210iSN;
import X.C1244040iTi;
import X.C1244290iU7;
import X.C1244550iUX;
import X.C14XH;
import X.C1666310tSn;
import X.C1667720tV4;
import X.C1667860tVI;
import X.C1668880tWw;
import X.C1669890tYZ;
import X.C1683080ttq;
import X.C1689210u3j;
import X.C1696320uFC;
import X.C1908810zlv;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1686920u02;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.GSMALoadingSheetFragment;
import com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsActivity;
import com.ss.android.ugc.aweme.account.org.permissions.ManagePageViewModel;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem;
import com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerComposePage;
import com.ss.android.ugc.aweme.setting.page.litemode.LiteModeLearnMorePage;
import com.ss.android.ugc.aweme.setting.page.litemode.LiteModeSwitchPage;
import com.ss.android.ugc.aweme.setting.serverpush.compose.unlogin.PushSettingsUnLoginComposeFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionComposePage;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AwS179S0101000_19 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(int i, Function0 function0, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = function0;
        this.i1 = i;
    }

    public static final Object invoke$0(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1244040iTi.LIZ((Function2) awS179S0101000_19.l0, interfaceC1680500tpg, (awS179S0101000_19.i1 >> 9) & 14);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1244040iTi.LIZ((Function2) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((PushSettingsUnLoginComposeFragment) awS179S0101000_19.l0).MR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C1243210iSN) awS179S0101000_19.l0).LIZ((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((DisplayAndCaptionComposePage) awS179S0101000_19.l0).ZR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue() && obj2 == null) {
            ((C1908810zlv) awS179S0101000_19.l0).LJIILLIIL(awS179S0101000_19.i1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C14XH.LJ((Context) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669890tYZ.LIZJ((C1220330hrT) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669890tYZ.LIZLLL((C1220330hrT) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666310tSn.LIZ((C1668880tWw) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666310tSn.LJ((C1220330hrT) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1696320uFC.LIZIZ((Function0) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((GSMALoadingSheetFragment) awS179S0101000_19.l0).MR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1243190iSL.LIZ((Context) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1244550iUX.LIZ((Context) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1683080ttq.LJII((Function2) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667720tV4.LIZ((Context) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667720tV4.LIZLLL((Context) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((ManageOrgPermissionsActivity) awS179S0101000_19.l0).LLLLLZL((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667860tVI.LIZIZ((ManagePageViewModel) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1244290iU7.LIZJ((AlertToneItem) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1689210u3j.LIZJ((InterfaceC1686920u02) awS179S0101000_19.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((DiskManagerComposePage) awS179S0101000_19.l0).ZR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((LiteModeLearnMorePage) awS179S0101000_19.l0).ZR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS179S0101000_19 awS179S0101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((LiteModeSwitchPage) awS179S0101000_19.l0).ZR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS179S0101000_19.i1 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(int i, Function2 function2, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = function2;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(C1220330hrT c1220330hrT, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1220330hrT;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(C1243210iSN c1243210iSN, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1243210iSN;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(C1668880tWw c1668880tWw, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1668880tWw;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(InterfaceC1686920u02 interfaceC1686920u02, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC1686920u02;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(C1908810zlv c1908810zlv, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1908810zlv;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(Context context, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = context;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(GSMALoadingSheetFragment gSMALoadingSheetFragment, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = gSMALoadingSheetFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(ManageOrgPermissionsActivity manageOrgPermissionsActivity, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = manageOrgPermissionsActivity;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(ManagePageViewModel managePageViewModel, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = managePageViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(AlertToneItem alertToneItem, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = alertToneItem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(DiskManagerComposePage diskManagerComposePage, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = diskManagerComposePage;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(LiteModeLearnMorePage liteModeLearnMorePage, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = liteModeLearnMorePage;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(LiteModeSwitchPage liteModeSwitchPage, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = liteModeSwitchPage;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(PushSettingsUnLoginComposeFragment pushSettingsUnLoginComposeFragment, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = pushSettingsUnLoginComposeFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS179S0101000_19(DisplayAndCaptionComposePage displayAndCaptionComposePage, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = displayAndCaptionComposePage;
        this.i1 = i;
    }
}
