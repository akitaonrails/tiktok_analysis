package com.ss.bduploader.net;

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
    public BDVNetClient mNetClient;

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

    public void notifyError(BDUploadDNSInfo bDUploadDNSInfo) {
        C786410Ut5.LJLJJL(this.mHandler, this.mHandler.obtainMessage(2, bDUploadDNSInfo));
    }

    public void notifyRetry(Error error) {
        C786410Ut5.LJLJJL(this.mHandler, this.mHandler.obtainMessage(1, error));
    }

    public void notifySuccess(BDUploadDNSInfo bDUploadDNSInfo) {
        C786410Ut5.LJLJJL(this.mHandler, this.mHandler.obtainMessage(3, bDUploadDNSInfo));
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

    public BaseDNS(String str, BDVNetClient bDVNetClient, Handler handler) {
        this.mHostname = str;
        this.mHandler = handler;
        this.mNetClient = bDVNetClient == null ? new BDHTTPNetwork() : bDVNetClient;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(Long.toString(System.nanoTime()));
        sbLIZ.append(Integer.toString(System.identityHashCode(this)));
        this.mId = C2188811AlT.LIZIZ(sbLIZ);
    }
}
