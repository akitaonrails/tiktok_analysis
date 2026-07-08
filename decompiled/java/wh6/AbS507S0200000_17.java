package wh6;

import X.AbstractC1110800f0o;
import X.AbstractC1113530f5D;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C0IJT;
import X.C0KAJ;
import X.C0KVU;
import X.C0PEM;
import X.C1095600ecI;
import X.C1102070emj;
import X.C1102470enN;
import X.C1109770ez9;
import X.C1110530f0N;
import X.C1112340f3I;
import X.C1113490f59;
import X.C1119210fEN;
import X.C1119410fEh;
import X.C1119430fEj;
import X.C1125070fNp;
import X.C1125770fOx;
import X.C1125790fOz;
import X.C1126800fQc;
import X.C1148460fzY;
import X.C1151190g3x;
import X.C1151350g4D;
import X.C1151360g4E;
import X.C1151400g4I;
import X.C1151410g4J;
import X.C1161920gLG;
import X.C1338270kvh;
import X.C158B;
import X.C16FS;
import X.C1846800y9u;
import X.C19EG;
import X.C1AI0;
import X.C1AI1;
import X.C1AI2;
import X.C20337914i1;
import X.C2176841AHi;
import X.C2176881AHm;
import X.C23250099c;
import X.C234700vR;
import X.C244000ww;
import X.C245400xA;
import X.C245500xB;
import X.C474500IjA;
import X.C500260Jjc;
import X.C724240Sb0;
import X.C766270U4b;
import X.C784440Upu;
import X.EnumC1846750y9p;
import X.InterfaceC1094280eaA;
import X.InterfaceC1113740f5Y;
import X.InterfaceC1791930wjP;
import X.InterfaceC1816020xMG;
import X.InterfaceC1846850y9z;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.publicscreen.impl.widget.ExtendedScreenGuideWidget;
import com.bytedance.android.live.rank.impl.sticker.dialog.TabRankStickerDialog;
import com.bytedance.android.live.rank.impl.sticker.team.TeamRankStickerDialog;
import com.bytedance.android.live.rank.impl.sticker.team.TeamRankStickerModelChannel;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.recharge.RechargeBtnAssem;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.recharge.RechargeBtnViewModel;
import com.bytedance.android.livesdk.livesetting.grouplive.LiveViewerPicksFAQPageSetting;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeConfig;
import com.bytedance.android.livesdk.livesetting.rank.TeamRankStickerSetting;
import com.bytedance.android.livesdk.model.message.FeatureGuideMessage;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.CloseRankDialogEvent;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS383S0200000_17;

