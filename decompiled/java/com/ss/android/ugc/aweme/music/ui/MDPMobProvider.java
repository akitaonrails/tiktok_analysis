package com.ss.android.ugc.aweme.music.ui;

import X.C123100dR;
import X.C1398280mUU;
import X.C2344009Gk;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class MDPMobProvider implements IMDPMobAbility {
    public final Bundle LL;
    public final Intent LLILLJJLI;
    public final Lifecycle LLILLL;
    public final Map<String, String> LLILZ = new LinkedHashMap();
    public MusicDetail LLILZIL;

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final String rd0() {
        return "click_music_publish";
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final String C2() {
        String string;
        Bundle bundle = this.LL;
        return (bundle == null || (string = bundle.getString("aweme_id")) == null) ? "" : string;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final String KZ1() {
        String string;
        Bundle bundle = this.LL;
        return (bundle == null || (string = bundle.getString(FollowStatusChangeMethod.PARAM_UID)) == null) ? "" : string;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final String LJJLIIIJJI() {
        String string;
        Bundle bundle = this.LL;
        return (bundle == null || (string = bundle.getString("extra_music_from")) == null) ? "" : string;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final String LLIIJI() {
        String strLIZ;
        Intent intent = this.LLILLJJLI;
        return (intent == null || (strLIZ = LIZ(intent, "enter_method")) == null) ? "" : strLIZ;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final int do2() {
        Bundle bundle = this.LL;
        if (bundle != null) {
            return bundle.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final String il1() {
        String strLIZ;
        Intent intent = this.LLILLJJLI;
        return (intent == null || (strLIZ = LIZ(intent, "group_id")) == null) ? "" : strLIZ;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final String lG0() {
        String strLIZ;
        Intent intent = this.LLILLJJLI;
        return (intent == null || (strLIZ = LIZ(intent, "process_id")) == null) ? "" : strLIZ;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final String lJ2() {
        String string;
        Bundle bundle = this.LL;
        if (bundle == null || (string = bundle.getString("extra_track_info")) == null) {
            string = "";
        }
        String string2 = null;
        if (!TextUtils.isEmpty(string)) {
            try {
                string2 = JSONObjectProtectorUtils.getString(new JSONObject(string), "shoot_from");
                return string2;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return string2;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final int nH1() {
        Intent intent = this.LLILLJJLI;
        if (intent != null) {
            return intent.getIntExtra("transport_mdp_square_action_position", -1);
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final TtsVoiceInfo zQ0() {
        Bundle bundle = this.LL;
        Serializable serializable = bundle != null ? bundle.getSerializable("tts_voice_info") : null;
        if (serializable instanceof TtsVoiceInfo) {
            return (TtsVoiceInfo) serializable;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final Lifecycle dy() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final MusicDetail ep0() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final boolean G92(String str) {
        if (((LinkedHashMap) this.LLILZ).get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final String V72(Aweme aweme) {
        return MusicDetailCommonModel.curSquareActionPosition(aweme, this.LLILLJJLI);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final void jo(MusicDetail musicDetail) {
        this.LLILZIL = musicDetail;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final String yq0(Aweme aweme) {
        String strLIZ;
        Intent intent = this.LLILLJJLI;
        if (intent == null || (strLIZ = LIZ(intent, "followup_square_rec_type")) == null || strLIZ.length() == 0) {
            String strLJI = C1398280mUU.LJI(aweme);
            if (strLJI == null) {
                return "";
            }
            return strLJI;
        }
        return strLIZ;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final void zb1(String str) {
        this.LLILZ.put(str, str);
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final String TW0(Context context, Aweme aweme) {
        String strLIZ;
        Intent intent = this.LLILLJJLI;
        Music music = null;
        if (intent != null) {
            strLIZ = LIZ(intent, "followup_square_rec_reason");
        } else {
            strLIZ = null;
        }
        if (strLIZ == null || strLIZ.length() == 0) {
            if (aweme != null && AwemeExtKt.isMDPSquareType(aweme)) {
                if (aweme != null) {
                    music = aweme.getMusic();
                }
                strLIZ = (String) C1398280mUU.LJFF(context, music).getFirst();
            }
            if (strLIZ == null) {
                return "";
            }
            return strLIZ;
        }
        return strLIZ;
    }

    public MDPMobProvider(Bundle bundle, Intent intent, Lifecycle lifecycle) {
        this.LL = bundle;
        this.LLILLJJLI = intent;
        this.LLILLL = lifecycle;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.IMDPMobAbility
    public final void Wv0(Context context, C2344009Gk c2344009Gk, Aweme aweme, MusicAwemeList musicAwemeList) {
        String strLIZ;
        String aid;
        boolean z;
        String str;
        Integer numValueOf;
        String strV72 = V72(aweme);
        c2344009Gk.LJFF("followup_square_action_position", strV72);
        c2344009Gk.LIZJ(MusicDetailCommonModel.INSTANCE.isFromFollowupSquareOriginalVideoOnMDP(musicAwemeList), "is_from_followup_square_original_video");
        c2344009Gk.LJFF("followup_square_recommend_type", yq0(aweme));
        c2344009Gk.LJFF("followup_square_recommend_reason", TW0(context, aweme));
        Intent intent = this.LLILLJJLI;
        String aid2 = null;
        if (intent != null) {
            strLIZ = LIZ(intent, "aweme_id");
        } else {
            strLIZ = null;
        }
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (aid != null && aid.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            c2344009Gk.LJFF("last_group_id", strLIZ);
        } else {
            if (aweme != null) {
                aid2 = aweme.getAid();
            }
            c2344009Gk.LJFF("last_group_id", aid2);
        }
        String str2 = "followup_square";
        if (C123100dR.LIZ(strV72)) {
            str = "followup_square";
        } else {
            str = "single_song";
        }
        c2344009Gk.LJFF("shoot_way", str);
        if (!C123100dR.LIZ(strV72)) {
            str2 = "single_song";
        }
        c2344009Gk.LJFF("music_selected_from", str2);
        Intent intent2 = this.LLILLJJLI;
        if (intent2 != null && (numValueOf = Integer.valueOf(intent2.getIntExtra("followup_square_video_rank", -1))) != null && numValueOf.intValue() != -1) {
            c2344009Gk.LIZJ(numValueOf.intValue(), "followup_square_video_rank");
        }
    }
}
