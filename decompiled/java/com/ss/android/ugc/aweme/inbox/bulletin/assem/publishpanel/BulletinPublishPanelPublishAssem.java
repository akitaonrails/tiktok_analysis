package com.ss.android.ugc.aweme.inbox.bulletin.assem.publishpanel;

import X.C019F;
import X.C06J8;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.publishpanel.BulletinPublishPanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import wh6.AbS686S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class BulletinPublishPanelPublishAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinPublishPanelPublishAssem.class, "bulletinPublishPanelVM", "getBulletinPublishPanelVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/publishpanel/BulletinPublishPanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BulletinPublishPanelPublishAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinPublishPanelViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 623), AFwS229S0000000_2.get$arr$(348), null, true);
        this.LLJJIII = new C1559260qg8(new C723580SZw(this, C06J8.class, "bulletin_publish_data"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a82;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.d4h);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS686S0100000_2(this, 4), viewFindViewById);
        }
    }
}