/* JADX INFO: loaded from: classes18.dex */
public class AbS507S0200000_17 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS507S0200000_17 abS507S0200000_17, View view) {
        C245400xA c245400xA;
        if (view != null) {
            C245500xB c245500xB = C245500xB.LIZ;
            DataChannel dataChannel = ((ExtendedScreenGuideWidget) abS507S0200000_17.l0).dataChannel;
            IMessage iMessage = (IMessage) abS507S0200000_17.l1;
            C0KAJ c0kaj = C0KAJ.MANUALLY_ROUTE;
            c245500xB.getClass();
            C1102070emj c1102070emj = C1102070emj.LIZ;
            C1102470enN c1102470enN = C1102470enN.LL;
            Map map = (Map) ((LinkedHashMap) C245500xB.LIZIZ).get(dataChannel);
            if (map != null) {
                c245400xA = (C245400xA) map.get(iMessage);
            } else {
                c245400xA = null;
            }
            C1102070emj.LJIILJJIL(c1102070emj, dataChannel, c1102470enN, c245400xA, c0kaj, null, null, 112);
            ((ExtendedScreenGuideWidget) abS507S0200000_17.l0).B1(false);
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((ExtendedScreenGuideWidget) abS507S0200000_17.l0).getContext(), ((FeatureGuideMessage) ((IMessage) abS507S0200000_17.l1)).schema);
        }
    }

    public static final void LIZ$1(AbS507S0200000_17 abS507S0200000_17, View view) {
        if (view != null && ((InterfaceC1846850y9z) abS507S0200000_17.l0).LJIIIZ()) {
            ((InterfaceC1846850y9z) abS507S0200000_17.l0).LIZ(EnumC1846750y9p.ACTIVE);
            ((TabRankStickerDialog) abS507S0200000_17.l1).dismiss();
            DataChannel dataChannel = ((TabRankStickerDialog) abS507S0200000_17.l1).dataChannel;
            if (dataChannel != null) {
                dataChannel.FQ2(CloseRankDialogEvent.class);
            }
        }
    }

    public static final void LIZ$10(AbS507S0200000_17 abS507S0200000_17, View view) {
        if (view != null && ((InterfaceC1846850y9z) abS507S0200000_17.l0).LJIIIZ()) {
            ((InterfaceC1846850y9z) abS507S0200000_17.l0).LIZ(EnumC1846750y9p.ACTIVE);
            ((TeamRankStickerDialog) abS507S0200000_17.l1).dismiss();
            DataChannel dataChannel = ((TeamRankStickerDialog) abS507S0200000_17.l1).dataChannel;
            if (dataChannel != null) {
                dataChannel.FQ2(CloseRankDialogEvent.class);
            }
        }
    }

    public static final void LIZ$11(AbS507S0200000_17 abS507S0200000_17, View view) {
        DataChannel dataChannel;
        C1119430fEj c1119430fEj;
        int i;
        int i2;
        if (view != null && (dataChannel = ((TeamRankStickerDialog) abS507S0200000_17.l0).dataChannel) != null && (c1119430fEj = (C1119430fEj) dataChannel.gg0(TeamRankStickerModelChannel.class)) != null) {
            long j = c1119430fEj.LJIILL;
            long j2 = c1119430fEj.LJIILLIIL;
            long jLIZJ = C158B.LIZJ();
            if (j <= jLIZJ && jLIZJ < j2) {
                if (!((InterfaceC1846850y9z) abS507S0200000_17.l1).LJIIIZ() && !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9()) {
                    C1119210fEN c1119210fEN = C1119210fEN.LIZ;
                    Context context = ((TeamRankStickerDialog) abS507S0200000_17.l0).getContext();
                    TeamRankStickerDialog teamRankStickerDialog = (TeamRankStickerDialog) abS507S0200000_17.l0;
                    DataChannel dataChannel2 = teamRankStickerDialog.dataChannel;
                    RankTypeV2 rankTypeV2 = RankTypeV2.LJIJJLI;
                    InterfaceC1846850y9z interfaceC1846850y9z = (InterfaceC1846850y9z) abS507S0200000_17.l1;
                    AwS383S0200000_17 awS383S0200000_17 = new AwS383S0200000_17(teamRankStickerDialog, interfaceC1846850y9z, 136);
                    c1119210fEN.getClass();
                    C1119210fEN.LJ(context, dataChannel2, rankTypeV2, interfaceC1846850y9z, awS383S0200000_17);
                    return;
                }
                return;
            }
            C20337914i1<Boolean> c20337914i1 = InterfaceC1094280eaA.Pd;
            if (!c20337914i1.LIZIZ().booleanValue()) {
                c20337914i1.LJFF(Boolean.TRUE);
                if (TeamRankStickerSetting.INSTANCE.getUseNewStyle()) {
                    i2 = 2131855337;
                } else {
                    i2 = 2131855319;
                }
                C766270U4b.LJII(i2, C1846800y9u.LJIILLIIL(c1119430fEj.LJIILL), C1846800y9u.LJIILLIIL(c1119430fEj.LJIILLIIL));
            } else {
                if (TeamRankStickerSetting.INSTANCE.getUseNewStyle()) {
                    i = 2131855338;
                } else {
                    i = 2131855320;
                }
                C766270U4b.LIZLLL(i);
            }
            TeamRankStickerDialog teamRankStickerDialog2 = (TeamRankStickerDialog) abS507S0200000_17.l0;
            C1119410fEh.LJ(teamRankStickerDialog2.dataChannel, RankTypeV2.LJIJJLI, teamRankStickerDialog2.LLILLJJLI, teamRankStickerDialog2.LLJILJILJ);
        }
    }

    public static final void LIZ$12(AbS507S0200000_17 abS507S0200000_17, View view) {
        if (view != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) abS507S0200000_17.l0, LivePopularityRankingBonusTimeConfig.INSTANCE.getValue().gameplayDetailPage);
            ((TeamRankStickerDialog) abS507S0200000_17.l1).dismiss();
            DataChannel dataChannel = ((TeamRankStickerDialog) abS507S0200000_17.l1).dataChannel;
            if (dataChannel != null) {
                dataChannel.FQ2(CloseRankDialogEvent.class);
            }
        }
    }

    public static final void LIZ$2(AbS507S0200000_17 abS507S0200000_17, View view) {
        if (view != null) {
            ((C1095600ecI) abS507S0200000_17.l0).LLIZ = true;
            C500260Jjc.LJIILIIL((View) abS507S0200000_17.l1);
        }
    }

    public static final void LIZ$3(AbS507S0200000_17 abS507S0200000_17, View view) {
        C19EG c19egLIZ;
        Map<String, String> logExtra;
        Map<String, String> logExtra2;
        HashMap<String, String> map;
        String billingCountryCode;
        Map<String, String> logExtra3;
        if (view != null) {
            ((RechargeBtnAssem) abS507S0200000_17.l0).No();
            InterfaceC1816020xMG interfaceC1816020xMG = (InterfaceC1816020xMG) ((RechargeBtnAssem) abS507S0200000_17.l0).Ho().pV1().getValue();
            ((RechargeBtnAssem) abS507S0200000_17.l0).Jo().lW0();
            if (!((C16FS) abS507S0200000_17.l1).LLJJIJI && (c19egLIZ = C724240Sb0.LIZ((RechargeBtnAssem) abS507S0200000_17.l0)) != null) {
                ((C16FS) abS507S0200000_17.l1).LJ();
                if (interfaceC1816020xMG instanceof C1151400g4I) {
                    RechargePanelInputParams inputParams = ((RechargeBtnAssem) abS507S0200000_17.l0).Jo().getInputParams();
                    C1151400g4I c1151400g4I = (C1151400g4I) interfaceC1816020xMG;
                    String strValueOf = String.valueOf(c1151400g4I.LLILZ);
                    TouchPointAbility touchPointAbilityLo = ((RechargeBtnAssem) abS507S0200000_17.l0).Lo();
                    if (touchPointAbilityLo != null) {
                        logExtra2 = touchPointAbilityLo.getLogExtra();
                    } else {
                        logExtra2 = null;
                    }
                    HashMap<String, Object> mapUB2 = ((RechargeBtnAssem) abS507S0200000_17.l0).Ho().UB2(null);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_click");
                    C1151190g3x.LJ(c474500IjALIZ, inputParams, logExtra2);
                    C1151190g3x.LIZLLL(c474500IjALIZ, mapUB2);
                    C1151190g3x.LIZ(c474500IjALIZ, Integer.valueOf(C1151360g4E.LIZJ(inputParams)));
                    if (inputParams != null) {
                        map = inputParams.etTracking;
                    } else {
                        map = null;
                    }
                    c474500IjALIZ.LJJIIZI(map);
                    c474500IjALIZ.LJJII(strValueOf, "recharge_package");
                    InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
                    if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
                        billingCountryCode = "";
                    }
                    c474500IjALIZ.LJJII(billingCountryCode, "app_store_front");
                    c474500IjALIZ.LIZ();
                    RechargeBtnViewModel rechargeBtnViewModelNo = ((RechargeBtnAssem) abS507S0200000_17.l0).No();
                    RechargePanelInputParams inputParams2 = ((RechargeBtnAssem) abS507S0200000_17.l0).Jo().getInputParams();
                    TouchPointAbility touchPointAbilityLo2 = ((RechargeBtnAssem) abS507S0200000_17.l0).Lo();
                    if (touchPointAbilityLo2 != null) {
                        logExtra3 = touchPointAbilityLo2.getLogExtra();
                    } else {
                        logExtra3 = null;
                    }
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(rechargeBtnViewModelNo), C0PEM.LIZJ, null, new C1151350g4D(rechargeBtnViewModelNo, inputParams2, c1151400g4I, c19egLIZ, logExtra3, null), 2);
                    return;
                }
                if (interfaceC1816020xMG instanceof C1151410g4J) {
                    RechargePanelInputParams inputParams3 = ((RechargeBtnAssem) abS507S0200000_17.l0).Jo().getInputParams();
                    C1151410g4J c1151410g4J = (C1151410g4J) interfaceC1816020xMG;
                    String strValueOf2 = String.valueOf(c1151410g4J.LLILLJJLI);
                    TouchPointAbility touchPointAbilityLo3 = ((RechargeBtnAssem) abS507S0200000_17.l0).Lo();
                    if (touchPointAbilityLo3 != null) {
                        logExtra = touchPointAbilityLo3.getLogExtra();
                    } else {
                        logExtra = null;
                    }
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_exchange_click");
                    C1151190g3x.LIZIZ(c474500IjALIZ2, inputParams3, logExtra, false);
                    c474500IjALIZ2.LJJII(strValueOf2, "exchange_coins");
                    if (C1126800fQc.LIZ.KE0().LJIIL()) {
                        c474500IjALIZ2.LJJII(String.valueOf(10011), "strategy_task_type");
                    }
                    c474500IjALIZ2.LIZ();
                    RechargeBtnViewModel rechargeBtnViewModelNo2 = ((RechargeBtnAssem) abS507S0200000_17.l0).No();
                    RechargePanelInputParams inputParams4 = ((RechargeBtnAssem) abS507S0200000_17.l0).Jo().getInputParams();
                    rechargeBtnViewModelNo2.setState(AFwS254S0000000_17.get$arr$(250));
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(rechargeBtnViewModelNo2), C0PEM.LIZ, null, new C1148460fzY(c1151410g4J, inputParams4, rechargeBtnViewModelNo2, null), 2);
                    return;
                }
                ((C16FS) abS507S0200000_17.l1).LJIIL();
            }
        }
    }

    public static final void LIZ$4(AbS507S0200000_17 abS507S0200000_17, View view) {
        String str;
        Integer numValueOf;
        C2176881AHm c2176881AHm;
        C1125770fOx c1125770fOx;
        ViewerPicksInfo viewerPicksInfo;
        if (view != null) {
            C1125790fOz c1125790fOz = (C1125790fOz) abS507S0200000_17.l0;
            if (c1125790fOz.LLILLL) {
                str = "group_live_viewer_wishes";
            } else {
                str = "viewer_wishes";
            }
            C1125070fNp.LIZIZ("click", str, 0L, 0L, c1125790fOz.LL, c1125790fOz.LLILLJJLI, 0L);
            C1125790fOz c1125790fOz2 = (C1125790fOz) abS507S0200000_17.l0;
            DataChannel dataChannel = c1125790fOz2.LLILZ;
            Boolean bool = null;
            if (dataChannel != null && (c2176881AHm = (C2176881AHm) dataChannel.gg0(ViewerWishesStatus.class)) != null && (c1125770fOx = c2176881AHm.LIZIZ) != null && (viewerPicksInfo = c1125770fOx.LIZIZ) != null) {
                numValueOf = Integer.valueOf(viewerPicksInfo.scene);
            } else {
                numValueOf = null;
            }
            c1125790fOz2.LLILZIL = numValueOf;
            Map<String, Object> map = C1338270kvh.LIZ;
            C1125790fOz c1125790fOz3 = (C1125790fOz) abS507S0200000_17.l0;
            Integer num = c1125790fOz3.LLILZIL;
            if (c1125790fOz3.LLILLL) {
                ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1((Context) abS507S0200000_17.l1, LiveViewerPicksFAQPageSetting.INSTANCE.getValue(), null);
                ((C1125790fOz) abS507S0200000_17.l0).LIZ("group_live_viewer_wishes");
                return;
            }
            if (num != null) {
                if (num.intValue() == 3) {
                    ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1((Context) abS507S0200000_17.l1, "aweme://roma_redirect/?spark_page=game_live_viewer_wishes_faq", null);
                    ((C1125790fOz) abS507S0200000_17.l0).LIZ("viewer_wishes");
                    return;
                }
                if (num != null && (num.intValue() == 5 || num.intValue() == 6)) {
                    Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=game_live_control_chaos_faq").buildUpon();
                    if (num.intValue() == 6) {
                        builderBuildUpon.appendQueryParameter("is_interact", "true");
                    }
                    ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1((Context) abS507S0200000_17.l1, builderBuildUpon.build().toString(), null);
                    C1125790fOz c1125790fOz4 = (C1125790fOz) abS507S0200000_17.l0;
                    DataChannel dataChannel2 = c1125790fOz4.LLILZ;
                    if (dataChannel2 != null) {
                        bool = (Boolean) dataChannel2.gg0(UserIsAnchorChannel.class);
                    }
                    if (!C500260Jjc.LJJIJIIJIL(bool)) {
                        return;
                    }
                    Integer num2 = c1125790fOz4.LLILZIL;
                    if (num2 != null && num2.intValue() == 6) {
                        C1AI0.LJI(c1125790fOz4.LLILZ, "click");
                        return;
                    }
                    C1AI2 c1ai2 = new C1AI2(null, null, null, null, null, null, null, 0L, 0L, "control_chaos", "user", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -1537, 2097151);
                    C1AI1.LIZ(c1ai2, c1125790fOz4.LLILZ, false);
                    C1AI0.LJIILJJIL(c1ai2);
                    return;
                }
            }
            String str2 = ViewerWishesQueuePage._pnsPageId;
            C2176841AHi.LIZ(((C1125790fOz) abS507S0200000_17.l0).LLILZ);
        }
    }

    public static final void LIZ$5(AbS507S0200000_17 abS507S0200000_17, View view) {
        if (view != null) {
            AbstractC1113530f5D.LJFF((C1113490f59) abS507S0200000_17.l0, (AbstractC1110800f0o) abS507S0200000_17.l1, null, "tag_none_cta", true, null, 16);
        }
    }

    public static final void LIZ$6(AbS507S0200000_17 abS507S0200000_17, View view) {
        C234700vR c234700vRLJLJJLL;
        User user;
        if (view != null && (c234700vRLJLJJLL = ((AbstractC1110800f0o) abS507S0200000_17.l0).LJLJJLL()) != null && c234700vRLJLJJLL.LIZ) {
            C1109770ez9 c1109770ez9 = (C1109770ez9) abS507S0200000_17.l1;
            if (c1109770ez9.LJI) {
                user = ((AbstractC1110800f0o) abS507S0200000_17.l0).getUser();
            } else {
                user = c1109770ez9.LJIIIIZZ;
            }
            ISendCommentEvent.Sender sender = ISendCommentEvent.Sender.REPLY;
            sender.getLogArgs().clear();
            C1110530f0N c1110530f0N = new C1110530f0N(1, C0KVU.LIZ(user), "positive_reply", false);
            c1110530f0N.LJIIIZ = "message";
            c1110530f0N.LJIIJ = sender;
            c1110530f0N.LIZLLL = user;
            C784440Upu.LIZ().LIZIZ(c1110530f0N);
        }
    }

    public static final void LIZ$7(AbS507S0200000_17 abS507S0200000_17, View view) {
        C1112340f3I c1112340f3ILJ;
        if (view != null && (c1112340f3ILJ = ((InterfaceC1113740f5Y) abS507S0200000_17.l0).LJ()) != null) {
            c1112340f3ILJ.LIZ((C1109770ez9) abS507S0200000_17.l1);
        }
    }

    public static final void LIZ$8(AbS507S0200000_17 abS507S0200000_17, View view) {
        C1112340f3I c1112340f3ILJ;
        if (view != null && (c1112340f3ILJ = ((InterfaceC1113740f5Y) abS507S0200000_17.l0).LJ()) != null) {
            c1112340f3ILJ.LIZ((C1109770ez9) abS507S0200000_17.l1);
        }
    }

    public static final void LIZ$9(AbS507S0200000_17 abS507S0200000_17, View view) {
        C244000ww c244000wwLJJJJLL;
        if (view != null && (c244000wwLJJJJLL = ((InterfaceC1113740f5Y) abS507S0200000_17.l0).LJJJJLL()) != null) {
            c244000wwLJJJJLL.LIZ((C1109770ez9) abS507S0200000_17.l1);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AbS507S0200000_17(X.InterfaceC1846850y9z r4, com.bytedance.android.live.rank.impl.sticker.team.TeamRankStickerDialog r5, int r6) {
        /*
            r3 = this;
            r3.$t = r6
            int r6 = 10 - r6
            if (r6 == 0) goto L11
            r2 = r3
            r2.l0 = r5
            r2.l1 = r4
            r0 = 300(0x12c, double:1.48E-321)
        Ld:
            r2.<init>(r0)
            return
        L11:
            r2 = r3
            r2.l0 = r4
            r2.l1 = r5
            r0 = 300(0x12c, double:1.48E-321)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS507S0200000_17.<init>(X.0y9z, com.bytedance.android.live.rank.impl.sticker.team.TeamRankStickerDialog, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS507S0200000_17(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
