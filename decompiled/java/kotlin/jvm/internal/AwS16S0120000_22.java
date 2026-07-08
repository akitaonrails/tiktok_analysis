package kotlin.jvm.internal;

import X.AbstractC1463010oAt;
import X.C09AY;
import X.C0C64;
import X.C0MWZ;
import X.C12VT;
import X.C1429980nJc;
import X.C1455490nyl;
import X.C1460250o6R;
import X.C1463000oAs;
import X.C1664590tQ1;
import X.C301400Bre;
import X.EnumC1429920nJW;
import X.InterfaceC1452170ntP;
import X.InterfaceC1461350o8D;
import X.InterfaceC2217461Bqa;
import X.InterfaceC391240FVq;
import X.InterfaceC524950KiL;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.vesdk.VEEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l5a.a;

/* JADX INFO: loaded from: classes23.dex */
public class AwS16S0120000_22 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS16S0120000_22 awS16S0120000_22) {
        long jLJIIIIZZ;
        int duration;
        InterfaceC391240FVq interfaceC391240FVqU30;
        InterfaceC1452170ntP interfaceC1452170ntP;
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        if (((AbstractC1463010oAt) awS16S0120000_22.l0).getEditModel().getMultiEditVideoRecordData() != null && (multiEditVideoRecordData = ((AbstractC1463010oAt) awS16S0120000_22.l0).getEditModel().getMultiEditVideoRecordData()) != null) {
            multiEditVideoRecordData.isMultiEditRetake = false;
        }
        C12VT c12vt = ((AbstractC1463010oAt) awS16S0120000_22.l0).LLLF;
        if (c12vt == null) {
            c12vt = null;
        }
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(c12vt);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.b8(((AbstractC1463010oAt) awS16S0120000_22.l0).LLLFF);
        }
        ((AbstractC1463010oAt) awS16S0120000_22.l0).LLJI = false;
        AbstractC1463010oAt abstractC1463010oAt = (AbstractC1463010oAt) awS16S0120000_22.l0;
        abstractC1463010oAt.LLJJ = null;
        abstractC1463010oAt.o4().Sq(true);
        C1463000oAs c1463000oAsI3 = ((AbstractC1463010oAt) awS16S0120000_22.l0).i3();
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1463000oAs.LLJLLIL;
        c1463000oAsI3.getClass();
        if (!C301400Bre.LIZ() && (interfaceC1452170ntP = ((AbstractC1463010oAt) awS16S0120000_22.l0).LLJILJILJ) != null) {
            interfaceC1452170ntP.enableEffect(true);
        }
        ((AbstractC1463010oAt) awS16S0120000_22.l0).a92(true);
        ((AbstractC1463010oAt) awS16S0120000_22.l0).q3().u();
        InterfaceC1461350o8D interfaceC1461350o8DE3 = AbstractC1463010oAt.E3((AbstractC1463010oAt) awS16S0120000_22.l0);
        if (interfaceC1461350o8DE3 != null && (interfaceC391240FVqU30 = interfaceC1461350o8DE3.u30()) != null) {
            interfaceC391240FVqU30.Vv();
        }
        if (awS16S0120000_22.z1) {
            Keva keva = C1455490nyl.LIZ;
            C1455490nyl.LIZIZ(((AbstractC1463010oAt) awS16S0120000_22.l0).getEditModel().mShootWay, ((AbstractC1463010oAt) awS16S0120000_22.l0).LLJ);
        }
        if (!awS16S0120000_22.z2) {
            ((AbstractC1463010oAt) awS16S0120000_22.l0).i3().LJIJJLI(null);
            ((AbstractC1463010oAt) awS16S0120000_22.l0).w2();
            C1463000oAs c1463000oAsI32 = ((AbstractC1463010oAt) awS16S0120000_22.l0).i3();
            InterfaceC1452170ntP interfaceC1452170ntP2 = ((AbstractC1463010oAt) awS16S0120000_22.l0).LLJILJILJ;
            if (interfaceC1452170ntP2 != null) {
                duration = interfaceC1452170ntP2.getDuration();
            } else {
                duration = -1;
            }
            c1463000oAsI32.LJIILLIIL(0, duration);
            ((AbstractC1463010oAt) awS16S0120000_22.l0).H4().LIZLLL(-1L, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, true);
        } else if (awS16S0120000_22.z1) {
            ((AbstractC1463010oAt) awS16S0120000_22.l0).H2();
        } else {
            ((AbstractC1463010oAt) awS16S0120000_22.l0).K6();
        }
        AbstractC1463010oAt abstractC1463010oAt2 = (AbstractC1463010oAt) awS16S0120000_22.l0;
        boolean z = awS16S0120000_22.z1;
        boolean z2 = awS16S0120000_22.z2;
        InterfaceC1452170ntP interfaceC1452170ntP3 = abstractC1463010oAt2.LLJILJILJ;
        if (interfaceC1452170ntP3 != null) {
            jLJIIIIZZ = interfaceC1452170ntP3.getDuration();
        } else {
            jLJIIIIZZ = abstractC1463010oAt2.i3().LJIIIIZZ();
        }
        abstractC1463010oAt2.C5(z, z2, jLJIIIIZZ);
        if (awS16S0120000_22.z1) {
            a.LIZIZ.LIZIZ(((AbstractC1463010oAt) awS16S0120000_22.l0).getEditModel().getCreationId(), new C1429980nJc(EnumC1429920nJW.EDIT_DELETE_CLIP, ((AbstractC1463010oAt) awS16S0120000_22.l0).getEditModel(), null), C1664590tQ1.LJII((AbstractC1463010oAt) awS16S0120000_22.l0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS16S0120000_22 awS16S0120000_22) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_quick_post_storage_permission_check", true) == 1) {
            C1460250o6R.T4(awS16S0120000_22.z1, (C1460250o6R) awS16S0120000_22.l0, awS16S0120000_22.z2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS16S0120000_22 awS16S0120000_22) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_quick_post_storage_permission_check", true) == 1) {
            C1460250o6R.T4(awS16S0120000_22.z1, (C1460250o6R) awS16S0120000_22.l0, awS16S0120000_22.z2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S0120000_22(C1460250o6R c1460250o6R, boolean z, boolean z2, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1460250o6R;
        this.z2 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S0120000_22(AbstractC1463010oAt abstractC1463010oAt, boolean z, boolean z2, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC1463010oAt;
        this.z1 = z;
        this.z2 = z2;
    }
}
