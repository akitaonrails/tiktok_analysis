package com.ss.ttlivestreamer.core.codec;

import X.C1282630jTx;
import X.C2188811AlT;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.AudioEncoder;
import com.ss.ttlivestreamer.core.engine.AudioEncoderFactory;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: loaded from: classes21.dex */
public class DefaultAudioEncoderFactory extends AudioEncoderFactory {
    public static final String TAG = DefaultAudioEncoderFactory.class.getName();

    private native AudioEncoder nativeDefaultCreateAudioEncoder(String str, boolean z);

    private native String nativeDefaultGetSupportedFormats();

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoderFactory
    public String GetSupportedFormats() {
        String strNativeDefaultGetSupportedFormats = nativeDefaultGetSupportedFormats();
        if (strNativeDefaultGetSupportedFormats == null || strNativeDefaultGetSupportedFormats.isEmpty()) {
            return "audio_type=audio/mp4a-latm";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audio_type=audio/mp4a-latm");
        sbLIZ.append(":");
        sbLIZ.append(strNativeDefaultGetSupportedFormats);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoderFactory
    public AudioEncoder CreateAudioEncoder(String str, boolean z) {
        String str2;
        String[] strArrSplit = str.split(":");
        int length = strArrSplit.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str3 = strArrSplit[i];
            if (str3.contains("audio_type")) {
                String[] strArrSplit2 = str3.split("=");
                if (strArrSplit2.length > 1) {
                    str2 = strArrSplit2[1];
                }
            } else {
                i++;
            }
        }
        str2 = "";
        if (str2.equalsIgnoreCase("audio/mp4a-latm")) {
            C1282630jTx c1282630jTx = new C1282630jTx();
            for (int i2 = 0; i2 < MediaCodecList.getCodecCount(); i2++) {
                try {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                    if (codecInfoAt != null && codecInfoAt.isEncoder()) {
                        String[] supportedTypes = codecInfoAt.getSupportedTypes();
                        for (String str4 : supportedTypes) {
                            if ("audio/mp4a-latm".equals(str4)) {
                                return c1282630jTx;
                            }
                        }
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    String str5 = C1282630jTx.LLJILJIL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cannot retrieve encoder codec info ");
                    sbLIZ.append(e);
                    AVLog.ioe(str5, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            String str6 = TAG;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append(" is not supported on this device.");
            AVLog.ioe(str6, C2188811AlT.LIZIZ(sbLIZ2));
            c1282630jTx.release();
        }
        return nativeDefaultCreateAudioEncoder(str, z);
    }
}
