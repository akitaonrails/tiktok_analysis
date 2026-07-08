package com.ss.android.ugc.tiktok.tuc;

import X.AnonymousClass1021;
import X.C07XH;
import X.C0SVS;
import X.C101K;
import X.C101N;
import X.C101O;
import X.C101P;
import X.C1219200hpe;
import X.C191774100u;
import X.C191789101j;
import X.C707160RoY;
import X.C722100SUe;
import X.C722160SUk;
import X.C722170SUl;
import X.C722180SUm;
import X.C722220SUq;
import X.C722260SUu;
import X.C722400SVi;
import X.EnumC707150RoX;
import X.InterfaceC722440SVm;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.tuc.TUCBannerData;
import com.ss.android.ugc.tiktok.tuc.model.TUCEventData;
import com.ss.android.ugc.tiktok.tuc.model.TUCIconData;
import com.ss.android.ugc.tiktok.tuc.model.TUCLinkTextData;
import com.ss.android.ugc.tiktok.tuc.model.TUCProcessData;
import com.ss.android.ugc.tiktok.tuc.service.ITUCBizService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TUCBizServiceImpl implements ITUCBizService {
    @Override // com.ss.android.ugc.tiktok.tuc.service.ITUCBizService
    public final AnonymousClass1021 LJFF() {
        return AnonymousClass1021.LIZ;
    }

    @Override // com.ss.android.ugc.tiktok.tuc.service.ITUCBizService
    public final C191774100u LJIIIZ() {
        return C191774100u.LIZ;
    }

    @Override // com.ss.android.ugc.tiktok.tuc.service.ITUCBizService
    public final C722170SUl LJI(Context context) {
        return new C722170SUl(context);
    }

    @Override // com.ss.android.ugc.tiktok.tuc.service.ITUCBizService
    public final C722400SVi LIZIZ(Context context, Aweme aweme, String str) {
        return new C722400SVi(context, aweme, str);
    }

    @Override // com.ss.android.ugc.tiktok.tuc.service.ITUCBizService
    public final C722160SUk LJ(Context context, Aweme aweme, String str, AFwS198S0000000_11 aFwS198S0000000_11) {
        return new C722160SUk(context, aweme, str, aFwS198S0000000_11);
    }

    @Override // com.ss.android.ugc.tiktok.tuc.service.ITUCBizService
    public final C101N LJIIIIZZ(Activity activity, Aweme aweme, C1219200hpe c1219200hpe, AwS590S0100000_11 awS590S0100000_11) {
        return new C101N(activity, aweme, c1219200hpe, awS590S0100000_11);
    }

    @Override // com.ss.android.ugc.tiktok.tuc.service.ITUCBizService
    public final InterfaceC722440SVm<? extends C07XH> LJIIJ(Context context, EnumC707150RoX enumC707150RoX, Aweme aweme, String str) {
        if (C707160RoY.LIZ[enumC707150RoX.ordinal()] == 1) {
            return new C722100SUe(context, aweme, str);
        }
        return new C722260SUu(context, aweme, str);
    }

    @Override // com.ss.android.ugc.tiktok.tuc.service.ITUCBizService
    public final C722220SUq LIZ(Context context, Aweme aweme, String str, boolean z, AFwS198S0000000_11 aFwS198S0000000_11) {
        return new C722220SUq(context, aweme, str, z, aFwS198S0000000_11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SUm] */
    @Override // com.ss.android.ugc.tiktok.tuc.service.ITUCBizService
    public final C722180SUm LIZJ(Context context, TUCBannerData tUCBannerData, String str, boolean z, AFwS198S0000000_11 aFwS198S0000000_11) {
        return new InterfaceC722440SVm<C0SVS>(context, tUCBannerData, str, z, aFwS198S0000000_11) { // from class: X.0SUm
            public final Context LIZ;
            public final C101I LIZIZ;
            public final C722360SVe LIZJ;
            public final C722450SVn LIZLLL;

            @Override // X.InterfaceC722440SVm
            public final C722360SVe LIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC722440SVm
            public final Class<? extends InterfaceC722460SVo<C0SVS>> LIZIZ() {
                return C0SVQ.class;
            }

            @Override // X.InterfaceC722440SVm
            public final C0SVZ LIZJ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC722440SVm
            public final InterfaceC722470SVp<C0SVS> LJ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC722440SVm
            public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
                return new C0SVQ(this.LIZ, (C0SVS) c07xh, interfaceC722440SVm);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [X.0SVn] */
            /* JADX WARN: Type inference failed for: r1v0, types: [X.101I] */
            {
                String str2;
                this.LIZ = context;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                this.LIZIZ = new C101H<C0SVS>(context, str2, tUCBannerData, z) { // from class: X.101I
                    public final String LIZIZ;
                    public final TUCBannerData LIZJ;
                    public final boolean LIZLLL;
                    public final C101E LJ = new C101E();

                    @Override // X.C101H
                    public final int LJ(String str3) {
                        return -1;
                    }

                    @Override // X.InterfaceC722470SVp
                    public final C07XH LIZ() {
                        String str3;
                        AwS394S0200000_28 awS394S0200000_28;
                        TUCIconData tUCIconData = this.LIZJ.leftIcon;
                        C722300SUy c722300SUyLIZIZ = tUCIconData != null ? C101Q.LIZIZ(tUCIconData, this) : new C722300SUy(null, 0, 0, 15);
                        TUCLinkTextData tUCLinkTextData = this.LIZJ.title;
                        if (tUCLinkTextData == null || (str3 = C101Q.LIZJ(tUCLinkTextData, this).LIZ) == null) {
                            str3 = "";
                        }
                        TUCIconData tUCIconData2 = this.LIZJ.rightIcon;
                        C722300SUy c722300SUyLIZIZ2 = tUCIconData2 != null ? C101Q.LIZIZ(tUCIconData2, this) : null;
                        TUCProcessData tUCProcessData = this.LIZJ.action;
                        if (tUCProcessData != null) {
                            C101Q.LJ(tUCProcessData, this.LIZIZ);
                            awS394S0200000_28 = new AwS394S0200000_28(this, tUCProcessData, 66);
                        } else {
                            awS394S0200000_28 = null;
                        }
                        return new C0SVS(c722300SUyLIZIZ, str3, this.LIZLLL ? new C0SVT(0, R.drawable.det, null, 5) : null, c722300SUyLIZIZ2, awS394S0200000_28);
                    }

                    @Override // X.C101H
                    public final /* bridge */ /* synthetic */ C101D LIZIZ() {
                        return this.LJ;
                    }

                    @Override // X.C101H
                    public final int LIZJ(String str3) {
                        StringBuilder sb = new StringBuilder("tux://color?");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("token=");
                        sbLIZ.append(str3);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ));
                        sb.append("&from=tns_notice_tag_tuc_loader");
                        try {
                            C01GW c01gw = C2248361CzK.LIZ;
                            Integer numLJ = C2248361CzK.LJ(this.LIZ, sb.toString());
                            if (numLJ != null) {
                                return numLJ.intValue();
                            }
                            return -1;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return -1;
                        }
                    }

                    @Override // X.C101H
                    public final int LIZLLL(String str3) {
                        StringBuilder sb = new StringBuilder("tux://icon?");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("token=");
                        sbLIZ.append(str3);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ));
                        sb.append("&from=tns_notice_tag_tuc_loader");
                        try {
                            C01GW c01gw = C2248361CzK.LIZ;
                            C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(this.LIZ, sb.toString());
                            if (c698190Ra5LJFF != null) {
                                return c698190Ra5LJFF.LIZ;
                            }
                            return -1;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return -1;
                        }
                    }

                    {
                        this.LIZIZ = str2;
                        this.LIZJ = tUCBannerData;
                        this.LIZLLL = z;
                    }
                };
                String str3 = tUCBannerData.scenario;
                str3 = str3 == null ? "" : str3;
                String str4 = tUCBannerData.type;
                this.LIZJ = new C722360SVe(str3, str4 == null ? "" : str4, C2097908Jt.LIZJ(new Pair("enter_from", str != null ? str : "")));
                this.LIZLLL = new C0SVZ() { // from class: X.0SVn
                    @Override // X.C0SVZ
                    public final void LIZIZ() {
                    }

                    @Override // X.C0SVZ
                    public final void LIZ() {
                        aFwS198S0000000_11.invoke();
                        TUCEventData tUCEventData = tUCBannerData.event;
                        if (tUCEventData != null) {
                            String str5 = str;
                            Map<String, String> linkedHashMap = tUCEventData.injectExtra;
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap<>();
                            }
                            if (str5 != null) {
                                linkedHashMap.put("enter_from", str5);
                                tUCEventData.setInjectExtra(linkedHashMap);
                            }
                            String str6 = tUCEventData.eventName;
                            if (str6 != null) {
                                Map<String, String> map = tUCEventData.injectExtra;
                                if (map != null) {
                                    Map<String, String> map2 = tUCEventData.extra;
                                    if (map2 != null) {
                                        map.putAll(map2);
                                    }
                                } else {
                                    map = tUCEventData.extra;
                                }
                                C722430SVl.LIZ.invoke(str6, map);
                            }
                        }
                    }
                };
            }
        };
    }

    @Override // com.ss.android.ugc.tiktok.tuc.service.ITUCBizService
    public final C191789101j LJIIJJI(Context context, Aweme aweme, String str, AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112) {
        return new C191789101j(context, aweme, str, awS555S0100000_11, awS555S0100000_112);
    }

    @Override // com.ss.android.ugc.tiktok.tuc.service.ITUCBizService
    public final C101P LIZLLL(Context context, Aweme aweme, String str, AwS412S0200000_11 awS412S0200000_11, AwS555S0100000_11 awS555S0100000_11, AwS412S0200000_11 awS412S0200000_112) {
        return new C101P(context, aweme, str, awS412S0200000_11, awS555S0100000_11, awS412S0200000_112);
    }

    @Override // com.ss.android.ugc.tiktok.tuc.service.ITUCBizService
    public final C101O LJIIL(Context context, Aweme aweme, String str, AFwS198S0000000_11 aFwS198S0000000_11, AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112) {
        return new C101O(context, aweme, str, aFwS198S0000000_11, awS555S0100000_11, awS555S0100000_112);
    }

    @Override // com.ss.android.ugc.tiktok.tuc.service.ITUCBizService
    public final C101K LJII(Context context, Aweme aweme, Fragment fragment, String str, AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112, AwS555S0100000_11 awS555S0100000_113) {
        return new C101K(context, aweme, fragment, str, awS555S0100000_11, awS555S0100000_112, awS555S0100000_113);
    }
}
