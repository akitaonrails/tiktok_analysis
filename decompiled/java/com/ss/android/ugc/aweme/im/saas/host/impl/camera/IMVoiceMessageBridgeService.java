package com.ss.android.ugc.aweme.im.saas.host.impl.camera;

import X.C047900Fh;
import X.C0E38;
import X.C0VSJ;
import X.C1329305Id;
import X.C13LE;
import X.C1AF0;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2510109sZ;
import X.C271140Ajw;
import X.C458640Hyg;
import X.C869590Y9l;
import X.InterfaceC1493105sv;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMVoiceMessageBridgeApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import com.ss.android.vesdk.VEUtils;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public final class IMVoiceMessageBridgeService implements IMVoiceMessageBridgeApi {
    public static void LJFF() {
        IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
        C13LE.LIZ(IMVoiceMessageBridgeService.class);
        iMVoiceMessageUtil.getClass();
    }

    public static void LIZLLL(C0VSJ c0vsj) {
        try {
            c0vsj.createNewFile();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to create file ");
            sbLIZ.append(c0vsj.getAbsolutePath());
            sbLIZ.append(": ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            LJFF();
            C1AF0.LJFF(e, e.getMessage());
        }
    }

    public static void LJ(C0VSJ c0vsj) {
        try {
            c0vsj.delete();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("failed to delete ");
            sbLIZ.append(c0vsj.getAbsolutePath());
            C2188811AlT.LIZIZ(sbLIZ);
            LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMVoiceMessageBridgeApi
    public final void LIZ(C869590Y9l c869590Y9l) {
        IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpi$default(IIMPreloadService.class, false, false, false, 14, null);
        if (iIMPreloadService != null && iIMPreloadService.LIZ() != null) {
            C1329305Id.LIZJ(Collections.singletonList(new C047900Fh(c869590Y9l.getUuid(), C2097908Jt.LIZJ(new Pair("MESSAGE", c869590Y9l)))));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMVoiceMessageBridgeApi
    public final C0VSJ LIZIZ(Context context, int i, String str) throws IOException {
        long j;
        int iLJ;
        IMVoiceMessageUtil.LIZ.getClass();
        C0VSJ c0vsj = new C0VSJ(IMVoiceMessageUtil.LJII(context), "process");
        if (!c0vsj.exists()) {
            c0vsj.mkdir();
        }
        String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.getDefault()).format(new Date());
        int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
        if (i2 < 1) {
            i2 = 1;
        }
        long j2 = 2;
        long jLIZIZ = (long) (((long) C2510109sZ.LIZIZ()) * j2 * j2 * ((long) i2) * 1.1d);
        boolean z = false;
        try {
            long usableSpace = c0vsj.getUsableSpace();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Available space: ");
            sbLIZ.append(usableSpace);
            sbLIZ.append(" bytes, required: ");
            sbLIZ.append(jLIZIZ);
            sbLIZ.append(" bytes");
            C2188811AlT.LIZIZ(sbLIZ);
            LJFF();
            if (usableSpace < jLIZIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Insufficient storage space. Required: ");
                sbLIZ2.append(jLIZIZ / ((long) 1024));
                sbLIZ2.append("KB");
                C2188811AlT.LIZIZ(sbLIZ2);
                LJFF();
                throw new IOException("Not enough storage space to process voice message");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Failed to check available space: ");
            sbLIZ3.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ3);
            LJFF();
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(str2);
        sbLIZ4.append("_trimmed.wav");
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ4));
        LIZLLL(c0vsj2);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(str2);
        sbLIZ5.append("_remainder.wav");
        C0VSJ c0vsj3 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ5));
        LIZLLL(c0vsj3);
        TEVideoUtils.nativeSplitVideo(str, new String[]{c0vsj2.getAbsolutePath(), c0vsj3.getAbsolutePath()}, new int[]{i}, true);
        LJ(c0vsj3);
        IMVoiceMessageUtil.LIZ.getClass();
        C0VSJ c0vsj4 = new C0VSJ(IMVoiceMessageUtil.LJII(context), "send");
        if (!c0vsj4.exists()) {
            c0vsj4.mkdir();
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(str2);
        sbLIZ6.append(".m4a");
        C0VSJ c0vsj5 = new C0VSJ(c0vsj4, C2188811AlT.LIZIZ(sbLIZ6));
        LIZLLL(c0vsj5);
        if (((Number) C271140Ajw.LIZ.getValue()).intValue() > 0) {
            z = true;
        }
        if (z) {
            TENativeLibsLoader.loadLibrary();
            NLE.loadNLELibrary$default(NLE.INSTANCE, false, false, false, 7, null);
            VEUtils.VEAudioFileInfo audioFileInfo = VEUtils.getAudioFileInfo(c0vsj2.getAbsolutePath());
            if (audioFileInfo != null) {
                j = audioFileInfo.duration;
            } else {
                j = 0;
            }
            long j3 = j * 1000;
            NLEModel nLEModel = new NLEModel();
            NLETrack nLETrack = new NLETrack();
            nLETrack.setMainTrack(true);
            NLETrackSlot nLETrackSlot = new NLETrackSlot();
            NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
            NLEResourceAV nLEResourceAV = new NLEResourceAV();
            nLEResourceAV.setResourceType(NLEResType.AUDIO);
            nLESegmentAudio.setTimeClipStart(0L);
            nLEResourceAV.setDuration(j3);
            nLESegmentAudio.setTimeClipEnd(j3);
            nLEResourceAV.setResourceFile(c0vsj2.getAbsolutePath());
            nLESegmentAudio.setAVFile(nLEResourceAV);
            nLETrackSlot.setMainSegment(nLESegmentAudio);
            nLETrackSlot.setStartTime(0L);
            nLETrackSlot.setEndTime(j3);
            nLETrack.addSlot(nLETrackSlot);
            nLEModel.addTrack(nLETrack);
            String absolutePath = c0vsj5.getAbsolutePath();
            try {
                SettingsManager.LIZLLL().getClass();
                iLJ = SettingsManager.LJ("im_voice_message_recording_bitrate", 32000);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                iLJ = 32000;
            }
            NLEError nLEErrorLIZ = C0E38.LIZ(absolutePath, nLEModel, null, null, 0, iLJ, C2510109sZ.LIZIZ(), null, null, true, true, 412);
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("saved file to ");
            sbLIZ7.append(c0vsj5.getAbsolutePath());
            sbLIZ7.append(". file size = ");
            sbLIZ7.append(c0vsj5.length());
            sbLIZ7.append(", error=");
            sbLIZ7.append(nLEErrorLIZ);
            C2188811AlT.LIZIZ(sbLIZ7);
            LJFF();
        } else {
            VEUtils.transCodeAudio(c0vsj2.getAbsolutePath(), c0vsj5.getAbsolutePath(), -1, -1, -1, "aac");
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("saved file to ");
            sbLIZ8.append(c0vsj5.getAbsolutePath());
            sbLIZ8.append(". file size = ");
            sbLIZ8.append(c0vsj5.length());
            C2188811AlT.LIZIZ(sbLIZ8);
            LJFF();
        }
        LJ(c0vsj2);
        return c0vsj5;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMVoiceMessageBridgeApi
    public final void LIZJ(int i, boolean z, String str, String str2, boolean z2, InterfaceC1493105sv interfaceC1493105sv) {
        C458640Hyg.LJI("notification_page", i, z, true, str, str2, z2, interfaceC1493105sv);
    }
}
