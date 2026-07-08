package com.ss.android.ugc.aweme.share.business.config;

import X.InterfaceC1371860lns;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class IncentiveAwemeChannelShareProtocol extends AwemeChannelShareProtocol {
    @Override // com.ss.android.ugc.aweme.share.business.config.AwemeChannelShareProtocol, com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final InterfaceC1371860lns LK0() {
        return new InterfaceC1371860lns() { // from class: X.0loU
            @Override // X.InterfaceC1371860lns
            public final void LIZIZ(BaseSharePackage baseSharePackage, List list) {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                if ((baseSharePackage instanceof AwemeSharePackage) && interfaceC1369790lkX.LJJIII() && !Intrinsics.LJFF(interfaceC1369790lkX.key(), "copy")) {
                    ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIJJLI();
                    C1895800zQw.LIZLLL(((AwemeSharePackage) baseSharePackage).LJJIFFI());
                }
            }
        };
    }

    public IncentiveAwemeChannelShareProtocol(Context context, BaseSharePackage baseSharePackage) {
        super(context, baseSharePackage);
    }
}
