package com.ss.android.ugc.playerkit.session;

import X.C1480340ocq;
import X.C2188811AlT;
import X.EnumC1479760obu;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes24.dex */
public class Session {
    public boolean bytevc1;
    public double calcBitrate;
    public int cdnUrlCandidatesNum;
    public int codecType;
    public float duration;
    public boolean isCurrentPlayer;
    public boolean isOpenSuperResolution;
    public boolean isStub;
    public String key;
    public EnumC1479760obu playerType;
    public String selectDiffStrForSDK;
    public String selectGearName;
    public String sourceId;
    public C1480340ocq state;
    public String uri;
    public String url;
    public SimVideoUrlModel urlModel;
    public static final Queue<Session> pool = new LinkedBlockingQueue(10);
    public static final Session DEFAULT = new Session(true);
    public float speed = -1.0f;
    public int blockCnt = -1;
    public int blockTime = -1;
    public int bitrate = -1;
    public int audioBitrate = -1;
    public long timeCostForSelectSDK = -1;
    public String selectFlow = "notAssign";
    public float playBitrate = -1.0f;
    public int playTime = -1;
    public int cacheSize = -1;
    public int bizSRStrategyStatus = -2;
    public int videoCoverState = -1;

    private void clear() {
        this.sourceId = null;
        this.uri = null;
        this.url = null;
        setCodecType(0);
        this.duration = 0.0f;
        this.speed = -1.0f;
        this.blockCnt = -1;
        this.blockTime = -1;
        this.bitrate = -1;
        this.playBitrate = -1.0f;
        this.playTime = -1;
        this.cacheSize = -1;
        this.playerType = null;
        this.isCurrentPlayer = false;
        this.urlModel = null;
        this.state = null;
        this.calcBitrate = 0.0d;
        this.isOpenSuperResolution = false;
        this.bizSRStrategyStatus = 0;
        this.videoCoverState = -1;
    }

    public static Session instance() {
        Session sessionPoll = pool.poll();
        return sessionPoll == null ? new Session() : sessionPoll;
    }

    public Session() {
    }

    public void recycle() {
        clear();
        pool.offer(this);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Session{key='");
        sbLIZ.append(this.key);
        sbLIZ.append('\'');
        sbLIZ.append(", sourceId='");
        sbLIZ.append(this.sourceId);
        sbLIZ.append('\'');
        sbLIZ.append(", uri='");
        sbLIZ.append(this.uri);
        sbLIZ.append('\'');
        sbLIZ.append(", url='");
        sbLIZ.append(this.url);
        sbLIZ.append('\'');
        sbLIZ.append(", codecType=");
        sbLIZ.append(this.codecType);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(", blockCnt=");
        sbLIZ.append(this.blockCnt);
        sbLIZ.append(", blockTime=");
        sbLIZ.append(this.blockTime);
        sbLIZ.append(", bitrate=");
        sbLIZ.append(this.bitrate);
        sbLIZ.append(", calcBitrate=");
        sbLIZ.append(this.calcBitrate);
        sbLIZ.append(", playBitrate=");
        sbLIZ.append(this.playBitrate);
        sbLIZ.append(", playTime=");
        sbLIZ.append(this.playTime);
        sbLIZ.append(", cacheSize=");
        sbLIZ.append(this.cacheSize);
        sbLIZ.append(", playerType=");
        sbLIZ.append(this.playerType);
        sbLIZ.append(", isCurrentPlayer=");
        sbLIZ.append(this.isCurrentPlayer);
        sbLIZ.append(", urlModel=");
        sbLIZ.append(this.urlModel);
        sbLIZ.append(", state=");
        sbLIZ.append(this.state);
        sbLIZ.append(", isOpenSuperResolution=");
        sbLIZ.append(this.isOpenSuperResolution);
        sbLIZ.append(", preSuperResolution=");
        sbLIZ.append(this.bizSRStrategyStatus);
        sbLIZ.append(", isStub=");
        sbLIZ.append(this.isStub);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getCodecType() {
        return this.codecType;
    }

    public boolean isStub() {
        return this.isStub;
    }

    public Session(boolean z) {
        this.isStub = z;
    }

    public void setBizSRStrategyStatus(int i) {
        this.bizSRStrategyStatus = i;
    }

    public void setCodecType(int i) {
        this.codecType = i;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.bytevc1 = z;
    }
}
