package com.ss.android.ugc.aweme.topic.trendingtopic;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1324840ka2;
import X.C13LE;
import X.C1413220msa;
import X.C1770850wBP;
import X.C1843500y4a;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoTrendingTopicCell<T extends C1413220msa> extends PowerCell<C1413220msa> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public boolean LL;
    public final AssemVMLazy LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoTrendingTopicCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/topic/trendingtopic/VideoTrendingTopicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void L5() {
        this.LL = true;
        TextView textView = (TextView) this.itemView.findViewById(R.id.yei);
        Context context = getContext();
        textView.setText(context != null ? context.getString(2131850787) : null);
        ((C197039127h) this.itemView.findViewById(R.id.yei)).setEnabled(false);
        Context context2 = getContext();
        if (context2 != null) {
            ((TextView) this.itemView.findViewById(R.id.yei)).setTextColor(C960203pA.LIZ(R.attr.a1h, context2));
        }
    }

    public final void N5() {
        this.LL = false;
        TextView textView = (TextView) this.itemView.findViewById(R.id.yei);
        Context context = getContext();
        textView.setText(context != null ? context.getString(2131850786) : null);
        ((C197039127h) this.itemView.findViewById(R.id.yei)).setEnabled(true);
        Context context2 = getContext();
        if (context2 != null) {
            ((TextView) this.itemView.findViewById(R.id.yei)).setTextColor(C960203pA.LIZ(R.attr.ee, context2));
        }
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C786410Ut5.U8((C197039127h) this.itemView.findViewById(R.id.yei), new ACListenerS165S0100000_31(this, 91));
        ((C197039127h) this.itemView.findViewById(R.id.yei)).setSupportClickWhenDisable(true);
        C736680Sv4.LJIIIIZZ(this, I5(), new C2217381BqS() { // from class: X.15GG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15GD) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 74), 4);
    }

    public VideoTrendingTopicCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoTrendingTopicListViewModel.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 1194);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(236);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 1179), awS575S0100000_31, AFwS221S0000000_31.get$arr$(292), new AwS575S0100000_31((C03K6) this, 1180), new AwS575S0100000_31((C03K6) this, 1182), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1184), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 1186), null, new AwS575S0100000_31((C03K6) this, 1187));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 1181);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1183);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 1185);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 80));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 1188);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 1189);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 1190);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 1191);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 1192);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 1193), awS575S0100000_31, AFwS221S0000000_31.get$arr$(293), new AwS575S0100000_31((C03K6) this, 1195), new AwS575S0100000_31((C03K6) this, 1196), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1197), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 1198), null, new AwS575S0100000_31((C03K6) this, 1199));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 1200), awS575S0100000_31, AFwS221S0000000_31.get$arr$(294), new AwS575S0100000_31((C03K6) this, 1201), new AwS575S0100000_31((C03K6) this, 1202), new AwS575S0100000_31((C03K6) this, 1203), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 1178));
        }
        this.LLILLJJLI = assemVMLazy;
    }

    public final VideoTrendingTopicListViewModel I5() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (VideoTrendingTopicListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String strLJJIFFI;
        VideoTrendingTopic videoTrendingTopic;
        Resources resources;
        String quantityString;
        Resources resources2;
        String quantityString2;
        C1413220msa c1413220msa = (C1413220msa) interfaceC1891350zJl;
        View view = this.itemView;
        C1324840ka2.LJIIJ((RemoteImageView) view.findViewById(R.id.yes), c1413220msa.LL.eventImg, -1, -1);
        ((TextView) view.findViewById(R.id.yf7)).setText(c1413220msa.LL.eventName);
        TextView textView = (TextView) view.findViewById(R.id.fs2);
        Context context = view.getContext();
        String strLJJIFFI2 = null;
        if (context != null && (resources2 = context.getResources()) != null && (quantityString2 = resources2.getQuantityString(2131755770, (int) c1413220msa.LL.totalVideos)) != null) {
            strLJJIFFI = u.LJJIFFI(quantityString2, "%@", C1843500y4a.LIZIZ(c1413220msa.LL.totalViews), false);
        } else {
            strLJJIFFI = null;
        }
        textView.setText(strLJJIFFI);
        TextView textView2 = (TextView) view.findViewById(R.id.fs1);
        Context context2 = view.getContext();
        if (context2 != null && (resources = context2.getResources()) != null && (quantityString = resources.getQuantityString(2131755769, (int) c1413220msa.LL.totalVideos)) != null) {
            strLJJIFFI2 = u.LJJIFFI(quantityString, "%@", C1843500y4a.LIZIZ(c1413220msa.LL.totalVideos), false);
        }
        textView2.setText(strLJJIFFI2);
        VideoTrendingTopic videoTrendingTopic2 = c1413220msa.LL;
        VideoTrendingTopicListViewModel videoTrendingTopicListViewModelI5 = I5();
        if (videoTrendingTopic2 != null && (videoTrendingTopic = videoTrendingTopicListViewModelI5.LLIZLLLIL) != null && videoTrendingTopic.equals(videoTrendingTopic2)) {
            L5();
        } else {
            N5();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "video_post_page");
        c2344009Gk.LJIIIIZZ("enter_method", "trends_selection_panel");
        c2344009Gk.LJIIIIZZ("event_name", c1413220msa.LL.eventName);
        c2344009Gk.LIZLLL(c1413220msa.LL.eventId, "event_id");
        c2344009Gk.LJIIIIZZ("recall_source", "");
        c2344009Gk.LJIIIIZZ("trends_type", I5().LLILZIL);
        C20684815ws.LJIILLIIL("trends_event_show_al", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i9j, viewGroup, false);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
