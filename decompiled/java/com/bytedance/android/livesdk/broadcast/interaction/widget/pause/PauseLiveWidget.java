package com.bytedance.android.livesdk.broadcast.interaction.widget.pause;

import X.C0IJT;
import X.C0UZS;
import X.C16FS;
import X.C474500IjA;
import X.C500260Jjc;
import X.C786410Ut5;
import X.CountDownTimerC776200Ucc;
import X.EnumC776210Ucd;
import Y.ACListenerS147S0100000_12;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.PauseTimeChannel;
import com.bytedance.android.live.broadcast.api.PauseTimeLongChannel;
import com.bytedance.android.livesdk.broadcast.interaction.widget.pause.PauseLiveWidget;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PauseLiveWidget extends LiveWidget {
    public final View LL;
    public long LLILLJJLI;
    public final CountDownTimerC776200Ucc LLILLL = new CountDownTimer() { // from class: X.0Ucc
        @Override // android.os.CountDownTimer
        public final void onFinish() {
            this.LIZ.x1(EnumC776210Ucd.LLILLL);
            C784440Upu.LIZ().LIZIZ(new C465900IOu(17));
        }

        {
            super(300000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            StringBuilder sbLIZ;
            TextView textView;
            PauseLiveWidget pauseLiveWidget = this.LIZ;
            int i = (int) (j / 1000);
            pauseLiveWidget.getClass();
            int i2 = i % 60;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('0');
            sbLIZ2.append(i / 60);
            sbLIZ2.append(':');
            if (i2 < 10) {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('0');
            } else {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("");
            }
            sbLIZ.append(i2);
            sbLIZ2.append(C2188811AlT.LIZIZ(sbLIZ));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            View view = pauseLiveWidget.getView();
            if (view != null && (textView = (TextView) view.findViewById(R.id.zfw)) != null) {
                textView.setText(strLIZIZ);
            }
            pauseLiveWidget.dataChannel.zW(PauseTimeChannel.class, strLIZIZ);
            pauseLiveWidget.dataChannel.zW(PauseTimeLongChannel.class, Long.valueOf(i));
        }
    };

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0t;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        C500260Jjc.LJIILLIIL(this.LL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C16FS c16fs;
        super.onCreate();
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 135), view);
        }
        View view2 = getView();
        if (view2 != null && (c16fs = (C16FS) view2.findViewById(R.id.cp5)) != null) {
            C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(this, 136));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(PauseLiveChannel.class, this, new AwS591S0100000_12(this, 222));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        cancel();
        this.dataChannel.zW(PauseTimeLongChannel.class, 300L);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C500260Jjc.LLFFF(this.LL);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Ucc] */
    public PauseLiveWidget(View view) {
        this.LL = view;
    }

    public final void x1(EnumC776210Ucd enumC776210Ucd) {
        boolean z;
        long jElapsedRealtime;
        int iIntValue = 0;
        if (enumC776210Ucd == EnumC776210Ucd.LL) {
            z = true;
            this.LLILLJJLI = SystemClock.elapsedRealtime();
            jElapsedRealtime = 0;
        } else {
            z = false;
            jElapsedRealtime = (SystemClock.elapsedRealtime() - this.LLILLJJLI) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_pause_page");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII(enumC776210Ucd.toString().toLowerCase(Locale.ENGLISH), "action_type");
        Integer num = (Integer) this.dataChannel.gg0(C0UZS.class);
        if (num != null) {
            iIntValue = num.intValue();
        }
        c474500IjALIZ.LJJII(Integer.valueOf(iIntValue), "viewers_cnt");
        if (!z) {
            c474500IjALIZ.LJJII(Long.valueOf(jElapsedRealtime), "pause_duration");
        }
        c474500IjALIZ.LIZ();
    }
}
