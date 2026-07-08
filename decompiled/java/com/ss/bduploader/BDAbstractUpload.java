package com.ss.bduploader;

import com.ss.bduploader.util.BDUrlDispatch;
import com.ss.bduploader.util.CustomVerify;

/* JADX INFO: loaded from: classes21.dex */
public class BDAbstractUpload {
    public static boolean IsErrored;
    public static StringBuffer mErrorMsg;

    public String getStringFromExtern(int i) {
        return "";
    }

    public String intelligentInterface(int i, String str) {
        return "testIntelligentInterface return";
    }

    static {
        mErrorMsg = new StringBuffer("error:");
        StringBuffer stringBuffer = new StringBuffer("error:");
        mErrorMsg = stringBuffer;
        if (BDUploadUtil.initInternal(stringBuffer)) {
            return;
        }
        IsErrored = true;
    }

    public BDAbstractUpload() {
        StringBuffer stringBuffer = new StringBuffer("error:");
        mErrorMsg = stringBuffer;
        BDUploadUtil.initInternal(stringBuffer);
    }

    public String getDispatchByUrl(String str, String str2) {
        if (!BDUploadUtil.mEnableDisaptch.booleanValue()) {
            return null;
        }
        return BDUrlDispatch.inst().getDispatchUrl(str, str2);
    }

    public int doVerify(byte[][] bArr, String str, String str2) {
        return CustomVerify.doVerify(bArr, str, str2);
    }
}
