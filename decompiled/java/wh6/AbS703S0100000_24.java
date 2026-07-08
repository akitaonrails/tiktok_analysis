package wh6;

import X.AbstractC1579820rDI;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C0HWQ;
import X.C0N14;
import X.C0P0T;
import X.C0W17;
import X.C1161920gLG;
import X.C1323690kYB;
import X.C1360460lVU;
import X.C1388190mED;
import X.C1391600mJi;
import X.C15438062q;
import X.C1562980qm8;
import X.C1573890r3j;
import X.C1574800r5C;
import X.C1574810r5D;
import X.C1574820r5E;
import X.C1575450r6F;
import X.C1587150rP7;
import X.C1587160rP8;
import X.C1595430rcT;
import X.C1608260rxA;
import X.C1609070ryT;
import X.C1697810uHb;
import X.C1803800x2Y;
import X.C1804840x4E;
import X.C19EG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C443090HZb;
import X.C446900Hfk;
import X.C500260Jjc;
import X.C636770OyJ;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC912680ZrG;
import X.InterfaceC1391650mJn;
import X.InterfaceC1579720rD8;
import X.InterfaceC1579970rDX;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.friendstab.guidecard.component.FriendsGuideCardRootAssem;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsV3RouterAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LiveAudioMuteAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.other.FriendsV3LVBCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.other.FriendsV3RepostEntranceCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.publish.FriendsV3PublishCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.video.FriendsV3AudioMuteAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3NavBarAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3AudioMuteViewModel;
import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentMeta;
import com.ss.android.ugc.aweme.service.MiniDramaHostService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.widget.guide.StoryWidgetGuideInboxCell;
import com.ss.android.ugc.aweme.vibefeed.feed.topbar.assem.VibeFeedMenuAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS97S0110000_9;
import webcast.api.profit.IapListResult;

