package com.ss.android.ugc.aweme.tako.aivideo.detail.assem;

import X.C019F;
import X.C09R3;
import X.C0QSJ;
import X.C127G;
import X.C1327505Hl;
import X.C13LE;
import X.C14EU;
import X.C1597406Ng;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C1BNE;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C687700QyG;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C737030Svd;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS378S0100000_2;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.tako.aivideo.detail.ability.TakoAIVideoOverlayAbility;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import com.ss.android.ugc.aweme.tako.aivideo.detail.vm.AIVideoBottomTextInputViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoAIVideoFullscreenTextInputSlotAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C2252321DDq LLJJI;
    public View LLJJIII;
    public volatile TakoAIVideoOverlayAbility LLJJIJI;
    public C127G LLJJIJIIJIL;
    public InterfaceC665370Q7z LLJJIJIL;
    public C0QSJ LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAIVideoFullscreenTextInputSlotAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/vm/AIVideoBottomTextInputViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoAIVideoFullscreenTextInputSlotAssem.class, "rtcAbility", "getRtcAbility()Lcom/ss/android/ugc/aweme/tako/aivideo/rtc/ability/ITakoRTCAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TakoAIVideoFullscreenTextInputSlotAssem.class, "overlayAbility", "getOverlayAbility()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/ability/TakoAIVideoOverlayAbility;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public TakoAIVideoFullscreenTextInputSlotAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AIVideoBottomTextInputViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 838), AFwS229S0000000_2.get$arr$(510), null, true);
        this.LLJJI = C1BNE.LIZ(Boolean.FALSE);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fju;
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

    public final C0QSJ hp() {
        C0QSJ c0qsj = this.LLJJJ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJIJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{TakoAIVideoDetailScope.class});
        this.LLJJJ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIJIIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJIIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{AIVideoBottomTextInputViewModel.class, new AObjectS378S0100000_2(this, 0)}, defaultViewModelProviderFactory);
                    this.LLJJIJIIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        super.onDestroy();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onVideoEvent(C737030Svd c737030Svd) {
        C19EG c19egLIZ;
        C1597406Ng c1597406Ng;
        if (c737030Svd.LIZ != 76 || (c19egLIZ = C724240Sb0.LIZ(this)) == null || c737030Svd.LJIILLIIL != System.identityHashCode(c19egLIZ)) {
            return;
        }
        Object obj = c737030Svd.LIZIZ;
        if ((obj instanceof C1597406Ng) && (c1597406Ng = (C1597406Ng) obj) != null) {
            this.LLJJI.setValue(Boolean.valueOf(c1597406Ng.LIZ));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = view.findViewById(R.id.x3y);
        C723850SaN.LIZLLL(this, new AwS368S0200000_2(this, (ComposeView) view.findViewById(R.id.x3x), 63));
        View view2 = this.LLJJIII;
        if (view2 != null) {
            TakoAIVideoOverlayAbility takoAIVideoOverlayAbility = this.LLJJIJI;
            if (takoAIVideoOverlayAbility == null) {
                synchronized (this) {
                    takoAIVideoOverlayAbility = this.LLJJIJI;
                    if (takoAIVideoOverlayAbility == null) {
                        C0QSJ c0qsjHp = hp();
                        if (c0qsjHp != null) {
                            takoAIVideoOverlayAbility = (TakoAIVideoOverlayAbility) c0qsjHp.getAbility(TakoAIVideoOverlayAbility.class);
                            C687700QyG.LJ(takoAIVideoOverlayAbility, TakoAIVideoOverlayAbility.class);
                        } else {
                            takoAIVideoOverlayAbility = null;
                        }
                        this.LLJJIJI = takoAIVideoOverlayAbility;
                    }
                }
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1327505Hl(takoAIVideoOverlayAbility.Vg2(), this, view2, null), 3);
        }
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
    }
}
