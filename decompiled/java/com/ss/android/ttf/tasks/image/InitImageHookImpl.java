package com.ss.android.ttf.tasks.image;

import X.C04W3;
import X.C080U;
import X.C0B77;
import X.C0BEC;
import X.C0C6X;
import X.C0X2E;
import X.C0X2F;
import X.C0YS1;
import X.C1494630ozt;
import X.C1494850p0F;
import X.C1BWL;
import X.C2206241BWk;
import X.C2213981Bky;
import X.C2222781BzA;
import X.C2258961DbK;
import X.C2518509tv;
import X.C282420B5c;
import X.C292070Bcb;
import X.C302260Bt2;
import X.C788100Uvo;
import X.C794240VDq;
import X.C828420Wee;
import X.C828590Wev;
import X.InterfaceC1329940kiG;
import X.InterfaceC1334000koo;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.image.experiment.ImageCropConfig;
import com.ss.android.ugc.aweme.offline.dnsopt.IDnsOptDebugConfigService;
import com.ss.android.ugc.aweme.offline.ttmock.ITtmockService;
import com.ss.android.ugc.aweme.photo.PhotoStrategyService;
import com.tiktok.ttf.image.task.IInitImageHook;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class InitImageHookImpl implements IInitImageHook {
    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final boolean LIZIZ() {
        if (C788100Uvo.LIZ) {
            C0X2F c0x2f = C0X2F.LJI;
            return false;
        }
        C0X2E c0x2e = C0X2E.LIZJ;
        return false;
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final InterfaceC1329940kiG LIZJ() {
        return new InterfaceC1329940kiG() { // from class: X.0klt
            public volatile C1332160klq LIZ;

            @Override // X.InterfaceC1329940kiG
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC1329940kiG
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1329940kiG
            public final C1332160klq LIZJ() {
                if (this.LIZ == null) {
                    synchronized (this) {
                        try {
                            if (this.LIZ == null) {
                                C1339130kx5 c1339130kx5 = C1332200klu.LIZ;
                                File fileLJIILJJIL = C2427709fH.LJIILJJIL();
                                long jLIZ = C1336210ksN.LIZ() ? C1335260kqq.LIZ(20971520L, EnumC1335420kr6.CACHE, EnumC1335310kqv.EXTREME_LOW) : 20971520L;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(C1330870kjl.LIZLLL);
                                C844470XAv.LIZ.getClass();
                                C1332170klr c1332170klr = new C1332170klr(C844470XAv.LIZ());
                                c1332170klr.LJIJ = true;
                                c1332170klr.LJIILJJIL = true;
                                c1332170klr.LJII = Bitmap.Config.RGB_565;
                                c1332170klr.LJIIIIZZ = 1;
                                c1332170klr.LJFF = 5;
                                c1332170klr.LJIILIIL = new C1331940klU();
                                c1332170klr.LIZJ = fileLJIILJJIL;
                                c1332170klr.LIZLLL = jLIZ;
                                c1332170klr.LIZIZ = c1339130kx5;
                                c1332170klr.LJIL = false;
                                c1332170klr.LJIIJJI = true;
                                c1332170klr.LJI = new C1334320kpK();
                                c1332170klr.LJIJI = arrayList;
                                c1332170klr.LJIIIZ = true;
                                c1332170klr.LJIIJ = false;
                                c1332170klr.LJIIL = new InterfaceC658750Psf() { // from class: X.0kpB
                                    @Override // X.InterfaceC658750Psf
                                    public final /* synthetic */ void Ck(JSONObject jSONObject) {
                                    }

                                    @Override // X.InterfaceC658750Psf
                                    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
                                        ImageCropConfig imageCropConfig;
                                        int iOptInt;
                                        int iOptInt2;
                                        getClass();
                                        if (z || (40 != (iOptInt2 = jSONObject.optInt("err_code")) && 41 != iOptInt2)) {
                                            C1336670kt7.LIZ.LIZ(jSONObject, z);
                                        }
                                        boolean z2 = false;
                                        if (C791900V4q.LIZ("image_monitor_v2") || (C1330720kjW.LIZ() && C1330720kjW.LIZIZ())) {
                                            if (!z && (40 == (iOptInt = jSONObject.optInt("err_code")) || 41 == iOptInt)) {
                                                return;
                                            }
                                            String str2 = null;
                                            try {
                                                C0C64.LJIILLIIL().getClass();
                                                imageCropConfig = (ImageCropConfig) C0C64.LJJI(ImageCropConfig.class, "image_crop_config_v3", true);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                imageCropConfig = null;
                                            }
                                            if (imageCropConfig != null) {
                                                z2 = true;
                                            }
                                            try {
                                                jSONObject.put("url_convert", z2);
                                            } catch (JSONException e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                            if (!C289130BUx.LIZ()) {
                                                String strOptString = jSONObject.optString("uri");
                                                if (!TextUtils.isEmpty(strOptString)) {
                                                    str2 = (String) ((HashMap) C1332270km1.LIZ).remove(strOptString);
                                                }
                                                if (!TextUtils.isEmpty(str2)) {
                                                    try {
                                                        jSONObject.put("err_code", "42");
                                                        jSONObject.put("err_desc", str2);
                                                    } catch (JSONException e2) {
                                                        TryCatchGuardChecker.doCheck(e2);
                                                    }
                                                }
                                            }
                                            C1334220kpA.LIZ.getClass();
                                            C1334220kpA.LIZ(jSONObject);
                                        }
                                    }
                                };
                                c1332170klr.LJIILL = true;
                                c1332170klr.LJIILLIIL = true;
                                c1332170klr.LJIIZILJ = C1EAX.LIZ;
                                if (C0C64.LJIILLIIL().LJIIIZ(31744, "tt_image_oom_opt_v2", true, false)) {
                                    c1332170klr.LJJI = true;
                                }
                                if (Build.VERSION.SDK_INT >= 28) {
                                    c1332170klr.LJIJJLI = true;
                                }
                                c1332170klr.LJJIFFI = new C437000HBq();
                                this.LIZ = new C1332160klq(c1332170klr);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                return this.LIZ;
            }

            @Override // X.InterfaceC1329940kiG
            public final Context getContext() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LIZ();
            }

            @Override // X.InterfaceC1329940kiG
            public final int LIZIZ() {
                return 5;
            }
        };
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final int LJ() {
        if (C788100Uvo.LIZ) {
            C0X2F c0x2f = C0X2F.LJI;
            return -1;
        }
        C0X2E c0x2e = C0X2E.LIZJ;
        return -1;
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final Boolean LJI() {
        IDnsOptDebugConfigService iDnsOptDebugConfigService = (IDnsOptDebugConfigService) PluggableExtentionKt.pluggableSpi$default(IDnsOptDebugConfigService.class, false, false, false, 14, null);
        if (iDnsOptDebugConfigService == null) {
            return null;
        }
        iDnsOptDebugConfigService.getStatus();
        return Boolean.FALSE;
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final boolean LJII() {
        return ((Boolean) C282420B5c.LIZ.getValue()).booleanValue();
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final boolean LJIIIIZZ() {
        ITtmockService iTtmockService = (ITtmockService) PluggableExtentionKt.pluggableSpi$default(ITtmockService.class, false, false, false, 14, null);
        return iTtmockService != null && iTtmockService.isBlackMode();
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final boolean LJIIIZ() {
        return ((Boolean) C2258961DbK.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final InterfaceC1334000koo LJIIJ() {
        if (!C2518509tv.LIZ) {
            return null;
        }
        C2222781BzA c2222781BzA = new C2222781BzA();
        if (!((Boolean) C0B77.LIZ.getValue()).booleanValue()) {
            c2222781BzA.LIZIZ = new C1494630ozt();
        }
        return c2222781BzA;
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final boolean LJIIJJI() {
        C302260Bt2.LIZ.getClass();
        return ((Number) C302260Bt2.LIZIZ.getValue()).intValue() > 0;
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final boolean LJIILIIL() {
        return ((Number) C292070Bcb.LIZ.getValue()).intValue() > 0;
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final float LJIILJJIL() {
        return ((Number) C0C6X.LIZ.getValue()).floatValue();
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final C080U LJIILLIIL() {
        return new C080U("x-tt-dataflow-id", "671089153");
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final int getNetworkType() {
        return NetworkUtils.getNetworkType(C2213981Bky.LIZIZ.getApplicationContext()).getValue();
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final String getTTMockFakeImgUrl() {
        String tTMockFakeImgUrl;
        ITtmockService iTtmockService = (ITtmockService) PluggableExtentionKt.pluggableSpi$default(ITtmockService.class, false, false, false, 14, null);
        return (iTtmockService == null || (tTMockFakeImgUrl = iTtmockService.getTTMockFakeImgUrl()) == null) ? "" : tTMockFakeImgUrl;
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final boolean LJFF() {
        return C0BEC.LJFF(C1BWL.LIZ());
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final boolean LJIIL() {
        return !C2206241BWk.LIZ();
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final boolean LJIIZILJ() {
        return C2206241BWk.LIZ();
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final void LIZ(JSONObject jSONObject) {
        C794240VDq.LIZIZ("aweme_image_api", "", jSONObject);
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final void LJIJ(String str) {
        C0YS1.LIZJ("ImageEncrypt", str);
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final void monitorCommonLog(String str, JSONObject jSONObject) {
        C794240VDq.LIZJ(str, jSONObject);
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final C828420Wee LJIILL(Boolean bool, String str, Map map) {
        return C828590Wev.LIZIZ(bool, str, "Fresco", "com.ss.android.ugc.aweme.experiment.TTNetImageFetcher#fetchData", map);
    }

    @Override // com.tiktok.ttf.image.task.IInitImageHook
    public final void LIZLLL(Uri uri, long j, boolean z, C1494850p0F c1494850p0F) {
        ((PhotoStrategyService) C04W3.LIZ.getValue()).LIZLLL(uri, j, z, c1494850p0F);
    }
}
