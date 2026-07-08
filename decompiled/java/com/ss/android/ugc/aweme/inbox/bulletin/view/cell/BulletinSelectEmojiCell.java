package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C01GW;
import X.C0IDN;
import X.C1196320hEk;
import X.C427100Gou;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.ACListenerS141S0100000_6;
import android.widget.TextView;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.scope.BulletinSelectEmojiSheetScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class BulletinSelectEmojiCell extends PowerCell<C427100Gou> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(108));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 426));

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinSelectEmojiSheetScope.class});
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a83;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinSelectEmojiSheetScope.class);
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
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.v4r);
        if (tuxTextView != null) {
            tuxTextView.LJJJJI(34.0f);
            C786410Ut5.h9(tuxTextView, new ACListenerS141S0100000_6(this, 45));
            tuxTextView.setOnLongClickListener(new C0IDN(this, tuxTextView, 0));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C427100Gou c427100Gou = (C427100Gou) interfaceC1891350zJl;
        super.onBindItemView(c427100Gou);
        TextView textView = (TextView) this.itemView.findViewById(R.id.v4r);
        if (textView != null) {
            textView.setText(c427100Gou.LL);
        }
    }
}
