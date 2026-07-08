package com.ss.android.ugc.aweme.poi.detail.nearby.cards;

import X.C1173300gdc;
import X.C1173930ged;
import X.C1174830gg5;
import X.C1185600gxS;
import X.C20600815jK;
import X.C724240Sb0;
import X.InterfaceC1181010gq3;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.poi.detail.nearby.PoiNearbyModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiNearbyCardsAssem extends UISlotAssem implements PoiDetailNearbyCardsAbility {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJI;
    public PoiNearbyModel LLJJIII;
    public int LLJJIJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e3c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1185600gxS hp() {
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        C1173300gdc c1173300gdcQr0;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJI)) == null || (c1173300gdcQr0 = interfaceC1181010gq3LIZ.qr0()) == null) {
            return null;
        }
        return (C1185600gxS) c1173300gdcQr0.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.nearby.cards.PoiDetailNearbyCardsAbility
    public final void W12(PoiNearbyModel poiNearbyModel) {
        String str;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        this.LLJJIII = poiNearbyModel;
        if (poiNearbyModel != null) {
            C1185600gxS c1185600gxSHp = hp();
            if (c1185600gxSHp != null) {
                str = c1185600gxSHp.LIZ;
            } else {
                str = null;
            }
            List<C1173930ged> nearbyCards$poi_release = poiNearbyModel.toNearbyCards$poi_release(str);
            if (nearbyCards$poi_release != null && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJI) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                state.LJIILL(nearbyCards$poi_release, null);
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.nearby.cards.PoiNearbyCardsAssem for r9v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.nearby.cards.PoiNearbyCardsAssem.onViewCreated(android.view.View):void");
    }
}
