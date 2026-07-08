package com.ss.android.ugc.aweme.prop.impl;

import X.AbstractC1216410hl9;
import X.AbstractC1255880imo;
import X.C01GW;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0CHQ;
import X.C0XPD;
import X.C116D;
import X.C116F;
import X.C116L;
import X.C116N;
import X.C11NZ;
import X.C11U6;
import X.C1227904rF;
import X.C123100dR;
import X.C1255920ims;
import X.C135Q;
import X.C1398390mUf;
import X.C13BV;
import X.C15438062q;
import X.C1606590ruT;
import X.C1630480sX0;
import X.C189200o6;
import X.C19221910Hx;
import X.C19263110Xt;
import X.C19574811iE;
import X.C2189821An6;
import X.C23260099m;
import X.C297540BlQ;
import X.C452501pT;
import X.C786410Ut5;
import X.C799570VYd;
import X.C823050WQl;
import X.C844470XAv;
import X.InterfaceC1364105Vn;
import X.InterfaceC1399590mWb;
import X.InterfaceC19340210lU;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.commercialize.sticker.service.CommerceLockStickerServiceImpl;
import com.ss.android.ugc.aweme.experiment.EffectDetailVideoListExperiment;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.prop.fragment.EffectDiscoverAwemeListFragment;
import com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectFilterReq;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
public final class PropReuseServiceImpl implements IPropReuseService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C116N());

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final C116F LIZLLL() {
        return new C116F();
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final Class<? extends Activity> LJI() {
        return StickerPropDetailActicity.class;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final boolean LIZ(Activity activity) {
        ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
        if (iCreativeSAAService == null || true != iCreativeSAAService.isSAAActivity(activity)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final String LIZIZ(Context context) {
        C19263110Xt c19263110Xt = new C19263110Xt(context);
        String string = c19263110Xt.LIZ().getString("eid", "");
        Long lValueOf = Long.valueOf(c19263110Xt.LIZ().getLong("time", 0L));
        int i = c19263110Xt.LIZ().getInt("version_code", 0);
        if (!TextUtils.isEmpty(string) && lValueOf.longValue() != 0 && i != 0 && System.currentTimeMillis() - lValueOf.longValue() < 86400000) {
            C844470XAv.LIZ.getClass();
            if (C844470XAv.LIZIZ() > i) {
                c19263110Xt.LIZ().storeString("eid", "");
                c19263110Xt.LIZ().storeLong("time", 0L);
                c19263110Xt.LIZ().storeInt("version_code", 0);
                return string;
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final void LJII(String str) {
        if (C297540BlQ.LIZ() && C123100dR.LIZ(str) && !Intrinsics.LJFF(C116D.LIZ, str)) {
            C116D.LIZ = str;
            C116D.LIZIZ = null;
            C116D.LIZJ = C799570VYd.LJFF(false).submit(new Callable() { // from class: X.0Ces
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    NewFaceStickerListBean newFaceStickerListBean;
                    C1C7U.LIZ("EDPPreloadHelper@cef4.executeStickerDetailPreload$1");
                    boolean zLJI = MethodIDManager.LJI(137807);
                    try {
                        String strLIZIZ = C19221910Hx.LIZIZ();
                        newFaceStickerListBean = C318950Cer.LIZ.getStickerDetailHighPriority(C116D.LIZ, strLIZIZ).get();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        newFaceStickerListBean = null;
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    C1C7U.LIZIZ("EDPPreloadHelper@cef4.executeStickerDetailPreload$1");
                    return newFaceStickerListBean;
                }
            });
            C799570VYd.LJFF(false).submit(new Runnable() { // from class: X.1168
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EDPPreloadHelper@cef4.executeStickerDetailPreload$3");
                    try {
                        Future<NewFaceStickerListBean> future = C116D.LIZJ;
                        C116D.LIZIZ = future != null ? future.get() : null;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EDPPreloadHelper@cef4.executeStickerDetailPreload$3");
                }
            });
            C116D.LIZLLL = null;
            C116D.LJ = C799570VYd.LJFF(false).submit(new Callable() { // from class: X.116I
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    StickerPropAwemeList stickerPropAwemeList;
                    C1C7U.LIZ("EDPPreloadHelper@cef4.executeListPreload$1");
                    try {
                        C01GW c01gw = EffectDetailVideoListExperiment.LIZIZ;
                        int i = ((EffectDetailVideoListExperiment.EffectDetailVideoListExperimentConfig) c01gw.getValue()).on ? ((EffectDetailVideoListExperiment.EffectDetailVideoListExperimentConfig) c01gw.getValue()).count : 20;
                        String str2 = C116D.LIZ;
                        StickerPropApi stickerPropApi = C318950Cer.LIZ;
                        stickerPropAwemeList = C318950Cer.LIZ.queryStickerAwemeListHighPriority(str2, 0L, i, 0, C116F.LJIIL(), C7883036b.LIZ()).get();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        stickerPropAwemeList = null;
                    }
                    C1C7U.LIZIZ("EDPPreloadHelper@cef4.executeListPreload$1");
                    return stickerPropAwemeList;
                }
            });
            C799570VYd.LJFF(false).submit(new Runnable() { // from class: X.116E
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EDPPreloadHelper@cef4.executeListPreload$3");
                    try {
                        Future<StickerPropAwemeList> future = C116D.LJ;
                        C116D.LIZLLL = future != null ? future.get() : null;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EDPPreloadHelper@cef4.executeListPreload$3");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final boolean LJIIIZ(Aweme aweme) {
        if (aweme.getStickerEntranceInfo() != null && !TextUtils.isEmpty(aweme.getStickerEntranceInfo().name)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final NewFaceStickerListBean LJIIJ(String str) {
        StickerPropApi stickerPropApi = (StickerPropApi) this.LIZ.getValue();
        C0CHQ.LIZ().getApplicationService();
        return stickerPropApi.getStickerDetail(str, C19221910Hx.LIZIZ()).get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ruT] */
    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final C1606590ruT LIZJ(AbstractC1255880imo abstractC1255880imo, C2189821An6 c2189821An6) {
        return new AbstractC1216410hl9<C116F, C1255920ims<C116F>>(abstractC1255880imo, c2189821An6) { // from class: X.0ruT
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return i + 10000;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mModel = abstractC1255880imo instanceof C116F ? abstractC1255880imo : new C116F(c2189821An6.getPreviousPage(), c2189821An6.getVideoType());
                this.mPresenter = new C1255920ims();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An62.getStickerId(), Integer.valueOf(c2189821An62.getVideoType()));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final Object LJIIL(int i, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        try {
            StickerPropApi stickerPropApi = (StickerPropApi) this.LIZ.getValue();
            EffectFilterReq effectFilterReqLIZJ = C1630480sX0.LIZJ(i);
            C1227904rF.LIZ.getClass();
            ListenableFuture<StickerPropAwemeList> listenableFutureLIZJ = stickerPropApi.LIZJ("", 0L, 20, "", 0, C1227904rF.LJI(effectFilterReqLIZJ));
            C11U6<StickerPropAwemeList> c11u6 = new C11U6<StickerPropAwemeList>() { // from class: X.0OBt
                @Override // X.C11U6
                public final void onFailure(Throwable th) {
                    InterfaceC1364105Vn<List<String>> interfaceC1364105Vn2 = c23260099m;
                    C13BV c13bv = C13BV.INSTANCE;
                    C189200o6.m2constructorimpl(c13bv);
                    interfaceC1364105Vn2.resumeWith(c13bv);
                }

                @Override // X.C11U6
                public final void onSuccess(StickerPropAwemeList stickerPropAwemeList) {
                    List<Aweme> list;
                    String keyword;
                    StickerPropAwemeList stickerPropAwemeList2 = stickerPropAwemeList;
                    ArrayList arrayList = null;
                    if (stickerPropAwemeList2 != null && (list = stickerPropAwemeList2.items) != null) {
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<Aweme> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(it2.next().getAnchors());
                        }
                        if (!arrayList2.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) C13LP.LJJJLL((List) it3.next());
                                if (anchorCommonStruct != null) {
                                    keyword = anchorCommonStruct.getKeyword();
                                } else {
                                    keyword = null;
                                }
                                arrayList3.add(keyword);
                            }
                            arrayList = arrayList3;
                        }
                    }
                    InterfaceC1364105Vn<List<String>> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(arrayList);
                    interfaceC1364105Vn2.resumeWith(arrayList);
                }
            };
            listenableFutureLIZJ.LJIIJJI(new C135Q(listenableFutureLIZJ, c11u6), C823050WQl.LIZLLL());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13BV c13bv = C13BV.INSTANCE;
            C189200o6.m2constructorimpl(c13bv);
            c23260099m.resumeWith(c13bv);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final EffectDiscoverAwemeListFragment LJIIIIZZ(Bundle bundle, int i, C11NZ c11nz) {
        int i2;
        if (Intrinsics.LJFF("from_effect_discover_panel", "from_effect_discover_tab")) {
            i2 = 35;
        } else if (Intrinsics.LJFF("from_effect_discover_panel", "from_effect_discover_panel")) {
            i2 = 36;
        } else {
            i2 = 15;
        }
        C1398390mUf c1398390mUf = new C1398390mUf(null, i2);
        EffectDiscoverAwemeListFragment effectDiscoverAwemeListFragment = new EffectDiscoverAwemeListFragment();
        bundle.putInt("detail_aweme_list_type", i2);
        C786410Ut5.LJJJI("detail_aweme_from", "from_effect_discover_panel", bundle);
        C786410Ut5.LJJJI("event_label", "sticker_prop_detail", bundle);
        C786410Ut5.LJJJI("detail_id", "-1", bundle);
        effectDiscoverAwemeListFragment.setArguments(bundle);
        effectDiscoverAwemeListFragment.LLLILZJ = c1398390mUf;
        effectDiscoverAwemeListFragment.LLLILZLLLI = i;
        effectDiscoverAwemeListFragment.LLLIZZ = c11nz;
        effectDiscoverAwemeListFragment.LLLFFI = true;
        effectDiscoverAwemeListFragment.LLLFZ = true;
        return effectDiscoverAwemeListFragment;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final void LJFF(Context context, List<String> list, C116L c116l, boolean z) {
        C19574811iE c19574811iE;
        int iIntValue;
        String str = c116l.LIZIZ;
        if (str != null && str.length() != 0) {
            c19574811iE = new C19574811iE(context, c116l.LIZIZ);
        } else {
            c19574811iE = new C19574811iE(context, "prop_reuse");
        }
        ShootExtraData shootExtraData = c116l.LJJIIJZLJL;
        if (shootExtraData != null) {
            c19574811iE.LJ = shootExtraData;
        }
        String str2 = c116l.LIZ;
        if (str2 != null && str2.length() != 0) {
            c19574811iE.LJIIJJI = c116l.LIZ;
        }
        boolean z2 = c116l.LJIIJJI;
        if (z2) {
            c19574811iE.LJJIJIL = z2;
        }
        c19574811iE.LJIJ = c116l.LJFF;
        c19574811iE.LJIJJ = c116l.LJIJ;
        c19574811iE.LJIJJLI = c116l.LJIJI;
        c19574811iE.LJJI = c116l.LJII;
        c19574811iE.LJJIFFI = c116l.LJIJJ;
        c19574811iE.LJIL = c116l.LJJ;
        c19574811iE.LJJ = c116l.LJJI;
        c19574811iE.LJIILL = c116l.LJJIIJ;
        c19574811iE.LJJJJZI = c116l.LJJIIZ;
        Music music = c116l.LIZJ;
        if (music != null) {
            c19574811iE.LJIIZILJ(music);
            c19574811iE.LJJIIJ = new InterfaceC1399590mWb() { // from class: X.0mWY
                @Override // X.InterfaceC1399590mWb
                public final void LIZ(Music music2, Effect effect) {
                    C578010Mlj.LIZ = false;
                    if (music2 != null && effect != null && C1399570mWZ.LIZ() && C1399400mWI.LIZ(effect)) {
                        C578010Mlj.LIZ = true;
                        if (C1399060mVk.LIZ()) {
                            music2.setMusicEndTime(music2.getShootDurationOrDuration() * LSPassThroughRecordSizeConfig.DEFAULT);
                        }
                    }
                }
            };
        }
        String str3 = c116l.LJIILLIIL;
        if (str3 != null) {
            c19574811iE.LJJJJI = str3;
        }
        c19574811iE.LJJJJIZL = c116l.LJIIZILJ;
        c19574811iE.LJJJJ = c116l.LIZLLL;
        c19574811iE.LIZLLL = c116l.LJIIL;
        c19574811iE.LJIILLIIL = c116l.LJ;
        c19574811iE.LJJII = c116l.LJIILJJIL;
        c19574811iE.LJJIII = c116l.LJIILL;
        c19574811iE.LJJIJ = c116l.LJIIIZ;
        c19574811iE.LJJIIZI = c116l.LJIIIIZZ;
        Integer num = c116l.LJIILIIL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c19574811iE.LJJJI = iIntValue;
        c19574811iE.LJJIJIIJI = c116l.LJIIJ;
        c19574811iE.LJJIJIL = !z;
        String str4 = c116l.LJFF;
        if (str4 != null && a0.LJJIIZI(str4, "trending", false)) {
            c19574811iE.LJJJJJL = true;
        }
        c19574811iE.LJJJJL = c116l.LJIJJLI;
        c19574811iE.LJJJJLI = c116l.LJIL;
        c19574811iE.LJJJJLL = c116l.LJJIFFI;
        c19574811iE.LJJJJZ = c116l.LJJII;
        Integer num2 = c116l.LJJIII;
        if (num2 != null) {
            c19574811iE.LJ.setFromAwemeType(num2);
        }
        c19574811iE.LJIJI = c116l.LJI;
        ArrayList arrayList = new ArrayList(list);
        boolean zLJI = MethodIDManager.LJI(137387);
        c19574811iE.LJFF(z, arrayList, false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final void LJIIJJI(Activity activity, ArrayList arrayList, Music music, final String str, final String str2, int i, Aweme aweme, final Map map) {
        final String str3;
        if (arrayList.isEmpty() || CommerceLockStickerServiceImpl.LIZJ().LIZIZ(activity, (NewFaceStickerBean) ListProtector.get(arrayList, 0), "prop_collection")) {
            return;
        }
        if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().needLoginBeforeRecord()) {
            C0XPD.LIZIZ(activity, "prop_page", "prop_reuse_icon", null, null);
            return;
        }
        if (map == null || (str3 = (String) map.get("shoot_way")) == null) {
            str3 = "profile_prop";
        }
        C19574811iE c19574811iE = new C19574811iE(activity, str3);
        c19574811iE.LJIILLIIL = "prop_auto";
        c19574811iE.LJIILL = aweme;
        c19574811iE.LJIJ = str;
        c19574811iE.LJJII = new InterfaceC19340210lU() { // from class: X.0mOu
            @Override // X.InterfaceC19340210lU
            public final void LIZ(Effect effect, String str4) {
                List<String> v2Tags;
                String strLJJLIIIJ;
                IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
                String str5 = str3;
                String str6 = str;
                String str7 = str2;
                String str8 = "";
                if (str7 == null) {
                    str7 = "";
                }
                C1449410nox c1449410nox = new C1449410nox(str4, str5, str6, str7, null, null, effect.getDesignerId(), null, 176);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("shoot_entrance", "profile_prop");
                c2344009Gk.LJIIIIZZ("prop_id", effect.getEffectId());
                c2344009Gk.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
                c2344009Gk.LJIIIIZZ("prop_panel_model_request_id", effect.getLogId());
                EffectLabel effectLabel = effect.getEffectLabel();
                if (effectLabel != null && (v2Tags = effectLabel.getV2Tags()) != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(v2Tags, ",", null, null, 0, null, null, 62)) != null) {
                    str8 = strLJJLIIIJ;
                }
                c2344009Gk.LJIIIIZZ("prop_category", str8);
                c2344009Gk.LJFF("prop_resource_id", effect.getResourceId());
                Map<String, String> map2 = map;
                C1448620nng.LIZ(new C1394810mOt(c2344009Gk));
                List<String> music2 = effect.getMusic();
                if (music2 != null && (!music2.isEmpty())) {
                    c2344009Gk.LJFF("music_id", (String) ListProtector.get(music2, 0));
                }
                if (map2 != null) {
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        c2344009Gk.LJFF(entry.getKey(), entry.getValue());
                    }
                }
                iRecordMobService.LIZLLL(c1449410nox, c2344009Gk.LIZ);
            }
        };
        if (music != null) {
            c19574811iE.LJIIZILJ(music);
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((NewFaceStickerBean) it2.next()).id);
        }
        c19574811iE.LJIILL(new ArrayList<>(arrayList2), "profile_prop", "reuse", false, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(android.app.Activity r16, java.util.ArrayList r17, final java.lang.String r18, com.ss.android.ugc.aweme.music.model.Music r19, final java.lang.String r20, final java.lang.String r21, java.lang.Integer r22, int r23, boolean r24, final java.lang.String r25, final com.ss.android.ugc.aweme.feed.model.Aweme r26, final java.lang.String r27, java.lang.String r28, java.lang.String r29, final boolean r30, final boolean r31, java.lang.String r32, java.lang.String r33, final com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData r34) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl.LJIILIIL(android.app.Activity, java.util.ArrayList, java.lang.String, com.ss.android.ugc.aweme.music.model.Music, java.lang.String, java.lang.String, java.lang.Integer, int, boolean, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(android.app.Activity r26, java.util.ArrayList r27, final com.ss.android.ugc.aweme.music.model.Music r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.Integer r32, int r33, boolean r34, java.lang.String r35, com.ss.android.ugc.aweme.feed.model.Aweme r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, boolean r40, boolean r41, java.lang.String r42, java.lang.String r43, com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData r44) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl.LJ(android.app.Activity, java.util.ArrayList, com.ss.android.ugc.aweme.music.model.Music, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, boolean, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData):void");
    }
}
