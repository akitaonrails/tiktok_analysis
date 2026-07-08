package com.ss.android.ugc.aweme.mix.manageplaylist;

import X.C01GW;
import X.C03H5;
import X.C0KZF;
import X.C0ZP4;
import X.C1167940gUy;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331750klB;
import X.C1383370m6R;
import X.C13LP;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C418440Gaw;
import X.C445520HdW;
import X.C445530HdX;
import X.C452501pT;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC0148002o;
import X.InterfaceC1167900gUu;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.text.u;
import wh6.AbS508S0200000_18;

/* JADX INFO: loaded from: classes7.dex */
public final class ManagePlaylistCell extends PowerCell<C1167940gUy> implements InterfaceC1167900gUu, InterfaceC724530SbT {
    public final C01GW LL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 685));
    public View LLILLJJLI;
    public View LLILLL;
    public final Paint LLILZ;

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

    @Override // X.InterfaceC1167900gUu
    public final void LJIIJ() {
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        this.itemView.setLayerType(0, null);
    }

    @Override // X.InterfaceC1167900gUu
    public final void LJIIZILJ() {
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        this.itemView.setLayerType(2, this.LLILZ);
    }

    public ManagePlaylistCell() {
        Paint paint = new Paint();
        paint.setShadowLayer(4.0f, 0.0f, 0.0f, -16777216);
        this.LLILZ = paint;
    }

    public final void I5(C1167940gUy c1167940gUy) {
        String str;
        List<String> urlList;
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.qua);
        if (smartImageView != null) {
            smartImageView.setBackground((Drawable) this.LL.getValue());
            UrlModel urlModel = c1167940gUy.LLILLJJLI;
            int iIntValue = 0;
            if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
                str = "";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            c1331750klB.LIZ = false;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
            c1331750klB.LIZJ = iIntValue;
            c1331750klB.LIZIZ = fLIZIZ;
            c1331670kl3LJIIIZ.LJJI = c1331750klB.LIZ();
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
    }

    public final void L5(C1167940gUy c1167940gUy) {
        Integer num;
        TextView textView = (TextView) this.itemView.findViewById(R.id.qut);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.qur);
        if (c1167940gUy.LLILZIL != null && (num = c1167940gUy.LLILLL) != null && num.intValue() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = c1167940gUy.LLILZIL.longValue();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            long j2 = jCurrentTimeMillis - (jLongValue * j);
            long j3 = 60;
            if (j2 <= ((long) C445530HdX.LIZ()) * 1000 * j3 * j3 * ((long) 24)) {
                if (textView != null) {
                    String strLJIIJ = C1383370m6R.LJIIJ(2131840538);
                    C0KZF c0kzf = C0KZF.LIZ;
                    Context context = this.itemView.getContext();
                    long jLongValue2 = c1167940gUy.LLILZIL.longValue() * j;
                    c0kzf.getClass();
                    textView.setText(u.LJJIFFI(strLJIIJ, "{relative_date}", C0KZF.LIZ(context, jLongValue2, j2), false));
                }
                if (textView2 != null) {
                    textView2.setText(" · ");
                }
                C786410Ut5.LLIL(textView, 0);
                C786410Ut5.LLIL(textView2, 0);
                return;
            }
            C786410Ut5.LLIL(textView, 8);
            C786410Ut5.LLIL(textView2, 8);
            return;
        }
        C786410Ut5.LLIL(textView, 8);
        C786410Ut5.LLIL(textView2, 8);
    }

    public final void N5(C1167940gUy c1167940gUy) {
        int iIntValue;
        int iIntValue2;
        TextView textView = (TextView) this.itemView.findViewById(R.id.qux);
        if (textView != null) {
            Resources resources = this.itemView.getContext().getResources();
            Integer num = c1167940gUy.LLILLL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Object[] objArr = new Object[1];
            Integer num2 = c1167940gUy.LLILLL;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            objArr[0] = Integer.valueOf(iIntValue2);
            textView.setText(resources.getQuantityString(2131755471, iIntValue, objArr));
        }
    }

    public final void P5(C1167940gUy c1167940gUy) {
        int i;
        Drawable drawableMutate;
        TuxTag tuxTag = (TuxTag) this.itemView.findViewById(R.id.quy);
        tuxTag.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        if (c1167940gUy.LLILZLL == 1) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLZLLIL(tuxTag, i);
        Drawable background = tuxTag.getBackground();
        if (background != null && (drawableMutate = background.mutate()) != null) {
            drawableMutate.setAlpha(30);
        }
        tuxTag.setTextColor(C960203pA.LIZ(R.attr.a11, tuxTag.getContext()));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1167940gUy c1167940gUy) {
        this.LLILLJJLI = this.itemView.findViewById(R.id.y_s);
        this.LLILLL = this.itemView.findViewById(R.id.ccv);
        TextView textView = (TextView) this.itemView.findViewById(R.id.qv2);
        if (textView != null) {
            textView.setText(c1167940gUy.LL);
        }
        N5(c1167940gUy);
        P5(c1167940gUy);
        L5(c1167940gUy);
        I5(c1167940gUy);
        C786410Ut5.I7(new AbS508S0200000_18(c1167940gUy, this, 22, 42), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dx2, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        TextView textView;
        C1167940gUy c1167940gUy = (C1167940gUy) interfaceC1891350zJl;
        if (list.isEmpty()) {
            onBindItemView(c1167940gUy);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof C445520HdW) {
                C445520HdW c445520HdW = (C445520HdW) obj;
                if (c445520HdW.LIZ) {
                    I5(c1167940gUy);
                }
                if (c445520HdW.LIZIZ && (textView = (TextView) this.itemView.findViewById(R.id.qv2)) != null) {
                    textView.setText(c1167940gUy.LL);
                }
                if (c445520HdW.LIZJ) {
                    N5(c1167940gUy);
                }
                if (c445520HdW.LIZLLL) {
                    P5(c1167940gUy);
                }
                if (c445520HdW.LJ) {
                    L5(c1167940gUy);
                }
                if (c445520HdW.LIZ || c445520HdW.LIZIZ || c445520HdW.LIZJ) {
                    C786410Ut5.I7(new AbS508S0200000_18(c1167940gUy, this, 22, 42), this.itemView);
                }
            }
        }
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
