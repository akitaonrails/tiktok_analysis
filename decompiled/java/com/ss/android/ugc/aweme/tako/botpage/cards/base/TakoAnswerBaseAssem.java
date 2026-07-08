package com.ss.android.ugc.aweme.tako.botpage.cards.base;

import X.AbstractC1387200mCc;
import X.AbstractC329610Cw3;
import X.AbstractC738140SxQ;
import X.AnonymousClass0207;
import X.AnonymousClass1418;
import X.C013C;
import X.C019F;
import X.C01GW;
import X.C05PQ;
import X.C05PU;
import X.C07IA;
import X.C07IB;
import X.C093Y;
import X.C09IR;
import X.C09R3;
import X.C09RB;
import X.C09RD;
import X.C0PEM;
import X.C0QSJ;
import X.C0R2Q;
import X.C0ZDN;
import X.C123100dR;
import X.C1390920mIc;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13BV;
import X.C13IQ;
import X.C13LC;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C141H;
import X.C14FI;
import X.C14J2;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1852810yJb;
import X.C1854190yLp;
import X.C1855920yOc;
import X.C1857420yR2;
import X.C1857750yRZ;
import X.C1858330ySV;
import X.C1858340ySW;
import X.C1858660yT2;
import X.C1858670yT3;
import X.C1859930yV5;
import X.C1860130yVP;
import X.C1860730yWN;
import X.C1860750yWP;
import X.C1860780yWS;
import X.C1860790yWT;
import X.C1860830yWX;
import X.C1860860yWa;
import X.C1860870yWb;
import X.C1860910yWf;
import X.C1862130yYd;
import X.C1862180yYi;
import X.C1862330yYx;
import X.C1862420yZ6;
import X.C1862900yZs;
import X.C1863850ybP;
import X.C1864200yby;
import X.C1875207Wc;
import X.C1906580ziK;
import X.C1913307eV;
import X.C1919007fQ;
import X.C19719912Dl;
import X.C19EG;
import X.C19MB;
import X.C1DFH;
import X.C1ER1;
import X.C20230914Dz;
import X.C20235014Fo;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2252331DDr;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C289470BWf;
import X.C323580CmK;
import X.C326880Cre;
import X.C418190GaX;
import X.C418440Gaw;
import X.C434510H2b;
import X.C434520H2c;
import X.C434570H2h;
import X.C434640H2o;
import X.C443120HZe;
import X.C452070Ho5;
import X.C452501pT;
import X.C5183020f;
import X.C597050NbL;
import X.C673150Qan;
import X.C687700QyG;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C985403tE;
import X.DialogC1389620mGW;
import X.DialogInterfaceOnDismissListenerC1864740ycq;
import X.DialogInterfaceOnDismissListenerC1864750ycr;
import X.EnumC1858730yT9;
import X.EnumC1863020ya4;
import X.InterfaceC1146704e9;
import X.InterfaceC1364105Vn;
import X.InterfaceC1860040yVG;
import X.InterfaceC1860810yWV;
import X.InterfaceC1861530yXf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC434180H0u;
import X.InterfaceC434580H2i;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnLayoutChangeListenerC1864650ych;
import X.ViewOnLongClickListenerC1864690ycl;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.AComparatorS46S0000000_27;
import Y.AfS196S0100000_27;
import Y.AsS53S0100000_27;
import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleLynxDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility;
import com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.NimbleLynxDependAbilityImpl;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.NimbleUserDependAbilityImpl;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.NimbleVideoListDependAbilityImpl;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.TakoAnswerImageAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Extra;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLinkItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.common.ui.markdown.style.LinkUnderLineSpan;
import com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailVM;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS122S0400000_27;
import kotlin.jvm.internal.AwS133S0101000_27;
import kotlin.jvm.internal.AwS201S1100000_27;
import kotlin.jvm.internal.AwS271S0300000_27;
import kotlin.jvm.internal.AwS29S1400000_27;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS489S0200000_27;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS95S1200000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes28.dex */
public abstract class TakoAnswerBaseAssem<T extends C1858660yT2> extends TakoBaseAssem<T> implements TakoCardAbility, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLZLLIL;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS554S0100000_10((TakoAnswerBaseAssem) this, 847));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS571S0100000_27((TakoAnswerBaseAssem) this, 738));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS571S0100000_27((TakoAnswerBaseAssem) this, 731));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS571S0100000_27((TakoAnswerBaseAssem) this, 732));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS554S0100000_10((TakoAnswerBaseAssem) this, 848));
    public final AssemVMLazy LLLFZ;
    public final AssemVMLazy LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public AwS571S0100000_27 LLLILZJ;
    public C1860780yWS LLLILZLLLI;
    public long LLLIZZ;
    public long LLLJ;
    public long LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public String LLLLIIL;
    public String LLLLIILL;
    public boolean LLLLIILLL;
    public C1860790yWT LLLLIL;
    public long LLLLILI;
    public final C01GW LLLLJ;
    public final C01GW LLLLJI;
    public final C01GW LLLLL;
    public final C01GW LLLLLIL;
    public Integer LLLLLILLIL;
    public String LLLLLJIL;
    public String LLLLLJLJLL;
    public String LLLLLL;
    public String LLLLLLIL;
    public BitSet LLLLLLJ;
    public int LLLLLLL;
    public int LLLLLLLLL;
    public int LLLLLLLLLL;
    public String LLLLLLLZIL;
    public ViewOnLayoutChangeListenerC1864650ych LLLLLLZ;
    public AsS53S0100000_27 LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public long LLLLLZL;
    public boolean LLLLZ;
    public C1860130yVP LLLLZI;
    public final C2252331DDr LLLLZIL;
    public final C01GW LLLLZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAnswerBaseAssem.class, "takoInnerDetailVM", "getTakoInnerDetailVM()Lcom/ss/android/ugc/aweme/tako/detail/operator/TakoInnerDetailVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoAnswerBaseAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        c09r3.getClass();
        LLLLZLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public void Ed0(int i, String str, String str2, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void Gh0() {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final int IJ0() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final View JQ1() {
        return null;
    }

    public void JU1() {
    }

    public void LLILZLL() {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void ME0() {
    }

    public abstract InterfaceC1860810yWV Tp();

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoAnswerCardScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoAnswerCardScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoAnswerCardScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final Object ly2(AwS489S0200000_27 awS489S0200000_27, InterfaceC1364105Vn interfaceC1364105Vn) {
        return aq(this, awS489S0200000_27, interfaceC1364105Vn);
    }

    public InterfaceC434180H0u nO() {
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public int t70() {
        return 0;
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public TakoAnswerBaseAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoInnerDetailVM.class);
        AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3((C13IQ) c19719912DlLIZ, 62);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(207);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS547S0100000_3, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((AbstractC738140SxQ) this, 735), aFwS269S0000000_27, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLLFZ = assemVMLazy;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoFragmentViewModel.class);
        this.LLLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, C1637806bA.LIZ, new AwS547S0100000_3((C13IQ) c19719912DlLIZ2, 63), AFwS269S0000000_27.get$arr$(208), null, true);
        this.LLLIIII = true;
        this.LLLLJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(565));
        this.LLLLJI = C452501pT.LIZIZ(new AwS571S0100000_27((TakoAnswerBaseAssem) this, 736));
        this.LLLLL = C452501pT.LIZIZ(new AwS571S0100000_27((TakoAnswerBaseAssem) this, 737));
        this.LLLLLIL = C452501pT.LIZIZ(new AwS571S0100000_27((TakoAnswerBaseAssem) this, 734));
        this.LLLLLJIL = "";
        this.LLLLLJLJLL = CardStruct.IStatusCode.DEFAULT;
        this.LLLLLL = "";
        this.LLLLZIL = C09IR.LIZIZ(3, 4, null, 4);
        this.LLLLZLL = C452501pT.LIZIZ(new AwS571S0100000_27((TakoAnswerBaseAssem) this, 733));
    }

    public final TakoChatUIAbility Aq() {
        return (TakoChatUIAbility) this.LLL.getValue();
    }

    public boolean Eq() {
        C1860130yVP c1860130yVP = this.LLLLZI;
        if (c1860130yVP == null) {
            return false;
        }
        int[] iArr = new int[2];
        c1860130yVP.getLocationInWindow(iArr);
        Rect rect = new Rect();
        int i = iArr[0];
        rect.left = i;
        rect.top = iArr[1];
        rect.right = i + c1860130yVP.getWidth();
        rect.bottom = rect.top + c1860130yVP.getHeight();
        int[] iArr2 = new int[2];
        InterfaceC1860810yWV interfaceC1860810yWVTp = Tp();
        if (interfaceC1860810yWVTp != null) {
            interfaceC1860810yWVTp.getLocationInWindow(iArr2);
        }
        InterfaceC1860810yWV interfaceC1860810yWVTp2 = Tp();
        Number numberValueOf = interfaceC1860810yWVTp2 != null ? Float.valueOf(interfaceC1860810yWVTp2.getClickX() + iArr2[0]) : number;
        InterfaceC1860810yWV interfaceC1860810yWVTp3 = Tp();
        return rect.contains(numberValueOf.intValue(), (interfaceC1860810yWVTp3 != null ? Float.valueOf(interfaceC1860810yWVTp3.getClickY() + iArr2[1]) : 0).intValue());
    }

    public final void Xq() {
        TakoChatUIAbility takoChatUIAbilityAq;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvCM;
        if (!this.LLLLLZ || (takoChatUIAbilityAq = Aq()) == null || (viewOnAttachStateChangeListenerC20604515jvCM = takoChatUIAbilityAq.cM()) == null) {
            return;
        }
        AsS53S0100000_27 asS53S0100000_27 = this.LLLLLLZZ;
        if (asS53S0100000_27 != null) {
            viewOnAttachStateChangeListenerC20604515jvCM.removeOnScrollListener(asS53S0100000_27);
        }
        this.LLLLLZ = false;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final Message Yy1() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C1858660yT2) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL.LLILLL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public void cp() {
        IMessageAbility iMessageAbilityYq;
        IMessageAbility iMessageAbilityYq2;
        AwS571S0100000_27 awS571S0100000_27 = this.LLLILZJ;
        if (awS571S0100000_27 != null && (iMessageAbilityYq2 = yq(this)) != null) {
            iMessageAbilityYq2.fc2(awS571S0100000_27);
        }
        this.LLLILZJ = null;
        C1860780yWS c1860780yWS = this.LLLILZLLLI;
        if (c1860780yWS != null && (iMessageAbilityYq = yq(this)) != null) {
            iMessageAbilityYq.z52(c1860780yWS);
        }
        this.LLLILZLLLI = null;
        lq("onHostDestroy");
        Xp("onHostDestroy");
        Zq("onHostDestroy");
        kq();
        Xq();
        this.LLLLLLLZIL = null;
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), TakoCardAbility.class, null);
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), INimbleVideoListDependAbility.class, null);
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), INimbleUserDependAbility.class, null);
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), INimbleLynxDependAbility.class, null);
    }

    public final void jq() {
        TakoChatUIAbility takoChatUIAbilityAq;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvCM;
        if (this.LLLLLZ || (takoChatUIAbilityAq = Aq()) == null || (viewOnAttachStateChangeListenerC20604515jvCM = takoChatUIAbilityAq.cM()) == null) {
            return;
        }
        AsS53S0100000_27 asS53S0100000_27 = this.LLLLLLZZ;
        if (asS53S0100000_27 == null) {
            asS53S0100000_27 = new AsS53S0100000_27(this, 1);
            this.LLLLLLZZ = asS53S0100000_27;
        }
        viewOnAttachStateChangeListenerC20604515jvCM.addOnScrollListener(asS53S0100000_27);
        this.LLLLLZ = true;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final C326880Cre m50() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C1858660yT2) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL;
    }

    public final C14J2 pq() {
        return (C14J2) this.LLLLZLL.getValue();
    }

    public final List<Integer> qq() {
        return (List) this.LLLLJ.getValue();
    }

    public final View tq() {
        return (View) this.LLLLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        Xp("unBind");
        this.LLLLLLLZIL = null;
    }

    public final View vq() {
        return (View) this.LLLLL.getValue();
    }

    public final TakoFragmentViewModel wq() {
        AssemVMLazy assemVMLazy = this.LLLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLZLLIL;
        return (TakoFragmentViewModel) assemVMLazy.getValue();
    }

    public final void Gp() {
        ViewGroup viewGroupY4 = Y4();
        boolean z = false;
        if (viewGroupY4 != null && C09RB.LJIILL(new C09RD(viewGroupY4), tq()) < 0) {
            z = true;
        }
        if (z) {
            Jp(null);
            return;
        }
        ViewGroup viewGroupY42 = Y4();
        if (!Intrinsics.LJFF(viewGroupY42 != null ? C09RB.LJIJ(new C09RD(viewGroupY42)) : null, tq())) {
            Up();
            Jp(null);
        } else {
            if (this.LLLLLZL != 0 || this.LLLLZ) {
                return;
            }
            HandlerHook.viewPost(tq(), new Runnable() { // from class: X.0kzX
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TakoAnswerBaseAssem@27d.addViewExposure$1");
                    try {
                        C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TakoAnswerBaseAssem@27d.addViewExposure$1");
                }
            });
        }
    }

    public void Kq() {
        View view;
        View view2;
        if (yp()) {
            Object objTp = Tp();
            if (!(objTp instanceof View) || (view = (View) objTp) == null) {
                return;
            }
            C1857750yRZ.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1913307eV.LIZ() ? 20 : 8))), view);
            return;
        }
        Object objTp2 = Tp();
        if (!(objTp2 instanceof View) || (view2 = (View) objTp2) == null) {
            return;
        }
        C1857750yRZ.LJIILJJIL((up() || ((this instanceof TakoAnswerImageAssem) && tp())) ? 0 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), view2);
    }

    public final void Nq() {
        Fragment fragmentLJI;
        if (C07IA.LIZ() || this.LLLJL || this.LLLLII || (fragmentLJI = C724240Sb0.LJI(this)) == null) {
            return;
        }
        this.LLLLII = true;
        C1906580ziK.LIZJ().LIZJ().LJLLLL(fragmentLJI.getLifecycle(), new AfS196S0100000_27(this, 24));
        fragmentLJI.getLifecycle().addObserver(new TakoAnswerBaseAssem$registerMessageContentExposureHostObserverIfNeeded$3(this));
    }

    public final void Pq() {
        if (C07IA.LIZ() || this.LLLJL || this.LLLLIIIILLL) {
            return;
        }
        this.LLLLIIIILLL = true;
        wq().wQ2(new AwS606S0100000_27((TakoAnswerBaseAssem) this, 220));
        AssemViewModel.selectSubscribe$default(wq(), new C2217381BqS() { // from class: X.0yLU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853920yLO) obj).LLILZ;
            }
        }, null, null, null, new AwS590S0100000_11(new AwS606S0100000_27((TakoAnswerBaseAssem) this, 221), 526), 14, null);
        AssemViewModel.selectSubscribe$default(wq(), C1854190yLp.LL, null, null, null, new C5183020f((Function1) new AwS606S0100000_27((TakoAnswerBaseAssem) this, 214), (Function1<? super Long, Object>) 283), 14, null);
        AssemViewModel.selectSubscribe$default(wq(), new C2217381BqS() { // from class: X.0yLW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853920yLO) obj).LLJILLL;
            }
        }, null, null, null, new AwS590S0100000_11(new AwS606S0100000_27((TakoAnswerBaseAssem) this, 215), 529), 14, null);
        AssemViewModel.selectSubscribe$default(wq(), new C2217381BqS() { // from class: X.0yLX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853920yLO) obj).LLJJ;
            }
        }, null, null, null, new AwS590S0100000_11(new AwS606S0100000_27((TakoAnswerBaseAssem) this, 216), 530), 14, null);
        AssemViewModel.selectSubscribe$default(wq(), new C2217381BqS() { // from class: X.0yLT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853920yLO) obj).LLJJJJJIL;
            }
        }, null, null, null, new AwS590S0100000_11(new AwS606S0100000_27((TakoAnswerBaseAssem) this, 217), 525), 14, null);
    }

    public void Qp() {
        ViewGroup viewGroupY4 = Y4();
        if (viewGroupY4 != null) {
            viewGroupY4.addView(vq(), 0);
        }
    }

    public void Up() {
        ViewGroup viewGroupY4 = Y4();
        if (viewGroupY4 != null) {
            C786410Ut5.LJJJLZIJ(tq(), viewGroupY4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0yWS, X.0yXf] */
    public final void Uq() {
        if (C07IA.LIZ() || this.LLLJL || this.LLLL) {
            return;
        }
        this.LLLL = true;
        ?? r1 = new InterfaceC1861530yXf(this) { // from class: X.0yWS
            public final /* synthetic */ TakoAnswerBaseAssem<T> LIZ;

            @Override // X.InterfaceC1861530yXf
            public final void LIZ(Message message) {
            }

            @Override // X.InterfaceC1861530yXf
            public final void LIZJ(Message message, int i, String str, Map<String, String> map) {
            }

            @Override // X.InterfaceC1861530yXf
            public final void LIZLLL(Message message, int i, boolean z, String str, int i2, String str2, Extra extra, String str3, String str4, Integer num, Integer num2, String str5, String str6, C1862650yZT c1862650yZT, Map map) {
            }

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC1861530yXf
            public final void LIZIZ(Message message) {
                TakoAnswerBaseAssem<T> takoAnswerBaseAssem = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onAskQuestionStart q=");
                sbLIZ.append(message.uuid);
                takoAnswerBaseAssem.Zq(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.LLLILZLLLI = r1;
        IMessageAbility iMessageAbilityYq = yq(this);
        if (iMessageAbilityYq != 0) {
            iMessageAbilityYq.H61(r1);
        }
    }

    public final void Ur() {
        CharSequence text;
        Layout layout;
        if (!C07IA.LIZ() && this.LLLLLZIL) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            Message message = ((C1858660yT2) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL.LLILLL;
            if (message.sender.isSelf) {
                return;
            }
            C1860130yVP c1860130yVP = this.LLLLZI;
            if (!(c1860130yVP instanceof TextView) || c1860130yVP == null || !c1860130yVP.isShown() || (text = c1860130yVP.getText()) == null || text.length() == 0 || (layout = c1860130yVP.getLayout()) == null) {
                return;
            }
            Rect rect = new Rect();
            if (c1860130yVP.getGlobalVisibleRect(rect)) {
                int[] iArr = new int[2];
                c1860130yVP.getLocationInWindow(iArr);
                int i = rect.top;
                int i2 = iArr[1];
                int i3 = i - i2;
                if (i3 < 0) {
                    i3 = 0;
                }
                int i4 = rect.bottom - i2;
                int height = c1860130yVP.getHeight();
                if (i4 > height) {
                    i4 = height;
                }
                if (i4 > i3) {
                    int totalPaddingTop = i3 - c1860130yVP.getTotalPaddingTop();
                    if (totalPaddingTop < 0) {
                        totalPaddingTop = 0;
                    }
                    int totalPaddingTop2 = i4 - c1860130yVP.getTotalPaddingTop();
                    int height2 = layout.getHeight();
                    if (totalPaddingTop2 > height2) {
                        totalPaddingTop2 = height2;
                    }
                    if (totalPaddingTop2 > totalPaddingTop) {
                        int lineForVertical = layout.getLineForVertical(totalPaddingTop);
                        if (lineForVertical < 0) {
                            lineForVertical = 0;
                        }
                        int i5 = totalPaddingTop2 - 1;
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        int lineForVertical2 = layout.getLineForVertical(i5);
                        int lineCount = layout.getLineCount() - 1;
                        if (lineForVertical2 > lineCount) {
                            lineForVertical2 = lineCount;
                        }
                        if (lineForVertical <= lineForVertical2) {
                            ArrayList arrayList = new ArrayList((lineForVertical2 - lineForVertical) + 1);
                            if (lineForVertical <= lineForVertical2) {
                                while (true) {
                                    int lineStart = layout.getLineStart(lineForVertical);
                                    int lineEnd = layout.getLineEnd(lineForVertical);
                                    if (lineEnd > lineStart) {
                                        if (layout.getEllipsisCount(lineForVertical) > 0) {
                                            int iLJ = C13LZ.LJ(layout.getEllipsisStart(lineForVertical) + lineStart, lineStart, lineEnd);
                                            if (iLJ > lineStart) {
                                                arrayList.add(new C1860870yWb(lineStart, iLJ));
                                                fq(lineStart, iLJ, text);
                                            }
                                        } else {
                                            arrayList.add(new C1860870yWb(lineStart, lineEnd));
                                            fq(lineStart, lineEnd, text);
                                        }
                                    }
                                    if (lineForVertical == lineForVertical2) {
                                        break;
                                    } else {
                                        lineForVertical++;
                                    }
                                }
                            }
                            C1860860yWa c1860860yWa = new C1860860yWa(arrayList);
                            CharSequence text2 = c1860130yVP.getText();
                            if (text2 == null) {
                                return;
                            }
                            int iFq = fq(0, text2.length(), text2);
                            er(message);
                            this.LLLLLLLLL = iFq;
                            BitSet bitSet = this.LLLLLLJ;
                            if (bitSet == null) {
                                return;
                            }
                            int i6 = 0;
                            for (C1860870yWb c1860870yWb : c1860860yWa.LIZ) {
                                int i7 = c1860870yWb.LIZ;
                                int i8 = c1860870yWb.LIZIZ;
                                if (i7 < 0) {
                                    i7 = 0;
                                }
                                int length = text2.length();
                                if (i8 > length) {
                                    i8 = length;
                                }
                                int i9 = 0;
                                if (i8 > i7) {
                                    while (i7 < i8) {
                                        if (text2.charAt(i7) != 65532 && !bitSet.get(i7)) {
                                            bitSet.set(i7);
                                            i9++;
                                        }
                                        i7++;
                                    }
                                }
                                i6 += i9;
                            }
                            if (i6 <= 0) {
                                return;
                            }
                            int i10 = this.LLLLLLL + i6;
                            this.LLLLLLL = i10;
                            if (i10 == this.LLLLLLLLLL) {
                                return;
                            }
                            this.LLLLLLLLLL = i10;
                        }
                    }
                }
            }
        }
    }

    public void Vp() {
        ViewGroup viewGroupY4 = Y4();
        if (viewGroupY4 != null) {
            C786410Ut5.LJJJLZIJ(vq(), viewGroupY4);
        }
    }

    public ViewGroup Y4() {
        Object objTp = Tp();
        if (objTp instanceof ViewGroup) {
            return (ViewGroup) objTp;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final String bv1() {
        return getClass().getSimpleName();
    }

    public final Map<String, String> dq() {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbilityZp = zp();
        if (iTakoContextAbilityZp == null || (c13lcT71 = iTakoContextAbilityZp.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null) {
            return null;
        }
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("process_id", c1863850ybP.LLILZIL);
        String str = c1863850ybP.LLILZLL;
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("tako_session_id", str);
        String str2 = c1863850ybP.LLIZ;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("tako_chat_id", str2);
        String str3 = c1863850ybP.LL;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[3] = new Pair("enter_from", str3);
        String str4 = c1863850ybP.LLILLJJLI;
        pairArr[4] = new Pair("enter_method", str4 != null ? str4 : "");
        C724270Sb3 c724270Sb3 = this.LLJI;
        pairArr[5] = new Pair("message_id", ((C1858660yT2) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL.LLILLL.uuid);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C724270Sb3 c724270Sb32 = this.LLJI;
        String str5 = ((C1858660yT2) (c724270Sb32 != null ? c724270Sb32.LL : null)).LLILLL;
        if (C123100dR.LIZ(str5) && str5 != null) {
            mapLJIIJ.put("sub_process_id", str5);
        }
        return mapLJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final View iy1() {
        return Y4();
    }

    public void jr() {
        ViewGroup viewGroupY4 = Y4();
        if (viewGroupY4 != null) {
            viewGroupY4.setOnLongClickListener(new ViewOnLongClickListenerC1864690ycl(this, 4));
        }
    }

    public final void kq() {
        List listLLIIII;
        if (C07IA.LIZ()) {
            return;
        }
        synchronized (C1860750yWP.LIZ) {
            try {
                LinkedHashMap<String, C1860790yWT> linkedHashMap = C1860750yWP.LIZIZ;
                if (linkedHashMap.isEmpty()) {
                    listLLIIII = C13BV.INSTANCE;
                } else {
                    listLLIIII = C13LP.LLIIII(linkedHashMap.values());
                    linkedHashMap.clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (listLLIIII.isEmpty()) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1860730yWN(listLLIIII, this, null), 3);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, TakoCardAbility.class, null, null);
        C1558520qew.LJII(C1558520qew.LJIIL(this), new NimbleVideoListDependAbilityImpl(this), INimbleVideoListDependAbility.class, null, null);
        C1558520qew.LJII(C1558520qew.LJIIL(this), new NimbleUserDependAbilityImpl(this), INimbleUserDependAbility.class, null, null);
        C1558520qew.LJII(C1558520qew.LJIIL(this), new NimbleLynxDependAbilityImpl(this), INimbleLynxDependAbility.class, null, null);
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27((TakoAnswerBaseAssem) this, 739);
        this.LLLILZJ = awS571S0100000_27;
        IMessageAbility iMessageAbilityYq = yq(this);
        if (iMessageAbilityYq != null) {
            iMessageAbilityYq.tU1(awS571S0100000_27);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final View qk0() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public InterfaceC1860040yVG rA0() {
        return this.LLLLZI;
    }

    public static int Bq(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        return new Regex("<data-inline\\s+[^>]*?>(.*?)<\\/data-inline>|<data-inline\\s+[^>]*?\\/>").replace(str, "").length();
    }

    public static void Tr(C1858660yT2 c1858660yT2) {
        String str;
        long jLongValue;
        C1862130yYd.LIZ.onEventFirstPacketPresented(c1858660yT2.LL.LLILLL.uuid);
        if (Intrinsics.LJFF(C1862130yYd.LIZJ, c1858660yT2.LL.LLILLL.uuid) && C1862130yYd.LJFF.LJIIL != null) {
            return;
        }
        TakoMixFeed takoMixFeed = c1858660yT2.LLILZLL;
        if (takoMixFeed != null) {
            str = takoMixFeed.text;
        } else {
            str = null;
        }
        if (Bq(str) <= 0) {
            return;
        }
        if (!Intrinsics.LJFF(C1862130yYd.LIZJ, c1858660yT2.LL.LLILLL.uuid)) {
            return;
        }
        C1862180yYi c1862180yYi = C1862130yYd.LJFF;
        if (c1862180yYi.LIZIZ == -1 || c1862180yYi.LJIIJ == null || c1862180yYi.LJIIL != null) {
            return;
        }
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - c1862180yYi.LIZIZ);
        c1862180yYi.LJIIL = lValueOf;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 0;
        }
        c1862180yYi.LIZ(Long.valueOf(jLongValue), "first_text_render_cost");
    }

    public static final IMessageAbility yq(TakoAnswerBaseAssem takoAnswerBaseAssem) {
        return (IMessageAbility) takoAnswerBaseAssem.LLJZIJLIL.getValue();
    }

    public final void Dq(CharSequence charSequence) {
        String string;
        Integer numLJIIJJI;
        Object obj;
        ITakoHighLightAnimProtocol iTakoHighLightAnimProtocol;
        Object obj2;
        if (charSequence != null && (string = charSequence.toString()) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string)) != null) {
            int iIntValue = numLJIIJJI.intValue();
            if (iIntValue < 1) {
                iIntValue = 1;
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            numValueOf.intValue();
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (!C1858670yT3.LJI(((C1858660yT2) obj).LL.LLILLL)) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                if (!C1858670yT3.LJIILL(((C1858660yT2) obj2).LL.LLILLL)) {
                    return;
                }
            }
            int iIntValue2 = numValueOf.intValue();
            C0ZDN c0zdn = (C0ZDN) this.LLLFFI.getValue();
            if (c0zdn != null) {
                c0zdn.LIZ(0);
            }
            int i = iIntValue2 - 1;
            List<ITakoHighLightAnimProtocol> listZq = zq(i);
            C323580CmK c323580CmK = new C323580CmK(2);
            c323580CmK.LIZ(this.LLLLLIL.getValue());
            c323580CmK.LIZIZ(xq(i, listZq));
            List listLJIIJJI = C1697810uHb.LJIIJJI(c323580CmK.LIZLLL(new C05PU[c323580CmK.LIZJ()]));
            if (listZq != null && (iTakoHighLightAnimProtocol = (ITakoHighLightAnimProtocol) C13LP.LJJLIIIJL(listZq)) != null) {
                boolean zIsClosed = iTakoHighLightAnimProtocol.isClosed();
                AwS133S0101000_27 awS133S0101000_27 = new AwS133S0101000_27(this, (TakoAnswerBaseAssem<C1858660yT2>) i, 3);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C05PQ(listLJIIJJI, zIsClosed, awS133S0101000_27, null), 3);
            }
        }
    }

    public final void Dr(String str) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Object obj;
        ITakoContextAbility iTakoContextAbilityZp = zp();
        if (iTakoContextAbilityZp != null && (c13lcT71 = iTakoContextAbilityZp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = c1863850ybP.LLILZIL;
            String str3 = c1863850ybP.LL;
            String str4 = c1863850ybP.LLILLJJLI;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String str5 = ((C1858660yT2) obj).LL.LLILLL.uuid;
            String str6 = c1863850ybP.LLILZLL;
            String str7 = "";
            if (str6 == null) {
                str6 = "";
            }
            String str8 = c1863850ybP.LLIZ;
            if (str8 != null) {
                str7 = str8;
            }
            C1862330yYx.LJJLIIIJJIZ(c1862330yYx, str3, str4, str2, str5, "memory", str, str6, str7);
        }
    }

    public void Fp(C14J2 c14j2) {
        if (LJJIJL() instanceof ViewGroup) {
            ((ViewGroup) LJJIJL()).addView(c14j2);
        }
    }

    public final void Fq(String str) {
        Object obj;
        Object obj2;
        String str2;
        if (C07IA.LIZ() || this.LLLJL || this.LLLJ > 0) {
            return;
        }
        Object obj3 = null;
        if (!this.LLLII) {
            str2 = "no_first_char";
        } else if (!this.LLLIIII) {
            str2 = "host_paused";
        } else if (this.LLLIIIIL) {
            str2 = "keyboard";
        } else if (this.LLLIIIL) {
            str2 = "feedback_sheet";
        } else if (this.LLLIIL) {
            str2 = "photo_picker";
        } else if (this.LLLIILIL) {
            str2 = "menu_window";
        } else if (this.LLLIL) {
            str2 = "reference_sheet";
        } else if (this.LLLILZ) {
            str2 = "drawer";
        } else {
            this.LLLLIIL = null;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.LLLJIL <= 0) {
                this.LLLJIL = jCurrentTimeMillis;
            }
            this.LLLJ = jCurrentTimeMillis;
            if (!C07IB.LIZ()) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                if (((C1858660yT2) obj).LL.LLILLL.isMultiAnswer) {
                    if (c724270Sb3 != null) {
                        obj2 = c724270Sb3.LL;
                    } else {
                        obj2 = null;
                    }
                    C1858340ySW.LIZJ(jCurrentTimeMillis, ((C1858660yT2) obj2).LL.LLILLL.uuid);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start trigger=");
            sbLIZ.append(str);
            sbLIZ.append(" acc=");
            sbLIZ.append(this.LLLIZZ);
            sbLIZ.append(" msg=");
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj3 = c724270Sb32.LL;
            }
            sbLIZ.append(((C1858660yT2) obj3).LL.LLILLL.uuid);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (!Intrinsics.LJFF(this.LLLLIIL, str2)) {
            this.LLLLIIL = str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Iq, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void up(final T r36) {
        /*
            Method dump skipped, instruction units count: 1873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem.up(X.0yT2):void");
    }

    public void Jp(Integer num) {
        if (num == null) {
            ViewGroup viewGroupY4 = Y4();
            if (viewGroupY4 != null) {
                viewGroupY4.addView(tq());
                return;
            }
            return;
        }
        ViewGroup viewGroupY42 = Y4();
        if (viewGroupY42 == null) {
            return;
        }
        viewGroupY42.addView(tq(), num.intValue());
    }

    public final void Mq(String str) {
        Object obj;
        Object obj2;
        if (C07IA.LIZ() || this.LLLJL) {
            return;
        }
        long j = this.LLLJ;
        if (j <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - j;
        if (j2 < 0) {
            j2 = 0;
        }
        this.LLLIZZ += j2;
        this.LLLJ = 0L;
        Object obj3 = null;
        if (!C07IB.LIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (((C1858660yT2) obj).LL.LLILLL.isMultiAnswer) {
                if (c724270Sb3 != null) {
                    obj2 = c724270Sb3.LL;
                } else {
                    obj2 = null;
                }
                String str2 = ((C1858660yT2) obj2).LL.LLILLL.uuid;
                Map<String, C1858330ySV> map = C1858340ySW.LIZ;
                C1858330ySV c1858330ySV = (C1858330ySV) ((LinkedHashMap) map).get(str2);
                if (c1858330ySV != null && c1858330ySV.LIZLLL == null) {
                    map.put(str2, C1858330ySV.LIZ(c1858330ySV, 0L, Long.valueOf(jCurrentTimeMillis), 7));
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause trigger=");
        sbLIZ.append(str);
        sbLIZ.append(" delta=");
        sbLIZ.append(j2);
        sbLIZ.append(" acc=");
        sbLIZ.append(this.LLLIZZ);
        sbLIZ.append(" msg=");
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj3 = c724270Sb32.LL;
        }
        sbLIZ.append(((C1858660yT2) obj3).LL.LLILLL.uuid);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void Xp(String str) {
        Object obj;
        C1863850ybP c1863850ybP;
        Object obj2;
        String str2;
        int iBq;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String string;
        String str8;
        C1862900yZs c1862900yZs;
        Object obj3;
        String str9;
        String strNZ0;
        Object obj4;
        C13LC<C1863850ybP> c13lcT71;
        if (C07IA.LIZ() || !this.LLLLIILLL || this.LLLJL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache:");
        sbLIZ.append(str);
        Mq(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLLII) {
            return;
        }
        long j = this.LLLIZZ;
        if (j >= 0 && j > 0) {
            if (this.LLLLLZIL) {
                Ur();
            }
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj5 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String str10 = ((C1858660yT2) obj).LL.LLILLL.uuid;
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
            if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null) {
                c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ();
            } else {
                c1863850ybP = null;
            }
            Integer numValueOf = Integer.valueOf(this.LLLLLLLLL);
            if (numValueOf.intValue() > 0) {
                iBq = numValueOf.intValue();
            } else {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                TakoMixFeed takoMixFeed = ((C1858660yT2) obj2).LLILZLL;
                if (takoMixFeed != null) {
                    str2 = takoMixFeed.text;
                } else {
                    str2 = null;
                }
                iBq = Bq(str2);
            }
            Object obj6 = C1860750yWP.LIZ;
            if (c1863850ybP != null) {
                str3 = c1863850ybP.LLILZIL;
                str4 = c1863850ybP.LLILZLL;
                str5 = c1863850ybP.LLIZ;
                str6 = c1863850ybP.LL;
                str7 = c1863850ybP.LLILLJJLI;
                string = Long.valueOf(c1863850ybP.LLJJ).toString();
                str8 = c1863850ybP.LLILLL;
            } else {
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                string = null;
                str8 = null;
            }
            String strValueOf = String.valueOf(t70());
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj5 = c724270Sb33.LL;
            }
            String strLIZIZ = C1855920yOc.LIZIZ(((C1858660yT2) obj5).LL.LLILLL);
            if (c1863850ybP != null) {
                String str11 = c1863850ybP.LLJILJILJ;
                if (str11 == null) {
                    str11 = "";
                }
                String str12 = c1863850ybP.LLJJIJIL;
                if (str12 == null) {
                    str12 = "";
                }
                c1862900yZs = new C1862900yZs(str11, str12, String.valueOf(c1863850ybP.LLJJ));
            } else {
                c1862900yZs = null;
            }
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj3 = c724270Sb34.LL;
            } else {
                obj3 = null;
            }
            if (((C1858660yT2) obj3).LL.LLILLL.isMultiAnswer) {
                str9 = "multi_answer";
            } else {
                str9 = "default";
            }
            ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) this.LLLF.getValue();
            if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
                strNZ0 = "full_screen";
            }
            C724270Sb3 c724270Sb35 = this.LLJI;
            if (c724270Sb35 != null) {
                obj4 = c724270Sb35.LL;
            } else {
                obj4 = null;
            }
            String str13 = str5;
            C1860790yWT c1860790yWT = new C1860790yWT(str10, j, str3, str4, str13, str6, str7, string, str8, strValueOf, strLIZIZ, c1862900yZs, str9, strNZ0, Integer.valueOf(((C1858660yT2) obj4).LL.LLILLL.LIZIZ), this.LLLLLLL, iBq);
            synchronized (C1860750yWP.LIZ) {
                try {
                    if (!C1860750yWP.LIZJ.contains(str10)) {
                        LinkedHashMap<String, C1860790yWT> linkedHashMap = C1860750yWP.LIZIZ;
                        C1860790yWT c1860790yWT2 = linkedHashMap.get(str10);
                        if (c1860790yWT2 == null) {
                            linkedHashMap.put(str10, c1860790yWT);
                        } else {
                            c1860790yWT2.LIZIZ += c1860790yWT.LIZIZ;
                            String str14 = c1860790yWT.LIZJ;
                            if (str14 == null) {
                                str14 = c1860790yWT2.LIZJ;
                            }
                            c1860790yWT2.LIZJ = str14;
                            String str15 = c1860790yWT.LJFF;
                            if (str15 == null) {
                                str15 = c1860790yWT2.LJFF;
                            }
                            c1860790yWT2.LJFF = str15;
                            String str16 = c1860790yWT.LJI;
                            if (str16 == null) {
                                str16 = c1860790yWT2.LJI;
                            }
                            c1860790yWT2.LJI = str16;
                            String str17 = c1860790yWT.LJII;
                            if (str17 == null) {
                                str17 = c1860790yWT2.LJII;
                            }
                            c1860790yWT2.LJII = str17;
                            String str18 = c1860790yWT.LJIIIIZZ;
                            if (str18 == null) {
                                str18 = c1860790yWT2.LJIIIIZZ;
                            }
                            c1860790yWT2.LJIIIIZZ = str18;
                            String str19 = c1860790yWT.LJIIIZ;
                            if (str19 == null) {
                                str19 = c1860790yWT2.LJIIIZ;
                            }
                            c1860790yWT2.LJIIIZ = str19;
                            String str20 = c1860790yWT.LJIIJ;
                            if (str20 == null) {
                                str20 = c1860790yWT2.LJIIJ;
                            }
                            c1860790yWT2.LJIIJ = str20;
                            C1862900yZs c1862900yZs2 = c1860790yWT.LJIIJJI;
                            if (c1862900yZs2 == null) {
                                c1862900yZs2 = c1860790yWT2.LJIIJJI;
                            }
                            c1860790yWT2.LJIIJJI = c1862900yZs2;
                            String str21 = c1860790yWT.LJIILIIL;
                            if (str21 == null) {
                                str21 = c1860790yWT2.LJIILIIL;
                            }
                            c1860790yWT2.LJIILIIL = str21;
                            Integer num = c1860790yWT.LJIILJJIL;
                            if (num == null) {
                                num = c1860790yWT2.LJIILJJIL;
                            }
                            c1860790yWT2.LJIILJJIL = num;
                            c1860790yWT2.LJIILL = c1860790yWT.LJIILL;
                            c1860790yWT2.LJIILLIIL = c1860790yWT.LJIILLIIL;
                            String str22 = c1860790yWT.LIZLLL;
                            if (str22 == null) {
                                str22 = c1860790yWT2.LIZLLL;
                            }
                            c1860790yWT2.LIZLLL = str22;
                            String str23 = c1860790yWT.LJ;
                            if (str23 == null) {
                                str23 = c1860790yWT2.LJ;
                            }
                            c1860790yWT2.LJ = str23;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LLLLIL = null;
            this.LLLLILI = 0L;
            this.LLLIZZ = 0L;
            this.LLLJ = 0L;
            this.LLLJIL = 0L;
        }
    }

    public final void Zq(String str) {
        Object obj;
        if (C07IA.LIZ() || !this.LLLLIILLL || this.LLLJL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report:");
        sbLIZ.append(str);
        Mq(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLLII) {
            return;
        }
        long j = this.LLLIZZ;
        if (j >= 0 && j > 0) {
            this.LLLJL = true;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("report trigger=");
            sbLIZ2.append(str);
            sbLIZ2.append(" duration=");
            sbLIZ2.append(j);
            sbLIZ2.append(" msg=");
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            sbLIZ2.append(((C1858660yT2) obj).LL.LLILLL.uuid);
            C2188811AlT.LIZIZ(sbLIZ2);
            lr(j);
        }
    }

    public final void er(Message message) {
        String str = message.uuid;
        if (Intrinsics.LJFF(this.LLLLLLIL, str)) {
            return;
        }
        this.LLLLLLIL = str;
        this.LLLLLZIL = kr(message);
        this.LLLLLLJ = new BitSet();
        this.LLLLLLL = 0;
        this.LLLLLLLLL = 0;
        this.LLLLLLLLLL = 0;
    }

    public final void hr(final String str) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        final String str2 = ((C1858660yT2) obj).LL.LLILLL.uuid;
        if (Intrinsics.LJFF(this.LLLLLLLZIL, str2)) {
            return;
        }
        this.LLLLLLLZIL = str2;
        final View viewLJJIJL = LJJIJL();
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(viewLJJIJL, new Runnable() { // from class: X.0yWR
            public final void LIZ() {
                if (Intrinsics.LJFF(this.LLLLLLLZIL, str2)) {
                    TakoAnswerBaseAssem takoAnswerBaseAssem = this;
                    takoAnswerBaseAssem.LLLLLLLZIL = null;
                    if (takoAnswerBaseAssem.LJJIJL().isAttachedToWindow()) {
                        TakoAnswerBaseAssem takoAnswerBaseAssem2 = this;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append("#doOnPreDraw");
                        C2188811AlT.LIZIZ(sbLIZ);
                        takoAnswerBaseAssem2.Ur();
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TakoAnswerBaseAssem@27d.scheduleVisibleDisplayedTextCountUpdate$$inlined$doOnPreDraw$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TakoAnswerBaseAssem@27d.scheduleVisibleDisplayedTextCountUpdate$$inlined$doOnPreDraw$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public void hw(C1860130yVP c1860130yVP) {
        this.LLLLZI = c1860130yVP;
    }

    public void ir(C19MB c19mb) {
        int id;
        ViewGroup viewGroupY4 = Y4();
        if (viewGroupY4 != null) {
            id = viewGroupY4.getId();
        } else {
            id = R.id.ety;
        }
        c19mb.LJIIIZ(id, 3, R.id.o6x, 4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean kr(com.ss.android.ugc.aweme.tako.ccl.model.api.Message r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender r0 = r9.sender
            boolean r0 = r0.isSelf
            r5 = 0
            if (r0 == 0) goto L8
            return r5
        L8:
            com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility r1 = yq(r8)
            r0 = 0
            if (r1 == 0) goto L13
            com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationConfig r0 = r1.ou()
        L13:
            r6 = 0
            if (r0 == 0) goto L2b
            long r3 = r0.readCursor
            java.lang.String r2 = r0.subConversationId
            r1 = 1
            if (r2 == 0) goto L2d
            java.lang.String r0 = "aivideo"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r2, r0, r5)
            if (r0 != r1) goto L32
            boolean r0 = r9.LIZ
            if (r0 == 0) goto L30
            return r5
        L2b:
            r3 = 0
        L2d:
            long r1 = r9.serverSeq
            goto L44
        L30:
            if (r2 == 0) goto L2d
        L32:
            int r0 = r2.length()
            if (r0 == 0) goto L2d
            boolean r0 = X.C1861740yY0.LIZ(r2)
            if (r0 != 0) goto L2d
            boolean r0 = r9.isPush
            if (r0 != 0) goto L2d
            long r1 = r9.subServerSeq
        L44:
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L52
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L59
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L59
        L50:
            r5 = 1
        L51:
            return r5
        L52:
            if (r0 != 0) goto L59
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L59
            goto L50
        L59:
            boolean r0 = r9.LIZ
            if (r0 != 0) goto L51
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem.kr(com.ss.android.ugc.aweme.tako.ccl.model.api.Message):boolean");
    }

    public final void lq(String str) {
        C1860790yWT c1860790yWT;
        long jLongValue;
        Object obj;
        C1858330ySV c1858330ySVLIZ;
        Object obj2;
        C1858330ySV c1858330ySVLIZ2;
        if (C07IA.LIZ() || this.LLLJL || (c1860790yWT = this.LLLLIL) == null) {
            return;
        }
        Object obj3 = C1860750yWP.LIZ;
        if (C1860750yWP.LIZ(c1860790yWT.LIZ)) {
            this.LLLJL = true;
            this.LLLLIL = null;
            this.LLLLILI = 0L;
            this.LLLIZZ = 0L;
            this.LLLJ = 0L;
            this.LLLJIL = 0L;
            return;
        }
        long j = this.LLLIZZ;
        if (j < 0) {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        if (lValueOf.longValue() > 0) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = this.LLLLILI;
            if (jLongValue < 0) {
                return;
            }
        }
        if (jLongValue > 0) {
            this.LLLJL = true;
            C1860750yWP.LIZIZ(c1860790yWT.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("flushRestored trigger=");
            sbLIZ.append(str);
            sbLIZ.append(" duration=");
            sbLIZ.append(jLongValue);
            sbLIZ.append(" msg=");
            sbLIZ.append(c1860790yWT.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
            String str2 = "";
            if (iTakoContextAbility != null) {
                C1863850ybP c1863850ybP = (C1863850ybP) iTakoContextAbility.T71().LIZIZ();
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str3 = c1860790yWT.LIZJ;
                if (str3 == null) {
                    str3 = c1863850ybP.LLILZIL;
                }
                String str4 = c1860790yWT.LJFF;
                if (str4 == null) {
                    str4 = c1863850ybP.LL;
                }
                String str5 = c1860790yWT.LJI;
                if (str5 == null) {
                    str5 = c1863850ybP.LLILLJJLI;
                }
                String strValueOf = c1860790yWT.LJII;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(c1863850ybP.LLJJ);
                }
                String str6 = c1860790yWT.LIZ;
                String str7 = c1860790yWT.LJIIIIZZ;
                if (str7 == null) {
                    str7 = c1863850ybP.LLILLL;
                }
                String str8 = c1860790yWT.LJIIIZ;
                C1862900yZs c1862900yZs = c1860790yWT.LJIIJJI;
                String str9 = c1860790yWT.LJIIJ;
                String str10 = c1860790yWT.LJIIL;
                String str11 = c1860790yWT.LIZLLL;
                if (str11 == null && (str11 = c1863850ybP.LLILZLL) == null) {
                    str11 = "";
                }
                String str12 = c1860790yWT.LJ;
                if (str12 == null && (str12 = c1863850ybP.LLIZ) == null) {
                    str12 = "";
                }
                C1862330yYx.LJJJJJL(c1862330yYx, str3, str4, str5, strValueOf, str6, str7, jLongValue, str8, c1862900yZs, str9, str10, str11, str12);
                String str13 = c1860790yWT.LIZJ;
                if (str13 == null) {
                    str13 = c1863850ybP.LLILZIL;
                }
                String str14 = c1860790yWT.LJFF;
                if (str14 == null) {
                    str14 = c1863850ybP.LL;
                }
                String str15 = c1860790yWT.LJI;
                if (str15 == null) {
                    str15 = c1863850ybP.LLILLJJLI;
                }
                String str16 = c1860790yWT.LIZ;
                Integer num = c1860790yWT.LJIILJJIL;
                int i = c1860790yWT.LJIILL;
                int i2 = c1860790yWT.LJIILLIIL;
                String str17 = c1860790yWT.LJIILIIL;
                String str18 = c1860790yWT.LIZLLL;
                if (str18 == null && (str18 = c1863850ybP.LLILZLL) == null) {
                    str18 = "";
                }
                String str19 = c1860790yWT.LJ;
                if (str19 == null && (str19 = c1863850ybP.LLIZ) == null) {
                    str19 = "";
                }
                C1862330yYx.LJJJJLI(c1862330yYx, str13, str14, str15, str16, num, i, i2, str17, str18, str19);
                if (!C07IB.LIZ()) {
                    C724270Sb3 c724270Sb3 = this.LLJI;
                    if (c724270Sb3 != null) {
                        obj2 = c724270Sb3.LL;
                    } else {
                        obj2 = null;
                    }
                    if (((C1858660yT2) obj2).LL.LLILLL.isMultiAnswer && (c1858330ySVLIZ2 = C1858340ySW.LIZ(c1860790yWT.LIZ)) != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C1858340ySW.LIZJ(jCurrentTimeMillis, c1860790yWT.LIZ);
                        String str20 = c1860790yWT.LJFF;
                        String str21 = c1860790yWT.LJI;
                        String str22 = c1860790yWT.LIZ;
                        Integer numValueOf = Integer.valueOf(c1858330ySVLIZ2.LIZ + 1);
                        String str23 = c1860790yWT.LIZJ;
                        String str24 = c1860790yWT.LIZLLL;
                        if (str24 == null) {
                            str24 = "";
                        }
                        String str25 = c1860790yWT.LJ;
                        if (str25 != null) {
                            str2 = str25;
                        }
                        C1862330yYx.LJLJLLL(c1862330yYx, str20, str21, str22, numValueOf, str23, str24, str2, "default", c1860790yWT.LJIILIIL, (jCurrentTimeMillis - c1858330ySVLIZ2.LIZIZ) - c1858330ySVLIZ2.LIZJ);
                        C1858340ySW.LIZ.remove(c1860790yWT.LIZ);
                    }
                }
            } else {
                C1862330yYx c1862330yYx2 = C1862330yYx.LIZ;
                String str26 = c1860790yWT.LIZJ;
                String str27 = c1860790yWT.LJFF;
                String str28 = c1860790yWT.LJI;
                String str29 = c1860790yWT.LJII;
                String str30 = c1860790yWT.LIZ;
                String str31 = c1860790yWT.LJIIIIZZ;
                String str32 = c1860790yWT.LJIIIZ;
                C1862900yZs c1862900yZs2 = c1860790yWT.LJIIJJI;
                String str33 = c1860790yWT.LJIIJ;
                String str34 = c1860790yWT.LJIIL;
                String str35 = c1860790yWT.LIZLLL;
                if (str35 == null) {
                    str35 = "";
                }
                C1862330yYx.LJJJJJL(c1862330yYx2, str26, str27, str28, str29, str30, str31, jLongValue, str32, c1862900yZs2, str33, str34, str35, c1860790yWT.LJ);
                String str36 = c1860790yWT.LIZJ;
                String str37 = c1860790yWT.LIZLLL;
                if (str37 == null) {
                    str37 = "";
                }
                C1862330yYx.LJJJJLI(c1862330yYx2, str36, c1860790yWT.LJFF, c1860790yWT.LJI, c1860790yWT.LIZ, c1860790yWT.LJIILJJIL, c1860790yWT.LJIILL, c1860790yWT.LJIILLIIL, c1860790yWT.LJIILIIL, str37, c1860790yWT.LJ);
                if (!C07IB.LIZ()) {
                    C724270Sb3 c724270Sb32 = this.LLJI;
                    if (c724270Sb32 != null) {
                        obj = c724270Sb32.LL;
                    } else {
                        obj = null;
                    }
                    if (((C1858660yT2) obj).LL.LLILLL.isMultiAnswer && (c1858330ySVLIZ = C1858340ySW.LIZ(c1860790yWT.LIZ)) != null) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        C1858340ySW.LIZJ(jCurrentTimeMillis2, c1860790yWT.LIZ);
                        String str38 = c1860790yWT.LJFF;
                        String str39 = c1860790yWT.LJI;
                        String str40 = c1860790yWT.LIZ;
                        Integer numValueOf2 = Integer.valueOf(c1858330ySVLIZ.LIZ + 1);
                        String str41 = c1860790yWT.LIZJ;
                        String str42 = c1860790yWT.LIZLLL;
                        if (str42 == null) {
                            str42 = "";
                        }
                        String str43 = c1860790yWT.LJ;
                        if (str43 != null) {
                            str2 = str43;
                        }
                        C1862330yYx.LJLJLLL(c1862330yYx2, str38, str39, str40, numValueOf2, str41, str42, str2, "default", c1860790yWT.LJIILIIL, (jCurrentTimeMillis2 - c1858330ySVLIZ.LIZIZ) - c1858330ySVLIZ.LIZJ);
                        C1858340ySW.LIZ.remove(c1860790yWT.LIZ);
                    }
                }
            }
            this.LLLLIL = null;
            this.LLLLILI = 0L;
            this.LLLIZZ = 0L;
            this.LLLJ = 0L;
            this.LLLJIL = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01cb A[PHI: r3
      0x01cb: PHI (r3v1 X.0yWT) = (r3v0 X.0yWT), (r3v2 X.0yWT) binds: [B:64:0x015c, B:66:0x015f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lr(long r33) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem.lr(long):void");
    }

    public final void mr(long j) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        Object obj4;
        String strValueOf;
        Object obj5;
        Integer numValueOf;
        String str2;
        Object obj6;
        Object obj7 = null;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str3 = c1863850ybP.LLILZIL;
            String str4 = c1863850ybP.LLILZLL;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            String str6 = c1863850ybP.LLIZ;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = c1863850ybP.LL;
            String str8 = c1863850ybP.LLILLJJLI;
            String strValueOf2 = String.valueOf(c1863850ybP.LLJJ);
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj7 = c724270Sb3.LL;
            }
            String str9 = ((C1858660yT2) obj7).LL.LLILLL.uuid;
            String str10 = c1863850ybP.LLILLL;
            String strValueOf3 = String.valueOf(t70());
            String str11 = c1863850ybP.LLJILJILJ;
            if (str11 == null) {
                str11 = "";
            }
            String str12 = c1863850ybP.LLJJIJIL;
            if (str12 != null) {
                str5 = str12;
            }
            C1862900yZs c1862900yZs = new C1862900yZs(str11, str5, String.valueOf(c1863850ybP.LLJJ));
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj = c724270Sb32.LL;
            } else {
                obj = null;
            }
            String strLIZIZ = C1855920yOc.LIZIZ(((C1858660yT2) obj).LL.LLILLL);
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj2 = c724270Sb33.LL;
            } else {
                obj2 = null;
            }
            String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(((C1858660yT2) obj2).LL.LLILLL.ext.activeAiImageSubBar));
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj3 = c724270Sb34.LL;
            } else {
                obj3 = null;
            }
            if (((C1858660yT2) obj3).LL.LLILLL.isMultiAnswer) {
                str = "multi_answer";
            } else {
                str = "default";
            }
            if (c724270Sb34 != null) {
                obj4 = c724270Sb34.LL;
            } else {
                obj4 = null;
            }
            if (((C1858660yT2) obj4).LL.LLILLL.isMultiAnswer) {
                if (c724270Sb34 != null) {
                    obj6 = c724270Sb34.LL;
                } else {
                    obj6 = null;
                }
                strValueOf = String.valueOf(((C1858660yT2) obj6).LL.LLILLL.selectedAnswerIndex + 1);
            } else {
                strValueOf = null;
            }
            C1862330yYx.LJJJJL(c1862330yYx, str3, str7, str8, strValueOf2, str9, str10, j, strValueOf3, strLIZIZ, strLIZLLL, str, strValueOf, c1862900yZs, str4, str6);
            C724270Sb3 c724270Sb35 = this.LLJI;
            if (c724270Sb35 != null) {
                obj5 = c724270Sb35.LL;
            } else {
                obj5 = null;
            }
            TakoMixFeed takoMixFeedLJIIIZ = ((C1858660yT2) obj5).LL.LLILLL.LJIIIZ();
            if (takoMixFeedLJIIIZ != null && (str2 = takoMixFeedLJIIIZ.text) != null) {
                numValueOf = Integer.valueOf(str2.length());
            } else {
                numValueOf = null;
            }
            if (C0R2Q.LIZ(numValueOf) >= 150 && j >= 10000) {
                int i = C14FI.LIZ;
                C14FI.LIZ(c1863850ybP.LLILZIL);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void n21(CharSequence charSequence) {
        Dq(charSequence);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        int iLIZIZ = 0;
        if (((Number) C1913307eV.LIZ.getValue()).intValue() != 0) {
            View viewFindViewById = LJJIJL().findViewById(R.id.eva);
            ConstraintLayout constraintLayout = (ConstraintLayout) LJJIJL().findViewById(R.id.iah);
            if (viewFindViewById != null && constraintLayout != null) {
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                int id = viewFindViewById.getId();
                if (!up() && (!(this instanceof TakoAnswerImageAssem) || !tp())) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                c19mb.LJIJI(id).LIZLLL.LJFF = iLIZIZ;
                c19mb.LJIJI(id).LIZLLL.LJ = -1;
                c19mb.LJIJI(id).LIZLLL.LJI = -1.0f;
                c19mb.LIZIZ(constraintLayout);
            }
        }
        Kq();
    }

    public final List<ITakoHighLightAnimProtocol> zq(int i) {
        Object obj;
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), ITakoHighLightAnimProtocol.class, false);
        if (listLIZIZ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (ArrayList) listLIZIZ) {
            ITakoHighLightAnimProtocol iTakoHighLightAnimProtocol = (ITakoHighLightAnimProtocol) obj2;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (iTakoHighLightAnimProtocol.wv1(((C1858660yT2) obj).LL.LLILLL, i)) {
                arrayList.add(obj2);
            }
        }
        return C13LP.LJLLLL(new AComparatorS46S0000000_27(4), arrayList);
    }

    public final void zr(String str) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Object obj;
        ITakoContextAbility iTakoContextAbilityZp = zp();
        if (iTakoContextAbilityZp != null && (c13lcT71 = iTakoContextAbilityZp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = c1863850ybP.LLILZIL;
            String str3 = c1863850ybP.LL;
            String str4 = c1863850ybP.LLILLJJLI;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String str5 = ((C1858660yT2) obj).LL.LLILLL.uuid;
            String str6 = c1863850ybP.LLILZLL;
            String str7 = "";
            if (str6 == null) {
                str6 = "";
            }
            String str8 = c1863850ybP.LLIZ;
            if (str8 != null) {
                str7 = str8;
            }
            C1862330yYx.LJJLIIIJILLIZJL(c1862330yYx, str3, str4, str2, str5, "memory", str, str6, str7);
        }
    }

    public static final <T extends C1858660yT2> View Ip(ConstraintLayout constraintLayout, TakoAnswerBaseAssem<T> takoAnswerBaseAssem) {
        View viewFindViewById = constraintLayout.findViewById(R.id.o6x);
        if (viewFindViewById == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(takoAnswerBaseAssem.getContext()), R.layout.fpn, constraintLayout, false);
            constraintLayout.addView(viewTd);
            return viewTd;
        }
        return viewFindViewById;
    }

    public static final <T extends C1858660yT2> void Qq(TakoAnswerBaseAssem<T> takoAnswerBaseAssem, String str) {
        String str2;
        String str3;
        if (takoAnswerBaseAssem.LLLIIIIL) {
            str2 = "keyboard";
        } else if (takoAnswerBaseAssem.LLLIIIL) {
            str2 = "feedbackSheet";
        } else if (takoAnswerBaseAssem.LLLIIL) {
            str2 = "photoPicker";
        } else if (takoAnswerBaseAssem.LLLIILIL) {
            str2 = "menuWindow";
        } else if (takoAnswerBaseAssem.LLLIL) {
            str2 = "referenceSheet";
        } else if (takoAnswerBaseAssem.LLLILZ) {
            str2 = "drawer";
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str2, takoAnswerBaseAssem.LLLLIIL)) {
            takoAnswerBaseAssem.LLLLIIL = str2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("blockReason=");
            if (str2 == null) {
                str3 = "none";
            } else {
                str3 = str2;
            }
            sbLIZ.append(str3);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (str2 == null) {
            takoAnswerBaseAssem.Fq(str);
        } else {
            takoAnswerBaseAssem.Mq(str);
        }
    }

    public static C05PU[] xq(int i, List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ITakoHighLightAnimProtocol) it2.next()).dz(i));
            }
            C05PU[] c05puArr = (C05PU[]) arrayList.toArray(new C05PU[0]);
            if (c05puArr != null) {
                return c05puArr;
            }
        }
        return new C05PU[0];
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void DP0(String str, String str2) {
        Object obj;
        TakoChatUIAbility takoChatUIAbilityAq;
        String str3;
        String str4;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String strUN0;
        EnumC1863020ya4 enumC1863020ya4JS1;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        C13LC<C1864200yby> c13lcAp02;
        C1864200yby c1864200yby2;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        String str5;
        Map<String, String> map;
        String mobOnboardingStyle = null;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        String str6 = "";
        if (iTakoContextAbility != null && (c13lcT712 = iTakoContextAbility.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str7 = c1863850ybP2.LL;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = c1863850ybP2.LLILLJJLI;
            if (str8 == null) {
                str8 = "";
            }
            String str9 = c1863850ybP2.LLILZIL;
            if (str9 == null) {
                str9 = "";
            }
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            } else {
                obj2 = null;
            }
            String str10 = ((C1858660yT2) obj2).LLILLL;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            Long lValueOf = Long.valueOf(((C1858660yT2) obj3).LLILZ);
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj4 = c724270Sb32.LL;
            } else {
                obj4 = null;
            }
            String strValueOf = String.valueOf(((C1858660yT2) obj4).LLILZIL);
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj5 = c724270Sb33.LL;
            } else {
                obj5 = null;
            }
            String str11 = ((C1858660yT2) obj5).LLILLJJLI;
            String str12 = c1863850ybP2.LLILLL;
            if (c724270Sb33 != null) {
                obj6 = c724270Sb33.LL;
            } else {
                obj6 = null;
            }
            TakoMixFeed takoMixFeed = ((C1858660yT2) obj6).LLILZLL;
            if (takoMixFeed == null || (map = takoMixFeed.msgExt) == null || (str5 = map.get("push_id")) == null) {
                str5 = "";
            }
            String str13 = c1863850ybP2.LLILZLL;
            if (str13 == null) {
                str13 = "";
            }
            String str14 = c1863850ybP2.LLIZ;
            if (str14 == null) {
                str14 = "";
            }
            C1862330yYx.LLFZ(c1862330yYx, str7, str8, str9, str10, lValueOf, strValueOf, str11, str, str2, "", str12, str5, str13, str14, 16384);
        }
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj = c724270Sb34.LL;
        } else {
            obj = null;
        }
        if (((C1858660yT2) obj).LL.LLILLL.isPush && (takoChatUIAbilityAq = Aq()) != null && takoChatUIAbilityAq.Ve0()) {
            ITakoContextAbility iTakoContextAbilityZp = zp();
            if (iTakoContextAbilityZp == null || (c13lcAp02 = iTakoContextAbilityZp.Ap0()) == null || (c1864200yby2 = (C1864200yby) c13lcAp02.LIZIZ()) == null || (str3 = c1864200yby2.LL) == null) {
                str3 = "";
            }
            ITakoContextAbility iTakoContextAbilityZp2 = zp();
            if (iTakoContextAbilityZp2 != null && (c13lcAp0 = iTakoContextAbilityZp2.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                str4 = c1864200yby.LLILLJJLI;
            } else {
                str4 = null;
            }
            ITakoContextAbility iTakoContextAbilityZp3 = zp();
            if (iTakoContextAbilityZp3 != null && (c13lcT71 = iTakoContextAbilityZp3.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                C1862330yYx c1862330yYx2 = C1862330yYx.LIZ;
                String str15 = c1863850ybP.LL;
                if (str15 == null) {
                    str15 = "";
                }
                String str16 = c1863850ybP.LLILLJJLI;
                if (str16 == null) {
                    str16 = "";
                }
                String str17 = c1863850ybP.LLILZIL;
                if (str17 == null) {
                    str17 = "";
                }
                String str18 = c1863850ybP.LLIZ;
                TakoChatUIAbility takoChatUIAbilityAq2 = Aq();
                if (takoChatUIAbilityAq2 != null) {
                    strUN0 = takoChatUIAbilityAq2.uN0();
                } else {
                    strUN0 = null;
                }
                String str19 = c1863850ybP.LLJ;
                if (str19 == null) {
                    str19 = "";
                }
                if (str4 != null) {
                    str6 = str4;
                }
                TakoChatUIAbility takoChatUIAbilityAq3 = Aq();
                if (takoChatUIAbilityAq3 != null && (enumC1863020ya4JS1 = takoChatUIAbilityAq3.jS1()) != null) {
                    mobOnboardingStyle = enumC1863020ya4JS1.getMobOnboardingStyle();
                }
                C1862330yYx.LJJZ(512, c1862330yYx2, str15, str16, str17, str3, str18, strUN0, str19, str6, "click_push", mobOnboardingStyle);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ez(java.lang.CharSequence r12, java.lang.CharSequence r13) {
        /*
            r11 = this;
            android.content.Context r3 = r11.getContext()
            if (r3 == 0) goto L6b
            if (r13 == 0) goto L6b
            java.lang.String r4 = r13.toString()
            if (r4 == 0) goto L6b
            X.141H r2 = X.C141H.LIZ
            r2.getClass()
            boolean r0 = X.C141H.LIZ(r4)
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility r0 = r11.zp()
            if (r0 == 0) goto L25
            java.util.Map r5 = r0.getCommonParams()
            if (r5 != 0) goto L29
        L25:
            java.util.Map r5 = X.C2097608Jq.LJ()
        L29:
            X.0Sb3 r1 = r11.LLJI
            r10 = 0
            if (r1 == 0) goto L70
            java.lang.Object r0 = r1.LL
        L30:
            X.0yT2 r0 = (X.C1858660yT2) r0
            java.lang.String r6 = r0.LLILLJJLI
            if (r1 == 0) goto L6e
            java.lang.Object r0 = r1.LL
        L38:
            X.0yT2 r0 = (X.C1858660yT2) r0
            long r7 = r0.LLILZ
            com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility r0 = r11.Aq()
            if (r0 == 0) goto L6c
            boolean r0 = r0.Gx1()
            r9 = 1
            if (r0 != r9) goto L6c
        L49:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r11)
            java.lang.Class<com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility> r0 = com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r10)
            com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility r0 = (com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility) r0
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.tako.model.TakoPageContext r10 = r0.BD()
        L5b:
            r2.getClass()
            boolean r0 = X.C141H.LIZIZ(r3, r4, r5, r6, r7, r9, r10)
            if (r0 == 0) goto L6b
            java.lang.String r0 = java.lang.String.valueOf(r12)
            r11.DP0(r0, r4)
        L6b:
            return
        L6c:
            r9 = 0
            goto L49
        L6e:
            r0 = r10
            goto L38
        L70:
            r0 = r10
            goto L30
        L72:
            r11.Kr(r3, r4, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem.Ez(java.lang.CharSequence, java.lang.CharSequence):void");
    }

    public void Gq(View view, T t) {
        if (!Intrinsics.LJFF(t.LL.LLILLL.uuid, this.LLLLLL)) {
            Dr("update memories about you");
            this.LLLLLL = t.LL.LLILLL.uuid;
        }
        C786410Ut5.T4(view, 1.0f);
        C786410Ut5.LJLLLLLL(0, view);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void bJ2(CharSequence charSequence, CharSequence charSequence2) {
        String string;
        Map<String, String> mapLJ;
        Object obj;
        Object obj2;
        boolean z;
        Context context = getContext();
        if (context != null && charSequence2 != null && (string = charSequence2.toString()) != null) {
            C141H c141h = C141H.LIZ;
            c141h.getClass();
            if (C141H.LIZ(string)) {
                ITakoContextAbility iTakoContextAbilityZp = zp();
                if (iTakoContextAbilityZp == null || (mapLJ = iTakoContextAbilityZp.getCommonParams()) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                C724270Sb3 c724270Sb3 = this.LLJI;
                TakoPageContext takoPageContextBD = null;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                String str = ((C1858660yT2) obj).LLILLJJLI;
                if (c724270Sb3 != null) {
                    obj2 = c724270Sb3.LL;
                } else {
                    obj2 = null;
                }
                long j = ((C1858660yT2) obj2).LLILZ;
                TakoChatUIAbility takoChatUIAbilityAq = Aq();
                if (takoChatUIAbilityAq != null && takoChatUIAbilityAq.Gx1()) {
                    z = true;
                } else {
                    z = false;
                }
                ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoChatPageAbility.class, null);
                if (iTakoChatPageAbility != null) {
                    takoPageContextBD = iTakoChatPageAbility.BD();
                }
                c141h.getClass();
                C141H.LIZIZ(context, string, mapLJ, str, j, z, takoPageContextBD);
                return;
            }
            Kr(context, string, charSequence);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void iX0(String str, String str2) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C19EG c19egLIZ;
        Object obj;
        LifecycleOwner lifecycleOwnerLJFF;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str3;
        Map<String, String> map;
        Object obj6 = null;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (c13lcT71 = iTakoContextAbility.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        sbLIZ.append(((C1858660yT2) obj).LLILLJJLI);
        sbLIZ.append('_');
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        c1862330yYx.getClass();
        Map<Integer, Set<String>> map2 = C1862330yYx.LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
        Set set = (Set) linkedHashMap.get(Integer.valueOf(c19egLIZ.hashCode()));
        if (set != null && set.contains(strLIZIZ)) {
            return;
        }
        Set set2 = (Set) linkedHashMap.get(Integer.valueOf(c19egLIZ.hashCode()));
        if (set2 != null) {
            set2.add(strLIZIZ);
        } else {
            map2.put(Integer.valueOf(c19egLIZ.hashCode()), C093Y.LJ(strLIZIZ));
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ == null || (lifecycleOwnerLJFF = abstractC1387200mCcLJ.LJFF()) == null) {
                lifecycleOwnerLJFF = c19egLIZ;
            }
            lifecycleOwnerLJFF.getLifecycle().addObserver(new TakoAnswerBaseAssem$mobWeblinkShow$1$1$1(c19egLIZ));
        }
        String str4 = c1863850ybP.LL;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        String str6 = c1863850ybP.LLILLJJLI;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = c1863850ybP.LLILZIL;
        if (str7 == null) {
            str7 = "";
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        String str8 = ((C1858660yT2) obj2).LLILLL;
        if (c724270Sb32 != null) {
            obj3 = c724270Sb32.LL;
        } else {
            obj3 = null;
        }
        long j = ((C1858660yT2) obj3).LLILZ;
        if (c724270Sb32 != null) {
            obj4 = c724270Sb32.LL;
        } else {
            obj4 = null;
        }
        String str9 = ((C1858660yT2) obj4).LLILLJJLI;
        if (c724270Sb32 != null) {
            obj6 = c724270Sb32.LL;
        }
        String strValueOf = String.valueOf(((C1858660yT2) obj6).LLILZIL);
        String str10 = c1863850ybP.LLILLL;
        if (str10 == null) {
            str10 = "";
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj5 = c724270Sb33.LL;
        } else {
            obj5 = null;
        }
        TakoMixFeed takoMixFeed = ((C1858660yT2) obj5).LLILZLL;
        if (takoMixFeed == null || (map = takoMixFeed.msgExt) == null || (str3 = map.get("push_id")) == null) {
            str3 = "";
        }
        String str11 = c1863850ybP.LLILZLL;
        if (str11 != null) {
            str5 = str11;
        }
        C1862330yYx.LLI(c1862330yYx, str4, str6, str7, str8, Long.valueOf(j), strValueOf, str9, str, str2, "", str3, "", str10, str5, c1863850ybP.LLIZ, 32768);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void m52(CharSequence charSequence, CharSequence charSequence2) {
        iX0(String.valueOf(charSequence), String.valueOf(charSequence2));
    }

    public final void nr(String str, String str2) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Object obj;
        boolean z;
        ITakoContextAbility iTakoContextAbilityZp = zp();
        if (iTakoContextAbilityZp != null && (c13lcT71 = iTakoContextAbilityZp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str3 = c1863850ybP.LLILZIL;
            String str4 = c1863850ybP.LL;
            String str5 = c1863850ybP.LLILLJJLI;
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String str6 = ((C1858660yT2) obj).LL.LLILLL.uuid;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            }
            String strLIZIZ = C1855920yOc.LIZIZ(((C1858660yT2) obj2).LL.LLILLL);
            if (strLIZIZ.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            String str7 = "default";
            if (z) {
                strLIZIZ = "default";
            }
            String str8 = c1863850ybP.LLILZLL;
            String str9 = "";
            if (str8 == null) {
                str8 = "";
            }
            String str10 = c1863850ybP.LLIZ;
            if (str10 != null) {
                str9 = str10;
            }
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            Pair[] pairArr = new Pair[7];
            pairArr[0] = new Pair("process_id", str3);
            pairArr[1] = new Pair("enter_from", str4);
            pairArr[2] = new Pair("enter_method", str5);
            pairArr[3] = new Pair("message_id", str6);
            pairArr[4] = new Pair("button_type", str);
            if (strLIZIZ.length() != 0) {
                str7 = strLIZIZ;
            }
            pairArr[5] = new Pair("mode", str7);
            pairArr[6] = new Pair("body_type", str2);
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (str8.length() > 0) {
                mapLJIIJ.put("tako_session_id", str8);
            }
            if (str9.length() > 0) {
                mapLJIIJ.put("tako_chat_id", str9);
            }
            c20235014FoLIZ.LIZ("tikbot_reference_click", mapLJIIJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void yk0(View view, C1860910yWf c1860910yWf) {
        Object obj;
        String string;
        Map<String, String> mapLJ;
        Object obj2;
        String str;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj3 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!C1858670yT3.LJIIJ(((C1858660yT2) obj).LL.LLILLL)) {
            return;
        }
        int i = 6;
        String str2 = "";
        if (Intrinsics.LJFF(c1860910yWf.LL, "table")) {
            String str3 = c1860910yWf.LLILLJJLI;
            if (str3.length() == 0) {
                string = "";
            } else {
                StringBuilder sb = new StringBuilder();
                Regex regex = new Regex("\\[(.*?)]\\((.*?)\\)");
                Iterator it2 = a0.LJJLIIIJILLIZJL(str3, new String[]{"\n"}, 0, 6).iterator();
                while (it2.hasNext()) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJLIIIL((String) it2.next()).toString(), new String[]{"|"}, 0, i);
                    int i2 = 0;
                    for (Object obj4 : listLJJLIIIJILLIZJL) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            String strReplace = (String) obj4;
                            if (strReplace.length() > 0 && !u.LJJIIJZLJL(strReplace, "<data-", false)) {
                                if (regex.containsMatchIn(strReplace)) {
                                    strReplace = regex.replace(strReplace, AnonymousClass0207.get$arr$(71));
                                }
                                sb.append(strReplace);
                            }
                            if (i2 != listLJJLIIIJILLIZJL.size() - 1) {
                                sb.append("|");
                            }
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    sb.append("\n");
                    i = 6;
                }
                string = sb.toString();
            }
        } else {
            string = c1860910yWf.LLILLJJLI;
        }
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        C1857420yR2.LJJ(view, string);
        Map<String, String> mapDq = dq();
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        if (mapDq == null) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = mapDq;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        String str4 = ((C1858660yT2) obj2).LL.LLILLL.uuid;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_table_copy", C2097608Jq.LJIIIIZZ(new Pair("enter_from", mapLJ.get("enter_from")), new Pair("enter_method", mapLJ.get("enter_method")), new Pair("process_id", mapLJ.get("process_id")), new Pair("tako_session_id", mapLJ.get("tako_session_id")), new Pair("tako_chat_id", mapLJ.get("tako_chat_id")), new Pair("message_id", str4), new Pair("copied_content", string)));
        C1862420yZ6 c1862420yZ6 = C1862420yZ6.LIZ;
        if (mapDq != null && (str = mapDq.get("process_id")) != null) {
            str2 = str;
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        }
        String str5 = ((C1858660yT2) obj3).LL.LLILLL.uuid;
        String type = EnumC1858730yT9.COPY.getType();
        c1862420yZ6.getClass();
        C1862420yZ6.LIZ(str2, str5, type);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object aq(com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem r6, kotlin.jvm.internal.AwS489S0200000_27 r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C1860760yWQ
            if (r0 == 0) goto L27
            r5 = r8
            X.0yWQ r5 = (X.C1860760yWQ) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 == r3) goto L45
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L27:
            X.0yWQ r5 = new X.0yWQ
            r5.<init>(r6, r8)
            goto L12
        L2d:
            X.C155000ia.LIZIZ(r1)
            X.1DDr r2 = r6.LLLLZIL
            Y.AgS285S0100000_4 r1 = new Y.AgS285S0100000_4
            r0 = 40
            r1.<init>(r7, r0)
            r5.LLILLL = r3
            r2.getClass()
            java.lang.Object r0 = X.C2252331DDr.LJIIJ(r2, r1, r5)
            if (r0 != r4) goto L48
            return r4
        L45:
            X.C155000ia.LIZIZ(r1)
        L48:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem.aq(com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, kotlin.jvm.internal.AwS489S0200000_27, X.05Vn):java.lang.Object");
    }

    public static int fq(int i, int i2, CharSequence charSequence) {
        int i3 = 0;
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length();
        if (i2 > length) {
            i2 = length;
        }
        if (i2 <= i) {
            return 0;
        }
        while (i < i2) {
            if (charSequence.charAt(i) != 65532) {
                i3++;
            }
            i++;
        }
        return i3;
    }

    public final void Jq(List<? extends CharSequence> list, View view, String str) {
        Object obj;
        List<TakoSourceItem> list2;
        int i;
        Aweme aweme;
        TakoProductItem takoProductItem;
        TakoVideoItem takoVideoItem;
        if (list != null) {
            int i2 = 1;
            if (!list.isEmpty()) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                TakoMixFeed takoMixFeedLJIIIZ = ((C1858660yT2) obj).LL.LLILLL.LJIIIZ();
                if (takoMixFeedLJIIIZ != null && (list2 = takoMixFeedLJIIIZ.sources) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TakoSourceItem takoSourceItem : list2) {
                        if (list.contains(String.valueOf(takoSourceItem.rank))) {
                            arrayList.add(takoSourceItem);
                        }
                    }
                    FragmentManager fragmentManagerLIZ = C20230914Dz.LIZ(getContentView(), C724240Sb0.LIZ(this));
                    if (fragmentManagerLIZ != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            TakoSourceItem takoSourceItem2 = (TakoSourceItem) obj2;
                            if (takoSourceItem2.type != 1 || ((takoVideoItem = takoSourceItem2.video) != null && takoVideoItem.LIZ != null)) {
                                arrayList2.add(obj2);
                            }
                        }
                        int size = arrayList2.size();
                        ArrayList arrayList3 = new ArrayList();
                        int i3 = 0;
                        for (Object obj3 : arrayList2) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                TakoSourceItem takoSourceItem3 = (TakoSourceItem) obj3;
                                int i5 = takoSourceItem3.type;
                                if (i5 != 0) {
                                    if (i5 != i2) {
                                        if (i5 == 3 && (takoProductItem = takoSourceItem3.goods) != null) {
                                            arrayList3.add(new C434510H2b(i3, size, takoProductItem.productId, takoProductItem.title, takoProductItem.schema, takoProductItem.productRating, takoProductItem.img));
                                        }
                                    } else {
                                        TakoVideoItem takoVideoItem2 = takoSourceItem3.video;
                                        if (takoVideoItem2 != null && (aweme = takoVideoItem2.LIZ) != null) {
                                            arrayList3.add(new C434570H2h(i3, size, aweme));
                                        }
                                    }
                                } else {
                                    TakoLinkItem takoLinkItem = takoSourceItem3.link;
                                    if (takoLinkItem != null) {
                                        arrayList3.add(new C434520H2c(takoLinkItem.title, i3, size, takoLinkItem.name, takoLinkItem.snippet, takoLinkItem.link, takoLinkItem.icon));
                                    }
                                }
                                i3 = i4;
                                i2 = 1;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            C1ER1 c1er1 = C1ER1.LIZIZ;
                            Map<String, String> mapDq = dq();
                            C1860830yWX.LIZ.getClass();
                            if (C1860830yWX.LIZ()) {
                                i = 2;
                            } else {
                                i = 0;
                            }
                            C1390920mIc c1390920mIcLLLJL = c1er1.LLLJL(view, new C434640H2o(arrayList3, mapDq, null, i, C1860830yWX.LIZ(), 4), new AwS201S1100000_27((TakoAnswerBaseAssem) this, str, (String) 0), new AwS201S1100000_27((TakoAnswerBaseAssem) this, str, (String) 1), null, null);
                            c1390920mIcLLLJL.LIZ.LLILLJJLI = new DialogInterfaceOnDismissListenerC1864750ycr(this, 5);
                            wq().setState(new AwS36S0010000_24(true, 38));
                            c1390920mIcLLLJL.LIZ.show(fragmentManagerLIZ, "reference_sheet");
                        }
                    }
                }
            }
        }
    }

    public final void Kr(Context context, String str, CharSequence charSequence) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131847085);
        c1397580mTM.LIZ(2131847082);
        C985403tE.LIZ(c1397580mTM, new AwS95S1200000_10(str, (String) this, charSequence, (CharSequence) 10));
        c1397580mTM.LJII = true;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void MI0(Message message, String str, boolean z) {
        this.LLLLZIL.LIZJ(new C443120HZe(message, str, Boolean.valueOf(z)));
    }

    public List Wp(View view, InterfaceC665370Q7z interfaceC665370Q7z, Message message) {
        Object obj;
        String strLJIIIZ;
        Object obj2;
        String strLJIIIZ2;
        C1919007fQ.LIZ.getClass();
        String str = "";
        if (C1919007fQ.LIZLLL()) {
            if (C1919007fQ.LIZIZ()) {
                return new ArrayList();
            }
            C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
            ArrayList arrayList = new ArrayList();
            C1857420yR2.LJIIIIZZ(view, interfaceC665370Q7z, message, "long_press", arrayList);
            C1857420yR2.LJ(view, interfaceC665370Q7z, message, "long_press", arrayList);
            C1860130yVP c1860130yVP = this.LLLLZI;
            if (c1860130yVP != null) {
                strLJIIIZ2 = C1859930yV5.LIZJ(c1860130yVP);
                if (strLJIIIZ2 != null) {
                }
                C1857420yR2.LIZIZ(arrayList, view, str, message, interfaceC665370Q7z, null, null, 48);
                C1857420yR2.LJIILL(arrayList, this.LLLLZI, message, interfaceC665370Q7z, !Eq());
                C1857420yR2.LJIILLIIL(24, view, interfaceC665370Q7z, message, null, arrayList, null);
                C1857420yR2.LIZLLL(arrayList, getContext(), message, C1858670yT3.LIZ(message, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null)), interfaceC665370Q7z);
                C1857420yR2.LJIIL(arrayList, view, message, interfaceC665370Q7z, false, null, 24);
                C1857420yR2.LIZJ(interfaceC665370Q7z, arrayList);
                return arrayList;
            }
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            } else {
                obj2 = null;
            }
            strLJIIIZ2 = AnonymousClass1418.LJIIIZ(((C1858660yT2) obj2).LLILZLL);
            str = strLJIIIZ2;
            C1857420yR2.LIZIZ(arrayList, view, str, message, interfaceC665370Q7z, null, null, 48);
            C1857420yR2.LJIILL(arrayList, this.LLLLZI, message, interfaceC665370Q7z, !Eq());
            C1857420yR2.LJIILLIIL(24, view, interfaceC665370Q7z, message, null, arrayList, null);
            C1857420yR2.LIZLLL(arrayList, getContext(), message, C1858670yT3.LIZ(message, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null)), interfaceC665370Q7z);
            C1857420yR2.LJIIL(arrayList, view, message, interfaceC665370Q7z, false, null, 24);
            C1857420yR2.LIZJ(interfaceC665370Q7z, arrayList);
            return arrayList;
        }
        C1857420yR2 c1857420yR22 = C1857420yR2.LIZ;
        ArrayList arrayList2 = new ArrayList();
        C1857420yR2.LJIIIIZZ(view, interfaceC665370Q7z, message, "long_press", arrayList2);
        C1857420yR2.LJ(view, interfaceC665370Q7z, message, "long_press", arrayList2);
        C1860130yVP c1860130yVP2 = this.LLLLZI;
        if (c1860130yVP2 != null) {
            strLJIIIZ = C1859930yV5.LIZJ(c1860130yVP2);
            if (strLJIIIZ != null) {
            }
            C1857420yR2.LIZIZ(arrayList2, view, str, message, interfaceC665370Q7z, null, null, 48);
            C1857420yR2.LJIILL(arrayList2, this.LLLLZI, message, interfaceC665370Q7z, !Eq());
            C1857420yR2.LJIILLIIL(24, view, interfaceC665370Q7z, message, null, arrayList2, null);
            C1857420yR2.LJIIL(arrayList2, view, message, interfaceC665370Q7z, false, null, 24);
            C1857420yR2.LIZLLL(arrayList2, getContext(), message, C1858670yT3.LIZ(message, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null)), interfaceC665370Q7z);
            C1857420yR2.LIZJ(interfaceC665370Q7z, arrayList2);
            return arrayList2;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj = c724270Sb32.LL;
        } else {
            obj = null;
        }
        strLJIIIZ = AnonymousClass1418.LJIIIZ(((C1858660yT2) obj).LLILZLL);
        str = strLJIIIZ;
        C1857420yR2.LIZIZ(arrayList2, view, str, message, interfaceC665370Q7z, null, null, 48);
        C1857420yR2.LJIILL(arrayList2, this.LLLLZI, message, interfaceC665370Q7z, !Eq());
        C1857420yR2.LJIILLIIL(24, view, interfaceC665370Q7z, message, null, arrayList2, null);
        C1857420yR2.LJIIL(arrayList2, view, message, interfaceC665370Q7z, false, null, 24);
        C1857420yR2.LIZLLL(arrayList2, getContext(), message, C1858670yT3.LIZ(message, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null)), interfaceC665370Q7z);
        C1857420yR2.LIZJ(interfaceC665370Q7z, arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ZA2(X.InterfaceC418250Gad r12, java.lang.CharSequence r13, java.util.Map<java.lang.String, ? extends java.lang.Object> r14) {
        /*
            r11 = this;
            boolean r0 = r12.LJI()
            if (r0 == 0) goto La
            r11.Dq(r13)
        L9:
            return
        La:
            boolean r0 = r12.LJIIIIZZ()
            if (r0 == 0) goto L9
            android.content.Context r3 = r11.getContext()
            if (r3 == 0) goto L9
            r10 = 0
            if (r14 == 0) goto L8e
            java.lang.String r0 = "origin_url"
            java.lang.Object r4 = r14.get(r0)
        L1f:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L8c
            java.lang.String r4 = (java.lang.String) r4
        L25:
            X.141H r2 = X.C141H.LIZ
            r2.getClass()
            boolean r0 = X.C141H.LIZ(r4)
            if (r0 == 0) goto L90
            com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility r0 = r11.zp()
            if (r0 == 0) goto L3c
            java.util.Map r5 = r0.getCommonParams()
            if (r5 != 0) goto L40
        L3c:
            java.util.Map r5 = X.C2097608Jq.LJ()
        L40:
            X.0Sb3 r1 = r11.LLJI
            if (r1 == 0) goto L8a
            java.lang.Object r0 = r1.LL
        L46:
            X.0yT2 r0 = (X.C1858660yT2) r0
            java.lang.String r6 = r0.LLILLJJLI
            if (r1 == 0) goto L88
            java.lang.Object r0 = r1.LL
        L4e:
            X.0yT2 r0 = (X.C1858660yT2) r0
            long r7 = r0.LLILZ
            com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility r0 = r11.Aq()
            if (r0 == 0) goto L86
            boolean r0 = r0.Gx1()
            r9 = 1
            if (r0 != r9) goto L86
        L5f:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r11)
            java.lang.Class<com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility> r0 = com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r10)
            com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility r0 = (com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility) r0
            if (r0 == 0) goto L71
            com.ss.android.ugc.aweme.tako.model.TakoPageContext r10 = r0.BD()
        L71:
            r2.getClass()
            boolean r0 = X.C141H.LIZIZ(r3, r4, r5, r6, r7, r9, r10)
            if (r0 == 0) goto L9
            java.lang.String r0 = java.lang.String.valueOf(r13)
            if (r4 != 0) goto L82
            java.lang.String r4 = ""
        L82:
            r11.DP0(r0, r4)
            return
        L86:
            r9 = 0
            goto L5f
        L88:
            r0 = r10
            goto L4e
        L8a:
            r0 = r10
            goto L46
        L8c:
            r4 = r10
            goto L25
        L8e:
            r4 = r10
            goto L1f
        L90:
            r11.Kr(r3, r4, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem.ZA2(X.0Gad, java.lang.CharSequence, java.util.Map):void");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void mA0(String str, int i, boolean z) {
        ITakoContextAbility iTakoContextAbilityZp;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Object obj;
        if (z && (iTakoContextAbilityZp = zp()) != null && (c13lcT71 = iTakoContextAbilityZp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = c1863850ybP.LLILZIL;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = c1863850ybP.LLILZLL;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c1863850ybP.LLIZ;
            if (str5 != null) {
                str3 = str5;
            }
            String str6 = c1863850ybP.LL;
            String str7 = c1863850ybP.LLILLJJLI;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String str8 = ((C1858660yT2) obj).LL.LLILLL.uuid;
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str8);
            sbLIZ.append('_');
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Map<String, Set<String>> map = C1862330yYx.LJIIJJI;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Set set = (Set) linkedHashMap.get(str2);
            if (set != null && set.contains(strLIZIZ)) {
                return;
            }
            c20235014FoLIZ.LIZ("tikbot_highlighted_word_show", C2097608Jq.LJIIJ(new Pair("process_id", str2), new Pair("enter_from", str6), new Pair("enter_method", str7), new Pair("message_id", str8), new Pair("word_content", str), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str3)));
            Set set2 = (Set) linkedHashMap.get(str2);
            if (set2 != null) {
                set2.add(strLIZIZ);
            } else {
                map.put(str2, C093Y.LJ(strLIZIZ));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void mu2(LinkUnderLineSpan linkUnderLineSpan, CharSequence charSequence, Map map) {
        String string;
        if (C418190GaX.LIZIZ(linkUnderLineSpan)) {
            String strValueOf = String.valueOf(charSequence);
            Object obj = ((LinkedHashMap) map).get("origin_url");
            if (obj == null || (string = obj.toString()) == null) {
                string = "";
            }
            iX0(strValueOf, string);
        }
    }

    public final void xr(int i, InterfaceC434580H2i interfaceC434580H2i, String str) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Object obj;
        String str2;
        String str3;
        Object obj2;
        boolean z;
        C434520H2c c434520H2c;
        C434520H2c c434520H2c2;
        ITakoContextAbility iTakoContextAbilityZp = zp();
        if (iTakoContextAbilityZp != null && (c13lcT71 = iTakoContextAbilityZp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str4 = c1863850ybP.LLILZIL;
            String str5 = c1863850ybP.LL;
            String str6 = c1863850ybP.LLILLJJLI;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String str7 = ((C1858660yT2) obj).LL.LLILLL.uuid;
            String strValueOf = String.valueOf(i);
            boolean z2 = interfaceC434580H2i instanceof C434520H2c;
            if (z2 && (c434520H2c2 = (C434520H2c) interfaceC434580H2i) != null) {
                str2 = c434520H2c2.LLILLL;
            } else {
                str2 = null;
            }
            if (z2 && (c434520H2c = (C434520H2c) interfaceC434580H2i) != null) {
                str3 = c434520H2c.LLILZIL;
            } else {
                str3 = null;
            }
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            String strLIZIZ = C1855920yOc.LIZIZ(((C1858660yT2) obj2).LL.LLILLL);
            if (strLIZIZ.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            String str8 = "default";
            if (z) {
                strLIZIZ = "default";
            }
            String str9 = c1863850ybP.LLILZLL;
            String str10 = "";
            if (str9 == null) {
                str9 = "";
            }
            String str11 = c1863850ybP.LLIZ;
            if (str11 != null) {
                str10 = str11;
            }
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            Pair[] pairArr = new Pair[9];
            pairArr[0] = new Pair("process_id", str4);
            pairArr[1] = new Pair("enter_from", str5);
            pairArr[2] = new Pair("enter_method", str6);
            pairArr[3] = new Pair("message_id", str7);
            pairArr[4] = new Pair("link_name", str2);
            pairArr[5] = new Pair("link_url", str3);
            pairArr[6] = new Pair("rank", strValueOf);
            if (strLIZIZ.length() != 0) {
                str8 = strLIZIZ;
            }
            pairArr[7] = new Pair("mode", str8);
            pairArr[8] = new Pair("body_type", str);
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (str9.length() > 0) {
                mapLJIIJ.put("tako_session_id", str9);
            }
            if (str10.length() > 0) {
                mapLJIIJ.put("tako_chat_id", str10);
            }
            c20235014FoLIZ.LIZ("tikbot_reference_item_click", mapLJIIJ);
        }
    }

    public final void yr(int i, InterfaceC434580H2i interfaceC434580H2i, String str) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Object obj;
        String str2;
        String str3;
        String str4;
        Object obj2;
        boolean z;
        C434520H2c c434520H2c;
        C434520H2c c434520H2c2;
        ITakoContextAbility iTakoContextAbilityZp = zp();
        if (iTakoContextAbilityZp != null && (c13lcT71 = iTakoContextAbilityZp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str5 = c1863850ybP.LLILZIL;
            String str6 = c1863850ybP.LL;
            String str7 = c1863850ybP.LLILLJJLI;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String str8 = ((C1858660yT2) obj).LL.LLILLL.uuid;
            String strValueOf = String.valueOf(i);
            boolean z2 = interfaceC434580H2i instanceof C434520H2c;
            if (z2 && (c434520H2c2 = (C434520H2c) interfaceC434580H2i) != null) {
                str2 = c434520H2c2.LLILLL;
            } else {
                str2 = null;
            }
            if (z2 && (c434520H2c = (C434520H2c) interfaceC434580H2i) != null) {
                str3 = c434520H2c.LLILZIL;
            } else {
                str3 = null;
            }
            String str9 = "";
            if (interfaceC434580H2i instanceof C434570H2h) {
                str4 = "tt_video";
            } else if (z2) {
                str4 = "webpage";
            } else if (!(interfaceC434580H2i instanceof C434510H2b)) {
                str4 = "";
            } else {
                str4 = "tt_shop";
            }
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            String strLIZIZ = C1855920yOc.LIZIZ(((C1858660yT2) obj2).LL.LLILLL);
            if (strLIZIZ.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                strLIZIZ = "default";
            }
            String str10 = c1863850ybP.LLILZLL;
            if (str10 == null) {
                str10 = "";
            }
            String str11 = c1863850ybP.LLIZ;
            if (str11 != null) {
                str9 = str11;
            }
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            Pair[] pairArr = new Pair[10];
            pairArr[0] = new Pair("process_id", str5);
            pairArr[1] = new Pair("enter_from", str6);
            pairArr[2] = new Pair("enter_method", str7);
            pairArr[3] = new Pair("message_id", str8);
            pairArr[4] = new Pair("link_name", str2);
            pairArr[5] = new Pair("link_url", str3);
            pairArr[6] = new Pair("rank", strValueOf);
            pairArr[7] = new Pair("item_type", str4);
            if (strLIZIZ.length() == 0) {
                strLIZIZ = "default";
            }
            pairArr[8] = new Pair("mode", strLIZIZ);
            pairArr[9] = new Pair("body_type", str);
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (str10.length() > 0) {
                mapLJIIJ.put("tako_session_id", str10);
            }
            if (str9.length() > 0) {
                mapLJIIJ.put("tako_chat_id", str9);
            }
            c20235014FoLIZ.LIZ("tikbot_reference_item_show", mapLJIIJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void Kk(View view, List<? extends CharSequence> list, String str, String str2) {
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        List<TakoSourceItem> list2;
        String str3;
        TakoVideoItem takoVideoItem;
        if (C289470BWf.LIZ()) {
            if (list != null && (!list.isEmpty())) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                TakoMixFeed takoMixFeedLJIIIZ = ((C1858660yT2) obj).LL.LLILLL.LJIIIZ();
                if (takoMixFeedLJIIIZ != null && (list2 = takoMixFeedLJIIIZ.sources) != null) {
                    arrayList = new ArrayList();
                    for (TakoSourceItem takoSourceItem : list2) {
                        TakoSourceItem takoSourceItem2 = takoSourceItem;
                        if (list.contains(String.valueOf(takoSourceItem2.rank)) && takoSourceItem2.type == 1 && ((takoVideoItem = takoSourceItem2.video) == null || takoVideoItem.LIZ == null)) {
                            arrayList.add(takoSourceItem);
                        }
                    }
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        TakoVideoItem takoVideoItem2 = ((TakoSourceItem) it2.next()).video;
                        if (takoVideoItem2 != null) {
                            str3 = takoVideoItem2.awemeId;
                        } else {
                            str3 = null;
                        }
                        arrayList2.add(str3);
                    }
                } else {
                    arrayList = null;
                    arrayList2 = null;
                }
                String strValueOf = String.valueOf(arrayList2);
                AwS29S1400000_27 awS29S1400000_27 = new AwS29S1400000_27((TakoAnswerBaseAssem) this, (List) list, (List<? extends CharSequence>) view, (View) str2, (String) arrayList, (List<TakoSourceItem>) 1);
                if (strValueOf.length() <= 2) {
                    awS29S1400000_27.invoke(null);
                } else {
                    C013C c013c = new C013C();
                    C259800zU c259800zU = new C259800zU();
                    AssemVMLazy assemVMLazy = this.LLLFZ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLZLLIL;
                    ((TakoInnerDetailVM) assemVMLazy.getValue()).wQ2(strValueOf, new AwS122S0400000_27(c259800zU, this, c013c, awS29S1400000_27, strValueOf, 9), new AwS122S0400000_27(c259800zU, this, c013c, awS29S1400000_27, strValueOf, 10), new AwS271S0300000_27((TakoAnswerBaseAssem) this, (TakoAnswerBaseAssem<C1858660yT2>) c259800zU, (C259800zU<DialogC1389620mGW>) c013c, (C013C) 10));
                }
            }
        } else {
            Jq(list, view, str2);
        }
        nr(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01c8  */
    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Zp1(android.view.View r38, final java.lang.String r39, int r40, final boolean r41) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem.Zp1(android.view.View, java.lang.String, int, boolean):void");
    }

    public static View iq(TakoAnswerBaseAssem takoAnswerBaseAssem, Function2 function2, List list, View view, int i) {
        if ((i & 2) != 0) {
            list = C1697810uHb.LJIIJJI(0, 0, 0, 0);
        }
        if ((i & 4) != 0) {
            Object objTp = takoAnswerBaseAssem.Tp();
            if (!(objTp instanceof ViewGroup) || (view = (ViewGroup) objTp) == null) {
                view = takoAnswerBaseAssem.LJJIJL();
            }
        }
        takoAnswerBaseAssem.getClass();
        View view2 = (View) function2.invoke(view.getContext(), list);
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).addView(view2);
        }
        return view2;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void e02(View view, List list, AbstractC329610Cw3 abstractC329610Cw3, AwS589S0100000_10 awS589S0100000_10, AwS554S0100000_10 awS554S0100000_10) {
        int i;
        FragmentManager fragmentManagerLIZ = C20230914Dz.LIZ(getContentView(), C724240Sb0.LIZ(this));
        if (fragmentManagerLIZ != null) {
            List listLIZ = C1875207Wc.LIZ(list);
            C1ER1 c1er1 = C1ER1.LIZIZ;
            Map<String, String> mapDq = dq();
            C1860830yWX.LIZ.getClass();
            if (C1860830yWX.LIZ()) {
                i = 2;
            } else {
                i = 0;
            }
            C1390920mIc c1390920mIcLLLJL = c1er1.LLLJL(view, new C434640H2o(listLIZ, mapDq, null, i, C1860830yWX.LIZ(), 4), new AwS201S1100000_27(this, 2), new AwS201S1100000_27(this, 3), abstractC329610Cw3, awS589S0100000_10);
            c1390920mIcLLLJL.LIZ.LLILLJJLI = new DialogInterfaceOnDismissListenerC1864740ycq(this, awS554S0100000_10, 0);
            wq().setState(new AwS36S0010000_24(true, 38));
            c1390920mIcLLLJL.LIZ.show(fragmentManagerLIZ, "reference_sheet");
        }
        nr("click_all_sources", "reply");
    }
}
