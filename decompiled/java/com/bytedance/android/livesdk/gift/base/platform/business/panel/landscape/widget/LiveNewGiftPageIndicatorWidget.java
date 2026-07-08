package com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget;

import X.C1097050eed;
import X.C1128630fTZ;
import Y.AObserverS221S0100000_17;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveNewGiftPageIndicatorWidget extends LiveWidget {
    public LinearLayout LL;
    public ImageView LLILLJJLI;
    public C1128630fTZ LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final ArrayList<ImageView> LLILZLL = new ArrayList<>();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0n;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LL = (LinearLayout) findViewById(R.id.pyj);
        C1128630fTZ c1128630fTZ = this.LLILLL;
        if (c1128630fTZ != null) {
            c1128630fTZ.LJFF.observe(this, new AObserverS221S0100000_17(this, 57));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        MutableLiveData<C1097050eed> mutableLiveData;
        super.onDestroy();
        C1128630fTZ c1128630fTZ = this.LLILLL;
        if (c1128630fTZ == null || (mutableLiveData = c1128630fTZ.LJFF) == null) {
            return;
        }
        mutableLiveData.removeObservers(this);
    }
}
