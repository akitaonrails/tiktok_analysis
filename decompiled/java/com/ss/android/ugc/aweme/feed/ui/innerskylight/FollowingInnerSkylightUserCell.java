package com.ss.android.ugc.aweme.feed.ui.innerskylight;

import X.C01GW;
import X.C1220000hqw;
import X.C1322110kVd;
import X.C1324840ka2;
import X.C13LE;
import X.C19719912Dl;
import X.C418900Gbg;
import X.C452070Ho5;
import X.C452501pT;
import X.C636540Oxw;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS169S0100000_35;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserRedDot;
import com.ss.android.ugc.aweme.model.SkylightFollowingUserItem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class FollowingInnerSkylightUserCell extends PowerCell<SkylightFollowingUserItem> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 131));
    public final C736950SvV LLILLJJLI;
    public final C736950SvV LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.c7u;
    }

    public final C418900Gbg I5() {
        return (C418900Gbg) this.LL.getValue();
    }

    public FollowingInnerSkylightUserCell() {
        AFwS226S0000000_35 aFwS226S0000000_35 = AFwS226S0000000_35.get$arr$(205);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FollowingInnerSkylightAssemViewModel.class);
        AFwS283S0000000_35 aFwS283S0000000_35 = AFwS283S0000000_35.get$arr$(37);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLILLJJLI = new C736950SvV(c19719912DlLIZ, aFwS226S0000000_35, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS283S0000000_35, null, null, null);
        AFwS226S0000000_35 aFwS226S0000000_352 = AFwS226S0000000_35.get$arr$(204);
        this.LLILLL = new C736950SvV(C13LE.LIZ(FollowInnerFeedVM.class), aFwS226S0000000_352, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS283S0000000_35.get$arr$(38), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new ACListenerS169S0100000_35(this, 7), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        SkylightFollowingUserItem skylightFollowingUserItem;
        User user;
        String uid;
        super.onViewAttachedToWindow();
        Object tag = this.itemView.getTag();
        if (!(tag instanceof SkylightFollowingUserItem) || (skylightFollowingUserItem = (SkylightFollowingUserItem) tag) == null || (user = skylightFollowingUserItem.followingUser) == null || (uid = user.getUid()) == null) {
            return;
        }
        C636540Oxw c636540Oxw = C636540Oxw.LIZ;
        int bindingAdapterPosition = getBindingAdapterPosition();
        c636540Oxw.getClass();
        C636540Oxw.LIZIZ(bindingAdapterPosition, uid);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer num;
        SkylightFollowingUserItem skylightFollowingUserItem = (SkylightFollowingUserItem) interfaceC1891350zJl;
        super.onBindItemView(skylightFollowingUserItem);
        User user = skylightFollowingUserItem.followingUser;
        if (user != null) {
            C418900Gbg c418900GbgI5 = I5();
            if (!(c418900GbgI5 instanceof C1322110kVd)) {
                c418900GbgI5 = null;
            }
            C1324840ka2.LJ(c418900GbgI5, user.getAvatarThumb(), I5().getWidth(), I5().getHeight(), null, null, true, null, false);
        }
        SkylightFollowingUserRedDot skylightFollowingUserRedDot = skylightFollowingUserItem.redDot;
        if (skylightFollowingUserRedDot != null && (num = skylightFollowingUserRedDot.status) != null && num.intValue() == 1) {
            C418900Gbg.LJIIJJI(I5(), true);
        } else {
            C418900Gbg.LJIIJJI(I5(), false);
        }
        this.itemView.setTag(skylightFollowingUserItem);
        if (skylightFollowingUserItem.LL) {
            I5().setShadow(false);
        } else {
            I5().setShadow(true);
        }
    }
}
