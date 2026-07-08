package com.ss.android.ugc.aweme.commercialize.widget;

import X.C0RD4;
import X.C988080bos;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes17.dex */
public abstract class AbsAdFeedWidget extends Widget implements Observer<C0RD4> {
    public Aweme LLIZLLLIL;
    public Fragment LLJ;
    public String LLJI;

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void LJIILL() {
        DataCenter dataCenter = this.LLILZ;
        if (dataCenter != null) {
            dataCenter.yQ2("ad_feed_video_params", this, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        DataCenter dataCenter = this.LLILZ;
        if (dataCenter != null) {
            dataCenter.AQ2(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onPause() {
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onResume() {
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIILIIL(View view) {
        C988080bos c988080bos;
        DataCenter dataCenter = this.LLILZ;
        if (dataCenter != null && (c988080bos = (C988080bos) dataCenter.get("ad_feed_video_params")) != null) {
            this.LLIZLLLIL = c988080bos.LIZ;
            this.LLJ = c988080bos.LIZIZ;
            this.LLJI = c988080bos.LIZJ;
        }
    }

    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: LJIILLIIL, reason: merged with bridge method [inline-methods] */
    public void onChanged(C0RD4 c0rd4) {
        String str;
        Object obj = null;
        if (c0rd4 != null && (str = c0rd4.LIZ) != null && str.hashCode() == 1512987055 && str.equals("ad_feed_video_params")) {
            Object obj2 = c0rd4.LIZIZ;
            if (obj2 != null) {
                obj = obj2;
            }
            C988080bos c988080bos = (C988080bos) obj;
            if (c988080bos != null) {
                this.LLIZLLLIL = c988080bos.LIZ;
                this.LLJ = c988080bos.LIZIZ;
                this.LLJI = c988080bos.LIZJ;
            }
        }
    }
}
