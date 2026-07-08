package com.bytedance.vcloud.strategy.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes27.dex */
public final class WidevineCode {
    public static boolean isMediaDrmResetException(Exception exc) {
        try {
            return Class.forName("android.media.MediaDrmResetException").isInstance(exc);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static int mapMediaDrmException(Exception exc) {
        if (exc instanceof UnsupportedSchemeException) {
            return LSPassThroughRecordSizeConfig.DEFAULT;
        }
        if (exc instanceof NotProvisionedException) {
            return 1002;
        }
        if (exc instanceof MediaCryptoException) {
            return 1006;
        }
        if (exc instanceof ResourceBusyException) {
            return 1001;
        }
        if (exc instanceof MediaDrm.MediaDrmStateException) {
            return 1005;
        }
        if (exc instanceof DeniedByServerException) {
            return 1003;
        }
        if (isMediaDrmResetException(exc)) {
            return 1007;
        }
        if (exc instanceof MediaDrmException) {
            return 1004;
        }
        return -1;
    }
}
