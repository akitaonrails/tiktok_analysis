package com.ss.android.ugc.aweme.commercialize.quickconversion.service.player;

import X.C0T1R;
import X.C1058520deU;
import X.C128Y;
import X.C1483410ohn;
import X.C19EG;
import X.C1E5F;
import X.C2188811AlT;
import X.InterfaceC1603190roz;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class QuickActionPlayerService implements IQuickActionPlayerService {
    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService
    public final boolean isVideoPlaying() {
        return C1483410ohn.LJLJJI().isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService
    public final void playingVideoMute() {
        C1483410ohn.LJLJJI().LJFF();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService
    public final void playingVideoPause() {
        C1483410ohn.LJLJJI().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService
    public final void playingVideoResume() {
        C1483410ohn.LJLJJI().LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService
    public final void playingVideoUnMute() {
        C1483410ohn.LJLJJI().LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService
    public final boolean LIZ(Activity activity) {
        String simpleName;
        C128Y c128y;
        InterfaceC1603190roz interfaceC1603190roz;
        boolean z;
        Fragment fragmentLIZ;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        C128Y next;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryResumePlayer activity=");
        IPlayerComponentAbility iPlayerComponentAbilityX32 = null;
        if (activity != null) {
            simpleName = activity.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        sbLIZ.append(simpleName);
        C2188811AlT.LIZIZ(sbLIZ);
        Fragment fragmentLJFF = C1E5F.LIZIZ.LJFF(activity);
        if (fragmentLJFF != null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ2 = C0T1R.LIZJ(fragmentLJFF);
            if (iFeedPanelPlatformAbilityLIZJ2 != null) {
                iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityLIZJ2.x32();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("resolvePlayerAbility detailFragment ability=");
            if (iPlayerComponentAbilityX32 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ2.append(z2);
            C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
                Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next instanceof InterfaceC1603190roz) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                c128y = (Fragment) next;
            } else {
                c128y = null;
            }
            if ((c128y instanceof InterfaceC1603190roz) && (interfaceC1603190roz = (InterfaceC1603190roz) c128y) != null) {
                Fragment curFragment = interfaceC1603190roz.getCurFragment();
                if (curFragment != null && (fragmentLIZ = C1058520deU.LIZ(curFragment)) != null && (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragmentLIZ)) != null) {
                    iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityLIZJ.x32();
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("resolvePlayerAbility mainFragment ability=");
                if (iPlayerComponentAbilityX32 != null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ3.append(z);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
            return false;
        }
        if (iPlayerComponentAbilityX32 != null) {
            iPlayerComponentAbilityX32.tryResumePlay();
            return true;
        }
        return false;
    }
}
