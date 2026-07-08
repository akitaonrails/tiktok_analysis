package com.bytedance.android.livesdk.broadcast.preview.widget.revision;

import X.C0UJT;
import X.C0ULO;
import X.C0ULQ;
import X.C1161920gLG;
import X.C16F5;
import X.C2187701Ajg;
import X.C415720GRu;
import X.C500260Jjc;
import Y.ARunnableS107S0100000_7;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.api.PreviewLiveTabCapsuleColorThemeChangeEvent;
import com.bytedance.android.live.broadcast.model.WalletRewardsContainerInfo;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.PreviewMoreClickEvent;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewDecouplingCenterWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.data.LiveGoLivePageContainer;
import webcast.data.TopRightContainerComponent;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewDecouplingCenterWidget extends PreviewWidget {
    public TuxIconView LLILZ;
    public C16F5 LLILZIL;
    public C415720GRu LLILZLL;
    public String LLIZ;
    public TopRightContainerComponent LLIZLLLIL;
    public Map<Integer, LiveGoLivePageContainer> LLJ;
    public WalletRewardsContainerInfo LLJI;
    public int LLJIJIL;
    public ARunnableS107S0100000_7 LLJILJIL;
    public final C0ULQ LLJILJILJ = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0ULQ
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            C16F5 c16f5 = this.LL.LLILZIL;
            if (c16f5 == null) {
                return true;
            }
            float fMeasureText = c16f5.getPaint().measureText(c16f5.getText().toString());
            int width = (c16f5.getWidth() - c16f5.getCompoundPaddingLeft()) - c16f5.getCompoundPaddingRight();
            ViewTreeObserver viewTreeObserver = c16f5.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
                C2187701Ajg.LIZIZ(viewTreeObserver, this, ViewTreeObserver.OnPreDrawListener.class);
            }
            if (fMeasureText > width) {
                PreviewDecouplingCenterWidget previewDecouplingCenterWidget = this.LL;
                C16F5 c16f52 = previewDecouplingCenterWidget.LLILZIL;
                if (c16f52 != null) {
                    c16f52.setSelected(true);
                }
                C16F5 c16f53 = previewDecouplingCenterWidget.LLILZIL;
                if (c16f53 != null) {
                    c16f53.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                }
                C16F5 c16f54 = previewDecouplingCenterWidget.LLILZIL;
                if (c16f54 != null) {
                    c16f54.setMarqueeRepeatLimit(1);
                }
                C16F5 c16f55 = previewDecouplingCenterWidget.LLILZIL;
                if (c16f55 != null) {
                    c16f55.setHorizontalFadingEdgeEnabled(true);
                }
                C20337914i1<Integer> c20337914i1 = C0UKZ.LLILZIL;
                c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
            }
            return true;
        }
    };

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        ViewTreeObserver viewTreeObserver;
        this.LLILLL = false;
        C16F5 c16f5 = this.LLILZIL;
        if (c16f5 != null && (viewTreeObserver = c16f5.getViewTreeObserver()) != null) {
            C0ULQ c0ulq = this.LLJILJILJ;
            viewTreeObserver.removeOnPreDrawListener(c0ulq);
            C2187701Ajg.LIZIZ(viewTreeObserver, c0ulq, ViewTreeObserver.OnPreDrawListener.class);
        }
        View view = getView();
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLJILJIL);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i13;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0139 A[Catch: Exception -> 0x0163, TryCatch #1 {Exception -> 0x0163, blocks: (B:82:0x012f, B:84:0x0139, B:85:0x013d, B:87:0x0143, B:89:0x0147, B:90:0x014f, B:97:0x015b, B:98:0x015f), top: B:160:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G1() {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewDecouplingCenterWidget.G1():void");
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        View view;
        LiveMode liveMode;
        super.C1();
        G1();
        if (!AnchorPreviewUniformStyleABSetting.INSTANCE.enable() || (view = getView()) == null) {
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        int i = (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) ? -1 : C0UJT.LIZ[liveMode.ordinal()];
        if (i == 1) {
            C0ULO.LIZ(view, 1, "PreviewDecouplingCenterWidget", false);
        } else if (i != 2) {
            C0ULO.LIZ(view, 0, "PreviewDecouplingCenterWidget", false);
        } else {
            C0ULO.LIZ(view, this.LLJIJIL, "PreviewDecouplingCenterWidget", false);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.LLILZ = (TuxIconView) findViewById(R.id.z0m);
        this.LLILZIL = (C16F5) findViewById(R.id.widget_text);
        this.LLILZLL = (C415720GRu) findViewById(R.id.uir);
        View view = getView();
        if (view != null) {
            C500260Jjc.LJIILLIIL(view);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 388));
            dataChannel.BQ2(this, PreviewMoreClickEvent.class, new AwS591S0100000_12(this, 389));
            dataChannel.EQ2(this, PreviewLiveTabCapsuleColorThemeChangeEvent.class, new AwS591S0100000_12(this, 390));
        }
    }

    public final void H1(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.context, str);
    }
}
