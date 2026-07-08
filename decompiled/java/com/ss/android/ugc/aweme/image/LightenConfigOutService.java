package com.ss.android.ugc.aweme.image;

import X.AbstractC1334330kpL;
import X.C00V2;
import X.C01GW;
import X.C06TB;
import X.C076C;
import X.C0AKL;
import X.C0AL8;
import X.C0AO2;
import X.C0ATR;
import X.C0C1X;
import X.C0C64;
import X.C1199304md;
import X.C1326200kcE;
import X.C1328730kgJ;
import X.C1330790kjd;
import X.C1330870kjl;
import X.C1331940klU;
import X.C1332140klo;
import X.C1332160klq;
import X.C1332200klu;
import X.C1334320kpK;
import X.C1335100kqa;
import X.C1335110kqb;
import X.C1335140kqe;
import X.C1335160kqg;
import X.C1335180kqi;
import X.C1335190kqj;
import X.C1335240kqo;
import X.C1335260kqq;
import X.C1336210ksN;
import X.C1607450rvr;
import X.C19719612Di;
import X.C1EAX;
import X.C2427709fH;
import X.C260840AKc;
import X.C278940AwW;
import X.C281120B0c;
import X.C286650BLj;
import X.C286860BMe;
import X.C287740BPo;
import X.C292010BcV;
import X.C292030BcX;
import X.C292050BcZ;
import X.C295250Bhj;
import X.C297930Bm3;
import X.C302000Bsc;
import X.C304680Bww;
import X.C306260BzU;
import X.C306270BzV;
import X.C437000HBq;
import X.C798220VSy;
import X.C844470XAv;
import X.EnumC1335310kqv;
import X.EnumC1335420kr6;
import X.InterfaceC1330810kjf;
import X.InterfaceC1331200kkI;
import X.InterfaceC1332280km2;
import X.InterfaceC1333840koY;
import X.InterfaceC1334020koq;
import X.InterfaceC1334030kor;
import X.InterfaceC1335580krM;
import X.InterfaceC658750Psf;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.librarian.Librarian;
import com.bytedance.lighten.core.config.ILightenConfigOutService;
import com.bytedance.lighten.core.config.SRConfig;
import com.bytedance.lighten.core.config.SharpConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.experiment.IMImageCacheSizeSetting;
import com.ss.android.ugc.aweme.image.experiment.BigImgMemoryCacheConfig;
import com.ss.android.ugc.aweme.image.experiment.ImageCropConfig;
import com.ss.android.ugc.aweme.image.experiment.ImageMemoryCacheConfig;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.performanceopt.experiment.feed.BitmapMemoryCacheOptData;
import com.ss.android.ugc.aweme.web.experiment.IABLoadingFormatConfigExp;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class LightenConfigOutService implements ILightenConfigOutService {
    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Integer LIZIZ() {
        return 5;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final void LJ() {
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Integer LJJJJLI() {
        return 1;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final void LJJJJLL() {
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final void LJJJJZ() {
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final void LJJJLL() {
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final void isLocalTest() {
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Long LIZJ() {
        return Long.valueOf(((BigImgMemoryCacheConfig) C1335140kqe.LIZIZ.getValue()).bigImgSizeLimit * 1024);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LIZLLL() {
        return ((Number) C0AO2.LIZ.getValue()).intValue() > 0;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final InterfaceC1331200kkI LJFF() {
        return new InterfaceC1331200kkI() { // from class: X.0kqn
            @Override // X.InterfaceC1331200kkI
            public final void loadLibrary(String str) {
                Librarian.LJFF(str);
            }
        };
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Long LJII() {
        C01GW c01gw = C1335160kqg.LIZIZ;
        if (((ImageMemoryCacheConfig) c01gw.getValue()).enableMemoryProportion) {
            C844470XAv.LIZ.getClass();
            return Long.valueOf(C1332140klo.LIZ(((ImageMemoryCacheConfig) c01gw.getValue()).bitmapMemoryProportion, C844470XAv.LIZ()));
        }
        C844470XAv.LIZ.getClass();
        return Long.valueOf(C1332140klo.LIZIZ(((Number) C292030BcX.LIZ.getValue()).intValue(), C844470XAv.LIZ()));
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final String[] LJIIJJI() {
        ArrayList arrayList = new ArrayList();
        C19719612Di.LJJII(arrayList, C1EAX.LIZ);
        if (C287740BPo.LIZJ) {
            arrayList.addAll(C287740BPo.LIZ);
        }
        if (((Boolean) C286860BMe.LIZIZ.getValue()).booleanValue()) {
            arrayList.addAll(C286860BMe.LIZ);
        }
        arrayList.addAll(C00V2.LIZIZ);
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJIILIIL() {
        return ((BigImgMemoryCacheConfig) C1335140kqe.LIZIZ.getValue()).enableBigImgCache;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final SRConfig LJIILJJIL() {
        return (SRConfig) C1335100kqa.LIZIZ.getValue();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Long LJIILL() {
        long jIntValue = ((Number) C260840AKc.LIZ.getValue()).intValue() != 0 ? ((Number) r1.getValue()).intValue() : 20971520L;
        if (C1336210ksN.LIZ()) {
            jIntValue = C1335260kqq.LIZ(20971520L, EnumC1335420kr6.CACHE, EnumC1335310kqv.EXTREME_LOW);
        }
        return Long.valueOf(jIntValue);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJIIZILJ() {
        return Build.VERSION.SDK_INT >= 28 ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final String LJIJ() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ().getPackageName();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJIJJ() {
        return Boolean.valueOf(((Number) C076C.LIZ.getValue()).intValue() > 0);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final AbstractC1334330kpL LJIL() {
        return new C1334320kpK();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Map<String, Long> LJJ() {
        Pair pair;
        HashMap map = new HashMap();
        if (C295250Bhj.LIZ()) {
            map.put("profile_post_img", 41943040L);
        }
        map.put("qrcode_cache_img", 2097152L);
        IMImageCacheSizeSetting.LIZ.getClass();
        Map<String, Long> map2 = ((IMImageCacheSizeSetting.IMImageCacheSizeConfig) IMImageCacheSizeSetting.LIZJ.getValue()).cacheSizeMap;
        C06TB[] c06tbArrValues = C06TB.values();
        ArrayList<Pair> arrayList = new ArrayList(c06tbArrValues.length);
        for (C06TB c06tb : c06tbArrValues) {
            long jLIZ = C1326200kcE.LIZ.LIZ(c06tb.getSpace());
            if (jLIZ > 0) {
                pair = new Pair(c06tb.getSpace(), Long.valueOf(jLIZ));
            } else {
                String space = c06tb.getSpace();
                Long l = map2.get(c06tb.getSpace());
                pair = new Pair(space, Long.valueOf(l != null ? l.longValue() : 536870912L));
            }
            arrayList.add(pair);
        }
        for (Pair pair2 : arrayList) {
            map.put(pair2.getFirst(), pair2.getSecond());
        }
        if (C297930Bm3.LIZ()) {
            map.put("tools_default", Long.valueOf(((Number) C0ATR.LIZ.getValue()).longValue()));
        }
        map.put("coin_bottom_tab", 102400L);
        if (C0C1X.LIZ.enable) {
            map.put("explore_cache", 1048576L);
        }
        if (C1335190kqj.LIZIZ()) {
            map.put("photomode_image_cache_v2", Long.valueOf(((long) ((C1336210ksN.LIZLLL() == EnumC1335310kqv.EXTREME_LOW || C1336210ksN.LIZLLL() == EnumC1335310kqv.ULTRA_LOW || C1336210ksN.LIZLLL() == EnumC1335310kqv.LOW) ? C1335190kqj.LIZ().lowStorageCacheSize : C1335190kqj.LIZ().customCacheSize)) * 1048576));
            Keva.getRepo("photomode_image_repo_v2").storeBoolean("has_used_photomode_disk", true);
        }
        if (C1335180kqi.LIZLLL()) {
            map.put("explore_feed_image_cache", Long.valueOf(((long) ((C1336210ksN.LIZLLL() == EnumC1335310kqv.EXTREME_LOW || C1336210ksN.LIZLLL() == EnumC1335310kqv.ULTRA_LOW || C1336210ksN.LIZLLL() == EnumC1335310kqv.LOW) ? C1335180kqi.LIZJ().lowStorageCacheSize : C1335180kqi.LIZJ().customCacheSize)) * 1048576));
            Keva.getRepo("explore_feed_image_repo").storeBoolean("has_used_explore_feed_image_disk", true);
        }
        if (((Boolean) C286650BLj.LIZ.getValue()).booleanValue()) {
            map.put("inbox_img_cache", Long.valueOf(((Number) C0AL8.LIZ.getValue()).longValue()));
        }
        if (C302000Bsc.LIZ()) {
            map.put("search_cache", Long.valueOf(((Number) C798220VSy.LIZ.getValue()).longValue()));
        }
        String str = IABLoadingFormatConfigExp.LIZLLL;
        if (!TextUtils.isEmpty(str)) {
            map.put(str, Long.valueOf(IABLoadingFormatConfigExp.LJ));
        }
        if (C1607450rvr.LIZ().addAvtarImageDisk) {
            map.put("live_avatar_cache", Long.valueOf(((long) C1607450rvr.LIZ().avatarImageCacheSize) * 1048576));
        }
        if (((Number) C281120B0c.LIZ.getValue()).intValue() != 0) {
            map.put("story_cache", Long.valueOf(((Number) C306270BzV.LIZ.getValue()).longValue()));
        }
        map.put("story_skylight", Long.valueOf(((Number) C306260BzU.LIZ.getValue()).longValue()));
        C1199304md.LIZ.getClass();
        if (C1199304md.LIZJ.getValue().booleanValue()) {
            map.put("ecom_main_cache", Long.valueOf(C1199304md.LIZ()));
            map.put("ecom_operation_cache", Long.valueOf(C1199304md.LIZIZ()));
            Keva.getRepo("ecom_image_repo").storeBoolean("has_used_ecom_disk", true);
        }
        if (C1199304md.LIZIZ.mainSafeCheck || (C1335190kqj.LIZ().enable && C1335190kqj.LIZ().enableFallBackMainDisk)) {
            C1328730kgJ.LJIJ = true;
        }
        map.put("tab_icon_cache", 10485760L);
        return map;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Long LJJII() {
        C844470XAv.LIZ.getClass();
        return Long.valueOf(C1332140klo.LIZIZ(((Number) C292010BcV.LIZ.getValue()).intValue(), C844470XAv.LIZ()));
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJIII() {
        return Boolean.valueOf(((Boolean) C278940AwW.LIZ.getValue()).booleanValue());
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Long LJJIIJZLJL() {
        C844470XAv.LIZ.getClass();
        return Long.valueOf(C1332140klo.LIZ(((BigImgMemoryCacheConfig) C1335140kqe.LIZIZ.getValue()).bigImgCacheProportion, C844470XAv.LIZ()));
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final InterfaceC1330810kjf LJJIIZI() {
        final BitmapMemoryCacheOptData bitmapMemoryCacheOptData = (BitmapMemoryCacheOptData) C1335240kqo.LIZIZ.getValue();
        return new InterfaceC1330810kjf() { // from class: X.0kqd
            @Override // X.InterfaceC1330810kjf
            public final int LIZ() {
                return bitmapMemoryCacheOptData.maxOptEntrySize;
            }

            @Override // X.InterfaceC1330810kjf
            public final boolean enable() {
                return bitmapMemoryCacheOptData.enable;
            }
        };
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final InterfaceC658750Psf LJJIJIIJIL() {
        return new InterfaceC658750Psf() { // from class: X.0kpC
            @Override // X.InterfaceC658750Psf
            public final /* synthetic */ void Ck(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC658750Psf
            public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
                ImageCropConfig imageCropConfig;
                int iOptInt;
                int iOptInt2;
                this.LL.getClass();
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
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final InterfaceC1335580krM LJJIJIL() {
        return new C1331940klU();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final InterfaceC1334030kor LJJIJL() {
        return new InterfaceC1334030kor() { // from class: X.0kql
            @Override // X.InterfaceC1334030kor
            public final void LIZ() {
            }
        };
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJJIJLIJ() {
        return ((Boolean) C0AKL.LIZ.getValue()).booleanValue();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final List<C1330790kjd> LJJIL() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1330870kjl.LIZLLL);
        return arrayList;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final InterfaceC1332280km2 LJJIZ() {
        return new InterfaceC1332280km2() { // from class: X.0kqc
            @Override // X.InterfaceC1332280km2
            public final long LIZIZ() {
                return ((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ();
            }
        };
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Long LJJJIL() {
        C01GW c01gw = C1335160kqg.LIZIZ;
        if (!((ImageMemoryCacheConfig) c01gw.getValue()).enableMemoryProportion) {
            C844470XAv.LIZ.getClass();
            return Long.valueOf(C1332140klo.LIZIZ(((Number) C292050BcZ.LIZ.getValue()).intValue(), C844470XAv.LIZ()));
        }
        float f = ((ImageMemoryCacheConfig) c01gw.getValue()).encodeMemoryProportion;
        int i = C1332140klo.LIZ;
        long jMin = Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return Long.valueOf((long) ((jMin < 16777216 ? 1048576L : jMin < 33554432 ? 2097152L : 4194304L) * f));
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final C437000HBq LJJJJ() {
        return new C437000HBq();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final SharpConfig LJJJJJL() {
        return (SharpConfig) C1335110kqb.LIZIZ.getValue();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJJJL() {
        return Boolean.valueOf(((Boolean) C304680Bww.LIZJ.getValue()).booleanValue());
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJJLZIJ() {
        return Boolean.valueOf(((Boolean) C304680Bww.LIZIZ.getValue()).booleanValue());
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Context getContext() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final InterfaceC1333840koY LJI() {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("tt_lighten_enable_auto_biz_tag", true)) {
            return new InterfaceC1333840koY() { // from class: X.0kqm
                @Override // X.InterfaceC1333840koY
                public final String LIZ() {
                    return C2211631BhB.LJII();
                }
            };
        }
        return null;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final C1332160klq LJIIIIZZ() {
        return C1332160klq.LJIIIZ();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJIIIZ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("lighten_fix_empty_builder_memory_leak", true);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final int LJIIL() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_bitmap_pool_max_pool_size", true);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJIILLIIL() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("tt_lighten_downgrade_cancellable", false);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final File LJIJJLI() {
        return C2427709fH.LJIILJJIL();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJJIIJ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("lighten_attach_bug_fix_switch", true);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJJIIZ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("tt_lighten_downgrade_async", false);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJJIJ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "tt_image_oom_opt_v2", true, false);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJJJJIZL() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("lighten_fix_bitmap_memory_anr_switch", false);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJJJJJ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("tt_lighten_enable_fix_invalid_request", true);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Long LJJJZ() {
        return Long.valueOf(C1336210ksN.LIZ() ? C1335260kqq.LIZ(20971520L, EnumC1335420kr6.CACHE, EnumC1335310kqv.EXTREME_LOW) : 0L);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJJL() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("tt_lighten_url_expire_check", true);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJJLI() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("tt_lighten_enable_force_run_in_sub_thread", true);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Bitmap.Config LIZ() {
        return Bitmap.Config.RGB_565;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final InterfaceC1334020koq LJIIJ() {
        return C1332200klu.LIZ;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJIJI() {
        return Boolean.TRUE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJI() {
        return Boolean.TRUE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJIFFI() {
        return Boolean.TRUE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJIJIIJI() {
        return Boolean.TRUE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJJ() {
        return Boolean.FALSE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJJI() {
        return Boolean.FALSE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJJJI() {
        return Boolean.TRUE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJJJZI() {
        return Boolean.TRUE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJJLIIL() {
        return Boolean.TRUE;
    }
}
