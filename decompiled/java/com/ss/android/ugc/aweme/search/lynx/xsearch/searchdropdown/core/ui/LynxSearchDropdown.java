package com.ss.android.ugc.aweme.search.lynx.xsearch.searchdropdown.core.ui;

import X.C08A4;
import X.C1297780jsO;
import X.C1299120juY;
import X.C1308910kAL;
import X.C1313150kHB;
import X.C1619980sG4;
import X.C786410Ut5;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import X.InterfaceC1313090kH5;
import Y.AAListenerS324S0100000_13;
import Y.AUListenerS253S0100000_2;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxSearchDropdown extends UISimpleView<AndroidView> {
    public final SearchDropdownForLynx LL;

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isUserInteractionEnabled() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final int getChildCount() {
        return this.LL.getChildCount();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final List<LynxBaseUI> getChildren() {
        return this.LL.getChildren();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAnimationUpdated() {
        this.LL.onAnimationUpdated();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDetach() {
        this.LL.onDetach();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        super.layout();
        this.LL.layout();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        super.measure();
        this.LL.measure();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final LynxUI<?> getTransitionUI() {
        return this.LL;
    }

    public LynxSearchDropdown(s sVar) {
        super(sVar);
        this.LL = new SearchDropdownForLynx(sVar, this);
        super.insertChild(this.LL, 0);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new AndroidView(context);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final LynxBaseUI getChildAt(int i) {
        return this.LL.getChildAt(i);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void insertView(LynxUI<?> lynxUI) {
        this.LL.insertView(lynxUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        this.LL.removeChild(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void removeView(LynxBaseUI lynxBaseUI) {
        this.LL.removeView(lynxBaseUI);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    @X.InterfaceC1312540kGC(name = "animated")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAnimated(X.InterfaceC1298070jsr r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.search.lynx.xsearch.searchdropdown.core.ui.SearchDropdownForLynx r2 = r3.LL
            r2.getClass()
            com.lynx.react.bridge.ReadableType r0 = r4.getType()
            if (r0 == 0) goto L29
            int[] r1 = X.C1297780jsO.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L20
            r0 = 2
            if (r1 != r0) goto L29
            boolean r0 = r4.asBoolean()
        L1d:
            r2.LLILLJJLI = r0
            return
        L20:
            java.lang.String r0 = r4.asString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            goto L1d
        L29:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.searchdropdown.core.ui.LynxSearchDropdown.setAnimated(X.0jsr):void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setBackgroundColor(int i) {
        this.LL.setBackgroundColor(i);
    }

    @InterfaceC1312540kGC(name = "duration")
    public final void setDuration(InterfaceC1298070jsr interfaceC1298070jsr) {
        long jAsLong;
        SearchDropdownForLynx searchDropdownForLynx = this.LL;
        searchDropdownForLynx.getClass();
        ReadableType type = interfaceC1298070jsr.getType();
        if (type != null) {
            int i = C1297780jsO.LIZ[type.ordinal()];
            if (i != 1) {
                if (i != 3) {
                    if (i == 4) {
                        jAsLong = interfaceC1298070jsr.asInt();
                    } else {
                        return;
                    }
                } else {
                    jAsLong = interfaceC1298070jsr.asLong();
                }
            } else {
                jAsLong = CastLongProtector.parseLong(interfaceC1298070jsr.asString());
            }
            if (jAsLong > 0) {
                searchDropdownForLynx.LLILLL = jAsLong;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        this.LL.setEvents(map);
    }

    @InterfaceC1312540kGC(name = "masked")
    public final void setMasked(boolean z) {
        this.LL.getClass();
        C1313150kHB.LJ = z;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setParent(InterfaceC1313090kH5 interfaceC1313090kH5) {
        super.setParent(interfaceC1313090kH5);
        this.LL.setParent(interfaceC1313090kH5);
    }

    @InterfaceC1312540kGC(name = "visible")
    public final void setVisible(InterfaceC1298070jsr interfaceC1298070jsr) {
        int i;
        boolean zAsBoolean;
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        int iIntValue;
        int iIntValue2;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Context context;
        Integer numLIZJ;
        ColorDrawable colorDrawable;
        Integer numValueOf;
        View view2;
        ViewGroup viewGroup3;
        View view3;
        ViewGroup viewGroup4;
        int iIntValue3;
        int iIntValue4;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        Context context2;
        Integer numLIZJ2;
        Context context3;
        Integer numLIZJ3;
        View view4;
        View viewFindViewById;
        ViewGroup viewGroup5;
        SearchDropdownForLynx searchDropdownForLynx = this.LL;
        searchDropdownForLynx.getClass();
        ReadableType type = interfaceC1298070jsr.getType();
        if (type == null) {
            i = -1;
        } else {
            i = C1297780jsO.LIZ[type.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                zAsBoolean = false;
            } else {
                zAsBoolean = interfaceC1298070jsr.asBoolean();
            }
        } else {
            zAsBoolean = Boolean.parseBoolean(interfaceC1298070jsr.asString());
        }
        View viewFindViewById2 = null;
        if (zAsBoolean) {
            C1313150kHB.LIZ = searchDropdownForLynx.LLILZIL;
            Fragment fragment = C1313150kHB.LIZIZ;
            if (fragment != null) {
                View view5 = fragment.getView();
                if (view5 != null) {
                    viewFindViewById = view5.findViewById(R.id.i_2);
                } else {
                    viewFindViewById = null;
                }
                if ((viewFindViewById instanceof ViewGroup) && (viewGroup5 = (ViewGroup) viewFindViewById) != null) {
                    C786410Ut5.LJJJJI(viewGroup5);
                    viewGroup5.addView(C1313150kHB.LIZ, -2, -2);
                }
            }
            if (searchDropdownForLynx.LLILLJJLI) {
                long j = searchDropdownForLynx.LLILLL;
                Fragment fragment2 = C1313150kHB.LIZIZ;
                if (fragment2 != null && (view4 = fragment2.getView()) != null) {
                    viewFindViewById2 = view4.findViewById(R.id.i_2);
                }
                if ((viewFindViewById2 instanceof ViewGroup) && (viewGroup4 = (ViewGroup) viewFindViewById2) != null && C08A4.LIZ(Integer.valueOf(viewGroup4.getChildCount()))) {
                    View childAt = viewGroup4.getChildAt(0);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams3.topMargin = -C1313150kHB.LIZJ;
                        C786410Ut5.W5(childAt, marginLayoutParams3);
                        RecyclerView recyclerView = C1313150kHB.LIZLLL;
                        if (recyclerView != null && (context3 = recyclerView.getContext()) != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.uk, context3)) != null) {
                            iIntValue3 = numLIZJ3.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        RecyclerView recyclerView2 = C1313150kHB.LIZLLL;
                        if (recyclerView2 != null && (context2 = recyclerView2.getContext()) != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.e4, context2)) != null) {
                            iIntValue4 = numLIZJ2.intValue();
                        } else {
                            iIntValue4 = 0;
                        }
                        C786410Ut5.LJLZ(0, viewGroup4);
                        int[] iArr = new int[2];
                        ViewGroup.LayoutParams layoutParams2 = viewGroup4.getChildAt(0).getLayoutParams();
                        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                            i3 = marginLayoutParams2.topMargin;
                        } else {
                            i3 = 0;
                        }
                        iArr[0] = i3;
                        iArr[1] = 0;
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
                        valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(viewGroup4, 27));
                        valueAnimatorOfInt.setDuration(j);
                        valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIILIIL());
                        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(viewGroup4, "backgroundColor", iIntValue3, iIntValue4);
                        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
                        objectAnimatorOfInt.setDuration(j);
                        objectAnimatorOfInt.setInterpolator(C1619980sG4.LJIILIIL());
                        AnimatorSet animatorSet = new AnimatorSet();
                        if (C1313150kHB.LJ) {
                            animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfInt);
                        } else {
                            animatorSet.play(valueAnimatorOfInt);
                        }
                        animatorSet.start();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                return;
            }
            Fragment fragment3 = C1313150kHB.LIZIZ;
            if (fragment3 != null && (view3 = fragment3.getView()) != null) {
                viewFindViewById2 = view3.findViewById(R.id.i_2);
            }
            if (!(viewFindViewById2 instanceof ViewGroup) || (viewGroup3 = (ViewGroup) viewFindViewById2) == null) {
                return;
            }
            C786410Ut5.LJLZ(0, viewGroup3);
            return;
        }
        if (searchDropdownForLynx.LLILLJJLI) {
            long j2 = searchDropdownForLynx.LLILLL;
            Fragment fragment4 = C1313150kHB.LIZIZ;
            if (fragment4 != null && (view2 = fragment4.getView()) != null) {
                viewFindViewById2 = view2.findViewById(R.id.i_2);
            }
            if (!(viewFindViewById2 instanceof ViewGroup) || (viewGroup2 = (ViewGroup) viewFindViewById2) == null) {
                return;
            }
            Drawable background = viewGroup2.getBackground();
            if ((background instanceof ColorDrawable) && (colorDrawable = (ColorDrawable) background) != null && (numValueOf = Integer.valueOf(colorDrawable.getColor())) != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            RecyclerView recyclerView3 = C1313150kHB.LIZLLL;
            if (recyclerView3 != null && (context = recyclerView3.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            if (!C08A4.LIZ(Integer.valueOf(viewGroup2.getChildCount()))) {
                return;
            }
            int[] iArr2 = new int[2];
            ViewGroup.LayoutParams layoutParams3 = viewGroup2.getChildAt(0).getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i2 = marginLayoutParams.topMargin;
            } else {
                i2 = 0;
            }
            iArr2[0] = i2;
            iArr2[1] = -C1313150kHB.LIZJ;
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(iArr2);
            valueAnimatorOfInt2.addUpdateListener(new AUListenerS253S0100000_2(viewGroup2, 26));
            valueAnimatorOfInt2.addListener(new AAListenerS324S0100000_13(viewGroup2, 5));
            valueAnimatorOfInt2.setDuration(j2);
            valueAnimatorOfInt2.setInterpolator(C1619980sG4.LIZLLL());
            ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(viewGroup2, "backgroundColor", iIntValue, iIntValue2);
            objectAnimatorOfInt2.setEvaluator(new ArgbEvaluator());
            objectAnimatorOfInt2.setDuration(j2);
            objectAnimatorOfInt2.setInterpolator(C1619980sG4.LIZLLL());
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (C1313150kHB.LJ) {
                animatorSet2.playTogether(valueAnimatorOfInt2, objectAnimatorOfInt2);
            } else {
                animatorSet2.play(valueAnimatorOfInt2);
            }
            animatorSet2.start();
            return;
        }
        Fragment fragment5 = C1313150kHB.LIZIZ;
        if (fragment5 != null && (view = fragment5.getView()) != null) {
            viewFindViewById2 = view.findViewById(R.id.i_2);
        }
        if (!(viewFindViewById2 instanceof ViewGroup) || (viewGroup = (ViewGroup) viewFindViewById2) == null) {
            return;
        }
        C786410Ut5.LJLZ(8, viewGroup);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        this.LL.updateExtraData(obj);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        super.updateLayoutInfo(lynxBaseUI);
        this.LL.updateLayoutInfo(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        this.LL.insertChild(lynxBaseUI, i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setSign(int i, String str) {
        super.setSign(i, str);
        this.LL.setSign(i, str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
        C1313150kHB.LIZJ = i4;
        this.LL.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
