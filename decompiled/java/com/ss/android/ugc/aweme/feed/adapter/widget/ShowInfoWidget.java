package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C1ACA;
import X.C20441214yg;
import X.C2252261DDk;
import X.C285880BIk;
import X.C341940Daq;
import X.C427870Gq9;
import X.C438710HIf;
import X.C786410Ut5;
import X.C999380c76;
import X.EnumC494740Jai;
import X.EnumC999300c6y;
import Y.ACListenerS151S0100000_16;
import Y.ARunnableS85S0200000_16;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveUser;
import com.ss.android.ugc.aweme.feed.model.live.ShowInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class ShowInfoWidget extends LiveWatchPreviewWidget {
    public static final EnumC999300c6y LLJIJIL = EnumC999300c6y.PROGRAMMED_LIVE_INFO;
    public final C01GW LLJ;
    public final BPEAHandler LLJI;

    public ShowInfoWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 272), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
        this.LLJI = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dgl;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        C786410Ut5.LJLLLLLL(8, this.contentView);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        C2252261DDk c2252261DDk;
        if (!((Boolean) C285880BIk.LIZ.getValue()).booleanValue() || (c2252261DDk = (C2252261DDk) findViewById(R.id.s8d)) == null) {
            return;
        }
        c2252261DDk.LIZIZ();
        C20441214yg.LJIIIZ("live_overdraw_opt", "onViewHolderUnSelected and stopMarquee");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        C1ACA c1acaZ1;
        Aweme aweme;
        C2252261DDk c2252261DDk;
        if (C999380c76.LIZ(z1()) && (c1acaZ1 = z1()) != null && (aweme = c1acaZ1.LIZIZ) != null && (c2252261DDk = (C2252261DDk) findViewById(R.id.s8d)) != null) {
            c2252261DDk.LIZIZ();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c2252261DDk, null);
            c2252261DDk.removeAllViews();
            C786410Ut5.LJJZZIII(this.LLJI, new ARunnableS85S0200000_16(this, aweme, 30));
        }
    }

    public final void M1(ShowInfo showInfo) {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.s8d);
        List<? extends LiveUser> list = showInfo.anchors;
        int i = 0;
        if (list == null || list.isEmpty()) {
            C786410Ut5.LJLLLLLL(8, this.contentView);
        }
        List<? extends LiveUser> list2 = showInfo.anchors;
        int i2 = 6;
        AttributeSet attributeSet = null;
        if (list2 != null) {
            for (LiveUser liveUser : list2) {
                C427870Gq9 c427870Gq9 = new C427870Gq9(viewGroup.getContext());
                TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), attributeSet, i2, i);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C341940Daq.LIZ(16.0d), C341940Daq.LIZ(16.0d));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.setMarginEnd(C341940Daq.LIZ(4.0d));
                layoutParams2.setMarginEnd(C341940Daq.LIZ(4.0d));
                tuxTextView.setText(liveUser.nickname);
                tuxTextView.setTextColorRes(R.attr.ee);
                viewGroup.addView(c427870Gq9, layoutParams);
                viewGroup.addView(tuxTextView, layoutParams2);
                C786410Ut5.P8(c427870Gq9, new ACListenerS151S0100000_16(this, 68));
                C786410Ut5.h9(tuxTextView, new ACListenerS151S0100000_16(this, 69));
                UrlModel urlModel = liveUser.avatarThumb;
                if (urlModel != null) {
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                    c1331670kl3LJIIIIZZ.LJJ(c427870Gq9);
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                }
                i = 0;
                i2 = 6;
            }
        }
        if (!TextUtils.isEmpty(showInfo.showIntroduction)) {
            int i3 = 0;
            TuxTextView tuxTextView2 = new TuxTextView(viewGroup.getContext(), attributeSet, i2, i3);
            tuxTextView2.setText("-");
            tuxTextView2.setTextColorRes(R.attr.ee);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
            layoutParams3.setMarginEnd(C341940Daq.LIZ(4.0d));
            viewGroup.addView(tuxTextView2, layoutParams3);
            TuxTextView tuxTextView3 = new TuxTextView(viewGroup.getContext(), attributeSet, i2, i3);
            tuxTextView3.setText(showInfo.showIntroduction);
            tuxTextView3.setTextColorRes(R.attr.ee);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
            layoutParams4.setMarginEnd(C341940Daq.LIZ(4.0d));
            viewGroup.addView(tuxTextView3, layoutParams4);
            C786410Ut5.h9(tuxTextView3, new ACListenerS151S0100000_16(this, 70));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
    }
}
