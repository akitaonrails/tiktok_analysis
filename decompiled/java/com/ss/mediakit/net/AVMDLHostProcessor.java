package com.ss.mediakit.net;

import X.C786410Ut5;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes24.dex */
public class AVMDLHostProcessor {
    public int mBackUpDelayedTime;
    public int mBackUpType;
    public int mEnableParallel;
    public Handler mHandler;
    public String mHost;
    public HashMap<AVMDLDNSParserListener, Integer> mListeners;
    public int mMainType;
    public int[] mStates = new int[2];
    public BaseDNS[] mParsers = new BaseDNS[2];

    public boolean isEnd() {
        int i;
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.mParsers[i2] != null && (i = this.mStates[i2]) != 3 && i != 2) {
                return false;
            }
        }
        AVMDLLog.d("AVMDLHostProcessor", "all dns parse is end");
        return true;
    }

    public boolean isValidSourceId(String str) {
        if (TextUtils.isEmpty(str)) {
            AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(Locale.US, "id: %s is empty", new Object[]{str}));
            return false;
        }
        for (int i = 0; i < 2; i++) {
            BaseDNS baseDNS = this.mParsers[i];
            if (baseDNS != null && str.equals(baseDNS.mId)) {
                AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(Locale.US, "id: %s is valid index: %d", new Object[]{str, Integer.valueOf(i)}));
                return true;
            }
        }
        AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(Locale.US, "id: %s is valid", new Object[]{str}));
        return false;
    }

    private void doParseInternal(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        Locale locale = Locale.US;
        AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(locale, "----do parse internal what:%d info:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo}));
        if (aVMDLDNSInfo == null) {
            return;
        }
        if (i == 5) {
            if (this.mParsers[0] == null) {
                AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(locale, "create main dns type:%d host:%s", new Object[]{Integer.valueOf(this.mMainType), aVMDLDNSInfo.mHost}));
                this.mStates[0] = 1;
                this.mParsers[0] = createDNSParser(aVMDLDNSInfo.mHost, this.mMainType, 0);
                this.mParsers[0].start();
                Message message = new Message();
                message.what = 6;
                message.obj = aVMDLDNSInfo;
                if (this.mBackUpDelayedTime > 0 || this.mEnableParallel > 0) {
                    AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(locale, "BackUpDelayedTime:%d enableparallel:%d send backup delay first", new Object[]{Integer.valueOf(this.mMainType), Integer.valueOf(this.mEnableParallel)}));
                    C786410Ut5.LJLJLJ(this.mHandler, message, this.mBackUpDelayedTime * LSPassThroughRecordSizeConfig.DEFAULT);
                }
            }
        } else if (i == 6 && this.mParsers[1] == null) {
            AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(locale, "create backup dns type:%d host:%s", new Object[]{Integer.valueOf(this.mBackUpType), aVMDLDNSInfo.mHost}));
            this.mStates[1] = 1;
            this.mParsers[1] = createDNSParser(aVMDLDNSInfo.mHost, this.mBackUpType, 1);
            this.mParsers[1].start();
        }
        AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(locale, "****do parse internal end", new Object[0]));
    }

    public void processMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        int[] iArr;
        int i2;
        Locale locale = Locale.US;
        AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(locale, "----processor pro msg what:%d host:%s info:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost, aVMDLDNSInfo}));
        if (i != 5) {
            if (i == 6 && (((i2 = (iArr = this.mStates)[0]) == 1 || i2 == 2 || i2 == 3 || this.mEnableParallel > 0) && iArr[1] == 0)) {
                AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(locale, "main dns is not end or enable parrallel and backup dns is idle call backup dns", new Object[0]));
                doParseInternal(i, aVMDLDNSInfo);
            }
        } else if (this.mStates[0] == 0) {
            AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(locale, "main dns is idle call main dns", new Object[0]));
            doParseInternal(i, aVMDLDNSInfo);
        }
        AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(locale, "****end processor pro msg what:%d host:%s info:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost, aVMDLDNSInfo}));
    }

    public void processResult(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        String str;
        Locale locale = Locale.US;
        AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(locale, "----process result what:%d id:%s host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mId, aVMDLDNSInfo.mHost}));
        if (i != 2 && i != 3) {
            str = null;
        } else {
            str = aVMDLDNSInfo.mId;
        }
        if (TextUtils.isEmpty(str)) {
            AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(locale, "****process result err id is empty", new Object[0]));
            return;
        }
        int i2 = 0;
        while (true) {
            BaseDNS baseDNS = this.mParsers[i2];
            if (baseDNS != null && str.equals(baseDNS.mId)) {
                this.mParsers[i2].close();
                this.mParsers[i2] = null;
                if (i == 3) {
                    this.mStates[i2] = 3;
                } else if (i == 2) {
                    this.mStates[i2] = 2;
                }
                AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(Locale.US, "****process result parser index:%d is end, be close", new Object[]{Integer.valueOf(i2)}));
                if (i2 == 0 && i == 2) {
                    AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(Locale.US, "mian dns parse error, try back up dns", new Object[0]));
                    processMsg(6, new AVMDLDNSInfo(this.mBackUpType, aVMDLDNSInfo.mHost, (String) null, 0L, (String) null));
                }
            } else {
                i2++;
                if (i2 >= 2) {
                    break;
                }
            }
        }
        AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(Locale.US, "****end process result what:%d id:%s host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mId, aVMDLDNSInfo.mHost}));
    }

    private BaseDNS createDNSParser(String str, int i, int i2) {
        try {
            CreateConstructor createConstructor = AVMDLDNSManager.getInstance().getCreateConstructor(i);
            if (createConstructor != null) {
                return createConstructor.createDns(str, null, i, this.mHandler);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i == 4 && AVMDLDNSParser.mCustomHttpDNSParser != null) {
            AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(Locale.US, "create custom httpdns parser for host:%s type:%d", new Object[]{str, Integer.valueOf(i)}));
            return new CustomHTTPDNS(str, this.mHandler);
        }
        AVMDLLog.d("AVMDLHostProcessor", C786410Ut5.k4(Locale.US, "create local dns parser for host:%s type:%d", new Object[]{str, Integer.valueOf(i)}));
        return new LocalDNS(str, this.mHandler);
    }

    public AVMDLHostProcessor(String str, Handler handler, int i, int i2, int i3, int i4) {
        this.mMainType = i;
        this.mBackUpType = i2;
        this.mHandler = handler;
        this.mHost = str;
        this.mBackUpDelayedTime = i3;
        this.mEnableParallel = i4;
        int i5 = 0;
        do {
            this.mParsers[i5] = null;
            i5++;
        } while (i5 < 2);
        int i6 = 0;
        do {
            this.mStates[i6] = 0;
            i6++;
        } while (i6 < 2);
        this.mListeners = new HashMap<>();
    }
}
