package com.ss.android.ugc.aweme.spark.common;

import X.C11WS;
import X.C11WW;
import X.C19EG;
import X.InterfaceC1056670dbV;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes30.dex */
public abstract class ThirdPartyCustomUIContext<T extends C11WS> extends BaseThirdPartyContext<T> {
    public View LLILZ;

    public abstract void LJ(View view);

    public abstract void LJFF();

    public View LJI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext
    public void LIZ() {
        super.LIZ();
        this.LL.LJJ(InterfaceC1056670dbV.class, new C11WW(this));
    }

    public ThirdPartyCustomUIContext(SparkContext sparkContext) {
        super(sparkContext);
    }

    @Override // com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext, androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner) {
        View viewFindViewById;
        super.onCreate(lifecycleOwner);
        C19EG c19eg = this.LLILLL;
        if (c19eg != null && (viewFindViewById = c19eg.findViewById(R.id.en0)) != null) {
            this.LLILZ = viewFindViewById;
            LJ(viewFindViewById);
        }
    }
}
