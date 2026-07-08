package kotlin.jvm.internal;

import X.AbstractC1201400hMw;
import X.AbstractC1202400hOY;
import X.C062P;
import X.C09AY;
import X.C0N4P;
import X.C1153950g8P;
import X.C1155540gAy;
import X.C1158890gGN;
import X.C1159320gH4;
import X.C1170570gZD;
import X.C1171050gZz;
import X.C1171600gas;
import X.C1177960gl8;
import X.C1178620gmC;
import X.C1179830go9;
import X.C1179840goA;
import X.C1179850goB;
import X.C1182980gtE;
import X.C1184530gvj;
import X.C1185350gx3;
import X.C1185410gx9;
import X.C1185490gxH;
import X.C1188440h22;
import X.C1189060h32;
import X.C1196140hES;
import X.C1197360hGQ;
import X.C1197430hGX;
import X.C1198600hIQ;
import X.C1201730hNT;
import X.C1207450hWh;
import X.C1360460lVU;
import X.C13BV;
import X.C15438062q;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C2188811AlT;
import X.C291001Au;
import X.EnumC1359020lTA;
import X.InterfaceC1183590guD;
import X.InterfaceC687820QyS;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ARunnableS116S0100000_16;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.favorites.business.collection.ChooseCollectionSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.models.RssArticle;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumFragment;
import com.ss.android.ugc.aweme.poi.creator.PoiCreatorApi;
import com.ss.android.ugc.aweme.poi.creator.PoiCreatorFragment;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiDetailContentHeaderNewRegionalAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.stable.PoiStableBottomBarModule;
import com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionViewModel;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailAreaFilterVM;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel;
import com.ss.android.ugc.aweme.poi.quiz.vm.PoiQuizPageVM;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackViewModel;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS105S0110000_18;

