package com.bytedance.android.livesdk.programmedlive.ui;

import X.C011Z;
import X.C0IJT;
import X.C0IZP;
import X.C0KVO;
import X.C1119850fFP;
import X.C11NJ;
import X.C1548820qPI;
import X.C1570050qxX;
import X.C1871910yoP;
import X.C262100zr;
import X.C427340GpI;
import X.C474500IjA;
import X.C497740JfY;
import X.C521750KdB;
import X.C784440Upu;
import X.C786410Ut5;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import Y.ACListenerS142S0100000_7;
import Y.AfS176S0100000_7;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.setting.LiveMainFrameUpdateFontOptSetting;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.TopFrameSummary;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public final class ProgrammedLiveTitleWidget extends LiveRecyclableWidget implements InterfaceC1141530foN {
    public LinearLayout LL;
    public C427340GpI LLILLJJLI;
    public LiveIconView LLILLL;
    public boolean LLILZ;
    public Room LLILZIL;
    public SparkContext LLILZLL;
    public long LLIZ;
    public final BPEAHandler LLIZLLLIL = new BPEAHandler(Looper.getMainLooper(), new C521750KdB(this, 0));
    public final C11NJ LLJ = new C11NJ();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hjr;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LLILZ = false;
        this.LLIZLLLIL.removeCallbacksAndMessages(null);
        this.LLIZ = 0L;
        this.LLJ.LJ();
        C1548820qPI.LJIIIIZZ("program_live_tile", this);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C427340GpI c427340GpI;
        String strLJFF;
        if (TextUtils.equals(c262100zr.LIZ, "program_live_tile") && (c427340GpI = this.LLILLJJLI) != null) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "title", "");
            } else {
                strLJFF = null;
            }
            c427340GpI.setText(strLJFF);
            c427340GpI.requestLayout();
        }
    }

    public final void onEvent(C0KVO c0kvo) {
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null) {
            linearLayout.setClickable(!c0kvo.LIZ);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LL = (LinearLayout) findViewById(R.id.tsc);
        this.LLILLJJLI = (C427340GpI) findViewById(R.id.title);
        this.LLILLL = (LiveIconView) findViewById(R.id.o8a);
        if (LiveMainFrameUpdateFontOptSetting.INSTANCE.disableFontSizeScale()) {
            C1119850fFP c1119850fFP = C011Z.LIZ;
            View view = this.contentView;
            c1119850fFP.getClass();
            C1119850fFP.LIZ(view);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        Long lValueOf;
        User owner;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String str;
        TopFrameSummary topFrameSummary;
        attachAndShow();
        DataChannel dataChannel = this.dataChannel;
        Long lValueOf2 = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLILZIL = room;
        C427340GpI c427340GpI = this.LLILLJJLI;
        if (c427340GpI != null) {
            if (room != null && (topFrameSummary = room.topFrameSummary) != null) {
                str = topFrameSummary.title;
            } else {
                str = null;
            }
            c427340GpI.setText(str);
            c427340GpI.setSingleLine(true);
            c427340GpI.setMaxLines(1);
            c427340GpI.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            if (!C497740JfY.LJIL()) {
                c427340GpI.setMaxWidth((C497740JfY.LJIIZILJ() - (C497740JfY.LJIILLIIL() + ((int) C497740JfY.LIZIZ(56.0f)))) - ((int) C497740JfY.LIZIZ(18.0f)));
            }
            c427340GpI.requestLayout();
        }
        LiveIconView liveIconView = this.LLILLL;
        if (liveIconView != null) {
            liveIconView.setIcon(R.drawable.f99);
        }
        C786410Ut5.LJLJJI(0, 2000L, this.LLIZLLLIL);
        C1570050qxX.LIZ(new ACListenerS142S0100000_7(this, 98), this.LL);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, ProgrammedLiveMenuVisibilityChannel.class, new AwS586S0100000_7(this, 184));
        }
        this.LLJ.LIZ(C784440Upu.LIZ().LJ(C0KVO.class).LJJLJLI(new AfS176S0100000_7(this, 96)));
        View view = getView();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = 0;
                C786410Ut5.W5(view, marginLayoutParams);
            }
        }
        C1548820qPI.LIZLLL("program_live_tile", this);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_program_live_list_entrance_show");
        Room room2 = this.LLILZIL;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            lValueOf = Long.valueOf(owner.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        Room room3 = this.LLILZIL;
        if (room3 != null) {
            lValueOf2 = Long.valueOf(room3.getId());
        }
        c474500IjALIZ.LJJII(lValueOf2, "room_id");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
        c474500IjALIZ.LIZ();
        Room room4 = this.LLILZIL;
        if (room4 != null) {
            C0IZP.LIZJ(room4, "programmedlive_title");
        }
    }
}
