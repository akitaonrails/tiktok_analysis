package com.bytedance.android.livesdk.gift.base.platform.core.manager;

import X.AbstractC1126600fQI;
import X.AbstractC1132980faa;
import X.AnonymousClass0054;
import X.C01AS;
import X.C01AW;
import X.C083200Sw;
import X.C0IGX;
import X.C0IKQ;
import X.C1086850eOB;
import X.C1118340fCy;
import X.C1120710fGn;
import X.C1121330fHn;
import X.C1121600fIE;
import X.C1123110fKf;
import X.C1127130fR9;
import X.C1127380fRY;
import X.C1127820fSG;
import X.C1127920fSQ;
import X.C1128590fTV;
import X.C1129650fVD;
import X.C1130100fVw;
import X.C1131070fXV;
import X.C1131270fXp;
import X.C1132780faG;
import X.C1133010fad;
import X.C1133120fao;
import X.C1133130fap;
import X.C1133150far;
import X.C1133160fas;
import X.C1133460fbM;
import X.C1133940fc8;
import X.C1138640fji;
import X.C13BV;
import X.C13LP;
import X.C1498850p6h;
import X.C158B;
import X.C177100m9;
import X.C19719612Di;
import X.C19748512Ol;
import X.C1AF0;
import X.C20066713fN;
import X.C20337914i1;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C784440Upu;
import X.C786410Ut5;
import X.C842240X2g;
import X.C930940aKi;
import X.EnumC1133020fae;
import X.InterfaceC1094160eZy;
import X.InterfaceC1128210fSt;
import X.InterfaceC1128230fSv;
import X.InterfaceC1128430fTF;
import X.InterfaceC1133110fan;
import X.InterfaceC1133710fbl;
import android.util.SparseArray;
import android.util.SparseLongArray;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.ComboBar;
import com.bytedance.android.livesdk.gift.model.FreqLimitGiftInfo;
import com.bytedance.android.livesdk.gift.model.FreqLimitGiftOption;
import com.bytedance.android.livesdk.gift.model.GiftChallengeProgress;
import com.bytedance.android.livesdk.gift.model.GiftConfigInfo;
import com.bytedance.android.livesdk.gift.model.GiftConfigs;
import com.bytedance.android.livesdk.gift.model.GiftIconInfo;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftPollInfo;
import com.bytedance.android.livesdk.gift.model.GiftPollOption;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.RiskCtl;
import com.bytedance.android.livesdk.gift.model.SponsorshipInfo;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFreeGiftSendChannelSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFreeGiftSendSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftFastGiftMemoryLeakFixSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPreDownloadInteractiveAssetSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftReceivingRefactorSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSendBecomeGuestBlackList;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftManagerKotlin implements InterfaceC1128210fSt {
    public static GiftManagerKotlin sInst;
    public GiftsInfo currentGiftsInfo;
    public FreqLimitGiftInfo freqLimitGiftInfo;
    public Map<Long, FreqLimitGiftOption> freqLimitGiftOptionList;
    public Map<Long, C1127130fR9> freqLimitInfoList;
    public C1127920fSQ galleryEntranceInfo;
    public GiftChallengeProgress giftChallengeProgress;
    public GiftPollInfo giftPollInfo;
    public long magicContainerId;
    public Gift upgradeGift;
    public static final C1133010fad Companion = new C1133010fad();
    public static final int $stable = 8;
    public final ConcurrentHashMap<Long, Long> roomFastGiftIdMap = new ConcurrentHashMap<>(20);
    public final ConcurrentHashMap<Long, List<Long>> roomFastGiftIdsMap = new ConcurrentHashMap<>(20);
    public final ConcurrentHashMap<Long, GiftsInfo> roomGiftInfoMap = new ConcurrentHashMap<>(20);
    public final ConcurrentHashMap<Long, RiskCtl> roomRiskCtl = new ConcurrentHashMap<>(20);
    public LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> currentPanelList = new LinkedList<>();
    public final C1118340fCy teamRankManager = new C1118340fCy();
    public final Set<Long> currentEffectSet = new HashSet(600);
    public final ConcurrentHashMap<Long, Gift> giftListCacheWithHash = new ConcurrentHashMap<>(600);
    public final C1498850p6h<Long, List<Long>> mappedGiftIds = new C1498850p6h<>(15, 10);
    public final Map<Long, C1127820fSG> galleryInfoMap = new LinkedHashMap();
    public final Map<Long, Boolean> disableGalleryBannerMap = new LinkedHashMap();
    public final Map<Long, Boolean> isGalleryAllSponsored = new LinkedHashMap();
    public final C1129650fVD giftRepository = new C1129650fVD();
    public final InterfaceC1128430fTF galleryRepository = new C1132780faG();
    public final C177100m9 filterManager = new C177100m9();
    public final SparseArray<GiftListResult> giftsMap = new SparseArray<>();
    public final SparseArray<C20066713fN<Gift>> giftsMapByFind = new SparseArray<>();
    public final ConcurrentHashMap<Integer, C20066713fN<Gift>> giftsMapByFindConcurrent = new ConcurrentHashMap<>();
    public final SparseLongArray giftListRoomIdMap = new SparseLongArray();
    public final CopyOnWriteArrayList<InterfaceC1133110fan> giftListListeners = new CopyOnWriteArrayList<>();
    public final Map<Integer, LinkedHashSet<Long>> lockedGiftsMap = new LinkedHashMap();
    public long lockedGiftsMapRoomId = -1;
    public final List<InterfaceC1128230fSv> galleryInfoUpdateListeners = new ArrayList();

    @Override // X.InterfaceC1128210fSt
    public boolean canSendGiftFree() {
        return LiveFreeGiftSendChannelSetting.INSTANCE.canFreeSendInCurrentChannel() && LiveFreeGiftSendSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC1128210fSt
    public void clearCache() {
        this.galleryInfoMap.clear();
    }

    @Override // X.InterfaceC1128210fSt
    public void clearGiftMap() {
        this.giftsMap.clear();
        this.giftListRoomIdMap.clear();
    }

    @Override // X.InterfaceC1128210fSt
    public long getCachedGiftListRoomId() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return this.giftListRoomIdMap.get(room != null ? room.getOrientation() : 0, 0L);
    }

    @Override // X.InterfaceC1128210fSt
    public List<GiftPage> getDataFromMemoryCache() {
        List<GiftPage> list;
        GiftListResult giftListResult = this.giftsMap.get(0);
        return (giftListResult == null || (list = giftListResult.giftPages) == null) ? C13BV.INSTANCE : list;
    }

    @Override // X.InterfaceC1128210fSt
    public long getFirstShowSubscribeGiftId() {
        List<GiftPage> list;
        List<Gift> list2;
        GiftListResult giftListResult = this.giftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null) {
            for (GiftPage giftPage : list) {
                if (giftPage != null && giftPage.pageType == 15 && (list2 = giftPage.gifts) != null) {
                    for (Gift gift : list2) {
                        if (gift != null && gift.isDisplayedOnPanel) {
                            return gift.id;
                        }
                    }
                }
            }
        }
        return 0L;
    }

    @Override // X.InterfaceC1128210fSt
    public GiftListResult getGiftListResult() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return this.giftsMap.get(room != null ? room.getOrientation() : 0);
    }

    @Override // X.InterfaceC1128210fSt
    public List<GiftPage> getGiftPageList() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        GiftListResult giftListResult = this.giftsMap.get(room != null ? room.getOrientation() : 0);
        if (giftListResult == null || C0IKQ.LIZ(giftListResult.giftPages)) {
            return C13BV.INSTANCE;
        }
        List<GiftPage> list = giftListResult.giftPages;
        return list == null ? C13BV.INSTANCE : list;
    }

    @Override // X.InterfaceC1128210fSt
    public Long getMagicContainerId() {
        return Long.valueOf(this.magicContainerId);
    }

    @Override // X.InterfaceC1128210fSt
    public C1086850eOB getPollGifts() {
        GiftPollInfo giftPollInfo;
        List<GiftPollOption> list;
        Long l;
        Long l2;
        List<GiftPollOption> list2;
        GiftPollInfo giftPollInfo2 = this.giftPollInfo;
        if (((giftPollInfo2 == null || (list2 = giftPollInfo2.giftPollOptions) == null || list2.size() != 2) ? false : true) && (giftPollInfo = this.giftPollInfo) != null && (list = giftPollInfo.giftPollOptions) != null) {
            GiftPollOption giftPollOption = (GiftPollOption) ListProtector.get(list, 0);
            GiftPollOption giftPollOption2 = (GiftPollOption) ListProtector.get(list, 1);
            if (giftPollOption != null && (l = giftPollOption.giftId) != null) {
                long jLongValue = l.longValue();
                if (giftPollOption2 != null && (l2 = giftPollOption2.giftId) != null) {
                    return new C1086850eOB(findGiftById(jLongValue), findGiftById(l2.longValue()), giftPollOption.resultImage, giftPollOption2.resultImage);
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC1128210fSt
    public List<Gift> getPreDownloadEffectGiftList() {
        List<Gift> list;
        ArrayList arrayList = new ArrayList();
        for (GiftPage giftPage : getGiftPageList()) {
            if (giftPage == null || (list = giftPage.gifts) == null) {
                list = C13BV.INSTANCE;
            }
            for (Gift gift : list) {
                if (LiveGiftPreDownloadInteractiveAssetSetting.INSTANCE.isEnable() && gift != null && gift.LIZLLL() && gift.primaryEffectId > 0) {
                    arrayList.add(gift);
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1128210fSt
    public Gift getUserLevelUpgradeGift() {
        List<Gift> list;
        GiftLockInfo giftLockInfo;
        Gift gift = this.upgradeGift;
        if (gift != null) {
            return gift;
        }
        Iterator<GiftPage> it2 = getGiftPageList().iterator();
        loop0: while (true) {
            gift = null;
            if (!it2.hasNext()) {
                break;
            }
            GiftPage next = it2.next();
            if (next == null || (list = next.gifts) == null) {
                list = C13BV.INSTANCE;
            }
            for (Gift gift2 : list) {
                if (gift2 != null && (giftLockInfo = gift2.giftSubInfo) != null && giftLockInfo.mLockType == 8 && gift2.isDisplayedOnPanel) {
                    this.upgradeGift = gift2;
                    break loop0;
                }
            }
        }
        return gift2;
    }

    @Override // X.InterfaceC1128210fSt
    public List<Gift> getVaultGifts() {
        List<Gift> list;
        List<Integer> list2;
        ArrayList arrayList = new ArrayList();
        for (GiftPage giftPage : getGiftPageList()) {
            if (giftPage == null || (list = giftPage.gifts) == null) {
                list = C13BV.INSTANCE;
            }
            for (Gift gift : list) {
                if (gift != null && (list2 = gift.giftVerticalScenarios) != null && list2.contains(8)) {
                    arrayList.add(gift);
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1128210fSt
    public boolean hideBottomBar() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        GiftListResult giftListResult = this.giftsMap.get(room != null ? room.getOrientation() : 0);
        if (giftListResult != null) {
            return giftListResult.giftsInfo.hideRecharge;
        }
        return false;
    }

    @Override // X.InterfaceC1128210fSt
    public void removeAllGalleryInfoListener() {
        synchronized (GiftManagerKotlin.class) {
            try {
                this.galleryInfoUpdateListeners.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1128210fSt
    public Gift getCommunityGift() {
        List<Gift> list;
        List<Integer> list2;
        Iterator<GiftPage> it2 = getGiftPageList().iterator();
        loop0: while (true) {
            gift = null;
            if (!it2.hasNext()) {
                break;
            }
            GiftPage next = it2.next();
            if (next == null || (list = next.gifts) == null) {
                list = C13BV.INSTANCE;
            }
            for (Gift gift : list) {
                if (gift != null && (list2 = gift.giftVerticalScenarios) != null && list2.contains(36) && gift.isDisplayedOnPanel) {
                    break loop0;
                }
            }
        }
        return gift;
    }

    @Override // X.InterfaceC1128210fSt
    public Gift getFansClubJoinGift() {
        List<Gift> list;
        GiftLockInfo giftLockInfo;
        Iterator<GiftPage> it2 = getGiftPageList().iterator();
        loop0: while (true) {
            gift = null;
            if (!it2.hasNext()) {
                break;
            }
            GiftPage next = it2.next();
            if (next == null || (list = next.gifts) == null) {
                list = C13BV.INSTANCE;
            }
            for (Gift gift : list) {
                if (gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 5) {
                    break loop0;
                }
            }
        }
        return gift;
    }

    @Override // X.InterfaceC1128210fSt
    public boolean isEoy() {
        List<Integer> list;
        GiftListResult giftListResult = getGiftListResult();
        if (giftListResult == null || (list = giftListResult.tags) == null) {
            return false;
        }
        for (Integer num : list) {
            if (num != null && num.intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1128210fSt
    public Set<Long> getCurrentEffectSet() {
        return this.currentEffectSet;
    }

    @Override // X.InterfaceC1128210fSt
    public List<AbstractC1126600fQI<? extends AnonymousClass0054>> getCurrentGiftPanelList() {
        return this.currentPanelList;
    }

    @Override // X.InterfaceC1128210fSt
    public C177100m9 getFilterManager() {
        return this.filterManager;
    }

    @Override // X.InterfaceC1128210fSt
    public Map<Long, C1127130fR9> getFreqLimitInfoList() {
        return this.freqLimitInfoList;
    }

    @Override // X.InterfaceC1128210fSt
    public C1127920fSQ getGalleryEntranceInfo() {
        return this.galleryEntranceInfo;
    }

    @Override // X.InterfaceC1128210fSt
    public InterfaceC1128430fTF getGalleryRepository() {
        return this.galleryRepository;
    }

    @Override // X.InterfaceC1128210fSt
    public GiftChallengeProgress getGiftChallengeProgress() {
        return this.giftChallengeProgress;
    }

    @Override // X.InterfaceC1128210fSt
    public C1129650fVD getGiftRepository() {
        return this.giftRepository;
    }

    @Override // X.InterfaceC1128210fSt
    public Map<Integer, LinkedHashSet<Long>> getLockedGiftsMap() {
        return this.lockedGiftsMap;
    }

    @Override // X.InterfaceC1128210fSt
    public C1118340fCy getTeamRankManager() {
        return this.teamRankManager;
    }

    private final Gift createGiftDeepCopy(Gift gift) {
        Gson gson = C19748512Ol.LIZJ;
        try {
            return (Gift) gson.LJII(gson.LJIILL(gift), Gift.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final boolean isPreDownloadVaultGift(Gift gift) {
        List<Integer> list = gift.giftVerticalScenarios;
        if (list == null || !list.contains(8) || !list.contains(33)) {
            return false;
        }
        return true;
    }

    private final void updateDisableGalleryBannerSelection(GiftListResult giftListResult) {
        List<GiftPage> list;
        List<Gift> list2;
        if (giftListResult != null && (list = giftListResult.giftPages) != null) {
            for (GiftPage giftPage : list) {
                if (giftPage != null && (list2 = giftPage.gifts) != null) {
                    for (Gift gift : list2) {
                        if (gift != null && true == gift.disableGalleryBanner) {
                            this.disableGalleryBannerMap.put(Long.valueOf(gift.id), Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    private final void updateFreqList(FreqLimitGiftInfo freqLimitGiftInfo) {
        C1127130fR9 c1127130fR9;
        C1127130fR9 c1127130fR92;
        Map<Long, Integer> map;
        C1127130fR9 c1127130fR93;
        Map<Long, Integer> map2;
        C1127130fR9 c1127130fR94;
        if (freqLimitGiftInfo != null && freqLimitGiftInfo.freqLimitGiftOptions != null) {
            if (getFreqLimitInfoList() == null) {
                this.freqLimitInfoList = new LinkedHashMap();
            }
            if (this.freqLimitGiftOptionList == null) {
                this.freqLimitGiftOptionList = new LinkedHashMap();
            }
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            for (FreqLimitGiftOption freqLimitGiftOption : freqLimitGiftInfo.freqLimitGiftOptions) {
                Map<Long, FreqLimitGiftOption> map3 = this.freqLimitGiftOptionList;
                if (map3 != null) {
                    map3.put(Long.valueOf(freqLimitGiftOption.giftId), freqLimitGiftOption);
                }
                if (room != null) {
                    saveRefreshTime(freqLimitGiftOption.refreshTimeStamp, room.getOwnerUserId(), freqLimitGiftOption.giftId);
                }
                Map<Long, C1127130fR9> freqLimitInfoList = getFreqLimitInfoList();
                if (freqLimitInfoList != null) {
                    c1127130fR9 = freqLimitInfoList.get(Long.valueOf(freqLimitGiftOption.giftId));
                } else {
                    c1127130fR9 = null;
                }
                int i = 1;
                int i2 = 0;
                if (c1127130fR9 != null) {
                    Map<Long, C1127130fR9> freqLimitInfoList2 = getFreqLimitInfoList();
                    if (freqLimitInfoList2 != null && (c1127130fR94 = freqLimitInfoList2.get(Long.valueOf(freqLimitGiftOption.giftId))) != null) {
                        c1127130fR94.LIZJ = freqLimitGiftOption.workSingleAnchor;
                    }
                    if (room != null) {
                        try {
                            if (freqLimitGiftOption.workSingleAnchor) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(room.getOwnerUserId());
                                sbLIZ.append(freqLimitGiftOption.giftId);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                HashMap<String, String> mapLIZIZ = InterfaceC1094160eZy.x1.LIZIZ();
                                if (mapLIZIZ.get(strLIZIZ) != null) {
                                    String str = mapLIZIZ.get(strLIZIZ);
                                    if (str != null) {
                                        i2 = CastIntegerProtector.parseInt(str);
                                    }
                                    Map<Long, C1127130fR9> freqLimitInfoList3 = getFreqLimitInfoList();
                                    if (freqLimitInfoList3 != null && (c1127130fR92 = freqLimitInfoList3.get(Long.valueOf(freqLimitGiftOption.giftId))) != null && (map = c1127130fR92.LIZLLL) != null) {
                                        map.put(Long.valueOf(room.getOwnerUserId()), Integer.valueOf(i2));
                                    }
                                } else {
                                    if (freqLimitGiftOption.refreshTimeStamp > C158B.LIZJ()) {
                                        i = 0;
                                    }
                                    Map<Long, C1127130fR9> freqLimitInfoList4 = getFreqLimitInfoList();
                                    if (freqLimitInfoList4 != null && (c1127130fR93 = freqLimitInfoList4.get(Long.valueOf(freqLimitGiftOption.giftId))) != null && (map2 = c1127130fR93.LIZLLL) != null) {
                                        map2.put(Long.valueOf(room.getOwnerUserId()), Integer.valueOf(i));
                                    }
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJI("GiftManagerKotlin", e);
                        }
                    }
                } else {
                    C1127130fR9 c1127130fR95 = new C1127130fR9();
                    c1127130fR95.LIZ = freqLimitGiftOption.giftId;
                    boolean z = freqLimitGiftOption.workSingleAnchor;
                    c1127130fR95.LIZJ = z;
                    c1127130fR95.LIZIZ = freqLimitGiftOption.frequencyLimit;
                    if (room != null && z) {
                        try {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(room.getOwnerUserId());
                            sbLIZ2.append(freqLimitGiftOption.giftId);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            HashMap<String, String> mapLIZIZ2 = InterfaceC1094160eZy.x1.LIZIZ();
                            if (mapLIZIZ2.get(strLIZIZ2) != null) {
                                String str2 = mapLIZIZ2.get(strLIZIZ2);
                                if (str2 != null) {
                                    i2 = CastIntegerProtector.parseInt(str2);
                                }
                                c1127130fR95.LIZLLL.put(Long.valueOf(room.getOwnerUserId()), Integer.valueOf(i2));
                            } else {
                                if (freqLimitGiftOption.refreshTimeStamp > C158B.LIZJ()) {
                                    i = 0;
                                }
                                c1127130fR95.LIZLLL.put(Long.valueOf(room.getOwnerUserId()), Integer.valueOf(i));
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C20441214yg.LJI("GiftManagerKotlin", e2);
                        }
                    }
                    Map<Long, C1127130fR9> freqLimitInfoList5 = getFreqLimitInfoList();
                    if (freqLimitInfoList5 != null) {
                        freqLimitInfoList5.put(Long.valueOf(freqLimitGiftOption.giftId), c1127130fR95);
                    }
                }
            }
        }
    }

    private final void updateGiftConfigs(GiftListResult giftListResult) {
        GiftConfigs giftConfigs;
        if (giftListResult != null && (giftConfigs = giftListResult.giftConfigs) != null) {
            List<GiftConfigInfo> list = giftConfigs.configInfos;
            boolean z = false;
            if (list != null) {
                for (GiftConfigInfo giftConfigInfo : list) {
                    if (giftConfigInfo.configType == 1) {
                        C1133150far.LIZ = giftConfigInfo.roleConfig;
                        z = true;
                    }
                }
                if (z) {
                    return;
                }
            }
        }
        C1133150far.LIZ = null;
    }

    @Override // X.InterfaceC1128210fSt
    public void addGalleryInfoUpdateListener(InterfaceC1128230fSv interfaceC1128230fSv) {
        synchronized (GiftManagerKotlin.class) {
            try {
                this.galleryInfoUpdateListeners.add(interfaceC1128230fSv);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1128210fSt
    public void cancelGiftListRefresh(long j) {
        C784440Upu.LIZ().LIZIZ(new C0IGX(j));
    }

    @Override // X.InterfaceC1128210fSt
    public int checkTabCanDisplay(int i) {
        List<GiftPage> list;
        GiftListResult giftListResult = this.giftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null) {
            for (GiftPage giftPage : list) {
                if (giftPage != null && giftPage.pageType == i && giftPage.display) {
                    return i;
                }
            }
        }
        return 1;
    }

    @Override // X.InterfaceC1128210fSt
    public void clearFastGift(long j) {
        this.roomFastGiftIdMap.remove(Long.valueOf(j));
        this.roomFastGiftIdMap.remove(0L);
        this.roomFastGiftIdsMap.remove(Long.valueOf(j));
        this.roomFastGiftIdsMap.remove(0L);
    }

    @Override // X.InterfaceC1128210fSt
    public Gift findClosetGift(int i) {
        List<Gift> list;
        GiftLockInfo giftLockInfo;
        int i2;
        List<Long> list2 = LiveGiftSendBecomeGuestBlackList.INSTANCE.getValue().blackList;
        int i3 = Integer.MAX_VALUE;
        Gift gift = null;
        for (GiftPage giftPage : getGiftPageList()) {
            if (giftPage == null || (list = giftPage.gifts) == null) {
                list = C13BV.INSTANCE;
            }
            for (Gift gift2 : list) {
                if (gift2 != null && gift2.isDisplayedOnPanel && gift2.type != 3 && (giftLockInfo = gift2.giftSubInfo) != null && !giftLockInfo.mLock && !list2.contains(Long.valueOf(gift2.id)) && (i2 = gift2.diamondCount) >= i && i2 - i <= i3) {
                    i3 = i2 - i;
                    gift = gift2;
                }
            }
        }
        if (gift != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("find gift value is ");
            sbLIZ.append(i);
            sbLIZ.append(" result value and id is ");
            sbLIZ.append(gift.diamondCount);
            C20441214yg.LJIIIZ("GiftManagerKotlin", C2188811AlT.LIZIZ(sbLIZ));
        }
        return gift;
    }

    @Override // X.InterfaceC1128210fSt
    public Gift findGiftById(long j) {
        int orientation;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            orientation = room.getOrientation();
        } else {
            orientation = 0;
        }
        if (LiveGiftReceivingRefactorSetting.INSTANCE.isAsyncQueue()) {
            C20066713fN<Gift> c20066713fN = this.giftsMapByFindConcurrent.get(Integer.valueOf(orientation));
            if (c20066713fN == null) {
                return null;
            }
            return c20066713fN.LJ(j);
        }
        C20066713fN<Gift> c20066713fN2 = this.giftsMapByFind.get(orientation);
        if (c20066713fN2 == null) {
            return null;
        }
        return c20066713fN2.LJ(j);
    }

    @Override // X.InterfaceC1128210fSt
    public ComboBar getComboBarById(long j) {
        Map<Long, ComboBar> map;
        GiftsInfo giftsInfo = this.currentGiftsInfo;
        if (giftsInfo != null && (map = giftsInfo.comboBar) != null) {
            return map.get(Long.valueOf(j));
        }
        return null;
    }

    @Override // X.InterfaceC1128210fSt
    public Gift getFastGift(long j) {
        Long l;
        Gift giftFindGiftById;
        if (this.roomFastGiftIdMap.containsKey(Long.valueOf(j))) {
            l = this.roomFastGiftIdMap.get(Long.valueOf(j));
        } else {
            l = this.roomFastGiftIdMap.get(0L);
        }
        if (l != null) {
            giftFindGiftById = findGiftById(l.longValue());
            if (giftFindGiftById == null) {
            }
            return giftFindGiftById;
        }
        giftFindGiftById = null;
        C20441214yg.LJ("GiftManagerKotlin", "fastGift == null");
        return giftFindGiftById;
    }

    @Override // X.InterfaceC1128210fSt
    public ImageModel getFastGiftColorfulIcon(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFastGiftColorfulIcon giftsInfo = ");
        sbLIZ.append(this.currentGiftsInfo);
        C20441214yg.LIZIZ("GiftManagerKotlin", C2188811AlT.LIZIZ(sbLIZ));
        GiftsInfo giftsInfo = this.currentGiftsInfo;
        if (giftsInfo != null) {
            return giftsInfo.speedyGiftDefaultIcon;
        }
        return null;
    }

    @Override // X.InterfaceC1128210fSt
    public ImageModel getFastGiftGreyIcon(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFastGiftGreyIcon roomId = ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("GiftManagerKotlin", C2188811AlT.LIZIZ(sbLIZ));
        GiftsInfo giftsInfo = this.currentGiftsInfo;
        if (giftsInfo != null) {
            return giftsInfo.speedyGiftGreyIcon;
        }
        return null;
    }

    public List<Long> getFastGiftIds(long j) {
        List<Long> listLLIIII;
        List<Long> list = this.roomFastGiftIdsMap.get(Long.valueOf(j));
        if (list != null && !list.isEmpty()) {
            return C13LP.LLIIII(list);
        }
        List<Long> list2 = this.roomFastGiftIdsMap.get(0L);
        if (list2 == null || (listLLIIII = C13LP.LLIIII(list2)) == null) {
            return C13BV.INSTANCE;
        }
        return listLLIIII;
    }

    @Override // X.InterfaceC1128210fSt
    public FreqLimitGiftOption getFreqLimitOption(Long l) {
        Map<Long, FreqLimitGiftOption> map = this.freqLimitGiftOptionList;
        if (map != null) {
            return map.get(l);
        }
        return null;
    }

    @Override // X.InterfaceC1128210fSt
    public C1127820fSG getGalleryInfoMap(long j) {
        return this.galleryInfoMap.get(Long.valueOf(j));
    }

    @Override // X.InterfaceC1128210fSt
    public GiftsInfo getGiftIconInfo(long j) {
        if (this.roomGiftInfoMap.containsKey(Long.valueOf(j))) {
            return this.roomGiftInfoMap.get(Long.valueOf(j));
        }
        return this.roomGiftInfoMap.get(0L);
    }

    @Override // X.InterfaceC1128210fSt
    public int getGiftPosition(String str) {
        if (this.currentPanelList.isEmpty()) {
            return -1;
        }
        int i = 1;
        for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : this.currentPanelList) {
            if (abstractC1126600fQI != null) {
                if (!Intrinsics.LJFF(abstractC1126600fQI.LJIILIIL(), str) && abstractC1126600fQI.LIZ != 3) {
                    if (!C01AW.LIZIZ(Integer.valueOf(abstractC1126600fQI.LIZ)) && abstractC1126600fQI.LJIJJ == null) {
                        i++;
                    }
                } else {
                    C01AS c01as = abstractC1126600fQI.LJIJJ;
                    if (c01as != null) {
                        return getGiftPosition(c01as.LIZIZ);
                    }
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // X.InterfaceC1128210fSt
    public EnumC1133020fae getGiftType(Integer num) {
        if (num == null) {
            return EnumC1133020fae.UNKNOWN;
        }
        if (num.intValue() == 1) {
            return EnumC1133020fae.NORMAL_GIFT;
        }
        if (num.intValue() == 4) {
            return EnumC1133020fae.STICKER_GIFT;
        }
        if (num.intValue() == 2) {
            return EnumC1133020fae.SPECIAL_GIFT;
        }
        if (num.intValue() == 21) {
            return EnumC1133020fae.INTERACTIVE_GAME_GIFT;
        }
        if (num.intValue() == 22) {
            return EnumC1133020fae.MUSIC_GIFT;
        }
        return EnumC1133020fae.UNKNOWN;
    }

    @Override // X.InterfaceC1128210fSt
    public String getGiftsHashString(Long l) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        try {
            List<Long> list = this.mappedGiftIds.get(l);
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                for (Long l2 : new ArrayList(list)) {
                    Gift gift = this.giftListCacheWithHash.get(l2);
                    if (gift != null) {
                        jSONObject.put(l2.toString(), gift.giftStructHash);
                    }
                }
            } else {
                for (Map.Entry<Long, Gift> entry : this.giftListCacheWithHash.entrySet()) {
                    long jLongValue = entry.getKey().longValue();
                    jSONObject.put(String.valueOf(jLongValue), entry.getValue().giftStructHash);
                }
            }
            return C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // X.InterfaceC1128210fSt
    public boolean getIsGalleryAllSponsored(long j) {
        return Intrinsics.LJFF(Boolean.TRUE, this.isGalleryAllSponsored.get(Long.valueOf(j)));
    }

    @Override // X.InterfaceC1128210fSt
    public List<Gift> getMatchGameGifts(int i) {
        for (GiftPage giftPage : getGiftPageList()) {
            if (giftPage != null && giftPage.pageType == i) {
                return giftPage.matchGameGifts;
            }
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1128210fSt
    public int getPollGiftIndex(long j) {
        List<GiftPollOption> list;
        GiftPollOption giftPollOption;
        GiftPollInfo giftPollInfo = this.giftPollInfo;
        if (giftPollInfo == null || (list = giftPollInfo.giftPollOptions) == null || (giftPollOption = (GiftPollOption) C13LP.LJJJLZIJ(0, list)) == null) {
            return 0;
        }
        Long l = giftPollOption.giftId;
        long jLongValue = 0;
        if (l != null) {
            jLongValue = l.longValue();
        }
        if (j == jLongValue) {
            return 0;
        }
        return 1;
    }

    @Override // X.InterfaceC1128210fSt
    public int getTabByGiftId(long j) {
        List<GiftPage> list;
        GiftListResult giftListResult = this.giftsMap.get(0);
        if (giftListResult == null || (list = giftListResult.giftPages) == null || list.isEmpty()) {
            return -1;
        }
        InterfaceC1133710fbl.LIZ.getClass();
        if (((C1133940fc8) C1120710fGn.LIZ()).LJIIJ()) {
            return ((GiftPage) ListProtector.get(list, 0)).pageType;
        }
        for (GiftPage giftPage : list) {
            if (giftPage.display) {
                List<Gift> list2 = giftPage.gifts;
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                for (Gift gift : list2) {
                    if (gift != null && gift.id == j) {
                        return giftPage.pageType;
                    }
                }
            }
        }
        return -1;
    }

    @Override // X.InterfaceC1128210fSt
    public int getTabByGiftIdWithoutFirstRecharge(long j) {
        List<GiftPage> list;
        GiftListResult giftListResult = this.giftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null) {
            for (GiftPage giftPage : list) {
                if (giftPage.display) {
                    List<Gift> list2 = giftPage.gifts;
                    if (list2 == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    for (Gift gift : list2) {
                        if (gift != null && gift.id == j) {
                            return giftPage.pageType;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // X.InterfaceC1128210fSt
    public int getTabLocation(int i) {
        return getTabLocation(i, false);
    }

    @Override // X.InterfaceC1128210fSt
    public String getTabName(int i) {
        List<GiftPage> list;
        GiftListResult giftListResult = this.giftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null) {
            for (GiftPage giftPage : list) {
                if (giftPage != null && giftPage.pageType == i) {
                    return giftPage.pageName;
                }
            }
        }
        return "Gift";
    }

    @Override // X.InterfaceC1128210fSt
    public String getTabNameByIndex(int i) {
        List<GiftPage> list;
        GiftPage giftPage;
        String str;
        GiftListResult giftListResult = this.giftsMap.get(0);
        if (giftListResult == null || (list = giftListResult.giftPages) == null || (giftPage = (GiftPage) C13LP.LJJJLZIJ(i, list)) == null || (str = giftPage.pageName) == null) {
            return "Gift";
        }
        return str;
    }

    @Override // X.InterfaceC1128210fSt
    public int getTargetGiftDiamondCount(long j) {
        GiftListResult giftListResult;
        List<GiftPage> list;
        if (j != 0 && (giftListResult = this.giftsMap.get(0)) != null && (list = giftListResult.giftPages) != null) {
            Iterator<GiftPage> it2 = list.iterator();
            while (it2.hasNext()) {
                List<Gift> list2 = it2.next().gifts;
                if (list2 != null) {
                    for (Gift gift : list2) {
                        if (gift != null && gift.id == j) {
                            return gift.diamondCount;
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1128210fSt
    public RiskCtl getTargetRoomGiftRiskCtl(long j) {
        return this.roomRiskCtl.get(Long.valueOf(j));
    }

    @Override // X.InterfaceC1128210fSt
    public boolean isDisableGalleryBannerForGift(Long l) {
        return Intrinsics.LJFF(this.disableGalleryBannerMap.get(l), Boolean.TRUE);
    }

    @Override // X.InterfaceC1128210fSt
    public boolean isDynamicGift(long j) {
        List<GiftPage> list;
        GiftListResult giftListResult = this.giftsMap.get(0);
        if (giftListResult == null || (list = giftListResult.giftPages) == null) {
            return false;
        }
        Iterator<GiftPage> it2 = list.iterator();
        while (it2.hasNext()) {
            List<Gift> list2 = it2.next().gifts;
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            for (Gift gift : list2) {
                if (gift != null && gift.id == j) {
                    ImageModel imageModel = gift.previewImage;
                    if (imageModel == null || C842240X2g.LIZ(imageModel) == null || !(!C842240X2g.LIZ(imageModel).isEmpty())) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC1128210fSt
    public boolean isInteractiveGift(long j) {
        List<GiftPage> list;
        List<Gift> list2;
        GiftListResult giftListResult = this.giftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null) {
            for (GiftPage giftPage : list) {
                if (giftPage != null && giftPage.pageType == 17 && (list2 = giftPage.gifts) != null) {
                    for (Gift gift : list2) {
                        if (gift != null && gift.id == j) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC1128210fSt
    public boolean isPollGift(long j) {
        List<GiftPollOption> list;
        GiftPollOption giftPollOption;
        Long l;
        List<GiftPollOption> list2;
        GiftPollOption giftPollOption2;
        Long l2;
        GiftPollInfo giftPollInfo = this.giftPollInfo;
        if (giftPollInfo == null || (list = giftPollInfo.giftPollOptions) == null || (giftPollOption = (GiftPollOption) C13LP.LJJJLZIJ(0, list)) == null || (l = giftPollOption.giftId) == null) {
            return false;
        }
        long jLongValue = l.longValue();
        GiftPollInfo giftPollInfo2 = this.giftPollInfo;
        if (giftPollInfo2 == null || (list2 = giftPollInfo2.giftPollOptions) == null || (giftPollOption2 = (GiftPollOption) C13LP.LJJJLZIJ(1, list2)) == null || (l2 = giftPollOption2.giftId) == null) {
            return false;
        }
        long jLongValue2 = l2.longValue();
        if (j != jLongValue && j != jLongValue2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1128210fSt
    public boolean isPreviouslySentGift(Long l) {
        List<Long> list;
        GiftsInfo giftsInfo;
        GiftsInfo.ServerStrategyContext serverStrategyContext;
        GiftListResult giftListResult = getGiftListResult();
        if (giftListResult != null && (giftsInfo = giftListResult.giftsInfo) != null && (serverStrategyContext = giftsInfo.serverStrategyContext) != null) {
            list = serverStrategyContext.previousSentGiftIds;
        } else {
            list = null;
        }
        if (list == null || !list.contains(l)) {
            return false;
        }
        return true;
    }

    public boolean isSubscribeGift(long j) {
        List<GiftPage> list;
        List<Gift> list2;
        GiftListResult giftListResult = this.giftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null) {
            for (GiftPage giftPage : list) {
                if (giftPage != null && giftPage.pageType == 15 && (list2 = giftPage.gifts) != null) {
                    for (Gift gift : list2) {
                        if (gift != null && gift.id == j) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void onLeaveInflow(boolean z) {
        if (!z) {
            this.giftListCacheWithHash.clear();
        }
    }

    @Override // X.InterfaceC1128210fSt
    public void registerGiftListListener(InterfaceC1133110fan interfaceC1133110fan) {
        if (LiveGiftFastGiftMemoryLeakFixSetting.INSTANCE.getValue()) {
            this.giftListListeners.addIfAbsent(interfaceC1133110fan);
        } else {
            this.giftListListeners.add(interfaceC1133110fan);
        }
    }

    @Override // X.InterfaceC1128210fSt
    public void removeGalleryInfoUpdateListener(InterfaceC1128230fSv interfaceC1128230fSv) {
        synchronized (GiftManagerKotlin.class) {
            try {
                this.galleryInfoUpdateListeners.remove(interfaceC1128230fSv);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1128210fSt
    public void setGiftChallengeProgress(GiftChallengeProgress giftChallengeProgress) {
        this.giftChallengeProgress = giftChallengeProgress;
    }

    @Override // X.InterfaceC1128210fSt
    public void unRegisterGiftListListener(InterfaceC1133110fan interfaceC1133110fan) {
        this.giftListListeners.remove(interfaceC1133110fan);
    }

    @Override // X.InterfaceC1128210fSt
    public void updateFavoriteGift(List<GiftPage> list) {
        C20441214yg.LIZIZ("favoritegift", "updateFavoriteGift");
        GiftListResult giftListResult = this.giftsMap.get(0);
        if (giftListResult != null && giftListResult.giftPages != null) {
            giftListResult.giftPages = list;
        }
    }

    @Override // X.InterfaceC1128210fSt
    public void updatePanelList(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList) {
        this.currentPanelList = linkedList;
    }

    @Override // X.InterfaceC1128210fSt
    public int getGiftPosition(long j) {
        if (this.currentPanelList.isEmpty()) {
            return -1;
        }
        int i = 0;
        for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : this.currentPanelList) {
            if (abstractC1126600fQI != null) {
                if (!C01AW.LIZIZ(Integer.valueOf(abstractC1126600fQI.LIZ)) && abstractC1126600fQI.LJIJJ == null) {
                    i++;
                }
                if (abstractC1126600fQI.LJI() == j || abstractC1126600fQI.LIZ == 3) {
                    return i;
                }
            }
        }
        return -1;
    }

    private final long getRefreshTime(long j, long j2) {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return j2;
        }
        HashMap<String, String> mapLIZIZ = InterfaceC1094160eZy.y1.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(room.getOwnerUserId());
        sbLIZ.append(j);
        String str = mapLIZIZ.get(C2188811AlT.LIZIZ(sbLIZ));
        if (str != null) {
            try {
                j2 = CastLongProtector.parseLong(str);
                return j2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("GiftManagerKotlin", e);
            }
        }
        return j2;
    }

    private final void internalUpdateGalleryInfo(long j, C1127820fSG c1127820fSG) {
        this.galleryInfoMap.put(Long.valueOf(j), c1127820fSG);
    }

    private final void rebuildGiftsByFindConcurrent(GiftListResult giftListResult, int i) {
        List<Gift> arrayList;
        List<Gift> list;
        Iterable iterable;
        List<GiftPage> list2 = giftListResult.giftPages;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (GiftPage giftPage : list2) {
                if (giftPage == null || (iterable = giftPage.gifts) == null) {
                    iterable = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(iterable, arrayList);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C20066713fN<Gift> c20066713fN = new C20066713fN<>(arrayList.size());
        this.magicContainerId = 0L;
        for (Gift gift : arrayList) {
            if (gift != null) {
                c20066713fN.LIZ(gift.id, gift);
                if (gift.LJFF()) {
                    this.magicContainerId = gift.id;
                }
            }
        }
        List<GiftPage> list3 = giftListResult.giftPages;
        if (list3 != null && (!list3.isEmpty()) && ListProtector.get(list3, 0) != null && (list = ((GiftPage) ListProtector.get(list3, 0)).matchGameGifts) != null && !list.isEmpty()) {
            for (Gift gift2 : list) {
                if (gift2 != null) {
                    c20066713fN.LIZ(gift2.id, gift2);
                }
            }
        }
        this.giftsMapByFindConcurrent.put(Integer.valueOf(i), c20066713fN);
    }

    private final void updateGalleryInfo(long j, GiftListResult giftListResult) {
        Pair pair;
        GiftsInfo.GiftGalleryInfo giftGalleryInfo;
        Map<Long, Gift.GiftSponsorInfo> mapLIZ = C083200Sw.LIZ(giftListResult);
        GiftsInfo giftsInfo = giftListResult.giftsInfo;
        if (giftsInfo != null && (giftGalleryInfo = giftsInfo.giftGalleryInfo) != null) {
            pair = new Pair(giftGalleryInfo.anchorRankingLeague, giftGalleryInfo.galleryRankingLeague);
        } else {
            pair = new Pair("", "");
        }
        internalUpdateGalleryInfo(j, new C1127820fSG(mapLIZ, false, pair, null));
    }

    private final void updateGiftLock(GiftListResult giftListResult, long j) {
        GiftLockInfo giftLockInfo;
        GiftLockInfo giftLockInfo2;
        List<GiftPage> list = giftListResult.giftPages;
        if (j != this.lockedGiftsMapRoomId) {
            getLockedGiftsMap().clear();
        }
        for (GiftPage giftPage : list) {
            List<Gift> list2 = giftPage.gifts;
            if (list2 != null) {
                for (Gift gift : list2) {
                    if (gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 2 && (giftLockInfo2 = gift.giftSubInfo) != null && giftLockInfo2.mLock) {
                        if (!getLockedGiftsMap().containsKey(Integer.valueOf(giftPage.pageType))) {
                            getLockedGiftsMap().put(Integer.valueOf(giftPage.pageType), new LinkedHashSet<>());
                        }
                        LinkedHashSet<Long> linkedHashSet = getLockedGiftsMap().get(Integer.valueOf(giftPage.pageType));
                        if (linkedHashSet != null) {
                            linkedHashSet.add(Long.valueOf(gift.id));
                        }
                    }
                }
            }
        }
        this.lockedGiftsMapRoomId = j;
    }

    private final void updateRiskCtlInfo(GiftListResult giftListResult, long j) {
        RiskCtl riskCtl;
        if (giftListResult == null) {
            return;
        }
        GiftsInfo giftsInfo = giftListResult.giftsInfo;
        if (giftsInfo != null) {
            riskCtl = giftsInfo.riskCtl;
            if (riskCtl != null) {
                this.roomRiskCtl.put(Long.valueOf(j), riskCtl);
            }
            C784440Upu.LIZ().LIZIZ(new C1127380fRY(j, riskCtl));
        }
        riskCtl = null;
        this.roomRiskCtl.remove(Long.valueOf(j));
        C784440Upu.LIZ().LIZIZ(new C1127380fRY(j, riskCtl));
    }

    @Override // X.InterfaceC1128210fSt
    public void cacheGiftListToMap(GiftListResult giftListResult, int i) {
        List<Gift> arrayList;
        List<Gift> list;
        Iterable iterable;
        if (giftListResult == null) {
            return;
        }
        this.giftsMap.put(i, giftListResult);
        this.upgradeGift = null;
        if (LiveGiftReceivingRefactorSetting.INSTANCE.isAsyncQueue()) {
            rebuildGiftsByFindConcurrent(giftListResult, i);
            return;
        }
        C20066713fN<Gift> c20066713fN = this.giftsMapByFind.get(i);
        if (c20066713fN != null) {
            c20066713fN.LIZIZ();
        } else {
            c20066713fN = new C20066713fN<>((Object) null);
            this.giftsMapByFind.append(i, c20066713fN);
        }
        List<GiftPage> list2 = giftListResult.giftPages;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (GiftPage giftPage : list2) {
                if (giftPage == null || (iterable = giftPage.gifts) == null) {
                    iterable = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(iterable, arrayList);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        this.magicContainerId = 0L;
        for (Gift gift : arrayList) {
            if (gift != null) {
                c20066713fN.LIZ(gift.id, gift);
                if (gift.LJFF()) {
                    this.magicContainerId = gift.id;
                }
            }
        }
        List<GiftPage> list3 = giftListResult.giftPages;
        if (list3 != null && ListProtector.get(list3, 0) != null && (list = ((GiftPage) ListProtector.get(giftListResult.giftPages, 0)).matchGameGifts) != null && !list.isEmpty()) {
            for (Gift gift2 : list) {
                if (gift2 != null) {
                    c20066713fN.LIZ(gift2.id, gift2);
                }
            }
        }
    }

    @Override // X.InterfaceC1128210fSt
    public int getTabLocation(int i, boolean z) {
        List<GiftPage> list;
        int i2 = C1130100fVw.LIZ.LJFF;
        int iLIZIZ = C1128590fTV.LIZIZ(i2);
        if (iLIZIZ > 0) {
            return iLIZIZ;
        }
        int i3 = 0;
        GiftListResult giftListResult = this.giftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null) {
            for (GiftPage giftPage : list) {
                if (!z || giftPage.display) {
                    i3++;
                    if (giftPage.pageType == i2) {
                        return i3;
                    }
                }
            }
            if (i == 16) {
                if (C1121600fIE.LIZLLL() || z) {
                    return i3 + 1;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    @Override // X.InterfaceC1128210fSt
    public int getTabLocationByType(int i, boolean z) {
        List<GiftPage> list;
        int iLIZIZ = C1128590fTV.LIZIZ(i);
        if (iLIZIZ > 0) {
            return iLIZIZ;
        }
        int i2 = 0;
        GiftListResult giftListResult = this.giftsMap.get(0);
        if (giftListResult == null || (list = giftListResult.giftPages) == null || i == -1) {
            return -1;
        }
        for (GiftPage giftPage : list) {
            if (!z || giftPage.display) {
                i2++;
                if (giftPage.pageType == i) {
                    return i2;
                }
            }
        }
        if (i == 16 && (C1121600fIE.LIZLLL() || z)) {
            return i2 + 1;
        }
        return -1;
    }

    @Override // X.InterfaceC1128210fSt
    public boolean isGiftLimited(long j, long j2) {
        C1127130fR9 c1127130fR9;
        Integer numValueOf;
        if (getFreqLimitInfoList() == null) {
            return false;
        }
        Map<Long, C1127130fR9> freqLimitInfoList = getFreqLimitInfoList();
        if (freqLimitInfoList != null) {
            c1127130fR9 = freqLimitInfoList.get(Long.valueOf(j));
        } else {
            c1127130fR9 = null;
        }
        FreqLimitGiftOption freqLimitOption = Companion.LJ().getFreqLimitOption(Long.valueOf(j));
        if (c1127130fR9 != null && freqLimitOption != null) {
            if (!c1127130fR9.LIZJ) {
                numValueOf = Integer.valueOf(c1127130fR9.LIZIZ);
            } else {
                numValueOf = (Integer) ((LinkedHashMap) c1127130fR9.LIZLLL).get(Long.valueOf(j2));
            }
            long refreshTime = freqLimitOption.refreshTimeStamp;
            if (getGiftPageList().isEmpty()) {
                refreshTime = getRefreshTime(j, refreshTime);
            }
            if (numValueOf != null && numValueOf.intValue() <= 0 && refreshTime > System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1128210fSt
    public void saveFastGifts(long j, List<Long> list) {
        if (list.isEmpty()) {
            return;
        }
        this.roomFastGiftIdsMap.put(Long.valueOf(j), new CopyOnWriteArrayList(list));
        this.roomFastGiftIdsMap.put(0L, new CopyOnWriteArrayList(list));
    }

    @Override // X.InterfaceC1128210fSt
    public void updateGalleryAllSponsored(long j, boolean z) {
        this.isGalleryAllSponsored.put(Long.valueOf(j), Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1128210fSt
    public void updateGalleryInfoMap(long j, SponsorshipInfo sponsorshipInfo) {
        C1127820fSG c1127820fSG;
        Gift.GiftSponsorInfo giftSponsorInfo;
        if (sponsorshipInfo == null || (c1127820fSG = this.galleryInfoMap.get(Long.valueOf(j))) == null || (giftSponsorInfo = c1127820fSG.LIZ.get(Long.valueOf(sponsorshipInfo.giftId))) == null) {
            return;
        }
        giftSponsorInfo.canSponsor = sponsorshipInfo.canSponsor;
        giftSponsorInfo.currentCount = sponsorshipInfo.currentCount;
        giftSponsorInfo.leftCountToSponsor = sponsorshipInfo.leftCountToSponsor;
        giftSponsorInfo.sponsorCount = sponsorshipInfo.sponsorCount;
        giftSponsorInfo.sponsorId = sponsorshipInfo.sponsorId;
        internalUpdateGalleryInfo(j, c1127820fSG);
        synchronized (GiftManagerKotlin.class) {
            try {
                Iterator<InterfaceC1128230fSv> it2 = this.galleryInfoUpdateListeners.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(c1127820fSG);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void updateGiftsInfo(GiftListResult giftListResult, long j) {
        if (giftListResult == null) {
            return;
        }
        GiftsInfo giftsInfo = giftListResult.giftsInfo;
        this.currentGiftsInfo = giftsInfo;
        if (giftsInfo == null) {
            C784440Upu.LIZ().LIZIZ(new C1121330fHn(0L, null));
            return;
        }
        this.galleryEntranceInfo = new C1127920fSQ(true, giftsInfo.panelGiftGalleryIcon, giftsInfo.giftGalleryDetailPageSchemeUrl);
        setGiftChallengeProgress(giftsInfo.giftChallengeProgress);
        notifyFastGiftModule(j, giftsInfo.mFastGiftId, giftsInfo.speedyGiftGreyIcon, giftsInfo.speedyGiftDefaultIcon);
        notifyGiftIconModule(j, giftsInfo.giftIconInfo, giftsInfo);
    }

    @Override // X.InterfaceC1128210fSt
    public void updateGalleryInfoMap(long j, Pair<String, String> pair) {
        boolean z;
        ImageModel imageModel;
        Map<Long, Gift.GiftSponsorInfo> mapLJ = C2097608Jq.LJ();
        C1127820fSG c1127820fSG = this.galleryInfoMap.get(Long.valueOf(j));
        if (c1127820fSG != null) {
            mapLJ = c1127820fSG.LIZ;
            z = c1127820fSG.LIZIZ;
            imageModel = c1127820fSG.LIZLLL;
        } else {
            z = false;
            imageModel = null;
        }
        internalUpdateGalleryInfo(j, new C1127820fSG(mapLJ, z, pair, imageModel));
    }

    private final void notifyGiftIconModule(long j, GiftIconInfo giftIconInfo, GiftsInfo giftsInfo) {
        this.roomGiftInfoMap.put(Long.valueOf(j), giftsInfo);
        this.roomGiftInfoMap.put(0L, giftsInfo);
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (giftIconInfo.mValidStartAt >= jCurrentTimeMillis || giftIconInfo.mValidEndAt <= jCurrentTimeMillis) {
            this.roomGiftInfoMap.remove(Long.valueOf(j));
            this.roomGiftInfoMap.remove(0L);
        }
        C784440Upu.LIZ().LIZIZ(new C1121330fHn(j, giftsInfo));
    }

    private final void saveRefreshTime(long j, long j2, long j3) {
        C20337914i1<HashMap<String, String>> c20337914i1 = InterfaceC1094160eZy.y1;
        HashMap<String, String> mapLIZIZ = c20337914i1.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j2);
        sbLIZ.append(j3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (mapLIZIZ.size() > 50) {
            mapLIZIZ.clear();
        }
        mapLIZIZ.put(strLIZIZ, String.valueOf(j));
        c20337914i1.LJFF(mapLIZIZ);
    }

    @Override // X.InterfaceC1128210fSt
    public void updateFreqList(long j, int i, long j2) {
        Map<Long, C1127130fR9> freqLimitInfoList;
        C1127130fR9 c1127130fR9;
        if (getFreqLimitInfoList() != null && getFreqLimitOption(Long.valueOf(j)) != null && (freqLimitInfoList = getFreqLimitInfoList()) != null && (c1127130fR9 = freqLimitInfoList.get(Long.valueOf(j))) != null) {
            if (!c1127130fR9.LIZJ) {
                c1127130fR9.LIZIZ = i;
                return;
            }
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(j2);
                sbLIZ.append(j);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C20337914i1<HashMap<String, String>> c20337914i1 = InterfaceC1094160eZy.x1;
                HashMap<String, String> mapLIZIZ = c20337914i1.LIZIZ();
                if (mapLIZIZ.size() > 50) {
                    mapLIZIZ.clear();
                }
                mapLIZIZ.put(strLIZIZ, String.valueOf(i));
                c20337914i1.LJFF(mapLIZIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("GiftManagerKotlin", e);
            }
            c1127130fR9.LIZLLL.put(Long.valueOf(j2), Integer.valueOf(i));
        }
    }

    private final void notifyFastGiftModule(long j, long j2, ImageModel imageModel, ImageModel imageModel2) {
        this.roomFastGiftIdMap.put(Long.valueOf(j), Long.valueOf(j2));
        this.roomFastGiftIdMap.put(0L, Long.valueOf(j2));
        C784440Upu.LIZ().LIZIZ(new C1123110fKf(j, j2, imageModel, imageModel2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd A[PHI: r11
      0x00dd: PHI (r11v1 boolean) = (r11v0 boolean), (r11v3 boolean) binds: [B:64:0x00d9, B:8:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void getDownloadEffectList(boolean r13, long r14, java.util.List<? extends com.bytedance.android.livesdk.gift.model.GiftPage> r16, java.util.List<java.lang.Long> r17, java.util.List<com.bytedance.android.livesdk.model.Gift> r18) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManagerKotlin.getDownloadEffectList(boolean, long, java.util.List, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onSyncGiftListSuccess(com.bytedance.android.livesdk.gift.model.GiftListResult r22, java.lang.String r23, int r24, long r25, X.AbstractC1132980faa r27) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManagerKotlin.onSyncGiftListSuccess(com.bytedance.android.livesdk.gift.model.GiftListResult, java.lang.String, int, long, X.0faa):void");
    }

    @Override // X.InterfaceC1128210fSt
    public void updateGalleryInfoMap(long j, Map<Long, Gift.GiftSponsorInfo> map, boolean z, Pair<String, String> pair, ImageModel imageModel) {
        if (map == null) {
            return;
        }
        C1127820fSG c1127820fSG = new C1127820fSG(map, z, pair, imageModel);
        internalUpdateGalleryInfo(j, c1127820fSG);
        synchronized (GiftManagerKotlin.class) {
            try {
                for (InterfaceC1128230fSv interfaceC1128230fSv : this.galleryInfoUpdateListeners) {
                    C20441214yg.LIZIZ("wangyi", "galleryInfoUpdateListeners call()");
                    interfaceC1128230fSv.LIZ(c1127820fSG);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1128210fSt
    public void onGiftListFail(Throwable th, long j, int i, boolean z, long j2, WeakReference<AbstractC1132980faa> weakReference, String str) {
        boolean z2;
        String str2;
        String message;
        if (j != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C20441214yg.LJFF("gift", "syncgiftlist error! ", th);
        if (z2) {
            if (th != null) {
                message = th.getMessage();
            } else {
                message = null;
            }
            C1131270fXp.LJI(message);
        }
        C1133120fao c1133120faoLIZ = C1133160fas.LIZ(th);
        int i2 = c1133120faoLIZ.LIZ;
        if (!GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled() && ((ArrayList) C1133460fbM.LIZ).isEmpty()) {
            C1138640fji.LJIIIZ(i, j, null, null);
        }
        C1131070fXV.LJII(i2, i, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j2), c1133120faoLIZ.LIZIZ, null, str);
        AbstractC1132980faa abstractC1132980faa = weakReference.get();
        if (abstractC1132980faa != null) {
            abstractC1132980faa.LIZ(i2, c1133120faoLIZ.LIZIZ);
        }
        if (th == null) {
            str2 = "Throwable is null";
        } else {
            str2 = c1133120faoLIZ.LIZIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch gift list fail ");
        sbLIZ.append(str2);
        C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
        C784440Upu.LIZ().LIZIZ(new C1133130fap(false));
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0170  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.bytedance.android.livesdk.model.Gift$GiftSponsorInfo, com.bytedance.android.livesdk.model.GiftPanelBanner] */
    /* JADX WARN: Type inference failed for: r10v2 */
    @Override // X.InterfaceC1128210fSt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGiftListSuccess(long r37, long r39, boolean r41, int r42, X.C0WIY<com.bytedance.android.livesdk.gift.model.GiftListResult, java.lang.String> r43, X.AbstractC1132980faa r44, java.lang.String r45, java.lang.String r46) {
        /*
            Method dump skipped, instruction units count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManagerKotlin.onGiftListSuccess(long, long, boolean, int, X.0WIY, X.0faa, java.lang.String, java.lang.String):void");
    }
}
