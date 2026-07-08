package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.download;

import X.C0NM2;
import X.C1420960n54;
import X.C1421000n58;
import X.C1C7U;
import X.C2354709Kn;
import X.InterfaceC1420860n4u;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.download.StickPointMusicAlgFileDownload;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes23.dex */
public final class StickPointMusicAlgFileDownload implements InterfaceC1420860n4u {
    public Context LIZ;
    public int LIZIZ;
    public C0NM2 LJ;
    public StickPointMusicAlg LJFF;
    public boolean LJI;
    public String LJIIIIZZ;
    public final StickPointMusicAlgFileDownload$mainHandler$1 LJIIIZ;
    public final ArrayList<String> LIZJ = new ArrayList<>();
    public final ArrayList<String> LIZLLL = new ArrayList<>();
    public final ArrayList<String> LJII = new ArrayList<>();

    public final void LIZJ() {
        if (this.LIZIZ >= this.LIZJ.size()) {
            C0NM2 c0nm2 = this.LJ;
            if (c0nm2 != null) {
                c0nm2.LIZ(this.LJFF, this.LJI);
            }
            removeCallbacksAndMessages(null);
            return;
        }
        final String str = (String) ListProtector.get(this.LIZJ, this.LIZIZ);
        String str2 = (String) ListProtector.get(this.LIZLLL, this.LIZIZ);
        final String str3 = (String) ListProtector.get(this.LJII, this.LIZIZ);
        if (TextUtils.isEmpty(str)) {
            sendEmptyMessage(1);
            return;
        }
        if (C2354709Kn.LIZIZ(str2)) {
            this.LJI |= true;
            sendEmptyMessage(1);
            return;
        }
        C1420960n54 c1420960n54 = C1420960n54.LIZ;
        Context context = this.LIZ;
        String str4 = (String) ListProtector.get(this.LIZJ, this.LIZIZ);
        String str5 = (String) ListProtector.get(this.LIZLLL, this.LIZIZ);
        C1421000n58 c1421000n58 = new C1421000n58() { // from class: X.0n5E
            @Override // X.C1421000n58, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                sendEmptyMessage(1);
                StickPointMusicAlgFileDownload stickPointMusicAlgFileDownload = this.LL;
                stickPointMusicAlgFileDownload.LJI = true;
                C1441170nbf c1441170nbf = C1441170nbf.LIZ;
                String str6 = stickPointMusicAlgFileDownload.LJIIIIZZ;
                String str7 = str3;
                c1441170nbf.getClass();
                C1441170nbf.LIZ(str6, str7, true);
                C1441170nbf.LIZIZ(null, str, str3, true);
            }

            @Override // X.C1421000n58, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                sendEmptyMessage(1);
                C1441170nbf c1441170nbf = C1441170nbf.LIZ;
                String str6 = this.LL.LJIIIIZZ;
                String str7 = str3;
                c1441170nbf.getClass();
                C1441170nbf.LIZ(str6, str7, false);
                C1441170nbf.LIZIZ(baseException, str, str3, false);
            }
        };
        c1420960n54.getClass();
        C1420960n54.LIZ(context, str4, str5, c1421000n58);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.download.StickPointMusicAlgFileDownload$mainHandler$1] */
    public StickPointMusicAlgFileDownload() {
        final Looper mainLooper = Looper.getMainLooper();
        this.LJIIIZ = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.download.StickPointMusicAlgFileDownload$mainHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("StickPointMusicAlgFileDownload@e2c.mainHandler$1");
                if (message.what == 1) {
                    StickPointMusicAlgFileDownload stickPointMusicAlgFileDownload = this.LL;
                    stickPointMusicAlgFileDownload.LIZIZ++;
                    stickPointMusicAlgFileDownload.LIZJ();
                }
                C1C7U.LIZIZ("StickPointMusicAlgFileDownload@e2c.mainHandler$1");
            }
        };
    }

    @Override // X.InterfaceC1420860n4u
    public final InterfaceC1420860n4u LIZ(C0NM2 c0nm2) {
        this.LJ = c0nm2;
        return this;
    }

    @Override // X.InterfaceC1420860n4u
    public final void LIZIZ(Context context, String str, StickPointMusicAlg stickPointMusicAlg) {
        this.LJIIIIZZ = str;
        if (stickPointMusicAlg == null) {
            C0NM2 c0nm2 = this.LJ;
            if (c0nm2 != null) {
                c0nm2.LIZ(stickPointMusicAlg, this.LJI);
                return;
            }
            return;
        }
        this.LJFF = stickPointMusicAlg;
        this.LIZ = context;
        this.LJI = false;
        this.LIZJ.clear();
        this.LIZLLL.clear();
        this.LIZIZ = 0;
        if (!TextUtils.isEmpty(stickPointMusicAlg.getVeBeatsUrl())) {
            this.LIZJ.add(stickPointMusicAlg.getVeBeatsUrl());
            this.LIZLLL.add(stickPointMusicAlg.getVeBeatsPath());
            this.LJII.add("ve-beats");
        }
        if (!TextUtils.isEmpty(stickPointMusicAlg.getDownBeatsUrl())) {
            this.LIZJ.add(stickPointMusicAlg.getDownBeatsUrl());
            this.LIZLLL.add(stickPointMusicAlg.getDownBeatsPath());
            this.LJII.add("down-beats");
        }
        if (!TextUtils.isEmpty(stickPointMusicAlg.getNoStrengthBeatsUrl())) {
            this.LIZJ.add(stickPointMusicAlg.getNoStrengthBeatsUrl());
            this.LIZLLL.add(stickPointMusicAlg.getNoStrengthBeatsPath());
            this.LJII.add("no-strength-beats");
        }
        if (!TextUtils.isEmpty(stickPointMusicAlg.getManModeBeatsUrl())) {
            this.LIZJ.add(stickPointMusicAlg.getManModeBeatsUrl());
            this.LIZLLL.add(stickPointMusicAlg.getManModeBeatsPath());
            this.LJII.add("man_mode");
        }
        if (!TextUtils.isEmpty(stickPointMusicAlg.getMusicsyncUrl())) {
            this.LIZJ.add(stickPointMusicAlg.getMusicsyncUrl());
            this.LIZLLL.add(stickPointMusicAlg.getMusicSyncPath());
            this.LJII.add("music_sync");
        }
        if (!TextUtils.isEmpty(stickPointMusicAlg.getChorusUrl())) {
            this.LIZJ.add(stickPointMusicAlg.getChorusUrl());
            this.LIZLLL.add(stickPointMusicAlg.getChorusPath());
            this.LJII.add("chorus");
        }
        if (this.LIZJ.size() == 0) {
            C0NM2 c0nm22 = this.LJ;
            if (c0nm22 != null) {
                c0nm22.LIZ(stickPointMusicAlg, this.LJI);
                return;
            }
            return;
        }
        LIZJ();
    }
}
