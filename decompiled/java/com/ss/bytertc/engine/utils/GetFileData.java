package com.ss.bytertc.engine.utils;

import X.C09NT;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class GetFileData {
    public static ByteBuffer convertDirectBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        byteBufferAllocateDirect.position(0);
        byteBufferAllocateDirect.put(byteBuffer);
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    public static ByteBuffer readFile(String str) {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (str.startsWith("/assets/") && applicationContext != null) {
            return getAssets(applicationContext, str.substring(8));
        }
        if (str.startsWith("content://") && applicationContext != null) {
            return getOthers(applicationContext, str);
        }
        return null;
    }

    public static ByteBuffer getAssets(Context context, String str) {
        try {
            InputStream inputStreamOpen = context.getResources().getAssets().open(str);
            if (inputStreamOpen == null) {
                return null;
            }
            byte[] bArr = new byte[inputStreamOpen.available()];
            int i = inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            if (i <= 0) {
                return null;
            }
            return convertDirectBuffer(ByteBuffer.wrap(bArr));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static ByteBuffer getOthers(Context context, String str) {
        try {
            InputStream inputStreamLJ = C09NT.LJ(context.getContentResolver(), UriProtector.parse(str));
            if (inputStreamLJ == null) {
                return null;
            }
            byte[] bArr = new byte[inputStreamLJ.available()];
            int i = inputStreamLJ.read(bArr);
            inputStreamLJ.close();
            if (i <= 0) {
                return null;
            }
            return convertDirectBuffer(ByteBuffer.wrap(bArr));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
