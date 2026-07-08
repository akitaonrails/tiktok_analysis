package com.ss.android.ugc.aweme.search.player.core.viewmodel;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C0C64;
import X.C0PDO;
import X.C123100dR;
import X.C1233040iBy;
import X.C1388190mED;
import X.C1458340o3M;
import X.C1458350o3N;
import X.C1485020okO;
import X.C1485060okS;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1906580ziK;
import X.C19574011i6;
import X.C19EG;
import X.C202033143j;
import X.C20498815Ja;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C452501pT;
import X.C588550N6n;
import X.C588600N6s;
import X.C679340Qkm;
import X.CountDownTimerC19772612Xs;
import X.EnumC667250QFf;
import X.EnumC670460QRo;
import X.InterfaceC1485050okR;
import X.InterfaceC1485100okW;
import X.InterfaceC1485110okX;
import X.InterfaceC1485120okY;
import X.InterfaceC588610N6t;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.enablestatus.MusicPlayStatus;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class MusicPlayHelper extends ViewModel {
    public static final /* synthetic */ int LLIZ = 0;
    public C202033143j LLILLL;
    public Music LLILZ;
    public CountDownTimerC19772612Xs LLILZIL;
    public final NextLiveData<Pair<Integer, Long>> LL = new NextLiveData<>();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(128));
    public final NextLiveData<C19574011i6> LLILZLL = new NextLiveData<>();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        CountDownTimerC19772612Xs countDownTimerC19772612Xs = this.LLILZIL;
        if (countDownTimerC19772612Xs != null) {
            countDownTimerC19772612Xs.cancel();
        }
        BQ2(null, false);
        vQ2().release();
        C202033143j c202033143j = this.LLILLL;
        if (c202033143j != null) {
            c202033143j.release();
        }
    }

    public final C20498815Ja vQ2() {
        return (C20498815Ja) this.LLILLJJLI.getValue();
    }

    public final boolean wQ2() {
        Pair<Integer, Long> value;
        if (this.LLILZ == null || this.LL.getValue() == null) {
            return false;
        }
        Pair<Integer, Long> value2 = this.LL.getValue();
        if ((value2 == null || value2.getFirst().intValue() != 2) && ((value = this.LL.getValue()) == null || value.getFirst().intValue() != 1)) {
            return false;
        }
        Pair<Integer, Long> value3 = this.LL.getValue();
        Long second = value3 != null ? value3.getSecond() : null;
        Music music = this.LLILZ;
        return Intrinsics.LJFF(second, music != null ? Long.valueOf(music.getId()) : null);
    }

    public final boolean xQ2(long j) {
        Pair<Integer, Long> value;
        Pair<Integer, Long> value2;
        if (this.LL.getValue() == null || (value = this.LL.getValue()) == null || value.getFirst().intValue() != 1 || (value2 = this.LL.getValue()) == null || value2.getSecond().longValue() != j) {
            return false;
        }
        return true;
    }

    public final boolean yQ2(long j) {
        Pair<Integer, Long> value;
        Pair<Integer, Long> value2;
        if (this.LL.getValue() == null || (value = this.LL.getValue()) == null || value.getFirst().intValue() != 2 || (value2 = this.LL.getValue()) == null || value2.getSecond().longValue() != j) {
            return false;
        }
        return true;
    }

    public static void AQ2(Context context, Music music) {
        String offlineDesc = music.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getString(2131837770);
        }
        C1233040iBy c1233040iBy = new C1233040iBy(context);
        c1233040iBy.LIZJ(offlineDesc);
        c1233040iBy.LIZLLL();
    }

    public final void BQ2(View view, boolean z) {
        C19EG c19eg;
        MusicPlayStatus musicPlayStatus;
        C588600N6s c588600N6s;
        InterfaceC588610N6t interfaceC588610N6t;
        Activity activityLIZIZ;
        CountDownTimerC19772612Xs countDownTimerC19772612Xs = this.LLILZIL;
        if (countDownTimerC19772612Xs != null) {
            countDownTimerC19772612Xs.cancel();
        }
        vQ2().pause();
        Activity activityLIZ = null;
        this.LLILZ = null;
        this.LL.setValue(new Pair<>(0, -1L));
        if (z) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            }
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && MusicPlayStatus.LLILLL && (musicPlayStatus = ((MusicPlayStatus.MusicPlayStatusVM) C679340Qkm.LIZ(view, c19eg).get(MusicPlayStatus.MusicPlayStatusVM.class)).LL) != null && (c588600N6s = musicPlayStatus.LL) != null && c588600N6s.LIZIZ() && (interfaceC588610N6t = c588600N6s.LIZIZ) != null) {
                interfaceC588610N6t.resume();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0PDN] */
    public final void zQ2(final View view, C19EG c19eg, final Music music) {
        Lifecycle lifecycle;
        List<String> urlList;
        String urlKey;
        C588600N6s c588600N6s;
        IMusicService iMusicService = (IMusicService) PluggableExtentionKt.pluggableSpi$default(IMusicService.class, false, false, false, 14, null);
        if (iMusicService == null) {
            return;
        }
        C0PDO c0pdo = MusicPlayStatus.LLILLJJLI;
        MusicPlayStatus musicPlayStatus = ((MusicPlayStatus.MusicPlayStatusVM) C679340Qkm.LIZ(view, c19eg).get(MusicPlayStatus.MusicPlayStatusVM.class)).LL;
        if (musicPlayStatus != null && (c588600N6s = musicPlayStatus.LL) != null) {
            c588600N6s.LIZ(new C588550N6n(0, null));
        }
        synchronized (c0pdo) {
            try {
                MusicPlayStatus.LLILLL = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        vQ2().stop();
        this.LLILZ = music;
        MusicModel musicModelConvertToMusicModel = music.convertToMusicModel();
        if (!iMusicService.LJIJJ(musicModelConvertToMusicModel, c19eg, true)) {
            return;
        }
        C1485060okS c1485060okS = new C1485060okS();
        c1485060okS.LJFF = musicModelConvertToMusicModel.getMusicId();
        if (C1458350o3N.LIZ()) {
            if (C123100dR.LIZ(musicModelConvertToMusicModel.getMusicVolumeInfo())) {
                float f = C1458340o3M.LIZ;
                if (C1485020okO.LIZLLL(Float.valueOf(f))) {
                    c1485060okS.LJIIJJI = musicModelConvertToMusicModel.getMusicVolumeInfo();
                    c1485060okS.LJIIL = f;
                    musicModelConvertToMusicModel.getMusicVolumeInfo();
                    musicModelConvertToMusicModel.getMusicId();
                } else {
                    musicModelConvertToMusicModel.getMusicVolumeInfo();
                    musicModelConvertToMusicModel.getMusicId();
                }
            } else {
                musicModelConvertToMusicModel.getMusicVolumeInfo();
                musicModelConvertToMusicModel.getMusicId();
            }
        }
        if (musicModelConvertToMusicModel.getMusicType() == 1) {
            c1485060okS.LIZJ = 4;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "remove_15s_cap_music", true, true)) {
            c1485060okS.LIZLLL = musicModelConvertToMusicModel.getAuditionDuration().intValue();
        } else {
            c1485060okS.LIZLLL = musicModelConvertToMusicModel.getDuration();
        }
        this.LL.setValue(new Pair<>(1, Long.valueOf(music.getId())));
        vQ2().LJ(new InterfaceC1485120okY() { // from class: X.11fK
            @Override // X.InterfaceC1485120okY
            public final void LIZ(int i, int i2) {
                MusicPlayHelper musicPlayHelper = this.LIZ;
                Music music2 = music;
                musicPlayHelper.getClass();
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "remove_15s_cap_music", true, true)) {
                    CountDownTimerC19772612Xs countDownTimerC19772612Xs = musicPlayHelper.LLILZIL;
                    if (countDownTimerC19772612Xs != null) {
                        countDownTimerC19772612Xs.cancel();
                    }
                    if (music2.getDuration() != music2.getRealAuditionDuration()) {
                        long realAuditionDuration = ((long) music2.getRealAuditionDuration()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        if (realAuditionDuration <= 0) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("MusicPlayHelper: audition_duration is zero, music id: ");
                            sbLIZ.append(music2.getId());
                            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            CountDownTimerC19772612Xs countDownTimerC19772612Xs2 = new CountDownTimerC19772612Xs(realAuditionDuration, musicPlayHelper, 2);
                            musicPlayHelper.LLILZIL = countDownTimerC19772612Xs2;
                            countDownTimerC19772612Xs2.start();
                        }
                    }
                }
                this.LIZ.LL.setValue(new Pair<>(2, Long.valueOf(music.getId())));
            }
        });
        vQ2().LIZ(new InterfaceC1485100okW() { // from class: X.10uk
            @Override // X.InterfaceC1485100okW
            public final void LIZIZ() {
                this.LIZ.LL.setValue(new Pair<>(0, -1L));
            }
        });
        vQ2().LIZJ(new InterfaceC1485110okX() { // from class: X.10ul
            @Override // X.InterfaceC1485110okX
            public final void LIZ(int i, int i2) {
                this.LIZ.LL.setValue(new Pair<>(0, -1L));
            }
        });
        vQ2().LIZLLL(new InterfaceC1485050okR() { // from class: X.0PDN
            @Override // X.InterfaceC1485050okR
            public final void LJJZZI() {
            }

            @Override // X.InterfaceC1485050okR
            public final void LIZ() {
                MusicPlayStatus musicPlayStatus2;
                C588600N6s c588600N6s2;
                View view2 = view;
                C19EG c19egLJ = C651290Pgd.LJ();
                if (c19egLJ == null || !MusicPlayStatus.LLILLL || (musicPlayStatus2 = ((MusicPlayStatus.MusicPlayStatusVM) C679340Qkm.LIZ(view2, c19egLJ).get(MusicPlayStatus.MusicPlayStatusVM.class)).LL) == null || (c588600N6s2 = musicPlayStatus2.LL) == null) {
                    return;
                }
                C588550N6n c588550N6n = new C588550N6n(1, null);
                C587090N0x c587090N0x = c588600N6s2.LIZ;
                boolean z = c588550N6n.LIZ == 1;
                List<InterfaceC588620N6u> list = c588550N6n.LIZIZ;
                if (list == null) {
                    list = c587090N0x.LIZIZ;
                }
                c587090N0x.getClass();
                c588600N6s2.LIZ = new C587090N0x(z, list);
            }
        });
        UrlModel playUrl = music.getPlayUrl();
        if (playUrl != null && (urlList = playUrl.getUrlList()) != null) {
            if (urlList.size() > 0) {
                c1485060okS.LIZIZ = urlList;
                UrlModel playUrl2 = music.getPlayUrl();
                if (playUrl2 != null) {
                    urlKey = playUrl2.getUrlKey();
                } else {
                    urlKey = null;
                }
                c1485060okS.LJIIJ = urlKey;
                vQ2().LIZIZ(c1485060okS);
            } else {
                AQ2(c19eg, music);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Music Url List size is zero, and music id:  ");
                sbLIZ.append(music.getId());
                C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            AQ2(c19eg, music);
        }
        SAFHelper.LIZ.getClass();
        LifecycleOwner lifecycleOwnerLJJ = SAFHelper.LJJ(view, c19eg);
        if (lifecycleOwnerLJJ != null && (lifecycle = lifecycleOwnerLJJ.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper$play$7
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    MusicPlayHelper musicPlayHelper = this.LL;
                    if (event == Lifecycle.Event.ON_PAUSE) {
                        musicPlayHelper.BQ2(null, false);
                    }
                }
            });
        }
        ISearchSevenSplitScreenRootFragmentAbility iSearchSevenSplitScreenRootFragmentAbility = (ISearchSevenSplitScreenRootFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), ISearchSevenSplitScreenRootFragmentAbility.class, null);
        if (iSearchSevenSplitScreenRootFragmentAbility != null) {
            iSearchSevenSplitScreenRootFragmentAbility.Hm2(EnumC667250QFf.STATE_FULL_SCREEN, EnumC670460QRo.OTHER);
        }
    }
}
