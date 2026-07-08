package com.bytedance.ttc2pa;

import X.C2188811AlT;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes35.dex */
public final class MoltenFfiTtC2paSdk {
    public static final Companion LIZ = new Companion();

    public static final class Companion {
    }

    public static final native ByteBuffer MoltenFfiNativeCheckSignCertAvailableX2046833424069652343(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeTtc2paReadAndVerifyFromPathX3831892434230964710(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeTtc2paReadIngredientFromPathX7825190323969407641(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeTtc2paSetTempDirX8932877268671037071(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeTtc2paWriteAndSignManifestMoltenX6196825777310389490(ByteBuffer byteBuffer);

    public static final native void freeNativeMemory(ByteBuffer byteBuffer);

    static {
        String property;
        synchronized (Tt_c2pa_sdkKt.class) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("molten_ffi.");
            sbLIZ.append("tt_c2pa_sdk");
            sbLIZ.append(".lib_name");
            property = System.getProperty(C2188811AlT.LIZIZ(sbLIZ));
            if (property == null) {
                property = "tt_c2pa_sdk";
            }
        }
        LoadSoLancet.LIZJ(property);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(property);
        LoadSoLancet.LJ(jUptimeMillis, property);
        LoadSoLancet.LIZLLL(jUptimeMillis, property);
        LoadSoLancet.LIZIZ(property);
    }
}
