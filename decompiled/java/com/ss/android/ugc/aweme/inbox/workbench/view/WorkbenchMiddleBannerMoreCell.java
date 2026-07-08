package com.ss.android.ugc.aweme.inbox.workbench.view;

import X.C01GW;
import X.C053000Hg;
import X.C0OPX;
import X.C1196320hEk;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.ACListenerS144S0100000_9;
import android.widget.TextView;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.workbench.scope.WorkbenchCardCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class WorkbenchMiddleBannerMoreCell extends PowerCell<C053000Hg> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(204));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 849));
    public final ACListenerS144S0100000_9 LLILLL = new ACListenerS144S0100000_9(this, 59);

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{WorkbenchCardCellScope.class});
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.aa4;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(WorkbenchCardCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.h9((TuxTextView) this.itemView.findViewById(R.id.workbench_card_middle_banner_more_content), this.LLILLL);
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.workbench_card_middle_banner_more_content_icon);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, this.LLILLL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C053000Hg c053000Hg = (C053000Hg) interfaceC1891350zJl;
        super.onBindItemView(c053000Hg);
        TextView textView = (TextView) this.itemView.findViewById(R.id.workbench_card_middle_banner_more_content);
        if (textView != null) {
            textView.setText(C0OPX.LJFF(2131755420, c053000Hg.LL));
        }
    }
}
