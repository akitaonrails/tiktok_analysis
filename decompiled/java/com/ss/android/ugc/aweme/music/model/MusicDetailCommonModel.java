package com.ss.android.ugc.aweme.music.model;

import X.C636090OxD;
import android.app.Activity;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicDetailCommonModel {
    public static final MusicDetailCommonModel INSTANCE = new MusicDetailCommonModel();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int isFromFollowupSquareOriginalVideoOnMDP(com.ss.android.ugc.aweme.music.model.MusicAwemeList r4) {
        /*
            r3 = this;
            boolean r0 = X.C636090OxD.LIZ()
            r2 = 0
            r1 = 1
            if (r0 == 0) goto Lf
            if (r4 == 0) goto L16
            boolean r0 = r4.containSquareData
            if (r0 != r1) goto L11
            return r1
        Lf:
            if (r4 == 0) goto L16
        L11:
            boolean r0 = r4.wouldContainSquareData
            if (r0 != r1) goto L16
            return r1
        L16:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel.isFromFollowupSquareOriginalVideoOnMDP(com.ss.android.ugc.aweme.music.model.MusicAwemeList):int");
    }

    public final boolean isMDPSquareVideo(Aweme aweme) {
        if (aweme == null || !AwemeExtKt.isMDPSquareType(aweme)) {
            return false;
        }
        return true;
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_music_model_MusicDetailCommonModel_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final String curSquareActionPosition(Aweme aweme, Intent intent) {
        int intExtra;
        if (intent != null) {
            intExtra = intent.getIntExtra("transport_mdp_square_action_position", -1);
        } else {
            intExtra = -1;
        }
        if (intExtra == -1) {
            if (aweme != null && AwemeExtKt.isMDPSquareType(aweme)) {
                return CardStruct.IStatusCode.DEFAULT;
            }
            return "";
        }
        if (intExtra == 0) {
            return "2";
        }
        if (intExtra == 1) {
            return "3";
        }
        if (intExtra != -1) {
            return String.valueOf(intExtra);
        }
        return "";
    }

    public final String curSquareActionPositionOnInnerFeed(Aweme aweme, Intent intent) {
        int intExtra;
        boolean z;
        if (intent != null) {
            intExtra = intent.getIntExtra("transport_mdp_square_action_position", -1);
        } else {
            intExtra = -1;
        }
        if (aweme != null && AwemeExtKt.isMDPSquareType(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (!z && intExtra == 0) {
            return "";
        }
        if (intExtra == 0) {
            return "1";
        }
        if (aweme != null && AwemeExtKt.isMDPSquareType(aweme) && intExtra == -1) {
            return "1";
        }
        if (intExtra == -1) {
            return "";
        }
        return String.valueOf(intExtra);
    }

    public final Map<String, String> getDetailMobMaps(Aweme aweme, Activity activity) {
        Intent intent;
        Intent intent2;
        Music music;
        String str;
        HashMap map = new HashMap();
        Intent intent3 = null;
        if (activity != null) {
            intent = activity.getIntent();
        } else {
            intent = null;
        }
        String strCurSquareActionPositionOnInnerFeed = curSquareActionPositionOnInnerFeed(aweme, intent);
        if (C636090OxD.LIZ()) {
            map.put("followup_square_action_position", strCurSquareActionPositionOnInnerFeed);
            if (aweme != null && (music = aweme.getMusic()) != null) {
                String strCarryMetaSongId = music.carryMetaSongId();
                if (strCarryMetaSongId != null) {
                    map.put("meta_song_id", strCarryMetaSongId);
                }
                if (music != null && (str = music.idStr) != null) {
                    map.put("music_id", str);
                }
            }
        }
        if (activity != null) {
            intent2 = activity.getIntent();
        } else {
            intent2 = null;
        }
        map.put("is_from_followup_square_original_video", String.valueOf(isFromFollowupSquareOriginalVideoInnerFeed(aweme, intent2, false)));
        if (activity != null) {
            intent3 = activity.getIntent();
        }
        map.put("followup_square_recommend_type", squareRecTypeInnerFeed(aweme, intent3));
        map.put("followup_square_recommend_reason", squareRecReasonInnerFeed(aweme, activity));
        return map;
    }

    public final Integer getFollowupSquareVideoRankInShow(Aweme aweme, List<? extends Aweme> list) {
        Integer numValueOf;
        if (list == null || (numValueOf = Integer.valueOf(list.indexOf(aweme))) == null) {
            return null;
        }
        return Integer.valueOf(numValueOf.intValue() + 1);
    }

    public final Integer getRankInSquareInVideoPlay(Aweme aweme, List<? extends Aweme> list) {
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme2 : list) {
            if (AwemeExtKt.isMDPSquareType(aweme2)) {
                arrayList.add(aweme2);
            }
        }
        int iIndexOf = arrayList.indexOf(aweme);
        if (iIndexOf != -1) {
            return Integer.valueOf(iIndexOf + 1);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String squareRecReasonInnerFeed(com.ss.android.ugc.aweme.feed.model.Aweme r7, android.app.Activity r8) {
        /*
            r6 = this;
            java.lang.String r1 = ""
            if (r8 != 0) goto L5
            return r1
        L5:
            com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel r2 = com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel.INSTANCE
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r5 = r2.curSquareActionPositionOnInnerFeed(r7, r0)
            android.content.Intent r2 = r8.getIntent()
            if (r2 == 0) goto L1d
            java.lang.String r0 = "followup_square_rec_reason"
            java.lang.String r4 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_music_model_MusicDetailCommonModel_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(r2, r0)
            if (r4 != 0) goto L1e
        L1d:
            r4 = r1
        L1e:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.music.service.IMusicDetailService> r0 = com.ss.android.ugc.aweme.music.service.IMusicDetailService.class
            java.lang.Object r3 = r2.getService(r0)
            com.ss.android.ugc.aweme.music.service.IMusicDetailService r3 = (com.ss.android.ugc.aweme.music.service.IMusicDetailService) r3
            int r0 = r4.length()
            r2 = 1
            if (r0 != 0) goto L48
            if (r7 == 0) goto L51
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isMDPSquareType(r7)
            if (r0 != r2) goto L4a
            com.ss.android.ugc.aweme.music.model.Music r0 = r7.getMusic()
            kotlin.Pair r0 = r3.LJIIIIZZ(r8, r0)
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L48:
            if (r7 == 0) goto L51
        L4a:
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isMDPSquareType(r7)
            if (r0 != r2) goto L51
        L50:
            return r4
        L51:
            int r0 = r5.length()
            if (r0 != 0) goto L50
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel.squareRecReasonInnerFeed(com.ss.android.ugc.aweme.feed.model.Aweme, android.app.Activity):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String squareRecTypeInnerFeed(com.ss.android.ugc.aweme.feed.model.Aweme r7, android.content.Intent r8) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel r0 = com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel.INSTANCE
            java.lang.String r5 = r0.curSquareActionPositionOnInnerFeed(r7, r8)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.music.service.IMusicDetailService> r0 = com.ss.android.ugc.aweme.music.service.IMusicDetailService.class
            java.lang.Object r4 = r1.getService(r0)
            com.ss.android.ugc.aweme.music.service.IMusicDetailService r4 = (com.ss.android.ugc.aweme.music.service.IMusicDetailService) r4
            java.lang.String r3 = ""
            if (r8 == 0) goto L1e
            java.lang.String r0 = "followup_square_rec_type"
            java.lang.String r2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_music_model_MusicDetailCommonModel_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(r8, r0)
            if (r2 != 0) goto L1f
        L1e:
            r2 = r3
        L1f:
            int r0 = r2.length()
            r1 = 1
            if (r0 != 0) goto L33
            if (r7 == 0) goto L3c
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isMDPSquareType(r7)
            if (r0 != r1) goto L35
            java.lang.String r3 = r4.LJI(r7)
            return r3
        L33:
            if (r7 == 0) goto L3c
        L35:
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isMDPSquareType(r7)
            if (r0 != r1) goto L3c
        L3b:
            return r2
        L3c:
            int r0 = r5.length()
            if (r0 != 0) goto L3b
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel.squareRecTypeInnerFeed(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Intent):java.lang.String");
    }

    public final int isFromFollowupSquareOriginalVideoInnerFeed(Aweme aweme, Intent intent, boolean z) {
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_model_MusicDetailCommonModel_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
        if (intent != null) {
            strINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_model_MusicDetailCommonModel_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_music_model_MusicDetailCommonModel_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "enter_from");
        } else {
            strINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_model_MusicDetailCommonModel_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = null;
        }
        if (C636090OxD.LIZ()) {
            if (intent != null && intent.getBooleanExtra("from_mdp_square", false) && (aweme == null || !AwemeExtKt.isMDPSquareType(aweme))) {
                return 1;
            }
            return 0;
        }
        if (Intrinsics.LJFF("single_song", strINVOKEVIRTUAL_com_ss_android_ugc_aweme_music_model_MusicDetailCommonModel_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra) && intent != null && intent.getBooleanExtra("from_mdp_would_square", false)) {
            return 1;
        }
        return 0;
    }
}
