package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.C0IJT;
import X.C0J1R;
import X.C0JFN;
import X.C0JFO;
import X.C0JFP;
import X.C0JFQ;
import X.C0UO0;
import X.C1697810uHb;
import X.C416220GTs;
import X.C474500IjA;
import X.C475510Ikn;
import X.C482260Ivg;
import X.C497740JfY;
import X.C500260Jjc;
import X.C516201zk;
import X.C748850TZb;
import X.C748860TZc;
import X.C749010TZr;
import X.C749060TZw;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import Y.ALAdapterS4S0200000_7;
import Y.AUListenerS149S0300000_7;
import Y.AUListenerS257S0100000_7;
import Y.AfS143S0200000_7;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCancelWhenNotStartEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCapturedImageDataEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCorrectGuessCountChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessEndEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundEndEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessToolbarWidget extends LiveRecyclableWidget {
    public final Fragment LL;
    public View LLILLJJLI;
    public C416220GTs LLILLL;
    public View LLILZ;
    public ViewGroup LLILZIL;
    public ViewGroup LLILZLL;
    public ViewGroup LLIZ;
    public ViewGroup LLIZLLLIL;
    public ViewGroup LLJ;
    public ViewGroup LLJI;
    public ViewGroup LLJIJIL;
    public View LLJILJIL;
    public C0JFP LLJILJILJ;
    public C416220GTs LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gd8;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final void B1() {
        Long lLJJI;
        if (C500260Jjc.LJJJI((Boolean) this.dataChannel.gg0(C748860TZc.class))) {
            return;
        }
        this.dataChannel.SX0(C748860TZc.class, Boolean.TRUE);
        DataChannel dataChannel = this.dataChannel;
        Boolean bool = Boolean.FALSE;
        dataChannel.SX0(C748850TZb.class, bool);
        boolean zLJJJI = C500260Jjc.LJJJI((Boolean) this.dataChannel.gg0(DrawGuessIsCountingDownRoundStart.class));
        this.dataChannel.zW(DrawGuessIsCountingDownRoundStart.class, bool);
        C0JFN c0jfn = C0JFN.LIZ;
        DataChannel dataChannel2 = this.dataChannel;
        c0jfn.getClass();
        Long lLJJI2 = C0JFN.LJJI(dataChannel2);
        if ((lLJJI2 != null ? lLJJI2.longValue() : 0L) <= 0 && !C0JFQ.LIZIZ(this.dataChannel)) {
            this.dataChannel.FQ2(DrawGuessCancelWhenNotStartEvent.class);
            C0JFN.LJIILJJIL(this.dataChannel, "", true);
        } else if (C0JFQ.LIZIZ(this.dataChannel)) {
            Fragment fragment = this.LL;
            AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 148);
            DataChannel dataChannelLJ = C475510Ikn.LJ(fragment);
            if (dataChannelLJ == null || (lLJJI = C0JFN.LJJI(dataChannelLJ)) == null) {
                awS586S0100000_7.invoke(bool);
            } else {
                long jLongValue = lLJJI.longValue();
                ((DrawGuessApi) C482260Ivg.LIZJ(DrawGuessApi.class)).exitDrawGuessGame(C500260Jjc.LJJLIIIJ(dataChannelLJ), jLongValue, jLongValue, "").LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(fragment)).LJJLL(new AfS143S0200000_7(dataChannelLJ, awS586S0100000_7, 50), new C516201zk(awS586S0100000_7, 341));
            }
        } else if (zLJJJI) {
            C0JFN.LIZJ(this.LL, this.dataChannel, "", "exit", "exit", new AwS551S0100000_7(this, 70));
        } else {
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.SX0(C749060TZw.class, 4);
            }
            C0JFN.LJJ(this.dataChannel);
        }
        C0JFO.LIZJ(this.dataChannel, "confirm");
    }

    public final void z1() {
        if (this.LLJJIJI) {
            View view = this.LLILZ;
            if (view == null) {
                view = null;
            }
            List listSingletonList = Collections.singletonList(view);
            View[] viewArr = new View[2];
            C0JFP c0jfp = this.LLJILJILJ;
            if (c0jfp == null) {
                c0jfp = null;
            }
            viewArr[0] = c0jfp;
            View view2 = this.LLJILJIL;
            if (view2 == null) {
                view2 = null;
            }
            viewArr[1] = view2;
            y1(listSingletonList, C1697810uHb.LJIIJJI(viewArr));
            x1(false);
            this.LLJJIJI = false;
        }
        C416220GTs c416220GTs = this.LLJILLL;
        if (c416220GTs == null) {
            c416220GTs = null;
        }
        C416220GTs c416220GTs2 = this.LLILLL;
        c416220GTs.setColor((c416220GTs2 != null ? c416220GTs2 : null).getColor());
    }

    public DrawGuessToolbarWidget(Fragment fragment) {
        this.LL = fragment;
    }

    public final void A1(boolean z) {
        C0JFP c0jfp = null;
        if (z) {
            if (!this.LLJJIJI) {
                View[] viewArr = new View[2];
                C0JFP c0jfp2 = this.LLJILJILJ;
                if (c0jfp2 == null) {
                    c0jfp2 = null;
                }
                viewArr[0] = c0jfp2;
                View view = this.LLJILJIL;
                if (view == null) {
                    view = null;
                }
                viewArr[1] = view;
                List listLJIIJJI = C1697810uHb.LJIIJJI(viewArr);
                View view2 = this.LLILZ;
                if (view2 == null) {
                    view2 = null;
                }
                y1(listLJIIJJI, Collections.singletonList(view2));
                x1(true);
                this.LLJJIJI = true;
            }
            C416220GTs c416220GTs = this.LLJILLL;
            if (c416220GTs == null) {
                c416220GTs = null;
            }
            C416220GTs c416220GTs2 = this.LLILLL;
            if (c416220GTs2 == null) {
                c416220GTs2 = null;
            }
            c416220GTs.setColor(c416220GTs2.getColor());
        } else {
            z1();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_click_change_color");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII(this.dataChannel.gg0(DrawGuessSessionIdChannel.class), "pictionary_session_id");
        c474500IjALIZ.LJJII(this.dataChannel.gg0(DrawGuessRoundIdChannel.class), "pictionary_id");
        C0JFP c0jfp3 = this.LLJILJILJ;
        if (c0jfp3 != null) {
            c0jfp = c0jfp3;
        }
        c474500IjALIZ.LJJII(c0jfp.getCurrentSelectedColorString(), "color");
        C0JFO.LIZ(c474500IjALIZ);
        C0JFO.LJIIJJI(c474500IjALIZ, this.dataChannel);
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C0JFP c0jfp;
        TextView textView;
        LiveIconView liveIconView;
        TextView textView2;
        LiveIconView liveIconView2;
        this.LLJJIII = C0JFQ.LIZ(this.dataChannel);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.hfi);
        this.LLILZIL = viewGroup;
        C416220GTs c416220GTs = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C500260Jjc.LJLIIIL(500L, viewGroup, new AwS586S0100000_7(this, 131));
        ViewGroup viewGroup2 = this.LLILZIL;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        LiveIconView liveIconView3 = (LiveIconView) viewGroup2.findViewById(R.id.g_j);
        if (liveIconView3 != null) {
            liveIconView3.setIconAttr(R.attr.cqr);
        }
        ViewGroup viewGroup3 = this.LLILZIL;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        TextView textView3 = (TextView) viewGroup3.findViewById(R.id.g_k);
        if (textView3 != null) {
            textView3.setText(2131841377);
        }
        ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.tff);
        this.LLILZLL = viewGroup4;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        C500260Jjc.LJLIIIL(500L, viewGroup4, new AwS586S0100000_7(this, 132));
        ViewGroup viewGroup5 = this.LLILZLL;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        LiveIconView liveIconView4 = (LiveIconView) viewGroup5.findViewById(R.id.g_j);
        if (liveIconView4 != null) {
            liveIconView4.setIconAttr(R.attr.edt);
        }
        ViewGroup viewGroup6 = this.LLILZLL;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        TextView textView4 = (TextView) viewGroup6.findViewById(R.id.g_k);
        if (textView4 != null) {
            textView4.setText(2131841405);
        }
        ViewGroup viewGroup7 = (ViewGroup) findViewById(R.id.p8o);
        this.LLIZLLLIL = viewGroup7;
        if (viewGroup7 == null) {
            viewGroup7 = null;
        }
        LiveIconView liveIconView5 = (LiveIconView) viewGroup7.findViewById(R.id.g_j);
        if (liveIconView5 != null) {
            liveIconView5.setIcon(R.drawable.eua);
        }
        ViewGroup viewGroup8 = this.LLIZLLLIL;
        if (viewGroup8 == null) {
            viewGroup8 = null;
        }
        LiveIconView liveIconView6 = (LiveIconView) viewGroup8.findViewById(R.id.g_j);
        if (liveIconView6 != null) {
            C786410Ut5.i5(liveIconView6, 1.0f);
        }
        ViewGroup viewGroup9 = this.LLIZLLLIL;
        if (viewGroup9 == null) {
            viewGroup9 = null;
        }
        TextView textView5 = (TextView) viewGroup9.findViewById(R.id.g_k);
        if (textView5 != null) {
            textView5.setText(2131841393);
        }
        ViewGroup viewGroup10 = this.LLIZLLLIL;
        if (viewGroup10 == null) {
            viewGroup10 = null;
        }
        C500260Jjc.LJLIIIL(500L, viewGroup10, new AwS586S0100000_7(this, 133));
        if (this.LLJJIII) {
            ViewGroup viewGroup11 = (ViewGroup) findViewById(R.id.fc0);
            this.LLJ = viewGroup11;
            if (viewGroup11 != null && (liveIconView2 = (LiveIconView) viewGroup11.findViewById(R.id.g_j)) != null) {
                liveIconView2.setIconAttr(R.attr.e6w);
            }
            ViewGroup viewGroup12 = this.LLJ;
            if (viewGroup12 != null && (textView2 = (TextView) viewGroup12.findViewById(R.id.g_k)) != null) {
                textView2.setText(2131841375);
            }
            ViewGroup viewGroup13 = this.LLJ;
            if (viewGroup13 != null) {
                C500260Jjc.LJLIIIL(500L, viewGroup13, new AwS586S0100000_7(this, 134));
            }
            ViewGroup viewGroup14 = (ViewGroup) findViewById(R.id.dni);
            this.LLIZ = viewGroup14;
            if (viewGroup14 != null) {
                C500260Jjc.LJLIIIL(500L, viewGroup14, new AwS586S0100000_7(this, 135));
            }
            C500260Jjc.LLFFF(this.LLIZ);
            ViewGroup viewGroup15 = this.LLIZ;
            if (viewGroup15 != null && (liveIconView = (LiveIconView) viewGroup15.findViewById(R.id.g_j)) != null) {
                liveIconView.setIconAttr(R.attr.ebh);
            }
            ViewGroup viewGroup16 = this.LLIZ;
            if (viewGroup16 != null && (textView = (TextView) viewGroup16.findViewById(R.id.g_k)) != null) {
                textView.setText(2131841353);
            }
            ViewGroup viewGroup17 = this.LLILZLL;
            if (viewGroup17 == null) {
                viewGroup17 = null;
            }
            C500260Jjc.LJIILIIL(viewGroup17);
        }
        this.LLILZ = findViewById(R.id.g_d);
        this.LLILLL = (C416220GTs) findViewById(R.id.e86);
        View viewFindViewById = findViewById(R.id.e85);
        this.LLILLJJLI = viewFindViewById;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS586S0100000_7(this, 136));
        C0JFP c0jfp2 = (C0JFP) findViewById(R.id.e8m);
        this.LLJILJILJ = c0jfp2;
        if (c0jfp2 == null) {
            c0jfp = null;
        } else {
            c0jfp = c0jfp2;
        }
        c0jfp.LLILZ = this.dataChannel;
        if (c0jfp2 == null) {
            c0jfp2 = null;
        }
        c0jfp2.setOnClickListener(new AwS586S0100000_7(this, 137));
        this.LLJILJIL = findViewById(R.id.faz);
        C416220GTs c416220GTs2 = (C416220GTs) findViewById(R.id.fay);
        this.LLJILLL = c416220GTs2;
        if (c416220GTs2 == null) {
            c416220GTs2 = null;
        }
        C500260Jjc.LJLIIIL(500L, c416220GTs2, new AwS586S0100000_7(this, 138));
        ViewGroup viewGroup18 = (ViewGroup) findViewById(R.id.undo_button);
        this.LLJI = viewGroup18;
        if (viewGroup18 == null) {
            viewGroup18 = null;
        }
        C786410Ut5.K7(viewGroup18, new ACListenerS142S0100000_7(this, 77));
        ViewGroup viewGroup19 = this.LLJI;
        if (viewGroup19 == null) {
            viewGroup19 = null;
        }
        LiveIconView liveIconView7 = (LiveIconView) viewGroup19.findViewById(R.id.g_j);
        if (liveIconView7 != null) {
            liveIconView7.setIconAttr(R.attr.crb);
        }
        ViewGroup viewGroup20 = this.LLJI;
        if (viewGroup20 == null) {
            viewGroup20 = null;
        }
        TextView textView6 = (TextView) viewGroup20.findViewById(R.id.g_k);
        if (textView6 != null) {
            textView6.setText(2131841378);
        }
        ViewGroup viewGroup21 = (ViewGroup) findViewById(R.id.tc1);
        this.LLJIJIL = viewGroup21;
        if (viewGroup21 == null) {
            viewGroup21 = null;
        }
        LiveIconView liveIconView8 = (LiveIconView) viewGroup21.findViewById(R.id.g_j);
        if (liveIconView8 != null) {
            liveIconView8.setIconAttr(R.attr.el1);
        }
        ViewGroup viewGroup22 = this.LLJIJIL;
        if (viewGroup22 == null) {
            viewGroup22 = null;
        }
        TextView textView7 = (TextView) viewGroup22.findViewById(R.id.g_k);
        if (textView7 != null) {
            textView7.setText(2131841376);
        }
        ViewGroup viewGroup23 = this.LLJIJIL;
        if (viewGroup23 == null) {
            viewGroup23 = null;
        }
        C786410Ut5.K7(viewGroup23, new ACListenerS142S0100000_7(this, 76));
        hide();
        DataChannel dataChannel = this.dataChannel;
        C416220GTs c416220GTs3 = this.LLILLL;
        if (c416220GTs3 != null) {
            c416220GTs = c416220GTs3;
        }
        dataChannel.SX0(C749010TZr.class, Integer.valueOf(c416220GTs.getColor()));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataChannel dataChannel = this.dataChannel;
        dataChannel.BQ2(this, DrawGuessRoundStartEvent.class, new AwS586S0100000_7(this, 139));
        dataChannel.BQ2(this, DrawGuessEndEvent.class, new AwS586S0100000_7(this, 140));
        dataChannel.BQ2(this, DrawGuessCapturedImageDataEvent.class, new AwS586S0100000_7(this, 141));
        dataChannel.BQ2(this, DrawGuessRoundEndEvent.class, new AwS586S0100000_7(this, 142));
        dataChannel.BQ2(this, DrawGuessRoundStartEvent.class, new AwS586S0100000_7(this, 143));
        dataChannel.BQ2(this, DrawGuessFreelyStartChannel.class, new AwS586S0100000_7(this, 144));
        dataChannel.BQ2(this, DrawGuessIsCountingDownRoundStart.class, new AwS586S0100000_7(this, 145));
        dataChannel.BQ2(this, DrawGuessCancelWhenNotStartEvent.class, new AwS586S0100000_7(this, 146));
        if (this.LLJJIII) {
            this.dataChannel.BQ2(this, DrawGuessCorrectGuessCountChannel.class, new AwS586S0100000_7(this, 147));
        }
    }

    public final void x1(boolean z) {
        float f;
        float fLIZIZ = (int) C497740JfY.LIZIZ(36.0f);
        float fLIZIZ2 = (int) C497740JfY.LIZIZ(254.0f);
        if (z) {
            f = fLIZIZ;
            fLIZIZ = fLIZIZ2;
        } else {
            f = fLIZIZ2;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, fLIZIZ);
        valueAnimatorOfFloat.setDuration(200L);
        C0JFN.LIZ.getClass();
        valueAnimatorOfFloat.setInterpolator(C0JFN.LIZIZ);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS257S0100000_7(this, 6));
        valueAnimatorOfFloat.start();
    }

    public static void y1(List list, List list2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(120L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS149S0300000_7(valueAnimatorOfFloat, list, list2, 0));
        valueAnimatorOfFloat.addListener(new ALAdapterS4S0200000_7(list, list2, 2));
        valueAnimatorOfFloat.start();
    }
}
