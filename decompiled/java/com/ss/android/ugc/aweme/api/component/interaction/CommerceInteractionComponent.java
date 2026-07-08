package com.ss.android.ugc.aweme.api.component.interaction;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0A6L;
import X.C0BOW;
import X.C0CAU;
import X.C0RDX;
import X.C0RF0;
import X.C0S5D;
import X.C0SCL;
import X.C0SM6;
import X.C0SQ9;
import X.C1002610cCJ;
import X.C1002620cCK;
import X.C1002640cCM;
import X.C1002680cCQ;
import X.C1003270cDN;
import X.C1005320cGg;
import X.C1008980cMa;
import X.C1009020cMe;
import X.C1009030cMf;
import X.C1009040cMg;
import X.C1009050cMh;
import X.C1009090cMl;
import X.C1009120cMo;
import X.C1009130cMp;
import X.C1009260cN2;
import X.C1009390cNF;
import X.C1014390cVJ;
import X.C1014410cVL;
import X.C1017070cZd;
import X.C1022030chd;
import X.C1029590ctp;
import X.C1056540dbI;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1558520qew;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2201691BEx;
import X.C2217381BqS;
import X.C288720BTi;
import X.C390801fW;
import X.C418440Gaw;
import X.C452501pT;
import X.C497820Jfg;
import X.C634550Ouj;
import X.C687700QyG;
import X.C691740RBk;
import X.C707490Rp5;
import X.C707500Rp6;
import X.C707510Rp7;
import X.C708070Rq1;
import X.C708080Rq2;
import X.C710660RuC;
import X.C720670SOr;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C730780SlY;
import X.C731510Smj;
import X.C733110SpJ;
import X.C734410SrP;
import X.C734420SrQ;
import X.C734490SrX;
import X.C734610Srj;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C990820btI;
import X.C991890bv1;
import X.C996650c2h;
import X.C996660c2i;
import X.C996670c2j;
import X.C996900c36;
import X.C996920c38;
import X.C997720c4Q;
import X.EnumC1009140cMq;
import X.EnumC696280RSw;
import X.EnumC706820Ro0;
import X.InterfaceC1008930cMV;
import X.InterfaceC1009510cNR;
import X.InterfaceC1021920chS;
import X.InterfaceC1035050d2d;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC583650Mup;
import X.InterfaceC689860R4e;
import X.InterfaceC691660RBc;
import X.InterfaceC987950bof;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoModeAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.IAnoleComponentTranslationAbility;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.api.IGetApps;
import com.ss.android.ugc.aweme.api.component.CommerceInteractionAbility;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentBusinessAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutConstraintModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterAdapterService;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterComponentClick;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS452S0200000_16;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceInteractionComponent extends BaseCellContentComponent<CommerceInteractionComponent> implements CommerceInteractionAbility, InterfaceC1009510cNR, IAnoleComponentTranslationAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public View LLLII;
    public boolean LLLIIIIL;
    public String LLLIILIL;
    public volatile boolean LLLIL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new C707500Rp6(this));
    public final C01GW LLJJL = C452501pT.LIZIZ(new C707510Rp7(this));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C0S5D(this));
    public final C01GW LLJL = C452501pT.LIZIZ(new C708080Rq2(this));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C708070Rq1(this));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new C707490Rp5(this));
    public final C01GW LLJLL = C452501pT.LIZIZ(new C990820btI(this));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new C1003270cDN(this));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 61));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 60));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 62));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 66));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 67));
    public final C01GW LLLFF = C452501pT.LIZIZ(new C710660RuC());
    public final C01GW LLLFFI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(42));
    public final C01GW LLLFZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(105));
    public final C01GW LLLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(41));
    public final C01GW LLLIIII = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), new C1009120cMo());
    public final C01GW LLLIIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS252S0000000_16.get$arr$(90));
    public final ConcurrentHashMap<String, Rect> LLLIIL = new ConcurrentHashMap<>();
    public final C01GW LLLILZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(104));

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1931704516 || iHashCode == 859468410) {
            return this;
        }
        return null;
    }

    static {
        new Object() { // from class: X.0cMy
        };
    }

    @Override // X.InterfaceC1009510cNR
    public final C1014390cVJ LLJJIJIIJIL() {
        InterfaceC583650Mup interfaceC583650MupX3;
        View videoView;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJL.getValue();
        if (iVideoCellAbility == null || (interfaceC583650MupX3 = iVideoCellAbility.x3()) == null || (videoView = interfaceC583650MupX3.getVideoView()) == null) {
            return null;
        }
        return new C1014390cVJ(new C1009390cNF(videoView.getWidth(), videoView.getHeight()), new PointF(videoView.getLeft() + (videoView.getWidth() / 2), videoView.getTop() + (videoView.getHeight() / 2)));
    }

    public final List<IAnoleManager> ep() {
        C0SM6 c0sm6LJJI;
        List<IAnoleManager> listLJI;
        IAnoleManager iAnoleManagerRi;
        ArrayList arrayList = new ArrayList();
        InterfaceC1008930cMV interfaceC1008930cMVIp = ip();
        if (interfaceC1008930cMVIp != null && (iAnoleManagerRi = interfaceC1008930cMVIp.Ri()) != null) {
            arrayList.add(iAnoleManagerRi);
        }
        InterfaceC1008930cMV interfaceC1008930cMVIp2 = ip();
        if (interfaceC1008930cMVIp2 != null && (c0sm6LJJI = interfaceC1008930cMVIp2.LJJI()) != null && (listLJI = c0sm6LJJI.LJI()) != null) {
            arrayList.addAll(listLJI);
        }
        if (!arrayList.isEmpty()) {
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }

    public final VideoEventDispatchViewModel hp() {
        return (VideoEventDispatchViewModel) this.LLLIIII.getValue();
    }

    public final InterfaceC1008930cMV ip() {
        IFeedService iFeedService = (IFeedService) this.LLLFF.getValue();
        Context context = getContext();
        C0RF0 c0rf0 = jm().LIZLLL;
        String str = c0rf0 != null ? c0rf0.LJIIIZ : null;
        C724270Sb3 c724270Sb3 = this.LLJI;
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ = iFeedService.LIZJ(context, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme(), str, true);
        if (interfaceC1008930cMVLIZJ == null) {
            return null;
        }
        if (!C1056540dbI.LIZJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getFeedItemModule commerceInteractionOperator init = ");
            sbLIZ.append(interfaceC1008930cMVLIZJ.LJIIIZ());
            sbLIZ.append(" ,event_type =  ");
            C0RF0 c0rf02 = jm().LIZLLL;
            sbLIZ.append(c0rf02 != null ? c0rf02.LJIIIZ : null);
            sbLIZ.append(",item.aweme = ");
            C724270Sb3 c724270Sb32 = this.LLJI;
            sbLIZ.append(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme());
            C2188811AlT.LIZIZ(sbLIZ);
        } else if (C691740RBk.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getFeedItemModule commerceInteractionOperator init = ");
            sbLIZ2.append(interfaceC1008930cMVLIZJ.LJIIIZ());
            sbLIZ2.append(" ,event_type =  ");
            C0RF0 c0rf03 = jm().LIZLLL;
            sbLIZ2.append(c0rf03 != null ? c0rf03.LJIIIZ : null);
            sbLIZ2.append(",item.aweme = ");
            C724270Sb3 c724270Sb33 = this.LLJI;
            sbLIZ2.append(((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        interfaceC1008930cMVLIZJ.LJIJJLI(this);
        return interfaceC1008930cMVLIZJ;
    }

    public final InteractAreaCommonAbility kp() {
        return (InteractAreaCommonAbility) this.LLJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.api.component.CommerceInteractionAbility
    public final Rect mg2() {
        if (this.LLLIIL.isEmpty()) {
            return null;
        }
        Rect rect = new Rect();
        Iterator<T> it2 = this.LLLIIL.values().iterator();
        while (it2.hasNext()) {
            rect.union((Rect) it2.next());
        }
        return rect;
    }

    public final void mp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        AwemeRawAd awemeRawAd = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAwemeRawAd();
        if (awemeRawAd != null) {
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            new AwS630S0100000_16(awemeRawAd, 10);
            C2201691BEx.LIZ("click", clickTrackUrlList, creativeId, logExtra);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void H() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC691660RBc) it2.next()).H();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        InteractAreaCommonAbility interactAreaCommonAbilityKp;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZIZ((InterfaceC691660RBc) it2.next());
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderUnselected awemeId = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        sbLIZ.append(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid());
        sbLIZ.append(",des =");
        C724270Sb3 c724270Sb32 = this.LLJI;
        sbLIZ.append(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getDesc());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1008930cMV interfaceC1008930cMVIp = ip();
        if (interfaceC1008930cMVIp != null) {
            interfaceC1008930cMVIp.LJJIII();
        }
        if (((Boolean) C0A6L.LIZ.getValue()).booleanValue()) {
            C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS116S0100000_16(this, 232));
        } else {
            EnumC706820Ro0 enumC706820Ro0LIZLLL = C1009130cMp.LIZLLL(EnumC1009140cMq.ANOLE_LEFT_INTERACT.getInteractName());
            if (enumC706820Ro0LIZLLL != null && (interactAreaCommonAbilityKp = kp()) != null) {
                interactAreaCommonAbilityKp.Xz2(enumC706820Ro0LIZLLL, true, null, false, null);
            }
        }
        EventBus.LIZLLL().LJJI(this);
        this.LLLIIL.clear();
        ISlideIndicatorAbility iSlideIndicatorAbility = (ISlideIndicatorAbility) C1558520qew.LIZ(this, ISlideIndicatorAbility.class, null);
        if (iSlideIndicatorAbility != null) {
            iSlideIndicatorAbility.qd0(0.0f);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LJLLLL();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderUnbind awemeId = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        sbLIZ.append(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid());
        sbLIZ.append(",des =");
        C724270Sb3 c724270Sb32 = this.LLJI;
        sbLIZ.append(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getDesc());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1008930cMV interfaceC1008930cMVIp = ip();
        if (interfaceC1008930cMVIp != null) {
            interfaceC1008930cMVIp.LIZ();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC1008930cMV interfaceC1008930cMVIp = ip();
        if (interfaceC1008930cMVIp != null) {
            interfaceC1008930cMVIp.LJJIIJ();
        }
        EventBus.LIZLLL().LJJI(this);
        this.LLLIL = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).onDestroyView();
            }
        }
        InterfaceC1008930cMV interfaceC1008930cMVIp = ip();
        if (interfaceC1008930cMVIp != null) {
            interfaceC1008930cMVIp.onDestroyView();
        }
        EventBus.LIZLLL().LJJI(this);
        this.LLLIL = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        EventBus.LIZLLL().LJJI(this);
        this.LLLIL = false;
        ISlideIndicatorAbility iSlideIndicatorAbility = (ISlideIndicatorAbility) C1558520qew.LIZ(this, ISlideIndicatorAbility.class, null);
        if (iSlideIndicatorAbility != null) {
            iSlideIndicatorAbility.qd0(0.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.translation.ability.IAnoleComponentTranslationAbility
    public final void LJJLJ(IAdTranslationData iAdTranslationData) throws JSONException {
        List<C1002640cCM> list;
        List<IAnoleManager> listEp;
        C1002680cCQ c1002680cCQLIZ = C997720c4Q.LIZ(iAdTranslationData);
        if (c1002680cCQLIZ == null || (list = (List) c1002680cCQLIZ.LIZIZ.getValue()) == null || (listEp = ep()) == null) {
            return;
        }
        for (IAnoleManager iAnoleManager : listEp) {
            for (C1002640cCM c1002640cCM : list) {
                sp(iAnoleManager, c1002640cCM.LIZ, C2097908Jt.LIZJ(new Pair("updatedFrontendData", c1002640cCM.LIZIZ.LIZ)));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("translationEvent", "globalPropsUpdated");
            iAnoleManager.LJIIZILJ(new C0SCL(jSONObject));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LJLIIIL(i);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.translation.ability.IAnoleComponentTranslationAbility
    public final void LJZ(IAdTranslatableData iAdTranslatableData) throws JSONException {
        List<IAnoleManager> listEp;
        List<C1002610cCJ> list = (List) ((C1002620cCK) iAdTranslatableData).LIZIZ.getValue();
        if (list == null || (listEp = ep()) == null) {
            return;
        }
        for (IAnoleManager iAnoleManager : listEp) {
            for (C1002610cCJ c1002610cCJ : list) {
                sp(iAnoleManager, c1002610cCJ.LIZIZ, C2097908Jt.LIZJ(new Pair("updatedFrontendData", c1002610cCJ.LIZJ.LIZ)));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("translationEvent", "globalPropsUpdated");
            iAnoleManager.LJIIZILJ(new C0SCL(jSONObject));
        }
    }

    @Override // X.InterfaceC1009510cNR
    public final C1014410cVL LLJJIJI(String str) {
        Context context;
        C720670SOr c720670SOrLQ;
        C720670SOr c720670SOrLQ2;
        C720670SOr c720670SOrLQ3;
        View view = null;
        if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_LEFT_INTERACT.getInteractName())) {
            InteractAreaCommonAbility interactAreaCommonAbilityKp = kp();
            if (interactAreaCommonAbilityKp == null || (c720670SOrLQ3 = interactAreaCommonAbilityKp.LQ("left_container")) == null) {
                return null;
            }
            return new C1014410cVL(c720670SOrLQ3.LIZIZ, c720670SOrLQ3.LIZJ, c720670SOrLQ3.LIZ);
        }
        if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_RIGHT_INTERACT.getInteractName())) {
            InteractAreaCommonAbility interactAreaCommonAbilityKp2 = kp();
            if (interactAreaCommonAbilityKp2 == null || (c720670SOrLQ2 = interactAreaCommonAbilityKp2.LQ("right_container")) == null) {
                return null;
            }
            return new C1014410cVL(c720670SOrLQ2.LIZIZ, c720670SOrLQ2.LIZJ, c720670SOrLQ2.LIZ);
        }
        if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_BOTTOM_INTERACT.getInteractName())) {
            InteractAreaCommonAbility interactAreaCommonAbilityKp3 = kp();
            if (interactAreaCommonAbilityKp3 == null || (c720670SOrLQ = interactAreaCommonAbilityKp3.LQ("bottom_container")) == null) {
                return null;
            }
            return new C1014410cVL(c720670SOrLQ.LIZIZ, c720670SOrLQ.LIZJ, c720670SOrLQ.LIZ);
        }
        if (!Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_STATUS_BAR.getInteractName()) || (context = getContext()) == null) {
            return null;
        }
        int iLIZJ = C497820Jfg.LIZJ(context);
        int iLIZIZ = C497820Jfg.LIZIZ(context);
        int[] iArr = new int[2];
        View view2 = this.LLLII;
        if (view2 != null) {
            view = view2;
        }
        view.getLocationInWindow(iArr);
        return new C1014410cVL(iLIZIZ, iLIZJ, iArr);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LLLI(i);
            }
        }
    }

    public final void lp(C1005320cGg c1005320cGg) {
        Object obj;
        Integer num;
        String str;
        Object obj2;
        InterfaceC689860R4e interfaceC689860R4eK9;
        InterfaceC987950bof interfaceC987950bofLJLL;
        String string;
        String string2;
        if (c1005320cGg.LIZ == 1) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj3 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            Map<String, Object> map = c1005320cGg.LJII;
            Object obj4 = map.get("ecBTM");
            if (obj4 != null && (string2 = obj4.toString()) != null) {
                AwemeExtKt.appendMobParam(aweme, "ad_ugen_ec_btm", string2);
            }
            Object obj5 = map.get("pdpExtraTrackParams");
            if (obj5 != null && (string = obj5.toString()) != null) {
                AwemeExtKt.appendMobParam(aweme, "ad_ugen_pdp_extra_track_params", string);
            }
            Object obj6 = c1005320cGg.LJII.get("clickable_type");
            if (obj6 instanceof Integer) {
                num = (Integer) obj6;
            } else {
                num = null;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJL.getValue();
                if (iVideoCellAbility != null && (interfaceC689860R4eK9 = iVideoCellAbility.K9()) != null && (interfaceC987950bofLJLL = interfaceC689860R4eK9.LJLL()) != null) {
                    interfaceC987950bofLJLL.LIZJ(iIntValue);
                    return;
                }
                return;
            }
            int i = c1005320cGg.LIZLLL;
            C0RF0 c0rf0 = jm().LIZLLL;
            if (c0rf0 != null) {
                str = c0rf0.LJIIIZ;
            } else {
                str = null;
            }
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            Aweme aweme2 = ((VideoItemParams) obj2).getAweme();
            if (!((ICRouterAdapterService) ServiceManager.get().getService(ICRouterAdapterService.class)).LIZJ(i, aweme2, str) && !c1005320cGg.LJIIIZ) {
                C1029590ctp.LIZIZ();
                Context context = getContext();
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                }
                C0SQ9.LIZ(context, ((VideoItemParams) obj3).getAweme(), c1005320cGg.LIZLLL, new InterfaceC1021920chS() { // from class: X.0cMn
                    @Override // X.InterfaceC1021920chS
                    public final void LIZ() {
                    }
                });
                if (c1005320cGg.LJIIIIZZ) {
                    op(c1005320cGg, false);
                }
                mp();
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleTap cRouterClick anole cta click ,clickFrom = ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            if (c1005320cGg.LJIIIIZZ) {
                op(c1005320cGg, true);
            }
            mp();
            ((ICRouterComponentClick) ServiceManager.get().getService(ICRouterComponentClick.class)).LJI(aweme2, i, getContext(), c1005320cGg.LJII, c1005320cGg.LIZJ, c1005320cGg.LJI);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAnoleTapEvent(C991890bv1 c991890bv1) {
        Object obj;
        String str = c991890bv1.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(str, ((VideoItemParams) obj).getAweme().getAid())) {
            lp(c991890bv1.LIZIZ);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLLII = view;
        String str = null;
        if (!((Boolean) C0BOW.LIZ.getValue()).booleanValue()) {
            C723830SaL.LIZ(this, null, new AwS377S0200000_11(this, view, 14));
        }
        C736680Sv4.LJIIIIZZ(this, hp(), C1009020cMe.INSTANCE, null, new C996900c36(), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), C733110SpJ.INSTANCE, null, new C734610Srj(), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), C634550Ouj.INSTANCE, null, new C734420SrQ(), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), C1009090cMl.INSTANCE, null, new C734410SrP(), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), C730780SlY.INSTANCE, null, new C996650c2h(), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), C1009030cMf.INSTANCE, null, new C996670c2j(), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), C1009040cMg.INSTANCE, null, new C996660c2i(), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), C731510Smj.INSTANCE, null, new C734490SrX(), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), C1009050cMh.INSTANCE, null, new C996920c38(), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0Ouk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJ;
            }
        }, null, AFwS300S0000000_16.get$arr$(11), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIIL.getValue(), new C2217381BqS() { // from class: X.0RHr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, null, AFwS300S0000000_16.get$arr$(8), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIIL.getValue(), new C2217381BqS() { // from class: X.0S95
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJLIIIJLLLLLLLZ;
            }
        }, null, AFwS300S0000000_16.get$arr$(9), 6);
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        }
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0cMk
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1ELP) obj).LLJZIJLIL;
                }
            }, null, AFwS300S0000000_16.get$arr$(10), 6);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void p(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).p(i);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        int iHashCode;
        VideoItemParams videoItemParams2 = videoItemParams;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind awemeId = ");
        sbLIZ.append(videoItemParams2.getAweme().getAid());
        sbLIZ.append(",des =");
        sbLIZ.append(videoItemParams2.getAweme().getDesc());
        sbLIZ.append(' ');
        InterfaceC1008930cMV interfaceC1008930cMVIp = ip();
        if (interfaceC1008930cMVIp != null) {
            iHashCode = interfaceC1008930cMVIp.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1008930cMV interfaceC1008930cMVIp2 = ip();
        if (interfaceC1008930cMVIp2 != null) {
            View view = this.LLLII;
            if (view == null) {
                view = null;
            }
            interfaceC1008930cMVIp2.LJ(view);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Object obj;
        Object obj2;
        String str;
        Object obj3;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (!eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJIJJ(this);
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
            }
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        ((VideoItemParams) obj).getAweme().getAid();
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        ((VideoItemParams) obj2).getAweme().getDesc();
        IFeedService iFeedService = (IFeedService) this.LLLFF.getValue();
        Context context = getContext();
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        } else {
            str = null;
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        } else {
            obj3 = null;
        }
        iFeedService.LJIIIIZZ(context, ((VideoItemParams) obj3).getAweme(), str);
        InterfaceC1008930cMV interfaceC1008930cMVIp = ip();
        if (interfaceC1008930cMVIp != null) {
            interfaceC1008930cMVIp.LJJIJIIJIL(i);
        }
        ISlideIndicatorAbility iSlideIndicatorAbility = (ISlideIndicatorAbility) C1558520qew.LIZ(this, ISlideIndicatorAbility.class, null);
        if (iSlideIndicatorAbility != null) {
            iSlideIndicatorAbility.qd0(0.0f);
        }
    }

    @Override // X.InterfaceC1009510cNR
    public final void LLJJIII(String str, View.OnLayoutChangeListener onLayoutChangeListener) {
        InteractAreaCommonAbility interactAreaCommonAbilityKp;
        if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_LEFT_INTERACT.getInteractName())) {
            InteractAreaCommonAbility interactAreaCommonAbilityKp2 = kp();
            if (interactAreaCommonAbilityKp2 != null) {
                interactAreaCommonAbilityKp2.LLJJIII("left_container", onLayoutChangeListener);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_RIGHT_INTERACT.getInteractName())) {
            InteractAreaCommonAbility interactAreaCommonAbilityKp3 = kp();
            if (interactAreaCommonAbilityKp3 == null) {
                return;
            }
            interactAreaCommonAbilityKp3.LLJJIII("right_container", onLayoutChangeListener);
            return;
        }
        if (!Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_BOTTOM_INTERACT.getInteractName()) || (interactAreaCommonAbilityKp = kp()) == null) {
            return;
        }
        interactAreaCommonAbilityKp.LLJJIII("bottom_container", onLayoutChangeListener);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).T6(i, aweme);
            }
        }
    }

    public final void op(C1005320cGg c1005320cGg, boolean z) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c1005320cGg.LJII);
        if (z) {
            linkedHashMap.put("jump_sdk_enable", "1");
        }
        IGetApps iGetApps = (IGetApps) ServiceManager.get().getService(IGetApps.class);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        iGetApps.LIZ(((VideoItemParams) obj).getAweme(), linkedHashMap, c1005320cGg.LJ, c1005320cGg.LJFF);
        try {
            C1022030chd.LIZJ = c1005320cGg.LJ;
            C1022030chd.LIZLLL = c1005320cGg.LJFF;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1035050d2d interfaceC1035050d2dLIZLLL = C1029590ctp.LIZLLL();
        Context context = getContext();
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        interfaceC1035050d2dLIZLLL.LJJI(context, ((VideoItemParams) obj2).getAweme(), linkedHashMap, c1005320cGg.LJ, c1005320cGg.LJFF);
    }

    @Override // X.InterfaceC1009510cNR
    public final void xk(String str, View.OnLayoutChangeListener onLayoutChangeListener) {
        InteractAreaCommonAbility interactAreaCommonAbilityKp;
        if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_LEFT_INTERACT.getInteractName())) {
            InteractAreaCommonAbility interactAreaCommonAbilityKp2 = kp();
            if (interactAreaCommonAbilityKp2 != null) {
                interactAreaCommonAbilityKp2.xk("left_container", onLayoutChangeListener);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_RIGHT_INTERACT.getInteractName())) {
            InteractAreaCommonAbility interactAreaCommonAbilityKp3 = kp();
            if (interactAreaCommonAbilityKp3 == null) {
                return;
            }
            interactAreaCommonAbilityKp3.xk("right_container", onLayoutChangeListener);
            return;
        }
        if (!Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_BOTTOM_INTERACT.getInteractName()) || (interactAreaCommonAbilityKp = kp()) == null) {
            return;
        }
        interactAreaCommonAbilityKp.xk("bottom_container", onLayoutChangeListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    @Override // X.InterfaceC1009510cNR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zk(X.AbstractC991850bux r16, X.InterfaceC1007930cKt r17) {
        /*
            Method dump skipped, instruction units count: 1631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent.zk(X.0bux, X.0cKt):void");
    }

    public static void sp(IAnoleManager iAnoleManager, String str, Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("update_lynx_global_props", 1);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("component_type", str);
        jSONObject2.put("updated_data", map);
        jSONObject.put("update_lynx_global_props_data", jSONObject2);
        iAnoleManager.LJIIZILJ(new C0SCL(jSONObject));
    }

    @Override // X.InterfaceC1009510cNR
    public final void Ak(long j, String str, String str2, AwS452S0200000_16 awS452S0200000_16) {
        ICommercePhotoModeAbility iCommercePhotoModeAbility = (ICommercePhotoModeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommercePhotoModeAbility.class, null);
        if (iCommercePhotoModeAbility != null) {
            iCommercePhotoModeAbility.np1(new C390801fW(j, str, str2, awS452S0200000_16));
        }
    }

    @Override // com.ss.android.ugc.aweme.api.component.CommerceInteractionAbility
    public final void sQ(String str, String str2, View view, AnoleComponentLayoutModel anoleComponentLayoutModel) {
        Object obj;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        AnoleModel anoleModel;
        Map<String, AnoleComponentRelationModel> map;
        AnoleComponentRelationModel anoleComponentRelationModel;
        List<AnoleComponentAppearModel> list;
        AnoleComponentAppearModel anoleComponentAppearModel;
        List<AnoleComponentBusinessAppearModel> list2;
        ICommerceTransAndCaptionAbility iCommerceTransAndCaptionAbility;
        int iLIZIZ;
        Object obj2;
        AnoleModel anoleModel2;
        Map<String, AnoleComponentRelationModel> map2;
        AnoleComponentRelationModel anoleComponentRelationModel2;
        List<AnoleComponentAppearModel> list3;
        AnoleComponentAppearModel anoleComponentAppearModel2;
        List<AnoleComponentBusinessAppearModel> list4;
        double d;
        ICommerceService iCommerceService;
        IFeedService iFeedServiceLIZIZ;
        Object obj3;
        C0SM6 c0sm6LJJI;
        Object obj4 = null;
        if (Intrinsics.LJFF(str, EnumC696280RSw.FEED_ANOLE_ABOVE_INTERACTIVE_SLOT.getSlotName()) || Intrinsics.LJFF(str, EnumC696280RSw.ANOLE_BELOW_INTERACTIVE_SLOT.getSlotName()) || Intrinsics.LJFF(str, EnumC696280RSw.TT_FEED_BETWEEN_LEFT_RIGHT_INTERACTIVE.getSlotName())) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            if (aweme != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null && (anoleModel = awemeRawAdLJJIJLIJ.getAnoleModel()) != null && (map = anoleModel.componentRelations) != null && (anoleComponentRelationModel = map.get(str2)) != null && (list = anoleComponentRelationModel.showModels) != null && (anoleComponentAppearModel = (AnoleComponentAppearModel) C13LP.LJJJLZIJ(0, list)) != null && (list2 = anoleComponentAppearModel.hideBusinessComponents) != null) {
                Iterator<AnoleComponentBusinessAppearModel> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AnoleComponentBusinessAppearModel next = it2.next();
                    List<String> list5 = next.businessComponents;
                    if (list5 != null && list5.contains(EnumC1009140cMq.ANOLE_LEFT_INTERACT.getInteractName())) {
                        if (next != null && (iCommerceTransAndCaptionAbility = (ICommerceTransAndCaptionAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) != null) {
                            int height = view.getHeight();
                            AnoleComponentLayoutConstraintModel anoleComponentLayoutConstraintModel = anoleComponentLayoutModel.bottomConstraint;
                            if (anoleComponentLayoutConstraintModel != null) {
                                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(anoleComponentLayoutConstraintModel.offset)));
                            } else {
                                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(anoleComponentLayoutModel.bottom)));
                            }
                            iCommerceTransAndCaptionAbility.d52(height + iLIZIZ, str2);
                        }
                    }
                }
            }
            this.LLLIIL.put(str2, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        }
        if (Intrinsics.LJFF(str, EnumC696280RSw.FEED_ANOLE_ABOVE_INTERACTIVE_SLOT.getSlotName())) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            Aweme aweme2 = ((VideoItemParams) obj2).getAweme();
            if (AwemeExtKt.isPhotoMode(aweme2)) {
                String interactName = EnumC1009140cMq.ANOLE_LEFT_INTERACT.getInteractName();
                AwemeRawAd awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme2);
                if (awemeRawAdLJJIJLIJ2 != null && (anoleModel2 = awemeRawAdLJJIJLIJ2.getAnoleModel()) != null && (map2 = anoleModel2.componentRelations) != null && (anoleComponentRelationModel2 = map2.get(str2)) != null && (list3 = anoleComponentRelationModel2.showModels) != null && (anoleComponentAppearModel2 = (AnoleComponentAppearModel) C13LP.LJJJLZIJ(0, list3)) != null && (list4 = anoleComponentAppearModel2.hideBusinessComponents) != null) {
                    for (AnoleComponentBusinessAppearModel anoleComponentBusinessAppearModel : list4) {
                        List<String> list6 = anoleComponentBusinessAppearModel.businessComponents;
                        if (list6 != null && list6.contains(interactName)) {
                            if (anoleComponentBusinessAppearModel != null && C1008980cMa.LIZ(anoleComponentLayoutModel)) {
                                int height2 = view.getHeight();
                                AnoleComponentLayoutConstraintModel anoleComponentLayoutConstraintModel2 = anoleComponentLayoutModel.bottomConstraint;
                                if (anoleComponentLayoutConstraintModel2 != null) {
                                    d = anoleComponentLayoutConstraintModel2.offset;
                                } else {
                                    d = anoleComponentLayoutModel.bottom;
                                }
                                int iLIZIZ2 = height2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(d)));
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("updateIndicatorPosition height: ");
                                sbLIZ.append(iLIZIZ2);
                                C2188811AlT.LIZIZ(sbLIZ);
                                ISlideIndicatorAbility iSlideIndicatorAbility = (ISlideIndicatorAbility) C1558520qew.LIZ(this, ISlideIndicatorAbility.class, null);
                                if (iSlideIndicatorAbility != null) {
                                    iSlideIndicatorAbility.qd0(iLIZIZ2 * (-1.0f));
                                }
                                this.LLLIILIL = str2;
                                if (C288720BTi.LIZ() && (iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null)) != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null) {
                                    Context context = getContext();
                                    C724270Sb3 c724270Sb33 = this.LLJI;
                                    if (c724270Sb33 != null) {
                                        obj3 = c724270Sb33.LL;
                                    } else {
                                        obj3 = null;
                                    }
                                    String str3 = ((VideoItemParams) obj3).mEventType;
                                    C724270Sb3 c724270Sb34 = this.LLJI;
                                    if (c724270Sb34 != null) {
                                        obj4 = c724270Sb34.LL;
                                    }
                                    InterfaceC1008930cMV interfaceC1008930cMVLIZJ = iFeedServiceLIZIZ.LIZJ(context, ((VideoItemParams) obj4).getAweme(), str3, true);
                                    if (interfaceC1008930cMVLIZJ != null && (c0sm6LJJI = interfaceC1008930cMVLIZJ.LJJI()) != null) {
                                        c0sm6LJJI.LIZ(C1009260cN2.LIZ);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }
}
