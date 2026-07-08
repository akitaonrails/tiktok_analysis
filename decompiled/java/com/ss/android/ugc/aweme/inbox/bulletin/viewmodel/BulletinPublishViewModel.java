package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.AbstractC848400XPy;
import X.C09R9;
import X.C0OIR;
import X.C0OJU;
import X.C0OKA;
import X.C0OKJ;
import X.C0OKK;
import X.C0OKL;
import X.C0OKS;
import X.C0OLV;
import X.C0ONX;
import X.C0OO1;
import X.C0OO3;
import X.C0OO5;
import X.C0OO6;
import X.C0OOC;
import X.C0OOD;
import X.C0OOE;
import X.C0OOF;
import X.C0OOH;
import X.C0OOI;
import X.C0OOP;
import X.C0OOV;
import X.C0OOY;
import X.C0OPI;
import X.C0OPQ;
import X.C0OPX;
import X.C0R1H;
import X.C0XQ7;
import X.C1220000hqw;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C14EU;
import X.C1559260qg8;
import X.C1622206Wu;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C23250099c;
import X.C452070Ho5;
import X.C618290OMx;
import X.C618680OOk;
import X.C618910OPh;
import X.C619000OPq;
import X.C622680Oba;
import X.C723600SZy;
import X.C724750Sbp;
import X.C736950SvV;
import X.C866950Xzh;
import X.EnumC618810OOx;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC618620OOe;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.ApplySkin;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridCardConfigStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridResourceResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPoll;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SingleBulletinItemCreateInfo;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS60S1000000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPublishViewModel extends AssemViewModel<C618290OMx> implements C0OOI, InterfaceC618620OOe {
    public final C0OJU LL;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C0OLV.class, "bulletin_board_param"), true);
    public final C09R9 LLILLL = new C09R9(this, C13LE.LIZ(C0ONX.class));
    public final C736950SvV LLILZ;

    @Override // X.InterfaceC618620OOe
    public final void ov0(long j) {
    }

    @Override // X.InterfaceC618620OOe
    public final String sL0(boolean z, boolean z2) {
        return "";
    }

    public final C0OLV Hh2() {
        return (C0OLV) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C618290OMx(0);
    }

    @Override // X.C0OOI
    public final Long P62() {
        String str;
        C0OLV c0olvHh2 = Hh2();
        if (c0olvHh2 == null || (str = c0olvHh2.LL) == null) {
            return null;
        }
        return Long.valueOf(CastLongProtector.parseLong(str));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        WeakReference<C0OOI> weakReference = C618910OPh.LIZJ;
        if (weakReference != null && weakReference.get() == this) {
            C618910OPh.LIZJ = null;
        }
        WeakReference<C0OOI> weakReference2 = C0OO1.LIZ;
        if (weakReference2 != null && weakReference2.get() == this) {
            C0OO1.LIZ = null;
        }
        C0OOY.LIZ.getClass();
        C0OOY.LJII.remove(this);
        EventBus.LIZLLL().LJJI(this);
        for (BulletinBaseItem bulletinBaseItem : C0OOY.LIZLLL) {
            BulletinBaseItem bulletinBaseItem2 = bulletinBaseItem;
            if ((bulletinBaseItem2 instanceof C0OO5) && ((C0OO5) bulletinBaseItem2).LLJJIII == C0OO3.AUTO_SHARE_POST_GUIDE.getType()) {
                if (bulletinBaseItem != null) {
                    C0OOY.LIZLLL.remove(bulletinBaseItem);
                    return;
                }
                return;
            }
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C618910OPh c618910OPh = C618910OPh.LIZ;
        c618910OPh.getClass();
        if (!C622680Oba.LIZ(c618910OPh)) {
            C622680Oba.LIZJ(c618910OPh);
        }
        C618910OPh.LIZJ = new WeakReference<>(this);
        C0OO1.LIZ = new WeakReference<>(this);
        C0OOY.LIZ.getClass();
        C0OOY.LJII.add(this);
        EventBus.LIZLLL().LJIJJ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BulletinPublishViewModel(C0OJU c0oju) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        this.LL = c0oju;
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 831);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinProfileViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(373);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(this);
        if (this instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        this.LLILZ = new C736950SvV(c19719912DlLIZ, awS553S0100000_9, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS240S0000000_9, null, null, null);
    }

    @Override // X.InterfaceC618620OOe
    public final void eA2(BulletinBaseItem bulletinBaseItem) {
        String str;
        int iLongValue;
        C0OLV c0olvHh2 = Hh2();
        if (c0olvHh2 == null || (str = c0olvHh2.LL) == null || !Intrinsics.LJFF(bulletinBaseItem.LJJJJLI(), str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("optimizeItem() - item:");
        sbLIZ.append(bulletinBaseItem);
        sbLIZ.append(", bbId:");
        sbLIZ.append(str);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        try {
            C0OIR c0oir = ((BulletinProfileViewModel) this.LLILZ.getValue()).LLJJL;
            int type = bulletinBaseItem.LIZLLL().getType();
            Long lLJI = bulletinBaseItem.LJI();
            if (lLJI != null) {
                iLongValue = (int) lLJI.longValue();
            } else {
                iLongValue = 0;
            }
            bulletinBaseItem.LJZ(C619000OPq.LIZ(Boolean.valueOf(c0oir.LIZ(type, iLongValue)), C619000OPq.LIZIZ(bulletinBaseItem)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BulletinPageListAssem updateBulletinList enableComment error ");
            sbLIZ2.append(e);
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LL.jZ1(null, bulletinBaseItem, C0OKA.GENERATED);
        C1440005kM.LIZ(new C0OOE());
        setState(AFwS240S0000000_9.get$arr$(371));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void tryPublishItem(C0OOD c0ood) {
        String str;
        String str2;
        C0OOH c0oohLy;
        BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct;
        String str3;
        C0OLV c0olvHh2 = Hh2();
        int i = 0;
        if (c0olvHh2 != null && (str = c0olvHh2.LL) != null) {
            long j = c0ood.LIZ;
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
            if (lLJIILIIL != null && j == lLJIILIIL.longValue() && C0R1H.LIZJ(this) == Lifecycle.State.RESUMED) {
                ArrayList arrayList = new ArrayList();
                Iterator<SingleBulletinItemCreateInfo> it2 = c0ood.LIZIZ.iterator();
                while (true) {
                    String str4 = "";
                    if (it2.hasNext()) {
                        SingleBulletinItemCreateInfo next = it2.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            SingleBulletinItemCreateInfo singleBulletinItemCreateInfo = next;
                            BulletinBaseItem bulletinBaseItem = (BulletinBaseItem) C13LP.LJJJLZIJ(i, c0ood.LIZJ);
                            if (bulletinBaseItem == null) {
                                return;
                            }
                            Integer num = singleBulletinItemCreateInfo.itemType;
                            int iOrdinal = EnumC618810OOx.LYNX_CARD.ordinal();
                            if (num != null && num.intValue() == iOrdinal) {
                                if ((bulletinBaseItem instanceof C0OOV) && (c0oohLy = this.LL.Ly()) != null) {
                                    C0OOV c0oov = (C0OOV) bulletinBaseItem;
                                    BulletinCardInfo bulletinCardInfo = c0oov.LLJJL;
                                    if (bulletinCardInfo != null && (bulletinHybridCardConfigStruct = bulletinCardInfo.hybridConfigInfo) != null && (str3 = bulletinHybridCardConfigStruct.schema) != null) {
                                        str4 = str3;
                                    }
                                    arrayList.add(C0OOV.LLIIIL(c0oov, false, false, false, false, 0, 0, null, c0oohLy.LIZ(str4), null, null, null, 66977791));
                                } else {
                                    return;
                                }
                            } else {
                                arrayList.add(bulletinBaseItem);
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    } else {
                        Map<String, String> map = c0ood.LIZLLL;
                        C0OLV c0olvHh22 = Hh2();
                        if (c0olvHh22 != null && (str2 = c0olvHh22.LLILLJJLI) != null) {
                            str4 = str2;
                        }
                        map.put("entrance_page", str4);
                        String str5 = c0ood.LIZLLL.get("enter_method");
                        Map<String, String> map2 = c0ood.LIZLLL;
                        C618910OPh.LIZ.getClass();
                        map2.putAll(C618910OPh.LIZLLL);
                        if (Intrinsics.LJFF(str5, "guide_card")) {
                            c0ood.LIZLLL.put("enter_method", "guide_card");
                        }
                        BulletinBaseItem bulletinBaseItem2 = (BulletinBaseItem) C13LP.LJJJLL(c0ood.LIZJ);
                        if (Intrinsics.LJFF(c0ood.LIZLLL.get("enter_method"), "guide_card") && c0ood.LIZJ.size() == 1 && bulletinBaseItem2 != null) {
                            C0OOY c0ooy = C0OOY.LIZ;
                            String strValueOf = String.valueOf(c0ood.LIZ);
                            Map<String, String> map3 = c0ood.LIZLLL;
                            c0ooy.getClass();
                            C0OOY.LJIIJ(bulletinBaseItem2);
                            C0OPQ.LIZ.getClass();
                            C0OPQ.LJJJ(strValueOf, map3);
                            C23250099c.LIZLLL(C0OOY.LJIIIIZZ, null, null, new C0OKK(strValueOf, bulletinBaseItem2, map3, null), 3);
                            return;
                        }
                        C0OOY c0ooy2 = C0OOY.LIZ;
                        String strValueOf2 = String.valueOf(c0ood.LIZ);
                        List<SingleBulletinItemCreateInfo> list = c0ood.LIZIZ;
                        boolean z = c0ood.LJ;
                        Map<String, String> map4 = c0ood.LIZLLL;
                        c0ooy2.getClass();
                        C0OOY.LJIJ(strValueOf2, list, arrayList, z, map4, false);
                        return;
                    }
                }
            }
        }
    }

    @Override // X.C0OOI
    public final void Gq0(BaseShortVideoContext baseShortVideoContext, Map<String, String> map) {
        String str;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publishVideo() - ");
        C0OLV c0olvHh2 = Hh2();
        if (c0olvHh2 != null) {
            str = c0olvHh2.LL;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C0OLV c0olvHh22 = Hh2();
        if (c0olvHh22 != null && (str2 = c0olvHh22.LL) != null) {
            Map<String, String> mapVQ2 = vQ2(str2, "video", map);
            C0OPQ.LIZ.getClass();
            C0OPQ.LJJJ(str2, mapVQ2);
            C0OOY.LIZ.getClass();
            C0OOY.LJIJJ(baseShortVideoContext, str2, false, mapVQ2, null);
        }
    }

    @Override // X.C0OOI
    public final void IG1(BaseShortVideoContext baseShortVideoContext, Map<String, String> map) {
        String str;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publishPhoto() - ");
        C0OLV c0olvHh2 = Hh2();
        if (c0olvHh2 != null) {
            str = c0olvHh2.LL;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C0OLV c0olvHh22 = Hh2();
        if (c0olvHh22 != null && (str2 = c0olvHh22.LL) != null) {
            Map<String, String> mapVQ2 = vQ2(str2, "photo", map);
            C0OPQ.LIZ.getClass();
            C0OPQ.LJJJ(str2, mapVQ2);
            C0OOY.LIZ.getClass();
            C0OOY.LJIJI(baseShortVideoContext, str2, false, mapVQ2, null);
        }
    }

    @Override // X.C0OOI
    public final Object LLZZJLIL(String str, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        String str2;
        String str3;
        Long lLJIILIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkAwemeIsShared bbId = ");
        C0OLV c0olvHh2 = Hh2();
        if (c0olvHh2 != null) {
            str2 = c0olvHh2.LL;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C0OLV c0olvHh22 = Hh2();
        if (c0olvHh22 == null || (str3 = c0olvHh22.LL) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) == null) {
            return null;
        }
        return ((C0OKS) this.LLILLL.getValue().getOperator()).checkAwemeIsShared(str, lLJIILIIL.longValue(), interfaceC1364105Vn);
    }

    @Override // X.C0OOI
    public final void d0(Aweme aweme, Map<String, String> map) {
        String str;
        String str2;
        String str3;
        C0OLV c0olvHh2 = Hh2();
        if (c0olvHh2 != null && (str = c0olvHh2.LL) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("channel_id", str);
            C0OLV c0olvHh22 = Hh2();
            String str4 = "";
            if (c0olvHh22 == null || (str2 = c0olvHh22.LLILLJJLI) == null) {
                str2 = "";
            }
            linkedHashMap.put("entrance_page", str2);
            linkedHashMap.put("content_type", "post");
            linkedHashMap.put("is_resend", CardStruct.IStatusCode.DEFAULT);
            String aid = aweme.getAid();
            if (aid != null) {
                str4 = aid;
            }
            linkedHashMap.put("group_id", str4);
            C618910OPh.LIZ.getClass();
            linkedHashMap.putAll(C618910OPh.LIZLLL);
            C0OLV c0olvHh23 = Hh2();
            if (c0olvHh23 != null && (str3 = c0olvHh23.LLJJI) != null) {
                linkedHashMap.put("enter_method", str3);
            }
            C0OPQ.LIZ.getClass();
            C0OPQ.LJJJ(str, linkedHashMap);
            C0OOY.LJIILL(C0OOY.LIZ, str, aweme, linkedHashMap, null, map, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void wQ2(BulletinPoll bulletinPoll, C0OOC c0ooc) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C0OOC c0ooc2 = c0ooc;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publishPoll() - ");
        C0OLV c0olvHh2 = Hh2();
        if (c0olvHh2 != null) {
            str = c0olvHh2.LL;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C0OLV c0olvHh22 = Hh2();
        if (c0olvHh22 != null && (str2 = c0olvHh22.LL) != null) {
            C0OLV c0olvHh23 = Hh2();
            if (c0olvHh23 != null && (str6 = c0olvHh23.LLJJI) != null && (!a0.LJJJIL(str6)) && c0ooc2 != null) {
                c0ooc2 = new C0OOC(c0ooc2.LL, c0ooc2.LLILLJJLI, str6);
            }
            C0OOY.LIZ.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (c0ooc2 != null) {
                str3 = c0ooc2.LL;
            } else {
                str3 = null;
            }
            linkedHashMap.put("channel_id", String.valueOf(str3));
            if (c0ooc2 != null) {
                str4 = c0ooc2.LLILLJJLI;
            } else {
                str4 = null;
            }
            linkedHashMap.put("entrance_page", String.valueOf(str4));
            if (c0ooc2 != null) {
                str5 = c0ooc2.LLILLL;
            } else {
                str5 = null;
            }
            linkedHashMap.put("enter_method", String.valueOf(str5));
            linkedHashMap.put("content_type", "vote");
            bulletinPoll.generateEventTracking(linkedHashMap);
            C618680OOk c618680OOk = new C618680OOk(bulletinPoll, Long.valueOf(C0OPX.LIZ()), System.currentTimeMillis(), Long.valueOf(System.currentTimeMillis()), EnumC618810OOx.POLL, 0, 0 == true ? 1 : 0, linkedHashMap, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser(), 0 == true ? 1 : 0, null, str2, 507520);
            c618680OOk.LLILLL = true;
            C0OPI.LIZ.getClass();
            C0OPI.LIZ(c618680OOk, str2);
            C0OPQ.LIZ.getClass();
            C0OPQ.LJJJ(str2, linkedHashMap);
            C0OOY.LJIIJ(c618680OOk);
            C23250099c.LIZLLL(C0OOY.LJIIIIZZ, null, null, new C0OKJ(str2, c618680OOk, linkedHashMap, null), 3);
        }
    }

    @Override // X.InterfaceC618620OOe
    public final void YV(BulletinItem bulletinItem, BulletinBaseItem bulletinBaseItem, Map<String, String> map) {
        String str;
        BulletinBaseItem bulletinBaseItemLIZIZ;
        C0OLV c0olvHh2 = Hh2();
        if (c0olvHh2 != null && (str = c0olvHh2.LL) != null && Intrinsics.LJFF(bulletinBaseItem.LJJJJLI(), str) && (bulletinBaseItemLIZIZ = C618910OPh.LIZ.LIZIZ(bulletinItem, bulletinBaseItem, this.LL.Ly())) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBulletinSendSuccess() - item:");
            sbLIZ.append(bulletinBaseItemLIZIZ);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            this.LL.jZ1(bulletinBaseItem, bulletinBaseItemLIZIZ, C0OKA.PUBLISH_SUCCESS);
            C0OPI.LIZ.getClass();
            C0OPI.LIZIZ(bulletinBaseItem, 1, bulletinBaseItemLIZIZ, 0);
        }
    }

    @Override // X.InterfaceC618620OOe
    public final void sp2(BulletinItem bulletinItem, BulletinBaseItem bulletinBaseItem, Map<String, String> map) {
        String str;
        BulletinBaseItem bulletinBaseItemLIZIZ;
        C0OLV c0olvHh2 = Hh2();
        if (c0olvHh2 != null && (str = c0olvHh2.LL) != null && Intrinsics.LJFF(bulletinBaseItem.LJJJJLI(), str) && (bulletinBaseItemLIZIZ = C618910OPh.LIZ.LIZIZ(bulletinItem, null, this.LL.Ly())) != null) {
            this.LL.jZ1(bulletinBaseItem, bulletinBaseItemLIZIZ, C0OKA.RESENT_SUCCESS);
            C0OPI.LIZ.getClass();
            C0OPI.LIZIZ(bulletinBaseItem, 1, bulletinBaseItemLIZIZ, 1);
            setState(AFwS240S0000000_9.get$arr$(372));
        }
    }

    public final Map<String, String> vQ2(String str, String str2, Map<String, String> map) {
        String str3;
        String str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C618910OPh.LIZ.getClass();
        linkedHashMap.putAll(C618910OPh.LIZLLL);
        if (Intrinsics.LJFF(map.get("from_upload"), "true")) {
            if (Intrinsics.LJFF(linkedHashMap.get("enter_method"), "quick_post")) {
                linkedHashMap.put("enter_method", "quick_upload");
            } else if (Intrinsics.LJFF(linkedHashMap.get("enter_method"), "post")) {
                linkedHashMap.put("enter_method", "upload");
            }
        } else if (Intrinsics.LJFF(linkedHashMap.get("enter_method"), "quick_post")) {
            linkedHashMap.put("enter_method", "quick_camera");
        } else if (Intrinsics.LJFF(linkedHashMap.get("enter_method"), "post")) {
            linkedHashMap.put("enter_method", "camera");
        }
        C0OLV c0olvHh2 = Hh2();
        if (c0olvHh2 != null && (str4 = c0olvHh2.LLJJI) != null) {
            linkedHashMap.put("enter_method", str4);
        }
        linkedHashMap.put("channel_id", str);
        linkedHashMap.put("content_type", str2);
        C0OLV c0olvHh22 = Hh2();
        if (c0olvHh22 == null || (str3 = c0olvHh22.LLILLJJLI) == null) {
            str3 = "";
        }
        linkedHashMap.put("entrance_page", str3);
        linkedHashMap.put("is_resend", CardStruct.IStatusCode.DEFAULT);
        String str5 = map.get("has_edited");
        if (str5 != null) {
            linkedHashMap.put("has_edited", str5);
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC618620OOe
    public final void LU0(BulletinBaseItem bulletinBaseItem, int i, String str, Map<String, String> map) {
        String str2;
        C0OLV c0olvHh2 = Hh2();
        if (c0olvHh2 == null || (str2 = c0olvHh2.LL) == null || !Intrinsics.LJFF(bulletinBaseItem.LJJJJLI(), str2)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notSentItem() - item:");
        sbLIZ.append(bulletinBaseItem);
        sbLIZ.append(", errorCode:");
        sbLIZ.append(i);
        sbLIZ.append(", errorMsg:");
        sbLIZ.append(str);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        BulletinBaseItem bulletinBaseItemLIZ = C0OO6.LIZ(bulletinBaseItem, false, 0, false, false, false, 0, null, null, 510);
        this.LL.jZ1(bulletinBaseItem, bulletinBaseItemLIZ, C0OKA.PUBLISH_FAIL);
        C0OPI.LIZ.getClass();
        C0OPI.LIZIZ(bulletinBaseItem, 0, bulletinBaseItemLIZ, 0);
        setState(new AwS60S1000000_9(str, 4));
    }

    @Override // X.C0OOI
    public final void fX1(String str, Map<String, String> map, C0OOF c0oof, String str2) {
        C0OLV c0olvHh2;
        String str3;
        LinkedHashMap linkedHashMap;
        String str4;
        String str5;
        boolean z;
        BulletinStyleStruct bulletinStyleStruct;
        EnumC618810OOx enumC618810OOx;
        String str6;
        String str7;
        if (a0.LJLIIIL(str).toString().length() != 0 && (c0olvHh2 = Hh2()) != null && (str3 = c0olvHh2.LL) != null) {
            BulletinProfileViewModel bulletinProfileViewModel = (BulletinProfileViewModel) this.LLILZ.getValue();
            ApplySkin applySkin = bulletinProfileViewModel.LLJJJJJIL;
            String str8 = null;
            if (applySkin == null) {
                BulletinHybridResourceResponse bulletinHybridResourceResponseLIZ = bulletinProfileViewModel.getState().LLJJJJJIL.LIZ();
                if (bulletinHybridResourceResponseLIZ != null) {
                    applySkin = bulletinHybridResourceResponseLIZ.getApplySkin();
                } else {
                    applySkin = null;
                }
            }
            if (map != null) {
                linkedHashMap = new LinkedHashMap(map);
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            C0OLV c0olvHh22 = Hh2();
            if (c0olvHh22 != null && (str7 = c0olvHh22.LLJJI) != null && (!a0.LJJJIL(str7))) {
                linkedHashMap.put("enter_method", str7);
            }
            C0OOY c0ooy = C0OOY.LIZ;
            C0OLV c0olvHh23 = Hh2();
            String str9 = "";
            if (c0olvHh23 == null || (str4 = c0olvHh23.LLILLJJLI) == null) {
                str4 = "";
            }
            c0ooy.getClass();
            List listLJFF = C0OOY.LJFF(str);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("channel_id", str3);
            linkedHashMap2.put("content_type", "text");
            String str10 = CardStruct.IStatusCode.DEFAULT;
            linkedHashMap2.put("is_resend", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap2.put("is_link", String.valueOf(C866950Xzh.LIZIZ(listLJFF) ? 1 : 0));
            if ((c0oof != null && (str5 = c0oof.LIZ) != null && str5.length() > 0) || (applySkin != null && (str5 = applySkin.id) != null)) {
                str9 = str5;
            }
            if (str9.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                linkedHashMap2.put("activity_id", str9);
            }
            linkedHashMap2.put("entrance_page", str4);
            linkedHashMap2.putAll(linkedHashMap);
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("activity_id", str9));
            if (listLJFF != null && !listLJFF.isEmpty()) {
                if (str2 != null) {
                    str10 = str2;
                }
                mapLJIIJ.put("is_link_preview", str10);
            }
            if (applySkin != null && (str6 = applySkin.id) != null) {
                mapLJIIJ.put("skin_id", str6);
            }
            if (c0oof == null || (bulletinStyleStruct = c0oof.LIZIZ) == null) {
                if (applySkin != null) {
                    bulletinStyleStruct = applySkin.styleStruct;
                } else {
                    bulletinStyleStruct = null;
                }
            }
            if (listLJFF != null && !listLJFF.isEmpty()) {
                enumC618810OOx = EnumC618810OOx.LINK;
            } else {
                enumC618810OOx = EnumC618810OOx.TEXT;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (bulletinStyleStruct != null) {
                str8 = bulletinStyleStruct.styleId;
            }
            String str11 = str8;
            C0OOP c0oop = new C0OOP(enumC618810OOx, 0, jCurrentTimeMillis, Long.valueOf(jCurrentTimeMillis2), str11, str, listLJFF, bulletinStyleStruct, GsonProtectorUtils.toJson(new Gson(), mapLJIIJ), Long.valueOf(C0OPX.LIZ()), 0, linkedHashMap2, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser(), false, null, 0, null, str3, null, null, (String) linkedHashMap2.get("unique_key"), 116904448);
            c0oop.LLILLL = true;
            C0OPI.LIZ.getClass();
            C0OPI.LIZ(c0oop, str3);
            C0OPQ.LIZ.getClass();
            C0OPQ.LJJJ(str3, linkedHashMap2);
            C0OOY.LJIIJ(c0oop);
            C23250099c.LIZLLL(C0OOY.LJIIIIZZ, null, null, new C0OKL(str3, c0oop, linkedHashMap2, null), 3);
        }
    }
}
