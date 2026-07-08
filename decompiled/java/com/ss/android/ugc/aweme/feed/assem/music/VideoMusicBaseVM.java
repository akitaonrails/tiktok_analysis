package com.ss.android.ugc.aweme.feed.assem.music;

import X.C01GW;
import X.C086I;
import X.C0C64;
import X.C0P1T;
import X.C0T1L;
import X.C1017070cZd;
import X.C1233040iBy;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1398450mUl;
import X.C1697810uHb;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C452501pT;
import X.C631280OpS;
import X.C631290OpT;
import X.C637980P0q;
import X.C720360SNm;
import X.C735280Sso;
import X.C735370Ssx;
import X.C7740030o;
import X.EnumC1035330d35;
import X.InterfaceC0148002o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.MainArchCommon;
import com.ss.android.ugc.aweme.feed.model.TtsReuseModel;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeListRequestModel;
import com.ss.android.ugc.aweme.music.model.MusicFusion;
import com.ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.copyrightmute.ISearchCopyrightMuteService;
import com.ss.android.ugc.aweme.search.pages.result.common.copyrightmute.core.communicate.SearchCopyrightMuteServiceImpl;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class VideoMusicBaseVM extends FeedBaseViewModel<C0P1T> {
    public final MutableLiveData<Boolean> LL = new MutableLiveData<>();
    public final MutableLiveData<Long> LLILLJJLI = new MutableLiveData<>();
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(257));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.0P1T
        };
    }

    public final boolean BQ2() {
        Aweme aweme;
        VideoItemParams item = getItem();
        if (item == null || (aweme = item.getAweme()) == null) {
            return false;
        }
        Music music = aweme.getMusic();
        User author = aweme.getAuthor();
        return (!AwemeBizExtKt.getLawCriticalCountry(aweme) || music == null || author == null || TextUtils.isEmpty(music.getOwnerId()) || !TextUtils.equals(music.getOwnerId(), author.getUid())) ? false : true;
    }

    public final boolean CQ2() {
        Aweme aweme;
        Music music;
        UrlModel coverThumb;
        VideoItemParams item = getItem();
        if (item == null || (aweme = item.getAweme()) == null || (music = aweme.getMusic()) == null || (coverThumb = music.getCoverThumb()) == null || coverThumb.getUri() == null) {
            return false;
        }
        ISearchCopyrightMuteService iSearchCopyrightMuteServiceLJI = SearchCopyrightMuteServiceImpl.LJI();
        VideoItemParams item2 = getItem();
        Aweme aweme2 = item2 != null ? item2.getAweme() : null;
        VideoItemParams item3 = getItem();
        return !iSearchCopyrightMuteServiceLJI.LIZIZ(aweme2, item3 != null ? item3.mEventType : null);
    }

    public final void LJJLJLI() {
        Music music;
        String strXQ2 = xQ2();
        if (strXQ2 != null) {
            VideoItemParams item = getItem();
            Aweme aweme = item != null ? item.getAweme() : null;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("group_id", aweme != null ? aweme.getAid() : null);
            c2344009Gk.LJIIIIZZ("author_id", aweme != null ? AwemeExtKt.getAuthorUid(aweme) : null);
            c2344009Gk.LJ((aweme == null || (music = aweme.getMusic()) == null) ? "" : Long.valueOf(music.getId()), "music_id");
            c2344009Gk.LJ(aweme != null ? Integer.valueOf(aweme.getAwemeType()) : null, "aweme_type");
            c2344009Gk.LJIIIIZZ("from_prop_id", C735370Ssx.LJIL(aweme));
            c2344009Gk.LJIIIIZZ("enter_from", this.eventType);
            c2344009Gk.LIZJ(CQ2() ? 1 : 0, "is_origin_cover");
            c2344009Gk.LJIIIIZZ("not_available_type", "not_click");
            c2344009Gk.LJIIIIZZ("not_available_reason", strXQ2);
            C20684815ws.LJIILLIIL("music_cover_show", c2344009Gk.LIZ);
        }
    }

    public final String xQ2() {
        Aweme aweme;
        UrlModel playUrl;
        String uri;
        List<String> urlList;
        AwemeRawAd awemeRawAd;
        AwemeCommerceStruct commerceVideoAuthInfo;
        String str;
        VideoItemParams item = getItem();
        if (item == null || (aweme = item.getAweme()) == null) {
            return "others";
        }
        Music musicLIZ = C631280OpS.LIZ(aweme);
        ISearchCopyrightMuteService iSearchCopyrightMuteServiceLJI = SearchCopyrightMuteServiceImpl.LJI();
        VideoItemParams item2 = getItem();
        Aweme aweme2 = item2 != null ? item2.getAweme() : null;
        VideoItemParams item3 = getItem();
        if (iSearchCopyrightMuteServiceLJI.LIZIZ(aweme2, item3 != null ? item3.mEventType : null)) {
            return "copyright_offline_search";
        }
        MainArchCommon mainArchCommon = aweme.getMainArchCommon();
        if (mainArchCommon != null && (str = mainArchCommon.musicDetailFailReason) != null) {
            return str;
        }
        if (C720360SNm.LJIIIZ(aweme)) {
            return "no_sound";
        }
        if (musicLIZ == null) {
            VideoItemParams item4 = getItem();
            if (C637980P0q.LIZ(item4 != null ? item4.getAweme() : null)) {
                return (AwemeExtKt.isPhotoMode(aweme) || aweme.getAwemeType() == 160) ? "no_sound" : "pumping_failed";
            }
        } else if (musicLIZ.getId() == 0) {
            return "pumping_failed";
        }
        if (!C086I.LIZIZ(aweme.getGeofencingRegions()) && (musicLIZ == null || TextUtils.equals(AwemeExtKt.getAuthorUid(aweme), musicLIZ.getOwnerId()))) {
            return "other";
        }
        if (aweme.isLiveReplay()) {
            return "live_playback";
        }
        if (AwemeExtKt.isMonetizationTraffic(aweme) && aweme.getCommerceVideoAuthInfo() != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.getAdSource() == 1) {
            return "adver";
        }
        if ((!AwemeExtKt.isMonetizationTraffic(aweme) && C1017070cZd.LL(aweme)) || aweme.isWithPromotionalMusic()) {
            return aweme.isWithPromotionalMusic() ? "authority_reason_promotional" : "adver";
        }
        C735280Sso.LIZ.getClass();
        if (C735280Sso.LJ(aweme)) {
            return "authority_reason_friend_visible";
        }
        if ((!aweme.isCanPlay() || AwemeExtKt.isCommentPostInvisible(aweme)) && BQ2()) {
            return "other";
        }
        if (C1017070cZd.LLIIJI(aweme)) {
            return "adver";
        }
        if (aweme.getSoundExemption() != 0) {
            return "no_sound";
        }
        if (C1017070cZd.LJLJLLL(aweme)) {
            return "adver";
        }
        if (musicLIZ == null || C1017070cZd.LL(aweme) || musicLIZ.isAuthorDeleted()) {
            if (AwemeExtKt.isMonetizationTraffic(aweme) && C1017070cZd.LL(aweme)) {
                return "adver";
            }
            return null;
        }
        if (((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJJ(musicLIZ.convertToMusicModel(), null, false, AwemeExtKt.isAdTraffic(aweme) && !C1017070cZd.LL(aweme) && (((awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getSystemOrigin() == 0) || C1017070cZd.LLF(aweme)))) {
            return null;
        }
        if (AwemeExtKt.isMonetizationTraffic(aweme)) {
            return "adver";
        }
        if (musicLIZ.getMusicStatus() == 0) {
            return "music_offline";
        }
        if (musicLIZ.getPlayUrl() == null || (playUrl = musicLIZ.getPlayUrl()) == null || (uri = playUrl.getUri()) == null || uri.length() == 0) {
            return "no_url";
        }
        UrlModel playUrl2 = musicLIZ.getPlayUrl();
        return (playUrl2 == null || (urlList = playUrl2.getUrlList()) == null || !urlList.isEmpty()) ? "other" : "no_url";
    }

    public static EnumC1035330d35 AQ2(int i) {
        if (i != R.id.ox6 && i != R.id.oxa) {
            if (i != R.id.otv && i != R.id.p7i && i != R.id.osx) {
                return null;
            }
            return EnumC1035330d35.ICON;
        }
        return EnumC1035330d35.TITLE;
    }

    public static boolean GQ2(Aweme aweme) {
        ICommerceMediaService iCommerceMediaService;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_reuse_original_sound_entrance", true, false) && Intrinsics.LJFF(aweme.getAllowReuseOriginalSound(), Boolean.TRUE) && (iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null)) != null && !iCommerceMediaService.LIZLLL()) {
            return true;
        }
        return false;
    }

    public static Bundle vQ2(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void zQ2(TtsVoiceInfo ttsVoiceInfo) {
        ttsVoiceInfo.setTtsReuseParams((List) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), ttsVoiceInfo.ttsReuseParamsString, new TypeToken<List<? extends TtsReuseModel>>() { // from class: X.0mUm
        }.getType()));
        ttsVoiceInfo.setTtsReuseParamsOrigin(ttsVoiceInfo.ttsReuseParams);
        ArrayList arrayList = new ArrayList();
        List<TtsReuseModel> list = ttsVoiceInfo.ttsReuseParams;
        if (list != null) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (TtsReuseModel ttsReuseModel : list) {
                int i4 = i + 1;
                if (i >= 0) {
                    TtsReuseModel ttsReuseModel2 = ttsReuseModel;
                    if (i != 0 && ttsReuseModel2.startTime < i2) {
                        int i5 = ttsReuseModel2.endTime;
                        if (i5 > i2) {
                            i2 = i5;
                        }
                        if (i3 < 3) {
                            i3++;
                            arrayList.add(ttsReuseModel2);
                        }
                        i = i4;
                    } else {
                        i2 = ttsReuseModel2.endTime;
                        arrayList.add(ttsReuseModel2);
                        i3 = 1;
                        i = i4;
                    }
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        ttsVoiceInfo.setTtsReuseParams(arrayList);
        ttsVoiceInfo.setTtsReuseParamsOrigin(arrayList);
        List<TtsReuseModel> list2 = ttsVoiceInfo.ttsReuseParams;
        if (list2 != null) {
            Iterator<TtsReuseModel> it2 = list2.iterator();
            while (it2.hasNext()) {
                TtsReuseModel next = it2.next();
                int i6 = next.align;
                if (i6 == 1) {
                    next.setAlign(1);
                } else if (i6 != 0 && i6 == 2) {
                    next.setAlign(3);
                } else {
                    next.setAlign(2);
                }
                int i7 = next.textStyle;
                if (i7 != -1 && next.bgMode == 0) {
                    if (i7 == 0) {
                        next.setBgMode(1);
                    } else if (i7 == 1) {
                        next.setBgMode(4);
                    } else if (i7 == 2) {
                        next.setBgMode(2);
                    } else if (i7 == 3) {
                        next.setBgMode(3);
                    }
                }
            }
        }
        ttsVoiceInfo.setTtsReuseParamsOrigin(ttsVoiceInfo.ttsReuseParams);
    }

    public final void DQ2(C1398450mUl c1398450mUl) {
        Aweme aweme;
        FragmentManager childFragmentManager;
        String str;
        String str2;
        boolean z;
        VideoItemParams item;
        Aweme aweme2;
        Aweme aweme3;
        String aid;
        boolean zLJI = MethodIDManager.LJI(71944);
        VideoItemParams item2 = getItem();
        MusicFusion musicFusion = null;
        if (item2 != null) {
            aweme = item2.getAweme();
        } else {
            aweme = null;
        }
        Music musicLIZ = C631280OpS.LIZ(aweme);
        if (musicLIZ != null) {
            musicFusion = musicLIZ.getMusicFusion();
        }
        Fragment fragment = this.fragment;
        if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null && musicFusion != null && C631290OpT.LIZ(musicFusion)) {
            IMusicDetailService iMusicDetailService = (IMusicDetailService) ServiceManager.get().getService(IMusicDetailService.class);
            if (iMusicDetailService != null) {
                VideoItemParams item3 = getItem();
                String str3 = "";
                if (item3 == null || (str = item3.mEventType) == null) {
                    str = "";
                }
                if (c1398450mUl.LJIIIIZZ) {
                    str2 = "click_cover";
                } else {
                    str2 = "click_name";
                }
                VideoItemParams item4 = getItem();
                if (item4 != null && (aweme3 = item4.getAweme()) != null && (aid = aweme3.getAid()) != null) {
                    str3 = aid;
                }
                String idStr = musicLIZ.getIdStr();
                MutableLiveData<Long> mutableLiveData = this.LLILLJJLI;
                MutableLiveData<Boolean> mutableLiveData2 = this.LL;
                AwS387S0200000_21 awS387S0200000_21 = new AwS387S0200000_21(this, c1398450mUl, 24);
                if (C0T1L.LIZ().musicPageEnable && (item = getItem()) != null && (aweme2 = item.getAweme()) != null && (!aweme2.isAd())) {
                    z = true;
                } else {
                    z = false;
                }
                iMusicDetailService.LJIIL(childFragmentManager, musicFusion, str, str2, str3, idStr, mutableLiveData, mutableLiveData2, awS387S0200000_21, z);
            }
        } else {
            EQ2(musicLIZ, c1398450mUl);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void wQ2(int i) {
        String str;
        Aweme aweme;
        String aid;
        String authorUid;
        Object objValueOf;
        Music music;
        if (i != R.id.ox6 && i != R.id.oxa) {
            if (i != R.id.osx && i != R.id.p7i) {
                str = "click_cover";
            } else {
                str = "click_icon";
            }
        } else {
            str = "click_name";
        }
        String strXQ2 = xQ2();
        if (strXQ2 != null) {
            VideoItemParams item = getItem();
            Integer numValueOf = null;
            if (item != null) {
                aweme = item.getAweme();
            } else {
                aweme = null;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            if (aweme != null && (music = aweme.getMusic()) != null) {
                objValueOf = Long.valueOf(music.getId());
            } else {
                objValueOf = "";
            }
            c2344009Gk.LJ(objValueOf, "music_id");
            if (aweme != null) {
                numValueOf = Integer.valueOf(aweme.getAwemeType());
            }
            c2344009Gk.LJ(numValueOf, "aweme_type");
            c2344009Gk.LJIIIIZZ("enter_method", str);
            c2344009Gk.LJIIIIZZ("from_prop_id", C735370Ssx.LJIL(aweme));
            c2344009Gk.LJIIIIZZ("enter_from", this.eventType);
            c2344009Gk.LIZJ(CQ2() ? 1 : 0, "is_origin_cover");
            c2344009Gk.LJIIIIZZ("not_available_reason", strXQ2);
            C20684815ws.LJIILLIIL("enter_music_detail_failed", c2344009Gk.LIZ);
        }
    }

    public static void FQ2(Aweme aweme, Music music) {
        String mid;
        int i;
        String strLIZIZ;
        VideoUrlModel playAddr;
        IMusicDetailService iMusicDetailService = (IMusicDetailService) PluggableExtentionKt.pluggableSpi$default(IMusicDetailService.class, false, false, false, 14, null);
        if (iMusicDetailService == null) {
            return;
        }
        String uri = "";
        if (music == null || TextUtils.isEmpty(music.getMid())) {
            mid = "";
        } else {
            mid = music.getMid();
        }
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZLLL() && !((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt()) {
            i = 1;
        } else {
            i = 0;
        }
        String aid = aweme.getAid();
        if (GQ2(aweme)) {
            Video video = aweme.getVideo();
            if (video != null && (playAddr = video.getPlayAddr()) != null) {
                uri = playAddr.getUri();
            } else {
                uri = null;
            }
        }
        TreeMap treeMap = new TreeMap();
        treeMap.put("item_id", aid);
        treeMap.put("video_id", uri);
        treeMap.put("enter_from", String.valueOf(1));
        iMusicDetailService.LJFF(treeMap);
        if (TextUtils.isEmpty(uri)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(mid);
            sbLIZ.append('_');
            sbLIZ.append(aid);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(mid);
            sbLIZ2.append('_');
            sbLIZ2.append(aid);
            sbLIZ2.append('_');
            sbLIZ2.append(uri);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        iMusicDetailService.LJIIZILJ(mid, i, treeMap, strLIZIZ, aweme.getGroupId(), new MusicAwemeListRequestModel(aweme.getAid()));
        iMusicDetailService.LJIL(music);
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0acf  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0af5  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0bd6  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0bfb  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0c13  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0c85  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0cbe  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0ce2  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0d01  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0d13  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0d16  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0d19  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0d1d  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0d20  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0d23  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0d2d  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0d3d  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0d43  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0d46  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0d49  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0d4c  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0d60  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0d64  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0192  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EQ2(com.ss.android.ugc.aweme.music.model.Music r49, X.C1398450mUl r50) {
        /*
            Method dump skipped, instruction units count: 3514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM.EQ2(com.ss.android.ugc.aweme.music.model.Music, X.0mUl):void");
    }

    public static boolean yQ2(Context context, Aweme aweme, boolean z) {
        if ((AwemeExtKt.isMonetizationTraffic(aweme) || !C1017070cZd.LL(aweme)) && !aweme.isWithPromotionalMusic()) {
            return false;
        }
        if (((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJIIIZ(aweme)) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131837754);
                c1389890mGx.LIZLLL(2000L);
                c1389890mGx.LJIIJJI();
            }
        } else if (!z) {
            C1233040iBy c1233040iBy = new C1233040iBy(context);
            c1233040iBy.LIZIZ(2131824738);
            c1233040iBy.LIZLLL();
            return true;
        }
        return true;
    }
}
