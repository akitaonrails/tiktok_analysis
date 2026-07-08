package kotlin.jvm.internal;

import X.C05YD;
import X.C09AY;
import X.C0HQ4;
import X.C0HSD;
import X.C0HV9;
import X.C0I0B;
import X.C0IBF;
import X.C0SZ4;
import X.C0ZDT;
import X.C0ZL0;
import X.C0ZQI;
import X.C1163440gNi;
import X.C128Y;
import X.C1388190mED;
import X.C13IQ;
import X.C1629106Zl;
import X.C1640006bW;
import X.C19EG;
import X.C2252321DDq;
import X.C342990DcX;
import X.C434130H0p;
import X.C441610HTj;
import X.C459010HzH;
import X.C461720I8s;
import X.C869590Y9l;
import X.C896410ZEp;
import X.C912070ZqH;
import X.EnumC1489905sP;
import X.EnumC441640HTm;
import X.InterfaceC1175904ir;
import X.InterfaceC332260D0u;
import X.InterfaceC457860HxQ;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IQuickChatRoomSheetFactory;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageStudioApi;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.service.IIMMediaCreativeService;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS0S0700000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C19EG c19egLIZIZ;
        String conversationId;
        List<String> list;
        Context context = ((UIAssem) awS0S0700000_6.l0).getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            MixStudioLauncher mixStudioLauncher = (MixStudioLauncher) awS0S0700000_6.l3;
            SessionInfo sessionInfo = (SessionInfo) awS0S0700000_6.l4;
            IInputFieldAbility iInputFieldAbility = (IInputFieldAbility) awS0S0700000_6.l5;
            InterfaceC332260D0u interfaceC332260D0u = (InterfaceC332260D0u) awS0S0700000_6.l6;
            if (mixStudioLauncher != null) {
                String conversationId2 = sessionInfo.getConversationId();
                EnumC441640HTm enumC441640HTm = EnumC441640HTm.TYPING_BOX;
                String str = null;
                MixStudioLauncher.PrefillInfo prefillInfo = new MixStudioLauncher.PrefillInfo(((C1640006bW) iInputFieldAbility.Kv().getValue()).LIZIZ, (Emoji) null, 6);
                if (sessionInfo.isGroupChat()) {
                    conversationId = sessionInfo.getConversationId();
                } else {
                    conversationId = null;
                }
                C441610HTj c441610HTj = new C441610HTj(prefillInfo, false, new MixStudioLauncher.PushInfo(null, sessionInfo.getSingleChatFromUserId(), conversationId));
                FriendsIDInfo friendsIDInfo = ((C434130H0p) interfaceC332260D0u.getValue()).LIZIZ;
                C0HQ4 c0hq4 = MixStudioLauncher.IdAndElementConfiguration.Companion;
                String strLIZIZ = C461720I8s.LIZIZ();
                FriendsIDInfo friendsIDInfo2 = ((C434130H0p) interfaceC332260D0u.getValue()).LIZIZ;
                if (friendsIDInfo2 != null) {
                    list = friendsIDInfo2.friendUidList;
                } else {
                    list = null;
                }
                c0hq4.getClass();
                List listLIZ = C0HQ4.LIZ(strLIZIZ, list);
                FriendsIDInfo friendsIDInfo3 = ((C434130H0p) interfaceC332260D0u.getValue()).LIZIZ;
                if (friendsIDInfo3 != null) {
                    str = friendsIDInfo3.defaultFriendUid;
                }
                mixStudioLauncher.LIZIZ(c19egLIZIZ, conversationId2, enumC441640HTm, c441610HTj, C0HSD.DEFAULT, friendsIDInfo, null, null, "chat", new MixStudioLauncher.IdAndElementConfiguration(listLIZ, new MixStudioLauncher.DefaultIdConfig(str, 0, 0, 8), new MixStudioLauncher.DefaultElementConfig(((C1640006bW) iInputFieldAbility.Kv().getValue()).LIZIZ, null, null, null, null, 30)), new MixStudioLauncher.GenerationConfiguration(false, false));
            }
        }
        ((IEmojiBtnAbility) awS0S0700000_6.l1).fh0(false);
        MixStudioEntranceControl mixStudioEntranceControl = (MixStudioEntranceControl) awS0S0700000_6.l2;
        if (mixStudioEntranceControl != null) {
            mixStudioEntranceControl.LJIIJ();
        }
        IMImageStudioApi.LIZ.getClass();
        IMImageStudioApi iMImageStudioApiLIZ = C342990DcX.LIZ();
        if (iMImageStudioApiLIZ != null) {
            iMImageStudioApiLIZ.LIZ(EnumC1489905sP.MIX_STUDIO_NEW, "click");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$19(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$20(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$22(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$24(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$25(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$26(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$27(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$28(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$29(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        SessionInfo sessionInfo;
        C0IBF c0ibf;
        String displayName;
        Boolean boolValueOf;
        InterfaceC457860HxQ interfaceC457860HxQ;
        if (((Activity) awS0S0700000_6.l0) != null && ((Fragment) awS0S0700000_6.l1) != null && (sessionInfo = (SessionInfo) awS0S0700000_6.l2) != null && (c0ibf = (C0IBF) awS0S0700000_6.l3) != null) {
            PanelStateViewModel panelStateViewModel = (PanelStateViewModel) awS0S0700000_6.l4;
            panelStateViewModel.jt(C1629106Zl.LL, panelStateViewModel.Ke().getValue().intValue());
            C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
            c912070ZqH.LJFF().LJII((SessionInfo) awS0S0700000_6.l2, c0ibf, "quick_live_react", null, null, null, "message_long_press", null, null, null, false, C0I0B.LJFF.LIZIZ());
            C128Y c128y = (Fragment) awS0S0700000_6.l1;
            if ((c128y instanceof InterfaceC457860HxQ) && (interfaceC457860HxQ = (InterfaceC457860HxQ) c128y) != null) {
                interfaceC457860HxQ.ok(null);
            }
            IIMMediaCreativeService iIMMediaCreativeServiceLJIILIIL = c912070ZqH.LJIILIIL();
            String conversationId = sessionInfo.getConversationId();
            int chatType = sessionInfo.getChatType();
            String singleChatFromUserId = sessionInfo.getSingleChatFromUserId();
            if (singleChatFromUserId == null) {
                singleChatFromUserId = "";
            }
            IMUser singleChatFromUser = ((SessionInfo) awS0S0700000_6.l2).getSingleChatFromUser();
            if (singleChatFromUser != null) {
                displayName = singleChatFromUser.getDisplayName();
            } else {
                displayName = null;
            }
            C896410ZEp c896410ZEp = QuoteMode.Companion;
            C0ZDT c0zdt = C0ZDT.LIZ;
            C869590Y9l c869590Y9l = (C869590Y9l) awS0S0700000_6.l5;
            c0zdt.getClass();
            ReferenceInfo referenceInfoLJII = C0ZDT.LJII(c869590Y9l);
            c896410ZEp.getClass();
            QuoteMode quoteModeLIZ = C896410ZEp.LIZ(referenceInfoLJII);
            IQuickChatRoomSheetFactory iQuickChatRoomSheetFactory = (IQuickChatRoomSheetFactory) PluggableExtentionKt.pluggableSpiForReal(IQuickChatRoomSheetFactory.class);
            if (iQuickChatRoomSheetFactory != null) {
                boolValueOf = Boolean.valueOf(iQuickChatRoomSheetFactory.LIZJ((Fragment) awS0S0700000_6.l1));
            } else {
                boolValueOf = null;
            }
            iIMMediaCreativeServiceLJIILIIL.LJIIIIZZ((Activity) awS0S0700000_6.l0, conversationId, chatType, singleChatFromUserId, displayName, "chat", null, null, "quick_live_react", null, null, false, null, null, null, null, false, null, "message_long_press", boolValueOf, true, true, true, quoteModeLIZ, null, null);
            ((C0ZQI) awS0S0700000_6.l6).LJ(C0ZL0.QUICK_LIVE_REACT, null);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS0S0700000_6 awS0S0700000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS0S0700000_6.l0;
        c0sz4.LLILLJJLI = C459010HzH.LIZ((UIAssem) awS0S0700000_6.l1);
        c0sz4.LLJIJIL = (C1163440gNi) awS0S0700000_6.l2;
        c0sz4.LJ((C05YD) awS0S0700000_6.l3, "UI_STATE");
        c0sz4.LJ((InterfaceC1175904ir) awS0S0700000_6.l4, "ACTION");
        C0HV9 c0hv9 = (C0HV9) awS0S0700000_6.l5;
        if (c0hv9 != null) {
            c0sz4.LJ(c0hv9, "TRACK_PERF_KEY");
        }
        Function2 function2 = (Function2) awS0S0700000_6.l6;
        if (function2 != null) {
            c0sz4.LJ(function2, "VIEW_CONFIG");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0700000_6(C13IQ c13iq, UIAssem uIAssem, C1163440gNi c1163440gNi, C05YD c05yd, InterfaceC1175904ir interfaceC1175904ir, C0HV9 c0hv9, Function2 function2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c13iq;
        this.l1 = uIAssem;
        this.l2 = c1163440gNi;
        this.l3 = c05yd;
        this.l4 = interfaceC1175904ir;
        this.l5 = c0hv9;
        this.l6 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0700000_6(Activity activity, Fragment fragment, C869590Y9l c869590Y9l, SessionInfo sessionInfo, C0IBF c0ibf, C0ZQI c0zqi, PanelStateViewModel panelStateViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = fragment;
        this.l2 = sessionInfo;
        this.l3 = c0ibf;
        this.l4 = panelStateViewModel;
        this.l5 = c869590Y9l;
        this.l6 = c0zqi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0700000_6(UIAssem uIAssem, IEmojiBtnAbility iEmojiBtnAbility, MixStudioEntranceControl mixStudioEntranceControl, MixStudioLauncher mixStudioLauncher, SessionInfo sessionInfo, IInputFieldAbility iInputFieldAbility, C2252321DDq c2252321DDq, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = iEmojiBtnAbility;
        this.l2 = mixStudioEntranceControl;
        this.l3 = mixStudioLauncher;
        this.l4 = sessionInfo;
        this.l5 = iInputFieldAbility;
        this.l6 = c2252321DDq;
    }
}
