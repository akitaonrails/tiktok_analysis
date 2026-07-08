package com.ss.android.ugc.aweme.commerce.tools.mission.service;

import X.C098200Yq;
import X.C0CHQ;
import X.C0LAB;
import X.C11BY;
import X.C11BZ;
import X.C1324750kZt;
import X.C1390380mHk;
import X.C1406830miH;
import X.C1638580sk4;
import X.C189200o6;
import X.C19458911Bb;
import X.C19EG;
import X.C1DRG;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC19458811Ba;
import X.EnumC588360N5u;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.s;
import com.ss.android.ugc.aweme.IDuetDownloadService;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionDuetRouterConfig;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionImageSticker;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionUser;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.text.a0;
import lth.o;

/* JADX INFO: loaded from: classes30.dex */
public final class CommerceToolsMissionService implements ICommerceToolsMissionService {
    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LIZLLL(Intent intent) {
        C19458911Bb.LIZ.getClass();
        if (!C19458911Bb.LIZJ(intent)) {
            return;
        }
        new C11BY().LJIIJ(C19458911Bb.LIZIZ(intent), EnumC588360N5u.SOUND_NOT_AVAILABLE);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LJ(Intent intent) {
        C19458911Bb.LIZ.getClass();
        if (!C19458911Bb.LIZJ(intent)) {
            return;
        }
        new C11BY().LJIIJ(C19458911Bb.LIZIZ(intent), EnumC588360N5u.EFFECT_NOT_AVAILABLE);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final C1638580sk4 LJFF(C1DRG c1drg) {
        return new C1638580sk4(c1drg);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final boolean LJI(String str) {
        Object c098200Yq;
        Object c098200Yq2;
        C19458911Bb.LIZ.getClass();
        if (str != null) {
            try {
                c098200Yq = UriProtector.parse(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Object obj = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Uri uri = (Uri) c098200Yq;
            if (uri != null && C19458911Bb.LIZLLL(uri)) {
                try {
                    c098200Yq2 = (Mission) ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson().LJII(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "mission_data"), Mission.class);
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                    obj = c098200Yq2;
                }
                Mission mission = (Mission) obj;
                if (mission != null) {
                    return mission.isDuet();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final boolean LJIIL(Intent intent) {
        Object c098200Yq;
        C19458911Bb.LIZ.getClass();
        if (intent == null) {
            return false;
        }
        try {
            c098200Yq = (Mission) ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson().LJII(C19458911Bb.LIZ(intent, "mission_data"), Mission.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Mission mission = (Mission) c098200Yq;
        if (mission == null) {
            return false;
        }
        return mission.isDuet();
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LIZIZ(ShortVideoContext shortVideoContext, C19EG c19eg) {
        CreativeModel creativeModel;
        CommerceToolsModel commerceToolsModel;
        Mission mission;
        String stickerId;
        Long lValueOf;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (commerceToolsModel = creativeModel.commerceModel) != null && (mission = commerceToolsModel.getMission()) != null) {
            String musicId = mission.getMusicId();
            if ((musicId == null || musicId.length() == 0) && ((stickerId = mission.getStickerId()) == null || stickerId.length() == 0)) {
                return;
            }
            String stickerId2 = mission.getStickerId();
            if (stickerId2 != null && stickerId2.length() != 0 && mission.getUserEverChoseDifferentSticker()) {
                return;
            }
            String musicId2 = mission.getMusicId();
            if (musicId2 != null && musicId2.length() != 0 && mission.isMusicToasted()) {
                return;
            }
            if (!mission.isMusicToasted()) {
                String musicId3 = mission.getMusicId();
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
                if (aVMusicExtractAVMusic != null) {
                    lValueOf = Long.valueOf(aVMusicExtractAVMusic.id);
                } else {
                    lValueOf = null;
                }
                if (!TextUtils.equals(musicId3, String.valueOf(lValueOf))) {
                    mission.setMusicToasted(true);
                    return;
                }
            }
            if (c19eg == null) {
                return;
            }
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131837329);
            C1390380mHk.LIZ(c19eg, 3034, creativeToastBuilder);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final boolean LJII(Activity activity, Uri uri) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        C1406830miH.LIZ.getClass();
        Gson gson = ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson();
        C19458911Bb.LIZ.getClass();
        if (C19458911Bb.LIZLLL(uri)) {
            try {
                c098200Yq = (n) gson.LJII(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "mission_data"), n.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Long lLJIILIIL = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            n nVar = (n) c098200Yq;
            if (nVar == null) {
                new C11BY().LJIIJ(-1L, EnumC588360N5u.MISSION_DATA_INVALID);
                return false;
            }
            try {
                c098200Yq2 = (Mission) gson.LIZJ(nVar, Mission.class);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            Mission mission = (Mission) c098200Yq2;
            if (mission == null) {
                new C11BY().LJIIJ(-1L, EnumC588360N5u.MISSION_DATA_INVALID);
                return false;
            }
            if (!mission.isDuet()) {
                return false;
            }
            try {
                c098200Yq3 = (Aweme) ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson().LIZJ(nVar.LJJIIZ("duet_aweme"), Aweme.class);
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq3 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                c098200Yq3 = null;
            }
            Aweme aweme = (Aweme) c098200Yq3;
            if (aweme == null) {
                return false;
            }
            HashMap map = new HashMap();
            for (String str : UriProtector.getQueryParameterNames(uri)) {
                map.put(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
            }
            String missionId = mission.getMissionId();
            if (missionId != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(missionId);
            }
            ((IDuetDownloadService) ServiceManager.get().getService(IDuetDownloadService.class)).LJ(activity, new MissionDuetRouterConfig(aweme, map, lLJIILIIL));
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, String str) {
        Mission mission;
        if (TextUtils.equals(str, "mission_logo") && (mission = videoPublishEditModel.creativeModel.commerceModel.getMission()) != null && mission.getEnableImageSticker() && mission.getImageSticker() != null) {
            new C11BY().LJIIZILJ(mission, 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LJIIIZ(ShortVideoContext shortVideoContext, C19EG c19eg) {
        CreativeModel creativeModel;
        CommerceToolsModel commerceToolsModel;
        Mission mission;
        String stickerId;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (commerceToolsModel = creativeModel.commerceModel) != null && (mission = commerceToolsModel.getMission()) != null) {
            String musicId = mission.getMusicId();
            if ((musicId != null && musicId.length() != 0 && !mission.getUserEverChoseDifferentSticker()) || ((stickerId = mission.getStickerId()) != null && stickerId.length() != 0 && !mission.isMusicToasted())) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.icon(R.raw.icon_exclamation_mark_circle_fill);
                creativeToastBuilder.iconColorRes(R.attr.ee);
                creativeToastBuilder.duration(Mp4ScreenVideoLoadTimeout.CONTROL);
                creativeToastBuilder.messageRes(2131837331);
                C1390380mHk.LIZ(c19eg, 3032, creativeToastBuilder);
                new C11BY().LJIJI(mission, 6);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LJIILJJIL(ShortVideoContext shortVideoContext, Activity activity) {
        CreativeModel creativeModel;
        CommerceToolsModel commerceToolsModel;
        Mission mission;
        String musicId;
        String mid;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (commerceToolsModel = creativeModel.commerceModel) != null && (mission = commerceToolsModel.getMission()) != null && (musicId = mission.getMusicId()) != null && musicId.length() != 0) {
            if (!mission.isMusicToasted()) {
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
                if (aVMusicExtractAVMusic != null) {
                    mid = aVMusicExtractAVMusic.getMid();
                } else {
                    mid = null;
                }
                if (!TextUtils.equals(mid, mission.getMusicId())) {
                    mission.setMusicToasted(true);
                    shortVideoContext.creativeModel.commerceModel.setMission(mission);
                }
            }
            if (!mission.isMusicToasted() && activity != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.icon(R.raw.icon_exclamation_mark_circle_fill);
                creativeToastBuilder.iconColorRes(R.attr.ee);
                creativeToastBuilder.duration(Mp4ScreenVideoLoadTimeout.CONTROL);
                creativeToastBuilder.messageRes(2131837330);
                C1390380mHk.LIZ(activity, 2038, creativeToastBuilder);
                new C11BY().LJIJI(mission, 1);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LJIILL(Activity activity, VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        CommerceToolsModel commerceToolsModel;
        Mission mission;
        String musicId;
        String mid;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (commerceToolsModel = creativeModel.commerceModel) != null && (mission = commerceToolsModel.getMission()) != null && (musicId = mission.getMusicId()) != null && musicId.length() != 0) {
            if (!mission.isMusicToasted()) {
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
                if (aVMusicExtractAVMusic != null) {
                    mid = aVMusicExtractAVMusic.getMid();
                } else {
                    mid = null;
                }
                if (!TextUtils.equals(mid, mission.getMusicId())) {
                    mission.setMusicToasted(true);
                    videoPublishEditModel.creativeModel.commerceModel.setMission(mission);
                }
            }
            if (!mission.isMusicToasted() && activity != null) {
                new C11BY().LJIJI(mission, 1);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LIZJ(int i, VideoPublishEditModel videoPublishEditModel, String str) {
        CreativeModel creativeModel;
        CommerceToolsModel commerceToolsModel;
        Mission mission;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (commerceToolsModel = creativeModel.commerceModel) != null && (mission = commerceToolsModel.getMission()) != null) {
            C11BZ c11bz = C11BZ.LIZ;
            EnumC19458811Ba enumC19458811Ba = EnumC19458811Ba.LLILLL;
            c11bz.getClass();
            C11BZ.LIZ(mission, i, str, enumC19458811Ba);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LJIIJJI(C19EG c19eg, ShortVideoContext shortVideoContext, String str) {
        String stickerId;
        Mission mission = shortVideoContext.creativeModel.commerceModel.getMission();
        if (mission != null && (stickerId = mission.getStickerId()) != null && stickerId.length() != 0 && str != null && str.length() != 0 && !mission.getUserEverChoseDifferentSticker()) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.icon(R.raw.icon_exclamation_mark_circle_fill);
            creativeToastBuilder.iconColorRes(R.attr.ee);
            creativeToastBuilder.duration(Mp4ScreenVideoLoadTimeout.CONTROL);
            creativeToastBuilder.messageRes(2131837332);
            C1390380mHk.LIZ(c19eg, 3033, creativeToastBuilder);
            new C11BY().LJIJI(mission, 4);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LJIIJ(Intent intent, Intent intent2, String str, String str2) {
        String strLIZ;
        MissionImageSticker imageSticker;
        String lowerCase;
        if (intent != null) {
            strLIZ = C19458911Bb.LIZ(intent, "mission_data");
        } else {
            strLIZ = null;
        }
        if ((TextUtils.equals(str, "mission") || TextUtils.equals(str, "tcm_upload")) && !TextUtils.isEmpty(strLIZ)) {
            try {
                Mission mission = (Mission) GsonProtectorUtils.fromJson(new Gson(), strLIZ, Mission.class);
                if (mission != null) {
                    if (!TextUtils.isEmpty(mission.getStickerId())) {
                        mission.setUserEverChoseDifferentSticker(false);
                    }
                    if (!TextUtils.isEmpty(mission.getMusicId())) {
                        mission.setMusicToasted(false);
                    }
                    List<String> challengeNames = mission.getChallengeNames();
                    if (challengeNames != null && !challengeNames.isEmpty()) {
                        mission.setChallengeToasted(false);
                    }
                    List<MissionUser> mentionedUsers = mission.getMentionedUsers();
                    if (mentionedUsers != null && !mentionedUsers.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        List<MissionUser> mentionedUsers2 = mission.getMentionedUsers();
                        if (mentionedUsers2 != null) {
                            for (MissionUser missionUser : mentionedUsers2) {
                                String nickname = missionUser.getNickname();
                                if (nickname != null) {
                                    lowerCase = nickname.toLowerCase(Locale.getDefault());
                                } else {
                                    lowerCase = null;
                                }
                                missionUser.setNickname(lowerCase);
                                arrayList.add(missionUser);
                            }
                        }
                        mission.setMentionedUsers(arrayList);
                        mission.setUserToasted(false);
                    }
                    if (mission.getEnableImageSticker() && mission.getImageSticker() != null && (imageSticker = mission.getImageSticker()) != null) {
                        C1324750kZt.LJIJI(imageSticker.getLogoImageUrl());
                    }
                    intent2.putExtra("mission", (Parcelable) mission);
                    o.LJIIZILJ.getCurrentUser();
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("creation_id", str2);
                    c0lab.LJ("shoot_way", str);
                    C11BY c11by = new C11BY();
                    c11by.LJIIIIZZ(mission);
                    c0lab.LJI(c11by.LJFF("mission_id", "page_source", "creator_followers", "creator_type"));
                    C20684815ws.LJIILLIIL("shoot", c0lab.LIZ);
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LJIILIIL(int i, int i2, VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        List<MissionUser> mentionedUsers;
        List<MissionUser> mentionedUsers2;
        List<String> challengeNames;
        List<String> challengeNames2;
        if (videoPublishEditModel != null) {
            C11BZ.LIZ.getClass();
            String strLIZJ = C11BZ.LIZJ(str, str2);
            if (i < i2 && i >= 0 && i2 <= strLIZJ.length() && !TextUtils.isEmpty(strLIZJ) && strLIZJ.length() != 0) {
                o.LJIIZILJ.getCurrentUser();
                String strSubstring = strLIZJ.substring(i, i2);
                Mission mission = videoPublishEditModel.creativeModel.commerceModel.getMission();
                if (mission != null) {
                    if (!mission.isChallengeToasted() && (challengeNames = mission.getChallengeNames()) != null && !challengeNames.isEmpty() && (challengeNames2 = mission.getChallengeNames()) != null) {
                        boolean zEquals = false;
                        for (String str3 : challengeNames2) {
                            if (strSubstring.length() > 1 && TextUtils.equals(String.valueOf(strSubstring.charAt(strSubstring.length() - 1)), C786410Ut5.N3(C0CHQ.LIZ).getString(2131848665))) {
                                C11BZ c11bz = C11BZ.LIZ;
                                String strSubstring2 = strLIZJ.substring(0, i2 - 1);
                                c11bz.getClass();
                                String strLIZIZ = C11BZ.LIZIZ(strSubstring2);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append('#');
                                sbLIZ.append(str3);
                                zEquals = TextUtils.equals(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ));
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append('#');
                            sbLIZ2.append(str3);
                            if (TextUtils.equals(strSubstring, C2188811AlT.LIZIZ(sbLIZ2)) && !zEquals) {
                                mission.setChallengeToasted(true);
                                new C11BY().LJIILLIIL(mission, 3);
                                videoPublishEditModel.creativeModel.commerceModel.setMission(mission);
                                return;
                            }
                        }
                    }
                    if (!mission.isUserToasted() && (mentionedUsers = mission.getMentionedUsers()) != null && !mentionedUsers.isEmpty() && (mentionedUsers2 = mission.getMentionedUsers()) != null) {
                        for (MissionUser missionUser : mentionedUsers2) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append('@');
                            sbLIZ3.append(missionUser.getNickname());
                            if (TextUtils.equals(strSubstring, C2188811AlT.LIZIZ(sbLIZ3))) {
                                mission.setUserToasted(true);
                                new C11BY().LJIILLIIL(mission, 2);
                                videoPublishEditModel.creativeModel.commerceModel.setMission(mission);
                                return;
                            }
                        }
                    }
                    C11BZ c11bz2 = C11BZ.LIZ;
                    EnumC19458811Ba enumC19458811Ba = EnumC19458811Ba.LLILLJJLI;
                    c11bz2.getClass();
                    C11BZ.LIZ(mission, i, str2, enumC19458811Ba);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LIZ(String str, int i, VideoPublishEditModel videoPublishEditModel, String str2, String str3, C19EG c19eg) {
        List<MissionUser> mentionedUsers;
        List<MissionUser> mentionedUsers2;
        List<String> challengeNames;
        List<String> challengeNames2;
        if (videoPublishEditModel != null) {
            o.LJIIZILJ.getCurrentUser();
            Mission mission = videoPublishEditModel.creativeModel.commerceModel.getMission();
            if (mission != null) {
                int i2 = 1;
                if (!mission.isChallengeToasted() && (challengeNames = mission.getChallengeNames()) != null && !challengeNames.isEmpty() && (challengeNames2 = mission.getChallengeNames()) != null) {
                    boolean zEquals = false;
                    for (String str4 : challengeNames2) {
                        if (str.length() > i2 && TextUtils.equals(String.valueOf(str.charAt(str.length() - i2)), C0CHQ.LIZ.getString(2131848665))) {
                            C11BZ.LIZ.getClass();
                            String strLIZIZ = C11BZ.LIZIZ(C11BZ.LIZJ(str2, str3).substring(0, i - 1));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append('#');
                            sbLIZ.append(str4);
                            zEquals = TextUtils.equals(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ));
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('#');
                        sbLIZ2.append(str4);
                        if (!TextUtils.equals(str, C2188811AlT.LIZIZ(sbLIZ2)) && !zEquals) {
                            i2 = 1;
                        } else {
                            if (c19eg != null) {
                                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                                creativeToastBuilder.icon(R.raw.icon_exclamation_mark_circle_fill);
                                creativeToastBuilder.iconColorRes(R.attr.ee);
                                creativeToastBuilder.duration(Mp4ScreenVideoLoadTimeout.CONTROL);
                                creativeToastBuilder.messageRes(2131837328);
                                C1390380mHk.LIZ(c19eg, 2038, creativeToastBuilder);
                            }
                            new C11BY().LJIJI(mission, 3);
                            return;
                        }
                    }
                }
                if (!mission.isUserToasted() && (mentionedUsers = mission.getMentionedUsers()) != null && !mentionedUsers.isEmpty() && (mentionedUsers2 = mission.getMentionedUsers()) != null) {
                    Iterator<MissionUser> it2 = mentionedUsers2.iterator();
                    while (it2.hasNext()) {
                        String nickname = it2.next().getNickname();
                        if (nickname != null && a0.LJJIIZI(str, nickname, false)) {
                            if (c19eg != null) {
                                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                                creativeToastBuilder2.icon(R.raw.icon_exclamation_mark_circle_fill);
                                creativeToastBuilder2.iconColorRes(R.attr.ee);
                                creativeToastBuilder2.duration(Mp4ScreenVideoLoadTimeout.CONTROL);
                                creativeToastBuilder2.messageRes(2131837326);
                                C1390380mHk.LIZ(c19eg, 2038, creativeToastBuilder2);
                            }
                            new C11BY().LJIJI(mission, 2);
                            return;
                        }
                    }
                }
            }
        }
    }
}
