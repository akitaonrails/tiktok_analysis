package com.ss.android.ugc.aweme.image.music;

import X.AnonymousClass0956;
import X.C013C;
import X.C098200Yq;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0CHQ;
import X.C0PEM;
import X.C13043058n;
import X.C141N;
import X.C1429680nJ8;
import X.C1475700oVM;
import X.C1490520otG;
import X.C189200o6;
import X.C1DFH;
import X.C201955140j;
import X.C201962140q;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C2286608xc;
import X.C2296808zG;
import X.C23250099c;
import X.C23271099x;
import X.C2354709Kn;
import X.C267990Aer;
import X.C345290DgF;
import X.InterfaceC1364105Vn;
import X.InterfaceC1416880myU;
import X.InterfaceC1475840oVa;
import X.InterfaceC1662290tMJ;
import X.InterfaceC20187713yt;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.image.music.MediaPlayerManagerServiceImpl;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMediaPlayerManagerService;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS179S0400000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class MediaPlayerManagerServiceImpl implements IMediaPlayerManagerService {
    public final ConcurrentHashMap<String, C141N> LIZ = new ConcurrentHashMap<>();
    public AnonymousClass0956 LIZIZ;
    public CreativeDialogWrapper LIZJ;

    @Override // com.ss.android.ugc.aweme.music.service.IMediaPlayerManagerService
    public final void LJ() {
        LJII("cleanCache");
        this.LIZ.clear();
        AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZIZ = null;
        CreativeDialogWrapper creativeDialogWrapper = this.LIZJ;
        if (creativeDialogWrapper != null) {
            creativeDialogWrapper.dismiss();
        }
        this.LIZJ = null;
    }

    public static void LJII(String str) {
        C201955140j.LIZLLL(C201962140q.LIZIZ, "ImageModeMusicStream", str);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMediaPlayerManagerService
    public final void LIZ(MusicBuzModel musicBuzModel) {
        C141N c141n = this.LIZ.get(C1429680nJ8.LIZJ(musicBuzModel));
        if (c141n == null) {
            return;
        }
        if (!c141n.LJ.LIZIZ()) {
            try {
                C23250099c.LJ(C23271099x.INSTANCE, new C13043058n(this, musicBuzModel, "renderDone", null));
                C189200o6.m2constructorimpl(Unit.LIZ);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        String strLJ = C1490520otG.LJFF().LJ(c141n.LIZ, c141n.LIZIZ);
        if (C2354709Kn.LIZIZ(strLJ)) {
            musicBuzModel.musicPath = strLJ;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMediaPlayerManagerService
    public final void LIZLLL(final String str, final Function1<? super String, Unit> function1) {
        final C141N c141n = this.LIZ.get(str);
        if (c141n != null && !c141n.LIZLLL.LIZIZ()) {
            if (((Boolean) C267990Aer.LIZ.getValue()).booleanValue()) {
                C0CHQ.LIZ().isDebugConfigOpen();
            }
            c141n.LIZLLL.LIZJ(true);
            final String strLJ = C1490520otG.LJFF().LJ(c141n.LIZ, c141n.LIZIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("silentCopyMusic[start] musicId: ");
            sbLIZ.append(str);
            LJII(C2188811AlT.LIZIZ(sbLIZ));
            final C013C c013c = new C013C();
            C1475700oVM.LIZ().LJIIIZ(str, strLJ, true, false, new InterfaceC1475840oVa() { // from class: X.141K
                @Override // X.InterfaceC1475840oVa
                public final /* synthetic */ void LIZ(long j, long j2) {
                }

                @Override // X.InterfaceC1475840oVa
                public final void LIZIZ(int i) {
                    MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl = this;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("silentCopyMusic[onCopyError] musicId: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", type: ");
                    sbLIZ2.append(i);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    mediaPlayerManagerServiceImpl.getClass();
                    MediaPlayerManagerServiceImpl.LJII(strLIZIZ);
                }

                @Override // X.InterfaceC1475840oVa
                public final void onCopyComplete(boolean z, int i, String str2) {
                    C013C c013c2 = c013c;
                    if (c013c2.element) {
                        return;
                    }
                    c013c2.element = true;
                    boolean zLIZIZ = C2354709Kn.LIZIZ(strLJ);
                    if (zLIZIZ) {
                        C141N c141n2 = c141n;
                        String str3 = strLJ;
                        c141n2.LIZJ = str3;
                        function1.invoke(str3);
                        boolean z2 = C13TD.LIZIZ;
                        C13TC.LIZ(new C0VSJ(strLJ).getName(), str);
                    }
                    MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl = this;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("silentCopyMusic[onCopyComplete] musicId: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", checkFileExists: ");
                    sbLIZ2.append(zLIZIZ);
                    sbLIZ2.append(", isSuccess: ");
                    sbLIZ2.append(z);
                    sbLIZ2.append(", errorCode: ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", desc: ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(", destPath: ");
                    sbLIZ2.append(strLJ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    mediaPlayerManagerServiceImpl.getClass();
                    MediaPlayerManagerServiceImpl.LJII(strLIZIZ);
                }
            });
        }
    }

    public static void LJIIIIZZ(String str, String str2, String str3) {
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
        IMusicExternalService iMusicExternalService = (IMusicExternalService) PluggableExtentionKt.pluggableSpi$default(IMusicExternalService.class, false, false, false, 14, null);
        if (iMusicExternalService != null && (interfaceC1662290tMJLIZJ = iMusicExternalService.LIZJ()) != null) {
            interfaceC1662290tMJLIZJ.LJIIIZ(str, str2, new InterfaceC20187713yt() { // from class: X.141O
                @Override // X.InterfaceC20187713yt
                public final void LJJJLIIL(String str4) {
                }

                @Override // X.InterfaceC20187713yt
                public final void LJJJLL(String str4, float f) {
                }

                @Override // X.InterfaceC20187713yt
                public final void LJJJLZIJ(String str4) {
                }

                @Override // X.InterfaceC20187713yt
                public final void LJJJZ() {
                }

                @Override // X.InterfaceC20187713yt
                public final void LJJL() {
                }

                @Override // X.InterfaceC20187713yt
                public final void onError(int i, String str4) {
                }

                @Override // X.InterfaceC20187713yt
                public final void onStart() {
                }
            }, str3);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMediaPlayerManagerService
    public final void LIZJ(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareCopy musicId: ");
        sbLIZ.append(str);
        sbLIZ.append(", url: ");
        sbLIZ.append(str2);
        sbLIZ.append(", urlKey: ");
        sbLIZ.append(str3);
        LJII(C2188811AlT.LIZIZ(sbLIZ));
        ConcurrentHashMap<String, C141N> concurrentHashMap = this.LIZ;
        if (concurrentHashMap.get(str) == null) {
            concurrentHashMap.putIfAbsent(str, new C141N(str2, str3));
        }
    }

    public final Object LJI(final MusicBuzModel musicBuzModel, final boolean z, boolean z2, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C013C c013c = new C013C();
        final AwS179S0400000_30 awS179S0400000_30 = new AwS179S0400000_30(musicBuzModel, this, c013c, c2252611DEt, 1);
        final AwS179S0400000_30 awS179S0400000_302 = new AwS179S0400000_30(musicBuzModel, this, c013c, c2252611DEt, 0);
        final String strLIZJ = C1429680nJ8.LIZJ(musicBuzModel);
        final C141N c141n = this.LIZ.get(strLIZJ);
        if (c141n == null) {
            awS179S0400000_302.invoke(false, C2286608xc.LJ(-3));
        } else {
            if (z2) {
                C1DFH c1dfh = C0PEM.LIZ;
                this.LIZIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C345290DgF(this, null), 3);
            }
            final String strLJ = C1490520otG.LJFF().LJ(c141n.LIZ, c141n.LIZIZ);
            c141n.LIZLLL.LIZJ(true);
            C1475700oVM.LIZ().LJIIIZ(strLIZJ, strLJ, false, true, new InterfaceC1475840oVa() { // from class: X.141J
                @Override // X.InterfaceC1475840oVa
                public final /* synthetic */ void LIZ(long j, long j2) {
                }

                @Override // X.InterfaceC1475840oVa
                public final void LIZIZ(int i) {
                    MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl = this;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("forceCopyMusic[onCopyError]: musicId: ");
                    sbLIZ.append(strLIZJ);
                    sbLIZ.append(" type: ");
                    sbLIZ.append(i);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    mediaPlayerManagerServiceImpl.getClass();
                    MediaPlayerManagerServiceImpl.LJII(strLIZIZ);
                    if (z) {
                        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
                        if (aVMusicExtractAVMusic == null) {
                            awS179S0400000_302.invoke(Boolean.FALSE, Integer.valueOf(i));
                            return;
                        }
                        MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl2 = this;
                        Application application = C0CHQ.LIZ;
                        C141N c141n2 = c141n;
                        Function2<Boolean, String, Unit> function2 = awS179S0400000_30;
                        Function2<Boolean, Integer, Unit> function22 = awS179S0400000_302;
                        mediaPlayerManagerServiceImpl2.getClass();
                        MediaPlayerManagerServiceImpl.LJFF(application, aVMusicExtractAVMusic, c141n2, function2, function22);
                        return;
                    }
                    awS179S0400000_302.invoke(Boolean.FALSE, Integer.valueOf(i));
                }

                @Override // X.InterfaceC1475840oVa
                public final void onCopyComplete(boolean z3, int i, String str) {
                    if (C2354709Kn.LIZIZ(strLJ)) {
                        c141n.LIZJ = strLJ;
                        MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl = this;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("forceCopyMusic[onCopyComplete]: success: musicId: ");
                        sbLIZ.append(strLIZJ);
                        sbLIZ.append(" destPath: ");
                        sbLIZ.append(c141n.LIZJ);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        mediaPlayerManagerServiceImpl.getClass();
                        MediaPlayerManagerServiceImpl.LJII(strLIZIZ);
                        awS179S0400000_30.invoke(Boolean.TRUE, strLJ);
                        return;
                    }
                    if (z) {
                        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
                        if (aVMusicExtractAVMusic == null) {
                            awS179S0400000_302.invoke(Boolean.FALSE, -4);
                            return;
                        }
                        MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl2 = this;
                        Application application = C0CHQ.LIZ;
                        C141N c141n2 = c141n;
                        Function2<Boolean, String, Unit> function2 = awS179S0400000_30;
                        Function2<Boolean, Integer, Unit> function22 = awS179S0400000_302;
                        mediaPlayerManagerServiceImpl2.getClass();
                        MediaPlayerManagerServiceImpl.LJFF(application, aVMusicExtractAVMusic, c141n2, function2, function22);
                        return;
                    }
                    awS179S0400000_302.invoke(Boolean.FALSE, -4);
                }
            });
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static void LJFF(Context context, AVMusic aVMusic, final C141N c141n, final Function2 function2, final Function2 function22) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadMusic[start]: musicId: ");
        sbLIZ.append(aVMusic.getMusicId());
        LJII(C2188811AlT.LIZIZ(sbLIZ));
        C0CHQ.LIZ().LJJJJL().LJ("image_edit_music", context, aVMusic, 6, false, new InterfaceC1416880myU() { // from class: X.141M
            @Override // X.InterfaceC1416880myU
            public final void LIZJ(boolean z) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onProgress(int i) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onStart() {
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZ(Integer num, String str) {
                int iIntValue;
                Function2<Boolean, Integer, Unit> function23 = function22;
                if (function23 != null) {
                    Boolean bool = Boolean.TRUE;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    function23.invoke(bool, Integer.valueOf(iIntValue));
                }
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZIZ(String str, MusicWaveBean musicWaveBean) {
                c141n.LIZJ = str;
                Function2<Boolean, String, Unit> function23 = function2;
                if (function23 != null) {
                    function23.invoke(Boolean.TRUE, str);
                }
            }
        }, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01b7  */
    @Override // com.ss.android.ugc.aweme.music.service.IMediaPlayerManagerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r18, java.lang.String r19, boolean r20, boolean r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.image.music.MediaPlayerManagerServiceImpl.LIZIZ(com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel, java.lang.String, boolean, boolean, X.05Vn):java.lang.Object");
    }
}
