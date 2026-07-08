package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.AbstractC619610ORz;
import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C036E;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0DTR;
import X.C0OJU;
import X.C0OLG;
import X.C0OMV;
import X.C0OMW;
import X.C0OOP;
import X.C0OPH;
import X.C0OPI;
import X.C0OPO;
import X.C0OPQ;
import X.C0OPR;
import X.C0OPX;
import X.C0OQ7;
import X.C0OR1;
import X.C0OS8;
import X.C0OSY;
import X.C0OSZ;
import X.C0OTB;
import X.C0OTC;
import X.C0OTE;
import X.C0OVA;
import X.C0P4S;
import X.C0QSJ;
import X.C0XQ7;
import X.C1196320hEk;
import X.C1220000hqw;
import X.C123100dR;
import X.C127G;
import X.C12ES;
import X.C1383370m6R;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C13LE;
import X.C13LP;
import X.C1558420qem;
import X.C1558520qew;
import X.C1629106Zl;
import X.C1697810uHb;
import X.C1720106oR;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C21568919b5;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2481009ns;
import X.C279150Awr;
import X.C293310Beb;
import X.C296740Bk8;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C452080Ho6;
import X.C452501pT;
import X.C498380Jga;
import X.C617620OKi;
import X.C618790OOv;
import X.C618910OPh;
import X.C619000OPq;
import X.C619270OQr;
import X.C619660OSe;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736820SvI;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC617060OIe;
import X.EnumC617480OJu;
import X.EnumC618810OOx;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC494301wD;
import X.InterfaceC617160OIo;
import X.InterfaceC617290OJb;
import X.InterfaceC619810OSt;
import X.InterfaceC619820OSu;
import X.InterfaceC619830OSv;
import X.InterfaceC636520Oxu;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.AObjectS384S0100000_9;
import Y.AObjectS62S0000000_9;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Space;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.BulletinCommentSheetFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinEmojiItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListScrollToViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPublishViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCellVmHolder;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommentAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEasterEggAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAnimationAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEventGamePlayAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardKV;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemBottomStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleBadgeModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BulletinBaseCell<T extends BulletinBaseItem> extends PowerCell<T> implements InterfaceC713360RyY, BulletinEmojiAbility, BulletinCommentAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public Space LLILLL;
    public Space LLILZ;
    public Space LLILZIL;
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C736950SvV LLJJI;
    public final C736950SvV LLJJIII;
    public final C736950SvV LLJJIJI;
    public InterfaceC619820OSu LLJJIJIIJIL;
    public C618790OOv LLJJIJIL;
    public C0OR1 LLJJJ;
    public C0OTE LLJJJIL;
    public InterfaceC619810OSt LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public C0OVA LLJJL;
    public Boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public C127G LLJLIL;
    public InterfaceC665370Q7z LLJLILLLLZIIL;
    public C0QSJ LLJLL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(163));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9((BulletinBaseCell) this, 594));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS553S0100000_9((BulletinBaseCell) this, 598));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinBaseCell.class, "_listVm", "get_listVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BulletinBaseCell.class, "_scrollToVm", "get_scrollToVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListScrollToViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BulletinBaseCell.class, "_publishVm", "get_publishVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinPublishViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(BulletinBaseCell.class, "_panelStateVM", "get_panelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final void D6() {
        BulletinInteractionAbility bulletinInteractionAbilityE6;
        Boolean bool;
        BulletinInteractionAbility bulletinInteractionAbilityE62 = e6();
        boolean zBooleanValue = false;
        if (bulletinInteractionAbilityE62 == null || !bulletinInteractionAbilityE62.AK2()) {
            BulletinInteractionAbility bulletinInteractionAbilityE63 = e6();
            if (bulletinInteractionAbilityE63 == null || !bulletinInteractionAbilityE63.v20()) {
                PanelStateViewModel panelStateViewModelH6 = h6();
                panelStateViewModelH6.jt(C1629106Zl.LL, panelStateViewModelH6.Ke().getValue().intValue());
                T item = getItem();
                if (item == null || (bulletinInteractionAbilityE6 = e6()) == null) {
                    return;
                }
                View view = this.itemView;
                boolean z = this instanceof BulletinTextCell;
                boolean z2 = item.LJJJLIIL() != 0;
                BulletinListViewModel bulletinListViewModelF6 = f6();
                BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL = item.LJIILIIL();
                if (bulletinCommentUIOverviewLJIILIIL != null && (bool = bulletinCommentUIOverviewLJIILIIL.enableComment) != null) {
                    zBooleanValue = bool.booleanValue();
                }
                bulletinInteractionAbilityE6.VL1(view, item, z, z2, bulletinListViewModelF6, this, zBooleanValue, this);
            }
        }
    }

    public void N5(C0OVA c0ova, T t) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 853179040) {
            return null;
        }
        return this;
    }

    public void z6() {
        AssemViewModel.asyncSubscribe$default(i6(), new C2217381BqS() { // from class: X.0OMu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJI;
            }
        }, this, C736820SvI.LIZLLL(), null, null, new AwS588S0100000_9((BulletinBaseCell) this, 187), 24, null);
        AssemViewModel.asyncSubscribe$default(i6(), new C2217381BqS() { // from class: X.0OML
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJIJIL;
            }
        }, this, C736820SvI.LIZLLL(), null, null, new AwS588S0100000_9((BulletinBaseCell) this, 188), 24, null);
    }

    public BulletinBaseCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        AssemVMLazy assemVMLazy3;
        AssemVMLazy assemVMLazy4;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinListViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 525);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(319);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 622), awS553S0100000_9, AFwS195S0000000_9.get$arr$(158), new AwS553S0100000_9((C03K6) this, 604), new AwS553S0100000_9((C03K6) this, 542), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 590), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 635), null, new AwS553S0100000_9((C03K6) this, 576));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((C03K6) this, 529);
            AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 580);
            AwS553S0100000_9 awS553S0100000_94 = new AwS553S0100000_9(c19719912DlLIZ, 602);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_92, 28));
            AwS553S0100000_9 awS553S0100000_95 = new AwS553S0100000_9(c01gwLIZIZ, 611);
            AwS553S0100000_9 awS553S0100000_96 = new AwS553S0100000_9(c01gwLIZIZ, 616);
            AwS553S0100000_9 awS553S0100000_97 = new AwS553S0100000_9(c01gwLIZIZ, 621);
            AwS553S0100000_9 awS553S0100000_98 = new AwS553S0100000_9(c01gwLIZIZ, 626);
            AwS553S0100000_9 awS553S0100000_99 = new AwS553S0100000_9(c01gwLIZIZ, 629);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS553S0100000_94, awS553S0100000_9, new C452080Ho6(), awS553S0100000_95, awS553S0100000_96, awS553S0100000_93, aFwS240S0000000_9, awS553S0100000_97, awS553S0100000_98, awS553S0100000_99);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 633), awS553S0100000_9, AFwS195S0000000_9.get$arr$(156), new AwS553S0100000_9((C03K6) this, 534), new AwS553S0100000_9((C03K6) this, 540), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 546), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 551), null, new AwS553S0100000_9((C03K6) this, 556));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 562), awS553S0100000_9, AFwS195S0000000_9.get$arr$(160), new AwS553S0100000_9((C03K6) this, 570), new AwS553S0100000_9((C03K6) this, 573), new AwS553S0100000_9((C03K6) this, 581), aFwS240S0000000_9, null, null, new AwS553S0100000_9((C03K6) this, 584));
        }
        this.LLIZ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinListScrollToViewModel.class);
        AwS553S0100000_9 awS553S0100000_910 = new AwS553S0100000_9(c19719912DlLIZ2, 588);
        AFwS240S0000000_9 aFwS240S0000000_92 = AFwS240S0000000_9.get$arr$(323);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ2, 596), awS553S0100000_910, AFwS195S0000000_9.get$arr$(165), new AwS553S0100000_9((C03K6) this, 603), new AwS553S0100000_9((C03K6) this, 607), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 612), aFwS240S0000000_92, new AwS553S0100000_9((C03K6) this, 617), null, new AwS553S0100000_9((C03K6) this, 627));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_911 = new AwS553S0100000_9((C03K6) this, 630);
            AwS553S0100000_9 awS553S0100000_912 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 634);
            AwS553S0100000_9 awS553S0100000_913 = new AwS553S0100000_9(c19719912DlLIZ2, 526);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_911, 26));
            AwS553S0100000_9 awS553S0100000_914 = new AwS553S0100000_9(c01gwLIZIZ2, 535);
            AwS553S0100000_9 awS553S0100000_915 = new AwS553S0100000_9(c01gwLIZIZ2, 541);
            AwS553S0100000_9 awS553S0100000_916 = new AwS553S0100000_9(c01gwLIZIZ2, 547);
            AwS553S0100000_9 awS553S0100000_917 = new AwS553S0100000_9(c01gwLIZIZ2, 552);
            AwS553S0100000_9 awS553S0100000_918 = new AwS553S0100000_9(c01gwLIZIZ2, 557);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS553S0100000_913, awS553S0100000_910, new C452080Ho6(), awS553S0100000_914, awS553S0100000_915, awS553S0100000_912, aFwS240S0000000_92, awS553S0100000_916, awS553S0100000_917, awS553S0100000_918);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ2, 566), awS553S0100000_910, AFwS195S0000000_9.get$arr$(161), new AwS553S0100000_9((C03K6) this, 574), new AwS553S0100000_9((C03K6) this, 578), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 582), aFwS240S0000000_92, new AwS553S0100000_9((C03K6) this, 585), null, new AwS553S0100000_9((C03K6) this, 589));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ2, 592), awS553S0100000_910, AFwS195S0000000_9.get$arr$(164), new AwS553S0100000_9((C03K6) this, 600), new AwS553S0100000_9((C03K6) this, 608), new AwS553S0100000_9((C03K6) this, 613), aFwS240S0000000_92, null, null, new AwS553S0100000_9((C03K6) this, 618));
        }
        this.LLIZLLLIL = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(BulletinPublishViewModel.class);
        AwS553S0100000_9 awS553S0100000_919 = new AwS553S0100000_9(c19719912DlLIZ3, 623);
        AFwS240S0000000_9 aFwS240S0000000_93 = AFwS240S0000000_9.get$arr$(324);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy3 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ3, 631), awS553S0100000_919, AFwS195S0000000_9.get$arr$(168), new AwS553S0100000_9((C03K6) this, 527), new AwS553S0100000_9((C03K6) this, 530), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 536), aFwS240S0000000_93, new AwS553S0100000_9((C03K6) this, 548), null, new AwS553S0100000_9((C03K6) this, 553));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_920 = new AwS553S0100000_9((C03K6) this, 558);
            AwS553S0100000_9 awS553S0100000_921 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 563);
            AwS553S0100000_9 awS553S0100000_922 = new AwS553S0100000_9(c19719912DlLIZ3, 567);
            C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_920, 27));
            AwS553S0100000_9 awS553S0100000_923 = new AwS553S0100000_9(c01gwLIZIZ3, 575);
            AwS553S0100000_9 awS553S0100000_924 = new AwS553S0100000_9(c01gwLIZIZ3, 579);
            AwS553S0100000_9 awS553S0100000_925 = new AwS553S0100000_9(c01gwLIZIZ3, 583);
            AwS553S0100000_9 awS553S0100000_926 = new AwS553S0100000_9(c01gwLIZIZ3, 586);
            AwS553S0100000_9 awS553S0100000_927 = new AwS553S0100000_9(c01gwLIZIZ3, 593);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = C737910Sx3.LIZ;
            assemVMLazy3 = new AssemVMLazy(awS553S0100000_922, awS553S0100000_919, new C452080Ho6(), awS553S0100000_923, awS553S0100000_924, awS553S0100000_921, aFwS240S0000000_93, awS553S0100000_925, awS553S0100000_926, awS553S0100000_927);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy3 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ3, 597), awS553S0100000_919, AFwS195S0000000_9.get$arr$(166), new AwS553S0100000_9((C03K6) this, 605), new AwS553S0100000_9((C03K6) this, 609), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 614), aFwS240S0000000_93, new AwS553S0100000_9((C03K6) this, 619), null, new AwS553S0100000_9((C03K6) this, 624));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Don't support this VMScope: ");
                sbLIZ3.append(obj);
                sbLIZ3.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            assemVMLazy3 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ3, 628), awS553S0100000_919, AFwS195S0000000_9.get$arr$(167), new AwS553S0100000_9((C03K6) this, 528), new AwS553S0100000_9((C03K6) this, 531), new AwS553S0100000_9((C03K6) this, 537), aFwS240S0000000_93, null, null, new AwS553S0100000_9((C03K6) this, 543));
        }
        this.LLJ = assemVMLazy3;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(PanelStateViewModel.class);
        AwS553S0100000_9 awS553S0100000_928 = new AwS553S0100000_9(c19719912DlLIZ4, 549);
        AFwS240S0000000_9 aFwS240S0000000_94 = AFwS240S0000000_9.get$arr$(318);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy4 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ4, 559), awS553S0100000_928, AFwS195S0000000_9.get$arr$(159), new AwS553S0100000_9((C03K6) this, 568), new AwS553S0100000_9((C03K6) this, 571), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 601), aFwS240S0000000_94, new AwS553S0100000_9((C03K6) this, 606), null, new AwS553S0100000_9((C03K6) this, 610));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_929 = new AwS553S0100000_9((C03K6) this, 615);
            AwS553S0100000_9 awS553S0100000_930 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 620);
            AwS553S0100000_9 awS553S0100000_931 = new AwS553S0100000_9(c19719912DlLIZ4, 625);
            C01GW c01gwLIZIZ4 = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_929, 29));
            AwS553S0100000_9 awS553S0100000_932 = new AwS553S0100000_9(c01gwLIZIZ4, 632);
            AwS553S0100000_9 awS553S0100000_933 = new AwS553S0100000_9(c01gwLIZIZ4, 636);
            AwS553S0100000_9 awS553S0100000_934 = new AwS553S0100000_9(c01gwLIZIZ4, 524);
            AwS553S0100000_9 awS553S0100000_935 = new AwS553S0100000_9(c01gwLIZIZ4, 533);
            AwS553S0100000_9 awS553S0100000_936 = new AwS553S0100000_9(c01gwLIZIZ4, 539);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr4 = C737910Sx3.LIZ;
            assemVMLazy4 = new AssemVMLazy(awS553S0100000_931, awS553S0100000_928, new C452080Ho6(), awS553S0100000_932, awS553S0100000_933, awS553S0100000_930, aFwS240S0000000_94, awS553S0100000_934, awS553S0100000_935, awS553S0100000_936);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy4 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ4, 545), awS553S0100000_928, AFwS195S0000000_9.get$arr$(157), new AwS553S0100000_9((C03K6) this, 555), new AwS553S0100000_9((C03K6) this, 561), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 565), aFwS240S0000000_94, new AwS553S0100000_9((C03K6) this, 569), null, new AwS553S0100000_9((C03K6) this, 572));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Don't support this VMScope: ");
                sbLIZ4.append(obj);
                sbLIZ4.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
            }
            assemVMLazy4 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ4, 577), awS553S0100000_928, AFwS195S0000000_9.get$arr$(162), new AwS553S0100000_9((C03K6) this, 587), new AwS553S0100000_9((C03K6) this, 591), new AwS553S0100000_9((C03K6) this, 595), aFwS240S0000000_94, null, null, new AwS553S0100000_9((C03K6) this, 599));
        }
        this.LLJI = assemVMLazy4;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9((BulletinBaseCell) this, 532));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS553S0100000_9((BulletinBaseCell) this, 560));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS553S0100000_9((BulletinBaseCell) this, 544));
        this.LLJILLL = C452501pT.LIZIZ(new AwS553S0100000_9((BulletinBaseCell) this, 538));
        this.LLJJ = C452501pT.LIZIZ(new AwS553S0100000_9((BulletinBaseCell) this, 554));
        AwS553S0100000_9 awS553S0100000_937 = new AwS553S0100000_9((BulletinBaseCell) this, 564);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(BulletinProfileViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_95 = AFwS240S0000000_9.get$arr$(320);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJI = new C736950SvV(c19719912DlLIZ5, awS553S0100000_937, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_95, null, null, null);
        this.LLJJIII = new C736950SvV(C13LE.LIZ(BulletinCommentListViewModel.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(321), null, null, null);
        AwS553S0100000_9 awS553S0100000_938 = new AwS553S0100000_9((BulletinBaseCell) this, 550);
        this.LLJJIJI = new C736950SvV(C13LE.LIZ(BulletinEmojiViewModel.class), awS553S0100000_938, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(322), null, null, null);
    }

    private C0QSJ T5() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLILLLLZIIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJLILLLLZIIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{BulletinFragmentScope.class});
        this.LLJLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    public final void S6() {
        BulletinCommonAbility bulletinCommonAbilityA6;
        BulletinEventGamePlayAbility bulletinEventGamePlayAbility;
        Object next;
        BulletinEmojiItem bulletinEmojiItemLIZ;
        BulletinInteractionAbility bulletinInteractionAbilityE6;
        BulletinInteractionAbility bulletinInteractionAbilityE62;
        BulletinEmojiItem bulletinEmojiItem;
        List<String> listSQ1;
        final T item = getItem();
        if (item == null || (bulletinCommonAbilityA6 = a6()) == null) {
            return;
        }
        final long jOg2 = bulletinCommonAbilityA6.Og2();
        Long lLJJJ = item.LJJJ();
        if (lLJJJ != null) {
            final long jLongValue = lLJJJ.longValue();
            ArrayList arrayList = new ArrayList();
            BulletinCellVmHolder bulletinCellVmHolderU6 = u6();
            if (((bulletinCellVmHolderU6 != null && (bulletinEventGamePlayAbility = (BulletinEventGamePlayAbility) bulletinCellVmHolderU6.LLJILJILJ.getValue()) != null) || (bulletinEventGamePlayAbility = (BulletinEventGamePlayAbility) this.LLJJ.getValue()) != null) && (listSQ1 = bulletinEventGamePlayAbility.sQ1()) != null) {
                arrayList.addAll(listSQ1);
            }
            List<String> list = C0OSY.LIZ.content;
            if (list == null) {
                list = C0OSY.LIZIZ;
            }
            ArrayList arrayList2 = new ArrayList(list);
            Collections.shuffle(arrayList2);
            arrayList.addAll(arrayList2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else {
                    linkedHashMap.put(it2.next(), -1);
                }
            }
            int i = 0;
            for (BulletinEmojiItem bulletinEmojiItem2 : item.LJIJJLI()) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                BulletinEmojiItem bulletinEmojiItem3 = bulletinEmojiItem2;
                if (linkedHashMap.get(bulletinEmojiItem3.emoji) != null) {
                    linkedHashMap.put(bulletinEmojiItem3.emoji, Integer.valueOf(i));
                }
                i = i2;
            }
            Iterator it3 = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                Map.Entry entry = (Map.Entry) next;
                entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                if (iIntValue == -1 || ((bulletinEmojiItem = (BulletinEmojiItem) C13LP.LJJJLZIJ(iIntValue, item.LJIJJLI())) != null && !bulletinEmojiItem.isReaction)) {
                    break;
                }
            }
            Map.Entry entry2 = (Map.Entry) next;
            if (entry2 != null) {
                Pair pair = new Pair(entry2.getKey(), entry2.getValue());
                int iIntValue2 = ((Number) pair.getSecond()).intValue();
                final String str = (String) pair.getFirst();
                if (iIntValue2 == -1) {
                    C0OPQ c0opq = C0OPQ.LIZ;
                    C0OPR c0opr = C0OPR.EMOJI_ACTION_TYPE_SEND;
                    int type = c0opr.getType();
                    String strValueOf = String.valueOf(jOg2);
                    String strValueOf2 = String.valueOf(jLongValue);
                    BulletinCommonAbility bulletinCommonAbilityA62 = a6();
                    int iIE = bulletinCommonAbilityA62 != null ? bulletinCommonAbilityA62.IE() : -1;
                    BulletinStyleStruct bulletinStyleStructLJ = item.LJ();
                    List<BulletinCardKV> list2 = bulletinStyleStructLJ != null ? bulletinStyleStructLJ.extra : null;
                    Map<String, String> mapW5 = W5();
                    c0opq.getClass();
                    C0OPQ.LIZ(type, strValueOf, strValueOf2, iIE, "doubleclick_bulletin_message", str, list2, mapW5);
                    C844470XAv.LIZ.getClass();
                    C844470XAv.LIZ();
                    try {
                        if (C036E.LIZ.LIZIZ()) {
                            T item2 = getItem();
                            int iLJIL = (item2 != null ? item2.LJIL() : 0) + 1;
                            item.LL(iLJIL);
                            boolean z = item.LJIJJLI().size() < item.emojiShowCnt || ((bulletinInteractionAbilityE62 = e6()) != null && bulletinInteractionAbilityE62.AK2());
                            BulletinEmojiItem bulletinEmojiItem4 = new BulletinEmojiItem(str, 1L, true, String.valueOf(jLongValue), iLJIL, z);
                            bulletinEmojiItem4.LLILZ = C498380Jga.LIZ.LIZ(1L);
                            item.LJIJJLI().add(bulletinEmojiItem4);
                            C618910OPh c618910OPh = C618910OPh.LIZ;
                            List<BulletinEmojiItem> listLJIJJLI = item.LJIJJLI();
                            int i3 = item.emojiShowCnt;
                            String strValueOf3 = String.valueOf(jLongValue);
                            boolean z2 = !z;
                            BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL = item.LJIILIIL();
                            c618910OPh.getClass();
                            item.LLFFF(C618910OPh.LJIIJJI(listLJIJJLI, i3, strValueOf3, z2, str, bulletinCommentUIOverviewLJIILIIL));
                            InterfaceC619810OSt interfaceC619810OSt = this.LLJJJJ;
                            if (interfaceC619810OSt != null) {
                                interfaceC619810OSt.LJIIIIZZ(item, this.LLJJJJJIL, z2, str);
                            }
                            BulletinEmojiViewModel bulletinEmojiViewModelD6 = d6();
                            int type2 = c0opr.getType();
                            BulletinCommonAbility bulletinCommonAbilityA63 = a6();
                            bulletinEmojiViewModelD6.wQ2(type2, jOg2, jLongValue, new C0OSZ() { // from class: X.0OSV
                                @Override // X.C0OSZ
                                public final void LIZ() {
                                    BulletinStyleStruct bulletinStyleStructLJ2;
                                    BulletinBaseCell<T> bulletinBaseCell;
                                    InterfaceC619810OSt interfaceC619810OSt2;
                                    ArrayList arrayList3 = new ArrayList();
                                    List<BulletinEmojiItem> listLJIJJLI2 = item.LJIJJLI();
                                    String str2 = str;
                                    Iterator<BulletinEmojiItem> it4 = listLJIJJLI2.iterator();
                                    while (it4.hasNext()) {
                                        BulletinEmojiItem next2 = it4.next();
                                        if (Intrinsics.LJFF(next2.emoji, str2)) {
                                            next2 = BulletinEmojiItem.LIZ(next2, next2.count - 1, false, false, 57);
                                            next2.LLILZ = C498380Jga.LIZ.LIZ(next2.count);
                                        }
                                        if (next2.count > 0) {
                                            arrayList3.add(next2);
                                        }
                                    }
                                    item.LJZL(arrayList3);
                                    BulletinBaseItem bulletinBaseItem = item;
                                    C618910OPh c618910OPh2 = C618910OPh.LIZ;
                                    List<BulletinEmojiItem> listLJIJJLI3 = bulletinBaseItem.LJIJJLI();
                                    int i4 = item.emojiShowCnt;
                                    String strValueOf4 = String.valueOf(jLongValue);
                                    BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL2 = item.LJIILIIL();
                                    c618910OPh2.getClass();
                                    bulletinBaseItem.LLFFF(C618910OPh.LJIIJJI(listLJIJJLI3, i4, strValueOf4, false, "", bulletinCommentUIOverviewLJIILIIL2));
                                    if (Intrinsics.LJFF(item, this.getItem()) && (interfaceC619810OSt2 = (bulletinBaseCell = this).LLJJJJ) != null) {
                                        interfaceC619810OSt2.LJIIIIZZ(item, bulletinBaseCell.LLJJJJJIL, false, "");
                                    }
                                    C0OPQ c0opq2 = C0OPQ.LIZ;
                                    int type3 = C0OPR.EMOJI_ACTION_TYPE_SEND.getType();
                                    String strValueOf5 = String.valueOf(jOg2);
                                    String strValueOf6 = String.valueOf(jLongValue);
                                    BulletinCommonAbility bulletinCommonAbilityA64 = this.a6();
                                    int iIE2 = bulletinCommonAbilityA64 != null ? bulletinCommonAbilityA64.IE() : -1;
                                    String str3 = str;
                                    BulletinBaseItem bulletinBaseItem2 = item;
                                    List<BulletinCardKV> list3 = (bulletinBaseItem2 == null || (bulletinStyleStructLJ2 = bulletinBaseItem2.LJ()) == null) ? null : bulletinStyleStructLJ2.extra;
                                    Map<String, String> mapW52 = this.W5();
                                    c0opq2.getClass();
                                    C0OPQ.LIZIZ(type3, strValueOf5, strValueOf6, iIE2, "doubleclick_bulletin_message", str3, false, list3, mapW52);
                                }

                                @Override // X.C0OSZ
                                public final void LIZIZ() {
                                    BulletinStyleStruct bulletinStyleStructLJ2;
                                    C0OPQ c0opq2 = C0OPQ.LIZ;
                                    int type3 = C0OPR.EMOJI_ACTION_TYPE_SEND.getType();
                                    String strValueOf4 = String.valueOf(jOg2);
                                    String strValueOf5 = String.valueOf(jLongValue);
                                    BulletinCommonAbility bulletinCommonAbilityA64 = this.a6();
                                    int iIE2 = bulletinCommonAbilityA64 != null ? bulletinCommonAbilityA64.IE() : -1;
                                    String str2 = str;
                                    BulletinBaseItem bulletinBaseItem = item;
                                    List<BulletinCardKV> list3 = (bulletinBaseItem == null || (bulletinStyleStructLJ2 = bulletinBaseItem.LJ()) == null) ? null : bulletinStyleStructLJ2.extra;
                                    Map<String, String> mapW52 = this.W5();
                                    c0opq2.getClass();
                                    C0OPQ.LIZIZ(type3, strValueOf4, strValueOf5, iIE2, "doubleclick_bulletin_message", str2, true, list3, mapW52);
                                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_6844501022_bb_easter_egg_double_click", true, true)) {
                                        if (!((ArrayList) C0OSY.LIZIZ).contains(str)) {
                                            return;
                                        }
                                    }
                                    BulletinEasterEggAbility bulletinEasterEggAbilityB6 = this.b6();
                                    if (bulletinEasterEggAbilityB6 != null) {
                                        bulletinEasterEggAbilityB6.PP1(C0OST.EMOJI);
                                    }
                                }
                            }, Integer.valueOf(bulletinCommonAbilityA63 != null ? bulletinCommonAbilityA63.bB() : EnumC617060OIe.INVALID.getValue()), str);
                            return;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
                    c1389890mGx.LJIIIZ(2131828141);
                    c1389890mGx.LJIIJJI();
                    C0OPX.LJIIIIZZ("post Emoji {" + str + "} network error");
                    int type3 = c0opr.getType();
                    String strValueOf4 = String.valueOf(jOg2);
                    String strValueOf5 = String.valueOf(jLongValue);
                    BulletinCommonAbility bulletinCommonAbilityA64 = a6();
                    int iIE2 = bulletinCommonAbilityA64 != null ? bulletinCommonAbilityA64.IE() : -1;
                    BulletinStyleStruct bulletinStyleStructLJ2 = item.LJ();
                    C0OPQ.LIZIZ(type3, strValueOf4, strValueOf5, iIE2, "doubleclick_bulletin_message", str, false, bulletinStyleStructLJ2 != null ? bulletinStyleStructLJ2.extra : null, W5());
                    return;
                }
                BulletinEmojiItem bulletinEmojiItem5 = (BulletinEmojiItem) C13LP.LJJJLZIJ(iIntValue2, item.LJIJJLI());
                if (bulletinEmojiItem5 == null) {
                    bulletinEmojiItemLIZ = null;
                } else {
                    if (bulletinEmojiItem5.isReaction) {
                        return;
                    }
                    bulletinEmojiItemLIZ = BulletinEmojiItem.LIZ(bulletinEmojiItem5, bulletinEmojiItem5.count + 1, true, iIntValue2 < item.emojiShowCnt || ((bulletinInteractionAbilityE6 = e6()) != null && bulletinInteractionAbilityE6.AK2()), 25);
                    bulletinEmojiItemLIZ.LLILZ = C498380Jga.LIZ.LIZ(bulletinEmojiItemLIZ.count);
                }
                C0OPQ c0opq2 = C0OPQ.LIZ;
                C0OPR c0opr2 = C0OPR.EMOJI_ACTION_TYPE_SEND;
                int type4 = c0opr2.getType();
                String strValueOf6 = String.valueOf(jOg2);
                String strValueOf7 = String.valueOf(jLongValue);
                BulletinCommonAbility bulletinCommonAbilityA65 = a6();
                int iIE3 = bulletinCommonAbilityA65 != null ? bulletinCommonAbilityA65.IE() : -1;
                BulletinStyleStruct bulletinStyleStructLJ3 = item.LJ();
                List<BulletinCardKV> list3 = bulletinStyleStructLJ3 != null ? bulletinStyleStructLJ3.extra : null;
                Map<String, String> mapW52 = W5();
                c0opq2.getClass();
                C0OPQ.LIZ(type4, strValueOf6, strValueOf7, iIE3, "doubleclick_bulletin_message", str, list3, mapW52);
                C844470XAv.LIZ.getClass();
                C844470XAv.LIZ();
                try {
                    if (C036E.LIZ.LIZIZ()) {
                        if (bulletinEmojiItemLIZ == null || item.LJIJJLI().size() <= iIntValue2) {
                            return;
                        }
                        ListProtector.set(item.LJIJJLI(), iIntValue2, bulletinEmojiItemLIZ);
                        C618910OPh c618910OPh2 = C618910OPh.LIZ;
                        List<BulletinEmojiItem> listLJIJJLI2 = item.LJIJJLI();
                        int i4 = item.emojiShowCnt;
                        String strValueOf8 = String.valueOf(item.LJJJ());
                        boolean z3 = !bulletinEmojiItemLIZ.LLILLL;
                        BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL2 = item.LJIILIIL();
                        c618910OPh2.getClass();
                        item.LLFFF(C618910OPh.LJIIJJI(listLJIJJLI2, i4, strValueOf8, z3, str, bulletinCommentUIOverviewLJIILIIL2));
                        InterfaceC619810OSt interfaceC619810OSt2 = this.LLJJJJ;
                        if (interfaceC619810OSt2 != null) {
                            interfaceC619810OSt2.LJIIIIZZ(item, this.LLJJJJJIL, !bulletinEmojiItemLIZ.LLILLL, str);
                        }
                        BulletinEmojiViewModel bulletinEmojiViewModelD62 = d6();
                        int type5 = c0opr2.getType();
                        BulletinCommonAbility bulletinCommonAbilityA66 = a6();
                        bulletinEmojiViewModelD62.wQ2(type5, jOg2, jLongValue, new C0OSZ() { // from class: X.0OSX
                            @Override // X.C0OSZ
                            public final void LIZ() {
                                BulletinStyleStruct bulletinStyleStructLJ4;
                                BulletinBaseCell<T> bulletinBaseCell;
                                InterfaceC619810OSt interfaceC619810OSt3;
                                ArrayList arrayList3 = new ArrayList();
                                List<BulletinEmojiItem> listLJIJJLI3 = item.LJIJJLI();
                                String str2 = str;
                                Iterator<BulletinEmojiItem> it4 = listLJIJJLI3.iterator();
                                while (it4.hasNext()) {
                                    BulletinEmojiItem next2 = it4.next();
                                    if (Intrinsics.LJFF(next2.emoji, str2)) {
                                        next2 = BulletinEmojiItem.LIZ(next2, next2.count - 1, false, false, 25);
                                        next2.LLILZ = C498380Jga.LIZ.LIZ(next2.count);
                                    }
                                    if (next2.count > 0) {
                                        arrayList3.add(next2);
                                    }
                                }
                                item.LJZL(arrayList3);
                                BulletinBaseItem bulletinBaseItem = item;
                                C618910OPh c618910OPh3 = C618910OPh.LIZ;
                                List<BulletinEmojiItem> listLJIJJLI4 = bulletinBaseItem.LJIJJLI();
                                int i5 = item.emojiShowCnt;
                                String strValueOf9 = String.valueOf(jLongValue);
                                BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL3 = item.LJIILIIL();
                                c618910OPh3.getClass();
                                bulletinBaseItem.LLFFF(C618910OPh.LJIIJJI(listLJIJJLI4, i5, strValueOf9, false, "", bulletinCommentUIOverviewLJIILIIL3));
                                if (Intrinsics.LJFF(item, this.getItem()) && (interfaceC619810OSt3 = (bulletinBaseCell = this).LLJJJJ) != null) {
                                    interfaceC619810OSt3.LJIIIIZZ(item, bulletinBaseCell.LLJJJJJIL, false, "");
                                }
                                C0OPQ c0opq3 = C0OPQ.LIZ;
                                int type6 = C0OPR.EMOJI_ACTION_TYPE_SEND.getType();
                                String strValueOf10 = String.valueOf(jOg2);
                                String strValueOf11 = String.valueOf(jLongValue);
                                BulletinCommonAbility bulletinCommonAbilityA67 = this.a6();
                                int iIE4 = bulletinCommonAbilityA67 != null ? bulletinCommonAbilityA67.IE() : -1;
                                String str3 = str;
                                BulletinBaseItem bulletinBaseItem2 = item;
                                List<BulletinCardKV> list4 = (bulletinBaseItem2 == null || (bulletinStyleStructLJ4 = bulletinBaseItem2.LJ()) == null) ? null : bulletinStyleStructLJ4.extra;
                                Map<String, String> mapW53 = this.W5();
                                c0opq3.getClass();
                                C0OPQ.LIZIZ(type6, strValueOf10, strValueOf11, iIE4, "doubleclick_bulletin_message", str3, false, list4, mapW53);
                            }

                            @Override // X.C0OSZ
                            public final void LIZIZ() {
                                BulletinStyleStruct bulletinStyleStructLJ4;
                                C0OPQ c0opq3 = C0OPQ.LIZ;
                                int type6 = C0OPR.EMOJI_ACTION_TYPE_SEND.getType();
                                String strValueOf9 = String.valueOf(jOg2);
                                String strValueOf10 = String.valueOf(jLongValue);
                                BulletinCommonAbility bulletinCommonAbilityA67 = this.a6();
                                int iIE4 = bulletinCommonAbilityA67 != null ? bulletinCommonAbilityA67.IE() : -1;
                                String str2 = str;
                                BulletinBaseItem bulletinBaseItem = item;
                                List<BulletinCardKV> list4 = (bulletinBaseItem == null || (bulletinStyleStructLJ4 = bulletinBaseItem.LJ()) == null) ? null : bulletinStyleStructLJ4.extra;
                                Map<String, String> mapW53 = this.W5();
                                c0opq3.getClass();
                                C0OPQ.LIZIZ(type6, strValueOf9, strValueOf10, iIE4, "doubleclick_bulletin_message", str2, true, list4, mapW53);
                                if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_6844501022_bb_easter_egg_double_click", true, true)) {
                                    if (!((ArrayList) C0OSY.LIZIZ).contains(str)) {
                                        return;
                                    }
                                }
                                BulletinEasterEggAbility bulletinEasterEggAbilityB6 = this.b6();
                                if (bulletinEasterEggAbilityB6 != null) {
                                    bulletinEasterEggAbilityB6.PP1(C0OST.EMOJI);
                                }
                            }
                        }, Integer.valueOf(bulletinCommonAbilityA66 != null ? bulletinCommonAbilityA66.bB() : EnumC617060OIe.INVALID.getValue()), str);
                        return;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                C1389890mGx c1389890mGx2 = new C1389890mGx(this.itemView);
                c1389890mGx2.LJIIIZ(2131828141);
                c1389890mGx2.LJIIJJI();
                C0OPX.LJIIIIZZ("post Emoji {" + str + "} network error");
                int type6 = c0opr2.getType();
                String strValueOf9 = String.valueOf(jOg2);
                String strValueOf10 = String.valueOf(jLongValue);
                BulletinCommonAbility bulletinCommonAbilityA67 = a6();
                int iIE4 = bulletinCommonAbilityA67 != null ? bulletinCommonAbilityA67.IE() : -1;
                BulletinStyleStruct bulletinStyleStructLJ4 = item.LJ();
                C0OPQ.LIZIZ(type6, strValueOf9, strValueOf10, iIE4, "doubleclick_bulletin_message", str, true, bulletinStyleStructLJ4 != null ? bulletinStyleStructLJ4.extra : null, W5());
            }
        }
    }

    public final C21568919b5 r6() {
        return (C21568919b5) this.itemView.findViewById(R.id.d0b);
    }

    public final BulletinCellVmHolder u6() {
        return (BulletinCellVmHolder) this.LLILZLL.getValue();
    }

    private final BulletinEmojiViewModel d6() {
        BulletinEmojiViewModel bulletinEmojiViewModel;
        BulletinCellVmHolder bulletinCellVmHolderU6 = u6();
        return (bulletinCellVmHolderU6 == null || (bulletinEmojiViewModel = (BulletinEmojiViewModel) bulletinCellVmHolderU6.LLIZ.getValue()) == null) ? (BulletinEmojiViewModel) this.LLJJIJI.getValue() : bulletinEmojiViewModel;
    }

    private final PanelStateViewModel h6() {
        PanelStateViewModel panelStateViewModel;
        BulletinCellVmHolder bulletinCellVmHolderU6 = u6();
        if (bulletinCellVmHolderU6 != null && (panelStateViewModel = (PanelStateViewModel) bulletinCellVmHolderU6.LLILZ.getValue()) != null) {
            return panelStateViewModel;
        }
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (PanelStateViewModel) assemVMLazy.getValue();
    }

    public void C6() {
        View view;
        T item;
        T item2;
        BulletinStyleStruct bulletinStyleStructLJ;
        BulletinStyleBadgeModel bulletinStyleBadgeModel;
        if (To()) {
            if (this.LLJJIJIL == null) {
                this.LLJJIJIL = new C618790OOv((ViewStub) this.itemView.findViewById(R.id.d4r), q6(), a6(), e6());
            }
        } else if (this.LLJJIJIIJIL == null) {
            this.LLJJIJIIJIL = U5();
        }
        if (!J6()) {
            C0OR1 c0or1 = this.LLJJJ;
            if (c0or1 != null && (view = (View) c0or1.LJ.getValue()) != null) {
                C0DTR.LIZIZ(view);
            }
        } else if (this.LLJJJ == null) {
            this.LLJJJ = new C0OR1((ViewStub) this.itemView.findViewById(R.id.d1e), e6(), a6());
        }
        T item3 = getItem();
        if (!((!C123100dR.LIZ(item3 != null ? item3.LJJL() : null) || (item2 = getItem()) == null || (bulletinStyleStructLJ = item2.LJ()) == null || (bulletinStyleBadgeModel = bulletinStyleStructLJ.badgeModel) == null || (bulletinStyleBadgeModel.topLeftSources == null && bulletinStyleBadgeModel.topRightSources == null && bulletinStyleBadgeModel.bottomLeftSources == null && bulletinStyleBadgeModel.bottomRightSources == null)) ? false : true)) {
            C0OTE c0ote = this.LLJJJIL;
            if (c0ote != null) {
                if (C0OS8.LJI()) {
                    View view2 = (View) c0ote.LIZJ.getValue();
                    if (view2 != null) {
                        C0DTR.LIZIZ(view2);
                    }
                } else {
                    View viewFindViewById = c0ote.LIZIZ.findViewById(R.id.d1c);
                    if (viewFindViewById != null) {
                        C0DTR.LIZIZ(viewFindViewById);
                    }
                }
            }
        } else if (this.LLJJJIL == null) {
            this.LLJJJIL = new C0OTE((ViewStub) this.itemView.findViewById(R.id.d1c), f6().getAssemVMScope());
        }
        if (this.LLJJJJ == null && C0OPO.LIZ() && (item = getItem()) != null && item.needEmoji) {
            View viewFindViewById2 = this.itemView.findViewById(R.id.d0u);
            this.LLJJJJ = C0OS8.LIZLLL() ? new C619270OQr(viewFindViewById2, e6(), c6(), a6(), C1558420qem.LIZIZ(this)) : new C0OQ7(viewFindViewById2, e6(), c6(), a6(), C1558420qem.LIZIZ(this));
            C1558520qew.LJII(C1558420qem.LIZIZ(this), this, BulletinEmojiAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility
    public final void Ez0() {
        T item = getItem();
        if (item == null) {
            return;
        }
        if (C293310Beb.LIZJ()) {
            C618910OPh c618910OPh = C618910OPh.LIZ;
            List<BulletinEmojiItem> listLJIJJLI = item.LJIJJLI();
            int i = item.emojiShowCnt;
            String strValueOf = String.valueOf(item.LJJJ());
            BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL = item.LJIILIIL();
            c618910OPh.getClass();
            item.LLFFF(C618910OPh.LJIIJJI(listLJIJJLI, i, strValueOf, false, "", bulletinCommentUIOverviewLJIILIIL));
        }
        InterfaceC619810OSt interfaceC619810OSt = this.LLJJJJ;
        if (interfaceC619810OSt != null) {
            interfaceC619810OSt.LJIIIIZZ(item, this.LLJJJJJIL, false, "");
        }
    }

    public boolean J6() {
        BulletinItemBottomStruct bulletinItemBottomStructLIZIZ;
        if (To()) {
            return true;
        }
        T item = getItem();
        return C123100dR.LIZ((item == null || (bulletinItemBottomStructLIZIZ = item.LIZIZ()) == null) ? null : bulletinItemBottomStructLIZIZ.bottomTip);
    }

    public Map<String, String> S5() {
        return C2097608Jq.LJ();
    }

    public final boolean To() {
        BulletinCellVmHolder bulletinCellVmHolderU6 = u6();
        if (bulletinCellVmHolderU6 != null) {
            return ((Boolean) bulletinCellVmHolderU6.LLJJ.getValue()).booleanValue();
        }
        BulletinCommonAbility bulletinCommonAbility = (BulletinCommonAbility) this.LLJIJIL.getValue();
        if (bulletinCommonAbility != null) {
            return bulletinCommonAbility.To();
        }
        return false;
    }

    public final InterfaceC619820OSu U5() {
        return C0OS8.LIZLLL() ? new C0OTB((ViewGroup) this.itemView.findViewById(R.id.cyh), a6()) : new C0OTC((ViewStub) this.itemView.findViewById(R.id.cyh), a6());
    }

    public final void V5() {
        T item;
        BulletinCommonAbility bulletinCommonAbilityA6 = a6();
        if (bulletinCommonAbilityA6 != null && bulletinCommonAbilityA6.q11() && C0OPO.LIZ() && (item = getItem()) != null && item.LIZ()) {
            PanelStateViewModel panelStateViewModelH6 = h6();
            panelStateViewModelH6.jt(C1629106Zl.LL, panelStateViewModelH6.Ke().getValue().intValue());
            if (To()) {
                S6();
                return;
            }
            BulletinCommonAbility bulletinCommonAbilityA62 = a6();
            if (bulletinCommonAbilityA62 == null || !bulletinCommonAbilityA62.Nl()) {
                S6();
                return;
            }
            BulletinInteractionAbility bulletinInteractionAbilityE6 = e6();
            if (bulletinInteractionAbilityE6 != null) {
                T item2 = getItem();
                bulletinInteractionAbilityE6.rE1(String.valueOf(item2 != null ? item2.LJJJ() : null), "doubleclick_bulletin_message", null);
            }
            T item3 = getItem();
            if (item3 != null) {
                item3.LJIJJLI();
            }
        }
    }

    public Map<String, String> W5() {
        return C2097608Jq.LJ();
    }

    public final BulletinCommentListViewModel X5() {
        BulletinCommentListViewModel bulletinCommentListViewModel;
        BulletinCellVmHolder bulletinCellVmHolderU6 = u6();
        return (bulletinCellVmHolderU6 == null || (bulletinCommentListViewModel = (BulletinCommentListViewModel) bulletinCellVmHolderU6.LLILZLL.getValue()) == null) ? (BulletinCommentListViewModel) this.LLJJIII.getValue() : bulletinCommentListViewModel;
    }

    public final BulletinCommonAbility a6() {
        BulletinCommonAbility bulletinCommonAbility;
        BulletinCellVmHolder bulletinCellVmHolderU6 = u6();
        return (bulletinCellVmHolderU6 == null || (bulletinCommonAbility = (BulletinCommonAbility) bulletinCellVmHolderU6.LLJ.getValue()) == null) ? (BulletinCommonAbility) this.LLJIJIL.getValue() : bulletinCommonAbility;
    }

    public final BulletinEasterEggAbility b6() {
        BulletinEasterEggAbility bulletinEasterEggAbility;
        BulletinCellVmHolder bulletinCellVmHolderU6 = u6();
        return (bulletinCellVmHolderU6 == null || (bulletinEasterEggAbility = (BulletinEasterEggAbility) bulletinCellVmHolderU6.LLJILJIL.getValue()) == null) ? (BulletinEasterEggAbility) this.LLJILLL.getValue() : bulletinEasterEggAbility;
    }

    public final BulletinEmojiAnimationAbility c6() {
        BulletinEmojiAnimationAbility bulletinEmojiAnimationAbility;
        BulletinCellVmHolder bulletinCellVmHolderU6 = u6();
        return (bulletinCellVmHolderU6 == null || (bulletinEmojiAnimationAbility = (BulletinEmojiAnimationAbility) bulletinCellVmHolderU6.LLJIJIL.getValue()) == null) ? (BulletinEmojiAnimationAbility) this.LLJILJILJ.getValue() : bulletinEmojiAnimationAbility;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility
    public final BulletinBaseItem cK() {
        return getItem();
    }

    public final BulletinInteractionAbility e6() {
        BulletinInteractionAbility bulletinInteractionAbility;
        BulletinCellVmHolder bulletinCellVmHolderU6 = u6();
        return (bulletinCellVmHolderU6 == null || (bulletinInteractionAbility = (BulletinInteractionAbility) bulletinCellVmHolderU6.LLJI.getValue()) == null) ? (BulletinInteractionAbility) this.LLJILJIL.getValue() : bulletinInteractionAbility;
    }

    public final BulletinListViewModel f6() {
        BulletinListViewModel bulletinListViewModel;
        BulletinCellVmHolder bulletinCellVmHolderU6 = u6();
        if (bulletinCellVmHolderU6 != null && (bulletinListViewModel = (BulletinListViewModel) bulletinCellVmHolderU6.LL.getValue()) != null) {
            return bulletinListViewModel;
        }
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (BulletinListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinListViewModel.class, new AObjectS384S0100000_9(this, 0), BulletinPublishViewModel.class, new AObjectS384S0100000_9(this, 1), BulletinCommentListViewModel.class, new AObjectS62S0000000_9(this, 0)}, defaultViewModelProviderFactory);
                    this.LLJLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return C0OS8.LIZLLL() ? To() ? R.layout.a7k : R.layout.a7m : To() ? R.layout.a7j : R.layout.a7l;
    }

    public final BulletinProfileViewModel i6() {
        BulletinProfileViewModel bulletinProfileViewModel;
        BulletinCellVmHolder bulletinCellVmHolderU6 = u6();
        return (bulletinCellVmHolderU6 == null || (bulletinProfileViewModel = (BulletinProfileViewModel) bulletinCellVmHolderU6.LLILZIL.getValue()) == null) ? (BulletinProfileViewModel) this.LLJJI.getValue() : bulletinProfileViewModel;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public void onDestroy() {
        super.onDestroy();
        C0OTE c0ote = this.LLJJJIL;
        if (c0ote != null) {
            C2481009ns c2481009ns = c0ote.LIZLLL;
            if (c2481009ns != null) {
                c2481009ns.LJFF();
            }
            C2481009ns c2481009ns2 = c0ote.LJ;
            if (c2481009ns2 != null) {
                c2481009ns2.LJFF();
            }
            C2481009ns c2481009ns3 = c0ote.LJFF;
            if (c2481009ns3 != null) {
                c2481009ns3.LJFF();
            }
            C2481009ns c2481009ns4 = c0ote.LJI;
            if (c2481009ns4 != null) {
                c2481009ns4.LJFF();
            }
            c0ote.LIZLLL = null;
            c0ote.LJ = null;
            c0ote.LJFF = null;
            c0ote.LJI = null;
        }
        InterfaceC619810OSt interfaceC619810OSt = this.LLJJJJ;
        if (interfaceC619810OSt != null) {
            interfaceC619810OSt.LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemViewCreated() {
        /*
            r5 = this;
            super.onItemViewCreated()
            android.view.View r2 = r5.itemView
            kotlin.jvm.internal.AwS588S0100000_9 r1 = new kotlin.jvm.internal.AwS588S0100000_9
            r0 = 189(0xbd, float:2.65E-43)
            r1.<init>(r5, r0)
            X.C2211631BhB.LJ(r2, r1)
            boolean r0 = X.C296740Bk8.LIZ()
            r1 = 1
            if (r0 == 0) goto L8a
            X.0OS8 r0 = X.C0OS8.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinScrollOptConfiguration r0 = X.C0OS8.LJII()
            java.lang.Integer r0 = r0.enableDelayedSubscribe
            if (r0 == 0) goto L8a
            int r0 = r0.intValue()
            if (r0 != r1) goto L8a
        L29:
            boolean r0 = X.C296740Bk8.LIZ()
            if (r0 == 0) goto L45
            X.0OS8 r0 = X.C0OS8.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinScrollOptConfiguration r0 = X.C0OS8.LJII()
            java.lang.Integer r0 = r0.enableWidgetPreInit
            if (r0 == 0) goto L45
            int r0 = r0.intValue()
            if (r0 != r1) goto L45
            r5.v6()
        L45:
            boolean r0 = X.C0OS8.LIZLLL()
            if (r0 == 0) goto L65
            android.view.View r0 = r5.itemView
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r4 = r0.widthPixels
            boolean r0 = r5.To()
            if (r0 == 0) goto L66
            float r1 = (float) r4
            r0 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r0
            int r0 = (int) r1
            r5.P5(r0)
        L65:
            return
        L66:
            android.view.View r1 = r5.itemView
            r0 = 2131366074(0x7f0a10ba, float:1.8352031E38)
            android.view.View r3 = r1.findViewById(r0)
            if (r3 == 0) goto L65
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L65
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 == 0) goto L65
            float r1 = (float) r4
            r0 = 1041865114(0x3e19999a, float:0.15)
            float r1 = r1 * r0
            int r0 = (int) r1
            r2.setMarginEnd(r0)
            X.C786410Ut5.W5(r3, r2)
            return
        L8a:
            r5.z6()
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell.onItemViewCreated():void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        BulletinListScrollToViewModel bulletinListScrollToViewModel;
        C0OOP c0oop;
        super.onViewAttachedToWindow();
        T item = getItem();
        if (item != null) {
            BulletinCellVmHolder bulletinCellVmHolderU6 = u6();
            if (bulletinCellVmHolderU6 == null || (bulletinListScrollToViewModel = (BulletinListScrollToViewModel) bulletinCellVmHolderU6.LLILLJJLI.getValue()) == null) {
                AssemVMLazy assemVMLazy = this.LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
                bulletinListScrollToViewModel = (BulletinListScrollToViewModel) assemVMLazy.getValue();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unreadHasExpose: id ");
            sbLIZ.append(item.LJJJ());
            sbLIZ.append("， contentType: ");
            sbLIZ.append(item.LIZLLL());
            sbLIZ.append(", text: ");
            String str = null;
            if ((item instanceof C0OOP) && (c0oop = (C0OOP) item) != null) {
                str = c0oop.LLJILJIL;
            }
            sbLIZ.append(str);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            if (!bulletinListScrollToViewModel.LL && (item.LJJJ() == null || ((Set) bulletinListScrollToViewModel.LLILLJJLI.getValue()).add(item.LJJJ()))) {
                if (item.LJJIJLIJ()) {
                    C0OPX.LJII("setFlow: target has been show");
                    bulletinListScrollToViewModel.LLILZIL.setValue(new C0OLG(false, 0));
                    bulletinListScrollToViewModel.LL = true;
                } else {
                    int i = bulletinListScrollToViewModel.LLILLL - 1;
                    bulletinListScrollToViewModel.LLILLL = i;
                    if (i > 0) {
                        bulletinListScrollToViewModel.LLILZIL.setValue(new C0OLG(bulletinListScrollToViewModel.LLILZ == EnumC617480OJu.SUBSCRIBED, i));
                    } else {
                        bulletinListScrollToViewModel.LLILZIL.setValue(new C0OLG(false, 0));
                    }
                }
            }
            if (item.LLILLL) {
                C0OPI.LIZ.getClass();
                C0OPH c0oph = (C0OPH) ((LinkedHashMap) C0OPI.LIZIZ).get(item.LJJJ());
                if (c0oph != null && c0oph.LJI()) {
                    c0oph.LJII.LIZIZ();
                }
            }
            C0OTE c0ote = this.LLJJJIL;
            if (c0ote != null) {
                C2481009ns c2481009ns = c0ote.LIZLLL;
                if (c2481009ns != null) {
                    c2481009ns.LJIILJJIL();
                }
                C2481009ns c2481009ns2 = c0ote.LJ;
                if (c2481009ns2 != null) {
                    c2481009ns2.LJIILJJIL();
                }
                C2481009ns c2481009ns3 = c0ote.LJFF;
                if (c2481009ns3 != null) {
                    c2481009ns3.LJIILJJIL();
                }
                C2481009ns c2481009ns4 = c0ote.LJI;
                if (c2481009ns4 != null) {
                    c2481009ns4.LJIILJJIL();
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewDetachedFromWindow() {
        C0OTE c0ote;
        super.onViewDetachedFromWindow();
        if (getItem() == null || (c0ote = this.LLJJJIL) == null) {
            return;
        }
        C2481009ns c2481009ns = c0ote.LIZLLL;
        if (c2481009ns != null) {
            c2481009ns.LJIILL();
        }
        C2481009ns c2481009ns2 = c0ote.LJ;
        if (c2481009ns2 != null) {
            c2481009ns2.LJIILL();
        }
        C2481009ns c2481009ns3 = c0ote.LJFF;
        if (c2481009ns3 != null) {
            c2481009ns3.LJIILL();
        }
        C2481009ns c2481009ns4 = c0ote.LJI;
        if (c2481009ns4 != null) {
            c2481009ns4.LJIILL();
        }
    }

    public final BulletinPublishViewModel q6() {
        BulletinPublishViewModel bulletinPublishViewModel;
        BulletinCellVmHolder bulletinCellVmHolderU6 = u6();
        if (bulletinCellVmHolderU6 != null && (bulletinPublishViewModel = (BulletinPublishViewModel) bulletinCellVmHolderU6.LLILLL.getValue()) != null) {
            return bulletinPublishViewModel;
        }
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (BulletinPublishViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void unBind() {
        super.unBind();
        InterfaceC619810OSt interfaceC619810OSt = this.LLJJJJ;
        if (interfaceC619810OSt != null) {
            interfaceC619810OSt.LIZIZ();
        }
    }

    public void v6() {
        if (To()) {
            if (this.LLJJIJIL == null) {
                this.LLJJIJIL = new C618790OOv((ViewStub) this.itemView.findViewById(R.id.d4r), q6(), a6(), e6());
            }
        } else if (this.LLJJIJIIJIL == null) {
            this.LLJJIJIIJIL = U5();
        }
    }

    public final void w6() {
        final C21568919b5 c21568919b5R6 = r6();
        if (!(c21568919b5R6 instanceof InterfaceC619830OSv) || c21568919b5R6 == null) {
            return;
        }
        c21568919b5R6.setGestureCallback(new InterfaceC636520Oxu() { // from class: X.0OSj
            @Override // X.InterfaceC636520Oxu
            public final void LIZ() {
                BulletinBaseCell<T> bulletinBaseCell = this.LIZ;
                c21568919b5R6.getMsgContentView();
                bulletinBaseCell.D6();
            }

            @Override // X.InterfaceC636520Oxu
            public final boolean LIZIZ() {
                return this.LIZ.U6(c21568919b5R6.getMsgContentView());
            }

            @Override // X.InterfaceC636520Oxu
            public final void LIZJ() {
                BulletinBaseCell<T> bulletinBaseCell = this.LIZ;
                c21568919b5R6.getMsgContentView();
                bulletinBaseCell.V5();
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility
    public final View MH2() {
        return this.itemView;
    }

    public static BulletinListViewModel I5(BulletinBaseCell bulletinBaseCell) throws IllegalAccessException {
        InterfaceC617160OIo interfaceC617160OIo;
        C0QSJ c0qsjT5 = bulletinBaseCell.T5();
        InterfaceC617290OJb interfaceC617290OJb = null;
        if (c0qsjT5 != null) {
            interfaceC617160OIo = (InterfaceC617160OIo) c0qsjT5.getAbility(InterfaceC617160OIo.class);
            C687700QyG.LJ(interfaceC617160OIo, InterfaceC617160OIo.class);
        } else {
            interfaceC617160OIo = null;
        }
        C0QSJ c0qsjT52 = bulletinBaseCell.T5();
        if (c0qsjT52 != null) {
            interfaceC617290OJb = (InterfaceC617290OJb) c0qsjT52.getAbility(InterfaceC617290OJb.class);
            C687700QyG.LJ(interfaceC617290OJb, InterfaceC617290OJb.class);
        }
        return new BulletinListViewModel(interfaceC617160OIo, interfaceC617290OJb);
    }

    public static BulletinPublishViewModel L5(BulletinBaseCell bulletinBaseCell) throws IllegalAccessException {
        C0OJU c0oju;
        C0QSJ c0qsjT5 = bulletinBaseCell.T5();
        if (c0qsjT5 != null) {
            c0oju = (C0OJU) c0qsjT5.getAbility(C0OJU.class);
            C687700QyG.LJ(c0oju, C0OJU.class);
        } else {
            c0oju = null;
        }
        return new BulletinPublishViewModel(c0oju);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: K6, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        Long lLJJJ;
        EnumC618810OOx enumC618810OOxLIZLLL;
        View view = this.itemView;
        Integer numValueOf = null;
        if (t != null) {
            lLJJJ = t.LJJJ();
        } else {
            lLJJJ = null;
        }
        view.setTag(R.id.d2g, lLJJJ);
        if (t != null && (enumC618810OOxLIZLLL = t.LIZLLL()) != null) {
            numValueOf = Integer.valueOf(enumC618810OOxLIZLLL.getType());
        }
        view.setTag(R.id.d2f, numValueOf);
        super.onBindItemView(t);
        this.LLJJJJJIL = f6().JQ2(t);
        if (C296740Bk8.LIZ()) {
            C0OS8.LIZ.getClass();
            Integer num = C0OS8.LJII().enableDelayedSubscribe;
            if (num != null && num.intValue() == 1 && !this.LLJJJJLIIL) {
                z6();
                this.LLJJJJLIIL = true;
            }
        }
        C6();
        InterfaceC619820OSu interfaceC619820OSu = this.LLJJIJIIJIL;
        if (interfaceC619820OSu != null) {
            interfaceC619820OSu.LJ(t);
        }
        C618790OOv c618790OOv = this.LLJJIJIL;
        if (c618790OOv != null) {
            c618790OOv.LIZLLL(t);
        }
        C0OR1 c0or1 = this.LLJJJ;
        if (c0or1 != null) {
            c0or1.LIZLLL(t);
        }
        InterfaceC619810OSt interfaceC619810OSt = this.LLJJJJ;
        if (interfaceC619810OSt != null) {
            interfaceC619810OSt.LJIIIIZZ(t, this.LLJJJJJIL, false, "");
        }
        R5(t);
        V6(t);
        this.itemView.setPadding(0, 0, 0, t.LJJJJI());
    }

    public final void P5(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewFindViewById = this.itemView.findViewById(R.id.d0e);
        if (viewFindViewById == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(i);
            C786410Ut5.W5(viewFindViewById, marginLayoutParams);
        }
    }

    public final void R5(T t) {
        ViewGroup.MarginLayoutParams marginLayoutParamsLJI;
        ViewGroup.MarginLayoutParams marginLayoutParamsLJI2;
        int iLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParamsLJI3;
        int iLIZIZ2;
        ViewGroup viewGroup;
        ViewGroup.MarginLayoutParams marginLayoutParamsLJI4;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLIZIZ5;
        C0OTE c0ote = this.LLJJJIL;
        if (c0ote != null) {
            int iLIZIZ6 = 0;
            if (C0OS8.LIZLLL()) {
                View viewFindViewById = this.itemView.findViewById(R.id.d0b);
                if (viewFindViewById != null && (marginLayoutParamsLJI4 = C1383370m6R.LJI(viewFindViewById)) != null) {
                    if (C617620OKi.LIZJ(t)) {
                        iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    } else {
                        iLIZIZ3 = 0;
                    }
                    marginLayoutParamsLJI4.topMargin = iLIZIZ3;
                    if (To()) {
                        if (C617620OKi.LIZIZ(t, a6())) {
                            iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        } else {
                            iLIZIZ5 = 0;
                        }
                        marginLayoutParamsLJI4.setMarginStart(iLIZIZ5);
                    } else {
                        if (C617620OKi.LIZ(t, a6())) {
                            iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        } else {
                            iLIZIZ4 = 0;
                        }
                        marginLayoutParamsLJI4.setMarginEnd(iLIZIZ4);
                    }
                    C786410Ut5.W5(viewFindViewById, marginLayoutParamsLJI4);
                }
                if (!this.LLJL && (viewGroup = (ViewGroup) this.itemView.findViewById(R.id.d0d)) != null) {
                    Space space = new Space(viewGroup.getContext());
                    C786410Ut5.f6(space, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup.addView(space, 0);
                    this.LLJL = true;
                }
                c0ote.LJFF(t);
                return;
            }
            if (this.LLILLL == null) {
                this.LLILLL = (Space) this.itemView.findViewById(R.id.f727jf8);
            }
            if (this.LLILZ == null) {
                this.LLILZ = (Space) this.itemView.findViewById(R.id.jf7);
            }
            if (this.LLILZIL == null) {
                this.LLILZIL = (Space) this.itemView.findViewById(R.id.jf6);
            }
            Space space2 = this.LLILLL;
            if (space2 != null && (marginLayoutParamsLJI3 = C1383370m6R.LJI(space2)) != null) {
                if (C617620OKi.LIZJ(t)) {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                } else {
                    iLIZIZ2 = 0;
                }
                marginLayoutParamsLJI3.bottomMargin = iLIZIZ2;
            }
            Space space3 = this.LLILZ;
            if (space3 != null && (marginLayoutParamsLJI2 = C1383370m6R.LJI(space3)) != null) {
                if (C617620OKi.LIZIZ(t, a6())) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                } else {
                    iLIZIZ = 0;
                }
                marginLayoutParamsLJI2.setMarginEnd(iLIZIZ);
            }
            Space space4 = this.LLILZIL;
            if (space4 != null && (marginLayoutParamsLJI = C1383370m6R.LJI(space4)) != null) {
                if (C617620OKi.LIZ(t, a6())) {
                    iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                marginLayoutParamsLJI.setMarginStart(iLIZIZ6);
            }
            c0ote.LJFF(t);
        }
    }

    public final void T6(View view) {
        C21568919b5 c21568919b5R6 = r6();
        if ((c21568919b5R6 instanceof InterfaceC619830OSv) && c21568919b5R6 != null) {
            c21568919b5R6.setDispatchView(view);
        }
    }

    public boolean U6(View view) {
        BulletinInteractionAbility bulletinInteractionAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
        if (interfaceC665370Q7zLIZ != null && (bulletinInteractionAbility = (BulletinInteractionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinInteractionAbility.class, null)) != null && (bulletinInteractionAbility.v20() || bulletinInteractionAbility.AK2())) {
            bulletinInteractionAbility.BM1();
            PanelStateViewModel panelStateViewModelH6 = h6();
            panelStateViewModelH6.jt(C1629106Zl.LL, panelStateViewModelH6.Ke().getValue().intValue());
            return true;
        }
        BulletinCommonAbility bulletinCommonAbilityA6 = a6();
        if (bulletinCommonAbilityA6 != null && !bulletinCommonAbilityA6.eb2()) {
            PanelStateViewModel panelStateViewModelH62 = h6();
            panelStateViewModelH62.jt(C1629106Zl.LL, panelStateViewModelH62.Ke().getValue().intValue());
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(T r5) {
        /*
            r4 = this;
            boolean r2 = r5.LJJZZIII()
            X.0OVA r3 = r4.LLJJL
            boolean r0 = X.C296740Bk8.LIZ()
            if (r0 == 0) goto L32
            X.0OS8 r0 = X.C0OS8.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinScrollOptConfiguration r0 = X.C0OS8.LJII()
            java.lang.Integer r0 = r0.enableBindOptimization
            if (r0 == 0) goto L32
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L32
            java.lang.Boolean r1 = r4.LLJJLIIIJLLLLLLLZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L32
            if (r3 == 0) goto L32
        L2e:
            r4.N5(r3, r5)
            return
        L32:
            boolean r0 = r4.To()
            if (r0 == 0) goto L4f
            android.view.View r0 = r4.itemView
            android.content.Context r1 = r0.getContext()
            boolean r0 = X.C444960Hcc.LIZIZ()
            X.0OVA r3 = X.C0OV7.LIZIZ(r1, r2, r0)
        L46:
            r4.LLJJL = r3
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.LLJJLIIIJLLLLLLLZ = r0
            goto L2e
        L4f:
            android.view.View r0 = r4.itemView
            android.content.Context r1 = r0.getContext()
            boolean r0 = X.C444960Hcc.LIZIZ()
            X.0OVA r3 = X.C0OV7.LIZ(r1, r2, r0)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell.V6(com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        ConcurrentHashMap<Integer, ConcurrentLinkedQueue<View>> concurrentHashMap;
        ConcurrentLinkedQueue<View> concurrentLinkedQueue;
        View viewPoll;
        LayoutInflater layoutInflater;
        Executor executor;
        MutableContextWrapper mutableContextWrapper;
        int layoutId = getLayoutId();
        Context context = null;
        if (C0OS8.LJFF() && (concurrentLinkedQueue = (concurrentHashMap = C0OMV.LIZ).get(Integer.valueOf(layoutId))) != null && (viewPoll = concurrentLinkedQueue.poll()) != null) {
            Context context2 = viewPoll.getContext();
            if ((context2 instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context2) != null) {
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                mutableContextWrapper.setBaseContext(context);
            }
            C786410Ut5.W5(viewPoll, new ViewGroup.LayoutParams(-1, -2));
            ConcurrentLinkedQueue<View> concurrentLinkedQueue2 = concurrentHashMap.get(Integer.valueOf(layoutId));
            int i = 0;
            if (C296740Bk8.LIZ()) {
                C0OS8.LIZ.getClass();
                if (!((Boolean) C0OS8.LIZLLL.getValue()).booleanValue()) {
                    i = 5;
                }
            }
            if (concurrentLinkedQueue2 != null && layoutId == C0OMV.LIZJ && i > 0 && concurrentLinkedQueue2.size() < i / 2) {
                int size = i - concurrentLinkedQueue2.size();
                if (C0OS8.LJFF() && (layoutInflater = C0OMV.LIZIZ) != null && (executor = C0OMV.LIZLLL) != null) {
                    executor.execute(new C0OMW(layoutId, size, layoutInflater));
                }
            }
            return viewPoll;
        }
        return super.onCreateItemView(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommentAbility
    public final void s82(boolean z) {
        C19EG c19eg;
        long jOg2;
        long jLongValue;
        UrlModel avatarThumb;
        User curUser;
        int iIntValue;
        boolean zBooleanValue;
        boolean zEb2;
        String strLIZIZ;
        BulletinStyleStruct bulletinStyleStructLJ;
        List<BulletinCardKV> list;
        boolean z2;
        int height;
        View decorView;
        View viewFindViewById;
        BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL;
        List<AbstractC619610ORz> list2;
        AbstractC619610ORz abstractC619610ORz;
        BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL2;
        Boolean bool;
        BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL3;
        Integer num;
        Long lLJJJ;
        BulletinCommonAbility bulletinCommonAbilityA6;
        Long lLJJJ2;
        long jLongValue2 = 0;
        if (!To() && (bulletinCommonAbilityA6 = a6()) != null && bulletinCommonAbilityA6.Nl()) {
            BulletinInteractionAbility bulletinInteractionAbilityE6 = e6();
            if (bulletinInteractionAbilityE6 != null) {
                T item = getItem();
                if (item != null && (lLJJJ2 = item.LJJJ()) != null) {
                    jLongValue2 = lLJJJ2.longValue();
                }
                bulletinInteractionAbilityE6.rE1(String.valueOf(jLongValue2), "comment_panel", null);
                return;
            }
            return;
        }
        String str = BulletinCommentSheetFragment._pnsPageId;
        Activity activityLIZIZ = C737910Sx3.LIZIZ(this.itemView.getContext());
        if (activityLIZIZ instanceof C19EG) {
            c19eg = (C19EG) activityLIZIZ;
        } else {
            c19eg = null;
        }
        Bundle bundle = new Bundle();
        BulletinCommonAbility bulletinCommonAbilityA62 = a6();
        if (bulletinCommonAbilityA62 != null) {
            jOg2 = bulletinCommonAbilityA62.Og2();
        } else {
            jOg2 = 0;
        }
        bundle.putLong("bulletin_board_id", jOg2);
        T item2 = getItem();
        if (item2 != null && (lLJJJ = item2.LJJJ()) != null) {
            jLongValue = lLJJJ.longValue();
        } else {
            jLongValue = 0;
        }
        bundle.putLong("bbItemId", jLongValue);
        bundle.putBoolean("isIdentityCreator", To());
        User user = i6().LLJILLL;
        if (user == null || (avatarThumb = user.getAvatarThumb()) == null) {
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null) {
                avatarThumb = curUser.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
        }
        C786410Ut5.LJJIZ(bundle, "creatorAvatar", avatarThumb);
        T item3 = getItem();
        if (item3 != null && (bulletinCommentUIOverviewLJIILIIL3 = item3.LJIILIIL()) != null && (num = bulletinCommentUIOverviewLJIILIIL3.total) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        bundle.putInt("totalCommentCount", iIntValue);
        T item4 = getItem();
        if (item4 != null && (bulletinCommentUIOverviewLJIILIIL2 = item4.LJIILIIL()) != null && (bool = bulletinCommentUIOverviewLJIILIIL2.enableComment) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        bundle.putBoolean("enableComment", zBooleanValue);
        bundle.putBoolean("isChannelOpen", i6().q11());
        BulletinCommonAbility bulletinCommonAbilityA63 = a6();
        if (bulletinCommonAbilityA63 != null) {
            zEb2 = bulletinCommonAbilityA63.eb2();
        } else {
            zEb2 = false;
        }
        bundle.putBoolean("enableAction", zEb2);
        T item5 = getItem();
        if (item5 == null || (bulletinCommentUIOverviewLJIILIIL = item5.LJIILIIL()) == null || (list2 = bulletinCommentUIOverviewLJIILIIL.comments) == null || (abstractC619610ORz = (AbstractC619610ORz) C13LP.LJJJLL(list2)) == null || (strLIZIZ = abstractC619610ORz.LIZ()) == null || strLIZIZ.length() <= 0) {
            T item6 = getItem();
            if (item6 != null) {
                strLIZIZ = C619000OPq.LIZIZ(item6);
            } else {
                strLIZIZ = null;
            }
        }
        C786410Ut5.LJJJI("content_type", strLIZIZ, bundle);
        bundle.putBoolean("openKeyboard", z);
        C786410Ut5.LJJJI("enterFrom", "bulletin_board_page", bundle);
        HashMap map = new HashMap(S5());
        T item7 = getItem();
        if (((item7 instanceof C0OOP) || (item7 instanceof BulletinVoiceItem)) && (bulletinStyleStructLJ = item7.LJ()) != null && (list = bulletinStyleStructLJ.extra) != null) {
            for (BulletinCardKV bulletinCardKV : list) {
                if (bulletinCardKV != null) {
                    String str2 = bulletinCardKV.key;
                    String str3 = bulletinCardKV.value;
                    if (str2 != null && str2.length() != 0 && str3 != null) {
                        map.put(str2, str3);
                    }
                }
            }
        }
        if (!map.isEmpty()) {
            C786410Ut5.LJJIZ(bundle, "extra_event_params", new HashMap(map));
        }
        C0P4S c0p4s = new C0P4S(this, 0);
        if (c19eg == null) {
            return;
        }
        FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
        long j = bundle.getLong("bbItemId");
        if (C279150Awr.LIZ() && j != 0 && j == BulletinCommentSheetFragment.LLJJIJIIJIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        bundle.putBoolean("useCacheData", z2);
        if (C279150Awr.LIZ()) {
            BulletinCommentSheetFragment.LLJJIJIIJIL = j;
        }
        BulletinCommentSheetFragment bulletinCommentSheetFragment = new BulletinCommentSheetFragment();
        bulletinCommentSheetFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        Window window = c19eg.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(android.R.id.content)) != null) {
            height = viewFindViewById.getHeight();
        } else {
            height = 0;
        }
        int iLJIIJJI = height - C12ES.LJIIJJI(c19eg);
        int iLJIIIIZZ = C12ES.LJIIIIZZ(c19eg);
        if (iLJIIIIZZ >= iLJIIJJI) {
            iLJIIJJI = iLJIIIIZZ;
        }
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = (int) (iLJIIJJI * 0.68f);
        tuxSheet.LLJJIJI = bulletinCommentSheetFragment;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLILLJJLI = new C0P4S(c0p4s, 2);
        tuxSheet.show(supportFragmentManager, "BulletinCommentSheetFragment");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L6, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t, List<? extends Object> list) {
        InterfaceC619810OSt interfaceC619810OSt;
        InterfaceC619820OSu interfaceC619820OSu;
        C0OR1 c0or1;
        setItem(t);
        this.LLJJJJJIL = f6().JQ2(t);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (!(objLJJJLZIJ instanceof C619660OSe)) {
            return;
        }
        C619660OSe c619660OSe = (C619660OSe) objLJJJLZIJ;
        if (c619660OSe.LIZJ) {
            V6(t);
        }
        if (c619660OSe.LIZIZ && (c0or1 = this.LLJJJ) != null) {
            c0or1.LIZLLL(t);
        }
        if (c619660OSe.LIZLLL) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBindItemView() - payload.isResentChange = true");
            sbLIZ.append(t);
            C1720106oR.LJI("wwwzccc", C2188811AlT.LIZIZ(sbLIZ));
            C618790OOv c618790OOv = this.LLJJIJIL;
            if (c618790OOv != null) {
                c618790OOv.LIZLLL(t);
            }
        }
        if (c619660OSe.LJ) {
            this.itemView.setPadding(0, 0, 0, t.LJJJJI());
        }
        if (c619660OSe.LJFF && (interfaceC619820OSu = this.LLJJIJIIJIL) != null) {
            interfaceC619820OSu.LJ(t);
        }
        if (c619660OSe.LJI && (interfaceC619810OSt = this.LLJJJJ) != null) {
            interfaceC619810OSt.LJIIIIZZ(t, this.LLJJJJJIL, false, "");
        }
        if (c619660OSe.LJIIIZ && C293310Beb.LIZJ()) {
            C618910OPh c618910OPh = C618910OPh.LIZ;
            List<BulletinEmojiItem> listLJIJJLI = t.LJIJJLI();
            int i2 = t.emojiShowCnt;
            String strValueOf = String.valueOf(t.LJJJ());
            BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL = t.LJIILIIL();
            c618910OPh.getClass();
            t.LLFFF(C618910OPh.LJIIJJI(listLJIJJLI, i2, strValueOf, false, "", bulletinCommentUIOverviewLJIILIIL));
            InterfaceC619810OSt interfaceC619810OSt2 = this.LLJJJJ;
            if (interfaceC619810OSt2 != null) {
                interfaceC619810OSt2.LJIIIIZZ(t, this.LLJJJJJIL, false, "");
            }
        }
        if (c619660OSe.LJIIIIZZ) {
            R5(t);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:9|(1:32)(18:13|(3:16|(3:18|(2:20|99)(1:100)|21)(3:97|22|23)|14)|98|(2:25|(1:27)(2:28|(1:30)(1:31)))|34|(1:36)(1:42)|37|(1:39)(1:41)|40|95|43|(9:45|57|(3:59|(1:75)|65)(2:76|(1:78)(4:79|(1:81)(3:85|(1:91)(1:93)|92)|82|(1:84)(1:94)))|66|(1:68)|69|(1:71)(1:74)|72|73)|48|(1:50)(1:56)|51|(1:53)|54|55)|33|34|(0)(0)|37|(0)(0)|40|95|43|(0)|48|(0)(0)|51|(0)|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c6, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void if2(final java.lang.String r32, final java.lang.String r33, final X.C0OSZ r34) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell.if2(java.lang.String, java.lang.String, X.0OSZ):void");
    }
}
