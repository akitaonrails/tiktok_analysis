package com.ss.android.ugc.aweme.inbox.search.assem;

import X.C01D1;
import X.C1242080iQY;
import X.C1265830j2r;
import X.C1266020j3A;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewTreeObserverOnGlobalLayoutListenerC1265990j37;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchUserFilterVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchUserFilterBarAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InboxSearchUserFilterBarAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/search/vm/InboxSearchUserFilterVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InboxSearchUserFilterBarAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InboxSearchUserFilterVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1563), AFwS257S0000000_19.get$arr$(199), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        super.onViewCreated(view);
        EditText editText = ((C1242080iQY) view.findViewById(R.id.kjw)).getEditText();
        Context context = view.getContext();
        if (context != null) {
            string = context.getString(2131835990);
        } else {
            string = null;
        }
        editText.setHint(string);
        editText.setOnEditorActionListener(new C1265830j2r(editText, 2));
        editText.addTextChangedListener(new C1266020j3A(this, 5));
        C786410Ut5.x3(editText.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1265990j37(editText, 3));
    }
}
