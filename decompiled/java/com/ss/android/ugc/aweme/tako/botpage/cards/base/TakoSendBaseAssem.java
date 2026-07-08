package com.ss.android.ugc.aweme.tako.botpage.cards.base;

import X.AbstractC329610Cw3;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C1153090g71;
import X.C13LE;
import X.C13LQ;
import X.C14J2;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1855860yOW;
import X.C1857170yQd;
import X.C1857240yQk;
import X.C1857250yQl;
import X.C1857280yQo;
import X.C1857640yRO;
import X.C1859900yV2;
import X.C1859930yV5;
import X.C1860130yVP;
import X.C1860910yWf;
import X.C1862330yYx;
import X.C19719912Dl;
import X.C20235014Fo;
import X.C20742216Eq;
import X.C2097608Jq;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2248221Cz6;
import X.C326880Cre;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C597050NbL;
import X.C673150Qan;
import X.C687700QyG;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1364105Vn;
import X.InterfaceC1860040yVG;
import X.InterfaceC2217461Bqa;
import X.InterfaceC418250Gad;
import X.InterfaceC434180H0u;
import X.InterfaceC687730QyJ;
import Y.ACListenerS44S0210000_27;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.common.ui.markdown.style.LinkUnderLineSpan;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS110S1200000_27;
import kotlin.jvm.internal.AwS489S0200000_27;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public abstract class TakoSendBaseAssem<T extends C1857170yQd> extends TakoBaseAssem<T> implements TakoCardAbility, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIZZ;
    public static final int LLLJ;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS571S0100000_27((TakoSendBaseAssem) this, 744));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS571S0100000_27((TakoSendBaseAssem) this, 747));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS571S0100000_27((TakoSendBaseAssem) this, 743));
    public final AssemVMLazy LLLFF;
    public final AssemVMLazy LLLFFI;
    public TuxTextView LLLFZ;
    public C1857640yRO LLLI;
    public FrameLayout LLLII;
    public TuxIconView LLLIIII;
    public TuxIconView LLLIIIIL;
    public Pair<Integer, Integer> LLLIIIL;
    public String LLLIIL;
    public String LLLIILIL;
    public C14J2 LLLIL;
    public C20742216Eq LLLILZ;
    public C1857170yQd LLLILZJ;
    public InterfaceC1860040yVG LLLILZLLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoSendBaseAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoSendBaseAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        c09r3.getClass();
        LLLIZZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
    }

    public TakoSendBaseAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoFragmentViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLFF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ, 745), AFwS269S0000000_27.get$arr$(211), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLLFFI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ2, 746), AFwS269S0000000_27.get$arr$(212), null, true);
        this.LLLIILIL = "";
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void DP0(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void Ed0(int i, String str, String str2, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void Ez(CharSequence charSequence, CharSequence charSequence2) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void Gh0() {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void JU1() {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void Kk(View view, List<? extends CharSequence> list, String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void LLILZLL() {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void MI0(Message message, String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void ZA2(InterfaceC418250Gad interfaceC418250Gad, CharSequence charSequence, Map<String, ? extends Object> map) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void Zp1(View view, String str, int i, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void bJ2(CharSequence charSequence, CharSequence charSequence2) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoSendCardScope.class});
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void e02(View view, List list, AbstractC329610Cw3 abstractC329610Cw3, AwS589S0100000_10 awS589S0100000_10, AwS554S0100000_10 awS554S0100000_10) {
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoSendCardScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoSendCardScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void iX0(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void m52(CharSequence charSequence, CharSequence charSequence2) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void mA0(String str, int i, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void mu2(LinkUnderLineSpan linkUnderLineSpan, CharSequence charSequence, Map map) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void n21(CharSequence charSequence) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final InterfaceC434180H0u nO() {
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final int t70() {
        return 0;
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public void yk0(View view, C1860910yWf c1860910yWf) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final View JQ1() {
        TuxIconView tuxIconView = this.LLLIIII;
        if (tuxIconView != null && tuxIconView.getVisibility() == 0) {
            return tuxIconView;
        }
        TuxIconView tuxIconView2 = this.LLLIIIIL;
        if (tuxIconView2 == null || tuxIconView2.getVisibility() != 0) {
            return null;
        }
        return tuxIconView2;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void ME0() {
        C1857170yQd c1857170yQd = this.LLLILZJ;
        if (c1857170yQd == null) {
            return;
        }
        Message message = c1857170yQd.LL.LLILLL;
        String text = c1857170yQd.getText();
        if (text == null) {
            text = "";
        }
        C1857240yQk.LIZ.getClass();
        if (C1857240yQk.LIZ() > 0) {
            int length = text.length();
            C1857250yQl.LIZ.getClass();
            C1153090g71.LIZ.getClass();
            int iLIZIZ = C1153090g71.LIZIZ(450, C1857250yQl.class);
            if (length <= (iLIZIZ > 0 ? iLIZIZ : 450) || Intrinsics.LJFF(message.LJIIJ, Boolean.TRUE)) {
                return;
            }
            Jp(c1857170yQd, true);
        }
    }

    public final Pair<Integer, Integer> Tp() {
        C2248221Cz6 textSelector;
        C1857640yRO c1857640yRO = this.LLLI;
        if (c1857640yRO != null) {
            C2248221Cz6 textSelector2 = c1857640yRO.getTextSelector();
            if (c1857640yRO != null && c1857640yRO.getVisibility() == 0 && (textSelector = c1857640yRO.getTextSelector()) != null && textSelector.LJIILL && textSelector2 != null) {
                CharSequence text = c1857640yRO.getText();
                int length = text != null ? text.length() : 0;
                int i = textSelector2.LJIIJJI;
                int i2 = i >= 0 ? i : 0;
                int i3 = textSelector2.LJIIL;
                if (i3 <= length) {
                    length = i3;
                }
                if (length <= i2) {
                    return null;
                }
                return new Pair<>(Integer.valueOf(i2), Integer.valueOf(length));
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final Message Yy1() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C1857170yQd) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final C326880Cre m50() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C1857170yQd) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int IJ0() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
            int r2 = X.C14KQ.LJIIIIZZ(r0)
            X.16Eq r0 = r3.LLLILZ
            if (r0 == 0) goto L35
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof X.C19ME
            if (r0 == 0) goto L35
            X.19ME r1 = (X.C19ME) r1
            if (r1 == 0) goto L35
            float r0 = r1.guidePercent
        L1a:
            float r2 = (float) r2
            float r0 = r0 * r2
            float r2 = r2 - r0
            X.14J2 r0 = r3.LLLIL
            if (r0 == 0) goto L33
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L33
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginEnd()
        L2f:
            float r0 = (float) r0
            float r2 = r2 - r0
            int r0 = (int) r2
            return r0
        L33:
            r0 = 0
            goto L2f
        L35:
            r0 = 1036831949(0x3dcccccd, float:0.1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem.IJ0():int");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final String bv1() {
        return getClass().getSimpleName();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), TakoCardAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public View iy1() {
        return Y4();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, TakoCardAbility.class, null, null);
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
    public final ViewGroup Y4() {
        return this.LLLIL;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final InterfaceC1860040yVG rA0() {
        return this.LLLILZLLLI;
    }

    public final List<Message> Qp(Message message) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        arrayList.add(message);
        IMessageAbility iMessageAbility = (IMessageAbility) this.LLJZIJLIL.getValue();
        if (iMessageAbility != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Message messageMv2 = iMessageAbility.mv2(((C1857170yQd) obj).LL.LLILLL, AFwS269S0000000_27.get$arr$(209));
            if (messageMv2 != null) {
                arrayList.add(messageMv2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Up, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void up(T r17) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem.up(X.0yQd):void");
    }

    public final void Vp(String str) {
        Map<String, String> mapLJ;
        Object obj;
        C1857640yRO c1857640yRO;
        Pair<Integer, Integer> pairTp;
        CharSequence text;
        ITakoContextAbility iTakoContextAbilityZp = zp();
        if (iTakoContextAbilityZp == null || (mapLJ = iTakoContextAbilityZp.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String str3 = ((C1857170yQd) obj).LL.LLILLL.uuid;
        String str4 = mapLJ.get("screen_type");
        if (str4 == null) {
            str4 = "full_screen";
        }
        if (!(this.LLLILZLLLI instanceof C1860130yVP) && (c1857640yRO = this.LLLI) != null && (pairTp = Tp()) != null && (text = c1857640yRO.getText()) != null) {
            String string = text.subSequence(pairTp.getFirst().intValue(), pairTp.getSecond().intValue()).toString();
            if (!a0.LJJJIL(string)) {
                str2 = string;
            }
        }
        String str5 = mapLJ.get("tako_session_id");
        String str6 = mapLJ.get("tako_chat_id");
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", mapLJ.get("enter_from")), new Pair("enter_method", mapLJ.get("enter_method")), new Pair("message_id", str3), new Pair("process_id", mapLJ.get("process_id")), new Pair("screen_type", str4), new Pair("button_type", str));
        if (str2 != null) {
            mapLJIIJ.put("selected_content", str2);
        }
        if (str5 != null) {
            mapLJIIJ.put("tako_session_id", str5);
        }
        if (str6 != null) {
            mapLJIIJ.put("tako_chat_id", str6);
        }
        c20235014FoLIZ.LIZ("tikbot_collapse_button_click", mapLJIIJ);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void hw(C1860130yVP c1860130yVP) {
        this.LLLILZLLLI = c1860130yVP;
        if (c1860130yVP != null) {
            C1859900yV2.LIZIZ.LJFF(c1860130yVP.getContext(), c1860130yVP, 111, R.attr.a1i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6 A[PHI: r0
      0x00a6: PHI (r0v56 java.lang.Integer) = (r0v22 java.lang.Integer), (r0v60 java.lang.Integer) binds: [B:28:0x00a4, B:26:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem.onViewCreated(android.view.View):void");
    }

    public final void Ip(C1857170yQd c1857170yQd, boolean z) {
        Message message = c1857170yQd.LL.LLILLL;
        C1859930yV5.LIZ(null);
        this.LLLIIIL = null;
        this.LLLIIL = null;
        if (this.LLJZIJLIL.getValue() != null) {
            IMessageAbility iMessageAbility = (IMessageAbility) this.LLJZIJLIL.getValue();
            if (iMessageAbility != null) {
                iMessageAbility.DZ0(message);
                return;
            }
            return;
        }
        boolean z2 = !Intrinsics.LJFF(message.LJIIJ, Boolean.TRUE);
        message.LJIIJ = Boolean.valueOf(z2);
        String text = c1857170yQd.getText();
        if (text == null) {
            text = "";
        }
        Ep(text, z, z2);
        Fp(c1857170yQd, z, z2);
    }

    public final void Jp(C1857170yQd c1857170yQd, boolean z) {
        Message message = c1857170yQd.LL.LLILLL;
        Boolean bool = message.LJIIJ;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            return;
        }
        Pair<Integer, Integer> pairTp = Tp();
        if (pairTp == null) {
            this.LLLIIIL = null;
            this.LLLIIL = null;
        } else {
            this.LLLIIIL = pairTp;
            this.LLLIIL = message.uuid;
        }
        if (this.LLJZIJLIL.getValue() != null) {
            IMessageAbility iMessageAbility = (IMessageAbility) this.LLJZIJLIL.getValue();
            if (iMessageAbility != null) {
                iMessageAbility.DZ0(message);
                return;
            }
            return;
        }
        boolean z2 = !Intrinsics.LJFF(message.LJIIJ, bool2);
        message.LJIIJ = Boolean.valueOf(z2);
        String text = c1857170yQd.getText();
        if (text == null) {
            text = "";
        }
        Ep(text, z, z2);
        Fp(c1857170yQd, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final Object ly2(AwS489S0200000_27 awS489S0200000_27, InterfaceC1364105Vn interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ep(java.lang.String r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem.Ep(java.lang.String, boolean, boolean):void");
    }

    public final void Fp(C1857170yQd c1857170yQd, boolean z, boolean z2) {
        boolean z3;
        int i;
        LinearLayout.LayoutParams layoutParams;
        Context context;
        TuxIconView tuxIconView = this.LLLIIII;
        TuxIconView tuxIconView2 = this.LLLIIIIL;
        if (!z) {
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                C786410Ut5.a9(tuxIconView, null);
            }
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                C786410Ut5.a9(tuxIconView2, null);
                return;
            }
            return;
        }
        C14J2 c14j2 = this.LLLIL;
        if (c14j2 != null && (context = c14j2.getContext()) != null && C426750GoL.LIZLLL(context)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 == C1857280yQo.LIZIZ(c1857170yQd.LL.LLILLL)) {
            i = 8388613;
        } else {
            i = 8388611;
        }
        for (TuxIconView tuxIconView3 : (ArrayList) C13LQ.LJIJI(new TuxIconView[]{tuxIconView, tuxIconView2})) {
            ViewGroup.LayoutParams layoutParams2 = tuxIconView3.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.gravity = i | 80;
                C786410Ut5.M6(tuxIconView3, layoutParams);
            }
            C1855860yOW.LIZ(tuxIconView3, 7, 7, 7, 7);
        }
        if (tuxIconView != null) {
            C2211631BhB.LJ(tuxIconView, new AwS110S1200000_27(tuxIconView, this, "down", 8));
        }
        if (tuxIconView2 != null) {
            C2211631BhB.LJ(tuxIconView2, new AwS110S1200000_27(tuxIconView2, this, "up", 8));
        }
        if (z2) {
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                C786410Ut5.a9(tuxIconView, null);
            }
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                C786410Ut5.a9(tuxIconView2, new ACListenerS44S0210000_27(this, c1857170yQd, z, 0));
                return;
            }
            return;
        }
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            C786410Ut5.a9(tuxIconView2, null);
        }
        if (tuxIconView == null) {
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        C786410Ut5.a9(tuxIconView, new ACListenerS44S0210000_27(this, c1857170yQd, z, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List Gp(android.view.View r15, X.InterfaceC665370Q7z r16, com.ss.android.ugc.aweme.tako.ccl.model.api.Message r17) {
        /*
            r14 = this;
            X.0yR2 r0 = X.C1857420yR2.LIZ
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.0yVG r0 = r14.LLLILZLLLI
            if (r0 == 0) goto L42
            java.lang.String r4 = X.C1859930yV5.LIZLLL(r0)
            if (r4 != 0) goto L13
        L11:
            java.lang.String r4 = ""
        L13:
            r7 = 0
            r11 = 0
            r9 = 48
            r5 = r17
            r6 = r16
            r3 = r15
            r8 = r7
            X.C1857420yR2.LIZIZ(r2, r3, r4, r5, r6, r7, r8, r9)
            X.C1857420yR2.LJI(r2, r5, r6)
            X.0yVG r1 = r14.LLLILZLLLI
            r0 = 0
            X.C1857420yR2.LJIILL(r2, r1, r5, r6, r0)
            r7 = 24
            r8 = r3
            r9 = r6
            r10 = r5
            r12 = r2
            r13 = r11
            X.C1857420yR2.LJIILLIIL(r7, r8, r9, r10, r11, r12, r13)
            android.content.Context r1 = r14.getContext()
            java.util.List r0 = r14.Qp(r5)
            X.C1857420yR2.LIZLLL(r2, r1, r5, r0, r6)
            X.C1857420yR2.LIZJ(r6, r2)
            return r2
        L42:
            X.0Sb3 r0 = r14.LLJI
            if (r0 == 0) goto L59
            java.lang.Object r0 = r0.LL
        L48:
            X.0yQd r0 = (X.C1857170yQd) r0
            X.0Cre r0 = r0.LL
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r0 = r0.LLILLL
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r0 = r0.LJIIIZ()
            if (r0 == 0) goto L11
            java.lang.String r4 = r0.text
            if (r4 != 0) goto L13
            goto L11
        L59:
            r0 = 0
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem.Gp(android.view.View, X.0Q7z, com.ss.android.ugc.aweme.tako.ccl.model.api.Message):java.util.List");
    }
}
