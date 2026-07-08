package ttpobfuscated;

import X.C08PN;
import X.C098200Yq;
import X.C099R;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19994513Lb;
import X.C814420VxA;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.nio.ReadOnlyBufferException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.app.domain.entity.gecko.GeckoValidationError;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttpobfuscated.q3;
import ttpobfuscated.zg;

/* JADX INFO: loaded from: classes24.dex */
public final class c5 implements zg {
    public final boolean a;
    public final u1 b;
    public final String c = C13LE.LIZ(c5.class).LJI();
    public b1 d;

    public final b1 a() {
        return this.d;
    }

    public final void a(b1 b1Var) {
        this.d = b1Var;
    }

    private final void a(String str, q5 q5Var) throws Throwable {
        Object c098200Yq;
        int i;
        try {
            q3.b.a(q3.a, "gecko verify V16", this.c, (Throwable) null, 4, (Object) null);
            Path path = Paths.get(str, new String[0]);
            List<Integer> listA = a(q5Var.c.entrySet().size(), (GeneralConfig) this.b.get());
            i = 0;
            for (Path path2 : Files.walk(path, new FileVisitOption[0])) {
                boolean zIsRegularFile = Files.isRegularFile(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
                boolean zA = a(path2, str);
                if (zIsRegularFile && !zA) {
                    p5 p5Var = q5Var.c.get(path2.toAbsolutePath().toString().substring((str + File.separator).length()));
                    if (p5Var != null) {
                        if (listA != null && !listA.isEmpty() && !listA.contains(Integer.valueOf(i))) {
                            if (Files.size(path2) != p5Var.c) {
                                throw new zg.a.C0080a(GeckoValidationError.SizeDoesNotMatch);
                            }
                        } else if (!Intrinsics.LJFF(b7.a(path2), p5Var.b)) {
                            throw new zg.a.C0080a(GeckoValidationError.HashDoesNotMatch);
                        }
                        i++;
                    } else {
                        throw new zg.a.C0080a(GeckoValidationError.DirectoryContentsDoNotMatch);
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (q5Var.c.size() == i) {
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                q3.a aVar = q3.a;
                StringBuilder sb = new StringBuilder("Error while validating file entries: ");
                sb.append(str);
                sb.append(' ');
                String message = thM5exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                sb.append(message);
                String string = sb.toString();
                String str2 = this.c;
                aVar.getClass();
                q3.a.c.b(string, str2, thM5exceptionOrNullimpl);
                if (!(thM5exceptionOrNullimpl instanceof zg.a)) {
                    if (!(thM5exceptionOrNullimpl instanceof NoSuchFileException) && !(thM5exceptionOrNullimpl instanceof IOException) && !(thM5exceptionOrNullimpl instanceof SecurityException) && !(thM5exceptionOrNullimpl instanceof UnsupportedOperationException) && !(thM5exceptionOrNullimpl instanceof ReadOnlyBufferException)) {
                        if (thM5exceptionOrNullimpl instanceof NoSuchAlgorithmException) {
                            throw new zg.a.C0080a(GeckoValidationError.UnableToComputeHash);
                        }
                        throw new zg.a.C0080a(GeckoValidationError.PathDoesNotExist);
                    }
                    throw new zg.a.C0080a(GeckoValidationError.PathDoesNotExist);
                }
                throw thM5exceptionOrNullimpl;
            }
            return;
        }
        throw new zg.a.C0080a(GeckoValidationError.DirectoryContentsDoNotMatch);
    }

    public final boolean a(Path path, String str) {
        if (this.a && (Intrinsics.LJFF(C08PN.LIZ(path), "manifest-sandbox.json") || Intrinsics.LJFF(C08PN.LIZ(path), "manifest-sandbox-signed.json"))) {
            if (Intrinsics.LJFF(path.toAbsolutePath().toString(), str + File.separator + C08PN.LIZ(path))) {
                return true;
            }
        }
        if (Intrinsics.LJFF(C08PN.LIZ(path), "manifest-sandbox-signed.json")) {
            if (Intrinsics.LJFF(path.toAbsolutePath().toString(), str + File.separator + C08PN.LIZ(path))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // ttpobfuscated.zg
    public List<Integer> a(int i, GeneralConfig generalConfig) {
        q3.b.a(q3.a, "gecko getSampleListV16", this.c, (Throwable) null, 4, (Object) null);
        double d = generalConfig.getGeckoScanSettings().b;
        int i2 = generalConfig.getGeckoScanSettings().a;
        if (d < 0.0d) {
            return null;
        }
        int iMin = Math.min(i, C814420VxA.LIZ(Math.ceil((Math.sqrt(i) * d) + ((double) i2))));
        if (i <= 0) {
            return new ArrayList();
        }
        return C13LP.LL(C1697810uHb.LJIIZILJ(C13LZ.LJIILJJIL(0, i), C19994513Lb.LIZIZ(new SecureRandom().nextLong())), iMin);
    }

    @Override // ttpobfuscated.zg
    public Object a(String str, q5 q5Var, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        bh.c.getClass();
        if (bh.d.a) {
            a(str, q5Var);
            return Unit.LIZ;
        }
        Object objA = this.d.a(str, q5Var, interfaceC1364105Vn);
        if (objA == C099R.LJFF()) {
            return objA;
        }
        return Unit.LIZ;
    }

    public c5(boolean z, u1 u1Var, boolean z2, int i, int i2) {
        this.a = z;
        this.b = u1Var;
        this.d = new b1(z, u1Var, z2, i, i2);
    }
}
