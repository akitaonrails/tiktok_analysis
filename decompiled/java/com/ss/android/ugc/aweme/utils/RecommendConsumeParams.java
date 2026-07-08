package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import X.C2252021DCm;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.experiment.consumption.FeedConsumeParamsWithRequestConfig;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
public final class RecommendConsumeParams implements Serializable {

    @C09CT("author_id")
    public ArrayList<String> author_id;

    @C09CT("bool_params")
    public BoolParams bool_params;

    @C09CT("client_cache")
    public ArrayList<String> client_cache;

    @C09CT("day_r_num")
    public ArrayList<Integer> day_r_num;

    @C09CT("day_v_num")
    public ArrayList<Integer> day_v_num;

    @C09CT("day_view_time")
    public Long day_view_time;

    @C09CT("duration")
    public ArrayList<Long> duration;

    @C09CT("model_type")
    public ArrayList<Integer> model_type;

    @C09CT("playtime")
    public ArrayList<Long> playtime;

    @C09CT("playtime_currentlive")
    public ArrayList<Long> playtime_currentlive;

    @C09CT("playtime_live")
    public ArrayList<Long> playtime_live;

    @C09CT("session_r_num")
    public ArrayList<Integer> session_r_num;

    @C09CT("session_v_num")
    public ArrayList<Integer> session_v_num;

    @C09CT("vid")
    public ArrayList<String> vid;

    @C09CT("vv")
    public ArrayList<Integer> vv;

    public RecommendConsumeParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public final void setAuthor_id(ArrayList<String> arrayList) {
        this.author_id = arrayList;
    }

    public final void setBool_params(BoolParams boolParams) {
        this.bool_params = boolParams;
    }

    public final void setClient_cache(ArrayList<String> arrayList) {
        this.client_cache = arrayList;
    }

    public final void setDay_r_num(ArrayList<Integer> arrayList) {
        this.day_r_num = arrayList;
    }

    public final void setDay_v_num(ArrayList<Integer> arrayList) {
        this.day_v_num = arrayList;
    }

    public final void setDay_view_time(Long l) {
        this.day_view_time = l;
    }

    public final void setDuration(ArrayList<Long> arrayList) {
        this.duration = arrayList;
    }

    public final void setModel_type(ArrayList<Integer> arrayList) {
        this.model_type = arrayList;
    }

    public final void setPlaytime(ArrayList<Long> arrayList) {
        this.playtime = arrayList;
    }

    public final void setPlaytime_currentlive(ArrayList<Long> arrayList) {
        this.playtime_currentlive = arrayList;
    }

    public final void setPlaytime_live(ArrayList<Long> arrayList) {
        this.playtime_live = arrayList;
    }

    public final void setSession_r_num(ArrayList<Integer> arrayList) {
        this.session_r_num = arrayList;
    }

    public final void setSession_v_num(ArrayList<Integer> arrayList) {
        this.session_v_num = arrayList;
    }

    public final void setVid(ArrayList<String> arrayList) {
        this.vid = arrayList;
    }

    public final void setVv(ArrayList<Integer> arrayList) {
        this.vv = arrayList;
    }

    public RecommendConsumeParams(ArrayList<String> arrayList, ArrayList<Integer> arrayList2, ArrayList<Long> arrayList3, ArrayList<Long> arrayList4, ArrayList<Long> arrayList5, ArrayList<Long> arrayList6, ArrayList<Integer> arrayList7, ArrayList<Integer> arrayList8, ArrayList<Integer> arrayList9, ArrayList<Integer> arrayList10, ArrayList<Integer> arrayList11, Long l, ArrayList<String> arrayList12, ArrayList<String> arrayList13, BoolParams boolParams) {
        this.vid = arrayList;
        this.model_type = arrayList2;
        this.playtime = arrayList3;
        this.playtime_live = arrayList4;
        this.playtime_currentlive = arrayList5;
        this.duration = arrayList6;
        this.vv = arrayList7;
        this.session_v_num = arrayList8;
        this.session_r_num = arrayList9;
        this.day_v_num = arrayList10;
        this.day_r_num = arrayList11;
        this.day_view_time = l;
        this.author_id = arrayList12;
        this.client_cache = arrayList13;
        this.bool_params = boolParams;
    }

    public RecommendConsumeParams(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, ArrayList arrayList9, ArrayList arrayList10, ArrayList arrayList11, Long l, ArrayList arrayList12, ArrayList arrayList13, BoolParams boolParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        BoolParams boolParams2 = boolParams;
        ArrayList arrayList14 = arrayList13;
        Long l2 = l;
        ArrayList arrayList15 = arrayList11;
        ArrayList arrayList16 = arrayList10;
        ArrayList arrayList17 = arrayList9;
        ArrayList arrayList18 = arrayList8;
        ArrayList arrayList19 = arrayList7;
        ArrayList arrayList20 = arrayList6;
        ArrayList arrayList21 = arrayList5;
        ArrayList arrayList22 = arrayList4;
        ArrayList arrayList23 = arrayList3;
        ArrayList arrayList24 = arrayList2;
        ArrayList arrayList25 = (i & 1) != 0 ? new ArrayList() : arrayList;
        arrayList24 = (i & 2) != 0 ? new ArrayList() : arrayList24;
        arrayList23 = (i & 4) != 0 ? new ArrayList() : arrayList23;
        arrayList22 = (i & 8) != 0 ? new ArrayList() : arrayList22;
        arrayList21 = (i & 16) != 0 ? new ArrayList() : arrayList21;
        ArrayList arrayList26 = null;
        if ((i & 32) != 0) {
            FeedConsumeParamsWithRequestConfig feedConsumeParamsWithRequestConfig = C2252021DCm.LIZ;
            if (C2252021DCm.LIZLLL) {
                arrayList20 = new ArrayList();
            } else {
                arrayList20 = null;
            }
        }
        if ((i & 64) != 0) {
            FeedConsumeParamsWithRequestConfig feedConsumeParamsWithRequestConfig2 = C2252021DCm.LIZ;
            if (C2252021DCm.LJ) {
                arrayList19 = new ArrayList();
            } else {
                arrayList19 = null;
            }
        }
        arrayList18 = (i & 128) != 0 ? new ArrayList() : arrayList18;
        arrayList17 = (i & 256) != 0 ? new ArrayList() : arrayList17;
        arrayList16 = (i & 512) != 0 ? new ArrayList() : arrayList16;
        arrayList15 = (i & 1024) != 0 ? new ArrayList() : arrayList15;
        l2 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : l2;
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            FeedConsumeParamsWithRequestConfig feedConsumeParamsWithRequestConfig3 = C2252021DCm.LIZ;
            if (C2252021DCm.LJFF) {
                arrayList26 = new ArrayList();
            }
        } else {
            arrayList26 = arrayList12;
        }
        this(arrayList25, arrayList24, arrayList23, arrayList22, arrayList21, arrayList20, arrayList19, arrayList18, arrayList17, arrayList16, arrayList15, l2, arrayList26, (i & 8192) != 0 ? new ArrayList() : arrayList14, (i & 16384) != 0 ? new BoolParams(null, null, null, null, null, null, null, null, null, null) : boolParams2);
    }
}
