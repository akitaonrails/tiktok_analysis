package com.ss.android.ugc.trill.download.protocol.mob;

import X.AbstractC1382550m57;
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
import X.C1379790m0f;
import X.C1379830m0j;
import X.C1382530m55;
import X.C13LE;
import X.C19719912Dl;
import X.C2241008qG;
import X.C452501pT;
import X.C612410O0h;
import X.C793770VBv;
import X.C794240VDq;
import X.C844470XAv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class StoryPhotoDownloadMobProtocol extends AwemeDefaultDownloadMobProtocol<C1379830m0j> {
    public long LLJJJJ;
    public UrlModel LLJJLIIIJLLLLLLLZ;
    public String LLJJJJJIL = "";
    public int LLJJJJLIIL = -1;
    public String LLJJL = "";
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(423));
    public final C19719912Dl LLJLIL = C13LE.LIZ(C1379830m0j.class);

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJFF() throws IllegalAccessException, InstantiationException {
        super.LJFF();
        if (Intrinsics.LJFF(this.LLILZLL, "long_press_download")) {
            C1379790m0f.LIZIZ(0, this.LLJJJIL, "mask", this.LLJJL);
        } else {
            C1379790m0f.LIZIZ(0, this.LLJJJIL, this.LLJJJJJIL, this.LLJJL);
        }
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJI() throws IllegalAccessException, InstantiationException {
        super.LJI();
        C1376270luz.LIZ.getClass();
        C1376270luz.LJ = true;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final C19719912Dl LJIIL() {
        return this.LLJLIL;
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final boolean LIZ(AbstractC21169117sn abstractC21169117sn) {
        C1379830m0j c1379830m0j = (C1379830m0j) abstractC21169117sn;
        super.LJIJ(c1379830m0j);
        this.LLJJJJ = 0L;
        this.LLJJL = "";
        this.LLJJJJJIL = c1379830m0j.LJIIL;
        this.LLJJJJLIIL = c1379830m0j.LJIIJJI;
        this.LLJJLIIIJLLLLLLLZ = (UrlModel) c1379830m0j.LJIIZILJ.getValue();
        return true;
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIIIZ(String str) throws IllegalAccessException, InstantiationException {
        super.LJIIIZ(str);
        this.LLJJL = str;
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol
    public final void LJIJ(AbstractC1382550m57 abstractC1382550m57) {
        C1379830m0j c1379830m0j = (C1379830m0j) abstractC1382550m57;
        super.LJIJ(c1379830m0j);
        this.LLJJJJ = 0L;
        this.LLJJL = "";
        this.LLJJJJJIL = c1379830m0j.LJIIL;
        this.LLJJJJLIIL = c1379830m0j.LJIIJJI;
        this.LLJJLIIIJLLLLLLLZ = (UrlModel) c1379830m0j.LJIIZILJ.getValue();
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIIJ(String str, String str2) {
        String aid;
        super.LJIIJ(str, str2);
        this.LLJJL = str2;
        Aweme aweme = this.LLJJJIL;
        Integer numValueOf = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme aweme2 = this.LLJJJIL;
        if (aweme2 != null) {
            numValueOf = Integer.valueOf(aweme2.getAwemeType());
        }
        C1374950lsr.LIZ(aid, numValueOf, (C1260870iur) this.LLJL.getValue(), C1376320lv4.LIZLLL(this.LLJJJJLIIL));
        if (str.length() != 0) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (this.LLJJIJIL.LIZIZ != 0) {
                this.LLJJJJ = System.currentTimeMillis() - this.LLJJIJIL.LIZIZ;
                c0vsj.length();
                Aweme aweme3 = this.LLJJJIL;
                if (aweme3 != null) {
                    C1357300lQO.LIZ(c0vsj.length(), this.LLJJLIIIJLLLLLLLZ, Boolean.FALSE, -1, Long.valueOf(this.LLJJJJ), str, str2, "success", false, AwemeExtKt.isPrivate(aweme3));
                    C1357300lQO.LIZIZ(aweme3, this.LLILZLL, this.LLJJJJJIL, "short", C1357300lQO.LIZLLL(this.LLJJLIIIJLLLLLLLZ), 0, -1);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.trill.download.protocol.mob.AwemeDefaultDownloadMobProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJII(int i, String str, String str2) throws IllegalAccessException, InstantiationException {
        boolean zIsPrivate;
        super.LJII(i, str, str2);
        this.LLJJL = str2;
        BaseException baseException = new BaseException(i, str);
        C1382530m55.LIZ(this.LLJJJIL, baseException, str2);
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - this.LLJJIJIL.LIZIZ);
        Integer numValueOf = Integer.valueOf(i);
        String errorMessage = baseException.getErrorMessage();
        Boolean bool = Boolean.FALSE;
        UrlModel urlModel = this.LLJJLIIIJLLLLLLLZ;
        Aweme aweme = this.LLJJJIL;
        if (aweme != null) {
            zIsPrivate = AwemeExtKt.isPrivate(aweme);
        } else {
            zIsPrivate = false;
        }
        C1357300lQO.LIZ(-1L, urlModel, bool, numValueOf, lValueOf, null, str2, errorMessage, false, zIsPrivate);
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("errorCode", Integer.valueOf(i));
                c2241008qG.LIZ.put("errorDes", baseException.getErrorMessage());
                JSONObject jSONObjectLJ = c2241008qG.LJ();
                if (i == 1052) {
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
}
