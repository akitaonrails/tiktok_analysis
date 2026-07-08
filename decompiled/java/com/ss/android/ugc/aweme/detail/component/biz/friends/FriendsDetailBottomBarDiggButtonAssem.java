package com.ss.android.ugc.aweme.detail.component.biz.friends;

import X.C01GW;
import X.C0CBR;
import X.C1356620lPI;
import X.C1558520qew;
import X.C20642515q3;
import X.C2097908Jt;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C730950Slp;
import X.C731910SnN;
import X.C732790Son;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailDiggButtonAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS83S0100000_11;
import kotlin.Pair;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailBottomBarDiggButtonAssem extends UISlotAssem implements FriendsDetailDiggButtonAbility, InterfaceC1554640qYg {
    public final C630740Ooa LLJJI = C628500Oky.LIZ(new AwS555S0100000_11(this, 119));
    public final C630740Ooa LLJJIII = C628500Oky.LIZ(new AwS555S0100000_11(this, 120));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 121));
    public final C630740Ooa LLJJIJIIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 122));
    public final C630740Ooa LLJJIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 123));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bkp;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 544725230) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailDiggButtonAbility
    public final void TL() {
        if (C0CBR.LIZLLL) {
            C730950Slp.LIZ((View) this.LLJJI.getValue());
        } else {
            ((C732790Son) this.LLJJI.getValue()).LIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailDiggButtonAbility
    public final void gM2(C731910SnN c731910SnN) {
        String strLIZ;
        ((C732790Son) this.LLJJI.getValue()).setSelected(c731910SnN.LIZIZ);
        View viewFindViewById = getContentView().findViewById(R.id.fuc);
        if (((View) this.LLJJI.getValue()).isSelected()) {
            strLIZ = C20642515q3.LJI(2131823228);
        } else {
            strLIZ = C1356620lPI.LIZ(C20642515q3.LJI(2131823204), C2097908Jt.LIZJ(new Pair("number", String.valueOf(c731910SnN.LIZ))));
        }
        viewFindViewById.setContentDescription(strLIZ);
        String str = c731910SnN.LIZ;
        if (str != null) {
            ((TextView) this.LLJJIII.getValue()).setText(str);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((TextView) this.LLJJIII.getValue()).setMaxWidth(((Number) this.LLJJIJI.getValue()).intValue());
        C786410Ut5.I7(new AkS83S0100000_11(this, 0), view);
    }
}
