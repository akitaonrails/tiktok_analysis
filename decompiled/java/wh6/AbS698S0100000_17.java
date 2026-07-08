package wh6;

import X.AbstractC1110800f0o;
import X.AbstractC1114240f6M;
import X.AbstractC1115080f7i;
import X.AbstractC1119550fEv;
import X.AbstractC23273099z;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C09JN;
import X.C0IJT;
import X.C1094590eaf;
import X.C1095580ecG;
import X.C1095600ecI;
import X.C1095910ecn;
import X.C1095920eco;
import X.C1103880epe;
import X.C1103910eph;
import X.C1109770ez9;
import X.C1110180ezo;
import X.C1111000f18;
import X.C1111140f1M;
import X.C1111150f1N;
import X.C1114260f6O;
import X.C1117710fBx;
import X.C1120430fGL;
import X.C1147860fya;
import X.C1149560g1K;
import X.C1151190g3x;
import X.C1161920gLG;
import X.C11NZ;
import X.C11S5;
import X.C14GT;
import X.C16FS;
import X.C16FV;
import X.C1701940uOG;
import X.C19748612Om;
import X.C1AI0;
import X.C1AI1;
import X.C1AI2;
import X.C1AIP;
import X.C20632315oP;
import X.C21459418yW;
import X.C23250099c;
import X.C378201dU;
import X.C431500Gw0;
import X.C474500IjA;
import X.C480460Ism;
import X.C495520Jby;
import X.C500260Jjc;
import X.C748880TZe;
import X.C760380TsC;
import X.C784440Upu;
import X.C786410Ut5;
import X.InterfaceC1114270f6P;
import Y.AfS186S0100000_17;
import Y.AfS5S1210000_17;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.aireply.IAIReplyWatcherManagerService;
import com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget;
import com.bytedance.android.live.rank.impl.sticker.base.BaseRankStickerDialog;
import com.bytedance.android.live.rank.impl.sticker.dialog.TabRankStickerDialog;
import com.bytedance.android.live.rank.impl.sticker.team.TeamRankStickerDialog;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.broadcast.preview.LiveCoverCameraFragment;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListAssem;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet.IExchangeApi;
import com.bytedance.android.livesdk.livesetting.level.UserLevelSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeConfig;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveFirstRechargeExchangePage;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.CommentReplyMessage;
import com.bytedance.android.livesdk.revenue.level.api.event.OpenFansClubPageEvent;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.FansClubJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.android.livesdk.viewerwishestmp.guidance.ViewerWishesGuidePage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.text.a0;
import webcast.data.TPClickableText;
import webcast.data.host_board.ClickAction;

