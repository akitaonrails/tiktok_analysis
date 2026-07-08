package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core;

import X.C01GW;
import X.C13LE;
import X.C2217381BqS;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C659720PuE;
import X.C659750PuH;
import X.C660140Puu;
import X.C666750QDh;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C820940WIi;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPhotoLikeAssem extends ReusedUIContentAssem<SearchPhotoLikeAssem> implements InterfaceC712990Rxx<C659750PuH> {
    public final C01GW LLJJJJ = C737910Sx3.LIZJ(this, C13LE.LIZ(SearchPhotoViewModel.class), AFwS241S0000000_10.get$arr$(229));
    public TuxTextView LLJJJJJIL;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void cp(C660140Puu c660140Puu) {
        int iIntValue;
        int i;
        int i2;
        Integer numValueOf;
        long jLongValue;
        Context context = getContext();
        if (context == null) {
            return;
        }
        Integer num = c660140Puu.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (iIntValue == 1) {
            i = R.raw.icon_like_fill;
        } else {
            i = R.raw.icon_like;
        }
        c419910GdJ.LIZ = i;
        if (iIntValue == 1) {
            numValueOf = Integer.valueOf(R.attr.a04);
        } else {
            C659720PuE.LIZ.getClass();
            if (C659720PuE.LIZJ()) {
                i2 = R.attr.a1j;
            } else {
                i2 = R.attr.a1k;
            }
            numValueOf = Integer.valueOf(i2);
        }
        c419910GdJ.LJ = numValueOf;
        C659720PuE.LIZ.getClass();
        if (C659720PuE.LIZJ()) {
            float f = 12;
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
        } else {
            float f2 = 14;
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics()));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics()));
        }
        C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
        Long l = c660140Puu.LIZIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c419890GdHLIZIZ.LIZIZ(0, C814420VxA.LIZIZ(TypedValue.applyDimension(1, 2, Resources.getSystem().getDisplayMetrics())), C426750GoL.LIZLLL(context));
        TuxTextView tuxTextView = this.LLJJJJJIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x");
        C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 0, 1, 17);
        spannableStringBuilder.append(C820940WIi.LIZ(jLongValue));
        tuxTextView.setText(spannableStringBuilder);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.mn1);
        this.LLJJJJJIL = tuxTextView;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setTuxFont(61);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(), new C2217381BqS() { // from class: X.0Put
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C237400vs) obj).LLILLL;
            }
        }, null, AFwS293S0000000_10.get$arr$(5), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659750PuH c659750PuH) {
        C659750PuH c659750PuH2 = c659750PuH;
        TuxTextView tuxTextView = this.LLJJJJJIL;
        Long lValueOf = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView, C666750QDh.LIZ);
        Integer numValueOf = Integer.valueOf(c659750PuH2.LL.getUserDigg());
        AwemeStatistics statistics = c659750PuH2.LL.getStatistics();
        if (statistics != null) {
            lValueOf = Long.valueOf(statistics.getDiggCount());
        }
        cp(new C660140Puu(numValueOf, lValueOf));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659750PuH c659750PuH) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659750PuH c659750PuH) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
