package com.ss.android.ugc.profile.business.pgc;

import X.C0OO0;
import X.C1386470mBR;
import X.C13BV;
import X.C1722300uv6;
import X.EnumC1254690ikt;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.profile.IMHostApiIProfileExService;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.multiapp.IProfileExService;
import com.ss.android.ugc.ur.alias.IAliasService;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileExServiceImpl implements IProfileExService, IMHostApiIProfileExService {
    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LIZ() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final void LIZIZ(C1386470mBR c1386470mBR, String str) {
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LIZLLL() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJ() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJFF() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJII() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJIIIZ() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJIIJ() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJIIL() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final void LJIILJJIL(BaseContainerComponent baseContainerComponent) {
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJIILL() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJIILLIIL() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJIIZILJ() {
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final void LJIJ(int i, Aweme aweme, String str) {
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final C1722300uv6 LJIJI(int i, Fragment fragment) {
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJIJJ() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJIJJLI() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJIL() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJJ() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJJI() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJJIFFI() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJJII() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJJIIJ() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJJIIJZLJL() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final boolean LJJIIZ() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final String LJI() {
        return String.valueOf(EnumC1254690ikt.OTHER_PLATFORM.getSceneID());
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.profile.IMHostApiIProfileExService
    public final C0OO0 getAvatarPresenter() {
        IProfileService iProfileService = (IProfileService) PluggableExtentionKt.pluggableSpi$default(IProfileService.class, false, false, false, 14, null);
        if (iProfileService != null) {
            return iProfileService.getAvatarPresenter();
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final List<String> LJJIII() {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.profile.IMHostApiIProfileExService
    public final String LIZJ(String str) {
        IAliasService iAliasService = (IAliasService) PluggableExtentionKt.pluggableSpi$default(IAliasService.class, false, false, false, 14, null);
        if (iAliasService != null) {
            return iAliasService.LIZJ(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.multiapp.IProfileExService
    public final String LJIILIIL(boolean z) {
        if (z) {
            return String.valueOf(EnumC1254690ikt.SELF_PLATFORM.getSceneID());
        }
        return String.valueOf(EnumC1254690ikt.SELF_OTHER_VIEW.getSceneID());
    }
}