/* JADX INFO: loaded from: classes19.dex */
public class AwS105S0110000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        return C1201730hNT.LIZ((C1201730hNT) obj, null, null, null, null, new Pair(Boolean.valueOf(awS105S0110000_18.z1), (LocationRegion) awS105S0110000_18.l0), null, null, 111);
    }

    public static final Object invoke$1(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        Integer numValueOf;
        C1158890gGN c1158890gGN = (C1158890gGN) obj;
        if (awS105S0110000_18.z1) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((RssArticle) awS105S0110000_18.l0).guid);
        }
        return C1158890gGN.LIZ(c1158890gGN, null, null, null, false, numValueOf, 15);
    }

    public static final Object invoke$10(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        InterfaceC1183590guD interfaceC1183590guD = (InterfaceC1183590guD) obj;
        interfaceC1183590guD.LIZIZ(new AwS597S0100000_18((PoiDetailContentHeaderBaseAssemV3) awS105S0110000_18.l0, 298));
        interfaceC1183590guD.LJIIJJI(new AwS556S0100000_12((PoiDetailContentHeaderBaseAssemV3) awS105S0110000_18.l0, 538));
        if (awS105S0110000_18.z1) {
            interfaceC1183590guD.LJIJJLI("data_from_anchor", "1");
            interfaceC1183590guD.LJJJ(new AwS597S0100000_18((PoiDetailContentHeaderBaseAssemV3) awS105S0110000_18.l0, 299));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        InterfaceC1183590guD interfaceC1183590guD = (InterfaceC1183590guD) obj;
        interfaceC1183590guD.LIZIZ(new AwS597S0100000_18((PoiDetailContentHeaderNewRegionalAssem) awS105S0110000_18.l0, 303));
        interfaceC1183590guD.LJIIJJI(new AwS556S0100000_12((PoiDetailContentHeaderNewRegionalAssem) awS105S0110000_18.l0, 542));
        if (awS105S0110000_18.z1) {
            interfaceC1183590guD.LJIJJLI("data_from_anchor", "1");
            interfaceC1183590guD.LJJJ(new AwS597S0100000_18((PoiDetailContentHeaderNewRegionalAssem) awS105S0110000_18.l0, 304));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        Object obj2;
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LIZLLL = "tiktok/poi/rewards/recommend";
        c1182980gtE.LJ = "quiz_request";
        String str = "1";
        if (((PoiQuizPageVM) awS105S0110000_18.l0).LLJIJIL) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1182980gtE.LJFF = new Pair<>("is_init", obj2);
        if (!awS105S0110000_18.z1) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1182980gtE.LJI = new Pair<>("location_allowed", str);
        String str2 = ((PoiQuizPageVM) awS105S0110000_18.l0).LL;
        if (str2 == null) {
            str2 = "";
        }
        c1182980gtE.LJII = new Pair<>("enter_from", str2);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C1153950g8P(awS105S0110000_18.z1, ((PoiStableBottomBarModule) awS105S0110000_18.l0).getReviewExtraInfo());
        c062p.LIZIZ = "PoiWriteReviewButtonHierarchyData";
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        ArrayList arrayList;
        C1179840goA c1179840goA = (C1179840goA) obj;
        List<C1179850goB> list = c1179840goA.LL;
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1179850goB> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1179850goB(it2.next().LL, false, false));
            }
        } else {
            arrayList = null;
        }
        List<C1179830go9> list2 = c1179840goA.LLILLJJLI;
        if (list2 != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (C1179830go9 c1179830go9 : list2) {
                arrayList2.add(new C1179830go9(c1179830go9.LL, c1179830go9.LLILLJJLI, false, false));
            }
        }
        if (arrayList != null && (!arrayList.isEmpty()) && arrayList2 != null && (!arrayList2.isEmpty())) {
            ((PoiMapDetailAreaFilterVM) awS105S0110000_18.l0).setState(new AwS38S0310000_18((List) arrayList, (List<C1179850goB>) arrayList2, (List<C1179830go9>) c1179840goA, (C1179840goA) awS105S0110000_18.z1, true));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        ((HashtagFeedbackViewModel) awS105S0110000_18.l0).setState(new AwS32S0010000_18(awS105S0110000_18.z1, 24));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        C291001Au<List<C1171050gZz>> c291001AuLIZ;
        List<C1171050gZz> list;
        Long l;
        C1170570gZD c1170570gZD = (C1170570gZD) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get videos in allfavorites: cursor = ");
        sbLIZ.append(c1170570gZD.LLILLL);
        sbLIZ.append(", maxCursor = ");
        sbLIZ.append(((CollectionContentResponse) awS105S0110000_18.l0).maxCursor);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Collections", C2188811AlT.LIZIZ(sbLIZ));
        Long l2 = ((CollectionContentResponse) awS105S0110000_18.l0).maxCursor;
        long j = c1170570gZD.LLILLL;
        long jLongValue = 0;
        if (l2 != null && l2.longValue() == j && ((l = ((CollectionContentResponse) awS105S0110000_18.l0).maxCursor) == null || l.longValue() != 0)) {
            return c1170570gZD;
        }
        if (awS105S0110000_18.z1 || (c291001AuLIZ = c1170570gZD.LLILLJJLI.LIZ()) == null || (list = c291001AuLIZ.LIZ) == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = false;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        List<Aweme> list2 = ((CollectionContentResponse) awS105S0110000_18.l0).items;
        if (list2 != null && !list2.isEmpty()) {
            List<Aweme> list3 = ((CollectionContentResponse) awS105S0110000_18.l0).items;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator<Aweme> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C1171050gZz(0, 4, it2.next()));
            }
            arrayList.addAll(arrayList2);
        }
        C1623606Xi c1623606Xi = new C1623606Xi(new C291001Au(arrayList));
        Long l3 = ((CollectionContentResponse) awS105S0110000_18.l0).maxCursor;
        if (l3 != null) {
            jLongValue = l3.longValue();
        }
        Boolean bool = ((CollectionContentResponse) awS105S0110000_18.l0).hasMore;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new C1170570gZD(c1623606Xi, jLongValue, zBooleanValue, null, 49);
    }

    public static final Object invoke$17(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        ((VideoCollectionListViewModel) awS105S0110000_18.l0).setState(new AwS32S0010000_18(awS105S0110000_18.z1, 26));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$18(kotlin.jvm.internal.AwS105S0110000_18 r6, java.lang.Object r7) {
        /*
            X.0gZD r7 = (X.C1170570gZD) r7
            boolean r0 = r6.z1
            if (r0 != 0) goto L14
            boolean r0 = r7.LLILZ
            if (r0 == 0) goto L5f
            X.06Xk<X.01Au<java.util.List<X.0gZz>>> r1 = r7.LLILLJJLI
            boolean r0 = r1 instanceof X.C491101vh
            if (r0 != 0) goto L14
            boolean r0 = r1 instanceof X.C491001vg
            if (r0 == 0) goto L21
        L14:
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r1 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r1
            r0 = 1010(0x3f2, float:1.415E-42)
            kotlin.jvm.internal.AFwS256S0000000_18 r0 = kotlin.jvm.internal.AFwS256S0000000_18.get$arr$(r0)
            r1.setState(r0)
        L21:
            boolean r0 = r6.z1
            if (r0 == 0) goto L62
            r1 = 0
        L27:
            java.lang.Object r5 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r5 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r5
            X.09YA r0 = r5.LLILZLL
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            X.00hg r0 = r0.getOperator()
            X.0gYk r0 = (X.InterfaceC1170280gYk) r0
            X.11JN r1 = r0.LLJLLIL(r1)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r4 = r1.LJL(r0)
            Y.AfS58S0110000_18 r3 = new Y.AfS58S0110000_18
            java.lang.Object r2 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r2 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r2
            boolean r1 = r6.z1
            r0 = 5
            r3.<init>(r2, r1, r0)
            Y.AfS187S0100000_18 r1 = new Y.AfS187S0100000_18
            r0 = 79
            r1.<init>(r2, r0)
            X.01kM r0 = r4.LJJLL(r3, r1)
            r5.disposeOnClear(r0)
        L5f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L62:
            long r1 = r7.LLILLL
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS105S0110000_18.invoke$18(kotlin.jvm.internal.AwS105S0110000_18, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$19(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        C291001Au<List<C1171050gZz>> c291001AuLIZ;
        List<C1171050gZz> list;
        Long l;
        C1170570gZD c1170570gZD = (C1170570gZD) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get videos in candidate: cursor = ");
        sbLIZ.append(c1170570gZD.LLILLL);
        sbLIZ.append(", maxCursor = ");
        sbLIZ.append(((CollectionContentResponse) awS105S0110000_18.l0).maxCursor);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Collections", C2188811AlT.LIZIZ(sbLIZ));
        Long l2 = ((CollectionContentResponse) awS105S0110000_18.l0).maxCursor;
        long j = c1170570gZD.LLILLL;
        long jLongValue = 0;
        if (l2 != null && l2.longValue() == j && ((l = ((CollectionContentResponse) awS105S0110000_18.l0).maxCursor) == null || l.longValue() != 0)) {
            return c1170570gZD;
        }
        if (awS105S0110000_18.z1 || (c291001AuLIZ = c1170570gZD.LLILLJJLI.LIZ()) == null || (list = c291001AuLIZ.LIZ) == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = false;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        List<Aweme> list2 = ((CollectionContentResponse) awS105S0110000_18.l0).items;
        if (list2 != null && !list2.isEmpty()) {
            List<Aweme> list3 = ((CollectionContentResponse) awS105S0110000_18.l0).items;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator<Aweme> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C1171050gZz(1, 4, it2.next()));
            }
            arrayList.addAll(arrayList2);
        }
        C1623606Xi c1623606Xi = new C1623606Xi(new C291001Au(arrayList));
        Long l3 = ((CollectionContentResponse) awS105S0110000_18.l0).maxCursor;
        if (l3 != null) {
            jLongValue = l3.longValue();
        }
        Boolean bool = ((CollectionContentResponse) awS105S0110000_18.l0).hasMore;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new C1170570gZD(c1623606Xi, jLongValue, zBooleanValue, null, 49);
    }

    public static final Object invoke$2(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        String string;
        boolean z;
        String string2;
        String string3;
        C062P c062p = (C062P) obj;
        boolean z2 = awS105S0110000_18.z1;
        Bundle arguments = ((ChooseCollectionSheetFragment) awS105S0110000_18.l0).getArguments();
        String string4 = null;
        if (arguments != null) {
            string = arguments.getString("excludeId");
        } else {
            string = null;
        }
        Bundle arguments2 = ((ChooseCollectionSheetFragment) awS105S0110000_18.l0).getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("useCache");
        } else {
            z = false;
        }
        boolean zRR = ((ChooseCollectionSheetFragment) awS105S0110000_18.l0).RR();
        Bundle arguments3 = ((ChooseCollectionSheetFragment) awS105S0110000_18.l0).getArguments();
        if (arguments3 != null) {
            string2 = arguments3.getString("awemeId");
        } else {
            string2 = null;
        }
        Bundle arguments4 = ((ChooseCollectionSheetFragment) awS105S0110000_18.l0).getArguments();
        if (arguments4 != null) {
            string3 = arguments4.getString("enterFrom");
        } else {
            string3 = null;
        }
        Bundle arguments5 = ((ChooseCollectionSheetFragment) awS105S0110000_18.l0).getArguments();
        if (arguments5 != null) {
            string4 = arguments5.getString("enterMethod");
        }
        c062p.LIZ = new C1171600gas(string, string2, string3, z2, string4, z, zRR);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$20(kotlin.jvm.internal.AwS105S0110000_18 r6, java.lang.Object r7) {
        /*
            X.0gZD r7 = (X.C1170570gZD) r7
            boolean r1 = r6.z1
            if (r1 != 0) goto Ld
            boolean r0 = r7.LLILZ
            if (r0 != 0) goto Ld
        La:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Ld:
            r3 = 0
            if (r1 != 0) goto L1a
            X.06Xk<X.01Au<java.util.List<X.0gZz>>> r1 = r7.LLILLJJLI
            boolean r0 = r1 instanceof X.C491101vh
            if (r0 != 0) goto L1a
            boolean r0 = r1 instanceof X.C491001vg
            if (r0 == 0) goto L29
        L1a:
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r1 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r1
            r1.LLILLJJLI = r3
            r0 = 1011(0x3f3, float:1.417E-42)
            kotlin.jvm.internal.AFwS256S0000000_18 r0 = kotlin.jvm.internal.AFwS256S0000000_18.get$arr$(r0)
            r1.setState(r0)
        L29:
            boolean r0 = r6.z1
            if (r0 != 0) goto L49
            boolean r0 = r7.LLILZ
            if (r0 == 0) goto L49
            X.06Xk<X.01Au<java.util.List<X.0gZz>>> r0 = r7.LLILLJJLI
            java.lang.Object r0 = r0.LIZ()
            X.01Au r0 = (X.C291001Au) r0
            r1 = 1
            if (r0 == 0) goto L49
            T r0 = r0.LIZ
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L49
            boolean r0 = r0.isEmpty()
            if (r0 != r1) goto L49
            r3 = 1
        L49:
            boolean r0 = r6.z1
            if (r0 == 0) goto L96
            r1 = 0
        L4f:
            java.lang.Object r5 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r5 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r5
            X.09YA r0 = r5.LLILZLL
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            X.00hg r0 = r0.getOperator()
            X.0gYk r0 = (X.InterfaceC1170280gYk) r0
            X.11JN r1 = r0.LLIZ(r1)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r2 = r1.LJL(r0)
            X.0gZE r1 = new X.0gZE
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r0 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r0
            r1.<init>()
            X.11Nm r4 = r2.LJJIIJ(r1)
            Y.AfS58S0110000_18 r3 = new Y.AfS58S0110000_18
            java.lang.Object r2 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r2 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r2
            boolean r1 = r6.z1
            r0 = 6
            r3.<init>(r2, r1, r0)
            Y.AfS187S0100000_18 r1 = new Y.AfS187S0100000_18
            r0 = 80
            r1.<init>(r2, r0)
            X.01kM r0 = r4.LJJLL(r3, r1)
            r5.disposeOnClear(r0)
            goto La
        L96:
            long r1 = r7.LLILLL
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS105S0110000_18.invoke$20(kotlin.jvm.internal.AwS105S0110000_18, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$21(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        LocationData locationData = (LocationData) awS105S0110000_18.l0;
        return C1178620gmC.LIZ((C1178620gmC) obj, null, new C1623606Xi(new C1177960gl8(locationData.latitude, locationData.longitude)), awS105S0110000_18.z1, 1);
    }

    public static final Object invoke$22(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        Pair pairLIZIZ;
        Pair pairLIZIZ2;
        if (!(((C1178620gmC) obj).LLILLJJLI instanceof C1623706Xj)) {
            ((PositionSelectionViewModel) awS105S0110000_18.l0).setState(AFwS256S0000000_18.get$arr$(1018));
            if (awS105S0110000_18.z1) {
                pairLIZIZ = C1198600hIQ.LIZ();
            } else {
                pairLIZIZ = C1198600hIQ.LIZIZ();
            }
            AbstractC1202400hOY abstractC1202400hOY = (AbstractC1202400hOY) pairLIZIZ.getFirst();
            if (awS105S0110000_18.z1) {
                pairLIZIZ2 = C1198600hIQ.LIZ();
            } else {
                pairLIZIZ2 = C1198600hIQ.LIZIZ();
            }
            AbstractC1202400hOY abstractC1202400hOY2 = (AbstractC1202400hOY) pairLIZIZ2.getSecond();
            C1207450hWh c1207450hWh = C1207450hWh.LIZ;
            final PositionSelectionViewModel positionSelectionViewModel = (PositionSelectionViewModel) awS105S0110000_18.l0;
            String str = positionSelectionViewModel.LL;
            String str2 = positionSelectionViewModel.LLILLJJLI;
            final boolean z = awS105S0110000_18.z1;
            c1207450hWh.LJIIL(str, str2, abstractC1202400hOY, abstractC1202400hOY2, new InterfaceC687820QyS() { // from class: X.0gmQ
                @Override // X.InterfaceC687820QyS
                public final void LIZ(LocationData locationData) {
                    positionSelectionViewModel.setState(new AwS105S0110000_18(locationData, z, 21));
                }

                @Override // X.InterfaceC687820QyS
                public final void onError(int i, String str3) {
                    positionSelectionViewModel.setState(AFwS256S0000000_18.get$arr$(1019));
                }
            }, -1L);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        boolean z = ((C1159320gH4) obj).LLILZIL;
        boolean z2 = awS105S0110000_18.z1;
        if (z != z2) {
            ((PoiOrderSubmitViewModel) awS105S0110000_18.l0).setState(new AwS32S0010000_18(z2, 32));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, ((C0N4P) awS105S0110000_18.l0).getStatusStr());
        c1196140hES.LIZ(awS105S0110000_18.z1 ? 1 : 0, "is from tab preload");
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        int iIntValue;
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(awS105S0110000_18.z1 ? 1 : 0, "success");
        Integer num = (Integer) awS105S0110000_18.l0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        c1196140hES.LIZIZ(iIntValue, "errorCode");
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS105S0110000_18 r6, java.lang.Object r7) {
        /*
            X.0gZD r7 = (X.C1170570gZD) r7
            java.lang.Object r2 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r2 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r2
            java.lang.String r3 = r2.LL
            if (r3 == 0) goto L63
            boolean r0 = r6.z1
            if (r0 != 0) goto L1c
            boolean r0 = r7.LLILZ
            if (r0 == 0) goto L63
            X.06Xk<X.01Au<java.util.List<X.0gZz>>> r1 = r7.LLILLJJLI
            boolean r0 = r1 instanceof X.C491101vh
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof X.C491001vg
            if (r0 == 0) goto L25
        L1c:
            r0 = 105(0x69, float:1.47E-43)
            kotlin.jvm.internal.AFwS256S0000000_18 r0 = kotlin.jvm.internal.AFwS256S0000000_18.get$arr$(r0)
            r2.setState(r0)
        L25:
            boolean r0 = r6.z1
            if (r0 == 0) goto L66
            r1 = 0
        L2b:
            java.lang.Object r5 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r5 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r5
            X.09YA r0 = r5.LLILZLL
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            X.00hg r0 = r0.getOperator()
            X.0gYk r0 = (X.InterfaceC1170280gYk) r0
            X.11JN r1 = r0.LLLLII(r1, r3)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r4 = r1.LJL(r0)
            Y.AfS58S0110000_18 r3 = new Y.AfS58S0110000_18
            java.lang.Object r2 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r2 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r2
            boolean r1 = r6.z1
            r0 = 2
            r3.<init>(r2, r1, r0)
            Y.AfS187S0100000_18 r1 = new Y.AfS187S0100000_18
            r0 = 13
            r1.<init>(r2, r0)
            X.01kM r0 = r4.LJJLL(r3, r1)
            r5.disposeOnClear(r0)
        L63:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L66:
            long r1 = r7.LLILLL
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS105S0110000_18.invoke$3(kotlin.jvm.internal.AwS105S0110000_18, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        C291001Au<List<C1171050gZz>> c291001AuLIZ;
        List<C1171050gZz> list;
        int i;
        Long l;
        C1170570gZD c1170570gZD = (C1170570gZD) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get videos in collection: cursor = ");
        sbLIZ.append(c1170570gZD.LLILLL);
        sbLIZ.append(", maxCursor = ");
        sbLIZ.append(((CollectionContentResponse) awS105S0110000_18.l0).maxCursor);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Collections", C2188811AlT.LIZIZ(sbLIZ));
        Long l2 = ((CollectionContentResponse) awS105S0110000_18.l0).maxCursor;
        long j = c1170570gZD.LLILLL;
        long jLongValue = 0;
        if (l2 != null && l2.longValue() == j && ((l = ((CollectionContentResponse) awS105S0110000_18.l0).maxCursor) == null || l.longValue() != 0)) {
            return c1170570gZD;
        }
        if (awS105S0110000_18.z1 || (c291001AuLIZ = c1170570gZD.LLILLJJLI.LIZ()) == null || (list = c291001AuLIZ.LIZ) == null) {
            list = C13BV.INSTANCE;
        }
        boolean zBooleanValue = false;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 1;
        } else {
            Iterator<C1171050gZz> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZIZ != 0) {
                    i = 0;
                    break;
                }
            }
            i = 1;
        }
        int i2 = i ^ 1;
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
        List<Aweme> list2 = ((CollectionContentResponse) awS105S0110000_18.l0).items;
        if (list2 != null && !list2.isEmpty()) {
            List<Aweme> list3 = ((CollectionContentResponse) awS105S0110000_18.l0).items;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator<Aweme> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new C1171050gZz(i2, 4, it3.next()));
            }
            arrayList.addAll(arrayList2);
            C1360460lVU.LIZIZ.LJJI(((CollectionContentResponse) awS105S0110000_18.l0).items, EnumC1359020lTA.OTHERS, null);
        }
        C1623606Xi c1623606Xi = new C1623606Xi(new C291001Au(arrayList));
        Long l3 = ((CollectionContentResponse) awS105S0110000_18.l0).maxCursor;
        if (l3 != null) {
            jLongValue = l3.longValue();
        }
        Boolean bool = ((CollectionContentResponse) awS105S0110000_18.l0).hasMore;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new C1170570gZD(c1623606Xi, jLongValue, zBooleanValue, new C291001Au(Boolean.TRUE), 33);
    }

    public static final Object invoke$5(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C1185350gx3((String) ((PoiAlbumFragment) awS105S0110000_18.l0).LLIZLLLIL.getValue(), (String) ((PoiAlbumFragment) awS105S0110000_18.l0).LLJILJIL.getValue(), (PoiListApi.PoiDetailResponse) ((PoiAlbumFragment) awS105S0110000_18.l0).LLJILLL.getValue(), (C1188440h22) ((PoiAlbumFragment) awS105S0110000_18.l0).LLJJ.getValue(), (C1185410gx9) ((PoiAlbumFragment) awS105S0110000_18.l0).LLJJI.getValue(), (C1185490gxH) ((PoiAlbumFragment) awS105S0110000_18.l0).LLJJIII.getValue(), Integer.valueOf(((Number) ((PoiAlbumFragment) awS105S0110000_18.l0).LLJJIJI.getValue()).intValue()), awS105S0110000_18.z1);
        c062p.LIZIZ = "PoiAlbumHierarchyData";
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        C062P c062p = (C062P) obj;
        C1184530gvj c1184530gvj = (C1184530gvj) awS105S0110000_18.l0;
        c062p.LIZ = new C1184530gvj(c1184530gvj.LL, c1184530gvj.LLILLJJLI, c1184530gvj.LLILLL, c1184530gvj.LLILZ, c1184530gvj.LLILZIL, c1184530gvj.LLILZLL, c1184530gvj.LLIZ, c1184530gvj.LLIZLLLIL, c1184530gvj.LLJ, c1184530gvj.LLJI, !awS105S0110000_18.z1);
        c062p.LIZIZ = "PoiCollectHierarchyData";
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        ((Function1) awS105S0110000_18.l0).invoke(Boolean.valueOf(!awS105S0110000_18.z1));
        boolean z = !awS105S0110000_18.z1;
        obj.getClass();
        return new C1155540gAy(z);
    }

    public static final Object invoke$8(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        C1197360hGQ c1197360hGQ = (C1197360hGQ) obj;
        if (awS105S0110000_18.z1 && c1197360hGQ.LLILZIL > 0) {
            C1197430hGX c1197430hGX = new AbstractC1201400hMw() { // from class: X.0hGX
                @Override // X.AbstractC1201400hMw
                public final long LIZJ() {
                    return 0L;
                }

                @Override // X.AbstractC1201400hMw
                public final String LIZLLL() {
                    return "default_landing_promote_stores_tab";
                }

                @Override // X.AbstractC1201400hMw
                public final int LJ() {
                    return 1;
                }
            };
            if (!c1197430hGX.LIZIZ() && !c1197360hGQ.LLILZ) {
                c1197430hGX.LJI(true);
                PoiCreatorFragment poiCreatorFragment = (PoiCreatorFragment) awS105S0110000_18.l0;
                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = poiCreatorFragment.LLJI;
                if (viewOnAttachStateChangeListenerC20631115oD != null) {
                    HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD, new ARunnableS116S0100000_16(poiCreatorFragment, 173));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS105S0110000_18 awS105S0110000_18, Object obj) {
        Boolean bool;
        Boolean boolValueOf;
        PoiCreatorApi.InfluencerInfo influencerInfo;
        Integer num;
        List<PoiCreatorApi.BannerData> list;
        String str;
        List<PoiCreatorApi.BannerData> list2;
        boolean z;
        String str2;
        PoiCreatorApi.InfluencerInfo influencerInfo2;
        C1197360hGQ c1197360hGQ = (C1197360hGQ) obj;
        PoiCreatorApi.PoiCreatorBaseConfigResponseData poiCreatorBaseConfigResponseData = ((PoiCreatorApi.PoiCreatorBaseConfigResponse) awS105S0110000_18.l0).data;
        Boolean boolValueOf2 = null;
        if (poiCreatorBaseConfigResponseData != null && (influencerInfo2 = poiCreatorBaseConfigResponseData.influencerInfo) != null) {
            bool = influencerInfo2.enablePromoteStoresTab;
        } else {
            bool = null;
        }
        C291001Au c291001Au = new C291001Au(Boolean.valueOf(C1189060h32.LJIILJJIL(bool)));
        PoiCreatorApi.PoiCreatorBaseConfigResponseData poiCreatorBaseConfigResponseData2 = ((PoiCreatorApi.PoiCreatorBaseConfigResponse) awS105S0110000_18.l0).data;
        boolean z2 = true;
        int iIntValue = 0;
        if (poiCreatorBaseConfigResponseData2 != null && (list2 = poiCreatorBaseConfigResponseData2.bannersList) != null) {
            if (!list2.isEmpty()) {
                for (PoiCreatorApi.BannerData bannerData : list2) {
                    if (bannerData != null) {
                        str2 = bannerData.type;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, "influencer_onboarding")) {
                        z = true;
                        break;
                    }
                }
                z = false;
                boolValueOf = Boolean.valueOf(z);
            } else {
                z = false;
                boolValueOf = Boolean.valueOf(z);
            }
        } else {
            boolValueOf = null;
        }
        boolean zLJIILJJIL = C1189060h32.LJIILJJIL(boolValueOf);
        PoiCreatorApi.PoiCreatorBaseConfigResponseData poiCreatorBaseConfigResponseData3 = ((PoiCreatorApi.PoiCreatorBaseConfigResponse) awS105S0110000_18.l0).data;
        if (poiCreatorBaseConfigResponseData3 != null && (list = poiCreatorBaseConfigResponseData3.bannersList) != null) {
            if (!list.isEmpty()) {
                for (PoiCreatorApi.BannerData bannerData2 : list) {
                    if (bannerData2 != null) {
                        str = bannerData2.type;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "influencer_entrance")) {
                        break;
                    }
                }
                z2 = false;
                boolValueOf2 = Boolean.valueOf(z2);
            } else {
                z2 = false;
                boolValueOf2 = Boolean.valueOf(z2);
            }
        }
        boolean zLJIILJJIL2 = C1189060h32.LJIILJJIL(boolValueOf2);
        PoiCreatorApi.PoiCreatorBaseConfigResponseData poiCreatorBaseConfigResponseData4 = ((PoiCreatorApi.PoiCreatorBaseConfigResponse) awS105S0110000_18.l0).data;
        if (poiCreatorBaseConfigResponseData4 != null && (influencerInfo = poiCreatorBaseConfigResponseData4.influencerInfo) != null && (num = influencerInfo.taskCount) != null) {
            iIntValue = num.intValue();
        }
        return C1197360hGQ.LIZ(c1197360hGQ, zLJIILJJIL, c291001Au, zLJIILJJIL2, awS105S0110000_18.z1, iIntValue, null, null, null, null, ((PoiCreatorApi.PoiCreatorBaseConfigResponse) awS105S0110000_18.l0).LJ("influencer_onboarding"), ((PoiCreatorApi.PoiCreatorBaseConfigResponse) awS105S0110000_18.l0).LJ("influencer_entrance"), null, null, null, 14816);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS105S0110000_18(com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r3, boolean r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 3 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.z1 = r4
            r1.l0 = r3
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r3
            r1.z1 = r4
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS105S0110000_18.<init>(com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(C0N4P c0n4p, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0n4p;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(C1184530gvj c1184530gvj, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1184530gvj;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(LocationData locationData, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = locationData;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(CollectionContentResponse collectionContentResponse, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = collectionContentResponse;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(VideoCollectionListViewModel videoCollectionListViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoCollectionListViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(PoiAlbumFragment poiAlbumFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiAlbumFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(PoiCreatorApi.PoiCreatorBaseConfigResponse poiCreatorBaseConfigResponse, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiCreatorBaseConfigResponse;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(PoiStableBottomBarModule poiStableBottomBarModule, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = poiStableBottomBarModule;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(PositionSelectionViewModel positionSelectionViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = positionSelectionViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(PoiMapDetailAreaFilterVM poiMapDetailAreaFilterVM, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiMapDetailAreaFilterVM;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(PoiQuizPageVM poiQuizPageVM, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiQuizPageVM;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(HashtagFeedbackViewModel hashtagFeedbackViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = hashtagFeedbackViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(LocationRegion locationRegion, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = locationRegion;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS105S0110000_18(Function1 function1, Function1<? super Boolean, Unit> function12, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = function1;
        this.z1 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(boolean z, ChooseCollectionSheetFragment chooseCollectionSheetFragment, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = chooseCollectionSheetFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(boolean z, RssArticle rssArticle, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = rssArticle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(boolean z, PoiCreatorFragment poiCreatorFragment, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = poiCreatorFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(boolean z, PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = poiDetailContentHeaderBaseAssemV3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(boolean z, PoiDetailContentHeaderNewRegionalAssem poiDetailContentHeaderNewRegionalAssem, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = poiDetailContentHeaderNewRegionalAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(boolean z, PoiOrderSubmitViewModel poiOrderSubmitViewModel, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = poiOrderSubmitViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0110000_18(boolean z, Integer num, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = num;
    }
}
