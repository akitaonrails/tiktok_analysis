package com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule;

import X.AnonymousClass0956;
import X.C054G;
import X.C05WK;
import X.C098200Yq;
import X.C099F;
import X.C09A1;
import X.C0EQL;
import X.C0PEM;
import X.C1398350mUb;
import X.C13LZ;
import X.C1414680muw;
import X.C1415050mvX;
import X.C1416830myP;
import X.C1420380n48;
import X.C1420390n49;
import X.C1420410n4B;
import X.C1420430n4D;
import X.C1424905hv;
import X.C1426005i6;
import X.C15438062q;
import X.C189200o6;
import X.C1954807lC;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.EnumC1420440n4E;
import X.EnumC1420450n4F;
import X.InterfaceC1364105Vn;
import X.InterfaceC1416820myO;
import X.InterfaceC1437705jz;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.LyricsRuleTemplatePreloadServiceImpl;
import com.ss.android.ugc.gamora.lyrics.ILyricEffectPreloadService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class LyricsRuleTemplatePreloadServiceImpl implements ILyricsRuleTemplatePreloadService {
    public final C054G LIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final ConcurrentHashMap<String, C1420410n4B> LIZIZ = new ConcurrentHashMap<>();

    public static void LJIIJJI(C1420410n4B c1420410n4B) {
        boolean z;
        boolean z2;
        String message;
        EnumC1420450n4F enumC1420450n4F = c1420410n4B.LJI;
        EnumC1420450n4F enumC1420450n4F2 = EnumC1420450n4F.LL;
        if (enumC1420450n4F != enumC1420450n4F2) {
            z = true;
        } else {
            z = false;
        }
        if (c1420410n4B.LJIIIZ != enumC1420450n4F2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2 || c1420410n4B.LJIILIIL != EnumC1420440n4E.LL) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = c1420410n4B.LJIIZILJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AVMusic aVMusic = c1420410n4B.LJII;
        if (c1420410n4B.LJI != EnumC1420450n4F.LLILLL && aVMusic != null) {
            c1420410n4B.LJIILIIL = EnumC1420440n4E.LLILLJJLI;
            c1420410n4B.LJIIL = 100;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SUCCESS key=");
            sbLIZ.append(c1420410n4B.LIZ);
            sbLIZ.append(" lyric=");
            sbLIZ.append(c1420410n4B.LJIIIZ);
            sbLIZ.append(" listeners=");
            sbLIZ.append(c1420410n4B.LJIILJJIL.size());
            LJIIIZ("Preload.Complete", C2188811AlT.LIZIZ(sbLIZ));
            C1415050mvX.LJ(C1415050mvX.LIZ, c1420410n4B.LIZ, 0, null, 12);
            Iterator<InterfaceC1437705jz<AVMusic>> it2 = c1420410n4B.LJIILJJIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(aVMusic, false);
            }
            c1420410n4B.LJIILL.LJJLIIIJILLIZJL(aVMusic);
        } else {
            c1420410n4B.LJIILIIL = EnumC1420440n4E.LLILLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("FAIL key=");
            sbLIZ2.append(c1420410n4B.LIZ);
            sbLIZ2.append(" mb=");
            sbLIZ2.append(c1420410n4B.LJI);
            sbLIZ2.append(" lyric=");
            sbLIZ2.append(c1420410n4B.LJIIIZ);
            sbLIZ2.append(" reason=");
            Exception exc = c1420410n4B.LJIIIIZZ;
            if (exc != null) {
                message = exc.getMessage();
            } else {
                message = null;
            }
            sbLIZ2.append(message);
            LJIIJ("Preload.Complete", C2188811AlT.LIZIZ(sbLIZ2));
            Exception runtimeException = c1420410n4B.LJIIIIZZ;
            if (runtimeException == null) {
                runtimeException = new RuntimeException("music+Beats failed");
            }
            C1415050mvX.LJ(C1415050mvX.LIZ, c1420410n4B.LIZ, 1, "music_file", 4);
            Iterator<InterfaceC1437705jz<AVMusic>> it3 = c1420410n4B.LJIILJJIL.iterator();
            while (it3.hasNext()) {
                it3.next().LIZ(runtimeException);
            }
            c1420410n4B.LJIILL.LJJLIIIJILLIZJL(null);
        }
        c1420410n4B.LJIILJJIL.clear();
    }

    public static void LJIIL(C1420410n4B c1420410n4B) {
        Pair<? extends List<C0EQL>, C05WK> pair;
        List<C0EQL> first;
        AVMusic aVMusic = c1420410n4B.LJII;
        if (aVMusic == null || (pair = c1420410n4B.LJIIJ) == null || (first = pair.getFirst()) == null || first.isEmpty()) {
            return;
        }
        String str = aVMusic.musicName;
        if (str == null) {
            str = "";
        }
        if (str.length() != 0 && !first.isEmpty()) {
            Iterator<C0EQL> it2 = first.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZ.length() <= 0) {
                    String musicId = aVMusic.getMusicId();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(first, 10));
                    for (C0EQL c0eqlLIZ : first) {
                        if (c0eqlLIZ.LIZ.length() == 0 && Intrinsics.LJFF(c0eqlLIZ.LIZIZ, musicId)) {
                            c0eqlLIZ = C0EQL.LIZ(c0eqlLIZ, str, null, 62);
                        }
                        arrayList.add(c0eqlLIZ);
                    }
                    c1420410n4B.LJIIJ = new Pair<>(arrayList, pair.getSecond());
                    return;
                }
            }
        }
    }

    public static void LJIILIIL(C1420410n4B c1420410n4B) {
        int i;
        int i2;
        AVMusic aVMusic;
        int iOrdinal = c1420410n4B.LJI.ordinal();
        boolean z = true;
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new C1954807lC();
            }
            i = 100;
        } else {
            i = c1420410n4B.LJFF;
        }
        if (c1420410n4B.LJIIIZ == EnumC1420450n4F.LL) {
            z = false;
        }
        int i3 = (i * 70) / 100;
        if (z) {
            i2 = 30;
        } else {
            i2 = 0;
        }
        c1420410n4B.LJIIL = C13LZ.LJ(i3 + i2, 0, 100);
        Iterator<InterfaceC1437705jz<AVMusic>> it2 = c1420410n4B.LJIILJJIL.iterator();
        while (it2.hasNext()) {
            it2.next().onProgress(c1420410n4B.LJIIL);
        }
        if (c1420410n4B.LJI != EnumC1420450n4F.LL && !c1420410n4B.LJIILLIIL.isCompleted()) {
            if (c1420410n4B.LJI == EnumC1420450n4F.LLILLJJLI) {
                aVMusic = c1420410n4B.LJII;
            } else {
                aVMusic = null;
            }
            c1420410n4B.LJIILLIIL.LJJLIIIJILLIZJL(aVMusic);
        }
    }

    public final void LJIILJJIL(C1420410n4B c1420410n4B) {
        ILyricEffectPreloadService iLyricEffectPreloadService = (ILyricEffectPreloadService) PluggableExtentionKt.pluggableSpi$default(ILyricEffectPreloadService.class, false, false, false, 14, null);
        if (iLyricEffectPreloadService == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FAIL key=");
            sbLIZ.append(c1420410n4B.LIZ);
            sbLIZ.append(" reason=ILyricEffectPreloadService-SPI-absent");
            LJIIJ("Preload.LyricSticker", C2188811AlT.LIZIZ(sbLIZ));
            c1420410n4B.LJIIIZ = EnumC1420450n4F.LLILLL;
            LJIILIIL(c1420410n4B);
            LJIIJJI(c1420410n4B);
            return;
        }
        C1424905hv c1424905hv = ILyricEffectPreloadService.LIZ;
        String str = c1420410n4B.LIZLLL;
        String str2 = c1420410n4B.LIZJ;
        c1424905hv.getClass();
        String strLIZ = C1424905hv.LIZ(str, str2);
        boolean zLJFF = iLyricEffectPreloadService.LJFF(strLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("START key=");
        sbLIZ2.append(c1420410n4B.LIZ);
        sbLIZ2.append(" isPreloadingBefore=");
        sbLIZ2.append(zLJFF);
        LJIIIZ("Preload.LyricSticker", C2188811AlT.LIZIZ(sbLIZ2));
        iLyricEffectPreloadService.LIZJ(c1420410n4B.LIZJ, c1420410n4B.LIZLLL);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C23250099c.LIZLLL(this.LIZ, null, null, new C1420380n48(iLyricEffectPreloadService, strLIZ, new C1420430n4D(c1420410n4B), c1420410n4B, jCurrentTimeMillis, this, null), 3);
        c1420410n4B.getClass();
    }

    public static void LJIIIZ(String str, String str2) {
        C1426005i6.LIZ(C1398350mUb.LIZIZ, str, str2);
    }

    public static void LJIIJ(String str, String str2) {
        C1426005i6.LIZJ(C1398350mUb.LIZIZ, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService
    public final AVMusic LIZ(String str, String str2) {
        C1420410n4B c1420410n4B = this.LIZIZ.get(C1414680muw.LIZ(str, str2));
        if (c1420410n4B == null || c1420410n4B.LJIILIIL != EnumC1420440n4E.LLILLJJLI) {
            return null;
        }
        return c1420410n4B.LJII;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService
    public final boolean LIZJ(String str, String str2) {
        EnumC1420440n4E enumC1420440n4E;
        C1420410n4B c1420410n4B = this.LIZIZ.get(C1414680muw.LIZ(str, str2));
        if (c1420410n4B != null) {
            enumC1420440n4E = c1420410n4B.LJIILIIL;
        } else {
            enumC1420440n4E = null;
        }
        if (enumC1420440n4E == EnumC1420440n4E.LL) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService
    public final String LIZLLL(String str, String str2) {
        C1420410n4B c1420410n4B = this.LIZIZ.get(C1414680muw.LIZ(str, str2));
        if (c1420410n4B != null) {
            return c1420410n4B.LJIIJJI;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService
    public final float LJFF(String str, String str2) {
        int i;
        C1420410n4B c1420410n4B = this.LIZIZ.get(C1414680muw.LIZ(str, str2));
        if (c1420410n4B != null) {
            i = c1420410n4B.LJIIL;
        } else {
            i = 0;
        }
        return i / 100.0f;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService
    public final Pair<List<C0EQL>, C05WK> LJI(String str, String str2) {
        C1420410n4B c1420410n4B = this.LIZIZ.get(C1414680muw.LIZ(str, str2));
        if (c1420410n4B == null || c1420410n4B.LJIIIZ != EnumC1420450n4F.LLILLJJLI) {
            return null;
        }
        return c1420410n4B.LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService
    public final boolean LJII(String str, String str2) {
        ILyricEffectPreloadService.LIZ.getClass();
        String strLIZ = C1424905hv.LIZ(str2, str);
        ILyricEffectPreloadService iLyricEffectPreloadService = (ILyricEffectPreloadService) PluggableExtentionKt.pluggableSpi$default(ILyricEffectPreloadService.class, false, false, false, 14, null);
        if (iLyricEffectPreloadService != null) {
            return iLyricEffectPreloadService.LIZIZ(strLIZ);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService
    public final Object LIZIZ(String str, String str2, InterfaceC1364105Vn<? super AVMusic> interfaceC1364105Vn) {
        C099F c099f;
        C1420410n4B c1420410n4B = this.LIZIZ.get(C1414680muw.LIZ(str, str2));
        if (c1420410n4B != null && (c099f = c1420410n4B.LJIILL) != null) {
            return c099f.LJLIIIL(interfaceC1364105Vn);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService
    public final Object LJIIIIZZ(String str, String str2, InterfaceC1364105Vn<? super AVMusic> interfaceC1364105Vn) {
        C099F c099f;
        C1420410n4B c1420410n4B = this.LIZIZ.get(C1414680muw.LIZ(str, str2));
        if (c1420410n4B != null && (c099f = c1420410n4B.LJIILLIIL) != null) {
            return c099f.LJLIIIL(interfaceC1364105Vn);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService
    public final void LJ(Context context, String str, String str2, InterfaceC1437705jz<AVMusic> interfaceC1437705jz, String str3) {
        boolean z;
        AVMusic aVMusic;
        AVMusic aVMusic2;
        Object c098200Yq;
        String strLIZ = C1414680muw.LIZ(str, str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ENTRY key=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" musicId=");
        sbLIZ.append(str);
        sbLIZ.append(" effectResourceId=");
        sbLIZ.append(str2);
        sbLIZ.append(" hasListener=");
        if (interfaceC1437705jz != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        LJIIIZ("Preload.Service", C2188811AlT.LIZIZ(sbLIZ));
        if (str.length() != 0 && str2.length() != 0) {
            C1420410n4B c1420410n4B = this.LIZIZ.get(strLIZ);
            Object obj = null;
            if (c1420410n4B != null) {
                aVMusic = c1420410n4B.LJII;
            } else {
                aVMusic = null;
            }
            if (c1420410n4B != null) {
                if (aVMusic != null && c1420410n4B.LJIILIIL == EnumC1420440n4E.LLILLJJLI) {
                    EnumC1420450n4F enumC1420450n4F = c1420410n4B.LJIIIZ;
                    EnumC1420450n4F enumC1420450n4F2 = EnumC1420450n4F.LLILLJJLI;
                    if (enumC1420450n4F != enumC1420450n4F2 && !LJII(str, str2)) {
                        C1420410n4B c1420410n4B2 = new C1420410n4B(context, strLIZ, str, str2, str3);
                        c1420410n4B2.LJII = aVMusic;
                        c1420410n4B2.LJI = enumC1420450n4F2;
                        c1420410n4B2.LJFF = 100;
                        c1420410n4B2.LJIIL = 70;
                        if (interfaceC1437705jz != null) {
                            c1420410n4B2.LJIILJJIL.add(interfaceC1437705jz);
                        }
                        this.LIZIZ.put(strLIZ, c1420410n4B2);
                        c1420410n4B2.LJIILLIIL.LJJLIIIJILLIZJL(aVMusic);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("STALE-LYRIC-REBUILD key=");
                        sbLIZ2.append(strLIZ);
                        sbLIZ2.append(" prev-lyric=");
                        sbLIZ2.append(c1420410n4B.LJIIIZ);
                        sbLIZ2.append(" music-cached=true — restarting lyric sideload only");
                        LJIIIZ("Preload.Service", C2188811AlT.LIZIZ(sbLIZ2));
                        LJIILJJIL(c1420410n4B2);
                        c1420410n4B2.LJIIZILJ = C23250099c.LIZLLL(this.LIZ, null, null, new C1420390n49(c1420410n4B2, this, null), 3);
                        return;
                    }
                }
                if (c1420410n4B.LJIILIIL == EnumC1420440n4E.LLILLJJLI && (aVMusic2 = c1420410n4B.LJII) != null) {
                    try {
                        ILyricEffectPreloadService.LIZ.getClass();
                        String strLIZ2 = C1424905hv.LIZ(str2, str);
                        ILyricEffectPreloadService iLyricEffectPreloadService = (ILyricEffectPreloadService) PluggableExtentionKt.pluggableSpi$default(ILyricEffectPreloadService.class, false, false, false, 14, null);
                        if (iLyricEffectPreloadService != null) {
                            c098200Yq = Boolean.valueOf(iLyricEffectPreloadService.LJFF(strLIZ2));
                        } else {
                            c098200Yq = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                        obj = c098200Yq;
                    }
                    LJIIIZ("Preload.Service", "CACHE-HIT key=" + strLIZ + " replay onSuccess(fromCache=true) lyricStatus=" + c1420410n4B.LJIIIZ + " lyricPreloading=" + obj);
                    if (interfaceC1437705jz != null) {
                        interfaceC1437705jz.LIZIZ(aVMusic2, true);
                        return;
                    }
                    return;
                }
                if (c1420410n4B.LJIILIIL == EnumC1420440n4E.LL) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("COALESCE key=");
                    sbLIZ3.append(strLIZ);
                    sbLIZ3.append(" replay onProgress(");
                    sbLIZ3.append(c1420410n4B.LJIIL);
                    sbLIZ3.append(')');
                    LJIIIZ("Preload.Service", C2188811AlT.LIZIZ(sbLIZ3));
                    if (interfaceC1437705jz != null) {
                        c1420410n4B.LJIILJJIL.add(interfaceC1437705jz);
                        interfaceC1437705jz.onProgress(c1420410n4B.LJIIL);
                        return;
                    }
                    return;
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("NEW-TASK key=");
            sbLIZ4.append(strLIZ);
            sbLIZ4.append(" — start music+Beats + lyric sideload + 20s timeout");
            LJIIIZ("Preload.Service", C2188811AlT.LIZIZ(sbLIZ4));
            final C1420410n4B c1420410n4B3 = new C1420410n4B(context, strLIZ, str, str2, str3);
            if (interfaceC1437705jz != null) {
                c1420410n4B3.LJIILJJIL.add(interfaceC1437705jz);
            }
            this.LIZIZ.put(strLIZ, c1420410n4B3);
            C1415050mvX c1415050mvX = C1415050mvX.LIZ;
            c1415050mvX.getClass();
            C1415050mvX.LJFF(c1415050mvX, "overall_preload_start", str2, str, null, str3, 448);
            C1415050mvX.LJII(null, strLIZ, "overall_preload_end", str2, str, str3, false);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("START key=");
            sbLIZ5.append(strLIZ);
            sbLIZ5.append(" MusicDownloadManager.downloadMusic");
            LJIIIZ("Preload.Music", C2188811AlT.LIZIZ(sbLIZ5));
            c1415050mvX.getClass();
            C1415050mvX.LJII(null, strLIZ, "request_music_detail", str2, str, str3, true);
            C1416830myP.LIZJ(C1416830myP.LIZ, str, str2, new InterfaceC1416820myO() { // from class: X.0n4A
                @Override // X.InterfaceC1416820myO
                public final void onStart() {
                }

                @Override // X.InterfaceC1416820myO
                public final void onProgress(int i) {
                    if (c1420410n4B3.LJIILIIL != EnumC1420440n4E.LL) {
                        return;
                    }
                    if (!c1420410n4B3.LJIJ && i > 0) {
                        c1420410n4B3.LJIJ = true;
                        C1415050mvX c1415050mvX2 = C1415050mvX.LIZ;
                        String str4 = c1420410n4B3.LIZ;
                        c1415050mvX2.getClass();
                        C1415050mvX.LIZIZ(0, str4, "request_music_detail", null, null);
                        C1420410n4B c1420410n4B4 = c1420410n4B3;
                        String str5 = c1420410n4B4.LIZ;
                        String str6 = c1420410n4B4.LIZLLL;
                        String str7 = c1420410n4B4.LIZJ;
                        String str8 = c1420410n4B4.LJ;
                        c1415050mvX2.getClass();
                        C1415050mvX.LJII(null, str5, "download_music_file", str6, str7, str8, true);
                    }
                    c1420410n4B3.LJFF = C13LZ.LJ((int) (((double) i) * 0.5d), 0, 50);
                    LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl = this;
                    C1420410n4B c1420410n4B5 = c1420410n4B3;
                    lyricsRuleTemplatePreloadServiceImpl.getClass();
                    LyricsRuleTemplatePreloadServiceImpl.LJIILIIL(c1420410n4B5);
                }

                @Override // X.InterfaceC1416820myO
                public final void LIZ(Integer num, String str4) {
                    LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl = this;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("FAIL key=");
                    sbLIZ6.append(c1420410n4B3.LIZ);
                    sbLIZ6.append(" code=");
                    sbLIZ6.append(num);
                    sbLIZ6.append(" msg=");
                    sbLIZ6.append(str4);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                    lyricsRuleTemplatePreloadServiceImpl.getClass();
                    LyricsRuleTemplatePreloadServiceImpl.LJIIJ("Preload.Music", strLIZIZ);
                    if (!c1420410n4B3.LJIJ) {
                        C1415050mvX c1415050mvX2 = C1415050mvX.LIZ;
                        String str5 = c1420410n4B3.LIZ;
                        c1415050mvX2.getClass();
                        C1415050mvX.LIZIZ(1, str5, "request_music_detail", "music_detail", num);
                    } else {
                        C1415050mvX c1415050mvX3 = C1415050mvX.LIZ;
                        String str6 = c1420410n4B3.LIZ;
                        c1415050mvX3.getClass();
                        C1415050mvX.LIZIZ(1, str6, "download_music_file", "music_file", num);
                    }
                    if (c1420410n4B3.LJIILIIL != EnumC1420440n4E.LL) {
                        return;
                    }
                    c1420410n4B3.LJI = EnumC1420450n4F.LLILLL;
                    C1420410n4B c1420410n4B4 = c1420410n4B3;
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("downloadMusic failed: code=");
                    sbLIZ7.append(num);
                    sbLIZ7.append(" msg=");
                    sbLIZ7.append(str4);
                    c1420410n4B4.LJIIIIZZ = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ7));
                    LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl2 = this;
                    C1420410n4B c1420410n4B5 = c1420410n4B3;
                    lyricsRuleTemplatePreloadServiceImpl2.getClass();
                    LyricsRuleTemplatePreloadServiceImpl.LJIILIIL(c1420410n4B5);
                    LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl3 = this;
                    C1420410n4B c1420410n4B6 = c1420410n4B3;
                    lyricsRuleTemplatePreloadServiceImpl3.getClass();
                    LyricsRuleTemplatePreloadServiceImpl.LJIIJJI(c1420410n4B6);
                }

                @Override // X.InterfaceC1416820myO
                public final void LIZIZ(AVMusic aVMusic3, boolean z2) {
                    LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl = this;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("DOWNLOADED key=");
                    sbLIZ6.append(c1420410n4B3.LIZ);
                    sbLIZ6.append(" isFromCache=");
                    sbLIZ6.append(z2);
                    sbLIZ6.append(" musicPath=");
                    sbLIZ6.append(aVMusic3.path);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                    lyricsRuleTemplatePreloadServiceImpl.getClass();
                    LyricsRuleTemplatePreloadServiceImpl.LJIIIZ("Preload.Music", strLIZIZ);
                    String str4 = aVMusic3.path;
                    if (str4 != null && str4.length() != 0) {
                        if (!c1420410n4B3.LJIJ) {
                            c1420410n4B3.LJIJ = true;
                            C1415050mvX c1415050mvX2 = C1415050mvX.LIZ;
                            String str5 = c1420410n4B3.LIZ;
                            c1415050mvX2.getClass();
                            C1415050mvX.LIZIZ(0, str5, "request_music_detail", null, null);
                            C1420410n4B c1420410n4B4 = c1420410n4B3;
                            C1415050mvX.LJFF(c1415050mvX2, "download_music_file", c1420410n4B4.LIZLLL, c1420410n4B4.LIZJ, null, c1420410n4B4.LJ, 464);
                        } else {
                            C1415050mvX c1415050mvX3 = C1415050mvX.LIZ;
                            String str6 = c1420410n4B3.LIZ;
                            c1415050mvX3.getClass();
                            C1415050mvX.LIZIZ(0, str6, "download_music_file", null, null);
                        }
                        if (c1420410n4B3.LJIILIIL != EnumC1420440n4E.LL) {
                            return;
                        }
                        c1420410n4B3.LJII = aVMusic3;
                        LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl2 = this;
                        C1420410n4B c1420410n4B5 = c1420410n4B3;
                        lyricsRuleTemplatePreloadServiceImpl2.getClass();
                        LyricsRuleTemplatePreloadServiceImpl.LJIIL(c1420410n4B5);
                        c1420410n4B3.LJFF = 50;
                        LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl3 = this;
                        C1420410n4B c1420410n4B6 = c1420410n4B3;
                        lyricsRuleTemplatePreloadServiceImpl3.getClass();
                        LyricsRuleTemplatePreloadServiceImpl.LJIILIIL(c1420410n4B6);
                        C1444820nhY.LJII(aVMusic3);
                        final LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl4 = this;
                        final C1420410n4B c1420410n4B7 = c1420410n4B3;
                        lyricsRuleTemplatePreloadServiceImpl4.getClass();
                        C1415050mvX c1415050mvX4 = C1415050mvX.LIZ;
                        String str7 = c1420410n4B7.LIZ;
                        String str8 = c1420410n4B7.LIZLLL;
                        String str9 = c1420410n4B7.LIZJ;
                        String str10 = c1420410n4B7.LJ;
                        c1415050mvX4.getClass();
                        C1415050mvX.LJII(null, str7, "download_beats_file", str8, str9, str10, true);
                        C1420960n54 c1420960n54 = C1420960n54.LIZ;
                        Context context2 = c1420410n4B7.LIZIZ;
                        InterfaceC1420890n4x interfaceC1420890n4x = new InterfaceC1420890n4x() { // from class: X.0n4C
                            @Override // X.InterfaceC1420890n4x
                            public final void LIZ() {
                            }

                            @Override // X.InterfaceC1420890n4x
                            public final void LIZIZ() {
                            }

                            @Override // X.InterfaceC1420890n4x
                            public final void LIZJ(AVMusic aVMusic4, boolean z3) {
                                if (c1420410n4B7.LJIILIIL == EnumC1420440n4E.LL && !z3) {
                                    LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl5 = lyricsRuleTemplatePreloadServiceImpl4;
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append("FAIL key=");
                                    sbLIZ7.append(c1420410n4B7.LIZ);
                                    sbLIZ7.append(" reason=music-file-download-failed");
                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
                                    lyricsRuleTemplatePreloadServiceImpl5.getClass();
                                    LyricsRuleTemplatePreloadServiceImpl.LJIIJ("Preload.Beats", strLIZIZ2);
                                    C1415050mvX c1415050mvX5 = C1415050mvX.LIZ;
                                    String str11 = c1420410n4B7.LIZ;
                                    c1415050mvX5.getClass();
                                    C1415050mvX.LIZIZ(1, str11, "download_beats_file", "beats", null);
                                    c1420410n4B7.LJI = EnumC1420450n4F.LLILLL;
                                    c1420410n4B7.LJIIIIZZ = new RuntimeException("music file download failed (beats step)");
                                    LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl6 = lyricsRuleTemplatePreloadServiceImpl4;
                                    C1420410n4B c1420410n4B8 = c1420410n4B7;
                                    lyricsRuleTemplatePreloadServiceImpl6.getClass();
                                    LyricsRuleTemplatePreloadServiceImpl.LJIILIIL(c1420410n4B8);
                                    LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl7 = lyricsRuleTemplatePreloadServiceImpl4;
                                    C1420410n4B c1420410n4B9 = c1420410n4B7;
                                    lyricsRuleTemplatePreloadServiceImpl7.getClass();
                                    LyricsRuleTemplatePreloadServiceImpl.LJIIJJI(c1420410n4B9);
                                }
                            }

                            @Override // X.InterfaceC1420890n4x
                            public final void LIZLLL(AVMusic aVMusic4, boolean z3) {
                                String str11;
                                if (c1420410n4B7.LJIILIIL != EnumC1420440n4E.LL) {
                                    return;
                                }
                                if (z3) {
                                    LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl5 = lyricsRuleTemplatePreloadServiceImpl4;
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append("DOWNLOADED key=");
                                    sbLIZ7.append(c1420410n4B7.LIZ);
                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
                                    lyricsRuleTemplatePreloadServiceImpl5.getClass();
                                    LyricsRuleTemplatePreloadServiceImpl.LJIIIZ("Preload.Beats", strLIZIZ2);
                                    C1415050mvX c1415050mvX5 = C1415050mvX.LIZ;
                                    String str12 = c1420410n4B7.LIZ;
                                    c1415050mvX5.getClass();
                                    C1415050mvX.LIZIZ(0, str12, "download_beats_file", null, null);
                                    c1420410n4B7.LJFF = 100;
                                    c1420410n4B7.LJI = EnumC1420450n4F.LLILLJJLI;
                                    if (aVMusic4 != null && (str11 = aVMusic4.path) != null && str11.length() != 0) {
                                        c1420410n4B7.LJII = aVMusic4;
                                    }
                                    LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl6 = lyricsRuleTemplatePreloadServiceImpl4;
                                    C1420410n4B c1420410n4B8 = c1420410n4B7;
                                    lyricsRuleTemplatePreloadServiceImpl6.getClass();
                                    LyricsRuleTemplatePreloadServiceImpl.LJIIL(c1420410n4B8);
                                } else {
                                    LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl7 = lyricsRuleTemplatePreloadServiceImpl4;
                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                    sbLIZ8.append("FAIL key=");
                                    sbLIZ8.append(c1420410n4B7.LIZ);
                                    sbLIZ8.append(" reason=algorithm-download-failed");
                                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ8);
                                    lyricsRuleTemplatePreloadServiceImpl7.getClass();
                                    LyricsRuleTemplatePreloadServiceImpl.LJIIJ("Preload.Beats", strLIZIZ3);
                                    C1415050mvX c1415050mvX6 = C1415050mvX.LIZ;
                                    String str13 = c1420410n4B7.LIZ;
                                    c1415050mvX6.getClass();
                                    C1415050mvX.LIZIZ(1, str13, "download_beats_file", "beats", null);
                                    c1420410n4B7.LJI = EnumC1420450n4F.LLILLL;
                                    c1420410n4B7.LJIIIIZZ = new RuntimeException("algorithm download failed");
                                }
                                LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl8 = lyricsRuleTemplatePreloadServiceImpl4;
                                C1420410n4B c1420410n4B9 = c1420410n4B7;
                                lyricsRuleTemplatePreloadServiceImpl8.getClass();
                                LyricsRuleTemplatePreloadServiceImpl.LJIILIIL(c1420410n4B9);
                                LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl9 = lyricsRuleTemplatePreloadServiceImpl4;
                                C1420410n4B c1420410n4B10 = c1420410n4B7;
                                lyricsRuleTemplatePreloadServiceImpl9.getClass();
                                LyricsRuleTemplatePreloadServiceImpl.LJIIJJI(c1420410n4B10);
                            }
                        };
                        c1420960n54.getClass();
                        C1420960n54.LIZJ(context2, aVMusic3, interfaceC1420890n4x);
                        return;
                    }
                    LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl5 = this;
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("FAIL key=");
                    sbLIZ7.append(c1420410n4B3.LIZ);
                    sbLIZ7.append(" reason=empty-path isFromCache=");
                    sbLIZ7.append(z2);
                    sbLIZ7.append(" → route to onFailed");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
                    lyricsRuleTemplatePreloadServiceImpl5.getClass();
                    LyricsRuleTemplatePreloadServiceImpl.LJIIJ("Preload.Music", strLIZIZ2);
                    LIZ(null, "downloaded AVMusic.path is empty");
                }
            });
            LJIILJJIL(c1420410n4B3);
            c1420410n4B3.LJIIZILJ = C23250099c.LIZLLL(this.LIZ, null, null, new C1420390n49(c1420410n4B3, this, null), 3);
            return;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("REJECT key=");
        sbLIZ6.append(strLIZ);
        sbLIZ6.append(" empty musicId or effectResourceId");
        LJIIJ("Preload.Service", C2188811AlT.LIZIZ(sbLIZ6));
        if (interfaceC1437705jz != null) {
            interfaceC1437705jz.LIZ(new IllegalArgumentException("empty musicId or effectResourceId"));
        }
    }
}