/* JADX INFO: loaded from: classes18.dex */
public class AbS698S0100000_17 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            case 25:
                LIZ$25(this, view);
                break;
            case 26:
                LIZ$26(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS698S0100000_17(C1095920eco c1095920eco, int i) {
        super(700L);
        this.$t = i;
        this.l0 = c1095920eco;
    }

    public static final void LIZ$0(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null && !C431500Gw0.LIZ().LIZLLL) {
            ((CommentComboTrayWidget) abS698S0100000_17.l0).B1();
        }
    }

    public static final void LIZ$1(AbS698S0100000_17 abS698S0100000_17, View view) {
        String str;
        ClickAction.NavigateToAppRoute navigateToAppRoute;
        ClickAction.NavigateToAppRoute navigateToAppRoute2;
        if (view != null) {
            ClickAction clickAction = ((AbstractC1119550fEv) abS698S0100000_17.l0).LL.clickAction;
            String str2 = null;
            if (clickAction == null || (navigateToAppRoute2 = clickAction.navigateToAppRoute) == null || (str = navigateToAppRoute2.route) == null || str.length() == 0) {
                ClickAction clickAction2 = ((AbstractC1119550fEv) abS698S0100000_17.l0).LLILLJJLI.clickAction;
                if (clickAction2 != null && (navigateToAppRoute = clickAction2.navigateToAppRoute) != null) {
                    str2 = navigateToAppRoute.route;
                }
                str = str2;
            }
            C784440Upu.LIZ().LIZIZ(new C1103910eph("click", str));
        }
    }

    public static final void LIZ$10(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            ((PackageListAssem) abS698S0100000_17.l0).ip().manualListRefresh();
            C16FS c16fs = ((PackageListAssem) abS698S0100000_17.l0).LLJJI;
            if (c16fs != null) {
                c16fs.LJ();
            }
            C16FS c16fs2 = ((PackageListAssem) abS698S0100000_17.l0).LLJJI;
            if (c16fs2 != null) {
                c16fs2.setClickable(false);
            }
        }
    }

    public static final void LIZ$11(AbS698S0100000_17 abS698S0100000_17, View view) {
        String value;
        int i;
        int i2;
        if (view != null) {
            RechargePanelInputParams inputParams = ((PackageListAssem) abS698S0100000_17.l0).Oo().getInputParams();
            TouchPointAbility touchPointAbilityZo = ((PackageListAssem) abS698S0100000_17.l0).Zo();
            Map<String, String> logExtra = null;
            if (touchPointAbilityZo != null) {
                logExtra = touchPointAbilityZo.getLogExtra();
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exchange_entrance_click");
            C1151190g3x.LIZIZ(c474500IjALIZ, inputParams, logExtra, true);
            c474500IjALIZ.LIZ();
            ((PackageListAssem) abS698S0100000_17.l0).Oo().lW0();
            TPClickableText tPClickableText = (TPClickableText) ((PackageListAssem) abS698S0100000_17.l0).LLJJIJIL.getValue();
            if (tPClickableText == null || (value = tPClickableText.schema) == null || !(!a0.LJJJIL(value))) {
                value = LiveFirstRechargeExchangePage.INSTANCE.getValue();
            }
            Context context = ((PackageListAssem) abS698S0100000_17.l0).getContext();
            RechargePanelInputParams inputParams2 = ((PackageListAssem) abS698S0100000_17.l0).Oo().getInputParams();
            if (!a0.LJJJIL(value)) {
                boolean zLIZLLL = C1149560g1K.LIZLLL(inputParams2);
                C480460Ism.LIZ().getClass();
                IExchangeApi iExchangeApi = (IExchangeApi) C480460Ism.LIZLLL(IExchangeApi.class);
                if (zLIZLLL) {
                    i = 9;
                    i2 = 906;
                } else {
                    i = 19;
                    i2 = 115;
                }
                iExchangeApi.checkExchangeKyc(i, i2).LJJLJLI(new AfS5S1210000_17(context, inputParams2, value, zLIZLLL, 1));
            }
        }
    }

    public static final void LIZ$12(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            C760380TsC.LIZIZ(UriProtector.parse(((BaseRankStickerDialog) abS698S0100000_17.l0).PR()), (BaseRankStickerDialog) abS698S0100000_17.l0, true);
        }
    }

    public static final void LIZ$13(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            C760380TsC.LIZIZ(UriProtector.parse(((BaseRankStickerDialog) abS698S0100000_17.l0).PR()), (BaseRankStickerDialog) abS698S0100000_17.l0, true);
        }
    }

    public static final void LIZ$14(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            InterfaceC1114270f6P interfaceC1114270f6P = ((C1114260f6O) abS698S0100000_17.l0).LJ;
            if (interfaceC1114270f6P != null) {
                interfaceC1114270f6P.LLJLIL(3);
            }
            ((C1114260f6O) abS698S0100000_17.l0).LIZIZ(3);
            C1114260f6O c1114260f6O = (C1114260f6O) abS698S0100000_17.l0;
            C20632315oP c20632315oP = c1114260f6O.LIZJ;
            Iterator<AbstractC1114240f6M> it2 = c1114260f6O.LIZLLL.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().I5() == 3) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            c20632315oP.setCurrentItem(i);
        }
    }

    public static final void LIZ$15(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            InterfaceC1114270f6P interfaceC1114270f6P = ((C1114260f6O) abS698S0100000_17.l0).LJ;
            if (interfaceC1114270f6P != null) {
                interfaceC1114270f6P.LLJLIL(2);
            }
            ((C1114260f6O) abS698S0100000_17.l0).LIZIZ(2);
            C1114260f6O c1114260f6O = (C1114260f6O) abS698S0100000_17.l0;
            C20632315oP c20632315oP = c1114260f6O.LIZJ;
            Iterator<AbstractC1114240f6M> it2 = c1114260f6O.LIZLLL.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().I5() == 2) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            c20632315oP.setCurrentItem(i);
        }
    }

    public static final void LIZ$16(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            C1095580ecG c1095580ecG = (C1095580ecG) abS698S0100000_17.l0;
            C1110180ezo c1110180ezo = c1095580ecG.LL;
            if (c1095580ecG.itemView.getContext() == null) {
                c1110180ezo.getClass();
            } else {
                c1110180ezo.LLILLL.LIZ();
                if (c1110180ezo.LLILZ) {
                    IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
                    if (iFansClubService != null) {
                        iFansClubService.we2();
                    }
                } else {
                    C11NZ.LJLJJLL(900L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0eIw
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            IFansClubService iFansClubService2 = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
                            if (iFansClubService2 != null) {
                                iFansClubService2.we2();
                            }
                        }
                    });
                }
            }
            ((C1095580ecG) abS698S0100000_17.l0).LL.LIZIZ("join", "fan_club");
        }
    }

    public static final void LIZ$17(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            C1095580ecG c1095580ecG = (C1095580ecG) abS698S0100000_17.l0;
            C1110180ezo c1110180ezo = c1095580ecG.LL;
            if (c1095580ecG.itemView.getContext() == null) {
                c1110180ezo.getClass();
            } else {
                c1110180ezo.LLILLL.LIZ();
                if (c1110180ezo.LLILZ) {
                    c1110180ezo.LL.LC0(OpenFansClubPageEvent.class, new C1094590eaf("comment_panel", true, false, null, 0, null, null, null, null, 496));
                } else {
                    C11NZ.LJLJJLL(900L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(c1110180ezo, 138));
                }
            }
            ((C1095580ecG) abS698S0100000_17.l0).LL.LIZIZ("activate_fan_club", "fan_club");
        }
    }

    public static final void LIZ$18(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            C1095600ecI c1095600ecI = (C1095600ecI) abS698S0100000_17.l0;
            C1110180ezo c1110180ezo = c1095600ecI.LL;
            if (c1095600ecI.itemView.getContext() == null) {
                c1110180ezo.getClass();
            } else {
                c1110180ezo.LLILLL.LIZ();
                ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).RL1("comment_panel");
            }
            ((C1095600ecI) abS698S0100000_17.l0).LL.LIZIZ("join_super_fan", "super_fan");
        }
    }

    public static final void LIZ$19(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            IFrameSlot.SlotViewModel slotViewModel = ((C14GT) abS698S0100000_17.l0).LLJJI;
            if (slotViewModel == null) {
                slotViewModel = null;
            }
            C23250099c.LIZIZ(ViewModelKt.getViewModelScope(slotViewModel), (AbstractC23273099z) ((C14GT) abS698S0100000_17.l0).LLJILLL.getValue(), null, new C1120430fGL((C14GT) abS698S0100000_17.l0, null), 2);
            IFrameSlot.SlotViewModel slotViewModel2 = ((C14GT) abS698S0100000_17.l0).LLJJI;
            if (slotViewModel2 == null) {
                slotViewModel2 = null;
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(slotViewModel2), (AbstractC23273099z) ((C14GT) abS698S0100000_17.l0).LLJILLL.getValue(), null, new C1147860fya((C14GT) abS698S0100000_17.l0, null), 2);
        }
    }

    public static final void LIZ$2(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            ((C1095920eco) abS698S0100000_17.l0).LJIILLIIL();
        }
    }

    public static final void LIZ$20(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            C760380TsC.LIZIZ(UriProtector.parse(((TabRankStickerDialog) abS698S0100000_17.l0).RR()), (TabRankStickerDialog) abS698S0100000_17.l0, true);
        }
    }

    public static final void LIZ$21(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            C760380TsC.LIZIZ(UriProtector.parse(((TabRankStickerDialog) abS698S0100000_17.l0).RR()), (TabRankStickerDialog) abS698S0100000_17.l0, true);
        }
    }

    public static final void LIZ$22(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            C1103880epe c1103880epe = (C1103880epe) abS698S0100000_17.l0;
            boolean z = !c1103880epe.LLJI;
            c1103880epe.LLJI = z;
            c1103880epe.LLILLJJLI.LIZIZ.setValue(Boolean.valueOf(z));
            if (c1103880epe.LLJI) {
                C786410Ut5.Db(c1103880epe.LLIZ, 180.0f);
                C500260Jjc.LJIILIIL(c1103880epe.LLILZIL);
                c1103880epe.LJ("fold", null);
            } else {
                C786410Ut5.Db(c1103880epe.LLIZ, 0.0f);
                if (c1103880epe.LLIZLLLIL.getItemCount() > 1) {
                    C500260Jjc.LLFFF(c1103880epe.LLILZIL);
                }
                c1103880epe.LJ("expand", null);
            }
            c1103880epe.LJI();
            C21459418yW c21459418yW = new C21459418yW();
            c21459418yW.LLILLL = 200L;
            C19748612Om.LIZ(c1103880epe, c21459418yW);
            c1103880epe.requestLayout();
        }
    }

    public static final void LIZ$23(AbS698S0100000_17 abS698S0100000_17, View view) {
        C1109770ez9 c1109770ez9;
        DataChannel dataChannel;
        FragmentManager fragmentManager;
        AbstractC1110800f0o abstractC1110800f0o;
        CommentReplyMessage commentReplyMessage;
        if (view != null && (c1109770ez9 = ((C1111140f1M) abS698S0100000_17.l0).LL) != null && c1109770ez9.LIZLLL && (dataChannel = c1109770ez9.LJIIIZ) != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null && (abstractC1110800f0o = ((C1111140f1M) abS698S0100000_17.l0).LLILLJJLI) != null && (commentReplyMessage = (CommentReplyMessage) abstractC1110800f0o.LJIL) != null) {
            IAIReplyWatcherManagerService.Companion.getClass();
            C378201dU.LIZ().showProfileDialog(fragmentManager, commentReplyMessage);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ai_reply_audience_click");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(Long.valueOf(commentReplyMessage.getMessageId()), "msg_id");
            c474500IjALIZ.LJJII("head", "click_position");
            c474500IjALIZ.LIZ();
        }
    }

    public static final void LIZ$24(AbS698S0100000_17 abS698S0100000_17, View view) {
        C1111000f18 c1111000f18;
        if (view != null && (c1111000f18 = ((C1111150f1N) abS698S0100000_17.l0).LLILLJJLI) != null) {
            c1111000f18.LIZIZ();
        }
    }

    public static final void LIZ$25(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            ((C1111150f1N) abS698S0100000_17.l0).T5("user_msg", null, "comment_icon");
        }
    }

    public static final void LIZ$26(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            C760380TsC.LIZIZ(UriProtector.parse(LivePopularityRankingBonusTimeConfig.INSTANCE.getValue().fansTeamRankFaq), (TeamRankStickerDialog) abS698S0100000_17.l0, true);
        }
    }

    public static final void LIZ$3(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            ((C1095910ecn) abS698S0100000_17.l0).LJIJI();
        }
    }

    public static final void LIZ$4(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            LiveCoverCameraFragment liveCoverCameraFragment = (LiveCoverCameraFragment) abS698S0100000_17.l0;
            View viewFindViewById = liveCoverCameraFragment.LLILZIL;
            if (viewFindViewById == null) {
                View view2 = liveCoverCameraFragment.getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.d9x);
                } else {
                    viewFindViewById = null;
                }
                liveCoverCameraFragment.LLILZIL = (C16FV) viewFindViewById;
            }
            viewFindViewById.startAnimation((Animation) ((LiveCoverCameraFragment) abS698S0100000_17.l0).LLJJIJIL.getValue());
        }
    }

    public static final void LIZ$5(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            ((AbstractC1115080f7i) abS698S0100000_17.l0).LJ();
        }
    }

    public static final void LIZ$6(AbS698S0100000_17 abS698S0100000_17, View view) {
        if (view != null) {
            C1AI2 c1ai2 = new C1AI2("click", null, C1AI1.LIZIZ(((ViewerWishesGuidePage) abS698S0100000_17.l0).LLL), null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -6, 2097151);
            C1AI1.LIZ(c1ai2, ((ViewerWishesGuidePage) abS698S0100000_17.l0).LLJLLL, true);
            C1AI0.LJIILLIIL(c1ai2);
            C1AIP c1aip = ((ViewerWishesGuidePage) abS698S0100000_17.l0).LLJZ;
            if (c1aip != null) {
                c1aip.NK();
            }
            ((ViewerWishesGuidePage) abS698S0100000_17.l0).close(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$7(wh6.AbS698S0100000_17 r13, android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS698S0100000_17.LIZ$7(wh6.AbS698S0100000_17, android.view.View):void");
    }

    public static final void LIZ$8(AbS698S0100000_17 abS698S0100000_17, View view) {
        String str;
        if (view != null) {
            C1117710fBx c1117710fBx = (C1117710fBx) abS698S0100000_17.l0;
            c1117710fBx.getClass();
            Map<String, String> map = UserLevelSettings.INSTANCE.getUserLevelConfig().revenueUserLevelLynxUrls;
            if (map != null) {
                str = map.get("user_level_faq_panel");
            } else {
                str = null;
            }
            C495520Jby c495520Jby = new C495520Jby(str);
            c495520Jby.LIZJ("rule_type", "sleep");
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(c1117710fBx.getContext(), UriProtector.parse(c495520Jby.LIZLLL()));
        }
    }

    public static final void LIZ$9(AbS698S0100000_17 abS698S0100000_17, View view) {
        FansClubJoinDialog fansClubJoinDialog;
        JoinDialogViewModel joinDialogViewModel;
        if (view != null && (joinDialogViewModel = (fansClubJoinDialog = (FansClubJoinDialog) abS698S0100000_17.l0).LLJZIJLIL) != null) {
            Context context = fansClubJoinDialog.getContext();
            FansClubJoinDialog fansClubJoinDialog2 = (FansClubJoinDialog) abS698S0100000_17.l0;
            joinDialogViewModel.AQ2(context, fansClubJoinDialog2.LLJLLL.LL, "roma_schema_page_user_faq", fansClubJoinDialog2.LLJZ, "");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS698S0100000_17(LiveCoverCameraFragment liveCoverCameraFragment, int i) {
        super(200L);
        this.$t = i;
        this.l0 = liveCoverCameraFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS698S0100000_17(ViewerWishesGuidePage viewerWishesGuidePage, int i) {
        super(500L);
        this.$t = i;
        this.l0 = viewerWishesGuidePage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS698S0100000_17(Object obj, int i) {
        super(800L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS698S0100000_17(Object obj, int i, int i2) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }
}
