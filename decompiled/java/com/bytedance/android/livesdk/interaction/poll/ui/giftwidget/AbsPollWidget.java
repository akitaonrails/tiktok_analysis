package com.bytedance.android.livesdk.interaction.poll.ui.giftwidget;

import X.C0IJ7;
import X.C1086800eO6;
import X.C1088240eQQ;
import X.C14K9;
import X.C16F5;
import X.C16FS;
import X.C20097313kJ;
import X.C2188811AlT;
import X.C486790J7d;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786360Ut0;
import X.C786410Ut5;
import X.EnumC1107860ew4;
import X.InterfaceC1086820eO8;
import Y.ACListenerS120S0200000_17;
import Y.ACListenerS152S0100000_17;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.AnchorPollEndEvent;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollDurationSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public class AbsPollWidget extends LiveRecyclableWidget implements InterfaceC1086820eO8 {
    public void B1() {
    }

    public void C1(String str) {
    }

    public void D1() {
    }

    @Override // X.InterfaceC1086820eO8
    public final void LIZLLL() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void A1() {
        View viewFindViewById = this.contentView.findViewById(R.id.pc4);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        C16F5 c16f5 = (C16F5) this.contentView.findViewById(R.id.fo7);
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
        View viewFindViewById2 = this.contentView.findViewById(R.id.fba);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
        }
        View viewFindViewById3 = this.contentView.findViewById(R.id.rfg);
        if (viewFindViewById3 != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById3);
        }
        View viewFindViewById4 = this.contentView.findViewById(R.id.rg_);
        if (viewFindViewById4 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById4);
        }
        C16FS c16fs = (C16FS) this.contentView.findViewById(R.id.a24);
        if (c16fs != null) {
            C786410Ut5.LLJJJ(c16fs, 8);
        }
        View viewFindViewById5 = this.contentView.findViewById(R.id.h4o);
        if (viewFindViewById5 != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById5);
        }
        E1(C1086800eO6.LIZLLL);
        C1086800eO6.LJFF.add(this);
        C16FS c16fs2 = (C16FS) this.contentView.findViewById(R.id.izi);
        if (c16fs2 != null) {
            C786410Ut5.h8(c16fs2, new ACListenerS120S0200000_17(c16fs2, this, 13));
            c16fs2.j0(R.style.a82);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, AnchorPollEndEvent.class, new AwS596S0100000_17(this, 188));
        }
    }

    public boolean x1() {
        C1088240eQQ c1088240eQQ;
        DataChannel dataChannel = this.dataChannel;
        boolean z = false;
        if (dataChannel != null && (c1088240eQQ = (C1088240eQQ) dataChannel.gg0(LivePinCardVisibilityChannel.class)) != null && c1088240eQQ.LIZ == EnumC1107860ew4.QUESTION && c1088240eQQ.LIZIZ) {
            z = true;
        }
        return C500260Jjc.LJLLJ(Boolean.valueOf(z), new AwS561S0100000_17(this, 222));
    }

    public void y1() {
        TextView textView = (TextView) this.contentView.findViewById(R.id.jc4);
        if (textView != null) {
            textView.setText(C497740JfY.LJIJJ(2131841124, String.valueOf(LivePollDurationSetting.INSTANCE.getSecond())));
        }
        View viewFindViewById = this.contentView.findViewById(R.id.i0g);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        View viewFindViewById2 = this.contentView.findViewById(R.id.h4o);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        C16FS c16fs = (C16FS) this.contentView.findViewById(R.id.a24);
        if (c16fs != null) {
            C786410Ut5.LLJJJ(c16fs, 0);
            C786410Ut5.h8(c16fs, new ACListenerS152S0100000_17(this, 59));
            c16fs.setText(2131841951);
            c16fs.j0(R.style.a7b);
        }
    }

    public void z1() {
        View viewFindViewById = this.contentView.findViewById(R.id.pc4);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        C16F5 c16f5 = (C16F5) this.contentView.findViewById(R.id.fo7);
        C786410Ut5.LLJJJJ(c16f5, 0);
        c16f5.setMaxLines(1);
        c16f5.setEllipsize(TextUtils.TruncateAt.END);
        c16f5.setText(2131843805);
        C16F5 c16f52 = (C16F5) this.contentView.findViewById(R.id.rg_);
        if (c16f52 != null) {
            C786410Ut5.LLJJJJ(c16f52, 0);
        }
        C16F5 c16f53 = (C16F5) this.contentView.findViewById(R.id.rfg);
        if (c16f53 != null) {
            C786410Ut5.LLJJJJ(c16f53, 8);
        }
        View viewFindViewById2 = this.contentView.findViewById(R.id.fba);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        View viewFindViewById3 = this.contentView.findViewById(R.id.h4o);
        if (viewFindViewById3 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
        }
        C16FS c16fs = (C16FS) this.contentView.findViewById(R.id.a24);
        if (c16fs != null) {
            C786410Ut5.LLJJJ(c16fs, 0);
            C786410Ut5.h8(c16fs, new ACListenerS152S0100000_17(this, 60));
            c16fs.setText(2131843804);
            c16fs.j0(R.style.a7b);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C1086800eO6.LIZIZ(this);
    }

    public final void E1(long j) {
        TextView textView = (TextView) this.contentView.findViewById(R.id.rfg);
        int i = ((int) (j / 1000)) % 3600;
        int i2 = i / 60;
        int i3 = i % 60;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        if (i2 < 10) {
            sbLIZ2.append('0');
        } else {
            sbLIZ2.append("");
        }
        sbLIZ2.append(i2);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(':');
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        if (i3 < 10) {
            sbLIZ3.append('0');
        } else {
            sbLIZ3.append("");
        }
        sbLIZ3.append(i3);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ3));
        textView.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1086820eO8
    public final void LJJI(long j) {
        E1(j);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        enableSubWidgetManager(new WidgetCreateTimeUtil(null), C486790J7d.LIZ, LiveWidgetNonOpProvider.Companion.getInstance(), C0IJ7.LIZLLL(getContext()));
        C16FS c16fs = (C16FS) this.contentView.findViewById(R.id.a24);
        C14K9.LJIJJ(c16fs, new C786360Ut0(c16fs, 1));
        C20097313kJ.LIZJ(c16fs);
    }
}
