package com.bytedance.android.livesdk.widget;

import X.C0IEB;
import X.C0IJO;
import X.C786410Ut5;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class LiveAgeRestrictedWidget extends LiveWidget {
    public C0IEB LL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxf;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        C0IEB c0ieb = this.LL;
        if (c0ieb != null) {
            c0ieb.start();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        TextView textView = (TextView) findViewById(R.id.akq);
        TextView textView2 = (TextView) findViewById(R.id.akr);
        textView.setText(2131842838);
        textView2.setText(2131842395);
        View view = getView();
        Objects.requireNonNull(view);
        C786410Ut5.I7(new C0IJO(), view);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C0IEB c0ieb = this.LL;
        if (c0ieb != null) {
            c0ieb.stop(false);
        }
    }

    public LiveAgeRestrictedWidget(C0IEB c0ieb) {
        this.LL = c0ieb;
    }
}
