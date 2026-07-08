package lro;

import X.AbstractC2254271DLd;
import X.C1664350tPd;
import X.C1DMV;
import X.C2185711AgT;
import X.C2254501DMa;
import X.C2254641DMo;
import X.C448700Hie;
import X.EnumC1155100gAG;
import X.InterfaceC1155110gAH;
import X.InterfaceC2219671Bu9;
import X.InterfaceC448730Hih;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.vesdk.k;
import com.ss.android.vesdk.lens.VEBaseRecorderLensParams;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public class b {
    public C2254641DMo LIZ;
    public final AbstractC2254271DLd LIZIZ;
    public final C1664350tPd<Object> LIZJ = new C1664350tPd<>();
    public final List<InterfaceC1155110gAH> LIZLLL = new ArrayList();
    public final C2185711AgT LJ = new C2185711AgT();
    public final C2254501DMa LJFF = new C1DMV().LIZ;

    public b(AbstractC2254271DLd abstractC2254271DLd) {
        this.LIZIZ = abstractC2254271DLd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.1DMo, java.lang.Object] */
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
    public final boolean LIZ(C448700Hie c448700Hie) {
        if (c448700Hie == 0) {
            return false;
        }
        if (((ArrayList) this.LIZLLL).isEmpty()) {
            AbstractC2254271DLd abstractC2254271DLd = this.LIZIZ;
            C2254501DMa c2254501DMa = this.LJFF;
            k kVar = (k) abstractC2254271DLd;
            kVar.getClass();
            TEBundle tEBundleObtain = TEBundle.obtain();
            if (c2254501DMa != null) {
                tEBundleObtain.setBool("ScanAsync", false);
            }
            tEBundleObtain.setBool("ScanStart", true);
            kVar.LJJJ.LJIL("RecordScanSettings", tEBundleObtain);
        }
        ((ArrayList) this.LIZLLL).add(c448700Hie);
        if (c448700Hie.getUsage() == EnumC1155100gAG.DEFAULT) {
            if (c448700Hie.getAlgorithmType() == 11) {
                this.LIZIZ.LIZIZ(true, c448700Hie);
            } else {
                if (c448700Hie.getAlgorithmType() == 12) {
                    this.LIZIZ.LIZIZ(true, c448700Hie);
                    return true;
                }
                if (c448700Hie.getAlgorithmType() == 13) {
                    this.LIZIZ.LIZIZ(true, c448700Hie);
                    return true;
                }
                if (c448700Hie.getAlgorithmType() == 16) {
                    this.LIZIZ.LIZIZ(true, c448700Hie);
                    return true;
                }
                throw new IllegalArgumentException("Params is not supported now!");
            }
        } else {
            VEBaseRecorderLensParams vEBaseRecorderLensParams = (VEBaseRecorderLensParams) c448700Hie;
            vEBaseRecorderLensParams.enable = true;
            this.LIZIZ.LJ(vEBaseRecorderLensParams, (InterfaceC2219671Bu9) vEBaseRecorderLensParams.resultCallback);
            if (vEBaseRecorderLensParams.algorithmFlag == 34) {
                ?? r1 = new Object() { // from class: X.1DMo
                };
                this.LIZ = r1;
                this.LIZJ.LIZ(r1);
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LIZIZ(C448700Hie c448700Hie) {
        ((ArrayList) this.LIZLLL).remove(c448700Hie);
        if (c448700Hie.getUsage() == EnumC1155100gAG.DEFAULT) {
            if (c448700Hie.getAlgorithmType() == 11 || c448700Hie.getAlgorithmType() == 12 || c448700Hie.getAlgorithmType() == 13) {
                this.LIZIZ.LIZIZ(false, c448700Hie);
            } else {
                throw new IllegalArgumentException("Params is not supported now!");
            }
        } else {
            VEBaseRecorderLensParams vEBaseRecorderLensParams = (VEBaseRecorderLensParams) c448700Hie;
            vEBaseRecorderLensParams.enable = false;
            if (vEBaseRecorderLensParams.algorithmFlag == 34) {
                this.LIZJ.LJ(this.LIZ);
                this.LIZ = null;
            }
            this.LIZIZ.LJ(vEBaseRecorderLensParams, null);
        }
        if (((ArrayList) this.LIZLLL).isEmpty()) {
            AbstractC2254271DLd abstractC2254271DLd = this.LIZIZ;
            C2254501DMa c2254501DMa = this.LJFF;
            k kVar = (k) abstractC2254271DLd;
            kVar.getClass();
            TEBundle tEBundleObtain = TEBundle.obtain();
            if (c2254501DMa != null) {
                tEBundleObtain.setBool("ScanAsync", false);
            }
            tEBundleObtain.setBool("ScanStart", false);
            kVar.LJJJ.LJIL("RecordScanSettings", tEBundleObtain);
            C2185711AgT c2185711AgT = this.LJ;
            synchronized (c2185711AgT) {
                try {
                    ((LinkedList) c2185711AgT.LIZ).clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return true;
        }
        return true;
    }

    public final void LIZJ(InterfaceC448730Hih interfaceC448730Hih) {
        AbstractC2254271DLd abstractC2254271DLd = this.LIZIZ;
        ((k) abstractC2254271DLd).LJJJJLI.setScanListener(interfaceC448730Hih, this.LJ);
        if (interfaceC448730Hih == null) {
            C2185711AgT c2185711AgT = this.LJ;
            synchronized (c2185711AgT) {
                try {
                    ((LinkedList) c2185711AgT.LIZ).clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
