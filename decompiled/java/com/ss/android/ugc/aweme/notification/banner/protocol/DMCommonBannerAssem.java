package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.AnonymousClass0629;
import X.C06LY;
import X.C06S0;
import X.C06S1;
import X.C098200Yq;
import X.C1227904rF;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1890920zJ4;
import X.C1890930zJ5;
import X.C1890960zJ8;
import X.C189200o6;
import X.C19212010Ec;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C624370OeJ;
import X.C786410Ut5;
import X.C889930Yvf;
import X.EnumC637310OzB;
import X.InterfaceC1554640qYg;
import X.InterfaceC1890940zJ6;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.common.model.IMFromMessageTips;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxBannerWidgetAbility;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class DMCommonBannerAssem extends InboxBannerCustomAssem implements InboxAbilityCenter$IInboxBannerWidgetAbility.IDMCommonBannerAbility, InterfaceC1554640qYg {
    public C1890930zJ5 LLILZ = new C1890930zJ5(new AwS572S0100000_28(this, 311), 131071);
    public boolean LLILZIL;

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJI(this, InboxFragmentScope.class, this, InboxAbilityCenter$IInboxBannerWidgetAbility.IDMCommonBannerAbility.class, null, null);
        C1890920zJ4.LIZ.getClass();
        IStreakService.LJJIIZ.getClass();
        for (Map.Entry<String, InterfaceC1890940zJ6> entry : C06LY.LIZ().Y().entrySet()) {
            C1890920zJ4 c1890920zJ4 = C1890920zJ4.LIZ;
            String key = entry.getKey();
            InterfaceC1890940zJ6 value = entry.getValue();
            c1890920zJ4.getClass();
            ConcurrentHashMap<String, InterfaceC1890940zJ6> concurrentHashMap = C1890920zJ4.LIZIZ;
            if (!concurrentHashMap.containsKey(key)) {
                concurrentHashMap.put(key, value);
            }
        }
        C06S1.LIZ.getClass();
        for (Map.Entry entry2 : C2097908Jt.LIZJ(new Pair("notice_activity_status_public", new InterfaceC1890940zJ6() { // from class: X.06jY
            @Override // X.InterfaceC1890940zJ6
            public final void LIZ(C062Z c062z) {
            }

            @Override // X.InterfaceC1890940zJ6
            public final void LIZJ(C062Z c062z) {
                InterfaceC897380ZIi.LIZIZ.getClass();
                C897370ZIh.LIZ().LJ().LJIIIZ(EnumC1643306c3.PUBLIC, new AwS546S0100000_2(C897370ZIh.LIZ().LJ().LJFF(), 1105));
            }

            @Override // X.InterfaceC1890940zJ6
            public final void LIZIZ(Context context, C062Z c062z, String str) {
                if (context != null) {
                    SmartRouter.buildRoute(context, str).open();
                }
            }
        })).entrySet()) {
            C1890920zJ4 c1890920zJ42 = C1890920zJ4.LIZ;
            Object key2 = entry2.getKey();
            Object value2 = entry2.getValue();
            c1890920zJ42.getClass();
            ConcurrentHashMap<String, InterfaceC1890940zJ6> concurrentHashMap2 = C1890920zJ4.LIZIZ;
            if (!concurrentHashMap2.containsKey(key2)) {
                concurrentHashMap2.put((String) key2, (InterfaceC1890940zJ6) value2);
            }
        }
        IMAIServiceAPI.LIZ.getClass();
        InterfaceC1890940zJ6 interfaceC1890940zJ6LJJIFFI = AnonymousClass0629.LIZ().LIZ().LJJIFFI();
        if (interfaceC1890940zJ6LJJIFFI != null) {
            C1890920zJ4.LIZ.getClass();
            ConcurrentHashMap<String, InterfaceC1890940zJ6> concurrentHashMap3 = C1890920zJ4.LIZIZ;
            if (concurrentHashMap3.containsKey("smart_reply_inbox_creator")) {
                return;
            }
            concurrentHashMap3.put("smart_reply_inbox_creator", interfaceC1890940zJ6LJJIFFI);
        }
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 194485179) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fo() {
        /*
            r7 = this;
            boolean r0 = r7.LLILZIL
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r7.LLILZIL = r0
            X.0zJ4 r0 = X.C1890920zJ4.LIZ
            r7.getContext()
            X.0zJ5 r6 = r7.LLILZ
            r0.getClass()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onBannerShow, item: "
            r1.append(r0)
            r1.append(r6)
            X.C2188811AlT.LIZIZ(r1)
            r0 = 6
            X.C319370CfX.LIZ(r6, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0zJ6> r1 = X.C1890920zJ4.LIZIZ
            java.lang.String r0 = r6.LL
            java.lang.Object r4 = r1.get(r0)
            X.0zJ6 r4 = (X.InterfaceC1890940zJ6) r4
            if (r4 == 0) goto L47
            X.062Z r3 = new X.062Z
            java.lang.String r2 = r6.LL
            java.lang.String r1 = r6.LLILZ
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6.LLJJIJI
            if (r0 != 0) goto L41
            r0 = 641(0x281, float:8.98E-43)
            kotlin.jvm.internal.AFwS217S0000000_28 r0 = kotlin.jvm.internal.AFwS217S0000000_28.get$arr$(r0)
        L41:
            r3.<init>(r2, r1, r0)
            r4.LIZJ(r3)
        L47:
            X.0Htx r5 = X.C455710Htx.LIZIZ
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.LLJJI
            if (r0 == 0) goto L81
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L5a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L5a
        L7b:
            java.util.Map r0 = X.C2097608Jq.LJIILLIIL(r4)
            if (r0 != 0) goto L85
        L81:
            java.util.Map r0 = X.C2097608Jq.LJ()
        L85:
            X.C455710Htx.LIZJ(r5, r0)
            java.lang.String r1 = r6.LL
            X.06O1 r0 = X.C06O1.SHOW
            X.C1599206Ny.LIZLLL(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.banner.protocol.DMCommonBannerAssem.fo():void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxBannerWidgetAbility.IDMCommonBannerAbility
    public final void UL(IMNoticeMsgStruct iMNoticeMsgStruct) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Map<String, String> map;
        String str14;
        Map<String, String> map2;
        Map<String, String> map3;
        Map<String, String> map4;
        Map<String, String> map5;
        Map<String, String> map6;
        Map<String, String> map7;
        Map<String, String> map8;
        Map<String, String> map9;
        Map<String, String> map10;
        Map<String, String> map11;
        Map<String, String> map12;
        Map<String, String> map13;
        Map<String, String> map14;
        String str15;
        Map<String, String> map15;
        String str16;
        Map<String, String> map16;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBanner onCall, notice: ");
        sbLIZ.append(iMNoticeMsgStruct);
        C624370OeJ.LIZ("DMCommonBannerAssem", C2188811AlT.LIZIZ(sbLIZ));
        String str17 = "";
        if (iMNoticeMsgStruct == null) {
            C624370OeJ.LIZ("DMCommonBannerAssem", "canShowNotice: notice is null");
        } else if (Intrinsics.LJFF(iMNoticeMsgStruct.noticeCode, "creator_mode_notice_banner") && (!C19212010Ec.LIZJ.LJLLLL() || C889930Yvf.LIZ.LJIIIZ())) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkCanShow, can not show, noticeCode:");
            sbLIZ2.append(iMNoticeMsgStruct.noticeCode);
            C624370OeJ.LIZ("DMCommonBannerAssem", C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            try {
                try {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    IMFromMessageTips iMFromMessageTips = iMNoticeMsgStruct.msgContent;
                    if (iMFromMessageTips == null || (map16 = iMFromMessageTips.extras) == null || (str16 = map16.get("ex_params")) == null) {
                        str16 = "";
                    }
                    Type type = new TypeToken<Map<String, ? extends String>>() { // from class: X.04Y7
                    }.getType();
                    c1227904rF.getClass();
                    c098200Yq = (Map) C1227904rF.LIZJ(str16, type);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Map mapLJ = C2097608Jq.LJ();
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = mapLJ;
                }
                Map map17 = (Map) c098200Yq;
                try {
                    C1227904rF c1227904rF2 = C1227904rF.LIZ;
                    IMFromMessageTips iMFromMessageTips2 = iMNoticeMsgStruct.msgContent;
                    if (iMFromMessageTips2 == null || (map15 = iMFromMessageTips2.extras) == null || (str15 = map15.get("track_params")) == null) {
                        str15 = "";
                    }
                    Type type2 = new TypeToken<Map<String, ? extends String>>() { // from class: X.04Y8
                    }.getType();
                    c1227904rF2.getClass();
                    c098200Yq3 = (Map) C1227904rF.LIZJ(str15, type2);
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq3 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                Map mapLJ2 = C2097608Jq.LJ();
                if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                    c098200Yq3 = mapLJ2;
                }
                Map map18 = (Map) c098200Yq3;
                C1890930zJ5 c1890930zJ5 = this.LLILZ;
                String str18 = iMNoticeMsgStruct.noticeCode;
                if (str18 == null) {
                    str18 = "";
                }
                IMFromMessageTips iMFromMessageTips3 = iMNoticeMsgStruct.msgContent;
                if (iMFromMessageTips3 == null || (map14 = iMFromMessageTips3.extras) == null || (str = map14.get("is_common_dm_banner")) == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                IMFromMessageTips iMFromMessageTips4 = iMNoticeMsgStruct.msgContent;
                if (iMFromMessageTips4 == null || (map13 = iMFromMessageTips4.extras) == null || (str2 = map13.get("jump_url")) == null) {
                    str2 = "";
                }
                IMFromMessageTips iMFromMessageTips5 = iMNoticeMsgStruct.msgContent;
                if (iMFromMessageTips5 == null || (map12 = iMFromMessageTips5.extras) == null || (str3 = map12.get("avatar_url")) == null) {
                    str3 = "";
                }
                IMFromMessageTips iMFromMessageTips6 = iMNoticeMsgStruct.msgContent;
                if (iMFromMessageTips6 == null || (map11 = iMFromMessageTips6.extras) == null || (str4 = map11.get("icon_name")) == null) {
                    str4 = "";
                }
                IMFromMessageTips iMFromMessageTips7 = iMNoticeMsgStruct.msgContent;
                if (iMFromMessageTips7 == null || (map10 = iMFromMessageTips7.extras) == null || (str5 = map10.get("icon_color")) == null) {
                    str5 = "";
                }
                IMFromMessageTips iMFromMessageTips8 = iMNoticeMsgStruct.msgContent;
                if (iMFromMessageTips8 == null || (map9 = iMFromMessageTips8.extras) == null || (str6 = map9.get("button_title")) == null) {
                    str6 = "";
                }
                IMFromMessageTips iMFromMessageTips9 = iMNoticeMsgStruct.msgContent;
                if (iMFromMessageTips9 != null && (map8 = iMFromMessageTips9.extras) != null) {
                    str7 = map8.get("subtitle");
                } else {
                    str7 = null;
                }
                IMFromMessageTips iMFromMessageTips10 = iMNoticeMsgStruct.msgContent;
                if (iMFromMessageTips10 == null || (map7 = iMFromMessageTips10.extras) == null || (str8 = map7.get("background_can_click")) == null) {
                    str8 = "1";
                }
                IMFromMessageTips iMFromMessageTips11 = iMNoticeMsgStruct.msgContent;
                if (iMFromMessageTips11 != null && (map6 = iMFromMessageTips11.extras) != null) {
                    str9 = map6.get("when_click_dismiss");
                } else {
                    str9 = null;
                }
                IMFromMessageTips iMFromMessageTips12 = iMNoticeMsgStruct.msgContent;
                if (iMFromMessageTips12 != null && (map5 = iMFromMessageTips12.extras) != null) {
                    str10 = map5.get("should_auto_close_when_page_dismiss");
                } else {
                    str10 = null;
                }
                IMFromMessageTips iMFromMessageTips13 = iMNoticeMsgStruct.msgContent;
                if (iMFromMessageTips13 == null || (map4 = iMFromMessageTips13.extras) == null || (str11 = map4.get("button_type")) == null) {
                    str11 = CardStruct.IStatusCode.DEFAULT;
                }
                IMFromMessageTips iMFromMessageTips14 = iMNoticeMsgStruct.msgContent;
                if (iMFromMessageTips14 != null && (map3 = iMFromMessageTips14.extras) != null) {
                    str12 = map3.get("dot_icon_name");
                } else {
                    str12 = null;
                }
                IMFromMessageTips iMFromMessageTips15 = iMNoticeMsgStruct.msgContent;
                if (iMFromMessageTips15 != null && (map2 = iMFromMessageTips15.extras) != null) {
                    str13 = map2.get("dot_icon_background_color_name");
                } else {
                    str13 = null;
                }
                C1890930zJ5 c1890930zJ5LIZ = C1890930zJ5.LIZ(c1890930zJ5, str18, iMFromMessageTips3, str, str2, str3, str4, str5, str6, str7, str11, str12, str13, str8, str9, str10, map18, map17);
                this.LLILZ = c1890930zJ5LIZ;
                boolean zLJFF = Intrinsics.LJFF(c1890930zJ5LIZ.LLILLL, "1");
                if (zLJFF) {
                    IMFromMessageTips iMFromMessageTips16 = iMNoticeMsgStruct.msgContent;
                    if (iMFromMessageTips16 != null && (map = iMFromMessageTips16.extras) != null && (str14 = map.get("enable_local_frequency_control_record")) != null && !Intrinsics.LJFF(str14, "1")) {
                        String str19 = iMNoticeMsgStruct.noticeCode;
                        if (str19 != null) {
                            str17 = str19;
                        }
                        C06S0.LIZ(str17, CardStruct.IStatusCode.DEFAULT);
                    } else {
                        String str20 = iMNoticeMsgStruct.noticeCode;
                        if (str20 != null) {
                            str17 = str20;
                        }
                        C06S0.LIZ(str17, "1");
                    }
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("isCommonBanner = ");
                sbLIZ3.append(zLJFF);
                sbLIZ3.append(", noticeCode is ");
                sbLIZ3.append(this.LLILZ.LL);
                C2188811AlT.LIZIZ(sbLIZ3);
                c098200Yq2 = Boolean.valueOf(zLJFF);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq2 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Fail to parse, noticeCode is ");
                sbLIZ4.append(this.LLILZ.LL);
                C2188811AlT.LIZIZ(sbLIZ4);
                c098200Yq2 = Boolean.FALSE;
            }
            if (((Boolean) c098200Yq2).booleanValue()) {
                this.LL.setValue(new Pair(EnumC637310OzB.TOP_SHOW, this.LLILZ));
                return;
            }
        }
        this.LL.setValue(new Pair(EnumC637310OzB.DISMISS, null));
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final RecyclerView.ViewHolder ko(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1890930zJ5.class))) {
            return new C1890960zJ8(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a8u, viewGroup, false));
        }
        return null;
    }
}
