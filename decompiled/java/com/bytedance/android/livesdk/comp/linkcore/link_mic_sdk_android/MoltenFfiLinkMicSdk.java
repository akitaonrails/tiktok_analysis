package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.C2188811AlT;
import X.C2231651CWd;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public final class MoltenFfiLinkMicSdk {
    public static final /* synthetic */ int LIZ = 0;

    public static final native void MoltenFfiNativeBindLayoutLayerX1890126169443502120(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeConvertCohostLayoutExtraToBase64X4926245109074220521(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeConvertCohostLayoutWindowExtraToBase64X3628114302356674980(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeConvertMultiGuestLayoutExtraToBase64X4734355880332862199(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeConvertMultiGuestSpotExtraListToBase64ListX8812820598025254204(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeCreateCrossLinkerX4666288658257170903(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeCreateLinkMicLayoutLayerX407771019193859557(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeCreateMultiLinkerX5866490011149426443(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeCreateSymphonyEngineX2956287590445860956(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeCreateUnionLinkerX7882249084914884145(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeGetLinkMicLayoutQosMonitorX2948245261822755766(ByteBuffer byteBuffer);

    public static final native ByteBuffer MoltenFfiNativeResolveSimplePlayerFrameX6415509463483633938(ByteBuffer byteBuffer);

    public static final native void MoltenFfiNativeSetLiveHttpRequestProviderX6722007907751469305(ByteBuffer byteBuffer);

    public static final native void MoltenFfiNativeSetLiveTrackerProviderX8936323554065951647(ByteBuffer byteBuffer);

    public static final native void MoltenFfiNativeSetLogProviderX6127884593856935355(ByteBuffer byteBuffer);

    public static final native void MoltenFfiNativeSetSettingsProviderX8193175361753388272(ByteBuffer byteBuffer);

    public static final native void freeNativeMemory(ByteBuffer byteBuffer);

    static {
        String property;
        synchronized (C2231651CWd.class) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("molten_ffi.");
            sbLIZ.append("link_mic_sdk");
            sbLIZ.append(".lib_name");
            property = System.getProperty(C2188811AlT.LIZIZ(sbLIZ));
            if (property == null) {
                property = "link_mic_sdk";
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
