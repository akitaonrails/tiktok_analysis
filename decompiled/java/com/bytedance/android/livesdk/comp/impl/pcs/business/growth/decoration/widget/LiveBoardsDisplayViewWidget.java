package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.widget;

import X.C1121870fIf;
import X.C1121880fIg;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.android.livesdk.rank.api.BoardsPermissionChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBoardsDisplayViewWidget extends PreviewWidget {
    public BoardsDisplayView LLILZ;
    public final C1121870fIf LLILZIL = new C1121870fIf(this);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hij;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.LLILZ = (BoardsDisplayView) findViewById(R.id.c7b);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, BoardsPermissionChannel.class, new C1121880fIg(this));
        }
    }
}
