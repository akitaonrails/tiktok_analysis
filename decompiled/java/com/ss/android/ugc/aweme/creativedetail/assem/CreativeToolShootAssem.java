package com.ss.android.ugc.aweme.creativedetail.assem;

import X.C1559260qg8;
import X.C1954807lC;
import X.C19EG;
import X.C2097608Jq;
import X.C627830Ojt;
import X.C627850Ojv;
import X.C627860Ojw;
import X.C723590SZx;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.IDuetDownloadService;
import com.ss.android.ugc.aweme.detail.prefab.ShootAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public final class CreativeToolShootAssem extends ShootAssem implements ShootAbility {
    public C19EG LLJJJJ;
    public Fragment LLJJJJJIL;
    public final C1559260qg8 LLJJJJLIIL = new C1559260qg8(new C723590SZx(this, C627830Ojt.class, null), checkSupervisorPrepared());

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void te0() {
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void lP0() {
        String enterFrom;
        C19EG c19eg;
        IDuetDownloadService iDuetDownloadService;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            C19EG c19eg2 = this.LLJJJJ;
            C627830Ojt c627830Ojt = (C627830Ojt) this.LLJJJJLIIL.getValue();
            if (c627830Ojt == null || (enterFrom = c627830Ojt.getEnterFrom()) == null) {
                enterFrom = "";
            }
            if (!creativeToolsPluginService.LIZJ(c19eg2, enterFrom, true) || (c19eg = this.LLJJJJ) == null) {
                return;
            }
            C627850Ojv c627850Ojv = C627850Ojv.LIZ;
            C627830Ojt c627830Ojt2 = (C627830Ojt) this.LLJJJJLIIL.getValue();
            if (c627830Ojt2 == null) {
                return;
            }
            c627850Ojv.getClass();
            if (c19eg.isFinishing()) {
                return;
            }
            int i = C627860Ojw.LIZ[c627830Ojt2.getBusinessType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new C1954807lC();
                }
                String id = c627830Ojt2.getId();
                if (id.length() > 0) {
                    SmartRouter.buildRoute(c19eg, UriProtector.parse("//studio/editor_pro").buildUpon().appendQueryParameter(Scene.SCENE_SERVICE, "open_ep_magic").appendQueryParameter("resource_type", c627830Ojt2.getExtra()).appendQueryParameter("resource_id", c627830Ojt2.getResourceId()).appendQueryParameter("enter_from", c627830Ojt2.getEnterFrom()).appendQueryParameter("enter_method", c627830Ojt2.getEnterFrom()).appendQueryParameter("effect_id", id).toString()).open();
                    return;
                }
                return;
            }
            IDuetDownloadService iDuetDownloadService2 = (IDuetDownloadService) PluggableExtentionKt.pluggableSpi$default(IDuetDownloadService.class, false, false, false, 14, null);
            if (iDuetDownloadService2 != null) {
                iDuetDownloadService2.LIZIZ(c627830Ojt2.getEnterFrom(), "click");
            }
            String id2 = c627830Ojt2.getId();
            if (id2.length() <= 0 || (iDuetDownloadService = (IDuetDownloadService) PluggableExtentionKt.pluggableSpi$default(IDuetDownloadService.class, false, false, false, 14, null)) == null) {
                return;
            }
            iDuetDownloadService.LJFF(c19eg, id2, C2097608Jq.LJIIIIZZ(new Pair("duet_shoot_way", "duet"), new Pair("duet_entrance_type", "detail_page")), "duet_page");
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void nm1() {
        lP0();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.creativedetail.assem.CreativeToolShootAssem for r10v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.detail.prefab.ShootAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creativedetail.assem.CreativeToolShootAssem.onViewCreated(android.view.View):void");
    }
}
