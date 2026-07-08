package com.ss.android.ugc.aweme.aime.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C627340Oj6;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.aime.AIMEDetailViewModel;
import com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AIMENotAvailableFullPageAssem extends DetailPageStatusViewAssem {
    public static final C627340Oj6 LLJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Oj6] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AIMENotAvailableFullPageAssem.class, "templateDetailVM", "getTemplateDetailVM()Lcom/ss/android/ugc/aweme/aime/AIMEDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJIL = new Object() { // from class: X.0Oj6
        };
    }

    public AIMENotAvailableFullPageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AIMEDetailViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 59), AFwS240S0000000_9.get$arr$(55), null, true);
    }

    @Override // com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    /* JADX INFO: renamed from: do */
    public final void mo127do() {
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber
    public final void t0() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OjC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C615700OCy) obj).LL;
            }
        }, null, null, null, new AwS588S0100000_9(this, 61), 14, null);
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        getConfig().LLILZ.put(Scene.SCENE_SERVICE, "aime_not_available");
        super.onViewCreated(view);
    }
}
