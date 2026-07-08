package kotlin.jvm.internal;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C09AE;
import X.C09AY;
import X.C0CYL;
import X.C0NKM;
import X.C0OBM;
import X.C0OTS;
import X.C1133910fc5;
import X.C1481290oeN;
import X.C1548820qPI;
import X.C189200o6;
import X.C1EE1;
import X.C2188811AlT;
import X.C606500Nqa;
import X.C606550Nqf;
import X.C621210OYd;
import X.C621270OYj;
import X.C621370OYt;
import X.C624370OeJ;
import X.C625130OfX;
import X.C637380OzI;
import X.EnumC616320OFi;
import X.EnumC625160Ofa;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder;
import com.ss.android.ugc.aweme.notification.banner.InboxBannerWidget;
import com.ss.android.ugc.aweme.notification.banner.protocol.InboxPlatformBannerAssem;
import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeSwitchComponent;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS125S1200000_9 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS125S1200000_9 awS125S1200000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((LivePhotoViewHolder) awS125S1200000_9.l1).hashCode());
        sbLIZ.append(" onPlayFailed sourceId ");
        sbLIZ.append(awS125S1200000_9.s0);
        sbLIZ.append(" error ");
        sbLIZ.append((C1481290oeN) awS125S1200000_9.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS125S1200000_9 awS125S1200000_9) {
        ((InboxBannerCustomAssem) awS125S1200000_9.l1).fo();
        C637380OzI c637380OzI = C637380OzI.LIZ;
        String str = awS125S1200000_9.s0;
        c637380OzI.getClass();
        C637380OzI.LIZ(str, "show", null, false);
        ((InboxBannerWidget) awS125S1200000_9.l2).Oo(awS125S1200000_9.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS125S1200000_9 awS125S1200000_9) {
        Bundle arguments = ((Fragment) awS125S1200000_9.l1).getArguments();
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$6 = null;
        if (arguments != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$6 = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$6(arguments, awS125S1200000_9.s0);
        }
        if (!(objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$6 instanceof String) || objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$6 == null) {
            return awS125S1200000_9.l2;
        }
        return objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$6;
    }

    public static final Object invoke$11(AwS125S1200000_9 awS125S1200000_9) {
        Bundle arguments = ((Fragment) awS125S1200000_9.l1).getArguments();
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$7 = null;
        if (arguments != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$7 = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$7(arguments, awS125S1200000_9.s0);
        }
        if (!(objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$7 instanceof AddYoursTopic) || objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$7 == null) {
            return awS125S1200000_9.l2;
        }
        return objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$7;
    }

    public static final Object invoke$12(AwS125S1200000_9 awS125S1200000_9) {
        Bundle arguments = ((Fragment) awS125S1200000_9.l1).getArguments();
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$8 = null;
        if (arguments != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$8 = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$8(arguments, awS125S1200000_9.s0);
        }
        if (!(objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$8 instanceof String) || objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$8 == null) {
            return awS125S1200000_9.l2;
        }
        return objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$8;
    }

    public static final Object invoke$13(AwS125S1200000_9 awS125S1200000_9) {
        Bundle arguments = ((Fragment) awS125S1200000_9.l1).getArguments();
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$9 = null;
        if (arguments != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$9 = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$9(arguments, awS125S1200000_9.s0);
        }
        if (!(objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$9 instanceof Aweme) || objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$9 == null) {
            return awS125S1200000_9.l2;
        }
        return objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$9;
    }

    public static final Object invoke$14(AwS125S1200000_9 awS125S1200000_9) {
        Bundle arguments = ((Fragment) awS125S1200000_9.l1).getArguments();
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$5_com_ss_android_ugc_aweme_lancet_IntentLancet_get$10 = null;
        if (arguments != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$5_com_ss_android_ugc_aweme_lancet_IntentLancet_get$10 = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$5_com_ss_android_ugc_aweme_lancet_IntentLancet_get$10(arguments, awS125S1200000_9.s0);
        }
        if (!(objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$5_com_ss_android_ugc_aweme_lancet_IntentLancet_get$10 instanceof Integer) || objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$5_com_ss_android_ugc_aweme_lancet_IntentLancet_get$10 == null) {
            return awS125S1200000_9.l2;
        }
        return objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$5_com_ss_android_ugc_aweme_lancet_IntentLancet_get$10;
    }

    public static final Object invoke$15(AwS125S1200000_9 awS125S1200000_9) {
        Bundle arguments = ((Fragment) awS125S1200000_9.l1).getArguments();
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$6_com_ss_android_ugc_aweme_lancet_IntentLancet_get$11 = null;
        if (arguments != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$6_com_ss_android_ugc_aweme_lancet_IntentLancet_get$11 = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$6_com_ss_android_ugc_aweme_lancet_IntentLancet_get$11(arguments, awS125S1200000_9.s0);
        }
        if (!(objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$6_com_ss_android_ugc_aweme_lancet_IntentLancet_get$11 instanceof AddYoursAvatar[]) || objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$6_com_ss_android_ugc_aweme_lancet_IntentLancet_get$11 == null) {
            return awS125S1200000_9.l2;
        }
        return objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$6_com_ss_android_ugc_aweme_lancet_IntentLancet_get$11;
    }

    public static final Object invoke$16(AwS125S1200000_9 awS125S1200000_9) {
        Bundle arguments = ((Fragment) awS125S1200000_9.l1).getArguments();
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$7_com_ss_android_ugc_aweme_lancet_IntentLancet_get$12 = null;
        if (arguments != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$7_com_ss_android_ugc_aweme_lancet_IntentLancet_get$12 = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$7_com_ss_android_ugc_aweme_lancet_IntentLancet_get$12(arguments, awS125S1200000_9.s0);
        }
        if (!(objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$7_com_ss_android_ugc_aweme_lancet_IntentLancet_get$12 instanceof String) || objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$7_com_ss_android_ugc_aweme_lancet_IntentLancet_get$12 == null) {
            return awS125S1200000_9.l2;
        }
        return objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$7_com_ss_android_ugc_aweme_lancet_IntentLancet_get$12;
    }

    public static final Object invoke$17(AwS125S1200000_9 awS125S1200000_9) {
        Object c098200Yq;
        try {
            ((Function1) awS125S1200000_9.l1).invoke(awS125S1200000_9.l2);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str = awS125S1200000_9.s0;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("main callback failed: ");
            sbLIZ.append(str);
            C1133910fc5.LIZJ("GiftMessageScheduling", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS125S1200000_9 awS125S1200000_9) {
        Float f;
        String string;
        String string2;
        C621210OYd c621210OYd = (C621210OYd) awS125S1200000_9.l1;
        BulletinVoiceItem bulletinVoiceItem = (BulletinVoiceItem) awS125S1200000_9.l2;
        c621210OYd.getClass();
        Long l = bulletinVoiceItem.LLJJIJI;
        if (l != null && (string2 = l.toString()) != null) {
            BulletinListViewModel.OQ2(c621210OYd.LJ, string2, "voice", bulletinVoiceItem, bulletinVoiceItem.LLJL, null, "drag", null, null, 208);
        }
        C621210OYd c621210OYd2 = (C621210OYd) awS125S1200000_9.l1;
        String str = awS125S1200000_9.s0;
        BulletinVoiceItem bulletinVoiceItem2 = (BulletinVoiceItem) awS125S1200000_9.l2;
        C621370OYt c621370OYtLJIIJ = c621210OYd2.LJIIJ();
        if (c621370OYtLJIIJ != null && !c621370OYtLJIIJ.LIZIZ(str) && (f = c621210OYd2.LJJIIJ) != null) {
            float fFloatValue = f.floatValue();
            BulletinCommonAbility bulletinCommonAbility = c621210OYd2.LIZIZ;
            if (bulletinCommonAbility != null && (string = Long.valueOf(bulletinCommonAbility.Og2()).toString()) != null) {
                long j = bulletinVoiceItem2.LLJI;
                long j2 = (long) (j * fFloatValue);
                if (j2 < 0) {
                    j2 = 0;
                }
                int i = (int) j2;
                if (i <= 0) {
                    C621270OYj.LIZ(string, str);
                } else {
                    C621270OYj.LIZIZ(i, (int) j, string, str);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS125S1200000_9 awS125S1200000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS125S1200000_9.s0);
        sbLIZ.append(" failed ");
        sbLIZ.append(((C606500Nqa) awS125S1200000_9.l1).LIZ);
        sbLIZ.append(' ');
        sbLIZ.append(((C606550Nqf) awS125S1200000_9.l2).LIZ);
        sbLIZ.append(' ');
        sbLIZ.append(((C606550Nqf) awS125S1200000_9.l2).LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS125S1200000_9 awS125S1200000_9) {
        ((InboxBannerAssem) awS125S1200000_9.l1).fo();
        C637380OzI c637380OzI = C637380OzI.LIZ;
        String str = awS125S1200000_9.s0;
        c637380OzI.getClass();
        C637380OzI.LIZ(str, "show", null, true);
        if (C0CYL.LIZJ.LJIIIIZZ() && (((InboxBannerAssem) awS125S1200000_9.l1) instanceof InboxPlatformBannerAssem)) {
            C624370OeJ.LIZIZ("InboxBannerWidget", "skip client frequency record as platform banner");
        } else {
            ((InboxBannerWidget) awS125S1200000_9.l2).Oo(awS125S1200000_9.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS125S1200000_9 awS125S1200000_9) {
        BulletinCommentActionViewModel bulletinCommentActionViewModel = (BulletinCommentActionViewModel) awS125S1200000_9.l1;
        String str = awS125S1200000_9.s0;
        bulletinCommentActionViewModel.getClass();
        bulletinCommentActionViewModel.setState(new AwS60S1000000_9(str, 17));
        ((BulletinCommentActionViewModel) awS125S1200000_9.l1).setState(new AwS588S0100000_9((C0OTS) awS125S1200000_9.l2, 650));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS125S1200000_9 awS125S1200000_9) {
        C1548820qPI.LJIIIIZZ(awS125S1200000_9.s0, (C0OBM) awS125S1200000_9.l1);
        ((C09AE) awS125S1200000_9.l2).LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS125S1200000_9 awS125S1200000_9) {
        OfflineModeSwitchComponent offlineModeSwitchComponent = (OfflineModeSwitchComponent) awS125S1200000_9.l1;
        String str = awS125S1200000_9.s0;
        EnumC625160Ofa enumC625160Ofa = (EnumC625160Ofa) awS125S1200000_9.l2;
        if (offlineModeSwitchComponent.getContext() != null) {
            OfflineModeSwitchComponent.LLJLLIL.LIZ("enterOfflineModePage", null);
            C625130OfX.LJ(C625130OfX.LIZ, "click_offline_mode_toast", str, null, null, null, null, null, null, null, null, null, null, null, null, null, enumC625160Ofa.getMobName(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32772, 131071);
            C1EE1.LIZIZ.LJJJJIZL(offlineModeSwitchComponent.getContext(), "click_toast", str, false, EnumC616320OFi.OFFLINE_MODE_PANEL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS125S1200000_9 awS125S1200000_9) {
        Bundle arguments = ((Fragment) awS125S1200000_9.l1).getArguments();
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursDetailAwemeListFragment$special$$inlined$casArgNullable$default$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$0 = null;
        if (arguments != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursDetailAwemeListFragment$special$$inlined$casArgNullable$default$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$0 = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursDetailAwemeListFragment$special$$inlined$casArgNullable$default$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$0(arguments, awS125S1200000_9.s0);
        }
        if (!(objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursDetailAwemeListFragment$special$$inlined$casArgNullable$default$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$0 instanceof Aweme) || objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursDetailAwemeListFragment$special$$inlined$casArgNullable$default$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$0 == null) {
            return awS125S1200000_9.l2;
        }
        return objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursDetailAwemeListFragment$special$$inlined$casArgNullable$default$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$0;
    }

    public static final Object invoke$5(AwS125S1200000_9 awS125S1200000_9) {
        Bundle arguments = ((Fragment) awS125S1200000_9.l1).getArguments();
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursDetailAwemeListFragment$special$$inlined$casArgNullable$default$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$1 = null;
        if (arguments != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursDetailAwemeListFragment$special$$inlined$casArgNullable$default$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$1 = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursDetailAwemeListFragment$special$$inlined$casArgNullable$default$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$1(arguments, awS125S1200000_9.s0);
        }
        if (!(objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursDetailAwemeListFragment$special$$inlined$casArgNullable$default$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$1 instanceof String) || objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursDetailAwemeListFragment$special$$inlined$casArgNullable$default$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$1 == null) {
            return awS125S1200000_9.l2;
        }
        return objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursDetailAwemeListFragment$special$$inlined$casArgNullable$default$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$1;
    }

    public static final Object invoke$6(AwS125S1200000_9 awS125S1200000_9) {
        Bundle arguments = ((Fragment) awS125S1200000_9.l1).getArguments();
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$2 = null;
        if (arguments != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$2 = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$2(arguments, awS125S1200000_9.s0);
        }
        if ((!(objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$2 instanceof String) || objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$2 == null) && (objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$2 = awS125S1200000_9.l2) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("value for ");
            sbLIZ.append(awS125S1200000_9.s0);
            sbLIZ.append(" is null or not instance of ");
            sbLIZ.append(String.class);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$2;
    }

    public static final Object invoke$7(AwS125S1200000_9 awS125S1200000_9) {
        Bundle arguments = ((Fragment) awS125S1200000_9.l1).getArguments();
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$3 = null;
        if (arguments != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$3 = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$3(arguments, awS125S1200000_9.s0);
        }
        if ((!(objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$3 instanceof Integer) || objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$3 == null) && (objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$3 = awS125S1200000_9.l2) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("value for ");
            sbLIZ.append(awS125S1200000_9.s0);
            sbLIZ.append(" is null or not instance of ");
            sbLIZ.append(Integer.class);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$3;
    }

    public static final Object invoke$8(AwS125S1200000_9 awS125S1200000_9) {
        Bundle arguments = ((Fragment) awS125S1200000_9.l1).getArguments();
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$4 = null;
        if (arguments != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$4 = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$4(arguments, awS125S1200000_9.s0);
        }
        if ((!(objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$4 instanceof String) || objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$4 == null) && (objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$4 = awS125S1200000_9.l2) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("value for ");
            sbLIZ.append(awS125S1200000_9.s0);
            sbLIZ.append(" is null or not instance of ");
            sbLIZ.append(String.class);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$4;
    }

    public static final Object invoke$9(AwS125S1200000_9 awS125S1200000_9) {
        Bundle arguments = ((Fragment) awS125S1200000_9.l1).getArguments();
        Object objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$5 = null;
        if (arguments != null) {
            objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$5 = INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$5(arguments, awS125S1200000_9.s0);
        }
        if ((!(objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$5 instanceof Boolean) || objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$5 == null) && (objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$5 = awS125S1200000_9.l2) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("value for ");
            sbLIZ.append(awS125S1200000_9.s0);
            sbLIZ.append(" is null or not instance of ");
            sbLIZ.append(Boolean.class);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return objINVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$5;
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursDetailAwemeListFragment$special$$inlined$casArgNullable$default$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$0(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursDetailAwemeListFragment$special$$inlined$casArgNullable$default$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$1(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$2(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$3(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$4(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArg$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$5(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$1_com_ss_android_ugc_aweme_lancet_IntentLancet_get$6(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$2_com_ss_android_ugc_aweme_lancet_IntentLancet_get$7(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get$8(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get$9(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$5_com_ss_android_ugc_aweme_lancet_IntentLancet_get$10(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$6_com_ss_android_ugc_aweme_lancet_IntentLancet_get$11(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_addyours_ui_fragment_AddYoursTopicDetailFragment$special$$inlined$casArgNullable$default$7_com_ss_android_ugc_aweme_lancet_IntentLancet_get$12(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1200000_9(Fragment fragment, String str, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l1 = fragment;
        this.s0 = str;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1200000_9(InboxBannerAssem inboxBannerAssem, String str, InboxBannerWidget inboxBannerWidget, int i) {
        super(0);
        this.$t = i;
        this.l1 = inboxBannerAssem;
        this.s0 = str;
        this.l2 = inboxBannerWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1200000_9(InboxBannerCustomAssem inboxBannerCustomAssem, String str, InboxBannerWidget inboxBannerWidget, int i) {
        super(0);
        this.$t = i;
        this.l1 = inboxBannerCustomAssem;
        this.s0 = str;
        this.l2 = inboxBannerWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1200000_9(BulletinCommentActionViewModel bulletinCommentActionViewModel, String str, C0OTS c0ots, int i) {
        super(0);
        this.$t = i;
        this.l1 = bulletinCommentActionViewModel;
        this.s0 = str;
        this.l2 = c0ots;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1200000_9(BulletinVoiceItem bulletinVoiceItem, C621210OYd c621210OYd, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c621210OYd;
        this.l2 = bulletinVoiceItem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1200000_9(LivePhotoViewHolder livePhotoViewHolder, String str, C1481290oeN c1481290oeN, int i) {
        super(0);
        this.$t = i;
        this.l1 = livePhotoViewHolder;
        this.s0 = str;
        this.l2 = c1481290oeN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1200000_9(OfflineModeSwitchComponent offlineModeSwitchComponent, String str, EnumC625160Ofa enumC625160Ofa, int i) {
        super(0);
        this.$t = i;
        this.l1 = offlineModeSwitchComponent;
        this.s0 = str;
        this.l2 = enumC625160Ofa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1200000_9(String str, C606500Nqa c606500Nqa, C606550Nqf c606550Nqf, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c606500Nqa;
        this.l2 = c606550Nqf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1200000_9(String str, C0OBM c0obm, AnonymousClass0956 anonymousClass0956, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0obm;
        this.l2 = anonymousClass0956;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS125S1200000_9(C0NKM c0nkm, C0NKM c0nkm2, Function1<Object, Unit> function1, Object obj, String str) {
        super(0);
        this.$t = str;
        this.l1 = c0nkm2;
        this.l2 = function1;
        this.s0 = obj;
    }
}
