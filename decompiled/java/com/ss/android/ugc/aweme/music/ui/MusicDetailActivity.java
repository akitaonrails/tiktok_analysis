package com.ss.android.ugc.aweme.music.ui;

import X.AbstractC1399690mWl;
import X.C0BM3;
import X.C0OGM;
import X.C0QFS;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1203000hPW;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1399330mWB;
import X.C1399650mWh;
import X.C1401320mZO;
import X.C1443560nfW;
import X.C1458960o4M;
import X.C1619690sFb;
import X.C1697810uHb;
import X.C19EH;
import X.C20684815ws;
import X.C2344009Gk;
import X.C297090Bkh;
import X.C299020Bno;
import X.C335910DEv;
import X.C629800On4;
import X.C786410Ut5;
import X.C818480W8w;
import X.EnumC335920DEw;
import X.InterfaceC1399350mWD;
import X.InterfaceC1581830rGX;
import X.InterfaceC1740760vOs;
import X.InterfaceC655270Pn3;
import X.InterfaceC744180THc;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bsj.a5;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.bl.IBenchmarkService;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.LyricStickerStruct;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.music.model.TTToDspLogExtra;
import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.external.OpenPostAlbumParams;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicDetailActivity extends BaseActivity implements InterfaceC655270Pn3, InterfaceC1581830rGX, InterfaceC744180THc, InterfaceC1740760vOs, C0QFS, C0OGM {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5HELIOSOiYwZjAlZwImOywvDSonKSwgCCwnITMlPTY=";
    public String LL;
    public int LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public int LLILZIL;
    public String LLILZLL;
    public String LLIZLLLIL;
    public String LLJ;
    public Music LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public int LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public String LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public C1401320mZO LLJLIL;
    public final List<InterfaceC1399350mWD> LLIZ = new ArrayList();
    public String LLJJJIL = "";
    public final C1399650mWh LLJJL = new AbstractC1399690mWl(this) { // from class: X.0mWh
        {
            super(this);
        }

        @Override // X.InterfaceC1399350mWD
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            C1399710mWn.LIZIZ.LIZ(Integer.valueOf(i), keyEvent, this);
            if (i != 24 && i != 25) {
                return false;
            }
            C1457560o26.LIZIZ(-1, i, "single_song");
            return false;
        }
    };

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b5171";
    }

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        return "single_song";
    }

    @Override // X.C0OGM
    public final int getPageType() {
        return 2;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        long j;
        long j2 = 0;
        try {
            j = CastLongProtector.parseLong(this.LLIZLLLIL);
        } catch (Exception e) {
            e = e;
            j = 0;
        }
        try {
            j2 = CastLongProtector.parseLong(this.LL);
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page_model", "detail");
            String str = this.LLIZLLLIL;
            if (str == null) {
                str = "";
            }
            jSONObject.put("music_id", str);
            String str2 = this.LLILLL;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("single_song_shoot_previous_page", str2);
            String str3 = this.LLJJLIIIJLLLLLLLZ;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("single_song_shoot_previous_enter_method", str3);
            String str4 = this.LLJL;
            jSONObject.put("previous_search_query", str4 != null ? str4 : "");
        } catch (JSONException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("single_song");
        analysis.setExt_value(j);
        analysis.setValue(j2);
        analysis.setExt_json(jSONObject);
        return analysis;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", true);
        super.onResume();
        LIZ(true);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", false);
    }

    public final C1401320mZO LLLLZI() {
        MatchedSoundInfo matchedSongInfo;
        String id = null;
        if (C297090Bkh.LIZ() && this.LLJJIII) {
            return null;
        }
        if (this.LLJLIL == null) {
            C1401320mZO c1401320mZO = new C1401320mZO();
            c1401320mZO.LLILLL = true;
            String str = this.LLIZLLLIL;
            String str2 = c1401320mZO.LLJI;
            Music music = this.LLJI;
            if (music != null && (matchedSongInfo = music.getMatchedSongInfo()) != null) {
                id = matchedSongInfo.getId();
            }
            c1401320mZO.LJIJI(str, str2, id);
            this.LLJLIL = c1401320mZO;
        }
        return this.LLJLIL;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        C1619690sFb.LIZ(this, null);
    }

    public final void init() throws Throwable {
        View viewFindViewById = findViewById(R.id.w0u);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        this.LLJILJIL = LLLLLZL(getIntent(), "partnerName");
        this.LLJILJILJ = LLLLLZL(getIntent(), "partnerMusicId");
        this.LLIZLLLIL = LLLLLZL(getIntent(), FollowStatusChangeMethod.PARAM_UID);
        this.LLJI = (Music) getIntent().getSerializableExtra("enter_music_from_pre_page");
        this.LLJIJIL = LLLLLZL(getIntent(), "process_id");
        this.LL = LLLLLZL(getIntent(), "aweme_id");
        this.LLJJIJIL = LLLLLZL(getIntent(), "tt_template_id");
        this.LLJJJ = LLLLLZL(getIntent(), "tt_template_type");
        this.LLILLL = LLLLLZL(getIntent(), "extra_music_from");
        int intExtra = getIntent().getIntExtra("is_favourite_music", 0);
        String strLLLLLZL = LLLLLZL(getIntent(), "extra_music_from");
        if (strLLLLLZL == null) {
            strLLLLLZL = this.LLILLL;
        }
        this.LLILZ = strLLLLLZL;
        this.LLILLJJLI = Intrinsics.LJFF("search_result", this.LLILLL) ? 2 : getIntent().getIntExtra("extra_enter_from", 0);
        this.LLJJLIIIJLLLLLLLZ = LLLLLZL(getIntent(), "enter_method");
        this.LLJL = LLLLLZL(getIntent(), "previous_search_query");
        this.LLILZIL = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
        this.LLILZLL = LLLLLZL(getIntent(), "previous_page_position");
        String strLLLLLZL2 = LLLLLZL(getIntent(), "sticker_id");
        String strLLLLLZL3 = LLLLLZL(getIntent(), "prop_resource_id");
        String strLLLLLZL4 = LLLLLZL(getIntent(), "prop_list");
        String strLLLLLZL5 = LLLLLZL(getIntent(), "prop_resource_list");
        String strLLLLLZL6 = LLLLLZL(getIntent(), "from_token");
        this.LLJILLL = getIntent().getIntExtra("extra_video_length", 0);
        this.LLJJ = LLLLLZL(getIntent(), "extra_track_info");
        this.LLJJI = LLLLLZL(getIntent(), "music_chart_log_params");
        String strLLLLLZL7 = LLLLLZL(getIntent(), "shoot_enter_from");
        this.LLJJJIL = LLLLLZL(getIntent(), "banner_id");
        this.LLJJJJ = getIntent().getBooleanExtra("enter_record_from_feed", false);
        if (getIntent().getIntExtra("open_edit_sheet", 0) == 1) {
            this.LLJJJJJIL = true;
        }
        this.LLJJJJLIIL = getIntent().getBooleanExtra("save_featured_video_success", false);
        String strLLLLLZL8 = LLLLLZL(getIntent(), "banner_type");
        boolean booleanExtra = getIntent().getBooleanExtra("show_reuse_audio_entrance", false);
        String strLLLLLZL9 = LLLLLZL(getIntent(), "video_id");
        int intExtra2 = getIntent().getIntExtra("is_bundled", 0);
        int intExtra3 = getIntent().getIntExtra("click_reason", 0);
        String strLIZ = C1203000hPW.LIZ(getIntent());
        long longExtra = getIntent().getLongExtra("EXTRA_PRELOAD_PAGE_START_TIME", -1L);
        int intExtra4 = getIntent().getIntExtra("extra_music_begin_time", 0);
        int intExtra5 = getIntent().getIntExtra("extra_music_end_time", 0);
        int intExtra6 = getIntent().getIntExtra("is_feed_pre_download_mdp", 0);
        boolean booleanExtra2 = getIntent().getBooleanExtra("is_photo_mode", false);
        String strLLLLLZL10 = LLLLLZL(getIntent(), "music_cover");
        this.LLJ = LLLLLZL(getIntent(), "group_id");
        String strLLLLLZL11 = LLLLLZL(getIntent(), "is_original_and_added_sound");
        String strLLLLLZL12 = LLLLLZL(getIntent(), "original_sound_volume");
        String strLLLLLZL13 = LLLLLZL(getIntent(), "added_sound_volume");
        String strLLLLLZL14 = LLLLLZL(getIntent(), "music_volume");
        this.LLJJI = LLLLLZL(getIntent(), "music_chart_log_params");
        Serializable serializableExtra = getIntent().getSerializableExtra("tt_to_dsp_log_extra");
        if (!(serializableExtra instanceof TTToDspLogExtra) || serializableExtra == null) {
            serializableExtra = new TTToDspLogExtra();
        }
        int intExtra7 = getIntent().getIntExtra("show_add_to_dsp_button_status", 0);
        Serializable serializableExtra2 = getIntent().getSerializableExtra("music_sticker_struct");
        if (!(serializableExtra2 instanceof MusicStickerStruct)) {
            serializableExtra2 = null;
        }
        Serializable serializableExtra3 = getIntent().getSerializableExtra("music_lyric_sticker_struct");
        if (!(serializableExtra3 instanceof LyricStickerStruct)) {
            serializableExtra3 = null;
        }
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("tts_voice_ids");
        ArrayList<String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("tts_voice_ref_ids");
        ArrayList<String> stringArrayListExtra3 = getIntent().getStringArrayListExtra("vc_voice_ids");
        ArrayList<String> stringArrayListExtra4 = getIntent().getStringArrayListExtra("vc_voice_ref_ids");
        Serializable serializableExtra4 = getIntent().getSerializableExtra("tts_voice_info");
        String strLLLLLZL15 = LLLLLZL(getIntent(), "author_id");
        Serializable serializableExtra5 = getIntent().getSerializableExtra("ai_live_params");
        if (!(serializableExtra5 instanceof OpenPostAlbumParams)) {
            serializableExtra5 = null;
        }
        this.LLJJIII = getIntent().getBooleanExtra("extra_enter_mdp_from_vidoe_music_basic_vm", false);
        this.LLJJIJI = getIntent().getBooleanExtra("used_full_song", false);
        this.LLJJIJIIJIL = Intrinsics.LJFF(LLLLLZL(getIntent(), "is_music_offline_similar_added"), "1");
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL().LIZIZ(LLLLLZL(getIntent(), "aweme_id"));
        String strLLLLLZL16 = LLLLLZL(getIntent(), "log_pb");
        if (strLLLLLZL16 == null) {
            strLLLLLZL16 = "";
        }
        if (TextUtils.isEmpty(this.LLIZLLLIL) && TextUtils.isEmpty(this.LLJILJILJ)) {
            finish();
            return;
        }
        if (TextUtils.isEmpty(this.LLJIJIL)) {
            this.LLJIJIL = "";
        }
        if (TextUtils.equals(this.LLILLL, "choose_music_with_banner")) {
            ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIL(this).nX(this.LLJJJIL, strLLLLLZL8);
        }
        if (Intrinsics.LJFF("collection_music", this.LLILLL)) {
            C1458960o4M.LIZ = true;
        }
        if (C0BM3.LIZ()) {
            LLLLZI();
        }
        if (getIntent().getBooleanExtra("send_enter_mob", false)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LLILLL);
            c2344009Gk.LJIIIIZZ("enter_method", this.LLJJLIIIJLLLLLLLZ);
            c2344009Gk.LJIIIIZZ("music_id", this.LLIZLLLIL);
            c2344009Gk.LJIIIIZZ("process_id", this.LLJIJIL);
            c2344009Gk.LJIIIIZZ("group_id", C1443560nfW.LJIIIIZZ());
            c2344009Gk.LJIIIIZZ("from_group_id", C1443560nfW.LJIIIIZZ());
            C20684815ws.LJIILLIIL("enter_music_detail", c2344009Gk.LIZ);
        }
        Serializable serializableExtra6 = getIntent().getSerializableExtra("music_chart_shoot_params");
        Serializable serializable = serializableExtra6 instanceof HashMap ? serializableExtra6 : null;
        Serializable serializableExtra7 = getIntent().getSerializableExtra("reuse_sound_from");
        String strLLLLLZL17 = LLLLLZL(getIntent(), "promo_id");
        boolean booleanExtra3 = getIntent().getBooleanExtra("open_green_screen_mode", false);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("music_detail_fragment_tag");
        if (fragmentLJJJJZI == null) {
            C629800On4 c629800On4 = MusicDetailFragment.LLJJI;
            String str = this.LLIZLLLIL;
            Music music = this.LLJI;
            String str2 = this.LL;
            String str3 = this.LLILLL;
            String str4 = this.LLJJLIIIJLLLLLLLZ;
            String str5 = this.LLILZ;
            String str6 = this.LLILZLL;
            String str7 = this.LLJILJILJ;
            String str8 = this.LLJILJIL;
            String str9 = this.LLJIJIL;
            int i = this.LLJILLL;
            String str10 = this.LLJJJIL;
            String str11 = this.LLJJ;
            Long lValueOf = Long.valueOf(longExtra);
            int i2 = this.LLILZIL;
            boolean z = this.LLJJJJ;
            boolean z2 = this.LLJJJJJIL;
            boolean z3 = this.LLJJJJLIIL;
            String str12 = this.LLJ;
            int i3 = this.LLILLJJLI;
            boolean z4 = this.LLJJIII;
            String str13 = this.LLJJIJIL;
            String str14 = this.LLJJJ;
            boolean z5 = this.LLJJIJI;
            String str15 = this.LLJJI;
            boolean z6 = this.LLJJIJIIJIL;
            c629800On4.getClass();
            Bundle bundle = new Bundle(3);
            C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, str, bundle);
            C786410Ut5.LJJIZ(bundle, "enter_music_from_pre_page", music);
            C786410Ut5.LJJJI("partnerName", str8, bundle);
            C786410Ut5.LJJJI("partnerMusicId", str7, bundle);
            C786410Ut5.LJJJI("aweme_id", str2, bundle);
            C786410Ut5.LJJJI("sticker_id", strLLLLLZL2, bundle);
            C786410Ut5.LJJJI("prop_list", strLLLLLZL4, bundle);
            C786410Ut5.LJJJI("prop_resource_list", strLLLLLZL5, bundle);
            C786410Ut5.LJJJI("prop_resource_id", strLLLLLZL3, bundle);
            C786410Ut5.LJJJI("extra_music_from", str3, bundle);
            C786410Ut5.LJJJI("enter_method", str4, bundle);
            C786410Ut5.LJJJI("first_enter_from", str5, bundle);
            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
            C786410Ut5.LJJJI("extra_previous_page_position", str6, bundle);
            bundle.putInt("click_reason", intExtra3);
            C786410Ut5.LJJJI("from_token", strLLLLLZL6, bundle);
            C786410Ut5.LJJJI("process_id", str9, bundle);
            bundle.putInt("extra_video_length", i);
            C786410Ut5.LJJJI("extra_track_info", str11, bundle);
            C786410Ut5.LJJJI("music_chart_log_params", str15, bundle);
            C786410Ut5.LJJJI("banner_id", str10, bundle);
            C786410Ut5.LJJJI("video_id", strLLLLLZL9, bundle);
            if (strLIZ != null) {
                C786410Ut5.LJJJI("PRELOAD_TRACE_INFO_LIFECYCLE_KEY", strLIZ, bundle);
            }
            bundle.putLong("EXTRA_PRELOAD_PAGE_START_TIME", lValueOf != null ? lValueOf.longValue() : 0L);
            C786410Ut5.LJJJI("shoot_enter_from", strLLLLLZL7 != null ? strLLLLLZL7 : "", bundle);
            bundle.putInt("is_bundled", intExtra2);
            bundle.putInt("show_reuse_audio_entrance", booleanExtra ? 1 : 0);
            bundle.putInt("extra_music_begin_time", intExtra4);
            bundle.putInt("extra_music_end_time", intExtra5);
            bundle.putInt("is_feed_pre_download_mdp", intExtra6);
            bundle.putBoolean("enter_record_from_feed", z);
            bundle.putBoolean("open_edit_sheet", z2);
            C786410Ut5.LJJIZ(bundle, "reuse_sound_from", serializableExtra7);
            C786410Ut5.LJJJI("is_original_and_added_sound", strLLLLLZL11, bundle);
            C786410Ut5.LJJJI("original_sound_volume", strLLLLLZL12, bundle);
            C786410Ut5.LJJJI("added_sound_volume", strLLLLLZL13, bundle);
            C786410Ut5.LJJIZ(bundle, "music_sticker_struct", serializableExtra2);
            C786410Ut5.LJJJIL(bundle, "tts_voice_ids", stringArrayListExtra);
            C786410Ut5.LJJJIL(bundle, "tts_voice_ref_ids", stringArrayListExtra2);
            C786410Ut5.LJJJIL(bundle, "vc_voice_ids", stringArrayListExtra3);
            C786410Ut5.LJJJIL(bundle, "vc_voice_ref_ids", stringArrayListExtra4);
            C786410Ut5.LJJIZ(bundle, "tts_voice_info", serializableExtra4);
            bundle.putBoolean("save_featured_video_success", z3);
            C786410Ut5.LJJJI("music_cover", strLLLLLZL10, bundle);
            C786410Ut5.LJJJI("from_group_id", str12, bundle);
            bundle.putInt("extra_enter_from", i3);
            C786410Ut5.LJJJI("music_volume", strLLLLLZL14, bundle);
            C786410Ut5.LJJIZ(bundle, "tt_to_dsp_log_extra", serializableExtra);
            bundle.putBoolean("extra_enter_mdp_from_vidoe_music_basic_vm", z4);
            bundle.putBoolean("used_full_song", z5);
            C786410Ut5.LJJJI("log_pb", strLLLLLZL16, bundle);
            C786410Ut5.LJJJI("tt_template_id", str13, bundle);
            C786410Ut5.LJJJI("tt_template_type", str14, bundle);
            C786410Ut5.LJJJI("author_id", strLLLLLZL15, bundle);
            C786410Ut5.LJJIZ(bundle, "music_lyric_sticker_struct", serializableExtra3);
            bundle.putBoolean("is_music_offline_similar_added", z6);
            C786410Ut5.LJJIZ(bundle, "ai_live_params", serializableExtra5);
            C786410Ut5.LJJJI("promo_id", strLLLLLZL17, bundle);
            bundle.putBoolean("is_photo_mode", booleanExtra2);
            bundle.putBoolean("open_green_screen_mode", booleanExtra3);
            bundle.putInt("show_add_to_dsp_button_status", intExtra7);
            C786410Ut5.LJJIZ(bundle, "music_chart_shoot_params", serializable);
            bundle.putInt("is_favourite_music", intExtra);
            fragmentLJJJJZI = new MusicDetailFragment();
            fragmentLJJJJZI.setArguments(bundle);
        }
        fragmentLJJJJZI.setUserVisibleHint(true);
        c19ehLJIIJ.LJIJ(R.id.eqx, fragmentLJJJJZI, "music_detail_fragment_tag");
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        LIZ(false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        boolean zLJI = MethodIDManager.LJI(202559);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onStart", true);
        super.onStart();
        IBenchmarkService iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin = BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false);
        if (iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin != null) {
            iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin.startBenchmark(4);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onStart", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        IBenchmarkService iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin = BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false);
        if (iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin != null) {
            iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin.stopBenchmark();
        }
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onCreate", true);
        C818480W8w.LIZ("single_song");
        activityConfiguration(AFwS259S0000000_21.get$arr$(198));
        super.onCreate(bundle);
        if (a5.LIZ()) {
            getWindow().addFlags(128);
        }
        setContentView(R.layout.dpm);
        init();
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b5171", LLLLLZL(getIntent(), "source_btm_token"));
        C1399330mWB.LIZ.getClass();
        C1399330mWB.LIZIZ = System.currentTimeMillis();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onCreate", false);
    }

    @Override // X.InterfaceC655270Pn3
    public final void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        if (!((ArrayList) this.LLIZ).contains(interfaceC1399350mWD)) {
            ((ArrayList) this.LLIZ).add(interfaceC1399350mWD);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    @Override // X.InterfaceC655270Pn3
    public final void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        List<InterfaceC1399350mWD> list = this.LLIZ;
        if (list != null) {
            ((ArrayList) list).remove(interfaceC1399350mWD);
        }
    }

    public static String LLLLLZL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        Iterator it2 = ((ArrayList) this.LLIZ).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1399350mWD) it2.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        Activity activity;
        Intent intent2;
        super.onActivityResult(i, i2, intent);
        if (i == 10086) {
            int iIntValue = -1;
            if (i2 == -1) {
                C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe9cJbNkicrValdse6ieMsO15cTe5XeF5+lcyQ=", null);
                C0WST c0wst = new C0WST();
                Object[] objArr = {-1, intent};
                C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/music/ui/MusicDetailActivity", "setResult", this, objArr, "void", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(11071, "com/ss/android/ugc/aweme/music/ui/MusicDetailActivity", "setResult", null, objArr, this, c0wzw, false);
                } else {
                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                    if (objArr2 != null) {
                        Object obj = objArr2[0];
                        if (obj != null) {
                            activity = (Activity) obj;
                        } else {
                            activity = this;
                        }
                        Object obj2 = objArr2[1];
                        if (obj2 != null) {
                            iIntValue = ((Integer) obj2).intValue();
                        }
                        Object obj3 = c0wsuLIZIZ.LIZJ[2];
                        if (obj3 != null) {
                            intent2 = (Intent) obj3;
                        } else {
                            intent2 = intent;
                        }
                    } else {
                        activity = this;
                        intent2 = intent;
                    }
                    activity.setResult(iIntValue, intent2);
                    c0wst.LIZ(11071, "com/ss/android/ugc/aweme/music/ui/MusicDetailActivity", "setResult", null, objArr, activity, c0wzw, true);
                }
                finish();
                try {
                    C1389600mGU.LIZIZ(this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                overridePendingTransition(0, 0);
            }
        }
    }
}
