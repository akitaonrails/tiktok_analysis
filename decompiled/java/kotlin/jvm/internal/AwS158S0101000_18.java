package kotlin.jvm.internal;

import X.C09AY;
import X.C1156420gCO;
import X.C1159710gHh;
import X.C1161100gJw;
import X.C1172210gbr;
import X.C1206930hVr;
import X.C18Z8;
import X.C20600815jK;
import X.C2188811AlT;
import X.C5183020f;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC625970Ogt;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesManager;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesVM;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.WhiteNoiseAssem;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS158S0101000_18 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS158S0101000_18 awS158S0101000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setupBodyGroupLayout handler[");
        sbLIZ.append(awS158S0101000_18.i1);
        sbLIZ.append("]: ");
        sbLIZ.append(((C1161100gJw) awS158S0101000_18.l0).LIZJ);
        sbLIZ.append("/c");
        sbLIZ.append(((C1161100gJw) awS158S0101000_18.l0).LJ);
        sbLIZ.append(" range=");
        sbLIZ.append(((C1161100gJw) awS158S0101000_18.l0).LIZ);
        sbLIZ.append('-');
        sbLIZ.append(((C1161100gJw) awS158S0101000_18.l0).LIZIZ);
        sbLIZ.append(" padding=");
        sbLIZ.append(((C1161100gJw) awS158S0101000_18.l0).LJI);
        sbLIZ.append('/');
        sbLIZ.append(((C1161100gJw) awS158S0101000_18.l0).LJIIIIZZ);
        sbLIZ.append('/');
        sbLIZ.append(((C1161100gJw) awS158S0101000_18.l0).LJII);
        sbLIZ.append('/');
        sbLIZ.append(((C1161100gJw) awS158S0101000_18.l0).LJIIIZ);
        sbLIZ.append(" gap=");
        sbLIZ.append(((C1161100gJw) awS158S0101000_18.l0).LJFF);
        sbLIZ.append(" bg=");
        sbLIZ.append(((C1161100gJw) awS158S0101000_18.l0).LJIIJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS158S0101000_18 awS158S0101000_18) {
        Integer numValueOf;
        C20600815jK<InterfaceC1891350zJl> state;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performInsert recreateBodyList commit responseSessionId=");
        sbLIZ.append(awS158S0101000_18.i1);
        sbLIZ.append(" handlers=");
        sbLIZ.append(RavenFragment.PT((RavenFragment) awS158S0101000_18.l0));
        sbLIZ.append(" bodyStateSize=");
        C18Z8 c18z8 = ((RavenFragment) awS158S0101000_18.l0).LLJILJIL;
        if (c18z8 != null && (state = c18z8.getState()) != null) {
            numValueOf = Integer.valueOf(state.LJIIIIZZ());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS158S0101000_18.l0).fT(Integer.valueOf(awS158S0101000_18.i1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS158S0101000_18 awS158S0101000_18) {
        Integer numValueOf;
        C20600815jK<InterfaceC1891350zJl> state;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performInsert after recreateBodyList setImmediately responseSessionId=");
        sbLIZ.append(awS158S0101000_18.i1);
        sbLIZ.append(" handlers=");
        sbLIZ.append(RavenFragment.PT((RavenFragment) awS158S0101000_18.l0));
        sbLIZ.append(" bodyStateSize=");
        C18Z8 c18z8 = ((RavenFragment) awS158S0101000_18.l0).LLJILJIL;
        if (c18z8 != null && (state = c18z8.getState()) != null) {
            numValueOf = Integer.valueOf(state.LJIIIIZZ());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS158S0101000_18.l0).fT(Integer.valueOf(awS158S0101000_18.i1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS158S0101000_18 awS158S0101000_18) {
        Integer numValueOf;
        C20600815jK<InterfaceC1891350zJl> state;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performInsert after setImmediately responseSessionId=");
        sbLIZ.append(awS158S0101000_18.i1);
        sbLIZ.append(" handlers=");
        sbLIZ.append(RavenFragment.PT((RavenFragment) awS158S0101000_18.l0));
        sbLIZ.append(" bodyStateSize=");
        C18Z8 c18z8 = ((RavenFragment) awS158S0101000_18.l0).LLJILJIL;
        if (c18z8 != null && (state = c18z8.getState()) != null) {
            numValueOf = Integer.valueOf(state.LJIIIIZZ());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS158S0101000_18.l0).fT(Integer.valueOf(awS158S0101000_18.i1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS158S0101000_18 awS158S0101000_18) {
        C786410Ut5.LJJJI("event", "system_location_device_setting_result", (Bundle) awS158S0101000_18.l0);
        ((Bundle) awS158S0101000_18.l0).putInt("gps_authorization", awS158S0101000_18.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS158S0101000_18 awS158S0101000_18) {
        LocationServicesVM locationServicesVM;
        WeakReference<LocationServicesVM> weakReference = LocationServicesManager.LJ;
        if (weakReference != null && (locationServicesVM = weakReference.get()) != null) {
            Context context = (Context) awS158S0101000_18.l0;
            Integer numValueOf = Integer.valueOf(awS158S0101000_18.i1);
            C1206930hVr c1206930hVr = C1206930hVr.LIZ;
            C5183020f c5183020f = new C5183020f(context, 380);
            c1206930hVr.getClass();
            C1206930hVr.LIZIZ("system_location_setting_off_result", "click_gps_never", numValueOf, c5183020f);
            locationServicesVM.vQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS158S0101000_18 awS158S0101000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("detect swipe right to index ");
        sbLIZ.append(awS158S0101000_18.i1);
        sbLIZ.append(' ');
        sbLIZ.append(((WhiteNoiseAssem) awS158S0101000_18.l0).LLJJLIIIJLLLLLLLZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS158S0101000_18 awS158S0101000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("detect swipe left to index ");
        sbLIZ.append(awS158S0101000_18.i1);
        sbLIZ.append(' ');
        sbLIZ.append(((WhiteNoiseAssem) awS158S0101000_18.l0).LLJJLIIIJLLLLLLLZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS158S0101000_18 awS158S0101000_18) {
        C1156420gCO c1156420gCO;
        int i = awS158S0101000_18.i1;
        if (i >= 0 && i < ((ArrayList) ((C1172210gbr) awS158S0101000_18.l0).LLILZ).size()) {
            Object obj = ListProtector.get(((C1172210gbr) awS158S0101000_18.l0).LLILZ, awS158S0101000_18.i1);
            if ((obj instanceof C1156420gCO) && (c1156420gCO = (C1156420gCO) obj) != null && c1156420gCO.LJ != 3) {
                ListProtector.set(((C1172210gbr) awS158S0101000_18.l0).LLILZ, awS158S0101000_18.i1, new C1156420gCO(3, c1156420gCO.LIZ, c1156420gCO.LIZIZ, c1156420gCO.LIZLLL, c1156420gCO.LIZJ));
                ((C1172210gbr) awS158S0101000_18.l0).notifyItemChanged(awS158S0101000_18.i1);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS158S0101000_18 awS158S0101000_18) {
        boolean z;
        int i = ((InterfaceC625970Ogt) ((C1159710gHh) awS158S0101000_18.l0).LIZ.getValue()).getInt("manage_topics_version", -1);
        if (i == -1) {
            ((InterfaceC625970Ogt) ((C1159710gHh) awS158S0101000_18.l0).LIZ.getValue()).LIZJ("manage_topics_version", awS158S0101000_18.i1);
        } else {
            if (i != awS158S0101000_18.i1) {
                ((InterfaceC625970Ogt) ((C1159710gHh) awS158S0101000_18.l0).LIZ.getValue()).LIZJ("manage_topics_version", awS158S0101000_18.i1);
                z = false;
            }
            return Boolean.valueOf(z);
        }
        z = true;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS158S0101000_18(int i, C1161100gJw c1161100gJw, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1161100gJw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS158S0101000_18(int i, C1172210gbr c1172210gbr, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1172210gbr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS158S0101000_18(int i, Bundle bundle, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = bundle;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS158S0101000_18(int i, int i2, RavenFragment<Object> ravenFragment) {
        super(0);
        this.$t = ravenFragment;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS158S0101000_18(int i, WhiteNoiseAssem whiteNoiseAssem, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = whiteNoiseAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS158S0101000_18(C1159710gHh c1159710gHh, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1159710gHh;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS158S0101000_18(Context context, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = context;
        this.i1 = i;
    }
}
