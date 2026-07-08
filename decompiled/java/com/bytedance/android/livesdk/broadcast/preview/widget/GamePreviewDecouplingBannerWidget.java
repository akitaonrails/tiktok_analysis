package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0UKZ;
import X.C1161920gLG;
import X.C16F5;
import X.C20337914i1;
import X.C20441214yg;
import X.C751980Tee;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.broadcast.PreviewDecouplingCenter;
import com.bytedance.android.livesdk.broadcast.PreviewMoreClickEvent;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GamePreviewDecouplingBannerWidget extends BannerWidget {
    public C16F5 LLJI;
    public C16F5 LLJIJIL;
    public View LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL = "";
    public final String LLJJ = "game_decoupling";

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hhb;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void M1() {
        C20337914i1<Long> c20337914i1 = C0UKZ.LLIIJLIL;
        Long lLIZIZ = c20337914i1.LIZIZ();
        C20337914i1<Integer> c20337914i12 = C0UKZ.LLIIJI;
        int iValueOf = N1(lLIZIZ.longValue()) ? 1 : Integer.valueOf(c20337914i12.LIZIZ().intValue() + 1);
        c20337914i1.LJFF(Long.valueOf(System.currentTimeMillis()));
        c20337914i12.LJFF(iValueOf);
        C20441214yg.LJIIIZ("GamePreviewDecouplingBannerWidget", "updateShowCount()");
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() throws Exception {
        if (this.LLJILJILJ) {
            Long lLIZIZ = C0UKZ.LLIIJLIL.LIZIZ();
            Integer numLIZIZ = C0UKZ.LLIIJI.LIZIZ();
            if ((lLIZIZ == null || lLIZIZ.longValue() != 0) && !N1(lLIZIZ.longValue()) && numLIZIZ.intValue() >= 3) {
                return;
            }
            super.show();
            C20441214yg.LJIIIZ("GamePreviewDecouplingBannerWidget", "show()");
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.LLJI = (C16F5) findViewById(R.id.fhz);
        this.LLJIJIL = (C16F5) findViewById(R.id.fhv);
        this.LLJILJIL = findViewById(R.id.b39);
        View viewFindViewById = findViewById(R.id.br9);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 141), viewFindViewById);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 241));
            dataChannel.BQ2(this, PreviewMoreClickEvent.class, new AwS591S0100000_12(this, 242));
            dataChannel.BQ2(this, PreviewDecouplingCenter.class, new AwS591S0100000_12(this, 243));
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String H1() {
        return this.LLJJ;
    }

    public static boolean N1(long j) {
        if (j == 0) {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        calendar.setFirstDayOfWeek(2);
        calendar2.setFirstDayOfWeek(2);
        if (calendar.get(1) != calendar2.get(1) || calendar.get(3) != calendar2.get(3)) {
            return true;
        }
        return false;
    }

    public final void O1(String str) {
        String str2;
        LiveMode liveModeLIZJ;
        if (str == null) {
            return;
        }
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        Context context = this.context;
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(str).buildUpon().appendQueryParameter("enter_from", "live_take_page");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveModeLIZJ = C751980Tee.LIZJ(dataChannel)) != null) {
            str2 = liveModeLIZJ.logStreamingType;
        } else {
            str2 = null;
        }
        iActionHandlerService.handle(context, builderAppendQueryParameter.appendQueryParameter("live_type", str2).build().toString());
    }
}
