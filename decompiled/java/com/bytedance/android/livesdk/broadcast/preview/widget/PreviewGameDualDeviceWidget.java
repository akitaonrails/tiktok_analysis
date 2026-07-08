package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C01GW;
import X.C0IJT;
import X.C0TF0;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C20441214yg;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C468960IaE;
import X.C474500IjA;
import X.C497740JfY;
import X.C742700TBk;
import X.C754670Tiz;
import X.C760180Trs;
import X.C766270U4b;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC754690Tj1;
import X.InterfaceC1097170eep;
import X.InterfaceC742710TBl;
import X.InterfaceC772390URp;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.GameLandScapeOrientationChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGameDualDeviceWidget;
import com.bytedance.android.livesdk.comp.api.game.GameDualDeviceDecline;
import com.bytedance.android.livesdk.comp.api.game.service.IGameDualDeviceService;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.GameRoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewGameHashTagSelectedFromDualDeviceEvent;
import com.bytedance.android.livesdk.dataChannel.PreviewOpenHashtagAnchorDialogEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLiveDualDevicePadEnableSettingSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GamePreviewDualDeviceWidgetSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDualDeviceQRCodeCacheSetting;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.api.game.CreateInfoResponse;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewGameDualDeviceWidget extends PreviewToolBaseWidget {
    public C0TF0 LLILZLL;
    public ImageView LLJILLL;
    public boolean LLJJ;
    public final List<String> LLIZ = new ArrayList();
    public final int LLIZLLLIL = 2131843021;
    public final String LLJ = "PreviewGameDualDeviceWidget";
    public long LLJI = -1;
    public boolean LLJIJIL = W1();
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(62));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(61));
    public final AwS591S0100000_12 LLJJI = new AwS591S0100000_12(this, 269);

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return 0;
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public static boolean W1() {
        CreateInfoResponse.ResponseData responseDataI92;
        IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
        return (iGameService == null || (responseDataI92 = iGameService.I92()) == null || !responseDataI92.haveDualDeviceCamera) && !InterfaceC772390URp.F.LIZIZ().booleanValue() && (!GameLiveDualDevicePadEnableSettingSetting.INSTANCE.isPadEnable() || C497740JfY.LJIIZILJ() < ((int) C497740JfY.LIZIZ(600.0f)) || C497740JfY.LJIILLIIL() < ((int) C497740JfY.LIZIZ(683.0f)));
    }

    public final void Y1() {
        Fragment fragment;
        FragmentManager childFragmentManager;
        Boolean bool;
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null || (childFragmentManager = fragment.getChildFragmentManager()) == null) {
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        boolean zBooleanValue = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(GameLandScapeOrientationChannel.class)) == null) ? false : bool.booleanValue();
        IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
        if (iGameService != null) {
            iGameService.DI1(childFragmentManager, zBooleanValue, this.context);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_setup_click");
        c474500IjALIZ.LJJII(this.LLJILJILJ.getValue(), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(((Number) this.LLJILJIL.getValue()).longValue()), "room_id");
        c474500IjALIZ.LJJII(1, "is_rtc");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void C1() {
        InterfaceC1097170eep interfaceC1097170eep;
        Fragment fragment;
        IGameService iGameService;
        super.C1();
        if (!LiveDualDeviceQRCodeCacheSetting.INSTANCE.isExperimentGroup() || (interfaceC1097170eep = this.widgetCallback) == null || (fragment = interfaceC1097170eep.getFragment()) == null || (iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class)) == null) {
            return;
        }
        iGameService.Iw0(fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0TEz] */
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        DataChannel dataChannel;
        super.E1();
        View view = getView();
        this.LLJILLL = view != null ? (ImageView) view.findViewById(R.id.widget_icon) : null;
        if (this.LLJIJIL) {
            X1(false);
            View view2 = getView();
            if (view2 != null) {
                C786410Ut5.T4(view2, 0.34f);
            }
            if (GamePreviewDualDeviceWidgetSetting.INSTANCE.enable() && (dataChannel = this.dataChannel) != null) {
                dataChannel.BQ2(this, GameRoomCreateInfoChannel.class, new AwS591S0100000_12(this, 267));
            }
        } else {
            IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
            if (iGameService != null) {
                iGameService.yt1(this, this.dataChannel, this.LLJJI);
            }
            InterfaceC772390URp.F.LJFF(Boolean.TRUE);
        }
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment()) {
            IGameDualDeviceService iGameDualDeviceService = (IGameDualDeviceService) C1161920gLG.LIZJ(IGameDualDeviceService.class);
            C742700TBk c742700TBkMU0 = iGameDualDeviceService != null ? iGameDualDeviceService.MU0() : 0;
            this.LLILZLL = c742700TBkMU0;
            if (c742700TBkMU0 != 0) {
                c742700TBkMU0.LIZLLL(new InterfaceC742710TBl() { // from class: X.0TEz
                    @Override // X.InterfaceC742710TBl
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC742710TBl
                    public final void LIZ(String str, HashMap<String, Object> map) {
                        Fragment fragment;
                        FragmentManager childFragmentManager;
                        IGameDualDeviceService iGameDualDeviceService2;
                        PreviewGameDualDeviceWidget previewGameDualDeviceWidget = this.LIZ;
                        if (!previewGameDualDeviceWidget.LLILLL || ((ArrayList) previewGameDualDeviceWidget.LLIZ).contains(str)) {
                            return;
                        }
                        ((ArrayList) this.LIZ.LLIZ).add(str);
                        InterfaceC1097170eep interfaceC1097170eep = this.LIZ.widgetCallback;
                        if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null && (childFragmentManager = fragment.getChildFragmentManager()) != null && (iGameDualDeviceService2 = (IGameDualDeviceService) C1161920gLG.LIZJ(IGameDualDeviceService.class)) != null) {
                            iGameDualDeviceService2.pG2(childFragmentManager, map);
                        }
                    }
                });
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.BQ2(this, GameDualDeviceDecline.class, new AwS591S0100000_12(this, 268));
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C0TF0 c0tf0 = this.LLILZLL;
        if (c0tf0 != null) {
            c0tf0.release();
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public int O1() {
        return this.LLIZLLLIL;
    }

    public final void X1(boolean z) {
        String str;
        int i;
        TuxIconView tuxIconView;
        int i2;
        if (C760180Trs.LJI()) {
            if (z) {
                i = R.raw.icon_camera_tick;
            } else {
                i = R.raw.icon_camera_add;
            }
            ImageView imageView = this.LLJILLL;
            Integer numLIZJ = null;
            if ((imageView instanceof TuxIconView) && (tuxIconView = (TuxIconView) imageView) != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = i;
                Context context = this.context;
                if (context != null) {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.exp, context);
                }
                c419910GdJ.LIZLLL = numLIZJ;
                Integer num = 0;
                if (num != null && num.intValue() == 4) {
                    i2 = 26;
                } else {
                    i2 = 28;
                }
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                tuxIconView.setTuxIcon(c419910GdJ);
                return;
            }
            return;
        }
        ImageView imageView2 = this.LLJILLL;
        if (imageView2 == null) {
            return;
        }
        if (z) {
            str = "ttlive_game_dual_device_camera_icon_connected.png";
        } else {
            str = "ttlive_game_dual_device_camera_icon.png";
        }
        C1143680frq.LJ(imageView2, "tiktok_live_game_demand_1", str, ImageView.ScaleType.FIT_XY);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        LiveMode liveMode;
        GameTag gameTag;
        String str;
        Long l;
        long jLongValue;
        GameTag gameTag2;
        Long l2;
        if (this.LLJIJIL) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_new_user_click");
            c474500IjALIZ.LJJII(this.LLJILJILJ.getValue(), "anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(((Number) this.LLJILJIL.getValue()).longValue()), "room_id");
            c474500IjALIZ.LIZ();
            C766270U4b.LJFF(2131843020, this.context);
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        Hashtag hashtag = null;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        EnumC754690Tj1.Companion.getClass();
        EnumC754690Tj1 enumC754690Tj1LIZ = C754670Tiz.LIZ(liveMode);
        if (enumC754690Tj1LIZ != null) {
            hashtag = enumC754690Tj1LIZ.getHashtag();
        }
        if (C468960IaE.LIZ(hashtag) && enumC754690Tj1LIZ != null && (gameTag = enumC754690Tj1LIZ.getGameTag()) != null && (str = gameTag.showName) != null && str.length() != 0 && (((l = gameTag.id) == null || l.longValue() != 0) && gameTag.id != null)) {
            Y1();
            if (enumC754690Tj1LIZ != null && (gameTag2 = enumC754690Tj1LIZ.getGameTag()) != null && (l2 = gameTag2.id) != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = -1;
            }
            this.LLJI = jLongValue;
        } else {
            EnumC754690Tj1 enumC754690Tj1LIZ2 = C754670Tiz.LIZ(liveMode);
            if (enumC754690Tj1LIZ2 == null) {
                String str2 = this.LLJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("openHashtagAnchorDialog previewLiveMode : ");
                sbLIZ.append(liveMode);
                sbLIZ.append(" return as tag is null");
                C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
            } else {
                String str3 = this.LLJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("openHashtagAnchorDialog() hashTagGameTag = ");
                sbLIZ2.append(enumC754690Tj1LIZ2);
                C20441214yg.LJIIIZ(str3, C2188811AlT.LIZIZ(sbLIZ2));
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.FQ2(PreviewOpenHashtagAnchorDialogEvent.class);
                }
            }
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, PreviewGameHashTagSelectedFromDualDeviceEvent.class, new AwS591S0100000_12(this, 266));
        }
    }
}
