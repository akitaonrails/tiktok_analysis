package ttpobfuscated;

import X.C098200Yq;
import X.C13LE;
import X.C189200o6;
import X.C2107108Nh;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import org.json.JSONException;
import ttp.orbu.sdk.app.domain.entity.gecko.GeckoValidationError;
import ttpobfuscated.n5;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class a5 implements n5 {
    public final String a = C13LE.LIZ(a5.class).LJI();

    @Override // ttpobfuscated.n5
    public Object a(String str, InterfaceC1364105Vn<? super se> interfaceC1364105Vn) throws Throwable {
        Object obj;
        try {
            Path path = Paths.get(str + File.separator + "manifest-sandbox-signed.json", new String[0]);
            if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                FileChannel fileChannelOpen = FileChannel.open(path, StandardOpenOption.READ);
                try {
                    String string = StandardCharsets.UTF_8.decode(fileChannelOpen.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannelOpen.size())).toString();
                    C2107108Nh.LIZ(fileChannelOpen, null);
                    se seVarA = se.g.a(string);
                    if (seVarA.m() == re.GECKO) {
                        C189200o6.m2constructorimpl(seVarA);
                        obj = seVarA;
                    } else {
                        throw new n5.a.C0063a(GeckoValidationError.InvalidManifest);
                    }
                } finally {
                }
            } else {
                throw new n5.a.C0063a(GeckoValidationError.PathDoesNotExist);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl == null) {
            return obj;
        }
        q3.a aVar = q3.a;
        StringBuilder sb = new StringBuilder("Error while getting Manifest from path:");
        sb.append(str);
        sb.append(' ');
        String message = thM5exceptionOrNullimpl.getMessage();
        if (message == null) {
            message = "";
        }
        sb.append(message);
        String string2 = sb.toString();
        String str2 = this.a;
        aVar.getClass();
        q3.a.c.b(string2, str2, thM5exceptionOrNullimpl);
        if (!(thM5exceptionOrNullimpl instanceof n5.a)) {
            if (!(thM5exceptionOrNullimpl instanceof IllegalArgumentException) && !(thM5exceptionOrNullimpl instanceof JSONException)) {
                if (!(thM5exceptionOrNullimpl instanceof IOException) && !(thM5exceptionOrNullimpl instanceof SecurityException) && !(thM5exceptionOrNullimpl instanceof UnsupportedOperationException) && !(thM5exceptionOrNullimpl instanceof ReadOnlyBufferException)) {
                    throw new n5.a.C0063a(GeckoValidationError.InvalidManifest);
                }
                throw new n5.a.C0063a(GeckoValidationError.InvalidManifest);
            }
            throw new n5.a.C0063a(GeckoValidationError.UnableToBuildManifest);
        }
        throw thM5exceptionOrNullimpl;
    }
}
