package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.C06J8;
import X.C09AY;
import X.C0N23;
import X.C0O2K;
import X.C0OB8;
import X.C0OFR;
import X.C0OOD;
import X.C0OOP;
import X.C0OOW;
import X.C0OPX;
import X.C0P3X;
import X.C0RUV;
import X.C0SXF;
import X.C0W17;
import X.C1223430hwT;
import X.C1227904rF;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1361330lWt;
import X.C13IQ;
import X.C1440005kM;
import X.C15438062q;
import X.C1588106Jr;
import X.C1623606Xi;
import X.C1697810uHb;
import X.C197039127h;
import X.C2188811AlT;
import X.C23250099c;
import X.C291001Au;
import X.C491001vg;
import X.C581480MrK;
import X.C603900NmO;
import X.C603910NmP;
import X.C603920NmQ;
import X.C603930NmR;
import X.C603940NmS;
import X.C612580O0y;
import X.C615470OCb;
import X.C618380ONg;
import X.C618910OPh;
import X.C627260Oiy;
import X.C632900Os4;
import X.C638560P2w;
import X.C729510SjV;
import X.C731530Sml;
import X.C759510Tqn;
import X.C786410Ut5;
import X.EnumC618810OOx;
import X.InterfaceC1357880lRK;
import X.InterfaceC1361270lWn;
import X.InterfaceC1361290lWp;
import X.InterfaceC582120MsM;
import X.InterfaceC601770Nix;
import Y.ACListenerS144S0100000_9;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM;
import com.ss.android.ugc.aweme.dynamic.card.data.MessageSubmitResponse;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.publishpanel.BulletinPublishPanelViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountCheckResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SingleBulletinItemCreateInfo;
import com.ss.android.ugc.aweme.offlinemode.ui.pagestate.OfflineModeDetailPageStateImp;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profilerec.vm.ProfileRecViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubListViewModel;
import com.tts.oecverify.BdTuring;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AwS123S1100000_9 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        C1223430hwT c1223430hwT = (C1223430hwT) obj;
        c1223430hwT.getClass();
        List<InterfaceC1361290lWp> list = c1223430hwT.getListState().LLILZ;
        if (list != null && !list.isEmpty()) {
            String str = awS123S1100000_9.s0;
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (InterfaceC1361290lWp interfaceC1361290lWp : list) {
                InterfaceC1361290lWp interfaceC1361290lWp2 = interfaceC1361290lWp;
                if (interfaceC1361290lWp2 instanceof InterfaceC1361270lWn) {
                    boolean zLJFF = Intrinsics.LJFF(((C0OB8) interfaceC1361290lWp2).getAweme().getAid(), str);
                    if (!z) {
                        if (!zLJFF) {
                            z = true;
                            arrayList.add(interfaceC1361290lWp);
                        }
                    } else if (!zLJFF) {
                        arrayList.add(interfaceC1361290lWp);
                    }
                } else if (!(interfaceC1361290lWp2 instanceof C1361330lWt) || z) {
                    arrayList.add(interfaceC1361290lWp);
                }
            }
            if (arrayList.size() != list.size()) {
                C0W17.LIZJ("listVM", "removeItemByAid, ready to remove");
                ((FriendsV3FeedListViewModel) awS123S1100000_9.l1).listSetItems(arrayList);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        AbstractC1623806Xk c491001vg;
        String str;
        C618380ONg c618380ONg = (C618380ONg) obj;
        BulletinAccountCheckResponse bulletinAccountCheckResponse = (BulletinAccountCheckResponse) awS123S1100000_9.l1;
        if (bulletinAccountCheckResponse != null && bulletinAccountCheckResponse.statusCode == 0) {
            c491001vg = new C1623606Xi(awS123S1100000_9.s0);
        } else {
            BulletinAccountCheckResponse bulletinAccountCheckResponse2 = (BulletinAccountCheckResponse) awS123S1100000_9.l1;
            if (bulletinAccountCheckResponse2 != null) {
                str = bulletinAccountCheckResponse2.statusMsg;
            } else {
                str = null;
            }
            c491001vg = new C491001vg(new Throwable(str));
        }
        return C618380ONg.LIZ(c618380ONg, c491001vg, null, null, false, 14);
    }

    public static final Object invoke$10(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        String str;
        String strLIZ;
        Map map = (Map) obj;
        Collection<WeakReference<InterfaceC582120MsM>> collectionValues = C581480MrK.LJFF.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            Object obj2 = ((Reference) it2.next()).get();
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        String str2 = awS123S1100000_9.s0;
        C0N23 c0n23 = (C0N23) awS123S1100000_9.l1;
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((InterfaceC582120MsM) next).LJFF(str2, c0n23)) {
                if (next != null) {
                    str = "1";
                }
            }
        }
        str = CardStruct.IStatusCode.DEFAULT;
        map.put("matched", str);
        map.put("eventType", awS123S1100000_9.s0);
        map.put("measurableId", (C0N23) awS123S1100000_9.l1);
        ConcurrentHashMap<String, WeakReference<InterfaceC582120MsM>> concurrentHashMap = C581480MrK.LJFF;
        map.put("exposureCallbacksSize", Integer.valueOf(concurrentHashMap.size()));
        Collection<WeakReference<InterfaceC582120MsM>> collectionValues2 = concurrentHashMap.values();
        String str3 = awS123S1100000_9.s0;
        C0N23 c0n232 = (C0N23) awS123S1100000_9.l1;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(collectionValues2, 10));
        Iterator<T> it4 = collectionValues2.iterator();
        while (it4.hasNext()) {
            InterfaceC582120MsM interfaceC582120MsM = (InterfaceC582120MsM) ((Reference) it4.next()).get();
            if (interfaceC582120MsM != null) {
                strLIZ = interfaceC582120MsM.LIZ(str3, c0n232);
            } else {
                strLIZ = null;
            }
            arrayList2.add(strLIZ);
        }
        map.put("exposureCallbacks", arrayList2);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        String uid;
        C1223430hwT c1223430hwT = (C1223430hwT) obj;
        c1223430hwT.getClass();
        List<InterfaceC1361290lWp> list = c1223430hwT.getListState().LLILZ;
        if (list != null && !list.isEmpty()) {
            String str = awS123S1100000_9.s0;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1361290lWp interfaceC1361290lWp : list) {
                InterfaceC1361290lWp interfaceC1361290lWp2 = interfaceC1361290lWp;
                if ((interfaceC1361290lWp2 instanceof InterfaceC1361270lWn) && !(interfaceC1361290lWp2 instanceof InterfaceC1357880lRK)) {
                    C0OB8 c0ob8 = (C0OB8) interfaceC1361290lWp2;
                    if (C729510SjV.LJJIJIL(c0ob8.getAweme())) {
                        User author = c0ob8.getAweme().getAuthor();
                        if (author != null) {
                            uid = author.getUid();
                        } else {
                            uid = null;
                        }
                        if (Intrinsics.LJFF(uid, str)) {
                        }
                    }
                }
                arrayList.add(interfaceC1361290lWp);
            }
            if (arrayList.size() != list.size()) {
                C0W17.LIZJ("listVM", "removeStoryItemsByUid, ready to remove");
                ((FriendsV3FeedListViewModel) awS123S1100000_9.l1).listSetItems(arrayList);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        SingleBulletinItemCreateInfo singleBulletinItemCreateInfo;
        BulletinBaseItem bulletinBaseItem;
        C06J8 c06j8VQ2;
        Long l;
        boolean zBooleanValue;
        Boolean bool;
        Boolean bool2;
        Long l2;
        String str;
        C06J8 c06j8VQ22;
        Long l3;
        C0OOP c0oop;
        String str2;
        String strLJI;
        C0OOW c0oow = ((C1588106Jr) obj).LL;
        if (c0oow != null && (singleBulletinItemCreateInfo = c0oow.LIZLLL) != null && (bulletinBaseItem = c0oow.LJ) != null && (c06j8VQ2 = ((BulletinPublishPanelViewModel) awS123S1100000_9.l1).vQ2()) != null && (l = c06j8VQ2.LL) != null) {
            long jLongValue = l.longValue();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(singleBulletinItemCreateInfo);
            bulletinBaseItem.LLFII(awS123S1100000_9.s0);
            arrayList2.add(bulletinBaseItem);
            BulletinPublishPanelViewModel bulletinPublishPanelViewModel = (BulletinPublishPanelViewModel) awS123S1100000_9.l1;
            if (bulletinPublishPanelViewModel.LL.length() != 0 && (c06j8VQ22 = bulletinPublishPanelViewModel.vQ2()) != null && (l3 = c06j8VQ22.LL) != null) {
                long jLongValue2 = l3.longValue();
                BulletinBaseItem bulletinBaseItemLIZLLL = C618910OPh.LIZLLL(C618910OPh.LIZ, jLongValue2, EnumC618810OOx.TEXT.ordinal(), bulletinPublishPanelViewModel.LL, null, null, null, null, 504);
                String strLJI2 = null;
                if ((bulletinBaseItemLIZLLL instanceof C0OOP) && (c0oop = (C0OOP) bulletinBaseItemLIZLLL) != null) {
                    List<String> list = c0oop.LLJILJILJ;
                    if (list != null && !list.isEmpty()) {
                        try {
                            C1227904rF.LIZ.getClass();
                            strLJI2 = C1227904rF.LJI(list);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("BulletinPublishPanelViewModel appendTextContent linkStr error ");
                            sbLIZ.append(e.getMessage());
                            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("content_type", "text");
                    if (list != null && !list.isEmpty()) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    linkedHashMap.put("is_link", str2);
                    try {
                        C1227904rF.LIZ.getClass();
                        strLJI = C1227904rF.LJI(linkedHashMap);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("BulletinPublishPanelViewModel appendTextContent publishExtraStr error ");
                        sbLIZ2.append(e2.getMessage());
                        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                        strLJI = "";
                    }
                    arrayList.add(new SingleBulletinItemCreateInfo(Integer.valueOf(c0oop.LLILZLL.ordinal()), Long.valueOf(jLongValue2), c0oop.LLJILJIL, null, strLJI2, null, strLJI, null));
                    arrayList2.add(c0oop);
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            C06J8 c06j8VQ23 = ((BulletinPublishPanelViewModel) awS123S1100000_9.l1).vQ2();
            if (c06j8VQ23 != null && (str = c06j8VQ23.LLILLJJLI) != null) {
                linkedHashMap2.put("enter_method", str);
            }
            C06J8 c06j8VQ24 = ((BulletinPublishPanelViewModel) awS123S1100000_9.l1).vQ2();
            if (c06j8VQ24 != null && (l2 = c06j8VQ24.LL) != null) {
                linkedHashMap2.put("channel_id", String.valueOf(l2.longValue()));
            }
            C06J8 c06j8VQ25 = ((BulletinPublishPanelViewModel) awS123S1100000_9.l1).vQ2();
            if (c06j8VQ25 != null && (bool2 = c06j8VQ25.LLILLL) != null) {
                bool2.booleanValue();
            }
            C06J8 c06j8VQ26 = ((BulletinPublishPanelViewModel) awS123S1100000_9.l1).vQ2();
            if (c06j8VQ26 != null && (bool = c06j8VQ26.LLILZ) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            C1440005kM.LIZ(new C0OOD(jLongValue, arrayList, arrayList2, linkedHashMap2, zBooleanValue));
            ((BulletinPublishPanelViewModel) awS123S1100000_9.l1).setState(AFwS229S0000000_2.get$arr$(748));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        ((CopyOnWriteArraySet) ((FollowInnerFeedVM) awS123S1100000_9.l1).LLIZ.getValue()).add(awS123S1100000_9.s0);
        if (!Intrinsics.LJFF(awS123S1100000_9.s0, ((C612580O0y) obj).LL)) {
            ((FollowInnerFeedVM) awS123S1100000_9.l1).setState(new AwS60S1000000_9(awS123S1100000_9.s0, 16));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        C615470OCb c615470OCb = (C615470OCb) obj;
        c615470OCb.getClass();
        List listLIZ = C627260Oiy.LIZ(c615470OCb);
        if (listLIZ != null) {
            String str = awS123S1100000_9.s0;
            AddYoursHubListViewModel addYoursHubListViewModel = (AddYoursHubListViewModel) awS123S1100000_9.l1;
            int i = 0;
            for (Object obj2 : listLIZ) {
                int i2 = i + 1;
                String aid = null;
                if (i >= 0) {
                    Aweme video = ((C0O2K) obj2).LLILLJJLI.getVideo();
                    if (video != null) {
                        aid = video.getAid();
                    }
                    if (Intrinsics.LJFF(aid, str)) {
                        addYoursHubListViewModel.listRemoveItemAt(i);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        InterfaceC601770Nix interfaceC601770Nix = (InterfaceC601770Nix) obj;
        interfaceC601770Nix.setRawData(awS123S1100000_9.s0);
        interfaceC601770Nix.setStatusCode(Integer.valueOf(((MessageSubmitResponse) awS123S1100000_9.l1).statusCode));
        interfaceC601770Nix.setStatusMsg(((MessageSubmitResponse) awS123S1100000_9.l1).statusMsg);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        C23250099c.LIZLLL(C759510Tqn.LIZIZ((SparkContext) awS123S1100000_9.l1), null, null, new C603900NmO(awS123S1100000_9.s0, null, (JSONObject) obj), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        C23250099c.LIZLLL(C759510Tqn.LIZIZ((SparkContext) awS123S1100000_9.l1), null, null, new C603920NmQ(awS123S1100000_9.s0, null, (JSONObject) obj), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        C23250099c.LIZLLL(C759510Tqn.LIZIZ((SparkContext) awS123S1100000_9.l1), null, null, new C603930NmR(awS123S1100000_9.s0, null, (JSONObject) obj), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        C23250099c.LIZLLL(C759510Tqn.LIZIZ((SparkContext) awS123S1100000_9.l1), null, null, new C603910NmP(awS123S1100000_9.s0, null, (JSONObject) obj), 3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        c197039127h.setText(awS123S1100000_9.s0);
        c197039127h.setButtonSize(3);
        c197039127h.setButtonVariant(2);
        C786410Ut5.U8(c197039127h, new ACListenerS144S0100000_9((OfflineModeDetailPageStateImp) awS123S1100000_9.l1, 83));
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        C23250099c.LIZLLL(C759510Tqn.LIZIZ((SparkContext) awS123S1100000_9.l1), null, null, new C603940NmS(awS123S1100000_9.s0, null, (JSONObject) obj), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        C291001Au c291001Au;
        C731530Sml c731530Sml = (C731530Sml) obj;
        Context context = ((VideoFavoriteVM) awS123S1100000_9.l1).getContext();
        if (context != null && !C0SXF.LJIL(context)) {
            c291001Au = new C291001Au(awS123S1100000_9.s0);
        } else {
            c291001Au = null;
        }
        return C731530Sml.LIZ(c731530Sml, null, new C291001Au(Boolean.TRUE), null, c291001Au, null, null, null, 117);
    }

    public static final Object invoke$3(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        return C0OFR.LIZ((C0OFR) obj, null, awS123S1100000_9.s0, AwemeExtKt.isCollected((Aweme) awS123S1100000_9.l1), 5);
    }

    public static final Object invoke$4(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(awS123S1100000_9.s0);
        c1331670kl3LJIIIZ.LJJ((SmartImageView) obj);
        c1331670kl3LJIIIZ.LJIIJ(new C632900Os4((ProfileRecViewModel) awS123S1100000_9.l1));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        ((Function2) awS123S1100000_9.l1).invoke(awS123S1100000_9.s0, obj);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        return C0P3X.LIZ((C0P3X) obj, awS123S1100000_9.s0, false, (C638560P2w) awS123S1100000_9.l1, false, null, null, null, null, null, null, null, null, 4080);
    }

    public static final Object invoke$7(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        return C0P3X.LIZ((C0P3X) obj, awS123S1100000_9.s0, false, (C638560P2w) awS123S1100000_9.l1, false, null, null, null, null, null, null, null, null, 4080);
    }

    public static final Object invoke$8(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        C0RUV c0ruv = (C0RUV) obj;
        c0ruv.LL = (C13IQ) awS123S1100000_9.l1;
        c0ruv.LLILLJJLI = awS123S1100000_9.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS123S1100000_9 awS123S1100000_9, Object obj) {
        String str;
        String strLIZ;
        Map map = (Map) obj;
        Collection<WeakReference<InterfaceC582120MsM>> collectionValues = C581480MrK.LJFF.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            Object obj2 = ((Reference) it2.next()).get();
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        String str2 = awS123S1100000_9.s0;
        C0N23 c0n23 = (C0N23) awS123S1100000_9.l1;
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((InterfaceC582120MsM) next).LJFF(str2, c0n23)) {
                if (next != null) {
                    str = "1";
                }
            }
        }
        str = CardStruct.IStatusCode.DEFAULT;
        map.put("matched", str);
        map.put("eventType", awS123S1100000_9.s0);
        map.put("measurableId", (C0N23) awS123S1100000_9.l1);
        ConcurrentHashMap<String, WeakReference<InterfaceC582120MsM>> concurrentHashMap = C581480MrK.LJFF;
        map.put("exposureCallbacksSize", Integer.valueOf(concurrentHashMap.size()));
        Collection<WeakReference<InterfaceC582120MsM>> collectionValues2 = concurrentHashMap.values();
        String str3 = awS123S1100000_9.s0;
        C0N23 c0n232 = (C0N23) awS123S1100000_9.l1;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(collectionValues2, 10));
        Iterator<T> it4 = collectionValues2.iterator();
        while (it4.hasNext()) {
            InterfaceC582120MsM interfaceC582120MsM = (InterfaceC582120MsM) ((Reference) it4.next()).get();
            if (interfaceC582120MsM != null) {
                strLIZ = interfaceC582120MsM.LIZ(str3, c0n232);
            } else {
                strLIZ = null;
            }
            arrayList2.add(strLIZ);
        }
        map.put("exposureCallbacks", arrayList2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(SparkContext sparkContext, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = sparkContext;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(FollowInnerFeedVM followInnerFeedVM, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = followInnerFeedVM;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(VideoFavoriteVM videoFavoriteVM, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = videoFavoriteVM;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(FriendsV3FeedListViewModel friendsV3FeedListViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = friendsV3FeedListViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(BulletinPublishPanelViewModel bulletinPublishPanelViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = bulletinPublishPanelViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(BulletinAccountCheckResponse bulletinAccountCheckResponse, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = bulletinAccountCheckResponse;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(ProfileRecViewModel profileRecViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = profileRecViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(String str, C0N23 c0n23, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0n23;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(String str, C638560P2w c638560P2w, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c638560P2w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(String str, C13IQ c13iq, int i) {
        super(1);
        this.$t = i;
        this.l1 = c13iq;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(String str, MessageSubmitResponse messageSubmitResponse, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = messageSubmitResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(String str, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(String str, OfflineModeDetailPageStateImp offlineModeDetailPageStateImp, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = offlineModeDetailPageStateImp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(String str, AddYoursHubListViewModel addYoursHubListViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = addYoursHubListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1100000_9(AwS623S0100000_9 awS623S0100000_9, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = awS623S0100000_9;
        this.s0 = str;
    }
}
