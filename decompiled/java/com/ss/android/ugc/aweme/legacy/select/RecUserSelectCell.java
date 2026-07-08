package com.ss.android.ugc.aweme.legacy.select;

import X.C01GW;
import X.C0HZQ;
import X.C0QB7;
import X.C1261680iwA;
import X.C1263960izq;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1486105rn;
import X.C1767406w4;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS106S0200000_2;
import Y.ACListenerS137S0100000_2;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class RecUserSelectCell extends PowerCell<C1486105rn> {
    public SmartAvatarImageView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C0QB7 LLILZ;
    public C0HZQ LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 660));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.f_7;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        SelectedCardVM selectedCardVM = (SelectedCardVM) this.LLILZLL.getValue();
        C1486105rn item = getItem();
        selectedCardVM.getClass();
        String uid = item.LL.getUid();
        if (selectedCardVM.LLJJ.contains(uid)) {
            return;
        }
        selectedCardVM.LLJJ.add(uid);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        MutualStruct mutualStruct;
        boolean z;
        C1486105rn c1486105rn = (C1486105rn) interfaceC1891350zJl;
        super.onBindItemView(c1486105rn);
        User user = c1486105rn.LL;
        TuxTextView tuxTextView = this.LLILLJJLI;
        C0HZQ c0hzq = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C1261680iwA.LIZIZ(tuxTextView, user);
        SmartAvatarImageView smartAvatarImageView = this.LL;
        if (smartAvatarImageView == null) {
            smartAvatarImageView = null;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(user.getAvatarThumb()));
        c1331670kl3LJIIIIZZ.LJJ(smartAvatarImageView);
        c1331670kl3LJIIIIZZ.LIZLLL("RecUser");
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C0QB7 c0qb7 = this.LLILZ;
        if (c0qb7 == null) {
            c0qb7 = null;
        }
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct == null || (mutualStruct = matchedFriendStruct.mMutualStruct) == null) {
            mutualStruct = user.getMutualStruct();
        }
        if (mutualStruct != null && mutualStruct.total != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
            C786410Ut5.u1(c0qb7, 0);
            c0qb7.LIZ(mutualStruct, 4);
        } else {
            C786410Ut5.u1(c0qb7, 8);
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
            C1263960izq.LIZLLL(C1263960izq.LIZ, tuxTextView2, user, null, 6);
        }
        C0HZQ c0hzq2 = this.LLILZIL;
        if (c0hzq2 == null) {
            c0hzq2 = null;
        }
        c0hzq2.setChecked(c1486105rn.LLILLJJLI);
        SmartAvatarImageView smartAvatarImageView2 = this.LL;
        if (smartAvatarImageView2 == null) {
            smartAvatarImageView2 = null;
        }
        C786410Ut5.G9(smartAvatarImageView2, new ACListenerS106S0200000_2(this, user, 22));
        C786410Ut5.I7(new ACListenerS137S0100000_2(this, 92), this.itemView);
        C0HZQ c0hzq3 = this.LLILZIL;
        if (c0hzq3 != null) {
            c0hzq = c0hzq3;
        }
        C786410Ut5.D7(c0hzq, new C1767406w4(this, c1486105rn, 3));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewOnCreateItemView = super.onCreateItemView(viewGroup);
        this.LL = (SmartAvatarImageView) viewOnCreateItemView.findViewById(R.id.bhd);
        this.LLILLJJLI = (TuxTextView) viewOnCreateItemView.findViewById(R.id.p93);
        this.LLILLL = (TuxTextView) viewOnCreateItemView.findViewById(R.id.suu);
        this.LLILZ = (C0QB7) viewOnCreateItemView.findViewById(R.id.oym);
        this.LLILZIL = (C0HZQ) viewOnCreateItemView.findViewById(R.id.uk8);
        return viewOnCreateItemView;
    }
}
