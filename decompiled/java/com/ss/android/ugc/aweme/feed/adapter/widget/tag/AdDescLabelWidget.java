package com.ss.android.ugc.aweme.feed.adapter.widget.tag;

import X.C01GW;
import X.C0SD1;
import X.C1017070cZd;
import X.C1ACA;
import X.C21279718Pj;
import X.C452501pT;
import X.C488730JEp;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdDescLabelWidget extends LiveWatchPreviewWidget {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 281));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 280));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.des;
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0176  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1() {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.tag.AdDescLabelWidget.J1():void");
    }

    public final C0SD1 M1() {
        return (C0SD1) this.LLJI.getValue();
    }

    public final C21279718Pj N1() {
        return (C21279718Pj) this.LLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        Aweme aweme;
        C1ACA c1acaZ1 = z1();
        int showTagNum = 0;
        if (c1acaZ1 != null && (aweme = c1acaZ1.LIZIZ) != null && C1017070cZd.LJLIIIL(aweme)) {
            if (M1().getVisibility() == 0) {
                showTagNum = M1().getShowTagNum();
            }
            C488730JEp c488730JEp = C488730JEp.LIZ;
            C1ACA c1acaZ12 = z1();
            c488730JEp.getClass();
            C488730JEp.LIZ(c1acaZ12, showTagNum);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
    }
}
