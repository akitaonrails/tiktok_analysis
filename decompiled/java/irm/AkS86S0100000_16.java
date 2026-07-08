package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C1076220e72;
import X.C1177570gkV;
import X.C1177680gkg;
import X.C1207450hWh;
import X.C1388190mED;
import X.C1558520qew;
import X.C19EG;
import X.C2188811AlT;
import X.C724240Sb0;
import X.EnumC1076210e71;
import X.InterfaceC1207030hW1;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.poi.creator.PoiCreatorFragment;
import com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitMapAssemAbility;
import com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitFragment;

/* JADX INFO: loaded from: classes17.dex */
public class AkS86S0100000_16 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public AkS86S0100000_16(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AkS86S0100000_16 akS86S0100000_16, View view) {
        C19EG c19egLIZ = C724240Sb0.LIZ((PoiCreatorFragment) akS86S0100000_16.l0);
        if (c19egLIZ != null) {
            c19egLIZ.finish();
        }
    }

    public static final void LIZ$1(AkS86S0100000_16 akS86S0100000_16, View view) {
        IPoiRevisitNavAssemAbility iPoiRevisitNavAssemAbility;
        C19EG c19egLIZIZ;
        IPoiRevisitMapAssemAbility iPoiRevisitMapAssemAbility;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IPoiRevisitMapAssemAbility iPoiRevisitMapAssemAbility2;
        InterfaceC665370Q7z interfaceC665370Q7z2 = ((PoiRevisitFragment) akS86S0100000_16.l0).VR().LLJ;
        if (interfaceC665370Q7z2 != null) {
            iPoiRevisitNavAssemAbility = (IPoiRevisitNavAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z2, IPoiRevisitNavAssemAbility.class, null);
        } else {
            iPoiRevisitNavAssemAbility = null;
        }
        C1177570gkV c1177570gkV = C1177570gkV.LIZ;
        PoiRevisitFragment poiRevisitFragment = (PoiRevisitFragment) akS86S0100000_16.l0;
        c1177570gkV.getClass();
        C1177570gkV.LIZLLL(poiRevisitFragment, C1177570gkV.LIZ(iPoiRevisitNavAssemAbility), "click_arrow", null);
        EnumC1076210e71 enumC1076210e71 = ((PoiRevisitFragment) akS86S0100000_16.l0).LLJJIJIIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Revisit Fragment locateBtn onClick, currentPermissionType=");
        sbLIZ.append(enumC1076210e71);
        C2188811AlT.LIZIZ(sbLIZ);
        if (enumC1076210e71 != null) {
            int i = C1076220e72.LIZ[enumC1076210e71.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && (interfaceC665370Q7z = ((PoiRevisitFragment) akS86S0100000_16.l0).VR().LLJ) != null && (iPoiRevisitMapAssemAbility2 = (IPoiRevisitMapAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiRevisitMapAssemAbility.class, null)) != null) {
                        iPoiRevisitMapAssemAbility2.hz0(true, true);
                        return;
                    }
                    return;
                }
                InterfaceC665370Q7z interfaceC665370Q7z3 = ((PoiRevisitFragment) akS86S0100000_16.l0).VR().LLJ;
                if (interfaceC665370Q7z3 == null || (iPoiRevisitMapAssemAbility = (IPoiRevisitMapAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z3, IPoiRevisitMapAssemAbility.class, null)) == null) {
                    return;
                }
                iPoiRevisitMapAssemAbility.hz0(false, true);
                return;
            }
            Context context = ((PoiRevisitFragment) akS86S0100000_16.l0).getContext();
            if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
                return;
            }
            C1207450hWh c1207450hWh = C1207450hWh.LIZ;
            String str = C1177680gkg.LIZJ;
            String str2 = C1177680gkg.LIZLLL;
            TokenCert tokenCert = C1177680gkg.LJ;
            final PoiRevisitFragment poiRevisitFragment2 = (PoiRevisitFragment) akS86S0100000_16.l0;
            c1207450hWh.LJIJJ(str, str2, tokenCert, c19egLIZIZ, null, new InterfaceC1207030hW1() { // from class: X.0e73
                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i2, String str3) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i2) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    poiRevisitFragment2.VR().AQ2();
                }
            }, null);
        }
    }
}
