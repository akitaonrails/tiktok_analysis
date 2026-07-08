package com.ss.android.ugc.aweme.biz.wallet.biz.processpage;

import X.C1559260qg8;
import X.C1719010upn;
import X.C197039127h;
import X.C345640Dgo;
import X.C345670Dgr;
import X.C723590SZx;
import X.C786410Ut5;
import X.EnumC345660Dgq;
import Y.ACListenerS160S0100000_26;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.biz.wallet.network.model.ProcessItem;
import com.ss.android.ugc.aweme.biz.wallet.network.model.ProcessItemList;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ProcessPageAssem extends UIContentAssem {
    public C197039127h LLIZLLLIL;
    public TuxTextView LLJ;
    public C345640Dgo LLJI;
    public final C1559260qg8 LLJIJIL = new C1559260qg8(new C723590SZx(this, C1719010upn.class, "KEY_PROCESS_DATA"), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC345660Dgq enumC345660Dgq;
        super.onViewCreated(view);
        View viewFindViewById = this.LLIZLLLIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.rwj);
            } else {
                viewFindViewById = null;
            }
            this.LLIZLLLIL = (C197039127h) viewFindViewById;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById, new ACListenerS160S0100000_26(this, 12));
        ProcessItemList processItemList = ((C1719010upn) this.LLJIJIL.getValue()).LLILZLL;
        if (processItemList != null) {
            View viewFindViewById3 = this.LLJ;
            if (viewFindViewById3 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById3 = viewLJJIJL2.findViewById(R.id.title);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJ = (TuxTextView) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(processItemList.getTitle());
            ArrayList arrayList = new ArrayList();
            ArrayList<ProcessItem> processItemList2 = processItemList.getProcessItemList();
            if (processItemList2 != null) {
                for (ProcessItem processItem : processItemList2) {
                    String title = processItem.getTitle();
                    String str = "";
                    if (title == null) {
                        title = "";
                    }
                    String detail = processItem.getDetail();
                    if (detail != null) {
                        str = detail;
                    }
                    if (TextUtils.equals("NOT_STARTED", processItem.getItemStatus())) {
                        enumC345660Dgq = EnumC345660Dgq.STATUS_UN_STARTED;
                    } else {
                        enumC345660Dgq = EnumC345660Dgq.STATUS_COMPLETED;
                    }
                    arrayList.add(new C345670Dgr(title, str, enumC345660Dgq));
                }
            }
            View view2 = this.LLJI;
            if (view2 == null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 != null) {
                    viewFindViewById2 = viewLJJIJL3.findViewById(R.id.rwl);
                }
                this.LLJI = (C345640Dgo) viewFindViewById2;
                view2 = viewFindViewById2;
            }
            ((C345640Dgo) view2).setProgressData(arrayList);
        }
    }
}
