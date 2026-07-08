package com.bytedance.android.livesdk.interaction.poll.ui;

import X.C01GW;
import X.C0IJT;
import X.C0JGR;
import X.C0UIM;
import X.C0UO0;
import X.C1086790eO5;
import X.C1086800eO6;
import X.C1086830eO9;
import X.C1086850eOB;
import X.C1086930eOJ;
import X.C1161920gLG;
import X.C16F5;
import X.C16FV;
import X.C16FZ;
import X.C1954807lC;
import X.C19U0;
import X.C19U1;
import X.C2188811AlT;
import X.C292401Bi;
import X.C474500IjA;
import X.C482260Ivg;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C751340Tdc;
import X.C754020Thw;
import X.C786410Ut5;
import X.EnumC1086920eOI;
import X.EnumC243800wu;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC1086910eOH;
import X.InterfaceC1584740rLE;
import Y.ACListenerS152S0100000_17;
import Y.AfS153S0200000_17;
import Y.AfS186S0100000_17;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.GiftPollWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.NormalPollWidget;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveGiftPollDurationSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollDurationSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PollManageDialog extends LiveDialogFragment implements InterfaceC1086910eOH {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4HELIOSLD0yKzElJiF9OCogJWEmIWscJiM/BSQiKCg2DCwtJSA0";
    public View LL;
    public C19U1 LLILLJJLI;
    public C16FV LLILLL;
    public C16F5 LLILZ;
    public C16FZ LLILZIL;
    public NormalPollWidget LLILZLL;
    public GiftPollWidget LLIZ;
    public final C01GW LLIZLLLIL = C292401Bi.LIZ(new AwS551S0100000_7(this, 71));

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C19U1 NR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rfc) : null;
            this.LLILLJJLI = (C19U1) viewFindViewById;
        }
        return (C19U1) viewFindViewById;
    }

    public final C16FV OR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sla) : null;
            this.LLILLL = (C16FV) viewFindViewById;
        }
        return (C16FV) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g_d);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    public final C16FZ getLoadingViewFromXml() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nnp) : null;
            this.LLILZIL = (C16FZ) viewFindViewById;
        }
        return (C16FZ) viewFindViewById;
    }

    public final EnumC243800wu MR() {
        DataChannel dataChannel;
        Room room;
        RoomAuthStatus roomAuthStatus;
        if (C0UIM.LIZJ()) {
            return EnumC243800wu.ONLY_NORMAL;
        }
        LivePollSetting livePollSetting = LivePollSetting.INSTANCE;
        return ((!livePollSetting.enable(this.dataChannel) || (dataChannel = this.dataChannel) == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || roomAuthStatus.enableGiftPoll != 1) && !C500260Jjc.LJJJIL(this.dataChannel)) ? livePollSetting.enable(this.dataChannel) ? EnumC243800wu.ONLY_NORMAL : EnumC243800wu.ONLY_GIFT : EnumC243800wu.ALL;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    public final void PR(EnumC1086920eOI enumC1086920eOI) {
        int i = C1086930eOJ.LIZ[enumC1086920eOI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C0JGR.t2.LJFF(Integer.valueOf(EnumC1086920eOI.GIFT.ordinal()));
                ((WidgetManager) this.LLIZLLLIL.getValue()).unload(this.LLILZLL);
                ((WidgetManager) this.LLIZLLLIL.getValue()).load(R.id.izl, this.LLIZ);
                return;
            }
            throw new C1954807lC();
        }
        C0JGR.t2.LJFF(Integer.valueOf(EnumC1086920eOI.NORMAL.ordinal()));
        ((WidgetManager) this.LLIZLLLIL.getValue()).unload(this.LLIZ);
        ((WidgetManager) this.LLIZLLLIL.getValue()).load(R.id.pbt, this.LLILZLL);
    }

    @Override // X.InterfaceC1086910eOH
    public final void X3(EnumC1086920eOI enumC1086920eOI) {
        long jLongValue;
        long millisecond;
        String optionListString;
        long j;
        long j2;
        Gift gift;
        Gift gift2;
        Long l;
        IBroadcastService iBroadcastService;
        if (enumC1086920eOI == EnumC1086920eOI.NORMAL && (iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)) != null) {
            iBroadcastService.notifyApplyStatusAndSaveStatus(EnumC773040UUc.POLL_NORMAL, EnumC771230UNd.APPLYING, null);
        }
        C500260Jjc.LLFFF(getLoadingViewFromXml());
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(C751340Tdc.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C1086850eOB pollGifts = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
        if (enumC1086920eOI == EnumC1086920eOI.GIFT) {
            millisecond = LiveGiftPollDurationSetting.INSTANCE.getMillisecond();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[\"");
            if (pollGifts != null && (gift2 = pollGifts.LIZ) != null) {
                j = gift2.id;
            } else {
                j = 6246;
            }
            sbLIZ.append(j);
            sbLIZ.append("\", \"");
            if (pollGifts != null && (gift = pollGifts.LIZIZ) != null) {
                j2 = gift.id;
            } else {
                j2 = 6247;
            }
            sbLIZ.append(j2);
            sbLIZ.append("\"]");
            optionListString = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            millisecond = LivePollDurationSetting.INSTANCE.getMillisecond();
            optionListString = LivePollSetting.INSTANCE.getOptionListString();
        }
        ((PollApi) C482260Ivg.LIZJ(PollApi.class)).startPoll(jLongValue, optionListString, millisecond, enumC1086920eOI.ordinal()).LJIILIIL(new C0UO0()).LJJLL(new AfS153S0200000_17(enumC1086920eOI, this, 8), new AfS186S0100000_17(this, 60));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC1086920eOI enumC1086920eOI;
        float fLIZIZ;
        Long lValueOf;
        Gift gift;
        Gift gift2;
        C19U0 tabAt;
        TextView textView;
        String string;
        TextView textView2;
        String quantityString;
        Resources resources;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.gg0(C754020Thw.class);
        }
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        Long lValueOf2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.yg_);
            } else {
                viewFindViewById = null;
            }
            this.LL = viewFindViewById;
        }
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 58), viewFindViewById);
        this.LLILZLL = new NormalPollWidget(this);
        this.LLIZ = new GiftPollWidget(this);
        C786410Ut5.LLFFF(0, NR());
        C19U0 c19u0NewTab = NR().newTab();
        c19u0NewTab.LIZJ(R.layout.go7);
        View view3 = c19u0NewTab.LJFF;
        if (view3 != null && (textView2 = (TextView) view3.findViewById(R.id.wy6)) != null) {
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null) {
                quantityString = resources.getQuantityString(2131755536, 1);
            } else {
                quantityString = null;
            }
            textView2.setText(quantityString);
        }
        EnumC1086920eOI enumC1086920eOI2 = EnumC1086920eOI.GIFT;
        c19u0NewTab.LIZ = Integer.valueOf(enumC1086920eOI2.ordinal());
        C19U0 c19u0NewTab2 = NR().newTab();
        c19u0NewTab2.LIZJ(R.layout.go7);
        View view4 = c19u0NewTab2.LJFF;
        if (view4 != null && (textView = (TextView) view4.findViewById(R.id.wy6)) != null) {
            Context context2 = getContext();
            if (context2 != null) {
                string = context2.getString(2131843674);
            } else {
                string = null;
            }
            textView.setText(string);
        }
        EnumC1086920eOI enumC1086920eOI3 = EnumC1086920eOI.NORMAL;
        c19u0NewTab2.LIZ = Integer.valueOf(enumC1086920eOI3.ordinal());
        NR().addOnTabSelectedListener(new InterfaceC1584740rLE() { // from class: X.0eOK
            @Override // X.InterfaceC1586460rO0
            public final void ih(C19U0 c19u0) {
            }

            @Override // X.InterfaceC1586460rO0
            public final void Oq(C19U0 c19u0) {
                View view5;
                TextView textView3;
                if (this.LL.getContext() != null && (view5 = c19u0.LJFF) != null && (textView3 = (TextView) view5.findViewById(R.id.wy6)) != null) {
                    textView3.setTextColor(C446980Hfs.LIZ(this.LL.getContext(), R.color.da));
                }
                Object obj = c19u0.LIZ;
                EnumC1086920eOI enumC1086920eOI4 = EnumC1086920eOI.GIFT;
                if (Intrinsics.LJFF(obj, Integer.valueOf(enumC1086920eOI4.ordinal()))) {
                    this.LL.PR(enumC1086920eOI4);
                    return;
                }
                EnumC1086920eOI enumC1086920eOI5 = EnumC1086920eOI.NORMAL;
                if (!Intrinsics.LJFF(obj, Integer.valueOf(enumC1086920eOI5.ordinal()))) {
                    return;
                }
                this.LL.PR(enumC1086920eOI5);
            }

            @Override // X.InterfaceC1586460rO0
            public final void Yn(C19U0 c19u0) {
                View view5;
                TextView textView3;
                if (this.LL.getContext() != null && (view5 = c19u0.LJFF) != null && (textView3 = (TextView) view5.findViewById(R.id.wy6)) != null) {
                    textView3.setTextColor(C446980Hfs.LIZ(this.LL.getContext(), R.color.di));
                }
            }
        });
        final float fLJJI = C497740JfY.LJJI((int) (C497740JfY.LJIILLIIL() * 0.6f)) * 2;
        C786410Ut5.m8(OR(), new View.OnClickListener() { // from class: X.00wt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sslocal://webcast_webview_popup?url=https%3A%2F%2Fsf19-draftcdn-sg.ibytedtos.com%2Fobj%2Fies-hotsoon-draft-sg%2Ftiktok-live-faq%2Fgift_pull.html&gravity=bottom&height=");
                sbLIZ.append(fLJJI);
                sbLIZ.append("rpx&radius=16rpx&use_spark=1");
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.getContext(), C2188811AlT.LIZIZ(sbLIZ));
            }
        });
        if (MR() == EnumC243800wu.ALL) {
            NR().addTab(c19u0NewTab2, false);
            C786410Ut5.LLJJJJJIL(OR(), 8);
            if (((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts() != null) {
                NR().addTab(c19u0NewTab, false);
                C786410Ut5.LLJJJJJIL(OR(), 0);
            }
            if (NR().getTabCount() <= 1) {
                C19U0 tabAt2 = NR().getTabAt(0);
                if (tabAt2 != null) {
                    tabAt2.LIZIZ();
                }
                C786410Ut5.LLFFF(8, NR());
                C786410Ut5.LLJJJJJIL(OR(), 8);
                View viewFindViewById2 = this.LLILZ;
                if (viewFindViewById2 == null) {
                    View view5 = getView();
                    if (view5 != null) {
                        viewFindViewById2 = view5.findViewById(R.id.pbs);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLILZ = (C16F5) viewFindViewById2;
                }
                C786410Ut5.LLJJJJ((C16F5) viewFindViewById2, 0);
            } else {
                if (NR().getTabCount() >= 2) {
                    Integer numLIZIZ = C0JGR.t2.LIZIZ();
                    int iOrdinal = enumC1086920eOI2.ordinal();
                    if (numLIZIZ != null && numLIZIZ.intValue() == iOrdinal) {
                        C19U0 tabAt3 = NR().getTabAt(enumC1086920eOI2.ordinal());
                        if (tabAt3 != null) {
                            tabAt3.LIZIZ();
                        }
                        enumC1086920eOI = enumC1086920eOI2;
                    }
                }
                if (NR().getTabCount() >= 2) {
                    Integer numLIZIZ2 = C0JGR.t2.LIZIZ();
                    int iOrdinal2 = enumC1086920eOI3.ordinal();
                    if (numLIZIZ2 != null && numLIZIZ2.intValue() == iOrdinal2 && (tabAt = NR().getTabAt(enumC1086920eOI3.ordinal())) != null) {
                        tabAt.LIZIZ();
                    }
                }
            }
            enumC1086920eOI = enumC1086920eOI3;
        } else if (MR() == EnumC243800wu.ONLY_NORMAL) {
            NR().addTab(c19u0NewTab2, true);
            C786410Ut5.LLFFF(8, NR());
            View viewFindViewById3 = this.LLILZ;
            if (viewFindViewById3 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById3 = view6.findViewById(R.id.pbs);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILZ = (C16F5) viewFindViewById3;
            }
            C786410Ut5.LLJJJJ((C16F5) viewFindViewById3, 0);
            C786410Ut5.LLJJJJJIL(OR(), 8);
            enumC1086920eOI = enumC1086920eOI3;
        } else {
            NR().addTab(c19u0NewTab, true);
            C786410Ut5.LLJJJJJIL(OR(), 0);
            enumC1086920eOI = enumC1086920eOI2;
        }
        HashMap map = new HashMap();
        C1086850eOB pollGifts = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
        String str = "gift_poll";
        if (C1086800eO6.LIZJ) {
            if (C1086830eO9.LIZ == enumC1086920eOI2) {
                map.put("ongoing_type", "gift_poll");
                if (pollGifts != null && (gift2 = pollGifts.LIZ) != null) {
                    lValueOf = Long.valueOf(gift2.id);
                } else {
                    lValueOf = null;
                }
                map.put("gift_1_id", String.valueOf(lValueOf));
                if (pollGifts != null && (gift = pollGifts.LIZIZ) != null) {
                    lValueOf2 = Long.valueOf(gift.id);
                }
                map.put("gift_2_id", String.valueOf(lValueOf2));
            } else {
                map.put("ongoing_type", "normal_poll");
            }
            map.put("poll_id", String.valueOf(C1086830eO9.LIZIZ));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_panel_show");
        C1086790eO5.LIZLLL(c474500IjALIZ);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(C1086800eO6.LIZJ ? 1 : 0), "is_ongoing");
        if (enumC1086920eOI != enumC1086920eOI2) {
            str = "normal_poll";
        }
        c474500IjALIZ.LJJII(str, "poll_type");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        View viewFindViewById4 = view.findViewById(R.id.rff);
        ViewGroup.LayoutParams layoutParams = viewFindViewById4.getLayoutParams();
        DataChannel dataChannel2 = this.dataChannel;
        if ((C1086830eO9.LIZ(dataChannel2, enumC1086920eOI3) == null && !C1086830eO9.LIZLLL()) || (C1086830eO9.LIZ(dataChannel2, enumC1086920eOI2) == null && !C1086830eO9.LIZJ())) {
            fLIZIZ = C497740JfY.LIZIZ(375.0f);
        } else {
            fLIZIZ = C497740JfY.LIZIZ(294.0f);
        }
        layoutParams.height = (int) fLIZIZ;
        C786410Ut5.W5(viewFindViewById4, layoutParams);
    }
}
