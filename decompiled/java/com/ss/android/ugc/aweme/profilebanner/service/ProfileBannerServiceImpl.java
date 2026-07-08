package com.ss.android.ugc.aweme.profilebanner.service;

import X.AbstractC637050Oyl;
import X.C01GW;
import X.C054G;
import X.C09A1;
import X.C0PEM;
import X.C20554315bp;
import X.C2238181Ciu;
import X.C2238251Cj1;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import X.C637150Oyv;
import X.C637170Oyx;
import X.C637190Oyz;
import X.C637200Oz0;
import X.C637220Oz2;
import X.C637260Oz6;
import X.EnumC20654715s1;
import X.InterfaceC2238201Ciw;
import X.InterfaceC2238291Cj5;
import android.view.ViewGroup;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency;
import com.ss.android.ugc.aweme.profilebanner.IProfileBannerService;
import com.ss.android.ugc.aweme.profilebanner.data.EventParam;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerInfoModel;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import com.ss.android.ugc.common.component.fragment.ComponentFragment;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS243S0300000_34;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes35.dex */
public final class ProfileBannerServiceImpl implements IProfileBannerService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(110));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(109));

    @Override // com.ss.android.ugc.aweme.profilebanner.IProfileBannerService
    public final ViewGroup LIZIZ() {
        return ((C2238251Cj1) this.LIZ.getValue()).LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.profilebanner.IProfileBannerService
    public final void destroy() {
        C637170Oyx c637170Oyx = (C637170Oyx) ((C637220Oz2) this.LIZIZ.getValue()).LIZ.getValue();
        C054G c054g = c637170Oyx.LIZLLL;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        c637170Oyx.LIZLLL = null;
        C20554315bp c20554315bp = C20554315bp.LIZIZ;
        EnumC20654715s1 enumC20654715s1 = EnumC20654715s1.PROFILE_BANNER;
        c20554315bp.LIZIZ(enumC20654715s1);
        c20554315bp.LJIIL(enumC20654715s1);
        ((C2238251Cj1) this.LIZ.getValue()).LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.profilebanner.IProfileBannerService
    public final void LIZJ(final C2238181Ciu c2238181Ciu) {
        final C2238251Cj1 c2238251Cj1 = (C2238251Cj1) this.LIZ.getValue();
        CopyOnWriteArrayList<InterfaceC2238291Cj5> copyOnWriteArrayList = c2238251Cj1.LIZ;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<InterfaceC2238291Cj5> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().getTemplateType() == c2238181Ciu.LIZJ) {
                    return;
                }
            }
        }
        c2238251Cj1.LIZ.add(c2238181Ciu);
        try {
            c2238181Ciu.LIZ = new InterfaceC2238201Ciw() { // from class: X.1Cj0
                @Override // X.InterfaceC2238201Ciw
                public final void LIZ(ProfileBannerInfoModel profileBannerInfoModel, String str) {
                    C637190Oyz c637190Oyz = C637190Oyz.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("provider reportDismiss: key=");
                    sbLIZ.append(profileBannerInfoModel.bannerKey);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c637190Oyz.getClass();
                    C637190Oyz.LIZ(strLIZIZ);
                    c2238251Cj1.LIZIZ(c2238181Ciu, profileBannerInfoModel, str);
                }

                @Override // X.InterfaceC2238201Ciw
                public final void LIZIZ(final ProfileBannerInfoModel profileBannerInfoModel, final String str, boolean z) {
                    final String str2;
                    C637190Oyz c637190Oyz = C637190Oyz.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("provider reportClick: key=");
                    sbLIZ.append(profileBannerInfoModel.bannerKey);
                    sbLIZ.append(", clickMethod=");
                    sbLIZ.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c637190Oyz.getClass();
                    C637190Oyz.LIZ(strLIZIZ);
                    C2238251Cj1 c2238251Cj12 = c2238251Cj1;
                    InterfaceC2238291Cj5 interfaceC2238291Cj5 = c2238181Ciu;
                    c2238251Cj12.getClass();
                    if (profileBannerInfoModel.dismissAfterClick) {
                        ViewGroup viewGroup = c2238251Cj12.LIZIZ;
                        if (viewGroup != null) {
                            C786410Ut5.LJJJJI(viewGroup);
                        }
                        c2238251Cj12.LIZIZ(interfaceC2238291Cj5, profileBannerInfoModel, str);
                    }
                    C637260Oz6 c637260Oz6 = C637260Oz6.LIZ;
                    if (z) {
                        str2 = "positive_click";
                    } else {
                        str2 = "negative_click";
                    }
                    c637260Oz6.getClass();
                    C20684815ws.LJFF().execute(new Runnable() { // from class: X.0Oz4
                        public final void LIZ() {
                            C637260Oz6.LIZ.getClass();
                            IOutreachFrequency iOutreachFrequency = (IOutreachFrequency) C637260Oz6.LIZIZ.getValue();
                            if (iOutreachFrequency != null) {
                                C637270Oz7 c637270Oz7 = new C637270Oz7(profileBannerInfoModel);
                                String typeName = EnumC20654715s1.PROFILE_BANNER.getTypeName();
                                String str3 = profileBannerInfoModel.bannerKey;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                iOutreachFrequency.LJI(c637270Oz7, new OutreachInfo(typeName, str3, null), "profile", str2, str);
                            }
                            C637260Oz6.LIZJ(profileBannerInfoModel);
                            List<EventParam> list = profileBannerInfoModel.eventParams;
                            if (list != null) {
                                ArrayList<EventParam> arrayList = new ArrayList();
                                for (EventParam eventParam : list) {
                                    EventParam eventParam2 = eventParam;
                                    Integer num = eventParam2.type;
                                    if (num != null && num.intValue() == 2 && C123100dR.LIZ(eventParam2.event)) {
                                        arrayList.add(eventParam);
                                    }
                                }
                                String str4 = str;
                                for (EventParam eventParam3 : arrayList) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    Map<String, String> map = eventParam3.bizParams;
                                    if (map != null) {
                                        for (Map.Entry<String, String> entry : map.entrySet()) {
                                            String key = entry.getKey();
                                            String value = entry.getValue();
                                            if (value != null) {
                                                linkedHashMap.put(key, value);
                                            }
                                        }
                                    }
                                    if (((Boolean) C0AQS.LIZ.getValue()).booleanValue()) {
                                        C637260Oz6 c637260Oz62 = C637260Oz6.LIZ;
                                        Map<String, String> map2 = eventParam3.bizActionParams;
                                        String str5 = map2 != null ? map2.get(str4) : null;
                                        c637260Oz62.getClass();
                                        if (str5 != null && str5.length() != 0) {
                                            try {
                                                Type type = new TypeToken<Map<String, ? extends String>>() { // from class: X.04YE
                                                }.getType();
                                                C1227904rF.LIZ.getClass();
                                                Set<Map.Entry> setEntrySet = ((Map) C1227904rF.LIZLLL().LJIIIIZZ(str5, type)).entrySet();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Map.Entry entry2 : setEntrySet) {
                                                    String str6 = (String) entry2.getKey();
                                                    String str7 = (String) entry2.getValue();
                                                    if (str7 != null) {
                                                        arrayList2.add(new Pair(str6, str7));
                                                    }
                                                }
                                                Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList2);
                                                if (mapLJIILLIIL != null) {
                                                    linkedHashMap.putAll(mapLJIILLIIL);
                                                }
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                C637190Oyz c637190Oyz2 = C637190Oyz.LIZ;
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("parseActionParams error: ");
                                                sbLIZ2.append(e);
                                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                                c637190Oyz2.getClass();
                                                C637190Oyz.LIZIZ(strLIZIZ2);
                                            }
                                        }
                                    }
                                    linkedHashMap.put("click_method", str4);
                                    C20684815ws.LJIILLIIL(eventParam3.event, linkedHashMap);
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ProfileBannerReporter@6c03.recordClick$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ProfileBannerReporter@6c03.recordClick$1");
                        }
                    });
                }
            };
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C637190Oyz.LIZ.getClass();
            C637190Oyz.LIZIZ("inject reporter error: " + e);
        }
        C637190Oyz c637190Oyz = C637190Oyz.LIZ;
        String str = "registeredProviders:" + c2238251Cj1.LIZ + ", this:" + c2238251Cj1 + ", count:" + c2238251Cj1.LIZ.size();
        c637190Oyz.getClass();
        C637190Oyz.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.profilebanner.IProfileBannerService
    public final void LIZ(ComponentFragment componentFragment, ViewGroup viewGroup, AwS563S0100000_19 awS563S0100000_19) {
        C637190Oyz.LIZ.getClass();
        C637200Oz0 c637200Oz0 = C637190Oyz.LIZIZ;
        c637200Oz0.LJIIIIZZ(null, "ProfileBanner", "init");
        C637220Oz2 c637220Oz2 = (C637220Oz2) this.LIZIZ.getValue();
        C2238251Cj1 c2238251Cj1 = (C2238251Cj1) this.LIZ.getValue();
        if (c2238251Cj1 != null) {
            c637220Oz2.getClass();
            c2238251Cj1.LIZ(componentFragment, viewGroup, awS563S0100000_19);
        }
        final C637170Oyx c637170Oyx = (C637170Oyx) c637220Oz2.LIZ.getValue();
        AwS243S0300000_34 awS243S0300000_34 = new AwS243S0300000_34(c637220Oz2, c2238251Cj1, componentFragment, 6);
        final AwS400S0200000_34 awS400S0200000_34 = new AwS400S0200000_34(c637220Oz2, c2238251Cj1, 50);
        c637170Oyx.getClass();
        c637200Oz0.LJIIIIZZ(null, "ProfileBanner", "start fetch and register signal");
        if (PopupManager.LJI()) {
            c637200Oz0.LJIIIIZZ(null, "ProfileBanner", "hasPopupShowing, not show platform banner");
            C637260Oz6.LIZ.getClass();
            C637260Oz6.LIZ(null, "show_dialog", null, false);
        } else {
            C054G c054g = c637170Oyx.LIZLLL;
            if (c054g != null) {
                C2296808zG.LIZJ(c054g, null);
            }
            C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
            c637170Oyx.LIZLLL = c054gLIZ;
            C23250099c.LIZLLL(c054gLIZ, null, null, new C637150Oyv(c637170Oyx, awS243S0300000_34, null), 3);
        }
        C20554315bp.LIZIZ.LJIIIIZZ(EnumC20654715s1.PROFILE_BANNER, new AbstractC637050Oyl() { // from class: X.0Oyw
            @Override // X.AbstractC637050Oyl
            public final void LIZ(C20554115bn c20554115bn, String str, n nVar, Map<String, Object> map) {
                c637170Oyx.LIZ(c20554115bn, str, nVar, awS400S0200000_34);
            }
        });
    }
}
