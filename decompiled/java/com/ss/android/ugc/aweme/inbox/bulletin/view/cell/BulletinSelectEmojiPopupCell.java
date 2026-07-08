package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C01GW;
import X.C1196320hEk;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C13LE;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427100Gou;
import X.C452070Ho5;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.ACListenerS141S0100000_6;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.scope.BulletinSelectEmojiSheetScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class BulletinSelectEmojiPopupCell extends PowerCell<C427100Gou> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(109));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 429));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 428));
    public final C736950SvV LLILZ;

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

    public BulletinSelectEmojiPopupCell() {
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 427);
        this.LLILZ = new C736950SvV(C13LE.LIZ(BulletinEmojiViewModel.class), awS550S0100000_6, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(201), null, null, null);
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
        C786410Ut5.W5(this.itemView, layoutParams);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.v4r);
        if (tuxTextView != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, tuxTextView.getContext());
            if (numLIZJ != null) {
                numLIZJ.intValue();
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(28));
                c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(28));
                c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(28));
                c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(28));
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, c384050F3z.LIZ(tuxTextView.getContext()));
                stateListDrawable.addState(new int[0], new ColorDrawable(0));
                tuxTextView.setForeground(stateListDrawable);
            }
            tuxTextView.LJJJJI(34.0f);
            C786410Ut5.h9(tuxTextView, new ACListenerS141S0100000_6(this, 46));
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
