package com.ss.android.ugc.aweme.topic.trendingtopic.ui;

import X.AbstractC1585810rMx;
import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicCell;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicListViewModel;
import com.ss.android.ugc.aweme.topic.trendingtopic.ui.VideoTrendingTopicListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoTrendingTopicListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoTrendingTopicListAssem.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/topic/trendingtopic/VideoTrendingTopicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public VideoTrendingTopicListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoTrendingTopicListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1864), AFwS276S0000000_31.get$arr$(242), null, true);
    }

    public final VideoTrendingTopicListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (VideoTrendingTopicListViewModel) assemVMLazy.getValue();
    }

    public final void Ho() {
        C786410Ut5.LJZL(0, (LinearLayout) LJJIJL().findViewById(R.id.yf3));
        LJJIJL().findViewById(R.id.yf2).animate().setInterpolator(new LinearInterpolator()).setDuration(250L).translationY(0.0f);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        String string2;
        LJJIJL().findViewById(R.id.w28);
        VideoTrendingTopicListViewModel videoTrendingTopicListViewModelGo = Go();
        Context context = getContext();
        if (context != null) {
            string = context.getString(2131850794);
        } else {
            string = null;
        }
        Context context2 = getContext();
        if (context2 != null) {
            string2 = context2.getString(2131850795);
        } else {
            string2 = null;
        }
        if (string != null) {
            videoTrendingTopicListViewModelGo.LLILZLL = string;
        }
        if (string2 != null) {
            videoTrendingTopicListViewModelGo.LLIZ = string2;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.yey);
        this.LLIZLLLIL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(VideoTrendingTopicCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.15GF
            public int LL;
            public boolean LLILLJJLI;

            {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILLL.LLIZLLLIL;
                this.LL = ((LinearLayoutManager) (viewOnAttachStateChangeListenerC20604515jv2 == null ? null : viewOnAttachStateChangeListenerC20604515jv2).getLayoutManager()).findFirstVisibleItemPosition();
                this.LLILLJJLI = true;
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = null;
                C15GB c15gb = (C15GB) C1252710ihh.LJFF(this.LLILLL, C13LE.LIZ(C15GB.class), null);
                if (c15gb != null) {
                    c15gb.LJJIL();
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLILLL.LLIZLLLIL;
                if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                    viewOnAttachStateChangeListenerC20604515jv2 = viewOnAttachStateChangeListenerC20604515jv3;
                }
                this.LL = ((LinearLayoutManager) viewOnAttachStateChangeListenerC20604515jv2.getLayoutManager()).findFirstVisibleItemPosition();
                if (recyclerView.getScrollState() != 1) {
                    return;
                }
                if (this.LL == 0) {
                    if (!this.LLILLJJLI) {
                        this.LLILLL.Ho();
                        this.LLILLJJLI = true;
                        return;
                    }
                    return;
                }
                if (this.LLILLJJLI) {
                    if (i2 <= 0 || i2 >= 70) {
                        return;
                    }
                    VideoTrendingTopicListAssem videoTrendingTopicListAssem = this.LLILLL;
                    videoTrendingTopicListAssem.LJJIJL().findViewById(R.id.yf2).animate().setInterpolator(new LinearInterpolator()).setDuration(250L).translationY(-videoTrendingTopicListAssem.LJJIJL().findViewById(R.id.yf2).getHeight());
                    HandlerHook.viewPostDelay(videoTrendingTopicListAssem.LJJIJL().findViewById(R.id.yf3), new ARunnableS106S0100000_6(videoTrendingTopicListAssem, 119), 250L);
                    this.LLILLJJLI = false;
                    return;
                }
                if (i2 >= 0 || i2 <= -70) {
                    return;
                }
                this.LLILLL.Ho();
                this.LLILLJJLI = true;
            }
        });
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.15GE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15GD) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 80), 4);
        Go().zQ2(null, true);
    }
}
