package com.ss.android.ugc.aweme.template.assem;

import X.C01GW;
import X.C19EG;
import X.C452501pT;
import X.C522540KeS;
import X.C536500L2i;
import X.C539530LDz;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService;
import com.ss.android.ugc.aweme.detail.prefab.ShootAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.io.Serializable;
import kotlin.jvm.internal.AwS218S0300000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TemplateShootAssem extends ShootAssem implements ShootAbility {
    public C19EG LLJJJJ;
    public Fragment LLJJJJJIL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1493));

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void te0() {
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void lP0() {
        TemplateAnchorConfig templateAnchorConfig;
        CreativeToolsPluginService creativeToolsPluginService;
        Fragment fragment = this.LLJJJJJIL;
        if (fragment == null) {
            fragment = null;
        }
        Bundle arguments = fragment.getArguments();
        ITemplateAnchorStrategyService iTemplateAnchorStrategyService = (ITemplateAnchorStrategyService) ServiceManager.get().getService(ITemplateAnchorStrategyService.class);
        if (Build.VERSION.SDK_INT < 33) {
            Serializable serializable = arguments != null ? arguments.getSerializable("template_anchor_config") : null;
            if (!(serializable instanceof TemplateAnchorConfig)) {
                return;
            } else {
                templateAnchorConfig = (TemplateAnchorConfig) serializable;
            }
        } else if (arguments == null) {
            return;
        } else {
            templateAnchorConfig = (TemplateAnchorConfig) arguments.getSerializable("template_anchor_config", TemplateAnchorConfig.class);
        }
        if (templateAnchorConfig == null || (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) == null) {
            return;
        }
        C19EG c19eg = this.LLJJJJ;
        if (c19eg == null) {
            c19eg = null;
        }
        if (creativeToolsPluginService.LIZJ(c19eg, templateAnchorConfig.getShootWay(), true)) {
            ITemplateConsumeService iTemplateConsumeService = C522540KeS.LIZ;
            if (iTemplateConsumeService != null && iTemplateConsumeService.LJFF(3, null, templateAnchorConfig, null)) {
                C19EG c19eg2 = this.LLJJJJ;
                iTemplateAnchorStrategyService.LIZ(c19eg2 != null ? c19eg2 : null, templateAnchorConfig, true);
            } else {
                C536500L2i c536500L2i = (C536500L2i) this.LLJJJJLIIL.getValue();
                if (c536500L2i != null) {
                    c536500L2i.LIZ(templateAnchorConfig.getTemplateType(), templateAnchorConfig.getCreativeInfo().getCreationId(), templateAnchorConfig.getTemplateId(), C539530LDz.LIZLLL(templateAnchorConfig.getAnchor()), new AwS218S0300000_9(iTemplateAnchorStrategyService, this, templateAnchorConfig, 12));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void nm1() {
        lP0();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.template.assem.TemplateShootAssem for r8v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.detail.prefab.ShootAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r9) {
        /*
            r8 = this;
            X.0RUT r0 = r8.getConfig()
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.LLILZ
            android.content.Context r0 = r8.getContext()
            if (r0 == 0) goto L1b
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L1b
            r0 = 2131857993(0x7f119249, float:1.9349762E38)
            java.lang.String r1 = r1.getString(r0)
            if (r1 != 0) goto L1d
        L1b:
            java.lang.String r1 = ""
        L1d:
            java.lang.String r0 = "text"
            r2.put(r0, r1)
            super.onViewCreated(r9)
            android.widget.TextView r0 = r8.LLJJIJIIJIL
            r2 = 1
            r7 = 0
            if (r0 == 0) goto L58
            r0 = 1
        L2c:
            r4 = 0
            if (r0 == 0) goto L40
            android.widget.TextView r1 = r8.op()
            boolean r0 = r1 instanceof com.bytedance.tux.input.TuxTextView
            if (r0 == 0) goto L40
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            if (r1 == 0) goto L40
            r0 = 103(0x67, float:1.44E-43)
            r1.setTuxFont(r0)
        L40:
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r9.setPadding(r7, r7, r7, r0)
            X.19EG r0 = X.C724240Sb0.LIZ(r8)
            if (r0 != 0) goto L5a
            return
        L58:
            r0 = 0
            goto L2c
        L5a:
            r8.LLJJJJ = r0
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r8)
            if (r0 != 0) goto L63
            return
        L63:
            r8.LLJJJJJIL = r0
            X.0Q7z r5 = X.C1558360qeg.LJFF(r0, r4)
            java.lang.Class<com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility> r0 = com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility.class
            X.01wD r6 = X.C1558520qew.LIZ(r5, r0, r4)
            if (r6 != 0) goto L77
            java.lang.Class<com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility> r0 = com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility.class
            X.C1558520qew.LJII(r5, r8, r0, r4, r4)
            return
        L77:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r6)     // Catch: java.lang.IllegalArgumentException -> L8f
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L8f
            if (r0 == 0) goto L87
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L8f
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L8f
            r0.add(r8)     // Catch: java.lang.IllegalArgumentException -> L8f
            return
        L87:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L8f
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L8f
            throw r1     // Catch: java.lang.IllegalArgumentException -> L8f
        L8f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility> r0 = com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility> r0 = com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility.class
            r2[r7] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r8)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r6)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto Lbc
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility> r0 = com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility.class
            X.C1558520qew.LJII(r5, r1, r0, r4, r4)
            return
        Lbc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.template.assem.TemplateShootAssem.onViewCreated(android.view.View):void");
    }
}
