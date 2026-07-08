package com.ss.bduploader.net;

import X.C786410Ut5;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.bduploader.BDUploadLog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes24.dex */
public class BDUploadHostProcessor {
    public int mBackUpDelayedTime;
    public int mBackUpType;
    public Handler mHandler;
    public String mHost;
    public HashMap<BDUploadDNSParserListener, Integer> mListeners;
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
        BDUploadLog.d("BDUploadHostProcessor", "all dns parse is end");
        return true;
    }

    public boolean isValidSourceId(String str) {
        if (TextUtils.isEmpty(str)) {
            BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("id: %s is empty", new Object[]{str}));
            return false;
        }
        for (int i = 0; i < 2; i++) {
            BaseDNS baseDNS = this.mParsers[i];
            if (baseDNS != null && str.equals(baseDNS.mId)) {
                BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("id: %s is valid index: %d", new Object[]{str, Integer.valueOf(i)}));
                return true;
            }
        }
        BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("id: %s is valid", new Object[]{str}));
        return false;
    }

    private void doParseInternal(int i, BDUploadDNSInfo bDUploadDNSInfo) {
        BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("----do parse internal what:%d info:%s", new Object[]{Integer.valueOf(i), bDUploadDNSInfo}));
        if (bDUploadDNSInfo == null) {
            return;
        }
        if (i == 0) {
            if (this.mParsers[0] == null) {
                BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("create main dns type:%d host:%s", new Object[]{Integer.valueOf(this.mMainType), bDUploadDNSInfo.mHost}));
                this.mStates[0] = 1;
                this.mParsers[0] = createDNSParser(bDUploadDNSInfo.mHost, this.mMainType, 0);
                this.mParsers[0].start();
                Message message = new Message();
                message.what = 1;
                message.obj = bDUploadDNSInfo;
                if (this.mBackUpDelayedTime > 0) {
                    BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("BackUpDelayedTime:%d send backup delay first", new Object[]{Integer.valueOf(this.mMainType)}));
                    C786410Ut5.LJLJLJ(this.mHandler, message, this.mBackUpDelayedTime * LSPassThroughRecordSizeConfig.DEFAULT);
                }
            }
        } else if (i == 1 && this.mParsers[1] == null) {
            BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("create backup dns type:%d host:%s", new Object[]{Integer.valueOf(this.mMainType), bDUploadDNSInfo.mHost}));
            this.mStates[1] = 1;
            this.mParsers[1] = createDNSParser(bDUploadDNSInfo.mHost, this.mBackUpType, 1);
            this.mParsers[1].start();
        }
        BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("****do parse internal end", new Object[0]));
    }

    public void processMsg(int i, BDUploadDNSInfo bDUploadDNSInfo) {
        int[] iArr;
        int i2;
        BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("----processor pro msg what:%d host:%s info:%s", new Object[]{Integer.valueOf(i), bDUploadDNSInfo.mHost, bDUploadDNSInfo}));
        if (i != 0) {
            if (i == 1 && (((i2 = (iArr = this.mStates)[0]) == 1 || i2 == 2 || i2 == 3) && iArr[1] == 0)) {
                BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("main dns is not end and backup dns is idle call backup dns", new Object[0]));
                doParseInternal(i, bDUploadDNSInfo);
            }
        } else if (this.mStates[0] == 0) {
            BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("main dns is idle call main dns", new Object[0]));
            doParseInternal(i, bDUploadDNSInfo);
        }
        BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("****end processor pro msg what:%d host:%s info:%s", new Object[]{Integer.valueOf(i), bDUploadDNSInfo.mHost, bDUploadDNSInfo}));
    }

    public void processResult(int i, BDUploadDNSInfo bDUploadDNSInfo) {
        String str;
        BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("----process result what:%d id:%s host:%s", new Object[]{Integer.valueOf(i), bDUploadDNSInfo.mId, bDUploadDNSInfo.mHost}));
        if (i != 2 && i != 3) {
            str = null;
        } else {
            str = bDUploadDNSInfo.mId;
        }
        if (TextUtils.isEmpty(str)) {
            BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("****process result err id is empty", new Object[0]));
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
                BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("****process result parser index:%d is end, be close", new Object[]{Integer.valueOf(i2)}));
                if (i2 == 0 && i == 2) {
                    BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("mian dns parse error, try back up dns", new Object[0]));
                    processMsg(1, new BDUploadDNSInfo(BDUploadDNSParser.mGlobalBackType, bDUploadDNSInfo.mHost, null, 0L, null));
                }
            } else {
                i2++;
                if (i2 >= 2) {
                    break;
                }
            }
        }
        BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("****end process result what:%d id:%s host:%s", new Object[]{Integer.valueOf(i), bDUploadDNSInfo.mId, bDUploadDNSInfo.mHost}));
    }

    private BaseDNS createDNSParser(String str, int i, int i2) {
        if (i != 1 && i != 2 && i != 3) {
            BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("create local dns parser for host:%s type:%d", new Object[]{str, Integer.valueOf(i)}));
            return new LocalDNS(str, this.mHandler);
        }
        BDUploadLog.d("BDUploadHostProcessor", C786410Ut5.j4("create http dns parser for host:%s type:%d", new Object[]{str, Integer.valueOf(i)}));
        return new HTTPDNS(str, null, i, this.mHandler);
    }

    public BDUploadHostProcessor(String str, Handler handler, int i, int i2, int i3) {
        this.mMainType = i;
        this.mBackUpType = i2;
        this.mHandler = handler;
        this.mHost = str;
        this.mBackUpDelayedTime = i3;
        int i4 = 0;
        do {
            this.mParsers[i4] = null;
            i4++;
        } while (i4 < 2);
        int i5 = 0;
        do {
            this.mStates[i5] = 0;
            i5++;
        } while (i5 < 2);
        this.mListeners = new HashMap<>();
    }
}
