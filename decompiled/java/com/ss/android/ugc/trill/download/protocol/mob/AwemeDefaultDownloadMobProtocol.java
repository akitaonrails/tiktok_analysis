package com.ss.android.ugc.trill.download.protocol.mob;

import X.AbstractC1382550m57;
import X.AbstractC21169117sn;
import X.C0SUC;
import X.C1376270luz;
import X.C1376320lv4;
import X.C1380830m2L;
import X.C1380840m2M;
import X.C1380850m2N;
import X.C1380860m2O;
import X.C1382560m58;
import X.C1382570m59;
import X.C13BV;
import X.C1554960qZC;
import X.C15O7;
import X.C20684815ws;
import X.C2188811AlT;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.provider.impl.GScope;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;
import com.ss.android.ugc.aweme.share.download.event.newet.ClientWatermarkEndEvent;
import com.ss.android.ugc.aweme.share.download.event.newet.ClientWatermarkStartEvent;
import com.ss.android.ugc.aweme.share.download.event.newet.DownloadCancelEvent;
import com.ss.android.ugc.aweme.share.download.event.newet.DownloadEndEvent;
import com.ss.android.ugc.aweme.share.download.event.newet.DownloadEvent;
import com.ss.android.ugc.aweme.share.download.event.newet.DownloadFinishEvent;
import com.ss.android.ugc.aweme.share.download.event.newet.DownloadStartEvent;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public abstract class AwemeDefaultDownloadMobProtocol<CONTEXT extends AbstractC1382550m57> extends DownloadMobProtocol<CONTEXT> {
    public String LLILLJJLI;
    public String LLILLL;
    public JSONObject LLILZ;
    public long LLIZ;
    public int LLIZLLLIL;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public Integer LLJJIII;
    public String LLJJIJI;
    public Aweme LLJJJIL;
    public long LL = -1;
    public String LLILZIL = "";
    public String LLILZLL = "";
    public String LLJ = "";
    public Pair<Boolean, List<String>> LLJJI = new Pair<>(Boolean.FALSE, C13BV.INSTANCE);
    public int LLJJIJIIJIL = 100;
    public C1382560m58 LLJJIJIL = new C1382560m58();
    public C1382570m59 LLJJJ = new C1382570m59();

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LIZJ() throws IllegalAccessException, InstantiationException {
        C1380850m2N.LIZJ(GScope.LL, Long.valueOf(System.currentTimeMillis() - this.LLIZ), C1376270luz.LIZIZ() ? "1" : CardStruct.IStatusCode.DEFAULT, null, null, null, null, 60);
        C1376320lv4.LIZ.getClass();
        C1380850m2N.LIZ(DownloadCancelEvent.class);
        C1376270luz.LIZ.getClass();
        C1376270luz.LIZJ = false;
        C1376270luz.LIZLLL = false;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LIZLLL() throws IllegalAccessException, InstantiationException {
        GScope gScope = GScope.LL;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZ;
        int i = this.LLJJIJIIJIL;
        C1380850m2N.LIZJ(gScope, Long.valueOf(jCurrentTimeMillis), null, 0, this.LLJJIII, this.LLJJIJI, Integer.valueOf(i), 2);
        C1376320lv4.LIZ.getClass();
        C1380850m2N.LIZ(DownloadFinishEvent.class);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public void LJFF() throws IllegalAccessException, InstantiationException {
        C1380850m2N.LIZJ(GScope.LL, Long.valueOf(System.currentTimeMillis() - this.LLIZ), null, 1, null, null, 0, 26);
        C1376320lv4.LIZ.getClass();
        C1380850m2N.LIZ(DownloadFinishEvent.class);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public void LJI() throws IllegalAccessException, InstantiationException {
        C1382560m58 c1382560m58 = this.LLJJIJIL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1382560m58.getClass();
        C1382560m58.LIZ(0, -1, jCurrentTimeMillis, 0L, "", false);
        ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZ("download_cancel");
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public void LJIILLIIL() throws IllegalAccessException, InstantiationException {
        GScope gScope = GScope.LL;
        C1554960qZC.LIZ(gScope, new C1380860m2O(this.LLJI, this.LLILZIL, this.LLJIJIL, true, "", -1L, -1L, 0), C1380860m2O.class, "Download");
        C1380850m2N.LIZLLL(gScope, Long.valueOf(System.currentTimeMillis()), null, null, 6);
        this.LLJJJ.getClass();
        C1380850m2N.LIZ(ClientWatermarkStartEvent.class);
        ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZ("water_mark_start");
        LJIJJ(this, "add_watermark");
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIIZILJ() throws IllegalAccessException, InstantiationException {
        C1380850m2N.LIZLLL(GScope.LL, null, Long.valueOf(System.currentTimeMillis()), 1, 1);
        this.LLJJJ.getClass();
        C1380850m2N.LIZ(ClientWatermarkEndEvent.class);
        ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZ("water_mark_success");
        LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJ() throws IllegalAccessException, InstantiationException {
        this.LLIZ = System.currentTimeMillis();
        C1376320lv4.LIZ.getClass();
        C1380850m2N.LIZ(DownloadEvent.class);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public void LJIILJJIL() {
        ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZ("water_mark_cancel");
    }

    public final void LJIJI() {
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName(this.LLILLJJLI);
        mobClickObtain.setLabelName(this.LLILLL);
        mobClickObtain.setValue(String.valueOf(System.currentTimeMillis() - this.LL));
        mobClickObtain.setJsonObject(this.LLILZ);
        C20684815ws.onEvent(mobClickObtain);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public /* bridge */ /* synthetic */ boolean LIZ(AbstractC21169117sn abstractC21169117sn) {
        LJIJ((AbstractC1382550m57) abstractC21169117sn);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public void LJIIIZ(String str) throws IllegalAccessException, InstantiationException {
        int i;
        GScope gScope = GScope.LL;
        if (!this.LLJI && !this.LLJIJIL) {
            i = 1;
        } else {
            i = 0;
        }
        C1554960qZC.LIZ(gScope, new C1380830m2L(i, "", 0L, 0L, -1L, -1, -1, -1, null, null, ""), C1380830m2L.class, "Download");
        C1382560m58 c1382560m58 = this.LLJJIJIL;
        c1382560m58.LIZ = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = this.LLIZLLLIL;
        c1382560m58.LIZIZ = jCurrentTimeMillis;
        C1380850m2N.LIZIZ(gScope, c1382560m58.LIZ, Long.valueOf(jCurrentTimeMillis), null, null, null, null, Integer.valueOf(i2), null, null, 444);
        C1380850m2N.LIZ(DownloadStartEvent.class);
        ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZ("download_start");
        LJIJJ(this, "download");
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIIJJI(String str) {
        this.LLJJIJIIJIL = 8;
        this.LLJJIII = -10001;
        this.LLJJIJI = str;
    }

    public void LJIJ(AbstractC1382550m57 abstractC1382550m57) {
        this.LL = -1L;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLIZ = 0L;
        boolean z = false;
        this.LLIZLLLIL = 0;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = 100;
        this.LLJJJIL = abstractC1382550m57.LJFF;
        this.LLJJIJIL = new C1382560m58();
        this.LLJJJ = new C1382570m59();
        this.LLJI = abstractC1382550m57.LJIIIIZZ();
        this.LLJIJIL = abstractC1382550m57.LJIIIZ();
        this.LLJILJIL = abstractC1382550m57.LJIIJ();
        this.LLJILJILJ = abstractC1382550m57.LJFF();
        this.LLJILLL = abstractC1382550m57.LJII();
        this.LLJJ = abstractC1382550m57.LJI();
        this.LLJJI = abstractC1382550m57.LIZJ();
        this.LLILZLL = abstractC1382550m57.LJI;
        String str = abstractC1382550m57.LJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        this.LLILZIL = str;
        abstractC1382550m57.LJ();
        this.LLJ = abstractC1382550m57.LIZLLL();
        GScope gScope = GScope.LL;
        String fromGroupId = C0SUC.LIZ(abstractC1382550m57.LIZ).getFromGroupId();
        if (fromGroupId == null) {
            fromGroupId = "";
        }
        String newsId = C0SUC.LIZ(abstractC1382550m57.LIZ).getNewsId();
        if (newsId != null) {
            str2 = newsId;
        }
        HashMap<String, String> inboxLogExtra = C0SUC.LIZ(abstractC1382550m57.LIZ).getInboxLogExtra();
        String str3 = this.LLJ;
        if (this.LLJILJIL && !this.LLJILJILJ && !this.LLJILLL && !this.LLJJ && ((List) this.LLJJI.second).isEmpty()) {
            z = true;
        }
        C1554960qZC.LIZ(gScope, new C1380840m2M(fromGroupId, str2, inboxLogExtra, str3, z, CardStruct.IStatusCode.DEFAULT, -1L, -1, null, null, 100, ""), C1380840m2M.class, "Download");
    }

    public static void LJIJJ(AwemeDefaultDownloadMobProtocol awemeDefaultDownloadMobProtocol, String str) {
        awemeDefaultDownloadMobProtocol.getClass();
        awemeDefaultDownloadMobProtocol.LL = System.currentTimeMillis();
        awemeDefaultDownloadMobProtocol.LLILLJJLI = "download_time";
        awemeDefaultDownloadMobProtocol.LLILLL = str;
        awemeDefaultDownloadMobProtocol.LLILZ = null;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public void LJIIJ(final String str, String str2) {
        this.LLJJIJIL.LIZ = str2;
        if (str.length() != 0) {
            if (this.LLJJIJIL.LIZIZ != 0) {
                ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZ("download_success");
                final C1382560m58 c1382560m58 = this.LLJJIJIL;
                c1382560m58.getClass();
                final long jCurrentTimeMillis = System.currentTimeMillis();
                final long j = jCurrentTimeMillis - c1382560m58.LIZIZ;
                C15O7.LIZJ(new Callable() { // from class: X.0m56
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws IllegalAccessException, InstantiationException {
                        C1C7U.LIZ("VideoDownloadEvent@c6bc.mobDownloadEndSuccess$1");
                        String str3 = str;
                        String strLJIIIIZZ = str3 != null ? C2137908Zd.LIZJ.LJIIIIZZ(str3) : null;
                        long length = new C0VSJ(str).length();
                        C1380850m2N.LIZIZ(GScope.LL, null, null, Long.valueOf(jCurrentTimeMillis), Long.valueOf(length), 1, 0, null, null, null, 451);
                        C1380850m2N.LIZ(DownloadEndEvent.class);
                        boolean zEquals = TextUtils.equals(strLJIIIIZZ, "20");
                        C2241008qG c2241008qG = new C2241008qG();
                        long j2 = j;
                        C1382560m58 c1382560m582 = c1382560m58;
                        c2241008qG.LIZJ(Long.valueOf(j2 != 0 ? length / j2 : 0L), "Download_Rate");
                        c2241008qG.LIZJ(Long.valueOf(j2), "Download_duration");
                        c2241008qG.LIZJ(Long.valueOf(length), "file_size");
                        c2241008qG.LIZLLL("errorDesc", "success");
                        c2241008qG.LIZIZ(-1, "errorCode");
                        c2241008qG.LIZLLL("url", c1382560m582.LIZ);
                        c2241008qG.LIZ(Boolean.valueOf(zEquals), "isMp4");
                        JSONObject jSONObjectLJ = c2241008qG.LJ();
                        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                        C793770VBv.LJIIJJI("aweme_download_error_rate", 0, jSONObjectLJ);
                        C1C7U.LIZIZ("VideoDownloadEvent@c6bc.mobDownloadEndSuccess$1");
                        return null;
                    }
                });
            }
            LJIJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public void LJIILIIL(int i, String str) {
        this.LLJJIJIIJIL = 7;
        this.LLJJIII = Integer.valueOf(i);
        this.LLJJIJI = "mute_audio";
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public void LJII(int i, String str, String str2) throws IllegalAccessException, InstantiationException {
        Aweme aweme;
        this.LLJJIJIL.LIZ = str2;
        BaseException baseException = new BaseException(i, str);
        C1382560m58 c1382560m58 = this.LLJJIJIL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String errorMessage = baseException.getErrorMessage();
        c1382560m58.getClass();
        C1382560m58.LIZ(i, 0, jCurrentTimeMillis, -1L, errorMessage, true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append("");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (i > 0 && (aweme = this.LLJJJIL) != null && AwemeExtKt.isPrivate(aweme)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append('P');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).event("download_error", strLIZIZ);
        this.LLJJIJIIJIL = 1;
        this.LLJJIII = Integer.valueOf(i);
        this.LLJJIJI = str;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIIIIZZ(int i, int i2, String str) throws IllegalAccessException, InstantiationException {
        this.LLIZLLLIL = i;
        C1382560m58 c1382560m58 = this.LLJJIJIL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1382560m58.getClass();
        C1382560m58.LIZ(i2, 0, jCurrentTimeMillis, -1L, str, false);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public void LJIILL(int i, String str, String str2) throws IllegalAccessException, InstantiationException {
        C1380850m2N.LIZLLL(GScope.LL, null, Long.valueOf(System.currentTimeMillis()), 0, 1);
        this.LLJJJ.getClass();
        C1380850m2N.LIZ(ClientWatermarkEndEvent.class);
        ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZ("water_mark_error");
        this.LLJJIJIIJIL = 2;
        this.LLJJIII = Integer.valueOf(i);
        this.LLJJIJI = "water_mark";
    }
}
