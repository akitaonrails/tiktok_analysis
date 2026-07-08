package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C086I;
import X.C09R7;
import X.C0B8S;
import X.C0HHT;
import X.C0QSJ;
import X.C0RDX;
import X.C0RJE;
import X.C0RK8;
import X.C0RK9;
import X.C0RKA;
import X.C0RKB;
import X.C0RKJ;
import X.C0RKW;
import X.C0RKZ;
import X.C0RL2;
import X.C0RP5;
import X.C0RQ6;
import X.C0RQN;
import X.C0RQO;
import X.C0RUJ;
import X.C0RW1;
import X.C0RW2;
import X.C0RW3;
import X.C0RW4;
import X.C0RW7;
import X.C0RW8;
import X.C0RWA;
import X.C0RWC;
import X.C0RWD;
import X.C0RWE;
import X.C0RWF;
import X.C0RWG;
import X.C0RWH;
import X.C0RWL;
import X.C0RWM;
import X.C0RWR;
import X.C0RWX;
import X.C0RWZ;
import X.C0RYM;
import X.C0RYN;
import X.C0SFC;
import X.C0T6L;
import X.C1019620cdk;
import X.C1367960lha;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C1EE2;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C2277711EDh;
import X.C2765015f;
import X.C281310B0v;
import X.C283300B8m;
import X.C287400BOg;
import X.C300390Bq1;
import X.C452501pT;
import X.C578570Mmd;
import X.C673150Qan;
import X.C687700QyG;
import X.C690300R5w;
import X.C690870R8b;
import X.C693590RIn;
import X.C693650RIt;
import X.C693690RIx;
import X.C693700RIy;
import X.C693960RJy;
import X.C693970RJz;
import X.C694000RKc;
import X.C694040RKg;
import X.C694180RKu;
import X.C697110RWb;
import X.C697160RWg;
import X.C697210RWl;
import X.C697770RYp;
import X.C697790RYr;
import X.C699500RcC;
import X.C700120RdC;
import X.C700450Rdj;
import X.C700950ReX;
import X.C705800RmM;
import X.C715260S3w;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C729980SkG;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C748302w5;
import X.C748402w6;
import X.C786410Ut5;
import X.EnumC697290RWt;
import X.EnumC697300RWu;
import X.EnumC697820RYu;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC691660RBc;
import X.InterfaceC697220RWm;
import X.InterfaceC697230RWn;
import X.InterfaceC697420RXg;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.InterfaceC702410Rgt;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS80S0200000_11;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService;
import com.ss.android.ugc.aweme.feed.adapter.AvoidUpvoteViewModel;
import com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagTrigger;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagTriggerForVideoTagContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.HybridLabelTagType;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedCreativeLivePhotoTagTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedCreativeLivePhotoTriggerForVideoTagContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedDMSharedTagTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedDMSharedTagTriggerV2;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedLiveRelatedTagTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedLiveRelatedTagTriggerV2;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedMusicFanSpotlightTagTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedMusicFanSpotlightTagTriggerV2;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedReconsumptionTagTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedReconsumptionTagTriggerV2;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialMafTagTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialMafTagTriggerV2;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialPrivacyTagTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialPrivacyTagTriggerV2;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialRelationTagTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialRelationTagTriggerV2;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialTagViewModel;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialTextViewTagTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialTextViewTagTriggerV2;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedUrlTriggerTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedUrlTriggerTriggerV2;
import com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.ss.android.ugc.feed.platform.container.protocol.priority.CategoryPriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import com.ss.android.ugc.feed.platform.container.scope.VideoTagComponentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS170S0400000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS96S1000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoTagContainer extends BaseContainer<VideoTagCategoryProtocol, VideoTagContainer> implements CategoryPriorityAbility, InteractVideoTagAbility, FcpNodeProtocol, C0RUJ, C0RYM, InterfaceC702410Rgt, C0RQO, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final C690300R5w LLLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJIL;
    public static final int LLLJL;
    public static final int LLLL;
    public boolean LLJLLIL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final InterfaceC1731706qJ LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public C0RKW LLLIIIIL;
    public C0RKW LLLIIIL;
    public final C0RQ6 LLLIIL;
    public final Map<String, C0RWZ> LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public volatile FcpProtocolAbility LLLILZJ;
    public InterfaceC665370Q7z LLLILZLLLI;
    public C0QSJ LLLIZZ;
    public final /* synthetic */ C693650RIt LLJL = new C693650RIt();
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C0RWA());
    public final Set<AbsComponentTrigger> LLJLILLLLZIIL = new LinkedHashSet();
    public final AtomicBoolean LLJLL = new AtomicBoolean(true);
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(263));
    public final C01GW LLJZ = C452501pT.LIZIZ(new C0RKB(this));
    public final C01GW LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C0RWF());
    public final C01GW LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), new C0RWD());

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0R5w] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoTagContainer.class, "videoTagVM", "getVideoTagVM()Lcom/ss/android/ugc/feed/platform/cell/interact/info/horiontag/tag/FeedSocialTagViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(VideoTagContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0), new C2217381BqS(VideoTagContainer.class, "avoidUpvoteVM", "getAvoidUpvoteVM()Lcom/ss/android/ugc/aweme/feed/adapter/AvoidUpvoteViewModel;", 0), new C2217381BqS(VideoTagContainer.class, "fcpProtocolAbility", "getFcpProtocolAbility()Lcom/ss/android/ugc/feed/platform/cell/interact/FcpProtocolAbility;", 0)};
        LLLJ = new Object() { // from class: X.0R5w
        };
        LLLJL = R.id.emn;
        LLLL = R.id.emo;
    }

    public VideoTagContainer() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSocialTagViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new C0RK8(c19719912DlLIZ), null, new C0RWH());
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ConstraintSizeVM.class);
        this.LLLFF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new C0RK9(c19719912DlLIZ2), null, new C0RWE());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(AvoidUpvoteViewModel.class);
        this.LLLFFI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c0hht, c1637906bB, new C0RKA(c19719912DlLIZ3), null, new C0RWL());
        this.LLLFZ = C452501pT.LIZIZ(new C0RW7(this));
        this.LLLI = C452501pT.LIZIZ(new C0RWX(this));
        this.LLLII = C452501pT.LIZIZ(new C0RL2(this));
        this.LLLIIII = C452501pT.LIZIZ(new C0RP5(this));
        this.LLLIIL = C0RQ6.VIDEO_TAG_CONTAINER;
        this.LLLIILIL = new LinkedHashMap();
        this.LLLIL = C452501pT.LIZIZ(new C0RWC(this));
        this.LLLILZ = C452501pT.LIZIZ(new C0RWG(this));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "main_tag";
    }

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return "main_tag";
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "main_tag";
    }

    @Override // X.C0RYM
    public final void a4() {
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoTagComponentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CellInteractAreaScope.class);
        arrayList.add(VideoTagComponentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoTagComponentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC702410Rgt
    public final void hl() {
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void nw0(PriorityProtocol priorityProtocol, boolean z) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -556512712 || iHashCode == 136784447) {
            return this;
        }
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    public final VideoTagContainer$lowTagComponentProtocol$2$1 Ap() {
        return (VideoTagContainer$lowTagComponentProtocol$2$1) this.LLLIL.getValue();
    }

    public final C697210RWl Bp() {
        return (C697210RWl) this.LLLI.getValue();
    }

    public final FeedSocialTagViewModel Ep() {
        return (FeedSocialTagViewModel) this.LLLF.getValue(this, LLLJIL[0]);
    }

    public final boolean Fp() {
        return ((Boolean) this.LLJLIL.getValue()).booleanValue();
    }

    @Override // X.C0RQO
    public final String Ig() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C0RQN.LIZIZ(c724270Sb3 != null ? c724270Sb3.LL : null, jm());
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.CategoryPriorityAbility
    public final Map<String, String> k22() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strH3 = Ap().H3();
        if (strH3 != null && strH3.length() != 0) {
            linkedHashMap.put("low_tag", strH3);
        }
        String strH32 = yp().H3();
        if (strH32 != null && strH32.length() != 0) {
            linkedHashMap.put("high_tag", strH32);
        }
        return linkedHashMap;
    }

    public final ViewGroup op() {
        int i = LLLL;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        C705800RmM c705800RmM = new C705800RmM(LJJIJL().getContext());
        c705800RmM.setId(i);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c705800RmM);
        c705800RmM.setLayoutParams(marginLayoutParams);
        this.LLLFF.getValue(this, LLLJIL[1]).getClass();
        ConstraintSizeVM.zQ2(c705800RmM);
        return c705800RmM;
    }

    public final C0RWM tp() {
        return (C0RWM) this.LLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility
    public final ComponentPriorityProtocol u9() {
        return new ComponentPriorityProtocol() { // from class: com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer$getAreaContainerAsProtocol$1
            @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
            public final void Bh2(boolean z) {
            }

            @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
            public final String H3() {
                return "main_tag";
            }

            @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
            public final C699500RcC II() {
                return null;
            }

            @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
            public final boolean PT1() {
                return false;
            }

            @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
            public final boolean Qm0() {
                return false;
            }

            @Override // X.C0RJL
            public final boolean oh() {
                return false;
            }

            @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
            public final C700450Rdj vN0() {
                return null;
            }

            @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
            public final InterfaceC701260Rf2 vk() {
                return null;
            }

            @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
            public final InterfaceC700000Rd0 wb1() {
                return null;
            }

            @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
            public final View xb() {
                return this.LL.LJJIJL();
            }

            @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
            public final String LLLII() {
                return C694180RKu.LIZ(this);
            }
        };
    }

    public final VideoTagContainer$highTagComponentProtocol$2$1 yp() {
        return (VideoTagContainer$highTagComponentProtocol$2$1) this.LLLILZ.getValue();
    }

    public final InteractAreaCommonAbility zp() {
        return (InteractAreaCommonAbility) this.LLJZ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.CategoryPriorityAbility
    public final Map<String, List<String>> DL() {
        Map<String, Map<String, PriorityProtocol>> mapLIZJ = Bp().LIZJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLIZJ.size()));
        Iterator<T> it2 = mapLIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), C13LP.LLIIII(((Map) entry.getValue()).keySet()));
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, X.C03H8
    public final ViewGroup LJJIJL() {
        return (ViewGroup) LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        long jLJFF = C0RQN.LJFF();
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONUNSELECTED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility
    public final void MO2() {
        InteractAreaCommonAbility interactAreaCommonAbilityZp;
        InteractAreaCommonAbility interactAreaCommonAbilityZp2;
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (C700120RdC.LIZ((String) this.LLLII.getValue())) {
            String strH3 = Ap().H3();
            if (strH3 != null && strH3.length() != 0 && (interactAreaCommonAbilityZp2 = zp()) != null) {
                interactAreaCommonAbilityZp2.Mr2(Ap());
            }
            String strH32 = yp().H3();
            if (strH32 == null || strH32.length() == 0 || (interactAreaCommonAbilityZp = zp()) == null) {
                return;
            }
            interactAreaCommonAbilityZp.Mr2(yp());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        long jLJFF = C0RQN.LJFF();
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONPARENTSET, jLJFF);
        }
    }

    public final void sp() {
        tp().LIZ = true;
        if (tp().LIZIZ || !C0B8S.LIZ()) {
            tp().LIZJ = true;
            long jLJFF = C0RQN.LJFF();
            C694040RKg.LIZ(this, true, new C694000RKc(this, null));
            Iterator<T> it2 = Bp().LIZIZ().values().iterator();
            while (it2.hasNext()) {
                ((InterfaceC697230RWn) it2.next()).ss(true);
            }
            if (C715260S3w.LIZJ()) {
                C0RQN.LIZLLL(this, EnumC697300RWu.M_DECISION_TRIGGER, jLJFF);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        long jLJFF = C0RQN.LJFF();
        if (Fp()) {
            this.LLJLL.set(true);
        }
        this.LLJLLIL = false;
        tp().LIZIZ = false;
        tp().LIZJ = false;
        tp().LIZ = false;
        Bp().reset();
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_UNBIND, jLJFF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[Catch: all -> 0x003c, PHI: r1
      0x0030: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:10:0x0012, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:7:0x000c, B:9:0x0010, B:11:0x0014, B:13:0x0018, B:14:0x001e, B:18:0x0038, B:19:0x003a, B:17:0x0030), top: B:42:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData up() {
        /*
            r5 = this;
            boolean r0 = X.C299830Bp7.LIZ()
            r4 = 0
            if (r0 == 0) goto L61
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = r5.LLLILZJ
            if (r0 != 0) goto L40
            monitor-enter(r5)
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = r5.LLLILZJ     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L3f
            X.0QSJ r1 = r5.LLLIZZ     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L30
            X.0Q7z r3 = r5.LLLILZLLLI     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L1e
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r5)     // Catch: java.lang.Throwable -> L3c
            r5.LLLILZLLLI = r3     // Catch: java.lang.Throwable -> L3c
        L1e:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope> r1 = com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3c
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3c
            r5.LLLIZZ = r1     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L30
            r0 = r4
            goto L38
        L30:
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility> r0 = com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3c
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = (com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility) r0     // Catch: java.lang.Throwable -> L3c
        L38:
            r5.LLLILZJ = r0     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            goto L45
        L3c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L3f:
            monitor-exit(r5)
        L40:
            X.0RKW r0 = r0.qR1()
            goto L48
        L45:
            if (r0 != 0) goto L40
            r0 = r4
        L48:
            r5.LLLIIIIL = r0
            if (r0 == 0) goto L53
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r0 = r0.LIZ()
            if (r0 == 0) goto L53
            return r0
        L53:
            X.0RKW r0 = X.C697660RYe.LIZIZ(r5)
            r5.LLLIIIL = r0
            if (r0 == 0) goto L60
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r4 = r0.LIZ()
            return r4
        L60:
            return r4
        L61:
            X.0RKW r0 = X.C697660RYe.LIZIZ(r5)
            r5.LLLIIIL = r0
            if (r0 == 0) goto L6d
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r4 = r0.LIZ()
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer.up():com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return this.LLLIIL;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void Pq1(PriorityProtocol priorityProtocol) {
        C697210RWl c697210RWlBp = Bp();
        String str = c697210RWlBp.LIZ().get(priorityProtocol.zg());
        if (str != null) {
            InterfaceC697230RWn interfaceC697230RWn = c697210RWlBp.LIZIZ().get(str);
            if (interfaceC697230RWn != null) {
                interfaceC697230RWn.ms(priorityProtocol, true);
            }
            if (c697210RWlBp.LIZ().containsKey(priorityProtocol.zg())) {
                c697210RWlBp.LIZ().remove(priorityProtocol.zg());
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void VA2(boolean z) {
        Bp().LJ(z);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        long jLJFF = C0RQN.LJFF();
        Boolean boolValueOf = Boolean.valueOf(!C1019620cdk.LIZIZ(3, videoItemParams.getAweme()));
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ISACTIVE, jLJFF);
        }
        if (!(boolValueOf instanceof Boolean) || boolValueOf == null) {
            return true;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* JADX INFO: renamed from: ip */
    public final void tp(VideoItemParams videoItemParams) {
        boolean z;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeTextLabelModel label;
        List<AwemeTextLabelModel> list;
        long jLJFF = C0RQN.LJFF();
        C697790RYr c697790RYr = C697790RYr.LIZ;
        String aid = videoItemParams.getAweme().getAid();
        String start = EnumC697290RWt.P_TAG_CREATE.getStart();
        EnumC697820RYu enumC697820RYu = EnumC697820RYu.PUTIFABSENT;
        c697790RYr.getClass();
        C697790RYr.LIZJ(aid, start, null, enumC697820RYu, null, null);
        C2765015f.LIZJ("VideoTagContainer.onBind", new C0RW8(videoItemParams, this));
        this.LLJJLIIIJLLLLLLLZ = videoItemParams;
        FeedSocialTagViewModel feedSocialTagViewModelEp = Ep();
        feedSocialTagViewModelEp.getClass();
        Aweme aweme = videoItemParams.getAweme();
        List<AwemeLabelModel> videoLabels = aweme.getVideoLabels();
        if (!C086I.LIZIZ(videoLabels)) {
            for (int i = 0; i < videoLabels.size(); i++) {
                AwemeLabelModel awemeLabelModel = (AwemeLabelModel) ListProtector.get(videoLabels, i);
                if (awemeLabelModel != null && awemeLabelModel.getLabelType() == 1 && !C729980SkG.LJIIIIZZ(aweme) && AwemeExtKt.getStatusSafety(aweme) != null && AwemeExtKt.isPrivate(aweme)) {
                    videoLabels.remove(awemeLabelModel);
                }
            }
        }
        if (aweme.isAd() && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && !awemeRawAd2.isRightStyle() && (awemeRawAd3 = aweme.getAwemeRawAd()) != null && (label = awemeRawAd3.getLabel()) != null && (list = aweme.textVideoLabels) != null) {
            list.add(label);
        }
        if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAdTagPosition() == 1) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (!z && aweme.getRelationLabel() != null) {
            RelationDynamicLabel relationLabel = aweme.getRelationLabel();
            if (relationLabel != null) {
                if (relationLabel.getType() == 0 && Intrinsics.LJFF(feedSocialTagViewModelEp.eventType, "homepage_familiar")) {
                    aweme.setRelationLabel(null);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (!C0B8S.LIZ()) {
            if (this.LLJLL.compareAndSet(true, false)) {
                if (C287400BOg.LIZ()) {
                    if (this.LLJLLIL) {
                        C724270Sb3 c724270Sb3 = this.LLJI;
                        if (c724270Sb3 != null) {
                            obj = c724270Sb3.LL;
                        }
                        if (AwemeBizExtKt.getAwemePosition(((VideoItemParams) obj).getAweme()) == 0 || ((Boolean) C283300B8m.LIZ.getValue()).booleanValue()) {
                            sp();
                        }
                    }
                } else {
                    C694040RKg.LIZ(this, true, new C694000RKc(this, null));
                    sp();
                }
            }
        } else if ((tp().LIZ && !tp().LIZJ) || (tp().LIZIZ && !tp().LIZJ)) {
            sp();
        }
        C2765015f.LIZ("VideoTagContainer.onBind", new AwS412S0200000_11(videoItemParams, this, 42));
        C697790RYr c697790RYr2 = C697790RYr.LIZ;
        String aid2 = videoItemParams.getAweme().getAid();
        String end = EnumC697290RWt.P_TAG_CREATE.getEnd();
        c697790RYr2.getClass();
        C697790RYr.LIZJ(aid2, end, null, null, null, null);
        tp().LIZIZ = true;
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONBIND, jLJFF);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) throws IllegalAccessException, InstantiationException {
        Boolean boolValueOf;
        Unit unit;
        InterfaceC697420RXg interfaceC697420RXgRc1;
        long jLJFF = C0RQN.LJFF();
        C2765015f.LIZJ("VideoTagContainer.onViewCreated", new C693690RIx(this));
        super.onViewCreated(view);
        final C697210RWl c697210RWlBp = Bp();
        ViewGroup viewGroup = (ViewGroup) LJJIJL();
        final C0RW2 c0rw2 = new C0RW2(this);
        c697210RWlBp.LLIZLLLIL = viewGroup;
        c697210RWlBp.LLIZ = c0rw2;
        c697210RWlBp.LLJIJIL.observe(c0rw2.LIZJ, new Observer() { // from class: X.0RWe
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String strZg;
                CopyOnWriteArrayList<PriorityProtocol> copyOnWriteArrayList = (CopyOnWriteArrayList) obj;
                String str = null;
                if (copyOnWriteArrayList != null) {
                    String strLIZIZ = "";
                    for (PriorityProtocol priorityProtocol : copyOnWriteArrayList) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append(", ");
                        if (priorityProtocol != null) {
                            strZg = priorityProtocol.zg();
                        } else {
                            strZg = null;
                        }
                        sbLIZ.append(strZg);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    str = strLIZIZ;
                }
                c0rw2.LIZJ().getAweme().getAid();
                new C20515081x(str, copyOnWriteArrayList);
                C0T6L.LIZLLL();
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() >= c697210RWlBp.LIZIZ().keySet().size()) {
                    if (!c697210RWlBp.LLILZ) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", c0rw2.LIZIZ());
                        c2344009Gk.LJIIIIZZ("group_id", c0rw2.LIZJ().getAweme().getAid());
                        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(c0rw2.LIZJ().getAweme()));
                        c2344009Gk.LIZJ(c0rw2.LIZJ().getAweme().getAwemeType(), "aweme_type");
                        C20684815ws.LJIILLIIL("state_core_fdmt_video_tag", c2344009Gk.LIZ);
                    }
                    final List listLJJJJI = C13LP.LJJJJI(C13LP.LJJJJLI(copyOnWriteArrayList));
                    Handler handlerLIZIZ = C799570VYd.LIZIZ();
                    final InterfaceC697120RWc interfaceC697120RWc = c0rw2;
                    C786410Ut5.LJL(handlerLIZIZ, new Runnable() { // from class: X.0RWd
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("MultiPriorityMaker@8eb9.attach$1$2");
                            try {
                                interfaceC697120RWc.LIZ(listLJJJJI);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("MultiPriorityMaker@8eb9.attach$1$2");
                        }
                    });
                }
            }
        });
        Iterator<Map.Entry<String, InterfaceC697230RWn>> it2 = Bp().LIZIZ().entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().qs();
        }
        C697210RWl c697210RWlBp2 = Bp();
        for (Map.Entry<String, InterfaceC697230RWn> entry : c697210RWlBp2.LIZIZ().entrySet()) {
            InterfaceC697220RWm interfaceC697220RWmRs = entry.getValue().rs();
            IFcpPolicyAbility iFcpPolicyAbility = c697210RWlBp2.LLILZLL;
            if (iFcpPolicyAbility != null && (interfaceC697420RXgRc1 = iFcpPolicyAbility.rc1()) != null) {
                interfaceC697420RXgRc1.LIZ().invoke(new C697160RWg(c697210RWlBp2, interfaceC697220RWmRs, entry));
            }
        }
        HandlerHook.viewPost(LJJIJL(), new ARunnableS111S0100000_11(this, 81));
        C697770RYp c697770RYp = C697770RYp.LIZ;
        String str = (String) this.LLLII.getValue();
        C0RYN c0ryn = new C0RYN(this);
        C693970RJz c693970RJz = new C693970RJz(this);
        c697770RYp.getClass();
        if (!C0RKZ.LIZ(str)) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            if (!C300390Bq1.LIZ()) {
                if (!C281310B0v.LIZ()) {
                    C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(new FeedStoryTagTrigger()));
                }
                if (!C281310B0v.LIZ() || jm().LIZ != 1) {
                    C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> c13iqLJJL = C1EE2.LIZIZ.LJJL();
                    if (c13iqLJJL != null) {
                        Object objNewInstance = C09R7.LIZ(c13iqLJJL).newInstance();
                        if ((objNewInstance instanceof VideoTagCategoryProtocol) && objNewInstance != null) {
                            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(objNewInstance));
                        }
                    }
                    C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> c13iqLIZIZ = C0RKJ.LIZIZ.LIZIZ();
                    if (c13iqLIZIZ != null) {
                        Object objNewInstance2 = C09R7.LIZ(c13iqLIZIZ).newInstance();
                        if ((objNewInstance2 instanceof VideoTagCategoryProtocol) && objNewInstance2 != null) {
                            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(objNewInstance2));
                        }
                    }
                    C578570Mmd.LIZ.getClass();
                    if (C578570Mmd.LIZ()) {
                        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(new FeedCreativeLivePhotoTagTrigger()));
                    }
                }
            }
            List<VideoTagCategoryProtocol> listLJJI = C2277711EDh.LIZIZ.LJJI();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJI, 10));
            for (VideoTagCategoryProtocol videoTagCategoryProtocol : listLJJI) {
                if (videoTagCategoryProtocol != null) {
                    C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(videoTagCategoryProtocol));
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                arrayList.add(unit);
            }
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(new FeedSocialPrivacyTagTrigger()));
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(new FeedSocialRelationTagTrigger()));
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(new FeedSocialMafTagTrigger()));
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(new FeedSocialTextViewTagTrigger()));
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(new FeedUrlTriggerTrigger()));
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(new FeedDMSharedTagTrigger()));
            Object objLJJI = C0SFC.LIZIZ.LJJI();
            if ((objLJJI instanceof VideoTagCategoryProtocol) && objLJJI != null) {
                C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(objLJJI));
            }
            C1367960lha.LIZ.getClass();
            VideoTagCategoryProtocol poiTagTrigger = C1367960lha.LIZ().getPoiTagTrigger();
            if (poiTagTrigger != null) {
                C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(poiTagTrigger));
            }
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(new FeedMusicFanSpotlightTagTrigger()));
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(new FeedReconsumptionTagTrigger()));
            VideoTagCategoryProtocol videoTagCategoryProtocolLJIIJJI = ((IEcommerceAnchorOuterService) ServiceManager.get().getService(IEcommerceAnchorOuterService.class)).LJIIJJI();
            if (videoTagCategoryProtocolLJIIJJI != null) {
                C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(videoTagCategoryProtocolLJIIJJI));
            }
            VideoTagCategoryProtocol videoTagCategoryProtocolLJIIIIZZ = ((IEcommerceAnchorOuterService) ServiceManager.get().getService(IEcommerceAnchorOuterService.class)).LJIIIIZZ();
            if (videoTagCategoryProtocolLJIIIIZZ != null) {
                C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(videoTagCategoryProtocolLJIIIIZZ));
            }
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(new FeedLiveRelatedTagTrigger()));
            if (C748402w6.LIZ()) {
                C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(new FcpHighTagAssem(new C748302w5(c0ryn), ((InterfaceC697230RWn) C2097608Jq.LJFF("high_tag", Bp().LIZIZ())).rs(), c693970RJz)));
            }
        } else {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
            C690870R8b c690870R8bJm = jm();
            ArrayList arrayList2 = new ArrayList();
            if (!C300390Bq1.LIZ()) {
                if (!C281310B0v.LIZ()) {
                    arrayList2.add(new FeedStoryTagTriggerForVideoTagContainer());
                }
                if (!C281310B0v.LIZ() || c690870R8bJm.LIZ != 1) {
                    C13IQ<?> c13iqLJIIL = C1EE2.LIZIZ.LJIIL();
                    if (c13iqLJIIL != null) {
                        Object objNewInstance3 = C09R7.LIZ(c13iqLJIIL).newInstance();
                        if ((objNewInstance3 instanceof VideoTagCategoryProtocol) && objNewInstance3 != null) {
                            arrayList2.add(objNewInstance3);
                        }
                    }
                    C13IQ<?> c13iqLIZ = C0RKJ.LIZIZ.LIZ();
                    if (c13iqLIZ != null) {
                        Object objNewInstance4 = C09R7.LIZ(c13iqLIZ).newInstance();
                        if ((objNewInstance4 instanceof VideoTagCategoryProtocol) && objNewInstance4 != null) {
                            arrayList2.add(objNewInstance4);
                        }
                    }
                    C578570Mmd.LIZ.getClass();
                    if (C578570Mmd.LIZ()) {
                        arrayList2.add(new FeedCreativeLivePhotoTriggerForVideoTagContainer());
                    }
                }
            }
            List<VideoTagCategoryProtocol> listLJJIIZI = C2277711EDh.LIZIZ.LJJIIZI();
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJIIZI, 10));
            for (VideoTagCategoryProtocol videoTagCategoryProtocol2 : listLJJIIZI) {
                if (videoTagCategoryProtocol2 != null) {
                    boolValueOf = Boolean.valueOf(arrayList2.add(videoTagCategoryProtocol2));
                } else {
                    boolValueOf = null;
                }
                arrayList3.add(boolValueOf);
            }
            arrayList2.add(new FeedSocialPrivacyTagTriggerV2());
            arrayList2.add(new FeedSocialRelationTagTriggerV2());
            arrayList2.add(new FeedSocialMafTagTriggerV2());
            arrayList2.add(new FeedSocialTextViewTagTriggerV2());
            arrayList2.add(new FeedUrlTriggerTriggerV2());
            arrayList2.add(new FeedDMSharedTagTriggerV2());
            Object objLJIILL = C0SFC.LIZIZ.LJIILL();
            if ((objLJIILL instanceof VideoTagCategoryProtocol) && objLJIILL != null) {
                arrayList2.add(objLJIILL);
            }
            C1367960lha.LIZ.getClass();
            VideoTagCategoryProtocol poiTagTriggerV2 = C1367960lha.LIZ().getPoiTagTriggerV2();
            if (poiTagTriggerV2 != null) {
                arrayList2.add(poiTagTriggerV2);
            }
            arrayList2.add(new FeedMusicFanSpotlightTagTriggerV2());
            arrayList2.add(new FeedReconsumptionTagTriggerV2());
            VideoTagCategoryProtocol videoTagCategoryProtocolLJII = ((IEcommerceAnchorOuterService) ServiceManager.get().getService(IEcommerceAnchorOuterService.class)).LJII();
            if (videoTagCategoryProtocolLJII != null) {
                arrayList2.add(videoTagCategoryProtocolLJII);
            }
            VideoTagCategoryProtocol videoTagCategoryProtocolLJFF = ((IEcommerceAnchorOuterService) ServiceManager.get().getService(IEcommerceAnchorOuterService.class)).LJFF();
            if (videoTagCategoryProtocolLJFF != null) {
                arrayList2.add(videoTagCategoryProtocolLJFF);
            }
            arrayList2.add(new FeedLiveRelatedTagTriggerV2());
            if (C748402w6.LIZ()) {
                arrayList2.add(new FcpHighTagAssem(new C748302w5(c0ryn), ((InterfaceC697230RWn) C2097608Jq.LJFF("high_tag", Bp().LIZIZ())).rs(), c693970RJz));
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL2, VideoTagCategoryProtocol.class, C1697810uHb.LJIILJJIL(it3.next()));
            }
        }
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), VideoTagCategoryProtocol.class, false);
        C693590RIn.LIZ(this, new C693960RJy(this, listLIZIZ));
        C0RJE.LIZLLL(this, (VideoViewModel) this.LLJZIJLIL.getValue(), new C0RW1(this));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0Nkx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, new C0RWR(), 6);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0RWJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RWI) obj).LL;
            }
        }, null, new C0RW3(listLIZIZ), 6);
        ((VideoEventDispatchViewModel) this.LLL.getValue()).LLILZLL = new C0RW4(this);
        ((InterfaceC697230RWn) C2097608Jq.LJFF("high_tag", Bp().LIZIZ())).rs().Ah(this);
        C2765015f.LIZ("VideoTagContainer.onViewCreated", new C693700RIy(this));
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_VIEWCREATED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        tp((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // X.InterfaceC702410Rgt
    public final void vg(C700950ReX c700950ReX) {
        Object obj;
        long jLJFF = C0RQN.LJFF();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        ((VideoItemParams) obj).getAweme().getAid();
        C0T6L.LIZLLL();
        String str = (String) C13LP.LJJJLIIL(((InterfaceC697230RWn) C2097608Jq.LJFF("high_tag", Bp().LIZIZ())).rs().Xh().keySet());
        if (str != null) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            ((VideoItemParams) obj2).getAweme().getAid();
            new AwS96S1000000_11(str, 4);
            C0T6L.LIZLLL();
            C786410Ut5.LJLLLLLL(0, yp().xb());
            InteractAreaCommonAbility interactAreaCommonAbilityZp = zp();
            if (interactAreaCommonAbilityZp != null) {
                interactAreaCommonAbilityZp.CL(str, yp(), true);
            }
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONFCPPOLICY, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility
    public final void wA2(C697110RWb c697110RWb) {
        Aweme aweme;
        UrlModel urlModel;
        List<AwemeHybridLabelModel> list;
        FeedSocialTagViewModel feedSocialTagViewModelEp = Ep();
        VideoItemParams item = feedSocialTagViewModelEp.getItem();
        if (item != null && (aweme = item.getAweme()) != null && Intrinsics.LJFF(aweme.getAid(), c697110RWb.LIZIZ.getAid())) {
            PrivateUrlModel privateUrlModel = c697110RWb.LIZ;
            AwemeLabelModel awemeLabelModel = null;
            if (privateUrlModel != null) {
                urlModel = privateUrlModel.labelPrivate;
            } else {
                urlModel = null;
            }
            aweme.setLabelPrivate(urlModel);
            PrivateUrlModel privateUrlModel2 = c697110RWb.LIZ;
            if (privateUrlModel2 != null && (list = privateUrlModel2.hybridLabels) != null) {
                if (list.size() > 0) {
                    ((AwemeHybridLabelModel) ListProtector.get(list, 0)).setLabelType(HybridLabelTagType.PRIVACY.getValue());
                }
            } else {
                list = null;
            }
            aweme.setHybridLabels(list);
            if (urlModel != null) {
                awemeLabelModel = new AwemeLabelModel();
                awemeLabelModel.setLabelType(1);
                awemeLabelModel.setUrlModels(urlModel);
            }
            List<AwemeLabelModel> list2 = aweme.videoLabels;
            if (list2 != null) {
                if (list2.size() == 0) {
                    ListProtector.add(aweme.videoLabels, 0, awemeLabelModel);
                } else {
                    ListProtector.set(aweme.videoLabels, 0, awemeLabelModel);
                }
            }
            if (!C086I.LIZIZ(aweme.getHybridLabels()) || (urlModel != null && !C086I.LIZIZ(urlModel.getUrlList()))) {
                feedSocialTagViewModelEp.setState(new AwS590S0100000_11(aweme, 20));
            } else {
                feedSocialTagViewModelEp.setState(AFwS243S0000000_11.get$arr$(11));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        InteractAreaCommonAbility interactAreaCommonAbilityZp;
        InteractAreaCommonAbility interactAreaCommonAbilityZp2;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        long jLJFF = C0RQN.LJFF();
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
        if (aweme == null || !AwemeBizExtKt.getReplaceRecTagByRepost(aweme)) {
            String strH3 = Ap().H3();
            if (strH3 != null && strH3.length() != 0 && (interactAreaCommonAbilityZp2 = zp()) != null) {
                interactAreaCommonAbilityZp2.zB1(Ap());
            }
            String strH32 = yp().H3();
            if (strH32 != null && strH32.length() != 0 && (interactAreaCommonAbilityZp = zp()) != null) {
                interactAreaCommonAbilityZp.zB1(yp());
            }
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONSELECTED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void MJ(PriorityProtocol priorityProtocol, Function1<? super View, Unit> function1) {
        Vx0(priorityProtocol, function1, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        long jLJFF = C0RQN.LJFF();
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
        if (Fp()) {
            this.LLJLL.set(true);
        }
        this.LLJLLIL = false;
        tp().LIZJ = false;
        tp().LIZ = false;
        Bp().reset();
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONREUSEDBIND, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void Vx0(PriorityProtocol priorityProtocol, Function1<? super View, Unit> function1, Function1<? super View, Unit> function12) {
        C697210RWl c697210RWlBp = Bp();
        AwS170S0400000_11 awS170S0400000_11 = new AwS170S0400000_11((Function1) function12, function1, (Function1<? super View, Unit>) priorityProtocol, (PriorityProtocol) this, (VideoTagContainer) 2);
        String str = c697210RWlBp.LIZ().get(priorityProtocol.zg());
        if (str != null && str.length() != 0) {
            InterfaceC697230RWn interfaceC697230RWn = c697210RWlBp.LIZIZ().get(str);
            if (interfaceC697230RWn != null) {
                interfaceC697230RWn.ls(priorityProtocol, awS170S0400000_11, Boolean.valueOf(priorityProtocol.oh()));
                return;
            }
            return;
        }
        C20684815ws.LJFF().submit(new ARunnableS80S0200000_11(c697210RWlBp, priorityProtocol, 56));
    }
}
