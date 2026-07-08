package com.ss.android.ugc.trill.download.protocol.mob;

import X.AbstractC21169117sn;
import X.C01GW;
import X.C036E;
import X.C09N1;
import X.C0VSJ;
import X.C1260870iur;
import X.C1357300lQO;
import X.C1374950lsr;
import X.C1376270luz;
import X.C1376320lv4;
import X.C1376960lw6;
import X.C1379790m0f;
import X.C1379810m0h;
import X.C1380880m2Q;
import X.C1382530m55;
import X.C1382560m58;
import X.C13LE;
import X.C15O7;
import X.C19719912Dl;
import X.C2241008qG;
import X.C452501pT;
import X.C612410O0h;
import X.C793770VBv;
import X.C794240VDq;
import X.C844470XAv;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemeVideoDownloadMobProtocol extends AwemeDefaultDownloadMobProtocol<C1379810m0h> {
    public long LLJJJJ;
    public ACLCommonShare LLJJL;
    public C1376960lw6 LLJL;
    public String LLJJJJJIL = "";
    public int LLJJJJLIIL = -1;
    public String LLJJLIIIJLLLLLLLZ = "";
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(422));
    public final C19719912Dl LLJLILLLLZIIL = C13LE.LIZ(C1379810m0h.class);

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJFF() throws IllegalAccessException, InstantiationException {
        super.LJFF();
        if (Intrinsics.LJFF(this.LLILZLL, "long_press_download")) {
            C1379790m0f.LIZIZ(0, this.LLJJJIL, "mask", this.LLJJLIIIJLLLLLLLZ);
        } else {
            C1379790m0f.LIZIZ(0, this.LLJJJIL, this.LLJJJJJIL, this.LLJJLIIIJLLLLLLLZ);
        }
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJI() throws IllegalAccessException, InstantiationException {
        super.LJI();
        C1376270luz.LIZ.getClass();
        C1376270luz.LJ = true;
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIILJJIL() {
        super.LJIILJJIL();
        C1376270luz.LIZ.getClass();
        C1376270luz.LJ = true;
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIILLIIL() throws IllegalAccessException, InstantiationException {
        super.LJIILLIIL();
        int i = (this.LLJIJIL && C1380880m2Q.LIZ()) ? 2 : 1;
        Aweme aweme = this.LLJJJIL;
        if (aweme != null) {
            C1357300lQO.LIZIZ(aweme, this.LLILZLL, this.LLJJJJJIL, "short", null, i, -1);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final C19719912Dl LJIIL() {
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final /* bridge */ /* synthetic */ boolean LIZ(AbstractC21169117sn abstractC21169117sn) {
        LJIJ((C1379810m0h) abstractC21169117sn);
        return true;
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIIIZ(String str) throws IllegalAccessException, InstantiationException {
        super.LJIIIZ(str);
        this.LLJJLIIIJLLLLLLLZ = str;
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol
    /* JADX INFO: renamed from: LJIJJLI, reason: merged with bridge method [inline-methods] */
    public final void LJIJ(C1379810m0h c1379810m0h) {
        super.LJIJ(c1379810m0h);
        this.LLJJJJ = 0L;
        this.LLJJLIIIJLLLLLLLZ = "";
        this.LLJJL = c1379810m0h.LJIILIIL;
        this.LLJL = c1379810m0h.LJIILJJIL;
        this.LLJJJJJIL = c1379810m0h.LJIIJJI;
        this.LLJJJJLIIL = c1379810m0h.LJIIJ;
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIIJ(String str, String str2) {
        String aid;
        Integer numValueOf;
        UrlModel urlModel;
        Aweme aweme;
        super.LJIIJ(str, str2);
        this.LLJJLIIIJLLLLLLLZ = str2;
        Aweme aweme2 = this.LLJJJIL;
        Boolean boolValueOf = null;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        Aweme aweme3 = this.LLJJJIL;
        if (aweme3 != null) {
            numValueOf = Integer.valueOf(aweme3.getAwemeType());
        } else {
            numValueOf = null;
        }
        C1374950lsr.LIZ(aid, numValueOf, (C1260870iur) this.LLJLIL.getValue(), C1376320lv4.LIZLLL(this.LLJJJJLIIL));
        if (str.length() != 0) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (this.LLJJIJIL.LIZIZ != 0) {
                C1376960lw6 c1376960lw6 = this.LLJL;
                if (c1376960lw6 != null) {
                    urlModel = c1376960lw6.LIZ;
                } else {
                    urlModel = null;
                }
                this.LLJJJJ = System.currentTimeMillis() - this.LLJJIJIL.LIZIZ;
                c0vsj.length();
                if (!this.LLJI && !this.LLJIJIL && (aweme = this.LLJJJIL) != null) {
                    long length = c0vsj.length();
                    Long lValueOf = Long.valueOf(this.LLJJJJ);
                    ACLCommonShare aCLCommonShare = this.LLJJL;
                    if (aCLCommonShare != null) {
                        boolValueOf = Boolean.valueOf(aCLCommonShare.getMute());
                    }
                    C1357300lQO.LIZ(length, urlModel, boolValueOf, -1, lValueOf, str, str2, "success", false, AwemeExtKt.isPrivate(aweme));
                    C1357300lQO.LIZIZ(aweme, this.LLILZLL, this.LLJJJJJIL, "short", C1357300lQO.LIZLLL(urlModel), 0, -1);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIILIIL(int i, final String str) {
        final boolean z;
        super.LJIILIIL(i, str);
        final Long lValueOf = Long.valueOf(this.LLJJJJ);
        final String str2 = this.LLJJLIIIJLLLLLLLZ;
        if (!this.LLJI && !this.LLJIJIL) {
            z = false;
        } else {
            z = true;
        }
        final Integer numValueOf = Integer.valueOf(i);
        C15O7.LIZJ(new Callable() { // from class: X.0m5I
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("ShareDownloadSuccessMonitor$Companion@c53e.monitorMuteAudioFailed$1");
                String str3 = str;
                String strLJIIIIZZ = str3 != null ? C2137908Zd.LIZJ.LJIIIIZZ(str3) : null;
                long length = new C0VSJ(str).length();
                boolean zEquals = TextUtils.equals(strLJIIIIZZ, "20");
                C2241008qG c2241008qG = new C2241008qG();
                Long l = lValueOf;
                long jLongValue = 0;
                if (l != null && l.longValue() != 0) {
                    jLongValue = length / lValueOf.longValue();
                }
                c2241008qG.LIZ.put("download_rate", Long.valueOf(jLongValue));
                c2241008qG.LIZ.put("download_duration", lValueOf);
                c2241008qG.LIZ.put("file_size", Long.valueOf(length));
                c2241008qG.LIZ.put("errorDesc", "null");
                c2241008qG.LIZ.put("errorCode", numValueOf);
                c2241008qG.LIZ.put("url", str2);
                Boolean bool = Boolean.TRUE;
                c2241008qG.LIZ.put("muteAudio", bool);
                c2241008qG.LIZ.put("needWaterMark", Boolean.valueOf(z));
                c2241008qG.LIZ.put("fileMagic", strLJIIIIZZ);
                c2241008qG.LIZ.put("isMp4", Boolean.valueOf(zEquals));
                C844470XAv.LIZ.getClass();
                C2427309fD c2427309fDLIZ = C2427309fD.LIZ(C844470XAv.LIZ());
                if (c2427309fDLIZ != null) {
                    c2241008qG.LIZ(bool, "has_remove_sd");
                    c2241008qG.LIZ(Boolean.valueOf(c2427309fDLIZ.LIZJ()), "sd_state");
                    c2241008qG.LIZJ(Long.valueOf(c2427309fDLIZ.LIZIZ), "sd_available_size");
                    c2241008qG.LIZLLL("share_dir", C2427709fH.LJIILL(C844470XAv.LIZ()));
                } else {
                    c2241008qG.LIZ(Boolean.FALSE, "has_remove_sd");
                }
                JSONObject jSONObjectLJ = c2241008qG.LJ();
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("save_video_success_rate", 3, jSONObjectLJ);
                C1C7U.LIZIZ("ShareDownloadSuccessMonitor$Companion@c53e.monitorMuteAudioFailed$1");
                return null;
            }
        });
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJII(int i, String str, String str2) throws IllegalAccessException, InstantiationException {
        long j;
        boolean z;
        Boolean boolValueOf;
        boolean zIsPrivate;
        super.LJII(i, str, str2);
        this.LLJJLIIIJLLLLLLLZ = str2;
        BaseException baseException = new BaseException(i, str);
        C1382530m55.LIZ(this.LLJJJIL, baseException, str2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1382560m58 c1382560m58 = this.LLJJIJIL;
        if (c1382560m58 != null) {
            j = c1382560m58.LIZIZ;
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(jCurrentTimeMillis - j);
        if (!this.LLJI && !this.LLJIJIL) {
            z = false;
        } else {
            z = true;
        }
        Integer numValueOf = Integer.valueOf(i);
        String errorMessage = baseException.getErrorMessage();
        ACLCommonShare aCLCommonShare = this.LLJJL;
        UrlModel urlModel = null;
        if (aCLCommonShare != null) {
            boolValueOf = Boolean.valueOf(aCLCommonShare.getMute());
        } else {
            boolValueOf = null;
        }
        C1376960lw6 c1376960lw6 = this.LLJL;
        if (c1376960lw6 != null) {
            urlModel = c1376960lw6.LIZ;
        }
        Aweme aweme = this.LLJJJIL;
        if (aweme != null) {
            zIsPrivate = AwemeExtKt.isPrivate(aweme);
        } else {
            zIsPrivate = false;
        }
        C1357300lQO.LIZ(-1L, urlModel, boolValueOf, numValueOf, lValueOf, null, str2, errorMessage, z, zIsPrivate);
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("errorCode", Integer.valueOf(i));
                c2241008qG.LIZ.put("errorDes", baseException.getErrorMessage());
                JSONObject jSONObjectLJ = c2241008qG.LJ();
                if (i == 1052 && jSONObjectLJ != null) {
                    try {
                        C844470XAv.LIZ.getClass();
                        jSONObjectLJ.putOpt("availableStorageSize", Long.valueOf(C09N1.LJ(C844470XAv.LIZ())));
                        jSONObjectLJ.putOpt("totalStorageSize", Long.valueOf(C09N1.LJI(C844470XAv.LIZ())));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("aweme_download_error_rate", 1, jSONObjectLJ);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C612410O0h.LIZIZ("aweme_movie_download_log", "", baseException.getErrorMessage(), str2);
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIILL(int i, String str, String str2) throws IllegalAccessException, InstantiationException {
        super.LJIILL(i, str, str2);
        Aweme aweme = this.LLJJJIL;
        StringBuilder sb = new StringBuilder("WaterMark:inputPath:");
        sb.append(str);
        sb.append(",outputPath:");
        sb.append(str2);
        if (aweme != null) {
            sb.append(",aweme_id:");
            sb.append(aweme.getAid());
        }
        C612410O0h.LIZIZ("aweme_movie_download_error_message", "download", sb.toString(), "");
    }
}
