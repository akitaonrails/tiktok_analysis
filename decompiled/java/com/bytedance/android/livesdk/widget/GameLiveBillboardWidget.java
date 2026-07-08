package com.bytedance.android.livesdk.widget;

import X.C01GW;
import X.C0IJT;
import X.C0IMF;
import X.C0UO0;
import X.C11JF;
import X.C11NZ;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1385040m98;
import X.C16F5;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2441009hQ;
import X.C416760GVu;
import X.C452501pT;
import X.C474500IjA;
import X.C497740JfY;
import X.C786410Ut5;
import X.C930940aKi;
import X.InterfaceC1487280oo2;
import Y.ARunnableS106S0100000_6;
import Y.AfS142S0200000_6;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class GameLiveBillboardWidget extends LiveRecyclableWidget {
    public static final /* synthetic */ int LLJI = 0;
    public C0IMF LL;
    public int LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 108));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 110));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 109));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(97));
    public C11JF LLIZ;
    public C416760GVu LLIZLLLIL;
    public Room LLJ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hz1;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C20441214yg.LIZIZ("GameLiveBillboardWidget", "onUnload");
    }

    public final LinearLayout x1() {
        return (LinearLayout) this.LLILLL.getValue();
    }

    public final C16F5 y1() {
        return (C16F5) this.LLILZIL.getValue();
    }

    public final C16F5 z1() {
        return (C16F5) this.LLILZ.getValue();
    }

    public final void A1(C16F5 c16f5) {
        C1361400lX0 c1361400lX0LIZ;
        Integer numLIZJ;
        C20441214yg.LIZIZ("GameLiveBillboardWidget", String.valueOf(c16f5.getText()));
        Context context = this.context;
        if (context != null && (c1361400lX0LIZ = C1385040m98.LIZ(context, false)) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ezq, c1361400lX0LIZ)) != null) {
            int iIntValue = numLIZJ.intValue();
            c16f5.setShadowLayer(1.5f, 0.0f, 1.5f, C2441009hQ.LJIIL(iIntValue, 38));
            c16f5.setShadowLayer(4.5f, 0.0f, 1.5f, C2441009hQ.LJIIL(iIntValue, 51));
        }
    }

    public final void C1(int i) {
        FrameLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = x1().getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            if (i == 1) {
                layoutParams.topMargin = LivePlayFragment.v2 + ((int) C497740JfY.LIZIZ(10.0f));
                layoutParams.leftMargin = (int) C497740JfY.LIZIZ(12.0f);
                C786410Ut5.d6(x1(), layoutParams);
            } else {
                layoutParams.topMargin = (int) C497740JfY.LIZIZ(84.0f);
                layoutParams.leftMargin = (int) C497740JfY.LIZIZ(12.0f);
                C786410Ut5.d6(x1(), layoutParams);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Long lValueOf;
        Long lValueOf2;
        LiveMode streamType;
        User owner;
        C1361400lX0 c1361400lX0LIZ;
        C20441214yg.LIZIZ("GameLiveBillboardWidget", "onLoad");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Context context = this.context;
        String str = null;
        if (context != null && (c1361400lX0LIZ = C1385040m98.LIZ(context, true)) != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.exn, c1361400lX0LIZ);
            if (numLIZJ != null) {
                gradientDrawable.setColor(C2441009hQ.LJIIL(numLIZJ.intValue(), 216));
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ezq, c1361400lX0LIZ);
            if (numLIZJ2 != null) {
                z1().setTextColor(numLIZJ2.intValue());
            }
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ezs, c1361400lX0LIZ);
            if (numLIZJ3 != null) {
                y1().setTextColor(numLIZJ3.intValue());
            }
        }
        gradientDrawable.setCornerRadius(C497740JfY.LIZIZ(14.0f));
        x1().setBackground(gradientDrawable);
        A1(z1());
        A1(y1());
        this.LLJ = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C1(this.LLILLJJLI);
        B1(this.LL, true);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_play_together_public_panel_show");
        Room room = this.LLJ;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        Room room2 = this.LLJ;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            lValueOf2 = Long.valueOf(owner.getId());
        } else {
            lValueOf2 = null;
        }
        c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
        c474500IjALIZ.LJJII(this.LL.LJFF, "play_together_id");
        Room room3 = this.LLJ;
        if (room3 != null && (streamType = room3.getStreamType()) != null) {
            str = streamType.logStreamingType;
        }
        c474500IjALIZ.LJJII(str, "live_type");
        c474500IjALIZ.LJJII(this.LL.LJ, "who_can_play");
        c474500IjALIZ.LJJII(this.LL.LJI, "theme_id");
        c474500IjALIZ.LJJII(this.LL.LJII, "config_id");
        c474500IjALIZ.LIZ();
    }

    public GameLiveBillboardWidget(C0IMF c0imf, int i) {
        this.LL = c0imf;
        this.LLILLJJLI = i;
    }

    public final void B1(C0IMF c0imf, boolean z) {
        boolean z2;
        int length;
        float f;
        C0IMF c0imf2 = this.LL;
        if (c0imf2 == null ? c0imf == null : !(c0imf == null || c0imf2.LIZ != c0imf.LIZ || !TextUtils.equals(c0imf2.LIZIZ, c0imf.LIZIZ) || !TextUtils.equals(c0imf2.LIZJ, c0imf.LIZJ) || !TextUtils.equals(c0imf2.LIZLLL, c0imf.LIZLLL))) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LL = c0imf;
        if (!z2 || z) {
            C786410Ut5.LJZL(0, x1());
            C786410Ut5.LLJJJJ(z1(), 8);
            C786410Ut5.LLJJJJ(y1(), 8);
            String str = this.LL.LIZLLL;
            if (str != null) {
                length = str.length();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("liveBillboardTips.length: ");
                sbLIZ.append(str.length());
                C20441214yg.LIZIZ("GameLiveBillboardWidget", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                length = 0;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LL.LIZIZ);
            sbLIZ2.append(": ");
            sbLIZ2.append(this.LL.LIZJ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            C786410Ut5.LLJJJJ(z1(), 0);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Before liveBillboardNotice.length: ");
            sbLIZ3.append(strLIZIZ.length());
            C20441214yg.LIZIZ("GameLiveBillboardWidget", C2188811AlT.LIZIZ(sbLIZ3));
            if (strLIZIZ.length() + length >= 100) {
                strLIZIZ = strLIZIZ.substring(0, 97 - length) + "...";
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("After liveBillboardNotice.length: ");
            sbLIZ4.append(strLIZIZ.length());
            sbLIZ4.append(", totalLength: ");
            sbLIZ4.append(length + strLIZIZ.length());
            C20441214yg.LIZIZ("GameLiveBillboardWidget", C2188811AlT.LIZIZ(sbLIZ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("  ");
            sbLIZ5.append(strLIZIZ);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ5));
            z1().setText(strLIZIZ);
            C416760GVu c416760GVu = this.LLIZLLLIL;
            if (c416760GVu != null) {
                C786410Ut5.q2(spannableStringBuilder, c416760GVu, 0, 1, 33);
                z1().setText(spannableStringBuilder);
            } else {
                C11JF c11jf = this.LLIZ;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                this.LLIZ = (C11JF) C11NZ.LJJJJZ("ttlive_ic_play_together_billboard_3x.png").LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0IME
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        return C1143680frq.LIZ("tiktok_live_game_demand_2", (String) obj);
                    }
                }).LJIILIIL(new C0UO0()).LJJLJLI(new AfS142S0200000_6(this, spannableStringBuilder, 0));
            }
            String str2 = this.LL.LIZLLL;
            if (str2 != null) {
                C786410Ut5.LLJJJJ(y1(), 0);
                y1().setText(str2);
            }
            if (((Boolean) this.LLILZLL.getValue()).booleanValue()) {
                f = 13.0f;
            } else {
                f = 14.0f;
            }
            y1().setTextSize(f);
            z1().setTextSize(f);
            if (z1().getParent() != null) {
                HandlerHook.viewPost(z1(), new ARunnableS106S0100000_6(this, 29));
            }
        }
    }
}
