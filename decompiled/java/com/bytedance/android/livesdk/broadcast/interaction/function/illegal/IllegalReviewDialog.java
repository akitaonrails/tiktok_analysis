package com.bytedance.android.livesdk.broadcast.interaction.function.illegal;

import X.C01GW;
import X.C01QD;
import X.C0IJT;
import X.C0UO0;
import X.C0UVT;
import X.C0UVW;
import X.C1324720kZq;
import X.C16FZ;
import X.C474500IjA;
import X.C497740JfY;
import X.C500980Jkm;
import X.C749790Tb7;
import X.C749800Tb8;
import X.C781270Ukn;
import X.C784600UqA;
import X.C784610UqB;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.model.WaitingReviewRule;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class IllegalReviewDialog extends LiveDialogFragment implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZyY9PCA+HELIOSKCwnISoiZykmJiY4ICA9ZiwgJSo0KSliACM/LSItJR02PiwpPgs6KSkjLg==";
    public Context LL;
    public View LLILLJJLI;
    public RelativeLayout LLILLL;
    public TextView LLILZ;
    public TextView LLILZIL;
    public TextView LLILZLL;
    public TextView LLIZ;
    public TextView LLIZLLLIL;
    public LinearLayout LLJ;
    public C749790Tb7 LLJI;
    public List<WaitingReviewRule> LLJIJIL;
    public C0UVT LLJILJIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g7k);
        c500980Jkm.LIZIZ = 0;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -2;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        return c500980Jkm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iIntValue;
        WaitingReviewRule waitingReviewRule;
        if (view instanceof C1324720kZq) {
            if (view.getTag() != null) {
                iIntValue = ((Integer) view.getTag()).intValue();
            } else {
                iIntValue = -1;
            }
            List<WaitingReviewRule> list = this.LLJIJIL;
            if (list != null && !list.isEmpty() && iIntValue >= 0 && iIntValue < this.LLJIJIL.size() && (waitingReviewRule = (WaitingReviewRule) ListProtector.get(this.LLJIJIL, iIntValue)) != null && !TextUtils.isEmpty(waitingReviewRule.url)) {
                String string = UriProtector.parse(waitingReviewRule.url).buildUpon().appendQueryParameter("source", "inapp").appendQueryParameter("enter_from", "live").build().toString();
                C781270Ukn.LJFF().Zz1();
                C784610UqB.LIZIZ(getContext(), new C784600UqA(string));
                if (waitingReviewRule.url.contains("health_score")) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_know_health_score_page_show");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII("shield", "enter_from");
                    c474500IjALIZ.LIZ();
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C0UVT c0uvt = this.LLJILJIL;
        if (c0uvt != null && c0uvt.LLILZLL != 1) {
            c0uvt.LLIZ = true;
        }
        super.onDismiss(dialogInterface);
    }

    public static Spannable MR(int i, String str) {
        SpannableString spannableString = new SpannableString(str);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan((int) C497740JfY.LJJIFFI(25.0f));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C497740JfY.LJFF(R.color.oo));
        C786410Ut5.o2(spannableString, absoluteSizeSpan, 4, i, 18);
        C786410Ut5.o2(spannableString, foregroundColorSpan, 4, i, 18);
        return spannableString;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View view2 = getView();
        this.LLILLJJLI = view2;
        this.LLILLL = (RelativeLayout) view2.findViewById(R.id.evm);
        this.LLILZ = (TextView) this.LLILLJJLI.findViewById(R.id.jkx);
        this.LLILZIL = (TextView) this.LLILLJJLI.findViewById(R.id.jku);
        this.LLILLJJLI.findViewById(R.id.jkt);
        this.LLILZLL = (TextView) this.LLILLJJLI.findViewById(R.id.waiting_queue_text);
        this.LLIZ = (TextView) this.LLILLJJLI.findViewById(R.id.waiting_time_text);
        this.LLIZLLLIL = (TextView) this.LLILLJJLI.findViewById(R.id.dmi);
        this.LLJ = (LinearLayout) this.LLILLJJLI.findViewById(R.id.ce4);
        C749790Tb7 c749790Tb7 = (C749790Tb7) this.LLILLJJLI.findViewById(R.id.nky);
        this.LLJI = c749790Tb7;
        C749800Tb8 c749800Tb8LIZ = C749800Tb8.LIZ(getContext());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.amk);
        C16FZ c16fz = new C16FZ(c749800Tb8LIZ.LIZ, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
        layoutParams.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fz);
        c16fz.setLayoutParams(layoutParams);
        c749800Tb8LIZ.LIZIZ = c16fz;
        c749790Tb7.setBuilder(c749800Tb8LIZ);
        C786410Ut5.LLL(this.LLJI, 0);
        this.LLJI.LIZLLL();
        C786410Ut5.LLL(this.LLJI, 0);
        this.LLJI.LIZLLL();
        C0UVT c0uvt = this.LLJILJIL;
        if (c0uvt != null) {
            c0uvt.LLILLL.removeMessages(2);
            c0uvt.LLILZLL = 3;
            C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
            C01QD.LIZ().LIZ().getReviewInfo(c0uvt.LLILLJJLI).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(c0uvt, 30), new AfS181S0100000_12(c0uvt, 31));
        }
    }

    public final void NR(int i, int i2, boolean z) {
        if (z) {
            C786410Ut5.LLIL(this.LLILZLL, 0);
            this.LLILZLL.setText(MR(String.valueOf(i).length() + 4, C497740JfY.LJIJJ(2131853518, Integer.valueOf(i))));
            C786410Ut5.LLIL(this.LLIZ, 0);
            this.LLIZ.setText(MR(String.valueOf(i2).length() + 4, C497740JfY.LJIJJ(2131853519, Integer.valueOf(i2))));
            return;
        }
        C786410Ut5.LLIL(this.LLILZLL, 4);
        C786410Ut5.LLIL(this.LLIZ, 4);
    }
}
