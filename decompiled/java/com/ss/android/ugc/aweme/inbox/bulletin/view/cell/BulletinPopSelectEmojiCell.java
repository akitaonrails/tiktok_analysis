package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C01GW;
import X.C0DTR;
import X.C1196320hEk;
import X.C12ES;
import X.C13LP;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C618760OOs;
import X.C618780OOu;
import X.C687700QyG;
import X.C786410Ut5;
import X.EnumC618770OOt;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPopSelectEmojiCell extends PowerCell<C618760OOs> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(186));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 746));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 745));

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a7f;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    public final BulletinCommonAbility L5() {
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
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.rh8);
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS144S0100000_9(this, 56));
        }
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.rh7);
        if (frameLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            frameLayout.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
            C786410Ut5.O7(frameLayout, new ACListenerS144S0100000_9(this, 57));
        }
    }

    public final void I5(C618760OOs c618760OOs) {
        if (c618760OOs.LLILLJJLI == EnumC618770OOt.EMOJI.getType()) {
            TextView textView = (TextView) this.itemView.findViewById(R.id.rh8);
            if (textView != null) {
                textView.setText(c618760OOs.LL);
                C12ES.LJIILL(0, textView);
            }
            View viewFindViewById = this.itemView.findViewById(R.id.rh7);
            if (viewFindViewById != null) {
                C0DTR.LIZIZ(viewFindViewById);
                return;
            }
            return;
        }
        View viewFindViewById2 = this.itemView.findViewById(R.id.rh7);
        if (viewFindViewById2 != null) {
            C12ES.LJIILL(0, viewFindViewById2);
        }
        View viewFindViewById3 = this.itemView.findViewById(R.id.rh8);
        if (viewFindViewById3 == null) {
            return;
        }
        C0DTR.LIZIZ(viewFindViewById3);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C618760OOs c618760OOs = (C618760OOs) interfaceC1891350zJl;
        super.onBindItemView(c618760OOs);
        I5(c618760OOs);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        TextView textView;
        C618760OOs c618760OOs = (C618760OOs) interfaceC1891350zJl;
        super.onBindItemView(c618760OOs, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (objLJJJLZIJ != null && (objLJJJLZIJ instanceof C618780OOu)) {
            C618780OOu c618780OOu = (C618780OOu) objLJJJLZIJ;
            if (c618780OOu.LIZ && (textView = (TextView) this.itemView.findViewById(R.id.rh8)) != null) {
                textView.setText(c618760OOs.LL);
            }
            if (c618780OOu.LIZIZ) {
                I5(c618760OOs);
            }
        }
    }
}
