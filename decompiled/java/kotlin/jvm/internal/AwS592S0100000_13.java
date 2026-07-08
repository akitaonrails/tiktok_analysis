package kotlin.jvm.internal;

import X.AbstractC794590VEz;
import X.AbstractC848400XPy;
import X.C04UH;
import X.C06W2;
import X.C09AE;
import X.C09AY;
import X.C0C64;
import X.C0C9H;
import X.C0CXX;
import X.C0PMC;
import X.C0S78;
import X.C0VGA;
import X.C0WL6;
import X.C0WMB;
import X.C0WNH;
import X.C0WQ8;
import X.C0WR6;
import X.C0WR8;
import X.C0WS3;
import X.C0WXO;
import X.C0WZX;
import X.C0X4N;
import X.C0X4Q;
import X.C0X52;
import X.C0X9S;
import X.C0XFF;
import X.C0XFO;
import X.C0XFX;
import X.C0XFY;
import X.C0XFZ;
import X.C0XG3;
import X.C0XGR;
import X.C0XO3;
import X.C0XQ5;
import X.C0XQ7;
import X.C0XQZ;
import X.C0XT2;
import X.C0XT7;
import X.C0XVX;
import X.C0XWJ;
import X.C0XXB;
import X.C0XZJ;
import X.C1122004aA;
import X.C1233960iDS;
import X.C1237330iIt;
import X.C134N;
import X.C1397620mTQ;
import X.C1397630mTR;
import X.C1397660mTU;
import X.C13LE;
import X.C13LP;
import X.C1532790pzR;
import X.C1533790q13;
import X.C1669720tYI;
import X.C1701330uNH;
import X.C1797760wso;
import X.C189200o6;
import X.C1909107dp;
import X.C1950607kW;
import X.C197039127h;
import X.C19EG;
import X.C1DFK;
import X.C20301314c7;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2252611DEt;
import X.C2344009Gk;
import X.C2382909Vj;
import X.C2404209bU;
import X.C259800zU;
import X.C308480C7i;
import X.C309790CCj;
import X.C312130CLj;
import X.C500260Jjc;
import X.C583860MvA;
import X.C691040R8s;
import X.C786410Ut5;
import X.C805010Vhz;
import X.C807160VlS;
import X.C807950Vmj;
import X.C815900VzY;
import X.C822890WPv;
import X.C823230WRd;
import X.C823240WRe;
import X.C823280WRi;
import X.C823300WRk;
import X.C823330WRn;
import X.C823340WRo;
import X.C823350WRp;
import X.C823360WRq;
import X.C823420WRw;
import X.C824390WVp;
import X.C828220WeK;
import X.C835850Wqd;
import X.C843080X5m;
import X.C843130X5r;
import X.C844490XAx;
import X.C845560XFa;
import X.C845580XFc;
import X.C845590XFd;
import X.C845680XFm;
import X.C845730XFr;
import X.C846430XIj;
import X.C848230XPh;
import X.C849160XSw;
import X.C849180XSy;
import X.C849250XTf;
import X.DialogC972110bP7;
import X.EnumC823400WRu;
import X.ExecutorC822880WPu;
import X.InterfaceC1370310llN;
import X.InterfaceC1841670y1d;
import X.InterfaceC20236714Gf;
import X.InterfaceC807030VlF;
import X.InterfaceC823270WRh;
import X.InterfaceC829710Wgj;
import X.InterfaceC835900Wqi;
import X.InterfaceC844480XAw;
import X.InterfaceC849170XSx;
import X.InterfaceC849390XTt;
import X.InterfaceC853780XeS;
import Y.AComparatorS32S0000000_13;
import Y.AComparatorS512S0100000_13;
import Y.AObjectS362S0100000_19;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS18S1100000_13;
import Y.ARunnableS3S0100001_13;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.sheet.SheetDemoFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.pipeline.settings.ExceptionSkipFilter;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.account.otl.OneTapLoginShareInfo;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IMultiAccountService;
import com.ss.android.ugc.aweme.account.experiment.FlushETBeforeLoginExperimentConfig;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailLinkVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailOTPLoginCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPasswordFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneCodeLoginVerifyOrBindFragment;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;
import com.ss.android.ugc.aweme.account.verify.TransparentCodeVerificationActivity;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.business.kidsmode.KidsRelaunchPopup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpActivity;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpCreatorSheetWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpCreatorSheetWidget;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa2.NewPumbaaTask;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.nxreword.utils.NxResourceUtils;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.service.IPumbaaService;
import com.ss.android.ugc.aweme.services.autologin.AutoLoginET;
import com.ss.android.ugc.aweme.services.autologin.AutoLoginService;
import com.ss.android.ugc.aweme.shortvideo.sticker.livecountdown.FeedCountStickerDialogFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.trace.TraceLogWrapApiImpl;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.profile.business.account.multiaccount.MultiProfilesViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AwS592S0100000_13 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;

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
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            case 59:
                return invoke$59(this, obj);
            case 60:
                return invoke$60(this, obj);
            case 61:
                return invoke$61(this, obj);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj);
            case 63:
                return invoke$63(this, obj);
            case 64:
                return invoke$64(this, obj);
            case 65:
                return invoke$65(this, obj);
            case 66:
                return invoke$66(this, obj);
            case 67:
                return invoke$67(this, obj);
            case 68:
                return invoke$68(this, obj);
            case 69:
                return invoke$69(this, obj);
            case 70:
                return invoke$70(this, obj);
            case 71:
                return invoke$71(this, obj);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj);
            case 73:
                return invoke$73(this, obj);
            case 74:
                return invoke$74(this, obj);
            case 75:
                return invoke$75(this, obj);
            case 76:
                return invoke$76(this, obj);
            case 77:
                return invoke$77(this, obj);
            case 78:
                return invoke$78(this, obj);
            case 79:
                return invoke$79(this, obj);
            case 80:
                return invoke$80(this, obj);
            case 81:
                return invoke$81(this, obj);
            case 82:
                return invoke$82(this, obj);
            case 83:
                return invoke$83(this, obj);
            case 84:
                return invoke$84(this, obj);
            case 85:
                return invoke$85(this, obj);
            case 86:
                return invoke$86(this, obj);
            case 87:
                return invoke$87(this, obj);
            case 88:
                return invoke$88(this, obj);
            case 89:
                return invoke$89(this, obj);
            case 90:
                return invoke$90(this, obj);
            case 91:
                return invoke$91(this, obj);
            case 92:
                return invoke$92(this, obj);
            case 93:
                return invoke$93(this, obj);
            case 94:
                return invoke$94(this, obj);
            case 95:
                return invoke$95(this, obj);
            case 96:
                return invoke$96(this, obj);
            case 97:
                return invoke$97(this, obj);
            case 98:
                return invoke$98(this, obj);
            case 99:
                return invoke$99(this, obj);
            case 100:
                return invoke$100(this, obj);
            case 101:
                return invoke$101(this, obj);
            case 102:
                return invoke$102(this, obj);
            case 103:
                return invoke$103(this, obj);
            case 104:
                return invoke$104(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS592S0100000_13(C259800zU c259800zU, C259800zU<C0X52<?>> c259800zU2) {
        super(1);
        this.$t = c259800zU2;
        this.l0 = c259800zU;
    }

    public static final Object invoke$0(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        FeedCountStickerDialogFragment feedCountStickerDialogFragment = (FeedCountStickerDialogFragment) awS592S0100000_13.l0;
        feedCountStickerDialogFragment.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = feedCountStickerDialogFragment.LLJILJILJ;
        if (str == null) {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "live_cd_sticker");
        c2344009Gk.LJIIIIZZ("enter_reason", "general");
        C20684815ws.LJIILLIIL("push_pre_permission_auth", c2344009Gk.LIZ);
        try {
            C824390WVp.LIZLLL(((FeedCountStickerDialogFragment) awS592S0100000_13.l0).getContext());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Context context = ((FeedCountStickerDialogFragment) awS592S0100000_13.l0).getContext();
            if (context != null) {
                Intent intent = new Intent("android.settings.SETTINGS");
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhj9bMiocYG7T03r6p1PC3P6lWRJiipPEfN2nLq/m2xBPK4dNYCJK5x69zUayiELi74jxtCA==", null));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        String str = null;
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        FeedCountStickerDialogFragment feedCountStickerDialogFragment = (FeedCountStickerDialogFragment) awS592S0100000_13.l0;
        feedCountStickerDialogFragment.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str2 = feedCountStickerDialogFragment.LLJILJILJ;
        if (str2 != null) {
            str = str2;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "live_cd_sticker");
        c2344009Gk.LJIIIIZZ("enter_reason", "general");
        C20684815ws.LJIILLIIL("push_pre_permission_deny", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C786410Ut5.LJI((MultiLiveAsAnchorListDialogV2) awS592S0100000_13.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$100(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C807950Vmj c807950Vmj = (C807950Vmj) awS592S0100000_13.l0;
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            c807950Vmj.LJIIJ.LIZJ((String) entry.getKey(), (OutreachFlowReportItem) entry.getValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$101(AwS592S0100000_13 awS592S0100000_13, Object obj) throws UnsupportedEncodingException {
        String str = (String) obj;
        String strOptString = ((JSONObject) awS592S0100000_13.l0).optString(str);
        if (u.LJJIIJZLJL(strOptString, "https://", false) || u.LJJIIJZLJL(strOptString, "http://", false)) {
            strOptString = URLEncoder.encode(strOptString, StandardCharsets.UTF_8.toString());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('=');
        sbLIZ.append(strOptString);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$102(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        if (obj != null) {
            ((Function1) awS592S0100000_13.l0).invoke(obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$103(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((C0X9S) awS592S0100000_13.l0).cancel();
        return Unit.LIZ;
    }

    public static final Object invoke$104(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        ((Function2) awS592S0100000_13.l0).invoke(c1533790q13.LJIIIZ(), c1533790q13.LJJIIZI);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((Number) obj).intValue();
        ((MultiGuestUserInfoFragment) awS592S0100000_13.l0).fT();
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((MultiGuestUserInfoFragment) awS592S0100000_13.l0).fT();
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((Number) obj).longValue();
        ((MultiGuestUserInfoFragment) awS592S0100000_13.l0).FS();
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((Number) obj).intValue();
        ((VoiceChatUserInfoFragment) awS592S0100000_13.l0).iS();
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((VoiceChatUserInfoFragment) awS592S0100000_13.l0).iS();
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((Function0) awS592S0100000_13.l0).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        String str = (String) obj;
        VoiceChatUserInfoFragment voiceChatUserInfoFragment = (VoiceChatUserInfoFragment) awS592S0100000_13.l0;
        RecyclerView recyclerView = voiceChatUserInfoFragment.LLILZ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        HandlerHook.viewPostDelay(recyclerView, new ARunnableS18S1100000_13(voiceChatUserInfoFragment, str, 0), 500L);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((VoiceChatUserInfoFragment) awS592S0100000_13.l0).WR(null, ((Number) obj).intValue(), false);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((List) obj).remove(awS592S0100000_13.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131847629, new AwS592S0100000_13((FeedCountStickerDialogFragment) awS592S0100000_13.l0, 0));
        c1397620mTQ.LJII(2131847628, new AwS592S0100000_13((FeedCountStickerDialogFragment) awS592S0100000_13.l0, 1));
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.0X52<?>] */
    public static final Object invoke$20(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((C259800zU) awS592S0100000_13.l0).element = ((C1532790pzR) obj).LIZ;
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.0X52<?>] */
    public static final Object invoke$21(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((C259800zU) awS592S0100000_13.l0).element = ((C1532790pzR) obj).LIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        boolean zBooleanValue;
        C844490XAx c844490XAx = (C844490XAx) obj;
        c844490XAx.LIZIZ = Integer.valueOf(R.string.drg);
        Boolean boolIsDebug = ((InterfaceC844480XAw) awS592S0100000_13.l0).isDebug();
        if (boolIsDebug != null) {
            boolIsDebug.booleanValue();
        }
        c844490XAx.LIZLLL = ((InterfaceC844480XAw) awS592S0100000_13.l0).LJIIIIZZ();
        c844490XAx.LJ = ((InterfaceC844480XAw) awS592S0100000_13.l0).LIZLLL();
        ((InterfaceC844480XAw) awS592S0100000_13.l0).LJI();
        Boolean boolLIZJ = ((InterfaceC844480XAw) awS592S0100000_13.l0).LIZJ();
        if (boolLIZJ != null) {
            boolLIZJ.booleanValue();
        }
        Boolean boolLIZIZ = ((InterfaceC844480XAw) awS592S0100000_13.l0).LIZIZ();
        if (boolLIZIZ != null) {
            zBooleanValue = boolLIZIZ.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c844490XAx.LJI = zBooleanValue;
        Boolean boolLJII = ((InterfaceC844480XAw) awS592S0100000_13.l0).LJII();
        if (boolLJII != null) {
            boolLJII.booleanValue();
        }
        ((InterfaceC844480XAw) awS592S0100000_13.l0).appName();
        c844490XAx.LIZJ = "musical_ly";
        ((InterfaceC844480XAw) awS592S0100000_13.l0).appId();
        c844490XAx.LJFF = 1233;
        ((InterfaceC844480XAw) awS592S0100000_13.l0).LIZ();
        ((InterfaceC844480XAw) awS592S0100000_13.l0).LJIIJ();
        ((InterfaceC844480XAw) awS592S0100000_13.l0).LJIIJJI();
        c844490XAx.LJIIIZ = 2;
        c844490XAx.LJII = ((InterfaceC844480XAw) awS592S0100000_13.l0).LJFF();
        ((InterfaceC844480XAw) awS592S0100000_13.l0).LJIIIZ();
        c844490XAx.LJIIIIZZ = ((InterfaceC844480XAw) awS592S0100000_13.l0).LJ();
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C0XG3 c0xg3LIZ;
        C0XG3 c0xg3LIZ2;
        C0XFZ c0xfz = (C0XFZ) obj;
        SOTLViewModel sOTLViewModel = (SOTLViewModel) awS592S0100000_13.l0;
        C0XG3 c0xg3 = sOTLViewModel.LLJIJIL;
        C0XG3 c0xg3LIZ3 = null;
        if (c0xg3 != null) {
            c0xg3LIZ = C0XG3.LIZ(c0xg3, 0L, System.currentTimeMillis(), 0L, 0L, null, null, null, 507);
        } else {
            c0xg3LIZ = null;
        }
        sOTLViewModel.LLJIJIL = c0xg3LIZ;
        if (c0xfz instanceof C0XFX) {
            OneTapLoginShareInfo oneTapLoginShareInfo = ((C0XFX) c0xfz).LIZ;
            if (C845580XFc.LIZLLL(oneTapLoginShareInfo)) {
                ((SOTLViewModel) awS592S0100000_13.l0).vQ2(oneTapLoginShareInfo);
            } else {
                ((SOTLViewModel) awS592S0100000_13.l0).LLILZLL.setValue(Boolean.FALSE);
                SOTLViewModel sOTLViewModel2 = (SOTLViewModel) awS592S0100000_13.l0;
                C0XG3 c0xg32 = sOTLViewModel2.LLJIJIL;
                if (c0xg32 != null) {
                    c0xg3LIZ3 = C0XG3.LIZ(c0xg32, 0L, 0L, 0L, 0L, "fetch_token", "token_invalid", "Single account token invalid", 63);
                }
                sOTLViewModel2.LLJIJIL = c0xg3LIZ3;
                ((SOTLViewModel) awS592S0100000_13.l0).LLIZLLLIL.LJIIIIZZ(new C845730XFr());
                ((SOTLViewModel) awS592S0100000_13.l0).wQ2(false);
            }
        } else if (c0xfz instanceof C0XFY) {
            List<OneTapLoginShareInfo> list = ((C0XFY) c0xfz).LIZ;
            ArrayList arrayList = new ArrayList();
            for (OneTapLoginShareInfo oneTapLoginShareInfo2 : list) {
                if (C845580XFc.LIZLLL(oneTapLoginShareInfo2)) {
                    arrayList.add(oneTapLoginShareInfo2);
                }
            }
            OneTapLoginShareInfo oneTapLoginShareInfo3 = (OneTapLoginShareInfo) C13LP.LJJJLL(C13LP.LJLLLL(new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(43), 8), arrayList));
            if (oneTapLoginShareInfo3 != null) {
                ((SOTLViewModel) awS592S0100000_13.l0).vQ2(oneTapLoginShareInfo3);
            } else {
                ((SOTLViewModel) awS592S0100000_13.l0).LLILZLL.setValue(Boolean.FALSE);
                SOTLViewModel sOTLViewModel3 = (SOTLViewModel) awS592S0100000_13.l0;
                C0XG3 c0xg33 = sOTLViewModel3.LLJIJIL;
                if (c0xg33 != null) {
                    c0xg3LIZ3 = C0XG3.LIZ(c0xg33, 0L, 0L, 0L, 0L, "fetch_token", "no_valid_token", "No valid token in multi account list", 63);
                }
                sOTLViewModel3.LLJIJIL = c0xg3LIZ3;
                ((SOTLViewModel) awS592S0100000_13.l0).LLIZLLLIL.LJIIIIZZ(new C845730XFr());
                ((SOTLViewModel) awS592S0100000_13.l0).wQ2(false);
            }
        } else {
            ((SOTLViewModel) awS592S0100000_13.l0).LLILZLL.setValue(Boolean.FALSE);
            if (c0xfz instanceof C845560XFa) {
                SOTLViewModel sOTLViewModel4 = (SOTLViewModel) awS592S0100000_13.l0;
                C0XG3 c0xg34 = sOTLViewModel4.LLJIJIL;
                if (c0xg34 != null) {
                    C845560XFa c845560XFa = (C845560XFa) c0xfz;
                    c0xg3LIZ2 = C0XG3.LIZ(c0xg34, 0L, 0L, 0L, 0L, "fetch_token", String.valueOf(c845560XFa.LIZIZ), c845560XFa.LIZJ, 63);
                } else {
                    c0xg3LIZ2 = null;
                }
                sOTLViewModel4.LLJIJIL = c0xg3LIZ2;
                SOTLViewModel sOTLViewModel5 = (SOTLViewModel) awS592S0100000_13.l0;
                C845560XFa c845560XFa2 = (C845560XFa) c0xfz;
                sOTLViewModel5.getClass();
                int i = C0XFO.LIZ[c845560XFa2.LIZ.ordinal()];
                if (i == 1 || i == 2) {
                    C845590XFd.LIZ.getClass();
                    C845590XFd.LIZIZ.setValue(C845680XFm.LIZ);
                    C845590XFd.LIZLLL.set(false);
                    C845590XFd.LJ.set(false);
                    C845590XFd.LJFF = null;
                    C845590XFd.LJI = null;
                }
                sOTLViewModel5.LLIZLLLIL.LJIIIIZZ(new C845730XFr(2131824521, String.valueOf(c845560XFa2.LIZIZ)));
            } else {
                SOTLViewModel sOTLViewModel6 = (SOTLViewModel) awS592S0100000_13.l0;
                C0XG3 c0xg35 = sOTLViewModel6.LLJIJIL;
                if (c0xg35 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unexpected result type: ");
                    sbLIZ.append(C13LE.LIZ(c0xfz.getClass()).LJI());
                    c0xg3LIZ3 = C0XG3.LIZ(c0xg35, 0L, 0L, 0L, 0L, "fetch_token", "unexpected_result", C2188811AlT.LIZIZ(sbLIZ), 63);
                }
                sOTLViewModel6.LLJIJIL = c0xg3LIZ3;
                ((SOTLViewModel) awS592S0100000_13.l0).LLIZLLLIL.LJIIIIZZ(new C845730XFr());
            }
            ((SOTLViewModel) awS592S0100000_13.l0).wQ2(false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((CommonFlowActivity) awS592S0100000_13.l0).finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        c06w2.Dw2(new AwS557S0100000_13((CommonFlowActivity) awS592S0100000_13.l0, 63));
        c06w2.Dw2(new AwS563S0100000_19((CommonFlowActivity) awS592S0100000_13.l0, 236));
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        InputCodeFragment inputCodeFragment = (InputCodeFragment) awS592S0100000_13.l0;
        inputCodeFragment.qT(((C0XZJ) obj).getErrorCode(), (String) inputCodeFragment.LLLLLLLLLL.getValue(), false);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        InputCodeFragment inputCodeFragment = (InputCodeFragment) awS592S0100000_13.l0;
        inputCodeFragment.qT(((C0XZJ) obj).getErrorCode(), (String) inputCodeFragment.LLLLLLLLLL.getValue(), false);
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        CommonFlowActivity commonFlowActivity;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C19EG activity = ((EmailOTPLoginCodeVerifyFragment) awS592S0100000_13.l0).getActivity();
        if ((activity instanceof CommonFlowActivity) && (commonFlowActivity = (CommonFlowActivity) activity) != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_login_success", zBooleanValue);
            commonFlowActivity.LLZ(bundle);
        }
        if (!zBooleanValue) {
            ((EmailOTPLoginCodeVerifyFragment) awS592S0100000_13.l0).ES();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        CommonFlowActivity commonFlowActivity;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C19EG activity = ((PhoneCodeLoginVerifyOrBindFragment) awS592S0100000_13.l0).getActivity();
        if ((activity instanceof CommonFlowActivity) && (commonFlowActivity = (CommonFlowActivity) activity) != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_login_success", zBooleanValue);
            commonFlowActivity.LLZ(bundle);
        }
        if (!zBooleanValue) {
            ((PhoneCodeLoginVerifyOrBindFragment) awS592S0100000_13.l0).ES();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((C09AE) awS592S0100000_13.l0).LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        CommonFlowActivity commonFlowActivity;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C19EG activity = ((InputPasswordFragment) awS592S0100000_13.l0).getActivity();
        if ((activity instanceof CommonFlowActivity) && (commonFlowActivity = (CommonFlowActivity) activity) != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_login_success", zBooleanValue);
            commonFlowActivity.LLZ(bundle);
        }
        if (!zBooleanValue) {
            ((InputPasswordFragment) awS592S0100000_13.l0).ES();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C0XWJ c0xwj = C0XWJ.LIZ;
        String string = ((Bundle) awS592S0100000_13.l0).getString("login_panel_type");
        String str = "";
        if (string == null) {
            string = "";
        }
        String string2 = ((Bundle) awS592S0100000_13.l0).getString("channel_for_ocl");
        if (string2 != null) {
            str = string2;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        c0xwj.getClass();
        C0XWJ.LJIILIIL(numValueOf, string, false, str);
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        if (((InterfaceC20236714Gf) awS592S0100000_13.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS592S0100000_13.l0;
            C189200o6.m2constructorimpl(obj);
            interfaceC20236714Gf.resumeWith(obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C1669720tYI c1669720tYI = C1669720tYI.LIZ;
        String enterFrom = ((BaseUpdatePasswordFragment) awS592S0100000_13.l0).getEnterFrom();
        String strRR = ((BaseUpdatePasswordFragment) awS592S0100000_13.l0).RR();
        c1669720tYI.getClass();
        C1669720tYI.LIZ(enterFrom, strRR, "dismiss");
        C19EG activity = ((BaseUpdatePasswordFragment) awS592S0100000_13.l0).getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        VerifyPasswordFragment verifyPasswordFragment = (VerifyPasswordFragment) awS592S0100000_13.l0;
        int errorCode = ((C0XZJ) obj).getErrorCode();
        verifyPasswordFragment.getClass();
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String strGT = verifyPasswordFragment.gT();
        c1233960iDS.getClass();
        C1233960iDS.LJIIL(strGT, "password", false);
        C1233960iDS.LJIIIZ(0, Integer.valueOf(errorCode), verifyPasswordFragment.getEnterFrom(), verifyPasswordFragment.getEnterMethod(), verifyPasswordFragment.gT(), "password", verifyPasswordFragment.ZS().isChecked());
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C1669720tYI c1669720tYI = C1669720tYI.LIZ;
        String enterFrom = ((BaseUpdatePasswordFragment) awS592S0100000_13.l0).getEnterFrom();
        String strRR = ((BaseUpdatePasswordFragment) awS592S0100000_13.l0).RR();
        c1669720tYI.getClass();
        C1669720tYI.LIZ(enterFrom, strRR, "confirm");
        ((BaseUpdatePasswordFragment) awS592S0100000_13.l0).iT();
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C1669720tYI c1669720tYI = C1669720tYI.LIZ;
        String enterFrom = ((BaseUpdatePasswordFragment) awS592S0100000_13.l0).getEnterFrom();
        String strRR = ((BaseUpdatePasswordFragment) awS592S0100000_13.l0).RR();
        c1669720tYI.getClass();
        C1669720tYI.LIZ(enterFrom, strRR, "maybe_later");
        C19EG activity = ((BaseUpdatePasswordFragment) awS592S0100000_13.l0).getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        c06w2.Dw2(new AwS557S0100000_13((BindOrModifyPhoneActivity) awS592S0100000_13.l0, 104));
        c06w2.Dw2(AFwS201S0000000_14.get$arr$(48));
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131833839, new AwS592S0100000_13((TransparentCodeVerificationActivity) awS592S0100000_13.l0, 39));
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((TransparentCodeVerificationActivity) awS592S0100000_13.l0).finish();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((InterfaceC1841670y1d) awS592S0100000_13.l0).LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        AwS30S0100001_13 awS30S0100001_13 = new AwS30S0100001_13(fFloatValue, (SeaPdpCreatorSheetWidget) awS592S0100000_13.l0, 0);
        if (fFloatValue == 1.0f) {
            View view = ((SeaPdpCreatorSheetWidget) awS592S0100000_13.l0).LLJI;
            if (view != null) {
                HandlerHook.viewPostDelay(view, new ARunnableS113S0100000_13(awS30S0100001_13, 95), 100L);
            }
        } else {
            awS30S0100001_13.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        AwS30S0100001_13 awS30S0100001_13 = new AwS30S0100001_13(fFloatValue, (PdpCreatorSheetWidget) awS592S0100000_13.l0, 1);
        if (fFloatValue == 1.0f) {
            View view = ((PdpCreatorSheetWidget) awS592S0100000_13.l0).LLJI;
            if (view != null) {
                HandlerHook.viewPostDelay(view, new ARunnableS113S0100000_13(awS30S0100001_13, 97), 100L);
            }
        } else {
            awS30S0100001_13.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        boolean z;
        Reference reference = (Reference) obj;
        if (!Intrinsics.LJFF(reference.get(), (C0X9S) awS592S0100000_13.l0) && reference.get() != null) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$43(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        NewPumbaaTask newPumbaaTask = (NewPumbaaTask) awS592S0100000_13.l0;
        newPumbaaTask.getClass();
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
        if (newPumbaaTask.LL == null) {
            try {
                newPumbaaTask.LL = C2404209bU.LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        String str = newPumbaaTask.LL;
        if (str == null) {
            str = "pns-null";
        }
        C823420WRw.LIZIZ("release_build", new C0WQ8(enumC823400WRu, str));
        final EnumC823400WRu enumC823400WRu2 = EnumC823400WRu.Bool;
        Boolean bool = Boolean.FALSE;
        C823420WRw.LIZIZ("is_regression_test", new C0WQ8(enumC823400WRu2, bool));
        C823420WRw.LIZIZ("store_region", new C0WR8(enumC823400WRu, new C823350WRp()));
        C823420WRw.LIZIZ("region_source", new C0WR8(enumC823400WRu, new C20301314c7()));
        C823420WRw.LIZIZ("store_region_vgeo", new C0WR8(enumC823400WRu, new C823360WRq()));
        C823420WRw.LIZIZ("priority_region", new C0WR8(enumC823400WRu, new C309790CCj()));
        C823420WRw.LIZIZ("is_guest_mode", new C0WR8(enumC823400WRu2, new C04UH()));
        final EnumC823400WRu enumC823400WRu3 = EnumC823400WRu.Long;
        C823420WRw.LIZIZ("guest_mode", new C0WR8(enumC823400WRu3, new C1122004aA()));
        C823420WRw.LIZIZ("is_login", new C0WR8(enumC823400WRu2, new C1950607kW()));
        C0WR8 c0wr8 = new C0WR8(enumC823400WRu2, new C583860MvA());
        C823340WRo c823340WRo = C823330WRn.LIZ;
        c823340WRo.LIZ("is_not_consent", c0wr8);
        C823420WRw.LIZIZ("is_personalized_ads_enabled", new C0WR8(enumC823400WRu2, new C0PMC()));
        c823340WRo.LIZ("is_kids_mode", new C0WQ8(enumC823400WRu2, bool));
        c823340WRo.LIZ("age", new C0WR8(enumC823400WRu, new C1797760wso()));
        C823420WRw.LIZIZ("is_teen_mode", new C0WR8(enumC823400WRu2, new C0CXX()));
        C823420WRw.LIZIZ("is_personal_account", new C0WR8(enumC823400WRu2, new C312130CLj()));
        final C691040R8s c691040R8s = new C691040R8s();
        C823420WRw.LIZIZ("is_first_frame_show", new C0WR6(enumC823400WRu2, c691040R8s) { // from class: X.0WR5
            public final Function0<Object> LIZJ;

            @Override // X.C0WR6
            public final Object LIZIZ() {
                return this.LIZJ.invoke();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RealTimeValue{type=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append('}');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZJ = c691040R8s;
            }
        });
        final C0C9H c0c9h = new C0C9H();
        C823420WRw.LIZIZ("app_uptime", new C0WR6(enumC823400WRu3, c0c9h) { // from class: X.0WR5
            public final Function0<Object> LIZJ;

            @Override // X.C0WR6
            public final Object LIZIZ() {
                return this.LIZJ.invoke();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RealTimeValue{type=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append('}');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZJ = c0c9h;
            }
        });
        C823420WRw.LIZIZ("nxet_info", new C0WR8(enumC823400WRu, AFwS216S0000000_27.get$arr$(369)));
        C0S78.LIZJ(AFwS200S0000000_13.get$arr$(433), true);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$44(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C0WS3.LIZ((Application) C786410Ut5.N3((Context) awS592S0100000_13.l0));
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((NewPumbaaTask) awS592S0100000_13.l0).getClass();
        IPumbaaService iPumbaaService = (IPumbaaService) PluggableExtentionKt.pluggableSpi$default(IPumbaaService.class, false, false, false, 8, null);
        if (iPumbaaService != null) {
            iPumbaaService.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        if (NxRewordManager.LIZJ != 0) {
            NxResourceUtils.INSTANCE.nativeUpdateLocale(NxRewordManager.LIZJ, u.LJJIFFI(((Locale) awS592S0100000_13.l0).toString(), "_", "-", false), NxRewordManager.LJ.getAssets());
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$47(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Auto Login failed with error: ");
        sbLIZ.append(iIntValue);
        C0XFF.LIZ("AutoLogin", C2188811AlT.LIZIZ(sbLIZ));
        ((AutoLoginService) awS592S0100000_13.l0).finishAutoLoginProcess();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$48(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((Number) obj).intValue();
        ((AutoLoginService) awS592S0100000_13.l0).finishAutoLoginProcess();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$49(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            C0XFF.LIZJ("AutoLogin", "OCL Data Repo init failed");
            AutoLoginET.INSTANCE.checkEligibilityET(AutoLoginService.Companion.getAppType(), true, C0XXB.ERRORS);
            ((AutoLoginService) awS592S0100000_13.l0).finishAutoLoginProcess();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OCL Data Repo init success, ");
            sbLIZ.append(C786410Ut5.u3());
            C0XFF.LIZJ("AutoLogin", C2188811AlT.LIZIZ(sbLIZ));
            ((AutoLoginService) awS592S0100000_13.l0).autoLoginUser();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((Function1) awS592S0100000_13.l0).invoke(Integer.valueOf(((Number) obj).intValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$50(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Collection<C807160VlS> collectionValues = C0VGA.LIZ.values();
        TraceLogWrapApiImpl traceLogWrapApiImpl = (TraceLogWrapApiImpl) awS592S0100000_13.l0;
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            traceLogWrapApiImpl.LIZIZ.LIZ(jLongValue, ((C807160VlS) it2.next()).LIZ, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$51(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        String str;
        String str2 = (String) obj;
        C0XT2 c0xt2 = (C0XT2) awS592S0100000_13.l0;
        String str3 = c0xt2.LIZLLL;
        String str4 = c0xt2.LIZJ;
        if (str2 == null) {
            str = "response is null";
        } else {
            str = str2;
        }
        C849180XSy.LIZIZ(str3, str4, str, false);
        if (str2 != null && str2.length() != 0) {
            ((C0XT2) awS592S0100000_13.l0).LIZ.LJIIJ(str2);
        } else {
            ((C0XT2) awS592S0100000_13.l0).LIZ.C1(null, 2131837688);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$52(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C0XO3 c0xo3;
        C849250XTf c849250XTf;
        C0XT7 c0xt7 = (C0XT7) obj;
        IRuleEngineService iRuleEngineService = (IRuleEngineService) ServiceManager.get().getService(IRuleEngineService.class);
        if (iRuleEngineService != null) {
            iRuleEngineService.LIZIZ();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("is_kids_mode", 1);
        bundle.putInt("user_mode", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUserMode());
        bundle.putInt("user_period", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUserPeriod());
        AppLog.setCustomerHeader(bundle);
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FlushETBeforeLoginExperimentConfig flushETBeforeLoginExperimentConfig = C849160XSw.LIZ;
        FlushETBeforeLoginExperimentConfig flushETBeforeLoginExperimentConfig2 = (FlushETBeforeLoginExperimentConfig) c0c64LJIILLIIL.LJJII(FlushETBeforeLoginExperimentConfig.class, flushETBeforeLoginExperimentConfig, "flush_kids_et_before_login", true);
        if (flushETBeforeLoginExperimentConfig2 != null) {
            flushETBeforeLoginExperimentConfig = flushETBeforeLoginExperimentConfig2;
        }
        if (flushETBeforeLoginExperimentConfig.isEnable) {
            AppLog.flush();
        }
        ComplianceServiceProvider.LJII().LJI(true);
        C0XT2 c0xt2 = (C0XT2) awS592S0100000_13.l0;
        C849180XSy.LIZJ(true, c0xt2.LIZLLL, c0xt2.LIZJ, c0xt7, "");
        if (((C0XT2) awS592S0100000_13.l0).LIZIZ) {
            C0XQZ.LIZJ(false);
        }
        C20684815ws.onEventV3("kid_sign_up");
        if (c0xt7 != null && (c849250XTf = (C849250XTf) c0xt7.LJIIIZ) != null) {
            c0xo3 = c849250XTf.LJIIIIZZ;
        } else {
            c0xo3 = null;
        }
        C0XQ5.LJIIL(c0xo3, null);
        ((C0XT2) awS592S0100000_13.l0).LIZ.dq();
        return Unit.LIZ;
    }

    public static final Object invoke$53(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        String str;
        String str2;
        C0XT7 c0xt7 = (C0XT7) obj;
        C0XT2 c0xt2 = (C0XT2) awS592S0100000_13.l0;
        String str3 = c0xt2.LIZLLL;
        String str4 = c0xt2.LIZJ;
        String str5 = null;
        if (c0xt7 != null) {
            str = c0xt7.LJFF;
        } else {
            str = null;
        }
        C849180XSy.LIZJ(false, str3, str4, c0xt7, str);
        if (c0xt7 != null && (str2 = c0xt7.LJFF) != null && str2.length() != 0) {
            InterfaceC849170XSx interfaceC849170XSx = ((C0XT2) awS592S0100000_13.l0).LIZ;
            if (c0xt7 != null) {
                str5 = c0xt7.LJFF;
            }
            interfaceC849170XSx.LJIIJ(str5);
        } else {
            ((C0XT2) awS592S0100000_13.l0).LIZ.C1(null, 2131837688);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$54(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((C0WL6) obj).LIZIZ(((WebResourceRequest) awS592S0100000_13.l0).getUrl());
        return Unit.LIZ;
    }

    public static final Object invoke$55(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((C0WXO) awS592S0100000_13.l0).LIZIZ.invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$56(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((Function1) awS592S0100000_13.l0).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$57(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) awS592S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$58(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) awS592S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$59(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        List listLJLIL = (List) obj;
        String strLIZLLL = C848230XPh.LIZLLL();
        if (!listLJLIL.isEmpty()) {
            Iterator it2 = listLJLIL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(((SignificantUserInfo) next).uid, strLIZLLL)) {
                    if (next != null) {
                        List listSingletonList = Collections.singletonList(next);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listLJLIL) {
                            if (!Intrinsics.LJFF(((SignificantUserInfo) obj2).uid, strLIZLLL)) {
                                arrayList.add(obj2);
                            }
                        }
                        listLJLIL = C13LP.LJLIL(arrayList, listSingletonList);
                    }
                }
            }
        }
        ((IMultiAccountService) ServiceManager.get().getService(IMultiAccountService.class)).LIZIZ();
        if (listLJLIL.size() < 8) {
            return C13LP.LJLIL(Collections.singletonList(new SignificantUserInfo("-1", "", "", "", "", "", "", "", "")), listLJLIL);
        }
        return listLJLIL;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C786410Ut5.LJ((DialogC972110bP7) awS592S0100000_13.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$60(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C0WMB) obj).LIZLLL(), ((C0WNH) awS592S0100000_13.l0).LIZLLL()));
    }

    public static final Object invoke$61(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C0WMB) obj).LIZLLL(), ((C0WNH) awS592S0100000_13.l0).LIZLLL()));
    }

    public static final Object invoke$62(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C0WMB) obj).LIZLLL(), ((C0WNH) awS592S0100000_13.l0).LIZLLL()));
    }

    public static final Object invoke$63(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C0WMB) obj).LIZLLL(), ((C0WNH) awS592S0100000_13.l0).LIZLLL()));
    }

    public static final Object invoke$64(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((C0WL6) obj).LIZJ((Uri) awS592S0100000_13.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$65(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        CommonFlowActivity commonFlowActivity;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C19EG activity = ((EmailLinkVerifyFragment) awS592S0100000_13.l0).getActivity();
        if ((activity instanceof CommonFlowActivity) && (commonFlowActivity = (CommonFlowActivity) activity) != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_login_success", zBooleanValue);
            commonFlowActivity.LLZ(bundle);
        }
        if (!zBooleanValue) {
            ((EmailLinkVerifyFragment) awS592S0100000_13.l0).ES();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$66(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        Throwable th = (Throwable) obj;
        if (th == null) {
            if (!((C805010Vhz) awS592S0100000_13.l0).LLILLJJLI.isDone()) {
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else if (th instanceof CancellationException) {
            ((C805010Vhz) awS592S0100000_13.l0).LLILLJJLI.cancel(true);
        } else {
            C134N<R> c134n = ((C805010Vhz) awS592S0100000_13.l0).LLILLJJLI;
            Throwable cause = th.getCause();
            if (cause != null) {
                th = cause;
            }
            c134n.LJIIJ(th);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$67(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C0XVX.LIZ.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "log_out");
        c0xgr.LIZLLL("exit_method", "not_now");
        C20684815ws.LJIILLIIL("exit_verify_email_popup", c0xgr.LIZ);
        ((InterfaceC849390XTt) awS592S0100000_13.l0).LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$68(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        InterfaceC807030VlF interfaceC807030VlF = (InterfaceC807030VlF) awS592S0100000_13.l0;
        if (interfaceC807030VlF != null) {
            interfaceC807030VlF.LJ(jLongValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$69(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C835850Wqd.LIZ.getClass();
        C835850Wqd.LJFF = C835850Wqd.LIZ((JSONObject) obj);
        C835850Wqd.LIZIZ();
        ((CompletionBlock) awS592S0100000_13.l0).onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC835900Wqi.class, null), "");
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C500260Jjc.LJJLIIIJL((DialogC972110bP7) awS592S0100000_13.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$70(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C835850Wqd.LIZ.getClass();
        C835850Wqd.LJFF = C835850Wqd.LIZ((JSONObject) obj);
        C835850Wqd.LIZIZ();
        ((CompletionBlock) awS592S0100000_13.l0).onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC835900Wqi.class, null), "");
        return Unit.LIZ;
    }

    public static final Object invoke$71(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        HandlerHook.viewPost(((PdpActivity) awS592S0100000_13.l0).LLLLZLLIL(), new ARunnableS3S0100001_13((PdpActivity) awS592S0100000_13.l0, ((Number) obj).floatValue(), 0));
        return Unit.LIZ;
    }

    public static final Object invoke$72(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        return Boolean.valueOf(((ArrayList) awS592S0100000_13.l0).contains(((C815900VzY) obj).LIZIZ));
    }

    public static final Object invoke$73(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        return Boolean.valueOf(((List) awS592S0100000_13.l0).contains(((InterfaceC1370310llN) obj).key()));
    }

    public static final Object invoke$74(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        return Boolean.valueOf(((List) awS592S0100000_13.l0).contains(((InterfaceC1370310llN) obj).key()));
    }

    public static final Object invoke$75(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        return Boolean.valueOf(((List) awS592S0100000_13.l0).contains(((InterfaceC1370310llN) obj).key()));
    }

    public static final Object invoke$76(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        StringBuilder sb = (StringBuilder) awS592S0100000_13.l0;
        sb.append((String) obj);
        sb.append("\n");
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$77(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        boolean z;
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence != null && !a0.LJJJIL(charSequence)) {
            z = false;
        } else {
            z = true;
        }
        View viewFindViewById = null;
        if (z) {
            SheetDemoFragment sheetDemoFragment = (SheetDemoFragment) awS592S0100000_13.l0;
            View view = sheetDemoFragment.LLLLLJIL;
            if (view == null) {
                View view2 = sheetDemoFragment.getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.h4s);
                }
                sheetDemoFragment.LLLLLJIL = (LinearLayout) viewFindViewById;
                view = viewFindViewById;
            }
            C786410Ut5.LJZL(0, (LinearLayout) view);
        } else {
            SheetDemoFragment sheetDemoFragment2 = (SheetDemoFragment) awS592S0100000_13.l0;
            View view3 = sheetDemoFragment2.LLLLLJIL;
            if (view3 == null) {
                View view4 = sheetDemoFragment2.getView();
                if (view4 != null) {
                    viewFindViewById = view4.findViewById(R.id.h4s);
                }
                sheetDemoFragment2.LLLLLJIL = (LinearLayout) viewFindViewById;
                view3 = viewFindViewById;
            }
            C786410Ut5.LJZL(8, (LinearLayout) view3);
            C786410Ut5.LJJJJZI(((SheetDemoFragment) awS592S0100000_13.l0).FS());
            ((SheetDemoFragment) awS592S0100000_13.l0).LLLZIL.clear();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$78(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        boolean z;
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence != null && !a0.LJJJIL(charSequence)) {
            z = false;
        } else {
            z = true;
        }
        View viewFindViewById = null;
        if (z) {
            SheetDemoFragment sheetDemoFragment = (SheetDemoFragment) awS592S0100000_13.l0;
            View view = sheetDemoFragment.LLLLILI;
            if (view == null) {
                View view2 = sheetDemoFragment.getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.vyo);
                }
                sheetDemoFragment.LLLLILI = (LinearLayout) viewFindViewById;
                view = viewFindViewById;
            }
            C786410Ut5.LJZL(0, (LinearLayout) view);
        } else {
            SheetDemoFragment sheetDemoFragment2 = (SheetDemoFragment) awS592S0100000_13.l0;
            View view3 = sheetDemoFragment2.LLLLILI;
            if (view3 == null) {
                View view4 = sheetDemoFragment2.getView();
                if (view4 != null) {
                    viewFindViewById = view4.findViewById(R.id.vyo);
                }
                sheetDemoFragment2.LLLLILI = (LinearLayout) viewFindViewById;
                view3 = viewFindViewById;
            }
            C786410Ut5.LJZL(8, (LinearLayout) view3);
            C786410Ut5.LJJJJZI(((SheetDemoFragment) awS592S0100000_13.l0).RS());
            ((SheetDemoFragment) awS592S0100000_13.l0).LLLZIIL.clear();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$79(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C823300WRk c823300WRk = (C823300WRk) awS592S0100000_13.l0;
        C823280WRi c823280WRi = C823280WRi.LIZ;
        AwS662S0100000_13 awS662S0100000_13 = new AwS662S0100000_13(c823300WRk, 3);
        Lock lockWriteLock = ((ReentrantReadWriteLock) C823280WRi.LJIIJ).writeLock();
        lockWriteLock.lock();
        try {
            C823280WRi.LJIIIZ.add(awS662S0100000_13);
            lockWriteLock.unlock();
            final ExceptionSkipFilter exceptionSkipFilter = C823240WRe.LIZ().exceptionSkipFilter;
            if ((!exceptionSkipFilter.byMessage.isEmpty()) || (!exceptionSkipFilter.byData.isEmpty())) {
                C823280WRi.LJIIJJI = new InterfaceC823270WRh() { // from class: X.04zA
                    @Override // X.InterfaceC823270WRh
                    public final boolean LIZ(String str, Map map) {
                        Iterator<String> it2 = exceptionSkipFilter.byMessage.iterator();
                        while (it2.hasNext()) {
                            if (a0.LJJIIZI(str, it2.next(), false)) {
                                return true;
                            }
                        }
                        for (Map.Entry<String, List<String>> entry : exceptionSkipFilter.byData.entrySet()) {
                            String key = entry.getKey();
                            List<String> value = entry.getValue();
                            if (!(value instanceof Collection) || !value.isEmpty()) {
                                for (String str2 : value) {
                                    String str3 = (String) map.get(key);
                                    if (str3 != null && a0.LJJIIZI(str3, str2, false)) {
                                        return true;
                                    }
                                }
                            }
                        }
                        return false;
                    }
                };
            }
            C308480C7i.LJ.set(true);
            C823280WRi.LIZJ = C823240WRe.LIZ().throwException;
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lockWriteLock.unlock();
            throw th;
        }
    }

    public static final Object invoke$8(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C500260Jjc.LJJLIIIJL((DialogC972110bP7) awS592S0100000_13.l0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$80(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ExecutorC822880WPu executorC822880WPu;
        Application application = (Application) C786410Ut5.N3((Context) awS592S0100000_13.l0);
        synchronized (PumbaaWorkerThread.class) {
            try {
                PumbaaWorkerThread.LIZIZ();
                executorC822880WPu = PumbaaWorkerThread.LLILLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C822890WPv.LIZIZ(application, executorC822880WPu);
        return Unit.LIZ;
    }

    public static final Object invoke$81(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C823230WRd.LIZIZ.LJ((C823300WRk) awS592S0100000_13.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$82(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((User) awS592S0100000_13.l0).setAwemeCount(((Number) obj).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$83(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        return C828220WeK.LJFF(a0.LJLIIIL((String) obj).toString(), (HashSet) awS592S0100000_13.l0, true);
    }

    public static final Object invoke$84(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        return C828220WeK.LJFF(a0.LJLIIIL((String) obj).toString(), (Set) awS592S0100000_13.l0, false);
    }

    public static final Object invoke$85(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        HandlerHook.viewPost(((SeaPdpActivity) awS592S0100000_13.l0).LLLLZLLIL(), new ARunnableS3S0100001_13((SeaPdpActivity) awS592S0100000_13.l0, ((Number) obj).floatValue(), 1));
        return Unit.LIZ;
    }

    public static final Object invoke$86(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            if (th instanceof CancellationException) {
                C2382909Vj.LIZ((CompletionBlock) awS592S0100000_13.l0, 9997, "canceled", null, 4);
            } else {
                CompletionBlock completionBlock = (CompletionBlock) awS592S0100000_13.l0;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                C2382909Vj.LIZ(completionBlock, 9999, message, null, 4);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$87(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((Number) obj).intValue();
        ((Function1) awS592S0100000_13.l0).invoke(-1);
        return Unit.LIZ;
    }

    public static final Object invoke$88(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (!C846430XIj.LIZIZ()) {
            ((Function1) awS592S0100000_13.l0).invoke(Integer.valueOf(iIntValue));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$89(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C786410Ut5.LJFF((MultiGuestAsGuestModeratorManageDialog) awS592S0100000_13.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        return Boolean.valueOf(((InterfaceC829710Wgj) obj).LIZ((Set) awS592S0100000_13.l0));
    }

    public static final Object invoke$90(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((Function1) awS592S0100000_13.l0).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$91(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((Function1) awS592S0100000_13.l0).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$92(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        if (!c197039127h.LLLII) {
            c197039127h.setLoading(true);
            C0X4N c0x4n = C0X4N.LIZ;
            String str = (String) ((KidsRelaunchPopup) awS592S0100000_13.l0).LL.getValue();
            C0X4Q c0x4q = C0X4Q.RELAUNCH_POPUP;
            c0x4n.getClass();
            C0X4N.LJI(str, c0x4q);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$93(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LJ(((Number) ((KidsRelaunchPopup) awS592S0100000_13.l0).LLILZLL.getValue()).intValue(), new AwS379S0200000_13((KidsRelaunchPopup) awS592S0100000_13.l0, c1397630mTR, 21));
        return Unit.LIZ;
    }

    public static final Object invoke$94(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((Function1) awS592S0100000_13.l0).invoke(Integer.valueOf(((Number) obj).intValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$95(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((CountDownLatch) awS592S0100000_13.l0).countDown();
        return Unit.LIZ;
    }

    public static final Object invoke$96(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        ((CountDownLatch) awS592S0100000_13.l0).countDown();
        return Unit.LIZ;
    }

    public static final Object invoke$97(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        return C2204961BRm.LLILLL((View) awS592S0100000_13.l0, new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8J0Uat9SeALkBitrIQKAx7JPBazO8k=", null));
    }

    public static final Object invoke$98(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        return Boolean.valueOf(!((List) awS592S0100000_13.l0).contains(((BaseLoginMethod) obj).getUid()));
    }

    public static final Object invoke$99(AwS592S0100000_13 awS592S0100000_13, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((BaseLoginMethod) obj).getUid(), ((BaseLoginMethod) awS592S0100000_13.l0).getUid()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(AbstractC794590VEz abstractC794590VEz, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC794590VEz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS592S0100000_13(C805010Vhz c805010Vhz, C805010Vhz<Object> c805010Vhz2) {
        super(1);
        this.$t = c805010Vhz2;
        this.l0 = c805010Vhz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(C807950Vmj c807950Vmj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c807950Vmj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(C0WNH c0wnh, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0wnh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(C823300WRk c823300WRk, int i) {
        super(1);
        this.$t = i;
        this.l0 = c823300WRk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(C0WXO c0wxo, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0wxo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(C843080X5m c843080X5m, int i) {
        super(1);
        this.$t = i;
        this.l0 = c843080X5m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(C843130X5r c843130X5r, int i) {
        super(1);
        this.$t = i;
        this.l0 = c843130X5r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(C0X9S c0x9s, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0x9s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(InterfaceC844480XAw interfaceC844480XAw, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC844480XAw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(C0XT2 c0xt2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0xt2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(InterfaceC849390XTt interfaceC849390XTt, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC849390XTt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(DialogC972110bP7 dialogC972110bP7, int i) {
        super(1);
        this.$t = i;
        this.l0 = dialogC972110bP7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(C1237330iIt c1237330iIt, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1237330iIt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(C2252611DEt c2252611DEt, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2252611DEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(C1DFK c1dfk, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1dfk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(AObjectS362S0100000_19 aObjectS362S0100000_19, int i) {
        super(1);
        this.$t = i;
        this.l0 = aObjectS362S0100000_19;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(Uri uri, int i) {
        super(1);
        this.$t = i;
        this.l0 = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(Bundle bundle, int i) {
        super(1);
        this.$t = i;
        this.l0 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(WebResourceRequest webResourceRequest, int i) {
        super(1);
        this.$t = i;
        this.l0 = webResourceRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = multiGuestAsGuestModeratorManageDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2, int i) {
        super(1);
        this.$t = i;
        this.l0 = multiLiveAsAnchorListDialogV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(MultiGuestUserInfoFragment multiGuestUserInfoFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = multiGuestUserInfoFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(VoiceChatUserInfoFragment voiceChatUserInfoFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = voiceChatUserInfoFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(SheetDemoFragment sheetDemoFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = sheetDemoFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS592S0100000_13(CompletionBlock completionBlock, CompletionBlock<InterfaceC835900Wqi> completionBlock2) {
        super(1);
        this.$t = completionBlock2;
        this.l0 = completionBlock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(SOTLViewModel sOTLViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = sOTLViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(CommonFlowActivity commonFlowActivity, int i) {
        super(1);
        this.$t = i;
        this.l0 = commonFlowActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(EmailLinkVerifyFragment emailLinkVerifyFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = emailLinkVerifyFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(EmailOTPLoginCodeVerifyFragment emailOTPLoginCodeVerifyFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = emailOTPLoginCodeVerifyFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(InputCodeFragment inputCodeFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = inputCodeFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(InputPasswordFragment inputPasswordFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = inputPasswordFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(PhoneCodeLoginVerifyOrBindFragment phoneCodeLoginVerifyOrBindFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = phoneCodeLoginVerifyOrBindFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(BaseLoginMethod baseLoginMethod, int i) {
        super(1);
        this.$t = i;
        this.l0 = baseLoginMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(BaseUpdatePasswordFragment baseUpdatePasswordFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = baseUpdatePasswordFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(VerifyPasswordFragment verifyPasswordFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = verifyPasswordFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(BindOrModifyPhoneActivity bindOrModifyPhoneActivity, int i) {
        super(1);
        this.$t = i;
        this.l0 = bindOrModifyPhoneActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(TransparentCodeVerificationActivity transparentCodeVerificationActivity, int i) {
        super(1);
        this.$t = i;
        this.l0 = transparentCodeVerificationActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(KidsRelaunchPopup kidsRelaunchPopup, int i) {
        super(1);
        this.$t = i;
        this.l0 = kidsRelaunchPopup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(SeaPdpActivity seaPdpActivity, int i) {
        super(1);
        this.$t = i;
        this.l0 = seaPdpActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = seaPdpCreatorSheetWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(PdpActivity pdpActivity, int i) {
        super(1);
        this.$t = i;
        this.l0 = pdpActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(PdpCreatorSheetWidget pdpCreatorSheetWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = pdpCreatorSheetWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(NewPumbaaTask newPumbaaTask, int i) {
        super(1);
        this.$t = i;
        this.l0 = newPumbaaTask;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(User user, int i) {
        super(1);
        this.$t = i;
        this.l0 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(AutoLoginService autoLoginService, int i) {
        super(1);
        this.$t = i;
        this.l0 = autoLoginService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(FeedCountStickerDialogFragment feedCountStickerDialogFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = feedCountStickerDialogFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(TraceLogWrapApiImpl traceLogWrapApiImpl, int i) {
        super(1);
        this.$t = i;
        this.l0 = traceLogWrapApiImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(MultiProfilesViewModel multiProfilesViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = multiProfilesViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS592S0100000_13(Object obj, Object obj2) {
        super(1);
        this.$t = obj2;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(StringBuilder sb, int i) {
        super(1);
        this.$t = i;
        this.l0 = sb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS592S0100000_13(ArrayList arrayList, ArrayList<String> arrayList2) {
        super(1);
        this.$t = arrayList2;
        this.l0 = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS592S0100000_13(HashSet hashSet, HashSet<String> hashSet2) {
        super(1);
        this.$t = hashSet2;
        this.l0 = hashSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS592S0100000_13(List list, List<String> list2) {
        super(1);
        this.$t = list2;
        this.l0 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(Locale locale, int i) {
        super(1);
        this.$t = i;
        this.l0 = locale;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS592S0100000_13(Set set, Set<String> set2) {
        super(1);
        this.$t = set2;
        this.l0 = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(CountDownLatch countDownLatch, int i) {
        super(1);
        this.$t = i;
        this.l0 = countDownLatch;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS592S0100000_13(Function1 function1, Function1<? super Throwable, Unit> function12) {
        super(1);
        this.$t = function12;
        this.l0 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(AwS379S0200000_13 awS379S0200000_13, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS379S0200000_13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(AwS559S0100000_15 awS559S0100000_15, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS559S0100000_15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(AwS592S0100000_13 awS592S0100000_13, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS592S0100000_13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(AwS606S0100000_27 awS606S0100000_27, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS606S0100000_27;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS592S0100000_13(JSONObject jSONObject, int i) {
        super(1);
        this.$t = i;
        this.l0 = jSONObject;
    }
}
