package com.ss.android.ugc.aweme.feed.ui.innerskylight;

import X.C01GW;
import X.C1220000hqw;
import X.C1322110kVd;
import X.C1324840ka2;
import X.C13LE;
import X.C1595930rdH;
import X.C19719912Dl;
import X.C418900Gbg;
import X.C452070Ho5;
import X.C452501pT;
import X.C636540Oxw;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1595940rdI;
import X.InterfaceC1891350zJl;
import Y.ACListenerS169S0100000_35;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserRedDot;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class FollowingInnerSkylightLiveCell extends PowerCell<C1595930rdH> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 130));
    public final C736950SvV LLILLJJLI;
    public final C736950SvV LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.c7u;
    }

    public final C418900Gbg I5() {
        return (C418900Gbg) this.LL.getValue();
    }

    public FollowingInnerSkylightLiveCell() {
        AFwS226S0000000_35 aFwS226S0000000_35 = AFwS226S0000000_35.get$arr$(203);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FollowingInnerSkylightAssemViewModel.class);
        AFwS283S0000000_35 aFwS283S0000000_35 = AFwS283S0000000_35.get$arr$(35);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLILLJJLI = new C736950SvV(c19719912DlLIZ, aFwS226S0000000_35, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS283S0000000_35, null, null, null);
        AFwS226S0000000_35 aFwS226S0000000_352 = AFwS226S0000000_35.get$arr$(202);
        this.LLILLL = new C736950SvV(C13LE.LIZ(FollowInnerFeedVM.class), aFwS226S0000000_352, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS283S0000000_35.get$arr$(36), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new ACListenerS169S0100000_35(this, 6), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C1595930rdH c1595930rdH;
        User user;
        String uid;
        super.onViewAttachedToWindow();
        Object tag = this.itemView.getTag();
        if (!(tag instanceof C1595930rdH) || (c1595930rdH = (C1595930rdH) tag) == null || (user = c1595930rdH.LLILLJJLI) == null || (uid = user.getUid()) == null) {
            return;
        }
        C636540Oxw c636540Oxw = C636540Oxw.LIZ;
        int bindingAdapterPosition = getBindingAdapterPosition();
        c636540Oxw.getClass();
        C636540Oxw.LIZIZ(bindingAdapterPosition, uid);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        SkylightFollowingUserRedDot skylightFollowingUserRedDotLJJJI;
        Integer num;
        C1595930rdH c1595930rdH = (C1595930rdH) interfaceC1891350zJl;
        super.onBindItemView(c1595930rdH);
        C418900Gbg c418900GbgI5 = I5();
        UrlModel avatarThumb = null;
        if (!(c418900GbgI5 instanceof C1322110kVd)) {
            c418900GbgI5 = null;
        }
        User user = c1595930rdH.LLILLJJLI;
        if (user != null) {
            avatarThumb = user.getAvatarThumb();
        }
        C1324840ka2.LJ(c418900GbgI5, avatarThumb, I5().getWidth(), I5().getHeight(), null, null, true, null, false);
        InterfaceC1595940rdI interfaceC1595940rdI = c1595930rdH.LL;
        if (interfaceC1595940rdI != null && (skylightFollowingUserRedDotLJJJI = interfaceC1595940rdI.LJJJI()) != null && (num = skylightFollowingUserRedDotLJJJI.status) != null && num.intValue() == 1) {
            C418900Gbg.LJIIJJI(I5(), true);
        } else {
            C418900Gbg.LJIIJJI(I5(), false);
        }
        if (c1595930rdH.LLILLL) {
            I5().setShadow(false);
        } else {
            I5().setShadow(true);
        }
        this.itemView.setTag(c1595930rdH);
    }
}
