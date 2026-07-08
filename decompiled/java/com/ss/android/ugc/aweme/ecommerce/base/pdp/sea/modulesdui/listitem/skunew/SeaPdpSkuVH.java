package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.skunew;

import X.C01GW;
import X.C036I;
import X.C0H9H;
import X.C10515049h;
import X.C1071004Gu;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1748720vbi;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C259800zU;
import X.C418440Gaw;
import X.C430110Gtl;
import X.C452501pT;
import X.C786410Ut5;
import X.C810103El;
import X.C814420VxA;
import X.C954203oC;
import X.C960203pA;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpSkuVH extends PdpHolder<C954203oC> {
    public static final int LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
    public LinearLayout LLJJIJIL;
    public TuxTextView LLJJJ;
    public final Context LLJJJIL;
    public final C01GW LLJJJJ;
    public SaleProp LLJJJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final TuxTextView c6() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.xpx) : null;
            this.LLJJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaPdpSkuVH(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(0, C1755600vmo.LIZ(R.layout.atj, context, viewGroup, false, false), true);
        this.LLJJJIL = viewGroup.getContext();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 79));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [X.03oD] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.03El] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, android.view.View] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        String str;
        SaleProp saleProp;
        List<SalePropValue> list;
        TuxTextView tuxTextViewC6;
        String strLJJLIIIJ;
        int i;
        ?? r5;
        List<SkuItem> list2;
        SaleProp next;
        C954203oC c954203oC = (C954203oC) obj;
        SkcInfo skcInfo = c954203oC.LIZJ;
        String str2 = null;
        if (skcInfo != null) {
            str = skcInfo.skcPropertyId;
        } else {
            str = null;
        }
        boolean z = false;
        if (str != null && !a0.LJJJIL(str)) {
            Iterator<SaleProp> it2 = c954203oC.LIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (!Intrinsics.LJFF(next.propId, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            saleProp = next;
        } else {
            saleProp = (SaleProp) C13LP.LJJJLL(c954203oC.LIZ);
        }
        if (saleProp != null) {
            if (!Intrinsics.LJFF(this.LLJJJJJIL, saleProp)) {
                ProductPackStruct productPackStruct = ((SeaPdpViewModel) this.LLJJJJ.getValue()).LLJIJIL;
                if (productPackStruct != null && (list2 = productPackStruct.skus) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<SkuItem> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(it3.next().skuId);
                    }
                    strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                } else {
                    strLJJLIIIJ = null;
                }
                C1748720vbi.LIZLLL(this.itemView, new C10515049h(), new AwS115S1100000_1(saleProp, strLJJLIIIJ, 29));
                this.LLJJJJJIL = saleProp;
                View viewFindViewById = this.LLJJIJIL;
                if (viewFindViewById == null) {
                    View viewLJJIJL = LJJIJL();
                    if (viewLJJIJL != null) {
                        viewFindViewById = viewLJJIJL.findViewById(R.id.etn);
                    } else {
                        viewFindViewById = null;
                    }
                    this.LLJJIJIL = (LinearLayout) viewFindViewById;
                }
                C786410Ut5.LJJJJJL((LinearLayout) viewFindViewById);
                Boolean bool = saleProp.hasImage;
                if (bool != null && bool.booleanValue()) {
                    i = 6;
                } else {
                    i = 4;
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                C259800zU c259800zU = new C259800zU();
                List<SalePropValue> list3 = saleProp.salePropValueList;
                if (list3 == null) {
                    list3 = C13BV.INSTANCE;
                }
                int i2 = 0;
                int measuredWidth = 0;
                for (SalePropValue salePropValue : list3) {
                    int i3 = i2 + 1;
                    if (measuredWidth > LLJJJJLIIL) {
                        break;
                    }
                    if (salePropValue.image != null) {
                        final Context context = this.LLJJJIL;
                        ?? r52 = new FrameLayout(context) { // from class: X.03oD
                            public final SmartImageView LL;
                            public final C01GW LLILLJJLI;

                            private final C1331730kl9 getDisplayOption() {
                                return (C1331730kl9) this.LLILLJJLI.getValue();
                            }

                            public final SmartImageView getImageView() {
                                return this.LL;
                            }

                            {
                                super(context);
                                SmartImageView smartImageView = new SmartImageView(context);
                                this.LL = smartImageView;
                                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                                setLayoutParams(layoutParams);
                                addView(smartImageView, new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30))));
                                smartImageView.setColorFilter(Color.argb(7, 0, 0, 0), PorterDuff.Mode.SRC_OVER);
                                this.LLILLJJLI = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(143));
                            }

                            public final void setSkuImage(Image image) {
                                C03IT thumbFirstImageUrlModel;
                                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                                if (image != null) {
                                    thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel();
                                } else {
                                    thumbFirstImageUrlModel = null;
                                }
                                c1326790kdB.getClass();
                                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
                                c1331670kl3LIZLLL.LJJI = getDisplayOption();
                                c1331670kl3LIZLLL.LJJIIZI(C800330VaR.LIZIZ(getContext(), R.drawable.b99));
                                c1331670kl3LIZLLL.LJJ(this.LL);
                                c1331670kl3LIZLLL.LJIIJJI();
                            }
                        };
                        r52.setSkuImage(salePropValue.image);
                        r5 = r52;
                    } else {
                        final Context context2 = this.LLJJJIL;
                        ?? r53 = new TuxTextView(context2) { // from class: X.03El
                            {
                                float fFloatValue;
                                Float fValueOf;
                                super(context2, null, 6, 0);
                                setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180)));
                                setMaxLines(1);
                                setEllipsize(TextUtils.TruncateAt.END);
                                try {
                                    fValueOf = Float.valueOf(context2.getResources().getDimension(R.dimen.sz));
                                } catch (CancellationException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    throw e;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                                if (fValueOf == null) {
                                    fFloatValue = 0.0f;
                                } else {
                                    fFloatValue = fValueOf.floatValue();
                                }
                                setTuxFont(61);
                                if (C1071004Gu.LIZIZ().LIZ()) {
                                    setTextColorRes(R.attr.a1h);
                                } else {
                                    setTextColorRes(C960203pA.LIZ(R.attr.a1i, context2));
                                }
                                setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0);
                                C384050F3z c384050F3z = new C384050F3z();
                                c384050F3z.LIZ = Integer.valueOf(C960203pA.LIZ(R.attr.a03, context2));
                                c384050F3z.LIZJ = Float.valueOf(fFloatValue);
                                setBackgroundDrawable(c384050F3z.LIZ(context2));
                                setGravity(16);
                                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                                setLayoutParams(layoutParams);
                            }

                            public final void setSkuText(String str3) {
                                if (str3 != null && !a0.LJJJIL(str3)) {
                                    setText(str3);
                                }
                            }
                        };
                        r53.setSkuText(salePropValue.propValue);
                        r5 = r53;
                    }
                    View viewFindViewById2 = this.LLJJIJIL;
                    if (viewFindViewById2 == null) {
                        View viewLJJIJL2 = LJJIJL();
                        if (viewLJJIJL2 != null) {
                            viewFindViewById2 = viewLJJIJL2.findViewById(R.id.etn);
                        } else {
                            viewFindViewById2 = null;
                        }
                        this.LLJJIJIL = (LinearLayout) viewFindViewById2;
                    }
                    ((ViewGroup) viewFindViewById2).addView(r5);
                    c259800zU.element = r5;
                    r5.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    measuredWidth += r5.getMeasuredWidth();
                    if (i2 > 0) {
                        C0H9H.LJFF(iLIZIZ, r5);
                        measuredWidth += iLIZIZ;
                    }
                    i2 = i3;
                }
                T t = c259800zU.element;
                if (t instanceof C810103El) {
                    C430110Gtl.LIZ((View) t, new AwS545S0100000_1(c259800zU, (C259800zU<View>) 1509));
                }
            }
            if (C1071004Gu.LIZIZ().LIZ() && (tuxTextViewC6 = c6()) != null) {
                tuxTextViewC6.setTuxFont(61);
            }
            String[] strArr = c954203oC.LIZIZ;
            List<SaleProp> list4 = c954203oC.LIZ;
            String strLIZIZ = "";
            if (strArr != null && list4 != null) {
                ArrayList arrayList2 = new ArrayList();
                int length = strArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    if (!Intrinsics.LJFF(strArr[i4], "") && (list = ((SaleProp) ListProtector.get(list4, i4)).salePropValueList) != null) {
                        for (SalePropValue salePropValue2 : list) {
                            if (u.LJIJI(salePropValue2.propValueId, strArr[i4], false)) {
                                arrayList2.add(salePropValue2.propValue);
                            }
                        }
                    }
                }
                strLIZIZ = C036I.LIZIZ(arrayList2);
            }
            String[] strArr2 = c954203oC.LIZIZ;
            if (strArr2 == null || strArr2.length == 0) {
                z = true;
            }
            if (!z && (!a0.LJJJIL(strLIZIZ))) {
                String string = this.LLJJJIL.getString(2131850898);
                TuxTextView tuxTextViewC62 = c6();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append(strLIZIZ);
                tuxTextViewC62.setText(C2188811AlT.LIZIZ(sbLIZ));
                if (C1071004Gu.LIZIZ().LIZ()) {
                    TuxTextView tuxTextViewC63 = c6();
                    if (tuxTextViewC63 != null) {
                        tuxTextViewC63.setTextColorRes(R.attr.a1j);
                    }
                } else {
                    TuxTextView tuxTextViewC64 = c6();
                    if (tuxTextViewC64 != null) {
                        tuxTextViewC64.setTextColor(C960203pA.LIZ(R.attr.a1i, this.LLJJJIL));
                    }
                }
            } else {
                TuxTextView tuxTextViewC65 = c6();
                SaleProp saleProp2 = (SaleProp) C13LP.LJJJLL(c954203oC.LIZ);
                if (saleProp2 != null) {
                    str2 = saleProp2.availablePropTypeDisplay;
                }
                tuxTextViewC65.setText(str2);
                if (C1071004Gu.LIZIZ().LIZ()) {
                    TuxTextView tuxTextViewC66 = c6();
                    if (tuxTextViewC66 != null) {
                        tuxTextViewC66.setTextColorRes(R.attr.a1j);
                    }
                } else {
                    TuxTextView tuxTextViewC67 = c6();
                    if (tuxTextViewC67 != null) {
                        tuxTextViewC67.setTextColor(C960203pA.LIZ(R.attr.a1k, this.LLJJJIL));
                    }
                }
            }
            C786410Ut5.I7(new AjS40S0200000_1(this, saleProp, 26), this.itemView);
        }
    }
}
