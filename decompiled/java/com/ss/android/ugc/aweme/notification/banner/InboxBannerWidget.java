package com.ss.android.ugc.aweme.notification.banner;

import X.AbstractC637050Oyl;
import X.AbstractC637410OzL;
import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C0CYL;
import X.C0OPQ;
import X.C0PEM;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1227904rF;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719612Di;
import X.C19719912Dl;
import X.C20554315bp;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C296840BkI;
import X.C452501pT;
import X.C624370OeJ;
import X.C624470OeT;
import X.C636940Oya;
import X.C637060Oym;
import X.C637420OzM;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1599580rjA;
import X.EnumC20654715s1;
import X.EnumC637310OzB;
import X.InterfaceC0148002o;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC625970Ogt;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.fetch.OutreachCategoryParams;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerFrequencyControlData;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol;
import com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxBannerWidgetAbility;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS125S1200000_9;
import kotlin.jvm.internal.AwS49S1300000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class InboxBannerWidget extends InboxWidget implements InterfaceC724530SbT, InboxAbilityCenter$IInboxBannerWidgetAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final Map<C13IQ<? extends InterfaceC1891350zJl>, String> LLJIJIL;
    public final Map<C13IQ<? extends RecyclerView.ViewHolder>, String> LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InboxBannerWidget.class, "inboxBannerViewModel", "getInboxBannerViewModel()Lcom/ss/android/ugc/aweme/notification/banner/InboxBannerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InboxBannerWidget() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InboxBannerViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1361), AFwS240S0000000_9.get$arr$(569), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1360));
        this.LLJI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(265));
        this.LLJIJIL = new LinkedHashMap();
        this.LLJILJIL = new LinkedHashMap();
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJI(this, InboxFragmentScope.class, this, InboxAbilityCenter$IInboxBannerWidgetAbility.class, null, null);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 123923050) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        C624370OeJ.LIZIZ("InboxBannerWidget", "registerModel");
        List<InboxBannerProtocol> listLo = Lo();
        ArrayList arrayList = new ArrayList();
        for (InboxBannerProtocol inboxBannerProtocol : listLo) {
            if (inboxBannerProtocol instanceof InboxBannerCustomProtocol) {
                arrayList.add(inboxBannerProtocol);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((InboxBannerCustomProtocol) it2.next()).LJFF(), arrayList2);
        }
        return C13LP.LJLILLLLZI(C13LE.LIZ(C637060Oym.class), arrayList2);
    }

    public final InboxBannerViewModel No() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (InboxBannerViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() {
        List<OutreachFlowReportItem> listLIZJ;
        StringBuilder sb = new StringBuilder("initializeWidgetData, bannerProtocolList.size = ");
        sb.append(Lo().size());
        sb.append(", bannerProtocolList = ");
        List<InboxBannerProtocol> listLo = Lo();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLo, 10));
        Iterator<InboxBannerProtocol> it2 = listLo.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZLLL().LIZ);
        }
        sb.append(arrayList);
        C624370OeJ.LIZ("InboxBannerWidget", sb.toString());
        C0OPQ.LIZ.getClass();
        C0OPQ.LJIIL("banner_widget_load", null);
        for (InboxBannerProtocol inboxBannerProtocol : Lo()) {
            C723850SaN.LIZJ(this, new AwS49S1300000_9(this, (InboxBannerWidget) null, (InboxBannerInfo) inboxBannerProtocol.LIZJ(), (C13IQ<? extends InboxBannerAssem>) inboxBannerProtocol.LIZLLL().LIZ, (String) 1));
        }
        C296840BkI.LIZ.getClass();
        if (C296840BkI.LIZ()) {
            List<InboxBannerProtocol> listLo2 = Lo();
            ArrayList<InboxBannerCustomProtocol> arrayList2 = new ArrayList();
            for (InboxBannerProtocol inboxBannerProtocol2 : listLo2) {
                if (inboxBannerProtocol2 instanceof InboxBannerCustomProtocol) {
                    arrayList2.add(inboxBannerProtocol2);
                }
            }
            for (InboxBannerCustomProtocol inboxBannerCustomProtocol : arrayList2) {
                Iterator<C13IQ<? extends InterfaceC1891350zJl>> it3 = inboxBannerCustomProtocol.LJFF().iterator();
                while (it3.hasNext()) {
                    this.LLJIJIL.put(it3.next(), inboxBannerCustomProtocol.LIZLLL().LIZ);
                }
                Iterator<C13IQ<? extends RecyclerView.ViewHolder>> it4 = inboxBannerCustomProtocol.LJI().iterator();
                while (it4.hasNext()) {
                    this.LLJILJIL.put(it4.next(), inboxBannerCustomProtocol.LIZLLL().LIZ);
                }
            }
        } else {
            C624370OeJ.LIZ("InboxBannerWidget", "don't need initHistoryBannerAssemMap");
        }
        List<AbstractC738140SxQ> children = getChildren();
        if (children != null) {
            ArrayList<InboxBannerAssem> arrayList3 = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : children) {
                if (abstractC738140SxQ instanceof InboxBannerAssem) {
                    arrayList3.add(abstractC738140SxQ);
                }
            }
            for (InboxBannerAssem inboxBannerAssem : arrayList3) {
                String str = inboxBannerAssem.assemTagInternal;
                if (str != null) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C624470OeT(str, inboxBannerAssem, this, null), 2);
                }
            }
        }
        InboxBannerViewModel inboxBannerViewModelNo = No();
        List<InboxBannerProtocol> listLo3 = Lo();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init, protocolList.size = ");
        sbLIZ.append(listLo3.size());
        C624370OeJ.LIZ("InboxBannerViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Iterator<InboxBannerProtocol> it5 = listLo3.iterator();
        while (it5.hasNext()) {
            inboxBannerViewModelNo.LL.put(it5.next().LIZLLL().LIZ, new Pair<>(EnumC637310OzB.INIT, null));
        }
        if (C0CYL.LIZJ.LJIIIIZZ()) {
            C636940Oya c636940Oya = C636940Oya.LIZ;
            final AwS623S0100000_9 awS623S0100000_9 = new AwS623S0100000_9(inboxBannerViewModelNo, 192);
            c636940Oya.getClass();
            IOutreachFrequency iOutreachFrequency = (IOutreachFrequency) C636940Oya.LIZIZ.getValue();
            if (iOutreachFrequency != null && (listLIZJ = iOutreachFrequency.LIZJ(EnumC20654715s1.INBOX_BANNER.getTypeName())) != null && !listLIZJ.isEmpty()) {
                C1227904rF.LIZ.getClass();
                final String json = GsonProtectorUtils.toJson(new Gson(), C2097608Jq.LJIIJ(new Pair("unrepored_outreach_info_list", GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), listLIZJ))));
                json.toString();
                if (json.length() > 0) {
                    C20554315bp.LIZIZ.LJIIJJI(EnumC20654715s1.INBOX_BANNER, new AbstractC637410OzL() { // from class: X.0OzK
                        @Override // X.AbstractC637410OzL
                        public final OutreachCategoryParams LIZ() {
                            return new OutreachCategoryParams(json, null);
                        }
                    });
                }
            }
            C20554315bp c20554315bp = C20554315bp.LIZIZ;
            EnumC20654715s1 enumC20654715s1 = EnumC20654715s1.INBOX_BANNER;
            c20554315bp.LJIIIIZZ(enumC20654715s1, new AbstractC637050Oyl() { // from class: X.0Oyb
                @Override // X.AbstractC637050Oyl
                public final void LIZ(C20554115bn c20554115bn, String str2, n nVar, Map<String, Object> map) {
                    C636940Oya c636940Oya2 = C636940Oya.LIZ;
                    Function2<InboxBannerInfo, String, Unit> function2 = awS623S0100000_9;
                    c636940Oya2.getClass();
                    C636940Oya.LIZ(c20554115bn, str2, nVar, map, function2);
                }
            });
            c20554315bp.LJ(enumC20654715s1, "enter_inbox_tab", new AbstractC637050Oyl() { // from class: X.0Oyc
                @Override // X.AbstractC637050Oyl
                public final void LIZ(C20554115bn c20554115bn, String str2, n nVar, Map<String, Object> map) {
                    C636940Oya c636940Oya2 = C636940Oya.LIZ;
                    Function2<InboxBannerInfo, String, Unit> function2 = awS623S0100000_9;
                    c636940Oya2.getClass();
                    C636940Oya.LIZ(c20554115bn, str2, nVar, map, function2);
                }
            });
        }
        InboxBannerViewModel inboxBannerViewModelNo2 = No();
        subscribe(inboxBannerViewModelNo2, C736820SvI.LIZIZ(inboxBannerViewModelNo2.usedInReusedScene), null, new AwS623S0100000_9(this, 117));
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0OzA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C637320OzC) obj).LLILLL;
            }
        }, null, new AwS623S0100000_9(this, 118), 6);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxBannerWidgetAbility
    public final void yL1() {
        C624370OeJ.LIZ("InboxBannerWidget", "notifyDMGroupBannerDismiss");
        No().LLILLL = true;
        No().xQ2();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        List<InterfaceC1891350zJl> listSingletonList;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("provideDataList, state = ");
        sbLIZ.append(No().getState().LLILLJJLI);
        C624370OeJ.LIZIZ("InboxBannerWidget", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1891350zJl interfaceC1891350zJl = No().getState().LLILLJJLI;
        return (interfaceC1891350zJl == null || (listSingletonList = Collections.singletonList(interfaceC1891350zJl)) == null) ? C13BV.INSTANCE : listSingletonList;
    }

    public final List<InboxBannerProtocol> Lo() {
        String str;
        Long lLJIILIIL;
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), InboxBannerProtocol.class, false);
        if (listLIZIZ == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLIZIZ) {
            InboxBannerProtocol inboxBannerProtocol = (InboxBannerProtocol) obj;
            if (((List) this.LLJ.getValue()).contains(inboxBannerProtocol.LIZLLL().LIZ)) {
                String str2 = inboxBannerProtocol.LIZLLL().LIZ;
                InboxBannerFrequencyControlData inboxBannerFrequencyControlDataLJ = inboxBannerProtocol.LJ();
                if (inboxBannerFrequencyControlDataLJ != null) {
                    String[] strArrLJI = ((InterfaceC625970Ogt) this.LLJI.getValue()).LJI(str2, new String[0]);
                    List listLJLI = strArrLJI != null ? C13LQ.LJLI(strArrLJI) : new ArrayList();
                    int size = listLJLI.size();
                    int i = inboxBannerFrequencyControlDataLJ.timesEveryRound;
                    if (size < inboxBannerFrequencyControlDataLJ.rounds * i) {
                        if (size >= i && (str = (String) C13LP.LJJJLZIJ(size - i, listLJLI)) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                            if (System.currentTimeMillis() - lLJIILIIL.longValue() >= inboxBannerFrequencyControlDataLJ.roundSpan * LSPassThroughRecordSizeConfig.DEFAULT) {
                            }
                        }
                    }
                }
                if (inboxBannerProtocol.LIZ()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final InboxBannerAssem Ho(String str) {
        AbstractC738140SxQ abstractC738140SxQ;
        AbstractC738140SxQ next;
        List<AbstractC738140SxQ> children = getChildren();
        if (children != null) {
            Iterator<AbstractC738140SxQ> it2 = children.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.assemTagInternal, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            abstractC738140SxQ = next;
        } else {
            abstractC738140SxQ = null;
        }
        if (!(abstractC738140SxQ instanceof InboxBannerAssem)) {
            return null;
        }
        return (InboxBannerAssem) abstractC738140SxQ;
    }

    public final InboxBannerCustomAssem Jo(RecyclerView.ViewHolder viewHolder) {
        String str = (String) ((LinkedHashMap) this.LLJILJIL).get(C13LE.LIZ(viewHolder.getClass()));
        if (str != null) {
            InboxBannerAssem inboxBannerAssemHo = Ho(str);
            if (inboxBannerAssemHo instanceof InboxBannerCustomAssem) {
                return (InboxBannerCustomAssem) inboxBannerAssemHo;
            }
            return null;
        }
        return null;
    }

    public final void Oo(String str) {
        List arrayList;
        String[] strArrLJI = ((InterfaceC625970Ogt) this.LLJI.getValue()).LJI(str, new String[0]);
        if (strArrLJI != null) {
            arrayList = C13LQ.LJLI(strArrLJI);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.add(String.valueOf(System.currentTimeMillis()));
        if (arrayList.size() > 100) {
            ListProtector.remove(arrayList, 0);
        }
        ((InterfaceC625970Ogt) this.LLJI.getValue()).LJII(str, (String[]) arrayList.toArray(new String[0]));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void vo(EnumC1599580rjA enumC1599580rjA) {
        if (enumC1599580rjA == EnumC1599580rjA.PULL_TO_REFRESH) {
            InboxBannerViewModel inboxBannerViewModelNo = No();
            inboxBannerViewModelNo.LLILZIL = false;
            inboxBannerViewModelNo.LLILZ.clear();
        }
        List<AbstractC738140SxQ> children = getChildren();
        if (children != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : children) {
                if (abstractC738140SxQ instanceof InboxBannerAssem) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InboxBannerAssem) it2.next()).bo(enumC1599580rjA);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void xo(RecyclerView.ViewHolder viewHolder) {
        C637420OzM c637420OzM;
        C637060Oym c637060Oym;
        String str;
        InboxBannerAssem inboxBannerAssemHo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewHolderAttachedToWindow, holder = ");
        sbLIZ.append(C13LE.LIZ(viewHolder.getClass()));
        C624370OeJ.LIZIZ("InboxBannerWidget", C2188811AlT.LIZIZ(sbLIZ));
        InboxBannerCustomAssem inboxBannerCustomAssemJo = Jo(viewHolder);
        if (inboxBannerCustomAssemJo != null) {
            inboxBannerCustomAssemJo.lo(viewHolder);
            String str2 = inboxBannerCustomAssemJo.assemTagInternal;
            if (str2 != null) {
                InboxBannerViewModel inboxBannerViewModelNo = No();
                AwS125S1200000_9 awS125S1200000_9 = new AwS125S1200000_9(inboxBannerCustomAssemJo, str2, this, 1);
                synchronized (inboxBannerViewModelNo) {
                    if (inboxBannerViewModelNo.LLILZ.contains(str2)) {
                        return;
                    }
                    inboxBannerViewModelNo.LLILZ.add(str2);
                    awS125S1200000_9.invoke();
                    return;
                }
            }
            return;
        }
        if ((viewHolder instanceof C637420OzM) && (c637420OzM = (C637420OzM) viewHolder) != null && (c637060Oym = c637420OzM.LLIZLLLIL) != null && (str = c637060Oym.LL) != null && (inboxBannerAssemHo = Ho(str)) != null) {
            C637060Oym c637060Oym2 = ((C637420OzM) viewHolder).LLIZLLLIL;
            if (c637060Oym2 != null) {
                inboxBannerAssemHo.mo243do(c637060Oym2);
            }
            No().yQ2(str, new AwS125S1200000_9(inboxBannerAssemHo, str, this, 2));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void yo(RecyclerView.ViewHolder viewHolder) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewHolderDetachedFromWindow, holder = ");
        sbLIZ.append(C13LE.LIZ(viewHolder.getClass()));
        C624370OeJ.LIZIZ("InboxBannerWidget", C2188811AlT.LIZIZ(sbLIZ));
        InboxBannerCustomAssem inboxBannerCustomAssemJo = Jo(viewHolder);
        if (inboxBannerCustomAssemJo != null) {
            inboxBannerCustomAssemJo.mo(viewHolder);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final RecyclerView.ViewHolder uo(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        InboxBannerCustomAssem inboxBannerCustomAssem;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateViewHolder, modelClass = ");
        sbLIZ.append(c13iq);
        C624370OeJ.LIZIZ("InboxBannerWidget", C2188811AlT.LIZIZ(sbLIZ));
        String str = (String) ((LinkedHashMap) this.LLJIJIL).get(c13iq);
        if (str != null) {
            InboxBannerAssem inboxBannerAssemHo = Ho(str);
            if ((inboxBannerAssemHo instanceof InboxBannerCustomAssem) && (inboxBannerCustomAssem = (InboxBannerCustomAssem) inboxBannerAssemHo) != null) {
                return inboxBannerCustomAssem.ko(viewGroup, c13iq);
            }
        }
        if (!Intrinsics.LJFF(c13iq, C13LE.LIZ(C637060Oym.class))) {
            return null;
        }
        int i = C637420OzM.LLJIJIL;
        return new C637420OzM(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_x, viewGroup, false));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void so(RecyclerView.ViewHolder viewHolder, InterfaceC1891350zJl interfaceC1891350zJl, int i) {
        InboxBannerCustomAssem inboxBannerCustomAssem;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindViewHolder, itemData = ");
        sbLIZ.append(C13LE.LIZ(interfaceC1891350zJl.getClass()));
        C624370OeJ.LIZIZ("InboxBannerWidget", C2188811AlT.LIZIZ(sbLIZ));
        String str = (String) ((LinkedHashMap) this.LLJIJIL).get(C13LE.LIZ(interfaceC1891350zJl.getClass()));
        if (str != null) {
            InboxBannerAssem inboxBannerAssemHo = Ho(str);
            if ((inboxBannerAssemHo instanceof InboxBannerCustomAssem) && (inboxBannerCustomAssem = (InboxBannerCustomAssem) inboxBannerAssemHo) != null) {
                inboxBannerCustomAssem.ho(viewHolder, interfaceC1891350zJl, i);
            }
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
