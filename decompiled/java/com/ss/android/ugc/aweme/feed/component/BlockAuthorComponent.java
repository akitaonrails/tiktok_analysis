package com.ss.android.ugc.aweme.feed.component;

import X.C01GW;
import X.C14EU;
import X.C1566140qrE;
import X.C299750Boz;
import X.C452501pT;
import X.C486890J7n;
import X.C588430N6b;
import X.C606130Npz;
import X.C606150Nq1;
import X.C606500Nqa;
import X.C630740Ooa;
import X.C888460YtI;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS127S0110000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class BlockAuthorComponent extends BasePanelComponent {
    public final C01GW LL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 135));
    public final C01GW LLILLJJLI;

    public BlockAuthorComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 134), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS127S0110000_9(false, (InterfaceC1565950qqv) this, 0));
        }
        this.LLILLJJLI = c01gwLIZIZ;
    }

    @Override // X.AbstractC738140SxQ
    public final void onAssemPostCreate() {
        super.onAssemPostCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        User user;
        String uid;
        DataLayerAbility dataLayerAbility;
        List<Aweme> items;
        DataLayerAbility dataLayerAbility2;
        if (c888460YtI != null && (user = c888460YtI.LIZ) != null && (uid = user.getUid()) != null) {
            C588430N6b.LIZ.add(uid);
            if (this.LLILLJJLI.getValue() != null && (dataLayerAbility = (DataLayerAbility) this.LLILLJJLI.getValue()) != null && (items = dataLayerAbility.getItems()) != null) {
                ArrayList arrayList = new ArrayList();
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
                if (iFeedPanelPlatformAbility != null) {
                    int size = items.size();
                    for (int iLJLJJL = iFeedPanelPlatformAbility.LJLJJL() + 1; iLJLJJL < size; iLJLJJL++) {
                        Aweme aweme = (Aweme) ListProtector.get(items, iLJLJJL);
                        if (aweme.getAuthor() != null && TextUtils.equals(aweme.getAuthor().getUid(), uid)) {
                            aweme.getAuthor().setBlock(true);
                            arrayList.add(aweme);
                        }
                    }
                    if (!arrayList.isEmpty() && (dataLayerAbility2 = (DataLayerAbility) this.LLILLJJLI.getValue()) != null) {
                        C606150Nq1 c606150Nq1 = C606500Nqa.LIZLLL;
                        dataLayerAbility2.KO1(arrayList, C606130Npz.LIZ("delete_block_user"));
                    }
                }
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUnBlockUserEvent(C486890J7n c486890J7n) {
        User user;
        String uid;
        if (c486890J7n != null && (user = c486890J7n.LIZ) != null && (uid = user.getUid()) != null) {
            C588430N6b.LIZ.remove(uid);
        }
    }
}
