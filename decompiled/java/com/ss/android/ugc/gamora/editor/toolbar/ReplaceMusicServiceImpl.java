package com.ss.android.ugc.gamora.editor.toolbar;

import X.C01GW;
import X.C05DT;
import X.C05DU;
import X.C098200Yq;
import X.C09AE;
import X.C0CHQ;
import X.C0MWI;
import X.C0PEM;
import X.C10I5;
import X.C10IT;
import X.C1390380mHk;
import X.C1458310o3J;
import X.C15O7;
import X.C189200o6;
import X.C1911640zqU;
import X.C19220410Hi;
import X.C19220510Hj;
import X.C19221210Hq;
import X.C19221310Hr;
import X.C19221610Hu;
import X.C19221910Hx;
import X.C19335310kh;
import X.C19EG;
import X.C1DFH;
import X.C201955140j;
import X.C201962140q;
import X.C20515215Pi;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C452501pT;
import X.EnumC1879180z08;
import X.InterfaceC20660715sz;
import X.InterfaceC2385309Wh;
import Y.ACallableS431S0100000_28;
import Y.ARunnableS128S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.edit.EditMusicStruct;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.ss.android.ugc.aweme.services.edit.MultiMusicEditStruct;
import com.ss.android.ugc.aweme.services.edit.MusicEditScene;
import com.ss.android.ugc.aweme.services.edit.OriginalAudioTrack;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.edit.StripMusicPostType;
import com.ss.android.ugc.aweme.services.edit.StripMusicRequest;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class ReplaceMusicServiceImpl implements IReplaceMusicService {
    public boolean LIZIZ;
    public int LIZLLL;
    public int LJFF;
    public long LJI;
    public C2344009Gk LJIIJ;
    public C10I5 LJIIL;
    public boolean LJIILIIL;
    public C09AE LJIILL;
    public StripMusicPostType LJIILLIIL;
    public StripMusicRequest LJIJ;
    public final C01GW LIZ = C452501pT.LIZIZ(new C19221210Hq());
    public String LIZJ = "";
    public String LJ = "";
    public String LJII = "other";
    public String LJIIIIZZ = "";
    public ReplaceMusicRequest LJIIIZ = new ReplaceMusicRequest();
    public final MutableLiveData<Boolean> LJIIJJI = new MutableLiveData<>(Boolean.FALSE);
    public final C05DU LJIILJJIL = new C05DU(this);
    public StripMusicRequest LJIIZILJ = new StripMusicRequest();
    public final Map<String, Long> LJIJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void dismissCopyrightViolationSnackBar() {
        C201962140q c201962140q = C201962140q.LIZIZ;
        C201955140j.LIZJ(c201962140q, "dismissCopyrightViolationSnackBar");
        C10I5 c10i5 = this.LJIIL;
        if (c10i5 != null && c10i5.LLILZIL != null) {
            C201955140j.LIZJ(c201962140q, "copyrightViolationNotice.dismiss");
            C20515215Pi c20515215Pi = c10i5.LLILZIL;
            if (c20515215Pi == null) {
                c20515215Pi = null;
            }
            c20515215Pi.LIZIZ();
        }
        this.LJIIL = null;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final boolean getClickPost() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final String getCover() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final String getMuteReason() {
        return this.LJII;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final String getReplaceMusicContentType() {
        return this.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final ReplaceMusicRequest getReplaceMusicRequest() {
        return this.LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final StripMusicRequest getReplaceMusicWithStrippedSoundRequest() {
        return this.LJIJ;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final long getReplaceStartTime() {
        return this.LJI;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final int getSimilarTag() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final String getSource() {
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final C2344009Gk getStripMusicPostMobParams() {
        return this.LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final StripMusicRequest getStripMusicRequest() {
        return this.LJIIZILJ;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final StripMusicPostType getStripPostClicked() {
        return this.LJIILLIIL;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final boolean getUploadingStatus() {
        return this.LJIILIIL;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final int isLongVideo() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final C15O7<Integer> replaceDirectInPromoteScene(PromoteReplaceMusicRequest promoteReplaceMusicRequest) {
        return C15O7.LIZJ(new ACallableS431S0100000_28(promoteReplaceMusicRequest, 13)).LJI(new C19335310kh(promoteReplaceMusicRequest, 4));
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void retryInPromoteScene(PromoteReplaceMusicRequest promoteReplaceMusicRequest) {
        if (promoteReplaceMusicRequest.getRetryScene() == EnumC1879180z08.CLEAR.getId()) {
            C15O7.LIZJ(new ACallableS431S0100000_28(promoteReplaceMusicRequest, 14));
        }
        C15O7.LIZJ(new ACallableS431S0100000_28(promoteReplaceMusicRequest, 15)).LIZLLL(new C19335310kh(promoteReplaceMusicRequest, 5));
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setClickPost(boolean z) {
        this.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setCover(String str) {
        this.LIZJ = str;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setLongVideo(int i) {
        this.LJFF = i;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setMuteReason(String str) {
        this.LJII = str;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setReplaceMusicContentType(String str) {
        this.LJIIIIZZ = str;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setReplaceMusicRequest(ReplaceMusicRequest replaceMusicRequest) {
        this.LJIIIZ = replaceMusicRequest;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setReplaceMusicWithStrippedSoundRequest(StripMusicRequest stripMusicRequest) {
        this.LJIJ = stripMusicRequest;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setReplaceStartTime(long j) {
        this.LJI = j;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setSimilarTag(int i) {
        this.LIZLLL = i;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setSource(String str) {
        this.LJ = str;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setStripMusicPostMobParams(C2344009Gk c2344009Gk) {
        this.LJIIJ = c2344009Gk;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setStripMusicRequest(StripMusicRequest stripMusicRequest) {
        this.LJIIZILJ = stripMusicRequest;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setStripPostClicked(StripMusicPostType stripMusicPostType) {
        this.LJIILLIIL = stripMusicPostType;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setUploadingStatus(boolean z) {
        C09AE c09ae = this.LJIILL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LJIILIIL = z;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJIILL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C05DT(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final boolean shouldShowCopyrightViolationSnackBar(Aweme aweme) {
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus;
        String aid;
        String idStr;
        long createTime;
        Music music;
        Music music2;
        AwemeStatus statusSafety;
        boolean z = false;
        if (!C10IT.LJI(aweme)) {
            return false;
        }
        if (aweme == null || (statusSafety = AwemeExtKt.getStatusSafety(aweme)) == null || (mappedMuteStripStatus = statusSafety.getMappedMuteStripStatus()) == null) {
            mappedMuteStripStatus = AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_DISABLE;
        }
        C10IT.LIZ.getClass();
        if (!C10IT.LJIIJ(aweme) && mappedMuteStripStatus != AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_DISABLE && mappedMuteStripStatus != AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_UNKNOWN) {
            return false;
        }
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldShowCopyrightViolationSnackBar-->aid:");
        String musicName = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" music_id:");
        if (aweme != null && (music2 = aweme.getMusic()) != null) {
            idStr = music2.getIdStr();
        } else {
            idStr = null;
        }
        sbLIZ.append(idStr);
        sbLIZ.append(" music_name:");
        if (aweme != null && (music = aweme.getMusic()) != null) {
            musicName = music.getMusicName();
        }
        sbLIZ.append(musicName);
        C201955140j.LIZJ(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        C01GW c01gw = C19221310Hr.LIZ;
        if (jCurrentTimeMillis - ((Keva) c01gw.getValue()).getLong("snack_bar_showed_time", 0L) < 604800000) {
            C201955140j.LIZJ(c201962140q, "won't show snackbar because appearance time interval doesn't expire");
        }
        if (aweme != null) {
            createTime = aweme.getCreateTime();
        } else {
            createTime = Long.MAX_VALUE;
        }
        if (createTime <= ((Keva) c01gw.getValue()).getLong("last_violation_video_showed_time", 0L)) {
            C201955140j.LIZJ(c201962140q, "won't show snackbar because this aweme creation time is older");
        }
        if (aweme != null && System.currentTimeMillis() - ((Keva) c01gw.getValue()).getLong("snack_bar_showed_time", 0L) >= 604800000 && aweme.getCreateTime() > ((Keva) c01gw.getValue()).getLong("last_violation_video_showed_time", 0L)) {
            z = true;
        }
        this.LJIIJJI.setValue(Boolean.TRUE);
        return z;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void doReeditRequestV2(Context context, StripMusicRequest stripMusicRequest) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C19220410Hi(stripMusicRequest, context, this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void showMusicStripResult(boolean z, JSONObject jSONObject) {
        Object c098200Yq;
        if (z) {
            showMusicStripResult(true, null, false);
            return;
        }
        Gson gson = C0CHQ.LIZ().getGson();
        try {
            StripMusicRequest stripMusicRequest = new StripMusicRequest();
            stripMusicRequest.setItemID(JSONObjectProtectorUtils.getString(jSONObject, "item_id"));
            stripMusicRequest.setOriginalVid(JSONObjectProtectorUtils.getString(jSONObject, "prev_video_id"));
            stripMusicRequest.setOriginalAudioTrack((OriginalAudioTrack) gson.LJII(JSONObjectProtectorUtils.getString(jSONObject, "original_audio_edit_info"), OriginalAudioTrack.class));
            stripMusicRequest.setMultiMusicEditInfo((MultiMusicEditStruct) gson.LJII(JSONObjectProtectorUtils.getString(jSONObject, "multi_music_edit_info"), MultiMusicEditStruct.class));
            stripMusicRequest.setMusicEditScene(Integer.valueOf(MusicEditScene.MUSIC_EDIT_SCENE_VIDEO_GENERAL.getValue()));
            stripMusicRequest.setExtra(JSONObjectProtectorUtils.getString(jSONObject, "biz_extra_str"));
            showMusicStripResult(false, stripMusicRequest, false);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C201962140q c201962140q = C201962140q.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("strip music req err: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C201955140j.LJIIIIZZ(c201962140q, "COPYRIGHT_VIOLATION", C2188811AlT.LIZIZ(sbLIZ));
        }
        C189200o6.m1boximpl(c098200Yq);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void showWindow(JSONObject jSONObject, boolean z) {
        String itemID;
        String musicID;
        int i;
        EditMusicStruct editMusicStruct;
        try {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "item_id");
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "original_vid");
            String string3 = JSONObjectProtectorUtils.getString(jSONObject, "cover_url");
            EditMusicStruct editMusicStruct2 = (EditMusicStruct) C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson().LJII(JSONObjectProtectorUtils.getString(jSONObject, "new_music_info"), EditMusicStruct.class);
            ReplaceMusicRequest replaceMusicRequest = new ReplaceMusicRequest();
            replaceMusicRequest.setEditMusicStruct(editMusicStruct2);
            replaceMusicRequest.setItemID(string);
            replaceMusicRequest.setOriginalVid(string2);
            C2344009Gk c2344009Gk = new C2344009Gk();
            ((IPromoteReplaceMusicService) ServiceManager.get().getService(IPromoteReplaceMusicService.class)).LIZ();
            if (C1911640zqU.LJ(string)) {
                C1911640zqU.LJIIIIZZ(z);
                c2344009Gk.LJFF("enter_from", "promote");
            } else {
                showWindow(z, string3, replaceMusicRequest);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("long link response ");
            sbLIZ.append(jSONObject);
            C201955140j.LIZIZ("ReplaceMusicToolbarScene", C2188811AlT.LIZIZ(sbLIZ));
            ReplaceMusicRequest replaceMusicRequest2 = this.LJIIIZ;
            String musicId = null;
            if (replaceMusicRequest2 != null) {
                itemID = replaceMusicRequest2.getItemID();
            } else {
                itemID = null;
            }
            c2344009Gk.LJFF("group_id", itemID);
            ReplaceMusicRequest replaceMusicRequest3 = this.LJIIIZ;
            if (replaceMusicRequest3 != null && (editMusicStruct = replaceMusicRequest3.getEditMusicStruct()) != null) {
                musicID = editMusicStruct.getMusicID();
            } else {
                musicID = null;
            }
            c2344009Gk.LJFF("replace_music_id", musicID);
            ReplaceMusicRequest replaceMusicRequest4 = this.LJIIIZ;
            if (replaceMusicRequest4 != null) {
                musicId = replaceMusicRequest4.getMusicId();
            }
            c2344009Gk.LJFF("music_id", musicId);
            if (this.LJIIIZ.getVoiceVolume() != null) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "has_original_sound");
            c2344009Gk.LJFF("enter_from", "personal_homepage");
            c2344009Gk.LJFF("replace_music_content_type", ((IReplaceMusicService) ServiceManager.get().getService(IReplaceMusicService.class)).getReplaceMusicContentType());
            c2344009Gk.LIZJ(z ? 1 : 0, "replace_status");
            c2344009Gk.LJFF("creation_id", this.LJIIIZ.getCreationId());
            c2344009Gk.LIZJ(((IReplaceMusicService) ServiceManager.get().getService(IReplaceMusicService.class)).getSimilarTag(), "is_similar_music");
            c2344009Gk.LIZJ(((IReplaceMusicService) ServiceManager.get().getService(IReplaceMusicService.class)).isLongVideo(), "is_long_video");
            c2344009Gk.LJFF("mute_reason", ((IReplaceMusicService) ServiceManager.get().getService(IReplaceMusicService.class)).getMuteReason());
            c2344009Gk.LIZLLL(System.currentTimeMillis() - ((IReplaceMusicService) ServiceManager.get().getService(IReplaceMusicService.class)).getReplaceStartTime(), "replace_time");
            c2344009Gk.LJFF("is_replace_music", "false");
            c2344009Gk.LIZJ(0, "is_remove_music");
            c2344009Gk.LJFF("source", ((IReplaceMusicService) ServiceManager.get().getService(IReplaceMusicService.class)).getSource());
            C20684815ws.LJIILLIIL("publish_replace_music_status", c2344009Gk.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void doReeditRequest(Context context, StripMusicRequest stripMusicRequest, boolean z) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C19220510Hj(stripMusicRequest, z, context, this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void doRequest(final String str, final ReplaceMusicRequest replaceMusicRequest, final C19EG c19eg) {
        C15O7.LIZJ(new ACallableS431S0100000_28(replaceMusicRequest, 11)).LJ(new InterfaceC2385309Wh() { // from class: X.0zqp
            /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
            @Override // X.InterfaceC2385309Wh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object then(X.C15O7 r8) {
                /*
                    r7 = this;
                    java.lang.String r6 = "ReplaceMusicServiceImpl@cb3a.doRequest$2"
                    X.C1C7U.LIZ(r6)
                    boolean r0 = r8.LJIILL()
                    r4 = 0
                    if (r0 != 0) goto L12
                    boolean r0 = r8.LJIILIIL()
                    if (r0 == 0) goto L69
                L12:
                    java.lang.Exception r1 = r8.LJIIJJI()
                    boolean r0 = r1 instanceof X.C0XIR
                    if (r0 == 0) goto Lb4
                    X.093u r1 = (X.C23112093u) r1
                L1c:
                    r5 = 0
                    if (r1 == 0) goto Lb1
                    int r1 = r1.getErrorCode()
                    r0 = 3013002(0x2df98a, float:4.222115E-39)
                    if (r1 != r0) goto Lb1
                    r0 = 1
                L29:
                    java.lang.String r3 = "ReplaceMusicToolbarScene"
                    if (r0 == 0) goto L88
                    java.lang.Exception r1 = r8.LJIIJJI()
                    boolean r0 = r1 instanceof X.C0XIR
                    if (r0 == 0) goto L86
                    X.0XIR r1 = (X.C0XIR) r1
                    if (r1 == 0) goto L86
                    java.lang.String r0 = r1.getErrorMsg()
                L3d:
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L88
                    com.ss.android.ugc.aweme.shortvideo.SafeHandler r5 = new com.ss.android.ugc.aweme.shortvideo.SafeHandler
                    com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl r0 = r7.LIZ
                    X.01GW r0 = r0.LIZ
                    java.lang.Object r1 = r0.getValue()
                    X.0MWI r1 = (X.C0MWI) r1
                    X.19EG r0 = r2
                    androidx.lifecycle.LifecycleOwner r0 = r1.LJIIIIZZ(r0)
                    r5.<init>(r0)
                    Y.ARunnableS72S0200000_3 r2 = new Y.ARunnableS72S0200000_3
                    X.19EG r1 = r2
                    r0 = 17
                    r2.<init>(r8, r1, r0)
                    r5.post(r2)
                    java.lang.String r0 = "error code 3013002"
                    X.C201955140j.LIZIZ(r3, r0)
                L69:
                    com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest r0 = r4
                    boolean r0 = r0.isApplyStripResult()
                    if (r0 == 0) goto L80
                    X.03Hh r3 = X.C817503Hh.LL
                    X.1DFB r2 = X.C0PEM.LIZJ
                    X.10GP r1 = new X.10GP
                    com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest r0 = r4
                    r1.<init>(r0, r8, r4)
                    r0 = 2
                    X.C23250099c.LIZLLL(r3, r2, r4, r1, r0)
                L80:
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    X.C1C7U.LIZIZ(r6)
                    return r0
                L86:
                    r0 = r4
                    goto L3d
                L88:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "first network error "
                    r1.append(r0)
                    java.lang.Exception r0 = r8.LJIIJJI()
                    if (r0 == 0) goto Laf
                    java.lang.String r0 = r0.toString()
                L9b:
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C201955140j.LIZIZ(r3, r0)
                    com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl r2 = r7.LIZ
                    java.lang.String r1 = r3
                    com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest r0 = r4
                    r2.showWindow(r5, r1, r0)
                    goto L69
                Laf:
                    r0 = r4
                    goto L9b
                Lb1:
                    r0 = 0
                    goto L29
                Lb4:
                    r1 = r4
                    goto L1c
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1911850zqp.then(X.15O7):java.lang.Object");
            }
        }, C15O7.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void showCopyrightViolationSnackBar(ViewGroup viewGroup, InterfaceC20660715sz interfaceC20660715sz, Aweme aweme) {
        String idStr;
        if (aweme == null) {
            return;
        }
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showCopyrightViolationSnackBar-->aid:");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(" music_id:");
        Music music = aweme.getMusic();
        String musicName = null;
        if (music != null) {
            idStr = music.getIdStr();
        } else {
            idStr = null;
        }
        sbLIZ.append(idStr);
        sbLIZ.append(" music_name:");
        Music music2 = aweme.getMusic();
        if (music2 != null) {
            musicName = music2.getMusicName();
        }
        sbLIZ.append(musicName);
        C201955140j.LIZJ(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        C10I5 c10i5 = new C10I5(viewGroup, interfaceC20660715sz, aweme, this.LJIIJJI, false, 16);
        this.LJIIL = c10i5;
        PopupManager.LJIJI(c10i5, true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C01GW c01gw = C19221310Hr.LIZ;
        ((Keva) c01gw.getValue()).storeLong("snack_bar_showed_time", jCurrentTimeMillis);
        ((Keva) c01gw.getValue()).storeLong("last_violation_video_showed_time", aweme.getCreateTime());
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void showMusicStripResult(boolean z, StripMusicRequest stripMusicRequest, boolean z2) {
        C19EG c19eg;
        C2344009Gk c2344009Gk;
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService().getClass();
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null && (activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null) {
            if (!z) {
                if (stripMusicRequest != null) {
                    new C19221610Hu(c19eg, false, "", null, stripMusicRequest).show();
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131826881);
                creativeToastBuilder.icon(R.raw.icon_tick_circle_fill);
                creativeToastBuilder.iconColorRes(R.attr.a1h);
                creativeToastBuilder.isTuxToast(true);
                C1390380mHk.LIZ(c19eg, 3035, creativeToastBuilder);
                ((C19221910Hx) ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService()).LJII(c19eg);
            }
            IReplaceMusicService iReplaceMusicService = (IReplaceMusicService) PluggableExtentionKt.pluggableSpi$default(IReplaceMusicService.class, false, false, false, 14, null);
            if (iReplaceMusicService != null && (c2344009Gk = this.LJIIJ) != null) {
                c2344009Gk.LIZJ(z ? 1 : 0, "is_publish_success");
                c2344009Gk.LJIIIIZZ("replace_music_content_type", "video");
                c2344009Gk.LIZLLL(System.currentTimeMillis() - iReplaceMusicService.getReplaceStartTime(), "replace_time");
                c2344009Gk.LIZJ(z ? 1 : 0, "replace_status");
                C20684815ws.LJIILLIIL("publish_replace_music_status", c2344009Gk.LIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void showWindow(final boolean z, final String str, final ReplaceMusicRequest replaceMusicRequest) {
        final C19EG c19eg;
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService().getClass();
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null && (activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null) {
            final LifecycleOwner lifecycleOwnerLJIIIIZZ = ((C0MWI) this.LIZ.getValue()).LJIIIIZZ(c19eg);
            new SafeHandler(lifecycleOwnerLJIIIIZZ).post(new Runnable() { // from class: X.0ztV
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0, types: [T, X.10Hu] */
                /* JADX WARN: Type inference failed for: r3v2, types: [T, X.10Hu] */
                public final void LIZ() {
                    if (c19eg.isFinishing()) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("showWindow: ");
                    sbLIZ.append(z);
                    sbLIZ.append(' ');
                    C201955140j.LIZIZ("ReplaceMusicToolbarScene", C2188811AlT.LIZIZ(sbLIZ));
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = new C19221610Hu(c19eg, true, str, null, null);
                    if (!z) {
                        if (replaceMusicRequest == null) {
                            return;
                        } else {
                            c259800zU.element = new C19221610Hu(c19eg, false, str, replaceMusicRequest, null);
                        }
                    }
                    if (z) {
                        new SafeHandler(lifecycleOwnerLJIIIIZZ).postDelayed(new ARunnableS128S0100000_28(c259800zU, 55), 4000L);
                    }
                    ((C19221610Hu) c259800zU.element).show();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ReplaceMusicServiceImpl@cb3a.showWindow$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.showWindow$1");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void doRequest(final String str, final ReplaceMusicRequest replaceMusicRequest, final C19EG c19eg, final PromoteReplaceMusicRequest promoteReplaceMusicRequest) {
        C15O7.LIZJ(new ACallableS431S0100000_28(promoteReplaceMusicRequest, 12)).LJ(new InterfaceC2385309Wh() { // from class: X.0zqo
            /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
            @Override // X.InterfaceC2385309Wh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object then(X.C15O7<com.ss.android.ugc.aweme.music.model.MusicEditResponse> r8) {
                /*
                    r7 = this;
                    java.lang.String r6 = "ReplaceMusicServiceImpl@cb3a.doRequest$4"
                    X.C1C7U.LIZ(r6)
                    boolean r0 = r8.LJIILL()
                    r5 = 1
                    if (r0 != 0) goto L3e
                    boolean r0 = r8.LJIILIIL()
                    if (r0 != 0) goto L3e
                    com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                    java.lang.Class<com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService> r0 = com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService.class
                    java.lang.Object r0 = r1.getService(r0)
                    com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService r0 = (com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService) r0
                    X.0zqU r0 = r0.LIZ()
                    r0.getClass()
                    X.C1911640zqU.LJI = r5
                    com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest r1 = r5
                    X.0z08 r0 = X.EnumC1879180z08.NOT_RETRY
                    int r0 = r0.getId()
                    r1.setRetryScene(r0)
                    com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest r1 = r5
                    X.19EG r0 = r2
                    X.15O7 r0 = X.C1911640zqU.LJIIIZ(r1, r0)
                L3a:
                    X.C1C7U.LIZIZ(r6)
                    return r0
                L3e:
                    java.lang.Exception r1 = r8.LJIIJJI()
                    boolean r0 = r1 instanceof X.C0XIR
                    r2 = 0
                    if (r0 == 0) goto Lc3
                    X.093u r1 = (X.C23112093u) r1
                L49:
                    r4 = 0
                    if (r1 == 0) goto Lc1
                    int r1 = r1.getErrorCode()
                    r0 = 3013002(0x2df98a, float:4.222115E-39)
                    if (r1 != r0) goto Lc1
                L55:
                    java.lang.String r3 = "ReplaceMusicToolbarScene"
                    if (r5 == 0) goto L9a
                    java.lang.Exception r1 = r8.LJIIJJI()
                    boolean r0 = r1 instanceof X.C0XIR
                    if (r0 == 0) goto L98
                    X.0XIR r1 = (X.C0XIR) r1
                    if (r1 == 0) goto L98
                    java.lang.String r0 = r1.getErrorMsg()
                L69:
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L9a
                    com.ss.android.ugc.aweme.shortvideo.SafeHandler r4 = new com.ss.android.ugc.aweme.shortvideo.SafeHandler
                    com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl r0 = r7.LIZ
                    X.01GW r0 = r0.LIZ
                    java.lang.Object r1 = r0.getValue()
                    X.0MWI r1 = (X.C0MWI) r1
                    X.19EG r0 = r2
                    androidx.lifecycle.LifecycleOwner r0 = r1.LJIIIIZZ(r0)
                    r4.<init>(r0)
                    Y.ARunnableS72S0200000_3 r2 = new Y.ARunnableS72S0200000_3
                    X.19EG r1 = r2
                    r0 = 16
                    r2.<init>(r8, r1, r0)
                    r4.post(r2)
                    java.lang.String r0 = "error code 3013002"
                    X.C201955140j.LIZIZ(r3, r0)
                L95:
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    goto L3a
                L98:
                    r0 = r2
                    goto L69
                L9a:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "first network error "
                    r1.append(r0)
                    java.lang.Exception r0 = r8.LJIIJJI()
                    if (r0 == 0) goto Lad
                    java.lang.String r2 = r0.toString()
                Lad:
                    r1.append(r2)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C201955140j.LIZIZ(r3, r0)
                    com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl r2 = r7.LIZ
                    java.lang.String r1 = r3
                    com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest r0 = r4
                    r2.showWindow(r4, r1, r0)
                    goto L95
                Lc1:
                    r5 = 0
                    goto L55
                Lc3:
                    r1 = r2
                    goto L49
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1911840zqo.then(X.15O7):java.lang.Object");
            }
        }, C15O7.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void mobProfileTabClientClick(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        C1458310o3J.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(i, "is_replace_music");
        c2344009Gk.LIZJ(i2, "is_mute_icon");
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LJIIIIZZ("music_id", str3);
        c2344009Gk.LJIIIIZZ("replace_music_content_type", str4);
        c2344009Gk.LJIIIIZZ("mute_reason", str5);
        C20684815ws.LJIILLIIL("profile_tab_music_mute_click", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void mobProfileTabClientShow(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = (Long) ((LinkedHashMap) this.LJIJI).get(str2);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jCurrentTimeMillis - jLongValue > 2500) {
            C1458310o3J.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LIZJ(i, "is_replace_music");
            c2344009Gk.LIZJ(i2, "is_mute_icon");
            c2344009Gk.LJIIIIZZ("group_id", str2);
            c2344009Gk.LJIIIIZZ("music_id", str3);
            c2344009Gk.LJIIIIZZ("replace_music_content_type", str4);
            c2344009Gk.LJIIIIZZ("mute_reason", str5);
            c2344009Gk.LJIIIIZZ("mute_follow_up_status", str6);
            C20684815ws.LJIILLIIL("profile_tab_music_mute_show", c2344009Gk.LIZ);
            this.LJIJI.put(str2, Long.valueOf(System.currentTimeMillis()));
        }
    }
}
