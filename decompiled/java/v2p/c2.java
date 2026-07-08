package v2p;

import X.AbstractC20000013Ne;
import X.C13LD;
import X.C13MA;
import X.C13OQ;
import X.C13R7;
import X.C13RD;
import X.C13SB;
import X.C13SS;
import X.C1643810ssV;
import X.C1662010tLr;
import X.C20008813Qo;
import X.C2188811AlT;
import X.InterfaceC20004513Ox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.net.EffectNetListResponse;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class c2 extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        EffectNetListResponse effectNetListResponse;
        String strLJIILLIIL = C13OQ.LJIILLIIL(this.LIZ, this.LIZIZ);
        InterfaceC20004513Ox interfaceC20004513Ox = this.LIZ.LJJIFFI;
        EffectChannelModel data = null;
        C20008813Qo c20008813QoLJIILIIL = interfaceC20004513Ox != null ? interfaceC20004513Ox.LJIILIIL(strLJIILLIIL) : null;
        boolean z = this.LIZ.LJJJ == 2;
        try {
            if (c20008813QoLJIILIIL == null) {
                runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(10004), 67));
                return;
            }
            try {
                String strLJIIIZ = C13SB.LJIIIZ(c20008813QoLJIILIIL);
                if (z) {
                    C13R7 c13r7 = this.LIZ.LJIJI;
                    if (c13r7 != null && (effectNetListResponse = (EffectNetListResponse) c13r7.LIZ.convertJsonToObj(strLJIIIZ, EffectNetListResponse.class)) != null) {
                        data = effectNetListResponse.getData();
                    }
                } else {
                    C13R7 c13r72 = this.LIZ.LJIJI;
                    if (c13r72 != null) {
                        data = (EffectChannelModel) c13r72.LIZ.convertJsonToObj(strLJIIIZ, EffectChannelModel.class);
                    }
                }
                if (this.LIZLLL && data != null) {
                    C13LD.LIZ.getClass();
                    C13LD.LIZIZ(data);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Json Parse Exception: ");
                sbLIZ.append(e);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZIZ("FetchPanelEffectListCacheTask", strLIZIZ, null);
                C13RD c13rd = this.LIZ;
                InterfaceC20004513Ox interfaceC20004513Ox2 = c13rd.LJJIFFI;
                if (interfaceC20004513Ox2 != null) {
                    interfaceC20004513Ox2.remove(C13OQ.LJIILLIIL(c13rd, this.LIZIZ));
                }
            }
            C13SB.LIZIZ(c20008813QoLJIILIIL);
            if (data == null || !data.checkValued()) {
                runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(10004), 67));
                return;
            }
            EffectChannelResponse effectChannelResponseLIZ = new C1643810ssV(this.LIZIZ, this.LIZ.LJII, !z).LIZ(data);
            effectChannelResponseLIZ.setFromCache(true);
            C13MA c13maLIZ = this.LIZ.LJJJIL.LIZ(this.LIZJ);
            if (c13maLIZ != null) {
                c13maLIZ.preProcess(effectChannelResponseLIZ);
            }
            runOnMainThread(new AwS431S0200000_30(this, effectChannelResponseLIZ, 68));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C13SB.LIZIZ(c20008813QoLJIILIIL);
            throw th;
        }
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        runOnMainThread(new AwS574S0100000_30(this, 410));
    }

    public c2(C13RD c13rd, String str, String str2) {
        super(str2, null);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = c13rd.LJJJJZI;
    }
}
