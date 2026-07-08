package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.AnonymousClass0501;
import X.C01GW;
import X.C1196320hEk;
import X.C1308910kAL;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.scope.BulletinEmojiCellScope;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiActionCell extends PowerCell<AnonymousClass0501> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(171));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 645));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 644));
    public TuxIconView LLILZ;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class, BulletinEmojiCellScope.class});
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a7b;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        arrayList.add(BulletinEmojiCellScope.class);
        return arrayList;
    }

    public final BulletinCommonAbility I5() {
        return (BulletinCommonAbility) this.LLILLL.getValue();
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
        this.LLILZ = (TuxIconView) this.itemView.findViewById(R.id.gzg);
        View view = this.itemView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJ = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
        view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS144S0100000_9(this, 0));
        }
    }
}
