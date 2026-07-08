package com.bytedance.android.livesdk.userinfowidget;

import X.C1161920gLG;
import X.C13LP;
import X.C13LQ;
import X.C500260Jjc;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.ActivityToggleInfo;
import com.bytedance.android.livesdkapi.depend.model.live.BcToggleInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes.dex */
public final class LiveToggleWatermarkWidget extends LiveWidget {
    public TextView LL;
    public LiveIconView LLILLJJLI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i07;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        String str;
        ActivityToggleInfo activityToggleInfo;
        String str2;
        super.onCreate();
        this.LL = (TextView) findViewById(R.id.buh);
        this.LLILLJJLI = (LiveIconView) findViewById(R.id.bui);
        DataChannel dataChannel = this.dataChannel;
        String str3 = null;
        Room room = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        BcToggleInfo bcToggleInfoPq0 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Pq0(room);
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        boolean zLJJIJL = C500260Jjc.LJJIJL(this.dataChannel);
        String[] strArr = new String[2];
        if (bcToggleInfoPq0 == null || (str = bcToggleInfoPq0.toggleText) == null || !(!a0.LJJJIL(str))) {
            str = null;
        }
        strArr[0] = str;
        if (room != null && (activityToggleInfo = room.activityToggleInfo) != null && (str2 = activityToggleInfo.activityToggleText) != null && (!a0.LJJJIL(str2))) {
            str3 = str2;
        }
        strArr[1] = str3;
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LQ.LJIJI(strArr), " ", null, null, 0, null, null, 62);
        TextView textView = this.LL;
        if (textView != null) {
            textView.setText(strLJJLIIIJ);
        }
        TextView textView2 = this.LL;
        if (textView2 != null) {
            iPublicScreenService.eW(textView2, zLJJIJL);
        }
        LiveIconView liveIconView = this.LLILLJJLI;
        if (liveIconView != null) {
            float fBY = iPublicScreenService.bY(liveIconView.getContext());
            iPublicScreenService.Jl2();
            liveIconView.LJI(fBY, 0.0f, iPublicScreenService.Nz1(liveIconView.getContext()), iPublicScreenService.rT0(liveIconView.getContext()));
        }
        show();
    }
}
