package com.ss.android.ugc.aweme.shortvideo.image.airewrite;

import X.AnonymousClass1971;
import X.C01GW;
import X.C036E;
import X.C09JN;
import X.C0CHQ;
import X.C0CHX;
import X.C0WZX;
import X.C0ZI0;
import X.C0ZIX;
import X.C1156050gBn;
import X.C1156370gCJ;
import X.C11NJ;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1406040mh0;
import X.C1411700mq8;
import X.C1411740mqC;
import X.C1428310nGv;
import X.C1428470nHB;
import X.C1437510nVl;
import X.C1454340nwu;
import X.C1659630tI1;
import X.C1697810uHb;
import X.C197039127h;
import X.C197G;
import X.C197H;
import X.C197K;
import X.C197M;
import X.C197O;
import X.C19LQ;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C273110An7;
import X.C278910AwT;
import X.C286600BLe;
import X.C337180DJs;
import X.C356901a3;
import X.C452501pT;
import X.C786410Ut5;
import X.C844470XAv;
import X.C856610Xj1;
import X.EnumC1411090mp9;
import X.EnumC1779820wPs;
import X.InterfaceC1406060mh2;
import X.InterfaceC1428190nGj;
import X.InterfaceC420801kM;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS149S0100000_14;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS17S0301000_32;
import Y.AfS183S0100000_14;
import android.text.Editable;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.method.KeyListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.AIRewriteModel;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.CachePoweredTexts;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.PoweredTextItem;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.RequestContent;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandTextViewModel;
import com.ss.android.ugc.aweme.shortvideo.image.airewrite.AIRewriteModule;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescRequestBody;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS138S0101000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes33.dex */
public final class AIRewriteModule implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final int LLLILZJ = ((Number) C286600BLe.LIZ.getValue()).intValue();
    public final Scene LL;
    public VideoPublishEditModel LLILLJJLI;
    public final ViewGroup LLILLL;
    public final View LLILZ;
    public final InterfaceC1428190nGj LLILZIL;
    public final EditText LLILZLL;
    public final C0ZI0 LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxTextView LLJ;
    public final TuxTextView LLJI;
    public final TuxTextView LLJIJIL;
    public final View LLJILJIL;
    public final C197039127h LLJILJILJ;
    public final View LLJILLL;
    public final View LLJJ;
    public final ViewGroup LLJJI;
    public final TuxTextView LLJJIII;
    public final TuxTextView LLJJIJI;
    public final ViewGroup LLJJIJIIJIL;
    public final TuxTextView LLJJIJIL;
    public final ViewGroup LLJJJ;
    public final C197039127h LLJJJIL;
    public Function0<Boolean> LLJJJJ;
    public final C197039127h LLJJJJJIL;
    public final ViewGroup LLJJJJLIIL;
    public final C197039127h LLJJL;
    public final C197039127h LLJJLIIIJLLLLLLLZ;
    public final C197039127h LLJL;
    public C197H LLJLIL;
    public C1156050gBn LLJLILLLLZIIL;
    public String LLJLL;
    public String LLJLLIL;
    public String LLJLLL;
    public EnumC1779820wPs LLJZ;
    public C1156370gCJ LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public final C01GW LLLFZ;
    public boolean LLLI;
    public final AIRewriteModel LLLII;
    public final Map<Integer, CachePoweredTexts> LLLIIII;
    public final String LLLIIIIL;
    public final KeyListener LLLIIIL;
    public final KeyListener LLLIIL;
    public final C197G LLLIILIL;
    public AwS576S0100000_32 LLLIL;
    public Function0<Unit> LLLILZ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void LIZJ() {
        C1454340nwu.LIZ("AIRewriteModule", "cancelGenerate");
        C197G c197g = this.LLLIILIL;
        if (c197g != null) {
            c197g.LJ = true;
            c197g.LIZJ.o();
            c197g.LJFF = false;
            c197g.LJI = false;
            c197g.LIZJ.Tq(false, false);
            c197g.LIZJ.LIZLLL(c197g.LIZLLL);
            return;
        }
        this.LLLF = true;
        LJIIIZ().LJ.LJ();
        LJJIFFI(false);
        LJJII(false);
        LJJIII(false, false);
        C197G c197g2 = this.LLLIILIL;
        LJIL(c197g2 != null ? c197g2.LIZLLL : this.LLL);
    }

    public final void LJII() {
        this.LLILZIL.LIZ();
    }

    public final C1411700mq8 LJIIIZ() {
        return (C1411700mq8) this.LLLFZ.getValue();
    }

    public final CharSequence LJIIJ() throws Throwable {
        Editable editableP = C2204961BRm.p(this.LLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhlc/EjolTCPPq0r++7J3Rw/lmTjByyRYeqwbBw4LCZA==", null));
        return editableP instanceof Spanned ? new SpannedString(editableP) : "";
    }

    public final C197H LJIIJJI() {
        C197G c197g = this.LLLIILIL;
        if (c197g != null) {
            C197O c197o = C197H.Companion;
            int i = c197g.LJIIIIZZ;
            c197o.getClass();
            for (C197H c197h : C197H.values()) {
                if (c197h.getCode() == i) {
                    return c197h;
                }
            }
            C197H c197h2 = C197H.ENHANCE;
            if (c197h2 != null) {
                return c197h2;
            }
        }
        return this.LLJLIL;
    }

    public final int LJIIL() {
        return String.valueOf(C2204961BRm.p(this.LLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhlc/EjolTCPPq0r++7J3Rw/lmTjByyRYeqwbBw4LCZA==", null))).length();
    }

    public final String LJIILIIL() {
        return C2204961BRm.LLJILLL(this.LLILZLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhlc/EjolTCPPq0r++7J3Rw/lmTjByyRYeqwbBw4LCZA==", null)).toString();
    }

    public final void LJIILJJIL() {
        C337180DJs.LIZ(this.LLJJJ);
        C337180DJs.LIZ(this.LLJJJJLIIL);
        C337180DJs.LIZ(this.LLJJI);
        C337180DJs.LIZ(this.LLJJIJIIJIL);
    }

    public final boolean LJIILL() {
        return this.LLJJJ.getVisibility() == 0 || this.LLJJJJLIIL.getVisibility() == 0 || this.LLJJIJIIJIL.getVisibility() == 0;
    }

    public final void LJIIZILJ() {
        C1454340nwu.LIZ("AIRewriteModule", "onGenerateError");
        LJJIII(false, false);
        LJIILJJIL();
        C337180DJs.LIZJ(this.LLJJIJIIJIL);
        LJIJJ(true);
    }

    public final void LJIJJLI() {
        Function0<Boolean> function0;
        C197039127h c197039127h = this.LLJJJIL;
        int i = 0;
        if (this.LLLII.lastAIRewriteRequestContent == null && ((function0 = this.LLJJJJ) == null || !function0.invoke().booleanValue())) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, c197039127h);
    }

    public final void LJJ() {
        AIRewriteModel aIRewriteModel = this.LLLII;
        aIRewriteModel.isCurUsedAIRewrite = false;
        RequestContent requestContent = aIRewriteModel.lastAIRewriteRequestContent;
        if (requestContent != null) {
            this.LLILZLL.setText(requestContent.title);
            LJJI(this, requestContent.descWithSpan);
        }
        if (C0CHX.LIZIZ(this.LLILLJJLI) == 2) {
            C337180DJs.LIZ(this.LLJJJ);
            C337180DJs.LIZJ(this.LLJJJJLIIL);
        } else {
            LJ(false);
            LJIILJJIL();
        }
        LJIJJ(true);
    }

    public final void LIZLLL() {
        LJIIIZ().LJ.LJ();
        LJIILJJIL();
        LJ(false);
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        this.LLLIIII.remove(Integer.valueOf(C197H.RANGE_REWRITE.getCode()));
        this.LLJZ = EnumC1779820wPs.LL;
    }

    public final void LJ(boolean z) {
        this.LLILZIL.LLI(z);
        if (z) {
            this.LLJILJILJ.setButtonStartIcon(Integer.valueOf(R.raw.icon_pen_star_fill));
        } else {
            this.LLJILJILJ.setButtonStartIcon(Integer.valueOf(R.raw.icon_pen_star));
        }
    }

    public final void LJIIIIZZ(C1156050gBn c1156050gBn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fireRangeRewriteRequest dual len=");
        sbLIZ.append(c1156050gBn.LIZ.length());
        C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ));
        Map<Integer, CachePoweredTexts> map = this.LLLIIII;
        C197H c197h = C197H.RANGE_REWRITE;
        map.remove(Integer.valueOf(c197h.getCode()));
        LJJIFFI(true);
        LJJII(true);
        C1411700mq8 c1411700mq8LJIIIZ = LJIIIZ();
        String str = c1156050gBn.LIZ;
        AwS398S0200000_32 awS398S0200000_32 = new AwS398S0200000_32(this, c1156050gBn, 26);
        AwS398S0200000_32 awS398S0200000_322 = new AwS398S0200000_32(this, c1156050gBn, 27);
        AwS398S0200000_32 awS398S0200000_323 = new AwS398S0200000_32(this, c1156050gBn, 28);
        AwS398S0200000_32 awS398S0200000_324 = new AwS398S0200000_32(this, c1156050gBn, 29);
        c1411700mq8LJIIIZ.getClass();
        int code = c197h.getCode();
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("start request ai_tip requestRangeRewrite (dual, prompt_type=");
        sbLIZ2.append(code);
        sbLIZ2.append(", len=");
        sbLIZ2.append(str.length());
        sbLIZ2.append(')');
        c1437510nVlLJJLIIIJ.LIZ("ai_tip", C2188811AlT.LIZIZ(sbLIZ2));
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                c1411700mq8LJIIIZ.LJ.LJ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("{\"prompt_type\":");
                sbLIZ3.append(code);
                sbLIZ3.append('}');
                RecommendDescRequestBody recommendDescRequestBody = new RecommendDescRequestBody("", str, "", C2188811AlT.LIZIZ(sbLIZ3), "", true);
                List<InterfaceC420801kM> listLIZ = C1411740mqC.LIZ(c1411700mq8LJIIIZ.LIZ, recommendDescRequestBody, RecommendDescRequestBody.LIZ(recommendDescRequestBody), 30000L, 0L, code, true, awS398S0200000_323, awS398S0200000_324, awS398S0200000_32, awS398S0200000_322);
                C11NJ c11nj = c1411700mq8LJIIIZ.LJ;
                InterfaceC420801kM[] interfaceC420801kMArr = (InterfaceC420801kM[]) ((ArrayList) listLIZ).toArray(new InterfaceC420801kM[0]);
                c11nj.LIZLLL((InterfaceC420801kM[]) Arrays.copyOf(interfaceC420801kMArr, interfaceC420801kMArr.length));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        EnumC1411090mp9 enumC1411090mp9 = EnumC1411090mp9.NETWORK_ERROR;
        awS398S0200000_322.invoke(enumC1411090mp9);
        awS398S0200000_324.invoke(enumC1411090mp9);
    }

    public final void LJIILLIIL(C1156050gBn c1156050gBn) {
        boolean z;
        boolean z2;
        C197G c197g = this.LLLIILIL;
        if (c197g != null) {
            z = c197g.LJFF;
        } else {
            z = this.LLLFF;
        }
        if (!z) {
            if (c197g != null) {
                z2 = c197g.LJI;
            } else {
                z2 = this.LLLFFI;
            }
            if (z2 || this.LLJJI.getVisibility() != 0 || LJI(c1156050gBn, false)) {
                return;
            }
            LJIIZILJ();
            c1156050gBn.LIZJ.invoke();
        }
    }

    public final void LJIJJ(boolean z) {
        if (z && this.LLILZIL.LLD() != 1) {
            this.LLILZIL.LLF();
        }
    }

    public final void LJIL(boolean z) {
        if (z) {
            C337180DJs.LIZJ(this.LLJJJ);
            LJIJJLI();
        } else if (C0CHX.LIZIZ(this.LLILLJJLI) == 2) {
            C337180DJs.LIZJ(this.LLJJJJLIIL);
        } else {
            LJ(false);
            LJIILJJIL();
        }
        LJIJJ(true);
    }

    public final void LJJIFFI(boolean z) {
        C197G c197g = this.LLLIILIL;
        if (c197g != null) {
            c197g.LJFF = z;
        } else {
            this.LLLFF = z;
        }
    }

    public final void LJJII(boolean z) {
        C197G c197g = this.LLLIILIL;
        if (c197g != null) {
            c197g.LJI = z;
        } else {
            this.LLLFFI = z;
        }
    }

    public final void LJJIIZ(int i) {
        boolean z;
        float f;
        if (i >= LLLILZJ) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAIRewriteBtn ");
        sbLIZ.append(z);
        C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        if (f == this.LLJILJILJ.getAlpha()) {
            return;
        }
        C786410Ut5.w5(this.LLJILJILJ, f);
        if (!z) {
            LJIILJJIL();
            LJIJJ(true);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy: owner=");
        sbLIZ.append(C13LE.LIZ(lifecycleOwner.getClass()).LJI());
        C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPause: owner=");
        sbLIZ.append(C13LE.LIZ(lifecycleOwner.getClass()).LJI());
        C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume: owner=");
        sbLIZ.append(C13LE.LIZ(lifecycleOwner.getClass()).LJI());
        C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ));
        C197G c197g = this.LLLIILIL;
        if (c197g != null) {
            if (c197g.LJII) {
                c197g.LJII = false;
                c197g.LIZJ.Tq(true, true);
                if (!c197g.LIZIZ(c197g.LJIIIIZZ, true, false)) {
                    c197g.LIZJ.LIZ();
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLLI) {
            this.LLLI = false;
            LJJIII(true, true);
            if (!LJFF(LJIIJJI().getCode(), true, false)) {
                LJIIZILJ();
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStop: owner=");
        sbLIZ.append(C13LE.LIZ(lifecycleOwner.getClass()).LJI());
        C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJJI(AIRewriteModule aIRewriteModule, CharSequence charSequence) {
        aIRewriteModule.LLIZ.LLLLIL = true;
        try {
            String str = aIRewriteModule.LLLIIIIL;
            if (str != null && str.length() != 0) {
                int length = str.length();
                if (length < 0) {
                    length = 0;
                }
                CharSequence charSequenceSubSequence = "";
                if (charSequence == null) {
                    charSequence = "";
                }
                Editable editableO = C2204961BRm.o(aIRewriteModule.LLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhlc/EjolTCPPq0r++7J3Rw/lmTjByyRYeqwbBw4LCZA==", null));
                if (editableO == null) {
                    aIRewriteModule.LLIZ.setText("");
                    editableO = C2204961BRm.o(aIRewriteModule.LLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhlc/EjolTCPPq0r++7J3Rw/lmTjByyRYeqwbBw4LCZA==", null));
                }
                if (charSequence.length() > length) {
                    charSequenceSubSequence = charSequence.subSequence(length, charSequence.length());
                }
                if (editableO.length() < length) {
                    editableO.append((CharSequence) u.LJJ(length - editableO.length(), " "));
                }
                editableO.replace(length, editableO.length(), charSequenceSubSequence);
            } else {
                aIRewriteModule.LLIZ.setText(charSequence);
            }
            aIRewriteModule.LLIZ.LLLLIL = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            aIRewriteModule.LLIZ.LLLLIL = false;
            throw th;
        }
    }

    public final void LIZ(int i, List<PoweredTextItem> list) {
        C1454340nwu.LIZ("AIRewriteModule", "appendToCache");
        if (list.isEmpty()) {
            return;
        }
        Map<Integer, CachePoweredTexts> map = this.LLLIIII;
        Integer numValueOf = Integer.valueOf(i);
        CachePoweredTexts cachePoweredTexts = map.get(numValueOf);
        if (cachePoweredTexts == null) {
            cachePoweredTexts = new CachePoweredTexts(0);
            map.put(numValueOf, cachePoweredTexts);
        }
        cachePoweredTexts.poweredTextList.addAll(list);
        if (this.LL.mViewDestroyed) {
            C1406040mh0.LIZ(new LinkedHashMap(this.LLLIIII));
        }
    }

    public final void LIZIZ(C1156050gBn c1156050gBn, String str) {
        LJJIII(false, false);
        LJIILJJIL();
        C337180DJs.LIZJ(this.LLJJJ);
        LJIJJLI();
        LJIJJ(true);
        this.LLLII.isCurUsedAIRewrite = true;
        c1156050gBn.LIZIZ.invoke(str);
        this.LLJLL = String.valueOf(LJIIJ());
    }

    public final boolean LJI(final C1156050gBn c1156050gBn, boolean z) {
        final CachePoweredTexts cachePoweredTexts;
        final String str;
        if (this.LLJJI.getVisibility() != 0 || (cachePoweredTexts = this.LLLIIII.get(Integer.valueOf(C197H.RANGE_REWRITE.getCode()))) == null) {
            return false;
        }
        List<PoweredTextItem> list = cachePoweredTexts.poweredTextList;
        if (list.isEmpty()) {
            return false;
        }
        if (cachePoweredTexts.currentIndex == list.size() && list.size() == 1) {
            return false;
        }
        final int size = cachePoweredTexts.currentIndex % list.size();
        PoweredTextItem poweredTextItem = (PoweredTextItem) C13LP.LJJJLZIJ(size, list);
        if (poweredTextItem == null || (str = poweredTextItem.text) == null || str.length() == 0) {
            return false;
        }
        if (z) {
            C197G c197g = this.LLLIILIL;
            if (c197g != null) {
                c197g.LJ = false;
            } else {
                this.LLLF = false;
            }
            View view = this.LL.mView;
            if (view != null) {
                HandlerHook.viewPostDelay(view, new Runnable() { // from class: X.197I
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AIRewriteModule@ac9e.consumeOneRangeFromCacheIfLoading$1");
                        try {
                            AIRewriteModule aIRewriteModule = this.LL;
                            C197G c197g2 = aIRewriteModule.LLLIILIL;
                            if (!(c197g2 != null ? c197g2.LJ : aIRewriteModule.LLLF)) {
                                cachePoweredTexts.currentIndex = size + 1;
                                aIRewriteModule.LIZIZ(c1156050gBn, str);
                            }
                            AIRewriteModule aIRewriteModule2 = this.LL;
                            C197G c197g3 = aIRewriteModule2.LLLIILIL;
                            if (c197g3 != null) {
                                c197g3.LJ = false;
                            } else {
                                aIRewriteModule2.LLLF = false;
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AIRewriteModule@ac9e.consumeOneRangeFromCacheIfLoading$1");
                    }
                }, 700L);
            }
            return true;
        }
        cachePoweredTexts.currentIndex = size + 1;
        LIZIZ(c1156050gBn, str);
        return true;
    }

    public final void LJIJ(C1156050gBn c1156050gBn, boolean z) {
        if (z) {
            LJJIFFI(false);
        } else {
            LJJII(false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RANGE leg error (degrade=");
        sbLIZ.append(z);
        sbLIZ.append(')');
        C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ));
        LJIILLIIL(c1156050gBn);
    }

    public final void LJJIII(boolean z, boolean z2) {
        boolean z3;
        float f;
        float f2;
        this.LLLII.isAIRewriteLoading = z;
        this.LLILZIL.LLFZ(z);
        if (this.LLJJI.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 == z) {
            return;
        }
        if (z) {
            LJIILJJIL();
        }
        C1428310nGv.LJIIIIZZ(this.LLJJI, z);
        float f3 = 1.0f;
        if (z) {
            f = 0.4f;
        } else {
            f = 1.0f;
        }
        boolean z4 = !z;
        for (View view : C1697810uHb.LJIIJJI(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL)) {
            if (view != null) {
                C786410Ut5.T4(view, f);
            }
        }
        EditText editText = this.LLILZLL;
        if (z4) {
            f2 = 1.0f;
        } else {
            f2 = 0.15f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(editText);
        editText.setAlpha(f2);
        C0ZI0 c0zi0 = this.LLIZ;
        if (!z4) {
            f3 = 0.15f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0zi0);
        c0zi0.setAlpha(f3);
        if (z4) {
            this.LLILZLL.setKeyListener(this.LLLIIL);
            this.LLIZ.setKeyListener(this.LLLIIIL);
        } else {
            this.LLILZLL.setKeyListener(null);
            this.LLIZ.setKeyListener(null);
        }
        C1428310nGv.LJIIIIZZ(this.LLJILLL, z);
        LJIJJ(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(X.C197H r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.image.airewrite.AIRewriteModule.LJJIIJ(X.197H, boolean):void");
    }

    public final void LJJIIZI(PoweredTextItem poweredTextItem, boolean z) throws Throwable {
        Function0<Unit> function0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGenerateTextToView ");
        sbLIZ.append(poweredTextItem);
        C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ));
        C197G c197g = this.LLLIILIL;
        if (c197g != null) {
            c197g.LJII = false;
        } else {
            this.LLLI = false;
        }
        if (Intrinsics.LJFF(this.LLJLLL, "click_button") && (function0 = this.LLLILZ) != null) {
            function0.invoke();
        }
        if (!z) {
            AIRewriteModel aIRewriteModel = this.LLLII;
            if (aIRewriteModel.isCurUsedAIRewrite) {
                aIRewriteModel.isLastUsedAIRewrite = true;
            }
        }
        this.LLLII.isCurUsedAIRewrite = true;
        LJJIII(false, false);
        LJIILJJIL();
        C337180DJs.LIZJ(this.LLJJJ);
        LJIJJLI();
        String str = poweredTextItem.title;
        if (str != null) {
            this.LLILZLL.setText(str);
        }
        String str2 = poweredTextItem.text;
        if (str2 != null) {
            LJJI(this, C0ZIX.LIZIZ(str2, C1308910kAL.LIZJ(R.attr.a1h, this.LLIZ.getContext()), C0ZIX.LIZ, new AwS576S0100000_32(this, 334)));
        }
        String strLJIILIIL = LJIILIIL();
        String strValueOf = String.valueOf(LJIIJ());
        List<TextExtraStruct> listLJJIJIL = this.LLIZ.LJJIJIL(null, false);
        if (listLJJIJIL == null) {
            listLJJIJIL = C13BV.INSTANCE;
        }
        this.LLJZIJLIL = new C1156370gCJ(strLJIILIIL, strValueOf, listLJJIJIL);
    }

    public final boolean LJFF(int i, boolean z, boolean z2) {
        boolean z3;
        C1454340nwu.LIZ("AIRewriteModule", "consumeOneFromCacheIfLoading");
        if (this.LLJJI.getVisibility() != 0) {
            return false;
        }
        CachePoweredTexts cachePoweredTexts = this.LLLIIII.get(Integer.valueOf(i));
        if (cachePoweredTexts == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("no cache for type=");
            sbLIZ.append(i);
            C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        List<PoweredTextItem> list = cachePoweredTexts.poweredTextList;
        if (list.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("empty list for type=");
            sbLIZ2.append(i);
            C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        if (z2 && !this.LL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("not resumed for type=");
            sbLIZ3.append(i);
            C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ3));
            C197G c197g = this.LLLIILIL;
            if (c197g != null) {
                c197g.LJII = true;
                return false;
            }
            this.LLLI = true;
            return false;
        }
        if (cachePoweredTexts.currentIndex == list.size() && list.size() == 1) {
            return false;
        }
        int size = cachePoweredTexts.currentIndex % list.size();
        PoweredTextItem poweredTextItem = (PoweredTextItem) C13LP.LJJJLZIJ(size, list);
        if (poweredTextItem == null) {
            return false;
        }
        if (z) {
            C197G c197g2 = this.LLLIILIL;
            if (c197g2 != null) {
                c197g2.LJ = false;
            } else {
                this.LLLF = false;
            }
            View view = this.LL.mView;
            if (view != null) {
                HandlerHook.viewPostDelay(view, new ARunnableS17S0301000_32(this, cachePoweredTexts, size, poweredTextItem, 0), 700L);
            }
        } else {
            cachePoweredTexts.currentIndex = size + 1;
            C197G c197g3 = this.LLLIILIL;
            if (c197g3 != null) {
                z3 = c197g3.LIZLLL;
            } else {
                z3 = this.LLL;
            }
            LJJIIZI(poweredTextItem, z3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("index:");
        sbLIZ4.append(size);
        sbLIZ4.append(" delay:");
        sbLIZ4.append(z);
        sbLIZ4.append(' ');
        sbLIZ4.append(poweredTextItem);
        sbLIZ4.append(' ');
        C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ4));
        return true;
    }

    public final void LJIJI(C1156050gBn c1156050gBn, List<PoweredTextItem> list, boolean z) {
        if (z) {
            LJJIFFI(false);
        } else {
            LJJII(false);
        }
        if (!list.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RANGE leg success (degrade=");
            sbLIZ.append(z);
            sbLIZ.append("), candidates=");
            sbLIZ.append(list.size());
            C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ));
            Map<Integer, CachePoweredTexts> map = this.LLLIIII;
            Integer numValueOf = Integer.valueOf(C197H.RANGE_REWRITE.getCode());
            CachePoweredTexts cachePoweredTexts = map.get(numValueOf);
            if (cachePoweredTexts == null) {
                cachePoweredTexts = new CachePoweredTexts(0);
                map.put(numValueOf, cachePoweredTexts);
            }
            cachePoweredTexts.poweredTextList.addAll(list);
            LJI(c1156050gBn, false);
            return;
        }
        LJIILLIIL(c1156050gBn);
    }

    public AIRewriteModule(Scene scene, VideoPublishEditModel videoPublishEditModel, ViewGroup viewGroup, View view, AnonymousClass1971 anonymousClass1971) {
        boolean z;
        C197G c197g;
        int iIntValue;
        ExpandTextViewModel expandTextViewModel;
        this.LL = scene;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = viewGroup;
        this.LLILZ = view;
        this.LLILZIL = anonymousClass1971;
        EditText editText = (EditText) viewGroup.findViewById(R.id.guj);
        this.LLILZLL = editText;
        C0ZI0 c0zi0 = (C0ZI0) viewGroup.findViewById(R.id.guf);
        this.LLIZ = c0zi0;
        viewGroup.findViewById(R.id.fmr);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.b_6);
        this.LLJ = (TuxTextView) view.findViewById(R.id.b_5);
        this.LLJI = (TuxTextView) view.findViewById(R.id.afg);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.fnd);
        this.LLJILJIL = view.findViewById(R.id.voice_input_icon);
        this.LLJILJILJ = (C197039127h) view.findViewById(R.id.ar1);
        this.LLJILLL = view.findViewById(R.id.gsc);
        this.LLJJ = view.findViewById(R.id.adg);
        this.LLJJI = (ViewGroup) view.findViewById(R.id.ar6);
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.ar5);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.ar2);
        this.LLJJIJIIJIL = (ViewGroup) view.findViewById(R.id.ar4);
        this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.ar_);
        this.LLJJJ = (ViewGroup) view.findViewById(R.id.ar9);
        this.LLJJJIL = (C197039127h) view.findViewById(R.id.ar7);
        this.LLJJJJJIL = (C197039127h) view.findViewById(R.id.ar8);
        this.LLJJJJLIIL = (ViewGroup) view.findViewById(R.id.arc);
        this.LLJJL = (C197039127h) view.findViewById(R.id.ar3);
        this.LLJJLIIIJLLLLLLLZ = (C197039127h) view.findViewById(R.id.arb);
        this.LLJL = (C197039127h) view.findViewById(R.id.ara);
        this.LLJLIL = C197H.ENHANCE;
        this.LLJLLL = "click_button";
        this.LLJZ = EnumC1779820wPs.LL;
        this.LLLFZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 505));
        AIRewriteModel aIRewriteModel = this.LLILLJJLI.creativeModel.imagePublishBackSaveModel.aiRewriteModel;
        this.LLLII = aIRewriteModel;
        Map<Integer, CachePoweredTexts> map = aIRewriteModel.lastGenerateAIRewriting;
        this.LLLIIII = map;
        this.LLLIIIL = c0zi0.getKeyListener();
        this.LLLIIL = editText.getKeyListener();
        VideoPublishEditModel videoPublishEditModel2 = this.LLILLJJLI;
        if (C0CHQ.LIZ().getAccountService().isLogin() && videoPublishEditModel2.creativeModel.editPostModel == null && C1428470nHB.LJJZZI(videoPublishEditModel2) && ((Number) C278910AwT.LIZ.getValue()).intValue() >= 1 && ((Boolean) C273110An7.LIZ.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c197g = new C197G(new C197M() { // from class: X.197J
                @Override // X.C197M
                public final void clear() {
                    this.LIZ.LLLIIII.clear();
                }

                @Override // X.C197M
                public final Map<Integer, CachePoweredTexts> snapshot() {
                    return new LinkedHashMap(this.LIZ.LLLIIII);
                }

                @Override // X.C197M
                public final CachePoweredTexts LIZ(int i) {
                    Map<Integer, CachePoweredTexts> map2 = this.LIZ.LLLIIII;
                    Integer numValueOf = Integer.valueOf(i);
                    CachePoweredTexts cachePoweredTexts = map2.get(numValueOf);
                    if (cachePoweredTexts == null) {
                        cachePoweredTexts = new CachePoweredTexts(0);
                        map2.put(numValueOf, cachePoweredTexts);
                    }
                    return cachePoweredTexts;
                }

                @Override // X.C197M
                public final CachePoweredTexts get(int i) {
                    return this.LIZ.LLLIIII.get(Integer.valueOf(i));
                }
            }, new InterfaceC1406060mh2() { // from class: X.0mh1
                @Override // X.InterfaceC1406060mh2
                public final void LIZ(Map<Integer, CachePoweredTexts> map2) {
                    C1406040mh0.LIZ(map2);
                }
            }, new C197K() { // from class: X.197F
                @Override // X.C197K
                public final void LIZ() {
                    this.LIZ.LJIIZILJ();
                }

                @Override // X.C197K
                public final boolean LJFF() {
                    return this.LIZ.LLJJI.getVisibility() == 0;
                }

                @Override // X.C197K
                public final boolean LJI() {
                    return this.LIZ.LL.mViewDestroyed;
                }

                @Override // X.C197K
                public final boolean isResumed() {
                    return this.LIZ.LL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
                }

                @Override // X.C197K
                public final void o() {
                    this.LIZ.LJIIIZ().LJ.LJ();
                }

                @Override // X.C197K
                public final void LIZIZ(int i) {
                    AIRewriteModule aIRewriteModule = this.LIZ;
                    aIRewriteModule.LJIIIZ().LJ(aIRewriteModule.LJIILIIL(), aIRewriteModule.LJIIJ(), i, new AwS138S0101000_32(i, aIRewriteModule, 6), new AwS611S0100000_32(i, aIRewriteModule, 278), new AwS138S0101000_32(i, aIRewriteModule, 7), new AwS611S0100000_32(i, aIRewriteModule, 279));
                }

                @Override // X.C197K
                public final void LIZLLL(boolean z2) {
                    this.LIZ.LJIL(z2);
                }

                @Override // X.C197K
                public final boolean LJ(boolean z2) throws Throwable {
                    String str;
                    String str2;
                    AIRewriteModule aIRewriteModule = this.LIZ;
                    String strLJIILIIL = aIRewriteModule.LJIILIIL();
                    CharSequence charSequenceLJIIJ = aIRewriteModule.LJIIJ();
                    if (z2) {
                        if (!aIRewriteModule.LJIIIZ().LIZJ()) {
                            C1156370gCJ c1156370gCJ = aIRewriteModule.LLJZIJLIL;
                            String str3 = "";
                            if (c1156370gCJ == null || (str = c1156370gCJ.LIZ) == null) {
                                str = "";
                            }
                            if (Intrinsics.LJFF(strLJIILIIL, str)) {
                                String strValueOf = String.valueOf(charSequenceLJIIJ);
                                C1156370gCJ c1156370gCJ2 = aIRewriteModule.LLJZIJLIL;
                                if (c1156370gCJ2 != null && (str2 = c1156370gCJ2.LIZIZ) != null) {
                                    str3 = str2;
                                }
                                if (Intrinsics.LJFF(strValueOf, str3)) {
                                    return false;
                                }
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return aIRewriteModule.LJIIIZ().LIZLLL(strLJIILIIL, String.valueOf(charSequenceLJIIJ));
                }

                @Override // X.C197K
                public final void LJII(C197L c197l) {
                    View view2 = this.LIZ.LL.mView;
                    if (view2 != null) {
                        HandlerHook.viewPostDelay(view2, new ARunnableS104S0100000_4((Object) c197l, 46), 700L);
                    }
                }

                @Override // X.C197K
                public final void LIZJ(PoweredTextItem poweredTextItem, boolean z2) throws Throwable {
                    this.LIZ.LJJIIZI(poweredTextItem, z2);
                }

                @Override // X.C197K
                public final void Tq(boolean z2, boolean z3) {
                    this.LIZ.LJJIII(z2, z3);
                }
            });
        } else {
            c197g = null;
        }
        this.LLLIILIL = c197g;
        if (!scene.mViewDestroyed && (expandTextViewModel = (ExpandTextViewModel) C1659630tI1.LJIIIIZZ(scene, null, null, 6).get(ExpandTextViewModel.class)) != null) {
            expandTextViewModel.LL.LJJJZ(VideoPublishEditModel.class).LJJLL(new AfS183S0100000_14(this, 5), new C09JN() { // from class: X.0ZIb
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AIRewriteModule@ac9e.initObserve$2");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("initObserve error");
                    sbLIZ.append(obj);
                    C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AIRewriteModule initObserve error");
                    sbLIZ2.append(obj);
                    C1454340nwu.LIZ("AIRewriteModule", C2188811AlT.LIZIZ(sbLIZ2));
                    C1C7U.LIZIZ("AIRewriteModule@ac9e.initObserve$2");
                }
            });
        }
        scene.getLifecycle().addObserver(this);
        boolean z2 = aIRewriteModel.isAIRewriteLoading;
        if (c197g != null) {
            c197g.LJII = z2;
        } else {
            this.LLLI = z2;
        }
        if (Intrinsics.LJFF(C1406040mh0.LIZ, aIRewriteModel.lastAIRewriteRequestContent)) {
            C1454340nwu.LIZ("AIRewrite", "Request matched. Writing back snapshot to poweredCacheByType (keep currentIndex).");
            Map<Integer, ? extends List<PoweredTextItem>> map2 = C1406040mh0.LIZIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(entry.getKey(), Integer.valueOf(((CachePoweredTexts) entry.getValue()).currentIndex));
            }
            map.clear();
            for (Map.Entry<Integer, ? extends List<PoweredTextItem>> entry2 : map2.entrySet()) {
                int iIntValue2 = entry2.getKey().intValue();
                List<PoweredTextItem> value = entry2.getValue();
                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(iIntValue2));
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                map.put(Integer.valueOf(iIntValue2), new CachePoweredTexts(iIntValue, new ArrayList(value)));
            }
            C1454340nwu.LIZ("AIRewriteRequestHelper", "writeBackOverwriteKeepIndex done. keys=" + map2.keySet());
        }
        this.LLJILJILJ.setSupportClickWhenDisable(true);
        Iterator it3 = C1697810uHb.LJIIJJI(this.LLJJJIL, this.LLJJJJJIL, this.LLJJL, this.LLJJLIIIJLLLLLLLZ, this.LLJL).iterator();
        while (it3.hasNext()) {
            ((TuxTextView) it3.next()).setTuxFont(51);
        }
        C786410Ut5.h9(this.LLJJIJI, new ACListenerS149S0100000_14(this, 56));
        C786410Ut5.I7(new C19LQ(this, 5), this.LLJJJIL);
        C786410Ut5.I7(new C19LQ(this, 6), this.LLJJJJJIL);
        C786410Ut5.I7(new C19LQ(this, 7), this.LLJJL);
        C786410Ut5.I7(new C19LQ(this, 8), this.LLJJLIIIJLLLLLLLZ);
        C786410Ut5.I7(new C19LQ(this, 2), this.LLJL);
        C786410Ut5.I7(new C19LQ(this, 3), this.LLJJIJIL);
        C786410Ut5.I7(new C19LQ(this, 4), this.LLJILLL);
        this.LLJJJIL.setText(2131821484);
        this.LLJJJJJIL.setText(2131821486);
        this.LLJJL.setText(2131821470);
        this.LLJJLIIIJLLLLLLLZ.setText(2131821491);
        this.LLJL.setText(2131821489);
        this.LLJJIII.setText(2131820555);
        this.LLJJIJI.setText(2131821462);
        this.LLLIIIIL = this.LLILLJJLI.getChain();
        C0CHQ.LIZ().getPublishService().LJIIJJI();
        if (C856610Xj1.LIZ(this.LLILLJJLI)) {
            this.LLLIIIIL = this.LLILLJJLI.creativeModel.postPageModel.captionModel.chain;
        }
    }
}
