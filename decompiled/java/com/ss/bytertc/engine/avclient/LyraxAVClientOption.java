package com.ss.bytertc.engine.avclient;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public final class LyraxAVClientOption {
    public ArrayList<String> accessHost;
    public Context androidContext;
    public LyraxAVClientChatAgentOption chatAgent;
    public ILyraxAVListener lyraxAVListener;
    public String rtcAppID = "";
    public String rtcRoomID = "";
    public String rtcToken = "";
    public String rtcStreamId = "";
    public String rtcStreamToken = "";
    public String rtcUserID = "";
    public String rtcPushUrl = "";
    public String appChannel = "";
    public String appVersion = "";
    public String appID = "";
    public String deviceID = "";
    public String idc = "";
    public String websocketUrl = "";
    public String autotestParameters = "";
    public boolean initGLEnv = true;
    public String sdkParams = "";

    public String toString() {
        return "LyraxAVClientOption(rtcAppID='" + this.rtcAppID + "', rtcRoomID='" + this.rtcRoomID + "', rtcToken='" + this.rtcToken + "', rtcUserID='" + this.rtcUserID + "', rtcPushUrl='" + this.rtcPushUrl + "', appChannel='" + this.appChannel + "', appVersion='" + this.appVersion + "', appID='" + this.appID + "', deviceID='" + this.deviceID + "', idc='" + this.idc + "', chatAgent=" + this.chatAgent + ", androidContext=" + this.androidContext + ", websocketUrl='" + this.websocketUrl + "', accessHost=" + this.accessHost + ", lyraxAVListener=" + this.lyraxAVListener + ", sdkParams=" + this.sdkParams + ')';
    }

    public final ArrayList<String> getAccessHost() {
        return this.accessHost;
    }

    public final Context getAndroidContext() {
        return this.androidContext;
    }

    public final String getAppChannel() {
        return this.appChannel;
    }

    public final String getAppID() {
        return this.appID;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getAutotestParameters() {
        return this.autotestParameters;
    }

    public final LyraxAVClientChatAgentOption getChatAgent() {
        return this.chatAgent;
    }

    public final String getDeviceID() {
        return this.deviceID;
    }

    public final String getIdc() {
        return this.idc;
    }

    public final boolean getInitGLEnv() {
        return this.initGLEnv;
    }

    public final ILyraxAVListener getLyraxAVListener() {
        return this.lyraxAVListener;
    }

    public final String getRtcAppID() {
        return this.rtcAppID;
    }

    public final String getRtcPushUrl() {
        return this.rtcPushUrl;
    }

    public final String getRtcRoomID() {
        return this.rtcRoomID;
    }

    public final String getRtcStreamId() {
        return this.rtcStreamId;
    }

    public final String getRtcStreamToken() {
        return this.rtcStreamToken;
    }

    public final String getRtcToken() {
        return this.rtcToken;
    }

    public final String getRtcUserID() {
        return this.rtcUserID;
    }

    public final String getSdkParams() {
        return this.sdkParams;
    }

    public final String getWebsocketUrl() {
        return this.websocketUrl;
    }

    public final void setAccessHost(ArrayList<String> arrayList) {
        this.accessHost = arrayList;
    }

    public final void setAndroidContext(Context context) {
        this.androidContext = context;
    }

    public final void setAppChannel(String str) {
        this.appChannel = str;
    }

    public final void setAppID(String str) {
        this.appID = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setAutotestParameters(String str) {
        this.autotestParameters = str;
    }

    public final void setChatAgent(LyraxAVClientChatAgentOption lyraxAVClientChatAgentOption) {
        this.chatAgent = lyraxAVClientChatAgentOption;
    }

    public final void setDeviceID(String str) {
        this.deviceID = str;
    }

    public final void setIdc(String str) {
        this.idc = str;
    }

    public final void setInitGLEnv(boolean z) {
        this.initGLEnv = z;
    }

    public final void setLyraxAVListener(ILyraxAVListener iLyraxAVListener) {
        this.lyraxAVListener = iLyraxAVListener;
    }

    public final void setRtcAppID(String str) {
        this.rtcAppID = str;
    }

    public final void setRtcPushUrl(String str) {
        this.rtcPushUrl = str;
    }

    public final void setRtcRoomID(String str) {
        this.rtcRoomID = str;
    }

    public final void setRtcStreamId(String str) {
        this.rtcStreamId = str;
    }

    public final void setRtcStreamToken(String str) {
        this.rtcStreamToken = str;
    }

    public final void setRtcToken(String str) {
        this.rtcToken = str;
    }

    public final void setRtcUserID(String str) {
        this.rtcUserID = str;
    }

    public final void setSdkParams(String str) {
        this.sdkParams = str;
    }

    public final void setWebsocketUrl(String str) {
        this.websocketUrl = str;
    }
}
