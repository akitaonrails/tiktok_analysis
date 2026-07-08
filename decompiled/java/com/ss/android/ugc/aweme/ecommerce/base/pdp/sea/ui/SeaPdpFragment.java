package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui;

import X.AbstractC1252750ihl;
import X.AbstractC1757620vq4;
import X.AnonymousClass0317;
import X.AnonymousClass0378;
import X.AnonymousClass0412;
import X.C004I;
import X.C01GW;
import X.C034S;
import X.C036A;
import X.C04DU;
import X.C04FO;
import X.C098200Yq;
import X.C0QSJ;
import X.C1005503wT;
import X.C1019103yf;
import X.C1029960cuQ;
import X.C10328042c;
import X.C1053804Ae;
import X.C1054104Ah;
import X.C1058404By;
import X.C1120604Zw;
import X.C1121904a9;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C11JF;
import X.C1318510kPp;
import X.C1323720kYE;
import X.C1338430kvx;
import X.C1338770kwV;
import X.C1391190mJ3;
import X.C13BV;
import X.C13LE;
import X.C1440005kM;
import X.C1558360qeg;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C16BC;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1755530vmh;
import X.C1755600vmo;
import X.C1756210vnn;
import X.C1756260vns;
import X.C1756270vnt;
import X.C1756330vnz;
import X.C1756370vo3;
import X.C1756670voX;
import X.C1757250vpT;
import X.C1757570vpz;
import X.C1757830vqP;
import X.C1759490vt5;
import X.C1759940vto;
import X.C1765020w20;
import X.C1765350w2X;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C19MB;
import X.C1AF0;
import X.C1AQS;
import X.C2097908Jt;
import X.C214820195e;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2371409Qy;
import X.C256300yv;
import X.C299110Bnx;
import X.C300210Bpj;
import X.C426750GoL;
import X.C430110Gtl;
import X.C452501pT;
import X.C616540OGe;
import X.C672920QaQ;
import X.C673150Qan;
import X.C679280Qkg;
import X.C687700QyG;
import X.C770702zh;
import X.C786410Ut5;
import X.EnumC1014603xw;
import X.EnumC1486810onH;
import X.EnumC1755520vmg;
import X.InterfaceC1075600e62;
import X.InterfaceC1146704e9;
import X.InterfaceC1171660gay;
import X.InterfaceC1541990qEH;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1748810vbr;
import X.InterfaceC1756400vo6;
import X.InterfaceC1756430vo9;
import X.InterfaceC1756660voW;
import X.InterfaceC1756810vol;
import X.InterfaceC1756830von;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC687730QyJ;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadBffVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.CommonParamsContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.GroupManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.ItemModuleManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.ItemViewModelManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PdpContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PdpViewModelDelegate;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpBodyListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.TrackParamsContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.register.CardRegisterProvider;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.goda.SeaGodaManagerV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.popup.model.SeaPdpPopupData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.ISeaPdpMediaControlService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.IPdpTriggerService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.action.ISeaPdpActionManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.myna.ISeaPdpPageService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpVideoShrinkAllowListExperiment;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonfeed.CommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.player.PlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.BusinessModuleService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS12S0000001_26;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS20S0000100_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpFragment extends ECBaseSheetFragment implements InterfaceC1171660gay, InterfaceC1075600e62<ViewModelProvider.Factory>, InterfaceC1756830von, C04DU, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvHELIOSLGExKTYpZz83OGs/LC59PSxiGioyGCE8Dz0yLygpJzs=";
    public C1318510kPp LLIZ;
    public FrameLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public C1338770kwV LLJIJIL;
    public FrameLayout LLJILJIL;
    public FrameLayout LLJILJILJ;
    public C1759490vt5 LLJILLL;
    public C1338430kvx LLJJ;
    public FrameLayout LLJJI;
    public FrameLayout LLJJIII;
    public boolean LLJJIJI;
    public Integer LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C11JF LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public Function1<? super Boolean, Unit> LLJJJJLIIL;
    public Function1<? super Boolean, Unit> LLJJL;
    public boolean LLJL;
    public boolean LLJLIL;
    public C1756330vnz LLJLILLLLZIIL;
    public C1757570vpz LLJZIJLIL;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public View LLLIIII;
    public View LLLIIIIL;
    public View LLLIIIL;
    public View LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public final lifecycleAwareLazy LLLILZLLLI;
    public C1756370vo3 LLLIZZ;
    public final C01GW LLLJ;
    public InterfaceC1756430vo9 LLLJIL;
    public final AwS570S0100000_26 LLLJL;
    public final C01GW LLLL;
    public final C1058404By LLLLII;
    public final C01GW LLLLIIIILLL;
    public final Map<String, Class<?>> LLLLIIL;
    public final C01GW LLLLIILL;
    public final C01GW LLLLIILLL;
    public final C01GW LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public boolean LLLLJI;
    public float LLLLL;
    public final AwS570S0100000_26 LLLLLIL;
    public final AwS570S0100000_26 LLLLLILLIL;
    public ISeaPdpCommunicationService LLLLLJIL;
    public CommonParamsContext LLLLLJLJLL;
    public GroupManager LLLLLL;
    public ItemModuleManager LLLLLLIL;
    public ItemViewModelManager LLLLLLJ;
    public PageStateContext LLLLLLL;
    public PdpContext LLLLLLLLL;
    public PdpViewModelDelegate LLLLLLLLLL;
    public SeaPdpBodyListHelper LLLLLLLZIL;
    public TrackParamsContext LLLLLLZ;
    public CardRegisterProvider LLLLLLZZ;
    public SeaGodaManagerV2 LLLLLZ;
    public ISeaPdpMediaControlService LLLLLZIL;
    public IPdpTriggerService LLLLLZL;
    public ISeaPdpActionManager LLLLZ;
    public ISeaPdpPageService LLLLZI;
    public final AnonymousClass0412 LLJJJ = new AnonymousClass0412();
    public long LLJJLIIIJLLLLLLLZ = -1;
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 414));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 416));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1360));
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(119));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 418));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS570S0100000_26(this, 421));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS570S0100000_26(this, 430));
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 427));
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 422));

    public SeaPdpFragment() {
        AwS640S0100000_26 awS640S0100000_26 = new AwS640S0100000_26(this, 21);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 172);
        this.LLLILZLLLI = new lifecycleAwareLazy(this, awS546S0100000_2, new AwS154S0400000_26(this, awS546S0100000_2, c19719912DlLIZ, awS640S0100000_26, 6));
        this.LLLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 419));
        this.LLLJL = new AwS570S0100000_26(this, 415);
        this.LLLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 429));
        this.LLLLII = new C1058404By(this);
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 428));
        this.LLLLIIL = C2097908Jt.LIZJ(new Pair("pdp_sea_header_style_1", SeaPdpHeadBffVO.class));
        this.LLLLIILL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 417));
        this.LLLLIILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1359));
        this.LLLLIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(225));
        this.LLLLJ = true;
        this.LLLLL = -1.0f;
        this.LLLLLIL = new AwS570S0100000_26(this, 426);
        this.LLLLLILLIL = new AwS570S0100000_26(this, 424);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == ISeaPdpCommunicationService.class) {
            this.LLLLLJIL = (ISeaPdpCommunicationService) obj;
        } else if (cls == CommonParamsContext.class) {
            this.LLLLLJLJLL = (CommonParamsContext) obj;
        } else if (cls == GroupManager.class) {
            this.LLLLLL = (GroupManager) obj;
        } else if (cls == ItemModuleManager.class) {
            this.LLLLLLIL = (ItemModuleManager) obj;
        } else if (cls == ItemViewModelManager.class) {
            this.LLLLLLJ = (ItemViewModelManager) obj;
        } else if (cls == PageStateContext.class) {
            this.LLLLLLL = (PageStateContext) obj;
        } else if (cls == PdpContext.class) {
            this.LLLLLLLLL = (PdpContext) obj;
        } else if (cls == PdpViewModelDelegate.class) {
            this.LLLLLLLLLL = (PdpViewModelDelegate) obj;
        } else if (cls == SeaPdpBodyListHelper.class) {
            this.LLLLLLLZIL = (SeaPdpBodyListHelper) obj;
        } else if (cls == TrackParamsContext.class) {
            this.LLLLLLZ = (TrackParamsContext) obj;
        } else if (cls == CardRegisterProvider.class) {
            this.LLLLLLZZ = (CardRegisterProvider) obj;
        } else if (cls == SeaGodaManagerV2.class) {
            this.LLLLLZ = (SeaGodaManagerV2) obj;
        } else if (cls == ISeaPdpMediaControlService.class) {
            this.LLLLLZIL = (ISeaPdpMediaControlService) obj;
        } else if (cls == IPdpTriggerService.class) {
            this.LLLLLZL = (IPdpTriggerService) obj;
        } else if (cls == ISeaPdpActionManager.class) {
            this.LLLLZ = (ISeaPdpActionManager) obj;
        } else if (cls == ISeaPdpPageService.class) {
            this.LLLLZI = (ISeaPdpPageService) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SeaPdpFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void gS() {
        this.LLLLILI = true;
        C1765350w2X c1765350w2XZS = zS();
        if (c1765350w2XZS != null) {
            c1765350w2XZS.G2(4);
        }
        C1054104Ah c1054104Ah = FS().LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJJIFFI = "return";
        }
        C1755530vmh c1755530vmh = new C1755530vmh(FS().getProductId());
        EnumC1755520vmg enumC1755520vmg = EnumC1755520vmg.RETURN;
        c1755530vmh.LIZLLL(enumC1755520vmg);
        c1755530vmh.LIZJ(SR());
        c1755530vmh.LIZIZ();
        C1054104Ah c1054104Ah2 = FS().LLJLIL;
        if (c1054104Ah2 != null) {
            c1054104Ah2.LJJIIZ(enumC1755520vmg);
        }
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == ISeaPdpCommunicationService.class) {
            return this.LLLLLJIL;
        }
        if (cls == CommonParamsContext.class) {
            return this.LLLLLJLJLL;
        }
        if (cls == GroupManager.class) {
            return this.LLLLLL;
        }
        if (cls == ItemModuleManager.class) {
            return this.LLLLLLIL;
        }
        if (cls == ItemViewModelManager.class) {
            return this.LLLLLLJ;
        }
        if (cls == PageStateContext.class) {
            return this.LLLLLLL;
        }
        if (cls == PdpContext.class) {
            return this.LLLLLLLLL;
        }
        if (cls == PdpViewModelDelegate.class) {
            return this.LLLLLLLLLL;
        }
        if (cls == SeaPdpBodyListHelper.class) {
            return this.LLLLLLLZIL;
        }
        if (cls == TrackParamsContext.class) {
            return this.LLLLLLZ;
        }
        if (cls == CardRegisterProvider.class) {
            return this.LLLLLLZZ;
        }
        if (cls == SeaGodaManagerV2.class) {
            return this.LLLLLZ;
        }
        if (cls == ISeaPdpMediaControlService.class) {
            return this.LLLLLZIL;
        }
        if (cls == IPdpTriggerService.class) {
            return this.LLLLLZL;
        }
        if (cls == ISeaPdpActionManager.class) {
            return this.LLLLZ;
        }
        if (cls == ISeaPdpPageService.class) {
            return this.LLLLZI;
        }
        return null;
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "product_detail";
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SeaPdpFragmentScope.class);
        return arrayList;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SeaPdpFragmentScope.class);
        return arrayList;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void iS() {
        this.LLLLILI = true;
        C1765350w2X c1765350w2XZS = zS();
        if (c1765350w2XZS != null) {
            c1765350w2XZS.G2(4);
        }
        C1054104Ah c1054104Ah = FS().LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJJIFFI = "return";
        }
        C1755530vmh c1755530vmh = new C1755530vmh(FS().getProductId());
        EnumC1755520vmg enumC1755520vmg = EnumC1755520vmg.RETURN;
        c1755530vmh.LIZLLL(enumC1755520vmg);
        c1755530vmh.LIZJ(SR());
        c1755530vmh.LIZIZ();
        C1054104Ah c1054104Ah2 = FS().LLJLIL;
        if (c1054104Ah2 != null) {
            c1054104Ah2.LJJIIZ(enumC1755520vmg);
        }
        dismiss();
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == ISeaPdpCommunicationService.class) {
            this.LLLLLJIL = null;
        } else if (cls == CommonParamsContext.class) {
            this.LLLLLJLJLL = null;
        } else if (cls == GroupManager.class) {
            this.LLLLLL = null;
        } else if (cls == ItemModuleManager.class) {
            this.LLLLLLIL = null;
        } else if (cls == ItemViewModelManager.class) {
            this.LLLLLLJ = null;
        } else if (cls == PageStateContext.class) {
            this.LLLLLLL = null;
        } else if (cls == PdpContext.class) {
            this.LLLLLLLLL = null;
        } else if (cls == PdpViewModelDelegate.class) {
            this.LLLLLLLLLL = null;
        } else if (cls == SeaPdpBodyListHelper.class) {
            this.LLLLLLLZIL = null;
        } else if (cls == TrackParamsContext.class) {
            this.LLLLLLZ = null;
        } else if (cls == CardRegisterProvider.class) {
            this.LLLLLLZZ = null;
        } else if (cls == SeaGodaManagerV2.class) {
            this.LLLLLZ = null;
        } else if (cls == ISeaPdpMediaControlService.class) {
            this.LLLLLZIL = null;
        } else if (cls == IPdpTriggerService.class) {
            this.LLLLLZL = null;
        } else if (cls == ISeaPdpActionManager.class) {
            this.LLLLZ = null;
        } else if (cls == ISeaPdpPageService.class) {
            this.LLLLZI = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final C1759490vt5 BS() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ybh) : null;
            this.LLJILLL = (C1759490vt5) viewFindViewById;
        }
        return (C1759490vt5) viewFindViewById;
    }

    public final InterfaceC1756430vo9 ES() {
        IECommerceHostService iECommerceHostService;
        InterfaceC1756430vo9 interfaceC1756430vo9 = this.LLLJIL;
        if (interfaceC1756430vo9 != null) {
            return interfaceC1756430vo9;
        }
        C1005503wT c1005503wT = C1005503wT.LIZ;
        IPdpStarter.PdpEnterParam pdpEnterParam = FS().LLIZ;
        InterfaceC1756430vo9 interfaceC1756430vo9CreateECVideoShrinkAbility = null;
        interfaceC1756430vo9CreateECVideoShrinkAbility = null;
        interfaceC1756430vo9CreateECVideoShrinkAbility = null;
        interfaceC1756430vo9CreateECVideoShrinkAbility = null;
        interfaceC1756430vo9CreateECVideoShrinkAbility = null;
        String str = pdpEnterParam != null ? pdpEnterParam.btmToken : null;
        c1005503wT.getClass();
        String strLIZIZ = C1005503wT.LIZIZ(str);
        List list = ((EcSeaPdpVideoShrinkAllowListExperiment.EcSeaPdpVideoShrinkAllowListModel) EcSeaPdpVideoShrinkAllowListExperiment.LIZIZ.getValue()).allowList;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (strLIZIZ != null && !a0.LJJJIL(strLIZIZ) && !Intrinsics.LJFF(list, Collections.singletonList("")) && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it2.next(), strLIZIZ)) {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        ICommonFeedDependService iCommonFeedDependServiceCreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
                        C1AQS.LIZJ(jElapsedRealtime, 1, ICommonFeedDependService.class.getName(), iCommonFeedDependServiceCreateICommonFeedDependServicebyMonsterPlugin != null ? iCommonFeedDependServiceCreateICommonFeedDependServicebyMonsterPlugin.getClass().getName() : null, iCommonFeedDependServiceCreateICommonFeedDependServicebyMonsterPlugin != null);
                        iECommerceHostService = iCommonFeedDependServiceCreateICommonFeedDependServicebyMonsterPlugin;
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
                    }
                    interfaceC1756430vo9CreateECVideoShrinkAbility = ((ICommonFeedDependService) iECommerceHostService).createECVideoShrinkAbility(getActivity());
                    if (interfaceC1756430vo9CreateECVideoShrinkAbility != null) {
                        interfaceC1756430vo9CreateECVideoShrinkAbility.t1(1, 3);
                        interfaceC1756430vo9CreateECVideoShrinkAbility.LIZJ(this.LLLJL);
                        interfaceC1756430vo9CreateECVideoShrinkAbility.LIZLLL(new AwS570S0100000_26(this, 420));
                        this.LLLJIL = interfaceC1756430vo9CreateECVideoShrinkAbility;
                        return interfaceC1756430vo9CreateECVideoShrinkAbility;
                    }
                }
            }
        }
        return interfaceC1756430vo9CreateECVideoShrinkAbility;
    }

    public final SeaPdpViewModel FS() {
        return (SeaPdpViewModel) this.LLLILZLLLI.getValue();
    }

    public final C214820195e GS() {
        return (C214820195e) this.LLJLL.getValue();
    }

    public final FrameLayout nS() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.c8_) : null;
            this.LLJI = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final SeaPdpBodyWidget oS() {
        return (SeaPdpBodyWidget) this.LLJLLIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0227  */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment.onDestroy():void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        if (!this.LLLLILI && !C036A.LIZIZ()) {
            C1755530vmh c1755530vmh = new C1755530vmh(FS().getProductId());
            EnumC1755520vmg enumC1755520vmg = EnumC1755520vmg.NEXT;
            c1755530vmh.LIZLLL(enumC1755520vmg);
            c1755530vmh.LIZJ(SR());
            c1755530vmh.LIZIZ();
            C1054104Ah c1054104Ah = FS().LLJLIL;
            if (c1054104Ah != null) {
                c1054104Ah.LJJIIZ(enumC1755520vmg);
            }
        }
        this.LLLLILI = false;
        SeaPdpViewModel seaPdpViewModelFS = FS();
        seaPdpViewModelFS.getClass();
        AnonymousClass0378.LIZ().LIZJ("ec_pdp_add_to_cart", seaPdpViewModelFS);
        AnonymousClass0378.LIZ().LIZJ("ec_pdp_buy_now", seaPdpViewModelFS);
        String productId = FS().getProductId();
        C256300yv.LIZ();
        C256300yv.LIZ.remove(productId);
        super.onStop();
    }

    public final FrameLayout qS() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cbk) : null;
            this.LLJ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1338770kwV rS() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.eqx) : null;
            this.LLJIJIL = (C1338770kwV) viewFindViewById;
        }
        return (C1338770kwV) viewFindViewById;
    }

    public final FrameLayout sS() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.f9k) : null;
            this.LLIZLLLIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1757250vpT uS() {
        return (C1757250vpT) this.LLLF.getValue();
    }

    public final PageStateContext wS() {
        return (PageStateContext) this.LLLILZ.getValue();
    }

    public final FrameLayout yS() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tl7) : null;
            this.LLJILJILJ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1765350w2X zS() {
        return (C1765350w2X) this.LLLL.getValue();
    }

    public final void NS() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        if (C300210Bpj.LIZ() && QS()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
            }
            ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).hideInternalWindow();
        }
    }

    public final void PS() {
        C1054104Ah c1054104Ah = FS().LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJJJJIZL(false);
        }
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(this, null), SeaPdpFragmentScope.class);
        Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(CommonParamsContext.class) : null;
        CommonParamsContext commonParamsContext = (CommonParamsContext) (ability instanceof CommonParamsContext ? ability : null);
        if (commonParamsContext != null) {
            commonParamsContext.LIZ("half_screen", "_pdp_page_show_type");
        }
        int i = this.LLILZ;
        if (i == 5 || i == 2) {
            return;
        }
        this.LLILZIL = false;
        this.LLILZ = 5;
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIILIIL(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean QS() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = r5.FS()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r0.LLIZ
            if (r0 == 0) goto L35
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.trackParams
            if (r1 == 0) goto L35
            java.lang.String r0 = "source_page_type"
            java.lang.Object r4 = r1.get(r0)
        L12:
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpAllowShowInternalWindowListSettings$EcSeaPdpAllowShowInternalWindowListModel r0 = com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpAllowShowInternalWindowListSettings.LIZ
            com.bytedance.ies.abmock.SettingsManager r3 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpAllowShowInternalWindowListSettings$EcSeaPdpAllowShowInternalWindowListModel> r2 = com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpAllowShowInternalWindowListSettings.EcSeaPdpAllowShowInternalWindowListModel.class
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpAllowShowInternalWindowListSettings$EcSeaPdpAllowShowInternalWindowListModel r1 = com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpAllowShowInternalWindowListSettings.LIZ
            java.lang.String r0 = "ec_sea_pdp_allow_show_live_small_window_source_page_list"
            java.lang.Object r0 = r3.LJIIIIZZ(r0, r2, r1)
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpAllowShowInternalWindowListSettings$EcSeaPdpAllowShowInternalWindowListModel r0 = (com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpAllowShowInternalWindowListSettings.EcSeaPdpAllowShowInternalWindowListModel) r0
            if (r0 != 0) goto L33
            if (r1 == 0) goto L2c
        L28:
            java.util.List<java.lang.String> r0 = r1.allowList
            if (r0 != 0) goto L2e
        L2c:
            X.13BV r0 = X.C13BV.INSTANCE
        L2e:
            boolean r0 = X.C13LP.LJJJJ(r4, r0)
            return r0
        L33:
            r1 = r0
            goto L28
        L35:
            r4 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment.QS():boolean");
    }

    public final boolean RS() {
        IPdpStarter.PdpEnterParam pdpEnterParam = FS().LLIZ;
        return pdpEnterParam != null && pdpEnterParam.playerControl;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        try {
            C1053804Ae c1053804Ae = FS().LLLLL;
            IPdpStarter.PdpEnterParam pdpEnterParam = FS().LLIZ;
            c1053804Ae.LJFF(this, pdpEnterParam != null ? pdpEnterParam.btmToken : null);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void US() {
        C19EG activity;
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        if (RS() && (activity = getActivity()) != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, ICommonFeedDependService.class.getName(), anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null ? anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
            }
            InterfaceC1756810vol feedPlayerAbility = ((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).getFeedPlayerAbility(activity);
            if (feedPlayerAbility != null) {
                feedPlayerAbility.LIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void VR() {
        C1054104Ah c1054104Ah = FS().LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJJJJIZL(false);
        }
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(this, null), SeaPdpFragmentScope.class);
        Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(CommonParamsContext.class) : null;
        CommonParamsContext commonParamsContext = (CommonParamsContext) (ability instanceof CommonParamsContext ? ability : null);
        if (commonParamsContext != null) {
            commonParamsContext.LIZ("half_screen", "_pdp_page_show_type");
        }
        super.VR();
    }

    public final void XS() {
        C19EG activity;
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        if (C300210Bpj.LIZ() && (activity = getActivity()) != null && QS() && (getParentFragment() instanceof DialogFragment)) {
            Map<String, String> mapLIZJ = C2097908Jt.LIZJ(new Pair("from_scene", "sea_pdp"));
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
            }
            ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).showInternalWindow(activity, (DialogFragment) getParentFragment(), Boolean.valueOf(FS().eS2()), mapLIZJ, null, null, null, null);
            this.LLLLJI = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void ZU() {
        C1054104Ah c1054104Ah = FS().LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJJJJIZL(true);
        }
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(this, null), SeaPdpFragmentScope.class);
        Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(CommonParamsContext.class) : null;
        CommonParamsContext commonParamsContext = (CommonParamsContext) (ability instanceof CommonParamsContext ? ability : null);
        if (commonParamsContext != null) {
            commonParamsContext.LIZ("full_screen", "_pdp_page_show_type");
        }
        super.ZU();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final boolean isHalfScreen() {
        IPdpStarter.PdpEnterParam pdpEnterParam = FS().LLIZ;
        boolean z = false;
        if (pdpEnterParam != null && pdpEnterParam.fullScreen) {
            z = true;
        }
        return !z;
    }

    public final void mS() {
        ProductPackStruct productPackStruct;
        Integer num;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        Integer num2;
        View view;
        AddToCartButton addToCartButton;
        Integer num3;
        ProductPackStruct productPackStruct2 = FS().LLJIJIL;
        if ((productPackStruct2 != null && (addToCartButton = productPackStruct2.addToCartButton) != null && (num3 = addToCartButton.status) != null && num3.intValue() == 2) || (productPackStruct = FS().LLJIJIL) == null || (num = productPackStruct.status) == null || num.intValue() != 1 || (pdpEnterParam = FS().LLIZ) == null || (num2 = pdpEnterParam.autoAddToCart) == null || num2.intValue() != 1 || (view = getView()) == null) {
            return;
        }
        C430110Gtl.LIZ(view, new AwS402S0200000_1(view, this, 26));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return onBackPressed();
    }

    @Override // X.InterfaceC1756830von
    public final boolean onBackPressed() {
        C1054104Ah c1054104Ah;
        C1759940vto c1759940vto;
        SeaPdpPopupData seaPdpPopupData;
        PageStateContext pageStateContextWS = wS();
        if ((pageStateContextWS != null ? Intrinsics.LJFF(PageStateContext.LIZ(pageStateContextWS, "page_show_type"), 2) : false) && (c1759940vto = FS().LLLLJI.LLILLL) != null && (seaPdpPopupData = c1759940vto.LIZLLL) != null) {
            c1759940vto.LIZLLL = null;
            c1759940vto.LIZIZ(seaPdpPopupData);
            return true;
        }
        this.LLLLILI = true;
        C1765350w2X c1765350w2XZS = zS();
        if (c1765350w2XZS != null) {
            c1765350w2XZS.G2(4);
        }
        if (!isHalfScreen()) {
            return FS().onBackPressed();
        }
        C1054104Ah c1054104Ah2 = FS().LLJLIL;
        if (c1054104Ah2 != null) {
            c1054104Ah2.LJJIFFI = "return";
        }
        C1755530vmh c1755530vmh = new C1755530vmh(FS().getProductId());
        EnumC1755520vmg enumC1755520vmg = EnumC1755520vmg.RETURN;
        c1755530vmh.LIZLLL(enumC1755520vmg);
        c1755530vmh.LIZJ(SR());
        c1755530vmh.LIZIZ();
        boolean zOnBackPressed = FS().onBackPressed();
        if (!zOnBackPressed && (c1054104Ah = FS().LLJLIL) != null) {
            c1054104Ah.LJJIIZ(enumC1755520vmg);
        }
        return zOnBackPressed;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        SeaPdpActivity seaPdpActivity;
        super.onDetach();
        C19EG activity = getActivity();
        if (!(activity instanceof SeaPdpActivity) || (seaPdpActivity = (SeaPdpActivity) activity) == null) {
            return;
        }
        seaPdpActivity.LLJ = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC1541990qEH kitView;
        super.onPause();
        if (!this.LLLLILI && isHalfScreen() && FS().LLIZLLLIL && RS()) {
            C1440005kM.LIZ(new C1029960cuQ(getContext(), false));
        }
        SeaPdpViewModel seaPdpViewModelFS = FS();
        seaPdpViewModelFS.getClass();
        AnonymousClass0378.LIZ().LIZJ("ec_pdp_open_sku", seaPdpViewModelFS);
        C1054104Ah c1054104Ah = FS().LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJIIJ = SystemClock.elapsedRealtime();
        }
        try {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = FS().LLZIL.LLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView.onHide();
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        NS();
        C1756210vnn.LJI(FS().LLIZ, "t_leave_pdp", true);
        C19EG activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            C1756210vnn.LIZ(FS().LLIZ, true);
        }
        if (this.LLLLILI && isHalfScreen()) {
            FS().QS2(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2;
        InterfaceC1541990qEH kitView;
        C1054104Ah c1054104Ah;
        C1054104Ah c1054104Ah2;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SeaPdpFragment.class.getName());
        }
        ISeaPdpMediaControlService iSeaPdpMediaControlService = (ISeaPdpMediaControlService) this.LLLILZJ.getValue();
        if (iSeaPdpMediaControlService != null) {
            iSeaPdpMediaControlService.oU(EnumC1486810onH.RESUME);
        }
        super.onResume();
        IPdpStarter.PdpEnterParam pdpEnterParam = FS().LLIZ;
        C672920QaQ.LIZ("pdp onResume", pdpEnterParam != null ? pdpEnterParam.trackParams : null);
        if (isHalfScreen()) {
            if (RS()) {
                C1440005kM.LIZ(new C1029960cuQ(getContext(), true));
            }
            if (this.LLJJLIIIJLLLLLLLZ > 0) {
                if (this.LLJL && (c1054104Ah2 = FS().LLJLIL) != null) {
                    long j = this.LLJJLIIIJLLLLLLLZ;
                    InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah2.LJJIZ();
                    if (interfaceC1748810vbrLJJIZ != null) {
                        C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C1756270vnt(), new AwS20S0000100_1(j, 3));
                    }
                }
                if (this.LLJLIL && (c1054104Ah = FS().LLJLIL) != null) {
                    long j2 = this.LLJJLIIIJLLLLLLLZ;
                    InterfaceC1748810vbr interfaceC1748810vbrLJJIZ2 = c1054104Ah.LJJIZ();
                    if (interfaceC1748810vbrLJJIZ2 != null) {
                        C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ2, new C1756260vns(), new AwS20S0000100_1(j2, 2));
                    }
                }
                this.LLJJLIIIJLLLLLLLZ = -1L;
                this.LLJLIL = false;
                this.LLJL = false;
            }
        }
        if (!FS().LLLIIIIL) {
            FS().LLLIIIIL = true;
            C1054104Ah c1054104Ah3 = FS().LLJLIL;
            if (c1054104Ah3 != null) {
                c1054104Ah3.LJJIJL(0);
            }
        }
        SeaPdpViewModel seaPdpViewModelFS = FS();
        seaPdpViewModelFS.getClass();
        AnonymousClass0378.LIZ().LIZLLL("ec_pdp_open_sku", seaPdpViewModelFS);
        try {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = FS().LLZIL.LLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView.onShow();
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (this.LLLLJI) {
            XS();
            if (!FS().LLLLLZ) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
                }
                ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).resetUserManualMuteClickState();
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2 = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime2, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2 != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
                }
                ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2).muteInternalWindow(false);
            }
        }
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(this, 425);
        if (this.LLLLJ) {
            this.LLLLJ = false;
            awS570S0100000_26.invoke();
        }
        ((BusinessModuleService) ServiceManager.get().getService(BusinessModuleService.class)).notifyPDPFullColdBootEnd();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        SeaPdpViewModel seaPdpViewModelFS = FS();
        seaPdpViewModelFS.getClass();
        AnonymousClass0378.LIZ().LIZLLL("ec_pdp_add_to_cart", seaPdpViewModelFS);
        AnonymousClass0378.LIZ().LIZLLL("ec_pdp_buy_now", seaPdpViewModelFS);
        String productId = FS().getProductId();
        SeaPdpViewModel seaPdpViewModelFS2 = FS();
        C256300yv.LIZ();
        C256300yv.LIZ.put(productId, new WeakReference<>(seaPdpViewModelFS2));
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final Function0<Unit> PR() {
        return this.LLLLLILLIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final Function0<Unit> RR() {
        return this.LLLLLIL;
    }

    @Override // X.InterfaceC1075600e62
    public final ViewModelProvider.Factory jl() {
        return this.LLJJJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v41 */
    public final void HS(boolean z) {
        BottomSheetBehavior bottomSheetBehavior;
        Integer numValueOf;
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        Object c098200Yq;
        int iLIZ;
        FrameLayout frameLayout2;
        TuxSheetBehavior tuxSheetBehavior;
        FrameLayout frameLayout3;
        ViewGroup.LayoutParams layoutParams2;
        FrameLayout frameLayout4;
        Object objFindViewById = null;
        if (!z) {
            C1757250vpT c1757250vpTUS = uS();
            AbstractC1757620vq4 abstractC1757620vq4 = uS().LLILZIL;
            boolean z2 = this.LLLIL;
            c1757250vpTUS.getClass();
            C1757250vpT.LIZ(abstractC1757620vq4, false, z2);
            C1338770kwV c1338770kwVRS = rS();
            View viewFindViewById = this.LLJJIII;
            if (viewFindViewById == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.gdk);
                } else {
                    viewFindViewById = null;
                }
                this.LLJJIII = (FrameLayout) viewFindViewById;
            }
            FrameLayout frameLayout5 = this.LLJJI;
            ?? r0 = frameLayout5;
            if (frameLayout5 == null) {
                View view2 = getView();
                if (view2 != null) {
                    objFindViewById = view2.findViewById(R.id.qk1);
                }
                this.LLJJI = (FrameLayout) objFindViewById;
                r0 = objFindViewById;
            }
            if (c1338770kwVRS != null && viewFindViewById != null && r0 != 0) {
                C19MB c19mb = new C19MB();
                c19mb.LIZIZ = false;
                c19mb.LJII(c1338770kwVRS);
                c19mb.LJIIIZ(viewFindViewById.getId(), 4, r0.getId(), 3, 0);
                c19mb.LIZIZ(c1338770kwVRS);
            }
            C1757570vpz c1757570vpz = this.LLJZIJLIL;
            if (c1757570vpz != null && (frameLayout3 = c1757570vpz.LIZ) != null && (layoutParams2 = frameLayout3.getLayoutParams()) != null) {
                layoutParams2.height = 0;
                layoutParams2.width = -1;
                C1757570vpz c1757570vpz2 = this.LLJZIJLIL;
                if (c1757570vpz2 != null && (frameLayout4 = c1757570vpz2.LIZ) != null) {
                    C786410Ut5.X5(layoutParams2, frameLayout4);
                    return;
                }
                return;
            }
            return;
        }
        C1757250vpT c1757250vpTUS2 = uS();
        AbstractC1757620vq4 abstractC1757620vq42 = uS().LLILZIL;
        boolean z3 = this.LLLIL;
        c1757250vpTUS2.getClass();
        C1757250vpT.LIZ(abstractC1757620vq42, true, z3);
        C1338770kwV c1338770kwVRS2 = rS();
        View viewFindViewById2 = this.LLJJIII;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.gdk);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJJIII = (FrameLayout) viewFindViewById2;
        }
        if (c1338770kwVRS2 != null && viewFindViewById2 != null) {
            C19MB c19mb2 = new C19MB();
            c19mb2.LIZIZ = false;
            c19mb2.LJII(c1338770kwVRS2);
            c19mb2.LJI(viewFindViewById2.getId(), 4);
            c19mb2.LIZIZ(c1338770kwVRS2);
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (C299110Bnx.LIZ()) {
            C16BC<?> c16bcWR = WR();
            if (!(c16bcWR instanceof TuxSheetBehavior) || (tuxSheetBehavior = (TuxSheetBehavior) c16bcWR) == null) {
                return;
            } else {
                numValueOf = Integer.valueOf(tuxSheetBehavior.getPeekHeight());
            }
        } else {
            C16BC<?> c16bcWR2 = WR();
            if (!(c16bcWR2 instanceof BottomSheetBehavior) || (bottomSheetBehavior = (BottomSheetBehavior) c16bcWR2) == null) {
                return;
            } else {
                numValueOf = Integer.valueOf(bottomSheetBehavior.getPeekHeight());
            }
        }
        if (numValueOf == null) {
            return;
        }
        int iIntValue = numValueOf.intValue();
        C1757570vpz c1757570vpz3 = this.LLJZIJLIL;
        if (c1757570vpz3 == null || (frameLayout = c1757570vpz3.LIZ) == null || (layoutParams = frameLayout.getLayoutParams()) == null) {
            return;
        }
        try {
            c098200Yq = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.o3));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            objFindViewById = c098200Yq;
        }
        Integer num = (Integer) objFindViewById;
        if (num != null) {
            iLIZ = num.intValue();
        } else {
            iLIZ = C679280Qkg.LIZ(68);
        }
        layoutParams.height = iIntValue - iLIZ;
        layoutParams.width = -1;
        C1757570vpz c1757570vpz4 = this.LLJZIJLIL;
        if (c1757570vpz4 == null || (frameLayout2 = c1757570vpz4.LIZ) == null) {
            return;
        }
        C786410Ut5.X5(layoutParams, frameLayout2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        String strLIZIZ;
        String string;
        ProductPackStruct productPackStruct = FS().LLJIJIL;
        String str = "";
        if (productPackStruct == null || productPackStruct.promotionWaist == null) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append("promotion_waist");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (strLIZIZ.length() > 0) {
            ((HashMap) map).put("ui_elements_data", strLIZIZ);
        }
        SeaPdpViewModel seaPdpViewModelFS = FS();
        if (!seaPdpViewModelFS.LLLFF) {
            SeaPdpMainState seaPdpMainState = (SeaPdpMainState) seaPdpViewModelFS.FQ2();
            HashMap map2 = (HashMap) map;
            map2.put("content_list_size", String.valueOf(seaPdpMainState.getContentList().size()));
            Integer numFR2 = seaPdpViewModelFS.FR2();
            if (numFR2 != null && (string = numFR2.toString()) != null) {
                str = string;
            }
            map2.put("biz_type", str);
            if (seaPdpMainState.getLoadingStatus() == 3) {
                map2.put("blank_type", "error_status");
                return true;
            }
            if (seaPdpViewModelFS.LLJIJIL == null) {
                map2.put("blank_type", "no_meta_data");
                return true;
            }
        }
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.t0h);
            } else {
                viewFindViewById = null;
            }
            this.LLJJ = (C1338430kvx) viewFindViewById;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        if (viewGroup != null) {
            if (viewGroup.getChildCount() > 0 && viewGroup.getHeight() > 0) {
                return false;
            }
        } else {
            C1AF0.LIZJ("recyclerViewFromXml is null");
        }
        ((HashMap) map).put("blank_type", "empty_view");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        SeaPdpViewModel seaPdpViewModelFS = FS();
        seaPdpViewModelFS.getClass();
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS580S0100000_1(seaPdpViewModelFS, 726));
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_param_pass", new AwS580S0100000_1(seaPdpViewModelFS, 727));
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_param_pass", new AwS580S0100000_1(seaPdpViewModelFS, 728));
        C1054104Ah c1054104Ah = seaPdpViewModelFS.LLJLIL;
        if (c1054104Ah != null) {
            C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new C10328042c(c1054104Ah));
        }
    }

    public final boolean VS(IPdpStarter.PdpEnterParam pdpEnterParam) {
        Object objLIZ;
        PdpPreviewInfo pdpPreviewInfo;
        Object c098200Yq;
        Type type;
        if (!C770702zh.LIZIZ(pdpEnterParam.pdpCacheKey) || (objLIZ = C1323720kYE.LIZ(requireContext()).LIZ(pdpEnterParam.pdpCacheKey)) == null) {
            return false;
        }
        C1323720kYE.LIZ(requireContext()).LJI(pdpEnterParam.pdpCacheKey);
        String string = objLIZ.toString();
        Object obj = null;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(PdpPreviewInfo.class));
            } else {
                type = new TypeToken<PdpPreviewInfo>() { // from class: X.0vo7
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, type);
            if (!(objFromJson instanceof PdpPreviewInfo)) {
                objFromJson = null;
            }
            pdpPreviewInfo = (PdpPreviewInfo) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            pdpPreviewInfo = null;
        }
        FS().yS2(pdpPreviewInfo);
        SeaPdpViewModel seaPdpViewModelFS = FS();
        try {
            c098200Yq = Integer.valueOf(JSONObjectProtectorUtils.getInt(new JSONObject(objLIZ.toString()), "cover_index"));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        seaPdpViewModelFS.LLLIL = (Integer) obj;
        return true;
    }

    @Override // X.C04DU
    public final void Yz(C04FO c04fo) {
        C1338770kwV c1338770kwVRS = rS();
        if (c1338770kwVRS != null) {
            c1338770kwVRS.LJJJJJL(c04fo.LJIILLIIL);
        }
    }

    public final void ZS(boolean z) {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin;
        boolean z2;
        boolean z3;
        String name;
        FS().QS2(z);
        if ((!FS().BS2() || FS().LLJJJIL) && isResumed() && this.LLLII && RS()) {
            if (z) {
                View view = getView();
                if (view != null) {
                    HandlerHook.viewPost(view, new ARunnableS110S0100000_10(this, 155));
                }
                ((IPlayerDependencyService) this.LLLLIL.getValue()).playingVideoMute();
                return;
            }
            if (RS()) {
                ((IPlayerDependencyService) this.LLLLIL.getValue()).playingVideoUnMute();
            }
            US();
            if (!FS().q) {
                return;
            }
            String name2 = null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name3 = ILiveDependencyService.class.getName();
                if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
            }
            ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).setCurrentPlayerMute(true);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name4 = IPlayerDependencyService.class.getName();
                if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null) {
                    name2 = anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
            }
            ((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin).playingVideoMute();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0157, code lost:
    
        r7.add(new X.C1756530voJ(r12, r11, r10, r1));
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bS(X.C16G0 r16) {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment.bS(X.16G0):void");
    }

    public final void eT(float f) {
        FrameLayout frameLayout;
        AbstractC1757620vq4 abstractC1757620vq4;
        int i;
        int i2;
        FrameLayout frameLayout2;
        if (f > 1.0f) {
            return;
        }
        if (f >= 0.6f) {
            int iGR2 = (int) (((((double) f) * 2.5d) - 1.5d) * ((double) FS().GR2()));
            View view = this.LLLIIII;
            if (view != null) {
                C426750GoL.LJIIIZ(view, null, Integer.valueOf(iGR2), null, null, false, 29);
            }
            C1757570vpz c1757570vpz = this.LLJZIJLIL;
            if (c1757570vpz != null && (frameLayout2 = c1757570vpz.LIZ) != null) {
                C426750GoL.LJIIIZ(frameLayout2, null, Integer.valueOf(iGR2), null, null, false, 29);
            }
            PageStateContext pageStateContextWS = wS();
            if (pageStateContextWS != null) {
                PageStateContext.LIZLLL(pageStateContextWS, "page_state_sheet", 1);
            }
        } else {
            View view2 = this.LLLIIII;
            if (view2 != null) {
                C426750GoL.LJIIIZ(view2, null, 0, null, null, false, 29);
            }
            C1757570vpz c1757570vpz2 = this.LLJZIJLIL;
            if (c1757570vpz2 != null && (frameLayout = c1757570vpz2.LIZ) != null) {
                C426750GoL.LJIIIZ(frameLayout, null, 0, null, null, false, 29);
            }
            PageStateContext pageStateContextWS2 = wS();
            if (pageStateContextWS2 != null) {
                PageStateContext.LIZLLL(pageStateContextWS2, "page_state_sheet", 0);
            }
        }
        float f2 = 0.0f;
        if (0.0f <= f && f <= 1.0f) {
            C1757250vpT c1757250vpTUS = uS();
            FrameLayout frameLayoutQS = qS();
            if (c1757250vpTUS.LIZLLL() && frameLayoutQS != null && frameLayoutQS.getVisibility() == 0 && (abstractC1757620vq4 = c1757250vpTUS.LLILZIL) != null) {
                abstractC1757620vq4.getView();
                if (abstractC1757620vq4.getVisibility() == 0) {
                    Rect rect = new Rect();
                    Rect rect2 = new Rect();
                    boolean globalVisibleRect = abstractC1757620vq4.getGlobalVisibleRect(rect);
                    boolean globalVisibleRect2 = frameLayoutQS.getGlobalVisibleRect(rect2);
                    if (globalVisibleRect && globalVisibleRect2 && (i = rect.bottom) > (i2 = rect2.top)) {
                        int i3 = i - i2;
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        float y = abstractC1757620vq4.getY() - (i3 + C679280Qkg.LIZ(16));
                        if (y >= 0.0f) {
                            f2 = y;
                        }
                        if (f2 != abstractC1757620vq4.getY()) {
                            C786410Ut5.Ld(abstractC1757620vq4, f2);
                        }
                    }
                }
            }
        }
    }

    public final void fT(float f) {
        RadiusLayout radiusLayout;
        View view = this.LLLIIIIL;
        if (view != null) {
            C786410Ut5.ed(view, f);
        }
        View view2 = this.LLLIIL;
        if (view2 != null && (radiusLayout = (RadiusLayout) view2.findViewById(R.id.f7w)) != null) {
            C786410Ut5.yd(radiusLayout, f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gT(float r6) {
        /*
            r5 = this;
            boolean r0 = X.C299110Bnx.LIZ()
            if (r0 == 0) goto L38
            X.16BC r1 = r5.WR()
            boolean r0 = r1 instanceof com.bytedance.tux.sheet.sheet.TuxSheetBehavior
            if (r0 == 0) goto L49
            com.bytedance.tux.sheet.sheet.TuxSheetBehavior r1 = (com.bytedance.tux.sheet.sheet.TuxSheetBehavior) r1
            if (r1 == 0) goto L49
            int r4 = r1.getPeekHeight()
        L16:
            android.view.View r3 = r5.LLLIIIL
            if (r3 == 0) goto L37
            float r2 = -r6
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L32
            int r1 = X.C958103op.LIZJ()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = r5.FS()
            r0.getClass()
            X.03wT r0 = X.C1005503wT.LIZ
            r0.getClass()
            int r4 = r1 - r4
        L32:
            float r0 = (float) r4
            float r2 = r2 * r0
            X.C786410Ut5.ed(r3, r2)
        L37:
            return
        L38:
            X.16BC r1 = r5.WR()
            boolean r0 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r0 == 0) goto L49
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            if (r1 == 0) goto L49
            int r4 = r1.getPeekHeight()
            goto L16
        L49:
            r4 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment.gT(float):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof SeaPdpActivity) {
            ((SeaPdpActivity) context).LLJ = new AwS570S0100000_26(this, 423);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0613  */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.0veS] */
    /* JADX WARN: Type inference failed for: r2v67, types: [X.04Fm] */
    /* JADX WARN: Type inference failed for: r6v10, types: [X.05Vn, X.099V] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r36) {
        /*
            Method dump skipped, instruction units count: 2330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment.onCreate(android.os.Bundle):void");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        if (RS()) {
            boolean zIsVideoPlaying = ((IPlayerDependencyService) this.LLLLIL.getValue()).isVideoPlaying();
            if (isResumed() && this.LLLII && !zIsVideoPlaying) {
                US();
                if (RS()) {
                    ((IPlayerDependencyService) this.LLLLIL.getValue()).playingVideoUnMute();
                }
            }
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IBusinessDependencyService.class.getName();
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
        }
        ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).setFypAdMaskShowing(false);
        InterfaceC1756660voW.LJLJLJ.getClass();
        C1756670voX.LIZIZ = false;
        if (this.LLLIZZ != null) {
            C1756370vo3.LJ();
        }
    }

    public final boolean JS(IPdpStarter.PdpEnterParam pdpEnterParam, AFwS268S0000000_26 aFwS268S0000000_26) {
        String str;
        String str2;
        Map<String, String> map = pdpEnterParam.pdpPreParam;
        boolean zLIZLLL = C1757830vqP.LIZLLL(pdpEnterParam);
        String str3 = "";
        if (C770702zh.LIZIZ(pdpEnterParam.pdpCacheKey)) {
            if (!VS(pdpEnterParam)) {
                return true;
            }
            PdpPreviewInfo pdpPreviewInfo = FS().LLLIILIL;
            aFwS268S0000000_26.getClass();
            if (!zLIZLLL) {
                SeaPdpViewModel seaPdpViewModelFS = FS();
                PdpPreviewInfo pdpPreviewInfo2 = FS().LLLIILIL;
                if (pdpPreviewInfo2 != null && (str2 = pdpPreviewInfo2.id) != null) {
                    str3 = str2;
                }
                if (seaPdpViewModelFS.UR2(str3)) {
                    return true;
                }
            }
            if (FS().LLLIILIL != null) {
                String productId = pdpEnterParam.getProductId();
                PdpPreviewInfo pdpPreviewInfo3 = FS().LLLIILIL;
                if (pdpPreviewInfo3 != null) {
                    str = pdpPreviewInfo3.id;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(productId, str)) {
                }
            }
            return true;
        }
        String str4 = map.get(FollowStatusChangeMethod.PARAM_UID);
        String str5 = map.get("title");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = map.get("price");
        if (str6 == null) {
            str6 = "";
        }
        String str7 = map.get("cover");
        if (str7 != null && !a0.LJJJIL(str7) && !a0.LJJJIL(str5)) {
            aFwS268S0000000_26.getClass();
            FS().yS2(new PdpPreviewInfo(str5, str6, str7, str4, 0, false, null, null));
            if (!zLIZLLL) {
                SeaPdpViewModel seaPdpViewModelFS2 = FS();
                if (str4 != null) {
                    str3 = str4;
                }
                if (seaPdpViewModelFS2.UR2(str3)) {
                    return true;
                }
            }
        } else if (!zLIZLLL) {
            FS().UR2(FS().getProductId());
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        super.LLLFFI(tuxSheet, f);
        C1765350w2X c1765350w2XZS = zS();
        if (c1765350w2XZS != null) {
            c1765350w2XZS.LLLFFI(tuxSheet, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        super.LLLLIIIILLL(tuxSheet, i);
        C1765350w2X c1765350w2XZS = zS();
        if (c1765350w2XZS != null) {
            c1765350w2XZS.LLLLIIIILLL(tuxSheet, i);
        }
    }

    public final void YS(PopUp popUp, Map<String, ? extends Object> map) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        long jLongValue;
        Object objValueOf;
        String str = popUp.schema;
        if (str == null) {
            return;
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        Object obj = map.get("author_id");
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        builderBuildUpon.appendQueryParameter("anchor_id", string);
        Object obj2 = map.get("source_content_id");
        if (obj2 != null) {
            string2 = obj2.toString();
        } else {
            string2 = null;
        }
        builderBuildUpon.appendQueryParameter("group_id", string2);
        Object obj3 = map.get("entrance_form");
        if (obj3 != null) {
            string3 = obj3.toString();
        } else {
            string3 = null;
        }
        builderBuildUpon.appendQueryParameter("enter_from", string3);
        Object obj4 = map.get("anchor_show_type");
        if (obj4 != null) {
            string4 = obj4.toString();
        } else {
            string4 = null;
        }
        builderBuildUpon.appendQueryParameter("anchor_show_type", string4);
        Object obj5 = map.get("product_source");
        if (obj5 != null) {
            string5 = obj5.toString();
        } else {
            string5 = null;
        }
        builderBuildUpon.appendQueryParameter("product_source", string5);
        Object obj6 = map.get("source_from");
        if (obj6 != null) {
            string6 = obj6.toString();
        } else {
            string6 = null;
        }
        builderBuildUpon.appendQueryParameter("source_from", string6);
        Object obj7 = map.get("source");
        if (obj7 != null) {
            string7 = obj7.toString();
        } else {
            string7 = null;
        }
        builderBuildUpon.appendQueryParameter("source", string7);
        Object obj8 = map.get("product_id");
        if (obj8 != null) {
            string8 = obj8.toString();
        } else {
            string8 = null;
        }
        builderBuildUpon.appendQueryParameter("product_id", string8);
        Object obj9 = map.get("is_self");
        if (obj9 != null) {
            string9 = obj9.toString();
        } else {
            string9 = null;
        }
        builderBuildUpon.appendQueryParameter("is_self", string9);
        Object obj10 = map.get("is_single_anchor");
        if (obj10 != null) {
            string10 = obj10.toString();
        } else {
            string10 = null;
        }
        builderBuildUpon.appendQueryParameter("is_single_anchor", string10);
        Object obj11 = map.get("is_ad");
        if (obj11 != null) {
            string11 = obj11.toString();
        } else {
            string11 = null;
        }
        builderBuildUpon.appendQueryParameter("is_ad", string11);
        Object obj12 = map.get("ad_id");
        if (obj12 != null) {
            string12 = obj12.toString();
        } else {
            string12 = null;
        }
        builderBuildUpon.appendQueryParameter("ad_id", string12);
        String string13 = builderBuildUpon.toString();
        Long l = popUp.fcSecond;
        long j = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Context context = getContext();
        if (context != null) {
            objValueOf = C1323720kYE.LIZ(context).LIZ("ug_last_popup_time");
        } else {
            objValueOf = null;
        }
        if (objValueOf == null) {
            SmartRouter.buildRoute(getContext(), string13).open();
            objValueOf = Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        } else {
            try {
                j = CastLongProtector.parseLong(objValueOf.toString());
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, e, null);
            }
            long j2 = j + jLongValue;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
            if (j2 <= jCurrentTimeMillis / j3) {
                SmartRouter.buildRoute(getContext(), string13).open();
                objValueOf = Long.valueOf(System.currentTimeMillis() / j3);
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            C1323720kYE.LIZ(context2).LJIIIIZZ(objValueOf.toString(), "ug_last_popup_time");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void cS(TuxSheet tuxSheet, float f) {
        BottomSheetBehavior bottomSheetBehavior;
        TuxSheetBehavior tuxSheetBehavior;
        int peekHeight = 0;
        if (this.LLLLL == f) {
            return;
        }
        this.LLLLL = f;
        if (C299110Bnx.LIZ()) {
            C16BC<?> c16bcWR = WR();
            if ((c16bcWR instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcWR) != null) {
                peekHeight = tuxSheetBehavior.getPeekHeight();
            }
        } else {
            C16BC<?> c16bcWR2 = WR();
            if ((c16bcWR2 instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bcWR2) != null) {
                peekHeight = bottomSheetBehavior.getPeekHeight();
            }
        }
        if (f <= 0.0f) {
            fT((-f) * peekHeight);
        } else {
            fT(0.0f);
        }
        gT(f);
        eT(f);
        SeaPdpViewModel seaPdpViewModelFS = FS();
        seaPdpViewModelFS.getClass();
        seaPdpViewModelFS.setStateImmediate(new AwS12S0000001_26(f, 1));
        Iterator it2 = ((ArrayList) FS().LLJJ).iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(Float.valueOf(f));
        }
        C1756330vnz c1756330vnz = this.LLJLILLLLZIIL;
        if (c1756330vnz != null) {
            for (Map.Entry entry : ((LinkedHashMap) c1756330vnz.LJ).entrySet()) {
                Object key = entry.getKey();
                View view = (View) entry.getValue();
                InterfaceC1756400vo6 interfaceC1756400vo6 = (InterfaceC1756400vo6) ((LinkedHashMap) c1756330vnz.LIZLLL).get(key);
                if (interfaceC1756400vo6 != null) {
                    interfaceC1756400vo6.LIZJ(view, f);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r50, android.os.Bundle r51) {
        /*
            Method dump skipped, instruction units count: 1387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dS(int r14, int r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment.dS(int, int, boolean):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ;
        C1765350w2X c1765350w2XZS;
        Context context = getContext();
        C19GS c19gs = null;
        if (context != null) {
            C1755600vmo.LIZ.getClass();
            viewLIZ = C1755600vmo.LIZ(R.layout.aw5, context, viewGroup, false, true);
        } else {
            viewLIZ = null;
        }
        C1005503wT.LIZ.getClass();
        if (viewLIZ != null) {
            viewLIZ.setFitsSystemWindows(true);
        }
        TuxSheet tuxSheetAS = aS();
        if (tuxSheetAS != null) {
            C1765350w2X c1765350w2XZS2 = zS();
            if (c1765350w2XZS2 != null) {
                c1765350w2XZS2.LLILZLL = tuxSheetAS;
            }
            View view = tuxSheetAS.getView();
            if (view != null && (c1765350w2XZS = zS()) != null) {
                c1765350w2XZS.sy(view);
            }
        }
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
