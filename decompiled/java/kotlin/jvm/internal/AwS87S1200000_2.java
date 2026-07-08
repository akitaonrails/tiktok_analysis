package kotlin.jvm.internal;

import X.AnonymousClass0608;
import X.AnonymousClass0957;
import X.C051M;
import X.C05WK;
import X.C060B;
import X.C099G;
import X.C09AY;
import X.C0PEM;
import X.C0SZ4;
import X.C0Y8T;
import X.C0YSQ;
import X.C1397620mTQ;
import X.C13IQ;
import X.C1505505uv;
import X.C1536005zq;
import X.C1601006Oq;
import X.C1623606Xi;
import X.C1687906jF;
import X.C1701806lU;
import X.C1735506qv;
import X.C1737106rB;
import X.C1748406t0;
import X.C1750506tL;
import X.C1769006wK;
import X.C189200o6;
import X.C1CA0;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2252611DEt;
import X.C2254708sT;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C461720I8s;
import X.C491201vi;
import X.C696620RUe;
import X.C724240Sb0;
import X.C869590Y9l;
import X.C874150YQz;
import X.C909290Zln;
import X.EnumC880090Yfn;
import X.InterfaceC1364105Vn;
import X.InterfaceC1566906Bn;
import X.InterfaceC1573006Dw;
import X.InterfaceC20236714Gf;
import X.InterfaceC699620RcO;
import X.InterfaceC876950Yaj;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackReason;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelConfig;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.user.UserPanelViewModel;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.vm.ChatCommonViewModelImpl;
import com.ss.android.ugc.aweme.socialgame.api.experiment.EmojiGameItemConfig;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarBaseComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public class AwS87S1200000_2 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS87S1200000_2.l1;
        c0sz4.LLJI = new AwS546S0100000_2((FrameLayout) awS87S1200000_2.l2, 800);
        c0sz4.LLILLJJLI = awS87S1200000_2.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        C696620RUe c696620RUe = (C696620RUe) obj;
        c696620RUe.LL = (C13IQ) awS87S1200000_2.l1;
        c696620RUe.LLJ = (FrameLayout) awS87S1200000_2.l2;
        c696620RUe.LLILLJJLI = awS87S1200000_2.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        C060B c060b = (C060B) obj;
        FeedbackPanelConfig feedbackPanelConfig = ((UserPanelViewModel) awS87S1200000_2.l1).LL.getValue().LL;
        AnonymousClass0608 anonymousClass0608 = AnonymousClass0608.LIZ;
        Set<BotFeedbackReason> set = c060b.LLILLL;
        anonymousClass0608.getClass();
        AnonymousClass0608.LIZIZ(feedbackPanelConfig, AnonymousClass0608.LIZJ(set), "submit", !a0.LJJJIL(awS87S1200000_2.s0));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1536005zq(feedbackPanelConfig, c060b, awS87S1200000_2.s0, (View) awS87S1200000_2.l2, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        String singleChatFromUserId;
        Long lLJIILIIL;
        List list = (List) obj;
        C909290Zln c909290ZlnVQ2 = ((BusinessChatLandingMsgVM) awS87S1200000_2.l1).vQ2();
        if (c909290ZlnVQ2 != null) {
            ((BusinessChatLandingMsgVM) awS87S1200000_2.l1).DQ2(c909290ZlnVQ2.getConversationId());
        }
        C909290Zln c909290ZlnVQ22 = ((BusinessChatLandingMsgVM) awS87S1200000_2.l1).vQ2();
        if (c909290ZlnVQ22 != null && (singleChatFromUserId = c909290ZlnVQ22.getSingleChatFromUserId()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(singleChatFromUserId)) != null) {
            BusinessChatLandingMsgVM businessChatLandingMsgVM = (BusinessChatLandingMsgVM) awS87S1200000_2.l1;
            C23250099c.LIZLLL(businessChatLandingMsgVM.getAssemVMScope(), C0PEM.LIZJ, null, new C1737106rB(lLJIILIIL.longValue(), businessChatLandingMsgVM, awS87S1200000_2.s0, list, (InterfaceC1364105Vn) awS87S1200000_2.l2, null), 2);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS87S1200000_2.l2;
            if (interfaceC1364105Vn != null) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC1364105Vn.resumeWith(unit);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        SystemContent systemContent;
        SystemContent.Key[] template;
        Integer num;
        String string;
        if (((Boolean) obj).booleanValue() && !((SessionInfo) awS87S1200000_2.l1).isChatroomAnalyticsBlocked() && (systemContent = (SystemContent) awS87S1200000_2.l2) != null && (template = systemContent.getTemplate()) != null) {
            int length = template.length;
            int i = 0;
            while (true) {
                EmojiGameItemConfig emojiGameItemConfig = null;
                if (i >= length) {
                    break;
                }
                SystemContent.Key key = template[i];
                if (key.getAction() == 43) {
                    String link = key.getLink();
                    if (link != null) {
                        C1701806lU c1701806lU = C1701806lU.LIZ;
                        String singleChatFromUserId = ((SessionInfo) awS87S1200000_2.l1).getSingleChatFromUserId();
                        c1701806lU.getClass();
                        String strLIZ = C1701806lU.LIZ(link, singleChatFromUserId);
                        if (strLIZ != null) {
                            Iterator<EmojiGameItemConfig> it2 = C1505505uv.LIZ().gameList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                EmojiGameItemConfig next = it2.next();
                                if (Intrinsics.LJFF(next.path, strLIZ)) {
                                    emojiGameItemConfig = next;
                                    break;
                                }
                            }
                            EmojiGameItemConfig emojiGameItemConfig2 = emojiGameItemConfig;
                            if (emojiGameItemConfig2 != null && (num = emojiGameItemConfig2.id) != null && (string = num.toString()) != null) {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                String str = awS87S1200000_2.s0;
                                SessionInfo sessionInfo = (SessionInfo) awS87S1200000_2.l1;
                                c2344009Gk.LJFF("enter_from", "chat");
                                c2344009Gk.LJFF("enter_method", str);
                                c2344009Gk.LJFF("game_id", string);
                                c2344009Gk.LJII(C1687906jF.LIZ(sessionInfo));
                                C20684815ws.LJIILLIIL("ttsocial_chat_emoji_game_show", c2344009Gk.LIZ);
                            }
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        View view;
        C696620RUe c696620RUe = (C696620RUe) obj;
        c696620RUe.LL = (C13IQ) awS87S1200000_2.l1;
        c696620RUe.LLILLJJLI = awS87S1200000_2.s0;
        Fragment fragmentLJI = C724240Sb0.LJI((ProfileNavBarBaseComponent) awS87S1200000_2.l2);
        if (fragmentLJI == null || (view = fragmentLJI.getView()) == null) {
            view = new View(((ProfileNavBarBaseComponent) awS87S1200000_2.l2).getContext());
        }
        c696620RUe.LLJ = view;
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        ((InterfaceC1566906Bn) obj).LIZLLL(awS87S1200000_2.s0, (StreakData) awS87S1200000_2.l1, (StreakData) awS87S1200000_2.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        C1601006Oq c1601006Oq = C1601006Oq.LIZ;
        Activity activity = (Activity) awS87S1200000_2.l1;
        String str = awS87S1200000_2.s0;
        Function0 function0 = (Function0) awS87S1200000_2.l2;
        c1601006Oq.getClass();
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJ(str, new C1769006wK(activity, function0, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJ(2131835949, new AwS87S1200000_2((Function0) awS87S1200000_2.l2, (Activity) awS87S1200000_2.l1, awS87S1200000_2.s0, 15));
        c1397620mTQ.LJII(R.string.f1_, null);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        List<C1735506qv> list = ((C1750506tL) awS87S1200000_2.l1).LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = awS87S1200000_2.s0;
        ByteString byteString = (ByteString) awS87S1200000_2.l2;
        obj.getClass();
        return C1748406t0.LIZ(list, jCurrentTimeMillis, str, byteString);
    }

    public static final Object invoke$2(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl = (LyricStickerEffectDownloadServiceImpl) awS87S1200000_2.l1;
        ConcurrentHashMap<String, AnonymousClass0957<C189200o6<C05WK>>> concurrentHashMap = lyricStickerEffectDownloadServiceImpl.LJ;
        String str = awS87S1200000_2.s0;
        AnonymousClass0957<C189200o6<C05WK>> anonymousClass0957 = (AnonymousClass0957) awS87S1200000_2.l2;
        synchronized (concurrentHashMap) {
            try {
                if (lyricStickerEffectDownloadServiceImpl.LJ.get(str) == anonymousClass0957) {
                    lyricStickerEffectDownloadServiceImpl.LJ.remove(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        C874150YQz c874150YQz = C874150YQz.LIZ;
        C0Y8T c0y8t = (C0Y8T) awS87S1200000_2.l1;
        EnumC880090Yfn enumC880090Yfn = EnumC880090Yfn.MENTION;
        c874150YQz.getClass();
        List listLIZ = C874150YQz.LIZ(c0y8t, enumC880090Yfn);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listLIZ) {
            if (((C869590Y9l) obj2).isMention(C461720I8s.LIZJ())) {
                arrayList.add(obj2);
            }
        }
        C874150YQz c874150YQz2 = C874150YQz.LIZ;
        C0Y8T c0y8t2 = (C0Y8T) awS87S1200000_2.l1;
        EnumC880090Yfn enumC880090Yfn2 = EnumC880090Yfn.SEND_BY_OWNER;
        c874150YQz2.getClass();
        ((ChatCommonViewModelImpl) awS87S1200000_2.l2).setState(new AwS581S0100000_2(new C491201vi(awS87S1200000_2.s0, Long.valueOf(((C0Y8T) awS87S1200000_2.l1).getUnreadCount()), Long.valueOf(((C0Y8T) awS87S1200000_2.l1).getReadIndex()), new C1623606Xi(arrayList), new C1623606Xi(C874150YQz.LIZ(c0y8t2, enumC880090Yfn2))), 382));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        View view;
        C696620RUe c696620RUe = (C696620RUe) obj;
        c696620RUe.LL = (C13IQ) awS87S1200000_2.l1;
        c696620RUe.LLILLJJLI = awS87S1200000_2.s0;
        Fragment fragmentLJI = C724240Sb0.LJI((HeaderBaseContainerComponent) awS87S1200000_2.l2);
        if (fragmentLJI == null || (view = fragmentLJI.getView()) == null) {
            view = new View(((HeaderBaseContainerComponent) awS87S1200000_2.l2).getContext());
        }
        c696620RUe.LLJ = view;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS87S1200000_2.l1;
        c0sz4.LLJI = new AwS546S0100000_2((FrameLayout) awS87S1200000_2.l2, 969);
        c0sz4.LLILLJJLI = awS87S1200000_2.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        ((InterfaceC20236714Gf) awS87S1200000_2.l1).LJJIIZ(null);
        ((C2254708sT) awS87S1200000_2.l2).LIZIZ().remove(awS87S1200000_2.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            EmojiGameInfo emojiGameInfo = (EmojiGameInfo) GsonProtectorUtils.fromJson(C051M.LIZ, awS87S1200000_2.s0, EmojiGameInfo.class);
            ISocialGameService iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpi$default(ISocialGameService.class, false, false, false, 14, null);
            if (iSocialGameService != null) {
                iSocialGameService.LJIIIZ((Context) awS87S1200000_2.l1, emojiGameInfo, (SessionInfo) awS87S1200000_2.l2, C2097608Jq.LJIIIIZZ(new Pair("enter_from", "chat"), new Pair("enter_method", "guide_inline")));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        ((InterfaceC699620RcO) obj).LIZIZ(awS87S1200000_2.s0, "STANDARD", (Boolean) awS87S1200000_2.l1, (Boolean) awS87S1200000_2.l2, null, null);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS87S1200000_2 awS87S1200000_2, Object obj) {
        ((InterfaceC1573006Dw) obj).Q1((StreakPetData) awS87S1200000_2.l1, awS87S1200000_2.s0, (List) awS87S1200000_2.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1200000_2(C1750506tL c1750506tL, ByteString byteString, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1750506tL;
        this.s0 = "welcome_message";
        this.l2 = byteString;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS87S1200000_2(android.widget.FrameLayout r3, java.lang.String r4, X.C13IQ r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 0: goto L11;
                case 5: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r5
            r1.l2 = r3
            r1.s0 = r4
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r5
            r1.s0 = r4
            r1.l2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS87S1200000_2.<init>(android.widget.FrameLayout, java.lang.String, X.13IQ, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1200000_2(C0Y8T c0y8t, String str, ChatCommonViewModelImpl chatCommonViewModelImpl, int i) {
        super(1);
        this.$t = i;
        this.l1 = c0y8t;
        this.s0 = str;
        this.l2 = chatCommonViewModelImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS87S1200000_2(C13IQ c13iq, C13IQ<? extends UIContentAssem> c13iq2, String str, HeaderBaseContainerComponent headerBaseContainerComponent) {
        super(1);
        this.$t = headerBaseContainerComponent;
        this.l1 = c13iq;
        this.s0 = c13iq2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS87S1200000_2(C13IQ c13iq, C13IQ<? extends UIContentAssem> c13iq2, String str, ProfileNavBarBaseComponent profileNavBarBaseComponent) {
        super(1);
        this.$t = profileNavBarBaseComponent;
        this.l1 = c13iq;
        this.s0 = c13iq2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1200000_2(C2252611DEt c2252611DEt, C2254708sT c2254708sT, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c2252611DEt;
        this.l2 = c2254708sT;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1200000_2(Context context, SessionInfo sessionInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = context;
        this.l2 = sessionInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1200000_2(UserPanelViewModel userPanelViewModel, String str, View view, int i) {
        super(1);
        this.$t = i;
        this.l1 = userPanelViewModel;
        this.s0 = str;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS87S1200000_2(BusinessChatLandingMsgVM businessChatLandingMsgVM, BusinessChatLandingMsgVM businessChatLandingMsgVM2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn, String str) {
        super(1);
        this.$t = str;
        this.l1 = businessChatLandingMsgVM;
        this.l2 = businessChatLandingMsgVM2;
        this.s0 = interfaceC1364105Vn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1200000_2(SessionInfo sessionInfo, SystemContent systemContent, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = sessionInfo;
        this.l2 = systemContent;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS87S1200000_2(StreakPetData streakPetData, StreakPetData streakPetData2, String str, List<C1CA0> list) {
        super(1);
        this.$t = list;
        this.l1 = streakPetData;
        this.s0 = streakPetData2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1200000_2(LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl, String str, C099G c099g, int i) {
        super(1);
        this.$t = i;
        this.l1 = lyricStickerEffectDownloadServiceImpl;
        this.s0 = str;
        this.l2 = c099g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1200000_2(String str, StreakData streakData, StreakData streakData2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = streakData;
        this.l2 = streakData2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1200000_2(String str, Boolean bool, Boolean bool2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = bool;
        this.l2 = bool2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1200000_2(Function0 function0, Activity activity, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = activity;
        this.s0 = str;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1200000_2(AwS546S0100000_2 awS546S0100000_2, Activity activity, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = activity;
        this.s0 = str;
        this.l2 = awS546S0100000_2;
    }
}
