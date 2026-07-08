package com.ss.android.ugc.aweme.series.commonfeed.component.playnext;

import X.AnonymousClass0591;
import X.C01GW;
import X.C05J3;
import X.C0BNN;
import X.C0SHS;
import X.C0SHY;
import X.C0SHZ;
import X.C1478160oZK;
import X.C1483340ohg;
import X.C1483410ohn;
import X.C20684815ws;
import X.C718680SHa;
import X.InterfaceC0148002o;
import X.InterfaceC1475290oUh;
import X.InterfaceC1475300oUi;
import X.InterfaceC497601wk;
import android.os.SystemClock;
import android.util.Pair;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.series.commonfeed.component.playnext.AutoPlayNextVM;
import com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class AutoPlayNextVM extends FeedBaseViewModel<C718680SHa> {
    public C0SHS LL;
    public int LLILLJJLI;
    public long LLILLL;
    public C0SHY LLILZ;
    public C0SHZ LLILZIL;
    public boolean LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.0SHa
        };
    }

    public final int xQ2() {
        VideoItemParams item;
        Aweme aweme;
        Video video;
        C01GW c01gw = C0BNN.LIZ;
        if (((Number) c01gw.getValue()).intValue() <= 0 || (item = getItem()) == null || (aweme = item.getAweme()) == null || (video = aweme.getVideo()) == null) {
            return 10000;
        }
        return video.getDuration() / ((Number) c01gw.getValue()).intValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0SHS c0shs = this.LL;
        if (c0shs != null) {
            c0shs.clearCache();
        }
    }

    public final Float yQ2() {
        Aweme aweme;
        Video video;
        int duration;
        VideoItemParams item = getItem();
        if (item == null || (aweme = item.getAweme()) == null || (video = aweme.getVideo()) == null || (duration = video.getDuration()) < 5000) {
            return null;
        }
        return Float.valueOf((((long) duration) - C1483410ohn.LJLJJI().getCurrentPosition()) / C1483410ohn.LJLJJI().getSpeed());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0SHY] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0SHZ] */
    public final void wQ2(final Aweme aweme) {
        if (!this.LLILZLL && this.LLILLJJLI < 3) {
            if (((Number) C0BNN.LIZ.getValue()).intValue() > 0 && SystemClock.elapsedRealtime() - this.LLILLL < 1000) {
                return;
            }
            this.LLILZLL = true;
            C0SHY c0shy = this.LLILZ;
            if (c0shy != null) {
                C1478160oZK.LIZ().LJIILIIL(c0shy);
            }
            C0SHZ c0shz = this.LLILZIL;
            if (c0shz != null) {
                C1478160oZK.LIZ().LIZIZ(c0shz);
            }
            this.LLILZ = new InterfaceC1475290oUh() { // from class: X.0SHY
                @Override // X.InterfaceC1475290oUh
                public final void LIZJ(Pair<SimVideoUrlModel, String> pair) throws JSONException {
                    String sourceId;
                    String sourceId2;
                    String urlKey;
                    String episodeNumber;
                    Aweme aweme2;
                    Aweme aweme3;
                    PaidContentInfo paidContentInfo;
                    SimVideoUrlModel simVideoUrlModel;
                    String desc = null;
                    if (pair != null && (simVideoUrlModel = (SimVideoUrlModel) pair.first) != null) {
                        sourceId = simVideoUrlModel.getSourceId();
                    } else {
                        sourceId = null;
                    }
                    if (!Intrinsics.LJFF(sourceId, aweme.getAid())) {
                        return;
                    }
                    AutoPlayNextVM autoPlayNextVM = this;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[preloadVideo] done ");
                    sbLIZ.append(aweme.getAid());
                    sbLIZ.append(" result=");
                    SimVideoUrlModel simVideoUrlModel2 = (SimVideoUrlModel) pair.first;
                    if (simVideoUrlModel2 != null) {
                        sourceId2 = simVideoUrlModel2.getSourceId();
                    } else {
                        sourceId2 = null;
                    }
                    sbLIZ.append(sourceId2);
                    sbLIZ.append(' ');
                    SimUrlModel simUrlModel = (SimUrlModel) pair.first;
                    if (simUrlModel != null) {
                        urlKey = simUrlModel.getUrlKey();
                    } else {
                        urlKey = null;
                    }
                    sbLIZ.append(urlKey);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    autoPlayNextVM.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[Episode ");
                    VideoItemParams item = autoPlayNextVM.getItem();
                    if (item != null && (aweme3 = item.getAweme()) != null && (paidContentInfo = aweme3.mPaidContentInfo) != null) {
                        episodeNumber = paidContentInfo.getEpisodeNumber();
                    } else {
                        episodeNumber = null;
                    }
                    sbLIZ2.append(episodeNumber);
                    sbLIZ2.append("] [Desc ");
                    VideoItemParams item2 = autoPlayNextVM.getItem();
                    if (item2 != null && (aweme2 = item2.getAweme()) != null) {
                        desc = aweme2.getDesc();
                    }
                    sbLIZ2.append(desc);
                    sbLIZ2.append("] ");
                    sbLIZ2.append(strLIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    HashMap<String, String> mobParams = aweme.getMobParams();
                    if (mobParams != null) {
                        mobParams.put("preload_stage", "preload_stage_success");
                    }
                    this.vQ2(aweme, this, "preload_success");
                }

                @Override // X.InterfaceC1475290oUh
                public final void LIZLLL(List<SimVideoUrlModel> list) throws JSONException {
                    Aweme aweme2 = aweme;
                    for (Object obj : (ArrayList) list) {
                        if (Intrinsics.LJFF(((SimVideoUrlModel) obj).getSourceId(), aweme2.getAid())) {
                            if (obj != null) {
                                HashMap<String, String> mobParams = aweme.getMobParams();
                                if (mobParams != null) {
                                    mobParams.put("preload_stage", "preload_stage_cancel");
                                }
                                this.vQ2(aweme, this, "preload_cancel");
                                return;
                            }
                            return;
                        }
                    }
                }

                @Override // X.InterfaceC1475290oUh
                public final void LJFF(SimVideoUrlModel simVideoUrlModel) throws JSONException {
                    String sourceId;
                    if (simVideoUrlModel != null) {
                        sourceId = simVideoUrlModel.getSourceId();
                    } else {
                        sourceId = null;
                    }
                    if (!Intrinsics.LJFF(sourceId, aweme.getAid())) {
                        return;
                    }
                    HashMap<String, String> mobParams = aweme.getMobParams();
                    if (mobParams != null) {
                        mobParams.put("preload_stage", "preload_stage_error");
                    }
                    this.vQ2(aweme, this, "preload_error");
                }
            };
            this.LLILZIL = new InterfaceC1475300oUi() { // from class: X.0SHZ
                @Override // X.InterfaceC1475300oUi
                public final /* synthetic */ void LLLLZLLIL(String str) {
                }

                @Override // X.InterfaceC1475300oUi
                public final void Sm() {
                }

                @Override // X.InterfaceC1475300oUi
                public final /* synthetic */ void Xi(String str, String str2, long j, long j2) {
                }

                @Override // X.InterfaceC1475300oUi
                public final void Z9() {
                }

                @Override // X.InterfaceC1475300oUi
                public final void ck() {
                }

                @Override // X.InterfaceC1475300oUi
                public final void qc(long j, long j2, String str) {
                }

                @Override // X.InterfaceC1475300oUi
                public final void t8(String str, long j, long j2, String str2) {
                }

                @Override // X.InterfaceC1475300oUi
                public final void T8(List<SimVideoUrlModel> list) {
                    if (list != null) {
                        AutoPlayNextVM autoPlayNextVM = this;
                        Aweme aweme2 = aweme;
                        if (!list.isEmpty()) {
                            Iterator<SimVideoUrlModel> it2 = list.iterator();
                            while (it2.hasNext()) {
                                String urlKey = it2.next().getUrlKey();
                                autoPlayNextVM.getClass();
                                if (AutoPlayNextVM.zQ2(aweme2, urlKey)) {
                                    C1478160oZK.LIZ().LIZIZ(this);
                                    return;
                                }
                            }
                        }
                    }
                }

                @Override // X.InterfaceC1475300oUi
                public final void Dd(int i, String str, String str2, String str3) throws JSONException {
                    AutoPlayNextVM autoPlayNextVM = this;
                    Aweme aweme2 = aweme;
                    autoPlayNextVM.getClass();
                    if (AutoPlayNextVM.zQ2(aweme2, str)) {
                        C1478160oZK.LIZ().LIZIZ(this);
                        this.AQ2(aweme, "preload_fail", new C143200gg(i, str3));
                    }
                }

                @Override // X.InterfaceC1475300oUi
                public final void tf(long j, long j2, String str, String str2) {
                    AutoPlayNextVM autoPlayNextVM = this;
                    Aweme aweme2 = aweme;
                    autoPlayNextVM.getClass();
                    if (AutoPlayNextVM.zQ2(aweme2, str)) {
                        C1478160oZK.LIZ().LIZIZ(this);
                    }
                }
            };
            C1478160oZK.LIZ().LIZLLL(this.LLILZIL);
            C1478160oZK.LIZ().LJJI(this.LLILZ);
            C1483340ohg.LJIL(819200, aweme);
            AQ2(aweme, "preload_start", null);
        }
    }

    public static boolean zQ2(Aweme aweme, String str) {
        List<BitRate> bitRate;
        VideoUrlModel h264PlayAddr;
        VideoUrlModel playAddr;
        Video video = aweme.getVideo();
        List<BitRate> bitRate2 = null;
        if (video != null && (playAddr = video.getPlayAddr()) != null) {
            bitRate = playAddr.getBitRate();
        } else {
            bitRate = null;
        }
        Video video2 = aweme.getVideo();
        if (video2 != null && (h264PlayAddr = video2.getH264PlayAddr()) != null) {
            bitRate2 = h264PlayAddr.getBitRate();
        }
        if (bitRate != null) {
            if (!bitRate.isEmpty()) {
                Iterator<BitRate> it2 = bitRate.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getUrlKey() != null) {
                        if (!bitRate.isEmpty()) {
                            Iterator<BitRate> it3 = bitRate.iterator();
                            while (it3.hasNext()) {
                                if (Intrinsics.LJFF(it3.next().getUrlKey(), str)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        if (bitRate2 != null && !bitRate2.isEmpty()) {
            Iterator<BitRate> it4 = bitRate2.iterator();
            while (it4.hasNext()) {
                if (Intrinsics.LJFF(it4.next().getUrlKey(), str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        Aweme aweme;
        String mixId;
        PaidContentInfo paidContentInfo;
        VideoItemParams item;
        Aweme aweme2;
        SimVideoUrlModel simVideoUrlModelLJFF;
        C718680SHa c718680SHa = (C718680SHa) interfaceC0148002o;
        C0SHS c0shs = this.LL;
        if (c0shs != null) {
            c0shs.LIZIZ();
        }
        if (this.LLILZLL && (item = getItem()) != null && (aweme2 = item.getAweme()) != null && (simVideoUrlModelLJFF = C1483340ohg.LJFF(aweme2)) != null) {
            C1478160oZK.LIZ().LJJJJZ(simVideoUrlModelLJFF);
        }
        this.LLILZLL = false;
        C0SHY c0shy = this.LLILZ;
        if (c0shy != null) {
            C1478160oZK.LIZ().LJIILIIL(c0shy);
        }
        C0SHZ c0shz = this.LLILZIL;
        if (c0shz != null) {
            C1478160oZK.LIZ().LIZIZ(c0shz);
        }
        this.LLILLJJLI = 0;
        this.LLILLL = 0L;
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C0SHS anonymousClass0591 = null;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            if (!aweme.isPaidContent || ((paidContentInfo = aweme.mPaidContentInfo) != null && paidContentInfo.getPaidCollectionId() == 0)) {
                PlayListInfo playListInfo = aweme.playlist_info;
                if (playListInfo != null && (mixId = playListInfo.getMixId()) != null && mixId.length() != 0) {
                    anonymousClass0591 = new AnonymousClass0591(videoItemParams, viewModelScope);
                }
            } else {
                anonymousClass0591 = new C05J3(videoItemParams, viewModelScope);
            }
        }
        this.LL = anonymousClass0591;
        super.paramSync2StateAccept(c718680SHa, videoItemParams);
        return c718680SHa;
    }

    public final void AQ2(Aweme aweme, String str, Function1<? super JSONObject, Unit> function1) throws JSONException {
        boolean z;
        String strValueOf;
        String str2;
        Aweme aweme2;
        PlayListInfo playListInfo;
        String mixId;
        Aweme aweme3;
        PlayListInfo playListInfo2;
        String mixId2;
        VideoItemParams item;
        Aweme aweme4;
        PaidContentInfo paidContentInfo;
        Aweme aweme5;
        PaidContentInfo paidContentInfo2;
        Aweme aweme6;
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("aid", aweme.getAid());
        jSONObject.putOpt("stage", str);
        VideoItemParams item2 = getItem();
        boolean z2 = true;
        if (item2 != null && (aweme6 = item2.getAweme()) != null && aweme6.isPaidContent) {
            z = true;
        } else {
            z = false;
        }
        Long lValueOf = null;
        if (!z || ((item = getItem()) != null && (aweme5 = item.getAweme()) != null && (paidContentInfo2 = aweme5.mPaidContentInfo) != null && paidContentInfo2.getPaidCollectionId() == 0)) {
            VideoItemParams item3 = getItem();
            if (item3 != null && (aweme3 = item3.getAweme()) != null && (playListInfo2 = aweme3.playlist_info) != null && (mixId2 = playListInfo2.getMixId()) != null && mixId2.length() != 0) {
                z2 = false;
            }
            strValueOf = "";
            if (!z2) {
                VideoItemParams item4 = getItem();
                if (item4 != null && (aweme2 = item4.getAweme()) != null && (playListInfo = aweme2.playlist_info) != null && (mixId = playListInfo.getMixId()) != null) {
                    strValueOf = mixId;
                }
                str2 = "playlist";
            } else {
                str2 = "unknown";
            }
        } else {
            VideoItemParams item5 = getItem();
            if (item5 != null && (aweme4 = item5.getAweme()) != null && (paidContentInfo = aweme4.mPaidContentInfo) != null) {
                lValueOf = Long.valueOf(paidContentInfo.getPaidCollectionId());
            }
            strValueOf = String.valueOf(lValueOf);
            str2 = "drama";
        }
        jSONObject.putOpt("video_type", str2);
        jSONObject.putOpt("collection_id", strValueOf);
        if (function1 != null) {
            function1.invoke(jSONObject);
        }
        C20684815ws.LJIJ("mini_drama_preload_event", jSONObject);
    }

    public final void vQ2(Aweme aweme, InterfaceC1475290oUh interfaceC1475290oUh, String str) throws JSONException {
        C1478160oZK.LIZ().LJIILIIL(interfaceC1475290oUh);
        this.LLILZ = null;
        if (Intrinsics.LJFF(str, "preload_error")) {
            if (((Number) C0BNN.LIZ.getValue()).intValue() > 0) {
                this.LLILZLL = false;
            }
            this.LLILLJJLI++;
            this.LLILLL = SystemClock.elapsedRealtime();
        } else {
            this.LLILZLL = true;
            this.LLILLJJLI = 0;
            this.LLILLL = 0L;
        }
        AQ2(aweme, str, null);
    }
}
