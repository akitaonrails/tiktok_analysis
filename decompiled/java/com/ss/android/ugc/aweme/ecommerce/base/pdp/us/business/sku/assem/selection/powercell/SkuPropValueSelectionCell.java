package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.powercell;

import X.C01GW;
import X.C0H9H;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1408710mlJ;
import X.C1408740mlM;
import X.C1749180vcS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C954703oH;
import X.EnumC1338240kve;
import X.InterfaceC1420350n45;
import X.InterfaceC1891350zJl;
import Y.ACListenerS125S0200000_22;
import Y.ATListenerS455S0100000_22;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class SkuPropValueSelectionCell extends PowerCell<C1408710mlJ> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 69));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 70));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 74));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 73));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 72));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 71));

    public final TuxTextView S5() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public final FrameLayout T5() {
        return (FrameLayout) this.LLILLL.getValue();
    }

    public final void I5(C1408710mlJ c1408710mlJ) {
        int iLJIIZILJ;
        int iLJIIJ;
        C1749180vcS c1749180vcS = C1749180vcS.LIZ;
        Context context = this.itemView.getContext();
        TuxTextView tuxTextView = (TuxTextView) this.LLILZIL.getValue();
        SalePropTag salePropTag = c1408710mlJ.LL.hotTag;
        int paddingTop = T5().getPaddingTop();
        int paddingRight = T5().getPaddingRight();
        InterfaceC1420350n45 interfaceC1420350n45 = c1408710mlJ.LLJILJIL;
        if (interfaceC1420350n45 != null) {
            iLJIIZILJ = interfaceC1420350n45.LJIIZILJ();
        } else {
            iLJIIZILJ = 0;
        }
        InterfaceC1420350n45 interfaceC1420350n452 = c1408710mlJ.LLJILJIL;
        if (interfaceC1420350n452 != null) {
            iLJIIJ = interfaceC1420350n452.LJIIJ();
        } else {
            iLJIIJ = 0;
        }
        c1749180vcS.getClass();
        C1749180vcS.LIZ(context, tuxTextView, salePropTag, paddingTop, paddingRight, iLJIIZILJ, iLJIIJ);
    }

    public final void L5(C1408710mlJ c1408710mlJ) {
        int iIntValue;
        Integer viewHeight;
        Integer viewWidth;
        Image image = c1408710mlJ.LLILZLL;
        int iIntValue2 = 40;
        if (image != null && (viewWidth = image.getViewWidth()) != null) {
            iIntValue = viewWidth.intValue();
        } else {
            iIntValue = 40;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        if (image != null && (viewHeight = image.getViewHeight()) != null) {
            iIntValue2 = viewHeight.intValue();
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
        ViewGroup.LayoutParams layoutParams = ((View) this.LLILZ.getValue()).getLayoutParams();
        if (layoutParams.width != iLIZIZ || layoutParams.height != iLIZIZ2) {
            layoutParams.width = iLIZIZ;
            layoutParams.height = iLIZIZ2;
            C786410Ut5.a6((FrameLayout) this.LLILZ.getValue(), layoutParams);
        }
        if (image != null) {
            C786410Ut5.LJLLLLLL(0, (View) this.LLILZ.getValue());
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LJ = C1326790kdB.LJ(image);
            c1331670kl3LJ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJ.LJJI = C1326790kdB.LIZJ;
            c1331670kl3LJ.LJJIIZI(C1308910kAL.LJ(R.attr.bv, this.itemView.getContext()));
            c1331670kl3LJ.LJJ((SmartImageView) this.LL.getValue());
            C786410Ut5.h3(c1331670kl3LJ);
            return;
        }
        C786410Ut5.LJLLLLLL(8, (View) this.LLILZ.getValue());
    }

    public final void N5(C1408710mlJ c1408710mlJ) {
        C384050F3z c384050F3zLJIJJ;
        float f;
        InterfaceC1420350n45 interfaceC1420350n45 = c1408710mlJ.LLJILJIL;
        if (interfaceC1420350n45 == null) {
            return;
        }
        if (c1408710mlJ.LLILLJJLI) {
            if (c1408710mlJ.LLILLL) {
                c384050F3zLJIJJ = interfaceC1420350n45.LJJ();
            } else {
                c384050F3zLJIJJ = interfaceC1420350n45.LJIIJJI();
            }
        } else if (c1408710mlJ.LLILLL) {
            c384050F3zLJIJJ = interfaceC1420350n45.LJIJJLI();
        } else {
            c384050F3zLJIJJ = interfaceC1420350n45.LJIJJ();
        }
        T5().setBackground(c384050F3zLJIJJ.LIZ(this.itemView.getContext()));
        int i = 0;
        S5().getPaint().setFlags(0);
        TuxTextView tuxTextViewS5 = S5();
        interfaceC1420350n45.LIZIZ();
        tuxTextViewS5.setTuxFont(81);
        if (c1408710mlJ.LLILLJJLI) {
            if (c1408710mlJ.LLILLL) {
                Context context = this.itemView.getContext();
                interfaceC1420350n45.LJIIIZ();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ != null) {
                    S5().setTextColor(numLIZJ.intValue());
                }
            } else {
                Context context2 = this.itemView.getContext();
                interfaceC1420350n45.LJFF();
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1i, context2);
                if (numLIZJ2 != null) {
                    S5().setTextColor(numLIZJ2.intValue());
                }
                S5().getPaint().setFlags(16);
            }
        } else if (c1408710mlJ.LLILLL) {
            Context context3 = this.itemView.getContext();
            interfaceC1420350n45.LJIL();
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context3);
            if (numLIZJ3 != null) {
                S5().setTextColor(numLIZJ3.intValue());
            }
        } else {
            Context context4 = this.itemView.getContext();
            interfaceC1420350n45.LJI();
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1h, context4);
            if (numLIZJ4 != null) {
                S5().setTextColor(numLIZJ4.intValue());
            }
            S5().getPaint().setFlags(16);
        }
        if (c1408710mlJ.LLILZLL != null) {
            SmartImageView smartImageView = (SmartImageView) this.LL.getValue();
            if (c1408710mlJ.LLILLL) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            C786410Ut5.u5(smartImageView, f);
            View view = (View) this.LLILZLL.getValue();
            if (!(!c1408710mlJ.LLILLL)) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        S5().getPaint().setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(X.C1408710mlJ r7) {
        /*
            r6 = this;
            com.bytedance.goda.v2.model.dto.GodaV2Style r0 = r7.LLIZ
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L24
            java.util.ArrayList<java.lang.Float> r0 = r0.margin
            if (r0 == 0) goto L24
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r2, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L83
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r1 = X.C814420VxA.LIZIZ(r0)
        L1a:
            android.widget.FrameLayout r0 = r6.T5()
            android.view.View r0 = X.C0H9H.LIZLLL(r1, r0)
            if (r0 != 0) goto L2b
        L24:
            android.widget.FrameLayout r0 = r6.T5()
            X.C0H9H.LIZLLL(r4, r0)
        L2b:
            com.bytedance.goda.v2.model.dto.GodaV2Style r0 = r7.LLIZ
            if (r0 == 0) goto L85
            java.util.ArrayList<java.lang.Float> r5 = r0.padding
            if (r5 == 0) goto L85
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r4, r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L81
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r3 = X.C814420VxA.LIZIZ(r0)
        L43:
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r2, r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L7f
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r2 = X.C814420VxA.LIZIZ(r0)
        L53:
            r0 = 2
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L7d
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r1 = X.C814420VxA.LIZIZ(r0)
        L64:
            r0 = 3
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L75
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r4 = X.C814420VxA.LIZIZ(r0)
        L75:
            android.widget.FrameLayout r0 = r6.T5()
            r0.setPadding(r4, r3, r2, r1)
            return
        L7d:
            r1 = 0
            goto L64
        L7f:
            r2 = 0
            goto L53
        L81:
            r3 = 0
            goto L43
        L83:
            r1 = 0
            goto L1a
        L85:
            android.widget.FrameLayout r0 = r6.T5()
            r0.setPadding(r4, r4, r4, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.powercell.SkuPropValueSelectionCell.P5(X.0mlJ):void");
    }

    public final void R5(C1408710mlJ c1408710mlJ) {
        int i;
        int i2;
        int iIntValue;
        String str = c1408710mlJ.LLIZLLLIL;
        TuxTextView tuxTextViewS5 = S5();
        boolean z = true;
        if (str != null) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextViewS5);
        if (str != null) {
            S5().setText(str);
        }
        if (c1408710mlJ.LLILZLL != null) {
            TuxTextView tuxTextViewS52 = S5();
            Integer viewWidth = c1408710mlJ.LLILZLL.getViewWidth();
            if (viewWidth != null) {
                iIntValue = viewWidth.intValue();
            } else {
                iIntValue = 40;
            }
            tuxTextViewS52.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))));
        } else {
            S5().setMaxWidth(Integer.MAX_VALUE);
        }
        if (c1408710mlJ.LLILZLL == null || str == null) {
            z = false;
        }
        View view = (View) this.LLILZ.getValue();
        if (z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2)), view);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C01GW c01gw = C954703oH.LIZ;
        return C954703oH.LIZ(viewGroup.getContext(), R.layout.azb, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C1408710mlJ c1408710mlJ = (C1408710mlJ) interfaceC1891350zJl;
        boolean z7 = true;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            for (Object obj : list) {
                if (obj != null && !(obj instanceof C1408740mlM)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof C1408740mlM) {
                arrayList.add(obj2);
            }
        }
        if (!list.isEmpty() && !z && !arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((C1408740mlM) it2.next()).LIZ) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            } else {
                z2 = false;
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((C1408740mlM) it3.next()).LIZIZ) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
            } else {
                z3 = false;
            }
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    if (((C1408740mlM) it4.next()).LIZJ) {
                        z4 = true;
                        break;
                    }
                }
                z4 = false;
            } else {
                z4 = false;
            }
            if (!arrayList.isEmpty()) {
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    if (((C1408740mlM) it5.next()).LIZLLL) {
                        z5 = true;
                        break;
                    }
                }
                z5 = false;
            } else {
                z5 = false;
            }
            if (!arrayList.isEmpty()) {
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    if (((C1408740mlM) it6.next()).LJ) {
                        z6 = true;
                        break;
                    }
                }
                z6 = false;
            } else {
                z6 = false;
            }
            if (!arrayList.isEmpty()) {
                Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    if (((C1408740mlM) it7.next()).LJFF) {
                        break;
                    }
                }
                z7 = false;
            } else {
                z7 = false;
            }
            C786410Ut5.I7(new ACListenerS125S0200000_22(this, c1408710mlJ, 0), this.itemView);
            this.itemView.setOnTouchListener(new ATListenerS455S0100000_22(c1408710mlJ, 0));
            if (z7) {
                P5(c1408710mlJ);
            }
            if (z4) {
                R5(c1408710mlJ);
            }
            if (z5) {
                L5(c1408710mlJ);
            }
            if (z2 || z3) {
                N5(c1408710mlJ);
            }
            if (z6) {
                I5(c1408710mlJ);
                return;
            }
            return;
        }
        C786410Ut5.I7(new ACListenerS125S0200000_22(this, c1408710mlJ, 0), this.itemView);
        this.itemView.setOnTouchListener(new ATListenerS455S0100000_22(c1408710mlJ, 0));
        P5(c1408710mlJ);
        R5(c1408710mlJ);
        L5(c1408710mlJ);
        N5(c1408710mlJ);
        I5(c1408710mlJ);
        Function1<? super C1408710mlJ, Unit> function1 = c1408710mlJ.LLJ;
        if (function1 == null) {
            return;
        }
        function1.invoke(c1408710mlJ);
    }
}
