package com.ss.android.ugc.aweme.detail.component.biz.friends;

import X.C01GW;
import X.C1356620lPI;
import X.C1558520qew;
import X.C20642515q3;
import X.C2097908Jt;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailCommentButtonAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailBottomBarCommentButtonAssem extends UISlotAssem implements FriendsDetailCommentButtonAbility, InterfaceC1554640qYg {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 118));
    public final C630740Ooa LLJJIII = C628500Oky.LIZ(new AwS555S0100000_11(this, 116));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 117));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bko;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2035523554) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new ACListenerS146S0100000_11(this, 3), view);
        ((TextView) this.LLJJIII.getValue()).setMaxWidth(((Number) this.LLJJIJI.getValue()).intValue());
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailCommentButtonAbility
    public final void setCommentText(String str) {
        ((TextView) this.LLJJIII.getValue()).setText(str);
        getContentView().setContentDescription(C1356620lPI.LIZ(C20642515q3.LJI(2131823206), C2097908Jt.LIZJ(new Pair("number", ((AppCompatTextView) this.LLJJIII.getValue()).getText().toString()))));
    }
}
