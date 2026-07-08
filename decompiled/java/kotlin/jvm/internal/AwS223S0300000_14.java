package kotlin.jvm.internal;

import X.AbstractC885540Yoa;
import X.AbstractC899510ZQn;
import X.C013C;
import X.C06H2;
import X.C09AY;
import X.C09KP;
import X.C0Y3I;
import X.C0YMW;
import X.C0YMX;
import X.C0YNP;
import X.C0YPP;
import X.C0YPQ;
import X.C0YPZ;
import X.C0ZHQ;
import X.C0ZL0;
import X.C0ZQI;
import X.C0ZS7;
import X.C0ZTX;
import X.C1365830le9;
import X.C1383370m6R;
import X.C1391190mJ3;
import X.C1397620mTQ;
import X.C1397650mTT;
import X.C1397660mTU;
import X.C13IQ;
import X.C13LP;
import X.C1516540pZE;
import X.C15438062q;
import X.C1557990qe5;
import X.C1619106Vp;
import X.C1677606ha;
import X.C19719612Di;
import X.C259800zU;
import X.C291001Au;
import X.C343970De7;
import X.C457780HxI;
import X.C458020Hxg;
import X.C462510IBt;
import X.C786410Ut5;
import X.C867980Y3g;
import X.C869590Y9l;
import X.C873910YQb;
import X.C878960Ydy;
import X.C880790Ygv;
import X.C885430YoP;
import X.C888120Ysk;
import X.C888210Yst;
import X.C890330YwJ;
import X.C894390Z6v;
import X.C895900ZCq;
import X.C895910ZCr;
import X.C897090ZHf;
import X.C897200ZHq;
import X.C898020ZKu;
import X.C898480ZMo;
import X.C898490ZMp;
import X.C899580ZQu;
import X.C900960ZWc;
import X.C901890ZZr;
import X.C902380Zae;
import X.C902410Zah;
import X.C902560Zaw;
import X.C905370ZfT;
import X.C908950ZlF;
import X.C909820Zme;
import X.C912070ZqH;
import X.EnumC1365740le0;
import X.EnumC880850Yh1;
import X.EnumC900970ZWd;
import X.EnumC912680ZrG;
import X.InterfaceC1692306jx;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2257971DZj;
import X.InterfaceC873770YPn;
import X.InterfaceC877650Ybr;
import X.InterfaceC884020Ym8;
import X.InterfaceC884440Ymo;
import X.InterfaceC891770Yyd;
import Y.ACListenerS80S0300000_14;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IToastHelper;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.cell.GroupDetailMemberCell;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVMV2;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMRelationLabelInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.interactioncard.viewmodel.InteractionCardViewModel;
import com.ss.android.ugc.aweme.im.message.template.component.GreetingCardInfoComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextClickAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardReceivePowerCell$createAssemAttached2Cell$1;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.SocialActionBarDataFetchAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable.UnavailableCardCardAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.profileitem.ProfileItemViewModel;
import com.ss.android.ugc.aweme.shortvideo.PostPrompts;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.utils.ChatCustomizeMessageListViewModel;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS223S0300000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        InteractionCardViewModel interactionCardViewModel = (InteractionCardViewModel) awS223S0300000_14.l0;
        return C898480ZMo.LIZ((C898480ZMo) obj, new C898490ZMp(interactionCardViewModel.LLILLL, (String) ((C259800zU) awS223S0300000_14.l1).element, interactionCardViewModel.LLILZ, (String) ((C259800zU) awS223S0300000_14.l2).element), null, 2);
    }

    public static final Object invoke$1(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        C885430YoP c885430YoP = (C885430YoP) obj;
        return C885430YoP.LIZ(c885430YoP, null, ((MessageRequestListVM) awS223S0300000_14.l0).LQ2(((InterfaceC884020Ym8) awS223S0300000_14.l1).LIZIZ(false), c885430YoP.LLILLJJLI, c885430YoP.LL, "page_handle_current_data"), (C878960Ydy) awS223S0300000_14.l2, null, null, false, new C291001Au(Boolean.TRUE), 57);
    }

    public static final Object invoke$10(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Activity) awS223S0300000_14.l0).getString(2131828618), new AwS593S0100000_14((Function0) awS223S0300000_14.l1, (Function0<Unit>) 149));
        c1397620mTQ.LIZJ(0, ((Activity) awS223S0300000_14.l0).getString(2131828617), new AwS593S0100000_14((Function0) awS223S0300000_14.l2, (Function0<Unit>) 150));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            String strLJ = C0YNP.LJ(((RelationshipCelebrationTarget) awS223S0300000_14.l0).celebratingUserId);
            C902410Zah c902410Zah = (C902410Zah) awS223S0300000_14.l1;
            String str = ((RelationshipCelebrationTarget) awS223S0300000_14.l0).celebratingUserId;
            if (str == null) {
                c902410Zah.getClass();
            } else {
                c902410Zah.LIZLLL.put(str, Boolean.TRUE);
            }
            C902380Zae c902380Zae = (C902380Zae) awS223S0300000_14.l2;
            C902410Zah c902410Zah2 = (C902410Zah) awS223S0300000_14.l1;
            c902380Zae.getClass();
            C902380Zae.LJII(strLJ, c902410Zah2);
            ((C902380Zae) awS223S0300000_14.l2).LJI.put(strLJ, Boolean.TRUE);
            Function0<Unit> function0 = ((C902380Zae) awS223S0300000_14.l2).LJFF.get(strLJ);
            if (function0 != null) {
                function0.invoke();
            }
            ((C902380Zae) awS223S0300000_14.l2).LJFF.put(strLJ, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        C909820Zme c909820Zme = new C909820Zme((GreetingCardInfoComponent) awS223S0300000_14.l0, ((C013C) awS223S0300000_14.l1).element, (C869590Y9l) awS223S0300000_14.l2);
        obj.getClass();
        return new C908950ZlF(c909820Zme);
    }

    public static final Object invoke$13(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        String conversationId;
        ((View.OnClickListener) awS223S0300000_14.l0).onClick((View) awS223S0300000_14.l1);
        ((C1397660mTU) obj).LIZJ = true;
        SessionInfo sessionInfo = ((C901890ZZr) awS223S0300000_14.l2).LL;
        if (sessionInfo == null || (conversationId = sessionInfo.getConversationId()) == null) {
            conversationId = "";
        }
        C900960ZWc.LIZ(conversationId, EnumC900970ZWd.CONFIRM);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131831778, new AwS593S0100000_14((C901890ZZr) awS223S0300000_14.l0, 251));
        c1397620mTQ.LJII(2131831777, new AwS223S0300000_14((View.OnClickListener) awS223S0300000_14.l1, (View) awS223S0300000_14.l2, (C901890ZZr) awS223S0300000_14.l0, 13));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        int chatType;
        ((View.OnClickListener) awS223S0300000_14.l0).onClick((View) awS223S0300000_14.l1);
        ((C1397660mTU) obj).LIZJ = true;
        InterfaceC1692306jx interfaceC1692306jxLIZJ = C912070ZqH.LIZIZ.LJIJJ().LIZJ();
        String strLIZIZ = ((C901890ZZr) awS223S0300000_14.l2).LIZIZ();
        SessionInfo sessionInfo = ((C901890ZZr) awS223S0300000_14.l2).LL;
        if (sessionInfo != null) {
            chatType = sessionInfo.getChatType();
        } else {
            chatType = -1;
        }
        interfaceC1692306jxLIZJ.LIZ(null, strLIZIZ, C1677606ha.LIZ(chatType), "view");
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131831723, new AwS223S0300000_14((View.OnClickListener) awS223S0300000_14.l0, (View) awS223S0300000_14.l1, (C901890ZZr) awS223S0300000_14.l2, 15));
        c1397620mTQ.LJII(2131831720, new AwS593S0100000_14((C901890ZZr) awS223S0300000_14.l2, 253));
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        boolean zLJFF;
        String postAnyway;
        String goBack;
        String goBack2;
        String postAnyway2;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        PostPrompts postPrompts = (PostPrompts) awS223S0300000_14.l0;
        if (postPrompts != null) {
            zLJFF = Intrinsics.LJFF(postPrompts.getPostOnTrailing(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            PostPrompts postPrompts2 = (PostPrompts) awS223S0300000_14.l0;
            if (postPrompts2 != null && (postAnyway2 = postPrompts2.getPostAnyway()) != null) {
                c1397620mTQ.LIZJ(0, postAnyway2, new AwS593S0100000_14((Function0) awS223S0300000_14.l1, (Function0<Unit>) 264));
            }
            PostPrompts postPrompts3 = (PostPrompts) awS223S0300000_14.l0;
            if (postPrompts3 != null && (goBack2 = postPrompts3.getGoBack()) != null) {
                c1397620mTQ.LIZJ(1, goBack2, new AwS593S0100000_14((Function0) awS223S0300000_14.l2, (Function0<Unit>) 265));
            }
        } else {
            PostPrompts postPrompts4 = (PostPrompts) awS223S0300000_14.l0;
            if (postPrompts4 != null && (goBack = postPrompts4.getGoBack()) != null) {
                c1397620mTQ.LIZJ(0, goBack, new AwS593S0100000_14((Function0) awS223S0300000_14.l2, (Function0<Unit>) 266));
            }
            PostPrompts postPrompts5 = (PostPrompts) awS223S0300000_14.l0;
            if (postPrompts5 != null && (postAnyway = postPrompts5.getPostAnyway()) != null) {
                c1397620mTQ.LIZJ(1, postAnyway, new AwS593S0100000_14((Function0) awS223S0300000_14.l1, (Function0<Unit>) 267));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        String conversationId;
        ((Function1) awS223S0300000_14.l0).invoke((View) awS223S0300000_14.l1);
        ((C1397660mTU) obj).LIZJ = true;
        SessionInfo sessionInfo = (SessionInfo) awS223S0300000_14.l2;
        if (sessionInfo == null || (conversationId = sessionInfo.getConversationId()) == null) {
            conversationId = "";
        }
        C900960ZWc.LIZ(conversationId, EnumC900970ZWd.CONFIRM);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131831778, new AwS593S0100000_14((SessionInfo) awS223S0300000_14.l0, 272));
        c1397620mTQ.LJII(2131831777, new AwS223S0300000_14((View) awS223S0300000_14.l2, (SessionInfo) awS223S0300000_14.l0, (Function1) awS223S0300000_14.l1, 18));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        C885430YoP c885430YoP = (C885430YoP) obj;
        C291001Au c291001Au = new C291001Au(Boolean.TRUE);
        C880790Ygv c880790Ygv = C880790Ygv.LIZ;
        List<InterfaceC884440Ymo> listLIZIZ = ((InterfaceC884020Ym8) awS223S0300000_14.l0).LIZIZ(false);
        List<AbstractC885540Yoa<?>> list = c885430YoP.LLILLJJLI;
        EnumC880850Yh1 enumC880850Yh1 = c885430YoP.LL;
        boolean z = ((MessageRequestListVMV2) awS223S0300000_14.l1).LLIZLLLIL;
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14((MessageRequestListVMV2) awS223S0300000_14.l1, 412);
        c880790Ygv.getClass();
        return C885430YoP.LIZ(c885430YoP, null, C880790Ygv.LIZ(listLIZIZ, list, enumC880850Yh1, "page_handle_current_data", z, awS558S0100000_14), (C878960Ydy) awS223S0300000_14.l2, null, null, false, c291001Au, 57);
    }

    public static final Object invoke$20(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((C894390Z6v) awS223S0300000_14.l0).LIZJ, new AwS380S0200000_14((GroupDetailMemberCell) awS223S0300000_14.l1, (IMUser) awS223S0300000_14.l2, 94));
        c1397620mTQ.LIZJ(2, ((C894390Z6v) awS223S0300000_14.l0).LIZLLL, new AwS380S0200000_14((GroupDetailMemberCell) awS223S0300000_14.l1, (IMUser) awS223S0300000_14.l2, 95));
        c1397620mTQ.LIZJ(1, ((C894390Z6v) awS223S0300000_14.l0).LJ, new AwS593S0100000_14((GroupDetailMemberCell) awS223S0300000_14.l1, 302));
        ((C1397650mTT) ListProtector.get(c1397620mTQ.LJ, 1)).LIZ(AFwS248S0000000_14.get$arr$(488));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        C867980Y3g c867980Y3g = (C867980Y3g) obj;
        Boolean bool = (Boolean) awS223S0300000_14.l0;
        if (bool != null) {
            c867980Y3g.LJI = bool;
        }
        if (!((List) awS223S0300000_14.l1).isEmpty()) {
            List<String> list = (List) awS223S0300000_14.l1;
            c867980Y3g.getClass();
            C1516540pZE.LIZ(list);
            c867980Y3g.LJIIJJI = list;
        }
        if (!((List) awS223S0300000_14.l2).isEmpty()) {
            List<String> list2 = (List) awS223S0300000_14.l2;
            c867980Y3g.getClass();
            C1516540pZE.LIZ(list2);
            c867980Y3g.LJIIJ = list2;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        IMUser iMUser = (IMUser) awS223S0300000_14.l0;
        IMRelationLabelInfo iMRelationLabelInfo = (IMRelationLabelInfo) awS223S0300000_14.l1;
        ProfileItemViewModel profileItemViewModel = (ProfileItemViewModel) awS223S0300000_14.l2;
        return C895910ZCr.LIZ((C895910ZCr) obj, null, null, C895900ZCq.LIZIZ(iMUser, iMRelationLabelInfo, profileItemViewModel.LLILZLL, profileItemViewModel.LLIZLLLIL), null, 11);
    }

    public static final Object invoke$23(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        ((C898020ZKu) awS223S0300000_14.l1).LJII((C869590Y9l) awS223S0300000_14.l0, "select_text");
        ((C898020ZKu) awS223S0300000_14.l1).LJ(C0ZL0.SELECT_TEXT, new AwS558S0100000_14((Function0) awS223S0300000_14.l2, 1621));
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        String secUid;
        int iIntValue;
        IVibeEntranceService iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
        if (iVibeEntranceServiceLIZ != null) {
            String conversationId = ((SocialActionBarDataFetchAssem) awS223S0300000_14.l0).mo().getConversationId();
            Integer num = ((SocialActionBarDataFetchAssem) awS223S0300000_14.l0).oo().getState().LLILLJJLI;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            iVibeEntranceServiceLIZ.LJIIIIZZ(conversationId, "shared_feed_action_bar", iIntValue, (EnumC912680ZrG) awS223S0300000_14.l1);
        }
        IVibeEntranceService iVibeEntranceServiceLIZ2 = C1557990qe5.LIZ();
        if (iVibeEntranceServiceLIZ2 != null) {
            Context context = (Context) awS223S0300000_14.l2;
            String conversationId2 = ((SocialActionBarDataFetchAssem) awS223S0300000_14.l0).mo().getConversationId();
            String singleChatFromUserId = ((SocialActionBarDataFetchAssem) awS223S0300000_14.l0).mo().getSingleChatFromUserId();
            if (singleChatFromUserId == null) {
                singleChatFromUserId = "";
            }
            IMUser singleChatFromUser = ((SocialActionBarDataFetchAssem) awS223S0300000_14.l0).mo().getSingleChatFromUser();
            if (singleChatFromUser != null) {
                secUid = singleChatFromUser.getSecUid();
            } else {
                secUid = null;
            }
            iVibeEntranceServiceLIZ2.LJI(context, conversationId2, singleChatFromUserId, secUid, "shared_feed_action_bar", C06H2.CHAT.getValue(), null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        List list = (List) awS223S0300000_14.l0;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            List<C888120Ysk> selectedOptionList = ((C888210Yst) it2.next()).getSelectedOptionList();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(selectedOptionList, 10));
            Iterator<C888120Ysk> it3 = selectedOptionList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().LIZIZ);
            }
            C19719612Di.LJJI(arrayList2, arrayList);
        }
        ((TuxNavBar) awS223S0300000_14.l2).LJJ(new AwS29S0010000_14(!Intrinsics.LJFF(C13LP.LLIIJI(arrayList), (Set) awS223S0300000_14.l1), 10), "end_action");
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        View view = (View) obj;
        C902560Zaw.LIZ(view.getContext(), String.valueOf(((Function1) awS223S0300000_14.l0).invoke(view)));
        IToastHelper.LIZ.getClass();
        IToastHelper iToastHelperLIZ = C1365830le9.LIZ();
        if (iToastHelperLIZ != null) {
            iToastHelperLIZ.LIZ(EnumC1365740le0.TOP, C1383370m6R.LJIIJ(2131831119), 3000L, AFwS201S0000000_14.get$arr$(291), false, 0, false, UUID.randomUUID().toString(), C0ZTX.LIZ);
        }
        ((C0ZQI) awS223S0300000_14.l1).LJII((C869590Y9l) awS223S0300000_14.l2, "copy");
        ((C0ZQI) awS223S0300000_14.l1).LJ(C0ZL0.COPY, null);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        C899580ZQu c899580ZQu = (C899580ZQu) obj;
        c899580ZQu.LIZIZ = ((AwemeCardReceivePowerCell$createAssemAttached2Cell$1) awS223S0300000_14.l0).Ep();
        c899580ZQu.LIZ(C462510IBt.LIZ, new AwS380S0200000_14((C13IQ) awS223S0300000_14.l1, (C13IQ<? extends ReusedSkeletonUISlotAssem<SideMessageStatusReusedSkeletonUISlot, MessageLeftIconState>>) awS223S0300000_14.l2, (AbstractC899510ZQn<?, MessageLeftIconState>) 34));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        String conversationId;
        SessionInfo sessionInfo;
        SessionInfo sessionInfo2;
        String conversationId2;
        boolean z;
        SessionInfo sessionInfo3;
        SessionInfo sessionInfo4;
        ((C897090ZHf) ((SkeletonLayoutAssembler) awS223S0300000_14.l0).LLJJJ.getValue()).LIZIZ.add(new Pair<>(((C0ZHQ) awS223S0300000_14.l1).LIZ, ((C869590Y9l) awS223S0300000_14.l2).getUuid()));
        AssemVMLazy assemVMLazy = ((SkeletonLayoutAssembler) awS223S0300000_14.l0).LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SkeletonLayoutAssembler.LLJLLL;
        boolean z2 = true;
        ((ChatCustomizeMessageListViewModel) assemVMLazy.getValue()).LL = true;
        IChatCustomizeHelper.LIZ.getClass();
        IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
        if (iChatCustomizeHelperLIZ != null) {
            C457780HxI c457780HxIFo = ((SkeletonLayoutAssembler) awS223S0300000_14.l0).fo();
            if (c457780HxIFo != null && (sessionInfo4 = c457780HxIFo.LL) != null) {
                conversationId2 = sessionInfo4.getConversationId();
            } else {
                conversationId2 = null;
            }
            C457780HxI c457780HxIFo2 = ((SkeletonLayoutAssembler) awS223S0300000_14.l0).fo();
            if (c457780HxIFo2 != null && (sessionInfo3 = c457780HxIFo2.LL) != null && sessionInfo3.isGroupChat()) {
                z = true;
            } else {
                z = false;
            }
            iChatCustomizeHelperLIZ.openCustomizeFragment(conversationId2, z, (InterfaceC2257971DZj) new InterfaceC2257971DZj() { // from class: X.0ZHR
                @Override // X.InterfaceC2257971DZj
                public final String getEnterMethod() {
                    return "chat_message_hint";
                }
            }, false, "settable");
        }
        C457780HxI c457780HxIFo3 = ((SkeletonLayoutAssembler) awS223S0300000_14.l0).fo();
        if (c457780HxIFo3 == null || (sessionInfo2 = c457780HxIFo3.LL) == null || (conversationId = sessionInfo2.getConversationId()) == null) {
            conversationId = "";
        }
        C457780HxI c457780HxIFo4 = ((SkeletonLayoutAssembler) awS223S0300000_14.l0).fo();
        if (c457780HxIFo4 == null || (sessionInfo = c457780HxIFo4.LL) == null || !sessionInfo.isGroupChat()) {
            z2 = false;
        }
        C897200ZHq.LIZ(conversationId, z2, "change_bubble_style_guide");
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        CharSequence charSequenceLJIILL;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0ZS7 c0zs7 = (C0ZS7) ((TextTranslateAssem) awS223S0300000_14.l0).bo();
        if (c0zs7 != null) {
            charSequenceLJIILL = c0zs7.LJIILL();
        } else {
            charSequenceLJIILL = null;
        }
        if (Intrinsics.LJFF(charSequenceLJIILL, ((C0ZS7) awS223S0300000_14.l1).LJIILL()) && zBooleanValue) {
            C786410Ut5.I7(new ACListenerS80S0300000_14((MessageListTextClickAbility) awS223S0300000_14.l2, (TextTranslateAssem) awS223S0300000_14.l0, (C0ZS7) awS223S0300000_14.l1, 5), ((TextTranslateAssem) awS223S0300000_14.l0).getContentView());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131831723, new AwS223S0300000_14((C869590Y9l) awS223S0300000_14.l0, (UnavailableCardCardAssem) awS223S0300000_14.l1, (SessionInfo) awS223S0300000_14.l2, 7));
        c1397620mTQ.LJII(2131831720, new AwS380S0200000_14((C869590Y9l) awS223S0300000_14.l0, (SessionInfo) awS223S0300000_14.l2, 38));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS223S0300000_14 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS223S0300000_14.invoke$7(kotlin.jvm.internal.AwS223S0300000_14, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, X.0YPZ] */
    public static final Object invoke$8(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        C09KP c09kp;
        Exception exc = (Exception) obj;
        C0Y3I c0y3iLIZ = ((C0Y3I) ((C905370ZfT) awS223S0300000_14.l0).LIZIZ.getValue()).LIZ();
        C869590Y9l c869590Y9l = ((C873910YQb) awS223S0300000_14.l1).LIZ;
        Integer numValueOf = null;
        if (c869590Y9l != null) {
            c869590Y9l.setMsgStatus(3);
        } else {
            c869590Y9l = null;
        }
        C458020Hxg.LIZ(c0y3iLIZ, c869590Y9l);
        if ((exc instanceof C09KP) && (c09kp = (C09KP) exc) != null) {
            numValueOf = Integer.valueOf(c09kp.getErrorCode());
        }
        C0YMX c0ymxNewBuilder = C0YMW.newBuilder();
        c0ymxNewBuilder.LIZ.throwable = exc;
        if (numValueOf != null) {
            c0ymxNewBuilder.LIZ.code = numValueOf.intValue();
        }
        C0YMW c0ymw = c0ymxNewBuilder.LIZ;
        C259800zU c259800zU = (C259800zU) awS223S0300000_14.l2;
        C0YPQ.Companion.getClass();
        c259800zU.element = new C0YPZ(C0YPP.LIZIZ(c0ymw));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS223S0300000_14 awS223S0300000_14, Object obj) {
        ((Boolean) obj).booleanValue();
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((LinearLayout) awS223S0300000_14.l0, C343970De7.LIZ);
        ((InterfaceC891770Yyd) awS223S0300000_14.l1).LIZLLL((Context) awS223S0300000_14.l2);
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LIZIZ().LJIIIIZZ("click_messaging_settings_option", ((InterfaceC891770Yyd) awS223S0300000_14.l1).LJ());
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS223S0300000_14(android.view.View.OnClickListener r3, android.view.View r4, X.C901890ZZr r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 13: goto L11;
                case 14: goto L5;
                case 15: goto L11;
                case 16: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS223S0300000_14.<init>(android.view.View$OnClickListener, android.view.View, X.0ZZr, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS223S0300000_14(C869590Y9l c869590Y9l, C869590Y9l c869590Y9l2, C898020ZKu c898020ZKu, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = c869590Y9l;
        this.l1 = c869590Y9l2;
        this.l2 = c898020ZKu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(C869590Y9l c869590Y9l, C0ZQI c0zqi, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.l0 = function1;
        this.l1 = c0zqi;
        this.l2 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(C869590Y9l c869590Y9l, UnavailableCardCardAssem unavailableCardCardAssem, SessionInfo sessionInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = c869590Y9l;
        this.l1 = unavailableCardCardAssem;
        this.l2 = sessionInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(InterfaceC884020Ym8 interfaceC884020Ym8, MessageRequestListVMV2 messageRequestListVMV2, C878960Ydy c878960Ydy, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC884020Ym8;
        this.l1 = messageRequestListVMV2;
        this.l2 = c878960Ydy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(C894390Z6v c894390Z6v, GroupDetailMemberCell groupDetailMemberCell, IMUser iMUser, int i) {
        super(1);
        this.$t = i;
        this.l0 = c894390Z6v;
        this.l1 = groupDetailMemberCell;
        this.l2 = iMUser;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS223S0300000_14(C905370ZfT c905370ZfT, C905370ZfT c905370ZfT2, C873910YQb c873910YQb, C259800zU<InterfaceC873770YPn> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = c905370ZfT;
        this.l1 = c905370ZfT2;
        this.l2 = c873910YQb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(Activity activity, AwS415S0200000_14 awS415S0200000_14, AwS258S0300000_14 awS258S0300000_14, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = awS415S0200000_14;
        this.l2 = awS258S0300000_14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(View view, SessionInfo sessionInfo, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.l0 = function1;
        this.l1 = view;
        this.l2 = sessionInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(View view, SessionInfo sessionInfo, AwS32S0600000_14 awS32S0600000_14, int i) {
        super(1);
        this.$t = i;
        this.l0 = sessionInfo;
        this.l1 = awS32S0600000_14;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(LinearLayout linearLayout, InterfaceC891770Yyd interfaceC891770Yyd, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = linearLayout;
        this.l1 = interfaceC891770Yyd;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(MessageRequestListVM messageRequestListVM, InterfaceC884020Ym8 interfaceC884020Ym8, C878960Ydy c878960Ydy, int i) {
        super(1);
        this.$t = i;
        this.l0 = messageRequestListVM;
        this.l1 = interfaceC884020Ym8;
        this.l2 = c878960Ydy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(RelationshipCelebrationTarget relationshipCelebrationTarget, C902410Zah c902410Zah, C902380Zae c902380Zae, int i) {
        super(1);
        this.$t = i;
        this.l0 = relationshipCelebrationTarget;
        this.l1 = c902410Zah;
        this.l2 = c902380Zae;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(IMUser iMUser, IMRelationLabelInfo iMRelationLabelInfo, ProfileItemViewModel profileItemViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = iMUser;
        this.l1 = iMRelationLabelInfo;
        this.l2 = profileItemViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS223S0300000_14(InteractionCardViewModel interactionCardViewModel, InteractionCardViewModel interactionCardViewModel2, C259800zU<String> c259800zU, C259800zU<String> c259800zU2) {
        super(1);
        this.$t = c259800zU2;
        this.l0 = interactionCardViewModel;
        this.l1 = interactionCardViewModel2;
        this.l2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(GreetingCardInfoComponent greetingCardInfoComponent, C013C c013c, C869590Y9l c869590Y9l, int i) {
        super(1);
        this.$t = i;
        this.l0 = greetingCardInfoComponent;
        this.l1 = c013c;
        this.l2 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(MessageListTextClickAbility messageListTextClickAbility, TextTranslateAssem textTranslateAssem, C0ZS7 c0zs7, int i) {
        super(1);
        this.$t = i;
        this.l0 = textTranslateAssem;
        this.l1 = c0zs7;
        this.l2 = messageListTextClickAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS223S0300000_14(AwemeCardReceivePowerCell$createAssemAttached2Cell$1 awemeCardReceivePowerCell$createAssemAttached2Cell$1, AwemeCardReceivePowerCell$createAssemAttached2Cell$1 awemeCardReceivePowerCell$createAssemAttached2Cell$12, C13IQ<? extends ReusedSkeletonUISlotAssem<SideMessageStatusReusedSkeletonUISlot, MessageLeftIconState>> c13iq, AbstractC899510ZQn<?, MessageLeftIconState> abstractC899510ZQn) {
        super(1);
        this.$t = abstractC899510ZQn;
        this.l0 = awemeCardReceivePowerCell$createAssemAttached2Cell$1;
        this.l1 = awemeCardReceivePowerCell$createAssemAttached2Cell$12;
        this.l2 = c13iq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(SocialActionBarDataFetchAssem socialActionBarDataFetchAssem, EnumC912680ZrG enumC912680ZrG, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = socialActionBarDataFetchAssem;
        this.l1 = enumC912680ZrG;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(SkeletonLayoutAssembler skeletonLayoutAssembler, C0ZHQ c0zhq, C869590Y9l c869590Y9l, int i) {
        super(1);
        this.$t = i;
        this.l0 = skeletonLayoutAssembler;
        this.l1 = c0zhq;
        this.l2 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS223S0300000_14(PostPrompts postPrompts, AwS415S0200000_14 awS415S0200000_14, AwS415S0200000_14 awS415S0200000_142, int i) {
        super(1);
        this.$t = i;
        this.l0 = postPrompts;
        this.l1 = awS415S0200000_14;
        this.l2 = awS415S0200000_142;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS223S0300000_14(Boolean bool, Boolean bool2, List<String> list, List<String> list2) {
        super(1);
        this.$t = list2;
        this.l0 = bool;
        this.l1 = bool2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS223S0300000_14(List list, List<C888210Yst> list2, Set<InterfaceC877650Ybr> set, TuxNavBar tuxNavBar) {
        super(1);
        this.$t = tuxNavBar;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = set;
    }
}
