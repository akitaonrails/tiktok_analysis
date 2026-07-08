package kotlin.jvm.internal;

import X.AbstractC1394705d3;
import X.AbstractC1690640u62;
import X.AbstractC20074613ge;
import X.C01GW;
import X.C051M;
import X.C05RG;
import X.C06LY;
import X.C06P9;
import X.C06QW;
import X.C06S8;
import X.C095E;
import X.C098200Yq;
import X.C09AY;
import X.C0SZ5;
import X.C0Y3I;
import X.C0Y8T;
import X.C0YMW;
import X.C0Z6T;
import X.C0Z9N;
import X.C0ZP4;
import X.C0ZZ5;
import X.C109F;
import X.C109I;
import X.C1163504gr;
import X.C127K;
import X.C1294120jmU;
import X.C1361705Up;
import X.C1378605aS;
import X.C1386605bk;
import X.C1394605d2;
import X.C1395105d7;
import X.C1395205d8;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13IQ;
import X.C13LP;
import X.C1413705g7;
import X.C1413805g8;
import X.C1414105gB;
import X.C1414205gC;
import X.C1440005kM;
import X.C1458505nL;
import X.C1509305vX;
import X.C1515205wU;
import X.C15438062q;
import X.C15491064r;
import X.C15493064t;
import X.C15496064w;
import X.C1580890rF1;
import X.C1582500rHc;
import X.C1582570rHj;
import X.C1601906Oz;
import X.C1628206Zc;
import X.C1628606Zg;
import X.C1628906Zj;
import X.C1629106Zl;
import X.C1636906b1;
import X.C1684506ih;
import X.C1710306mr;
import X.C1717506o1;
import X.C1727906ph;
import X.C1752006ta;
import X.C1887860zE8;
import X.C189200o6;
import X.C191984108w;
import X.C19719912Dl;
import X.C20066813fO;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C259800zU;
import X.C291001Au;
import X.C418440Gaw;
import X.C426160GnO;
import X.C426750GoL;
import X.C454640HsE;
import X.C457780HxI;
import X.C704830Rkn;
import X.C723850SaN;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817403Hg;
import X.C869590Y9l;
import X.C985403tE;
import X.EnumC1166860gTE;
import X.InterfaceC1392705cj;
import X.InterfaceC1629006Zk;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC332260D0u;
import X.InterfaceC461380I7k;
import X.InterfaceC497601wk;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS70S0300000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment.ManageAdminAssem;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import com.ss.android.ugc.aweme.chatroom.GroupChatAssem;
import com.ss.android.ugc.aweme.fcpanchor.render.debug.DebugCtaAnchorProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackReason;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.creator.CreatorAssem;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.user.UserAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.GroupCheckMsg;
import com.ss.android.ugc.aweme.im.lightinteract.api.assem.ChatRoomAlphaVideoCommonVM;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.streak.StreakAnimFeature;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.StreakAlphaVideoAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IAddStickerToFavViewModel;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.socialgame.api.experiment.EmojiGameItemConfig;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.CommentFiltersViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class AwS438S0200000_2 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 25:
                return invoke$25(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS438S0200000_2(C01GW c01gw, C01GW<? extends MessagePowerListAbility> c01gw2, C01GW<? extends ChatroomEventAbility> c01gw3) {
        super(2);
        this.$t = c01gw3;
        this.l0 = c01gw;
        this.l1 = c01gw2;
    }

    public static final Object invoke$0(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        float fFloatValue = ((Number) obj).floatValue();
        ((C05RG) awS438S0200000_2.l0).LIZ(fFloatValue, ((Number) obj2).floatValue());
        ((C817403Hg) awS438S0200000_2.l1).element = fFloatValue;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        int i;
        String str;
        View view = (View) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((C191984108w) awS438S0200000_2.l0).LIZ(null, ((C109I) awS438S0200000_2.l1).LLILLJJLI.LIZLLL);
        if (zBooleanValue) {
            i = 1;
        } else {
            i = 2;
        }
        C1413805g8 c1413805g8 = ((CommentFiltersViewModel) ((C109I) awS438S0200000_2.l1).LLILZ.getValue()).LL;
        Integer value = c1413805g8.LIZIZ.getValue();
        if (value == null || value.intValue() != i) {
            Integer value2 = c1413805g8.LIZIZ.getValue();
            c1413805g8.LIZJ.setValue(Boolean.TRUE);
            c1413805g8.LIZIZ.setValue(Integer.valueOf(i));
            C23250099c.LIZLLL(c1413805g8.LIZ, null, null, new C1413705g7(i, c1413805g8, view, value2, null), 3);
        }
        if (i == 1) {
            str = "ai_filter_on";
        } else {
            str = "ai_filter_off";
        }
        C1163504gr.LIZIZ.onEventV3(str, new C1887860zE8().LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            ((InterfaceC332260D0u) awS438S0200000_2.l0).setValue(Boolean.TRUE);
            C0ZP4 c0zp4 = (C0ZP4) ((C259800zU) awS438S0200000_2.l1).element;
            if (c0zp4 != null) {
                c0zp4.dispose();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        List<C869590Y9l> listVi2;
        ChatroomEventAbility chatroomEventAbility;
        MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) ((C01GW) awS438S0200000_2.l0).getValue();
        if (messagePowerListAbility != null && (listVi2 = messagePowerListAbility.vi2()) != null) {
            IStreakService.LJJIIZ.getClass();
            IStreakService iStreakServiceLIZ = C06LY.LIZ();
            ArrayList arrayList = new ArrayList();
            for (C869590Y9l c869590Y9l : listVi2) {
                if (iStreakServiceLIZ.m(c869590Y9l)) {
                    arrayList.add(c869590Y9l);
                }
            }
            if ((!arrayList.isEmpty()) && (chatroomEventAbility = (ChatroomEventAbility) ((C01GW) awS438S0200000_2.l1).getValue()) != null) {
                chatroomEventAbility.QU0(new C06S8(new C0Y3I("streak restore msg refresh"), arrayList));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        InterfaceC461380I7k interfaceC461380I7k;
        EmojiGameInfo emojiGameInfoLIZ;
        EmojiGameItemConfig emojiGameItemConfigLJ;
        FakeMsgOperatorService fakeMsgOperatorService;
        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) C13LP.LJJJLL((List) obj2);
        if (interfaceC1891350zJl != null) {
            ISocialGameService iSocialGameService = (ISocialGameService) awS438S0200000_2.l0;
            SessionInfo sessionInfo = (SessionInfo) awS438S0200000_2.l1;
            if ((interfaceC1891350zJl instanceof InterfaceC461380I7k) && (interfaceC461380I7k = (InterfaceC461380I7k) interfaceC1891350zJl) != null && (emojiGameInfoLIZ = C0ZZ5.LIZ(interfaceC461380I7k)) != null && (emojiGameItemConfigLJ = iSocialGameService.LJ(sessionInfo, emojiGameInfoLIZ)) != null && iSocialGameService.LJI(emojiGameItemConfigLJ) && (fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class)) != null) {
                String conversationId = interfaceC461380I7k.LLILII().LIZ.LIZ.getConversationId();
                C1684506ih c1684506ih = new C1684506ih();
                c1684506ih.LIZJ = UUID.randomUUID().toString();
                c1684506ih.LIZLLL(43);
                c1684506ih.LIZJ(C2213981Bky.LIZIZ.getApplicationContext());
                c1684506ih.LIZ(sessionInfo);
                EmojiGameInfo emojiGameInfoLIZ2 = C0ZZ5.LIZ(interfaceC461380I7k);
                if (emojiGameInfoLIZ2 != null) {
                    c1684506ih.LJFF = emojiGameInfoLIZ2;
                }
                fakeMsgOperatorService.LIZIZ(conversationId, c1684506ih, null, null, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        C01GW c01gwLIZ = C1509305vX.LIZ(new AwS546S0100000_2((Fragment) awS438S0200000_2.l0, 431));
        AssemVMLazy assemVMLazy = (AssemVMLazy) awS438S0200000_2.l1;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0ZZ5.LIZ;
        C736680Sv4.LJIIIIZZ((UIAssem) obj, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06P8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return Integer.valueOf(((C06P9) obj3).LL);
            }
        }, C736820SvI.LJ(), new AwS616S0100000_2(c01gwLIZ, (C01GW<? extends ChatroomEventAbility>) 42), 4);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        C01GW c01gwLIZ = C1509305vX.LIZ(new AwS546S0100000_2((Fragment) awS438S0200000_2.l0, 433));
        AssemVMLazy assemVMLazy = (AssemVMLazy) awS438S0200000_2.l1;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0ZZ5.LIZ;
        C736680Sv4.LJIIIIZZ((UIAssem) obj, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06P5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return Boolean.valueOf(((C06PE) obj3).LLILLL);
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(c01gwLIZ, (C01GW<? extends ChatroomEventAbility>) 44), 4);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        UIContentAssem uIContentAssem = (UIContentAssem) obj;
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        IIMSocialAvatarService imSocialAvatarService = c454640HsE.LIZIZ().getImSocialAvatarService();
        if (imSocialAvatarService.isEnabled()) {
            c454640HsE.LIZIZ().getImAvatarDuoService().LJJ(((SessionInfo) awS438S0200000_2.l0).getConversationId(), false);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((Fragment) awS438S0200000_2.l1), null, null, new C1601906Oz(imSocialAvatarService, uIContentAssem, C1509305vX.LIZ(new AwS546S0100000_2((Fragment) awS438S0200000_2.l1, 441)), C1509305vX.LIZ(new AwS546S0100000_2((Fragment) awS438S0200000_2.l1, 437)), null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        ((ISocialGameService) awS438S0200000_2.l0).LJIIJ((SessionInfo) awS438S0200000_2.l1, new C1752006ta((UIContentAssem) obj, (ISocialGameService) awS438S0200000_2.l0, (SessionInfo) awS438S0200000_2.l1));
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        AssemVMLazy assemVMLazy = (AssemVMLazy) awS438S0200000_2.l1;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0ZZ5.LIZ;
        MessageListFooterViewModel messageListFooterViewModel = (MessageListFooterViewModel) assemVMLazy.getValue();
        Context context = ((View) obj2).getContext();
        SessionInfo sessionInfo = (SessionInfo) awS438S0200000_2.l0;
        if (!sessionInfo.isReportPage()) {
            AssemViewModel.subscribe$default(messageListFooterViewModel, null, null, null, new AwS101S0400000_2(messageListFooterViewModel, sessionInfo, context, uIAssem, 2), 7, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Function0) awS438S0200000_2.l0).invoke();
        ((Function2) awS438S0200000_2.l1).invoke(obj, Boolean.valueOf(zBooleanValue));
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        ((Number) obj).intValue();
        C23250099c.LIZLLL((InterfaceC497601wk) awS438S0200000_2.l0, null, null, new C1361705Up((AbstractC1690640u62) awS438S0200000_2.l1, ((Number) obj2).intValue(), null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        View view = (View) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((C191984108w) awS438S0200000_2.l0).LIZ(null, ((C109F) awS438S0200000_2.l1).LLILLJJLI.LIZLLL);
        C1414205gC c1414205gC = ((CommentFiltersViewModel) ((C109F) awS438S0200000_2.l1).LLILZ.getValue()).LLILLL;
        Integer value = c1414205gC.LIZIZ.getValue();
        if (value == null || value.intValue() != zBooleanValue) {
            c1414205gC.LIZJ.setValue(Boolean.TRUE);
            Integer value2 = c1414205gC.LIZIZ.getValue();
            c1414205gC.LIZIZ.setValue(Integer.valueOf(zBooleanValue ? 1 : 0));
            C23250099c.LIZLLL(c1414205gC.LIZ, null, null, new C1414105gB(zBooleanValue ? 1 : 0, c1414205gC, view, value2, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        Object c098200Yq;
        long jLongValue = ((Number) obj).longValue();
        int iIntValue = ((Number) obj2).intValue();
        Constructor constructor = (Constructor) awS438S0200000_2.l0;
        try {
            c098200Yq = (ByteBuffer) ((Constructor) awS438S0200000_2.l1).newInstance(Integer.valueOf(iIntValue), constructor.newInstance(Long.valueOf(jLongValue), null));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    public static final Object invoke$21(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            C23250099c.LIZLLL(C15493064t.LIZLLL, null, null, new C1458505nL((C15496064w) awS438S0200000_2.l0, (C1397510mTF) awS438S0200000_2.l1, null), 3);
        } else {
            C15491064r.LIZIZ.getClass();
            C23250099c.LIZLLL(C15491064r.LIZLLL, null, null, new C1515205wU(null, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        float fFloatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        C817403Hg c817403Hg = (C817403Hg) awS438S0200000_2.l0;
        float f = c817403Hg.element;
        c817403Hg.element = f + ((InterfaceC1392705cj) awS438S0200000_2.l1).LIZJ(fFloatValue - f);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        long j = ((C1378605aS) obj2).LIZ;
        C1395105d7.LIZ((C1395205d8) awS438S0200000_2.l0, (C20066813fO) obj);
        C095E<AbstractC1394705d3> c095e = ((AbstractC20074613ge) awS438S0200000_2.l1).LLJJJ;
        if (c095e != null) {
            c095e.LJIIIIZZ(new C1394605d2(j));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        C723850SaN.LIZLLL(uIAssem, new AwS101S0400000_2(uIAssem, (UIAssem) awS438S0200000_2.l0, (Function1<? super C0SZ5, Unit>) obj2, (FrameLayout) awS438S0200000_2.l1, (Function1<? super C0SZ5, Unit>) 13));
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        ((Assembler) obj).RQ2((GroupChatAssem) awS438S0200000_2.l0, new AwS581S0100000_2((C13IQ) awS438S0200000_2.l1, (C13IQ<? extends UISlotAssem>) 678));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        String strLIZIZ;
        int iIntValue = ((Number) obj2).intValue();
        C127K c127k = (C127K) awS438S0200000_2.l0;
        if (((C1717506o1) ((ManageAdminAssem) awS438S0200000_2.l1).LLJ.getValue()).LLILLJJLI == C0Z9N.OWNER.getValue()) {
            AssemVMLazy assemVMLazy = ((ManageAdminAssem) awS438S0200000_2.l1).LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ManageAdminAssem.LLJIJIL;
            ManageGroupViewModel manageGroupViewModel = (ManageGroupViewModel) assemVMLazy.getValue();
            strLIZIZ = C1710306mr.LIZIZ(2131830141, Integer.valueOf(iIntValue), Integer.valueOf(((C0Z6T) manageGroupViewModel.LLIZLLLIL.getValue()).LJFF((C0Y8T) manageGroupViewModel.LLILLL.getValue())));
        } else {
            AssemVMLazy assemVMLazy2 = ((ManageAdminAssem) awS438S0200000_2.l1).LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = ManageAdminAssem.LLJIJIL;
            ManageGroupViewModel manageGroupViewModel2 = (ManageGroupViewModel) assemVMLazy2.getValue();
            strLIZIZ = C1710306mr.LIZIZ(2131830127, Integer.valueOf(iIntValue), Integer.valueOf(((C0Z6T) manageGroupViewModel2.LLIZLLLIL.getValue()).LJFF((C0Y8T) manageGroupViewModel2.LLILLL.getValue())));
        }
        c127k.setTitle(strLIZIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        String string;
        String checkMsg;
        GroupCheckMsg groupCheckMsg;
        GroupChatAssem groupChatAssem = (GroupChatAssem) awS438S0200000_2.l0;
        Context context = ((View) awS438S0200000_2.l1).getContext();
        C0YMW c0ymw = (C0YMW) ((C291001Au) obj2).LIZ();
        groupChatAssem.getClass();
        if (c0ymw == null || (checkMsg = c0ymw.getCheckMsg()) == null || checkMsg.length() == 0 || (groupCheckMsg = (GroupCheckMsg) C051M.LIZIZ(GroupCheckMsg.class, c0ymw.getCheckMsg())) == null || (string = groupCheckMsg.getStatusMsg()) == null) {
            string = context.getString(2131831450);
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJII = false;
        c1397580mTM.LJFF(2131831452);
        c1397580mTM.LIZIZ(string);
        C985403tE.LIZ(c1397580mTM, new AwS581S0100000_2(groupChatAssem, 677));
        new C1397510mTF(c1397580mTM).LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        C704830Rkn c704830Rkn;
        Function0<VideoItemParams> function0;
        VideoItemParams videoItemParamsInvoke;
        Aweme aweme;
        Map map = (Map) obj;
        Function0 function02 = (Function0) obj2;
        WeakReference weakReference = (WeakReference) awS438S0200000_2.l0;
        String aid = null;
        if (weakReference != null && (c704830Rkn = (C704830Rkn) weakReference.get()) != null && (function0 = c704830Rkn.LIZLLL) != null && (videoItemParamsInvoke = function0.invoke()) != null && (aweme = videoItemParamsInvoke.getAweme()) != null) {
            aid = aweme.getAid();
        }
        Object obj3 = ((LinkedHashMap) ((DebugCtaAnchorProvider) awS438S0200000_2.l1).LL).get(aid);
        if (obj3 == null) {
            obj3 = "register";
            if (aid != null) {
                ((DebugCtaAnchorProvider) awS438S0200000_2.l1).LL.put(aid, "register");
            }
        }
        String str = (String) obj3;
        ((DebugCtaAnchorProvider) awS438S0200000_2.l1).getClass();
        if (C1580890rF1.LIZ(map)) {
            C1580890rF1.LIZJ(str, map);
        }
        C1440005kM.LIZIZ(new IEvent() { // from class: X.05jV
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        function02.invoke();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        boolean z;
        List<BotFeedbackReason> list = (List) obj2;
        C426160GnO c426160GnO = (C426160GnO) ((CreatorAssem) awS438S0200000_2.l0).LLJJIJIIJIL.getValue();
        if (c426160GnO != null) {
            C786410Ut5.LJJJJZ(c426160GnO);
        }
        View view = (View) awS438S0200000_2.l1;
        CreatorAssem creatorAssem = (CreatorAssem) awS438S0200000_2.l0;
        ArrayList<View> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (BotFeedbackReason botFeedbackReason : list) {
            String str = botFeedbackReason.reasonText;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            C1582570rHj c1582570rHj = null;
            if (!z && botFeedbackReason.reasonId != null) {
                C1582570rHj c1582570rHj2 = new C1582570rHj(view.getContext(), null, 6);
                c1582570rHj2.LJ(botFeedbackReason.reasonText, null, null);
                c1582570rHj2.setFont(52);
                c1582570rHj2.setVariant(EnumC1166860gTE.CAPSULE);
                c1582570rHj2.setSelectionStyle(new C1582500rHc(null, null, null, null));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1582570rHj2);
                c1582570rHj2.setLayoutParams(layoutParams);
                C426750GoL.LJIIIZ(c1582570rHj2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 27);
                C786410Ut5.V8(c1582570rHj2, new ACListenerS70S0300000_2(c1582570rHj2, creatorAssem, botFeedbackReason, 0));
                c1582570rHj = c1582570rHj2;
            }
            arrayList.add(c1582570rHj);
        }
        CreatorAssem creatorAssem2 = (CreatorAssem) awS438S0200000_2.l0;
        for (View view2 : arrayList) {
            ViewGroup viewGroup = (ViewGroup) creatorAssem2.LLJJIJIIJIL.getValue();
            if (viewGroup != null) {
                viewGroup.addView(view2);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        boolean z;
        List<BotFeedbackReason> list = (List) obj2;
        C426160GnO c426160GnO = (C426160GnO) ((UserAssem) awS438S0200000_2.l0).LLJJIII.getValue();
        if (c426160GnO != null) {
            C786410Ut5.LJJJJZ(c426160GnO);
        }
        View view = (View) awS438S0200000_2.l1;
        UserAssem userAssem = (UserAssem) awS438S0200000_2.l0;
        ArrayList<View> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (BotFeedbackReason botFeedbackReason : list) {
            String str = botFeedbackReason.reasonText;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            C1582570rHj c1582570rHj = null;
            if (!z && botFeedbackReason.reasonId != null) {
                C1582570rHj c1582570rHj2 = new C1582570rHj(view.getContext(), null, 6);
                c1582570rHj2.LJ(botFeedbackReason.reasonText, null, null);
                c1582570rHj2.setFont(52);
                c1582570rHj2.setVariant(EnumC1166860gTE.CAPSULE);
                c1582570rHj2.setSelectionStyle(new C1582500rHc(null, null, null, null));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1582570rHj2);
                c1582570rHj2.setLayoutParams(layoutParams);
                C426750GoL.LJIIIZ(c1582570rHj2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 27);
                C786410Ut5.V8(c1582570rHj2, new ACListenerS70S0300000_2(c1582570rHj2, userAssem, botFeedbackReason, 1));
                c1582570rHj = c1582570rHj2;
            }
            arrayList.add(c1582570rHj);
        }
        UserAssem userAssem2 = (UserAssem) awS438S0200000_2.l0;
        for (View view2 : arrayList) {
            ViewGroup viewGroup = (ViewGroup) userAssem2.LLJJIII.getValue();
            if (viewGroup != null) {
                viewGroup.addView(view2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        C1628606Zg c1628606Zg;
        FrameLayout frameLayout;
        Function1<? super Boolean, Unit> function1;
        SessionInfo sessionInfo;
        C1294120jmU c1294120jmU;
        View viewLJLLLL;
        ViewStub viewStub;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c1628606Zg = (C1628606Zg) c291001Au.LIZ()) != null) {
            View view = (View) awS438S0200000_2.l0;
            StreakAlphaVideoAssem streakAlphaVideoAssem = (StreakAlphaVideoAssem) awS438S0200000_2.l1;
            int i = c1628606Zg.LIZ;
            DataSource dataSource = c1628606Zg.LIZIZ;
            boolean z = c1628606Zg.LIZJ;
            int i2 = c1628606Zg.LIZLLL;
            boolean z2 = c1628606Zg.LJ;
            int i3 = c1628606Zg.LJFF;
            boolean z3 = c1628606Zg.LJI;
            Bitmap bitmap = c1628606Zg.LJII;
            C1628906Zj.LIZ(view.getContext());
            C1628206Zc c1628206Zc = StreakAlphaVideoAssem.LLJJIJIIJIL;
            AssemVMLazy assemVMLazy = streakAlphaVideoAssem.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = StreakAlphaVideoAssem.LLJJIJIL;
            PanelStateViewModel panelStateViewModel = (PanelStateViewModel) assemVMLazy.getValue();
            panelStateViewModel.vQ2(C1629106Zl.LL, ((Number) panelStateViewModel.LLIZLLLIL.getValue()).intValue());
            ((ChatRoomAlphaVideoCommonVM) streakAlphaVideoAssem.LLJI.getValue()).bc(true);
            C1727906ph c1727906phLIZ = null;
            if (streakAlphaVideoAssem.LLJILJIL == null) {
                FrameLayout frameLayout2 = streakAlphaVideoAssem.LLJILJILJ;
                if (frameLayout2 == null) {
                    View viewLJJIJL = streakAlphaVideoAssem.LJJIJL();
                    if ((viewLJJIJL instanceof ViewStub) && (viewStub = (ViewStub) viewLJJIJL) != null) {
                        viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                    } else {
                        viewLJLLLL = null;
                    }
                    if (viewLJLLLL instanceof FrameLayout) {
                        frameLayout2 = (FrameLayout) viewLJLLLL;
                    } else {
                        frameLayout2 = null;
                    }
                }
                streakAlphaVideoAssem.LLJILJILJ = frameLayout2;
                if (frameLayout2 != null) {
                    c1294120jmU = (C1294120jmU) frameLayout2.findViewById(R.id.wa4);
                } else {
                    c1294120jmU = null;
                }
                streakAlphaVideoAssem.LLJILJIL = c1294120jmU;
            }
            C1294120jmU c1294120jmU2 = streakAlphaVideoAssem.LLJILJIL;
            if (c1294120jmU2 != null && (frameLayout = streakAlphaVideoAssem.LLJILJILJ) != null) {
                if (streakAlphaVideoAssem.LLJILLL == null) {
                    C06QW c06qw = StreakAnimFeature.LIZ;
                    c06qw.getClass();
                    StreakAnimFeature value = C06QW.LIZJ.getValue(c06qw, C06QW.LIZIZ[0]);
                    if (value != null) {
                        streakAlphaVideoAssem.getActualLifecycleOwner();
                        C457780HxI c457780HxI = (C457780HxI) streakAlphaVideoAssem.LLJIJIL.getValue();
                        if (c457780HxI != null && (sessionInfo = c457780HxI.LL) != null) {
                            function1 = null;
                            c1727906phLIZ = value.LIZ(streakAlphaVideoAssem, c1294120jmU2, frameLayout, sessionInfo, i, new AwS546S0100000_2(streakAlphaVideoAssem, 1219));
                        }
                    } else {
                        function1 = null;
                    }
                    streakAlphaVideoAssem.LLJILLL = c1727906phLIZ;
                } else {
                    function1 = null;
                }
                streakAlphaVideoAssem.LLJJ = function1;
                InterfaceC1629006Zk interfaceC1629006Zk = streakAlphaVideoAssem.LLJILLL;
                if (interfaceC1629006Zk != null) {
                    interfaceC1629006Zk.LIZ(z, dataSource, i2, i3, z2, z3, bitmap);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS438S0200000_2 awS438S0200000_2, Object obj, Object obj2) {
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            ((InterfaceC332260D0u) awS438S0200000_2.l0).setValue(Boolean.TRUE);
            C0ZP4 c0zp4 = (C0ZP4) ((C259800zU) awS438S0200000_2.l1).element;
            if (c0zp4 != null) {
                c0zp4.dispose();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(C817403Hg c817403Hg, InterfaceC1392705cj interfaceC1392705cj, int i) {
        super(2);
        this.$t = i;
        this.l0 = c817403Hg;
        this.l1 = interfaceC1392705cj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(C05RG c05rg, C817403Hg c817403Hg, int i) {
        super(2);
        this.$t = i;
        this.l0 = c05rg;
        this.l1 = c817403Hg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(C1386605bk c1386605bk, InterfaceC497601wk interfaceC497601wk, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC497601wk;
        this.l1 = c1386605bk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(C15496064w c15496064w, C1397510mTF c1397510mTF, int i) {
        super(2);
        this.$t = i;
        this.l0 = c15496064w;
        this.l1 = c1397510mTF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(C191984108w c191984108w, C109F c109f, int i) {
        super(2);
        this.$t = i;
        this.l0 = c191984108w;
        this.l1 = c109f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(C191984108w c191984108w, C109I c109i, int i) {
        super(2);
        this.$t = i;
        this.l0 = c191984108w;
        this.l1 = c109i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(C127K c127k, ManageAdminAssem manageAdminAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = c127k;
        this.l1 = manageAdminAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(AbstractC20074613ge abstractC20074613ge, C1395205d8 c1395205d8, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1395205d8;
        this.l1 = abstractC20074613ge;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(C2252321DDq c2252321DDq, C259800zU c259800zU, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2252321DDq;
        this.l1 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(View view, StreakAlphaVideoAssem streakAlphaVideoAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = streakAlphaVideoAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS438S0200000_2(Fragment fragment, Fragment fragment2, AssemVMLazy<C06P9, IAddStickerToFavViewModel> assemVMLazy) {
        super(2);
        this.$t = assemVMLazy;
        this.l0 = fragment;
        this.l1 = fragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(Fragment fragment, SessionInfo sessionInfo, int i) {
        super(2);
        this.$t = i;
        this.l0 = sessionInfo;
        this.l1 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(GroupChatAssem groupChatAssem, C19719912Dl c19719912Dl, int i) {
        super(2);
        this.$t = i;
        this.l0 = groupChatAssem;
        this.l1 = c19719912Dl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(GroupChatAssem groupChatAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = groupChatAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(CreatorAssem creatorAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = creatorAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(UserAssem userAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = userAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS438S0200000_2(SessionInfo sessionInfo, SessionInfo sessionInfo2, AssemVMLazy<C1636906b1, MessageListFooterViewModel> assemVMLazy) {
        super(2);
        this.$t = assemVMLazy;
        this.l0 = sessionInfo;
        this.l1 = sessionInfo2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS438S0200000_2(ISocialGameService iSocialGameService, SessionInfo sessionInfo, int i) {
        super(2);
        this.$t = i;
        this.l0 = iSocialGameService;
        this.l1 = sessionInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS438S0200000_2(WeakReference weakReference, WeakReference<C704830Rkn> weakReference2, DebugCtaAnchorProvider debugCtaAnchorProvider) {
        super(2);
        this.$t = debugCtaAnchorProvider;
        this.l0 = weakReference;
        this.l1 = weakReference2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS438S0200000_2(Constructor constructor, Constructor<? extends Object> constructor2, Constructor<? extends Object> constructor3) {
        super(2);
        this.$t = constructor3;
        this.l0 = constructor;
        this.l1 = constructor2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS438S0200000_2(Function0 function0, Function0<Unit> function02, Function2<? super View, ? super Boolean, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l0 = function0;
        this.l1 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS438S0200000_2(Function1 function1, Function1<? super C0SZ5, Unit> function12, Function1<? super C0SZ5, Unit> function13) {
        super(2);
        this.$t = function13;
        this.l0 = function1;
        this.l1 = function12;
    }
}
