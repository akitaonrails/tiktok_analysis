package com.ss.android.ugc.aweme.biz.wallet.biz.result;

import X.C0HTI;
import X.C1559260qg8;
import X.C1716340ulU;
import X.C1717010umZ;
import X.C197039127h;
import X.C19EG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C723590SZx;
import X.C724240Sb0;
import X.C786410Ut5;
import X.CountDownTimerC1775650wJ9;
import X.InterfaceC1716970umV;
import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: loaded from: classes27.dex */
public final class WalletAccountResultAssem extends UIContentAssem {
    public TuxIconView LLIZLLLIL;
    public C197039127h LLJ;
    public ImageView LLJI;
    public final C1559260qg8 LLJIJIL = new C1559260qg8(new C723590SZx(this, C1717010umZ.class, "SOURCE_DATA"), checkSupervisorPrepared());
    public int LLJILJIL = 3;
    public final AtomicBoolean LLJILJILJ = new AtomicBoolean(false);
    public final CountDownTimerC1775650wJ9 LLJILLL = new CountDownTimerC1775650wJ9(this, 0);
    public long LLJJ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C1717010umZ Jo() {
        return (C1717010umZ) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        this.LLJILLL.cancel();
        super.onDestroy();
    }

    public final void Ho() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9 = this.LLJILLL;
            if (countDownTimerC1775650wJ9 != null) {
                countDownTimerC1775650wJ9.cancel();
            }
            String str = WalletAccountResultFragment._pnsPageId;
            String str2 = Jo().LL;
            HashMap<String, InterfaceC1716970umV> map = WalletAccountResultFragment.LLJJ;
            InterfaceC1716970umV interfaceC1716970umV = map.get(str2);
            if (interfaceC1716970umV != null) {
                interfaceC1716970umV.onSuccess();
                map.remove(str2);
            }
            c19egLIZ.finish();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (this.LLJILJILJ.compareAndSet(false, true)) {
            Go(this.LLJILJIL - 1);
            this.LLJILLL.start();
        }
    }

    public final void Go(int i) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Context context = getContext();
        View viewFindViewById = null;
        if (context != null) {
            string = context.getString(2131840208);
        } else {
            string = null;
        }
        sbLIZ.append(string);
        sbLIZ.append(" (");
        sbLIZ.append(i + 1);
        sbLIZ.append("s)");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        View view = this.LLJ;
        if (view == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.t2m);
            }
            this.LLJ = (C197039127h) viewFindViewById;
            view = viewFindViewById;
        }
        ((TextView) view).setText(strLIZIZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = this.LLIZLLLIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.tdk);
            } else {
                viewFindViewById = null;
            }
            this.LLIZLLLIL = (TuxIconView) viewFindViewById;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById, new ACListenerS160S0100000_26(this, 13));
        View viewFindViewById3 = this.LLJ;
        if (viewFindViewById3 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById3 = viewLJJIJL2.findViewById(R.id.t2m);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJ = (C197039127h) viewFindViewById3;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById3, new ACListenerS160S0100000_26(this, 14));
        Context context = getContext();
        if (context != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.te;
            Drawable drawableLIZ = c0hti.LIZ(context);
            View view2 = this.LLJI;
            if (view2 == null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 != null) {
                    viewFindViewById2 = viewLJJIJL3.findViewById(R.id.tdw);
                }
                this.LLJI = (ImageView) viewFindViewById2;
                view2 = viewFindViewById2;
            }
            ((ImageView) view2).setImageDrawable(drawableLIZ);
        }
        String str = Jo().LLILZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = Jo().LLILZIL;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = Jo().LLILZLL;
        if (str4 == null) {
            str4 = "";
        }
        this.LLJJ = System.currentTimeMillis();
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("interface_return_cost", CardStruct.IStatusCode.DEFAULT);
        pairArr[1] = new Pair("page_id", "credit_activate_result");
        String str5 = Jo().LLILLL;
        if (str5 != null) {
            str2 = str5;
        }
        pairArr[2] = new Pair("previous_page_id", str2);
        pairArr[3] = new Pair("source_id", str);
        pairArr[4] = new Pair("user_status", str3);
        pairArr[5] = new Pair("activate_result", str4);
        pairArr[6] = new Pair("container_type", "android_native_report");
        C1716340ulU.LIZ("fp_sdk_bnpl_activate_result_show", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final void Lo(String str, String str2, String str3, String str4) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJ;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("obj_id", str);
        pairArr[1] = new Pair("click_use_time", String.valueOf(jCurrentTimeMillis));
        pairArr[2] = new Pair("page_id", "credit_activate_result");
        String str5 = Jo().LLILLL;
        if (str5 == null) {
            str5 = "";
        }
        pairArr[3] = new Pair("previous_page_id", str5);
        pairArr[4] = new Pair("source_id", str2);
        pairArr[5] = new Pair("user_status", str3);
        pairArr[6] = new Pair("activate_result", str4);
        C1716340ulU.LIZ("fp_sdk_bnpl_activate_result_click", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
