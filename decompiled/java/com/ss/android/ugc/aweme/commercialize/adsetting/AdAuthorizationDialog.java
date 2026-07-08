package com.ss.android.ugc.aweme.commercialize.adsetting;

import X.C2188811AlT;
import X.C341940Daq;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC2173371A3z;
import Y.ACListenerS167S0100000_33;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.adsetting.AdAuthorizationDialog;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes34.dex */
public final class AdAuthorizationDialog extends AdBaseDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6HELIOSMiBiKCsgLTE4ICE0ZgQoCDonICo+IDUyPCwjJws6KSkjLg==";
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public RadioGroup LLILZIL;
    public InterfaceC2173371A3z LLIZ;
    public long LLJ;
    public long LLJI;
    public String LLILZLL = "";
    public long LLIZLLLIL = 30;

    public static int NR(long j) {
        if (j == 7) {
            return 0;
        }
        if (j == 30) {
            return 1;
        }
        if (j == 60) {
            return 2;
        }
        return j == 365 ? 3 : -1;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.adsetting.AdBaseDialogFragment
    public final int MR() {
        return R.layout.bm2;
    }

    public final TuxTextView OR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.z8_) : null;
            this.LLILZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView PR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.z_l) : null;
            this.LLILLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView RR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.zyu) : null;
            this.LLILLJJLI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    public final void SR(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = i;
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.adsetting.AdBaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.tv_title);
            } else {
                viewFindViewById = null;
            }
            this.LL = (TuxTextView) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(this.LLILZLL);
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        if (this.LLJ != 0) {
            C786410Ut5.LLLLZLL(RR(), 0);
            long j = this.LLJI + (this.LLIZLLLIL * 24 * 60 * 60);
            TuxTextView tuxTextViewRR = RR();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getResources().getString(2131826812));
            sbLIZ.append(":\n");
            sbLIZ.append(simpleDateFormat.format(Long.valueOf(this.LLJ * 1000)));
            sbLIZ.append(" - ");
            sbLIZ.append(simpleDateFormat.format(new Date(j * 1000)));
            tuxTextViewRR.setText(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.h9(PR(), new ACListenerS167S0100000_33(this, 27));
            C786410Ut5.h9(OR(), new ACListenerS167S0100000_33(this, 28));
            PR().setText(getResources().getString(2131845634));
            OR().setText(getResources().getString(2131847744));
            OR().setTextColor(C960203pA.LIZ(R.attr.a04, OR().getContext()));
            OR().setGravity(17);
            SR(C341940Daq.LIZ(6.0d), PR());
            SR(C341940Daq.LIZ(12.0d), OR());
        } else {
            C786410Ut5.LLLLZLL(RR(), 8);
            C786410Ut5.h9(PR(), new ACListenerS167S0100000_33(this, 29));
            PR().setText(getResources().getString(2131826789));
            OR().setText(getResources().getString(2131830586));
            OR().setTextColor(C960203pA.LIZ(R.attr.a1k, OR().getContext()));
            OR().setGravity(8388611);
            SR(C341940Daq.LIZ(16.0d), PR());
            SR(C341940Daq.LIZ(16.0d), OR());
        }
        View view3 = this.LLILZIL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.tjo);
            }
            this.LLILZIL = (RadioGroup) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C786410Ut5.x7((RadioGroup) view3, new RadioGroup.OnCheckedChangeListener() { // from class: X.1A3y
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                long j2;
                AdAuthorizationDialog adAuthorizationDialog = this.LIZ;
                if (i == R.id.sst) {
                    j2 = 7;
                } else if (i == R.id.ssq) {
                    j2 = 30;
                } else if (i == R.id.sss) {
                    j2 = 60;
                } else if (i == R.id.ssr) {
                    j2 = 365;
                } else {
                    j2 = 0;
                }
                adAuthorizationDialog.LLIZLLLIL = j2;
                if (adAuthorizationDialog.LLJ != 0) {
                    long j3 = adAuthorizationDialog.LLJI + (j2 * 24 * 60 * 60);
                    TuxTextView tuxTextViewRR2 = adAuthorizationDialog.RR();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LIZ.getResources().getString(2131826812));
                    sbLIZ2.append(":\n");
                    sbLIZ2.append(simpleDateFormat.format(Long.valueOf(this.LIZ.LLJ * 1000)));
                    sbLIZ2.append(" - ");
                    sbLIZ2.append(simpleDateFormat.format(new Date(j3 * 1000)));
                    tuxTextViewRR2.setText(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        });
        C786410Ut5.Q7((ImageView) view.findViewById(R.id.lc0), new ACListenerS167S0100000_33(this, 30));
    }
}
