package kotlin.jvm.internal;

import X.AbstractC1711506n3;
import X.AbstractC738140SxQ;
import X.C007O;
import X.C01GW;
import X.C05QS;
import X.C09AY;
import X.C0O26;
import X.C0SY7;
import X.C0YAE;
import X.C0ZJ4;
import X.C0ZYL;
import X.C0ZZ5;
import X.C123100dR;
import X.C1233404s8;
import X.C1261860iwS;
import X.C1336205Ku;
import X.C13LP;
import X.C1462005nu;
import X.C1509305vX;
import X.C15438062q;
import X.C1558520qew;
import X.C1684506ih;
import X.C18JY;
import X.C1908480zlO;
import X.C20663515tR;
import X.C2097608Jq;
import X.C2201941BFw;
import X.C2217381BqS;
import X.C234400vO;
import X.C291001Au;
import X.C300830Bqj;
import X.C343040Dcc;
import X.C426770GoN;
import X.C539110LCj;
import X.C595660NXw;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C888640Yta;
import X.C896480ZEw;
import X.C897280ZHy;
import X.C897400ZIk;
import X.C897430ZIn;
import X.C897520ZIw;
import X.C898490ZMp;
import X.C902980Zbc;
import X.C903120Zbq;
import X.C908790Zkz;
import X.C908800Zl0;
import X.EnumC912680ZrG;
import X.InterfaceC1398730mVD;
import X.InterfaceC21676019sM;
import X.InterfaceC2217461Bqa;
import X.InterfaceC539120LCk;
import X.InterfaceC902970Zbb;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.analytics.IIMRecUserAnalytics;
import com.ss.android.ugc.aweme.assem.GreetingCardPopupAssem;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.cell.GroupDetailMemberCell;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.actionbar.api.protocol.RemoteIconAndTitleWithDotCell;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui.MafChatListWidgetV2;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.NewSessionListSingleChatVH;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarRightAssem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.lightinteract.api.vm.AbsChatPageLightInteractionViewModel;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeEntranceFeature;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.collapse.CollapseInlinePowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.collapse.CollapseInlineVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.CommonMessageListConfigKt$onSendMessageStatsTracker$businessLogicConfig$1$1;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.interactioncard.InteractionCardAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.networkstate.ChatRoomNetworkStateViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.GroupChatMessageStatusReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.InlineLabelReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public class AwS450S0200000_14 extends C09AY implements Function2 {
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
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS450S0200000_14(androidx.fragment.app.Fragment r3, com.bytedance.assem.arch.viewModel.AssemVMLazy r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 7 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS450S0200000_14.<init>(androidx.fragment.app.Fragment, com.bytedance.assem.arch.viewModel.AssemVMLazy, int):void");
    }

    public static final Object invoke$0(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        ((GroupChatMessageStatusReusedSkeletonUIContent) obj).Bp((C869590Y9l) awS450S0200000_14.l0, (C007O) awS450S0200000_14.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$1(kotlin.jvm.internal.AwS450S0200000_14 r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS450S0200000_14.invoke$1(kotlin.jvm.internal.AwS450S0200000_14, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$10(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        ((Fragment) awS450S0200000_14.l1).getLifecycle().addObserver((AbsChatPageLightInteractionViewModel) awS450S0200000_14.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        C898490ZMp c898490ZMp = (C898490ZMp) obj2;
        if (c898490ZMp != null) {
            ChatRoomFakeMsgOperatorAbility chatRoomFakeMsgOperatorAbility = (ChatRoomFakeMsgOperatorAbility) C1558520qew.LIZJ(C1558520qew.LJIIL((InteractionCardAssem) awS450S0200000_14.l0), ChatRoomFakeMsgOperatorAbility.class);
            C1684506ih c1684506ih = ((InteractionCardAssem) awS450S0200000_14.l0).LLILZIL;
            if (c1684506ih != null) {
                chatRoomFakeMsgOperatorAbility.y52(c1684506ih, null);
            }
            C869590Y9l c869590Y9l = c898490ZMp.LIZJ;
            if (c869590Y9l != null) {
                InteractionCardAssem interactionCardAssem = (InteractionCardAssem) awS450S0200000_14.l0;
                SessionInfo sessionInfo = (SessionInfo) awS450S0200000_14.l1;
                String str = c898490ZMp.LIZLLL;
                if (str != null) {
                    C1684506ih c1684506ihBo = interactionCardAssem.bo(sessionInfo, c869590Y9l, "uuid-fortune-cookie-inline-receive", str);
                    chatRoomFakeMsgOperatorAbility.yl2(c1684506ihBo, null);
                    interactionCardAssem.LLILZIL = c1684506ihBo;
                }
            }
            C1684506ih c1684506ih2 = ((InteractionCardAssem) awS450S0200000_14.l0).LLILZ;
            if (c1684506ih2 != null) {
                chatRoomFakeMsgOperatorAbility.y52(c1684506ih2, null);
            }
            C869590Y9l c869590Y9l2 = c898490ZMp.LIZ;
            if (c869590Y9l2 != null) {
                InteractionCardAssem interactionCardAssem2 = (InteractionCardAssem) awS450S0200000_14.l0;
                SessionInfo sessionInfo2 = (SessionInfo) awS450S0200000_14.l1;
                String str2 = c898490ZMp.LIZIZ;
                if (str2 != null) {
                    C1684506ih c1684506ihBo2 = interactionCardAssem2.bo(sessionInfo2, c869590Y9l2, "uuid-fortune-cookie-inline-send", str2);
                    chatRoomFakeMsgOperatorAbility.yl2(c1684506ihBo2, null);
                    interactionCardAssem2.LLILZ = c1684506ihBo2;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        ((InlineLabelReusedSkeletonUIContent) obj).Bp((C869590Y9l) awS450S0200000_14.l0, (C1233404s8) awS450S0200000_14.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        String str;
        String pushSentString;
        InnerPushUITemplate uiTemplate;
        LightInteractionCommonResource lightInteractionCommonResource = (LightInteractionCommonResource) obj2;
        String str2 = null;
        if (lightInteractionCommonResource != null && (pushSentString = lightInteractionCommonResource.getPushSentString()) != null && pushSentString.length() > 0 && (uiTemplate = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate()) != null) {
            uiTemplate.setContent(pushSentString);
        }
        C1908480zlO.LIZIZ.LJII(C18JY.CLICK, (InnerPushMessage) awS450S0200000_14.l0, "click", 3);
        InnerPushUITemplate uiTemplate2 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
        if (uiTemplate2 != null) {
            str = uiTemplate2.rightSchemaUrl;
        } else {
            str = null;
        }
        InnerPushUITemplate uiTemplate3 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
        if (uiTemplate3 != null) {
            if (C123100dR.LIZ(str)) {
                InnerPushUITemplate uiTemplate4 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
                if (uiTemplate4 != null) {
                    str2 = uiTemplate4.rightSchemaUrl;
                }
            } else {
                InnerPushUITemplate uiTemplate5 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
                if (uiTemplate5 != null) {
                    str2 = uiTemplate5.globalSchemaUrl;
                }
            }
            uiTemplate3.setGlobalSchemaUrl(str2);
        }
        C539110LCj.LIZIZ((InterfaceC539120LCk) awS450S0200000_14.l1, (InnerPushMessage) awS450S0200000_14.l0, new int[]{2}, false, 12);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        Function0<Unit> function0;
        C888640Yta c888640Yta = (C888640Yta) awS450S0200000_14.l0;
        if (c888640Yta != null && (function0 = c888640Yta.LJ) != null) {
            function0.invoke();
        }
        C888640Yta c888640Yta2 = (C888640Yta) awS450S0200000_14.l0;
        if (c888640Yta2 != null) {
            ((Function2) awS450S0200000_14.l1).invoke(c888640Yta2, Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        C888640Yta c888640Yta = (C888640Yta) awS450S0200000_14.l0;
        if (c888640Yta != null) {
            ((Function2) awS450S0200000_14.l1).invoke(c888640Yta, Boolean.FALSE);
            c888640Yta.LJI.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((InterfaceC1398730mVD) awS450S0200000_14.l0).LJIILL((AvatarComponentView) awS450S0200000_14.l1, true, null);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        if (obj2 == C0SY7.FOLLOWED || obj2 == C0SY7.FOLLOW_MUTUAL) {
            IIMRecUserAnalytics.LIZ.getClass();
            IIMRecUserAnalytics iIMRecUserAnalyticsLIZ = C897430ZIn.LIZ();
            if (iIMRecUserAnalyticsLIZ != null) {
                iIMRecUserAnalyticsLIZ.LIZLLL((User) awS450S0200000_14.l0, ((GroupDetailMemberCell) awS450S0200000_14.l1).getEnterFrom());
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static /* bridge */ /* synthetic */ Object invoke$18(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        ?? arrayList;
        int role;
        int role2;
        List list = (List) ((C291001Au) obj2).LIZ;
        C0ZJ4 c0zj4 = (C0ZJ4) awS450S0200000_14.l0;
        c0zj4.getClass();
        IIMAnonymousService iIMAnonymousService = (IIMAnonymousService) PluggableExtentionKt.pluggableSpi$default(IIMAnonymousService.class, false, false, false, 14, null);
        boolean z = true;
        if (iIMAnonymousService == null) {
            arrayList = list;
        } else {
            String strWQ2 = c0zj4.LJJ().wQ2();
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                IMUser iMUserLIZ = C05QS.LIZ((C1462005nu) obj3);
                if (iMUserLIZ != null) {
                    String uid = iMUserLIZ.getUid();
                    if (uid == null) {
                        uid = "";
                    }
                    if (!iIMAnonymousService.LJFF(strWQ2, uid, false)) {
                    }
                }
                arrayList.add(obj3);
            }
        }
        if (C300830Bqj.LIZ()) {
            TuxTextView tuxTextView = ((C0ZJ4) awS450S0200000_14.l0).LLJ;
            if (tuxTextView != null) {
                tuxTextView.setText(((Context) awS450S0200000_14.l1).getResources().getQuantityString(2131755266, list.size(), String.valueOf(list.size())));
            }
        } else {
            TuxTextView tuxTextView2 = ((C0ZJ4) awS450S0200000_14.l0).LLJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(C786410Ut5.j4(((Context) awS450S0200000_14.l1).getString(2131835406), Arrays.copyOf(new Object[]{Integer.valueOf(list.size())}, 1)));
            }
        }
        IIMAnonymousService iIMAnonymousService2 = (IIMAnonymousService) PluggableExtentionKt.pluggableSpi$default(IIMAnonymousService.class, false, false, false, 14, null);
        if (iIMAnonymousService2 == null || !iIMAnonymousService2.LIZ(((C0ZJ4) awS450S0200000_14.l0).LJJ().wQ2())) {
            z = false;
        }
        if (((C0ZJ4) awS450S0200000_14.l0).LJJ().AQ2()) {
            C0ZJ4 c0zj42 = (C0ZJ4) awS450S0200000_14.l0;
            C897520ZIw c897520ZIw = c0zj42.LLJI;
            if (c897520ZIw != null) {
                c897520ZIw.LJIIIIZZ(C0O26.LIZIZ(arrayList, AFwS248S0000000_14.get$arr$(497)));
                Map<String, C595660NXw> mapLIZLLL = c897520ZIw.LIZLLL();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (C1462005nu c1462005nu : arrayList) {
                    C0YAE member = c1462005nu.getMember();
                    if (member != null) {
                        role2 = member.getRole();
                    } else {
                        role2 = -1;
                    }
                    arrayList2.add(new C897400ZIk(c1462005nu, role2, C896480ZEw.LIZJ(mapLIZLLL.get(c1462005nu.getUid()))));
                }
                c0zj42.LLILZLL.LJIILL(C13LP.LJLILLLLZI(new C343040Dcc(z), arrayList2), null);
            }
        } else {
            C0ZJ4 c0zj43 = (C0ZJ4) awS450S0200000_14.l0;
            c0zj43.getClass();
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (C1462005nu c1462005nu2 : arrayList) {
                C0YAE member2 = c1462005nu2.getMember();
                if (member2 != null) {
                    role = member2.getRole();
                } else {
                    role = -1;
                }
                arrayList3.add(new C897400ZIk(c1462005nu2, role, false));
            }
            c0zj43.LLILZLL.LJIILL(C13LP.LJLILLLLZI(new C343040Dcc(z), arrayList3), null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((InterfaceC1398730mVD) awS450S0200000_14.l0).LJIILL(((NewSessionListSingleChatVH) awS450S0200000_14.l1).R7(), true, null);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        String str;
        int i;
        String str2;
        Integer num = (Integer) obj2;
        if (num != null) {
            C908800Zl0 c908800Zl0 = (C908800Zl0) awS450S0200000_14.l0;
            RemoteIconAndTitleWithDotCell remoteIconAndTitleWithDotCell = (RemoteIconAndTitleWithDotCell) awS450S0200000_14.l1;
            if (num.intValue() == 1) {
                Map<String, String> map = c908800Zl0.LLJ;
                if (map == null || (str = map.get("conversation_id")) == null) {
                    str = "";
                }
                C908790Zkz c908790Zkz = EnumC912680ZrG.Companion;
                Map<String, String> map2 = c908800Zl0.LLJ;
                if (map2 != null && (str2 = map2.get("mutual_feed_scene")) != null) {
                    i = CastIntegerProtector.parseInt(str2);
                } else {
                    i = 0;
                }
                c908790Zkz.getClass();
                EnumC912680ZrG enumC912680ZrGLIZ = C908790Zkz.LIZ(i);
                VibeEntranceFeature vibeEntranceFeatureLIZ = VibeEntranceFeature.LIZ.LIZ();
                if (vibeEntranceFeatureLIZ != null) {
                    vibeEntranceFeatureLIZ.LJ(str, "shared_feed_action_bar", num.intValue(), enumC912680ZrGLIZ);
                }
                C426770GoN c426770GoN = remoteIconAndTitleWithDotCell.LLILZIL;
                if (c426770GoN != null) {
                    C786410Ut5.LJLLLLLL(0, c426770GoN);
                }
            } else {
                C426770GoN c426770GoN2 = remoteIconAndTitleWithDotCell.LLILZIL;
                if (c426770GoN2 != null) {
                    C786410Ut5.LJLLLLLL(8, c426770GoN2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        String str;
        String pushSentString;
        InnerPushUITemplate uiTemplate;
        LightInteractionCommonResource lightInteractionCommonResource = (LightInteractionCommonResource) obj2;
        String str2 = null;
        if (lightInteractionCommonResource != null && (pushSentString = lightInteractionCommonResource.getPushSentString()) != null && pushSentString.length() > 0 && (uiTemplate = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate()) != null) {
            uiTemplate.setContent(pushSentString);
        }
        C1908480zlO.LIZIZ.LJII(C18JY.CLICK, (InnerPushMessage) awS450S0200000_14.l0, "click", 3);
        InnerPushUITemplate uiTemplate2 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
        if (uiTemplate2 != null) {
            str = uiTemplate2.rightSchemaUrl;
        } else {
            str = null;
        }
        InnerPushUITemplate uiTemplate3 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
        if (uiTemplate3 != null) {
            if (C123100dR.LIZ(str)) {
                InnerPushUITemplate uiTemplate4 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
                if (uiTemplate4 != null) {
                    str2 = uiTemplate4.rightSchemaUrl;
                }
            } else {
                InnerPushUITemplate uiTemplate5 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
                if (uiTemplate5 != null) {
                    str2 = uiTemplate5.globalSchemaUrl;
                }
            }
            uiTemplate3.setGlobalSchemaUrl(str2);
        }
        ((InterfaceC539120LCk) awS450S0200000_14.l1).LIZJ((InnerPushMessage) awS450S0200000_14.l0, new int[]{2}, false, false);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        String str;
        String pushSentString;
        InnerPushUITemplate uiTemplate;
        LightInteractionCommonResource lightInteractionCommonResource = (LightInteractionCommonResource) obj2;
        String str2 = null;
        if (lightInteractionCommonResource != null && (pushSentString = lightInteractionCommonResource.getPushSentString()) != null && pushSentString.length() > 0 && (uiTemplate = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate()) != null) {
            uiTemplate.setContent(pushSentString);
        }
        C1908480zlO.LIZIZ.LJII(C18JY.CLICK, (InnerPushMessage) awS450S0200000_14.l0, "click", 3);
        InnerPushUITemplate uiTemplate2 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
        if (uiTemplate2 != null) {
            str = uiTemplate2.rightSchemaUrl;
        } else {
            str = null;
        }
        InnerPushUITemplate uiTemplate3 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
        if (uiTemplate3 != null) {
            if (C123100dR.LIZ(str)) {
                InnerPushUITemplate uiTemplate4 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
                if (uiTemplate4 != null) {
                    str2 = uiTemplate4.rightSchemaUrl;
                }
            } else {
                InnerPushUITemplate uiTemplate5 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
                if (uiTemplate5 != null) {
                    str2 = uiTemplate5.globalSchemaUrl;
                }
            }
            uiTemplate3.setGlobalSchemaUrl(str2);
        }
        C539110LCj.LIZIZ((InterfaceC539120LCk) awS450S0200000_14.l1, (InnerPushMessage) awS450S0200000_14.l0, new int[]{2}, false, 12);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        ((Function2) awS450S0200000_14.l0).invoke(obj, obj2);
        ((Function2) awS450S0200000_14.l1).invoke(obj, obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        ((Function2) awS450S0200000_14.l0).invoke(obj, obj2);
        ((Function2) awS450S0200000_14.l1).invoke(obj, obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        String str;
        BaseUserComponent baseUserComponent;
        Long l;
        VideoCoverComponent videoCoverComponent;
        String str2;
        AwemeCardAssem awemeCardAssem = (AwemeCardAssem) awS450S0200000_14.l0;
        C869590Y9l c869590Y9l = (C869590Y9l) awS450S0200000_14.l1;
        awemeCardAssem.getClass();
        if (c869590Y9l.getConversationType() == AbstractC1711506n3.LIZIZ) {
            str = "group_chat";
        } else {
            str = "chat";
        }
        C0ZYL c0zyl = ((AwemeCardAssem) awS450S0200000_14.l0).LLLL;
        if (c0zyl != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AwemeCardAssem awemeCardAssem2 = (AwemeCardAssem) awS450S0200000_14.l0;
            AwemeCardTemplate awemeCardTemplateGp = awemeCardAssem2.Gp();
            if (awemeCardTemplateGp != null && (videoCoverComponent = awemeCardTemplateGp.baseVideoComponent) != null && (str2 = videoCoverComponent.id) != null) {
                linkedHashMap.put("group_id", str2);
            }
            AwemeCardTemplate awemeCardTemplateGp2 = awemeCardAssem2.Gp();
            if (awemeCardTemplateGp2 != null && (baseUserComponent = awemeCardTemplateGp2.baseUserComponent) != null && (l = baseUserComponent.userId) != null) {
                linkedHashMap.put("author_id", String.valueOf(l.longValue()));
            }
            c0zyl.LIZJ(str, linkedHashMap);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        String remarkName;
        ((Boolean) obj).booleanValue();
        MafChatListWidgetV2 mafChatListWidgetV2 = (MafChatListWidgetV2) awS450S0200000_14.l0;
        C1261860iwS c1261860iwS = (C1261860iwS) awS450S0200000_14.l1;
        mafChatListWidgetV2.getClass();
        IIMService iIMServiceLIZ = C1336205Ku.LIZ(false);
        if (TextUtils.isEmpty(c1261860iwS.getRemarkName())) {
            remarkName = c1261860iwS.getNickname();
        } else {
            remarkName = c1261860iwS.getRemarkName();
        }
        Context context = mafChatListWidgetV2.getContext();
        IMUser.Companion.getClass();
        EnterChatParams enterChatParams = new EnterChatParams(context, C2201941BFw.LIZJ(c1261860iwS));
        enterChatParams.setEnterFromForMob("notification_page");
        enterChatParams.setEnterMethodForMob("guide_dm");
        iIMServiceLIZ.getImSayHiService().LIZ(mafChatListWidgetV2.getContext(), c1261860iwS.getUid(), remarkName, C2097608Jq.LJIIJ(new Pair("enter_from", "notification_page"), new Pair("enter_method", "guide_dm"), new Pair("message_type", "emoji"), new Pair("message_from", "greeting_button"), new Pair("is_recommended_chat", "1")), new AwS563S0100000_19(mafChatListWidgetV2, 22), new AwS415S0200000_14(iIMServiceLIZ, enterChatParams, 0));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$4(kotlin.jvm.internal.AwS450S0200000_14 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS450S0200000_14.invoke$4(kotlin.jvm.internal.AwS450S0200000_14, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        String str;
        String pushSentString;
        InnerPushUITemplate uiTemplate;
        LightInteractionCommonResource lightInteractionCommonResource = (LightInteractionCommonResource) obj2;
        String str2 = null;
        if (lightInteractionCommonResource != null && (pushSentString = lightInteractionCommonResource.getPushSentString()) != null && pushSentString.length() > 0 && (uiTemplate = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate()) != null) {
            uiTemplate.setContent(pushSentString);
        }
        C1908480zlO.LIZIZ.LJII(C18JY.CLICK, (InnerPushMessage) awS450S0200000_14.l0, "click", 3);
        InnerPushUITemplate uiTemplate2 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
        if (uiTemplate2 != null) {
            str = uiTemplate2.rightSchemaUrl;
        } else {
            str = null;
        }
        InnerPushUITemplate uiTemplate3 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
        if (uiTemplate3 != null) {
            if (C123100dR.LIZ(str)) {
                InnerPushUITemplate uiTemplate4 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
                if (uiTemplate4 != null) {
                    str2 = uiTemplate4.rightSchemaUrl;
                }
            } else {
                InnerPushUITemplate uiTemplate5 = ((InnerPushMessage) awS450S0200000_14.l0).getUiTemplate();
                if (uiTemplate5 != null) {
                    str2 = uiTemplate5.globalSchemaUrl;
                }
            }
            uiTemplate3.setGlobalSchemaUrl(str2);
        }
        C539110LCj.LIZIZ((InterfaceC539120LCk) awS450S0200000_14.l1, (InnerPushMessage) awS450S0200000_14.l0, new int[]{2}, false, 12);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS450S0200000_14 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            android.view.View r9 = (android.view.View) r9
            android.view.MotionEvent r10 = (android.view.MotionEvent) r10
            r7 = 0
            r2 = 1
            if (r10 == 0) goto L70
            int r0 = r10.getActionMasked()
            if (r0 != r2) goto L70
            r0 = 2131387553(0x7f0a64a1, float:1.8395596E38)
            android.view.View r1 = r9.findViewById(r0)
            if (r1 == 0) goto L73
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler r0 = (com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler) r0
            r0.getClass()
            android.view.View r3 = com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler.m237do(r1)
            if (r3 == 0) goto L73
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler r0 = (com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler) r0
            r0.getClass()
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L73
            int r0 = r3.getWidth()
            if (r0 == 0) goto L73
            int r0 = r3.getHeight()
            if (r0 == 0) goto L73
            r0 = 2
            int[] r6 = new int[r0]
            r3.getLocationOnScreen(r6)
            float r5 = r10.getRawX()
            float r4 = r10.getRawY()
            r1 = r6[r7]
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L73
            int r0 = r3.getWidth()
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L73
            r1 = r6[r2]
            float r0 = (float) r1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L73
            int r0 = r3.getHeight()
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L73
            r3.performClick()
        L70:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L73:
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler r0 = (com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler) r0
            java.lang.Object r1 = r8.l1
            X.0Y9l r1 = (X.C869590Y9l) r1
            r0.getClass()
            X.06lh r0 = com.ss.android.ugc.aweme.im.report.api.IReportUtils.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.report.api.IReportUtils r0 = X.C1703106lh.LIZ()
            if (r0 == 0) goto L70
            boolean r0 = r0.LIZIZ(r1)
            if (r0 != r2) goto L70
            boolean r0 = r1.isSuccessStatus()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler r0 = (com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler) r0
            java.lang.Object r2 = r8.l1
            X.0Y9l r2 = (X.C869590Y9l) r2
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r0.LLILZIL
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler.LLJLLL
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r1.getValue()
            com.ss.android.ugc.aweme.im.chatroom.api.report.ChatReportPageViewModel r0 = (com.ss.android.ugc.aweme.im.chatroom.api.report.ChatReportPageViewModel) r0
            java.util.List r0 = r0.xQ2()
            boolean r1 = r0.contains(r2)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler r0 = (com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler) r0
            com.bytedance.assem.arch.viewModel.AssemVMLazy r0 = r0.LLILZIL
            com.bytedance.assem.arch.viewModel.AssemViewModel r2 = r0.getValue()
            com.ss.android.ugc.aweme.im.chatroom.api.report.ChatReportPageViewModel r2 = (com.ss.android.ugc.aweme.im.chatroom.api.report.ChatReportPageViewModel) r2
            r1 = r1 ^ 1
            java.lang.Object r0 = r8.l1
            X.0Y9l r0 = (X.C869590Y9l) r0
            r2.zQ2(r0, r1)
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS450S0200000_14.invoke$6(kotlin.jvm.internal.AwS450S0200000_14, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        AssemVMLazy assemVMLazy = (AssemVMLazy) awS450S0200000_14.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0ZZ5.LIZ;
        AssemViewModel value = assemVMLazy.getValue();
        ((UIAssem) obj).subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, new AwS292S0300000_14((ViewOnAttachStateChangeListenerC20604515jv) obj2, (ViewOnAttachStateChangeListenerC20604515jv) awS450S0200000_14.l1, (Fragment) awS450S0200000_14.l0, (AssemVMLazy<C902980Zbc, ChatRoomNetworkStateViewModel>) 0));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        final ChatLinearLayoutManager chatLinearLayoutManager;
        UIAssem uIAssem = (UIAssem) obj;
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) obj2;
        C01GW c01gwLIZ = C1509305vX.LIZ(new AwS546S0100000_2((Fragment) awS450S0200000_14.l0, 438));
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        if (layoutManager instanceof ChatLinearLayoutManager) {
            chatLinearLayoutManager = (ChatLinearLayoutManager) layoutManager;
        } else {
            chatLinearLayoutManager = null;
        }
        AssemVMLazy assemVMLazy = (AssemVMLazy) awS450S0200000_14.l1;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0ZZ5.LIZ;
        C736680Sv4.LJIIIIZZ(uIAssem, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ZTI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((C234400vO) obj3).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS292S0300000_14(chatLinearLayoutManager, (ChatLinearLayoutManager) awS450S0200000_14.l1, (AssemVMLazy<C234400vO, CollapseInlineVM>) c01gwLIZ, (C01GW<? extends ChatroomEventAbility>) 1), 4);
        viewOnAttachStateChangeListenerC20604515jv.addOnItemTouchListener(new InterfaceC21676019sM() { // from class: X.0ZfL
            @Override // X.InterfaceC21676019sM
            public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC21676019sM
            public final void LJIIZILJ(boolean z) {
            }

            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
                ChatLinearLayoutManager chatLinearLayoutManager2;
                int decoratedBottom;
                if (motionEvent.getAction() == 1) {
                    View viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                    if (viewFindChildViewUnder != null) {
                        viewHolderFindContainingViewHolder = recyclerView.findContainingViewHolder(viewFindChildViewUnder);
                    } else {
                        viewHolderFindContainingViewHolder = null;
                    }
                    if ((viewHolderFindContainingViewHolder instanceof CollapseInlinePowerCell) && (chatLinearLayoutManager2 = chatLinearLayoutManager) != null) {
                        int height = viewOnAttachStateChangeListenerC20604515jv.getHeight();
                        ChatLinearLayoutManager chatLinearLayoutManager3 = chatLinearLayoutManager;
                        if (chatLinearLayoutManager3 != null) {
                            decoratedBottom = chatLinearLayoutManager3.getDecoratedBottom(viewFindChildViewUnder);
                        } else {
                            decoratedBottom = 0;
                        }
                        chatLinearLayoutManager2.LJIIZILJ((height - decoratedBottom) - viewOnAttachStateChangeListenerC20604515jv.getPaddingBottom());
                    }
                }
                return false;
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS450S0200000_14 awS450S0200000_14, Object obj, Object obj2) {
        ((AbstractC738140SxQ) obj).getLifecycle().addObserver(new CommonMessageListConfigKt$onSendMessageStatsTracker$businessLogicConfig$1$1((InterfaceC902970Zbb) awS450S0200000_14.l0, (SessionInfo) awS450S0200000_14.l1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(C869590Y9l c869590Y9l, C007O c007o, int i) {
        super(2);
        this.$t = i;
        this.l0 = c869590Y9l;
        this.l1 = c007o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(C869590Y9l c869590Y9l, C1233404s8 c1233404s8, int i) {
        super(2);
        this.$t = i;
        this.l0 = c869590Y9l;
        this.l1 = c1233404s8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(C869590Y9l c869590Y9l, AwemeCardAssem awemeCardAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = awemeCardAssem;
        this.l1 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(C888640Yta c888640Yta, C897280ZHy c897280ZHy, int i) {
        super(2);
        this.$t = i;
        this.l0 = c888640Yta;
        this.l1 = c897280ZHy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(C0ZJ4 c0zj4, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0zj4;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(C903120Zbq c903120Zbq, SessionInfo sessionInfo, int i) {
        super(2);
        this.$t = i;
        this.l0 = c903120Zbq;
        this.l1 = sessionInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(C908800Zl0 c908800Zl0, RemoteIconAndTitleWithDotCell remoteIconAndTitleWithDotCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = c908800Zl0;
        this.l1 = remoteIconAndTitleWithDotCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(InterfaceC1398730mVD interfaceC1398730mVD, AvatarComponentView avatarComponentView, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC1398730mVD;
        this.l1 = avatarComponentView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(InterfaceC1398730mVD interfaceC1398730mVD, NewSessionListSingleChatVH newSessionListSingleChatVH, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC1398730mVD;
        this.l1 = newSessionListSingleChatVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(C20663515tR c20663515tR, InnerPushMessage innerPushMessage, int i) {
        super(2);
        this.$t = i;
        this.l0 = innerPushMessage;
        this.l1 = c20663515tR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(Fragment fragment, AbsChatPageLightInteractionViewModel absChatPageLightInteractionViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = absChatPageLightInteractionViewModel;
        this.l1 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(GreetingCardPopupAssem greetingCardPopupAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = greetingCardPopupAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(MafChatListWidgetV2 mafChatListWidgetV2, C1261860iwS c1261860iwS, int i) {
        super(2);
        this.$t = i;
        this.l0 = mafChatListWidgetV2;
        this.l1 = c1261860iwS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(SingleTitleBarRightAssem singleTitleBarRightAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = singleTitleBarRightAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(SkeletonLayoutAssembler skeletonLayoutAssembler, C869590Y9l c869590Y9l, int i) {
        super(2);
        this.$t = i;
        this.l0 = skeletonLayoutAssembler;
        this.l1 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(InteractionCardAssem interactionCardAssem, SessionInfo sessionInfo, int i) {
        super(2);
        this.$t = i;
        this.l0 = interactionCardAssem;
        this.l1 = sessionInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS450S0200000_14(User user, GroupDetailMemberCell groupDetailMemberCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = user;
        this.l1 = groupDetailMemberCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS450S0200000_14(Function2 function2, Function2<? super UIContentAssem, ? super ViewOnAttachStateChangeListenerC20604515jv, Unit> function22, Function2<? super UIContentAssem, ? super ViewOnAttachStateChangeListenerC20604515jv, Unit> function23) {
        super(2);
        this.$t = function23;
        this.l0 = function2;
        this.l1 = function22;
    }
}
