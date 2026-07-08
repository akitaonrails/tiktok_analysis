package com.ss.android.ugc.tiktok.anchor;

import X.AbstractC1066890drz;
import X.AnonymousClass0189;
import X.C01GW;
import X.C04UD;
import X.C0C64;
import X.C0SUC;
import X.C1022820ciu;
import X.C1065100dp6;
import X.C1067400dso;
import X.C1067940dtg;
import X.C116L;
import X.C1212100heC;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C1393940mNU;
import X.C1393970mNX;
import X.C1393980mNY;
import X.C1393990mNZ;
import X.C1394070mNh;
import X.C1394080mNi;
import X.C1394090mNj;
import X.C1394110mNl;
import X.C1394120mNm;
import X.C1394130mNn;
import X.C1394160mNq;
import X.C1399580mWa;
import X.C13LP;
import X.C1400390mXt;
import X.C1429620nJ2;
import X.C15438062q;
import X.C1554610qYd;
import X.C1589640rT8;
import X.C1618440sDa;
import X.C1697810uHb;
import X.C1AF0;
import X.C1E95;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2097908Jt;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C452501pT;
import X.C566080MIc;
import X.C584850Mwl;
import X.C735370Ssx;
import X.C736480Suk;
import X.C786410Ut5;
import X.EnumC1429610nJ1;
import X.EnumC1430380nKG;
import X.InterfaceC1392590mLJ;
import X.InterfaceC1392640mLO;
import X.InterfaceC1393560mMs;
import X.InterfaceC665370Q7z;
import X.InterfaceC706770Rnv;
import X.InterfaceC718610SGt;
import android.app.Activity;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorKt;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import com.ss.android.ugc.aweme.shortvideo.FromGroupPropService;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoMobFiller;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.aweme.tools.detail.IStickerReuseSvcService;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS59S1300000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class StickerAnchorMaker extends AbstractC1066890drz implements FcpStandardPreloadProtocol {
    public static final /* synthetic */ int LLJJIJIIJIL = 0;
    public final int LLJ;
    public List<EditEffectAnchorInfo> LLJI;
    public String LLJIJIL;
    public AnchorPanelAction LLJILJIL;
    public final String LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    public StickerAnchorMaker() {
        this(0);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "app_page";
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, InterfaceC718610SGt> so1() {
        return null;
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return new C1400390mXt(new AwS422S0200000_21(this, (StickerAnchorMaker) new C1394070mNh(this), (Function1<? super C2344009Gk, Unit>) 92), new AwS422S0200000_21(this, (StickerAnchorMaker) new C1394080mNi(this), (Function1<? super C2344009Gk, Unit>) 92), new AwS422S0200000_21(this, (StickerAnchorMaker) new C1393940mNU(this), (Function1<? super C2344009Gk, Unit>) 92), null, null, 24);
    }

    public final String LJJIJL() {
        String strOptString;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        JSONObject jSONObjectRequestId = interfaceC1392640mLO.requestId();
        if (jSONObjectRequestId == null || (strOptString = jSONObjectRequestId.optString("request_id")) == null) {
            strOptString = "";
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(strOptString);
        return C584850Mwl.LIZ.LIZ(logPbBean);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final InterfaceC1392590mLJ LJJJJJL() {
        final String str = this.LLILLL;
        type();
        final String str2 = this.LLJIJIL;
        Object value = this.LLJJIII.getValue();
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        String extra = anchorCommonStruct != null ? anchorCommonStruct.getExtra() : null;
        value.getClass();
        final JSONObject jSONObjectLIZ = C1394130mNn.LIZ(extra);
        return new C1065100dp6(str, jSONObjectLIZ, str2) { // from class: X.0mNk
            public static final List<String> LJ = C1697810uHb.LJIIJJI(EnumC1429610nJ1.EDIT_EFFECT_SERVER.getType(), EnumC1429610nJ1.EDIT_EFFECT_CLIENT.getType(), EnumC1429610nJ1.EDIT_EFFECT_COMBINED.getType(), EnumC1429610nJ1.EDIT_EFFECT.getType());
            public final String LIZIZ;
            public final String LIZJ;
            public final JSONObject LIZLLL;

            @Override // X.C1065100dp6, X.InterfaceC1392590mLJ
            public final String LIZJ() {
                return LJIIIZ(super.LIZJ());
            }

            @Override // X.C1065100dp6, X.InterfaceC1392590mLJ
            public final C2344009Gk LIZLLL() {
                String strOptString;
                C2344009Gk c2344009GkLIZLLL = super.LIZLLL();
                if (C294070Bfp.LIZ()) {
                    if (C123100dR.LIZ(this.LIZIZ)) {
                        try {
                            JSONObject jSONObject = new JSONObject(this.LIZIZ);
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                c2344009GkLIZLLL.LJFF(next, jSONObject.optString(next, ""));
                            }
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                    JSONObject jSONObject2 = this.LIZLLL;
                    if (jSONObject2 != null) {
                        try {
                            strOptString = jSONObject2.optString("effect_source");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            strOptString = "";
                        }
                        c2344009GkLIZLLL.LJFF("effect_source", strOptString);
                        c2344009GkLIZLLL.LJFF("prop_category", "");
                    } else {
                        strOptString = "";
                        c2344009GkLIZLLL.LJFF("effect_source", strOptString);
                        c2344009GkLIZLLL.LJFF("prop_category", "");
                    }
                }
                return c2344009GkLIZLLL;
            }

            @Override // X.C1065100dp6, X.InterfaceC1392590mLJ
            public final String LJ() {
                return LJIIIZ(super.LJ());
            }

            public final String LJIIIZ(String str3) {
                if (LJ.contains(C1065100dp6.LJII(this.LIZIZ, "anchor_type"))) {
                    if (Intrinsics.LJFF(this.LIZJ, "template")) {
                        return "editing_effect_template";
                    }
                    return EnumC1429610nJ1.EDIT_EFFECT.getType();
                }
                return str3;
            }

            {
                super(str);
                this.LIZIZ = str;
                this.LIZJ = str2;
                this.LIZLLL = jSONObjectLIZ;
            }
        };
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJJZ() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zK0 = interfaceC1392640mLO.k0();
        if (interfaceC665370Q7zK0 != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7zK0, FcpStandardPreloadProtocol.class, this);
        }
    }

    public final String LJJLIIIJJIZ() {
        String str = this.LLJIJIL;
        return Intrinsics.LJFF(str, EnumC1429610nJ1.EDIT_PROP.getType()) ? "editing_prop_page" : (Intrinsics.LJFF(str, EnumC1429610nJ1.EDIT_EFFECT.getType()) || Intrinsics.LJFF(str, EnumC1429610nJ1.EDIT_EFFECT_SERVER.getType()) || Intrinsics.LJFF(str, EnumC1429610nJ1.EDIT_EFFECT_CLIENT.getType())) ? "editing_effect_page" : "editing_effect_template";
    }

    public final boolean LJJLIIIJL() {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        return Intrinsics.LJFF(anchorCommonStruct != null ? AnchorKt.getExtraBasedOnKey(anchorCommonStruct, "sub_type") : null, "ai_self") && C566080MIc.LIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> Yr2() {
        return C2097908Jt.LIZJ(new Pair(StickerPreloadEffectTask.class, new AwS565S0100000_21(this, 1194)));
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new StickerAnchorMaker(this.LLJ + 1);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void onBind() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zK0 = interfaceC1392640mLO.k0();
        if (interfaceC665370Q7zK0 != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7zK0, FcpStandardPreloadProtocol.class, C1697810uHb.LJIILJJIL(this));
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        AnchorCommonStruct anchorCommonStruct;
        List<AnchorPanelAction> actions;
        AnchorCommonStruct anchorCommonStruct2;
        List<AnchorPanelAction> actions2;
        String extra;
        AnchorCommonStruct anchorCommonStruct3 = this.LLIZ;
        if ((anchorCommonStruct3 != null && anchorCommonStruct3.getType() == 28) && (anchorCommonStruct2 = this.LLIZ) != null && (actions2 = anchorCommonStruct2.getActions()) != null) {
            Iterator<AnchorPanelAction> it2 = actions2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AnchorPanelAction next = it2.next();
                if (next.getActionType() == 1) {
                    if (next != null) {
                        AnchorCommonStruct anchorCommonStruct4 = this.LLIZ;
                        if (anchorCommonStruct4 != null && (extra = anchorCommonStruct4.getExtra()) != null) {
                            try {
                                if (JSONObjectProtectorUtils.getInt(new JSONObject(extra), "is_commerce") == 1) {
                                    return EnumC1430380nKG.PROP_COMMERCIAL_EFFECT.getTYPE();
                                }
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        return EnumC1430380nKG.PROP.getTYPE();
                    }
                }
            }
        }
        AnchorCommonStruct anchorCommonStruct5 = this.LLIZ;
        if (anchorCommonStruct5 != null && anchorCommonStruct5.getType() == 64 && (anchorCommonStruct = this.LLIZ) != null && (actions = anchorCommonStruct.getActions()) != null) {
            Iterator<AnchorPanelAction> it3 = actions.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                AnchorPanelAction next2 = it3.next();
                if (next2.getActionType() == 1) {
                    if (next2 != null) {
                        return EnumC1430380nKG.ANCHOR_EDIT_EFFECT.getTYPE();
                    }
                }
            }
        }
        return super.type();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final String LIZLLL() {
        String strJ4;
        String keyword;
        strJ4 = "";
        if (!LJJLIIIJL()) {
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            keyword = anchorCommonStruct != null ? anchorCommonStruct.getKeyword() : null;
            return keyword != null ? keyword : "";
        }
        if (!C1067940dtg.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AI Self | ");
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            keyword = anchorCommonStruct2 != null ? anchorCommonStruct2.getKeyword() : null;
            sbLIZ.append(keyword != null ? keyword : "");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        try {
            String string = LJIILJJIL().getString(2131826567);
            Object[] objArr = new Object[1];
            AnchorCommonStruct anchorCommonStruct3 = this.LLIZ;
            String keyword2 = anchorCommonStruct3 != null ? anchorCommonStruct3.getKeyword() : null;
            if (keyword2 == null) {
                keyword2 = "";
            }
            objArr[0] = keyword2;
            strJ4 = C786410Ut5.j4(string, Arrays.copyOf(objArr, 1));
            return strJ4;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("AI Self · ");
            AnchorCommonStruct anchorCommonStruct4 = this.LLIZ;
            keyword = anchorCommonStruct4 != null ? anchorCommonStruct4.getKeyword() : null;
            if (keyword != null) {
                strJ4 = keyword;
            }
            sbLIZ2.append(strJ4);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public final boolean LJJIJIL() {
        ((IStickerReuseSvcService) ServiceManager.get().getService(IStickerReuseSvcService.class)).LIZ();
        return false;
    }

    public StickerAnchorMaker(int i) {
        this.LLJ = i;
        this.LLJI = new ArrayList();
        this.LLJIJIL = "";
        this.LLJILJILJ = UUID.randomUUID().toString();
        this.LLJILLL = C452501pT.LIZIZ(new C1394110mNl());
        this.LLJJ = C452501pT.LIZIZ(new C1393980mNY(this));
        this.LLJJI = C452501pT.LIZIZ(new C1393970mNX(this));
        this.LLJJIII = C452501pT.LIZIZ(new C1394120mNm());
        this.LLJJIJI = C452501pT.LIZIZ(new C1393990mNZ());
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            AbstractC1066890drz.LJIILLIIL(c2344009Gk, LJJIL("", new C736480Suk()));
            LJJIIJ(c2344009Gk);
        }
        C2344009Gk c2344009GkLJJ = LJJ();
        AbstractC1066890drz.LJIILLIIL(c2344009GkLJJ, LJJIL("", new C736480Suk()));
        C20684815ws.LJIILLIIL("anchor_entrance_click", c2344009GkLJJ.LIZ);
        if (LJIIZILJ().isAd()) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", LJIIZILJ().getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("prop_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
        }
    }

    public final boolean LJJIJIIJI(Aweme aweme) {
        String strOptString;
        boolean z;
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null && !anchors.isEmpty()) {
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                Object value = this.LLJJIII.getValue();
                String extra = anchorCommonStruct.getExtra();
                value.getClass();
                JSONObject jSONObjectLIZ = C1394130mNn.LIZ(extra);
                if (jSONObjectLIZ != null) {
                    try {
                        strOptString = jSONObjectLIZ.optString("effect_source");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        strOptString = "";
                    }
                } else {
                    strOptString = "";
                }
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(strOptString);
                if (numLJIIJJI != null && (numLJIIJJI.intValue() == 102 || numLJIIJJI.intValue() == 1)) {
                    z = true;
                } else {
                    z = false;
                }
                String id = anchorCommonStruct.getId();
                AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
                String id2 = null;
                if (anchorCommonStruct2 != null) {
                    id2 = anchorCommonStruct2.getId();
                }
                if (Intrinsics.LJFF(id, id2) && anchorCommonStruct.getType() == EnumC1430380nKG.PROP.getTYPE() && z && jSONObjectLIZ != null) {
                    try {
                        Integer numValueOf = Integer.valueOf(jSONObjectLIZ.optInt("moderation_status"));
                        if (numValueOf != null && numValueOf.intValue() == 2) {
                            return true;
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }
        }
        return false;
    }

    public final EditEffectAnchorInfo LJJIJIIJIL(AnchorCommonStruct anchorCommonStruct) {
        try {
            JSONObject jSONObject = new JSONObject(anchorCommonStruct.getExtra());
            List listLIZ = AnonymousClass0189.LIZ(jSONObject);
            if (listLIZ == null) {
                return null;
            }
            this.LLJIJIL = jSONObject.optString("sub_type", "edit_effect");
            String id = anchorCommonStruct.getId();
            C1429620nJ2 c1429620nJ2 = EnumC1429610nJ1.Companion;
            String str = this.LLJIJIL;
            c1429620nJ2.getClass();
            return new EditEffectAnchorInfo(id, listLIZ, null, C1429620nJ2.LIZ(str));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot parse anchor extra in createEditEffectInfo with  ");
            sbLIZ.append(e);
            C1AF0.LJ(new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
            return null;
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJJJI(SmartImageView smartImageView) {
        if (this.LLJIJIL.length() > 0 && !this.LLILZIL) {
            String str = this.LLJIJIL;
            if (Intrinsics.LJFF(str, "template")) {
                if (this.LLILZ) {
                    LJJLIIIJLLLLLLLZ(smartImageView, R.raw.icon_template_fill, R.raw.icon_anchor_templates);
                    return;
                } else {
                    LJJLIIIJLLLLLLLZ(smartImageView, R.raw.icon_template, R.raw.icon_anchor_templates);
                    return;
                }
            }
            if (!Intrinsics.LJFF(str, EnumC1429610nJ1.EDIT_EFFECT.getType()) && !Intrinsics.LJFF(str, EnumC1429610nJ1.EDIT_EFFECT_SERVER.getType()) && !Intrinsics.LJFF(str, EnumC1429610nJ1.EDIT_EFFECT_CLIENT.getType())) {
                if (Intrinsics.LJFF(str, EnumC1429610nJ1.EDIT_PROP.getType())) {
                    if (this.LLILZ) {
                        LJJLIIIJLLLLLLLZ(smartImageView, R.raw.icon_effect_fill, R.raw.icon_anchor_effect);
                        return;
                    } else {
                        LJJLIIIJLLLLLLLZ(smartImageView, R.raw.icon_effect, R.raw.icon_anchor_effect);
                        return;
                    }
                }
                if (this.LLILZ) {
                    LJJLIIIJLLLLLLLZ(smartImageView, R.raw.icon_effect_fill, R.raw.icon_anchor_effect);
                    return;
                } else {
                    LJJLIIIJLLLLLLLZ(smartImageView, R.raw.icon_effect, R.raw.icon_anchor_effect);
                    return;
                }
            }
            LJJLIIIJLLLLLLLZ(smartImageView, R.raw.icon_effect_rectangle_fill_fallback, R.raw.icon_anchor_effect_edit);
            return;
        }
        if (LJJLIIIJL()) {
            if (C1067400dso.LIZ()) {
                C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(R.drawable.c4p);
                c1331670kl3LJFF.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJFF);
                return;
            } else {
                C1331670kl3 c1331670kl3LJFF2 = C1331660kl2.LJFF(R.drawable.c4q);
                c1331670kl3LJFF2.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJFF2);
                return;
            }
        }
        super.LJJJI(smartImageView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0248, code lost:
    
        if (r3 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x024a, code lost:
    
        r13 = r13;
        r14 = r14;
        r15 = r15;
        LJJLIIIJLJLI(r13, r14, r15, r5, r6, r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0237 A[Catch: JSONException -> 0x0260, TryCatch #3 {JSONException -> 0x0260, blocks: (B:111:0x01fd, B:112:0x0204, B:114:0x020a, B:116:0x0210, B:117:0x0214, B:119:0x021a, B:122:0x022d, B:123:0x0231, B:125:0x0237, B:128:0x024a), top: B:238:0x01fd }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x027c A[EDGE_INSN: B:321:0x027c->B:134:0x027c BREAK  A[LOOP:11: B:123:0x0231->B:323:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC1050190dR3 LJJJJLL(java.util.List<com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct> r20) {
        /*
            Method dump skipped, instruction units count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.anchor.StickerAnchorMaker.LJJJJLL(java.util.List):X.0dR3");
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        String keyword;
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(309);
        FromGroupPropService fromGroupPropService = (FromGroupPropService) this.LLJILLL.getValue();
        String aid = LJIIZILJ().getAid();
        String str = (String) this.LLJJI.getValue();
        if (str == null) {
            str = "";
        }
        String str2 = (String) this.LLJJ.getValue();
        if (str2 == null) {
            str2 = "";
        }
        fromGroupPropService.LIZ(aid, str, str2, C1212100heC.LIZJ(LJIIZILJ(), aFwS259S0000000_21), C1212100heC.LJFF(LJIIZILJ(), aFwS259S0000000_21));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("whenMyAnchorShown: name? ");
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            keyword = anchorCommonStruct.getKeyword();
        } else {
            keyword = null;
        }
        sbLIZ.append(keyword);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!C04UD.LIZ()) {
            AbstractC1066890drz.LJIILLIIL(c2344009Gk, LJJIL("", new C736480Suk()));
            LJJIIJZLJL(c2344009Gk);
        }
        String str3 = (String) this.LLJJ.getValue();
        if (str3 != null) {
            c2344009Gk.LJFF("prop_resource_list", str3);
        }
        C2344009Gk c2344009GkLJJ = LJJ();
        AbstractC1066890drz.LJIILLIIL(c2344009GkLJJ, LJJIL("", new C736480Suk()));
        C20684815ws.LJIILLIIL("anchor_entrance_show", c2344009GkLJJ.LIZ);
        if (LJIIZILJ().isAd()) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", LJIIZILJ().getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("prop_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
        }
        if (LJJLIIIJL()) {
            C1394090mNj c1394090mNj = C1394090mNj.LIZ;
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            c1394090mNj.getClass();
            C1394090mNj.LIZ(c2344009Gk, anchorCommonStruct2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJJIL(java.lang.String r12, X.C736480Suk r13) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.anchor.StickerAnchorMaker.LJJIL(java.lang.String, X.0Suk):org.json.JSONObject");
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) throws JSONException {
        AVMusic aVMusicAvMusicApply;
        Music music;
        AnchorCommonStruct anchorCommonStruct;
        String keyword;
        String id;
        String stringExtra;
        int videoLength;
        String str;
        List<AnchorCommonStruct> anchors;
        List<AnchorPanelAction> actions;
        Aweme awemeLJIIZILJ = LJIIZILJ();
        if (awemeLJIIZILJ.getMusic() != null && !((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZJ(awemeLJIIZILJ.getMusic())) {
            aVMusicAvMusicApply = ((IMainService) ServiceManager.get().getService(IMainService.class)).avMusicApply(awemeLJIIZILJ.getMusic().convertToMusicModel());
        } else {
            aVMusicAvMusicApply = null;
        }
        if (awemeLJIIZILJ.getMusic() != null && !((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZJ(awemeLJIIZILJ.getMusic())) {
            music = awemeLJIIZILJ.getMusic();
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_effect_music_from_trim_point", true, false)) {
                music.setMusicBeginTime(awemeLJIIZILJ.getMusicBeginTime());
                if (C1399580mWa.LIZ()) {
                    music.setMusicEndTime(awemeLJIIZILJ.getMusicEndTime());
                }
                music.setPreviewStartTime(awemeLJIIZILJ.getMusicBeginTime());
            }
        } else {
            music = null;
        }
        if (this.LLJIJIL.length() > 0) {
            com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).setData(this.LLJILJILJ, new EditEffectAnchorManager(this.LLJI, this.LLJIJIL));
        }
        Aweme awemeLJIIZILJ2 = LJIIZILJ();
        if (awemeLJIIZILJ2 != null && (anchors = awemeLJIIZILJ2.getAnchors()) != null) {
            ArrayList arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct2 : anchors) {
                AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct2;
                if (anchorCommonStruct3.getType() == EnumC1430380nKG.ANCHOR_VOICECONVERSION.getTYPE() && (actions = anchorCommonStruct3.getActions()) != null) {
                    Iterator<AnchorPanelAction> it2 = actions.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AnchorPanelAction next = it2.next();
                            if (next.getActionType() == 1) {
                                if (next != null) {
                                    arrayList.add(anchorCommonStruct2);
                                }
                            }
                        }
                    }
                }
            }
            anchorCommonStruct = (AnchorCommonStruct) C13LP.LJJJLL(arrayList);
        } else {
            anchorCommonStruct = null;
        }
        LJJIJIL();
        String str2 = "";
        if (Intrinsics.LJFF(this.LLJIJIL, "template")) {
            List<EditEffectAnchorInfo> list = this.LLJI;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it3 = ((ArrayList) list).iterator();
            while (it3.hasNext()) {
                arrayList2.add(((EditEffectAnchorInfo) it3.next()).effectId);
            }
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            try {
                stringExtra = interfaceC1392640mLO.LIZIZ().getIntent().getStringExtra("shoot_enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            IPropReuseService iPropReuseService = (IPropReuseService) ServiceManager.get().getService(IPropReuseService.class);
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
            if (interfaceC1392640mLO2 == null) {
                interfaceC1392640mLO2 = null;
            }
            Activity activityLIZIZ = interfaceC1392640mLO2.LIZIZ();
            String strLJJLIIIJJIZ = LJJLIIIJJIZ();
            LJJIJIL();
            Music music2 = LJIIZILJ().getMusic();
            Video video = LJIIZILJ().getVideo();
            if (video != null) {
                videoLength = video.getVideoLength();
            } else {
                videoLength = 0;
            }
            String strLJIJJLI = LJIJJLI();
            String str3 = this.LLJILJILJ;
            LJJIJIL();
            LJJIJIL();
            boolean isTikTokStory = LJIIZILJ().getIsTikTokStory();
            C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
            InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = c1618440sDa.LJJIIJ();
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
            if (interfaceC1392640mLO3 == null) {
                interfaceC1392640mLO3 = null;
            }
            if (interfaceC706770RnvLJJIIJ.LJJIIJZLJL(interfaceC1392640mLO3.LJ()) && LJIIZILJ().getIsTikTokStory()) {
                str = "story_immersive_anchor";
            } else {
                InterfaceC706770Rnv interfaceC706770RnvLJJIIJ2 = c1618440sDa.LJJIIJ();
                InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
                if (interfaceC1392640mLO4 == null) {
                    interfaceC1392640mLO4 = null;
                }
                if (interfaceC706770RnvLJJIIJ2.LJJIIJZLJL(interfaceC1392640mLO4.LJ())) {
                    str = "post_immersive_anchor";
                } else {
                    C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
                    InterfaceC1392640mLO interfaceC1392640mLO5 = this.LL;
                    if (interfaceC1392640mLO5 == null) {
                        interfaceC1392640mLO5 = null;
                    }
                    if (c1589640rT8.t2(interfaceC1392640mLO5.LJ()) && LJIIZILJ().getIsTikTokStory()) {
                        str = "story_friends_feed_anchor";
                    } else {
                        InterfaceC1392640mLO interfaceC1392640mLO6 = this.LL;
                        if (interfaceC1392640mLO6 == null) {
                            interfaceC1392640mLO6 = null;
                        }
                        if (c1589640rT8.t2(interfaceC1392640mLO6.LJ())) {
                            str = "post_friends_feed_anchor";
                        } else {
                            str = null;
                        }
                    }
                }
            }
            iPropReuseService.LJFF(activityLIZIZ, arrayList2, new C116L(null, strLJJLIIIJJIZ, music2, false, "prop_auto", "anchor_combine_page", null, "", "anchor_combine_prop", null, null, false, "", Integer.valueOf(videoLength), null, null, null, false, strLJIJJLI, stringExtra, str3, "", "", null, null, isTikTokStory, str, Integer.valueOf(awemeLJIIZILJ.getAwemeType()), LJIIZILJ(), null, 0, -1022911319), false);
        } else if (LJJIJIIJI(awemeLJIIZILJ)) {
            InterfaceC1392640mLO interfaceC1392640mLO7 = this.LL;
            if (interfaceC1392640mLO7 == null) {
                interfaceC1392640mLO7 = null;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(interfaceC1392640mLO7.LIZIZ());
            c1389890mGx.LJIIIZ(2131821014);
            c1389890mGx.LJIIJJI();
        } else if (LJJLIIIJL()) {
            C1394090mNj c1394090mNj = C1394090mNj.LIZ;
            Activity activityLJIILJJIL = LJIILJJIL();
            AnchorCommonStruct anchorCommonStruct4 = this.LLIZ;
            if (anchorCommonStruct4 != null) {
                id = anchorCommonStruct4.getId();
            } else {
                id = null;
            }
            c1394090mNj.getClass();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLJIILJJIL, "//aime/style/detail");
            smartRouteBuildRoute.withParam("ids", id);
            smartRouteBuildRoute.withParam("enter_from", "homepage_hot");
            smartRouteBuildRoute.open();
        } else {
            C1394160mNq c1394160mNq = (C1394160mNq) this.LLJJIJI.getValue();
            Aweme awemeLJIIZILJ3 = LJIIZILJ();
            AnchorCommonStruct anchorCommonStruct5 = this.LLIZ;
            Activity activityLJIILJJIL2 = LJIILJJIL();
            String strLJIJJLI2 = LJIJJLI();
            String strLJJIJL = LJJIJL();
            String str4 = this.LLJILJILJ;
            if (this.LLJIJIL.length() <= 0) {
                str4 = null;
            }
            InterfaceC1392640mLO interfaceC1392640mLO8 = this.LL;
            if (interfaceC1392640mLO8 == null) {
                interfaceC1392640mLO8 = null;
            }
            AnchorCommonStruct anchorCommonStruct6 = this.LLIZ;
            if (anchorCommonStruct6 != null && (keyword = anchorCommonStruct6.getKeyword()) != null) {
                str2 = keyword;
            }
            c1394160mNq.LIZJ.LIZ(awemeLJIIZILJ3, anchorCommonStruct5, activityLJIILJJIL2, music, aVMusicAvMusicApply, strLJJIJL, strLJIJJLI2, anchorCommonStruct, ((Boolean) c1394160mNq.LIZLLL.getValue()).booleanValue(), str2, new AwS59S1300000_21(interfaceC1392640mLO8, awemeLJIIZILJ3, str4, c1394160mNq, 4));
        }
        C736480Suk c736480Suk = new C736480Suk();
        c736480Suk.LIZ("enter_method", "click_anchor");
        JSONObject jSONObjectLJJIL = LJJIL(C735370Ssx.LJI(awemeLJIIZILJ), c736480Suk);
        Activity activityLJIILJJIL3 = LJIILJJIL();
        if (activityLJIILJJIL3 != null) {
            for (Map.Entry<String, String> entry : TakoAIVideoMobFiller.toParams(C0SUC.LIZ(activityLJIILJJIL3)).entrySet()) {
                jSONObjectLJJIL.put(entry.getKey(), entry.getValue());
            }
        }
        C20684815ws.LJIJ("enter_prop_detail", jSONObjectLJJIL);
        C1E95 c1e95 = C1E95.LIZIZ;
        if (c1e95.LJIILL()) {
            c2344009Gk.LIZJ(c1e95.LJJIFFI(C735370Ssx.LIZJ(LJIIZILJ())), "spammy_tag_cnt");
        }
        if (!C04UD.LIZ()) {
            AbstractC1066890drz.LJIILLIIL(c2344009Gk, LJJIL("", new C736480Suk()));
            C20684815ws.LJIILLIIL("enter_multi_anchor_detail", c2344009Gk.LIZ);
        }
        if (LJIIZILJ().isAd()) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("anchor_detail", "otherclick", LJIIZILJ().getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("prop_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().start("tool_performance_effect_shoot_same", "click_event");
    }

    public final void LJJLIIIJLLLLLLLZ(SmartImageView smartImageView, int i, int i2) {
        if (this.LLILZ) {
            smartImageView.setImageDrawable(new TuxIconDrawable(LJIILJJIL(), i));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, LJIILJJIL());
            if (numLIZJ != null) {
                smartImageView.setColorFilter(numLIZJ.intValue());
                return;
            }
            return;
        }
        smartImageView.setImageDrawable(new TuxIconDrawable(LJIILJJIL(), i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJJJIZL(android.view.ViewGroup r7, android.app.Dialog r8, X.C2344009Gk r9, int r10) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r5 = r6.LLIZ
            r3 = 0
            if (r5 == 0) goto L72
            java.lang.String r4 = r5.getKeyword()
            android.content.Context r0 = r7.getContext()
            X.0mOl r2 = X.C1066980ds8.LIZ(r0)
            java.lang.String r1 = r6.LLJIJIL
            java.lang.String r0 = "template"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6b
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r1.<init>()
            java.lang.String r0 = "20px_anchor_template3x.png"
            r1.setUri(r0)
            java.lang.String r0 = "https://p16.tiktokcdn.com/obj/tiktok-obj/20px_anchor_template3x.png"
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.setUrlList(r0)
        L2e:
            boolean r0 = X.C0R07.LIZ()
            if (r0 != 0) goto L67
            r2.setToolsIcon(r1)
        L37:
            if (r4 != 0) goto L3b
            java.lang.String r4 = ""
        L3b:
            r2.setTitle(r4)
            java.lang.String r0 = r5.getDescription()
            r2.setSubTitle(r0)
            Y.ACListenerS86S0300000_21 r1 = new Y.ACListenerS86S0300000_21
            r0 = 3
            r1.<init>(r6, r8, r9, r0)
            X.C786410Ut5.ca(r2, r1)
            com.ss.android.ugc.aweme.feed.model.AnchorPanelAction r0 = r6.LLJILJIL
            if (r0 == 0) goto L56
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.getIcon()
        L56:
            r2.setButtonIcon(r3)
            kotlin.jvm.internal.AwS230S0300000_21 r1 = new kotlin.jvm.internal.AwS230S0300000_21
            r0 = 19
            r1.<init>(r6, r2, r9, r0)
            r2.setButtonOnClickListener(r1)
            r7.addView(r2)
            return r2
        L67:
            r2.setIcon(r1)
            goto L37
        L6b:
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r5.getThumbnail()
            if (r1 == 0) goto L37
            goto L2e
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.anchor.StickerAnchorMaker.LJJJJIZL(android.view.ViewGroup, android.app.Dialog, X.09Gk, int):android.view.View");
    }

    public static void LJJLIIIJLJLI(List list, List list2, List list3, List list4, List list5, List list6) {
        list.removeAll(list2);
        list.removeAll(list3);
        list.removeAll(list4);
        ((ArrayList) list2).clear();
        ((ArrayList) list3).clear();
        ((ArrayList) list4).clear();
        ((ArrayList) list5).clear();
        if (list6 != null) {
            list.removeAll(list6);
            ((ArrayList) list6).clear();
        }
    }
}
