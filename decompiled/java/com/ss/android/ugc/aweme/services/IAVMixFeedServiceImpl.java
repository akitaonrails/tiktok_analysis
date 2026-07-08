package com.ss.android.ugc.aweme.services;

import X.C1440005kM;
import X.C739260SzE;
import X.InterfaceC1168520gVu;
import X.InterfaceC1169300gXA;
import X.InterfaceC1169320gXC;
import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.port.in.IAVMixFeedService;

/* JADX INFO: loaded from: classes19.dex */
public final class IAVMixFeedServiceImpl implements IAVMixFeedService {
    public final IMixFeedService mixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);

    @Override // com.ss.android.ugc.aweme.port.in.IAVMixFeedService
    public boolean needCreateFirstMix() {
        return this.mixFeedService.needCreateFirstMix();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVMixFeedService
    public boolean needShowAddOrRemoveButton() {
        return this.mixFeedService.needShowAddOrRemoveButton();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVMixFeedService
    public void updateFeedEvent(String str) {
        C1440005kM.LIZ(new C739260SzE(null, str, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl$showAddToMixInPublishPage$1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.port.in.IAVMixFeedService
    public void showAddToMixInPublishPage(Activity activity, final InterfaceC1169320gXC interfaceC1169320gXC, String str, String str2, String str3, String str4) {
        this.mixFeedService.LJFF(activity, new InterfaceC1168520gVu() { // from class: com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl.showAddToMixInPublishPage.1
            @Override // X.InterfaceC1168540gVw
            public void onPlaylistSelected(String str5, String str6, boolean z) {
                interfaceC1169320gXC.LIZ(str5, str6, z);
            }

            @Override // X.InterfaceC1168520gVu
            public void onPlaylistSelected(String str5, String str6, boolean z, int i) {
                InterfaceC1169320gXC interfaceC1169320gXC2 = interfaceC1169320gXC;
                if (interfaceC1169320gXC2 instanceof InterfaceC1169300gXA) {
                    ((InterfaceC1169300gXA) interfaceC1169320gXC2).LIZIZ(i, str5, str6, z);
                } else {
                    interfaceC1169320gXC2.LIZ(str5, str6, z);
                }
            }
        }, str, str2, str3, str4);
    }
}
