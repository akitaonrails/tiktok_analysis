package com.ss.android.ugc.aweme.component.music;

import X.AbstractC20497515In;
import X.AnonymousClass1541;
import X.C086I;
import X.C087R;
import X.C09N5;
import X.C0C64;
import X.C0VSJ;
import X.C0X0P;
import X.C0X7A;
import X.C0X7B;
import X.C0XML;
import X.C0XPR;
import X.C0XPT;
import X.C1238740iLA;
import X.C1385040m98;
import X.C142I;
import X.C1490520otG;
import X.C155U;
import X.C15HO;
import X.C15JJ;
import X.C15KF;
import X.C15KJ;
import X.C15KM;
import X.C15O7;
import X.C1659630tI1;
import X.C19469611Fe;
import X.C195U;
import X.C19633311rf;
import X.C19EG;
import X.C202033143j;
import X.C20325814g4;
import X.C20496415Ic;
import X.C20496615Ie;
import X.C20496815Ig;
import X.C20497015Ii;
import X.C20498215Iu;
import X.C20499015Jc;
import X.C20500615Js;
import X.C20502515Kl;
import X.C2188811AlT;
import X.C2286708xd;
import X.C569760MWg;
import X.C603820NmG;
import X.C633100OsO;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC202028143e;
import X.InterfaceC20498115It;
import X.InterfaceC20499515Jh;
import X.InterfaceC2385309Wh;
import X.ProgressDialogC1397800mTi;
import Y.ACallableS256S0200000_31;
import Y.AObserverS131S0300000_31;
import Y.AObserverS233S0100000_31;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMultiMusicPanel;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.model.MusicPickResponse;
import com.ss.android.ugc.aweme.choosemusic.utils.AVMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCoverInfo;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.music.model.ThirdMusicCoverItem;
import com.ss.android.ugc.aweme.music.model.TrimPointResponse;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.music.ui.AIMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS308S0300000_31;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class MusicService implements IMusicService {
    public int LIZ = 2;
    public C202033143j LIZIZ;
    public C155U LIZJ;

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJIIIIZZ() {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJI() {
        C20498215Iu.LIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJIIJ() {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJJIZL() {
        this.LIZ = 3;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJLL() {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LIZIZ() {
        C202033143j c202033143j = this.LIZIZ;
        if (c202033143j != null) {
            c202033143j.release();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final int LJIIIZ() {
        Integer num = C20325814g4.LIZIZ;
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJIILIIL() {
        AnonymousClass1541.LIZIZ.clear();
        AnonymousClass1541.LIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final Boolean LJIILJJIL() {
        return Boolean.valueOf(C20498215Iu.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final CutMultiMusicPanel LJJIFFI() {
        return new CutMultiMusicPanel();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final CutMusicPanel LJJII() {
        return new CutMusicPanel();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C15O7<TrimPointResponse> LJJIJIL() {
        return C15O7.LJIIIIZZ(2000L).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0FNr
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("MusicService@3f29.getTwoSecondsTask$1L");
                TrimPointResponse trimPointResponse = new TrimPointResponse();
                C1C7U.LIZIZ("MusicService@3f29.getTwoSecondsTask$1L");
                return trimPointResponse;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJJJL() {
        C633100OsO.LIZ.getClass();
        C633100OsO.LIZJ.LJIIIZ(-1);
        ((C603820NmG) C633100OsO.LIZLLL.getValue()).LJIIIZ(-1);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void initService() {
        C0XPR c0xpr = C0XPR.LIZ;
        C0XPT c0xpt = new C0XPT() { // from class: X.11Ff
            @Override // X.C0XPT
            public final void onFailed(Throwable th) {
            }

            @Override // X.C0XPT
            public final void LIZIZ(JSONObject jSONObject) {
                if (jSONObject != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("aweme_third_party_music_cover");
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("aweme_third_party_music_icon");
                    if (jSONObjectOptJSONObject != null) {
                        try {
                            C681770Qoh.LIZ(C786410Ut5.J3(jSONObjectOptJSONObject), "third_music_cover_info");
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C19469611Fe.LIZIZ(C786410Ut5.J3(jSONObjectOptJSONObject));
                        }
                    }
                    if (jSONObjectOptJSONObject2 != null) {
                        try {
                            C19469611Fe.LIZ = (ThirdMusicCoverItem) new Gson().LJII(C786410Ut5.J3(jSONObjectOptJSONObject2), ThirdMusicCoverItem.class);
                            C681770Qoh.LIZ(C786410Ut5.J3(jSONObjectOptJSONObject2), "third_music_icon_info");
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C19469611Fe.LIZIZ(C786410Ut5.J3(jSONObjectOptJSONObject2));
                        }
                    }
                }
            }
        };
        c0xpr.getClass();
        C0XPR.LJ(c0xpt);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean LJFF() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_check_trimmed_sound_clip_duration", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJI() {
        C19633311rf c19633311rfLIZIZ = C1238740iLA.LIZIZ();
        c19633311rfLIZIZ.LJ("cold_start_times", c19633311rfLIZIZ.LIZ(0, "cold_start_times") + 1);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final Map<String, Class<?>> LJJIIZ() {
        return Collections.emptyMap();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean LJJIJLIJ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "single_song_allow_full_song", true, false);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean LJJIL() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "smart_trim_for_full_song", true, false);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean LJJJJI() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "direct_to_camera_allow_full_song", true, false);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJJLL() {
        C1238740iLA.LIZIZ().LJI("has_receive_new_coupon", true);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final Class<?> LIZJ() {
        return ChooseMusicActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final int LJIIJJI() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C155U LJIJJLI() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C15JJ LJJJIL() {
        return C15JJ.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final String LIZ(MusicModel musicModel) {
        if (musicModel.isPlayUrlValid()) {
            if (musicModel.getMusicType() == 2 && musicModel.getReuseAudioPlayUrl() != null) {
                return C1490520otG.LJFF().LIZLLL((String) ListProtector.get(musicModel.getReuseAudioPlayUrl().getUrlList(), 0));
            }
            return C1490520otG.LJFF().LJ((String) ListProtector.get(musicModel.getUrl().getUrlList(), 0), musicModel.getUrl().getUrlKey());
        }
        if (!TextUtils.isEmpty(musicModel.getLocalPath())) {
            String localPath = musicModel.getLocalPath();
            if (!localPath.startsWith("http://") && !localPath.startsWith("https://")) {
                C844470XAv.LIZ.getClass();
                String strLIZ = C09N5.LIZ(C844470XAv.LIZ(), UriProtector.parse(musicModel.getLocalPath()));
                if (strLIZ != null) {
                    return strLIZ;
                }
                return "";
            }
            return C1490520otG.LJFF().LJ(localPath, musicModel.getResolvedUrlKey(localPath));
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LIZLLL(String str) {
        if (this.LIZIZ != null && str != null && !str.isEmpty()) {
            this.LIZIZ.LJJIIJ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final Music LJII(String str) {
        try {
            Music music = MusicApi.LIZ(0, str).music;
            if (music != null) {
                return music;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final String LJIIL(MusicModel musicModel) {
        if (musicModel.isPlayUrlValid()) {
            if (musicModel.getMusicType() == 2) {
                return C1490520otG.LJFF().LIZIZ((String) ListProtector.get(musicModel.getReuseAudioPlayUrl().getUrlList(), 0));
            }
            return C1490520otG.LJFF().LIZJ((String) ListProtector.get(musicModel.getUrl().getUrlList(), 0), musicModel.getUrl().getUrlKey());
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final MusicModel LJIILL(String str) {
        if (!TextUtils.isEmpty(str)) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists()) {
                return C15KM.LIZ(c0vsj);
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final String LJIJI(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C786410Ut5.k4(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C786410Ut5.k4(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJIL(C155U c155u) {
        this.LIZJ = c155u;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJIIJZLJL(String str) {
        AnonymousClass1541.LIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final AVMusicDownloadPlayHelper LJJJJLI(C20500615Js c20500615Js) {
        return new AVMusicDownloadPlayHelper(c20500615Js);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final MusicWaveBean LJJJJZ(int i) {
        return C15KF.LJ(i);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final List<String> LJJJZ(String str) {
        if (C19469611Fe.LIZ == null) {
            C844470XAv.LIZ.getClass();
            String string = KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "music_sp", 0).getString("third_music_icon_info", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    C19469611Fe.LIZ = (ThirdMusicCoverItem) new Gson().LJII(string, ThirdMusicCoverItem.class);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C19469611Fe.LIZIZ(string);
                }
            }
        }
        ThirdMusicCoverItem thirdMusicCoverItem = C19469611Fe.LIZ;
        if (thirdMusicCoverItem != null) {
            List<MusicCoverInfo> list = thirdMusicCoverItem.musicCoverInfoList;
            if (!C086I.LIZIZ(list)) {
                for (MusicCoverInfo musicCoverInfo : list) {
                    if (musicCoverInfo != null && TextUtils.equals(musicCoverInfo.partnerName, str)) {
                        return musicCoverInfo.coverUrlList;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final long getMusicDuration(String str) {
        return C142I.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C20499015Jc LJIJ(Context context, List list) {
        return new C20499015Jc(5, context, list);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C15O7<BaseResponse> LJJIIZI(final MusicModel musicModel, final int i) {
        ArrayList arrayList = new ArrayList();
        if (musicModel.hasExtendMusicList()) {
            Iterator<MusicModel> it2 = musicModel.getMergedMusicList().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getMusicId());
            }
        }
        String musicId = musicModel.getMusicId();
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new String[0]);
        StringBuilder sb = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb.append(charSequenceArr[0]);
            for (int i2 = 1; i2 < charSequenceArr.length; i2++) {
                sb.append((CharSequence) ",");
                sb.append(charSequenceArr[i2]);
            }
        }
        String string = sb.toString();
        ChooseMusicApi.API api = ChooseMusicApi.LIZ;
        C087R.LIZ.getClass();
        synchronized (C087R.LIZJ) {
            try {
                for (Map.Entry<String, ?> entry : C087R.LIZ().getAll().entrySet()) {
                    C087R.LIZ.getClass();
                    C087R.LIZ().storeBoolean(entry.getKey(), true);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return ChooseMusicApi.LIZ.LJ(musicId, string, i).LJI(new InterfaceC2385309Wh() { // from class: X.1542
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                Collection<AnonymousClass1543> collectionValues;
                int i3 = i;
                MusicModel musicModel2 = musicModel;
                C1C7U.LIZ("MusicService@3f29.collectMusic$1L");
                if (!c15o7.LJIILL() && c15o7.LJIILJJIL()) {
                    C1440005kM.LIZ(new C629770On1(musicModel2, i3));
                    String musicId2 = musicModel2.getMusicId();
                    if (AnonymousClass1541.LIZ != null && (collectionValues = AnonymousClass1541.LIZIZ.values()) != null) {
                        Iterator<T> it3 = collectionValues.iterator();
                        while (it3.hasNext()) {
                            Object obj = ((AnonymousClass1543) it3.next()).LIZIZ;
                            if (obj instanceof MusicPickResponse) {
                                for (Music music : ((MusicPickResponse) obj).musicList) {
                                    if (Intrinsics.LJFF(music.getIdStr(), musicId2)) {
                                        music.setCollectStatus(i3);
                                    }
                                }
                            }
                        }
                    }
                }
                C1C7U.LIZIZ("MusicService@3f29.collectMusic$1L");
                return c15o7;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C15O7<SuggestMusicList> LJJIJL(String str, String str2) {
        return ChooseMusicApi.LIZ.LJIIL(str2, str).LIZLLL(new InterfaceC2385309Wh<MusicList, SuggestMusicList>() { // from class: X.0oAf
            @Override // X.InterfaceC2385309Wh
            public final SuggestMusicList then(C15O7<MusicList> c15o7) {
                SuggestMusicList suggestMusicList;
                C1C7U.LIZ("MusicService@3f29.getPromoteRecommendMusicList$1");
                if (!c15o7.LJIILIIL() && !c15o7.LJIILL() && c15o7.LJIIL() != null) {
                    suggestMusicList = new SuggestMusicList();
                    MusicList musicListLJIIL = c15o7.LJIIL();
                    suggestMusicList.musicList = C15J0.LIZIZ(musicListLJIIL.items, musicListLJIIL.extra);
                    suggestMusicList.cursor = c15o7.LJIIL().getCursor();
                    suggestMusicList.hasMore = c15o7.LJIIL().isHasMore();
                } else {
                    suggestMusicList = null;
                }
                C1C7U.LIZIZ("MusicService@3f29.getPromoteRecommendMusicList$1");
                return suggestMusicList;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final MusicDownloadPlayHelper LJJJJZI(InterfaceC20499515Jh interfaceC20499515Jh, String str) {
        return new MusicDownloadPlayHelper(interfaceC20499515Jh, str);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final AIMusicDownloadPlayHelper LJJJLIIL(InterfaceC20499515Jh interfaceC20499515Jh, String str) {
        return new AIMusicDownloadPlayHelper(interfaceC20499515Jh, str);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJ(Context context, String str, InterfaceC20498115It interfaceC20498115It) {
        LJJIJIIJIL(null, context, interfaceC20498115It, str, false, false);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJIIZILJ(String str, int i, C15KJ c15kj) {
        C15KF.LIZIZ(str, i, c15kj);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean LJIJJ(MusicModel musicModel, Context context, boolean z) {
        return C142I.LIZ(musicModel, context, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJIZ(List list, List list2, C20502515Kl c20502515Kl) {
        C15KF.LJFF(list, list2, c20502515Kl);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJ(Fragment fragment, MusicModel musicModel, C15HO c15ho) {
        if (fragment.getActivity() != null) {
            ChooseMusicCutViewModel chooseMusicCutViewModel = (ChooseMusicCutViewModel) C1659630tI1.LJ(fragment).get(ChooseMusicCutViewModel.class);
            chooseMusicCutViewModel.wQ2().postValue(musicModel);
            chooseMusicCutViewModel.vQ2().postValue(c15ho);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJI(final C19EG c19eg, final InterfaceC20498115It interfaceC20498115It, final String str) {
        C15O7.LIZJ(new Callable() { // from class: X.15Iq
            public final /* synthetic */ boolean LLILZ = false;
            public final /* synthetic */ ProgressDialog LLILZIL = null;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                MusicService musicService = this.LL;
                String str2 = str;
                Context context = c19eg;
                boolean z = this.LLILZ;
                ProgressDialog progressDialog = this.LLILZIL;
                InterfaceC20498115It interfaceC20498115It2 = interfaceC20498115It;
                musicService.getClass();
                C1C7U.LIZ("MusicService@3f29.fetchMusicByTemplateId$1L");
                try {
                    musicService.LJJL(context, MusicApi.LIZ.queryMusicByTemplateId(str2).get().music, z, progressDialog, interfaceC20498115It2, false);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (interfaceC20498115It2 != null) {
                        C15O7.LIZIZ(new ACallableS256S0200000_31(interfaceC20498115It2, e, 4), C15O7.LJIIIIZZ, null);
                    }
                }
                C1C7U.LIZIZ("MusicService@3f29.fetchMusicByTemplateId$1L");
                return null;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C15O7 LJJJJ(int i, int i2, String str) {
        return ChooseMusicApi.LIZ.LJIILIIL(str, i, i2);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean LJJJJJ(MusicModel musicModel, Context context, boolean z, boolean z2) {
        return C142I.LIZ(musicModel, context, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJLZIJ(String str, Context context, MusicModel musicModel, int i, InterfaceC202028143e interfaceC202028143e) {
        boolean zLJI = MethodIDManager.LJI(137950);
        LJIIJ(i, context, interfaceC202028143e, musicModel, str, false, false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJIILLIIL(C19EG c19eg, Object obj, Bundle bundle, AwS308S0300000_31 awS308S0300000_31, AwS569S0100000_25 awS569S0100000_25, AwS569S0100000_25 awS569S0100000_252) {
        LifecycleOwner currentScene;
        ViewModelProvider viewModelProviderOf;
        Scene currentScene2;
        String string = c19eg.getString(2131828635);
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ()) {
            string = c19eg.getString(2131837748);
        }
        C786410Ut5.LJJJI("title", string, bundle);
        C20496415Ic.LIZ.getClass();
        C20496415Ic.LIZ();
        NavigationScene navigationScene = (NavigationScene) obj;
        ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
        if (iCreativeSAAService == null || (currentScene = iCreativeSAAService.getCurrentScene(c19eg)) == null) {
            currentScene = c19eg;
        }
        C20496615Ie c20496615Ie = new C20496615Ie();
        c20496615Ie.mArguments = bundle;
        c20496615Ie.disableSupportRestore();
        c20496615Ie.setTheme(C1385040m98.LIZLLL(c19eg));
        ICreativeSAAService iCreativeSAAService2 = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
        if (iCreativeSAAService2 != null && (currentScene2 = iCreativeSAAService2.getCurrentScene(c19eg)) != null) {
            viewModelProviderOf = C1659630tI1.LJIIIIZZ(currentScene2, null, null, 6);
        } else {
            viewModelProviderOf = ViewModelProviders.of(c19eg);
        }
        ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = (ChooseMusicWithSceneViewModel) viewModelProviderOf.get(ChooseMusicWithSceneViewModel.class);
        MutableLiveData<AbstractC20497515In> mutableLiveDataWQ2 = chooseMusicWithSceneViewModel.wQ2();
        MutableLiveData<AbstractC20497515In> mutableLiveDataVQ2 = chooseMusicWithSceneViewModel.vQ2();
        MutableLiveData mutableLiveData = (MutableLiveData) chooseMusicWithSceneViewModel.LLILZLL.getValue();
        C20496815Ig c20496815Ig = new C20496815Ig(mutableLiveData, awS308S0300000_31, chooseMusicWithSceneViewModel, mutableLiveDataWQ2, currentScene, mutableLiveDataVQ2);
        C569760MWg c569760MWg = new C569760MWg();
        c569760MWg.LIZJ = new C195U(new AwS575S0100000_31(chooseMusicWithSceneViewModel, 1345), new AwS575S0100000_31(chooseMusicWithSceneViewModel, 1346));
        c569760MWg.LIZ = true;
        navigationScene.LLLLLLLLLL(c20496615Ie, c569760MWg.LIZ());
        AwS240S0300000_31 awS240S0300000_31 = new AwS240S0300000_31(mutableLiveData, currentScene, awS308S0300000_31, 33);
        ((LiveData) chooseMusicWithSceneViewModel.LLILZIL.getValue()).setValue(new C20497015Ii(c20496815Ig, awS240S0300000_31));
        mutableLiveDataWQ2.observe(currentScene, new AObserverS233S0100000_31(awS569S0100000_25, 31));
        mutableLiveDataVQ2.observe(currentScene, new AObserverS131S0300000_31(mutableLiveData, awS569S0100000_252, c20496815Ig, 1));
        mutableLiveData.observe(currentScene, new AObserverS233S0100000_31(awS240S0300000_31, 32));
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJIJIIJIL(final ProgressDialogC1397800mTi progressDialogC1397800mTi, final Context context, final InterfaceC20498115It interfaceC20498115It, final String str, final boolean z, final boolean z2) {
        C15O7.LIZJ(new Callable() { // from class: X.15Ir
            public final /* synthetic */ int LLILLL = 0;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                MusicService musicService = this.LL;
                String str2 = str;
                int i = this.LLILLL;
                Context context2 = context;
                boolean z3 = z;
                ProgressDialog progressDialog = progressDialogC1397800mTi;
                InterfaceC20498115It interfaceC20498115It2 = interfaceC20498115It;
                boolean z4 = z2;
                musicService.getClass();
                C1C7U.LIZ("MusicService@3f29.fetchMusicDetail$1L");
                try {
                    musicService.LJJL(context2, MusicApi.LIZ(i, str2).music, z3, progressDialog, interfaceC20498115It2, z4);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (interfaceC20498115It2 != null) {
                        C15O7.LIZIZ(new ACallableS256S0200000_31(interfaceC20498115It2, e, 3), C15O7.LJIIIIZZ, null);
                    }
                }
                C1C7U.LIZIZ("MusicService@3f29.fetchMusicDetail$1L");
                return null;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJL(android.content.Context r13, final com.ss.android.ugc.aweme.music.model.Music r14, boolean r15, final android.app.ProgressDialog r16, final X.InterfaceC20498115It r17, boolean r18) {
        /*
            r12 = this;
            r0 = 137950(0x21ade, float:1.93309E-40)
            boolean r5 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            r3 = 0
            r4 = r17
            if (r14 == 0) goto L2a
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r7 = r14.convertToMusicModel()     // Catch: java.lang.Exception -> L39
            if (r7 == 0) goto L2a
            X.143j r6 = new X.143j     // Catch: java.lang.Exception -> L39
            java.lang.String r0 = "fetch_music_detail"
            r9 = 1
            r6.<init>(r13, r0, r15, r9)     // Catch: java.lang.Exception -> L39
            r12.LIZIZ = r6     // Catch: java.lang.Exception -> L39
            X.15Is r8 = new X.15Is     // Catch: java.lang.Exception -> L39
            r0 = r16
            r8.<init>()     // Catch: java.lang.Exception -> L39
            r10 = 0
            r11 = r18
            r6.LIZIZ(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L39
            goto L4a
        L2a:
            if (r4 == 0) goto L4a
            Y.ACallableS434S0100000_31 r1 = new Y.ACallableS434S0100000_31     // Catch: java.lang.Exception -> L39
            r0 = 10
            r1.<init>(r4, r0)     // Catch: java.lang.Exception -> L39
            X.08kh r0 = X.C15O7.LJIIIIZZ     // Catch: java.lang.Exception -> L39
            X.C15O7.LIZIZ(r1, r0, r3)     // Catch: java.lang.Exception -> L39
            goto L4a
        L39:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            if (r4 == 0) goto L4a
            Y.ACallableS256S0200000_31 r1 = new Y.ACallableS256S0200000_31
            r0 = 5
            r1.<init>(r4, r2, r0)
            X.08kh r0 = X.C15O7.LJIIIIZZ
            X.C15O7.LIZIZ(r1, r0, r3)
        L4a:
            if (r5 == 0) goto L4f
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.component.music.MusicService.LJJL(android.content.Context, com.ss.android.ugc.aweme.music.model.Music, boolean, android.app.ProgressDialog, X.15It, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJIIJ(final int i, final Context context, final InterfaceC202028143e interfaceC202028143e, final MusicModel musicModel, final String str, final boolean z, final boolean z2) {
        boolean zLJI = MethodIDManager.LJI(137950);
        if (musicModel != null) {
            C15O7.LIZJ(new Callable() { // from class: X.143z
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = context;
                    boolean z3 = z;
                    String str2 = str;
                    int i2 = i;
                    MusicModel musicModel2 = musicModel;
                    InterfaceC202028143e interfaceC202028143e2 = interfaceC202028143e;
                    boolean z4 = z2;
                    C1C7U.LIZ("MusicService@3f29.downloadMusic$3L");
                    C202033143j c202033143j = new C202033143j(context2, str2, false, z3);
                    c202033143j.LIZIZ.LJ = i2;
                    if (musicModel2.hasExtendMusicList()) {
                        c202033143j.LIZ(musicModel2.getMergedMusicList(), interfaceC202028143e2, false, z4);
                    } else {
                        c202033143j.LIZIZ(musicModel2, interfaceC202028143e2, true, false, z4);
                    }
                    C1C7U.LIZIZ("MusicService@3f29.downloadMusic$3L");
                    return null;
                }
            });
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C15O7 LJJIII(int i, int i2, int i3, Boolean bool, String str, String str2, String str3) {
        return ChooseMusicApi.LJII(i, i2, i3, bool, str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C15O7 LJJIJ(String str, String str2, long j, int i, int i2, String str3, String str4, String str5) {
        return MusicApi.LIZ.getAutoCutMusicList(str, str2, i, "", 0, str3, str4, str5, i2, j);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C15O7 LJJJJL(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, int i3, long j) {
        return MusicApi.LIZ.getAutoCutMusicListByNewPath(str, str2, i, "", 1, str3, str4, str5, str6, i2, i3, j);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C15O7 LJJ(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        return MusicApi.LIZ.getAutoCutNLEModel(str, str2, i, str3, i2, z ? 1 : 0, i3, str4, str5, str6, z2);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C15O7 LJJIJIIJI(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, String str6, int i4, int i5, int i6, long j, int i7, String str7, String str8, boolean z, String str9, String str10, int i8, String str11, int i9, String str12, String str13) {
        MusicApi.MusicService musicService = MusicApi.LIZ;
        C0X7B c0x7b = new C0X7B();
        c0x7b.LJ(C0X7A.LJFF);
        c0x7b.LIZ("rec_config", str3);
        c0x7b.LIZ("shoot_way", str9);
        c0x7b.LIZ("asset_rec_feed_features", str10);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i8);
        sbLIZ.append("");
        c0x7b.LIZ("effective_connection_type", C2188811AlT.LIZIZ(sbLIZ));
        if (!str11.isEmpty()) {
            c0x7b.LIZ("extra", str11);
        }
        if (C2286708xd.LIZJ(str)) {
            C0VSJ c0vsj = new C0VSJ(str);
            c0x7b.LIZIZ("zipBinary", c0vsj.getName(), new C0XML(C0X0P.LIZJ(MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase(Locale.getDefault()))), c0vsj));
        }
        return MusicApi.LIZ.getAutoCutMusicList(c0x7b.LIZLLL(), str2, i, "", i2, i3, str4, str5, str6, i4, i5, ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService().getEffectSDKVersion(), i6, j, i7, str7, str8, z ? 1 : 0, i9, str12, str13);
    }
}
