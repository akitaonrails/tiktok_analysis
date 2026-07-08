package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0IJT;
import X.C0UHK;
import X.C0UJY;
import X.C0ULK;
import X.C0UM0;
import X.C1113800f5e;
import X.C1161920gLG;
import X.C474500IjA;
import X.C500260Jjc;
import X.C760180Trs;
import X.C767640U9i;
import X.C767720U9q;
import X.C770730ULf;
import X.C781270Ukn;
import X.C930950aKj;
import X.C930960aKk;
import X.C931040aKs;
import X.EnumC1120860fH2;
import X.InterfaceC1097170eep;
import X.InterfaceC769090UEx;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.ShowStickerPanelEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.PreviewRevisionUpdateBottomIconEvent;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.broadcast.LivePreviewLiveStreamInit;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.broadcast.schema.PreviewSchemaOpenPanelParamsEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.HideEffectEntrySetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewStickerWidget extends PreviewToolBaseWidget {
    public static final /* synthetic */ int LLJIJIL = 0;
    public PreviewStickerHelper LLILZLL;
    public FrameLayout LLIZ;
    public C0ULK LLIZLLLIL;
    public final int LLJ = 2131842712;
    public final int LLJI = R.drawable.eqh;

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    public final void W1() {
        Fragment fragment;
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null) {
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        Context context = this.context;
        View view = getView();
        ImageView imageView = view != null ? (ImageView) view.findViewById(R.id.widget_icon) : null;
        C0UJY c0ujyLIZ = C770730ULf.LIZ(this.dataChannel);
        if (c0ujyLIZ == null) {
            return;
        }
        this.LLILZLL = new PreviewStickerHelper(fragment, dataChannel, context, imageView, c0ujyLIZ, this, this.LLIZLLLIL);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final String y1() {
        return "effect";
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLJI);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C760180Trs.LJIIJJI(this.dataChannel, "effect");
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (HideEffectEntrySetting.INSTANCE.shouldHide()) {
            return;
        }
        super.show();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        if (!C0UHK.LIZ()) {
            W1();
        }
        if (HideEffectEntrySetting.INSTANCE.shouldHide()) {
            hide();
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, PreviewSchemaOpenPanelParamsEvent.class, new AwS591S0100000_12(this, 328));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, PreviewRevisionUpdateBottomIconEvent.class, new AwS591S0100000_12(this, 329));
            dataChannel.BQ2(this, ShowStickerPanelEvent.class, new AwS591S0100000_12(this, 330));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, LivePreviewLiveStreamInit.class, new AwS591S0100000_12(this, 331));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.LLILZLL = null;
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLJ;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C1113800f5e.LIZJ(EnumC1120860fH2.GUIDE_ENHANCE);
        X1(null, false);
    }

    public final void X1(Map map, boolean z) {
        int i;
        C767640U9i c767640U9iP71;
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveStickerLogManager().LJI();
        if (z) {
            PreviewStickerHelper previewStickerHelper = this.LLILZLL;
            if (previewStickerHelper != null) {
                previewStickerHelper.LIZLLL(map);
            }
        } else {
            PreviewStickerHelper previewStickerHelper2 = this.LLILZLL;
            if (previewStickerHelper2 != null && !C0UM0.LIZ) {
                InterfaceC769090UEx insertStickerManager = C781270Ukn.LJI().getInsertStickerManager();
                Boolean boolValueOf = null;
                if (insertStickerManager != null && (c767640U9iP71 = insertStickerManager.p71("")) != null && c767640U9iP71.LIZ != null) {
                    previewStickerHelper2.LIZ();
                }
                previewStickerHelper2.LIZLLL(null);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("pm_live_sticker_click");
                c474500IjALIZ.LJIJJLI(previewStickerHelper2.LL);
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C931040aKs.class), "enter_from");
                c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930950aKj.class), "banner_id");
                c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930960aKk.class), "banner_from");
                int i2 = 1;
                if (previewStickerHelper2.LLIZ != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                c474500IjALIZ.LJJII(Integer.valueOf(i), "is_special_icon");
                if (previewStickerHelper2.LLIZ == null || !previewStickerHelper2.LLJ) {
                    i2 = 0;
                }
                c474500IjALIZ.LJJII(Integer.valueOf(i2), "is_animation");
                c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), Scene.SCENE_SERVICE);
                C770730ULf.LIZLLL(c474500IjALIZ);
                LiveEffect liveEffect = previewStickerHelper2.LLIZ;
                if (liveEffect != null) {
                    C767720U9q logParams = liveEffect.getLogParams();
                    if (logParams != null) {
                        boolValueOf = Boolean.valueOf(logParams.LIZLLL);
                    }
                    c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0), "is_rec_pin");
                }
                c474500IjALIZ.LIZ();
            }
        }
        ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).w60(0L, this.dataChannel, 7, false, null);
    }
}
