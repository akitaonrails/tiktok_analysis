package com.ss.android.ugc.profile.business.profile.menu.root.base;

import X.C1249090ibr;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C723590SZx;
import X.C724240Sb0;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.business.profile.menu.ability.IMenuRootAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileMenuRootBaseComponent extends BaseContainerComponent implements IMenuRootAbility {
    public List<? extends ProfileComponents> LLJJIJI;
    public final C1559260qg8 LLJJIJIIJIL = new C1559260qg8(new C723590SZx(this, C1249090ibr.class, "root_data"), checkSupervisorPrepared());
    public final List<String> LLJJIJIL = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006c A[SYNTHETIC] */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void No() {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.menu.root.base.ProfileMenuRootBaseComponent.No():void");
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        C1249090ibr c1249090ibr = (C1249090ibr) this.LLJJIJIIJIL.getValue();
        this.LLJJIJI = c1249090ibr != null ? (List) c1249090ibr.LL : null;
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IMenuRootAbility.class, null, null);
        }
    }
}
