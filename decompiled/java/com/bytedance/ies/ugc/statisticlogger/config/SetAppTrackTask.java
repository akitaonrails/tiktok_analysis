package com.bytedance.ies.ugc.statisticlogger.config;

import X.C0CCZ;
import X.C0VZ0;
import X.C810670Vr7;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class SetAppTrackTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SetAppTrackTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    public static String LIZ(String str) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            long length = randomAccessFile.length() - ((long) 2);
            randomAccessFile.seek(length);
            int i = (randomAccessFile.read() & 255) | ((randomAccessFile.read() & 255) << 8);
            if (i == 0) {
                randomAccessFile.close();
                return null;
            }
            randomAccessFile.seek(length - ((long) i));
            byte[] bArr = new byte[i];
            randomAccessFile.read(bArr);
            String string = bArr.toString();
            randomAccessFile.close();
            return string;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            randomAccessFile.close();
            throw th;
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            String strLIZ = LIZ(context.getPackageCodePath());
            if (!TextUtils.isEmpty(strLIZ)) {
                AppLog.setAppTrack(new JSONObject(strLIZ));
                SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, "applog_stats").edit();
                editorEdit.putString("app_track", strLIZ);
                editorEdit.apply();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
