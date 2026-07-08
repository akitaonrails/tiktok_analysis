package com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.assem;

import X.C01GW;
import X.C04TD;
import X.C05MK;
import X.C0A1Q;
import X.C0CHQ;
import X.C1179980goO;
import X.C1418920n1m;
import X.C1428580nHM;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C19507611Tu;
import X.C19507711Tv;
import X.C19508011Ty;
import X.C1954807lC;
import X.C23250099c;
import X.C297750Bll;
import X.C376670Epl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C723590SZx;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import X.EnumC19356610o8;
import X.EnumC19507811Tw;
import X.EnumC452301pR;
import X.InterfaceC1436400nTy;
import X.InterfaceC332260D0u;
import X.InterfaceC665370Q7z;
import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.util.EditShareProtocol;
import com.ss.android.ugc.aweme.services.IEditStoryAvatarIconService;
import com.ss.android.ugc.gamora.editor.EditStoryAvatarIconServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes30.dex */
public final class EditShareTopOptionAssem extends UIContentAssem implements EditShareProtocol, InterfaceC1436400nTy {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C19507611Tu.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJ = new C1559260qg8(new C723590SZx(this, C19508011Ty.class, null), checkSupervisorPrepared());
    public LinearLayout LLJI;
    public boolean LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C19508011Ty Ho() {
        return (C19508011Ty) this.LLJ.getValue();
    }

    public final C19507611Tu Jo() {
        return (C19507611Tu) this.LLIZLLLIL.getValue();
    }

    public final int No() {
        return ((Number) this.LLJILJIL.getValue()).intValue();
    }

