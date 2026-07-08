package com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget;

import X.C098200Yq;
import X.C13LP;
import X.C189200o6;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.room.GoLiveCardPicture;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePromoteSinglePhotoWidget extends LivePromoteParentWidget {
    public TextView LLJJJJ;
    public TextView LLJJJJJIL;
    public ImageView LLJJJJLIIL;

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final int E1() {
        return R.layout.hjw;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final boolean P1() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public LivePromoteSinglePhotoWidget(EncourageGoLiveCard encourageGoLiveCard) {
        super(encourageGoLiveCard);
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
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.widget.Widget
    public final void setContentView(View view) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        String str;
        super.setContentView(view);
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.tv_title);
        } else {
            textView = null;
        }
        this.LLJJJJ = textView;
        if (view != null) {
            textView2 = (TextView) view.findViewById(R.id.tv_sub_title);
        } else {
            textView2 = null;
        }
        this.LLJJJJJIL = textView2;
        if (view != null) {
            imageView = (ImageView) view.findViewById(R.id.la1);
        } else {
            imageView = null;
        }
        this.LLJJJJLIIL = imageView;
        TextView textView3 = this.LLJJJJ;
        if (textView3 != null) {
            textView3.setText(this.LLILZLL.title);
        }
        TextView textView4 = this.LLJJJJJIL;
        if (textView4 != null) {
            textView4.setText(this.LLILZLL.subTitle);
        }
        GoLiveCardPicture goLiveCardPicture = (GoLiveCardPicture) C13LP.LJJJLZIJ(0, this.LLILZLL.pictures);
        if (goLiveCardPicture != null) {
            str = goLiveCardPicture.url;
        } else {
            str = null;
        }
        H1(str, this.LLJJJJLIIL, null);
    }
}
