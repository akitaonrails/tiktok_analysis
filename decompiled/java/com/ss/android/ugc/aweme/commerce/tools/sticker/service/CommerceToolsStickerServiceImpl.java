package com.ss.android.ugc.aweme.commerce.tools.sticker.service;

import X.AbstractC856620Xj2;
import X.C01GW;
import X.C086I;
import X.C0CHQ;
import X.C0LAB;
import X.C1022820ciu;
import X.C1063180dm0;
import X.C1227904rF;
import X.C13BV;
import X.C13LP;
import X.C1429860nJQ;
import X.C1429890nJT;
import X.C1441190nbh;
import X.C1446520nkI;
import X.C1448950noD;
import X.C1448960noE;
import X.C1449000noI;
import X.C15438062q;
import X.C1624570sNT;
import X.C1625940sPg;
import X.C1627370sRz;
import X.C1629100sUm;
import X.C1631010sXr;
import X.C1631400sYU;
import X.C1636920shO;
import X.C1637890six;
import X.C1905107dB;
import X.C19GS;
import X.C1AF0;
import X.C20012313Rx;
import X.C201955140j;
import X.C20684815ws;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2214471Bll;
import X.C452501pT;
import X.C543670LTx;
import X.C786410Ut5;
import X.EnumC1428480nHC;
import X.EnumC1448980noG;
import X.InterfaceC1452170ntP;
import X.InterfaceC1624270sMz;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625470sOv;
import Y.ARunnableS27S1100000_22;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.commerce.VideoInterval;
import com.ss.android.ugc.aweme.commerce.tools.sticker.CommerceToolsStickerContext;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEContext;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEStickerHandler;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class CommerceToolsStickerServiceImpl implements ICommerceToolsStickerService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(204));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(203));

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final C1063180dm0 LIZIZ(AbstractC856620Xj2 abstractC856620Xj2) {
        return new C1063180dm0(abstractC856620Xj2);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        C1446520nkI.LIZ.getClass();
        if (videoPublishEditModel != null) {
            for (TimeSpeedModelExtension timeSpeedModelExtension : videoPublishEditModel.getFinalVideoList()) {
                if (!timeSpeedModelExtension.getRecordExtras().isEmpty() && timeSpeedModelExtension.getFromRecordExtras("extra_key_ibe_info") != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final boolean LIZLLL(C1441190nbh c1441190nbh) {
        if (c1441190nbh == null || c1441190nbh.isEmpty()) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it2 = c1441190nbh.iterator();
        while (it2.hasNext()) {
            if (it2.next().isBusiSticker()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r13) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.sticker.service.CommerceToolsStickerServiceImpl.LJ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):void");
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final void LJI(String str) {
        ExecutorService logThreadPool;
        if (str != null && str.length() != 0) {
            IAppLogDepend iAppLogDependLIZ = C2214471Bll.LIZ();
            if (iAppLogDependLIZ != null) {
                logThreadPool = iAppLogDependLIZ.getLogThreadPool();
            } else {
                logThreadPool = null;
            }
            if (((Boolean) this.LIZ.getValue()).booleanValue() && logThreadPool != null) {
                logThreadPool.execute(new ARunnableS27S1100000_22(this, str, 0));
            } else {
                LIZ("click", str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final void LJIIIZ(String str) {
        ExecutorService logThreadPool;
        if (str != null && str.length() != 0) {
            IAppLogDepend iAppLogDependLIZ = C2214471Bll.LIZ();
            if (iAppLogDependLIZ != null) {
                logThreadPool = iAppLogDependLIZ.getLogThreadPool();
            } else {
                logThreadPool = null;
            }
            if (((Boolean) this.LIZ.getValue()).booleanValue() && logThreadPool != null) {
                logThreadPool.execute(new ARunnableS27S1100000_22(this, str, 1));
            } else {
                LIZ("show", str);
            }
        }
    }

    public static void LIZ(String str, String str2) {
        try {
            C1227904rF.LIZ.getClass();
            AwemeRawAd awemeRawAd = (AwemeRawAd) C1227904rF.LIZJ(str2, AwemeRawAd.class);
            if (awemeRawAd == null) {
                return;
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("camera_ad", str, awemeRawAd);
            c1022820ciuLIZLLL.LIZJ("sticker", "refer");
            c1022820ciuLIZLLL.LJII();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final void LJII(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        ?? arrayList;
        ?? arrayList2;
        C1446520nkI.LIZ.getClass();
        JSONObject jSONObject = new JSONObject();
        HashMap map = new HashMap();
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        if (finalVideoList != null) {
            arrayList = new ArrayList();
            for (TimeSpeedModelExtension timeSpeedModelExtension : finalVideoList) {
                TimeSpeedModelExtension timeSpeedModelExtension2 = timeSpeedModelExtension;
                if (!timeSpeedModelExtension2.getRecordExtras().isEmpty() && timeSpeedModelExtension2.getFromRecordExtras("extra_key_ibe_info") != null) {
                    arrayList.add(timeSpeedModelExtension);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        Float fValueOf = Float.valueOf(0.0f);
        int iLJIJJ = C15438062q.LJIJJ(arrayList, 9);
        if (iLJIJJ == 0) {
            arrayList2 = Collections.singletonList(fValueOf);
        } else {
            arrayList2 = new ArrayList(iLJIJJ + 1);
            arrayList2.add(fValueOf);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                fValueOf = Float.valueOf(fValueOf.floatValue() + ((TimeSpeedModelExtension) it2.next()).getDuration());
                arrayList2.add(fValueOf);
            }
        }
        List listLLIILII = C13LP.LLIILII(C13LP.LJJJJJ(1, arrayList2), arrayList);
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLLIILII, 10));
        for (Pair pair : (ArrayList) listLLIILII) {
            float fFloatValue = ((Number) pair.getFirst()).floatValue();
            TimeSpeedModelExtension timeSpeedModelExtension3 = (TimeSpeedModelExtension) pair.getSecond();
            C1446520nkI.LIZ.getClass();
            InteractiveBrandedEffectInfo interactiveBrandedEffectInfoLIZ = C1446520nkI.LIZ(timeSpeedModelExtension3);
            if (interactiveBrandedEffectInfoLIZ != null) {
                VideoInterval videoInterval = new VideoInterval();
                videoInterval.setStart(Float.valueOf(fFloatValue));
                videoInterval.setEnd(Float.valueOf(fFloatValue + timeSpeedModelExtension3.getDuration()));
                interactiveBrandedEffectInfoLIZ.setVideoInterval(videoInterval);
            } else {
                interactiveBrandedEffectInfoLIZ = null;
            }
            arrayList3.add(interactiveBrandedEffectInfoLIZ);
        }
        IBEContext ibeContext = videoPublishEditModel.creativeModel.commerceModel.getIbeContext();
        ArrayList<InteractiveBrandedEffectInfo> arrayList4 = new ArrayList();
        for (TimeSpeedModelExtension timeSpeedModelExtension4 : arrayList) {
            C1446520nkI.LIZ.getClass();
            InteractiveBrandedEffectInfo interactiveBrandedEffectInfoLIZ2 = C1446520nkI.LIZ(timeSpeedModelExtension4);
            if (interactiveBrandedEffectInfoLIZ2 != null) {
                arrayList4.add(interactiveBrandedEffectInfoLIZ2);
            }
        }
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
        for (InteractiveBrandedEffectInfo interactiveBrandedEffectInfo : arrayList4) {
            int ibeType = interactiveBrandedEffectInfo.getIbeType();
            String lynxSchema = interactiveBrandedEffectInfo.getLynxSchema();
            if (lynxSchema == null) {
                C1AF0.LIZIZ();
                lynxSchema = "";
            }
            arrayList5.add(new IBEInfo(ibeType, lynxSchema, interactiveBrandedEffectInfo.getStickerId()));
        }
        ibeContext.setIbeInfos(arrayList5);
        videoPublishEditModel.creativeModel.commerceModel.getStickerContext().setHasIBEMetaData(!arrayList3.isEmpty());
        if (!arrayList3.isEmpty()) {
            videoPublishEditModel.creativeModel.commerceModel.getIbeContext().setMetadata((InteractiveBrandedEffectInfo) C13LP.LJJLIIIJJI(arrayList3));
            map.put("interactive_branded_effect_infos", GsonProtectorUtils.toJson(C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson(), arrayList3));
        }
        if (!(!arrayList3.isEmpty())) {
            C1429890nJT mainBusinessContext = videoPublishEditModel.getMainBusinessContext();
            if (mainBusinessContext != null) {
                List<InteractStickerStruct> listLJ = C1429860nJQ.LJ(mainBusinessContext, EnumC1428480nHC.TRACK_PAGE_RECORD);
                if (!C086I.LIZIZ(listLJ)) {
                    map.put("interaction_stickers", GsonProtectorUtils.toJson(C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson(), listLJ));
                    videoPublishEditModel.creativeModel.commerceModel.getStickerContext().setHasCommerceStickerMetaData(true);
                } else {
                    videoPublishEditModel.creativeModel.commerceModel.getStickerContext().setHasCommerceStickerMetaData(false);
                    return;
                }
            } else {
                return;
            }
        }
        try {
            jSONObject.put("com.bytedance.info", GsonProtectorUtils.toJson(C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson(), map));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZIZ();
        }
        interfaceC1452170ntP.addMetadata("com.android.information", C786410Ut5.J3(jSONObject));
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final IBEStickerHandler LJIIL(C19GS c19gs, ShortVideoContext shortVideoContext) {
        return new IBEStickerHandler(shortVideoContext);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0sXr] */
    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final C1631010sXr LJIIIIZZ(ShortVideoContext shortVideoContext, C1631400sYU c1631400sYU, List list) {
        return new InterfaceC1624270sMz(shortVideoContext, c1631400sYU, list) { // from class: X.0sXr
            public final ShortVideoContext LL;
            public final InterfaceC1631050sXv LLILLJJLI;
            public final List<InterfaceC1624270sMz> LLILLL;
            public C1631020sXs LLILZ;
            public C1631310sYL LLILZIL;

            @Override // X.InterfaceC1624270sMz
            public final void LIZ() {
                C1631310sYL c1631310sYL = this.LLILZIL;
                if (c1631310sYL != null) {
                    c1631310sYL.LIZIZ(0, null);
                }
                C1631020sXs c1631020sXs = this.LLILZ;
                if (c1631020sXs != null) {
                    c1631020sXs.LIZ(null);
                }
            }

            @Override // X.InterfaceC1624270sMz
            public final EnumC992590bw9 priority() {
                return EnumC992590bw9.CommerceStickerInfoHandlerPriority;
            }

            @Override // X.InterfaceC1624270sMz
            public final void LIZIZ(View view) {
                this.LLILZIL = new C1631310sYL((LinearLayout) view.findViewById(R.id.ejd), this.LLILLJJLI, this.LLILLL, view.getContext());
                this.LLILZ = new C1631020sXs(this.LL, (LinearLayout) view.findViewById(R.id.ejf), this.LLILLJJLI);
            }

            @Override // X.InterfaceC1624270sMz
            public final boolean LIZJ(C1627370sRz c1627370sRz) {
                Effect effect = c1627370sRz.LIZ;
                int i = c1627370sRz.LIZIZ;
                C1631020sXs c1631020sXs = this.LLILZ;
                if (c1631020sXs != null && c1631020sXs.LIZ(effect)) {
                    return true;
                }
                C1631310sYL c1631310sYL = this.LLILZIL;
                if (c1631310sYL == null) {
                    return false;
                }
                return c1631310sYL.LIZIZ(i, effect);
            }

            {
                this.LL = shortVideoContext;
                this.LLILLJJLI = c1631400sYU;
                this.LLILLL = list;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final C1636920shO LJIIJ(C19GS c19gs, AwS552S0100000_8 awS552S0100000_8, ShortVideoContext shortVideoContext) {
        return new C1636920shO(c19gs, awS552S0100000_8, shortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final void LJIIJJI(ShortVideoContext shortVideoContext, boolean z, String str, String str2, Boolean bool) {
        if (!TextUtils.equals(shortVideoContext.creativeModel.commerceModel.getStickerContext().getPropId(), str2) && z && TextUtils.equals(shortVideoContext.shootWay, "challenge") && Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("shoot_way", shortVideoContext.shootWay);
            if (str == null) {
                str = "";
            }
            c543670LTx.LIZ.put("challenge_id", str);
            c543670LTx.LIZ.put("sticker_id", str2);
            C1637890six.LJ("autoselected_sticker_monitor", 0, c543670LTx.LJ());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final void LJFF(InterfaceC1624480sNK interfaceC1624480sNK, ShortVideoContext shortVideoContext, Effect effect, boolean z, boolean z2, boolean z3) {
        MutableLiveData mutableLiveDataLJ;
        String strLJJLIIIJ;
        C1449000noI c1449000noI;
        C1627370sRz c1627370sRz;
        String string;
        EnumC1448980noG enumC1448980noG;
        String effectId;
        Effect effect2;
        String str;
        Effect effect3;
        String str2;
        Effect effect4;
        EffectCategoryModel effectCategoryModelLJIIIIZZ;
        String key;
        Integer numValueOf;
        String str3;
        Bundle bundle;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLJIILJJIL;
        List<String> v2Tags;
        InterfaceC1625470sOv interfaceC1625470sOvLJII2;
        if (C1624570sNT.LJIIL(effect)) {
            return;
        }
        CommerceToolsStickerContext stickerContext = shortVideoContext.creativeModel.commerceModel.getStickerContext();
        if (TextUtils.equals(stickerContext.getPropId(), effect.getEffectId())) {
            return;
        }
        LJ(shortVideoContext);
        if (!z) {
            return;
        }
        String str4 = null;
        if (interfaceC1624480sNK != null && (interfaceC1625470sOvLJII2 = interfaceC1624480sNK.LJII()) != null) {
            mutableLiveDataLJ = interfaceC1625470sOvLJII2.LJ();
        } else {
            mutableLiveDataLJ = null;
        }
        shortVideoContext.creativeModel.propETGroupModel.LIZLLL = true;
        stickerContext.setStartedUsingEffect(true);
        stickerContext.setPropId(effect.getEffectId());
        EffectLabel effectLabel = effect.getEffectLabel();
        String str5 = "";
        if (effectLabel == null || (v2Tags = effectLabel.getV2Tags()) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(v2Tags, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        stickerContext.setPropCategory(strLJJLIIIJ);
        stickerContext.setPropPanelCache(effect.is_cached_data());
        stickerContext.setResourceId(effect.getResourceId());
        stickerContext.setStartUseTime(Long.valueOf(SystemClock.elapsedRealtime()));
        stickerContext.setCarousalOpen(z3);
        stickerContext.setPropBasicEventParams(C1905107dB.LIZ(effect));
        stickerContext.setFromSource(effect.getFrom_source());
        stickerContext.setEffectSdkExtra(effect.getSdkExtra());
        if (mutableLiveDataLJ != null) {
            c1449000noI = (C1449000noI) mutableLiveDataLJ.getValue();
        } else {
            c1449000noI = null;
        }
        if (interfaceC1624480sNK != null && (interfaceC1625470sOvLJII = interfaceC1624480sNK.LJII()) != null && (mutableLiveDataLJIILJJIL = interfaceC1625470sOvLJII.LJIILJJIL()) != null) {
            c1627370sRz = (C1627370sRz) mutableLiveDataLJIILJJIL.getValue();
        } else {
            c1627370sRz = null;
        }
        if (c1627370sRz != null && (bundle = c1627370sRz.LJ) != null) {
            string = bundle.getString("carousel_open");
        } else {
            string = null;
        }
        String str6 = "1";
        boolean zLJFF = Intrinsics.LJFF(string, "1");
        Set<EnumC1448980noG> set = C1448950noD.LIZ;
        if (c1627370sRz != null) {
            enumC1448980noG = c1627370sRz.LIZJ;
        } else {
            enumC1448980noG = null;
        }
        boolean zLJJJJ = C13LP.LJJJJ(enumC1448980noG, set);
        String name = "carousel";
        if (zLJJJJ) {
            if (interfaceC1624480sNK != null) {
                effectCategoryModelLJIIIIZZ = C1625940sPg.LJIIIIZZ(interfaceC1624480sNK, 1);
            } else {
                effectCategoryModelLJIIIIZZ = null;
            }
            if (zLJFF) {
                key = "carousel";
            } else if (effectCategoryModelLJIIIIZZ == null || (key = effectCategoryModelLJIIIIZZ.getKey()) == null) {
                key = "";
            }
            stickerContext.setTabKey(key);
            if (!zLJFF && (effectCategoryModelLJIIIIZZ == null || (name = effectCategoryModelLJIIIIZZ.getName()) == null)) {
                name = "";
            }
            stickerContext.setTabName(name);
            if (c1627370sRz != null && c1627370sRz.LIZIZ > 0) {
                if (c1627370sRz != null) {
                    numValueOf = Integer.valueOf(c1627370sRz.LIZIZ);
                } else {
                    numValueOf = null;
                }
            } else {
                numValueOf = 1;
            }
            stickerContext.setImprPosition(numValueOf);
            if (Intrinsics.LJFF(shortVideoContext.LJIIIZ(), effect.getEffectId())) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            stickerContext.setDefaultProp(str3);
        } else {
            if (c1449000noI != null) {
                stickerContext.setTabKey(c1449000noI.LJIIIZ);
                stickerContext.setTabName(c1449000noI.LJIIIIZZ);
                stickerContext.setImprPosition(Integer.valueOf(c1449000noI.LIZJ));
                stickerContext.setCarousalOpen(c1449000noI.LJI);
            } else {
                String effectId2 = effect.getEffectId();
                if (c1627370sRz != null && (effect2 = c1627370sRz.LIZ) != null) {
                    effectId = effect2.getEffectId();
                } else {
                    effectId = null;
                }
                if (Intrinsics.LJFF(effectId2, effectId)) {
                    stickerContext.setTabKey("carousel");
                    stickerContext.setTabName("carousel");
                    stickerContext.setImprPosition(1);
                }
            }
            if (Intrinsics.LJFF(shortVideoContext.LJIIIZ(), effect.getEffectId())) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            stickerContext.setDefaultProp(str);
        }
        if (C1448960noE.LIZ()) {
            if (c1449000noI != null && (effect4 = c1449000noI.LIZ) != null) {
                boolean zLJFF2 = C1629100sUm.LJFF(effect4);
                boolean zLIZLLL = C1629100sUm.LIZLLL(effect4);
                String strLIZJ = C1629100sUm.LIZJ(effect4);
                if ((zLJFF2 || zLIZLLL || Intrinsics.LJFF(strLIZJ, "related") || Intrinsics.LJFF(strLIZJ, "premium")) && strLIZJ != null) {
                    str5 = strLIZJ;
                }
                C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("add favorite source recentSticker = ");
                sbLIZ.append(zLJFF2);
                sbLIZ.append(", favoriteSticker = ");
                sbLIZ.append(zLIZLLL);
                sbLIZ.append(", favoriteSource = ");
                sbLIZ.append(str5);
                C201955140j.LIZLLL(c20012313Rx, "CommerceToolsStickerServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                stickerContext.setFavoriteSource(str5);
            }
        } else {
            if (c1449000noI != null) {
                effect3 = c1449000noI.LIZ;
            } else {
                effect3 = null;
            }
            String strLIZJ2 = C1629100sUm.LIZJ(effect3);
            if (strLIZJ2 != null && (Intrinsics.LJFF(strLIZJ2, "related") || Intrinsics.LJFF(strLIZJ2, "premium"))) {
                str4 = strLIZJ2;
            }
            stickerContext.setFavoriteSource(str4);
        }
        if (z2 && effect.isBusiness()) {
            C0LAB c0lab = new C0LAB();
            if (TextUtils.isEmpty(shortVideoContext.enterFrom)) {
                str2 = shortVideoContext.shootWay;
            } else {
                str2 = shortVideoContext.enterFrom;
            }
            c0lab.LJ("enter_from", str2);
            c0lab.LJ("prop_id", effect.getId());
            if (!shortVideoContext.isCarouselOpen) {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("carousel_open", str6);
            C20684815ws.LJIILLIIL("commerce_prop_click", c0lab.LIZ);
        }
    }
}
