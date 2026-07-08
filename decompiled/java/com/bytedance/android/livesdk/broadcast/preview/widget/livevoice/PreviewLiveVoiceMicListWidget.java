package com.bytedance.android.livesdk.broadcast.preview.widget.livevoice;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C20441214yg;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C452501pT;
import X.C473470IhV;
import X.C500260Jjc;
import X.C786410Ut5;
import X.ViewOnTouchListenerC473480IhW;
import X.ViewTreeObserverOnGlobalLayoutListenerC521800KdG;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PreviewLiveVoiceMicListWidget extends PreviewWidget {
    public RecyclerView LLILZ;
    public LiveMode LLIZLLLIL;
    public final PreviewLiveVoiceMicListWidget$gridLayoutManager$1 LLJIJIL;
    public final ViewOnTouchListenerC473480IhW LLJILJIL;
    public Pair<Integer, Integer> LLILZIL = new Pair<>(0, 0);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 33));
    public final List<C473470IhV> LLIZ = new ArrayList();
    public Pair<Integer, Integer> LLJ = new Pair<>(0, 0);
    public final ViewTreeObserverOnGlobalLayoutListenerC521800KdG LLJI = new ViewTreeObserverOnGlobalLayoutListenerC521800KdG(this, 0);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i24;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final List<C473470IhV> G1() {
        if (((ArrayList) this.LLIZ).size() > 0) {
            return this.LLIZ;
        }
        ((ArrayList) this.LLIZ).add(new C473470IhV(UserService.getInstance().user().getCurrentUser().getAvatarThumb()));
        int i = 0;
        do {
            ((ArrayList) this.LLIZ).add(new C473470IhV(null));
            i++;
        } while (i < 8);
        return this.LLIZ;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.livesdk.broadcast.preview.widget.livevoice.PreviewLiveVoiceMicListWidget$gridLayoutManager$1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0IhW] */
    public PreviewLiveVoiceMicListWidget() {
        final Context context = this.context;
        this.LLJIJIL = new GridLayoutManager(context) { // from class: com.bytedance.android.livesdk.broadcast.preview.widget.livevoice.PreviewLiveVoiceMicListWidget$gridLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                return false;
            }
        };
        this.LLJILJIL = new View.OnTouchListener() { // from class: X.0IhW
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        };
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        ViewTreeObserver viewTreeObserver;
        super.E1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, LiveModeChannel.class, new AwS586S0100000_7(this, 49));
        }
        RecyclerView recyclerView = (RecyclerView) getView();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.LLJIJIL);
        } else {
            recyclerView = null;
        }
        this.LLILZ = recyclerView;
        if (recyclerView != null) {
            recyclerView.setOnTouchListener(this.LLJILJIL);
        }
        View view = getView();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC521800KdG viewTreeObserverOnGlobalLayoutListenerC521800KdG = this.LLJI;
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521800KdG);
        C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521800KdG, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDetachWidget() {
        ViewTreeObserver viewTreeObserver;
        View view = getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC521800KdG viewTreeObserverOnGlobalLayoutListenerC521800KdG = this.LLJI;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521800KdG);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521800KdG, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        super.onDetachWidget();
    }

    public final void H1(LiveMode liveMode) {
        boolean z;
        RecyclerView recyclerView;
        Integer first;
        if (liveMode == null) {
            return;
        }
        RecyclerView recyclerView2 = this.LLILZ;
        if (liveMode == LiveMode.LIVE_VOICE) {
            z = true;
        } else {
            z = false;
        }
        C500260Jjc.LJLJLJ(recyclerView2, z);
        RecyclerView recyclerView3 = this.LLILZ;
        if (recyclerView3 != null && C500260Jjc.LJJJJIZL(recyclerView3) && (recyclerView = this.LLILZ) != null && (first = this.LLJ.getFirst()) != null) {
            int iIntValue = first.intValue();
            Integer second = this.LLJ.getSecond();
            if (second != null) {
                int iIntValue2 = second.intValue();
                if (iIntValue != 0 && iIntValue2 != 0) {
                    this.LLILZIL = new Pair<>(Integer.valueOf(iIntValue / 3), Integer.valueOf(iIntValue2 / 3));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateList recyclerViewSize :");
                    sbLIZ.append(this.LLJ);
                    sbLIZ.append(" size:");
                    sbLIZ.append(this.LLILZIL);
                    C20441214yg.LIZIZ("voice_chat", C2188811AlT.LIZIZ(sbLIZ));
                    ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                    layoutParams.width = iIntValue;
                    layoutParams.height = iIntValue2;
                    C786410Ut5.p6(recyclerView, layoutParams);
                    recyclerView.setAdapter((AbstractC21673619ry) this.LLILZLL.getValue());
                    return;
                }
                C20441214yg.LIZIZ("voice_chat", "updateList return size don't measure yet");
            }
        }
    }
}
