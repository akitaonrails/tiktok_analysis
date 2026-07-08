package com.bytedance.tux.sheet.actionsheet;

import X.C098200Yq;
import X.C1247510iZJ;
import X.C1247520iZK;
import X.C1247530iZL;
import X.C1388190mED;
import X.C1397760mTe;
import X.C13LP;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20094413jq;
import X.C20094813ju;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427690Gpr;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1397840mTm;
import Y.ACListenerS119S0200000_16;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS104S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.BaseSheet;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class TuxActionSheet extends BaseSheet {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs4PDd9Oy0pLDt9KSHELIOSY4ICA9Oy0pLDt9HDA0CCwnISoiGic2LTE=";
    public CharSequence LLJJIJI;
    public Integer LLJJIJIIJIL;
    public String LLJJJIL;
    public Integer LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final List<List<C1247520iZK<?>>> LLJJIII = new ArrayList();
    public int LLJJIJIL = -1;
    public int LLJJJ = -1;

    @Override // com.bytedance.tux.sheet.BaseSheet
    public final int NR() {
        return R.attr.xc;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS104S0100000_4(this, 9));
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public static CharSequence VR(Context context, CharSequence charSequence, Integer num) {
        if (charSequence != null) {
            return charSequence;
        }
        if (num != null) {
            return context.getResources().getString(num.intValue());
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.19GS] */
    /* JADX WARN: Type inference failed for: r1v21 */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int i;
        int i2;
        View view;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        boolean z4;
        float f;
        ?? r1;
        Context context = getContext();
        View viewTd = null;
        if (context == null) {
            view = null;
        } else {
            Integer num = this.LLILZLL;
            if (num != null) {
                context = C1388190mED.LJ(num.intValue(), context);
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxActionSheet, R.attr.xc, 0);
            int i6 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxActionSheet__tux_actionSheetTitleFont, 0);
            int i7 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxActionSheet__tux_actionSheetTitleColor, 0);
            int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxActionSheet__tux_actionSheetDisabledColor, 0);
            int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxActionSheet__tux_actionSheetDestructiveColor, 0);
            int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxActionSheet__tux_actionSheetPrimaryColor, 0);
            int i8 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxActionSheet__tux_actionSheetActionFont, 0);
            int color4 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxActionSheet__tux_actionSheetActionSeparatorColor, 0);
            int color5 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxActionSheet__tux_actionSheetActionGroupSeparatorColor, 0);
            int i9 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxActionSheet__tux_actionSheetTextActionCancelFont, 0);
            int i10 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxActionSheet__tux_actionSheetTextActionCancelColor, 0);
            String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxActionSheet__tux_actionSheetCancelText);
            int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxActionSheet__tux_actionSheetTextSubtitleFont, 0);
            int color6 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxActionSheet__tux_actionSheetTextSubtitleColor, 0);
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxActionSheet__tux_actionSheetTitlePaddingVertical, C418440Gaw.LIZIZ(12));
            int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxActionSheet__tux_actionSheetTextActionPaddingVertical, C418440Gaw.LIZIZ(12));
            float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxActionSheet__tux_actionSheetActionGroupSeparatorHeight, C418440Gaw.LIZIZ(8));
            typedArrayObtainStyledAttributes.recycle();
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.fu, viewGroup, false);
            RadiusLayout radiusLayout = (RadiusLayout) viewTd.findViewById(R.id.spp);
            float f2 = BaseSheet.LLJJI;
            radiusLayout.LIZ(f2, f2, 0.0f, 0.0f);
            TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.a5_);
            CharSequence charSequenceVR = VR(context, this.LLJJIJI, this.LLJJIJIIJIL);
            tuxTextView.setText(charSequenceVR);
            if (charSequenceVR.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
            if (z) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            tuxTextView.setImportantForAccessibility(i2);
            tuxTextView.setTuxFont(i6);
            tuxTextView.setTextColor(i7);
            C426750GoL.LJIIL(tuxTextView, null, Integer.valueOf(dimension), null, Integer.valueOf(dimension), 21);
            int i12 = this.LLJJIJIL;
            if (i12 > 0) {
                tuxTextView.setMaxLines(i12);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            }
            ViewGroup viewGroup2 = (ViewGroup) viewTd.findViewById(R.id.a59);
            int size = ((ArrayList) this.LLJJIII).size();
            if (!z && !this.LLJJJJJIL) {
                C426750GoL.LJIIL(viewGroup2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, 29);
            }
            Iterator it2 = ((ArrayList) this.LLJJIII).iterator();
            int size2 = 0;
            while (it2.hasNext()) {
                size2 += ((List) it2.next()).size();
            }
            int i13 = 0;
            for (Object obj : (ArrayList) this.LLJJIII) {
                int i14 = i13 + 1;
                if (i13 >= 0) {
                    List list = (List) obj;
                    int size3 = list.size();
                    int i15 = 0;
                    for (Object obj2 : list) {
                        int i16 = i15 + 1;
                        if (i15 >= 0) {
                            C1247520iZK c1247520iZK = (C1247520iZK) obj2;
                            if (c1247520iZK instanceof C1247530iZL) {
                                i4 = R.layout.fv;
                            } else {
                                i4 = R.layout.fw;
                            }
                            View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(context), i4, viewGroup2, false);
                            ArrayList arrayList = new ArrayList();
                            C427690Gpr.LJ(viewTd2, 0.0f);
                            C786410Ut5.I7(new ACListenerS119S0200000_16(c1247520iZK, this, 1), viewTd2);
                            C426750GoL.LJIIL(viewTd2, null, Integer.valueOf(dimension2), null, Integer.valueOf(dimension2), 21);
                            if (!c1247520iZK.LIZLLL) {
                                i5 = color;
                            } else if (c1247520iZK.LIZJ == 1) {
                                i5 = color2;
                            } else {
                                i5 = color3;
                            }
                            TuxTextView tuxTextView2 = (TuxTextView) viewTd2.findViewById(R.id.a4h);
                            if (tuxTextView2 != null) {
                                tuxTextView2.setText(VR(context, c1247520iZK.LIZ, c1247520iZK.LIZIZ));
                                arrayList.add(tuxTextView2.getText());
                                tuxTextView2.setTextDirection(5);
                                tuxTextView2.setTuxFont(i8);
                                tuxTextView2.setTextColor(i5);
                                int i17 = this.LLJJJ;
                                if (i17 > 0) {
                                    tuxTextView2.setMaxLines(i17);
                                    tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                                }
                            }
                            boolean z5 = c1247520iZK instanceof C1247530iZL;
                            if (z5) {
                                TuxIconView tuxIconView = (TuxIconView) viewTd2.findViewById(R.id.a4i);
                                C1247530iZL c1247530iZL = (C1247530iZL) c1247520iZK;
                                Integer num2 = c1247530iZL.LJFF;
                                Function1<? super TuxIconView, Unit> function1 = c1247530iZL.LJI;
                                if (num2 != null) {
                                    tuxIconView.setIconRes(num2.intValue());
                                    tuxIconView.setTintColor(i5);
                                } else if (function1 != null) {
                                    tuxIconView.LIZ();
                                    function1.invoke(tuxIconView);
                                }
                            } else if (c1247520iZK instanceof C1247510iZJ) {
                                TuxTextView tuxTextView3 = (TuxTextView) viewTd2.findViewById(R.id.a4j);
                                C1247510iZJ c1247510iZJ = (C1247510iZJ) c1247520iZK;
                                CharSequence charSequenceVR2 = VR(context, c1247510iZJ.LJFF, c1247510iZJ.LJI);
                                if (charSequenceVR2.length() > 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    C786410Ut5.LLLLZLL(tuxTextView3, 0);
                                    tuxTextView3.setText(charSequenceVR2);
                                    arrayList.add(charSequenceVR2);
                                    tuxTextView3.setTuxFont(i11);
                                    tuxTextView3.setTextColor(color6);
                                } else {
                                    C786410Ut5.LLLLZLL(tuxTextView3, 8);
                                }
                            }
                            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63);
                            int i18 = C20094413jq.LJIIZILJ;
                            C1397760mTe c1397760mTe = new C1397760mTe();
                            c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
                            c1397760mTe.LIZJ = null;
                            c1397760mTe.LIZ = strLJJLIIIJ;
                            C20094813ju.LIZ(viewTd2, c1397760mTe.LIZ());
                            viewGroup2.addView(viewTd2);
                            if (i15 < size3 - 1) {
                                if (z5) {
                                    f = 16.0f;
                                } else {
                                    f = 0.0f;
                                }
                                UR(viewGroup2, C418440Gaw.LIZIZ(Double.valueOf(0.5d)), color4, f);
                            }
                            i15 = i16;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    if (i13 < size - 1) {
                        UR(viewGroup2, dimension3, color5, 0.0f);
                    }
                    i13 = i14;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (this.LLJJJJLIIL) {
                if (size2 <= 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    UR(viewGroup2, C418440Gaw.LIZIZ(Double.valueOf(0.5d)), color4, 16.0f);
                }
                if (z3) {
                    i3 = 52;
                } else {
                    i3 = 16;
                }
                C426750GoL.LJIIL(viewGroup2, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)))), 23);
            }
            if (this.LLJJJJJIL) {
                UR(viewGroup2, dimension3, color5, 0.0f);
                CharSequence charSequenceVR3 = VR(context, this.LLJJJIL, this.LLJJJJ);
                if (charSequenceVR3.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    charSequenceVR3 = VR(context, strXd, Integer.valueOf(android.R.string.cancel));
                }
                View viewTd3 = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fw, viewGroup2, false);
                C427690Gpr.LJ(viewTd3, 0.0f);
                C786410Ut5.I7(new ACListenerS142S0100000_7(this, 122), viewTd3);
                int i19 = C20094413jq.LJIIZILJ;
                C1397760mTe c1397760mTe2 = new C1397760mTe();
                c1397760mTe2.LIZIZ = EnumC1397840mTm.BUTTON;
                view = null;
                c1397760mTe2.LIZJ = null;
                c1397760mTe2.LIZ = charSequenceVR3;
                C20094813ju.LIZ(viewTd3, c1397760mTe2.LIZ());
                C426750GoL.LJIIL(viewTd3, null, Integer.valueOf(dimension2), null, Integer.valueOf(dimension2), 21);
                TuxTextView tuxTextView4 = (TuxTextView) viewTd3.findViewById(R.id.a4h);
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(charSequenceVR3);
                    tuxTextView4.setContentDescription(tuxTextView4.getText());
                    tuxTextView4.setTuxFont(i9);
                    tuxTextView4.setTextColor(i10);
                }
                viewGroup2.addView(viewTd3);
            } else {
                view = null;
            }
        }
        if (!(viewTd instanceof View)) {
            viewTd = view;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    r1 = (C19GS) activity;
                } else {
                    r1 = view;
                }
                C1685300txQ.LIZ(r1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    public static void UR(ViewGroup viewGroup, float f, int i, float f2) {
        View frameLayout = new FrameLayout(viewGroup.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, (int) f);
        if (f2 > 0.0f) {
            marginLayoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f2)));
            marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f2)));
        }
        frameLayout.setBackgroundColor(i);
        viewGroup.addView(frameLayout, marginLayoutParams);
    }
}
