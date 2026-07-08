package okhttp3.logging;

import X.C0X1V;
import X.C1496690p3D;
import X.C2188811AlT;
import X.EnumC841920X1a;
import X.InterfaceC836900WsK;
import X.InterfaceC841930X1b;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class HttpLoggingInterceptor implements InterfaceC836900WsK {
    public static final Charset LIZLLL = Charset.forName("UTF-8");
    public final InterfaceC841930X1b LIZ;
    public volatile Set<String> LIZIZ;
    public volatile EnumC841920X1a LIZJ;

    public HttpLoggingInterceptor() {
        this(InterfaceC841930X1b.LIZ);
    }

    public HttpLoggingInterceptor(InterfaceC841930X1b interfaceC841930X1b) {
        this.LIZIZ = Collections.emptySet();
        this.LIZJ = EnumC841920X1a.NONE;
        this.LIZ = interfaceC841930X1b;
    }

    public static boolean LIZ(C1496690p3D c1496690p3D) {
        try {
            C1496690p3D c1496690p3D2 = new C1496690p3D();
            long j = c1496690p3D.LLILLJJLI;
            if (j >= 64) {
                j = 64;
            }
            c1496690p3D.LJFF(c1496690p3D2, 0L, j);
            int i = 0;
            while (!c1496690p3D2.LJJJJLL()) {
                int iLJJJ = c1496690p3D2.LJJJ();
                if (Character.isISOControl(iLJJJ) && !Character.isWhitespace(iLJJJ)) {
                    return false;
                }
                i++;
                if (i >= 16) {
                    return true;
                }
            }
            return true;
        } catch (EOFException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028a  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:97:0x02e9
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // X.InterfaceC836900WsK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0XLY intercept(X.C0X0W r22) {
        /*
            Method dump skipped, instruction units count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.intercept(X.0X0W):X.0XLY");
    }

    public final void LIZIZ(C0X1V c0x1v, int i) {
        String strLJIIJ;
        if (this.LIZIZ.contains(c0x1v.LJ(i))) {
            strLJIIJ = "██";
        } else {
            strLJIIJ = c0x1v.LJIIJ(i);
        }
        InterfaceC841930X1b interfaceC841930X1b = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0x1v.LJ(i));
        sbLIZ.append(": ");
        sbLIZ.append(strLJIIJ);
        interfaceC841930X1b.log(C2188811AlT.LIZIZ(sbLIZ));
    }
}
