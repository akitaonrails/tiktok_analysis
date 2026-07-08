package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0IJT;
import X.C0UX6;
import X.C1161920gLG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C354201Zc;
import X.C474500IjA;
import X.C500260Jjc;
import X.C753430Tgz;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public class PreviewToolGuessWidget extends PreviewToolBaseWidget {
    public final int LLILZLL;
    public final int LLIZ;

    public PreviewToolGuessWidget() {
        this(0);
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLIZ);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void C1() {
        super.C1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttach, visible: ");
        View view = getView();
        sbLIZ.append(view != null ? Boolean.valueOf(C500260Jjc.LJJJJIZL(view)) : null);
        C20441214yg.LIZIZ("PreviewToolGuessWidget", C2188811AlT.LIZIZ(sbLIZ));
        W1("show");
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        C20441214yg.LIZIZ("PreviewToolGuessWidget", "onWidgetCreated");
        C0UX6 c0ux6 = C0UX6.RED_DOT_LIVE_BROADCAST_PREVIEW_GUESSING;
        View view = getView();
        RedDotExtensionKt.LJI(view != null ? view.findViewById(R.id.widget_red_dot) : null, this, this, c0ux6, AFwS237S0000000_7.get$arr$(8));
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLILZLL;
    }

    public PreviewToolGuessWidget(int i) {
        this.LLILZLL = 2131852798;
        this.LLIZ = R.drawable.eka;
    }

    public final void W1(String str) {
        Long lValueOf;
        String strLIZ;
        boolean zLJIILLIIL = RedDotExtensionKt.LJIILLIIL(C0UX6.RED_DOT_LIVE_BROADCAST_PREVIEW_GUESSING);
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.dataChannel);
        if (roomLJJLIIIIJ != null) {
            lValueOf = Long.valueOf(roomLJJLIIIIJ.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        LiveMode liveMode = (LiveMode) this.dataChannel.gg0(LiveModeChannel.class);
        if (liveMode != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        } else {
            strLIZ = C354201Zc.LIZ(LiveMode.SCREEN_RECORD);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_guessing_entrance");
        c474500IjALIZ.LJJIJIIJI(0L);
        c474500IjALIZ.LJI(lValueOf);
        c474500IjALIZ.LJJ(strLIZ);
        c474500IjALIZ.LJ(str);
        c474500IjALIZ.LJJII("live_take_page", "entrance");
        c474500IjALIZ.LJJII(Integer.valueOf(zLJIILLIIL ? 1 : 0), "has_red_dot");
        c474500IjALIZ.LJJII(0, "round_id");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).lU0();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClick, visible: ");
        sbLIZ.append(C500260Jjc.LJJJJIZL(view));
        C20441214yg.LIZIZ("PreviewToolGuessWidget", C2188811AlT.LIZIZ(sbLIZ));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = "1";
        linkedHashMap.put("is_preview", "1");
        linkedHashMap.put("open_page_time", String.valueOf(System.currentTimeMillis()));
        if (!SecondPageCodeCacheABSetting.INSTANCE.isMatch()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("enable_code_cache", str);
        C753430Tgz.LJIIL("live_take_page", linkedHashMap, this.dataChannel, view.getContext());
        W1("click");
        RedDotExtensionKt.LIZ(C0UX6.RED_DOT_LIVE_BROADCAST_PREVIEW_GUESSING);
    }
}
