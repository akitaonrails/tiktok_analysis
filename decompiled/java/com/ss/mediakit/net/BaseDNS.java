package com.ss.mediakit.net;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Handler;

/* JADX INFO: loaded from: classes24.dex */
public class BaseDNS {
    public boolean mCancelled;
    public Handler mHandler;
    public String mHostname;
    public String mId;
    public DNSCompletionListener mListener;
    public AVMDLNetClient mNetClient;

    public void cancel() {
    }

    public void close() {
    }

    public boolean isRunning() {
        return true;
    }

    public void start() {
    }

    public void notifyCancelled() {
        C786410Ut5.LJLILLLLZI(this.mHandler, 0);
    }

    public void notifyError(AVMDLDNSInfo aVMDLDNSInfo) {
        C786410Ut5.LJLJJL(this.mHandler, this.mHandler.obtainMessage(2, aVMDLDNSInfo));
    }

    public void notifyRetry(Error error) {
        C786410Ut5.LJLJJL(this.mHandler, this.mHandler.obtainMessage(1, error));
    }

    public void notifySuccess(AVMDLDNSInfo aVMDLDNSInfo) {
        C786410Ut5.LJLJJL(this.mHandler, this.mHandler.obtainMessage(3, aVMDLDNSInfo));
    }

    public void setCompletionListener(DNSCompletionListener dNSCompletionListener) {
        this.mListener = dNSCompletionListener;
    }

    public BaseDNS(String str, Handler handler) {
        this.mHostname = str;
        this.mHandler = handler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(Long.toString(System.nanoTime()));
        sbLIZ.append(Integer.toString(System.identityHashCode(this)));
        this.mId = C2188811AlT.LIZIZ(sbLIZ);
    }

    public BaseDNS(String str, AVMDLNetClient aVMDLNetClient, Handler handler) {
        this.mHostname = str;
        this.mHandler = handler;
        this.mNetClient = aVMDLNetClient == null ? AVMDLDNSParser.getNetClient() : aVMDLNetClient;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(Long.toString(System.nanoTime()));
        sbLIZ.append(Integer.toString(System.identityHashCode(this)));
        this.mId = C2188811AlT.LIZIZ(sbLIZ);
    }
}
