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
import X.C1125800fP0;
import X.C1127130fR9;
import X.C1127380fRY;
import X.C1127820fSG;
import X.C1127920fSQ;
import X.C1128450fTH;
import X.C1128590fTV;
import X.C1129650fVD;
import X.C1130100fVw;
import X.C1131070fXV;
import X.C1131270fXp;
import X.C1132780faG;
import X.C1133100fam;
import X.C1133120fao;
import X.C1133130fap;
import X.C1133150far;
import X.C1133160fas;
import X.C1133460fbM;
import X.C1133940fc8;
import X.C1138640fji;
import X.C1289620jfE;
import X.C1498850p6h;
import X.C158B;
import X.C177100m9;
import X.C19748512Ol;
import X.C1AF0;
import X.C1C7U;
import X.C20066713fN;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C784440Upu;
import X.C786410Ut5;
import X.C842240X2g;
import X.C930940aKi;
import X.EnumC1125400fOM;
import X.EnumC1133020fae;
import X.InterfaceC1094160eZy;
import X.InterfaceC1128210fSt;
import X.InterfaceC1128230fSv;
import X.InterfaceC1128430fTF;
import X.InterfaceC1133110fan;
import X.InterfaceC1133710fbl;
import Y.AObjectS119S0000000_17;
import Y.ARunnableS94S0000000_17;
import android.util.SparseArray;
import android.util.SparseLongArray;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dataChannel.GlobalInflowMessage;
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
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftJavaToKotlinGiftManagerSetting;
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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
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
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class GiftManager implements InterfaceC1128210fSt {
    public static GiftManager sInst;
    public C1127920fSQ mBannerGiftGalleryInfo;
    public ConcurrentHashMap<Long, Long> mRoomFastGiftIdMap = new ConcurrentHashMap<>(20);
    public ConcurrentHashMap<Long, List<Long>> mRoomFastGiftIdsMap = new ConcurrentHashMap<>(20);
    public ConcurrentHashMap<Long, GiftsInfo> mRoomGiftInfoMap = new ConcurrentHashMap<>(20);
    public final ConcurrentHashMap<Long, RiskCtl> mRoomRiskCtl = new ConcurrentHashMap<>(20);
    public LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> currentPanelList = new LinkedList<>();
    public GiftPollInfo mGiftPollInfo = null;
    public FreqLimitGiftInfo freqLimitGiftInfo = null;
    public C1118340fCy teamRankManager = new C1118340fCy();
    public HashMap<Long, C1127130fR9> freqLimitInfoList = null;
    public HashMap<Long, FreqLimitGiftOption> freqLimitGiftOptionList = null;
    public Set<Long> currentEffectSet = new HashSet(600);
    public GiftChallengeProgress giftChallengeProgress = null;
    public final ConcurrentHashMap<Long, Gift> giftListCacheWithHash = new ConcurrentHashMap<>(600);
    public C1498850p6h<Long, List<Long>> mappedGiftIds = new C1498850p6h<>(15, 10);
    public Long magicContainerId = 0L;
    public final Map<Long, C1127820fSG> galleryInfoMap = new HashMap();
    public final Map<Long, Boolean> disableGalleryBannerMap = new HashMap();
    public final Map<Long, Boolean> isGalleryAllSponsored = new HashMap();
    public C1129650fVD giftRepository = new C1129650fVD();
    public InterfaceC1128430fTF galleryRepository = new C1132780faG();
    public C177100m9 filterManager = new C177100m9();
    public GiftsInfo currentGiftsInfo = null;
    public final SparseArray<GiftListResult> mGiftsMap = new SparseArray<>();
    public final SparseArray<C20066713fN<Gift>> mGiftsMapByFind = new SparseArray<>();
    public final ConcurrentHashMap<Integer, C20066713fN<Gift>> mGiftsMapByFindConcurrent = new ConcurrentHashMap<>();
    public final SparseLongArray mGiftListRoomIdMap = new SparseLongArray();
    public Gift upgradeGift = null;
    public final CopyOnWriteArrayList<InterfaceC1133110fan> mGiftListListeners = new CopyOnWriteArrayList<>();
    public Map<Integer, LinkedHashSet<Long>> lockedGiftsMap = new HashMap();
    public long lockedGiftsMapRoomId = -1;
    public List<InterfaceC1128230fSv> galleryInfoUpdateListeners = new ArrayList();

    public static synchronized InterfaceC1128210fSt _inst() {
        if (sInst == null) {
            sInst = new GiftManager();
        }
        C1133100fam.LIZ.getClass();
        if (C1133100fam.LIZ().getExitClearGiftCache()) {
            C1289620jfE.LIZJ(new ARunnableS94S0000000_17(6));
        }
        return sInst;
    }

    public static /* synthetic */ void lambda$_inst$1() {
        C1C7U.LIZ("GiftManager@1ea4._inst$1L");
        DataChannelGlobal.LLILZ.CQ2(GlobalInflowMessage.class, sInst, new AObjectS119S0000000_17(4));
        C1C7U.LIZIZ("GiftManager@1ea4._inst$1L");
    }

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
        this.mGiftsMap.clear();
        this.mGiftListRoomIdMap.clear();
    }

    @Override // X.InterfaceC1128210fSt
    public long getCachedGiftListRoomId() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return this.mGiftListRoomIdMap.get(room != null ? room.getOrientation() : 0, 0L);
    }

    @Override // X.InterfaceC1128210fSt
    public Gift getCommunityGift() {
        List<Integer> list;
        ArrayList<Gift> arrayList = new ArrayList();
        List<GiftPage> giftPageList = getGiftPageList();
        if (giftPageList != null) {
            Iterator<GiftPage> it2 = giftPageList.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(it2.next().gifts);
            }
        }
        for (Gift gift : arrayList) {
            if (gift != null && (list = gift.giftVerticalScenarios) != null && list.contains(36) && gift.isDisplayedOnPanel) {
                return gift;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1128210fSt
    public List<GiftPage> getDataFromMemoryCache() {
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        return giftListResult != null ? giftListResult.giftPages : new ArrayList();
    }

    @Override // X.InterfaceC1128210fSt
    public Gift getFansClubJoinGift() {
        GiftLockInfo giftLockInfo;
        ArrayList<Gift> arrayList = new ArrayList();
        List<GiftPage> giftPageList = getGiftPageList();
        if (giftPageList != null) {
            Iterator<GiftPage> it2 = giftPageList.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(it2.next().gifts);
            }
        }
        for (Gift gift : arrayList) {
            if (gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 5) {
                return gift;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1128210fSt
    public long getFirstShowSubscribeGiftId() {
        List<GiftPage> list;
        List<Gift> list2;
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null && list.size() != 0) {
            for (GiftPage giftPage : giftListResult.giftPages) {
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
        return this.mGiftsMap.get(room != null ? room.getOrientation() : 0);
    }

    @Override // X.InterfaceC1128210fSt
    public List<GiftPage> getGiftPageList() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        GiftListResult giftListResult = this.mGiftsMap.get(room != null ? room.getOrientation() : 0);
        return (giftListResult == null || C0IKQ.LIZ(giftListResult.giftPages)) ? new ArrayList() : new ArrayList(giftListResult.giftPages);
    }

    @Override // X.InterfaceC1128210fSt
    public C1086850eOB getPollGifts() {
        List<GiftPollOption> list;
        Long l;
        GiftPollInfo giftPollInfo = this.mGiftPollInfo;
        if (giftPollInfo == null || (list = giftPollInfo.giftPollOptions) == null || list.size() != 2) {
            return null;
        }
        List<GiftPollOption> list2 = this.mGiftPollInfo.giftPollOptions;
        GiftPollOption giftPollOption = (GiftPollOption) ListProtector.get(list2, 0);
        GiftPollOption giftPollOption2 = (GiftPollOption) ListProtector.get(list2, 1);
        if (giftPollOption == null || giftPollOption2 == null || (l = giftPollOption.giftId) == null || giftPollOption2.giftId == null) {
            return null;
        }
        return new C1086850eOB(findGiftById(l.longValue()), findGiftById(giftPollOption2.giftId.longValue()), ((GiftPollOption) ListProtector.get(list2, 0)).resultImage, ((GiftPollOption) ListProtector.get(list2, 1)).resultImage);
    }

    @Override // X.InterfaceC1128210fSt
    public List<Gift> getPreDownloadEffectGiftList() {
        ArrayList arrayList = new ArrayList();
        for (GiftPage giftPage : getGiftPageList()) {
            List<Gift> list = giftPage.gifts;
            if (list != null && !list.isEmpty()) {
                for (Gift gift : giftPage.gifts) {
                    if (LiveGiftPreDownloadInteractiveAssetSetting.INSTANCE.isEnable() && gift != null && gift.LIZLLL() && gift.primaryEffectId > 0) {
                        arrayList.add(gift);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1128210fSt
    public Gift getUserLevelUpgradeGift() {
        GiftLockInfo giftLockInfo;
        Gift gift = this.upgradeGift;
        if (gift != null) {
            return gift;
        }
        ArrayList<Gift> arrayList = new ArrayList();
        List<GiftPage> giftPageList = getGiftPageList();
        if (giftPageList != null) {
            Iterator<GiftPage> it2 = giftPageList.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(it2.next().gifts);
            }
        }
        for (Gift gift2 : arrayList) {
            if (gift2 != null && (giftLockInfo = gift2.giftSubInfo) != null && giftLockInfo.mLockType == 8 && gift2.isDisplayedOnPanel) {
                this.upgradeGift = gift2;
                return gift2;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1128210fSt
    public List<Gift> getVaultGifts() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Gift> arrayList2 = new ArrayList();
        List<GiftPage> giftPageList = getGiftPageList();
        if (giftPageList != null) {
            Iterator<GiftPage> it2 = giftPageList.iterator();
            while (it2.hasNext()) {
                arrayList2.addAll(it2.next().gifts);
            }
        }
        for (Gift gift : arrayList2) {
            List<Integer> list = gift.giftVerticalScenarios;
            if (list != null && list.contains(8)) {
                arrayList.add(gift);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1128210fSt
    public boolean hideBottomBar() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        GiftListResult giftListResult = this.mGiftsMap.get(room != null ? room.getOrientation() : 0);
        if (giftListResult != null) {
            return giftListResult.giftsInfo.hideRecharge;
        }
        return false;
    }

    @Override // X.InterfaceC1128210fSt
    public void removeAllGalleryInfoListener() {
        synchronized (GiftManager.class) {
            try {
                this.galleryInfoUpdateListeners.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static InterfaceC1128210fSt inst() {
        return LiveGiftJavaToKotlinGiftManagerSetting.isEnabled() ? GiftManagerKotlin.Companion.LJ() : _inst();
    }

    @Override // X.InterfaceC1128210fSt
    public boolean isEoy() {
        List<Integer> list;
        GiftListResult giftListResult = getGiftListResult();
        if (giftListResult == null || (list = giftListResult.tags) == null) {
            return false;
        }
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().intValue() == 1) {
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
    public C1127920fSQ getGalleryEntranceInfo() {
        return this.mBannerGiftGalleryInfo;
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
    public Long getMagicContainerId() {
        return this.magicContainerId;
    }

    @Override // X.InterfaceC1128210fSt
    public C1118340fCy getTeamRankManager() {
        return this.teamRankManager;
    }

    @Override // X.InterfaceC1128210fSt
    public HashMap<Long, C1127130fR9> getFreqLimitInfoList() {
        return this.freqLimitInfoList;
    }

    private Gift createGiftDeepCopy(Gift gift) {
        Gson gson = C19748512Ol.LIZJ;
        try {
            return (Gift) gson.LJII(gson.LJIILL(gift), Gift.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void filterFirstRechargeGift(Collection<? extends Gift> collection) {
        if (collection == null) {
            return;
        }
        InterfaceC1133710fbl.LIZ.getClass();
        long jLJI = ((C1133940fc8) C1120710fGn.LIZ()).LJI();
        Iterator<? extends Gift> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (it2.next().id == jLJI) {
                it2.remove();
            }
        }
    }

    public static void filterNotDisplayedOnPanel(Collection<? extends Gift> collection) {
        if (collection == null) {
            return;
        }
        Iterator<? extends Gift> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!it2.next().isDisplayedOnPanel) {
                it2.remove();
            }
        }
    }

    private boolean isPreDownloadVaultGift(Gift gift) {
        List<Integer> list = gift.giftVerticalScenarios;
        if (list != null && list.contains(8) && gift.giftVerticalScenarios.contains(33)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Unit lambda$_inst$0(Boolean bool) {
        sInst.onLeaveInflow(bool.booleanValue());
        return Unit.LIZ;
    }

    private void onLeaveInflow(boolean z) {
        if (!z) {
            this.giftListCacheWithHash.clear();
        }
    }

    private void updateDisableGalleryBannerSelection(GiftListResult giftListResult) {
        List<GiftPage> list;
        List<Gift> list2;
        if (giftListResult != null && (list = giftListResult.giftPages) != null) {
            for (GiftPage giftPage : list) {
                if (giftPage != null && (list2 = giftPage.gifts) != null) {
                    for (Gift gift : list2) {
                        if (gift != null) {
                            Boolean bool = Boolean.TRUE;
                            if (bool.equals(Boolean.valueOf(gift.disableGalleryBanner))) {
                                this.disableGalleryBannerMap.put(Long.valueOf(gift.id), bool);
                            }
                        }
                    }
                }
            }
        }
    }

    private void updateFreqList(FreqLimitGiftInfo freqLimitGiftInfo) {
        if (freqLimitGiftInfo != null && freqLimitGiftInfo.freqLimitGiftOptions != null) {
            if (this.freqLimitInfoList == null) {
                this.freqLimitInfoList = new HashMap<>();
            }
            if (this.freqLimitGiftOptionList == null) {
                this.freqLimitGiftOptionList = new HashMap<>();
            }
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            for (FreqLimitGiftOption freqLimitGiftOption : freqLimitGiftInfo.freqLimitGiftOptions) {
                this.freqLimitGiftOptionList.put(Long.valueOf(freqLimitGiftOption.giftId), freqLimitGiftOption);
                if (room != null) {
                    saveRefreshTime(freqLimitGiftOption.refreshTimeStamp, room.getOwnerUserId(), freqLimitGiftOption.giftId);
                }
                int i = 0;
                if (this.freqLimitInfoList.get(Long.valueOf(freqLimitGiftOption.giftId)) != null) {
                    C1127130fR9 c1127130fR9 = this.freqLimitInfoList.get(Long.valueOf(freqLimitGiftOption.giftId));
                    boolean z = freqLimitGiftOption.workSingleAnchor;
                    c1127130fR9.LIZJ = z;
                    if (room != null && z) {
                        try {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(String.valueOf(room.getOwnerUserId()));
                            sbLIZ.append(freqLimitGiftOption.giftId);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            HashMap<String, String> mapLIZIZ = InterfaceC1094160eZy.x1.LIZIZ();
                            if (mapLIZIZ.get(strLIZIZ) != null) {
                                this.freqLimitInfoList.get(Long.valueOf(freqLimitGiftOption.giftId)).LIZLLL.put(Long.valueOf(room.getOwnerUserId()), Integer.valueOf(CastIntegerProtector.parseInt(mapLIZIZ.get(strLIZIZ))));
                            } else {
                                if (freqLimitGiftOption.refreshTimeStamp <= C158B.LIZJ()) {
                                    i = 1;
                                }
                                this.freqLimitInfoList.get(Long.valueOf(freqLimitGiftOption.giftId)).LIZLLL.put(Long.valueOf(room.getOwnerUserId()), Integer.valueOf(i));
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } else {
                    C1127130fR9 c1127130fR92 = new C1127130fR9();
                    c1127130fR92.LIZ = freqLimitGiftOption.giftId;
                    boolean z2 = freqLimitGiftOption.workSingleAnchor;
                    c1127130fR92.LIZJ = z2;
                    c1127130fR92.LIZIZ = freqLimitGiftOption.frequencyLimit;
                    if (room != null && z2) {
                        try {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(String.valueOf(room.getOwnerUserId()));
                            sbLIZ2.append(freqLimitGiftOption.giftId);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            HashMap<String, String> mapLIZIZ2 = InterfaceC1094160eZy.x1.LIZIZ();
                            if (mapLIZIZ2.get(strLIZIZ2) != null) {
                                c1127130fR92.LIZLLL.put(Long.valueOf(room.getOwnerUserId()), Integer.valueOf(CastIntegerProtector.parseInt(mapLIZIZ2.get(strLIZIZ2))));
                            } else {
                                if (freqLimitGiftOption.refreshTimeStamp <= C158B.LIZJ()) {
                                    i = 1;
                                }
                                c1127130fR92.LIZLLL.put(Long.valueOf(room.getOwnerUserId()), Integer.valueOf(i));
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                    this.freqLimitInfoList.put(Long.valueOf(freqLimitGiftOption.giftId), c1127130fR92);
                }
            }
        }
    }

    private void updateGiftConfigs(GiftListResult giftListResult) {
        GiftConfigs giftConfigs;
        List<GiftConfigInfo> list;
        boolean z = false;
        if (giftListResult != null && (giftConfigs = giftListResult.giftConfigs) != null && (list = giftConfigs.configInfos) != null) {
            for (GiftConfigInfo giftConfigInfo : list) {
                if (giftConfigInfo != null && giftConfigInfo.configType == 1) {
                    C1133150far.LIZ = giftConfigInfo.roleConfig;
                    z = true;
                }
            }
            if (z) {
                return;
            }
        }
        C1133150far.LIZ = null;
    }

    @Override // X.InterfaceC1128210fSt
    public void addGalleryInfoUpdateListener(InterfaceC1128230fSv interfaceC1128230fSv) {
        synchronized (GiftManager.class) {
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
        GiftListResult giftListResult = this.mGiftsMap.get(0);
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
        this.mRoomFastGiftIdMap.remove(Long.valueOf(j));
        this.mRoomFastGiftIdMap.remove(0L);
        this.mRoomFastGiftIdsMap.remove(Long.valueOf(j));
        this.mRoomFastGiftIdsMap.remove(0L);
    }

    @Override // X.InterfaceC1128210fSt
    public Gift findClosetGift(int i) {
        GiftLockInfo giftLockInfo;
        int i2;
        ArrayList<Gift> arrayList = new ArrayList();
        List<GiftPage> giftPageList = getGiftPageList();
        if (giftPageList != null) {
            Iterator<GiftPage> it2 = giftPageList.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(it2.next().gifts);
            }
        }
        List<Long> list = LiveGiftSendBecomeGuestBlackList.INSTANCE.getValue().blackList;
        int i3 = Integer.MAX_VALUE;
        Gift gift = null;
        for (Gift gift2 : arrayList) {
            if (gift2.isDisplayedOnPanel && gift2.type != 3 && (giftLockInfo = gift2.giftSubInfo) != null && !giftLockInfo.mLock && !list.contains(Long.valueOf(gift2.id)) && (i2 = gift2.diamondCount) >= i && i2 - i <= i3) {
                gift = gift2;
                i3 = i2 - i;
            }
        }
        if (gift != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("find gift value is ");
            sbLIZ.append(i);
            sbLIZ.append(" result value and id is ");
            sbLIZ.append(gift.diamondCount);
            C20441214yg.LJIIIZ("GiftManager", C2188811AlT.LIZIZ(sbLIZ));
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
            C20066713fN<Gift> c20066713fN = this.mGiftsMapByFindConcurrent.get(Integer.valueOf(orientation));
            if (c20066713fN == null) {
                return null;
            }
            return c20066713fN.LJ(j);
        }
        C20066713fN<Gift> c20066713fN2 = this.mGiftsMapByFind.get(orientation);
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
        if (this.mRoomFastGiftIdMap.containsKey(Long.valueOf(j))) {
            l = this.mRoomFastGiftIdMap.get(Long.valueOf(j));
        } else {
            l = this.mRoomFastGiftIdMap.get(0L);
        }
        if (l != null) {
            giftFindGiftById = findGiftById(l.longValue());
            if (giftFindGiftById == null) {
            }
            return giftFindGiftById;
        }
        giftFindGiftById = null;
        C20441214yg.LJ("GiftManager", "fastGift == null");
        return giftFindGiftById;
    }

    @Override // X.InterfaceC1128210fSt
    public ImageModel getFastGiftColorfulIcon(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFastGiftColorfulIcon giftsInfo = ");
        sbLIZ.append(this.currentGiftsInfo);
        C20441214yg.LIZIZ("GiftManager", C2188811AlT.LIZIZ(sbLIZ));
        GiftsInfo giftsInfo = this.currentGiftsInfo;
        if (giftsInfo == null) {
            return null;
        }
        return giftsInfo.speedyGiftDefaultIcon;
    }

    @Override // X.InterfaceC1128210fSt
    public ImageModel getFastGiftGreyIcon(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFastGiftGreyIcon roomId = ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("GiftManager", C2188811AlT.LIZIZ(sbLIZ));
        GiftsInfo giftsInfo = this.currentGiftsInfo;
        if (giftsInfo == null) {
            return null;
        }
        return giftsInfo.speedyGiftGreyIcon;
    }

    public List<Long> getFastGiftIds(long j) {
        List<Long> list = this.mRoomFastGiftIdsMap.get(Long.valueOf(j));
        if (list != null && !list.isEmpty()) {
            return new ArrayList(list);
        }
        List<Long> list2 = this.mRoomFastGiftIdsMap.get(0L);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return new ArrayList();
    }

    @Override // X.InterfaceC1128210fSt
    public FreqLimitGiftOption getFreqLimitOption(Long l) {
        HashMap<Long, FreqLimitGiftOption> map = this.freqLimitGiftOptionList;
        if (map == null) {
            return null;
        }
        return map.get(l);
    }

    @Override // X.InterfaceC1128210fSt
    public C1127820fSG getGalleryInfoMap(long j) {
        return this.galleryInfoMap.get(Long.valueOf(j));
    }

    @Override // X.InterfaceC1128210fSt
    public GiftsInfo getGiftIconInfo(long j) {
        if (this.mRoomGiftInfoMap.containsKey(Long.valueOf(j))) {
            return this.mRoomGiftInfoMap.get(Long.valueOf(j));
        }
        return this.mRoomGiftInfoMap.get(0L);
    }

    @Override // X.InterfaceC1128210fSt
    public int getGiftPosition(String str) {
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList = this.currentPanelList;
        if (linkedList != null && !linkedList.isEmpty()) {
            int i = 1;
            for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : this.currentPanelList) {
                if (abstractC1126600fQI != null) {
                    if (!abstractC1126600fQI.LJIILIIL().equals(str) && abstractC1126600fQI.LIZ != 3) {
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
        if (num.intValue() == 21) {
            return EnumC1133020fae.INTERACTIVE_GAME_GIFT;
        }
        if (num.intValue() == 22) {
            return EnumC1133020fae.MUSIC_GIFT;
        }
        if (num.intValue() == 2) {
            return EnumC1133020fae.SPECIAL_GIFT;
        }
        return EnumC1133020fae.UNKNOWN;
    }

    @Override // X.InterfaceC1128210fSt
    public String getGiftsHashString(Long l) {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Long> list = this.mappedGiftIds.get(l);
            if (list != null && !list.isEmpty()) {
                for (Long l2 : new ArrayList(list)) {
                    Gift gift = this.giftListCacheWithHash.get(l2);
                    if (gift != null) {
                        jSONObject.put(l2.toString(), gift.giftStructHash);
                    }
                }
            } else {
                for (Map.Entry<Long, Gift> entry : this.giftListCacheWithHash.entrySet()) {
                    Long key = entry.getKey();
                    jSONObject.put(key.toString(), entry.getValue().giftStructHash);
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
        return Boolean.TRUE.equals(this.isGalleryAllSponsored.get(Long.valueOf(j)));
    }

    @Override // X.InterfaceC1128210fSt
    public List<Gift> getMatchGameGifts(int i) {
        List<GiftPage> giftPageList = getGiftPageList();
        if (giftPageList != null) {
            for (GiftPage giftPage : giftPageList) {
                if (giftPage.pageType == i) {
                    return giftPage.matchGameGifts;
                }
            }
        }
        return new ArrayList();
    }

    @Override // X.InterfaceC1128210fSt
    public int getPollGiftIndex(long j) {
        long jLongValue;
        List<GiftPollOption> list = this.mGiftPollInfo.giftPollOptions;
        if (list == null) {
            return 0;
        }
        Long l = ((GiftPollOption) ListProtector.get(list, 0)).giftId;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (j == jLongValue) {
            return 0;
        }
        return 1;
    }

    @Override // X.InterfaceC1128210fSt
    public int getTabByGiftId(long j) {
        List<GiftPage> list;
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null && list.size() != 0) {
            InterfaceC1133710fbl.LIZ.getClass();
            if (((C1133940fc8) C1120710fGn.LIZ()).LJIIJ()) {
                return ((GiftPage) ListProtector.get(giftListResult.giftPages, 0)).pageType;
            }
            for (GiftPage giftPage : giftListResult.giftPages) {
                if (giftPage.display) {
                    Iterator<Gift> it2 = giftPage.gifts.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().id == j) {
                            return giftPage.pageType;
                        }
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // X.InterfaceC1128210fSt
    public int getTabByGiftIdWithoutFirstRecharge(long j) {
        List<GiftPage> list;
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null && list.size() != 0) {
            for (GiftPage giftPage : giftListResult.giftPages) {
                if (giftPage.display) {
                    Iterator<Gift> it2 = giftPage.gifts.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().id == j) {
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
        GiftListResult giftListResult = this.mGiftsMap.get(0);
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
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult == null || (list = giftListResult.giftPages) == null || i >= list.size()) {
            return "Gift";
        }
        return ((GiftPage) ListProtector.get(giftListResult.giftPages, i)).pageName;
    }

    @Override // X.InterfaceC1128210fSt
    public int getTargetGiftDiamondCount(long j) {
        GiftListResult giftListResult;
        List<GiftPage> list;
        if (j != 0 && (giftListResult = this.mGiftsMap.get(0)) != null && (list = giftListResult.giftPages) != null && list.size() != 0) {
            Iterator<GiftPage> it2 = giftListResult.giftPages.iterator();
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
        return this.mRoomRiskCtl.get(Long.valueOf(j));
    }

    @Override // X.InterfaceC1128210fSt
    public boolean isDisableGalleryBannerForGift(Long l) {
        return Boolean.TRUE.equals(this.disableGalleryBannerMap.get(l));
    }

    @Override // X.InterfaceC1128210fSt
    public boolean isDynamicGift(long j) {
        List<GiftPage> list;
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult == null || (list = giftListResult.giftPages) == null) {
            return false;
        }
        Iterator<GiftPage> it2 = list.iterator();
        while (it2.hasNext()) {
            for (Gift gift : it2.next().gifts) {
                if (gift.id == j) {
                    ImageModel imageModel = gift.previewImage;
                    if (imageModel == null || C842240X2g.LIZ(imageModel) == null || C842240X2g.LIZ(imageModel).size() <= 0) {
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
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null && !list.isEmpty()) {
            for (GiftPage giftPage : giftListResult.giftPages) {
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
        long jLongValue;
        long jLongValue2;
        Long l;
        GiftPollInfo giftPollInfo = this.mGiftPollInfo;
        if (giftPollInfo == null || (list = giftPollInfo.giftPollOptions) == null || ((GiftPollOption) ListProtector.get(list, 0)).giftId == null || ((GiftPollOption) ListProtector.get(this.mGiftPollInfo.giftPollOptions, 1)).giftId == null) {
            return false;
        }
        GiftPollOption giftPollOption = (GiftPollOption) ListProtector.get(this.mGiftPollInfo.giftPollOptions, 0);
        GiftPollOption giftPollOption2 = (GiftPollOption) ListProtector.get(this.mGiftPollInfo.giftPollOptions, 1);
        if (giftPollOption != null && giftPollOption2 != null && (l = giftPollOption.giftId) != null && giftPollOption2.giftId != null) {
            jLongValue = l.longValue();
            jLongValue2 = giftPollOption2.giftId.longValue();
        } else {
            jLongValue = 0;
            jLongValue2 = 0;
        }
        if (j != jLongValue && j != jLongValue2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1128210fSt
    public boolean isPreviouslySentGift(Long l) {
        if (getGiftListResult() != null && getGiftListResult().giftsInfo != null && getGiftListResult().giftsInfo.serverStrategyContext != null && getGiftListResult().giftsInfo.serverStrategyContext.previousSentGiftIds != null) {
            return getGiftListResult().giftsInfo.serverStrategyContext.previousSentGiftIds.contains(l);
        }
        return false;
    }

    public boolean isSubscribeGift(long j) {
        List<GiftPage> list;
        List<Gift> list2;
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null && list.size() != 0) {
            for (GiftPage giftPage : giftListResult.giftPages) {
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

    @Override // X.InterfaceC1128210fSt
    public void registerGiftListListener(InterfaceC1133110fan interfaceC1133110fan) {
        if (LiveGiftFastGiftMemoryLeakFixSetting.INSTANCE.getValue()) {
            this.mGiftListListeners.addIfAbsent(interfaceC1133110fan);
        } else {
            this.mGiftListListeners.add(interfaceC1133110fan);
        }
    }

    @Override // X.InterfaceC1128210fSt
    public void removeGalleryInfoUpdateListener(InterfaceC1128230fSv interfaceC1128230fSv) {
        synchronized (GiftManager.class) {
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
        this.mGiftListListeners.remove(interfaceC1133110fan);
    }

    @Override // X.InterfaceC1128210fSt
    public void updateFavoriteGift(List<GiftPage> list) {
        C20441214yg.LIZIZ("favoritegift", "updateFavoriteGift");
        GiftListResult giftListResult = this.mGiftsMap.get(0);
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
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList = this.currentPanelList;
        if (linkedList != null && !linkedList.isEmpty()) {
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
        return -1;
    }

    public static void filterInteractNotSupportGift(Collection<? extends Gift> collection, boolean z) {
        if (collection == null) {
            return;
        }
        filterNotSupportGift(collection, z);
        Iterator<? extends Gift> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!it2.next().forLinkMic) {
                it2.remove();
            }
        }
    }

    public static void filterNotSupportGift(Collection<? extends Gift> collection, boolean z) {
        if (collection == null) {
            return;
        }
        Iterator<? extends Gift> it2 = collection.iterator();
        boolean zLJJIJIIJIL = C1128450fTH.LJJIJIIJIL();
        while (it2.hasNext()) {
            int i = it2.next().giftSubType;
            if (i == 3 || i == 4) {
                if (zLJJIJIIJIL) {
                    it2.remove();
                }
            }
        }
    }

    public static void filterUnSupportGifts(List<GiftPage> list, boolean z) {
        for (GiftPage giftPage : list) {
            if (C1125800fP0.LIZIZ() == EnumC1125400fOM.GUEST) {
                filterInteractNotSupportGift(giftPage.gifts, z);
                filterInteractNotSupportGift(giftPage.frequentlyUsedGifts, z);
            } else {
                filterNotSupportGift(giftPage.gifts, z);
                filterNotSupportGift(giftPage.frequentlyUsedGifts, z);
            }
            filterNotDisplayedOnPanel(giftPage.gifts);
            filterNotDisplayedOnPanel(giftPage.frequentlyUsedGifts);
            filterFirstRechargeGift(giftPage.gifts);
            filterFirstRechargeGift(giftPage.frequentlyUsedGifts);
        }
    }

    private long getRefreshTime(long j, long j2) {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return j2;
        }
        HashMap<String, String> mapLIZIZ = InterfaceC1094160eZy.y1.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(String.valueOf(room.getOwnerUserId()));
        sbLIZ.append(String.valueOf(j));
        String str = mapLIZIZ.get(C2188811AlT.LIZIZ(sbLIZ));
        if (str != null) {
            try {
                j2 = CastLongProtector.valueOf(str).longValue();
                return j2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return j2;
    }

    private void internalUpdateGalleryInfo(long j, C1127820fSG c1127820fSG) {
        this.galleryInfoMap.put(Long.valueOf(j), c1127820fSG);
    }

    private void rebuildGiftsByFindConcurrent(GiftListResult giftListResult, int i) {
        List<Gift> list;
        List<GiftPage> list2;
        List<Gift> list3;
        ArrayList<Gift> arrayList = new ArrayList();
        if (!C0IKQ.LIZ(giftListResult.giftPages) && (list2 = giftListResult.giftPages) != null) {
            for (GiftPage giftPage : list2) {
                if (giftPage != null && (list3 = giftPage.gifts) != null) {
                    arrayList.addAll(list3);
                }
            }
        }
        C20066713fN<Gift> c20066713fN = new C20066713fN<>(arrayList.size());
        this.magicContainerId = 0L;
        for (Gift gift : arrayList) {
            if (gift != null) {
                c20066713fN.LIZ(gift.id, gift);
                if (gift.LJFF()) {
                    this.magicContainerId = Long.valueOf(gift.id);
                }
            }
        }
        List<GiftPage> list4 = giftListResult.giftPages;
        if (list4 != null && !list4.isEmpty() && ListProtector.get(giftListResult.giftPages, 0) != null && (list = ((GiftPage) ListProtector.get(giftListResult.giftPages, 0)).matchGameGifts) != null && !list.isEmpty()) {
            for (Gift gift2 : list) {
                if (gift2 != null) {
                    c20066713fN.LIZ(gift2.id, gift2);
                }
            }
        }
        this.mGiftsMapByFindConcurrent.put(Integer.valueOf(i), c20066713fN);
    }

    private void updateGalleryInfo(long j, GiftListResult giftListResult) {
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

    private void updateGiftLock(GiftListResult giftListResult, long j) {
        GiftLockInfo giftLockInfo;
        List<GiftPage> list = giftListResult.giftPages;
        if (j != this.lockedGiftsMapRoomId) {
            this.lockedGiftsMap.clear();
        }
        for (GiftPage giftPage : list) {
            for (Gift gift : giftPage.gifts) {
                if (gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 2 && giftLockInfo.mLock) {
                    if (!this.lockedGiftsMap.containsKey(Integer.valueOf(giftPage.pageType))) {
                        this.lockedGiftsMap.put(Integer.valueOf(giftPage.pageType), new LinkedHashSet<>());
                    }
                    this.lockedGiftsMap.get(Integer.valueOf(giftPage.pageType)).add(Long.valueOf(gift.id));
                }
            }
        }
        this.lockedGiftsMapRoomId = j;
    }

    private void updateRiskCtlInfo(GiftListResult giftListResult, long j) {
        RiskCtl riskCtl;
        if (giftListResult == null) {
            return;
        }
        GiftsInfo giftsInfo = giftListResult.giftsInfo;
        if (giftsInfo != null) {
            riskCtl = giftsInfo.riskCtl;
            if (riskCtl != null) {
                this.mRoomRiskCtl.put(Long.valueOf(j), riskCtl);
            }
            C784440Upu.LIZ().LIZIZ(new C1127380fRY(j, riskCtl));
        }
        riskCtl = null;
        this.mRoomRiskCtl.remove(Long.valueOf(j));
        C784440Upu.LIZ().LIZIZ(new C1127380fRY(j, riskCtl));
    }

    @Override // X.InterfaceC1128210fSt
    public void cacheGiftListToMap(GiftListResult giftListResult, int i) {
        List<Gift> list;
        List<GiftPage> list2;
        List<Gift> list3;
        if (giftListResult == null) {
            return;
        }
        this.mGiftsMap.put(i, giftListResult);
        this.upgradeGift = null;
        if (LiveGiftReceivingRefactorSetting.INSTANCE.isAsyncQueue()) {
            rebuildGiftsByFindConcurrent(giftListResult, i);
            return;
        }
        C20066713fN<Gift> c20066713fN = this.mGiftsMapByFind.get(i);
        if (c20066713fN != null) {
            c20066713fN.LIZIZ();
        } else {
            c20066713fN = new C20066713fN<>();
            this.mGiftsMapByFind.append(i, c20066713fN);
        }
        ArrayList<Gift> arrayList = new ArrayList();
        if (!C0IKQ.LIZ(giftListResult.giftPages) && (list2 = giftListResult.giftPages) != null) {
            for (GiftPage giftPage : list2) {
                if (giftPage != null && (list3 = giftPage.gifts) != null) {
                    arrayList.addAll(list3);
                }
            }
        }
        this.magicContainerId = 0L;
        for (Gift gift : arrayList) {
            if (gift != null) {
                c20066713fN.LIZ(gift.id, gift);
                if (gift.LJFF()) {
                    this.magicContainerId = Long.valueOf(gift.id);
                }
            }
        }
        List<GiftPage> list4 = giftListResult.giftPages;
        if (list4 != null && ListProtector.get(list4, 0) != null && (list = ((GiftPage) ListProtector.get(giftListResult.giftPages, 0)).matchGameGifts) != null && !list.isEmpty()) {
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
        GiftListResult giftListResult = this.mGiftsMap.get(0);
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
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (i != -1 && giftListResult != null && (list = giftListResult.giftPages) != null) {
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
        }
        return -1;
    }

    @Override // X.InterfaceC1128210fSt
    public boolean isGiftLimited(long j, long j2) {
        Integer numValueOf;
        HashMap<Long, C1127130fR9> map = this.freqLimitInfoList;
        if (map == null) {
            return false;
        }
        C1127130fR9 c1127130fR9 = map.get(Long.valueOf(j));
        FreqLimitGiftOption freqLimitOption = inst().getFreqLimitOption(Long.valueOf(j));
        if (c1127130fR9 != null && freqLimitOption != null) {
            int i = c1127130fR9.LIZIZ;
            if (!c1127130fR9.LIZJ) {
                numValueOf = Integer.valueOf(i);
            } else {
                numValueOf = (Integer) ((LinkedHashMap) c1127130fR9.LIZLLL).get(Long.valueOf(j2));
            }
            long refreshTime = freqLimitOption.refreshTimeStamp;
            if (getGiftPageList().isEmpty()) {
                refreshTime = getRefreshTime(j, refreshTime);
            }
            if (numValueOf != null && numValueOf.intValue() <= 0 && refreshTime > System.currentTimeMillis() / 1000) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1128210fSt
    public void saveFastGifts(long j, List<Long> list) {
        if (list != null && !list.isEmpty()) {
            this.mRoomFastGiftIdsMap.put(Long.valueOf(j), new CopyOnWriteArrayList(list));
            this.mRoomFastGiftIdsMap.put(0L, new CopyOnWriteArrayList(list));
        }
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
        synchronized (GiftManager.class) {
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
        this.mBannerGiftGalleryInfo = new C1127920fSQ(true, giftsInfo.panelGiftGalleryIcon, giftsInfo.giftGalleryDetailPageSchemeUrl);
        this.giftChallengeProgress = giftsInfo.giftChallengeProgress;
        notifyFastGiftModule(j, giftsInfo.mFastGiftId, giftsInfo.speedyGiftGreyIcon, giftsInfo.speedyGiftDefaultIcon);
        GiftsInfo giftsInfo2 = this.currentGiftsInfo;
        notifyGiftIconModule(j, giftsInfo2.giftIconInfo, giftsInfo2);
    }

    @Override // X.InterfaceC1128210fSt
    public void updateGalleryInfoMap(long j, Pair<String, String> pair) {
        boolean z;
        ImageModel imageModel;
        Map map = new HashMap();
        C1127820fSG c1127820fSG = this.galleryInfoMap.get(Long.valueOf(j));
        if (c1127820fSG != null) {
            map = c1127820fSG.LIZ;
            z = c1127820fSG.LIZIZ;
            imageModel = c1127820fSG.LIZLLL;
        } else {
            z = false;
            imageModel = null;
        }
        internalUpdateGalleryInfo(j, new C1127820fSG(map, z, pair, imageModel));
    }

    private void notifyGiftIconModule(long j, GiftIconInfo giftIconInfo, GiftsInfo giftsInfo) {
        this.mRoomGiftInfoMap.put(Long.valueOf(j), giftsInfo);
        this.mRoomGiftInfoMap.put(0L, giftsInfo);
        if (giftIconInfo.mValidStartAt >= System.currentTimeMillis() / 1000 || giftIconInfo.mValidEndAt <= System.currentTimeMillis() / 1000) {
            this.mRoomGiftInfoMap.remove(Long.valueOf(j));
            this.mRoomGiftInfoMap.remove(0L);
        }
        C784440Upu.LIZ().LIZIZ(new C1121330fHn(j, giftsInfo));
    }

    private void saveRefreshTime(long j, long j2, long j3) {
        C20337914i1<HashMap<String, String>> c20337914i1 = InterfaceC1094160eZy.y1;
        HashMap<String, String> mapLIZIZ = c20337914i1.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(String.valueOf(j2));
        sbLIZ.append(String.valueOf(j3));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (mapLIZIZ.size() > 50) {
            mapLIZIZ.clear();
        }
        mapLIZIZ.put(strLIZIZ, String.valueOf(j));
        c20337914i1.LJFF(mapLIZIZ);
    }

    @Override // X.InterfaceC1128210fSt
    public void updateFreqList(long j, int i, long j2) {
        C1127130fR9 c1127130fR9;
        if (this.freqLimitInfoList != null && getFreqLimitOption(Long.valueOf(j)) != null && (c1127130fR9 = this.freqLimitInfoList.get(Long.valueOf(j))) != null) {
            if (!c1127130fR9.LIZJ) {
                c1127130fR9.LIZIZ = i;
                return;
            }
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(String.valueOf(j2));
                sbLIZ.append(String.valueOf(j));
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
            }
            c1127130fR9.LIZLLL.put(Long.valueOf(j2), Integer.valueOf(i));
        }
    }

    private void notifyFastGiftModule(long j, long j2, ImageModel imageModel, ImageModel imageModel2) {
        this.mRoomFastGiftIdMap.put(Long.valueOf(j), Long.valueOf(j2));
        this.mRoomFastGiftIdMap.put(0L, Long.valueOf(j2));
        C784440Upu.LIZ().LIZIZ(new C1123110fKf(j, j2, imageModel, imageModel2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010 A[PHI: r9
      0x0010: PHI (r9v2 boolean) = (r9v0 boolean), (r9v3 boolean) binds: [B:64:0x00e5, B:8:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getDownloadEffectList(boolean r12, long r13, java.util.List<com.bytedance.android.livesdk.gift.model.GiftPage> r15, java.util.ArrayList<java.lang.Long> r16, java.util.ArrayList<com.bytedance.android.livesdk.model.Gift> r17) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.getDownloadEffectList(boolean, long, java.util.List, java.util.ArrayList, java.util.ArrayList):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void onSyncGiftListSuccess(com.bytedance.android.livesdk.gift.model.GiftListResult r22, java.lang.String r23, int r24, long r25, X.AbstractC1132980faa r27) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.onSyncGiftListSuccess(com.bytedance.android.livesdk.gift.model.GiftListResult, java.lang.String, int, long, X.0faa):void");
    }

    @Override // X.InterfaceC1128210fSt
    public void updateGalleryInfoMap(long j, Map<Long, Gift.GiftSponsorInfo> map, boolean z, Pair<String, String> pair, ImageModel imageModel) {
        if (map == null) {
            return;
        }
        C1127820fSG c1127820fSG = new C1127820fSG(map, z, pair, imageModel);
        internalUpdateGalleryInfo(j, c1127820fSG);
        synchronized (GiftManager.class) {
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
        if (j != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Exception exc = new Exception(th);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncgiftlist error! ");
        sbLIZ.append(exc.getStackTrace());
        C20441214yg.LJ("gift", C2188811AlT.LIZIZ(sbLIZ));
        if (z2) {
            C1131270fXp.LJI(exc.getMessage());
        }
        C1133120fao c1133120faoLIZ = C1133160fas.LIZ(th);
        int i2 = c1133120faoLIZ.LIZ;
        if (!GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled() && ((ArrayList) C1133460fbM.LIZ).isEmpty()) {
            C1138640fji.LJIIIZ(i, j, null, null);
        }
        C1131070fXV.LJII(i2, i, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j2), c1133120faoLIZ.LIZIZ, null, str);
        if (weakReference.get() != null) {
            weakReference.get().LIZ(i2, c1133120faoLIZ.LIZIZ);
        }
        if (th == null) {
            str2 = "Throwable is null";
        } else {
            str2 = c1133120faoLIZ.LIZIZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetch gift list fail ");
        sbLIZ2.append(str2);
        C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ2));
        C784440Upu.LIZ().LIZIZ(new C1133130fap(false));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0166  */
    @Override // X.InterfaceC1128210fSt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGiftListSuccess(long r35, long r37, boolean r39, int r40, X.C0WIY<com.bytedance.android.livesdk.gift.model.GiftListResult, java.lang.String> r41, X.AbstractC1132980faa r42, java.lang.String r43, java.lang.String r44) {
        /*
            Method dump skipped, instruction units count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.onGiftListSuccess(long, long, boolean, int, X.0WIY, X.0faa, java.lang.String, java.lang.String):void");
    }
}
