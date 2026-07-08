package com.ss.android.ugc.aweme.tako.aivideo.detail.assem;

import X.C01GW;
import X.C0QSJ;
import X.C0T1R;
import X.C1372310lob;
import X.C13LE;
import X.C14EU;
import X.C1862330yYx;
import X.C2189821An6;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C679360Qko;
import X.C687700QyG;
import X.C690940R8i;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1302070jzJ;
import X.InterfaceC1682240tsU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS574S0100000_30;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoAIVideoTopBarAssem extends BasePanelUIComponent implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public View LLJILLL;
    public View LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public volatile InterfaceC1682240tsU LLJJJIL;
    public InterfaceC665370Q7z LLJJJJ;
    public C0QSJ LLJJJJJIL;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 202));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 841));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 840));
    public final Set<String> LLJJJ = new LinkedHashSet();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAIVideoTopBarAssem.class, "hostAbility", "getHostAbility()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/ability/TakoAIVideoHostAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoAIVideoDetailScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoAIVideoDetailScope.class);
        return arrayList;
    }

    public final InterfaceC1682240tsU Go() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJJJJJIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJJ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJJJ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{TakoAIVideoDetailScope.class});
            this.LLJJJJJIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1682240tsU interfaceC1682240tsU = (InterfaceC1682240tsU) c0qsjLIZLLL.getAbility(InterfaceC1682240tsU.class);
        C687700QyG.LJ(interfaceC1682240tsU, InterfaceC1682240tsU.class);
        return interfaceC1682240tsU;
    }

    public final void Zo() {
        DetailNavArgModel navArgModel;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        Aweme awemeLJIIIIZZ;
        if (this.LLJJIJIIJIL == null) {
            return;
        }
        InterfaceC1302070jzJ interfaceC1302070jzJ = (InterfaceC1302070jzJ) this.LLJIJIL.getValue();
        String str = (interfaceC1302070jzJ == null || !interfaceC1302070jzJ.LJFF()) ? "on" : "off";
        if (this.LLJJJ.add(str)) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String strLo = Lo();
            String str2 = (String) this.LLJILJILJ.getValue();
            String strNo = No();
            String strSo = So();
            Fragment fragment = getPanelContext().LJ;
            String takoVideoSessionId = null;
            String aid = (fragment == null || (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment)) == null || (awemeLJIIIIZZ = iFeedPanelPlatformAbilityLIZJ.LJIIIIZZ()) == null) ? null : awemeLJIIIIZZ.getAid();
            C2189821An6 c2189821An6 = getPanelContext().LIZJ;
            if (c2189821An6 != null && (navArgModel = c2189821An6.getNavArgModel()) != null) {
                takoVideoSessionId = navArgModel.getTakoVideoSessionId();
            }
            C1862330yYx.LLFF(c1862330yYx, strLo, str2, strNo, strSo, null, null, null, "tako_video", str, aid, takoVideoSessionId, Ho(), 4208);
        }
    }

    public final Integer Ho() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null && (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment)) != null) {
            Integer numValueOf = Integer.valueOf(iFeedPanelPlatformAbilityLIZJ.LJLLJ());
            if (numValueOf.intValue() >= 0) {
                return numValueOf;
            }
        }
        return null;
    }

    public final String Lo() {
        String eventType;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        return (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) ? "" : eventType;
    }

    public final String No() {
        String processId;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        return (c2189821An6 == null || (processId = c2189821An6.getProcessId()) == null) ? "" : processId;
    }

    public final String Oo() {
        DetailNavArgModel navArgModel;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 == null || (navArgModel = c2189821An6.getNavArgModel()) == null) {
            return null;
        }
        return navArgModel.getTakoScreenType();
    }

    public final String So() {
        DetailNavArgModel navArgModel;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 == null || (navArgModel = c2189821An6.getNavArgModel()) == null) {
            return null;
        }
        return navArgModel.getTakoSessionId();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        super.onDestroy();
    }

    public final void Jo(boolean z) {
        int i;
        TuxIconView tuxIconView = this.LLJJIJIIJIL;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (z) {
                i = R.raw.icon_speaker_2_slash_ltr;
            } else {
                i = R.raw.icon_speaker_2_ltr;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLongPressDialogEvent(C1372310lob c1372310lob) {
        if (c1372310lob.LIZIZ == 2) {
            if (c1372310lob.LIZ) {
                View view = this.LLJILLL;
                if (view != null) {
                    C679360Qko.LIZ(1.0f, 0.0f, view);
                    return;
                }
                return;
            }
            View view2 = this.LLJILLL;
            if (view2 == null) {
                return;
            }
            C679360Qko.LIZ(0.0f, 1.0f, view2);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onOpenOnMuteEvent(C690940R8i c690940R8i) {
        InterfaceC1302070jzJ interfaceC1302070jzJ;
        if (c690940R8i.LIZ || this.LLJJIJIL || (interfaceC1302070jzJ = (InterfaceC1302070jzJ) this.LLJIJIL.getValue()) == null || !interfaceC1302070jzJ.LJFF()) {
            return;
        }
        interfaceC1302070jzJ.LIZ(false);
        Jo(false);
        Zo();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0198  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoTopBarAssem.onViewCreated(android.view.View):void");
    }

    public final void Vo(String str, String str2) {
        C1862330yYx.LJJII(C1862330yYx.LIZ, Lo(), (String) this.LLJILJILJ.getValue(), No(), So(), Oo(), str, str2);
    }
}
