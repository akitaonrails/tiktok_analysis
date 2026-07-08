package com.bytedance.android.livesdk.billboard.broadcast;

import X.AnonymousClass0131;
import X.C1104000epq;
import X.C197039127h;
import X.C20736316Cj;
import X.C2757014x;
import X.C497740JfY;
import X.C786410Ut5;
import X.ViewOnClickListenerC512201z6;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class BillboardMultiDeleteConfirmSheetFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KiwgJS08KTcoZy0hJyQoHELIOSKi4gPGsOICM/KiotOysePSk4IAs2JCA4LAw8JiMlOyIAICApPQkhKSIhLCEn";
    public final C2757014x LLJLLL;
    public final List<C2757014x> LLJZ;
    public final Function0<Unit> LLJZIJLIL;

    public BillboardMultiDeleteConfirmSheetFragment() {
        this(null, new ArrayList(), null);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezk, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        sheetOptions.cornerRadius = C497740JfY.LJIIIZ(R.dimen.b1);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        Function0<Unit> function0 = this.LLJZIJLIL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.c15);
        if (this.LLJLLL == null) {
            i = 2131852411;
        } else {
            i = 2131852414;
        }
        textView.setText(i);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.c10);
        c197039127h.setText(2131851342);
        C786410Ut5.U8(c197039127h, new ViewOnClickListenerC512201z6(this, 22));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.c14);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext(), 0);
        flexboxLayoutManager.LJJIFFI(0);
        flexboxLayoutManager.LJJIII(2);
        flexboxLayoutManager.LJJI(2);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setAdapter(new C1104000epq(this.LLJZ, new AnonymousClass0131(this, this.LLJZ.size(), view)));
    }

    public BillboardMultiDeleteConfirmSheetFragment(C2757014x c2757014x, List<C2757014x> list, Function0<Unit> function0) {
        this.LLJLLL = c2757014x;
        this.LLJZ = list;
        this.LLJZIJLIL = function0;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g05, viewGroup, false);
    }
}
