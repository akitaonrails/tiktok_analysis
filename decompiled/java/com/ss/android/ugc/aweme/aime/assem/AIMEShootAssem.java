package com.ss.android.ugc.aweme.aime.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C342770DcB;
import X.C535390KzB;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.aime.AIMEDetailViewModel;
import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.ss.android.ugc.aweme.detail.prefab.ShootAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AIMEShootAssem extends ShootAssem implements ShootAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final AssemVMLazy LLJJJJ;
    public C19EG LLJJJJJIL;
    public Fragment LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AIMEShootAssem.class, "aimeDetailVM", "getAimeDetailVM()Lcom/ss/android/ugc/aweme/aime/AIMEDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AIMEShootAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AIMEDetailViewModel.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 60), AFwS240S0000000_9.get$arr$(56), null, true);
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void te0() {
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void lP0() {
        Fragment fragment;
        String str;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(this.LLJJJJJIL, "style_page", true)) {
            return;
        }
        if (tp().LL != null && (fragment = this.LLJJJJLIIL) != null) {
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                C786410Ut5.LJJJI("enter_from", "style_page", arguments);
            }
            Bundle arguments2 = fragment.getArguments();
            if (arguments2 != null) {
                C786410Ut5.LJJJI("shoot_way", "style_page", arguments2);
            }
            if (C535390KzB.LIZ() && (str = tp().LL) != null) {
                IAIMEServices iAIMEServices = C342770DcB.LIZ() ? (IAIMEServices) PluggableExtentionKt.pluggableSpi$default(IAIMEServices.class, false, false, false, 14, null) : (IAIMEServices) ServiceManager.get().getService(IAIMEServices.class);
                if (iAIMEServices != null) {
                    iAIMEServices.LJIILLIIL(fragment, str, tp().LLILLJJLI, "style_page", "style_page", "style_page", tp().LLILLL);
                }
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "style_page");
        String str2 = tp().LLILLJJLI;
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("root_style_id", str2);
        String str3 = tp().LL;
        c2344009Gk.LJIIIIZZ("style_id", str3 != null ? str3 : "");
        c2344009Gk.LIZJ(2, "is_customize");
        C20684815ws.LJIILLIIL("try_style_click", c2344009Gk.LIZ);
    }

    public final AIMEDetailViewModel tp() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (AIMEDetailViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void nm1() {
        lP0();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.aime.assem.AIMEShootAssem for r9v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.detail.prefab.ShootAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aime.assem.AIMEShootAssem.onViewCreated(android.view.View):void");
    }
}
