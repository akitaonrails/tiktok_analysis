package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.AbstractC21673619ry;
import X.C015V;
import X.C015X;
import X.C0IJT;
import X.C0UKZ;
import X.C0UX6;
import X.C1148240fzC;
import X.C1148440fzW;
import X.C13LE;
import X.C197400pQ;
import X.C197600pS;
import X.C20635915oz;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C354201Zc;
import X.C474500IjA;
import X.C486790J7d;
import X.C497740JfY;
import X.C500260Jjc;
import X.C770220UJg;
import X.C771430UNx;
import X.C772150UQr;
import X.C781270Ukn;
import X.C784210UpX;
import X.C784220UpY;
import X.C784250Upb;
import X.C784260Upc;
import X.C784270Upd;
import X.C784280Upe;
import X.C823050WQl;
import X.InterfaceC773360UVi;
import X.InterfaceC784360Upm;
import X.InterfaceC784370Upn;
import X.RunnableC514801zW;
import Y.ARunnableS112S0100000_12;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.SwitchLiveModeChannel;
import com.bytedance.android.live.SwitchToNextLiveModeEvent;
import com.bytedance.android.live.SwitchToPreviousLiveModeEvent;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.PreviewGoLiveLoadingEvent;
import com.bytedance.android.livesdk.broadcast.PreviewHideLiveModeChannel;
import com.bytedance.android.livesdk.broadcast.SmoothScrollToVideoEvent;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidget;
import com.bytedance.android.livesdk.broadcast.setting.LiveManagerCoexistLiveStudioSetting;
import com.bytedance.android.livesdk.broadcast.setting.ShowLiveManagerEntranceSetting;
import com.bytedance.android.livesdk.dataChannel.DeepLinkAutoLinkToLiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.DeepLinkLiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.GameGuideChangeLiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveStudioTagShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewLiveStudioTipsClickEvent;
import com.bytedance.android.livesdk.dataChannel.PreviewPageSelectLiveMode;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNoPermissionDisplaySwitch;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.bytedance.android.livesdk.model.AnchorLiveManagerEntranceInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.LiveManagerEntranceInfo;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewLiveModeWidget extends PreviewWidget {
    public final ArrayList<C784280Upe> LLILZ = new ArrayList<>(0);
    public int LLILZIL = -1;
    public final DetailLivePermission LLILZLL;
    public boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final C784270Upd LLJILLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1h;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final boolean x1() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [X.0UTZ] */
    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        AnchorLiveManagerEntranceInfo anchorLiveManagerEntranceInfoLIZIZ;
        LiveManagerEntranceInfo liveManagerEntranceInfo;
        super.E1();
        if (PreviewEnterFpsOptSetting.INSTANCE.enable()) {
            C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0Iib
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreviewLiveModeWidget@ec44.refreshLiveStatus$1");
                    try {
                        InterfaceC784360Upm interfaceC784360UpmFY1 = C781270Ukn.LJIJJ().fY1();
                        if (interfaceC784360UpmFY1 != null) {
                            interfaceC784360UpmFY1.LIZ();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreviewLiveModeWidget@ec44.refreshLiveStatus$1");
                }
            });
        } else {
            InterfaceC784360Upm interfaceC784360UpmFY1 = C781270Ukn.LJIJJ().fY1();
            if (interfaceC784360UpmFY1 != null) {
                interfaceC784360UpmFY1.LIZ();
            }
        }
        C486790J7d.LIZ(new ARunnableS112S0100000_12(this, 405));
        boolean z = LiveNoPermissionDisplaySwitch.INSTANCE.enable() && Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C1148240fzC.class), Boolean.TRUE);
        boolean z2 = this.LLJI || z;
        if (this.LLJILJIL) {
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.e8o, this.context);
            if (c20743516FdLIZLLL != null) {
                c20743516FdLIZLLL.setTint(C497740JfY.LJFF(R.color.f569bc));
            } else {
                c20743516FdLIZLLL = null;
            }
            C20743516Fd c20743516FdLIZLLL2 = C20736316Cj.LIZLLL(R.attr.e8o, this.context);
            if (c20743516FdLIZLLL2 != null) {
                c20743516FdLIZLLL2.setTint(C497740JfY.LJFF(R.color.bg));
            } else {
                c20743516FdLIZLLL2 = null;
            }
            C784280Upe c784280Upe = new C784280Upe(C497740JfY.LJIJI(2131843419), -1, -1, LiveMode.LIVE_VOICE, false, c20743516FdLIZLLL, c20743516FdLIZLLL2);
            this.LLILZ.add(c784280Upe);
            C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_PREVIEW_VOICE_CHAT;
            RedDotExtensionKt.LJIIL(c0ux6, "fixed", c0ux6.getCurrentId());
            RedDotExtensionKt.LJI(null, this, null, c0ux6, new AwS378S0200000_12(c784280Upe, this, 21));
        }
        if (this.LLIZLLLIL || z) {
            this.LLILZ.add(new C784280Upe(C497740JfY.LJIJI(2131841086), R.drawable.ebs, R.drawable.ebt, LiveMode.VIDEO));
        }
        if (z2) {
            this.LLILZ.add(new C784280Upe(C497740JfY.LJIJI(2131842805), R.drawable.ebp, R.drawable.ebq, LiveMode.SCREEN_RECORD));
        }
        if (this.LLJIJIL) {
            this.LLILZ.add(new C784280Upe(C497740JfY.LJIJI(2131842839), R.drawable.ebf, R.drawable.ebg, LiveMode.LIVE_STUDIO));
        }
        if (this.LLJ) {
            this.LLILZ.add(new C784280Upe(C497740JfY.LJIJI(2131852510), R.drawable.eb7, R.drawable.eb8, LiveMode.THIRD_PARTY));
        }
        if (ShowLiveManagerEntranceSetting.INSTANCE.isEnable() && (anchorLiveManagerEntranceInfoLIZIZ = C0UKZ.LLIL.LIZIZ()) != null && anchorLiveManagerEntranceInfoLIZIZ.anchorId == UserService.getInstance().user().getCurrentUser().getId() && (liveManagerEntranceInfo = anchorLiveManagerEntranceInfoLIZIZ.entranceInfo) != null && liveManagerEntranceInfo.showLiveManagerEntrance) {
            G1(anchorLiveManagerEntranceInfoLIZIZ != null ? anchorLiveManagerEntranceInfoLIZIZ.entranceInfo : null);
        }
        if (LivePreviewComponentsSimplifyTypeSetting.INSTANCE.inExperiment() && this.LLIZLLLIL && this.LLILZ.size() == 1) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(PreviewHideLiveModeChannel.class, Boolean.TRUE);
            }
            hide();
        } else {
            for (C784280Upe c784280Upe2 : this.LLILZ) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_type_entrance_show");
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                c474500IjALIZ.LJJII(C354201Zc.LIZ(c784280Upe2.LJ), "show_live_type");
                c474500IjALIZ.LIZ();
            }
            C784270Upd c784270Upd = this.LLJILLL;
            C784220UpY c784220UpYM1 = M1();
            c784270Upd.LLILLJJLI = c784220UpYM1;
            if (c784220UpYM1 != null) {
                c784220UpYM1.setAdapter(c784270Upd);
            }
            this.LLJILLL.LLLFZ(this.LLILZ);
        }
        C784220UpY c784220UpYM12 = M1();
        if (c784220UpYM12 != null) {
            c784220UpYM12.LL.addOnItemTouchListener(new C784210UpX(c784220UpYM12.getContext(), c784220UpYM12.LL, new InterfaceC773360UVi() { // from class: X.0UTZ
                @Override // X.InterfaceC773360UVi
                public final void LIZ(int i) {
                    C784220UpY c784220UpYM13 = this.LIZ.M1();
                    if (c784220UpYM13 != null) {
                        c784220UpYM13.LLILLJJLI.LL = false;
                        c784220UpYM13.LL.smoothScrollToPosition(i + 1);
                    }
                }
            }));
        }
        C784220UpY c784220UpYM13 = M1();
        if (c784220UpYM13 != null) {
            InterfaceC784370Upn interfaceC784370Upn = new InterfaceC784370Upn() { // from class: X.0Upl
                @Override // X.InterfaceC784370Upn
                public final void LJLJJI(int i) {
                    this.LIZ.N1(i, null, null);
                    PreviewLiveModeWidget previewLiveModeWidget = this.LIZ;
                    if (previewLiveModeWidget.LLJILJILJ) {
                        previewLiveModeWidget.O1(i, false);
                    }
                    this.LIZ.LLJILJILJ = true;
                }
            };
            C20635915oz c20635915oz = c784220UpYM13.LLILLL;
            if (c20635915oz instanceof C784260Upc) {
                C784260Upc c784260Upc = (C784260Upc) c20635915oz;
                if (c784260Upc.LJFF == null) {
                    c784260Upc.LJFF = new ArrayList();
                }
                ((ArrayList) c784260Upc.LJFF).add(interfaceC784370Upn);
            }
            C784250Upb c784250Upb = c784220UpYM13.LL;
            if (c784250Upb instanceof C784250Upb) {
                if (c784250Upb.LLILLJJLI == null) {
                    c784250Upb.LLILLJJLI = new ArrayList();
                }
                List<InterfaceC784370Upn> list = c784250Upb.LLILLJJLI;
                if (list != null) {
                    ((ArrayList) list).add(interfaceC784370Upn);
                }
            }
        }
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new RunnableC514801zW(this, 151));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, PreviewLiveStudioTipsClickEvent.class, new AwS591S0100000_12(this, 284));
            dataChannel2.BQ2(this, DeepLinkAutoLinkToLiveModeChannel.class, new AwS591S0100000_12(this, 285));
            dataChannel2.BQ2(this, GameGuideChangeLiveModeChannel.class, new AwS591S0100000_12(this, 286));
            dataChannel2.BQ2(this, SwitchToNextLiveModeEvent.class, new AwS591S0100000_12(this, 287));
            dataChannel2.BQ2(this, SwitchToPreviousLiveModeEvent.class, new AwS591S0100000_12(this, 288));
            dataChannel2.BQ2(this, PreviewGoLiveLoadingEvent.class, new AwS591S0100000_12(this, 289));
            dataChannel2.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 290));
            dataChannel2.BQ2(this, SwitchLiveModeChannel.class, new AwS591S0100000_12(this, 291));
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, SmoothScrollToVideoEvent.class, new AwS591S0100000_12(this, 292));
        View view2 = getView();
        if (view2 != null) {
            HandlerHook.viewPost(view2, new ARunnableS112S0100000_12(this, 79));
        }
        if (this.LLJIJIL) {
            C770220UJg c770220UJg = C770220UJg.LIZ;
            C770220UJg.LJ(C13LE.LIZ(LiveStudioTagShowChannel.class));
        }
    }

    public final String L1() {
        C772150UQr c772150UQr;
        String str;
        DataChannel dataChannel = this.dataChannel;
        return (dataChannel == null || (c772150UQr = (C772150UQr) dataChannel.gg0(C771430UNx.class)) == null || (str = c772150UQr.LIZ) == null) ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PreviewLiveModeWidget() {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidget.<init>():void");
    }

    public final C784220UpY M1() {
        View view = getView();
        if (view instanceof C784220UpY) {
            return (C784220UpY) view;
        }
        return null;
    }

    public final void G1(LiveManagerEntranceInfo liveManagerEntranceInfo) {
        String str;
        boolean zIsEnable = LiveManagerCoexistLiveStudioSetting.INSTANCE.isEnable();
        if (!zIsEnable) {
            C500260Jjc.LJJJLZIJ(this.LLILZ, AFwS245S0000000_12.get$arr$(38));
        }
        int size = this.LLILZ.size();
        Iterator<C784280Upe> it2 = this.LLILZ.iterator();
        int iIntValue = 0;
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().LJ == LiveMode.SCREEN_RECORD) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        String str2 = null;
        if (zIsEnable) {
            Iterator<C784280Upe> it3 = this.LLILZ.iterator();
            int i2 = 0;
            while (true) {
                if (it3.hasNext()) {
                    if (it3.next().LJ == LiveMode.LIVE_STUDIO) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            Iterator<C784280Upe> it4 = this.LLILZ.iterator();
            int i3 = 0;
            while (true) {
                if (it4.hasNext()) {
                    if (it4.next().LJ == LiveMode.THIRD_PARTY) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i != -1) {
                size = i;
            } else if (i2 != -1) {
                size = i2;
            } else if (i3 != -1) {
                size = i3;
            }
            Integer numValueOf = Integer.valueOf(size);
            if (numValueOf.intValue() >= 0) {
                iIntValue = numValueOf.intValue();
            }
        } else {
            if (liveManagerEntranceInfo != null) {
                str2 = liveManagerEntranceInfo.libraExperimentGroup;
            }
            if (!Intrinsics.LJFF(str2, "1")) {
                if (i != -1) {
                    iIntValue = i + 1;
                }
            } else if (i != -1) {
                size = i;
            }
            Integer numValueOf2 = Integer.valueOf(size);
            if (numValueOf2.intValue() >= 0) {
                iIntValue = numValueOf2.intValue();
            }
        }
        try {
            ArrayList<C784280Upe> arrayList = this.LLILZ;
            if (liveManagerEntranceInfo == null || (str = liveManagerEntranceInfo.bottomLiveManagerTabName) == null) {
                str = "";
            }
            arrayList.add(iIntValue, new C784280Upe(str, R.drawable.ebd, R.drawable.ebe, LiveMode.LIVE_MANAGER));
            this.LLJILLL.LLLFZ(this.LLILZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final boolean J1(int i) {
        if (i >= 0 && i <= this.LLILZ.size() - 1) {
            return true;
        }
        return false;
    }

    public final void P1(LiveMode liveMode) {
        C015X.LIZ = liveMode;
        C197400pQ c197400pQFy0 = C015V.LIZJ().fy0();
        if (c197400pQFy0 != null) {
            c197400pQFy0.LJFF(C015X.LIZ);
        }
        C197600pS.LIZ().wr0(liveMode);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(LiveModeChannel.class, liveMode);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zW(PreviewPageSelectLiveMode.class, liveMode);
        }
        DataChannelGlobal.LLILZ.JQ2(C1148440fzW.class, liveMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setWidgetCallback(X.InterfaceC1097170eep r6) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidget.setWidgetCallback(X.0eep):void");
    }

    public final void I1(LiveMode liveMode, boolean z) {
        int size = this.LLILZ.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (((C784280Upe) ListProtector.get(this.LLILZ, i)).LJ == liveMode) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = 0;
                break;
            }
        }
        if (z) {
            C784220UpY c784220UpYM1 = M1();
            if (c784220UpYM1 != null) {
                c784220UpYM1.LLILLJJLI.LL = false;
                c784220UpYM1.LL.smoothScrollToPosition(i + 1);
                return;
            }
            return;
        }
        C784220UpY c784220UpYM12 = M1();
        if (c784220UpYM12 == null) {
            return;
        }
        c784220UpYM12.LLILLJJLI.LL = true;
        c784220UpYM12.LL.smoothScrollToPosition(i + 1);
    }

    public final void O1(int i, boolean z) {
        if (J1(i)) {
            C784280Upe c784280Upe = (C784280Upe) ListProtector.get(this.LLILZ, i);
            if (z) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.zW(DeepLinkLiveModeChannel.class, c784280Upe.LJ);
                }
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.zW(LiveModeChannel.class, c784280Upe.LJ);
                }
            } else {
                P1(c784280Upe.LJ);
            }
            if (c784280Upe.LJ == LiveMode.LIVE_VOICE) {
                RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_PREVIEW_VOICE_CHAT);
            }
        }
    }

    public final void N1(int i, String str, String str2) {
        String str3;
        Boolean boolValueOf;
        AbstractC21673619ry adapter;
        int i2 = this.LLILZIL;
        if (i2 == i) {
            return;
        }
        if (i2 != i) {
            if (J1(i2)) {
                ((C784280Upe) ListProtector.get(this.LLILZ, this.LLILZIL)).LIZ = false;
            }
            if (J1(i)) {
                ((C784280Upe) ListProtector.get(this.LLILZ, i)).LIZ = true;
            }
        }
        if (this.LLILZIL != i) {
            C784220UpY c784220UpYM1 = M1();
            if (c784220UpYM1 != null) {
                int i3 = this.LLILZIL;
                AbstractC21673619ry adapter2 = c784220UpYM1.LL.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyItemChanged(i3 + 1);
                }
            }
            C784220UpY c784220UpYM12 = M1();
            if (c784220UpYM12 != null && (adapter = c784220UpYM12.LL.getAdapter()) != null) {
                adapter.notifyItemChanged(i + 1);
            }
        }
        if (this.LLILZIL != i) {
            this.LLILZIL = i;
        }
        if (J1(i)) {
            String strLIZ = C354201Zc.LIZ(((C784280Upe) ListProtector.get(this.LLILZ, i)).LJ);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_type_show");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            if (this.LLIZ) {
                str3 = "click";
            } else {
                str3 = "show";
            }
            c474500IjALIZ.LJJII(str3, "action_type");
            DetailLivePermission detailLivePermission = this.LLILZLL;
            if (detailLivePermission != null) {
                boolValueOf = Boolean.valueOf(detailLivePermission.screenPermission);
            } else {
                boolValueOf = null;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0), "screen_share_permission");
            if (!TextUtils.isEmpty(str)) {
                c474500IjALIZ.LJJII(str, "convert_from");
            }
            if (!TextUtils.isEmpty(str2)) {
                c474500IjALIZ.LJJII(str2, "template_id");
            }
            c474500IjALIZ.LJJ(strLIZ);
            c474500IjALIZ.LIZ();
            this.LLIZ = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r0 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        if (r5 != com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0033, code lost:
    
        X.C766270U4b.LIZLLL(2131844179);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (r4.LLJI != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void H1(com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidget r4, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r5, boolean r6, java.lang.String r7, java.lang.String r8, int r9) {
        /*
            r0 = r9 & 2
            r2 = 1
            if (r0 == 0) goto L6
            r6 = 1
        L6:
            r0 = r9 & 4
            r1 = 0
            if (r0 == 0) goto Lc
            r7 = r1
        Lc:
            r0 = r9 & 8
            if (r0 == 0) goto L11
            r8 = r1
        L11:
            r4.getClass()
            int[] r1 = X.C220900tD.LIZ
            int r0 = r5.ordinal()
            r1 = r1[r0]
            r3 = 0
            if (r1 == r2) goto L43
            r0 = 2
            if (r1 == r0) goto L40
            r0 = 3
            if (r1 == r0) goto L3d
            r0 = 4
            if (r1 == r0) goto L3a
            r0 = 5
            if (r1 != r0) goto L47
            boolean r0 = r4.LLIZLLLIL
        L2d:
            if (r0 != 0) goto L47
        L2f:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO
            if (r5 != r0) goto L39
            r0 = 2131844179(0x7f115c53, float:1.9321743E38)
            X.C766270U4b.LIZLLL(r0)
        L39:
            return
        L3a:
            boolean r0 = r4.LLJILJIL
            goto L2d
        L3d:
            boolean r0 = r4.LLJIJIL
            goto L2d
        L40:
            boolean r0 = r4.LLJ
            goto L2d
        L43:
            boolean r0 = r4.LLJI
            if (r0 == 0) goto L2f
        L47:
            java.util.ArrayList<X.0Upe> r0 = r4.LLILZ
            int r1 = r0.size()
            r2 = 0
        L4e:
            if (r2 >= r1) goto L39
            java.util.ArrayList<X.0Upe> r0 = r4.LLILZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            X.0Upe r0 = (X.C784280Upe) r0
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r0.LJ
            if (r0 != r5) goto L74
            X.0UpY r1 = r4.M1()
            if (r1 == 0) goto L6d
            X.0UpZ r0 = r1.LLILLJJLI
            r0.LL = r3
            X.0Upb r1 = r1.LL
            int r0 = r2 + 1
            r1.smoothScrollToPosition(r0)
        L6d:
            r4.N1(r2, r7, r8)
            r4.O1(r2, r6)
            return
        L74:
            int r2 = r2 + 1
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidget.H1(com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidget, com.bytedance.android.livesdkapi.depend.model.live.LiveMode, boolean, java.lang.String, java.lang.String, int):void");
    }
}
