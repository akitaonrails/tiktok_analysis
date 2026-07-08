package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.desc;

import X.C01GW;
import X.C034S;
import X.C049X;
import X.C10515049h;
import X.C1120604Zw;
import X.C13LE;
import X.C13LP;
import X.C1406530mhn;
import X.C15438062q;
import X.C1741890vQh;
import X.C1744780vVM;
import X.C1748720vbi;
import X.C1755600vmo;
import X.C19719612Di;
import X.C19719912Dl;
import X.C1AQS;
import X.C418440Gaw;
import X.C452501pT;
import X.C770702zh;
import X.C786410Ut5;
import X.C814420VxA;
import X.C958103op;
import android.content.Context;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SpecificationLink;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS303S0300000_26;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaProductSpecificationViewHolder extends AbsBrickFullSpanVH<C1406530mhn> {
    public final ECBaseFragment LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final LinkedList<C1744780vVM> LLJJL;
    public final List<View> LLJJLIIIJLLLLLLLZ;
    public List<View> LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void f6() {
        C786410Ut5.LJJJJJL((LinearLayout) this.itemView.findViewById(R.id.vtk));
        Iterator<View> it2 = this.LLJL.iterator();
        while (it2.hasNext()) {
            ((ViewGroup) this.itemView.findViewById(R.id.vtk)).addView(it2.next());
        }
        ((TextView) this.itemView.findViewById(R.id.view_toggle_text)).setText(this.itemView.getContext().getString(2131832936));
    }

    public final void h6() {
        C786410Ut5.LJJJJJL((LinearLayout) this.itemView.findViewById(R.id.vtk));
        Iterator it2 = ((ArrayList) this.LLJJLIIIJLLLLLLLZ).iterator();
        while (it2.hasNext()) {
            ((ViewGroup) this.itemView.findViewById(R.id.vtk)).addView((View) it2.next());
        }
        ((TextView) this.itemView.findViewById(R.id.view_toggle_text)).setText(this.itemView.getContext().getString(2131850911));
    }

    public final void i6() {
        if (!this.LLJJJ) {
            this.LLJJJ = true;
            C1748720vbi.LJFF(this.itemView.findViewById(R.id.vtk), new C10515049h(), AFwS215S0000000_26.get$arr$(116), AFwS268S0000000_26.get$arr$(211));
        }
        if (!this.LLJJJIL && !this.LLJJJJJIL && this.LLJJJJLIIL) {
            this.LLJJJIL = true;
            C1748720vbi.LIZLLL(this.itemView.findViewById(R.id.vtk), new C10515049h(), AFwS268S0000000_26.get$arr$(212));
        }
        if (!this.LLJJJJ && this.LLJJJJJIL && this.LLJJJJLIIL) {
            this.LLJJJJ = true;
            C1748720vbi.LIZLLL(this.itemView.findViewById(R.id.vtk), new C10515049h(), AFwS268S0000000_26.get$arr$(213));
        }
    }

    public final C1744780vVM d6(final Specification specification) {
        HashMap<String, Object> mapLJIIJ;
        List<String> list;
        SpecificationLink specificationLink;
        final boolean z;
        List<String> list2;
        final C1744780vVM c1744780vVM = (C1744780vVM) C19719612Di.LJJIIZI(this.LLJJL);
        if (c1744780vVM == null) {
            c1744780vVM = new C1744780vVM(this.itemView.getContext());
            c1744780vVM.LLILZ = specification;
            c1744780vVM.getSpecNameFromXml().setText(specification.name);
            SpecificationLink specificationLink2 = specification.specificationLink;
            if ((specificationLink2 != null && (list2 = specificationLink2.urlList) != null && C13LP.LJJJLL(list2) != null) || ((specificationLink = specification.specificationLink) != null && specificationLink.popUpMsg != null)) {
                z = true;
            } else {
                z = false;
            }
            if (specification.specificationLink != null && z) {
                if (C770702zh.LIZ(specification.value)) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    SpannableString spannableString = new SpannableString(specification.value);
                    C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0393
                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view) {
                            Function2<SpecificationLink, C1744780vVM, Unit> onClickListener;
                            if (z && (onClickListener = c1744780vVM.getOnClickListener()) != null) {
                                onClickListener.invoke(specification.specificationLink, c1744780vVM);
                            }
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            super.updateDrawState(textPaint);
                            textPaint.setColor(C960203pA.LIZ(R.attr.bb, c1744780vVM.getContext()));
                            textPaint.setUnderlineText(false);
                        }
                    }, 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    c1744780vVM.getSpecValueFromXml().setHighlightColor(0);
                    c1744780vVM.getSpecValueFromXml().setMovementMethod(LinkMovementMethod.getInstance());
                    c1744780vVM.getSpecValueFromXml().setText(spannableStringBuilder);
                }
            } else {
                c1744780vVM.getSpecValueFromXml().setText(specification.value);
            }
        }
        c1744780vVM.setDownloading(false);
        SpecificationLink specificationLink3 = specification.specificationLink;
        if (specificationLink3 != null && (list = specificationLink3.urlList) != null && C13LP.LJJJLL(list) != null) {
            C1748720vbi.LIZLLL(this.itemView, new C10515049h(), AFwS268S0000000_26.get$arr$(494));
        }
        String str = specification.daInfo;
        if (str != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            C1748720vbi.LIZLLL(this.itemView, new C049X(), new AwS580S0100000_1((HashMap) mapLJIIJ, (HashMap<String, Object>) 355));
        }
        c1744780vVM.setClickListener(new AwS303S0300000_26(c1744780vVM, this, specification, 2));
        return c1744780vVM;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* JADX INFO: renamed from: e6, reason: merged with bridge method [inline-methods] */
    public final void rr(C1406530mhn c1406530mhn) {
        IECommerceHostService iECommerceHostService;
        int lineCount;
        int marginStart;
        boolean z;
        super.rr(c1406530mhn);
        List<Specification> list = c1406530mhn.LL;
        C786410Ut5.LJJJJJL((LinearLayout) this.itemView.findViewById(R.id.vtk));
        int i = 0;
        if (!this.LLJJJ) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Specification> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(d6(it2.next()));
            }
            this.LLJL = new ArrayList(arrayList);
            Iterator<Specification> it3 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C1744780vVM c1744780vVMD6 = d6(it3.next());
                TextView textView = (TextView) c1744780vVMD6.findViewById(R.id.vt_);
                AppCompatTextView appCompatTextView = (AppCompatTextView) c1744780vVMD6.findViewById(R.id.vt_);
                CharSequence text = appCompatTextView.getText();
                TextPaint paint = appCompatTextView.getPaint();
                int iLIZLLL = C958103op.LIZLLL();
                String name = null;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    if (iECommerceHostService != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IApplicationDependencyService.class.getName();
                    if (iECommerceHostService != null) {
                        name = iECommerceHostService.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                float dimension = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext().getResources().getDimension(R.dimen.f607oc);
                Integer numValueOf = Integer.valueOf(appCompatTextView.getLayoutParams().width);
                int iIntValue = numValueOf.intValue();
                Number numberValueOf = numValueOf;
                if (iIntValue <= 0) {
                    float f = iLIZLLL - (2 * dimension);
                    ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    } else {
                        marginStart = 0;
                    }
                    numberValueOf = Float.valueOf(f - marginStart);
                }
                if (numberValueOf.intValue() < 0) {
                    lineCount = 1;
                } else {
                    lineCount = StaticLayout.Builder.obtain(text, 0, text.length(), paint, numberValueOf.intValue()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build().getLineCount();
                }
                int i3 = lineCount + i2;
                if (i3 > 4) {
                    int i4 = 4 - i2;
                    if (i4 > 0) {
                        textView.setMaxLines(i4);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        ((ArrayList) this.LLJJLIIIJLLLLLLLZ).add(c1744780vVMD6);
                    }
                    this.LLJJJJLIIL = true;
                    this.LLJJJJJIL = false;
                } else {
                    ((ArrayList) this.LLJJLIIIJLLLLLLLZ).add(c1744780vVMD6);
                    i2 = i3;
                }
            }
        }
        if (this.LLJJJJJIL) {
            f6();
        } else {
            h6();
        }
        View viewFindViewById = this.itemView.findViewById(R.id.view_toggle_text);
        if (!this.LLJJJJLIIL) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        i6();
        C786410Ut5.I7(new AjS70S0100000_26(this, 14), this.itemView.findViewById(R.id.view_toggle_text));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaProductSpecificationViewHolder(ViewGroup viewGroup, ECBaseFragment eCBaseFragment) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.awj, context, viewGroup, false, true));
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJJJJIL = true;
        this.LLJJL = new LinkedList<>();
        this.LLJJLIIIJLLLLLLLZ = new ArrayList();
        this.LLJL = new ArrayList();
        this.LLJLIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(115));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 63));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }
}
