package com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget;

import X.C098200Yq;
import X.C15438062q;
import X.C189200o6;
import X.C21652019oU;
import X.C786410Ut5;
import Y.AObjectS526S0100000_7;
import Y.ARunnableS107S0100000_7;
import android.graphics.Color;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS586S0100000_7;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.room.GoLiveCardPicture;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePromote3PhotoWidget extends LivePromoteParentWidget {
    public final long LLJJJJ;
    public final BPEAHandler LLJJJJJIL;
    public C21652019oU LLJJJJLIIL;
    public TuxTextView LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public final ARunnableS107S0100000_7 LLJL;

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final int E1() {
        return R.layout.hjs;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJJJJIL.removeCallbacks(this.LLJL);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget, X.InterfaceC464250IIl
    public final void t0() {
        super.t0();
        C786410Ut5.LJLIIL(this.LLJJJJ, this.LLJJJJJIL, this.LLJL);
    }

    public LivePromote3PhotoWidget(EncourageGoLiveCard encourageGoLiveCard) {
        super(encourageGoLiveCard);
        this.LLJJJJ = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.LLJJJJJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJL = new ARunnableS107S0100000_7(this, 39);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final void O1(View view) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(this.LLILZLL.pictures.get(0).bgColor));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
        this.LLJJLIIIJLLLLLLLZ = view;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.widget.Widget
    public final void setContentView(View view) {
        C21652019oU c21652019oU;
        ViewParent parent;
        super.setContentView(view);
        TuxTextView tuxTextView = null;
        if (view != null) {
            c21652019oU = (C21652019oU) view.findViewById(R.id.rgj);
        } else {
            c21652019oU = null;
        }
        this.LLJJJJLIIL = c21652019oU;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.tv_title);
        }
        this.LLJJL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setText(((GoLiveCardPicture) ListProtector.get(this.LLILZLL.pictures, 0)).text);
        }
        C21652019oU c21652019oU2 = this.LLJJJJLIIL;
        if (c21652019oU2 != null) {
            c21652019oU2.setImgLoadFailedCallback(new AwS586S0100000_7(this, 67));
        }
        C21652019oU c21652019oU3 = this.LLJJJJLIIL;
        if (c21652019oU3 != null) {
            List<GoLiveCardPicture> list = this.LLILZLL.pictures;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<GoLiveCardPicture> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().url);
            }
            c21652019oU3.setPhotos(arrayList);
        }
        C21652019oU c21652019oU4 = this.LLJJJJLIIL;
        if (c21652019oU4 != null && (parent = c21652019oU4.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        C21652019oU c21652019oU5 = this.LLJJJJLIIL;
        if (c21652019oU5 != null) {
            c21652019oU5.setShowIndexChangeListener(new AObjectS526S0100000_7(this, 0));
        }
    }
}
