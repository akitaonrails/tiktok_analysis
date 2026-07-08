package com.ss.android.ugc.aweme.topic.movie.detail;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419890GdH;
import X.C444960Hcc;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import wh6.AbS500S0200000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MovieDescAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MovieDescAssem.class, "movieDetailVM", "getMovieDetailVM()Lcom/ss/android/ugc/aweme/topic/movie/detail/vm/MovieDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MovieDescAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MovieDetailVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1547), AFwS240S0000000_9.get$arr$(641), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fvx;
    }

    public final MovieDetailVM lp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (MovieDetailVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        Integer num;
        Double d;
        TuxIconDrawable tuxIconDrawable;
        int iIntValue;
        CharSequence charSequenceValueOf;
        Double dValueOf;
        String str;
        Context context;
        Double dValueOf2;
        MovieDetail movieDetailLIZ = lp().getState().LL.LIZ();
        if (movieDetailLIZ != null) {
            string = movieDetailLIZ.desc;
            num = movieDetailLIZ.year;
            d = movieDetailLIZ.rating;
        } else {
            string = null;
            num = null;
            d = null;
        }
        Context context2 = getContext();
        if (context2 != null) {
            tuxIconDrawable = new TuxIconDrawable(context2, R.drawable.cnw);
            tuxIconDrawable.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        } else {
            tuxIconDrawable = null;
        }
        C419890GdH c419890GdH = new C419890GdH(tuxIconDrawable, 2);
        c419890GdH.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C444960Hcc.LIZIZ());
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.wgz);
            } else {
                viewFindViewById = null;
            }
            this.LLJJI = (TuxTextView) viewFindViewById;
        }
        ((TuxTextView) viewFindViewById).setTuxFont(52);
        View viewFindViewById2 = this.LLJJI;
        if (viewFindViewById2 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.wgz);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJJI = (TuxTextView) viewFindViewById2;
        }
        TextView textView = (TextView) viewFindViewById2;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue != 0 && d != null && d.doubleValue() != 0.0d) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(num);
            sbLIZ.append(" · ");
            if (d != null) {
                dValueOf2 = Double.valueOf(((double) ((int) (((double) 10) * d.doubleValue()))) / 10.0d);
            } else {
                dValueOf2 = null;
            }
            sbLIZ.append(dValueOf2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(num);
            sbLIZ2.append(" · ");
            int length = C2188811AlT.LIZIZ(sbLIZ2).length();
            C786410Ut5.q2(spannableStringBuilder, c419890GdH, length - 1, length, 17);
            charSequenceValueOf = spannableStringBuilder;
        } else if (num != null && num.intValue() != 0) {
            charSequenceValueOf = String.valueOf(num);
        } else if (d == null || d.doubleValue() == 0.0d) {
            charSequenceValueOf = "";
        } else {
            if (d != null) {
                dValueOf = Double.valueOf(((double) ((int) (d.doubleValue() * ((double) 10)))) / 10.0d);
            } else {
                dValueOf = null;
            }
            charSequenceValueOf = String.valueOf(dValueOf);
        }
        textView.setText(charSequenceValueOf);
        View viewFindViewById3 = this.LLJJIII;
        if (viewFindViewById3 == null) {
            View viewLJJIJL3 = LJJIJL();
            if (viewLJJIJL3 != null) {
                viewFindViewById3 = viewLJJIJL3.findViewById(R.id.title);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJJIII = (TuxTextView) viewFindViewById3;
        }
        TextView textView2 = (TextView) viewFindViewById3;
        if (movieDetailLIZ != null) {
            str = movieDetailLIZ.title;
        } else {
            str = null;
        }
        textView2.setText(str);
        View viewFindViewById4 = this.LLJJIJI;
        if (viewFindViewById4 == null) {
            View viewLJJIJL4 = LJJIJL();
            if (viewLJJIJL4 != null) {
                viewFindViewById4 = viewLJJIJL4.findViewById(R.id.fof);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJJIJI = (TuxTextView) viewFindViewById4;
        }
        TuxTextView tuxTextView = (TuxTextView) viewFindViewById4;
        if ((string == null || string.length() == 0) && ((context = tuxTextView.getContext()) == null || (string = context.getString(2131837496)) == null)) {
            string = "";
        }
        tuxTextView.setText(string);
        C786410Ut5.I7(new AbS500S0200000_9(tuxTextView, this, 4, 42), tuxTextView);
    }
}
