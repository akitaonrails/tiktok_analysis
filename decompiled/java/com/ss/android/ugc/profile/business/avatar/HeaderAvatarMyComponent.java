package com.ss.android.ugc.profile.business.avatar;

import X.AbstractC738140SxQ;
import X.C0BWT;
import X.C1250210idf;
import X.C1558520qew;
import X.C1720106oR;
import X.C1ELC;
import X.C20673215v0;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C723850SaN;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1250320idq;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.profile.business.avatar.data.AvatarNormalData;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.avatar.base.IHeaderAvatarAbility;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS385S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderAvatarMyComponent extends BaseUIComponent {
    public AvatarNormalData LLJJL;

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        IHeaderAvatarAbility iHeaderAvatarAbility;
        View view = this.LLJJ;
        if (view == null || (iHeaderAvatarAbility = (IHeaderAvatarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAvatarAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderAvatarAbility.LJIIIZ(this.LLJILLL, view, str);
    }

    public final void up() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        for (InterfaceC665370Q7z interfaceC665370Q7z : copyOnWriteArrayList) {
            if (interfaceC665370Q7z instanceof InterfaceC1250320idq) {
                ((InterfaceC1250320idq) interfaceC665370Q7z).d0();
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        up();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            ep(nVar);
        }
        up();
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            for (InterfaceC665370Q7z interfaceC665370Q7z : copyOnWriteArrayList) {
                if (interfaceC665370Q7z instanceof InterfaceC1250320idq) {
                    ((InterfaceC1250320idq) interfaceC665370Q7z).Qd(this.LLJJL);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        View viewSd;
        View viewLJ;
        if (C1ELC.LIZLLL()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (C0BWT.LIZ()) {
                viewLJ = C20673215v0.LJ(R.layout.ebr, getContext());
            } else {
                viewLJ = C20673215v0.LJ(R.layout.ebs, getContext());
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("generateComponentView avatar costTime: ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C1720106oR.LJI("Profile_HeaderAvatarMyComponent", C2188811AlT.LIZIZ(sbLIZ));
            return viewLJ;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (C0BWT.LIZ()) {
            viewSd = C786410Ut5.Sd(R.layout.ebr, C786410Ut5.ne(getContext()), null);
        } else {
            viewSd = C786410Ut5.Sd(R.layout.ebs, C786410Ut5.ne(getContext()), null);
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("old generateComponentView avatar costTime: ");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis2);
        C1720106oR.LJI("Profile_HeaderAvatarMyComponent", C2188811AlT.LIZIZ(sbLIZ2));
        return viewSd;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        AvatarNormalData avatarNormalData;
        try {
            avatarNormalData = (AvatarNormalData) C1250210idf.LIZ(nVar.toString(), AvatarNormalData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            avatarNormalData = null;
        }
        this.LLJJL = avatarNormalData;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new AwS385S0200000_19(this, view, 49));
    }
}