/* JADX INFO: loaded from: classes25.dex */
public class AbS703S0100000_24 extends AbstractViewOnClickListenerC1637610siV {
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
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS703S0100000_24(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            ((C1562980qm8) abS703S0100000_24.l0).LJII.invoke(view);
        }
    }

    public static final void LIZ$1(AbS703S0100000_24 abS703S0100000_24, View view) {
        InterfaceC1579720rD8 blockInfo;
        InterfaceC1579970rDX callback;
        if (view != null && (blockInfo = ((AbstractC1579820rDI) abS703S0100000_24.l0).getBlockInfo()) != null && (callback = ((AbstractC1579820rDI) abS703S0100000_24.l0).getCallback()) != null) {
            callback.LIZJ(blockInfo);
        }
    }

    public static final void LIZ$10(AbS703S0100000_24 abS703S0100000_24, View view) {
        EnumC912680ZrG enumC912680ZrG;
        int i;
        EnumC912680ZrG enumC912680ZrG2;
        int i2;
        EnumC912680ZrG enumC912680ZrG3;
        int i3;
        if (view != null) {
            final VibeFeedMenuAssem vibeFeedMenuAssem = (VibeFeedMenuAssem) abS703S0100000_24.l0;
            vibeFeedMenuAssem.getClass();
            C0HWQ c0hwq = new C0HWQ(vibeFeedMenuAssem.LJJIJL().getContext());
            C443090HZb[] c443090HZbArr = new C443090HZb[3];
            C636770OyJ c636770OyJGo = vibeFeedMenuAssem.Go();
            if (c636770OyJGo != null) {
                enumC912680ZrG = c636770OyJGo.LL;
            } else {
                enumC912680ZrG = null;
            }
            EnumC912680ZrG enumC912680ZrG4 = EnumC912680ZrG.MUTUAL_FEED_SCENE_PRIVATE;
            if (enumC912680ZrG == enumC912680ZrG4) {
                i = 2131848003;
            } else {
                i = 2131835315;
            }
            c443090HZbArr[0] = new C443090HZb(vibeFeedMenuAssem.Ho(i), new C1574800r5C(vibeFeedMenuAssem), R.raw.icon_two_person_close, null, 0, null, 0, false, false, null, 760);
            C636770OyJ c636770OyJGo2 = vibeFeedMenuAssem.Go();
            if (c636770OyJGo2 != null) {
                enumC912680ZrG2 = c636770OyJGo2.LL;
            } else {
                enumC912680ZrG2 = null;
            }
            if (enumC912680ZrG2 == enumC912680ZrG4) {
                i2 = 2131848002;
            } else {
                i2 = 2131835314;
            }
            c443090HZbArr[1] = new C443090HZb(vibeFeedMenuAssem.Ho(i2), new C1574810r5D(vibeFeedMenuAssem), R.raw.icon_watch_history, null, 0, null, 0, false, false, null, 760);
            C636770OyJ c636770OyJGo3 = vibeFeedMenuAssem.Go();
            if (c636770OyJGo3 != null) {
                enumC912680ZrG3 = c636770OyJGo3.LL;
            } else {
                enumC912680ZrG3 = null;
            }
            if (enumC912680ZrG3 == enumC912680ZrG4) {
                i3 = 2131848001;
            } else {
                i3 = 2131835313;
            }
            c443090HZbArr[2] = new C443090HZb(vibeFeedMenuAssem.Ho(i3), new C1574820r5E(vibeFeedMenuAssem), R.raw.icon_poll_ltr, null, 0, null, 0, false, false, null, 760);
            c0hwq.LJIIL(Collections.singletonList(C1697810uHb.LJIIJJI(c443090HZbArr)));
            c0hwq.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(223));
            View viewLJJIJL = vibeFeedMenuAssem.LJJIJL();
            C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
            c1391600mJi.LIZIZ = viewLJJIJL;
            c1391600mJi.LJIIL = false;
            c0hwq.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            C0P0T c0p0tLIZIZ = c0hwq.LIZIZ();
            c0p0tLIZIZ.LJIJ(new InterfaceC1391650mJn() { // from class: X.0r5x
                @Override // X.InterfaceC1391650mJn
                public final void onShow() {
                    String str;
                    EnumC912680ZrG enumC912680ZrG5;
                    C1575290r5z c1575290r5z = C1575290r5z.LIZ;
                    C636770OyJ c636770OyJGo4 = vibeFeedMenuAssem.Go();
                    String str2 = c636770OyJGo4 != null ? c636770OyJGo4.LLILZ : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C0P38 c0p38LIZ = C0P30.LIZ();
                    C636770OyJ c636770OyJGo5 = vibeFeedMenuAssem.Go();
                    if (c636770OyJGo5 == null || (str = c636770OyJGo5.LLILZ) == null) {
                        str = "";
                    }
                    String strLIZLLL = c0p38LIZ.LIZLLL(str);
                    C636770OyJ c636770OyJGo6 = vibeFeedMenuAssem.Go();
                    if (c636770OyJGo6 == null || (enumC912680ZrG5 = c636770OyJGo6.LL) == null) {
                        enumC912680ZrG5 = EnumC912680ZrG.MUTUAL_FEED_SCENE_PRIVATE;
                    }
                    c1575290r5z.getClass();
                    Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "shared_feed"), new Pair("shared_feed_id", strLIZLLL), new Pair("conversation_id", str2), new Pair("chat_type", enumC912680ZrG5.stringValue()));
                    if (enumC912680ZrG5.isPrivate()) {
                        String strLIZJ = C1575210r5r.LLILLJJLI.LIZJ(str2);
                        mapLJIIJ.put("invitee_uid", strLIZJ != null ? strLIZJ : "");
                    }
                    C20684815ws.LJIILLIIL("ttsocial_shared_feed_menu_show", mapLJIIJ);
                }
            });
            c0p0tLIZIZ.show();
        }
    }

    public static final void LIZ$11(AbS703S0100000_24 abS703S0100000_24, View view) {
        IFriendsV3RouterAbility iFriendsV3RouterAbility;
        if (view != null && (iFriendsV3RouterAbility = (IFriendsV3RouterAbility) ((FriendsV3NavBarAssem) abS703S0100000_24.l0).LLJJ.getValue()) != null) {
            iFriendsV3RouterAbility.Az();
        }
    }

    public static final void LIZ$12(AbS703S0100000_24 abS703S0100000_24, View view) {
        IFriendsV3RouterAbility iFriendsV3RouterAbility;
        if (view != null && (iFriendsV3RouterAbility = (IFriendsV3RouterAbility) ((FriendsV3NavBarAssem) abS703S0100000_24.l0).LLJJ.getValue()) != null) {
            iFriendsV3RouterAbility.CD1("", "homepage_friends");
        }
    }

    public static final void LIZ$13(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            ((C1575450r6F) abS703S0100000_24.l0).LJ();
        }
    }

    public static final void LIZ$14(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            ((C1575450r6F) abS703S0100000_24.l0).LJ();
        }
    }

    public static final void LIZ$15(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            ((C1575450r6F) abS703S0100000_24.l0).LJ();
        }
    }

    public static final void LIZ$16(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            ((C1575450r6F) abS703S0100000_24.l0).LJ();
        }
    }

    public static final void LIZ$17(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            ((StoryWidgetGuideInboxCell) abS703S0100000_24.l0).I5();
        }
    }

    public static final void LIZ$18(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            ((C1562980qm8) abS703S0100000_24.l0).LJII.invoke(view);
        }
    }

    public static final void LIZ$19(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            ((FriendsV3PublishCell) abS703S0100000_24.l0).S5();
        }
    }

    public static final void LIZ$2(AbS703S0100000_24 abS703S0100000_24, View view) {
        String str;
        String str2;
        IapListResult.QuickChargeConfig quickChargeConfig;
        IapListResult.ListResultExtra listResultExtraLJII;
        IapListResult.QuickChargeConfig quickChargeConfig2;
        if (view != null) {
            C500260Jjc.LJIILIIL(((RechargeDialogNew) abS703S0100000_24.l0).iS());
            RechargeViewModel rechargeViewModelQS = ((RechargeDialogNew) abS703S0100000_24.l0).qS();
            Context context = ((RechargeDialogNew) abS703S0100000_24.l0).LLJLL;
            C1804840x4E c1804840x4E = rechargeViewModelQS.LLIZ;
            if (c1804840x4E != null && (listResultExtraLJII = c1804840x4E.LJII()) != null && (quickChargeConfig2 = listResultExtraLJII.quickChargeConfig) != null) {
                str = quickChargeConfig2.jumpUrl;
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(str));
            }
            RechargeViewModel rechargeViewModelQS2 = ((RechargeDialogNew) abS703S0100000_24.l0).qS();
            Context context2 = ((RechargeDialogNew) abS703S0100000_24.l0).LLJLL;
            if (context2 == null) {
                rechargeViewModelQS2.getClass();
            } else {
                IapListResult.ListResultExtra listResultExtraVx1 = rechargeViewModelQS2.vx1();
                if (listResultExtraVx1 == null || (quickChargeConfig = listResultExtraVx1.quickChargeConfig) == null || (str2 = quickChargeConfig.redDotDedupId) == null) {
                    str2 = "";
                }
                C1323690kYB.LIZ(context2).LJIIIIZZ(Boolean.TRUE, C786410Ut5.j4("live_wallet_quick_charge_notification_%s", Arrays.copyOf(new Object[]{str2}, 1)));
            }
            C1803800x2Y.LIZ.getClass();
            C1803800x2Y.LJJIIZI("button");
        }
    }

    public static final void LIZ$20(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            ((FriendsGuideCardRootAssem) abS703S0100000_24.l0).cp();
        }
    }

    public static final void LIZ$21(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            ((FriendsGuideCardRootAssem) abS703S0100000_24.l0).cp();
        }
    }

    public static final void LIZ$22(AbS703S0100000_24 abS703S0100000_24, View view) {
        View.OnClickListener onClickListenerLIZIZ;
        if (view != null && (onClickListenerLIZIZ = ((C1609070ryT) abS703S0100000_24.l0).LIZ.LIZIZ(1)) != null) {
            onClickListenerLIZIZ.onClick(view);
        }
    }

    public static final void LIZ$3(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            AssemVMLazy assemVMLazy = ((FriendsV3LiveAudioMuteAssem) abS703S0100000_24.l0).LLJJJJJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FriendsV3LiveAudioMuteAssem.LLJJLIIIJLLLLLLLZ;
            boolean z = ((C1608260rxA) assemVMLazy.getValue().getState()).LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("live mute onClick, curIsMute=");
            sbLIZ.append(z);
            C0W17.LIZJ("liveAudioMute", C2188811AlT.LIZIZ(sbLIZ));
            ((FriendsV3AudioMuteViewModel) ((FriendsV3LiveAudioMuteAssem) abS703S0100000_24.l0).LLJJJJJIL.getValue()).vQ2(!z);
        }
    }

    public static final void LIZ$4(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            ((FriendsV3LVBCell) abS703S0100000_24.l0).N5(false);
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(((FriendsV3LVBCell) abS703S0100000_24.l0).itemView.getContext());
            if (c19egLIZIZ != null) {
                ((FriendsV3LVBCell) abS703S0100000_24.l0).getClass();
                C446900Hfk c446900Hfk = Hox.LLJILJIL;
                Hox hoxLIZ = c446900Hfk.LIZ(c19egLIZIZ);
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
                hoxLIZ.TQ2(bundle, "HOME", false);
                Hox hoxLIZ2 = c446900Hfk.LIZ(c19egLIZIZ);
                Bundle bundle2 = new Bundle();
                C786410Ut5.LJJJI("fromStart", "MainPage", bundle2);
                hoxLIZ2.TQ2(bundle2, "For You", false);
            }
        }
    }

    public static final void LIZ$5(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            ((FriendsV3RepostEntranceCell) abS703S0100000_24.l0).P5(false);
            List<C1587160rP8> list = ((FriendsV3RepostEntranceCell) abS703S0100000_24.l0).LLILZLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1587160rP8> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZIZ);
            }
            C1587150rP7.LIZIZ.LJIJJLI(arrayList);
            FriendsV3RepostEntranceCell friendsV3RepostEntranceCell = (FriendsV3RepostEntranceCell) abS703S0100000_24.l0;
            List<C1587160rP8> list2 = friendsV3RepostEntranceCell.LLILZLL;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C1587160rP8> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().LIZIZ);
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((RepostNewContentMeta) it4.next()).itemId);
            }
            C1587150rP7.LIZIZ.LJIJI(arrayList3);
            for (C1587160rP8 c1587160rP8 : friendsV3RepostEntranceCell.LLILZLL) {
                C1360460lVU.LIZIZ.LJII(c1587160rP8.LIZIZ.itemId, c1587160rP8.LIZ.uid);
            }
            AssemVMLazy assemVMLazy = ((FriendsV3RepostEntranceCell) abS703S0100000_24.l0).LLIZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FriendsV3RepostEntranceCell.LLJJJ;
            assemVMLazy.getValue().setStateImmediate(new AwS97S0110000_9(true, (C0N14) new C0N14() { // from class: X.0N13
            }, 10));
            C1587150rP7.LIZIZ.LJIIJJI(((FriendsV3RepostEntranceCell) abS703S0100000_24.l0).itemView.getContext(), "homepage_friends", C2097608Jq.LJIIIIZZ(new Pair("friends_v3_detail_type", "friends_v3_repost_feeds_detail"), new Pair("enter_from", "homepage_friends")));
            C1595430rcT.LIZIZ.LIZIZ().visitSingleFeed("REPOST_FEED");
        }
    }

    public static final void LIZ$6(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            ((FriendsV3PublishCell) abS703S0100000_24.l0).S5();
        }
    }

    public static final void LIZ$7(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            boolean z = ((FriendsV3AudioMuteAssem) abS703S0100000_24.l0).cp().getState().LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mute onClick, curIsMute=");
            sbLIZ.append(z);
            C0W17.LIZJ("audioMute", C2188811AlT.LIZIZ(sbLIZ));
            ((FriendsV3AudioMuteAssem) abS703S0100000_24.l0).cp().vQ2(!z);
        }
    }

    public static final void LIZ$8(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            MiniDramaHostService.LIZ.getClass();
            MiniDramaHostService miniDramaHostServiceLIZ = C1573890r3j.LIZ();
            if (miniDramaHostServiceLIZ != null) {
                miniDramaHostServiceLIZ.LJII(((View) abS703S0100000_24.l0).getContext());
            }
        }
    }

    public static final void LIZ$9(AbS703S0100000_24 abS703S0100000_24, View view) {
        if (view != null) {
            ((StoryWidgetGuideInboxCell) abS703S0100000_24.l0).I5();
        }
    }
}
