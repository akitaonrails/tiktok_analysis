package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem;

import X.C01GW;
import X.C0H5P;
import X.C0H7W;
import X.C0H7X;
import X.C0H81;
import X.C1360520lVa;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C1EB1;
import X.C21565319aV;
import X.C2217381BqS;
import X.C23250099c;
import X.C337180DJs;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426490Gnv;
import X.C426750GoL;
import X.C427690Gpr;
import X.C435830H7d;
import X.C435910H7l;
import X.C452501pT;
import X.C659520Ptu;
import X.C661350Pwr;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.KeyMoments;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchIntentKeyFrameAssem extends SearchVideoKeyFrameAssem {
    public ViewGroup LLJLILLLLZIIL;
    public ViewGroup LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public boolean LLJZIJLIL;
    public List<? extends ImageView> LLJZ = C13BV.INSTANCE;
    public final C01GW LLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(125));

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoKeyFrameAssem
    public final void ep() {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoKeyFrameAssem
    public final void hp() {
        super.hp();
        if (((Boolean) C1EB1.LIZJ.getValue()).booleanValue()) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(this, SearchVideoKeyFrameAssem.LLJLIL[0]), new C2217381BqS() { // from class: X.0H7c
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0H89) obj).LLILLJJLI;
                }
            }, null, new AwS620S0100000_6(this, 63), 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoKeyFrameAssem
    public final void mp() {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoKeyFrameAssem
    public final void ip() {
        if (C1EB1.LIZ()) {
            for (ImageView imageView : this.LLJZ) {
                if (imageView != null) {
                    C427690Gpr.LJ(imageView, C418440Gaw.LIZIZ(4));
                }
                C21565319aV.LIZIZ(imageView, Float.valueOf(C418440Gaw.LIZIZ(4)), null, null, null, null, 30);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoKeyFrameAssem
    public final void cp(View view) {
        this.LLJLILLLLZIIL = (ViewGroup) view.findViewById(R.id.uav);
        this.LLJLL = (ViewGroup) view.findViewById(R.id.uaw);
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.uax);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.w3s);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.w3t);
        this.LLJZ = C1697810uHb.LJIIJJI(view.findViewById(R.id.m33), view.findViewById(R.id.m34), view.findViewById(R.id.m35), view.findViewById(R.id.m36));
        this.LLJJL = view.findViewById(R.id.uau);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoKeyFrameAssem
    public final void kp(View view) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Context context = getContext();
        if (context == null) {
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_right_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        tuxIconDrawableLIZ.setBounds(new Rect(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))));
        TuxTextView tuxTextView = this.LLJJJJLIIL;
        if (tuxTextView != null) {
            C661350Pwr.LJIIIZ(tuxTextView, tuxIconDrawableLIZ, context);
        }
        if (C1EB1.LIZ() && (viewGroup2 = this.LLJLL) != null) {
            C426750GoL.LJIIIZ(viewGroup2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, false, 29);
        }
        if (((Boolean) C1EB1.LIZLLL.getValue()).booleanValue() && (viewGroup = this.LLJLL) != null) {
            C426750GoL.LJIIIZ(viewGroup, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, null, false, 29);
        }
        C337180DJs.LIZ(this.LLJLILLLLZIIL);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoKeyFrameAssem
    /* JADX INFO: renamed from: lp */
    public final void up(C659520Ptu c659520Ptu) {
        C435830H7d c435830H7d;
        TuxIconDrawable tuxIconDrawableLIZ;
        List<SearchKeyFramePoint> list;
        SearchKeyFramePoint searchKeyFramePoint;
        String str;
        String str2;
        super.up(c659520Ptu);
        Context context = getContext();
        if (context == null) {
            return;
        }
        Object obj = c659520Ptu.LLILZ;
        if ((obj instanceof C435830H7d) && (c435830H7d = (C435830H7d) obj) != null) {
            int i = C435910H7l.LIZ[c435830H7d.LIZ.ordinal()];
            if (i != 1 && i != 2) {
                tuxIconDrawableLIZ = null;
            } else {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_cook_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            }
            if (tuxIconDrawableLIZ != null) {
                tuxIconDrawableLIZ.setBounds(new Rect(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))));
            }
            TuxTextView tuxTextView = this.LLJJJJLIIL;
            if (tuxTextView != null) {
                Drawable[] compoundDrawables = tuxTextView.getCompoundDrawables();
                Drawable drawable = compoundDrawables[0];
                Drawable drawable2 = compoundDrawables[1];
                Drawable drawable3 = compoundDrawables[2];
                Drawable drawable4 = compoundDrawables[3];
                if (C426750GoL.LIZLLL(context)) {
                    tuxTextView.setCompoundDrawables(drawable, drawable2, tuxIconDrawableLIZ, drawable4);
                } else {
                    tuxTextView.setCompoundDrawables(tuxIconDrawableLIZ, drawable2, drawable3, drawable4);
                }
            }
            if (((Boolean) C1EB1.LIZJ.getValue()).booleanValue()) {
                KeyMoments keyMoments = c435830H7d.LIZIZ;
                C0H81 c0h81 = c659520Ptu.LLILZIL;
                Aweme aweme = c659520Ptu.LL;
                this.LLJZIJLIL = false;
                if (((Boolean) C1EB1.LIZLLL.getValue()).booleanValue()) {
                    C337180DJs.LIZ(this.LLJLLIL);
                    C337180DJs.LIZ(this.LLJLLL);
                    if (keyMoments != null && (list = keyMoments.moments) != null) {
                        SearchKeyFramePoint searchKeyFramePoint2 = (SearchKeyFramePoint) C13LP.LJJJLZIJ(0, list);
                        if (searchKeyFramePoint2 != null && (str2 = searchKeyFramePoint2.title) != null) {
                            TuxTextView tuxTextView2 = this.LLJLLIL;
                            if (tuxTextView2 != null) {
                                tuxTextView2.setText(sp(1, str2));
                            }
                            C337180DJs.LIZJ(this.LLJLLIL);
                            this.LLJZIJLIL = true;
                        }
                        if (((Number) C1EB1.LJ.getValue()).intValue() >= 2 && (searchKeyFramePoint = (SearchKeyFramePoint) C13LP.LJJJLZIJ(1, list)) != null && (str = searchKeyFramePoint.title) != null) {
                            TuxTextView tuxTextView3 = this.LLJLLL;
                            if (tuxTextView3 != null) {
                                tuxTextView3.setText(sp(2, str));
                            }
                            C337180DJs.LIZJ(this.LLJLLL);
                        }
                    }
                }
                if (C1EB1.LIZ()) {
                    if (c0h81 instanceof C0H7X) {
                        this.LLJZIJLIL = true;
                        for (ImageView imageView : this.LLJZ) {
                            C337180DJs.LIZJ(imageView);
                            if (imageView != null) {
                                imageView.setImageDrawable(null);
                            }
                        }
                        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0H7W(this, aweme, c0h81, null), 3);
                    } else {
                        Iterator<? extends ImageView> it2 = this.LLJZ.iterator();
                        while (it2.hasNext()) {
                            C337180DJs.LIZ(it2.next());
                        }
                    }
                }
                C0H5P c0h5p = (C0H5P) this.LLL.getValue();
                ViewGroup viewGroup = this.LLJLILLLLZIIL;
                ViewGroup viewGroup2 = this.LLJLL;
                c0h5p.LIZ = null;
                AnimatorSet animatorSet = c0h5p.LIZIZ;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (viewGroup != null) {
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = -2;
                        C786410Ut5.W5(viewGroup, layoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                if (viewGroup2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = -2;
                        C786410Ut5.W5(viewGroup2, layoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                if (viewGroup != null) {
                    C786410Ut5.R4(1.0f, viewGroup);
                }
                if (viewGroup2 != null) {
                    C786410Ut5.bd(0.0f, viewGroup2);
                }
                if (this.LLJZIJLIL) {
                    C337180DJs.LIZJ(this.LLJLILLLLZIIL);
                } else {
                    C337180DJs.LIZ(this.LLJLILLLLZIIL);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoKeyFrameAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoKeyFrameAssem
    public final void op(int i) {
        String quantityString;
        Resources resources;
        Context context = getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C426490Gnv.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), spannableStringBuilder);
        if (context == null || (resources = context.getResources()) == null || (quantityString = resources.getQuantityString(2131755323, i, Integer.valueOf(i))) == null) {
            quantityString = "";
        }
        spannableStringBuilder.append((CharSequence) quantityString);
        TuxTextView tuxTextView = this.LLJJJJLIIL;
        if (tuxTextView != null) {
            tuxTextView.setText(spannableStringBuilder);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoKeyFrameAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((C659520Ptu) obj);
    }

    public static String sp(int i, String str) {
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZLLL(String.valueOf(i));
        c1360520lVa.LIZLLL(e3.d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C426490Gnv.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), spannableStringBuilder);
        c1360520lVa.LIZLLL(spannableStringBuilder);
        c1360520lVa.LIZLLL(str);
        return c1360520lVa.LIZ.toString();
    }
}
