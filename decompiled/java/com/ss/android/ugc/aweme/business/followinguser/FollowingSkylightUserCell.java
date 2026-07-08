package com.ss.android.ugc.aweme.business.followinguser;

import X.C01GW;
import X.C1220000hqw;
import X.C1243240iSQ;
import X.C1324840ka2;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1596560reI;
import X.C1605320rsQ;
import X.C1607400rvm;
import X.C1608320rxG;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1605560rso;
import X.EnumC1606080rte;
import X.InterfaceC1605330rsR;
import X.InterfaceC1891350zJl;
import Y.ACListenerS158S0100000_24;
import Y.ARunnableS124S0100000_24;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityExperienceExp;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserRedDot;
import com.ss.android.ugc.aweme.model.SkylightFollowingUserItem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingSkylightUserCell extends BaseSkylightCell<SkylightFollowingUserItem> implements InterfaceC1605330rsR {
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 114));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 115));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 117));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 116));
    public final C736950SvV LLILZLL = new C736950SvV(C13LE.LIZ(FeedSkylightListViewModel.class), AFwS213S0000000_24.get$arr$(78), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(38), null, null, null);

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View L5() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final User N5() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View R5() {
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.c78;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell
    public final View Hy1() {
        return (View) this.LLILLJJLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final Map<String, String> P5() {
        return new HashMap();
    }

    public final View U5() {
        return (View) this.LLILZIL.getValue();
    }

    public final void V5() {
        SkylightFollowingUserItem skylightFollowingUserItem;
        Object tag = this.itemView.getTag();
        if (!(tag instanceof SkylightFollowingUserItem) || (skylightFollowingUserItem = (SkylightFollowingUserItem) tag) == null) {
            return;
        }
        SkylightFollowingUserRedDot skylightFollowingUserRedDot = skylightFollowingUserItem.redDot;
        if (skylightFollowingUserRedDot != null) {
            skylightFollowingUserRedDot.setStatus(0);
        }
        C786410Ut5.LJLLLLLL(8, U5());
    }

    @Override // X.InterfaceC1605330rsR
    public final String getAuthorId() {
        SkylightFollowingUserItem skylightFollowingUserItem;
        User user;
        Object tag = this.itemView.getTag();
        if (!(tag instanceof SkylightFollowingUserItem) || (skylightFollowingUserItem = (SkylightFollowingUserItem) tag) == null || (user = skylightFollowingUserItem.followingUser) == null) {
            return null;
        }
        return user.getUid();
    }

    @Override // X.InterfaceC1605330rsR
    public final String getEnterFrom() {
        return C1596560reI.LIZIZ(uH2());
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1605320rsQ.LIZ(this, this);
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 6), this.itemView);
        C1607400rvm.LIZIZ.LIZIZ(EnumC1606080rte.FOLLOW_SKYLIGHT, new C1608320rxG(this.itemView, (View) this.LLILLL.getValue(), Hy1(), (View) this.LLILZ.getValue(), (TuxIconView) null, 48), false);
        if (FollowingSkylightAbilityExperienceExp.LIZ()) {
            HandlerHook.viewPost(this.itemView, new ARunnableS124S0100000_24(this, 15));
        }
    }

    public final int uH2() {
        Fragment fragmentLIZ;
        ISkylightListAbility iSkylightListAbility;
        LifecycleOwner parent = getParent();
        if (parent == null || (fragmentLIZ = C1596560reI.LIZ(parent)) == null || (iSkylightListAbility = (ISkylightListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), ISkylightListAbility.class, null)) == null) {
            return -1;
        }
        return iSkylightListAbility.uH2();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final EnumC1605560rso I5() {
        return EnumC1605560rso.GO_LIVE;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer num;
        RemoteImageView remoteImageView;
        SkylightFollowingUserItem skylightFollowingUserItem = (SkylightFollowingUserItem) interfaceC1891350zJl;
        super.onBindItemView(skylightFollowingUserItem);
        User user = skylightFollowingUserItem.followingUser;
        if (user != null) {
            TextView textView = (TextView) this.LLILZ.getValue();
            C1243240iSQ.LIZ.getClass();
            String nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            textView.setText(nickname);
            View viewHy1 = Hy1();
            if (viewHy1 instanceof RemoteImageView) {
                remoteImageView = (RemoteImageView) viewHy1;
            } else {
                remoteImageView = null;
            }
            C1324840ka2.LJFF(remoteImageView, user.getAvatar168());
        }
        View viewU5 = U5();
        SkylightFollowingUserRedDot skylightFollowingUserRedDot = skylightFollowingUserItem.redDot;
        int i = 0;
        if (skylightFollowingUserRedDot == null || (num = skylightFollowingUserRedDot.status) == null || num.intValue() != 1) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewU5);
        this.itemView.setTag(skylightFollowingUserItem);
    }
}