    public final void So() {
        if (this.LLJIJIL) {
            return;
        }
        LinearLayout linearLayout = this.LLJI;
        View childAt = linearLayout != null ? linearLayout.getChildAt(0) : null;
        if (Intrinsics.LJFF(childAt, this.LLJILLL.getValue()) || Intrinsics.LJFF(childAt, this.LLJILJILJ.getValue())) {
            this.LLJIJIL = true;
            Function0<Unit> function0 = Ho().LLILZLL;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public EditShareTopOptionAssem() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJILJIL = C452501pT.LIZ(enumC452301pR, new AwS573S0100000_29(this, 121));
        this.LLJILJILJ = C452501pT.LIZ(enumC452301pR, new AwS573S0100000_29(this, 124));
        this.LLJILLL = C452501pT.LIZ(enumC452301pR, new AwS573S0100000_29(this, 123));
        this.LLJJ = C452501pT.LIZ(enumC452301pR, new AwS573S0100000_29(this, 120));
        this.LLJJI = C452501pT.LIZ(enumC452301pR, new AwS573S0100000_29(this, 119));
        this.LLJJIII = C452501pT.LIZ(enumC452301pR, new AwS573S0100000_29(this, 122));
    }

    public final void Oo() {
        if (Jo().LLIZLLLIL) {
            Function0<Unit> function0 = Ho().LLILZIL;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Function0<Unit> function02 = Ho().LLILLJJLI;
        if (function02 != null) {
            function02.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.util.EditShareProtocol
    public final void Uc1() {
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (C1428580nHM.LIZ(false)) {
            C0CHQ.LIZ().getPublishService().LJJLJ();
        }
    }

    @Override // X.InterfaceC1436400nTy
    public final void LJIIJ(String str) {
        if (!Intrinsics.LJFF(Ho().LL, str)) {
            return;
        }
        ((InterfaceC332260D0u) this.LLJJIII.getValue()).setValue(EnumC19356610o8.LLILLL);
        TextView textView = (TextView) this.LLJJI.getValue();
        if (textView != null) {
            textView.setText(Lo(0));
        }
    }

    @Override // X.InterfaceC1436400nTy
    public final void LJJJLIIL(String str) {
        if (!Intrinsics.LJFF(Ho().LL, str)) {
            return;
        }
        ((InterfaceC332260D0u) this.LLJJIII.getValue()).setValue(EnumC19356610o8.LL);
    }

    public final String Lo(int i) {
        Context context = getContext();
        if (context != null) {
            return u.LJJIFFI(context.getString(2131832045), "%1$s", String.valueOf(i), false);
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        int i2;
        Drawable drawableLIZ;
        View viewLIZIZ;
        int i3;
        IEditStoryAvatarIconService iEditStoryAvatarIconService;
        int i4;
        int i5;
        int i6;
        EnumC19507811Tw enumC19507811Tw;
        View view2;
        super.onViewCreated(view);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, EditShareProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.assem.EditShareTopOptionAssem$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, EditShareProtocol.class, this);
                    }
                }
            });
        }
        if ((view instanceof LinearLayout) && (linearLayout2 = (LinearLayout) view) != null) {
            C426750GoL.LJIIIZ(linearLayout2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
            linearLayout2.setOrientation(1);
            if (C376670Epl.LIZ()) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(0);
                drawableLIZ = gradientDrawable;
            } else {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
                if (C1418920n1m.LIZ()) {
                    i2 = 10;
                } else {
                    i2 = 8;
                }
                c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2)));
                drawableLIZ = c384050F3z.LIZ(linearLayout2.getContext());
            }
            linearLayout2.setBackground(drawableLIZ);
            if (!C1418920n1m.LIZ()) {
                linearLayout2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            }
            if (Jo().LLILLL) {
                if (Jo().LLILZ) {
                    view2 = (View) this.LLJILJILJ.getValue();
                } else {
                    view2 = (View) this.LLJILLL.getValue();
                }
                linearLayout2.addView(view2);
                So();
            }
            if (Jo().LLILZIL) {
                if (C376670Epl.LIZ() && Jo().LLILZLL) {
                    FrameLayout frameLayout = new FrameLayout(linearLayout2.getContext());
                    C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))));
                    linearLayout2.addView(frameLayout);
                }
                if (C1418920n1m.LIZ()) {
                    if (C297750Bll.LIZ()) {
                        i5 = 2131846766;
                    } else {
                        i5 = 2131846765;
                    }
                    if (C0A1Q.LIZ()) {
                        i6 = R.raw.icon_arrow_up_circle_fill;
                    } else {
                        i6 = R.raw.icon_post;
                    }
                    Context context = linearLayout2.getContext();
                    if (Jo().LLILZLL) {
                        enumC19507811Tw = EnumC19507811Tw.TOP;
                    } else {
                        enumC19507811Tw = EnumC19507811Tw.BOTTOM;
                    }
                    i = 3;
                    viewLIZIZ = Go("post", context, i5, null, i6, enumC19507811Tw);
                    C786410Ut5.I7(new ACListenerS163S0100000_29(this, 51), viewLIZIZ);
                } else {
                    i = 3;
                    Jo();
                    viewLIZIZ = C1179980goO.LIZIZ(linearLayout2, 2131846765, R.raw.icon_post, new AwS608S0100000_29(this, 104));
                }
                linearLayout2.addView(viewLIZIZ);
                if (!C1418920n1m.LIZ()) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewLIZIZ.getLayoutParams();
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    C786410Ut5.W5(viewLIZIZ, marginLayoutParams);
                }
                linearLayout = linearLayout2;
                if (Jo().LLILZLL) {
                    if (C297750Bll.LIZ()) {
                        i3 = 2131844917;
                    } else {
                        i3 = 2131844916;
                    }
                    Context context2 = linearLayout2.getContext();
                    EnumC19507811Tw enumC19507811Tw2 = EnumC19507811Tw.BOTTOM;
                    View viewSd = C786410Ut5.Sd(R.layout.cgn, C786410Ut5.ne(context2), null);
                    if (enumC19507811Tw2 != null && Jo().LLILZIL) {
                        int i7 = C19507711Tv.LIZ[enumC19507811Tw2.ordinal()];
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 != i) {
                                    if (i7 == 4) {
                                        viewSd.setBackground(C800330VaR.LIZIZ(context2, R.drawable.amy));
                                    } else {
                                        throw new C1954807lC();
                                    }
                                } else {
                                    viewSd.setBackground(C800330VaR.LIZIZ(context2, R.drawable.ams));
                                }
                            } else {
                                viewSd.setBackground(C800330VaR.LIZIZ(context2, R.drawable.amv));
                            }
                        } else {
                            viewSd.setBackground(C800330VaR.LIZIZ(context2, R.drawable.an1));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) viewSd.findViewById(R.id.snf);
                    TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.k3j);
                    TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.text);
                    TuxTextView tuxTextView2 = (TuxTextView) viewSd.findViewById(R.id.desc);
                    Object objLIZ = C04TD.LIZ(IEditStoryAvatarIconService.class, false);
                    if (objLIZ != null) {
                        iEditStoryAvatarIconService = (IEditStoryAvatarIconService) objLIZ;
                    } else {
                        if (C04TD.l6 == null) {
                            synchronized (IEditStoryAvatarIconService.class) {
                                if (C04TD.l6 == null) {
                                    C04TD.l6 = new EditStoryAvatarIconServiceImpl();
                                }
                            }
                        }
                        iEditStoryAvatarIconService = C04TD.l6;
                    }
                    viewGroup.addView(iEditStoryAvatarIconService.genStoryAvatarIcon(context2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C418440Gaw.LIZIZ(2)));
                    tuxTextView.setText(context2.getString(i3));
                    if (C376670Epl.LIZ()) {
                        i4 = 42;
                    } else {
                        i4 = 102;
                    }
                    tuxTextView.setTuxFont(i4);
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                    C786410Ut5.I7(new ACListenerS163S0100000_29(this, 52), viewSd);
                    linearLayout2.addView(viewSd);
                    linearLayout = linearLayout2;
                }
            } else {
                i = 3;
                linearLayout = linearLayout2;
            }
        } else {
            i = 3;
            linearLayout = null;
        }
        this.LLJI = linearLayout;
        if (Jo().LLILLL) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C05MK(this, null), i);
        }
        if (C1428580nHM.LIZ(false)) {
            C0CHQ.LIZ().getPublishService().LJJIL(this);
        }
    }

    @Override // X.InterfaceC1436400nTy
    public final void e4(Integer num, String str) {
        if (!Intrinsics.LJFF(Ho().LL, str)) {
            return;
        }
        int iIntValue = 0;
        if (!C1428580nHM.LIZ(false)) {
            return;
        }
        ((InterfaceC332260D0u) this.LLJJIII.getValue()).setValue(EnumC19356610o8.LLILLL);
        TextView textView = (TextView) this.LLJJI.getValue();
        if (textView != null) {
            if (num != null) {
                iIntValue = num.intValue();
            }
            textView.setText(Lo(iIntValue));
        }
    }

    @Override // X.InterfaceC1436400nTy
    public final void z8(int i, String str) {
        if (!Intrinsics.LJFF(Ho().LL, str) || !C1428580nHM.LIZ(false)) {
            return;
        }
        ((InterfaceC332260D0u) this.LLJJIII.getValue()).setValue(EnumC19356610o8.LLILLL);
        TextView textView = (TextView) this.LLJJI.getValue();
        if (textView != null) {
            textView.setText(Lo(i));
        }
    }

    public final View Go(String str, Context context, int i, Integer num, int i2, EnumC19507811Tw enumC19507811Tw) {
        TuxTextView tuxTextView;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        View viewSd = C786410Ut5.Sd(R.layout.cgo, C786410Ut5.ne(context), null);
        if (enumC19507811Tw != null && Jo().LLILZIL) {
            int i5 = C19507711Tv.LIZ[enumC19507811Tw.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            viewSd.setBackground(C800330VaR.LIZIZ(context, R.drawable.amy));
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        viewSd.setBackground(C800330VaR.LIZIZ(context, R.drawable.ams));
                    }
                } else {
                    viewSd.setBackground(C800330VaR.LIZIZ(context, R.drawable.amv));
                }
            } else {
                viewSd.setBackground(C800330VaR.LIZIZ(context, R.drawable.an1));
            }
        }
        TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.k1g);
        View viewFindViewById = viewSd.findViewById(R.id.mk5);
        TuxIconView tuxIconView2 = (TuxIconView) viewSd.findViewById(R.id.k3j);
        TuxTextView tuxTextView2 = (TuxTextView) viewSd.findViewById(R.id.text);
        TuxTextView tuxTextView3 = (TuxTextView) viewSd.findViewById(R.id.desc);
        if (C376670Epl.LIZ()) {
            C426750GoL.LJIIL(viewSd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, 26);
            ViewGroup.LayoutParams layoutParams = tuxTextView2.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            }
        }
        if (C0A1Q.LIZ() && Intrinsics.LJFF(str, "post")) {
            C426750GoL.LJIIL(viewSd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17))), 16);
            ViewGroup.LayoutParams layoutParams2 = tuxTextView2.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            }
            tuxTextView = tuxTextView2;
            C426750GoL.LJIIL(tuxTextView2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 21);
            if (tuxIconView != null) {
                tuxIconView.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                tuxIconView.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                tuxIconView.setIconRes(R.raw.icon_arrow_up_circle_fill);
                tuxIconView.setTintColorRes(R.attr.a1r);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundResource(R.drawable.akz);
            }
        } else {
            tuxTextView = tuxTextView2;
        }
        tuxTextView.setText(context.getString(i));
        if (C376670Epl.LIZ()) {
            i3 = 42;
        } else {
            i3 = 102;
        }
        tuxTextView.setTuxFont(i3);
        tuxIconView.setIconRes(i2);
        if (num != null) {
            tuxTextView3.setText(context.getString(num.intValue()));
            int marginStart = 0;
            C786410Ut5.LLLLZLL(tuxTextView3, 0);
            viewSd.setPadding(viewSd.getPaddingLeft(), viewSd.getPaddingTop(), viewSd.getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            ViewGroup.LayoutParams layoutParams3 = tuxTextView3.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                ViewGroup.LayoutParams layoutParams4 = tuxIconView.getLayoutParams();
                if (layoutParams4 != null) {
                    i4 = layoutParams4.width;
                } else {
                    i4 = 0;
                }
                ViewGroup.LayoutParams layoutParams5 = tuxTextView.getLayoutParams();
                if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                    marginStart = ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginStart();
                }
                marginLayoutParams.setMarginStart(i4 + marginStart);
            }
        } else {
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
        }
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        return viewSd;
    }
}
