package com.bytedance.android.livesdk.comp.api.pcs.ui.form.input.countrylistpage;

import X.C01GW;
import X.C03H5;
import X.C0I7D;
import X.C0TM9;
import X.C0ZP4;
import X.C1119170fEJ;
import X.C1161920gLG;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LP;
import X.C1697810uHb;
import X.C1727970v4F;
import X.C1728000v4I;
import X.C1749260vca;
import X.C1770850wBP;
import X.C1775970wJf;
import X.C19474211Gy;
import X.C20736316Cj;
import X.C21630819l4;
import X.C418440Gaw;
import X.C452501pT;
import X.C497740JfY;
import X.C736680Sv4;
import X.C758170Tod;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS160S0100000_26;
import Y.AComparatorS31S0000000_12;
import Y.AComparatorS511S0100000_12;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdkapi.host.IHostPCS;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PcsCountrySelectFragment extends LiveSheetFragment implements InterfaceC724530SbT {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWEyOCxiOSwgZjAlZyk8OiHELIOShiICEjPTFiKiAmJjE+MCM6OzE8KCg2ZhUvOgw8PSs4OzYALSkpKjsVOiQrJCo9PA==";
    public boolean LLJZIJLIL;
    public RecyclerView LLLF;
    public C1749260vca LLLFF;
    public C21630819l4 LLLFFI;
    public C1775970wJf LLLFZ;
    public final List<C1727970v4F> LLJLLL = new ArrayList();
    public final List<C1727970v4F> LLJZ = new ArrayList();
    public String LLL = "";
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 32));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final int aS() {
        return 2;
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

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        String str;
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        C1728000v4I c1728000v4I = (C1728000v4I) this.LLLI.getValue();
        if (c1728000v4I == null || (str = c1728000v4I.LIZJ) == null) {
            str = "";
        }
        c1119170fEJ.LIZ(str);
        c1119170fEJ.LJ = C1697810uHb.LJ(new C758170Tod(R.attr.eo4, new ACListenerS160S0100000_26(this, 4)));
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0I7D editTextView;
        super.onDestroy();
        C1749260vca c1749260vca = this.LLLFF;
        if (c1749260vca == null || (editTextView = c1749260vca.getEditTextView()) == null) {
            return;
        }
        editTextView.removeTextChangedListener(this.LLLFZ);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezk, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.cornerRadius = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
        sheetOptions.LIZ(1, null);
        return sheetOptions;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.19l4] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        C0I7D editTextView;
        C0I7D editTextView2;
        String str;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            string = arguments.getString("has_country_code");
        } else {
            string = null;
        }
        this.LLJZIJLIL = Intrinsics.LJFF(string, "1");
        Bundle arguments2 = getArguments();
        String str3 = "";
        if (arguments2 == null || (string2 = arguments2.getString("request_key")) == null) {
            string2 = "";
        }
        this.LLL = string2;
        if (getContext() != null) {
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS511S0100000_12(new AComparatorS31S0000000_12(9), 1), ((IHostPCS) C1161920gLG.LIZJ(IHostPCS.class)).Zt2(requireContext()));
            ((ArrayList) this.LLJLLL).addAll(listLJLLLL);
            ((ArrayList) this.LLJZ).addAll(listLJLLLL);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tv7);
            this.LLLF = recyclerView;
            if (recyclerView != null) {
                C0TM9 c0tm9 = new C0TM9(this.LLJZ, this.LLJZIJLIL);
                c0tm9.LLILLL = new AwS605S0100000_26(this, 568);
                recyclerView.setAdapter(c0tm9);
            }
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.pac);
        if (tuxTextView != null) {
            C1728000v4I c1728000v4I = (C1728000v4I) this.LLLI.getValue();
            if (c1728000v4I != null) {
                str = c1728000v4I.LIZIZ;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        C1749260vca c1749260vca = (C1749260vca) view.findViewById(R.id.u78);
        this.LLLFF = c1749260vca;
        if (c1749260vca != null && (editTextView2 = c1749260vca.getEditTextView()) != null) {
            C1728000v4I c1728000v4I2 = (C1728000v4I) this.LLLI.getValue();
            if (c1728000v4I2 != null) {
                str2 = c1728000v4I2.LIZ;
            }
            editTextView2.setHint(str2);
        }
        this.LLLFZ = new C1775970wJf(this, tuxTextView, 1);
        C1749260vca c1749260vca2 = this.LLLFF;
        if (c1749260vca2 != null && (editTextView = c1749260vca2.getEditTextView()) != null) {
            editTextView.addTextChangedListener(this.LLLFZ);
        }
        if (getContext() != null) {
            final Context contextRequireContext = requireContext();
            ?? r1 = new View(contextRequireContext) { // from class: X.19l4
                public static final String[] LLJJ = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
                public Function1<? super String, Unit> LL;
                public String[] LLILLJJLI;
                public final int LLILLL;
                public boolean LLILZ;
                public int LLILZIL;
                public float LLILZLL;
                public final C444890HcV LLIZ;
                public final float LLIZLLLIL;
                public float LLJ;
                public float LLJI;
                public float LLJIJIL;
                public final RectF LLJILJIL;
                public boolean LLJILJILJ;
                public float LLJILLL;

                {
                    super(contextRequireContext, null, 0);
                    DisplayMetrics displayMetrics = contextRequireContext.getResources().getDisplayMetrics();
                    this.LLILLJJLI = LLJJ;
                    this.LLILLL = (int) TypedValue.applyDimension(1, 80, displayMetrics);
                    this.LLILZIL = -1;
                    this.LLILZLL = -1.0f;
                    float fApplyDimension = TypedValue.applyDimension(2, 12, displayMetrics);
                    this.LLIZLLLIL = fApplyDimension;
                    this.LLJILJIL = new RectF();
                    C444890HcV c444890HcV = new C444890HcV();
                    c444890HcV.setAntiAlias(true);
                    c444890HcV.setColor(C20736316Cj.LIZIZ(R.attr.ezq, contextRequireContext));
                    c444890HcV.setTextSize(fApplyDimension);
                    c444890HcV.setTextAlign(Paint.Align.CENTER);
                    c444890HcV.LIZ(72);
                    this.LLIZ = c444890HcV;
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
                    float width;
                    super.onDraw(canvas);
                    int length = this.LLILLJJLI.length;
                    int i = 0;
                    while (true) {
                        int i2 = 255;
                        if (i < length) {
                            float f = this.LLJILLL;
                            float f2 = this.LLJ;
                            float f3 = i;
                            float f4 = f + (f2 * f3);
                            float f5 = 0.0f;
                            if (this.LLILZIL != -1) {
                                float fAbs = Math.abs(this.LLILZLL - ((f3 * f2) + (f2 / 2))) / this.LLJ;
                                float f6 = 1 - ((fAbs * fAbs) / 16);
                                if (f6 >= 0.0f) {
                                    f5 = f6;
                                }
                            }
                            if (i != this.LLILZIL) {
                                i2 = (int) (255 * (1 - f5));
                            }
                            this.LLIZ.setAlpha(i2);
                            C444890HcV c444890HcV = this.LLIZ;
                            float f7 = this.LLIZLLLIL;
                            c444890HcV.setTextSize(f7 + (f7 * f5));
                            if (this.LLILZ) {
                                width = getPaddingLeft() + (this.LLJIJIL / 2) + (this.LLILLL * f5);
                            } else {
                                width = ((getWidth() - getPaddingRight()) - (this.LLJIJIL / 2)) - (this.LLILLL * f5);
                            }
                            canvas.drawText(this.LLILLJJLI[i], width, f4, this.LLIZ);
                            i++;
                        } else {
                            this.LLIZ.setAlpha(255);
                            this.LLIZ.setTextSize(this.LLIZLLLIL);
                            return;
                        }
                    }
                }

                @Override // android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    int length;
                    Function1<? super String, Unit> function1;
                    if (this.LLILLJJLI.length == 0) {
                        return super.onTouchEvent(motionEvent);
                    }
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float height = y - ((getHeight() / 2) - (this.LLJI / 2));
                    this.LLILZLL = height;
                    if (height <= 0.0f) {
                        length = 0;
                    } else {
                        length = (int) (height / this.LLJ);
                        String[] strArr = this.LLILLJJLI;
                        if (length >= strArr.length) {
                            length = strArr.length - 1;
                        }
                    }
                    this.LLILZIL = length;
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            if (action != 2) {
                                if (action != 3) {
                                    return super.onTouchEvent(motionEvent);
                                }
                            } else {
                                if (this.LLJILJILJ && (function1 = this.LL) != null) {
                                    function1.invoke(this.LLILLJJLI[this.LLILZIL]);
                                }
                                invalidate();
                                return true;
                            }
                        }
                        this.LLJILJILJ = false;
                        this.LLILZIL = -1;
                        invalidate();
                        return true;
                    }
                    if (this.LLJILJIL.contains(x, y)) {
                        this.LLJILJILJ = true;
                        Function1<? super String, Unit> function12 = this.LL;
                        if (function12 != null) {
                            function12.invoke(this.LLILLJJLI[this.LLILZIL]);
                        }
                        invalidate();
                        return true;
                    }
                    this.LLILZIL = -1;
                    return false;
                }

                public final void setIndexItems(String[] strArr) {
                    this.LLILLJJLI = strArr;
                    requestLayout();
                }

                public final void setOnSelectIndexItemListener(Function1<? super String, Unit> function1) {
                    this.LL = function1;
                }

                public final void setPosition(boolean z) {
                    if (this.LLILZ == z) {
                        return;
                    }
                    this.LLILZ = z;
                    requestLayout();
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
                    super.onMeasure(i, i2);
                    this.LLIZ.setTextSize(this.LLIZLLLIL);
                    int size = View.MeasureSpec.getSize(i2);
                    int size2 = View.MeasureSpec.getSize(i);
                    Paint.FontMetrics fontMetrics = this.LLIZ.getFontMetrics();
                    float f = fontMetrics.bottom - fontMetrics.top;
                    this.LLJ = f;
                    String[] strArr = this.LLILLJJLI;
                    this.LLJI = strArr.length * f;
                    float paddingRight = 0.0f;
                    this.LLJIJIL = 0.0f;
                    for (String str4 : strArr) {
                        float f2 = this.LLJIJIL;
                        float fMeasureText = this.LLIZ.measureText(str4);
                        if (f2 < fMeasureText) {
                            f2 = fMeasureText;
                        }
                        this.LLJIJIL = f2;
                    }
                    if (!this.LLILZ) {
                        paddingRight = (size2 - this.LLJIJIL) - getPaddingRight();
                    }
                    float paddingLeft = this.LLILZ ? getPaddingLeft() + paddingRight + this.LLJIJIL : size2;
                    float f3 = size / 2;
                    float f4 = this.LLJI;
                    float f5 = 2;
                    float f6 = f3 - (f4 / f5);
                    this.LLJILJIL.set(paddingRight, f6, paddingLeft, f4 + f6);
                    float length = this.LLILLJJLI.length;
                    float f7 = this.LLJ;
                    float f8 = f3 - ((length * f7) / f5);
                    float f9 = fontMetrics.descent;
                    float f10 = fontMetrics.ascent;
                    this.LLJILLL = (f8 + ((f7 / f5) - ((f9 - f10) / f5))) - f10;
                }
            };
            this.LLLFFI = r1;
            r1.setPosition(C497740JfY.LJJ());
            C21630819l4 c21630819l4 = this.LLLFFI;
            if (c21630819l4 != null) {
                c21630819l4.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0);
            }
            ((ViewGroup) view.findViewById(R.id.eux)).addView(this.LLLFFI);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) this.LLJLLL).iterator();
            while (it2.hasNext()) {
                String str4 = ((C1727970v4F) it2.next()).LIZIZ;
                if (!Intrinsics.LJFF(str4, str3)) {
                    arrayList.add(str4);
                    str3 = str4;
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            C21630819l4 c21630819l42 = this.LLLFFI;
            if (c21630819l42 != null) {
                c21630819l42.setIndexItems(strArr);
            }
            C21630819l4 c21630819l43 = this.LLLFFI;
            if (c21630819l43 != null) {
                c21630819l43.setOnSelectIndexItemListener(new AwS605S0100000_26(this, 569));
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), R.style.zd)), R.layout.hfw, viewGroup, false);
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
