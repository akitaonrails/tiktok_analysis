package com.ss.android.ugc.aweme.favorites.business.music.raven;

import X.C01CL;
import X.C01GW;
import X.C0CNO;
import X.C0OGJ;
import X.C0VWN;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XKC;
import X.C1043010dFT;
import X.C1160990gJl;
import X.C1161030gJp;
import X.C1161040gJq;
import X.C1161090gJv;
import X.C1161140gK0;
import X.C1161180gK4;
import X.C1161210gK7;
import X.C1161280gKE;
import X.C1161970gLL;
import X.C1162570gMJ;
import X.C1162720gMY;
import X.C1165340gQm;
import X.C1168160gVK;
import X.C1168170gVL;
import X.C1168180gVM;
import X.C1168190gVN;
import X.C1168200gVO;
import X.C1168250gVT;
import X.C1201920hNm;
import X.C1208920hZ4;
import X.C1312970kGt;
import X.C13LP;
import X.C14EU;
import X.C1537410q6t;
import X.C1537720q7O;
import X.C1538590q8n;
import X.C1540620qC4;
import X.C1540660qC8;
import X.C15438062q;
import X.C1548820qPI;
import X.C1553710qXB;
import X.C1697810uHb;
import X.C18Z8;
import X.C19EG;
import X.C20533215Wg;
import X.C20600815jK;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C23250099c;
import X.C2344009Gk;
import X.C258270AAf;
import X.C452501pT;
import X.C629770On1;
import X.C633020OsG;
import X.C678350QjB;
import X.C679540Ql6;
import X.C844470XAv;
import X.EnumC1553730qXD;
import X.EnumC452301pR;
import X.EnumC665490Q8l;
import X.InterfaceC1160920gJe;
import X.InterfaceC1161460gKW;
import X.InterfaceC1161470gKX;
import X.InterfaceC1206390hUz;
import X.InterfaceC1206570hVH;
import X.InterfaceC1206580hVI;
import X.InterfaceC1258040iqI;
import X.InterfaceC1602960roc;
import X.InterfaceC1603190roz;
import X.InterfaceC1891350zJl;
import Y.AObjectS314S0200000_18;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenSparkModule;
import com.bytedance.hybrid.spark.raven.data.PageInfo;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.favorites.business.music.raven.MusicCollectionBannerInfo;
import com.ss.android.ugc.aweme.favorites.business.music.raven.banner.MusicCollectionBannerAssem;
import com.ss.android.ugc.aweme.favorites.business.music.raven.exp.RavenMusicCollectionEmbeddedExp;
import com.ss.android.ugc.aweme.favorites.business.music.raven.exp.RavenMusicCollectionFirstFetchThreshold;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.hybridkit.task.SparkSettingInfo;
import com.ss.android.ugc.aweme.hybridkit.task.SparkXGetSettingsMethodParamModel;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS102S1000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class RavenMusicCollectionFragment extends RavenFragment<C1168170gVL> implements InterfaceC1206580hVI, InterfaceC1206570hVH, InterfaceC1206390hUz, InterfaceC1258040iqI {
    public static boolean LLLZL = false;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTYlJyogHELIOSO2shPDw6K2s+KDk2JmseKDk2Jgg5OiYwCyogJSowPCwjJwkhKSIhLCEn";
    public final String LLLLLLL;
    public boolean LLLLLLLLL;
    public String LLLLLLLLLL;
    public boolean LLLLLLLZIL;
    public C1537720q7O LLLLLLZ;
    public final List<Function0<Unit>> LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public int LLLLLZL;
    public String LLLLZ;
    public final C1161280gKE LLLLZI;
    public boolean LLLLZIL;
    public boolean LLLLZLL;
    public InterfaceC1602960roc LLLLZLLIL;
    public final C01GW LLLLZLLLI;
    public final C1208920hZ4 LLLZ;
    public final C01GW LLLZI;
    public final C01GW LLLZIIL;
    public final C01GW LLLZIL;

    @Override // X.InterfaceC1161510gKb
    public final String EK() {
        return "music_collection";
    }

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() throws Throwable {
        setUserVisibleHint(false);
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final void RR() {
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final void ZR() {
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final void jT() {
        this.LLLLZIL = true;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("state", "2");
        C20684815ws.LJIILLIIL("discovery_favorite_sounds_card_load_success", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final List<InterfaceC1161460gKW> rT() {
        return C1697810uHb.LJIILJJIL(this.LLLLZI);
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final Integer BS() {
        boolean z = LLLZL;
        int i = R.raw.icon_2pt_favorites_collection;
        if (z) {
            return Integer.valueOf(R.raw.icon_2pt_favorites_collection);
        }
        if (getContext() instanceof InterfaceC1603190roz) {
            return null;
        }
        String str = this.LLLLLLLLLL;
        if (str == null || str.length() == 0) {
            i = R.raw.icon_2pt_bookmark;
        }
        return Integer.valueOf(i);
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final String ES() {
        Context context;
        int i = 2131828419;
        if (LLLZL) {
            Context context2 = getContext();
            if (context2 != null) {
                return context2.getString(2131828419);
            }
            return null;
        }
        String str = this.LLLLLLLLLL;
        if (str == null || str.length() == 0) {
            Context context3 = getContext();
            if (context3 != null) {
                return context3.getString(R.string.jh6);
            }
            return null;
        }
        if (this.LLLLLZIL) {
            context = getContext();
            if (context == null) {
                return null;
            }
        } else {
            context = getContext();
            if (context == null) {
                return null;
            }
            i = 2131828420;
        }
        return context.getString(i);
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final boolean LJIIJJI() {
        k kVar;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        new C1043010dFT();
        C1043010dFT.LIZIZ("MusicRavenFragment", new AwS562S0100000_18(this, 304));
        PageInfo value = PS().vQ2().LIZJ.getValue();
        return (value == null || (kVar = value.data) == null || (kVarLJJIIZ = kVar.LJIILIIL().LJJIIZ("music_list")) == null || (kVarLJJIIZ2 = kVarLJJIIZ.LJIILIIL().LJJIIZ("has_more")) == null || kVarLJJIIZ2.LJIIJJI() != 1 || kU() == 0) ? false : true;
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        C18Z8 c18z8 = this.LLJILJIL;
        if (c18z8 != null) {
            return c18z8;
        }
        C844470XAv.LIZ.getClass();
        return new RecyclerView(C844470XAv.LIZ());
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final Float RS() {
        if (LLLZL) {
            return Float.valueOf(104.0f);
        }
        if (getContext() instanceof InterfaceC1603190roz) {
            return Float.valueOf(52.0f);
        }
        return null;
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final C1162720gMY<C1168170gVL> WR() {
        return new C1162720gMY<>(new Object() { // from class: X.0gVL
        });
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final InterfaceC1160920gJe aS() {
        return new MusicCollectionRavenRequest();
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final InterfaceC1160920gJe cS() {
        return new MusicCollectionRavenRequest();
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final C1160990gJl dS() {
        ICommerceMediaService iCommerceMediaService;
        String str = this.LLLLLLLLLL;
        ICommerceMediaService iCommerceMediaService2 = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null);
        return C1161030gJp.LIZ(30, str, CardStruct.IStatusCode.DEFAULT, ((iCommerceMediaService2 == null || !iCommerceMediaService2.LJ()) && ((iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null)) == null || !iCommerceMediaService.LJIIJ())) ? "" : "commerce");
    }

    @Override // X.InterfaceC1206570hVH
    public final void onPageSelected() {
        if (this.LLLLLLLLL) {
            AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 305);
            if (this.LLLLLLZ == null) {
                ((ArrayList) this.LLLLLLZZ).add(awS562S0100000_18);
            } else {
                awS562S0100000_18.invoke();
            }
        }
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, X.InterfaceC1161620gKm
    public final void refresh() {
        this.LLLLZI.LLILZ.clear();
        NT(true);
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final String zS() {
        Context context;
        if (LLLZL) {
            return null;
        }
        String str = this.LLLLLLLLLL;
        if ((str == null || str.length() == 0) && (context = getContext()) != null) {
            return context.getString(R.string.jh7);
        }
        return null;
    }

    public RavenMusicCollectionFragment() {
        String str = (String) RavenMusicCollectionEmbeddedExp.LIZLLL.getValue();
        this.LLLLLLL = str;
        this.LLLLLLLZIL = true;
        this.LLLLLLZZ = new ArrayList();
        this.LLLLZ = "";
        this.LLLLZI = new C1161280gKE(sT(), str);
        this.LLLLZLLLI = C452501pT.LIZIZ(new AwS564S0100000_20(this, 16));
        this.LLLZ = new C1208920hZ4(this, 0);
        this.LLLZI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 307));
        this.LLLZIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 306));
        this.LLLZIL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS206S0000000_18.get$arr$(146));
    }

    public final int kU() {
        k kVar;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        PageInfo value = PS().vQ2().LIZJ.getValue();
        if (value == null || (kVar = value.data) == null || (kVarLJJIIZ = kVar.LJIILIIL().LJJIIZ("music_list")) == null || (kVarLJJIIZ2 = kVarLJJIIZ.LJIILIIL().LJJIIZ("cursor")) == null) {
            return 0;
        }
        return kVarLJJIIZ2.LJIIJJI();
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC1602960roc interfaceC1602960roc = this.LLLLZLLIL;
        if (interfaceC1602960roc != null) {
            interfaceC1602960roc.stop();
        }
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 2758);
        if (this.LLLLLLZ == null) {
            ((ArrayList) this.LLLLLLZZ).add(awS562S0100000_18);
        } else {
            awS562S0100000_18.invoke();
        }
        ((ArrayList) this.LLLLLLZZ).clear();
        this.LLLLLZ = false;
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLLLLZ = false;
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJJI(this);
        }
        C1548820qPI.LJIIIIZZ("tt_to_dsp_link_platform_change_event", this.LLLZ);
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 2758);
        if (this.LLLLLLZ == null) {
            ((ArrayList) this.LLLLLLZZ).add(awS562S0100000_18);
        } else {
            awS562S0100000_18.invoke();
        }
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final boolean GT(int i) {
        if (i < ((Number) RavenMusicCollectionFirstFetchThreshold.LIZJ.getValue()).intValue() && LJIIJJI() && this.LLLLLZL < ((Number) RavenMusicCollectionFirstFetchThreshold.LIZIZ.getValue()).intValue()) {
            this.LLLLLZL++;
            return true;
        }
        return false;
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, X.InterfaceC1540710qCD
    public final void Ka(C1540660qC8 c1540660qC8) {
        super.Ka(c1540660qC8);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("state", CardStruct.IStatusCode.DEFAULT);
        C20684815ws.LJIILLIIL("discovery_favorite_sounds_card_load_success", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, X.InterfaceC1540710qCD
    public final void RJ(long j) {
        super.RJ(j);
        if (!this.LLLLZLL) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(j - this.LLLJL, "duration");
            C20684815ws.LJIILLIIL("discovery_favorite_sounds_lynx_first_list_screen", c2344009Gk.LIZ);
            this.LLLLZLL = true;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("state", "1");
        C20684815ws.LJIILLIIL("discovery_favorite_sounds_card_load_success", c2344009Gk2.LIZ);
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final C1161040gJq VT(C1161040gJq c1161040gJq) {
        C1161090gJv c1161090gJv;
        List<C1161140gK0> listLIZ;
        List listLL;
        if (c1161040gJq.LLILLJJLI && (c1161090gJv = c1161040gJq.LL) != null && (listLIZ = c1161090gJv.LIZ()) != null && (listLL = C13LP.LL(listLIZ, 1)) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C1161140gK0) it2.next()).LIZ);
            }
            C1540620qC4 c1540620qC4QS = QS();
            if (c1540620qC4QS != null) {
                c1540620qC4QS.LJJIIZ(arrayList, this, String.valueOf(kU()));
            }
        }
        return c1161040gJq;
    }

    public final C679540Ql6 cU(Map<String, String> map) {
        return new C679540Ql6(null, null, null, null, null, null, null, null, "aweme://roma_redirect/?spark_page=music_collection_music_audio_card", new AObjectS314S0200000_18(map, this, 1), 27647);
    }

    public final C679540Ql6 dU(Map<String, String> map) {
        C679540Ql6 c679540Ql6 = new C679540Ql6(null, null, null, null, null, null, (C1312970kGt) this.LLLLZLLLI.getValue(), C01CL.LIZ(this.LLLLLLL), this.LLLLLLL, new AObjectS314S0200000_18(map, this, 1), 26879);
        c679540Ql6.LJIJ = new C1162570gMJ(1080, null);
        return c679540Ql6;
    }

    public final C679540Ql6 eU(Map<String, String> map) {
        return new C679540Ql6(null, null, null, null, null, null, null, null, "aweme://roma_redirect/?spark_page=music_collection_music_single_card", new AObjectS314S0200000_18(map, this, 1), 27647);
    }

    @Override // X.InterfaceC1206580hVI
    public final void gQ(boolean z) {
        this.LLLLLLLLL = z;
    }

    /* JADX WARN: Type inference failed for: r19v1, types: [X.0gVI] */
    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final C1540620qC4 gS(String str) {
        boolean z;
        HashMap map;
        Object obj;
        boolean z2;
        int iId;
        ArrayList arrayList;
        Intent intent;
        Context context = getContext();
        if (context == null) {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            context = C1161970gLL.LIZIZ().LIZJ();
        }
        String stringExtra = null;
        C1540620qC4 c1540620qC4 = new C1540620qC4(context, true, "music_collection", Ay(), true, false, true, true, true, true, null, 8256);
        C19EG activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                stringExtra = intent.getStringExtra("music_id");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("single_tab");
        } else {
            z = false;
        }
        this.LLLLLZIL = z;
        try {
            List<SparkSettingInfo> list = ((SparkXGetSettingsMethodParamModel) C1168190gVN.LIZIZ.getValue()).keys;
            arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (SparkSettingInfo sparkSettingInfo : list) {
                String str2 = sparkSettingInfo.key;
                String str3 = sparkSettingInfo.biz;
                if (str3 == null) {
                    str3 = "";
                }
                C1201920hNm c1201920hNm = EnumC1553730qXD.Companion;
                String str4 = sparkSettingInfo.type;
                c1201920hNm.getClass();
                EnumC1553730qXD enumC1553730qXDLIZ = C1201920hNm.LIZ(str4);
                if (str2.length() > 0 && enumC1553730qXDLIZ != EnumC1553730qXD.UNSUPPORTED) {
                    C1168200gVO c1168200gVO = new C1168200gVO(str2, enumC1553730qXDLIZ);
                    c1168200gVO.LIZJ = str3;
                    arrayList.add(c1168200gVO);
                    linkedHashSet.add(str2);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (!arrayList.isEmpty()) {
            List<C1168160gVK> listLIZ = C1553710qXB.LIZ(arrayList);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C1168160gVK c1168160gVK : (ArrayList) listLIZ) {
                linkedHashMap.put(c1168160gVK.LIZ, c1168160gVK.LIZIZ);
            }
            map = new HashMap();
            map.put("preload_setting_values", linkedHashMap);
        } else {
            map = null;
        }
        if (RavenMusicCollectionEmbeddedExp.LIZ()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C1168250gVT((C1312970kGt) this.LLLLZLLLI.getValue(), C01CL.LIZ(this.LLLLLLL), this.LLLLLLL, 15));
            c1540620qC4.LJIILL(arrayList2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (map != null) {
            linkedHashMap2.putAll(map);
            obj = map.get("tt_to_dsp_enable_business_account");
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(obj, "1") && !Intrinsics.LJFF(obj, 1) && !Intrinsics.LJFF(obj, Boolean.TRUE) && !Intrinsics.LJFF(obj, "true")) {
            z2 = false;
        } else {
            z2 = true;
        }
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        linkedHashMap2.put("can_show_add_song_entrance", Boolean.valueOf(c633020OsG.LJIILIIL(z2)));
        List<DspPlatform> listLJJLIIIJJI = c633020OsG.LJJLIIIJJI(null, null, null, null);
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJJI, 10));
        Iterator<DspPlatform> it2 = listLJJLIIIJJI.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf(it2.next().getValue()));
        }
        linkedHashMap2.put("available_dsps", arrayList3);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (stringExtra != null && stringExtra.length() != 0) {
            linkedHashMap3.put("music_id", stringExtra);
        }
        if (this.LLLLLZIL) {
            linkedHashMap3.put("single_tab", "1");
        }
        String str5 = this.LLLLLLLLLL;
        if (str5 != null) {
            linkedHashMap3.put("to_uid", str5);
        }
        linkedHashMap3.put("open_timestamp", String.valueOf(System.currentTimeMillis()));
        linkedHashMap3.put("group", Ay());
        linkedHashMap3.put("roma_enable_with_param", "1");
        C678350QjB c678350QjB = new C678350QjB(linkedHashMap3, linkedHashMap2, 200, new AObjectS314S0200000_18(this, c1540620qC4, 0), new Function1<C1538590q8n, Unit>() { // from class: X.0gVI
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(C1538590q8n c1538590q8n) {
                c1538590q8n.LJIIIIZZ = true;
                return Unit.LIZ;
            }
        }, 10201);
        c678350QjB.LIZLLL = new LynxViewClient() { // from class: X.0gVG
            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIIJ() {
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJJIIZ(String str6, Map map2, Map map3) {
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void onTimingSetup(Map<String, Object> map2) {
                super.onTimingSetup(map2);
            }
        };
        int iIntValue = ((Number) C1168180gVM.LIZ.getValue()).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 3) {
                    iId = EnumC665490Q8l.ALL_ON_UI.id();
                } else {
                    iId = EnumC665490Q8l.MULTI_THREADS.id();
                }
            } else {
                iId = EnumC665490Q8l.PART_ON_LAYOUT.id();
            }
        } else {
            iId = EnumC665490Q8l.MOST_ON_TASM.id();
        }
        c678350QjB.LJFF = Integer.valueOf(iId);
        c1540620qC4.LJIILJJIL(c678350QjB);
        if (C258270AAf.LIZ() == 2) {
            c1540620qC4.LJIILLIIL((List) this.LLLZI.getValue(), new AwS597S0100000_18(this, 110));
        }
        if (C258270AAf.LIZ() == 3) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1165340gQm(c1540620qC4, this, null), 3);
        }
        if (C258270AAf.LIZ() == 4) {
            c1540620qC4.LJIJI(null, (List) this.LLLZIIL.getValue());
        }
        return c1540620qC4;
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final C1160990gJl gT(C1160990gJl c1160990gJl) {
        ICommerceMediaService iCommerceMediaService;
        String str;
        String str2 = this.LLLLLLLLLL;
        String strValueOf = String.valueOf(kU());
        ICommerceMediaService iCommerceMediaService2 = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null);
        if ((iCommerceMediaService2 != null && iCommerceMediaService2.LJ()) || ((iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null)) != null && iCommerceMediaService.LJIIJ())) {
            str = "commerce";
        } else {
            str = "";
        }
        return C1161030gJp.LIZ(10, str2, strValueOf, str);
    }

    public final void hU(String str) {
        new C1043010dFT();
        C1043010dFT.LIZIZ("MusicRavenFragment", new AwS102S1000000_18(str, 6));
        if (Intrinsics.LJFF(this.LLLLZ, str)) {
            this.LLLLZ = "";
            return;
        }
        this.LLLLZ = str;
        refresh();
        C0CNO.LIZLLL(0L, new AwS562S0100000_18(this, 303));
    }

    public final void jU(String str) {
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        C18Z8 c18z8;
        C20600815jK<InterfaceC1891350zJl> state3;
        String itemId;
        RavenSparkModule ravenSparkModule;
        new C1043010dFT();
        C1043010dFT.LIZIZ("MusicRavenFragment", new AwS102S1000000_18(str, 7));
        C18Z8 c18z82 = this.LLJILJIL;
        if (c18z82 != null && (state2 = c18z82.getState()) != null) {
            InterfaceC1891350zJl interfaceC1891350zJl = null;
            for (InterfaceC1891350zJl interfaceC1891350zJl2 : (ArrayList) state2.LJII()) {
                if ((interfaceC1891350zJl2 instanceof RavenSparkModule) && (ravenSparkModule = (RavenSparkModule) interfaceC1891350zJl2) != null) {
                    itemId = ravenSparkModule.getItemId();
                } else {
                    itemId = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("music_collection_card_");
                sbLIZ.append(str);
                if (u.LJIJI(itemId, C2188811AlT.LIZIZ(sbLIZ), false)) {
                    interfaceC1891350zJl = interfaceC1891350zJl2;
                }
            }
            if (interfaceC1891350zJl != null && (c18z8 = this.LLJILJIL) != null && (state3 = c18z8.getState()) != null) {
                C20600815jK.LJIIL(state3, interfaceC1891350zJl);
            }
        }
        C18Z8 c18z83 = this.LLJILJIL;
        if (c18z83 != null && (state = c18z83.getState()) != null && state.LJIIIIZZ() == 0) {
            refresh();
        }
    }

    @C14EU
    public final void onAntiCrawlerEvent(C0XKC c0xkc) {
        String str = c0xkc.LIZ;
        if (str != null && a0.LJJIIZI(str, "/aweme/v1/user/music/collect/?", false)) {
            EventBus.LIZLLL().LIZIZ(c0xkc);
            new C1043010dFT();
            C1043010dFT.LIZIZ("MusicRavenFragment", AFwS206S0000000_18.get$arr$(820));
            refresh();
        }
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        C1161210gK7 c1161210gK7 = new C1161210gK7(Ay());
        c1161210gK7.LIZIZ.put(new C1161180gK4("music_collection_banner_card"), new InterfaceC1161470gKX() { // from class: X.0gLI
            @Override // X.InterfaceC1161120gJy
            public final void LIZ() {
            }

            @Override // X.InterfaceC1161470gKX
            public final C19719912Dl LIZLLL() {
                return C13LE.LIZ(MusicCollectionBannerAssem.class);
            }

            @Override // X.InterfaceC1161120gJy
            public final boolean LJ(BaseComponentData baseComponentData) {
                return true;
            }

            @Override // X.InterfaceC1161120gJy
            public final void service() {
            }

            @Override // X.InterfaceC1161120gJy
            public final InterfaceC1161070gJt<?> LIZIZ() {
                return new InterfaceC1161070gJt<MusicCollectionBannerInfo>() { // from class: X.0gLJ
                    @Override // X.InterfaceC1161070gJt
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1161070gJt
                    public final Class<MusicCollectionBannerInfo> LIZ() {
                        return MusicCollectionBannerInfo.class;
                    }
                };
            }
        });
        c1161210gK7.LIZ();
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onCollectMusicEvent(C0OGJ c0ogj) {
        if (this.LLLLLZ && this.LLLLLLLZIL) {
            int i = c0ogj.LIZIZ;
            if (i == 0) {
                jU(c0ogj.LIZ);
            } else {
                if (i != 1) {
                    return;
                }
                hU(c0ogj.LIZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            r7 = 0
            r8.LLLLLZ = r7
            android.os.Bundle r1 = r8.getArguments()
            if (r1 == 0) goto L1a
            java.lang.String r0 = "power_viewpager_default_key"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.ss.android.ugc.aweme.favorites.business.powerviewpager.RavenMusicCollectionFragmentData r0 = (com.ss.android.ugc.aweme.favorites.business.powerviewpager.RavenMusicCollectionFragmentData) r0
            if (r0 == 0) goto L1a
            boolean r0 = r0.lazyLoad
            r8.LLLLLLLLL = r0
        L1a:
            android.os.Bundle r1 = r8.getArguments()
            r4 = 0
            if (r1 == 0) goto La8
            java.lang.String r0 = "ownerUid"
            java.lang.String r1 = r1.getString(r0)
        L27:
            r8.LLLLLLLLLL = r1
            r6 = 1
            if (r1 == 0) goto La6
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            if (r0 == 0) goto La4
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r0 = r0.getCurSecUserId()
        L38:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto La6
            r0 = 0
        L3f:
            r8.LLLLLLLZIL = r0
            int r0 = X.C258270AAf.LIZ()
            r5 = 2
            if (r0 == r6) goto L5c
            int r0 = X.C258270AAf.LIZ()
            if (r0 == r5) goto L5c
            int r1 = X.C258270AAf.LIZ()
            r0 = 3
            if (r1 == r0) goto L5c
            int r1 = X.C258270AAf.LIZ()
            r0 = 4
            if (r1 != r0) goto L80
        L5c:
            X.01GW<X.0q7O> r0 = X.C1540620qC4.LJJJJIZL
            X.0q68 r3 = new X.0q68
            r3.<init>()
            java.lang.String r0 = "music_collection"
            r3.LIZ = r0
            boolean r0 = com.ss.android.ugc.aweme.favorites.business.music.raven.exp.RavenMusicCollectionEmbeddedExp.LIZ()
            java.lang.String r2 = "aweme://roma_redirect/?spark_page=music_collection_music_audio_card"
            if (r0 == 0) goto L99
            java.lang.String[] r1 = new java.lang.String[r5]
            r1[r7] = r2
            java.lang.String r0 = r8.LLLLLLL
            r1[r6] = r0
            java.util.List r1 = X.C1697810uHb.LJIILJJIL(r1)
        L7b:
            r0 = 24
            X.C679810QlX.LIZ(r3, r1, r4, r4, r0)
        L80:
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility r4 = r8.sT()
            if (r4 == 0) goto L98
            com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata.RavenData r3 = new com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata.RavenData
            boolean r0 = r8.LLLLLLLZIL
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r0 = -1
            r3.<init>(r2, r0)
            java.lang.String r0 = "isMine"
            r4.uJ(r0, r3)
        L98:
            return
        L99:
            java.lang.String r0 = "aweme://roma_redirect/?spark_page=music_collection_music_single_card"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}
            java.util.List r1 = X.C1697810uHb.LJIILJJIL(r0)
            goto L7b
        La4:
            r0 = r4
            goto L38
        La6:
            r0 = 1
            goto L3f
        La8:
            r1 = r4
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.music.raven.RavenMusicCollectionFragment.onCreate(android.os.Bundle):void");
    }

    @C14EU
    public final void onMusicCollectEvent(C629770On1 c629770On1) {
        Music music;
        if (this.LLLLLZ && this.LLLLLLLZIL && (music = c629770On1.LIZIZ.getMusic()) != null) {
            if (music.getCollectStatus() == 0) {
                jU(music.getMid());
            } else {
                if (music.getCollectStatus() != 1) {
                    return;
                }
                hU(music.getMid());
            }
        }
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
        onPageSelected();
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final void pT(C1161040gJq c1161040gJq) {
        if (this.LLLLZIL) {
            this.LLLLZIL = false;
        } else {
            super.pT(c1161040gJq);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/favorites/business/music/raven/RavenMusicCollectionFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLl4C581ld/4ui1h1P+Re+2Pm5bWnc021cL79eizpq37aHOWuCKh0Mnm", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (!z && !isDetached() && this.LLLLLZ) {
            AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 2758);
            if (this.LLLLLLZ == null) {
                ((ArrayList) this.LLLLLLZZ).add(awS562S0100000_18);
            } else {
                awS562S0100000_18.invoke();
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(RavenMusicCollectionFragment.class);
        }
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (!eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJIJJ(this);
        }
        this.LLLLLZ = true;
        this.LLLLLZL = 0;
        this.LLLLZ = "";
        InterfaceC1602960roc interfaceC1602960rocLIZ = C0VWN.LIZ("discovery_favorite_sounds_raven_fps", false);
        interfaceC1602960rocLIZ.LIZIZ(this.LLJILJIL);
        this.LLLLZLLIL = interfaceC1602960rocLIZ;
        C1548820qPI.LIZLLL("tt_to_dsp_link_platform_change_event", this.LLLZ);
    }
}
